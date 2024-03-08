package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("cn")
public class class91 {

	@ObfuscatedName("cn.e")
	public static final float[] field1160 = new float[16384];

	@ObfuscatedName("cn.n")
	public static final float[] field1159 = new float[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			field1160[var2] = (float) Math.sin((double) var2 * var0);
			field1159[var2] = (float) Math.cos((double) var2 * var0);
		}
	}

	public class91() throws Throwable {
		throw new Error();
	}
}
