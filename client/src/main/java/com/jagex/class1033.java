package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amc")
public class class1033 extends class709 {

	public class1033(class998 arg0) {
		super(arg0);
	}

	public class1033(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amc.o(S)V")
	public void method18490() {
		if (this.field8417.method18159() != class696.field8335) {
			this.field8416 = 1;
		}
		if (this.field8416 != 0 && this.field8416 != 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amc.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amc.s(B)Z")
	public boolean method18488() {
		return this.field8417.method18159() == class696.field8335;
	}

	@ObfuscatedName("amc.n(II)I")
	public int method14070(int arg0) {
		return this.field8417.method18159() == class696.field8335 ? 1 : 3;
	}

	@ObfuscatedName("amc.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amc.y(I)I")
	public int method18489() {
		return this.field8416;
	}
}
