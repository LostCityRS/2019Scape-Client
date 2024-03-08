package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ami")
public class class1045 extends class709 {

	public class1045(class998 arg0) {
		super(arg0);
	}

	public class1045(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ami.o(I)V")
	public void method18592() {
		if (!this.field8417.method18165().method14090()) {
			this.field8416 = this.method14069();
		} else if (this.field8416 < -1 || this.field8416 > 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ami.e(B)I")
	public int method14069() {
		return this.field8417.method18165().method14090() ? 0 : 1;
	}

	@ObfuscatedName("ami.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("ami.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ami.s(I)I")
	public int method18588() {
		return this.field8416;
	}
}
