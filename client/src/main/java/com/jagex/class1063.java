package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ank")
public class class1063 extends class709 {

	public class1063(class998 arg0) {
		super(arg0);
	}

	public class1063(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ank.o(B)V")
	public void method18729() {
		if (this.field8416 < 0 || this.field8416 > 4) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ank.e(B)I")
	public int method14069() {
		return this.field8417.method18165().method14085() > 1 ? 4 : 2;
	}

	@ObfuscatedName("ank.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("ank.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ank.s(B)I")
	public int method18735() {
		return this.field8416;
	}
}
