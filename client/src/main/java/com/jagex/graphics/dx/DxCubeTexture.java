package com.jagex.graphics.dx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GpuCubeTexture;
import com.jagex.graphics.GpuTextureRelated;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

import java.nio.ByteBuffer;

@ObfuscatedName("aif")
public class DxCubeTexture extends DxBaseTexture implements GpuCubeTexture {

	@ObfuscatedName("aif.w")
	public final int field10676;

	public DxCubeTexture(DxToolkit arg0, int arg1, boolean arg2, int[][] arg3) {
		super(arg0, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, arg2 && arg0.field11967, arg1 * arg1 * 6);
		this.field10676 = arg1;
		if (this.field4220) {
			this.field4217 = IDirect3DDevice.CreateCubeTexture(this.renderer.device, this.field10676, 0, 1024, 21, 1);
		} else {
			this.field4217 = IDirect3DDevice.CreateCubeTexture(this.renderer.device, this.field10676, 1, 0, 21, 1);
		}
		ByteBuffer var5 = this.renderer.temporaryBuffer;
		this.renderer.ensureTemporaryBufferCapacity(this.field10676 * this.field10676 * 4);
		for (int var6 = 0; var6 < 6; var6++) {
			var5.clear();
			var5.asIntBuffer().put(arg3[var6]);
			IDirect3DCubeTexture.Upload(this.field4217, var6, 0, 0, 0, this.field10676, this.field10676, this.field10676 * 4, 0, this.renderer.temporaryBufferAddress);
		}
	}

	@ObfuscatedName("aif.aj()V")
	public void method5823() {
		this.renderer.method19001(this);
	}

	@ObfuscatedName("aif.m()V")
	public void delete() {
		super.delete();
	}

	@ObfuscatedName("aif.ay(Llt;)V")
	public void method5824(GpuTextureRelated arg0) {
		super.method5824(arg0);
	}
}
