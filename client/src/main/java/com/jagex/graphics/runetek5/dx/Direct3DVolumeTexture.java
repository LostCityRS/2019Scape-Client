package com.jagex.graphics.runetek5.dx;

import com.jagex.DataType;
import com.jagex.graphics.runetek5.GpuTextureRelated;
import com.jagex.TextureFormat;
import com.jagex.audio.runetek5.VolumeTexture;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

import java.nio.ByteBuffer;

@ObfuscatedName("ahy")
public class Direct3DVolumeTexture extends Direct3DBaseTexture implements VolumeTexture {

	@ObfuscatedName("ahy.w")
	public final int field10613;

	@ObfuscatedName("ahy.l")
	public final int field10614;

	@ObfuscatedName("ahy.u")
	public final int field10615;

	public Direct3DVolumeTexture(Direct3DRenderer arg0, TextureFormat arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
		super(arg0, arg1, DataType.UNSIGNED_INT_8, false, arg2 * arg3 * arg4);
		this.field10613 = arg2;
		this.field10614 = arg3;
		this.field10615 = arg4;
		this.field4217 = IDirect3DDevice.CreateVolumeTexture(this.field4219.device, arg2, arg3, arg4, 1, 0, Direct3DRenderer.method19011(arg1, this.field4218), 1);
		this.field4219.method15961(this.field10614 * this.field10613 * arg1.field1279);
		ByteBuffer var8 = this.field4219.field10071;
		var8.clear();
		var8.put(arg6);
		IDirect3DVolumeTexture.Upload(this.field4217, 0, 0, 0, 0, this.field10613, this.field10614, this.field10615, arg1.field1279 * this.field10613, 0, this.field4219.field10046);
	}

	@ObfuscatedName("ahy.bl()J")
	public long method6225() {
		return this.field4217;
	}

	@ObfuscatedName("ahy.aj()V")
	public void method5823() {
		this.field4219.method19003(this);
	}

	@ObfuscatedName("ahy.ay(Llt;)V")
	public void method5824(GpuTextureRelated arg0) {
		super.method5824(arg0);
	}

	@ObfuscatedName("ahy.m()V")
	public void method1010() {
		super.method1010();
	}
}
