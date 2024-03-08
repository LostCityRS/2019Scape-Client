package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("at")
public class class42 {

	@ObfuscatedName("at.n")
	public static boolean field728 = false;

	@ObfuscatedName("at.m")
	public static boolean field720 = false;

	@ObfuscatedName("at.k")
	public static int[] field721 = new int[4];

	@ObfuscatedName("at.f")
	public static int field722 = -1;

	@ObfuscatedName("at.w")
	public static int field723 = 0;

	@ObfuscatedName("at.l")
	public static int[] field725 = new int[1008];

	@ObfuscatedName("at.u")
	public static int[] field733 = new int[1006];

	@ObfuscatedName("at.z")
	public static int[] field726 = new int[1013];

	@ObfuscatedName("at.p")
	public static class715 field727 = new class715();

	@ObfuscatedName("at.d")
	public static int field731 = -1;

	@ObfuscatedName("at.c")
	public static int field718 = -1;

	@ObfuscatedName("at.r")
	public static boolean field730 = true;

	@ObfuscatedName("at.v")
	public static boolean field732 = false;

	@ObfuscatedName("at.s")
	public static int field724 = 0;

	public class42() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("uo.e(B)V")
	public static void method9233() {
		field724 = 0;
		field722 = -1;
		field731 = -1;
		field718 = -1;
	}

	@ObfuscatedName("gf.n(B)V")
	public static void method3552() {
		field724 = 0;
		field731 = -1;
		field718 = -1;
	}

	@ObfuscatedName("jg.m(S)V")
	public static void method5065() {
		Statics.field734 = null;
		field722 = -1;
	}

	@ObfuscatedName("ahm.k(B)V")
	public static void method16601() {
		field722 = -1;
	}

	@ObfuscatedName("am.f(I)V")
	public static void method829() {
		int var0 = client.field10855.method7728();
		int var1 = client.field10855.method7758();
		Statics.field8182 = new boolean[var0 >> 3][var1 >> 3];
	}

	@ObfuscatedName("aih.w(Ldh;B)V")
	public static void method16903(class133 arg0) {
		if (field722 != Statics.field4490.field11717 && client.field10855.method7743() != null) {
			class213.method3655();
			if (method14493(arg0, Statics.field4490.field11717)) {
				field722 = Statics.field4490.field11717;
			}
		}
	}

