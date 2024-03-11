package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajn")
public class DualLink extends Link {

	@ObfuscatedName("ajn.m")
	public DualLink field11213;

	@ObfuscatedName("ajn.k")
	public DualLink field11212;

	@ObfuscatedName("ajn.n(I)V")
	public void method17453() {
		if (this.field11212 != null) {
			this.field11212.field11213 = this.field11213;
			this.field11213.field11212 = this.field11212;
			this.field11213 = null;
			this.field11212 = null;
		}
	}
}
