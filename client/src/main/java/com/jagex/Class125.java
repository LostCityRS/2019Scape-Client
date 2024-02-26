package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public class Class125 implements Interface33 {

	@OriginalMember(owner = "client!kn", name = "hm", descriptor = "Lclient!aoa;")
	public static Class41_Sub1 aClass41_Sub1_6;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "Lclient!ky;")
	public final Class391 aClass391_8;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Lclient!km;")
	public final Class383 aClass383_8;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
	public final int anInt2899;

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
	public final int anInt2901;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
	public final int anInt2900;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public final int anInt2903;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
	public final int anInt2902;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public final int anInt2904;

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public final int anInt2905;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(Lclient!ald;)Lclient!kn;")
	static Class125 method20585(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(6) Class391 local6 = Class58_Sub1.method15727((byte) -10)[arg0.method23362(122451990)];
		@Pc(13) Class383 local13 = Class646.method33047(-1097781758)[arg0.method23362(-1629648972)];
		@Pc(17) int local17 = arg0.method23179(-615657693);
		@Pc(21) int local21 = arg0.method23179(-562338935);
		@Pc(25) int local25 = arg0.method23178((byte) -29);
		@Pc(29) int local29 = arg0.method23178((byte) -33);
		@Pc(33) int local33 = arg0.method23179(638892931);
		@Pc(37) int local37 = arg0.method23210((byte) 17);
		@Pc(41) int local41 = arg0.method23182(1028607672);
		return new Class125(local6, local13, local17, local21, local25, local29, local33, local37, local41);
	}

	@OriginalMember(owner = "client!kn", name = "mk", descriptor = "(Lclient!yp;B)V")
	static void method20586(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2138330590);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class148.method13459(local16, local22, arg0, -416244358);
	}

	@OriginalMember(owner = "client!kn", name = "ade", descriptor = "(Lclient!yp;I)V")
	static void method20587(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass533ArrayArray1[local23][local13].anInt5071 * -1376579087;
	}

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "(Lclient!yp;I)V")
	static void method20588(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], -1232964656)).anInt4260 * 1673510067;
	}

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "(I)Z")
	static boolean method20589(@OriginalArg(0) int arg0) {
		if (Class355.aProcess1 == null) {
			return false;
		}
		try {
			Class355.aProcess1.exitValue();
			return true;
		} catch (@Pc(10) IllegalThreadStateException local10) {
			return false;
		}
	}

	@OriginalMember(owner = "client!kn", name = "mp", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method20590(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1833393535) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray13 = Class431.method29089(local13, arg2, 1764897821);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!kn", name = "jp", descriptor = "(I)V")
	static void method20591(@OriginalArg(0) int arg0) {
		@Pc(2) Class80_Sub36_Sub1 local2 = client.aClass75_1.aClass80_Sub36_Sub1_1;
		for (@Pc(4) int local4 = 0; local4 < client.anInt3438 * 1467537193; local4++) {
			@Pc(13) int local13 = client.anIntArray308[local4];
			@Pc(21) Class120_Sub1_Sub1_Sub1_Sub1 local21 = (Class120_Sub1_Sub1_Sub1_Sub1) ((Class80_Sub19) client.aClass24_18.method560((long) local13)).anObject5;
			local2.method23178((byte) -44);
			@Pc(29) int local29 = local2.method23362(-381197962);
			if ((local29 & 0x2) != 0) {
				local29 += local2.method23362(85937560) << 8;
			}
			if ((local29 & 0x200) != 0) {
				local29 += local2.method23362(-224293485) << 16;
			}
			if ((local29 & 0x100000) != 0) {
				local29 += local2.method23362(155470771) << 24;
			}
			@Pc(74) int local74;
			@Pc(77) int[] local77;
			@Pc(80) int[] local80;
			@Pc(82) int local82;
			@Pc(89) int local89;
			@Pc(98) int local98;
			if ((local29 & 0x4000) != 0) {
				local74 = local2.method23362(-2073902182);
				local77 = new int[local74];
				local80 = new int[local74];
				for (local82 = 0; local82 < local74; local82++) {
					local89 = local2.method23221(-54859569);
					if ((local89 & 0xC000) == 49152) {
						local98 = local2.method23223(-974209230);
						local77[local82] = local89 << 16 | local98;
					} else {
						local77[local82] = local89;
					}
					local80[local82] = local2.method23178((byte) -102);
				}
				local21.method18957(local77, local80, (byte) 123);
			}
			if ((local29 & 0x20000) != 0) {
				local74 = local2.method23212(2067864541);
				local77 = new int[8];
				@Pc(138) short[] local138 = new short[8];
				for (local82 = 0; local82 < 8; local82++) {
					if ((local74 & 0x1 << local82) == 0) {
						local77[local82] = -1;
						local138[local82] = -1;
					} else {
						local77[local82] = local2.method23210((byte) 113);
						local138[local82] = (short) local2.method23196(210051473);
					}
				}
				local21.aClass351_1 = new Class351(local77, local138);
			}
			if ((local29 & 0x10000) != 0) {
				local21.aString72 = local2.method23376((short) 27495);
				if ("".equals(local21.aString72) || local21.aString72.equals(local21.aClass335_1.aString188)) {
					local21.aString72 = local21.aClass335_1.aString188;
				}
			}
			if ((local29 & 0x1) != 0) {
				local21.anInt2660 = local2.method23221(-863139613) * 881366843;
				local21.anInt2669 = local2.method23221(-211947852) * -1993828977;
			}
			@Pc(238) int local238;
			@Pc(247) int local247;
			@Pc(273) boolean local273;
			if ((local29 & 0x8000000) != 0) {
				local74 = local2.method23178((byte) -124);
				local238 = local2.method23314(2086650112);
				if (local74 == 65535) {
					local74 = -1;
				}
				local247 = local2.method23212(-1583882908);
				local82 = local247 & 0x7;
				local89 = local247 >> 3 & 0xF;
				if (local89 == 15) {
					local89 = -1;
				}
				local273 = (local247 >> 7 & 0x1) == 1;
				local21.method18998(local74, local238, local82, local89, local273, 2, -360356141);
			}
			if ((local29 & 0x2000000) != 0) {
				local74 = local2.method23178((byte) -126);
				local238 = local2.method23267(1848584146);
				if (local74 == 65535) {
					local74 = -1;
				}
				local247 = local2.method23245(482393438);
				local82 = local247 & 0x7;
				local89 = local247 >> 3 & 0xF;
				if (local89 == 15) {
					local89 = -1;
				}
				local273 = (local247 >> 7 & 0x1) == 1;
				local21.method18998(local74, local238, local82, local89, local273, 4, -360356141);
			}
			if ((local29 & 0x10) != 0) {
				if (local21.aClass335_1.method27835((byte) 45)) {
					Class599.method32051(local21, (short) 12212);
				}
				local21.method18813((Class335) Class460.aClass41_Sub2_1.method18054(local2.method23210((byte) 56), -455710266), (local29 & 0x10000) == 0, (local29 & 0x800000) == 0, true, -784674768);
				local21.method18984(local21.aClass335_1.anInt4212 * 1573297955, (byte) 39);
				local21.anInt2697 = (local21.aClass335_1.anInt4209 * -2090808675 << 3) * 77355267;
				if (local21.aClass335_1.method27835((byte) 45)) {
					Class676.method33587(local21.aByte99, local21.anIntArray234[0], local21.anIntArray242[0], 0, null, local21, null, (byte) -104);
				}
			}
			if ((local29 & 0x10000000) != 0) {
				local21.aByte70 = local2.method23216(1831183447);
				local21.aByte71 = local2.method23244(2015790970);
				local21.aByte72 = local2.method23244(1159735819);
				local21.aByte73 = (byte) local2.method23362(-1303004971);
				local21.anInt2698 = (client.anInt3436 + local2.method23221(-1087714193)) * 396975409;
				local21.anInt2692 = (client.anInt3436 + local2.method23222(872248056)) * 184947885;
			}
			if ((local29 & 0x40) != 0) {
				@Pc(469) int[] local469 = new int[4];
				for (local238 = 0; local238 < 4; local238++) {
					local469[local238] = local2.method23210((byte) 74);
				}
				local238 = local2.method23245(482393438);
				Class302.method27107(local21, local469, local238, true, -1841777501);
			}
			if ((local29 & 0x4000000) != 0) {
				local74 = local2.method23178((byte) -4);
				local238 = local2.method23314(2086650112);
				if (local74 == 65535) {
					local74 = -1;
				}
				local247 = local2.method23213(-1919431047);
				local82 = local247 & 0x7;
				local89 = local247 >> 3 & 0xF;
				if (local89 == 15) {
					local89 = -1;
				}
				local273 = (local247 >> 7 & 0x1) == 1;
				local21.method18998(local74, local238, local82, local89, local273, 3, -360356141);
			}
			if ((local29 & 0x2000) != 0) {
				local74 = local2.method23178((byte) -24);
				local238 = local2.method23314(2086650112);
				if (local74 == 65535) {
					local74 = -1;
				}
				local247 = local2.method23245(482393438);
				local82 = local247 & 0x7;
				local89 = local247 >> 3 & 0xF;
				if (local89 == 15) {
					local89 = -1;
				}
				local273 = (local247 >> 7 & 0x1) == 1;
				local21.method18998(local74, local238, local82, local89, local273, 1, -360356141);
			}
			@Pc(711) int local711;
			@Pc(650) int[] local650;
			if ((local29 & 0x80000) != 0) {
				local74 = 0;
				if (local21.aClass335_1.aShortArray115 != null) {
					local74 = local21.aClass335_1.aShortArray115.length;
				}
				@Pc(623) byte local623 = 0;
				if (local21.aClass335_1.aShortArray117 != null) {
					local74 = local21.aClass335_1.aShortArray117.length;
				}
				local247 = local2.method23212(-328678735);
				if ((local247 & 0x1) != 1) {
					local2.anInt3152 += 2068361142;
					local650 = null;
					if ((local247 & 0x2) == 2) {
						local89 = local2.method23362(737599882);
						local650 = new int[local89];
						for (local98 = 0; local98 < local89; local98++) {
							local650[local98] = local2.method23210((byte) 29);
						}
					}
					@Pc(677) short[] local677 = null;
					if ((local247 & 0x4) == 4) {
						local677 = new short[local74];
						for (local98 = 0; local98 < local74; local98++) {
							local677[local98] = (short) local2.method23222(66073614);
						}
					}
					@Pc(701) short[] local701 = null;
					if ((local247 & 0x8) == 8) {
						local701 = new short[local623];
						for (local711 = 0; local711 < local623; local711++) {
							local701[local711] = (short) local2.method23221(-546607096);
						}
					}
					@Pc(734) long local734 = (long) ((Class120_Sub1_Sub1_Sub1_Sub1.anInt2665 += -1016810513) * -1349199089 - 1);
					new Class350(local734, local650, null, null, null, local677, local701);
				}
			}
			@Pc(795) Class519 local795;
			@Pc(801) Class460 local801;
			if ((local29 & 0x200000) != 0) {
				local21.anInterface4_5.method720((byte) -61);
				local2.anInt3152 += 2068361142;
				local74 = local2.aByteArray61[(local2.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
				for (local238 = 0; local238 < local74; local238++) {
					local247 = local2.method23212(-184409080);
					local795 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), local247, -1391007302);
					local801 = Class110.aClass2_Sub1_Sub2_2.method1828(local2, local795, -1942780383);
					local21.anInterface4_5.method719(local801.anInt4907 * -38979583, local801.anObject19, -1877809628);
				}
			}
			if ((local29 & 0x800) != 0) {
				local21.anInt2663 = local2.method23178((byte) -41) * -611234997;
				if (local21.anInt2663 * -2039454109 == 65535) {
					local21.anInt2663 = 611234997;
				}
			}
			if ((local29 & 0x1000) != 0) {
				local74 = local2.method23213(-1678279638);
				local77 = new int[local74];
				local80 = new int[local74];
				local650 = new int[local74];
				for (local89 = 0; local89 < local74; local89++) {
					local98 = local2.method23210((byte) 55);
					local77[local89] = local98;
					local80[local89] = local2.method23362(-1390566923);
					local650[local89] = local2.method23178((byte) -13);
				}
				Class110_Sub1.method7316(local21, local77, local80, local650, 1889931862);
			}
			if ((local29 & 0x20) != 0) {
				local21.anInt2683 = local2.method23222(256866025) * 1779375907;
				if (local21.anInt2683 * 1232799883 == 65535) {
					local21.anInt2683 = -1779375907;
				}
			}
			if ((local29 & 0x20000000) != 0) {
				local21.aBoolean453 = local2.method23212(-1085555851) == 1;
			}
			if ((local29 & 0x400000) != 0) {
				local2.anInt3152 += 2068361142;
				local74 = local2.aByteArray61[(local2.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
				for (local238 = 0; local238 < local74; local238++) {
					local247 = local2.method23212(-1810125772);
					local795 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), local247, -1228560849);
					local801 = Class110.aClass2_Sub1_Sub2_2.method1828(local2, local795, -1805749827);
					local21.anInterface4_5.method719(local801.anInt4907 * -38979583, local801.anObject19, -1775207711);
				}
			}
			if ((local29 & 0x800000) != 0) {
				local21.anInt2664 = local2.method23222(1736498318) * 1851711665;
				if (local21.anInt2664 * -123508655 == 65535) {
					local21.anInt2664 = local21.aClass335_1.anInt4202 * -1042032667;
				}
			}
			if ((local29 & 0x40000) != 0) {
				local74 = local2.aByteArray61[(local2.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
				for (local238 = 0; local238 < local74; local238++) {
					local247 = local2.method23212(1995449323);
					local82 = local2.method23314(2086650112);
					local89 = local2.method23228(-874919685);
					local21.method18799(local247, local82, local89, (byte) 83);
				}
			}
			if ((local29 & 0x4) != 0) {
				local21.method18788(local2.method23376((short) 20370), 0, 0, 1855196700);
			}
			@Pc(1130) int local1130;
			if ((local29 & 0x400) != 0) {
				local74 = 0;
				if (local21.aClass335_1.aShortArray115 != null) {
					local74 = local21.aClass335_1.aShortArray115.length;
				}
				local238 = 0;
				if (local21.aClass335_1.aShortArray117 != null) {
					local238 = local21.aClass335_1.aShortArray117.length;
				}
				local247 = local2.method23245(482393438);
				if ((local247 & 0x1) == 1) {
					local21.aClass350_1 = null;
				} else {
					local2.anInt3152 += 2068361142;
					local650 = null;
					@Pc(1115) float[] local1115 = null;
					@Pc(1118) int[][] local1118 = null;
					@Pc(1121) int[][] local1121 = null;
					@Pc(1151) int local1151;
					@Pc(1178) int local1178;
					if ((local247 & 0x2) == 2) {
						local1130 = local2.method23213(-2129065780);
						local650 = new int[local1130];
						if ((local247 & 0x10) == 16) {
							local1115 = new float[local1130];
							local1118 = new int[local1130][3];
							local1121 = new int[local1130][3];
						}
						for (local1151 = 0; local1151 < local1130; local1151++) {
							local650[local1151] = local2.method23210((byte) 82);
							if ((local247 & 0x10) == 16 && local650[local1151] != -1) {
								local1115[local1151] = local2.method23188(546448265);
								for (local1178 = 0; local1178 < 3; local1178++) {
									local1118[local1151][local1178] = local2.method23313(1201352605);
								}
								for (local1178 = 0; local1178 < 3; local1178++) {
									local1121[local1151][local1178] = local2.method23176(252778250);
								}
							}
						}
					}
					@Pc(1210) short[] local1210 = null;
					if ((local247 & 0x4) == 4) {
						local1210 = new short[local74];
						for (local1151 = 0; local1151 < local74; local1151++) {
							local1210[local1151] = (short) local2.method23178((byte) -90);
						}
					}
					@Pc(1234) short[] local1234 = null;
					if ((local247 & 0x8) == 8) {
						local1234 = new short[local238];
						for (local1178 = 0; local1178 < local238; local1178++) {
							local1234[local1178] = (short) local2.method23223(685651393);
						}
					}
					@Pc(1267) long local1267 = (long) ((Class120_Sub1_Sub1_Sub1_Sub1.anInt2662 += 1431213341) * 422761781 - 1);
					local21.aClass350_1 = new Class350(local1267, local650, local1115, local1118, local1121, local1210, local1234);
				}
			}
			if ((local29 & 0x8) != 0) {
				local74 = local2.method23362(-1565402509);
				if (local74 > 0) {
					for (local238 = 0; local238 < local74; local238++) {
						local82 = -1;
						@Pc(1298) boolean local1298 = true;
						local98 = -1;
						local247 = local2.method23195(1898481573);
						if (local247 == 32767) {
							local247 = local2.method23195(1817774939);
							local89 = local2.method23195(1783236504);
							local82 = local2.method23195(1785755918);
							local98 = local2.method23195(1950374364);
						} else if (local247 == 32766) {
							local247 = -1;
							local89 = local2.method23212(573386802);
						} else {
							local89 = local2.method23195(1904946994);
						}
						local711 = local2.method23195(2018994780);
						local21.method18962(local247, local89, local82, local98, client.anInt3436, local711, 2006951635);
					}
				}
				local238 = local2.method23213(-144402483);
				if (local238 > 0) {
					for (local247 = 0; local247 < local238; local247++) {
						local82 = local2.method23195(1480949270);
						local89 = local2.method23195(1994262011);
						if (local89 == 32767) {
							local21.method18964(local82, -376629209);
						} else {
							local98 = local2.method23195(1891161062);
							local711 = local2.method23362(-195484562);
							local1130 = local89 > 0 ? local2.method23245(482393438) : local711;
							local21.method18963(local82, client.anInt3436, local89, local98, local711, local1130, -910068450);
						}
					}
				}
			}
			if ((local29 & 0x8000) != 0) {
				local21.anInt2684 = local2.method23177((byte) 18) * 667758131;
				local21.anInt2704 = local2.method23216(1831183447) * -1025470439;
				local21.anInt2676 = local2.method23216(1831183447) * -465151701;
				local21.anInt2675 = local2.method23177((byte) -67) * 1443464925;
				local21.anInt2686 = local2.method23217(-1252862078) * -638322203;
				local21.anInt2687 = local2.method23216(1831183447) * 1429480385;
				local21.anInt2688 = (local2.method23222(1207696101) + client.anInt3436) * 1890574175;
				local21.anInt2689 = (local2.method23221(-1865545199) + client.anInt3436) * -2021716995;
				local21.anInt2677 = local2.method23223(253663150) * 1338483447;
				local21.anInt2700 = -1307113885;
				local21.anInt2702 = 0;
				local21.anInt2684 += local21.anIntArray234[0] * 667758131;
				local21.anInt2704 += local21.anIntArray242[0] * -1025470439;
				local21.anInt2676 += local21.anIntArray234[0] * -465151701;
				local21.anInt2675 += local21.anIntArray242[0] * 1443464925;
				local21.anInt2686 += local21.aByte99 * -638322203;
				local21.anInt2687 += local21.aByte99 * 1429480385;
			}
			if ((local29 & 0x80) != 0) {
				local74 = local2.method23222(851931358);
				local238 = local2.method23267(1607259405);
				if (local74 == 65535) {
					local74 = -1;
				}
				local247 = local2.method23362(-1656473834);
				local82 = local247 & 0x7;
				local89 = local247 >> 3 & 0xF;
				if (local89 == 15) {
					local89 = -1;
				}
				local273 = (local247 >> 7 & 0x1) == 1;
				local21.method18998(local74, local238, local82, local89, local273, 0, -360356141);
			}
			if ((local29 & 0x1000000) != 0) {
				local21.anInt2666 = local2.method23213(-771885998) * 234032277;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!ky;Lclient!km;IIIIIII)V")
	Class125(@OriginalArg(0) Class391 arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass391_8 = arg0;
		this.aClass383_8 = arg1;
		this.anInt2899 = arg2 * 352624697;
		this.anInt2901 = arg3 * -1600293619;
		this.anInt2900 = arg4 * 712125723;
		this.anInt2903 = arg5 * -608319429;
		this.anInt2902 = arg6 * 2124046411;
		this.anInt2904 = arg7 * 1427070567;
		this.anInt2905 = arg8 * 419801555;
	}

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return null;
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return null;
	}
}
