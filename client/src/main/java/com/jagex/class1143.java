package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqs")
public class class1143 extends class934 {

	@ObfuscatedName("aqs.h")
	public byte[] field12155;

	public class1143() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@ObfuscatedName("aqs.ac(III)[B")
	public byte[] method19228(int arg0, int arg1, int arg2) {
		this.field12155 = new byte[arg0 * arg1 * arg2 * 2];
		this.method6134(arg0, arg1, arg2);
		return this.field12155;
	}

	@ObfuscatedName("aqs.j(IB)V")
	public void method16813(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		int var4 = arg1 & 0xFF;
		int var10001 = var3;
		int var5 = var3 + 1;
		this.field12155[var10001] = -1;
		this.field12155[var5] = (byte) (var4 * 3 >> 5);
	}
}
