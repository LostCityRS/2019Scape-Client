package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("jg")
public class class289 {

	@ObfuscatedName("jg.e")
	public short[] field3003;

	@ObfuscatedName("jg.n")
	public int field3004;

	public class289(int arg0) {
		this.field3004 = arg0;
		this.field3003 = new short[0x1 << arg0];
	}

	@ObfuscatedName("jg.e(B)V")
	public void method5057() {
		class292.method3545(this.field3003);
	}

	@ObfuscatedName("jg.n(Ljp;B)I")
	public int method5058(class292 arg0) throws IOException {
		int var2 = 1;
		for (int var3 = this.field3004; var3 != 0; var3--) {
			var2 = (var2 << 1) + arg0.method5086(this.field3003, var2);
		}
		return var2 - (0x1 << this.field3004);
	}

	@ObfuscatedName("jg.m(Ljp;I)I")
	public int method5061(class292 arg0) throws IOException {
		int var2 = 1;
		int var3 = 0;
		for (int var4 = 0; var4 < this.field3004; var4++) {
			int var5 = arg0.method5086(this.field3003, var2);
			int var6 = var2 << 1;
			var2 = var5 + var6;
			var3 |= var5 << var4;
		}
		return var3;
	}
}
