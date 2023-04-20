package hr.mlinx.tts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTextArea;

public class TextToSpeech {
	
	private static final List<String> PUNCTUATION_MARKS = Arrays.asList("." , ",", "!", "?");
	
	private final JTextArea ta;
	private final List<String> speech;
	private final Map<String, Map<String, String[]>> dictionary;
	
	public TextToSpeech(JTextArea ta) {
		super();
		
		this.ta = ta;
		speech = new LinkedList<>();
		dictionary = new LinkedHashMap<>();
		fillDictionary();
	}
	
	public void speak() {
		analyseText(ta.getText());
		
		List<AudioInputStream> as = new LinkedList<>();
		String lastPhoneme = "";
		
		if (!speech.isEmpty()) {
			for (String s : speech) {
				try {
					if (s.contains("0") || s.contains("1") || s.contains("2")) {
						appendPhoneme(as, s);
						lastPhoneme = s;
					} else if (s.equals(" ")) {
						speakWord(as, lastPhoneme);
					} else if (PUNCTUATION_MARKS.contains(s)) {
						speakWord(as, lastPhoneme);

						switch (s) {
							case "." -> Thread.sleep(800);
							case "," -> Thread.sleep(400);
							case "!" -> Thread.sleep(600);
							case "?" -> Thread.sleep(1000);
							default -> {
							}
						}
					} else {
						appendPhoneme(as, s);
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
					as.get(as.size() - 1).close();
					as.set(as.size() - 1, getAudioStream(lastPhoneme, "END"));
				}
			} catch (UnsupportedAudioFileException | IOException e) {
				e.printStackTrace();
			}
			
			AudioInputStream append = as.get(0);
			
			for (int i = 1; i < as.size(); ++i) {
				append = new AudioInputStream(
						new SequenceInputStream(append, as.get(i)),
						append.getFormat(),
						append.getFrameLength() + as.get(i).getFrameLength()
				);
			}
			
			try {
				Clip clip;
				clip = AudioSystem.getClip();
				clip.open(append);
				clip.start();
				
				while (clip.getMicrosecondPosition() < clip.getMicrosecondLength()) {
					// wait to finish
				}
			} catch (LineUnavailableException | IOException | IllegalArgumentException e) {
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
					speech.addAll(Arrays.asList(phonemes));
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
				BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(is)))) {
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

	private void appendPhoneme(List<AudioInputStream> as, String phoneme)
			throws UnsupportedAudioFileException, IOException {
		if (as.isEmpty()) {
			as.add(getAudioStream(phoneme, "START"));
		} else {
			as.add(getAudioStream(phoneme, "MIDDLE"));
		}
	}

	public static AudioInputStream getAudioStream(String phoneme, String position)
			throws UnsupportedAudioFileException, IOException {
		return AudioSystem.getAudioInputStream(Objects.requireNonNull(
				TextToSpeech.class.getResource("/" + phoneme + "_" + position + ".wav")
		));
	}
	
}
