package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("apv")
public class class1115 extends class829 {

	@ObfuscatedName("apv.am")
	public int[] field11905;

	public class1115(class848 arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		this.field11905 = new int[arg1 * arg2];
	}

	public class1115(class848 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		super(arg0, arg4, arg5);
		if (arg6) {
			this.field11905 = new int[arg4 * arg5];
		} else {
			this.field11905 = arg1;
		}
		int var8 = arg3 - this.field9356;
		int var9 = 0;
		for (int var10 = 0; var10 < arg5; var10++) {
			for (int var11 = 0; var11 < arg4; var11++) {
				this.field11905[var9++] = arg1[arg2++];
			}
			arg2 += var8;
		}
	}

	public class1115(class848 arg0, int[] arg1, int arg2, int arg3) {
		super(arg0, arg2, arg3);
		this.field11905 = arg1;
	}

	@ObfuscatedName("apv.u(IIII[III)V")
	public void method1469(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		int var8 = arg6 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = (arg1 + var9) * arg2 + arg0;
			for (int var11 = 0; var11 < arg2; var11++) {
				this.field11905[var10 + var11] = arg4[arg5++];
			}
			arg5 += var8;
		}
	}

	@ObfuscatedName("apv.cq(IIII[III)V")
	public void method18950(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		int var8 = arg6 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = (arg1 + var9) * arg2 + arg0;
			for (int var11 = 0; var11 < arg2; var11++) {
				arg4[arg5++] = this.field11905[var10 + var11];
			}
			arg5 += var8;
		}
	}

	@ObfuscatedName("apv.z(IIII[I[III)V")
	public void method1476(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7) {
		this.method18950(arg0, arg1, arg2, arg3, arg4, arg6, arg7);
	}

	@ObfuscatedName("apv.p(IIIIII)V")
	public void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int[] var7 = this.field9373.field9778;
		if (var7 == null) {
			throw new IllegalStateException("");
		}
		for (int var8 = 0; var8 < arg3; var8++) {
			int var9 = (arg1 + var8) * arg2 + arg0;
			int var10 = (arg5 + var8) * arg2 + arg4;
			for (int var11 = 0; var11 < arg2; var11++) {
				this.field11905[var9 + var11] = var7[var10 + var11] & 0xFFFFFF;
			}
		}
	}

	@ObfuscatedName("apv.d(III)V")
	public void method1441(int arg0, int arg1, int arg2) {
		int[] var4 = this.field9373.field9778;
		if (var4 == null) {
			throw new IllegalStateException("");
		} else if (arg2 == 0) {
			for (int var5 = 0; var5 < this.field9372; var5++) {
				int var6 = this.field9356 * var5;
				int var7 = this.field9373.field9779 * (arg1 + var5) + arg0;
				for (int var8 = 0; var8 < this.field9356; var8++) {
					this.field11905[var6 + var8] = this.field11905[var6 + var8] & 0xFFFFFF | (var4[var7 + var8] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (int var9 = 0; var9 < this.field9372; var9++) {
				int var10 = this.field9356 * var9;
				int var11 = this.field9373.field9779 * (arg1 + var9) + arg0;
				for (int var12 = 0; var12 < this.field9356; var12++) {
					this.field11905[var10 + var12] = this.field11905[var10 + var12] & 0xFFFFFF | (var4[var11 + var12] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (int var13 = 0; var13 < this.field9372; var13++) {
				int var14 = this.field9356 * var13;
				int var15 = this.field9373.field9779 * (arg1 + var13) + arg0;
				for (int var16 = 0; var16 < this.field9356; var16++) {
					this.field11905[var14 + var16] = this.field11905[var14 + var16] & 0xFFFFFF | (var4[var15 + var16] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (int var17 = 0; var17 < this.field9372; var17++) {
				int var18 = this.field9356 * var17;
				int var19 = this.field9373.field9779 * (arg1 + var17) + arg0;
				for (int var20 = 0; var20 < this.field9356; var20++) {
					this.field11905[var18 + var20] = this.field11905[var18 + var20] & 0xFFFFFF | (var4[var19 + var20] == 0 ? 0 : -16777216);
				}
			}
		}
	}

	@ObfuscatedName("apv.l()Ldp;")
	public class130 method1437() {
		return new class60(this.field9356, this.field9372, this.field11905);
	}

	@ObfuscatedName("apv.r(IIIII)V")
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
						var6[var10++] = this.field11905[var11++];
						var6[var10++] = this.field11905[var11++];
						var6[var10++] = this.field11905[var11++];
						var6[var10++] = this.field11905[var11++];
					}
					var20 += 3;
					while (var10 < var20) {
						var6[var10++] = this.field11905[var11++];
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
						int var26 = this.field11905[var11++];
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
						int var32 = this.field11905[var11++];
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
						int var43 = this.field11905[var11++];
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
				for (int var99 = -var12; var99 < 0; var99++) {
					for (int var100 = -var13; var100 < 0; var100++) {
						int var101 = this.field11905[var11++];
						if (var101 == 0) {
							var10++;
						} else {
							int var102 = var6[var10];
							int var103 = var101 + var102;
							int var104 = (var101 & 0xFF00FF) + (var102 & 0xFF00FF);
							int var105 = (var103 - var104 & 0x10000) + (var104 & 0x1000100);
							var6[var10++] = var103 - var105 | var105 - (var105 >>> 8);
						}
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 0) {
				int var106 = arg3 >> 16 & 0xFF;
				int var107 = arg3 >> 8 & 0xFF;
				int var108 = arg3 & 0xFF;
				for (int var109 = -var12; var109 < 0; var109++) {
					for (int var110 = -var13; var110 < 0; var110++) {
						int var111 = this.field11905[var11++];
						if (var111 == 0) {
							var10++;
						} else {
							int var112 = (var111 & 0xFF0000) * var106 & 0xFF000000;
							int var113 = (var111 & 0xFF00) * var107 & 0xFF0000;
							int var114 = (var111 & 0xFF) * var108 & 0xFF00;
							int var115 = (var112 | var113 | var114) >>> 8;
							int var116 = var6[var10];
							int var117 = var115 + var116;
							int var118 = (var115 & 0xFF00FF) + (var116 & 0xFF00FF);
							int var119 = (var117 - var118 & 0x10000) + (var118 & 0x1000100);
							var6[var10++] = var117 - var119 | var119 - (var119 >>> 8);
						}
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 3) {
				for (int var120 = -var12; var120 < 0; var120++) {
					for (int var121 = -var13; var121 < 0; var121++) {
						int var122 = this.field11905[var11++];
						int var123 = arg3 + var122;
						int var124 = (arg3 & 0xFF00FF) + (var122 & 0xFF00FF);
						int var125 = (var123 - var124 & 0x10000) + (var124 & 0x1000100);
						int var126 = var123 - var125 | var125 - (var125 >>> 8);
						int var127 = var6[var10];
						int var128 = var126 + var127;
						int var129 = (var126 & 0xFF00FF) + (var127 & 0xFF00FF);
						int var130 = (var128 - var129 & 0x10000) + (var129 & 0x1000100);
						var6[var10++] = var128 - var130 | var130 - (var130 >>> 8);
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 2) {
				int var131 = arg3 >>> 24;
				int var132 = 256 - var131;
				int var133 = (arg3 & 0xFF00FF) * var132 & 0xFF00FF00;
				int var134 = (arg3 & 0xFF00) * var132 & 0xFF0000;
				int var135 = (var133 | var134) >>> 8;
				for (int var136 = -var12; var136 < 0; var136++) {
					for (int var137 = -var13; var137 < 0; var137++) {
						int var138 = this.field11905[var11++];
						if (var138 == 0) {
							var10++;
						} else {
							int var139 = (var138 & 0xFF00FF) * var131 & 0xFF00FF00;
							int var140 = (var138 & 0xFF00) * var131 & 0xFF0000;
							int var141 = ((var139 | var140) >>> 8) + var135;
							int var142 = var6[var10];
							int var143 = var141 + var142;
							int var144 = (var141 & 0xFF00FF) + (var142 & 0xFF00FF);
							int var145 = (var143 - var144 & 0x10000) + (var144 & 0x1000100);
							var6[var10++] = var143 - var145 | var145 - (var145 >>> 8);
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
					int var48 = this.field11905[var11++];
					int var49 = var48 >>> 24;
					int var50 = 256 - var49;
					int var51 = var6[var10];
					var6[var10++] = ((var48 & 0xFF00FF) * var49 + (var51 & 0xFF00FF) * var50 >> 8 & 0xFFFF00FF) + (((var48 & 0xFF00FF00) >>> 8) * var49 + ((var51 & 0xFF00FF00) >>> 8) * var50 & 0xFF00FF00);
				}
				var10 += var14;
				var11 += var15;
			}
		} else if (arg2 == 0) {
			if ((arg3 & 0xFFFFFF) == 16777215) {
				for (int var52 = -var12; var52 < 0; var52++) {
					for (int var53 = -var13; var53 < 0; var53++) {
						int var54 = this.field11905[var11++];
						int var55 = (arg3 >>> 24) * (var54 >>> 24) >> 8;
						int var56 = 256 - var55;
						int var57 = var6[var10];
						var6[var10++] = ((var54 & 0xFF00FF) * var55 + (var57 & 0xFF00FF) * var56 & 0xFF00FF00) + ((var54 & 0xFF00) * var55 + (var57 & 0xFF00) * var56 & 0xFF0000) >> 8;
					}
					var10 += var14;
					var11 += var15;
				}
			} else {
				int var58 = arg3 >> 16 & 0xFF;
				int var59 = arg3 >> 8 & 0xFF;
				int var60 = arg3 & 0xFF;
				for (int var61 = -var12; var61 < 0; var61++) {
					for (int var62 = -var13; var62 < 0; var62++) {
						int var63 = this.field11905[var11++];
						int var64 = (arg3 >>> 24) * (var63 >>> 24) >> 8;
						int var65 = 256 - var64;
						if (var64 == 255) {
							int var71 = (var63 & 0xFF0000) * var58 & 0xFF000000;
							int var72 = (var63 & 0xFF00) * var59 & 0xFF0000;
							int var73 = (var63 & 0xFF) * var60 & 0xFF00;
							var6[var10++] = (var71 | var72 | var73) >>> 8;
						} else {
							int var66 = (var63 & 0xFF0000) * var58 & 0xFF000000;
							int var67 = (var63 & 0xFF00) * var59 & 0xFF0000;
							int var68 = (var63 & 0xFF) * var60 & 0xFF00;
							int var69 = (var66 | var67 | var68) >>> 8;
							int var70 = var6[var10];
							var6[var10++] = ((var69 & 0xFF00FF) * var64 + (var70 & 0xFF00FF) * var65 & 0xFF00FF00) + ((var69 & 0xFF00) * var64 + (var70 & 0xFF00) * var65 & 0xFF0000) >> 8;
						}
					}
					var10 += var14;
					var11 += var15;
				}
			}
		} else if (arg2 == 3) {
			for (int var74 = -var12; var74 < 0; var74++) {
				for (int var75 = -var13; var75 < 0; var75++) {
					int var76 = this.field11905[var11++];
					int var77 = arg3 + var76;
					int var78 = (arg3 & 0xFF00FF) + (var76 & 0xFF00FF);
					int var79 = (var77 - var78 & 0x10000) + (var78 & 0x1000100);
					int var80 = var77 - var79 | var79 - (var79 >>> 8);
					int var81 = (arg3 >>> 24) * (var80 >>> 24) >> 8;
					int var82 = 256 - var81;
					if (var81 != 255) {
						int var84 = var6[var10];
						var80 = ((var80 & 0xFF00FF) * var81 + (var84 & 0xFF00FF) * var82 & 0xFF00FF00) + ((var80 & 0xFF00) * var81 + (var84 & 0xFF00) * var82 & 0xFF0000) >> 8;
					}
					var6[var10++] = var80;
				}
				var10 += var14;
				var11 += var15;
			}
		} else if (arg2 == 2) {
			int var85 = arg3 >>> 24;
			int var86 = 256 - var85;
			int var87 = (arg3 & 0xFF00FF) * var86 & 0xFF00FF00;
			int var88 = (arg3 & 0xFF00) * var86 & 0xFF0000;
			int var89 = (var87 | var88) >>> 8;
			for (int var90 = -var12; var90 < 0; var90++) {
				for (int var91 = -var13; var91 < 0; var91++) {
					int var92 = this.field11905[var11++];
					int var93 = var92 >>> 24;
					int var94 = 256 - var93;
					int var95 = (var92 & 0xFF00FF) * var85 & 0xFF00FF00;
					int var96 = (var92 & 0xFF00) * var85 & 0xFF0000;
					int var97 = ((var95 | var96) >>> 8) + var89;
					int var98 = var6[var10];
					var6[var10++] = ((var97 & 0xFF00FF) * var93 + (var98 & 0xFF00FF) * var94 & 0xFF00FF00) + ((var97 & 0xFF00) * var93 + (var98 & 0xFF00) * var94 & 0xFF0000) >> 8;
				}
				var10 += var14;
				var11 += var15;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("apv.v(IILch;II)V")
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
				int var32 = this.field11905[var9++];
				int var33 = var32 >>> 24;
				int var34 = 256 - var33;
				int var35 = var6[var15];
				var6[var15++] = ((var32 & 0xFF00FF) * var33 + (var35 & 0xFF00FF) * var34 & 0xFF00FF00) + ((var32 & 0xFF00) * var33 + (var35 & 0xFF00) * var34 & 0xFF0000) >> 8;
			}
			var9 += var14 + var30;
			var15 += var13 + var30;
		}
	}

	@ObfuscatedName("apv.y(IIIIIIII)V")
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
								var9[var19++] = this.field11905[(var10 >> 16) + var26];
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
								int var35 = this.field11905[(var10 >> 16) + var33];
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
								int var43 = this.field11905[(var10 >> 16) + var41];
								int var44 = arg5 + var43;
								int var45 = (arg5 & 0xFF00FF) + (var43 & 0xFF00FF);
								int var46 = (var44 - var45 & 0x10000) + (var45 & 0x1000100);
								var9[var19++] = var44 - var46 | var46 - (var46 >>> 8);
								var10 += var15;
							}
							var11 += var16;
							var10 = var39;
							var19 += var20;
						}
					} else if (arg4 == 2) {
						int var47 = arg5 >>> 24;
						int var48 = 256 - var47;
						int var49 = (arg5 & 0xFF00FF) * var48 & 0xFF00FF00;
						int var50 = (arg5 & 0xFF00) * var48 & 0xFF0000;
						int var51 = (var49 | var50) >>> 8;
						int var52 = var10;
						for (int var53 = -arg3; var53 < 0; var53++) {
							int var54 = (var11 >> 16) * this.field9356;
							for (int var55 = -arg2; var55 < 0; var55++) {
								int var56 = this.field11905[(var10 >> 16) + var54];
								int var57 = (var56 & 0xFF00FF) * var47 & 0xFF00FF00;
								int var58 = (var56 & 0xFF00) * var47 & 0xFF0000;
								var9[var19++] = ((var57 | var58) >>> 8) + var51;
								var10 += var15;
							}
							var11 += var16;
							var10 = var52;
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
						int var121 = var10;
						for (int var122 = -arg3; var122 < 0; var122++) {
							int var123 = (var11 >> 16) * this.field9356;
							for (int var124 = -arg2; var124 < 0; var124++) {
								int var125 = this.field11905[(var10 >> 16) + var123];
								if (var125 == 0) {
									var19++;
								} else {
									int var126 = var9[var19];
									int var127 = var125 + var126;
									int var128 = (var125 & 0xFF00FF) + (var126 & 0xFF00FF);
									int var129 = (var127 - var128 & 0x10000) + (var128 & 0x1000100);
									var9[var19++] = var127 - var129 | var129 - (var129 >>> 8);
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var121;
							var19 += var20;
						}
					} else if (arg4 == 0) {
						int var130 = var10;
						int var131 = arg5 >> 16 & 0xFF;
						int var132 = arg5 >> 8 & 0xFF;
						int var133 = arg5 & 0xFF;
						for (int var134 = -arg3; var134 < 0; var134++) {
							int var135 = (var11 >> 16) * this.field9356;
							for (int var136 = -arg2; var136 < 0; var136++) {
								int var137 = this.field11905[(var10 >> 16) + var135];
								if (var137 == 0) {
									var19++;
								} else {
									int var138 = (var137 & 0xFF0000) * var131 & 0xFF000000;
									int var139 = (var137 & 0xFF00) * var132 & 0xFF0000;
									int var140 = (var137 & 0xFF) * var133 & 0xFF00;
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
							var10 = var130;
							var19 += var20;
						}
					} else if (arg4 == 3) {
						int var146 = var10;
						for (int var147 = -arg3; var147 < 0; var147++) {
							int var148 = (var11 >> 16) * this.field9356;
							for (int var149 = -arg2; var149 < 0; var149++) {
								int var150 = this.field11905[(var10 >> 16) + var148];
								int var151 = arg5 + var150;
								int var152 = (arg5 & 0xFF00FF) + (var150 & 0xFF00FF);
								int var153 = (var151 - var152 & 0x10000) + (var152 & 0x1000100);
								int var154 = var151 - var153 | var153 - (var153 >>> 8);
								int var155 = var9[var19];
								int var156 = var154 + var155;
								int var157 = (var154 & 0xFF00FF) + (var155 & 0xFF00FF);
								int var158 = (var156 - var157 & 0x10000) + (var157 & 0x1000100);
								var9[var19++] = var156 - var158 | var158 - (var158 >>> 8);
								var10 += var15;
							}
							var11 += var16;
							var10 = var146;
							var19 += var20;
						}
					} else if (arg4 == 2) {
						int var159 = arg5 >>> 24;
						int var160 = 256 - var159;
						int var161 = (arg5 & 0xFF00FF) * var160 & 0xFF00FF00;
						int var162 = (arg5 & 0xFF00) * var160 & 0xFF0000;
						int var163 = (var161 | var162) >>> 8;
						int var164 = var10;
						for (int var165 = -arg3; var165 < 0; var165++) {
							int var166 = (var11 >> 16) * this.field9356;
							for (int var167 = -arg2; var167 < 0; var167++) {
								int var168 = this.field11905[(var10 >> 16) + var166];
								if (var168 == 0) {
									var19++;
								} else {
									int var169 = (var168 & 0xFF00FF) * var159 & 0xFF00FF00;
									int var170 = (var168 & 0xFF00) * var159 & 0xFF0000;
									int var171 = ((var169 | var170) >>> 8) + var163;
									int var172 = var9[var19];
									int var173 = var171 + var172;
									int var174 = (var171 & 0xFF00FF) + (var172 & 0xFF00FF);
									int var175 = (var173 - var174 & 0x10000) + (var174 & 0x1000100);
									var9[var19++] = var173 - var175 | var175 - (var175 >>> 8);
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var164;
							var19 += var20;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (arg4 == 1) {
					int var59 = var10;
					for (int var60 = -arg3; var60 < 0; var60++) {
						int var61 = (var11 >> 16) * this.field9356;
						for (int var62 = -arg2; var62 < 0; var62++) {
							int var63 = this.field11905[(var10 >> 16) + var61];
							int var64 = var63 >>> 24;
							int var65 = 256 - var64;
							int var66 = var9[var19];
							var9[var19++] = ((var63 & 0xFF00FF) * var64 + (var66 & 0xFF00FF) * var65 >> 8 & 0xFFFF00FF) + (((var63 & 0xFF00FF00) >>> 8) * var64 + ((var66 & 0xFF00FF00) >>> 8) * var65 & 0xFF00FF00);
							var10 += var15;
						}
						var11 += var16;
						var10 = var59;
						var19 += var20;
					}
				} else if (arg4 == 0) {
					int var67 = var10;
					if ((arg5 & 0xFFFFFF) == 16777215) {
						for (int var68 = -arg3; var68 < 0; var68++) {
							int var69 = (var11 >> 16) * this.field9356;
							for (int var70 = -arg2; var70 < 0; var70++) {
								int var71 = this.field11905[(var10 >> 16) + var69];
								int var72 = (arg5 >>> 24) * (var71 >>> 24) >> 8;
								int var73 = 256 - var72;
								int var74 = var9[var19];
								var9[var19++] = ((var71 & 0xFF00FF) * var72 + (var74 & 0xFF00FF) * var73 & 0xFF00FF00) + ((var71 & 0xFF00) * var72 + (var74 & 0xFF00) * var73 & 0xFF0000) >> 8;
								var10 += var15;
							}
							var11 += var16;
							var10 = var67;
							var19 += var20;
						}
					} else {
						int var75 = arg5 >> 16 & 0xFF;
						int var76 = arg5 >> 8 & 0xFF;
						int var77 = arg5 & 0xFF;
						for (int var78 = -arg3; var78 < 0; var78++) {
							int var79 = (var11 >> 16) * this.field9356;
							for (int var80 = -arg2; var80 < 0; var80++) {
								int var81 = this.field11905[(var10 >> 16) + var79];
								int var82 = (arg5 >>> 24) * (var81 >>> 24) >> 8;
								int var83 = 256 - var82;
								if (var82 == 255) {
									int var89 = (var81 & 0xFF0000) * var75 & 0xFF000000;
									int var90 = (var81 & 0xFF00) * var76 & 0xFF0000;
									int var91 = (var81 & 0xFF) * var77 & 0xFF00;
									var9[var19++] = (var89 | var90 | var91) >>> 8;
								} else {
									int var84 = (var81 & 0xFF0000) * var75 & 0xFF000000;
									int var85 = (var81 & 0xFF00) * var76 & 0xFF0000;
									int var86 = (var81 & 0xFF) * var77 & 0xFF00;
									int var87 = (var84 | var85 | var86) >>> 8;
									int var88 = var9[var19];
									var9[var19++] = ((var87 & 0xFF00FF) * var82 + (var88 & 0xFF00FF) * var83 & 0xFF00FF00) + ((var87 & 0xFF00) * var82 + (var88 & 0xFF00) * var83 & 0xFF0000) >> 8;
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var67;
							var19 += var20;
						}
					}
				} else if (arg4 == 3) {
					int var92 = var10;
					for (int var93 = -arg3; var93 < 0; var93++) {
						int var94 = (var11 >> 16) * this.field9356;
						for (int var95 = -arg2; var95 < 0; var95++) {
							int var96 = this.field11905[(var10 >> 16) + var94];
							int var97 = arg5 + var96;
							int var98 = (arg5 & 0xFF00FF) + (var96 & 0xFF00FF);
							int var99 = (var97 - var98 & 0x10000) + (var98 & 0x1000100);
							int var100 = var97 - var99 | var99 - (var99 >>> 8);
							int var101 = (arg5 >>> 24) * (var100 >>> 24) >> 8;
							int var102 = 256 - var101;
							if (var101 != 255) {
								int var104 = var9[var19];
								var100 = ((var100 & 0xFF00FF) * var101 + (var104 & 0xFF00FF) * var102 & 0xFF00FF00) + ((var100 & 0xFF00) * var101 + (var104 & 0xFF00) * var102 & 0xFF0000) >> 8;
							}
							var9[var19++] = var100;
							var10 += var15;
						}
						var11 += var16;
						var10 = var92;
						var19 += var20;
					}
				} else if (arg4 == 2) {
					int var105 = arg5 >>> 24;
					int var106 = 256 - var105;
					int var107 = (arg5 & 0xFF00FF) * var106 & 0xFF00FF00;
					int var108 = (arg5 & 0xFF00) * var106 & 0xFF0000;
					int var109 = (var107 | var108) >>> 8;
					int var110 = var10;
					for (int var111 = -arg3; var111 < 0; var111++) {
						int var112 = (var11 >> 16) * this.field9356;
						for (int var113 = -arg2; var113 < 0; var113++) {
							int var114 = this.field11905[(var10 >> 16) + var112];
							int var115 = var114 >>> 24;
							int var116 = 256 - var115;
							int var117 = (var114 & 0xFF00FF) * var105 & 0xFF00FF00;
							int var118 = (var114 & 0xFF00) * var105 & 0xFF0000;
							int var119 = ((var117 | var118) >>> 8) + var109;
							int var120 = var9[var19];
							var9[var19++] = ((var119 & 0xFF00FF) * var115 + (var120 & 0xFF00FF) * var116 & 0xFF00FF00) + ((var119 & 0xFF00) * var115 + (var120 & 0xFF00) * var116 & 0xFF0000) >> 8;
							var10 += var15;
						}
						var11 += var16;
						var10 = var110;
						var19 += var20;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@ObfuscatedName("apv.cl(ZZZIIFIIIIIIZ)V")
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
								var28[var22] = this.field11905[(var14 >> 16) + var31];
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
								int var40 = this.field11905[(var14 >> 16) + var38];
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
								int var48 = this.field11905[(var14 >> 16) + var46];
								int var49 = arg9 + var48;
								int var50 = (arg9 & 0xFF00FF) + (var48 & 0xFF00FF);
								int var51 = (var49 - var50 & 0x10000) + (var50 & 0x1000100);
								var28[var22] = var49 - var51 | var51 - (var51 >>> 8);
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
				int var52 = arg9 >>> 24;
				int var53 = 256 - var52;
				int var54 = (arg9 & 0xFF00FF) * var53 & 0xFF00FF00;
				int var55 = (arg9 & 0xFF00) * var53 & 0xFF0000;
				int var56 = (var54 | var55) >>> 8;
				int var57 = var14;
				for (int var58 = -arg7; var58 < 0; var58++) {
					int var59 = (var15 >> 16) * this.field9356;
					for (int var60 = -arg6; var60 < 0; var60++) {
						if (!arg1 || arg5 < var27[var22]) {
							if (arg0) {
								int var61 = this.field11905[(var14 >> 16) + var59];
								int var62 = (var61 & 0xFF00FF) * var52 & 0xFF00FF00;
								int var63 = (var61 & 0xFF00) * var52 & 0xFF0000;
								var28[var22] = ((var62 | var63) >>> 8) + var56;
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var57;
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
				int var127 = var14;
				for (int var128 = -arg7; var128 < 0; var128++) {
					int var129 = (var15 >> 16) * this.field9356;
					for (int var130 = -arg6; var130 < 0; var130++) {
						if (!arg1 || arg5 < var27[var22]) {
							int var131 = this.field11905[(var14 >> 16) + var129];
							if (var131 != 0) {
								if (arg0) {
									int var132 = var28[var22];
									int var133 = var131 + var132;
									int var134 = (var131 & 0xFF00FF) + (var132 & 0xFF00FF);
									int var135 = (var133 - var134 & 0x10000) + (var134 & 0x1000100);
									var28[var22] = var133 - var135 | var135 - (var135 >>> 8);
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
					var14 = var127;
					var22 += var23;
				}
			} else if (arg8 == 0) {
				int var136 = var14;
				int var137 = arg9 >> 16 & 0xFF;
				int var138 = arg9 >> 8 & 0xFF;
				int var139 = arg9 & 0xFF;
				for (int var140 = -arg7; var140 < 0; var140++) {
					int var141 = (var15 >> 16) * this.field9356;
					for (int var142 = -arg6; var142 < 0; var142++) {
						if (!arg1 || arg5 < var27[var22]) {
							int var143 = this.field11905[(var14 >> 16) + var141];
							if (var143 != 0) {
								if (arg0) {
									int var144 = (var143 & 0xFF0000) * var137 & 0xFF000000;
									int var145 = (var143 & 0xFF00) * var138 & 0xFF0000;
									int var146 = (var143 & 0xFF) * var139 & 0xFF00;
									int var147 = (var144 | var145 | var146) >>> 8;
									int var148 = var28[var22];
									int var149 = var147 + var148;
									int var150 = (var147 & 0xFF00FF) + (var148 & 0xFF00FF);
									int var151 = (var149 - var150 & 0x10000) + (var150 & 0x1000100);
									var28[var22] = var149 - var151 | var151 - (var151 >>> 8);
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
					var14 = var136;
					var22 += var23;
				}
			} else if (arg8 == 3) {
				int var152 = var14;
				for (int var153 = -arg7; var153 < 0; var153++) {
					int var154 = (var15 >> 16) * this.field9356;
					for (int var155 = -arg6; var155 < 0; var155++) {
						if (!arg1 || arg5 < var27[var22]) {
							if (arg0) {
								int var156 = this.field11905[(var14 >> 16) + var154];
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
					var14 = var152;
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
							int var174 = this.field11905[(var14 >> 16) + var172];
							if (var174 != 0) {
								if (arg0) {
									int var175 = (var174 & 0xFF00FF) * var165 & 0xFF00FF00;
									int var176 = (var174 & 0xFF00) * var165 & 0xFF0000;
									int var177 = ((var175 | var176) >>> 8) + var169;
									int var178 = var28[var22];
									int var179 = var177 + var178;
									int var180 = (var177 & 0xFF00FF) + (var178 & 0xFF00FF);
									int var181 = (var179 - var180 & 0x10000) + (var180 & 0x1000100);
									var28[var22] = var179 - var181 | var181 - (var181 >>> 8);
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
			int var64 = var14;
			for (int var65 = -arg7; var65 < 0; var65++) {
				int var66 = (var15 >> 16) * this.field9356;
				for (int var67 = -arg6; var67 < 0; var67++) {
					if (!arg1 || arg5 < var27[var22]) {
						if (arg0) {
							int var68 = this.field11905[(var14 >> 16) + var66];
							int var69 = var68 >>> 24;
							int var70 = 256 - var69;
							int var71 = var28[var22];
							var28[var22] = ((var68 & 0xFF00FF) * var69 + (var71 & 0xFF00FF) * var70 >> 8 & 0xFFFF00FF) + (((var68 & 0xFF00FF00) >>> 8) * var69 + ((var71 & 0xFF00FF00) >>> 8) * var70 & 0xFF00FF00);
						}
						if (arg1 && arg12) {
							var27[var22] = arg5;
						}
					}
					var14 += var18;
					var22++;
				}
				var15 += var19;
				var14 = var64;
				var22 += var23;
			}
		} else if (arg8 == 0) {
			int var72 = var14;
			if ((arg9 & 0xFFFFFF) == 16777215) {
				for (int var73 = -arg7; var73 < 0; var73++) {
					int var74 = (var15 >> 16) * this.field9356;
					for (int var75 = -arg6; var75 < 0; var75++) {
						if (!arg1 || arg5 < var27[var22]) {
							if (arg0) {
								int var76 = this.field11905[(var14 >> 16) + var74];
								int var77 = (arg9 >>> 24) * (var76 >>> 24) >> 8;
								int var78 = 256 - var77;
								int var79 = var28[var22];
								var28[var22] = ((var76 & 0xFF00FF) * var77 + (var79 & 0xFF00FF) * var78 & 0xFF00FF00) + ((var76 & 0xFF00) * var77 + (var79 & 0xFF00) * var78 & 0xFF0000) >> 8;
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var72;
					var22 += var23;
				}
			} else {
				int var80 = arg9 >> 16 & 0xFF;
				int var81 = arg9 >> 8 & 0xFF;
				int var82 = arg9 & 0xFF;
				for (int var83 = -arg7; var83 < 0; var83++) {
					int var84 = (var15 >> 16) * this.field9356;
					for (int var85 = -arg6; var85 < 0; var85++) {
						if (!arg1 || arg5 < var27[var22]) {
							int var86 = this.field11905[(var14 >> 16) + var84];
							int var87 = (arg9 >>> 24) * (var86 >>> 24) >> 8;
							int var88 = 256 - var87;
							if (var87 == 255) {
								if (arg0) {
									int var95 = (var86 & 0xFF0000) * var80 & 0xFF000000;
									int var96 = (var86 & 0xFF00) * var81 & 0xFF0000;
									int var97 = (var86 & 0xFF) * var82 & 0xFF00;
									var28[var22] = (var95 | var96 | var97) >>> 8;
								}
								if (arg1 && arg12) {
									var27[var22] = arg5;
								}
							} else {
								if (arg0) {
									int var89 = (var86 & 0xFF0000) * var80 & 0xFF000000;
									int var90 = (var86 & 0xFF00) * var81 & 0xFF0000;
									int var91 = (var86 & 0xFF) * var82 & 0xFF00;
									int var92 = (var89 | var90 | var91) >>> 8;
									int var93 = var28[var22];
									var28[var22] = ((var92 & 0xFF00FF) * var87 + (var93 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var92 & 0xFF00) * var87 + (var93 & 0xFF00) * var88 & 0xFF0000) >> 8;
									if (arg2) {
										int var94 = (var93 >>> 24) + var87;
										if (var94 > 255) {
											var94 = 255;
										}
										var28[var22] |= var94 << 24;
									}
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
					var14 = var72;
					var22 += var23;
				}
			}
		} else if (arg8 == 3) {
			int var98 = var14;
			for (int var99 = -arg7; var99 < 0; var99++) {
				int var100 = (var15 >> 16) * this.field9356;
				for (int var101 = -arg6; var101 < 0; var101++) {
					if (!arg1 || arg5 < var27[var22]) {
						if (arg0) {
							int var102 = this.field11905[(var14 >> 16) + var100];
							int var103 = arg9 + var102;
							int var104 = (arg9 & 0xFF00FF) + (var102 & 0xFF00FF);
							int var105 = (var103 - var104 & 0x10000) + (var104 & 0x1000100);
							int var106 = var103 - var105 | var105 - (var105 >>> 8);
							int var107 = (arg9 >>> 24) * (var106 >>> 24) >> 8;
							int var108 = 256 - var107;
							if (var107 != 255) {
								int var110 = var28[var22];
								var106 = ((var106 & 0xFF00FF) * var107 + (var110 & 0xFF00FF) * var108 & 0xFF00FF00) + ((var106 & 0xFF00) * var107 + (var110 & 0xFF00) * var108 & 0xFF0000) >> 8;
							}
							var28[var22] = var106;
						}
						if (arg1 && arg12) {
							var27[var22] = arg5;
						}
					}
					var14 += var18;
					var22++;
				}
				var15 += var19;
				var14 = var98;
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
						if (arg0) {
							int var120 = this.field11905[(var14 >> 16) + var118];
							int var121 = var120 >>> 24;
							int var122 = 256 - var121;
							int var123 = (var120 & 0xFF00FF) * var111 & 0xFF00FF00;
							int var124 = (var120 & 0xFF00) * var111 & 0xFF0000;
							int var125 = ((var123 | var124) >>> 8) + var115;
							int var126 = var28[var22];
							var28[var22] = ((var125 & 0xFF00FF) * var121 + (var126 & 0xFF00FF) * var122 & 0xFF00FF00) + ((var125 & 0xFF00) * var121 + (var126 & 0xFF00) * var122 & 0xFF0000) >> 8;
						}
						if (arg1 && arg12) {
							var27[var22] = arg5;
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

	@ObfuscatedName("apv.ce(II)V")
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
							this.method18951((var6 >> 12) + (var7 >> 12) * this.field9356, var5++, var3, arg0, arg1);
							var8++;
						}
					}
					var4++;
					Statics.field9371 += Statics.field9370;
				}
			} else if (Statics.field9375 < 0) {
				int var9 = Statics.field9369;
				while (var9 < 0) {
					int var10 = Statics.field9371;
					int var11 = Statics.field9378;
					int var12 = Statics.field9389 + Statics.field9381;
					int var13 = Statics.field9367;
					if (var11 >= 0 && var11 - (this.field9356 << 12) < 0) {
						int var14;
						if ((var14 = var12 - (this.field9372 << 12)) >= 0) {
							int var15 = (Statics.field9375 - var14) / Statics.field9375;
							var13 += var15;
							var12 += Statics.field9375 * var15;
							var10 += var15;
						}
						int var16;
						if ((var16 = (var12 - Statics.field9375) / Statics.field9375) > var13) {
							var13 = var16;
						}
						while (var13 < 0) {
							this.method18951((var11 >> 12) + (var12 >> 12) * this.field9356, var10++, var3, arg0, arg1);
							var12 += Statics.field9375;
							var13++;
						}
					}
					var9++;
					Statics.field9378 += Statics.field9374;
					Statics.field9371 += Statics.field9370;
				}
			} else {
				int var17 = Statics.field9369;
				while (var17 < 0) {
					int var18 = Statics.field9371;
					int var19 = Statics.field9378;
					int var20 = Statics.field9389 + Statics.field9381;
					int var21 = Statics.field9367;
					if (var19 >= 0 && var19 - (this.field9356 << 12) < 0) {
						if (var20 < 0) {
							int var22 = (Statics.field9375 - 1 - var20) / Statics.field9375;
							var21 += var22;
							var20 += Statics.field9375 * var22;
							var18 += var22;
						}
						int var23;
						if ((var23 = (var20 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var21) {
							var21 = var23;
						}
						while (var21 < 0) {
							this.method18951((var19 >> 12) + (var20 >> 12) * this.field9356, var18++, var3, arg0, arg1);
							var20 += Statics.field9375;
							var21++;
						}
					}
					var17++;
					Statics.field9378 += Statics.field9374;
					Statics.field9371 += Statics.field9370;
				}
			}
		} else if (Statics.field9357 < 0) {
			if (Statics.field9375 == 0) {
				int var24 = Statics.field9369;
				while (var24 < 0) {
					int var25 = Statics.field9371;
					int var26 = Statics.field9380 + Statics.field9378;
					int var27 = Statics.field9389;
					int var28 = Statics.field9367;
					if (var27 >= 0 && var27 - (this.field9372 << 12) < 0) {
						int var29;
						if ((var29 = var26 - (this.field9356 << 12)) >= 0) {
							int var30 = (Statics.field9357 - var29) / Statics.field9357;
							var28 += var30;
							var26 += Statics.field9357 * var30;
							var25 += var30;
						}
						int var31;
						if ((var31 = (var26 - Statics.field9357) / Statics.field9357) > var28) {
							var28 = var31;
						}
						while (var28 < 0) {
							this.method18951((var26 >> 12) + (var27 >> 12) * this.field9356, var25++, var3, arg0, arg1);
							var26 += Statics.field9357;
							var28++;
						}
					}
					var24++;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			} else if (Statics.field9375 < 0) {
				int var32 = Statics.field9369;
				while (var32 < 0) {
					int var33 = Statics.field9371;
					int var34 = Statics.field9380 + Statics.field9378;
					int var35 = Statics.field9389 + Statics.field9381;
					int var36 = Statics.field9367;
					int var37;
					if ((var37 = var34 - (this.field9356 << 12)) >= 0) {
						int var38 = (Statics.field9357 - var37) / Statics.field9357;
						var36 += var38;
						var34 += Statics.field9357 * var38;
						var35 += Statics.field9375 * var38;
						var33 += var38;
					}
					int var39;
					if ((var39 = (var34 - Statics.field9357) / Statics.field9357) > var36) {
						var36 = var39;
					}
					int var40;
					if ((var40 = var35 - (this.field9372 << 12)) >= 0) {
						int var41 = (Statics.field9375 - var40) / Statics.field9375;
						var36 += var41;
						var34 += Statics.field9357 * var41;
						var35 += Statics.field9375 * var41;
						var33 += var41;
					}
					int var42;
					if ((var42 = (var35 - Statics.field9375) / Statics.field9375) > var36) {
						var36 = var42;
					}
					while (var36 < 0) {
						this.method18951((var34 >> 12) + (var35 >> 12) * this.field9356, var33++, var3, arg0, arg1);
						var34 += Statics.field9357;
						var35 += Statics.field9375;
						var36++;
					}
					var32++;
					Statics.field9378 += Statics.field9374;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			} else {
				int var43 = Statics.field9369;
				while (var43 < 0) {
					int var44 = Statics.field9371;
					int var45 = Statics.field9380 + Statics.field9378;
					int var46 = Statics.field9389 + Statics.field9381;
					int var47 = Statics.field9367;
					int var48;
					if ((var48 = var45 - (this.field9356 << 12)) >= 0) {
						int var49 = (Statics.field9357 - var48) / Statics.field9357;
						var47 += var49;
						var45 += Statics.field9357 * var49;
						var46 += Statics.field9375 * var49;
						var44 += var49;
					}
					int var50;
					if ((var50 = (var45 - Statics.field9357) / Statics.field9357) > var47) {
						var47 = var50;
					}
					if (var46 < 0) {
						int var51 = (Statics.field9375 - 1 - var46) / Statics.field9375;
						var47 += var51;
						var45 += Statics.field9357 * var51;
						var46 += Statics.field9375 * var51;
						var44 += var51;
					}
					int var52;
					if ((var52 = (var46 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var47) {
						var47 = var52;
					}
					while (var47 < 0) {
						this.method18951((var45 >> 12) + (var46 >> 12) * this.field9356, var44++, var3, arg0, arg1);
						var45 += Statics.field9357;
						var46 += Statics.field9375;
						var47++;
					}
					var43++;
					Statics.field9378 += Statics.field9374;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			}
		} else if (Statics.field9375 == 0) {
			int var53 = Statics.field9369;
			while (var53 < 0) {
				int var54 = Statics.field9371;
				int var55 = Statics.field9380 + Statics.field9378;
				int var56 = Statics.field9389;
				int var57 = Statics.field9367;
				if (var56 >= 0 && var56 - (this.field9372 << 12) < 0) {
					if (var55 < 0) {
						int var58 = (Statics.field9357 - 1 - var55) / Statics.field9357;
						var57 += var58;
						var55 += Statics.field9357 * var58;
						var54 += var58;
					}
					int var59;
					if ((var59 = (var55 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var57) {
						var57 = var59;
					}
					while (var57 < 0) {
						this.method18951((var55 >> 12) + (var56 >> 12) * this.field9356, var54++, var3, arg0, arg1);
						var55 += Statics.field9357;
						var57++;
					}
				}
				var53++;
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		} else if (Statics.field9375 < 0) {
			for (int var60 = Statics.field9369; var60 < 0; var60++) {
				int var61 = Statics.field9371;
				int var62 = Statics.field9380 + Statics.field9378;
				int var63 = Statics.field9389 + Statics.field9381;
				int var64 = Statics.field9367;
				if (var62 < 0) {
					int var65 = (Statics.field9357 - 1 - var62) / Statics.field9357;
					var64 += var65;
					var62 += Statics.field9357 * var65;
					var63 += Statics.field9375 * var65;
					var61 += var65;
				}
				int var66;
				if ((var66 = (var62 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var64) {
					var64 = var66;
				}
				int var67;
				if ((var67 = var63 - (this.field9372 << 12)) >= 0) {
					int var68 = (Statics.field9375 - var67) / Statics.field9375;
					var64 += var68;
					var62 += Statics.field9357 * var68;
					var63 += Statics.field9375 * var68;
					var61 += var68;
				}
				int var69;
				if ((var69 = (var63 - Statics.field9375) / Statics.field9375) > var64) {
					var64 = var69;
				}
				while (var64 < 0) {
					this.method18951((var62 >> 12) + (var63 >> 12) * this.field9356, var61++, var3, arg0, arg1);
					var62 += Statics.field9357;
					var63 += Statics.field9375;
					var64++;
				}
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		} else {
			for (int var70 = Statics.field9369; var70 < 0; var70++) {
				int var71 = Statics.field9371;
				int var72 = Statics.field9380 + Statics.field9378;
				int var73 = Statics.field9389 + Statics.field9381;
				int var74 = Statics.field9367;
				if (var72 < 0) {
					int var75 = (Statics.field9357 - 1 - var72) / Statics.field9357;
					var74 += var75;
					var72 += Statics.field9357 * var75;
					var73 += Statics.field9375 * var75;
					var71 += var75;
				}
				int var76;
				if ((var76 = (var72 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var74) {
					var74 = var76;
				}
				if (var73 < 0) {
					int var77 = (Statics.field9375 - 1 - var73) / Statics.field9375;
					var74 += var77;
					var72 += Statics.field9357 * var77;
					var73 += Statics.field9375 * var77;
					var71 += var77;
				}
				int var78;
				if ((var78 = (var73 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var74) {
					var74 = var78;
				}
				while (var74 < 0) {
					this.method18951((var72 >> 12) + (var73 >> 12) * this.field9356, var71++, var3, arg0, arg1);
					var72 += Statics.field9357;
					var73 += Statics.field9375;
					var74++;
				}
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		}
	}

	@ObfuscatedName("apv.cu([I[III)V")
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
								int var15 = this.field11905[(var9 >> 12) + (var10 >> 12) * this.field9356];
								int var16 = var15 >>> 24;
								int var17 = 256 - var16;
								int var18 = var5[var8];
								var5[var8++] = ((var15 & 0xFF00FF) * var16 + (var18 & 0xFF00FF) * var17 & 0xFF00FF00) + ((var15 & 0xFF00) * var16 + (var18 & 0xFF00) * var17 & 0xFF0000) >> 8;
								var11++;
							}
						}
					}
					var6++;
					Statics.field9371 += Statics.field9370;
				}
			} else if (Statics.field9375 < 0) {
				int var19 = Statics.field9369;
				while (var19 < 0) {
					int var20 = arg3 + var19;
					if (var20 >= 0) {
						if (var20 >= arg0.length) {
							return;
						}
						int var21 = Statics.field9371;
						int var22 = Statics.field9378;
						int var23 = Statics.field9389 + Statics.field9381;
						int var24 = Statics.field9367;
						if (var22 >= 0 && var22 - (this.field9356 << 12) < 0) {
							int var25;
							if ((var25 = var23 - (this.field9372 << 12)) >= 0) {
								int var26 = (Statics.field9375 - var25) / Statics.field9375;
								var24 += var26;
								var23 += Statics.field9375 * var26;
								var21 += var26;
							}
							int var27;
							if ((var27 = (var23 - Statics.field9375) / Statics.field9375) > var24) {
								var24 = var27;
							}
							int var28 = arg0[var20] - arg2;
							int var29 = -arg1[var20];
							int var30 = var28 - (var21 - Statics.field9371);
							if (var30 > 0) {
								var21 += var30;
								var24 += var30;
								var22 += Statics.field9357 * var30;
								var23 += Statics.field9375 * var30;
							} else {
								var29 -= var30;
							}
							if (var24 < var29) {
								var24 = var29;
							}
							while (var24 < 0) {
								int var31 = this.field11905[(var22 >> 12) + (var23 >> 12) * this.field9356];
								int var32 = var31 >>> 24;
								int var33 = 256 - var32;
								int var34 = var5[var21];
								var5[var21++] = ((var31 & 0xFF00FF) * var32 + (var34 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var31 & 0xFF00) * var32 + (var34 & 0xFF00) * var33 & 0xFF0000) >> 8;
								var23 += Statics.field9375;
								var24++;
							}
						}
					}
					var19++;
					Statics.field9378 += Statics.field9374;
					Statics.field9371 += Statics.field9370;
				}
			} else {
				int var35 = Statics.field9369;
				while (var35 < 0) {
					int var36 = arg3 + var35;
					if (var36 >= 0) {
						if (var36 >= arg0.length) {
							return;
						}
						int var37 = Statics.field9371;
						int var38 = Statics.field9378;
						int var39 = Statics.field9389 + Statics.field9381;
						int var40 = Statics.field9367;
						if (var38 >= 0 && var38 - (this.field9356 << 12) < 0) {
							if (var39 < 0) {
								int var41 = (Statics.field9375 - 1 - var39) / Statics.field9375;
								var40 += var41;
								var39 += Statics.field9375 * var41;
								var37 += var41;
							}
							int var42;
							if ((var42 = (var39 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var40) {
								var40 = var42;
							}
							int var43 = arg0[var36] - arg2;
							int var44 = -arg1[var36];
							int var45 = var43 - (var37 - Statics.field9371);
							if (var45 > 0) {
								var37 += var45;
								var40 += var45;
								var38 += Statics.field9357 * var45;
								var39 += Statics.field9375 * var45;
							} else {
								var44 -= var45;
							}
							if (var40 < var44) {
								var40 = var44;
							}
							while (var40 < 0) {
								int var46 = this.field11905[(var38 >> 12) + (var39 >> 12) * this.field9356];
								int var47 = var46 >>> 24;
								int var48 = 256 - var47;
								int var49 = var5[var37];
								var5[var37++] = ((var46 & 0xFF00FF) * var47 + (var49 & 0xFF00FF) * var48 & 0xFF00FF00) + ((var46 & 0xFF00) * var47 + (var49 & 0xFF00) * var48 & 0xFF0000) >> 8;
								var39 += Statics.field9375;
								var40++;
							}
						}
					}
					var35++;
					Statics.field9378 += Statics.field9374;
					Statics.field9371 += Statics.field9370;
				}
			}
		} else if (Statics.field9357 < 0) {
			if (Statics.field9375 == 0) {
				int var50 = Statics.field9369;
				while (var50 < 0) {
					int var51 = arg3 + var50;
					if (var51 >= 0) {
						if (var51 >= arg0.length) {
							return;
						}
						int var52 = Statics.field9371;
						int var53 = Statics.field9380 + Statics.field9378;
						int var54 = Statics.field9389;
						int var55 = Statics.field9367;
						if (var54 >= 0 && var54 - (this.field9372 << 12) < 0) {
							int var56;
							if ((var56 = var53 - (this.field9356 << 12)) >= 0) {
								int var57 = (Statics.field9357 - var56) / Statics.field9357;
								var55 += var57;
								var53 += Statics.field9357 * var57;
								var52 += var57;
							}
							int var58;
							if ((var58 = (var53 - Statics.field9357) / Statics.field9357) > var55) {
								var55 = var58;
							}
							int var59 = arg0[var51] - arg2;
							int var60 = -arg1[var51];
							int var61 = var59 - (var52 - Statics.field9371);
							if (var61 > 0) {
								var52 += var61;
								var55 += var61;
								var53 += Statics.field9357 * var61;
								var54 += Statics.field9375 * var61;
							} else {
								var60 -= var61;
							}
							if (var55 < var60) {
								var55 = var60;
							}
							while (var55 < 0) {
								int var62 = this.field11905[(var53 >> 12) + (var54 >> 12) * this.field9356];
								int var63 = var62 >>> 24;
								int var64 = 256 - var63;
								int var65 = var5[var52];
								var5[var52++] = ((var62 & 0xFF00FF) * var63 + (var65 & 0xFF00FF) * var64 & 0xFF00FF00) + ((var62 & 0xFF00) * var63 + (var65 & 0xFF00) * var64 & 0xFF0000) >> 8;
								var53 += Statics.field9357;
								var55++;
							}
						}
					}
					var50++;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			} else if (Statics.field9375 < 0) {
				int var66 = Statics.field9369;
				while (var66 < 0) {
					int var67 = arg3 + var66;
					if (var67 >= 0) {
						if (var67 >= arg0.length) {
							return;
						}
						int var68 = Statics.field9371;
						int var69 = Statics.field9380 + Statics.field9378;
						int var70 = Statics.field9389 + Statics.field9381;
						int var71 = Statics.field9367;
						int var72;
						if ((var72 = var69 - (this.field9356 << 12)) >= 0) {
							int var73 = (Statics.field9357 - var72) / Statics.field9357;
							var71 += var73;
							var69 += Statics.field9357 * var73;
							var70 += Statics.field9375 * var73;
							var68 += var73;
						}
						int var74;
						if ((var74 = (var69 - Statics.field9357) / Statics.field9357) > var71) {
							var71 = var74;
						}
						int var75;
						if ((var75 = var70 - (this.field9372 << 12)) >= 0) {
							int var76 = (Statics.field9375 - var75) / Statics.field9375;
							var71 += var76;
							var69 += Statics.field9357 * var76;
							var70 += Statics.field9375 * var76;
							var68 += var76;
						}
						int var77;
						if ((var77 = (var70 - Statics.field9375) / Statics.field9375) > var71) {
							var71 = var77;
						}
						int var78 = arg0[var67] - arg2;
						int var79 = -arg1[var67];
						int var80 = var78 - (var68 - Statics.field9371);
						if (var80 > 0) {
							var68 += var80;
							var71 += var80;
							var69 += Statics.field9357 * var80;
							var70 += Statics.field9375 * var80;
						} else {
							var79 -= var80;
						}
						if (var71 < var79) {
							var71 = var79;
						}
						while (var71 < 0) {
							int var81 = this.field11905[(var69 >> 12) + (var70 >> 12) * this.field9356];
							int var82 = var81 >>> 24;
							int var83 = 256 - var82;
							int var84 = var5[var68];
							var5[var68++] = ((var81 & 0xFF00FF) * var82 + (var84 & 0xFF00FF) * var83 & 0xFF00FF00) + ((var81 & 0xFF00) * var82 + (var84 & 0xFF00) * var83 & 0xFF0000) >> 8;
							var69 += Statics.field9357;
							var70 += Statics.field9375;
							var71++;
						}
					}
					var66++;
					Statics.field9378 += Statics.field9374;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			} else {
				int var85 = Statics.field9369;
				while (var85 < 0) {
					int var86 = arg3 + var85;
					if (var86 >= 0) {
						if (var86 >= arg0.length) {
							return;
						}
						int var87 = Statics.field9371;
						int var88 = Statics.field9380 + Statics.field9378;
						int var89 = Statics.field9389 + Statics.field9381;
						int var90 = Statics.field9367;
						int var91;
						if ((var91 = var88 - (this.field9356 << 12)) >= 0) {
							int var92 = (Statics.field9357 - var91) / Statics.field9357;
							var90 += var92;
							var88 += Statics.field9357 * var92;
							var89 += Statics.field9375 * var92;
							var87 += var92;
						}
						int var93;
						if ((var93 = (var88 - Statics.field9357) / Statics.field9357) > var90) {
							var90 = var93;
						}
						if (var89 < 0) {
							int var94 = (Statics.field9375 - 1 - var89) / Statics.field9375;
							var90 += var94;
							var88 += Statics.field9357 * var94;
							var89 += Statics.field9375 * var94;
							var87 += var94;
						}
						int var95;
						if ((var95 = (var89 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var90) {
							var90 = var95;
						}
						int var96 = arg0[var86] - arg2;
						int var97 = -arg1[var86];
						int var98 = var96 - (var87 - Statics.field9371);
						if (var98 > 0) {
							var87 += var98;
							var90 += var98;
							var88 += Statics.field9357 * var98;
							var89 += Statics.field9375 * var98;
						} else {
							var97 -= var98;
						}
						if (var90 < var97) {
							var90 = var97;
						}
						while (var90 < 0) {
							int var99 = this.field11905[(var88 >> 12) + (var89 >> 12) * this.field9356];
							int var100 = var99 >>> 24;
							int var101 = 256 - var100;
							int var102 = var5[var87];
							var5[var87++] = ((var99 & 0xFF00FF) * var100 + (var102 & 0xFF00FF) * var101 & 0xFF00FF00) + ((var99 & 0xFF00) * var100 + (var102 & 0xFF00) * var101 & 0xFF0000) >> 8;
							var88 += Statics.field9357;
							var89 += Statics.field9375;
							var90++;
						}
					}
					var85++;
					Statics.field9378 += Statics.field9374;
					Statics.field9389 += Statics.field9384;
					Statics.field9371 += Statics.field9370;
				}
			}
		} else if (Statics.field9375 == 0) {
			int var103 = Statics.field9369;
			while (var103 < 0) {
				int var104 = arg3 + var103;
				if (var104 >= 0) {
					if (var104 >= arg0.length) {
						return;
					}
					int var105 = Statics.field9371;
					int var106 = Statics.field9380 + Statics.field9378;
					int var107 = Statics.field9389;
					int var108 = Statics.field9367;
					if (var107 >= 0 && var107 - (this.field9372 << 12) < 0) {
						if (var106 < 0) {
							int var109 = (Statics.field9357 - 1 - var106) / Statics.field9357;
							var108 += var109;
							var106 += Statics.field9357 * var109;
							var105 += var109;
						}
						int var110;
						if ((var110 = (var106 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var108) {
							var108 = var110;
						}
						int var111 = arg0[var104] - arg2;
						int var112 = -arg1[var104];
						int var113 = var111 - (var105 - Statics.field9371);
						if (var113 > 0) {
							var105 += var113;
							var108 += var113;
							var106 += Statics.field9357 * var113;
							var107 += Statics.field9375 * var113;
						} else {
							var112 -= var113;
						}
						if (var108 < var112) {
							var108 = var112;
						}
						while (var108 < 0) {
							int var114 = this.field11905[(var106 >> 12) + (var107 >> 12) * this.field9356];
							int var115 = var114 >>> 24;
							int var116 = 256 - var115;
							int var117 = var5[var105];
							var5[var105++] = ((var114 & 0xFF00FF) * var115 + (var117 & 0xFF00FF) * var116 & 0xFF00FF00) + ((var114 & 0xFF00) * var115 + (var117 & 0xFF00) * var116 & 0xFF0000) >> 8;
							var106 += Statics.field9357;
							var108++;
						}
					}
				}
				var103++;
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		} else if (Statics.field9375 < 0) {
			int var118 = Statics.field9369;
			while (var118 < 0) {
				int var119 = arg3 + var118;
				if (var119 >= 0) {
					if (var119 >= arg0.length) {
						return;
					}
					int var120 = Statics.field9371;
					int var121 = Statics.field9380 + Statics.field9378;
					int var122 = Statics.field9389 + Statics.field9381;
					int var123 = Statics.field9367;
					if (var121 < 0) {
						int var124 = (Statics.field9357 - 1 - var121) / Statics.field9357;
						var123 += var124;
						var121 += Statics.field9357 * var124;
						var122 += Statics.field9375 * var124;
						var120 += var124;
					}
					int var125;
					if ((var125 = (var121 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var123) {
						var123 = var125;
					}
					int var126;
					if ((var126 = var122 - (this.field9372 << 12)) >= 0) {
						int var127 = (Statics.field9375 - var126) / Statics.field9375;
						var123 += var127;
						var121 += Statics.field9357 * var127;
						var122 += Statics.field9375 * var127;
						var120 += var127;
					}
					int var128;
					if ((var128 = (var122 - Statics.field9375) / Statics.field9375) > var123) {
						var123 = var128;
					}
					int var129 = arg0[var119] - arg2;
					int var130 = -arg1[var119];
					int var131 = var129 - (var120 - Statics.field9371);
					if (var131 > 0) {
						var120 += var131;
						var123 += var131;
						var121 += Statics.field9357 * var131;
						var122 += Statics.field9375 * var131;
					} else {
						var130 -= var131;
					}
					if (var123 < var130) {
						var123 = var130;
					}
					while (var123 < 0) {
						int var132 = this.field11905[(var121 >> 12) + (var122 >> 12) * this.field9356];
						int var133 = var132 >>> 24;
						int var134 = 256 - var133;
						int var135 = var5[var120];
						var5[var120++] = ((var132 & 0xFF00FF) * var133 + (var135 & 0xFF00FF) * var134 & 0xFF00FF00) + ((var132 & 0xFF00) * var133 + (var135 & 0xFF00) * var134 & 0xFF0000) >> 8;
						var121 += Statics.field9357;
						var122 += Statics.field9375;
						var123++;
					}
				}
				var118++;
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		} else {
			int var136 = Statics.field9369;
			while (var136 < 0) {
				int var137 = arg3 + var136;
				if (var137 >= 0) {
					if (var137 >= arg0.length) {
						return;
					}
					int var138 = Statics.field9371;
					int var139 = Statics.field9380 + Statics.field9378;
					int var140 = Statics.field9389 + Statics.field9381;
					int var141 = Statics.field9367;
					if (var139 < 0) {
						int var142 = (Statics.field9357 - 1 - var139) / Statics.field9357;
						var141 += var142;
						var139 += Statics.field9357 * var142;
						var140 += Statics.field9375 * var142;
						var138 += var142;
					}
					int var143;
					if ((var143 = (var139 + 1 - (this.field9356 << 12) - Statics.field9357) / Statics.field9357) > var141) {
						var141 = var143;
					}
					if (var140 < 0) {
						int var144 = (Statics.field9375 - 1 - var140) / Statics.field9375;
						var141 += var144;
						var139 += Statics.field9357 * var144;
						var140 += Statics.field9375 * var144;
						var138 += var144;
					}
					int var145;
					if ((var145 = (var140 + 1 - (this.field9372 << 12) - Statics.field9375) / Statics.field9375) > var141) {
						var141 = var145;
					}
					int var146 = arg0[var137] - arg2;
					int var147 = -arg1[var137];
					int var148 = var146 - (var138 - Statics.field9371);
					if (var148 > 0) {
						var138 += var148;
						var141 += var148;
						var139 += Statics.field9357 * var148;
						var140 += Statics.field9375 * var148;
					} else {
						var147 -= var148;
					}
					if (var141 < var147) {
						var141 = var147;
					}
					while (var141 < 0) {
						int var149 = this.field11905[(var139 >> 12) + (var140 >> 12) * this.field9356];
						int var150 = var149 >>> 24;
						int var151 = 256 - var150;
						int var152 = var5[var138];
						var5[var138++] = ((var149 & 0xFF00FF) * var150 + (var152 & 0xFF00FF) * var151 & 0xFF00FF00) + ((var149 & 0xFF00) * var150 + (var152 & 0xFF00) * var151 & 0xFF0000) >> 8;
						var139 += Statics.field9357;
						var140 += Statics.field9375;
						var141++;
					}
				}
				var136++;
				Statics.field9378 += Statics.field9374;
				Statics.field9389 += Statics.field9384;
				Statics.field9371 += Statics.field9370;
			}
		}
	}

	@ObfuscatedName("apv.ch(II[III)V")
	public void method18951(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
		if (arg4 == 0) {
			if (arg3 == 1) {
				arg2[arg1] = this.field11905[arg0];
			} else {
				int var10001;
				int var83;
				if (arg3 == 0) {
					var10001 = arg0;
					var83 = arg0 + 1;
					int var6 = this.field11905[var10001];
					int var7 = (var6 & 0xFF0000) * field9382 & 0xFF000000;
					int var8 = (var6 & 0xFF00) * field9386 & 0xFF0000;
					int var9 = (var6 & 0xFF) * field9387 & 0xFF00;
					arg2[arg1] = (var7 | var8 | var9) >>> 8;
				} else if (arg3 == 3) {
					var10001 = arg0;
					var83 = arg0 + 1;
					int var10 = this.field11905[var10001];
					int var11 = Statics.field9361;
					int var12 = var10 + var11;
					int var13 = (var10 & 0xFF00FF) + (var11 & 0xFF00FF);
					int var14 = (var12 - var13 & 0x10000) + (var13 & 0x1000100);
					arg2[arg1] = var12 - var14 | var14 - (var14 >>> 8);
				} else if (arg3 == 2) {
					int var15 = this.field11905[arg0];
					int var16 = (var15 & 0xFF00FF) * field9383 & 0xFF00FF00;
					int var17 = (var15 & 0xFF00) * field9383 & 0xFF0000;
					arg2[arg1] = ((var16 | var17) >>> 8) + field9379;
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg4 != 1) {
			if (arg4 != 2) {
				throw new IllegalArgumentException();
			}
			if (arg3 == 1) {
				int var51 = this.field11905[arg0];
				int var52 = arg2[arg1];
				int var53 = var51 + var52;
				int var54 = (var51 & 0xFF00FF) + (var52 & 0xFF00FF);
				int var55 = (var53 - var54 & 0x10000) + (var54 & 0x1000100);
				arg2[arg1] = var53 - var55 | var55 - (var55 >>> 8);
			} else if (arg3 == 0) {
				int var56 = this.field11905[arg0];
				int var57 = (var56 & 0xFF0000) * field9382 & 0xFF000000;
				int var58 = (var56 & 0xFF00) * field9386 & 0xFF0000;
				int var59 = (var56 & 0xFF) * field9387 & 0xFF00;
				int var60 = (var57 | var58 | var59) >>> 8;
				int var61 = arg2[arg1];
				int var62 = var60 + var61;
				int var63 = (var60 & 0xFF00FF) + (var61 & 0xFF00FF);
				int var64 = (var62 - var63 & 0x10000) + (var63 & 0x1000100);
				arg2[arg1] = var62 - var64 | var64 - (var64 >>> 8);
			} else if (arg3 == 3) {
				int var65 = this.field11905[arg0];
				int var66 = Statics.field9361;
				int var67 = var65 + var66;
				int var68 = (var65 & 0xFF00FF) + (var66 & 0xFF00FF);
				int var69 = (var67 - var68 & 0x10000) + (var68 & 0x1000100);
				int var70 = var67 - var69 | var69 - (var69 >>> 8);
				int var71 = arg2[arg1];
				int var72 = var70 + var71;
				int var73 = (var70 & 0xFF00FF) + (var71 & 0xFF00FF);
				int var74 = (var72 - var73 & 0x10000) + (var73 & 0x1000100);
				arg2[arg1] = var72 - var74 | var74 - (var74 >>> 8);
			} else if (arg3 == 2) {
				int var75 = this.field11905[arg0];
				int var76 = (var75 & 0xFF00FF) * field9383 & 0xFF00FF00;
				int var77 = (var75 & 0xFF00) * field9383 & 0xFF0000;
				int var78 = ((var76 | var77) >>> 8) + field9379;
				int var79 = arg2[arg1];
				int var80 = var78 + var79;
				int var81 = (var78 & 0xFF00FF) + (var79 & 0xFF00FF);
				int var82 = (var80 - var81 & 0x10000) + (var81 & 0x1000100);
				arg2[arg1] = var80 - var82 | var82 - (var82 >>> 8);
			}
		} else if (arg3 == 1) {
			int var18 = this.field11905[arg0];
			int var19 = var18 >>> 24;
			int var20 = 256 - var19;
			int var21 = arg2[arg1];
			arg2[arg1] = ((var18 & 0xFF00FF) * var19 + (var21 & 0xFF00FF) * var20 & 0xFF00FF00) + ((var18 & 0xFF00) * var19 + (var21 & 0xFF00) * var20 & 0xFF0000) >> 8;
		} else if (arg3 == 0) {
			int var22 = this.field11905[arg0];
			int var23 = (var22 >>> 24) * field9383 >> 8;
			int var24 = 256 - var23;
			if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
				int var25 = arg2[arg1];
				arg2[arg1] = ((var22 & 0xFF00FF) * var23 + (var25 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var22 & 0xFF00) * var23 + (var25 & 0xFF00) * var24 & 0xFF0000) >> 8;
			} else if (var23 == 255) {
				int var31 = (var22 & 0xFF0000) * field9382 & 0xFF000000;
				int var32 = (var22 & 0xFF00) * field9386 & 0xFF0000;
				int var33 = (var22 & 0xFF) * field9387 & 0xFF00;
				arg2[arg1] = (var31 | var32 | var33) >>> 8;
			} else {
				int var26 = (var22 & 0xFF0000) * field9382 & 0xFF000000;
				int var27 = (var22 & 0xFF00) * field9386 & 0xFF0000;
				int var28 = (var22 & 0xFF) * field9387 & 0xFF00;
				int var29 = (var26 | var27 | var28) >>> 8;
				int var30 = arg2[arg1];
				arg2[arg1] = ((var29 & 0xFF00FF) * var23 + (var30 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var29 & 0xFF00) * var23 + (var30 & 0xFF00) * var24 & 0xFF0000) >> 8;
			}
		} else if (arg3 == 3) {
			int var34 = this.field11905[arg0];
			int var35 = Statics.field9361;
			int var36 = var34 + var35;
			int var37 = (var34 & 0xFF00FF) + (var35 & 0xFF00FF);
			int var38 = (var36 - var37 & 0x10000) + (var37 & 0x1000100);
			int var39 = var36 - var38 | var38 - (var38 >>> 8);
			int var40 = (var34 >>> 24) * field9383 >> 8;
			int var41 = 256 - var40;
			if (var40 != 255) {
				int var43 = arg2[arg1];
				var39 = ((var39 & 0xFF00FF) * var40 + (var43 & 0xFF00FF) * var41 & 0xFF00FF00) + ((var39 & 0xFF00) * var40 + (var43 & 0xFF00) * var41 & 0xFF0000) >> 8;
			}
			arg2[arg1] = var39;
		} else if (arg3 == 2) {
			int var44 = this.field11905[arg0];
			int var45 = var44 >>> 24;
			int var46 = 256 - var45;
			int var47 = (var44 & 0xFF00FF) * field9383 & 0xFF00FF00;
			int var48 = (var44 & 0xFF00) * field9383 & 0xFF0000;
			int var49 = ((var47 | var48) >>> 8) + field9379;
			int var50 = arg2[arg1];
			arg2[arg1] = ((var49 & 0xFF00FF) * var45 + (var50 & 0xFF00FF) * var46 & 0xFF00FF00) + ((var49 & 0xFF00) * var45 + (var50 & 0xFF00) * var46 & 0xFF0000) >> 8;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
