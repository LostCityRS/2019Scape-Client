package com.jagex;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;
import jaggl.OpenGL;

@ObfuscatedName("bs")
public abstract class class85 {

	@ObfuscatedName("bs.m")
	public final class849 field1123;

	@ObfuscatedName("bs.k")
	public final int field1120;

	@ObfuscatedName("bs.f")
	public final int field1122;

	@ObfuscatedName("bs.w")
	public int field1118;

	@ObfuscatedName("bs.l")
	public boolean field1124;

	@ObfuscatedName("bs.u")
	public boolean field1125 = false;

	@ObfuscatedName("bs.z")
	public static final int[] field1126 = new int[1];

	public class85(class849 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
		this.field1123 = arg0;
		this.field1120 = arg1;
		this.field1118 = arg3;
		this.field1124 = arg4;
		OpenGL.glGenBuffersARB(1, field1126, 0);
		this.field1122 = field1126[0];
		this.method1311();
		OpenGL.glBufferDataARBub(arg1, this.field1118, arg2, 0, this.field1124 ? 35040 : 35044);
		this.field1123.field9880 += this.field1118;
	}

	public class85(class849 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
		this.field1123 = arg0;
		this.field1120 = arg1;
		this.field1118 = arg3;
		this.field1124 = arg4;
		OpenGL.glGenBuffersARB(1, field1126, 0);
		this.field1122 = field1126[0];
		this.method1311();
		OpenGL.glBufferDataARBa(arg1, this.field1118, arg2.method49(), this.field1124 ? 35040 : 35044);
		this.field1123.field9880 += this.field1118;
	}

	@ObfuscatedName("bs.c([BI)V")
	public void method1309(byte[] arg0, int arg1) {
		this.method1311();
		if (arg1 > this.field1118) {
			OpenGL.glBufferDataARBub(this.field1120, arg1, arg0, 0, this.field1124 ? 35040 : 35044);
			this.field1123.field9880 += arg1 - this.field1118;
			this.field1118 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.field1120, 0, arg1, arg0, 0);
		}
	}

	public void finalize() throws Throwable {
		if (!this.field1125) {
			this.field1123.method15870(this.field1122, this.field1118);
			this.field1125 = true;
		}
		super.finalize();
	}

	@ObfuscatedName("bs.d()V")
	public abstract void method1311();
}
