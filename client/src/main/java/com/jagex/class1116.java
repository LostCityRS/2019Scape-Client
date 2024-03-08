package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("apd")
public class class1116 extends class829 {

	@ObfuscatedName("apd.am")
	public byte[] field11907;

	@ObfuscatedName("apd.au")
	public int[] field11906;

	public class1116(class848 arg0, byte[] arg1, int[] arg2, int arg3, int arg4) {
		super(arg0, arg3, arg4);
		this.field11907 = arg1;
		this.field11906 = arg2;
	}

	@ObfuscatedName("apd.u(IIII[III)V")
	public void method1469(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("apd.z(IIII[I[III)V")
	public void method1476(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("apd.p(IIIIII)V")
	public void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("apd.d(III)V")
	public void method1441(int arg0, int arg1, int arg2) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("apd.l()Ldp;")
	public class130 method1437() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("apd.r(IIIII)V")
	public void method1443(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.field9373.method15654()) {
			throw new IllegalStateException();
		}
		int[] var6 = this.field9373.field9778;
		if (var6 == null) {
			return;
		}
		int var7 = this.field9373.field9779;
		int var8 = this.field9358 + arg0;
		int var9 = this.field9359 + arg1;
		int var10 = var7 * var9 + var8;
		int var11 = 0;
		int var12 = this.field9372;
		int var13 = this.field9356;
		int var14 = var7 - var13;
		int var15 = 0;
		if (var9 < this.field9373.field9784) {
			int var16 = this.field9373.field9784 - var9;
			var12 -= var16;
			var9 = this.field9373.field9784;
			var11 += var13 * var16;
			var10 += var7 * var16;
		}
		if (var9 + var12 > this.field9373.field9785) {
			var12 -= var9 + var12 - this.field9373.field9785;
		}
		if (var8 < this.field9373.field9805) {
			int var17 = this.field9373.field9805 - var8;
			var13 -= var17;
			var8 = this.field9373.field9805;
			var11 += var17;
			var10 += var17;
			var15 += var17;
			var14 += var17;
		}
		if (var8 + var13 > this.field9373.field9801) {
			int var18 = var8 + var13 - this.field9373.field9801;
			var13 -= var18;
			var15 += var18;
			var14 += var18;
		}
		if (var13 <= 0 || var12 <= 0) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 1) {
				for (int var19 = -var12; var19 < 0; var19++) {
					int var20 = var10 + var13 - 3;
					while (var10 < var20) {
						var6[var10++] = this.field11906[this.field11907[var11++] & 0xFF];
						var6[var10++] = this.field11906[this.field11907[var11++] & 0xFF];
						var6[var10++] = this.field11906[this.field11907[var11++] & 0xFF];
						var6[var10++] = this.field11906[this.field11907[var11++] & 0xFF];
					}
					var20 += 3;
					while (var10 < var20) {
						var6[var10++] = this.field11906[this.field11907[var11++] & 0xFF];
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 0) {
				int var21 = arg3 >> 16 & 0xFF;
				int var22 = arg3 >> 8 & 0xFF;
				int var23 = arg3 & 0xFF;
				for (int var24 = -var12; var24 < 0; var24++) {
					for (int var25 = -var13; var25 < 0; var25++) {
						int var26 = this.field11906[this.field11907[var11++] & 0xFF];
						int var27 = (var26 & 0xFF0000) * var21 & 0xFF000000;
						int var28 = (var26 & 0xFF00) * var22 & 0xFF0000;
						int var29 = (var26 & 0xFF) * var23 & 0xFF00;
						var6[var10++] = (var27 | var28 | var29) >>> 8;
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 3) {
				for (int var30 = -var12; var30 < 0; var30++) {
					for (int var31 = -var13; var31 < 0; var31++) {
						int var32 = this.field11906[this.field11907[var11++] & 0xFF];
						int var33 = arg3 + var32;
						int var34 = (arg3 & 0xFF00FF) + (var32 & 0xFF00FF);
						int var35 = (var33 - var34 & 0x10000) + (var34 & 0x1000100);
						var6[var10++] = var33 - var35 | var35 - (var35 >>> 8);
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 2) {
				int var36 = arg3 >>> 24;
				int var37 = 256 - var36;
				int var38 = (arg3 & 0xFF00FF) * var37 & 0xFF00FF00;
				int var39 = (arg3 & 0xFF00) * var37 & 0xFF0000;
				int var40 = (var38 | var39) >>> 8;
				for (int var41 = -var12; var41 < 0; var41++) {
					for (int var42 = -var13; var42 < 0; var42++) {
						int var43 = this.field11906[this.field11907[var11++] & 0xFF];
						int var44 = (var43 & 0xFF00FF) * var36 & 0xFF00FF00;
						int var45 = (var43 & 0xFF00) * var36 & 0xFF0000;
						var6[var10++] = ((var44 | var45) >>> 8) + var40;
					}
					var10 += var14;
					var11 += var15;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg4 != 1) {
			if (arg4 != 2) {
				throw new IllegalArgumentException();
			}
			if (arg2 == 1) {
				for (int var100 = -var12; var100 < 0; var100++) {
					for (int var101 = -var13; var101 < 0; var101++) {
						byte var102 = this.field11907[var11++];
						if (var102 == 0) {
							var10++;
						} else {
							int var103 = this.field11906[var102 & 0xFF];
							int var104 = var6[var10];
							int var105 = var103 + var104;
							int var106 = (var103 & 0xFF00FF) + (var104 & 0xFF00FF);
							int var107 = (var105 - var106 & 0x10000) + (var106 & 0x1000100);
							var6[var10++] = var105 - var107 | var107 - (var107 >>> 8);
						}
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 0) {
				int var108 = arg3 >> 16 & 0xFF;
				int var109 = arg3 >> 8 & 0xFF;
				int var110 = arg3 & 0xFF;
				for (int var111 = -var12; var111 < 0; var111++) {
					for (int var112 = -var13; var112 < 0; var112++) {
						byte var113 = this.field11907[var11++];
						if (var113 == 0) {
							var10++;
						} else {
							int var114 = this.field11906[var113 & 0xFF];
							int var115 = (var114 & 0xFF0000) * var108 & 0xFF000000;
							int var116 = (var114 & 0xFF00) * var109 & 0xFF0000;
							int var117 = (var114 & 0xFF) * var110 & 0xFF00;
							int var118 = (var115 | var116 | var117) >>> 8;
							int var119 = var6[var10];
							int var120 = var118 + var119;
							int var121 = (var118 & 0xFF00FF) + (var119 & 0xFF00FF);
							int var122 = (var120 - var121 & 0x10000) + (var121 & 0x1000100);
							var6[var10++] = var120 - var122 | var122 - (var122 >>> 8);
						}
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 3) {
				for (int var123 = -var12; var123 < 0; var123++) {
					for (int var124 = -var13; var124 < 0; var124++) {
						byte var125 = this.field11907[var11++];
						int var126 = var125 > 0 ? this.field11906[var125] : 0;
						int var127 = arg3 + var126;
						int var128 = (arg3 & 0xFF00FF) + (var126 & 0xFF00FF);
						int var129 = (var127 - var128 & 0x10000) + (var128 & 0x1000100);
						int var130 = var127 - var129 | var129 - (var129 >>> 8);
						int var131 = var6[var10];
						int var132 = var130 + var131;
						int var133 = (var130 & 0xFF00FF) + (var131 & 0xFF00FF);
						int var134 = (var132 - var133 & 0x10000) + (var133 & 0x1000100);
						var6[var10++] = var132 - var134 | var134 - (var134 >>> 8);
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 2) {
				int var135 = arg3 >>> 24;
				int var136 = 256 - var135;
				int var137 = (arg3 & 0xFF00FF) * var136 & 0xFF00FF00;
				int var138 = (arg3 & 0xFF00) * var136 & 0xFF0000;
				int var139 = (var137 | var138) >>> 8;
				for (int var140 = -var12; var140 < 0; var140++) {
					for (int var141 = -var13; var141 < 0; var141++) {
						byte var142 = this.field11907[var11++];
						if (var142 == 0) {
							var10++;
						} else {
							int var143 = this.field11906[var142 & 0xFF];
							int var144 = (var143 & 0xFF00FF) * var135 & 0xFF00FF00;
							int var145 = (var143 & 0xFF00) * var135 & 0xFF0000;
							int var146 = ((var144 | var145) >>> 8) + var139;
							int var147 = var6[var10];
							int var148 = var146 + var147;
							int var149 = (var146 & 0xFF00FF) + (var147 & 0xFF00FF);
							int var150 = (var148 - var149 & 0x10000) + (var149 & 0x1000100);
							var6[var10++] = var148 - var150 | var150 - (var150 >>> 8);
						}
					}
					var10 += var14;
					var11 += var15;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			for (int var46 = -var12; var46 < 0; var46++) {
				for (int var47 = -var13; var47 < 0; var47++) {
					byte var48 = this.field11907[var11++];
					if (var48 == 0) {
						var10++;
					} else {
						int var49 = this.field11906[var48 & 0xFF] | 0xFF000000;
						short var50 = 255;
						byte var51 = 0;
						int var52 = var6[var10];
						var6[var10++] = ((var49 & 0xFF00FF) * var50 + (var52 & 0xFF00FF) * var51 >> 8 & 0xFFFF00FF) + (((var49 & 0xFF00FF00) >>> 8) * var50 + ((var52 & 0xFF00FF00) >>> 8) * var51 & 0xFF00FF00);
					}
				}
				var10 += var14;
				var11 += var15;
			}
		} else if (arg2 == 0) {
			if ((arg3 & 0xFFFFFF) == 16777215) {
				int var53 = arg3 >>> 24;
				int var54 = 256 - var53;
				for (int var55 = -var12; var55 < 0; var55++) {
					for (int var56 = -var13; var56 < 0; var56++) {
						byte var57 = this.field11907[var11++];
						if (var57 == 0) {
							var10++;
						} else {
							int var58 = this.field11906[var57 & 0xFF];
							int var59 = var6[var10];
							var6[var10++] = ((var58 & 0xFF00FF) * var53 + (var59 & 0xFF00FF) * var54 & 0xFF00FF00) + ((var58 & 0xFF00) * var53 + (var59 & 0xFF00) * var54 & 0xFF0000) >> 8;
						}
					}
					var10 += var14;
					var11 += var15;
				}
			} else {
				int var60 = arg3 >> 16 & 0xFF;
				int var61 = arg3 >> 8 & 0xFF;
				int var62 = arg3 & 0xFF;
				int var63 = arg3 >>> 24;
				int var64 = 256 - var63;
				for (int var65 = -var12; var65 < 0; var65++) {
					for (int var66 = -var13; var66 < 0; var66++) {
						byte var67 = this.field11907[var11++];
						if (var67 == 0) {
							var10++;
						} else {
							int var68 = this.field11906[var67 & 0xFF];
							if (var63 == 255) {
								int var74 = (var68 & 0xFF0000) * var60 & 0xFF000000;
								int var75 = (var68 & 0xFF00) * var61 & 0xFF0000;
								int var76 = (var68 & 0xFF) * var62 & 0xFF00;
								var6[var10++] = (var74 | var75 | var76) >>> 8;
							} else {
								int var69 = (var68 & 0xFF0000) * var60 & 0xFF000000;
								int var70 = (var68 & 0xFF00) * var61 & 0xFF0000;
								int var71 = (var68 & 0xFF) * var62 & 0xFF00;
								int var72 = (var69 | var70 | var71) >>> 8;
								int var73 = var6[var10];
								var6[var10++] = ((var72 & 0xFF00FF) * var63 + (var73 & 0xFF00FF) * var64 & 0xFF00FF00) + ((var72 & 0xFF00) * var63 + (var73 & 0xFF00) * var64 & 0xFF0000) >> 8;
							}
						}
					}
					var10 += var14;
					var11 += var15;
				}
			}
		} else if (arg2 == 3) {
			int var77 = arg3 >>> 24;
			int var78 = 256 - var77;
			for (int var79 = -var12; var79 < 0; var79++) {
				for (int var80 = -var13; var80 < 0; var80++) {
					byte var81 = this.field11907[var11++];
					int var82 = var81 > 0 ? this.field11906[var81] : 0;
					int var83 = arg3 + var82;
					int var84 = (arg3 & 0xFF00FF) + (var82 & 0xFF00FF);
					int var85 = (var83 - var84 & 0x10000) + (var84 & 0x1000100);
					int var86 = var83 - var85 | var85 - (var85 >>> 8);
					if (var82 == 0 && var77 != 255) {
						int var88 = var6[var10];
						var86 = ((var86 & 0xFF00FF) * var77 + (var88 & 0xFF00FF) * var78 & 0xFF00FF00) + ((var86 & 0xFF00) * var77 + (var88 & 0xFF00) * var78 & 0xFF0000) >> 8;
					}
					var6[var10++] = var86;
				}
				var10 += var14;
				var11 += var15;
			}
		} else if (arg2 == 2) {
			int var89 = arg3 >>> 24;
			int var90 = 256 - var89;
			int var91 = (arg3 & 0xFF00FF) * var90 & 0xFF00FF00;
			int var92 = (arg3 & 0xFF00) * var90 & 0xFF0000;
			int var93 = (var91 | var92) >>> 8;
			for (int var94 = -var12; var94 < 0; var94++) {
				for (int var95 = -var13; var95 < 0; var95++) {
					byte var96 = this.field11907[var11++];
					if (var96 == 0) {
						var10++;
					} else {
						int var97 = this.field11906[var96 & 0xFF];
						int var98 = (var97 & 0xFF00FF) * var89 & 0xFF00FF00;
						int var99 = (var97 & 0xFF00) * var89 & 0xFF0000;
						var6[var10++] = ((var98 | var99) >>> 8) + var93;
					}
				}
				var10 += var14;
				var11 += var15;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("apd.v(IILch;II)V")
	public void method1444(int arg0, int arg1, class103 arg2, int arg3, int arg4) {
		if (this.field9373.method15654()) {
			throw new IllegalStateException();
		}
		int[] var6 = this.field9373.field9778;
		if (var6 == null) {
			return;
		}
		int var7 = this.field9358 + arg0;
		int var8 = this.field9359 + arg1;
		int var9 = 0;
		int var10 = this.field9373.field9779;
		int var11 = this.field9356;
		int var12 = this.field9372;
		int var13 = var10 - var11;
		int var14 = 0;
		int var15 = var8 * var10 + var7;
		if (var8 < this.field9373.field9784) {
			int var16 = this.field9373.field9784 - var8;
			var12 -= var16;
			var8 = this.field9373.field9784;
			var9 += var11 * var16;
			var15 += var10 * var16;
		}
		if (var8 + var12 > this.field9373.field9785) {
			var12 -= var8 + var12 - this.field9373.field9785;
		}
		if (var7 < this.field9373.field9805) {
			int var17 = this.field9373.field9805 - var7;
			var11 -= var17;
			var7 = this.field9373.field9805;
			var9 += var17;
			var15 += var17;
			var14 += var17;
			var13 += var17;
		}
		if (var7 + var11 > this.field9373.field9801) {
			int var18 = var7 + var11 - this.field9373.field9801;
			var11 -= var18;
			var14 += var18;
			var13 += var18;
		}
		if (var11 <= 0 || var12 <= 0) {
			return;
		}
		class832 var19 = (class832) arg2;
		int[] var20 = var19.field9414;
		int[] var21 = var19.field9415;
		int var22 = var8;
		if (arg4 > var8) {
			var22 = arg4;
			var15 += (arg4 - var8) * var10;
			var9 += (arg4 - var8) * this.field9356;
		}
		int var23 = var20.length + arg4 < var8 + var12 ? var20.length + arg4 : var8 + var12;
		for (int var24 = var22; var24 < var23; var24++) {
			int var25 = var20[var24 - arg4] + arg3;
			int var26 = var21[var24 - arg4];
			int var27 = var11;
			if (var7 > var25) {
				int var28 = var7 - var25;
				if (var28 >= var26) {
					var9 += var11 + var14;
					var15 += var11 + var13;
					continue;
				}
				var26 -= var28;
			} else {
				int var29 = var25 - var7;
				if (var29 >= var11) {
					var9 += var11 + var14;
					var15 += var11 + var13;
					continue;
				}
				var9 += var29;
				var27 = var11 - var29;
				var15 += var29;
			}
			int var30 = 0;
			if (var27 < var26) {
				var26 = var27;
			} else {
				var30 = var27 - var26;
			}
			for (int var31 = -var26; var31 < 0; var31++) {
				byte var32 = this.field11907[var9++];
				if (var32 == 0) {
					var15++;
				} else {
					var6[var15++] = this.field11906[var32 & 0xFF];
				}
			}
			var9 += var14 + var30;
			var15 += var13 + var30;
		}
	}

	@ObfuscatedName("apd.cl(ZZZIIFIIIIIIZ)V")
	public void method15358(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		int var14 = 0;
		int var15 = 0;
		int var16 = this.field9358 + this.field9356 + this.field9355;
		int var17 = this.field9372 + this.field9359 + this.field9360;
		int var18 = (var16 << 16) / arg6;
		int var19 = (var17 << 16) / arg7;
		if (this.field9358 > 0) {
			int var20 = ((this.field9358 << 16) + var18 - 1) / var18;
			arg3 += var20;
			var14 += var18 * var20 - (this.field9358 << 16);
		}
		if (this.field9359 > 0) {
			int var21 = ((this.field9359 << 16) + var19 - 1) / var19;
			arg4 += var21;
			var15 += var19 * var21 - (this.field9359 << 16);
		}
		if (this.field9356 < var16) {
			arg6 = ((this.field9356 << 16) - var14 + var18 - 1) / var18;
		}
		if (this.field9372 < var17) {
			arg7 = ((this.field9372 << 16) - var15 + var19 - 1) / var19;
		}
		int var22 = this.field9373.field9779 * arg4 + arg3;
		int var23 = this.field9373.field9779 - arg6;
		if (arg4 + arg7 > this.field9373.field9785) {
			arg7 -= arg4 + arg7 - this.field9373.field9785;
		}
		if (arg4 < this.field9373.field9784) {
			int var24 = this.field9373.field9784 - arg4;
			arg7 -= var24;
			var22 += this.field9373.field9779 * var24;
			var15 += var19 * var24;
		}
		if (arg3 + arg6 > this.field9373.field9801) {
			int var25 = arg3 + arg6 - this.field9373.field9801;
			arg6 -= var25;
			var23 += var25;
		}
		if (arg3 < this.field9373.field9805) {
			int var26 = this.field9373.field9805 - arg3;
			arg6 -= var26;
			var22 += var26;
			var14 += var18 * var26;
			var23 += var26;
		}
		float[] var27 = this.field9373.field9781;
		int[] var28 = this.field9373.field9778;
		if (arg10 == 0) {
			if (arg8 == 1) {
				int var29 = var14;
				for (int var30 = -arg7; var30 < 0; var30++) {
					int var31 = (var15 >> 16) * this.field9356;
					for (int var32 = -arg6; var32 < 0; var32++) {
						if (!arg1 || arg5 < var27[var22]) {
							if (arg0) {
								var28[var22] = this.field11906[this.field11907[(var14 >> 16) + var31] & 0xFF];
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var29;
					var22 += var23;
				}
			} else if (arg8 == 0) {
				int var33 = arg9 >> 16 & 0xFF;
				int var34 = arg9 >> 8 & 0xFF;
				int var35 = arg9 & 0xFF;
				int var36 = var14;
				for (int var37 = -arg7; var37 < 0; var37++) {
					int var38 = (var15 >> 16) * this.field9356;
					for (int var39 = -arg6; var39 < 0; var39++) {
						if (!arg1 || arg5 < var27[var22]) {
							if (arg0) {
								int var40 = this.field11906[this.field11907[(var14 >> 16) + var38] & 0xFF];
								int var41 = (var40 & 0xFF0000) * var33 & 0xFF000000;
								int var42 = (var40 & 0xFF00) * var34 & 0xFF0000;
								int var43 = (var40 & 0xFF) * var35 & 0xFF00;
								var28[var22] = (var41 | var42 | var43) >>> 8;
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var36;
					var22 += var23;
				}
			} else if (arg8 == 3) {
				int var44 = var14;
				for (int var45 = -arg7; var45 < 0; var45++) {
					int var46 = (var15 >> 16) * this.field9356;
					for (int var47 = -arg6; var47 < 0; var47++) {
						if (!arg1 || arg5 < var27[var22]) {
							if (arg0) {
								byte var48 = this.field11907[(var14 >> 16) + var46];
								int var49 = var48 > 0 ? this.field11906[var48] : 0;
								int var50 = arg9 + var49;
								int var51 = (arg9 & 0xFF00FF) + (var49 & 0xFF00FF);
								int var52 = (var50 - var51 & 0x10000) + (var51 & 0x1000100);
								var28[var22] = var50 - var52 | var52 - (var52 >>> 8);
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var44;
					var22 += var23;
				}
			} else if (arg8 == 2) {
				int var53 = arg9 >>> 24;
				int var54 = 256 - var53;
				int var55 = (arg9 & 0xFF00FF) * var54 & 0xFF00FF00;
				int var56 = (arg9 & 0xFF00) * var54 & 0xFF0000;
				int var57 = (var55 | var56) >>> 8;
				int var58 = var14;
				for (int var59 = -arg7; var59 < 0; var59++) {
					int var60 = (var15 >> 16) * this.field9356;
					for (int var61 = -arg6; var61 < 0; var61++) {
						if (!arg1 || arg5 < var27[var22]) {
							if (arg0) {
								int var62 = this.field11906[this.field11907[(var14 >> 16) + var60] & 0xFF];
								int var63 = (var62 & 0xFF00FF) * var53 & 0xFF00FF00;
								int var64 = (var62 & 0xFF00) * var53 & 0xFF0000;
								var28[var22] = ((var63 | var64) >>> 8) + var57;
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var58;
					var22 += var23;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg10 != 1) {
			if (arg10 != 2) {
				throw new IllegalArgumentException();
			}
			if (arg8 == 1) {
				int var124 = var14;
				for (int var125 = -arg7; var125 < 0; var125++) {
					int var126 = (var15 >> 16) * this.field9356;
					for (int var127 = -arg6; var127 < 0; var127++) {
						if (!arg1 || arg5 < var27[var22]) {
							byte var128 = this.field11907[(var14 >> 16) + var126];
							if (var128 != 0) {
								if (arg0) {
									int var129 = this.field11906[var128 & 0xFF];
									int var130 = var28[var22];
									int var131 = var129 + var130;
									int var132 = (var129 & 0xFF00FF) + (var130 & 0xFF00FF);
									int var133 = (var131 - var132 & 0x10000) + (var132 & 0x1000100);
									var28[var22] = var131 - var133 | var133 - (var133 >>> 8);
								}
								if (arg1 && arg12) {
									var27[var22] = arg5;
								}
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var124;
					var22 += var23;
				}
			} else if (arg8 == 0) {
				int var134 = var14;
				int var135 = arg9 >> 16 & 0xFF;
				int var136 = arg9 >> 8 & 0xFF;
				int var137 = arg9 & 0xFF;
				for (int var138 = -arg7; var138 < 0; var138++) {
					int var139 = (var15 >> 16) * this.field9356;
					for (int var140 = -arg6; var140 < 0; var140++) {
						if (!arg1 || arg5 < var27[var22]) {
							byte var141 = this.field11907[(var14 >> 16) + var139];
							if (var141 != 0) {
								if (arg0) {
									int var142 = this.field11906[var141 & 0xFF];
									int var143 = (var142 & 0xFF0000) * var135 & 0xFF000000;
									int var144 = (var142 & 0xFF00) * var136 & 0xFF0000;
									int var145 = (var142 & 0xFF) * var137 & 0xFF00;
									int var146 = (var143 | var144 | var145) >>> 8;
									int var147 = var28[var22];
									int var148 = var146 + var147;
									int var149 = (var146 & 0xFF00FF) + (var147 & 0xFF00FF);
									int var150 = (var148 - var149 & 0x10000) + (var149 & 0x1000100);
									var28[var22] = var148 - var150 | var150 - (var150 >>> 8);
								}
								if (arg1 && arg12) {
									var27[var22] = arg5;
								}
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var134;
					var22 += var23;
				}
			} else if (arg8 == 3) {
				int var151 = var14;
				for (int var152 = -arg7; var152 < 0; var152++) {
					int var153 = (var15 >> 16) * this.field9356;
					for (int var154 = -arg6; var154 < 0; var154++) {
						if (!arg1 || arg5 < var27[var22]) {
							if (arg0) {
								byte var155 = this.field11907[(var14 >> 16) + var153];
								int var156 = var155 > 0 ? this.field11906[var155] : 0;
								int var157 = arg9 + var156;
								int var158 = (arg9 & 0xFF00FF) + (var156 & 0xFF00FF);
								int var159 = (var157 - var158 & 0x10000) + (var158 & 0x1000100);
								int var160 = var157 - var159 | var159 - (var159 >>> 8);
								int var161 = var28[var22];
								int var162 = var160 + var161;
								int var163 = (var160 & 0xFF00FF) + (var161 & 0xFF00FF);
								int var164 = (var162 - var163 & 0x10000) + (var163 & 0x1000100);
								var28[var22] = var162 - var164 | var164 - (var164 >>> 8);
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var151;
					var22 += var23;
				}
			} else if (arg8 == 2) {
				int var165 = arg9 >>> 24;
				int var166 = 256 - var165;
				int var167 = (arg9 & 0xFF00FF) * var166 & 0xFF00FF00;
				int var168 = (arg9 & 0xFF00) * var166 & 0xFF0000;
				int var169 = (var167 | var168) >>> 8;
				int var170 = var14;
				for (int var171 = -arg7; var171 < 0; var171++) {
					int var172 = (var15 >> 16) * this.field9356;
					for (int var173 = -arg6; var173 < 0; var173++) {
						if (!arg1 || arg5 < var27[var22]) {
							byte var174 = this.field11907[(var14 >> 16) + var172];
							if (var174 != 0) {
								if (arg0) {
									int var175 = this.field11906[var174 & 0xFF];
									int var176 = (var175 & 0xFF00FF) * var165 & 0xFF00FF00;
									int var177 = (var175 & 0xFF00) * var165 & 0xFF0000;
									int var178 = ((var176 | var177) >>> 8) + var169;
									int var179 = var28[var22];
									int var180 = var178 + var179;
									int var181 = (var178 & 0xFF00FF) + (var179 & 0xFF00FF);
									int var182 = (var180 - var181 & 0x10000) + (var181 & 0x1000100);
									var28[var22] = var180 - var182 | var182 - (var182 >>> 8);
								}
								if (arg1 && arg12) {
									var27[var22] = arg5;
								}
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var170;
					var22 += var23;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg8 == 1) {
			int var65 = var14;
			for (int var66 = -arg7; var66 < 0; var66++) {
				int var67 = (var15 >> 16) * this.field9356;
				for (int var68 = -arg6; var68 < 0; var68++) {
					if (!arg1 || arg5 < var27[var22]) {
						byte var69 = this.field11907[(var14 >> 16) + var67];
						if (var69 != 0) {
							if (arg0) {
								var28[var22] = this.field11906[var69 & 0xFF];
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
					}
					var14 += var18;
					var22++;
				}
				var15 += var19;
				var14 = var65;
				var22 += var23;
			}
		} else if (arg8 == 0) {
			int var70 = var14;
			if ((arg9 & 0xFFFFFF) == 16777215) {
				int var71 = arg9 >>> 24;
				int var72 = 256 - var71;
				for (int var73 = -arg7; var73 < 0; var73++) {
					int var74 = (var15 >> 16) * this.field9356;
					for (int var75 = -arg6; var75 < 0; var75++) {
						if (!arg1 || arg5 < var27[var22]) {
							byte var76 = this.field11907[(var14 >> 16) + var74];
							if (var76 != 0) {
								if (arg0) {
									int var77 = this.field11906[var76 & 0xFF];
									int var78 = var28[var22];
									var28[var22] = ((var77 & 0xFF00FF) * var71 + (var78 & 0xFF00FF) * var72 & 0xFF00FF00) + ((var77 & 0xFF00) * var71 + (var78 & 0xFF00) * var72 & 0xFF0000) >> 8;
								}
								if (arg1 && arg12) {
									var27[var22] = arg5;
								}
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var70;
					var22 += var23;
				}
			} else {
				int var79 = arg9 >> 16 & 0xFF;
				int var80 = arg9 >> 8 & 0xFF;
				int var81 = arg9 & 0xFF;
				int var82 = arg9 >>> 24;
				int var83 = 256 - var82;
				for (int var84 = -arg7; var84 < 0; var84++) {
					int var85 = (var15 >> 16) * this.field9356;
					for (int var86 = -arg6; var86 < 0; var86++) {
						if (!arg1 || arg5 < var27[var22]) {
							byte var87 = this.field11907[(var14 >> 16) + var85];
							if (var87 != 0) {
								int var88 = this.field11906[var87 & 0xFF];
								if (var82 == 255) {
									if (arg0) {
										int var94 = (var88 & 0xFF0000) * var79 & 0xFF000000;
										int var95 = (var88 & 0xFF00) * var80 & 0xFF0000;
										int var96 = (var88 & 0xFF) * var81 & 0xFF00;
										var28[var22] = (var94 | var95 | var96) >>> 8;
									}
									if (arg1 && arg12) {
										var27[var22] = arg5;
									}
								} else {
									if (arg0) {
										int var89 = (var88 & 0xFF0000) * var79 & 0xFF000000;
										int var90 = (var88 & 0xFF00) * var80 & 0xFF0000;
										int var91 = (var88 & 0xFF) * var81 & 0xFF00;
										int var92 = (var89 | var90 | var91) >>> 8;
										int var93 = var28[var22];
										var28[var22] = ((var92 & 0xFF00FF) * var82 + (var93 & 0xFF00FF) * var83 & 0xFF00FF00) + ((var92 & 0xFF00) * var82 + (var93 & 0xFF00) * var83 & 0xFF0000) >> 8;
									}
									if (arg1 && arg12) {
										var27[var22] = arg5;
									}
								}
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var70;
					var22 += var23;
				}
			}
		} else if (arg8 == 3) {
			int var97 = var14;
			int var98 = arg9 >>> 24;
			int var99 = 256 - var98;
			for (int var100 = -arg7; var100 < 0; var100++) {
				int var101 = (var15 >> 16) * this.field9356;
				for (int var102 = -arg6; var102 < 0; var102++) {
					if (!arg1 || arg5 < var27[var22]) {
						if (arg0) {
							byte var103 = this.field11907[(var14 >> 16) + var101];
							int var104 = var103 > 0 ? this.field11906[var103] : 0;
							int var105 = arg9 + var104;
							int var106 = (arg9 & 0xFF00FF) + (var104 & 0xFF00FF);
							int var107 = (var105 - var106 & 0x10000) + (var106 & 0x1000100);
							int var108 = var105 - var107 | var107 - (var107 >>> 8);
							if (var104 == 0 && var98 != 255) {
								int var110 = var28[var22];
								var108 = ((var108 & 0xFF00FF) * var98 + (var110 & 0xFF00FF) * var99 & 0xFF00FF00) + ((var108 & 0xFF00) * var98 + (var110 & 0xFF00) * var99 & 0xFF0000) >> 8;
							}
							var28[var22] = var108;
						}
						if (arg1 && arg12) {
							var27[var22] = arg5;
						}
					}
					var14 += var18;
					var22++;
				}
				var15 += var19;
				var14 = var97;
				var22 += var23;
			}
		} else if (arg8 == 2) {
			int var111 = arg9 >>> 24;
			int var112 = 256 - var111;
			int var113 = (arg9 & 0xFF00FF) * var112 & 0xFF00FF00;
			int var114 = (arg9 & 0xFF00) * var112 & 0xFF0000;
			int var115 = (var113 | var114) >>> 8;
			int var116 = var14;
			for (int var117 = -arg7; var117 < 0; var117++) {
				int var118 = (var15 >> 16) * this.field9356;
				for (int var119 = -arg6; var119 < 0; var119++) {
					if (!arg1 || arg5 < var27[var22]) {
						byte var120 = this.field11907[(var14 >> 16) + var118];
						if (var120 != 0) {
							if (arg0) {
								int var121 = this.field11906[var120 & 0xFF];
								int var122 = (var121 & 0xFF00FF) * var111 & 0xFF00FF00;
								int var123 = (var121 & 0xFF00) * var111 & 0xFF0000;
								var28[var22] = ((var122 | var123) >>> 8) + var115;
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
					}
					var14 += var18;
					var22++;
				}
				var15 += var19;
				var14 = var116;
				var22 += var23;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("apd.y(IIIIIIII)V")
	public void method1447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.field9373.method15654()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			int[] var9 = this.field9373.field9778;
			if (var9 != null) {
				int var10 = 0;
				int var11 = 0;
				int var12 = this.field9373.field9779;
				int var13 = this.field9358 + this.field9356 + this.field9355;
				int var14 = this.field9372 + this.field9359 + this.field9360;
				int var15 = (var13 << 16) / arg2;
				int var16 = (var14 << 16) / arg3;
				if (this.field9358 > 0) {
					int var17 = ((this.field9358 << 16) + var15 - 1) / var15;
					arg0 += var17;
					var10 += var15 * var17 - (this.field9358 << 16);
				}
				if (this.field9359 > 0) {
					int var18 = ((this.field9359 << 16) + var16 - 1) / var16;
					arg1 += var18;
					var11 += var16 * var18 - (this.field9359 << 16);
				}
				if (this.field9356 < var13) {
					arg2 = ((this.field9356 << 16) - var10 + var15 - 1) / var15;
				}
				if (this.field9372 < var14) {
					arg3 = ((this.field9372 << 16) - var11 + var16 - 1) / var16;
				}
				int var19 = arg1 * var12 + arg0;
				int var20 = var12 - arg2;
				if (arg1 + arg3 > this.field9373.field9785) {
					arg3 -= arg1 + arg3 - this.field9373.field9785;
				}
				if (arg1 < this.field9373.field9784) {
					int var21 = this.field9373.field9784 - arg1;
					arg3 -= var21;
					var19 += var12 * var21;
					var11 += var16 * var21;
				}
				if (arg0 + arg2 > this.field9373.field9801) {
					int var22 = arg0 + arg2 - this.field9373.field9801;
					arg2 -= var22;
					var20 += var22;
				}
				if (arg0 < this.field9373.field9805) {
					int var23 = this.field9373.field9805 - arg0;
					arg2 -= var23;
					var19 += var23;
					var10 += var15 * var23;
					var20 += var23;
				}
				if (arg6 == 0) {
					if (arg4 == 1) {
						int var24 = var10;
						for (int var25 = -arg3; var25 < 0; var25++) {
							int var26 = (var11 >> 16) * this.field9356;
							for (int var27 = -arg2; var27 < 0; var27++) {
								var9[var19++] = this.field11906[this.field11907[(var10 >> 16) + var26] & 0xFF];
								var10 += var15;
							}
							var11 += var16;
							var10 = var24;
							var19 += var20;
						}
					} else if (arg4 == 0) {
						int var28 = arg5 >> 16 & 0xFF;
						int var29 = arg5 >> 8 & 0xFF;
						int var30 = arg5 & 0xFF;
						int var31 = var10;
						for (int var32 = -arg3; var32 < 0; var32++) {
							int var33 = (var11 >> 16) * this.field9356;
							for (int var34 = -arg2; var34 < 0; var34++) {
								int var35 = this.field11906[this.field11907[(var10 >> 16) + var33] & 0xFF];
								int var36 = (var35 & 0xFF0000) * var28 & 0xFF000000;
								int var37 = (var35 & 0xFF00) * var29 & 0xFF0000;
								int var38 = (var35 & 0xFF) * var30 & 0xFF00;
								var9[var19++] = (var36 | var37 | var38) >>> 8;
								var10 += var15;
							}
							var11 += var16;
							var10 = var31;
							var19 += var20;
						}
					} else if (arg4 == 3) {
						int var39 = var10;
						for (int var40 = -arg3; var40 < 0; var40++) {
							int var41 = (var11 >> 16) * this.field9356;
							for (int var42 = -arg2; var42 < 0; var42++) {
								byte var43 = this.field11907[(var10 >> 16) + var41];
								int var44 = var43 > 0 ? this.field11906[var43] : 0;
								int var45 = arg5 + var44;
								int var46 = (arg5 & 0xFF00FF) + (var44 & 0xFF00FF);
								int var47 = (var45 - var46 & 0x10000) + (var46 & 0x1000100);
								var9[var19++] = var45 - var47 | var47 - (var47 >>> 8);
								var10 += var15;
							}
							var11 += var16;
							var10 = var39;
							var19 += var20;
						}
					} else if (arg4 == 2) {
						int var48 = arg5 >>> 24;
						int var49 = 256 - var48;
						int var50 = (arg5 & 0xFF00FF) * var49 & 0xFF00FF00;
						int var51 = (arg5 & 0xFF00) * var49 & 0xFF0000;
						int var52 = (var50 | var51) >>> 8;
						int var53 = var10;
						for (int var54 = -arg3; var54 < 0; var54++) {
							int var55 = (var11 >> 16) * this.field9356;
							for (int var56 = -arg2; var56 < 0; var56++) {
								int var57 = this.field11906[this.field11907[(var10 >> 16) + var55] & 0xFF];
								int var58 = (var57 & 0xFF00FF) * var48 & 0xFF00FF00;
								int var59 = (var57 & 0xFF00) * var48 & 0xFF0000;
								var9[var19++] = ((var58 | var59) >>> 8) + var52;
								var10 += var15;
							}
							var11 += var16;
							var10 = var53;
							var19 += var20;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (arg6 != 1) {
					if (arg6 != 2) {
						throw new IllegalArgumentException();
					}
					if (arg4 == 1) {
						int var119 = var10;
						for (int var120 = -arg3; var120 < 0; var120++) {
							int var121 = (var11 >> 16) * this.field9356;
							for (int var122 = -arg2; var122 < 0; var122++) {
								byte var123 = this.field11907[(var10 >> 16) + var121];
								if (var123 == 0) {
									var19++;
								} else {
									int var124 = this.field11906[var123 & 0xFF];
									int var125 = var9[var19];
									int var126 = var124 + var125;
									int var127 = (var124 & 0xFF00FF) + (var125 & 0xFF00FF);
									int var128 = (var126 - var127 & 0x10000) + (var127 & 0x1000100);
									var9[var19++] = var126 - var128 | var128 - (var128 >>> 8);
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var119;
							var19 += var20;
						}
					} else if (arg4 == 0) {
						int var129 = var10;
						int var130 = arg5 >> 16 & 0xFF;
						int var131 = arg5 >> 8 & 0xFF;
						int var132 = arg5 & 0xFF;
						for (int var133 = -arg3; var133 < 0; var133++) {
							int var134 = (var11 >> 16) * this.field9356;
							for (int var135 = -arg2; var135 < 0; var135++) {
								byte var136 = this.field11907[(var10 >> 16) + var134];
								if (var136 == 0) {
									var19++;
								} else {
									int var137 = this.field11906[var136 & 0xFF];
									int var138 = (var137 & 0xFF0000) * var130 & 0xFF000000;
									int var139 = (var137 & 0xFF00) * var131 & 0xFF0000;
									int var140 = (var137 & 0xFF) * var132 & 0xFF00;
									int var141 = (var138 | var139 | var140) >>> 8;
									int var142 = var9[var19];
									int var143 = var141 + var142;
									int var144 = (var141 & 0xFF00FF) + (var142 & 0xFF00FF);
									int var145 = (var143 - var144 & 0x10000) + (var144 & 0x1000100);
									var9[var19++] = var143 - var145 | var145 - (var145 >>> 8);
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var129;
							var19 += var20;
						}
					} else if (arg4 == 3) {
						int var146 = var10;
						for (int var147 = -arg3; var147 < 0; var147++) {
							int var148 = (var11 >> 16) * this.field9356;
							for (int var149 = -arg2; var149 < 0; var149++) {
								byte var150 = this.field11907[(var10 >> 16) + var148];
								int var151 = var150 > 0 ? this.field11906[var150] : 0;
								int var152 = arg5 + var151;
								int var153 = (arg5 & 0xFF00FF) + (var151 & 0xFF00FF);
								int var154 = (var152 - var153 & 0x10000) + (var153 & 0x1000100);
								int var155 = var152 - var154 | var154 - (var154 >>> 8);
								int var156 = var9[var19];
								int var157 = var155 + var156;
								int var158 = (var155 & 0xFF00FF) + (var156 & 0xFF00FF);
								int var159 = (var157 - var158 & 0x10000) + (var158 & 0x1000100);
								var9[var19++] = var157 - var159 | var159 - (var159 >>> 8);
								var10 += var15;
							}
							var11 += var16;
							var10 = var146;
							var19 += var20;
						}
					} else if (arg4 == 2) {
						int var160 = arg5 >>> 24;
						int var161 = 256 - var160;
						int var162 = (arg5 & 0xFF00FF) * var161 & 0xFF00FF00;
						int var163 = (arg5 & 0xFF00) * var161 & 0xFF0000;
						int var164 = (var162 | var163) >>> 8;
						int var165 = var10;
						for (int var166 = -arg3; var166 < 0; var166++) {
							int var167 = (var11 >> 16) * this.field9356;
							for (int var168 = -arg2; var168 < 0; var168++) {
								byte var169 = this.field11907[(var10 >> 16) + var167];
								if (var169 == 0) {
									var19++;
								} else {
									int var170 = this.field11906[var169 & 0xFF];
									int var171 = (var170 & 0xFF00FF) * var160 & 0xFF00FF00;
									int var172 = (var170 & 0xFF00) * var160 & 0xFF0000;
									int var173 = ((var171 | var172) >>> 8) + var164;
									int var174 = var9[var19];
									int var175 = var173 + var174;
									int var176 = (var173 & 0xFF00FF) + (var174 & 0xFF00FF);
									int var177 = (var175 - var176 & 0x10000) + (var176 & 0x1000100);
									var9[var19++] = var175 - var177 | var177 - (var177 >>> 8);
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var165;
							var19 += var20;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (arg4 == 1) {
					int var60 = var10;
					for (int var61 = -arg3; var61 < 0; var61++) {
						int var62 = (var11 >> 16) * this.field9356;
						for (int var63 = -arg2; var63 < 0; var63++) {
							byte var64 = this.field11907[(var10 >> 16) + var62];
							if (var64 == 0) {
								var19++;
							} else {
								var9[var19++] = this.field11906[var64 & 0xFF];
							}
							var10 += var15;
						}
						var11 += var16;
						var10 = var60;
						var19 += var20;
					}
				} else if (arg4 == 0) {
					int var65 = var10;
					if ((arg5 & 0xFFFFFF) == 16777215) {
						int var66 = arg5 >>> 24;
						int var67 = 256 - var66;
						for (int var68 = -arg3; var68 < 0; var68++) {
							int var69 = (var11 >> 16) * this.field9356;
							for (int var70 = -arg2; var70 < 0; var70++) {
								byte var71 = this.field11907[(var10 >> 16) + var69];
								if (var71 == 0) {
									var19++;
								} else {
									int var72 = this.field11906[var71 & 0xFF];
									int var73 = var9[var19];
									var9[var19++] = ((var72 & 0xFF00FF) * var66 + (var73 & 0xFF00FF) * var67 & 0xFF00FF00) + ((var72 & 0xFF00) * var66 + (var73 & 0xFF00) * var67 & 0xFF0000) >> 8;
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var65;
							var19 += var20;
						}
					} else {
						int var74 = arg5 >> 16 & 0xFF;
						int var75 = arg5 >> 8 & 0xFF;
						int var76 = arg5 & 0xFF;
						int var77 = arg5 >>> 24;
						int var78 = 256 - var77;
						for (int var79 = -arg3; var79 < 0; var79++) {
							int var80 = (var11 >> 16) * this.field9356;
							for (int var81 = -arg2; var81 < 0; var81++) {
								byte var82 = this.field11907[(var10 >> 16) + var80];
								if (var82 == 0) {
									var19++;
								} else {
									int var83 = this.field11906[var82 & 0xFF];
									if (var77 == 255) {
										int var89 = (var83 & 0xFF0000) * var74 & 0xFF000000;
										int var90 = (var83 & 0xFF00) * var75 & 0xFF0000;
										int var91 = (var83 & 0xFF) * var76 & 0xFF00;
										var9[var19++] = (var89 | var90 | var91) >>> 8;
									} else {
										int var84 = (var83 & 0xFF0000) * var74 & 0xFF000000;
										int var85 = (var83 & 0xFF00) * var75 & 0xFF0000;
										int var86 = (var83 & 0xFF) * var76 & 0xFF00;
										int var87 = (var84 | var85 | var86) >>> 8;
										int var88 = var9[var19];
										var9[var19++] = ((var87 & 0xFF00FF) * var77 + (var88 & 0xFF00FF) * var78 & 0xFF00FF00) + ((var87 & 0xFF00) * var77 + (var88 & 0xFF00) * var78 & 0xFF0000) >> 8;
									}
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var65;
							var19 += var20;
						}
					}
				} else if (arg4 == 3) {
					int var92 = var10;
					int var93 = arg5 >>> 24;
					int var94 = 256 - var93;
					for (int var95 = -arg3; var95 < 0; var95++) {
						int var96 = (var11 >> 16) * this.field9356;
						for (int var97 = -arg2; var97 < 0; var97++) {
							byte var98 = this.field11907[(var10 >> 16) + var96];
							int var99 = var98 > 0 ? this.field11906[var98] : 0;
							int var100 = arg5 + var99;
							int var101 = (arg5 & 0xFF00FF) + (var99 & 0xFF00FF);
							int var102 = (var100 - var101 & 0x10000) + (var101 & 0x1000100);
							int var103 = var100 - var102 | var102 - (var102 >>> 8);
							if (var99 == 0 && var93 != 255) {
								int var105 = var9[var19];
								var103 = ((var103 & 0xFF00FF) * var93 + (var105 & 0xFF00FF) * var94 & 0xFF00FF00) + ((var103 & 0xFF00) * var93 + (var105 & 0xFF00) * var94 & 0xFF0000) >> 8;
							}
							var9[var19++] = var103;
							var10 += var15;
						}
						var11 += var16;
						var10 = var92;
						var19 += var20;
					}
				} else if (arg4 == 2) {
					int var106 = arg5 >>> 24;
					int var107 = 256 - var106;
					int var108 = (arg5 & 0xFF00FF) * var107 & 0xFF00FF00;
					int var109 = (arg5 & 0xFF00) * var107 & 0xFF0000;
					int var110 = (var108 | var109) >>> 8;
					int var111 = var10;
					for (int var112 = -arg3; var112 < 0; var112++) {
						int var113 = (var11 >> 16) * this.field9356;
						for (int var114 = -arg2; var114 < 0; var114++) {
							byte var115 = this.field11907[(var10 >> 16) + var113];
							if (var115 == 0) {
								var19++;
							} else {
								int var116 = this.field11906[var115 & 0xFF];
								int var117 = (var116 & 0xFF00FF) * var106 & 0xFF00FF00;
								int var118 = (var116 & 0xFF00) * var106 & 0xFF0000;
								var9[var19++] = ((var117 | var118) >>> 8) + var110;
							}
							var10 += var15;
						}
						var11 += var16;
						var10 = var111;
						var19 += var20;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@ObfuscatedName("apd.ce(II)V")
	public void method15354(int arg0, int arg1) {
		int[] var3 = this.field9373.field9778;
		if (var3 == null) {
			return;
		}
		if (Statics.field9357 == 0) {
			if (Statics.field9375 == 0) {
				int var4 = Statics.field9369;
				while (var4 < 0) {
					int var5 = Statics.field9371;
					int var6 = Statics.field9378;
					int var7 = Statics.field9389;
					int var8 = Statics.field9367;
					if (var6 >= 0 && var7 >= 0 && var6 - (this.field9356 << 12) < 0 && var7 - (this.field9372 << 12) < 0) {
						while (var8 < 0) {
							int var9 = (var6 >> 12) + (var7 >> 12) * this.field9356;
							int var10 = var5++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var10] = this.field11906[this.field11907[var9] & 0xFF];
								} else if (arg0 == 0) {
									int var11 = this.field11906[this.field11907[var9] & 0xFF];
									int var12 = (var11 & 0xFF0000) * field9382 & 0xFF000000;
									int var13 = (var11 & 0xFF00) * field9386 & 0xFF0000;
									int var14 = (var11 & 0xFF) * field9387 & 0xFF00;
									var3[var10] = (var12 | var13 | var14) >>> 8;
								} else if (arg0 == 3) {
									int var15 = this.field11906[this.field11907[var9] & 0xFF];
									int var16 = Statics.field9361;
									int var17 = var15 + var16;
									int var18 = (var15 & 0xFF00FF) + (var16 & 0xFF00FF);
									int var19 = (var17 - var18 & 0x10000) + (var18 & 0x1000100);
									var3[var10] = var17 - var19 | var19 - (var19 >>> 8);
								} else if (arg0 == 2) {
									int var20 = this.field11906[this.field11907[var9] & 0xFF];
									int var21 = (var20 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var22 = (var20 & 0xFF00) * field9383 & 0xFF0000;
									var3[var10] = ((var21 | var22) >>> 8) + field9379;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									byte var50 = this.field11907[var9];
									if (var50 != 0) {
										int var51 = this.field11906[var50 & 0xFF];
										int var52 = var3[var10];
										int var53 = var51 + var52;
										int var54 = (var51 & 0xFF00FF) + (var52 & 0xFF00FF);
										int var55 = (var53 - var54 & 0x10000) + (var54 & 0x1000100);
										var3[var10] = var53 - var55 | var55 - (var55 >>> 8);
									}
								} else if (arg0 == 0) {
									byte var56 = this.field11907[var9];
									if (var56 != 0) {
										int var57 = this.field11906[var56 & 0xFF];
										int var58 = (var57 & 0xFF0000) * field9382 & 0xFF000000;
										int var59 = (var57 & 0xFF00) * field9386 & 0xFF0000;
										int var60 = (var57 & 0xFF) * field9387 & 0xFF00;
										int var61 = (var58 | var59 | var60) >>> 8;
										int var62 = var3[var10];
										int var63 = var61 + var62;
										int var64 = (var61 & 0xFF00FF) + (var62 & 0xFF00FF);
										int var65 = (var63 - var64 & 0x10000) + (var64 & 0x1000100);
										var3[var10] = var63 - var65 | var65 - (var65 >>> 8);
									}
								} else if (arg0 == 3) {
									byte var66 = this.field11907[var9];
									int var67 = var66 > 0 ? this.field11906[var66] : 0;
									int var68 = Statics.field9361;
									int var69 = var67 + var68;
									int var70 = (var67 & 0xFF00FF) + (var68 & 0xFF00FF);
									int var71 = (var69 - var70 & 0x10000) + (var70 & 0x1000100);
									int var72 = var69 - var71 | var71 - (var71 >>> 8);
									if (var67 == 0 && field9383 != 255) {
										int var74 = var3[var10];
										var72 = ((var72 & 0xFF00FF) * field9383 + (var74 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var72 & 0xFF00) * field9383 + (var74 & 0xFF00) * field9366 & 0xFF0000) >> 8;
									}
									var3[var10] = var72;
								} else if (arg0 == 2) {
									byte var75 = this.field11907[var9];
									if (var75 != 0) {
										int var76 = this.field11906[var75 & 0xFF];
										int var77 = (var76 & 0xFF00FF) * field9383 & 0xFF00FF00;
										int var78 = (var76 & 0xFF00) * field9383 & 0xFF0000;
										int var79 = ((var77 | var78) >>> 8) + field9379;
										int var80 = var3[var10];
										int var81 = var79 + var80;
										int var82 = (var79 & 0xFF00FF) + (var80 & 0xFF00FF);
										int var83 = (var81 - var82 & 0x10000) + (var82 & 0x1000100);
										var3[var10] = var81 - var83 | var83 - (var83 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								byte var23 = this.field11907[var9];
								if (var23 != 0) {
									var3[var10] = this.field11906[var23 & 0xFF];
								}
							} else if (arg0 == 0) {
								byte var24 = this.field11907[var9];
								if (var24 != 0) {
									int var25 = this.field11906[var24 & 0xFF];
									if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
										int var26 = Statics.field9361 >>> 24;
										int var27 = 256 - var26;
										int var28 = var3[var10];
										var3[var10] = ((var25 & 0xFF00FF) * var26 + (var28 & 0xFF00FF) * var27 & 0xFF00FF00) + ((var25 & 0xFF00) * var26 + (var28 & 0xFF00) * var27 & 0xFF0000) >> 8;
									} else if (field9383 == 255) {
										int var34 = (var25 & 0xFF0000) * field9382 & 0xFF000000;
										int var35 = (var25 & 0xFF00) * field9386 & 0xFF0000;
										int var36 = (var25 & 0xFF) * field9387 & 0xFF00;
										var3[var10] = (var34 | var35 | var36) >>> 8;
									} else {
										int var29 = (var25 & 0xFF0000) * field9382 & 0xFF000000;
										int var30 = (var25 & 0xFF00) * field9386 & 0xFF0000;
										int var31 = (var25 & 0xFF) * field9387 & 0xFF00;
										int var32 = (var29 | var30 | var31) >>> 8;
										int var33 = var3[var10];
										var3[var10] = ((var32 & 0xFF00FF) * field9383 + (var33 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var32 & 0xFF00) * field9383 + (var33 & 0xFF00) * field9366 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								byte var37 = this.field11907[var9];
								int var38 = var37 > 0 ? this.field11906[var37] : 0;
								int var39 = Statics.field9361;
								int var40 = var38 + var39;
								int var41 = (var38 & 0xFF00FF) + (var39 & 0xFF00FF);
								int var42 = (var40 - var41 & 0x10000) + (var41 & 0x1000100);
								int var43 = var40 - var42 | var42 - (var42 >>> 8);
								if (var38 == 0 && field9383 != 255) {
									int var45 = var3[var10];
									var43 = ((var43 & 0xFF00FF) * field9383 + (var45 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var43 & 0xFF00) * field9383 + (var45 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
								var3[var10] = var43;
							} else if (arg0 == 2) {
								byte var46 = this.field11907[var9];
								if (var46 != 0) {
									int var47 = this.field11906[var46 & 0xFF];
									int var48 = (var47 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var49 = (var47 & 0xFF00) * field9383 & 0xFF0000;
									var3[var10++] = ((var48 | var49) >>> 8) + field9379;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var8++;
						}
					}
					var4++;
					Statics.field9371 += Statics.field9370;
				}
			} else if (Statics.field9375 < 0) {
				int var84 = Statics.field9369;
				while (var84 < 0) {
					int var85 = Statics.field9371;
					int var86 = Statics.field9378;
					int var87 = Statics.field9389 + Statics.field9381;
					int var88 = Statics.field9367;
					if (var86 >= 0 && var86 - (this.field9356 << 12) < 0) {
						int var89;
						if ((var89 = var87 - (this.field9372 << 12)) >= 0) {
							int var90 = (Statics.field9375 - var89) / Statics.field9375;
							var88 += var90;
							var87 += Statics.field9375 * var90;
							var85 += var90;
						}
						int var91;
						if ((var91 = (var87 - Statics.field9375) / Statics.field9375) > var88) {
							var88 = var91;
						}
						while (var88 < 0) {
							int var92 = (var86 >> 12) + (var87 >> 12) * this.field9356;
							int var93 = var85++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var93] = this.field11906[this.field11907[var92] & 0xFF];
								} else if (arg0 == 0) {
									int var94 = this.field11906[this.field11907[var92] & 0xFF];
									int var95 = (var94 & 0xFF0000) * field9382 & 0xFF000000;
									int var96 = (var94 & 0xFF00) * field9386 & 0xFF0000;
									int var97 = (var94 & 0xFF) * field9387 & 0xFF00;
									var3[var93] = (var95 | var96 | var97) >>> 8;
								} else if (arg0 == 3) {
									int var98 = this.field11906[this.field11907[var92] & 0xFF];
									int var99 = Statics.field9361;
									int var100 = var98 + var99;
									int var101 = (var98 & 0xFF00FF) + (var99 & 0xFF00FF);
									int var102 = (var100 - var101 & 0x10000) + (var101 & 0x1000100);
									var3[var93] = var100 - var102 | var102 - (var102 >>> 8);
								} else if (arg0 == 2) {
									int var103 = this.field11906[this.field11907[var92] & 0xFF];
									int var104 = (var103 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var105 = (var103 & 0xFF00) * field9383 & 0xFF0000;
									var3[var93] = ((var104 | var105) >>> 8) + field9379;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									byte var133 = this.field11907[var92];
									if (var133 != 0) {
										int var134 = this.field11906[var133 & 0xFF];
										int var135 = var3[var93];
										int var136 = var134 + var135;
										int var137 = (var134 & 0xFF00FF) + (var135 & 0xFF00FF);
										int var138 = (var136 - var137 & 0x10000) + (var137 & 0x1000100);
										var3[var93] = var136 - var138 | var138 - (var138 >>> 8);
									}
								} else if (arg0 == 0) {
									byte var139 = this.field11907[var92];
									if (var139 != 0) {
										int var140 = this.field11906[var139 & 0xFF];
										int var141 = (var140 & 0xFF0000) * field9382 & 0xFF000000;
										int var142 = (var140 & 0xFF00) * field9386 & 0xFF0000;
										int var143 = (var140 & 0xFF) * field9387 & 0xFF00;
										int var144 = (var141 | var142 | var143) >>> 8;
										int var145 = var3[var93];
										int var146 = var144 + var145;
										int var147 = (var144 & 0xFF00FF) + (var145 & 0xFF00FF);
										int var148 = (var146 - var147 & 0x10000) + (var147 & 0x1000100);
										var3[var93] = var146 - var148 | var148 - (var148 >>> 8);
									}
								} else if (arg0 == 3) {
									byte var149 = this.field11907[var92];
									int var150 = var149 > 0 ? this.field11906[var149] : 0;
									int var151 = Statics.field9361;
									int var152 = var150 + var151;
									int var153 = (var150 & 0xFF00FF) + (var151 & 0xFF00FF);
									int var154 = (var152 - var153 & 0x10000) + (var153 & 0x1000100);
									int var155 = var152 - var154 | var154 - (var154 >>> 8);
									if (var150 == 0 && field9383 != 255) {
										int var157 = var3[var93];
										var155 = ((var155 & 0xFF00FF) * field9383 + (var157 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var155 & 0xFF00) * field9383 + (var157 & 0xFF00) * field9366 & 0xFF0000) >> 8;
									}
									var3[var93] = var155;
								} else if (arg0 == 2) {
									byte var158 = this.field11907[var92];
									if (var158 != 0) {
										int var159 = this.field11906[var158 & 0xFF];
										int var160 = (var159 & 0xFF00FF) * field9383 & 0xFF00FF00;
										int var161 = (var159 & 0xFF00) * field9383 & 0xFF0000;
										int var162 = ((var160 | var161) >>> 8) + field9379;
										int var163 = var3[var93];
										int var164 = var162 + var163;
										int var165 = (var162 & 0xFF00FF) + (var163 & 0xFF00FF);
										int var166 = (var164 - var165 & 0x10000) + (var165 & 0x1000100);
										var3[var93] = var164 - var166 | var166 - (var166 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								byte var106 = this.field11907[var92];
								if (var106 != 0) {
									var3[var93] = this.field11906[var106 & 0xFF];
								}
							} else if (arg0 == 0) {
								byte var107 = this.field11907[var92];
								if (var107 != 0) {
									int var108 = this.field11906[var107 & 0xFF];
									if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
										int var109 = Statics.field9361 >>> 24;
										int var110 = 256 - var109;
										int var111 = var3[var93];
										var3[var93] = ((var108 & 0xFF00FF) * var109 + (var111 & 0xFF00FF) * var110 & 0xFF00FF00) + ((var108 & 0xFF00) * var109 + (var111 & 0xFF00) * var110 & 0xFF0000) >> 8;
									} else if (field9383 == 255) {
										int var117 = (var108 & 0xFF0000) * field9382 & 0xFF000000;
										int var118 = (var108 & 0xFF00) * field9386 & 0xFF0000;
										int var119 = (var108 & 0xFF) * field9387 & 0xFF00;
										var3[var93] = (var117 | var118 | var119) >>> 8;
									} else {
										int var112 = (var108 & 0xFF0000) * field9382 & 0xFF000000;
										int var113 = (var108 & 0xFF00) * field9386 & 0xFF0000;
										int var114 = (var108 & 0xFF) * field9387 & 0xFF00;
										int var115 = (var112 | var113 | var114) >>> 8;
										int var116 = var3[var93];
										var3[var93] = ((var115 & 0xFF00FF) * field9383 + (var116 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var115 & 0xFF00) * field9383 + (var116 & 0xFF00) * field9366 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								byte var120 = this.field11907[var92];
								int var121 = var120 > 0 ? this.field11906[var120] : 0;
								int var122 = Statics.field9361;
								int var123 = var121 + var122;
								int var124 = (var121 & 0xFF00FF) + (var122 & 0xFF00FF);
								int var125 = (var123 - var124 & 0x10000) + (var124 & 0x1000100);
								int var126 = var123 - var125 | var125 - (var125 >>> 8);
								if (var121 == 0 && field9383 != 255) {
									int var128 = var3[var93];
									var126 = ((var126 & 0xFF00FF) * field9383 + (var128 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var126 & 0xFF00) * field9383 + (var128 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
								var3[var93] = var126;
							} else if (arg0 == 2) {
								byte var129 = this.field11907[var92];
								if (var129 != 0) {
									int var130 = this.field11906[var129 & 0xFF];
									int var131 = (var130 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var132 = (var130 & 0xFF00) * field9383 & 0xFF0000;
									var3[var93++] = ((var131 | var132) >>> 8) + field9379;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var87 += Statics.field9375;
							var88++;
						}
					}
					var84++;
					Statics.field9378 += Statics.field9374;
					Statics.field9371 += Statics.field9370;
				}
			} else {
				int var167 = Statics.field9369;
				while (var167 < 0) {
					int var168 = Statics.field9371;
					int var169 = Statics.field9378;
					int var170 = Statics.field9389 + Statics.field9381;
					int var171 = Statics.field9367;
					if (var169 >= 0 && var169 - (this.field9356 << 12) < 0) {
						if (var170 < 0) {
							int var172 = (Statics.field9375 - 1 - var170) / Statics.field9375;
							var171 += var172;
							var170 += Statics.field9375 * var172;
							var168 += var172;
						}
						int var173;
						if ((var173 = (var170 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var171) {
							var171 = var173;
						}
						while (var171 < 0) {
							int var174 = (var169 >> 12) + (var170 >> 12) * this.field9356;
							int var175 = var168++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var175] = this.field11906[this.field11907[var174] & 0xFF];
								} else if (arg0 == 0) {
									int var176 = this.field11906[this.field11907[var174] & 0xFF];
									int var177 = (var176 & 0xFF0000) * field9382 & 0xFF000000;
									int var178 = (var176 & 0xFF00) * field9386 & 0xFF0000;
									int var179 = (var176 & 0xFF) * field9387 & 0xFF00;
									var3[var175] = (var177 | var178 | var179) >>> 8;
								} else if (arg0 == 3) {
									int var180 = this.field11906[this.field11907[var174] & 0xFF];
									int var181 = Statics.field9361;
									int var182 = var180 + var181;
									int var183 = (var180 & 0xFF00FF) + (var181 & 0xFF00FF);
									int var184 = (var182 - var183 & 0x10000) + (var183 & 0x1000100);
									var3[var175] = var182 - var184 | var184 - (var184 >>> 8);
								} else if (arg0 == 2) {
									int var185 = this.field11906[this.field11907[var174] & 0xFF];
									int var186 = (var185 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var187 = (var185 & 0xFF00) * field9383 & 0xFF0000;
									var3[var175] = ((var186 | var187) >>> 8) + field9379;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									byte var215 = this.field11907[var174];
									if (var215 != 0) {
										int var216 = this.field11906[var215 & 0xFF];
										int var217 = var3[var175];
										int var218 = var216 + var217;
										int var219 = (var216 & 0xFF00FF) + (var217 & 0xFF00FF);
										int var220 = (var218 - var219 & 0x10000) + (var219 & 0x1000100);
										var3[var175] = var218 - var220 | var220 - (var220 >>> 8);
									}
								} else if (arg0 == 0) {
									byte var221 = this.field11907[var174];
									if (var221 != 0) {
										int var222 = this.field11906[var221 & 0xFF];
										int var223 = (var222 & 0xFF0000) * field9382 & 0xFF000000;
										int var224 = (var222 & 0xFF00) * field9386 & 0xFF0000;
										int var225 = (var222 & 0xFF) * field9387 & 0xFF00;
										int var226 = (var223 | var224 | var225) >>> 8;
										int var227 = var3[var175];
										int var228 = var226 + var227;
										int var229 = (var226 & 0xFF00FF) + (var227 & 0xFF00FF);
										int var230 = (var228 - var229 & 0x10000) + (var229 & 0x1000100);
										var3[var175] = var228 - var230 | var230 - (var230 >>> 8);
									}
								} else if (arg0 == 3) {
									byte var231 = this.field11907[var174];
									int var232 = var231 > 0 ? this.field11906[var231] : 0;
									int var233 = Statics.field9361;
									int var234 = var232 + var233;
									int var235 = (var232 & 0xFF00FF) + (var233 & 0xFF00FF);
									int var236 = (var234 - var235 & 0x10000) + (var235 & 0x1000100);
									int var237 = var234 - var236 | var236 - (var236 >>> 8);
									if (var232 == 0 && field9383 != 255) {
										int var239 = var3[var175];
										var237 = ((var237 & 0xFF00FF) * field9383 + (var239 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var237 & 0xFF00) * field9383 + (var239 & 0xFF00) * field9366 & 0xFF0000) >> 8;
									}
									var3[var175] = var237;
								} else if (arg0 == 2) {
									byte var240 = this.field11907[var174];
									if (var240 != 0) {
										int var241 = this.field11906[var240 & 0xFF];
										int var242 = (var241 & 0xFF00FF) * field9383 & 0xFF00FF00;
										int var243 = (var241 & 0xFF00) * field9383 & 0xFF0000;
										int var244 = ((var242 | var243) >>> 8) + field9379;
										int var245 = var3[var175];
										int var246 = var244 + var245;
										int var247 = (var244 & 0xFF00FF) + (var245 & 0xFF00FF);
										int var248 = (var246 - var247 & 0x10000) + (var247 & 0x1000100);
										var3[var175] = var246 - var248 | var248 - (var248 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								byte var188 = this.field11907[var174];
								if (var188 != 0) {
									var3[var175] = this.field11906[var188 & 0xFF];
								}
							} else if (arg0 == 0) {
								byte var189 = this.field11907[var174];
								if (var189 != 0) {
									int var190 = this.field11906[var189 & 0xFF];
									if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
										int var191 = Statics.field9361 >>> 24;
										int var192 = 256 - var191;
										int var193 = var3[var175];
										var3[var175] = ((var190 & 0xFF00FF) * var191 + (var193 & 0xFF00FF) * var192 & 0xFF00FF00) + ((var190 & 0xFF00) * var191 + (var193 & 0xFF00) * var192 & 0xFF0000) >> 8;
									} else if (field9383 == 255) {
										int var199 = (var190 & 0xFF0000) * field9382 & 0xFF000000;
										int var200 = (var190 & 0xFF00) * field9386 & 0xFF0000;
										int var201 = (var190 & 0xFF) * field9387 & 0xFF00;
										var3[var175] = (var199 | var200 | var201) >>> 8;
									} else {
										int var194 = (var190 & 0xFF0000) * field9382 & 0xFF000000;
										int var195 = (var190 & 0xFF00) * field9386 & 0xFF0000;
										int var196 = (var190 & 0xFF) * field9387 & 0xFF00;
										int var197 = (var194 | var195 | var196) >>> 8;
										int var198 = var3[var175];
										var3[var175] = ((var197 & 0xFF00FF) * field9383 + (var198 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var197 & 0xFF00) * field9383 + (var198 & 0xFF00) * field9366 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								byte var202 = this.field11907[var174];
								int var203 = var202 > 0 ? this.field11906[var202] : 0;
								int var204 = Statics.field9361;
								int var205 = var203 + var204;
								int var206 = (var203 & 0xFF00FF) + (var204 & 0xFF00FF);
								int var207 = (var205 - var206 & 0x10000) + (var206 & 0x1000100);
								int var208 = var205 - var207 | var207 - (var207 >>> 8);
								if (var203 == 0 && field9383 != 255) {
									int var210 = var3[var175];
									var208 = ((var208 & 0xFF00FF) * field9383 + (var210 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var208 & 0xFF00) * field9383 + (var210 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
								var3[var175] = var208;
							} else if (arg0 == 2) {
								byte var211 = this.field11907[var174];
								if (var211 != 0) {
									int var212 = this.field11906[var211 & 0xFF];
									int var213 = (var212 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var214 = (var212 & 0xFF00) * field9383 & 0xFF0000;
									var3[var175++] = ((var213 | var214) >>> 8) + field9379;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var170 += Statics.field9375;
							var171++;
						}
					}
					var167++;
					Statics.field9378 += Statics.field9374;
					Statics.field9371 += Statics.field9370;
				}
			}
		} else if (Statics.field9357 < 0) {
			if (Statics.field9375 == 0) {
				int var249 = Statics.field9369;
				while (var249 < 0) {
					int var250 = Statics.field9371;
					int var251 = Statics.field9380 + Statics.field9378;
					int var252 = Statics.field9389;
					int var253 = Statics.field9367;
					if (var252 >= 0 && var252 - (this.field9372 << 12) < 0) {
						int var254;
						if ((var254 = var251 - (this.field9356 << 12)) >= 0) {
							int var255 = (Statics.field9357 - var254) / Statics.field9357;
							var253 += var255;
							var251 += Statics.field9357 * var255;
							var250 += var255;
						}
						int var256;
						if ((var256 = (var251 - Statics.field9357) / Statics.field9357) > var253) {
							var253 = var256;
						}
						while (var253 < 0) {
							int var257 = (var251 >> 12) + (var252 >> 12) * this.field9356;
							int var258 = var250++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									var3[var258] = this.field11906[this.field11907[var257] & 0xFF];
								} else if (arg0 == 0) {
									int var259 = this.field11906[this.field11907[var257] & 0xFF];
									int var260 = (var259 & 0xFF0000) * field9382 & 0xFF000000;
									int var261 = (var259 & 0xFF00) * field9386 & 0xFF0000;
									int var262 = (var259 & 0xFF) * field9387 & 0xFF00;
									var3[var258] = (var260 | var261 | var262) >>> 8;
								} else if (arg0 == 3) {
									int var263 = this.field11906[this.field11907[var257] & 0xFF];
									int var264 = Statics.field9361;
									int var265 = var263 + var264;
									int var266 = (var263 & 0xFF00FF) + (var264 & 0xFF00FF);
									int var267 = (var265 - var266 & 0x10000) + (var266 & 0x1000100);
									var3[var258] = var265 - var267 | var267 - (var267 >>> 8);
								} else if (arg0 == 2) {
									int var268 = this.field11906[this.field11907[var257] & 0xFF];
									int var269 = (var268 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var270 = (var268 & 0xFF00) * field9383 & 0xFF0000;
									var3[var258] = ((var269 | var270) >>> 8) + field9379;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									byte var298 = this.field11907[var257];
									if (var298 != 0) {
										int var299 = this.field11906[var298 & 0xFF];
										int var300 = var3[var258];
										int var301 = var299 + var300;
										int var302 = (var299 & 0xFF00FF) + (var300 & 0xFF00FF);
										int var303 = (var301 - var302 & 0x10000) + (var302 & 0x1000100);
										var3[var258] = var301 - var303 | var303 - (var303 >>> 8);
									}
								} else if (arg0 == 0) {
									byte var304 = this.field11907[var257];
									if (var304 != 0) {
										int var305 = this.field11906[var304 & 0xFF];
										int var306 = (var305 & 0xFF0000) * field9382 & 0xFF000000;
										int var307 = (var305 & 0xFF00) * field9386 & 0xFF0000;
										int var308 = (var305 & 0xFF) * field9387 & 0xFF00;
										int var309 = (var306 | var307 | var308) >>> 8;
										int var310 = var3[var258];
										int var311 = var309 + var310;
										int var312 = (var309 & 0xFF00FF) + (var310 & 0xFF00FF);
										int var313 = (var311 - var312 & 0x10000) + (var312 & 0x1000100);
										var3[var258] = var311 - var313 | var313 - (var313 >>> 8);
									}
								} else if (arg0 == 3) {
									byte var314 = this.field11907[var257];
									int var315 = var314 > 0 ? this.field11906[var314] : 0;
									int var316 = Statics.field9361;
									int var317 = var315 + var316;
									int var318 = (var315 & 0xFF00FF) + (var316 & 0xFF00FF);
									int var319 = (var317 - var318 & 0x10000) + (var318 & 0x1000100);
									int var320 = var317 - var319 | var319 - (var319 >>> 8);
									if (var315 == 0 && field9383 != 255) {
										int var322 = var3[var258];
										var320 = ((var320 & 0xFF00FF) * field9383 + (var322 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var320 & 0xFF00) * field9383 + (var322 & 0xFF00) * field9366 & 0xFF0000) >> 8;
									}
									var3[var258] = var320;
								} else if (arg0 == 2) {
									byte var323 = this.field11907[var257];
									if (var323 != 0) {
										int var324 = this.field11906[var323 & 0xFF];
										int var325 = (var324 & 0xFF00FF) * field9383 & 0xFF00FF00;
										int var326 = (var324 & 0xFF00) * field9383 & 0xFF0000;
										int var327 = ((var325 | var326) >>> 8) + field9379;
										int var328 = var3[var258];
										int var329 = var327 + var328;
										int var330 = (var327 & 0xFF00FF) + (var328 & 0xFF00FF);
										int var331 = (var329 - var330 & 0x10000) + (var330 & 0x1000100);
										var3[var258] = var329 - var331 | var331 - (var331 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								byte var271 = this.field11907[var257];
								if (var271 != 0) {
									var3[var258] = this.field11906[var271 & 0xFF];
								}
							} else if (arg0 == 0) {
								byte var272 = this.field11907[var257];
								if (var272 != 0) {
									int var273 = this.field11906[var272 & 0xFF];
									if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
										int var274 = Statics.field9361 >>> 24;
										int var275 = 256 - var274;
										int var276 = var3[var258];
										var3[var258] = ((var273 & 0xFF00FF) * var274 + (var276 & 0xFF00FF) * var275 & 0xFF00FF00) + ((var273 & 0xFF00) * var274 + (var276 & 0xFF00) * var275 & 0xFF0000) >> 8;
									} else if (field9383 == 255) {
										int var282 = (var273 & 0xFF0000) * field9382 & 0xFF000000;
										int var283 = (var273 & 0xFF00) * field9386 & 0xFF0000;
										int var284 = (var273 & 0xFF) * field9387 & 0xFF00;
										var3[var258] = (var282 | var283 | var284) >>> 8;
									} else {
										int var277 = (var273 & 0xFF0000) * field9382 & 0xFF000000;
										int var278 = (var273 & 0xFF00) * field9386 & 0xFF0000;
										int var279 = (var273 & 0xFF) * field9387 & 0xFF00;
										int var280 = (var277 | var278 | var279) >>> 8;
										int var281 = var3[var258];
										var3[var258] = ((var280 & 0xFF00FF) * field9383 + (var281 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var280 & 0xFF00) * field9383 + (var281 & 0xFF00) * field9366 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								byte var285 = this.field11907[var257];
								int var286 = var285 > 0 ? this.field11906[var285] : 0;
								int var287 = Statics.field9361;
								int var288 = var286 + var287;
								int var289 = (var286 & 0xFF00FF) + (var287 & 0xFF00FF);
								int var290 = (var288 - var289 & 0x10000) + (var289 & 0x1000100);
								int var291 = var288 - var290 | var290 - (var290 >>> 8);
								if (var286 == 0 && field9383 != 255) {
									int var293 = var3[var258];
									var291 = ((var291 & 0xFF00FF) * field9383 + (var293 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var291 & 0xFF00) * field9383 + (var293 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
								var3[var258] = var291;
							} else if (arg0 == 2) {
								byte var294 = this.field11907[var257];
								if (var294 != 0) {
									int var295 = this.field11906[var294 & 0xFF];
									int var296 = (var295 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var297 = (var295 & 0xFF00) * field9383 & 0xFF0000;
									var3[var258++] = ((var296 | var297) >>> 8) + field9379;
								}
							} else {
								throw new IllegalArgumentException();
							}
							var251 += Statics.field9357;
							var253++;
						}
					}
					var249++;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			} else if (Statics.field9375 < 0) {
				int var332 = Statics.field9369;
				while (var332 < 0) {
					int var333 = Statics.field9371;
					int var334 = Statics.field9380 + Statics.field9378;
					int var335 = Statics.field9389 + Statics.field9381;
					int var336 = Statics.field9367;
					int var337;
					if ((var337 = var334 - (this.field9356 << 12)) >= 0) {
						int var338 = (Statics.field9357 - var337) / Statics.field9357;
						var336 += var338;
						var334 += Statics.field9357 * var338;
						var335 += Statics.field9375 * var338;
						var333 += var338;
					}
					int var339;
					if ((var339 = (var334 - Statics.field9357) / Statics.field9357) > var336) {
						var336 = var339;
					}
					int var340;
					if ((var340 = var335 - (this.field9372 << 12)) >= 0) {
						int var341 = (Statics.field9375 - var340) / Statics.field9375;
						var336 += var341;
						var334 += Statics.field9357 * var341;
						var335 += Statics.field9375 * var341;
						var333 += var341;
					}
					int var342;
					if ((var342 = (var335 - Statics.field9375) / Statics.field9375) > var336) {
						var336 = var342;
					}
					while (var336 < 0) {
						int var343 = (var334 >> 12) + (var335 >> 12) * this.field9356;
						int var344 = var333++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var344] = this.field11906[this.field11907[var343] & 0xFF];
							} else if (arg0 == 0) {
								int var345 = this.field11906[this.field11907[var343] & 0xFF];
								int var346 = (var345 & 0xFF0000) * field9382 & 0xFF000000;
								int var347 = (var345 & 0xFF00) * field9386 & 0xFF0000;
								int var348 = (var345 & 0xFF) * field9387 & 0xFF00;
								var3[var344] = (var346 | var347 | var348) >>> 8;
							} else if (arg0 == 3) {
								int var349 = this.field11906[this.field11907[var343] & 0xFF];
								int var350 = Statics.field9361;
								int var351 = var349 + var350;
								int var352 = (var349 & 0xFF00FF) + (var350 & 0xFF00FF);
								int var353 = (var351 - var352 & 0x10000) + (var352 & 0x1000100);
								var3[var344] = var351 - var353 | var353 - (var353 >>> 8);
							} else if (arg0 == 2) {
								int var354 = this.field11906[this.field11907[var343] & 0xFF];
								int var355 = (var354 & 0xFF00FF) * field9383 & 0xFF00FF00;
								int var356 = (var354 & 0xFF00) * field9383 & 0xFF0000;
								var3[var344] = ((var355 | var356) >>> 8) + field9379;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								byte var384 = this.field11907[var343];
								if (var384 != 0) {
									int var385 = this.field11906[var384 & 0xFF];
									int var386 = var3[var344];
									int var387 = var385 + var386;
									int var388 = (var385 & 0xFF00FF) + (var386 & 0xFF00FF);
									int var389 = (var387 - var388 & 0x10000) + (var388 & 0x1000100);
									var3[var344] = var387 - var389 | var389 - (var389 >>> 8);
								}
							} else if (arg0 == 0) {
								byte var390 = this.field11907[var343];
								if (var390 != 0) {
									int var391 = this.field11906[var390 & 0xFF];
									int var392 = (var391 & 0xFF0000) * field9382 & 0xFF000000;
									int var393 = (var391 & 0xFF00) * field9386 & 0xFF0000;
									int var394 = (var391 & 0xFF) * field9387 & 0xFF00;
									int var395 = (var392 | var393 | var394) >>> 8;
									int var396 = var3[var344];
									int var397 = var395 + var396;
									int var398 = (var395 & 0xFF00FF) + (var396 & 0xFF00FF);
									int var399 = (var397 - var398 & 0x10000) + (var398 & 0x1000100);
									var3[var344] = var397 - var399 | var399 - (var399 >>> 8);
								}
							} else if (arg0 == 3) {
								byte var400 = this.field11907[var343];
								int var401 = var400 > 0 ? this.field11906[var400] : 0;
								int var402 = Statics.field9361;
								int var403 = var401 + var402;
								int var404 = (var401 & 0xFF00FF) + (var402 & 0xFF00FF);
								int var405 = (var403 - var404 & 0x10000) + (var404 & 0x1000100);
								int var406 = var403 - var405 | var405 - (var405 >>> 8);
								if (var401 == 0 && field9383 != 255) {
									int var408 = var3[var344];
									var406 = ((var406 & 0xFF00FF) * field9383 + (var408 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var406 & 0xFF00) * field9383 + (var408 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
								var3[var344] = var406;
							} else if (arg0 == 2) {
								byte var409 = this.field11907[var343];
								if (var409 != 0) {
									int var410 = this.field11906[var409 & 0xFF];
									int var411 = (var410 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var412 = (var410 & 0xFF00) * field9383 & 0xFF0000;
									int var413 = ((var411 | var412) >>> 8) + field9379;
									int var414 = var3[var344];
									int var415 = var413 + var414;
									int var416 = (var413 & 0xFF00FF) + (var414 & 0xFF00FF);
									int var417 = (var415 - var416 & 0x10000) + (var416 & 0x1000100);
									var3[var344] = var415 - var417 | var417 - (var417 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							byte var357 = this.field11907[var343];
							if (var357 != 0) {
								var3[var344] = this.field11906[var357 & 0xFF];
							}
						} else if (arg0 == 0) {
							byte var358 = this.field11907[var343];
							if (var358 != 0) {
								int var359 = this.field11906[var358 & 0xFF];
								if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
									int var360 = Statics.field9361 >>> 24;
									int var361 = 256 - var360;
									int var362 = var3[var344];
									var3[var344] = ((var359 & 0xFF00FF) * var360 + (var362 & 0xFF00FF) * var361 & 0xFF00FF00) + ((var359 & 0xFF00) * var360 + (var362 & 0xFF00) * var361 & 0xFF0000) >> 8;
								} else if (field9383 == 255) {
									int var368 = (var359 & 0xFF0000) * field9382 & 0xFF000000;
									int var369 = (var359 & 0xFF00) * field9386 & 0xFF0000;
									int var370 = (var359 & 0xFF) * field9387 & 0xFF00;
									var3[var344] = (var368 | var369 | var370) >>> 8;
								} else {
									int var363 = (var359 & 0xFF0000) * field9382 & 0xFF000000;
									int var364 = (var359 & 0xFF00) * field9386 & 0xFF0000;
									int var365 = (var359 & 0xFF) * field9387 & 0xFF00;
									int var366 = (var363 | var364 | var365) >>> 8;
									int var367 = var3[var344];
									var3[var344] = ((var366 & 0xFF00FF) * field9383 + (var367 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var366 & 0xFF00) * field9383 + (var367 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							byte var371 = this.field11907[var343];
							int var372 = var371 > 0 ? this.field11906[var371] : 0;
							int var373 = Statics.field9361;
							int var374 = var372 + var373;
							int var375 = (var372 & 0xFF00FF) + (var373 & 0xFF00FF);
							int var376 = (var374 - var375 & 0x10000) + (var375 & 0x1000100);
							int var377 = var374 - var376 | var376 - (var376 >>> 8);
							if (var372 == 0 && field9383 != 255) {
								int var379 = var3[var344];
								var377 = ((var377 & 0xFF00FF) * field9383 + (var379 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var377 & 0xFF00) * field9383 + (var379 & 0xFF00) * field9366 & 0xFF0000) >> 8;
							}
							var3[var344] = var377;
						} else if (arg0 == 2) {
							byte var380 = this.field11907[var343];
							if (var380 != 0) {
								int var381 = this.field11906[var380 & 0xFF];
								int var382 = (var381 & 0xFF00FF) * field9383 & 0xFF00FF00;
								int var383 = (var381 & 0xFF00) * field9383 & 0xFF0000;
								var3[var344++] = ((var382 | var383) >>> 8) + field9379;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var334 += Statics.field9357;
						var335 += Statics.field9375;
						var336++;
					}
					var332++;
					Statics.field9378 += Statics.field9374;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			} else {
				int var418 = Statics.field9369;
				while (var418 < 0) {
					int var419 = Statics.field9371;
					int var420 = Statics.field9380 + Statics.field9378;
					int var421 = Statics.field9389 + Statics.field9381;
					int var422 = Statics.field9367;
					int var423;
					if ((var423 = var420 - (this.field9356 << 12)) >= 0) {
						int var424 = (Statics.field9357 - var423) / Statics.field9357;
						var422 += var424;
						var420 += Statics.field9357 * var424;
						var421 += Statics.field9375 * var424;
						var419 += var424;
					}
					int var425;
					if ((var425 = (var420 - Statics.field9357) / Statics.field9357) > var422) {
						var422 = var425;
					}
					if (var421 < 0) {
						int var426 = (Statics.field9375 - 1 - var421) / Statics.field9375;
						var422 += var426;
						var420 += Statics.field9357 * var426;
						var421 += Statics.field9375 * var426;
						var419 += var426;
					}
					int var427;
					if ((var427 = (var421 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var422) {
						var422 = var427;
					}
					while (var422 < 0) {
						int var428 = (var420 >> 12) + (var421 >> 12) * this.field9356;
						int var429 = var419++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var429] = this.field11906[this.field11907[var428] & 0xFF];
							} else if (arg0 == 0) {
								int var430 = this.field11906[this.field11907[var428] & 0xFF];
								int var431 = (var430 & 0xFF0000) * field9382 & 0xFF000000;
								int var432 = (var430 & 0xFF00) * field9386 & 0xFF0000;
								int var433 = (var430 & 0xFF) * field9387 & 0xFF00;
								var3[var429] = (var431 | var432 | var433) >>> 8;
							} else if (arg0 == 3) {
								int var434 = this.field11906[this.field11907[var428] & 0xFF];
								int var435 = Statics.field9361;
								int var436 = var434 + var435;
								int var437 = (var434 & 0xFF00FF) + (var435 & 0xFF00FF);
								int var438 = (var436 - var437 & 0x10000) + (var437 & 0x1000100);
								var3[var429] = var436 - var438 | var438 - (var438 >>> 8);
							} else if (arg0 == 2) {
								int var439 = this.field11906[this.field11907[var428] & 0xFF];
								int var440 = (var439 & 0xFF00FF) * field9383 & 0xFF00FF00;
								int var441 = (var439 & 0xFF00) * field9383 & 0xFF0000;
								var3[var429] = ((var440 | var441) >>> 8) + field9379;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								byte var469 = this.field11907[var428];
								if (var469 != 0) {
									int var470 = this.field11906[var469 & 0xFF];
									int var471 = var3[var429];
									int var472 = var470 + var471;
									int var473 = (var470 & 0xFF00FF) + (var471 & 0xFF00FF);
									int var474 = (var472 - var473 & 0x10000) + (var473 & 0x1000100);
									var3[var429] = var472 - var474 | var474 - (var474 >>> 8);
								}
							} else if (arg0 == 0) {
								byte var475 = this.field11907[var428];
								if (var475 != 0) {
									int var476 = this.field11906[var475 & 0xFF];
									int var477 = (var476 & 0xFF0000) * field9382 & 0xFF000000;
									int var478 = (var476 & 0xFF00) * field9386 & 0xFF0000;
									int var479 = (var476 & 0xFF) * field9387 & 0xFF00;
									int var480 = (var477 | var478 | var479) >>> 8;
									int var481 = var3[var429];
									int var482 = var480 + var481;
									int var483 = (var480 & 0xFF00FF) + (var481 & 0xFF00FF);
									int var484 = (var482 - var483 & 0x10000) + (var483 & 0x1000100);
									var3[var429] = var482 - var484 | var484 - (var484 >>> 8);
								}
							} else if (arg0 == 3) {
								byte var485 = this.field11907[var428];
								int var486 = var485 > 0 ? this.field11906[var485] : 0;
								int var487 = Statics.field9361;
								int var488 = var486 + var487;
								int var489 = (var486 & 0xFF00FF) + (var487 & 0xFF00FF);
								int var490 = (var488 - var489 & 0x10000) + (var489 & 0x1000100);
								int var491 = var488 - var490 | var490 - (var490 >>> 8);
								if (var486 == 0 && field9383 != 255) {
									int var493 = var3[var429];
									var491 = ((var491 & 0xFF00FF) * field9383 + (var493 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var491 & 0xFF00) * field9383 + (var493 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
								var3[var429] = var491;
							} else if (arg0 == 2) {
								byte var494 = this.field11907[var428];
								if (var494 != 0) {
									int var495 = this.field11906[var494 & 0xFF];
									int var496 = (var495 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var497 = (var495 & 0xFF00) * field9383 & 0xFF0000;
									int var498 = ((var496 | var497) >>> 8) + field9379;
									int var499 = var3[var429];
									int var500 = var498 + var499;
									int var501 = (var498 & 0xFF00FF) + (var499 & 0xFF00FF);
									int var502 = (var500 - var501 & 0x10000) + (var501 & 0x1000100);
									var3[var429] = var500 - var502 | var502 - (var502 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							byte var442 = this.field11907[var428];
							if (var442 != 0) {
								var3[var429] = this.field11906[var442 & 0xFF];
							}
						} else if (arg0 == 0) {
							byte var443 = this.field11907[var428];
							if (var443 != 0) {
								int var444 = this.field11906[var443 & 0xFF];
								if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
									int var445 = Statics.field9361 >>> 24;
									int var446 = 256 - var445;
									int var447 = var3[var429];
									var3[var429] = ((var444 & 0xFF00FF) * var445 + (var447 & 0xFF00FF) * var446 & 0xFF00FF00) + ((var444 & 0xFF00) * var445 + (var447 & 0xFF00) * var446 & 0xFF0000) >> 8;
								} else if (field9383 == 255) {
									int var453 = (var444 & 0xFF0000) * field9382 & 0xFF000000;
									int var454 = (var444 & 0xFF00) * field9386 & 0xFF0000;
									int var455 = (var444 & 0xFF) * field9387 & 0xFF00;
									var3[var429] = (var453 | var454 | var455) >>> 8;
								} else {
									int var448 = (var444 & 0xFF0000) * field9382 & 0xFF000000;
									int var449 = (var444 & 0xFF00) * field9386 & 0xFF0000;
									int var450 = (var444 & 0xFF) * field9387 & 0xFF00;
									int var451 = (var448 | var449 | var450) >>> 8;
									int var452 = var3[var429];
									var3[var429] = ((var451 & 0xFF00FF) * field9383 + (var452 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var451 & 0xFF00) * field9383 + (var452 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							byte var456 = this.field11907[var428];
							int var457 = var456 > 0 ? this.field11906[var456] : 0;
							int var458 = Statics.field9361;
							int var459 = var457 + var458;
							int var460 = (var457 & 0xFF00FF) + (var458 & 0xFF00FF);
							int var461 = (var459 - var460 & 0x10000) + (var460 & 0x1000100);
							int var462 = var459 - var461 | var461 - (var461 >>> 8);
							if (var457 == 0 && field9383 != 255) {
								int var464 = var3[var429];
								var462 = ((var462 & 0xFF00FF) * field9383 + (var464 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var462 & 0xFF00) * field9383 + (var464 & 0xFF00) * field9366 & 0xFF0000) >> 8;
							}
							var3[var429] = var462;
						} else if (arg0 == 2) {
							byte var465 = this.field11907[var428];
							if (var465 != 0) {
								int var466 = this.field11906[var465 & 0xFF];
								int var467 = (var466 & 0xFF00FF) * field9383 & 0xFF00FF00;
								int var468 = (var466 & 0xFF00) * field9383 & 0xFF0000;
								var3[var429++] = ((var467 | var468) >>> 8) + field9379;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var420 += Statics.field9357;
						var421 += Statics.field9375;
						var422++;
					}
					var418++;
					Statics.field9378 += Statics.field9374;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			}
		} else if (Statics.field9375 == 0) {
			int var503 = Statics.field9369;
			while (var503 < 0) {
				int var504 = Statics.field9371;
				int var505 = Statics.field9380 + Statics.field9378;
				int var506 = Statics.field9389;
				int var507 = Statics.field9367;
				if (var506 >= 0 && var506 - (this.field9372 << 12) < 0) {
					if (var505 < 0) {
						int var508 = (Statics.field9357 - 1 - var505) / Statics.field9357;
						var507 += var508;
						var505 += Statics.field9357 * var508;
						var504 += var508;
					}
					int var509;
					if ((var509 = (var505 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var507) {
						var507 = var509;
					}
					while (var507 < 0) {
						int var510 = (var505 >> 12) + (var506 >> 12) * this.field9356;
						int var511 = var504++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								var3[var511] = this.field11906[this.field11907[var510] & 0xFF];
							} else if (arg0 == 0) {
								int var512 = this.field11906[this.field11907[var510] & 0xFF];
								int var513 = (var512 & 0xFF0000) * field9382 & 0xFF000000;
								int var514 = (var512 & 0xFF00) * field9386 & 0xFF0000;
								int var515 = (var512 & 0xFF) * field9387 & 0xFF00;
								var3[var511] = (var513 | var514 | var515) >>> 8;
							} else if (arg0 == 3) {
								int var516 = this.field11906[this.field11907[var510] & 0xFF];
								int var517 = Statics.field9361;
								int var518 = var516 + var517;
								int var519 = (var516 & 0xFF00FF) + (var517 & 0xFF00FF);
								int var520 = (var518 - var519 & 0x10000) + (var519 & 0x1000100);
								var3[var511] = var518 - var520 | var520 - (var520 >>> 8);
							} else if (arg0 == 2) {
								int var521 = this.field11906[this.field11907[var510] & 0xFF];
								int var522 = (var521 & 0xFF00FF) * field9383 & 0xFF00FF00;
								int var523 = (var521 & 0xFF00) * field9383 & 0xFF0000;
								var3[var511] = ((var522 | var523) >>> 8) + field9379;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								byte var551 = this.field11907[var510];
								if (var551 != 0) {
									int var552 = this.field11906[var551 & 0xFF];
									int var553 = var3[var511];
									int var554 = var552 + var553;
									int var555 = (var552 & 0xFF00FF) + (var553 & 0xFF00FF);
									int var556 = (var554 - var555 & 0x10000) + (var555 & 0x1000100);
									var3[var511] = var554 - var556 | var556 - (var556 >>> 8);
								}
							} else if (arg0 == 0) {
								byte var557 = this.field11907[var510];
								if (var557 != 0) {
									int var558 = this.field11906[var557 & 0xFF];
									int var559 = (var558 & 0xFF0000) * field9382 & 0xFF000000;
									int var560 = (var558 & 0xFF00) * field9386 & 0xFF0000;
									int var561 = (var558 & 0xFF) * field9387 & 0xFF00;
									int var562 = (var559 | var560 | var561) >>> 8;
									int var563 = var3[var511];
									int var564 = var562 + var563;
									int var565 = (var562 & 0xFF00FF) + (var563 & 0xFF00FF);
									int var566 = (var564 - var565 & 0x10000) + (var565 & 0x1000100);
									var3[var511] = var564 - var566 | var566 - (var566 >>> 8);
								}
							} else if (arg0 == 3) {
								byte var567 = this.field11907[var510];
								int var568 = var567 > 0 ? this.field11906[var567] : 0;
								int var569 = Statics.field9361;
								int var570 = var568 + var569;
								int var571 = (var568 & 0xFF00FF) + (var569 & 0xFF00FF);
								int var572 = (var570 - var571 & 0x10000) + (var571 & 0x1000100);
								int var573 = var570 - var572 | var572 - (var572 >>> 8);
								if (var568 == 0 && field9383 != 255) {
									int var575 = var3[var511];
									var573 = ((var573 & 0xFF00FF) * field9383 + (var575 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var573 & 0xFF00) * field9383 + (var575 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
								var3[var511] = var573;
							} else if (arg0 == 2) {
								byte var576 = this.field11907[var510];
								if (var576 != 0) {
									int var577 = this.field11906[var576 & 0xFF];
									int var578 = (var577 & 0xFF00FF) * field9383 & 0xFF00FF00;
									int var579 = (var577 & 0xFF00) * field9383 & 0xFF0000;
									int var580 = ((var578 | var579) >>> 8) + field9379;
									int var581 = var3[var511];
									int var582 = var580 + var581;
									int var583 = (var580 & 0xFF00FF) + (var581 & 0xFF00FF);
									int var584 = (var582 - var583 & 0x10000) + (var583 & 0x1000100);
									var3[var511] = var582 - var584 | var584 - (var584 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							byte var524 = this.field11907[var510];
							if (var524 != 0) {
								var3[var511] = this.field11906[var524 & 0xFF];
							}
						} else if (arg0 == 0) {
							byte var525 = this.field11907[var510];
							if (var525 != 0) {
								int var526 = this.field11906[var525 & 0xFF];
								if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
									int var527 = Statics.field9361 >>> 24;
									int var528 = 256 - var527;
									int var529 = var3[var511];
									var3[var511] = ((var526 & 0xFF00FF) * var527 + (var529 & 0xFF00FF) * var528 & 0xFF00FF00) + ((var526 & 0xFF00) * var527 + (var529 & 0xFF00) * var528 & 0xFF0000) >> 8;
								} else if (field9383 == 255) {
									int var535 = (var526 & 0xFF0000) * field9382 & 0xFF000000;
									int var536 = (var526 & 0xFF00) * field9386 & 0xFF0000;
									int var537 = (var526 & 0xFF) * field9387 & 0xFF00;
									var3[var511] = (var535 | var536 | var537) >>> 8;
								} else {
									int var530 = (var526 & 0xFF0000) * field9382 & 0xFF000000;
									int var531 = (var526 & 0xFF00) * field9386 & 0xFF0000;
									int var532 = (var526 & 0xFF) * field9387 & 0xFF00;
									int var533 = (var530 | var531 | var532) >>> 8;
									int var534 = var3[var511];
									var3[var511] = ((var533 & 0xFF00FF) * field9383 + (var534 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var533 & 0xFF00) * field9383 + (var534 & 0xFF00) * field9366 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							byte var538 = this.field11907[var510];
							int var539 = var538 > 0 ? this.field11906[var538] : 0;
							int var540 = Statics.field9361;
							int var541 = var539 + var540;
							int var542 = (var539 & 0xFF00FF) + (var540 & 0xFF00FF);
							int var543 = (var541 - var542 & 0x10000) + (var542 & 0x1000100);
							int var544 = var541 - var543 | var543 - (var543 >>> 8);
							if (var539 == 0 && field9383 != 255) {
								int var546 = var3[var511];
								var544 = ((var544 & 0xFF00FF) * field9383 + (var546 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var544 & 0xFF00) * field9383 + (var546 & 0xFF00) * field9366 & 0xFF0000) >> 8;
							}
							var3[var511] = var544;
						} else if (arg0 == 2) {
							byte var547 = this.field11907[var510];
							if (var547 != 0) {
								int var548 = this.field11906[var547 & 0xFF];
								int var549 = (var548 & 0xFF00FF) * field9383 & 0xFF00FF00;
								int var550 = (var548 & 0xFF00) * field9383 & 0xFF0000;
								var3[var511++] = ((var549 | var550) >>> 8) + field9379;
							}
						} else {
							throw new IllegalArgumentException();
						}
						var505 += Statics.field9357;
						var507++;
					}
				}
				var503++;
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		} else if (Statics.field9375 < 0) {
			for (int var585 = Statics.field9369; var585 < 0; var585++) {
				int var586 = Statics.field9371;
				int var587 = Statics.field9380 + Statics.field9378;
				int var588 = Statics.field9389 + Statics.field9381;
				int var589 = Statics.field9367;
				if (var587 < 0) {
					int var590 = (Statics.field9357 - 1 - var587) / Statics.field9357;
					var589 += var590;
					var587 += Statics.field9357 * var590;
					var588 += Statics.field9375 * var590;
					var586 += var590;
				}
				int var591;
				if ((var591 = (var587 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var589) {
					var589 = var591;
				}
				int var592;
				if ((var592 = var588 - (this.field9372 << 12)) >= 0) {
					int var593 = (Statics.field9375 - var592) / Statics.field9375;
					var589 += var593;
					var587 += Statics.field9357 * var593;
					var588 += Statics.field9375 * var593;
					var586 += var593;
				}
				int var594;
				if ((var594 = (var588 - Statics.field9375) / Statics.field9375) > var589) {
					var589 = var594;
				}
				while (var589 < 0) {
					int var595 = (var587 >> 12) + (var588 >> 12) * this.field9356;
					int var596 = var586++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							var3[var596] = this.field11906[this.field11907[var595] & 0xFF];
						} else if (arg0 == 0) {
							int var597 = this.field11906[this.field11907[var595] & 0xFF];
							int var598 = (var597 & 0xFF0000) * field9382 & 0xFF000000;
							int var599 = (var597 & 0xFF00) * field9386 & 0xFF0000;
							int var600 = (var597 & 0xFF) * field9387 & 0xFF00;
							var3[var596] = (var598 | var599 | var600) >>> 8;
						} else if (arg0 == 3) {
							int var601 = this.field11906[this.field11907[var595] & 0xFF];
							int var602 = Statics.field9361;
							int var603 = var601 + var602;
							int var604 = (var601 & 0xFF00FF) + (var602 & 0xFF00FF);
							int var605 = (var603 - var604 & 0x10000) + (var604 & 0x1000100);
							var3[var596] = var603 - var605 | var605 - (var605 >>> 8);
						} else if (arg0 == 2) {
							int var606 = this.field11906[this.field11907[var595] & 0xFF];
							int var607 = (var606 & 0xFF00FF) * field9383 & 0xFF00FF00;
							int var608 = (var606 & 0xFF00) * field9383 & 0xFF0000;
							var3[var596] = ((var607 | var608) >>> 8) + field9379;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							byte var636 = this.field11907[var595];
							if (var636 != 0) {
								int var637 = this.field11906[var636 & 0xFF];
								int var638 = var3[var596];
								int var639 = var637 + var638;
								int var640 = (var637 & 0xFF00FF) + (var638 & 0xFF00FF);
								int var641 = (var639 - var640 & 0x10000) + (var640 & 0x1000100);
								var3[var596] = var639 - var641 | var641 - (var641 >>> 8);
							}
						} else if (arg0 == 0) {
							byte var642 = this.field11907[var595];
							if (var642 != 0) {
								int var643 = this.field11906[var642 & 0xFF];
								int var644 = (var643 & 0xFF0000) * field9382 & 0xFF000000;
								int var645 = (var643 & 0xFF00) * field9386 & 0xFF0000;
								int var646 = (var643 & 0xFF) * field9387 & 0xFF00;
								int var647 = (var644 | var645 | var646) >>> 8;
								int var648 = var3[var596];
								int var649 = var647 + var648;
								int var650 = (var647 & 0xFF00FF) + (var648 & 0xFF00FF);
								int var651 = (var649 - var650 & 0x10000) + (var650 & 0x1000100);
								var3[var596] = var649 - var651 | var651 - (var651 >>> 8);
							}
						} else if (arg0 == 3) {
							byte var652 = this.field11907[var595];
							int var653 = var652 > 0 ? this.field11906[var652] : 0;
							int var654 = Statics.field9361;
							int var655 = var653 + var654;
							int var656 = (var653 & 0xFF00FF) + (var654 & 0xFF00FF);
							int var657 = (var655 - var656 & 0x10000) + (var656 & 0x1000100);
							int var658 = var655 - var657 | var657 - (var657 >>> 8);
							if (var653 == 0 && field9383 != 255) {
								int var660 = var3[var596];
								var658 = ((var658 & 0xFF00FF) * field9383 + (var660 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var658 & 0xFF00) * field9383 + (var660 & 0xFF00) * field9366 & 0xFF0000) >> 8;
							}
							var3[var596] = var658;
						} else if (arg0 == 2) {
							byte var661 = this.field11907[var595];
							if (var661 != 0) {
								int var662 = this.field11906[var661 & 0xFF];
								int var663 = (var662 & 0xFF00FF) * field9383 & 0xFF00FF00;
								int var664 = (var662 & 0xFF00) * field9383 & 0xFF0000;
								int var665 = ((var663 | var664) >>> 8) + field9379;
								int var666 = var3[var596];
								int var667 = var665 + var666;
								int var668 = (var665 & 0xFF00FF) + (var666 & 0xFF00FF);
								int var669 = (var667 - var668 & 0x10000) + (var668 & 0x1000100);
								var3[var596] = var667 - var669 | var669 - (var669 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						byte var609 = this.field11907[var595];
						if (var609 != 0) {
							var3[var596] = this.field11906[var609 & 0xFF];
						}
					} else if (arg0 == 0) {
						byte var610 = this.field11907[var595];
						if (var610 != 0) {
							int var611 = this.field11906[var610 & 0xFF];
							if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
								int var612 = Statics.field9361 >>> 24;
								int var613 = 256 - var612;
								int var614 = var3[var596];
								var3[var596] = ((var611 & 0xFF00FF) * var612 + (var614 & 0xFF00FF) * var613 & 0xFF00FF00) + ((var611 & 0xFF00) * var612 + (var614 & 0xFF00) * var613 & 0xFF0000) >> 8;
							} else if (field9383 == 255) {
								int var620 = (var611 & 0xFF0000) * field9382 & 0xFF000000;
								int var621 = (var611 & 0xFF00) * field9386 & 0xFF0000;
								int var622 = (var611 & 0xFF) * field9387 & 0xFF00;
								var3[var596] = (var620 | var621 | var622) >>> 8;
							} else {
								int var615 = (var611 & 0xFF0000) * field9382 & 0xFF000000;
								int var616 = (var611 & 0xFF00) * field9386 & 0xFF0000;
								int var617 = (var611 & 0xFF) * field9387 & 0xFF00;
								int var618 = (var615 | var616 | var617) >>> 8;
								int var619 = var3[var596];
								var3[var596] = ((var618 & 0xFF00FF) * field9383 + (var619 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var618 & 0xFF00) * field9383 + (var619 & 0xFF00) * field9366 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						byte var623 = this.field11907[var595];
						int var624 = var623 > 0 ? this.field11906[var623] : 0;
						int var625 = Statics.field9361;
						int var626 = var624 + var625;
						int var627 = (var624 & 0xFF00FF) + (var625 & 0xFF00FF);
						int var628 = (var626 - var627 & 0x10000) + (var627 & 0x1000100);
						int var629 = var626 - var628 | var628 - (var628 >>> 8);
						if (var624 == 0 && field9383 != 255) {
							int var631 = var3[var596];
							var629 = ((var629 & 0xFF00FF) * field9383 + (var631 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var629 & 0xFF00) * field9383 + (var631 & 0xFF00) * field9366 & 0xFF0000) >> 8;
						}
						var3[var596] = var629;
					} else if (arg0 == 2) {
						byte var632 = this.field11907[var595];
						if (var632 != 0) {
							int var633 = this.field11906[var632 & 0xFF];
							int var634 = (var633 & 0xFF00FF) * field9383 & 0xFF00FF00;
							int var635 = (var633 & 0xFF00) * field9383 & 0xFF0000;
							var3[var596++] = ((var634 | var635) >>> 8) + field9379;
						}
					} else {
						throw new IllegalArgumentException();
					}
					var587 += Statics.field9357;
					var588 += Statics.field9375;
					var589++;
				}
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		} else {
			for (int var670 = Statics.field9369; var670 < 0; var670++) {
				int var671 = Statics.field9371;
				int var672 = Statics.field9380 + Statics.field9378;
				int var673 = Statics.field9389 + Statics.field9381;
				int var674 = Statics.field9367;
				if (var672 < 0) {
					int var675 = (Statics.field9357 - 1 - var672) / Statics.field9357;
					var674 += var675;
					var672 += Statics.field9357 * var675;
					var673 += Statics.field9375 * var675;
					var671 += var675;
				}
				int var676;
				if ((var676 = (var672 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var674) {
					var674 = var676;
				}
				if (var673 < 0) {
					int var677 = (Statics.field9375 - 1 - var673) / Statics.field9375;
					var674 += var677;
					var672 += Statics.field9357 * var677;
					var673 += Statics.field9375 * var677;
					var671 += var677;
				}
				int var678;
				if ((var678 = (var673 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var674) {
					var674 = var678;
				}
				while (var674 < 0) {
					int var679 = (var672 >> 12) + (var673 >> 12) * this.field9356;
					int var680 = var671++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							var3[var680] = this.field11906[this.field11907[var679] & 0xFF];
						} else if (arg0 == 0) {
							int var681 = this.field11906[this.field11907[var679] & 0xFF];
							int var682 = (var681 & 0xFF0000) * field9382 & 0xFF000000;
							int var683 = (var681 & 0xFF00) * field9386 & 0xFF0000;
							int var684 = (var681 & 0xFF) * field9387 & 0xFF00;
							var3[var680] = (var682 | var683 | var684) >>> 8;
						} else if (arg0 == 3) {
							int var685 = this.field11906[this.field11907[var679] & 0xFF];
							int var686 = Statics.field9361;
							int var687 = var685 + var686;
							int var688 = (var685 & 0xFF00FF) + (var686 & 0xFF00FF);
							int var689 = (var687 - var688 & 0x10000) + (var688 & 0x1000100);
							var3[var680] = var687 - var689 | var689 - (var689 >>> 8);
						} else if (arg0 == 2) {
							int var690 = this.field11906[this.field11907[var679] & 0xFF];
							int var691 = (var690 & 0xFF00FF) * field9383 & 0xFF00FF00;
							int var692 = (var690 & 0xFF00) * field9383 & 0xFF0000;
							var3[var680] = ((var691 | var692) >>> 8) + field9379;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							byte var720 = this.field11907[var679];
							if (var720 != 0) {
								int var721 = this.field11906[var720 & 0xFF];
								int var722 = var3[var680];
								int var723 = var721 + var722;
								int var724 = (var721 & 0xFF00FF) + (var722 & 0xFF00FF);
								int var725 = (var723 - var724 & 0x10000) + (var724 & 0x1000100);
								var3[var680] = var723 - var725 | var725 - (var725 >>> 8);
							}
						} else if (arg0 == 0) {
							byte var726 = this.field11907[var679];
							if (var726 != 0) {
								int var727 = this.field11906[var726 & 0xFF];
								int var728 = (var727 & 0xFF0000) * field9382 & 0xFF000000;
								int var729 = (var727 & 0xFF00) * field9386 & 0xFF0000;
								int var730 = (var727 & 0xFF) * field9387 & 0xFF00;
								int var731 = (var728 | var729 | var730) >>> 8;
								int var732 = var3[var680];
								int var733 = var731 + var732;
								int var734 = (var731 & 0xFF00FF) + (var732 & 0xFF00FF);
								int var735 = (var733 - var734 & 0x10000) + (var734 & 0x1000100);
								var3[var680] = var733 - var735 | var735 - (var735 >>> 8);
							}
						} else if (arg0 == 3) {
							byte var736 = this.field11907[var679];
							int var737 = var736 > 0 ? this.field11906[var736] : 0;
							int var738 = Statics.field9361;
							int var739 = var737 + var738;
							int var740 = (var737 & 0xFF00FF) + (var738 & 0xFF00FF);
							int var741 = (var739 - var740 & 0x10000) + (var740 & 0x1000100);
							int var742 = var739 - var741 | var741 - (var741 >>> 8);
							if (var737 == 0 && field9383 != 255) {
								int var744 = var3[var680];
								var742 = ((var742 & 0xFF00FF) * field9383 + (var744 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var742 & 0xFF00) * field9383 + (var744 & 0xFF00) * field9366 & 0xFF0000) >> 8;
							}
							var3[var680] = var742;
						} else if (arg0 == 2) {
							byte var745 = this.field11907[var679];
							if (var745 != 0) {
								int var746 = this.field11906[var745 & 0xFF];
								int var747 = (var746 & 0xFF00FF) * field9383 & 0xFF00FF00;
								int var748 = (var746 & 0xFF00) * field9383 & 0xFF0000;
								int var749 = ((var747 | var748) >>> 8) + field9379;
								int var750 = var3[var680];
								int var751 = var749 + var750;
								int var752 = (var749 & 0xFF00FF) + (var750 & 0xFF00FF);
								int var753 = (var751 - var752 & 0x10000) + (var752 & 0x1000100);
								var3[var680] = var751 - var753 | var753 - (var753 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						byte var693 = this.field11907[var679];
						if (var693 != 0) {
							var3[var680] = this.field11906[var693 & 0xFF];
						}
					} else if (arg0 == 0) {
						byte var694 = this.field11907[var679];
						if (var694 != 0) {
							int var695 = this.field11906[var694 & 0xFF];
							if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
								int var696 = Statics.field9361 >>> 24;
								int var697 = 256 - var696;
								int var698 = var3[var680];
								var3[var680] = ((var695 & 0xFF00FF) * var696 + (var698 & 0xFF00FF) * var697 & 0xFF00FF00) + ((var695 & 0xFF00) * var696 + (var698 & 0xFF00) * var697 & 0xFF0000) >> 8;
							} else if (field9383 == 255) {
								int var704 = (var695 & 0xFF0000) * field9382 & 0xFF000000;
								int var705 = (var695 & 0xFF00) * field9386 & 0xFF0000;
								int var706 = (var695 & 0xFF) * field9387 & 0xFF00;
								var3[var680] = (var704 | var705 | var706) >>> 8;
							} else {
								int var699 = (var695 & 0xFF0000) * field9382 & 0xFF000000;
								int var700 = (var695 & 0xFF00) * field9386 & 0xFF0000;
								int var701 = (var695 & 0xFF) * field9387 & 0xFF00;
								int var702 = (var699 | var700 | var701) >>> 8;
								int var703 = var3[var680];
								var3[var680] = ((var702 & 0xFF00FF) * field9383 + (var703 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var702 & 0xFF00) * field9383 + (var703 & 0xFF00) * field9366 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						byte var707 = this.field11907[var679];
						int var708 = var707 > 0 ? this.field11906[var707] : 0;
						int var709 = Statics.field9361;
						int var710 = var708 + var709;
						int var711 = (var708 & 0xFF00FF) + (var709 & 0xFF00FF);
						int var712 = (var710 - var711 & 0x10000) + (var711 & 0x1000100);
						int var713 = var710 - var712 | var712 - (var712 >>> 8);
						if (var708 == 0 && field9383 != 255) {
							int var715 = var3[var680];
							var713 = ((var713 & 0xFF00FF) * field9383 + (var715 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var713 & 0xFF00) * field9383 + (var715 & 0xFF00) * field9366 & 0xFF0000) >> 8;
						}
						var3[var680] = var713;
					} else if (arg0 == 2) {
						byte var716 = this.field11907[var679];
						if (var716 != 0) {
							int var717 = this.field11906[var716 & 0xFF];
							int var718 = (var717 & 0xFF00FF) * field9383 & 0xFF00FF00;
							int var719 = (var717 & 0xFF00) * field9383 & 0xFF0000;
							var3[var680++] = ((var718 | var719) >>> 8) + field9379;
						}
					} else {
						throw new IllegalArgumentException();
					}
					var672 += Statics.field9357;
					var673 += Statics.field9375;
					var674++;
				}
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		}
	}

	@ObfuscatedName("apd.cu([I[III)V")
	public void method15356(int[] arg0, int[] arg1, int arg2, int arg3) {
		int[] var5 = this.field9373.field9778;
		if (var5 == null) {
			return;
		}
		if (Statics.field9357 == 0) {
			if (Statics.field9375 == 0) {
				int var6 = Statics.field9369;
				while (var6 < 0) {
					int var7 = arg3 + var6;
					if (var7 >= 0) {
						if (var7 >= arg0.length) {
							return;
						}
						int var8 = Statics.field9371;
						int var9 = Statics.field9378;
						int var10 = Statics.field9389;
						int var11 = Statics.field9367;
						if (var9 >= 0 && var10 >= 0 && var9 - (this.field9356 << 12) < 0 && var10 - (this.field9372 << 12) < 0) {
							int var12 = arg0[var7] - arg2;
							int var13 = -arg1[var7];
							int var14 = var12 - (var8 - Statics.field9371);
							if (var14 > 0) {
								var8 += var14;
								var11 += var14;
								var9 += Statics.field9357 * var14;
								var10 += Statics.field9375 * var14;
							} else {
								var13 -= var14;
							}
							if (var11 < var13) {
								var11 = var13;
							}
							while (var11 < 0) {
								byte var15 = this.field11907[(var9 >> 12) + (var10 >> 12) * this.field9356];
								if (var15 == 0) {
									var8++;
								} else {
									var5[var8++] = this.field11906[var15 & 0xFF];
								}
								var11++;
							}
						}
					}
					var6++;
					Statics.field9371 += Statics.field9370;
				}
			} else if (Statics.field9375 < 0) {
				int var16 = Statics.field9369;
				while (var16 < 0) {
					int var17 = arg3 + var16;
					if (var17 >= 0) {
						if (var17 >= arg0.length) {
							return;
						}
						int var18 = Statics.field9371;
						int var19 = Statics.field9378;
						int var20 = Statics.field9389 + Statics.field9381;
						int var21 = Statics.field9367;
						if (var19 >= 0 && var19 - (this.field9356 << 12) < 0) {
							int var22;
							if ((var22 = var20 - (this.field9372 << 12)) >= 0) {
								int var23 = (Statics.field9375 - var22) / Statics.field9375;
								var21 += var23;
								var20 += Statics.field9375 * var23;
								var18 += var23;
							}
							int var24;
							if ((var24 = (var20 - Statics.field9375) / Statics.field9375) > var21) {
								var21 = var24;
							}
							int var25 = arg0[var17] - arg2;
							int var26 = -arg1[var17];
							int var27 = var25 - (var18 - Statics.field9371);
							if (var27 > 0) {
								var18 += var27;
								var21 += var27;
								var19 += Statics.field9357 * var27;
								var20 += Statics.field9375 * var27;
							} else {
								var26 -= var27;
							}
							if (var21 < var26) {
								var21 = var26;
							}
							while (var21 < 0) {
								byte var28 = this.field11907[(var19 >> 12) + (var20 >> 12) * this.field9356];
								if (var28 == 0) {
									var18++;
								} else {
									var5[var18++] = this.field11906[var28 & 0xFF];
								}
								var20 += Statics.field9375;
								var21++;
							}
						}
					}
					var16++;
					Statics.field9378 += Statics.field9374;
					Statics.field9371 += Statics.field9370;
				}
			} else {
				int var29 = Statics.field9369;
				while (var29 < 0) {
					int var30 = arg3 + var29;
					if (var30 >= 0) {
						if (var30 >= arg0.length) {
							return;
						}
						int var31 = Statics.field9371;
						int var32 = Statics.field9378;
						int var33 = Statics.field9389 + Statics.field9381;
						int var34 = Statics.field9367;
						if (var32 >= 0 && var32 - (this.field9356 << 12) < 0) {
							if (var33 < 0) {
								int var35 = (Statics.field9375 - 1 - var33) / Statics.field9375;
								var34 += var35;
								var33 += Statics.field9375 * var35;
								var31 += var35;
							}
							int var36;
							if ((var36 = (var33 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var34) {
								var34 = var36;
							}
							int var37 = arg0[var30] - arg2;
							int var38 = -arg1[var30];
							int var39 = var37 - (var31 - Statics.field9371);
							if (var39 > 0) {
								var31 += var39;
								var34 += var39;
								var32 += Statics.field9357 * var39;
								var33 += Statics.field9375 * var39;
							} else {
								var38 -= var39;
							}
							if (var34 < var38) {
								var34 = var38;
							}
							while (var34 < 0) {
								byte var40 = this.field11907[(var32 >> 12) + (var33 >> 12) * this.field9356];
								if (var40 == 0) {
									var31++;
								} else {
									var5[var31++] = this.field11906[var40 & 0xFF];
								}
								var33 += Statics.field9375;
								var34++;
							}
						}
					}
					var29++;
					Statics.field9378 += Statics.field9374;
					Statics.field9371 += Statics.field9370;
				}
			}
		} else if (Statics.field9357 < 0) {
			if (Statics.field9375 == 0) {
				int var41 = Statics.field9369;
				while (var41 < 0) {
					int var42 = arg3 + var41;
					if (var42 >= 0) {
						if (var42 >= arg0.length) {
							return;
						}
						int var43 = Statics.field9371;
						int var44 = Statics.field9380 + Statics.field9378;
						int var45 = Statics.field9389;
						int var46 = Statics.field9367;
						if (var45 >= 0 && var45 - (this.field9372 << 12) < 0) {
							int var47;
							if ((var47 = var44 - (this.field9356 << 12)) >= 0) {
								int var48 = (Statics.field9357 - var47) / Statics.field9357;
								var46 += var48;
								var44 += Statics.field9357 * var48;
								var43 += var48;
							}
							int var49;
							if ((var49 = (var44 - Statics.field9357) / Statics.field9357) > var46) {
								var46 = var49;
							}
							int var50 = arg0[var42] - arg2;
							int var51 = -arg1[var42];
							int var52 = var50 - (var43 - Statics.field9371);
							if (var52 > 0) {
								var43 += var52;
								var46 += var52;
								var44 += Statics.field9357 * var52;
								var45 += Statics.field9375 * var52;
							} else {
								var51 -= var52;
							}
							if (var46 < var51) {
								var46 = var51;
							}
							while (var46 < 0) {
								byte var53 = this.field11907[(var44 >> 12) + (var45 >> 12) * this.field9356];
								if (var53 == 0) {
									var43++;
								} else {
									var5[var43++] = this.field11906[var53 & 0xFF];
								}
								var44 += Statics.field9357;
								var46++;
							}
						}
					}
					var41++;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			} else if (Statics.field9375 < 0) {
				int var54 = Statics.field9369;
				while (var54 < 0) {
					int var55 = arg3 + var54;
					if (var55 >= 0) {
						if (var55 >= arg0.length) {
							return;
						}
						int var56 = Statics.field9371;
						int var57 = Statics.field9380 + Statics.field9378;
						int var58 = Statics.field9389 + Statics.field9381;
						int var59 = Statics.field9367;
						int var60;
						if ((var60 = var57 - (this.field9356 << 12)) >= 0) {
							int var61 = (Statics.field9357 - var60) / Statics.field9357;
							var59 += var61;
							var57 += Statics.field9357 * var61;
							var58 += Statics.field9375 * var61;
							var56 += var61;
						}
						int var62;
						if ((var62 = (var57 - Statics.field9357) / Statics.field9357) > var59) {
							var59 = var62;
						}
						int var63;
						if ((var63 = var58 - (this.field9372 << 12)) >= 0) {
							int var64 = (Statics.field9375 - var63) / Statics.field9375;
							var59 += var64;
							var57 += Statics.field9357 * var64;
							var58 += Statics.field9375 * var64;
							var56 += var64;
						}
						int var65;
						if ((var65 = (var58 - Statics.field9375) / Statics.field9375) > var59) {
							var59 = var65;
						}
						int var66 = arg0[var55] - arg2;
						int var67 = -arg1[var55];
						int var68 = var66 - (var56 - Statics.field9371);
						if (var68 > 0) {
							var56 += var68;
							var59 += var68;
							var57 += Statics.field9357 * var68;
							var58 += Statics.field9375 * var68;
						} else {
							var67 -= var68;
						}
						if (var59 < var67) {
							var59 = var67;
						}
						while (var59 < 0) {
							byte var69 = this.field11907[(var57 >> 12) + (var58 >> 12) * this.field9356];
							if (var69 == 0) {
								var56++;
							} else {
								var5[var56++] = this.field11906[var69 & 0xFF];
							}
							var57 += Statics.field9357;
							var58 += Statics.field9375;
							var59++;
						}
					}
					var54++;
					Statics.field9378 += Statics.field9374;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			} else {
				int var70 = Statics.field9369;
				while (var70 < 0) {
					int var71 = arg3 + var70;
					if (var71 >= 0) {
						if (var71 >= arg0.length) {
							return;
						}
						int var72 = Statics.field9371;
						int var73 = Statics.field9380 + Statics.field9378;
						int var74 = Statics.field9389 + Statics.field9381;
						int var75 = Statics.field9367;
						int var76;
						if ((var76 = var73 - (this.field9356 << 12)) >= 0) {
							int var77 = (Statics.field9357 - var76) / Statics.field9357;
							var75 += var77;
							var73 += Statics.field9357 * var77;
							var74 += Statics.field9375 * var77;
							var72 += var77;
						}
						int var78;
						if ((var78 = (var73 - Statics.field9357) / Statics.field9357) > var75) {
							var75 = var78;
						}
						if (var74 < 0) {
							int var79 = (Statics.field9375 - 1 - var74) / Statics.field9375;
							var75 += var79;
							var73 += Statics.field9357 * var79;
							var74 += Statics.field9375 * var79;
							var72 += var79;
						}
						int var80;
						if ((var80 = (var74 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var75) {
							var75 = var80;
						}
						int var81 = arg0[var71] - arg2;
						int var82 = -arg1[var71];
						int var83 = var81 - (var72 - Statics.field9371);
						if (var83 > 0) {
							var72 += var83;
							var75 += var83;
							var73 += Statics.field9357 * var83;
							var74 += Statics.field9375 * var83;
						} else {
							var82 -= var83;
						}
						if (var75 < var82) {
							var75 = var82;
						}
						while (var75 < 0) {
							byte var84 = this.field11907[(var73 >> 12) + (var74 >> 12) * this.field9356];
							if (var84 == 0) {
								var72++;
							} else {
								var5[var72++] = this.field11906[var84 & 0xFF];
							}
							var73 += Statics.field9357;
							var74 += Statics.field9375;
							var75++;
						}
					}
					var70++;
					Statics.field9378 += Statics.field9374;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			}
		} else if (Statics.field9375 == 0) {
			int var85 = Statics.field9369;
			while (var85 < 0) {
				int var86 = arg3 + var85;
				if (var86 >= 0) {
					if (var86 >= arg0.length) {
						return;
					}
					int var87 = Statics.field9371;
					int var88 = Statics.field9380 + Statics.field9378;
					int var89 = Statics.field9389;
					int var90 = Statics.field9367;
					if (var89 >= 0 && var89 - (this.field9372 << 12) < 0) {
						if (var88 < 0) {
							int var91 = (Statics.field9357 - 1 - var88) / Statics.field9357;
							var90 += var91;
							var88 += Statics.field9357 * var91;
							var87 += var91;
						}
						int var92;
						if ((var92 = (var88 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var90) {
							var90 = var92;
						}
						int var93 = arg0[var86] - arg2;
						int var94 = -arg1[var86];
						int var95 = var93 - (var87 - Statics.field9371);
						if (var95 > 0) {
							var87 += var95;
							var90 += var95;
							var88 += Statics.field9357 * var95;
							var89 += Statics.field9375 * var95;
						} else {
							var94 -= var95;
						}
						if (var90 < var94) {
							var90 = var94;
						}
						while (var90 < 0) {
							byte var96 = this.field11907[(var88 >> 12) + (var89 >> 12) * this.field9356];
							if (var96 == 0) {
								var87++;
							} else {
								var5[var87++] = this.field11906[var96 & 0xFF];
							}
							var88 += Statics.field9357;
							var90++;
						}
					}
				}
				var85++;
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		} else if (Statics.field9375 < 0) {
			int var97 = Statics.field9369;
			while (var97 < 0) {
				int var98 = arg3 + var97;
				if (var98 >= 0) {
					if (var98 >= arg0.length) {
						return;
					}
					int var99 = Statics.field9371;
					int var100 = Statics.field9380 + Statics.field9378;
					int var101 = Statics.field9389 + Statics.field9381;
					int var102 = Statics.field9367;
					if (var100 < 0) {
						int var103 = (Statics.field9357 - 1 - var100) / Statics.field9357;
						var102 += var103;
						var100 += Statics.field9357 * var103;
						var101 += Statics.field9375 * var103;
						var99 += var103;
					}
					int var104;
					if ((var104 = (var100 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var102) {
						var102 = var104;
					}
					int var105;
					if ((var105 = var101 - (this.field9372 << 12)) >= 0) {
						int var106 = (Statics.field9375 - var105) / Statics.field9375;
						var102 += var106;
						var100 += Statics.field9357 * var106;
						var101 += Statics.field9375 * var106;
						var99 += var106;
					}
					int var107;
					if ((var107 = (var101 - Statics.field9375) / Statics.field9375) > var102) {
						var102 = var107;
					}
					int var108 = arg0[var98] - arg2;
					int var109 = -arg1[var98];
					int var110 = var108 - (var99 - Statics.field9371);
					if (var110 > 0) {
						var99 += var110;
						var102 += var110;
						var100 += Statics.field9357 * var110;
						var101 += Statics.field9375 * var110;
					} else {
						var109 -= var110;
					}
					if (var102 < var109) {
						var102 = var109;
					}
					while (var102 < 0) {
						byte var111 = this.field11907[(var100 >> 12) + (var101 >> 12) * this.field9356];
						if (var111 == 0) {
							var99++;
						} else {
							var5[var99++] = this.field11906[var111 & 0xFF];
						}
						var100 += Statics.field9357;
						var101 += Statics.field9375;
						var102++;
					}
				}
				var97++;
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		} else {
			int var112 = Statics.field9369;
			while (var112 < 0) {
				int var113 = arg3 + var112;
				if (var113 >= 0) {
					if (var113 >= arg0.length) {
						return;
					}
					int var114 = Statics.field9371;
					int var115 = Statics.field9380 + Statics.field9378;
					int var116 = Statics.field9389 + Statics.field9381;
					int var117 = Statics.field9367;
					if (var115 < 0) {
						int var118 = (Statics.field9357 - 1 - var115) / Statics.field9357;
						var117 += var118;
						var115 += Statics.field9357 * var118;
						var116 += Statics.field9375 * var118;
						var114 += var118;
					}
					int var119;
					if ((var119 = (var115 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var117) {
						var117 = var119;
					}
					if (var116 < 0) {
						int var120 = (Statics.field9375 - 1 - var116) / Statics.field9375;
						var117 += var120;
						var115 += Statics.field9357 * var120;
						var116 += Statics.field9375 * var120;
						var114 += var120;
					}
					int var121;
					if ((var121 = (var116 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var117) {
						var117 = var121;
					}
					int var122 = arg0[var113] - arg2;
					int var123 = -arg1[var113];
					int var124 = var122 - (var114 - Statics.field9371);
					if (var124 > 0) {
						var114 += var124;
						var117 += var124;
						var115 += Statics.field9357 * var124;
						var116 += Statics.field9375 * var124;
					} else {
						var123 -= var124;
					}
					if (var117 < var123) {
						var117 = var123;
					}
					while (var117 < 0) {
						byte var125 = this.field11907[(var115 >> 12) + (var116 >> 12) * this.field9356];
						if (var125 == 0) {
							var114++;
						} else {
							var5[var114++] = this.field11906[var125 & 0xFF];
						}
						var115 += Statics.field9357;
						var116 += Statics.field9375;
						var117++;
					}
				}
				var112++;
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		}
	}
}
