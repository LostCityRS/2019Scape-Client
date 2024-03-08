package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aid")
public class OpenGLIndexBuffer extends class486 implements IndexBuffer {

	@ObfuscatedName("aid.d")
	public DataType field10675;

	public OpenGLIndexBuffer(OpenGLRenderer arg0, DataType arg1, boolean arg2) {
		super(arg0, 34963, arg2);
		this.field10675 = arg1;
	}

	@ObfuscatedName("aid.k()I")
	public int method5743() {
		return super.method5743();
	}

	@ObfuscatedName("aid.e()Ldg;")
	public DataType method5832() {
		return this.field10675;
	}

	@ObfuscatedName("aid.a(I)V")
	public void method5831(int arg0) {
		super.method5831(this.field10675.field1652 * arg0);
	}

	@ObfuscatedName("aid.m()V")
	public void method1010() {
		super.method1010();
	}

	@ObfuscatedName("aid.f(IIJ)Z")
	public boolean method5738(int arg0, int arg1, long arg2) {
		return super.method5738(arg0, arg1, arg2);
	}

	@ObfuscatedName("aid.w(II)J")
	public long method5737(int arg0, int arg1) {
		return super.method5737(arg0, arg1);
	}

	@ObfuscatedName("aid.l()V")
	public void method5749() {
		super.method5749();
	}
}
