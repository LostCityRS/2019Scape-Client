package com.jagex.graphics;

import com.jagex.graphics.gl.GlToolkit;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("be")
public class GlRenderList {

	@ObfuscatedName("be.e")
	public final int field1020;

	public GlRenderList(GlToolkit arg0, int arg1) {
		this.field1020 = OpenGL.glGenLists(arg1);
	}

	@ObfuscatedName("be.e(I)V")
	public void method1245(int arg0) {
		OpenGL.glNewList(this.field1020 + arg0, 4864);
	}

	@ObfuscatedName("be.n()V")
	public void method1243() {
		OpenGL.glEndList();
	}

	@ObfuscatedName("be.m(C)V")
	public void method1246(char arg0) {
		OpenGL.glCallList(this.field1020 + arg0);
	}
}
