package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("lb")
public class GpuModelRelated {

	@ObfuscatedName("lb.e")
	public boolean field3238;

	@ObfuscatedName("lb.n")
	public boolean field3240;

	@ObfuscatedName("lb.m")
	public GpuIndexBuffer field3239;

	@ObfuscatedName("lb.k")
	public GpuIndexBuffer field3237;

	public GpuModelRelated(boolean arg0) {
		this.field3240 = arg0;
	}

	@ObfuscatedName("lb.e()Z")
	public boolean method5544() {
		return this.field3238 && !this.field3240;
	}

	@ObfuscatedName("lb.n()V")
	public void method5551() {
		if (this.field3237 != null) {
			this.field3237.delete();
		}
		this.field3238 = false;
	}
}
