package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anv")
public class class1057 extends class709 {

	public class1057(class998 arg0) {
		super(arg0);
	}

	public class1057(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anv.o(S)V")
	public void method18687() {
		if (this.field8417.method18165().method14090()) {
			if (this.field8416 < class255.field2669.field2666 || this.field8416 > class255.field2670.field2666) {
				this.field8416 = this.method14069();
			}
		} else if (this.field8416 < class256.field2671.field2674 || this.field8416 > class256.field2673.field2674) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anv.e(B)I")
	public int method14069() {
		return this.field8417.method18165().method14090() ? class255.field2667.field2666 : class256.field2671.field2674;
	}

	@ObfuscatedName("anv.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("anv.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anv.s(I)I")
	public int method18688() {
		return this.field8416;
	}
}
