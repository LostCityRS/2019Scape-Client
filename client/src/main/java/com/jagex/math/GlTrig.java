package com.jagex.math;

import deob.ObfuscatedName;

@ObfuscatedName("cn")
public class GlTrig {

	@ObfuscatedName("cn.e")
	public static final float[] sin = new float[16384];

	@ObfuscatedName("cn.n")
	public static final float[] cos = new float[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			sin[var2] = (float) Math.sin((double) var2 * var0);
			cos[var2] = (float) Math.cos((double) var2 * var0);
		}
	}

	public GlTrig() throws Throwable {
		throw new Error();
	}
}
