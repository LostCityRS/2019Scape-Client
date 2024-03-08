package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("xg")
public class class639 {

	@ObfuscatedName("xg.u")
	public int field7891;

	@ObfuscatedName("xg.z")
	public int[] field7890;

	@ObfuscatedName("xg.p")
	public class740[] field7887;

	@ObfuscatedName("xg.d")
	public int[] field7894;

	@ObfuscatedName("xg.c")
	public int[] field7895;

	@ObfuscatedName("xg.r")
	public boolean field7897;

	@ObfuscatedName("xg.v")
	public int field7892 = -1;

	@ObfuscatedName("xg.o")
	public long field7888;

	@ObfuscatedName("xg.s")
	public long field7899;

	@ObfuscatedName("xg.h")
	public static final int[] field7900 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@ObfuscatedName("xg.a")
	public static class162 field7901 = new class162(260);

	@ObfuscatedName("xg.g")
	public static class162 field7902 = new class162(5);

	@ObfuscatedName("xg.e(I[I[Labw;[I[IZII)V")
	public void method10113(int arg0, int[] arg1, class740[] arg2, int[] arg3, int[] arg4, boolean arg5, int arg6) {
		if (this.field7891 != arg0) {
			this.field7891 = arg0;
		}
		this.field7890 = arg1;
		this.field7887 = arg2;
		this.field7894 = arg3;
		this.field7895 = arg4;
		this.field7897 = arg5;
		this.field7892 = arg6;
		this.method10118();
	}

	@ObfuscatedName("xg.n(IILaov;I)V")
	public void method10114(int arg0, int arg1, class1084 arg2) {
		int var4 = field7900[arg0];
		if (arg2.method962(arg1) != null) {
			this.field7890[var4] = arg1 | Integer.MIN_VALUE;
			this.method10118();
		}
	}

	@ObfuscatedName("xg.m(III)V")
	public void method10115(int arg0, int arg1) {
		this.field7894[arg0] = arg1;
		this.method10118();
	}

	@ObfuscatedName("xg.k(IIB)V")
	public void method10142(int arg0, int arg1) {
		this.field7895[arg0] = arg1;
		this.method10118();
	}

	@ObfuscatedName("xg.f(ZB)V")
	public void method10141(boolean arg0) {
		this.field7897 = arg0;
		this.method10118();
	}

	@ObfuscatedName("xg.w(IILaon;B)V")
	public void method10112(int arg0, int arg1, class1095 arg2) {
		if (arg1 == -1) {
			this.field7890[arg0] = 0;
		} else if (arg2.method962(arg1) == null) {
			return;
		} else {
			this.field7890[arg0] = arg1 | 0x40000000;
			this.method10118();
		}
	}

