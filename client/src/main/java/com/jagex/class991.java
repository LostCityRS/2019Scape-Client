package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("akv")
public class class991 extends class532 {

	@ObfuscatedName("akv.k")
	public int field11458;

	@ObfuscatedName("akv.f")
	public int field11453;

	@ObfuscatedName("akv.w")
	public int field11454;

	@ObfuscatedName("akv.l")
	public int field11455;

	@ObfuscatedName("akv.u")
	public int field11457;

	@ObfuscatedName("akv.z")
	public int field11456;

	@ObfuscatedName("akv.p")
	public int field11459;

	@ObfuscatedName("akv.d")
	public int field11460;

	@ObfuscatedName("akv.c")
	public int field11461;

	public class991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		this.field11458 = arg0;
		this.field11453 = arg1;
		this.field11454 = arg2;
		this.field11455 = arg3;
		this.field11457 = arg4;
		this.field11456 = arg5;
		this.field11459 = arg6;
		this.field11460 = arg7;
		this.field11461 = arg8;
	}

	@ObfuscatedName("akv.e(III)Z")
	public boolean method17818(int arg0, int arg1) {
		return arg0 >= this.field11453 && arg0 <= this.field11455 && arg1 >= this.field11454 && arg1 <= this.field11457;
	}

	@ObfuscatedName("akv.n(IIII)Z")
	public boolean method17815(int arg0, int arg1, int arg2) {
		return arg0 >= this.field11458 && arg1 >= this.field11453 && arg1 <= this.field11455 && arg2 >= this.field11454 && arg2 <= this.field11457;
	}

	@ObfuscatedName("akv.m(III)Z")
	public boolean method17814(int arg0, int arg1) {
		return arg0 >= this.field11456 && arg0 <= this.field11460 && arg1 >= this.field11459 && arg1 <= this.field11461;
	}

	@ObfuscatedName("akv.k(II[II)V")
	public void method17812(int arg0, int arg1, int[] arg2) {
		arg2[0] = this.field11458;
		arg2[1] = this.field11453 - this.field11456 + arg0;
		arg2[2] = this.field11454 - this.field11459 + arg1;
	}

	@ObfuscatedName("akv.f(II[IB)V")
	public void method17816(int arg0, int arg1, int[] arg2) {
		arg2[0] = 0;
		arg2[1] = this.field11456 - this.field11453 + arg0;
		arg2[2] = this.field11459 - this.field11454 + arg1;
	}
}