	@ObfuscatedName("aaz.l(Ldh;IB)Z")
	public static boolean method14493(class133 arg0, int arg1) {
		arg0.method2202();
		class213.method3655();
		if (!arg0.method2215()) {
			return false;
		}
		int var2 = client.field10855.method7728();
		int var3 = client.field10855.method7758();
		class451 var4 = client.field10855.method7793();
		class550 var5 = client.field10855.method7743();
		int var6 = arg1;
		if (Statics.field4490 != null) {
			int var7 = Statics.field4490.field10450[0] >> 3;
			int var8 = Statics.field4490.field10448[0] >> 3;
			if (var7 >= 0 && var7 < Statics.field8182.length && var8 >= 0 && var8 < Statics.field8182[var7].length && Statics.field8182[var7][var8]) {
				var6 = 0;
			}
		}
		int var9 = var2 / 2;
		byte var10 = 0;
		byte var11 = 0;
		boolean var12 = true;
		for (int var13 = var10; var13 < var2 + var10; var13++) {
			for (int var14 = var11; var14 < var3 + var11; var14++) {
				for (int var15 = var6; var15 <= 3; var15++) {
					if (var15 < arg1 || var4.method7104(arg1, var15, var13, var14)) {
						int var16 = var15;
						if (var4.method7105(var13, var14)) {
							var16 = var15 - 1;
						}
						if (var16 >= 0) {
							var12 &= method1005(var16, var13, var14);
						}
					}
				}
			}
		}
		if (!var12) {
			return false;
		}
		int var17 = var2 * 4 + 48 + 48;
		int[] var18 = new int[var17 * var17];
		for (int var19 = 0; var19 < var18.length; var19++) {
			var18[var19] = 0;
		}
		class840 var20 = null;
		byte var21 = 0;
		byte var22 = 0;
		if (field720) {
			Statics.field734 = arg0.method2197(var17, var17, false, true);
			var20 = arg0.method2145();
			var20.method15439(0, Statics.field734.method1437());
			class126 var23 = arg0.method2121(var17, var17);
			var20.method15441(var23);
			arg0.method2142(var20);
			var9 = var2;
			var21 = 48;
			var22 = 48;
			arg0.method2475(1, 0);
		} else {
			Statics.field734 = arg0.method2199(var18, 0, var17, var17, var17);
		}
		client.field10855.method7816().method9983();
		int var24 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		int var25 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		int var26 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		boolean[][] var27 = new boolean[var9 + 1 + 2][var9 + 1 + 2];
		arg0.method2326(field721);
		arg0.method2263();
		for (int var28 = var10; var28 < var2 + var10; var28 += var9) {
			for (int var29 = var11; var29 < var3 + var11; var29 += var9) {
				int var30 = var21;
				int var31 = var22;
				int var32 = var28;
				if (var28 > 0) {
					var32 = var28 - 1;
					var30 = var21 + 4;
				}
				int var33 = var29;
				if (var29 > 0) {
					var33 = var29 - 1;
				}
				int var34 = var9 + var28;
				if (var34 < var2) {
					var34++;
				}
				int var35 = var9 + var29;
				if (var35 < var3) {
					var35++;
					var31 = var22 + 4;
				}
				if (field728) {
					arg0.method2167();
				} else {
					arg0.method2168(0, 0, var9 * 4 + var30, var9 * 4 + var31);
				}
				arg0.method2475(3, -16777216);
				int var36 = var9;
				if (var9 > var2 - 1) {
					var36 = var2 - 1;
				}
				for (int var37 = var6; var37 <= 3; var37++) {
					for (int var38 = 0; var38 <= var36; var38++) {
						for (int var39 = 0; var39 <= var36; var39++) {
							var27[var38][var39] = var37 < arg1 || var4.method7104(arg1, var37, var32 + var38, var33 + var39);
						}
					}
					var5.field6915[var37].method1526(var21, var22, 1024, var32, var33, var34, var35, var27);
					for (int var40 = -4; var40 < var9; var40++) {
						for (int var41 = -4; var41 < var9; var41++) {
							int var42 = var28 + var40;
							int var43 = var29 + var41;
							if (var42 >= var10 && var43 >= var11 && (var37 < arg1 || var4.method7104(arg1, var37, var42, var43))) {
								int var44 = var37;
								if (var4.method7105(var42, var43)) {
									var44 = var37 - 1;
								}
								if (var44 >= 0) {
									method4476(arg0, var44, var42, var43, var40 * 4 + var30, (var9 - var41) * 4 + var31 - 4, var24, var25);
								}
							}
						}
					}
				}
				arg0.method2354(var30, var31, var9 * 4, var9 * 4, var26, 2);
				arg0.method2202();
				if (!field720) {
					Statics.field734.method1440((var28 - var10) * 4 + 48, var3 * 4 + 48 - (var29 - var11) * 4 - var9 * 4, var9 * 4, var9 * 4, var30, var31);
					if (field728) {
						Statics.field734.method1439(256, 0);
						try {
							arg0.method2115();
							class214.method1571(2000L);
						} catch (Exception var55) {
						}
					}
				}
			}
		}
		if (field720) {
			arg0.method2143(var20);
			if (field728) {
				Statics.field734.method1439(256, 0);
				try {
					arg0.method2115();
					class214.method1571(2000L);
				} catch (Exception var54) {
				}
			}
		}
		arg0.method2167();
		arg0.method2164(field721[0], field721[1], field721[2], field721[3]);
		arg0.method2475(1, 1);
		client.method9734();
		field723 = 0;
		field727.method14152();
		if (!field732) {
			method16444(arg1);
			class539 var47 = client.field10855.method7871();
			if (var47 != null) {
				Statics.field5011.method18871(1024, 64);
				class594 var48 = client.field10855.method7727();
				for (int var49 = 0; var49 < var47.field6777; var49++) {
					int var50 = var47.field6776[var49];
					if (var50 >> 28 == Statics.field4490.field11717) {
						int var51 = (var50 >> 14 & 0x3FFF) - var48.field7426;
						int var52 = (var50 & 0x3FFF) - var48.field7427;
						if (var51 >= 0 && var51 < var2 && var52 >= 0 && var52 < var3) {
							field727.method14153(new class988(var49));
						} else {
							class228 var53 = (class228) Statics.field5011.method962(var47.field6775[var49]);
							if (var53.field2393 != null && var53.field2396 + var51 >= 0 && var53.field2373 + var51 < var2 && var53.field2397 + var52 >= 0 && var53.field2395 + var52 < var3) {
								field727.method14153(new class988(var49));
							}
						}
					}
				}
				Statics.field5011.method18871(128, 64);
			}
		}
		return true;
	}

