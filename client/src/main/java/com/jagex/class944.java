package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aja")
public class class944 extends class511 {

	@ObfuscatedName("aja.e")
	public long field11119 = 0L;

	@ObfuscatedName("aja.n")
	public long field11115 = 0L;

	@ObfuscatedName("aja.m")
	public long field11116 = 0L;

	@ObfuscatedName("aja.k")
	public long[] field11118 = new long[10];

	@ObfuscatedName("aja.f")
	public int field11120 = 0;

	@ObfuscatedName("aja.w")
	public int field11117 = 1;

	public class944() {
		this.field11119 = System.nanoTime();
		this.field11115 = System.nanoTime();
	}

	@ObfuscatedName("aja.m(B)V")
	public void method8156() {
		this.field11116 = 0L;
		if (this.field11115 > this.field11119) {
			this.field11119 += this.field11115 - this.field11119;
		}
	}

	@ObfuscatedName("aja.k(I)J")
	public long method8159() {
		this.field11119 += this.method17363();
		return this.field11115 > this.field11119 ? (this.field11115 - this.field11119) / 1000000L : 0L;
	}

	@ObfuscatedName("aja.f(J)I")
	public int method8160(long arg0) {
		if (this.field11115 > this.field11119) {
			this.field11116 += this.field11115 - this.field11119;
			this.field11119 += this.field11115 - this.field11119;
			this.field11115 += arg0;
			return 1;
		}
		int var3 = 0;
		do {
			var3++;
			this.field11115 += arg0;
		} while (var3 < 10 && this.field11115 < this.field11119);
		if (this.field11115 < this.field11119) {
			this.field11115 = this.field11119;
		}
		return var3;
	}

	@ObfuscatedName("aja.w(I)J")
	public long method8173() {
		return this.field11119;
	}

	@ObfuscatedName("aja.h(I)J")
	public long method17363() {
		long var1 = System.nanoTime();
		long var3 = var1 - this.field11116;
		this.field11116 = var1;
		if (var3 > -5000000000L && var3 < 5000000000L) {
			this.field11118[this.field11120] = var3;
			this.field11120 = (this.field11120 + 1) % 10;
			if (this.field11117 < 1) {
				this.field11117++;
			}
		}
		long var5 = 0L;
		for (int var7 = 1; var7 <= this.field11117; var7++) {
			var5 += this.field11118[(this.field11120 - var7 + 10) % 10];
		}
		return var5 / (long) this.field11117;
	}
}
