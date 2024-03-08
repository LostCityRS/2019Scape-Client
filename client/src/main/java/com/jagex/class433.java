package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("pa")
public class class433 implements class774 {

	@ObfuscatedName("pa.e")
	public final String field4336;

	@ObfuscatedName("pa.n")
	public final boolean field4335;

	@ObfuscatedName("pa.m")
	public boolean field4337;

	public class433(String arg0, boolean arg1) {
		this.field4336 = arg0;
		this.field4335 = arg1;
	}

	public class433(String arg0) {
		this(arg0, false);
	}

	@ObfuscatedName("pa.e(I)I")
	public int method6782() {
		if (this.field4337) {
			return 100;
		}
		try {
			return Statics.field10577.method8464(this.field4336, this.field4335);
		} catch (class1112 var2) {
			class576.method18474(class772.field8907, var2.field11896, var2.field11897, var2.getCause());
			this.field4337 = true;
			return 100;
		}
	}

	@ObfuscatedName("pa.u(B)Z")
	public boolean method6812() {
		return this.field4337;
	}

	@ObfuscatedName("pa.z(B)V")
	public void method6813() {
		this.field4337 = true;
	}

	@ObfuscatedName("pa.n(B)Lacv;")
	public class773 method6781() {
		return class773.field8915;
	}
}
