package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("mg")
public class class349 {

	@ObfuscatedName("mg.e")
	public boolean field3358;

	@ObfuscatedName("mg.n")
	public boolean field3357;

	@ObfuscatedName("mg.m")
	public class330 field3359;

	@ObfuscatedName("mg.k")
	public class330 field3356;

	public class349(boolean arg0) {
		this.field3357 = arg0;
	}

	@ObfuscatedName("mg.e()Z")
	public boolean method5787() {
		return this.field3358 && !this.field3357;
	}

	@ObfuscatedName("mg.n()V")
	public void method5788() {
		if (this.field3356 != null) {
			this.field3356.method1010();
		}
		this.field3358 = false;
	}
}
