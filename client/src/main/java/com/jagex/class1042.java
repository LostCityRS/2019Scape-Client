package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amr")
public class class1042 extends class709 {

	public class1042(class998 arg0) {
		super(arg0);
	}

	public class1042(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amr.o(I)V")
	public void method18558() {
		if (this.field8416 < 0 || this.field8416 > 4) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amr.e(B)I")
	public int method14069() {
		return 0;
	}

	@ObfuscatedName("amr.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("amr.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amr.s(B)I")
	public int method18559() {
		return this.field8416;
	}
}
