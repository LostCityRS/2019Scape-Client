package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.net.MalformedURLException;
import java.net.URL;

@OriginalClass("client!aml")
public final class Class165_Sub12 extends Class165 {

	@OriginalMember(owner = "client!aml", name = "m", descriptor = "I")
	static final int anInt2164 = 33;

	@OriginalMember(owner = "client!aml", name = "i", descriptor = "I")
	static final int anInt2165 = 200;

	@OriginalMember(owner = "client!aml", name = "g", descriptor = "I")
	static final int anInt2166 = 100;

	@OriginalMember(owner = "client!aml", name = "kf", descriptor = "([Lclient!hx;IIIIIIIIZI)V")
	public static void method16065(@OriginalArg(0) Class327[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Class327 local15 = arg0[local7];
			if (local15 != null && (arg1 == local15.anInt4082 * 254495303 || arg1 == -1412584499 && client.aClass327_8 == local15)) {
				@Pc(70) int local70;
				if (arg8 == -1) {
					client.aRectangleArray1[client.anInt3530 * 14557067].setBounds(arg6 + local15.anInt4160 * 104389345, arg7 + local15.anInt4102 * 1332657417, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877);
					local70 = (client.anInt3530 += -2078601181) * 14557067 - 1;
				} else {
					local70 = arg8;
				}
				local15.anInt4181 = local70 * -1722573563;
				local15.anInt4088 = client.anInt3436 * -1200088107;
				if (!client.method25508(local15)) {
					if (local15.anInt4095 * -281518067 != 0) {
						Class312.method27471(local15, -506786311);
					}
					@Pc(102) int local102 = local15.anInt4160 * 104389345 + arg6;
					@Pc(109) int local109 = local15.anInt4102 * 1332657417 + arg7;
					@Pc(114) int local114 = local15.anInt4143 * -219970905;
					if (client.aBoolean735 && (client.method25326(local15).anInt1635 * 1713789767 != 0 || local15.anInt4135 * 710314345 == 0) && local114 > 127) {
						local114 = 127;
					}
					@Pc(186) int local186;
					@Pc(190) int local190;
					if (local15 == client.aClass327_8) {
						if (arg1 != -1412584499 && (Class327.anInt4076 * -679249797 == local15.anInt4159 * 2335769 || Class327.anInt4101 * -898902677 == local15.anInt4159 * 2335769 || client.method25326(local15).method14317(-2146025976) && Class327.anInt4077 * -760891495 != local15.anInt4159 * 2335769)) {
							Class667.aClass327Array5 = arg0;
							Class543.anInt5125 = arg6 * 306296297;
							Class107_Sub2.anInt865 = arg7 * 1442958517;
							continue;
						}
						if (client.aBoolean743 && client.aBoolean739) {
							local186 = Class363.aClass152_1.method14615(-1434260808);
							local190 = Class363.aClass152_1.method14598(-718385527);
							local186 -= client.anInt3441 * 1483088529;
							local190 -= client.anInt3535 * 1500197833;
							if (local186 < client.anInt3504 * 647329353) {
								local186 = client.anInt3504 * 647329353;
							}
							if (local15.anInt4103 * 1892149809 + local186 > client.anInt3504 * 647329353 + client.anInt3505 * -1211228313) {
								local186 = client.anInt3504 * 647329353 + client.anInt3505 * -1211228313 - local15.anInt4103 * 1892149809;
							}
							if (local190 < client.anInt3490 * -1221797399) {
								local190 = client.anInt3490 * -1221797399;
							}
							if (local190 + local15.anInt4104 * 1990157877 > client.anInt3490 * -1221797399 + client.anInt3434 * -156756049) {
								local190 = client.anInt3490 * -1221797399 + client.anInt3434 * -156756049 - local15.anInt4104 * 1990157877;
							}
							if (client.method25326(local15).method14317(-2065838393)) {
								Class312.method27468(local186, local190, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, -136798746);
							}
							if (Class327.anInt4077 * -760891495 != local15.anInt4159 * 2335769) {
								local102 = local186;
								local109 = local190;
							}
						}
						if (Class327.anInt4101 * -898902677 == local15.anInt4159 * 2335769) {
							local114 = 128;
						}
					}
					@Pc(325) int local325;
					@Pc(327) int local327;
					@Pc(335) int local335;
					@Pc(342) int local342;
					if (local15.anInt4135 * 710314345 == 2) {
						local186 = arg2;
						local190 = arg3;
						local325 = arg4;
						local327 = arg5;
					} else {
						local335 = local102 + local15.anInt4103 * 1892149809;
						local342 = local15.anInt4104 * 1990157877 + local109;
						if (local15.anInt4135 * 710314345 == 9) {
							local335++;
							local342++;
						}
						local186 = local102 > arg2 ? local102 : arg2;
						local190 = local109 > arg3 ? local109 : arg3;
						local325 = local335 < arg4 ? local335 : arg4;
						local327 = local342 < arg5 ? local342 : arg5;
					}
					if (local186 < local325 && local190 < local327) {
						@Pc(665) int local665;
						@Pc(716) int local716;
						@Pc(654) Class99 local654;
						@Pc(691) int local691;
						@Pc(685) int local685;
						@Pc(708) int local708;
						if (local15.anInt4095 * -281518067 != 0) {
							if (local15.anInt4095 * -281518067 == Class327.anInt4078 * 1630061879 || Class327.anInt4098 * 1624012061 == local15.anInt4095 * -281518067) {
								if (client.aBoolean737) {
									Class279.aClass102_9.method20744();
									Class110_Sub1.method7315(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, Class327.anInt4098 * 1624012061 == local15.anInt4095 * -281518067, (byte) -1);
									Class323.method27611(local70, local186, local190, local325, local327, local102, local109, -1567238135);
									Class279.aClass102_9.method20705();
									Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
									client.aBooleanArray19[local70] = true;
								}
								continue;
							}
							if (local15.anInt4095 * -281518067 == Class327.anInt4079 * -551329691 && client.anInt3541 * -1330995431 == 3) {
								if (local15.anInt4135 * 710314345 != 5 || local15.method27643(Class279.aClass102_9, 1477428010) != null) {
									Class454.method29306(Class279.aClass102_9, local15, local102, local109, -910660020);
									Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (local15.anInt4095 * -281518067 == Class327.anInt4109 * -1774300681) {
								Class493.method30276(Class279.aClass102_9, local102, local109, local15, -229615671);
								continue;
							}
							if (Class327.anInt4163 * 1889743183 == local15.anInt4095 * -281518067) {
								Class688.method36896(Class279.aClass102_9, local102, local109, local15, local15.anInt4114 * 671136973 % 64, -1446070655);
								continue;
							}
							if (Class327.anInt4080 * 2121149333 == local15.anInt4095 * -281518067) {
								if (local15.method27643(Class279.aClass102_9, 1477428010) != null) {
									Class279.aClass102_9.method20744();
									Class274.method26799(local15, local102, local109, -1606067798);
									Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (local15.anInt4095 * -281518067 == Class327.anInt4081 * -1351144893) {
								Class669.method33497(Class279.aClass102_9, local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, (byte) -48);
								client.aBooleanArray19[local70] = true;
								Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Class327.anInt4093 * 1386973995 == local15.anInt4095 * -281518067) {
								Class210.method25808(Class279.aClass102_9, local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, 1968860607);
								client.aBooleanArray19[local70] = true;
								Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Class327.anInt4100 * 84298317 == local15.anInt4095 * -281518067) {
								if (client.aBoolean715 || client.aBoolean738) {
									Class591.method31924(local102, local109, local15, -684722633);
									client.aBooleanArray19[local70] = true;
								}
								continue;
							}
							if (Class327.anInt4075 * -1005444847 == local15.anInt4095 * -281518067) {
								local654 = Class104_Sub6.method7696((byte) -55);
								if (local654 != null) {
									local342 = arg4 - arg2;
									local665 = arg5 - arg3;
									@Pc(671) float local671 = (float) local342 / (float) local665;
									@Pc(679) float local679 = (float) local654.method18218() / (float) local654.method18219();
									if (local671 < local679) {
										local685 = local342;
										local691 = (int) ((float) local342 / local679);
									} else {
										local685 = (int) (local679 * (float) local665);
										local691 = local665;
									}
									local708 = arg2 + (local342 - local685) / 2;
									local716 = arg3 + (local665 - local691) / 2;
									local654.method18228(local708, local716, local685, local691);
								}
								continue;
							}
							if (Class327.anInt4152 * 874338637 == local15.anInt4095 * -281518067) {
								if (Class380.method28557((byte) 68) && Class155.method15057(-2122687771)) {
									Class550.method31318(arg2, arg3, arg4, arg5, -1904521800);
								}
								continue;
							}
						}
						@Pc(919) int local919;
						@Pc(923) int local923;
						if (local15.anInt4135 * 710314345 == 0) {
							if (local15.anInt4095 * -281518067 == Class327.anInt4085 * 405447173) {
								Class279.aClass102_9.method20744();
								client.aClass539_1.method30904((byte) -106).method33367(client.aClass539_1, (byte) -70);
								Class279.aClass102_9.method20774(local102, local109, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
							}
							method16065(arg0, local15.anInt4087 * -2053489901, local186, local190, local325, local327, local102 - local15.anInt4110 * -1652867993, local109 - local15.anInt4111 * 458112843, local70, arg9, 2063580856);
							if (local15.aClass327Array4 != null) {
								method16065(local15.aClass327Array4, local15.anInt4087 * -2053489901, local186, local190, local325, local327, local102 - local15.anInt4110 * -1652867993, local109 - local15.anInt4111 * 458112843, local70, arg9, -549445646);
							}
							@Pc(839) Class80_Sub40 local839 = (Class80_Sub40) client.aClass24_20.method560((long) (local15.anInt4087 * -2053489901));
							if (local839 != null) {
								Class80_Sub12.method14000(local839.anInt3156 * -151091669, local186, local190, local325, local327, local102 - local15.anInt4110 * -1652867993, local109 - local15.anInt4111 * 458112843, local70, -199480599);
							}
							if (Class327.anInt4085 * 405447173 == local15.anInt4095 * -281518067) {
								if (Class279.aClass102_9.method20776()) {
									Class279.aClass102_9.method20775(local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877);
									if (client.anInt3433 * 1994758437 == 18) {
										Class138.method11537(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, 2140667149);
									}
								}
								if (client.anInt3541 * -1330995431 == 0) {
									local342 = client.anInt3482 * 1708729717;
									local665 = client.anInt3465 * 323818503;
									local919 = client.anInt3466 * -249739613;
									local923 = client.anInt3467 * 58983689;
									if (client.anInt3436 < client.anInt3464 * 1127291209) {
										@Pc(946) float local946 = (float) (client.anInt3436 - client.anInt3463 * 1756420667) * 1.0F / (float) (client.anInt3464 * 1127291209 - client.anInt3463 * 1756420667);
										local342 = (int) ((1.0F - local946) * (float) (Class605.anInt5392 * 1040890981) + (float) (client.anInt3482 * 1708729717) * local946);
										local665 = (int) ((float) (Class352.anInt4261 * -2124066439) * (1.0F - local946) + local946 * (float) (client.anInt3465 * 323818503));
										local919 = (int) ((float) (client.anInt3466 * -249739613) * local946 + (float) (Class85.anInt283 * 1745324603) * (1.0F - local946));
										local923 = (int) ((float) (Class304.anInt3975 * -1306578267) * (1.0F - local946) + (float) (client.anInt3467 * 58983689) * local946);
									}
									if (local342 > 0) {
										Class279.aClass102_9.method20716(local186, local190, local325 - local186, local327 - local190, local342 << 24 | local665 << 16 | local919 << 8 | local923, (byte) 46);
									}
								}
							}
							Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
						}
						if (client.aBooleanArray20[local70] || client.anInt3562 * -1263769733 > 1) {
							if (local15.anInt4135 * 710314345 == 3) {
								if (local114 == 0) {
									if (local15.aBoolean802) {
										Class279.aClass102_9.method20722(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, local15.anInt4114 * 671136973 | 0xFF000000, 0);
									} else {
										Class279.aClass102_9.method20818(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, local15.anInt4114 * 671136973 | 0xFF000000, 0);
									}
								} else if (local15.aBoolean802) {
									Class279.aClass102_9.method20722(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, 255 - (local114 & 0xFF) << 24 | local15.anInt4114 * 671136973 & 0xFFFFFF, 1);
								} else {
									Class279.aClass102_9.method20818(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, 255 - (local114 & 0xFF) << 24 | local15.anInt4114 * 671136973 & 0xFFFFFF, 1);
								}
							} else if (local15.anInt4135 * 710314345 == 4) {
								local335 = 255 - (local114 & 0xFF);
								if (local335 != 0) {
									@Pc(1189) Class104 local1189 = local15.method27635(Class317.aClass464_1, client.anInterface49_1, (byte) 98);
									if (local1189 != null) {
										local665 = local15.anInt4114 * 671136973;
										@Pc(1206) String local1206 = local15.aString183;
										if (local15.anInt4167 * 1052460537 != -1) {
											@Pc(1221) Class43 local1221 = (Class43) Class25.aClass41_Sub9_1.method18054(local15.anInt4167 * 1052460537, 354114838);
											local1206 = local1221.aString5;
											if (local1206 == null) {
												local1206 = "null";
											}
											if ((local1221.anInt151 * -331223913 == 1 || local15.anInt4141 * 857016887 != 1) && local15.anInt4141 * 857016887 != -1) {
												local1206 = Class90.method1870(16748608, -825593722) + local1206 + Class256.aString156 + " x" + Class9.method317(local15.anInt4141 * 857016887, (byte) 85);
											}
										}
										if (client.aClass327_10 == local15) {
											local1206 = Class60.aClass60_139.method1180(Class512.aClass719_3, -662525178);
											local665 = local15.anInt4114 * 671136973;
										}
										if (client.aBoolean746) {
											Class279.aClass102_9.method20972(local102, local109, local102 + local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877 + local109);
										}
										local335 <<= 0x18;
										if (local15.aBoolean812) {
											local1189.method7637(local1206, local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, local335 | local665, local15.aBoolean811 ? local335 : -1, local15.anInt4149 * 1280669649, local15.anInt4150 * -1409337839, client.aRandom2, Class622.anInt5488, client.anIntArray319, Class344.aClass99Array6, null, 1502123446);
										} else {
											local1189.method7627(local1206, local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, local335 | local665, local15.aBoolean811 ? local335 : -1, local15.anInt4149 * 1280669649, local15.anInt4150 * -1409337839, local15.anInt4175 * -141942121, local15.anInt4168 * -1049453043, Class344.aClass99Array6, null, null, 0, 0, (byte) -76);
										}
										if (client.aBoolean746) {
											Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
										}
									} else if (Class327.aBoolean799) {
										Class296.method26998(local15, -793993847);
									}
								}
							} else {
								@Pc(1659) int local1659;
								@Pc(1606) boolean local1606;
								if (local15.anInt4135 * 710314345 == 5) {
									if (local15.anInt4169 * 500573645 >= 0) {
										local15.method27639(Class621.aClass41_Sub7_1, Class289.aClass41_Sub8_1, 2036747717).method31294(Class279.aClass102_9, 0, local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, local15.anInt4119 * 124820395 << 3, local15.anInt4151 * -800548689 << 3, 0, 0, 895088624);
									} else {
										if (local15.anInt4167 * 1052460537 != -1) {
											@Pc(1457) Class672 local1457 = local15.aBoolean816 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null;
											local654 = Class25.aClass41_Sub9_1.method17334(Class279.aClass102_9, local15.anInt4167 * 1052460537, local15.anInt4141 * 857016887, local15.anInt4118 * -971113929, local15.anInt4096 * -449602255 | 0xFF000000, local15.anInt4134 * -555154585, local1457, 618196571);
										} else if (local15.anInt4174 * -1861131873 == -1) {
											local654 = local15.method27634(Class279.aClass102_9, (byte) 31);
										} else {
											local654 = (Class99) client.aClass243_70.method26282((long) (local15.anInt4174 * -1861131873));
											if (local654 == null && !client.aMap16.containsKey(local15.anInt4174 * -1861131873)) {
												try {
													client.aMap16.put(local15.anInt4174 * -1861131873, Class148.aClass220_2.method25897(new URL(client.aString150 + "/img/image_" + local15.anInt4174 * -1861131873 + ".png?a=" + Class303.method27111((byte) 79)), 1062839870));
												} catch (@Pc(1546) MalformedURLException local1546) {
													Class603.method32133(null, local1546, 839300151);
												}
											}
										}
										if (local654 != null) {
											local342 = local654.method18214();
											local665 = local654.method18288();
											local919 = 255 - (local114 & 0xFF);
											if (local919 != 0) {
												if (local15.anInt4114 * 671136973 == -1) {
													local923 = 16777215;
												} else {
													local923 = local15.anInt4114 * 671136973 & 0xFFFFFF;
													if (local923 == 0) {
														local923 = 16777215;
													}
												}
												local923 |= local919 << 24;
												local1606 = local923 != -1;
												if (local15.aBoolean804) {
													Class279.aClass102_9.method20972(local102, local109, local15.anInt4103 * 1892149809 + local102, local15.anInt4104 * 1990157877 + local109);
													if (local15.anInt4166 * -1038533243 != 0) {
														local691 = (local15.anInt4103 * 1892149809 + (local342 - 1)) / local342;
														local708 = (local15.anInt4104 * 1990157877 + (local665 - 1)) / local665;
														for (local716 = 0; local716 < local691; local716++) {
															for (local1659 = 0; local1659 < local708; local1659++) {
																if (local1606) {
																	local654.method18254((float) (local102 + local716 * local342) + (float) local342 / 2.0F, (float) (local109 + local1659 * local665) + (float) local665 / 2.0F, 4096, local15.anInt4166 * -1038533243, 0, local923, 1);
																} else {
																	local654.method18234((float) (local102 + local716 * local342) + (float) local342 / 2.0F, (float) (local109 + local1659 * local665) + (float) local665 / 2.0F, 4096, local15.anInt4166 * -1038533243);
																}
															}
														}
													} else if (local1606) {
														local654.method18232(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, 0, local923, 1);
													} else {
														local654.method18244(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877);
													}
													Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
												} else if (local1606) {
													if (local15.anInt4166 * -1038533243 != 0) {
														local654.method18254((float) local102 + (float) (local15.anInt4103 * 1892149809) / 2.0F, (float) local109 + (float) (local15.anInt4104 * 1990157877) / 2.0F, local15.anInt4103 * 2124615680 / local342, local15.anInt4166 * -1038533243, 0, local923, 1);
													} else if (local342 == local15.anInt4103 * 1892149809 && local15.anInt4104 * 1990157877 == local665) {
														local654.method18226(local102, local109, 0, local923, 1);
													} else {
														local654.method18229(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877, 0, local923, 1);
													}
												} else if (local15.anInt4166 * -1038533243 != 0) {
													local654.method18255((float) (local15.anInt4103 * 1892149809) / 2.0F + (float) local102, (float) (local15.anInt4104 * 1990157877) / 2.0F + (float) local109, (float) local342 / 2.0F, (float) local665 / 2.0F, local15.anInt4103 * 2124615680 / local342, local15.anInt4104 * -161263616 / local665, local15.anInt4166 * -1038533243, 1, -1, 1);
												} else if (local342 == local15.anInt4103 * 1892149809 && local665 == local15.anInt4104 * 1990157877) {
													local654.method18225(local102, local109);
												} else {
													local654.method18228(local102, local109, local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877);
												}
											}
										} else if (Class327.aBoolean799) {
											Class296.method26998(local15, -1466313185);
										}
									}
								} else if (local15.anInt4135 * 710314345 == 6) {
									Class279.aClass102_9.method20744();
									@Pc(1949) Class105 local1949 = null;
									local342 = 2048;
									if (local15.anInt4139 * -170208515 != 0) {
										local342 |= 0x80000;
									}
									local665 = 0;
									if (local15.anInt4167 * 1052460537 == -1) {
										@Pc(2042) Class120_Sub1_Sub1_Sub1_Sub2 local2042;
										if (local15.anInt4136 * -1322281851 == 3) {
											local919 = local15.anInt4122 * -589001179;
											if (local919 >= 0 && local919 < 2048) {
												local2042 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local919];
												if (local2042 != null && (client.anInt3558 * 188678613 == local919 || Class343.method27943(local2042.aString73, -1220959402) == local15.anInt4123 * -654821907)) {
													local1949 = local15.method27679(Class279.aClass102_9, local342, Class533.aClass41_Sub18_1, Class80_Sub1_Sub15.aClass41_Sub14_4, Class460.aClass41_Sub2_1, Class25.aClass41_Sub9_1, Class125.aClass41_Sub1_6, Class672.aClass134_1, Class672.aClass134_1, local15.aClass6_6, local2042.aClass672_1, -596798015);
													if (local1949 == null && Class327.aBoolean799) {
														Class296.method26998(local15, -460053862);
													}
												}
											}
										} else if (local15.anInt4136 * -1322281851 == 5) {
											local919 = local15.anInt4122 * -589001179;
											local2042 = null;
											local1606 = false;
											if (local919 >= 0 && local919 < 2048) {
												local2042 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local919];
												local1606 = local2042 != null && (local919 == client.anInt3558 * 188678613 || Class343.method27943(local2042.aString73, -1220959402) == local15.anInt4123 * -654821907);
											} else if (local919 == -1) {
												local1606 = true;
												local2042 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3;
											} else {
												@Pc(2144) Class120_Sub1_Sub1_Sub1_Sub2 local2144 = (Class120_Sub1_Sub1_Sub1_Sub2) client.aMap15.get(local919);
												if (local2144 != null && local2144.anInt2671 * 1078276675 == local919) {
													local1606 = true;
													local2042 = local2144;
												}
											}
											if (local1606 && local2042 != null && local2042.aClass672_1 != null) {
												local1949 = local2042.aClass672_1.method33540(Class279.aClass102_9, local342, Class533.aClass41_Sub18_1, Class80_Sub1_Sub15.aClass41_Sub14_4, Class460.aClass41_Sub2_1, Class25.aClass41_Sub9_1, Class672.aClass134_1, Class672.aClass134_1, local15.aClass6_6, null, null, null, 0, true, Class362.aClass651_1, -2119860907);
											}
										} else if (local15.anInt4136 * -1322281851 == 8 || local15.anInt4136 * -1322281851 == 9) {
											@Pc(2207) Class80_Sub3 local2207 = Class565.method31482(local15.anInt4122 * -589001179, false, -454474505);
											if (local2207 != null) {
												local1949 = local2207.method12768(Class279.aClass102_9, local342, local15.aClass6_6, local15.anInt4123 * -654821907, local15.anInt4136 * -1322281851 == 9, local15.aBoolean816 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, (short) 8655);
											}
										} else if (local15.aClass6_6 != null && local15.aClass6_6.method23590(-499060808)) {
											local1949 = local15.method27679(Class279.aClass102_9, local342, Class533.aClass41_Sub18_1, Class80_Sub1_Sub15.aClass41_Sub14_4, Class460.aClass41_Sub2_1, Class25.aClass41_Sub9_1, Class125.aClass41_Sub1_6, Class672.aClass134_1, Class672.aClass134_1, local15.aClass6_6, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1, -718355573);
											if (local1949 == null && Class327.aBoolean799) {
												Class296.method26998(local15, -1223679782);
											}
										} else {
											local1949 = local15.method27679(Class279.aClass102_9, local342, Class533.aClass41_Sub18_1, Class80_Sub1_Sub15.aClass41_Sub14_4, Class460.aClass41_Sub2_1, Class25.aClass41_Sub9_1, Class125.aClass41_Sub1_6, Class672.aClass134_1, Class672.aClass134_1, null, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1, -2125757051);
											if (local1949 == null && Class327.aBoolean799) {
												Class296.method26998(local15, -1048147396);
											}
										}
									} else {
										@Pc(1978) Class43 local1978 = (Class43) Class25.aClass41_Sub9_1.method18054(local15.anInt4167 * 1052460537, -933120772);
										if (local1978 != null) {
											local1978 = local1978.method906(local15.anInt4141 * 857016887, 603372394);
											local1949 = local1978.method881(Class279.aClass102_9, local342, 1, local15.aBoolean816 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, local15.aClass6_6, 0, 0, 0, 0, -1933550588);
											if (local1949 == null) {
												Class296.method26998(local15, -962492482);
											} else {
												local665 = -local1949.method7366() >> 1;
											}
										}
									}
									if (local1949 != null) {
										if (local15.anInt4139 * -170208515 != 0) {
											local1949.method7380(local15.anInt4086 * -1209815811, local15.anInt4137 * -683653269, local15.anInt4138 * 269033739, local15.anInt4139 * -170208515);
										}
										if (local15.anInt4132 * 1500868309 > 0) {
											local919 = (local15.anInt4103 * 1892149809 << 9) / (local15.anInt4132 * 1500868309);
										} else {
											local919 = 512;
										}
										if (local15.anInt4133 * -1370895713 > 0) {
											local923 = (local15.anInt4104 * 1990157877 << 9) / (local15.anInt4133 * -1370895713);
										} else {
											local923 = 512;
										}
										local685 = local102 + local15.anInt4103 * 1892149809 / 2;
										local691 = local109 + local15.anInt4104 * 1990157877 / 2;
										if (!local15.aBoolean806) {
											local685 += local919 * 317720215 * local15.anInt4128 >> 9;
											local691 += local923 * 1410919453 * local15.anInt4129 >> 9;
										}
										client.aClass471_51.method29763();
										Class279.aClass102_9.method20759(client.aClass471_51);
										@Pc(2413) Class487 local2413 = Class279.aClass102_9.method20750();
										local716 = client.aClass539_1.method30899((short) 27785);
										local1659 = client.aClass539_1.method30900(-2012640629);
										@Pc(2428) int local2428 = local1659 + local15.anInt4131 * 2069134419;
										if (local15.aBoolean807) {
											if (Class368.anInt4502 * -1583611537 == 3) {
												if (local15.aBoolean806) {
													local2413.method30092((float) local685, (float) local691, (float) local919, (float) local923, Class160.aClass121_Sub1_2.method9659(1485243573), Class160.aClass121_Sub1_2.method9652(1538125268), (float) (Class80_Sub1_Sub1.anInt254 * -255202897), (float) (Class80_Sub25.anInt1627 * 167687103), (float) (local15.anInt4131 * 2069134419));
												} else {
													local2413.method30092((float) local685, (float) local691, (float) local919, (float) local923, Class160.aClass121_Sub1_2.method9659(1485243573), Class160.aClass121_Sub1_2.method9652(-731854440), (float) (Class80_Sub1_Sub1.anInt254 * -255202897), (float) (Class80_Sub25.anInt1627 * 167687103), (float) (local15.anInt4131 * 2069134419 << 2));
												}
											} else if (local15.aBoolean806) {
												local2413.method30092((float) local685, (float) local691, (float) local919, (float) local923, (float) local716, (float) local2428, (float) (Class80_Sub1_Sub1.anInt254 * -255202897), (float) (Class80_Sub25.anInt1627 * 167687103), (float) (local15.anInt4131 * 2069134419));
											} else {
												local2413.method30092((float) local685, (float) local691, (float) local919, (float) local923, (float) local716, (float) local2428, (float) (Class80_Sub1_Sub1.anInt254 * -255202897), (float) (Class80_Sub25.anInt1627 * 167687103), (float) (local15.anInt4131 * 2069134419 << 2));
											}
										} else if (Class368.anInt4502 * -1583611537 == 3) {
											local2413.method30188((float) local685, (float) local691, (float) local919, (float) local923, Class160.aClass121_Sub1_2.method9659(1485243573), Class160.aClass121_Sub1_2.method9652(-858773753), (float) (Class80_Sub1_Sub1.anInt254 * -255202897), (float) (Class80_Sub25.anInt1627 * 167687103));
										} else {
											local2413.method30188((float) local685, (float) local691, (float) local919, (float) local923, (float) local716, (float) local2428, (float) (Class80_Sub1_Sub1.anInt254 * -255202897), (float) (Class80_Sub25.anInt1627 * 167687103));
										}
										Class279.aClass102_9.method20933(local2413);
										Class279.aClass102_9.method20714(2, 0);
										if (local15.aBoolean808) {
											Class279.aClass102_9.method20762(false);
										}
										if (local15.aBoolean806) {
											client.aClass471_52.method29769(1.0F, 0.0F, 0.0F, Class467.method29716(local15.anInt4074 * 1940765415));
											client.aClass471_52.method29774(0.0F, 1.0F, 0.0F, Class467.method29716(local15.anInt4115 * -337000325));
											client.aClass471_52.method29774(0.0F, 0.0F, 1.0F, Class467.method29716(local15.anInt4127 * 233524551));
											client.aClass471_52.method29783((float) (local15.anInt4128 * 317720215), (float) (local15.anInt4129 * 1410919453), (float) (local15.anInt4130 * -1674818461));
										} else {
											@Pc(2696) int local2696 = (local15.anInt4131 * 2069134419 << 2) * Class467.anIntArray454[local15.anInt4074 * 1940765415 << 3] >> 14;
											@Pc(2714) int local2714 = (local15.anInt4131 * 2069134419 << 2) * Class467.anIntArray453[local15.anInt4074 * 1940765415 << 3] >> 14;
											client.aClass471_52.method29769(0.0F, 0.0F, 1.0F, Class467.method29716(-(local15.anInt4127 * 233524551) << 3));
											client.aClass471_52.method29774(0.0F, 1.0F, 0.0F, Class467.method29716(local15.anInt4115 * -337000325 << 3));
											client.aClass471_52.method29783((float) (local15.anInt4124 * 1923070285 << 2), (float) (local665 + local2696 + (local15.anInt4170 * -1707388971 << 2)), (float) ((local15.anInt4170 * -1707388971 << 2) + local2714));
											client.aClass471_52.method29774(1.0F, 0.0F, 0.0F, Class467.method29716(local15.anInt4074 * 1940765415 << 3));
										}
										local15.method27638(Class279.aClass102_9, local1949, client.aClass471_52, client.anInt3436, 830012071);
										Class279.aClass102_9.method20705();
										Class279.aClass102_9.method20712(true);
										Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
										if (client.aBoolean746) {
											Class279.aClass102_9.method20972(local102, local109, local102 + local15.anInt4103 * 1892149809, local15.anInt4104 * 1990157877 + local109);
										}
										if (local15.aBoolean809) {
											client.aClass539_1.method30904((byte) -21).method33384((float) (local15.anInt4145 * 1451449313) / 256.0F, (float) (local15.anInt4097 * -537466827) / 256.0F, (float) (local15.anInt4144 * 1241967349) / 256.0F, local15.anInt4153 * -160937485, local15.anInt4140 * 1578356403, local15.anInt4125 * -1788245145, local15.anInt4142 * 300355405, local15.anInt4147 * 2119362481, (byte) -70);
										} else {
											client.aClass539_1.method30904((byte) -9).method33390(-2128919396);
										}
										local1949.method7359(client.aClass471_52, null, 1);
										if (!local15.aBoolean807 && local15.aClass658_6 != null) {
											Class279.aClass102_9.method20964(local15.aClass658_6.method33230());
										}
										if (client.aBoolean746) {
											Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
										}
										Class279.aClass102_9.method20712(false);
										Class279.aClass102_9.method20877();
										Class279.aClass102_9.method20986(arg2, arg3, arg4, arg5);
										if (local15.aBoolean809) {
											client.aClass539_1.method30904((byte) -76).method33390(-2004462484);
										}
										if (local15.aBoolean808) {
											Class279.aClass102_9.method20762(true);
										}
									}
								} else if (local15.anInt4135 * 710314345 == 9) {
									if (local15.aBoolean803) {
										local335 = local102;
										local342 = local109 + local15.anInt4104 * 1990157877;
										local665 = local15.anInt4103 * 1892149809 + local102;
										local919 = local109;
									} else {
										local335 = local102;
										local342 = local109;
										local665 = local102 + local15.anInt4103 * 1892149809;
										local919 = local109 + local15.anInt4104 * 1990157877;
									}
									if (local15.anInt4116 * 1517496545 == 1) {
										Class279.aClass102_9.method20727(local335, local342, local665, local919, local15.anInt4114 * 671136973 | 0xFF000000, 0);
									} else {
										Class279.aClass102_9.method20731(local335, local342, local665, local919, local15.anInt4114 * 671136973 | 0xFF000000, local15.anInt4116 * 1517496545, 0);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aml", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aml", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub12(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aml", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!aml", name = "a", descriptor = "(I)V")
	public void method16062(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 33 || this.anInt2398 * -229615671 > 200) {
			this.anInt2398 = this.method16949((byte) 126) * 251097721;
		}
	}

	@OriginalMember(owner = "client!aml", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 100;
	}

	@OriginalMember(owner = "client!aml", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!aml", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 100;
	}

	@OriginalMember(owner = "client!aml", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 100;
	}

	@OriginalMember(owner = "client!aml", name = "k", descriptor = "()I")
	public int method16063() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!aml", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!aml", name = "s", descriptor = "(S)I")
	public int method16064(@OriginalArg(0) short arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!aml", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}
}
