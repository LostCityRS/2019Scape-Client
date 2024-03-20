package com.jagex.graphics.camera;

import com.jagex.math.Quaternion;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("vx")
public class CameraMode2 {

	public CameraMode2() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sk.e(FLox;Lov;Lox;Lox;Lox;Lox;FFFFB)V")
	public static void method8144(float arg0, Vector3 arg1, Quaternion arg2, Vector3 arg3, Vector3 arg4, Vector3 arg5, Vector3 arg6, float arg7, float arg8, float arg9, float arg10) {
		if (arg3.isEqualTo(arg1)) {
			return;
		}
		Vector3 var11 = Vector3.create(0.0F, 0.0F, 0.0F);
		Vector3 var12 = Vector3.create(Vector3.sub(arg3, arg1));
		var12.rotate(arg2);
		Vector3 var13 = Vector3.sub(var12, var11);
		float var14 = var13.length();
		if (arg7 > 0.0F) {
			arg5 = Vector3.create(arg5);
			arg5.multiply(var14 / arg7 * arg8);
		}
		if (arg5.x == Float.POSITIVE_INFINITY || Float.isNaN(arg1.x) || var14 > arg9 || var14 < arg10) {
			arg1.setTo(arg3);
			arg4.reset();
			return;
		}
		arg2.opposite();
		Vector3 var15 = Vector3.create(1.0F, 0.0F, 0.0F);
		Vector3 var16 = Vector3.create(0.0F, 1.0F, 0.0F);
		Vector3 var17 = Vector3.create(0.0F, 0.0F, 1.0F);
		var15.rotate(arg2);
		var16.rotate(arg2);
		var17.rotate(arg2);
		Vector3 var18 = Vector3.create(Vector3.dot(var15, arg4), Vector3.dot(var16, arg4), Vector3.dot(var17, arg4));
		Vector3 var19 = Vector3.create(var18);
		var19.abs();
		Vector3 var20 = Vector3.divide(Vector3.multiply(var19, var19), Vector3.multiply(arg5, 2.0F));
		Vector3 var21 = Vector3.create(var13);
		var21.abs();
		Vector3 var22 = Vector3.create(var18);
		if (var20.x > var21.x) {
			if (var13.x < 0.0F) {
				var22.x += arg5.x * arg0;
				if (var22.x > 0.0F) {
					var22.x = 0.0F;
				}
			} else {
				var22.x -= arg5.x * arg0;
				if (var22.x < 0.0F) {
					var22.x = 0.0F;
				}
			}
		} else if (var19.x < arg6.x) {
			if (var13.x < 0.0F) {
				var22.x -= arg5.x * arg0;
				if (var22.x < -arg6.x) {
					var22.x = -arg6.x;
				}
			} else {
				var22.x += arg5.x * arg0;
				if (var22.x > arg6.x) {
					var22.x = arg6.x;
				}
			}
		}
		if (var20.y > var21.y) {
			if (var13.y < 0.0F) {
				var22.y += arg5.y * arg0;
				if (var22.y > 0.0F) {
					var22.y = 0.0F;
				}
			} else {
				var22.y -= arg5.y * arg0;
				if (var22.y < 0.0F) {
					var22.y = 0.0F;
				}
			}
		} else if (var19.y < arg6.y) {
			if (var13.y < 0.0F) {
				var22.y -= arg5.y * arg0;
				if (var22.y < -arg6.y) {
					var22.y = -arg6.y;
				}
			} else {
				var22.y += arg5.y * arg0;
				if (var22.y > arg6.y) {
					var22.y = arg6.y;
				}
			}
		}
		if (var20.z > var21.z) {
			if (var13.z < 0.0F) {
				var22.z += arg5.z * arg0;
				if (var22.z > 0.0F) {
					var22.z = 0.0F;
				}
			} else {
				var22.z -= arg5.z * arg0;
				if (var22.z < 0.0F) {
					var22.z = 0.0F;
				}
			}
		} else if (var19.z < arg6.z) {
			if (var13.z < 0.0F) {
				var22.z -= arg5.z * arg0;
				if (var22.z < -arg6.z) {
					var22.z = -arg6.z;
				}
			} else {
				var22.z += arg5.z * arg0;
				if (var22.z > arg6.z) {
					var22.z = arg6.z;
				}
			}
		}
		Vector3 var23 = Vector3.multiply(var15, var22.x);
		var23.addScaled(var16, var22.y);
		var23.addScaled(var17, var22.z);
		arg4.method6562(var23, 0.8F);
		arg1.add(Vector3.multiply(arg4, arg0));
		var19.release();
		var22.release();
		var21.release();
	}
}
