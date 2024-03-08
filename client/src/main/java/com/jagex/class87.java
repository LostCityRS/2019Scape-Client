package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("cg")
public class class87 implements class88 {

	@ObfuscatedName("cg.e")
	public final int field1131;

	@ObfuscatedName("cg.n")
	public final int field1130;

	@ObfuscatedName("cg.m")
	public final class813 field1129;

	public class87(class813 arg0, int arg1, int arg2) {
		this.field1130 = arg2;
		this.field1129 = arg0;
		this.field1131 = arg1;
	}

	@ObfuscatedName("cg.e()I")
	public int method1015() {
		return this.field1129.field9279;
	}

	@ObfuscatedName("cg.n()I")
	public int method1009() {
		return this.field1129.field9279;
	}

	@ObfuscatedName("cg.z(I)V")
	public void method1318(int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field1131, this.field1129.field1007, this.field1130);
	}

	@ObfuscatedName("cg.m()V")
	public void method1010() {
	}
}
