package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amx")
public class class1044 extends class709 {

	public class1044(class998 arg0) {
		super(arg0);
	}

	public class1044(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amx.o(I)V")
	public void method18579() {
		if (this.field8416 < 0 || this.field8416 > 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amx.e(B)I")
	public int method14069() {
		return this.field8417.field11540.method18546() && class133.method551(this.field8417.field11540.method18545()) ? 1 : 0;
	}

	@ObfuscatedName("amx.s(B)Z")
	public boolean method18578() {
		return true;
	}

	@ObfuscatedName("amx.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("amx.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amx.y(I)I")
	public int method18581() {
		return this.field8416;
	}
}
