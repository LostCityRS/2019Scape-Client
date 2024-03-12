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

	public ByteArrayPool() {
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

		for (int i = 0; i < field518.length; i++) {
			field8357[i] = new byte[arg1[i]][];
		}
	}

	@ObfuscatedName("zz.n(IZI)[B")
	public static synchronized byte[] alloc(int size, boolean arg1) {
		if ((size == 100 || size < 100 && arg1) && minCount > 0) {
			byte[] data = minPool[--minCount];
			minPool[minCount] = null;
			return data;
		} else if ((size == 5000 || size < 5000 && arg1) && midCount > 0) {
			byte[] data = midPool[--midCount];
			midPool[midCount] = null;
			return data;
		} else if ((size == 30000 || size < 30000 && arg1) && maxCount > 0) {
			byte[] data = maxPool[--maxCount];
			maxPool[maxCount] = null;
			return data;
		} else {
			if (field8357 != null) {
				for (int i = 0; i < field518.length; i++) {
					if ((field518[i] == size || size < field518[i] && arg1) && field8350[i] > 0) {
						byte[] data = field8357[i][--field8350[i]];
						field8357[i][field8350[i]] = null;
						return data;
					}
				}
			}

			if (arg1 && field518 != null) {
				for (int i = 0; i < field518.length; i++) {
					if (size <= field518[i] && field8350[i] < field8357[i].length) {
						return new byte[field518[i]];
					}
				}
			}

			return new byte[size];
		}
	}

	@ObfuscatedName("zz.m(II)[B")
	public static synchronized byte[] alloc(int size) {
		return alloc(size, false);
	}

	@ObfuscatedName("zz.k([BB)V")
	public static synchronized void release(byte[] src) {
		if (src.length == 100 && minCount < 1000) {
			minPool[++minCount - 1] = src;
		} else if (src.length == 5000 && midCount < 250) {
			midPool[++midCount - 1] = src;
		} else if (src.length == 30000 && maxCount < 50) {
			maxPool[++maxCount - 1] = src;
		} else if (field8357 != null) {
			for (int i = 0; i < field518.length; i++) {
				if (field518[i] == src.length && field8350[i] < field8357[i].length) {
					field8357[i][field8350[i]++] = src;
					return;
				}
			}
		}
	}
}
