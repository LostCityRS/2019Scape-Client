package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("asf")
public final class class1187 extends class993 {

	@ObfuscatedName("asf.c")
	public static class1187[] field12388 = new class1187[0];

	@ObfuscatedName("asf.o")
	public int field12385;

	@ObfuscatedName("asf.s")
	public int field12386;

	@ObfuscatedName("asf.y")
	public long field12389;

	@ObfuscatedName("asf.q")
	public int field12387;

	@ObfuscatedName("asf.x")
	public int field12383;

	@ObfuscatedName("asf.e(I)I")
	public int method17848() {
		return this.field12385;
	}

	@ObfuscatedName("asf.n(I)I")
	public int method17831() {
		return this.field12386;
	}

	@ObfuscatedName("asf.m(B)I")
	public int method17832() {
		return this.field12387;
	}

	@ObfuscatedName("asf.f(B)J")
	public long method17834() {
		return this.field12389;
	}

	@ObfuscatedName("asf.k(I)I")
	public int method17833() {
		return this.field12383;
	}

	@ObfuscatedName("asf.l(B)V")
	public void method17835() {
		class1187[] var1 = field12388;
		synchronized (field12388) {
			if (Statics.field12384 < Statics.field7883 - 1) {
				field12388[++Statics.field12384 - 1] = this;
			}
		}
	}
}
