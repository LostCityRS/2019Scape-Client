package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gi")
public class class215 {

	@ObfuscatedName("gi.e")
	public int field2019;

	@ObfuscatedName("gi.n")
	public int field2017;

	@ObfuscatedName("gi.m")
	public int field2016;

	@ObfuscatedName("gi.k")
	public int field2015;

	@ObfuscatedName("gi.f")
	public int field2018;

	@ObfuscatedName("gi.w")
	public int field2014;

	@ObfuscatedName("gi.l")
	public int[] field2020;

	@ObfuscatedName("gi.u")
	public int[] field2021;

	@ObfuscatedName("gi.z")
	public class218 field2022;

	@ObfuscatedName("gi.p")
	public int[][] field2023;

	@ObfuscatedName("gi.e(Lhk;)V")
	public void method3674(class218 arg0) {
		this.field2022 = arg0;
		this.field2019 = this.field2022.method3853(16);
		this.field2017 = this.field2022.method3853(24);
		this.field2016 = this.field2022.method3853(24);
		this.field2015 = this.field2022.method3853(24) + 1;
		this.field2018 = this.field2022.method3853(6) + 1;
		this.field2014 = this.field2022.method3853(8);
		if (this.field2021 == null || this.field2021.length != this.field2018) {
			this.field2021 = new int[this.field2018];
		}
		for (int var2 = 0; var2 < this.field2018; var2++) {
			int var3 = 0;
			int var4 = this.field2022.method3853(3);
			boolean var5 = this.field2022.method3845() != 0;
			if (var5) {
				var3 = this.field2022.method3853(5);
			}
			this.field2021[var2] = var3 << 3 | var4;
		}
		if (this.field2020 == null || this.field2018 * 8 != this.field2020.length) {
			this.field2020 = new int[this.field2018 * 8];
		}
		for (int var6 = 0; var6 < this.field2018 * 8; var6++) {
			this.field2020[var6] = (this.field2021[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : this.field2022.method3853(8);
		}
	}

	@ObfuscatedName("gi.n([I)V")
	public void method3675(int[] arg0) {
		if (arg0 != null) {
			for (int var2 = 0; var2 < arg0.length; var2++) {
				arg0[var2] = 0;
			}
		}
	}

	@ObfuscatedName("gi.m([Lhb;I[Z)[Lhb;")
	public class220[] method3676(class220[] arg0, int arg1, boolean[] arg2) {
		int var4 = arg0.length;
		for (int var5 = 0; var5 < var4; var5++) {
			if (!arg2[var5]) {
				for (int var6 = 0; var6 < arg1; var6++) {
					arg0[var5].field2123[var6] = 0.0F;
				}
			}
		}
		int var7 = this.field2022.field2060[this.field2014].field2119;
		int var8 = this.field2016 - this.field2017;
		int var9 = var8 / this.field2015;
		if (this.field2023 != null && this.field2023.length == var4 && this.field2023[0].length == var9) {
			for (int var10 = 0; var10 < var4; var10++) {
				this.method3675(this.field2023[var10]);
			}
		} else {
			this.field2023 = new int[var4][var9];
		}
		for (int var11 = 0; var11 < 8; var11++) {
			int var12 = 0;
			while (var12 < var9) {
				if (var11 == 0) {
					for (int var13 = 0; var13 < var4; var13++) {
						if (!arg2[var13]) {
							int var14 = this.field2022.field2060[this.field2014].method3884(this.field2022);
							for (int var15 = var7 - 1; var15 >= 0; var15--) {
								if (var12 + var15 < var9) {
									this.field2023[var13][var12 + var15] = var14 % this.field2018;
								}
								var14 /= this.field2018;
							}
						}
					}
				}
				for (int var16 = 0; var16 < var7; var16++) {
					for (int var17 = 0; var17 < var4; var17++) {
						if (!arg2[var17]) {
							int var18 = this.field2023[var17][var12];
							int var19 = this.field2020[var18 * 8 + var11];
							if (var19 >= 0) {
								int var20 = this.field2015 * var12 + this.field2017;
								class219 var21 = this.field2022.field2060[var19];
								if (this.field2019 == 0) {
									int var22 = this.field2015 / var21.field2119;
									for (int var23 = 0; var23 < var22; var23++) {
										float[] var24 = var21.method3885(this.field2022);
										for (int var25 = 0; var25 < var21.field2119; var25++) {
											arg0[var17].field2123[var22 * var25 + var20 + var23] += var24[var25];
										}
									}
								} else if (this.field2019 == 1 || this.field2019 == 2) {
									int var26 = 0;
									while (var26 < this.field2015) {
										float[] var27 = var21.method3885(this.field2022);
										for (int var28 = 0; var28 < var21.field2119; var28++) {
											arg0[var17].field2123[var20 + var26] += var27[var28];
											var26++;
										}
									}
								}
							}
						}
					}
					var12++;
					if (var12 >= var9) {
						break;
					}
				}
			}
		}
		return arg0;
	}
}