	@ObfuscatedName("agm.u(II)V")
	public static void method16444(int arg0) {
		field723 = 0;
		int var1 = client.field10855.method7728();
		int var2 = client.field10855.method7758();
		class451 var3 = client.field10855.method7793();
		class550 var4 = client.field10855.method7743();
		class1090 var5 = client.field10855.method7750();
		int var6 = arg0;
		if (Statics.field4490 != null) {
			int var7 = Statics.field4490.field10450[0] >> 3;
			int var8 = Statics.field4490.field10448[0] >> 3;
			if (var7 >= 0 && var7 < Statics.field8182.length && var8 >= 0 && var8 < Statics.field8182[var7].length && Statics.field8182[var7][var8]) {
				var6 = 0;
			}
		}
		for (int var9 = 0; var9 < var1; var9++) {
			for (int var10 = 0; var10 < var2; var10++) {
				for (int var11 = var6; var11 <= arg0 + 1 && var11 <= 3; var11++) {
					if ((var11 < arg0 || var3.method7104(arg0, var11, var9, var10)) && !method250((class514) var4.method8767(var11, var9, var10), var5, var9, var10) && !method250((class514) var4.method8856(var11, var9, var10, client.field11001), var5, var9, var10) && !method250((class514) var4.method8711(var11, var9, var10), var5, var9, var10) && method250((class514) var4.method8735(var11, var9, var10), var5, var9, var10)) {
					}
				}
			}
		}
	}

	@ObfuscatedName("l.z(Lst;Laop;III)Z")
	public static boolean method250(class514 arg0, class1090 arg1, int arg2, int arg3) {
		if (arg0 == null) {
			return false;
		}
		class598 var4 = (class598) arg1.method962(arg0.method8223());
		if (var4.field7518 && !client.field10948) {
			return false;
		}
		int var5 = var4.field7485;
		if (var4.field7505 != null) {
			for (int var6 = 0; var6 < var4.field7505.length; var6++) {
				if (var4.field7505[var6] != -1) {
					class598 var7 = (class598) arg1.method962(var4.field7505[var6]);
					if (var7.field7485 >= 0) {
						var5 = var7.field7485;
					}
				}
			}
		}
		if (var5 < 0) {
			return false;
		}
		field726[field723] = var4.field7450;
		field725[field723] = arg2;
		field733[field723] = arg3;
		field723++;
		return true;
	}

	@ObfuscatedName("af.p(IIII)Z")
	public static boolean method1005(int arg0, int arg1, int arg2) {
		class550 var3 = client.field10855.method7743();
		boolean var4 = true;
		class514 var5 = (class514) var3.method8711(arg0, arg1, arg2);
		if (var5 != null) {
			var4 &= method17469(var5);
		}
		class514 var6 = (class514) var3.method8856(arg0, arg1, arg2, client.field11001);
		if (var6 != null) {
			var4 &= method17469(var6);
		}
		class514 var7 = (class514) var3.method8767(arg0, arg1, arg2);
		if (var7 != null) {
			var4 &= method17469(var7);
		}
		return var4;
	}

