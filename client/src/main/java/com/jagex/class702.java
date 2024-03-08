package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zz")
public class class702 {

	@ObfuscatedName("zz.e")
	public static int field8355 = 0;

	@ObfuscatedName("zz.n")
	public static int field8351 = 0;

	@ObfuscatedName("zz.m")
	public static int field8352 = 0;

	@ObfuscatedName("zz.k")
	public static byte[][] field8353 = new byte[1000][];

	@ObfuscatedName("zz.f")
	public static byte[][] field8354 = new byte[250][];

	@ObfuscatedName("zz.w")
	public static byte[][] field8356 = new byte[50][];

	public class702() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("iv.e([I[II)V")
	public static void method4398(int[] arg0, int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Statics.field518 = null;
			Statics.field8350 = null;
			Statics.field8357 = null;
			return;
		}
		Statics.field518 = arg0;
		Statics.field8350 = new int[arg0.length];
		Statics.field8357 = new byte[arg0.length][][];
		for (int var2 = 0; var2 < Statics.field518.length; var2++) {
			Statics.field8357[var2] = new byte[arg1[var2]][];
		}
	}

	@ObfuscatedName("zz.m(II)[B")
	public static synchronized byte[] method14027(int arg0) {
		return Statics.method14028(arg0, false);
	}

	@ObfuscatedName("zz.k([BB)V")
	public static synchronized void method14031(byte[] arg0) {
		if (arg0.length == 100 && field8355 < 1000) {
			field8353[++field8355 - 1] = arg0;
		} else if (arg0.length == 5000 && field8351 < 250) {
			field8354[++field8351 - 1] = arg0;
		} else if (arg0.length == 30000 && field8352 < 50) {
			field8356[++field8352 - 1] = arg0;
		} else if (Statics.field8357 != null) {
			for (int var1 = 0; var1 < Statics.field518.length; var1++) {
				if (Statics.field518[var1] == arg0.length && Statics.field8350[var1] < Statics.field8357[var1].length) {
					Statics.field8357[var1][Statics.field8350[var1]++] = arg0;
					return;
				}
			}
		}
	}
}
