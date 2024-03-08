package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amt")
public class class1038 extends class709 {

	public class1038(class998 arg0) {
		super(arg0);
	}

	public class1038(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amt.o(I)V")
	public void method18523() {
		if (this.field8416 < 0 || this.field8416 > 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amt.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amt.s(B)Z")
	public boolean method18521() {
		return true;
	}

	@ObfuscatedName("amt.n(II)I")
	public int method14070(int arg0) {
		return arg0 == 0 || this.field8417.field11525.method18651() == 1 ? 1 : 2;
	}

	@ObfuscatedName("amt.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amt.y(I)I")
	public int method18522() {
		return this.field8416;
	}
}