	@ObfuscatedName("ajc.d(Lst;S)Z")
	public static boolean method17469(class514 arg0) {
		class598 var1 = (class598) client.field10855.method7750().method962(arg0.method8223());
		if (var1.field7486 == -1) {
			return true;
		} else {
			class781 var2 = (class781) Statics.field4241.method962(var1.field7486);
			return var2.field9151 == -1 ? true : var2.method15060();
		}
	}

	@ObfuscatedName("ix.c(Ldh;IIIIIIII)V")
	public static void method4476(class133 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		class550 var8 = client.field10855.method7743();
		class514 var9 = (class514) var8.method8711(arg1, arg2, arg3);
		if (var9 != null) {
			class598 var10 = (class598) client.field10855.method7750().method962(var9.method8223());
			int var11 = var9.method8204() & 0x3;
			int var12 = var9.method8220();
			if (var10.field7486 == -1) {
				int var13 = arg6;
				if (var10.field7470 > 0) {
					var13 = arg7;
				}
				if (class601.field7554.field7562 == var12 || class601.field7545.field7562 == var12) {
					if (var11 == 0) {
						arg0.method2177(arg4, arg5, 4, var13);
					} else if (var11 == 1) {
						arg0.method2176(arg4, arg5, 4, var13);
					} else if (var11 == 2) {
						arg0.method2177(arg4 + 3, arg5, 4, var13);
					} else if (var11 == 3) {
						arg0.method2176(arg4, arg5 + 3, 4, var13);
					}
				}
				if (class601.field7546.field7562 == var12) {
					if (var11 == 0) {
						arg0.method2301(arg4, arg5, 1, 1, var13);
					} else if (var11 == 1) {
						arg0.method2301(arg4 + 3, arg5, 1, 1, var13);
					} else if (var11 == 2) {
						arg0.method2301(arg4 + 3, arg5 + 3, 1, 1, var13);
					} else if (var11 == 3) {
						arg0.method2301(arg4, arg5 + 3, 1, 1, var13);
					}
				}
				if (class601.field7545.field7562 == var12) {
					if (var11 == 0) {
						arg0.method2176(arg4, arg5, 4, var13);
					} else if (var11 == 1) {
						arg0.method2177(arg4 + 3, arg5, 4, var13);
					} else if (var11 == 2) {
						arg0.method2176(arg4, arg5 + 3, 4, var13);
					} else if (var11 == 3) {
						arg0.method2177(arg4, arg5, 4, var13);
					}
				}
			} else {
				Statics.method1900(arg0, var10, var11, arg4, arg5);
			}
		}
		class514 var14 = (class514) var8.method8856(arg1, arg2, arg3, client.field11001);
		if (var14 != null) {
			class598 var15 = (class598) client.field10855.method7750().method962(var14.method8223());
			int var16 = var14.method8204() & 0x3;
			int var17 = var14.method8220();
			if (var15.field7486 != -1) {
				Statics.method1900(arg0, var15, var16, arg4, arg5);
			} else if (class601.field7547.field7562 == var17) {
				int var18 = -1118482;
				if (var15.field7470 > 0) {
					var18 = -1179648;
				}
				if (var16 == 0 || var16 == 2) {
					arg0.method2374(arg4, arg5 + 3, arg4 + 3, arg5, var18);
				} else {
					arg0.method2374(arg4, arg5, arg4 + 3, arg5 + 3, var18);
				}
			}
		}
		class514 var19 = (class514) var8.method8767(arg1, arg2, arg3);
		if (var19 == null) {
			return;
		}
		class598 var20 = (class598) client.field10855.method7750().method962(var19.method8223());
		int var21 = var19.method8204() & 0x3;
		if (var20.field7486 != -1) {
			Statics.method1900(arg0, var20, var21, arg4, arg5);
		}
	}

