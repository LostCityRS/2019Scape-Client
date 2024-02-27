package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class606 {

	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	static final int anInt5716 = 127;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "I")
	static final int anInt5717 = 7;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "I")
	public static int anInt5718;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "(Lclient!dh;IILclient!hf;)V")
	static void method32087(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class660.method33006(false, true, 1662920483);
			@Pc(31) int local31 = Class685.anIntArray524[local23];
			Class46.method896(false, true, 1173794949);
			arg0.method20665(arg1, ((63 - local5) * -1490598249 * arg3.anInt4023 >> 6) + arg2, arg3.anInt4022 * 1215292027, (arg3.anInt4023 * -1490598249 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!v", name = "m", descriptor = "(Lclient!dh;IILclient!hf;)V")
	static void method32088(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class660.method33006(false, true, 1013938962);
			@Pc(31) int local31 = Class685.anIntArray524[local23];
			Class46.method896(false, true, 1836657317);
			arg0.method20665(arg1, ((63 - local5) * -1490598249 * arg3.anInt4023 >> 6) + arg2, arg3.anInt4022 * 1215292027, (arg3.anInt4023 * -1490598249 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(Lclient!dh;IILclient!hf;)V")
	static void method32089(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class660.method33006(false, true, 1608842228);
			@Pc(31) int local31 = Class685.anIntArray524[local23];
			Class46.method896(false, true, 1777277304);
			arg0.method20665(arg1, ((63 - local5) * -1490598249 * arg3.anInt4023 >> 6) + arg2, arg3.anInt4022 * 1215292027, (arg3.anInt4023 * -1490598249 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!v", name = "v", descriptor = "(Lclient!dh;Lclient!hf;IIB)V")
	static void method32090(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20513();
		@Pc(6) Class327 local6 = null;
		@Pc(8) Class96 local8 = null;
		if (arg1.anInt4012 * -158526639 == 5) {
			local6 = arg1.method26971(arg0, (byte) 24);
			if (local6 == null) {
				return;
			}
			local8 = local6.aClass96_1;
			if (local6.anInt4181 * -814657375 != arg1.anInt4022 * 1215292027 || local6.anInt4182 * -764381181 != arg1.anInt4023 * -1490598249) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20479(arg2, arg3, arg1.anInt4022 * 1215292027 + arg2, arg1.anInt4023 * -1490598249 + arg3);
		if (Class172.anInt3177 * 910154737 == 2 || Class172.anInt3177 * 910154737 == 5 || Class172.aClass100_40 == null) {
			if (local8 == null) {
				return;
			}
			arg0.method20517(-16777216, local8, arg2, arg3);
			return;
		}
		arg0.method20637(Class172.anIntArray269);
		arg0.method20574();
		@Pc(86) Class611 local86 = client.aClass532_1.method30624(1884925766);
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(107) int local107;
		if (Class429.anInt4942 * -1453926679 == 4) {
			local95 = client.anInt3481 * -1195894597;
			local99 = client.anInt3482 * 1196621895;
			local105 = (int) -client.aFloat253 & 0x3FFF;
			local107 = 4096;
		} else {
			@Pc(112) Class472 local112 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
			local95 = (int) local112.aFloat325;
			local99 = (int) local112.aFloat327;
			if (Class429.anInt4942 * -1453926679 == 3) {
				local105 = (int) -((double) Class65.aClass123_Sub1_2.method8962((byte) -97) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
			} else {
				local105 = (int) -client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
			}
			local107 = 4096 - client.anInt3478 * 2027131152;
		}
		@Pc(163) int local163 = local95 / 128 + 48;
		@Pc(175) int local175 = client.aClass532_1.method30655((short) 128) * 4 + 48 - local99 / 128;
		if (local8 == null) {
			Class172.aClass100_40.method18195((float) arg2 + (float) (arg1.anInt4022 * 1215292027) / 2.0F, (float) (arg1.anInt4023 * -1490598249) / 2.0F + (float) arg3, (float) local163, (float) local175, local107, local105 << 2, 1, -1, 1);
		} else {
			Class172.aClass100_40.method18198((float) arg2 + (float) (arg1.anInt4022 * 1215292027) / 2.0F, (float) arg3 + (float) (arg1.anInt4023 * -1490598249) / 2.0F, (float) local163, (float) local175, local107, local105 << 2, local8, arg2, arg3);
		}
		@Pc(249) Class584 local249 = client.aClass532_1.method30768(-484613851);
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(287) int local287;
		@Pc(297) int local297;
		@Pc(307) int local307;
		for (@Pc(254) Class93_Sub14 local254 = (Class93_Sub14) Class172.aClass22_43.method445((byte) 123); local254 != null; local254 = (Class93_Sub14) Class172.aClass22_43.method415(615324061)) {
			local261 = local254.anInt1526 * 1279598251;
			local275 = (local249.anIntArray475[local261] >> 14 & 0x3FFF) - local86.anInt5784 * 270611681;
			local287 = (local249.anIntArray475[local261] & 0x3FFF) - local86.anInt5785 * -1994307635;
			local297 = local275 * 4 + 2 - local95 / 128;
			local307 = local287 * 4 + 2 - local99 / 128;
			Class56.method18047(arg0, local8, arg1, arg2, arg3, local297, local307, local249.anIntArray474[local261], (byte) -54);
		}
		for (local261 = 0; local261 < Class172.anInt3176 * 906807861; local261++) {
			local275 = Class172.anIntArray270[local261] * 4 + 2 - local95 / 128;
			local287 = Class172.anIntArray272[local261] * 4 + 2 - local99 / 128;
			@Pc(367) Class610 local367 = (Class610) client.aClass532_1.method30647(1161509209).method18273(Class172.anIntArray271[local261], -1264690199);
			if (local367.anIntArray494 != null) {
				local367 = local367.method32163(Class624.aClass120_1, Class624.aClass120_1, 90754467);
				if (local367 == null || local367.anInt5761 * 400633667 == -1) {
					continue;
				}
			}
			Class56.method18047(arg0, local8, arg1, arg2, arg3, local275, local287, local367.anInt5761 * 400633667, (byte) -39);
		}
		for (@Pc(406) Class93_Sub5 local406 = (Class93_Sub5) client.aClass16_20.method220((byte) -10); local406 != null; local406 = (Class93_Sub5) client.aClass16_20.method222(2045833206)) {
			local275 = (int) (local406.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			if (local275 == Class172.anInt3175 * 405524325) {
				local287 = (int) (local406.aLong232 * -3750704643647536275L & 0x3FFFL) - local86.anInt5784 * 270611681;
				local297 = (int) (local406.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL) - local86.anInt5785 * -1994307635;
				local307 = local287 * 4 + 2 - local95 / 128;
				@Pc(472) int local472 = local297 * 4 + 2 - local99 / 128;
				Class151.method13980(arg1, local8, arg2, arg3, local307, local472, Class393.aClass100Array6[0], -939902315);
			}
		}
		Class123.method9081(arg0, local95, local99, arg1, local8, arg2, arg3, (byte) -23);
		Class108_Sub1.method5225(local95, local99, arg1, local8, arg2, arg3, -1873135844);
		Class331.method27477(local95, local99, arg1, local6, arg2, arg3, (short) 28482);
		if (Class429.anInt4942 * -1453926679 != 4) {
			if (Class172.anInt3179 * -820036969 != -1) {
				local261 = Class172.anInt3179 * 1014819420 + 2 - local95 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20009(842279579) - 1) * 2;
				local275 = Class172.anInt3174 * -879462196 + 2 - local99 / 128 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20009(1473374830) - 1) * 2;
				Class323.method27369(arg1, local8, arg2 - Class32_Sub7.anInt2393 * -1219483541, arg3 - Class106_Sub2.anInt749 * -2031220771, local261, local275, Class60.aClass100Array1[Class172.aBoolean522 ? 1 : 0], 100.0D, Class319.aClass319_3, Class328.aClass328_4, 1383377149);
			}
			if (!Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass659_1.method32979(-125905710)) {
				arg0.method20612(arg1.anInt4022 * 1215292027 / 2 + arg2 - 1, arg1.anInt4023 * -1490598249 / 2 + arg3 - 1, 3, 3, -1, (byte) 121);
			}
		}
		arg0.method20475(Class172.anIntArray269[0], Class172.anIntArray269[1], Class172.anIntArray269[2], Class172.anIntArray269[3]);
	}

	@OriginalMember(owner = "client!v", name = "p", descriptor = "(I)V")
	public static void method32091(@OriginalArg(0) int arg0) {
		Class329.aMap21.clear();
		Class329.aClass16_29.method219((byte) 127);
		Class329.aClass18_15.method245(-329638596);
		Class329.anInt4186 = 0;
	}

	@OriginalMember(owner = "client!v", name = "rv", descriptor = "(Lclient!yf;B)V")
	static void method32092(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -257666618);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class689.method36706(local16, local22, arg0, -1633511480);
	}

	@OriginalMember(owner = "client!v", name = "gc", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method32093(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.aBoolean701 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] == 1;
		Class354.method27789(arg0, -1174743804);
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class166_Sub27.method15950(arg0.anInt3994 * -1549590237, -1955325510);
		}
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	Class606() throws Throwable {
		throw new Error();
	}
}
