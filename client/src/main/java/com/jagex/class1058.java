package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anu")
public class class1058 extends class709 {

	public class1058(class998 arg0) {
		super(arg0);
	}

	public class1058(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anu.o(I)V")
	public void method18694() {
		if (this.field8416 < 0 || this.field8416 > 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anu.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("anu.n(II)I")
	public int method14070(int arg0) {
		return class133.method723(this.field8417.field11540.method18545()) ? 1 : 3;
	}

	@ObfuscatedName("anu.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anu.s(I)I")
	public int method18695() {
		return this.field8416;
	}
}