	@ObfuscatedName("v.v(Ldh;Lhf;IIB)V")
	public static void method328(class133 arg0, class226 arg1, int arg2, int arg3) {
		if (Statics.field4490 == null) {
			return;
		}
		arg0.method2202();
		class224 var4 = null;
		class103 var5 = null;
		if (arg1.field2184 == 5) {
			var4 = arg1.method3970(arg0);
			if (var4 == null) {
				return;
			}
			var5 = var4.field2147;
			if (arg1.field2196 != var4.field2144 || arg1.field2197 != var4.field2146) {
				throw new IllegalStateException("");
			}
		}
		arg0.method2168(arg2, arg3, arg1.field2196 + arg2, arg1.field2197 + arg3);
		if (field724 == 2 || field724 == 5 || Statics.field734 == null) {
			if (var5 == null) {
				return;
			}
			arg0.method2206(-16777216, var5, arg2, arg3);
			return;
		}
		arg0.method2326(field721);
		arg0.method2263();
		class594 var6 = client.field10855.method7727();
		int var7;
		int var8;
		int var9;
		int var10;
		if (Statics.field3416 == 4) {
			var7 = client.field10892;
			var8 = client.field10893;
			var9 = (int) -client.field10895 & 0x3FFF;
			var10 = 4096;
		} else {
			class423 var11 = Statics.field4490.method10536().field4298;
			var7 = (int) var11.field4308;
			var8 = (int) var11.field4313;
			if (Statics.field3416 == 3) {
				var9 = (int) -((double) Statics.field9155.method4719() * 2607.5945876176133D) + client.field10885 & 0x3FFF;
			} else {
				var9 = client.field10885 + (int) -client.field10895 & 0x3FFF;
			}
			var10 = 4096 - client.field10887 * 16;
		}
		int var12 = var7 / 128 + 48;
		int var13 = client.field10855.method7758() * 4 + 48 - var8 / 128;
		if (var5 == null) {
			Statics.field734.method1453((float) arg1.field2196 / 2.0F + (float) arg2, (float) arg1.field2197 / 2.0F + (float) arg3, (float) var12, (float) var13, var10, var9 << 2, 1, -1, 1);
		} else {
			Statics.field734.method1456((float) arg1.field2196 / 2.0F + (float) arg2, (float) arg1.field2197 / 2.0F + (float) arg3, (float) var12, (float) var13, var10, var9 << 2, var5, arg2, arg3);
		}
		class539 var14 = client.field10855.method7871();
		for (class988 var15 = (class988) field727.method14191(); var15 != null; var15 = (class988) field727.method14161()) {
			int var16 = var15.field11442;
			int var17 = (var14.field6776[var16] >> 14 & 0x3FFF) - var6.field7426;
			int var18 = (var14.field6776[var16] & 0x3FFF) - var6.field7427;
			int var19 = var17 * 4 + 2 - var7 / 128;
			int var20 = var18 * 4 + 2 - var8 / 128;
			Statics.method15085(arg0, var5, arg1, arg2, arg3, var19, var20, var14.field6775[var16]);
		}
		for (int var21 = 0; var21 < field723; var21++) {
			int var22 = field725[var21] * 4 + 2 - var7 / 128;
			int var23 = field733[var21] * 4 + 2 - var8 / 128;
			class598 var24 = (class598) client.field10855.method7750().method962(field726[var21]);
			if (var24.field7505 != null) {
				var24 = var24.method9477(Statics.field7410, Statics.field7410);
				if (var24 == null || var24.field7485 == -1) {
					continue;
				}
			}
			Statics.method15085(arg0, var5, arg1, arg2, arg3, var22, var23, var24.field7485);
		}
		for (class966 var25 = (class966) client.field10964.method14500(); var25 != null; var25 = (class966) client.field10964.method14502()) {
			int var26 = (int) (var25.field6760 >> 28 & 0x3L);
			if (field722 == var26) {
				int var27 = (int) (var25.field6760 & 0x3FFFL) - var6.field7426;
				int var28 = (int) (var25.field6760 >> 14 & 0x3FFFL) - var6.field7427;
				int var29 = var27 * 4 + 2 - var7 / 128;
				int var30 = var28 * 4 + 2 - var8 / 128;
				method715(arg1, var5, arg2, arg3, var29, var30, Statics.field510[0]);
			}
		}
		method4838(arg0, var7, var8, arg1, var5, arg2, arg3);
		method16411(var7, var8, arg1, var5, arg2, arg3);
		method4538(var7, var8, arg1, var4, arg2, arg3);
		if (Statics.field3416 != 4) {
			if (field731 != -1) {
				int var31 = field731 * 4 + 2 - var7 / 128 + (Statics.field4490.method16546() - 1) * 2;
				int var32 = field718 * 4 + 2 - var8 / 128 + (Statics.field4490.method16546() - 1) * 2;
				method4142(arg1, var5, arg2 - Statics.field11888, arg3 - Statics.field10232, var31, var32, Statics.field9149[field730 ? 1 : 0], 100.0D, class230.field2420, class231.field2426);
			}
			if (!Statics.field4490.field12071.method10195()) {
				arg0.method2301(arg1.field2196 / 2 + arg2 - 1, arg1.field2197 / 2 + arg3 - 1, 3, 3, -1);
			}
		}
		arg0.method2164(field721[0], field721[1], field721[2], field721[3]);
	}

