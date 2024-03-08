package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("and")
public class class1050 extends class709 {

	public class1050(class998 arg0) {
		super(arg0);
	}

	public class1050(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("and.o(I)V")
	public void method18626() {
		if (this.field8417.field11540.method18546() && !class133.method723(this.field8417.field11540.method18545())) {
			this.field8416 = 0;
		}
		if (this.field8417.method18165().method14090()) {
			if (this.field8416 < 0 || this.field8416 > 3) {
				this.field8416 = this.method14069();
			}
		} else if (this.field8416 < 0 || this.field8416 > 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("and.e(B)I")
	public int method14069() {
		return 0;
	}

	@ObfuscatedName("and.s(I)Z")
	public boolean method18624() {
		return class133.method723(this.field8417.field11540.method18545());
	}

	@ObfuscatedName("and.n(II)I")
	public int method14070(int arg0) {
		return class133.method723(this.field8417.field11540.method18545()) ? 1 : 3;
	}

	@ObfuscatedName("and.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("and.y(B)I")
	public int method18625() {
		return this.field8416;
	}
}
