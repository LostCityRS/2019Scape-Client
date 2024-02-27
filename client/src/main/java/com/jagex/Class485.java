package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class485 implements Interface7 {

	@OriginalMember(owner = "client!pk", name = "by", descriptor = "Ljava/lang/String;")
	static String aString225;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_122;

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
	final int anInt5305;

	@OriginalMember(owner = "client!pk", name = "beq", descriptor = "(Lclient!yf;B)V")
	static void method29981(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(37) int local37 = Class174.method24356(local23, (byte) 31);
		@Pc(41) int local41 = Class57.method1089(local23, -52780061);
		@Pc(47) Class30 local47 = (Class30) Class74.aClass32_2.method18273(local13, 1584973293);
		@Pc(53) Class77 local53 = (Class77) Class276.aClass32_3.method18273(local37, 928470865);
		@Pc(58) Class519[] local58 = local53.aClass519ArrayArray2[local41];
		@Pc(63) Object[] local63 = local47.method620(local41, 1417620205);
		if (local63 == null && local53.anObjectArrayArray2 != null) {
			local63 = local53.anObjectArrayArray2[local41];
		}
		@Pc(79) int local79;
		if (local63 == null) {
			for (local79 = 0; local79 < local58.length; local79++) {
				@Pc(87) Class519 local87 = local58[local79];
				if (local87 == Class519.aClass519_7) {
					arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
				} else if (local87 == Class519.aClass519_88 || Class519.aClass519_8 == local87) {
					arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
				} else {
					arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
				}
			}
			return;
		}
		local79 = local63.length / local58.length;
		if (local33 < 0 || local33 >= local79) {
			throw new RuntimeException();
		}
		for (@Pc(163) int local163 = 0; local163 < local58.length; local163++) {
			@Pc(174) int local174 = local163 + local33 * local58.length;
			if (local58[local163] == Class519.aClass519_7) {
				arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local63[local174];
			} else {
				arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (Integer) local63[local174];
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "ko", descriptor = "(Lclient!yf;B)V")
	static void method29982(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class273.method26418(local11, local14, arg0, 486125849);
	}

	@OriginalMember(owner = "client!pk", name = "ja", descriptor = "([Lclient!hf;IIIIIIIIZI)V")
	public static void method29983(@OriginalArg(0) Class312[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Class312 local15 = arg0[local7];
			if (local15 != null && (local15.anInt4026 * 897022795 == arg1 || arg1 == -1412584499 && local15 == client.aClass312_5)) {
				@Pc(71) int local71;
				if (arg8 == -1) {
					client.aRectangleArray1[client.anInt3562 * -1477010237].setBounds(local15.anInt4020 * -903351367 + arg6, arg7 + local15.anInt4021 * -1281935361, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249);
					local71 = (client.anInt3562 += -170134549) * -1477010237 - 1;
				} else {
					local71 = arg8;
				}
				local15.anInt4010 = local71 * -1226349229;
				local15.anInt4052 = client.anInt3485 * -1620594465;
				if (!client.method24983(local15)) {
					if (local15.anInt4013 * -1428659995 != 0) {
						Class611.method32228(local15, -51115271);
					}
					@Pc(103) int local103 = local15.anInt4020 * -903351367 + arg6;
					@Pc(110) int local110 = local15.anInt4021 * -1281935361 + arg7;
					@Pc(115) int local115 = local15.anInt4035 * -552008165;
					if (client.aBoolean617 && (client.method25250(local15).anInt1550 * -622772683 != 0 || local15.anInt4012 * -158526639 == 0) && local115 > 127) {
						local115 = 127;
					}
					@Pc(188) int local188;
					@Pc(192) int local192;
					if (client.aClass312_5 == local15) {
						if (arg1 != -1412584499 && (local15.anInt4068 * -1662303157 == Class312.anInt3993 * -837858879 || Class312.anInt4049 * -184372205 == local15.anInt4068 * -1662303157 || client.method25250(local15).method13630(696414781) && Class312.anInt4066 * 1165943799 != local15.anInt4068 * -1662303157)) {
							Class642.aClass312Array5 = arg0;
							Class511.anInt5369 = arg6 * -1442177961;
							Exception_Sub4.anInt2489 = arg7 * -1164932673;
							continue;
						}
						if (client.aBoolean618 && client.aBoolean616) {
							local188 = Class82.aClass153_1.method14058(-1946363726);
							local192 = Class82.aClass153_1.method14064(312610477);
							local188 -= client.anInt3528 * -75226417;
							local192 -= client.anInt3529 * 84488847;
							if (local188 < client.anInt3530 * 771950313) {
								local188 = client.anInt3530 * 771950313;
							}
							if (local15.anInt4022 * 1215292027 + local188 > client.anInt3438 * 982073619 + client.anInt3530 * 771950313) {
								local188 = client.anInt3438 * 982073619 + client.anInt3530 * 771950313 - local15.anInt4022 * 1215292027;
							}
							if (local192 < client.anInt3479 * -1329459211) {
								local192 = client.anInt3479 * -1329459211;
							}
							if (local192 + local15.anInt4023 * -1490598249 > client.anInt3479 * -1329459211 + client.anInt3532 * 1129349351) {
								local192 = client.anInt3479 * -1329459211 + client.anInt3532 * 1129349351 - local15.anInt4023 * -1490598249;
							}
							if (client.method25250(local15).method13630(388323471)) {
								Class269.method26366(local188, local192, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, (byte) -14);
							}
							if (Class312.anInt4066 * 1165943799 != local15.anInt4068 * -1662303157) {
								local103 = local188;
								local110 = local192;
							}
						}
						if (Class312.anInt4049 * -184372205 == local15.anInt4068 * -1662303157) {
							local115 = 128;
						}
					}
					@Pc(327) int local327;
					@Pc(329) int local329;
					@Pc(337) int local337;
					@Pc(344) int local344;
					if (local15.anInt4012 * -158526639 == 2) {
						local188 = arg2;
						local192 = arg3;
						local327 = arg4;
						local329 = arg5;
					} else {
						local337 = local103 + local15.anInt4022 * 1215292027;
						local344 = local110 + local15.anInt4023 * -1490598249;
						if (local15.anInt4012 * -158526639 == 9) {
							local337++;
							local344++;
						}
						local188 = local103 > arg2 ? local103 : arg2;
						local192 = local110 > arg3 ? local110 : arg3;
						local327 = local337 < arg4 ? local337 : arg4;
						local329 = local344 < arg5 ? local344 : arg5;
					}
					if (local188 < local327 && local192 < local329) {
						@Pc(666) int local666;
						@Pc(717) int local717;
						@Pc(656) Class100 local656;
						@Pc(692) int local692;
						@Pc(686) int local686;
						@Pc(709) int local709;
						if (local15.anInt4013 * -1428659995 != 0) {
							if (local15.anInt4013 * -1428659995 == Class312.anInt4090 * 1565172903 || local15.anInt4013 * -1428659995 == Class312.anInt3997 * -519160419) {
								if (client.aBoolean619) {
									Class694.aClass104_14.method20513();
									Class237.method25870(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, Class312.anInt3997 * -519160419 == local15.anInt4013 * -1428659995, -259365762);
									Class157.method14267(local71, local188, local192, local327, local329, local103, local110, 266367318);
									Class694.aClass104_14.method20574();
									Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
									client.aBooleanArray22[local71] = true;
								}
								continue;
							}
							if (local15.anInt4013 * -1428659995 == Class312.anInt4006 * -1122907149 && client.anInt3463 * 1819062465 == 3) {
								if (local15.anInt4012 * -158526639 != 5 || local15.method26971(Class694.aClass104_14, (byte) 24) != null) {
									Class606.method32090(Class694.aClass104_14, local15, local103, local110, (byte) 76);
									Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Class312.anInt4005 * 164042273 == local15.anInt4013 * -1428659995) {
								Class506.method30402(Class694.aClass104_14, local103, local110, local15, -891919494);
								continue;
							}
							if (Class312.anInt4089 * 1131819763 == local15.anInt4013 * -1428659995) {
								Class543.method31123(Class694.aClass104_14, local103, local110, local15, local15.anInt4034 * 969124391 % 64, 25888994);
								continue;
							}
							if (Class312.anInt4063 * 326048085 == local15.anInt4013 * -1428659995) {
								if (local15.method26971(Class694.aClass104_14, (byte) 24) != null) {
									Class694.aClass104_14.method20513();
									Class572.method31516(local15, local103, local110, 2045799878);
									Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Class312.anInt4000 * 2108700873 == local15.anInt4013 * -1428659995) {
								Class480.method29932(Class694.aClass104_14, local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, (short) -19136);
								client.aBooleanArray22[local71] = true;
								Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Class312.anInt4001 * 145731619 == local15.anInt4013 * -1428659995) {
								Class284.method26579(Class694.aClass104_14, local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, (byte) 0);
								client.aBooleanArray22[local71] = true;
								Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Class312.anInt4002 * 89210441 == local15.anInt4013 * -1428659995) {
								if (client.aBoolean601 || client.aBoolean612) {
									Class110_Sub4.method7301(local103, local110, local15, (byte) 46);
									client.aBooleanArray22[local71] = true;
								}
								continue;
							}
							if (Class312.anInt3999 * 1808652547 == local15.anInt4013 * -1428659995) {
								local656 = Class344.method27645(1773173204);
								if (local656 != null) {
									local344 = arg4 - arg2;
									local666 = arg5 - arg3;
									@Pc(672) float local672 = (float) local344 / (float) local666;
									@Pc(680) float local680 = (float) local656.method18201() / (float) local656.method18177();
									if (local672 < local680) {
										local686 = local344;
										local692 = (int) ((float) local344 / local680);
									} else {
										local686 = (int) ((float) local666 * local680);
										local692 = local666;
									}
									local709 = (local344 - local686) / 2 + arg2;
									local717 = (local666 - local692) / 2 + arg3;
									local656.method18215(local709, local717, local686, local692);
								}
								continue;
							}
							if (local15.anInt4013 * -1428659995 == Class312.anInt4007 * -599281131) {
								if (Class361.method27984(862937808) && Class570.method31503(668989332)) {
									Class388.method28429(arg2, arg3, arg4, arg5, 1647607109);
								}
								continue;
							}
						}
						@Pc(920) int local920;
						@Pc(924) int local924;
						if (local15.anInt4012 * -158526639 == 0) {
							if (Class312.anInt4004 * 1282669513 == local15.anInt4013 * -1428659995) {
								Class694.aClass104_14.method20513();
								client.aClass532_1.method30713((byte) -64).method33144(client.aClass532_1, (byte) -90);
								Class694.aClass104_14.method20483(local103, local110, client.anInt3408 * -1378711501, client.anInt3416 * 2091353777);
							}
							method29983(arg0, local15.anInt3994 * -1549590237, local188, local192, local327, local329, local103 - local15.anInt4030 * 1868441863, local110 - local15.anInt4031 * -1543587533, local71, arg9, -1139451874);
							if (local15.aClass312Array1 != null) {
								method29983(local15.aClass312Array1, local15.anInt3994 * -1549590237, local188, local192, local327, local329, local103 - local15.anInt4030 * 1868441863, local110 - local15.anInt4031 * -1543587533, local71, arg9, 338284877);
							}
							@Pc(840) Class93_Sub40 local840 = (Class93_Sub40) client.aClass16_22.method215((long) (local15.anInt3994 * -1549590237));
							if (local840 != null) {
								Class660.method33005(local840.anInt3172 * 1220811495, local188, local192, local327, local329, local103 - local15.anInt4030 * 1868441863, local110 - local15.anInt4031 * -1543587533, local71, 658105198);
							}
							if (local15.anInt4013 * -1428659995 == Class312.anInt4004 * 1282669513) {
								if (Class694.aClass104_14.method20545()) {
									Class694.aClass104_14.method20544(local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249);
									if (client.anInt3435 * -849002901 == 18) {
										Class558.method31290(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, 1593984174);
									}
								}
								if (client.anInt3463 * 1819062465 == 0) {
									local344 = client.anInt3534 * -72356353;
									local666 = client.anInt3470 * -960524353;
									local920 = client.anInt3471 * -69651169;
									local924 = client.anInt3442 * 846473117;
									if (client.anInt3485 < client.anInt3468 * -1351624693) {
										@Pc(947) float local947 = (float) (client.anInt3485 - client.anInt3467 * -1391426351) * 1.0F / (float) (client.anInt3468 * -1351624693 - client.anInt3467 * -1391426351);
										local344 = (int) ((1.0F - local947) * (float) (Class655.anInt5970 * 1732663719) + local947 * (float) (client.anInt3534 * -72356353));
										local666 = (int) ((1.0F - local947) * (float) (Class110_Sub8.anInt917 * 2094417443) + local947 * (float) (client.anInt3470 * -960524353));
										local920 = (int) ((float) (Class23.anInt74 * 1246146319) * (1.0F - local947) + local947 * (float) (client.anInt3471 * -69651169));
										local924 = (int) ((float) (Class257.anInt3895 * 1394975469) * (1.0F - local947) + local947 * (float) (client.anInt3442 * 846473117));
									}
									if (local344 > 0) {
										Class694.aClass104_14.method20612(local188, local192, local327 - local188, local329 - local192, local344 << 24 | local666 << 16 | local920 << 8 | local924, (byte) 48);
									}
								}
							}
							Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
						}
						if (client.aBooleanArray19[local71] || client.anInt3531 * -2127107653 > 1) {
							if (local15.anInt4012 * -158526639 == 3) {
								if (local115 == 0) {
									if (local15.aBoolean697) {
										Class694.aClass104_14.method20665(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, local15.anInt4034 * 969124391 | 0xFF000000, 0);
									} else {
										Class694.aClass104_14.method20490(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, local15.anInt4034 * 969124391 | 0xFF000000, 0);
									}
								} else if (local15.aBoolean697) {
									Class694.aClass104_14.method20665(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, 255 - (local115 & 0xFF) << 24 | local15.anInt4034 * 969124391 & 0xFFFFFF, 1);
								} else {
									Class694.aClass104_14.method20490(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, 255 - (local115 & 0xFF) << 24 | local15.anInt4034 * 969124391 & 0xFFFFFF, 1);
								}
							} else if (local15.anInt4012 * -158526639 == 4) {
								local337 = 255 - (local115 & 0xFF);
								if (local337 != 0) {
									@Pc(1189) Class106 local1189 = local15.method26943(Class157.aClass462_2, client.anInterface50_1, (short) 24957);
									if (local1189 != null) {
										local666 = local15.anInt4034 * 969124391;
										@Pc(1206) String local1206 = local15.aString170;
										if (local15.anInt4086 * 307668159 != -1) {
											@Pc(1221) Class47 local1221 = (Class47) Class277.aClass32_Sub12_1.method18273(local15.anInt4086 * 307668159, -1974256897);
											local1206 = local1221.aString6;
											if (local1206 == null) {
												local1206 = "null";
											}
											if ((local1221.anInt150 * -1809820871 == 1 || local15.anInt4087 * -570377411 != 1) && -570377411 * local15.anInt4087 != -1) {
												local1206 = Class306.method26916(16748608, -1350626226) + local1206 + Class430.aString217 + " x" + Class527.method30569(local15.anInt4087 * -570377411, -1675420474);
											}
										}
										if (local15 == client.aClass312_7) {
											local1206 = Class74.aClass74_149.method1259(Class106.aClass717_8, (byte) 56);
											local666 = local15.anInt4034 * 969124391;
										}
										if (client.aBoolean629) {
											Class694.aClass104_14.method20472(local103, local110, local103 + local15.anInt4022 * 1215292027, local110 + local15.anInt4023 * -1490598249);
										}
										local337 <<= 0x18;
										if (local15.aBoolean699) {
											local1189.method7543(local1206, local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, local337 | local666, local15.aBoolean698 ? local337 : -1, local15.anInt4041 * 589611627, local15.anInt4065 * 515253515, client.aRandom2, Class106.anInt891, client.anIntArray324, Class110_Sub14.aClass100Array4, null, -975084524);
										} else {
											local1189.method7528(local1206, local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, local337 | local666, local15.aBoolean698 ? local337 : -1, local15.anInt4041 * 589611627, local15.anInt4065 * 515253515, local15.anInt4046 * -889720761, local15.anInt4051 * 483418137, Class110_Sub14.aClass100Array4, null, null, 0, 0, 1355913330);
										}
										if (client.aBoolean629) {
											Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
										}
									} else if (Class312.aBoolean703) {
										Class354.method27789(local15, -1174743804);
									}
								}
							} else {
								@Pc(1661) int local1661;
								@Pc(1607) boolean local1607;
								if (local15.anInt4012 * -158526639 == 5) {
									if (local15.anInt4088 * 358929895 >= 0) {
										local15.method27013(Class123.aClass32_Sub11_2, Class51.aClass32_Sub9_1, -1386163559).method31342(Class694.aClass104_14, 0, local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, local15.anInt4095 * 905019813 << 3, local15.anInt3998 * -1680348127 << 3, 0, 0, 137212330);
									} else {
										if (local15.anInt4086 * 307668159 != -1) {
											@Pc(1457) Class658 local1457 = local15.aBoolean693 ? Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 : null;
											local656 = Class277.aClass32_Sub12_1.method17081(Class694.aClass104_14, local15.anInt4086 * 307668159, local15.anInt4087 * -570377411, local15.anInt4038 * 2095239745, local15.anInt4039 * 1581456827 | 0xFF000000, local15.anInt4055 * -1654869125, local1457, 1734982061);
										} else if (-556580463 * local15.anInt4014 == -1) {
											local656 = local15.method26942(Class694.aClass104_14, (byte) 37);
										} else {
											local656 = (Class100) client.aClass240_70.method25932((long) (local15.anInt4014 * -556580463));
											if (local656 == null && !client.aMap19.containsKey(local15.anInt4014 * -556580463)) {
												try {
													client.aMap19.put(local15.anInt4014 * -556580463, Class163.aClass653_3.method32887(new URL(client.aString141 + "/img/image_" + local15.anInt4014 * -556580463 + ".png?a=" + Class305.method26889(1361581033)), 1605785139));
												} catch (@Pc(1546) MalformedURLException local1546) {
													Class646.method32791(null, local1546, 1706256472);
												}
											}
										}
										if (local656 != null) {
											local344 = local656.method18172();
											local666 = local656.method18178();
											local920 = 255 - (local115 & 0xFF);
											if (local920 != 0) {
												if (local15.anInt4034 * 969124391 == -1) {
													local924 = 16777215;
												} else {
													local924 = local15.anInt4034 * 969124391 & 0xFFFFFF;
													if (local924 == 0) {
														local924 = 16777215;
													}
												}
												local924 |= local920 << 24;
												local1607 = local924 != -1;
												if (local15.aBoolean689) {
													Class694.aClass104_14.method20472(local103, local110, local15.anInt4022 * 1215292027 + local103, local15.anInt4023 * -1490598249 + local110);
													if (local15.anInt4037 * -1099308531 != 0) {
														local692 = (local344 - 1 + local15.anInt4022 * 1215292027) / local344;
														local709 = (local15.anInt4023 * -1490598249 + (local666 - 1)) / local666;
														for (local717 = 0; local717 < local692; local717++) {
															for (local1661 = 0; local1661 < local709; local1661++) {
																if (local1607) {
																	local656.method18194((float) local344 / 2.0F + (float) (local103 + local344 * local717), (float) (local1661 * local666 + local110) + (float) local666 / 2.0F, 4096, local15.anInt4037 * -1099308531, 0, local924, 1);
																} else {
																	local656.method18193((float) local344 / 2.0F + (float) (local344 * local717 + local103), (float) local666 / 2.0F + (float) (local1661 * local666 + local110), 4096, local15.anInt4037 * -1099308531);
																}
															}
														}
													} else if (local1607) {
														local656.method18191(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, 0, local924, 1);
													} else {
														local656.method18190(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249);
													}
													Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
												} else if (local1607) {
													if (local15.anInt4037 * -1099308531 != 0) {
														local656.method18194((float) local103 + (float) (local15.anInt4022 * 1215292027) / 2.0F, (float) local110 + (float) (local15.anInt4023 * -1490598249) / 2.0F, local15.anInt4022 * -30953472 / local344, local15.anInt4037 * -1099308531, 0, local924, 1);
													} else if (local15.anInt4022 * 1215292027 == local344 && local666 == local15.anInt4023 * -1490598249) {
														local656.method18185(local103, local110, 0, local924, 1);
													} else {
														local656.method18188(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249, 0, local924, 1);
													}
												} else if (local15.anInt4037 * -1099308531 != 0) {
													local656.method18238((float) local103 + (float) (local15.anInt4022 * 1215292027) / 2.0F, (float) local110 + (float) (local15.anInt4023 * -1490598249) / 2.0F, (float) local344 / 2.0F, (float) local666 / 2.0F, local15.anInt4022 * -30953472 / local344, local15.anInt4023 * 1953067008 / local666, local15.anInt4037 * -1099308531, 1, -1, 1);
												} else if (local15.anInt4022 * 1215292027 == local344 && local666 == local15.anInt4023 * -1490598249) {
													local656.method18181(local103, local110);
												} else {
													local656.method18215(local103, local110, local15.anInt4022 * 1215292027, local15.anInt4023 * -1490598249);
												}
											}
										} else if (Class312.aBoolean703) {
											Class354.method27789(local15, -1174743804);
										}
									}
								} else if (local15.anInt4012 * -158526639 == 6) {
									Class694.aClass104_14.method20513();
									@Pc(1951) Class109 local1951 = null;
									local344 = 2048;
									if (local15.anInt4015 * 649809261 != 0) {
										local344 |= 0x80000;
									}
									local666 = 0;
									if (local15.anInt4086 * 307668159 == -1) {
										@Pc(2044) Class132_Sub1_Sub1_Sub1_Sub2 local2044;
										if (local15.anInt4042 * 1553054515 == 3) {
											local920 = local15.anInt4078 * 371778301;
											if (local920 >= 0 && local920 < 2048) {
												local2044 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local920];
												if (local2044 != null && (local920 == client.anInt3513 * -859840571 || Class704.method36912(local2044.aString82, 304329139) == local15.anInt4079 * 786895357)) {
													local1951 = local15.method26945(Class694.aClass104_14, local344, Class166_Sub6.aClass32_Sub5_1, Class343.aClass32_Sub19_1, Class162.aClass32_Sub3_2, Class277.aClass32_Sub12_1, Class32.aClass32_Sub17_23, Class624.aClass120_1, Class624.aClass120_1, local15.aClass19_6, local2044.aClass658_1, -1133182906);
													if (local1951 == null && Class312.aBoolean703) {
														Class354.method27789(local15, -1174743804);
													}
												}
											}
										} else if (local15.anInt4042 * 1553054515 == 5) {
											local920 = local15.anInt4078 * 371778301;
											local2044 = null;
											local1607 = false;
											if (local920 >= 0 && local920 < 2048) {
												local2044 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local920];
												local1607 = local2044 != null && (local920 == client.anInt3513 * -859840571 || Class704.method36912(local2044.aString82, 304329139) == local15.anInt4079 * 786895357);
											} else if (local920 == -1) {
												local1607 = true;
												local2044 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3;
											} else {
												@Pc(2145) Class132_Sub1_Sub1_Sub1_Sub2 local2145 = (Class132_Sub1_Sub1_Sub1_Sub2) client.aMap18.get(local920);
												if (local2145 != null && local2145.anInt2768 * -1688488127 == local920) {
													local1607 = true;
													local2044 = local2145;
												}
											}
											if (local1607 && local2044 != null && local2044.aClass658_1 != null) {
												local1951 = local2044.aClass658_1.method32953(Class694.aClass104_14, local344, Class166_Sub6.aClass32_Sub5_1, Class343.aClass32_Sub19_1, Class162.aClass32_Sub3_2, Class277.aClass32_Sub12_1, Class624.aClass120_1, Class624.aClass120_1, local15.aClass19_6, null, null, null, 0, true, Class113.aClass651_2, (byte) 40);
											}
										} else if (local15.anInt4042 * 1553054515 == 8 || local15.anInt4042 * 1553054515 == 9) {
											@Pc(2208) Class93_Sub6 local2208 = Class557.method31246(local15.anInt4078 * 371778301, false, (short) 255);
											if (local2208 != null) {
												local1951 = local2208.method12663(Class694.aClass104_14, local344, local15.aClass19_6, local15.anInt4079 * 786895357, local15.anInt4042 * 1553054515 == 9, local15.aBoolean693 ? Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 : null, 1946877310);
											}
										} else if (local15.aClass19_6 != null && local15.aClass19_6.method23564(732026440)) {
											local1951 = local15.method26945(Class694.aClass104_14, local344, Class166_Sub6.aClass32_Sub5_1, Class343.aClass32_Sub19_1, Class162.aClass32_Sub3_2, Class277.aClass32_Sub12_1, Class32.aClass32_Sub17_23, Class624.aClass120_1, Class624.aClass120_1, local15.aClass19_6, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1, -1753279164);
											if (local1951 == null && Class312.aBoolean703) {
												Class354.method27789(local15, -1174743804);
											}
										} else {
											local1951 = local15.method26945(Class694.aClass104_14, local344, Class166_Sub6.aClass32_Sub5_1, Class343.aClass32_Sub19_1, Class162.aClass32_Sub3_2, Class277.aClass32_Sub12_1, Class32.aClass32_Sub17_23, Class624.aClass120_1, Class624.aClass120_1, null, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1, -1974335303);
											if (local1951 == null && Class312.aBoolean703) {
												Class354.method27789(local15, -1174743804);
											}
										}
									} else {
										@Pc(1979) Class47 local1979 = (Class47) Class277.aClass32_Sub12_1.method18273(local15.anInt4086 * 307668159, 2096714263);
										if (local1979 != null) {
											local1979 = local1979.method913(local15.anInt4087 * -570377411, 1586672031);
											local1951 = local1979.method912(Class694.aClass104_14, local344, 1, local15.aBoolean693 ? Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 : null, local15.aClass19_6, 0, 0, 0, 0, -1240997013);
											if (local1951 == null) {
												Class354.method27789(local15, -1174743804);
											} else {
												local666 = -local1951.method6882() >> 1;
											}
										}
									}
									if (local1951 != null) {
										if (local15.anInt4015 * 649809261 != 0) {
											local1951.method6879(local15.anInt4054 * 243448789, local15.anInt4060 * -296935139, local15.anInt4028 * 1521737303, local15.anInt4015 * 649809261);
										}
										if (local15.anInt4044 * 1011166973 > 0) {
											local920 = (local15.anInt4022 * 1215292027 << 9) / (local15.anInt4044 * 1011166973);
										} else {
											local920 = 512;
										}
										if (local15.anInt4053 * -1976310315 > 0) {
											local924 = (local15.anInt4023 * -1490598249 << 9) / (local15.anInt4053 * -1976310315);
										} else {
											local924 = 512;
										}
										local686 = local103 + local15.anInt4022 * 1215292027 / 2;
										local692 = local15.anInt4023 * -1490598249 / 2 + local110;
										if (!local15.aBoolean700) {
											local686 += local15.anInt4082 * -1109126065 * local920 >> 9;
											local692 += local15.anInt4033 * -1280175581 * local924 >> 9;
										}
										client.aClass470_51.method29629();
										Class694.aClass104_14.method20528(client.aClass470_51);
										@Pc(2413) Class489 local2413 = Class694.aClass104_14.method20519();
										local717 = client.aClass532_1.method30657(233817041);
										local1661 = client.aClass532_1.method30631(-1514319288);
										@Pc(2428) int local2428 = local1661 + local15.anInt4069 * -822913903;
										if (local15.aBoolean692) {
											if (Class429.anInt4942 * -1453926679 == 3) {
												if (local15.aBoolean700) {
													local2413.method30036((float) local686, (float) local692, (float) local920, (float) local924, Class65.aClass123_Sub1_2.method8970(18809780), Class65.aClass123_Sub1_2.method9028(-1941296156), (float) (client.anInt3408 * -1378711501), (float) (client.anInt3416 * 2091353777), (float) (local15.anInt4069 * -822913903));
												} else {
													local2413.method30036((float) local686, (float) local692, (float) local920, (float) local924, Class65.aClass123_Sub1_2.method8970(-1214987814), Class65.aClass123_Sub1_2.method9028(-2101835352), (float) (client.anInt3408 * -1378711501), (float) (client.anInt3416 * 2091353777), (float) (local15.anInt4069 * -822913903 << 2));
												}
											} else if (local15.aBoolean700) {
												local2413.method30036((float) local686, (float) local692, (float) local920, (float) local924, (float) local717, (float) local2428, (float) (client.anInt3408 * -1378711501), (float) (client.anInt3416 * 2091353777), (float) (local15.anInt4069 * -822913903));
											} else {
												local2413.method30036((float) local686, (float) local692, (float) local920, (float) local924, (float) local717, (float) local2428, (float) (client.anInt3408 * -1378711501), (float) (client.anInt3416 * 2091353777), (float) (local15.anInt4069 * -822913903 << 2));
											}
										} else if (Class429.anInt4942 * -1453926679 == 3) {
											local2413.method30117((float) local686, (float) local692, (float) local920, (float) local924, Class65.aClass123_Sub1_2.method8970(91083045), Class65.aClass123_Sub1_2.method9028(-1925800722), (float) (client.anInt3408 * -1378711501), (float) (client.anInt3416 * 2091353777));
										} else {
											local2413.method30117((float) local686, (float) local692, (float) local920, (float) local924, (float) local717, (float) local2428, (float) (client.anInt3408 * -1378711501), (float) (client.anInt3416 * 2091353777));
										}
										Class694.aClass104_14.method20531(local2413);
										Class694.aClass104_14.method20786(2, 0);
										if (local15.aBoolean696) {
											Class694.aClass104_14.method20530(false);
										}
										if (local15.aBoolean700) {
											client.aClass470_52.method29625(1.0F, 0.0F, 0.0F, Class464.method29463(local15.anInt4047 * 1332164047));
											client.aClass470_52.method29560(0.0F, 1.0F, 0.0F, Class464.method29463(local15.anInt4048 * 1214995653));
											client.aClass470_52.method29560(0.0F, 0.0F, 1.0F, Class464.method29463(local15.anInt4085 * 1088282729));
											client.aClass470_52.method29568((float) (local15.anInt4082 * -1109126065), (float) (local15.anInt4033 * -1280175581), (float) (local15.anInt4050 * -252376737));
										} else {
											@Pc(2696) int local2696 = (local15.anInt4069 * -822913903 << 2) * Class464.anIntArray453[local15.anInt4047 * 1332164047 << 3] >> 14;
											@Pc(2714) int local2714 = Class464.anIntArray454[local15.anInt4047 * 1332164047 << 3] * (local15.anInt4069 * -822913903 << 2) >> 14;
											client.aClass470_52.method29625(0.0F, 0.0F, 1.0F, Class464.method29463(-(local15.anInt4085 * 1088282729) << 3));
											client.aClass470_52.method29560(0.0F, 1.0F, 0.0F, Class464.method29463(local15.anInt4048 * 1214995653 << 3));
											client.aClass470_52.method29568((float) (local15.anInt4045 * 1572745861 << 2), (float) (local2696 + (local15.anInt4083 * 1502707537 << 2) + local666), (float) (local2714 + (local15.anInt4083 * 1502707537 << 2)));
											client.aClass470_52.method29560(1.0F, 0.0F, 0.0F, Class464.method29463(local15.anInt4047 * 1332164047 << 3));
										}
										local15.method26952(Class694.aClass104_14, local1951, client.aClass470_52, client.anInt3485, (byte) -104);
										Class694.aClass104_14.method20574();
										Class694.aClass104_14.method20481(true);
										Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
										if (client.aBoolean629) {
											Class694.aClass104_14.method20472(local103, local110, local15.anInt4022 * 1215292027 + local103, local110 + local15.anInt4023 * -1490598249);
										}
										if (local15.aBoolean694) {
											client.aClass532_1.method30713((byte) -69).method33161((float) (local15.anInt4056 * -2132919023) / 256.0F, (float) (local15.anInt4057 * 1886401271) / 256.0F, (float) (local15.anInt4059 * -1994863929) / 256.0F, local15.anInt4061 * -953219075, local15.anInt4094 * -1952180663, local15.anInt4058 * 1517723581, local15.anInt4081 * -897565311, local15.anInt4062 * 1614727583, 1629336189);
										} else {
											client.aClass532_1.method30713((byte) -61).method33148(1771300554);
										}
										local1951.method6947(client.aClass470_52, null, 1);
										if (!local15.aBoolean692 && local15.aClass674_6 != null) {
											Class694.aClass104_14.method20509(local15.aClass674_6.method33282());
										}
										if (client.aBoolean629) {
											Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
										}
										Class694.aClass104_14.method20481(false);
										Class694.aClass104_14.method20478();
										Class694.aClass104_14.method20479(arg2, arg3, arg4, arg5);
										if (local15.aBoolean694) {
											client.aClass532_1.method30713((byte) 2).method33148(1683751945);
										}
										if (local15.aBoolean696) {
											Class694.aClass104_14.method20530(true);
										}
									}
								} else if (local15.anInt4012 * -158526639 == 9) {
									if (local15.aBoolean688) {
										local337 = local103;
										local344 = local15.anInt4023 * -1490598249 + local110;
										local666 = local103 + local15.anInt4022 * 1215292027;
										local920 = local110;
									} else {
										local337 = local103;
										local344 = local110;
										local666 = local15.anInt4022 * 1215292027 + local103;
										local920 = local15.anInt4023 * -1490598249 + local110;
									}
									if (local15.anInt3992 * 193078597 == 1) {
										Class694.aClass104_14.method20496(local337, local344, local666, local920, local15.anInt4034 * 969124391 | 0xFF000000, 0);
									} else {
										Class694.aClass104_14.method20500(local337, local344, local666, local920, local15.anInt4034 * 969124391 | 0xFF000000, local15.anInt3992 * 193078597, 0);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "(II)V")
	public static void method29984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(9, (long) arg0);
		local4.method21877(2145202927);
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!py;I)V")
	Class485(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		this.aClass497_122 = arg0;
		this.anInt5305 = arg1 * 1992766627;
	}

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "()Lclient!acv;")
	@Override
	public Class71 method30206() {
		return Class71.aClass71_2;
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)I")
	@Override
	public int method30201(@OriginalArg(0) int arg0) {
		return this.aClass497_122.method30273(this.anInt5305 * -1850007797, -1245046151) ? 100 : this.aClass497_122.method30238(this.anInt5305 * -1850007797, -2044307562);
	}

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "()Lclient!acv;")
	@Override
	public Class71 method30203() {
		return Class71.aClass71_2;
	}

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "()I")
	@Override
	public int method30207() {
		return this.aClass497_122.method30273(this.anInt5305 * -1850007797, 1656918069) ? 100 : this.aClass497_122.method30238(this.anInt5305 * -1850007797, -1034548745);
	}

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "()I")
	@Override
	public int method30204() {
		return this.aClass497_122.method30273(this.anInt5305 * -1850007797, -1194658621) ? 100 : this.aClass497_122.method30238(this.anInt5305 * -1850007797, -1512653900);
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "()Lclient!acv;")
	@Override
	public Class71 method30205() {
		return Class71.aClass71_2;
	}

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "(B)Lclient!acv;")
	@Override
	public Class71 method30202(@OriginalArg(0) byte arg0) {
		return Class71.aClass71_2;
	}
}
