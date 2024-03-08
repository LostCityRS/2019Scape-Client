package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("tb")
public class class537 {

	public class537() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("uz.n(II)I")
	public static int method9049(int arg0) {
		if (arg0 == 9 || arg0 == 10) {
			return 1;
		} else if (arg0 == 11) {
			return 8;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("amf.m(IB)[[[B")
	public static byte[][][] method18477(int arg0) {
		byte[][][] var1 = new byte[8][4][];
		int var2 = arg0;
		int var3 = arg0;
		byte[] var4 = new byte[arg0 * arg0];
		int var5 = 0;
		for (int var6 = 0; var6 < var3; var6++) {
			for (int var7 = 0; var7 < var2; var7++) {
				if (var7 <= var6) {
					var4[var5] = -1;
				}
				var5++;
			}
		}
		var1[0][0] = var4;
		byte[] var8 = new byte[var2 * var3];
		int var9 = 0;
		for (int var10 = var3 - 1; var10 >= 0; var10--) {
			for (int var11 = 0; var11 < var3; var11++) {
				if (var11 <= var10) {
					var8[var9] = -1;
				}
				var9++;
			}
		}
		var1[0][1] = var8;
		byte[] var12 = new byte[var2 * var3];
		int var13 = 0;
		for (int var14 = 0; var14 < var3; var14++) {
			for (int var15 = 0; var15 < var2; var15++) {
				if (var15 >= var14) {
					var12[var13] = -1;
				}
				var13++;
			}
		}
		var1[0][2] = var12;
		byte[] var16 = new byte[var2 * var3];
		int var17 = 0;
		for (int var18 = var3 - 1; var18 >= 0; var18--) {
			for (int var19 = 0; var19 < var2; var19++) {
				if (var19 >= var18) {
					var16[var17] = -1;
				}
				var17++;
			}
		}
		var1[0][3] = var16;
		byte[] var20 = new byte[var2 * var3];
		int var21 = 0;
		for (int var22 = var3 - 1; var22 >= 0; var22--) {
			for (int var23 = 0; var23 < var2; var23++) {
				if (var23 <= var22 >> 1) {
					var20[var21] = -1;
				}
				var21++;
			}
		}
		var1[1][0] = var20;
		byte[] var24 = new byte[var2 * var3];
		int var25 = 0;
		for (int var26 = 0; var26 < var3; var26++) {
			for (int var27 = 0; var27 < var2; var27++) {
				if (var25 >= 0 && var25 < var24.length) {
					if (var27 >= var26 << 1) {
						var24[var25] = -1;
					}
					var25++;
				} else {
					var25++;
				}
			}
		}
		var1[1][1] = var24;
		byte[] var28 = new byte[var2 * var3];
		int var29 = 0;
		for (int var30 = 0; var30 < var3; var30++) {
			for (int var31 = var2 - 1; var31 >= 0; var31--) {
				if (var31 <= var30 >> 1) {
					var28[var29] = -1;
				}
				var29++;
			}
		}
		var1[1][2] = var28;
		byte[] var32 = new byte[var2 * var3];
		int var33 = 0;
		for (int var34 = var3 - 1; var34 >= 0; var34--) {
			for (int var35 = var2 - 1; var35 >= 0; var35--) {
				if (var35 >= var34 << 1) {
					var32[var33] = -1;
				}
				var33++;
			}
		}
		var1[1][3] = var32;
		byte[] var36 = new byte[var2 * var3];
		int var37 = 0;
		for (int var38 = var3 - 1; var38 >= 0; var38--) {
			for (int var39 = var2 - 1; var39 >= 0; var39--) {
				if (var39 <= var38 >> 1) {
					var36[var37] = -1;
				}
				var37++;
			}
		}
		var1[2][0] = var36;
		byte[] var40 = new byte[var2 * var3];
		int var41 = 0;
		for (int var42 = var3 - 1; var42 >= 0; var42--) {
			for (int var43 = 0; var43 < var2; var43++) {
				if (var43 >= var42 << 1) {
					var40[var41] = -1;
				}
				var41++;
			}
		}
		var1[2][1] = var40;
		byte[] var44 = new byte[var2 * var3];
		int var45 = 0;
		for (int var46 = 0; var46 < var3; var46++) {
			for (int var47 = 0; var47 < var2; var47++) {
				if (var47 <= var46 >> 1) {
					var44[var45] = -1;
				}
				var45++;
			}
		}
		var1[2][2] = var44;
		byte[] var48 = new byte[var2 * var3];
		int var49 = 0;
		for (int var50 = 0; var50 < var3; var50++) {
			for (int var51 = var2 - 1; var51 >= 0; var51--) {
				if (var51 >= var50 << 1) {
					var48[var49] = -1;
				}
				var49++;
			}
		}
		var1[2][3] = var48;
		byte[] var52 = new byte[var2 * var3];
		int var53 = 0;
		for (int var54 = var3 - 1; var54 >= 0; var54--) {
			for (int var55 = 0; var55 < var2; var55++) {
				if (var55 >= var54 >> 1) {
					var52[var53] = -1;
				}
				var53++;
			}
		}
		var1[3][0] = var52;
		byte[] var56 = new byte[var2 * var3];
		int var57 = 0;
		for (int var58 = 0; var58 < var3; var58++) {
			for (int var59 = 0; var59 < var2; var59++) {
				if (var59 <= var58 << 1) {
					var56[var57] = -1;
				}
				var57++;
			}
		}
		var1[3][1] = var56;
		byte[] var60 = new byte[var2 * var3];
		int var61 = 0;
		for (int var62 = 0; var62 < var3; var62++) {
			for (int var63 = var2 - 1; var63 >= 0; var63--) {
				if (var63 >= var62 >> 1) {
					var60[var61] = -1;
				}
				var61++;
			}
		}
		var1[3][2] = var60;
		byte[] var64 = new byte[var2 * var3];
		int var65 = 0;
		for (int var66 = var3 - 1; var66 >= 0; var66--) {
			for (int var67 = var2 - 1; var67 >= 0; var67--) {
				if (var67 <= var66 << 1) {
					var64[var65] = -1;
				}
				var65++;
			}
		}
		var1[3][3] = var64;
		byte[] var68 = new byte[var2 * var3];
		int var69 = 0;
		for (int var70 = var3 - 1; var70 >= 0; var70--) {
			for (int var71 = var2 - 1; var71 >= 0; var71--) {
				if (var71 >= var70 >> 1) {
					var68[var69] = -1;
				}
				var69++;
			}
		}
		var1[4][0] = var68;
		byte[] var72 = new byte[var2 * var3];
		int var73 = 0;
		for (int var74 = var3 - 1; var74 >= 0; var74--) {
			for (int var75 = 0; var75 < var2; var75++) {
				if (var75 <= var74 << 1) {
					var72[var73] = -1;
				}
				var73++;
			}
		}
		var1[4][1] = var72;
		byte[] var76 = new byte[var2 * var3];
		int var77 = 0;
		for (int var78 = 0; var78 < var3; var78++) {
			for (int var79 = 0; var79 < var2; var79++) {
				if (var79 >= var78 >> 1) {
					var76[var77] = -1;
				}
				var77++;
			}
		}
		var1[4][2] = var76;
		byte[] var80 = new byte[var2 * var3];
		int var81 = 0;
		for (int var82 = 0; var82 < var3; var82++) {
			for (int var83 = var2 - 1; var83 >= 0; var83--) {
				if (var83 <= var82 << 1) {
					var80[var81] = -1;
				}
				var81++;
			}
		}
		var1[4][3] = var80;
		byte[] var84 = new byte[var2 * var3];
		int var85 = 0;
		for (int var86 = 0; var86 < var3; var86++) {
			for (int var87 = 0; var87 < var2; var87++) {
				if (var87 <= var2 / 2) {
					var84[var85] = -1;
				}
				var85++;
			}
		}
		var1[5][0] = var84;
		byte[] var88 = new byte[var2 * var3];
		int var89 = 0;
		for (int var90 = 0; var90 < var3; var90++) {
			for (int var91 = 0; var91 < var2; var91++) {
				if (var90 <= var3 / 2) {
					var88[var89] = -1;
				}
				var89++;
			}
		}
		var1[5][1] = var88;
		byte[] var92 = new byte[var2 * var3];
		int var93 = 0;
		for (int var94 = 0; var94 < var3; var94++) {
			for (int var95 = 0; var95 < var2; var95++) {
				if (var95 >= var2 / 2) {
					var92[var93] = -1;
				}
				var93++;
			}
		}
		var1[5][2] = var92;
		byte[] var96 = new byte[var2 * var3];
		int var97 = 0;
		for (int var98 = 0; var98 < var3; var98++) {
			for (int var99 = 0; var99 < var2; var99++) {
				if (var98 >= var3 / 2) {
					var96[var97] = -1;
				}
				var97++;
			}
		}
		var1[5][3] = var96;
		byte[] var100 = new byte[var2 * var3];
		int var101 = 0;
		for (int var102 = 0; var102 < var3; var102++) {
			for (int var103 = 0; var103 < var2; var103++) {
				if (var103 <= var102 - var3 / 2) {
					var100[var101] = -1;
				}
				var101++;
			}
		}
		var1[6][0] = var100;
		byte[] var104 = new byte[var2 * var3];
		int var105 = 0;
		for (int var106 = var3 - 1; var106 >= 0; var106--) {
			for (int var107 = 0; var107 < var2; var107++) {
				if (var107 <= var106 - var3 / 2) {
					var104[var105] = -1;
				}
				var105++;
			}
		}
		var1[6][1] = var104;
		byte[] var108 = new byte[var2 * var3];
		int var109 = 0;
		for (int var110 = var3 - 1; var110 >= 0; var110--) {
			for (int var111 = var2 - 1; var111 >= 0; var111--) {
				if (var111 <= var110 - var3 / 2) {
					var108[var109] = -1;
				}
				var109++;
			}
		}
		var1[6][2] = var108;
		byte[] var112 = new byte[var2 * var3];
		int var113 = 0;
		for (int var114 = 0; var114 < var3; var114++) {
			for (int var115 = var2 - 1; var115 >= 0; var115--) {
				if (var115 <= var114 - var3 / 2) {
					var112[var113] = -1;
				}
				var113++;
			}
		}
		var1[6][3] = var112;
		byte[] var116 = new byte[var2 * var3];
		int var117 = 0;
		for (int var118 = 0; var118 < var3; var118++) {
			for (int var119 = 0; var119 < var2; var119++) {
				if (var119 >= var118 - var3 / 2) {
					var116[var117] = -1;
				}
				var117++;
			}
		}
		var1[7][0] = var116;
		byte[] var120 = new byte[var2 * var3];
		int var121 = 0;
		for (int var122 = var3 - 1; var122 >= 0; var122--) {
			for (int var123 = 0; var123 < var2; var123++) {
				if (var123 >= var122 - var3 / 2) {
					var120[var121] = -1;
				}
				var121++;
			}
		}
		var1[7][1] = var120;
		byte[] var124 = new byte[var2 * var3];
		int var125 = 0;
		for (int var126 = var3 - 1; var126 >= 0; var126--) {
			for (int var127 = var2 - 1; var127 >= 0; var127--) {
				if (var127 >= var126 - var3 / 2) {
					var124[var125] = -1;
				}
				var125++;
			}
		}
		var1[7][2] = var124;
		byte[] var128 = new byte[var2 * var3];
		int var129 = 0;
		for (int var130 = 0; var130 < var3; var130++) {
			for (int var131 = var2 - 1; var131 >= 0; var131--) {
				if (var131 >= var130 - var3 / 2) {
					var128[var129] = -1;
				}
				var129++;
			}
		}
		var1[7][3] = var128;
		return var1;
	}
}
