package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anl")
public class class1067 extends class709 {

	public class1067(class998 arg0) {
		super(arg0);
	}

	public class1067(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anl.o(B)V")
	public void method18762() {
		if (this.field8416 < 0 || this.field8416 > 255) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anl.e(B)I")
	public int method14069() {
		return 127;
	}

	@ObfuscatedName("anl.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("anl.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anl.s(I)I")
	public int method18763() {
		return this.field8416;
	}
}
