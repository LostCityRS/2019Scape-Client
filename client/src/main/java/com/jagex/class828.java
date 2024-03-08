package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aeg")
public class class828 extends class986 implements class88 {

	@ObfuscatedName("aeg.k")
	public final class849 field9348;

	@ObfuscatedName("aeg.f")
	public int field9353;

	@ObfuscatedName("aeg.w")
	public final int field9349;

	@ObfuscatedName("aeg.l")
	public final int field9347;

	@ObfuscatedName("aeg.u")
	public final class135 field9351;

	@ObfuscatedName("aeg.z")
	public final class109 field9352;

	@ObfuscatedName("aeg.p")
	public final int field9350;

	@ObfuscatedName("aeg.d")
	public static final int[] field9354 = new int[1];

	public class828(class849 arg0, class109 arg1, class135 arg2, int arg3, int arg4) {
		this.field9348 = arg0;
		this.field9349 = arg3;
		this.field9347 = arg4;
		this.field9352 = arg1;
		this.field9351 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, field9354, 0);
		this.field9353 = field9354[0];
		OpenGL.glBindRenderbufferEXT(36161, this.field9353);
		OpenGL.glRenderbufferStorageEXT(36161, class849.method15799(this.field9352, this.field9351), this.field9349, this.field9347);
		this.field9350 = this.field9352.field1279 * this.field9349 * this.field9347 * this.field9351.field1652;
	}

	public class828(class849 arg0, class109 arg1, class135 arg2, int arg3, int arg4, int arg5) {
		this.field9348 = arg0;
		this.field9349 = arg3;
		this.field9347 = arg4;
		this.field9352 = arg1;
		this.field9351 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, field9354, 0);
		this.field9353 = field9354[0];
		OpenGL.glBindRenderbufferEXT(36161, this.field9353);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, class849.method15799(this.field9352, this.field9351), this.field9349, this.field9347);
		this.field9350 = this.field9352.field1279 * this.field9349 * this.field9347 * this.field9351.field1652;
	}

	@ObfuscatedName("aeg.e()I")
	public int method1015() {
		return this.field9349;
	}

	@ObfuscatedName("aeg.n()I")
	public int method1009() {
		return this.field9347;
	}

	@ObfuscatedName("aeg.z(I)V")
	public void method1318(int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field9353);
	}

	@ObfuscatedName("aeg.m()V")
	public void method1010() {
		if (this.field9353 != 0) {
			int[] var1 = new int[] { this.field9353 };
			OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
			this.field9353 = 0;
		}
	}

	@ObfuscatedName("aeg.r()V")
	public void method15351() {
		if (this.field9353 != 0) {
			this.field9348.method15796(this.field9353, this.field9350);
			this.field9353 = 0;
		}
	}

	public void finalize() throws Throwable {
		this.method15351();
		super.finalize();
	}
}
