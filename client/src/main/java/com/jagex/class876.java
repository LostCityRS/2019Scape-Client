package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agd")
public class class876 extends class159 {

	@ObfuscatedName("agd.n")
	public final int field10315;

	@ObfuscatedName("agd.m")
	public final int field10313;

	@ObfuscatedName("agd.k")
	public final String field10312;

	@ObfuscatedName("agd.f")
	public final int field10314;

	@ObfuscatedName("agd.w")
	public final int field10316;

	public class876(class997 arg0) {
		super(arg0);
		this.field10315 = arg0.method17906();
		this.field10313 = arg0.method17906();
		this.field10312 = arg0.method17918();
		this.field10314 = arg0.method17910();
		this.field10316 = arg0.method17906();
	}

	@ObfuscatedName("agd.n(I)V")
	public void method2890() {
		client.method8476(Statics.field4826, this.field10315, this.field10313, client.method3660(this.field10315, this.field10313, Statics.field4826), this.field10316, this.field10314, this.field10312);
	}
}
