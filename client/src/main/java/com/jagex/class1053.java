package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anm")
public class class1053 extends class709 {

	public class1053(class998 arg0) {
		super(arg0);
	}

	public class1053(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anm.o(I)V")
	public void method18643() {
		if (this.field8417.method18159() == class696.field8334) {
			this.field8416 = 2;
		}
		if (this.field8416 < 0 || this.field8416 > 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anm.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("anm.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("anm.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anm.s(B)I")
	public int method18645() {
		return this.field8416;
	}
}
