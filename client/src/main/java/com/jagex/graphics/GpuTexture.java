package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("lz")
public interface GpuTexture extends BaseTexture {

	@ObfuscatedName("lz.n()I")
	int getHeight();

	@ObfuscatedName("lz.k(F)F")
	float getU(float arg0);

	@ObfuscatedName("lz.f(F)F")
	float getV(float arg0);

	@ObfuscatedName("lz.l(ZZ)V")
	void setWarp(boolean arg0, boolean arg1);

	@ObfuscatedName("lz.z(IIII[III)V")
	void upload(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6);

	@ObfuscatedName("lz.d(IIII[II)V")
	void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5);

	@ObfuscatedName("lz.c(IIII[I[II)V")
	void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6);

	@ObfuscatedName("lz.o()F")
	float method5707();

	@ObfuscatedName("lz.s()Z")
	boolean method5708();

	@ObfuscatedName("lz.p(IIII[BLck;II)V")
	void upload(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7);

	@ObfuscatedName("lz.e()I")
	int getWidth();

	@ObfuscatedName("lz.r(IIIIII)V")
	void upload(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("lz.w()Z")
	boolean method5732();

	@ObfuscatedName("lz.v()F")
	float method5734();
}
