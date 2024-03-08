package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ana")
public class class1056 extends class709 {

	public class1056(class998 arg0) {
		super(arg0);
	}

	public class1056(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ana.o(I)V")
	public void method18675() {
		if (this.field8416 < 0 || this.field8416 > 4) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ana.e(B)I")
	public int method14069() {
		return 0;
	}

	@ObfuscatedName("ana.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("ana.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ana.s(S)I")
	public int method18676() {
		return this.field8416;
	}
}
