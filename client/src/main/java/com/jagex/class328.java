package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("lb")
public class class328 {

	@ObfuscatedName("lb.e")
	public boolean field3238;

	@ObfuscatedName("lb.n")
	public boolean field3240;

	@ObfuscatedName("lb.m")
	public class360 field3239;

	@ObfuscatedName("lb.k")
	public class360 field3237;

	public class328(boolean arg0) {
		this.field3240 = arg0;
	}

	@ObfuscatedName("lb.e()Z")
	public boolean method5544() {
		return this.field3238 && !this.field3240;
	}

	@ObfuscatedName("lb.n()V")
	public void method5551() {
		if (this.field3237 != null) {
			this.field3237.method1010();
		}
		this.field3238 = false;
	}
}
