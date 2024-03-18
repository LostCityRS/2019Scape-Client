package com.jagex.graphics.camera;

import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("vq")
public class CameraMode1 {

	public CameraMode1() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kh.e(FLox;Lox;Lox;Lox;Lox;FFFFI)V")
	public static void method5205(float arg0, Vector3 arg1, Vector3 arg2, Vector3 arg3, Vector3 arg4, Vector3 arg5, float arg6, float arg7, float arg8, float arg9) {
		if (arg2.method6488(arg1)) {
			return;
		}
		Vector3 var10 = Vector3.method6528(arg2, arg1);
		float var11 = var10.method6519();
		if (arg6 > 0.0F) {
			arg4 = Vector3.method6484(arg4);
			arg4.method6496(var11 / arg6 * arg7);
		}
		if (arg4.field4308 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.field4308) || var11 > arg8) {
			arg1.setTo(arg2);
			arg3.method6493();
			return;
		}
		Vector3 var12 = Vector3.method6484(arg3);
		var12.method6577();
		Vector3 var13 = Vector3.method6510(var12, arg4);
		Vector3 var14 = Vector3.method6557(var12, var13);
		var14.method6496(0.5F);
		Vector3 var15 = Vector3.method6484(arg3);
		Vector3 var16 = Vector3.method6484(var10);
		var16.method6577();
		if (var14.field4308 > var16.field4308) {
			if (var10.field4308 < 0.0F) {
				var15.field4308 += arg4.field4308 * arg0;
				if (var15.field4308 > 0.0F) {
					var15.field4308 = 0.0F;
				}
			} else {
				var15.field4308 -= arg4.field4308 * arg0;
				if (var15.field4308 < 0.0F) {
					var15.field4308 = 0.0F;
				}
			}
		} else if (var12.field4308 < arg5.field4308) {
			if (var10.field4308 < 0.0F) {
				var15.field4308 -= arg4.field4308 * arg0;
				if (var15.field4308 < -arg5.field4308) {
					var15.field4308 = -arg5.field4308;
				}
			} else {
				var15.field4308 += arg4.field4308 * arg0;
				if (var15.field4308 > arg5.field4308) {
					var15.field4308 = arg5.field4308;
				}
			}
		}
		if (var14.field4311 > var16.field4311) {
			if (var10.field4311 < 0.0F) {
				var15.field4311 += arg4.field4311 * arg0;
				if (var15.field4311 > 0.0F) {
					var15.field4311 = 0.0F;
				}
			} else {
				var15.field4311 -= arg4.field4311 * arg0;
				if (var15.field4311 < 0.0F) {
					var15.field4311 = 0.0F;
				}
			}
		} else if (var12.field4311 < arg5.field4311) {
			if (var10.field4311 < 0.0F) {
				var15.field4311 -= arg4.field4311 * arg0;
				if (var15.field4311 < -arg5.field4311) {
					var15.field4311 = -arg5.field4311;
				}
			} else {
				var15.field4311 += arg4.field4311 * arg0;
				if (var15.field4311 > arg5.field4311) {
					var15.field4311 = arg5.field4311;
				}
			}
		}
		if (var14.field4313 > var16.field4313) {
			if (var10.field4313 < 0.0F) {
				var15.field4313 += arg4.field4313 * arg0;
				if (var15.field4313 > 0.0F) {
					var15.field4313 = 0.0F;
				}
			} else {
				var15.field4313 -= arg4.field4313 * arg0;
				if (var15.field4313 < 0.0F) {
					var15.field4313 = 0.0F;
				}
			}
		} else if (var12.field4313 < arg5.field4313) {
			if (var10.field4313 < 0.0F) {
				var15.field4313 -= arg4.field4313 * arg0;
				if (var15.field4313 < -arg5.field4313) {
					var15.field4313 = -arg5.field4313;
				}
			} else {
				var15.field4313 += arg4.field4313 * arg0;
				if (var15.field4313 > arg5.field4313) {
					var15.field4313 = arg5.field4313;
				}
			}
		}
		arg3.method6562(var15, 0.8F);
		if (var11 < arg9 && arg3.method6519() < arg9) {
			arg1.setTo(arg2);
			arg3.method6493();
		} else {
			arg1.method6497(Vector3.method6512(arg3, arg0));
		}
		var12.method6486();
		var15.method6486();
		var16.method6486();
	}
}
