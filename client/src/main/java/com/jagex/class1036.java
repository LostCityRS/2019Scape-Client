package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amz")
public class class1036 extends class709 {

	public class1036(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	public class1036(class998 arg0) {
		super(arg0);
	}

	@ObfuscatedName("amz.o(I)V")
	public void method18510() {
		if (this.field8416 < 0 || this.field8416 > 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amz.e(B)I")
	public int method14069() {
		return 0;
	}

	@ObfuscatedName("amz.s(S)Z")
	public boolean method18503() {
		return true;
	}

	@ObfuscatedName("amz.n(II)I")
	public int method14070(int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@ObfuscatedName("amz.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amz.y(B)I")
	public int method18504() {
		return this.field8416;
	}
}
