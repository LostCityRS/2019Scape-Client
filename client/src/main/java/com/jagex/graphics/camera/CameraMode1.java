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
		if (arg2.isEqualTo(arg1)) {
			return;
		}
		Vector3 var10 = Vector3.sub(arg2, arg1);
		float var11 = var10.length();
		if (arg6 > 0.0F) {
			arg4 = Vector3.create(arg4);
			arg4.multiply(var11 / arg6 * arg7);
		}
		if (arg4.x == Float.POSITIVE_INFINITY || Float.isNaN(arg1.x) || var11 > arg8) {
			arg1.setTo(arg2);
			arg3.reset();
			return;
		}
		Vector3 var12 = Vector3.create(arg3);
		var12.abs();
		Vector3 var13 = Vector3.divide(var12, arg4);
		Vector3 var14 = Vector3.multiply(var12, var13);
		var14.multiply(0.5F);
		Vector3 var15 = Vector3.create(arg3);
		Vector3 var16 = Vector3.create(var10);
		var16.abs();
		if (var14.x > var16.x) {
			if (var10.x < 0.0F) {
				var15.x += arg4.x * arg0;
				if (var15.x > 0.0F) {
					var15.x = 0.0F;
				}
			} else {
				var15.x -= arg4.x * arg0;
				if (var15.x < 0.0F) {
					var15.x = 0.0F;
				}
			}
		} else if (var12.x < arg5.x) {
			if (var10.x < 0.0F) {
				var15.x -= arg4.x * arg0;
				if (var15.x < -arg5.x) {
					var15.x = -arg5.x;
				}
			} else {
				var15.x += arg4.x * arg0;
				if (var15.x > arg5.x) {
					var15.x = arg5.x;
				}
			}
		}
		if (var14.y > var16.y) {
			if (var10.y < 0.0F) {
				var15.y += arg4.y * arg0;
				if (var15.y > 0.0F) {
					var15.y = 0.0F;
				}
			} else {
				var15.y -= arg4.y * arg0;
				if (var15.y < 0.0F) {
					var15.y = 0.0F;
				}
			}
		} else if (var12.y < arg5.y) {
			if (var10.y < 0.0F) {
				var15.y -= arg4.y * arg0;
				if (var15.y < -arg5.y) {
					var15.y = -arg5.y;
				}
			} else {
				var15.y += arg4.y * arg0;
				if (var15.y > arg5.y) {
					var15.y = arg5.y;
				}
			}
		}
		if (var14.z > var16.z) {
			if (var10.z < 0.0F) {
				var15.z += arg4.z * arg0;
				if (var15.z > 0.0F) {
					var15.z = 0.0F;
				}
			} else {
				var15.z -= arg4.z * arg0;
				if (var15.z < 0.0F) {
					var15.z = 0.0F;
				}
			}
		} else if (var12.z < arg5.z) {
			if (var10.z < 0.0F) {
				var15.z -= arg4.z * arg0;
				if (var15.z < -arg5.z) {
					var15.z = -arg5.z;
				}
			} else {
				var15.z += arg4.z * arg0;
				if (var15.z > arg5.z) {
					var15.z = arg5.z;
				}
			}
		}
		arg3.method6562(var15, 0.8F);
		if (var11 < arg9 && arg3.length() < arg9) {
			arg1.setTo(arg2);
			arg3.reset();
		} else {
			arg1.add(Vector3.multiply(arg3, arg0));
		}
		var12.release();
		var15.release();
		var16.release();
	}
}
