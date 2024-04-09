package com.jagex.graphics.gl;

import com.jagex.graphics.AbstractEffect1;
import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("aln")
public class GlAbstractEffect1 extends AbstractEffect1 {

	@ObfuscatedName("aln.e")
	public int[] field11644 = new int[512];

	@ObfuscatedName("aln.n")
	public static final float[][] field11643 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@ObfuscatedName("aln.k(F)F")
	public static final float method18204(float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@ObfuscatedName("aln.f(FFF)F")
	public static final float method18197(float arg0, float arg1, float arg2) {
		return (arg1 - arg0) * arg2 + arg0;
	}

	@ObfuscatedName("aln.w(IFFF)F")
	public static final float method18205(int arg0, float arg1, float arg2, float arg3) {
		float[] var4 = field11643[arg0];
		return var4[2] * arg3 + var4[0] * arg1 + var4[1] * arg2;
	}

	public GlAbstractEffect1(int arg0) {
		Random var2 = new Random((long) arg0);
		for (int var3 = 0; var3 < 256; var3++) {
			this.field11644[var3] = this.field11644[var3 + 256] = var3;
		}
		for (int var4 = 0; var4 < 256; var4++) {
			int var5 = var2.nextInt() & 0xFF;
			int var6 = this.field11644[var5];
			this.field11644[var5] = this.field11644[var5 + 256] = this.field11644[var4];
			this.field11644[var4] = this.field11644[var4 + 256] = var6;
		}
	}

	@ObfuscatedName("aln.e(IIIIFFFF[FI)V")
	public void method8447(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, float arg7, float[] arg8, int arg9) {
		int var11 = (int) ((float) arg1 * arg4 - 1.0F);
		int var12 = var11 & 0xFF;
		int var13 = (int) ((float) arg2 * arg5 - 1.0F);
		int var14 = var13 & 0xFF;
		int var15 = (int) ((float) arg3 * arg6 - 1.0F);
		int var16 = var15 & 0xFF;
		float var17 = (float) arg0 * arg6;
		int var18 = (int) var17;
		int var19 = var18 + 1;
		float var20 = var17 - (float) var18;
		float var21 = 1.0F - var20;
		float var22 = method18204(var20);
		int var23 = var18 & var16;
		int var24 = var19 & var16;
		int var25 = this.field11644[var23];
		int var26 = this.field11644[var24];
		for (int var27 = 0; var27 < arg2; var27++) {
			float var28 = (float) var27 * arg5;
			int var29 = (int) var28;
			int var30 = var29 + 1;
			float var31 = var28 - (float) var29;
			float var32 = 1.0F - var31;
			float var33 = method18204(var31);
			int var34 = var29 & var14;
			int var35 = var30 & var14;
			int var36 = this.field11644[var25 + var34];
			int var37 = this.field11644[var25 + var35];
			int var38 = this.field11644[var26 + var34];
			int var39 = this.field11644[var26 + var35];
			for (int var40 = 0; var40 < arg1; var40++) {
				float var41 = (float) var40 * arg4;
				int var42 = (int) var41;
				int var43 = var42 + 1;
				float var44 = var41 - (float) var42;
				float var45 = 1.0F - var44;
				float var46 = method18204(var44);
				int var47 = var42 & var12;
				int var48 = var43 & var12;
				arg8[arg9++] = arg7 * method18197(method18197(method18197(method18205(this.field11644[var36 + var47] & 0x7, var45, var32, var21), method18205(this.field11644[var36 + var48] & 0x7, var44, var32, var21), var46), method18197(method18205(this.field11644[var37 + var47] & 0x7, var45, var31, var21), method18205(this.field11644[var37 + var48] & 0x7, var44, var31, var21), var46), var33), method18197(method18197(method18205(this.field11644[var38 + var47] & 0x7, var45, var32, var20), method18205(this.field11644[var38 + var48] & 0x7, var44, var32, var20), var46), method18197(method18205(this.field11644[var39 + var47] & 0x7, var45, var31, var20), method18205(this.field11644[var39 + var48] & 0x7, var44, var31, var20), var46), var33), var22);
			}
		}
	}
}
