package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("age")
public class class872 extends class159 {

	@ObfuscatedName("age.n")
	public final int field10292;

	@ObfuscatedName("age.m")
	public final int field10295;

	@ObfuscatedName("age.k")
	public final int field10293;

	@ObfuscatedName("age.f")
	public final int field10294;

	@ObfuscatedName("age.w")
	public final int field10291;

	@ObfuscatedName("age.l")
	public final int field10296;

	public class872(class997 arg0) {
		super(arg0);
		this.field10292 = arg0.method17906();
		this.field10295 = arg0.method17906();
		this.field10293 = arg0.method17906();
		this.field10294 = arg0.method17906();
		this.field10291 = arg0.method17906();
		this.field10296 = arg0.method17906();
	}

	@ObfuscatedName("age.n(I)V")
	public void method2890() {
		Statics.field1714[this.field10292].method2840(0);
		Statics.field1714[this.field10295].method2840(1);
		client.field10904 = 0;
		client.field10909 = this.field10293 * 2;
		client.field10976 = 0;
		client.field10843 = this.field10291;
		client.field10913 = this.field10296;
		client.field10908 = 1;
		client.field10932 = this.field10294 * 4;
		Statics.field3416 = 6;
		client.method9611();
		client.field10877 = true;
	}
}
