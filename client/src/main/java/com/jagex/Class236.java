package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dy")
public final class Class236 {

	@OriginalMember(owner = "client!dy", name = "bn", descriptor = "Lclient!cm;")
	public static Class99 aClass99_29;

	@OriginalMember(owner = "client!dy", name = "t", descriptor = "Lclient!dy;")
	static final Class236 aClass236_27 = new Class236(1, 1);

	@OriginalMember(owner = "client!dy", name = "f", descriptor = "Lclient!dy;")
	static final Class236 aClass236_23 = new Class236(7, 2);

	@OriginalMember(owner = "client!dy", name = "e", descriptor = "Lclient!dy;")
	static final Class236 aClass236_20 = new Class236(5, 4);

	@OriginalMember(owner = "client!dy", name = "u", descriptor = "Lclient!dy;")
	public static final Class236 aClass236_21 = new Class236(3, 1);

	@OriginalMember(owner = "client!dy", name = "l", descriptor = "Lclient!dy;")
	public static final Class236 aClass236_19 = new Class236(0, 2);

	@OriginalMember(owner = "client!dy", name = "g", descriptor = "Lclient!dy;")
	public static final Class236 aClass236_22 = new Class236(6, 3);

	@OriginalMember(owner = "client!dy", name = "i", descriptor = "Lclient!dy;")
	public static final Class236 aClass236_24 = new Class236(4, 4);

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "Lclient!dy;")
	public static final Class236 aClass236_25 = new Class236(8, 2);

	@OriginalMember(owner = "client!dy", name = "o", descriptor = "Lclient!dy;")
	public static final Class236 aClass236_26 = new Class236(2, 4);

	@OriginalMember(owner = "client!dy", name = "j", descriptor = "I")
	public final int anInt3805;

	@OriginalMember(owner = "client!dy", name = "a", descriptor = "I")
	public final int anInt3804;

	@OriginalMember(owner = "client!dy", name = "t", descriptor = "(Lclient!ald;B)Lclient!lv;")
	public static Class407 method26128(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) String local3 = arg0.gjstr();
		@Pc(10) Class391 local10 = Class58_Sub1.method15727((byte) -74)[arg0.g1()];
		@Pc(17) Class383 local17 = Class646.method33047(-1097781758)[arg0.g1()];
		@Pc(21) int local21 = arg0.g2s();
		@Pc(25) int local25 = arg0.g2s();
		@Pc(29) int local29 = arg0.g1();
		@Pc(33) int local33 = arg0.g1();
		@Pc(37) int local37 = arg0.g1();
		@Pc(41) int local41 = arg0.g2();
		@Pc(45) int local45 = arg0.g2();
		@Pc(49) int local49 = arg0.gSmart2or4null();
		@Pc(53) int local53 = arg0.g4();
		@Pc(57) int local57 = arg0.g4();
		return new Class407(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57);
	}

	@OriginalMember(owner = "client!dy", name = "wx", descriptor = "(Lclient!yp;B)V")
	static void method26129(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class672.aClass134_1.method10446(local12, 531256463);
	}

	@OriginalMember(owner = "client!dy", name = "avu", descriptor = "(Lclient!yp;S)V")
	static void method26130(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!dy", name = "bea", descriptor = "(Lclient!yp;I)V")
	static void method26131(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass274_1.method26792(local13, 326461728).method26741(local23, local33, -1117696537) == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!dy", name = "un", descriptor = "(Lclient!yp;B)V")
	static void method26132(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2122241120);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4131 * 2069134419;
	}

	@OriginalMember(owner = "client!dy", name = "hn", descriptor = "(J)V")
	static void method26133(@OriginalArg(0) long arg0) {
		@Pc(3) int local3 = client.anInt3479 * -1853431703;
		@Pc(7) int local7 = client.anInt3480 * 608799169;
		@Pc(18) int local18;
		@Pc(26) int local26;
		if (Class268.anInt3917 * 1368033245 != local3) {
			local18 = local3 - Class268.anInt3917 * 1368033245;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local26 > local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Class268.anInt3917 += local26 * -828045195;
		}
		if (local7 != Class315.anInt4021 * -262576965) {
			local18 = local7 - Class315.anInt4021 * -262576965;
			local26 = (int) ((long) local18 * arg0 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local26 > local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Class315.anInt4021 += local26 * -1242873741;
		}
		client.aFloat255 += (float) arg0 * client.aFloat253 / 40.0F * 8.0F;
		client.aFloat254 += client.aFloat256 * (float) arg0 / 40.0F * 8.0F;
		Class517.method30581(832175576);
	}

	@OriginalMember(owner = "client!dy", name = "de", descriptor = "(Lclient!di;Lclient!akh;Lclient!ho;I)V")
	static void method26134(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub18 arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class99 local4 = arg2.method27557(arg0, -28194169);
		if (local4 == null) {
			return;
		}
		@Pc(10) int local10 = local4.method18218();
		if (local4.method18219() > local10) {
			local10 = local4.method18219();
		}
		@Pc(19) byte local19 = 10;
		@Pc(24) int local24 = arg1.anInt1585 * -1472438265;
		@Pc(29) int local29 = arg1.anInt1586 * -1587456111;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		if (arg2.aString178 != null) {
			local33 = Class461.aClass15_10.method380(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, 0, null, (byte) -15);
			local31 = Class461.aClass15_10.method377(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, null, -692960549);
		}
		@Pc(66) int local66 = local10 / 2 + arg1.anInt1585 * -1472438265;
		@Pc(71) int local71 = arg1.anInt1586 * -1587456111;
		if (local24 < local10 + Class159_Sub1.anInt2007) {
			local24 = Class159_Sub1.anInt2007;
			local66 = local31 / 2 + 5 + local10 / 2 + Class159_Sub1.anInt2007 + local19;
		} else if (local24 > Class159_Sub1.anInt2009 - local10) {
			local24 = Class159_Sub1.anInt2009 - local10;
			local66 = Class159_Sub1.anInt2009 - local10 / 2 - local19 - local31 / 2 - 5;
		}
		if (local29 < Class159_Sub1.anInt2008 + local10) {
			local29 = Class159_Sub1.anInt2008;
			local71 = local10 / 2 + Class159_Sub1.anInt2008 + local19;
		} else if (local29 > Class159_Sub1.anInt2010 - local10) {
			local29 = Class159_Sub1.anInt2010 - local10;
			local71 = Class159_Sub1.anInt2010 - local10 / 2 - local19 - local33;
		}
		@Pc(174) int local174 = (int) (Math.atan2((double) (local24 - arg1.anInt1585 * -1472438265), (double) (local29 - arg1.anInt1586 * -1587456111)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local4.method18234((float) local10 / 2.0F + (float) local24, (float) local29 + (float) local10 / 2.0F, 4096, local174);
		@Pc(194) int local194 = -2;
		@Pc(196) int local196 = -2;
		@Pc(198) int local198 = -2;
		@Pc(200) int local200 = -2;
		if (arg2.aString178 != null) {
			local194 = local66 - local31 / 2 - 5;
			local196 = local71;
			local198 = local194 + local31 + 10;
			local200 = local33 + local71 + 3;
			if (arg2.anInt4040 * 861398173 != 0) {
				arg0.method20716(local194, local71, local198 - local194, local200 - local71, arg2.anInt4040 * 861398173, (byte) 121);
			}
			if (arg2.anInt4041 * 1350573417 != 0) {
				arg0.method20715(local194, local71, local198 - local194, local200 - local71, arg2.anInt4041 * 1350573417, -1068342187);
			}
			Class165_Sub38.aClass104_12.method7631(arg2.aString178, local66, local71, local31, local33, -791504431 * arg2.anInt4032 | 0xFF000000, Class159_Sub1.aClass632_2.anInt5581 * 2032438309, 1, 0, 0, null, null, null, 0, 0, (byte) 0);
		}
		if (arg2.anInt4037 * 1279732247 == -1 && arg2.aString178 == null) {
			return;
		}
		@Pc(309) Class80_Sub7 local309 = new Class80_Sub7(arg1);
		local309.anInt1461 = (local24 - local10 / 2) * 2001422441;
		local309.anInt1463 = (local10 / 2 + local24) * 1696076311;
		local309.anInt1462 = (local29 - local10) * 659963847;
		local309.anInt1466 = local29 * -1022717471;
		local309.anInt1468 = local194 * -602033181;
		local309.anInt1465 = local198 * -802024881;
		local309.anInt1464 = local196 * -1946152893;
		local309.anInt1467 = local200 * 1617663591;
		Class391.aClass8_53.method232(local309, 1530633644);
	}

	@OriginalMember(owner = "client!dy", name = "t", descriptor = "(ZS)V")
	public static void method26135(@OriginalArg(0) boolean arg0, @OriginalArg(1) short arg1) {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) Class80_Sub21.aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass8_22.method237(-845416722)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, 1355674801);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) -73);
				local4.aClass529_3 = null;
			}
			if (local4.aClass529_4 != null) {
				local4.aClass529_4.method30788(150, 1692752580);
				Class490.aClass263_13.method26582(local4.aClass529_4, (byte) -4);
				local4.aClass529_4 = null;
			}
			local4.method24395((byte) 75);
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class80_Sub21) Class80_Sub21.aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass8_21.method237(-1448744362)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, 746249770);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 33);
				local4.aClass529_3 = null;
			}
			local4.method24395((byte) 47);
		}
		for (local4 = (Class80_Sub21) Class80_Sub21.aClass24_12.method580((byte) -55); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass24_12.method566((byte) 7)) {
			if (local4.aClass529_3 != null) {
				local4.aClass529_3.method30788(150, 524207558);
				Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 11);
				local4.aClass529_3 = null;
			}
			local4.method24395((byte) 44);
		}
	}

	@OriginalMember(owner = "client!dy", name = "asc", descriptor = "(Lclient!yp;I)V")
	static void method26136(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(17) int local17 = Class703.aClass80_Sub37_49.aClass165_Sub27_2.method16402((byte) 51);
		if (local12 != local17) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub27_2, local12, (byte) 67);
			Class719.method37291(304978460);
			client.aBoolean714 = false;
		}
	}

	@OriginalMember(owner = "client!dy", name = "t", descriptor = "([FIFZFZ[FI)I")
	static int method26137(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		@Pc(1) float local1 = 0.0F;
		for (@Pc(3) int local3 = 0; local3 < arg1 + 1; local3++) {
			local1 += Math.abs(arg0[local3]);
		}
		@Pc(30) float local30 = (Math.abs(arg2) + Math.abs(arg4)) * (float) (arg1 + 1) * Class223.aFloat259;
		if (local1 <= local30) {
			return -1;
		}
		@Pc(41) float[] local41 = new float[arg1 + 1];
		@Pc(43) int local43;
		for (local43 = 0; local43 < arg1 + 1; local43++) {
			local41[local43] = arg0[local43] * (1.0F / local1);
		}
		while (Math.abs(local41[arg1]) < local30) {
			arg1--;
		}
		local43 = 0;
		if (arg1 == 0) {
			return local43;
		} else if (arg1 == 1) {
			arg6[0] = -local41[0] / local41[1];
			@Pc(116) boolean local116 = arg3 ? arg2 < local30 + arg6[0] : arg2 < arg6[0] - local30;
			@Pc(142) boolean local142 = arg5 ? arg4 > arg6[0] - local30 : arg4 > arg6[0] + local30;
			local43 = local116 && local142 ? 1 : 0;
			if (local43 > 0) {
				if (arg3 && arg6[0] < arg2) {
					arg6[0] = arg2;
				} else if (arg5 && arg6[0] > arg4) {
					arg6[0] = arg4;
				}
			}
			return local43;
		} else {
			@Pc(185) Class240 local185 = new Class240(local41, arg1);
			@Pc(190) float[] local190 = new float[arg1 + 1];
			for (@Pc(192) int local192 = 1; local192 <= arg1; local192++) {
				local190[local192 - 1] = (float) local192 * local41[local192];
			}
			@Pc(213) float[] local213 = new float[arg1 + 1];
			@Pc(225) int local225 = method26137(local190, arg1 - 1, arg2, false, arg4, false, local213, 1931862185);
			if (local225 == -1) {
				return 0;
			}
			@Pc(232) boolean local232 = false;
			@Pc(234) float local234 = 0.0F;
			@Pc(236) float local236 = 0.0F;
			@Pc(238) float local238 = 0.0F;
			for (@Pc(240) int local240 = 0; local240 <= local225; local240++) {
				if (local43 > arg1) {
					return local43;
				}
				@Pc(252) float local252;
				if (local240 == 0) {
					local252 = arg2;
					local236 = Class2.method1812(local41, arg1, arg2, 1420600977);
					if (Math.abs(local236) <= local30 && arg3) {
						arg6[local43++] = arg2;
					}
				} else {
					local252 = local238;
					local236 = local234;
				}
				if (local240 == local225) {
					local238 = arg4;
					local232 = false;
				} else {
					local238 = local213[local240];
				}
				local234 = Class2.method1812(local41, arg1, local238, 1364867671);
				if (local232) {
					local232 = false;
				} else if (Math.abs(local234) < local30) {
					if (local225 != local240 || arg5) {
						arg6[local43++] = local238;
						local232 = true;
					}
				} else if (local236 < 0.0F && local234 > 0.0F || local236 > 0.0F && local234 < 0.0F) {
					arg6[local43++] = Class53.method1087(local185, local252, local238, 0.0F, -328431219);
					if (local43 > 1 && arg6[local43 - 2] >= arg6[local43 - 1] - local30) {
						arg6[local43 - 2] = (arg6[local43 - 1] + arg6[local43 - 2]) * 0.5F;
						local43--;
					}
				}
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!dy", name = "<init>", descriptor = "(II)V")
	Class236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3805 = arg0 * 304969945;
		this.anInt3804 = arg1 * 460997803;
	}
}
