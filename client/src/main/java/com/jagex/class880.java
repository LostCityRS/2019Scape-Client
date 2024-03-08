package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agu")
public class class880 extends class159 {

	@ObfuscatedName("agu.n")
	public final int field10323;

	@ObfuscatedName("agu.m")
	public final int field10324;

	@ObfuscatedName("agu.k")
	public final int field10325;

	@ObfuscatedName("agu.f")
	public final int field10326;

	@ObfuscatedName("agu.w")
	public class476 field10327;

	public class880(class997 arg0) {
		super(arg0);
		this.field10323 = arg0.method17906();
		this.field10324 = arg0.method17904();
		this.field10325 = arg0.method17904();
		this.field10326 = arg0.method17904();
		this.field10327 = Statics.field1798.method3236(class173.field1828, this, this.field10323, this.field10326, this.field10324, class168.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, this.field10325, false);
		if (this.field10327 != null) {
			this.field10327.method7392();
		}
	}

	@ObfuscatedName("agu.n(I)V")
	public void method2890() {
		if (this.field10327 != null) {
			this.field10327.method7441();
		}
	}

	@ObfuscatedName("agu.m(I)V")
	public void method2896() {
		if (this.field10327 != null) {
			this.field10327.method7380(50);
			Statics.field1798.method3185(this.field10327);
			this.field10327 = null;
		}
	}
}
