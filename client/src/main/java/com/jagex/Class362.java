package com.jagex;

import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class362 {

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[Lclient!jw;")
	static Class370[] aClass370Array1;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "[Lclient!jt;")
	static Interface30[] anInterface30Array1;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Ljava/lang/Thread;")
	static Thread aThread6;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "Z")
	static boolean aBoolean738;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "Ljava/lang/String;")
	static String aString196;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "Ljava/lang/String;")
	static final String aString197 = " - ";

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
	static int anInt4734 = -770058321;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Z")
	static boolean aBoolean739 = false;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	static int anInt4733 = 790545439;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "()V")
	public static void method27990() {
		if (aClass370Array1 == null) {
			aClass370Array1 = Class370.method28174(-1391471269);
			Class146.aClass370_3 = aClass370Array1[0];
			Class661.aLong305 = Class305.method26889(-140334059) * -5556977673772728225L;
		}
		if (Class653.aClass357_1 == null) {
			Class393.method28498((byte) 25);
		}
		@Pc(19) Class370 local19 = Class146.aClass370_3;
		@Pc(22) int local22 = Class533.method30785(65280);
		if (Class146.aClass370_3 == local19) {
			aString196 = Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8, (byte) -13);
			Class531.aString234 = aString196;
			if (Class146.aClass370_3.aBoolean746) {
				Class66.anInt237 = (Class146.aClass370_3.anInt4752 * 903713925 + (-1203887493 * Class146.aClass370_3.anInt4753 - Class146.aClass370_3.anInt4752 * 903713925) * local22 / 100) * -2053976653;
			}
			if (Class146.aClass370_3.aBoolean745) {
				Class531.aString234 = Class531.aString234 + " - " + Class66.anInt237 * 1453631867 + "%";
			}
		} else if (Class146.aClass370_3 == Class370.aClass370_21) {
			Class653.aClass357_1 = null;
			Class481.method29937(4, 1823202236);
			if (aBoolean739) {
				aBoolean739 = false;
				Class114.method7634(Class7.aString2, Class490.aString226, "", false, (byte) 107);
			}
		} else {
			aString196 = local19.aClass74_178.method1259(Class106.aClass717_8, (byte) -42);
			Class531.aString234 = aString196;
			if (Class146.aClass370_3.aBoolean745) {
				Class531.aString234 = Class531.aString234 + " - " + local19.anInt4753 * -1203887493 + "%";
			}
			Class66.anInt237 = local19.anInt4753 * 640981761;
			if (Class146.aClass370_3.aBoolean746 || local19.aBoolean746) {
				Class661.aLong305 = Class305.method26889(466577794) * -5556977673772728225L;
			}
		}
		if (Class653.aClass357_1 == null) {
			return;
		}
		Class653.aClass357_1.method27916(Class661.aLong305 * 3693219987677404063L, aString196, Class531.aString234, Class66.anInt237 * 1453631867, Class146.aClass370_3, (short) 174);
		if (anInterface30Array1 == null) {
			return;
		}
		for (@Pc(162) int local162 = anInt4734 * 815014065 + 1; local162 < anInterface30Array1.length; local162++) {
			if (anInterface30Array1[local162].method28113(2054591980) >= 100 && local162 - 1 == anInt4734 * 815014065 && client.anInt3435 * -849002901 != 5 && Class653.aClass357_1.method27924((byte) 53)) {
				try {
					anInterface30Array1[local162].method28104((short) 253);
				} catch (@Pc(196) Exception local196) {
					anInterface30Array1 = null;
					break;
				}
				Class653.aClass357_1.method27946(anInterface30Array1[local162], (short) 4095);
				anInt4734 += 770058321;
				if (anInt4734 * 815014065 >= anInterface30Array1.length - 1 && anInterface30Array1.length > 1) {
					anInt4734 = (Class363.aClass81_1.method1374(-976903524) ? 0 : -1) * 770058321;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "()Z")
	public static boolean method27991() {
		return aBoolean739;
	}

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "()V")
	public static void method27992() {
		aBoolean739 = true;
		Class7.aString2 = Class411.aString209;
		Class490.aString226 = Class411.aString210;
		Class642.method32703(false, (short) 3093);
		Class283.method26570((byte) 21);
		aClass370Array1 = null;
		Class275.aClass496_1 = null;
		Class481.method29937(5, 1823202236);
	}

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "()Z")
	public static boolean method27993() {
		return aBoolean739;
	}

	@OriginalMember(owner = "client!ji", name = "am", descriptor = "([B)V")
	static void method27994(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22425((short) 16384);
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method22427(-1434290800);
				Class274.aClass258_11.method26147(local19, -961237108);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "()Z")
	public static boolean method27995() {
		return aBoolean739;
	}

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "()V")
	public static void method27996() {
		if (aClass370Array1 == null) {
			aClass370Array1 = Class370.method28174(-1442929899);
			Class146.aClass370_3 = aClass370Array1[0];
			Class661.aLong305 = Class305.method26889(1876477783) * -5556977673772728225L;
		}
		if (Class653.aClass357_1 == null) {
			Class393.method28498((byte) 61);
		}
		@Pc(19) Class370 local19 = Class146.aClass370_3;
		@Pc(22) int local22 = Class533.method30785(65280);
		if (Class146.aClass370_3 == local19) {
			aString196 = Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8, (byte) 97);
			Class531.aString234 = aString196;
			if (Class146.aClass370_3.aBoolean746) {
				Class66.anInt237 = (Class146.aClass370_3.anInt4752 * 903713925 + (-1203887493 * Class146.aClass370_3.anInt4753 - Class146.aClass370_3.anInt4752 * 903713925) * local22 / 100) * -2053976653;
			}
			if (Class146.aClass370_3.aBoolean745) {
				Class531.aString234 = Class531.aString234 + " - " + Class66.anInt237 * 1453631867 + "%";
			}
		} else if (Class146.aClass370_3 == Class370.aClass370_21) {
			Class653.aClass357_1 = null;
			Class481.method29937(4, 1823202236);
			if (aBoolean739) {
				aBoolean739 = false;
				Class114.method7634(Class7.aString2, Class490.aString226, "", false, (byte) 10);
			}
		} else {
			aString196 = local19.aClass74_178.method1259(Class106.aClass717_8, (byte) -64);
			Class531.aString234 = aString196;
			if (Class146.aClass370_3.aBoolean745) {
				Class531.aString234 = Class531.aString234 + " - " + local19.anInt4753 * -1203887493 + "%";
			}
			Class66.anInt237 = local19.anInt4753 * 640981761;
			if (Class146.aClass370_3.aBoolean746 || local19.aBoolean746) {
				Class661.aLong305 = Class305.method26889(1271462060) * -5556977673772728225L;
			}
		}
		if (Class653.aClass357_1 == null) {
			return;
		}
		Class653.aClass357_1.method27916(Class661.aLong305 * 3693219987677404063L, aString196, Class531.aString234, Class66.anInt237 * 1453631867, Class146.aClass370_3, (short) 174);
		if (anInterface30Array1 == null) {
			return;
		}
		for (@Pc(162) int local162 = anInt4734 * 815014065 + 1; local162 < anInterface30Array1.length; local162++) {
			if (anInterface30Array1[local162].method28113(-752942526) >= 100 && local162 - 1 == anInt4734 * 815014065 && client.anInt3435 * -849002901 != 5 && Class653.aClass357_1.method27924((byte) 57)) {
				try {
					anInterface30Array1[local162].method28104((short) 253);
				} catch (@Pc(196) Exception local196) {
					anInterface30Array1 = null;
					break;
				}
				Class653.aClass357_1.method27946(anInterface30Array1[local162], (short) -7125);
				anInt4734 += 770058321;
				if (anInt4734 * 815014065 >= anInterface30Array1.length - 1 && anInterface30Array1.length > 1) {
					anInt4734 = (Class363.aClass81_1.method1374(1078754474) ? 0 : -1) * 770058321;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()V")
	public static void method27997() {
		if (aClass370Array1 == null) {
			aClass370Array1 = Class370.method28174(1081343309);
			Class146.aClass370_3 = aClass370Array1[0];
			Class661.aLong305 = Class305.method26889(1277800065) * -5556977673772728225L;
		}
		if (Class653.aClass357_1 == null) {
			Class393.method28498((byte) 23);
		}
		@Pc(19) Class370 local19 = Class146.aClass370_3;
		@Pc(22) int local22 = Class533.method30785(65280);
		if (Class146.aClass370_3 == local19) {
			aString196 = Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8, (byte) -20);
			Class531.aString234 = aString196;
			if (Class146.aClass370_3.aBoolean746) {
				Class66.anInt237 = (Class146.aClass370_3.anInt4752 * 903713925 + (-1203887493 * Class146.aClass370_3.anInt4753 - Class146.aClass370_3.anInt4752 * 903713925) * local22 / 100) * -2053976653;
			}
			if (Class146.aClass370_3.aBoolean745) {
				Class531.aString234 = Class531.aString234 + " - " + Class66.anInt237 * 1453631867 + "%";
			}
		} else if (Class146.aClass370_3 == Class370.aClass370_21) {
			Class653.aClass357_1 = null;
			Class481.method29937(4, 1823202236);
			if (aBoolean739) {
				aBoolean739 = false;
				Class114.method7634(Class7.aString2, Class490.aString226, "", false, (byte) 97);
			}
		} else {
			aString196 = local19.aClass74_178.method1259(Class106.aClass717_8, (byte) 55);
			Class531.aString234 = aString196;
			if (Class146.aClass370_3.aBoolean745) {
				Class531.aString234 = Class531.aString234 + " - " + local19.anInt4753 * -1203887493 + "%";
			}
			Class66.anInt237 = local19.anInt4753 * 640981761;
			if (Class146.aClass370_3.aBoolean746 || local19.aBoolean746) {
				Class661.aLong305 = Class305.method26889(-413445587) * -5556977673772728225L;
			}
		}
		if (Class653.aClass357_1 == null) {
			return;
		}
		Class653.aClass357_1.method27916(Class661.aLong305 * 3693219987677404063L, aString196, Class531.aString234, Class66.anInt237 * 1453631867, Class146.aClass370_3, (short) 174);
		if (anInterface30Array1 == null) {
			return;
		}
		for (@Pc(162) int local162 = anInt4734 * 815014065 + 1; local162 < anInterface30Array1.length; local162++) {
			if (anInterface30Array1[local162].method28113(1887866878) >= 100 && local162 - 1 == anInt4734 * 815014065 && client.anInt3435 * -849002901 != 5 && Class653.aClass357_1.method27924((byte) 80)) {
				try {
					anInterface30Array1[local162].method28104((short) 253);
				} catch (@Pc(196) Exception local196) {
					anInterface30Array1 = null;
					break;
				}
				Class653.aClass357_1.method27946(anInterface30Array1[local162], (short) 3590);
				anInt4734 += 770058321;
				if (anInt4734 * 815014065 >= anInterface30Array1.length - 1 && anInterface30Array1.length > 1) {
					anInt4734 = (Class363.aClass81_1.method1374(-1779074111) ? 0 : -1) * 770058321;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(Z)V")
	public static void method27998(@OriginalArg(0) boolean arg0) {
		if (Class653.aClass357_1 == null) {
			Class393.method28498((byte) 34);
		}
		if (arg0) {
			Class653.aClass357_1.method27912(-508395535);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	static void method27999() {
		if (Class146.aClass370_3 != null) {
			Class653.aClass357_1 = new Class357();
			Class653.aClass357_1.method27916(Class661.aLong305 * 3693219987677404063L, Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8, (byte) -29), Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8, (byte) -92), Class146.aClass370_3.anInt4752 * 903713925, Class146.aClass370_3, (short) 174);
			aThread6 = new Thread(Class653.aClass357_1, "");
			aThread6.start();
		}
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(Z)V")
	public static void method28000(@OriginalArg(0) boolean arg0) {
		if (Class653.aClass357_1 == null) {
			Class393.method28498((byte) 60);
		}
		if (arg0) {
			Class653.aClass357_1.method27912(711179283);
		}
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(Z)V")
	public static void method28001(@OriginalArg(0) boolean arg0) {
		if (Class653.aClass357_1 == null) {
			Class393.method28498((byte) 39);
		}
		if (arg0) {
			Class653.aClass357_1.method27912(1311931947);
		}
	}

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "(Z)V")
	public static void method28002(@OriginalArg(0) boolean arg0) {
		if (Class653.aClass357_1 == null) {
			Class393.method28498((byte) 124);
		}
		if (arg0) {
			Class653.aClass357_1.method27912(-666797119);
		}
	}

	@OriginalMember(owner = "client!ji", name = "ae", descriptor = "()I")
	public static int method28003() {
		return Class653.aClass357_1.method27913(609014385);
	}

	@OriginalMember(owner = "client!ji", name = "au", descriptor = "([B)V")
	static void method28004(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22425((short) 16384);
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method22427(-1434290800);
				Class274.aClass258_11.method26147(local19, -1255540297);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "al", descriptor = "()I")
	public static int method28005() {
		return Class653.aClass357_1.method27913(1571062404);
	}

	@OriginalMember(owner = "client!ji", name = "av", descriptor = "()V")
	static void method28006() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15755("2", client.aClass702_4.aString250, false, 199047110);
		Class596.aClass113_Sub1_1.method7419(local6, (byte) 19);
	}

	@OriginalMember(owner = "client!ji", name = "ac", descriptor = "()V")
	public static void method28007() {
		if (anInterface30Array1 == null) {
			return;
		}
		@Pc(3) Interface30[] local3 = anInterface30Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Interface30 local13 = local3[local5];
			local13.method28104((short) 253);
		}
	}

	@OriginalMember(owner = "client!ji", name = "ai", descriptor = "()V")
	public static void method28008() {
		if (anInterface30Array1 == null) {
			return;
		}
		@Pc(3) Interface30[] local3 = anInterface30Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Interface30 local13 = local3[local5];
			local13.method28104((short) 253);
		}
	}

	@OriginalMember(owner = "client!ji", name = "aw", descriptor = "()V")
	public static void method28009() {
		if (anInterface30Array1 == null) {
			return;
		}
		@Pc(3) Interface30[] local3 = anInterface30Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Interface30 local13 = local3[local5];
			local13.method28104((short) 253);
		}
	}

	@OriginalMember(owner = "client!ji", name = "as", descriptor = "()I")
	static int method28010() {
		@Pc(4) int local4 = Class146.aClass370_3.anInt4751 * -909097621;
		if (local4 < aClass370Array1.length - 1) {
			Class146.aClass370_3 = aClass370Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!ji", name = "at", descriptor = "()I")
	static int method28011() {
		@Pc(4) int local4 = Class146.aClass370_3.anInt4751 * -909097621;
		if (local4 < aClass370Array1.length - 1) {
			Class146.aClass370_3 = aClass370Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!ji", name = "ad", descriptor = "()I")
	static int method28012() {
		@Pc(6) int local6;
		if (Class51.aClass93_Sub36_1.aClass166_Sub45_1.method16517((byte) -58) == 0) {
			for (local6 = 0; local6 < client.anInt3448 * -1523148821; local6++) {
				if (client.anInterface66Array2[local6].method13686((byte) -99) == 's' || client.anInterface66Array2[local6].method13686((byte) -89) == 'S') {
					Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 1, (byte) 123);
					client.aBoolean608 = true;
					Class481.method29936(Class73.aClass73_9, -467876514);
					break;
				}
			}
		}
		if (Class370.aClass370_15 == Class146.aClass370_3) {
			if (Class275.aClass496_1 == null) {
				Class275.aClass496_1 = new Class496(Class520.aClass144_3, Class484.aClass493_2, Class477.aClass480_2, Class95.aBigInteger1, Class95.aBigInteger3);
			}
			if (!Class275.aClass496_1.method30213((byte) 8)) {
				return 0;
			}
			Class293.method26681(0, null, true, 1352080022);
			aBoolean738 = !Class319.method27315((byte) 110);
			Class17.aClass497_2 = Class384.method28337(aBoolean738 ? Class31.aClass31_29 : Class31.aClass31_7, false, 1, true, true, 1396836695);
			Class7.aClass497_1 = Class384.method28337(Class31.aClass31_28, false, 1, true, true, 2078237680);
			Class633.aClass497_137 = Class384.method28337(Class31.aClass31_9, false, 1, true, true, 1268864017);
			Class222.aClass497_97 = Class384.method28337(Class31.aClass31_25, true, 1, true, true, 1163366663);
		}
		@Pc(127) int local127;
		@Pc(115) boolean local115;
		if (Class370.aClass370_13 == Class146.aClass370_3) {
			local115 = Class7.aClass497_1.method30242(-1097982280);
			@Pc(119) boolean local119 = Class222.aClass497_97.method30242(-1788404118);
			local127 = Class569.aClass143_Sub1Array2[Class31.aClass31_28.method629(1426127376)].method11071(1189701933);
			@Pc(143) int local143 = local127 + Class569.aClass143_Sub1Array2[aBoolean738 ? Class31.aClass31_29.method629(1826386112) : Class31.aClass31_7.method629(1460082278)].method11071(1189701933);
			@Pc(153) int local153 = local143 + Class569.aClass143_Sub1Array2[Class31.aClass31_9.method629(1019902347)].method11071(1189701933);
			@Pc(163) int local163 = local153 + (local119 ? 100 : Class222.aClass497_97.method30239(-1774909861));
			@Pc(173) int local173 = local163 + (local115 ? 100 : Class7.aClass497_1.method30239(-1774909861));
			if (local173 != 500) {
				return local173 / 5;
			}
			Class93_Sub26.aClass645_15 = new Class645(Class222.aClass497_97);
			Class659.aClass633_1 = new Class633(Class222.aClass497_97);
			Class292.method26673(Class93_Sub26.aClass645_15, (byte) 95);
			@Pc(198) int local198 = Class51.aClass93_Sub36_1.aClass166_Sub38_1.method16333(276510846);
			Class363.aClass81_1 = new Class81(client.aClass702_4, Class106.aClass717_8, Class7.aClass497_1);
			@Pc(210) Class84[] local210 = Class363.aClass81_1.method1369(local198, -1637289281);
			if (local210.length == 0) {
				local210 = Class363.aClass81_1.method1369(0, -1513950188);
			}
			@Pc(224) Class385 local224 = new Class385(Class17.aClass497_2, Class633.aClass497_137);
			if (local210.length > 0) {
				anInterface30Array1 = new Interface30[local210.length];
				for (@Pc(233) int local233 = 0; local233 < anInterface30Array1.length; local233++) {
					anInterface30Array1[local233] = new Class366(Class363.aClass81_1.method1368(local210[local233].anInt258 * 1709991339, -2020706961), local210[local233].anInt256 * 1396449397, local210[local233].anInt257 * 1604660509, local224);
				}
			}
		}
		if (Class146.aClass370_3 == Class370.aClass370_7) {
			Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class17.aClass497_2, Class633.aClass497_137, Class173.method23812(-981389312));
		}
		@Pc(290) int local290;
		if (Class370.aClass370_8 == Class146.aClass370_3) {
			local6 = Class157.aClass462_2.method29437(-1556873080);
			local290 = Class157.aClass462_2.method29420((byte) 16);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class370.aClass370_9 == Class146.aClass370_3) {
			if (anInterface30Array1 != null && anInterface30Array1.length > 0) {
				if (anInterface30Array1[0].method28113(1423352128) < 100) {
					return 0;
				}
				if (anInterface30Array1.length > 1 && Class363.aClass81_1.method1374(1556065793) && anInterface30Array1[1].method28113(1569426037) < 100) {
					return 0;
				}
			}
			Class157.aClass462_2.method29417(client.anInterface50_1, 1664109974);
			Class520.method30520(Class694.aClass104_14, 1321684332);
			Class481.method29937(11, 1823202236);
		}
		if (Class146.aClass370_3 == Class370.aClass370_10) {
			Class110_Sub7.aClass497_22 = Class384.method28337(Class31.aClass31_6, false, 1, false, true, 1535191948);
			Class623.aClass497_136 = Class384.method28337(Class31.aClass31_17, false, 1, false, true, 1379245451);
			Class110_Sub10.aClass497_23 = Class384.method28337(Class31.aClass31_8, false, 1, false, true, 1206439519);
			Class93_Sub3.aClass497_43 = Class384.method28337(Class31.aClass31_2, false, 1, false, true, 2023569626);
			Class166_Sub45.aClass497_60 = Class384.method28337(Class31.aClass31_24, false, 1, true, true, 2060453842);
			Class621.aClass497_135 = Class384.method28337(Class31.aClass31_36, false, 1, true, true, 2067668297);
			Class200.aClass497_96 = Class384.method28337(Class31.aClass31_41, false, 1, true, true, 1334448428);
			Class166_Sub15.aClass497_59 = Class384.method28337(Class31.aClass31_18, true, 1, false, true, 2124620056);
			Class86.aClass497_15 = Class384.method28337(Class31.aClass31_10, false, 1, false, true, 1858989749);
			Class230.aClass497_99 = Class384.method28337(Class31.aClass31_38, true, 1, false, true, 1262930553);
			Class40.aClass497_4 = Class384.method28337(Class31.aClass31_5, false, 1, false, true, 1204195414);
			Class542.aClass497_129 = Class384.method28337(Class31.aClass31_3, false, 1, true, true, 1720110056);
			Class337.aClass497_103 = Class384.method28337(Class31.aClass31_22, true, 1, false, false, 1585575678);
			Class124.aClass497_93 = Class384.method28337(Class31.aClass31_31, true, 1, false, false, 1373397395);
			Class493.aClass497_124 = Class384.method28337(Class31.aClass31_11, false, 1, true, true, 1696710312);
			Class47.aClass497_6 = Class384.method28337(Class31.aClass31_42, false, 1, true, true, 1665192535);
			Class514.aClass497_128 = Class384.method28337(Class31.aClass31_20, false, 1, true, true, 2089021755);
			Class157.aClass497_49 = Class384.method28337(Class31.aClass31_14, false, 1, true, true, 1618580484);
			Class705.aClass497_141 = Class384.method28337(Class31.aClass31_15, false, 1, true, true, 1634262031);
			Class327.aClass497_102 = Class384.method28337(Class31.aClass31_16, false, 1, true, true, 2075103810);
			Class443.aClass497_115 = Class384.method28337(Class31.aClass31_27, false, 1, true, true, 1441406268);
			Class144_Sub1.aClass497_42 = Class384.method28337(Class31.aClass31_1, true, 1, false, false, 1920094717);
			Class710.aClass497_143 = Class384.method28337(Class31.aClass31_32, true, 1, false, true, 1828636980);
			Class486.aClass497_123 = Class384.method28337(Class31.aClass31_19, false, 1, true, true, 1435935151);
			Class304.aClass497_101 = Class384.method28337(Class31.aClass31_23, false, 1, true, true, 1693857009);
			Class108_Sub1.aClass497_19 = Class384.method28337(Class31.aClass31_21, true, 1, true, true, 1639109741);
			Class577.aClass497_130 = Class384.method28337(Class31.aClass31_13, false, 1, true, true, 1598674689);
			Class75.aClass497_11 = Class384.method28337(Class31.aClass31_12, false, 1, true, true, 1418869780);
			Class446.aClass497_117 = Class384.method28337(Class31.aClass31_30, true, 1, false, true, 1869714059);
			Class590.aClass497_133 = Class384.method28337(Class31.aClass31_4, true, 1, false, true, 2015502884);
			Class364.aClass497_105 = Class384.method28337(Class31.aClass31_26, true, 1, true, true, 1785628596);
		}
		if (Class370.aClass370_22 == Class146.aClass370_3) {
			local6 = 0;
			local290 = 0;
			for (local127 = 0; local127 < Class569.aClass143_Sub1Array2.length; local127++) {
				if (Class569.aClass143_Sub1Array2[local127] != null) {
					local6 += Class569.aClass143_Sub1Array2[local127].method11071(1189701933);
					local290++;
				}
			}
			if (local290 > 0) {
				local6 /= local290;
			}
			if (local6 != 100) {
				if (anInt4733 * -31438815 < 0) {
					anInt4733 = local6 * -790545439;
				}
				return (local6 - anInt4733 * -31438815) * 100 / (100 - anInt4733 * -31438815);
			}
			Class110_Sub4.method7302(Class93_Sub26.aClass645_15, 2006298776);
			Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class110_Sub7.aClass497_22, Class633.aClass497_137, Class173.method23812(1245252651));
		}
		if (Class146.aClass370_3 == Class370.aClass370_11) {
			@Pc(677) byte[] local677 = Class222.aClass497_97.method30240(Class649.aClass649_5.anInt5956 * -51136173, (byte) 93);
			if (local677 == null) {
				return 0;
			}
			Class274.aClass258_11 = new Class258();
			Class274.aClass258_11.method26124(50, 7340032, 228413960);
			Class151.method13979(local677, (byte) 16);
			Class481.method29937(1, 1823202236);
		}
		if (Class146.aClass370_3 == Class370.aClass370_12 && Class125_Sub1.aClass586_1 == null) {
			Class125_Sub1.aClass586_1 = new Class586(Class590.aClass497_133);
			Class43.method843(Class125_Sub1.aClass586_1, -1720462999);
		}
		if (Class370.aClass370_5 == Class146.aClass370_3) {
			local6 = Class378.method28250(-2016856404);
			if (local6 < 100) {
				return local6;
			}
			Class27.method585(Class222.aClass497_97.method30240(Class649.aClass649_1.anInt5956 * -51136173, (byte) 24), (byte) -64);
			Class618.aShortArrayArray6 = Class93_Sub26.aClass645_15.aShortArrayArray8;
			Class111.aShortArrayArrayArray3 = Class93_Sub26.aClass645_15.aShortArrayArrayArray8;
			Class138_Sub3.aShortArrayArray4 = Class93_Sub26.aClass645_15.aShortArrayArray7;
			Class79_Sub1_Sub2.aShortArrayArrayArray1 = Class93_Sub26.aClass645_15.aShortArrayArrayArray9;
			if (Class93_Sub26.aClass645_15.anInt5935 * 68799883 != -1 && Class93_Sub26.aClass645_15.anInt5936 * 810262785 != -1) {
				client.anInt3511 = Class93_Sub26.aClass645_15.anInt5935 * -1828737035;
				client.anInt3512 = Class93_Sub26.aClass645_15.anInt5936 * 1053772179;
			}
			Class113.aClass651_2 = new Class651(Class222.aClass497_97);
			Class336.aClass644_1 = new Class644(Class222.aClass497_97);
			Class288.aClass636_1 = new Class636(Class222.aClass497_97);
			Class119.aClass650_2 = new Class650(Class222.aClass497_97);
			Class159.aClass637_2 = new Class637(Class222.aClass497_97);
		}
		if (Class370.aClass370_14 == Class146.aClass370_3) {
			if (-742728449 * Class93_Sub26.aClass645_15.anInt5934 != -1 && !Class86.aClass497_15.method30234(Class93_Sub26.aClass645_15.anInt5934 * -742728449, 0, 563965652)) {
				return 99;
			}
			Class619.aClass225_8 = new Class225(Class108_Sub1.aClass497_19);
			Class636.anInterface24_10 = new Class111_Sub1(Class230.aClass497_99);
			Class124.aClass32_Sub21_7 = new Class32_Sub21(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class166_Sub6.aClass32_Sub5_1 = new Class32_Sub5(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class311.aClass32_Sub6_1 = new Class32_Sub6(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class74.aClass32_2 = new Class32(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class667.aClass667_73, 64, new Class52(Class30.class));
			Class276.aClass32_3 = new Class32(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class667.aClass667_72, 16, new Class52(Class77.class));
			Class19.aClass32_Sub7_5 = new Class32_Sub7(client.aClass702_4, Class106.aClass717_8, Class47.aClass497_6);
			Class682.aClass32_Sub1_3 = new Class32_Sub1(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class692.aClass32_Sub4_3 = new Class32_Sub4(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class366.aClass32_Sub8_1 = new Class32_Sub8(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class534.aClass32_Sub10_1 = new Class32_Sub10(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class343.aClass32_Sub19_1 = new Class32_Sub19(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class86.aClass497_15);
			Class638.aClass32_Sub22_1 = new Class32_Sub22(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class668.aClass32_Sub15_1 = new Class32_Sub15(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class273.aClass32_Sub14_8 = new Class32_Sub14(client.aClass702_4, Class106.aClass717_8, true, Class493.aClass497_124, Class86.aClass497_15);
			client.aClass532_1.method30630(Class273.aClass32_Sub14_8, 2087680265);
			Class392.aClass541_1.method31083(new Class32_Sub14(client.aClass702_4, Class106.aClass717_8, true, Class493.aClass497_124, Class86.aClass497_15), -1260583342);
			Class542.aClass32_Sub2_3 = new Class32_Sub2(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class466.aClass32_Sub20_3 = new Class32_Sub20(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class162.aClass32_Sub3_2 = new Class32_Sub3(client.aClass702_4, Class106.aClass717_8, true, Class514.aClass497_128, Class86.aClass497_15);
			Class277.aClass32_Sub12_1 = new Class32_Sub12(client.aClass702_4, Class106.aClass717_8, true, Class124.aClass32_Sub21_7, Class157.aClass497_49, Class86.aClass497_15);
			Class288.aClass55_Sub2_1 = new Class55_Sub2(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, true);
			client.aClass32_Sub13_1 = new Class32_Sub13(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class32.aClass32_Sub17_23 = new Class32_Sub17(client.aClass702_4, Class106.aClass717_8, Class705.aClass497_141, Class623.aClass497_136, Class110_Sub10.aClass497_23, Class93_Sub3.aClass497_43, client.aClass32_Sub13_1);
			Class123.aClass32_Sub11_2 = new Class32_Sub11(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class51.aClass32_Sub9_1 = new Class32_Sub9(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class501.aClass32_Sub18_1 = new Class32_Sub18(client.aClass702_4, Class106.aClass717_8, Class327.aClass497_102, Class86.aClass497_15);
			Class649.aClass55_Sub1_1 = new Class55_Sub1(client.aClass702_4, Class106.aClass717_8, Class443.aClass497_115, true);
			Class72.aClass79_Sub1_Sub2_2 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_63, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class21.aClass79_Sub1_Sub1_1 = new Class79_Sub1_Sub1(client.aClass702_4, Class138.aClass138_65, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class684.aClass79_Sub1_Sub2_7 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_67, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class39.aClass79_Sub1_Sub2_1 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_71, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_68, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class429.aClass79_Sub1_Sub2_5 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_70, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class265.aClass79_Sub1_Sub2_4 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_72, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class96.aMap9 = Class85.method1445(new Class79_Sub1[] { Class72.aClass79_Sub1_Sub2_2, Class21.aClass79_Sub1_Sub1_1, Class684.aClass79_Sub1_Sub2_7, Class39.aClass79_Sub1_Sub2_1, Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3, Class429.aClass79_Sub1_Sub2_5, Class265.aClass79_Sub1_Sub2_4 }, (short) 2105);
			Class30.aClass32_Sub16_1 = new Class32_Sub16(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class96.aMap9);
			Class506.anInterface21_4 = new Class367();
			Class283.method26569(Class200.aClass497_96, Class86.aClass497_15, Class110_Sub7.aClass497_22, Class633.aClass497_137, -1002953568);
			Class81.aClass451_1 = new Class451(Class75.aClass497_11);
			Class283.aClass444_1 = new Class444(Class577.aClass497_130);
			Class599.aClass438_1 = new Class438(Class577.aClass497_130);
			Class449.aClass514_1 = new Class514(Class106.aClass717_8, Class486.aClass497_123, Class304.aClass497_101);
			Class372.aClass58_2 = new Class58(Class106.aClass717_8, Class486.aClass497_123, Class304.aClass497_101, new Class452());
			Class624.aClass120_1 = new Class120(Class21.aClass79_Sub1_Sub1_1, Class30.aClass32_Sub16_1, Class336.aClass644_1.method32775(1062924354));
			Class610.method32202(-1539114738);
			Class450.method29119(Class32.aClass32_Sub17_23, 923638569);
			Class120.method8671(Class599.aClass438_1, Class283.aClass444_1, 360743183);
			Class711.method36994(Class86.aClass497_15, Class619.aClass225_8, Class636.anInterface24_10, -1382698815);
			@Pc(1211) Class337 local1211 = new Class337(Class40.aClass497_4.method30252("huffman", "", 1200487767));
			Class339.method27582(local1211, (byte) 7);
			Class553.aClass147_2 = Class450.method29114(-1487098882);
			Class125_Sub3.aClass93_Sub42_1 = new Class93_Sub42(true);
		}
		if (Class370.aClass370_20 == Class146.aClass370_3) {
			local6 = Class96_Sub3.method2329(Class110_Sub7.aClass497_22, -615121503) + Class157.aClass462_2.method29448(true, -2009106133);
			local290 = Class15.method213(1309444066) + Class157.aClass462_2.method29420((byte) 16);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class146.aClass370_3 == Class370.aClass370_16) {
			Class159.method14503(Class144_Sub1.aClass497_42, Class710.aClass497_143, Class682.aClass32_Sub1_3, Class692.aClass32_Sub4_3, client.aClass532_1.method30647(1847782911), Class542.aClass32_Sub2_3, Class466.aClass32_Sub20_3, Class624.aClass120_1, Class624.aClass120_1);
		}
		if (Class146.aClass370_3 == Class370.aClass370_17) {
			Class596.aClass113_Sub1_1 = new Class113_Sub1(Class72.aClass79_Sub1_Sub2_2);
			Class605.method32086(-19928304);
			Class266.aClass306_1 = Class166_Sub29.method16081(1398347037);
			Class166_Sub15.aClass497_59.method30246(false, true, (byte) 4);
			Class110_Sub7.aClass497_22.method30246(true, true, (byte) 122);
			Class633.aClass497_137.method30246(true, true, (byte) 64);
			Class40.aClass497_4.method30246(true, true, (byte) 88);
			client.aBoolean605 = true;
		}
		if (Class146.aClass370_3 == Class370.aClass370_18 && Class93_Sub26.aClass645_15.anInt5927 * -221025663 != -1) {
			if (!Class383.method28326(Class93_Sub26.aClass645_15.anInt5927 * -221025663, null, 1239101309)) {
				return 0;
			}
			local115 = true;
			for (local290 = 0; local290 < Class166_Sub1.aClass320Array1[Class93_Sub26.aClass645_15.anInt5927 * -221025663].aClass312Array3.length; local290++) {
				@Pc(1343) Class312 local1343 = Class166_Sub1.aClass320Array1[Class93_Sub26.aClass645_15.anInt5927 * -221025663].aClass312Array3[local290];
				if (local1343.anInt4012 * -158526639 == 5 && local1343.anInt4036 * -1566573331 != -1 && !Class110_Sub7.aClass497_22.method30234(local1343.anInt4036 * -1566573331, 0, 1661098302)) {
					local115 = false;
				}
			}
			if (!local115) {
				return 0;
			}
		}
		if (Class370.aClass370_19 == Class146.aClass370_3) {
			Class138.method11537(true, -654926472);
		}
		if (Class146.aClass370_3 == Class370.aClass370_6) {
			Class653.aClass357_1.method27923((byte) -36);
			try {
				aThread6.join();
			} catch (@Pc(1388) InterruptedException local1388) {
				return 0;
			}
			Class653.aClass357_1 = null;
			aThread6 = null;
			Class17.aClass497_2 = null;
			Class7.aClass497_1 = null;
			Class363.aClass81_1 = null;
			anInterface30Array1 = null;
			Class14.aMap1.remove(Class31.aClass31_28);
			Class14.aMap1.remove(Class31.aClass31_7);
			Class14.aMap1.remove(Class31.aClass31_29);
			Class699.method36888((byte) 58);
			client.aBoolean597 = Class51.aClass93_Sub36_1.aClass166_Sub45_1.method16517((byte) 0) == 1;
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 1, (byte) 73);
			if (client.aBoolean597) {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 74);
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub4_1.aBoolean366 && Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 < 512 && Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 != 0) {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 65);
			}
			Class106_Sub1.method5148(-614504810);
			if (client.aBoolean597) {
				Class543.method31129(0, false, 1945646779);
				if (!client.aBoolean608) {
					Class481.method29936(Class73.aClass73_10, -1763069906);
				}
			} else {
				Class543.method31129(Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15436((byte) 95), false, 1945646779);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15436((byte) 84) == 0) {
					Class481.method29936(Class73.aClass73_11, -855862138);
				}
			}
			Class717.method37076(Class51.aClass93_Sub36_1.aClass166_Sub23_1.method15856(1474666360), -1, -1, false, (byte) 106);
			Class157.aClass462_2.method29417(client.anInterface50_1, 1664109974);
			Class520.method30520(Class694.aClass104_14, 780062317);
			Class379.method28282(Class694.aClass104_14, Class110_Sub7.aClass497_22, 1001975439);
		}
		return Class300.method26810(-1299130735);
	}

	@OriginalMember(owner = "client!ji", name = "ar", descriptor = "([B)V")
	static void method28013(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22425((short) 16384);
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method22427(-1434290800);
				Class274.aClass258_11.method26147(local19, 962574703);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "ah", descriptor = "()I")
	public static int method28014() {
		return Class653.aClass357_1.method27913(1934465735);
	}

	@OriginalMember(owner = "client!ji", name = "aj", descriptor = "()V")
	static void method28015() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15755("2", client.aClass702_4.aString250, false, 199047110);
		Class596.aClass113_Sub1_1.method7419(local6, (byte) 38);
	}

	@OriginalMember(owner = "client!ji", name = "ap", descriptor = "([B)V")
	static void method28016(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22425((short) 16384);
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method22427(-1434290800);
				Class274.aClass258_11.method26147(local19, -637073210);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "aq", descriptor = "()V")
	static void method28017() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15755("2", client.aClass702_4.aString250, false, 199047110);
		Class596.aClass113_Sub1_1.method7419(local6, (byte) 28);
	}

	@OriginalMember(owner = "client!ji", name = "ax", descriptor = "()V")
	static void method28018() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15755("2", client.aClass702_4.aString250, false, 199047110);
		Class596.aClass113_Sub1_1.method7419(local6, (byte) 79);
	}

	@OriginalMember(owner = "client!ji", name = "ag", descriptor = "()I")
	public static int method28019() {
		return Class653.aClass357_1.method27913(1393454301);
	}

	@OriginalMember(owner = "client!ji", name = "ao", descriptor = "()V")
	static void method28020() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15755("2", client.aClass702_4.aString250, false, 199047110);
		Class596.aClass113_Sub1_1.method7419(local6, (byte) 100);
	}

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "()V")
	public static void method28021() {
		aBoolean739 = true;
		Class7.aString2 = Class411.aString209;
		Class490.aString226 = Class411.aString210;
		Class642.method32703(false, (short) 17177);
		Class283.method26570((byte) -34);
		aClass370Array1 = null;
		Class275.aClass496_1 = null;
		Class481.method29937(5, 1823202236);
	}

	@OriginalMember(owner = "client!ji", name = "ay", descriptor = "()V")
	public static void method28022() {
		if (Class653.aClass357_1 != null) {
			Class653.aClass357_1.method27923((byte) -76);
		}
		if (aThread6 == null) {
			return;
		}
		while (true) {
			try {
				aThread6.join();
				break;
			} catch (@Pc(10) InterruptedException local10) {
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "oj", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method28023(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray28 = Class499.method30329(local13, arg2, -160433659);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!ji", name = "agd", descriptor = "(Lclient!yf;I)V")
	static void method28024(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(29) Class47 local29 = (Class47) Class277.aClass32_Sub12_1.method18273(local13, -1140004431);
		if (local23 < 1 || local23 > 5 || local29.aStringArray5[local23 - 1] == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local29.aStringArray5[local23 - 1];
		}
	}

	@OriginalMember(owner = "client!ji", name = "ate", descriptor = "(Lclient!yf;B)V")
	static void method28025(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 22102);
	}

	@OriginalMember(owner = "client!ji", name = "awe", descriptor = "(Lclient!yf;B)V")
	static void method28026(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3526 * -703563959;
	}

	@OriginalMember(owner = "client!ji", name = "bfv", descriptor = "(Lclient!yf;I)V")
	static void method28027(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ji", name = "nk", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method28028(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30329(local13, arg2, 333482014);
	}

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "(JIZB)Ljava/lang/String;")
	static String method28029(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class543.method31128(arg0);
			local5 = Class69.aCalendar2;
		} else {
			Class337.method27552(arg0);
			local5 = Class69.aCalendar1;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(20) int local20 = local5.get(2) + 1;
		@Pc(24) int local24 = local5.get(1);
		@Pc(28) int local28 = local5.get(11);
		@Pc(32) int local32 = local5.get(12);
		return Integer.toString(local14 / 10) + local14 % 10 + "/" + local20 / 10 + local20 % 10 + "/" + local24 % 100 / 10 + local24 % 10 + " " + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
	}

	@OriginalMember(owner = "client!ji", name = "acr", descriptor = "(Lclient!yf;I)V")
	static void method28030(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = arg0.aClass386_3.aStringArray33[local12];
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	Class362() throws Throwable {
		throw new Error();
	}
}
