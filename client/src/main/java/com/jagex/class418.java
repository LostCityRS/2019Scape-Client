package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("or")
public class class418 {

	@ObfuscatedName("or.e")
	public static final float[] field4274 = new float[16384];

	@ObfuscatedName("or.n")
	public static final float[] field4273 = new float[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			field4274[var2] = (float) Math.sin((double) var2 * var0);
			field4273[var2] = (float) Math.cos((double) var2 * var0);
		}
	}

	public class418() throws Throwable {
		throw new Error();
	}
}
