package com.jagex;

import com.jagex.graphics.runetek5.GpuRenderer;
import com.jagex.graphics.runetek5.GpuTexture;
import deob.ObfuscatedName;

@ObfuscatedName("jz")
public abstract class BatchedSpriteShader {

	@ObfuscatedName("jz.e")
	public GpuRenderer field2993;

	@ObfuscatedName("jz.n")
	public GpuTexture field2992;

	public BatchedSpriteShader(GpuRenderer arg0) {
		this.field2993 = arg0;
	}

	@ObfuscatedName("jz.e()V")
	public abstract void method5047();
}
