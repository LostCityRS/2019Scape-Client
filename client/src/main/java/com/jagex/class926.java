package com.jagex;

import deob.ObfuscatedName;
import jagdx.*;

@ObfuscatedName("aio")
public class class926 extends Direct3DTexture implements Texture2 {

	public class926(Direct3DRenderer arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
		super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
	}

	@ObfuscatedName("aio.ak(I)Ldp;")
	public class130 method5828(int arg0) {
		return new class407(this, arg0);
	}

	@ObfuscatedName("aio.d(IIII[II)V")
	public void method5703(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		long var7 = IDirect3DTexture.GetSurfaceLevel(this.field4217, 0);
		long var9 = IDirect3DDevice.CreateRenderTarget(this.field4219.device, arg2, arg3, 21, 0, 0, true);
		this.field4219.method15961(arg2 * arg3 * 4);
		if (class0.method35(IDirect3DDevice.StretchRect(this.field4219.device, var7, arg0, arg1, arg2, arg3, var9, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(var9, 0, 0, arg2, arg3, arg2 * 4, 16, this.field4219.field10046);
			this.field4219.field10071.clear();
			this.field4219.field10071.asIntBuffer().get(arg4);
		}
		IUnknown.Release(var7);
		IUnknown.Release(var9);
	}

	@ObfuscatedName("aio.m()V")
	public void method1010() {
		super.method1010();
	}

	@ObfuscatedName("aio.e()I")
	public int method5718() {
		return super.method5718();
	}

	@ObfuscatedName("aio.n()I")
	public int method5696() {
		return super.method5696();
	}

	@ObfuscatedName("aio.k(F)F")
	public float method5697(float arg0) {
		return super.method5697(arg0);
	}

	@ObfuscatedName("aio.f(F)F")
	public float method5698(float arg0) {
		return super.method5698(arg0);
	}

	@ObfuscatedName("aio.w()Z")
	public boolean method5732() {
		return super.method5732();
	}

	@ObfuscatedName("aio.l(ZZ)V")
	public void method5700(boolean arg0, boolean arg1) {
		super.method5700(arg0, arg1);
	}

	@ObfuscatedName("aio.z(IIII[III)V")
	public void method5701(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		super.method5701(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aio.p(IIII[BLck;II)V")
	public void method5712(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7) {
		super.method5712(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@ObfuscatedName("aio.c(IIII[I[II)V")
	public void method5704(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
		super.method5704(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aio.r(IIIIII)V")
	public void method5719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super.method5719(arg0, arg1, arg2, arg3, arg4, arg5);
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
	public void method5824(class343 arg0) {
		super.method5824(arg0);
	}
}
