package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("apz")
public abstract class GpuFrameBuffer extends FrameBuffer {

	@ObfuscatedName("apz.n")
	public GpuToolkit field11923;

	public GpuFrameBuffer(GpuToolkit arg0) {
		this.field11923 = arg0;
	}

	@ObfuscatedName("apz.k()Z")
	public boolean method1630() {
		this.field11923.method15989();
		return true;
	}

	@ObfuscatedName("apz.ac()V")
	public void method18969() {
		if (this.field11923.getRenderTarget() == this) {
			this.field11923.method15982();
		}
	}
}
