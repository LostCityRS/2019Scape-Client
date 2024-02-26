package com.jagex;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
final class Class579 implements Comparator {

	// $FF: synthetic field
	@OriginalMember(owner = "client!tq", name = "this$0", descriptor = "Lclient!aie;")
	final Class138_Sub1 aClass138_Sub1_4;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "(Lclient!di;III)V")
	static void method31804(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0 || arg2 < 0 || Class630.aClass487_99 == null) {
			return;
		}
		@Pc(11) Class626 local11 = client.aClass539_1.method30893((byte) -36);
		@Pc(14) Class487 local14 = arg0.method20750();
		Class165_Sub37.method16684(arg0, 1108924127);
		local14.method30080(Class630.aClass471_54);
		local14.method30078(Class630.aClass487_99);
		local14.method30082();
		@Pc(31) int local31 = arg1 - Class630.anInt5560 * -1460567703;
		@Pc(37) int local37 = arg2 - Class630.anInt5562 * 73602969;
		if (client.aClass539_1.method30932(-1638462787) == null) {
			return;
		}
		@Pc(54) int local54;
		@Pc(167) int local167;
		@Pc(174) int local174;
		@Pc(222) int local222;
		if (!client.aBoolean728 || (Class542.anInt5121 * -1641097909 & 0x40) != 0) {
			@Pc(52) int local52 = -1;
			local54 = -1;
			@Pc(66) float local66 = (float) local31 * 2.0F / (float) (Class630.anInt5545 * -1228226275) - 1.0F;
			@Pc(78) float local78 = (float) local37 * 2.0F / (float) (Class630.anInt5561 * -1036781733) - 1.0F;
			local14.method30085(local66, local78, -1.0F, Class630.aFloatArray119);
			@Pc(92) float local92 = Class630.aFloatArray119[0] / Class630.aFloatArray119[3];
			@Pc(100) float local100 = Class630.aFloatArray119[1] / Class630.aFloatArray119[3];
			@Pc(108) float local108 = Class630.aFloatArray119[2] / Class630.aFloatArray119[3];
			local14.method30085(local66, local78, 1.0F, Class630.aFloatArray119);
			@Pc(122) float local122 = Class630.aFloatArray119[0] / Class630.aFloatArray119[3];
			@Pc(130) float local130 = Class630.aFloatArray119[1] / Class630.aFloatArray119[3];
			@Pc(138) float local138 = Class630.aFloatArray119[2] / Class630.aFloatArray119[3];
			@Pc(148) float local148 = Class584.method31845(local92, local100, local108, local122, local130, local138, 4, 92652551);
			if (local148 > 0.0F) {
				@Pc(156) float local156 = local122 - local92;
				@Pc(160) float local160 = local138 - local108;
				local167 = (int) (local92 + local148 * local156);
				local174 = (int) (local108 + local148 * local160);
				local52 = local167 + (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -35) - 1 << 8) >> 9;
				local54 = local174 + (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -63) - 1 << 8) >> 9;
				@Pc(201) byte local201 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99;
				if (local201 < 3 && (client.aClass539_1.method30903(-463929735).aByteArrayArrayArray12[1][local167 >> 9][local174 >> 9] & 0x2) != 0) {
					local222 = local201 + 1;
				}
			}
			if (local52 != -1 && local54 != -1) {
				if (client.aBoolean728 && (Class542.anInt5121 * -1641097909 & 0x40) != 0) {
					@Pc(245) Class327 local245 = Class369.method28340(Class86.anInt284 * 531357219, client.anInt3526 * 1831183447, 1667744935);
					if (local245 == null) {
						Class450.method29279((byte) 71);
					} else {
						Class360.method28144(client.aString149, " " + Class256.aString158 + " ", Class107_Sub1.anInt682 * 582850143, 59, -1, 0L, local52, local54, true, false, (long) (local52 << 0 | local54), true, (byte) 69);
					}
				} else {
					if (Class630.aBoolean958) {
						Class360.method28144(Class60.aClass60_133.method1180(Class512.aClass719_3, -1599415476), "", -1, 60, -1, 0L, local52, local54, true, false, (long) (local52 << 0 | local54), true, (byte) 26);
					}
					Class360.method28144(Class499.aString215, "", client.anInt3518 * 1172850779, 23, -1, 0L, local52, local54, true, false, (long) (local52 << 0 | local54), true, (byte) 74);
				}
			}
		}
		@Pc(332) Class582 local332 = client.aClass539_1.method30932(-1638462787).aClass582_1;
		local54 = arg1;
		@Pc(336) int local336 = arg2;
		@Pc(339) List local339 = local332.aList24;
		@Pc(342) Iterator local342 = local339.iterator();
		while (true) {
			@Pc(379) int local379;
			@Pc(384) int local384;
			@Pc(1365) Interface60 local1365;
			@Pc(1375) Class625 local1375;
			@Pc(467) int local467;
			@Pc(1485) String[] local1485;
			do {
				@Pc(349) Class573 local349;
				do {
					do {
						do {
							@Pc(544) int var26;
							@Pc(660) int var27;
							@Pc(414) int var40;
							@Pc(876) int var65;
							while (true) {
								@Pc(516) Class463 var24;
								@Pc(530) int var25;
								@Pc(479) int var52;
								while (true) {
									do {
										do {
											if (!local342.hasNext()) {
												return;
											}
											local349 = (Class573) local342.next();
										} while (!client.aBoolean740 && local349.aClass120_Sub1_25.aByte99 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99);
									} while (!local349.method31741(arg0, local54, local336, (byte) 19));
									@Pc(368) boolean local368 = false;
									@Pc(370) boolean local370 = false;
									if (local349.aClass120_Sub1_25 instanceof Class120_Sub1_Sub1) {
										local379 = ((Class120_Sub1_Sub1) local349.aClass120_Sub1_25).aShort129;
										local384 = ((Class120_Sub1_Sub1) local349.aClass120_Sub1_25).aShort127;
									} else {
										@Pc(390) Class463 local390 = local349.aClass120_Sub1_25.method24552().aClass463_61;
										local379 = (int) local390.aFloat297 >> 9;
										local384 = (int) local390.aFloat296 >> 9;
									}
									if (!(local349.aClass120_Sub1_25 instanceof Class120_Sub1_Sub1_Sub1_Sub2)) {
										break;
									}
									@Pc(410) Class120_Sub1_Sub1_Sub1_Sub2 local410 = (Class120_Sub1_Sub1_Sub1_Sub2) local349.aClass120_Sub1_25;
									var40 = local410.method18966((byte) -116);
									@Pc(418) Class463 local418 = local410.method24552().aClass463_61;
									if ((var40 & 0x1) == 0 && ((int) local418.aFloat297 & 0x1FF) == 0 && ((int) local418.aFloat296 & 0x1FF) == 0 || (var40 & 0x1) == 1 && ((int) local418.aFloat297 & 0x1FF) == 256 && ((int) local418.aFloat296 & 0x1FF) == 256) {
										local467 = (int) local418.aFloat297 - (local410.method18966((byte) -1) - 1 << 8);
										var52 = (int) local418.aFloat296 - (local410.method18966((byte) -74) - 1 << 8);
										for (local167 = 0; local167 < client.anInt3453 * -1702559601; local167++) {
											@Pc(494) Class80_Sub19 local494 = (Class80_Sub19) client.aClass24_18.method560((long) client.anIntArray304[local167]);
											if (local494 != null) {
												@Pc(502) Class120_Sub1_Sub1_Sub1_Sub1 local502 = (Class120_Sub1_Sub1_Sub1_Sub1) local494.anObject5;
												if (client.anInt3436 != local502.anInt2691 * -1467925639 && local502.aBoolean452) {
													var24 = local502.method24552().aClass463_61;
													var25 = (int) var24.aFloat297 - (local502.aClass335_1.anInt4212 * 1573297955 - 1 << 8);
													var26 = (int) var24.aFloat296 - (local502.aClass335_1.anInt4212 * 1573297955 - 1 << 8);
													if (var25 >= local467 && local502.aClass335_1.anInt4212 * 1573297955 <= local410.method18966((byte) -92) - (var25 - local467 >> 9) && var26 >= var52 && local502.aClass335_1.anInt4212 * 1573297955 <= local410.method18966((byte) -13) - (var26 - var52 >> 9)) {
														Class578.method31798(local502, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 != local349.aClass120_Sub1_25.aByte99, (byte) 68);
														local502.anInt2691 = client.anInt3436 * 770260681;
													}
												}
											}
										}
										local167 = Class51.anInt191 * 44967471;
										@Pc(605) int[] local605 = Class51.anIntArray20;
										for (local222 = 0; local222 < local167; local222++) {
											@Pc(616) Class120_Sub1_Sub1_Sub1_Sub2 local616 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local605[local222]];
											if (local616 != null && local616.anInt2691 * -1467925639 != client.anInt3436 && local410 != local616 && local616.aBoolean452) {
												@Pc(636) Class463 local636 = local616.method24552().aClass463_61;
												var26 = (int) local636.aFloat297 - (local616.method18966((byte) -81) - 1 << 8);
												var27 = (int) local636.aFloat296 - (local616.method18966((byte) -48) - 1 << 8);
												if (var26 >= local467 && local616.method18966((byte) -19) <= local410.method18966((byte) -72) - (var26 - local467 >> 9) && var27 >= var52 && local616.method18966((byte) -25) <= local410.method18966((byte) -103) - (var27 - var52 >> 9)) {
													Class103_Sub13.method7940(local616, local349.aClass120_Sub1_25.aByte99 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, (byte) -34);
													local616.anInt2691 = client.anInt3436 * 770260681;
												}
											}
										}
									}
									if (client.anInt3436 != local410.anInt2691 * -1467925639) {
										Class103_Sub13.method7940(local410, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 != local349.aClass120_Sub1_25.aByte99, (byte) -59);
										local410.anInt2691 = client.anInt3436 * 770260681;
										break;
									}
								}
								if (!(local349.aClass120_Sub1_25 instanceof Class120_Sub1_Sub1_Sub1_Sub1)) {
									break;
								}
								@Pc(743) Class120_Sub1_Sub1_Sub1_Sub1 local743 = (Class120_Sub1_Sub1_Sub1_Sub1) local349.aClass120_Sub1_25;
								if (local743.aClass335_1 == null) {
									break;
								}
								@Pc(750) Class463 local750 = local743.method24552().aClass463_61;
								if ((local743.aClass335_1.anInt4212 * 1573297955 & 0x1) == 0 && ((int) local750.aFloat297 & 0x1FF) == 0 && ((int) local750.aFloat296 & 0x1FF) == 0 || (local743.aClass335_1.anInt4212 * 1573297955 & 0x1) == 1 && ((int) local750.aFloat297 & 0x1FF) == 256 && ((int) local750.aFloat296 & 0x1FF) == 256) {
									@Pc(809) int local809 = (int) local750.aFloat297 - (local743.aClass335_1.anInt4212 * 1573297955 - 1 << 8);
									local467 = (int) local750.aFloat296 - (local743.aClass335_1.anInt4212 * 1573297955 - 1 << 8);
									for (var52 = 0; var52 < client.anInt3453 * -1702559601; var52++) {
										@Pc(838) Class80_Sub19 local838 = (Class80_Sub19) client.aClass24_18.method560((long) client.anIntArray304[var52]);
										if (local838 != null) {
											@Pc(845) Class120_Sub1_Sub1_Sub1_Sub1 local845 = (Class120_Sub1_Sub1_Sub1_Sub1) local838.anObject5;
											if (client.anInt3436 != local845.anInt2691 * -1467925639 && local743 != local845 && local845.aBoolean452) {
												@Pc(862) Class463 local862 = local845.method24552().aClass463_61;
												var65 = (int) local862.aFloat297 - (local845.aClass335_1.anInt4212 * 1573297955 - 1 << 8);
												var25 = (int) local862.aFloat296 - (local845.aClass335_1.anInt4212 * 1573297955 - 1 << 8);
												if (var65 >= local809 && local845.aClass335_1.anInt4212 * 1573297955 <= local743.aClass335_1.anInt4212 * 1573297955 - (var65 - local809 >> 9) && var25 >= local467 && local845.aClass335_1.anInt4212 * 1573297955 <= local743.aClass335_1.anInt4212 * 1573297955 - (var25 - local467 >> 9)) {
													Class578.method31798(local845, local349.aClass120_Sub1_25.aByte99 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, (byte) 91);
													local845.anInt2691 = client.anInt3436 * 770260681;
												}
											}
										}
									}
									var52 = Class51.anInt191 * 44967471;
									@Pc(955) int[] local955 = Class51.anIntArray20;
									for (local174 = 0; local174 < var52; local174++) {
										@Pc(966) Class120_Sub1_Sub1_Sub1_Sub2 local966 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local955[local174]];
										if (local966 != null && client.anInt3436 != local966.anInt2691 * -1467925639 && local966.aBoolean452) {
											var24 = local966.method24552().aClass463_61;
											var25 = (int) var24.aFloat297 - (local966.method18966((byte) -120) - 1 << 8);
											var26 = (int) var24.aFloat296 - (local966.method18966((byte) -110) - 1 << 8);
											if (var25 >= local809 && local966.method18966((byte) -48) <= local743.aClass335_1.anInt4212 * 1573297955 - (var25 - local809 >> 9) && var26 >= local467 && local966.method18966((byte) -79) <= local743.aClass335_1.anInt4212 * 1573297955 - (var26 - local467 >> 9)) {
												Class103_Sub13.method7940(local966, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 != local349.aClass120_Sub1_25.aByte99, (byte) -68);
												local966.anInt2691 = client.anInt3436 * 770260681;
											}
										}
									}
								}
								if (client.anInt3436 != local743.anInt2691 * -1467925639) {
									Class578.method31798(local743, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 != local349.aClass120_Sub1_25.aByte99, (byte) 77);
									local743.anInt2691 = client.anInt3436 * 770260681;
									break;
								}
							}
							if (local349.aClass120_Sub1_25 instanceof Class120_Sub1_Sub5_Sub1) {
								@Pc(1097) int local1097 = local379 + local11.anInt5540 * -390642507;
								var40 = local11.anInt5537 * -894305615 + local384;
								@Pc(1120) Class80_Sub4 local1120 = (Class80_Sub4) client.aClass24_22.method560((long) (local349.aClass120_Sub1_25.aByte99 << 28 | var40 << 14 | local1097));
								if (local1120 != null) {
									local467 = 0;
									@Pc(1130) Class80_Sub9 local1130 = (Class80_Sub9) local1120.aClass8_18.method235(-1026287797);
									while (local1130 != null) {
										@Pc(1142) Class43 local1142 = (Class43) Class25.aClass41_Sub9_1.method18054(local1130.anInt1498 * 959158013, 1753791593);
										if (local1142.aBoolean24) {
											local174 = local1142.anInt158 * -280328425;
										} else if (local1142.aBoolean21) {
											local174 = Class630.aClass641_1.anInt5640 * -960054943;
										} else {
											local174 = Class630.aClass641_1.anInt5639 * -1730283373;
										}
										if (client.aBoolean728 && local349.aClass120_Sub1_25.aByte99 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99) {
											@Pc(1188) Class79 local1188 = (Class79) (-968124561 * Class34.anInt107 == -1 ? null : Class370.aClass41_Sub10_1.method18054(Class34.anInt107 * -968124561, 564533405));
											if ((Class542.anInt5121 * -1641097909 & 0x1) != 0 && (local1188 == null || local1142.method917(Class34.anInt107 * -968124561, local1188.anInt253 * 680817871, (short) 993) != local1188.anInt253 * 680817871)) {
												Class360.method28144(client.aString149, client.aString146 + " " + Class256.aString158 + " " + Class90.method1870(local174, -1169141673) + local1142.aString5, Class107_Sub1.anInt682 * 582850143, 17, -1, (long) (local1130.anInt1498 * 959158013), local379, local384, true, false, (long) local467, false, (byte) 53);
											}
										}
										if (local349.aClass120_Sub1_25.aByte99 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99) {
											@Pc(1260) String[] local1260 = local1142.aStringArray4;
											for (var65 = local1260.length - 1; var65 >= 0; var65--) {
												if (local1260[var65] != null) {
													@Pc(1273) short local1273 = 0;
													var26 = client.anInt3523 * -1653832769;
													if (var65 == 0) {
														local1273 = 18;
													}
													if (var65 == 1) {
														local1273 = 19;
													}
													if (var65 == 2) {
														local1273 = 20;
													}
													if (var65 == 3) {
														local1273 = 21;
													}
													if (var65 == 4) {
														local1273 = 22;
													}
													if (var65 == 5) {
														local1273 = 1004;
													}
													var27 = local1142.method892(var65, (byte) 32);
													if (var27 != -1) {
														var26 = var27;
													}
													Class360.method28144(local1260[var65], Class90.method1870(local174, -1941339193) + local1142.aString5, var26, local1273, -1, (long) (local1130.anInt1498 * 959158013), local379, local384, true, false, (long) local467, false, (byte) 74);
												}
											}
										}
										local1130 = (Class80_Sub9) local1120.aClass8_18.method238((byte) -49);
										local467++;
									}
								}
							}
						} while (!(local349.aClass120_Sub1_25 instanceof Interface60));
						local1365 = (Interface60) local349.aClass120_Sub1_25;
						local1375 = (Class625) client.aClass539_1.method30905(-1435623888).method18054(local1365.method13834((byte) 8), -861195732);
						if (local1375.anIntArray503 != null) {
							local1375 = local1375.method32456(Class672.aClass134_1, Class672.aClass134_1, -675053944);
						}
					} while (local1375 == null);
					if (client.aBoolean728 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local349.aClass120_Sub1_25.aByte99) {
						@Pc(1411) Class79 local1411 = (Class79) (Class34.anInt107 * -968124561 == -1 ? null : Class370.aClass41_Sub10_1.method18054(Class34.anInt107 * -968124561, 106875331));
						if ((Class542.anInt5121 * -1641097909 & 0x4) != 0 && (local1411 == null || local1375.method32463(Class34.anInt107 * -968124561, local1411.anInt253 * 680817871, -846683251) != local1411.anInt253 * 680817871)) {
							Class360.method28144(client.aString149, client.aString146 + " " + Class256.aString158 + " " + Class90.method1870(65535, -1013386128) + local1375.aString233, Class107_Sub1.anInt682 * 582850143, 2, -1, Class338.method27884(local1365, local379, local384, 934740315), local379, local384, true, false, (long) local1365.hashCode(), false, (byte) 87);
						}
					}
				} while (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 != local349.aClass120_Sub1_25.aByte99);
				local1485 = local1375.aStringArray33;
			} while (local1485 == null);
			for (local467 = local1485.length - 1; local467 >= 0; local467--) {
				if (local1485[local467] != null) {
					@Pc(1500) short local1500 = 0;
					local167 = client.anInt3523 * -1653832769;
					if (local467 == 0) {
						local1500 = 3;
					}
					if (local467 == 1) {
						local1500 = 4;
					}
					if (local467 == 2) {
						local1500 = 5;
					}
					if (local467 == 3) {
						local1500 = 6;
					}
					if (local467 == 4) {
						local1500 = 1001;
					}
					if (local467 == 5) {
						local1500 = 1002;
					}
					local174 = local1375.method32468(local467, (byte) -64);
					if (local174 != -1) {
						local167 = local174;
					}
					Class360.method28144(local1485[local467], Class90.method1870(65535, -1151386479) + local1375.aString233, local167, local1500, -1, Class338.method27884(local1365, local379, local384, 1517128003), local379, local384, true, false, (long) local1365.hashCode(), false, (byte) 42);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "at", descriptor = "(Lclient!yp;I)V")
	static void method31805(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(Lclient!yy;Lclient!zw;II)I")
	public static int method31806(@OriginalArg(0) Class697 arg0, @OriginalArg(1) Class720 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == Class697.aClass697_4) {
			return 80;
		} else if (arg1 == Class720.aClass720_2) {
			return arg2 + 12000;
		} else {
			return arg2 + 7000;
		}
	}

	@OriginalMember(owner = "client!tq", name = "bdt", descriptor = "(Lclient!yp;B)V")
	static void method31807(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class531.aString220.startsWith("linux") ? 1 : 0;
	}

	@OriginalMember(owner = "client!tq", name = "rh", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method31808(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1631384033) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray36 = Class431.method29089(local13, arg2, 797189524);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!tq", name = "mg", descriptor = "(Ljava/lang/String;I)V")
	public static void method31809(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return;
		}
		@Pc(8) String local8 = Class635.method32821(arg0, Class126.aClass91_13, 1396910000);
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < client.anInt3573 * 975306769; local13++) {
			@Pc(22) Class676 local22 = client.aClass676Array1[local13];
			@Pc(25) String local25 = local22.aString236;
			@Pc(30) String local30 = Class635.method32821(local25, Class126.aClass91_13, 1558030256);
			if (Class564.method31477(arg0, local8, local25, local30, 605192798)) {
				client.anInt3573 -= 353300721;
				for (@Pc(43) int local43 = local13; local43 < client.anInt3573 * 975306769; local43++) {
					client.aClass676Array1[local43] = client.aClass676Array1[local43 + 1];
				}
				client.anInt3553 = client.anInt3569 * -799307175;
				@Pc(65) Class75 local65 = Class52.method1074(16777215);
				@Pc(71) Class80_Sub31 local71 = Class623.method32440(Class443.aClass443_100, local65.aClass22_1, -191270971);
				local71.aClass80_Sub36_Sub1_2.method23154(Class350.method28013(arg0, (short) 16383), 1275868335);
				local71.aClass80_Sub36_Sub1_2.method23165(arg0, 2022378224);
				local65.method1325(local71, (byte) -40);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "dp", descriptor = "(IIIB)V")
	static void method31810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg0 == 1008) {
			Class107.method7196(Class158.aClass158_59, arg1, arg2, -1412333107);
		} else if (arg0 == 1009) {
			Class107.method7196(Class158.aClass158_48, arg1, arg2, 1714637297);
		} else if (arg0 == 1010) {
			Class107.method7196(Class158.aClass158_62, arg1, arg2, -525543657);
		} else if (arg0 == 1011) {
			Class107.method7196(Class158.aClass158_50, arg1, arg2, -559543623);
		} else if (arg0 == 1012) {
			Class107.method7196(Class158.aClass158_68, arg1, arg2, 55297041);
		}
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V")
	static void method31811(@OriginalArg(0) int arg0) {
		Class149.anInt1521 = Class375.aClass15_9.anInt45 * -1140821369 + 2027825122 + Class375.aClass15_9.anInt46 * -903293067;
		Class149.anInt1528 = Class689.aClass15_13.anInt46 * -986959715 + Class689.aClass15_13.anInt45 * -134051009 + 1453614578;
		Class149.aStringArray16 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class149.aStringArray16.length; local28++) {
			Class149.aStringArray16[local28] = "";
		}
		Class294.method26961(Class60.aClass60_102.method1180(Class512.aClass719_3, -812529402), 1455295997);
	}

	@OriginalMember(owner = "client!tq", name = "da", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method31812(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -1107359310;
		arg0.aBoolean809 = true;
		arg0.anInt4145 = Math.max(Math.min(arg2.anIntArray525[arg2.anInt5778 * 1896589581], 2816), 0) * 427173921;
		arg0.anInt4097 = Math.max(Math.min(arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1], 2816), 0) * -1223480803;
		arg0.anInt4144 = Math.max(Math.min(arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 2], 2816), 0) * -543362723;
		@Pc(71) int local71 = Math.max(Math.min(arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 3], 255), 0);
		@Pc(85) int local85 = Math.max(Math.min(arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 4], 255), 0);
		@Pc(99) int local99 = Math.max(Math.min(arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 5], 255), 0);
		arg0.anInt4153 = (local71 << 16 | local85 << 8 | local99) * 1825404731;
		arg0.anInt4140 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 6] * -1033006981;
		arg0.anInt4125 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 7] * 644702295;
		arg0.anInt4142 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 8] * 605864325;
		arg0.anInt4147 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 9] * 384631121;
		Class296.method26998(arg0, 610419283);
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!aie;)V")
	Class579(@OriginalArg(0) Class138_Sub1 arg0) {
		this.aClass138_Sub1_4 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int method31799(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31800((Class541) arg0, (Class541) arg1, -1072785562);
	}

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "(Lclient!ry;Lclient!ry;I)I")
	int method31800(@OriginalArg(0) Class541 arg0, @OriginalArg(1) Class541 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) float local3 = arg0.method31077(2132069646);
		@Pc(7) float local7 = arg1.method31077(2101169181);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tq", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31800((Class541) arg0, (Class541) arg1, -1511184188);
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(Lclient!ry;Lclient!ry;)I")
	int method31801(@OriginalArg(0) Class541 arg0, @OriginalArg(1) Class541 arg1) {
		@Pc(3) float local3 = arg0.method31077(2131831882);
		@Pc(7) float local7 = arg1.method31077(2106509142);
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tq", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method31802(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method31803(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}
}
