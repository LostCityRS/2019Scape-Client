package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ri")
public class class484 implements class487 {

	@ObfuscatedName("ri.e")
	public final int field4972;

	@ObfuscatedName("ri.n")
	public final class927 field4971;

	public class484(class927 arg0, int arg1) {
		this.field4972 = arg1;
		this.field4971 = arg0;
	}

	@ObfuscatedName("ri.e()I")
	public int method1015() {
		return this.field4971.method5718();
	}

	@ObfuscatedName("ri.n()I")
	public int method1009() {
		return this.field4971.method5696();
	}

	@ObfuscatedName("ri.z(I)V")
	public void method7627(int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field4971.field4979, this.field4971.field4974, this.field4972);
	}

	@ObfuscatedName("ri.m()V")
	public void method1010() {
	}
}
