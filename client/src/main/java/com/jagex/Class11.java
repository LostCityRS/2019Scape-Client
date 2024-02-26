package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaj")
public final class Class11 {

	@OriginalMember(owner = "client!aaj", name = "ai", descriptor = "Lclient!cm;")
	static Class99 aClass99_1;

	@OriginalMember(owner = "client!aaj", name = "t", descriptor = "Lclient!aaj;")
	static final Class11 aClass11_3 = new Class11(0);

	@OriginalMember(owner = "client!aaj", name = "f", descriptor = "Lclient!aaj;")
	public static final Class11 aClass11_1 = new Class11(1);

	@OriginalMember(owner = "client!aaj", name = "e", descriptor = "Lclient!aaj;")
	static final Class11 aClass11_2 = new Class11(2);

	@OriginalMember(owner = "client!aaj", name = "u", descriptor = "I")
	public final int anInt42;

	@OriginalMember(owner = "client!aaj", name = "i", descriptor = "(I)Lclient!aaj;")
	public static Class11 method328(@OriginalArg(0) int arg0) {
		@Pc(2) Class11[] local2 = Class122_Sub2.method10324(1761435191);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class11 local12 = local2[local4];
			if (local12.anInt42 * 468896967 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aaj", name = "u", descriptor = "()[Lclient!aaj;")
	static Class11[] method329() {
		return new Class11[] { aClass11_3, aClass11_2, aClass11_1 };
	}

	@OriginalMember(owner = "client!aaj", name = "l", descriptor = "()[Lclient!aaj;")
	static Class11[] method330() {
		return new Class11[] { aClass11_3, aClass11_2, aClass11_1 };
	}

	@OriginalMember(owner = "client!aaj", name = "g", descriptor = "(I)Lclient!aaj;")
	public static Class11 method331(@OriginalArg(0) int arg0) {
		@Pc(2) Class11[] local2 = Class122_Sub2.method10324(1863483098);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class11 local12 = local2[local4];
			if (local12.anInt42 * 468896967 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aaj", name = "e", descriptor = "()[Lclient!aaj;")
	static Class11[] method332() {
		return new Class11[] { aClass11_3, aClass11_2, aClass11_1 };
	}

	@OriginalMember(owner = "client!aaj", name = "abx", descriptor = "(Lclient!yp;I)V")
	static void method333(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27140(local12, 2116640420).method27066(1600428229) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aaj", name = "o", descriptor = "(I)I")
	static int method334(@OriginalArg(0) int arg0) {
		@Pc(6) int local6;
		if (Class703.aClass80_Sub37_49.aClass165_Sub44_1.method16875(-517148270) == 0) {
			for (local6 = 0; local6 < client.anInt3444 * 200884815; local6++) {
				if (client.anInterface63Array2[local6].method14074(-1397470062) == 's' || client.anInterface63Array2[local6].method14074(-758809050) == 'S') {
					Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 1, (byte) 14);
					client.aBoolean710 = true;
					Class80.method24400(Class68.aClass68_9, (byte) 38);
					break;
				}
			}
		}
		if (Class365.aClass360_19 == Class360.aClass360_16) {
			if (Class279.aClass491_1 == null) {
				Class279.aClass491_1 = new Class491(Class108_Sub2.aClass139_8, Class411.aClass490_2, Class504.aClass495_3, Class174.aBigInteger3, Class174.aBigInteger4);
			}
			if (!Class279.aClass491_1.method30244(-1998688159)) {
				return 0;
			}
			Class430.method29085(0, null, true, (byte) 0);
			Class365.aBoolean840 = !Class317.method27512((byte) -87);
			Class365.aClass480_98 = Class103_Sub4.method7625(Class365.aBoolean840 ? Class32.aClass32_29 : Class32.aClass32_27, false, 1, true, true, -2025083144);
			Class365.aClass480_99 = Class103_Sub4.method7625(Class32.aClass32_28, false, 1, true, true, -1500974908);
			Class569.aClass480_124 = Class103_Sub4.method7625(Class32.aClass32_10, false, 1, true, true, -1260854377);
			Class329.aClass480_95 = Class103_Sub4.method7625(Class32.aClass32_41, true, 1, true, true, -1461170371);
		}
		@Pc(126) int local126;
		@Pc(114) boolean local114;
		if (Class365.aClass360_19 == Class360.aClass360_2) {
			local114 = Class365.aClass480_99.method29956(2117444573);
			@Pc(118) boolean local118 = Class329.aClass480_95.method29956(2125340009);
			local126 = Class626.aClass141_Sub1Array2[Class32.aClass32_28.method683(-1049838064)].method10910((byte) 14);
			@Pc(142) int local142 = local126 + Class626.aClass141_Sub1Array2[Class365.aBoolean840 ? Class32.aClass32_29.method683(1991220206) : Class32.aClass32_27.method683(378011543)].method10910((byte) 38);
			@Pc(152) int local152 = local142 + Class626.aClass141_Sub1Array2[Class32.aClass32_10.method683(1247709886)].method10910((byte) 60);
			@Pc(162) int local162 = local152 + (local118 ? 100 : Class329.aClass480_95.method29936(-1605381918));
			@Pc(172) int local172 = local162 + (local114 ? 100 : Class365.aClass480_99.method29936(62896774));
			if (local172 != 500) {
				return local172 / 5;
			}
			Class698.aClass638_1 = new Class638(Class329.aClass480_95);
			Class270.aClass647_1 = new Class647(Class329.aClass480_95);
			Class689.method36955(Class698.aClass638_1, 1410719748);
			@Pc(197) int local197 = Class703.aClass80_Sub37_49.aClass165_Sub28_1.method16420(-785547279);
			Class384.aClass90_1 = new Class90(client.aClass722_4, Class512.aClass719_3, Class365.aClass480_99);
			@Pc(209) Class92[] local209 = Class384.aClass90_1.method1856(local197, 2076523414);
			if (local209.length == 0) {
				local209 = Class384.aClass90_1.method1856(0, 2076523414);
			}
			@Pc(224) Class381 local224 = new Class381(Class365.aClass480_98, Class569.aClass480_124);
			if (local209.length > 0) {
				Class365.anInterface30Array1 = new Interface30[local209.length];
				for (@Pc(233) int local233 = 0; local233 < Class365.anInterface30Array1.length; local233++) {
					Class365.anInterface30Array1[local233] = new Class364(Class384.aClass90_1.method1857(local209[local233].anInt327 * -1665702563, -1174710433), local209[local233].anInt326 * 1955972077, local209[local233].anInt328 * 945449557, local224);
				}
			}
		}
		if (Class360.aClass360_3 == Class365.aClass360_19) {
			Class317.aClass464_1 = new Class464(Class279.aClass102_9, Class365.aClass480_98, Class569.aClass480_124, Class546.method31209(-1299761785));
		}
		@Pc(290) int local290;
		if (Class360.aClass360_10 == Class365.aClass360_19) {
			local6 = Class317.aClass464_1.method29608((byte) -38);
			local290 = Class317.aClass464_1.method29592(-1281389959);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class365.aClass360_19 == Class360.aClass360_4) {
			if (Class365.anInterface30Array1 != null && Class365.anInterface30Array1.length > 0) {
				if (Class365.anInterface30Array1[0].method28351(-1966971084) < 100) {
					return 0;
				}
				if (Class365.anInterface30Array1.length > 1 && Class384.aClass90_1.method1860((byte) 6) && Class365.anInterface30Array1[1].method28351(-1997601937) < 100) {
					return 0;
				}
			}
			Class317.aClass464_1.method29589(client.anInterface49_1, 783880298);
			Class440.method29165(Class279.aClass102_9, -148161080);
			Class604.method32148(11, -1420016371);
		}
		if (Class360.aClass360_1 == Class365.aClass360_19) {
			Class708.aClass480_136 = Class103_Sub4.method7625(Class32.aClass32_7, false, 1, false, true, -825822574);
			Class297.aClass480_92 = Class103_Sub4.method7625(Class32.aClass32_15, false, 1, false, true, -1794088396);
			Class578.aClass480_125 = Class103_Sub4.method7625(Class32.aClass32_32, false, 1, false, true, -1240110936);
			Class380.aClass480_105 = Class103_Sub4.method7625(Class32.aClass32_42, false, 1, false, true, -1249073364);
			Class171.aClass480_82 = Class103_Sub4.method7625(Class32.aClass32_24, false, 1, true, true, -789012955);
			Class688.aClass480_135 = Class103_Sub4.method7625(Class32.aClass32_36, false, 1, true, true, -961290628);
			Class104_Sub2.aClass480_16 = Class103_Sub4.method7625(Class32.aClass32_4, false, 1, true, true, -1552109205);
			Class325.aClass480_94 = Class103_Sub4.method7625(Class32.aClass32_5, true, 1, false, true, -1214396965);
			Class626.aClass480_129 = Class103_Sub4.method7625(Class32.aClass32_2, false, 1, false, true, -1972581339);
			Class270.aClass480_89 = Class103_Sub4.method7625(Class32.aClass32_1, true, 1, false, true, -1276713108);
			client.aClass480_83 = Class103_Sub4.method7625(Class32.aClass32_8, false, 1, false, true, -1644309040);
			Class438.aClass480_112 = Class103_Sub4.method7625(Class32.aClass32_9, false, 1, true, true, -973561627);
			Class9.aClass480_1 = Class103_Sub4.method7625(Class32.aClass32_14, true, 1, false, false, -863233814);
			Class238.aClass480_88 = Class103_Sub4.method7625(Class32.aClass32_31, true, 1, false, false, -1153807492);
			Class223.aClass480_84 = Class103_Sub4.method7625(Class32.aClass32_11, false, 1, true, true, -1678262315);
			Class56.aClass480_7 = Class103_Sub4.method7625(Class32.aClass32_12, false, 1, true, true, -1601158337);
			Class352.aClass480_97 = Class103_Sub4.method7625(Class32.aClass32_13, false, 1, true, true, -1952557285);
			Class231.aClass480_86 = Class103_Sub4.method7625(Class32.aClass32_25, false, 1, true, true, -1196083858);
			Class143_Sub3.aClass480_34 = Class103_Sub4.method7625(Class32.aClass32_3, false, 1, true, true, -1910234329);
			Class83.aClass480_12 = Class103_Sub4.method7625(Class32.aClass32_16, false, 1, true, true, -1061299955);
			Class228.aClass480_85 = Class103_Sub4.method7625(Class32.aClass32_17, false, 1, true, true, -2123781500);
			Class588.aClass480_127 = Class103_Sub4.method7625(Class32.aClass32_18, true, 1, false, false, -2091765986);
			Class310.aClass480_93 = Class103_Sub4.method7625(Class32.aClass32_40, true, 1, false, true, -1402336647);
			Class62.aClass480_8 = Class103_Sub4.method7625(Class32.aClass32_19, false, 1, true, true, -1456140540);
			Class480.aClass480_120 = Class103_Sub4.method7625(Class32.aClass32_20, false, 1, true, true, -1344797444);
			Class371.aClass480_102 = Class103_Sub4.method7625(Class32.aClass32_6, true, 1, true, true, -1564323078);
			Class687.aClass480_134 = Class103_Sub4.method7625(Class32.aClass32_22, false, 1, true, true, -1203605659);
			Class155.aClass480_41 = Class103_Sub4.method7625(Class32.aClass32_38, false, 1, true, true, -1475858065);
			Class110_Sub1.aClass480_17 = Class103_Sub4.method7625(Class32.aClass32_30, true, 1, false, true, -2034806134);
			Class40.aClass480_3 = Class103_Sub4.method7625(Class32.aClass32_39, true, 1, false, true, -1523474318);
			Class80_Sub15.aClass480_35 = Class103_Sub4.method7625(Class32.aClass32_26, true, 1, true, true, -1348436143);
		}
		if (Class365.aClass360_19 == Class360.aClass360_6) {
			local6 = 0;
			local290 = 0;
			for (local126 = 0; local126 < Class626.aClass141_Sub1Array2.length; local126++) {
				if (Class626.aClass141_Sub1Array2[local126] != null) {
					local6 += Class626.aClass141_Sub1Array2[local126].method10910((byte) 2);
					local290++;
				}
			}
			if (local290 > 0) {
				local6 /= local290;
			}
			if (local6 != 100) {
				if (Class365.anInt4500 * 348448447 < 0) {
					Class365.anInt4500 = local6 * -2035185345;
				}
				return (local6 - Class365.anInt4500 * 348448447) * 100 / (100 - Class365.anInt4500 * 348448447);
			}
			Class22.method544(Class698.aClass638_1, -1688667337);
			Class317.aClass464_1 = new Class464(Class279.aClass102_9, Class708.aClass480_136, Class569.aClass480_124, Class546.method31209(-465452079));
		}
		if (Class360.aClass360_5 == Class365.aClass360_19) {
			@Pc(677) byte[] local677 = Class329.aClass480_95.method29926(Class639.aClass639_4.anInt5637 * 1101033235, 1472047355);
			if (local677 == null) {
				return 0;
			}
			Class490.aClass263_13 = new Class263();
			Class490.aClass263_13.method26514(50, 7340032, 1723446770);
			Class245.method26320(local677, (short) -7426);
			Class604.method32148(1, -2028298286);
		}
		if (Class365.aClass360_19 == Class360.aClass360_8 && Class373.aClass586_1 == null) {
			Class373.aClass586_1 = new Class586(Class40.aClass480_3);
			Class308.method27439(Class373.aClass586_1, 2093799885);
		}
		if (Class365.aClass360_19 == Class360.aClass360_17) {
			local6 = Class325.method27624(764279687);
			if (local6 < 100) {
				return local6;
			}
			Class335.method27855(Class329.aClass480_95.method29926(Class639.aClass639_8.anInt5637 * 1101033235, 1472047355), -1566237861);
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
		if (Class360.aClass360_11 == Class365.aClass360_19) {
			if (-2013498219 * Class698.aClass638_1.anInt5630 != -1 && !Class626.aClass480_129.method29925(Class698.aClass638_1.anInt5630 * -2013498219, 0, 361295762)) {
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
			client.aClass539_1.method30911(Class5.aClass41_Sub3_1, -782894892);
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
			Class161.aMap13 = Class43.method928(new Class2_Sub1[] { Class615.aClass2_Sub1_Sub2_14, Class528.aClass2_Sub1_Sub1_3, Class110.aClass2_Sub1_Sub2_2, Class143.aClass2_Sub1_Sub2_12, Class130.aClass2_Sub1_Sub2_6, Class188.aClass2_Sub1_Sub2_13, Class121.aClass2_Sub1_Sub2_4 }, 1904466522);
			Class664.aClass41_Sub17_2 = new Class41_Sub17(client.aClass722_4, Class512.aClass719_3, Class171.aClass480_82, Class161.aMap13);
			Class297.anInterface21_4 = new Class371();
			Class165_Sub21.method16249(Class104_Sub2.aClass480_16, Class626.aClass480_129, Class708.aClass480_136, Class569.aClass480_124, 1202238053);
			Class475.aClass445_1 = new Class445(Class155.aClass480_41);
			Class380.aClass444_1 = new Class444(Class687.aClass480_134);
			Class447.aClass450_1 = new Class450(Class687.aClass480_134);
			Class71.aClass510_2 = new Class510(Class512.aClass719_3, Class62.aClass480_8, Class480.aClass480_120);
			Class610.aClass52_2 = new Class52(Class512.aClass719_3, Class62.aClass480_8, Class480.aClass480_120, new Class440());
			Class672.aClass134_1 = new Class134(Class528.aClass2_Sub1_Sub1_3, Class664.aClass41_Sub17_2, Class450.aClass634_1.method32799(525331900));
			Class522.method30640(621260199);
			Class343.method27944(Class125.aClass41_Sub1_6, 1468936825);
			Class387.method28616(Class447.aClass450_1, Class380.aClass444_1, (byte) -48);
			Class35.method759(Class626.aClass480_129, Class626.aClass235_8, Class39.anInterface23_1, (byte) 90);
			@Pc(1212) Class336 local1212 = new Class336(client.aClass480_83.method29938("huffman", "", -1406931575));
			Class211.method25821(local1212, 1444582414);
			Class554.aClass146_2 = Class257.method26425((short) -24982);
			Class705.aClass80_Sub39_1 = new Class80_Sub39(true);
		}
		if (Class365.aClass360_19 == Class360.aClass360_9) {
			local6 = Class528.method30718(Class708.aClass480_136, 1831537709) + Class317.aClass464_1.method29591(true, (byte) 1);
			local290 = Class356.method28102((byte) 0) + Class317.aClass464_1.method29592(-1281389959);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class365.aClass360_19 == Class360.aClass360_12) {
			Class159.method15333(Class588.aClass480_127, Class310.aClass480_93, Class704.aClass41_Sub6_3, Class20.aClass41_Sub21_11, client.aClass539_1.method30905(-2106579016), Class157.aClass41_Sub13_2, Class265.aClass41_Sub12_3, Class672.aClass134_1, Class672.aClass134_1);
		}
		if (Class365.aClass360_19 == Class360.aClass360_13) {
			Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1 = new Class110_Sub1(Class615.aClass2_Sub1_Sub2_14);
			Class596.method31993(1901517509);
			Class587.aClass474_1 = Class437.method29140(122807954);
			Class325.aClass480_94.method29932(false, true, -2050865856);
			Class708.aClass480_136.method29932(true, true, -1891638288);
			Class569.aClass480_124.method29932(true, true, -2141591704);
			client.aClass480_83.method29932(true, true, -2092416176);
			client.aBoolean716 = true;
		}
		if (Class360.aClass360_14 == Class365.aClass360_19 && -812846045 * Class698.aClass638_1.anInt5615 != -1) {
			if (!Class71.method18185(Class698.aClass638_1.anInt5615 * -812846045, null, (byte) 100)) {
				return 0;
			}
			local114 = true;
			for (local290 = 0; local290 < Class709.aClass310Array1[Class698.aClass638_1.anInt5615 * -812846045].aClass327Array2.length; local290++) {
				@Pc(1344) Class327 local1344 = Class709.aClass310Array1[Class698.aClass638_1.anInt5615 * -812846045].aClass327Array2[local290];
				if (local1344.anInt4135 * 710314345 == 5 && local1344.anInt4117 * -706354509 != -1 && !Class708.aClass480_136.method29925(local1344.anInt4117 * -706354509, 0, -1729570513)) {
					local114 = false;
				}
			}
			if (!local114) {
				return 0;
			}
		}
		if (Class365.aClass360_19 == Class360.aClass360_7) {
			Class559.method31408(true, -5301585);
		}
		if (Class360.aClass360_15 == Class365.aClass360_19) {
			Class365.aClass369_1.method28308(-2763975);
			try {
				Class365.aThread7.join();
			} catch (@Pc(1389) InterruptedException local1389) {
				return 0;
			}
			Class365.aClass369_1 = null;
			Class365.aThread7 = null;
			Class365.aClass480_98 = null;
			Class365.aClass480_99 = null;
			Class384.aClass90_1 = null;
			Class365.anInterface30Array1 = null;
			Class673.aMap22.remove(Class32.aClass32_28);
			Class673.aMap22.remove(Class32.aClass32_27);
			Class673.aMap22.remove(Class32.aClass32_29);
			Class279.method26845(-1308628666);
			client.aBoolean709 = Class703.aClass80_Sub37_49.aClass165_Sub44_1.method16875(1492463754) == 1;
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 1, (byte) 122);
			if (client.aBoolean709) {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 101);
			} else if (Class703.aClass80_Sub37_49.aClass165_Sub1_1.aBoolean417 && Class705.aClass80_Sub39_1.anInt1719 * 625439365 < 512 && Class705.aClass80_Sub39_1.anInt1719 * 625439365 != 0) {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 120);
			}
			Class719.method37291(832952932);
			if (client.aBoolean709) {
				Class528.method30719(0, false, 1745917737);
				if (!client.aBoolean710) {
					Class80.method24400(Class68.aClass68_2, (byte) 62);
				}
			} else {
				Class528.method30719(Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(2068267656), false, 298707782);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_1.method15834(-2078883970) == 0) {
					Class80.method24400(Class68.aClass68_11, (byte) 20);
				}
			}
			Class126.method20383(Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767), -1, -1, false, 1615516245);
			Class317.aClass464_1.method29589(client.anInterface49_1, 522398973);
			Class440.method29165(Class279.aClass102_9, -148161080);
			Class430.method29086(Class279.aClass102_9, Class708.aClass480_136, 1991199918);
		}
		return Class79.method1434((short) 128);
	}

	@OriginalMember(owner = "client!aaj", name = "of", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method335(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2105280890) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray16 = Class431.method29089(local13, arg2, 1172953258);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!aaj", name = "<init>", descriptor = "(I)V")
	Class11(@OriginalArg(0) int arg0) {
		this.anInt42 = arg0 * 62665975;
	}
}
