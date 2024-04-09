package com.jagex.graphics;

import com.jagex.core.datastruct.Node;
import com.jagex.game.client.DataType;
import com.jagex.graphics.gl.GlTexture_Sub1;
import com.jagex.graphics.gl.GlToolkit;
import deob.ObfuscatedName;

@ObfuscatedName("ajl")
public abstract class PostProcessingFilter extends Node {

	@ObfuscatedName("ajl.k")
	public final GlToolkit field11270;

	@ObfuscatedName("ajl.f")
	public boolean field11271;

	public PostProcessingFilter(GlToolkit arg0) {
		this.field11270 = arg0;
	}

	@ObfuscatedName("ajl.l()I")
	public int method17569() {
		return 1;
	}

	@ObfuscatedName("ajl.z()Z")
	public boolean method17541() {
		return false;
	}

	@ObfuscatedName("ajl.p()Ldg;")
	public DataType method17542() {
		return DataType.UNSIGNED_INT_8;
	}

	@ObfuscatedName("ajl.d()Z")
	public boolean method17543() {
		return this.field11271;
	}

	@ObfuscatedName("ajl.n()Z")
	public abstract boolean method17534();

	@ObfuscatedName("ajl.f(ILadt;Ladt;II)V")
	public abstract void method17537(int arg0, GlTexture_Sub1 arg1, GlTexture_Sub1 arg2, int arg3, int arg4);

	@ObfuscatedName("ajl.w(I)V")
	public abstract void method17538(int arg0);

	@ObfuscatedName("ajl.e()Z")
	public abstract boolean method17539();

	@ObfuscatedName("ajl.k(II)V")
	public abstract void method17540(int arg0, int arg1);

	@ObfuscatedName("ajl.u()I")
	public abstract int method17546();

	@ObfuscatedName("ajl.c()Z")
	public abstract boolean method17551();

	@ObfuscatedName("ajl.m()V")
	public abstract void method17570();
}
