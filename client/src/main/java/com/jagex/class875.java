package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agf")
public class class875 extends class159 {

	@ObfuscatedName("agf.n")
	public final int field10306;

	@ObfuscatedName("agf.m")
	public final int field10307;

	@ObfuscatedName("agf.k")
	public final int field10308;

	@ObfuscatedName("agf.f")
	public final int field10309;

	@ObfuscatedName("agf.w")
	public final int field10310;

	public class875(class997 arg0) {
		super(arg0);
		this.field10306 = arg0.method17906();
		int var2 = arg0.method17910();
		this.field10307 = var2 >>> 16;
		this.field10308 = var2 & 0xFFFF;
		this.field10309 = arg0.method17904();
		this.field10310 = arg0.method17904();
	}

	@ObfuscatedName("agf.n(I)V")
	public void method2890() {
		Statics.field7317[this.field10306].method2847(this.field10309, this.field10307, this.field10308, this.field10310);
	}
}
