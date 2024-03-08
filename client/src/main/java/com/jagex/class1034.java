package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amo")
public class class1034 extends class709 {

	public class1034(class998 arg0) {
		super(arg0);
	}

	public class1034(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amo.o(I)V")
	public void method18495() {
		if (this.field8417.field11531.method18504() == 2 && this.field8416 == 2) {
			this.field8416 = 1;
		}
		if (this.field8416 < 0 || this.field8416 > 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amo.e(B)I")
	public int method14069() {
		return 2;
	}

	@ObfuscatedName("amo.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("amo.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amo.s(I)I")
	public int method18496() {
		return this.field8416;
	}
}
