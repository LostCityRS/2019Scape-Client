package com.jagex.graphics.dx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.TextureFormat;
import com.jagex.graphics.dx.DxGraphicsDeletable;
import com.jagex.graphics.dx.DxToolkit;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@ObfuscatedName("of")
public class DxGraphicsDeletable_Sub1 implements DxGraphicsDeletable {

	@ObfuscatedName("of.e")
	public final DxToolkit field4228;

	@ObfuscatedName("of.n")
	public final DataType field4229;

	@ObfuscatedName("of.m")
	public final TextureFormat field4230;

	@ObfuscatedName("of.k")
	public final int field4231;

	@ObfuscatedName("of.f")
	public final int field4232;

	@ObfuscatedName("of.w")
	public long field4233;

	public DxGraphicsDeletable_Sub1(DxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5) {
		this.field4228 = arg0;
		this.field4231 = arg3;
		this.field4232 = arg4;
		this.field4230 = arg1;
		this.field4229 = arg2;
		this.field4233 = IDirect3DDevice.CreateRenderTarget(this.field4228.device, arg3, arg4, DxToolkit.getD3DFormat(this.field4230, this.field4229), arg5, 0, false);
		this.field4228.method15985(this);
	}

	@ObfuscatedName("of.e()I")
	public int method1015() {
		return this.field4231;
	}

	@ObfuscatedName("of.n()I")
	public int method1009() {
		return this.field4232;
	}

	@ObfuscatedName("of.z()J")
	public long method6216() {
		return this.field4233;
	}

	@ObfuscatedName("of.m()V")
	public void delete() {
		if (this.field4233 != 0L) {
			IUnknown.Release(this.field4233);
			this.field4233 = 0L;
		}
		this.field4228.method16198(this);
	}

	@ObfuscatedName("of.p()V")
	public void method6215() {
		if (this.field4233 != 0L) {
			this.field4228.method19023(this.field4233);
			this.field4233 = 0L;
		}
	}

	public void finalize() {
		this.method6215();
	}
}
