package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amf")
public class class1031 extends class709 {

	public class1031(class998 arg0) {
		super(arg0);
		class633.method4293(this.field8416);
	}

	public class1031(int arg0, class998 arg1) {
		super(arg0, arg1);
		class633.method4293(this.field8416);
	}

	@ObfuscatedName("amf.o(I)V")
	public void method18465() {
		if (this.field8417.method18165().method14082() < 245) {
			this.field8416 = 0;
		}
		if (this.field8416 < 0 || this.field8416 > 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amf.e(B)I")
	public int method14069() {
		return this.field8417.method18165().method14082() < 245 ? 0 : 2;
	}

	@ObfuscatedName("amf.s(S)Z")
	public boolean method18466() {
		return this.field8417.method18165().method14082() >= 245;
	}

	@ObfuscatedName("amf.n(II)I")
	public int method14070(int arg0) {
		return this.field8417.method18165().method14082() < 245 ? 3 : 1;
	}

	@ObfuscatedName("amf.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
		class633.method4293(this.field8416);
	}

	@ObfuscatedName("amf.y(I)I")
	public int method18468() {
		return this.field8416;
	}
}
