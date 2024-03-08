package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ame")
public class class1023 extends class709 {

	public class1023(class998 arg0) {
		super(arg0);
	}

	public class1023(int arg0, class998 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ame.o(B)V")
	public void method18393() {
		if (this.field8416 < 33 || this.field8416 > 200) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ame.e(B)I")
	public int method14069() {
		return 100;
	}

	@ObfuscatedName("ame.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("ame.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ame.s(B)I")
	public int method18391() {
		return this.field8416;
	}
}
