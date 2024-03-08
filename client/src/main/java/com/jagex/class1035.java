package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amm")
public class class1035 extends class709 {

	public class1035(class998 arg0) {
		super(arg0);
	}

	public class1035(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amm.o(I)V")
	public void method18497() {
		if (this.field8416 < 0 || this.field8416 > 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amm.e(B)I")
	public int method14069() {
		return 0;
	}

	@ObfuscatedName("amm.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("amm.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amm.s(I)I")
	public int method18498() {
		return this.field8416;
	}
}
