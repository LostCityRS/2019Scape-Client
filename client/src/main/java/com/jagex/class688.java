package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zy")
public class class688 {

	public class688() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("agm.e(Lov;B)F")
	public static float method16445(class421 arg0) {
		class423 var1 = class423.method6483(0.0F, 0.0F, 1.0F);
		var1.method6526(arg0);
		double var2 = 1.5707963267948966D - Math.acos((double) var1.field4311);
		var1.method6486();
		return (float) var2;
	}

	@ObfuscatedName("uh.n(Lov;I)I")
	public static int method9198(class421 arg0) {
		class423 var1 = class423.method6483(0.0F, 0.0F, 1.0F);
		var1.method6526(arg0);
		double var2 = 1.5707963267948966D - Math.acos((double) var1.field4311);
		var1.method6486();
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (var2 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@ObfuscatedName("vb.m(FFI)F")
	public static float method9272(float arg0, float arg1) {
		double var2 = Math.atan2((double) arg0, (double) arg1);
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) var2;
	}

	@ObfuscatedName("ib.k(Lov;I)F")
	public static float method4498(class421 arg0) {
		class423 var1 = class423.method6483(0.0F, 0.0F, 1.0F);
		var1.method6526(arg0);
		double var2 = Math.atan2((double) var1.field4308, (double) var1.field4313);
		var1.method6486();
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) var2;
	}

	@ObfuscatedName("dn.f(Lov;I)I")
	public static int method2041(class421 arg0) {
		class423 var1 = class423.method6483(0.0F, 0.0F, 1.0F);
		var1.method6526(arg0);
		double var2 = Math.atan2((double) var1.field4308, (double) var1.field4313);
		var1.method6486();
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (var2 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}
}
