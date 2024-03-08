package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("atk")
public class class1222 extends class1175 {

	@ObfuscatedName("atk.u")
	public int field12538;

	@ObfuscatedName("atk.z")
	public int field12541;

	@ObfuscatedName("atk.p")
	public int field12540;

	@ObfuscatedName("atk.d")
	public int field12537;

	@ObfuscatedName("atk.c")
	public final byte[] field12542;

	public class1222(class849 arg0, int arg1, int arg2) {
		this.field12542 = new byte[arg1 * arg2];
	}

	@ObfuscatedName("atk.e(IIII)V")
	public void method19686(int arg0, int arg1, int arg2, int arg3) {
		this.field12540 = arg0;
		this.field12537 = arg1;
		this.field12538 = arg2 - arg0;
		this.field12541 = arg3 - arg1;
	}

	@ObfuscatedName("atk.n(II)Z")
	public boolean method19687(int arg0, int arg1) {
		return this.field12542.length >= arg0 * arg1;
	}

	@ObfuscatedName("atk.m()V")
	public void method19693() {
		int var1 = -1;
		int var2 = this.field12542.length - 8;
		while (var1 < var2) {
			var1++;
			this.field12542[var1] = 0;
			var1++;
			this.field12542[var1] = 0;
			var1++;
			this.field12542[var1] = 0;
			var1++;
			this.field12542[var1] = 0;
			var1++;
			this.field12542[var1] = 0;
			var1++;
			this.field12542[var1] = 0;
			var1++;
			this.field12542[var1] = 0;
			var1++;
			this.field12542[var1] = 0;
		}
		while (var1 < this.field12542.length - 1) {
			var1++;
			this.field12542[var1] = 0;
		}
	}

