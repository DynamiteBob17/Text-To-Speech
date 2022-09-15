package hr.mlinx.util;

import java.io.IOException;
import java.util.Map;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PhonemeFactory {
	
	public static void fillPhonemes(Map<String, AudioInputStream[]> vowels, Map<String, AudioInputStream[]> consonants) {
		try {
			AudioInputStream as0, as1, as2;
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AA0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AA0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AA0_END.wav"));
			vowels.put("AA0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AA1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AA1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AA1_END.wav"));
			vowels.put("AA1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AA2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AA2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AA2_END.wav"));
			vowels.put("AA2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AE0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AE0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AE0_END.wav"));
			vowels.put("AE0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AE1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AE1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AE1_END.wav"));
			vowels.put("AE1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AE2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AE2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AE2_END.wav"));
			vowels.put("AE2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AH0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AH0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AH0_END.wav"));
			vowels.put("AH0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AH1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AH1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AH1_END.wav"));
			vowels.put("AH1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AH2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AH2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AH2_END.wav"));
			vowels.put("AH2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AO0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AO0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AO0_END.wav"));
			vowels.put("AO0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AO1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AO1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AO1_END.wav"));
			vowels.put("AO1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AO2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AO2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AO2_END.wav"));
			vowels.put("AO2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AW0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AW0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AW0_END.wav"));
			vowels.put("AW0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AW1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AW1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AW1_END.wav"));
			vowels.put("AW1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AW2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AW2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AW2_END.wav"));
			vowels.put("AW2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AY0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AY0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AY0_END.wav"));
			vowels.put("AY0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AY1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AY1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AY1_END.wav"));
			vowels.put("AY1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AY2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AY2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/AY2_END.wav"));
			vowels.put("AY2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EH0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EH0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EH0_END.wav"));
			vowels.put("EH0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EH1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EH1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EH1_END.wav"));
			vowels.put("EH1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EH2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EH2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EH2_END.wav"));
			vowels.put("EH2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ER0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ER0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ER0_END.wav"));
			vowels.put("ER0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ER1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ER1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ER1_END.wav"));
			vowels.put("ER1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ER2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ER2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ER2_END.wav"));
			vowels.put("ER2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EY0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EY0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EY0_END.wav"));
			vowels.put("EY0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EY1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EY1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EY1_END.wav"));
			vowels.put("EY1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EY2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EY2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/EY2_END.wav"));
			vowels.put("EY2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IH0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IH0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IH0_END.wav"));
			vowels.put("IH0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IH1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IH1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IH1_END.wav"));
			vowels.put("IH1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IH2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IH2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IH2_END.wav"));
			vowels.put("IH2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IY0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IY0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IY0_END.wav"));
			vowels.put("IY0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IY1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IY1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IY1_END.wav"));
			vowels.put("IY1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IY2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IY2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/IY2_END.wav"));
			vowels.put("IY2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OW0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OW0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OW0_END.wav"));
			vowels.put("OW0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OW1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OW1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OW1_END.wav"));
			vowels.put("OW1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OW2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OW2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OW2_END.wav"));
			vowels.put("OW2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OY0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OY0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OY0_END.wav"));
			vowels.put("OY0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OY1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OY1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OY1_END.wav"));
			vowels.put("OY1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OY2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OY2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/OY2_END.wav"));
			vowels.put("OY2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UH0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UH0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UH0_END.wav"));
			vowels.put("UH0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UH1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UH1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UH1_END.wav"));
			vowels.put("UH1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UH2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UH2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UH2_END.wav"));
			vowels.put("UH2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UW0_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UW0_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UW0_END.wav"));
			vowels.put("UW0", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UW1_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UW1_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UW1_END.wav"));
			vowels.put("UW1", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UW2_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UW2_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/UW2_END.wav"));
			vowels.put("UW2", new AudioInputStream[] {
				as0, as1, as2
			});
			
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/B_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/B_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/B_END.wav"));
			consonants.put("B", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/CH_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/CH_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/CH_END.wav"));
			consonants.put("CH", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/D_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/D_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/D_END.wav"));
			consonants.put("D", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/DH_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/DH_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/DH_END.wav"));
			consonants.put("DH", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/F_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/F_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/F_END.wav"));
			consonants.put("F", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/G_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/G_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/G_END.wav"));
			consonants.put("G", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/HH_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/HH_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/HH_END.wav"));
			consonants.put("HH", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/JH_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/JH_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/JH_END.wav"));
			consonants.put("JH", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/K_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/K_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/K_END.wav"));
			consonants.put("K", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/L_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/L_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/L_END.wav"));
			consonants.put("L", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/M_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/M_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/M_END.wav"));
			consonants.put("M", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/N_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/N_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/N_END.wav"));
			consonants.put("N", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/NG_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/NG_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/NG_END.wav"));
			consonants.put("NG", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/P_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/P_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/P_END.wav"));
			consonants.put("P", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/R_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/R_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/R_END.wav"));
			consonants.put("R", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/S_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/S_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/S_END.wav"));
			consonants.put("S", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/SH_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/SH_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/SH_END.wav"));
			consonants.put("SH", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/T_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/T_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/T_END.wav"));
			consonants.put("T", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/TH_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/TH_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/TH_END.wav"));
			consonants.put("TH", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/V_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/V_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/V_END.wav"));
			consonants.put("V", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/W_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/W_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/W_END.wav"));
			consonants.put("W", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/Y_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/Y_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/Y_END.wav"));
			consonants.put("Y", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/Z_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/Z_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/Z_END.wav"));
			consonants.put("Z", new AudioInputStream[] {
					as0, as1, as2
			});
			as0 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ZH_START.wav"));
			as1 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ZH_MIDDLE.wav"));
			as2 = AudioSystem.getAudioInputStream(PhonemeFactory.class.getResource("/ZH_END.wav"));
			consonants.put("ZH", new AudioInputStream[] {
					as0, as1, as2
			});
			
		} catch (IOException | UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
	}
	
}