	@ObfuscatedName("je.o(Ldh;IILhf;Lch;IIB)V")
	public static void method4838(class133 arg0, int arg1, int arg2, class226 arg3, class103 arg4, int arg5, int arg6) {
		for (int var7 = 0; var7 < client.field11011; var7++) {
			class984 var8 = (class984) client.field10838.method14495((long) client.field11036[var7]);
			if (var8 != null) {
				class1131 var9 = (class1131) var8.field11436;
				if (var9.method19160() && Statics.field4490.field11717 == var9.field11717) {
					class260 var10 = var9.field12083;
					if (var10 != null && var10.field2735 != null) {
						var10 = var10.method4547(Statics.field7410, Statics.field7410);
					}
					if (var10 != null && var10.field2718 && var10.field2734) {
						class423 var11 = var9.method10536().field4298;
						int var12 = (int) var11.field4308 / 128 - arg1 / 128;
						int var13 = (int) var11.field4313 / 128 - arg2 / 128;
						if (var10.field2763 == -1) {
							method715(arg3, arg4, arg5, arg6, var12, var13, Statics.field510[1]);
						} else {
							Statics.method15085(arg0, arg4, arg3, arg5, arg6, var12, var13, var10.field2763);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aff.s(IILhf;Lch;III)V")
	public static void method16411(int arg0, int arg1, class226 arg2, class103 arg3, int arg4, int arg5) {
		int var6 = class40.field698;
		int[] var7 = class40.field703;
		for (int var8 = 0; var8 < var6; var8++) {
			class1130 var9 = client.field10944[var7[var8]];
			if (var9 != null && var9.method19119() && !var9.field12071.method10195() && Statics.field4490 != var9 && Statics.field4490.field11717 == var9.field11717) {
				class423 var10 = var9.method10536().field4298;
				int var11 = (int) var10.field4308 / 128 - arg0 / 128;
				int var12 = (int) var10.field4313 / 128 - arg1 / 128;
				boolean var13 = false;
				for (int var14 = 0; var14 < client.field10811; var14++) {
					class30 var15 = client.field11065[var14];
					if (var9.field12062.equals(var15.field606) && var15.field608 != 0) {
						var13 = true;
						break;
					}
				}
				boolean var16 = false;
				for (int var17 = 0; var17 < Statics.field7421; var17++) {
					if (var9.field12062.equals(Statics.field9267[var17].field757)) {
						var16 = true;
						break;
					}
				}
				boolean var18 = false;
				if (Statics.field4490.field12060 != 0 && var9.field12060 != 0 && Statics.field4490.field12060 == var9.field12060) {
					var18 = true;
				}
				if (var9.field12061 != null && var9.field12061.field7892 != -1 && ((class260) Statics.field7961.method962(var9.field12061.field7892)).field2690) {
					method715(arg2, arg3, arg4, arg5, var11, var12, Statics.field510[1]);
				} else if (class202.field1947 == var9.field12070) {
					method715(arg2, arg3, arg4, arg5, var11, var12, Statics.field510[8]);
				} else if (class202.field1948 == var9.field12070) {
					method715(arg2, arg3, arg4, arg5, var11, var12, Statics.field510[6]);
				} else if (var18) {
					method715(arg2, arg3, arg4, arg5, var11, var12, Statics.field510[4]);
				} else if (var13) {
					method715(arg2, arg3, arg4, arg5, var11, var12, Statics.field510[3]);
				} else if (var9.field12048) {
					method715(arg2, arg3, arg4, arg5, var11, var12, Statics.field510[7]);
				} else if (var16) {
					method715(arg2, arg3, arg4, arg5, var11, var12, Statics.field510[5]);
				} else {
					method715(arg2, arg3, arg4, arg5, var11, var12, Statics.field510[2]);
				}
			}
		}
	}

	@ObfuscatedName("ia.y(IILhf;Lhx;IIS)V")
	public static void method4538(int arg0, int arg1, class226 arg2, class224 arg3, int arg4, int arg5) {
		class45[] var6 = client.field10851;
		for (int var7 = 0; var7 < var6.length; var7++) {
			class45 var8 = var6[var7];
			if (var8 != null && var8.field745 != 0 && client.field10903 % 20 < 10) {
				if (var8.field745 == 1) {
					class984 var9 = (class984) client.field10838.method14495((long) var8.field744);
					if (var9 != null) {
						class1131 var10 = (class1131) var9.field11436;
						class423 var11 = var10.method10536().field4298;
						int var12 = (int) var11.field4308 / 128 - arg0 / 128;
						int var13 = (int) var11.field4313 / 128 - arg1 / 128;
						Statics.method15035(arg2, arg3, arg4, arg5, var12, var13, var8.field751, 360000L);
					}
				}
				if (var8.field745 == 2) {
					int var14 = var8.field746 * 262144 / 128 - arg0 / 128;
					int var15 = var8.field747 * 512 / 128 - arg1 / 128;
					long var16 = (long) (var8.field748 << 7);
					long var18 = var16 * var16;
					Statics.method15035(arg2, arg3, arg4, arg5, var14, var15, var8.field751, var18);
				}
				if (var8.field745 == 10 && var8.field744 >= 0 && var8.field744 < client.field10944.length) {
					class1130 var20 = client.field10944[var8.field744];
					if (var20 != null) {
						class423 var21 = var20.method10536().field4298;
						int var22 = (int) var21.field4308 / 128 - arg0 / 128;
						int var23 = (int) var21.field4313 / 128 - arg1 / 128;
						Statics.method15035(arg2, arg3, arg4, arg5, var22, var23, var8.field751, 360000L);
					}
				}
			}
		}
	}

	@ObfuscatedName("al.b(Lhf;Lch;IIIILcm;I)V")
	public static void method715(class226 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, class101 arg6) {
		method4142(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, class230.field2417, class231.field2424);
	}

	@ObfuscatedName("ht.h(Lhf;Lch;IIIILcm;DLhp;Lhy;I)V")
	public static void method4142(class226 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, class101 arg6, double arg7, class230 arg8, class231 arg9) {
		if (arg6 == null) {
			return;
		}
		int var11;
		if (Statics.field3416 == 3) {
			var11 = (int) ((double) Statics.field9155.method4719() * 2607.5945876176133D) + client.field10885 & 0x3FFF;
		} else if (Statics.field3416 == 4) {
			var11 = (int) client.field10895 & 0x3FFF;
		} else {
			var11 = client.field10885 + (int) client.field10895 & 0x3FFF;
		}
		int var12 = Math.max(arg0.field2196 / 2, arg0.field2197 / 2) + 10;
		int var13 = arg4 * arg4 + arg5 * arg5;
		if (var13 > var12 * var12) {
			return;
		}
		int var14 = class417.field4270[var11];
		int var15 = class417.field4272[var11];
		if (Statics.field3416 != 4) {
			var14 = var14 * 256 / (client.field10887 + 256);
			var15 = var15 * 256 / (client.field10887 + 256);
		}
		int var16 = arg4 * var15 + arg5 * var14 >> 14;
		int var17 = arg5 * var15 - arg4 * var14 >> 14;
		double var18 = arg7 / 100.0D;
		switch(arg8.field2419) {
			case 0:
				arg2 = arg0.field2196 / 2 + arg2 + var16 - (int) ((double) arg6.method1434() * var18);
				break;
			case 1:
				arg2 = arg0.field2196 / 2 + arg2 + var16;
				break;
			case 2:
				arg2 = arg0.field2196 / 2 + arg2 + var16 - (int) ((double) (arg6.method1434() / 2) * var18);
		}
		switch(arg9.field2425) {
			case 0:
				arg3 = arg0.field2197 / 2 + arg3 - var17 - (int) ((double) arg6.method1436() * var18);
				break;
			case 1:
				arg3 = arg0.field2197 / 2 + arg3 - var17;
				break;
			case 2:
				arg3 = arg0.field2197 / 2 + arg3 - var17 - (int) ((double) (arg6.method1436() / 2) * var18);
		}
		if (arg1 == null) {
			if (var18 == 1.0D) {
				arg6.method1439(arg2, arg3);
			}
			arg6.method1474(arg2, arg3, (int) ((double) arg6.method1434() * var18), (int) ((double) arg6.method1436() * var18));
		} else if (var18 == 1.0D) {
			arg6.method1444(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method1474(arg2, arg3, (int) ((double) arg6.method1434() * var18), (int) ((double) arg6.method1436() * var18));
		}
	}

	@ObfuscatedName("gd.a(Lhf;Lch;IIIIILjava/lang/String;Leu;Laac;II)V")
	public static void method3654(class226 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7, class140 arg8, class733 arg9, int arg10) {
		int var11;
		if (Statics.field3416 == 3) {
			var11 = (int) ((double) Statics.field9155.method4719() * 2607.5945876176133D) + client.field10885 & 0x3FFF;
		} else if (Statics.field3416 == 4) {
			var11 = (int) client.field10895 & 0x3FFF;
		} else {
			var11 = client.field10885 + (int) client.field10895 & 0x3FFF;
		}
		int var12 = Math.max(arg0.field2196 / 2, arg0.field2197 / 2) + 10;
		int var13 = arg4 * arg4 + arg5 * arg5;
		if (var13 > var12 * var12) {
			return;
		}
		int var14 = class417.field4270[var11];
		int var15 = class417.field4272[var11];
		if (Statics.field3416 != 4) {
			var14 = var14 * 256 / (client.field10887 + 256);
			var15 = var15 * 256 / (client.field10887 + 256);
		}
		int var16 = arg4 * var15 + arg5 * var14 >> 14;
		int var17 = arg5 * var15 - arg4 * var14 >> 14;
		int var18 = arg9.method14551(arg7, 100, null);
		int var19 = arg9.method14545(arg7, 100, 0, null);
		int var20 = var16 - var18 / 2;
		if (var20 >= -arg0.field2196 && var20 <= arg0.field2196 && var17 >= -arg0.field2197 && var17 <= arg0.field2197) {
			arg8.method2720(arg7, arg0.field2196 / 2 + arg2 + var20, arg0.field2197 / 2 + arg3 - var17 - arg6 - var19, var18, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("abb.g(IIZB)V")
	public static void method14707(int arg0, int arg1, boolean arg2) {
		Statics.field8182[arg0][arg1] = arg2;
	}
}
