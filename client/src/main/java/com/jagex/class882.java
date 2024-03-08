package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agp")
public class class882 extends class159 {

	@ObfuscatedName("agp.n")
	public final int field10330;

	@ObfuscatedName("agp.m")
	public final int field10331;

	@ObfuscatedName("agp.k")
	public final int field10332;

	public class882(class997 arg0) {
		super(arg0);
		this.field10330 = arg0.method17906();
		this.field10331 = arg0.method17906();
		this.field10332 = arg0.method17904();
	}

	@ObfuscatedName("agp.n(I)V")
	public void method2890() {
		class158 var1 = Statics.field1721[this.field10330];
		class160 var2 = Statics.field8358[this.field10331];
		var2.method2906(var1, this.field10332);
	}
}
