package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("jo")
public abstract class ParticleShader {

	@ObfuscatedName("jo.e")
	public GpuRenderer field2986;

	@ObfuscatedName("jo.n")
	public GpuTexture field2991;

	@ObfuscatedName("jo.m")
	public final Matrix4x4 field2987 = new Matrix4x4();

	@ObfuscatedName("jo.k")
	public int field2988;

	@ObfuscatedName("jo.f")
	public final class415 field2989 = new class415();

	@ObfuscatedName("jo.w")
	public final Vector3 field2990 = new Vector3();

	@ObfuscatedName("jo.l")
	public float field2985 = 0.0F;

	public ParticleShader(GpuRenderer arg0) {
		this.field2986 = arg0;
	}

	@ObfuscatedName("jo.e(Lpq;)V")
	public abstract void method5038(Matrix4x4 arg0);

	@ObfuscatedName("jo.n(IZ)V")
	public abstract void method5039(int arg0, boolean arg1);

	@ObfuscatedName("jo.m(Z)V")
	public abstract void method5040(boolean arg0);
}
