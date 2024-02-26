package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alp")
public final class Class159_Sub1 extends Class159 {

	@OriginalMember(owner = "client!alp", name = "cc", descriptor = "I")
	public static int anInt2026;

	@OriginalMember(owner = "client!alp", name = "bw", descriptor = "I")
	static int anInt2022 = 0;

	@OriginalMember(owner = "client!alp", name = "bx", descriptor = "I")
	static int anInt2020 = -821304911;

	@OriginalMember(owner = "client!alp", name = "bi", descriptor = "I")
	static int anInt2014 = -761670090;

	@OriginalMember(owner = "client!alp", name = "bu", descriptor = "I")
	static int anInt2015 = -1432272824;

	@OriginalMember(owner = "client!alp", name = "bm", descriptor = "I")
	public static int anInt2013 = -142225195;

	@OriginalMember(owner = "client!alp", name = "bq", descriptor = "I")
	public static int anInt2016 = -1408137314;

	@OriginalMember(owner = "client!alp", name = "bd", descriptor = "I")
	public static int anInt2017 = 0;

	@OriginalMember(owner = "client!alp", name = "cy", descriptor = "I")
	static int anInt2018 = -1806870975;

	@OriginalMember(owner = "client!alp", name = "ch", descriptor = "I")
	static int anInt2019 = -387547399;

	@OriginalMember(owner = "client!alp", name = "cs", descriptor = "Z")
	static boolean aBoolean400 = false;

	@OriginalMember(owner = "client!alp", name = "ck", descriptor = "I")
	static int anInt2021 = 427851623;

	@OriginalMember(owner = "client!alp", name = "ca", descriptor = "I")
	static int anInt2025 = -869244937;

