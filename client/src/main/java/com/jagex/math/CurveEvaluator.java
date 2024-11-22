package com.jagex.math;

import com.jagex.graphics.KeyFrame;
import com.jagex.graphics.TransformInfinityType;
import deob.ObfuscatedName;

@ObfuscatedName("da")
public class CurveEvaluator {

	@ObfuscatedName("da.k")
	public static final float EPSILON = Math.ulp(1.0F);

	@ObfuscatedName("da.f")
	public static final float DOUBLE_EPSILON = EPSILON * 2.0F;

	public CurveEvaluator() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ub.e(Ldn;FI)F")
	public static float evaluate(Curve curve, float time) {
		if (curve == null || curve.getKeyframeCount() == 0) {
			return 0.0F;
		} else if (time < (float) curve.keyframes[0].time) {
			return TransformInfinityType.CONSTANT == curve.preInfinityType ? curve.keyframes[0].value : evaluateInfinity(curve, time, true);
		} else if (time > (float) curve.keyframes[curve.getKeyframeCount() - 1].time) {
			return TransformInfinityType.CONSTANT == curve.postInfinityType ? curve.keyframes[curve.getKeyframeCount() - 1].value : evaluateInfinity(curve, time, false);
		} else if (curve.field1444) {
			return curve.keyframes[0].value;
		} else {
			KeyFrame keyframe = curve.getKeyframeByTime(time);
			boolean var3 = false;
			boolean var4 = false;
			if (keyframe == null) {
				return 0.0F;
			}
			if ((double) keyframe.tanOutX == 0.0D && (double) keyframe.tanOutY == 0.0D) {
				var3 = true;
			} else if (keyframe.tanOutX == Float.MAX_VALUE && keyframe.tanOutY == Float.MAX_VALUE) {
				var4 = true;
			} else if (keyframe.next == null) {
				var3 = true;
			} else if (curve.field1445) {
				float[] var5 = new float[4];
				float[] var6 = new float[4];
				var5[0] = keyframe.time;
				var6[0] = keyframe.value;
				var5[1] = keyframe.tanOutX * 0.33333334F + var5[0];
				var6[1] = keyframe.tanOutY * 0.33333334F + var6[0];
				var5[3] = keyframe.next.time;
				var6[3] = keyframe.next.value;
				var5[2] = var5[3] - keyframe.next.tanInX * 0.33333334F;
				var6[2] = var6[3] - keyframe.next.tanInY * 0.33333334F;
				if (curve.useBezierInterpolation) {
					method14845(curve, var5, var6);
				} else {
					method16639(curve, var5, var6);
				}
				curve.field1445 = false;
			}
			if (var3) {
				return keyframe.value;
			} else if (var4) {
				return (float) keyframe.time == time || keyframe.next == null ? keyframe.value : keyframe.next.value;
			} else if (curve.useBezierInterpolation) {
				return method13878(curve, time);
			} else {
				return hermite(curve, time);
			}
		}
	}

	@ObfuscatedName("zt.n(Ldn;FI)F")
	public static float method13878(Curve curve, float time) {
		if (curve == null) {
			return 0.0F;
		}
		float s;
		if (curve.field1441 == time) {
			s = 0.0F;
		} else if (curve.field1443 == time) {
			s = 1.0F;
		} else {
			s = (time - curve.field1441) / (curve.field1443 - curve.field1441);
		}
		float t;
		if (curve.field1440) {
			t = s;
		} else {
			float[] poly = new float[] { curve.field1449[0] - s, curve.field1449[1], curve.field1449[2], curve.field1449[3] };
			float[] roots = new float[5];
			int numRoots = Polynomial.polyZeroes(poly, 3, 0.0F, true, 1.0F, true, roots);
			if (numRoots == 1) {
				t = roots[0];
			} else {
				t = 0.0F;
			}
		}
		return ((curve.field1442[3] * t + curve.field1442[2]) * t + curve.field1442[1]) * t + curve.field1442[0];
	}

	@ObfuscatedName("km.m(Ldn;FI)F")
	public static float hermite(Curve curve, float time) {
		if (curve == null) {
			return 0.0F;
		} else {
			float var2 = time - curve.field1441;
			return ((curve.field1449[0] * var2 + curve.field1449[1]) * var2 + curve.field1449[2]) * var2 + curve.field1449[3];
		}
	}

