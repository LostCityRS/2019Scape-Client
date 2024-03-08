package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agz")
public class class883 extends class159 {

	@ObfuscatedName("agz.n")
	public final int field10337;

	@ObfuscatedName("agz.m")
	public final int field10334;

	@ObfuscatedName("agz.k")
	public final int field10333;

	@ObfuscatedName("agz.f")
	public final int field10336;

	@ObfuscatedName("agz.w")
	public class476 field10335;

	public class883(class997 arg0) {
		super(arg0);
		this.field10337 = arg0.method17906();
		this.field10334 = arg0.method17904();
		this.field10333 = arg0.method17904();
		this.field10336 = arg0.method17904();
		this.field10335 = Statics.field1798.method3236(class173.field1828, this, this.field10337, this.field10336, this.field10334, class168.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, this.field10333, false);
		if (this.field10335 != null) {
			this.field10335.method7392();
		}
	}

	@ObfuscatedName("agz.n(I)V")
	public void method2890() {
		if (this.field10335 != null) {
			this.field10335.method7441();
		}
	}

	@ObfuscatedName("agz.m(I)V")
	public void method2896() {
		if (this.field10335 != null) {
			this.field10335.method7380(50);
			Statics.field1798.method3185(this.field10335);
			this.field10335 = null;
		}
	}
}
