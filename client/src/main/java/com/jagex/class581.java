package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vx")
public class class581 {

	public class581() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sk.e(FLox;Lov;Lox;Lox;Lox;Lox;FFFFB)V")
	public static void method8144(float arg0, Vector3 arg1, Quaternion arg2, Vector3 arg3, Vector3 arg4, Vector3 arg5, Vector3 arg6, float arg7, float arg8, float arg9, float arg10) {
		if (arg3.method6488(arg1)) {
			return;
		}
		Vector3 var11 = Vector3.method6483(0.0F, 0.0F, 0.0F);
		Vector3 var12 = Vector3.method6484(Vector3.method6528(arg3, arg1));
		var12.method6526(arg2);
		Vector3 var13 = Vector3.method6528(var12, var11);
		float var14 = var13.method6519();
		if (arg7 > 0.0F) {
			arg5 = Vector3.method6484(arg5);
			arg5.method6496(var14 / arg7 * arg8);
		}
		if (arg5.field4308 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.field4308) || var14 > arg9 || var14 < arg10) {
			arg1.method6492(arg3);
			arg4.method6493();
			return;
		}
		arg2.method6418();
		Vector3 var15 = Vector3.method6483(1.0F, 0.0F, 0.0F);
		Vector3 var16 = Vector3.method6483(0.0F, 1.0F, 0.0F);
		Vector3 var17 = Vector3.method6483(0.0F, 0.0F, 1.0F);
		var15.method6526(arg2);
		var16.method6526(arg2);
		var17.method6526(arg2);
		Vector3 var18 = Vector3.method6483(Vector3.method6503(var15, arg4), Vector3.method6503(var16, arg4), Vector3.method6503(var17, arg4));
		Vector3 var19 = Vector3.method6484(var18);
		var19.method6577();
		Vector3 var20 = Vector3.method6510(Vector3.method6557(var19, var19), Vector3.method6512(arg5, 2.0F));
		Vector3 var21 = Vector3.method6484(var13);
		var21.method6577();
		Vector3 var22 = Vector3.method6484(var18);
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
		Vector3 var23 = Vector3.method6512(var15, var22.field4308);
		var23.method6570(var16, var22.field4311);
		var23.method6570(var17, var22.field4313);
		arg4.method6562(var23, 0.8F);
		arg1.method6497(Vector3.method6512(arg4, arg0));
		var19.method6486();
		var22.method6486();
		var21.method6486();
	}
}
