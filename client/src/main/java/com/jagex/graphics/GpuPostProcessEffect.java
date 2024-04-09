package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("lh")
public abstract class GpuPostProcessEffect {

	@ObfuscatedName("lh.e")
	public final GpuToolkit gpuRenderer;

	@ObfuscatedName("lh.n")
	public boolean field3243;

	public GpuPostProcessEffect(GpuToolkit gpuRenderer) {
		this.gpuRenderer = gpuRenderer;
	}

	@ObfuscatedName("lh.k()Z")
	public boolean method5561() {
		return this.method5572();
	}

	@ObfuscatedName("lh.z()I")
	public int method5566() {
		return 1;
	}

	@ObfuscatedName("lh.d()I")
	public int method5568() {
		return 0;
	}

	@ObfuscatedName("lh.c()Z")
	public boolean method5593() {
		return this.field3243;
	}

	@ObfuscatedName("lh.r()V")
	public void method5570() {
	}

	@ObfuscatedName("lh.e()Z")
	public abstract boolean method5558();

	@ObfuscatedName("lh.n()Z")
	public abstract boolean method5559();

	@ObfuscatedName("lh.f()V")
	public abstract void method5562();

	@ObfuscatedName("lh.l(ILafq;Llz;Ldw;Llz;Z)V")
	public abstract void method5564(int arg0, FrameBuffer arg1, GpuTexture arg2, EffectInterface arg3, GpuTexture arg4, boolean arg5);

	@ObfuscatedName("lh.u(I)V")
	public abstract void method5565(int arg0);

	@ObfuscatedName("lh.p()I")
	public abstract int method5567();

	@ObfuscatedName("lh.v()Z")
	public abstract boolean method5571();

	@ObfuscatedName("lh.m()Z")
	public abstract boolean method5572();

	@ObfuscatedName("lh.w(II)V")
	public abstract void method5574(int arg0, int arg1);
}
