package com.jagex.graphics.dx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.DeletableResource;
import com.jagex.graphics.GpuTextureRelated;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jagdx.IUnknown;

@ObfuscatedName("op")
public abstract class DxBaseTexture implements DeletableResource {

	@ObfuscatedName("op.e")
	public final DxToolkit renderer;

	@ObfuscatedName("op.n")
	public final TextureFormat format;

	@ObfuscatedName("op.m")
	public final DataType field4218;

	@ObfuscatedName("op.k")
	public boolean field4220;

	@ObfuscatedName("op.f")
	public long field4217 = 0L;

	public DxBaseTexture(DxToolkit arg0, TextureFormat arg1, DataType arg2, boolean arg3, int arg4) {
		this.renderer = arg0;
		this.format = arg1;
		this.field4218 = arg2;
		this.field4220 = arg3;
		this.renderer.method15985(this);
	}

	@ObfuscatedName("op.bl()J")
	public long method6225() {
		return this.field4217;
	}

	@ObfuscatedName("op.ay(Llt;)V")
	public void method5824(GpuTextureRelated arg0) {
	}

	@ObfuscatedName("op.m()V")
	public void delete() {
		if (this.field4217 != 0L) {
			IUnknown.Release(this.field4217);
			this.field4217 = 0L;
		}
		this.renderer.method16198(this);
	}

	@ObfuscatedName("op.bk()V")
	public void method6226() {
		if (this.field4217 != 0L) {
			this.renderer.method19023(this.field4217);
			this.field4217 = 0L;
		}
	}

	public void finalize() {
		this.method6226();
	}
}
