package hr.mlinx.util;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Util {
	
	public static final Dimension RES = Toolkit.getDefaultToolkit().getScreenSize();
	public static final double SCALE = RES.getWidth() / 1920.0;
	
	public static final float FONT_SIZE = 30f * (float) SCALE;
	
}
