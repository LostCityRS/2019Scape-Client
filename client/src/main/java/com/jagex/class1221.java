package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("atr")
public class class1221 extends class1150 {

	@ObfuscatedName("atr.d")
	public class890 field12535;

	@ObfuscatedName("atr.c")
	public int[] field12536 = null;

	public class1221(class890 arg0, class240 arg1) {
		super(arg1);
		this.field12535 = arg0;
	}

	@ObfuscatedName("atr.a()I")
	public final int method19681() {
		return this.field12536[this.field12535.method4212()];
	}

	@ObfuscatedName("atr.e(I)Z")
	public boolean method19245(int arg0) {
		if (this.field12536 == null) {
			this.field12536 = new int[this.field12535.method4158()];
		}
		class888 var2 = (class888) this.field12535.method4159(arg0);
		this.field12536[arg0] = OpenGL.glGetUniformLocation(var2.field10373, this.method19257());
		return this.field12536[arg0] != -1;
	}

	@ObfuscatedName("atr.w(I)I")
	public final int method19250(int arg0) {
		return this.field12536[arg0];
	}
}
