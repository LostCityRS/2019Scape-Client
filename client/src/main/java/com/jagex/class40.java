package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aw")
public class class40 {

	@ObfuscatedName("aw.m")
	public static byte[] field696 = new byte[2048];

	@ObfuscatedName("aw.k")
	public static byte[] field697 = new byte[2048];

	@ObfuscatedName("aw.f")
	public static Packet[] field706 = new Packet[2048];

	@ObfuscatedName("aw.w")
	public static Packet[] field699 = new Packet[2048];

	@ObfuscatedName("aw.l")
	public static int field698 = 0;

	@ObfuscatedName("aw.u")
	public static int[] field703 = new int[2048];

	@ObfuscatedName("aw.z")
	public static int field702 = 0;

	@ObfuscatedName("aw.p")
	public static int[] field700 = new int[2048];

	@ObfuscatedName("aw.d")
	public static class19[] field704 = new class19[2048];

	@ObfuscatedName("aw.c")
	public static int field695 = 0;

	@ObfuscatedName("aw.r")
	public static int[] field707 = new int[2048];

	public class40() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aga.e(Lase;I)V")
	public static final void method16435(class1190 arg0) {
		arg0.method19562();
		int var1 = client.field10945;
		class1130 var2 = Statics.field4490 = client.field10944[var1] = new class1130(client.field10855.method7743());
		var2.field10406 = var1;
		int var3 = arg0.method19583(30);
		byte var4 = (byte) (var3 >> 28);
		int var5 = var3 >> 14 & 0x3FFF;
		int var6 = var3 & 0x3FFF;
		class594 var7 = client.field10855.method7727();
		var2.field10450[0] = var5 - var7.field7426;
		var2.field10448[0] = var6 - var7.field7427;
		var2.method10538((float) ((var2.field10450[0] << 9) + (var2.method16546() << 8)), var2.method10525().field4298.field4311, (float) ((var2.field10448[0] << 9) + (var2.method16546() << 8)));
		Statics.field4826 = var2.field11717 = var2.field11714 = var4;
		if (client.field10855.method7793().method7105(var2.field10450[0], var2.field10448[0])) {
			var2.field11714++;
		}
		if (field706[var1] != null) {
			var2.method19129(field706[var1]);
		}
		if (field699[var1] != null) {
			var2.method19111(field699[var1]);
		}
		field698 = 0;
		field703[++field698 - 1] = var1;
		field696[var1] = 0;
		field702 = 0;
		for (int var8 = 1; var8 < 2048; var8++) {
			if (var1 != var8) {
				int var9 = arg0.method19583(18);
				int var10 = var9 >> 16 & 0x3;
				int var11 = var9 >> 8 & 0xFF;
				int var12 = var9 & 0xFF;
				class19 var13 = field704[var8] = new class19();
				var13.field524 = (var10 << 28) + (var11 << 14) + var12;
				var13.field523 = 0;
				var13.field522 = -1;
				var13.field525 = class202.field1950;
				var13.field526 = false;
				field700[++field702 - 1] = var8;
				field696[var8] = 0;
			}
		}
		arg0.method19564();
		class266 var14 = Statics.field9155.method4780();
		if (class266.field2815 == var14) {
			class910 var15 = (class910) Statics.field9155.method4709();
			var15.method16684();
		}
		class263 var16 = Statics.field9155.method4743();
		if (class263.field2788 == var16) {
			class1071 var17 = (class1071) Statics.field9155.method4797();
			var17.method18815();
		}
	}

	@ObfuscatedName("sj.n(Lase;II)V")
	public static final void method8355(class1190 arg0, int arg1) {
		field695 = 0;
		method5209(arg0);
		method613(arg0);
		if (arg0.pos != arg1) {
			throw new RuntimeException(arg0.pos + " " + arg1);
		}
	}

