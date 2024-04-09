package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("apa")
public abstract class GpuSurface extends Surface {

	@ObfuscatedName("apa.e")
	public GpuToolkit field11940;

	public GpuSurface(GpuToolkit arg0) {
		this.field11940 = arg0;
	}

	@ObfuscatedName("apa.k()Z")
	public boolean method1630() {
		this.field11940.method15989();
		return true;
	}

	@ObfuscatedName("apa.i(II)V")
	public void onResize(int arg0, int arg1) {
		if (this.field11940.getRenderTarget() == this) {
			this.field11940.method15982();
		}
	}
}
