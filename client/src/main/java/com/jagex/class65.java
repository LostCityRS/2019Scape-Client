package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("bd")
public class class65 {

	@ObfuscatedName("bd.e")
	public boolean field940 = false;

	@ObfuscatedName("bd.n")
	public boolean field933 = true;

	@ObfuscatedName("bd.m")
	public boolean field968 = false;

	@ObfuscatedName("bd.k")
	public int field935 = 0;

	@ObfuscatedName("bd.f")
	public boolean field936 = false;

	@ObfuscatedName("bd.w")
	public boolean field937 = false;

	@ObfuscatedName("bd.l")
	public int[] field938 = new int[4096];

	@ObfuscatedName("bd.u")
	public float field934;

	@ObfuscatedName("bd.z")
	public float field964;

	@ObfuscatedName("bd.p")
	public float field941;

	@ObfuscatedName("bd.d")
	public float field942;

	@ObfuscatedName("bd.c")
	public float field958 = 0.0F;

	@ObfuscatedName("bd.r")
	public float field932 = 1.0F;

	@ObfuscatedName("bd.v")
	public int field945;

	@ObfuscatedName("bd.o")
	public int field946;

	@ObfuscatedName("bd.s")
	public class848 field947;

	@ObfuscatedName("bd.y")
	public class55 field966;

	@ObfuscatedName("bd.q")
	public int field949;

	@ObfuscatedName("bd.x")
	public int[] field950;

	@ObfuscatedName("bd.b")
	public float[] field951;

	@ObfuscatedName("bd.h")
	public int field952;

	@ObfuscatedName("bd.a")
	public int field953 = -1;

	@ObfuscatedName("bd.g")
	public int[] field954 = null;

	@ObfuscatedName("bd.i")
	public int field948 = 0;

	@ObfuscatedName("bd.j")
	public int field956 = 0;

	@ObfuscatedName("bd.t")
	public float field957 = 0.0F;

	@ObfuscatedName("bd.ae")
	public class603 field960;

	@ObfuscatedName("bd.ag")
	public int field959 = 0;

	@ObfuscatedName("bd.ah")
	public boolean field939 = true;

	@ObfuscatedName("bd.al")
	public int field961 = -1;

	@ObfuscatedName("bd.ac")
	public int[] field962 = null;

	@ObfuscatedName("bd.ai")
	public int field944 = 0;

	@ObfuscatedName("bd.aw")
	public int field963 = 0;

	@ObfuscatedName("bd.as")
	public float field965 = 0.0F;

	@ObfuscatedName("bd.at")
	public int field955 = -1;

	@ObfuscatedName("bd.ad")
	public int[] field967 = null;

	@ObfuscatedName("bd.am")
	public int field943 = 0;

	@ObfuscatedName("bd.au")
	public int field969 = 0;

	@ObfuscatedName("bd.ar")
	public float field970 = 0.0F;

	public class65(class848 arg0, class55 arg1) {
		this.field947 = arg0;
		this.field966 = arg1;
		this.field949 = this.field947.field9779;
		this.field950 = this.field947.field9778;
		this.field951 = this.field947.field9781;
		this.field960 = class603.field7575;
	}

	@ObfuscatedName("bd.e()I")
	public int method1025() {
		return this.field938[0] % this.field949;
	}

	@ObfuscatedName("bd.n()I")
	public int method1026() {
		return this.field938[0] / this.field949;
	}

	@ObfuscatedName("bd.m(Z)V")
	public final void method1027(boolean arg0) {
		this.field940 = arg0;
	}

