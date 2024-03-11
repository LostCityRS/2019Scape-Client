package com.jagex.graphics.runetek5.gl.effects;

import com.jagex.graphics.runetek5.legacygl.LegacyOpenGLRenderer;
import com.jagex.graphics.runetek5.legacygl.LegacyOpenGLTexture;
import deob.ObfuscatedName;

@ObfuscatedName("by")
public abstract class GlEffect {

	@ObfuscatedName("by.e")
	public final LegacyOpenGLRenderer field1021;

	public GlEffect(LegacyOpenGLRenderer arg0) {
		this.field1021 = arg0;
	}

	@ObfuscatedName("by.w(Lbq;I)V")
	public abstract void method1251(LegacyOpenGLTexture arg0, int arg1);

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
