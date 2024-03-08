package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amw")
public class class1040 extends class709 {

	public class1040(class998 arg0) {
		super(arg0);
	}

	public class1040(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amw.o(I)V")
	public void method18536() {
		if (this.field8416 < 1 || this.field8416 > 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amw.e(B)I")
	public int method14069() {
		return this.field8417.method18165().method14083() ? 3 : 2;
	}

	@ObfuscatedName("amw.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("amw.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amw.s(I)I")
	public int method18539() {
		return this.field8416;
	}
}
