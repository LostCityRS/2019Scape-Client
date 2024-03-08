package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aee")
public class class835 extends class104 {

	@ObfuscatedName("aee.d")
	public final class848 field9423;

	@ObfuscatedName("aee.c")
	public final int field9427;

	@ObfuscatedName("aee.r")
	public class64[][] field9425;

	@ObfuscatedName("aee.v")
	public class59[][] field9443;

	@ObfuscatedName("aee.o")
	public class62[][] field9438;

	@ObfuscatedName("aee.s")
	public class63[][] field9428;

	@ObfuscatedName("aee.y")
	public class67[][] field9429;

	@ObfuscatedName("aee.q")
	public float field9430;

	@ObfuscatedName("aee.x")
	public float field9431;

	@ObfuscatedName("aee.b")
	public float field9432;

	@ObfuscatedName("aee.h")
	public float field9450;

	@ObfuscatedName("aee.a")
	public float field9434;

	@ObfuscatedName("aee.g")
	public float field9435;

	@ObfuscatedName("aee.i")
	public float field9436;

	@ObfuscatedName("aee.j")
	public float field9422;

	@ObfuscatedName("aee.t")
	public float field9445;

	@ObfuscatedName("aee.ae")
	public float field9439;

	@ObfuscatedName("aee.ag")
	public float field9440;

	@ObfuscatedName("aee.ah")
	public float field9441;

	@ObfuscatedName("aee.al")
	public float field9442;

	@ObfuscatedName("aee.ac")
	public float field9446;

	@ObfuscatedName("aee.ai")
	public float field9424;

	@ObfuscatedName("aee.aw")
	public float field9444;

	@ObfuscatedName("aee.as")
	public byte[][] field9437;

	@ObfuscatedName("aee.at")
	public byte[][] field9447;

	public class835(class848 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.field9423 = arg0;
		this.field9427 = arg2;
		this.field9437 = new byte[arg3 + 1][arg4 + 1];
		int var9 = this.field9423.field9791 >> 9;
		for (int var10 = 1; var10 < arg4; var10++) {
			for (int var11 = 1; var11 < arg3; var11++) {
				int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
				int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
				int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
				int var16 = (var13 << 8) / var15;
				int var17 = arg7 * -512 / var15;
				int var18 = (var14 << 8) / var15;
				int var19 = (this.field9423.field9788 * var18 + this.field9423.field9804 * var16 + this.field9423.field9787 * var17 >> 17) + var9;
				int var20 = var19 >> 1;
				if (var20 < 2) {
					var20 = 2;
				} else if (var20 > 126) {
					var20 = 126;
				}
				this.field9437[var11][var10] = (byte) var20;
			}
		}
		this.field9447 = new byte[arg3 + 1][arg4 + 1];
	}

	@ObfuscatedName("aee.e(III)V")
	public void method1521(int arg0, int arg1, int arg2) {
		int var4 = Math.min(this.field9447.length - 1, Math.max(0, arg0));
		int var5 = Math.min(this.field9447[var4].length - 1, Math.max(0, arg1));
		if (this.field9447[var4][var5] < arg2) {
			this.field9447[var4][var5] = (byte) arg2;
		}
	}