	@ObfuscatedName("bd.k(ZZZFFFFFFFFFFFF)V")
	public final void method1028(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14) {
		if (!arg0) {
			this.method1032(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.field940) {
			this.field947.method2374((int) arg6, (int) arg3, (int) arg7, (int) arg4, Statics.field8149[(int) arg12 & 0xFFFF]);
			this.field947.method2374((int) arg7, (int) arg4, (int) arg8, (int) arg5, Statics.field8149[(int) arg12 & 0xFFFF]);
			this.field947.method2374((int) arg8, (int) arg5, (int) arg6, (int) arg3, Statics.field8149[(int) arg12 & 0xFFFF]);
		} else {
			float var16 = arg7 - arg6;
			float var17 = arg4 - arg3;
			float var18 = arg8 - arg6;
			float var19 = arg5 - arg3;
			float var20 = arg13 - arg12;
			float var21 = arg14 - arg12;
			float var22 = arg10 - arg9;
			float var23 = arg11 - arg9;
			float var24;
			if (arg4 == arg5) {
				var24 = 0.0F;
			} else {
				var24 = (arg8 - arg7) / (arg5 - arg4);
			}
			float var25;
			if (arg3 == arg4) {
				var25 = 0.0F;
			} else {
				var25 = var16 / var17;
			}
			float var26;
			if (arg3 == arg5) {
				var26 = 0.0F;
			} else {
				var26 = var18 / var19;
			}
			float var27 = var16 * var19 - var17 * var18;
			if (var27 != 0.0F) {
				float var28 = (var19 * var20 - var17 * var21) / var27;
				float var29 = (var16 * var21 - var18 * var20) / var27;
				float var30 = (var19 * var22 - var17 * var23) / var27;
				float var31 = (var16 * var23 - var18 * var22) / var27;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.field946)) {
						if (arg4 > (float) this.field946) {
							arg4 = this.field946;
						}
						if (arg5 > (float) this.field946) {
							arg5 = this.field946;
						}
						float var32 = arg12 - arg6 * var28 + var28;
						float var33 = arg9 - arg6 * var30 + var30;
						if (arg4 < arg5) {
							float var34 = arg6;
							if (arg3 < 0.0F) {
								var34 = arg6 - arg3 * var26;
								arg6 -= arg3 * var25;
								var32 -= arg3 * var29;
								var33 -= arg3 * var31;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= arg4 * var24;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && var26 < var25 || arg3 == arg4 && var26 > var24) {
								float var35 = (float) (arg3 + 0.5F);
								float var36 = (float) (arg4 + 0.5F);
								float var37 = (float) (arg5 + 0.5F) - var36;
								float var38 = var36 - var35;
								float var39 = (float) this.field938[(int) var35];
								while (--var38 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var39, 0, 0, (int) var34, (int) arg6, var32, var28, var33, var30);
									var34 += var26;
									arg6 += var25;
									var32 += var29;
									var33 += var31;
									var39 += this.field949;
								}
								while (--var37 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var39, 0, 0, (int) var34, (int) arg7, var32, var28, var33, var30);
									var34 += var26;
									arg7 += var24;
									var32 += var29;
									var33 += var31;
									var39 += this.field949;
								}
							} else {
								float var40 = (float) (arg3 + 0.5F);
								float var41 = (float) (arg4 + 0.5F);
								float var42 = (float) (arg5 + 0.5F) - var41;
								float var43 = var41 - var40;
								float var44 = (float) this.field938[(int) var40];
								while (--var43 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var44, 0, 0, (int) arg6, (int) var34, var32, var28, var33, var30);
									var34 += var26;
									arg6 += var25;
									var32 += var29;
									var33 += var31;
									var44 += this.field949;
								}
								while (--var42 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var44, 0, 0, (int) arg7, (int) var34, var32, var28, var33, var30);
									var34 += var26;
									arg7 += var24;
									var32 += var29;
									var33 += var31;
									var44 += this.field949;
								}
							}
						} else {
							float var45 = arg6;
							if (arg3 < 0.0F) {
								var45 = arg6 - arg3 * var26;
								arg6 -= arg3 * var25;
								var32 -= arg3 * var29;
								var33 -= arg3 * var31;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= arg5 * var24;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && var26 < var25 || arg3 == arg5 && var24 > var25) {
								float var46 = (float) (arg3 + 0.5F);
								float var47 = (float) (arg5 + 0.5F);
								float var48 = (float) (arg4 + 0.5F) - var47;
								float var49 = var47 - var46;
								float var50 = (float) this.field938[(int) var46];
								while (--var49 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var50, 0, 0, (int) var45, (int) arg6, var32, var28, var33, var30);
									var45 += var26;
									arg6 += var25;
									var32 += var29;
									var33 += var31;
									var50 += this.field949;
								}
								while (--var48 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var50, 0, 0, (int) arg8, (int) arg6, var32, var28, var33, var30);
									arg8 += var24;
									arg6 += var25;
									var32 += var29;
									var33 += var31;
									var50 += this.field949;
								}
							} else {
								float var51 = (float) (arg3 + 0.5F);
								float var52 = (float) (arg5 + 0.5F);
								float var53 = (float) (arg4 + 0.5F) - var52;
								float var54 = var52 - var51;
								float var55 = (float) this.field938[(int) var51];
								while (--var54 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var55, 0, 0, (int) arg6, (int) var45, var32, var28, var33, var30);
									var45 += var26;
									arg6 += var25;
									var32 += var29;
									var33 += var31;
									var55 += this.field949;
								}
								while (--var53 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var55, 0, 0, (int) arg6, (int) arg8, var32, var28, var33, var30);
									arg8 += var24;
									arg6 += var25;
									var32 += var29;
									var33 += var31;
									var55 += this.field949;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.field946)) {
						if (arg5 > (float) this.field946) {
							arg5 = this.field946;
						}
						if (arg3 > (float) this.field946) {
							arg3 = this.field946;
						}
						float var56 = arg13 - arg7 * var28 + var28;
						float var57 = arg10 - arg7 * var30 + var30;
						if (arg5 < arg3) {
							float var58 = arg7;
							if (arg4 < 0.0F) {
								var58 = arg7 - arg4 * var25;
								arg7 -= arg4 * var24;
								var56 -= arg4 * var29;
								var57 -= arg4 * var31;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= arg5 * var26;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && var25 < var24 || arg4 == arg5 && var25 > var26) {
								float var59 = (float) (arg4 + 0.5F);
								float var60 = (float) (arg5 + 0.5F);
								float var61 = (float) (arg3 + 0.5F) - var60;
								float var62 = var60 - var59;
								float var63 = (float) this.field938[(int) var59];
								while (--var62 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var63, 0, 0, (int) var58, (int) arg7, var56, var28, var57, var30);
									var58 += var25;
									arg7 += var24;
									var56 += var29;
									var57 += var31;
									var63 += this.field949;
								}
								while (--var61 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var63, 0, 0, (int) var58, (int) arg8, var56, var28, var57, var30);
									var58 += var25;
									arg8 += var26;
									var56 += var29;
									var57 += var31;
									var63 += this.field949;
								}
							} else {
								float var64 = (float) (arg4 + 0.5F);
								float var65 = (float) (arg5 + 0.5F);
								float var66 = (float) (arg3 + 0.5F) - var65;
								float var67 = var65 - var64;
								float var68 = (float) this.field938[(int) var64];
								while (--var67 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var68, 0, 0, (int) arg7, (int) var58, var56, var28, var57, var30);
									var58 += var25;
									arg7 += var24;
									var56 += var29;
									var57 += var31;
									var68 += this.field949;
								}
								while (--var66 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var68, 0, 0, (int) arg8, (int) var58, var56, var28, var57, var30);
									var58 += var25;
									arg8 += var26;
									var56 += var29;
									var57 += var31;
									var68 += this.field949;
								}
							}
						} else {
							float var69 = arg7;
							if (arg4 < 0.0F) {
								var69 = arg7 - arg4 * var25;
								arg7 -= arg4 * var24;
								var56 -= arg4 * var29;
								var57 -= arg4 * var31;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= arg3 * var26;
								arg3 = 0.0F;
							}
							if (var25 < var24) {
								float var70 = (float) (arg4 + 0.5F);
								float var71 = (float) (arg3 + 0.5F);
								float var72 = (float) (arg5 + 0.5F) - var71;
								float var73 = var71 - var70;
								float var74 = (float) this.field938[(int) var70];
								while (--var73 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var74, 0, 0, (int) var69, (int) arg7, var56, var28, var57, var30);
									var69 += var25;
									arg7 += var24;
									var56 += var29;
									var57 += var31;
									var74 += this.field949;
								}
								while (--var72 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var74, 0, 0, (int) arg6, (int) arg7, var56, var28, var57, var30);
									arg6 += var26;
									arg7 += var24;
									var56 += var29;
									var57 += var31;
									var74 += this.field949;
								}
							} else {
								float var75 = (float) (arg4 + 0.5F);
								float var76 = (float) (arg3 + 0.5F);
								float var77 = (float) (arg5 + 0.5F) - var76;
								float var78 = var76 - var75;
								float var79 = (float) this.field938[(int) var75];
								while (--var78 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var79, 0, 0, (int) arg7, (int) var69, var56, var28, var57, var30);
									var69 += var25;
									arg7 += var24;
									var56 += var29;
									var57 += var31;
									var79 += this.field949;
								}
								while (--var77 >= 0.0F) {
									this.method1056(arg1, arg2, this.field950, (int) var79, 0, 0, (int) arg7, (int) arg6, var56, var28, var57, var30);
									arg6 += var26;
									arg7 += var24;
									var56 += var29;
									var57 += var31;
									var79 += this.field949;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.field946)) {
					if (arg3 > (float) this.field946) {
						arg3 = this.field946;
					}
					if (arg4 > (float) this.field946) {
						arg4 = this.field946;
					}
					float var80 = arg14 - arg8 * var28 + var28;
					float var81 = arg11 - arg8 * var30 + var30;
					if (arg3 < arg4) {
						float var82 = arg8;
						if (arg5 < 0.0F) {
							var82 = arg8 - arg5 * var24;
							arg8 -= arg5 * var26;
							var80 -= arg5 * var29;
							var81 -= arg5 * var31;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= arg3 * var25;
							arg3 = 0.0F;
						}
						if (var24 < var26) {
							float var83 = (float) (arg5 + 0.5F);
							float var84 = (float) (arg3 + 0.5F);
							float var85 = (float) (arg4 + 0.5F) - var84;
							float var86 = var84 - var83;
							float var87 = (float) this.field938[(int) var83];
							while (--var86 >= 0.0F) {
								this.method1056(arg1, arg2, this.field950, (int) var87, 0, 0, (int) var82, (int) arg8, var80, var28, var81, var30);
								var82 += var24;
								arg8 += var26;
								var80 += var29;
								var81 += var31;
								var87 += this.field949;
							}
							while (--var85 >= 0.0F) {
								this.method1056(arg1, arg2, this.field950, (int) var87, 0, 0, (int) var82, (int) arg6, var80, var28, var81, var30);
								var82 += var24;
								arg6 += var25;
								var80 += var29;
								var81 += var31;
								var87 += this.field949;
							}
						} else {
							float var88 = (float) (arg5 + 0.5F);
							float var89 = (float) (arg3 + 0.5F);
							float var90 = (float) (arg4 + 0.5F) - var89;
							float var91 = var89 - var88;
							float var92 = (float) this.field938[(int) var88];
							while (--var91 >= 0.0F) {
								this.method1056(arg1, arg2, this.field950, (int) var92, 0, 0, (int) arg8, (int) var82, var80, var28, var81, var30);
								var82 += var24;
								arg8 += var26;
								var80 += var29;
								var81 += var31;
								var92 += this.field949;
							}
							while (--var90 >= 0.0F) {
								this.method1056(arg1, arg2, this.field950, (int) var92, 0, 0, (int) arg6, (int) var82, var80, var28, var81, var30);
								var82 += var24;
								arg6 += var25;
								var80 += var29;
								var81 += var31;
								var92 += this.field949;
							}
						}
					} else {
						float var93 = arg8;
						if (arg5 < 0.0F) {
							var93 = arg8 - arg5 * var24;
							arg8 -= arg5 * var26;
							var80 -= arg5 * var29;
							var81 -= arg5 * var31;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= arg4 * var25;
							arg4 = 0.0F;
						}
						if (var24 < var26) {
							float var94 = (float) (arg5 + 0.5F);
							float var95 = (float) (arg4 + 0.5F);
							float var96 = (float) (arg3 + 0.5F) - var95;
							float var97 = var95 - var94;
							float var98 = (float) this.field938[(int) var94];
							while (--var97 >= 0.0F) {
								this.method1056(arg1, arg2, this.field950, (int) var98, 0, 0, (int) var93, (int) arg8, var80, var28, var81, var30);
								var93 += var24;
								arg8 += var26;
								var80 += var29;
								var81 += var31;
								var98 += this.field949;
							}
							while (--var96 >= 0.0F) {
								this.method1056(arg1, arg2, this.field950, (int) var98, 0, 0, (int) arg7, (int) arg8, var80, var28, var81, var30);
								arg7 += var25;
								arg8 += var26;
								var80 += var29;
								var81 += var31;
								var98 += this.field949;
							}
						} else {
							float var99 = (float) (arg5 + 0.5F);
							float var100 = (float) (arg4 + 0.5F);
							float var101 = (float) (arg3 + 0.5F) - var100;
							float var102 = var100 - var99;
							float var103 = (float) this.field938[(int) var99];
							while (--var102 >= 0.0F) {
								this.method1056(arg1, arg2, this.field950, (int) var103, 0, 0, (int) arg8, (int) var93, var80, var28, var81, var30);
								var93 += var24;
								arg8 += var26;
								var80 += var29;
								var81 += var31;
								var103 += this.field949;
							}
							while (--var101 >= 0.0F) {
								this.method1056(arg1, arg2, this.field950, (int) var103, 0, 0, (int) arg8, (int) arg7, var80, var28, var81, var30);
								arg7 += var25;
								arg8 += var26;
								var80 += var29;
								var81 += var31;
								var103 += this.field949;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bd.f(ZZ[IIIIIIFFFF)V")
	public final void method1056(boolean arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10, float arg11) {
		if (this.field936) {
			if (arg7 > this.field945) {
				arg7 = this.field945;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		int var13 = arg6 - 1 + arg3;
		float var14 = (float) arg6 * arg9 + arg8;
		float var15 = (float) arg6 * arg11 + arg10;
		if (this.field966.field834) {
			if (this.field933) {
				int var16 = arg7 - arg6 >> 2;
				float var17 = arg9 * 4.0F;
				if (this.field935 == 0) {
					if (var16 > 0) {
						do {
							int var18 = Statics.field8149[(int) var14 & 0xFFFF];
							var14 += var17;
							var13++;
							if (!arg0 || var15 < this.field951[var13]) {
								arg2[var13] = var18;
								if (arg0) {
									this.field951[var13] = var15;
								}
							}
							float var19 = arg11 + var15;
							var13++;
							if (!arg0 || var19 < this.field951[var13]) {
								arg2[var13] = var18;
								if (arg0) {
									this.field951[var13] = var19;
								}
							}
							float var20 = arg11 + var19;
							var13++;
							if (!arg0 || var20 < this.field951[var13]) {
								arg2[var13] = var18;
								if (arg0) {
									this.field951[var13] = var20;
								}
							}
							float var21 = arg11 + var20;
							var13++;
							if (!arg0 || var21 < this.field951[var13]) {
								arg2[var13] = var18;
								if (arg0) {
									this.field951[var13] = var21;
								}
							}
							var15 = arg11 + var21;
							var16--;
						} while (var16 > 0);
					}
					int var22 = arg7 - arg6 & 0x3;
					if (var22 > 0) {
						int var23 = Statics.field8149[(int) var14 & 0xFFFF];
						do {
							var13++;
							if (!arg0 || var15 < this.field951[var13]) {
								arg2[var13] = var23;
								if (arg0) {
									this.field951[var13] = var15;
								}
							}
							var15 += arg11;
							var22--;
						} while (var22 > 0);
					}
				} else {
					int var24 = this.field935;
					int var25 = 256 - this.field935;
					if (var16 > 0) {
						do {
							int var26 = Statics.field8149[(int) var14 & 0xFFFF];
							var14 += var17;
							int var27 = ((var26 & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + ((var26 & 0xFF00) * var25 >> 8 & 0xFF00);
							var13++;
							if (!arg0 || var15 < this.field951[var13]) {
								int var28 = arg2[var13];
								if (arg1) {
									arg2[var13] = (var25 | var28 >> 24) << 24 | ((var28 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var28 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
								} else {
									arg2[var13] = ((var28 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var28 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
								}
								if (arg0) {
									this.field951[var13] = var15;
								}
							}
							float var29 = arg11 + var15;
							var13++;
							if (!arg0 || var29 < this.field951[var13]) {
								int var30 = arg2[var13];
								if (arg1) {
									arg2[var13] = (var25 | var30 >> 24) << 24 | ((var30 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var30 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
								} else {
									arg2[var13] = ((var30 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var30 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
								}
								if (arg0) {
									this.field951[var13] = var29;
								}
							}
							float var31 = arg11 + var29;
							var13++;
							if (!arg0 || var31 < this.field951[var13]) {
								int var32 = arg2[var13];
								if (arg1) {
									arg2[var13] = (var25 | var32 >> 24) << 24 | ((var32 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
								} else {
									arg2[var13] = ((var32 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
								}
								if (arg0) {
									this.field951[var13] = var31;
								}
							}
							float var33 = arg11 + var31;
							var13++;
							if (!arg0 || var33 < this.field951[var13]) {
								int var34 = arg2[var13];
								if (arg1) {
									arg2[var13] = (var25 | var34 >> 24) << 24 | ((var34 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var34 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
								} else {
									arg2[var13] = ((var34 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var34 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var27;
								}
								if (arg0) {
									this.field951[var13] = var33;
								}
							}
							var15 = arg11 + var33;
							var16--;
						} while (var16 > 0);
					}
					int var35 = arg7 - arg6 & 0x3;
					if (var35 > 0) {
						int var36 = Statics.field8149[(int) var14 & 0xFFFF];
						int var37 = ((var36 & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + ((var36 & 0xFF00) * var25 >> 8 & 0xFF00);
						do {
							var13++;
							if (!arg0 || var15 < this.field951[var13]) {
								int var38 = arg2[var13];
								if (arg1) {
									arg2[var13] = (var25 | var38 >> 24) << 24 | ((var38 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var38 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var37;
								} else {
									arg2[var13] = ((var38 & 0xFF00) * var24 >> 8 & 0xFF00) + ((var38 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + var37;
								}
								if (arg0) {
									this.field951[var13] = var15;
								}
							}
							var15 += arg11;
							var35--;
						} while (var35 > 0);
					}
				}
			} else {
				int var39 = arg7 - arg6;
				if (this.field935 == 0) {
					do {
						var13++;
						if (!arg0 || var15 < this.field951[var13]) {
							arg2[var13] = Statics.field8149[(int) var14 & 0xFFFF];
							if (arg0) {
								this.field951[var13] = var15;
							}
						}
						var15 += arg11;
						var14 += arg9;
						var39--;
					} while (var39 > 0);
				} else {
					int var40 = this.field935;
					int var41 = 256 - this.field935;
					do {
						var13++;
						if (!arg0 || var15 < this.field951[var13]) {
							int var42 = Statics.field8149[(int) var14 & 0xFFFF];
							int var43 = ((var42 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + ((var42 & 0xFF00) * var41 >> 8 & 0xFF00);
							int var44 = arg2[var13];
							if (arg1) {
								arg2[var13] = (var41 | var44 >> 24) << 24 | ((var44 & 0xFF00) * var40 >> 8 & 0xFF00) + ((var44 & 0xFF00FF) * var40 >> 8 & 0xFF00FF) + var43;
							} else {
								arg2[var13] = ((var44 & 0xFF00) * var40 >> 8 & 0xFF00) + ((var44 & 0xFF00FF) * var40 >> 8 & 0xFF00FF) + var43;
							}
							if (arg0) {
								this.field951[var13] = var15;
							}
						}
						var14 += arg9;
						var15 += arg11;
						var39--;
					} while (var39 > 0);
				}
			}
		} else if (this.field933) {
			int var45 = arg7 - arg6 >> 2;
			float var46 = arg9 * 4.0F;
			if (this.field935 == 0) {
				if (var45 > 0) {
					do {
						int var47 = Statics.field8149[(int) var14 & 0xFFFF];
						var14 += var46;
						var13++;
						if (!arg0 || var15 < this.field951[var13]) {
							arg2[var13] = var47;
						}
						float var48 = arg11 + var15;
						var13++;
						if (!arg0 || var48 < this.field951[var13]) {
							arg2[var13] = var47;
						}
						float var49 = arg11 + var48;
						var13++;
						if (!arg0 || var49 < this.field951[var13]) {
							arg2[var13] = var47;
						}
						float var50 = arg11 + var49;
						var13++;
						if (!arg0 || var50 < this.field951[var13]) {
							arg2[var13] = var47;
						}
						var15 = arg11 + var50;
						var45--;
					} while (var45 > 0);
				}
				int var51 = arg7 - arg6 & 0x3;
				if (var51 > 0) {
					int var52 = Statics.field8149[(int) var14 & 0xFFFF];
					do {
						var13++;
						if (!arg0 || var15 < this.field951[var13]) {
							arg2[var13] = var52;
						}
						var15 += arg11;
						var51--;
					} while (var51 > 0);
				}
			} else {
				int var53 = this.field935;
				int var54 = 256 - this.field935;
				if (var45 > 0) {
					do {
						int var55 = Statics.field8149[(int) var14 & 0xFFFF];
						var14 += var46;
						int var56 = ((var55 & 0xFF00FF) * var54 >> 8 & 0xFF00FF) + ((var55 & 0xFF00) * var54 >> 8 & 0xFF00);
						var13++;
						if (!arg0 || var15 < this.field951[var13]) {
							int var57 = arg2[var13];
							if (arg1) {
								arg2[var13] = (var54 | var57 >> 24) << 24 | ((var57 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var57 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var56;
							} else {
								arg2[var13] = ((var57 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var57 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var56;
							}
						}
						float var58 = arg11 + var15;
						var13++;
						if (!arg0 || var58 < this.field951[var13]) {
							int var59 = arg2[var13];
							if (arg1) {
								arg2[var13] = (var54 | var59 >> 24) << 24 | ((var59 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var59 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var56;
							} else {
								arg2[var13] = ((var59 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var59 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var56;
							}
						}
						float var60 = arg11 + var58;
						var13++;
						if (!arg0 || var60 < this.field951[var13]) {
							int var61 = arg2[var13];
							if (arg1) {
								arg2[var13] = (var54 | var61 >> 24) << 24 | ((var61 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var61 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var56;
							} else {
								arg2[var13] = ((var61 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var61 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var56;
							}
						}
						float var62 = arg11 + var60;
						var13++;
						if (!arg0 || var62 < this.field951[var13]) {
							int var63 = arg2[var13];
							if (arg1) {
								arg2[var13] = (var54 | var63 >> 24) << 24 | ((var63 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var63 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var56;
							} else {
								arg2[var13] = ((var63 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var63 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var56;
							}
						}
						var15 = arg11 + var62;
						var45--;
					} while (var45 > 0);
				}
				int var64 = arg7 - arg6 & 0x3;
				if (var64 > 0) {
					int var65 = Statics.field8149[(int) var14 & 0xFFFF];
					int var66 = ((var65 & 0xFF00FF) * var54 >> 8 & 0xFF00FF) + ((var65 & 0xFF00) * var54 >> 8 & 0xFF00);
					do {
						var13++;
						if (!arg0 || var15 < this.field951[var13]) {
							int var67 = arg2[var13];
							if (arg1) {
								arg2[var13] = (var54 | var67 >> 24) << 24 | ((var67 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var67 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var66;
							} else {
								arg2[var13] = ((var67 & 0xFF00) * var53 >> 8 & 0xFF00) + ((var67 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + var66;
							}
						}
						var15 += arg11;
						var64--;
					} while (var64 > 0);
				}
			}
		} else {
			int var68 = arg7 - arg6;
			if (this.field935 == 0) {
				do {
					var13++;
					if (!arg0 || var15 < this.field951[var13]) {
						arg2[var13] = Statics.field8149[(int) var14 & 0xFFFF];
					}
					var15 += arg11;
					var14 += arg9;
					var68--;
				} while (var68 > 0);
			} else {
				int var69 = this.field935;
				int var70 = 256 - this.field935;
				do {
					var13++;
					if (!arg0 || var15 < this.field951[var13]) {
						int var71 = Statics.field8149[(int) var14 & 0xFFFF];
						int var72 = ((var71 & 0xFF00FF) * var70 >> 8 & 0xFF00FF) + ((var71 & 0xFF00) * var70 >> 8 & 0xFF00);
						int var73 = arg2[var13];
						if (arg1) {
							arg2[var13] = (var70 | var73 >> 24) << 24 | ((var73 & 0xFF00) * var69 >> 8 & 0xFF00) + ((var73 & 0xFF00FF) * var69 >> 8 & 0xFF00FF) + var72;
						} else {
							arg2[var13] = ((var73 & 0xFF00) * var69 >> 8 & 0xFF00) + ((var73 & 0xFF00FF) * var69 >> 8 & 0xFF00FF) + var72;
						}
					}
					var14 += arg9;
					var15 += arg11;
					var68--;
				} while (var68 > 0);
			}
		}
	}

	@ObfuscatedName("bd.w(ZZZFFFFFFFFFIII)V")
	public final void method1030(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, int arg12, int arg13, int arg14) {
		if (!arg0) {
			this.method1032(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.field940) {
			this.field947.method2374((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12 | 0xFF000000);
			this.field947.method2374((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12 | 0xFF000000);
			this.field947.method2374((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12 | 0xFF000000);
		} else {
			float var16 = arg7 - arg6;
			float var17 = arg4 - arg3;
			float var18 = arg8 - arg6;
			float var19 = arg5 - arg3;
			float var20 = arg10 - arg9;
			float var21 = arg11 - arg9;
			float var22 = (float) ((arg13 & 0xFF0000) - (arg12 & 0xFF0000));
			float var23 = (float) ((arg14 & 0xFF0000) - (arg12 & 0xFF0000));
			float var24 = (float) ((arg13 & 0xFF00) - (arg12 & 0xFF00));
			float var25 = (float) ((arg14 & 0xFF00) - (arg12 & 0xFF00));
			float var26 = (float) ((arg13 & 0xFF) - (arg12 & 0xFF));
			float var27 = (float) ((arg14 & 0xFF) - (arg12 & 0xFF));
			float var28;
			if (arg4 == arg5) {
				var28 = 0.0F;
			} else {
				var28 = (arg8 - arg7) / (arg5 - arg4);
			}
			float var29;
			if (arg3 == arg4) {
				var29 = 0.0F;
			} else {
				var29 = var16 / var17;
			}
			float var30;
			if (arg3 == arg5) {
				var30 = 0.0F;
			} else {
				var30 = var18 / var19;
			}
			float var31 = var16 * var19 - var17 * var18;
			if (var31 != 0.0F) {
				float var32 = (var19 * var20 - var17 * var21) / var31;
				float var33 = (var16 * var21 - var18 * var20) / var31;
				float var34 = (var19 * var22 - var17 * var23) / var31;
				float var35 = (var16 * var23 - var18 * var22) / var31;
				float var36 = (var19 * var24 - var17 * var25) / var31;
				float var37 = (var16 * var25 - var18 * var24) / var31;
				float var38 = (var19 * var26 - var17 * var27) / var31;
				float var39 = (var16 * var27 - var18 * var26) / var31;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.field946)) {
						if (arg4 > (float) this.field946) {
							arg4 = this.field946;
						}
						if (arg5 > (float) this.field946) {
							arg5 = this.field946;
						}
						float var40 = arg9 - arg6 * var32 + var32;
						float var41 = (float) (arg12 & 0xFF0000) - arg6 * var34 + var34;
						float var42 = (float) (arg12 & 0xFF00) - arg6 * var36 + var36;
						float var43 = (float) (arg12 & 0xFF) - arg6 * var38 + var38;
						if (arg4 < arg5) {
							float var44 = arg6;
							if (arg3 < 0.0F) {
								var44 = arg6 - arg3 * var30;
								arg6 -= arg3 * var29;
								var40 -= arg3 * var33;
								var41 -= arg3 * var35;
								var42 -= arg3 * var37;
								var43 -= arg3 * var39;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= arg4 * var28;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && var30 < var29 || arg3 == arg4 && var30 > var28) {
								float var45 = (float) (arg3 + 0.5F);
								float var46 = (float) (arg4 + 0.5F);
								float var47 = (float) (arg5 + 0.5F) - var46;
								float var48 = var46 - var45;
								float var49 = (float) this.field938[(int) var45];
								while (--var48 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var49, 0, 0, (int) var44, (int) arg6, var40, var32, var41, var34, var42, var36, var43, var38);
									var44 += var30;
									arg6 += var29;
									var40 += var33;
									var41 += var35;
									var42 += var37;
									var43 += var39;
									var49 += this.field949;
								}
								while (--var47 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var49, 0, 0, (int) var44, (int) arg7, var40, var32, var41, var34, var42, var36, var43, var38);
									var44 += var30;
									arg7 += var28;
									var40 += var33;
									var41 += var35;
									var42 += var37;
									var43 += var39;
									var49 += this.field949;
								}
							} else {
								float var50 = (float) (arg3 + 0.5F);
								float var51 = (float) (arg4 + 0.5F);
								float var52 = (float) (arg5 + 0.5F) - var51;
								float var53 = var51 - var50;
								float var54 = (float) this.field938[(int) var50];
								while (--var53 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var54, 0, 0, (int) arg6, (int) var44, var40, var32, var41, var34, var42, var36, var43, var38);
									var44 += var30;
									arg6 += var29;
									var40 += var33;
									var41 += var35;
									var42 += var37;
									var43 += var39;
									var54 += this.field949;
								}
								while (--var52 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var54, 0, 0, (int) arg7, (int) var44, var40, var32, var41, var34, var42, var36, var43, var38);
									var44 += var30;
									arg7 += var28;
									var40 += var33;
									var41 += var35;
									var42 += var37;
									var43 += var39;
									var54 += this.field949;
								}
							}
						} else {
							float var55 = arg6;
							if (arg3 < 0.0F) {
								var55 = arg6 - arg3 * var30;
								arg6 -= arg3 * var29;
								var40 -= arg3 * var33;
								var41 -= arg3 * var35;
								var42 -= arg3 * var37;
								var43 -= arg3 * var39;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= arg5 * var28;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && var30 < var29 || arg3 == arg5 && var28 > var29) {
								float var56 = (float) (arg3 + 0.5F);
								float var57 = (float) (arg5 + 0.5F);
								float var58 = (float) (arg4 + 0.5F) - var57;
								float var59 = var57 - var56;
								float var60 = (float) this.field938[(int) var56];
								while (--var59 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var60, 0, 0, (int) var55, (int) arg6, var40, var32, var41, var34, var42, var36, var43, var38);
									var55 += var30;
									arg6 += var29;
									var40 += var33;
									var41 += var35;
									var42 += var37;
									var43 += var39;
									var60 += this.field949;
								}
								while (--var58 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var60, 0, 0, (int) arg8, (int) arg6, var40, var32, var41, var34, var42, var36, var43, var38);
									arg8 += var28;
									arg6 += var29;
									var40 += var33;
									var41 += var35;
									var42 += var37;
									var43 += var39;
									var60 += this.field949;
								}
							} else {
								float var61 = (float) (arg3 + 0.5F);
								float var62 = (float) (arg5 + 0.5F);
								float var63 = (float) (arg4 + 0.5F) - var62;
								float var64 = var62 - var61;
								float var65 = (float) this.field938[(int) var61];
								while (--var64 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var65, 0, 0, (int) arg6, (int) var55, var40, var32, var41, var34, var42, var36, var43, var38);
									var55 += var30;
									arg6 += var29;
									var40 += var33;
									var41 += var35;
									var42 += var37;
									var43 += var39;
									var65 += this.field949;
								}
								while (--var63 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var65, 0, 0, (int) arg6, (int) arg8, var40, var32, var41, var34, var42, var36, var43, var38);
									arg8 += var28;
									arg6 += var29;
									var40 += var33;
									var41 += var35;
									var42 += var37;
									var43 += var39;
									var65 += this.field949;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.field946)) {
						if (arg5 > (float) this.field946) {
							arg5 = this.field946;
						}
						if (arg3 > (float) this.field946) {
							arg3 = this.field946;
						}
						float var66 = arg10 - arg7 * var32 + var32;
						float var67 = (float) (arg13 & 0xFF0000) - arg7 * var34 + var34;
						float var68 = (float) (arg13 & 0xFF00) - arg7 * var36 + var36;
						float var69 = (float) (arg13 & 0xFF) - arg7 * var38 + var38;
						if (arg5 < arg3) {
							float var70 = arg7;
							if (arg4 < 0.0F) {
								var70 = arg7 - arg4 * var29;
								arg7 -= arg4 * var28;
								var66 -= arg4 * var33;
								var67 -= arg4 * var35;
								var68 -= arg4 * var37;
								var69 -= arg4 * var39;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= arg5 * var30;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && var29 < var28 || arg4 == arg5 && var29 > var30) {
								float var71 = (float) (arg4 + 0.5F);
								float var72 = (float) (arg5 + 0.5F);
								float var73 = (float) (arg3 + 0.5F) - var72;
								float var74 = var72 - var71;
								float var75 = (float) this.field938[(int) var71];
								while (--var74 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var75, 0, 0, (int) var70, (int) arg7, var66, var32, var67, var34, var68, var36, var69, var38);
									var70 += var29;
									arg7 += var28;
									var66 += var33;
									var67 += var35;
									var68 += var37;
									var69 += var39;
									var75 += this.field949;
								}
								while (--var73 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var75, 0, 0, (int) var70, (int) arg8, var66, var32, var67, var34, var68, var36, var69, var38);
									var70 += var29;
									arg8 += var30;
									var66 += var33;
									var67 += var35;
									var68 += var37;
									var69 += var39;
									var75 += this.field949;
								}
							} else {
								float var76 = (float) (arg4 + 0.5F);
								float var77 = (float) (arg5 + 0.5F);
								float var78 = (float) (arg3 + 0.5F) - var77;
								float var79 = var77 - var76;
								float var80 = (float) this.field938[(int) var76];
								while (--var79 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var80, 0, 0, (int) arg7, (int) var70, var66, var32, var67, var34, var68, var36, var69, var38);
									var70 += var29;
									arg7 += var28;
									var66 += var33;
									var67 += var35;
									var68 += var37;
									var69 += var39;
									var80 += this.field949;
								}
								while (--var78 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var80, 0, 0, (int) arg8, (int) var70, var66, var32, var67, var34, var68, var36, var69, var38);
									var70 += var29;
									arg8 += var30;
									var66 += var33;
									var67 += var35;
									var68 += var37;
									var69 += var39;
									var80 += this.field949;
								}
							}
						} else {
							float var81 = arg7;
							if (arg4 < 0.0F) {
								var81 = arg7 - arg4 * var29;
								arg7 -= arg4 * var28;
								var66 -= arg4 * var33;
								var67 -= arg4 * var35;
								var68 -= arg4 * var37;
								var69 -= arg4 * var39;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= arg3 * var30;
								arg3 = 0.0F;
							}
							if (var29 < var28) {
								float var82 = (float) (arg4 + 0.5F);
								float var83 = (float) (arg3 + 0.5F);
								float var84 = (float) (arg5 + 0.5F) - var83;
								float var85 = var83 - var82;
								float var86 = (float) this.field938[(int) var82];
								while (--var85 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var86, 0, 0, (int) var81, (int) arg7, var66, var32, var67, var34, var68, var36, var69, var38);
									var81 += var29;
									arg7 += var28;
									var66 += var33;
									var67 += var35;
									var68 += var37;
									var69 += var39;
									var86 += this.field949;
								}
								while (--var84 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var86, 0, 0, (int) arg6, (int) arg7, var66, var32, var67, var34, var68, var36, var69, var38);
									arg6 += var30;
									arg7 += var28;
									var66 += var33;
									var67 += var35;
									var68 += var37;
									var69 += var39;
									var86 += this.field949;
								}
							} else {
								float var87 = (float) (arg4 + 0.5F);
								float var88 = (float) (arg3 + 0.5F);
								float var89 = (float) (arg5 + 0.5F) - var88;
								float var90 = var88 - var87;
								float var91 = (float) this.field938[(int) var87];
								while (--var90 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var91, 0, 0, (int) arg7, (int) var81, var66, var32, var67, var34, var68, var36, var69, var38);
									var81 += var29;
									arg7 += var28;
									var66 += var33;
									var67 += var35;
									var68 += var37;
									var69 += var39;
									var91 += this.field949;
								}
								while (--var89 >= 0.0F) {
									this.method1031(arg1, arg2, this.field950, (int) var91, 0, 0, (int) arg7, (int) arg6, var66, var32, var67, var34, var68, var36, var69, var38);
									arg6 += var30;
									arg7 += var28;
									var66 += var33;
									var67 += var35;
									var68 += var37;
									var69 += var39;
									var91 += this.field949;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.field946)) {
					if (arg3 > (float) this.field946) {
						arg3 = this.field946;
					}
					if (arg4 > (float) this.field946) {
						arg4 = this.field946;
					}
					float var92 = arg11 - arg8 * var32 + var32;
					float var93 = (float) (arg14 & 0xFF0000) - arg8 * var34 + var34;
					float var94 = (float) (arg14 & 0xFF00) - arg8 * var36 + var36;
					float var95 = (float) (arg14 & 0xFF) - arg8 * var38 + var38;
					if (arg3 < arg4) {
						float var96 = arg8;
						if (arg5 < 0.0F) {
							var96 = arg8 - arg5 * var28;
							arg8 -= arg5 * var30;
							var92 -= arg5 * var33;
							var93 -= arg5 * var35;
							var94 -= arg5 * var37;
							var95 -= arg5 * var39;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= arg3 * var29;
							arg3 = 0.0F;
						}
						if (var28 < var30) {
							float var97 = (float) (arg5 + 0.5F);
							float var98 = (float) (arg3 + 0.5F);
							float var99 = (float) (arg4 + 0.5F) - var98;
							float var100 = var98 - var97;
							float var101 = (float) this.field938[(int) var97];
							while (--var100 >= 0.0F) {
								this.method1031(arg1, arg2, this.field950, (int) var101, 0, 0, (int) var96, (int) arg8, var92, var32, var93, var34, var94, var36, var95, var38);
								var96 += var28;
								arg8 += var30;
								var92 += var33;
								var93 += var35;
								var94 += var37;
								var95 += var39;
								var101 += this.field949;
							}
							while (--var99 >= 0.0F) {
								this.method1031(arg1, arg2, this.field950, (int) var101, 0, 0, (int) var96, (int) arg6, var92, var32, var93, var34, var94, var36, var95, var38);
								var96 += var28;
								arg6 += var29;
								var92 += var33;
								var93 += var35;
								var94 += var37;
								var95 += var39;
								var101 += this.field949;
							}
						} else {
							float var102 = (float) (arg5 + 0.5F);
							float var103 = (float) (arg3 + 0.5F);
							float var104 = (float) (arg4 + 0.5F) - var103;
							float var105 = var103 - var102;
							float var106 = (float) this.field938[(int) var102];
							while (--var105 >= 0.0F) {
								this.method1031(arg1, arg2, this.field950, (int) var106, 0, 0, (int) arg8, (int) var96, var92, var32, var93, var34, var94, var36, var95, var38);
								var96 += var28;
								arg8 += var30;
								var92 += var33;
								var93 += var35;
								var94 += var37;
								var95 += var39;
								var106 += this.field949;
							}
							while (--var104 >= 0.0F) {
								this.method1031(arg1, arg2, this.field950, (int) var106, 0, 0, (int) arg6, (int) var96, var92, var32, var93, var34, var94, var36, var95, var38);
								var96 += var28;
								arg6 += var29;
								var92 += var33;
								var93 += var35;
								var94 += var37;
								var95 += var39;
								var106 += this.field949;
							}
						}
					} else {
						float var107 = arg8;
						if (arg5 < 0.0F) {
							var107 = arg8 - arg5 * var28;
							arg8 -= arg5 * var30;
							var92 -= arg5 * var33;
							var93 -= arg5 * var35;
							var94 -= arg5 * var37;
							var95 -= arg5 * var39;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= arg4 * var29;
							arg4 = 0.0F;
						}
						if (var28 < var30) {
							float var108 = (float) (arg5 + 0.5F);
							float var109 = (float) (arg4 + 0.5F);
							float var110 = (float) (arg3 + 0.5F) - var109;
							float var111 = var109 - var108;
							float var112 = (float) this.field938[(int) var108];
							while (--var111 >= 0.0F) {
								this.method1031(arg1, arg2, this.field950, (int) var112, 0, 0, (int) var107, (int) arg8, var92, var32, var93, var34, var94, var36, var95, var38);
								var107 += var28;
								arg8 += var30;
								var92 += var33;
								var93 += var35;
								var94 += var37;
								var95 += var39;
								var112 += this.field949;
							}
							while (--var110 >= 0.0F) {
								this.method1031(arg1, arg2, this.field950, (int) var112, 0, 0, (int) arg7, (int) arg8, var92, var32, var93, var34, var94, var36, var95, var38);
								arg7 += var29;
								arg8 += var30;
								var92 += var33;
								var93 += var35;
								var94 += var37;
								var95 += var39;
								var112 += this.field949;
							}
						} else {
							float var113 = (float) (arg5 + 0.5F);
							float var114 = (float) (arg4 + 0.5F);
							float var115 = (float) (arg3 + 0.5F) - var114;
							float var116 = var114 - var113;
							float var117 = (float) this.field938[(int) var113];
							while (--var116 >= 0.0F) {
								this.method1031(arg1, arg2, this.field950, (int) var117, 0, 0, (int) arg8, (int) var107, var92, var32, var93, var34, var94, var36, var95, var38);
								var107 += var28;
								arg8 += var30;
								var92 += var33;
								var93 += var35;
								var94 += var37;
								var95 += var39;
								var117 += this.field949;
							}
							while (--var115 >= 0.0F) {
								this.method1031(arg1, arg2, this.field950, (int) var117, 0, 0, (int) arg8, (int) arg7, var92, var32, var93, var34, var94, var36, var95, var38);
								arg7 += var29;
								arg8 += var30;
								var92 += var33;
								var93 += var35;
								var94 += var37;
								var95 += var39;
								var117 += this.field949;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bd.l(ZZ[IIIIIIFFFFFFFF)V")
	public final void method1031(boolean arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15) {
		if (this.field936) {
			if (arg7 > this.field945) {
				arg7 = this.field945;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		if (this.field937) {
			int var17 = arg3 + arg6;
			float var18 = (float) arg6 * arg11 + arg10;
			float var19 = (float) arg6 * arg13 + arg12;
			float var20 = (float) arg6 * arg15 + arg14;
			if (this.field933) {
				int var21 = arg7 - arg6 >> 2;
				float var22 = arg11 * 4.0F;
				float var23 = arg13 * 4.0F;
				float var24 = arg15 * 4.0F;
				if (this.field935 == 0) {
					if (var21 > 0) {
						do {
							int var25 = (int) var18 & 0xFF0000 | 0xFF000000 | (int) var19 & 0xFF00 | (int) var20 & 0xFF;
							var18 += var22;
							var19 += var23;
							var20 += var24;
							arg2[var17++] = var25;
							arg2[var17++] = var25;
							arg2[var17++] = var25;
							arg2[var17++] = var25;
							var21--;
						} while (var21 > 0);
					}
					int var26 = arg7 - arg6 & 0x3;
					if (var26 > 0) {
						int var27 = (int) var18 & 0xFF0000 | 0xFF000000 | (int) var19 & 0xFF00 | (int) var20 & 0xFF;
						do {
							arg2[var17++] = var27;
							var26--;
						} while (var26 > 0);
					}
				} else if (this.field968) {
					if (var21 > 0) {
						do {
							int var43 = (int) var18 & 0xFF0000 | (int) var19 & 0xFF00 | (int) var20 & 0xFF;
							var18 += var22;
							var19 += var23;
							var20 += var24;
							int var45 = var17++;
							int var47 = arg2[var45];
							int var48 = var43 + var47;
							int var49 = (var43 & 0xFF00FF) + (var47 & 0xFF00FF);
							int var50 = (var48 - var49 & 0x10000) + (var49 & 0x1000100);
							arg2[var45] = var48 - var50 | 0xFF000000 | var50 - (var50 >>> 8);
							int var52 = var17++;
							int var54 = arg2[var52];
							int var55 = var43 + var54;
							int var56 = (var43 & 0xFF00FF) + (var54 & 0xFF00FF);
							int var57 = (var55 - var56 & 0x10000) + (var56 & 0x1000100);
							arg2[var52] = var55 - var57 | 0xFF000000 | var57 - (var57 >>> 8);
							int var59 = var17++;
							int var61 = arg2[var59];
							int var62 = var43 + var61;
							int var63 = (var43 & 0xFF00FF) + (var61 & 0xFF00FF);
							int var64 = (var62 - var63 & 0x10000) + (var63 & 0x1000100);
							arg2[var59] = var62 - var64 | 0xFF000000 | var64 - (var64 >>> 8);
							int var66 = var17++;
							int var68 = arg2[var66];
							int var69 = var43 + var68;
							int var70 = (var43 & 0xFF00FF) + (var68 & 0xFF00FF);
							int var71 = (var69 - var70 & 0x10000) + (var70 & 0x1000100);
							arg2[var66] = var69 - var71 | 0xFF000000 | var71 - (var71 >>> 8);
							var21--;
						} while (var21 > 0);
					}
					int var72 = arg7 - arg6 & 0x3;
					if (var72 > 0) {
						int var73 = (int) var18 & 0xFF0000 | (int) var19 & 0xFF00 | (int) var20 & 0xFF;
						do {
							int var75 = var17++;
							int var77 = arg2[var75];
							int var78 = var73 + var77;
							int var79 = (var73 & 0xFF00FF) + (var77 & 0xFF00FF);
							int var80 = (var78 - var79 & 0x10000) + (var79 & 0x1000100);
							arg2[var75] = var78 - var80 | 0xFF000000 | var80 - (var80 >>> 8);
							var72--;
						} while (var72 > 0);
					}
				} else {
					int var28 = this.field935;
					int var29 = 256 - this.field935;
					if (var21 > 0) {
						do {
							int var30 = (int) var18 & 0xFF0000 | 0xFF000000 | (int) var19 & 0xFF00 | (int) var20 & 0xFF;
							var18 += var22;
							var19 += var23;
							var20 += var24;
							int var31 = ((var30 & 0xFF00FF) * var29 >> 8 & 0xFF00FF) + ((var30 & 0xFF00) * var29 >> 8 & 0xFF00);
							int var32 = arg2[var17];
							if (arg1) {
								arg2[var17++] = (var29 | var32 >> 24) << 24 | ((var32 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var31;
								int var33 = arg2[var17];
								arg2[var17++] = (var29 | var33 >> 24) << 24 | ((var33 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var33 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var31;
								int var34 = arg2[var17];
								arg2[var17++] = (var29 | var34 >> 24) << 24 | ((var34 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var34 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var31;
								int var35 = arg2[var17];
								arg2[var17++] = (var29 | var35 >> 24) << 24 | ((var35 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var35 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var31;
							} else {
								arg2[var17++] = ((var32 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var31;
								int var36 = arg2[var17];
								arg2[var17++] = ((var36 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var36 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var31;
								int var37 = arg2[var17];
								arg2[var17++] = ((var37 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var37 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var31;
								int var38 = arg2[var17];
								arg2[var17++] = ((var38 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var38 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var31;
							}
							var21--;
						} while (var21 > 0);
					}
					int var39 = arg7 - arg6 & 0x3;
					if (var39 > 0) {
						int var40 = (int) var18 & 0xFF0000 | 0xFF000000 | (int) var19 & 0xFF00 | (int) var20 & 0xFF;
						int var41 = ((var40 & 0xFF00FF) * var29 >> 8 & 0xFF00FF) + ((var40 & 0xFF00) * var29 >> 8 & 0xFF00);
						do {
							int var42 = arg2[var17];
							if (arg1) {
								arg2[var17++] = (var29 | var42 >> 24) << 24 | ((var42 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var42 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var41;
							} else {
								arg2[var17++] = ((var42 & 0xFF00) * var28 >> 8 & 0xFF00) + ((var42 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + var41;
							}
							var39--;
						} while (var39 > 0);
					}
				}
			} else {
				int var81 = arg7 - arg6;
				if (this.field935 == 0) {
					do {
						arg2[var17++] = (int) var18 & 0xFF0000 | 0xFF000000 | (int) var19 & 0xFF00 | (int) var20 & 0xFF;
						var18 += arg11;
						var19 += arg13;
						var20 += arg15;
						var81--;
					} while (var81 > 0);
				} else if (this.field968) {
					do {
						int var88 = var17++;
						int var89 = (int) var18 & 0xFF0000 | (int) var19 & 0xFF00 | (int) var20 & 0xFF;
						int var90 = arg2[var88];
						int var91 = var89 + var90;
						int var92 = (var89 & 0xFF00FF) + (var90 & 0xFF00FF);
						int var93 = (var91 - var92 & 0x10000) + (var92 & 0x1000100);
						arg2[var88] = var91 - var93 | 0xFF000000 | var93 - (var93 >>> 8);
						var18 += arg11;
						var19 += arg13;
						var20 += arg15;
						var81--;
					} while (var81 > 0);
				} else {
					int var82 = this.field935;
					int var83 = 256 - this.field935;
					do {
						int var84 = (int) var18 & 0xFF0000 | 0xFF000000 | (int) var19 & 0xFF00 | (int) var20 & 0xFF;
						var18 += arg11;
						var19 += arg13;
						var20 += arg15;
						int var85 = ((var84 & 0xFF00FF) * var83 >> 8 & 0xFF00FF) + ((var84 & 0xFF00) * var83 >> 8 & 0xFF00);
						int var86 = arg2[var17];
						if (arg1) {
							arg2[var17++] = (var83 | var86 >> 24) << 24 | ((var86 & 0xFF00) * var82 >> 8 & 0xFF00) + ((var86 & 0xFF00FF) * var82 >> 8 & 0xFF00FF) + var85;
						} else {
							arg2[var17++] = ((var86 & 0xFF00) * var82 >> 8 & 0xFF00) + ((var86 & 0xFF00FF) * var82 >> 8 & 0xFF00FF) + var85;
						}
						var81--;
					} while (var81 > 0);
				}
			}
			return;
		}
		int var94 = arg6 - 1 + arg3;
		float var95 = (float) arg6 * arg9 + arg8;
		float var96 = (float) arg6 * arg11 + arg10;
		float var97 = (float) arg6 * arg13 + arg12;
		float var98 = (float) arg6 * arg15 + arg14;
		if (this.field966.field834) {
			if (this.field933) {
				int var99 = arg7 - arg6 >> 2;
				float var100 = arg11 * 4.0F;
				float var101 = arg13 * 4.0F;
				float var102 = arg15 * 4.0F;
				if (this.field935 == 0) {
					if (var99 > 0) {
						do {
							int var103 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
							var96 += var100;
							var97 += var101;
							var98 += var102;
							var94++;
							if (!arg0 || var95 < this.field951[var94]) {
								arg2[var94] = var103;
								if (arg0) {
									this.field951[var94] = var95;
								}
							}
							float var104 = arg9 + var95;
							var94++;
							if (!arg0 || var104 < this.field951[var94]) {
								arg2[var94] = var103;
								if (arg0) {
									this.field951[var94] = var104;
								}
							}
							float var105 = arg9 + var104;
							var94++;
							if (!arg0 || var105 < this.field951[var94]) {
								arg2[var94] = var103;
								if (arg0) {
									this.field951[var94] = var105;
								}
							}
							float var106 = arg9 + var105;
							var94++;
							if (!arg0 || var106 < this.field951[var94]) {
								arg2[var94] = var103;
								if (arg0) {
									this.field951[var94] = var106;
								}
							}
							var95 = arg9 + var106;
							var99--;
						} while (var99 > 0);
					}
					int var107 = arg7 - arg6 & 0x3;
					if (var107 > 0) {
						int var108 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
						do {
							var94++;
							if (!arg0 || var95 < this.field951[var94]) {
								arg2[var94] = var108;
								if (arg0) {
									this.field951[var94] = var95;
								}
							}
							var95 += arg9;
							var107--;
						} while (var107 > 0);
					}
				} else if (this.field968) {
					if (var99 > 0) {
						do {
							int var124 = (int) var96 & 0xFF0000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
							var96 += var100;
							var97 += var101;
							var98 += var102;
							var94++;
							if (!arg0 || var95 < this.field951[var94]) {
								int var128 = arg2[var94];
								int var129 = var124 + var128;
								int var130 = (var124 & 0xFF00FF) + (var128 & 0xFF00FF);
								int var131 = (var129 - var130 & 0x10000) + (var130 & 0x1000100);
								arg2[var94] = var129 - var131 | 0xFF000000 | var131 - (var131 >>> 8);
								if (arg0) {
									this.field951[var94] = var95;
								}
							}
							float var132 = arg9 + var95;
							var94++;
							if (!arg0 || var132 < this.field951[var94]) {
								int var136 = arg2[var94];
								int var137 = var124 + var136;
								int var138 = (var124 & 0xFF00FF) + (var136 & 0xFF00FF);
								int var139 = (var137 - var138 & 0x10000) + (var138 & 0x1000100);
								arg2[var94] = var137 - var139 | 0xFF000000 | var139 - (var139 >>> 8);
								if (arg0) {
									this.field951[var94] = var132;
								}
							}
							float var140 = arg9 + var132;
							var94++;
							if (!arg0 || var140 < this.field951[var94]) {
								int var144 = arg2[var94];
								int var145 = var124 + var144;
								int var146 = (var124 & 0xFF00FF) + (var144 & 0xFF00FF);
								int var147 = (var145 - var146 & 0x10000) + (var146 & 0x1000100);
								arg2[var94] = var145 - var147 | 0xFF000000 | var147 - (var147 >>> 8);
								if (arg0) {
									this.field951[var94] = var140;
								}
							}
							float var148 = arg9 + var140;
							var94++;
							if (!arg0 || var148 < this.field951[var94]) {
								int var152 = arg2[var94];
								int var153 = var124 + var152;
								int var154 = (var124 & 0xFF00FF) + (var152 & 0xFF00FF);
								int var155 = (var153 - var154 & 0x10000) + (var154 & 0x1000100);
								arg2[var94] = var153 - var155 | 0xFF000000 | var155 - (var155 >>> 8);
								if (arg0) {
									this.field951[var94] = var148;
								}
							}
							var95 = arg9 + var148;
							var99--;
						} while (var99 > 0);
					}
					int var156 = arg7 - arg6 & 0x3;
					if (var156 > 0) {
						int var157 = (int) var96 & 0xFF0000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
						do {
							var94++;
							if (!arg0 || var95 < this.field951[var94]) {
								int var161 = arg2[var94];
								int var162 = var157 + var161;
								int var163 = (var157 & 0xFF00FF) + (var161 & 0xFF00FF);
								int var164 = (var162 - var163 & 0x10000) + (var163 & 0x1000100);
								arg2[var94] = var162 - var164 | 0xFF000000 | var164 - (var164 >>> 8);
								if (arg0) {
									this.field951[var94] = var95;
								}
							}
							var95 += arg9;
							var156--;
						} while (var156 > 0);
					}
				} else {
					int var109 = this.field935;
					int var110 = 256 - this.field935;
					if (var99 > 0) {
						do {
							int var111 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
							var96 += var100;
							var97 += var101;
							var98 += var102;
							int var112 = ((var111 & 0xFF00FF) * var110 >> 8 & 0xFF00FF) + ((var111 & 0xFF00) * var110 >> 8 & 0xFF00);
							var94++;
							if (!arg0 || var95 < this.field951[var94]) {
								int var113 = arg2[var94];
								if (arg1) {
									arg2[var94] = (var110 | var113 >> 24) << 24 | ((var113 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var113 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var112;
								} else {
									arg2[var94] = ((var113 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var113 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var112;
								}
								if (arg0) {
									this.field951[var94] = var95;
								}
							}
							float var114 = arg9 + var95;
							var94++;
							if (!arg0 || var114 < this.field951[var94]) {
								int var115 = arg2[var94];
								if (arg1) {
									arg2[var94] = (var110 | var115 >> 24) << 24 | ((var115 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var115 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var112;
								} else {
									arg2[var94] = ((var115 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var115 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var112;
								}
								if (arg0) {
									this.field951[var94] = var114;
								}
							}
							float var116 = arg9 + var114;
							var94++;
							if (!arg0 || var116 < this.field951[var94]) {
								int var117 = arg2[var94];
								if (arg1) {
									arg2[var94] = (var110 | var117 >> 24) << 24 | ((var117 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var117 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var112;
								} else {
									arg2[var94] = ((var117 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var117 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var112;
								}
								if (arg0) {
									this.field951[var94] = var116;
								}
							}
							float var118 = arg9 + var116;
							var94++;
							if (!arg0 || var118 < this.field951[var94]) {
								int var119 = arg2[var94];
								if (arg1) {
									arg2[var94] = (var110 | var119 >> 24) << 24 | ((var119 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var119 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var112;
								} else {
									arg2[var94] = ((var119 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var119 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var112;
								}
								if (arg0) {
									this.field951[var94] = var118;
								}
							}
							var95 = arg9 + var118;
							var99--;
						} while (var99 > 0);
					}
					int var120 = arg7 - arg6 & 0x3;
					if (var120 > 0) {
						int var121 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
						int var122 = ((var121 & 0xFF00FF) * var110 >> 8 & 0xFF00FF) + ((var121 & 0xFF00) * var110 >> 8 & 0xFF00);
						do {
							var94++;
							if (!arg0 || var95 < this.field951[var94]) {
								int var123 = arg2[var94];
								if (arg1) {
									arg2[var94] = (var110 | var123 >> 24) << 24 | ((var123 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var123 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var122;
								} else {
									arg2[var94] = ((var123 & 0xFF00) * var109 >> 8 & 0xFF00) + ((var123 & 0xFF00FF) * var109 >> 8 & 0xFF00FF) + var122;
								}
								if (arg0) {
									this.field951[var94] = var95;
								}
							}
							var95 += arg9;
							var120--;
						} while (var120 > 0);
					}
				}
			} else {
				int var165 = arg7 - arg6;
				if (this.field935 == 0) {
					do {
						var94++;
						if (!arg0 || var95 < this.field951[var94]) {
							arg2[var94] = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
							if (arg0) {
								this.field951[var94] = var95;
							}
						}
						var95 += arg9;
						var96 += arg11;
						var97 += arg13;
						var98 += arg15;
						var165--;
					} while (var165 > 0);
				} else if (this.field968) {
					do {
						var94++;
						if (!arg0 || var95 < this.field951[var94]) {
							int var173 = (int) var96 & 0xFF0000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
							int var174 = arg2[var94];
							int var175 = var173 + var174;
							int var176 = (var173 & 0xFF00FF) + (var174 & 0xFF00FF);
							int var177 = (var175 - var176 & 0x10000) + (var176 & 0x1000100);
							arg2[var94] = var175 - var177 | 0xFF000000 | var177 - (var177 >>> 8);
							if (arg0) {
								this.field951[var94] = var95;
							}
						}
						var95 += arg9;
						var96 += arg11;
						var97 += arg13;
						var98 += arg15;
						var165--;
					} while (var165 > 0);
				} else {
					int var166 = this.field935;
					int var167 = 256 - this.field935;
					do {
						var94++;
						if (!arg0 || var95 < this.field951[var94]) {
							int var168 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
							int var169 = ((var168 & 0xFF00FF) * var167 >> 8 & 0xFF00FF) + ((var168 & 0xFF00) * var167 >> 8 & 0xFF00);
							int var170 = arg2[var94];
							if (arg1) {
								arg2[var94] = (var167 | var170 >> 24) << 24 | ((var170 & 0xFF00) * var166 >> 8 & 0xFF00) + ((var170 & 0xFF00FF) * var166 >> 8 & 0xFF00FF) + var169;
							} else {
								arg2[var94] = ((var170 & 0xFF00) * var166 >> 8 & 0xFF00) + ((var170 & 0xFF00FF) * var166 >> 8 & 0xFF00FF) + var169;
							}
							if (arg0) {
								this.field951[var94] = var95;
							}
						}
						var95 += arg9;
						var96 += arg11;
						var97 += arg13;
						var98 += arg15;
						var165--;
					} while (var165 > 0);
				}
			}
		} else if (this.field933) {
			int var178 = arg7 - arg6 >> 2;
			float var179 = arg11 * 4.0F;
			float var180 = arg13 * 4.0F;
			float var181 = arg15 * 4.0F;
			if (this.field935 == 0) {
				if (var178 > 0) {
					do {
						int var182 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
						var96 += var179;
						var97 += var180;
						var98 += var181;
						var94++;
						if (!arg0 || var95 < this.field951[var94]) {
							arg2[var94] = var182;
						}
						float var183 = arg9 + var95;
						var94++;
						if (!arg0 || var183 < this.field951[var94]) {
							arg2[var94] = var182;
						}
						float var184 = arg9 + var183;
						var94++;
						if (!arg0 || var184 < this.field951[var94]) {
							arg2[var94] = var182;
						}
						float var185 = arg9 + var184;
						var94++;
						if (!arg0 || var185 < this.field951[var94]) {
							arg2[var94] = var182;
						}
						var95 = arg9 + var185;
						var178--;
					} while (var178 > 0);
				}
				int var186 = arg7 - arg6 & 0x3;
				if (var186 > 0) {
					int var187 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
					do {
						var94++;
						if (!arg0 || var95 < this.field951[var94]) {
							arg2[var94] = var187;
						}
						var95 += arg9;
						var186--;
					} while (var186 > 0);
				}
			} else if (this.field968) {
				if (var178 > 0) {
					do {
						int var203 = (int) var96 & 0xFF0000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
						var96 += var179;
						var97 += var180;
						var98 += var181;
						var94++;
						if (!arg0 || var95 < this.field951[var94]) {
							int var207 = arg2[var94];
							int var208 = var203 + var207;
							int var209 = (var203 & 0xFF00FF) + (var207 & 0xFF00FF);
							int var210 = (var208 - var209 & 0x10000) + (var209 & 0x1000100);
							arg2[var94] = var208 - var210 | 0xFF000000 | var210 - (var210 >>> 8);
						}
						float var211 = arg9 + var95;
						var94++;
						if (!arg0 || var211 < this.field951[var94]) {
							int var215 = arg2[var94];
							int var216 = var203 + var215;
							int var217 = (var203 & 0xFF00FF) + (var215 & 0xFF00FF);
							int var218 = (var216 - var217 & 0x10000) + (var217 & 0x1000100);
							arg2[var94] = var216 - var218 | 0xFF000000 | var218 - (var218 >>> 8);
						}
						float var219 = arg9 + var211;
						var94++;
						if (!arg0 || var219 < this.field951[var94]) {
							int var223 = arg2[var94];
							int var224 = var203 + var223;
							int var225 = (var203 & 0xFF00FF) + (var223 & 0xFF00FF);
							int var226 = (var224 - var225 & 0x10000) + (var225 & 0x1000100);
							arg2[var94] = var224 - var226 | 0xFF000000 | var226 - (var226 >>> 8);
						}
						float var227 = arg9 + var219;
						var94++;
						if (!arg0 || var227 < this.field951[var94]) {
							int var231 = arg2[var94];
							int var232 = var203 + var231;
							int var233 = (var203 & 0xFF00FF) + (var231 & 0xFF00FF);
							int var234 = (var232 - var233 & 0x10000) + (var233 & 0x1000100);
							arg2[var94] = var232 - var234 | 0xFF000000 | var234 - (var234 >>> 8);
						}
						var95 = arg9 + var227;
						var178--;
					} while (var178 > 0);
				}
				int var235 = arg7 - arg6 & 0x3;
				if (var235 > 0) {
					int var236 = (int) var96 & 0xFF0000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
					do {
						var94++;
						if (!arg0 || var95 < this.field951[var94]) {
							int var240 = arg2[var94];
							int var241 = var236 + var240;
							int var242 = (var236 & 0xFF00FF) + (var240 & 0xFF00FF);
							int var243 = (var241 - var242 & 0x10000) + (var242 & 0x1000100);
							arg2[var94] = var241 - var243 | 0xFF000000 | var243 - (var243 >>> 8);
						}
						var95 += arg9;
						var235--;
					} while (var235 > 0);
				}
			} else {
				int var188 = this.field935;
				int var189 = 256 - this.field935;
				if (var178 > 0) {
					do {
						int var190 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
						var96 += var179;
						var97 += var180;
						var98 += var181;
						int var191 = ((var190 & 0xFF00FF) * var189 >> 8 & 0xFF00FF) + ((var190 & 0xFF00) * var189 >> 8 & 0xFF00);
						var94++;
						if (!arg0 || var95 < this.field951[var94]) {
							int var192 = arg2[var94];
							if (arg1) {
								arg2[var94] = (var189 | var192 >> 24) << 24 | ((var192 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var192 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var191;
							} else {
								arg2[var94] = ((var192 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var192 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var191;
							}
						}
						float var193 = arg9 + var95;
						var94++;
						if (!arg0 || var193 < this.field951[var94]) {
							int var194 = arg2[var94];
							if (arg1) {
								arg2[var94] = (var189 | var194 >> 24) << 24 | ((var194 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var194 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var191;
							} else {
								arg2[var94] = ((var194 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var194 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var191;
							}
						}
						float var195 = arg9 + var193;
						var94++;
						if (!arg0 || var195 < this.field951[var94]) {
							int var196 = arg2[var94];
							if (arg1) {
								arg2[var94] = (var189 | var196 >> 24) << 24 | ((var196 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var196 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var191;
							} else {
								arg2[var94] = ((var196 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var196 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var191;
							}
						}
						float var197 = arg9 + var195;
						var94++;
						if (!arg0 || var197 < this.field951[var94]) {
							int var198 = arg2[var94];
							if (arg1) {
								arg2[var94] = (var189 | var198 >> 24) << 24 | ((var198 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var198 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var191;
							} else {
								arg2[var94] = ((var198 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var198 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var191;
							}
						}
						var95 = arg9 + var197;
						var178--;
					} while (var178 > 0);
				}
				int var199 = arg7 - arg6 & 0x3;
				if (var199 > 0) {
					int var200 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
					int var201 = ((var200 & 0xFF00FF) * var189 >> 8 & 0xFF00FF) + ((var200 & 0xFF00) * var189 >> 8 & 0xFF00);
					do {
						var94++;
						if (!arg0 || var95 < this.field951[var94]) {
							int var202 = arg2[var94];
							if (arg1) {
								arg2[var94] = (var189 | var202 >> 24) << 24 | ((var202 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var202 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var201;
							} else {
								arg2[var94] = ((var202 & 0xFF00) * var188 >> 8 & 0xFF00) + ((var202 & 0xFF00FF) * var188 >> 8 & 0xFF00FF) + var201;
							}
						}
						var95 += arg9;
						var199--;
					} while (var199 > 0);
				}
			}
		} else {
			int var244 = arg7 - arg6;
			if (this.field935 == 0) {
				do {
					var94++;
					if (!arg0 || var95 < this.field951[var94]) {
						arg2[var94] = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
					}
					var95 += arg9;
					var96 += arg11;
					var97 += arg13;
					var98 += arg15;
					var244--;
				} while (var244 > 0);
			} else if (this.field968) {
				do {
					var94++;
					if (!arg0 || var95 < this.field951[var94]) {
						int var252 = (int) var96 & 0xFF0000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
						int var253 = arg2[var94];
						int var254 = var252 + var253;
						int var255 = (var252 & 0xFF00FF) + (var253 & 0xFF00FF);
						int var256 = (var254 - var255 & 0x10000) + (var255 & 0x1000100);
						arg2[var94] = var254 - var256 | 0xFF000000 | var256 - (var256 >>> 8);
					}
					var95 += arg9;
					var96 += arg11;
					var97 += arg13;
					var98 += arg15;
					var244--;
				} while (var244 > 0);
			} else {
				int var245 = this.field935;
				int var246 = 256 - this.field935;
				do {
					var94++;
					if (!arg0 || var95 < this.field951[var94]) {
						int var247 = (int) var96 & 0xFF0000 | 0xFF000000 | (int) var97 & 0xFF00 | (int) var98 & 0xFF;
						int var248 = ((var247 & 0xFF00FF) * var246 >> 8 & 0xFF00FF) + ((var247 & 0xFF00) * var246 >> 8 & 0xFF00);
						int var249 = arg2[var94];
						if (arg1) {
							arg2[var94] = (var246 | var249 >> 24) << 24 | ((var249 & 0xFF00) * var245 >> 8 & 0xFF00) + ((var249 & 0xFF00FF) * var245 >> 8 & 0xFF00FF) + var248;
						} else {
							arg2[var94] = ((var249 & 0xFF00) * var245 >> 8 & 0xFF00) + ((var249 & 0xFF00FF) * var245 >> 8 & 0xFF00FF) + var248;
						}
					}
					var95 += arg9;
					var96 += arg11;
					var97 += arg13;
					var98 += arg15;
					var244--;
				} while (var244 > 0);
			}
		}
	}

	@ObfuscatedName("bd.u(ZZZFFFFFFFFFI)V")
	public final void method1032(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, int arg12) {
		if (this.field940) {
			this.field947.method2374((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12);
			this.field947.method2374((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12);
			this.field947.method2374((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12);
			return;
		}
		float var14 = arg7 - arg6;
		float var15 = arg4 - arg3;
		float var16 = arg8 - arg6;
		float var17 = arg5 - arg3;
		float var18 = arg10 - arg9;
		float var19 = arg11 - arg9;
		float var20 = 0.0F;
		if (arg3 != arg4) {
			var20 = (arg7 - arg6) / (arg4 - arg3);
		}
		float var21 = 0.0F;
		if (arg4 != arg5) {
			var21 = (arg8 - arg7) / (arg5 - arg4);
		}
		float var22 = 0.0F;
		if (arg3 != arg5) {
			var22 = (arg6 - arg8) / (arg3 - arg5);
		}
		float var23 = var14 * var17 - var15 * var16;
		if (var23 == 0.0F) {
			return;
		}
		float var24 = (var17 * var18 - var15 * var19) / var23;
		float var25 = (var14 * var19 - var16 * var18) / var23;
		if (arg3 <= arg4 && arg3 <= arg5) {
			if (!(arg3 >= (float) this.field946)) {
				if (arg4 > (float) this.field946) {
					arg4 = this.field946;
				}
				if (arg5 > (float) this.field946) {
					arg5 = this.field946;
				}
				float var26 = arg9 - arg6 * var24 + var24;
				if (arg4 < arg5) {
					float var27 = arg6;
					if (arg3 < 0.0F) {
						var27 = arg6 - arg3 * var22;
						arg6 -= arg3 * var20;
						var26 -= arg3 * var25;
						arg3 = 0.0F;
					}
					if (arg4 < 0.0F) {
						arg7 -= arg4 * var21;
						arg4 = 0.0F;
					}
					if (arg3 != arg4 && var22 < var20 || arg3 == arg4 && var22 > var21) {
						float var28 = (float) (arg3 + 0.5F);
						float var29 = (float) (arg4 + 0.5F);
						float var30 = (float) (arg5 + 0.5F) - var29;
						float var31 = var29 - var28;
						float var32 = (float) this.field938[(int) var28];
						while (--var31 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var32, arg12, 0, (int) var27, (int) arg6, var26, var24);
							var27 += var22;
							arg6 += var20;
							var26 += var25;
							var32 += this.field949;
						}
						while (--var30 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var32, arg12, 0, (int) var27, (int) arg7, var26, var24);
							var27 += var22;
							arg7 += var21;
							var26 += var25;
							var32 += this.field949;
						}
					} else {
						float var33 = (float) (arg3 + 0.5F);
						float var34 = (float) (arg4 + 0.5F);
						float var35 = (float) (arg5 + 0.5F) - var34;
						float var36 = var34 - var33;
						float var37 = (float) this.field938[(int) var33];
						while (--var36 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var37, arg12, 0, (int) arg6, (int) var27, var26, var24);
							var27 += var22;
							arg6 += var20;
							var26 += var25;
							var37 += this.field949;
						}
						while (--var35 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var37, arg12, 0, (int) arg7, (int) var27, var26, var24);
							var27 += var22;
							arg7 += var21;
							var26 += var25;
							var37 += this.field949;
						}
					}
				} else {
					float var38 = arg6;
					if (arg3 < 0.0F) {
						var38 = arg6 - arg3 * var22;
						arg6 -= arg3 * var20;
						var26 -= arg3 * var25;
						arg3 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= arg5 * var21;
						arg5 = 0.0F;
					}
					if ((arg3 == arg5 || !(var22 < var20)) && (arg3 != arg5 || !(var21 > var20))) {
						float var44 = (float) (arg3 + 0.5F);
						float var45 = (float) (arg5 + 0.5F);
						float var46 = (float) (arg4 + 0.5F) - var45;
						float var47 = var45 - var44;
						float var48 = (float) this.field938[(int) var44];
						while (--var47 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var48, arg12, 0, (int) arg6, (int) var38, var26, var24);
							var38 += var22;
							arg6 += var20;
							var26 += var25;
							var48 += this.field949;
						}
						while (--var46 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var48, arg12, 0, (int) arg6, (int) arg8, var26, var24);
							arg8 += var21;
							arg6 += var20;
							var26 += var25;
							var48 += this.field949;
						}
					} else {
						float var39 = (float) (arg3 + 0.5F);
						float var40 = (float) (arg5 + 0.5F);
						float var41 = (float) (arg4 + 0.5F) - var40;
						float var42 = var40 - var39;
						float var43 = (float) this.field938[(int) var39];
						while (--var42 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var43, arg12, 0, (int) var38, (int) arg6, var26, var24);
							var38 += var22;
							arg6 += var20;
							var26 += var25;
							var43 += this.field949;
						}
						while (--var41 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var43, arg12, 0, (int) arg8, (int) arg6, var26, var24);
							arg8 += var21;
							arg6 += var20;
							var26 += var25;
							var43 += this.field949;
						}
					}
				}
			}
		} else if (arg4 <= arg5) {
			if (!(arg4 >= (float) this.field946)) {
				if (arg5 > (float) this.field946) {
					arg5 = this.field946;
				}
				if (arg3 > (float) this.field946) {
					arg3 = this.field946;
				}
				float var49 = arg10 - arg7 * var24 + var24;
				if (arg5 < arg3) {
					float var50 = arg7;
					if (arg4 < 0.0F) {
						var50 = arg7 - arg4 * var20;
						arg7 -= arg4 * var21;
						var49 -= arg4 * var25;
						arg4 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= arg5 * var22;
						arg5 = 0.0F;
					}
					if (arg4 != arg5 && var20 < var21 || arg4 == arg5 && var20 > var22) {
						float var51 = (float) (arg4 + 0.5F);
						float var52 = (float) (arg5 + 0.5F);
						float var53 = (float) (arg3 + 0.5F) - var52;
						float var54 = var52 - var51;
						float var55 = (float) this.field938[(int) var51];
						while (--var54 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var55, arg12, 0, (int) var50, (int) arg7, var49, var24);
							var50 += var20;
							arg7 += var21;
							var49 += var25;
							var55 += this.field949;
						}
						while (--var53 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var55, arg12, 0, (int) var50, (int) arg8, var49, var24);
							var50 += var20;
							arg8 += var22;
							var49 += var25;
							var55 += this.field949;
						}
					} else {
						float var56 = (float) (arg4 + 0.5F);
						float var57 = (float) (arg5 + 0.5F);
						float var58 = (float) (arg3 + 0.5F) - var57;
						float var59 = var57 - var56;
						float var60 = (float) this.field938[(int) var56];
						while (--var59 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var60, arg12, 0, (int) arg7, (int) var50, var49, var24);
							var50 += var20;
							arg7 += var21;
							var49 += var25;
							var60 += this.field949;
						}
						while (--var58 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var60, arg12, 0, (int) arg8, (int) var50, var49, var24);
							var50 += var20;
							arg8 += var22;
							var49 += var25;
							var60 += this.field949;
						}
					}
				} else {
					float var61 = arg7;
					if (arg4 < 0.0F) {
						var61 = arg7 - arg4 * var20;
						arg7 -= arg4 * var21;
						var49 -= arg4 * var25;
						arg4 = 0.0F;
					}
					if (arg3 < 0.0F) {
						arg6 -= arg3 * var22;
						arg3 = 0.0F;
					}
					if (var20 < var21) {
						float var62 = (float) (arg4 + 0.5F);
						float var63 = (float) (arg3 + 0.5F);
						float var64 = (float) (arg5 + 0.5F) - var63;
						float var65 = var63 - var62;
						float var66 = (float) this.field938[(int) var62];
						while (--var65 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var66, arg12, 0, (int) var61, (int) arg7, var49, var24);
							var61 += var20;
							arg7 += var21;
							var49 += var25;
							var66 += this.field949;
						}
						while (--var64 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var66, arg12, 0, (int) arg6, (int) arg7, var49, var24);
							arg6 += var22;
							arg7 += var21;
							var49 += var25;
							var66 += this.field949;
						}
					} else {
						float var67 = (float) (arg4 + 0.5F);
						float var68 = (float) (arg3 + 0.5F);
						float var69 = (float) (arg5 + 0.5F) - var68;
						float var70 = var68 - var67;
						float var71 = (float) this.field938[(int) var67];
						while (--var70 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var71, arg12, 0, (int) arg7, (int) var61, var49, var24);
							var61 += var20;
							arg7 += var21;
							var49 += var25;
							var71 += this.field949;
						}
						while (--var69 >= 0.0F) {
							this.method1039(arg0, arg1, arg2, this.field950, (int) var71, arg12, 0, (int) arg7, (int) arg6, var49, var24);
							arg6 += var22;
							arg7 += var21;
							var49 += var25;
							var71 += this.field949;
						}
					}
				}
			}
		} else if (!(arg5 >= (float) this.field946)) {
			if (arg3 > (float) this.field946) {
				arg3 = this.field946;
			}
			if (arg4 > (float) this.field946) {
				arg4 = this.field946;
			}
			float var72 = arg11 - arg8 * var24 + var24;
			if (arg3 < arg4) {
				float var73 = arg8;
				if (arg5 < 0.0F) {
					var73 = arg8 - arg5 * var21;
					arg8 -= arg5 * var22;
					var72 -= arg5 * var25;
					arg5 = 0.0F;
				}
				if (arg3 < 0.0F) {
					arg6 -= arg3 * var20;
					arg3 = 0.0F;
				}
				if (var21 < var22) {
					float var74 = (float) (arg5 + 0.5F);
					float var75 = (float) (arg3 + 0.5F);
					float var76 = (float) (arg4 + 0.5F) - var75;
					float var77 = var75 - var74;
					float var78 = (float) this.field938[(int) var74];
					while (--var77 >= 0.0F) {
						this.method1039(arg0, arg1, arg2, this.field950, (int) var78, arg12, 0, (int) var73, (int) arg8, var72, var24);
						var73 += var21;
						arg8 += var22;
						var72 += var25;
						var78 += this.field949;
					}
					while (--var76 >= 0.0F) {
						this.method1039(arg0, arg1, arg2, this.field950, (int) var78, arg12, 0, (int) var73, (int) arg6, var72, var24);
						var73 += var21;
						arg6 += var20;
						var72 += var25;
						var78 += this.field949;
					}
				} else {
					float var79 = (float) (arg5 + 0.5F);
					float var80 = (float) (arg3 + 0.5F);
					float var81 = (float) (arg4 + 0.5F) - var80;
					float var82 = var80 - var79;
					float var83 = (float) this.field938[(int) var79];
					while (--var82 >= 0.0F) {
						this.method1039(arg0, arg1, arg2, this.field950, (int) var83, arg12, 0, (int) arg8, (int) var73, var72, var24);
						var73 += var21;
						arg8 += var22;
						var72 += var25;
						var83 += this.field949;
					}
					while (--var81 >= 0.0F) {
						this.method1039(arg0, arg1, arg2, this.field950, (int) var83, arg12, 0, (int) arg6, (int) var73, var72, var24);
						var73 += var21;
						arg6 += var20;
						var72 += var25;
						var83 += this.field949;
					}
				}
			} else {
				float var84 = arg8;
				if (arg5 < 0.0F) {
					var84 = arg8 - arg5 * var21;
					arg8 -= arg5 * var22;
					var72 -= arg5 * var25;
					arg5 = 0.0F;
				}
				if (arg4 < 0.0F) {
					arg7 -= arg4 * var20;
					arg4 = 0.0F;
				}
				if (var21 < var22) {
					float var85 = (float) (arg5 + 0.5F);
					float var86 = (float) (arg4 + 0.5F);
					float var87 = (float) (arg3 + 0.5F) - var86;
					float var88 = var86 - var85;
					float var89 = (float) this.field938[(int) var85];
					while (--var88 >= 0.0F) {
						this.method1039(arg0, arg1, arg2, this.field950, (int) var89, arg12, 0, (int) var84, (int) arg8, var72, var24);
						var84 += var21;
						arg8 += var22;
						var72 += var25;
						var89 += this.field949;
					}
					while (--var87 >= 0.0F) {
						this.method1039(arg0, arg1, arg2, this.field950, (int) var89, arg12, 0, (int) arg7, (int) arg8, var72, var24);
						arg7 += var20;
						arg8 += var22;
						var72 += var25;
						var89 += this.field949;
					}
				} else {
					float var90 = (float) (arg5 + 0.5F);
					float var91 = (float) (arg4 + 0.5F);
					float var92 = (float) (arg3 + 0.5F) - var91;
					float var93 = var91 - var90;
					float var94 = (float) this.field938[(int) var90];
					while (--var93 >= 0.0F) {
						this.method1039(arg0, arg1, arg2, this.field950, (int) var94, arg12, 0, (int) arg8, (int) var84, var72, var24);
						var84 += var21;
						arg8 += var22;
						var72 += var25;
						var94 += this.field949;
					}
					while (--var92 >= 0.0F) {
						this.method1039(arg0, arg1, arg2, this.field950, (int) var94, arg12, 0, (int) arg8, (int) arg7, var72, var24);
						arg7 += var20;
						arg8 += var22;
						var72 += var25;
						var94 += this.field949;
					}
				}
			}
		}
	}

	@ObfuscatedName("bd.z(ZZZ[IIIIIIFF)V")
	public final void method1039(boolean arg0, boolean arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10) {
		if (this.field936) {
			if (arg8 > this.field945) {
				arg8 = this.field945;
			}
			if (arg7 < 0) {
				arg7 = 0;
			}
		}
		if (arg7 >= arg8) {
			return;
		}
		int var12 = arg7 - 1 + arg4;
		int var13 = arg8 - arg7 >> 2;
		float var14 = (float) arg7 * arg10 + arg9;
		if (this.field966.field834) {
			if (this.field935 == 0) {
				while (true) {
					var13--;
					if (var13 < 0) {
						int var18 = arg8 - arg7 & 0x3;
						while (true) {
							var18--;
							if (var18 < 0) {
								return;
							}
							var12++;
							if (!arg1 || var14 < this.field951[var12]) {
								if (arg0) {
									arg3[var12] = arg5;
								}
								if (arg1) {
									this.field951[var12] = var14;
								}
							}
							var14 += arg10;
						}
					}
					var12++;
					if (!arg1 || var14 < this.field951[var12]) {
						if (arg0) {
							arg3[var12] = arg5;
						}
						if (arg1) {
							this.field951[var12] = var14;
						}
					}
					float var15 = arg10 + var14;
					var12++;
					if (!arg1 || var15 < this.field951[var12]) {
						if (arg0) {
							arg3[var12] = arg5;
						}
						if (arg1) {
							this.field951[var12] = var15;
						}
					}
					float var16 = arg10 + var15;
					var12++;
					if (!arg1 || var16 < this.field951[var12]) {
						if (arg0) {
							arg3[var12] = arg5;
						}
						if (arg1) {
							this.field951[var12] = var16;
						}
					}
					float var17 = arg10 + var16;
					var12++;
					if (!arg1 || var17 < this.field951[var12]) {
						if (arg0) {
							arg3[var12] = arg5;
						}
						if (arg1) {
							this.field951[var12] = var17;
						}
					}
					var14 = arg10 + var17;
				}
			} else if (this.field935 != 254) {
				int var23 = this.field935;
				int var24 = 256 - this.field935;
				int var25 = ((arg5 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * var24 >> 8 & 0xFF00);
				while (true) {
					var13--;
					if (var13 < 0) {
						int var33 = arg8 - arg7 & 0x3;
						while (true) {
							var33--;
							if (var33 < 0) {
								return;
							}
							var12++;
							if (!arg1 || var14 < this.field951[var12]) {
								if (arg0) {
									int var34 = arg3[var12];
									if (arg2) {
										arg3[var12] = (var24 | var34 >> 24) << 24 | ((var34 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var34 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
									} else {
										arg3[var12] = ((var34 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var34 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
									}
								}
								if (arg1) {
									this.field951[var12] = var14;
								}
							}
							var14 += arg10;
						}
					}
					var12++;
					if (!arg1 || var14 < this.field951[var12]) {
						if (arg0) {
							int var26 = arg3[var12];
							if (arg2) {
								arg3[var12] = (var24 | var26 >> 24) << 24 | ((var26 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var26 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
							} else {
								arg3[var12] = ((var26 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var26 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
							}
						}
						if (arg1) {
							this.field951[var12] = var14;
						}
					}
					float var27 = arg10 + var14;
					var12++;
					if (!arg1 || var27 < this.field951[var12]) {
						if (arg0) {
							int var28 = arg3[var12];
							if (arg2) {
								arg3[var12] = (var24 | var28 >> 24) << 24 | ((var28 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var28 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
							} else {
								arg3[var12] = ((var28 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var28 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
							}
						}
						if (arg1) {
							this.field951[var12] = var27;
						}
					}
					float var29 = arg10 + var27;
					var12++;
					if (!arg1 || var29 < this.field951[var12]) {
						if (arg0) {
							int var30 = arg3[var12];
							if (arg2) {
								arg3[var12] = (var24 | var30 >> 24) << 24 | ((var30 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var30 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
							} else {
								arg3[var12] = ((var30 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var30 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
							}
						}
						if (arg1) {
							this.field951[var12] = var29;
						}
					}
					float var31 = arg10 + var29;
					var12++;
					if (!arg1 || var31 < this.field951[var12]) {
						if (arg0) {
							int var32 = arg3[var12];
							if (arg2) {
								arg3[var12] = (var24 | var32 >> 24) << 24 | ((var32 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
							} else {
								arg3[var12] = ((var32 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var25;
							}
						}
						if (arg1) {
							this.field951[var12] = var31;
						}
					}
					var14 = arg10 + var31;
				}
			} else if (arg7 != 0 && arg8 <= this.field945 - 1) {
				while (true) {
					var13--;
					if (var13 < 0) {
						int var22 = arg8 - arg7 & 0x3;
						while (true) {
							var22--;
							if (var22 < 0) {
								return;
							}
							var12++;
							if ((!arg1 || var14 < this.field951[var12]) && arg0) {
								arg3[var12 - 1] = arg3[var12];
							}
							var14 += arg10;
						}
					}
					var12++;
					if ((!arg1 || var14 < this.field951[var12]) && arg0) {
						arg3[var12 - 1] = arg3[var12];
					}
					float var19 = arg10 + var14;
					var12++;
					if ((!arg1 || var19 < this.field951[var12]) && arg0) {
						arg3[var12 - 1] = arg3[var12];
					}
					float var20 = arg10 + var19;
					var12++;
					if ((!arg1 || var20 < this.field951[var12]) && arg0) {
						arg3[var12 - 1] = arg3[var12];
					}
					float var21 = arg10 + var20;
					var12++;
					if ((!arg1 || var21 < this.field951[var12]) && arg0) {
						arg3[var12 - 1] = arg3[var12];
					}
					var14 = arg10 + var21;
				}
			}
		} else if (arg0) {
			if (this.field935 == 0) {
				while (true) {
					var13--;
					if (var13 < 0) {
						int var38 = arg8 - arg7 & 0x3;
						while (true) {
							var38--;
							if (var38 < 0) {
								return;
							}
							var12++;
							if (!arg1 || var14 < this.field951[var12]) {
								arg3[var12] = arg5;
							}
							var14 += arg10;
						}
					}
					var12++;
					if (!arg1 || var14 < this.field951[var12]) {
						arg3[var12] = arg5;
					}
					float var35 = arg10 + var14;
					var12++;
					if (!arg1 || var35 < this.field951[var12]) {
						arg3[var12] = arg5;
					}
					float var36 = arg10 + var35;
					var12++;
					if (!arg1 || var36 < this.field951[var12]) {
						arg3[var12] = arg5;
					}
					float var37 = arg10 + var36;
					var12++;
					if (!arg1 || var37 < this.field951[var12]) {
						arg3[var12] = arg5;
					}
					var14 = arg10 + var37;
				}
			} else if (this.field935 != 254) {
				int var43 = this.field935;
				int var44 = 256 - this.field935;
				int var45 = ((arg5 & 0xFF00FF) * var44 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * var44 >> 8 & 0xFF00);
				while (true) {
					var13--;
					if (var13 < 0) {
						int var53 = arg8 - arg7 & 0x3;
						while (true) {
							var53--;
							if (var53 < 0) {
								return;
							}
							var12++;
							if (!arg1 || var14 < this.field951[var12]) {
								int var54 = arg3[var12];
								if (arg2) {
									arg3[var12] = (var44 | var54 >> 24) << 24 | ((var54 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var54 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
								} else {
									arg3[var12] = ((var54 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var54 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
								}
							}
							var14 += arg10;
						}
					}
					var12++;
					if (!arg1 || var14 < this.field951[var12]) {
						int var46 = arg3[var12];
						if (arg2) {
							arg3[var12] = (var44 | var46 >> 24) << 24 | ((var46 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var46 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
						} else {
							arg3[var12] = ((var46 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var46 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
						}
					}
					float var47 = arg10 + var14;
					var12++;
					if (!arg1 || var47 < this.field951[var12]) {
						int var48 = arg3[var12];
						if (arg2) {
							arg3[var12] = (var44 | var48 >> 24) << 24 | ((var48 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var48 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
						} else {
							arg3[var12] = ((var48 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var48 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
						}
					}
					float var49 = arg10 + var47;
					var12++;
					if (!arg1 || var49 < this.field951[var12]) {
						int var50 = arg3[var12];
						if (arg2) {
							arg3[var12] = (var44 | var50 >> 24) << 24 | ((var50 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var50 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
						} else {
							arg3[var12] = ((var50 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var50 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
						}
					}
					float var51 = arg10 + var49;
					var12++;
					if (!arg1 || var51 < this.field951[var12]) {
						int var52 = arg3[var12];
						if (arg2) {
							arg3[var12] = (var44 | var52 >> 24) << 24 | ((var52 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var52 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
						} else {
							arg3[var12] = ((var52 & 0xFF00) * var43 >> 8 & 0xFF00) + ((var52 & 0xFF00FF) * var43 >> 8 & 0xFF00FF) + var45;
						}
					}
					var14 = arg10 + var51;
				}
			} else if (arg7 != 0 && arg8 <= this.field945 - 1) {
				while (true) {
					var13--;
					if (var13 < 0) {
						int var42 = arg8 - arg7 & 0x3;
						while (true) {
							var42--;
							if (var42 < 0) {
								return;
							}
							var12++;
							if (!arg1 || var14 < this.field951[var12]) {
								arg3[var12 - 1] = arg3[var12];
							}
							var14 += arg10;
						}
					}
					var12++;
					if (!arg1 || var14 < this.field951[var12]) {
						arg3[var12 - 1] = arg3[var12];
					}
					float var39 = arg10 + var14;
					var12++;
					if (!arg1 || var39 < this.field951[var12]) {
						arg3[var12 - 1] = arg3[var12];
					}
					float var40 = arg10 + var39;
					var12++;
					if (!arg1 || var40 < this.field951[var12]) {
						arg3[var12 - 1] = arg3[var12];
					}
					float var41 = arg10 + var40;
					var12++;
					if (!arg1 || var41 < this.field951[var12]) {
						arg3[var12 - 1] = arg3[var12];
					}
					var14 = arg10 + var41;
				}
			}
		}
	}

	@ObfuscatedName("bd.p(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFI)V")
	public final void method1033(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, int arg21, int arg22, int arg23, int arg24, float arg25, float arg26, float arg27, int arg28) {
		if (!arg0) {
			this.method1032(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		int var30 = arg28 & 0xFFFF;
		if (this.field953 != var30) {
			this.field954 = this.field947.method15655(var30);
			if (this.field954 == null) {
				this.field953 = -1;
				this.field935 = 255 - (arg21 >> 24 & 0xFF);
				this.field959 = 0;
				int var31 = Statics.field8149[class662.method4937(this.field947.method15695(arg28)) & 0xFFFF];
				int var32 = ((arg21 >> 16 & 0xFF) * (var31 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (var31 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (var31 & 0xFF) >> 8;
				this.method1030(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, class662.method19201(var32, arg24, arg25), class662.method19201(var32, arg24, arg26), class662.method19201(var32, arg24, arg27));
				return;
			}
			this.field953 = var30;
			this.field948 = this.field947.method15657(arg28);
			this.field956 = this.field948 - 1;
			this.field960 = this.field947.method15658(arg28);
			this.field939 = this.field947.method15660(arg28);
			this.field959 = this.field947.method15659(arg28) & 0xFF;
		}
		this.field952 = arg24;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				float var33 = arg6;
				arg6 = arg7;
				arg7 = var33;
				float var34 = arg3;
				arg3 = arg4;
				arg4 = var34;
				float var35 = arg9;
				arg9 = arg10;
				arg10 = var35;
				float var36 = arg15;
				arg15 = arg16;
				arg16 = var36;
				float var37 = arg18;
				arg18 = arg19;
				arg19 = var37;
				float var38 = arg12;
				arg12 = arg13;
				arg13 = var38;
				float var39 = arg25;
				arg25 = arg26;
				arg26 = var39;
				int var40 = arg21;
				arg21 = arg22;
				arg22 = var40;
			} else {
				float var41 = arg6;
				arg6 = arg8;
				arg8 = var41;
				float var42 = arg3;
				arg3 = arg5;
				arg5 = var42;
				float var43 = arg9;
				arg9 = arg11;
				arg11 = var43;
				float var44 = arg15;
				arg15 = arg17;
				arg17 = var44;
				float var45 = arg18;
				arg18 = arg20;
				arg20 = var45;
				float var46 = arg12;
				arg12 = arg14;
				arg14 = var46;
				float var47 = arg25;
				arg25 = arg27;
				arg27 = var47;
				int var48 = arg21;
				arg21 = arg23;
				arg23 = var48;
			}
		}
		float var49 = arg15 / arg12;
		float var50 = arg16 / arg13;
		float var51 = arg17 / arg14;
		float var52 = arg18 / arg12;
		float var53 = arg19 / arg13;
		float var54 = arg20 / arg14;
		float var55 = 1.0F / arg9;
		float var56 = 1.0F / arg10;
		float var57 = 1.0F / arg11;
		float var58 = 1.0F / arg12;
		float var59 = 1.0F / arg13;
		float var60 = 1.0F / arg14;
		float var61 = (float) (arg21 >> 24 & 0xFF);
		float var62 = (float) (arg22 >> 24 & 0xFF);
		float var63 = (float) (arg23 >> 24 & 0xFF);
		float var64 = (float) (arg21 >> 16 & 0xFF);
		float var65 = (float) (arg22 >> 16 & 0xFF);
		float var66 = (float) (arg23 >> 16 & 0xFF);
		float var67 = (float) (arg21 >> 8 & 0xFF);
		float var68 = (float) (arg22 >> 8 & 0xFF);
		float var69 = (float) (arg23 >> 8 & 0xFF);
		float var70 = (float) (arg21 & 0xFF);
		float var71 = (float) (arg22 & 0xFF);
		float var72 = (float) (arg23 & 0xFF);
		float var73 = 0.0F;
		float var74 = 0.0F;
		float var75 = 0.0F;
		float var76 = 0.0F;
		float var77 = 0.0F;
		float var78 = 0.0F;
		float var79 = 0.0F;
		float var80 = 0.0F;
		float var81 = 0.0F;
		float var82 = 0.0F;
		if (arg3 != arg4) {
			float var83 = arg4 - arg3;
			var73 = (arg7 - arg6) / var83;
			var74 = (var56 - var55) / var83;
			var75 = (var59 - var58) / var83;
			var76 = (var50 - var49) / var83;
			var77 = (var53 - var52) / var83;
			var78 = (arg26 - arg25) / var83;
			var79 = (var62 - var61) / var83;
			var80 = (var65 - var64) / var83;
			var81 = (var68 - var67) / var83;
			var82 = (var71 - var70) / var83;
		}
		float var84 = 0.0F;
		float var85 = 0.0F;
		float var86 = 0.0F;
		float var87 = 0.0F;
		float var88 = 0.0F;
		float var89 = 0.0F;
		float var90 = 0.0F;
		float var91 = 0.0F;
		float var92 = 0.0F;
		float var93 = 0.0F;
		if (arg4 != arg5) {
			float var94 = arg5 - arg4;
			var84 = (arg8 - arg7) / var94;
			var85 = (var57 - var56) / var94;
			var86 = (var60 - var59) / var94;
			var87 = (var51 - var50) / var94;
			var88 = (var54 - var53) / var94;
			var89 = (arg27 - arg26) / var94;
			var90 = (var63 - var62) / var94;
			var91 = (var66 - var65) / var94;
			var92 = (var69 - var68) / var94;
			var93 = (var72 - var71) / var94;
		}
		float var95 = 0.0F;
		float var96 = 0.0F;
		float var97 = 0.0F;
		float var98 = 0.0F;
		float var99 = 0.0F;
		float var100 = 0.0F;
		float var101 = 0.0F;
		float var102 = 0.0F;
		float var103 = 0.0F;
		float var104 = 0.0F;
		if (arg3 != arg5) {
			float var105 = arg3 - arg5;
			var95 = (arg6 - arg8) / var105;
			var96 = (var55 - var57) / var105;
			var97 = (var58 - var60) / var105;
			var98 = (var49 - var51) / var105;
			var99 = (var52 - var54) / var105;
			var100 = (arg25 - arg27) / var105;
			var101 = (var61 - var63) / var105;
			var102 = (var64 - var66) / var105;
			var103 = (var67 - var69) / var105;
			var104 = (var70 - var72) / var105;
		}
		if (arg3 >= (float) this.field946) {
			return;
		}
		if (arg4 > (float) this.field946) {
			arg4 = this.field946;
		}
		if (arg5 > (float) this.field946) {
			arg5 = this.field946;
		}
		if (arg4 >= arg5) {
			float var126 = arg6;
			float var127 = var55;
			float var128 = var58;
			float var129 = var49;
			float var130 = var52;
			float var131 = arg25;
			float var132 = var61;
			float var133 = var64;
			float var134 = var67;
			float var135 = var70;
			if (arg3 < 0.0F) {
				arg6 -= arg3 * var73;
				var126 -= arg3 * var95;
				var55 -= arg3 * var74;
				var127 -= arg3 * var96;
				var58 -= arg3 * var75;
				var128 -= arg3 * var97;
				var49 -= arg3 * var76;
				var129 -= arg3 * var98;
				var52 -= arg3 * var77;
				var130 -= arg3 * var99;
				arg25 -= arg3 * var78;
				var131 -= arg3 * var100;
				var61 -= arg3 * var79;
				var132 -= arg3 * var101;
				var64 -= arg3 * var79;
				var133 -= arg3 * var101;
				var67 -= arg3 * var79;
				var134 -= arg3 * var101;
				var70 -= arg3 * var79;
				var135 -= arg3 * var101;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= arg5 * var84;
				var57 -= arg5 * var85;
				var60 -= arg5 * var86;
				var51 -= arg5 * var87;
				var54 -= arg5 * var88;
				arg27 -= arg5 * var89;
				var63 -= arg5 * var90;
				var66 -= arg5 * var91;
				var69 -= arg5 * var92;
				var72 -= arg5 * var93;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && var95 < var73 || arg3 == arg5 && var84 > var73) {
				float var136 = (float) (arg3 + 0.5F);
				float var137 = (float) (arg5 + 0.5F);
				float var138 = (float) (arg4 + 0.5F) - var137;
				float var139 = var137 - var136;
				float var140 = (float) this.field938[(int) var136];
				while (--var139 >= 0.0F) {
					this.method1034(arg1, arg2, this.field950, this.field954, (int) var140, (int) var126, (int) arg6, var127, var55, var128, var58, var129, var49, var130, var52, var131, arg25, var132, var61, var133, var64, var134, var67, var135, var70);
					arg6 += var73;
					var126 += var95;
					var55 += var74;
					var127 += var96;
					var58 += var75;
					var128 += var97;
					var49 += var76;
					var129 += var98;
					var52 += var77;
					var130 += var99;
					arg25 += var78;
					var131 += var100;
					var61 += var79;
					var132 += var101;
					var64 += var80;
					var133 += var102;
					var67 += var81;
					var134 += var103;
					var70 += var82;
					var135 += var104;
					var140 += this.field949;
				}
				while (--var138 >= 0.0F) {
					this.method1034(arg1, arg2, this.field950, this.field954, (int) var140, (int) arg8, (int) arg6, var57, var55, var60, var58, var51, var49, var54, var52, arg27, arg25, var63, var61, var66, var64, var69, var67, var72, var70);
					arg8 += var84;
					arg6 += var73;
					var57 += var85;
					var55 += var74;
					var60 += var86;
					var58 += var75;
					var51 += var87;
					var49 += var76;
					var54 += var88;
					var52 += var77;
					arg27 += var89;
					arg25 += var78;
					var63 += var90;
					var61 += var79;
					var66 += var91;
					var64 += var80;
					var69 += var92;
					var67 += var81;
					var72 += var93;
					var70 += var82;
					var140 += this.field949;
				}
			} else {
				float var141 = (float) (arg3 + 0.5F);
				float var142 = (float) (arg5 + 0.5F);
				float var143 = (float) (arg4 + 0.5F) - var142;
				float var144 = var142 - var141;
				float var145 = (float) this.field938[(int) var141];
				while (--var144 >= 0.0F) {
					this.method1034(arg1, arg2, this.field950, this.field954, (int) var145, (int) arg6, (int) var126, var55, var127, var58, var128, var49, var129, var52, var130, arg25, var131, var61, var132, var64, var133, var67, var134, var70, var135);
					var126 += var95;
					arg6 += var73;
					var127 += var96;
					var55 += var74;
					var128 += var97;
					var58 += var75;
					var129 += var98;
					var49 += var76;
					var130 += var99;
					var52 += var77;
					var131 += var100;
					arg25 += var78;
					var132 += var101;
					var61 += var79;
					var133 += var102;
					var64 += var80;
					var134 += var103;
					var67 += var81;
					var135 += var104;
					var70 += var82;
					var145 += this.field949;
				}
				while (--var143 >= 0.0F) {
					this.method1034(arg1, arg2, this.field950, this.field954, (int) var145, (int) arg6, (int) arg8, var55, var57, var58, var60, var49, var51, var52, var54, arg25, arg27, var61, var63, var64, var66, var67, var69, var70, var72);
					arg6 += var73;
					arg8 += var84;
					var55 += var74;
					var57 += var85;
					var58 += var75;
					var60 += var86;
					var49 += var76;
					var51 += var87;
					var52 += var77;
					var54 += var88;
					arg25 += var78;
					arg27 += var89;
					var61 += var79;
					var63 += var90;
					var64 += var80;
					var66 += var91;
					var67 += var81;
					var69 += var92;
					var70 += var82;
					var72 += var93;
					var145 += this.field949;
				}
			}
			return;
		}
		float var106 = arg6;
		float var107 = var55;
		float var108 = var58;
		float var109 = var49;
		float var110 = var52;
		float var111 = arg25;
		float var112 = var61;
		float var113 = var64;
		float var114 = var67;
		float var115 = var70;
		if (arg3 < 0.0F) {
			arg6 -= arg3 * var73;
			var106 -= arg3 * var95;
			var55 -= arg3 * var74;
			var107 -= arg3 * var96;
			var58 -= arg3 * var75;
			var108 -= arg3 * var97;
			var49 -= arg3 * var76;
			var109 -= arg3 * var98;
			var52 -= arg3 * var77;
			var110 -= arg3 * var99;
			arg25 -= arg3 * var78;
			var111 -= arg3 * var100;
			var61 -= arg3 * var79;
			var112 -= arg3 * var101;
			var64 -= arg3 * var79;
			var113 -= arg3 * var101;
			var67 -= arg3 * var79;
			var114 -= arg3 * var101;
			var70 -= arg3 * var79;
			var115 -= arg3 * var101;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= arg4 * var84;
			var56 -= arg4 * var85;
			var59 -= arg4 * var86;
			var50 -= arg4 * var87;
			var53 -= arg4 * var88;
			arg26 -= arg4 * var89;
			var62 -= arg4 * var90;
			var65 -= arg4 * var91;
			var68 -= arg4 * var92;
			var71 -= arg4 * var93;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && var95 < var73 || !(arg3 != arg4 || !(var95 > var84))) {
			float var116 = (float) (arg3 + 0.5F);
			float var117 = (float) (arg4 + 0.5F);
			float var118 = (float) (arg5 + 0.5F) - var117;
			float var119 = var117 - var116;
			float var120 = (float) this.field938[(int) var116];
			while (--var119 >= 0.0F) {
				this.method1034(arg1, arg2, this.field950, this.field954, (int) var120, (int) var106, (int) arg6, var107, var55, var108, var58, var109, var49, var110, var52, var111, arg25, var112, var61, var113, var64, var114, var67, var115, var70);
				arg6 += var73;
				var106 += var95;
				var55 += var74;
				var107 += var96;
				var58 += var75;
				var108 += var97;
				var49 += var76;
				var109 += var98;
				var52 += var77;
				var110 += var99;
				arg25 += var78;
				var111 += var100;
				var61 += var79;
				var112 += var101;
				var64 += var80;
				var113 += var102;
				var67 += var81;
				var114 += var103;
				var70 += var82;
				var115 += var104;
				var120 += this.field949;
			}
			while (--var118 >= 0.0F) {
				this.method1034(arg1, arg2, this.field950, this.field954, (int) var120, (int) var106, (int) arg7, var107, var56, var108, var59, var109, var50, var110, var53, var111, arg26, var112, var62, var113, var65, var114, var68, var115, var71);
				arg7 += var84;
				var106 += var95;
				var56 += var85;
				var107 += var96;
				var59 += var86;
				var108 += var97;
				var50 += var87;
				var109 += var98;
				var53 += var88;
				var110 += var99;
				arg26 += var89;
				var111 += var100;
				var62 += var90;
				var112 += var101;
				var65 += var91;
				var113 += var102;
				var68 += var92;
				var114 += var103;
				var71 += var93;
				var115 += var104;
				var120 += this.field949;
			}
			return;
		}
		float var121 = (float) (arg3 + 0.5F);
		float var122 = (float) (arg4 + 0.5F);
		float var123 = (float) (arg5 + 0.5F) - var122;
		float var124 = var122 - var121;
		float var125 = (float) this.field938[(int) var121];
		while (--var124 >= 0.0F) {
			this.method1034(arg1, arg2, this.field950, this.field954, (int) var125, (int) arg6, (int) var106, var55, var107, var58, var108, var49, var109, var52, var110, arg25, var111, var61, var112, var64, var113, var67, var114, var70, var115);
			arg6 += var73;
			var106 += var95;
			var55 += var74;
			var107 += var96;
			var58 += var75;
			var108 += var97;
			var49 += var76;
			var109 += var98;
			var52 += var77;
			var110 += var99;
			arg25 += var78;
			var111 += var100;
			var61 += var79;
			var112 += var101;
			var64 += var80;
			var113 += var102;
			var67 += var81;
			var114 += var103;
			var70 += var82;
			var115 += var104;
			var125 += this.field949;
		}
		while (--var123 >= 0.0F) {
			this.method1034(arg1, arg2, this.field950, this.field954, (int) var125, (int) arg7, (int) var106, var56, var107, var59, var108, var50, var109, var53, var110, arg26, var111, var62, var112, var65, var113, var68, var114, var71, var115);
			arg7 += var84;
			var106 += var95;
			var56 += var85;
			var107 += var96;
			var59 += var86;
			var108 += var97;
			var50 += var87;
			var109 += var98;
			var53 += var88;
			var110 += var99;
			arg26 += var89;
			var111 += var100;
			var62 += var90;
			var112 += var101;
			var65 += var91;
			var113 += var102;
			var68 += var92;
			var114 += var103;
			var71 += var93;
			var115 += var104;
			var125 += this.field949;
		}
	}

	@ObfuscatedName("bd.d(ZZ[I[IIIIFFFFFFFFFFFFFFFFFF)V")
	public final void method1034(boolean arg0, boolean arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, float arg21, float arg22, float arg23, float arg24) {
		int var26 = arg6 - arg5;
		float var27 = 1.0F / (float) var26;
		float var28 = (arg8 - arg7) * var27;
		float var29 = (arg10 - arg9) * var27;
		float var30 = (arg12 - arg11) * var27;
		float var31 = (arg14 - arg13) * var27;
		float var32 = (arg16 - arg15) * var27;
		float var33 = (arg18 - arg17) * var27;
		float var34 = (arg20 - arg19) * var27;
		float var35 = (arg22 - arg21) * var27;
		float var36 = (arg24 - arg23) * var27;
		if (this.field936) {
			if (arg6 > this.field945) {
				arg6 = this.field945;
			}
			if (arg5 < 0) {
				arg7 -= (float) arg5 * var28;
				arg9 -= (float) arg5 * var29;
				arg11 -= (float) arg5 * var30;
				arg13 -= (float) arg5 * var31;
				arg15 -= (float) arg5 * var32;
				arg17 -= (float) arg5 * var33;
				arg19 -= (float) arg5 * var34;
				arg21 -= (float) arg5 * var35;
				arg23 -= (float) arg5 * var36;
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		int var37 = arg6 - arg5;
		int var38 = arg4 + arg5;
		while (var37-- > 0) {
			float var39 = 1.0F / arg7;
			float var40 = 1.0F / arg9;
			if (!arg0 || var39 < this.field951[var38]) {
				int var41 = (int) (arg11 * var40 * (float) this.field948);
				if (this.field939) {
					var41 &= this.field956;
				} else if (var41 < 0) {
					var41 = 0;
				} else if (var41 > this.field956) {
					var41 = this.field956;
				}
				int var42 = (int) (arg13 * var40 * (float) this.field948);
				if (this.field939) {
					var42 &= this.field956;
				} else if (var42 < 0) {
					var42 = 0;
				} else if (var42 > this.field956) {
					var42 = this.field956;
				}
				int var43 = this.field954[this.field948 * var42 + var41];
				boolean var44 = true;
				int var45;
				if (class603.field7573 == this.field960) {
					var45 = (int) ((float) (var43 >> 24 & 0xFF) * arg17 / 255.0F);
				} else if (class603.field7574 != this.field960) {
					var45 = (int) arg17;
				} else if ((var43 >> 24 & 0xFF) > this.field959) {
					var45 = 255;
				} else {
					var45 = 0;
				}
				if (var45 != 0) {
					if (var45 == 255) {
						int var52 = ((int) ((float) (var43 >> 16 & 0xFF) * arg19) & 0xFF00 | 0xFF0000) << 8 | (int) ((float) (var43 >> 8 & 0xFF) * arg21) & 0xFF00 | (int) ((float) (var43 & 0xFF) * arg23) >> 8;
						if (arg15 != 0.0F) {
							int var53 = (int) (255.0F - arg15);
							int var54 = ((this.field952 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.field952 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							var52 = (((var52 & 0xFF00FF) * var53 & 0xFF00FF00 | (var52 & 0xFF00) * var53 & 0xFF0000) >>> 8) + var54;
						}
						if (arg1) {
							arg2[var38] = var45 << 24 | var52;
						} else {
							arg2[var38] = var52;
						}
						if (arg0) {
							this.field951[var38] = var39;
						}
					} else {
						int var46 = ((int) ((float) (var43 >> 16 & 0xFF) * arg19) & 0xFF00 | 0xFF0000) << 8 | (int) ((float) (var43 >> 8 & 0xFF) * arg21) & 0xFF00 | (int) ((float) (var43 & 0xFF) * arg23) >> 8;
						if (arg15 != 0.0F) {
							int var47 = (int) (255.0F - arg15);
							int var48 = ((this.field952 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.field952 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							var46 = (((var46 & 0xFF00FF) * var47 & 0xFF00FF00 | (var46 & 0xFF00) * var47 & 0xFF0000) >>> 8) + var48;
						}
						int var49 = arg2[var38];
						int var50 = 255 - var45;
						int var51 = ((var46 & 0xFF00FF) * var45 + (var49 & 0xFF00FF) * var50 & 0xFF00FF00) + ((var46 & 0xFF00) * var45 + (var49 & 0xFF00) * var50 & 0xFF0000) >> 8;
						if (arg1) {
							arg2[var38] = (var45 | arg2[var38] >> 24) << 24 | var51;
						} else {
							arg2[var38] = var51;
						}
						if (arg0) {
							this.field951[var38] = var39;
						}
					}
				}
			}
			var38++;
			arg7 += var28;
			arg9 += var29;
			arg11 += var30;
			arg13 += var31;
			arg15 += var32;
			arg17 += var33;
			arg19 += var34;
			arg21 += var35;
			arg23 += var36;
		}
	}

	@ObfuscatedName("bd.c(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFIFIFIF)V")
	public final void method1042(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, int arg21, int arg22, int arg23, int arg24, float arg25, float arg26, float arg27, int arg28, float arg29, int arg30, float arg31, int arg32, float arg33) {
		if (!arg0) {
			this.method1032(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		this.field952 = arg24;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				float var35 = arg6;
				arg6 = arg7;
				arg7 = var35;
				float var36 = arg3;
				arg3 = arg4;
				arg4 = var36;
				float var37 = arg9;
				arg9 = arg10;
				arg10 = var37;
				float var38 = arg15;
				arg15 = arg16;
				arg16 = var38;
				float var39 = arg18;
				arg18 = arg19;
				arg19 = var39;
				float var40 = arg12;
				arg12 = arg13;
				arg13 = var40;
				float var41 = arg25;
				arg25 = arg26;
				arg26 = var41;
				float var42 = arg29;
				arg29 = arg31;
				arg31 = var42;
				int var43 = arg21;
				arg21 = arg22;
				arg22 = var43;
				int var44 = arg28;
				arg28 = arg30;
				arg30 = var44;
			} else {
				float var45 = arg6;
				arg6 = arg8;
				arg8 = var45;
				float var46 = arg3;
				arg3 = arg5;
				arg5 = var46;
				float var47 = arg9;
				arg9 = arg11;
				arg11 = var47;
				float var48 = arg15;
				arg15 = arg17;
				arg17 = var48;
				float var49 = arg18;
				arg18 = arg20;
				arg20 = var49;
				float var50 = arg12;
				arg12 = arg14;
				arg14 = var50;
				float var51 = arg25;
				arg25 = arg27;
				arg27 = var51;
				float var52 = arg29;
				arg29 = arg33;
				arg33 = var52;
				int var53 = arg21;
				arg21 = arg23;
				arg23 = var53;
				int var54 = arg28;
				arg28 = arg32;
				arg32 = var54;
			}
		}
		int var55 = arg28 & 0xFFFF;
		int var56 = arg30 & 0xFFFF;
		int var57 = arg32 & 0xFFFF;
		if (this.field953 != var55) {
			this.field954 = this.field947.method15655(var55);
			if (this.field954 == null) {
				this.field953 = -1;
				this.field935 = 255 - (arg21 >> 24 & 0xFF);
				int var58 = Statics.field8149[class662.method4937(this.field947.method15695(arg28)) & 0xFFFF];
				int var59 = ((arg21 >> 16 & 0xFF) * (var58 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (var58 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (var58 & 0xFF) >> 8;
				this.method1030(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, class662.method19201(var59, arg24, arg25), class662.method19201(var59, arg24, arg26), class662.method19201(var59, arg24, arg27));
				return;
			}
			this.field953 = var55;
			this.field948 = this.field947.method15657(arg28);
			this.field956 = this.field948 - 1;
			this.field960 = this.field947.method15658(arg28);
		}
		this.field957 = arg29;
		if (this.field961 != var56) {
			this.field962 = this.field947.method15655(var56);
			if (this.field962 == null) {
				this.field961 = -1;
				this.field935 = 255 - (arg21 >> 24 & 0xFF);
				int var60 = Statics.field8149[class662.method4937(this.field947.method15695(arg30)) & 0xFFFF];
				int var61 = ((arg21 >> 16 & 0xFF) * (var60 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (var60 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (var60 & 0xFF) >> 8;
				this.method1030(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, class662.method19201(var61, arg24, arg25), class662.method19201(var61, arg24, arg26), class662.method19201(var61, arg24, arg27));
				return;
			}
			this.field961 = var56;
			this.field944 = this.field947.method15657(arg30);
			this.field963 = this.field944 - 1;
		}
		this.field965 = arg31;
		if (this.field955 != var57) {
			this.field967 = this.field947.method15655(var57);
			if (this.field967 == null) {
				this.field955 = -1;
				this.field935 = 255 - (arg21 >> 24 & 0xFF);
				int var62 = Statics.field8149[class662.method4937(this.field947.method15695(arg32)) & 0xFFFF];
				int var63 = ((arg21 >> 16 & 0xFF) * (var62 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (var62 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (var62 & 0xFF) >> 8;
				this.method1030(true, arg1, arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, (float) arg9, (float) arg10, (float) arg11, class662.method19201(var63, arg24, arg25), class662.method19201(var63, arg24, arg26), class662.method19201(var63, arg24, arg27));
				return;
			}
			this.field955 = var57;
			this.field943 = this.field947.method15657(arg32);
			this.field969 = this.field943 - 1;
		}
		this.field970 = arg33;
		float var64 = arg15 / arg12;
		float var65 = arg16 / arg13;
		float var66 = arg17 / arg14;
		float var67 = arg18 / arg12;
		float var68 = arg19 / arg13;
		float var69 = arg20 / arg14;
		float var70 = 1.0F / arg9;
		float var71 = 1.0F / arg10;
		float var72 = 1.0F / arg11;
		float var73 = 1.0F / arg12;
		float var74 = 1.0F / arg13;
		float var75 = 1.0F / arg14;
		float var76 = (float) (arg21 >> 24 & 0xFF);
		float var77 = (float) (arg22 >> 24 & 0xFF);
		float var78 = (float) (arg23 >> 24 & 0xFF);
		float var79 = (float) (arg21 >> 16 & 0xFF);
		float var80 = (float) (arg22 >> 16 & 0xFF);
		float var81 = (float) (arg23 >> 16 & 0xFF);
		float var82 = (float) (arg21 >> 8 & 0xFF);
		float var83 = (float) (arg22 >> 8 & 0xFF);
		float var84 = (float) (arg23 >> 8 & 0xFF);
		float var85 = (float) (arg21 & 0xFF);
		float var86 = (float) (arg22 & 0xFF);
		float var87 = (float) (arg23 & 0xFF);
		float var88 = 1.0F;
		float var89 = 0.0F;
		float var90 = 0.0F;
		float var91 = 0.0F;
		float var92 = 1.0F;
		float var93 = 0.0F;
		float var94 = 0.0F;
		float var95 = 0.0F;
		float var96 = 0.0F;
		float var97 = 0.0F;
		float var98 = 0.0F;
		float var99 = 0.0F;
		float var100 = 0.0F;
		float var101 = 0.0F;
		float var102 = 0.0F;
		float var103 = 0.0F;
		float var104 = 0.0F;
		float var105 = 0.0F;
		if (arg3 != arg4) {
			float var106 = arg4 - arg3;
			var94 = (arg7 - arg6) / var106;
			var95 = (var71 - var70) / var106;
			var96 = (var74 - var73) / var106;
			var97 = (var65 - var64) / var106;
			var98 = (var68 - var67) / var106;
			var99 = (arg26 - arg25) / var106;
			var100 = (var77 - var76) / var106;
			var101 = (var80 - var79) / var106;
			var102 = (var83 - var82) / var106;
			var103 = (var86 - var85) / var106;
			var104 = (var89 - var88) / var106;
			var105 = (var92 - var91) / var106;
		}
		float var107 = 0.0F;
		float var108 = 0.0F;
		float var109 = 0.0F;
		float var110 = 0.0F;
		float var111 = 0.0F;
		float var112 = 0.0F;
		float var113 = 0.0F;
		float var114 = 0.0F;
		float var115 = 0.0F;
		float var116 = 0.0F;
		float var117 = 0.0F;
		float var118 = 0.0F;
		if (arg4 != arg5) {
			float var119 = arg5 - arg4;
			var107 = (arg8 - arg7) / var119;
			var108 = (var72 - var71) / var119;
			var109 = (var75 - var74) / var119;
			var110 = (var66 - var65) / var119;
			var111 = (var69 - var68) / var119;
			var112 = (arg27 - arg26) / var119;
			var113 = (var78 - var77) / var119;
			var114 = (var81 - var80) / var119;
			var115 = (var84 - var83) / var119;
			var116 = (var87 - var86) / var119;
			var117 = (var90 - var89) / var119;
			var118 = (var93 - var92) / var119;
		}
		float var120 = 0.0F;
		float var121 = 0.0F;
		float var122 = 0.0F;
		float var123 = 0.0F;
		float var124 = 0.0F;
		float var125 = 0.0F;
		float var126 = 0.0F;
		float var127 = 0.0F;
		float var128 = 0.0F;
		float var129 = 0.0F;
		float var130 = 0.0F;
		float var131 = 0.0F;
		if (arg3 != arg5) {
			float var132 = arg3 - arg5;
			var120 = (arg6 - arg8) / var132;
			var121 = (var70 - var72) / var132;
			var122 = (var73 - var75) / var132;
			var123 = (var64 - var66) / var132;
			var124 = (var67 - var69) / var132;
			var125 = (arg25 - arg27) / var132;
			var126 = (var76 - var78) / var132;
			var127 = (var79 - var81) / var132;
			var128 = (var82 - var84) / var132;
			var129 = (var85 - var87) / var132;
			var130 = (var88 - var90) / var132;
			var131 = (var91 - var93) / var132;
		}
		if (arg3 >= (float) this.field946) {
			return;
		}
		if (arg4 > (float) this.field946) {
			arg4 = this.field946;
		}
		if (arg5 > (float) this.field946) {
			arg5 = this.field946;
		}
		if (arg4 >= arg5) {
			float var155 = arg6;
			float var156 = var70;
			float var157 = var73;
			float var158 = var64;
			float var159 = var67;
			float var160 = arg25;
			float var161 = var76;
			float var162 = var79;
			float var163 = var82;
			float var164 = var85;
			float var165 = var88;
			float var166 = var91;
			if (arg3 < 0.0F) {
				arg6 -= arg3 * var94;
				var155 -= arg3 * var120;
				var70 -= arg3 * var95;
				var156 -= arg3 * var121;
				var73 -= arg3 * var96;
				var157 -= arg3 * var122;
				var64 -= arg3 * var97;
				var158 -= arg3 * var123;
				var67 -= arg3 * var98;
				var159 -= arg3 * var124;
				arg25 -= arg3 * var99;
				var160 -= arg3 * var125;
				var76 -= arg3 * var100;
				var161 -= arg3 * var126;
				var79 -= arg3 * var101;
				var162 -= arg3 * var127;
				var82 -= arg3 * var102;
				var163 -= arg3 * var128;
				var85 -= arg3 * var103;
				var164 -= arg3 * var129;
				var88 -= arg3 * var104;
				var165 -= arg3 * var130;
				var91 -= arg3 * var105;
				var166 -= arg3 * var131;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= arg5 * var107;
				var72 -= arg5 * var108;
				var75 -= arg5 * var109;
				var66 -= arg5 * var110;
				var69 -= arg5 * var111;
				arg27 -= arg5 * var112;
				var78 -= arg5 * var113;
				var81 -= arg5 * var114;
				var84 -= arg5 * var115;
				var87 -= arg5 * var116;
				var90 -= arg5 * var117;
				var93 -= arg5 * var118;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && var120 < var94 || arg3 == arg5 && var107 > var94) {
				float var167 = (float) (arg3 + 0.5F);
				float var168 = (float) (arg5 + 0.5F);
				float var169 = (float) (arg4 + 0.5F) - var168;
				float var170 = var168 - var167;
				float var171 = (float) this.field938[(int) var167];
				while (--var170 >= 0.0F) {
					this.method1036(arg1, arg2, this.field950, (int) var171, (int) var155, (int) arg6, var156, var70, var157, var73, var158, var64, var159, var67, var160, arg25, var161, var76, var162, var79, var163, var82, var164, var85, var165, var88, var166, var91);
					arg6 += var94;
					var155 += var120;
					var70 += var95;
					var156 += var121;
					var73 += var96;
					var157 += var122;
					var64 += var97;
					var158 += var123;
					var67 += var98;
					var159 += var124;
					arg25 += var99;
					var160 += var125;
					var76 += var100;
					var161 += var126;
					var79 += var101;
					var162 += var127;
					var82 += var102;
					var163 += var128;
					var85 += var103;
					var164 += var129;
					var88 += var104;
					var165 += var130;
					var91 += var105;
					var166 += var131;
					var171 += this.field949;
				}
				while (--var169 >= 0.0F) {
					this.method1036(arg1, arg2, this.field950, (int) var171, (int) arg8, (int) arg6, var72, var70, var75, var73, var66, var64, var69, var67, arg27, arg25, var78, var76, var81, var79, var84, var82, var87, var85, var90, var88, var93, var91);
					arg8 += var107;
					arg6 += var94;
					var72 += var108;
					var70 += var95;
					var75 += var109;
					var73 += var96;
					var66 += var110;
					var64 += var97;
					var69 += var111;
					var67 += var98;
					arg27 += var112;
					arg25 += var99;
					var78 += var113;
					var76 += var100;
					var81 += var114;
					var79 += var101;
					var84 += var115;
					var82 += var102;
					var87 += var116;
					var85 += var103;
					var90 += var117;
					var88 += var104;
					var93 += var118;
					var91 += var105;
					var171 += this.field949;
				}
			} else {
				float var172 = (float) (arg3 + 0.5F);
				float var173 = (float) (arg5 + 0.5F);
				float var174 = (float) (arg4 + 0.5F) - var173;
				float var175 = var173 - var172;
				float var176 = (float) this.field938[(int) var172];
				while (--var175 >= 0.0F) {
					this.method1036(arg1, arg2, this.field950, (int) var176, (int) arg6, (int) var155, var70, var156, var73, var157, var64, var158, var67, var159, arg25, var160, var76, var161, var79, var162, var82, var163, var85, var164, var88, var165, var91, var166);
					var155 += var120;
					arg6 += var94;
					var156 += var121;
					var70 += var95;
					var157 += var122;
					var73 += var96;
					var158 += var123;
					var64 += var97;
					var159 += var124;
					var67 += var98;
					var160 += var125;
					arg25 += var99;
					var161 += var126;
					var76 += var100;
					var162 += var127;
					var79 += var101;
					var163 += var128;
					var82 += var102;
					var164 += var129;
					var85 += var103;
					var165 += var130;
					var88 += var104;
					var166 += var131;
					var91 += var105;
					var176 += this.field949;
				}
				while (--var174 >= 0.0F) {
					this.method1036(arg1, arg2, this.field950, (int) var176, (int) arg6, (int) arg8, var70, var72, var73, var75, var64, var66, var67, var69, arg25, arg27, var76, var78, var79, var81, var82, var84, var85, var87, var88, var90, var91, var93);
					arg6 += var94;
					arg8 += var107;
					var70 += var95;
					var72 += var108;
					var73 += var96;
					var75 += var109;
					var64 += var97;
					var66 += var110;
					var67 += var98;
					var69 += var111;
					arg25 += var99;
					arg27 += var112;
					var76 += var100;
					var78 += var113;
					var79 += var101;
					var81 += var114;
					var82 += var102;
					var84 += var115;
					var85 += var103;
					var87 += var116;
					var88 += var104;
					var90 += var117;
					var91 += var105;
					var93 += var118;
					var176 += this.field949;
				}
			}
			return;
		}
		float var133 = arg6;
		float var134 = var70;
		float var135 = var73;
		float var136 = var64;
		float var137 = var67;
		float var138 = arg25;
		float var139 = var76;
		float var140 = var79;
		float var141 = var82;
		float var142 = var85;
		float var143 = var88;
		float var144 = var91;
		if (arg3 < 0.0F) {
			arg6 -= arg3 * var94;
			var133 -= arg3 * var120;
			var70 -= arg3 * var95;
			var134 -= arg3 * var121;
			var73 -= arg3 * var96;
			var135 -= arg3 * var122;
			var64 -= arg3 * var97;
			var136 -= arg3 * var123;
			var67 -= arg3 * var98;
			var137 -= arg3 * var124;
			arg25 -= arg3 * var99;
			var138 -= arg3 * var125;
			var76 -= arg3 * var100;
			var139 -= arg3 * var126;
			var79 -= arg3 * var101;
			var140 -= arg3 * var127;
			var82 -= arg3 * var102;
			var141 -= arg3 * var128;
			var85 -= arg3 * var103;
			var142 -= arg3 * var129;
			var88 -= arg3 * var104;
			var143 -= arg3 * var130;
			var91 -= arg3 * var105;
			var144 -= arg3 * var131;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= arg4 * var107;
			var71 -= arg4 * var108;
			var74 -= arg4 * var109;
			var65 -= arg4 * var110;
			var68 -= arg4 * var111;
			arg26 -= arg4 * var112;
			var77 -= arg4 * var113;
			var80 -= arg4 * var114;
			var83 -= arg4 * var115;
			var86 -= arg4 * var116;
			var89 -= arg4 * var117;
			var92 -= arg4 * var118;
			arg4 = 0.0F;
		}
		if ((arg3 == arg4 || var120 >= var94) && (arg3 != arg4 || var120 <= var107)) {
			float var150 = (float) (arg3 + 0.5F);
			float var151 = (float) (arg4 + 0.5F);
			float var152 = (float) (arg5 + 0.5F) - var151;
			float var153 = var151 - var150;
			float var154 = (float) this.field938[(int) var150];
			while (--var153 >= 0.0F) {
				this.method1036(arg1, arg2, this.field950, (int) var154, (int) arg6, (int) var133, var70, var134, var73, var135, var64, var136, var67, var137, arg25, var138, var76, var139, var79, var140, var82, var141, var85, var142, var88, var143, var91, var144);
				arg6 += var94;
				var133 += var120;
				var70 += var95;
				var134 += var121;
				var73 += var96;
				var135 += var122;
				var64 += var97;
				var136 += var123;
				var67 += var98;
				var137 += var124;
				arg25 += var99;
				var138 += var125;
				var76 += var100;
				var139 += var126;
				var79 += var101;
				var140 += var127;
				var82 += var102;
				var141 += var128;
				var85 += var103;
				var142 += var129;
				var88 += var104;
				var143 += var130;
				var91 += var105;
				var144 += var131;
				var154 += this.field949;
			}
			while (--var152 >= 0.0F) {
				this.method1036(arg1, arg2, this.field950, (int) var154, (int) arg7, (int) var133, var71, var134, var74, var135, var65, var136, var68, var137, arg26, var138, var77, var139, var80, var140, var83, var141, var86, var142, var89, var143, var92, var144);
				arg7 += var107;
				var133 += var120;
				var71 += var108;
				var134 += var121;
				var74 += var109;
				var135 += var122;
				var65 += var110;
				var136 += var123;
				var68 += var111;
				var137 += var124;
				arg26 += var112;
				var138 += var125;
				var77 += var113;
				var139 += var126;
				var80 += var114;
				var140 += var127;
				var83 += var115;
				var141 += var128;
				var86 += var116;
				var142 += var129;
				var89 += var117;
				var143 += var130;
				var92 += var118;
				var144 += var131;
				var154 += this.field949;
			}
			return;
		}
		float var145 = (float) (arg3 + 0.5F);
		float var146 = (float) (arg4 + 0.5F);
		float var147 = (float) (arg5 + 0.5F) - var146;
		float var148 = var146 - var145;
		float var149 = (float) this.field938[(int) var145];
		while (--var148 >= 0.0F) {
			this.method1036(arg1, arg2, this.field950, (int) var149, (int) var133, (int) arg6, var134, var70, var135, var73, var136, var64, var137, var67, var138, arg25, var139, var76, var140, var79, var141, var82, var142, var85, var143, var88, var144, var91);
			arg6 += var94;
			var133 += var120;
			var70 += var95;
			var134 += var121;
			var73 += var96;
			var135 += var122;
			var64 += var97;
			var136 += var123;
			var67 += var98;
			var137 += var124;
			arg25 += var99;
			var138 += var125;
			var76 += var100;
			var139 += var126;
			var79 += var101;
			var140 += var127;
			var82 += var102;
			var141 += var128;
			var85 += var103;
			var142 += var129;
			var88 += var104;
			var143 += var130;
			var91 += var105;
			var144 += var131;
			var149 += this.field949;
		}
		while (--var147 >= 0.0F) {
			this.method1036(arg1, arg2, this.field950, (int) var149, (int) var133, (int) arg7, var134, var71, var135, var74, var136, var65, var137, var68, var138, arg26, var139, var77, var140, var80, var141, var83, var142, var86, var143, var89, var144, var92);
			arg7 += var107;
			var133 += var120;
			var71 += var108;
			var134 += var121;
			var74 += var109;
			var135 += var122;
			var65 += var110;
			var136 += var123;
			var68 += var111;
			var137 += var124;
			arg26 += var112;
			var138 += var125;
			var77 += var113;
			var139 += var126;
			var80 += var114;
			var140 += var127;
			var83 += var115;
			var141 += var128;
			var86 += var116;
			var142 += var129;
			var89 += var117;
			var143 += var130;
			var92 += var118;
			var144 += var131;
			var149 += this.field949;
		}
	}

	@ObfuscatedName("bd.r(ZZ[IIIIFFFFFFFFFFFFFFFFFFFFFF)V")
	public final void method1036(boolean arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, float arg21, float arg22, float arg23, float arg24, float arg25, float arg26, float arg27) {
		int var29 = arg5 - arg4;
		float var30 = 1.0F / (float) var29;
		float var31 = (arg7 - arg6) * var30;
		float var32 = (arg9 - arg8) * var30;
		float var33 = (arg11 - arg10) * var30;
		float var34 = (arg13 - arg12) * var30;
		float var35 = (arg15 - arg14) * var30;
		float var36 = (arg17 - arg16) * var30;
		float var37 = (arg19 - arg18) * var30;
		float var38 = (arg21 - arg20) * var30;
		float var39 = (arg23 - arg22) * var30;
		float var40 = (arg25 - arg24) * var30;
		float var41 = (arg27 - arg26) * var30;
		if (this.field936) {
			if (arg5 > this.field945) {
				arg5 = this.field945;
			}
			if (arg4 < 0) {
				arg6 -= (float) arg4 * var31;
				arg8 -= (float) arg4 * var32;
				arg10 -= (float) arg4 * var33;
				arg12 -= (float) arg4 * var34;
				arg14 -= (float) arg4 * var35;
				arg16 -= (float) arg4 * var36;
				arg18 -= (float) arg4 * var37;
				arg20 -= (float) arg4 * var38;
				arg22 -= (float) arg4 * var39;
				arg24 -= (float) arg4 * var40;
				arg26 -= (float) arg4 * var41;
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		int var42 = arg5 - arg4;
		int var43 = arg3 + arg4;
		while (var42-- > 0) {
			float var44 = 1.0F / arg6;
			float var45 = 1.0F / arg8;
			if (!arg0 || var44 < this.field951[var43]) {
				float var46 = arg10 * var45;
				float var47 = arg12 * var45;
				int var48 = (int) ((float) this.field948 * var46 * this.field957) & this.field956;
				int var49 = (int) ((float) this.field948 * var47 * this.field957) & this.field956;
				int var50 = this.field954[this.field948 * var49 + var48];
				int var51 = (int) ((float) this.field944 * var46 * this.field965) & this.field963;
				int var52 = (int) ((float) this.field944 * var47 * this.field965) & this.field963;
				int var53 = this.field962[this.field944 * var52 + var51];
				int var54 = (int) ((float) this.field943 * var46 * this.field970) & this.field969;
				int var55 = (int) ((float) this.field943 * var47 * this.field970) & this.field969;
				int var56 = this.field967[this.field943 * var55 + var54];
				float var57 = 1.0F - (arg24 + arg26);
				int var58 = ((int) ((float) (var50 >> 16 & 0xFF) * arg24) | 0xFF00) << 16 | (int) ((float) (var50 >> 8 & 0xFF) * arg24) << 8 | (int) ((float) (var50 & 0xFF) * arg24);
				int var59 = ((int) ((float) (var53 >> 16 & 0xFF) * arg26) | 0xFF00) << 16 | (int) ((float) (var53 >> 8 & 0xFF) * arg26) << 8 | (int) ((float) (var53 & 0xFF) * arg26);
				int var60 = ((int) ((float) (var56 >> 16 & 0xFF) * var57) | 0xFF00) << 16 | (int) ((float) (var56 >> 8 & 0xFF) * var57) << 8 | (int) ((float) (var56 & 0xFF) * var57);
				int var61 = var58 + var59 + var60;
				int var62 = ((int) ((float) (var61 >> 16 & 0xFF) * arg18) & 0xFF00 | 0xFF0000) << 8 | (int) ((float) (var61 >> 8 & 0xFF) * arg20) & 0xFF00 | (int) ((float) (var61 & 0xFF) * arg22) >> 8;
				if (arg14 != 0.0F) {
					int var63 = (int) (255.0F - arg14);
					int var64 = ((this.field952 & 0xFF00FF) * (int) arg14 & 0xFF00FF00 | (this.field952 & 0xFF00) * (int) arg14 & 0xFF0000) >>> 8;
					var62 = (((var62 & 0xFF00FF) * var63 & 0xFF00FF00 | (var62 & 0xFF00) * var63 & 0xFF0000) >>> 8) + var64;
				}
				if (arg1) {
					arg2[var43] = ((int) arg16 | arg2[var43] >> 24) << 24 | var62;
				} else {
					arg2[var43] = var62;
				}
				if (arg0) {
					this.field951[var43] = var44;
				}
			}
			var43++;
			arg6 += var31;
			arg8 += var32;
			arg10 += var33;
			arg12 += var34;
			arg14 += var35;
			arg16 += var36;
			arg18 += var37;
			arg20 += var38;
			arg22 += var39;
			arg24 += var40;
			arg26 += var41;
		}
	}
}
