package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("atj")
public class class1226 extends class1180 {

	@ObfuscatedName("atj.u")
	public float field12551 = 0.0F;

	public class1226(int arg0, float arg1) {
		super(arg0);
		this.field12551 = arg1;
	}

	public class1226(int arg0, class997 arg1) {
		super(arg0);
		this.field12551 = arg1.method17916();
	}

	@ObfuscatedName("atj.r(FI)V")
	public void method19713(float arg0) {
		this.field12551 = arg0;
	}

	@ObfuscatedName("atj.n(FI)V")
	public void method19431(float arg0) {
	}

	@ObfuscatedName("atj.m(Lju;Lou;Lpq;I)V")
	public void method19440(class270 arg0, class419 arg1, class426 arg2) {
		arg1.method6307(0.0F, 0.0F, 1.0F, this.field12551);
	}

	@ObfuscatedName("atj.k(Lalw;I)V")
	public void method19434(class997 arg0) {
		this.field12551 = arg0.method17916();
	}
}
