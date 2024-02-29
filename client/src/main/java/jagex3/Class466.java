package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class466 {

	@OriginalMember(owner = "client!on", name = "hh", descriptor = "Lclient!aox;")
	public static Class32_Sub20 aClass32_Sub20_3;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "I")
	public final int anInt5253;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "Ljava/lang/Object;")
	public Object anObject19;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(Lclient!alw;I)Lclient!kn;")
	public static Class383 method29507(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(10) Class390 local10 = Class708.method36937(745941502)[arg0.method22425((short) 16384)];
		@Pc(17) Class392 local17 = Class252.method26071(2012199832)[arg0.method22425((short) 16384)];
		@Pc(21) int local21 = arg0.method22494((byte) -98);
		@Pc(25) int local25 = arg0.method22494((byte) -64);
		@Pc(29) int local29 = arg0.method22427(-1434290800);
		@Pc(33) int local33 = arg0.method22427(-1434290800);
		@Pc(37) int local37 = arg0.method22431(-118643075);
		@Pc(41) int local41 = arg0.method22431(-118643075);
		@Pc(45) int local45 = arg0.method22431(-118643075);
		@Pc(54) boolean local54 = arg0.method22425((short) 16384) == 1;
		return new Class383(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!on", name = "arz", descriptor = "(Lclient!yf;B)V")
	static void method29508(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		if (client.aString140 == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = client.aString140;
		}
	}

	@OriginalMember(owner = "client!on", name = "jd", descriptor = "(I)V")
	static void method29509(@OriginalArg(0) int arg0) {
		@Pc(2) Class93_Sub41_Sub2 local2 = client.aClass175_2.aClass93_Sub41_Sub2_2;
		for (@Pc(4) int local4 = 0; local4 < client.anInt3472 * 146012633; local4++) {
			@Pc(13) int local13 = client.anIntArray306[local4];
			@Pc(21) Class132_Sub1_Sub1_Sub1_Sub1 local21 = (Class132_Sub1_Sub1_Sub1_Sub1) ((Class93_Sub15) client.aClass16_18.method215((long) local13)).anObject5;
			local2.method22427(-1434290800);
			@Pc(29) int local29 = local2.method22425((short) 16384);
			if ((local29 & 0x2) != 0) {
				local29 += local2.method22425((short) 16384) << 8;
			}
			if ((local29 & 0x200) != 0) {
				local29 += local2.method22425((short) 16384) << 16;
			}
			if ((local29 & 0x100000) != 0) {
				local29 += local2.method22425((short) 16384) << 24;
			}
			@Pc(75) int local75;
			@Pc(79) int local79;
			@Pc(88) int local88;
			@Pc(92) int local92;
			@Pc(98) int local98;
			@Pc(114) boolean local114;
			if ((local29 & 0x4000000) != 0) {
				local75 = local2.method22469(2095838198);
				local79 = local2.method22550(1306646565);
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22425((short) 16384);
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20022(local75, local79, local92, local98, local114, 3, (byte) -54);
			}
			if ((local29 & 0x2000) != 0) {
				local75 = local2.method22469(2143941252);
				local79 = local2.method22550(-542301339);
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22511(1674129695);
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20022(local75, local79, local92, local98, local114, 1, (byte) -56);
			}
			@Pc(190) int[] local190;
			@Pc(193) int[] local193;
			@Pc(196) int[] local196;
			@Pc(205) int local205;
			if ((local29 & 0x1000) != 0) {
				local75 = local2.method22511(1898014329);
				local190 = new int[local75];
				local193 = new int[local75];
				local196 = new int[local75];
				for (local98 = 0; local98 < local75; local98++) {
					local205 = local2.method22448(-1721952417);
					local190[local98] = local205;
					local193[local98] = local2.method22425((short) 16384);
					local196[local98] = local2.method22455(2073931757);
				}
				Class133_Sub1.method10077(local21, local190, local193, local196, (short) 8650);
			}
			if ((local29 & 0x4000) != 0) {
				local75 = local2.method22511(1353614121);
				local190 = new int[local75];
				local193 = new int[local75];
				for (local92 = 0; local92 < local75; local92++) {
					local98 = local2.method22455(1678932452);
					if ((local98 & 0xC000) == 49152) {
						local205 = local2.method22471(16711680);
						local190[local92] = local98 << 16 | local205;
					} else {
						local190[local92] = local98;
					}
					local193[local92] = local2.method22427(-1434290800);
				}
				local21.method19966(local190, local193, 586855086);
			}
			if ((local29 & 0x1000000) != 0) {
				local21.anInt2651 = local2.method22461(1188826845) * -2009901847;
			}
			if ((local29 & 0x1) != 0) {
				local21.anInt2642 = local2.method22469(654892928) * 757135575;
				local21.anInt2643 = local2.method22469(883912003) * -1574519779;
			}
			@Pc(427) int local427;
			if ((local29 & 0x80000) != 0) {
				local75 = 0;
				if (local21.aClass336_1.aShortArray118 != null) {
					local75 = local21.aClass336_1.aShortArray118.length;
				}
				@Pc(338) byte local338 = 0;
				if (local21.aClass336_1.aShortArray120 != null) {
					local75 = local21.aClass336_1.aShortArray120.length;
				}
				local88 = local2.method22425((short) 16384);
				if ((local88 & 0x1) != 1) {
					local2.anInt3070 += 1403713386;
					local196 = null;
					if ((local88 & 0x2) == 2) {
						local98 = local2.method22425((short) 16384);
						local196 = new int[local98];
						for (local205 = 0; local205 < local98; local205++) {
							local196[local205] = local2.method22448(-1172539681);
						}
					}
					@Pc(393) short[] local393 = null;
					if ((local88 & 0x4) == 4) {
						local393 = new short[local75];
						for (local205 = 0; local205 < local75; local205++) {
							local393[local205] = (short) local2.method22469(1144009982);
						}
					}
					@Pc(417) short[] local417 = null;
					if ((local88 & 0x8) == 8) {
						local417 = new short[local338];
						for (local427 = 0; local427 < local338; local427++) {
							local417[local427] = (short) local2.method22471(16711680);
						}
					}
					@Pc(450) long local450 = (long) ((Class132_Sub1_Sub1_Sub1_Sub1.anInt2645 += 1113118159) * -1709043409 - 1);
					new Class331(local450, local196, null, null, null, local393, local417);
				}
			}
			if ((local29 & 0x2000000) != 0) {
				local75 = local2.method22427(-1434290800);
				local79 = local2.method22550(2073256971);
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22509(710206131);
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20022(local75, local79, local92, local98, local114, 4, (byte) 12);
			}
			if ((local29 & 0x40) != 0) {
				@Pc(526) int[] local526 = new int[4];
				for (local79 = 0; local79 < 4; local79++) {
					local526[local79] = local2.method22448(-372414947);
				}
				local79 = local2.method22509(976186492);
				Class623.method32329(local21, local526, local79, true, 1077554581);
			}
			if ((local29 & 0x800000) != 0) {
				local21.anInt2647 = local2.method22471(16711680) * -1192456509;
				if (local21.anInt2647 * 1464472043 == 65535) {
					local21.anInt2647 = local21.aClass336_1.anInt4200 * 342332629;
				}
			}
			if ((local29 & 0x10) != 0) {
				if (local21.aClass336_1.method27525((short) 10492)) {
					Class665.method33076(local21, -1683778969);
				}
				local21.method18602((Class336) Class162.aClass32_Sub3_2.method18273(local2.method22448(-647151788), 36099140), (local29 & 0x10000) == 0, (local29 & 0x800000) == 0, true, (short) -13155);
				local21.method19973(local21.aClass336_1.anInt4195 * 447008399, -2142170693);
				local21.anInt2788 = (local21.aClass336_1.anInt4206 * 295553787 << 3) * 723489705;
				if (local21.aClass336_1.method27525((short) 5757)) {
					Class643.method32764(local21.aByte100, local21.anIntArray240[0], local21.anIntArray239[0], 0, null, local21, null, 694869299);
				}
			}
			if ((local29 & 0x8000) != 0) {
				local21.anInt2775 = local2.method22401(1634272420) * -1449351677;
				local21.anInt2777 = local2.method22463((byte) 108) * -2034096445;
				local21.anInt2793 = local2.method22463((byte) 97) * -688148243;
				local21.anInt2778 = local2.method22401(-88111444) * 501346955;
				local21.anInt2773 = local2.method22515(-2098689753) * -1861667641;
				local21.anInt2779 = local2.method22515(-324840679) * -1832474127;
				local21.anInt2780 = (local2.method22427(-1434290800) + client.anInt3485) * 755240883;
				local21.anInt2762 = (local2.method22469(1376132446) + client.anInt3485) * 1838812733;
				local21.anInt2782 = local2.method22469(1917824852) * 862199857;
				local21.anInt2763 = 1975362387;
				local21.anInt2760 = 0;
				local21.anInt2775 += local21.anIntArray240[0] * -1449351677;
				local21.anInt2777 += local21.anIntArray239[0] * -2034096445;
				local21.anInt2793 += local21.anIntArray240[0] * -688148243;
				local21.anInt2778 += local21.anIntArray239[0] * 501346955;
				local21.anInt2773 += local21.aByte100 * -1861667641;
				local21.anInt2779 += local21.aByte100 * -1832474127;
			}
			if ((local29 & 0x10000000) != 0) {
				local21.aByte71 = local2.method22401(-1523047973);
				local21.aByte72 = local2.method22463((byte) 93);
				local21.aByte73 = local2.method22426(2142564635);
				local21.aByte74 = (byte) local2.method22425((short) 16384);
				local21.anInt2789 = (client.anInt3485 + local2.method22427(-1434290800)) * 782633717;
				local21.anInt2796 = (client.anInt3485 + local2.method22469(1879460348)) * 1198097015;
			}
			if ((local29 & 0x20) != 0) {
				local21.anInt2772 = local2.method22471(16711680) * -1158576417;
				if (local21.anInt2772 * -583289569 == 65535) {
					local21.anInt2772 = 1158576417;
				}
			}
			if ((local29 & 0x40000) != 0) {
				local75 = local2.aByteArray58[(local2.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
				for (local79 = 0; local79 < local75; local79++) {
					local88 = local2.method22425((short) 16384);
					local92 = local2.method22520(-2097425386);
					local98 = local2.method22488((short) 255);
					local21.method18610(local88, local92, local98, (byte) -67);
				}
			}
			@Pc(1012) int local1012;
			if ((local29 & 0x8) != 0) {
				local75 = local2.method22461(961417425);
				if (local75 > 0) {
					for (local79 = 0; local79 < local75; local79++) {
						local92 = -1;
						@Pc(919) boolean local919 = true;
						local205 = -1;
						local88 = local2.method22644((byte) -13);
						if (local88 == 32767) {
							local88 = local2.method22644((byte) -79);
							local98 = local2.method22644((byte) -13);
							local92 = local2.method22644((byte) -1);
							local205 = local2.method22644((byte) -115);
						} else if (local88 == 32766) {
							local88 = -1;
							local98 = local2.method22509(1042859134);
						} else {
							local98 = local2.method22644((byte) -5);
						}
						local427 = local2.method22644((byte) -22);
						local21.method19970(local88, local98, local92, local205, client.anInt3485, local427, 1078054698);
					}
				}
				local79 = local2.method22461(2032787974);
				if (local79 > 0) {
					for (local88 = 0; local88 < local79; local88++) {
						local92 = local2.method22644((byte) -70);
						local98 = local2.method22644((byte) -81);
						if (local98 == 32767) {
							local21.method19972(local92, -1286239838);
						} else {
							local205 = local2.method22644((byte) -88);
							local427 = local2.method22511(1670788659);
							local1012 = local98 > 0 ? local2.method22425((short) 16384) : local427;
							local21.method19971(local92, client.anInt3485, local98, local205, local427, local1012, 1804055066);
						}
					}
				}
			}
			@Pc(1075) Class500 local1075;
			@Pc(1081) Class466 local1081;
			if ((local29 & 0x200000) != 0) {
				local21.anInterface3_5.method777(1028548122);
				local2.anInt3070 += 1403713386;
				local75 = local2.aByteArray58[(local2.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
				for (local79 = 0; local79 < local75; local79++) {
					local88 = local2.method22509(231523518);
					local1075 = (Class500) Class107.method18131(Class500.method30340(-1971788437), local88, -1915563430);
					local1081 = Class684.aClass79_Sub1_Sub2_7.method1464(local2, local1075, (byte) 1);
					local21.anInterface3_5.method776(local1081.anInt5253 * -1181855333, local1081.anObject19, (byte) 82);
				}
			}
			if ((local29 & 0x20000) != 0) {
				local75 = local2.method22461(1308659611);
				local190 = new int[8];
				@Pc(1108) short[] local1108 = new short[8];
				for (local92 = 0; local92 < 8; local92++) {
					if ((local75 & 0x1 << local92) == 0) {
						local190[local92] = -1;
						local1108[local92] = -1;
					} else {
						local190[local92] = local2.method22448(-2106255594);
						local1108[local92] = (short) local2.method22445((byte) -117);
					}
				}
				local21.aClass334_1 = new Class334(local190, local1108);
			}
			if ((local29 & 0x800) != 0) {
				local21.anInt2646 = local2.method22471(16711680) * 28943715;
				if (local21.anInt2646 * -1509096373 == 65535) {
					local21.anInt2646 = -28943715;
				}
			}
			if ((local29 & 0x4) != 0) {
				local21.method18611(local2.method22439(1248193645), 0, 0, -1233901070);
			}
			if ((local29 & 0x80) != 0) {
				local75 = local2.method22427(-1434290800);
				local79 = local2.method22550(490348612);
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22461(1188811960);
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20022(local75, local79, local92, local98, local114, 0, (byte) -44);
			}
			if ((local29 & 0x400) != 0) {
				local75 = 0;
				if (local21.aClass336_1.aShortArray118 != null) {
					local75 = local21.aClass336_1.aShortArray118.length;
				}
				local79 = 0;
				if (local21.aClass336_1.aShortArray120 != null) {
					local79 = local21.aClass336_1.aShortArray120.length;
				}
				local88 = local2.method22509(1139090863);
				if ((local88 & 0x1) == 1) {
					local21.aClass331_1 = null;
				} else {
					local2.anInt3070 += 1403713386;
					local196 = null;
					@Pc(1292) float[] local1292 = null;
					@Pc(1295) int[][] local1295 = null;
					@Pc(1298) int[][] local1298 = null;
					@Pc(1328) int local1328;
					@Pc(1355) int local1355;
					if ((local88 & 0x2) == 2) {
						local1012 = local2.method22509(1231939947);
						local196 = new int[local1012];
						if ((local88 & 0x10) == 16) {
							local1292 = new float[local1012];
							local1295 = new int[local1012][3];
							local1298 = new int[local1012][3];
						}
						for (local1328 = 0; local1328 < local1012; local1328++) {
							local196[local1328] = local2.method22448(-513970127);
							if ((local88 & 0x10) == 16 && local196[local1328] != -1) {
								local1292[local1328] = local2.method22437(743708755);
								for (local1355 = 0; local1355 < 3; local1355++) {
									local1295[local1328][local1355] = local2.method22472(-482934812);
								}
								for (local1355 = 0; local1355 < 3; local1355++) {
									local1298[local1328][local1355] = local2.method22494((byte) -64);
								}
							}
						}
					}
					@Pc(1387) short[] local1387 = null;
					if ((local88 & 0x4) == 4) {
						local1387 = new short[local75];
						for (local1328 = 0; local1328 < local75; local1328++) {
							local1387[local1328] = (short) local2.method22427(-1434290800);
						}
					}
					@Pc(1411) short[] local1411 = null;
					if ((local88 & 0x8) == 8) {
						local1411 = new short[local79];
						for (local1355 = 0; local1355 < local79; local1355++) {
							local1411[local1355] = (short) local2.method22427(-1434290800);
						}
					}
					@Pc(1444) long local1444 = (long) ((Class132_Sub1_Sub1_Sub1_Sub1.anInt2644 += -588889149) * -320846613 - 1);
					local21.aClass331_1 = new Class331(local1444, local196, local1292, local1295, local1298, local1387, local1411);
				}
			}
			if ((local29 & 0x10000) != 0) {
				local21.aString66 = local2.method22439(334387251);
				if ("".equals(local21.aString66) || local21.aString66.equals(local21.aClass336_1.aString184)) {
					local21.aString66 = local21.aClass336_1.aString184;
				}
			}
			if ((local29 & 0x20000000) != 0) {
				local21.aBoolean452 = local2.method22425((short) 16384) == 1;
			}
			if ((local29 & 0x8000000) != 0) {
				local75 = local2.method22427(-1434290800);
				local79 = local2.method22550(1283648522);
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22425((short) 16384);
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20022(local75, local79, local92, local98, local114, 2, (byte) -109);
			}
			if ((local29 & 0x400000) != 0) {
				local2.anInt3070 += 1403713386;
				local75 = local2.aByteArray58[(local2.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
				for (local79 = 0; local79 < local75; local79++) {
					local88 = local2.method22511(1418372123);
					local1075 = (Class500) Class107.method18131(Class500.method30340(-1993363083), local88, -1915563430);
					local1081 = Class684.aClass79_Sub1_Sub2_7.method1464(local2, local1075, (byte) 1);
					local21.anInterface3_5.method776(local1081.anInt5253 * -1181855333, local1081.anObject19, (byte) 121);
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(ILjava/lang/Object;)V")
	public Class466(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		this.anInt5253 = arg0 * 1107930259;
		this.anObject19 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(I)V")
	public Class466(@OriginalArg(0) int arg0) {
		this.anInt5253 = arg0 * 1107930259;
	}

	@OriginalMember(owner = "client!on", name = "rq", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29503(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5253 * -1181855333 == local7.anInt5253 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!on", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5253 * -1181855333 == local7.anInt5253 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!on", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29504(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5253 * -1181855333 == local7.anInt5253 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!on", name = "rp", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29505(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5253 * -1181855333 == local7.anInt5253 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!on", name = "ro", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29506(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5253 * -1181855333 == local7.anInt5253 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}
}
