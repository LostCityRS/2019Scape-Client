package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aki")
public final class class976 extends class532 {

	@ObfuscatedName("aki.d")
	public static final class976 field11386 = new class976(0, -1);

	@ObfuscatedName("aki.c")
	public final int field11385;

	@ObfuscatedName("aki.r")
	public final int field11381;

	public class976(int arg0, int arg1) {
		this.field11385 = arg0;
		this.field11381 = arg1;
	}

	@ObfuscatedName("aki.e(B)Z")
	public final boolean method17689() {
		return (this.field11385 & 0x1) != 0;
	}

	@ObfuscatedName("aki.n(II)Z")
	public final boolean method17690(int arg0) {
		return (this.field11385 >> arg0 + 1 & 0x1) != 0;
	}

	@ObfuscatedName("aki.m(S)I")
	public final int method17691() {
		return method16667(this.field11385);
	}

	@ObfuscatedName("ahb.k(IB)I")
	public static final int method16667(int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@ObfuscatedName("aki.f(I)I")
	public final int method17710() {
		return this.field11385 >> 18 & 0x7;
	}

	@ObfuscatedName("aki.w(I)Z")
	public final boolean method17693() {
		return (this.field11385 >> 21 & 0x1) != 0;
	}

	@ObfuscatedName("aki.l(I)Z")
	public final boolean method17708() {
		return (this.field11385 >> 22 & 0x1) != 0;
	}

	@ObfuscatedName("aki.u(I)Z")
	public final boolean method17701() {
		return (this.field11385 >> 23 & 0x1) != 0;
	}
}
