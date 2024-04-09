package com.jagex.graphics.glx;

import com.jagex.graphics.gl.GlTexture_Sub1;
import com.jagex.graphics.gl.GlPostProcessingRelated;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ct")
public class GlxRelated4 implements GlPostProcessingRelated {

	@ObfuscatedName("ct.e")
	public final int field1203;

	@ObfuscatedName("ct.n")
	public final GlTexture_Sub1 field1202;

	public GlxRelated4(GlTexture_Sub1 arg0, int arg1) {
		this.field1203 = arg1;
		this.field1202 = arg0;
	}

	@ObfuscatedName("ct.e()I")
	public int method1015() {
		return this.field1202.field9272;
	}

	@ObfuscatedName("ct.n()I")
	public int method1009() {
		return this.field1202.field9271;
	}

	@ObfuscatedName("ct.z(I)V")
	public void method1318(int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field1202.field1009, this.field1202.field1007, this.field1203);
	}

	@ObfuscatedName("ct.m()V")
	public void delete() {
	}
}