	@ObfuscatedName("atk.k(IIIIII)V")
	public void method19689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		if (arg0 != arg1) {
			var7 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		int var8 = 0;
		if (arg1 != arg2) {
			var8 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		int var9 = 0;
		if (arg0 != arg2) {
			var9 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg1 < arg2) {
				int var10;
				int var11 = var10 = arg3 << 16;
				if (arg0 < 0) {
					var11 -= arg0 * var9;
					var10 -= arg0 * var7;
					arg0 = 0;
				}
				int var12 = arg4 << 16;
				if (arg1 < 0) {
					var12 -= arg1 * var8;
					arg1 = 0;
				}
				if ((arg0 == arg1 || var9 >= var7) && (arg0 != arg1 || var9 <= var8)) {
					int var16 = arg2 - arg1;
					int var17 = arg1 - arg0;
					int var18 = this.field12538 * arg0;
					while (true) {
						var17--;
						if (var17 < 0) {
							while (true) {
								var16--;
								if (var16 < 0) {
									return;
								}
								method19685(this.field12542, var18, 0, var12 >> 16, var11 >> 16);
								var11 += var9;
								var12 += var8;
								var18 += this.field12538;
							}
						}
						method19685(this.field12542, var18, 0, var10 >> 16, var11 >> 16);
						var11 += var9;
						var10 += var7;
						var18 += this.field12538;
					}
				} else {
					int var13 = arg2 - arg1;
					int var14 = arg1 - arg0;
					int var15 = this.field12538 * arg0;
					while (true) {
						var14--;
						if (var14 < 0) {
							while (true) {
								var13--;
								if (var13 < 0) {
									return;
								}
								method19685(this.field12542, var15, 0, var11 >> 16, var12 >> 16);
								var11 += var9;
								var12 += var8;
								var15 += this.field12538;
							}
						}
						method19685(this.field12542, var15, 0, var11 >> 16, var10 >> 16);
						var11 += var9;
						var10 += var7;
						var15 += this.field12538;
					}
				}
			} else {
				int var19;
				int var20 = var19 = arg3 << 16;
				if (arg0 < 0) {
					var20 -= arg0 * var9;
					var19 -= arg0 * var7;
					arg0 = 0;
				}
				int var21 = arg5 << 16;
				if (arg2 < 0) {
					var21 -= arg2 * var8;
					arg2 = 0;
				}
				if ((arg0 == arg2 || var9 >= var7) && (arg0 != arg2 || var8 <= var7)) {
					int var25 = arg1 - arg2;
					int var26 = arg2 - arg0;
					int var27 = this.field12538 * arg0;
					while (true) {
						var26--;
						if (var26 < 0) {
							while (true) {
								var25--;
								if (var25 < 0) {
									return;
								}
								method19685(this.field12542, var27, 0, var19 >> 16, var21 >> 16);
								var21 += var8;
								var19 += var7;
								var27 += this.field12538;
							}
						}
						method19685(this.field12542, var27, 0, var19 >> 16, var20 >> 16);
						var20 += var9;
						var19 += var7;
						var27 += this.field12538;
					}
				} else {
					int var22 = arg1 - arg2;
					int var23 = arg2 - arg0;
					int var24 = this.field12538 * arg0;
					while (true) {
						var23--;
						if (var23 < 0) {
							while (true) {
								var22--;
								if (var22 < 0) {
									return;
								}
								method19685(this.field12542, var24, 0, var21 >> 16, var19 >> 16);
								var21 += var8;
								var19 += var7;
								var24 += this.field12538;
							}
						}
						method19685(this.field12542, var24, 0, var20 >> 16, var19 >> 16);
						var20 += var9;
						var19 += var7;
						var24 += this.field12538;
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg2 < arg0) {
				int var28;
				int var29 = var28 = arg4 << 16;
				if (arg1 < 0) {
					var29 -= arg1 * var7;
					var28 -= arg1 * var8;
					arg1 = 0;
				}
				int var30 = arg5 << 16;
				if (arg2 < 0) {
					var30 -= arg2 * var9;
					arg2 = 0;
				}
				if (arg1 != arg2 && var7 < var8 || arg1 == arg2 && var7 > var9) {
					int var31 = arg0 - arg2;
					int var32 = arg2 - arg1;
					int var33 = this.field12538 * arg1;
					while (true) {
						var32--;
						if (var32 < 0) {
							while (true) {
								var31--;
								if (var31 < 0) {
									return;
								}
								method19685(this.field12542, var33, 0, var29 >> 16, var30 >> 16);
								var29 += var7;
								var30 += var9;
								var33 += this.field12538;
							}
						}
						method19685(this.field12542, var33, 0, var29 >> 16, var28 >> 16);
						var29 += var7;
						var28 += var8;
						var33 += this.field12538;
					}
				} else {
					int var34 = arg0 - arg2;
					int var35 = arg2 - arg1;
					int var36 = this.field12538 * arg1;
					while (true) {
						var35--;
						if (var35 < 0) {
							while (true) {
								var34--;
								if (var34 < 0) {
									return;
								}
								method19685(this.field12542, var36, 0, var30 >> 16, var29 >> 16);
								var29 += var7;
								var30 += var9;
								var36 += this.field12538;
							}
						}
						method19685(this.field12542, var36, 0, var28 >> 16, var29 >> 16);
						var29 += var7;
						var28 += var8;
						var36 += this.field12538;
					}
				}
			} else {
				int var37;
				int var38 = var37 = arg4 << 16;
				if (arg1 < 0) {
					var38 -= arg1 * var7;
					var37 -= arg1 * var8;
					arg1 = 0;
				}
				int var39 = arg3 << 16;
				if (arg0 < 0) {
					var39 -= arg0 * var9;
					arg0 = 0;
				}
				if (var7 < var8) {
					int var40 = arg2 - arg0;
					int var41 = arg0 - arg1;
					int var42 = this.field12538 * arg1;
					while (true) {
						var41--;
						if (var41 < 0) {
							while (true) {
								var40--;
								if (var40 < 0) {
									return;
								}
								method19685(this.field12542, var42, 0, var39 >> 16, var37 >> 16);
								var39 += var9;
								var37 += var8;
								var42 += this.field12538;
							}
						}
						method19685(this.field12542, var42, 0, var38 >> 16, var37 >> 16);
						var38 += var7;
						var37 += var8;
						var42 += this.field12538;
					}
				} else {
					int var43 = arg2 - arg0;
					int var44 = arg0 - arg1;
					int var45 = this.field12538 * arg1;
					while (true) {
						var44--;
						if (var44 < 0) {
							while (true) {
								var43--;
								if (var43 < 0) {
									return;
								}
								method19685(this.field12542, var45, 0, var37 >> 16, var39 >> 16);
								var39 += var9;
								var37 += var8;
								var45 += this.field12538;
							}
						}
						method19685(this.field12542, var45, 0, var37 >> 16, var38 >> 16);
						var38 += var7;
						var37 += var8;
						var45 += this.field12538;
					}
				}
			}
		} else if (arg0 < arg1) {
			int var46;
			int var47 = var46 = arg5 << 16;
			if (arg2 < 0) {
				var47 -= arg2 * var8;
				var46 -= arg2 * var9;
				arg2 = 0;
			}
			int var48 = arg3 << 16;
			if (arg0 < 0) {
				var48 -= arg0 * var7;
				arg0 = 0;
			}
			if (var8 < var9) {
				int var49 = arg1 - arg0;
				int var50 = arg0 - arg2;
				int var51 = this.field12538 * arg2;
				while (true) {
					var50--;
					if (var50 < 0) {
						while (true) {
							var49--;
							if (var49 < 0) {
								return;
							}
							method19685(this.field12542, var51, 0, var47 >> 16, var48 >> 16);
							var47 += var8;
							var48 += var7;
							var51 += this.field12538;
						}
					}
					method19685(this.field12542, var51, 0, var47 >> 16, var46 >> 16);
					var47 += var8;
					var46 += var9;
					var51 += this.field12538;
				}
			} else {
				int var52 = arg1 - arg0;
				int var53 = arg0 - arg2;
				int var54 = this.field12538 * arg2;
				while (true) {
					var53--;
					if (var53 < 0) {
						while (true) {
							var52--;
							if (var52 < 0) {
								return;
							}
							method19685(this.field12542, var54, 0, var48 >> 16, var47 >> 16);
							var47 += var8;
							var48 += var7;
							var54 += this.field12538;
						}
					}
					method19685(this.field12542, var54, 0, var46 >> 16, var47 >> 16);
					var47 += var8;
					var46 += var9;
					var54 += this.field12538;
				}
			}
		} else {
			int var55;
			int var56 = var55 = arg5 << 16;
			if (arg2 < 0) {
				var56 -= arg2 * var8;
				var55 -= arg2 * var9;
				arg2 = 0;
			}
			int var57 = arg4 << 16;
			if (arg1 < 0) {
				var57 -= arg1 * var7;
				arg1 = 0;
			}
			if (var8 < var9) {
				int var58 = arg0 - arg1;
				int var59 = arg1 - arg2;
				int var60 = this.field12538 * arg2;
				while (true) {
					var59--;
					if (var59 < 0) {
						while (true) {
							var58--;
							if (var58 < 0) {
								return;
							}
							method19685(this.field12542, var60, 0, var57 >> 16, var55 >> 16);
							var57 += var7;
							var55 += var9;
							var60 += this.field12538;
						}
					}
					method19685(this.field12542, var60, 0, var56 >> 16, var55 >> 16);
					var56 += var8;
					var55 += var9;
					var60 += this.field12538;
				}
			} else {
				int var61 = arg0 - arg1;
				int var62 = arg1 - arg2;
				int var63 = this.field12538 * arg2;
				while (true) {
					var62--;
					if (var62 < 0) {
						while (true) {
							var61--;
							if (var61 < 0) {
								return;
							}
							method19685(this.field12542, var63, 0, var55 >> 16, var57 >> 16);
							var57 += var7;
							var55 += var9;
							var63 += this.field12538;
						}
					}
					method19685(this.field12542, var63, 0, var55 >> 16, var56 >> 16);
					var56 += var8;
					var55 += var9;
					var63 += this.field12538;
				}
			}
		}
	}

	@ObfuscatedName("atk.f([BIIII)V")
	public static final void method19685(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		int var5 = arg1 + arg3;
		int var6 = arg4 - arg3 >> 2;
		while (true) {
			var6--;
			if (var6 < 0) {
				int var7 = arg4 - arg3 & 0x3;
				while (true) {
					var7--;
					if (var7 < 0) {
						return;
					}
					arg0[var5++] = 1;
				}
			}
			arg0[var5++] = 1;
			arg0[var5++] = 1;
			arg0[var5++] = 1;
			arg0[var5++] = 1;
		}
	}
}
