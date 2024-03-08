package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("afp")
public class class865 extends class159 {

	@ObfuscatedName("afp.n")
	public final int field10270;

	@ObfuscatedName("afp.m")
	public final int field10269;

	@ObfuscatedName("afp.k")
	public final int field10273;

	@ObfuscatedName("afp.f")
	public final int field10271;

	@ObfuscatedName("afp.w")
	public final int field10272;

	public class865(class997 arg0) {
		super(arg0);
		this.field10270 = arg0.method17906();
		int var2 = arg0.method17910();
		this.field10269 = var2 >>> 16;
		this.field10273 = var2 & 0xFFFF;
		this.field10271 = arg0.method17904();
		this.field10272 = arg0.method17922();
	}

	@ObfuscatedName("afp.n(I)V")
	public void method2890() {
		Statics.field1721[this.field10270].method2867(this.field10269, this.field10273, this.field10271, this.field10272);
	}
}
