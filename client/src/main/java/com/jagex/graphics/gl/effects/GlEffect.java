package com.jagex.graphics.gl.effects;

import com.jagex.graphics.gl.GlToolkit;
import com.jagex.graphics.gl.GlTexture;
import deob.ObfuscatedName;

@ObfuscatedName("by")
public abstract class GlEffect {

	@ObfuscatedName("by.e")
	public final GlToolkit field1021;

	public GlEffect(GlToolkit arg0) {
		this.field1021 = arg0;
	}

	@ObfuscatedName("by.w(Lbq;I)V")
	public abstract void method1251(GlTexture arg0, int arg1);

	@ObfuscatedName("by.e()Z")
	public abstract boolean method1252();

	@ObfuscatedName("by.m(Z)V")
	public abstract void method1254(boolean arg0);

	@ObfuscatedName("by.k()V")
	public abstract void method1255();

	@ObfuscatedName("by.f(II)V")
	public abstract void method1256(int arg0, int arg1);

	@ObfuscatedName("by.n(Z)V")
	public abstract void method1263(boolean arg0);
}
