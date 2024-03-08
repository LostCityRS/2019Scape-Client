package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amh")
public class class1037 extends class709 {

	public class1037(class998 arg0) {
		super(arg0);
	}

	public class1037(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amh.o(S)V")
	public void method18513() {
		if (this.field8417.field11538.method18426() == 0) {
			this.field8416 = 0;
		}
		if (this.field8416 < 0 || this.field8416 > 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amh.e(B)I")
	public int method14069() {
		return 2;
	}

	@ObfuscatedName("amh.s(I)Z")
	public boolean method18514() {
		return this.field8417.field11538.method18426() != 0;
	}

	@ObfuscatedName("amh.n(II)I")
	public int method14070(int arg0) {
		return this.field8417.field11538.method18426() == 0 ? 3 : 1;
	}

	@ObfuscatedName("amh.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amh.y(S)I")
	public int method18515() {
		return this.field8416;
	}
}
