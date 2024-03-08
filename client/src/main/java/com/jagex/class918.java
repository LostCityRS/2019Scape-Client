package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("air")
public class class918 extends class485 implements class327 {

	@ObfuscatedName("air.v")
	public final int field10616;

	@ObfuscatedName("air.o")
	public final int field10617;

	@ObfuscatedName("air.s")
	public final int field10618;

	public class918(class1127 arg0, class109 arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
		super(arg0, 32879, arg1, class135.field1645, arg2 * arg3 * arg4, arg5);
		this.field10616 = arg2;
		this.field10617 = arg3;
		this.field10618 = arg4;
		this.field4980.method16092(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.field4979, 0, class1127.method19077(this.field4973, this.field4977), this.field10616, this.field10617, this.field10618, 0, class1127.method19085(this.field4973), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (arg5) {
			this.method5708();
		}
	}

	@ObfuscatedName("air.aj()V")
	public void method5823() {
		super.method5823();
	}

	@ObfuscatedName("air.ay(Llt;)V")
	public void method5824(class343 arg0) {
		super.method5824(arg0);
	}

	@ObfuscatedName("air.m()V")
	public void method1010() {
		super.method1010();
	}
}
