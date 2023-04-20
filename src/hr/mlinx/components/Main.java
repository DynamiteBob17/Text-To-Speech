package hr.mlinx.components;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import hr.mlinx.tts.TextToSpeech;
import hr.mlinx.util.Util;

/*
 * A primitive text-to-speech program; can barely understand any words being spoken :)
 * 
 * http://www.cross-plus-a.com/balabolka.htm was used to download TTS audio files and Audacity was used to 
 * extract individual phonemes from them to be used in this program;
 * the voice used was Microsoft David Desktop [English (United States)] with -5 Rate, -10 Pitch and 100 Volume.
 * 
 */

public class Main {
	
	public Main() {
		JFrame f = new JFrame("Text-To-Speech");
		f.setLayout(new BorderLayout());
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setPreferredSize(new Dimension((int) (600 * Util.SCALE), (int) (400 * Util.SCALE)));
		
		JTextArea ta = new JTextArea();
		ta.setFont(ta.getFont().deriveFont(Util.FONT_SIZE));
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		
		JScrollPane scroll = new JScrollPane(ta);
		
		TextToSpeech tts = new TextToSpeech(ta);
		JButton speakBtn = new JButton("SPEAK");
		speakBtn.setFont(speakBtn.getFont().deriveFont(Util.FONT_SIZE / 1.5f));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(scroll, BorderLayout.CENTER);
		panel.add(speakBtn, BorderLayout.SOUTH);

		speakBtn.addActionListener(l -> new Thread(() -> {
			speakBtn.setEnabled(false);
			tts.speak();
			speakBtn.setEnabled(true);
		}).start());
		
		f.add(panel);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Main::new);
	}

}