	@ObfuscatedName("ka.m(Lase;I)V")
	public static final void method5209(class1190 arg0) {
		int var1 = 0;
		arg0.method19562();
		for (int var2 = 0; var2 < field698; var2++) {
			int var3 = field703[var2];
			if ((field696[var3] & 0x1) == 0) {
				if (var1 > 0) {
					var1--;
					field696[var3] = (byte) (field696[var3] | 0x2);
				} else {
					int var4 = arg0.method19583(1);
					if (var4 == 0) {
						var1 = method1598(arg0);
						field696[var3] = (byte) (field696[var3] | 0x2);
					} else {
						method17602(arg0, var3);
					}
				}
			}
		}
		arg0.method19564();
		if (var1 != 0) {
			throw new RuntimeException();
		}
		arg0.method19562();
		for (int var5 = 0; var5 < field698; var5++) {
			int var6 = field703[var5];
			if ((field696[var6] & 0x1) != 0) {
				if (var1 > 0) {
					var1--;
					field696[var6] = (byte) (field696[var6] | 0x2);
				} else {
					int var7 = arg0.method19583(1);
					if (var7 == 0) {
						var1 = method1598(arg0);
						field696[var6] = (byte) (field696[var6] | 0x2);
					} else {
						method17602(arg0, var6);
					}
				}
			}
		}
		arg0.method19564();
		if (var1 != 0) {
			throw new RuntimeException();
		}
		arg0.method19562();
		for (int var8 = 0; var8 < field702; var8++) {
			int var9 = field700[var8];
			if ((field696[var9] & 0x1) != 0) {
				if (var1 > 0) {
					var1--;
					field696[var9] = (byte) (field696[var9] | 0x2);
				} else {
					int var10 = arg0.method19583(1);
					if (var10 == 0) {
						var1 = method1598(arg0);
						field696[var9] = (byte) (field696[var9] | 0x2);
					} else if (method14343(arg0, var9)) {
						field696[var9] = (byte) (field696[var9] | 0x2);
					}
				}
			}
		}
		arg0.method19564();
		if (var1 != 0) {
			throw new RuntimeException();
		}
		arg0.method19562();
		for (int var11 = 0; var11 < field702; var11++) {
			int var12 = field700[var11];
			if ((field696[var12] & 0x1) == 0) {
				if (var1 > 0) {
					var1--;
					field696[var12] = (byte) (field696[var12] | 0x2);
				} else {
					int var13 = arg0.method19583(1);
					if (var13 == 0) {
						var1 = method1598(arg0);
						field696[var12] = (byte) (field696[var12] | 0x2);
					} else if (method14343(arg0, var12)) {
						field696[var12] = (byte) (field696[var12] | 0x2);
					}
				}
			}
		}
		arg0.method19564();
		if (var1 != 0) {
			throw new RuntimeException();
		}
		field698 = 0;
		field702 = 0;
		for (int var14 = 1; var14 < 2048; var14++) {
			field696[var14] = (byte) (field696[var14] >> 1);
			class1130 var15 = client.field10944[var14];
			if (var15 == null) {
				field700[++field702 - 1] = var14;
			} else {
				field703[++field698 - 1] = var14;
			}
		}
	}

	@ObfuscatedName("ck.k(Lase;I)I")
	public static int method1598(class1190 arg0) {
		int var1 = arg0.method19583(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = arg0.method19583(5);
		} else if (var1 == 2) {
			var2 = arg0.method19583(8);
		} else {
			var2 = arg0.method19583(11);
		}
		return var2;
	}

