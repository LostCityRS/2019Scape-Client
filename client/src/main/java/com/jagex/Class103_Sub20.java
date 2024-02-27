package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

@OriginalClass("client!ags")
public final class Class103_Sub20 extends Class103 {

	@OriginalMember(owner = "client!ags", name = "f", descriptor = "I")
	final int anInt1009;

	@OriginalMember(owner = "client!ags", name = "e", descriptor = "I")
	final int anInt1008;

	@OriginalMember(owner = "client!ags", name = "js", descriptor = "(Lclient!ad;I)Z")
	static boolean method8554(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) BufferedSocket local3 = arg0.method1321((byte) 2);
		@Pc(6) PacketBit local6 = arg0.aPacketBit_1;
		if (local3 == null) {
			return false;
		}
		@Pc(87) int local87;
		if (arg0.aClass448_2 == null) {
			if (arg0.aBoolean34) {
				if (!local3.hasBytes(1, (byte) -9)) {
					return false;
				}
				local3.read(arg0.aPacketBit_1.data, 0, 1, -1802296177);
				arg0.anInt247 += -1388920241;
				arg0.anInt245 = 0;
				arg0.aBoolean34 = false;
			}
			local6.pos = 0;
			if (local6.method22555(-1133982098)) {
				if (!local3.hasBytes(1, (byte) -88)) {
					return false;
				}
				local3.read(arg0.aPacketBit_1.data, 1, 1, -1335422010);
				arg0.anInt247 += -1388920241;
				arg0.anInt245 = 0;
			}
			arg0.aBoolean34 = true;
			@Pc(83) Class448[] local83 = Class607.method32175(1248062461);
			local87 = local6.method22556(436158775);
			if (local87 < 0 || local87 >= local83.length) {
				throw new IOException(local87 + " " + local6.pos * -1380987821);
			}
			arg0.aClass448_2 = local83[local87];
			arg0.anInt248 = arg0.aClass448_2.anInt4886 * -2117136173;
		}
		if (arg0.anInt248 * 460106407 == -1) {
			if (!local3.hasBytes(1, (byte) 17)) {
				return false;
			}
			local3.read(local6.data, 0, 1, -2012140545);
			arg0.anInt248 = (local6.data[0] & 0xFF) * -460169961;
			arg0.anInt247 += -1388920241;
			arg0.anInt245 = 0;
		}
		if (arg0.anInt248 * 460106407 == -2) {
			if (!local3.hasBytes(2, (byte) 31)) {
				return false;
			}
			local3.read(local6.data, 0, 2, -1830336943);
			local6.pos = 0;
			arg0.anInt248 = local6.g2() * -460169961;
			arg0.anInt247 += 1517126814;
			arg0.anInt245 = 0;
		}
		if (arg0.anInt248 * 460106407 > 0) {
			if (!local3.hasBytes(arg0.anInt248 * 460106407, (byte) 115)) {
				return false;
			}
			local6.pos = 0;
			local3.read(local6.data, 0, arg0.anInt248 * 460106407, -1899761357);
			arg0.anInt247 += arg0.anInt248 * -1441450103;
			arg0.anInt245 = 0;
		}
		arg0.aClass448_1 = arg0.aClass448_4;
		arg0.aClass448_4 = arg0.aClass448_3;
		arg0.aClass448_3 = arg0.aClass448_2;
		if (Class448.aClass448_109 == arg0.aClass448_2) {
			Class504.aClass110_1 = new Class110(Class143.aClass2_Sub1_Sub2_12);
			arg0.aClass448_2 = null;
			return true;
		} else if (Class448.aClass448_112 == arg0.aClass448_2) {
			client.aClass65_15 = (Class65) Class80_Sub39.method15030(Class620.method32308(-1906554310), local6.g1(), -1563245761);
			Class266.method26657(Class238.aBoolean771, (short) 26025);
			arg0.aClass448_2 = null;
			return false;
		} else if (arg0.aClass448_2 == Class448.aClass448_116) {
			Class244.method26306(Class438.aClass438_3, -1191421693);
			arg0.aClass448_2 = null;
			return true;
		} else {
			@Pc(312) byte local312;
			if (arg0.aClass448_2 == Class448.aClass448_79) {
				if (!client.aBoolean749) {
					try {
						local312 = local6.g1b_alt3();
						local87 = local6.g4_alt3();
						client.aClass274_1.method26794(new Class273(local87), local312, -1418002572);
					} catch (@Pc(327) RuntimeException local327) {
						Class603.method32133(null, local327, 839300151);
						Class57.method1163(arg0, -1173831181);
					}
				}
				arg0.aClass448_2 = null;
				return true;
			}
			@Pc(347) int local347;
			if (arg0.aClass448_2 == Class448.aClass448_51) {
				local347 = local6.g4_alt2();
				local87 = local6.g4_alt2();
				Class672.method33564(-1724118551);
				Class625.method32507(local87, local347, -422313694);
				arg0.aClass448_2 = null;
				return true;
			}
			@Pc(378) boolean local378;
			@Pc(386) int local386;
			if (Class448.aClass448_176 == arg0.aClass448_2) {
				if (!client.aBoolean749) {
					try {
						local378 = local6.g1_alt1() == 1;
						local87 = local6.g1_alt2();
						local386 = local6.g1_alt1();
						client.aClass274_1.method26792(local386, 326461728).method26737(local87, local378, -327608357);
					} catch (@Pc(396) RuntimeException local396) {
						Class603.method32133(null, local396, 839300151);
						Class57.method1163(arg0, -1173831181);
					}
				}
				arg0.aClass448_2 = null;
				return true;
			}
			@Pc(438) int local438;
			@Pc(464) int local464;
			@Pc(568) int local568;
			@Pc(431) String local431;
			@Pc(462) boolean local462;
			@Pc(558) int local558;
			@Pc(425) boolean local425;
			@Pc(416) String local416;
			@Pc(444) boolean local444;
			@Pc(524) String local524;
			if (arg0.aClass448_2 == Class448.aClass448_7) {
				local416 = local6.gjstr();
				local425 = local6.g1() == 1;
				if (local425) {
					local431 = local6.gjstr();
				} else {
					local431 = local416;
				}
				local438 = local6.g2();
				@Pc(442) byte local442 = local6.g1b();
				local444 = false;
				if (local442 == -128) {
					local444 = true;
				}
				if (local444) {
					if (Class274.anInt3924 * -912877411 == 0) {
						arg0.aClass448_2 = null;
						return true;
					}
					local462 = false;
					for (local464 = 0; local464 < Class274.anInt3924 * -912877411 && (!Class14.aClass164Array1[local464].aString64.equals(local431) || Class14.aClass164Array1[local464].anInt2090 * 767402031 != local438); local464++) {
					}
					if (local464 < Class274.anInt3924 * -912877411) {
						while (local464 < Class274.anInt3924 * -912877411 - 1) {
							Class14.aClass164Array1[local464] = Class14.aClass164Array1[local464 + 1];
							local464++;
						}
						Class274.anInt3924 -= 1773448629;
						Class14.aClass164Array1[Class274.anInt3924 * -912877411] = null;
					}
				} else {
					local524 = local6.gjstr();
					@Pc(528) Class164 local528 = new Class164();
					local528.aString66 = local416;
					local528.aString64 = local431;
					local528.aString67 = Class635.method32821(local528.aString64, Class126.aClass91_13, -1007886132);
					local528.anInt2090 = local438 * 381920975;
					local528.aByte57 = local442;
					local528.aString65 = local524;
					for (local558 = Class274.anInt3924 * -912877411 - 1; local558 >= 0; local558--) {
						local568 = Class14.aClass164Array1[local558].aString67.compareTo(local528.aString67);
						if (local568 == 0) {
							Class14.aClass164Array1[local558].anInt2090 = local438 * 381920975;
							Class14.aClass164Array1[local558].aByte57 = local442;
							Class14.aClass164Array1[local558].aString65 = local524;
							if (local431.equals(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73)) {
								Class618.aByte157 = local442;
							}
							client.anInt3554 = client.anInt3569 * 748507435;
							arg0.aClass448_2 = null;
							return true;
						}
						if (local568 < 0) {
							break;
						}
					}
					if (Class274.anInt3924 * -912877411 >= Class14.aClass164Array1.length) {
						arg0.aClass448_2 = null;
						return true;
					}
					for (local568 = Class274.anInt3924 * -912877411 - 1; local568 > local558; local568--) {
						Class14.aClass164Array1[local568 + 1] = Class14.aClass164Array1[local568];
					}
					if (Class274.anInt3924 * -912877411 == 0) {
						Class14.aClass164Array1 = new Class164[100];
					}
					Class14.aClass164Array1[local558 + 1] = local528;
					Class274.anInt3924 += 1773448629;
					if (local431.equals(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73)) {
						Class618.aByte157 = local442;
					}
				}
				client.anInt3554 = client.anInt3569 * 748507435;
				arg0.aClass448_2 = null;
				return true;
			} else if (Class448.aClass448_69 == arg0.aClass448_2) {
				local416 = local6.gjstr();
				Class129.method20284(local416, -1689175433);
				arg0.aClass448_2 = null;
				return true;
			} else if (Class448.aClass448_168 == arg0.aClass448_2) {
				local378 = local6.g1_alt2() == 1;
				local87 = local6.g4_alt3();
				Class672.method33564(1185408106);
				Class225.method25961(local87, local378, 952380871);
				arg0.aClass448_2 = null;
				return true;
			} else {
				@Pc(736) String local736;
				if (Class448.aClass448_96 == arg0.aClass448_2) {
					local416 = local6.gjstr();
					local87 = local6.g2();
					local736 = Class610.aClass52_2.method1073(local87, 2007640500).method23051(local6, 1613198158);
					Class20_Sub4_Sub2.method23018(19, 0, local416, local416, local416, local736, null, local87, null, 318841941);
					arg0.aClass448_2 = null;
					return true;
				} else if (arg0.aClass448_2 == Class448.aClass448_34) {
					local347 = local6.g2_alt1();
					if (local347 == 65535) {
						local347 = -1;
					}
					local87 = local6.g1();
					Class490.aClass263_13.method26530(local347, local87, -1878619572);
					arg0.aClass448_2 = null;
					return true;
				} else if (Class448.aClass448_137 == arg0.aClass448_2) {
					local347 = local6.g2_alt1();
					local87 = local6.g4_alt1();
					local386 = local6.g2();
					client.aClass539_1.method30932(-1638462787).method31593(local386, local87, local347, (byte) -122);
					arg0.aClass448_2 = null;
					return true;
				} else {
					@Pc(889) int local889;
					@Pc(856) boolean local856;
					if (arg0.aClass448_2 == Class448.aClass448_13) {
						local347 = local6.g2();
						@Pc(823) Class120_Sub1_Sub1_Sub1_Sub2 local823;
						if (client.anInt3558 * 188678613 == local347) {
							local823 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3;
						} else {
							local823 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local347];
						}
						if (local823 == null) {
							arg0.aClass448_2 = null;
							return true;
						}
						local386 = local6.g2();
						@Pc(848) Class452 local848 = (Class452) Class80_Sub39.method15030(Class452.method29284(998949965), local6.g1(), -1303272491);
						local856 = (local386 & 0x8000) != 0;
						if (local823.aString73 != null && local823.aClass672_1 != null) {
							local444 = false;
							if (local848.aBoolean875) {
								if (!local856 && (client.aBoolean748 && !client.aBoolean724 || client.aBoolean733)) {
									local444 = true;
								} else if (Class123_Sub1.method9820(local823.aString73, 1865275838)) {
									local444 = true;
								}
							}
							if (!local444) {
								local889 = -1;
								if (local856) {
									local386 &= 0x7FFF;
									@Pc(899) Class453 local899 = Class102.method21129(local6, -164123217);
									local889 = local899.anInt4894 * 221296175;
									local524 = local899.aClass80_Sub1_Sub19_1.method23051(local6, 1613198158);
								} else {
									local524 = Class413.method28989(Class604.method32147(local6, 1881380882), (byte) -66);
								}
								local823.method19062(local524.trim(), local386 >> 8, local386 & 0xFF, (byte) 104);
								if (local848.aBoolean874) {
									local558 = local856 ? 17 : 1;
								} else {
									local558 = local856 ? 17 : 2;
								}
								if (local848.anInt4893 * -522818119 == -1) {
									Class20_Sub4_Sub2.method23018(local558, 0, local823.method19057(true, -394962924), local823.method19066(false, 1938786752), local823.aString75, local524, null, local889, local848, 1512536635);
								} else {
									Class20_Sub4_Sub2.method23018(local558, 0, Class6_Sub1.method23670(local848.anInt4893 * -522818119, 1306626209) + local823.method19057(true, -394962924), Class6_Sub1.method23670(local848.anInt4893 * -522818119, 1945749894) + local823.method19066(false, 1902779290), local823.aString75, local524, null, local889, local848, 359250336);
								}
							}
						}
						arg0.aClass448_2 = null;
						return true;
					} else if (arg0.aClass448_2 == Class448.aClass448_38) {
						local347 = local6.g4_alt2();
						local87 = local6.g1_alt3();
						local386 = local6.g1_alt1();
						Class450.aClass634_1.method32789(local386, 1652242655);
						Class672.aClass134_1.aClass661Array1[local386].method33313(local347, -2147171099);
						Class672.aClass134_1.aClass661Array1[local386].method33299(local87, -2115231497);
						client.anIntArray323[(client.anInt3546 += 1449653873) * -1748170095 - 1 & 0x3F] = local386;
						arg0.aClass448_2 = null;
						return true;
					} else {
						@Pc(1174) String local1174;
						@Pc(1097) Class452 local1097;
						@Pc(1125) int local1125;
						@Pc(1116) long local1116;
						@Pc(1118) boolean local1118;
						@Pc(1180) int local1180;
						@Pc(1088) long local1088;
						@Pc(1083) long local1083;
						if (Class448.aClass448_179 == arg0.aClass448_2) {
							local416 = local6.gjstr();
							local1083 = local6.g2();
							local1088 = local6.g3();
							local1097 = (Class452) Class80_Sub39.method15030(Class452.method29284(1061426815), local6.g1(), -712456834);
							local462 = local6.g1() == 1;
							local889 = local6.g2();
							local1116 = local1088 + (local1083 << 32);
							local1118 = false;
							if (Class134.aClass305_1 == null) {
								local1118 = true;
							} else {
								local1125 = 0;
								while (true) {
									if (local1125 >= 100) {
										if (local1097.aBoolean875 && Class123_Sub1.method9820(local416, 1585477481)) {
											local1118 = true;
										}
										break;
									}
									if (local1116 == client.aLongArray23[local1125]) {
										local1118 = true;
										break;
									}
									local1125++;
								}
							}
							if (!local1118) {
								client.aLongArray23[client.anInt3537 * 2124999511] = local1116;
								client.anInt3537 = (client.anInt3537 * 2124999511 + 1) % 100 * 2025795687;
								local1174 = Class610.aClass52_2.method1073(local889, 1983536901).method23051(local6, 1613198158);
								local1180 = local462 ? 23 : 25;
								if (local1097.anInt4893 * -522818119 == -1) {
									Class20_Sub4_Sub2.method23018(local1180, 0, local416, local416, local416, local1174, Class134.aClass305_1.method27141((byte) -65), local889, local1097, -739541706);
								} else {
									Class20_Sub4_Sub2.method23018(local1180, 0, Class6_Sub1.method23670(local1097.anInt4893 * -522818119, -1464366821) + local416, Class6_Sub1.method23670(local1097.anInt4893 * -522818119, 1996634160) + local416, local416, local1174, Class134.aClass305_1.method27141((byte) 2), local889, local1097, 1037294250);
								}
							}
							arg0.aClass448_2 = null;
							return true;
						} else if (Class448.aClass448_22 == arg0.aClass448_2) {
							local347 = local6.g2();
							Class490.aClass263_13.method26523(local347, (short) 13997);
							arg0.aClass448_2 = null;
							return true;
						} else if (arg0.aClass448_2 == Class448.aClass448_59) {
							Class691.anInt5781 = local6.g1_alt3() * 1974075953;
							Class434.anInt4795 = (local6.g1b_alt3() << 3) * 2012819499;
							LoginProt.anInt4803 = (local6.g1b_alt1() << 3) * -1557571403;
							arg0.aClass448_2 = null;
							return true;
						} else {
							@Pc(1302) PacketBit local1302;
							if (arg0.aClass448_2 == Class448.aClass448_91) {
								local1302 = new PacketBit(arg0.anInt248 * 460106407);
								System.arraycopy(arg0.aPacketBit_1.data, arg0.aPacketBit_1.pos * -1380987821, local1302.data, 0, arg0.anInt248 * 460106407);
								Class514.method30571(-1925354276);
								if (Class703.aClass80_Sub37_49.aClass165_Sub42_1.method16835(1829012996) == 1) {
									Class39.aClass540_1.method31039(new Class542(Class536.aClass536_7, local1302), -331631667);
								} else {
									client.aClass539_1.method30920(new Class542(Class536.aClass536_7, local1302), (byte) 9);
								}
								arg0.aClass448_2 = null;
								return false;
							}
							@Pc(1383) int local1383;
							@Pc(1394) long local1394;
							@Pc(1416) Class80_Sub27 local1416;
							@Pc(1399) Class80_Sub27 local1399;
							if (arg0.aClass448_2 == Class448.aClass448_158) {
								local347 = local6.g2();
								if (local347 == 65535) {
									local347 = -1;
								}
								local87 = local6.g4();
								local386 = local6.g2();
								if (local386 == 65535) {
									local386 = -1;
								}
								local438 = local6.g4_alt1();
								Class672.method33564(-738558793);
								for (local1383 = local347; local1383 <= local386; local1383++) {
									local1394 = (long) local1383 + ((long) local438 << 32);
									local1399 = (Class80_Sub27) client.aClass24_21.method560(local1394);
									if (local1399 != null) {
										local1416 = new Class80_Sub27(local87, local1399.anInt1636 * -909045709);
										local1399.method24395((byte) 55);
									} else if (local1383 == -1) {
										local1416 = new Class80_Sub27(local87, Class301.method27041(local438, 2073119181).aClass80_Sub27_2.anInt1636 * -909045709);
									} else {
										local1416 = new Class80_Sub27(local87, -1);
									}
									client.aClass24_21.method563(local1416, local1394);
								}
								arg0.aClass448_2 = null;
								return true;
							} else if (Class448.aClass448_145 == arg0.aClass448_2) {
								local347 = local6.g2_alt1();
								local87 = local6.g4_alt3();
								Class672.aClass134_1.aClass636_1.method32857((Class374) Class664.aClass41_Sub17_2.method18054(local347, -887210366), local87, -580166011);
								arg0.aClass448_2 = null;
								return true;
							} else if (arg0.aClass448_2 == Class448.aClass448_65) {
								if (!client.aBoolean749) {
									try {
										local347 = local6.g1();
										local87 = local6.g1_alt1();
										client.aClass274_1.method26792(local87, 326461728).method26730(local347, -602313083);
									} catch (@Pc(1497) RuntimeException local1497) {
										Class603.method32133(null, local1497, 839300151);
										Class57.method1163(arg0, -1173831181);
									}
								}
								arg0.aClass448_2 = null;
								return true;
							} else if (arg0.aClass448_2 == Class448.aClass448_71) {
								if (!client.aBoolean749) {
									try {
										local347 = local6.g1_alt2();
										client.aClass274_1.method26784(local347, (byte) 0);
									} catch (@Pc(1525) RuntimeException local1525) {
										Class603.method32133(null, local1525, 839300151);
										Class57.method1163(arg0, -1173831181);
									}
								}
								arg0.aClass448_2 = null;
								return true;
							} else if (arg0.aClass448_2 == Class448.aClass448_36) {
								local347 = local6.g4();
								local87 = local6.g4_alt1();
								Class672.method33564(491079854);
								Class80_Sub27.method14335(local347, local87, 26617763);
								arg0.aClass448_2 = null;
								return true;
							} else if (Class448.aClass448_184 == arg0.aClass448_2) {
								local347 = local6.g2_alt2();
								if (local347 == 65535) {
									local347 = -1;
								}
								Class490.aClass263_13.method26516(local347, 255, (short) 255);
								arg0.aClass448_2 = null;
								return true;
							} else if (arg0.aClass448_2 == Class448.aClass448_193) {
								Class490.aClass263_13.method26608(-392376582);
								arg0.aClass448_2 = null;
								return true;
							} else if (arg0.aClass448_2 == Class448.aClass448_55) {
								Class244.method26306(Class438.aClass438_6, -1297890773);
								arg0.aClass448_2 = null;
								return true;
							} else {
								@Pc(1641) int local1641;
								@Pc(2038) boolean local2038;
								@Pc(1745) int local1745;
								@Pc(1880) int local1880;
								@Pc(1681) int local1681;
								@Pc(1751) int local1751;
								@Pc(1675) Class626 local1675;
								if (arg0.aClass448_2 == Class448.aClass448_181) {
									local347 = local6.g1();
									local87 = local6.g1_alt2();
									local386 = local6.g2_alt2();
									local438 = local6.g2_alt1();
									if (local438 == 65535) {
										local438 = -1;
									}
									local1383 = local6.g4_alt3();
									local1641 = local6.g2_alt1();
									local464 = local87 & 0x7;
									local889 = local87 >> 3 & 0xF;
									if (local889 == 15) {
										local889 = -1;
									}
									@Pc(1667) boolean local1667 = (local87 >> 7 & 0x1) == 1;
									@Pc(1753) int local1753;
									if (local1383 >> 30 == 0) {
										@Pc(1857) Class684 local1857;
										@Pc(1875) Class261 local1875;
										@Pc(1980) int local1980;
										@Pc(1927) Class261 local1927;
										if (local1383 >> 29 != 0) {
											local568 = local1383 & 0xFFFF;
											@Pc(1819) Class80_Sub19 local1819 = (Class80_Sub19) client.aClass24_18.method560((long) local568);
											if (local1819 != null) {
												@Pc(1825) Class120_Sub1_Sub1_Sub1_Sub1 local1825 = (Class120_Sub1_Sub1_Sub1_Sub1) local1819.anObject5;
												@Pc(1830) Class561 local1830 = local1825.aClass561Array3[local347];
												if (local438 == 65535) {
													local438 = -1;
												}
												@Pc(1837) boolean local1837 = true;
												local1751 = local1830.anInt5188 * -2124314403;
												if (local438 != -1 && local1751 != -1) {
													if (local1751 == local438) {
														local1857 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(local438, 1975591149);
														if (local1857.aBoolean986 && local1857.anInt5764 * 319211597 != -1) {
															local1875 = (Class261) Class125.aClass41_Sub1_6.method18054(local1857.anInt5764 * 319211597, 1033050533);
															local1880 = local1875.anInt3897 * 746333843;
															if (local1880 == 0 || local1880 == 2) {
																local1837 = false;
															} else if (local1880 == 1) {
																local1837 = true;
															}
														}
													} else {
														local1857 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(local438, -486012191);
														@Pc(1906) Class684 local1906 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(local1751, 1107143860);
														if (local1857.anInt5764 * 319211597 != -1 && local1906.anInt5764 * 319211597 != -1) {
															local1927 = (Class261) Class125.aClass41_Sub1_6.method18054(local1857.anInt5764 * 319211597, -797246292);
															@Pc(1936) Class261 local1936 = (Class261) Class125.aClass41_Sub1_6.method18054(local1906.anInt5764 * 319211597, 1661023951);
															if (local1927.anInt3888 * 1680050639 < local1936.anInt3888 * 1680050639) {
																local1837 = false;
															}
														}
													}
												}
												if (local1837) {
													local1830.anInt5188 = local438 * 1389203317;
													local1830.anInt5189 = local1641 * 336104995;
													local1830.anInt5191 = local889 * 1344001513;
													if (local438 == -1) {
														local1830.aClass6_9.method23587(-1, -2060415981);
													} else {
														local1857 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(local438, -26472278);
														local1980 = local1857.aBoolean986 ? 0 : 2;
														if (local1667) {
															local1980 = 1;
														}
														local1830.aClass6_9.method23626(local1857.anInt5764 * 319211597, local386, local1980, false, (byte) -92);
													}
												}
											}
										} else if (local1383 >> 28 != 0) {
											local568 = local1383 & 0xFFFF;
											@Pc(2018) Class120_Sub1_Sub1_Sub1_Sub2 local2018;
											if (client.anInt3558 * 188678613 == local568) {
												local2018 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3;
											} else {
												local2018 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local568];
											}
											if (local2018 != null) {
												@Pc(2031) Class561 local2031 = local2018.aClass561Array3[local347];
												if (local438 == 65535) {
													local438 = -1;
												}
												local2038 = true;
												local1745 = local2031.anInt5188 * -2124314403;
												@Pc(2058) Class684 local2058;
												if (local438 != -1 && local1745 != -1) {
													if (local1745 == local438) {
														local2058 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(local438, 1671966709);
														if (local2058.aBoolean986 && local2058.anInt5764 * 319211597 != -1) {
															@Pc(2076) Class261 local2076 = (Class261) Class125.aClass41_Sub1_6.method18054(local2058.anInt5764 * 319211597, -535003260);
															local1980 = local2076.anInt3897 * 746333843;
															if (local1980 == 0 || local1980 == 2) {
																local2038 = false;
															} else if (local1980 == 1) {
																local2038 = true;
															}
														}
													} else {
														local2058 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(local438, 1906267670);
														local1857 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(local1745, -1435001930);
														if (local2058.anInt5764 * 319211597 != -1 && local1857.anInt5764 * 319211597 != -1) {
															local1875 = (Class261) Class125.aClass41_Sub1_6.method18054(local2058.anInt5764 * 319211597, 330988327);
															local1927 = (Class261) Class125.aClass41_Sub1_6.method18054(local1857.anInt5764 * 319211597, -560466388);
															if (local1875.anInt3888 * 1680050639 < local1927.anInt3888 * 1680050639) {
																local2038 = false;
															}
														}
													}
												}
												if (local2038) {
													local2031.anInt5188 = local438 * 1389203317;
													local2031.anInt5189 = local1641 * 336104995;
													local2031.anInt5191 = local889 * 1344001513;
													local2031.anInt5190 = local464 * 768842393;
													if (local438 == -1) {
														local2031.aClass6_9.method23587(-1, -2060415981);
													} else {
														local2058 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(local438, 603857961);
														local1753 = local2058.aBoolean986 ? 0 : 2;
														if (local1667) {
															local1753 = 1;
														}
														local2031.aClass6_9.method23626(local2058.anInt5764 * 319211597, local386, local1753, false, (byte) -54);
													}
												}
											}
										}
									} else {
										local1675 = client.aClass539_1.method30893((byte) -7);
										local1681 = local1383 >> 28 & 0x3;
										local1125 = (local1383 >> 14 & 0x3FFF) - local1675.anInt5540 * -390642507;
										local1180 = (local1383 & 0x3FFF) - local1675.anInt5537 * -894305615;
										if (local1125 >= 0 && local1180 >= 0 && local1125 < client.aClass539_1.method30921(1990221860) && local1180 < client.aClass539_1.method31011(-198798931)) {
											if (local438 == -1) {
												@Pc(1728) Class80_Sub1_Sub8 local1728 = (Class80_Sub1_Sub8) client.aClass24_19.method560((long) (local1125 << 16 | local1180));
												if (local1728 != null) {
													local1728.aClass120_Sub1_Sub1_Sub5_1.method24352((byte) -89);
													local1728.method24395((byte) 52);
												}
											} else {
												local1745 = local1125 * 512 + 256;
												local1751 = local1180 * 512 + 256;
												local1753 = local1681;
												if (local1681 < 3 && client.aClass539_1.method30903(-463929735).method30429(local1125, local1180, 2063628815)) {
													local1753 = local1681 + 1;
												}
												@Pc(1792) Class120_Sub1_Sub1_Sub5 local1792 = new Class120_Sub1_Sub1_Sub5(client.aClass539_1.method30932(-1638462787), local438, local386, local1681, local1753, local1745, Class439.method29150(local1745, local1751, local1681, 1037753497) - local1641, local1751, local1125, local1125, local1180, local1180, local464, local1667, 0);
												client.aClass24_19.method563(new Class80_Sub1_Sub8(local1792), (long) (local1125 << 16 | local1180));
											}
										}
									}
									arg0.aClass448_2 = null;
									return true;
								} else if (Class448.aClass448_192 == arg0.aClass448_2) {
									local347 = local6.g4_alt2();
									local87 = local6.g4_alt1();
									Class672.method33564(1794112140);
									Class596.method31998(local87, 2, local347, -1, 1287228757);
									arg0.aClass448_2 = null;
									return true;
								} else if (arg0.aClass448_2 == Class448.aClass448_124) {
									local347 = local6.g1_alt1();
									local87 = local6.g4_alt2();
									local386 = local6.g4();
									local438 = local6.g4_alt2();
									local1383 = local6.g4_alt2();
									local1641 = local6.g2();
									local464 = local6.g4_alt3();
									local889 = local6.g2_alt1();
									@Pc(2281) Class626 local2281 = new Class626(local6.g4());
									Class672.method33564(1797447017);
									Class79.method1430(local1383, new Class80_Sub40_Sub3(local889, local347, new Class698(local2281, local1641)), new int[] { local386, local87, local438, local464 }, false, -1718848805);
									arg0.aClass448_2 = null;
									return true;
								} else if (arg0.aClass448_2 == Class448.aClass448_147) {
									local347 = local6.g2_alt3();
									local87 = local6.g2_alt1();
									local386 = local6.g1();
									if (local386 == 255) {
										local386 = -1;
									}
									client.aClass539_1.method30932(-1638462787).method31715(local87, local386, local347, (byte) 9);
									arg0.aClass448_2 = null;
									return true;
								} else if (Class448.aClass448_140 == arg0.aClass448_2) {
									Class672.method33564(-1535941937);
									Class151.method14543(Class676.method33586(-1089518303), (byte) -6);
									arg0.aClass448_2 = null;
									return true;
								} else if (Class448.aClass448_197 == arg0.aClass448_2) {
									local347 = local6.g4();
									local87 = local6.g4();
									Class672.method33564(-131973096);
									@Pc(2391) Class327 local2391 = Class301.method27041(local87, 2053992136);
									local2391.anInt4174 = local347 * 916027999;
									arg0.aClass448_2 = null;
									return true;
								} else if (Class448.aClass448_169 == arg0.aClass448_2) {
									local347 = local6.g4_alt1();
									Class672.method33564(-265606346);
									@Pc(2418) Class80_Sub40 local2418 = (Class80_Sub40) client.aClass24_20.method560((long) local347);
									if (local2418 != null) {
										Class80_Sub42.method15605(local2418, true, false, (byte) -42);
									}
									if (client.aClass327_10 != null) {
										Class296.method26998(client.aClass327_10, 1328102054);
										client.aClass327_10 = null;
									}
									arg0.aClass448_2 = null;
									return true;
								} else if (Class448.aClass448_165 == arg0.aClass448_2) {
									local347 = local6.g2();
									local87 = local6.g2();
									Class490.aClass263_13.method26594(local347, local87, -1583611537);
									arg0.aClass448_2 = null;
									return true;
								} else if (Class448.aClass448_60 == arg0.aClass448_2) {
									local347 = local6.g2();
									local431 = local6.gjstr();
									local386 = local6.g2();
									local438 = local6.g2();
									local856 = local6.g1() == 1;
									Class194.aClass28_7 = Class47.aClass28_6;
									Class382.aBoolean851 = local856;
									Class503.method30451(local347, local431, local386, local438, -1333568038);
									local3 = null;
									Class604.method32148(19, 1217847777);
									arg0.aClass448_2 = null;
									return false;
								} else if (arg0.aClass448_2 == Class448.aClass448_27) {
									Class504.aClass110_1 = null;
									arg0.aClass448_2 = null;
									return true;
								} else if (arg0.aClass448_2 == Class448.aClass448_5) {
									client.aClass660_1 = (Class660) Class80_Sub39.method15030(Class660.method33289(-239658382), local6.g1_alt2(), -1180679101);
									if (client.aClass660_1 == null) {
										client.aClass660_1 = Class660.aClass660_3;
									}
									arg0.aClass448_2 = null;
									return true;
								} else if (arg0.aClass448_2 == Class448.aClass448_89) {
									local347 = local6.g4_alt1();
									local87 = local6.g1_alt3();
									Class672.method33564(-334962831);
									Class147_Sub5.method13540(local347, local87, (byte) 63);
									arg0.aClass448_2 = null;
									return true;
								} else if (arg0.aClass448_2 == Class448.aClass448_175) {
									if (Class504.aClass110_1 == null) {
										Class504.aClass110_1 = new Class110(Class143.aClass2_Sub1_Sub2_12);
									}
									@Pc(2584) Class460 local2584 = Class143.aClass2_Sub1_Sub2_12.method1820(local6, -1308313289);
									Class504.aClass110_1.anInterface4_2.method719(local2584.anInt4907 * -38979583, local2584.anObject19, -2135872014);
									client.anIntArray324[(client.anInt3551 += 648882881) * 2024432961 - 1 & 0x3F] = local2584.anInt4907 * -38979583;
									arg0.aClass448_2 = null;
									return true;
								} else if (arg0.aClass448_2 == Class448.aClass448_111) {
									local347 = local6.g2();
									local87 = local6.g4_alt2();
									local386 = local6.g2_alt2();
									local438 = local6.g1_alt1();
									Class672.method33564(-2118462503);
									Class165_Sub3.method15881(local87, local438, local386, local347, (byte) 40);
									arg0.aClass448_2 = null;
									return true;
								} else {
									@Pc(2662) byte local2662;
									if (Class448.aClass448_152 == arg0.aClass448_2) {
										local347 = local6.g2_alt1();
										local2662 = local6.g1b_alt1();
										Class672.method33564(-869452302);
										Class657.method33228(local347, local2662, -613689233);
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_63) {
										local1302 = new PacketBit(arg0.anInt248 * 460106407);
										System.arraycopy(arg0.aPacketBit_1.data, arg0.aPacketBit_1.pos * -1380987821, local1302.data, 0, arg0.anInt248 * 460106407);
										Class514.method30571(-1925354276);
										if (Class703.aClass80_Sub37_49.aClass165_Sub42_1.method16835(1731134748) == 1) {
											Class39.aClass540_1.method31039(new Class542(Class536.aClass536_3, local1302), -331631667);
										} else {
											client.aClass539_1.method30920(new Class542(Class536.aClass536_3, local1302), (byte) 9);
										}
										arg0.aClass448_2 = null;
										return false;
									} else if (arg0.aClass448_2 == Class448.aClass448_26) {
										local416 = local6.gjstr();
										local87 = local6.g2_alt1();
										Class672.method33564(1461292099);
										Class557.method31381(local87, local416, -2143415935);
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_164) {
										client.anInt3531 = local6.g1() * 548642029;
										client.anInt3579 = client.anInt3569 * -209044089;
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_129 == arg0.aClass448_2) {
										local378 = local6.g1_alt3() == 1;
										Class672.method33564(-1653400206);
										Class630.aBoolean958 = local378;
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_141 == arg0.aClass448_2) {
										client.anInt3577 = 1309070957;
										client.anInt3553 = client.anInt3569 * -799307175;
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_131) {
										local347 = local6.g2_alt1();
										local87 = local6.g4_alt1();
										Class672.method33564(-1705764484);
										Class165_Sub44.method16878(local347, local87, -2138742194);
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_196) {
										Class244.method26306(Class438.aClass438_2, -708083385);
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_134) {
										local347 = local6.g1();
										@Pc(2864) Class707 local2864 = (Class707) Class80_Sub39.method15030(Class634.method32805((byte) 31), local347, -1132604344);
										if (local2864 == null) {
											local2864 = Class707.aClass707_4;
										}
										Class668.method33478(local2864, (byte) 38);
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_99 == arg0.aClass448_2) {
										if (!client.aBoolean749) {
											try {
												local347 = local6.g1_alt1();
												local87 = local6.g1();
												local386 = local6.g1_alt2();
												client.aClass274_1.method26792(local347, 326461728).method26727(local386, local87, (short) -2308);
											} catch (@Pc(2904) RuntimeException local2904) {
												Class603.method32133(null, local2904, 839300151);
												Class57.method1163(arg0, -1173831181);
											}
										}
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_95 == arg0.aClass448_2) {
										local347 = local6.g2();
										Class490.aClass263_13.method26522(local347, -895344851);
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_62 == arg0.aClass448_2) {
										client.anInt3556 = client.anInt3569 * 2132747213;
										local378 = local6.g1() == 1;
										if (arg0.anInt248 * 460106407 != 1) {
											if (local378) {
												Class477.aClass80_Sub32_3 = new Class80_Sub32(local6);
											} else {
												Class144.aClass80_Sub32_2 = new Class80_Sub32(local6);
											}
											arg0.aClass448_2 = null;
											return true;
										}
										if (local378) {
											Class477.aClass80_Sub32_3 = null;
										} else {
											Class144.aClass80_Sub32_2 = null;
										}
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_84) {
										local347 = local6.g1();
										local87 = local6.g1_alt2();
										local386 = local6.g2_alt3();
										local438 = local6.g1_alt3();
										local1383 = local6.g1();
										Class672.method33564(365939634);
										client.aBooleanArray21[local87] = true;
										client.anIntArray329[local87] = local1383;
										client.anIntArray330[local87] = local347;
										client.anIntArray331[local87] = local438;
										client.anIntArray332[local87] = local386;
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_39 == arg0.aClass448_2) {
										local416 = local6.gjstr();
										local87 = local6.g4_alt2();
										Class672.method33564(244124961);
										Class103_Sub11.method7906(local87, local416, -716977597);
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_8 == arg0.aClass448_2) {
										local347 = local6.g1();
										@Pc(3077) Class711 local3077 = (Class711) Class80_Sub39.method15030(Js5ArchiveIndex.method30266(-44696562), local347, -426314753);
										if (local3077 == null) {
											local3077 = Class711.aClass711_5;
										}
										Class283.method26879(local3077, 877659578);
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_114) {
										Class165_Sub15.method16125(local6, arg0.anInt248 * 460106407, 272051615);
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_163) {
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_10 == arg0.aClass448_2) {
										for (local347 = 0; local347 < client.aClass120_Sub1_Sub1_Sub1_Sub2Array1.length; local347++) {
											if (client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local347] != null) {
												client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local347].anIntArray240 = null;
												client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local347].aClass6_3.method23587(-1, -2060415981);
											}
										}
										for (local347 = 0; local347 < client.anInt3452 * -340916049; local347++) {
											((Class120_Sub1_Sub1_Sub1) client.aClass80_Sub19Array1[local347].anObject5).anIntArray240 = null;
											((Class120_Sub1_Sub1_Sub1) client.aClass80_Sub19Array1[local347].anObject5).aClass6_3.method23587(-1, -2060415981);
										}
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_180 == arg0.aClass448_2) {
										if (Class301.method27043(client.anInt3433 * 1994758437, (byte) -119)) {
											client.anInt3584 = (int) ((float) local6.g2() * 2.5F) * 2086788281;
										} else {
											client.anInt3584 = local6.g2() * -1820861010;
										}
										client.anInt3579 = client.anInt3569 * -209044089;
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_30 == arg0.aClass448_2) {
										local347 = local6.g4();
										Class134.aClass306_1 = new Class306(local347);
										@Pc(3227) Thread local3227 = new Thread(Class134.aClass306_1);
										local3227.setPriority(1);
										local3227.start();
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_19) {
										local416 = local6.gjstr();
										local87 = local6.g2();
										if (local87 == 65535) {
											local87 = -1;
										}
										local386 = local6.g1_alt2();
										local438 = local6.g1_alt2();
										if (local386 >= 1 && local386 <= 8) {
											if (local416.equalsIgnoreCase("null")) {
												local416 = null;
											}
											client.aStringArray22[local386 - 1] = local416;
											client.anIntArray307[local386 - 1] = local87;
											client.aBooleanArray18[local386 - 1] = local438 == 0;
										}
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_155 == arg0.aClass448_2) {
										BufferedSocket.aClass121_Sub1_2.method9723(local6, arg0.anInt248 * 460106407, -387244557);
										client.anInt3555 = client.anInt3569 * -1093366769;
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_42 == arg0.aClass448_2) {
										Class244.method26306(Class438.aClass438_11, -1647131190);
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_199) {
										local347 = local6.g4_alt2();
										if (local347 != Class165_Sub45.anInt2388 * -1067447681) {
											Class165_Sub45.anInt2388 = local347 * -913197697;
											Class107.method7196(Class158.aClass158_58, -1, -1, 599131313);
										}
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_45) {
										client.anInt3557 = client.anInt3569 * -1352848945;
										if (arg0.anInt248 * 460106407 == 0) {
											Class134.aClass305_1 = null;
										} else {
											Class134.aClass305_1 = new Class305(0L, local6, true, client.anInterface27_1);
										}
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_146 == arg0.aClass448_2) {
										client.anInt3532 = local6.g2s() * -2074561463;
										client.anInt3579 = client.anInt3569 * -209044089;
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_25) {
										local347 = local6.g1_alt3();
										local87 = local6.g1_alt1();
										if (local347 == 255) {
											local347 = -1;
											local87 = -1;
										}
										Class2_Sub1_Sub2.method1854(local347, local87, (byte) -101);
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_52 == arg0.aClass448_2) {
										Class244.method26306(Class438.aClass438_10, -1006377938);
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_41 == arg0.aClass448_2) {
										local347 = local6.g2();
										if (local347 == 65535) {
											local347 = -1;
										}
										local87 = local6.g1();
										local386 = local6.g2();
										local438 = local6.g1();
										local1383 = local6.g2();
										Class490.aClass263_13.method26532(Class280.aClass280_1, local347, local87, local438, Class278.aClass278_5.method26831(1882618994), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local1383, local386, 1574608638);
										arg0.aClass448_2 = null;
										return true;
									} else if (arg0.aClass448_2 == Class448.aClass448_29) {
										local347 = local6.g2();
										Class664.method33361(local347, -1123205264);
										arg0.aClass448_2 = null;
										return true;
									} else if (Class448.aClass448_113 == arg0.aClass448_2) {
										Class27.anInt86 = local6.g1() * -1611732335;
										arg0.aClass448_2 = null;
										return true;
									} else {
										@Pc(3561) boolean local3561;
										if (Class448.aClass448_150 == arg0.aClass448_2) {
											local347 = local6.g2();
											local87 = local6.g1();
											local425 = (local87 & 0x1) != 0;
											local3561 = (local87 & 0x2) != 0;
											while (local6.pos * -1380987821 < arg0.anInt248 * 460106407) {
												local1383 = local6.gSmart1or2();
												local1641 = local6.g2();
												local464 = 0;
												@Pc(3582) Class33 local3582 = null;
												if (local1641 != 0) {
													local464 = local6.g1();
													if (local464 == 255) {
														local464 = local6.g4();
													}
													if (local3561) {
														local558 = local6.g1();
														if (local558 > 0) {
															local3582 = new Class33(Class121.aClass2_Sub1_Sub2_4);
															while (local558-- > 0) {
																@Pc(3617) Class460 local3617 = Class121.aClass2_Sub1_Sub2_4.method1820(local6, -493334426);
																local3582.method719(local3617.anInt4907 * -38979583, local3617.anObject19, -1999565457);
															}
														}
													}
												}
												Class723.method37344(local347, local1383, local1641 - 1, local464, local3582, local425, -978258055);
											}
											client.anIntArray318[(client.anInt3545 += 816246285) * -1026420539 - 1 & 0x3F] = local347;
											arg0.aClass448_2 = null;
											return true;
										} else if (arg0.aClass448_2 == Class448.aClass448_82) {
											local347 = local6.g4_alt1();
											local87 = local6.g2_alt2();
											Class672.method33564(965150700);
											Class331.method27789(local347, local87, (short) 10181);
											arg0.aClass448_2 = null;
											return true;
										} else if (Class448.aClass448_87 == arg0.aClass448_2) {
											local347 = local6.g1();
											local87 = local6.g1_alt1();
											local386 = local6.g4_alt3();
											local438 = local6.g4();
											local1383 = local438 >> 28 & 0x3;
											local1641 = local438 >> 14 & 0x3FFF;
											local464 = local438 & 0x3FFF;
											@Pc(3724) Class619 local3724 = new Class619(local6, local347, false);
											local558 = client.anIntArray306[local3724.anInt5434 * 13806191];
											local1675 = client.aClass539_1.method30893((byte) -13);
											local1641 -= local1675.anInt5540 * -390642507;
											local464 -= local1675.anInt5537 * -894305615;
											Class157.method15209(local1383, local1641, local464, local558, local3724.anInt5434 * 13806191, local3724.anInt5435 * -509515973, local3724.aClass457_90, local386, local87, (byte) 3);
											arg0.aClass448_2 = null;
											return true;
										} else if (Class448.aClass448_107 == arg0.aClass448_2) {
											local347 = local6.g2();
											local87 = local6.g2();
											local386 = local6.g2();
											Class490.aClass263_13.method26624(local347, local87, local386, -318310091);
											arg0.aClass448_2 = null;
											return true;
										} else if (Class448.aClass448_28 == arg0.aClass448_2) {
											client.anInt3554 = client.anInt3569 * 748507435;
											if (arg0.anInt248 * 460106407 == 0) {
												client.aString148 = null;
												client.aString151 = null;
												Class274.anInt3924 = 0;
												Class14.aClass164Array1 = null;
												arg0.aClass448_2 = null;
												return true;
											}
											client.aString151 = local6.gjstr();
											local378 = local6.g1() == 1;
											if (local378) {
												local6.gjstr();
											}
											client.aString148 = local6.gjstr();
											Class568.aByte151 = local6.g1b();
											local87 = local6.g1();
											if (local87 == 255) {
												arg0.aClass448_2 = null;
												return true;
											}
											Class274.anInt3924 = local87 * 1773448629;
											@Pc(3872) Class164[] local3872 = new Class164[100];
											for (local438 = 0; local438 < Class274.anInt3924 * -912877411; local438++) {
												local3872[local438] = new Class164();
												local3872[local438].aString66 = local6.gjstr();
												local378 = local6.g1() == 1;
												if (local378) {
													local3872[local438].aString64 = local6.gjstr();
												} else {
													local3872[local438].aString64 = local3872[local438].aString66;
												}
												local3872[local438].aString67 = Class635.method32821(local3872[local438].aString64, Class126.aClass91_13, 656633293);
												local3872[local438].anInt2090 = local6.g2() * 381920975;
												local3872[local438].aByte57 = local6.g1b();
												local3872[local438].aString65 = local6.gjstr();
												if (local3872[local438].aString64.equals(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73)) {
													Class618.aByte157 = local3872[local438].aByte57;
												}
											}
											local3561 = false;
											local1641 = Class274.anInt3924 * -912877411;
											while (local1641 > 0) {
												local3561 = true;
												local1641--;
												for (local464 = 0; local464 < local1641; local464++) {
													if (local3872[local464].aString67.compareTo(local3872[local464 + 1].aString67) > 0) {
														@Pc(4000) Class164 local4000 = local3872[local464];
														local3872[local464] = local3872[local464 + 1];
														local3872[local464 + 1] = local4000;
														local3561 = false;
													}
												}
												if (local3561) {
													break;
												}
											}
											Class14.aClass164Array1 = local3872;
											arg0.aClass448_2 = null;
											return true;
										} else if (arg0.aClass448_2 == Class448.aClass448_106) {
											client.aClass65_15 = (Class65) Class80_Sub39.method15030(Class620.method32308(-721346295), local6.g1(), -980213941);
											Class266.method26657(false, (short) 16055);
											arg0.aClass448_2 = null;
											return false;
										} else if (arg0.aClass448_2 == Class448.aClass448_138) {
											Class244.method26306(Class438.aClass438_9, -550560063);
											arg0.aClass448_2 = null;
											return true;
										} else if (arg0.aClass448_2 == Class448.aClass448_135) {
											client.anInt3503 = client.anInt3569 * -1271288289;
											local378 = local6.g1() == 1;
											@Pc(4083) Class387 local4083 = new Class387(local6);
											@Pc(4087) Class378 local4087;
											if (local378) {
												local4087 = Class453.aClass378_2;
											} else {
												local4087 = Class327.aClass378_1;
											}
											local4083.method28613(local4087, (byte) -123);
											arg0.aClass448_2 = null;
											return true;
										} else {
											@Pc(4133) String local4133;
											@Pc(4137) String local4137;
											@Pc(4125) boolean local4125;
											if (arg0.aClass448_2 == Class448.aClass448_14) {
												while (local6.pos * -1380987821 < arg0.anInt248 * 460106407) {
													local347 = local6.g1();
													local4125 = (local347 & 0x1) == 1;
													local736 = local6.gjstr();
													local4133 = local6.gjstr();
													local4137 = local6.gjstr();
													for (local1641 = 0; local1641 < client.anInt3519 * 227319795; local1641++) {
														@Pc(4148) Class699 local4148 = client.aClass699Array1[local1641];
														if (local4125) {
															if (local4133.equals(local4148.aString244)) {
																local4148.aString244 = local736;
																local4148.aString242 = local4133;
																local736 = null;
																break;
															}
														} else if (local736.equals(local4148.aString244)) {
															local4148.aString244 = local736;
															local4148.aString242 = local4133;
															local4148.aString243 = local4137;
															local736 = null;
															break;
														}
													}
													if (local736 != null && client.anInt3519 * 227319795 < 400) {
														@Pc(4194) Class699 local4194 = new Class699();
														client.aClass699Array1[client.anInt3519 * 227319795] = local4194;
														local4194.aString244 = local736;
														local4194.aString242 = local4133;
														local4194.aString243 = local4137;
														local4194.aBoolean992 = (local347 & 0x2) == 2;
														client.anInt3519 += 1143476539;
													}
												}
												client.anInt3553 = client.anInt3569 * -799307175;
												arg0.aClass448_2 = null;
												return true;
											} else if (arg0.aClass448_2 == Class448.aClass448_101) {
												local347 = local6.g1();
												local87 = local6.g1();
												local386 = local6.g1_alt1();
												local438 = local6.g1_alt2();
												local1383 = local6.g2() << 2;
												Class672.method33564(1211063659);
												Class106.method18207(local347, local386, local1383, local87, local438, true, (byte) 2);
												arg0.aClass448_2 = null;
												return true;
											} else if (Class448.aClass448_44 == arg0.aClass448_2) {
												if (!client.aBoolean749) {
													try {
														local347 = local6.g1_alt3();
														local87 = local6.g1_alt3();
														local386 = local6.g1();
														client.aClass274_1.method26792(local386, 326461728).method26732(local347, local87, -1908560948);
													} catch (@Pc(4303) RuntimeException local4303) {
														Class603.method32133(null, local4303, 839300151);
														Class57.method1163(arg0, -1173831181);
													}
												}
												arg0.aClass448_2 = null;
												return true;
											} else if (arg0.aClass448_2 == Class448.aClass448_64) {
												local347 = local6.g4_alt2();
												local87 = local6.g4();
												local386 = local6.g1_alt3();
												local438 = local6.g4_alt1();
												local1383 = local6.g4();
												local1641 = local6.g2_alt2();
												local464 = local6.g2();
												local889 = local6.g4();
												Class672.method33564(-1478743709);
												Class79.method1430(local438, new Class80_Sub40_Sub1(local464, local386, local1641), new int[] { local889, local347, local87, local1383 }, false, -1103343565);
												arg0.aClass448_2 = null;
												return true;
											} else {
												@Pc(4432) Class452 local4432;
												if (arg0.aClass448_2 == Class448.aClass448_93) {
													local378 = local6.g1() == 1;
													local431 = local6.gjstr();
													local736 = local431;
													if (local378) {
														local736 = local6.gjstr();
													}
													local1088 = local6.g2();
													local1394 = local6.g3();
													local4432 = (Class452) Class80_Sub39.method15030(Class452.method29284(646006611), local6.g1(), -1585643954);
													local1116 = local1394 + (local1088 << 32);
													local1118 = false;
													local1125 = 0;
													while (true) {
														if (local1125 >= 100) {
															if (local4432.aBoolean875) {
																if (client.aBoolean748 && !client.aBoolean724 || client.aBoolean733) {
																	local1118 = true;
																} else if (Class123_Sub1.method9820(local736, 1749687581)) {
																	local1118 = true;
																}
															}
															break;
														}
														if (local1116 == client.aLongArray23[local1125]) {
															local1118 = true;
															break;
														}
														local1125++;
													}
													if (!local1118) {
														client.aLongArray23[client.anInt3537 * 2124999511] = local1116;
														client.anInt3537 = (client.anInt3537 * 2124999511 + 1) % 100 * 2025795687;
														local1174 = Class413.method28989(Class604.method32147(local6, 1881380882), (byte) -32);
														local1180 = local4432.aBoolean874 ? 7 : 3;
														if (local4432.anInt4893 * -522818119 == -1) {
															Class20_Sub4_Sub2.method23018(local1180, 0, local431, local736, local431, local1174, null, -1, local4432, 1360023372);
														} else {
															Class20_Sub4_Sub2.method23018(local1180, 0, Class6_Sub1.method23670(local4432.anInt4893 * -522818119, 1750136815) + local431, Class6_Sub1.method23670(local4432.anInt4893 * -522818119, -618411961) + local736, local431, local1174, null, -1, local4432, 943834613);
														}
													}
													arg0.aClass448_2 = null;
													return true;
												} else if (arg0.aClass448_2 == Class448.aClass448_47) {
													local347 = local6.g2();
													if (local347 == 65535) {
														local347 = -1;
													}
													local87 = local6.g1();
													local386 = local6.g2();
													local438 = local6.g1();
													local1383 = local6.g2();
													local1641 = local6.g2();
													@Pc(4615) Class529 local4615 = Class490.aClass263_13.method26536(Class280.aClass280_1, Class490.aClass263_13, local347, local87, local438, Class278.aClass278_5.method26831(-1385986875), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local1383, false, 1945175877);
													if (local4615 != null) {
														Class490.aClass263_13.method26575(local4615, local1641, local386, (byte) -56);
													}
													arg0.aClass448_2 = null;
													return true;
												} else {
													@Pc(4655) long local4655;
													@Pc(4674) Class619 local4674;
													@Pc(4664) Class452 local4664;
													@Pc(4650) long local4650;
													@Pc(4672) boolean local4672;
													@Pc(4670) long local4670;
													if (arg0.aClass448_2 == Class448.aClass448_76) {
														local378 = local6.g1() == 1;
														local431 = local6.gjstr();
														local4650 = local6.g2();
														local4655 = local6.g3();
														local4664 = (Class452) Class80_Sub39.method15030(Class452.method29284(707361876), local6.g1(), -786699703);
														local4670 = local4655 + (local4650 << 32);
														local4672 = false;
														local4674 = null;
														@Pc(4680) Class80_Sub32 local4680 = local378 ? Class477.aClass80_Sub32_3 : Class144.aClass80_Sub32_2;
														if (local4680 == null) {
															local4672 = true;
														} else {
															local1125 = 0;
															while (true) {
																if (local1125 >= 100) {
																	if (local4664.aBoolean875) {
																		if (client.aBoolean748 && !client.aBoolean724 || client.aBoolean733) {
																			local4672 = true;
																		} else if (Class123_Sub1.method9820(local431, 1275438234)) {
																			local4672 = true;
																		}
																	}
																	break;
																}
																if (local4670 == client.aLongArray23[local1125]) {
																	local4672 = true;
																	break;
																}
																local1125++;
															}
														}
														if (!local4672) {
															client.aLongArray23[client.anInt3537 * 2124999511] = local4670;
															client.anInt3537 = (client.anInt3537 * 2124999511 + 1) % 100 * 2025795687;
															local1174 = Class413.method28989(Class604.method32147(local6, 1881380882), (byte) -117);
															local1180 = local378 ? 41 : 44;
															if (local4664.anInt4893 * -522818119 == -1) {
																Class20_Sub4_Sub2.method23018(local1180, 0, local431, local431, local431, local1174, local4680.aString52, -1, local4664, -659114764);
															} else {
																Class20_Sub4_Sub2.method23018(local1180, 0, Class6_Sub1.method23670(local4664.anInt4893 * -522818119, 7846554) + local431, Class6_Sub1.method23670(local4664.anInt4893 * -522818119, 232426579) + local431, local431, local1174, local4680.aString52, -1, local4664, 1409636896);
															}
														}
														arg0.aClass448_2 = null;
														return true;
													} else if (Class448.aClass448_123 == arg0.aClass448_2) {
														local347 = local6.gSmart1or2();
														local87 = local6.g4();
														local386 = local6.g1();
														local4133 = "";
														local4137 = local4133;
														if ((local386 & 0x1) != 0) {
															local4133 = local6.gjstr();
															if ((local386 & 0x2) == 0) {
																local4137 = local4133;
															} else {
																local4137 = local6.gjstr();
															}
														}
														@Pc(4854) String local4854 = local6.gjstr();
														if (local347 == 99) {
															Class294.method26961(local4854, 1455295997);
														} else if (local347 == 98) {
															Class454.method29302(local4854, -1597615270);
														} else if (local4137.equals("") || !Class123_Sub1.method9820(local4137, 1356811332)) {
															Class255.method26406(local347, local87, local4133, local4137, local4133, local4854, null, (byte) 3);
														} else {
															arg0.aClass448_2 = null;
															return true;
														}
														arg0.aClass448_2 = null;
														return true;
													} else if (Class448.aClass448_35 == arg0.aClass448_2) {
														local347 = local6.g2_alt1();
														local431 = local6.gjstr();
														Class672.method33564(-1049072054);
														Class557.method31381(local347, local431, -2143415935);
														arg0.aClass448_2 = null;
														return true;
													} else if (arg0.aClass448_2 == Class448.aClass448_171) {
														client.anInt3431 = local6.g2s_alt3() * 403412551;
														arg0.aClass448_2 = null;
														return true;
													} else if (arg0.aClass448_2 == Class448.aClass448_125) {
														Class721.method37336(local6, arg0.anInt248 * 460106407, 180633827);
														arg0.aClass448_2 = null;
														return true;
													} else if (arg0.aClass448_2 == Class448.aClass448_72) {
														local347 = local6.g4();
														local87 = local6.g2_alt3();
														Class672.method33564(302673650);
														Class657.method33228(local87, local347, -995648277);
														arg0.aClass448_2 = null;
														return true;
													} else if (Class448.aClass448_127 == arg0.aClass448_2) {
														local416 = local6.gjstr();
														local1083 = local6.g2();
														local1088 = local6.g3();
														local1097 = (Class452) Class80_Sub39.method15030(Class452.method29284(1262884321), local6.g1(), -474993275);
														local462 = local6.g1() == 1;
														local4670 = (local1083 << 32) + local1088;
														local4672 = false;
														if (Class134.aClass305_1 == null) {
															local4672 = true;
														} else {
															local1681 = 0;
															while (true) {
																if (local1681 >= 100) {
																	if (local1097.aBoolean875) {
																		if (client.aBoolean748 && !client.aBoolean724 || client.aBoolean733) {
																			local4672 = true;
																		} else if (Class123_Sub1.method9820(local416, 1757474461)) {
																			local4672 = true;
																		}
																	}
																	break;
																}
																if (local4670 == client.aLongArray23[local1681]) {
																	local4672 = true;
																	break;
																}
																local1681++;
															}
														}
														if (!local4672) {
															client.aLongArray23[client.anInt3537 * 2124999511] = local4670;
															client.anInt3537 = (client.anInt3537 * 2124999511 + 1) % 100 * 2025795687;
															@Pc(5081) String local5081 = Class413.method28989(Class604.method32147(local6, 1881380882), (byte) -24);
															local1125 = local462 ? 22 : 24;
															if (local1097.anInt4893 * -522818119 == -1) {
																Class20_Sub4_Sub2.method23018(local1125, 0, local416, local416, local416, local5081, Class134.aClass305_1.method27141((byte) -26), -1, local1097, 936130279);
															} else {
																Class20_Sub4_Sub2.method23018(local1125, 0, Class6_Sub1.method23670(local1097.anInt4893 * -522818119, -2073115147) + local416, Class6_Sub1.method23670(local1097.anInt4893 * -522818119, -180134817) + local416, local416, local5081, Class134.aClass305_1.method27141((byte) 14), -1, local1097, -461627925);
															}
														}
														arg0.aClass448_2 = null;
														return true;
													} else if (Class448.aClass448_160 == arg0.aClass448_2) {
														local347 = local6.g2_alt3();
														local2662 = local6.g1b_alt1();
														Class672.aClass134_1.aClass636_1.method32849((Class107) Class528.aClass2_Sub1_Sub1_3.method18054(local347, 502283206), local2662, 469139509);
														arg0.aClass448_2 = null;
														return true;
													} else if (Class448.aClass448_57 == arg0.aClass448_2) {
														if (!client.aBoolean749) {
															try {
																local347 = local6.g4_alt1();
																local2662 = local6.g1b_alt3();
																local386 = local6.g1_alt3();
																client.aClass274_1.method26792(local386, 326461728).method26724(local347, local2662, 1332315404);
															} catch (@Pc(5205) RuntimeException local5205) {
																Class603.method32133(null, local5205, 839300151);
																Class57.method1163(arg0, -1173831181);
															}
														}
														arg0.aClass448_2 = null;
														return true;
													} else if (Class448.aClass448_178 == arg0.aClass448_2) {
														Class434.anInt4795 = (local6.g1b_alt2() << 3) * 2012819499;
														Class691.anInt5781 = local6.g1_alt1() * 1974075953;
														LoginProt.anInt4803 = (local6.g1b_alt1() << 3) * -1557571403;
														@Pc(5247) Class626 local5247 = client.aClass539_1.method30893((byte) -49);
														for (@Pc(5252) Class80_Sub4 local5252 = (Class80_Sub4) client.aClass24_22.method580((byte) -55); local5252 != null; local5252 = (Class80_Sub4) client.aClass24_22.method566((byte) 7)) {
															local386 = (int) (local5252.aLong338 * 3209506792906532031L >> 28 & 0x3L);
															local438 = (int) (local5252.aLong338 * 3209506792906532031L & 0x3FFFL);
															local1383 = local438 - local5247.anInt5540 * -390642507;
															local1641 = (int) (local5252.aLong338 * 3209506792906532031L >> 14 & 0x3FFFL);
															local464 = local1641 - local5247.anInt5537 * -894305615;
															if (local386 == Class691.anInt5781 * -280750383 && local1383 >= LoginProt.anInt4803 * -113322595 && local1383 < LoginProt.anInt4803 * -113322595 + 8 && local464 >= Class434.anInt4795 * 1234046595 && local464 < Class434.anInt4795 * 1234046595 + 8) {
																local5252.method24395((byte) 49);
																if (local1383 >= 0 && local464 >= 0 && local1383 < client.aClass539_1.method30921(2111167440) && local464 < client.aClass539_1.method31011(51669832)) {
																	Class103_Sub23.method8700(Class691.anInt5781 * -280750383, local1383, local464, (short) -2582);
																}
															}
														}
														@Pc(5361) Class80_Sub8 local5361;
														for (local5361 = (Class80_Sub8) Class80_Sub8.aClass8_19.method247(129206984); local5361 != null; local5361 = (Class80_Sub8) Class80_Sub8.aClass8_19.method237(-2036121634)) {
															if (local5361.anInt1476 * 781975081 >= LoginProt.anInt4803 * -113322595 && local5361.anInt1476 * 781975081 < LoginProt.anInt4803 * -113322595 + 8 && local5361.anInt1473 * -1479987305 >= Class434.anInt4795 * 1234046595 && local5361.anInt1473 * -1479987305 < Class434.anInt4795 * 1234046595 + 8 && Class691.anInt5781 * -280750383 == local5361.anInt1478 * -31519745) {
																local5361.aBoolean338 = true;
															}
														}
														for (local5361 = (Class80_Sub8) Class80_Sub8.aClass8_20.method247(129206984); local5361 != null; local5361 = (Class80_Sub8) Class80_Sub8.aClass8_20.method237(-1101729569)) {
															if (local5361.anInt1476 * 781975081 >= LoginProt.anInt4803 * -113322595 && local5361.anInt1476 * 781975081 < LoginProt.anInt4803 * -113322595 + 8 && local5361.anInt1473 * -1479987305 >= Class434.anInt4795 * 1234046595 && local5361.anInt1473 * -1479987305 < Class434.anInt4795 * 1234046595 + 8 && local5361.anInt1478 * -31519745 == Class691.anInt5781 * -280750383) {
																local5361.aBoolean338 = true;
															}
														}
														arg0.aClass448_2 = null;
														return true;
													} else if (arg0.aClass448_2 == Class448.aClass448_18) {
														Class244.method26306(Class438.aClass438_8, -1134541510);
														arg0.aClass448_2 = null;
														return true;
													} else if (arg0.aClass448_2 == Class448.aClass448_90) {
														Class672.method33564(1874828139);
														Class276.method26821(-121451442);
														arg0.aClass448_2 = null;
														return true;
													} else if (Class448.aClass448_139 == arg0.aClass448_2) {
														local347 = local6.g2();
														client.anInt3432 = 1914178337;
														client.anInt3461 = local347 * -2001457723;
														client.anInt3541 = -79390126;
														Class110_Sub1.aClass480_17.method29945(client.anInt3461 * 1675806989, (byte) 1);
														Class392.method28680(1305557302);
														Class451.method29280(-600823455);
														local87 = local6.g2();
														client.anInt3495 = local87 * -1386865703;
														local386 = local6.g1();
														Class548.aPacket_16 = new Packet(local386);
														Class548.aPacket_16.pdata(local6.data, local6.pos * -1380987821, local386);
														local6.pos += local386 * 1034180571;
														arg0.aClass448_2 = null;
														return false;
													} else if (arg0.aClass448_2 == Class448.aClass448_100) {
														Class490.aClass263_13.method26518(local6.g2(), (byte) 0);
														arg0.aClass448_2 = null;
														return true;
													} else if (arg0.aClass448_2 == Class448.aClass448_132) {
														arg0.aClass448_2 = null;
														return false;
													} else if (arg0.aClass448_2 == Class448.aClass448_143) {
														local347 = local6.g4_alt1();
														local87 = local6.g2_alt3();
														Class672.method33564(1191264156);
														Class634.method32809(local347, local87, -20261742);
														arg0.aClass448_2 = null;
														return true;
													} else {
														@Pc(5672) Class452 local5672;
														@Pc(5663) long local5663;
														@Pc(5680) boolean local5680;
														@Pc(5678) long local5678;
														@Pc(5738) String local5738;
														if (Class448.aClass448_86 == arg0.aClass448_2) {
															local378 = local6.g1() == 1;
															local431 = local6.gjstr();
															local736 = local431;
															if (local378) {
																local736 = local6.gjstr();
															}
															local4133 = local6.gjstr();
															local4655 = local6.g2();
															local5663 = local6.g3();
															local5672 = (Class452) Class80_Sub39.method15030(Class452.method29284(1418324396), local6.g1(), -1874799786);
															local5678 = local5663 + (local4655 << 32);
															local5680 = false;
															local1180 = 0;
															while (true) {
																if (local1180 >= 100) {
																	if (local5672.aBoolean875) {
																		if (client.aBoolean748 && !client.aBoolean724 || client.aBoolean733) {
																			local5680 = true;
																		} else if (Class123_Sub1.method9820(local736, 1390076828)) {
																			local5680 = true;
																		}
																	}
																	break;
																}
																if (client.aLongArray23[local1180] == local5678) {
																	local5680 = true;
																	break;
																}
																local1180++;
															}
															if (!local5680) {
																client.aLongArray23[client.anInt3537 * 2124999511] = local5678;
																client.anInt3537 = (client.anInt3537 * 2124999511 + 1) % 100 * 2025795687;
																local5738 = Class413.method28989(Class604.method32147(local6, 1881380882), (byte) -55);
																if (-522818119 * local5672.anInt4893 == -1) {
																	Class20_Sub4_Sub2.method23018(9, 0, local431, local736, local431, local5738, local4133, -1, local5672, 556915794);
																} else {
																	Class20_Sub4_Sub2.method23018(9, 0, Class6_Sub1.method23670(local5672.anInt4893 * -522818119, -1920918846) + local431, Class6_Sub1.method23670(local5672.anInt4893 * -522818119, 211750150) + local736, local431, local5738, local4133, -1, local5672, -194914531);
																}
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_56) {
															local6.pos += -1107715084;
															if (local6.checkcrc()) {
																Class480.method30000(local6, local6.pos * -1380987821 - 28, -1019672615);
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_121) {
															Class244.method26306(Class438.aClass438_1, -934984178);
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_83 == arg0.aClass448_2) {
															local378 = local6.g1() == 1;
															local431 = local6.gjstr();
															local736 = local431;
															if (local378) {
																local736 = local6.gjstr();
															}
															local1088 = local6.g2();
															local1394 = local6.g3();
															local4432 = (Class452) Class80_Sub39.method15030(Class452.method29284(1750833356), local6.g1(), -1290380682);
															local558 = local6.g2();
															local5678 = (local1088 << 32) + local1394;
															local5680 = false;
															local1180 = 0;
															while (true) {
																if (local1180 >= 100) {
																	if (local4432.aBoolean875 && Class123_Sub1.method9820(local736, 1421532405)) {
																		local5680 = true;
																	}
																	break;
																}
																if (client.aLongArray23[local1180] == local5678) {
																	local5680 = true;
																	break;
																}
																local1180++;
															}
															if (!local5680) {
																client.aLongArray23[client.anInt3537 * 2124999511] = local5678;
																client.anInt3537 = (client.anInt3537 * 2124999511 + 1) % 100 * 2025795687;
																local5738 = Class610.aClass52_2.method1073(local558, 1932783826).method23051(local6, 1613198158);
																if (local4432.anInt4893 * -522818119 == -1) {
																	Class20_Sub4_Sub2.method23018(18, 0, local431, local736, local431, local5738, null, local558, local4432, 1280105977);
																} else {
																	Class20_Sub4_Sub2.method23018(18, 0, Class6_Sub1.method23670(local4432.anInt4893 * -522818119, -218498250) + local431, Class6_Sub1.method23670(local4432.anInt4893 * -522818119, -516421756) + local736, local431, local5738, null, local558, local4432, 365816834);
																}
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_136) {
															if (client.anInt3460 * 1849344509 != -1) {
																Class2_Sub1_Sub2.method1852(client.anInt3460 * 1849344509, 0, -1744267181);
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_32 == arg0.aClass448_2) {
															local312 = local6.g1b();
															Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method19052(local6, local312, 200900610);
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_153 == arg0.aClass448_2) {
															client.anInt3513 = local6.g1() * -1571748591;
															client.anInt3566 = local6.g1_alt1() * 421101571;
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_120 == arg0.aClass448_2) {
															local416 = local6.gjstr();
															Class138.method11536(local416, false, false, (byte) 75);
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_88) {
															Class244.method26306(Class438.aClass438_14, -1378144174);
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_16) {
															@Pc(6097) int[] local6097 = new int[4];
															for (local87 = 0; local87 < 4; local87++) {
																local6097[local87] = local6.g4_alt2();
															}
															local87 = local6.g2_alt1();
															local386 = local6.g1_alt3();
															@Pc(6124) Class80_Sub19 local6124 = (Class80_Sub19) client.aClass24_18.method560((long) local87);
															if (local6124 != null) {
																Class302.method27107((Class120_Sub1_Sub1_Sub1) local6124.anObject5, local6097, local386, true, -2058569628);
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_48 == arg0.aClass448_2) {
															local347 = local6.g4();
															Class672.method33564(1681019725);
															Class596.method31998(local347, 3, client.anInt3558 * 188678613, 0, 1287228757);
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_188 == arg0.aClass448_2) {
															if (!client.aBoolean749) {
																try {
																	local347 = local6.g4_alt1();
																	local2662 = local6.g1b();
																	local386 = local6.g1_alt3();
																	client.aClass274_1.method26792(local386, 326461728).method26728(local347, local2662, -1296737495);
																} catch (@Pc(6193) RuntimeException local6193) {
																	Class603.method32133(null, local6193, 839300151);
																	Class57.method1163(arg0, -1173831181);
																}
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_94) {
															local347 = local6.g4_alt3();
															if (Class123_Sub3.anInt1160 * 1481907007 != local347) {
																Class123_Sub3.anInt1160 = local347 * -1494133569;
																Class107.method7196(Class158.aClass158_53, -1, -1, -1398157941);
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_149) {
															client.anInt3556 = client.anInt3569 * 2132747213;
															local378 = local6.g1() == 1;
															@Pc(6254) Class385 local6254 = new Class385(local6);
															@Pc(6258) Class80_Sub32 local6258;
															if (local378) {
																local6258 = Class477.aClass80_Sub32_3;
															} else {
																local6258 = Class144.aClass80_Sub32_2;
															}
															local6254.method28596(local6258, (byte) 0);
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_103) {
															local347 = local6.g4();
															local87 = local6.g2();
															local386 = local6.g4_alt3();
															Class672.method33564(-543562719);
															Class596.method31998(local347, 5, local87, local386, 1287228757);
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_190 == arg0.aClass448_2) {
															client.anInt3557 = client.anInt3569 * -1352848945;
															@Pc(6314) Class284 local6314 = new Class284(local6, client.anInterface27_1);
															local6314.method26881(Class134.aClass305_1, (byte) 84);
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_97 == arg0.aClass448_2) {
															local347 = local6.g1_alt2();
															local87 = local6.g1_alt2();
															local386 = local6.g2_alt3() << 2;
															local438 = local6.g1_alt1();
															local1383 = local6.g1_alt2();
															Class672.method33564(1562170192);
															Class267.method26666(local87, local438, local386, local347, local1383, (byte) -62);
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_74 == arg0.aClass448_2) {
															Class244.method26306(Class438.aClass438_13, -2046311763);
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_66) {
															local347 = local6.g4_alt3();
															local87 = local6.g2();
															local386 = local6.g1_alt2();
															local438 = local6.g2();
															Class672.method33564(1925532039);
															Class103_Sub4.method7626(local347, local386, local87, local438, -1689052846);
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_108) {
															local347 = local6.g1();
															local347 = -local347 - 2;
															client.aMap15.remove(local347);
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_195 == arg0.aClass448_2) {
															if (!client.aBoolean749) {
																try {
																	local347 = local6.g1();
																	local87 = local6.g1_alt1();
																	local386 = local6.g1_alt1();
																	client.aClass274_1.method26792(local347, 326461728).method26734(local87, local386, null, -1615165283);
																} catch (@Pc(6462) RuntimeException local6462) {
																	Class603.method32133(null, local6462, 839300151);
																	Class57.method1163(arg0, -1173831181);
																}
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_9) {
															local312 = local6.g1b();
															local2662 = local6.g1b_alt2();
															local386 = local6.g2_alt2();
															local438 = local6.g1();
															local1383 = local6.g2s_alt2();
															local1641 = local6.g2();
															local464 = local6.g2_alt1();
															local889 = local6.g1_alt2();
															if (local889 == 255) {
																local889 = -1;
															}
															local558 = local6.g1_alt2();
															local568 = local6.g2s();
															local1681 = local6.g1_alt1();
															local1125 = local6.g2_alt2();
															local1180 = local6.g2_alt2();
															local1745 = local6.g2_alt3();
															local1751 = local6.g1_alt2() * 4;
															@Pc(6554) boolean local6554 = (local558 & 0x1) != 0;
															@Pc(6562) boolean local6562 = (local558 & 0x2) != 0;
															local1880 = local6562 ? local558 >> 2 : -1;
															if (local6562) {
																local1681 = (byte) local1681;
															} else {
																local1681 *= 4;
															}
															@Pc(6584) Class626 local6584 = client.aClass539_1.method30893((byte) -25);
															@Pc(6591) int local6591 = local464 - local6584.anInt5540 * -781285014;
															@Pc(6598) int local6598 = local386 - local6584.anInt5537 * -1788611230;
															local347 = local312 + local6591;
															local87 = local2662 + local6598;
															if (local6591 >= 0 && local6598 >= 0 && local6591 < client.aClass539_1.method30921(2045845890) * 2 && local6598 < client.aClass539_1.method30921(1940406528) * 2 && local347 >= 0 && local87 >= 0 && local347 < client.aClass539_1.method31011(-654428894) * 2 && local87 < client.aClass539_1.method31011(-719457255) * 2 && local1745 != 65535) {
																local6591 = local6591 * 256;
																local6598 = local6598 * 256;
																local347 = local347 * 256;
																local87 *= 256;
																local1681 <<= 0x2;
																local1751 <<= 0x2;
																local1125 <<= 0x2;
																Class43.method929(local1745, local1383, local568, local1880, local1681, local1751, local6591, local6598, local347, local87, local1180, local1641, local889, local1125, local6554, 0, local438, (byte) 25);
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_117) {
															Class490.aClass263_13.method26524(Class278.aClass278_3.method26831(2039466440), 426123940);
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_61 == arg0.aClass448_2) {
															Class434.anInt4795 = (local6.g1b() << 3) * 2012819499;
															LoginProt.anInt4803 = (local6.g1b() << 3) * -1557571403;
															Class691.anInt5781 = local6.g1_alt2() * 1974075953;
															while (local6.pos * -1380987821 < arg0.anInt248 * 460106407) {
																@Pc(6754) Class438 local6754 = Class277.method26827((byte) -100)[local6.g1()];
																Class244.method26306(local6754, -812817973);
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_194 == arg0.aClass448_2) {
															local347 = local6.g4();
															local87 = local6.g4_alt1();
															Class672.method33564(742954180);
															@Pc(6784) Class80_Sub40 local6784 = (Class80_Sub40) client.aClass24_20.method560((long) local87);
															@Pc(6790) Class80_Sub40 local6790 = (Class80_Sub40) client.aClass24_20.method560((long) local347);
															if (local6790 != null) {
																Class80_Sub42.method15605(local6790, local6784 == null || local6790.anInt3156 * -151091669 != local6784.anInt3156 * -151091669, false, (byte) -23);
															}
															if (local6784 != null) {
																local6784.method24395((byte) 7);
																client.aClass24_20.method563(local6784, (long) local347);
															}
															@Pc(6825) Class327 local6825 = Class301.method27041(local87, 2131006638);
															if (local6825 != null) {
																Class296.method26998(local6825, 1567990725);
															}
															local6825 = Class301.method27041(local347, 2041360766);
															if (local6825 != null) {
																Class296.method26998(local6825, -1032716356);
																Class388.method28636(Class709.aClass310Array1[local6825.anInt4087 * -2053489901 >>> 16], local6825, true, (byte) 8);
															}
															if (client.anInt3460 * 1849344509 != -1) {
																Class2_Sub1_Sub2.method1852(client.anInt3460 * 1849344509, 1, -1660961673);
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_12 == arg0.aClass448_2) {
															local416 = local6.gjstr();
															local431 = Class413.method28989(Class604.method32147(local6, 1881380882), (byte) -59);
															Class255.method26406(6, 0, local416, local416, local416, local431, null, (byte) 3);
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_37) {
															if (!client.aBoolean749) {
																try {
																	local347 = local6.g1_alt1();
																	local87 = local6.g1_alt1();
																	client.aClass274_1.method26792(local347, 326461728).method26750(local87, -1449553398);
																} catch (@Pc(6918) RuntimeException local6918) {
																	Class603.method32133(null, local6918, 839300151);
																	Class57.method1163(arg0, -1173831181);
																}
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (arg0.aClass448_2 == Class448.aClass448_118) {
															local347 = local6.g2_alt3();
															local87 = local6.g4_alt3();
															local386 = local6.g1_alt2();
															local438 = local6.g2s_alt2();
															@Pc(6956) Class80_Sub19 local6956 = (Class80_Sub19) client.aClass24_18.method560((long) local347);
															if (local6956 != null) {
																@Pc(6963) Class120_Sub1_Sub1_Sub1_Sub1 local6963 = (Class120_Sub1_Sub1_Sub1_Sub1) local6956.anObject5;
																if (local6963.aClass351_1 == null) {
																	local6963.aClass351_1 = new Class351(local6963.aClass335_1);
																}
																local6963.aClass351_1.anIntArray423[local386] = local87;
																local6963.aClass351_1.aShortArray121[local386] = (short) local438;
															}
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_75 == arg0.aClass448_2) {
															local347 = local6.g2s_alt3();
															local87 = local6.g4_alt3();
															local386 = local6.g2s_alt3();
															Class672.method33564(1753832621);
															Class616.method32290(local87, local347, local386, 1680085515);
															arg0.aClass448_2 = null;
															return true;
														} else if (Class448.aClass448_24 == arg0.aClass448_2) {
															local347 = local6.g1();
															@Pc(7035) Class710 local7035 = (Class710) Class80_Sub39.method15030(Class599.method32049(1778682369), local347, -1487882692);
															if (local7035 == null) {
																local7035 = Class710.aClass710_7;
															}
															Class680.method33638(local7035, 570331300);
															arg0.aClass448_2 = null;
															return true;
														} else {
															@Pc(7079) boolean local7079;
															if (Class448.aClass448_85 == arg0.aClass448_2) {
																local378 = local6.g1() == 1;
																local1083 = local6.g2();
																local1088 = local6.g3();
																local1394 = (local1083 << 32) + local1088;
																local7079 = false;
																@Pc(7085) Class80_Sub32 local7085 = local378 ? Class477.aClass80_Sub32_3 : Class144.aClass80_Sub32_2;
																if (local7085 == null) {
																	local7079 = true;
																} else {
																	for (local568 = 0; local568 < 100; local568++) {
																		if (client.aLongArray23[local568] == local1394) {
																			local7079 = true;
																			break;
																		}
																	}
																}
																if (!local7079) {
																	client.aLongArray23[client.anInt3537 * 2124999511] = local1394;
																	client.anInt3537 = (client.anInt3537 * 2124999511 + 1) % 100 * 2025795687;
																	@Pc(7128) String local7128 = Class604.method32147(local6, 1881380882);
																	local1681 = local378 ? 43 : 46;
																	Class20_Sub4_Sub2.method23018(local1681, 0, "", "", "", local7128, local7085.aString52, -1, null, 47002009);
																}
																arg0.aClass448_2 = null;
																return true;
															} else if (Class448.aClass448_167 == arg0.aClass448_2) {
																local347 = local6.g2_alt1();
																local87 = local6.g1_alt1();
																local425 = (local87 & 0x1) == 1;
																Class251.method26371(local347, local425, -1015199064);
																client.anIntArray318[(client.anInt3545 += 816246285) * -1026420539 - 1 & 0x3F] = local347;
																arg0.aClass448_2 = null;
																return true;
															} else {
																@Pc(7221) byte[] local7221;
																if (Class448.aClass448_157 == arg0.aClass448_2) {
																	if (Class13.aBoolean5 && Class411.aFrame2 != null) {
																		Class126.method20383(Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767), -1, -1, false, 1615516245);
																	}
																	local7221 = new byte[arg0.anInt248 * 460106407 - 1];
																	local4125 = local6.g1() == 1;
																	local6.method22557(local7221, 0, arg0.anInt248 * 460106407 - 1, -1170417853);
																	@Pc(7246) Packet local7246 = new Packet(local7221);
																	local4133 = local7246.gjstr();
																	if (local4125) {
																		local4137 = local7246.gjstr();
																		if (local4137.length() == 0) {
																			local4137 = local4133;
																		}
																		if (!client.aBoolean705 || Class450.aString209.startsWith("mac") || !Class498.method30361(local4133, 1, Class442.aClass442_10.method29196(-1285733178), (byte) 25)) {
																			Class654.method33171(local4137, true, client.aBoolean734, 967820192);
																		}
																	} else {
																		Class654.method33171(local4133, true, client.aBoolean734, 1935033712);
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_191) {
																	client.anInt3503 = client.anInt3569 * -1271288289;
																	local378 = local6.g1() == 1;
																	if (arg0.anInt248 * 460106407 != 1) {
																		if (local378) {
																			Class453.aClass378_2 = new Class378(local6);
																		} else {
																			Class327.aClass378_1 = new Class378(local6);
																		}
																		arg0.aClass448_2 = null;
																		return true;
																	}
																	if (local378) {
																		Class453.aClass378_2 = null;
																	} else {
																		Class327.aClass378_1 = null;
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_189) {
																	Class450.method29278(client.aClass539_1.anInt5099 * -1486905269, (byte) -121);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_142 == arg0.aClass448_2) {
																	Class244.method26306(Class438.aClass438_7, -1166718842);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_15) {
																	Class715.method37216(local6.gjstr(), 1495947400);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_122) {
																	local347 = local6.g1_alt3();
																	Class672.method33564(-1132823809);
																	client.anInt3473 = local347 * -1077052675;
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_73 == arg0.aClass448_2) {
																	Class244.method26306(Class438.aClass438_15, -1930786716);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_104) {
																	local347 = local6.g2_alt1();
																	local2662 = local6.g1b_alt3();
																	Class672.method33564(-1366389030);
																	Class165_Sub44.method16878(local347, local2662, -2138341835);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_170) {
																	local416 = local6.gjstr();
																	local87 = local6.g2();
																	local386 = local6.g2();
																	local438 = local6.g2();
																	Class47.aClass28_3.aString4 = local416;
																	Class47.aClass28_3.anInt89 = local87 * -465041647;
																	Class47.aClass28_3.anInt90 = local386 * 902130377;
																	Class47.aClass28_3.anInt91 = local438 * 1383435301;
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_174 == arg0.aClass448_2) {
																	local347 = local6.g2();
																	if (local347 == 65535) {
																		local347 = -1;
																	}
																	local87 = local6.g1();
																	local386 = local6.g2();
																	local438 = local6.g1();
																	local1383 = local6.g2();
																	Class490.aClass263_13.method26532(Class280.aClass280_1, local347, local87, local438, Class278.aClass278_5.method26831(-1030439272), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local1383, local386, 1699119528);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_67) {
																	local347 = local6.g4_alt2();
																	Class672.method33564(-1666461089);
																	if (local347 == -1) {
																		Class588.anInt5304 = -503779167;
																		Class130_Sub1.anInt1175 = -1464167667;
																	} else {
																		@Pc(7558) Class626 local7558 = client.aClass539_1.method30893((byte) -118);
																		local386 = local347 >> 14 & 0x3FFF;
																		local438 = local347 & 0x3FFF;
																		local386 -= local7558.anInt5540 * -390642507;
																		if (local386 < 0) {
																			local386 = 0;
																		} else if (local386 >= client.aClass539_1.method30921(1954251097)) {
																			local386 = client.aClass539_1.method30921(2086751455);
																		}
																		local438 -= local7558.anInt5537 * -894305615;
																		if (local438 < 0) {
																			local438 = 0;
																		} else if (local438 >= client.aClass539_1.method31011(129453724)) {
																			local438 = client.aClass539_1.method31011(456882692);
																		}
																		Class588.anInt5304 = ((local386 << 9) + 256) * 503779167;
																		Class130_Sub1.anInt1175 = ((local438 << 9) + 256) * 1464167667;
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_20 == arg0.aClass448_2) {
																	local347 = local6.g1();
																	local87 = local347 >> 5;
																	local386 = local347 & 0x1F;
																	if (local386 == 0) {
																		client.aClass101Array1[local87] = null;
																		arg0.aClass448_2 = null;
																		return true;
																	}
																	@Pc(7663) Class101 local7663 = new Class101();
																	local7663.anInt467 = local386 * 1188036543;
																	local7663.anInt461 = local6.g1() * 898721169;
																	if (local7663.anInt461 * -168952975 >= 0 && local7663.anInt461 * -168952975 < Class668.aClass99Array8.length) {
																		if (local7663.anInt467 * 1614016575 == 1 || local7663.anInt467 * 1614016575 == 10) {
																			local7663.anInt464 = local6.g2() * 897073377;
																			local7663.anInt469 = local6.g2() * -836391545;
																			local6.pos += -158245012;
																		} else if (local7663.anInt467 * 1614016575 >= 2 && local7663.anInt467 * 1614016575 <= 6) {
																			if (local7663.anInt467 * 1614016575 == 2) {
																				local7663.anInt466 = 1450866432;
																				local7663.anInt465 = 2096285952;
																			}
																			if (local7663.anInt467 * 1614016575 == 3) {
																				local7663.anInt466 = 0;
																				local7663.anInt465 = 2096285952;
																			}
																			if (local7663.anInt467 * 1614016575 == 4) {
																				local7663.anInt466 = -1393234432;
																				local7663.anInt465 = 2096285952;
																			}
																			if (local7663.anInt467 * 1614016575 == 5) {
																				local7663.anInt466 = 1450866432;
																				local7663.anInt465 = 0;
																			}
																			if (local7663.anInt467 * 1614016575 == 6) {
																				local7663.anInt466 = 1450866432;
																				local7663.anInt465 = -102395392;
																			}
																			local7663.anInt467 = -1918894210;
																			local7663.anInt463 = local6.g1() * 1578827381;
																			@Pc(7806) Class626 local7806 = client.aClass539_1.method30893((byte) -71);
																			local7663.anInt466 += (local6.g2() - local7806.anInt5540 * -390642507 << 9) * 1112963703;
																			local7663.anInt465 += (local6.g2() - local7806.anInt5537 * -894305615 << 9) * 1467806409;
																			local7663.anInt468 = (local6.g1() << 2) * -1365624881;
																			local7663.anInt460 = local6.g2() * -97656663;
																		}
																		local7663.anInt462 = local6.g4() * -977270999;
																		client.aClass101Array1[local87] = local7663;
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_6 == arg0.aClass448_2) {
																	@Pc(7880) Class683 local7880 = new Class683();
																	local4125 = local7880.method36712(local6, (byte) 1);
																	client.aClass539_1.method30904((byte) -95).method33380(client.aClass539_1, local4125 ? local7880 : null, local7880.method36715((byte) -118), 2071631768);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_187) {
																	local378 = local6.g1_alt2() == 1;
																	local87 = local6.g4_alt1();
																	Class672.method33564(-227077294);
																	Class608.method32189(local87, local378, -805067019);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_159 == arg0.aClass448_2) {
																	local416 = local6.gjstr();
																	@Pc(7947) Object[] local7947 = new Object[local416.length() + 1];
																	for (local386 = local416.length() - 1; local386 >= 0; local386--) {
																		if (local416.charAt(local386) == 's') {
																			local7947[local386 + 1] = local6.gjstr();
																		} else {
																			local7947[local386 + 1] = Integer.valueOf(local6.g4());
																		}
																	}
																	local7947[0] = Integer.valueOf(local6.g4());
																	Class672.method33564(-1405472661);
																	@Pc(7997) Class80_Sub42 local7997 = new Class80_Sub42();
																	local7997.anObjectArray4 = local7947;
																	Class279.method26847(local7997, -927172750);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_128) {
																	local347 = local6.g4();
																	local87 = local6.g4();
																	@Pc(8026) Class80_Sub31 local8026 = Class623.method32440(Class443.aClass443_101, arg0.aClass22_1, -191270971);
																	local8026.aPacketBit_2.p4_alt3(local347);
																	local8026.aPacketBit_2.p4(local87);
																	local8026.aPacketBit_2.p1_alt3(client.anInt3413 * -1936589983);
																	arg0.method1325(local8026, (byte) -115);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_58 == arg0.aClass448_2) {
																	local347 = local6.g2();
																	if (local347 == 65535) {
																		local347 = -1;
																	}
																	local87 = local6.g1();
																	Class490.aClass263_13.method26548(local347, local87, 411021004);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_162) {
																	client.anInt3483 = client.anInt3569 * -1797416603;
																	local347 = local6.pos * -1380987821;
																	local87 = local6.g2();
																	local425 = local6.g1() == 1;
																	@Pc(8110) Class302 local8110 = Class134.aClass305_1.method27140(local87, 2014234143);
																	@Pc(8114) Class33 local8114 = local8110.method27102(931314959);
																	if (local8114 == null || local425) {
																		local8110.method27060(client.anInterface27_1, (byte) 101);
																		local8114 = local8110.method27102(1323885166);
																	}
																	while (arg0.anInt248 * 460106407 - (local6.pos * -1380987821 - local347) > 0) {
																		@Pc(8144) Class460 local8144 = Class528.aClass2_Sub1_Sub1_3.method1820(local6, -1009356885);
																		local8114.method719(local8144.anInt4907 * -38979583, local8144.anObject19, -1973165639);
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_133 == arg0.aClass448_2) {
																	local347 = local6.g2_alt3();
																	local87 = local6.g4_alt2();
																	local386 = local6.g2();
																	local438 = local6.g2_alt3();
																	Class672.method33564(1715627488);
																	Class596.method31998(local87, 7, local347 << 16 | local438, local386, 1287228757);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_70) {
																	Class244.method26306(Class438.aClass438_5, -1346879471);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_92 == arg0.aClass448_2) {
																	local378 = local6.g1() == 1;
																	local431 = local6.gjstr();
																	local4650 = local6.g2();
																	local4655 = local6.g3();
																	local4664 = (Class452) Class80_Sub39.method15030(Class452.method29284(1485317156), local6.g1(), -1029837582);
																	local889 = local6.g2();
																	local1116 = (local4650 << 32) + local4655;
																	local1118 = false;
																	local1174 = null;
																	@Pc(8265) Class80_Sub32 local8265 = local378 ? Class477.aClass80_Sub32_3 : Class144.aClass80_Sub32_2;
																	if (local8265 == null) {
																		local1118 = true;
																	} else {
																		local1180 = 0;
																		while (true) {
																			if (local1180 >= 100) {
																				if (local4664.aBoolean875 && Class123_Sub1.method9820(local431, 1758853267)) {
																					local1118 = true;
																				}
																				break;
																			}
																			if (client.aLongArray23[local1180] == local1116) {
																				local1118 = true;
																				break;
																			}
																			local1180++;
																		}
																	}
																	if (!local1118) {
																		client.aLongArray23[client.anInt3537 * 2124999511] = local1116;
																		client.anInt3537 = (client.anInt3537 * 2124999511 + 1) % 100 * 2025795687;
																		local5738 = Class610.aClass52_2.method1073(local889, 2069097827).method23051(local6, 1613198158);
																		local1745 = local378 ? 42 : 45;
																		if (local4664.anInt4893 * -522818119 == -1) {
																			Class20_Sub4_Sub2.method23018(local1745, 0, local431, local431, local431, local5738, local8265.aString52, local889, local4664, 893529508);
																		} else {
																			Class20_Sub4_Sub2.method23018(local1745, 0, Class6_Sub1.method23670(local4664.anInt4893 * -522818119, 1111550360) + local431, Class6_Sub1.method23670(local4664.anInt4893 * -522818119, 600789702) + local431, local431, local5738, local8265.aString52, local889, local4664, 1048852329);
																		}
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_40) {
																	local347 = local6.g4_alt1();
																	local87 = local6.g4_alt3();
																	local386 = local6.g4_alt2();
																	local438 = local6.g4();
																	local6.g1_alt2();
																	local1383 = local6.g2();
																	Class672.method33564(1090208984);
																	@Pc(8437) int[] local8437 = new int[] { local438, local347, local386, local87 };
																	client.anInt3460 = local1383 * 458761045;
																	Class682.method36706(local1383, local8437, 16711935);
																	Class144_Sub1.method12033(false, 914798691);
																	Class367.method28283(client.anInt3460 * 1849344509, local8437, -652958080);
																	for (local464 = 0; local464 < 106; local464++) {
																		client.aBooleanArray19[local464] = true;
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_161 == arg0.aClass448_2) {
																	local347 = local6.g4_alt1();
																	local87 = local6.g2_alt3();
																	if (local87 == 65535) {
																		local87 = -1;
																	}
																	local386 = local6.g4_alt3();
																	Class672.method33564(-895964571);
																	Class345.method27960(local347, local87, local386, (short) -18112);
																	@Pc(8505) Class43 local8505 = (Class43) Class25.aClass41_Sub9_1.method18054(local87, -1022752449);
																	Class208.method25013(local347, local8505.anInt130 * 1761959979, local8505.anInt119 * 1233464975, local8505.anInt126 * -1838057521, 1498014592);
																	Class123.method20528(local347, local8505.anInt120 * -634110839, local8505.anInt132 * -1971124657, local8505.anInt162 * 75572707, 1824527403);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_172) {
																	local347 = local6.g4();
																	local87 = local6.g2_alt2();
																	local386 = local6.g4_alt3();
																	local438 = local6.g4_alt2();
																	local1383 = local6.g4_alt1();
																	local1641 = local6.g4_alt3();
																	local464 = local6.g1_alt2();
																	local889 = local6.g2_alt2();
																	Class672.method33564(1742908315);
																	Class79.method1430(local1641, new Class80_Sub40_Sub2(local889, local464, local87), new int[] { local347, local1383, local438, local386 }, false, -1111035083);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_115 == arg0.aClass448_2) {
																	local347 = local6.g2();
																	local87 = local6.g4_alt1();
																	local386 = local6.g2();
																	local438 = local6.g2();
																	Class672.method33564(1929540975);
																	Class208.method25013(local87, local386, local347, local438, 140632689);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_198 == arg0.aClass448_2) {
																	Class244.method26306(Class438.aClass438_12, -694260278);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_33) {
																	local347 = local6.g1();
																	local87 = local6.g1();
																	if (local6.g1() == 0) {
																		client.aClass533ArrayArray1[local347][local87] = new Class533();
																	} else {
																		local6.pos -= 1034180571;
																		client.aClass533ArrayArray1[local347][local87] = new Class533(local6, null);
																	}
																	client.anInt3547 = client.anInt3569 * 753064563;
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_11 == arg0.aClass448_2) {
																	local347 = local6.g2();
																	local87 = local6.g1();
																	local425 = (local87 & 0x1) != 0;
																	local3561 = (local87 & 0x2) != 0;
																	Class65.method1234(local347, local425, (byte) 99);
																	local1383 = local6.g2();
																	for (local1641 = 0; local1641 < local1383; local1641++) {
																		local464 = local6.g2();
																		local889 = local6.g1();
																		if (local889 == 255) {
																			local889 = local6.g4();
																		}
																		@Pc(8767) Class33 local8767 = null;
																		if (local3561) {
																			local568 = local6.g1();
																			if (local568 > 0) {
																				local8767 = new Class33(Class121.aClass2_Sub1_Sub2_4);
																				while (local568-- > 0) {
																					@Pc(8788) Class460 local8788 = Class121.aClass2_Sub1_Sub2_4.method1820(local6, 109635355);
																					local8767.method719(local8788.anInt4907 * -38979583, local8788.anObject19, -2115634207);
																				}
																			}
																		}
																		Class723.method37344(local347, local1641, local464 - 1, local889, local8767, local425, -685891922);
																	}
																	client.anIntArray318[(client.anInt3545 += 816246285) * -1026420539 - 1 & 0x3F] = local347;
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_17) {
																	local347 = local6.g2();
																	local87 = local6.g2();
																	local386 = local6.g2();
																	Class672.method33564(1136185339);
																	if (Class709.aClass310Array1[local347] != null) {
																		for (local438 = local87; local438 < local386; local438++) {
																			local1383 = local6.g3();
																			if (local438 < Class709.aClass310Array1[local347].aClass327Array2.length && Class709.aClass310Array1[local347].aClass327Array2[local438] != null) {
																				Class709.aClass310Array1[local347].aClass327Array2[local438].anInt4092 = local1383 * 1824692343;
																			}
																		}
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_43 == arg0.aClass448_2) {
																	local347 = local6.g4_alt3();
																	local87 = local6.g1_alt2();
																	local386 = local6.g4_alt1();
																	local438 = local6.g4();
																	local1383 = local6.g2_alt1();
																	local1641 = local6.g4();
																	local464 = local6.g4_alt1();
																	Class672.method33564(-1446343228);
																	Class79.method1430(local347, new Class80_Sub40(local1383, local87), new int[] { local1641, local386, local464, local438 }, false, -1518845806);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_31 == arg0.aClass448_2) {
																	local378 = local6.g1() == 1;
																	if (local378) {
																		Class151.method14543(3, (byte) -85);
																	} else {
																		Class151.method14543(2, (byte) -59);
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_166) {
																	local347 = local6.g1();
																	@Pc(9004) Class713 local9004 = (Class713) Class80_Sub39.method15030(Class649.method33116((short) 32767), local347, -417465891);
																	if (local9004 == null) {
																		local9004 = Class713.aClass713_4;
																	}
																	Class108_Sub1.method23910(local9004, 1070737243);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_53 == arg0.aClass448_2) {
																	local347 = local6.g4();
																	local87 = local6.g2();
																	Class672.aClass134_1.aClass636_1.method32849((Class107) Class528.aClass2_Sub1_Sub1_3.method18054(local87, 1878678510), local347, 469139509);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_46 == arg0.aClass448_2) {
																	local347 = local6.g2();
																	local87 = local6.g2_alt2();
																	Class672.method33564(-1404899166);
																	Class420.method29012(local347, local87, 0, 1512013710);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_77) {
																	Class125_Sub2.aClass11_5 = Class183.method24699(local6.g1(), 1276738139);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_151) {
																	Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method7301(116036234);
																	arg0.aClass448_2 = null;
																	return false;
																} else if (arg0.aClass448_2 == Class448.aClass448_144) {
																	client.aClass660_2 = (Class660) Class80_Sub39.method15030(Class660.method33289(-1478007304), local6.g1_alt2(), -1741236089);
																	if (client.aClass660_2 == null) {
																		client.aClass660_2 = Class660.aClass660_3;
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_102 == arg0.aClass448_2) {
																	Class672.aClass134_1.aClass636_1.method32852((byte) 16);
																	client.anInt3544 += -607117888;
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_182 == arg0.aClass448_2) {
																	local347 = local6.g2();
																	local87 = local6.g2();
																	if (local87 == 65535) {
																		local87 = -1;
																	}
																	local386 = local6.g2_alt1();
																	if (local386 == 65535) {
																		local386 = -1;
																	}
																	local438 = local6.g4();
																	Class672.method33564(1301296882);
																	for (local1383 = local87; local1383 <= local386; local1383++) {
																		local1394 = (long) local1383 + ((long) local438 << 32);
																		local1399 = (Class80_Sub27) client.aClass24_21.method560(local1394);
																		if (local1399 != null) {
																			local1416 = new Class80_Sub27(local1399.anInt1635 * 1713789767, local347);
																			local1399.method24395((byte) 90);
																		} else if (local1383 == -1) {
																			local1416 = new Class80_Sub27(Class301.method27041(local438, 2090507924).aClass80_Sub27_2.anInt1635 * 1713789767, local347);
																		} else {
																			local1416 = new Class80_Sub27(0, local347);
																		}
																		client.aClass24_21.method563(local1416, local1394);
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_185 == arg0.aClass448_2) {
																	local347 = local6.g4_alt3();
																	local87 = local6.g4();
																	local386 = local6.g2_alt3();
																	Class672.method33564(-1137879898);
																	Class596.method31998(local347, 3, local386, local87, 1287228757);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_156 == arg0.aClass448_2) {
																	Class71_Sub1.method18186(1564849855);
																	arg0.aClass448_2 = null;
																	return false;
																} else if (Class448.aClass448_50 == arg0.aClass448_2) {
																	while (local6.pos * -1380987821 < arg0.anInt248 * 460106407) {
																		local378 = local6.g1() == 1;
																		local431 = local6.gjstr();
																		local736 = local6.gjstr();
																		local438 = local6.g2();
																		local1383 = local6.g1();
																		local1641 = local6.g1();
																		local462 = (local1641 & 0x2) != 0;
																		local7079 = (local1641 & 0x1) != 0;
																		@Pc(9337) String local9337 = "";
																		local568 = -1;
																		local1681 = 0;
																		if (local438 > 0) {
																			local9337 = local6.gjstr();
																			local568 = local6.g1();
																			local1681 = local6.g4();
																		}
																		local1174 = local6.gjstr();
																		for (local1180 = 0; local1180 < client.anInt3573 * 975306769; local1180++) {
																			@Pc(9370) Class676 local9370 = client.aClass676Array1[local1180];
																			if (local378) {
																				if (local736.equals(local9370.aString236)) {
																					local9370.aString236 = local431;
																					local9370.aString237 = local736;
																					local431 = null;
																					break;
																				}
																			} else if (local431.equals(local9370.aString236)) {
																				if (local9370.anInt5740 * 922507867 != local438) {
																					@Pc(9385) boolean local9385 = true;
																					for (@Pc(9390) Class147_Sub6 local9390 = (Class147_Sub6) client.aClass5_6.method93((byte) -102); local9390 != null; local9390 = (Class147_Sub6) client.aClass5_6.method110(-1499011106)) {
																						if (local9390.aString46.equals(local431)) {
																							if (local438 != 0 && local9390.aShort49 == 0) {
																								local9390.method23926(1812226900);
																								local9385 = false;
																							} else if (local438 == 0 && local9390.aShort49 != 0) {
																								local9390.method23926(1658175573);
																								local9385 = false;
																							}
																						}
																					}
																					if (local9385) {
																						client.aClass5_6.method90(new Class147_Sub6(local431, local438), 864007266);
																					}
																					local9370.anInt5740 = local438 * -677034541;
																				}
																				local9370.aString237 = local736;
																				local9370.aString238 = local9337;
																				local9370.anInt5738 = local1383 * 77473619;
																				local9370.anInt5739 = local568 * -1713792621;
																				local9370.aBoolean984 = local462;
																				local9370.aBoolean983 = local7079;
																				local9370.aString239 = local1174;
																				local9370.anInt5741 = local1681 * -145430791;
																				local431 = null;
																				break;
																			}
																		}
																		if (local431 != null && client.anInt3573 * 975306769 < 400) {
																			@Pc(9503) Class676 local9503 = new Class676();
																			client.aClass676Array1[client.anInt3573 * 975306769] = local9503;
																			local9503.aString236 = local431;
																			local9503.aString237 = local736;
																			local9503.anInt5740 = local438 * -677034541;
																			local9503.aString238 = local9337;
																			local9503.anInt5738 = local1383 * 77473619;
																			local9503.anInt5739 = local568 * -1713792621;
																			local9503.aBoolean984 = local462;
																			local9503.aBoolean983 = local7079;
																			local9503.aString239 = local1174;
																			local9503.anInt5741 = local1681 * -145430791;
																			client.anInt3573 += 353300721;
																		}
																	}
																	client.anInt3577 = -1676825382;
																	client.anInt3553 = client.anInt3569 * -799307175;
																	local378 = false;
																	local87 = client.anInt3573 * 975306769;
																	while (local87 > 0) {
																		local378 = true;
																		local87--;
																		for (local386 = 0; local386 < local87; local386++) {
																			local3561 = false;
																			@Pc(9580) Class676 local9580 = client.aClass676Array1[local386];
																			@Pc(9586) Class676 local9586 = client.aClass676Array1[local386 + 1];
																			if (Class47.aClass28_6.anInt89 * 307612145 != local9580.anInt5740 * 922507867 && Class47.aClass28_6.anInt89 * 307612145 == local9586.anInt5740 * 922507867) {
																				local3561 = true;
																			}
																			if (!local3561 && local9580.anInt5740 * 922507867 == 0 && local9586.anInt5740 * 922507867 != 0) {
																				local3561 = true;
																			}
																			if (!local3561 && !local9580.aBoolean984 && local9586.aBoolean984) {
																				local3561 = true;
																			}
																			if (!local3561 && !local9580.aBoolean983 && local9586.aBoolean983) {
																				local3561 = true;
																			}
																			if (local3561) {
																				@Pc(9647) Class676 local9647 = client.aClass676Array1[local386];
																				client.aClass676Array1[local386] = client.aClass676Array1[local386 + 1];
																				client.aClass676Array1[local386 + 1] = local9647;
																				local378 = false;
																			}
																		}
																		if (local378) {
																			break;
																		}
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_21 == arg0.aClass448_2) {
																	client.aClass274_1.method26785(1800496918);
																	local347 = local6.g1();
																	for (local87 = 0; local87 < local347; local87++) {
																		local386 = local6.g4();
																		@Pc(9698) Class273 local9698 = new Class273(local386);
																		client.aClass274_1.method26782(local9698, -2050060197);
																		local1383 = local6.g1();
																		for (local1641 = 0; local1641 < local1383; local1641++) {
																			local9698.method26725(local6.g4(), 2077199995);
																		}
																		local1641 = local6.g1();
																		for (local464 = 0; local464 < local1641; local464++) {
																			local9698.method26763(local6.g4(), -941984736);
																		}
																		for (local464 = 0; local464 < local1383; local464++) {
																			@Pc(9748) byte local9748 = local6.g1b();
																			local9698.method26722(local464, local9748, (byte) 0);
																			for (local558 = 0; local558 < local1641; local558++) {
																				if (local6.g1() == 0) {
																					local9698.method26734(local464, local558, null, 717315960);
																				} else {
																					local9698.method26734(local464, local558, local6.g4(), 818607198);
																				}
																			}
																		}
																	}
																	client.aBoolean749 = false;
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_119 == arg0.aClass448_2) {
																	local347 = local6.g4();
																	local87 = local6.g4_alt3();
																	Class672.method33564(1382651104);
																	Class596.method31998(local87, 1, local347, -1, 1287228757);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_105) {
																	local347 = local6.g2();
																	local87 = local6.g4_alt2();
																	local386 = local6.g4();
																	@Pc(9840) Class626 local9840 = new Class626(local6.g4_alt3());
																	local1383 = local6.g4_alt2();
																	local1641 = local6.g4_alt3();
																	local464 = local6.g4_alt2();
																	local889 = local6.g1();
																	local558 = local6.g1_alt3();
																	local568 = local6.g4_alt2();
																	local4674 = new Class619(local6, local889, false);
																	Class672.method33564(-1240874588);
																	Class79.method1430(local87, new Class80_Sub40_Sub4(local347, local558, new Class695(local9840, local4674.anInt5434 * 13806191, local4674.anInt5435 * -509515973, local386)), new int[] { local464, local568, local1383, local1641 }, false, -1071585236);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_68) {
																	local347 = local6.g1();
																	local87 = local6.gSmart2or4null();
																	if (client.aClass574Array1[local347] != null) {
																		client.aClass574Array1[local347].method31751(client.aClass539_1.method30932(-1638462787), 547510578);
																		client.aClass574Array1[local347] = null;
																	}
																	if (local87 != -1) {
																		client.aClass574Array1[local347] = new Class574(Class279.aClass102_9, local6, local87);
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_148 == arg0.aClass448_2) {
																	local378 = local6.g1() == 1;
																	local431 = local6.gjstr();
																	local736 = local431;
																	if (local378) {
																		local736 = local6.gjstr();
																	}
																	local4133 = local6.gjstr();
																	local4655 = local6.g2();
																	local5663 = local6.g3();
																	local5672 = (Class452) Class80_Sub39.method15030(Class452.method29284(100489110), local6.g1(), -1347894487);
																	local568 = local6.g2();
																	@Pc(10023) long local10023 = local5663 + (local4655 << 32);
																	local2038 = false;
																	local1745 = 0;
																	while (true) {
																		if (local1745 >= 100) {
																			if (local5672.aBoolean875 && Class123_Sub1.method9820(local736, 1823384158)) {
																				local2038 = true;
																			}
																			break;
																		}
																		if (local10023 == client.aLongArray23[local1745]) {
																			local2038 = true;
																			break;
																		}
																		local1745++;
																	}
																	if (!local2038) {
																		client.aLongArray23[client.anInt3537 * 2124999511] = local10023;
																		client.anInt3537 = (client.anInt3537 * 2124999511 + 1) % 100 * 2025795687;
																		@Pc(10076) String local10076 = Class610.aClass52_2.method1073(local568, 2055469992).method23051(local6, 1613198158);
																		if (local5672.anInt4893 * -522818119 == -1) {
																			Class20_Sub4_Sub2.method23018(20, 0, local431, local736, local431, local10076, local4133, local568, local5672, 1332088327);
																		} else {
																			Class20_Sub4_Sub2.method23018(20, 0, Class6_Sub1.method23670(local5672.anInt4893 * -522818119, -856883262) + local431, Class6_Sub1.method23670(local5672.anInt4893 * -522818119, 1173822842) + local736, local431, local10076, local4133, local568, local5672, 333551769);
																		}
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_78) {
																	Class595.anInt5356 = local6.g3s() * -2023734779;
																	client.aBoolean748 = local6.g1() == 1;
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_186 == arg0.aClass448_2) {
																	local347 = local6.g2();
																	Class490.aClass263_13.method26544(local347, 1788489403);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_80 == arg0.aClass448_2) {
																	if (Class13.aBoolean5 && Class411.aFrame2 != null) {
																		Class126.method20383(Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767), -1, -1, false, 1615516245);
																	}
																	local7221 = new byte[arg0.anInt248 * 460106407];
																	local6.method22557(local7221, 0, arg0.anInt248 * 460106407, -1170417853);
																	local431 = Class2.method1814(local7221, 0, arg0.anInt248 * 460106407, (byte) 54);
																	Class654.method33171(local431, true, client.aBoolean734, 940597353);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_130 == arg0.aClass448_2) {
																	local347 = local6.g1_alt1();
																	local87 = local6.g1_alt1();
																	local386 = local6.g4();
																	local438 = local6.g4_alt2();
																	local1383 = local6.g1_alt3();
																	local1641 = local386 >> 28;
																	local464 = local386 >> 14 & 0x3FFF;
																	local889 = local386 & 0x3FFF;
																	Class490.aClass263_13.method26545(local438, local87, true, local1641, local464 << 9, local889 << 9, local1383 << 9, local347 << 9, 78864041);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_183) {
																	local347 = local6.g4_alt3();
																	local87 = local6.g1_alt2();
																	local87 = -local87 - 2;
																	Class672.method33564(618575968);
																	Class596.method31998(local347, 5, local87, 0, 1287228757);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_154 == arg0.aClass448_2) {
																	local347 = local6.g4();
																	Class672.method33564(1640317638);
																	Class596.method31998(local347, 5, client.anInt3558 * 188678613, 0, 1287228757);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_23) {
																	Class499.aString215 = arg0.anInt248 * 460106407 > 2 ? local6.gjstr() : Class60.aClass60_134.method1180(Class512.aClass719_3, 1471924870);
																	client.anInt3518 = (arg0.anInt248 * 460106407 > 0 ? local6.g2() : -1) * 106670035;
																	if (client.anInt3518 * 1172850779 == 65535) {
																		client.anInt3518 = -106670035;
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_49 == arg0.aClass448_2) {
																	local347 = local6.g2();
																	local87 = local6.g1_alt1();
																	Class672.aClass134_1.aClass636_1.method32857((Class374) Class664.aClass41_Sub17_2.method18054(local347, 2054260416), local87, -580166011);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_126) {
																	if (!client.aBoolean749) {
																		try {
																			for (local312 = local6.g1b(); local312 != -1; local312 = local6.g1b()) {
																				for (local2662 = local6.g1b(); local2662 != -1; local2662 = local6.g1b()) {
																					for (@Pc(10439) byte local10439 = local6.g1b(); local10439 != -1; local10439 = local6.g1b()) {
																						client.aClass274_1.method26792(local312, 326461728).method26734(local2662, local10439, local6.g4(), 1296688373);
																					}
																				}
																			}
																		} catch (@Pc(10471) RuntimeException local10471) {
																			Class603.method32133(null, local10471, 839300151);
																			Class57.method1163(arg0, -1173831181);
																		}
																	}
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_81) {
																	local378 = local6.g1() == 1;
																	@Pc(10504) byte[] local10504 = new byte[arg0.anInt248 * 460106407 - 1];
																	local6.gdata(local10504, 0, arg0.anInt248 * 460106407 - 1);
																	Class682.method36707(local378, local10504, 1738935916);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (arg0.aClass448_2 == Class448.aClass448_177) {
																	local347 = local6.g2();
																	if (local347 == 65535) {
																		local347 = -1;
																	}
																	local87 = local6.g1();
																	local386 = local6.g2();
																	local438 = local6.g1();
																	Class490.aClass263_13.method26532(Class280.aClass280_1, local347, local87, local438, Class278.aClass278_3.method26831(-1852743377), Class269.aClass269_5, 0.0F, 0.0F, null, 0, 256, local386, 2140417753);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_98 == arg0.aClass448_2) {
																	local347 = local6.g4_alt2();
																	local87 = local6.g4_alt2();
																	Class672.method33564(2130633914);
																	Class474.method29882(local87, local347, 2027659320);
																	arg0.aClass448_2 = null;
																	return true;
																} else if (Class448.aClass448_110 == arg0.aClass448_2) {
																	local347 = local6.g1();
																	@Pc(10608) int local10608 = -local347 - 2;
																	local2662 = local6.g1b();
																	@Pc(10618) Class120_Sub1_Sub1_Sub1_Sub2 local10618 = (Class120_Sub1_Sub1_Sub1_Sub2) client.aMap15.get(local10608);
																	if (local10618 == null) {
																		local10618 = new Class120_Sub1_Sub1_Sub1_Sub2(null);
																		local10618.anInt2671 = local10608 * -486069653;
																		client.aMap15.put(local10608, local10618);
																	}
																	local10618.method19052(local6, local2662, 200900610);
																	arg0.aClass448_2 = null;
																	return true;
																} else {
																	Class603.method32133((arg0.aClass448_2 == null ? -1 : arg0.aClass448_2.anInt4887 * -452698733) + Class256.aString157 + (arg0.aClass448_4 == null ? -1 : arg0.aClass448_4.anInt4887 * -452698733) + Class256.aString157 + (arg0.aClass448_1 == null ? -1 : arg0.aClass448_1.anInt4887 * -452698733) + " " + arg0.anInt248 * 460106407, new RuntimeException(), 839300151);
																	Class266.method26657(false, (short) 9413);
																	return true;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ags", name = "g", descriptor = "(Lclient!ajs;I)V")
	static void method8555(@OriginalArg(0) Class147_Sub4 arg0, @OriginalArg(1) int arg1) {
		arg0.aClass120_Sub1_Sub1_Sub1_1 = null;
		if (Class147_Sub4.anInt1486 * -2145492983 < 20) {
			Class147_Sub4.aClass5_3.method90(arg0, 864007266);
			Class147_Sub4.anInt1486 += -52220359;
		}
	}

	@OriginalMember(owner = "client!ags", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub20(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt1009 = arg0.g2() * 1996649975;
		this.anInt1008 = arg0.g1() * -1664093665;
	}

	@OriginalMember(owner = "client!ags", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class490.aClass263_13.method26548(this.anInt1009 * -197862457, this.anInt1008 * 2005338591, -1615248781);
	}

	@OriginalMember(owner = "client!ags", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class490.aClass263_13.method26548(this.anInt1009 * -197862457, this.anInt1008 * 2005338591, -1482661809);
	}

	@OriginalMember(owner = "client!ags", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class490.aClass263_13.method26548(this.anInt1009 * -197862457, this.anInt1008 * 2005338591, 1971658819);
	}
}
