package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amv")
public class class1039 extends class709 {

	public class1039(class998 arg0) {
		super(arg0);
	}

	public class1039(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amv.o(B)V")
	public void method18532() {
		if (this.field8416 < 0 || this.field8416 != 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amv.e(B)I")
	public int method14069() {
		return 2;
	}

	@ObfuscatedName("amv.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("amv.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amv.s(I)I")
	public int method18533() {
		return this.field8416;
	}
}
