package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("zz")
public class ByteArrayPool {

	@ObfuscatedName("zz.e")
	public static int minCount = 0;

	@ObfuscatedName("zz.n")
	public static int midCount = 0;

	@ObfuscatedName("zz.m")
	public static int maxCount = 0;

	@ObfuscatedName("zz.k")
	public static byte[][] minPool = new byte[1000][];

	@ObfuscatedName("zz.f")
	public static byte[][] midPool = new byte[250][];

	@ObfuscatedName("zz.w")
	public static byte[][] maxPool = new byte[50][];

	@ObfuscatedName("u.l")
	public static int[] field518;

	@ObfuscatedName("zz.u")
	public static int[] field8350;

	@ObfuscatedName("zz.z")
	public static byte[][][] field8357;

	public ByteArrayPool() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("iv.e([I[II)V")
	public static void method4398(int[] arg0, int[] arg1) {
		if (arg0 == null || arg1 == null) {
			field518 = null;
			field8350 = null;
			field8357 = null;
			return;
		}
		field518 = arg0;
		field8350 = new int[arg0.length];
		field8357 = new byte[arg0.length][][];
		for (int var2 = 0; var2 < field518.length; var2++) {
			field8357[var2] = new byte[arg1[var2]][];
		}
	}

	@ObfuscatedName("zz.n(IZI)[B")
	public static synchronized byte[] alloc(int arg0, boolean arg1) {
		if ((arg0 == 100 || arg0 < 100 && arg1) && minCount > 0) {
			byte[] var2 = minPool[--minCount];
			minPool[minCount] = null;
			return var2;
		} else if ((arg0 == 5000 || arg0 < 5000 && arg1) && midCount > 0) {
			byte[] var3 = midPool[--midCount];
			midPool[midCount] = null;
			return var3;
		} else if ((arg0 == 30000 || arg0 < 30000 && arg1) && maxCount > 0) {
			byte[] var4 = maxPool[--maxCount];
			maxPool[maxCount] = null;
			return var4;
		} else {
			if (field8357 != null) {
				for (int var5 = 0; var5 < field518.length; var5++) {
					if ((field518[var5] == arg0 || arg0 < field518[var5] && arg1) && field8350[var5] > 0) {
						byte[] var6 = field8357[var5][--field8350[var5]];
						field8357[var5][field8350[var5]] = null;
						return var6;
					}
				}
			}
			if (arg1 && field518 != null) {
				for (int var7 = 0; var7 < field518.length; var7++) {
					if (arg0 <= field518[var7] && field8350[var7] < field8357[var7].length) {
						return new byte[field518[var7]];
					}
				}
			}
			return new byte[arg0];
		}
	}

	@ObfuscatedName("zz.m(II)[B")
	public static synchronized byte[] alloc(int arg0) {
		return alloc(arg0, false);
	}

	@ObfuscatedName("zz.k([BB)V")
	public static synchronized void release(byte[] arg0) {
		if (arg0.length == 100 && minCount < 1000) {
			minPool[++minCount - 1] = arg0;
		} else if (arg0.length == 5000 && midCount < 250) {
			midPool[++midCount - 1] = arg0;
		} else if (arg0.length == 30000 && maxCount < 50) {
			maxPool[++maxCount - 1] = arg0;
		} else if (field8357 != null) {
			for (int var1 = 0; var1 < field518.length; var1++) {
				if (field518[var1] == arg0.length && field8350[var1] < field8357[var1].length) {
					field8357[var1][field8350[var1]++] = arg0;
					return;
				}
			}
		}
	}
}
