package com.jagex;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("aab")
public final class Fullscreen {

	@ObfuscatedName("aab.e")
	public static boolean allowed = true;

	public Fullscreen() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("vz.e(Laae;I)[Laal;")
	public static FullscreenMode[] method9554(FullscreenImpl arg0) {
		int[] var1 = arg0.method14465();
		FullscreenMode[] var2 = new FullscreenMode[var1.length >> 2];
		for (int var3 = 0; var3 < var2.length; var3++) {
			FullscreenMode var4 = new FullscreenMode();
			var2[var3] = var4;
			var4.field8537 = var1[var3 << 2];
			var4.field8538 = var1[(var3 << 2) + 1];
			var4.field8539 = var1[(var3 << 2) + 2];
			var4.field8536 = var1[(var3 << 2) + 3];
		}
		return var2;
	}

	@ObfuscatedName("if.n(Laae;IIIII)Ljava/awt/Frame;")
	public static Frame method4572(FullscreenImpl arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 == 0) {
			FullscreenMode[] var5 = method9554(arg0);
			if (var5 == null) {
				return null;
			}
			boolean var6 = false;
			for (int var7 = 0; var7 < var5.length; var7++) {
				if (var5[var7].field8537 == arg1 && var5[var7].field8538 == arg2 && (arg4 == 0 || var5[var7].field8536 == arg4) && (!var6 || var5[var7].field8539 > arg3)) {
					arg3 = var5[var7].field8539;
					var6 = true;
				}
			}
			if (!var6) {
				return null;
			}
		}
		Frame var8 = new Frame("Jagex Full Screen");
		var8.setResizable(false);
		arg0.method14474(var8, arg1, arg2, arg3, arg4);
		return var8;
	}

	@ObfuscatedName("ho.m(Laae;Ljava/awt/Frame;I)V")
	public static void method4277(FullscreenImpl arg0, Frame arg1) {
		arg0.method14467();
		arg1.setVisible(false);
		arg1.dispose();
	}
}
