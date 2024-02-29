package jagex3;

import jagex3.twitchtv.TwitchEventLiveStreams;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qz")
public final class Class522 {

	@OriginalMember(owner = "client!qz", name = "as", descriptor = "Lclient!com/jagex/twitchtv/TwitchEventLiveStreams;")
	public static TwitchEventLiveStreams aTwitchEventLiveStreams1;

	@OriginalMember(owner = "client!qz", name = "e", descriptor = "Lclient!qz;")
	public static final Class522 aClass522_7 = new Class522(0);

	@OriginalMember(owner = "client!qz", name = "n", descriptor = "Lclient!qz;")
	public static final Class522 aClass522_2 = new Class522(1);

	@OriginalMember(owner = "client!qz", name = "m", descriptor = "Lclient!qz;")
	public static final Class522 aClass522_3 = new Class522(2);

	@OriginalMember(owner = "client!qz", name = "k", descriptor = "Lclient!qz;")
	public static final Class522 aClass522_1 = new Class522(3);

	@OriginalMember(owner = "client!qz", name = "f", descriptor = "Lclient!qz;")
	public static final Class522 aClass522_5 = new Class522(4);

	@OriginalMember(owner = "client!qz", name = "w", descriptor = "Lclient!qz;")
	static final Class522 aClass522_4 = new Class522(5);

	@OriginalMember(owner = "client!qz", name = "l", descriptor = "Lclient!qz;")
	static final Class522 aClass522_6 = new Class522(6);

	@OriginalMember(owner = "client!qz", name = "u", descriptor = "Lclient!qz;")
	static final Class522 aClass522_9 = new Class522(7);

	@OriginalMember(owner = "client!qz", name = "z", descriptor = "Lclient!qz;")
	static final Class522 aClass522_8 = new Class522(8);

	@OriginalMember(owner = "client!qz", name = "p", descriptor = "I")
	public final int anInt5383;

	@OriginalMember(owner = "client!qz", name = "qt", descriptor = "(Lclient!yf;I)V")
	static void method30539(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class366.method28130(local11, local14, arg0, (byte) 63);
	}

