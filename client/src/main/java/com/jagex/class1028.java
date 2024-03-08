package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amb")
public class class1028 extends class709 {

	public class1028(class998 arg0) {
		super(arg0);
	}

	public class1028(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amb.o(I)V")
	public void method18430() {
		if (this.field8416 != 0 && this.field8417.field11525.method18651() != 1) {
			this.field8416 = 0;
		}
		if (this.field8416 != 0 && this.field8417.field11531.method18504() == 2) {
			this.field8416 = 0;
		}
		if (this.field8416 < 0 || this.field8416 > 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amb.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amb.s(B)Z")
	public boolean method18431() {
		return true;
	}

	@ObfuscatedName("amb.n(II)I")
	public int method14070(int arg0) {
		if (arg0 != 0 && this.field8417.field11531.method18504() == 2) {
			return 3;
		} else if (arg0 == 0 || this.field8417.field11525.method18651() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("amb.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amb.y(I)I")
	public int method18434() {
		return this.field8416;
	}
}
