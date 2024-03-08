package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agg")
public class class869 extends class159 {

	@ObfuscatedName("agg.n")
	public int field10284;

	@ObfuscatedName("agg.m")
	public final String field10286;

	@ObfuscatedName("agg.k")
	public final int field10285;

	@ObfuscatedName("agg.f")
	public final int field10283;

	public class869(class997 arg0) {
		super(arg0);
		this.field10284 = arg0.method17906();
		this.field10286 = arg0.method17918();
		this.field10285 = arg0.method17910();
		this.field10283 = arg0.method17906();
	}

	@ObfuscatedName("agg.n(I)V")
	public void method2890() {
		Statics.field1721[this.field10284].method2870().method16510(this.field10286, this.field10285, 0, this.field10283);
	}
}
