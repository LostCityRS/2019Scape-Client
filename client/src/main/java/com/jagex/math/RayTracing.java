package com.jagex.math;

import deob.ObfuscatedName;

@ObfuscatedName("pt")
public class RayTracing {

	public RayTracing() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pt.e(Lox;Lox;Lox;F[Lox;)V")
	public static void method6592(Vector3 arg0, Vector3 arg1, Vector3 arg2, float arg3, Vector3[] arg4) {
		Vector3 var5 = Vector3.method6528(arg0, arg2);
		float var6 = Vector3.method6503(var5, var5) - arg3 * arg3;
		float var7 = Vector3.method6503(arg1, var5);
		float var8 = var7 * var7 - var6;
		if (var8 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (var8 >= 9.765625E-4F) {
			float var10 = (float) Math.sqrt((double) var8);
			arg4[0] = Vector3.method6482();
			arg4[0].setTo(arg0);
			arg4[0].method6497(Vector3.method6512(Vector3.method6484(arg1), -var7 - var10));
			arg4[1] = Vector3.method6482();
			arg4[1].setTo(arg0);
			arg4[1].method6497(Vector3.method6512(Vector3.method6484(arg1), -var7 + var10));
		} else {
			arg4[0] = Vector3.method6482();
			arg4[0].setTo(arg0);
			arg4[0].method6497(Vector3.method6512(Vector3.method6484(arg1), -var7));
			arg4[1] = null;
		}
	}
}
