package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ane")
public class class1048 extends class709 {

	public class1048(class998 arg0) {
		super(arg0);
	}

	public class1048(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ane.o(I)V")
	public void method18608() {
		if (this.field8416 < 0 || this.field8416 > 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ane.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("ane.s(I)Z")
	public boolean method18606() {
		return class133.method723(this.field8417.field11540.method18545());
	}

	@ObfuscatedName("ane.n(II)I")
	public int method14070(int arg0) {
		return class133.method723(this.field8417.field11540.method18545()) ? 1 : 3;
	}

	@ObfuscatedName("ane.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ane.y(I)I")
	public int method18607() {
		return this.field8416;
	}
}