	@ObfuscatedName("xg.l(I)V")
	public void method10118() {
		long[] var1 = class997.field11507;
		this.field7888 = -1L;
		this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7891 >> 8)) & 0xFFL)];
		this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7891) & 0xFFL)];
		for (int var2 = 0; var2 < this.field7890.length; var2++) {
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7890[var2] >> 24)) & 0xFFL)];
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7890[var2] >> 16)) & 0xFFL)];
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7890[var2] >> 8)) & 0xFFL)];
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7890[var2]) & 0xFFL)];
		}
		if (this.field7887 != null) {
			for (int var3 = 0; var3 < this.field7887.length; var3++) {
				if (this.field7887[var3] != null) {
					int[] var4;
					int[] var5;
					if (this.field7897) {
						var4 = this.field7887[var3].field8708;
						var5 = this.field7887[var3].field8713;
					} else {
						var4 = this.field7887[var3].field8710;
						var5 = this.field7887[var3].field8709;
					}
					if (var4 != null) {
						for (int var6 = 0; var6 < var4.length; var6++) {
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (var4[var6] >> 8)) & 0xFFL)];
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) var4[var6]) & 0xFFL)];
						}
					}
					if (var5 != null) {
						for (int var7 = 0; var7 < var5.length; var7++) {
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (var5[var7] >> 8)) & 0xFFL)];
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) var5[var7]) & 0xFFL)];
						}
					}
					if (this.field7887[var3].field8714 != null) {
						for (int var8 = 0; var8 < this.field7887[var3].field8714.length; var8++) {
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7887[var3].field8714[var8] >> 8)) & 0xFFL)];
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7887[var3].field8714[var8]) & 0xFFL)];
						}
					}
					if (this.field7887[var3].field8715 != null) {
						for (int var9 = 0; var9 < this.field7887[var3].field8715.length; var9++) {
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7887[var3].field8715[var9] >> 8)) & 0xFFL)];
							this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7887[var3].field8715[var9]) & 0xFFL)];
						}
					}
				}
			}
		}
		for (int var10 = 0; var10 < 10; var10++) {
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7894[var10]) & 0xFFL)];
		}
		for (int var11 = 0; var11 < 10; var11++) {
			this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) this.field7895[var11]) & 0xFFL)];
		}
		this.field7888 = this.field7888 >>> 8 ^ var1[(int) ((this.field7888 ^ (long) (this.field7897 ? 1 : 0)) & 0xFFL)];
	}

	@ObfuscatedName("xg.u(Ldh;ILaof;Laov;Laod;Laon;Lem;Lep;Laaq;Laaq;[Laaq;[IIZLwy;B)Ldo;")
	public class116 method10126(class133 arg0, int arg1, class1089 arg2, class1084 arg3, class1082 arg4, class1095 arg5, class151 arg6, class147 arg7, class721 arg8, class721 arg9, class721[] arg10, int[] arg11, int arg12, boolean arg13, class631 arg14) {
		if (this.field7892 != -1) {
			return ((class260) arg4.method962(this.field7892)).method4542(arg0, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null);
		}
		int var16 = arg1;
		long var17 = this.field7888;
		int[] var19 = this.field7890;
		boolean var20 = false;
		boolean var21 = false;
		if (arg8 != null) {
			class164 var22 = arg8.method14347();
			if (var22 != null && (var22.field1780 >= 0 || var22.field1781 >= 0)) {
				var19 = new int[this.field7890.length];
				for (int var23 = 0; var23 < var19.length; var23++) {
					var19[var23] = this.field7890[var23];
				}
				if (var22.field1780 >= 0 && arg14.field7763 != -1) {
					var20 = true;
					if (var22.field1780 == 65535) {
						var19[arg14.field7763] = 0;
						for (int var24 = 0; var24 < arg14.field7769.length; var24++) {
							var19[arg14.field7769[var24]] = 0;
						}
						var17 ^= 0xFFFFFFFF00000000L;
					} else {
						var19[arg14.field7763] = var22.field1780 | 0x40000000;
						for (int var25 = 0; var25 < arg14.field7769.length; var25++) {
							var19[arg14.field7769[var25]] = 0;
						}
						var17 ^= (long) var19[arg14.field7763] << 32;
					}
				}
				if (var22.field1781 >= 0 && arg14.field7770 != -1) {
					var21 = true;
					if (var22.field1781 == 65535) {
						var19[arg14.field7770] = 0;
						for (int var26 = 0; var26 < arg14.field7767.length; var26++) {
							var19[arg14.field7767[var26]] = 0;
						}
						var17 ^= 0xFFFFFFFFL;
					} else {
						var19[arg14.field7770] = var22.field1781 | 0x40000000;
						for (int var27 = 0; var27 < arg14.field7767.length; var27++) {
							var19[arg14.field7767[var27]] = 0;
						}
						var17 ^= var19[arg14.field7770];
					}
				}
			}
		}
		boolean var28 = false;
		int var29 = arg10 == null ? 0 : arg10.length;
		for (int var30 = 0; var30 < var29; var30++) {
			if (arg10[var30] != null) {
				var16 |= arg10[var30].method14358();
				var28 = true;
			}
		}
		if (arg8 != null) {
			var16 |= arg8.method14358();
			var28 = true;
		}
		if (arg9 != null) {
			var16 |= arg9.method14358();
			var28 = true;
		}
		boolean var31 = false;
		if (arg11 != null) {
			for (int var32 = 0; var32 < arg11.length; var32++) {
				if (arg11[var32] != -1) {
					var16 |= 0x20;
					var31 = true;
				}
			}
		}
		class162 var33 = field7901;
		class116 var34;
		synchronized (field7901) {
			var34 = (class116) field7901.method2930(var17);
		}
		class584 var36 = null;
		if (this.field7891 != -1) {
			var36 = (class584) arg2.method962(this.field7891);
		}
		if (var34 == null || arg0.method2394(var34.method1691(), var16) != 0) {
			if (var34 != null) {
				var16 = arg0.method2213(var16, var34.method1691());
			}
			boolean var38 = false;
			int var39 = 0;
			while (true) {
				if (var39 >= var19.length) {
					if (var38) {
						if (this.field7899 != -1L) {
							class162 var45 = field7901;
							synchronized (field7901) {
								var34 = (class116) field7901.method2930(this.field7899);
							}
						}
						if (var34 == null || arg0.method2394(var34.method1691(), var16) != 0) {
							return null;
						}
					} else {
						class120[] var47 = new class120[var19.length];
						for (int var48 = 0; var48 < var19.length; var48++) {
							int var49 = var19[var48];
							class740 var50 = null;
							boolean var51 = var48 == 5 && var20 || var48 == 3 && var21;
							if ((var49 & 0x40000000) != 0) {
								if (!var51 && this.field7887 != null && this.field7887[var48] != null) {
									var50 = this.field7887[var48];
								}
								class120 var52 = ((class738) arg5.method962(var49 & 0x3FFFFFFF)).method14650(this.field7897, var50);
								if (var52 != null) {
									var47[var48] = var52;
								}
							} else if ((var49 & Integer.MIN_VALUE) != 0) {
								class120 var53 = ((class283) arg3.method962(var49 & 0x3FFFFFFF)).method5000();
								if (var53 != null) {
									var47[var48] = var53;
								}
							}
						}
						if (var36 != null && var36.field7357 != null) {
							for (int var54 = 0; var54 < var36.field7357.length; var54++) {
								if (var47[var54] != null) {
									int var55 = 0;
									int var56 = 0;
									int var57 = 0;
									int var58 = 0;
									int var59 = 0;
									int var60 = 0;
									if (var36.field7357[var54] != null) {
										var55 = var36.field7357[var54][0];
										var56 = var36.field7357[var54][1];
										var57 = var36.field7357[var54][2];
										var58 = var36.field7357[var54][3] << 3;
										var59 = var36.field7357[var54][4] << 3;
										var60 = var36.field7357[var54][5] << 3;
									}
									if (var58 != 0 || var59 != 0 || var60 != 0) {
										var47[var54].method1946(var58, var59, var60);
									}
									if (var55 != 0 || var56 != 0 || var57 != 0) {
										var47[var54].method1945(var55, var56, var57);
									}
								}
							}
						}
						class120 var61 = new class120(var47, var47.length);
						int var62 = var16 | 0x4000;
						var34 = arg0.method2211(var61, var62, Statics.field4037, 64, 850);
						for (int var63 = 0; var63 < 10; var63++) {
							for (int var64 = 0; var64 < Statics.field7577[var63].length; var64++) {
								if (this.field7894[var63] < Statics.field1434[var63][var64].length) {
									var34.method1859(Statics.field7577[var63][var64], Statics.field1434[var63][var64][this.field7894[var63]]);
								}
							}
						}
						for (int var65 = 0; var65 < 10; var65++) {
							for (int var66 = 0; var66 < Statics.field10766[var65].length; var66++) {
								if (this.field7895[var65] < Statics.field9259[var65][var66].length) {
									var34.method1744(Statics.field10766[var65][var66], Statics.field9259[var65][var66][this.field7895[var65]]);
								}
							}
						}
						var34.method1736();
						if (arg13) {
							var34.method1690(var16);
							class162 var67 = field7901;
							synchronized (field7901) {
								field7901.method2921(var34, var17);
							}
							this.field7899 = var17;
						}
					}
					break;
				}
				int var40 = var19[var39];
				class740 var41 = null;
				boolean var42 = false;
				if (var20) {
					if (arg14.field7763 == var39) {
						var42 = true;
					} else {
						for (int var43 = 0; var43 < arg14.field7769.length; var43++) {
							if (arg14.field7769[var43] == var39) {
								var42 = true;
								break;
							}
						}
					}
				}
				if (var21) {
					if (arg14.field7770 == var39) {
						var42 = true;
					} else {
						for (int var44 = 0; var44 < arg14.field7767.length; var44++) {
							if (arg14.field7767[var44] == var39) {
								var42 = true;
								break;
							}
						}
					}
				}
				if ((var40 & 0x40000000) != 0) {
					if (!var42 && this.field7887 != null && this.field7887[var39] != null) {
						var41 = this.field7887[var39];
					}
					if (!((class738) arg5.method962(var40 & 0x3FFFFFFF)).method14649(this.field7897, var41)) {
						var38 = true;
					}
				} else if ((var40 & Integer.MIN_VALUE) != 0 && !((class283) arg3.method962(var40 & 0x3FFFFFFF)).method4999()) {
					var38 = true;
				}
				var39++;
			}
		}
		class116 var69 = var34.method1773((byte) 4, var16, true);
		if (!var28 && !var31) {
			return var69;
		}
		class419[] var70 = null;
		if (var36 != null) {
			var70 = var36.method9291();
		}
		if (var31 && var70 != null) {
			for (int var71 = 0; var71 < arg11.length; var71++) {
				if (var70[var71] != null) {
					var69.method1771(var70[var71], 0x1 << var71, true);
				}
			}
		}
		int var72 = 0;
		int var73 = 1;
		while (var72 < var29) {
			if (arg10[var72] != null) {
				arg10[var72].method14360(var69, 0, var73);
			}
			var72++;
			var73 <<= 0x1;
		}
		if (var31) {
			for (int var74 = 0; var74 < arg11.length; var74++) {
				if (arg11[var74] != -1) {
					int var75 = arg11[var74] - arg12;
					int var76 = var75 & 0x3FFF;
					class419 var77 = new class419();
					var77.method6372(0.0F, 1.0F, 0.0F, class417.method6277(var76));
					var69.method1771(var77, 0x1 << var74, false);
				}
			}
		}
		if (var31 && var70 != null) {
			for (int var78 = 0; var78 < arg11.length; var78++) {
				if (var70[var78] != null) {
					var69.method1771(var70[var78], 0x1 << var78, false);
				}
			}
		}
		if (arg8 != null && arg9 != null) {
			class721.method2099(var69, arg8, arg9);
		} else if (arg8 != null) {
			arg8.method14359(var69, 0);
		} else if (arg9 != null) {
			arg9.method14359(var69, 0);
		}
		return var69;
	}

	@ObfuscatedName("xg.z(Ldh;ILaov;Laod;Laon;Lem;Lep;Laaq;B)Ldo;")
	public class116 method10120(class133 arg0, int arg1, class1084 arg2, class1082 arg3, class1095 arg4, class151 arg5, class147 arg6, class721 arg7) {
		if (this.field7892 != -1) {
			return ((class260) arg3.method962(this.field7892)).method4544(arg0, arg1, arg5, arg6, arg7, null);
		}
		int var9 = arg7 == null ? arg1 : arg1 | arg7.method14358();
		class162 var10 = field7902;
		class116 var11;
		synchronized (field7902) {
			var11 = (class116) field7902.method2930(this.field7888);
		}
		if (var11 == null || arg0.method2394(var11.method1691(), var9) != 0) {
			if (var11 != null) {
				var9 = arg0.method2213(var9, var11.method1691());
			}
			boolean var14 = false;
			for (int var15 = 0; var15 < this.field7890.length; var15++) {
				int var16 = this.field7890[var15];
				class740 var17 = null;
				if ((var16 & 0x40000000) != 0) {
					if (this.field7887 != null && this.field7887[var15] != null) {
						var17 = this.field7887[var15];
					}
					if (!((class738) arg4.method962(var16 & 0x3FFFFFFF)).method14651(this.field7897, var17)) {
						var14 = true;
					}
				} else if ((var16 & Integer.MIN_VALUE) != 0 && !((class283) arg2.method962(var16 & 0x3FFFFFFF)).method5001()) {
					var14 = true;
				}
			}
			if (var14) {
				return null;
			}
			class120[] var18 = new class120[this.field7890.length];
			int var19 = 0;
			for (int var20 = 0; var20 < this.field7890.length; var20++) {
				int var21 = this.field7890[var20];
				class740 var22 = null;
				if ((var21 & 0x40000000) != 0) {
					if (this.field7887 != null && this.field7887[var20] != null) {
						var22 = this.field7887[var20];
					}
					class120 var23 = ((class738) arg4.method962(var21 & 0x3FFFFFFF)).method14652(this.field7897, var22);
					if (var23 != null) {
						var18[var19++] = var23;
					}
				} else if ((var21 & Integer.MIN_VALUE) != 0) {
					class120 var24 = ((class283) arg2.method962(var21 & 0x3FFFFFFF)).method5002();
					if (var24 != null) {
						var18[var19++] = var24;
					}
				}
			}
			class120 var25 = new class120(var18, var19);
			int var26 = var9 | 0x4000;
			var11 = arg0.method2211(var25, var26, Statics.field4037, 64, 768);
			for (int var27 = 0; var27 < 10; var27++) {
				for (int var28 = 0; var28 < Statics.field7577[var27].length; var28++) {
					if (this.field7894[var27] < Statics.field1434[var27][var28].length) {
						var11.method1859(Statics.field7577[var27][var28], Statics.field1434[var27][var28][this.field7894[var27]]);
					}
				}
			}
			for (int var29 = 0; var29 < 10; var29++) {
				for (int var30 = 0; var30 < Statics.field10766[var29].length; var30++) {
					if (this.field7895[var29] < Statics.field9259[var29][var30].length) {
						var11.method1744(Statics.field10766[var29][var30], Statics.field9259[var29][var30][this.field7895[var29]]);
					}
				}
			}
			var11.method1690(var9);
			class162 var31 = field7902;
			synchronized (field7902) {
				field7902.method2921(var11, this.field7888);
			}
		}
		if (arg7 == null) {
			return var11;
		} else {
			class116 var33 = var11.method1773((byte) 4, var9, true);
			arg7.method14359(var33, 0);
			return var33;
		}
	}

	@ObfuscatedName("xg.p(Ldh;ILaov;Laos;Laaq;IIIB)Ldo;")
	public class116 method10130(class133 arg0, int arg1, class1084 arg2, class1080 arg3, class721 arg4, int arg5, int arg6, int arg7) {
		int var9 = arg4 == null ? arg1 : arg1 | arg4.method14358();
		long var10 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		class162 var12 = field7902;
		class116 var13;
		synchronized (field7902) {
			var13 = (class116) field7902.method2930(var10);
		}
		if (var13 == null || arg0.method2394(var13.method1691(), var9) != 0) {
			if (var13 != null) {
				var9 = arg0.method2213(var9, var13.method1691());
			}
			class120[] var16 = new class120[3];
			int var17 = 0;
			if (!((class283) arg2.method962(arg5)).method5001() || !((class283) arg2.method962(arg6)).method5001() || !((class283) arg2.method962(arg7)).method5001()) {
				return null;
			}
			class120 var18 = ((class283) arg2.method962(arg5)).method5002();
			if (var18 != null) {
				var16[var17++] = var18;
			}
			class120 var19 = ((class283) arg2.method962(arg6)).method5002();
			if (var19 != null) {
				var16[var17++] = var19;
			}
			class120 var20 = ((class283) arg2.method962(arg7)).method5002();
			if (var20 != null) {
				var16[var17++] = var20;
			}
			class120 var21 = new class120(var16, var17);
			int var22 = var9 | 0x4000;
			var13 = arg0.method2211(var21, var22, Statics.field4037, 64, 768);
			for (int var23 = 0; var23 < 10; var23++) {
				for (int var24 = 0; var24 < Statics.field7577[var23].length; var24++) {
					if (this.field7894[var23] < Statics.field1434[var23][var24].length) {
						var13.method1859(Statics.field7577[var23][var24], Statics.field1434[var23][var24][this.field7894[var23]]);
					}
				}
			}
			for (int var25 = 0; var25 < 10; var25++) {
				for (int var26 = 0; var26 < Statics.field10766[var25].length; var26++) {
					if (this.field7895[var25] < Statics.field9259[var25][var26].length) {
						var13.method1744(Statics.field10766[var25][var26], Statics.field9259[var25][var26][this.field7895[var25]]);
					}
				}
			}
			var13.method1690(var9);
			class162 var27 = field7902;
			synchronized (field7902) {
				field7902.method2921(var13, var10);
			}
		}
		if (arg4 == null) {
			return var13;
		} else {
			class116 var29 = var13.method1773((byte) 4, var9, true);
			arg4.method14359(var29, 0);
			return var29;
		}
	}

	@ObfuscatedName("eg.c(IS)V")
	public static void method2837(int arg0) {
		Statics.field4037 = arg0;
		class162 var1 = field7902;
		synchronized (field7902) {
			field7902.method2924();
		}
		class162 var3 = field7901;
		synchronized (field7901) {
			field7901.method2924();
		}
	}

	@ObfuscatedName("ada.r(I)V")
	public static void method15184() {
		class162 var0 = field7901;
		synchronized (field7901) {
			field7901.method2924();
		}
		class162 var2 = field7902;
		synchronized (field7902) {
			field7902.method2924();
		}
	}

	@ObfuscatedName("sc.o(S)V")
	public static void method8366() {
		class162 var0 = field7901;
		synchronized (field7901) {
			field7901.method2928();
		}
		class162 var2 = field7902;
		synchronized (field7902) {
			field7902.method2928();
		}
	}
}
