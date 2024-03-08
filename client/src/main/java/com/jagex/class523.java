package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("sb")
public class class523 {

	@ObfuscatedName("sb.e")
	public static byte[] field6713 = new byte[2048];

	@ObfuscatedName("sb.m")
	public class520[] field6712;

	@ObfuscatedName("sb.k")
	public class291[] field6711;

	static {
		byte var0 = 22;
		int var1 = 2;
		field6713[0] = 0;
		field6713[1] = 1;
		for (int var2 = 2; var2 < var0; var2++) {
			int var3 = 0x1 << (var2 >> 1) - 1;
			int var4 = 0;
			while (var4 < var3) {
				field6713[var1] = (byte) var2;
				var4++;
				var1++;
			}
		}
	}

	public class523() {
		class528.method9417();
		this.field6712 = new class520[4096];
		new class290();
		this.field6711 = new class291[4];
		new class291(4);
		new class954(this);
		new class954(this);
		new class525(this);
		for (int var1 = 0; var1 < 4096; var1++) {
			this.field6712[var1] = new class520(this);
		}
		for (int var2 = 0; var2 < 4; var2++) {
			this.field6711[var2] = new class291(6);
		}
	}
}
