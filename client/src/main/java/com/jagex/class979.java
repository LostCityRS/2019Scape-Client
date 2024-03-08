package com.jagex;

import deob.ObfuscatedName;

import java.util.BitSet;

@ObfuscatedName("akr")
public class class979 extends Node {

	@ObfuscatedName("akr.k")
	public boolean field11397;

	@ObfuscatedName("akr.f")
	public boolean field11390 = true;

	@ObfuscatedName("akr.w")
	public class308[] field11392;

	@ObfuscatedName("akr.l")
	public int field11393 = 0;

	@ObfuscatedName("akr.u")
	public int[] field11394;

	@ObfuscatedName("akr.z")
	public long field11395;

	@ObfuscatedName("akr.p")
	public String field11396 = null;

	@ObfuscatedName("akr.d")
	public byte field11391;

	@ObfuscatedName("akr.c")
	public byte field11398;

	static {
		new BitSet(65536);
	}

	@ObfuscatedName("akr.e(IB)V")
	public void method17738(int arg0) {
		if (this.field11392 == null) {
			this.field11392 = new class308[arg0];
		} else {
			System.arraycopy(this.field11392, 0, this.field11392 = new class308[arg0], 0, this.field11393);
		}
	}

	public class979(Packet arg0) {
		this.method17737(arg0);
	}

	@ObfuscatedName("akr.n(I)[I")
	public int[] method17733() {
		if (this.field11394 == null) {
			String[] var1 = new String[this.field11393];
			this.field11394 = new int[this.field11393];
			int var2 = 0;
			while (var2 < this.field11393) {
				var1[var2] = this.field11392[var2].field3087;
				this.field11394[var2] = var2++;
			}
			class664.method4054(var1, this.field11394);
		}
		return this.field11394;
	}

	@ObfuscatedName("akr.m(Lkb;I)V")
	public void method17734(class308 arg0) {
		if (this.field11392 == null || this.field11393 >= this.field11392.length) {
			this.method17738(this.field11393 + 5);
		}
		this.field11392[++this.field11393 - 1] = arg0;
		this.field11394 = null;
	}

	@ObfuscatedName("akr.k(II)V")
	public void method17735(int arg0) {
		this.field11393--;
		if (this.field11393 == 0) {
			this.field11392 = null;
		} else {
			System.arraycopy(this.field11392, arg0 + 1, this.field11392, arg0, this.field11393 - arg0);
		}
		this.field11394 = null;
	}

	@ObfuscatedName("akr.f(Ljava/lang/String;B)I")
	public int method17736(String arg0) {
		for (int var2 = 0; var2 < this.field11393; var2++) {
			if (this.field11392[var2].field3087.equalsIgnoreCase(arg0)) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("akr.w(Lalw;I)V")
	public void method17737(Packet arg0) {
		int var2 = arg0.g1();
		if ((var2 & 0x1) != 0) {
			this.field11397 = true;
		}
		if ((var2 & 0x2) != 0) {
			this.field11390 = true;
		}
		int var3 = 2;
		if ((var2 & 0x4) != 0) {
			var3 = arg0.g1();
		}
		this.field6760 = arg0.g8();
		this.field11395 = arg0.g8();
		this.field11396 = arg0.gjstr();
		arg0.g1();
		this.field11398 = arg0.g1b();
		this.field11391 = arg0.g1b();
		this.field11393 = arg0.g2();
		if (this.field11393 <= 0) {
			return;
		}
		this.field11392 = new class308[this.field11393];
		for (int var4 = 0; var4 < this.field11393; var4++) {
			class308 var5 = new class308();
			if (this.field11397) {
				arg0.g8();
			}
			if (this.field11390) {
				var5.field3087 = arg0.gjstr();
			}
			var5.field3089 = arg0.g1b();
			var5.field3088 = arg0.g2();
			if (var3 >= 3) {
				arg0.g1();
			}
			this.field11392[var4] = var5;
		}
	}
}