	@ObfuscatedName("akz.f(Lase;IS)V")
	public static void method17602(class1190 arg0, int arg1) {
		class594 var2 = client.field10855.method7727();
		boolean var3 = arg0.method19583(1) == 1;
		if (var3) {
			field707[++field695 - 1] = arg1;
		}
		int var4 = arg0.method19583(2);
		class1130 var5 = client.field10944[arg1];
		if (var4 == 0) {
			if (!var3) {
				if (client.field10945 == arg1) {
					throw new RuntimeException();
				}
				class19 var6 = field704[arg1] = new class19();
				class690.method13901();
				var6.field524 = (var2.field7427 + var5.field10448[0] >> 6) + (var2.field7426 + var5.field10450[0] >> 6 << 14) + (var5.field11717 << 28);
				if (var5.field12056 == -1) {
					var6.field523 = var5.field10395.method316();
				} else {
					var6.field523 = var5.field12056;
				}
				var6.field522 = var5.field10417;
				var6.field525 = var5.field12070;
				var6.field526 = var5.field12048;
				if (var5.field12067 > 0) {
					Statics.method5142(var5);
				}
				client.field10944[arg1] = null;
				if (arg0.method19583(1) != 0) {
					method14343(arg0, arg1);
				}
			}
		} else if (var4 == 1) {
			int var7 = arg0.method19583(3);
			int var8 = arg0.method19583(1);
			int var9 = var5.field10450[0];
			int var10 = var5.field10448[0];
			if (var8 == 1) {
				field697[arg1] = class690.field8316.field8313;
				int var11 = arg0.method19583(2);
				switch(var11) {
					case 0:
						var5.method19117(var9, var10 + 1, field697[arg1]);
						break;
					case 1:
						var5.method19117(var9 - 1, var10, field697[arg1]);
						break;
					case 2:
						var5.method19117(var9 + 1, var10, field697[arg1]);
						break;
					case 3:
						var5.method19117(var9, var10 - 1, field697[arg1]);
				}
			}
			if (var7 == 0) {
				var9--;
				var10--;
			} else if (var7 == 1) {
				var10--;
			} else if (var7 == 2) {
				var9++;
				var10--;
			} else if (var7 == 3) {
				var9--;
			} else if (var7 == 4) {
				var9++;
			} else if (var7 == 5) {
				var9--;
				var10++;
			} else if (var7 == 6) {
				var10++;
			} else if (var7 == 7) {
				var9++;
				var10++;
			}
			var5.method19117(var9, var10, field697[arg1]);
		} else if (var4 == 2) {
			int var12 = arg0.method19583(4);
			int var13 = var5.field10450[0];
			int var14 = var5.field10448[0];
			if (var12 == 0) {
				var13 -= 2;
				var14 -= 2;
			} else if (var12 == 1) {
				var13--;
				var14 -= 2;
			} else if (var12 == 2) {
				var14 -= 2;
			} else if (var12 == 3) {
				var13++;
				var14 -= 2;
			} else if (var12 == 4) {
				var13 += 2;
				var14 -= 2;
			} else if (var12 == 5) {
				var13 -= 2;
				var14--;
			} else if (var12 == 6) {
				var13 += 2;
				var14--;
			} else if (var12 == 7) {
				var13 -= 2;
			} else if (var12 == 8) {
				var13 += 2;
			} else if (var12 == 9) {
				var13 -= 2;
				var14++;
			} else if (var12 == 10) {
				var13 += 2;
				var14++;
			} else if (var12 == 11) {
				var13 -= 2;
				var14 += 2;
			} else if (var12 == 12) {
				var13--;
				var14 += 2;
			} else if (var12 == 13) {
				var14 += 2;
			} else if (var12 == 14) {
				var13++;
				var14 += 2;
			} else if (var12 == 15) {
				var13 += 2;
				var14 += 2;
			}
			var5.method19117(var13, var14, field697[arg1]);
		} else {
			int var15 = arg0.method19583(1);
			if (var15 == 0) {
				int var16 = arg0.method19583(15);
				int var17 = var16 >> 12 & 0x7;
				int var18 = (byte) (var16 >> 10) & 0x3;
				int var19 = var16 >> 5 & 0x1F;
				if (var19 > 15) {
					var19 -= 32;
				}
				int var20 = var16 & 0x1F;
				if (var20 > 15) {
					var20 -= 32;
				}
				int var21 = var5.field10450[0] + var19;
				int var22 = var5.field10448[0] + var20;
				if (class690.field8317.field8320 == var17) {
					var5.method19118(var21, var22);
				} else {
					field697[arg1] = (byte) (var17 - 1);
					var5.method19117(var21, var22, field697[arg1]);
				}
				var5.field11717 = var5.field11714 = (byte) (var5.field11717 + var18 & 0x3);
				if (client.field10855.method7793().method7105(var21, var22)) {
					var5.field11714++;
				}
				if (client.field10945 == arg1 && Statics.field4826 != var5.field11717) {
					Statics.field4826 = var5.field11717;
				}
			} else {
				int var23 = arg0.method19583(3);
				int var24 = arg0.method19583(30);
				int var25 = var24 >> 28 & 0x3;
				int var26 = var24 >> 14 & 0x3FFF;
				int var27 = var24 & 0x3FFF;
				int var28 = (var2.field7426 + var5.field10450[0] + var26 & 0x3FFF) - var2.field7426;
				int var29 = (var2.field7427 + var5.field10448[0] + var27 & 0x3FFF) - var2.field7427;
				if (class690.field8317.field8320 == var23) {
					var5.method19118(var28, var29);
				} else {
					field697[arg1] = (byte) (var23 - 1);
					var5.method19117(var28, var29, field697[arg1]);
				}
				var5.field11717 = var5.field11714 = (byte) (var5.field11717 + var25 & 0x3);
				if (client.field10855.method7793().method7105(var28, var29)) {
					var5.field11714++;
				}
				if (client.field10945 == arg1) {
					Statics.field4826 = var5.field11717;
				}
			}
		}
	}

