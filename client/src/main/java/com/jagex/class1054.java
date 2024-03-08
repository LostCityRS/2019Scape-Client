package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("any")
public class class1054 extends class709 {

	public class1054(class998 arg0) {
		super(arg0);
	}

	public class1054(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("any.o(I)V")
	public void method18653() {
		if (this.field8417.method18159() != class696.field8335) {
			this.field8416 = 1;
		}
		if (this.field8416 != 0 && this.field8416 != 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("any.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("any.s(I)Z")
	public boolean method18650() {
		return this.field8417.method18159() == class696.field8335;
	}

	@ObfuscatedName("any.n(II)I")
	public int method14070(int arg0) {
		if (this.field8417.method18159() != class696.field8335) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.field8417.field11564.method18434() == 1) {
				return 2;
			}
			if (this.field8417.field11538.method18426() == 1) {
				return 2;
			}
			if (this.field8417.field11541.method18522() > 0) {
				return 2;
			}
		}
		return 1;
	}

	@ObfuscatedName("any.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("any.y(I)I")
	public int method18651() {
		return this.field8416;
	}
}
