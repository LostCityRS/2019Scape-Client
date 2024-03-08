package com.jagex;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.BufferedImage;

@ObfuscatedName("si")
public class class508 {

	@ObfuscatedName("si.e")
	public Robot field6625 = new Robot();

	public class508() throws Exception {
	}

	public void movemouse(int arg0, int arg1) {
		this.field6625.mouseMove(arg0, arg1);
	}

	public void setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
		if (arg1 == null) {
			arg0.setCursor(null);
		} else {
			BufferedImage var6 = new BufferedImage(arg2, arg3, 2);
			var6.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
			arg0.setCursor(arg0.getToolkit().createCustomCursor(var6, arg4, null));
		}
	}
}
