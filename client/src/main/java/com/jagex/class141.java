package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ed")
public class class141 {

	@ObfuscatedName("ed.e")
	public boolean field1686 = false;

	@ObfuscatedName("ed.n")
	public int field1683;

	@ObfuscatedName("ed.m")
	public int field1684;

	@ObfuscatedName("ed.k")
	public int field1682;

	@ObfuscatedName("ed.f")
	public int field1685;

	@ObfuscatedName("ed.w")
	public int field1687;

	@ObfuscatedName("ed.e(II)Z")
	public boolean method2742(int arg0, int arg1) {
		if (!this.field1686) {
			return false;
		}
		int var3 = this.field1682 - this.field1683;
		int var4 = this.field1685 - this.field1684;
		int var5 = var3 * var3 + var4 * var4;
		int var6 = arg0 * var3 + arg1 * var4 - (this.field1684 * var4 + this.field1683 * var3);
		if (var6 <= 0) {
			int var7 = this.field1683 - arg0;
			int var8 = this.field1684 - arg1;
			return var7 * var7 + var8 * var8 < this.field1687 * this.field1687;
		} else if (var6 > var5) {
			int var9 = this.field1682 - arg0;
			int var10 = this.field1685 - arg1;
			return var9 * var9 + var10 * var10 < this.field1687 * this.field1687;
		} else {
			byte var11 = 10;
			if ((var6 & 0x1FFFFF) != var6) {
				var11 = 5;
			}
			int var12 = (var6 << var11) / var5;
			int var13 = (var3 * var12 >> var11) + this.field1683 - arg0;
			int var14 = (var4 * var12 >> var11) + this.field1684 - arg1;
			return var13 * var13 + var14 * var14 < this.field1687 * this.field1687;
		}
	}

	@ObfuscatedName("ed.n(Loj;Lpq;Lpq;FFFF)V")
	public void method2746(class416 arg0, class426 arg1, class426 arg2, float arg3, float arg4, float arg5, float arg6) {
		boolean var8 = false;
		this.field1686 = true;
		int var9 = (int) (arg0.field4252 + arg0.field4249) >> 1;
		int var10 = (int) (arg0.field4251 + arg0.field4248) >> 1;
		int var12 = (int) arg0.field4253;
		float var14 = arg2.field4315[8] * (float) var10 + arg2.field4315[0] * (float) var9 + arg2.field4315[4] * (float) var12 + arg2.field4315[12];
		float var15 = arg2.field4315[9] * (float) var10 + arg2.field4315[1] * (float) var9 + arg2.field4315[5] * (float) var12 + arg2.field4315[13];
		float var16 = arg2.field4315[10] * (float) var10 + arg2.field4315[2] * (float) var9 + arg2.field4315[6] * (float) var12 + arg2.field4315[14];
		float var17 = arg2.field4315[11] * (float) var10 + arg2.field4315[3] * (float) var9 + arg2.field4315[7] * (float) var12 + arg2.field4315[15];
		if (var16 >= -var17) {
			this.field1683 = (int) (arg5 * var14 / var17 + arg3);
			this.field1684 = (int) (arg6 * var15 / var17 + arg4);
		} else {
			var8 = true;
		}
		int var19 = (int) arg0.field4250;
		float var21 = arg2.field4315[8] * (float) var10 + arg2.field4315[0] * (float) var9 + arg2.field4315[4] * (float) var19 + arg2.field4315[12];
		float var22 = arg2.field4315[9] * (float) var10 + arg2.field4315[1] * (float) var9 + arg2.field4315[5] * (float) var19 + arg2.field4315[13];
		float var23 = arg2.field4315[10] * (float) var10 + arg2.field4315[2] * (float) var9 + arg2.field4315[6] * (float) var19 + arg2.field4315[14];
		float var24 = arg2.field4315[11] * (float) var10 + arg2.field4315[3] * (float) var9 + arg2.field4315[7] * (float) var19 + arg2.field4315[15];
		if (var23 >= -var24) {
			this.field1682 = (int) (arg5 * var21 / var24 + arg3);
			this.field1685 = (int) (arg6 * var22 / var24 + arg4);
		} else {
			var8 = true;
		}
		if (var8) {
			if (var16 < -var17 && var23 < -var24) {
				this.field1686 = false;
			} else if (var16 < -var17) {
				float var25 = (var16 + var17) / (var23 + var24) - 1.0F;
				float var26 = (var21 - var14) * var25 + var14;
				float var27 = (var22 - var15) * var25 + var15;
				float var28 = (var24 - var17) * var25 + var17;
				this.field1683 = (int) (arg5 * var26 / var28 + arg3);
				this.field1684 = (int) (arg6 * var27 / var28 + arg4);
			} else if (var23 < -var24) {
				float var29 = (var23 + var24) / (var16 + var17) - 1.0F;
				float var30 = (var14 - var21) * var29 + var21;
				float var31 = (var15 - var22) * var29 + var22;
				float var32 = (var17 - var24) * var29 + var24;
				this.field1682 = (int) (arg5 * var30 / var32 + arg3);
				this.field1685 = (int) (arg6 * var31 / var32 + arg4);
			}
		}
		if (!this.field1686) {
			return;
		}
		float var33 = (float) Math.sqrt(Math.pow((double) (arg0.field4249 - arg0.field4252), 2.0D) + Math.pow((double) (arg0.field4251 - arg0.field4248), 2.0D)) / 2.0F;
		if (var16 / var17 > var23 / var24) {
			float var34 = arg1.field4315[0] * var33 + var14 + arg1.field4315[12];
			float var35 = arg1.field4315[3] * var33 + var17 + arg1.field4315[15];
			this.field1687 = (int) (arg5 * var34 / var35 + (arg3 - (float) this.field1683));
		} else {
			float var36 = arg1.field4315[0] * var33 + var21 + arg1.field4315[12];
			float var37 = arg1.field4315[3] * var33 + var24 + arg1.field4315[15];
			this.field1687 = (int) (arg5 * var36 / var37 + (arg3 - (float) this.field1682));
		}
		this.field1686 = true;
	}
}