	@ObfuscatedName("qo.k(Ldn;FZI)F")
	public static float evaluateInfinity(Curve curve, float time, boolean preInfinity) {
		float var3 = 0.0F;
		if (curve == null || curve.getKeyframeCount() == 0) {
			return var3;
		}
		float firstKeyframeTime = (float) curve.keyframes[0].time;
		float lastKeyframeTime = (float) curve.keyframes[curve.getKeyframeCount() - 1].time;
		float range = lastKeyframeTime - firstKeyframeTime;
		if ((double) range == 0.0D) {
			return curve.keyframes[0].value;
		}
		float var7 = 0.0F;
		float var8;
		if (time > lastKeyframeTime) {
			var8 = (time - lastKeyframeTime) / range;
		} else {
			var8 = (time - firstKeyframeTime) / range;
		}
		double var9 = (double) var8;
		float var11 = Math.abs((float) ((double) var8 - var9));
		float var12 = range * var11;
		double var13 = Math.abs(var9 + 1.0D);
		double var15 = var13 / 2.0D;
		double var17 = (double) var15;
		float var19 = (float) (var15 - var17);
		if (preInfinity) {
			if (TransformInfinityType.OSCILLATE == curve.preInfinityType) {
				if ((double) var19 == 0.0D) {
					var12 = lastKeyframeTime - var12;
				} else {
					var12 += firstKeyframeTime;
				}
			} else if (TransformInfinityType.CYCLE == curve.preInfinityType || TransformInfinityType.CYCLE_RELATIVE == curve.preInfinityType) {
				var12 = lastKeyframeTime - var12;
			} else if (TransformInfinityType.LINEAR == curve.preInfinityType) {
				float var20 = firstKeyframeTime - time;
				float var21 = curve.keyframes[0].tanInX;
				float var22 = curve.keyframes[0].tanInY;
				float var23 = curve.keyframes[0].value;
				if ((double) var21 != 0.0D) {
					var23 -= var20 * var22 / var21;
				}
				return var23;
			}
		} else if (TransformInfinityType.OSCILLATE == curve.postInfinityType) {
			if ((double) var19 == 0.0D) {
				var12 += firstKeyframeTime;
			} else {
				var12 = lastKeyframeTime - var12;
			}
		} else if (TransformInfinityType.CYCLE == curve.postInfinityType || TransformInfinityType.CYCLE_RELATIVE == curve.postInfinityType) {
			var12 += firstKeyframeTime;
		} else if (TransformInfinityType.LINEAR == curve.postInfinityType) {
			float var24 = time - lastKeyframeTime;
			float var25 = curve.keyframes[curve.getKeyframeCount() - 1].tanOutX;
			float var26 = curve.keyframes[curve.getKeyframeCount() - 1].tanOutY;
			float var27 = curve.keyframes[curve.getKeyframeCount() - 1].value;
			if ((double) var25 != 0.0D) {
				var27 += var24 * var26 / var25;
			}
			return var27;
		}
		float var28 = evaluate(curve, var12);
		if (preInfinity && TransformInfinityType.CYCLE_RELATIVE == curve.preInfinityType) {
			float var29 = curve.keyframes[curve.getKeyframeCount() - 1].value - curve.keyframes[0].value;
			var28 = (float) ((double) var28 - (double) var29 * var13);
		} else if (!preInfinity && TransformInfinityType.CYCLE_RELATIVE == curve.postInfinityType) {
			float var30 = curve.keyframes[curve.getKeyframeCount() - 1].value - curve.keyframes[0].value;
			var28 = (float) ((double) var30 * var13 + (double) var28);
		}
		return var28;
	}

