package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("th")
public class class542 {

	// $FF: synthetic field
	public final class932 this$0;

	@ObfuscatedName("th.e")
	public class544 field6863;

	@ObfuscatedName("th.n")
	public byte[] field6857;

	@ObfuscatedName("th.m")
	public byte[] field6858;

	@ObfuscatedName("th.k")
	public int field6865;

	@ObfuscatedName("th.f")
	public int field6856;

	@ObfuscatedName("th.w")
	public int field6860;

	@ObfuscatedName("th.l")
	public int field6861;

	@ObfuscatedName("th.u")
	public final float field6862;

	@ObfuscatedName("th.z")
	public final int field6859;

	@ObfuscatedName("th.p")
	public final int field6864;

	public class542(class932 arg0, class544 arg1, int arg2, float arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		this.this$0 = arg0;
		this.field6863 = arg1;
		this.field6857 = new byte[arg2];
		this.field6858 = new byte[arg4 / 8];
		this.field6860 = this.field6857.length;
		this.field6862 = arg3;
		this.field6859 = arg4;
		this.field6864 = arg5;
		this.field6856 = 0;
		this.field6865 = 0;
		this.field6861 = 0;
	}

	@ObfuscatedName("th.e([BIIB)V")
	public void method8626(byte[] arg0, int arg1, int arg2) {
		int var4 = arg1;
		while (var4 < arg1 + arg2) {
			this.field6857[this.field6856] = arg0[var4];
			this.field6857[this.field6856 + 1] = arg0[var4 + 1];
			var4 += 2;
			this.field6856 += 2;
			this.field6856 %= this.field6857.length;
			this.field6860 -= 2;
		}
	}

	@ObfuscatedName("th.n(I)I")
	public int method8628() {
		return this.field6860;
	}
}
