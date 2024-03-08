package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aco")
public class class781 implements class53 {

	@ObfuscatedName("aco.e")
	public class782 field9153;

	@ObfuscatedName("aco.n")
	public int field9151;

	@ObfuscatedName("aco.m")
	public int field9154;

	@ObfuscatedName("aco.k")
	public boolean field9152 = false;

	@ObfuscatedName("aco.f")
	public int[] field9150;

	public class781(int arg0, class782 arg1) {
		this.field9153 = arg1;
	}

	@ObfuscatedName("aco.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method15066(arg0, var2);
		}
	}

	@ObfuscatedName("aco.u(Lalw;IB)V")
	public void method15066(class997 arg0, int arg1) {
		if (arg1 == 1) {
			this.field9151 = arg0.method17927();
		} else if (arg1 == 2) {
			this.field9154 = arg0.method17908();
		} else if (arg1 == 3) {
			this.field9152 = true;
		} else if (arg1 == 4) {
			this.field9151 = -1;
		} else if (arg1 == 5) {
		}
	}

	@ObfuscatedName("aco.z(Ldh;IZI)Lcm;")
	public class101 method15057(class133 arg0, int arg1, boolean arg2) {
		long var4 = (long) (this.field9151 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.field1595 << 19);
		class101 var6 = (class101) this.field9153.field9156.method2930(var4);
		if (var6 == null) {
			this.method15059(arg0, arg1, arg2, var4);
			return (class101) this.field9153.field9156.method2930(var4);
		} else {
			return var6;
		}
	}

	@ObfuscatedName("aco.p(Ldh;IZB)[I")
	public int[] method15058(class133 arg0, int arg1, boolean arg2) {
		if (this.field9150 == null) {
			long var4 = (long) (this.field9151 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.field1595 << 19);
			this.method15059(arg0, arg1, arg2, var4);
			return this.field9150;
		} else {
			return this.field9150;
		}
	}

	@ObfuscatedName("aco.d(Ldh;IZJ)V")
	public void method15059(class133 arg0, int arg1, boolean arg2, long arg3) {
		if (!this.field9153.field9157.method6889(this.field9151)) {
			return;
		}
		class136 var6 = class111.method1609(this.field9153.field9157, this.field9151, 0);
		if (var6 != null) {
			var6.method2595();
			if (arg2) {
				var6.method2602();
			}
			for (int var7 = 0; var7 < arg1; var7++) {
				var6.method2588();
			}
			this.field9150 = var6.method2604(false);
			if (this.field9154 != 0) {
				int var8 = this.field9154 >> 16 & 0xFF;
				int var9 = this.field9154 >> 8 & 0xFF;
				int var10 = this.field9154 & 0xFF;
				for (int var11 = 0; var11 < this.field9150.length; var11++) {
					int var12 = this.field9150[var11] >> 24 & 0xFF;
					int var13 = 256 - var12;
					if (var12 != 0) {
						int var14 = (this.field9150[var11] & 0xFF0000) * var8 * -16777216;
						int var15 = (this.field9150[var11] & 0xFF00) * var9 * 16711680;
						int var16 = (this.field9150[var11] & 0xFF) * var10 * 65280;
						int var17 = (var14 | var15 | var16) >>> 8;
						if (var12 == 255) {
							this.field9150[var11] = var17;
						} else {
							int var18 = this.field9150[var11];
							this.field9150[var11] = var12 << 24 | ((var17 & 0xFF00FF) * var13 + (var18 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var17 & 0xFF00) * var13 + (var18 & 0xFF00) * var12 & 0xFF0000) >> 8;
						}
					}
				}
			}
		}
		class101 var19 = arg0.method2200(var6, true);
		if (var19 != null) {
			this.field9153.field9156.method2921(var19, arg3);
		}
	}

	@ObfuscatedName("aco.c(I)Z")
	public boolean method15060() {
		return this.field9153.field9157.method6889(this.field9151);
	}

	@ObfuscatedName("aco.n(I)V")
	public void method975() {
	}
}
