package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vx")
public class class581 {

	public class581() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sk.e(FLox;Lov;Lox;Lox;Lox;Lox;FFFFB)V")
	public static void method8144(float arg0, class423 arg1, class421 arg2, class423 arg3, class423 arg4, class423 arg5, class423 arg6, float arg7, float arg8, float arg9, float arg10) {
		if (arg3.method6488(arg1)) {
			return;
		}
		class423 var11 = class423.method6483(0.0F, 0.0F, 0.0F);
		class423 var12 = class423.method6484(class423.method6528(arg3, arg1));
		var12.method6526(arg2);
		class423 var13 = class423.method6528(var12, var11);
		float var14 = var13.method6519();
		if (arg7 > 0.0F) {
			arg5 = class423.method6484(arg5);
			arg5.method6496(var14 / arg7 * arg8);
		}
		if (arg5.field4308 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.field4308) || var14 > arg9 || var14 < arg10) {
			arg1.method6492(arg3);
			arg4.method6493();
			return;
		}
		arg2.method6418();
		class423 var15 = class423.method6483(1.0F, 0.0F, 0.0F);
		class423 var16 = class423.method6483(0.0F, 1.0F, 0.0F);
		class423 var17 = class423.method6483(0.0F, 0.0F, 1.0F);
		var15.method6526(arg2);
		var16.method6526(arg2);
		var17.method6526(arg2);
		class423 var18 = class423.method6483(class423.method6503(var15, arg4), class423.method6503(var16, arg4), class423.method6503(var17, arg4));
		class423 var19 = class423.method6484(var18);
		var19.method6577();
		class423 var20 = class423.method6510(class423.method6557(var19, var19), class423.method6512(arg5, 2.0F));
		class423 var21 = class423.method6484(var13);
		var21.method6577();
		class423 var22 = class423.method6484(var18);
		if (var20.field4308 > var21.field4308) {
			if (var13.field4308 < 0.0F) {
				var22.field4308 += arg5.field4308 * arg0;
				if (var22.field4308 > 0.0F) {
					var22.field4308 = 0.0F;
				}
			} else {
				var22.field4308 -= arg5.field4308 * arg0;
				if (var22.field4308 < 0.0F) {
					var22.field4308 = 0.0F;
				}
			}
		} else if (var19.field4308 < arg6.field4308) {
			if (var13.field4308 < 0.0F) {
				var22.field4308 -= arg5.field4308 * arg0;
				if (var22.field4308 < -arg6.field4308) {
					var22.field4308 = -arg6.field4308;
				}
			} else {
				var22.field4308 += arg5.field4308 * arg0;
				if (var22.field4308 > arg6.field4308) {
					var22.field4308 = arg6.field4308;
				}
			}
		}
		if (var20.field4311 > var21.field4311) {
			if (var13.field4311 < 0.0F) {
				var22.field4311 += arg5.field4311 * arg0;
				if (var22.field4311 > 0.0F) {
					var22.field4311 = 0.0F;
				}
			} else {
				var22.field4311 -= arg5.field4311 * arg0;
				if (var22.field4311 < 0.0F) {
					var22.field4311 = 0.0F;
				}
			}
		} else if (var19.field4311 < arg6.field4311) {
			if (var13.field4311 < 0.0F) {
				var22.field4311 -= arg5.field4311 * arg0;
				if (var22.field4311 < -arg6.field4311) {
					var22.field4311 = -arg6.field4311;
				}
			} else {
				var22.field4311 += arg5.field4311 * arg0;
				if (var22.field4311 > arg6.field4311) {
					var22.field4311 = arg6.field4311;
				}
			}
		}
		if (var20.field4313 > var21.field4313) {
			if (var13.field4313 < 0.0F) {
				var22.field4313 += arg5.field4313 * arg0;
				if (var22.field4313 > 0.0F) {
					var22.field4313 = 0.0F;
				}
			} else {
				var22.field4313 -= arg5.field4313 * arg0;
				if (var22.field4313 < 0.0F) {
					var22.field4313 = 0.0F;
				}
			}
		} else if (var19.field4313 < arg6.field4313) {
			if (var13.field4313 < 0.0F) {
				var22.field4313 -= arg5.field4313 * arg0;
				if (var22.field4313 < -arg6.field4313) {
					var22.field4313 = -arg6.field4313;
				}
			} else {
				var22.field4313 += arg5.field4313 * arg0;
				if (var22.field4313 > arg6.field4313) {
					var22.field4313 = arg6.field4313;
				}
			}
		}
		class423 var23 = class423.method6512(var15, var22.field4308);
		var23.method6570(var16, var22.field4311);
		var23.method6570(var17, var22.field4313);
		arg4.method6562(var23, 0.8F);
		arg1.method6497(class423.method6512(arg4, arg0));
		var19.method6486();
		var22.method6486();
		var21.method6486();
	}
}
