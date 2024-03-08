package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.io.IOException;
import java.net.URL;

@ObfuscatedName("m")
public class class10 {

	@ObfuscatedName("m.f")
	public static boolean field456 = false;

	@ObfuscatedName("m.z")
	public static boolean field438 = false;

	@ObfuscatedName("m.p")
	public static int field472 = -1;

	@ObfuscatedName("m.d")
	public static long field439 = -1L;

	@ObfuscatedName("m.ap")
	public static int field445 = 7;

	@ObfuscatedName("m.aq")
	public static long field437 = 0L;

	@ObfuscatedName("m.ax")
	public static String field470 = "";

	@ObfuscatedName("m.av")
	public static String field481 = "";

	@ObfuscatedName("m.ao")
	public static String field429 = "";

	@ObfuscatedName("m.aj")
	public static boolean field473 = true;

	@ObfuscatedName("m.ab")
	public static int field478 = 0;

	@ObfuscatedName("m.az")
	public static int field475 = 0;

	@ObfuscatedName("m.an")
	public static int field476 = -2;

	@ObfuscatedName("m.bf")
	public static int field477 = -2;

	@ObfuscatedName("m.bl")
	public static int field469 = -2;

	@ObfuscatedName("m.bk")
	public static int field479 = -1;

	@ObfuscatedName("m.bh")
	public static int field444 = -1;

	@ObfuscatedName("m.bx")
	public static int field464 = 0;

	@ObfuscatedName("m.bd")
	public static int field482 = -1;

	@ObfuscatedName("m.bc")
	public static int field483 = -1;

	@ObfuscatedName("m.bi")
	public static int field467 = 0;

	@ObfuscatedName("m.bn")
	public static boolean field485 = false;

	@ObfuscatedName("m.bt")
	public static int field486 = 0;

	@ObfuscatedName("m.bq")
	public static boolean field487 = false;

	public class10() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kg.e(I)Z")
	public static boolean method5143() {
		return field472 == -1 ? method10320(field470, field481) : method7703();
	}

	@ObfuscatedName("iu.n(S)Z")
	public static boolean method4407() {
		return field472 == -1 ? method17521(field470, field481) : method1592();
	}

	@ObfuscatedName("ug.m(I)V")
	public static final void method9067() {
		field445 = 7;
		field477 = -2;
		field476 = -2;
	}

	@ObfuscatedName("jd.k(B)V")
	public static final void method4641() {
		field439 = -1L;
		field437 = 0L;
		field472 = -1;
	}

	@ObfuscatedName("aaa.f(B)V")
	public static final void method14129() {
		if (field445 != 7) {
			Statics.field432.method938();
			method9067();
			method10367();
		}
	}

	@ObfuscatedName("et.w(I)Z")
	public static final boolean method2865() {
		return field445 != 7;
	}

	@ObfuscatedName("ag.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZB)V")
	public static void method665(String arg0, String arg1, String arg2, boolean arg3) {
		if (arg0.length() > 320 || !method16808()) {
			return;
		}
		method4641();
		field470 = arg0;
		field481 = arg1;
		field429 = arg2;
		field473 = arg3;
		client.method6972(7);
	}

	@ObfuscatedName("df.z(ILjava/lang/String;ZI)V")
	public static void method2050(int arg0, String arg1, boolean arg2) {
		if (!method16808()) {
			return;
		}
		if (field472 != arg0) {
			field439 = -1L;
		}
		field472 = arg0;
		field429 = arg1;
		field473 = arg2;
		client.method6972(7);
	}

	@ObfuscatedName("amr.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V")
	public static void method18565(String arg0, String arg1, String arg2, boolean arg3) {
		if (arg0.length() > 320 || !method16808()) {
			return;
		}
		client.field10835.method938();
		method4641();
		field470 = arg0;
		field481 = arg1;
		field429 = arg2;
		field473 = arg3;
		client.method6972(17);
	}

	@ObfuscatedName("aji.d(ILjava/lang/String;ZS)V")
	public static void method17463(int arg0, String arg1, boolean arg2) {
		if (!method16808()) {
			return;
		}
		if (field472 != arg0) {
			field439 = -1L;
		}
		field472 = arg0;
		field429 = arg1;
		field473 = arg2;
		client.field10835.method938();
		client.method6972(17);
	}

	@ObfuscatedName("dt.c(Ljava/lang/String;ZI)V")
	public static void method1681(String arg0, boolean arg1) {
		if (client.field10791 == 13 && (!method2865() && !class24.method9610())) {
			field429 = arg0;
			field473 = arg1;
			client.method6972(15);
		}
	}

