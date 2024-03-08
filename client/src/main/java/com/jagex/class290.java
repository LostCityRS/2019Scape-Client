package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("jx")
public class class290 {

	@ObfuscatedName("jx.f")
	public static int[] field3010 = new int[512];

	static {
		byte var0 = 9;
		for (int var1 = var0 - 1; var1 >= 0; var1--) {
			int var2 = 0x1 << var0 - var1 - 1;
			int var3 = 0x1 << var0 - var1;
			for (int var4 = var2; var4 < var3; var4++) {
				field3010[var4] = (var3 - var4 << 6 >>> var0 - var1 - 1) + (var1 << 6);
			}
		}
	}
}