	@ObfuscatedName("aap.w(Lase;II)Z")
	public static boolean method14343(class1190 arg0, int arg1) {
		int var2 = arg0.method19583(2);
		if (var2 == 0) {
			if (arg0.method19583(1) != 0) {
				method14343(arg0, arg1);
			}
			int var3 = arg0.method19583(6);
			int var4 = arg0.method19583(6);
			boolean var5 = arg0.method19583(1) == 1;
			if (var5) {
				field707[++field695 - 1] = arg1;
			}
			if (client.field10944[arg1] != null) {
				throw new RuntimeException();
			}
			class19 var6 = field704[arg1];
			class1130 var7 = client.field10944[arg1] = new class1130(client.field10855.method7743());
			var7.field10406 = arg1;
			if (field706[arg1] != null) {
				var7.method19129(field706[arg1]);
			}
			if (field699[arg1] != null) {
				var7.method19111(field699[arg1]);
			}
			var7.method16491(var6.field523, true);
			var7.field10417 = var6.field522;
			int var8 = var6.field524;
			int var9 = var8 >> 28;
			int var10 = var8 >> 14 & 0xFF;
			int var11 = var8 & 0xFF;
			class594 var12 = client.field10855.method7727();
			int var13 = (var10 << 6) + var3 - var12.field7426;
			int var14 = (var11 << 6) + var4 - var12.field7427;
			var7.field12070 = var6.field525;
			var7.field12048 = var6.field526;
			var7.field10441[0] = field697[arg1];
			var7.field11717 = var7.field11714 = (byte) var9;
			if (client.field10855.method7793().method7105(var13, var14)) {
				var7.field11714++;
			}
			var7.method19118(var13, var14);
			field704[arg1] = null;
			return true;
		} else if (var2 == 1) {
			int var15 = arg0.method19583(2);
			int var16 = field704[arg1].field524;
			field704[arg1].field524 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
			return false;
		} else if (var2 == 2) {
			int var17 = arg0.method19583(5);
			int var18 = var17 >> 3 & 0x3;
			int var19 = var17 & 0x7;
			int var20 = field704[arg1].field524;
			assert field697[arg1] >= 0 && field697[arg1] <= 3;
			int var21 = (var20 >> 28) + var18 & 0x3;
			int var22 = var20 >> 14 & 0xFF;
			int var23 = var20 & 0xFF;
			if (var19 == 0) {
				var22--;
				var23--;
			}
			if (var19 == 1) {
				var23--;
			}
			if (var19 == 2) {
				var22++;
				var23--;
			}
			if (var19 == 3) {
				var22--;
			}
			if (var19 == 4) {
				var22++;
			}
			if (var19 == 5) {
				var22--;
				var23++;
			}
			if (var19 == 6) {
				var23++;
			}
			if (var19 == 7) {
				var22++;
				var23++;
			}
			class686.method1897(class690.method13901(), field697[arg1]);
			field704[arg1].field524 = (var21 << 28) + (var22 << 14) + var23;
			return false;
		} else {
			int var24 = arg0.method19583(20);
			int var25 = var24 >> 18 & 0x3;
			int var26 = var24 >> 16 & 0x3;
			int var27 = var24 >> 8 & 0xFF;
			int var28 = var24 & 0xFF;
			int var29 = field704[arg1].field524;
			field697[arg1] = (byte) (var25 - 1);
			assert field697[arg1] >= 0 && field697[arg1] <= 3;
			int var30 = (var29 >> 28) + var26 & 0x3;
			int var31 = (var29 >> 14) + var27 & 0xFF;
			int var32 = var28 + var29 & 0xFF;
			class686.method1897(class690.method13901(), var25 - 1);
			field704[arg1].field524 = (var30 << 28) + (var31 << 14) + var32;
			return false;
		}
	}

