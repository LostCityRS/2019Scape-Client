package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqr")
public class class1140 extends class933 {

	@ObfuscatedName("aqr.s")
	public byte[] field12152;

	public class1140() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@ObfuscatedName("aqr.ae(III)[B")
	public byte[] method19216(int arg0, int arg1, int arg2) {
		this.field12152 = new byte[arg0 * arg1 * arg2 * 2];
		this.method6134(arg0, arg1, arg2);
		return this.field12152;
	}

	@ObfuscatedName("aqr.j(IB)V")
	public void method16809(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		int var10001 = var3;
		int var5 = var3 + 1;
		this.field12152[var10001] = var4;
		this.field12152[var5] = var4;
	}
}
