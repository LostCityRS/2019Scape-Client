package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aft")
public class class862 extends class159 {

	@ObfuscatedName("aft.n")
	public final int field10264;

	@ObfuscatedName("aft.m")
	public final int field10262;

	@ObfuscatedName("aft.k")
	public final int field10263;

	@ObfuscatedName("aft.f")
	public final int field10261;

	@ObfuscatedName("aft.w")
	public final int field10265;

	public class862(class997 arg0) {
		super(arg0);
		this.field10264 = arg0.method17906();
		this.field10262 = arg0.method17906();
		this.field10263 = arg0.method17906();
		this.field10261 = arg0.method17906();
		this.field10265 = arg0.method17906();
	}

	@ObfuscatedName("aft.n(I)V")
	public void method2890() {
		client.method15723(this.field10264, this.field10263, this.field10262, 100, 100, false);
		client.method4843(this.field10261, this.field10265, 0);
		client.field10877 = true;
	}
}
