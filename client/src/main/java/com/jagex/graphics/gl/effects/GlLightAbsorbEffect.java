package com.jagex.graphics.gl.effects;

import com.jagex.graphics.gl.GlToolkit;
import com.jagex.graphics.gl.GlTexture;
import deob.ObfuscatedName;

@ObfuscatedName("aen")
public class GlLightAbsorbEffect extends GlEffect {

	public GlLightAbsorbEffect(GlToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("aen.e()Z")
	public boolean method1252() {
		return true;
	}

	@ObfuscatedName("aen.n(Z)V")
	public void method1263(boolean arg0) {
		this.field1021.method15840(true);
	}

	@ObfuscatedName("aen.m(Z)V")
	public void method1254(boolean arg0) {
	}

	@ObfuscatedName("aen.k()V")
	public void method1255() {
		this.field1021.method15840(false);
	}

	@ObfuscatedName("aen.f(II)V")
	public void method1256(int arg0, int arg1) {
	}

	@ObfuscatedName("aen.w(Lbq;I)V")
	public void method1251(GlTexture arg0, int arg1) {
		this.field1021.method15777(arg0);
		this.field1021.method15778(arg1);
	}
}
