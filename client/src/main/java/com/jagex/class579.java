package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ue")
public class class579 {

	public class579() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aca.e(FLox;Lov;Lox;Lox;Lox;FFFI)V")
	public static void method14933(float arg0, class423 arg1, class421 arg2, class423 arg3, class423 arg4, class423 arg5, float arg6, float arg7, float arg8) {
		if (arg3.method6488(arg1)) {
			return;
		}
		class423 var9 = class423.method6483(0.0F, 0.0F, 0.0F);
		class423 var10 = class423.method6484(class423.method6528(arg3, arg1));
		var10.method6526(arg2);
		class423 var11 = class423.method6528(var10, var9);
		float var12 = var11.method6519();
		if (arg5.field4308 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.field4308) || var12 > arg7 || var12 < arg8) {
			arg1.method6492(arg3);
			arg4.method6493();
			return;
		}
		arg2.method6418();
		class423 var13 = class423.method6483(1.0F, 0.0F, 0.0F);
		class423 var14 = class423.method6483(0.0F, 1.0F, 0.0F);
		class423 var15 = class423.method6483(0.0F, 0.0F, 1.0F);
		var13.method6526(arg2);
		var14.method6526(arg2);
		var15.method6526(arg2);
		class423 var16 = class423.method6483(class423.method6503(var13, arg4), class423.method6503(var14, arg4), class423.method6503(var15, arg4));
		class423 var17 = class423.method6484(var16);
		class423 var18 = class423.method6483(arg5.field4308 * var11.field4308, arg5.field4311 * var11.field4311, arg5.field4313 * var11.field4313);
		var17.method6570(var18, arg0);
		var17.method6511(arg6);
		class423 var19 = class423.method6512(var13, var17.field4308);
		var19.method6570(var14, var17.field4311);
		var19.method6570(var15, var17.field4313);
		arg4.method6492(var19);
		arg1.method6497(class423.method6512(arg4, arg0));
	}
}
