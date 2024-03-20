package com.jagex.math;

import deob.ObfuscatedName;

@ObfuscatedName("oj")
public class Cuboid {

	@ObfuscatedName("oj.e")
	public float minX;

	@ObfuscatedName("oj.n")
	public float minY;

	@ObfuscatedName("oj.m")
	public float minZ;

	@ObfuscatedName("oj.k")
	public float maxX;

	@ObfuscatedName("oj.f")
	public float maxY;

	@ObfuscatedName("oj.w")
	public float maxZ;

	@ObfuscatedName("oj.l")
	public static final float[] VERTEX_X = new float[8];

	@ObfuscatedName("oj.u")
	public static final float[] VERTEX_Y = new float[8];

	@ObfuscatedName("oj.z")
	public static final float[] VERTEX_Z = new float[8];

	@ObfuscatedName("oj.e(IIIILpq;FFFF)Z")
	public boolean pick(int arg0, int arg1, int arg2, int arg3, Matrix4x4 arg4, float arg5, float arg6, float arg7, float arg8) {
		boolean var10 = false;
		float var11 = Float.MAX_VALUE;
		float var12 = -3.4028235E38F;
		float var13 = Float.MAX_VALUE;
		float var14 = -3.4028235E38F;
		VERTEX_X[0] = this.minX;
		VERTEX_Y[0] = this.minY;
		VERTEX_Z[0] = this.minZ;
		VERTEX_X[1] = this.maxX;
		VERTEX_Y[1] = this.minY;
		VERTEX_Z[1] = this.minZ;
		VERTEX_X[2] = this.minX;
		VERTEX_Y[2] = this.maxY;
		VERTEX_Z[2] = this.minZ;
		VERTEX_X[3] = this.maxX;
		VERTEX_Y[3] = this.maxY;
		VERTEX_Z[3] = this.minZ;
		VERTEX_X[4] = this.minX;
		VERTEX_Y[4] = this.minY;
		VERTEX_Z[4] = this.maxZ;
		VERTEX_X[5] = this.maxX;
		VERTEX_Y[5] = this.minY;
		VERTEX_Z[5] = this.maxZ;
		VERTEX_X[6] = this.minX;
		VERTEX_Y[6] = this.maxY;
		VERTEX_Z[6] = this.maxZ;
		VERTEX_X[7] = this.maxX;
		VERTEX_Y[7] = this.maxY;
		VERTEX_Z[7] = this.maxZ;
		for (int var15 = 0; var15 < 8; var15++) {
			float var16 = VERTEX_X[var15];
			float var17 = VERTEX_Y[var15];
			float var18 = VERTEX_Z[var15];
			float var19 = arg4.entries[10] * var18 + arg4.entries[2] * var16 + arg4.entries[6] * var17 + arg4.entries[14];
			float var20 = arg4.entries[11] * var18 + arg4.entries[3] * var16 + arg4.entries[7] * var17 + arg4.entries[15];
			if (var19 >= -var20) {
				float var21 = arg4.entries[8] * var18 + arg4.entries[0] * var16 + arg4.entries[4] * var17 + arg4.entries[12];
				float var22 = arg4.entries[9] * var18 + arg4.entries[1] * var16 + arg4.entries[5] * var17 + arg4.entries[13];
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
