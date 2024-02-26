package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class27 {

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "D")
	static final double aDouble1 = 100.0D;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	static final int anInt84 = 48;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
	static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Z")
	static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "[I")
	static int[] anIntArray7 = new int[4];

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	static int anInt83 = -208096495;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	static int anInt87 = 0;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
	static int[] anIntArray10 = new int[1007];

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
	static int[] anIntArray8 = new int[1009];

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
	static int[] anIntArray9 = new int[1000];

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!aag;")
	static Class8 aClass8_2 = new Class8();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public static int anInt85 = 1198271169;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
	public static int anInt88 = 2069609469;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Z")
	static boolean aBoolean15 = true;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "Z")
	static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	static int anInt86 = 0;

	@OriginalMember(owner = "client!ab", name = "bf", descriptor = "(IIZ)V")
	static void method597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class123.aBooleanArrayArray17[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!ab", name = "be", descriptor = "(Lclient!di;Lclient!cg;Lclient!hx;IIIII)V")
	static void method598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class320 local5 = (Class320) Class157.aClass41_Sub13_2.method18054(arg7, -424337590);
		if (local5 != null && local5.anIntArray389 != null && local5.method27544(Class672.aClass134_1, Class672.aClass134_1, -2088074858)) {
			local5 = local5.method27550(Class672.aClass134_1, Class672.aClass134_1, 1682525142);
		}
		if (local5 == null || !local5.aBoolean796 || !local5.method27544(Class672.aClass134_1, Class672.aClass134_1, -2088954650)) {
			return;
		}
		@Pc(46) int local46;
		if (local5.anIntArray390 != null) {
			@Pc(44) int[] local44 = new int[local5.anIntArray390.length];
			@Pc(71) int local71;
			@Pc(96) int local96;
			@Pc(100) int local100;
			for (local46 = 0; local46 < local44.length / 2; local46++) {
				if (Class368.anInt4502 * -1583611537 == 3) {
					local71 = (int) ((double) Class160.aClass121_Sub1_2.method9648(1281092126) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
				} else if (Class368.anInt4502 * -1583611537 == 4) {
					local71 = (int) client.aFloat255 & 0x3FFF;
				} else {
					local71 = client.anInt3474 * -1918431893 + (int) client.aFloat255 & 0x3FFF;
				}
				local96 = Class467.anIntArray454[local71];
				local100 = Class467.anIntArray453[local71];
				if (Class368.anInt4502 * -1583611537 != 4) {
					local96 = local96 * 256 / (client.anInt3476 * -692320695 + 256);
					local100 = local100 * 256 / (client.anInt3476 * -692320695 + 256);
				}
				local44[local46 * 2] = arg2.anInt4103 * 1892149809 / 2 + arg3 + ((local5.anIntArray390[local46 * 2] * 4 + arg5) * local100 + (arg6 + local5.anIntArray390[local46 * 2 + 1] * 4) * local96 >> 14);
				local44[local46 * 2 + 1] = arg2.anInt4104 * 1990157877 / 2 + arg4 - ((local5.anIntArray390[local46 * 2 + 1] * 4 + arg6) * local100 - (arg5 + local5.anIntArray390[local46 * 2] * 4) * local96 >> 14);
			}
			@Pc(220) Class323 local220 = arg2.method27643(arg0, 1477428010);
			if (local220 != null) {
				Class234.method26108(arg0, local44, local5.anInt4054 * 2024928351, local220.anIntArray399, local220.anIntArray398);
			}
			if (local5.anInt4039 * -794672681 > 0) {
				@Pc(271) int local271;
				@Pc(281) int local281;
				@Pc(286) int local286;
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					local96 = local44[local71 * 2];
					local100 = local44[local71 * 2 + 1];
					local271 = local44[(local71 + 1) * 2];
					local281 = local44[(local71 + 1) * 2 + 1];
					if (local271 < local96) {
						local286 = local96;
						@Pc(288) int local288 = local100;
						local96 = local271;
						local100 = local281;
						local271 = local286;
						local281 = local288;
					} else if (local271 == local96 && local281 < local100) {
						local286 = local100;
						local100 = local281;
						local281 = local286;
					}
					if (arg1 == null) {
						arg0.method20729(local96, local100, local271, local281, local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
					} else {
						arg0.method20979(local96, local100, local271, local281, local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
					}
				}
				local71 = local44[local44.length - 2];
				local96 = local44[local44.length - 1];
				local100 = local44[0];
				local271 = local44[1];
				if (local100 < local71) {
					local281 = local71;
					local286 = local96;
					local71 = local100;
					local96 = local271;
					local100 = local281;
					local271 = local286;
				} else if (local100 == local71 && local271 < local96) {
					local281 = local96;
					local96 = local271;
					local271 = local281;
				}
				if (arg1 == null) {
					arg0.method20729(local71, local96, local100, local271, local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
				} else {
					arg0.method20979(local71, local96, local100, local271, local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
				}
			} else if (arg1 == null) {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20727(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1);
				}
				arg0.method20727(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1);
			} else {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20728(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method20728(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		@Pc(679) Class99 local679 = null;
		if (local5.anInt4037 * 1279732247 != -1) {
			local679 = local5.method27545(arg0, false, 1938735739);
			if (local679 != null) {
				local46 = local5.anInt4060 * -1105818937 > 0 ? local5.anInt4060 * -1105818937 : Class698.aClass638_1.anInt5613 * -1632664461;
				Class165.method16960(arg2, arg1, arg3, arg4, arg5, arg6, local679, (double) local46, local5.aClass313_4, local5.aClass309_4, (byte) 70);
			}
		}
		if (local5.aString178 == null) {
			return;
		}
		local46 = 0;
		if (local679 != null) {
			local46 = local679.method18219();
		}
		@Pc(738) Class104 local738 = Class108.aClass104_22;
		@Pc(740) Class15 local740 = Class619.aClass15_12;
		if (local5.anInt4031 * -618572023 == 1) {
			local738 = Class709.aClass104_26;
			local740 = Class689.aClass15_13;
		}
		if (local5.anInt4031 * -618572023 == 2) {
			local738 = Class8.aClass104_1;
			local740 = Class375.aClass15_9;
		}
		Class281.method26861(arg2, arg1, arg3, arg4, arg5, arg6, local46, local5.aString178, local738, local740, local5.anInt4032 * -791504431, -258614140);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "()V")
	static void method599() {
		anInt86 = 0;
		anInt83 = -208096495;
		anInt85 = 1198271169;
		anInt88 = 2069609469;
	}

	@OriginalMember(owner = "client!ab", name = "by", descriptor = "(IILclient!hx;Lclient!cg;II)V")
	static void method600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) Class98 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class51.anInt191 * 44967471;
		@Pc(5) int[] local5 = Class51.anIntArray20;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class120_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method19061(1444383354) && !local16.aClass668_1.method33486((short) -10157) && local16 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local16.aByte99) {
				@Pc(40) Class463 local40 = local16.method24552().aClass463_61;
				@Pc(50) int local50 = (int) local40.aFloat297 / 128 - arg0 / 128;
				@Pc(60) int local60 = (int) local40.aFloat296 / 128 - arg1 / 128;
				@Pc(62) boolean local62 = false;
				for (@Pc(64) int local64 = 0; local64 < client.anInt3573 * 975306769; local64++) {
					@Pc(73) Class676 local73 = client.aClass676Array1[local64];
					if (local16.aString73.equals(local73.aString236) && local73.anInt5740 * 922507867 != 0) {
						local62 = true;
						break;
					}
				}
				@Pc(91) boolean local91 = false;
				for (@Pc(93) int local93 = 0; local93 < Class274.anInt3924 * -912877411; local93++) {
					if (local16.aString73.equals(Class14.aClass164Array1[local93].aString64)) {
						local91 = true;
						break;
					}
				}
				@Pc(113) boolean local113 = false;
				if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 != 0 && local16.anInt2708 * 1960918119 != 0 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 == local16.anInt2708 * 1960918119) {
					local113 = true;
				}
				if (local16.aClass672_1 != null && local16.aClass672_1.anInt5712 * 1260077339 != -1 && ((Class335) Class460.aClass41_Sub2_1.method18054(local16.aClass672_1.anInt5712 * 1260077339, 1086539714)).aBoolean829) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[1], 1849257624);
				} else if (Class289.aClass289_3 == local16.aClass289_1) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[8], -1902503115);
				} else if (Class289.aClass289_4 == local16.aClass289_1) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[6], 237486095);
				} else if (local113) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[4], 145986655);
				} else if (local62) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[3], 124925775);
				} else if (local16.aBoolean457) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[7], -342145151);
				} else if (local91) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[5], 75106491);
				} else {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[2], -1192650835);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "ar", descriptor = "(III)Z")
	static boolean method601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface60 local13 = (Interface60) local3.method31570(arg0, arg1, arg2, (byte) -53);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 51);
		}
		local13 = (Interface60) local3.method31574(arg0, arg1, arg2, client.anInterface62_1, (byte) -5);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 104);
		}
		local13 = (Interface60) local3.method31558(arg0, arg1, arg2, 1494219285);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 67);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ab", name = "an", descriptor = "(I)V")
	static void method602(@OriginalArg(0) int arg0) {
		anInt87 = 0;
		@Pc(5) int local5 = client.aClass539_1.method30921(2113718929);
		@Pc(9) int local9 = client.aClass539_1.method31011(-1888696086);
		@Pc(13) Class502 local13 = client.aClass539_1.method30903(-463929735);
		@Pc(17) Class570 local17 = client.aClass539_1.method30932(-1638462787);
		@Pc(21) Class41_Sub3 local21 = client.aClass539_1.method30905(-2039629960);
		@Pc(23) int local23 = arg0;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(33) int local33 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
			@Pc(40) int local40 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			if (local33 >= 0 && local33 < Class123.aBooleanArrayArray17.length && local40 >= 0 && local40 < Class123.aBooleanArrayArray17[local33].length && Class123.aBooleanArrayArray17[local33][local40]) {
				local23 = 0;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < local5; local64++) {
			for (@Pc(69) int local69 = 0; local69 < local9; local69++) {
				for (@Pc(74) int local74 = local23; local74 <= arg0 + 1 && local74 <= 3; local74++) {
					if ((local74 < arg0 || local13.method30430(arg0, local74, local64, local69, 73602969)) && !Class210.method25807((Interface60) local17.method31558(local74, local64, local69, 1411068730), local21, local64, local69, 1930292031) && !Class210.method25807((Interface60) local17.method31574(local74, local64, local69, client.anInterface62_1, (byte) -105), local21, local64, local69, 2103542178) && !Class210.method25807((Interface60) local17.method31570(local74, local64, local69, (byte) -14), local21, local64, local69, 2078134783) && Class210.method25807((Interface60) local17.method31572(local74, local64, local69, (byte) 12), local21, local64, local69, 1931352534)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "au", descriptor = "(III)Z")
	static boolean method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface60 local13 = (Interface60) local3.method31570(arg0, arg1, arg2, (byte) -23);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 103);
		}
		local13 = (Interface60) local3.method31574(arg0, arg1, arg2, client.anInterface62_1, (byte) -62);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 52);
		}
		local13 = (Interface60) local3.method31558(arg0, arg1, arg2, 1960194796);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 2);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ab", name = "aq", descriptor = "()V")
	public static void method604() {
		anInt83 = -208096495;
	}

	@OriginalMember(owner = "client!ab", name = "ao", descriptor = "()V")
	public static void method605() {
		anInt83 = -208096495;
	}

	@OriginalMember(owner = "client!ab", name = "ae", descriptor = "(I)V")
	static void method606(@OriginalArg(0) int arg0) {
		anInt87 = 0;
		@Pc(5) int local5 = client.aClass539_1.method30921(2041091409);
		@Pc(9) int local9 = client.aClass539_1.method31011(394493425);
		@Pc(13) Class502 local13 = client.aClass539_1.method30903(-463929735);
		@Pc(17) Class570 local17 = client.aClass539_1.method30932(-1638462787);
		@Pc(21) Class41_Sub3 local21 = client.aClass539_1.method30905(1052015834);
		@Pc(23) int local23 = arg0;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(33) int local33 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
			@Pc(40) int local40 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			if (local33 >= 0 && local33 < Class123.aBooleanArrayArray17.length && local40 >= 0 && local40 < Class123.aBooleanArrayArray17[local33].length && Class123.aBooleanArrayArray17[local33][local40]) {
				local23 = 0;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < local5; local64++) {
			for (@Pc(69) int local69 = 0; local69 < local9; local69++) {
				for (@Pc(74) int local74 = local23; local74 <= arg0 + 1 && local74 <= 3; local74++) {
					if ((local74 < arg0 || local13.method30430(arg0, local74, local64, local69, 73602969)) && !Class210.method25807((Interface60) local17.method31558(local74, local64, local69, 1911267835), local21, local64, local69, 2054162198) && !Class210.method25807((Interface60) local17.method31574(local74, local64, local69, client.anInterface62_1, (byte) -15), local21, local64, local69, 1915553303) && !Class210.method25807((Interface60) local17.method31570(local74, local64, local69, (byte) -107), local21, local64, local69, 1927824693) && Class210.method25807((Interface60) local17.method31572(local74, local64, local69, (byte) -71), local21, local64, local69, 1928334672)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "ac", descriptor = "()V")
	public static void method607() {
		anInt83 = -208096495;
	}

	@OriginalMember(owner = "client!ab", name = "ag", descriptor = "()V")
	public static void method608() {
		anInt83 = -208096495;
	}

	@OriginalMember(owner = "client!ab", name = "ay", descriptor = "()V")
	public static void method609() {
		Class86.aClass99_2 = null;
		anInt83 = -208096495;
	}

	@OriginalMember(owner = "client!ab", name = "al", descriptor = "()V")
	public static void method610() {
		@Pc(3) int local3 = client.aClass539_1.method30921(2105092919);
		@Pc(7) int local7 = client.aClass539_1.method31011(-1378924745);
		Class123.aBooleanArrayArray17 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!ab", name = "ah", descriptor = "(Lclient!di;)V")
	static void method611(@OriginalArg(0) Class102 arg0) {
		if (-1955503601 * anInt83 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 && client.aClass539_1.method30932(-1638462787) != null) {
			Class303.method27111((byte) 73);
			if (Class518.method30588(arg0, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1956580105)) {
				anInt83 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 * 208096495;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "af", descriptor = "(Lclient!di;)V")
	static void method612(@OriginalArg(0) Class102 arg0) {
		if (-1955503601 * anInt83 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 && client.aClass539_1.method30932(-1638462787) != null) {
			Class303.method27111((byte) 32);
			if (Class518.method30588(arg0, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1124870608)) {
				anInt83 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 * 208096495;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "ai", descriptor = "()V")
	public static void method613() {
		Class86.aClass99_2 = null;
		anInt83 = -208096495;
	}

	@OriginalMember(owner = "client!ab", name = "at", descriptor = "(Lclient!di;I)Z")
	static boolean method614(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		arg0.method20744();
		Class303.method27111((byte) 22);
		if (!arg0.method20757(-1026740978)) {
			return false;
		}
		@Pc(14) int local14 = client.aClass539_1.method30921(2037742019);
		@Pc(18) int local18 = client.aClass539_1.method31011(134145819);
		@Pc(22) Class502 local22 = client.aClass539_1.method30903(-463929735);
		@Pc(26) Class570 local26 = client.aClass539_1.method30932(-1638462787);
		@Pc(28) int local28 = arg1;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
			@Pc(44) int local44 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			if (local37 >= 0 && local37 < Class123.aBooleanArrayArray17.length && local44 >= 0 && local44 < Class123.aBooleanArrayArray17[local37].length && Class123.aBooleanArrayArray17[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local72 + local14; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local74 + local18; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method30430(arg1, local92, local78, local85, 73602969)) {
						@Pc(108) int local108 = local92;
						if (local22.method30429(local78, local85, 1803123010)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class391.method28677(local108, local78, local85, 735729657);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = local14 * 4 + 48 + 48;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class108_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (aBoolean14) {
			Class86.aClass99_2 = arg0.method20739(local78, local78, false, true);
			local162 = arg0.method20687();
			local162.method23903(0, Class86.aClass99_2.method18231());
			@Pc(188) Interface17 local188 = arg0.method20689(local78, local78);
			local162.method23905(local188);
			arg0.method20684(local162, -687472733);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20714(1, 0);
		} else {
			Class86.aClass99_2 = arg0.method20741(local148, 0, local78, local78, local78, -1657536790);
		}
		client.aClass539_1.method30904((byte) -10).method33390(-2063527605);
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[local70 + 2 + 1][local70 + 1 + 2];
		arg0.method20707(anIntArray7);
		arg0.method20705();
		@Pc(318) int local318;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(328) int local328;
		for (@Pc(304) int local304 = local72; local304 < local14 + local72; local304 += local70) {
			for (@Pc(311) int local311 = local74; local311 < local18 + local74; local311 += local70) {
				local318 = local164;
				local320 = local166;
				local322 = local304;
				if (local304 > 0) {
					local322 = local304 - 1;
					local318 = local164 + 4;
				}
				local328 = local311;
				if (local311 > 0) {
					local328 = local311 - 1;
				}
				@Pc(335) int local335 = local304 + local70;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local311 + local70;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (aBoolean13) {
					arg0.method20877();
				} else {
					arg0.method20986(0, 0, local70 * 4 + local318, local320 + local70 * 4);
				}
				arg0.method20714(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method30430(arg1, local384, local389 + local322, local328 + local394, 73602969);
						}
					}
					local26.aClass100Array3[local384].method2914(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local304 + local389;
							@Pc(455) int local455 = local311 + local394;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method30430(arg1, local384, local451, local455, 73602969))) {
								@Pc(474) int local474 = local384;
								if (local22.method30429(local451, local455, 1095178105)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class272.method26709(arg0, local474, local451, local455, local318 + local389 * 4, (local70 - local394) * 4 + local320 - 4, local253, local266, -1693436319);
								}
							}
						}
					}
				}
				arg0.method20722(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20744();
				if (!aBoolean14) {
					Class86.aClass99_2.method18223((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (aBoolean13) {
						Class86.aClass99_2.method18225(256, 0);
						try {
							arg0.method20657(-740561687);
							Class217.method25866(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (aBoolean14) {
			arg0.method20887(local162, (byte) 1);
			if (aBoolean13) {
				Class86.aClass99_2.method18225(256, 0);
				try {
					arg0.method20657(1389823509);
					Class217.method25866(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20877();
		arg0.method20706(anIntArray7[0], anIntArray7[1], anIntArray7[2], anIntArray7[3]);
		arg0.method20714(1, 1);
		Class138_Sub1.method10718((byte) 41);
		anInt87 = 0;
		aClass8_2.method260(397216581);
		if (!aBoolean12) {
			Class97.method2118(arg1, 339148114);
			@Pc(637) Class587 local637 = client.aClass539_1.method30896(-1381529887);
			if (local637 != null) {
				Class157.aClass41_Sub13_2.method17572(1024, 64, 1408752690);
				@Pc(648) Class626 local648 = client.aClass539_1.method30893((byte) -27);
				for (local318 = 0; local318 < local637.anInt5303 * -70603505; local318++) {
					local320 = local637.anIntArray479[local318];
					if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local320 >> 28) {
						local322 = (local320 >> 14 & 0x3FFF) - local648.anInt5540 * -390642507;
						local328 = (local320 & 0x3FFF) - local648.anInt5537 * -894305615;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							aClass8_2.method232(new Class80_Sub20(local318), 2072045701);
						} else {
							@Pc(714) Class320 local714 = (Class320) Class157.aClass41_Sub13_2.method18054(local637.anIntArray480[local318], 2118677698);
							if (local714.anIntArray390 != null && local714.anInt4052 * 649510463 + local322 >= 0 && local714.anInt4050 * 360284357 + local322 < local14 && local328 + local714.anInt4053 * -987728585 >= 0 && local328 + local714.anInt4051 * 1996000583 < local18) {
								aClass8_2.method232(new Class80_Sub20(local318), 827791582);
							}
						}
					}
				}
				Class157.aClass41_Sub13_2.method17572(128, 64, -186218387);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "ad", descriptor = "(Lclient!di;I)Z")
	static boolean method615(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		arg0.method20744();
		Class303.method27111((byte) 116);
		if (!arg0.method20757(-1821515407)) {
			return false;
		}
		@Pc(14) int local14 = client.aClass539_1.method30921(1958550393);
		@Pc(18) int local18 = client.aClass539_1.method31011(-1379420644);
		@Pc(22) Class502 local22 = client.aClass539_1.method30903(-463929735);
		@Pc(26) Class570 local26 = client.aClass539_1.method30932(-1638462787);
		@Pc(28) int local28 = arg1;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
			@Pc(44) int local44 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			if (local37 >= 0 && local37 < Class123.aBooleanArrayArray17.length && local44 >= 0 && local44 < Class123.aBooleanArrayArray17[local37].length && Class123.aBooleanArrayArray17[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local72 + local14; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local74 + local18; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method30430(arg1, local92, local78, local85, 73602969)) {
						@Pc(108) int local108 = local92;
						if (local22.method30429(local78, local85, 656985310)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class391.method28677(local108, local78, local85, 1457982373);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = local14 * 4 + 48 + 48;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class108_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (aBoolean14) {
			Class86.aClass99_2 = arg0.method20739(local78, local78, false, true);
			local162 = arg0.method20687();
			local162.method23903(0, Class86.aClass99_2.method18231());
			@Pc(188) Interface17 local188 = arg0.method20689(local78, local78);
			local162.method23905(local188);
			arg0.method20684(local162, -1174381650);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20714(1, 0);
		} else {
			Class86.aClass99_2 = arg0.method20741(local148, 0, local78, local78, local78, -1657536790);
		}
		client.aClass539_1.method30904((byte) 2).method33390(-2094599800);
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[local70 + 2 + 1][local70 + 1 + 2];
		arg0.method20707(anIntArray7);
		arg0.method20705();
		@Pc(318) int local318;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(328) int local328;
		for (@Pc(304) int local304 = local72; local304 < local14 + local72; local304 += local70) {
			for (@Pc(311) int local311 = local74; local311 < local18 + local74; local311 += local70) {
				local318 = local164;
				local320 = local166;
				local322 = local304;
				if (local304 > 0) {
					local322 = local304 - 1;
					local318 = local164 + 4;
				}
				local328 = local311;
				if (local311 > 0) {
					local328 = local311 - 1;
				}
				@Pc(335) int local335 = local304 + local70;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local311 + local70;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (aBoolean13) {
					arg0.method20877();
				} else {
					arg0.method20986(0, 0, local70 * 4 + local318, local320 + local70 * 4);
				}
				arg0.method20714(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method30430(arg1, local384, local389 + local322, local328 + local394, 73602969);
						}
					}
					local26.aClass100Array3[local384].method2914(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local304 + local389;
							@Pc(455) int local455 = local311 + local394;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method30430(arg1, local384, local451, local455, 73602969))) {
								@Pc(474) int local474 = local384;
								if (local22.method30429(local451, local455, 1110030277)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class272.method26709(arg0, local474, local451, local455, local318 + local389 * 4, (local70 - local394) * 4 + local320 - 4, local253, local266, -1825858366);
								}
							}
						}
					}
				}
				arg0.method20722(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20744();
				if (!aBoolean14) {
					Class86.aClass99_2.method18223((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (aBoolean13) {
						Class86.aClass99_2.method18225(256, 0);
						try {
							arg0.method20657(-1283624055);
							Class217.method25866(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (aBoolean14) {
			arg0.method20887(local162, (byte) 1);
			if (aBoolean13) {
				Class86.aClass99_2.method18225(256, 0);
				try {
					arg0.method20657(-514470042);
					Class217.method25866(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20877();
		arg0.method20706(anIntArray7[0], anIntArray7[1], anIntArray7[2], anIntArray7[3]);
		arg0.method20714(1, 1);
		Class138_Sub1.method10718((byte) 11);
		anInt87 = 0;
		aClass8_2.method260(-1046209712);
		if (!aBoolean12) {
			Class97.method2118(arg1, 109302825);
			@Pc(637) Class587 local637 = client.aClass539_1.method30896(-1987941968);
			if (local637 != null) {
				Class157.aClass41_Sub13_2.method17572(1024, 64, -1202652064);
				@Pc(648) Class626 local648 = client.aClass539_1.method30893((byte) -57);
				for (local318 = 0; local318 < local637.anInt5303 * -70603505; local318++) {
					local320 = local637.anIntArray479[local318];
					if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local320 >> 28) {
						local322 = (local320 >> 14 & 0x3FFF) - local648.anInt5540 * -390642507;
						local328 = (local320 & 0x3FFF) - local648.anInt5537 * -894305615;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							aClass8_2.method232(new Class80_Sub20(local318), 69576743);
						} else {
							@Pc(714) Class320 local714 = (Class320) Class157.aClass41_Sub13_2.method18054(local637.anIntArray480[local318], -398869591);
							if (local714.anIntArray390 != null && local714.anInt4052 * 649510463 + local322 >= 0 && local714.anInt4050 * 360284357 + local322 < local14 && local328 + local714.anInt4053 * -987728585 >= 0 && local328 + local714.anInt4051 * 1996000583 < local18) {
								aClass8_2.method232(new Class80_Sub20(local318), 910494390);
							}
						}
					}
				}
				Class157.aClass41_Sub13_2.method17572(128, 64, 200221515);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "bs", descriptor = "(IILclient!hx;Lclient!cg;II)V")
	static void method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) Class98 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class51.anInt191 * 44967471;
		@Pc(5) int[] local5 = Class51.anIntArray20;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class120_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method19061(-859307442) && !local16.aClass668_1.method33486((short) 6430) && local16 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local16.aByte99) {
				@Pc(40) Class463 local40 = local16.method24552().aClass463_61;
				@Pc(50) int local50 = (int) local40.aFloat297 / 128 - arg0 / 128;
				@Pc(60) int local60 = (int) local40.aFloat296 / 128 - arg1 / 128;
				@Pc(62) boolean local62 = false;
				for (@Pc(64) int local64 = 0; local64 < client.anInt3573 * 975306769; local64++) {
					@Pc(73) Class676 local73 = client.aClass676Array1[local64];
					if (local16.aString73.equals(local73.aString236) && local73.anInt5740 * 922507867 != 0) {
						local62 = true;
						break;
					}
				}
				@Pc(91) boolean local91 = false;
				for (@Pc(93) int local93 = 0; local93 < Class274.anInt3924 * -912877411; local93++) {
					if (local16.aString73.equals(Class14.aClass164Array1[local93].aString64)) {
						local91 = true;
						break;
					}
				}
				@Pc(113) boolean local113 = false;
				if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 != 0 && local16.anInt2708 * 1960918119 != 0 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 == local16.anInt2708 * 1960918119) {
					local113 = true;
				}
				if (local16.aClass672_1 != null && local16.aClass672_1.anInt5712 * 1260077339 != -1 && ((Class335) Class460.aClass41_Sub2_1.method18054(local16.aClass672_1.anInt5712 * 1260077339, -1710325175)).aBoolean829) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[1], -1548969630);
				} else if (Class289.aClass289_3 == local16.aClass289_1) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[8], 731290363);
				} else if (Class289.aClass289_4 == local16.aClass289_1) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[6], 948991394);
				} else if (local113) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[4], -117253899);
				} else if (local62) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[3], 328649823);
				} else if (local16.aBoolean457) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[7], 1844782682);
				} else if (local91) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[5], -1297647656);
				} else {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[2], 565861329);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "ab", descriptor = "()V")
	public static void method617() {
		@Pc(3) int local3 = client.aClass539_1.method30921(1946940350);
		@Pc(7) int local7 = client.aClass539_1.method31011(585682065);
		Class123.aBooleanArrayArray17 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!ab", name = "ax", descriptor = "()V")
	static void method618() {
		anInt86 = 0;
		anInt85 = 1198271169;
		anInt88 = 2069609469;
	}

	@OriginalMember(owner = "client!ab", name = "bc", descriptor = "(IIZ)V")
	static void method619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class123.aBooleanArrayArray17[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()V")
	static void method620() {
		anInt86 = 0;
		anInt85 = 1198271169;
		anInt88 = 2069609469;
	}

	@OriginalMember(owner = "client!ab", name = "bv", descriptor = "(Lclient!hx;Lclient!cg;IIIILclient!cm;)V")
	static void method621(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class99 arg6) {
		Class165.method16960(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, Class313.aClass313_1, Class309.aClass309_3, (byte) 18);
	}

	@OriginalMember(owner = "client!ab", name = "am", descriptor = "(Lclient!di;)V")
	static void method622(@OriginalArg(0) Class102 arg0) {
		if (-1955503601 * anInt83 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 && client.aClass539_1.method30932(-1638462787) != null) {
			Class303.method27111((byte) 65);
			if (Class518.method30588(arg0, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 374691034)) {
				anInt83 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 * 208096495;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "ap", descriptor = "(Lclient!sc;Lclient!aod;II)Z")
	static boolean method623(@OriginalArg(0) Interface60 arg0, @OriginalArg(1) Class41_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return false;
		}
		@Pc(11) Class625 local11 = (Class625) arg1.method18054(arg0.method13834((byte) -4), 1034860428);
		if (local11.aBoolean943 && !client.aBoolean732) {
			return false;
		}
		@Pc(23) int local23 = local11.anInt5502 * -1477183523;
		if (local11.anIntArray503 != null) {
			for (@Pc(29) int local29 = 0; local29 < local11.anIntArray503.length; local29++) {
				if (local11.anIntArray503[local29] != -1) {
					@Pc(49) Class625 local49 = (Class625) arg1.method18054(local11.anIntArray503[local29], -1619829167);
					if (local49.anInt5502 * -1477183523 >= 0) {
						local23 = local49.anInt5502 * -1477183523;
					}
				}
			}
		}
		if (local23 < 0) {
			return false;
		}
		anIntArray9[anInt87 * -1449044929] = local11.anInt5499 * 324896623;
		anIntArray10[anInt87 * -1449044929] = arg2;
		anIntArray8[anInt87 * -1449044929] = arg3;
		anInt87 += 358652863;
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "az", descriptor = "(III)Z")
	static boolean method624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface60 local13 = (Interface60) local3.method31570(arg0, arg1, arg2, (byte) 48);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 27);
		}
		local13 = (Interface60) local3.method31574(arg0, arg1, arg2, client.anInterface62_1, (byte) -98);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 62);
		}
		local13 = (Interface60) local3.method31558(arg0, arg1, arg2, -424283647);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 124);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ab", name = "as", descriptor = "(Lclient!sc;)Z")
	static boolean method625(@OriginalArg(0) Interface60 arg0) {
		@Pc(9) Class625 local9 = (Class625) client.aClass539_1.method30905(-8855502).method18054(arg0.method13834((byte) 15), 1975010421);
		if (local9.anInt5500 * -71198285 == -1) {
			return true;
		} else {
			@Pc(26) Class57 local26 = (Class57) Class265.aClass41_Sub12_3.method18054(local9.anInt5500 * -71198285, 1765471807);
			return local26.anInt204 * -782006561 == -1 ? true : local26.method1151(-2137047387);
		}
	}

	@OriginalMember(owner = "client!ab", name = "aw", descriptor = "(Lclient!sc;)Z")
	static boolean method626(@OriginalArg(0) Interface60 arg0) {
		@Pc(9) Class625 local9 = (Class625) client.aClass539_1.method30905(-708004929).method18054(arg0.method13834((byte) 47), 490636919);
		if (local9.anInt5500 * -71198285 == -1) {
			return true;
		} else {
			@Pc(26) Class57 local26 = (Class57) Class265.aClass41_Sub12_3.method18054(local9.anInt5500 * -71198285, 42022977);
			return local26.anInt204 * -782006561 == -1 ? true : local26.method1151(-2133619201);
		}
	}

	@OriginalMember(owner = "client!ab", name = "bg", descriptor = "(Lclient!di;IIIIIII)V")
	static void method627(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		@Pc(11) Interface60 local11 = (Interface60) local3.method31570(arg1, arg2, arg3, (byte) -77);
		@Pc(24) Class625 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class625) client.aClass539_1.method30905(1009349432).method18054(local11.method13834((byte) 70), -896421192);
			local30 = local11.method13820(722645122) & 0x3;
			local34 = local11.method13819(673706347);
			if (-71198285 * local24.anInt5500 == -1) {
				local50 = arg6;
				if (local24.anInt5506 * 350558937 > 0) {
					local50 = arg7;
				}
				if (local34 == Class607.aClass607_13.anInt5396 * 1323580581 || local34 == Class607.aClass607_16.anInt5396 * 1323580581) {
					if (local30 == 0) {
						arg0.method20719(arg4, arg5, 4, local50, (byte) -128);
					} else if (local30 == 1) {
						arg0.method20893(arg4, arg5, 4, local50, -930132668);
					} else if (local30 == 2) {
						arg0.method20719(arg4 + 3, arg5, 4, local50, (byte) -80);
					} else if (local30 == 3) {
						arg0.method20893(arg4, arg5 + 3, 4, local50, 749582494);
					}
				}
				if (local34 == Class607.aClass607_5.anInt5396 * 1323580581) {
					if (local30 == 0) {
						arg0.method20716(arg4, arg5, 1, 1, local50, (byte) 64);
					} else if (local30 == 1) {
						arg0.method20716(arg4 + 3, arg5, 1, 1, local50, (byte) 124);
					} else if (local30 == 2) {
						arg0.method20716(arg4 + 3, arg5 + 3, 1, 1, local50, (byte) 125);
					} else if (local30 == 3) {
						arg0.method20716(arg4, arg5 + 3, 1, 1, local50, (byte) 78);
					}
				}
				if (local34 == Class607.aClass607_16.anInt5396 * 1323580581) {
					if (local30 == 0) {
						arg0.method20893(arg4, arg5, 4, local50, -188342441);
					} else if (local30 == 1) {
						arg0.method20719(arg4 + 3, arg5, 4, local50, (byte) 2);
					} else if (local30 == 2) {
						arg0.method20893(arg4, arg5 + 3, 4, local50, -419476240);
					} else if (local30 == 3) {
						arg0.method20719(arg4, arg5, 4, local50, (byte) -48);
					}
				}
			} else {
				Class597.method32021(arg0, local24, local30, arg4, arg5, 424931476);
			}
		}
		local11 = (Interface60) local3.method31574(arg1, arg2, arg3, client.anInterface62_1, (byte) -38);
		if (local11 != null) {
			local24 = (Class625) client.aClass539_1.method30905(2095567206).method18054(local11.method13834((byte) 60), -684368395);
			local30 = local11.method13820(889231916) & 0x3;
			local34 = local11.method13819(1202439678);
			if (local24.anInt5500 * -71198285 != -1) {
				Class597.method32021(arg0, local24, local30, arg4, arg5, -689836027);
			} else if (Class607.aClass607_20.anInt5396 * 1323580581 == local34) {
				local50 = -1118482;
				if (local24.anInt5506 * 350558937 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20720(arg4, arg5 + 3, arg4 + 3, arg5, local50, -533502230);
				} else {
					arg0.method20720(arg4, arg5, arg4 + 3, arg5 + 3, local50, -533502230);
				}
			}
		}
		local11 = (Interface60) local3.method31558(arg1, arg2, arg3, 1592881667);
		if (local11 == null) {
			return;
		}
		local24 = (Class625) client.aClass539_1.method30905(435858654).method18054(local11.method13834((byte) -61), -1913216491);
		local30 = local11.method13820(663152575) & 0x3;
		if (local24.anInt5500 * -71198285 != -1) {
			Class597.method32021(arg0, local24, local30, arg4, arg5, 1464022749);
		}
	}

	@OriginalMember(owner = "client!ab", name = "bl", descriptor = "(Lclient!di;IIIIIII)V")
	static void method628(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		@Pc(11) Interface60 local11 = (Interface60) local3.method31570(arg1, arg2, arg3, (byte) 0);
		@Pc(24) Class625 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class625) client.aClass539_1.method30905(1604117284).method18054(local11.method13834((byte) -70), 1617101278);
			local30 = local11.method13820(-1313691649) & 0x3;
			local34 = local11.method13819(922548930);
			if (-71198285 * local24.anInt5500 == -1) {
				local50 = arg6;
				if (local24.anInt5506 * 350558937 > 0) {
					local50 = arg7;
				}
				if (local34 == Class607.aClass607_13.anInt5396 * 1323580581 || local34 == Class607.aClass607_16.anInt5396 * 1323580581) {
					if (local30 == 0) {
						arg0.method20719(arg4, arg5, 4, local50, (byte) -72);
					} else if (local30 == 1) {
						arg0.method20893(arg4, arg5, 4, local50, -2084926998);
					} else if (local30 == 2) {
						arg0.method20719(arg4 + 3, arg5, 4, local50, (byte) -104);
					} else if (local30 == 3) {
						arg0.method20893(arg4, arg5 + 3, 4, local50, 1269189884);
					}
				}
				if (local34 == Class607.aClass607_5.anInt5396 * 1323580581) {
					if (local30 == 0) {
						arg0.method20716(arg4, arg5, 1, 1, local50, (byte) 78);
					} else if (local30 == 1) {
						arg0.method20716(arg4 + 3, arg5, 1, 1, local50, (byte) 120);
					} else if (local30 == 2) {
						arg0.method20716(arg4 + 3, arg5 + 3, 1, 1, local50, (byte) 36);
					} else if (local30 == 3) {
						arg0.method20716(arg4, arg5 + 3, 1, 1, local50, (byte) 6);
					}
				}
				if (local34 == Class607.aClass607_16.anInt5396 * 1323580581) {
					if (local30 == 0) {
						arg0.method20893(arg4, arg5, 4, local50, 956647918);
					} else if (local30 == 1) {
						arg0.method20719(arg4 + 3, arg5, 4, local50, (byte) -29);
					} else if (local30 == 2) {
						arg0.method20893(arg4, arg5 + 3, 4, local50, 1821878802);
					} else if (local30 == 3) {
						arg0.method20719(arg4, arg5, 4, local50, (byte) -8);
					}
				}
			} else {
				Class597.method32021(arg0, local24, local30, arg4, arg5, -618190379);
			}
		}
		local11 = (Interface60) local3.method31574(arg1, arg2, arg3, client.anInterface62_1, (byte) -65);
		if (local11 != null) {
			local24 = (Class625) client.aClass539_1.method30905(-959692076).method18054(local11.method13834((byte) 98), 2088678325);
			local30 = local11.method13820(1758350468) & 0x3;
			local34 = local11.method13819(271215438);
			if (local24.anInt5500 * -71198285 != -1) {
				Class597.method32021(arg0, local24, local30, arg4, arg5, 1544456665);
			} else if (Class607.aClass607_20.anInt5396 * 1323580581 == local34) {
				local50 = -1118482;
				if (local24.anInt5506 * 350558937 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20720(arg4, arg5 + 3, arg4 + 3, arg5, local50, -533502230);
				} else {
					arg0.method20720(arg4, arg5, arg4 + 3, arg5 + 3, local50, -533502230);
				}
			}
		}
		local11 = (Interface60) local3.method31558(arg1, arg2, arg3, 1228633894);
		if (local11 == null) {
			return;
		}
		local24 = (Class625) client.aClass539_1.method30905(127688299).method18054(local11.method13834((byte) 43), -1147687830);
		local30 = local11.method13820(-504096640) & 0x3;
		if (local24.anInt5500 * -71198285 != -1) {
			Class597.method32021(arg0, local24, local30, arg4, arg5, -538603406);
		}
	}

	@OriginalMember(owner = "client!ab", name = "br", descriptor = "(Lclient!di;Lclient!vv;III)V")
	static void method629(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class625 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class57 local8 = (Class57) Class265.aClass41_Sub12_3.method18054(arg1.anInt5500 * -71198285, -432977770);
		if (-782006561 * local8.anInt204 == -1) {
			return;
		}
		if (arg1.aBoolean940) {
			@Pc(25) int local25 = arg2 + arg1.anInt5513 * 476252417;
			arg2 = local25 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(40) Class99 local40 = local8.method1148(arg0, arg2, arg1.aBoolean945, 2105841827);
		if (local40 == null) {
			return;
		}
		@Pc(49) int local49 = arg1.anInt5503 * 1462300569;
		@Pc(54) int local54 = arg1.anInt5504 * -1951356049;
		if ((arg2 & 0x1) == 1) {
			local49 = arg1.anInt5504 * -1951356049;
			local54 = arg1.anInt5503 * 1462300569;
		}
		@Pc(72) int local72 = local40.method18214();
		@Pc(75) int local75 = local40.method18288();
		if (local8.aBoolean31) {
			local72 = local49 * 4;
			local75 = local54 * 4;
		}
		if (local8.anInt203 * -567332909 == 0) {
			local40.method18228(arg3, arg4 - (local54 - 1) * 4, local72, local75);
		} else {
			local40.method18229(arg3, arg4 - (local54 - 1) * 4, local72, local75, 0, local8.anInt203 * -567332909 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!ab", name = "aj", descriptor = "()V")
	public static void method630() {
		anInt83 = -208096495;
	}

	@OriginalMember(owner = "client!ab", name = "ba", descriptor = "(Lclient!di;Lclient!hx;II)V")
	static void method631(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20744();
		@Pc(6) Class323 local6 = null;
		@Pc(8) Class98 local8 = null;
		if (arg1.anInt4135 * 710314345 == 5) {
			local6 = arg1.method27643(arg0, 1477428010);
			if (local6 == null) {
				return;
			}
			local8 = local6.aClass98_1;
			if (local6.anInt4066 * 1560847089 != arg1.anInt4103 * 1892149809 || arg1.anInt4104 * 1990157877 != local6.anInt4068 * 1138267573) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20986(arg2, arg3, arg1.anInt4103 * 1892149809 + arg2, arg1.anInt4104 * 1990157877 + arg3);
		if (anInt86 * 104994417 == 2 || anInt86 * 104994417 == 5 || Class86.aClass99_2 == null) {
			if (local8 == null) {
				return;
			}
			arg0.method20748(-16777216, local8, arg2, arg3);
			return;
		}
		arg0.method20707(anIntArray7);
		arg0.method20705();
		@Pc(87) Class626 local87 = client.aClass539_1.method30893((byte) -27);
		@Pc(96) int local96;
		@Pc(100) int local100;
		@Pc(106) int local106;
		@Pc(108) int local108;
		if (Class368.anInt4502 * -1583611537 == 4) {
			local96 = client.anInt3479 * -1853431703;
			local100 = client.anInt3480 * 608799169;
			local106 = (int) -client.aFloat255 & 0x3FFF;
			local108 = 4096;
		} else {
			@Pc(113) Class463 local113 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
			local96 = (int) local113.aFloat297;
			local100 = (int) local113.aFloat296;
			if (Class368.anInt4502 * -1583611537 == 3) {
				local106 = (int) -((double) Class160.aClass121_Sub1_2.method9648(585871962) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
			} else {
				local106 = (int) -client.aFloat255 + client.anInt3474 * -1918431893 & 0x3FFF;
			}
			local108 = 4096 - client.anInt3476 * 1807770768;
		}
		@Pc(164) int local164 = local96 / 128 + 48;
		@Pc(176) int local176 = client.aClass539_1.method31011(463398686) * 4 + 48 - local100 / 128;
		if (local8 == null) {
			Class86.aClass99_2.method18237((float) (arg1.anInt4103 * 1892149809) / 2.0F + (float) arg2, (float) arg3 + (float) (arg1.anInt4104 * 1990157877) / 2.0F, (float) local164, (float) local176, local108, local106 << 2, 1, -1, 1);
		} else {
			Class86.aClass99_2.method18239((float) (arg1.anInt4103 * 1892149809) / 2.0F + (float) arg2, (float) (arg1.anInt4104 * 1990157877) / 2.0F + (float) arg3, (float) local164, (float) local176, local108, local106 << 2, local8, arg2, arg3);
		}
		@Pc(250) Class587 local250 = client.aClass539_1.method30896(-2010946916);
		@Pc(263) int local263;
		@Pc(277) int local277;
		@Pc(289) int local289;
		@Pc(299) int local299;
		@Pc(309) int local309;
		for (@Pc(255) Class80_Sub20 local255 = (Class80_Sub20) aClass8_2.method247(129206984); local255 != null; local255 = (Class80_Sub20) aClass8_2.method237(-1371508564)) {
			local263 = local255.anInt1588 * 701000167;
			local277 = (local250.anIntArray479[local263] >> 14 & 0x3FFF) - local87.anInt5540 * -390642507;
			local289 = (local250.anIntArray479[local263] & 0x3FFF) - local87.anInt5537 * -894305615;
			local299 = local277 * 4 + 2 - local96 / 128;
			local309 = local289 * 4 + 2 - local100 / 128;
			Class669.method33495(arg0, local8, arg1, arg2, arg3, local299, local309, local250.anIntArray480[local263], -2147242498);
		}
		for (local263 = 0; local263 < anInt87 * -1449044929; local263++) {
			local277 = anIntArray10[local263] * 4 + 2 - local96 / 128;
			local289 = anIntArray8[local263] * 4 + 2 - local100 / 128;
			@Pc(369) Class625 local369 = (Class625) client.aClass539_1.method30905(-392764957).method18054(anIntArray9[local263], -2140706782);
			if (local369.anIntArray503 != null) {
				local369 = local369.method32456(Class672.aClass134_1, Class672.aClass134_1, -173767889);
				if (local369 == null || local369.anInt5502 * -1477183523 == -1) {
					continue;
				}
			}
			Class669.method33495(arg0, local8, arg1, arg2, arg3, local277, local289, local369.anInt5502 * -1477183523, -2141297791);
		}
		for (@Pc(407) Class80_Sub4 local407 = (Class80_Sub4) client.aClass24_22.method580((byte) -85); local407 != null; local407 = (Class80_Sub4) client.aClass24_22.method566((byte) 7)) {
			local277 = (int) (local407.aLong338 * 3209506792906532031L >> 28 & 0x3L);
			if (local277 == anInt83 * -1955503601) {
				local289 = (int) (local407.aLong338 * 3209506792906532031L & 0x3FFFL) - local87.anInt5540 * -390642507;
				local299 = (int) (local407.aLong338 * 3209506792906532031L >> 14 & 0x3FFFL) - local87.anInt5537 * -894305615;
				local309 = local289 * 4 + 2 - local96 / 128;
				@Pc(473) int local473 = local299 * 4 + 2 - local100 / 128;
				Class174.method24632(arg1, local8, arg2, arg3, local309, local473, Class697.aClass99Array9[0], -841802109);
			}
		}
		Class75.method1343(arg0, local96, local100, arg1, local8, arg2, arg3, 614914721);
		Class384.method28593(local96, local100, arg1, local8, arg2, arg3, 1953876329);
		Class239.method26216(local96, local100, arg1, local6, arg2, arg3, (byte) 0);
		if (Class368.anInt4502 * -1583611537 != 4) {
			if (anInt85 * 764713663 != -1) {
				local263 = anInt85 * -1236112644 + 2 - local96 / 128 + (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -98) - 1) * 2;
				local277 = anInt88 * 1044257452 + 2 - local100 / 128 + (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -39) - 1) * 2;
				Class165.method16960(arg1, local8, arg2 - Class475.anInt4961 * -1285085079, arg3 - Class148.anInt1470 * -1407629571, local263, local277, Class250.aClass99Array3[aBoolean15 ? 1 : 0], 100.0D, Class313.aClass313_2, Class309.aClass309_1, (byte) 123);
			}
			if (!Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass668_1.method33486((short) 10652)) {
				arg0.method20716(arg2 + arg1.anInt4103 * 1892149809 / 2 - 1, arg3 + arg1.anInt4104 * 1990157877 / 2 - 1, 3, 3, -1, (byte) 61);
			}
		}
		arg0.method20706(anIntArray7[0], anIntArray7[1], anIntArray7[2], anIntArray7[3]);
	}

	@OriginalMember(owner = "client!ab", name = "bt", descriptor = "(Lclient!di;IILclient!hx;Lclient!cg;II)V")
	static void method632(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) Class98 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3453 * -1702559601; local1++) {
			@Pc(14) Class80_Sub19 local14 = (Class80_Sub19) client.aClass24_18.method560((long) client.anIntArray304[local1]);
			if (local14 != null) {
				@Pc(20) Class120_Sub1_Sub1_Sub1_Sub1 local20 = (Class120_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local20.method18805((byte) 36) && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local20.aByte99) {
					@Pc(32) Class335 local32 = local20.aClass335_1;
					if (local32 != null && local32.anIntArray416 != null) {
						local32 = local32.method27836(Class672.aClass134_1, Class672.aClass134_1, 1454623297);
					}
					if (local32 != null && local32.aBoolean822 && local32.aBoolean821) {
						@Pc(56) Class463 local56 = local20.method24552().aClass463_61;
						@Pc(66) int local66 = (int) local56.aFloat297 / 128 - arg1 / 128;
						@Pc(76) int local76 = (int) local56.aFloat296 / 128 - arg2 / 128;
						if (local32.anInt4224 * 302757259 == -1) {
							Class174.method24632(arg3, arg4, arg5, arg6, local66, local76, Class697.aClass99Array9[1], -1778062682);
						} else {
							Class669.method33495(arg0, arg4, arg3, arg5, arg6, local66, local76, local32.anInt4224 * 302757259, -2146835745);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "ak", descriptor = "(Lclient!di;)V")
	static void method633(@OriginalArg(0) Class102 arg0) {
		if (-1955503601 * anInt83 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 && client.aClass539_1.method30932(-1638462787) != null) {
			Class303.method27111((byte) 33);
			if (Class518.method30588(arg0, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 292973947)) {
				anInt83 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 * 208096495;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "bj", descriptor = "(IILclient!hx;Lclient!cg;II)V")
	static void method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) Class98 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class51.anInt191 * 44967471;
		@Pc(5) int[] local5 = Class51.anIntArray20;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class120_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method19061(-2147290360) && !local16.aClass668_1.method33486((short) -10583) && local16 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local16.aByte99) {
				@Pc(40) Class463 local40 = local16.method24552().aClass463_61;
				@Pc(50) int local50 = (int) local40.aFloat297 / 128 - arg0 / 128;
				@Pc(60) int local60 = (int) local40.aFloat296 / 128 - arg1 / 128;
				@Pc(62) boolean local62 = false;
				for (@Pc(64) int local64 = 0; local64 < client.anInt3573 * 975306769; local64++) {
					@Pc(73) Class676 local73 = client.aClass676Array1[local64];
					if (local16.aString73.equals(local73.aString236) && local73.anInt5740 * 922507867 != 0) {
						local62 = true;
						break;
					}
				}
				@Pc(91) boolean local91 = false;
				for (@Pc(93) int local93 = 0; local93 < Class274.anInt3924 * -912877411; local93++) {
					if (local16.aString73.equals(Class14.aClass164Array1[local93].aString64)) {
						local91 = true;
						break;
					}
				}
				@Pc(113) boolean local113 = false;
				if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 != 0 && local16.anInt2708 * 1960918119 != 0 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 == local16.anInt2708 * 1960918119) {
					local113 = true;
				}
				if (local16.aClass672_1 != null && local16.aClass672_1.anInt5712 * 1260077339 != -1 && ((Class335) Class460.aClass41_Sub2_1.method18054(local16.aClass672_1.anInt5712 * 1260077339, 1890786747)).aBoolean829) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[1], -1139021773);
				} else if (Class289.aClass289_3 == local16.aClass289_1) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[8], -1896803784);
				} else if (Class289.aClass289_4 == local16.aClass289_1) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[6], -1674087080);
				} else if (local113) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[4], 1259688175);
				} else if (local62) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[3], 1614871992);
				} else if (local16.aBoolean457) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[7], -1305030351);
				} else if (local91) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[5], -1058692572);
				} else {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[2], -1295112616);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "bk", descriptor = "(IILclient!hx;Lclient!hr;II)V")
	static void method635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) Class323 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) Class101[] local1 = client.aClass101Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class101 local11 = local1[local3];
			if (local11 != null && local11.anInt467 * 1614016575 != 0 && client.anInt3436 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt467 * 1614016575 == 1) {
					@Pc(38) Class80_Sub19 local38 = (Class80_Sub19) client.aClass24_18.method560((long) (local11.anInt464 * 1096614689));
					if (local38 != null) {
						@Pc(45) Class120_Sub1_Sub1_Sub1_Sub1 local45 = (Class120_Sub1_Sub1_Sub1_Sub1) local38.anObject5;
						@Pc(49) Class463 local49 = local45.method24552().aClass463_61;
						local59 = (int) local49.aFloat297 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat296 / 128 - arg1 / 128;
						Class616.method32288(arg2, arg3, arg4, arg5, local59, local69, local11.anInt461 * -168952975, 360000L);
					}
				}
				if (local11.anInt467 * 1614016575 == 2) {
					@Pc(98) int local98 = local11.anInt466 * -191529145 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt465 * -1207974023 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt460 * -380320871 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class616.method32288(arg2, arg3, arg4, arg5, local98, local109, local11.anInt461 * -168952975, local121);
				}
				if (local11.anInt467 * 1614016575 == 10 && local11.anInt464 * 1096614689 >= 0 && local11.anInt464 * 1096614689 < client.aClass120_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class120_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt464 * 1096614689];
					if (local158 != null) {
						@Pc(165) Class463 local165 = local158.method24552().aClass463_61;
						@Pc(175) int local175 = (int) local165.aFloat297 / 128 - arg0 / 128;
						local59 = (int) local165.aFloat296 / 128 - arg1 / 128;
						Class616.method32288(arg2, arg3, arg4, arg5, local175, local59, local11.anInt461 * -168952975, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "bz", descriptor = "(IILclient!hx;Lclient!hr;II)V")
	static void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) Class323 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) Class101[] local1 = client.aClass101Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class101 local11 = local1[local3];
			if (local11 != null && local11.anInt467 * 1614016575 != 0 && client.anInt3436 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt467 * 1614016575 == 1) {
					@Pc(38) Class80_Sub19 local38 = (Class80_Sub19) client.aClass24_18.method560((long) (local11.anInt464 * 1096614689));
					if (local38 != null) {
						@Pc(45) Class120_Sub1_Sub1_Sub1_Sub1 local45 = (Class120_Sub1_Sub1_Sub1_Sub1) local38.anObject5;
						@Pc(49) Class463 local49 = local45.method24552().aClass463_61;
						local59 = (int) local49.aFloat297 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat296 / 128 - arg1 / 128;
						Class616.method32288(arg2, arg3, arg4, arg5, local59, local69, local11.anInt461 * -168952975, 360000L);
					}
				}
				if (local11.anInt467 * 1614016575 == 2) {
					@Pc(98) int local98 = local11.anInt466 * -191529145 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt465 * -1207974023 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt460 * -380320871 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class616.method32288(arg2, arg3, arg4, arg5, local98, local109, local11.anInt461 * -168952975, local121);
				}
				if (local11.anInt467 * 1614016575 == 10 && local11.anInt464 * 1096614689 >= 0 && local11.anInt464 * 1096614689 < client.aClass120_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class120_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt464 * 1096614689];
					if (local158 != null) {
						@Pc(165) Class463 local165 = local158.method24552().aClass463_61;
						@Pc(175) int local175 = (int) local165.aFloat297 / 128 - arg0 / 128;
						local59 = (int) local165.aFloat296 / 128 - arg1 / 128;
						Class616.method32288(arg2, arg3, arg4, arg5, local175, local59, local11.anInt461 * -168952975, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "av", descriptor = "(I)V")
	static void method637(@OriginalArg(0) int arg0) {
		anInt87 = 0;
		@Pc(5) int local5 = client.aClass539_1.method30921(1970263909);
		@Pc(9) int local9 = client.aClass539_1.method31011(763202330);
		@Pc(13) Class502 local13 = client.aClass539_1.method30903(-463929735);
		@Pc(17) Class570 local17 = client.aClass539_1.method30932(-1638462787);
		@Pc(21) Class41_Sub3 local21 = client.aClass539_1.method30905(1963546253);
		@Pc(23) int local23 = arg0;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(33) int local33 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
			@Pc(40) int local40 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			if (local33 >= 0 && local33 < Class123.aBooleanArrayArray17.length && local40 >= 0 && local40 < Class123.aBooleanArrayArray17[local33].length && Class123.aBooleanArrayArray17[local33][local40]) {
				local23 = 0;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < local5; local64++) {
			for (@Pc(69) int local69 = 0; local69 < local9; local69++) {
				for (@Pc(74) int local74 = local23; local74 <= arg0 + 1 && local74 <= 3; local74++) {
					if ((local74 < arg0 || local13.method30430(arg0, local74, local64, local69, 73602969)) && !Class210.method25807((Interface60) local17.method31558(local74, local64, local69, 1415869909), local21, local64, local69, 2077979905) && !Class210.method25807((Interface60) local17.method31574(local74, local64, local69, client.anInterface62_1, (byte) -87), local21, local64, local69, 1946825022) && !Class210.method25807((Interface60) local17.method31570(local74, local64, local69, (byte) -38), local21, local64, local69, 2023265640) && Class210.method25807((Interface60) local17.method31572(local74, local64, local69, (byte) -37), local21, local64, local69, 2138315814)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "bh", descriptor = "(Lclient!di;Lclient!cg;Lclient!hx;IIIII)V")
	static void method638(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class320 local5 = (Class320) Class157.aClass41_Sub13_2.method18054(arg7, 1325390);
		if (local5 != null && local5.anIntArray389 != null && local5.method27544(Class672.aClass134_1, Class672.aClass134_1, -2125285540)) {
			local5 = local5.method27550(Class672.aClass134_1, Class672.aClass134_1, 1993716808);
		}
		if (local5 == null || !local5.aBoolean796 || !local5.method27544(Class672.aClass134_1, Class672.aClass134_1, -2004304382)) {
			return;
		}
		@Pc(46) int local46;
		if (local5.anIntArray390 != null) {
			@Pc(44) int[] local44 = new int[local5.anIntArray390.length];
			@Pc(71) int local71;
			@Pc(96) int local96;
			@Pc(100) int local100;
			for (local46 = 0; local46 < local44.length / 2; local46++) {
				if (Class368.anInt4502 * -1583611537 == 3) {
					local71 = (int) ((double) Class160.aClass121_Sub1_2.method9648(-561284344) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
				} else if (Class368.anInt4502 * -1583611537 == 4) {
					local71 = (int) client.aFloat255 & 0x3FFF;
				} else {
					local71 = client.anInt3474 * -1918431893 + (int) client.aFloat255 & 0x3FFF;
				}
				local96 = Class467.anIntArray454[local71];
				local100 = Class467.anIntArray453[local71];
				if (Class368.anInt4502 * -1583611537 != 4) {
					local96 = local96 * 256 / (client.anInt3476 * -692320695 + 256);
					local100 = local100 * 256 / (client.anInt3476 * -692320695 + 256);
				}
				local44[local46 * 2] = arg2.anInt4103 * 1892149809 / 2 + arg3 + ((local5.anIntArray390[local46 * 2] * 4 + arg5) * local100 + (arg6 + local5.anIntArray390[local46 * 2 + 1] * 4) * local96 >> 14);
				local44[local46 * 2 + 1] = arg2.anInt4104 * 1990157877 / 2 + arg4 - ((local5.anIntArray390[local46 * 2 + 1] * 4 + arg6) * local100 - (arg5 + local5.anIntArray390[local46 * 2] * 4) * local96 >> 14);
			}
			@Pc(220) Class323 local220 = arg2.method27643(arg0, 1477428010);
			if (local220 != null) {
				Class234.method26108(arg0, local44, local5.anInt4054 * 2024928351, local220.anIntArray399, local220.anIntArray398);
			}
			if (local5.anInt4039 * -794672681 > 0) {
				@Pc(271) int local271;
				@Pc(281) int local281;
				@Pc(286) int local286;
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					local96 = local44[local71 * 2];
					local100 = local44[local71 * 2 + 1];
					local271 = local44[(local71 + 1) * 2];
					local281 = local44[(local71 + 1) * 2 + 1];
					if (local271 < local96) {
						local286 = local96;
						@Pc(288) int local288 = local100;
						local96 = local271;
						local100 = local281;
						local271 = local286;
						local281 = local288;
					} else if (local271 == local96 && local281 < local100) {
						local286 = local100;
						local100 = local281;
						local281 = local286;
					}
					if (arg1 == null) {
						arg0.method20729(local96, local100, local271, local281, local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
					} else {
						arg0.method20979(local96, local100, local271, local281, local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
					}
				}
				local71 = local44[local44.length - 2];
				local96 = local44[local44.length - 1];
				local100 = local44[0];
				local271 = local44[1];
				if (local100 < local71) {
					local281 = local71;
					local286 = local96;
					local71 = local100;
					local96 = local271;
					local100 = local281;
					local271 = local286;
				} else if (local100 == local71 && local271 < local96) {
					local281 = local96;
					local96 = local271;
					local271 = local281;
				}
				if (arg1 == null) {
					arg0.method20729(local71, local96, local100, local271, local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
				} else {
					arg0.method20979(local71, local96, local100, local271, local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4039 * -794672681, local5.anInt4045 * 340393953, local5.anInt4030 * -905799331);
				}
			} else if (arg1 == null) {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20727(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1);
				}
				arg0.method20727(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1);
			} else {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20728(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray391[local5.aByteArray81[local71] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method20728(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray391[local5.aByteArray81[local5.aByteArray81.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		@Pc(679) Class99 local679 = null;
		if (local5.anInt4037 * 1279732247 != -1) {
			local679 = local5.method27545(arg0, false, 259016280);
			if (local679 != null) {
				local46 = local5.anInt4060 * -1105818937 > 0 ? local5.anInt4060 * -1105818937 : Class698.aClass638_1.anInt5613 * -1632664461;
				Class165.method16960(arg2, arg1, arg3, arg4, arg5, arg6, local679, (double) local46, local5.aClass313_4, local5.aClass309_4, (byte) 38);
			}
		}
		if (local5.aString178 == null) {
			return;
		}
		local46 = 0;
		if (local679 != null) {
			local46 = local679.method18219();
		}
		@Pc(738) Class104 local738 = Class108.aClass104_22;
		@Pc(740) Class15 local740 = Class619.aClass15_12;
		if (local5.anInt4031 * -618572023 == 1) {
			local738 = Class709.aClass104_26;
			local740 = Class689.aClass15_13;
		}
		if (local5.anInt4031 * -618572023 == 2) {
			local738 = Class8.aClass104_1;
			local740 = Class375.aClass15_9;
		}
		Class281.method26861(arg2, arg1, arg3, arg4, arg5, arg6, local46, local5.aString178, local738, local740, local5.anInt4032 * -791504431, -908060574);
	}

	@OriginalMember(owner = "client!ab", name = "aa", descriptor = "(I)V")
	static void method639(@OriginalArg(0) int arg0) {
		anInt87 = 0;
		@Pc(5) int local5 = client.aClass539_1.method30921(2020317481);
		@Pc(9) int local9 = client.aClass539_1.method31011(760706509);
		@Pc(13) Class502 local13 = client.aClass539_1.method30903(-463929735);
		@Pc(17) Class570 local17 = client.aClass539_1.method30932(-1638462787);
		@Pc(21) Class41_Sub3 local21 = client.aClass539_1.method30905(-603633900);
		@Pc(23) int local23 = arg0;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(33) int local33 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >> 3;
			@Pc(40) int local40 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >> 3;
			if (local33 >= 0 && local33 < Class123.aBooleanArrayArray17.length && local40 >= 0 && local40 < Class123.aBooleanArrayArray17[local33].length && Class123.aBooleanArrayArray17[local33][local40]) {
				local23 = 0;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < local5; local64++) {
			for (@Pc(69) int local69 = 0; local69 < local9; local69++) {
				for (@Pc(74) int local74 = local23; local74 <= arg0 + 1 && local74 <= 3; local74++) {
					if ((local74 < arg0 || local13.method30430(arg0, local74, local64, local69, 73602969)) && !Class210.method25807((Interface60) local17.method31558(local74, local64, local69, 661396940), local21, local64, local69, 1947869124) && !Class210.method25807((Interface60) local17.method31574(local74, local64, local69, client.anInterface62_1, (byte) -22), local21, local64, local69, 2009985257) && !Class210.method25807((Interface60) local17.method31570(local74, local64, local69, (byte) 0), local21, local64, local69, 2116323153) && Class210.method25807((Interface60) local17.method31572(local74, local64, local69, (byte) -22), local21, local64, local69, 2002467288)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "bp", descriptor = "(Lclient!hx;Lclient!cg;IIIILclient!cm;DLclient!hh;Lclient!hd;)V")
	static void method640(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class99 arg6, @OriginalArg(7) double arg7, @OriginalArg(8) Class313 arg8, @OriginalArg(9) Class309 arg9) {
		if (arg6 == null) {
			return;
		}
		@Pc(21) int local21;
		if (Class368.anInt4502 * -1583611537 == 3) {
			local21 = (int) ((double) Class160.aClass121_Sub1_2.method9648(-1256416263) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
		} else if (Class368.anInt4502 * -1583611537 == 4) {
			local21 = (int) client.aFloat255 & 0x3FFF;
		} else {
			local21 = (int) client.aFloat255 + client.anInt3474 * -1918431893 & 0x3FFF;
		}
		@Pc(58) int local58 = Math.max(arg0.anInt4103 * 1892149809 / 2, arg0.anInt4104 * 1990157877 / 2) + 10;
		@Pc(66) int local66 = arg5 * arg5 + arg4 * arg4;
		if (local66 > local58 * local58) {
			return;
		}
		@Pc(76) int local76 = Class467.anIntArray454[local21];
		@Pc(80) int local80 = Class467.anIntArray453[local21];
		if (Class368.anInt4502 * -1583611537 != 4) {
			local76 = local76 * 256 / (client.anInt3476 * -692320695 + 256);
			local80 = local80 * 256 / (client.anInt3476 * -692320695 + 256);
		}
		@Pc(115) int local115 = arg5 * local76 + arg4 * local80 >> 14;
		@Pc(125) int local125 = arg5 * local80 - arg4 * local76 >> 14;
		@Pc(129) double local129 = arg7 / 100.0D;
		switch(arg8.anInt4019 * -1120202439) {
			case 0:
				arg2 = arg0.anInt4103 * 1892149809 / 2 + arg2 + local115;
				break;
			case 1:
				arg2 = local115 + arg2 + arg0.anInt4103 * 1892149809 / 2 - (int) ((double) arg6.method18214() * local129);
				break;
			case 2:
				arg2 = arg2 + arg0.anInt4103 * 1892149809 / 2 + local115 - (int) ((double) (arg6.method18214() / 2) * local129);
		}
		switch(arg9.anInt4011 * -2069042521) {
			case 0:
				arg3 = arg0.anInt4104 * 1990157877 / 2 + arg3 - local125 - (int) ((double) arg6.method18288() * local129);
				break;
			case 1:
				arg3 = arg0.anInt4104 * 1990157877 / 2 + arg3 - local125;
				break;
			case 2:
				arg3 = arg0.anInt4104 * 1990157877 / 2 + arg3 - local125 - (int) ((double) (arg6.method18288() / 2) * local129);
		}
		if (arg1 == null) {
			if (local129 == 1.0D) {
				arg6.method18225(arg2, arg3);
			}
			arg6.method18228(arg2, arg3, (int) ((double) arg6.method18214() * local129), (int) ((double) arg6.method18288() * local129));
		} else if (local129 == 1.0D) {
			arg6.method18235(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method18228(arg2, arg3, (int) ((double) arg6.method18214() * local129), (int) ((double) arg6.method18288() * local129));
		}
	}

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "(Lclient!hx;Lclient!cg;IIIILclient!cm;DLclient!hh;Lclient!hd;)V")
	static void method641(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class99 arg6, @OriginalArg(7) double arg7, @OriginalArg(8) Class313 arg8, @OriginalArg(9) Class309 arg9) {
		if (arg6 == null) {
			return;
		}
		@Pc(21) int local21;
		if (Class368.anInt4502 * -1583611537 == 3) {
			local21 = (int) ((double) Class160.aClass121_Sub1_2.method9648(-1347599902) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
		} else if (Class368.anInt4502 * -1583611537 == 4) {
			local21 = (int) client.aFloat255 & 0x3FFF;
		} else {
			local21 = (int) client.aFloat255 + client.anInt3474 * -1918431893 & 0x3FFF;
		}
		@Pc(58) int local58 = Math.max(arg0.anInt4103 * 1892149809 / 2, arg0.anInt4104 * 1990157877 / 2) + 10;
		@Pc(66) int local66 = arg5 * arg5 + arg4 * arg4;
		if (local66 > local58 * local58) {
			return;
		}
		@Pc(76) int local76 = Class467.anIntArray454[local21];
		@Pc(80) int local80 = Class467.anIntArray453[local21];
		if (Class368.anInt4502 * -1583611537 != 4) {
			local76 = local76 * 256 / (client.anInt3476 * -692320695 + 256);
			local80 = local80 * 256 / (client.anInt3476 * -692320695 + 256);
		}
		@Pc(115) int local115 = arg5 * local76 + arg4 * local80 >> 14;
		@Pc(125) int local125 = arg5 * local80 - arg4 * local76 >> 14;
		@Pc(129) double local129 = arg7 / 100.0D;
		switch(arg8.anInt4019 * -1120202439) {
			case 0:
				arg2 = arg0.anInt4103 * 1892149809 / 2 + arg2 + local115;
				break;
			case 1:
				arg2 = local115 + arg2 + arg0.anInt4103 * 1892149809 / 2 - (int) ((double) arg6.method18214() * local129);
				break;
			case 2:
				arg2 = arg2 + arg0.anInt4103 * 1892149809 / 2 + local115 - (int) ((double) (arg6.method18214() / 2) * local129);
		}
		switch(arg9.anInt4011 * -2069042521) {
			case 0:
				arg3 = arg0.anInt4104 * 1990157877 / 2 + arg3 - local125 - (int) ((double) arg6.method18288() * local129);
				break;
			case 1:
				arg3 = arg0.anInt4104 * 1990157877 / 2 + arg3 - local125;
				break;
			case 2:
				arg3 = arg0.anInt4104 * 1990157877 / 2 + arg3 - local125 - (int) ((double) (arg6.method18288() / 2) * local129);
		}
		if (arg1 == null) {
			if (local129 == 1.0D) {
				arg6.method18225(arg2, arg3);
			}
			arg6.method18228(arg2, arg3, (int) ((double) arg6.method18214() * local129), (int) ((double) arg6.method18288() * local129));
		} else if (local129 == 1.0D) {
			arg6.method18235(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method18228(arg2, arg3, (int) ((double) arg6.method18214() * local129), (int) ((double) arg6.method18288() * local129));
		}
	}

	@OriginalMember(owner = "client!ab", name = "bo", descriptor = "(Lclient!hx;Lclient!cg;IIIIILjava/lang/String;Lclient!ed;Lclient!aan;I)V")
	static void method642(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class104 arg8, @OriginalArg(9) Class15 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (Class368.anInt4502 * -1583611537 == 3) {
			local18 = (int) ((double) Class160.aClass121_Sub1_2.method9648(-1495854198) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
		} else if (Class368.anInt4502 * -1583611537 == 4) {
			local18 = (int) client.aFloat255 & 0x3FFF;
		} else {
			local18 = (int) client.aFloat255 + client.anInt3474 * -1918431893 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt4103 * 1892149809 / 2, arg0.anInt4104 * 1990157877 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class467.anIntArray454[local18];
		@Pc(77) int local77 = Class467.anIntArray453[local18];
		if (Class368.anInt4502 * -1583611537 != 4) {
			local73 = local73 * 256 / (client.anInt3476 * -692320695 + 256);
			local77 = local77 * 256 / (client.anInt3476 * -692320695 + 256);
		}
		@Pc(112) int local112 = arg5 * local73 + arg4 * local77 >> 14;
		@Pc(122) int local122 = arg5 * local77 - arg4 * local73 >> 14;
		@Pc(129) int local129 = arg9.method377(arg7, 100, null, 470943964);
		@Pc(137) int local137 = arg9.method380(arg7, 100, 0, null, (byte) -93);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt4103 * 1892149809) && local143 <= arg0.anInt4103 * 1892149809 && local122 >= -(arg0.anInt4104 * 1990157877) && local122 <= arg0.anInt4104 * 1990157877) {
			arg8.method7631(arg7, arg2 + local143 + arg0.anInt4103 * 1892149809 / 2, arg0.anInt4104 * 1990157877 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "bn", descriptor = "(Lclient!di;Lclient!hx;II)V")
	static void method643(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20744();
		@Pc(6) Class323 local6 = null;
		@Pc(8) Class98 local8 = null;
		if (arg1.anInt4135 * 710314345 == 5) {
			local6 = arg1.method27643(arg0, 1477428010);
			if (local6 == null) {
				return;
			}
			local8 = local6.aClass98_1;
			if (local6.anInt4066 * 1560847089 != arg1.anInt4103 * 1892149809 || arg1.anInt4104 * 1990157877 != local6.anInt4068 * 1138267573) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20986(arg2, arg3, arg1.anInt4103 * 1892149809 + arg2, arg1.anInt4104 * 1990157877 + arg3);
		if (anInt86 * 104994417 == 2 || anInt86 * 104994417 == 5 || Class86.aClass99_2 == null) {
			if (local8 == null) {
				return;
			}
			arg0.method20748(-16777216, local8, arg2, arg3);
			return;
		}
		arg0.method20707(anIntArray7);
		arg0.method20705();
		@Pc(87) Class626 local87 = client.aClass539_1.method30893((byte) -117);
		@Pc(96) int local96;
		@Pc(100) int local100;
		@Pc(106) int local106;
		@Pc(108) int local108;
		if (Class368.anInt4502 * -1583611537 == 4) {
			local96 = client.anInt3479 * -1853431703;
			local100 = client.anInt3480 * 608799169;
			local106 = (int) -client.aFloat255 & 0x3FFF;
			local108 = 4096;
		} else {
			@Pc(113) Class463 local113 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
			local96 = (int) local113.aFloat297;
			local100 = (int) local113.aFloat296;
			if (Class368.anInt4502 * -1583611537 == 3) {
				local106 = (int) -((double) Class160.aClass121_Sub1_2.method9648(24662753) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
			} else {
				local106 = (int) -client.aFloat255 + client.anInt3474 * -1918431893 & 0x3FFF;
			}
			local108 = 4096 - client.anInt3476 * 1807770768;
		}
		@Pc(164) int local164 = local96 / 128 + 48;
		@Pc(176) int local176 = client.aClass539_1.method31011(-474628435) * 4 + 48 - local100 / 128;
		if (local8 == null) {
			Class86.aClass99_2.method18237((float) (arg1.anInt4103 * 1892149809) / 2.0F + (float) arg2, (float) arg3 + (float) (arg1.anInt4104 * 1990157877) / 2.0F, (float) local164, (float) local176, local108, local106 << 2, 1, -1, 1);
		} else {
			Class86.aClass99_2.method18239((float) (arg1.anInt4103 * 1892149809) / 2.0F + (float) arg2, (float) (arg1.anInt4104 * 1990157877) / 2.0F + (float) arg3, (float) local164, (float) local176, local108, local106 << 2, local8, arg2, arg3);
		}
		@Pc(250) Class587 local250 = client.aClass539_1.method30896(-1686196817);
		@Pc(263) int local263;
		@Pc(277) int local277;
		@Pc(289) int local289;
		@Pc(299) int local299;
		@Pc(309) int local309;
		for (@Pc(255) Class80_Sub20 local255 = (Class80_Sub20) aClass8_2.method247(129206984); local255 != null; local255 = (Class80_Sub20) aClass8_2.method237(353504848)) {
			local263 = local255.anInt1588 * 701000167;
			local277 = (local250.anIntArray479[local263] >> 14 & 0x3FFF) - local87.anInt5540 * -390642507;
			local289 = (local250.anIntArray479[local263] & 0x3FFF) - local87.anInt5537 * -894305615;
			local299 = local277 * 4 + 2 - local96 / 128;
			local309 = local289 * 4 + 2 - local100 / 128;
			Class669.method33495(arg0, local8, arg1, arg2, arg3, local299, local309, local250.anIntArray480[local263], -2142384306);
		}
		for (local263 = 0; local263 < anInt87 * -1449044929; local263++) {
			local277 = anIntArray10[local263] * 4 + 2 - local96 / 128;
			local289 = anIntArray8[local263] * 4 + 2 - local100 / 128;
			@Pc(369) Class625 local369 = (Class625) client.aClass539_1.method30905(1197140567).method18054(anIntArray9[local263], 381297165);
			if (local369.anIntArray503 != null) {
				local369 = local369.method32456(Class672.aClass134_1, Class672.aClass134_1, -1559783121);
				if (local369 == null || local369.anInt5502 * -1477183523 == -1) {
					continue;
				}
			}
			Class669.method33495(arg0, local8, arg1, arg2, arg3, local277, local289, local369.anInt5502 * -1477183523, -2143946075);
		}
		for (@Pc(407) Class80_Sub4 local407 = (Class80_Sub4) client.aClass24_22.method580((byte) 0); local407 != null; local407 = (Class80_Sub4) client.aClass24_22.method566((byte) 7)) {
			local277 = (int) (local407.aLong338 * 3209506792906532031L >> 28 & 0x3L);
			if (local277 == anInt83 * -1955503601) {
				local289 = (int) (local407.aLong338 * 3209506792906532031L & 0x3FFFL) - local87.anInt5540 * -390642507;
				local299 = (int) (local407.aLong338 * 3209506792906532031L >> 14 & 0x3FFFL) - local87.anInt5537 * -894305615;
				local309 = local289 * 4 + 2 - local96 / 128;
				@Pc(473) int local473 = local299 * 4 + 2 - local100 / 128;
				Class174.method24632(arg1, local8, arg2, arg3, local309, local473, Class697.aClass99Array9[0], -1418450741);
			}
		}
		Class75.method1343(arg0, local96, local100, arg1, local8, arg2, arg3, 614914721);
		Class384.method28593(local96, local100, arg1, local8, arg2, arg3, 1898305178);
		Class239.method26216(local96, local100, arg1, local6, arg2, arg3, (byte) 0);
		if (Class368.anInt4502 * -1583611537 != 4) {
			if (anInt85 * 764713663 != -1) {
				local263 = anInt85 * -1236112644 + 2 - local96 / 128 + (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -14) - 1) * 2;
				local277 = anInt88 * 1044257452 + 2 - local100 / 128 + (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -67) - 1) * 2;
				Class165.method16960(arg1, local8, arg2 - Class475.anInt4961 * -1285085079, arg3 - Class148.anInt1470 * -1407629571, local263, local277, Class250.aClass99Array3[aBoolean15 ? 1 : 0], 100.0D, Class313.aClass313_2, Class309.aClass309_1, (byte) 64);
			}
			if (!Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass668_1.method33486((short) 24609)) {
				arg0.method20716(arg2 + arg1.anInt4103 * 1892149809 / 2 - 1, arg3 + arg1.anInt4104 * 1990157877 / 2 - 1, 3, 3, -1, (byte) 55);
			}
		}
		arg0.method20706(anIntArray7[0], anIntArray7[1], anIntArray7[2], anIntArray7[3]);
	}

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "()V")
	static void method644() {
		anInt86 = 0;
		anInt83 = -208096495;
		anInt85 = 1198271169;
		anInt88 = 2069609469;
	}

	@OriginalMember(owner = "client!ab", name = "fk", descriptor = "(Lclient!yp;I)V")
	static void method645(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class614.method32271(local11, local14, arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!ab", name = "al", descriptor = "(B)V")
	static void method646(@OriginalArg(0) byte arg0) {
		Class622.aTwitchWebcamDeviceArray1 = Class669.aTwitchTV1.GetWebcamDevices();
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	Class27() throws Throwable {
		throw new Error();
	}
}
