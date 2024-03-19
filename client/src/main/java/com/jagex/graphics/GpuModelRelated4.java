package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("mg")
public class GpuModelRelated4 {

	@ObfuscatedName("mg.e")
	public boolean field3358;

	@ObfuscatedName("mg.n")
	public boolean field3357;

	@ObfuscatedName("mg.m")
	public VertexBuffer field3359;

	@ObfuscatedName("mg.k")
	public VertexBuffer field3356;

	public GpuModelRelated4(boolean arg0) {
		this.field3357 = arg0;
	}

	@ObfuscatedName("mg.e()Z")
	public boolean method5787() {
		return this.field3358 && !this.field3357;
	}

	@ObfuscatedName("mg.n()V")
	public void method5788() {
		if (this.field3356 != null) {
			this.field3356.delete();
		}
		this.field3358 = false;
	}
}
