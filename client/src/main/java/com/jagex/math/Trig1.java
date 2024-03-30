package com.jagex.math;

import deob.ObfuscatedName;

@ObfuscatedName("ok")
public class Trig1 {

	@ObfuscatedName("ok.y")
	public static final int[] sin = new int[16384];

	@ObfuscatedName("ok.q")
	public static final int[] cos = new int[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int i = 0; i < 16384; i++) {
			sin[i] = (int) (Math.sin((double) i * var0) * 16384.0D);
			cos[i] = (int) (Math.cos((double) i * var0) * 16384.0D);
		}
	}

	public Trig1() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ok.e(I)F")
	public static float radians(int arg0) {
		int var1 = arg0 & 0x3FFF;
		return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("ok.n(II)I")
	public static int atan2(int arg0, int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("ok.m(I)I")
	public static int sin(int arg0) {
		return sin[arg0 & 0x3FFF];
	}

	@ObfuscatedName("ok.k(I)I")
	public static int cos(int arg0) {
		return cos[arg0 & 0x3FFF];
	}
}
