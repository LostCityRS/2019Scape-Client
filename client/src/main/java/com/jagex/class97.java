package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ct")
public class class97 implements class88 {

	@ObfuscatedName("ct.e")
	public final int field1203;

	@ObfuscatedName("ct.n")
	public final class812 field1202;

	public class97(class812 arg0, int arg1) {
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
	public void method1010() {
	}
}
