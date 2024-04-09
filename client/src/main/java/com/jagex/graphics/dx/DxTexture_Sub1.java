package com.jagex.graphics.dx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GpuTextureRelated;
import com.jagex.graphics.GraphicsDeletable;
import com.jagex.graphics.Texture2;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jagdx.*;

@ObfuscatedName("aio")
public class DxTexture_Sub1 extends DxTexture implements Texture2 {

	public DxTexture_Sub1(DxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
		super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
	}

	@ObfuscatedName("aio.ak(I)Ldp;")
	public GraphicsDeletable method5828(int arg0) {
		return new DxRelated1(this, arg0);
	}

	@ObfuscatedName("aio.d(IIII[II)V")
	public void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		long var7 = IDirect3DTexture.GetSurfaceLevel(this.field4217, 0);
		long var9 = IDirect3DDevice.CreateRenderTarget(this.renderer.device, arg2, arg3, 21, 0, 0, true);
		this.renderer.ensureTemporaryBufferCapacity(arg2 * arg3 * 4);
		if (HRESULT.SUCCEEDED(IDirect3DDevice.StretchRect(this.renderer.device, var7, arg0, arg1, arg2, arg3, var9, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(var9, 0, 0, arg2, arg3, arg2 * 4, 16, this.renderer.temporaryBufferAddress);
			this.renderer.temporaryBuffer.clear();
			this.renderer.temporaryBuffer.asIntBuffer().get(arg4);
		}
		IUnknown.Release(var7);
		IUnknown.Release(var9);
	}

	@ObfuscatedName("aio.m()V")
	public void delete() {
		super.delete();
	}

	@ObfuscatedName("aio.e()I")
	public int getWidth() {
		return super.getWidth();
	}

	@ObfuscatedName("aio.n()I")
	public int getHeight() {
		return super.getHeight();
	}

	@ObfuscatedName("aio.k(F)F")
	public float getU(float arg0) {
		return super.getU(arg0);
	}

	@ObfuscatedName("aio.f(F)F")
	public float getV(float arg0) {
		return super.getV(arg0);
	}

	@ObfuscatedName("aio.w()Z")
	public boolean method5732() {
		return super.method5732();
	}

	@ObfuscatedName("aio.l(ZZ)V")
	public void setWarp(boolean arg0, boolean arg1) {
		super.setWarp(arg0, arg1);
	}

	@ObfuscatedName("aio.z(IIII[III)V")
	public void upload(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		super.upload(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aio.p(IIII[BLck;II)V")
	public void upload(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7) {
		super.upload(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@ObfuscatedName("aio.c(IIII[I[II)V")
	public void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
		super.download(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aio.r(IIIIII)V")
	public void upload(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super.upload(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("aio.v()F")
	public float method5734() {
		return super.method5734();
	}

	@ObfuscatedName("aio.o()F")
	public float method5707() {
		return super.method5707();
	}

	@ObfuscatedName("aio.s()Z")
	public boolean method5708() {
		return super.method5708();
	}

	@ObfuscatedName("aio.aj()V")
	public void method5823() {
		super.method5823();
	}

	@ObfuscatedName("aio.ay(Llt;)V")
	public void method5824(GpuTextureRelated arg0) {
		super.method5824(arg0);
	}
}