	@ObfuscatedName("a.l(Lase;B)V")
	public static final void method613(class1190 arg0) {
		for (int var1 = 0; var1 < field695; var1++) {
			arg0.g2();
			int var2 = field707[var1];
			class1130 var3 = client.field10944[var2];
			int var4 = arg0.g1();
			if ((var4 & 0x40) != 0) {
				var4 += arg0.g1() << 8;
			}
			if ((var4 & 0x1000) != 0) {
				var4 += arg0.g1() << 16;
			}
			method7474(arg0, var2, var3, var4);
		}
	}

	@ObfuscatedName("rp.u(Lase;ILaqk;II)V")
	public static final void method7474(class1190 arg0, int arg1, class1130 arg2, int arg3) {
		if ((arg3 & 0x80) != 0) {
			int[] var4 = new int[4];
			for (int var5 = 0; var5 < 4; var5++) {
				var4[var5] = arg0.gSmart2or4null();
			}
			int var6 = arg0.g1_alt2();
			client.method9423(arg2, var4, var6, false);
		}
		if ((arg3 & 0x40000) != 0) {
			arg0.pos += 2;
			int var7 = arg0.data[(++arg0.pos) - 1] & 0xFF;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.g1_alt3();
				class470 var10 = (class470) class686.method1897(Statics.method7338(), var9);
				class413 var11 = Statics.field8485.method15285(arg0, var10);
				arg2.field10460.method14735(var11.field4240, var11.field4239);
			}
		}
		if ((arg3 & 0x10) != 0) {
			arg2.field12056 = arg0.g2_alt3();
			if (arg2.field10400 == 0) {
				arg2.method16490(arg2.field12056);
				arg2.field12056 = -1;
			}
		}
		if ((arg3 & 0x10000) != 0) {
			arg2.field12048 = arg0.g1_alt3() == 1;
		}
		if ((arg3 & 0x20) != 0) {
			int var12 = arg0.g1_alt1();
			if (var12 > 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					int var14 = -1;
					boolean var15 = true;
					int var16 = -1;
					int var17 = arg0.gSmart1or2();
					int var18;
					if (var17 == 32767) {
						var17 = arg0.gSmart1or2();
						var18 = arg0.gSmart1or2();
						var14 = arg0.gSmart1or2();
						var16 = arg0.gSmart1or2();
					} else if (var17 == 32766) {
						var17 = -1;
						var18 = arg0.g1();
					} else {
						var18 = arg0.gSmart1or2();
					}
					int var19 = arg0.gSmart1or2();
					arg2.method16498(var17, var18, var14, var16, client.field10903, var19);
				}
			}
			int var20 = arg0.g1_alt3();
			if (var20 > 0) {
				for (int var21 = 0; var21 < var20; var21++) {
					int var22 = arg0.gSmart1or2();
					int var23 = arg0.gSmart1or2();
					if (var23 == 32767) {
						arg2.method16500(var22);
					} else {
						int var24 = arg0.gSmart1or2();
						int var25 = arg0.g1_alt3();
						int var26 = var23 > 0 ? arg0.g1_alt2() : var25;
						arg2.method16499(var22, client.field10903, var23, var24, var25, var26);
					}
				}
			}
		}
		if ((arg3 & 0x8000) != 0) {
			int var27 = arg0.g1_alt3();
			int[] var28 = new int[var27];
			int[] var29 = new int[var27];
			int[] var30 = new int[var27];
			for (int var31 = 0; var31 < var27; var31++) {
				var28[var31] = arg0.gSmart2or4null();
				var29[var31] = arg0.g1_alt1();
				var30[var31] = arg0.g2_alt3();
			}
			client.method16758(arg2, var28, var29, var30);
		}
		if ((arg3 & 0x100000) != 0) {
			int var32 = arg0.g2_alt3();
			int var33 = arg0.g4_alt1();
			if (var32 == 65535) {
				var32 = -1;
			}
			int var34 = arg0.g1_alt1();
			int var35 = var34 & 0x7;
			int var36 = var34 >> 3 & 0xF;
			if (var36 == 15) {
				var36 = -1;
			}
			boolean var37 = (var34 >> 7 & 0x1) == 1;
			arg2.method16563(var32, var33, var35, var36, var37, 4);
		}
		if ((arg3 & 0x4) != 0) {
			int var38 = arg0.g1_alt1();
			byte[] var39 = new byte[var38];
			Packet var40 = new Packet(var39);
			arg0.gdata_alt2(var39, 0, var38);
			field706[arg1] = var40;
			arg2.method19129(var40);
		}
		if ((arg3 & 0x80000) != 0) {
			int var41 = arg0.g1_alt1();
			int[] var42 = new int[var41];
			int[] var43 = new int[var41];
			for (int var44 = 0; var44 < var41; var44++) {
				int var45 = arg0.g2_alt1();
				if ((var45 & 0xC000) == 49152) {
					int var46 = arg0.g2_alt1();
					var42[var44] = var45 << 16 | var46;
				} else {
					var42[var44] = var45;
				}
				var43[var44] = arg0.g2_alt2();
			}
			arg2.method16493(var42, var43);
		}
		if ((arg3 & 0x2000) != 0) {
			int var47 = arg0.g2();
			int var48 = arg0.g4_alt2();
			if (var47 == 65535) {
				var47 = -1;
			}
			int var49 = arg0.g1_alt1();
			int var50 = var49 & 0x7;
			int var51 = var49 >> 3 & 0xF;
			if (var51 == 15) {
				var51 = -1;
			}
			boolean var52 = (var49 >> 7 & 0x1) == 1;
			arg2.method16563(var47, var48, var50, var51, var52, 2);
		}
		if ((arg3 & 0x2) != 0) {
			int var53 = arg0.g2_alt3();
			int var54 = arg0.g4_alt3();
			if (var53 == 65535) {
				var53 = -1;
			}
			int var55 = arg0.g1_alt1();
			int var56 = var55 & 0x7;
			int var57 = var55 >> 3 & 0xF;
			if (var57 == 15) {
				var57 = -1;
			}
			boolean var58 = (var55 >> 7 & 0x1) == 1;
			arg2.method16563(var53, var54, var56, var57, var58, 0);
		}
		if ((arg3 & 0x800) != 0) {
			int var59 = arg0.g1();
			byte[] var60 = new byte[var59];
			Packet var61 = new Packet(var60);
			arg0.gdata_alt1(var60, 0, var59);
			field699[arg1] = var61;
			arg2.method19111(var61);
		}
		if ((arg3 & 0x20000) != 0) {
			arg2.field10460.method14749();
			arg0.pos += 2;
			int var62 = arg0.data[(++arg0.pos) - 1] & 0xFF;
			for (int var63 = 0; var63 < var62; var63++) {
				int var64 = arg0.g1_alt3();
				class470 var65 = (class470) class686.method1897(Statics.method7338(), var64);
				class413 var66 = Statics.field8485.method15285(arg0, var65);
				arg2.field10460.method14735(var66.field4240, var66.field4239);
			}
		}
		if ((arg3 & 0x200) != 0) {
			String var67 = arg0.gjstr();
			if (Statics.field4490 == arg2) {
				class241.method2664(2, 0, arg2.method19115(true), arg2.method19116(false), arg2.field12057, var67, null);
			}
			arg2.method19124(var67, 0, 0);
		}
		if ((arg3 & 0x8) != 0) {
			arg2.field10423 = arg0.g1b_alt2() * 262144;
			arg2.field10425 = arg0.g1b() * 262144;
			arg2.field10457 = arg0.g1b_alt2() * 262144;
			arg2.field10426 = arg0.g1b_alt1() * 262144;
			arg2.field10419 = arg0.g1b_alt1();
			arg2.field10428 = arg0.g1b();
			arg2.field10429 = arg0.g2_alt3() + client.field10903;
			arg2.field10399 = arg0.g2_alt1() + client.field10903;
			arg2.field10431 = arg0.g2_alt1();
			arg2.field10400 = 1;
			arg2.field10396 = 0;
			arg2.field10423 = arg2.field10423 * 262144 + arg2.field10450[0] * 262144;
			arg2.field10425 = arg2.field10425 * 262144 + arg2.field10448[0] * 262144;
			arg2.field10457 = arg2.field10457 * 262144 + arg2.field10450[0] * 262144;
			arg2.field10426 = arg2.field10426 * 262144 + arg2.field10448[0] * 262144;
			arg2.field10419 += arg2.field11717;
			arg2.field10428 += arg2.field11717;
		}
		if ((arg3 & 0x1) != 0) {
			int var68 = arg0.g2();
			if (var68 == 65535) {
				var68 = -1;
			}
			arg2.field10417 = var68;
		}
		if ((arg3 & 0x800000) != 0) {
			arg2.field10434 = arg0.g1b_alt2();
			arg2.field10435 = arg0.g1b_alt3();
			arg2.field10436 = arg0.g1b_alt2();
			arg2.field10437 = (byte) arg0.g1_alt1();
			arg2.field10446 = client.field10903 + arg0.g2();
			arg2.field10464 = client.field10903 + arg0.g2();
		}
		if ((arg3 & 0x400) != 0) {
			arg2.field12070 = (class202) class686.method1897(class202.method3559(), arg0.g1_alt2());
			if (arg2.field12070 == null) {
				arg2.field12070 = class202.field1950;
			}
		}
		if ((arg3 & 0x100) != 0) {
			int var69 = arg0.g2_alt3();
			int var70 = arg0.g4_alt2();
			if (var69 == 65535) {
				var69 = -1;
			}
			int var71 = arg0.g1_alt2();
			int var72 = var71 & 0x7;
			int var73 = var71 >> 3 & 0xF;
			if (var73 == 15) {
				var73 = -1;
			}
			boolean var74 = (var71 >> 7 & 0x1) == 1;
			arg2.method16563(var69, var70, var72, var73, var74, 1);
		}
		if ((arg3 & 0x200000) != 0) {
			String var75 = arg0.gjstr();
			int var76 = arg0.g1();
			if ((var76 & 0x1) != 0) {
				class241.method2664(2, var76, arg2.method19115(true), arg2.method19116(false), arg2.field12057, var75, null);
			}
			arg2.method19124(var75, 0, 0);
		}
		if ((arg3 & 0x400000) == 0) {
			return;
		}
		int var77 = arg0.g2_alt3();
		int var78 = arg0.g4s();
		if (var77 == 65535) {
			var77 = -1;
		}
		int var79 = arg0.g1_alt1();
		int var80 = var79 & 0x7;
		int var81 = var79 >> 3 & 0xF;
		if (var81 == 15) {
			var81 = -1;
		}
		boolean var82 = (var79 >> 7 & 0x1) == 1;
		arg2.method16563(var77, var78, var80, var81, var82, 3);
	}

	@ObfuscatedName("ajt.z(I)V")
	public static void method17516() {
		field698 = 0;
		for (int var0 = 0; var0 < 2048; var0++) {
			field706[var0] = null;
			field699[var0] = null;
			field697[var0] = class690.field8315.field8313;
			field704[var0] = null;
		}
	}
}
