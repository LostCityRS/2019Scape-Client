package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("apo")
public class class1114 extends class829 {

	@ObfuscatedName("apo.am")
	public int[] field11904;

	public class1114(class848 arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		this.field11904 = new int[arg1 * arg2];
	}

	public class1114(class848 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		super(arg0, arg4, arg5);
		if (arg6) {
			this.field11904 = new int[arg4 * arg5];
		} else {
			this.field11904 = arg1;
		}
		int var8 = arg3 - this.field9356;
		int var9 = 0;
		for (int var10 = 0; var10 < arg5; var10++) {
			for (int var11 = 0; var11 < arg4; var11++) {
				int var12 = arg1[arg2++];
				if (var12 >>> 24 == 255) {
					this.field11904[var9++] = (var12 & 0xFFFFFF) == 0 ? -16777215 : var12;
				} else {
					this.field11904[var9++] = 0;
				}
			}
			arg2 += var8;
		}
	}

	public class1114(class848 arg0, int[] arg1, int arg2, int arg3) {
		super(arg0, arg2, arg3);
		this.field11904 = arg1;
	}

	@ObfuscatedName("apo.u(IIII[III)V")
	public void method1469(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		int var8 = arg6 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = (arg1 + var9) * arg2 + arg0;
			for (int var11 = 0; var11 < arg2; var11++) {
				this.field11904[var10 + var11] = arg4[arg5++];
			}
			arg5 += var8;
		}
	}

	@ObfuscatedName("apo.cq(IIII[III)V")
	public void method18946(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		int var8 = arg6 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = (arg1 + var9) * arg2 + arg0;
			for (int var11 = 0; var11 < arg2; var11++) {
				arg4[arg5++] = this.field11904[var10 + var11];
			}
			arg5 += var8;
		}
	}

	@ObfuscatedName("apo.z(IIII[I[III)V")
	public void method1476(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7) {
		this.method18946(arg0, arg1, arg2, arg3, arg4, arg6, arg7);
	}

	@ObfuscatedName("apo.p(IIIIII)V")
	public void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int[] var7 = this.field9373.field9778;
		if (var7 == null) {
			throw new IllegalStateException("");
		}
		for (int var8 = 0; var8 < arg3; var8++) {
			int var9 = (arg1 + var8) * this.field9356 + arg0;
			int var10 = this.field9373.field9779 * (arg5 + var8) + arg4;
			for (int var11 = 0; var11 < arg2; var11++) {
				this.field11904[var9 + var11] = var7[var10 + var11];
			}
		}
	}

	@ObfuscatedName("apo.d(III)V")
	public void method1441(int arg0, int arg1, int arg2) {
		throw new IllegalStateException("");
	}

	@ObfuscatedName("apo.l()Ldp;")
	public class130 method1437() {
		return new class60(this.field9356, this.field9372, this.field11904);
	}

	@ObfuscatedName("apo.r(IIIII)V")
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
						var6[var10++] = this.field11904[var11++];
						var6[var10++] = this.field11904[var11++];
						var6[var10++] = this.field11904[var11++];
						var6[var10++] = this.field11904[var11++];
					}
					var20 += 3;
					while (var10 < var20) {
						var6[var10++] = this.field11904[var11++];
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
						int var26 = this.field11904[var11++];
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
						int var32 = this.field11904[var11++];
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
						int var43 = this.field11904[var11++];
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
				for (int var96 = -var12; var96 < 0; var96++) {
					for (int var97 = -var13; var97 < 0; var97++) {
						int var98 = this.field11904[var11++];
						if (var98 == 0) {
							var10++;
						} else {
							int var99 = var6[var10];
							int var100 = var98 + var99;
							int var101 = (var98 & 0xFF00FF) + (var99 & 0xFF00FF);
							int var102 = (var100 - var101 & 0x10000) + (var101 & 0x1000100);
							var6[var10++] = var100 - var102 | var102 - (var102 >>> 8);
						}
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 0) {
				int var103 = arg3 >> 16 & 0xFF;
				int var104 = arg3 >> 8 & 0xFF;
				int var105 = arg3 & 0xFF;
				for (int var106 = -var12; var106 < 0; var106++) {
					for (int var107 = -var13; var107 < 0; var107++) {
						int var108 = this.field11904[var11++];
						if (var108 == 0) {
							var10++;
						} else {
							int var109 = (var108 & 0xFF0000) * var103 & 0xFF000000;
							int var110 = (var108 & 0xFF00) * var104 & 0xFF0000;
							int var111 = (var108 & 0xFF) * var105 & 0xFF00;
							int var112 = (var109 | var110 | var111) >>> 8;
							int var113 = var6[var10];
							int var114 = var112 + var113;
							int var115 = (var112 & 0xFF00FF) + (var113 & 0xFF00FF);
							int var116 = (var114 - var115 & 0x10000) + (var115 & 0x1000100);
							var6[var10++] = var114 - var116 | var116 - (var116 >>> 8);
						}
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 3) {
				for (int var117 = -var12; var117 < 0; var117++) {
					for (int var118 = -var13; var118 < 0; var118++) {
						int var119 = this.field11904[var11++];
						int var120 = arg3 + var119;
						int var121 = (arg3 & 0xFF00FF) + (var119 & 0xFF00FF);
						int var122 = (var120 - var121 & 0x10000) + (var121 & 0x1000100);
						int var123 = var120 - var122 | var122 - (var122 >>> 8);
						int var124 = var6[var10];
						int var125 = var123 + var124;
						int var126 = (var123 & 0xFF00FF) + (var124 & 0xFF00FF);
						int var127 = (var125 - var126 & 0x10000) + (var126 & 0x1000100);
						var6[var10++] = var125 - var127 | var127 - (var127 >>> 8);
					}
					var10 += var14;
					var11 += var15;
				}
			} else if (arg2 == 2) {
				int var128 = arg3 >>> 24;
				int var129 = 256 - var128;
				int var130 = (arg3 & 0xFF00FF) * var129 & 0xFF00FF00;
				int var131 = (arg3 & 0xFF00) * var129 & 0xFF0000;
				int var132 = (var130 | var131) >>> 8;
				for (int var133 = -var12; var133 < 0; var133++) {
					for (int var134 = -var13; var134 < 0; var134++) {
						int var135 = this.field11904[var11++];
						if (var135 == 0) {
							var10++;
						} else {
							int var136 = (var135 & 0xFF00FF) * var128 & 0xFF00FF00;
							int var137 = (var135 & 0xFF00) * var128 & 0xFF0000;
							int var138 = ((var136 | var137) >>> 8) + var132;
							int var139 = var6[var10];
							int var140 = var138 + var139;
							int var141 = (var138 & 0xFF00FF) + (var139 & 0xFF00FF);
							int var142 = (var140 - var141 & 0x10000) + (var141 & 0x1000100);
							var6[var10++] = var140 - var142 | var142 - (var142 >>> 8);
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
				int var47 = var10 + var13 - 3;
				while (var10 < var47) {
					int var48 = this.field11904[var11++];
					if (var48 == 0) {
						var10++;
					} else {
						var6[var10++] = var48;
					}
					int var49 = this.field11904[var11++];
					if (var49 == 0) {
						var10++;
					} else {
						var6[var10++] = var49;
					}
					int var50 = this.field11904[var11++];
					if (var50 == 0) {
						var10++;
					} else {
						var6[var10++] = var50;
					}
					int var51 = this.field11904[var11++];
					if (var51 == 0) {
						var10++;
					} else {
						var6[var10++] = var51;
					}
				}
				var47 += 3;
				while (var10 < var47) {
					int var52 = this.field11904[var11++];
					if (var52 == 0) {
						var10++;
					} else {
						var6[var10++] = var52;
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
						int var57 = this.field11904[var11++];
						if (var57 == 0) {
							var10++;
						} else {
							int var58 = var6[var10];
							var6[var10++] = ((var57 & 0xFF00FF) * var53 + (var58 & 0xFF00FF) * var54 & 0xFF00FF00) + ((var57 & 0xFF00) * var53 + (var58 & 0xFF00) * var54 & 0xFF0000) >> 8;
						}
					}
					var10 += var14;
					var11 += var15;
				}
			} else {
				int var59 = arg3 >> 16 & 0xFF;
				int var60 = arg3 >> 8 & 0xFF;
				int var61 = arg3 & 0xFF;
				int var62 = arg3 >>> 24;
				int var63 = 256 - var62;
				for (int var64 = -var12; var64 < 0; var64++) {
					for (int var65 = -var13; var65 < 0; var65++) {
						int var66 = this.field11904[var11++];
						if (var66 == 0) {
							var10++;
						} else if (var62 == 255) {
							int var72 = (var66 & 0xFF0000) * var59 & 0xFF000000;
							int var73 = (var66 & 0xFF00) * var60 & 0xFF0000;
							int var74 = (var66 & 0xFF) * var61 & 0xFF00;
							var6[var10++] = (var72 | var73 | var74) >>> 8;
						} else {
							int var67 = (var66 & 0xFF0000) * var59 & 0xFF000000;
							int var68 = (var66 & 0xFF00) * var60 & 0xFF0000;
							int var69 = (var66 & 0xFF) * var61 & 0xFF00;
							int var70 = (var67 | var68 | var69) >>> 8;
							int var71 = var6[var10];
							var6[var10++] = ((var70 & 0xFF00FF) * var62 + (var71 & 0xFF00FF) * var63 & 0xFF00FF00) + ((var70 & 0xFF00) * var62 + (var71 & 0xFF00) * var63 & 0xFF0000) >> 8;
						}
					}
					var10 += var14;
					var11 += var15;
				}
			}
		} else if (arg2 == 3) {
			int var75 = arg3 >>> 24;
			int var76 = 256 - var75;
			for (int var77 = -var12; var77 < 0; var77++) {
				for (int var78 = -var13; var78 < 0; var78++) {
					int var79 = this.field11904[var11++];
					int var80 = arg3 + var79;
					int var81 = (arg3 & 0xFF00FF) + (var79 & 0xFF00FF);
					int var82 = (var80 - var81 & 0x10000) + (var81 & 0x1000100);
					int var83 = var80 - var82 | var82 - (var82 >>> 8);
					if (var79 == 0 && var75 != 255) {
						int var85 = var6[var10];
						var83 = ((var83 & 0xFF00FF) * var75 + (var85 & 0xFF00FF) * var76 & 0xFF00FF00) + ((var83 & 0xFF00) * var75 + (var85 & 0xFF00) * var76 & 0xFF0000) >> 8;
					}
					var6[var10++] = var83;
				}
				var10 += var14;
				var11 += var15;
			}
		} else if (arg2 == 2) {
			int var86 = arg3 >>> 24;
			int var87 = 256 - var86;
			int var88 = (arg3 & 0xFF00FF) * var87 & 0xFF00FF00;
			int var89 = (arg3 & 0xFF00) * var87 & 0xFF0000;
			int var90 = (var88 | var89) >>> 8;
			for (int var91 = -var12; var91 < 0; var91++) {
				for (int var92 = -var13; var92 < 0; var92++) {
					int var93 = this.field11904[var11++];
					if (var93 == 0) {
						var10++;
					} else {
						int var94 = (var93 & 0xFF00FF) * var86 & 0xFF00FF00;
						int var95 = (var93 & 0xFF00) * var86 & 0xFF0000;
						var6[var10++] = ((var94 | var95) >>> 8) + var90;
					}
				}
				var10 += var14;
				var11 += var15;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("apo.v(IILch;II)V")
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
				int var32 = this.field11904[var9++];
				if (var32 == 0) {
					var15++;
				} else {
					var6[var15++] = var32;
				}
			}
			var9 += var14 + var30;
			var15 += var13 + var30;
		}
	}

	@ObfuscatedName("apo.y(IIIIIIII)V")
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
								var9[var19++] = this.field11904[(var10 >> 16) + var26];
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
								int var35 = this.field11904[(var10 >> 16) + var33];
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
								int var43 = this.field11904[(var10 >> 16) + var41];
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
								int var56 = this.field11904[(var10 >> 16) + var54];
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
						int var114 = var10;
						for (int var115 = -arg3; var115 < 0; var115++) {
							int var116 = (var11 >> 16) * this.field9356;
							for (int var117 = -arg2; var117 < 0; var117++) {
								int var118 = this.field11904[(var10 >> 16) + var116];
								if (var118 == 0) {
									var19++;
								} else {
									int var119 = var9[var19];
									int var120 = var118 + var119;
									int var121 = (var118 & 0xFF00FF) + (var119 & 0xFF00FF);
									int var122 = (var120 - var121 & 0x10000) + (var121 & 0x1000100);
									var9[var19++] = var120 - var122 | var122 - (var122 >>> 8);
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var114;
							var19 += var20;
						}
					} else if (arg4 == 0) {
						int var123 = var10;
						int var124 = arg5 >> 16 & 0xFF;
						int var125 = arg5 >> 8 & 0xFF;
						int var126 = arg5 & 0xFF;
						for (int var127 = -arg3; var127 < 0; var127++) {
							int var128 = (var11 >> 16) * this.field9356;
							for (int var129 = -arg2; var129 < 0; var129++) {
								int var130 = this.field11904[(var10 >> 16) + var128];
								if (var130 == 0) {
									var19++;
								} else {
									int var131 = (var130 & 0xFF0000) * var124 & 0xFF000000;
									int var132 = (var130 & 0xFF00) * var125 & 0xFF0000;
									int var133 = (var130 & 0xFF) * var126 & 0xFF00;
									int var134 = (var131 | var132 | var133) >>> 8;
									int var135 = var9[var19];
									int var136 = var134 + var135;
									int var137 = (var134 & 0xFF00FF) + (var135 & 0xFF00FF);
									int var138 = (var136 - var137 & 0x10000) + (var137 & 0x1000100);
									var9[var19++] = var136 - var138 | var138 - (var138 >>> 8);
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var123;
							var19 += var20;
						}
					} else if (arg4 == 3) {
						int var139 = var10;
						for (int var140 = -arg3; var140 < 0; var140++) {
							int var141 = (var11 >> 16) * this.field9356;
							for (int var142 = -arg2; var142 < 0; var142++) {
								int var143 = this.field11904[(var10 >> 16) + var141];
								int var144 = arg5 + var143;
								int var145 = (arg5 & 0xFF00FF) + (var143 & 0xFF00FF);
								int var146 = (var144 - var145 & 0x10000) + (var145 & 0x1000100);
								int var147 = var144 - var146 | var146 - (var146 >>> 8);
								int var148 = var9[var19];
								int var149 = var147 + var148;
								int var150 = (var147 & 0xFF00FF) + (var148 & 0xFF00FF);
								int var151 = (var149 - var150 & 0x10000) + (var150 & 0x1000100);
								var9[var19++] = var149 - var151 | var151 - (var151 >>> 8);
								var10 += var15;
							}
							var11 += var16;
							var10 = var139;
							var19 += var20;
						}
					} else if (arg4 == 2) {
						int var152 = arg5 >>> 24;
						int var153 = 256 - var152;
						int var154 = (arg5 & 0xFF00FF) * var153 & 0xFF00FF00;
						int var155 = (arg5 & 0xFF00) * var153 & 0xFF0000;
						int var156 = (var154 | var155) >>> 8;
						int var157 = var10;
						for (int var158 = -arg3; var158 < 0; var158++) {
							int var159 = (var11 >> 16) * this.field9356;
							for (int var160 = -arg2; var160 < 0; var160++) {
								int var161 = this.field11904[(var10 >> 16) + var159];
								if (var161 == 0) {
									var19++;
								} else {
									int var162 = (var161 & 0xFF00FF) * var152 & 0xFF00FF00;
									int var163 = (var161 & 0xFF00) * var152 & 0xFF0000;
									int var164 = ((var162 | var163) >>> 8) + var156;
									int var165 = var9[var19];
									int var166 = var164 + var165;
									int var167 = (var164 & 0xFF00FF) + (var165 & 0xFF00FF);
									int var168 = (var166 - var167 & 0x10000) + (var167 & 0x1000100);
									var9[var19++] = var166 - var168 | var168 - (var168 >>> 8);
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var157;
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
							int var63 = this.field11904[(var10 >> 16) + var61];
							if (var63 == 0) {
								var19++;
							} else {
								var9[var19++] = var63;
							}
							var10 += var15;
						}
						var11 += var16;
						var10 = var59;
						var19 += var20;
					}
				} else if (arg4 == 0) {
					int var64 = var10;
					if ((arg5 & 0xFFFFFF) == 16777215) {
						int var65 = arg5 >>> 24;
						int var66 = 256 - var65;
						for (int var67 = -arg3; var67 < 0; var67++) {
							int var68 = (var11 >> 16) * this.field9356;
							for (int var69 = -arg2; var69 < 0; var69++) {
								int var70 = this.field11904[(var10 >> 16) + var68];
								if (var70 == 0) {
									var19++;
								} else {
									int var71 = var9[var19];
									var9[var19++] = ((var70 & 0xFF00FF) * var65 + (var71 & 0xFF00FF) * var66 & 0xFF00FF00) + ((var70 & 0xFF00) * var65 + (var71 & 0xFF00) * var66 & 0xFF0000) >> 8;
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var64;
							var19 += var20;
						}
					} else {
						int var72 = arg5 >> 16 & 0xFF;
						int var73 = arg5 >> 8 & 0xFF;
						int var74 = arg5 & 0xFF;
						int var75 = arg5 >>> 24;
						int var76 = 256 - var75;
						for (int var77 = -arg3; var77 < 0; var77++) {
							int var78 = (var11 >> 16) * this.field9356;
							for (int var79 = -arg2; var79 < 0; var79++) {
								int var80 = this.field11904[(var10 >> 16) + var78];
								if (var80 == 0) {
									var19++;
								} else if (var75 == 255) {
									int var86 = (var80 & 0xFF0000) * var72 & 0xFF000000;
									int var87 = (var80 & 0xFF00) * var73 & 0xFF0000;
									int var88 = (var80 & 0xFF) * var74 & 0xFF00;
									var9[var19++] = (var86 | var87 | var88) >>> 8;
								} else {
									int var81 = (var80 & 0xFF0000) * var72 & 0xFF000000;
									int var82 = (var80 & 0xFF00) * var73 & 0xFF0000;
									int var83 = (var80 & 0xFF) * var74 & 0xFF00;
									int var84 = (var81 | var82 | var83) >>> 8;
									int var85 = var9[var19];
									var9[var19++] = ((var84 & 0xFF00FF) * var75 + (var85 & 0xFF00FF) * var76 & 0xFF00FF00) + ((var84 & 0xFF00) * var75 + (var85 & 0xFF00) * var76 & 0xFF0000) >> 8;
								}
								var10 += var15;
							}
							var11 += var16;
							var10 = var64;
							var19 += var20;
						}
					}
				} else if (arg4 == 3) {
					int var89 = var10;
					int var90 = arg5 >>> 24;
					int var91 = 256 - var90;
					for (int var92 = -arg3; var92 < 0; var92++) {
						int var93 = (var11 >> 16) * this.field9356;
						for (int var94 = -arg2; var94 < 0; var94++) {
							int var95 = this.field11904[(var10 >> 16) + var93];
							int var96 = arg5 + var95;
							int var97 = (arg5 & 0xFF00FF) + (var95 & 0xFF00FF);
							int var98 = (var96 - var97 & 0x10000) + (var97 & 0x1000100);
							int var99 = var96 - var98 | var98 - (var98 >>> 8);
							if (var95 == 0 && var90 != 255) {
								int var101 = var9[var19];
								var99 = ((var99 & 0xFF00FF) * var90 + (var101 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var99 & 0xFF00) * var90 + (var101 & 0xFF00) * var91 & 0xFF0000) >> 8;
							}
							var9[var19++] = var99;
							var10 += var15;
						}
						var11 += var16;
						var10 = var89;
						var19 += var20;
					}
				} else if (arg4 == 2) {
					int var102 = arg5 >>> 24;
					int var103 = 256 - var102;
					int var104 = (arg5 & 0xFF00FF) * var103 & 0xFF00FF00;
					int var105 = (arg5 & 0xFF00) * var103 & 0xFF0000;
					int var106 = (var104 | var105) >>> 8;
					int var107 = var10;
					for (int var108 = -arg3; var108 < 0; var108++) {
						int var109 = (var11 >> 16) * this.field9356;
						for (int var110 = -arg2; var110 < 0; var110++) {
							int var111 = this.field11904[(var10 >> 16) + var109];
							if (var111 == 0) {
								var19++;
							} else {
								int var112 = (var111 & 0xFF00FF) * var102 & 0xFF00FF00;
								int var113 = (var111 & 0xFF00) * var102 & 0xFF0000;
								var9[var19++] = ((var112 | var113) >>> 8) + var106;
							}
							var10 += var15;
						}
						var11 += var16;
						var10 = var107;
						var19 += var20;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@ObfuscatedName("apo.cl(ZZZIIFIIIIIIZ)V")
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
								var28[var22] = this.field11904[(var14 >> 16) + var31];
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
								int var40 = this.field11904[(var14 >> 16) + var38];
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
								int var48 = this.field11904[(var14 >> 16) + var46];
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
								int var61 = this.field11904[(var14 >> 16) + var59];
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
				int var119 = var14;
				for (int var120 = -arg7; var120 < 0; var120++) {
					int var121 = (var15 >> 16) * this.field9356;
					for (int var122 = -arg6; var122 < 0; var122++) {
						if (!arg1 || arg5 < var27[var22]) {
							int var123 = this.field11904[(var14 >> 16) + var121];
							if (var123 != 0) {
								if (arg0) {
									int var124 = var28[var22];
									int var125 = var123 + var124;
									int var126 = (var123 & 0xFF00FF) + (var124 & 0xFF00FF);
									int var127 = (var125 - var126 & 0x10000) + (var126 & 0x1000100);
									var28[var22] = var125 - var127 | var127 - (var127 >>> 8);
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
					var14 = var119;
					var22 += var23;
				}
			} else if (arg8 == 0) {
				int var128 = var14;
				int var129 = arg9 >> 16 & 0xFF;
				int var130 = arg9 >> 8 & 0xFF;
				int var131 = arg9 & 0xFF;
				for (int var132 = -arg7; var132 < 0; var132++) {
					int var133 = (var15 >> 16) * this.field9356;
					for (int var134 = -arg6; var134 < 0; var134++) {
						if (!arg1 || arg5 < var27[var22]) {
							int var135 = this.field11904[(var14 >> 16) + var133];
							if (var135 != 0) {
								if (arg0) {
									int var136 = (var135 & 0xFF0000) * var129 & 0xFF000000;
									int var137 = (var135 & 0xFF00) * var130 & 0xFF0000;
									int var138 = (var135 & 0xFF) * var131 & 0xFF00;
									int var139 = (var136 | var137 | var138) >>> 8;
									int var140 = var28[var22];
									int var141 = var139 + var140;
									int var142 = (var139 & 0xFF00FF) + (var140 & 0xFF00FF);
									int var143 = (var141 - var142 & 0x10000) + (var142 & 0x1000100);
									var28[var22] = var141 - var143 | var143 - (var143 >>> 8);
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
					var14 = var128;
					var22 += var23;
				}
			} else if (arg8 == 3) {
				int var144 = var14;
				for (int var145 = -arg7; var145 < 0; var145++) {
					int var146 = (var15 >> 16) * this.field9356;
					for (int var147 = -arg6; var147 < 0; var147++) {
						if (!arg1 || arg5 < var27[var22]) {
							if (arg0) {
								int var148 = this.field11904[(var14 >> 16) + var146];
								int var149 = arg9 + var148;
								int var150 = (arg9 & 0xFF00FF) + (var148 & 0xFF00FF);
								int var151 = (var149 - var150 & 0x10000) + (var150 & 0x1000100);
								int var152 = var149 - var151 | var151 - (var151 >>> 8);
								int var153 = var28[var22];
								int var154 = var152 + var153;
								int var155 = (var152 & 0xFF00FF) + (var153 & 0xFF00FF);
								int var156 = (var154 - var155 & 0x10000) + (var155 & 0x1000100);
								var28[var22] = var154 - var156 | var156 - (var156 >>> 8);
							}
							if (arg1 && arg12) {
								var27[var22] = arg5;
							}
						}
						var14 += var18;
						var22++;
					}
					var15 += var19;
					var14 = var144;
					var22 += var23;
				}
			} else if (arg8 == 2) {
				int var157 = arg9 >>> 24;
				int var158 = 256 - var157;
				int var159 = (arg9 & 0xFF00FF) * var158 & 0xFF00FF00;
				int var160 = (arg9 & 0xFF00) * var158 & 0xFF0000;
				int var161 = (var159 | var160) >>> 8;
				int var162 = var14;
				for (int var163 = -arg7; var163 < 0; var163++) {
					int var164 = (var15 >> 16) * this.field9356;
					for (int var165 = -arg6; var165 < 0; var165++) {
						if (!arg1 || arg5 < var27[var22]) {
							int var166 = this.field11904[(var14 >> 16) + var164];
							if (var166 != 0) {
								if (arg0) {
									int var167 = (var166 & 0xFF00FF) * var157 & 0xFF00FF00;
									int var168 = (var166 & 0xFF00) * var157 & 0xFF0000;
									int var169 = ((var167 | var168) >>> 8) + var161;
									int var170 = var28[var22];
									int var171 = var169 + var170;
									int var172 = (var169 & 0xFF00FF) + (var170 & 0xFF00FF);
									int var173 = (var171 - var172 & 0x10000) + (var172 & 0x1000100);
									var28[var22] = var171 - var173 | var173 - (var173 >>> 8);
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
					var14 = var162;
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
						int var68 = this.field11904[(var14 >> 16) + var66];
						if (var68 != 0) {
							if (arg0) {
								var28[var22] = var68;
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
				var14 = var64;
				var22 += var23;
			}
		} else if (arg8 == 0) {
			int var69 = var14;
			if ((arg9 & 0xFFFFFF) == 16777215) {
				int var70 = arg9 >>> 24;
				int var71 = 256 - var70;
				for (int var72 = -arg7; var72 < 0; var72++) {
					int var73 = (var15 >> 16) * this.field9356;
					for (int var74 = -arg6; var74 < 0; var74++) {
						if (!arg1 || arg5 < var27[var22]) {
							int var75 = this.field11904[(var14 >> 16) + var73];
							if (var75 != 0) {
								if (arg0) {
									int var76 = var28[var22];
									var28[var22] = ((var75 & 0xFF00FF) * var70 + (var76 & 0xFF00FF) * var71 & 0xFF00FF00) + ((var75 & 0xFF00) * var70 + (var76 & 0xFF00) * var71 & 0xFF0000) >> 8;
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
					var14 = var69;
					var22 += var23;
				}
			} else {
				int var77 = arg9 >> 16 & 0xFF;
				int var78 = arg9 >> 8 & 0xFF;
				int var79 = arg9 & 0xFF;
				int var80 = arg9 >>> 24;
				int var81 = 256 - var80;
				for (int var82 = -arg7; var82 < 0; var82++) {
					int var83 = (var15 >> 16) * this.field9356;
					for (int var84 = -arg6; var84 < 0; var84++) {
						if (!arg1 || arg5 < var27[var22]) {
							int var85 = this.field11904[(var14 >> 16) + var83];
							if (var85 != 0) {
								if (var80 == 255) {
									if (arg0) {
										int var91 = (var85 & 0xFF0000) * var77 & 0xFF000000;
										int var92 = (var85 & 0xFF00) * var78 & 0xFF0000;
										int var93 = (var85 & 0xFF) * var79 & 0xFF00;
										var28[var22] = (var91 | var92 | var93) >>> 8;
									}
									if (arg1 && arg12) {
										var27[var22] = arg5;
									}
								} else {
									if (arg0) {
										int var86 = (var85 & 0xFF0000) * var77 & 0xFF000000;
										int var87 = (var85 & 0xFF00) * var78 & 0xFF0000;
										int var88 = (var85 & 0xFF) * var79 & 0xFF00;
										int var89 = (var86 | var87 | var88) >>> 8;
										int var90 = var28[var22];
										var28[var22] = ((var89 & 0xFF00FF) * var80 + (var90 & 0xFF00FF) * var81 & 0xFF00FF00) + ((var89 & 0xFF00) * var80 + (var90 & 0xFF00) * var81 & 0xFF0000) >> 8;
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
					var14 = var69;
					var22 += var23;
				}
			}
		} else if (arg8 == 3) {
			int var94 = var14;
			int var95 = arg9 >>> 24;
			int var96 = 256 - var95;
			for (int var97 = -arg7; var97 < 0; var97++) {
				int var98 = (var15 >> 16) * this.field9356;
				for (int var99 = -arg6; var99 < 0; var99++) {
					if (!arg1 || arg5 < var27[var22]) {
						if (arg0) {
							int var100 = this.field11904[(var14 >> 16) + var98];
							int var101 = arg9 + var100;
							int var102 = (arg9 & 0xFF00FF) + (var100 & 0xFF00FF);
							int var103 = (var101 - var102 & 0x10000) + (var102 & 0x1000100);
							int var104 = var101 - var103 | var103 - (var103 >>> 8);
							if (var100 == 0 && var95 != 255) {
								int var106 = var28[var22];
								var104 = ((var104 & 0xFF00FF) * var95 + (var106 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var104 & 0xFF00) * var95 + (var106 & 0xFF00) * var96 & 0xFF0000) >> 8;
							}
							var28[var22] = var104;
						}
						if (arg1 && arg12) {
							var27[var22] = arg5;
						}
					}
					var14 += var18;
					var22++;
				}
				var15 += var19;
				var14 = var94;
				var22 += var23;
			}
		} else if (arg8 == 2) {
			int var107 = arg9 >>> 24;
			int var108 = 256 - var107;
			int var109 = (arg9 & 0xFF00FF) * var108 & 0xFF00FF00;
			int var110 = (arg9 & 0xFF00) * var108 & 0xFF0000;
			int var111 = (var109 | var110) >>> 8;
			int var112 = var14;
			for (int var113 = -arg7; var113 < 0; var113++) {
				int var114 = (var15 >> 16) * this.field9356;
				for (int var115 = -arg6; var115 < 0; var115++) {
					if (!arg1 || arg5 < var27[var22]) {
						int var116 = this.field11904[(var14 >> 16) + var114];
						if (var116 != 0) {
							if (arg0) {
								int var117 = (var116 & 0xFF00FF) * var107 & 0xFF00FF00;
								int var118 = (var116 & 0xFF00) * var107 & 0xFF0000;
								var28[var22] = ((var117 | var118) >>> 8) + var111;
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
				var14 = var112;
				var22 += var23;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("apo.ce(II)V")
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
							this.method18947((var6 >> 12) + (var7 >> 12) * this.field9356, var5++, var3, arg0, arg1);
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
							this.method18947((var11 >> 12) + (var12 >> 12) * this.field9356, var10++, var3, arg0, arg1);
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
							this.method18947((var19 >> 12) + (var20 >> 12) * this.field9356, var18++, var3, arg0, arg1);
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
							this.method18947((var26 >> 12) + (var27 >> 12) * this.field9356, var25++, var3, arg0, arg1);
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
						this.method18947((var34 >> 12) + (var35 >> 12) * this.field9356, var33++, var3, arg0, arg1);
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
						this.method18947((var45 >> 12) + (var46 >> 12) * this.field9356, var44++, var3, arg0, arg1);
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
						this.method18947((var55 >> 12) + (var56 >> 12) * this.field9356, var54++, var3, arg0, arg1);
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
					this.method18947((var62 >> 12) + (var63 >> 12) * this.field9356, var61++, var3, arg0, arg1);
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
					this.method18947((var72 >> 12) + (var73 >> 12) * this.field9356, var71++, var3, arg0, arg1);
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

	@ObfuscatedName("apo.cu([I[III)V")
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
								int var15 = this.field11904[(var9 >> 12) + (var10 >> 12) * this.field9356];
								if (var15 == 0) {
									var8++;
								} else {
									var5[var8++] = var15;
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
								int var28 = this.field11904[(var19 >> 12) + (var20 >> 12) * this.field9356];
								if (var28 == 0) {
									var18++;
								} else {
									var5[var18++] = var28;
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
								int var40 = this.field11904[(var32 >> 12) + (var33 >> 12) * this.field9356];
								if (var40 == 0) {
									var31++;
								} else {
									var5[var31++] = var40;
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
								int var53 = this.field11904[(var44 >> 12) + (var45 >> 12) * this.field9356];
								if (var53 == 0) {
									var43++;
								} else {
									var5[var43++] = var53;
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
							int var69 = this.field11904[(var57 >> 12) + (var58 >> 12) * this.field9356];
							if (var69 == 0) {
								var56++;
							} else {
								var5[var56++] = var69;
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
							int var84 = this.field11904[(var73 >> 12) + (var74 >> 12) * this.field9356];
							if (var84 == 0) {
								var72++;
							} else {
								var5[var72++] = var84;
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
							int var96 = this.field11904[(var88 >> 12) + (var89 >> 12) * this.field9356];
							if (var96 == 0) {
								var87++;
							} else {
								var5[var87++] = var96;
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
						int var111 = this.field11904[(var100 >> 12) + (var101 >> 12) * this.field9356];
						if (var111 == 0) {
							var99++;
						} else {
							var5[var99++] = var111;
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
						int var125 = this.field11904[(var115 >> 12) + (var116 >> 12) * this.field9356];
						if (var125 == 0) {
							var114++;
						} else {
							var5[var114++] = var125;
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

	@ObfuscatedName("apo.ch(II[III)V")
	public void method18947(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
		int var10001;
		if (arg4 == 0) {
			if (arg3 == 1) {
				arg2[arg1] = this.field11904[arg0];
			} else {
				int var74;
				if (arg3 == 0) {
					var10001 = arg0;
					var74 = arg0 + 1;
					int var6 = this.field11904[var10001];
					int var7 = (var6 & 0xFF0000) * field9382 & 0xFF000000;
					int var8 = (var6 & 0xFF00) * field9386 & 0xFF0000;
					int var9 = (var6 & 0xFF) * field9387 & 0xFF00;
					arg2[arg1] = (var7 | var8 | var9) >>> 8;
				} else if (arg3 == 3) {
					var10001 = arg0;
					var74 = arg0 + 1;
					int var10 = this.field11904[var10001];
					int var11 = Statics.field9361;
					int var12 = var10 + var11;
					int var13 = (var10 & 0xFF00FF) + (var11 & 0xFF00FF);
					int var14 = (var12 - var13 & 0x10000) + (var13 & 0x1000100);
					arg2[arg1] = var12 - var14 | var14 - (var14 >>> 8);
				} else if (arg3 == 2) {
					int var15 = this.field11904[arg0];
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
				int var42 = this.field11904[arg0];
				if (var42 != 0) {
					int var43 = arg2[arg1];
					int var44 = var42 + var43;
					int var45 = (var42 & 0xFF00FF) + (var43 & 0xFF00FF);
					int var46 = (var44 - var45 & 0x10000) + (var45 & 0x1000100);
					arg2[arg1] = var44 - var46 | var46 - (var46 >>> 8);
				}
			} else if (arg3 == 0) {
				int var47 = this.field11904[arg0];
				if (var47 != 0) {
					int var48 = (var47 & 0xFF0000) * field9382 & 0xFF000000;
					int var49 = (var47 & 0xFF00) * field9386 & 0xFF0000;
					int var50 = (var47 & 0xFF) * field9387 & 0xFF00;
					int var51 = (var48 | var49 | var50) >>> 8;
					int var52 = arg2[arg1];
					int var53 = var51 + var52;
					int var54 = (var51 & 0xFF00FF) + (var52 & 0xFF00FF);
					int var55 = (var53 - var54 & 0x10000) + (var54 & 0x1000100);
					arg2[arg1] = var53 - var55 | var55 - (var55 >>> 8);
				}
			} else if (arg3 == 3) {
				int var56 = this.field11904[arg0];
				int var57 = Statics.field9361;
				int var58 = var56 + var57;
				int var59 = (var56 & 0xFF00FF) + (var57 & 0xFF00FF);
				int var60 = (var58 - var59 & 0x10000) + (var59 & 0x1000100);
				int var61 = var58 - var60 | var60 - (var60 >>> 8);
				int var62 = arg2[arg1];
				int var63 = var61 + var62;
				int var64 = (var61 & 0xFF00FF) + (var62 & 0xFF00FF);
				int var65 = (var63 - var64 & 0x10000) + (var64 & 0x1000100);
				arg2[arg1] = var63 - var65 | var65 - (var65 >>> 8);
			} else if (arg3 == 2) {
				int var66 = this.field11904[arg0];
				if (var66 != 0) {
					int var67 = (var66 & 0xFF00FF) * field9383 & 0xFF00FF00;
					int var68 = (var66 & 0xFF00) * field9383 & 0xFF0000;
					int var69 = ((var67 | var68) >>> 8) + field9379;
					int var70 = arg2[arg1];
					int var71 = var69 + var70;
					int var72 = (var69 & 0xFF00FF) + (var70 & 0xFF00FF);
					int var73 = (var71 - var72 & 0x10000) + (var72 & 0x1000100);
					arg2[arg1] = var71 - var73 | var73 - (var73 >>> 8);
				}
			}
		} else if (arg3 == 1) {
			int var18 = this.field11904[arg0];
			if (var18 != 0) {
				arg2[arg1] = var18;
			}
		} else if (arg3 == 0) {
			int var19 = this.field11904[arg0];
			if (var19 != 0) {
				if ((Statics.field9361 & 0xFFFFFF) == 16777215) {
					int var20 = Statics.field9361 >>> 24;
					int var21 = 256 - var20;
					int var22 = arg2[arg1];
					arg2[arg1] = ((var19 & 0xFF00FF) * var20 + (var22 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var19 & 0xFF00) * var20 + (var22 & 0xFF00) * var21 & 0xFF0000) >> 8;
				} else if (field9383 == 255) {
					int var28 = (var19 & 0xFF0000) * field9382 & 0xFF000000;
					int var29 = (var19 & 0xFF00) * field9386 & 0xFF0000;
					int var30 = (var19 & 0xFF) * field9387 & 0xFF00;
					arg2[arg1] = (var28 | var29 | var30) >>> 8;
				} else {
					int var23 = (var19 & 0xFF0000) * field9382 & 0xFF000000;
					int var24 = (var19 & 0xFF00) * field9386 & 0xFF0000;
					int var25 = (var19 & 0xFF) * field9387 & 0xFF00;
					int var26 = (var23 | var24 | var25) >>> 8;
					int var27 = arg2[arg1];
					arg2[arg1] = ((var26 & 0xFF00FF) * field9383 + (var27 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var26 & 0xFF00) * field9383 + (var27 & 0xFF00) * field9366 & 0xFF0000) >> 8;
				}
			}
		} else if (arg3 == 3) {
			int var31 = this.field11904[arg0];
			int var32 = Statics.field9361;
			int var33 = var31 + var32;
			int var34 = (var31 & 0xFF00FF) + (var32 & 0xFF00FF);
			int var35 = (var33 - var34 & 0x10000) + (var34 & 0x1000100);
			int var36 = var33 - var35 | var35 - (var35 >>> 8);
			if (var31 == 0 && field9383 != 255) {
				int var38 = arg2[arg1];
				var36 = ((var36 & 0xFF00FF) * field9383 + (var38 & 0xFF00FF) * field9366 & 0xFF00FF00) + ((var36 & 0xFF00) * field9383 + (var38 & 0xFF00) * field9366 & 0xFF0000) >> 8;
			}
			arg2[arg1] = var36;
		} else if (arg3 == 2) {
			int var39 = this.field11904[arg0];
			if (var39 != 0) {
				int var40 = (var39 & 0xFF00FF) * field9383 & 0xFF00FF00;
				int var41 = (var39 & 0xFF00) * field9383 & 0xFF0000;
				var10001 = arg1;
				int var75 = arg1 + 1;
				arg2[var10001] = ((var40 | var41) >>> 8) + field9379;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