	@ObfuscatedName("abp.f(Ldn;[F[FB)V")
	public static void method14845(Curve arg0, float[] arg1, float[] arg2) {
		if (arg0 == null) {
			return;
		}
		float var3 = arg1[3] - arg1[0];
		if ((double) var3 == 0.0D) {
			return;
		}
		float var4 = arg1[1] - arg1[0];
		float var5 = arg1[2] - arg1[0];
		Float var6 = var4 / var3;
		Float var7 = var5 / var3;
		arg0.field1440 = var6 == 0.33333334F && var7 == 0.6666667F;
		float var8 = var6;
		float var9 = var7;
		if ((double) var6 < 0.0D) {
			var6 = 0.0F;
		}
		if ((double) var7 > 1.0D) {
			var7 = 1.0F;
		}
		if ((double) var6 > 1.0D || var7 < -1.0F) {
			method4627(var6, var7);
		}
		if (var6 != var8) {
			arg1[1] = arg1[0] + var6 * var3;
			if ((double) var8 != 0.0D) {
				arg2[1] = arg2[0] + (arg2[1] - arg2[0]) * var6 / var8;
			}
		}
		if (var7 != var9) {
			arg1[2] = arg1[0] + var7 * var3;
			if ((double) var9 != 1.0D) {
				arg2[2] = (float) ((double) arg2[3] - (double) (arg2[3] - arg2[2]) * (1.0D - (double) var7) / (1.0D - (double) var9));
			}
		}
		arg0.field1441 = arg1[0];
		arg0.field1443 = arg1[3];
		method10358(0.0F, var6, var7, 1.0F, arg0.field1449);
		method10358(arg2[0], arg2[1], arg2[2], arg2[3], arg0.field1442);
	}

	@ObfuscatedName("ahr.w(Ldn;[F[FI)V")
	public static void method16639(Curve arg0, float[] arg1, float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.field1441 = arg1[0];
		float var3 = arg1[3] - arg1[0];
		float var4 = arg2[3] - arg2[0];
		float var5 = arg1[1] - arg1[0];
		float var6 = 0.0F;
		float var7 = 0.0F;
		if ((double) var5 != 0.0D) {
			var6 = (arg2[1] - arg2[0]) / var5;
		}
		float var8 = arg1[3] - arg1[2];
		if ((double) var8 != 0.0D) {
			var7 = (arg2[3] - arg2[2]) / var8;
		}
		float var9 = 1.0F / (var3 * var3);
		float var10 = var3 * var6;
		float var11 = var3 * var7;
		arg0.field1449[0] = (var10 + var11 - var4 - var4) * var9 / var3;
		arg0.field1449[1] = (var4 + var4 + var4 - var10 - var10 - var11) * var9;
		arg0.field1449[2] = var6;
		arg0.field1449[3] = arg2[0];
	}

	@ObfuscatedName("eo.l(Ljava/lang/Float;Ljava/lang/Float;I)V")
	public static void method2672(Float arg0, Float arg1) {
		if (arg0 + EPSILON >= 1.3333334F) {
			Float var9 = 1.3333334F - EPSILON;
			Float var10 = 0.33333334F - EPSILON;
			return;
		}
		float var2 = arg0 - 2.0F;
		float var3 = arg0 - 1.0F;
		float var4 = (float) Math.sqrt((double) (var2 * var2 - var3 * 4.0F * var3));
		float var5 = (-var2 + var4) * 0.5F;
		if (arg1 + EPSILON > var5) {
			Float var6 = var5 - EPSILON;
		} else {
			float var7 = (-var2 - var4) * 0.5F;
			if (arg1 < EPSILON + var7) {
				Float var8 = EPSILON + var7;
			}
		}
	}

	@ObfuscatedName("im.u(Ljava/lang/Float;Ljava/lang/Float;B)V")
	public static void method4627(Float arg0, Float arg1) {
		Float var2 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (var2 < 0.0F) {
			var2 = 0.0F;
		}
		if (arg0 > 1.0F || var2 > 1.0F) {
			float var3 = (float) ((double) (arg0 * (arg0 - 2.0F + var2)) + (double) var2 * ((double) var2 - 2.0D) + 1.0D);
			if (EPSILON + var3 > 0.0F) {
				method2672(arg0, var2);
			}
		}
		Float var4 = 1.0F - var2;
	}

	@ObfuscatedName("xt.z(FFFF[FI)V")
	public static void method10358(float arg0, float arg1, float arg2, float arg3, float[] arg4) {
		float var5 = arg1 - arg0;
		float var6 = arg2 - arg1;
		float var7 = arg3 - arg2;
		float var8 = var6 - var5;
		arg4[3] = var7 - var6 - var8;
		arg4[2] = var8 + var8 + var8;
		arg4[1] = var5 + var5 + var5;
		arg4[0] = arg0;
	}
}