	@OriginalMember(owner = "client!alp", name = "cr", descriptor = "Z")
	static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!alp", name = "ci", descriptor = "[[Lclient!ed;")
	static Class104[][] aClass104ArrayArray1 = new Class104[3][5];

	@OriginalMember(owner = "client!alp", name = "cm", descriptor = "[[Lclient!aan;")
	static Class15[][] aClass15ArrayArray1 = new Class15[3][5];

	@OriginalMember(owner = "client!alp", name = "cb", descriptor = "Ljava/util/HashMap;")
	static HashMap aHashMap4 = new HashMap();

	@OriginalMember(owner = "client!alp", name = "cw", descriptor = "Ljava/util/HashMap;")
	static HashMap aHashMap5 = new HashMap();

	@OriginalMember(owner = "client!alp", name = "cl", descriptor = "I")
	static int anInt2023 = anInt2013 * -37559507;

	@OriginalMember(owner = "client!alp", name = "cx", descriptor = "I")
	static int anInt2024 = anInt2016 * 1716757035;

	@OriginalMember(owner = "client!alp", name = "cf", descriptor = "Z")
	static boolean aBoolean405 = false;

	@OriginalMember(owner = "client!alp", name = "cz", descriptor = "Z")
	public static boolean aBoolean406 = false;

	@OriginalMember(owner = "client!alp", name = "cq", descriptor = "Lclient!aax;")
	public static Class24 aClass24_15 = new Class24(8);

	@OriginalMember(owner = "client!alp", name = "dg", descriptor = "Lclient!aax;")
	public static Class24 aClass24_16 = new Class24(8);

	@OriginalMember(owner = "client!alp", name = "dh", descriptor = "Lclient!aae;")
	static Class7 aClass7_1 = new Class7(new Class8());

	@OriginalMember(owner = "client!alp", name = "dd", descriptor = "Z")
	public static boolean aBoolean401 = false;

	@OriginalMember(owner = "client!alp", name = "dc", descriptor = "Z")
	public static boolean aBoolean407 = false;

	@OriginalMember(owner = "client!alp", name = "dn", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!alp", name = "df", descriptor = "Z")
	static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!alp", name = "dl", descriptor = "Z")
	static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!alp", name = "db", descriptor = "Z")
	static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!alp", name = "fa", descriptor = "(Lclient!di;IIII)V")
	static void method15441(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20986(arg1, arg2, arg1 + arg3, arg4 + arg2);
		arg0.method20716(arg1, arg2, arg3, arg4, -16777216, (byte) 51);
		if (anInt2017 * 1776676847 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) anInt1989 / (float) anInt2001;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) (local29 * (float) arg3);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class374.aClass99_31 == null || Class374.aClass99_31.method18218() != local31 || Class374.aClass99_31.method18219() != local33) {
			aClass243_34 = aClass243_33;
			method15344(anInt1991, anInt1989 + anInt1996, anInt2001 + anInt1991, anInt1996, local58, local66, local31 + local58, local33 + local66);
			method15346(arg0, false, false, client.aBoolean732, true);
			arg0.method20744();
			Class374.aClass99_31 = arg0.method20743(local58, local66, local31, local33, true);
		}
		Class374.aClass99_31.method18225(local58, local66);
		@Pc(123) int local123 = Class290.anInt3947 * 1225644585 * local31 / anInt2001;
		@Pc(131) int local131 = local33 * -871755821 * Class278.anInt3927 / anInt1989;
		@Pc(141) int local141 = local58 + Class147_Sub2.anInt1485 * -1443658731 * local31 / anInt2001;
		@Pc(155) int local155 = local66 + local33 - local33 * 724794277 * Class469.anInt4956 / anInt1989 - local131;
		@Pc(157) int local157 = -1996554240;
		if (Class722.aClass722_6 == client.aClass722_4) {
			local157 = -1996488705;
		}
		arg0.method20722(local141, local155, local123, local131, local157, 1);
		arg0.method20818(local141, local155, local123, local131, local157, 0);
		for (@Pc(183) Class80_Sub18 local183 = (Class80_Sub18) aClass8_28.method247(129206984); local183 != null; local183 = (Class80_Sub18) aClass8_28.method237(-1826964319)) {
			@Pc(195) Class320 local195 = (Class320) aClass41_Sub13_4.method18054(local183.anInt1587 * 1945594581, -2125688875);
			if (Class508.method30530(local195, -1264573427)) {
				@Pc(209) Class200 local209 = (Class200) aHashMap4.get(local183.anInt1587 * 1945594581);
				if (local209 == null) {
					local209 = (Class200) aHashMap5.get(local195.anInt4061 * -1976811059);
				}
				if (local209 != null) {
					@Pc(247) int local247;
					if (local209.anInt3373 * -353644331 > anInt2024 * 1506340421 / 2) {
						local247 = (anInt2024 * 1864718011 - local209.anInt3373 * 15008811) / (anInt2024 * 1506340421);
					} else {
						local247 = local209.anInt3373 * 15008811 / (anInt2024 * 1506340421);
					}
					@Pc(268) int local268 = local31 * local183.anInt1582 * 652783051 / anInt2001 + local58;
					@Pc(281) int local281 = local66 + local33 * (anInt1989 - local183.anInt1584 * -1163867765) / anInt1989;
					arg0.method20716(local268 - 2, local281 - 2, 4, 4, local247 << 24 | 0xFFFF00, (byte) 20);
				}
			}
		}
		aClass243_33.method26247(5, (byte) 82);
	}

	@OriginalMember(owner = "client!alp", name = "eu", descriptor = "(Lclient!di;Lclient!dx;)V")
	static void method15442(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class235 arg1) {
		if (anInt2017 * 1776676847 == 100 || aClass80_Sub1_Sub12_3 == null) {
			return;
		}
		Class303.method27111((byte) 32);
		Class303.method27111((byte) 41);
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (anInt2017 * 1776676847 < 10) {
			for (local21 = 0; local21 < aClass104ArrayArray1.length; local21++) {
				for (local27 = 0; local27 < aClass104ArrayArray1[local21].length; local27++) {
					Class708.aClass480_136.method29945(aClass632_2.anIntArrayArray66[local21][local27], (byte) 1);
					Class569.aClass480_124.method29945(aClass632_2.anIntArrayArray66[local21][local27], (byte) 1);
				}
			}
			if (!aClass480_48.method29987(aClass80_Sub1_Sub12_3.aString108, -1675364333)) {
				anInt2017 = Class310.aClass480_93.method29942(aClass80_Sub1_Sub12_3.aString108, 1628198357) / 10 * -350806257;
				return;
			}
			anInt2017 = 786904726;
		}
		if (anInt2017 * 1776676847 == 10) {
			anInt1991 = aClass80_Sub1_Sub12_3.anInt3093 * 1171189611 >> 6 << 6;
			anInt1996 = aClass80_Sub1_Sub12_3.anInt3095 * -893056067 >> 6 << 6;
			anInt2001 = (aClass80_Sub1_Sub12_3.anInt3094 * -828099429 >> 6 << 6) - anInt1991 + 64;
			anInt1989 = (aClass80_Sub1_Sub12_3.anInt3096 * 1673061885 >> 6 << 6) - anInt1996 + 64;
			@Pc(128) int[] local128 = new int[3];
			local27 = -1;
			@Pc(132) int local132 = -1;
			@Pc(136) Class463 local136 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
			@Pc(140) Class626 local140 = client.aClass539_1.method30893((byte) -113);
			if (aClass80_Sub1_Sub12_3.method22596(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, ((int) local136.aFloat297 >> 9) + local140.anInt5540 * -390642507, ((int) local136.aFloat296 >> 9) + local140.anInt5537 * -894305615, local128, (byte) -19)) {
				local27 = local128[1] - anInt1991;
				local132 = local128[2] - anInt1996;
			}
			if (!aBoolean403 && local27 >= 0 && local27 < anInt2001 && local132 >= 0 && local132 < anInt1989) {
				local27 += (int) (Math.random() * 10.0D) - 5;
				local132 += (int) (Math.random() * 10.0D) - 5;
				anInt2026 = local27 * 1633656115;
				Class158.anInt2029 = local132 * -1296666553;
			} else if (anInt2021 * 1564922793 == -1 || anInt2025 * 626388537 == -1) {
				aClass80_Sub1_Sub12_3.method22595(aClass80_Sub1_Sub12_3.anInt3089 * -1734311989 >> 14 & 0x3FFF, aClass80_Sub1_Sub12_3.anInt3089 * -1734311989 & 0x3FFF, local128, 814808779);
				anInt2026 = (local128[1] - anInt1991) * 1633656115;
				Class158.anInt2029 = (local128[2] - anInt1996) * -1296666553;
			} else {
				aClass80_Sub1_Sub12_3.method22595(anInt2021 * 1564922793, anInt2025 * 626388537, local128, -1235915852);
				if (local128 != null) {
					anInt2026 = (local128[1] - anInt1991) * 1633656115;
					Class158.anInt2029 = (local128[2] - anInt1996) * -1296666553;
				}
				anInt2025 = -869244937;
				anInt2021 = 427851623;
				aBoolean403 = false;
			}
			if (aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 25) {
				aFloat151 = 2.0F;
				aFloat150 = 2.0F;
			} else if (aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 37) {
				aFloat151 = 3.0F;
				aFloat150 = 3.0F;
			} else if (aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 50) {
				aFloat151 = 4.0F;
				aFloat150 = 4.0F;
			} else if (aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 75) {
				aFloat151 = 6.0F;
				aFloat150 = 6.0F;
			} else if (aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 100) {
				aFloat151 = 8.0F;
				aFloat150 = 8.0F;
			} else if (aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 200) {
				aFloat151 = 16.0F;
				aFloat150 = 16.0F;
			} else {
				aFloat151 = 8.0F;
				aFloat150 = 8.0F;
			}
			anInt1986 = (int) aFloat150 >> 1;
			aByteArrayArrayArray11 = Class121.method9718(anInt1986, 480881339);
			Class156.method15158(-1979674789);
			method15334();
			Class391.aClass8_53 = new Class8();
			anInt1998 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1998 < -8) {
				anInt1998 = -8;
			}
			if (anInt1998 > 8) {
				anInt1998 = 8;
			}
			anInt1990 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1990 < -16) {
				anInt1990 = -16;
			}
			if (anInt1990 > 16) {
				anInt1990 = 16;
			}
			method15396(arg1, anInt1998 >> 2 << 10, anInt1990 >> 1);
			aClass41_Sub13_4.method17572(1024, 256, 1750240370);
			aClass41_Sub12_2.method17547(256, 256, -1593629711);
			aClass41_Sub3_8.method17927(4096, (short) 16561);
			Class664.aClass41_Sub17_2.method17927(256, (short) 26574);
			anInt2017 = 1573809452;
		} else if (anInt2017 * 1776676847 == 20) {
			if (!aBoolean398) {
				Class249.method26348(true, 1110907610);
				method15332(arg0, anInt1998, anInt1990, aBoolean398);
				anInt2017 = 426461060;
				Class249.method26348(true, -128724448);
				Class554.method25310(1986877070);
			} else if (method15332(arg0, anInt1998, anInt1990, aBoolean398)) {
				anInt2017 = 426461060;
			}
		} else if (anInt2017 * 1776676847 == 60) {
			if (aClass480_48.method29972(aClass80_Sub1_Sub12_3.aString108, -1996067490)) {
				if (!aClass480_48.method29987(aClass80_Sub1_Sub12_3.aString108, 804069506)) {
					return;
				}
				aClass587_2 = Class498.method30359(aClass480_48, aClass80_Sub1_Sub12_3.aString108, client.aBoolean732, (byte) -14);
			} else {
				aClass587_2 = new Class587(0);
			}
			method15348();
			anInt2017 = 1213365786;
			Class249.method26348(true, -132854380);
			Class554.method25310(1986877070);
		} else if (anInt2017 * 1776676847 >= 70) {
			local21 = 0;
			while (true) {
				if (local21 >= 3) {
					anInt2017 = -720887332;
					System.gc();
					break;
				}
				for (local27 = 0; local27 < 5; local27++) {
					if (aClass104ArrayArray1[local21][local27] == null || aClass15ArrayArray1[local21][local27] == null) {
						aClass104ArrayArray1[local21][local27] = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, aClass632_2.anIntArrayArray66[local21][local27], true, true, 1302088921);
						aClass15ArrayArray1[local21][local27] = Class317.aClass464_1.method29594(client.anInterface49_1, aClass632_2.anIntArrayArray66[local21][local27], (byte) 1);
						if (aClass104ArrayArray1[local21][local27] == null || aClass15ArrayArray1[local21][local27] == null) {
							return;
						}
						anInt2017 += -1052418771;
					}
				}
				local21++;
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "gs", descriptor = "(III)I")
	public static int method15443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (anInt2017 * 1776676847 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - anInt1991;
		@Pc(18) int local18 = arg2 - anInt1996;
		for (@Pc(23) Class80_Sub18 local23 = (Class80_Sub18) aClass8_28.method247(129206984); local23 != null; local23 = (Class80_Sub18) aClass8_28.method237(-2011554049)) {
			if (arg0 == local23.anInt1587 * 1945594581) {
				@Pc(37) int local37 = local23.anInt1582 * 652783051;
				@Pc(42) int local42 = local23.anInt1584 * -1163867765;
				@Pc(52) int local52 = anInt1991 + local37 << 14 | local42 + anInt1996;
				@Pc(68) int local68 = (local18 - local42) * (local18 - local42) + (local14 - local37) * (local14 - local37);
				if (local8 < 0 || local68 < local10) {
					local8 = local52;
					local10 = local68;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!alp", name = "er", descriptor = "()V")
	static void method15444() {
		if (anInt2026 * 2002101755 < 0) {
			anInt2026 = 0;
			anInt2018 = -1806870975;
			anInt2019 = -387547399;
		}
		if (anInt2026 * 2002101755 > anInt2001) {
			anInt2026 = anInt2001 * 1633656115;
			anInt2018 = -1806870975;
			anInt2019 = -387547399;
		}
		if (Class158.anInt2029 * 2067675511 < 0) {
			Class158.anInt2029 = 0;
			anInt2018 = -1806870975;
			anInt2019 = -387547399;
		}
		if (Class158.anInt2029 * 2067675511 > anInt1989) {
			Class158.anInt2029 = anInt1989 * -1296666553;
			anInt2018 = -1806870975;
			anInt2019 = -387547399;
		}
	}

	@OriginalMember(owner = "client!alp", name = "en", descriptor = "()V")
	static void method15445() {
		Class443.method29216(1849682103);
		aClass80_Sub1_Sub12_3 = null;
		Class103_Sub8.aClass80_Sub1_Sub12_1 = null;
		aClass24_15.method564(-1050472220);
		aClass24_16.method564(-56922600);
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass104ArrayArray1[local13][local18] = null;
				aClass15ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "ex", descriptor = "()V")
	static void method15446() {
		Class443.method29216(-156123954);
		aClass80_Sub1_Sub12_3 = null;
		Class103_Sub8.aClass80_Sub1_Sub12_1 = null;
		aClass24_15.method564(-291797941);
		aClass24_16.method564(692155856);
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass104ArrayArray1[local13][local18] = null;
				aClass15ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "fb", descriptor = "(III)V")
	static void method15447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1008) {
			Class107.method7196(Class158.aClass158_59, arg1, arg2, -1939653960);
		} else if (arg0 == 1009) {
			Class107.method7196(Class158.aClass158_48, arg1, arg2, 1347374301);
		} else if (arg0 == 1010) {
			Class107.method7196(Class158.aClass158_62, arg1, arg2, 1001684490);
		} else if (arg0 == 1011) {
			Class107.method7196(Class158.aClass158_50, arg1, arg2, 392834885);
		} else if (arg0 == 1012) {
			Class107.method7196(Class158.aClass158_68, arg1, arg2, -1236129100);
		}
	}

	@OriginalMember(owner = "client!alp", name = "gu", descriptor = "(I)V")
	public static void method15448(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt2023 = anInt2013 * -37559507;
		} else {
			anInt2023 = arg0 * -105631365;
		}
	}

	@OriginalMember(owner = "client!alp", name = "fp", descriptor = "(Lclient!di;Lclient!akh;Lclient!ho;II)Z")
	static boolean method15449(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub18 arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (aBoolean399 && !client.aBoolean732 && !method15337(arg1.anInt1582 * 652783051, arg1.anInt1584 * -1163867765)) {
			return false;
		}
		if (arg2.anIntArray389 != null) {
			arg2 = arg2.method27550(anInterface21_2, anInterface24_2, -150544479);
			if (arg2 == null) {
				return false;
			}
		}
		@Pc(32) int local32 = Integer.MAX_VALUE;
		@Pc(34) int local34 = Integer.MIN_VALUE;
		@Pc(36) int local36 = Integer.MAX_VALUE;
		@Pc(38) int local38 = Integer.MIN_VALUE;
		if (arg2.anIntArray390 != null) {
			local32 = anInt2007 + (anInt2009 - anInt2007) * (arg2.anInt4050 * 360284357 + arg1.anInt1582 * 652783051 - anInt2003) / (anInt2005 - anInt2003);
			local34 = (arg2.anInt4052 * 649510463 + arg1.anInt1582 * 652783051 - anInt2003) * (anInt2009 - anInt2007) / (anInt2005 - anInt2003) + anInt2007;
			local38 = anInt2010 - (arg2.anInt4051 * 1996000583 + arg1.anInt1584 * -1163867765 - anInt2006) * (anInt2010 - anInt2008) / (anInt2004 - anInt2006);
			local36 = anInt2010 - (arg2.anInt4053 * -987728585 + arg1.anInt1584 * -1163867765 - anInt2006) * (anInt2010 - anInt2008) / (anInt2004 - anInt2006);
		}
		@Pc(131) Class99 local131 = null;
		@Pc(133) int local133 = 0;
		@Pc(135) int local135 = 0;
		@Pc(137) int local137 = 0;
		@Pc(139) int local139 = 0;
		if (arg2.anInt4037 * 1279732247 != -1) {
			if (arg1.aBoolean364 && arg2.anInt4033 * 888152267 != -1) {
				local131 = arg2.method27545(arg0, true, 958083320);
			} else {
				local131 = arg2.method27545(arg0, false, 1039937075);
			}
			if (local131 != null) {
				switch(arg2.aClass313_4.anInt4019 * -1120202439) {
					case 0:
						local133 = arg1.anInt1585 * -1472438265;
						local135 = arg1.anInt1585 * -1472438265 + local131.method18214();
						break;
					case 1:
						local133 = arg1.anInt1585 * -1472438265 - local131.method18214();
						local135 = arg1.anInt1585 * -1472438265;
						break;
					case 2:
						local133 = arg1.anInt1585 * -1472438265 - (local131.method18214() + 1 >> 1);
						local135 = arg1.anInt1585 * -1472438265 + (local131.method18214() + 1 >> 1);
				}
				switch(arg2.aClass309_4.anInt4011 * -2069042521) {
					case 0:
						local137 = arg1.anInt1586 * -1587456111 - local131.method18288();
						local139 = arg1.anInt1586 * -1587456111;
						break;
					case 1:
						local137 = arg1.anInt1586 * -1587456111;
						local139 = arg1.anInt1586 * -1587456111 + local131.method18288();
						break;
					case 2:
						local137 = arg1.anInt1586 * -1587456111 - (local131.method18288() + 1 >> 1);
						local139 = arg1.anInt1586 * -1587456111 + (local131.method18288() + 1 >> 1);
				}
				if (local133 < local32) {
					local32 = local133;
				}
				if (local135 > local34) {
					local34 = local135;
				}
				if (local137 < local36) {
					local36 = local137;
				}
				if (local139 > local38) {
					local38 = local139;
				}
			}
		}
		@Pc(307) Class99 local307 = null;
		if (arg2.anInt4044 * 771633001 != -1) {
			local307 = arg2.method27546(arg0, -806030793);
		}
		@Pc(320) int local320 = 0;
		@Pc(322) int local322 = 0;
		@Pc(324) int local324 = 0;
		@Pc(326) int local326 = 0;
		@Pc(328) int local328 = 0;
		@Pc(330) int local330 = 0;
		@Pc(332) int local332 = 0;
		@Pc(334) int local334 = 0;
		if (arg2.aString178 != null) {
			Class309.method27453(arg2.anInt4031 * -618572023, (byte) -44);
			if (Class165_Sub38.aClass104_12 != null) {
				local334 = Class461.aClass15_10.method380(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, 0, null, (byte) -100);
				local324 = Class461.aClass15_10.method377(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, null, -648079179);
				local320 = arg1.anInt1585 * -1472438265 - local324 / 2 + (anInt2009 - anInt2007) * arg2.anInt4057 * -258009849 / (anInt2005 - anInt2003);
				local322 = arg1.anInt1586 * -1587456111 - arg2.anInt4058 * -694647429 * (anInt2010 - anInt2008) / (anInt2004 - anInt2006);
				if (local131 == null) {
					local322 -= local334 / 2;
				} else {
					local322 -= (local131.method18288() >> 1) + local334;
				}
				local326 = arg3 + local320;
				if (local326 < local32) {
					local32 = local326;
				}
				local328 = local324 + local320 + arg3;
				if (local328 > local34) {
					local34 = local328;
				}
				local330 = arg4 + local322;
				if (local330 < local36) {
					local36 = local330;
				}
				local332 = local334 + local322 + arg4;
				if (local332 > local38) {
					local38 = local332;
				}
			}
		}
		if (local34 < anInt2007 || local32 > anInt2009 || local38 < anInt2008 || local36 > anInt2010) {
			return true;
		}
		method15360(arg0, arg1, arg2);
		if (local131 != null) {
			@Pc(489) int local489 = 0;
			@Pc(491) int local491 = 0;
			@Pc(493) int local493 = 0;
			@Pc(495) int local495 = 0;
			@Pc(497) int local497 = 0;
			@Pc(499) int local499 = 0;
			switch(arg2.aClass313_4.anInt4019 * -1120202439) {
				case 0:
					local491 = -(local131.method18218() + 1) / 2;
					break;
				case 1:
					local489 = local131.method18218();
					local491 = (local131.method18218() + 1) / 2;
					local493 = local131.method18214();
					break;
				case 2:
					local489 = local131.method18218() / 2;
					local493 = local131.method18214() >> 1;
			}
			switch(arg2.aClass309_4.anInt4011 * -2069042521) {
				case 0:
					local495 = local131.method18218();
					local497 = (local131.method18218() + 1) / 2;
					local499 = local131.method18288();
					break;
				case 1:
					local497 = -(local131.method18218() + 1) / 2;
					break;
				case 2:
					local495 = local131.method18218() / 2;
					local499 = local131.method18288() >> 1;
			}
			@Pc(586) Class200 local586 = (Class200) aHashMap4.get(arg1.anInt1587 * 1945594581);
			if (local586 == null) {
				local586 = (Class200) aHashMap5.get(arg2.anInt4061 * -1976811059);
			}
			@Pc(630) int local630;
			@Pc(646) int local646;
			if (local586 != null && arg2.anInt4044 * 771633001 == -1) {
				if (local586.anInt3373 * -353644331 > anInt2024 * 1506340421 / 2) {
					local630 = (anInt2024 * 1864718011 - local586.anInt3373 * 15008811) / (anInt2024 * 1506340421);
				} else {
					local630 = local586.anInt3373 * 15008811 / (anInt2024 * 1506340421);
				}
				local646 = local630 << 24 | 0xFFFF00;
				if (arg0 instanceof Class102_Sub1) {
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489 - 7, arg1.anInt1586 * -1587456111 - local495 - 7, local131.method18218() + 14, local131.method18218() + 14, local646, (byte) 101);
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489 - 5, arg1.anInt1586 * -1587456111 - local495 - 5, local131.method18218() + 10, local131.method18218() + 10, local646, (byte) 98);
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489 - 3, arg1.anInt1586 * -1587456111 - local495 - 3, local131.method18218() + 6, local131.method18218() + 6, local646, (byte) 73);
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489 - 1, arg1.anInt1586 * -1587456111 - local495 - 1, local131.method18218() + 2, local131.method18218() + 2, local646, (byte) 114);
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489, arg1.anInt1586 * -1587456111 - local495, local131.method18218(), local131.method18218(), local646, (byte) 72);
				} else {
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497, local131.method18218() / 2 + 7, local646, 1980121201);
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497 - local497 == 0 ? 0 : 1, local131.method18218() / 2 + 5, local646, 317767921);
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497 - local497 == 0 ? 0 : 1, local131.method18218() / 2 + 3, local646, 1357730085);
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497 - local497 == 0 ? 0 : 1, local131.method18218() / 2 + 1, local646, 2035141260);
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497 - local497 == 0 ? 0 : 1, local131.method18218() / 2, local646, 1163515693);
				}
			}
			local131.method18225(arg1.anInt1585 * -1472438265 - local493, arg1.anInt1586 * -1587456111 - local499);
			local630 = 0;
			local646 = 0;
			if (local586 != null && local307 != null) {
				switch(arg2.aClass313_4.anInt4019 * -1120202439) {
					case 0:
						local630 = local307.method18214();
					case 1:
					default:
						break;
					case 2:
						local630 = local307.method18214() >> 1;
				}
				switch(arg2.aClass309_4.anInt4011 * -2069042521) {
					case 0:
						local646 = (local307.method18288() + local131.method18288()) / 2;
					case 1:
					default:
						break;
					case 2:
						local646 = (local307.method18288() / 2 + local131.method18288()) / 2;
				}
				@Pc(1004) int local1004;
				if (local586.anInt3373 * -353644331 > anInt2024 * 1506340421 / 2) {
					local1004 = (anInt2024 * 1864718011 - local586.anInt3373 * 15008811) / (anInt2024 * 1506340421);
				} else {
					local1004 = local586.anInt3373 * 15008811 / (anInt2024 * 1506340421);
				}
				@Pc(1020) int local1020 = local1004 << 24 | 0xFFFF00;
				local307.method18226(arg1.anInt1585 * -1472438265 - local630, arg1.anInt1586 * -1587456111 - local646, 0, local1020, 1);
			}
		}
		if (arg2.aString178 != null && Class165_Sub38.aClass104_12 != null) {
			Class483.method30030(arg0, arg1, arg2, local320, local322, local334, local324, 1670362028);
		}
		if (arg2.anInt4037 * 1279732247 != -1 || arg2.aString178 != null) {
			@Pc(1067) Class80_Sub7 local1067 = new Class80_Sub7(arg1);
			local1067.anInt1461 = local133 * 2001422441;
			local1067.anInt1463 = local135 * 1696076311;
			local1067.anInt1462 = local137 * 659963847;
			local1067.anInt1466 = local139 * -1022717471;
			local1067.anInt1468 = local326 * -602033181;
			local1067.anInt1465 = local328 * -802024881;
			local1067.anInt1464 = local330 * -1946152893;
			local1067.anInt1467 = local332 * 1617663591;
			Class391.aClass8_53.method232(local1067, 944419936);
		}
		return false;
	}

	@OriginalMember(owner = "client!alp", name = "ej", descriptor = "(Lclient!di;Lclient!aag;II)V")
	static void method15450(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class391.aClass8_53.method260(-550653786);
		if (aBoolean406) {
			return;
		}
		for (@Pc(10) Class80_Sub18 local10 = (Class80_Sub18) arg1.method247(129206984); local10 != null; local10 = (Class80_Sub18) arg1.method237(643342897)) {
			@Pc(21) Class320 local21 = (Class320) aClass41_Sub13_4.method18054(local10.anInt1587 * 1945594581, -1320543076);
			if (Class508.method30530(local21, 649488626)) {
				@Pc(34) boolean local34 = Class89.method1806(arg0, local10, local21, arg2, arg3, 2078957455);
				if (local34) {
					Class236.method26134(arg0, local10, local21, 1426543389);
				}
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "eq", descriptor = "(Lclient!di;Lclient!aag;II)V")
	static void method15451(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class391.aClass8_53.method260(742506943);
		if (aBoolean406) {
			return;
		}
		for (@Pc(10) Class80_Sub18 local10 = (Class80_Sub18) arg1.method247(129206984); local10 != null; local10 = (Class80_Sub18) arg1.method237(-505927870)) {
			@Pc(21) Class320 local21 = (Class320) aClass41_Sub13_4.method18054(local10.anInt1587 * 1945594581, -1891447478);
			if (Class508.method30530(local21, 950571383)) {
				@Pc(34) boolean local34 = Class89.method1806(arg0, local10, local21, arg2, arg3, 2041006020);
				if (local34) {
					Class236.method26134(arg0, local10, local21, 670446847);
				}
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "fe", descriptor = "(Lclient!di;Lclient!aag;II)V")
	static void method15452(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class391.aClass8_53.method260(173755867);
		if (aBoolean406) {
			return;
		}
		for (@Pc(10) Class80_Sub18 local10 = (Class80_Sub18) arg1.method247(129206984); local10 != null; local10 = (Class80_Sub18) arg1.method237(-685632701)) {
			@Pc(21) Class320 local21 = (Class320) aClass41_Sub13_4.method18054(local10.anInt1587 * 1945594581, -1475014498);
			if (Class508.method30530(local21, -272010084)) {
				@Pc(34) boolean local34 = Class89.method1806(arg0, local10, local21, arg2, arg3, 2135436880);
				if (local34) {
					Class236.method26134(arg0, local10, local21, -40740342);
				}
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "hk", descriptor = "(II)V")
	public static void method15453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2026 = (arg0 - anInt1991) * 1633656115;
		Class158.anInt2029 = (arg1 - anInt1996) * -1296666553;
		anInt2018 = -1806870975;
		anInt2019 = -387547399;
		Class156.method15158(1137433534);
	}

	@OriginalMember(owner = "client!alp", name = "hw", descriptor = "(II)V")
	public static void method15454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2026 = (arg0 - anInt1991) * 1633656115;
		Class158.anInt2029 = (arg1 - anInt1996) * -1296666553;
		anInt2018 = -1806870975;
		anInt2019 = -387547399;
		Class156.method15158(1376850983);
	}

	@OriginalMember(owner = "client!alp", name = "gz", descriptor = "(I)V")
	static void method15455(@OriginalArg(0) int arg0) {
		anInt2026 = arg0 * 1633656115;
		anInt2018 = -1806870975;
		anInt2019 = -387547399;
		Class156.method15158(-71479493);
	}

	@OriginalMember(owner = "client!alp", name = "fx", descriptor = "(Lclient!di;Lclient!akh;Lclient!ho;)V")
	static void method15456(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub18 arg1, @OriginalArg(2) Class320 arg2) {
		@Pc(4) Class99 local4 = arg2.method27557(arg0, -1439897055);
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
			local33 = Class461.aClass15_10.method380(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, 0, null, (byte) -79);
			local31 = Class461.aClass15_10.method377(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, null, -1540327746);
		}
		@Pc(66) int local66 = local10 / 2 + arg1.anInt1585 * -1472438265;
		@Pc(71) int local71 = arg1.anInt1586 * -1587456111;
		if (local24 < local10 + anInt2007) {
			local24 = anInt2007;
			local66 = local31 / 2 + 5 + local10 / 2 + anInt2007 + local19;
		} else if (local24 > anInt2009 - local10) {
			local24 = anInt2009 - local10;
			local66 = anInt2009 - local10 / 2 - local19 - local31 / 2 - 5;
		}
		if (local29 < anInt2008 + local10) {
			local29 = anInt2008;
			local71 = local10 / 2 + anInt2008 + local19;
		} else if (local29 > anInt2010 - local10) {
			local29 = anInt2010 - local10;
			local71 = anInt2010 - local10 / 2 - local19 - local33;
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
				arg0.method20716(local194, local71, local198 - local194, local200 - local71, arg2.anInt4040 * 861398173, (byte) 55);
			}
			if (arg2.anInt4041 * 1350573417 != 0) {
				arg0.method20715(local194, local71, local198 - local194, local200 - local71, arg2.anInt4041 * 1350573417, -1068342187);
			}
			Class165_Sub38.aClass104_12.method7631(arg2.aString178, local66, local71, local31, local33, -791504431 * arg2.anInt4032 | 0xFF000000, aClass632_2.anInt5581 * 2032438309, 1, 0, 0, null, null, null, 0, 0, (byte) 0);
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
		Class391.aClass8_53.method232(local309, 425464343);
	}

	@OriginalMember(owner = "client!alp", name = "fj", descriptor = "(Lclient!di;Lclient!akh;Lclient!ho;)V")
	static void method15457(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub18 arg1, @OriginalArg(2) Class320 arg2) {
		@Pc(4) Class99 local4 = arg2.method27557(arg0, -1925351450);
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
			local33 = Class461.aClass15_10.method380(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, 0, null, (byte) 2);
			local31 = Class461.aClass15_10.method377(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, null, 1995482924);
		}
		@Pc(66) int local66 = local10 / 2 + arg1.anInt1585 * -1472438265;
		@Pc(71) int local71 = arg1.anInt1586 * -1587456111;
		if (local24 < local10 + anInt2007) {
			local24 = anInt2007;
			local66 = local31 / 2 + 5 + local10 / 2 + anInt2007 + local19;
		} else if (local24 > anInt2009 - local10) {
			local24 = anInt2009 - local10;
			local66 = anInt2009 - local10 / 2 - local19 - local31 / 2 - 5;
		}
		if (local29 < anInt2008 + local10) {
			local29 = anInt2008;
			local71 = local10 / 2 + anInt2008 + local19;
		} else if (local29 > anInt2010 - local10) {
			local29 = anInt2010 - local10;
			local71 = anInt2010 - local10 / 2 - local19 - local33;
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
				arg0.method20716(local194, local71, local198 - local194, local200 - local71, arg2.anInt4040 * 861398173, (byte) 74);
			}
			if (arg2.anInt4041 * 1350573417 != 0) {
				arg0.method20715(local194, local71, local198 - local194, local200 - local71, arg2.anInt4041 * 1350573417, -1068342187);
			}
			Class165_Sub38.aClass104_12.method7631(arg2.aString178, local66, local71, local31, local33, -791504431 * arg2.anInt4032 | 0xFF000000, aClass632_2.anInt5581 * 2032438309, 1, 0, 0, null, null, null, 0, 0, (byte) 0);
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
		Class391.aClass8_53.method232(local309, 1269632969);
	}

	@OriginalMember(owner = "client!alp", name = "fq", descriptor = "(I)V")
	static void method15458(@OriginalArg(0) int arg0) {
		@Pc(4) byte local4;
		if (arg0 == 0) {
			local4 = 0;
		} else if (arg0 == 1) {
			local4 = 1;
		} else if (arg0 == 2) {
			local4 = 2;
		} else {
			return;
		}
		@Pc(25) byte local25;
		if ((double) aFloat150 == 2.0D) {
			local25 = 0;
		} else if ((double) aFloat150 == 3.0D) {
			local25 = 1;
		} else if ((double) aFloat150 == 4.0D) {
			local25 = 2;
		} else if ((double) aFloat150 == 6.0D) {
			local25 = 3;
		} else if ((double) aFloat150 >= 8.0D) {
			local25 = 4;
		} else {
			return;
		}
		Class165_Sub38.aClass104_12 = aClass104ArrayArray1[local4][local25];
		Class461.aClass15_10 = aClass15ArrayArray1[local4][local25];
	}

	@OriginalMember(owner = "client!alp", name = "fk", descriptor = "(I)V")
	static void method15459(@OriginalArg(0) int arg0) {
		@Pc(4) byte local4;
		if (arg0 == 0) {
			local4 = 0;
		} else if (arg0 == 1) {
			local4 = 1;
		} else if (arg0 == 2) {
			local4 = 2;
		} else {
			return;
		}
		@Pc(25) byte local25;
		if ((double) aFloat150 == 2.0D) {
			local25 = 0;
		} else if ((double) aFloat150 == 3.0D) {
			local25 = 1;
		} else if ((double) aFloat150 == 4.0D) {
			local25 = 2;
		} else if ((double) aFloat150 == 6.0D) {
			local25 = 3;
		} else if ((double) aFloat150 >= 8.0D) {
			local25 = 4;
		} else {
			return;
		}
		Class165_Sub38.aClass104_12 = aClass104ArrayArray1[local4][local25];
		Class461.aClass15_10 = aClass15ArrayArray1[local4][local25];
	}

	@OriginalMember(owner = "client!alp", name = "fv", descriptor = "(Lclient!ho;)Z")
	static boolean method15460(@OriginalArg(0) Class320 arg0) {
		if (arg0 == null) {
			return false;
		}
		if (arg0.anIntArray389 != null) {
			arg0 = arg0.method27550(anInterface21_2, anInterface24_2, 2070221609);
			if (arg0 == null) {
				return false;
			}
		}
		if (!arg0.aBoolean795) {
			return false;
		} else if (!arg0.method27544(anInterface21_2, anInterface24_2, -2071713777)) {
			return false;
		} else if (aClass24_15.method560((long) (arg0.anInt4055 * 445805997)) != null) {
			return false;
		} else if (aClass24_16.method560((long) (arg0.anInt4061 * -1976811059)) == null) {
			if (arg0.aString178 != null) {
				if (arg0.anInt4031 * -618572023 == 0 && aBoolean401) {
					return false;
				}
				if (arg0.anInt4031 * -618572023 == 1 && aBoolean407) {
					return false;
				}
				if (arg0.anInt4031 * -618572023 == 2 && aBoolean408) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!alp", name = "fz", descriptor = "(Lclient!di;IIII)V")
	static void method15461(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20986(arg1, arg2, arg1 + arg3, arg4 + arg2);
		arg0.method20716(arg1, arg2, arg3, arg4, -16777216, (byte) 55);
		if (anInt2017 * 1776676847 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) anInt1989 / (float) anInt2001;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) (local29 * (float) arg3);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class374.aClass99_31 == null || Class374.aClass99_31.method18218() != local31 || Class374.aClass99_31.method18219() != local33) {
			aClass243_34 = aClass243_33;
			method15344(anInt1991, anInt1989 + anInt1996, anInt2001 + anInt1991, anInt1996, local58, local66, local31 + local58, local33 + local66);
			method15346(arg0, false, false, client.aBoolean732, true);
			arg0.method20744();
			Class374.aClass99_31 = arg0.method20743(local58, local66, local31, local33, true);
		}
		Class374.aClass99_31.method18225(local58, local66);
		@Pc(123) int local123 = Class290.anInt3947 * 1225644585 * local31 / anInt2001;
		@Pc(131) int local131 = local33 * -871755821 * Class278.anInt3927 / anInt1989;
		@Pc(141) int local141 = local58 + Class147_Sub2.anInt1485 * -1443658731 * local31 / anInt2001;
		@Pc(155) int local155 = local66 + local33 - local33 * 724794277 * Class469.anInt4956 / anInt1989 - local131;
		@Pc(157) int local157 = -1996554240;
		if (Class722.aClass722_6 == client.aClass722_4) {
			local157 = -1996488705;
		}
		arg0.method20722(local141, local155, local123, local131, local157, 1);
		arg0.method20818(local141, local155, local123, local131, local157, 0);
		for (@Pc(183) Class80_Sub18 local183 = (Class80_Sub18) aClass8_28.method247(129206984); local183 != null; local183 = (Class80_Sub18) aClass8_28.method237(-1850203288)) {
			@Pc(195) Class320 local195 = (Class320) aClass41_Sub13_4.method18054(local183.anInt1587 * 1945594581, -1841049215);
			if (Class508.method30530(local195, -514306481)) {
				@Pc(209) Class200 local209 = (Class200) aHashMap4.get(local183.anInt1587 * 1945594581);
				if (local209 == null) {
					local209 = (Class200) aHashMap5.get(local195.anInt4061 * -1976811059);
				}
				if (local209 != null) {
					@Pc(247) int local247;
					if (local209.anInt3373 * -353644331 > anInt2024 * 1506340421 / 2) {
						local247 = (anInt2024 * 1864718011 - local209.anInt3373 * 15008811) / (anInt2024 * 1506340421);
					} else {
						local247 = local209.anInt3373 * 15008811 / (anInt2024 * 1506340421);
					}
					@Pc(268) int local268 = local31 * local183.anInt1582 * 652783051 / anInt2001 + local58;
					@Pc(281) int local281 = local66 + local33 * (anInt1989 - local183.anInt1584 * -1163867765) / anInt1989;
					arg0.method20716(local268 - 2, local281 - 2, 4, 4, local247 << 24 | 0xFFFF00, (byte) 118);
				}
			}
		}
		aClass243_33.method26247(5, (byte) 29);
	}

	@OriginalMember(owner = "client!alp", name = "fn", descriptor = "(Lclient!di;IIII)V")
	static void method15462(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20986(arg1, arg2, arg1 + arg3, arg4 + arg2);
		arg0.method20716(arg1, arg2, arg3, arg4, -16777216, (byte) 26);
		if (anInt2017 * 1776676847 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) anInt1989 / (float) anInt2001;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) (local29 * (float) arg3);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class374.aClass99_31 == null || Class374.aClass99_31.method18218() != local31 || Class374.aClass99_31.method18219() != local33) {
			aClass243_34 = aClass243_33;
			method15344(anInt1991, anInt1989 + anInt1996, anInt2001 + anInt1991, anInt1996, local58, local66, local31 + local58, local33 + local66);
			method15346(arg0, false, false, client.aBoolean732, true);
			arg0.method20744();
			Class374.aClass99_31 = arg0.method20743(local58, local66, local31, local33, true);
		}
		Class374.aClass99_31.method18225(local58, local66);
		@Pc(123) int local123 = Class290.anInt3947 * 1225644585 * local31 / anInt2001;
		@Pc(131) int local131 = local33 * -871755821 * Class278.anInt3927 / anInt1989;
		@Pc(141) int local141 = local58 + Class147_Sub2.anInt1485 * -1443658731 * local31 / anInt2001;
		@Pc(155) int local155 = local66 + local33 - local33 * 724794277 * Class469.anInt4956 / anInt1989 - local131;
		@Pc(157) int local157 = -1996554240;
		if (Class722.aClass722_6 == client.aClass722_4) {
			local157 = -1996488705;
		}
		arg0.method20722(local141, local155, local123, local131, local157, 1);
		arg0.method20818(local141, local155, local123, local131, local157, 0);
		for (@Pc(183) Class80_Sub18 local183 = (Class80_Sub18) aClass8_28.method247(129206984); local183 != null; local183 = (Class80_Sub18) aClass8_28.method237(-29678523)) {
			@Pc(195) Class320 local195 = (Class320) aClass41_Sub13_4.method18054(local183.anInt1587 * 1945594581, -1104577556);
			if (Class508.method30530(local195, 1387297117)) {
				@Pc(209) Class200 local209 = (Class200) aHashMap4.get(local183.anInt1587 * 1945594581);
				if (local209 == null) {
					local209 = (Class200) aHashMap5.get(local195.anInt4061 * -1976811059);
				}
				if (local209 != null) {
					@Pc(247) int local247;
					if (local209.anInt3373 * -353644331 > anInt2024 * 1506340421 / 2) {
						local247 = (anInt2024 * 1864718011 - local209.anInt3373 * 15008811) / (anInt2024 * 1506340421);
					} else {
						local247 = local209.anInt3373 * 15008811 / (anInt2024 * 1506340421);
					}
					@Pc(268) int local268 = local31 * local183.anInt1582 * 652783051 / anInt2001 + local58;
					@Pc(281) int local281 = local66 + local33 * (anInt1989 - local183.anInt1584 * -1163867765) / anInt1989;
					arg0.method20716(local268 - 2, local281 - 2, 4, 4, local247 << 24 | 0xFFFF00, (byte) 57);
				}
			}
		}
		aClass243_33.method26247(5, (byte) 56);
	}

	@OriginalMember(owner = "client!alp", name = "fc", descriptor = "(IIIZ)V")
	public static void method15463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class80_Sub1_Sub12 local1 = aClass80_Sub1_Sub12_3;
		method15336(arg0);
		aBoolean398 = false;
		if (local1 != aClass80_Sub1_Sub12_3) {
			Class443.method29216(-1032287068);
		}
		anInt2021 = arg1 * -427851623;
		anInt2025 = arg2 * 869244937;
		aBoolean403 = arg3;
	}

	@OriginalMember(owner = "client!alp", name = "go", descriptor = "(I)V")
	public static void method15464(@OriginalArg(0) int arg0) {
		@Pc(5) Class200 local5 = (Class200) aHashMap5.get(arg0);
		if (local5 == null) {
			local5 = new Class200();
		}
		local5.anInt3372 = anInt2023 * 1354234379;
		local5.anInt3373 = anInt2024 * -2071666767;
		aHashMap5.put(arg0, local5);
	}

	@OriginalMember(owner = "client!alp", name = "fo", descriptor = "(II)V")
	static void method15465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat151 < aFloat150) {
			aFloat151 = (float) ((double) aFloat151 + (double) aFloat151 / 30.0D);
			if (aFloat151 > aFloat150) {
				aFloat151 = aFloat150;
			}
			Class156.method15158(1860421577);
			anInt1986 = (int) aFloat150 >> 1;
			aByteArrayArrayArray11 = Class121.method9718(anInt1986, -273971442);
		} else if (aFloat151 > aFloat150) {
			aFloat151 = (float) ((double) aFloat151 - (double) aFloat151 / 30.0D);
			if (aFloat151 < aFloat150) {
				aFloat151 = aFloat150;
			}
			Class156.method15158(688057270);
			anInt1986 = (int) aFloat150 >> 1;
			aByteArrayArrayArray11 = Class121.method9718(anInt1986, 737204959);
		}
		if (anInt2018 * -1226684865 != -1 && anInt2019 * 370678967 != -1) {
			@Pc(78) int local78 = anInt2018 * -1226684865 - anInt2026 * 2002101755;
			if (local78 != 0) {
				local78 /= Math.min(anInt2015 * -1766595015, Math.abs(local78));
			}
			@Pc(98) int local98 = anInt2019 * 370678967 - Class158.anInt2029 * 2067675511;
			if (local98 != 0) {
				local98 /= Math.min(anInt2015 * -1766595015, Math.abs(local98));
			}
			anInt2026 = (anInt2026 * 2002101755 + local78) * 1633656115;
			Class158.anInt2029 = (local98 + Class158.anInt2029 * 2067675511) * -1296666553;
			if (local78 == 0 && local98 == 0) {
				anInt2018 = -1806870975;
				anInt2019 = -387547399;
			}
			Class156.method15158(-1522617305);
		}
		@Pc(141) Iterator local141 = aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(150) Class200 local150;
				do {
					if (!local141.hasNext()) {
						local141 = aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local141.hasNext()) {
										if (aBoolean400 && Class391.aClass8_53 != null) {
											for (@Pc(242) Class80_Sub7 local242 = (Class80_Sub7) Class391.aClass8_53.method247(129206984); local242 != null; local242 = (Class80_Sub7) Class391.aClass8_53.method237(-147209269)) {
												@Pc(255) Class320 local255 = (Class320) aClass41_Sub13_4.method18054(local242.aClass80_Sub18_1.anInt1587 * 1945594581, -1625911594);
												if (local242.method13450(arg0, arg1, (byte) -44)) {
													if (local255.aStringArray23 != null) {
														if (local255.aStringArray23[4] != null) {
															Class360.method28144(local255.aStringArray23[4], local255.aString179, -1, 1012, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 111);
														}
														if (local255.aStringArray23[3] != null) {
															Class360.method28144(local255.aStringArray23[3], local255.aString179, -1, 1011, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 102);
														}
														if (local255.aStringArray23[2] != null) {
															Class360.method28144(local255.aStringArray23[2], local255.aString179, -1, 1010, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 54);
														}
														if (local255.aStringArray23[1] != null) {
															Class360.method28144(local255.aStringArray23[1], local255.aString179, -1, 1009, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 92);
														}
														if (local255.aStringArray23[0] != null) {
															Class360.method28144(local255.aStringArray23[0], local255.aString179, -1, 1008, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 25);
														}
													}
													if (!local242.aClass80_Sub18_1.aBoolean364) {
														local242.aClass80_Sub18_1.aBoolean364 = true;
														Class107.method7196(Class158.aClass158_52, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, -1770613775);
													}
													if (local242.aClass80_Sub18_1.aBoolean364) {
														Class107.method7196(Class158.aClass158_51, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, 1618033845);
													}
												} else if (local242.aClass80_Sub18_1.aBoolean364) {
													local242.aClass80_Sub18_1.aBoolean364 = false;
													Class107.method7196(Class158.aClass158_49, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, -527871298);
												}
											}
										}
										return;
									}
									local150 = (Class200) ((Entry) local141.next()).getValue();
									local150.anInt3373 -= -1674385283;
								} while (local150.anInt3373 * -353644331 != 0);
								if (local150.anInt3372 * -929623047 > 1 || aBoolean405) {
									local150.anInt3372 -= -2114109879;
									local150.anInt3373 = anInt2024 * -2071666767;
								} else {
									local141.remove();
								}
							}
						}
					}
					local150 = (Class200) ((Entry) local141.next()).getValue();
					local150.anInt3373 -= -1674385283;
				} while (local150.anInt3373 * -353644331 != 0);
				if (local150.anInt3372 * -929623047 > 1 || aBoolean405) {
					local150.anInt3372 -= -2114109879;
					local150.anInt3373 = anInt2024 * -2071666767;
				} else {
					local141.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "fy", descriptor = "(II)V")
	static void method15466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat151 < aFloat150) {
			aFloat151 = (float) ((double) aFloat151 + (double) aFloat151 / 30.0D);
			if (aFloat151 > aFloat150) {
				aFloat151 = aFloat150;
			}
			Class156.method15158(1206577472);
			anInt1986 = (int) aFloat150 >> 1;
			aByteArrayArrayArray11 = Class121.method9718(anInt1986, 491286905);
		} else if (aFloat151 > aFloat150) {
			aFloat151 = (float) ((double) aFloat151 - (double) aFloat151 / 30.0D);
			if (aFloat151 < aFloat150) {
				aFloat151 = aFloat150;
			}
			Class156.method15158(1307094829);
			anInt1986 = (int) aFloat150 >> 1;
			aByteArrayArrayArray11 = Class121.method9718(anInt1986, 146257151);
		}
		if (anInt2018 * -1226684865 != -1 && anInt2019 * 370678967 != -1) {
			@Pc(78) int local78 = anInt2018 * -1226684865 - anInt2026 * 2002101755;
			if (local78 != 0) {
				local78 /= Math.min(anInt2015 * -1766595015, Math.abs(local78));
			}
			@Pc(98) int local98 = anInt2019 * 370678967 - Class158.anInt2029 * 2067675511;
			if (local98 != 0) {
				local98 /= Math.min(anInt2015 * -1766595015, Math.abs(local98));
			}
			anInt2026 = (anInt2026 * 2002101755 + local78) * 1633656115;
			Class158.anInt2029 = (local98 + Class158.anInt2029 * 2067675511) * -1296666553;
			if (local78 == 0 && local98 == 0) {
				anInt2018 = -1806870975;
				anInt2019 = -387547399;
			}
			Class156.method15158(264917362);
		}
		@Pc(141) Iterator local141 = aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(150) Class200 local150;
				do {
					if (!local141.hasNext()) {
						local141 = aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local141.hasNext()) {
										if (aBoolean400 && Class391.aClass8_53 != null) {
											for (@Pc(242) Class80_Sub7 local242 = (Class80_Sub7) Class391.aClass8_53.method247(129206984); local242 != null; local242 = (Class80_Sub7) Class391.aClass8_53.method237(-2142818220)) {
												@Pc(255) Class320 local255 = (Class320) aClass41_Sub13_4.method18054(local242.aClass80_Sub18_1.anInt1587 * 1945594581, -1179746471);
												if (local242.method13450(arg0, arg1, (byte) 121)) {
													if (local255.aStringArray23 != null) {
														if (local255.aStringArray23[4] != null) {
															Class360.method28144(local255.aStringArray23[4], local255.aString179, -1, 1012, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 109);
														}
														if (local255.aStringArray23[3] != null) {
															Class360.method28144(local255.aStringArray23[3], local255.aString179, -1, 1011, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 103);
														}
														if (local255.aStringArray23[2] != null) {
															Class360.method28144(local255.aStringArray23[2], local255.aString179, -1, 1010, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 35);
														}
														if (local255.aStringArray23[1] != null) {
															Class360.method28144(local255.aStringArray23[1], local255.aString179, -1, 1009, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 71);
														}
														if (local255.aStringArray23[0] != null) {
															Class360.method28144(local255.aStringArray23[0], local255.aString179, -1, 1008, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 41);
														}
													}
													if (!local242.aClass80_Sub18_1.aBoolean364) {
														local242.aClass80_Sub18_1.aBoolean364 = true;
														Class107.method7196(Class158.aClass158_52, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, 1430644536);
													}
													if (local242.aClass80_Sub18_1.aBoolean364) {
														Class107.method7196(Class158.aClass158_51, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, 907377654);
													}
												} else if (local242.aClass80_Sub18_1.aBoolean364) {
													local242.aClass80_Sub18_1.aBoolean364 = false;
													Class107.method7196(Class158.aClass158_49, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, -1729604158);
												}
											}
										}
										return;
									}
									local150 = (Class200) ((Entry) local141.next()).getValue();
									local150.anInt3373 -= -1674385283;
								} while (local150.anInt3373 * -353644331 != 0);
								if (local150.anInt3372 * -929623047 > 1 || aBoolean405) {
									local150.anInt3372 -= -2114109879;
									local150.anInt3373 = anInt2024 * -2071666767;
								} else {
									local141.remove();
								}
							}
						}
					}
					local150 = (Class200) ((Entry) local141.next()).getValue();
					local150.anInt3373 -= -1674385283;
				} while (local150.anInt3373 * -353644331 != 0);
				if (local150.anInt3372 * -929623047 > 1 || aBoolean405) {
					local150.anInt3372 -= -2114109879;
					local150.anInt3373 = anInt2024 * -2071666767;
				} else {
					local141.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "hf", descriptor = "(II)V")
	public static void method15467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2018 = (arg0 - anInt1991) * 1806870975;
		anInt2019 = (arg1 - anInt1996) * 387547399;
	}

	@OriginalMember(owner = "client!alp", name = "fh", descriptor = "(II)V")
	static void method15468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat151 < aFloat150) {
			aFloat151 = (float) ((double) aFloat151 + (double) aFloat151 / 30.0D);
			if (aFloat151 > aFloat150) {
				aFloat151 = aFloat150;
			}
			Class156.method15158(1441911958);
			anInt1986 = (int) aFloat150 >> 1;
			aByteArrayArrayArray11 = Class121.method9718(anInt1986, -1019984249);
		} else if (aFloat151 > aFloat150) {
			aFloat151 = (float) ((double) aFloat151 - (double) aFloat151 / 30.0D);
			if (aFloat151 < aFloat150) {
				aFloat151 = aFloat150;
			}
			Class156.method15158(-1629138421);
			anInt1986 = (int) aFloat150 >> 1;
			aByteArrayArrayArray11 = Class121.method9718(anInt1986, -80974036);
		}
		if (anInt2018 * -1226684865 != -1 && anInt2019 * 370678967 != -1) {
			@Pc(78) int local78 = anInt2018 * -1226684865 - anInt2026 * 2002101755;
			if (local78 != 0) {
				local78 /= Math.min(anInt2015 * -1766595015, Math.abs(local78));
			}
			@Pc(98) int local98 = anInt2019 * 370678967 - Class158.anInt2029 * 2067675511;
			if (local98 != 0) {
				local98 /= Math.min(anInt2015 * -1766595015, Math.abs(local98));
			}
			anInt2026 = (anInt2026 * 2002101755 + local78) * 1633656115;
			Class158.anInt2029 = (local98 + Class158.anInt2029 * 2067675511) * -1296666553;
			if (local78 == 0 && local98 == 0) {
				anInt2018 = -1806870975;
				anInt2019 = -387547399;
			}
			Class156.method15158(1406967698);
		}
		@Pc(141) Iterator local141 = aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(150) Class200 local150;
				do {
					if (!local141.hasNext()) {
						local141 = aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local141.hasNext()) {
										if (aBoolean400 && Class391.aClass8_53 != null) {
											for (@Pc(242) Class80_Sub7 local242 = (Class80_Sub7) Class391.aClass8_53.method247(129206984); local242 != null; local242 = (Class80_Sub7) Class391.aClass8_53.method237(-1852418247)) {
												@Pc(255) Class320 local255 = (Class320) aClass41_Sub13_4.method18054(local242.aClass80_Sub18_1.anInt1587 * 1945594581, -1146066819);
												if (local242.method13450(arg0, arg1, (byte) -12)) {
													if (local255.aStringArray23 != null) {
														if (local255.aStringArray23[4] != null) {
															Class360.method28144(local255.aStringArray23[4], local255.aString179, -1, 1012, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 48);
														}
														if (local255.aStringArray23[3] != null) {
															Class360.method28144(local255.aStringArray23[3], local255.aString179, -1, 1011, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 51);
														}
														if (local255.aStringArray23[2] != null) {
															Class360.method28144(local255.aStringArray23[2], local255.aString179, -1, 1010, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 127);
														}
														if (local255.aStringArray23[1] != null) {
															Class360.method28144(local255.aStringArray23[1], local255.aString179, -1, 1009, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 58);
														}
														if (local255.aStringArray23[0] != null) {
															Class360.method28144(local255.aStringArray23[0], local255.aString179, -1, 1008, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 52);
														}
													}
													if (!local242.aClass80_Sub18_1.aBoolean364) {
														local242.aClass80_Sub18_1.aBoolean364 = true;
														Class107.method7196(Class158.aClass158_52, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, 102676437);
													}
													if (local242.aClass80_Sub18_1.aBoolean364) {
														Class107.method7196(Class158.aClass158_51, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, -769209197);
													}
												} else if (local242.aClass80_Sub18_1.aBoolean364) {
													local242.aClass80_Sub18_1.aBoolean364 = false;
													Class107.method7196(Class158.aClass158_49, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, -1555043087);
												}
											}
										}
										return;
									}
									local150 = (Class200) ((Entry) local141.next()).getValue();
									local150.anInt3373 -= -1674385283;
								} while (local150.anInt3373 * -353644331 != 0);
								if (local150.anInt3372 * -929623047 > 1 || aBoolean405) {
									local150.anInt3372 -= -2114109879;
									local150.anInt3373 = anInt2024 * -2071666767;
								} else {
									local141.remove();
								}
							}
						}
					}
					local150 = (Class200) ((Entry) local141.next()).getValue();
					local150.anInt3373 -= -1674385283;
				} while (local150.anInt3373 * -353644331 != 0);
				if (local150.anInt3372 * -929623047 > 1 || aBoolean405) {
					local150.anInt3372 -= -2114109879;
					local150.anInt3373 = anInt2024 * -2071666767;
				} else {
					local141.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "gv", descriptor = "(I)V")
	public static void method15469(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt2023 = anInt2013 * -37559507;
		} else {
			anInt2023 = arg0 * -105631365;
		}
	}

	@OriginalMember(owner = "client!alp", name = "fl", descriptor = "(IIIZ)V")
	public static void method15470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class80_Sub1_Sub12 local1 = aClass80_Sub1_Sub12_3;
		method15336(arg0);
		aBoolean398 = false;
		if (local1 != aClass80_Sub1_Sub12_3) {
			Class443.method29216(-1925432665);
		}
		anInt2021 = arg1 * -427851623;
		anInt2025 = arg2 * 869244937;
		aBoolean403 = arg3;
	}

	@OriginalMember(owner = "client!alp", name = "fg", descriptor = "()V")
	public static void method15471() {
		Class163.method15763(true, (byte) -30);
	}

	@OriginalMember(owner = "client!alp", name = "gm", descriptor = "(Z)V")
	public static void method15472(@OriginalArg(0) boolean arg0) {
		aBoolean405 = arg0;
	}

	@OriginalMember(owner = "client!alp", name = "fs", descriptor = "()V")
	public static void method15473() {
		Class163.method15763(true, (byte) 56);
	}

	@OriginalMember(owner = "client!alp", name = "gn", descriptor = "()V")
	public static void method15474() {
		aHashMap4.clear();
		aHashMap5.clear();
	}

	@OriginalMember(owner = "client!alp", name = "ff", descriptor = "()Lclient!asb;")
	public static Class80_Sub1_Sub12 method15475() {
		return aClass80_Sub1_Sub12_3;
	}

	@OriginalMember(owner = "client!alp", name = "fr", descriptor = "(Z)V")
	static void method15476(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class626 local3 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18981(496594758);
		@Pc(13) Class80_Sub1_Sub12 local13 = method15338(local3.anInt5540 * -390642507, local3.anInt5537 * -894305615);
		if (local13 == null) {
			local13 = method15423(aClass632_2.anInt5587 * 33807589);
		}
		if (local13 == Class103_Sub8.aClass80_Sub1_Sub12_1 && !arg0) {
			return;
		}
		Class103_Sub8.aClass80_Sub1_Sub12_1 = local13;
		@Pc(32) boolean local32 = method15419(local13);
		if (local32) {
			aBoolean398 = true;
			Class443.method29216(1747815971);
		}
	}

	@OriginalMember(owner = "client!alp", name = "fi", descriptor = "(I)V")
	static void method15477(@OriginalArg(0) int arg0) {
		anInt2026 = arg0 * 1633656115;
		anInt2018 = -1806870975;
		anInt2019 = -387547399;
		Class156.method15158(-912077832);
	}

	@OriginalMember(owner = "client!alp", name = "eb", descriptor = "()V")
	static void method15478() {
		Class443.method29216(-2047881045);
		aClass80_Sub1_Sub12_3 = null;
		Class103_Sub8.aClass80_Sub1_Sub12_1 = null;
		aClass24_15.method564(738960787);
		aClass24_16.method564(284977215);
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass104ArrayArray1[local13][local18] = null;
				aClass15ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "fd", descriptor = "(IIIZ)V")
	public static void method15479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class80_Sub1_Sub12 local1 = aClass80_Sub1_Sub12_3;
		method15336(arg0);
		aBoolean398 = false;
		if (local1 != aClass80_Sub1_Sub12_3) {
			Class443.method29216(-1012820565);
		}
		anInt2021 = arg1 * -427851623;
		anInt2025 = arg2 * 869244937;
		aBoolean403 = arg3;
	}

	@OriginalMember(owner = "client!alp", name = "gk", descriptor = "(I)V")
	static void method15480(@OriginalArg(0) int arg0) {
		anInt2026 = arg0 * 1633656115;
		anInt2018 = -1806870975;
		anInt2019 = -387547399;
		Class156.method15158(-248339422);
	}

	@OriginalMember(owner = "client!alp", name = "gt", descriptor = "(I)V")
	public static void method15481(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt2024 = anInt2016 * 1716757035;
		} else {
			anInt2024 = arg0 * 1367340173;
		}
	}

	@OriginalMember(owner = "client!alp", name = "ge", descriptor = "(I)V")
	public static void method15482(@OriginalArg(0) int arg0) {
		if (arg0 == 25) {
			aFloat150 = 2.0F;
		} else if (arg0 == 37) {
			aFloat150 = 3.0F;
		} else if (arg0 == 50) {
			aFloat150 = 4.0F;
		} else if (arg0 == 75) {
			aFloat150 = 6.0F;
		} else if (arg0 == 100) {
			aFloat150 = 8.0F;
		} else if (arg0 == 200) {
			aFloat150 = 16.0F;
		}
		anInt2019 = -387547399;
		anInt2019 = -387547399;
	}

	@OriginalMember(owner = "client!alp", name = "gb", descriptor = "(I)V")
	public static void method15483(@OriginalArg(0) int arg0) {
		if (arg0 == 25) {
			aFloat150 = 2.0F;
		} else if (arg0 == 37) {
			aFloat150 = 3.0F;
		} else if (arg0 == 50) {
			aFloat150 = 4.0F;
		} else if (arg0 == 75) {
			aFloat150 = 6.0F;
		} else if (arg0 == 100) {
			aFloat150 = 8.0F;
		} else if (arg0 == 200) {
			aFloat150 = 16.0F;
		}
		anInt2019 = -387547399;
		anInt2019 = -387547399;
	}

	@OriginalMember(owner = "client!alp", name = "gw", descriptor = "(IIII)V")
	static void method15484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1989 / (float) anInt2001;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		anInt2026 = local34 * anInt2001 / local7 * 1633656115;
		Class158.anInt2029 = (anInt1989 - anInt1989 * local42 / local9) * -1296666553;
		anInt2018 = -1806870975;
		anInt2019 = -387547399;
		Class156.method15158(67786981);
	}

	@OriginalMember(owner = "client!alp", name = "gi", descriptor = "(IIII)V")
	static void method15485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1989 / (float) anInt2001;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		anInt2026 = local34 * anInt2001 / local7 * 1633656115;
		Class158.anInt2029 = (anInt1989 - anInt1989 * local42 / local9) * -1296666553;
		anInt2018 = -1806870975;
		anInt2019 = -387547399;
		Class156.method15158(-399449405);
	}

	@OriginalMember(owner = "client!alp", name = "hp", descriptor = "()Lclient!akh;")
	public static Class80_Sub18 method15486() {
		if (aClass8_28 == null || aClass7_1 == null) {
			return null;
		}
		aClass7_1.method210(aClass8_28, 116356022);
		@Pc(15) Class80_Sub18 local15 = (Class80_Sub18) aClass7_1.method220(1442764386);
		if (local15 == null) {
			return null;
		} else {
			@Pc(28) Class320 local28 = (Class320) aClass41_Sub13_4.method18054(local15.anInt1587 * 1945594581, 84804966);
			return local28 != null && local28.aBoolean797 && local28.method27544(anInterface21_2, anInterface24_2, -2134337645) ? local15 : Class148_Sub1.method13460(1783257693);
		}
	}

	@OriginalMember(owner = "client!alp", name = "ga", descriptor = "()I")
	public static int method15487() {
		if ((double) aFloat150 == 2.0D) {
			return 25;
		} else if ((double) aFloat150 == 3.0D) {
			return 37;
		} else if ((double) aFloat150 == 4.0D) {
			return 50;
		} else if ((double) aFloat150 == 6.0D) {
			return 75;
		} else if ((double) aFloat150 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!alp", name = "gd", descriptor = "()I")
	public static int method15488() {
		if ((double) aFloat150 == 2.0D) {
			return 25;
		} else if ((double) aFloat150 == 3.0D) {
			return 37;
		} else if ((double) aFloat150 == 4.0D) {
			return 50;
		} else if ((double) aFloat150 == 6.0D) {
			return 75;
		} else if ((double) aFloat150 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!alp", name = "gc", descriptor = "()I")
	public static int method15489() {
		if ((double) aFloat150 == 2.0D) {
			return 25;
		} else if ((double) aFloat150 == 3.0D) {
			return 37;
		} else if ((double) aFloat150 == 4.0D) {
			return 50;
		} else if ((double) aFloat150 == 6.0D) {
			return 75;
		} else if ((double) aFloat150 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!alp", name = "gj", descriptor = "(I)V")
	public static void method15490(@OriginalArg(0) int arg0) {
		@Pc(5) Class200 local5 = (Class200) aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class200();
		}
		local5.anInt3372 = anInt2023 * 1354234379;
		local5.anInt3373 = anInt2024 * -2071666767;
		aHashMap4.put(arg0, local5);
	}

	@OriginalMember(owner = "client!alp", name = "gf", descriptor = "(I)V")
	public static void method15491(@OriginalArg(0) int arg0) {
		@Pc(5) Class200 local5 = (Class200) aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class200();
		}
		local5.anInt3372 = anInt2023 * 1354234379;
		local5.anInt3373 = anInt2024 * -2071666767;
		aHashMap4.put(arg0, local5);
	}

	@OriginalMember(owner = "client!alp", name = "gg", descriptor = "(I)V")
	static void method15492(@OriginalArg(0) int arg0) {
		Class158.anInt2029 = arg0 * -1296666553;
		anInt2019 = -387547399;
		anInt2019 = -387547399;
		Class156.method15158(1594692495);
	}

	@OriginalMember(owner = "client!alp", name = "gh", descriptor = "(I)V")
	static void method15493(@OriginalArg(0) int arg0) {
		anInt2026 = arg0 * 1633656115;
		anInt2018 = -1806870975;
		anInt2019 = -387547399;
		Class156.method15158(909060826);
	}

	@OriginalMember(owner = "client!alp", name = "gr", descriptor = "(I)V")
	public static void method15494(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt2023 = anInt2013 * -37559507;
		} else {
			anInt2023 = arg0 * -105631365;
		}
	}

	@OriginalMember(owner = "client!alp", name = "ft", descriptor = "()V")
	public static void method15495() {
		Class163.method15763(true, (byte) -9);
	}

	@OriginalMember(owner = "client!alp", name = "gy", descriptor = "(I)V")
	public static void method15496(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt2024 = anInt2016 * 1716757035;
		} else {
			anInt2024 = arg0 * 1367340173;
		}
	}

	@OriginalMember(owner = "client!alp", name = "gl", descriptor = "(I)V")
	public static void method15497(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt2024 = anInt2016 * 1716757035;
		} else {
			anInt2024 = arg0 * 1367340173;
		}
	}

	@OriginalMember(owner = "client!alp", name = "fw", descriptor = "(II)V")
	static void method15498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat151 < aFloat150) {
			aFloat151 = (float) ((double) aFloat151 + (double) aFloat151 / 30.0D);
			if (aFloat151 > aFloat150) {
				aFloat151 = aFloat150;
			}
			Class156.method15158(395193609);
			anInt1986 = (int) aFloat150 >> 1;
			aByteArrayArrayArray11 = Class121.method9718(anInt1986, -380548426);
		} else if (aFloat151 > aFloat150) {
			aFloat151 = (float) ((double) aFloat151 - (double) aFloat151 / 30.0D);
			if (aFloat151 < aFloat150) {
				aFloat151 = aFloat150;
			}
			Class156.method15158(521881913);
			anInt1986 = (int) aFloat150 >> 1;
			aByteArrayArrayArray11 = Class121.method9718(anInt1986, -2077110737);
		}
		if (anInt2018 * -1226684865 != -1 && anInt2019 * 370678967 != -1) {
			@Pc(78) int local78 = anInt2018 * -1226684865 - anInt2026 * 2002101755;
			if (local78 != 0) {
				local78 /= Math.min(anInt2015 * -1766595015, Math.abs(local78));
			}
			@Pc(98) int local98 = anInt2019 * 370678967 - Class158.anInt2029 * 2067675511;
			if (local98 != 0) {
				local98 /= Math.min(anInt2015 * -1766595015, Math.abs(local98));
			}
			anInt2026 = (anInt2026 * 2002101755 + local78) * 1633656115;
			Class158.anInt2029 = (local98 + Class158.anInt2029 * 2067675511) * -1296666553;
			if (local78 == 0 && local98 == 0) {
				anInt2018 = -1806870975;
				anInt2019 = -387547399;
			}
			Class156.method15158(-424811889);
		}
		@Pc(141) Iterator local141 = aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(150) Class200 local150;
				do {
					if (!local141.hasNext()) {
						local141 = aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local141.hasNext()) {
										if (aBoolean400 && Class391.aClass8_53 != null) {
											for (@Pc(242) Class80_Sub7 local242 = (Class80_Sub7) Class391.aClass8_53.method247(129206984); local242 != null; local242 = (Class80_Sub7) Class391.aClass8_53.method237(-655653500)) {
												@Pc(255) Class320 local255 = (Class320) aClass41_Sub13_4.method18054(local242.aClass80_Sub18_1.anInt1587 * 1945594581, -713451064);
												if (local242.method13450(arg0, arg1, (byte) 16)) {
													if (local255.aStringArray23 != null) {
														if (local255.aStringArray23[4] != null) {
															Class360.method28144(local255.aStringArray23[4], local255.aString179, -1, 1012, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 26);
														}
														if (local255.aStringArray23[3] != null) {
															Class360.method28144(local255.aStringArray23[3], local255.aString179, -1, 1011, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 48);
														}
														if (local255.aStringArray23[2] != null) {
															Class360.method28144(local255.aStringArray23[2], local255.aString179, -1, 1010, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 75);
														}
														if (local255.aStringArray23[1] != null) {
															Class360.method28144(local255.aStringArray23[1], local255.aString179, -1, 1009, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 42);
														}
														if (local255.aStringArray23[0] != null) {
															Class360.method28144(local255.aStringArray23[0], local255.aString179, -1, 1008, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 110);
														}
													}
													if (!local242.aClass80_Sub18_1.aBoolean364) {
														local242.aClass80_Sub18_1.aBoolean364 = true;
														Class107.method7196(Class158.aClass158_52, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, 1088583119);
													}
													if (local242.aClass80_Sub18_1.aBoolean364) {
														Class107.method7196(Class158.aClass158_51, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, 1206264723);
													}
												} else if (local242.aClass80_Sub18_1.aBoolean364) {
													local242.aClass80_Sub18_1.aBoolean364 = false;
													Class107.method7196(Class158.aClass158_49, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, -584456554);
												}
											}
										}
										return;
									}
									local150 = (Class200) ((Entry) local141.next()).getValue();
									local150.anInt3373 -= -1674385283;
								} while (local150.anInt3373 * -353644331 != 0);
								if (local150.anInt3372 * -929623047 > 1 || aBoolean405) {
									local150.anInt3372 -= -2114109879;
									local150.anInt3373 = anInt2024 * -2071666767;
								} else {
									local141.remove();
								}
							}
						}
					}
					local150 = (Class200) ((Entry) local141.next()).getValue();
					local150.anInt3373 -= -1674385283;
				} while (local150.anInt3373 * -353644331 != 0);
				if (local150.anInt3372 * -929623047 > 1 || aBoolean405) {
					local150.anInt3372 -= -2114109879;
					local150.anInt3373 = anInt2024 * -2071666767;
				} else {
					local141.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "hr", descriptor = "(I)I")
	public static int method15499(@OriginalArg(0) int arg0) {
		if (anInt2022 * 781339239 == arg0) {
			return aBoolean409 ? 1 : 0;
		} else if (arg0 == anInt2020 * -606222511) {
			return aBoolean404 ? 1 : 0;
		} else if (arg0 == anInt2014 * -1592559853) {
			return aBoolean402 ? 1 : 0;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!alp", name = "gx", descriptor = "()V")
	public static void method15500() {
		aHashMap4.clear();
		aHashMap5.clear();
	}

	@OriginalMember(owner = "client!alp", name = "gp", descriptor = "()I")
	public static int method15501() {
		if ((double) aFloat150 == 2.0D) {
			return 25;
		} else if ((double) aFloat150 == 3.0D) {
			return 37;
		} else if ((double) aFloat150 == 4.0D) {
			return 50;
		} else if ((double) aFloat150 == 6.0D) {
			return 75;
		} else if ((double) aFloat150 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!alp", name = "fu", descriptor = "()Lclient!asb;")
	public static Class80_Sub1_Sub12 method15502() {
		return aClass80_Sub1_Sub12_3;
	}

	@OriginalMember(owner = "client!alp", name = "ei", descriptor = "(Lclient!di;IIII)V")
	static void method15503(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20986(arg1, arg2, arg3 + arg1, arg4 + arg2);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (anInt2017 * 1776676847 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg3 / 2 + arg1;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method20722(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method20818(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3570 * 1973763491].getRGB(), 0);
			arg0.method20722(local22 - 150, local32 + 2, anInt2017 * 1035063245, 30, client.aColorArray1[client.anInt3570 * 1973763491].getRGB(), 0);
			Class8.aClass104_1.method7642(Class60.aClass60_122.method1180(Class512.aClass719_3, -15999589), local22, local16 + local32, client.aColorArray3[client.anInt3570 * 1973763491].getRGB(), -1, 1711653447);
			return;
		}
		@Pc(103) int local103 = anInt2026 * 2002101755 - (int) ((float) arg3 / aFloat151);
		local22 = (int) ((float) arg4 / aFloat151) + Class158.anInt2029 * 2067675511;
		local32 = anInt2026 * 2002101755 + (int) ((float) arg3 / aFloat151);
		@Pc(133) int local133 = Class158.anInt2029 * 2067675511 - (int) ((float) arg4 / aFloat151);
		Class147_Sub2.anInt1485 = (anInt2026 * 2002101755 - (int) ((float) arg3 / aFloat151)) * -1826477251;
		Class469.anInt4956 = (Class158.anInt2029 * 2067675511 - (int) ((float) arg4 / aFloat151)) * -359467987;
		Class290.anInt3947 = (int) ((float) (arg3 * 2) / aFloat151) * 391275033;
		Class278.anInt3927 = (int) ((float) (arg4 * 2) / aFloat151) * -1702485925;
		aClass243_34 = aClass243_32;
		method15344(anInt1991 + local103, anInt1996 + local22, local32 + anInt1991, local133 + anInt1996, arg1, arg2, arg1 + arg3, arg2 + arg4 + 1);
		method15346(arg0, !aBoolean404, !aBoolean402, client.aBoolean732, false);
		@Pc(219) Class8 local219 = method15357(arg0);
		Class721.method37334(arg0, local219, 0, 0, -1356409214);
		if (client.aBoolean715) {
			@Pc(233) int local233 = arg3 + arg1 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class709.aClass104_26.method7629("Fps: " + Class554.anInt3413 * -1936589983 + " (" + Class554.anInt3414 * 197513509 + " ms)", local233, local239, 16776960, -1, 1234387433);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class709.aClass104_26.method7629("Mem:" + local276 + "k", local233, local265, local278, -1, 1678796477);
			local239 = local265 - 15;
		}
		aClass243_32.method26247(5, (byte) 62);
	}

	@OriginalMember(owner = "client!alp", name = "es", descriptor = "()V")
	static void method15504() {
		if (anInt2026 * 2002101755 < 0) {
			anInt2026 = 0;
			anInt2018 = -1806870975;
			anInt2019 = -387547399;
		}
		if (anInt2026 * 2002101755 > anInt2001) {
			anInt2026 = anInt2001 * 1633656115;
			anInt2018 = -1806870975;
			anInt2019 = -387547399;
		}
		if (Class158.anInt2029 * 2067675511 < 0) {
			Class158.anInt2029 = 0;
			anInt2018 = -1806870975;
			anInt2019 = -387547399;
		}
		if (Class158.anInt2029 * 2067675511 > anInt1989) {
			Class158.anInt2029 = anInt1989 * -1296666553;
			anInt2018 = -1806870975;
			anInt2019 = -387547399;
		}
	}

	@OriginalMember(owner = "client!alp", name = "ha", descriptor = "(II)V")
	public static void method15505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2018 = (arg0 - anInt1991) * 1806870975;
		anInt2019 = (arg1 - anInt1996) * 387547399;
	}

	@OriginalMember(owner = "client!alp", name = "hn", descriptor = "(II)V")
	public static void method15506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2026 = (arg0 - anInt1991) * 1633656115;
		Class158.anInt2029 = (arg1 - anInt1996) * -1296666553;
		anInt2018 = -1806870975;
		anInt2019 = -387547399;
		Class156.method15158(16192376);
	}

	@OriginalMember(owner = "client!alp", name = "fm", descriptor = "(Lclient!ho;)Z")
	static boolean method15507(@OriginalArg(0) Class320 arg0) {
		if (arg0 == null) {
			return false;
		}
		if (arg0.anIntArray389 != null) {
			arg0 = arg0.method27550(anInterface21_2, anInterface24_2, 464684077);
			if (arg0 == null) {
				return false;
			}
		}
		if (!arg0.aBoolean795) {
			return false;
		} else if (!arg0.method27544(anInterface21_2, anInterface24_2, -2069642568)) {
			return false;
		} else if (aClass24_15.method560((long) (arg0.anInt4055 * 445805997)) != null) {
			return false;
		} else if (aClass24_16.method560((long) (arg0.anInt4061 * -1976811059)) == null) {
			if (arg0.aString178 != null) {
				if (arg0.anInt4031 * -618572023 == 0 && aBoolean401) {
					return false;
				}
				if (arg0.anInt4031 * -618572023 == 1 && aBoolean407) {
					return false;
				}
				if (arg0.anInt4031 * -618572023 == 2 && aBoolean408) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!alp", name = "eg", descriptor = "()V")
	static void method15508() {
		Class443.method29216(1029171637);
		aClass80_Sub1_Sub12_3 = null;
		Class103_Sub8.aClass80_Sub1_Sub12_1 = null;
		aClass24_15.method564(94994890);
		aClass24_16.method564(-1150168835);
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass104ArrayArray1[local13][local18] = null;
				aClass15ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!alp", name = "hv", descriptor = "(IZ)Z")
	public static boolean method15509(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == anInt2022 * 781339239) {
			aBoolean409 = arg1;
		} else if (anInt2020 * -606222511 == arg0) {
			aBoolean404 = arg1;
		} else if (anInt2014 * -1592559853 == arg0) {
			aBoolean402 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!alp", name = "hq", descriptor = "(I)I")
	public static int method15510(@OriginalArg(0) int arg0) {
		if (anInt2022 * 781339239 == arg0) {
			return aBoolean409 ? 1 : 0;
		} else if (arg0 == anInt2020 * -606222511) {
			return aBoolean404 ? 1 : 0;
		} else if (arg0 == anInt2014 * -1592559853) {
			return aBoolean402 ? 1 : 0;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!alp", name = "gq", descriptor = "(Z)V")
	public static void method15511(@OriginalArg(0) boolean arg0) {
		aBoolean405 = arg0;
	}

	@OriginalMember(owner = "client!alp", name = "he", descriptor = "(I)I")
	public static int method15512(@OriginalArg(0) int arg0) {
		if (anInt2022 * 781339239 == arg0) {
			return aBoolean409 ? 1 : 0;
		} else if (arg0 == anInt2020 * -606222511) {
			return aBoolean404 ? 1 : 0;
		} else if (arg0 == anInt2014 * -1592559853) {
			return aBoolean402 ? 1 : 0;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!alp", name = "t", descriptor = "(IIZI)I")
	public static int method15513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, 1496560383);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray179.length) {
			return local4.anIntArray179[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!alp", name = "<init>", descriptor = "()V")
	Class159_Sub1() throws Throwable {
		throw new Error();
	}
}
