package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ags")
public class class881 extends class159 {

	@ObfuscatedName("ags.n")
	public final int field10329;

	@ObfuscatedName("ags.m")
	public final int field10328;

	public class881(class997 arg0) {
		super(arg0);
		this.field10329 = arg0.method17906();
		this.field10328 = arg0.method17910();
	}

	@ObfuscatedName("ags.n(I)V")
	public void method2890() {
		client.field10868 = client.field10903;
		client.field10869 = this.field10329 + client.field10903;
		Statics.field7950 = client.field11002;
		Statics.field10297 = client.field10871;
		Statics.field8521 = client.field10872;
		Statics.field1843 = client.field10805;
		client.field11002 = this.field10328 >>> 24;
		client.field10871 = this.field10328 >>> 16 & 0xFF;
		client.field10872 = this.field10328 >>> 8 & 0xFF;
		client.field10805 = this.field10328 & 0xFF;
	}
}
