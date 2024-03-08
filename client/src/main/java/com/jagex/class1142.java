package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqq")
public class class1142 extends class934 {

	@ObfuscatedName("aqq.h")
	public byte[] field12154;

	public class1142() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@ObfuscatedName("aqq.ac(III)[B")
	public byte[] method19221(int arg0, int arg1, int arg2) {
		this.field12154 = new byte[arg0 * arg1 * arg2 * 2];
		this.method6134(arg0, arg1, arg2);
		return this.field12154;
	}

	@ObfuscatedName("aqq.j(IB)V")
	public void method16813(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		int var4 = arg1 & 0xFF;
		int var10001 = var3;
		int var5 = var3 + 1;
		this.field12154[var10001] = (byte) (var4 * 3 >> 5);
		this.field12154[var5] = (byte) (var4 * 3 >> 5);
	}
}
