package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anx")
public class class1064 extends class709 {

	public class1064(class998 arg0) {
		super(arg0);
	}

	public class1064(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anx.o(B)V")
	public void method18739() {
		if (this.field8416 < 0 || this.field8416 > 5 || this.field8416 == 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anx.e(B)I")
	public int method14069() {
		return 0;
	}

	@ObfuscatedName("anx.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("anx.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anx.s(B)I")
	public int method18740() {
		return this.field8416;
	}
}
