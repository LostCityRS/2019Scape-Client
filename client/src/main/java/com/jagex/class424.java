package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pt")
public class class424 {

	public class424() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pt.e(Lox;Lox;Lox;F[Lox;)V")
	public static void method6592(class423 arg0, class423 arg1, class423 arg2, float arg3, class423[] arg4) {
		class423 var5 = class423.method6528(arg0, arg2);
		float var6 = class423.method6503(var5, var5) - arg3 * arg3;
		float var7 = class423.method6503(arg1, var5);
		float var8 = var7 * var7 - var6;
		if (var8 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (var8 >= 9.765625E-4F) {
			float var10 = (float) Math.sqrt((double) var8);
			arg4[0] = class423.method6482();
			arg4[0].method6492(arg0);
			arg4[0].method6497(class423.method6512(class423.method6484(arg1), -var7 - var10));
			arg4[1] = class423.method6482();
			arg4[1].method6492(arg0);
			arg4[1].method6497(class423.method6512(class423.method6484(arg1), -var7 + var10));
		} else {
			arg4[0] = class423.method6482();
			arg4[0].method6492(arg0);
			arg4[0].method6497(class423.method6512(class423.method6484(arg1), -var7));
			arg4[1] = null;
		}
	}
}
