package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("tj")
public class class532 {

	@ObfuscatedName("tj.e")
	public long field6760;

	@ObfuscatedName("tj.n")
	public class532 field6761;

	@ObfuscatedName("tj.m")
	public class532 field6762;

	@ObfuscatedName("tj.o(I)V")
	public void method8440() {
		if (this.field6762 != null) {
			this.field6762.field6761 = this.field6761;
			this.field6761.field6762 = this.field6762;
			this.field6761 = null;
			this.field6762 = null;
		}
	}

	@ObfuscatedName("tj.s(I)Z")
	public boolean method8441() {
		return this.field6762 != null;
	}
}
