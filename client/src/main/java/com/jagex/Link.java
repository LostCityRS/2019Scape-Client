package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("tc")
public class Link {

	@ObfuscatedName("tc.e")
	public Link field6759;

	@ObfuscatedName("tc.n")
	public Link field6758;

	@ObfuscatedName("tc.e(I)V")
	public void method8433() {
		if (this.field6758 != null) {
			this.field6758.field6759 = this.field6759;
			this.field6759.field6758 = this.field6758;
			this.field6759 = null;
			this.field6758 = null;
		}
	}
}
