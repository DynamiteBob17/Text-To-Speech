package hr.mlinx.tts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTextArea;

import hr.mlinx.util.PhonemeFactory;

public class TextToSpeech {
	
	private static final List<String> PUNCTUATION_MARKS = Arrays.asList("." , ",", "!", "?");
	
	private JTextArea ta;
	private List<String> speech;
	private Map<String, Map<String, String[]>> dictionary;
	
	private Map<String, AudioInputStream[]> vowels;
	private Map<String, AudioInputStream[]> consonants;
	
	public TextToSpeech(JTextArea ta) {
		super();
		
		this.ta = ta;
		speech = new LinkedList<>();
		dictionary = new LinkedHashMap<>();
		fillDictionary();
		
		vowels = new LinkedHashMap<>();
		consonants = new LinkedHashMap<>();
		PhonemeFactory.fillPhonemes(vowels, consonants);
	}
	
	public void speak() {
		analyseText(ta.getText());
		
		List<AudioInputStream> as = new LinkedList<>();
		String lastPhoneme = "";
		
		if (!speech.isEmpty()) {
			for (String s : speech) {
				try {
					if (s.contains("0") || s.contains("1") || s.contains("2")) {
						if (as.isEmpty()) {
							as.add(vowels.get(s)[0]);
							vowels.get(s)[0] = AudioSystem.getAudioInputStream(TextToSpeech.class.getResource("/" + s + "_START.wav"));
						} else {
							as.add(vowels.get(s)[1]);
							vowels.get(s)[1] = AudioSystem.getAudioInputStream(TextToSpeech.class.getResource("/" + s + "_MIDDLE.wav"));
						}
						
						lastPhoneme = s;
					} else if (s.equals(" ")) {
						speakWord(as, lastPhoneme);
					} else if (PUNCTUATION_MARKS.contains(s)) {
						speakWord(as, lastPhoneme);
						
						switch (s) {
						case ".":
							Thread.sleep(800);
							break;
						case ",":
							Thread.sleep(400);
							break;
						case "!":
							Thread.sleep(600);
							break;
						case "?":
							Thread.sleep(1000);
							break;
						default:
							break;
						}
					} else {
						if (as.isEmpty()) {
							as.add(consonants.get(s)[0]);
							consonants.get(s)[0] = AudioSystem.getAudioInputStream(TextToSpeech.class.getResource("/" + s + "_START.wav"));
						} else {
							as.add(consonants.get(s)[1]);
							consonants.get(s)[1] = AudioSystem.getAudioInputStream(TextToSpeech.class.getResource("/" + s + "_MIDDLE.wav"));
						}
						
						lastPhoneme = s;
					}
				} catch (InterruptedException | UnsupportedAudioFileException | IOException e) {
					e.printStackTrace();
				}
			}
			
			speech.clear();
		}
	}
	
	private void speakWord(List<AudioInputStream> as, String lastPhoneme) {
		if (!as.isEmpty()) {
			try {
				if (as.size() > 1) {
					if (lastPhoneme.contains("0") || lastPhoneme.contains("1") || lastPhoneme.contains("2")) {
						as.set(as.size() - 1, vowels.get(lastPhoneme)[2]);
						vowels.get(lastPhoneme)[2] = AudioSystem.getAudioInputStream(TextToSpeech.class.getResource("/" + lastPhoneme + "_END.wav"));
					} else {
						as.set(as.size() - 1, consonants.get(lastPhoneme)[2]);
						consonants.get(lastPhoneme)[2] = AudioSystem.getAudioInputStream(TextToSpeech.class.getResource("/" + lastPhoneme + "_END.wav"));
					}
				}
			} catch (UnsupportedAudioFileException | IOException e) {
				e.printStackTrace();
			}
			
			AudioInputStream append = as.get(0);
			
			for (int i = 1; i < as.size(); ++i) {
				append = new AudioInputStream(
						new SequenceInputStream(append, as.get(i)),
						append.getFormat(),
						append.getFrameLength() + as.get(i).getFrameLength());
			}
			
			try {
				Clip clip;
				clip = AudioSystem.getClip();
				clip.open(append);
				clip.start();
				
				while (clip.getMicrosecondPosition() < clip.getMicrosecondLength()) {
					// wait to finish
				}
			} catch (LineUnavailableException | IOException e) {
				e.printStackTrace();
			}
			
			as.forEach(stream -> {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			as.clear();
		}
	}
	
	private void analyseText(String text) {
		text = text.trim();
		if (text.isEmpty())
			return;
		
		text = text.replaceAll("\\s+", " ");
		
		String[] words = text.split(" ");
		String firstLetter;
		String[] phonemes;
		String[] puncs;
		String lastPunc, temp;
		for (String word : words) {
			temp = word;
			word = word.replaceAll("[^a-zA-Z'-]", "");
			lastPunc = "";
			puncs = temp.split(word);
			
			if (puncs.length > 0) {
				if (puncs[0].length() > 0) {
					if (PUNCTUATION_MARKS.contains("" + puncs[0].charAt(0)))
						speech.add("" + puncs[0].charAt(0));
				}
			}
			if (puncs.length > 1) {
				int idx = puncs.length - 1;
				if (puncs[idx].length() > 0) {
					if (PUNCTUATION_MARKS.contains("" + puncs[idx].charAt(puncs[idx].length() - 1)))
						lastPunc = "" + puncs[idx].charAt(puncs[idx].length() - 1);
				}
			}
			
			
			if (!word.isEmpty()) {
				firstLetter = "" + word.charAt(0);
				
				phonemes = dictionary.get(firstLetter.toUpperCase()).get(word.toUpperCase());
				
				if (phonemes != null) {
					for (String p : phonemes) {
						speech.add(p);
					}
				}
				
			}
			
			if (!lastPunc.isEmpty())
				speech.add(lastPunc);
			else
				speech.add(" ");
		}
	}
	
	private void fillDictionary() {
		try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("dictionary.txt");
				BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			String line;
			String firstLetter;
			String[] split;
			Map<String, String[]> m;
			
			while ((line = br.readLine()) != null) {
				if (line.startsWith(";;;"))
					continue;
				
				firstLetter = "" + line.charAt(0);
				split = line.split(" ");
				
				if (dictionary.containsKey(firstLetter))
					m = dictionary.get(firstLetter);
				else
					m = new LinkedHashMap<>();
				
				m.put(split[0], Arrays.copyOfRange(split, 2, split.length));
				dictionary.put(firstLetter, m);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
