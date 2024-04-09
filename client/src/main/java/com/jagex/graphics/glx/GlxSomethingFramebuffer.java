package com.jagex.graphics.glx;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ri")
public class GlxSomethingFramebuffer implements GlxRelated2 {

	@ObfuscatedName("ri.e")
	public final int field4972;

	@ObfuscatedName("ri.n")
	public final GlxTexture field4971;

	public GlxSomethingFramebuffer(GlxTexture arg0, int arg1) {
		this.field4972 = arg1;
		this.field4971 = arg0;
	}

	@ObfuscatedName("ri.e()I")
	public int method1015() {
		return this.field4971.getWidth();
	}

	@ObfuscatedName("ri.n()I")
	public int method1009() {
		return this.field4971.getHeight();
	}

	@ObfuscatedName("ri.z(I)V")
	public void method7627(int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field4971.field4979, this.field4971.field4974, this.field4972);
	}

	@ObfuscatedName("ri.m()V")
	public void delete() {
	}
}