	@ObfuscatedName("ys.r(B)V")
	public static void method10450() {
		field429 = "";
		field481 = "";
		field470 = "";
		field473 = true;
	}

	@ObfuscatedName("ajf.v(Ljava/lang/String;Ljava/lang/String;B)Z")
	public static boolean method17521(String arg0, String arg1) {
		Statics.field431 = 132;
		Statics.field432 = client.field10835;
		return method7238(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("xo.o(Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean method10320(String arg0, String arg1) {
		Statics.field431 = 211;
		Statics.field432 = client.field10849;
		return method7238(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("rg.s(I)Z")
	public static boolean method7703() {
		Statics.field431 = 211;
		Statics.field432 = client.field10849;
		return method7238(field439 == -1L, true, "", "", field439);
	}

	@ObfuscatedName("cz.y(I)Z")
	public static boolean method1592() {
		Statics.field431 = 132;
		Statics.field432 = client.field10835;
		return method7238(field439 == -1L, true, "", "", field439);
	}

	@ObfuscatedName("qj.q(ZZLjava/lang/String;Ljava/lang/String;J)Z")
	public static boolean method7238(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
		field438 = arg0;
		if (!arg1) {
			field472 = -1;
		}
		field456 = arg1;
		field470 = arg2;
		field481 = arg3;
		field439 = arg4;
		if (!field456 && (field470.equals("") || field481.equals(""))) {
			method669(3);
			method10367();
			return false;
		}
		if (Statics.field431 != 132) {
			field464 = 0;
			field483 = -1;
			field482 = -1;
		}
		Statics.field432.field808 = false;
		method669(-3);
		field445 = 14;
		field478 = 0;
		field475 = 0;
		return true;
	}

	@ObfuscatedName("fj.x(B)V")
	public static final void method3048() {
		if (field445 == 7 || field445 == 103) {
			return;
		}
		try {
			short var0;
			if (field475 == 0 && field445 < 98) {
				var0 = 500;
			} else {
				var0 = 2000;
			}
			if (field438 && field445 >= 64) {
				var0 = 6000;
			}
			if (Statics.field431 == 211 && field445 != 215 && field477 != 42 || Statics.field431 == 132 && field476 != 49 && field476 != 52) {
				field478++;
			}
			if (field478 > var0) {
				Statics.field432.method938();
				if (field475 >= 3) {
					field445 = 7;
					method669(-5);
					method10367();
					return;
				}
				if (Statics.field431 == 211) {
					Statics.field8755.method14758();
				} else {
					Statics.field8751.method14758();
				}
				field478 = 0;
				field475++;
				field445 = 14;
			}
			if (field445 == 14) {
				if (Statics.field431 == 211) {
					Statics.field432.method936(class561.method7130(Statics.field8755.method14764(), 40000), Statics.field8755.field8745);
				} else {
					Statics.field432.method936(class561.method7130(Statics.field8751.method14764(), 40000), Statics.field8751.field8745);
				}
				if (Statics.field10311 == null) {
					Statics.field10311 = client.field10967.method709();
					client.field10967.method710();
					client.field10967 = null;
				}
				Statics.field432.method952();
				class983 var1 = class983.method13920();
				var1.field11432.method18001(class391.field3821.field3812);
				Statics.field432.method934(var1);
				Statics.field432.method933();
				field445 = 35;
			}
			if (field445 == 35) {
				if (!Statics.field432.method939().method9038(9)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 9);
				Statics.field432.field795.field11503 = 0;
				int var2 = Statics.field432.field795.method17904();
				if (var2 != 0) {
					field445 = 7;
					method481(var2);
					method669(var2);
					Statics.field432.method938();
					method10367();
					return;
				}
				Statics.field434 = Statics.field432.field795.method17914();
				Statics.field432.field795.field11503 = 0;
				if (field438) {
					field445 = 276;
				} else {
					field445 = 84;
				}
			}
			if (field445 == 276) {
				class983 var3 = class983.method13920();
				var3.field11432.method18001(class391.field3817.field3812);
				var3.field11432.method17945(0);
				int var4 = var3.field11432.field11503;
				var3.field11432.method17886(910);
				var3.field11432.method17886(1);
				if (Statics.field431 == 211) {
					var3.field11432.method18001(client.field10791 == 14 ? 1 : 0);
				}
				class997 var5 = method4378();
				method14049(var5, (long) field472);
				Statics.field3429 = field472;
				var5.method18001(field472);
				var5.method18001(Statics.field1680.method1303());
				var5.method17886(client.field10772);
				for (int var6 = 0; var6 < 5; var6++) {
					var5.method17886(Statics.field10311.nextInt());
				}
				var5.method17890(client.field10810);
				var5.method18001(client.field10768.field8339);
				var5.method18001(Statics.field10311.nextInt());
				var5.method17907(class34.field624, class34.field626);
				var3.field11432.method17896(var5.field11502, 0, var5.field11503);
				var3.field11432.method17898(var3.field11432.field11503 - var4);
				Statics.field432.method934(var3);
				Statics.field432.method933();
				field445 = 40;
			}
			if (field445 == 40) {
				if (!Statics.field432.method939().method9038(2)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 2);
				Statics.field432.field795.field11503 = 0;
				Statics.field432.field795.field11503 = Statics.field432.field795.method17906();
				field445 = 58;
			}
			if (field445 == 58) {
				if (!Statics.field432.method939().method9038(Statics.field432.field795.field11503)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, Statics.field432.field795.field11503);
				Statics.field432.field795.method17931(Statics.field435);
				Statics.field432.field795.field11503 = 0;
				String var7 = Statics.field432.field795.method17919();
				Statics.field432.field795.field11503 = 0;
				String var8 = class394.field4032.method6087();
				class505.method6081(var7, true, var8, client.field10784);
				field445 = 64;
			}
			if (field445 == 64) {
				if (!Statics.field432.method939().method9038(1)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 1);
				if ((Statics.field432.field795.field11502[0] & 0xFF) == 1) {
					field445 = 70;
				}
			}
			if (field445 == 70) {
				if (!Statics.field432.method939().method9038(16)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 16);
				Statics.field432.field795.field11503 = 16;
				Statics.field432.field795.method17931(Statics.field435);
				Statics.field432.field795.field11503 = 0;
				field439 = Statics.field432.field795.method17914();
				field437 = Statics.field432.field795.method17914();
				field445 = 84;
			}
			if (field445 == 84) {
				Statics.field432.field795.field11503 = 0;
				Statics.field432.method952();
				class983 var9 = class983.method13920();
				class1190 var10 = var9.field11432;
				if (Statics.field431 == 211) {
					class391 var11;
					if (field438) {
						var11 = class391.field3819;
					} else {
						var11 = class391.field3811;
					}
					var10.method18001(var11.field3812);
					var10.method17945(0);
					int var12 = var10.field11503;
					int var13 = var10.field11503;
					if (!field438) {
						var10.method17886(910);
						var10.method17886(1);
						var10.method18001(client.field10791 == 14 ? 1 : 0);
						int var14 = var10.field11503;
						class997 var15 = method896();
						var10.method17896(var15.field11502, 0, var15.field11503);
						var13 = var10.field11503;
						var10.method18001(field439 == -1L ? 1 : 0);
						if (field439 == -1L) {
							var10.method17893(field470);
						} else {
							var10.method17890(field439);
						}
					}
					var10.method18001(client.method2845());
					var10.method17945(Statics.field6586);
					var10.method17945(Statics.field6600);
					var10.method18001(Statics.field688.field11516.method18639());
					class507.method4286(var10);
					var10.method17893(client.field10990);
					var10.method17886(client.field10772);
					class997 var16 = Statics.field688.method18156();
					var10.method18001(var16.field11503);
					var10.method17896(var16.field11502, 0, var16.field11503);
					client.field10800 = true;
					class997 var17 = new class997(Statics.field10581.method18189());
					Statics.field10581.method18188(var17);
					var10.method17896(var17.field11502, 0, var17.field11502.length);
					var10.method17886(client.field10842);
					var10.method17886(client.field10776);
					var10.method17886(client.field10775);
					var10.method17886(client.field10778);
					var10.method17886(client.field10777);
					var10.method17893(Statics.field579);
					var10.method18001(client.field10781 == null ? 0 : 1);
					if (client.field10781 != null) {
						var10.method17893(client.field10781);
					}
					var10.method18001(client.field11079 ? 1 : 0);
					var10.method18001(client.field10785 ? 1 : 0);
					var10.method18001(Statics.field2627 & 0x1);
					var10.method17886(client.field10788);
					var10.method17893(client.field10789);
					var10.method18001(Statics.field9200 != null && Statics.field9200.field8746 == Statics.field8755.field8746 ? 0 : 1);
					var10.method17945(Statics.field8751.field8746);
					Statics.method14463(var10);
					var10.method17932(Statics.field435, var13, var10.field11503);
					var10.method17898(var10.field11503 - var12);
				} else {
					class391 var18;
					if (field438) {
						var18 = class391.field3819;
					} else {
						var18 = class391.field3810;
					}
					var10.method18001(var18.field3812);
					var10.method17945(0);
					int var19 = var10.field11503;
					int var20 = var10.field11503;
					if (!field438) {
						var10.method17886(910);
						var10.method17886(1);
						class997 var21 = method896();
						var10.method17896(var21.field11502, 0, var21.field11503);
						var20 = var10.field11503;
						var10.method18001(field439 == -1L ? 1 : 0);
						if (field439 == -1L) {
							var10.method17893(field470);
						} else {
							var10.method17890(field439);
						}
					}
					var10.method18001(client.field10768.field8339);
					var10.method18001(Statics.field1680.method1303());
					var10.method18001(client.method2845());
					var10.method17945(Statics.field6586);
					var10.method17945(Statics.field6600);
					var10.method18001(Statics.field688.field11516.method18639());
					class507.method4286(var10);
					var10.method17893(client.field10990);
					class997 var22 = Statics.field688.method18156();
					var10.method18001(var22.field11503);
					var10.method17896(var22.field11502, 0, var22.field11503);
					class997 var23 = new class997(Statics.field10581.method18189());
					Statics.field10581.method18188(var23);
					var10.method17896(var23.field11502, 0, var23.field11502.length);
					var10.method17886(client.field10842);
					var10.method17893(Statics.field579);
					var10.method17886(client.field10772);
					var10.method17886(client.field10788);
					var10.method17893(client.field10789);
					var10.method18001(Statics.field2627 & 0x1);
					var10.method17892(false);
					Statics.method14463(var10);
					var10.method17932(Statics.field435, var20, var10.field11503);
					var10.method17898(var10.field11503 - var19);
				}
				Statics.field432.method934(var9);
				Statics.field432.method933();
				Statics.field432.field794 = new class734(Statics.field435);
				int[] var24 = new int[4];
				for (int var25 = 0; var25 < 4; var25++) {
					var24[var25] = Statics.field435[var25] + 50;
				}
				Statics.field432.field809 = new class734(var24);
				new class734(var24);
				Statics.field432.field795.method19566(Statics.field432.field809);
				Statics.field435 = null;
				field445 = 98;
			}
			if (field445 == 98) {
				if (!Statics.field432.method939().method9038(1)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 1);
				int var26 = Statics.field432.field795.method17904();
				Statics.field432.field795.field11503 = 0;
				if (var26 == 21) {
					field445 = 126;
				} else if (var26 == 1) {
					field445 = 103;
					method669(var26);
					return;
				} else if (var26 == 52) {
					Statics.field11819 = var26;
					field445 = 225;
				} else if (var26 == 2) {
					if (field487) {
						field487 = false;
						field445 = 14;
						return;
					}
					if (Statics.field431 == 211) {
						Statics.field7228.method16415();
						field445 = 256;
					} else {
						field445 = 141;
					}
				} else if (var26 == 15) {
					Statics.field432.field797 = -2;
					field445 = 204;
				} else if (var26 == 23 && field475 < 3) {
					field478 = 0;
					field475++;
					field445 = 14;
					Statics.field432.method938();
					return;
				} else if (var26 == 42) {
					field445 = 215;
					method669(var26);
					return;
				} else if (Statics.field431 == 132 && var26 == 49 && client.field10791 != 9) {
					if (field476 != 52) {
						method669(var26);
					}
					return;
				} else if (!field456 || field438 || field472 == -1 || var26 != 35) {
					if (var26 != 53) {
						field445 = 7;
						method669(var26);
						Statics.field432.method938();
						method10367();
						return;
					}
					field445 = 245;
				} else {
					field438 = true;
					field478 = 0;
					field445 = 14;
					Statics.field432.method938();
					return;
				}
			}
			if (field445 == 126) {
				if (!Statics.field432.method939().method9038(1)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 1);
				int var27 = Statics.field432.field795.field11502[0] & 0xFF;
				field464 = var27 * 50;
				field445 = 7;
				method669(21);
				Statics.field432.method938();
				method10367();
				return;
			}
			if (field445 == 215) {
				if (!Statics.field432.method939().method9038(2)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 2);
				field467 = ((Statics.field432.field795.field11502[0] & 0xFF) << 8) + (Statics.field432.field795.field11502[1] & 0xFF);
				field445 = 98;
				return;
			}
			if (field445 == 245) {
				if (!Statics.field432.method939().method9038(4)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 4);
				field486 = Statics.field432.field795.method17910();
				Statics.field432.field795.field11503 = 0;
				field445 = 7;
				method669(53);
				Statics.field432.method938();
				method10367();
				return;
			}
			if (field445 == 194) {
				if (Statics.field11819 == 29) {
					if (!Statics.field432.method939().method9038(1)) {
						return;
					}
					Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 1);
					field483 = Statics.field432.field795.field11502[0] & 0xFF;
				} else if (Statics.field11819 == 45) {
					if (!Statics.field432.method939().method9038(3)) {
						return;
					}
					Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 3);
					field483 = Statics.field432.field795.field11502[0] & 0xFF;
					field482 = ((Statics.field432.field795.field11502[1] & 0xFF) << 8) + (Statics.field432.field795.field11502[2] & 0xFF);
				} else {
					throw new IllegalStateException();
				}
				field445 = 7;
				method669(Statics.field11819);
				Statics.field432.method938();
				method10367();
				if (Statics.method15084(client.field10791)) {
					client.method9620(true);
					field477 = Statics.field11819;
				}
				return;
			}
			if (field445 == 225) {
				if (!Statics.field432.method939().method9038(2)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 2);
				Statics.field432.field795.field11503 = 0;
				Statics.field7542 = Statics.field432.field795.method17906();
				Statics.field432.field795.field11503 = 0;
				field445 = 235;
				return;
			}
			if (field445 == 235) {
				if (!Statics.field432.method939().method9038(Statics.field7542)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, Statics.field7542);
				Statics.field432.field795.field11503 = 0;
				byte[] var28 = new byte[Statics.field7542 + 1];
				Statics.field432.field795.method19561(var28, 0, Statics.field7542);
				Statics.field432.field795.field11503 = 0;
				class997 var29 = new class997(var28);
				String var30 = var29.method17918();
				class505.method4607(var30, true, client.field10784);
				method669(Statics.field11819);
				if (Statics.field431 == 132 && client.field10791 != 9) {
					field445 = 98;
				} else {
					field445 = 7;
					Statics.field432.method938();
					method10367();
				}
				return;
			}
			if (field445 == 256) {
				if (!Statics.field432.method939().method9038(2)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 2);
				Statics.field432.field795.field11503 = 0;
				Statics.field432.field797 = Statics.field432.field795.method17906();
				field445 = 268;
			}
			if (field445 == 268) {
				if (!Statics.field432.method939().method9038(Statics.field432.field797)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, Statics.field432.field797);
				Statics.field432.field795.field11503 = 0;
				boolean var31 = Statics.field432.field795.method17904() == 1;
				while (true) {
					if (Statics.field432.field795.field11503 >= Statics.field432.field797) {
						if (var31) {
							class983 var33 = class983.method13920();
							class1190 var34 = var33.field11432;
							var34.method18001(class391.field3816.field3812);
							Statics.field432.method934(var33);
							Statics.field432.method933();
							field445 = 138;
						} else {
							field445 = 256;
						}
						break;
					}
					class413 var32 = Statics.field8911.method15284(Statics.field432.field795);
					Statics.field7228.field1708.method14735(var32.field4240, var32.field4239);
				}
			}
			if (field445 == 138) {
				if (!Statics.field432.method939().method9038(1)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 1);
				int var35 = Statics.field432.field795.field11502[0] & 0xFF;
				if (var35 != 2) {
					if (var35 != 29 && var35 != 45) {
						field445 = 7;
						method669(var35);
						Statics.field432.method938();
						method10367();
						if (Statics.method15084(client.field10791)) {
							client.method9620(true);
							field477 = var35;
						}
						return;
					}
					Statics.field11819 = var35;
					field445 = 194;
					return;
				}
				field445 = 141;
			}
			if (field445 == 141) {
				if (!Statics.field432.method939().method9038(1)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 1);
				Statics.field622 = Statics.field432.field795.field11502[0] & 0xFF;
				field445 = 157;
			}
			if (field445 == 157) {
				class1190 var36 = Statics.field432.field795;
				if (Statics.field431 == 211) {
					if (!Statics.field432.method939().method9038(Statics.field622)) {
						return;
					}
					Statics.field432.method939().method9029(var36.field11502, 0, Statics.field622);
					var36.field11503 = 0;
					method5247(var36);
					client.field10949 = var36.method17904();
					client.field10950 = var36.method17904();
					client.field10951 = var36.method17904() == 1;
					client.field11081 = var36.method17904() == 1;
					client.field10953 = var36.method17904() == 1;
					client.field11101 = var36.method17904() == 1;
					client.field10945 = var36.method17906();
					client.field11006 = var36.method17904() == 1;
					Statics.field7406 = var36.method17899();
					client.field10948 = var36.method17904() == 1;
					Statics.field10250 = var36.method17918();
					Statics.field1238 = var36.method17913() - class213.method3655();
					client.field10855.method7750().method18890(client.field10948);
					Statics.field3183.method7677().method7750().method18890(client.field10948);
					Statics.field1842.method18901(client.field10948);
					Statics.field7961.method18876(client.field10948);
				} else if (Statics.field432.method939().method9038(Statics.field622)) {
					Statics.field432.method939().method9029(var36.field11502, 0, Statics.field622);
					var36.field11503 = 0;
					method5247(var36);
					client.field10949 = var36.method17904();
					client.field10950 = var36.method17904();
					client.field10951 = var36.method17904() == 1;
					Statics.field7406 = var36.method17899();
					Statics.field4490.field12052 = (byte) var36.method17904();
					client.field11081 = var36.method17904() == 1;
					client.field10953 = var36.method17904() == 1;
					Statics.field8322 = var36.method17914();
					Statics.field1238 = Statics.field8322 - class213.method3655() - var36.method18100();
					int var37 = var36.method17904();
					client.field11006 = (var37 & 0x1) != 0;
					Statics.field11709 = (var37 & 0x2) != 0;
					Statics.field2676 = var36.method17910();
					Statics.field3056 = var36.method17910();
					Statics.field9183 = var36.method17906();
					Statics.field7922 = var36.method17906();
					Statics.field1839 = var36.method17906();
					Statics.field7942 = var36.method17910();
					Statics.field636 = new class25(Statics.field7942);
					(new Thread(Statics.field636)).start();
					Statics.field6720 = var36.method17904();
					Statics.field2830 = var36.method17906();
					Statics.field4427 = var36.method17906();
					Statics.field11883 = var36.method17904() == 1;
					Statics.field4490.field12062 = Statics.field4490.field12057 = Statics.field12492 = var36.method17919();
					Statics.field5009 = var36.method17904();
					Statics.field6729 = var36.method17910();
					Statics.field9200 = new class749();
					Statics.field9200.field8746 = var36.method17906();
					if (Statics.field9200.field8746 == 65535) {
						Statics.field9200.field8746 = -1;
					}
					Statics.field9200.field8745 = var36.method17919();
					Statics.field9200.field8744 = var36.method17906();
					Statics.field9200.field8742 = var36.method17906();
					if (Statics.field1811 != class682.field8277 && (Statics.field1811 != class682.field8269 || client.field10949 < 2) && Statics.field8755.method14757(Statics.field8752)) {
						class750.method10337();
					}
				} else {
					return;
				}
				if (client.field10953) {
					try {
						class766.method14969(Statics.field11885, "zap");
					} catch (Throwable var49) {
						if (client.field10770) {
							try {
								Statics.field11885.getAppletContext().showDocument(new URL(Statics.field11885.getCodeBase(), "blank.ws"), "tbi");
							} catch (Exception var48) {
							}
						}
					}
				} else {
					try {
						class766.method14969(Statics.field11885, "unzap");
					} catch (Throwable var47) {
					}
				}
				if (Statics.field1811 == class682.field8273) {
					class394.field4024.method6090();
				}
				if (Statics.field431 != 211) {
					field445 = 7;
					method669(2);
					method10282();
					client.method6972(13);
					Statics.field432.field796 = null;
					return;
				}
				field445 = 170;
			}
			if (field445 == 170) {
				if (!Statics.field432.method939().method9038(3)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 3);
				field445 = 188;
			}
			if (field445 == 188) {
				class1190 var41 = Statics.field432.field795;
				var41.field11503 = 0;
				if (var41.method19573()) {
					if (!Statics.field432.method939().method9038(1)) {
						return;
					}
					Statics.field432.method939().method9029(var41.field11502, 3, 1);
				}
				Statics.field432.field796 = Statics.method18494()[var41.method19560()];
				Statics.field432.field797 = var41.method17906();
				field445 = 160;
			}
			if (field445 == 160) {
				if (!Statics.field432.method939().method9038(Statics.field432.field797)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, Statics.field432.field797);
				Statics.field432.field795.field11503 = 0;
				int var42 = Statics.field432.field797;
				field445 = 7;
				method669(2);
				method4320();
				class40.method16435(Statics.field432.field795);
				int var43 = var42 - Statics.field432.field795.field11503;
				class1190 var44 = new class1190(var43);
				System.arraycopy(Statics.field432.field795.field11502, Statics.field432.field795.field11503, var44.field11502, 0, var43);
				Statics.field432.field795.field11503 += var43;
				if (class393.field3867 == Statics.field432.field796) {
					client.field10855.method7749(new class494(class496.field5066, var44));
				} else {
					client.field10855.method7749(new class494(class496.field5071, var44));
				}
				if (Statics.field432.field795.field11503 != var42) {
					throw new RuntimeException(Statics.field432.field795.field11503 + " " + var42);
				}
				Statics.field432.field796 = null;
				return;
			}
			if (field445 == 204) {
				if (Statics.field432.field797 == -2) {
					if (!Statics.field432.method939().method9038(2)) {
						return;
					}
					Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, 2);
					Statics.field432.field795.field11503 = 0;
					Statics.field432.field797 = Statics.field432.field795.method17906();
				}
				if (!Statics.field432.method939().method9038(Statics.field432.field797)) {
					return;
				}
				Statics.field432.method939().method9029(Statics.field432.field795.field11502, 0, Statics.field432.field797);
				Statics.field432.field795.field11503 = 0;
				int var45 = Statics.field432.field797;
				field445 = 7;
				method669(15);
				Statics.method6877();
				class40.method16435(Statics.field432.field795);
				if (Statics.field432.field795.field11503 != var45) {
					throw new RuntimeException(Statics.field432.field795.field11503 + " " + var45);
				}
				Statics.field432.field796 = null;
				return;
			}
		} catch (IOException var50) {
			Statics.field432.method938();
			if (field475 < 3) {
				if (Statics.field431 == 211) {
					Statics.field8755.method14758();
				} else {
					Statics.field8751.method14758();
				}
				field478 = 0;
				field475++;
				field445 = 14;
			} else {
				field445 = 7;
				method669(-4);
				method10367();
			}
		}
	}

	@ObfuscatedName("kl.b(Lase;I)V")
	public static void method5247(class1190 arg0) {
		boolean var1 = arg0.method17904() == 1;
		if (!var1) {
			return;
		}
		boolean var2 = false;
		int var3 = arg0.method19558() << 24;
		int var4 = var3 | arg0.method19558() << 16;
		int var5 = var4 | arg0.method19558() << 8;
		int var6 = var5 | arg0.method19558();
		Statics.field1895.method590(Statics.field3429, var6);
	}

	@ObfuscatedName("s.h(IB)V")
	public static void method481(int arg0) {
	}

	@ObfuscatedName("iq.a(B)Lalw;")
	public static class997 method4378() {
		class997 var0 = new class997(518);
		Statics.field435 = new int[4];
		Statics.field435[0] = Statics.field10311.nextInt();
		Statics.field435[1] = Statics.field10311.nextInt();
		Statics.field435[2] = Statics.field10311.nextInt();
		Statics.field435[3] = Statics.field10311.nextInt();
		var0.method18001(10);
		var0.method17886(Statics.field435[0]);
		var0.method17886(Statics.field435[1]);
		var0.method17886(Statics.field435[2]);
		var0.method17886(Statics.field435[3]);
		var0.method17890(Statics.field434);
		if (client.field10791 == 14) {
			var0.method17886(Statics.field436[0]);
			var0.method17886(Statics.field436[1]);
			var0.method17886(Statics.field436[2]);
			var0.method17886(Statics.field436[3]);
		}
		Statics.field436 = Statics.field435;
		return var0;
	}

	@ObfuscatedName("zl.g(Lalw;J)V")
	public static void method14049(class997 arg0, long arg1) {
		class743 var3;
		if (field429 != null && field429.length() == 6) {
			if (field473) {
				var3 = class743.field8723;
			} else {
				var3 = class743.field8726;
			}
		} else if (Statics.field1895.method589(arg1)) {
			var3 = class743.field8722;
		} else {
			var3 = class743.field8724;
		}
		arg0.method18001(var3.method1303());
		switch(var3.field8725) {
			case 0:
				arg0.method17886(Statics.field1895.method577(arg1));
				break;
			case 1:
			case 3:
				arg0.method17885(Integer.parseInt(field429));
				arg0.field11503++;
				break;
			case 2:
				arg0.field11503 += 4;
		}
	}

	@ObfuscatedName("ap.i(B)Lalw;")
	public static class997 method896() {
		class997 var0 = method4378();
		if (client.field10791 != 14) {
			long var1;
			if (field472 != -1) {
				var1 = field472;
			} else if (field439 == -1L) {
				var1 = class695.method15380(field470);
			} else {
				var1 = field439;
			}
			Statics.field3429 = var1;
			method14049(var0, var1);
			var0.method17892(false);
			var0.method17893(field481);
			var0.method17890(field437);
			var0.method17890(client.field10810);
		}
		var0.method17907(class34.field624, class34.field626);
		return var0;
	}

	@ObfuscatedName("ag.j(II)V")
	public static void method669(int arg0) {
		if (Statics.field431 == 132) {
			field476 = arg0;
		} else if (Statics.field431 == 211) {
			field477 = arg0;
		}
	}

	@ObfuscatedName("ye.t(I)V")
	public static void method10367() {
		if (client.method14437(client.field10791)) {
			if (client.field10835.method939() == null) {
				client.method6972(17);
			} else {
				client.method6972(13);
			}
		} else if (client.field10791 == 17 || client.field10791 == 7) {
			client.method6972(4);
		} else if (client.field10791 == 9) {
			client.method6972(4);
		}
	}

	@ObfuscatedName("acm.ag(B)V")
	public static void method14959() {
		Statics.field432.method952();
		Statics.field432.field795.field11503 = 0;
		Statics.field432.field790 = null;
		Statics.field432.field806 = null;
		Statics.field432.field805 = null;
		Statics.field432.field789 = 0;
		client.field10831 = 0;
		client.field11080 = 0;
		client.field10811 = 0;
		client.field11084 = 0;
		client.field11055 = null;
		Statics.field7421 = 0;
		Statics.field9267 = null;
		Statics.field6867 = null;
		Statics.field1890 = null;
		client.field11095 = true;
		class648.method13845();
		for (int var0 = 0; var0 < Statics.field7410.field635.length; var0++) {
			class642 var1 = new class642(Statics.field2767.method9778(var0), false);
			var1.method10160(0);
			var1.method10164(0);
			Statics.field7410.field635[var0] = var1;
		}
		Statics.field7410.field632.method9624();
		class1171.method716();
		client.method4336(Statics.field432);
	}

	@ObfuscatedName("xb.ah(I)V")
	public static void method10282() {
		method14959();
	}

	@ObfuscatedName("hz.al(I)V")
	public static void method4320() {
		if (client.field10791 == 19) {
			client.method9872();
		}
		client.field10835.method938();
		method14959();
		Statics.field8491 = true;
		class780.method4052();
		for (int var0 = 0; var0 < client.field10851.length; var0++) {
			client.field10851[var0] = null;
		}
		client.field10973 = false;
		client.field10870 = (int) (Math.random() * 100.0D) - 50;
		client.field10880 = (int) (Math.random() * 110.0D) - 55;
		client.field10861 = (int) (Math.random() * 80.0D) - 40;
		client.field10885 = (int) (Math.random() * 120.0D) - 60;
		client.field10887 = (int) (Math.random() * 30.0D) - 20;
		client.field10895 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		class42.method9233();
		for (int var1 = 0; var1 < 2048; var1++) {
			client.field10944[var1] = null;
		}
		Statics.field4490 = null;
		client.field11011 = 0;
		client.field10906 = 0;
		client.field10838.method14499();
		client.field10965.method14152();
		client.field10966.method14499();
		client.field10864.method14242();
		client.field10964.method14499();
		class962.field11237 = new class715();
		class962.field11242 = new class715();
		Statics.field8550 = 0;
		Statics.field8492 = 0;
		Statics.field741 = 0;
		Statics.field2937 = 0;
		Statics.field490 = 0;
		Statics.field6714 = 0;
		Statics.field2626 = 0;
		Statics.field1983 = 0;
		Statics.field8576 = 0;
		Statics.field708 = 0;
		if (client.field10978 != -1) {
			class226.method7602(client.field10978);
		}
		for (class999 var2 = (class999) client.field10979.method14500(); var2 != null; var2 = (class999) client.field10979.method14502()) {
			if (!var2.method8441()) {
				var2 = (class999) client.field10979.method14500();
				if (var2 == null) {
					break;
				}
			}
			client.method214(var2, true, false);
		}
		client.field10978 = -1;
		client.field10979 = new class729(8);
		class226.method5075();
		client.field11056 = null;
		for (int var3 = 0; var3 < 8; var3++) {
			client.field10961[var3] = null;
			client.field10962[var3] = false;
			client.field10832[var3] = -1;
		}
		class961.method2752();
		client.field11023 = true;
		for (int var4 = 0; var4 < 114; var4++) {
			client.field11072[var4] = true;
		}
		for (int var5 = 0; var5 < 3; var5++) {
			for (int var6 = 0; var6 < 8; var6++) {
				client.field11057[var5][var6] = new class482();
			}
		}
		client.field10855.method7816().method10019();
		client.field10902 = true;
		class598.field7501 = class260.field2694 = class738.field8650 = new short[256];
		Statics.field4868 = class776.field9079.method15021(Statics.field1680);
		Statics.field688.method18157(Statics.field688.field11534, Statics.field688.field11533.method18496());
		client.field10842 = 0;
		class22.method5175();
		Statics.field594 = null;
		Statics.field3457 = 0L;
	}

	@ObfuscatedName("aiz.ai(I)Z")
	public static boolean method16808() {
		if (client.field10791 == 4) {
			return !method2865() && !class24.method9610();
		} else {
			return false;
		}
	}
}
