package com.jagex;

import java.awt.Point;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yx")
public class Class696 {

	@OriginalMember(owner = "client!yx", name = "m", descriptor = "[I")
	int[] anIntArray526;

	@OriginalMember(owner = "client!yx", name = "e", descriptor = "Lclient!asc;")
	Class93_Sub1_Sub13 aClass93_Sub1_Sub13_2;

	@OriginalMember(owner = "client!yx", name = "k", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray46;

	@OriginalMember(owner = "client!yx", name = "f", descriptor = "[J")
	long[] aLongArray28;

	@OriginalMember(owner = "client!yx", name = "n", descriptor = "I")
	int anInt5940 = 1049818527;

	@OriginalMember(owner = "client!yx", name = "<init>", descriptor = "()V", line = 12)
	Class696() {
	}

	@OriginalMember(owner = "client!yx", name = "m", descriptor = "(Lclient!yf;B)V", line = 25)
	static void method36642(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5888 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class262.method26170(local14, local25, (byte) 63);
	}

	@OriginalMember(owner = "client!yx", name = "fv", descriptor = "(II)V", line = 2479)
	static void method36644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class51.options.aClass166_Sub41_1.method16387(150510591) == 0) {
			arg0 = -1;
		}
		if (client.anInt3522 * 929376837 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class661 local21 = (Class661) Class311.aClass32_Sub6_1.method18261(arg0, -577268731);
			@Pc(25) Class105 local25 = local21.method32836(2034438985);
			if (local25 == null) {
				arg0 = -1;
			} else {
				Class270.aClass551_1.setcustomcursor(Class125_Sub3.aCanvas1, local25.method7171(true), local25.method7163(), local25.method7164(), new Point(local21.anInt5826 * 1420914277, local21.anInt5827 * -55535297));
				client.anInt3522 = arg0 * -1480566643;
			}
		}
		if (arg0 == -1 && client.anInt3522 * 929376837 != -1) {
			Class270.aClass551_1.setcustomcursor(Class125_Sub3.aCanvas1, null, -1, -1, new Point());
			client.anInt3522 = 1480566643;
		}
	}

	@OriginalMember(owner = "client!yx", name = "ih", descriptor = "(Lclient!ax;B)Z", line = 6398)
	static final boolean readLobbyPackets(@OriginalArg(0) Class175 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(3) Class160 local3 = arg0.getStream((byte) 89);
		@Pc(6) PacketBit local6 = arg0.packet;
		if (local3 == null) {
			return false;
		}
		@Pc(88) int local88;
		if (arg0.serverPacketType == null) {
			if (arg0.aBoolean563) {
				if (!local3.available(1, 1700286379)) {
					return false;
				}
				local3.read(arg0.packet.data, 0, 1, (byte) -112);
				arg0.anInt3304 += 1539455077;
				arg0.anInt3298 = 0;
				arg0.aBoolean563 = false;
			}
			local6.pos = 0;
			if (local6.peekIsaacBit(-1682603128)) {
				if (!local3.available(1, 517964733)) {
					return false;
				}
				local3.read(arg0.packet.data, 1, 1, (byte) -93);
				arg0.anInt3304 += 1539455077;
				arg0.anInt3298 = 0;
			}
			arg0.aBoolean563 = true;
			@Pc(84) ServerProt[] local84 = ServerProt.values(1774311473);
			local88 = local6.gIsaac1or2(-454422400);
			if (local88 < 0 || local88 >= local84.length) {
				throw new IOException(local88 + " " + local6.pos * 212851357);
			}
			arg0.serverPacketType = local84[local88];
			arg0.length = arg0.serverPacketType.anInt5033 * -476719005;
		}
		if (arg0.length * 2010044839 == -1) {
			if (!local3.available(1, 1593371859)) {
				return false;
			}
			local3.read(local6.data, 0, 1, (byte) -64);
			arg0.length = (local6.data[0] & 0xFF) * -852738537;
			arg0.anInt3304 += 1539455077;
			arg0.anInt3298 = 0;
		}
		if (arg0.length * 2010044839 == -2) {
			if (!local3.available(2, -136462306)) {
				return false;
			}
			local3.read(local6.data, 0, 2, (byte) -86);
			local6.pos = 0;
			arg0.length = local6.g2(-1434290800) * -852738537;
			arg0.anInt3304 += -1216057142;
			arg0.anInt3298 = 0;
		}
		if (arg0.length * 2010044839 > 0) {
			if (!local3.available(arg0.length * 2010044839, 1348285860)) {
				return false;
			}
			local6.pos = 0;
			local3.read(local6.data, 0, arg0.length * 2010044839, (byte) -71);
			arg0.anInt3304 += arg0.length * -775526685;
			arg0.anInt3298 = 0;
		}
        System.out.println("Packet: " + (arg0.serverPacketType.opcode * 1430738181));
		arg0.prevServerPacketType3 = arg0.prevServerPacketType2;
		arg0.prevServerPacketType2 = arg0.prevServerPacketType1;
		arg0.prevServerPacketType1 = arg0.serverPacketType;
		@Pc(264) int local264;
		@Pc(273) boolean local273;
		if (arg0.serverPacketType == ServerProt.aServerProt_56) {
			local264 = local6.g4_alt3(-1394944635);
			local273 = local6.g1((short) 16384) == 1;
			Class704.incrementVerifyId((short) 255);
			Class649.method32659(local264, local273, (byte) -4);
			arg0.serverPacketType = null;
			return true;
		}
		@Pc(302) boolean local302;
		if (arg0.serverPacketType == ServerProt.aServerProt_64) {
			client.anInt3548 = client.anInt3565 * 287027887;
			local302 = local6.g1((short) 16384) == 1;
			if (arg0.length * 2010044839 != 1) {
				if (local302) {
					Class121.aClass93_Sub28_2 = new Class93_Sub28(local6);
				} else {
					Class253.aClass93_Sub28_3 = new Class93_Sub28(local6);
				}
				arg0.serverPacketType = null;
				return true;
			}
			if (local302) {
				Class121.aClass93_Sub28_2 = null;
			} else {
				Class253.aClass93_Sub28_3 = null;
			}
			arg0.serverPacketType = null;
			return true;
		}
		@Pc(346) byte local346;
		if (ServerProt.aServerProt_153 == arg0.serverPacketType) {
			local346 = local6.g1b_alt3(-1826116307);
			local88 = local6.g2(-1434290800);
			Class704.incrementVerifyId((short) 255);
			Class128_Sub1_Sub1.method19648(local88, local346, 1253955202);
			arg0.serverPacketType = null;
			return true;
		}
		@Pc(382) int local382;
		@Pc(396) int local396;
		@Pc(444) int local444;
		@Pc(398) int local398;
		@Pc(416) int local416;
		if (ServerProt.aServerProt_80 == arg0.serverPacketType) {
			client.aClass270_1.method26292(750533435);
			local264 = local6.g1((short) 16384);
			for (local88 = 0; local88 < local264; local88++) {
				local382 = local6.g4(-118643075);
				@Pc(387) Class279 local387 = new Class279(local382);
				client.aClass270_1.method26281(local387, -2108375138);
				local396 = local6.g1((short) 16384);
				for (local398 = 0; local398 < local396; local398++) {
					local387.method26410(local6.g4(-118643075), 26318147);
				}
				local398 = local6.g1((short) 16384);
				for (local416 = 0; local416 < local398; local416++) {
					local387.method26389(local6.g4(-118643075), (byte) 0);
				}
				for (local416 = 0; local416 < local396; local416++) {
					@Pc(437) byte local437 = local6.g1b(1322265367);
					local387.method26398(local416, local437, -2103039039);
					for (local444 = 0; local444 < local398; local444++) {
						if (local6.g1((short) 16384) == 0) {
							local387.method26443(local416, local444, null, -2142920776);
						} else {
							local387.method26443(local416, local444, local6.g4(-118643075), -2024160924);
						}
					}
				}
			}
			client.aBoolean636 = false;
			arg0.serverPacketType = null;
			return true;
		} else if (ServerProt.aServerProt_23 == arg0.serverPacketType) {
			Class511.aString220 = arg0.length * 2010044839 > 2 ? local6.gjstr(1390391231) : Class74.aClass74_133.method1259(Class106.lang, (byte) -35);
			client.anInt3518 = (arg0.length * 2010044839 > 0 ? local6.g2(-1434290800) : -1) * 804945147;
			if (client.anInt3518 * -2102645197 == 65535) {
				client.anInt3518 = -804945147;
			}
			arg0.serverPacketType = null;
			return true;
		} else if (ServerProt.aServerProt_15 == arg0.serverPacketType) {
			Class376.method28047(local6.gjstr(-199116566), (byte) 1);
			arg0.serverPacketType = null;
			return true;
		} else if (ServerProt.aServerProt_113 == arg0.serverPacketType) {
			local302 = local6.g1_alt3(1409863869) == 1;
			Class704.incrementVerifyId((short) 255);
			Class620.aBoolean843 = local302;
			arg0.serverPacketType = null;
			return true;
		} else if (arg0.serverPacketType == ServerProt.aServerProt_79) {
			Class118_Sub1.aClass12_4 = Class266.method26226(local6.g1((short) 16384), (byte) 8);
			arg0.serverPacketType = null;
			return true;
		} else if (ServerProt.aServerProt_182 == arg0.serverPacketType) {
			arg0.serverPacketType = null;
			return true;
		} else {
			@Pc(640) String local640;
			@Pc(646) String local646;
			@Pc(611) byte[] local611;
			if (ServerProt.aServerProt_65 == arg0.serverPacketType) {
				if (Class4.aBoolean2 && Class125_Sub2_Sub1.aFrame1 != null) {
					Class717.method36895(Class51.options.aClass166_Sub23_1.method15844(1998532613), -1, -1, false, (byte) 65);
				}
				local611 = new byte[arg0.length * 2010044839 - 1];
				local273 = local6.g1((short) 16384) == 1;
				local6.gIsaacArrayBuffer(local611, 0, arg0.length * 2010044839 - 1, 1936873316);
				@Pc(636) Packet local636 = new Packet(local611);
				local640 = local636.gjstr(856680973);
				if (local273) {
					local646 = local636.gjstr(1257786616);
					if (local646.length() == 0) {
						local646 = local640;
					}
					if (!client.javascript || Class339.aString179.startsWith("mac") || !Class110.method20138(local640, 1, Class447.aClass447_10.getName((byte) -99), (short) 29789)) {
						Class338.method27464(local646, true, client.aBoolean596, (byte) -114);
					}
				} else {
					Class338.method27464(local640, true, client.aBoolean596, (byte) -95);
				}
				arg0.serverPacketType = null;
				return true;
			} else if (arg0.serverPacketType == ServerProt.aServerProt_168) {
				local264 = local6.g2_alt1(653375419);
				local88 = local6.g2(-1434290800);
				Class704.incrementVerifyId((short) 255);
				Class123.method9082(local88, local264, 0, -1223039695);
				arg0.serverPacketType = null;
				return true;
			} else if (arg0.serverPacketType == ServerProt.aServerProt_109) {
				Class704.incrementVerifyId((short) 255);
				Class322.method27271(Class20.method376(1258763127), 72991140);
				arg0.serverPacketType = null;
				return true;
			} else {
				@Pc(742) boolean local742;
				@Pc(750) boolean local750;
				if (ServerProt.aServerProt_21 == arg0.serverPacketType) {
					local264 = local6.g2(-1434290800);
					local88 = local6.g1((short) 16384);
					local742 = (local88 & 0x1) != 0;
					local750 = (local88 & 0x2) != 0;
					while (local6.pos * 212851357 < arg0.length * 2010044839) {
						local396 = local6.gSmart1or2((byte) -20);
						local398 = local6.g2(-1434290800);
						local416 = 0;
						@Pc(771) Class40 local771 = null;
						if (local398 != 0) {
							local416 = local6.g1((short) 16384);
							if (local416 == 255) {
								local416 = local6.g4(-118643075);
							}
							if (local750) {
								local444 = local6.g1((short) 16384);
								if (local444 > 0) {
									local771 = new Class40(Class265.aClass79_Sub1_Sub2_4);
									while (local444-- > 0) {
										@Pc(806) Class466 local806 = Class265.aClass79_Sub1_Sub2_4.method1468(local6, (byte) 118);
										local771.method776(local806.anInt5092 * -1181855333, local806.anObject19, (byte) 80);
									}
								}
							}
						}
						Class313.method26931(local264, local396, local398 - 1, local416, local771, local742, 1462111106);
					}
					client.anIntArray301[(client.anInt3541 += -486259511) * 1562318201 - 1 & 0x3F] = local264;
					arg0.serverPacketType = null;
					return true;
				} else if (ServerProt.aServerProt_118 == arg0.serverPacketType) {
					Class641.readZonePacket(ZoneProt.aZoneProt_1, -190991633);
					arg0.serverPacketType = null;
					return true;
				} else if (ServerProt.aServerProt_20 == arg0.serverPacketType) {
					if (!client.aBoolean636) {
						try {
							local264 = local6.g1((short) 16384);
							local88 = local6.g1_alt3(2134753621);
							local382 = local6.g1_alt3(1946571451);
							client.aClass270_1.method26280(local264, -1243467699).method26443(local88, local382, null, -1991149627);
						} catch (@Pc(887) RuntimeException local887) {
							Class646.method32608(null, local887, 1428490450);
							Class332.method27394(arg0, 1059639619);
						}
					}
					arg0.serverPacketType = null;
					return true;
				} else if (arg0.serverPacketType == ServerProt.aServerProt_122) {
					Class641.readZonePacket(ZoneProt.aZoneProt_9, -339722943);
					arg0.serverPacketType = null;
					return true;
				} else if (ServerProt.aServerProt_196 == arg0.serverPacketType) {
					local264 = local6.g2_alt2(2107279448);
					local88 = local6.g4(-118643075);
					Class704.incrementVerifyId((short) 255);
					Class273.method26326(local88, local264, 1565371483);
					arg0.serverPacketType = null;
					return true;
				} else if (ServerProt.aServerProt_91 == arg0.serverPacketType) {
					client.aClass67_15 = (Class67) Class107.method18116(Class680.method33239((byte) 79), local6.g1((short) 16384), -1915563430);
					Class642.logout(Class411.aBoolean752, (short) 2779);
					arg0.serverPacketType = null;
					return false;
				} else if (ServerProt.aServerProt_189 == arg0.serverPacketType) {
					if (!client.aBoolean636) {
						try {
							local346 = local6.g1b_alt1((byte) 109);
							local88 = local6.g4(-118643075);
							local382 = local6.g1_alt3(1879921514);
							client.aClass270_1.method26280(local382, -1136900178).method26421(local88, local346, 1217577618);
						} catch (@Pc(985) RuntimeException local985) {
							Class646.method32608(null, local985, 2100486277);
							Class332.method27394(arg0, -1675338115);
						}
					}
					arg0.serverPacketType = null;
					return true;
				} else {
					@Pc(1022) int local1022;
					@Pc(1018) String local1018;
					if (ServerProt.aServerProt_19 == arg0.serverPacketType) {
						local264 = local6.g1_alt2(-35008779);
						local88 = local6.g2_alt3(16711680);
						if (local88 == 65535) {
							local88 = -1;
						}
						local1018 = local6.gjstr(190885939);
						local1022 = local6.g1_alt3(1407296258);
						if (local264 >= 1 && local264 <= 8) {
							if (local1018.equalsIgnoreCase("null")) {
								local1018 = null;
							}
							client.aStringArray22[local264 - 1] = local1018;
							client.anIntArray304[local264 - 1] = local88;
							client.aBooleanArray20[local264 - 1] = local1022 == 0;
						}
						arg0.serverPacketType = null;
						return true;
					} else if (ServerProt.aServerProt_70 == arg0.serverPacketType) {
						local264 = local6.g1_alt1(1855696728);
						local88 = local6.g2(-1434290800);
						local742 = (local264 & 0x1) == 1;
						Class661.method32841(local88, local742, (byte) -86);
						client.anIntArray301[(client.anInt3541 += -486259511) * 1562318201 - 1 & 0x3F] = local88;
						arg0.serverPacketType = null;
						return true;
					} else if (arg0.serverPacketType == ServerProt.aServerProt_198) {
						Class637.aClass113_1 = null;
						arg0.serverPacketType = null;
						return true;
					} else if (arg0.serverPacketType == ServerProt.aServerProt_75) {
						@Pc(1123) int[] local1123 = new int[4];
						for (local88 = 0; local88 < 4; local88++) {
							local1123[local88] = local6.g4_alt1(-359345991);
						}
						local88 = local6.g2(-1434290800);
						local382 = local6.g1_alt2(1367897093);
						@Pc(1150) Class93_Sub15 local1150 = (Class93_Sub15) client.aClass16_18.method214((long) local88);
						if (local1150 != null) {
							Class623.method32150((Class132_Sub1_Sub1_Sub1) local1150.anObject5, local1123, local382, true, 870600155);
						}
						arg0.serverPacketType = null;
						return true;
					} else if (arg0.serverPacketType == ServerProt.aServerProt_120) {
						local264 = local6.g4_alt2(-138550381);
						local88 = local6.g2_alt1(2103272100);
						local382 = local6.g2_alt1(1346086504);
						local1022 = local6.g2_alt2(1690629750);
						Class704.incrementVerifyId((short) 255);
						Class125_Sub2.method21464(local264, local88, local382, local1022, -441802256);
						arg0.serverPacketType = null;
						return true;
					} else if (ServerProt.aServerProt_33 == arg0.serverPacketType) {
						client.anInt3447 = client.anInt3565 * 2096178751;
						local302 = local6.g1((short) 16384) == 1;
						if (arg0.length * 2010044839 != 1) {
							if (local302) {
								Class279.aClass386_1 = new Class386(local6);
							} else {
								Class581.aClass386_2 = new Class386(local6);
							}
							arg0.serverPacketType = null;
							return true;
						}
						if (local302) {
							Class279.aClass386_1 = null;
						} else {
							Class581.aClass386_2 = null;
						}
						arg0.serverPacketType = null;
						return true;
					} else if (arg0.serverPacketType == ServerProt.aServerProt_123) {
						local264 = local6.g1((short) 16384);
						local88 = local6.gSmart2or4null(-801855645);
						if (client.aClass567Array1[local264] != null) {
							client.aClass567Array1[local264].method31267(client.world.method30481(-2139516873), (byte) 111);
							client.aClass567Array1[local264] = null;
						}
						if (local88 != -1) {
							client.aClass567Array1[local264] = new Class567(Class694.aClass104_14, local6, local88);
						}
						arg0.serverPacketType = null;
						return true;
					} else {
						@Pc(1343) int local1343;
						@Pc(1385) int local1385;
						@Pc(1321) long local1321;
						@Pc(1327) long local1327;
						@Pc(1329) boolean local1329;
						@Pc(1316) long local1316;
						if (arg0.serverPacketType == ServerProt.aServerProt_87) {
							local302 = local6.g1((short) 16384) == 1;
							local1316 = local6.g2(-1434290800);
							local1321 = local6.g3((short) 9219);
							local1327 = local1321 + (local1316 << 32);
							local1329 = false;
							@Pc(1335) Class93_Sub28 local1335 = local302 ? Class121.aClass93_Sub28_2 : Class253.aClass93_Sub28_3;
							if (local1335 == null) {
								local1329 = true;
							} else {
								for (local1343 = 0; local1343 < 100; local1343++) {
									if (client.aLongArray23[local1343] == local1327) {
										local1329 = true;
										break;
									}
								}
							}
							if (!local1329) {
								client.aLongArray23[client.anInt3564 * -254980857] = local1327;
								client.anInt3564 = (-254980857 * client.anInt3564 + 1) % 100 * -1639542601;
								@Pc(1379) String local1379 = Class433.method28791(local6, 672487471);
								local1385 = local302 ? 43 : 46;
								Class60.method1118(local1385, 0, "", "", "", local1379, local1335.aString44, -1, null, 84687310);
							}
							arg0.serverPacketType = null;
							return true;
						} else if (ServerProt.aServerProt_41 == arg0.serverPacketType) {
							Class552.method31036(local6, arg0.length * 2010044839, 1956542640);
							arg0.serverPacketType = null;
							return true;
						} else if (ServerProt.aServerProt_178 == arg0.serverPacketType) {
							local264 = local6.g2_alt2(1918144079);
							local88 = local6.g4_alt1(-22520354);
							Class704.incrementVerifyId((short) 255);
							Class53_Sub1.method14955(local264, local88, -617627117);
							arg0.serverPacketType = null;
							return true;
						} else {
							@Pc(1481) int local1481;
							@Pc(1457) Class611 local1457;
							if (ServerProt.aServerProt_169 == arg0.serverPacketType) {
								local264 = local6.g4_alt1(-1247714423);
								local1457 = new Class611(local6.g4_alt3(1912041466));
								local382 = local6.g2(-1434290800);
								local1022 = local6.g1_alt3(1277019472);
								local396 = local6.g4_alt3(-245665451);
								local398 = local6.g4(-118643075);
								local416 = local6.g4_alt2(-484293036);
								local1481 = local6.g4_alt3(66913047);
								local444 = local6.g1((short) 16384);
								local1343 = local6.g4(-118643075);
								@Pc(1496) Class629 local1496 = new Class629(local6, local444, false);
								Class704.incrementVerifyId((short) 255);
								Class348.method27623(local264, new Class93_Sub40_Sub1(local382, local1022, new Class694(local1457, local1496.anInt5709 * 1175627307, local1496.anInt5708 * -1626288991, local1343)), new int[] { local396, local398, local416, local1481 }, false, (byte) 0);
								arg0.serverPacketType = null;
								return true;
							}
							@Pc(1596) boolean local1596;
							@Pc(1630) int local1630;
							@Pc(1571) String local1571;
							@Pc(1628) String local1628;
							if (arg0.serverPacketType == ServerProt.aServerProt_51) {
								while (local6.pos * 212851357 < arg0.length * 2010044839) {
									local302 = local6.g1((short) 16384) == 1;
									local1571 = local6.gjstr(631966309);
									local1018 = local6.gjstr(1893917905);
									local1022 = local6.g2(-1434290800);
									local396 = local6.g1((short) 16384);
									local398 = local6.g1((short) 16384);
									local1596 = (local398 & 0x2) != 0;
									local1329 = (local398 & 0x1) != 0;
									@Pc(1606) String local1606 = "";
									local1343 = -1;
									local1385 = 0;
									if (local1022 > 0) {
										local1606 = local6.gjstr(2113607965);
										local1343 = local6.g1((short) 16384);
										local1385 = local6.g4(-118643075);
									}
									local1628 = local6.gjstr(289673832);
									for (local1630 = 0; local1630 < client.anInt3444 * 862418793; local1630++) {
										@Pc(1639) Class281 local1639 = client.aClass281Array1[local1630];
										if (local302) {
											if (local1018.equals(local1639.aString153)) {
												local1639.aString153 = local1571;
												local1639.aString154 = local1018;
												local1571 = null;
												break;
											}
										} else if (local1571.equals(local1639.aString153)) {
											if (local1022 != local1639.anInt3894 * 1928339871) {
												@Pc(1654) boolean local1654 = true;
												for (@Pc(1659) Class149_Sub2 local1659 = (Class149_Sub2) client.aClass21_8.method390((short) 22581); local1659 != null; local1659 = (Class149_Sub2) client.aClass21_8.method392(-1915563430)) {
													if (local1659.aString42.equals(local1571)) {
														if (local1022 != 0 && local1659.aShort77 == 0) {
															local1659.method23766(-719770481);
															local1654 = false;
														} else if (local1022 == 0 && local1659.aShort77 != 0) {
															local1659.method23766(-719770481);
															local1654 = false;
														}
													}
												}
												if (local1654) {
													client.aClass21_8.method380(new Class149_Sub2(local1571, local1022), (byte) 4);
												}
												local1639.anInt3894 = local1022 * 130726495;
											}
											local1639.aString154 = local1018;
											local1639.aString155 = local1606;
											local1639.anInt3895 = local396 * 980258157;
											local1639.anInt3896 = local1343 * -1776350821;
											local1639.aBoolean672 = local1596;
											local1639.aBoolean673 = local1329;
											local1639.aString156 = local1628;
											local1639.anInt3897 = local1385 * -533760793;
											local1571 = null;
											break;
										}
									}
									if (local1571 != null && client.anInt3444 * 862418793 < 400) {
										@Pc(1772) Class281 local1772 = new Class281();
										client.aClass281Array1[client.anInt3444 * 862418793] = local1772;
										local1772.aString153 = local1571;
										local1772.aString154 = local1018;
										local1772.anInt3894 = local1022 * 130726495;
										local1772.aString155 = local1606;
										local1772.anInt3895 = local396 * 980258157;
										local1772.anInt3896 = local1343 * -1776350821;
										local1772.aBoolean672 = local1596;
										local1772.aBoolean673 = local1329;
										local1772.aString156 = local1628;
										local1772.anInt3897 = local1385 * -533760793;
										client.anInt3444 += -948139815;
									}
								}
								client.anInt3572 = 1342562502;
								client.anInt3547 = client.anInt3565 * -541355657;
								local302 = false;
								local88 = client.anInt3444 * 862418793;
								while (local88 > 0) {
									local302 = true;
									local88--;
									for (local382 = 0; local382 < local88; local382++) {
										local750 = false;
										@Pc(1849) Class281 local1849 = client.aClass281Array1[local382];
										@Pc(1855) Class281 local1855 = client.aClass281Array1[local382 + 1];
										if (local1849.anInt3894 * 1928339871 != Class50.world.id * 2142901097 && Class50.world.id * 2142901097 == local1855.anInt3894 * 1928339871) {
											local750 = true;
										}
										if (!local750 && local1849.anInt3894 * 1928339871 == 0 && local1855.anInt3894 * 1928339871 != 0) {
											local750 = true;
										}
										if (!local750 && !local1849.aBoolean672 && local1855.aBoolean672) {
											local750 = true;
										}
										if (!local750 && !local1849.aBoolean673 && local1855.aBoolean673) {
											local750 = true;
										}
										if (local750) {
											@Pc(1916) Class281 local1916 = client.aClass281Array1[local382];
											client.aClass281Array1[local382] = client.aClass281Array1[local382 + 1];
											client.aClass281Array1[local382 + 1] = local1916;
											local302 = false;
										}
									}
									if (local302) {
										break;
									}
								}
								arg0.serverPacketType = null;
								return true;
							}
							@Pc(1993) Class93_Sub19 local1993;
							@Pc(2010) Class93_Sub19 local2010;
							if (ServerProt.aServerProt_27 == arg0.serverPacketType) {
								local264 = local6.g2_alt2(2141410661);
								if (local264 == 65535) {
									local264 = -1;
								}
								local88 = local6.g4(-118643075);
								local382 = local6.g2_alt3(16711680);
								if (local382 == 65535) {
									local382 = -1;
								}
								local1022 = local6.g4_alt1(-1073008285);
								Class704.incrementVerifyId((short) 255);
								for (local396 = local264; local396 <= local382; local396++) {
									local1327 = (long) local396 + ((long) local1022 << 32);
									local1993 = (Class93_Sub19) client.aClass16_19.method214(local1327);
									if (local1993 != null) {
										local2010 = new Class93_Sub19(local88, local1993.anInt1546 * -1350606777);
										local1993.method23969(521180144);
									} else if (local396 == -1) {
										local2010 = new Class93_Sub19(local88, Class659.method32808(local1022, -310692980).aClass93_Sub19_2.anInt1546 * -1350606777);
									} else {
										local2010 = new Class93_Sub19(local88, -1);
									}
									client.aClass16_19.method220(local2010, local1327);
								}
								arg0.serverPacketType = null;
								return true;
							} else if (ServerProt.aServerProt_55 == arg0.serverPacketType) {
								Class641.readZonePacket(ZoneProt.aZoneProt_4, -466980108);
								arg0.serverPacketType = null;
								return true;
							} else {
								@Pc(2070) byte local2070;
								if (ServerProt.aServerProt_72 == arg0.serverPacketType) {
									local264 = local6.g1((short) 16384);
									local264 = -local264 - 2;
									local2070 = local6.g1b(829318938);
									@Pc(2076) Class132_Sub1_Sub1_Sub1_Sub2 local2076 = (Class132_Sub1_Sub1_Sub1_Sub2) client.aMap18.get(local264);
									if (local2076 == null) {
										local2076 = new Class132_Sub1_Sub1_Sub1_Sub2(null);
										local2076.anInt2768 = local264 * 171759809;
										client.aMap18.put(local264, local2076);
									}
									local2076.method20047(local6, local2070, -237524841);
									arg0.serverPacketType = null;
									return true;
								} else if (arg0.serverPacketType == ServerProt.aServerProt_60) {
									local264 = local6.g1_alt1(1876424432);
									local88 = local6.g2_alt1(606349608);
									if (local88 == 65535) {
										local88 = -1;
									}
									Class274.aClass258_1.method26132(local88, local264, 1631428105);
									arg0.serverPacketType = null;
									return true;
								} else {
									@Pc(2186) Class611 local2186;
									if (ServerProt.aServerProt_89 == arg0.serverPacketType) {
										local264 = local6.g4_alt1(988263617);
										local88 = local264 >> 28 & 0x3;
										local382 = local264 >> 14 & 0x3FFF;
										local1022 = local264 & 0x3FFF;
										local396 = local6.g1((short) 16384);
										local398 = local6.g4(-118643075);
										local416 = local6.g1((short) 16384);
										@Pc(2175) Class629 local2175 = new Class629(local6, local416, false);
										local444 = client.anIntArray309[local2175.anInt5709 * 1175627307];
										local2186 = client.world.method30455(1939142101);
										local382 -= local2186.anInt5623 * 270611681;
										local1022 -= local2186.anInt5624 * -1994307635;
										Class573.method31343(local88, local382, local1022, local444, local2175.anInt5709 * 1175627307, local2175.anInt5708 * -1626288991, local2175.aClass458_90, local398, local396, (byte) 2);
										arg0.serverPacketType = null;
										return true;
									} else if (arg0.serverPacketType == ServerProt.aServerProt_24) {
										local264 = local6.g1((short) 16384);
										@Pc(2238) Class704 local2238 = (Class704) Class107.method18116(Class633.method32299((byte) -84), local264, -1915563430);
										if (local2238 == null) {
											local2238 = Class704.aClass704_4;
										}
										Class363.method27850(local2238, 494001329);
										arg0.serverPacketType = null;
										return true;
									} else if (arg0.serverPacketType == ServerProt.aServerProt_81) {
										local264 = local6.g2(-1434290800);
										Class274.aClass258_1.method26058(local264, (byte) 23);
										arg0.serverPacketType = null;
										return true;
									} else if (arg0.serverPacketType == ServerProt.aServerProt_69) {
										local264 = local6.g4_alt2(-1777385325);
										Class704.incrementVerifyId((short) 255);
										if (local264 == -1) {
											Class175.anInt3306 = 1395810859;
											Class444.anInt4895 = 783237131;
										} else {
											local1457 = client.world.method30455(1921081888);
											local382 = local264 >> 14 & 0x3FFF;
											local1022 = local264 & 0x3FFF;
											local382 -= local1457.anInt5623 * 270611681;
											if (local382 < 0) {
												local382 = 0;
											} else if (local382 >= client.world.method30459(495498723)) {
												local382 = client.world.method30459(1941909534);
											}
											local1022 -= local1457.anInt5624 * -1994307635;
											if (local1022 < 0) {
												local1022 = 0;
											} else if (local1022 >= client.world.method30466((short) 128)) {
												local1022 = client.world.method30466((short) 128);
											}
											Class175.anInt3306 = ((local382 << 9) + 256) * -1395810859;
											Class444.anInt4895 = ((local1022 << 9) + 256) * -783237131;
										}
										arg0.serverPacketType = null;
										return true;
									} else if (arg0.serverPacketType == ServerProt.aServerProt_18) {
										Class641.readZonePacket(ZoneProt.aZoneProt_3, -225905306);
										arg0.serverPacketType = null;
										return true;
									} else if (arg0.serverPacketType == ServerProt.aServerProt_114) {
										local264 = local6.g4(-118643075);
										local88 = local6.g1_alt2(1047760670);
										Class704.incrementVerifyId((short) 255);
										Class286.method26527(local264, local88, -127504443);
										arg0.serverPacketType = null;
										return true;
									} else {
										@Pc(2427) long local2427;
										@Pc(2460) int local2460;
										@Pc(2442) long local2442;
										@Pc(2446) Class466 local2446;
										@Pc(2444) boolean local2444;
										@Pc(2436) Class443 local2436;
										@Pc(2422) long local2422;
										if (arg0.serverPacketType == ServerProt.aServerProt_194) {
											local302 = local6.g1((short) 16384) == 1;
											local1571 = local6.gjstr(1877367144);
											local2422 = local6.g2(-1434290800);
											local2427 = local6.g3((short) 18791);
											local2436 = (Class443) Class107.method18116(Class443.method28866(1812282459), local6.g1((short) 16384), -1915563430);
											local2442 = local2427 + (local2422 << 32);
											local2444 = false;
											local2446 = null;
											@Pc(2452) Class93_Sub28 local2452 = local302 ? Class121.aClass93_Sub28_2 : Class253.aClass93_Sub28_3;
											if (local2452 == null) {
												local2444 = true;
											} else {
												local2460 = 0;
												while (true) {
													if (local2460 >= 100) {
														if (local2436.aBoolean770) {
															if (client.userQuickChat1 && !client.userQuickChat2 || client.userQuickChat4) {
																local2444 = true;
															} else if (Class476.method29688(local1571, (byte) 49)) {
																local2444 = true;
															}
														}
														break;
													}
													if (local2442 == client.aLongArray23[local2460]) {
														local2444 = true;
														break;
													}
													local2460++;
												}
											}
											if (!local2444) {
												client.aLongArray23[client.anInt3564 * -254980857] = local2442;
												client.anInt3564 = (client.anInt3564 * -254980857 + 1) % 100 * -1639542601;
												local1628 = Class657.method32750(Class433.method28791(local6, 672487471), (byte) 8);
												local1630 = local302 ? 41 : 44;
												if (local2436.anInt4893 * -508329009 == -1) {
													Class60.method1118(local1630, 0, local1571, local1571, local1571, local1628, local2452.aString44, -1, local2436, 186941195);
												} else {
													Class60.method1118(local1630, 0, Class346.method27565(local2436.anInt4893 * -508329009, -1614681388) + local1571, Class346.method27565(local2436.anInt4893 * -508329009, -1614681388) + local1571, local1571, local1628, local2452.aString44, -1, local2436, 125464804);
												}
											}
											arg0.serverPacketType = null;
											return true;
										} else if (ServerProt.aServerProt_111 == arg0.serverPacketType) {
											Class637.aClass113_1 = new Class113(Class39.aClass79_Sub1_Sub2_1);
											arg0.serverPacketType = null;
											return true;
										} else if (arg0.serverPacketType == ServerProt.aServerProt_115) {
											local264 = local6.g4(-118643075);
											Class120.userLastLoginHost = new Class499(local264);
											@Pc(2614) Thread local2614 = new Thread(Class120.userLastLoginHost);
											local2614.setPriority(1);
											local2614.start();
											arg0.serverPacketType = null;
											return true;
										} else if (arg0.serverPacketType == ServerProt.aServerProt_186) {
											local264 = local6.g2(-1434290800);
											if (local264 == 65535) {
												local264 = -1;
											}
											local88 = local6.g1((short) 16384);
											local382 = local6.g2(-1434290800);
											local1022 = local6.g1((short) 16384);
											local396 = local6.g2(-1434290800);
											Class274.aClass258_1.method26098(Class275.aClass275_13, local264, local88, local1022, Class280.aClass280_7.method26450(-1324164681), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local396, local382, -985234790);
											arg0.serverPacketType = null;
											return true;
										} else {
											@Pc(2719) Class443 local2719;
											@Pc(2729) long local2729;
											@Pc(2731) boolean local2731;
											@Pc(2782) String local2782;
											if (arg0.serverPacketType == ServerProt.aServerProt_170) {
												local302 = local6.g1((short) 16384) == 1;
												local1571 = local6.gjstr(1679314768);
												local1018 = local1571;
												if (local302) {
													local1018 = local6.gjstr(1771771768);
												}
												local1321 = local6.g2(-1434290800);
												local1327 = local6.g3((short) 671);
												local2719 = (Class443) Class107.method18116(Class443.method28866(1306362893), local6.g1((short) 16384), -1915563430);
												local444 = local6.g2(-1434290800);
												local2729 = local1327 + (local1321 << 32);
												local2731 = false;
												local1630 = 0;
												while (true) {
													if (local1630 >= 100) {
														if (local2719.aBoolean770 && Class476.method29688(local1018, (byte) 36)) {
															local2731 = true;
														}
														break;
													}
													if (local2729 == client.aLongArray23[local1630]) {
														local2731 = true;
														break;
													}
													local1630++;
												}
												if (!local2731) {
													client.aLongArray23[client.anInt3564 * -254980857] = local2729;
													client.anInt3564 = (client.anInt3564 * -254980857 + 1) % 100 * -1639542601;
													local2782 = Class372.aClass58_2.method1094(local444, -737304293).method22928(local6, (byte) -126);
													if (-508329009 * local2719.anInt4893 == -1) {
														Class60.method1118(18, 0, local1571, local1018, local1571, local2782, null, local444, local2719, 1308454508);
													} else {
														Class60.method1118(18, 0, Class346.method27565(local2719.anInt4893 * -508329009, -1614681388) + local1571, Class346.method27565(local2719.anInt4893 * -508329009, -1614681388) + local1018, local1571, local2782, null, local444, local2719, 182249454);
													}
												}
												arg0.serverPacketType = null;
												return true;
											} else if (arg0.serverPacketType == ServerProt.aServerProt_14) {
												Class641.readZonePacket(ZoneProt.aZoneProt_2, -293241541);
												arg0.serverPacketType = null;
												return true;
											} else if (arg0.serverPacketType == ServerProt.aServerProt_128) {
												Class641.readZonePacket(ZoneProt.aZoneProt_8, -1962835107);
												arg0.serverPacketType = null;
												return true;
											} else if (ServerProt.aServerProt_157 == arg0.serverPacketType) {
												Class357.method27768(-1343475456);
												arg0.serverPacketType = null;
												return false;
											} else if (arg0.serverPacketType == ServerProt.aServerProt_151) {
												Class641.readZonePacket(ZoneProt.aZoneProt_5, 1215619241);
												arg0.serverPacketType = null;
												return true;
											} else if (arg0.serverPacketType == ServerProt.aServerProt_25) {
												local264 = local6.g2_alt1(1309039228);
												local88 = local6.g4(-118643075);
												Class624.aClass120_1.aClass647_1.method32644((Class108) Class21.aClass79_Sub1_Sub1_1.method18261(local264, -1198613208), local88, (byte) 1);
												arg0.serverPacketType = null;
												return true;
											} else if (arg0.serverPacketType == ServerProt.aServerProt_192) {
												local264 = local6.g4_alt3(1730011325);
												if (Class380.userLoyaltyBalance * -1189534179 != local264) {
													Class380.userLoyaltyBalance = local264 * -446903243;
													Class165.method15320(Class155.aClass155_58, -1, -1, -532799195);
												}
												arg0.serverPacketType = null;
												return true;
											} else if (ServerProt.aServerProt_134 == arg0.serverPacketType) {
												local264 = local6.g2(-1434290800);
												local88 = local6.g4_alt2(-196844014);
												local382 = local6.g2_alt1(1206320326);
												local1022 = local6.g2_alt1(826617743);
												Class704.incrementVerifyId((short) 255);
												Class132_Sub1_Sub4_Sub2.method13432(local88, 7, local1022 << 16 | local264, local382, -19442568);
												arg0.serverPacketType = null;
												return true;
											} else if (arg0.serverPacketType == ServerProt.aServerProt_37) {
												if (!client.aBoolean636) {
													try {
														local264 = local6.g1_alt2(-316289143);
														local88 = local6.g1_alt3(1734681998);
														client.aClass270_1.method26280(local264, -566659295).method26407(local88, (byte) 1);
													} catch (@Pc(3002) RuntimeException local3002) {
														Class646.method32608(null, local3002, 279540454);
														Class332.method27394(arg0, -1861087385);
													}
												}
												arg0.serverPacketType = null;
												return true;
											} else {
												@Pc(3022) String local3022;
												if (ServerProt.aServerProt_38 == arg0.serverPacketType) {
													local3022 = local6.gjstr(158923043);
													Class202.method24645(local3022, 462404467);
													arg0.serverPacketType = null;
													return true;
												} else if (arg0.serverPacketType == ServerProt.aServerProt_86) {
													local302 = local6.g1((short) 16384) == 1;
													if (local302) {
														Class322.method27271(3, 487294988);
													} else {
														Class322.method27271(2, -204331083);
													}
													arg0.serverPacketType = null;
													return true;
												} else if (ServerProt.aServerProt_155 == arg0.serverPacketType) {
													local264 = local6.g1_alt2(1183398587);
													local88 = local6.g4_alt1(306086621);
													local382 = local6.g1_alt3(2012896507);
													Class336.aClass644_1.method32591(local382, (byte) 24);
													Class624.aClass120_1.aClass675Array1[local382].method33143(local88, 388168353);
													Class624.aClass120_1.aClass675Array1[local382].method33157(local264, 479175137);
													client.anIntArray320[(client.anInt3542 += 1791453411) * 1101864139 - 1 & 0x3F] = local382;
													arg0.serverPacketType = null;
													return true;
												} else if (arg0.serverPacketType == ServerProt.aServerProt_119) {
													Class274.aClass258_1.method26072(Class280.aClass280_3.method26450(-1728957832), (byte) -50);
													arg0.serverPacketType = null;
													return true;
												} else if (arg0.serverPacketType == ServerProt.aServerProt_124) {
													local264 = local6.gSmart1or2((byte) -27);
													local88 = local6.g4(-118643075);
													local382 = local6.g1((short) 16384);
													local640 = "";
													local646 = local640;
													if ((local382 & 0x1) != 0) {
														local640 = local6.gjstr(601770650);
														if ((local382 & 0x2) == 0) {
															local646 = local640;
														} else {
															local646 = local6.gjstr(1927203846);
														}
													}
													@Pc(3170) String local3170 = local6.gjstr(1510049215);
													if (local264 == 99) {
														Class314.method26939(local3170, -1897442780);
													} else if (local264 == 98) {
														Class136.method10214(local3170, 1970243280);
													} else if (local646.equals("") || !Class476.method29688(local646, (byte) 25)) {
														Class227.method25612(local264, local88, local640, local646, local640, local3170, null, -1948131279);
													} else {
														arg0.serverPacketType = null;
														return true;
													}
													arg0.serverPacketType = null;
													return true;
												} else if (ServerProt.aServerProt_171 == arg0.serverPacketType) {
													local302 = local6.g1((short) 16384) == 1;
													@Pc(3232) byte[] local3232 = new byte[arg0.length * 2010044839 - 1];
													local6.gdata(local3232, 0, arg0.length * 2010044839 - 1, (short) 26379);
													Class490.method29971(local302, local3232, 957530791);
													arg0.serverPacketType = null;
													return true;
												} else if (ServerProt.aServerProt_184 == arg0.serverPacketType) {
													local264 = local6.g4_alt3(972597358);
													local88 = local6.g1_alt1(1719079023);
													local88 = -local88 - 2;
													Class704.incrementVerifyId((short) 255);
													Class132_Sub1_Sub4_Sub2.method13432(local264, 5, local88, 0, -19442568);
													arg0.serverPacketType = null;
													return true;
												} else if (ServerProt.aServerProt_97 == arg0.serverPacketType) {
													local264 = local6.g4(-118643075);
													Class704.incrementVerifyId((short) 255);
													Class132_Sub1_Sub4_Sub2.method13432(local264, 5, client.selfPlayerSlot * -859840571, 0, -19442568);
													arg0.serverPacketType = null;
													return true;
												} else {
													@Pc(3355) boolean local3355;
													@Pc(3365) boolean local3365;
													@Pc(3411) String local3411;
													if (ServerProt.aServerProt_13 == arg0.serverPacketType) {
														local264 = local6.g2(-1434290800);
														@Pc(3322) Class132_Sub1_Sub1_Sub1_Sub2 local3322;
														if (local264 == client.selfPlayerSlot * -859840571) {
															local3322 = Class520.selfPlayer;
														} else {
															local3322 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local264];
														}
														if (local3322 == null) {
															arg0.serverPacketType = null;
															return true;
														}
														local382 = local6.g2(-1434290800);
														@Pc(3347) Class443 local3347 = (Class443) Class107.method18116(Class443.method28866(1029966223), local6.g1((short) 16384), -1915563430);
														local3355 = (local382 & 0x8000) != 0;
														if (local3322.name2 != null && local3322.aClass658_1 != null) {
															local3365 = false;
															if (local3347.aBoolean770) {
																if (!local3355 && (client.userQuickChat1 && !client.userQuickChat2 || client.userQuickChat4)) {
																	local3365 = true;
																} else if (Class476.method29688(local3322.name2, (byte) 57)) {
																	local3365 = true;
																}
															}
															if (!local3365) {
																local1481 = -1;
																if (local3355) {
																	local382 &= 0x7FFF;
																	@Pc(3400) Class434 local3400 = Class5.method31(local6, (byte) 1);
																	local1481 = local3400.anInt4807 * 526894191;
																	local3411 = local3400.aClass93_Sub1_Sub18_1.method22928(local6, (byte) -78);
																} else {
																	local3411 = Class657.method32750(Class433.method28791(local6, 672487471), (byte) 104);
																}
																local3322.method20089(local3411.trim(), local382 >> 8, local382 & 0xFF, -1685399895);
																if (local3347.aBoolean771) {
																	local444 = local3355 ? 17 : 1;
																} else {
																	local444 = local3355 ? 17 : 2;
																}
																if (local3347.anInt4893 * -508329009 == -1) {
																	Class60.method1118(local444, 0, local3322.method20069(true, (byte) -76), local3322.method20072(false, 2091353777), local3322.name1, local3411, null, local1481, local3347, 263839357);
																} else {
																	Class60.method1118(local444, 0, Class346.method27565(local3347.anInt4893 * -508329009, -1614681388) + local3322.method20069(true, (byte) -56), Class346.method27565(local3347.anInt4893 * -508329009, -1614681388) + local3322.method20072(false, 2091353777), local3322.name1, local3411, null, local1481, local3347, 1801292261);
																}
															}
														}
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_197 == arg0.serverPacketType) {
														local264 = local6.g4_alt2(-1653829219);
														local88 = local6.g4(-118643075);
														Class704.incrementVerifyId((short) 255);
														Class132_Sub1_Sub4_Sub2.method13432(local264, 1, local88, -1, -19442568);
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_59 == arg0.serverPacketType) {
														local264 = local6.g2(-1434290800);
														local2070 = local6.g1b_alt1((byte) 53);
														Class704.incrementVerifyId((short) 255);
														Class53_Sub1.method14955(local264, local2070, 54302526);
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_92 == arg0.serverPacketType) {
														Class704.incrementVerifyId((short) 255);
														Class301.method26730((byte) 0);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_77) {
														Class641.readZonePacket(ZoneProt.aZoneProt_13, -2112302429);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_34) {
														local264 = local6.g2_alt1(1278625759);
														if (local264 == 65535) {
															local264 = -1;
														}
														Class274.aClass258_1.method26103(local264, 255, -1653527164);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_102) {
														Class274.aClass258_1.method26076(local6.g2(-1434290800), (byte) 3);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_165) {
														client.anInt3560 = local6.g1((short) 16384) * 175759505;
														client.anInt3550 = client.anInt3565 * -1649412131;
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_187 == arg0.serverPacketType) {
														local264 = local6.g4_alt2(1479496861);
														local88 = local6.g4_alt1(-1239569098);
														Class704.incrementVerifyId((short) 255);
														Class647.method32648(local88, local264, -1850432993);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_98) {
														local3022 = local6.gjstr(-220731705);
														local88 = local6.g2(-1434290800);
														local1018 = Class372.aClass58_2.method1094(local88, -737304293).method22928(local6, (byte) -122);
														Class60.method1118(19, 0, local3022, local3022, local3022, local1018, null, local88, null, 774873463);
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.UPDATE_ZONE_PARTIAL_ENCLOSED == arg0.serverPacketType) {
														Class113_Sub1.zoneUpdateX = local6.g1_alt1(1601450854) * -443032363;
														Class127_Sub1.zoneUpdateZ = (local6.g1b_alt2(914682215) << 3) * 109640353;
														Class252.zoneUpdateLevel = (local6.g1b_alt2(-362655304) << 3) * 578904527;
														while (local6.pos * 212851357 < arg0.length * 2010044839) {
															@Pc(3752) ZoneProt local3752 = ZoneProt.values(1226839941)[local6.g1((short) 16384)];
															Class641.readZonePacket(local3752, 47758259);
														}
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_147) {
														local264 = local6.g2(-1434290800);
														if (local264 == 65535) {
															local264 = -1;
														}
														local88 = local6.g1((short) 16384);
														local382 = local6.g2(-1434290800);
														local1022 = local6.g1((short) 16384);
														Class274.aClass258_1.method26098(Class275.aClass275_13, local264, local88, local1022, Class280.aClass280_3.method26450(-415497501), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 256, local382, -1652971545);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_135) {
														local264 = local6.g1((short) 16384);
														@Pc(3823) Class700 local3823 = (Class700) Class107.method18116(Class354.method27692(-247957344), local264, -1915563430);
														if (local3823 == null) {
															local3823 = Class700.aClass700_9;
														}
														Class486.method29805(local3823, 1189701933);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_145) {
														client.aClass660_2 = (Class660) Class107.method18116(Class660.method32819(-469245072), local6.g1_alt3(1664250854), -1915563430);
														if (client.aClass660_2 == null) {
															client.aClass660_2 = Class660.aClass660_5;
														}
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_73 == arg0.serverPacketType) {
														if (!client.aBoolean636) {
															try {
																local264 = local6.g1((short) 16384);
																client.aClass270_1.method26289(local264, -446233009);
															} catch (@Pc(3875) RuntimeException local3875) {
																Class646.method32608(null, local3875, 1232093395);
																Class332.method27394(arg0, -1824597658);
															}
														}
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_61) {
														Class113_Sub1.zoneUpdateX = local6.g1((short) 16384) * -443032363;
														Class127_Sub1.zoneUpdateZ = (local6.g1b_alt2(1791850876) << 3) * 109640353;
														Class252.zoneUpdateLevel = (local6.g1b(1499862713) << 3) * 578904527;
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_183) {
														local264 = local6.g4(-118643075);
														local88 = local6.g2(-1434290800);
														if (local88 == 65535) {
															local88 = -1;
														}
														local382 = local6.g2_alt2(1940919633);
														local1022 = local6.g2_alt2(2021399983);
														if (local1022 == 65535) {
															local1022 = -1;
														}
														Class704.incrementVerifyId((short) 255);
														for (local396 = local1022; local396 <= local88; local396++) {
															local1327 = (long) local396 + ((long) local264 << 32);
															local1993 = (Class93_Sub19) client.aClass16_19.method214(local1327);
															if (local1993 != null) {
																local2010 = new Class93_Sub19(local1993.anInt1550 * -622772683, local382);
																local1993.method23969(-766247578);
															} else if (local396 == -1) {
																local2010 = new Class93_Sub19(Class659.method32808(local264, 1985723725).aClass93_Sub19_2.anInt1550 * -622772683, local382);
															} else {
																local2010 = new Class93_Sub19(0, local382);
															}
															client.aClass16_19.method220(local2010, local1327);
														}
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_140 == arg0.serverPacketType) {
														local264 = local6.g2(-1434290800);
														client.anInt3556 = -389330083;
														client.anInt3462 = local264 * 654237073;
														client.anInt3463 = 778026626;
														ClientProt.aClass497_117.method30071(client.anInt3462 * 1756332913, -512225963);
														Class436.method28812(-916881791);
														Class264.method26209((byte) -22);
														local88 = local6.g2(-1434290800);
														client.anInt3425 = local88 * 996908785;
														local382 = local6.g1((short) 16384);
														Class36.aPacket_1 = new Packet(local382);
														Class36.aPacket_1.pdata(local6.data, local6.pos * 212851357, local382, 2026842986);
														local6.pos += local382 * -1445626955;
														arg0.serverPacketType = null;
														return false;
													} else if (ServerProt.aServerProt_131 == arg0.serverPacketType) {
														Class641.readZonePacket(ZoneProt.aZoneProt_15, -566224322);
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_5 == arg0.serverPacketType) {
														if (Class4.aBoolean2 && Class125_Sub2_Sub1.aFrame1 != null) {
															Class717.method36895(Class51.options.aClass166_Sub23_1.method15844(1404386831), -1, -1, false, (byte) 116);
														}
														local611 = new byte[arg0.length * 2010044839];
														local6.gIsaacArrayBuffer(local611, 0, arg0.length * 2010044839, 405047961);
														local1571 = Class155.method15306(local611, 0, arg0.length * 2010044839, (byte) -38);
														Class338.method27464(local1571, true, client.aBoolean596, (byte) -115);
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_132 == arg0.serverPacketType) {
														local264 = local6.g4_alt1(-1146276882);
														local88 = local6.g2_alt2(1651602820);
														Class704.incrementVerifyId((short) 255);
														Class128_Sub1_Sub1.method19648(local88, local264, -18790430);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_139) {
														local264 = local6.g4_alt2(-526180383);
														local88 = local6.g4_alt2(-1977085613);
														Class704.incrementVerifyId((short) 255);
														@Pc(4194) Class93_Sub40 local4194 = (Class93_Sub40) client.aClass16_22.method214((long) local264);
														@Pc(4200) Class93_Sub40 local4200 = (Class93_Sub40) client.aClass16_22.method214((long) local88);
														if (local4200 != null) {
															Class372.method28019(local4200, local4194 == null || local4194.anInt3172 * 1220811495 != local4200.anInt3172 * 1220811495, false, 1062638255);
														}
														if (local4194 != null) {
															local4194.method23969(-872509203);
															client.aClass16_22.method220(local4194, (long) local88);
														}
														@Pc(4236) Class312 local4236 = Class659.method32808(local264, -232961373);
														if (local4236 != null) {
															Class354.method27694(local4236, -1174743804);
														}
														local4236 = Class659.method32808(local88, 45940829);
														if (local4236 != null) {
															Class354.method27694(local4236, -1174743804);
															Class548.method31015(Class166_Sub1.aClass320Array1[local4236.anInt3953 * -1549590237 >>> 16], local4236, true, 1224672848);
														}
														if (client.anInt3526 * -703563959 != -1) {
															Class189.method24583(client.anInt3526 * -703563959, 1, 1879122973);
														}
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_67) {
														local264 = local6.g4_alt1(-1852824935);
														local88 = local6.g2_alt2(1877270906);
														local382 = local6.g4_alt3(-1620217792);
														Class704.incrementVerifyId((short) 255);
														Class132_Sub1_Sub4_Sub2.method13432(local382, 3, local88, local264, -19442568);
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_110 == arg0.serverPacketType) {
														local346 = local6.g1b(524803479);
														Class520.selfPlayer.method20047(local6, local346, -237524841);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_193) {
														while (local6.pos * 212851357 < arg0.length * 2010044839) {
															local264 = local6.g1((short) 16384);
															local273 = (local264 & 0x1) == 1;
															local1018 = local6.gjstr(573192536);
															local640 = local6.gjstr(1212981529);
															local646 = local6.gjstr(597998901);
															for (local398 = 0; local398 < client.anInt3573 * 1882800101; local398++) {
																@Pc(4375) Class177 local4375 = client.aClass177Array1[local398];
																if (local273) {
																	if (local640.equals(local4375.aString125)) {
																		local4375.aString125 = local1018;
																		local4375.aString123 = local640;
																		local1018 = null;
																		break;
																	}
																} else if (local1018.equals(local4375.aString125)) {
																	local4375.aString125 = local1018;
																	local4375.aString123 = local640;
																	local4375.aString124 = local646;
																	local1018 = null;
																	break;
																}
															}
															if (local1018 != null && client.anInt3573 * 1882800101 < 400) {
																@Pc(4421) Class177 local4421 = new Class177();
																client.aClass177Array1[client.anInt3573 * 1882800101] = local4421;
																local4421.aString125 = local1018;
																local4421.aString123 = local640;
																local4421.aString124 = local646;
																local4421.aBoolean568 = (local264 & 0x2) == 2;
																client.anInt3573 += 335078893;
															}
														}
														client.anInt3547 = client.anInt3565 * -541355657;
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_185) {
														local264 = local6.g4_alt1(-381041351);
														local1571 = local6.gjstr(208378147);
														Class704.incrementVerifyId((short) 255);
														Class239.method25820(local264, local1571, (byte) -40);
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_191 == arg0.serverPacketType) {
														client.anInt3551 = client.anInt3565 * 1524761337;
														@Pc(4498) Class303 local4498 = new Class303(local6, client.anInterface27_1);
														local4498.method26741(Class557.aClass297_1, -894576729);
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_150) {
														local264 = local6.g4_alt1(-440259584);
														local88 = local6.g2_alt2(1742699273);
														local382 = local6.g2_alt1(1998562807);
														local1022 = local6.g1_alt1(1692157547);
														Class704.incrementVerifyId((short) 255);
														Class32_Sub1.method16593(local264, local1022, local88, local382, -1927387276);
														arg0.serverPacketType = null;
														return true;
													} else if (ServerProt.aServerProt_104 == arg0.serverPacketType) {
														Class624.aClass120_1.aClass647_1.method32643((byte) -89);
														client.anInt3539 += 1490119744;
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_130) {
														Class626.userDob = local6.g3s(-87715282) * 889370685;
														client.userQuickChat1 = local6.g1((short) 16384) == 1;
														arg0.serverPacketType = null;
														return true;
													} else if (arg0.serverPacketType == ServerProt.aServerProt_161) {
														if (!client.aBoolean636) {
															try {
																local264 = local6.g4_alt1(-1237998224);
																local2070 = local6.g1b_alt1((byte) 51);
																client.aClass270_1.method26285(new Class279(local264), local2070, -773926848);
															} catch (@Pc(4607) RuntimeException local4607) {
																Class646.method32608(null, local4607, 1736266582);
																Class332.method27394(arg0, 1621563870);
															}
														}
														arg0.serverPacketType = null;
														return true;
													} else {
														@Pc(4737) int local4737;
														@Pc(4665) long local4665;
														@Pc(4667) boolean local4667;
														if (arg0.serverPacketType == ServerProt.aServerProt_94) {
															local302 = local6.g1((short) 16384) == 1;
															local1571 = local6.gjstr(2008455286);
															local2422 = local6.g2(-1434290800);
															local2427 = local6.g3((short) 2573);
															local2436 = (Class443) Class107.method18116(Class443.method28866(1526847246), local6.g1((short) 16384), -1915563430);
															local1481 = local6.g2(-1434290800);
															local4665 = (local2422 << 32) + local2427;
															local4667 = false;
															local1628 = null;
															@Pc(4675) Class93_Sub28 local4675 = local302 ? Class121.aClass93_Sub28_2 : Class253.aClass93_Sub28_3;
															if (local4675 == null) {
																local4667 = true;
															} else {
																local1630 = 0;
																while (true) {
																	if (local1630 >= 100) {
																		if (local2436.aBoolean770 && Class476.method29688(local1571, (byte) 126)) {
																			local4667 = true;
																		}
																		break;
																	}
																	if (client.aLongArray23[local1630] == local4665) {
																		local4667 = true;
																		break;
																	}
																	local1630++;
																}
															}
															if (!local4667) {
																client.aLongArray23[client.anInt3564 * -254980857] = local4665;
																client.anInt3564 = (client.anInt3564 * -254980857 + 1) % 100 * -1639542601;
																local2782 = Class372.aClass58_2.method1094(local1481, -737304293).method22928(local6, (byte) -12);
																local4737 = local302 ? 42 : 45;
																if (local2436.anInt4893 * -508329009 == -1) {
																	Class60.method1118(local4737, 0, local1571, local1571, local1571, local2782, local4675.aString44, local1481, local2436, 1307952090);
																} else {
																	Class60.method1118(local4737, 0, Class346.method27565(local2436.anInt4893 * -508329009, -1614681388) + local1571, Class346.method27565(local2436.anInt4893 * -508329009, -1614681388) + local1571, local1571, local2782, local4675.aString44, local1481, local2436, 1541788553);
																}
															}
															arg0.serverPacketType = null;
															return true;
														} else if (ServerProt.aServerProt_141 == arg0.serverPacketType) {
															Class172.anInt3177 = local6.g1((short) 16384) * 676443409;
															arg0.serverPacketType = null;
															return true;
														} else if (ServerProt.aServerProt_179 == arg0.serverPacketType) {
															Class127_Sub1.zoneUpdateZ = (local6.g1b_alt2(122392661) << 3) * 109640353;
															Class113_Sub1.zoneUpdateX = local6.g1_alt2(445436525) * -443032363;
															Class252.zoneUpdateLevel = (local6.g1b_alt3(56848332) << 3) * 578904527;
															@Pc(4842) Class611 local4842 = client.world.method30455(2146217094);
															for (@Pc(4847) Class93_Sub5 local4847 = (Class93_Sub5) client.aClass16_20.method227((byte) -9); local4847 != null; local4847 = (Class93_Sub5) client.aClass16_20.method229(1780172229)) {
																local382 = (int) (local4847.aLong232 * -3750704643647536275L >> 28 & 0x3L);
																local1022 = (int) (local4847.aLong232 * -3750704643647536275L & 0x3FFFL);
																local396 = local1022 - local4842.anInt5623 * 270611681;
																local398 = (int) (local4847.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
																local416 = local398 - local4842.anInt5624 * -1994307635;
																if (Class113_Sub1.zoneUpdateX * 1733983357 == local382 && local396 >= Class252.zoneUpdateLevel * 717882671 && local396 < Class252.zoneUpdateLevel * 717882671 + 8 && local416 >= Class127_Sub1.zoneUpdateZ * -1456641695 && local416 < Class127_Sub1.zoneUpdateZ * -1456641695 + 8) {
																	local4847.method23969(-1539304530);
																	if (local396 >= 0 && local416 >= 0 && local396 < client.world.method30459(-120469629) && local416 < client.world.method30466((short) 128)) {
																		Class518.method30305(Class113_Sub1.zoneUpdateX * 1733983357, local396, local416, 1884733777);
																	}
																}
															}
															@Pc(4956) Class93_Sub8 local4956;
															for (local4956 = (Class93_Sub8) Class93_Sub8.aClass22_18.method428((byte) 7); local4956 != null; local4956 = (Class93_Sub8) Class93_Sub8.aClass22_18.method442(979165561)) {
																if (local4956.anInt1462 * -1824529811 >= Class252.zoneUpdateLevel * 717882671 && local4956.anInt1462 * -1824529811 < Class252.zoneUpdateLevel * 717882671 + 8 && local4956.anInt1464 * 275343381 >= Class127_Sub1.zoneUpdateZ * -1456641695 && local4956.anInt1464 * 275343381 < Class127_Sub1.zoneUpdateZ * -1456641695 + 8 && local4956.anInt1471 * -960255437 == Class113_Sub1.zoneUpdateX * 1733983357) {
																	local4956.aBoolean309 = true;
																}
															}
															for (local4956 = (Class93_Sub8) Class93_Sub8.aClass22_19.method428((byte) 84); local4956 != null; local4956 = (Class93_Sub8) Class93_Sub8.aClass22_19.method442(279822332)) {
																if (local4956.anInt1462 * -1824529811 >= Class252.zoneUpdateLevel * 717882671 && local4956.anInt1462 * -1824529811 < Class252.zoneUpdateLevel * 717882671 + 8 && local4956.anInt1464 * 275343381 >= Class127_Sub1.zoneUpdateZ * -1456641695 && local4956.anInt1464 * 275343381 < Class127_Sub1.zoneUpdateZ * -1456641695 + 8 && local4956.anInt1471 * -960255437 == Class113_Sub1.zoneUpdateX * 1733983357) {
																	local4956.aBoolean309 = true;
																}
															}
															arg0.serverPacketType = null;
															return true;
														} else if (ServerProt.aServerProt_68 == arg0.serverPacketType) {
															local264 = local6.g1_alt3(1968146961);
															local88 = local6.g2_alt2(1927896951);
															Class624.aClass120_1.aClass647_1.method32647((Class379) Class30.aClass32_Sub16_1.method18261(local88, -268898598), local264, -1052372268);
															arg0.serverPacketType = null;
															return true;
														} else if (arg0.serverPacketType == ServerProt.aServerProt_30) {
															client.anInt3572 = 671281251;
															client.anInt3547 = client.anInt3565 * -541355657;
															arg0.serverPacketType = null;
															return true;
														} else if (arg0.serverPacketType == ServerProt.aServerProt_76) {
															local264 = local6.g4_alt1(-1943851137);
															Class704.incrementVerifyId((short) 255);
															Class132_Sub1_Sub4_Sub2.method13432(local264, 3, client.selfPlayerSlot * -859840571, 0, -19442568);
															arg0.serverPacketType = null;
															return true;
														} else if (arg0.serverPacketType == ServerProt.aServerProt_163) {
															client.anInt3517 = client.anInt3565 * -879973135;
															local264 = local6.pos * 212851357;
															local88 = local6.g2(-1434290800);
															local742 = local6.g1((short) 16384) == 1;
															@Pc(5173) Class304 local5173 = Class557.aClass297_1.method26646(local88, 1022142915);
															@Pc(5177) Class40 local5177 = local5173.method26790(-2028815468);
															if (local5177 == null || local742) {
																local5173.method26788(client.anInterface27_1, (byte) 93);
																local5177 = local5173.method26790(-2063202461);
															}
															while (arg0.length * 2010044839 - (local6.pos * 212851357 - local264) > 0) {
																@Pc(5206) Class466 local5206 = Class21.aClass79_Sub1_Sub1_1.method1468(local6, (byte) 25);
																local5177.method776(local5206.anInt5092 * -1181855333, local5206.anObject19, (byte) 104);
															}
															arg0.serverPacketType = null;
															return true;
														} else if (arg0.serverPacketType == ServerProt.aServerProt_162) {
															local264 = local6.g4_alt2(-752923859);
															if (Class351.userJcoinsBalance * 225309145 != local264) {
																Class351.userJcoinsBalance = local264 * 2104983145;
																Class165.method15320(Class155.aClass155_60, -1, -1, -532799195);
															}
															arg0.serverPacketType = null;
															return true;
														} else if (ServerProt.aServerProt_53 == arg0.serverPacketType) {
															local264 = local6.g4(-118643075);
															local88 = local6.g4(-118643075);
															@Pc(5266) ClientMessage local5266 = Class102.createGameMessage(ClientProt.aClientProt_114, arg0.clientIsaac, (byte) 124);
															local5266.packet.p4_alt1(local264, 907143239);
															local5266.packet.p4_alt3(local88, (byte) -120);
															local5266.packet.p1_alt2(client.anInt3407 * 1249273355, 911421584);
															arg0.send(local5266, -2138973824);
															arg0.serverPacketType = null;
															return true;
														} else if (ServerProt.aServerProt_40 == arg0.serverPacketType) {
															local264 = local6.g4_alt2(720755282);
															local88 = local6.g4_alt1(1257529704);
															local382 = local6.g4_alt2(-1651721613);
															local1022 = local6.g4(-118643075);
															local6.g1((short) 16384);
															local396 = local6.g2_alt3(16711680);
															Class704.incrementVerifyId((short) 255);
															@Pc(5342) int[] local5342 = new int[] { local382, local1022, local88, local264 };
															client.anInt3526 = local396 * 823798521;
															Class93_Sub31.method22008(local396, local5342, (byte) 53);
															Class618.method32103(false, -1468269186);
															Class56.method18034(client.anInt3526 * -703563959, local5342, 1601801992);
															for (local416 = 0; local416 < 114; local416++) {
																client.aBooleanArray22[local416] = true;
															}
															arg0.serverPacketType = null;
															return true;
														} else if (ServerProt.aServerProt_7 == arg0.serverPacketType) {
															local264 = local6.g4_alt3(697297611);
															local88 = local6.g4(-118643075);
															local382 = local6.g1_alt1(990163983);
															local1022 = local6.g1((short) 16384);
															local396 = local6.g1_alt2(-212046991);
															local398 = local264 >> 28;
															local416 = local264 >> 14 & 0x3FFF;
															local1481 = local264 & 0x3FFF;
															Class274.aClass258_1.method26120(local88, local1022, true, local398, local416 << 9, local1481 << 9, local382 << 9, local396 << 9, (byte) 19);
															arg0.serverPacketType = null;
															return true;
														} else if (ServerProt.aServerProt_57 == arg0.serverPacketType) {
															local264 = local6.g2(-1434290800);
															local88 = local6.g2(-1434290800);
															local382 = local6.g2(-1434290800);
															Class704.incrementVerifyId((short) 255);
															if (Class166_Sub1.aClass320Array1[local264] != null) {
																for (local1022 = local88; local1022 < local382; local1022++) {
																	local396 = local6.g3((short) -7143);
																	if (local1022 < Class166_Sub1.aClass320Array1[local264].aClass312Array3.length && Class166_Sub1.aClass320Array1[local264].aClass312Array3[local1022] != null) {
																		Class166_Sub1.aClass320Array1[local264].aClass312Array3[local1022].anInt3968 = local396 * -1218807123;
																	}
																}
															}
															arg0.serverPacketType = null;
															return true;
														} else if (arg0.serverPacketType == ServerProt.aServerProt_166) {
															local264 = local6.g2(-1434290800);
															local88 = local6.g2(-1434290800);
															Class274.aClass258_1.method26064(local264, local88, -898208304);
															arg0.serverPacketType = null;
															return true;
														} else if (ServerProt.aServerProt_181 == arg0.serverPacketType) {
															if (Class56.method18036(client.state * -849002901, -1497248091)) {
																client.anInt3453 = (int) ((float) local6.g2(-1434290800) * 2.5F) * -172784017;
															} else {
																client.anInt3453 = local6.g2(-1434290800) * -888553214;
															}
															client.anInt3550 = client.anInt3565 * -1649412131;
															arg0.serverPacketType = null;
															return true;
														} else if (arg0.serverPacketType == ServerProt.aServerProt_88) {
															if (Class637.aClass113_1 == null) {
																Class637.aClass113_1 = new Class113(Class39.aClass79_Sub1_Sub2_1);
															}
															@Pc(5577) Class466 local5577 = Class39.aClass79_Sub1_Sub2_1.method1468(local6, (byte) 17);
															Class637.aClass113_1.anInterface3_2.method776(local5577.anInt5092 * -1181855333, local5577.anObject19, (byte) 124);
															client.anIntArray305[(client.anInt3545 += 668121207) * -1261133497 - 1 & 0x3F] = local5577.anInt5092 * -1181855333;
															arg0.serverPacketType = null;
															return true;
														} else if (arg0.serverPacketType == ServerProt.aServerProt_199) {
															local264 = local6.g2(-1434290800);
															if (local264 == 65535) {
																local264 = -1;
															}
															local88 = local6.g1((short) 16384);
															local382 = local6.g2(-1434290800);
															local1022 = local6.g1((short) 16384);
															local396 = local6.g2(-1434290800);
															local398 = local6.g2(-1434290800);
															@Pc(5661) Class539 local5661 = Class274.aClass258_1.method26097(Class275.aClass275_13, Class274.aClass258_1, local264, local88, local1022, Class280.aClass280_7.method26450(-599628359), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local396, false, 1217985986);
															if (local5661 != null) {
																Class274.aClass258_1.method26049(local5661, local398, local382, 889132506);
															}
															arg0.serverPacketType = null;
															return true;
														} else if (arg0.serverPacketType == ServerProt.aServerProt_148) {
															client.anInt3581 = local6.g2s((byte) -76) * 726203003;
															client.anInt3550 = client.anInt3565 * -1649412131;
															arg0.serverPacketType = null;
															return true;
														} else {
															@Pc(5706) PacketBit local5706;
															if (arg0.serverPacketType == ServerProt.REBUILD_REGION) {
																local5706 = new PacketBit(arg0.length * 2010044839);
																System.arraycopy(arg0.packet.data, arg0.packet.pos * 212851357, local5706.data, 0, arg0.length * 2010044839);
																Class285.method26515(2090069692);
																if (Class51.options.aClass166_Sub47_1.method16557((short) 512) == 1) {
																	Class392.aClass541_1.method30906(new Class537(Class526.REGION, local5706), (byte) -101);
																} else {
																	client.world.beginRebuild(new Class537(Class526.REGION, local5706), 679532319);
																}
																arg0.serverPacketType = null;
																return false;
															}
															@Pc(5779) Class443 local5779;
															if (arg0.serverPacketType == ServerProt.aServerProt_117) {
																local3022 = local6.gjstr(-142622958);
																local1316 = local6.g2(-1434290800);
																local1321 = local6.g3((short) 7810);
																local5779 = (Class443) Class107.method18116(Class443.method28866(1954657315), local6.g1((short) 16384), -1915563430);
																local1596 = local6.g1((short) 16384) == 1;
																local2442 = (local1316 << 32) + local1321;
																local2444 = false;
																if (Class557.aClass297_1 == null) {
																	local2444 = true;
																} else {
																	local1385 = 0;
																	while (true) {
																		if (local1385 >= 100) {
																			if (local5779.aBoolean770) {
																				if (client.userQuickChat1 && !client.userQuickChat2 || client.userQuickChat4) {
																					local2444 = true;
																				} else if (Class476.method29688(local3022, (byte) 127)) {
																					local2444 = true;
																				}
																			}
																			break;
																		}
																		if (local2442 == client.aLongArray23[local1385]) {
																			local2444 = true;
																			break;
																		}
																		local1385++;
																	}
																}
																if (!local2444) {
																	client.aLongArray23[client.anInt3564 * -254980857] = local2442;
																	client.anInt3564 = (client.anInt3564 * -254980857 + 1) % 100 * -1639542601;
																	@Pc(5860) String local5860 = Class657.method32750(Class433.method28791(local6, 672487471), (byte) 12);
																	local2460 = local1596 ? 22 : 24;
																	if (local5779.anInt4893 * -508329009 == -1) {
																		Class60.method1118(local2460, 0, local3022, local3022, local3022, local5860, Class557.aClass297_1.method26650(791603728), -1, local5779, 1761459632);
																	} else {
																		Class60.method1118(local2460, 0, Class346.method27565(local5779.anInt4893 * -508329009, -1614681388) + local3022, Class346.method27565(local5779.anInt4893 * -508329009, -1614681388) + local3022, local3022, local5860, Class557.aClass297_1.method26650(1390113594), -1, local5779, 1346093179);
																	}
																}
																arg0.serverPacketType = null;
																return true;
															} else if (arg0.serverPacketType == ServerProt.aServerProt_133) {
																arg0.serverPacketType = null;
																return false;
															} else if (arg0.serverPacketType == ServerProt.aServerProt_83) {
																local264 = local6.g1((short) 16384);
																local88 = local264 >> 5;
																local382 = local264 & 0x1F;
																if (local382 == 0) {
																	client.aClass173Array1[local88] = null;
																	arg0.serverPacketType = null;
																	return true;
																}
																@Pc(5968) Class173 local5968 = new Class173();
																local5968.anInt3247 = local382 * -310255637;
																local5968.anInt3253 = local6.g1((short) 16384) * -1863451725;
																if (local5968.anInt3253 * -2053428357 >= 0 && local5968.anInt3253 * -2053428357 < Class707.aClass100Array9.length) {
																	if (local5968.anInt3247 * 1661685955 == 1 || local5968.anInt3247 * 1661685955 == 10) {
																		local5968.anInt3246 = local6.g2(-1434290800) * -1525725567;
																		local5968.anInt3245 = local6.g2(-1434290800) * -628817299;
																		local6.pos += -1487540524;
																	} else if (local5968.anInt3247 * 1661685955 >= 2 && local5968.anInt3247 * 1661685955 <= 6) {
																		if (local5968.anInt3247 * 1661685955 == 2) {
																			local5968.anInt3248 = 1520625920;
																			local5968.anInt3249 = -886148864;
																		}
																		if (local5968.anInt3247 * 1661685955 == 3) {
																			local5968.anInt3248 = 0;
																			local5968.anInt3249 = -886148864;
																		}
																		if (local5968.anInt3247 * 1661685955 == 4) {
																			local5968.anInt3248 = -1253715456;
																			local5968.anInt3249 = -886148864;
																		}
																		if (local5968.anInt3247 * 1661685955 == 5) {
																			local5968.anInt3248 = 1520625920;
																			local5968.anInt3249 = 0;
																		}
																		if (local5968.anInt3247 * 1661685955 == 6) {
																			local5968.anInt3248 = 1520625920;
																			local5968.anInt3249 = -1772297728;
																		}
																		local5968.anInt3247 = -620511274;
																		local5968.anInt3251 = local6.g1((short) 16384) * 423246855;
																		@Pc(6111) Class611 local6111 = client.world.method30455(2105964725);
																		local5968.anInt3248 += (local6.g2(-1434290800) - local6111.anInt5623 * 270611681 << 9) * -950361367;
																		local5968.anInt3249 += (local6.g2(-1434290800) - local6111.anInt5624 * -1994307635 << 9) * 1909141105;
																		local5968.anInt3244 = (local6.g1((short) 16384) << 2) * -687642585;
																		local5968.anInt3250 = local6.g2(-1434290800) * -590747563;
																	}
																	local5968.anInt3252 = local6.g4(-118643075) * 1490595561;
																	client.aClass173Array1[local88] = local5968;
																}
																arg0.serverPacketType = null;
																return true;
															} else {
																@Pc(6319) int local6319;
																@Pc(6449) int local6449;
																@Pc(6606) boolean local6606;
																if (arg0.serverPacketType == ServerProt.aServerProt_74) {
																	local264 = local6.g1((short) 16384);
																	local88 = local6.g2_alt2(1921715726);
																	local382 = local6.g4_alt1(820918448);
																	local1022 = local6.g2(-1434290800);
																	if (local1022 == 65535) {
																		local1022 = -1;
																	}
																	local396 = local6.g2(-1434290800);
																	local398 = local6.g1_alt2(1955994316);
																	local416 = local264 & 0x7;
																	local1481 = local264 >> 3 & 0xF;
																	if (local1481 == 15) {
																		local1481 = -1;
																	}
																	@Pc(6236) boolean local6236 = (local264 >> 7 & 0x1) == 1;
																	@Pc(6321) int local6321;
																	if (local382 >> 30 == 0) {
																		@Pc(6426) Class697 local6426;
																		@Pc(6444) Class263 local6444;
																		@Pc(6550) int local6550;
																		@Pc(6497) Class263 local6497;
																		if (local382 >> 29 != 0) {
																			local1343 = local382 & 0xFFFF;
																			@Pc(6387) Class93_Sub15 local6387 = (Class93_Sub15) client.aClass16_18.method214((long) local1343);
																			if (local6387 != null) {
																				@Pc(6394) Class132_Sub1_Sub1_Sub1_Sub1 local6394 = (Class132_Sub1_Sub1_Sub1_Sub1) local6387.anObject5;
																				@Pc(6399) Class554 local6399 = local6394.aClass554Array3[local398];
																				if (local1022 == 65535) {
																					local1022 = -1;
																				}
																				@Pc(6406) boolean local6406 = true;
																				local6319 = local6399.anInt5319 * 601549465;
																				if (local1022 != -1 && local6319 != -1) {
																					if (local1022 == local6319) {
																						local6426 = (Class697) Class501.aClass32_Sub18_1.method18261(local1022, 1976847151);
																						if (local6426.aBoolean881 && local6426.anInt5949 * 1477426425 != -1) {
																							local6444 = (Class263) Class32.aClass32_Sub17_23.method18261(local6426.anInt5949 * 1477426425, 1837841847);
																							local6449 = local6444.anInt3868 * 23893545;
																							if (local6449 == 0 || local6449 == 2) {
																								local6406 = false;
																							} else if (local6449 == 1) {
																								local6406 = true;
																							}
																						}
																					} else {
																						local6426 = (Class697) Class501.aClass32_Sub18_1.method18261(local1022, 1304716190);
																						@Pc(6476) Class697 local6476 = (Class697) Class501.aClass32_Sub18_1.method18261(local6319, -1428184760);
																						if (local6426.anInt5949 * 1477426425 != -1 && local6476.anInt5949 * 1477426425 != -1) {
																							local6497 = (Class263) Class32.aClass32_Sub17_23.method18261(local6426.anInt5949 * 1477426425, -1244049067);
																							@Pc(6506) Class263 local6506 = (Class263) Class32.aClass32_Sub17_23.method18261(local6476.anInt5949 * 1477426425, -1975605848);
																							if (local6497.anInt3873 * -1789992573 < local6506.anInt3873 * -1789992573) {
																								local6406 = false;
																							}
																						}
																					}
																				}
																				if (local6406) {
																					local6399.anInt5319 = local1022 * -1020147287;
																					local6399.anInt5322 = local88 * 1878659233;
																					local6399.anInt5320 = local1481 * -768943269;
																					if (local1022 == -1) {
																						local6399.aClass19_7.method23566(-1, 548405676);
																					} else {
																						local6426 = (Class697) Class501.aClass32_Sub18_1.method18261(local1022, -1482443758);
																						local6550 = local6426.aBoolean881 ? 0 : 2;
																						if (local6236) {
																							local6550 = 1;
																						}
																						local6399.aClass19_7.method23572(local6426.anInt5949 * 1477426425, local396, local6550, false, (short) -17931);
																					}
																				}
																			}
																		} else if (local382 >> 28 != 0) {
																			local1343 = local382 & 0xFFFF;
																			@Pc(6587) Class132_Sub1_Sub1_Sub1_Sub2 local6587;
																			if (local1343 == client.selfPlayerSlot * -859840571) {
																				local6587 = Class520.selfPlayer;
																			} else {
																				local6587 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local1343];
																			}
																			if (local6587 != null) {
																				@Pc(6599) Class554 local6599 = local6587.aClass554Array3[local398];
																				if (local1022 == 65535) {
																					local1022 = -1;
																				}
																				local6606 = true;
																				local4737 = local6599.anInt5319 * 601549465;
																				@Pc(6626) Class697 local6626;
																				if (local1022 != -1 && local4737 != -1) {
																					if (local4737 == local1022) {
																						local6626 = (Class697) Class501.aClass32_Sub18_1.method18261(local1022, 24990014);
																						if (local6626.aBoolean881 && local6626.anInt5949 * 1477426425 != -1) {
																							@Pc(6644) Class263 local6644 = (Class263) Class32.aClass32_Sub17_23.method18261(local6626.anInt5949 * 1477426425, -847696505);
																							local6550 = local6644.anInt3868 * 23893545;
																							if (local6550 == 0 || local6550 == 2) {
																								local6606 = false;
																							} else if (local6550 == 1) {
																								local6606 = true;
																							}
																						}
																					} else {
																						local6626 = (Class697) Class501.aClass32_Sub18_1.method18261(local1022, 1739710540);
																						local6426 = (Class697) Class501.aClass32_Sub18_1.method18261(local4737, 115928935);
																						if (local6626.anInt5949 * 1477426425 != -1 && local6426.anInt5949 * 1477426425 != -1) {
																							local6444 = (Class263) Class32.aClass32_Sub17_23.method18261(local6626.anInt5949 * 1477426425, -594630281);
																							local6497 = (Class263) Class32.aClass32_Sub17_23.method18261(local6426.anInt5949 * 1477426425, 1341201013);
																							if (local6444.anInt3873 * -1789992573 < local6497.anInt3873 * -1789992573) {
																								local6606 = false;
																							}
																						}
																					}
																				}
																				if (local6606) {
																					local6599.anInt5319 = local1022 * -1020147287;
																					local6599.anInt5322 = local88 * 1878659233;
																					local6599.anInt5320 = local1481 * -768943269;
																					local6599.anInt5321 = local416 * -1443403675;
																					if (local1022 == -1) {
																						local6599.aClass19_7.method23566(-1, 783762761);
																					} else {
																						local6626 = (Class697) Class501.aClass32_Sub18_1.method18261(local1022, 419216227);
																						local6321 = local6626.aBoolean881 ? 0 : 2;
																						if (local6236) {
																							local6321 = 1;
																						}
																						local6599.aClass19_7.method23572(local6626.anInt5949 * 1477426425, local396, local6321, false, (short) 10718);
																					}
																				}
																			}
																		}
																	} else {
																		local2186 = client.world.method30455(1891785021);
																		local1385 = local382 >> 28 & 0x3;
																		local2460 = (local382 >> 14 & 0x3FFF) - local2186.anInt5623 * 270611681;
																		local1630 = (local382 & 0x3FFF) - local2186.anInt5624 * -1994307635;
																		if (local2460 >= 0 && local1630 >= 0 && local2460 < client.world.method30459(-1269226992) && local1630 < client.world.method30466((short) 128)) {
																			if (local1022 == -1) {
																				@Pc(6297) Class93_Sub1_Sub9 local6297 = (Class93_Sub1_Sub9) client.aClass16_21.method214((long) (local2460 << 16 | local1630));
																				if (local6297 != null) {
																					local6297.aClass132_Sub1_Sub1_Sub5_1.method24109((byte) 32);
																					local6297.method23969(702588783);
																				}
																			} else {
																				local4737 = local2460 * 512 + 256;
																				local6319 = local1630 * 512 + 256;
																				local6321 = local1385;
																				if (local1385 < 3 && client.world.method30487(1445720078).method30330(local2460, local1630, -662808309)) {
																					local6321 = local1385 + 1;
																				}
																				@Pc(6360) Class132_Sub1_Sub1_Sub5 local6360 = new Class132_Sub1_Sub1_Sub5(client.world.method30481(-1767872629), local1022, local396, local1385, local6321, local4737, Class305.method26802(local4737, local6319, local1385, (byte) -73) - local88, local6319, local2460, local2460, local1630, local1630, local416, local6236, 0);
																				client.aClass16_21.method220(new Class93_Sub1_Sub9(local6360), (long) (local2460 << 16 | local1630));
																			}
																		}
																	}
																	arg0.serverPacketType = null;
																	return true;
																} else if (ServerProt.aServerProt_9 == arg0.serverPacketType) {
																	local264 = local6.g2_alt2(1832067719);
																	local88 = local6.g1_alt1(1587300189);
																	local382 = local6.g1_alt2(1064732489);
																	local1022 = local6.g1_alt3(1748971524);
																	local396 = local6.g1((short) 16384);
																	Class704.incrementVerifyId((short) 255);
																	client.aBooleanArray21[local88] = true;
																	client.anIntArray328[local88] = local382;
																	client.anIntArray329[local88] = local1022;
																	client.anIntArray330[local88] = local396;
																	client.anIntArray318[local88] = local264;
																	arg0.serverPacketType = null;
																	return true;
																} else if (arg0.serverPacketType == ServerProt.aServerProt_22) {
																	local264 = local6.g2_alt3(16711680);
																	if (local264 == 65535) {
																		local264 = -1;
																	}
																	local88 = local6.g1_alt2(1509181772);
																	Class274.aClass258_1.method26119(local264, local88, (byte) 0);
																	arg0.serverPacketType = null;
																	return true;
																} else if (arg0.serverPacketType == ServerProt.aServerProt_12) {
																	local3022 = local6.gjstr(2121452210);
																	local1571 = Class657.method32750(Class433.method28791(local6, 672487471), (byte) 29);
																	Class227.method25612(6, 0, local3022, local3022, local3022, local1571, null, -1921814674);
																	arg0.serverPacketType = null;
																	return true;
																} else if (arg0.serverPacketType == ServerProt.aServerProt_172) {
																	client.aClass67_15 = (Class67) Class107.method18116(Class680.method33239((byte) 89), local6.g1((short) 16384), -1915563430);
																	Class642.logout(false, (short) 23739);
																	arg0.serverPacketType = null;
																	return false;
																} else if (ServerProt.aServerProt_125 == arg0.serverPacketType) {
																	local6.pos += -1822849076;
																	if (local6.checkcrc(1269271142)) {
																		Class176.method24386(local6, local6.pos * 212851357 - 28, -18120227);
																	}
																	arg0.serverPacketType = null;
																	return true;
																} else if (ServerProt.aServerProt_47 == arg0.serverPacketType) {
																	Class274.aClass258_1.method26127(-130336377);
																	arg0.serverPacketType = null;
																	return true;
																} else if (ServerProt.aServerProt_10 == arg0.serverPacketType) {
																	if (!client.aBoolean636) {
																		try {
																			local264 = local6.g1_alt1(1218202393);
																			local88 = local6.g1_alt3(1399833873);
																			local382 = local6.g1((short) 16384);
																			client.aClass270_1.method26280(local88, 1874527081).method26412(local382, local264, (byte) 46);
																		} catch (@Pc(6976) RuntimeException local6976) {
																			Class646.method32608(null, local6976, 1462864111);
																			Class332.method27394(arg0, -1449214767);
																		}
																	}
																	arg0.serverPacketType = null;
																	return true;
																} else if (ServerProt.aServerProt_136 == arg0.serverPacketType) {
																	local264 = local6.g2(-1434290800);
																	local88 = local6.g4_alt3(1808922260);
																	@Pc(7007) Class611 local7007 = new Class611(local6.g4_alt2(779859850));
																	local1022 = local6.g4_alt1(-1587034844);
																	local396 = local6.g4(-118643075);
																	local398 = local6.g2_alt1(730955648);
																	local416 = local6.g4_alt3(-452793074);
																	local1481 = local6.g1_alt1(1412149972);
																	local444 = local6.g4_alt2(926877027);
																	Class704.incrementVerifyId((short) 255);
																	Class348.method27623(local1022, new Class93_Sub40_Sub2(local264, local1481, new Class679(local7007, local398)), new int[] { local416, local444, local88, local396 }, false, (byte) 0);
																	arg0.serverPacketType = null;
																	return true;
																} else if (arg0.serverPacketType == ServerProt.aServerProt_50) {
																	Class641.readZonePacket(ZoneProt.aZoneProt_14, 874772925);
																	arg0.serverPacketType = null;
																	return true;
																} else if (arg0.serverPacketType == ServerProt.aServerProt_105) {
																	Class513.method30264(client.world.anInt5238 * -968359209, -363536418);
																	arg0.serverPacketType = null;
																	return true;
																} else if (ServerProt.aServerProt_112 == arg0.serverPacketType) {
																	local264 = local6.g4_alt3(-527653201);
																	local88 = local6.g2_alt1(645137483);
																	local382 = local6.g2_alt3(16711680);
																	client.world.method30481(-1411368838).method31604(local382, local264, local88, 1933418643);
																	arg0.serverPacketType = null;
																	return true;
																} else if (ServerProt.aServerProt_101 == arg0.serverPacketType) {
																	local264 = local6.g1((short) 16384);
																	local88 = local6.g1((short) 16384);
																	if (local6.g1((short) 16384) == 0) {
																		client.aClass531ArrayArray1[local264][local88] = new Class531();
																	} else {
																		local6.pos -= -1445626955;
																		client.aClass531ArrayArray1[local264][local88] = new Class531(local6, null);
																	}
																	client.anInt3440 = client.anInt3565 * 1301882723;
																	arg0.serverPacketType = null;
																	return true;
																} else if (arg0.serverPacketType == ServerProt.aServerProt_164) {
																	if (!client.aBoolean636) {
																		try {
																			local264 = local6.g1_alt3(1833833931);
																			local88 = local6.g1((short) 16384);
																			client.aClass270_1.method26280(local264, 1347261705).method26428(local88, -36898120);
																		} catch (@Pc(7201) RuntimeException local7201) {
																			Class646.method32608(null, local7201, 640709244);
																			Class332.method27394(arg0, -147100024);
																		}
																	}
																	arg0.serverPacketType = null;
																	return true;
																} else {
																	@Pc(7252) long local7252;
																	@Pc(7261) Class443 local7261;
																	if (arg0.serverPacketType == ServerProt.aServerProt_149) {
																		local302 = local6.g1((short) 16384) == 1;
																		local1571 = local6.gjstr(997347521);
																		local1018 = local1571;
																		if (local302) {
																			local1018 = local6.gjstr(199454271);
																		}
																		local640 = local6.gjstr(2106492675);
																		local2427 = local6.g2(-1434290800);
																		local7252 = local6.g3((short) 3590);
																		local7261 = (Class443) Class107.method18116(Class443.method28866(-1005511096), local6.g1((short) 16384), -1915563430);
																		local1343 = local6.g2(-1434290800);
																		@Pc(7271) long local7271 = (local2427 << 32) + local7252;
																		local6606 = false;
																		local4737 = 0;
																		while (true) {
																			if (local4737 >= 100) {
																				if (local7261.aBoolean770 && Class476.method29688(local1018, (byte) 60)) {
																					local6606 = true;
																				}
																				break;
																			}
																			if (client.aLongArray23[local4737] == local7271) {
																				local6606 = true;
																				break;
																			}
																			local4737++;
																		}
																		if (!local6606) {
																			client.aLongArray23[client.anInt3564 * -254980857] = local7271;
																			client.anInt3564 = (-254980857 * client.anInt3564 + 1) % 100 * -1639542601;
																			@Pc(7324) String local7324 = Class372.aClass58_2.method1094(local1343, -737304293).method22928(local6, (byte) -125);
																			if (local7261.anInt4893 * -508329009 == -1) {
																				Class60.method1118(20, 0, local1571, local1018, local1571, local7324, local640, local1343, local7261, 563362691);
																			} else {
																				Class60.method1118(20, 0, Class346.method27565(local7261.anInt4893 * -508329009, -1614681388) + local1571, Class346.method27565(local7261.anInt4893 * -508329009, -1614681388) + local1018, local1571, local7324, local640, local1343, local7261, 1778680212);
																			}
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_66 == arg0.serverPacketType) {
																		local264 = local6.g4_alt2(876979913);
																		local88 = local6.g4_alt3(1720922824);
																		local382 = local6.g4_alt2(30500595);
																		local1022 = local6.g4(-118643075);
																		local396 = local6.g1((short) 16384);
																		local398 = local6.g2(-1434290800);
																		local416 = local6.g4_alt3(1536553686);
																		local1481 = local6.g2_alt3(16711680);
																		Class704.incrementVerifyId((short) 255);
																		Class348.method27623(local382, new Class93_Sub40_Sub3(local1481, local396, local398), new int[] { local264, local416, local88, local1022 }, false, (byte) 0);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_180 == arg0.serverPacketType) {
																		local3022 = local6.gjstr(957386437);
																		local1316 = local6.g2(-1434290800);
																		local1321 = local6.g3((short) 7138);
																		local5779 = (Class443) Class107.method18116(Class443.method28866(1925916099), local6.g1((short) 16384), -1915563430);
																		local1596 = local6.g1((short) 16384) == 1;
																		local1481 = local6.g2(-1434290800);
																		local4665 = (local1316 << 32) + local1321;
																		local4667 = false;
																		if (Class557.aClass297_1 == null) {
																			local4667 = true;
																		} else {
																			local2460 = 0;
																			while (true) {
																				if (local2460 >= 100) {
																					if (local5779.aBoolean770 && Class476.method29688(local3022, (byte) 121)) {
																						local4667 = true;
																					}
																					break;
																				}
																				if (local4665 == client.aLongArray23[local2460]) {
																					local4667 = true;
																					break;
																				}
																				local2460++;
																			}
																		}
																		if (!local4667) {
																			client.aLongArray23[client.anInt3564 * -254980857] = local4665;
																			client.anInt3564 = (client.anInt3564 * -254980857 + 1) % 100 * -1639542601;
																			local1628 = Class372.aClass58_2.method1094(local1481, -737304293).method22928(local6, (byte) -59);
																			local1630 = local1596 ? 23 : 25;
																			if (local5779.anInt4893 * -508329009 == -1) {
																				Class60.method1118(local1630, 0, local3022, local3022, local3022, local1628, Class557.aClass297_1.method26650(2058380908), local1481, local5779, 1439925608);
																			} else {
																				Class60.method1118(local1630, 0, Class346.method27565(local5779.anInt4893 * -508329009, -1614681388) + local3022, Class346.method27565(local5779.anInt4893 * -508329009, -1614681388) + local3022, local3022, local1628, Class557.aClass297_1.method26650(1178137953), local1481, local5779, 1883938538);
																			}
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_96 == arg0.serverPacketType) {
																		local264 = local6.g4_alt2(-821921582);
																		Class704.incrementVerifyId((short) 255);
																		@Pc(7645) Class93_Sub40 local7645 = (Class93_Sub40) client.aClass16_22.method214((long) local264);
																		if (local7645 != null) {
																			Class372.method28019(local7645, true, false, -90137270);
																		}
																		if (client.aClass312_7 != null) {
																			Class354.method27694(client.aClass312_7, -1174743804);
																			client.aClass312_7 = null;
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_190 == arg0.serverPacketType) {
																		if (!client.aBoolean636) {
																			try {
																				for (local346 = local6.g1b(542085474); local346 != -1; local346 = local6.g1b(1804982516)) {
																					for (local2070 = local6.g1b(485901377); local2070 != -1; local2070 = local6.g1b(537728454)) {
																						for (@Pc(7689) byte local7689 = local6.g1b(1731363964); local7689 != -1; local7689 = local6.g1b(1678833469)) {
																							client.aClass270_1.method26280(local346, -1328210001).method26443(local2070, local7689, local6.g4(-118643075), -2009705364);
																						}
																					}
																				}
																			} catch (@Pc(7721) RuntimeException local7721) {
																				Class646.method32608(null, local7721, 324176659);
																				Class332.method27394(arg0, 54753761);
																			}
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_142) {
																		client.anInt3548 = client.anInt3565 * 287027887;
																		local302 = local6.g1((short) 16384) == 1;
																		@Pc(7755) Class374 local7755 = new Class374(local6);
																		@Pc(7759) Class93_Sub28 local7759;
																		if (local302) {
																			local7759 = Class121.aClass93_Sub28_2;
																		} else {
																			local7759 = Class253.aClass93_Sub28_3;
																		}
																		local7755.method28027(local7759, (byte) 100);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_175) {
																		local302 = local6.g1((short) 16384) == 1;
																		local1571 = local6.gjstr(779962962);
																		local1018 = local1571;
																		if (local302) {
																			local1018 = local6.gjstr(472328802);
																		}
																		local640 = local6.gjstr(-36216686);
																		local2427 = local6.g2(-1434290800);
																		local7252 = local6.g3((short) -30853);
																		local7261 = (Class443) Class107.method18116(Class443.method28866(-1489117307), local6.g1((short) 16384), -1915563430);
																		local2729 = (local2427 << 32) + local7252;
																		local2731 = false;
																		local1630 = 0;
																		while (true) {
																			if (local1630 >= 100) {
																				if (local7261.aBoolean770) {
																					if (client.userQuickChat1 && !client.userQuickChat2 || client.userQuickChat4) {
																						local2731 = true;
																					} else if (Class476.method29688(local1018, (byte) 28)) {
																						local2731 = true;
																					}
																				}
																				break;
																			}
																			if (local2729 == client.aLongArray23[local1630]) {
																				local2731 = true;
																				break;
																			}
																			local1630++;
																		}
																		if (!local2731) {
																			client.aLongArray23[client.anInt3564 * -254980857] = local2729;
																			client.anInt3564 = (-254980857 * client.anInt3564 + 1) % 100 * -1639542601;
																			local2782 = Class657.method32750(Class433.method28791(local6, 672487471), (byte) 8);
																			if (local7261.anInt4893 * -508329009 == -1) {
																				Class60.method1118(9, 0, local1571, local1018, local1571, local2782, local640, -1, local7261, 1514545069);
																			} else {
																				Class60.method1118(9, 0, Class346.method27565(local7261.anInt4893 * -508329009, -1614681388) + local1571, Class346.method27565(local7261.anInt4893 * -508329009, -1614681388) + local1018, local1571, local2782, local640, -1, local7261, 1380458462);
																			}
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_17 == arg0.serverPacketType) {
																		for (local264 = 0; local264 < client.aClass132_Sub1_Sub1_Sub1_Sub2Array1.length; local264++) {
																			if (client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local264] != null) {
																				client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local264].anIntArray236 = null;
																				client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local264].aClass19_3.method23566(-1, 489433439);
																			}
																		}
																		for (local264 = 0; local264 < client.anInt3488 * -1814159537; local264++) {
																			((Class132_Sub1_Sub1_Sub1) client.aClass93_Sub15Array1[local264].anObject5).anIntArray236 = null;
																			((Class132_Sub1_Sub1_Sub1) client.aClass93_Sub15Array1[local264].anObject5).aClass19_3.method23566(-1, 391860148);
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_99) {
																		local264 = local6.g1_alt1(1207605548);
																		local88 = local6.g1((short) 16384);
																		if (local264 == 255) {
																			local264 = -1;
																			local88 = -1;
																		}
																		Class73.method1256(local264, local88, (byte) 98);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_126 == arg0.serverPacketType) {
																		local346 = local6.g1b(1785595826);
																		local88 = local6.g2_alt2(1875428159);
																		Class624.aClass120_1.aClass647_1.method32644((Class108) Class21.aClass79_Sub1_Sub1_1.method18261(local88, -1332674925), local346, (byte) 1);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_195) {
																		local264 = local6.g1((short) 16384);
																		local264 = -local264 - 2;
																		client.aMap18.remove(local264);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_71 == arg0.serverPacketType) {
																		local264 = local6.g4(-118643075);
																		local88 = local6.g4_alt1(886974535);
																		Class704.incrementVerifyId((short) 255);
																		@Pc(8098) Class312 local8098 = Class659.method32808(local264, -653256145);
																		local8098.anInt3973 = local88 * 1528274801;
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_48 == arg0.serverPacketType) {
																		local264 = local6.g2(-1434290800);
																		if (local264 == 65535) {
																			local264 = -1;
																		}
																		local88 = local6.g4_alt3(-1081843268);
																		local382 = local6.g4_alt1(932380141);
																		Class704.incrementVerifyId((short) 255);
																		Class125.method21460(local88, local264, local382, (byte) -42);
																		@Pc(8143) Class47 local8143 = (Class47) Class277.aClass32_Sub12_1.method18261(local264, -1365720263);
																		Class125_Sub2.method21464(local88, local8143.anInt145 * 1819855537, local8143.anInt138 * -1613356029, local8143.anInt144 * -1921745639, -1320098500);
																		Class158.method14300(local88, local8143.anInt186 * 1104138065, local8143.anInt149 * -1407378195, local8143.anInt147 * 239486079, 1964397861);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_177 == arg0.serverPacketType) {
																		if (!client.aBoolean636) {
																			try {
																				local264 = local6.g1_alt1(1420671195);
																				local88 = local6.g1_alt1(1220447160);
																				local742 = local6.g1_alt3(2138110795) == 1;
																				client.aClass270_1.method26280(local88, 1502158727).method26393(local264, local742, 1536691043);
																			} catch (@Pc(8211) RuntimeException local8211) {
																				Class646.method32608(null, local8211, 1581657838);
																				Class332.method27394(arg0, -607789614);
																			}
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_63 == arg0.serverPacketType) {
																		local264 = local6.g2(-1434290800);
																		local88 = local6.g2(-1434290800);
																		local382 = local6.g2(-1434290800);
																		Class274.aClass258_1.method26061(local264, local88, local382, (byte) 40);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_11) {
																		local264 = local6.g2(-1434290800);
																		local88 = local6.g1((short) 16384);
																		local742 = (local88 & 0x1) != 0;
																		local750 = (local88 & 0x2) != 0;
																		Class138.method11534(local264, local742, (byte) -8);
																		local396 = local6.g2(-1434290800);
																		for (local398 = 0; local398 < local396; local398++) {
																			local416 = local6.g2(-1434290800);
																			local1481 = local6.g1((short) 16384);
																			if (local1481 == 255) {
																				local1481 = local6.g4(-118643075);
																			}
																			@Pc(8309) Class40 local8309 = null;
																			if (local750) {
																				local1343 = local6.g1((short) 16384);
																				if (local1343 > 0) {
																					local8309 = new Class40(Class265.aClass79_Sub1_Sub2_4);
																					while (local1343-- > 0) {
																						local2446 = Class265.aClass79_Sub1_Sub2_4.method1468(local6, (byte) 90);
																						local8309.method776(local2446.anInt5092 * -1181855333, local2446.anObject19, (byte) 98);
																					}
																				}
																			}
																			Class313.method26931(local264, local398, local416 - 1, local1481, local8309, local742, -877733344);
																		}
																		client.anIntArray301[(client.anInt3541 += -486259511) * 1562318201 - 1 & 0x3F] = local264;
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_106 == arg0.serverPacketType) {
																		local302 = local6.g1((short) 16384) == 1;
																		local1571 = local6.gjstr(17462522);
																		local1018 = local1571;
																		if (local302) {
																			local1018 = local6.gjstr(-75698244);
																		}
																		local1321 = local6.g2(-1434290800);
																		local1327 = local6.g3((short) -16712);
																		local2719 = (Class443) Class107.method18116(Class443.method28866(2030640571), local6.g1((short) 16384), -1915563430);
																		local4665 = local1327 + (local1321 << 32);
																		local4667 = false;
																		local2460 = 0;
																		while (true) {
																			if (local2460 >= 100) {
																				if (local2719.aBoolean770) {
																					if (client.userQuickChat1 && !client.userQuickChat2 || client.userQuickChat4) {
																						local4667 = true;
																					} else if (Class476.method29688(local1018, (byte) 102)) {
																						local4667 = true;
																					}
																				}
																				break;
																			}
																			if (client.aLongArray23[local2460] == local4665) {
																				local4667 = true;
																				break;
																			}
																			local2460++;
																		}
																		if (!local4667) {
																			client.aLongArray23[client.anInt3564 * -254980857] = local4665;
																			client.anInt3564 = (-254980857 * client.anInt3564 + 1) % 100 * -1639542601;
																			local1628 = Class657.method32750(Class433.method28791(local6, 672487471), (byte) 2);
																			local1630 = local2719.aBoolean771 ? 7 : 3;
																			if (local2719.anInt4893 * -508329009 == -1) {
																				Class60.method1118(local1630, 0, local1571, local1018, local1571, local1628, null, -1, local2719, 689563662);
																			} else {
																				Class60.method1118(local1630, 0, Class346.method27565(local2719.anInt4893 * -508329009, -1614681388) + local1571, Class346.method27565(local2719.anInt4893 * -508329009, -1614681388) + local1018, local1571, local1628, null, -1, local2719, 1151198560);
																			}
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_78) {
																		local264 = local6.g2_alt2(1624807307);
																		local88 = local6.g2_alt2(2106129700);
																		local382 = local6.g1((short) 16384);
																		if (local382 == 255) {
																			local382 = -1;
																		}
																		client.world.method30481(-1606244464).method31605(local88, local382, local264, (byte) 4);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_152 == arg0.serverPacketType) {
																		Class596.aClass113_Sub1_1.method7426(242024593);
																		arg0.serverPacketType = null;
																		return false;
																	} else if (ServerProt.aServerProt_8 == arg0.serverPacketType) {
																		local264 = local6.g1((short) 16384);
																		@Pc(8607) Class721 local8607 = (Class721) Class107.method18116(Class314.method26933(318137718), local264, -1915563430);
																		if (local8607 == null) {
																			local8607 = Class721.aClass721_7;
																		}
																		Class299.method26712(local8607, -1565059650);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_103 == arg0.serverPacketType) {
																		local264 = local6.g1_alt2(1680819991);
																		local88 = local6.g1_alt1(2010386657);
																		local382 = local6.g1((short) 16384);
																		local1022 = local6.g1_alt3(1657353203);
																		local396 = local6.g2(-1434290800) << 2;
																		Class704.incrementVerifyId((short) 255);
																		Class104_Sub3.method5765(local264, local382, local396, local88, local1022, true, 969851959);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_143 == arg0.serverPacketType) {
																		Class641.readZonePacket(ZoneProt.aZoneProt_11, 93794078);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_36) {
																		local264 = local6.g4_alt1(-1534374753);
																		local88 = local6.g4_alt3(-1451454285);
																		Class704.incrementVerifyId((short) 255);
																		Class121_Sub1.method8711(local264, local88, (byte) 93);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_43 == arg0.serverPacketType) {
																		local264 = local6.g4_alt2(46467313);
																		local88 = local6.g4_alt1(-1561080489);
																		local382 = local6.g1_alt2(-365915474);
																		local1022 = local6.g4(-118643075);
																		local396 = local6.g2(-1434290800);
																		local398 = local6.g4_alt2(-345739418);
																		local416 = local6.g4_alt2(1640921238);
																		Class704.incrementVerifyId((short) 255);
																		Class348.method27623(local88, new Class93_Sub40(local396, local382), new int[] { local416, local398, local264, local1022 }, false, (byte) 0);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_58 == arg0.serverPacketType) {
																		local264 = local6.g1_alt3(1989143514);
																		Class704.incrementVerifyId((short) 255);
																		client.anInt3497 = local264 * 395973781;
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_95) {
																		local264 = local6.g2_alt2(2138195295);
																		local88 = local6.g4_alt1(-1979714738);
																		Class624.aClass120_1.aClass647_1.method32647((Class379) Class30.aClass32_Sub16_1.method18261(local264, -570078248), local88, 567603138);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_82 == arg0.serverPacketType) {
																		client.anInt3552 = local6.g1_alt2(499926140) * 630676823;
																		client.anInt3561 = local6.g1_alt2(1636117962) * -2128488861;
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_116 == arg0.serverPacketType) {
																		Class686.method33484(local6, arg0.length * 2010044839, (byte) 70);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_28) {
																		client.anInt3507 = client.anInt3565 * 1810167073;
																		if (arg0.length * 2010044839 == 0) {
																			client.aString146 = null;
																			client.aString144 = null;
																			Class623.anInt5682 = 0;
																			Class93_Sub1_Sub2.aClass170Array1 = null;
																			arg0.serverPacketType = null;
																			return true;
																		}
																		client.aString144 = local6.gjstr(433695814);
																		local302 = local6.g1((short) 16384) == 1;
																		if (local302) {
																			local6.gjstr(-124120431);
																		}
																		client.aString146 = local6.gjstr(-198356123);
																		Class320.aByte129 = local6.g1b(1258612190);
																		local88 = local6.g1((short) 16384);
																		if (local88 == 255) {
																			arg0.serverPacketType = null;
																			return true;
																		}
																		Class623.anInt5682 = local88 * 1583902511;
																		@Pc(8922) Class170[] local8922 = new Class170[100];
																		for (local1022 = 0; local1022 < Class623.anInt5682 * 1581594575; local1022++) {
																			local8922[local1022] = new Class170();
																			local8922[local1022].aString90 = local6.gjstr(1967535272);
																			local302 = local6.g1((short) 16384) == 1;
																			if (local302) {
																				local8922[local1022].aString91 = local6.gjstr(1720548764);
																			} else {
																				local8922[local1022].aString91 = local8922[local1022].aString90;
																			}
																			local8922[local1022].aString89 = Class82.method1384(local8922[local1022].aString91, client.aClass83_10, (byte) 1);
																			local8922[local1022].anInt2996 = local6.g2(-1434290800) * 394880997;
																			local8922[local1022].aByte77 = local6.g1b(1669630943);
																			local8922[local1022].aString92 = local6.gjstr(1024887069);
																			if (local8922[local1022].aString91.equals(Class520.selfPlayer.name2)) {
																				Class297.aByte124 = local8922[local1022].aByte77;
																			}
																		}
																		local750 = false;
																		local398 = Class623.anInt5682 * 1581594575;
																		while (local398 > 0) {
																			local750 = true;
																			local398--;
																			for (local416 = 0; local416 < local398; local416++) {
																				if (local8922[local416].aString89.compareTo(local8922[local416 + 1].aString89) > 0) {
																					@Pc(9050) Class170 local9050 = local8922[local416];
																					local8922[local416] = local8922[local416 + 1];
																					local8922[local416 + 1] = local9050;
																					local750 = false;
																				}
																			}
																			if (local750) {
																				break;
																			}
																		}
																		Class93_Sub1_Sub2.aClass170Array1 = local8922;
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_52 == arg0.serverPacketType) {
																		local264 = local6.g2_alt1(1325377384);
																		local2070 = local6.g1b_alt2(-828649107);
																		local382 = local6.g2_alt3(16711680);
																		local1022 = local6.g2(-1434290800);
																		local396 = local6.g2_alt2(1784623724);
																		local398 = local6.g1_alt2(843963926);
																		if (local398 == 255) {
																			local398 = -1;
																		}
																		local416 = local6.g2s_alt(-1725165388);
																		local1481 = local6.g1_alt3(1994332627);
																		local444 = local6.g1((short) 16384);
																		local1343 = local6.g2s_alt(-1086815010);
																		local1385 = local6.g2(-1434290800);
																		@Pc(9135) byte local9135 = local6.g1b_alt3(-2124857804);
																		local1630 = local6.g1_alt1(1191854676) * 4;
																		local4737 = local6.g1((short) 16384);
																		local6319 = local6.g2_alt1(1155646438);
																		@Pc(9158) boolean local9158 = (local1481 & 0x1) != 0;
																		@Pc(9167) boolean local9167 = (local1481 & 0x2) != 0;
																		local6449 = local9167 ? local1481 >> 2 : -1;
																		if (local9167) {
																			local4737 = (byte) local4737;
																		} else {
																			local4737 *= 4;
																		}
																		@Pc(9189) Class611 local9189 = client.world.method30455(1815178656);
																		@Pc(9196) int local9196 = local264 - local9189.anInt5623 * 541223362;
																		@Pc(9203) int local9203 = local1385 - local9189.anInt5624 * 306352026;
																		local88 = local2070 + local9196;
																		local2460 = local9135 + local9203;
																		if (local9196 >= 0 && local9203 >= 0 && local9196 < client.world.method30459(554625018) * 2 && local9203 < client.world.method30459(1065547038) * 2 && local88 >= 0 && local2460 >= 0 && local88 < client.world.method30466((short) 128) * 2 && local2460 < client.world.method30466((short) 128) * 2 && local6319 != 65535) {
																			local9196 *= 256;
																			local9203 *= 256;
																			local88 = local88 * 256;
																			local2460 *= 256;
																			local4737 <<= 0x2;
																			local1630 <<= 0x2;
																			local396 <<= 0x2;
																			Class302.method26738(local6319, local416, local1343, local6449, local4737, local1630, local9196, local9203, local88, local2460, local382, local1022, local398, local396, local9158, 0, local444, 1185244095);
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_107) {
																		local264 = local6.g2_alt3(16711680);
																		local88 = local6.g4_alt1(-1440621219);
																		local382 = local6.g4_alt3(-1279423367);
																		local1022 = local6.g4_alt3(1568058975);
																		local396 = local6.g2_alt1(1572829419);
																		local398 = local6.g1((short) 16384);
																		local416 = local6.g4(-118643075);
																		local1481 = local6.g4_alt1(1851425716);
																		Class704.incrementVerifyId((short) 255);
																		Class348.method27623(local1481, new Class93_Sub40_Sub4(local264, local398, local396), new int[] { local88, local382, local416, local1022 }, false, (byte) 0);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_173) {
																		client.anInt3447 = client.anInt3565 * 2096178751;
																		local302 = local6.g1((short) 16384) == 1;
																		@Pc(9397) Class375 local9397 = new Class375(local6);
																		@Pc(9401) Class386 local9401;
																		if (local302) {
																			local9401 = Class279.aClass386_1;
																		} else {
																			local9401 = Class581.aClass386_2;
																		}
																		local9397.method28038(local9401, 1265204488);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_158 == arg0.serverPacketType) {
																		local3022 = local6.gjstr(535196699);
																		local88 = local6.g2(-1434290800);
																		local382 = local6.g2(-1434290800);
																		local1022 = local6.g2(-1434290800);
																		Class50.lobby.host = local3022;
																		Class50.lobby.id = local88 * 470002905;
																		Class50.lobby.port1 = local382 * -1138615973;
																		Class50.lobby.port2 = local1022 * 702279345;
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_39) {
																		Class641.readZonePacket(ZoneProt.aZoneProt_12, -867043738);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_138 == arg0.serverPacketType) {
																		local264 = local6.g2s_alt(1480554767);
																		local88 = local6.g2s_alt2(1898923797);
																		local382 = local6.g4_alt1(-78297754);
																		Class704.incrementVerifyId((short) 255);
																		Class350.method27636(local382, local264, local88, 1863778376);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_121 == arg0.serverPacketType) {
																		client.aClass660_1 = (Class660) Class107.method18116(Class660.method32819(489855685), local6.g1((short) 16384), -1915563430);
																		if (client.aClass660_1 == null) {
																			client.aClass660_1 = Class660.aClass660_5;
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_100) {
																		local264 = local6.g2(-1434290800);
																		Class274.aClass258_1.method26054(local264, -1564241652);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_49) {
																		local3022 = local6.gjstr(675677981);
																		local742 = local6.g1((short) 16384) == 1;
																		if (local742) {
																			local1571 = local6.gjstr(2025508252);
																		} else {
																			local1571 = local3022;
																		}
																		local1022 = local6.g2(-1434290800);
																		@Pc(9570) byte local9570 = local6.g1b(1281422089);
																		local3365 = false;
																		if (local9570 == -128) {
																			local3365 = true;
																		}
																		if (local3365) {
																			if (Class623.anInt5682 * 1581594575 == 0) {
																				arg0.serverPacketType = null;
																				return true;
																			}
																			local1596 = false;
																			for (local416 = 0; local416 < Class623.anInt5682 * 1581594575 && (!Class93_Sub1_Sub2.aClass170Array1[local416].aString91.equals(local1571) || Class93_Sub1_Sub2.aClass170Array1[local416].anInt2996 * -1529840147 != local1022); local416++) {
																			}
																			if (local416 < Class623.anInt5682 * 1581594575) {
																				while (local416 < Class623.anInt5682 * 1581594575 - 1) {
																					Class93_Sub1_Sub2.aClass170Array1[local416] = Class93_Sub1_Sub2.aClass170Array1[local416 + 1];
																					local416++;
																				}
																				Class623.anInt5682 -= 1583902511;
																				Class93_Sub1_Sub2.aClass170Array1[Class623.anInt5682 * 1581594575] = null;
																			}
																		} else {
																			local3411 = local6.gjstr(806791657);
																			@Pc(9656) Class170 local9656 = new Class170();
																			local9656.aString90 = local3022;
																			local9656.aString91 = local1571;
																			local9656.aString89 = Class82.method1384(local9656.aString91, client.aClass83_10, (byte) 1);
																			local9656.anInt2996 = local1022 * 394880997;
																			local9656.aByte77 = local9570;
																			local9656.aString92 = local3411;
																			for (local444 = Class623.anInt5682 * 1581594575 - 1; local444 >= 0; local444--) {
																				local1343 = Class93_Sub1_Sub2.aClass170Array1[local444].aString89.compareTo(local9656.aString89);
																				if (local1343 == 0) {
																					Class93_Sub1_Sub2.aClass170Array1[local444].anInt2996 = local1022 * 394880997;
																					Class93_Sub1_Sub2.aClass170Array1[local444].aByte77 = local9570;
																					Class93_Sub1_Sub2.aClass170Array1[local444].aString92 = local3411;
																					if (local1571.equals(Class520.selfPlayer.name2)) {
																						Class297.aByte124 = local9570;
																					}
																					client.anInt3507 = client.anInt3565 * 1810167073;
																					arg0.serverPacketType = null;
																					return true;
																				}
																				if (local1343 < 0) {
																					break;
																				}
																			}
																			if (Class623.anInt5682 * 1581594575 >= Class93_Sub1_Sub2.aClass170Array1.length) {
																				arg0.serverPacketType = null;
																				return true;
																			}
																			for (local1343 = Class623.anInt5682 * 1581594575 - 1; local1343 > local444; local1343--) {
																				Class93_Sub1_Sub2.aClass170Array1[local1343 + 1] = Class93_Sub1_Sub2.aClass170Array1[local1343];
																			}
																			if (Class623.anInt5682 * 1581594575 == 0) {
																				Class93_Sub1_Sub2.aClass170Array1 = new Class170[100];
																			}
																			Class93_Sub1_Sub2.aClass170Array1[local444 + 1] = local9656;
																			Class623.anInt5682 += 1583902511;
																			if (local1571.equals(Class520.selfPlayer.name2)) {
																				Class297.aByte124 = local9570;
																			}
																		}
																		client.anInt3507 = client.anInt3565 * 1810167073;
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_108 == arg0.serverPacketType) {
																		local264 = local6.g4(-118643075);
																		local88 = local6.g4_alt3(-1427466778);
																		Class704.incrementVerifyId((short) 255);
																		Class264.method26207(local264, local88, -146455832);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_44 == arg0.serverPacketType) {
																		if (!client.aBoolean636) {
																			try {
																				local264 = local6.g1_alt2(230600728);
																				local88 = local6.g1((short) 16384);
																				local382 = local6.g1((short) 16384);
																				client.aClass270_1.method26280(local88, 968816913).method26437(local264, local382, -102361995);
																			} catch (@Pc(9851) RuntimeException local9851) {
																				Class646.method32608(null, local9851, 2084054131);
																				Class332.method27394(arg0, -1262307861);
																			}
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_188 == arg0.serverPacketType) {
																		local264 = local6.g4_alt3(-1678284684);
																		local273 = local6.g1_alt2(85739265) == 1;
																		Class704.incrementVerifyId((short) 255);
																		Class558.method31108(local264, local273, (byte) 78);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_16 == arg0.serverPacketType) {
																		if (!client.aBoolean636) {
																			try {
																				local346 = local6.g1b_alt1((byte) 98);
																				local88 = local6.g4(-118643075);
																				local382 = local6.g1_alt3(1322587572);
																				client.aClass270_1.method26280(local382, 203008283).method26404(local88, local346, -470473079);
																			} catch (@Pc(9921) RuntimeException local9921) {
																				Class646.method32608(null, local9921, 1623377901);
																				Class332.method27394(arg0, 658672190);
																			}
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_54 == arg0.serverPacketType) {
																		Class641.readZonePacket(ZoneProt.aZoneProt_6, 640777466);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_35) {
																		local264 = local6.g2(-1434290800);
																		local1571 = local6.gjstr(749878804);
																		Class704.incrementVerifyId((short) 255);
																		Class709.method36763(local264, local1571, (byte) -84);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_6) {
																		@Pc(9977) Class684 local9977 = new Class684();
																		local273 = local9977.method33358(local6, -1532342642);
																		client.world.method30494((byte) 23).method32969(client.world, local273 ? local9977 : null, local9977.method33420(1557475537), -1208626918);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.RUNCLIENTSCRIPT == arg0.serverPacketType) {
																		local3022 = local6.gjstr(1032107588);
																		@Pc(10015) Object[] local10015 = new Object[local3022.length() + 1];
																		for (local382 = local3022.length() - 1; local382 >= 0; local382--) {
																			if (local3022.charAt(local382) == 's') {
																				local10015[local382 + 1] = local6.gjstr(835183554);
																			} else {
																				local10015[local382 + 1] = Integer.valueOf(local6.g4(-118643075));
																			}
																		}
																		local10015[0] = Integer.valueOf(local6.g4(-118643075));
																		Class704.incrementVerifyId((short) 255);
																		@Pc(10065) Class93_Sub39 local10065 = new Class93_Sub39();
																		local10065.anObjectArray4 = local10015;
																		Class211.method25429(local10065, -1552905168);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_159 == arg0.serverPacketType) {
																		local3022 = local6.gjstr(-116043590);
																		Class32_Sub7.method16823(local3022, false, false, (byte) 3);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_90 == arg0.serverPacketType) {
																		Class641.readZonePacket(ZoneProt.aZoneProt_10, 59656232);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_129 == arg0.serverPacketType) {
																		local264 = local6.g4(-118643075);
																		local88 = local6.g2s((byte) -65);
																		local382 = local6.g1_alt1(1241340759);
																		local1022 = local6.g2_alt3(16711680);
																		@Pc(10132) Class93_Sub15 local10132 = (Class93_Sub15) client.aClass16_18.method214((long) local1022);
																		if (local10132 != null) {
																			@Pc(10138) Class132_Sub1_Sub1_Sub1_Sub1 local10138 = (Class132_Sub1_Sub1_Sub1_Sub1) local10132.anObject5;
																			if (local10138.aClass334_1 == null) {
																				local10138.aClass334_1 = new Class334(local10138.aClass336_1);
																			}
																			local10138.aClass334_1.anIntArray409[local382] = local264;
																			local10138.aClass334_1.aShortArray115[local382] = (short) local88;
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_137 == arg0.serverPacketType) {
																		if (client.anInt3526 * -703563959 != -1) {
																			Class189.method24583(client.anInt3526 * -703563959, 0, 140070734);
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_84 == arg0.serverPacketType) {
																		local264 = local6.g4(-118643075);
																		local88 = local6.g2_alt2(1818120282);
																		Class704.incrementVerifyId((short) 255);
																		Class361.method27802(local264, local88, 1866345287);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_31 == arg0.serverPacketType) {
																		local264 = local6.g4_alt3(610680277);
																		local88 = local6.g4_alt2(-1703695273);
																		Class704.incrementVerifyId((short) 255);
																		Class132_Sub1_Sub4_Sub2.method13432(local264, 2, local88, -1, -19442568);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_62 == arg0.serverPacketType) {
																		local264 = local6.g2(-1434290800);
																		local1571 = local6.gjstr(1082001991);
																		local382 = local6.g2(-1434290800);
																		local1022 = local6.g2(-1434290800);
																		local3355 = local6.g1((short) 16384) == 1;
																		Class50.aClass28_4 = Class50.world;
																		Class372.aBoolean738 = local3355;
																		Class624.method32156(local264, local1571, local382, local1022, -1008923885);
																		local3 = null;
																		Class481.setState(19, 1823202236);
																		arg0.serverPacketType = null;
																		return false;
																	} else if (ServerProt.aServerProt_127 == arg0.serverPacketType) {
																		local264 = local6.g2(-1434290800);
																		Class274.aClass258_1.method26053(local264, (byte) -118);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_45) {
																		client.anInt3551 = client.anInt3565 * 1524761337;
																		if (arg0.length * 2010044839 == 0) {
																			Class557.aClass297_1 = null;
																		} else {
																			Class557.aClass297_1 = new Class297(0L, local6, true, client.anInterface27_1);
																		}
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_42 == arg0.serverPacketType) {
																		local264 = local6.g2(-1434290800);
																		if (local264 == 65535) {
																			local264 = -1;
																		}
																		local88 = local6.g1((short) 16384);
																		local382 = local6.g2(-1434290800);
																		local1022 = local6.g1((short) 16384);
																		local396 = local6.g2(-1434290800);
																		Class274.aClass258_1.method26098(Class275.aClass275_13, local264, local88, local1022, Class280.aClass280_7.method26450(-646294690), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local396, local382, 714067961);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_144 == arg0.serverPacketType) {
																		local264 = local6.g1_alt2(1424328025);
																		local88 = local6.g1((short) 16384);
																		local382 = local6.g1_alt3(2078794943);
																		local1022 = local6.g1_alt2(553717955);
																		local396 = local6.g2_alt2(1839622855) << 2;
																		Class704.incrementVerifyId((short) 255);
																		Class29.method606(local264, local88, local396, local1022, local382, (byte) 40);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_176) {
																		local264 = local6.g2_alt3(16711680);
																		local88 = local6.g2_alt1(692866387);
																		local382 = local6.g4(-118643075);
																		local1022 = local6.g1_alt1(1101231922);
																		Class704.incrementVerifyId((short) 255);
																		Class388.method28249(local382, local1022, local264, local88, (short) 589);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_93 == arg0.serverPacketType) {
																		local5706 = new PacketBit(arg0.length * 2010044839);
																		System.arraycopy(arg0.packet.data, arg0.packet.pos * 212851357, local5706.data, 0, arg0.length * 2010044839);
																		Class285.method26515(2105128896);
																		if (Class51.options.aClass166_Sub47_1.method16557((short) 512) == 1) {
																			Class392.aClass541_1.method30906(new Class537(Class526.NORMAL, local5706), (byte) 51);
																		} else {
																			client.world.beginRebuild(new Class537(Class526.NORMAL, local5706), 766168288);
																		}
																		arg0.serverPacketType = null;
																		return false;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_154) {
																		client.anInt3433 = local6.g2s_alt2(1404945275) * -68428119;
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_167 == arg0.serverPacketType) {
																		local264 = local6.g1((short) 16384);
																		@Pc(10546) Class715 local10546 = (Class715) Class107.method18116(Class451.method28948(-1497248091), local264, -1915563430);
																		if (local10546 == null) {
																			local10546 = Class715.aClass715_2;
																		}
																		Class51.method1007(local10546, (byte) -37);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_85) {
																		local264 = local6.g2_alt1(1835293980);
																		local88 = local6.g4(-118643075);
																		local382 = local6.g4(-118643075);
																		Class704.incrementVerifyId((short) 255);
																		Class132_Sub1_Sub4_Sub2.method13432(local88, 5, local264, local382, -19442568);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (ServerProt.aServerProt_156 == arg0.serverPacketType) {
																		Class65.aClass123_Sub1_2.method9092(local6, arg0.length * 2010044839, 1907226290);
																		client.anInt3489 = client.anInt3565 * 640617007;
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_29) {
																		local264 = local6.g2(-1434290800);
																		Class129_Sub1.method9404(local264, 1203289551);
																		arg0.serverPacketType = null;
																		return true;
																	} else if (arg0.serverPacketType == ServerProt.aServerProt_26) {
																		local264 = local6.g2(-1434290800);
																		local1571 = local6.gjstr(1338161350);
																		Class704.incrementVerifyId((short) 255);
																		Class709.method36763(local264, local1571, (byte) 7);
																		arg0.serverPacketType = null;
																		return true;
																	} else {
																		Class646.method32608((arg0.serverPacketType == null ? -1 : arg0.serverPacketType.opcode * 1430738181) + Class430.aString204 + (arg0.prevServerPacketType2 == null ? -1 : arg0.prevServerPacketType2.opcode * 1430738181) + Class430.aString204 + (arg0.prevServerPacketType3 == null ? -1 : arg0.prevServerPacketType3.opcode * 1430738181) + " " + arg0.length * 2010044839, new RuntimeException(), 1385686991);
																		Class642.logout(false, (short) 32484);
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
	}

	@OriginalMember(owner = "client!yx", name = "la", descriptor = "(Lclient!yf;I)V", line = 6973)
	static final void method36646(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1713562881);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class210.method25417(local16, local22, arg0, -1361932963);
	}

	@OriginalMember(owner = "client!yx", name = "le", descriptor = "(Lclient!yf;B)V", line = 7025)
	static final void method36647(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 248550225);
		Class280.method26456(local16, arg0, -343583539);
	}

	@OriginalMember(owner = "client!yx", name = "oh", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7507)
	static final void method36648(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray15 = Class499.method30149(local13, arg2, 1623451930);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!yx", name = "pq", descriptor = "(Lclient!yf;I)V", line = 7700)
	static final void method36649(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class183.method24575(local11, local14, arg0, -1630150971);
	}

	@OriginalMember(owner = "client!yx", name = "qa", descriptor = "(Lclient!yf;I)V", line = 8011)
	static final void method36650(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class670.method32959(local11, local14, arg0, 1301391923);
	}

	@OriginalMember(owner = "client!yx", name = "adq", descriptor = "(Lclient!yf;I)V", line = 10226)
	static final void method36651(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local23 * local13;
	}

	@OriginalMember(owner = "client!yx", name = "aed", descriptor = "(Lclient!yf;I)V", line = 10412)
	static final void method36652(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(51) int local51 = Class8.method132(local43 - local33 + 1, -1159939606);
		if (local23 > local51) {
			local23 = local51;
		}
		local13 = Class300.method26717(local13, local33, local43, (byte) 87);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 | local23 << local33;
	}
}