	@ObfuscatedName("aee.m(II[I[I[I[I[I[I[I[I[I[I[ILdy;Z)V")
	public void method1525(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, class131 arg13, boolean arg14) {
		if (this.field9425 == null) {
			this.field9425 = new class64[this.field1235][this.field1234];
			this.field9443 = new class59[this.field1235][this.field1234];
		} else if (this.field9438 != null || this.field9429 != null) {
			throw new IllegalStateException();
		}
		boolean var16 = false;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			var16 = true;
			for (int var17 = 1; var17 < 2; var17++) {
				int var18 = arg2[arg6[var17]];
				int var19 = arg4[arg6[var17]];
				if (var18 != 0 && this.field1233 != var18 || var19 != 0 && this.field1233 != var19) {
					var16 = false;
					break;
				}
			}
		}
		if (!var16) {
			class59 var20 = new class59();
			short var21 = (short) arg2.length;
			short var22 = (short) arg9.length;
			var20.field887 = var21;
			var20.field883 = new short[var21];
			var20.field884 = new short[var21];
			var20.field888 = new short[var21];
			var20.field882 = new short[var21];
			for (int var23 = 0; var23 < var21; var23++) {
				int var24 = arg2[var23];
				int var25 = arg4[var23];
				if (var24 == 0 && var25 == 0) {
					var20.field883[var23] = (short) (this.field9437[arg0][arg1] - this.field9447[arg0][arg1]);
				} else if (var24 == 0 && this.field1233 == var25) {
					var20.field883[var23] = (short) (this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1]);
				} else if (this.field1233 == var24 && this.field1233 == var25) {
					var20.field883[var23] = (short) (this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]);
				} else if (this.field1233 == var24 && var25 == 0) {
					var20.field883[var23] = (short) (this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]);
				} else {
					int var26 = (this.field1233 - var24) * (this.field9437[arg0][arg1] - this.field9447[arg0][arg1]) + (this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]) * var24;
					int var27 = (this.field1233 - var24) * (this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1]) + (this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]) * var24;
					var20.field883[var23] = (short) ((this.field1233 - var25) * var26 + var25 * var27 >> this.field1236 * 2);
				}
				int var28 = (arg0 << this.field1236) + var24;
				int var29 = (arg1 << this.field1236) + var25;
				var20.field884[var23] = (short) var24;
				var20.field882[var23] = (short) var25;
				var20.field888[var23] = (short) (this.method1527(var28, var29) + (arg3 == null ? 0 : arg3[var23]));
				if (var20.field883[var23] < 2) {
					var20.field883[var23] = 2;
				}
			}
			boolean var30 = false;
			int var31 = 0;
			for (int var32 = 0; var32 < var22; var32++) {
				if (arg9[var32] >= 0 || arg10 != null && arg10[var32] >= 0) {
					var31++;
				}
				int var33 = arg11[var32];
				if (var33 != -1) {
					class118 var34 = this.field9423.field1597.method2043(var33);
					if (!var34.field1342) {
						var30 = true;
						if (this.method15396(var34.field1308) || var34.field1317 != 0.0F || var34.field1338 != 0.0F) {
							var20.field879 = (byte) (var20.field879 | 0x4);
						}
					}
				}
			}
			var20.field889 = new int[var31];
			if (arg10 != null) {
				var20.field890 = new int[var31];
			}
			var20.field881 = new short[var31];
			var20.field885 = new short[var31];
			var20.field886 = new short[var31];
			if (var30) {
				var20.field880 = new short[var31];
				var20.field877 = new short[var31];
			}
			for (int var35 = 0; var35 < var22; var35++) {
				if (arg9[var35] >= 0 || arg10 != null && arg10[var35] >= 0) {
					if (arg9[var35] >= 0) {
						var20.field889[var20.field878] = class662.method4937(arg9[var35]);
					} else {
						var20.field889[var20.field878] = -1;
					}
					if (arg10 != null) {
						if (arg10[var35] == -1) {
							var20.field890[var20.field878] = -1;
						} else {
							var20.field890[var20.field878] = class662.method4937(arg10[var35]);
						}
					}
					var20.field881[var20.field878] = (short) arg6[var35];
					var20.field885[var20.field878] = (short) arg7[var35];
					var20.field886[var20.field878] = (short) arg8[var35];
					if (var30) {
						if (arg11[var35] == -1 || this.field9423.field1597.method2043(arg11[var35]).field1342) {
							var20.field880[var20.field878] = -1;
						} else {
							var20.field880[var20.field878] = (short) arg11[var35];
							var20.field877[var20.field878] = (short) arg12[var35];
						}
					}
					var20.field878++;
				}
			}
			this.field9443[arg0][arg1] = var20;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			class64 var36 = new class64();
			int var37 = arg9[0];
			int var38 = arg11[0];
			if (arg10 != null) {
				var36.field930 = class662.method6807(class662.method4937(arg10[0]), this.field9437[arg0][arg1] - this.field9447[arg0][arg1]);
				if (var37 == -1) {
					var36.field925 = (byte) (var36.field925 | 0x2);
				}
			}
			if (this.field1237[arg0 + 1][arg1] == this.field1237[arg0][arg1] && this.field1237[arg0 + 1][arg1 + 1] == this.field1237[arg0][arg1] && this.field1237[arg0][arg1 + 1] == this.field1237[arg0][arg1]) {
				var36.field925 = (byte) (var36.field925 | 0x1);
			}
			class118 var39 = null;
			if (var38 != -1) {
				var39 = this.field9423.field1597.method2043(var38);
			}
			if (var39 == null || (var36.field925 & 0x2) != 0 || var39.field1342) {
				short var40 = class662.method4937(var37);
				var36.field931 = (short) class662.method6807(var40, this.field9437[arg0][arg1] - this.field9447[arg0][arg1]);
				var36.field927 = (short) class662.method6807(var40, this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]);
				var36.field928 = (short) class662.method6807(var40, this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]);
				var36.field929 = (short) class662.method6807(var40, this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1]);
				var36.field926 = -1;
			} else {
				var36.field931 = (short) (this.field9437[arg0][arg1] - this.field9447[arg0][arg1]);
				var36.field927 = (short) (this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]);
				var36.field928 = (short) (this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]);
				var36.field929 = (short) (this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1]);
				var36.field926 = (short) var38;
				if (this.method15396(var39.field1308) || var39.field1317 != 0.0F || var39.field1338 != 0.0F) {
					var36.field925 = (byte) (var36.field925 | 0x4);
				}
			}
			this.field9425[arg0][arg1] = var36;
		}
	}

	@ObfuscatedName("aee.n(II[I[I[I[I[I[I[I[ILdy;Z)V")
	public void method1557(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, class131 arg10, boolean arg11) {
		boolean var13 = (this.field9427 & 0x20) == 0;
		if (this.field9438 == null && !var13) {
			this.field9438 = new class62[this.field1235][this.field1234];
			this.field9428 = new class63[this.field1235][this.field1234];
		} else if (this.field9429 == null && var13) {
			this.field9429 = new class67[this.field1235][this.field1234];
		} else if (this.field9425 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (int var14 = 0; var14 < arg6.length; var14++) {
			if (arg6[var14] == -1) {
				arg6[var14] = 0;
			} else {
				arg6[var14] = Statics.field8149[class662.method4937(arg6[var14]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (int var15 = 0; var15 < arg7.length; var15++) {
				if (arg7[var15] == -1) {
					arg7[var15] = 0;
				} else {
					arg7[var15] = Statics.field8149[class662.method4937(arg7[var15]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		if (var13) {
			class67 var16 = new class67();
			var16.field981 = (short) arg2.length;
			var16.field979 = (short) (arg2.length / 3);
			var16.field975 = new short[var16.field981];
			var16.field977 = new short[var16.field981];
			var16.field978 = new short[var16.field981];
			var16.field982 = new int[var16.field981];
			var16.field980 = new short[var16.field981];
			var16.field974 = new short[var16.field981];
			var16.field983 = new byte[var16.field981];
			if (arg5 != null) {
				var16.field976 = new short[var16.field981];
			}
			for (int var17 = 0; var17 < var16.field981; var17++) {
				int var18 = arg2[var17];
				int var19 = arg4[var17];
				boolean var20 = false;
				int var21;
				if (var18 == 0 && var19 == 0) {
					var21 = this.field9437[arg0][arg1] - this.field9447[arg0][arg1];
				} else if (var18 == 0 && this.field1233 == var19) {
					var21 = this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1];
				} else if (this.field1233 == var18 && this.field1233 == var19) {
					var21 = this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1];
				} else if (this.field1233 == var18 && var19 == 0) {
					var21 = this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1];
				} else {
					int var22 = (this.field1233 - var18) * (this.field9437[arg0][arg1] - this.field9447[arg0][arg1]) + (this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]) * var18;
					int var23 = (this.field1233 - var18) * (this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1]) + (this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]) * var18;
					var21 = (this.field1233 - var19) * var22 + var19 * var23 >> this.field1236 * 2;
				}
				int var24 = (arg0 << this.field1236) + var18;
				int var25 = (arg1 << this.field1236) + var19;
				var16.field975[var17] = (short) var18;
				var16.field978[var17] = (short) var19;
				var16.field977[var17] = (short) (this.method1527(var24, var25) + (arg3 == null ? 0 : arg3[var17]));
				if (var21 < 0) {
					var21 = 0;
				}
				if (arg6[var17] == 0) {
					var16.field982[var17] = 0;
					if (arg7 != null) {
						var16.field983[var17] = (byte) var21;
					}
				} else {
					int var26 = 0;
					if (arg5 != null) {
						short var27 = var16.field976[var17] = (short) arg5[var17];
						if (arg10.field1573 != 0) {
							var26 = var27 * 255 / arg10.field1573;
							if (var26 < 0) {
								var26 = 0;
							} else if (var26 > 255) {
								var26 = 255;
							}
						}
					}
					int var28 = -16777216;
					if (arg8[var17] != -1) {
						class118 var29 = this.field9423.field1597.method2043(arg8[var17]);
						if (var29.field1330 && this.method15396(var29.field1308)) {
							var28 = -1694498816;
						}
					}
					var16.field982[var17] = var28 | class662.method3057(method15391(arg6[var17] >> 8, var21), arg10.field1575, var26);
					if (arg7 != null) {
						var16.field983[var17] = (byte) var21;
					}
				}
				var16.field980[var17] = (short) arg8[var17];
				var16.field974[var17] = (short) arg9[var17];
			}
			if (arg7 != null) {
				var16.field984 = new int[var16.field979];
				for (int var30 = 0; var30 < var16.field979; var30++) {
					int var31 = var30 * 3;
					if (arg7[var31] != 0) {
						var16.field984[var30] = arg7[var31] >> 8 | 0xFF000000;
					}
				}
			}
			this.field9429[arg0][arg1] = var16;
			return;
		}
		boolean var32 = true;
		int var33 = -1;
		int var34 = -1;
		int var35 = -1;
		int var36 = -1;
		if (arg2.length == 6) {
			for (int var37 = 0; var37 < 6; var37++) {
				if (arg2[var37] == 0 && arg4[var37] == 0) {
					if (var33 != -1 && arg6[var33] != arg6[var37]) {
						var32 = false;
						break;
					}
					var33 = var37;
				} else if (this.field1233 == arg2[var37] && arg4[var37] == 0) {
					if (var34 != -1 && arg6[var34] != arg6[var37]) {
						var32 = false;
						break;
					}
					var34 = var37;
				} else if (this.field1233 == arg2[var37] && this.field1233 == arg4[var37]) {
					if (var35 != -1 && arg6[var35] != arg6[var37]) {
						var32 = false;
						break;
					}
					var35 = var37;
				} else if (arg2[var37] == 0 && this.field1233 == arg4[var37]) {
					if (var36 != -1 && arg6[var36] != arg6[var37]) {
						var32 = false;
						break;
					}
					var36 = var37;
				}
			}
			if (var33 == -1 || var34 == -1 || var35 == -1 || var36 == -1) {
				var32 = false;
			}
			if (var32) {
				if (arg3 != null) {
					for (int var38 = 0; var38 < 4; var38++) {
						if (arg3[var38] != 0) {
							var32 = false;
							break;
						}
					}
				}
				if (var32) {
					for (int var39 = 1; var39 < 4; var39++) {
						if (arg2[var39] != arg2[0] && this.field1233 + arg2[0] != arg2[var39] && arg2[0] - this.field1233 != arg2[var39]) {
							var32 = false;
							break;
						}
						if (arg4[var39] != arg4[0] && this.field1233 + arg4[0] != arg4[var39] && arg4[0] - this.field1233 != arg4[var39]) {
							var32 = false;
							break;
						}
					}
				}
			}
		} else {
			var32 = false;
		}
		if (!var32) {
			class63 var51 = new class63();
			var51.field919 = (short) arg2.length;
			var51.field918 = (short) (arg2.length / 3);
			var51.field917 = new short[var51.field919];
			var51.field915 = new short[var51.field919];
			var51.field916 = new short[var51.field919];
			var51.field921 = new int[var51.field919];
			if (arg5 != null) {
				var51.field920 = new short[var51.field919];
			}
			for (int var52 = 0; var52 < var51.field919; var52++) {
				int var53 = arg2[var52];
				int var54 = arg4[var52];
				boolean var55 = false;
				int var56;
				if (var53 == 0 && var54 == 0) {
					var56 = this.field9437[arg0][arg1] - this.field9447[arg0][arg1];
				} else if (var53 == 0 && this.field1233 == var54) {
					var56 = this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1];
				} else if (this.field1233 == var53 && this.field1233 == var54) {
					var56 = this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1];
				} else if (this.field1233 == var53 && var54 == 0) {
					var56 = this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1];
				} else {
					int var57 = (this.field1233 - var53) * (this.field9437[arg0][arg1] - this.field9447[arg0][arg1]) + (this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]) * var53;
					int var58 = (this.field1233 - var53) * (this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1]) + (this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]) * var53;
					var56 = (this.field1233 - var54) * var57 + var54 * var58 >> this.field1236 * 2;
				}
				int var59 = (arg0 << this.field1236) + var53;
				int var60 = (arg1 << this.field1236) + var54;
				var51.field917[var52] = (short) var53;
				var51.field916[var52] = (short) var54;
				var51.field915[var52] = (short) (this.method1527(var59, var60) + (arg3 == null ? 0 : arg3[var52]));
				if (var56 < 0) {
					var56 = 0;
				}
				if (arg6[var52] != 0) {
					int var61 = 0;
					if (arg5 != null) {
						short var62 = var51.field920[var52] = (short) arg5[var52];
						if (arg10.field1573 != 0) {
							var61 = var62 * 255 / arg10.field1573;
							if (var61 < 0) {
								var61 = 0;
							} else if (var61 > 255) {
								var61 = 255;
							}
						}
					}
					var51.field921[var52] = class662.method3057(method15391(arg6[var52] >> 8, var56), arg10.field1575, var61);
					if (arg7 != null) {
						var51.field921[var52] |= var56 << 25;
					}
				} else if (arg7 == null) {
					var51.field921[var52] = 0;
				} else {
					var51.field921[var52] = var56 << 25;
				}
			}
			boolean var63 = false;
			for (int var64 = 0; var64 < var51.field918; var64++) {
				if (arg8[var64 * 3] != -1 && !this.field9423.field1597.method2043(arg8[var64 * 3]).field1342) {
					var63 = true;
				}
			}
			if (arg7 != null) {
				var51.field914 = new int[var51.field918];
			}
			if (var63) {
				var51.field924 = new short[var51.field918];
				var51.field923 = new short[var51.field918];
			}
			for (int var65 = 0; var65 < var51.field918; var65++) {
				int var66 = var65 * 3;
				if (arg7 != null && arg7[var66] != 0) {
					var51.field914[var65] = arg7[var66] >> 8;
				}
				if (var63) {
					int var67 = var66 + 1;
					int var68 = var67 + 1;
					boolean var69 = false;
					boolean var70 = true;
					int var71 = arg8[var66];
					if (var71 == -1 || this.field9423.field1597.method2043(var71).field1342) {
						var70 = false;
					} else {
						var69 = true;
					}
					int var72 = arg8[var67];
					if (var72 == -1 || this.field9423.field1597.method2043(var72).field1342) {
						var70 = false;
					} else {
						var69 = true;
					}
					int var73 = arg8[var68];
					if (var73 == -1 || this.field9423.field1597.method2043(var73).field1342) {
						var70 = false;
					} else {
						var69 = true;
					}
					if (var70) {
						var51.field924[var65] = (short) var73;
						var51.field923[var65] = (short) arg9[var66];
					} else {
						if (var69) {
							int var74 = arg8[var66];
							if (var74 != -1 && !this.field9423.field1597.method2043(var74).field1342) {
								var51.field921[var66] = Statics.field8149[class662.method4937(this.field9423.field1597.method2043(var74).field1366 & 0xFFFF) & 0xFFFF];
							}
							int var75 = arg8[var67];
							if (var75 != -1 && !this.field9423.field1597.method2043(var75).field1342) {
								var51.field921[var67] = Statics.field8149[class662.method4937(this.field9423.field1597.method2043(var75).field1366 & 0xFFFF) & 0xFFFF];
							}
							int var76 = arg8[var68];
							if (var76 != -1 && !this.field9423.field1597.method2043(var76).field1342) {
								var51.field921[var68] = Statics.field8149[class662.method4937(this.field9423.field1597.method2043(var76).field1366 & 0xFFFF) & 0xFFFF];
							}
						}
						var51.field924[var65] = -1;
					}
				}
			}
			this.field9428[arg0][arg1] = var51;
			return;
		}
		class62 var40 = new class62();
		int var41 = arg6[0];
		int var42 = arg8[0];
		if (arg7 != null) {
			var40.field903 = arg7[0] >> 8;
			if (var41 == 0) {
				var40.field911 = (byte) (var40.field911 | 0x2);
			}
		} else if (var41 == 0) {
			return;
		}
		if (this.field1237[arg0 + 1][arg1] == this.field1237[arg0][arg1] && this.field1237[arg0 + 1][arg1 + 1] == this.field1237[arg0][arg1] && this.field1237[arg0][arg1 + 1] == this.field1237[arg0][arg1]) {
			var40.field911 = (byte) (var40.field911 | 0x1);
		}
		if (var42 == -1 || (var40.field911 & 0x2) != 0 || this.field9423.field1597.method2043(var42).field1342) {
			int var47;
			if (arg5 == null || arg10.field1573 == 0) {
				var47 = 0;
			} else {
				var47 = arg5[var33] * 255 / arg10.field1573;
				if (var47 < 0) {
					var47 = 0;
				} else if (var47 > 255) {
					var47 = 255;
				}
			}
			var40.field912 = class662.method3057(method15391(arg6[var33] >> 8, this.field9437[arg0][arg1] - this.field9447[arg0][arg1]), arg10.field1575, var47);
			if (var40.field903 != 0) {
				var40.field912 |= 255 - (this.field9437[arg0][arg1] - this.field9447[arg0][arg1]) << 25;
			}
			int var48;
			if (arg5 == null || arg10.field1573 == 0) {
				var48 = 0;
			} else {
				var48 = arg5[var34] * 255 / arg10.field1573;
				if (var48 < 0) {
					var48 = 0;
				} else if (var48 > 255) {
					var48 = 255;
				}
			}
			var40.field904 = class662.method3057(method15391(arg6[var34] >> 8, this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]), arg10.field1575, var48);
			if (var40.field903 != 0) {
				var40.field904 |= 255 - (this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]) << 25;
			}
			int var49;
			if (arg5 == null || arg10.field1573 == 0) {
				var49 = 0;
			} else {
				var49 = arg5[var35] * 255 / arg10.field1573;
				if (var49 < 0) {
					var49 = 0;
				} else if (var49 > 255) {
					var49 = 255;
				}
			}
			var40.field906 = class662.method3057(method15391(arg6[var35] >> 8, this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]), arg10.field1575, var49);
			if (var40.field903 != 0) {
				var40.field906 |= 255 - (this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]) << 25;
			}
			int var50;
			if (arg5 == null || arg10.field1573 == 0) {
				var50 = 0;
			} else {
				var50 = arg5[var36] * 255 / arg10.field1573;
				if (var50 < 0) {
					var50 = 0;
				} else if (var50 > 255) {
					var50 = 255;
				}
			}
			var40.field907 = class662.method3057(method15391(arg6[var36] >> 8, this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1]), arg10.field1575, var50);
			if (var40.field903 != 0) {
				var40.field907 |= 255 - (this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1]) << 25;
			}
			var40.field913 = -1;
		} else {
			int var43;
			if (arg5 == null || arg10.field1573 == 0) {
				var43 = 0;
			} else {
				var43 = arg5[var33] * 255 / arg10.field1573;
				if (var43 < 0) {
					var43 = 0;
				} else if (var43 > 255) {
					var43 = 255;
				}
			}
			var40.field912 = class662.method3057(method15391(arg6[var33] >> 8, this.field9437[arg0][arg1] - this.field9447[arg0][arg1]), arg10.field1575, var43);
			if (var40.field903 != 0) {
				var40.field912 |= 255 - (this.field9437[arg0][arg1] - this.field9447[arg0][arg1]) << 25;
			}
			int var44;
			if (arg5 == null || arg10.field1573 == 0) {
				var44 = 0;
			} else {
				var44 = arg5[var34] * 255 / arg10.field1573;
				if (var44 < 0) {
					var44 = 0;
				} else if (var44 > 255) {
					var44 = 255;
				}
			}
			var40.field904 = class662.method3057(method15391(arg6[var34] >> 8, this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]), arg10.field1575, var44);
			if (var40.field903 != 0) {
				var40.field904 |= 255 - (this.field9437[arg0 + 1][arg1] - this.field9447[arg0 + 1][arg1]) << 25;
			}
			int var45;
			if (arg5 == null || arg10.field1573 == 0) {
				var45 = 0;
			} else {
				var45 = arg5[var35] * 255 / arg10.field1573;
				if (var45 < 0) {
					var45 = 0;
				} else if (var45 > 255) {
					var45 = 255;
				}
			}
			var40.field906 = class662.method3057(method15391(arg6[var35] >> 8, this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]), arg10.field1575, var45);
			if (var40.field903 != 0) {
				var40.field906 |= 255 - (this.field9437[arg0 + 1][arg1 + 1] - this.field9447[arg0 + 1][arg1 + 1]) << 25;
			}
			int var46;
			if (arg5 == null || arg10.field1573 == 0) {
				var46 = 0;
			} else {
				var46 = arg5[var36] * 255 / arg10.field1573;
				if (var46 < 0) {
					var46 = 0;
				} else if (var46 > 255) {
					var46 = 255;
				}
			}
			var40.field907 = class662.method3057(method15391(arg6[var36] >> 8, this.field9437[arg0][arg1 + 1] - this.field9447[arg0][arg1 + 1]), arg10.field1575, var46);
			var40.field913 = (short) var42;
		}
		if (arg5 != null) {
			var40.field910 = (short) arg5[var35];
			var40.field905 = (short) arg5[var36];
			var40.field909 = (short) arg5[var34];
			var40.field908 = (short) arg5[var33];
		}
		this.field9438[arg0][arg1] = var40;
	}

	@ObfuscatedName("aee.av(II)I")
	public static int method15391(int arg0, int arg1) {
		int var2 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 253) {
			var2 = 253;
		}
		int var3 = (arg0 & 0xFF00) * arg1 >> 15;
		if (var3 < 2) {
			var3 = 2;
		} else if (var3 > 253) {
			var3 = 253;
		}
		int var4 = (arg0 & 0xFF) * arg1 >> 7;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 253) {
			var4 = 253;
		}
		return var2 << 16 | var3 << 8 | var4;
	}

	@ObfuscatedName("aee.k()V")
	public void method1555() {
		this.field9437 = null;
		this.field9447 = null;
	}

	@ObfuscatedName("aee.f(III[[ZZI)V")
	public void method1548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		if (this.field9423.field9778 == null || this.field9423.field9781 == null) {
			throw new IllegalStateException("");
		}
		class426 var7 = this.field9423.field9803;
		this.field9430 = var7.field4315[0];
		this.field9431 = var7.field4315[1];
		this.field9432 = var7.field4315[2];
		this.field9450 = var7.field4315[3];
		this.field9434 = var7.field4315[4];
		this.field9435 = var7.field4315[5];
		this.field9436 = var7.field4315[6];
		this.field9422 = var7.field4315[7];
		this.field9445 = var7.field4315[8];
		this.field9439 = var7.field4315[9];
		this.field9440 = var7.field4315[10];
		this.field9441 = var7.field4315[11];
		this.field9442 = var7.field4315[12];
		this.field9446 = var7.field4315[13];
		this.field9424 = var7.field4315[14];
		this.field9444 = var7.field4315[15];
		for (int var8 = 0; var8 < arg2 + arg2; var8++) {
			for (int var9 = 0; var9 < arg2 + arg2; var9++) {
				if (arg3[var8][var9]) {
					int var10 = arg0 - arg2 + var8;
					int var11 = arg1 - arg2 + var9;
					if (var10 >= 0 && var10 < this.field1235 && var11 >= 0 && var11 < this.field1234) {
						this.method15392(var10, var11, arg5);
					}
				}
			}
		}
	}

	@ObfuscatedName("aee.ao(III)V")
	public void method15392(int arg0, int arg1, int arg2) {
		class55 var4 = this.field9423.method15674(Thread.currentThread());
		var4.field837.field935 = 0;
		if (this.field9438 != null) {
			this.method15405(arg0, arg1, var4.field867, var4, var4.field837, var4.field863, var4.field827, var4.field831, var4.field866, var4.field859, arg2);
		} else if (this.field9425 != null) {
			this.method15393(arg0, arg1, var4.field837, var4.field863, var4.field827, var4.field831, var4.field866, var4.field859, arg2);
		} else if (this.field9429 != null) {
			this.method15394(arg0, arg1, var4.field867, var4, var4.field837, var4.field863, var4.field827, var4.field831, var4.field866, var4.field859, arg2);
		}
	}

	@ObfuscatedName("aee.aj(IILbd;[F[F[F[F[FI)V")
	public void method15393(int arg0, int arg1, class65 arg2, float[] arg3, float[] arg4, float[] arg5, float[] arg6, float[] arg7, int arg8) {
		class64 var10 = this.field9425[arg0][arg1];
		if (var10 == null) {
			class59 var66 = this.field9443[arg0][arg1];
			if (var66 != null) {
				if (arg8 != 0) {
					if ((var66.field879 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				for (int var67 = 0; var67 < var66.field887; var67++) {
					int var68 = (arg0 << this.field1236) + var66.field884[var67];
					short var69 = var66.field888[var67];
					int var70 = (arg1 << this.field1236) + var66.field882[var67];
					float var71 = (float) var70 * this.field9440 + (float) var68 * this.field9432 + (float) var69 * this.field9436 + this.field9424;
					float var72 = (float) var70 * this.field9441 + (float) var68 * this.field9450 + (float) var69 * this.field9422 + this.field9444;
					if (var71 < -var72) {
						return;
					}
					float var73 = (float) var70 * this.field9445 + (float) var68 * this.field9430 + (float) var69 * this.field9434 + this.field9442;
					float var74 = (float) var70 * this.field9439 + (float) var68 * this.field9431 + (float) var69 * this.field9435 + this.field9446;
					arg3[var67] = arg2.field964 * var73 / var72 + arg2.field934;
					arg4[var67] = arg2.field942 * var74 / var72 + arg2.field941;
					arg5[var67] = arg2.field932 * var71 / var72 + arg2.field958;
					arg6[var67] = var72;
				}
				if (var66.field880 == null) {
					for (int var88 = 0; var88 < var66.field878; var88++) {
						short var89 = var66.field881[var88];
						short var90 = var66.field885[var88];
						short var91 = var66.field886[var88];
						float var92 = arg3[var89];
						float var93 = arg3[var90];
						float var94 = arg3[var91];
						float var95 = arg4[var89];
						float var96 = arg4[var90];
						float var97 = arg4[var91];
						if ((var92 - var93) * (var97 - var96) - (var94 - var93) * (var95 - var96) > 0.0F) {
							int var98 = var66.field889[var88];
							if (var98 != -1) {
								arg2.field936 = var92 < 0.0F || var93 < 0.0F || var94 < 0.0F || var92 > (float) arg2.field945 || var93 > (float) arg2.field945 || var94 > (float) arg2.field945;
								arg2.method1028(true, true, false, var95, var96, var97, var92, var93, var94, arg5[var89], arg5[var90], arg5[var91], (float) class662.method6807(var98, var66.field883[var89]), (float) class662.method6807(var98, var66.field883[var90]), (float) class662.method6807(var98, var66.field883[var91]));
							}
						}
					}
				} else {
					for (int var75 = 0; var75 < var66.field878; var75++) {
						short var76 = var66.field881[var75];
						short var77 = var66.field885[var75];
						short var78 = var66.field886[var75];
						float var79 = arg3[var76];
						float var80 = arg3[var77];
						float var81 = arg3[var78];
						float var82 = arg4[var76];
						float var83 = arg4[var77];
						float var84 = arg4[var78];
						if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0.0F) {
							arg2.field936 = var79 < 0.0F || var80 < 0.0F || var81 < 0.0F || var79 > (float) arg2.field945 || var80 > (float) arg2.field945 || var81 > (float) arg2.field945;
							boolean var85 = false;
							if (var66.field880[var75] != -1) {
								class118 var86 = this.field9423.field1597.method2043(var66.field880[var75] & 0xFFFF);
								var85 = var86.field1330;
							}
							if (var85) {
								arg2.method1033(true, true, false, var82, var83, var84, var79, var80, var81, arg5[var76], arg5[var77], arg5[var78], arg6[var76], arg6[var77], arg6[var78], (float) var66.field884[var76] / (float) this.field1233, (float) var66.field884[var77] / (float) this.field1233, (float) var66.field884[var78] / (float) this.field1233, (float) var66.field882[var76] / (float) this.field1233, (float) var66.field882[var77] / (float) this.field1233, (float) var66.field882[var78] / (float) this.field1233, Statics.field8149[var66.field883[var76] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field8149[var66.field883[var77] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field8149[var66.field883[var78] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, var66.field880[var75] & 0xFFFF);
							} else {
								int var87 = var66.field889[var75];
								if (var87 != -1) {
									arg2.method1028(true, true, false, var82, var83, var84, var79, var80, var81, arg5[var76], arg5[var77], arg5[var78], (float) class662.method6807(var87, var66.field883[var76]), (float) class662.method6807(var87, var66.field883[var77]), (float) class662.method6807(var87, var66.field883[var78]));
								}
							}
						}
					}
				}
			}
		} else if ((var10.field925 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((var10.field925 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			int var11 = this.field1233 * arg0;
			int var12 = this.field1233 + var11;
			int var13 = this.field1233 * arg1;
			int var14 = this.field1233 + var13;
			float var19;
			float var21;
			float var23;
			float var25;
			float var29;
			float var31;
			float var32;
			float var34;
			float var36;
			float var37;
			float var39;
			float var41;
			float var42;
			float var44;
			float var46;
			float var47;
			if ((var10.field925 & 0x1) == 0) {
				int var48 = this.field1237[arg0][arg1];
				int var49 = this.field1237[arg0 + 1][arg1];
				int var50 = this.field1237[arg0 + 1][arg1 + 1];
				int var51 = this.field1237[arg0][arg1 + 1];
				float var52 = (float) var13 * this.field9440 + (float) var11 * this.field9432 + (float) var48 * this.field9436 + this.field9424;
				var19 = (float) var13 * this.field9441 + (float) var11 * this.field9450 + (float) var48 * this.field9422 + this.field9444;
				if (var52 < -var19) {
					return;
				}
				float var53 = (float) var13 * this.field9440 + (float) var12 * this.field9432 + (float) var49 * this.field9436 + this.field9424;
				var21 = (float) var13 * this.field9441 + (float) var12 * this.field9450 + (float) var49 * this.field9422 + this.field9444;
				if (var53 < -var21) {
					return;
				}
				float var54 = (float) var14 * this.field9440 + (float) var12 * this.field9432 + (float) var50 * this.field9436 + this.field9424;
				var23 = (float) var14 * this.field9441 + (float) var12 * this.field9450 + (float) var50 * this.field9422 + this.field9444;
				if (var54 < -var23) {
					return;
				}
				float var55 = (float) var14 * this.field9440 + (float) var11 * this.field9432 + (float) var51 * this.field9436 + this.field9424;
				var25 = (float) var14 * this.field9441 + (float) var11 * this.field9450 + (float) var51 * this.field9422 + this.field9444;
				if (var55 < -var25) {
					return;
				}
				float var56 = (float) var13 * this.field9445 + (float) var11 * this.field9430 + (float) var48 * this.field9434 + this.field9442;
				var29 = arg2.field964 * var56 / var19 + arg2.field934;
				float var57 = (float) var13 * this.field9439 + (float) var11 * this.field9431 + (float) var48 * this.field9435 + this.field9446;
				var31 = arg2.field942 * var57 / var19 + arg2.field941;
				var32 = arg2.field932 * var52 / var19 + arg2.field958;
				float var58 = (float) var13 * this.field9445 + (float) var12 * this.field9430 + (float) var49 * this.field9434 + this.field9442;
				var34 = arg2.field964 * var58 / var21 + arg2.field934;
				float var59 = (float) var13 * this.field9439 + (float) var12 * this.field9431 + (float) var49 * this.field9435 + this.field9446;
				var36 = arg2.field942 * var59 / var21 + arg2.field941;
				var37 = arg2.field932 * var53 / var21 + arg2.field958;
				float var60 = (float) var14 * this.field9445 + (float) var12 * this.field9430 + (float) var50 * this.field9434 + this.field9442;
				var39 = arg2.field964 * var60 / var23 + arg2.field934;
				float var61 = (float) var14 * this.field9439 + (float) var12 * this.field9431 + (float) var50 * this.field9435 + this.field9446;
				var41 = arg2.field942 * var61 / var23 + arg2.field941;
				var42 = arg2.field932 * var54 / var23 + arg2.field958;
				float var62 = (float) var14 * this.field9445 + (float) var11 * this.field9430 + (float) var51 * this.field9434 + this.field9442;
				var44 = arg2.field964 * var62 / var25 + arg2.field934;
				float var63 = (float) var14 * this.field9439 + (float) var11 * this.field9431 + (float) var51 * this.field9435 + this.field9446;
				var46 = arg2.field942 * var63 / var25 + arg2.field941;
				var47 = arg2.field932 * var55 / var25 + arg2.field958;
			} else {
				int var15 = this.field1237[arg0][arg1];
				float var16 = (float) var15 * this.field9436;
				float var17 = (float) var15 * this.field9422;
				float var18 = (float) var13 * this.field9440 + (float) var11 * this.field9432 + var16 + this.field9424;
				var19 = (float) var13 * this.field9441 + (float) var11 * this.field9450 + var17 + this.field9444;
				if (var18 < -var19) {
					return;
				}
				float var20 = (float) var13 * this.field9440 + (float) var12 * this.field9432 + var16 + this.field9424;
				var21 = (float) var13 * this.field9441 + (float) var12 * this.field9450 + var17 + this.field9444;
				if (var20 < -var21) {
					return;
				}
				float var22 = (float) var14 * this.field9440 + (float) var12 * this.field9432 + var16 + this.field9424;
				var23 = (float) var14 * this.field9441 + (float) var12 * this.field9450 + var17 + this.field9444;
				if (var22 < -var23) {
					return;
				}
				float var24 = (float) var14 * this.field9440 + (float) var11 * this.field9432 + var16 + this.field9424;
				var25 = (float) var14 * this.field9441 + (float) var11 * this.field9450 + var17 + this.field9444;
				if (var24 < -var25) {
					return;
				}
				float var26 = (float) var15 * this.field9434;
				float var27 = (float) var15 * this.field9435;
				float var28 = (float) var13 * this.field9445 + (float) var11 * this.field9430 + var26 + this.field9442;
				var29 = arg2.field964 * var28 / var19 + arg2.field934;
				float var30 = (float) var13 * this.field9439 + (float) var11 * this.field9431 + var27 + this.field9446;
				var31 = arg2.field942 * var30 / var19 + arg2.field941;
				var32 = arg2.field932 * var18 / var19 + arg2.field958;
				float var33 = (float) var13 * this.field9445 + (float) var12 * this.field9430 + var26 + this.field9442;
				var34 = arg2.field964 * var33 / var21 + arg2.field934;
				float var35 = (float) var13 * this.field9439 + (float) var12 * this.field9431 + var27 + this.field9446;
				var36 = arg2.field942 * var35 / var21 + arg2.field941;
				var37 = arg2.field932 * var20 / var21 + arg2.field958;
				float var38 = (float) var14 * this.field9445 + (float) var12 * this.field9430 + var26 + this.field9442;
				var39 = arg2.field964 * var38 / var23 + arg2.field934;
				float var40 = (float) var14 * this.field9439 + (float) var12 * this.field9431 + var27 + this.field9446;
				var41 = arg2.field942 * var40 / var23 + arg2.field941;
				var42 = arg2.field932 * var22 / var23 + arg2.field958;
				float var43 = (float) var14 * this.field9445 + (float) var11 * this.field9430 + var26 + this.field9442;
				var44 = arg2.field964 * var43 / var25 + arg2.field934;
				float var45 = (float) var14 * this.field9439 + (float) var11 * this.field9431 + var27 + this.field9446;
				var46 = arg2.field942 * var45 / var25 + arg2.field941;
				var47 = arg2.field932 * var24 / var25 + arg2.field958;
			}
			boolean var64 = false;
			if (var10.field926 != -1) {
				class118 var65 = this.field9423.field1597.method2043(var10.field926 & 0xFFFF);
				var64 = var65.field1330;
			}
			if ((var36 - var46) * (var39 - var44) - (var34 - var44) * (var41 - var46) > 0.0F) {
				arg2.field936 = var39 < 0.0F || var44 < 0.0F || var34 < 0.0F || var39 > (float) arg2.field945 || var44 > (float) arg2.field945 || var34 > (float) arg2.field945;
				if (var64) {
					arg2.method1033(true, true, false, var41, var46, var36, var39, var44, var34, var42, var47, var37, var23, var25, var21, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Statics.field8149[var10.field928 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field8149[var10.field929 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field8149[var10.field927 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, var10.field926 & 0xFFFF);
				} else {
					arg2.method1028(true, true, false, var41, var46, var36, var39, var44, var34, var42, var47, var37, (float) (var10.field928 & 0xFFFF), (float) (var10.field929 & 0xFFFF), (float) (var10.field927 & 0xFFFF));
				}
			}
			if ((var29 - var34) * (var46 - var36) - (var31 - var36) * (var44 - var34) > 0.0F) {
				arg2.field936 = var29 < 0.0F || var34 < 0.0F || var44 < 0.0F || var29 > (float) arg2.field945 || var34 > (float) arg2.field945 || var44 > (float) arg2.field945;
				if (var64) {
					arg2.method1033(true, true, false, var31, var36, var46, var29, var34, var44, var32, var37, var47, var19, var21, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Statics.field8149[var10.field931 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field8149[var10.field927 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field8149[var10.field929 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, var10.field926 & 0xFFFF);
				} else {
					arg2.method1028(true, true, false, var31, var36, var46, var29, var34, var44, var32, var37, var47, (float) (var10.field931 & 0xFFFF), (float) (var10.field927 & 0xFFFF), (float) (var10.field929 & 0xFFFF));
				}
			}
		}
	}

	@ObfuscatedName("aee.ay(IIZLaz;Lbd;[F[F[F[F[FI)V")
	public void method15405(int arg0, int arg1, boolean arg2, class55 arg3, class65 arg4, float[] arg5, float[] arg6, float[] arg7, float[] arg8, float[] arg9, int arg10) {
		class62 var12 = this.field9438[arg0][arg1];
		if (var12 == null) {
			class63 var99 = this.field9428[arg0][arg1];
			if (var99 != null) {
				if (arg10 != 0) {
					if ((var99.field922 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				for (int var100 = 0; var100 < var99.field919; var100++) {
					int var101 = (arg0 << this.field1236) + var99.field917[var100];
					int var102 = var99.field915[var100];
					int var103 = (arg1 << this.field1236) + var99.field916[var100];
					float var104 = (float) var103 * this.field9440 + (float) var101 * this.field9432 + (float) var102 * this.field9436 + this.field9424;
					float var105 = (float) var103 * this.field9441 + (float) var101 * this.field9450 + (float) var102 * this.field9422 + this.field9444;
					if (var104 < -var105) {
						return;
					}
					float var106 = arg4.field932 * var104 / var105 + arg4.field958;
					arg9[var100] = 0.0F;
					if (arg2) {
						float var107 = var104 - arg3.field865;
						if (var107 > 0.0F) {
							float var108 = var107 / arg3.field855;
							if (var108 > 1.0F) {
								var108 = 1.0F;
							}
							arg9[var100] = var108;
							int var109 = (int) ((float) var99.field920[var100] * var108);
							if (var109 > 0) {
								var102 -= var109;
							}
						}
					} else if (arg3.field826) {
						float var110 = var104 - arg3.field865;
						if (var110 > 0.0F) {
							arg9[var100] = var110 / arg3.field855;
							if (arg9[var100] > 1.0F) {
								arg9[var100] = 1.0F;
							}
						}
					}
					float var111 = (float) var103 * this.field9445 + (float) var101 * this.field9430 + (float) var102 * this.field9434 + this.field9442;
					float var112 = (float) var103 * this.field9439 + (float) var101 * this.field9431 + (float) var102 * this.field9435 + this.field9446;
					arg5[var100] = arg4.field964 * var111 / var105 + arg4.field934;
					arg6[var100] = arg4.field942 * var112 / var105 + arg4.field941;
					arg7[var100] = var106;
					arg8[var100] = var105;
				}
				if (var99.field924 == null) {
					for (int var128 = 0; var128 < var99.field918; var128++) {
						int var129 = var128 * 3;
						int var130 = var129 + 1;
						int var131 = var130 + 1;
						float var132 = arg5[var129];
						float var133 = arg5[var130];
						float var134 = arg5[var131];
						float var135 = arg6[var129];
						float var136 = arg6[var130];
						float var137 = arg6[var131];
						float var138 = arg9[var129] + arg9[var130] + arg9[var131];
						if ((var132 - var133) * (var137 - var136) - (var134 - var133) * (var135 - var136) > 0.0F) {
							arg4.field936 = var132 < 0.0F || var133 < 0.0F || var134 < 0.0F || var132 > (float) arg4.field945 || var133 > (float) arg4.field945 || var134 > (float) arg4.field945;
							if (var138 >= 3.0F) {
								arg4.method1032(true, true, false, var135, var136, var137, var132, var133, var134, arg7[var129], arg7[var130], arg7[var131], arg3.field858);
							} else if (var138 > 0.0F) {
								if ((var99.field921[var129] & 0xFFFFFF) != 0) {
									arg4.method1030(true, true, false, var135, var136, var137, var132, var133, var134, arg7[var129], arg7[var130], arg7[var131], class662.method19201(var99.field921[var129], arg3.field858, arg9[var129] * 255.0F), class662.method19201(var99.field921[var130], arg3.field858, arg9[var130] * 255.0F), class662.method19201(var99.field921[var131], arg3.field858, arg9[var131] * 255.0F));
								}
							} else if ((var99.field921[var129] & 0xFFFFFF) != 0) {
								arg4.method1030(true, true, false, var135, var136, var137, var132, var133, var134, arg7[var129], arg7[var130], arg7[var131], var99.field921[var129], var99.field921[var130], var99.field921[var131]);
							}
						}
					}
				} else {
					for (int var113 = 0; var113 < var99.field918; var113++) {
						int var114 = var113 * 3;
						int var115 = var114 + 1;
						int var116 = var115 + 1;
						float var117 = arg5[var114];
						float var118 = arg5[var115];
						float var119 = arg5[var116];
						float var120 = arg6[var114];
						float var121 = arg6[var115];
						float var122 = arg6[var116];
						float var123 = arg9[var114] + arg9[var115] + arg9[var116];
						if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0.0F) {
							arg4.field936 = var117 < 0.0F || var118 < 0.0F || var119 < 0.0F || var117 > (float) arg4.field945 || var118 > (float) arg4.field945 || var119 > (float) arg4.field945;
							class118 var124 = null;
							boolean var125 = false;
							if (var99.field924[var113] != -1) {
								var124 = this.field9423.field1597.method2043(var99.field924[var113] & 0xFFFF);
								var125 = var124.field1330;
							}
							if (var123 >= 3.0F) {
								arg4.method1032(true, true, false, var120, var121, var122, var117, var118, var119, arg7[var114], arg7[var115], arg7[var116], arg3.field858);
							} else if (var123 > 0.0F) {
								if (var125) {
									int var126 = -16777216;
									if (this.method15396(var124.field1308)) {
										var126 = -1694498816;
									}
									arg4.method1033(true, true, false, var120, var121, var122, var117, var118, var119, arg7[var114], arg7[var115], arg7[var116], arg8[var114], arg8[var115], arg8[var116], (float) var99.field917[var114] / (float) this.field1233, (float) var99.field917[var115] / (float) this.field1233, (float) var99.field917[var116] / (float) this.field1233, (float) var99.field916[var114] / (float) this.field1233, (float) var99.field916[var115] / (float) this.field1233, (float) var99.field916[var116] / (float) this.field1233, var126 | var99.field921[var114] & 0xFFFFFF, var126 | var99.field921[var115] & 0xFFFFFF, var126 | var99.field921[var116] & 0xFFFFFF, arg3.field858, arg9[var114] * 255.0F, arg9[var115] * 255.0F, arg9[var116] * 255.0F, var99.field924[var113] & 0xFFFF);
								} else if ((var99.field921[var114] & 0xFFFFFF) != 0) {
									arg4.method1030(true, true, false, var120, var121, var122, var117, var118, var119, arg7[var114], arg7[var115], arg7[var116], class662.method5859(var99.field921[var114], (int) (arg9[var114] * 255.0F) << 24 | arg3.field858), class662.method5859(var99.field921[var115], (int) (arg9[var115] * 255.0F) << 24 | arg3.field858), class662.method5859(var99.field921[var116], (int) (arg9[var116] * 255.0F) << 24 | arg3.field858));
									arg4.field935 = 0;
								}
							} else if (var125) {
								int var127 = -16777216;
								if (this.method15396(var124.field1308)) {
									var127 = -1694498816;
								}
								arg4.method1033(true, true, false, var120, var121, var122, var117, var118, var119, arg7[var114], arg7[var115], arg7[var116], arg8[var114], arg8[var115], arg8[var116], (float) var99.field917[var114] / (float) this.field1233, (float) var99.field917[var115] / (float) this.field1233, (float) var99.field917[var116] / (float) this.field1233, (float) var99.field916[var114] / (float) this.field1233, (float) var99.field916[var115] / (float) this.field1233, (float) var99.field916[var116] / (float) this.field1233, var127 | var99.field921[var114] & 0xFFFFFF, var127 | var99.field921[var115] & 0xFFFFFF, var127 | var99.field921[var116] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, var99.field924[var113] & 0xFFFF);
							} else if ((var99.field921[var114] & 0xFFFFFF) != 0) {
								arg4.method1030(true, true, false, var120, var121, var122, var117, var118, var119, arg7[var114], arg7[var115], arg7[var116], var99.field921[var114], var99.field921[var115], var99.field921[var116]);
								arg4.field935 = 0;
							}
						}
					}
				}
			}
		} else if ((var12.field911 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((var12.field911 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			int var13 = this.field1233 * arg0;
			int var14 = this.field1233 + var13;
			int var15 = this.field1233 * arg1;
			int var16 = this.field1233 + var15;
			float var17 = 0.0F;
			float var18 = 0.0F;
			float var19 = 0.0F;
			float var20 = 0.0F;
			float var25;
			float var27;
			float var29;
			float var31;
			float var32;
			float var33;
			float var34;
			float var35;
			float var43;
			float var45;
			float var47;
			float var49;
			float var51;
			float var53;
			float var55;
			float var57;
			if ((var12.field911 & 0x1) == 0 || arg2) {
				int var58 = this.field1237[arg0][arg1];
				int var59 = this.field1237[arg0 + 1][arg1];
				int var60 = this.field1237[arg0 + 1][arg1 + 1];
				int var61 = this.field1237[arg0][arg1 + 1];
				float var62 = (float) var15 * this.field9440 + (float) var13 * this.field9432 + (float) var58 * this.field9436 + this.field9424;
				var25 = (float) var15 * this.field9441 + (float) var13 * this.field9450 + (float) var58 * this.field9422 + this.field9444;
				if (var62 < -var25) {
					return;
				}
				float var63 = (float) var15 * this.field9440 + (float) var14 * this.field9432 + (float) var59 * this.field9436 + this.field9424;
				var27 = (float) var15 * this.field9441 + (float) var14 * this.field9450 + (float) var59 * this.field9422 + this.field9444;
				if (var63 < -var27) {
					return;
				}
				float var64 = (float) var16 * this.field9440 + (float) var14 * this.field9432 + (float) var60 * this.field9436 + this.field9424;
				var29 = (float) var16 * this.field9441 + (float) var14 * this.field9450 + (float) var60 * this.field9422 + this.field9444;
				if (var64 < -var29) {
					return;
				}
				float var65 = (float) var16 * this.field9440 + (float) var13 * this.field9432 + (float) var61 * this.field9436 + this.field9424;
				var31 = (float) var16 * this.field9441 + (float) var13 * this.field9450 + (float) var61 * this.field9422 + this.field9444;
				if (var65 < -var31) {
					return;
				}
				var32 = arg4.field932 * var62 / var25 + arg4.field958;
				var33 = arg4.field932 * var63 / var27 + arg4.field958;
				var34 = arg4.field932 * var64 / var29 + arg4.field958;
				var35 = arg4.field932 * var65 / var31 + arg4.field958;
				if (arg2) {
					float var66 = var62 - arg3.field865;
					if (var66 > 0.0F) {
						float var67 = var66 / arg3.field855;
						if (var67 > 1.0F) {
							var67 = 1.0F;
						}
						var17 = var67;
						int var68 = (int) ((float) var12.field908 * var67);
						if (var68 > 0) {
							var58 -= var68;
						}
					}
					float var69 = var63 - arg3.field865;
					if (var69 > 0.0F) {
						float var70 = var69 / arg3.field855;
						if (var70 > 1.0F) {
							var70 = 1.0F;
						}
						var18 = var70;
						int var71 = (int) ((float) var12.field909 * var70);
						if (var71 > 0) {
							var59 -= var71;
						}
					}
					float var72 = var64 - arg3.field865;
					if (var72 > 0.0F) {
						float var73 = var72 / arg3.field855;
						if (var73 > 1.0F) {
							var73 = 1.0F;
						}
						var19 = var73;
						int var74 = (int) ((float) var12.field910 * var73);
						if (var74 > 0) {
							var60 -= var74;
						}
					}
					float var75 = var65 - arg3.field865;
					if (var75 > 0.0F) {
						float var76 = var75 / arg3.field855;
						if (var76 > 1.0F) {
							var76 = 1.0F;
						}
						var20 = var76;
						int var77 = (int) ((float) var12.field905 * var76);
						if (var77 > 0) {
							var61 -= var77;
						}
					}
				} else if (arg3.field826) {
					float var78 = var62 - arg3.field865;
					if (var78 > 0.0F) {
						var17 = var78 / arg3.field855;
						if (var17 > 1.0F) {
							var17 = 1.0F;
						}
					}
					float var79 = var63 - arg3.field865;
					if (var79 > 0.0F) {
						var18 = var79 / arg3.field855;
						if (var18 > 1.0F) {
							var18 = 1.0F;
						}
					}
					float var80 = var64 - arg3.field865;
					if (var80 > 0.0F) {
						var19 = var80 / arg3.field855;
						if (var19 > 1.0F) {
							var19 = 1.0F;
						}
					}
					float var81 = var65 - arg3.field865;
					if (var81 > 0.0F) {
						var20 = var81 / arg3.field855;
						if (var20 > 1.0F) {
							var20 = 1.0F;
						}
					}
				}
				float var82 = (float) var15 * this.field9445 + (float) var13 * this.field9430 + (float) var58 * this.field9434 + this.field9442;
				var43 = arg4.field964 * var82 / var25 + arg4.field934;
				float var83 = (float) var15 * this.field9439 + (float) var13 * this.field9431 + (float) var58 * this.field9435 + this.field9446;
				var45 = arg4.field942 * var83 / var25 + arg4.field941;
				float var84 = (float) var15 * this.field9445 + (float) var14 * this.field9430 + (float) var59 * this.field9434 + this.field9442;
				var47 = arg4.field964 * var84 / var27 + arg4.field934;
				float var85 = (float) var15 * this.field9439 + (float) var14 * this.field9431 + (float) var59 * this.field9435 + this.field9446;
				var49 = arg4.field942 * var85 / var27 + arg4.field941;
				float var86 = (float) var16 * this.field9445 + (float) var14 * this.field9430 + (float) var60 * this.field9434 + this.field9442;
				var51 = arg4.field964 * var86 / var29 + arg4.field934;
				float var87 = (float) var16 * this.field9439 + (float) var14 * this.field9431 + (float) var60 * this.field9435 + this.field9446;
				var53 = arg4.field942 * var87 / var29 + arg4.field941;
				float var88 = (float) var16 * this.field9445 + (float) var13 * this.field9430 + (float) var61 * this.field9434 + this.field9442;
				var55 = arg4.field964 * var88 / var31 + arg4.field934;
				float var89 = (float) var16 * this.field9439 + (float) var13 * this.field9431 + (float) var61 * this.field9435 + this.field9446;
				var57 = arg4.field942 * var89 / var31 + arg4.field941;
			} else {
				int var21 = this.field1237[arg0][arg1];
				float var22 = (float) var21 * this.field9436;
				float var23 = (float) var21 * this.field9422;
				float var24 = (float) var15 * this.field9440 + (float) var13 * this.field9432 + var22 + this.field9424;
				var25 = (float) var15 * this.field9441 + (float) var13 * this.field9450 + var23 + this.field9444;
				if (var24 < -var25) {
					return;
				}
				float var26 = (float) var15 * this.field9440 + (float) var14 * this.field9432 + var22 + this.field9424;
				var27 = (float) var15 * this.field9441 + (float) var14 * this.field9450 + var23 + this.field9444;
				if (var26 < -var27) {
					return;
				}
				float var28 = (float) var16 * this.field9440 + (float) var14 * this.field9432 + var22 + this.field9424;
				var29 = (float) var16 * this.field9441 + (float) var14 * this.field9450 + var23 + this.field9444;
				if (var28 < -var29) {
					return;
				}
				float var30 = (float) var16 * this.field9440 + (float) var13 * this.field9432 + var22 + this.field9424;
				var31 = (float) var16 * this.field9441 + (float) var13 * this.field9450 + var23 + this.field9444;
				if (var30 < -var31) {
					return;
				}
				var32 = arg4.field932 * var24 / var25 + arg4.field958;
				var33 = arg4.field932 * var26 / var27 + arg4.field958;
				var34 = arg4.field932 * var28 / var29 + arg4.field958;
				var35 = arg4.field932 * var30 / var31 + arg4.field958;
				if (arg3.field826) {
					float var36 = var24 - arg3.field865;
					if (var36 > 0.0F) {
						var17 = var36 / arg3.field855;
						if (var17 > 1.0F) {
							var17 = 1.0F;
						}
					}
					float var37 = var26 - arg3.field865;
					if (var37 > 0.0F) {
						var18 = var37 / arg3.field855;
						if (var18 > 1.0F) {
							var18 = 1.0F;
						}
					}
					float var38 = var28 - arg3.field865;
					if (var38 > 0.0F) {
						var19 = var38 / arg3.field855;
						if (var19 > 1.0F) {
							var19 = 1.0F;
						}
					}
					float var39 = var30 - arg3.field865;
					if (var39 > 0.0F) {
						var20 = var39 / arg3.field855;
						if (var20 > 1.0F) {
							var20 = 1.0F;
						}
					}
				}
				float var40 = (float) var21 * this.field9434;
				float var41 = (float) var21 * this.field9435;
				float var42 = (float) var15 * this.field9445 + (float) var13 * this.field9430 + var40 + this.field9442;
				var43 = arg4.field964 * var42 / var25 + arg4.field934;
				float var44 = (float) var15 * this.field9439 + (float) var13 * this.field9431 + var41 + this.field9446;
				var45 = arg4.field942 * var44 / var25 + arg4.field941;
				float var46 = (float) var15 * this.field9445 + (float) var14 * this.field9430 + var40 + this.field9442;
				var47 = arg4.field964 * var46 / var27 + arg4.field934;
				float var48 = (float) var15 * this.field9439 + (float) var14 * this.field9431 + var41 + this.field9446;
				var49 = arg4.field942 * var48 / var27 + arg4.field941;
				float var50 = (float) var16 * this.field9445 + (float) var14 * this.field9430 + var40 + this.field9442;
				var51 = arg4.field964 * var50 / var29 + arg4.field934;
				float var52 = (float) var16 * this.field9439 + (float) var14 * this.field9431 + var41 + this.field9446;
				var53 = arg4.field942 * var52 / var29 + arg4.field941;
				float var54 = (float) var16 * this.field9445 + (float) var13 * this.field9430 + var40 + this.field9442;
				var55 = arg4.field964 * var54 / var31 + arg4.field934;
				float var56 = (float) var16 * this.field9439 + (float) var13 * this.field9431 + var41 + this.field9446;
				var57 = arg4.field942 * var56 / var31 + arg4.field941;
			}
			class118 var90 = null;
			boolean var91 = false;
			if (var12.field913 != -1) {
				var90 = this.field9423.field1597.method2043(var12.field913 & 0xFFFF);
				var91 = var90.field1330;
			}
			boolean var92 = var90 != null && this.method15396(var90.field1308);
			float var93 = var18 + var19 + var20;
			if ((var49 - var57) * (var51 - var55) - (var47 - var55) * (var53 - var57) > 0.0F) {
				arg4.field936 = var51 < 0.0F || var55 < 0.0F || var47 < 0.0F || var51 > (float) arg4.field945 || var55 > (float) arg4.field945 || var47 > (float) arg4.field945;
				if (var93 >= 3.0F) {
					arg4.method1032(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, arg3.field858);
				} else if (var93 > 0.0F) {
					if (var91) {
						int var94 = -16777216;
						if (var92) {
							var94 = -1694498816;
						}
						arg4.method1033(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var94 | var12.field906 & 0xFFFFFF, var94 | var12.field907 & 0xFFFFFF, var94 | var12.field904 & 0xFFFFFF, arg3.field858, var19 * 255.0F, var20 * 255.0F, var18 * 255.0F, var12.field913 & 0xFFFF);
					} else {
						if (var92) {
							arg4.field935 = 100;
						}
						arg4.method1030(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, class662.method5859(var12.field906, (int) (var19 * 255.0F) << 24 | arg3.field858), class662.method5859(var12.field907, (int) (var20 * 255.0F) << 24 | arg3.field858), class662.method5859(var12.field904, (int) (var18 * 255.0F) << 24 | arg3.field858));
						arg4.field935 = 0;
					}
				} else if (var91) {
					int var95 = -16777216;
					if (var92) {
						var95 = -1694498816;
					}
					arg4.method1033(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var95 | var12.field906 & 0xFFFFFF, var95 | var12.field907 & 0xFFFFFF, var95 | var12.field904 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, var12.field913 & 0xFFFF);
				} else {
					if (var92) {
						arg4.field935 = 100;
					}
					arg4.method1030(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, var12.field906, var12.field907, var12.field904);
					arg4.field935 = 0;
				}
			}
			float var96 = var17 + var18 + var20;
			if ((var43 - var47) * (var57 - var49) - (var45 - var49) * (var55 - var47) > 0.0F) {
				arg4.field936 = var43 < 0.0F || var47 < 0.0F || var55 < 0.0F || var43 > (float) arg4.field945 || var47 > (float) arg4.field945 || var55 > (float) arg4.field945;
				if (var96 < 3.0F) {
					if (var92) {
						arg4.field935 = -1694498816;
					}
					if (var96 > 0.0F) {
						if (var91) {
							int var97 = -16777216;
							if (var92) {
								var97 = -1694498816;
							}
							arg4.method1033(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var97 | var12.field912 & 0xFFFFFF, var97 | var12.field904 & 0xFFFFFF, var97 | var12.field907 & 0xFFFFFF, arg3.field858, var17 * 255.0F, var18 * 255.0F, var20 * 255.0F, var12.field913 & 0xFFFF);
						} else {
							if (var92) {
								arg4.field935 = 100;
							}
							arg4.method1030(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, class662.method5859(var12.field912, (int) (var17 * 255.0F) << 24 | arg3.field858), class662.method5859(var12.field904, (int) (var18 * 255.0F) << 24 | arg3.field858), class662.method5859(var12.field907, (int) (var20 * 255.0F) << 24 | arg3.field858));
							arg4.field935 = 0;
						}
					} else if (var91) {
						int var98 = -16777216;
						if (var92) {
							var98 = -1694498816;
						}
						arg4.method1033(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var98 | var12.field912 & 0xFFFFFF, var98 | var12.field904 & 0xFFFFFF, var98 | var12.field907 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, var12.field913 & 0xFFFF);
					} else {
						if (var92) {
							arg4.field935 = 100;
						}
						arg4.method1030(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, var12.field912, var12.field904, var12.field907);
						arg4.field935 = 0;
					}
				} else {
					arg4.method1032(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, arg3.field858);
				}
			}
		}
	}

	@ObfuscatedName("aee.ab(IIZLaz;Lbd;[F[F[F[F[FI)V")
	public void method15394(int arg0, int arg1, boolean arg2, class55 arg3, class65 arg4, float[] arg5, float[] arg6, float[] arg7, float[] arg8, float[] arg9, int arg10) {
		class67 var12 = this.field9429[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || var12 == null) {
			return;
		}
		for (int var13 = 0; var13 < var12.field981; var13++) {
			int var14 = (arg0 << this.field1236) + var12.field975[var13];
			int var15 = var12.field977[var13];
			int var16 = (arg1 << this.field1236) + var12.field978[var13];
			float var17 = (float) var16 * this.field9440 + (float) var14 * this.field9432 + (float) var15 * this.field9436 + this.field9424;
			float var18 = (float) var16 * this.field9441 + (float) var14 * this.field9450 + (float) var15 * this.field9422 + this.field9444;
			if (var17 < -var18) {
				return;
			}
			arg9[var13] = 0.0F;
			if (arg2) {
				float var19 = var17 - arg3.field865;
				if (var19 > 0.0F) {
					float var20 = var19 / arg3.field855;
					if (var20 > 1.0F) {
						var20 = 1.0F;
					}
					arg9[var13] = var20;
					int var21 = (int) ((float) var12.field976[var13] * var20);
					if (var21 > 0) {
						var15 -= var21;
					}
				}
			} else if (arg3.field826) {
				float var22 = var17 - arg3.field865;
				if (var22 > 0.0F) {
					arg9[var13] = var22 / arg3.field855;
					if (arg9[var13] > 1.0F) {
						arg9[var13] = 1.0F;
					}
				}
			}
			float var23 = (float) var16 * this.field9445 + (float) var14 * this.field9430 + (float) var15 * this.field9434 + this.field9442;
			float var24 = (float) var16 * this.field9439 + (float) var14 * this.field9431 + (float) var15 * this.field9435 + this.field9446;
			arg5[var13] = arg4.field964 * var23 / var18 + arg4.field934;
			arg6[var13] = arg4.field942 * var24 / var18 + arg4.field941;
			arg7[var13] = arg4.field932 * var17 / var18 + arg4.field958;
			arg8[var13] = var18;
		}
		float var25 = (float) this.field1233;
		for (int var26 = 0; var26 < var12.field979; var26++) {
			int var27 = var26 * 3;
			int var28 = var27 + 1;
			int var29 = var28 + 1;
			float var30 = arg5[var27];
			float var31 = arg5[var28];
			float var32 = arg5[var29];
			float var33 = arg6[var27];
			float var34 = arg6[var28];
			float var35 = arg6[var29];
			if ((var30 - var31) * (var35 - var34) - (var32 - var31) * (var33 - var34) > 0.0F) {
				arg4.field936 = var30 < 0.0F || var31 < 0.0F || var32 < 0.0F || var30 > (float) arg4.field945 || var31 > (float) arg4.field945 || var32 > (float) arg4.field945;
				if (arg9[var27] + arg9[var28] + arg9[var29] < 3.0F) {
					int var36 = arg0 << this.field1236;
					int var37 = arg1 << this.field1236;
					if ((var12.field982[var27] & 0xFFFFFF) != 0) {
						if (var12.field980[var27] == -1 || var12.field980[var28] == -1 || var12.field980[var29] == -1) {
							if (arg9[var27] + arg9[var28] + arg9[var29] > 0.0F) {
								arg4.method1030(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], class662.method19201(var12.field982[var27], arg3.field858, arg9[var27] * 255.0F), class662.method19201(var12.field982[var28], arg3.field858, arg9[var28] * 255.0F), class662.method19201(var12.field982[var29], arg3.field858, arg9[var29] * 255.0F));
							} else {
								arg4.method1030(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], var12.field982[var27], var12.field982[var28], var12.field982[var29]);
							}
						} else if (var12.field980[var27] == var12.field980[var28] && var12.field980[var27] == var12.field980[var29] && var12.field974[var27] == var12.field974[var28] && var12.field974[var27] == var12.field974[var29]) {
							arg4.method1033(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], arg8[var27], arg8[var28], arg8[var29], (float) (var12.field975[var27] + var36) / (float) var12.field974[var27], (float) (var12.field975[var28] + var36) / (float) var12.field974[var28], (float) (var12.field975[var29] + var36) / (float) var12.field974[var29], (float) (var12.field978[var27] + var37) / (float) var12.field974[var27], (float) (var12.field978[var28] + var37) / (float) var12.field974[var28], (float) (var12.field978[var29] + var37) / (float) var12.field974[var29], var12.field982[var27], var12.field982[var28], var12.field982[var29], arg3.field858, arg9[var27] * 255.0F, arg9[var28] * 255.0F, arg9[var29] * 255.0F, var12.field980[var27] & 0xFFFF);
						} else {
							arg4.method1042(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], arg8[var27], arg8[var28], arg8[var29], (float) (var12.field975[var27] + var36) / var25, (float) (var12.field975[var28] + var36) / var25, (float) (var12.field975[var29] + var36) / var25, (float) (var12.field978[var27] + var37) / var25, (float) (var12.field978[var28] + var37) / var25, (float) (var12.field978[var29] + var37) / var25, var12.field982[var27], var12.field982[var28], var12.field982[var29], arg3.field858, arg9[var27] * 255.0F, arg9[var28] * 255.0F, arg9[var29] * 255.0F, var12.field980[var27] & 0xFFFF, var25 / (float) var12.field974[var27], var12.field980[var28] & 0xFFFF, var25 / (float) var12.field974[var28], var12.field980[var29] & 0xFFFF, var25 / (float) var12.field974[var29]);
						}
					}
				} else {
					arg4.method1032(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], arg3.field858);
				}
			}
		}
	}

	@ObfuscatedName("aee.az(I)Z")
	public boolean method15396(int arg0) {
		if ((this.field9427 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@ObfuscatedName("aee.w(IIIIIII[[Z)V")
	public void method1526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		class55 var9 = this.field9423.method15674(Thread.currentThread());
		class65 var10 = var9.field837;
		var10.field935 = 0;
		var10.field936 = true;
		this.field9423.method15687();
		if (this.field9438 != null || this.field9429 != null) {
			this.method15395(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field863, var9.field827);
		} else if (this.field9425 != null) {
			this.method15401(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field863, var9.field827);
		}
	}

	@ObfuscatedName("aee.aa(IIIIIII[[ZLaz;Lbd;[F[F)V")
	public void method15401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class55 arg8, class65 arg9, float[] arg10, float[] arg11) {
		int var13 = (arg6 - arg4) * arg2 / 256;
		int var14 = arg2 >> 8;
		boolean var15 = arg8.field834;
		this.field9423.method2219(false);
		arg9.field933 = false;
		arg9.field968 = false;
		int var16 = arg0;
		int var17 = arg1 + var13;
		for (int var18 = arg3; var18 < arg5; var18++) {
			for (int var19 = arg4; var19 < arg6; var19++) {
				if (arg7[var18 - arg3][var19 - arg4]) {
					if (this.field9425[var18][var19] != null) {
						class64 var20 = this.field9425[var18][var19];
						if (var20.field926 != -1 && (var20.field925 & 0x2) == 0 && var20.field930 == -1) {
							int var21 = this.field9423.method15695(var20.field926 & 0xFFFF);
							arg9.method1028(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class662.method6807(var21, var20.field928 & 0xFFFF), (float) class662.method6807(var21, var20.field929 & 0xFFFF), (float) class662.method6807(var21, var20.field927 & 0xFFFF));
							arg9.method1028(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class662.method6807(var21, var20.field931 & 0xFFFF), (float) class662.method6807(var21, var20.field927 & 0xFFFF), (float) class662.method6807(var21, var20.field929 & 0xFFFF));
						} else if (var20.field930 == -1) {
							arg9.method1028(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field928 & 0xFFFF), (float) (var20.field929 & 0xFFFF), (float) (var20.field927 & 0xFFFF));
							arg9.method1028(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field931 & 0xFFFF), (float) (var20.field927 & 0xFFFF), (float) (var20.field929 & 0xFFFF));
						} else {
							int var22 = var20.field930;
							arg9.method1028(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
							arg9.method1028(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
						}
					} else if (this.field9443[var18][var19] != null) {
						class59 var23 = this.field9443[var18][var19];
						for (int var24 = 0; var24 < var23.field887; var24++) {
							arg10[var24] = var23.field884[var24] * var14 / this.field1233 + var16;
							arg11[var24] = var17 - var23.field882[var24] * var14 / this.field1233;
						}
						for (int var25 = 0; var25 < var23.field878; var25++) {
							short var26 = var23.field881[var25];
							short var27 = var23.field885[var25];
							short var28 = var23.field886[var25];
							float var29 = arg10[var26];
							float var30 = arg10[var27];
							float var31 = arg10[var28];
							float var32 = arg11[var26];
							float var33 = arg11[var27];
							float var34 = arg11[var28];
							if (var23.field890 != null && var23.field890[var25] != -1) {
								int var35 = var23.field890[var25];
								arg9.method1028(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float) class662.method6807(var35, var23.field883[var26]), (float) class662.method6807(var35, var23.field883[var27]), (float) class662.method6807(var35, var23.field883[var28]));
							} else if (var23.field880 == null || var23.field880[var25] == -1) {
								int var37 = var23.field889[var25];
								arg9.method1028(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float) class662.method6807(var37, var23.field883[var26]), (float) class662.method6807(var37, var23.field883[var27]), (float) class662.method6807(var37, var23.field883[var28]));
							} else {
								int var36 = this.field9423.method15695(var23.field880[var25] & 0xFFFF);
								arg9.method1028(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float) class662.method6807(var36, var23.field883[var26]), (float) class662.method6807(var36, var23.field883[var27]), (float) class662.method6807(var36, var23.field883[var28]));
							}
						}
					}
				}
				var17 -= var14;
			}
			var17 = arg1 + var13;
			var16 += var14;
		}
		arg9.field933 = true;
		this.field9423.method2219(var15);
	}

	@ObfuscatedName("aee.af(IIIIIII[[ZLaz;Lbd;[F[F)V")
	public void method15395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class55 arg8, class65 arg9, float[] arg10, float[] arg11) {
		int var13 = (arg6 - arg4) * arg2 / 256;
		int var14 = arg2 >> 8;
		boolean var15 = arg8.field834;
		this.field9423.method2219(false);
		arg9.field933 = false;
		arg9.field968 = false;
		int var16 = arg0;
		int var17 = arg1 + var13;
		for (int var18 = arg3; var18 < arg5; var18++) {
			for (int var19 = arg4; var19 < arg6; var19++) {
				if (arg7[var18 - arg3][var19 - arg4]) {
					if (this.field9438 == null) {
						if (this.field9429[var18][var19] != null) {
							class67 var37 = this.field9429[var18][var19];
							for (int var38 = 0; var38 < var37.field981; var38++) {
								arg10[var38] = var37.field975[var38] * var14 / this.field1233 + var16;
								arg11[var38] = var17 - var37.field978[var38] * var14 / this.field1233;
							}
							for (int var39 = 0; var39 < var37.field979; var39++) {
								int var40 = var39 * 3;
								int var41 = var40 + 1;
								int var42 = var41 + 1;
								float var43 = arg10[var40];
								float var44 = arg10[var41];
								float var45 = arg10[var42];
								float var46 = arg11[var40];
								float var47 = arg11[var41];
								float var48 = arg11[var42];
								if (var37.field984 == null || var37.field984[var39] == 0) {
									arg9.method1030(true, true, false, var46, var47, var48, var43, var44, var45, 100.0F, 100.0F, 100.0F, var37.field982[var40], var37.field982[var41], var37.field982[var42]);
								} else {
									int var49 = var37.field984[var39];
									arg9.method1030(true, true, false, var46, var47, var48, var43, var44, var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
								}
							}
						}
					} else if (this.field9438[var18][var19] != null) {
						class62 var20 = this.field9438[var18][var19];
						if (var20.field913 != -1 && (var20.field911 & 0x2) == 0 && var20.field903 == 0) {
							int var21 = this.field9423.method15695(var20.field913 & 0xFFFF);
							arg9.method1028(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class662.method6807(var21, var20.field906), (float) class662.method6807(var21, var20.field907), (float) class662.method6807(var21, var20.field904));
							arg9.method1028(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class662.method6807(var21, var20.field912), (float) class662.method6807(var21, var20.field904), (float) class662.method6807(var21, var20.field907));
						} else if (var20.field903 == 0) {
							arg9.method1030(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field906, var20.field907, var20.field904);
							arg9.method1030(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field912, var20.field904, var20.field907);
						} else {
							int var22 = var20.field903;
							arg9.method1030(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class662.method5859(var22, var20.field906 & 0xFF000000), class662.method5859(var22, var20.field907 & 0xFF000000), class662.method5859(var22, var20.field904 & 0xFF000000));
							arg9.method1030(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class662.method5859(var22, var20.field912 & 0xFF000000), class662.method5859(var22, var20.field904 & 0xFF000000), class662.method5859(var22, var20.field907 & 0xFF000000));
						}
					} else if (this.field9428[var18][var19] != null) {
						class63 var23 = this.field9428[var18][var19];
						for (int var24 = 0; var24 < var23.field919; var24++) {
							arg10[var24] = var23.field917[var24] * var14 / this.field1233 + var16;
							arg11[var24] = var17 - var23.field916[var24] * var14 / this.field1233;
						}
						for (int var25 = 0; var25 < var23.field918; var25++) {
							int var26 = var25 * 3;
							int var27 = var26 + 1;
							int var28 = var27 + 1;
							float var29 = arg10[var26];
							float var30 = arg10[var27];
							float var31 = arg10[var28];
							float var32 = arg11[var26];
							float var33 = arg11[var27];
							float var34 = arg11[var28];
							if (var23.field914 != null && var23.field914[var25] != 0 && (var23.field924 == null || var23.field924 != null && var23.field924[var25] == -1)) {
								int var35 = var23.field914[var25];
								arg9.method1030(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, class662.method5859(var35, -16777216 - (var23.field921[var26] & -16777216)), class662.method5859(var35, -16777216 - (var23.field921[var27] & -16777216)), class662.method5859(var35, -16777216 - (var23.field921[var28] & -16777216)));
							} else if (var23.field924 == null || var23.field924[var25] == -1) {
								arg9.method1030(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, var23.field921[var26], var23.field921[var27], var23.field921[var28]);
							} else {
								int var36 = this.field9423.method15695(var23.field924[var25] & 0xFFFF);
								arg9.method1028(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
							}
						}
					}
				}
				var17 -= var14;
			}
			var17 = arg1 + var13;
			var16 += var14;
		}
		arg9.field933 = true;
		this.field9423.method2219(var15);
	}

	@ObfuscatedName("aee.d(IILara;)Lara;")
	public class1175 method1531(int arg0, int arg1, class1175 arg2) {
		return null;
	}

	@ObfuscatedName("aee.c(Lara;IIIIZ)V")
	public void method1532(class1175 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	@ObfuscatedName("aee.v(Lara;IIIIZ)Z")
	public boolean method1535(class1175 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return false;
	}

	@ObfuscatedName("aee.r(Lara;IIIIZ)V")
	public void method1543(class1175 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	@ObfuscatedName("aee.o(Lakf;[I)V")
	public void method1549(class973 arg0, int[] arg1) {
	}
}