	@OriginalMember(owner = "client!qz", name = "iu", descriptor = "(IIIIIIB)V")
	static void method30540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		@Pc(3) int local3 = Class174.anInt3293 * -1081967415;
		@Pc(5) int[] local5 = Class174.anIntArray278;
		client.anInt3464 = 0;
		@Pc(15) int local15;
		if (client.anInt3463 * 1819062465 == 0) {
			local15 = Class249.aClass239Array1.length;
		} else {
			local15 = client.anInt3540 * 568731113 + local3;
		}
		@Pc(24) int local24;
		@Pc(341) int local341;
		@Pc(350) int local350;
		@Pc(227) int local227;
		@Pc(579) int local579;
		@Pc(791) int local791;
		@Pc(597) int local597;
		@Pc(602) int local602;
		@Pc(1029) int local1029;
		@Pc(409) int local409;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(29) Class336 local29 = null;
			@Pc(45) Class132_Sub1_Sub1_Sub1 local45;
			if (client.anInt3463 * 1819062465 == 0) {
				@Pc(37) Class239 local37 = Class249.aClass239Array1[local24];
				if (!local37.aBoolean666) {
					continue;
				}
				local45 = local37.method25900(-1735621956);
				if (local45.anInt2761 * -792447673 != client.anInt3495 * 1815175593) {
					continue;
				}
				if (local37.anInt3864 * -376320861 >= 0) {
					local29 = ((Class132_Sub1_Sub1_Sub1_Sub1) local45).aClass336_1;
					if (local29.anIntArray414 != null) {
						local29 = local29.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 10080);
						if (local29 == null) {
							continue;
						}
					}
				}
			} else {
				if (local24 < local3) {
					local45 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local5[local24]];
				} else {
					local45 = (Class132_Sub1_Sub1_Sub1) ((Class93_Sub15) client.aClass16_18.method215((long) client.anIntArray323[local24 - local3])).anObject5;
					local29 = ((Class132_Sub1_Sub1_Sub1_Sub1) local45).aClass336_1;
					if (local29.anIntArray414 != null) {
						local29 = local29.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 22301);
						if (local29 == null) {
							continue;
						}
					}
				}
				if (local45.anInt2766 * 1874270623 < 0 || client.anInt3495 * 1815175593 != local45.anInt2761 * -792447673 && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local45.aByte100) {
					continue;
				}
			}
			Class119_Sub1.method8606(local45, local45.method24287(899866876), false, 256832087);
			if (!(client.aFloatArray93[0] < 0.0F)) {
				if (local45.method19982(-1556354584)) {
					@Pc(158) Class561 local158 = local45.method19983(-2035476267);
					if (local158 != null && client.anInt3464 * -1737509433 < client.anInt3558 * -359899149) {
						@Pc(171) String local171 = local158.method31319(1181407128);
						if (Class146.aClass344_3.method27618(1181342690)) {
							local171 = Class146.aClass344_3.method27617(local171, -1422298918);
						}
						client.anIntArray326[client.anInt3464 * -1737509433] = Class110_Sub3.aClass5_7.method36(local171, -979412406) / 2;
						client.anIntArray325[client.anInt3464 * -1737509433] = (int) client.aFloatArray93[0];
						client.anIntArray316[client.anInt3464 * -1737509433] = (int) client.aFloatArray93[1];
						client.aClass561Array1[client.anInt3464 * -1737509433] = local158;
						client.anInt3464 += -1122534409;
					}
				}
				local227 = (int) ((float) arg1 + client.aFloatArray93[1]);
				local227 -= Class110_Sub3.aClass5_7.anInt6 * -8978697;
				@Pc(236) boolean local236 = false;
				@Pc(263) Class596 local263;
				@Pc(297) Class100 local297;
				@Pc(487) int local487;
				if (!local45.aBoolean454 && !local45.aClass21_5.method384((byte) 27)) {
					for (@Pc(250) Class149_Sub3 local250 = (Class149_Sub3) local45.aClass21_5.method390((short) 11585); local250 != null; local250 = (Class149_Sub3) local45.aClass21_5.method377(-1915563430)) {
						@Pc(257) Class149_Sub1 local257 = local250.method12313(client.anInt3485, 1237932396);
						if (local257 != null) {
							local263 = local250.aClass596_1;
							@Pc(269) Class132_Sub1_Sub1_Sub1_Sub2 local269 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local5[local24]];
							@Pc(288) Class100 local288;
							if (local269 == null || local269.aClass286_1 == Class286.aClass286_5) {
								local288 = local263.method31932(Class694.aClass104_14, local263.anInt5648 * 816546509, (byte) 1);
								local297 = local263.method31932(Class694.aClass104_14, local263.anInt5650 * -1393086115, (byte) 1);
							} else if (Class286.aClass286_3 == local269.aClass286_1) {
								local288 = local263.method31932(Class694.aClass104_14, local263.anInt5658 * 168300879, (byte) 1);
								local297 = local263.method31932(Class694.aClass104_14, local263.anInt5657 * 857036441, (byte) 1);
							} else {
								local288 = local263.method31932(Class694.aClass104_14, local263.anInt5654 * -1920415725, (byte) 1);
								local297 = local263.method31932(Class694.aClass104_14, local263.anInt5655 * -128291419, (byte) 1);
							}
							if (local288 != null && local297 != null) {
								local341 = 255;
								@Pc(343) boolean local343 = true;
								local350 = client.anInt3485 - local257.anInt1399 * 356694381;
								@Pc(360) int local360 = local297.method18201() * -1029319555 * local257.anInt1398 / 255;
								@Pc(386) int local386;
								@Pc(396) int local396;
								if (local257.anInt1397 * -840385723 > local350) {
									local386 = local263.anInt5653 * 1973880315 == 0 ? 0 : local350 / (local263.anInt5653 * 1973880315) * 1973880315 * local263.anInt5653;
									local396 = local297.method18201() * local257.anInt1396 * -293106335 / 255;
									local409 = local396 + (local360 - local396) * local386 / (local257.anInt1397 * -840385723);
								} else {
									local409 = local360;
									local386 = local263.anInt5659 * -926072261 + local257.anInt1397 * -840385723 - local350;
									if (local263.anInt5652 * -802997671 >= 0) {
										local341 = (local386 << 8) / (local263.anInt5659 * -926072261 - local263.anInt5652 * -802997671);
									}
								}
								if (local257.anInt1398 * -1029319555 > 0 && local409 < 2) {
									local409 = 2;
								}
								local386 = local288.method18177();
								local396 = (int) ((float) arg0 + client.aFloatArray93[0] - (float) (local288.method18201() >> 1));
								local227 -= local386;
								if (local341 >= 0 && local341 < 255) {
									@Pc(483) int local483 = local341 << 24;
									local487 = local483 | 0xFFFFFF;
									local288.method18185(local396, local227, 0, local487, 1);
									Class694.aClass104_14.method20472(local396, local227, local396 + local409, local227 + local386);
									local297.method18185(local396, local227, 0, local487, 1);
								} else {
									local288.method18181(local396, local227);
									Class694.aClass104_14.method20472(local396, local227, local396 + local409, local386 + local227);
									local297.method18181(local396, local227);
								}
								Class694.aClass104_14.method20479(arg0, arg1, arg2 + arg0, arg1 + arg3);
								local227 -= 2;
								local236 = true;
							}
						} else if (local250.method12317(-1561069686)) {
							local250.method23778(-719770481);
						}
					}
				}
				if (!local236) {
					local227 -= Class93_Sub26.aClass645_15.anInt5926 * 567450467 + 2;
				}
				if (!local45.aBoolean454) {
					@Pc(609) long local609;
					@Pc(622) Class105[] local622;
					if (local29 == null) {
						@Pc(577) Class132_Sub1_Sub1_Sub1_Sub2 local577 = (Class132_Sub1_Sub1_Sub1_Sub2) local45;
						for (local579 = 0; local579 < local577.anIntArray242.length; local579++) {
							if (local577.anIntArray242[local579] >= 0) {
								local263 = null;
								local597 = local577.anIntArray242[local579];
								local602 = local577.anIntArray243[local579];
								local609 = local602 << 8 | local597;
								@Pc(614) Class100 local614 = (Class100) client.aClass240_69.method25932(local609);
								if (local614 == null) {
									local622 = Class203.method24663(Class110_Sub7.aClass497_22, local602, 0);
									if (local622 == null) {
										continue;
									}
									local614 = Class694.aClass104_14.method20511(local622[local597], true);
									client.aClass240_69.method25923(local614, local609);
								}
								if (local614 != null) {
									local227 -= local614.method18177();
									local614.method18181((int) (client.aFloatArray93[0] + (float) arg0 - 12.0F), local227);
									local227 -= 2;
								}
							}
						}
					} else {
						@Pc(665) Class132_Sub1_Sub1_Sub1_Sub1 local665 = (Class132_Sub1_Sub1_Sub1_Sub1) local45;
						@Pc(676) int[] local676 = local665.aClass334_1 == null ? local665.aClass336_1.anIntArray415 : local665.aClass334_1.anIntArray411;
						@Pc(688) short[] local688 = local665.aClass334_1 == null ? local665.aClass336_1.aShortArray121 : local665.aClass334_1.aShortArray115;
						if (local688 != null && local676 != null) {
							for (local597 = 0; local597 < local688.length; local597++) {
								if (local688[local597] >= 0 && local676[local597] >= 0) {
									local297 = null;
									local609 = local676[local597] << 8 | local688[local597];
									local297 = (Class100) client.aClass240_69.method25932(local609);
									if (local297 == null) {
										local622 = Class203.method24663(Class110_Sub7.aClass497_22, local676[local597], 0);
										if (local622 == null) {
											continue;
										}
										local297 = Class694.aClass104_14.method20511(local622[local688[local597]], true);
										client.aClass240_69.method25923(local297, local609);
									}
									if (local297 != null) {
										local227 -= local297.method18177();
										local297.method18181((int) ((float) arg0 + client.aFloatArray93[0] - (float) (local297.method18201() >> 1)), local227);
										local227 -= 2;
									}
								}
							}
						}
					}
				}
				@Pc(853) int local853;
				@Pc(787) int local787;
				@Pc(789) Class173[] local789;
				@Pc(799) Class173 local799;
				if (!(local45 instanceof Class132_Sub1_Sub1_Sub1_Sub2)) {
					local787 = 0;
					local789 = client.aClass173Array1;
					for (local791 = 0; local791 < local789.length; local791++) {
						local799 = local789[local791];
						if (local799 != null && local799.anInt3247 * 1661685955 == 1 && client.anIntArray323[local24 - local3] == local799.anInt3246 * -1095042687) {
							local297 = Class707.aClass100Array9[local799.anInt3253 * -2053428357];
							if (local297.method18177() > local787) {
								local787 = local297.method18177();
							}
							@Pc(908) boolean local908;
							if (local799.anInt3245 * -459319451 == 0) {
								local908 = true;
							} else {
								local341 = Class451.method29129((byte) 3) * 1000 / (local799.anInt3245 * -459319451) / 2;
								local908 = client.anInt3485 % (local341 * 2) < local341;
							}
							if (local908) {
								local297.method18181((int) ((float) arg0 + client.aFloatArray93[0] - 12.0F), local227 - local297.method18177());
							}
						}
					}
					if (local787 > 0) {
						local853 = local227 - (local787 + 2);
					}
				} else if (local24 >= 0) {
					local787 = 0;
					local789 = client.aClass173Array1;
					for (local791 = 0; local791 < local789.length; local791++) {
						local799 = local789[local791];
						if (local799 != null && local799.anInt3247 * 1661685955 == 10 && local5[local24] == local799.anInt3246 * -1095042687) {
							local297 = Class707.aClass100Array9[local799.anInt3253 * -2053428357];
							if (local297.method18177() > local787) {
								local787 = local297.method18177();
							}
							local297.method18181((int) ((float) arg0 + client.aFloatArray93[0] - 12.0F), local227 - local297.method18177());
						}
					}
					if (local787 > 0) {
						local853 = local227 - (local787 + 2);
					}
				}
				for (local787 = 0; local787 < Class93_Sub26.aClass645_15.anInt5952 * 124516327; local787++) {
					local579 = local45.anIntArray235[local787];
					local791 = local45.anIntArray232[local787];
					@Pc(979) Class608 local979 = null;
					local602 = 0;
					if (local791 >= 0) {
						if (local579 <= client.anInt3485) {
							continue;
						}
						local979 = (Class608) Class366.aClass32_Sub8_1.method18273(local45.anIntArray232[local787], -415496325);
						local602 = local979.anInt5731 * 2130827517;
						if (local979 != null && local979.anIntArray489 != null) {
							local979 = local979.method32119(Class624.aClass120_1, Class624.aClass120_1, 1711353062);
							if (local979 == null) {
								local45.anIntArray235[local787] = -1;
								continue;
							}
						}
					} else if (local579 < 0) {
						continue;
					}
					local1029 = local45.anIntArray241[local787];
					@Pc(1031) Class608 local1031 = null;
					if (local1029 >= 0) {
						local1031 = (Class608) Class366.aClass32_Sub8_1.method18273(local1029, 926777418);
						if (local1031 != null && local1031.anIntArray489 != null) {
							local1031 = local1031.method32119(Class624.aClass120_1, Class624.aClass120_1, 1874145105);
						}
					}
					if (local579 - local602 <= client.anInt3485) {
						if (local979 == null) {
							local45.anIntArray235[local787] = -1;
						} else {
							local409 = local45.method24287(899866876) / 2;
							Class119_Sub1.method8606(local45, local409, false, 256832087);
							if (client.aFloatArray93[0] > -1.0F) {
								client.aFloatArray93[0] += Class93_Sub26.aClass645_15.anIntArray504[local787];
								client.aFloatArray93[1] += Class93_Sub26.aClass645_15.anIntArray505[local787];
								@Pc(1107) Object local1107 = null;
								@Pc(1109) Class100 local1109 = null;
								@Pc(1111) Class100 local1111 = null;
								@Pc(1113) Class100 local1113 = null;
								local487 = 0;
								@Pc(1117) int local1117 = 0;
								@Pc(1119) int local1119 = 0;
								@Pc(1121) int local1121 = 0;
								@Pc(1123) int local1123 = 0;
								@Pc(1125) int local1125 = 0;
								@Pc(1127) int local1127 = 0;
								@Pc(1129) int local1129 = 0;
								@Pc(1131) Class100 local1131 = null;
								@Pc(1133) Class100 local1133 = null;
								@Pc(1135) Class100 local1135 = null;
								@Pc(1137) Class100 local1137 = null;
								@Pc(1139) int local1139 = 0;
								@Pc(1141) int local1141 = 0;
								@Pc(1143) int local1143 = 0;
								@Pc(1145) int local1145 = 0;
								@Pc(1147) int local1147 = 0;
								@Pc(1149) int local1149 = 0;
								@Pc(1151) int local1151 = 0;
								@Pc(1153) int local1153 = 0;
								@Pc(1158) Class100 local1158 = local979.method32126(Class694.aClass104_14, 497855645);
								if (local1158 != null) {
									local487 = local1158.method18201();
									local1158.method18175(client.anIntArray332);
									local1123 = client.anIntArray332[0];
								}
								local1109 = local979.method32121(Class694.aClass104_14, -361285556);
								if (local1109 != null) {
									local1117 = local1109.method18201();
									local1109.method18175(client.anIntArray332);
									local1125 = client.anIntArray332[0];
								}
								local1111 = local979.method32122(Class694.aClass104_14, -1933985931);
								if (local1111 != null) {
									local1119 = local1111.method18201();
									local1111.method18175(client.anIntArray332);
									local1127 = client.anIntArray332[0];
								}
								local1113 = local979.method32123(Class694.aClass104_14, (byte) 9);
								if (local1113 != null) {
									local1121 = local1113.method18201();
									local1113.method18175(client.anIntArray332);
									local1129 = client.anIntArray332[0];
								}
								if (local1031 != null) {
									local1131 = local1031.method32126(Class694.aClass104_14, -1540237612);
									if (local1131 != null) {
										local1139 = local1131.method18201();
										local1131.method18175(client.anIntArray332);
										local1147 = client.anIntArray332[0];
									}
									local1133 = local1031.method32121(Class694.aClass104_14, -713038010);
									if (local1133 != null) {
										local1141 = local1133.method18201();
										local1133.method18175(client.anIntArray332);
										local1149 = client.anIntArray332[0];
									}
									local1135 = local1031.method32122(Class694.aClass104_14, -121288345);
									if (local1135 != null) {
										local1143 = local1135.method18201();
										local1135.method18175(client.anIntArray332);
										local1151 = client.anIntArray332[0];
									}
									local1137 = local1031.method32123(Class694.aClass104_14, (byte) 9);
									if (local1137 != null) {
										local1145 = local1137.method18201();
										local1137.method18175(client.anIntArray332);
										local1153 = client.anIntArray332[0];
									}
								}
								@Pc(1297) Class106 local1297 = Class707.aClass106_13;
								@Pc(1299) Class106 local1299 = Class707.aClass106_13;
								@Pc(1301) Class5 local1301 = Class584.aClass5_15;
								@Pc(1303) Class5 local1303 = Class584.aClass5_15;
								@Pc(1308) int local1308 = local979.anInt5740 * 1520530569;
								@Pc(1320) Class106 local1320;
								@Pc(1326) Class5 local1326;
								if (local1308 >= 0) {
									local1320 = (Class106) Class157.aClass462_2.method29445(client.anInterface50_1, local1308, true, local979.aBoolean836, 2124283828);
									local1326 = Class157.aClass462_2.method29422(client.anInterface50_1, local1308, -400764309);
									if (local1320 != null && local1326 != null) {
										local1297 = local1320;
										local1301 = local1326;
									}
								}
								if (local1031 != null) {
									local1308 = local1031.anInt5740 * 1520530569;
									if (local1308 >= 0) {
										local1320 = (Class106) Class157.aClass462_2.method29445(client.anInterface50_1, local1308, true, local1031.aBoolean836, -688283145);
										local1326 = Class157.aClass462_2.method29422(client.anInterface50_1, local1308, -1750887372);
										if (local1320 != null && local1326 != null) {
											local1299 = local1320;
											local1303 = local1326;
										}
									}
								}
								local1320 = null;
								@Pc(1373) String local1373 = null;
								@Pc(1375) boolean local1375 = false;
								@Pc(1377) int local1377 = 0;
								@Pc(1385) String local1385 = local979.method32120(local45.anIntArray233[local787], -1702976900);
								@Pc(1390) int local1390 = local1301.method36(local1385, -462224048);
								if (local1031 != null) {
									local1373 = local1031.method32120(local45.anIntArray238[local787], -1796516341);
									local1377 = local1303.method36(local1373, -799150869);
								}
								@Pc(1407) int local1407 = 0;
								@Pc(1409) int local1409 = 0;
								if (local1117 > 0) {
									local1407 = local1390 / local1117 + 1;
								}
								if (local1031 != null && local1141 > 0) {
									local1409 = local1377 / local1141 + 1;
								}
								@Pc(1429) int local1429 = 0;
								@Pc(1431) int local1431 = local1429;
								if (local487 > 0) {
									local1429 += local487;
								}
								local1429 += 2;
								@Pc(1440) int local1440 = local1429;
								if (local1119 > 0) {
									local1429 += local1119;
								}
								@Pc(1448) int local1448 = local1429;
								@Pc(1450) int local1450 = local1429;
								@Pc(1456) int local1456;
								if (local1117 > 0) {
									local1456 = local1407 * local1117;
									local1429 += local1456;
									local1450 += (local1456 - local1390) / 2;
								} else {
									local1429 += local1390;
								}
								local1456 = local1429;
								if (local1121 > 0) {
									local1429 += local1121;
								}
								@Pc(1483) int local1483 = 0;
								@Pc(1485) int local1485 = 0;
								@Pc(1487) int local1487 = 0;
								@Pc(1489) int local1489 = 0;
								@Pc(1491) int local1491 = 0;
								@Pc(1521) int local1521;
								if (local1031 != null) {
									local1429 += 2;
									local1483 = local1429;
									if (local1139 > 0) {
										local1429 += local1139;
									}
									local1429 += 2;
									local1485 = local1429;
									if (local1143 > 0) {
										local1429 += local1143;
									}
									local1487 = local1429;
									local1491 = local1429;
									if (local1141 > 0) {
										local1521 = local1409 * local1141;
										local1429 += local1521;
										local1491 += (local1521 - local1377) / 2;
									} else {
										local1429 += local1377;
									}
									local1489 = local1429;
									if (local1145 > 0) {
										local1429 += local1145;
									}
								}
								local1521 = local45.anIntArray235[local787] - client.anInt3485;
								@Pc(1570) int local1570 = local979.anInt5735 * -1514324927 - local1521 * local979.anInt5735 * -1514324927 / (local979.anInt5731 * 2130827517);
								@Pc(1588) int local1588 = local979.anInt5737 * -1386606149 * local1521 / (local979.anInt5731 * 2130827517) + -(local979.anInt5737 * -1386606149);
								@Pc(1604) int local1604 = (int) ((float) local1570 + ((float) arg0 + client.aFloatArray93[0] - (float) (local1429 >> 1)));
								@Pc(1617) int local1617 = (int) ((float) local1588 + (client.aFloatArray93[1] + (float) arg1 - 12.0F));
								@Pc(1626) int local1626 = local1617 + 15 + local979.anInt5724 * 1883898489;
								@Pc(1628) int local1628 = 0;
								if (local1031 != null) {
									local1628 = local1031.anInt5724 * 1883898489 + local1617 + 15;
								}
								@Pc(1642) int local1642 = 255;
								if (local979.anInt5736 * -1011243013 >= 0) {
									local1642 = (local1521 << 8) / (local979.anInt5731 * 2130827517 - local979.anInt5736 * -1011243013);
								}
								@Pc(1670) int local1670;
								if (local1642 >= 0 && local1642 < 255) {
									local1670 = local1642 << 24;
									@Pc(1674) int local1674 = local1670 | 0xFFFFFF;
									if (local1158 != null) {
										local1158.method18185(local1431 + local1604 - local1123, local1617, 0, local1674, 1);
									}
									if (local1111 != null) {
										local1111.method18185(local979.anInt5738 * 860345421 + (local1440 + local1604 - local1127), local979.anInt5723 * 1143246755 + local1617, 0, local1674, 1);
									}
									@Pc(1717) int local1717;
									if (local1109 != null) {
										for (local1717 = 0; local1717 < local1407; local1717++) {
											local1109.method18185(local1604 + local1448 - local1125 + local1717 * local1117 + local979.anInt5738 * 860345421, local1617 + local979.anInt5723 * 1143246755, 0, local1674, 1);
										}
									}
									if (local1113 != null) {
										local1113.method18185(local979.anInt5738 * 860345421 + (local1456 + local1604 - local1129), local1617 + local979.anInt5723 * 1143246755, 0, local1674, 1);
									}
									local1297.method7524(local1385, local1604 + local1450, local1626, local979.anInt5730 * -25820427 | local1670, 0, (byte) 0);
									if (local1031 != null) {
										if (local1131 != null) {
											local1131.method18185(local1483 + local1604 - local1147, local1617, 0, local1674, 1);
										}
										if (local1135 != null) {
											local1135.method18185(local1485 + local1604 - local1151 + local1031.anInt5738 * 860345421, local1617 + local1031.anInt5723 * 1143246755, 0, local1674, 1);
										}
										if (local1133 != null) {
											for (local1717 = 0; local1717 < local1409; local1717++) {
												local1133.method18185(local1031.anInt5738 * 860345421 + local1717 * local1141 + (local1487 + local1604 - local1149), local1617 + local1031.anInt5723 * 1143246755, 0, local1674, 1);
											}
										}
										if (local1137 != null) {
											local1137.method18185(local1489 + local1604 - local1153 + local1031.anInt5738 * 860345421, local1031.anInt5723 * 1143246755 + local1617, 0, local1674, 1);
										}
										local1299.method7524(local1373, local1491 + local1604, local1628, local1031.anInt5730 * -25820427 | local1670, 0, (byte) 0);
									}
								} else {
									if (local1158 != null) {
										local1158.method18181(local1431 + local1604 - local1123, local1617);
									}
									if (local1111 != null) {
										local1111.method18181(local979.anInt5738 * 860345421 + (local1440 + local1604 - local1127), local979.anInt5723 * 1143246755 + local1617);
									}
									if (local1109 != null) {
										for (local1670 = 0; local1670 < local1407; local1670++) {
											local1109.method18181(local1117 * local1670 + (local1448 + local1604 - local1125) + local979.anInt5738 * 860345421, local979.anInt5723 * 1143246755 + local1617);
										}
									}
									if (local1113 != null) {
										local1113.method18181(local1604 + local1456 - local1129 + local979.anInt5738 * 860345421, local979.anInt5723 * 1143246755 + local1617);
									}
									local1297.method7524(local1385, local1604 + local1450, local1626, local979.anInt5730 * -25820427 | 0xFF000000, 0, (byte) 0);
									if (local1031 != null) {
										if (local1131 != null) {
											local1131.method18181(local1483 + local1604 - local1147, local1617);
										}
										if (local1135 != null) {
											local1135.method18181(local1485 + local1604 - local1151 + local1031.anInt5738 * 860345421, local1617 + local1031.anInt5723 * 1143246755);
										}
										if (local1133 != null) {
											for (local1670 = 0; local1670 < local1409; local1670++) {
												local1133.method18181(local1670 * local1141 + (local1604 + local1487 - local1149) + local1031.anInt5738 * 860345421, local1031.anInt5723 * 1143246755 + local1617);
											}
										}
										if (local1137 != null) {
											local1137.method18181(local1489 + local1604 - local1153 + local1031.anInt5738 * 860345421, local1617 + local1031.anInt5723 * 1143246755);
										}
										local1299.method7524(local1373, local1491 + local1604, local1628, local1031.anInt5730 * -25820427 | 0xFF000000, 0, (byte) 0);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(2113) int local2113;
		for (local24 = 0; local24 < client.anInt3496 * -2074465939; local24++) {
			local2113 = client.anIntArray310[local24];
			@Pc(2120) Class132_Sub1_Sub1_Sub1 local2120;
			if (local2113 < 2048) {
				local2120 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local2113];
			} else {
				local2120 = (Class132_Sub1_Sub1_Sub1) ((Class93_Sub15) client.aClass16_18.method215((long) (local2113 - 2048))).anObject5;
			}
			local227 = client.anIntArray311[local24];
			@Pc(2142) Class132_Sub1_Sub1_Sub1 local2142;
			if (local227 < 2048) {
				local2142 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local227];
			} else {
				local2142 = (Class132_Sub1_Sub1_Sub1) ((Class93_Sub15) client.aClass16_18.method215((long) (local227 - 2048))).anObject5;
			}
			Class487.method29999(local2120, local2142, (local2120.anInt2764 -= 1428902295) * -1996734937, arg0, arg1, arg2, arg3, arg4, arg5, (byte) 15);
		}
		local24 = Class110_Sub3.aClass5_7.anInt6 * -8978697 + Class110_Sub3.aClass5_7.anInt10 * -1093354073 + 2;
		for (local2113 = 0; local2113 < client.anInt3464 * -1737509433; local2113++) {
			@Pc(2197) int local2197 = client.anIntArray325[local2113];
			local227 = client.anIntArray316[local2113];
			@Pc(2205) int local2205 = client.anIntArray326[local2113];
			@Pc(2207) boolean local2207 = true;
			while (local2207) {
				local2207 = false;
				for (local579 = 0; local579 < local2113; local579++) {
					if (local227 + 2 > client.anIntArray316[local579] - local24 && local227 - local24 < client.anIntArray316[local579] + 2 && local2197 - local2205 < client.anIntArray325[local579] + client.anIntArray326[local579] && local2197 + local2205 > client.anIntArray325[local579] - client.anIntArray326[local579] && client.anIntArray316[local579] - local24 < local227) {
						local227 = client.anIntArray316[local579] - local24;
						local2207 = true;
					}
				}
			}
			client.anIntArray316[local2113] = local227;
			@Pc(2284) String local2284 = client.aClass561Array1[local2113].method31319(1465611768);
			if (Class146.aClass344_3.method27618(1564065214)) {
				local2284 = Class146.aClass344_3.method27617(local2284, -1422298918);
			}
			if (client.anInt3527 * -422098273 == 0) {
				local791 = 16776960;
				local597 = client.aClass561Array1[local2113].method31322((byte) 45);
				if (local597 < 6) {
					local791 = client.anIntArray315[local597];
				}
				if (local597 == 6) {
					local791 = client.anInt3495 * 1815175593 % 20 < 10 ? 16711680 : 16776960;
				}
				if (local597 == 7) {
					local791 = client.anInt3495 * 1815175593 % 20 < 10 ? 255 : 65535;
				}
				if (local597 == 8) {
					local791 = client.anInt3495 * 1815175593 % 20 < 10 ? 45056 : 8454016;
				}
				if (local597 == 9) {
					local602 = 150 - client.aClass561Array1[local2113].method31323(-1362005860) * 150 / client.aClass561Array1[local2113].method31318((byte) -4);
					if (local602 < 50) {
						local791 = local602 * 1280 + 16711680;
					} else if (local602 < 100) {
						local791 = 16776960 - (local602 - 50) * 327680;
					} else if (local602 < 150) {
						local791 = (local602 - 100) * 5 + 65280;
					}
				}
				if (local597 == 10) {
					local602 = 150 - client.aClass561Array1[local2113].method31323(-1725833249) * 150 / client.aClass561Array1[local2113].method31318((byte) -86);
					if (local602 < 50) {
						local791 = local602 * 5 + 16711680;
					} else if (local602 < 100) {
						local791 = 16711935 - (local602 - 50) * 327680;
					} else if (local602 < 150) {
						local791 = (local602 - 100) * 327680 + 255 - (local602 - 100) * 5;
					}
				}
				if (local597 == 11) {
					local602 = 150 - client.aClass561Array1[local2113].method31323(-262713425) * 150 / client.aClass561Array1[local2113].method31318((byte) -10);
					if (local602 < 50) {
						local791 = 16777215 - local602 * 327685;
					} else if (local602 < 100) {
						local791 = (local602 - 50) * 327685 + 65280;
					} else if (local602 < 150) {
						local791 = 16777215 - (local602 - 100) * 327680;
					}
				}
				local602 = local791 | 0xFF000000;
				local1029 = client.aClass561Array1[local2113].method31321((byte) 0);
				if (local1029 == 0) {
					Class118_Sub1.aClass106_3.method7526(local2284, local2197 + arg0, arg1 + local227, local602, -16777216, 1357185837);
				}
				if (local1029 == 1) {
					Class118_Sub1.aClass106_3.method7553(local2284, local2197 + arg0, arg1 + local227, local602, -16777216, client.anInt3495 * 1815175593, 713616096);
				}
				if (local1029 == 2) {
					Class118_Sub1.aClass106_3.method7530(local2284, arg0 + local2197, arg1 + local227, local602, -16777216, client.anInt3495 * 1815175593, (byte) -24);
				}
				if (local1029 == 3) {
					local341 = 150 - client.aClass561Array1[local2113].method31323(-301952503) * 150 / client.aClass561Array1[local2113].method31318((byte) -21);
					Class118_Sub1.aClass106_3.method7573(local2284, local2197 + arg0, arg1 + local227, local602, -16777216, client.anInt3495 * 1815175593, local341, 1931583157);
				}
				if (local1029 == 4) {
					local341 = 150 - client.aClass561Array1[local2113].method31323(289894391) * 150 / client.aClass561Array1[local2113].method31318((byte) 84);
					local409 = local341 * (Class110_Sub3.aClass5_7.method36(local2284, -1037789256) + 100) / 150;
					Class694.aClass104_14.method20472(arg0 + local2197 - 50, arg1, arg0 + 50 + local2197, arg3 + arg1);
					Class118_Sub1.aClass106_3.method7524(local2284, local2197 + arg0 + 50 - local409, arg1 + local227, local602, -16777216, (byte) 0);
					Class694.aClass104_14.method20479(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
				if (local1029 == 5) {
					local341 = 150 - client.aClass561Array1[local2113].method31323(-2067697804) * 150 / client.aClass561Array1[local2113].method31318((byte) -24);
					local409 = 0;
					if (local341 < 25) {
						local409 = local341 - 25;
					} else if (local341 > 125) {
						local409 = local341 - 125;
					}
					local350 = Class110_Sub3.aClass5_7.anInt6 * -8978697 + Class110_Sub3.aClass5_7.anInt10 * -1093354073;
					Class694.aClass104_14.method20472(arg0, local227 + arg1 - local350 - 1, arg0 + arg2, arg1 + local227 + 5);
					Class118_Sub1.aClass106_3.method7526(local2284, local2197 + arg0, local227 + arg1 + local409, local602, -16777216, 1357185837);
					Class694.aClass104_14.method20479(arg0, arg1, arg0 + arg2, arg3 + arg1);
				}
			} else {
				Class118_Sub1.aClass106_3.method7526(local2284, local2197 + arg0, arg1 + local227, -256, -16777216, 1357185837);
			}
		}
	}

	@OriginalMember(owner = "client!qz", name = "hy", descriptor = "(Lclient!yf;B)V")
	static void method30541(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class585.method31794(local11, local14, arg0, 1588985212);
	}

	@OriginalMember(owner = "client!qz", name = "<init>", descriptor = "(I)V")
	Class522(@OriginalArg(0) int arg0) {
		this.anInt5383 = arg0 * -2058798033;
	}
}
