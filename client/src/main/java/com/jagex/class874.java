package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agm")
public abstract class class874 extends class159 {

	@ObfuscatedName("agm.n")
	public final int field10303;

	@ObfuscatedName("agm.m")
	public final int field10304;

	@ObfuscatedName("agm.k")
	public final int field10305;

	public class874(class997 arg0) {
		super(arg0);
		this.field10303 = arg0.method17906();
		this.field10304 = arg0.method17906();
		this.field10305 = arg0.method17904();
	}

	@ObfuscatedName("agm.k(I)Z")
	public boolean method2891() {
		class680 var1 = (class680) Statics.field4874.method962(this.field10303);
		boolean var2 = var1.method13803();
		class164 var3 = (class164) Statics.field8797.method962(var1.field8260);
		return var2 & var3.method2991();
	}
}
