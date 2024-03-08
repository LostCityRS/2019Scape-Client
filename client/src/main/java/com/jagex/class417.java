package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ok")
public class class417 {

	@ObfuscatedName("ok.y")
	public static final int[] field4270 = new int[16384];

	@ObfuscatedName("ok.q")
	public static final int[] field4272 = new int[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			field4270[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
			field4272[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
		}
	}

	public class417() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ok.e(I)F")
	public static float method6277(int arg0) {
		int var1 = arg0 & 0x3FFF;
		return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("ok.n(II)I")
	public static int method6280(int arg0, int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("ok.m(I)I")
	public static int method6276(int arg0) {
		return field4270[arg0 & 0x3FFF];
	}

	@ObfuscatedName("ok.k(I)I")
	public static int method6279(int arg0) {
		return field4272[arg0 & 0x3FFF];
	}
}
