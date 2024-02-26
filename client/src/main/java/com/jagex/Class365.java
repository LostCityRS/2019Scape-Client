package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class365 {

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "[Lclient!jo;")
	static Interface30[] anInterface30Array1;

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "[Lclient!jh;")
	static Class360[] aClass360Array1;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "Lclient!pf;")
	static Class480 aClass480_98;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Lclient!jh;")
	static Class360 aClass360_19;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Lclient!jx;")
	public static Class369 aClass369_1;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "Ljava/lang/Thread;")
	static Thread aThread7;

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "Ljava/lang/String;")
	static final String aString197 = " - ";

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "Lclient!pf;")
	static Class480 aClass480_99;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "Z")
	static boolean aBoolean840;

	@OriginalMember(owner = "client!jn", name = "ag", descriptor = "Lclient!sn;")
	protected static Class555 aClass555_1;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
	static int anInt4499 = 1865098465;

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "Z")
	static boolean aBoolean839 = false;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	static int anInt4500 = 2035185345;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "()V")
	static void method28222() {
		if (aClass360_19 != null) {
			aClass369_1 = new Class369();
			aClass369_1.method28301(Exception_Sub7.aLong155 * -6524789075775222403L, aClass360_19.aClass60_177.method1180(Class512.aClass719_3, -1603493168), aClass360_19.aClass60_177.method1180(Class512.aClass719_3, 264824017), aClass360_19.anInt4491 * 171081043, aClass360_19, 1971564201);
			aThread7 = new Thread(aClass369_1, "");
			aThread7.start();
		}
	}

	@OriginalMember(owner = "client!jn", name = "ah", descriptor = "()V")
	public static void method28223() {
		if (aClass369_1 != null) {
			aClass369_1.method28308(161720551);
		}
		if (aThread7 == null) {
			return;
		}
		while (true) {
			try {
				aThread7.join();
				break;
			} catch (@Pc(10) InterruptedException local10) {
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "r", descriptor = "()V")
	public static void method28224() {
		aBoolean839 = true;
		Class362.aString196 = Class238.aString154;
		Class672.aString235 = Class238.aString155;
		Class266.method26657(false, (short) 11890);
		Class305.method27205(-1236463393);
		aClass360Array1 = null;
		Class279.aClass491_1 = null;
		Class604.method32148(5, 1467515659);
	}

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "()V")
	public static void method28225() {
		aBoolean839 = true;
		Class362.aString196 = Class238.aString154;
		Class672.aString235 = Class238.aString155;
		Class266.method26657(false, (short) 23649);
		Class305.method27205(-1236463393);
		aClass360Array1 = null;
		Class279.aClass491_1 = null;
		Class604.method32148(5, -258852429);
	}

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "()V")
	public static void method28226() {
		aBoolean839 = true;
		Class362.aString196 = Class238.aString154;
		Class672.aString235 = Class238.aString155;
		Class266.method26657(false, (short) 3468);
		Class305.method27205(-1236463393);
		aClass360Array1 = null;
		Class279.aClass491_1 = null;
		Class604.method32148(5, -133019846);
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "()Z")
	public static boolean method28227() {
		return aBoolean839;
	}

	@OriginalMember(owner = "client!jn", name = "z", descriptor = "()Z")
	public static boolean method28228() {
		return aBoolean839;
	}

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "()Z")
	public static boolean method28229() {
		return aBoolean839;
	}

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "()V")
	public static void method28230() {
		if (aClass360Array1 == null) {
			aClass360Array1 = Class360.method28143(-969638921);
			aClass360_19 = aClass360Array1[0];
			Exception_Sub7.aLong155 = Class303.method27111((byte) 54) * 3348525561735091157L;
		}
		if (aClass369_1 == null) {
			Class699.method37064(-1666881060);
		}
		@Pc(19) Class360 local19 = aClass360_19;
		@Pc(22) int local22 = Class11.method334(-1486132722);
		if (local19 == aClass360_19) {
			Class103_Sub2.aString24 = aClass360_19.aClass60_177.method1180(Class512.aClass719_3, 380376789);
			Class348.aString192 = Class103_Sub2.aString24;
			if (aClass360_19.aBoolean836) {
				Class8.anInt17 = (aClass360_19.anInt4491 * 171081043 + (aClass360_19.anInt4489 * 622296769 - aClass360_19.anInt4491 * 171081043) * local22 / 100) * -1849714223;
			}
			if (aClass360_19.aBoolean837) {
				Class348.aString192 = Class348.aString192 + " - " + Class8.anInt17 * 1829723953 + "%";
			}
		} else if (aClass360_19 == Class360.aClass360_18) {
			aClass369_1 = null;
			Class604.method32148(4, -72823714);
			if (aBoolean839) {
				aBoolean839 = false;
				Class60.method1183(Class362.aString196, Class672.aString235, "", false, (byte) 4);
			}
		} else {
			Class103_Sub2.aString24 = local19.aClass60_178.method1180(Class512.aClass719_3, -947703991);
			Class348.aString192 = Class103_Sub2.aString24;
			if (aClass360_19.aBoolean837) {
				Class348.aString192 = Class348.aString192 + " - " + local19.anInt4489 * 622296769 + "%";
			}
			Class8.anInt17 = local19.anInt4489 * 904844433;
			if (aClass360_19.aBoolean836 || local19.aBoolean836) {
				Exception_Sub7.aLong155 = Class303.method27111((byte) 44) * 3348525561735091157L;
			}
		}
		if (aClass369_1 == null) {
			return;
		}
		aClass369_1.method28301(Exception_Sub7.aLong155 * -6524789075775222403L, Class103_Sub2.aString24, Class348.aString192, Class8.anInt17 * 1829723953, aClass360_19, 1875012646);
		if (anInterface30Array1 == null) {
			return;
		}
		for (@Pc(161) int local161 = anInt4499 * 669442271 + 1; local161 < anInterface30Array1.length; local161++) {
			if (anInterface30Array1[local161].method28351(-1936916266) >= 100 && anInt4499 * 669442271 == local161 - 1 && client.anInt3433 * 1994758437 != 5 && aClass369_1.method28327(2071904699)) {
				try {
					anInterface30Array1[local161].method28342(1375593797);
				} catch (@Pc(195) Exception local195) {
					anInterface30Array1 = null;
					break;
				}
				aClass369_1.method28300(anInterface30Array1[local161], (byte) 89);
				anInt4499 += -1865098465;
				if (anInt4499 * 669442271 >= anInterface30Array1.length - 1 && anInterface30Array1.length > 1) {
					anInt4499 = (Class384.aClass90_1.method1860((byte) 88) ? 0 : -1) * -1865098465;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "aj", descriptor = "()I")
	static int method28231() {
		@Pc(4) int local4 = aClass360_19.anInt4490 * 1975723063;
		if (local4 < aClass360Array1.length - 1) {
			aClass360_19 = aClass360Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "()V")
	public static void method28232() {
		aBoolean839 = true;
		Class362.aString196 = Class238.aString154;
		Class672.aString235 = Class238.aString155;
		Class266.method26657(false, (short) 19025);
		Class305.method27205(-1236463393);
		aClass360Array1 = null;
		Class279.aClass491_1 = null;
		Class604.method32148(5, -478879356);
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "()V")
	static void method28233() {
		if (aClass360_19 != null) {
			aClass369_1 = new Class369();
			aClass369_1.method28301(Exception_Sub7.aLong155 * -6524789075775222403L, aClass360_19.aClass60_177.method1180(Class512.aClass719_3, -2054530778), aClass360_19.aClass60_177.method1180(Class512.aClass719_3, -438266618), aClass360_19.anInt4491 * 171081043, aClass360_19, 2067156936);
			aThread7 = new Thread(aClass369_1, "");
			aThread7.start();
		}
	}

	@OriginalMember(owner = "client!jn", name = "ax", descriptor = "(Z)V")
	public static void method28234(@OriginalArg(0) boolean arg0) {
		if (aClass369_1 == null) {
			Class699.method37064(-1001428569);
		}
		if (arg0) {
			aClass369_1.method28298(688796517);
		}
	}

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "()V")
	public static void method28235() {
		aBoolean839 = true;
		Class362.aString196 = Class238.aString154;
		Class672.aString235 = Class238.aString155;
		Class266.method26657(false, (short) 17177);
		Class305.method27205(-1236463393);
		aClass360Array1 = null;
		Class279.aClass491_1 = null;
		Class604.method32148(5, -1417400050);
	}

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "()V")
	static void method28236() {
		if (aClass360_19 != null) {
			aClass369_1 = new Class369();
			aClass369_1.method28301(Exception_Sub7.aLong155 * -6524789075775222403L, aClass360_19.aClass60_177.method1180(Class512.aClass719_3, -2054528641), aClass360_19.aClass60_177.method1180(Class512.aClass719_3, -159714471), aClass360_19.anInt4491 * 171081043, aClass360_19, 2055615643);
			aThread7 = new Thread(aClass369_1, "");
			aThread7.start();
		}
	}

	@OriginalMember(owner = "client!jn", name = "ai", descriptor = "()I")
	public static int method28237() {
		return aClass369_1.method28297(-1575369813);
	}

	@OriginalMember(owner = "client!jn", name = "aq", descriptor = "()I")
	public static int method28238() {
		return aClass369_1.method28297(-1047587798);
	}

	@OriginalMember(owner = "client!jn", name = "ao", descriptor = "()V")
	public static void method28239() {
		if (anInterface30Array1 == null) {
			return;
		}
		@Pc(3) Interface30[] local3 = anInterface30Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Interface30 local13 = local3[local5];
			local13.method28342(1480936911);
		}
	}

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "()V")
	static void method28240() {
		if (aClass360_19 != null) {
			aClass369_1 = new Class369();
			aClass369_1.method28301(Exception_Sub7.aLong155 * -6524789075775222403L, aClass360_19.aClass60_177.method1180(Class512.aClass719_3, 2102883011), aClass360_19.aClass60_177.method1180(Class512.aClass719_3, 2031354389), aClass360_19.anInt4491 * 171081043, aClass360_19, 1852410967);
			aThread7 = new Thread(aClass369_1, "");
			aThread7.start();
		}
	}

	@OriginalMember(owner = "client!jn", name = "ac", descriptor = "()I")
	static int method28241() {
		@Pc(6) int local6;
		if (Class703.aClass80_Sub37_49.aClass165_Sub44_1.method16875(963091426) == 0) {
			for (local6 = 0; local6 < client.anInt3444 * 200884815; local6++) {
				if (client.anInterface63Array2[local6].method14074(1177850358) == 's' || client.anInterface63Array2[local6].method14074(-1756357230) == 'S') {
					Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 1, (byte) 32);
					client.aBoolean710 = true;
					Class80.method24400(Class68.aClass68_9, (byte) 0);
					break;
				}
			}
		}
		if (aClass360_19 == Class360.aClass360_16) {
			if (Class279.aClass491_1 == null) {
				Class279.aClass491_1 = new Class491(Class108_Sub2.aClass139_8, Class411.aClass490_2, Class504.aClass495_3, Class174.aBigInteger3, Class174.aBigInteger4);
			}
			if (!Class279.aClass491_1.method30244(-1327369601)) {
				return 0;
			}
			Class430.method29085(0, null, true, (byte) 0);
			aBoolean840 = !Class317.method27512((byte) -77);
			aClass480_98 = Class103_Sub4.method7625(aBoolean840 ? Class32.aClass32_29 : Class32.aClass32_27, false, 1, true, true, -2050133781);
			aClass480_99 = Class103_Sub4.method7625(Class32.aClass32_28, false, 1, true, true, -1881366478);
			Class569.aClass480_124 = Class103_Sub4.method7625(Class32.aClass32_10, false, 1, true, true, -1634675983);
			Class329.aClass480_95 = Class103_Sub4.method7625(Class32.aClass32_41, true, 1, true, true, -1551733828);
		}
		@Pc(126) int local126;
		@Pc(114) boolean local114;
		if (aClass360_19 == Class360.aClass360_2) {
			local114 = aClass480_99.method29956(2125728174);
			@Pc(118) boolean local118 = Class329.aClass480_95.method29956(2066985932);
			local126 = Class626.aClass141_Sub1Array2[Class32.aClass32_28.method683(1031949211)].method10910((byte) 11);
			@Pc(142) int local142 = local126 + Class626.aClass141_Sub1Array2[aBoolean840 ? Class32.aClass32_29.method683(1485312006) : Class32.aClass32_27.method683(-820880728)].method10910((byte) 106);
			@Pc(152) int local152 = local142 + Class626.aClass141_Sub1Array2[Class32.aClass32_10.method683(-1369882363)].method10910((byte) 57);
			@Pc(162) int local162 = local152 + (local118 ? 100 : Class329.aClass480_95.method29936(-569724140));
			@Pc(172) int local172 = local162 + (local114 ? 100 : aClass480_99.method29936(938029845));
			if (local172 != 500) {
				return local172 / 5;
			}
			Class698.aClass638_1 = new Class638(Class329.aClass480_95);
			Class270.aClass647_1 = new Class647(Class329.aClass480_95);
			Class689.method36955(Class698.aClass638_1, 1410719748);
			@Pc(197) int local197 = Class703.aClass80_Sub37_49.aClass165_Sub28_1.method16420(-598832910);
			Class384.aClass90_1 = new Class90(client.aClass722_4, Class512.aClass719_3, aClass480_99);
			@Pc(209) Class92[] local209 = Class384.aClass90_1.method1856(local197, 2076523414);
			if (local209.length == 0) {
				local209 = Class384.aClass90_1.method1856(0, 2076523414);
			}
			@Pc(224) Class381 local224 = new Class381(aClass480_98, Class569.aClass480_124);
			if (local209.length > 0) {
				anInterface30Array1 = new Interface30[local209.length];
				for (@Pc(233) int local233 = 0; local233 < anInterface30Array1.length; local233++) {
					anInterface30Array1[local233] = new Class364(Class384.aClass90_1.method1857(local209[local233].anInt327 * -1665702563, -1174710433), local209[local233].anInt326 * 1955972077, local209[local233].anInt328 * 945449557, local224);
				}
			}
		}
		if (Class360.aClass360_3 == aClass360_19) {
			Class317.aClass464_1 = new Class464(Class279.aClass102_9, aClass480_98, Class569.aClass480_124, Class546.method31209(-1108570160));
		}
		@Pc(290) int local290;
		if (Class360.aClass360_10 == aClass360_19) {
			local6 = Class317.aClass464_1.method29608((byte) 54);
			local290 = Class317.aClass464_1.method29592(-1281389959);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (aClass360_19 == Class360.aClass360_4) {
			if (anInterface30Array1 != null && anInterface30Array1.length > 0) {
				if (anInterface30Array1[0].method28351(-2016371307) < 100) {
					return 0;
				}
				if (anInterface30Array1.length > 1 && Class384.aClass90_1.method1860((byte) 50) && anInterface30Array1[1].method28351(-1949315670) < 100) {
					return 0;
				}
			}
			Class317.aClass464_1.method29589(client.anInterface49_1, -741423409);
			Class440.method29165(Class279.aClass102_9, -148161080);
			Class604.method32148(11, -1785443154);
		}
		if (Class360.aClass360_1 == aClass360_19) {
			Class708.aClass480_136 = Class103_Sub4.method7625(Class32.aClass32_7, false, 1, false, true, -1117940294);
			Class297.aClass480_92 = Class103_Sub4.method7625(Class32.aClass32_15, false, 1, false, true, -1373282272);
			Class578.aClass480_125 = Class103_Sub4.method7625(Class32.aClass32_32, false, 1, false, true, -2032415651);
			Class380.aClass480_105 = Class103_Sub4.method7625(Class32.aClass32_42, false, 1, false, true, -999461276);
			Class171.aClass480_82 = Class103_Sub4.method7625(Class32.aClass32_24, false, 1, true, true, -1666356701);
			Class688.aClass480_135 = Class103_Sub4.method7625(Class32.aClass32_36, false, 1, true, true, -1515026714);
			Class104_Sub2.aClass480_16 = Class103_Sub4.method7625(Class32.aClass32_4, false, 1, true, true, -790491349);
			Class325.aClass480_94 = Class103_Sub4.method7625(Class32.aClass32_5, true, 1, false, true, -1887724229);
			Class626.aClass480_129 = Class103_Sub4.method7625(Class32.aClass32_2, false, 1, false, true, -1521592237);
			Class270.aClass480_89 = Class103_Sub4.method7625(Class32.aClass32_1, true, 1, false, true, -1773498798);
			client.aClass480_83 = Class103_Sub4.method7625(Class32.aClass32_8, false, 1, false, true, -2096637763);
			Class438.aClass480_112 = Class103_Sub4.method7625(Class32.aClass32_9, false, 1, true, true, -1200404604);
			Class9.aClass480_1 = Class103_Sub4.method7625(Class32.aClass32_14, true, 1, false, false, -1803865851);
			Class238.aClass480_88 = Class103_Sub4.method7625(Class32.aClass32_31, true, 1, false, false, -1585947228);
			Class223.aClass480_84 = Class103_Sub4.method7625(Class32.aClass32_11, false, 1, true, true, -1989854599);
			Class56.aClass480_7 = Class103_Sub4.method7625(Class32.aClass32_12, false, 1, true, true, -750088375);
			Class352.aClass480_97 = Class103_Sub4.method7625(Class32.aClass32_13, false, 1, true, true, -1914634911);
			Class231.aClass480_86 = Class103_Sub4.method7625(Class32.aClass32_25, false, 1, true, true, -1292849791);
			Class143_Sub3.aClass480_34 = Class103_Sub4.method7625(Class32.aClass32_3, false, 1, true, true, -1218954983);
			Class83.aClass480_12 = Class103_Sub4.method7625(Class32.aClass32_16, false, 1, true, true, -1894994361);
			Class228.aClass480_85 = Class103_Sub4.method7625(Class32.aClass32_17, false, 1, true, true, -1180000130);
			Class588.aClass480_127 = Class103_Sub4.method7625(Class32.aClass32_18, true, 1, false, false, -1341457844);
			Class310.aClass480_93 = Class103_Sub4.method7625(Class32.aClass32_40, true, 1, false, true, -1543565456);
			Class62.aClass480_8 = Class103_Sub4.method7625(Class32.aClass32_19, false, 1, true, true, -988202674);
			Class480.aClass480_120 = Class103_Sub4.method7625(Class32.aClass32_20, false, 1, true, true, -805636932);
			Class371.aClass480_102 = Class103_Sub4.method7625(Class32.aClass32_6, true, 1, true, true, -844546211);
			Class687.aClass480_134 = Class103_Sub4.method7625(Class32.aClass32_22, false, 1, true, true, -1332053870);
			Class155.aClass480_41 = Class103_Sub4.method7625(Class32.aClass32_38, false, 1, true, true, -860097059);
			Class110_Sub1.aClass480_17 = Class103_Sub4.method7625(Class32.aClass32_30, true, 1, false, true, -911870930);
			Class40.aClass480_3 = Class103_Sub4.method7625(Class32.aClass32_39, true, 1, false, true, -872165870);
			Class80_Sub15.aClass480_35 = Class103_Sub4.method7625(Class32.aClass32_26, true, 1, true, true, -1807244044);
		}
		if (aClass360_19 == Class360.aClass360_6) {
			local6 = 0;
			local290 = 0;
			for (local126 = 0; local126 < Class626.aClass141_Sub1Array2.length; local126++) {
				if (Class626.aClass141_Sub1Array2[local126] != null) {
					local6 += Class626.aClass141_Sub1Array2[local126].method10910((byte) 31);
					local290++;
				}
			}
			if (local290 > 0) {
				local6 /= local290;
			}
			if (local6 != 100) {
				if (anInt4500 * 348448447 < 0) {
					anInt4500 = local6 * -2035185345;
				}
				return (local6 - anInt4500 * 348448447) * 100 / (100 - anInt4500 * 348448447);
			}
			Class22.method544(Class698.aClass638_1, -2002528955);
			Class317.aClass464_1 = new Class464(Class279.aClass102_9, Class708.aClass480_136, Class569.aClass480_124, Class546.method31209(515113442));
		}
		if (Class360.aClass360_5 == aClass360_19) {
			@Pc(677) byte[] local677 = Class329.aClass480_95.method29926(Class639.aClass639_4.anInt5637 * 1101033235, 1472047355);
			if (local677 == null) {
				return 0;
			}
			Class490.aClass263_13 = new Class263();
			Class490.aClass263_13.method26514(50, 7340032, 1207776829);
			Class245.method26320(local677, (short) -24452);
			Class604.method32148(1, -1689509238);
		}
		if (aClass360_19 == Class360.aClass360_8 && Class373.aClass586_1 == null) {
			Class373.aClass586_1 = new Class586(Class40.aClass480_3);
			Class308.method27439(Class373.aClass586_1, 2081480546);
		}
		if (aClass360_19 == Class360.aClass360_17) {
			local6 = Class325.method27624(927498291);
			if (local6 < 100) {
				return local6;
			}
			Class335.method27855(Class329.aClass480_95.method29926(Class639.aClass639_8.anInt5637 * 1101033235, 1472047355), -958834480);
			Class594.aShortArrayArray5 = Class698.aClass638_1.aShortArrayArray7;
			Class80_Sub41.aShortArrayArrayArray5 = Class698.aClass638_1.aShortArrayArrayArray7;
			Class631.aShortArrayArray6 = Class698.aClass638_1.aShortArrayArray8;
			Class267.aShortArrayArrayArray6 = Class698.aClass638_1.aShortArrayArrayArray8;
			if (Class698.aClass638_1.anInt5625 * 1428396527 != -1 && -701868089 * Class698.aClass638_1.anInt5618 != -1) {
				client.anInt3510 = Class698.aClass638_1.anInt5625 * 872601439;
				client.anInt3511 = Class698.aClass638_1.anInt5618 * 1006025713;
			}
			Class362.aClass651_1 = new Class651(Class329.aClass480_95);
			Class450.aClass634_1 = new Class634(Class329.aClass480_95);
			Class630.aClass641_1 = new Class641(Class329.aClass480_95);
			Class335.aClass650_1 = new Class650(Class329.aClass480_95);
			Class159.aClass632_2 = new Class632(Class329.aClass480_95);
		}
		if (Class360.aClass360_11 == aClass360_19) {
			if (-2013498219 * Class698.aClass638_1.anInt5630 != -1 && !Class626.aClass480_129.method29925(Class698.aClass638_1.anInt5630 * -2013498219, 0, 1120705042)) {
				return 99;
			}
			Class626.aClass235_8 = new Class235(Class371.aClass480_102);
			Class39.anInterface23_1 = new Class111_Sub1(Class270.aClass480_89);
			Class370.aClass41_Sub10_1 = new Class41_Sub10(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class533.aClass41_Sub18_1 = new Class41_Sub18(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class279.aClass41_Sub4_1 = new Class41_Sub4(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class80_Sub1_Sub1.aClass41_2 = new Class41(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class664.aClass664_90, 64, new Class63(Class35.class));
			Class383.aClass41_3 = new Class41(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class664.aClass664_72, 16, new Class63(Class81.class));
			Class111_Sub1.aClass41_Sub20_1 = new Class41_Sub20(client.aClass722_4, Class512.aClass719_3, Class56.aClass480_7);
			Class704.aClass41_Sub6_3 = new Class41_Sub6(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class20.aClass41_Sub21_11 = new Class41_Sub21(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class510.aClass41_Sub15_1 = new Class41_Sub15(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class578.aClass41_Sub19_1 = new Class41_Sub19(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class80_Sub1_Sub15.aClass41_Sub14_4 = new Class41_Sub14(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class626.aClass480_129);
			Class281.aClass41_Sub22_1 = new Class41_Sub22(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class332.aClass41_Sub5_1 = new Class41_Sub5(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class5.aClass41_Sub3_1 = new Class41_Sub3(client.aClass722_4, Class512.aClass719_3, true, Class223.aClass480_84, Class626.aClass480_129);
			client.aClass539_1.method30911(Class5.aClass41_Sub3_1, -1364296886);
			Class39.aClass540_1.method31044(new Class41_Sub3(client.aClass722_4, Class512.aClass719_3, true, Class223.aClass480_84, Class626.aClass480_129), 1043073531);
			Class157.aClass41_Sub13_2 = new Class41_Sub13(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class265.aClass41_Sub12_3 = new Class41_Sub12(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class460.aClass41_Sub2_1 = new Class41_Sub2(client.aClass722_4, Class512.aClass719_3, true, Class352.aClass480_97, Class626.aClass480_129);
			Class25.aClass41_Sub9_1 = new Class41_Sub9(client.aClass722_4, Class512.aClass719_3, true, Class370.aClass41_Sub10_1, Class231.aClass480_86, Class626.aClass480_129);
			Class106.aClass73_Sub1_6 = new Class73_Sub1(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, true);
			Class265.aClass41_Sub11_1 = new Class41_Sub11(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class125.aClass41_Sub1_6 = new Class41_Sub1(client.aClass722_4, Class512.aClass719_3, Class143_Sub3.aClass480_34, Class297.aClass480_92, Class578.aClass480_125, Class380.aClass480_105, Class265.aClass41_Sub11_1);
			Class621.aClass41_Sub7_1 = new Class41_Sub7(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class289.aClass41_Sub8_1 = new Class41_Sub8(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class104_Sub2.aClass41_Sub16_1 = new Class41_Sub16(client.aClass722_4, Class512.aClass719_3, Class83.aClass480_12, Class626.aClass480_129);
			Class595.aClass73_Sub2_1 = new Class73_Sub2(client.aClass722_4, Class512.aClass719_3, Class228.aClass480_85, true);
			Class615.aClass2_Sub1_Sub2_14 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_69, Class512.aClass719_3, Class171.aClass480_82);
			Class528.aClass2_Sub1_Sub1_3 = new Class2_Sub1_Sub1(client.aClass722_4, Class143.aClass143_71, Class512.aClass719_3, Class171.aClass480_82);
			Class110.aClass2_Sub1_Sub2_2 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_62, Class512.aClass719_3, Class171.aClass480_82);
			Class143.aClass2_Sub1_Sub2_12 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_66, Class512.aClass719_3, Class171.aClass480_82);
			Class130.aClass2_Sub1_Sub2_6 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_63, Class512.aClass719_3, Class171.aClass480_82);
			Class188.aClass2_Sub1_Sub2_13 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_70, Class512.aClass719_3, Class171.aClass480_82);
			Class121.aClass2_Sub1_Sub2_4 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_68, Class512.aClass719_3, Class171.aClass480_82);
			Class161.aMap13 = Class43.method928(new Class2_Sub1[] { Class615.aClass2_Sub1_Sub2_14, Class528.aClass2_Sub1_Sub1_3, Class110.aClass2_Sub1_Sub2_2, Class143.aClass2_Sub1_Sub2_12, Class130.aClass2_Sub1_Sub2_6, Class188.aClass2_Sub1_Sub2_13, Class121.aClass2_Sub1_Sub2_4 }, 1089278006);
			Class664.aClass41_Sub17_2 = new Class41_Sub17(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class161.aMap13);
			Class297.anInterface21_4 = new Class371();
			Class165_Sub21.method16249(Class104_Sub2.aClass480_16, Class626.aClass480_129, Class708.aClass480_136, Class569.aClass480_124, -1711343017);
			Class475.aClass445_1 = new Class445(Class155.aClass480_41);
			Class380.aClass444_1 = new Class444(Class687.aClass480_134);
			Class447.aClass450_1 = new Class450(Class687.aClass480_134);
			Class71.aClass510_2 = new Class510(Class512.aClass719_3, Class62.aClass480_8, Class480.aClass480_120);
			Class610.aClass52_2 = new Class52(Class512.aClass719_3, Class62.aClass480_8, Class480.aClass480_120, new Class440());
			Class672.aClass134_1 = new Class134(Class528.aClass2_Sub1_Sub1_3, Class664.aClass41_Sub17_2, Class450.aClass634_1.method32799(245988338));
			Class522.method30640(319835293);
			Class343.method27944(Class125.aClass41_Sub1_6, 1468936825);
			Class387.method28616(Class447.aClass450_1, Class380.aClass444_1, (byte) -93);
			Class35.method759(Class626.aClass480_129, Class626.aClass235_8, Class39.anInterface23_1, (byte) 80);
			@Pc(1212) Class336 local1212 = new Class336(client.aClass480_83.method29938("huffman", "", -1974379985));
			Class211.method25821(local1212, 2128274011);
			Class554.aClass146_2 = Class257.method26425((short) -11513);
			Class705.aClass80_Sub39_1 = new Class80_Sub39(true);
		}
		if (aClass360_19 == Class360.aClass360_9) {
			local6 = Class528.method30718(Class708.aClass480_136, 1831537709) + Class317.aClass464_1.method29591(true, (byte) 1);
			local290 = Class356.method28102((byte) 0) + Class317.aClass464_1.method29592(-1281389959);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (aClass360_19 == Class360.aClass360_12) {
			Class159.method15333(Class588.aClass480_127, Class310.aClass480_93, Class704.aClass41_Sub6_3, Class20.aClass41_Sub21_11, client.aClass539_1.method30905(-353044624), Class157.aClass41_Sub13_2, Class265.aClass41_Sub12_3, Class672.aClass134_1, Class672.aClass134_1);
		}
		if (aClass360_19 == Class360.aClass360_13) {
			Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1 = new Class110_Sub1(Class615.aClass2_Sub1_Sub2_14);
			Class596.method31993(1901517509);
			Class587.aClass474_1 = Class437.method29140(-149888391);
			Class325.aClass480_94.method29932(false, true, -1992374052);
			Class708.aClass480_136.method29932(true, true, -2005101007);
			Class569.aClass480_124.method29932(true, true, -2071563929);
			client.aClass480_83.method29932(true, true, -1792193463);
			client.aBoolean716 = true;
		}
		if (Class360.aClass360_14 == aClass360_19 && -812846045 * Class698.aClass638_1.anInt5615 != -1) {
			if (!Class71.method18185(Class698.aClass638_1.anInt5615 * -812846045, null, (byte) 100)) {
				return 0;
			}
			local114 = true;
			for (local290 = 0; local290 < Class709.aClass310Array1[Class698.aClass638_1.anInt5615 * -812846045].aClass327Array2.length; local290++) {
				@Pc(1344) Class327 local1344 = Class709.aClass310Array1[Class698.aClass638_1.anInt5615 * -812846045].aClass327Array2[local290];
				if (local1344.anInt4135 * 710314345 == 5 && local1344.anInt4117 * -706354509 != -1 && !Class708.aClass480_136.method29925(local1344.anInt4117 * -706354509, 0, -1415570032)) {
					local114 = false;
				}
			}
			if (!local114) {
				return 0;
			}
		}
		if (aClass360_19 == Class360.aClass360_7) {
			Class559.method31408(true, -5301585);
		}
		if (Class360.aClass360_15 == aClass360_19) {
			aClass369_1.method28308(-1043615648);
			try {
				aThread7.join();
			} catch (@Pc(1389) InterruptedException local1389) {
				return 0;
			}
			aClass369_1 = null;
			aThread7 = null;
			aClass480_98 = null;
			aClass480_99 = null;
			Class384.aClass90_1 = null;
			anInterface30Array1 = null;
			Class673.aMap22.remove(Class32.aClass32_28);
			Class673.aMap22.remove(Class32.aClass32_27);
			Class673.aMap22.remove(Class32.aClass32_29);
			Class279.method26845(-1499350566);
			client.aBoolean709 = Class703.aClass80_Sub37_49.aClass165_Sub44_1.method16875(324392435) == 1;
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 1, (byte) 62);
			if (client.aBoolean709) {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 81);
			} else if (Class703.aClass80_Sub37_49.aClass165_Sub1_1.aBoolean417 && Class705.aClass80_Sub39_1.anInt1719 * 625439365 < 512 && Class705.aClass80_Sub39_1.anInt1719 * 625439365 != 0) {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 17);
			}
			Class719.method37291(-223622739);
			if (client.aBoolean709) {
				Class528.method30719(0, false, 1306384343);
				if (!client.aBoolean710) {
					Class80.method24400(Class68.aClass68_2, (byte) -69);
				}
			} else {
				Class528.method30719(Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(1384558709), false, -482605470);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(-1134714907) == 0) {
					Class80.method24400(Class68.aClass68_11, (byte) -74);
				}
			}
			Class126.method20383(Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767), -1, -1, false, 1615516245);
			Class317.aClass464_1.method29589(client.anInterface49_1, 476456400);
			Class440.method29165(Class279.aClass102_9, -148161080);
			Class430.method29086(Class279.aClass102_9, Class708.aClass480_136, 1772388821);
		}
		return Class79.method1434((short) 128);
	}

	@OriginalMember(owner = "client!jn", name = "ag", descriptor = "()I")
	static int method28242() {
		@Pc(6) int local6;
		if (Class703.aClass80_Sub37_49.aClass165_Sub44_1.method16875(1855103983) == 0) {
			for (local6 = 0; local6 < client.anInt3444 * 200884815; local6++) {
				if (client.anInterface63Array2[local6].method14074(-1577977225) == 's' || client.anInterface63Array2[local6].method14074(-1779292817) == 'S') {
					Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 1, (byte) 67);
					client.aBoolean710 = true;
					Class80.method24400(Class68.aClass68_9, (byte) -104);
					break;
				}
			}
		}
		if (aClass360_19 == Class360.aClass360_16) {
			if (Class279.aClass491_1 == null) {
				Class279.aClass491_1 = new Class491(Class108_Sub2.aClass139_8, Class411.aClass490_2, Class504.aClass495_3, Class174.aBigInteger3, Class174.aBigInteger4);
			}
			if (!Class279.aClass491_1.method30244(-1044230133)) {
				return 0;
			}
			Class430.method29085(0, null, true, (byte) 0);
			aBoolean840 = !Class317.method27512((byte) -120);
			aClass480_98 = Class103_Sub4.method7625(aBoolean840 ? Class32.aClass32_29 : Class32.aClass32_27, false, 1, true, true, -1081820014);
			aClass480_99 = Class103_Sub4.method7625(Class32.aClass32_28, false, 1, true, true, -2124958756);
			Class569.aClass480_124 = Class103_Sub4.method7625(Class32.aClass32_10, false, 1, true, true, -1821758885);
			Class329.aClass480_95 = Class103_Sub4.method7625(Class32.aClass32_41, true, 1, true, true, -1719235128);
		}
		@Pc(126) int local126;
		@Pc(114) boolean local114;
		if (aClass360_19 == Class360.aClass360_2) {
			local114 = aClass480_99.method29956(2117542951);
			@Pc(118) boolean local118 = Class329.aClass480_95.method29956(2040610906);
			local126 = Class626.aClass141_Sub1Array2[Class32.aClass32_28.method683(1392536024)].method10910((byte) 111);
			@Pc(142) int local142 = local126 + Class626.aClass141_Sub1Array2[aBoolean840 ? Class32.aClass32_29.method683(-1061405576) : Class32.aClass32_27.method683(-514043161)].method10910((byte) 110);
			@Pc(152) int local152 = local142 + Class626.aClass141_Sub1Array2[Class32.aClass32_10.method683(-294082274)].method10910((byte) 103);
			@Pc(162) int local162 = local152 + (local118 ? 100 : Class329.aClass480_95.method29936(1158197411));
			@Pc(172) int local172 = local162 + (local114 ? 100 : aClass480_99.method29936(351822948));
			if (local172 != 500) {
				return local172 / 5;
			}
			Class698.aClass638_1 = new Class638(Class329.aClass480_95);
			Class270.aClass647_1 = new Class647(Class329.aClass480_95);
			Class689.method36955(Class698.aClass638_1, 1410719748);
			@Pc(197) int local197 = Class703.aClass80_Sub37_49.aClass165_Sub28_1.method16420(-1350745881);
			Class384.aClass90_1 = new Class90(client.aClass722_4, Class512.aClass719_3, aClass480_99);
			@Pc(209) Class92[] local209 = Class384.aClass90_1.method1856(local197, 2076523414);
			if (local209.length == 0) {
				local209 = Class384.aClass90_1.method1856(0, 2076523414);
			}
			@Pc(224) Class381 local224 = new Class381(aClass480_98, Class569.aClass480_124);
			if (local209.length > 0) {
				anInterface30Array1 = new Interface30[local209.length];
				for (@Pc(233) int local233 = 0; local233 < anInterface30Array1.length; local233++) {
					anInterface30Array1[local233] = new Class364(Class384.aClass90_1.method1857(local209[local233].anInt327 * -1665702563, -1174710433), local209[local233].anInt326 * 1955972077, local209[local233].anInt328 * 945449557, local224);
				}
			}
		}
		if (Class360.aClass360_3 == aClass360_19) {
			Class317.aClass464_1 = new Class464(Class279.aClass102_9, aClass480_98, Class569.aClass480_124, Class546.method31209(234274758));
		}
		@Pc(290) int local290;
		if (Class360.aClass360_10 == aClass360_19) {
			local6 = Class317.aClass464_1.method29608((byte) -67);
			local290 = Class317.aClass464_1.method29592(-1281389959);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (aClass360_19 == Class360.aClass360_4) {
			if (anInterface30Array1 != null && anInterface30Array1.length > 0) {
				if (anInterface30Array1[0].method28351(-1981626768) < 100) {
					return 0;
				}
				if (anInterface30Array1.length > 1 && Class384.aClass90_1.method1860((byte) 49) && anInterface30Array1[1].method28351(-1979772305) < 100) {
					return 0;
				}
			}
			Class317.aClass464_1.method29589(client.anInterface49_1, -1286057811);
			Class440.method29165(Class279.aClass102_9, -148161080);
			Class604.method32148(11, -1981687330);
		}
		if (Class360.aClass360_1 == aClass360_19) {
			Class708.aClass480_136 = Class103_Sub4.method7625(Class32.aClass32_7, false, 1, false, true, -1650113998);
			Class297.aClass480_92 = Class103_Sub4.method7625(Class32.aClass32_15, false, 1, false, true, -1944498541);
			Class578.aClass480_125 = Class103_Sub4.method7625(Class32.aClass32_32, false, 1, false, true, -1006646977);
			Class380.aClass480_105 = Class103_Sub4.method7625(Class32.aClass32_42, false, 1, false, true, -1890732181);
			Class171.aClass480_82 = Class103_Sub4.method7625(Class32.aClass32_24, false, 1, true, true, -2093385031);
			Class688.aClass480_135 = Class103_Sub4.method7625(Class32.aClass32_36, false, 1, true, true, -1217595274);
			Class104_Sub2.aClass480_16 = Class103_Sub4.method7625(Class32.aClass32_4, false, 1, true, true, -1464404322);
			Class325.aClass480_94 = Class103_Sub4.method7625(Class32.aClass32_5, true, 1, false, true, -1126922926);
			Class626.aClass480_129 = Class103_Sub4.method7625(Class32.aClass32_2, false, 1, false, true, -847469772);
			Class270.aClass480_89 = Class103_Sub4.method7625(Class32.aClass32_1, true, 1, false, true, -2019896001);
			client.aClass480_83 = Class103_Sub4.method7625(Class32.aClass32_8, false, 1, false, true, -946046345);
			Class438.aClass480_112 = Class103_Sub4.method7625(Class32.aClass32_9, false, 1, true, true, -867437199);
			Class9.aClass480_1 = Class103_Sub4.method7625(Class32.aClass32_14, true, 1, false, false, -1573163708);
			Class238.aClass480_88 = Class103_Sub4.method7625(Class32.aClass32_31, true, 1, false, false, -1168751152);
			Class223.aClass480_84 = Class103_Sub4.method7625(Class32.aClass32_11, false, 1, true, true, -1961396175);
			Class56.aClass480_7 = Class103_Sub4.method7625(Class32.aClass32_12, false, 1, true, true, -812781226);
			Class352.aClass480_97 = Class103_Sub4.method7625(Class32.aClass32_13, false, 1, true, true, -1297255302);
			Class231.aClass480_86 = Class103_Sub4.method7625(Class32.aClass32_25, false, 1, true, true, -1929226823);
			Class143_Sub3.aClass480_34 = Class103_Sub4.method7625(Class32.aClass32_3, false, 1, true, true, -1064025228);
			Class83.aClass480_12 = Class103_Sub4.method7625(Class32.aClass32_16, false, 1, true, true, -1457583489);
			Class228.aClass480_85 = Class103_Sub4.method7625(Class32.aClass32_17, false, 1, true, true, -1337801961);
			Class588.aClass480_127 = Class103_Sub4.method7625(Class32.aClass32_18, true, 1, false, false, -1889077853);
			Class310.aClass480_93 = Class103_Sub4.method7625(Class32.aClass32_40, true, 1, false, true, -1373746974);
			Class62.aClass480_8 = Class103_Sub4.method7625(Class32.aClass32_19, false, 1, true, true, -1923586589);
			Class480.aClass480_120 = Class103_Sub4.method7625(Class32.aClass32_20, false, 1, true, true, -1140141655);
			Class371.aClass480_102 = Class103_Sub4.method7625(Class32.aClass32_6, true, 1, true, true, -1066568771);
			Class687.aClass480_134 = Class103_Sub4.method7625(Class32.aClass32_22, false, 1, true, true, -1162709624);
			Class155.aClass480_41 = Class103_Sub4.method7625(Class32.aClass32_38, false, 1, true, true, -1809647264);
			Class110_Sub1.aClass480_17 = Class103_Sub4.method7625(Class32.aClass32_30, true, 1, false, true, -1141703146);
			Class40.aClass480_3 = Class103_Sub4.method7625(Class32.aClass32_39, true, 1, false, true, -1949826360);
			Class80_Sub15.aClass480_35 = Class103_Sub4.method7625(Class32.aClass32_26, true, 1, true, true, -1254567162);
		}
		if (aClass360_19 == Class360.aClass360_6) {
			local6 = 0;
			local290 = 0;
			for (local126 = 0; local126 < Class626.aClass141_Sub1Array2.length; local126++) {
				if (Class626.aClass141_Sub1Array2[local126] != null) {
					local6 += Class626.aClass141_Sub1Array2[local126].method10910((byte) 94);
					local290++;
				}
			}
			if (local290 > 0) {
				local6 /= local290;
			}
			if (local6 != 100) {
				if (anInt4500 * 348448447 < 0) {
					anInt4500 = local6 * -2035185345;
				}
				return (local6 - anInt4500 * 348448447) * 100 / (100 - anInt4500 * 348448447);
			}
			Class22.method544(Class698.aClass638_1, -1887708428);
			Class317.aClass464_1 = new Class464(Class279.aClass102_9, Class708.aClass480_136, Class569.aClass480_124, Class546.method31209(-849281790));
		}
		if (Class360.aClass360_5 == aClass360_19) {
			@Pc(677) byte[] local677 = Class329.aClass480_95.method29926(Class639.aClass639_4.anInt5637 * 1101033235, 1472047355);
			if (local677 == null) {
				return 0;
			}
			Class490.aClass263_13 = new Class263();
			Class490.aClass263_13.method26514(50, 7340032, -1170579589);
			Class245.method26320(local677, (short) -26061);
			Class604.method32148(1, -1058350777);
		}
		if (aClass360_19 == Class360.aClass360_8 && Class373.aClass586_1 == null) {
			Class373.aClass586_1 = new Class586(Class40.aClass480_3);
			Class308.method27439(Class373.aClass586_1, 1928487077);
		}
		if (aClass360_19 == Class360.aClass360_17) {
			local6 = Class325.method27624(-221607638);
			if (local6 < 100) {
				return local6;
			}
			Class335.method27855(Class329.aClass480_95.method29926(Class639.aClass639_8.anInt5637 * 1101033235, 1472047355), -1476255731);
			Class594.aShortArrayArray5 = Class698.aClass638_1.aShortArrayArray7;
			Class80_Sub41.aShortArrayArrayArray5 = Class698.aClass638_1.aShortArrayArrayArray7;
			Class631.aShortArrayArray6 = Class698.aClass638_1.aShortArrayArray8;
			Class267.aShortArrayArrayArray6 = Class698.aClass638_1.aShortArrayArrayArray8;
			if (Class698.aClass638_1.anInt5625 * 1428396527 != -1 && -701868089 * Class698.aClass638_1.anInt5618 != -1) {
				client.anInt3510 = Class698.aClass638_1.anInt5625 * 872601439;
				client.anInt3511 = Class698.aClass638_1.anInt5618 * 1006025713;
			}
			Class362.aClass651_1 = new Class651(Class329.aClass480_95);
			Class450.aClass634_1 = new Class634(Class329.aClass480_95);
			Class630.aClass641_1 = new Class641(Class329.aClass480_95);
			Class335.aClass650_1 = new Class650(Class329.aClass480_95);
			Class159.aClass632_2 = new Class632(Class329.aClass480_95);
		}
		if (Class360.aClass360_11 == aClass360_19) {
			if (-2013498219 * Class698.aClass638_1.anInt5630 != -1 && !Class626.aClass480_129.method29925(Class698.aClass638_1.anInt5630 * -2013498219, 0, 587923499)) {
				return 99;
			}
			Class626.aClass235_8 = new Class235(Class371.aClass480_102);
			Class39.anInterface23_1 = new Class111_Sub1(Class270.aClass480_89);
			Class370.aClass41_Sub10_1 = new Class41_Sub10(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class533.aClass41_Sub18_1 = new Class41_Sub18(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class279.aClass41_Sub4_1 = new Class41_Sub4(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class80_Sub1_Sub1.aClass41_2 = new Class41(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class664.aClass664_90, 64, new Class63(Class35.class));
			Class383.aClass41_3 = new Class41(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class664.aClass664_72, 16, new Class63(Class81.class));
			Class111_Sub1.aClass41_Sub20_1 = new Class41_Sub20(client.aClass722_4, Class512.aClass719_3, Class56.aClass480_7);
			Class704.aClass41_Sub6_3 = new Class41_Sub6(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class20.aClass41_Sub21_11 = new Class41_Sub21(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class510.aClass41_Sub15_1 = new Class41_Sub15(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class578.aClass41_Sub19_1 = new Class41_Sub19(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class80_Sub1_Sub15.aClass41_Sub14_4 = new Class41_Sub14(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class626.aClass480_129);
			Class281.aClass41_Sub22_1 = new Class41_Sub22(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class332.aClass41_Sub5_1 = new Class41_Sub5(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class5.aClass41_Sub3_1 = new Class41_Sub3(client.aClass722_4, Class512.aClass719_3, true, Class223.aClass480_84, Class626.aClass480_129);
			client.aClass539_1.method30911(Class5.aClass41_Sub3_1, -1537985071);
			Class39.aClass540_1.method31044(new Class41_Sub3(client.aClass722_4, Class512.aClass719_3, true, Class223.aClass480_84, Class626.aClass480_129), 1043073531);
			Class157.aClass41_Sub13_2 = new Class41_Sub13(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class265.aClass41_Sub12_3 = new Class41_Sub12(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class708.aClass480_136);
			Class460.aClass41_Sub2_1 = new Class41_Sub2(client.aClass722_4, Class512.aClass719_3, true, Class352.aClass480_97, Class626.aClass480_129);
			Class25.aClass41_Sub9_1 = new Class41_Sub9(client.aClass722_4, Class512.aClass719_3, true, Class370.aClass41_Sub10_1, Class231.aClass480_86, Class626.aClass480_129);
			Class106.aClass73_Sub1_6 = new Class73_Sub1(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, true);
			Class265.aClass41_Sub11_1 = new Class41_Sub11(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class125.aClass41_Sub1_6 = new Class41_Sub1(client.aClass722_4, Class512.aClass719_3, Class143_Sub3.aClass480_34, Class297.aClass480_92, Class578.aClass480_125, Class380.aClass480_105, Class265.aClass41_Sub11_1);
			Class621.aClass41_Sub7_1 = new Class41_Sub7(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class289.aClass41_Sub8_1 = new Class41_Sub8(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82);
			Class104_Sub2.aClass41_Sub16_1 = new Class41_Sub16(client.aClass722_4, Class512.aClass719_3, Class83.aClass480_12, Class626.aClass480_129);
			Class595.aClass73_Sub2_1 = new Class73_Sub2(client.aClass722_4, Class512.aClass719_3, Class228.aClass480_85, true);
			Class615.aClass2_Sub1_Sub2_14 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_69, Class512.aClass719_3, Class171.aClass480_82);
			Class528.aClass2_Sub1_Sub1_3 = new Class2_Sub1_Sub1(client.aClass722_4, Class143.aClass143_71, Class512.aClass719_3, Class171.aClass480_82);
			Class110.aClass2_Sub1_Sub2_2 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_62, Class512.aClass719_3, Class171.aClass480_82);
			Class143.aClass2_Sub1_Sub2_12 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_66, Class512.aClass719_3, Class171.aClass480_82);
			Class130.aClass2_Sub1_Sub2_6 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_63, Class512.aClass719_3, Class171.aClass480_82);
			Class188.aClass2_Sub1_Sub2_13 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_70, Class512.aClass719_3, Class171.aClass480_82);
			Class121.aClass2_Sub1_Sub2_4 = new Class2_Sub1_Sub2(client.aClass722_4, Class143.aClass143_68, Class512.aClass719_3, Class171.aClass480_82);
			Class161.aMap13 = Class43.method928(new Class2_Sub1[] { Class615.aClass2_Sub1_Sub2_14, Class528.aClass2_Sub1_Sub1_3, Class110.aClass2_Sub1_Sub2_2, Class143.aClass2_Sub1_Sub2_12, Class130.aClass2_Sub1_Sub2_6, Class188.aClass2_Sub1_Sub2_13, Class121.aClass2_Sub1_Sub2_4 }, 2133937216);
			Class664.aClass41_Sub17_2 = new Class41_Sub17(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class161.aMap13);
			Class297.anInterface21_4 = new Class371();
			Class165_Sub21.method16249(Class104_Sub2.aClass480_16, Class626.aClass480_129, Class708.aClass480_136, Class569.aClass480_124, -181870165);
			Class475.aClass445_1 = new Class445(Class155.aClass480_41);
			Class380.aClass444_1 = new Class444(Class687.aClass480_134);
			Class447.aClass450_1 = new Class450(Class687.aClass480_134);
			Class71.aClass510_2 = new Class510(Class512.aClass719_3, Class62.aClass480_8, Class480.aClass480_120);
			Class610.aClass52_2 = new Class52(Class512.aClass719_3, Class62.aClass480_8, Class480.aClass480_120, new Class440());
			Class672.aClass134_1 = new Class134(Class528.aClass2_Sub1_Sub1_3, Class664.aClass41_Sub17_2, Class450.aClass634_1.method32799(-1623318621));
			Class522.method30640(486435102);
			Class343.method27944(Class125.aClass41_Sub1_6, 1468936825);
			Class387.method28616(Class447.aClass450_1, Class380.aClass444_1, (byte) -127);
			Class35.method759(Class626.aClass480_129, Class626.aClass235_8, Class39.anInterface23_1, (byte) 100);
			@Pc(1212) Class336 local1212 = new Class336(client.aClass480_83.method29938("huffman", "", -1647638905));
			Class211.method25821(local1212, 1347310958);
			Class554.aClass146_2 = Class257.method26425((short) -27383);
			Class705.aClass80_Sub39_1 = new Class80_Sub39(true);
		}
		if (aClass360_19 == Class360.aClass360_9) {
			local6 = Class528.method30718(Class708.aClass480_136, 1831537709) + Class317.aClass464_1.method29591(true, (byte) 1);
			local290 = Class356.method28102((byte) 0) + Class317.aClass464_1.method29592(-1281389959);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (aClass360_19 == Class360.aClass360_12) {
			Class159.method15333(Class588.aClass480_127, Class310.aClass480_93, Class704.aClass41_Sub6_3, Class20.aClass41_Sub21_11, client.aClass539_1.method30905(1507165942), Class157.aClass41_Sub13_2, Class265.aClass41_Sub12_3, Class672.aClass134_1, Class672.aClass134_1);
		}
		if (aClass360_19 == Class360.aClass360_13) {
			Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1 = new Class110_Sub1(Class615.aClass2_Sub1_Sub2_14);
			Class596.method31993(1901517509);
			Class587.aClass474_1 = Class437.method29140(693382991);
			Class325.aClass480_94.method29932(false, true, -2108443811);
			Class708.aClass480_136.method29932(true, true, -2072433210);
			Class569.aClass480_124.method29932(true, true, -1904265603);
			client.aClass480_83.method29932(true, true, -2115245491);
			client.aBoolean716 = true;
		}
		if (Class360.aClass360_14 == aClass360_19 && -812846045 * Class698.aClass638_1.anInt5615 != -1) {
			if (!Class71.method18185(Class698.aClass638_1.anInt5615 * -812846045, null, (byte) 100)) {
				return 0;
			}
			local114 = true;
			for (local290 = 0; local290 < Class709.aClass310Array1[Class698.aClass638_1.anInt5615 * -812846045].aClass327Array2.length; local290++) {
				@Pc(1344) Class327 local1344 = Class709.aClass310Array1[Class698.aClass638_1.anInt5615 * -812846045].aClass327Array2[local290];
				if (local1344.anInt4135 * 710314345 == 5 && local1344.anInt4117 * -706354509 != -1 && !Class708.aClass480_136.method29925(local1344.anInt4117 * -706354509, 0, -1522913318)) {
					local114 = false;
				}
			}
			if (!local114) {
				return 0;
			}
		}
		if (aClass360_19 == Class360.aClass360_7) {
			Class559.method31408(true, -5301585);
		}
		if (Class360.aClass360_15 == aClass360_19) {
			aClass369_1.method28308(-758163709);
			try {
				aThread7.join();
			} catch (@Pc(1389) InterruptedException local1389) {
				return 0;
			}
			aClass369_1 = null;
			aThread7 = null;
			aClass480_98 = null;
			aClass480_99 = null;
			Class384.aClass90_1 = null;
			anInterface30Array1 = null;
			Class673.aMap22.remove(Class32.aClass32_28);
			Class673.aMap22.remove(Class32.aClass32_27);
			Class673.aMap22.remove(Class32.aClass32_29);
			Class279.method26845(-669941095);
			client.aBoolean709 = Class703.aClass80_Sub37_49.aClass165_Sub44_1.method16875(1193977218) == 1;
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 1, (byte) 86);
			if (client.aBoolean709) {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 76);
			} else if (Class703.aClass80_Sub37_49.aClass165_Sub1_1.aBoolean417 && Class705.aClass80_Sub39_1.anInt1719 * 625439365 < 512 && Class705.aClass80_Sub39_1.anInt1719 * 625439365 != 0) {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 71);
			}
			Class719.method37291(-732485032);
			if (client.aBoolean709) {
				Class528.method30719(0, false, -1162009214);
				if (!client.aBoolean710) {
					Class80.method24400(Class68.aClass68_2, (byte) 11);
				}
			} else {
				Class528.method30719(Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(287227654), false, -123931831);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(-2139675532) == 0) {
					Class80.method24400(Class68.aClass68_11, (byte) 42);
				}
			}
			Class126.method20383(Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767), -1, -1, false, 1615516245);
			Class317.aClass464_1.method29589(client.anInterface49_1, -1294761868);
			Class440.method29165(Class279.aClass102_9, -148161080);
			Class430.method29086(Class279.aClass102_9, Class708.aClass480_136, -263768816);
		}
		return Class79.method1434((short) 128);
	}

	@OriginalMember(owner = "client!jn", name = "ay", descriptor = "(Z)V")
	public static void method28243(@OriginalArg(0) boolean arg0) {
		if (aClass369_1 == null) {
			Class699.method37064(-1942034144);
		}
		if (arg0) {
			aClass369_1.method28298(345432708);
		}
	}

	@OriginalMember(owner = "client!jn", name = "ab", descriptor = "([B)V")
	static void method28244(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method23362(-361217805);
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method23178((byte) -82);
				Class490.aClass263_13.method26540(local19, (byte) -70);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "al", descriptor = "()V")
	public static void method28245() {
		if (aClass369_1 != null) {
			aClass369_1.method28308(-1614672948);
		}
		if (aThread7 == null) {
			return;
		}
		while (true) {
			try {
				aThread7.join();
				break;
			} catch (@Pc(10) InterruptedException local10) {
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "aam", descriptor = "(Lclient!yp;B)V")
	static void method28246(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (client.anInt3577 * 740205413 == 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3519 * 227319795;
		}
	}

	@OriginalMember(owner = "client!jn", name = "bfm", descriptor = "(Lclient!yp;I)V")
	static void method28247(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
	}

	@OriginalMember(owner = "client!jn", name = "awc", descriptor = "(Lclient!yp;B)V")
	static void method28248(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(2, local13, local23, "", 942538455);
	}

	@OriginalMember(owner = "client!jn", name = "fd", descriptor = "(Lclient!yp;I)V")
	static void method28249(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class103_Sub12.method7921(local11, local14, arg0, (byte) 25);
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	Class365() throws Throwable {
		throw new Error();
	}
}
