package com.jagex;

import deob.ObfuscatedName;
import jagdx.IUnknown;

@ObfuscatedName("op")
public abstract class Direct3DBaseTexture implements DeletableResource {

	@ObfuscatedName("op.e")
	public final Direct3DRenderer field4219;

	@ObfuscatedName("op.n")
	public final TextureFormat field4221;

	@ObfuscatedName("op.m")
	public final DataType field4218;

	@ObfuscatedName("op.k")
	public boolean field4220;

	@ObfuscatedName("op.f")
	public long field4217 = 0L;

	public Direct3DBaseTexture(Direct3DRenderer arg0, TextureFormat arg1, DataType arg2, boolean arg3, int arg4) {
		this.field4219 = arg0;
		this.field4221 = arg1;
		this.field4218 = arg2;
		this.field4220 = arg3;
		this.field4219.method15985(this);
	}

	@ObfuscatedName("op.bl()J")
	public long method6225() {
		return this.field4217;
	}

	@ObfuscatedName("op.ay(Llt;)V")
	public void method5824(GpuTextureRelated arg0) {
	}

	@ObfuscatedName("op.m()V")
	public void method1010() {
		if (this.field4217 != 0L) {
			IUnknown.Release(this.field4217);
			this.field4217 = 0L;
		}
		this.field4219.method16198(this);
	}

	@ObfuscatedName("op.bk()V")
	public void method6226() {
		if (this.field4217 != 0L) {
			this.field4219.method19023(this.field4217);
			this.field4217 = 0L;
		}
	}

	public void finalize() {
		this.method6226();
	}
}
