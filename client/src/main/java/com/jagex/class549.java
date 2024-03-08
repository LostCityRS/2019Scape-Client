package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("tq")
public class class549 {

	@ObfuscatedName("tq.w")
	public class555 field6894;

	@ObfuscatedName("tq.l")
	public int field6895;

	@ObfuscatedName("tq.u")
	public int field6896 = 0;

	public class549(class555 arg0) {
		this.field6894 = arg0;
	}

	@ObfuscatedName("tq.e(IIIIIIIII)Z")
	public final boolean method8697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg0 > 2003 || arg1 > 2003 || arg2 > 2003 || arg3 > 2003 || arg4 > 2003 || arg5 > 2003) {
			return false;
		} else if (arg0 >= -2003 && arg1 >= -2003 && arg2 >= -2003 && arg3 >= -2003 && arg4 >= -2003 && arg5 >= -2003) {
			if (this.field6895 == 2) {
				int var10 = this.field6894.field7044 * arg0 + arg3;
				if (var10 >= 0 && var10 < this.field6894.field7032.length && (arg6 << 8) - 38656 < this.field6894.field7032[var10]) {
					return false;
				}
				int var11 = this.field6894.field7044 * arg1 + arg4;
				if (var11 >= 0 && var11 < this.field6894.field7032.length && (arg7 << 8) - 38656 < this.field6894.field7032[var11]) {
					return false;
				}
				int var12 = this.field6894.field7044 * arg2 + arg5;
				if (var12 >= 0 && var12 < this.field6894.field7032.length && (arg8 << 8) - 38656 < this.field6894.field7032[var12]) {
					return false;
				}
			}
			int var13 = arg4 - arg3;
			int var14 = arg1 - arg0;
			int var15 = arg5 - arg3;
			int var16 = arg2 - arg0;
			int var17 = arg7 - arg6;
			int var18 = arg8 - arg6;
			if (arg0 < arg1 && arg0 < arg2) {
				arg0--;
				if (arg1 > arg2) {
					arg1++;
				} else {
					arg2++;
				}
			} else if (arg1 < arg2) {
				arg1--;
				if (arg0 > arg2) {
					arg0++;
				} else {
					arg2++;
				}
			} else {
				arg2--;
				if (arg0 > arg1) {
					arg0++;
				} else {
					arg1++;
				}
			}
			int var19 = 0;
			if (arg0 != arg1) {
				var19 = (arg4 - arg3 << 12) / (arg1 - arg0);
			}
			int var20 = 0;
			if (arg1 != arg2) {
				var20 = (arg5 - arg4 << 12) / (arg2 - arg1);
			}
			int var21 = 0;
			if (arg0 != arg2) {
				var21 = (arg3 - arg5 << 12) / (arg0 - arg2);
			}
			int var22 = var13 * var16 - var14 * var15;
			if (var22 == 0) {
				return false;
			}
			int var23 = (var16 * var17 - var14 * var18 << 8) / var22;
			int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
			if (arg0 <= arg1 && arg0 <= arg2) {
				if (arg0 >= this.field6894.field7045) {
					return true;
				}
				if (arg1 > this.field6894.field7045) {
					arg1 = this.field6894.field7045;
				}
				if (arg2 > this.field6894.field7045) {
					arg2 = this.field6894.field7045;
				}
				int var25 = (arg6 << 8) - arg3 * var23 + var23;
				if (arg1 < arg2) {
					int var26;
					int var27 = var26 = arg3 << 12;
					if (arg0 < 0) {
						var27 -= arg0 * var21;
						var26 -= arg0 * var19;
						var25 -= arg0 * var24;
						arg0 = 0;
					}
					int var28 = arg4 << 12;
					if (arg1 < 0) {
						var28 -= arg1 * var20;
						arg1 = 0;
					}
					if (arg0 != arg1 && var21 < var19 || arg0 == arg1 && var21 > var20) {
						int var29 = arg2 - arg1;
						int var30 = arg1 - arg0;
						int var31 = this.field6894.field7044 * arg0;
						while (true) {
							var30--;
							if (var30 < 0) {
								while (true) {
									var29--;
									if (var29 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var31, 0, (var27 >> 12) - 1, (var28 >> 12) + 1, var25, var23, this.field6894.field7044)) {
										return false;
									}
									var27 += var21;
									var28 += var20;
									var25 += var24;
									var31 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var31, 0, (var27 >> 12) - 1, (var26 >> 12) + 1, var25, var23, this.field6894.field7044)) {
								return false;
							}
							var27 += var21;
							var26 += var19;
							var25 += var24;
							var31 += this.field6894.field7044;
						}
					} else {
						int var32 = arg2 - arg1;
						int var33 = arg1 - arg0;
						int var34 = this.field6894.field7044 * arg0;
						while (true) {
							var33--;
							if (var33 < 0) {
								while (true) {
									var32--;
									if (var32 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var34, 0, (var28 >> 12) - 1, (var27 >> 12) + 1, var25, var23, this.field6894.field7044)) {
										return false;
									}
									var27 += var21;
									var28 += var20;
									var25 += var24;
									var34 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var34, 0, (var26 >> 12) - 1, (var27 >> 12) + 1, var25, var23, this.field6894.field7044)) {
								return false;
							}
							var27 += var21;
							var26 += var19;
							var25 += var24;
							var34 += this.field6894.field7044;
						}
					}
				} else {
					int var35;
					int var36 = var35 = arg3 << 12;
					if (arg0 < 0) {
						var36 -= arg0 * var21;
						var35 -= arg0 * var19;
						var25 -= arg0 * var24;
						arg0 = 0;
					}
					int var37 = arg5 << 12;
					if (arg2 < 0) {
						var37 -= arg2 * var20;
						arg2 = 0;
					}
					if (arg0 != arg2 && var21 < var19 || arg0 == arg2 && var20 > var19) {
						int var38 = arg1 - arg2;
						int var39 = arg2 - arg0;
						int var40 = this.field6894.field7044 * arg0;
						while (true) {
							var39--;
							if (var39 < 0) {
								while (true) {
									var38--;
									if (var38 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var40, 0, (var37 >> 12) - 1, (var35 >> 12) + 1, var25, var23, this.field6894.field7044)) {
										return false;
									}
									var37 += var20;
									var35 += var19;
									var25 += var24;
									var40 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var40, 0, (var36 >> 12) - 1, (var35 >> 12) + 1, var25, var23, this.field6894.field7044)) {
								return false;
							}
							var36 += var21;
							var35 += var19;
							var25 += var24;
							var40 += this.field6894.field7044;
						}
					} else {
						int var41 = arg1 - arg2;
						int var42 = arg2 - arg0;
						int var43 = this.field6894.field7044 * arg0;
						while (true) {
							var42--;
							if (var42 < 0) {
								while (true) {
									var41--;
									if (var41 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var43, 0, (var35 >> 12) - 1, (var37 >> 12) + 1, var25, var23, this.field6894.field7044)) {
										return false;
									}
									var37 += var20;
									var35 += var19;
									var25 += var24;
									var43 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var43, 0, (var35 >> 12) - 1, (var36 >> 12) + 1, var25, var23, this.field6894.field7044)) {
								return false;
							}
							var36 += var21;
							var35 += var19;
							var25 += var24;
							var43 += this.field6894.field7044;
						}
					}
				}
			} else if (arg1 > arg2) {
				if (arg2 >= this.field6894.field7045) {
					return true;
				}
				if (arg0 > this.field6894.field7045) {
					arg0 = this.field6894.field7045;
				}
				if (arg1 > this.field6894.field7045) {
					arg1 = this.field6894.field7045;
				}
				int var63 = (arg8 << 8) - arg5 * var23 + var23;
				if (arg0 < arg1) {
					int var64;
					int var65 = var64 = arg5 << 12;
					if (arg2 < 0) {
						var65 -= arg2 * var20;
						var64 -= arg2 * var21;
						var63 -= arg2 * var24;
						arg2 = 0;
					}
					int var66 = arg3 << 12;
					if (arg0 < 0) {
						var66 -= arg0 * var19;
						arg0 = 0;
					}
					if (var20 < var21) {
						int var67 = arg1 - arg0;
						int var68 = arg0 - arg2;
						int var69 = this.field6894.field7044 * arg2;
						while (true) {
							var68--;
							if (var68 < 0) {
								while (true) {
									var67--;
									if (var67 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var69, 0, (var65 >> 12) - 1, (var66 >> 12) + 1, var63, var23, this.field6894.field7044)) {
										return false;
									}
									var65 += var20;
									var66 += var19;
									var63 += var24;
									var69 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var69, 0, (var65 >> 12) - 1, (var64 >> 12) + 1, var63, var23, this.field6894.field7044)) {
								return false;
							}
							var65 += var20;
							var64 += var21;
							var63 += var24;
							var69 += this.field6894.field7044;
						}
					} else {
						int var70 = arg1 - arg0;
						int var71 = arg0 - arg2;
						int var72 = this.field6894.field7044 * arg2;
						while (true) {
							var71--;
							if (var71 < 0) {
								while (true) {
									var70--;
									if (var70 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var72, 0, (var66 >> 12) - 1, (var65 >> 12) + 1, var63, var23, this.field6894.field7044)) {
										return false;
									}
									var65 += var20;
									var66 += var19;
									var63 += var24;
									var72 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var72, 0, (var64 >> 12) - 1, (var65 >> 12) + 1, var63, var23, this.field6894.field7044)) {
								return false;
							}
							var65 += var20;
							var64 += var21;
							var63 += var24;
							var72 += this.field6894.field7044;
						}
					}
				} else {
					int var73;
					int var74 = var73 = arg5 << 12;
					if (arg2 < 0) {
						var74 -= arg2 * var20;
						var73 -= arg2 * var21;
						var63 -= arg2 * var24;
						arg2 = 0;
					}
					int var75 = arg4 << 12;
					if (arg1 < 0) {
						var75 -= arg1 * var19;
						arg1 = 0;
					}
					if (var20 < var21) {
						int var76 = arg0 - arg1;
						int var77 = arg1 - arg2;
						int var78 = this.field6894.field7044 * arg2;
						while (true) {
							var77--;
							if (var77 < 0) {
								while (true) {
									var76--;
									if (var76 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var78, 0, (var75 >> 12) - 1, (var73 >> 12) + 1, var63, var23, this.field6894.field7044)) {
										return false;
									}
									var75 += var19;
									var73 += var21;
									var63 += var24;
									var78 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var78, 0, (var74 >> 12) - 1, (var73 >> 12) + 1, var63, var23, this.field6894.field7044)) {
								return false;
							}
							var74 += var20;
							var73 += var21;
							var63 += var24;
							var78 += this.field6894.field7044;
						}
					} else {
						int var79 = arg0 - arg1;
						int var80 = arg1 - arg2;
						int var81 = this.field6894.field7044 * arg2;
						while (true) {
							var80--;
							if (var80 < 0) {
								while (true) {
									var79--;
									if (var79 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var81, 0, (var73 >> 12) - 1, (var75 >> 12) + 1, var63, var23, this.field6894.field7044)) {
										return false;
									}
									var75 += var19;
									var73 += var21;
									var63 += var24;
									var81 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var81, 0, (var73 >> 12) - 1, (var74 >> 12) + 1, var63, var23, this.field6894.field7044)) {
								return false;
							}
							var74 += var20;
							var73 += var21;
							var63 += var24;
							var81 += this.field6894.field7044;
						}
					}
				}
			} else if (arg1 >= this.field6894.field7045) {
				return true;
			} else {
				if (arg2 > this.field6894.field7045) {
					arg2 = this.field6894.field7045;
				}
				if (arg0 > this.field6894.field7045) {
					arg0 = this.field6894.field7045;
				}
				int var44 = (arg7 << 8) - arg4 * var23 + var23;
				if (arg2 >= arg0) {
					int var54;
					int var55 = var54 = arg4 << 12;
					if (arg1 < 0) {
						var55 -= arg1 * var19;
						var54 -= arg1 * var20;
						var44 -= arg1 * var24;
						arg1 = 0;
					}
					int var56 = arg3 << 12;
					if (arg0 < 0) {
						var56 -= arg0 * var21;
						arg0 = 0;
					}
					if (var19 < var20) {
						int var57 = arg2 - arg0;
						int var58 = arg0 - arg1;
						int var59 = this.field6894.field7044 * arg1;
						while (true) {
							var58--;
							if (var58 < 0) {
								while (true) {
									var57--;
									if (var57 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var59, 0, (var56 >> 12) - 1, (var54 >> 12) + 1, var44, var23, this.field6894.field7044)) {
										return false;
									}
									var56 += var21;
									var54 += var20;
									var44 += var24;
									var59 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var59, 0, (var55 >> 12) - 1, (var54 >> 12) + 1, var44, var23, this.field6894.field7044)) {
								return false;
							}
							var55 += var19;
							var54 += var20;
							var44 += var24;
							var59 += this.field6894.field7044;
						}
					} else {
						int var60 = arg2 - arg0;
						int var61 = arg0 - arg1;
						int var62 = this.field6894.field7044 * arg1;
						while (true) {
							var61--;
							if (var61 < 0) {
								while (true) {
									var60--;
									if (var60 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var62, 0, (var54 >> 12) - 1, (var56 >> 12) + 1, var44, var23, this.field6894.field7044)) {
										return false;
									}
									var56 += var21;
									var54 += var20;
									var44 += var24;
									var62 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var62, 0, (var54 >> 12) - 1, (var55 >> 12) + 1, var44, var23, this.field6894.field7044)) {
								return false;
							}
							var55 += var19;
							var54 += var20;
							var44 += var24;
							var62 += this.field6894.field7044;
						}
					}
				} else {
					int var45;
					int var46 = var45 = arg4 << 12;
					if (arg1 < 0) {
						var46 -= arg1 * var19;
						var45 -= arg1 * var20;
						var44 -= arg1 * var24;
						arg1 = 0;
					}
					int var47 = arg5 << 12;
					if (arg2 < 0) {
						var47 -= arg2 * var21;
						arg2 = 0;
					}
					if (arg1 != arg2 && var19 < var20 || arg1 == arg2 && var19 > var21) {
						int var48 = arg0 - arg2;
						int var49 = arg2 - arg1;
						int var50 = this.field6894.field7044 * arg1;
						while (true) {
							var49--;
							if (var49 < 0) {
								while (true) {
									var48--;
									if (var48 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var50, 0, (var46 >> 12) - 1, (var47 >> 12) + 1, var44, var23, this.field6894.field7044)) {
										return false;
									}
									var46 += var19;
									var47 += var21;
									var44 += var24;
									var50 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var50, 0, (var46 >> 12) - 1, (var45 >> 12) + 1, var44, var23, this.field6894.field7044)) {
								return false;
							}
							var46 += var19;
							var45 += var20;
							var44 += var24;
							var50 += this.field6894.field7044;
						}
					} else {
						int var51 = arg0 - arg2;
						int var52 = arg2 - arg1;
						int var53 = this.field6894.field7044 * arg1;
						while (true) {
							var52--;
							if (var52 < 0) {
								while (true) {
									var51--;
									if (var51 < 0) {
										return true;
									}
									if (!this.method8694(this.field6894.field7032, var53, 0, (var47 >> 12) - 1, (var46 >> 12) + 1, var44, var23, this.field6894.field7044)) {
										return false;
									}
									var46 += var19;
									var47 += var21;
									var44 += var24;
									var53 += this.field6894.field7044;
								}
							}
							if (!this.method8694(this.field6894.field7032, var53, 0, (var45 >> 12) - 1, (var46 >> 12) + 1, var44, var23, this.field6894.field7044)) {
								return false;
							}
							var46 += var19;
							var45 += var20;
							var44 += var24;
							var53 += this.field6894.field7044;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("tq.n([IIIIIIII)Z")
	public final boolean method8694(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg4 > arg7) {
			arg4 = arg7;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg3 >= arg4) {
			return true;
		}
		int var9 = arg3 - 1 + arg1;
		int var10 = arg4 - arg3 >> 2;
		int var11 = arg3 * arg6 + arg5;
		if (this.field6895 == 1) {
			this.field6896 += var10;
			while (true) {
				var10--;
				if (var10 < 0) {
					int var15 = arg4 - arg3 & 0x3;
					while (true) {
						var15--;
						if (var15 < 0) {
							return true;
						}
						var9++;
						if (var11 < arg0[var9]) {
							arg0[var9] = var11;
						}
						var11 += arg6;
					}
				}
				var9++;
				if (var11 < arg0[var9]) {
					arg0[var9] = var11;
				}
				int var12 = arg6 + var11;
				var9++;
				if (var12 < arg0[var9]) {
					arg0[var9] = var12;
				}
				int var13 = arg6 + var12;
				var9++;
				if (var13 < arg0[var9]) {
					arg0[var9] = var13;
				}
				int var14 = arg6 + var13;
				var9++;
				if (var14 < arg0[var9]) {
					arg0[var9] = var14;
				}
				var11 = arg6 + var14;
			}
		} else {
			int var16 = var11 - 38656;
			while (true) {
				var10--;
				if (var10 < 0) {
					int var20 = arg4 - arg3 & 0x3;
					while (true) {
						var20--;
						if (var20 < 0) {
							return true;
						}
						var9++;
						if (var16 < arg0[var9]) {
							return false;
						}
						var16 += arg6;
					}
				}
				var9++;
				if (var16 < arg0[var9]) {
					return false;
				}
				int var17 = arg6 + var16;
				var9++;
				if (var17 < arg0[var9]) {
					return false;
				}
				int var18 = arg6 + var17;
				var9++;
				if (var18 < arg0[var9]) {
					return false;
				}
				int var19 = arg6 + var18;
				var9++;
				if (var19 < arg0[var9]) {
					return false;
				}
				var16 = arg6 + var19;
			}
		}
	}
}
