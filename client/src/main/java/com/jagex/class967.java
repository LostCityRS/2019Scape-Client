package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aje")
public class class967 extends class532 {

	@ObfuscatedName("aje.k")
	public final int field11267;

	@ObfuscatedName("aje.f")
	public final int field11264;

	@ObfuscatedName("aje.w")
	public int field11266;

	@ObfuscatedName("aje.l")
	public boolean field11265;

	@ObfuscatedName("aje.u")
	public int[] field11268;

	public class967(int arg0, int arg1, int arg2, int[] arg3, boolean arg4) {
		this.field11267 = arg1;
		this.field11264 = arg2;
		this.field11268 = arg3;
		if (arg4) {
			int[] var6 = new int[this.field11264];
			int[] var7 = new int[this.field11264];
			int[] var8 = new int[this.field11264];
			int[] var9 = new int[this.field11264];
			if (Statics.field11269 == null || Statics.field11269.length != this.field11268.length) {
				Statics.field11269 = new int[this.field11268.length];
			}
			int var10 = this.field11264;
			int var11 = this.field11264;
			int var12 = var10 - 1;
			int var13 = var11 - 1;
			int var14 = var10 * var11;
			int var15 = var10;
			int var16 = var10;
			for (int var17 = 2; var17 >= 0; var17--) {
				for (int var18 = var12; var18 >= 0; var18--) {
					var15--;
					int var19 = this.field11268[var15];
					var6[var18] += var19 >> 24 & 0xFF;
					var7[var18] += var19 >> 16 & 0xFF;
					var8[var18] += var19 >> 8 & 0xFF;
					var9[var18] += var19 & 0xFF;
				}
				if (var15 == 0) {
					var15 = var14;
				}
			}
			int var20 = var14;
			for (int var21 = var13; var21 >= 0; var21--) {
				int var22 = 1;
				int var23 = 1;
				int var24 = 0;
				int var25 = 0;
				int var26 = 0;
				int var27 = 0;
				for (int var28 = 2; var28 >= 0; var28--) {
					var23--;
					var27 += var6[var23];
					var26 += var7[var23];
					var24 += var8[var23];
					var25 += var9[var23];
					if (var23 == 0) {
						var23 = var10;
					}
				}
				for (int var29 = var12; var29 >= 0; var29--) {
					var23--;
					var22--;
					int var30 = var27 / 9;
					int var31 = var26 / 9;
					int var32 = var24 / 9;
					int var33 = var25 / 9;
					var20--;
					Statics.field11269[var20] = var30 << 24 | var31 << 16 | var32 << 8 | var33;
					var27 += var6[var23] - var6[var22];
					var26 += var7[var23] - var7[var22];
					var25 += var9[var23] - var9[var22];
					var24 += var8[var23] - var8[var22];
					if (var23 == 0) {
						var23 = var10;
					}
					if (var22 == 0) {
						var22 = var10;
					}
				}
				for (int var34 = var12; var34 >= 0; var34--) {
					var15--;
					int var35 = this.field11268[var15];
					var16--;
					int var36 = this.field11268[var16];
					var6[var34] += (var35 >> 24 & 0xFF) - (var36 >> 24 & 0xFF);
					var7[var34] += (var35 >> 16 & 0xFF) - (var36 >> 16 & 0xFF);
					var8[var34] += (var35 >> 8 & 0xFF) - (var36 >> 8 & 0xFF);
					var9[var34] += (var35 & 0xFF) - (var36 & 0xFF);
				}
				if (var15 == 0) {
					var15 = var14;
				}
				if (var16 == 0) {
					var16 = var14;
				}
			}
			int[] var37 = this.field11268;
			this.field11268 = Statics.field11269;
			Statics.field11269 = var37;
		}
	}

	@ObfuscatedName("aje.e()[I")
	public int[] method17526() {
		return this.field11268;
	}

	@ObfuscatedName("aje.n(II)V")
	public void method17527(int arg0, int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (Statics.field11269 == null || Statics.field11269.length != this.field11268.length) {
			Statics.field11269 = new int[this.field11268.length];
		}
		int var3 = this.field11268.length;
		int var4 = arg0;
		int var5 = this.field11264 - 1;
		int var6 = this.field11264 * arg1;
		int var7 = var3 - 1;
		for (int var8 = 0; var8 < var3; var8 += this.field11264) {
			int var9 = var6 + var8 & var7;
			for (int var10 = 0; var10 < this.field11264; var10++) {
				int var11 = var8 + var10;
				int var12 = (var4 + var10 & var5) + var9;
				Statics.field11269[var11] = this.field11268[var12];
			}
		}
		int[] var13 = this.field11268;
		this.field11268 = Statics.field11269;
		Statics.field11269 = var13;
	}
}
