package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amn")
public class class1027 extends class709 {

	public class1027(class998 arg0) {
		super(arg0);
	}

	public class1027(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amn.o(B)V")
	public void method18423() {
		if (this.field8417.method18159() != class696.field8335) {
			this.field8416 = 1;
		}
		if (this.field8417.method18165().method14090()) {
			if (this.field8416 < 0 || this.field8416 > 2) {
				this.field8416 = this.method14069();
			}
		} else if (this.field8416 != 0 && this.field8416 != 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amn.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amn.s(B)Z")
	public boolean method18425() {
		return this.field8417.method18159() == class696.field8335;
	}

	@ObfuscatedName("amn.n(II)I")
	public int method14070(int arg0) {
		if (this.field8417.method18159() == class696.field8335) {
			return arg0 == 0 || this.field8417.field11525.method18651() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@ObfuscatedName("amn.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amn.y(I)I")
	public int method18426() {
		return this.field8416;
	}
}
