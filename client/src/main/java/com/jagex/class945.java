package com.jagex;

import deob.ObfuscatedName;
import jaclib.nanotime.QueryPerformanceCounter;

@ObfuscatedName("ajp")
public class class945 extends class511 {

	@ObfuscatedName("ajp.e")
	public long field11124 = 0L;

	@ObfuscatedName("ajp.n")
	public long field11126 = 0L;

	@ObfuscatedName("ajp.m")
	public long field11122 = 0L;

	@ObfuscatedName("ajp.k")
	public long[] field11123 = new long[10];

	@ObfuscatedName("ajp.f")
	public int field11125 = 0;

	@ObfuscatedName("ajp.w")
	public int field11121 = 1;

	public class945() {
		this.field11126 = this.field11124 = QueryPerformanceCounter.nanoTime();
		if (this.field11124 == 0L) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ajp.m(B)V")
	public void method8156() {
		this.field11122 = 0L;
		if (this.field11126 > this.field11124) {
			this.field11124 += this.field11126 - this.field11124;
		}
	}

	@ObfuscatedName("ajp.k(I)J")
	public long method8159() {
		this.field11124 += this.method17365();
		return this.field11126 > this.field11124 ? (this.field11126 - this.field11124) / 1000000L : 0L;
	}

	@ObfuscatedName("ajp.f(J)I")
	public int method8160(long arg0) {
		if (this.field11126 > this.field11124) {
			this.field11122 += this.field11126 - this.field11124;
			this.field11124 += this.field11126 - this.field11124;
			this.field11126 += arg0;
			return 1;
		}
		int var3 = 0;
		do {
			var3++;
			this.field11126 += arg0;
		} while (var3 < 10 && this.field11126 < this.field11124);
		if (this.field11126 < this.field11124) {
			this.field11126 = this.field11124;
		}
		return var3;
	}

	@ObfuscatedName("ajp.w(I)J")
	public long method8173() {
		return this.field11124;
	}

	@ObfuscatedName("ajp.h(I)J")
	public long method17365() {
		long var1 = QueryPerformanceCounter.nanoTime();
		long var3 = var1 - this.field11122;
		this.field11122 = var1;
		if (var3 > -5000000000L && var3 < 5000000000L) {
			this.field11123[this.field11125] = var3;
			this.field11125 = (this.field11125 + 1) % 10;
			if (this.field11121 < 1) {
				this.field11121++;
			}
		}
		long var5 = 0L;
		for (int var7 = 1; var7 <= this.field11121; var7++) {
			var5 += this.field11123[(this.field11125 - var7 + 10) % 10];
		}
		return var5 / (long) this.field11121;
	}
}
