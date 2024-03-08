package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("oj")
public class class416 {

	@ObfuscatedName("oj.e")
	public float field4252;

	@ObfuscatedName("oj.n")
	public float field4253;

	@ObfuscatedName("oj.m")
	public float field4248;

	@ObfuscatedName("oj.k")
	public float field4249;

	@ObfuscatedName("oj.f")
	public float field4250;

	@ObfuscatedName("oj.w")
	public float field4251;

	@ObfuscatedName("oj.l")
	public static final float[] field4247 = new float[8];

	@ObfuscatedName("oj.u")
	public static final float[] field4246 = new float[8];

	@ObfuscatedName("oj.z")
	public static final float[] field4254 = new float[8];

	@ObfuscatedName("oj.e(IIIILpq;FFFF)Z")
	public boolean method6275(int arg0, int arg1, int arg2, int arg3, class426 arg4, float arg5, float arg6, float arg7, float arg8) {
		boolean var10 = false;
		float var11 = Float.MAX_VALUE;
		float var12 = -3.4028235E38F;
		float var13 = Float.MAX_VALUE;
		float var14 = -3.4028235E38F;
		field4247[0] = this.field4252;
		field4246[0] = this.field4253;
		field4254[0] = this.field4248;
		field4247[1] = this.field4249;
		field4246[1] = this.field4253;
		field4254[1] = this.field4248;
		field4247[2] = this.field4252;
		field4246[2] = this.field4250;
		field4254[2] = this.field4248;
		field4247[3] = this.field4249;
		field4246[3] = this.field4250;
		field4254[3] = this.field4248;
		field4247[4] = this.field4252;
		field4246[4] = this.field4253;
		field4254[4] = this.field4251;
		field4247[5] = this.field4249;
		field4246[5] = this.field4253;
		field4254[5] = this.field4251;
		field4247[6] = this.field4252;
		field4246[6] = this.field4250;
		field4254[6] = this.field4251;
		field4247[7] = this.field4249;
		field4246[7] = this.field4250;
		field4254[7] = this.field4251;
		for (int var15 = 0; var15 < 8; var15++) {
			float var16 = field4247[var15];
			float var17 = field4246[var15];
			float var18 = field4254[var15];
			float var19 = arg4.field4315[10] * var18 + arg4.field4315[2] * var16 + arg4.field4315[6] * var17 + arg4.field4315[14];
			float var20 = arg4.field4315[11] * var18 + arg4.field4315[3] * var16 + arg4.field4315[7] * var17 + arg4.field4315[15];
			if (var19 >= -var20) {
				float var21 = arg4.field4315[8] * var18 + arg4.field4315[0] * var16 + arg4.field4315[4] * var17 + arg4.field4315[12];
				float var22 = arg4.field4315[9] * var18 + arg4.field4315[1] * var16 + arg4.field4315[5] * var17 + arg4.field4315[13];
				float var23 = arg7 * var21 / var20 + arg5;
				float var24 = arg8 * var22 / var20 + arg6;
				if (var23 < var11) {
					var11 = var23;
				}
				if (var23 > var12) {
					var12 = var23;
				}
				if (var24 < var13) {
					var13 = var24;
				}
				if (var24 > var14) {
					var14 = var24;
				}
				var10 = true;
			}
		}
		int var25 = arg0 + arg2;
		int var26 = arg1 + arg3;
		if (var10 && (float) var25 > var11 && (float) arg0 < var12 && (float) var26 > var13 && (float) arg1 < var14) {
			return true;
		} else {
			return false;
		}
	}
}
