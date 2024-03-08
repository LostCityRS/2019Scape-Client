package com.jagex;

import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("adg")
public class class797 {

	@ObfuscatedName("adg.n")
	public final class442 field9207;

	@ObfuscatedName("adg.m")
	public final class796[] field9208;

	@ObfuscatedName("adg.k")
	public final int field9209;

	public class797(class696 arg0, class687 arg1, class442 arg2) {
		this.field9207 = arg2;
		class997 var4 = new class997(this.field9207.method6879(0, 0));
		int var5 = var4.field11502 == null || var4.field11502.length < 1 ? -1 : var4.method17904();
		if (var5 < 4) {
			this.field9208 = new class796[0];
			this.field9209 = -1;
		} else {
			int var6 = var4.method17904();
			class319[] var7 = class319.method4482();
			boolean var8 = true;
			if (var7.length == var6) {
				for (int var9 = 0; var9 < var7.length; var9++) {
					int var10 = var4.method17904();
					if (var7[var9].field3198 != var10) {
						var8 = false;
						break;
					}
				}
			} else {
				var8 = false;
			}
			if (var8) {
				int var11 = var4.method17904();
				int var12 = var4.method17904();
				int var13;
				int var14;
				if (var5 > 2) {
					this.field9209 = var4.method17973();
					var13 = var4.method17908();
					var14 = var4.method17906();
				} else {
					this.field9209 = -1;
					var13 = 0;
					var14 = 0;
				}
				this.field9208 = new class796[var12 + 1];
				for (int var15 = 0; var15 < var11; var15++) {
					int var16 = var4.method17904();
					boolean var17 = var4.method17904() == 1;
					int var18 = var4.method17906();
					class799[] var19;
					if (this.field9209 == -1) {
						var19 = new class799[var18];
						for (int var20 = 0; var20 < var18; var20++) {
							int var21 = var4.method17906();
							int var22 = var4.method17908();
							int var23 = var4.method17906();
							var19[var20] = new class799(var21, var22, var23);
						}
						this.field9208[var16] = new class796(var17, var19);
					} else {
						var19 = new class799[var18 + 1];
						var19[0] = new class799(this.field9209, var13, var14);
						for (int var24 = 0; var24 < var18; var24++) {
							int var25 = var4.method17906();
							int var26 = var4.method17908();
							int var27 = var4.method17906();
							var19[var24 + 1] = new class799(var25, var26, var27);
						}
					}
					this.field9208[var16] = new class796(var17, var19);
				}
				for (int var28 = 0; var28 < var12 + 1; var28++) {
					if (this.field9208[var28] == null) {
						this.field9208[var28] = this.method15216(var13, var14);
					}
				}
			} else {
				this.field9208 = new class796[0];
				this.field9209 = -1;
			}
		}
	}

	@ObfuscatedName("adg.e(III)Lads;")
	public class796 method15216(int arg0, int arg1) {
		if (this.field9209 == -1) {
			return new class796(false, new class799[0]);
		} else {
			class799 var3 = new class799(this.field9209, arg0, arg1);
			return new class796(false, new class799[] { var3 });
		}
	}

	@ObfuscatedName("adg.n(II)Ladn;")
	public class798 method15217(int arg0) {
		byte[] var2 = this.field9207.method6879(arg0, 0);
		class798 var3 = new class798();
		var3.method15230(new class997(var2));
		return var3;
	}

	@ObfuscatedName("adg.m(II)[Ladk;")
	public class799[] method15218(int arg0) {
		if (arg0 < 0 || arg0 >= this.field9208.length) {
			return this.method15216(0, 0).field9205;
		}
		class796 var2 = this.field9208[arg0];
		if (!var2.field9204 || var2.field9205.length <= 1) {
			return var2.field9205;
		}
		int var3 = this.field9209 == -1 ? 0 : 1;
		Random var4 = new Random();
		class799[] var5 = new class799[var2.field9205.length];
		System.arraycopy(var2.field9205, 0, var5, 0, var5.length);
		for (int var6 = var3; var6 < var5.length; var6++) {
			int var7 = class783.method14985(var4, var5.length - var3) + var3;
			class799 var8 = var2.field9205[var6];
			var5[var6] = var5[var7];
			var5[var7] = var8;
		}
		return var5;
	}

	@ObfuscatedName("adg.k(I)Z")
	public boolean method15223() {
		return this.field9209 != -1;
	}
}
