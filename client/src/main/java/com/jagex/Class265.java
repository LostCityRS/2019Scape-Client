package com.jagex;

import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public class Class265 {

	@OriginalMember(owner = "client!fj", name = "ie", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_4;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Lclient!fj;")
	static final Class265 aClass265_4 = new Class265(1);

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!fj;")
	static final Class265 aClass265_1 = new Class265(0);

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "Lclient!fj;")
	static final Class265 aClass265_3 = new Class265(5);

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "Lclient!fj;")
	static final Class265 aClass265_6 = new Class265(3);

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!fj;")
	static final Class265 aClass265_5 = new Class265(2);

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "Lclient!fj;")
	static final Class265 aClass265_2 = new Class265(4);

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	final int anInt3880;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I)V", line = 13)
	Class265(@OriginalArg(0) int arg0) {
		this.anInt3880 = arg0 * 1857672113;
	}

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "()I", line = 18)
	int method26214() {
		return aClass265_4 == this ? -1 : this.anInt3880 * 1415484753 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "()I", line = 18)
	int method26215() {
		return aClass265_4 == this ? -1 : this.anInt3880 * 1415484753 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "()I", line = 18)
	int method26216() {
		return aClass265_4 == this ? -1 : this.anInt3880 * 1415484753 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)I", line = 18)
	int method26217(@OriginalArg(0) int arg0) {
		return aClass265_4 == this ? -1 : this.anInt3880 * 1415484753 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "(B)V", line = 263)
	static final void method26218(@OriginalArg(0) byte arg0) {
		if (Class411.step * 327612781 == 7 || Class411.step * 327612781 == 103) {
			return;
		}
		try {
			@Pc(22) short local22;
			if (Class411.anInt4748 * 558401221 == 0 && Class411.step * 327612781 < 98) {
				local22 = 500;
			} else {
				local22 = 2000;
			}
			if (Class411.socialNetworkLogin && Class411.step * 327612781 >= 64) {
				local22 = 6000;
			}
			if (Class411.target * -1128337797 == 211 && Class411.step * 327612781 != 215 && Class411.enterGameReply * 1486673001 != 42 || Class411.target * -1128337797 == 132 && Class411.enterLobbyReply * 914785575 != 49 && Class411.enterLobbyReply * 914785575 != 52) {
				Class411.waitingTime += -498616603;
			}
			if (Class411.waitingTime * -803989779 > local22) {
				Class411.connection.close((byte) 115);
				if (Class411.anInt4748 * 558401221 >= 3) {
					Class411.step = -522138941;
					Class114.setReply(-5, 2091582963);
					Class680.method33240(342542764);
					return;
				}
				if (Class411.target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -16555);
				} else {
					Class50.lobby.cycleSettings((short) -28749);
				}
				Class411.waitingTime = 0;
				Class411.anInt4748 += 1751058445;
				Class411.step = -1044277882;
			}
			@Pc(160) ClientMessage local160;
			if (Class411.step * 327612781 == 14) {
				if (Class411.target * -1128337797 == 211) {
					Class411.connection.setStream(Class516.method30278(Class50.world.openSocket((byte) 1), 40000, (short) 8927), Class50.world.host, 2126602668);
				} else {
					Class411.connection.setStream(Class516.method30278(Class50.lobby.openSocket((byte) 1), 40000, (short) 5577), Class50.lobby.host, 2126602668);
				}
				if (Class110_Sub9.secureRandom == null) {
					Class110_Sub9.secureRandom = client.secureRandomProvider.method13975(1653890863);
					client.secureRandomProvider.method13974(-1772168362);
					client.secureRandomProvider = null;
				}
				Class411.connection.clear(-567444089);
				local160 = Class720.createLoginMessage((byte) -50);
				local160.packet.p1(LoginProt.INIT_GAME_CONNECTION.opcode * 1690737369, (byte) -26);
				Class411.connection.send(local160, -1730519451);
				Class411.connection.flush((byte) 71);
				Class411.step = 1684272591;
			}
			@Pc(210) int local210;
			if (Class411.step * 327612781 == 35) {
				if (!Class411.connection.getStream((byte) 16).available(9, -271737564)) {
					return;
				}
				Class411.connection.getStream((byte) 99).read(Class411.connection.packet.data, 0, 9, (byte) -24);
				Class411.connection.packet.pos = 0;
				local210 = Class411.connection.packet.g1((short) 16384);
				if (local210 != 0) {
					Class411.step = -522138941;
					Class543.method30944(local210, (byte) -13);
					Class114.setReply(local210, 2110486554);
					Class411.connection.close((byte) 107);
					Class680.method33240(-503643611);
					return;
				}
				Class411.aLong269 = Class411.connection.packet.g8(1738752174) * -4112723527472146283L;
				Class411.connection.packet.pos = 0;
				if (Class411.socialNetworkLogin) {
					Class411.step = -339489564;
				} else {
					Class411.step = -1970699996;
				}
			}
			@Pc(271) int local271;
			@Pc(331) int local331;
			if (Class411.step * 327612781 == 276) {
				local160 = Class720.createLoginMessage((byte) 101);
				local160.packet.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.opcode * 1690737369, (byte) -75);
				local160.packet.p2(0, 2125832881);
				local271 = local160.packet.pos * 212851357;
				local160.packet.p4(910, (byte) 42);
				local160.packet.p4(1, (byte) 99);
				if (Class411.target * -1128337797 == 211) {
					local160.packet.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -60);
				}
				@Pc(301) Packet local301 = Class346.startRsaPacket((byte) 75);
				Class709.writeTotp(local301, (long) (Class411.anInt4746 * 276097583));
				Class413.totpTokenKey = (long) Class411.anInt4746 * -1187630733921575941L;
				local301.p1(Class411.anInt4746 * 276097583, (byte) -77);
				local301.p1(Class106.lang.getId(), (byte) 1);
				local301.p4(client.affiliate * -1765120027, (byte) 70);
				for (local331 = 0; local331 < 5; local331++) {
					local301.p4(Class110_Sub9.secureRandom.nextInt(), (byte) -114);
				}
				local301.p8(client.ssoRandom * 6484786827691107089L);
				local301.p1(client.modeGame.id * -1111983921, (byte) -72);
				local301.p1(Class110_Sub9.secureRandom.nextInt(), (byte) -58);
				local301.rsaenc(Class95.LOGIN_RSAE, Class95.LOGIN_RSAN, (byte) -114);
				local160.packet.pdata(local301.data, 0, local301.pos * 212851357, 2026842986);
				local160.packet.psize2(local160.packet.pos * 212851357 - local271, -923991681);
				Class411.connection.send(local160, -1735633338);
				Class411.connection.flush((byte) 19);
				Class411.step = 697749448;
			}
			if (Class411.step * 327612781 == 40) {
				if (!Class411.connection.getStream((byte) -15).available(2, 273697692)) {
					return;
				}
				Class411.connection.getStream((byte) -23).read(Class411.connection.packet.data, 0, 2, (byte) -6);
				Class411.connection.packet.pos = 0;
				Class411.connection.packet.pos = Class411.connection.packet.g2(-1434290800) * -1445626955;
				Class411.step = 582239970;
			}
			if (Class411.step * 327612781 == 58) {
				if (!Class411.connection.getStream((byte) -53).available(Class411.connection.packet.pos * 212851357, 2123249653)) {
					return;
				}
				Class411.connection.getStream((byte) -4).read(Class411.connection.packet.data, 0, Class411.connection.packet.pos * 212851357, (byte) -30);
				Class411.connection.packet.tinydec(Class411.currentIsaacKey, 1769425666);
				Class411.connection.packet.pos = 0;
				@Pc(479) String local479 = Class411.connection.packet.gjstr2(-1117095559);
				Class411.connection.packet.pos = 0;
				@Pc(487) String local487 = Class447.aClass447_9.getName((byte) -51);
				ServerProt.openUrl(local479, true, local487, client.aBoolean596, (byte) 104);
				Class411.step = 1975392576;
			}
			if (Class411.step * 327612781 == 64) {
				if (!Class411.connection.getStream((byte) -76).available(1, 715911681)) {
					return;
				}
				Class411.connection.getStream((byte) 0).read(Class411.connection.packet.data, 0, 1, (byte) -33);
				if ((Class411.connection.packet.data[0] & 0xFF) == 1) {
					Class411.step = -926422114;
				}
			}
			if (Class411.step * 327612781 == 70) {
				if (!Class411.connection.getStream((byte) 77).available(16, 420343017)) {
					return;
				}
				Class411.connection.getStream((byte) -41).read(Class411.connection.packet.data, 0, 16, (byte) -53);
				Class411.connection.packet.pos = -1655194800;
				Class411.connection.packet.tinydec(Class411.currentIsaacKey, 625033299);
				Class411.connection.packet.pos = 0;
				Class411.ssoKeyIdentifier = Class411.connection.packet.g8(1346968861) * 7033311592096984251L;
				Class411.ssoKey = Class411.connection.packet.g8(400169516) * 5236525202755218899L;
				Class411.step = -1970699996;
			}
			if (Class411.step * 327612781 == 84) {
				Class411.connection.packet.pos = 0;
				Class411.connection.clear(-858473564);
				local160 = Class720.createLoginMessage((byte) -73);
				@Pc(601) PacketBit local601 = local160.packet;
				@Pc(634) int local634;
				@Pc(663) Packet local663;
				@Pc(773) Packet local773;
				@Pc(610) LoginProt local610;
				if (Class411.target * -1128337797 == 211) {
					if (Class411.socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.GAMELOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -15);
					local601.p2(0, 2127693466);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!Class411.socialNetworkLogin) {
						local601.p4(910, (byte) 30);
						local601.p4(1, (byte) -20);
						local601.p1(client.state * -849002901 == 14 ? 1 : 0, (byte) -128);
						local634 = local601.pos * 212851357;
						local663 = Class168.createLoginPacket((byte) 85);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(Class411.ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -57);
						if (Class411.ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(Class411.username, 1894919238);
						} else {
							local601.p8(Class411.ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(Class255.getWindowMode(1605089366), (byte) -80);
					local601.p2(Class553.width * -1378711501, 2132226195);
					local601.p2(Class553.height * 2091353777, 2131867587);
					local601.p1(Class51.options.antialiasing.getValue(-2018330866), (byte) -105);
					Class314.getUid192(local601, 1166550295);
					local601.pjstr(client.settings, 1235498509);
					local601.p4(client.affiliate * -1765120027, (byte) -42);
					local663 = Class51.options.encode(-642811349);
					local601.p1(local663.pos * 212851357, (byte) -78);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					client.aBoolean601 = true;
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 1834667533);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) 5);
					local601.p4(client.userFlowFlag1 * 1672118199, (byte) -32);
					local601.p4(client.userFlowFlag2 * -1830493323, (byte) 44);
					local601.p4(client.automatedTestFlag1 * 1723909759, (byte) 12);
					local601.p4(client.automatedTestFlag2 * 1191340313, (byte) -1);
					local601.pjstr(Class454.aString210, -462741700);
					local601.p1(client.aString138 == null ? 0 : 1, (byte) -88);
					if (client.aString138 != null) {
						local601.pjstr(client.aString138, -260050547);
					}
					local601.p1(client.javascript ? 1 : 0, (byte) -42);
					local601.p1(client.aBoolean597 ? 1 : 0, (byte) -63);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -41);
					local601.p4(client.anInt3434 * -1579845029, (byte) 1);
					local601.pjstr(client.clientToken, 579845132);
					local601.p1(Class94.mapWorld != null && Class94.mapWorld.id * 2142901097 == Class50.world.id * 2142901097 ? 0 : 1, (byte) -59);
					local601.p2(Class50.lobby.id * 2142901097, 2133375121);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(Class411.currentIsaacKey, local634, local601.pos * 212851357, (byte) -110);
					local601.psize2(local601.pos * 212851357 - local331, -25941922);
				} else {
					if (Class411.socialNetworkLogin) {
						local610 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						local610 = LoginProt.LOBBYLOGIN;
					}
					local601.p1(local610.opcode * 1690737369, (byte) -28);
					local601.p2(0, 2142126844);
					local331 = local601.pos * 212851357;
					local634 = local601.pos * 212851357;
					if (!Class411.socialNetworkLogin) {
						local601.p4(910, (byte) 23);
						local601.p4(1, (byte) -77);
						local663 = Class168.createLoginPacket((byte) 72);
						local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
						local634 = local601.pos * 212851357;
						local601.p1(Class411.ssoKeyIdentifier * 4457507688757033075L == -1L ? 1 : 0, (byte) -35);
						if (Class411.ssoKeyIdentifier * 4457507688757033075L == -1L) {
							local601.pjstr(Class411.username, 1297137556);
						} else {
							local601.p8(Class411.ssoKeyIdentifier * 4457507688757033075L);
						}
					}
					local601.p1(client.modeGame.id * -1111983921, (byte) -51);
					local601.p1(Class106.lang.getId(), (byte) -65);
					local601.p1(Class255.getWindowMode(1731944066), (byte) -8);
					local601.p2(Class553.width * -1378711501, 2135813365);
					local601.p2(Class553.height * 2091353777, 2124973746);
					local601.p1(Class51.options.antialiasing.getValue(-419702626), (byte) -22);
					Class314.getUid192(local601, 1072948958);
					local601.pjstr(client.settings, -140572713);
					local663 = Class51.options.encode(-453652048);
					local601.p1(local663.pos * 212851357, (byte) -34);
					local601.pdata(local663.data, 0, local663.pos * 212851357, 2026842986);
					local773 = new Packet(Class125_Sub3.platformStats.computeSize(-1088313566));
					Class125_Sub3.platformStats.encode(local773, 2090018569);
					local601.pdata(local773.data, 0, local773.data.length, 2026842986);
					local601.p4(client.verifyId * 1598735607, (byte) -29);
					local601.pjstr(Class454.aString210, -186578967);
					local601.p4(client.affiliate * -1765120027, (byte) -23);
					local601.p4(client.anInt3434 * -1579845029, (byte) 2);
					local601.pjstr(client.clientToken, 614037125);
					local601.p1(Class349.anInt4202 * -1710417755 & 0x1, (byte) -119);
					local601.pbool(false, -1505974050);
					Class4.pushJs5Crcs(local601, 1277953273);
					local601.tinyenc(Class411.currentIsaacKey, local634, local601.pos * 212851357, (byte) -3);
					local601.psize2(local601.pos * 212851357 - local331, -1257233166);
				}
				Class411.connection.send(local160, -2012480407);
				Class411.connection.flush((byte) 79);
				Class411.connection.clientIsaac = new IsaacRandom(Class411.currentIsaacKey);
				@Pc(1157) int[] local1157 = new int[4];
				for (local331 = 0; local331 < 4; local331++) {
					local1157[local331] = Class411.currentIsaacKey[local331] + 50;
				}
				Class411.connection.serverIsaac = new IsaacRandom(local1157);
				new IsaacRandom(local1157);
				Class411.connection.packet.setRandom(Class411.connection.serverIsaac, (byte) -85);
				Class411.currentIsaacKey = null;
				Class411.step = 1279989418;
			}
			if (Class411.step * 327612781 == 98) {
				if (!Class411.connection.getStream((byte) 53).available(1, 691821896)) {
					return;
				}
				Class411.connection.getStream((byte) 25).read(Class411.connection.packet.data, 0, 1, (byte) -76);
				local210 = Class411.connection.packet.g1((short) 16384);
				Class411.connection.packet.pos = 0;
				if (local210 == 21) {
					Class411.step = -808566346;
				} else if (local210 == 1) {
					Class411.step = 293466275;
					Class114.setReply(local210, 682838166);
					return;
				} else if (local210 == 52) {
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					Class411.step = -1443868475;
				} else if (local210 == 2) {
					if (Class411.aBoolean753) {
						Class411.aBoolean753 = false;
						Class411.step = -1044277882;
						return;
					}
					if (Class411.target * -1128337797 == 211) {
						Class596.aClass113_Sub1_1.method7412(1438098506);
						Class411.step = -688364288;
					} else {
						Class411.step = 526831521;
					}
				} else if (local210 == 15) {
					Class411.connection.length = 1705477074;
					Class411.step = 122548348;
				} else if (local210 == 23 && Class411.anInt4748 * 558401221 < 3) {
					Class411.waitingTime = 0;
					Class411.anInt4748 += 1751058445;
					Class411.step = -1044277882;
					Class411.connection.close((byte) 118);
					return;
				} else if (local210 == 42) {
					Class411.step = 529177811;
					Class114.setReply(local210, 1363680162);
					return;
				} else if (Class411.target * -1128337797 == 132 && local210 == 49 && client.state * -849002901 != 9) {
					if (Class411.enterLobbyReply * 914785575 != 52) {
						Class114.setReply(local210, 126962330);
					}
					return;
				} else if (!Class411.aBoolean750 || Class411.socialNetworkLogin || Class411.anInt4746 * 276097583 == -1 || local210 != 35) {
					if (local210 != 53) {
						Class411.step = -522138941;
						Class114.setReply(local210, 1915412652);
						Class411.connection.close((byte) 107);
						Class680.method33240(-15044996);
						return;
					}
					Class411.step = -1094993751;
				} else {
					Class411.socialNetworkLogin = true;
					Class411.waitingTime = 0;
					Class411.step = -1044277882;
					Class411.connection.close((byte) 52);
					return;
				}
			}
			if (Class411.step * 327612781 == 126) {
				if (!Class411.connection.getStream((byte) -101).available(1, 1083004271)) {
					return;
				}
				Class411.connection.getStream((byte) -68).read(Class411.connection.packet.data, 0, 1, (byte) -69);
				local210 = Class411.connection.packet.data[0] & 0xFF;
				Class411.hopTime = local210 * 1250766390;
				Class411.step = -522138941;
				Class114.setReply(21, -268567914);
				Class411.connection.close((byte) 54);
				Class680.method33240(2027638533);
				return;
			}
			if (Class411.step * 327612781 == 215) {
				if (!Class411.connection.getStream((byte) 20).available(2, 903131971)) {
					return;
				}
				Class411.connection.getStream((byte) -112).read(Class411.connection.packet.data, 0, 2, (byte) -20);
				Class411.queuePosition = (((Class411.connection.packet.data[0] & 0xFF) << 8) + (Class411.connection.packet.data[1] & 0xFF)) * 1980524355;
				Class411.step = 1279989418;
				return;
			}
			if (Class411.step * 327612781 == 245) {
				if (!Class411.connection.getStream((byte) -61).available(4, 1341825450)) {
					return;
				}
				Class411.connection.getStream((byte) 75).read(Class411.connection.packet.data, 0, 4, (byte) -30);
				Class411.banDuration = Class411.connection.packet.g4(-118643075) * -1923297061;
				Class411.connection.packet.pos = 0;
				Class411.step = -522138941;
				Class114.setReply(53, 1657639323);
				Class411.connection.close((byte) 11);
				Class680.method33240(1028519643);
				return;
			}
			if (Class411.step * 327612781 == 194) {
				if (Class166_Sub32.anInt2280 * 250407149 == 29) {
					if (!Class411.connection.getStream((byte) -69).available(1, 1418783848)) {
						return;
					}
					Class411.connection.getStream((byte) 88).read(Class411.connection.packet.data, 0, 1, (byte) -66);
					Class411.disallowResult = (Class411.connection.packet.data[0] & 0xFF) * 1109601241;
				} else if (Class166_Sub32.anInt2280 * 250407149 == 45) {
					if (!Class411.connection.getStream((byte) 37).available(3, 1202290380)) {
						return;
					}
					Class411.connection.getStream((byte) -19).read(Class411.connection.packet.data, 0, 3, (byte) -95);
					Class411.disallowResult = (Class411.connection.packet.data[0] & 0xFF) * 1109601241;
					Class411.disallowTrigger = (((Class411.connection.packet.data[1] & 0xFF) << 8) + (Class411.connection.packet.data[2] & 0xFF)) * 156824051;
				} else {
					throw new IllegalStateException();
				}
				Class411.step = -522138941;
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, 1217611470);
				Class411.connection.close((byte) 73);
				Class680.method33240(365058666);
				if (Class56.method18036(client.state * -849002901, -1497248091)) {
					Class642.logout(true, (short) 9068);
					Class411.enterGameReply = Class166_Sub32.anInt2280 * 1066586085;
				}
				return;
			}
			if (Class411.step * 327612781 == 225) {
				if (!Class411.connection.getStream((byte) 82).available(2, -317745603)) {
					return;
				}
				Class411.connection.getStream((byte) -30).read(Class411.connection.packet.data, 0, 2, (byte) -28);
				Class411.connection.packet.pos = 0;
				Class629.urlLength = Class411.connection.packet.g2(-1434290800) * -430049679;
				Class411.connection.packet.pos = 0;
				Class411.step = 878052535;
				return;
			}
			if (Class411.step * 327612781 == 235) {
				if (!Class411.connection.getStream((byte) -23).available(Class629.urlLength * -2062087535, 1087775005)) {
					return;
				}
				Class411.connection.getStream((byte) -21).read(Class411.connection.packet.data, 0, Class629.urlLength * -2062087535, (byte) -50);
				Class411.connection.packet.pos = 0;
				@Pc(1720) byte[] local1720 = new byte[Class629.urlLength * -2062087535 + 1];
				Class411.connection.packet.gIsaacArrayBuffer(local1720, 0, Class629.urlLength * -2062087535, 1631260608);
				Class411.connection.packet.pos = 0;
				@Pc(1738) Packet local1738 = new Packet(local1720);
				@Pc(1742) String local1742 = local1738.gjstr(1902065692);
				Class338.method27464(local1742, true, client.aBoolean596, (byte) -24);
				Class114.setReply(Class166_Sub32.anInt2280 * 250407149, -139487030);
				if (Class411.target * -1128337797 == 132 && client.state * -849002901 != 9) {
					Class411.step = 1279989418;
				} else {
					Class411.step = -522138941;
					Class411.connection.close((byte) 82);
					Class680.method33240(1995223237);
				}
				return;
			}
			if (Class411.step * 327612781 == 256) {
				if (!Class411.connection.getStream((byte) 21).available(2, -100266531)) {
					return;
				}
				Class411.connection.getStream((byte) 17).read(Class411.connection.packet.data, 0, 2, (byte) -70);
				Class411.connection.packet.pos = 0;
				Class411.connection.length = Class411.connection.packet.g2(-1434290800) * -852738537;
				Class411.step = 2097940924;
			}
			@Pc(1890) PacketBit local1890;
			if (Class411.step * 327612781 == 268) {
				if (!Class411.connection.getStream((byte) 111).available(Class411.connection.length * 2010044839, 1511427964)) {
					return;
				}
				Class411.connection.getStream((byte) 35).read(Class411.connection.packet.data, 0, Class411.connection.length * 2010044839, (byte) -1);
				Class411.connection.packet.pos = 0;
				@Pc(1855) boolean local1855 = Class411.connection.packet.g1((short) 16384) == 1;
				while (true) {
					if (Class411.connection.packet.pos * 212851357 >= Class411.connection.length * 2010044839) {
						if (local1855) {
							@Pc(1887) ClientMessage local1887 = Class720.createLoginMessage((byte) -98);
							local1890 = local1887.packet;
							local1890.p1(LoginProt.GAMELOGIN_CONTINUE.opcode * 1690737369, (byte) -128);
							Class411.connection.send(local1887, -1681353142);
							Class411.connection.flush((byte) 122);
							Class411.step = 1977738866;
						} else {
							Class411.step = -688364288;
						}
						break;
					}
					@Pc(1871) Class466 local1871 = Class72.aClass79_Sub1_Sub2_2.method1468(Class411.connection.packet, (byte) 88);
					Class596.aClass113_Sub1_1.anInterface3_2.method776(local1871.anInt5092 * -1181855333, local1871.anObject19, (byte) 122);
				}
			}
			if (Class411.step * 327612781 == 138) {
				if (!Class411.connection.getStream((byte) -8).available(1, 1399570793)) {
					return;
				}
				Class411.connection.getStream((byte) -8).read(Class411.connection.packet.data, 0, 1, (byte) -48);
				local210 = Class411.connection.packet.data[0] & 0xFF;
				if (local210 != 2) {
					if (local210 != 29 && local210 != 45) {
						Class411.step = -522138941;
						Class114.setReply(local210, -512144634);
						Class411.connection.close((byte) 85);
						Class680.method33240(157881847);
						if (Class56.method18036(client.state * -849002901, -1497248091)) {
							Class642.logout(true, (short) 13354);
							Class411.enterGameReply = local210 * 449182681;
						}
						return;
					}
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					Class411.step = 2095594634;
					return;
				}
				Class411.step = 526831521;
			}
			if (Class411.step * 327612781 == 141) {
				if (!Class411.connection.getStream((byte) -75).available(1, 1151351395)) {
					return;
				}
				Class411.connection.getStream((byte) 81).read(Class411.connection.packet.data, 0, 1, (byte) -9);
				Class566.anInt5385 = (Class411.connection.packet.data[0] & 0xFF) * 252135035;
				Class411.step = -53062159;
			}
			@Pc(2027) PacketBit local2027;
			if (Class411.step * 327612781 == 157) {
				local2027 = Class411.connection.packet;
				if (Class411.target * -1128337797 == 211) {
					if (!Class411.connection.getStream((byte) -12).available(Class566.anInt5385 * 1395370163, 565770471)) {
						return;
					}
					Class411.connection.getStream((byte) -4).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -67);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					client.userQuickChat4 = local2027.g1((short) 16384) == 1;
					client.selfPlayerSlot = local2027.g2(-1434290800) * -410368243;
					client.userMember = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					client.mapMember = local2027.g1((short) 16384) == 1;
					Class108_Sub2.mapOwner = local2027.gjstr(826188283);
					Class99.aLong23 = (local2027.g6(423654682) - Class305.method26797(281796483)) * -3359956914723456965L;
					client.world.method30496(1429830917).setMembers(client.mapMember, -1278679274);
					Class392.aClass541_1.method30914(1412431328).method30496(1592888770).setMembers(client.mapMember, -1542972859);
					Class277.aClass32_Sub12_1.setMembers(client.mapMember, 566140184);
					Class162.aClass32_Sub3_2.setMembers(client.mapMember, 821785291);
				} else if (Class411.connection.getStream((byte) 23).available(Class566.anInt5385 * 1395370163, 670220006)) {
					Class411.connection.getStream((byte) 67).read(local2027.data, 0, Class566.anInt5385 * 1395370163, (byte) -110);
					local2027.pos = 0;
					Class124.decodeTotpToken(local2027, -909097621);
					client.userStaffModLevel = local2027.g1((short) 16384) * 1370077333;
					client.userPlayerModLevel = local2027.g1((short) 16384) * -823645517;
					client.userQuickChat1 = local2027.g1((short) 16384) == 1;
					Class626.userDob = local2027.g3s(-87715282) * 889370685;
					Class520.selfPlayer.gender = (byte) local2027.g1((short) 16384);
					client.userQuickChat2 = local2027.g1((short) 16384) == 1;
					client.userQuickChat3 = local2027.g1((short) 16384) == 1;
					Class707.userMembershipTime = local2027.g8(-1738728895) * 2435269274467726403L;
					Class99.aLong23 = (-9212939189200455573L * Class707.userMembershipTime - Class305.method26797(-15223196) - local2027.g5(1593356826)) * -3359956914723456965L;
					local271 = local2027.g1((short) 16384);
					client.userMember = (local271 & 0x1) != 0;
					Class154_Sub1.userMember2 = (local271 & 0x2) != 0;
					Class351.userJcoinsBalance = local2027.g4(-118643075) * 2104983145;
					Class380.userLoyaltyBalance = local2027.g4(-118643075) * -446903243;
					Class82.userRecoveryDay = local2027.g2(-1434290800) * -1522109095;
					Class659.userUnreadMessages = local2027.g2(-1434290800) * -872150107;
					Class278.userLastLoginDay = local2027.g2(-1434290800) * 472135179;
					Class669.userLastLoginAddress = local2027.g4(-118643075) * -860346295;
					Class120.userLastLoginHost = new Class499(Class669.userLastLoginAddress * 1514424825);
					(new Thread(Class120.userLastLoginHost)).start();
					Class552.userEmailStatus = local2027.g1((short) 16384) * 393742747;
					Class358.userCcExpiry = local2027.g2(-1434290800) * -606039961;
					Class481.userGraceExpiry = local2027.g2(-1434290800) * 1920483791;
					Class32_Sub19.userDobRequested = local2027.g1((short) 16384) == 1;
					Class520.selfPlayer.name2 = Class520.selfPlayer.name1 = RuntimeException_Sub1.aString116 = local2027.gjstr2(-1130052427);
					Class529.userMembersStats = local2027.g1((short) 16384) * -375509133;
					Class549.userPlayAge = local2027.g4(-118643075) * -2104784137;
					Class94.mapWorld = new Class28();
					Class94.mapWorld.id = local2027.g2(-1434290800) * 470002905;
					if (Class94.mapWorld.id * 2142901097 == 65535) {
						Class94.mapWorld.id = -470002905;
					}
					Class94.mapWorld.host = local2027.gjstr2(1173413294);
					Class94.mapWorld.port1 = local2027.g2(-1434290800) * -1138615973;
					Class94.mapWorld.port2 = local2027.g2(-1434290800) * 702279345;
					if (Class280.modeWhere != ModeWhere.LOCAL && (Class280.modeWhere != ModeWhere.WTQA || client.userStaffModLevel * 2055688893 < 2) && Class50.world.method597(Class50.game, -39165838)) {
						Class667.autoWorld(2061402132);
					}
				} else {
					return;
				}
				if (client.userQuickChat3) {
					try {
						Class70.method1237(Class32_Sub10.applet, "zap", 2100882652);
					} catch (@Pc(2456) Throwable local2456) {
						if (client.aBoolean593) {
							try {
								Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2470) Exception local2470) {
							}
						}
					}
				} else {
					try {
						Class70.method1237(Class32_Sub10.applet, "unzap", 1769704156);
					} catch (@Pc(2478) Throwable local2478) {
					}
				}
				if (Class280.modeWhere == ModeWhere.aModeWhere_8) {
					Class447.aClass447_2.method28913(-2000738922);
				}
				if (Class411.target * -1128337797 != 211) {
					Class411.step = -522138941;
					Class114.setReply(2, -783815977);
					Class163.method14911(-2093693708);
					Class481.setState(13, 1823202236);
					Class411.connection.serverPacketType = null;
					return;
				}
				Class411.step = 817951506;
			}
			if (Class411.step * 327612781 == 170) {
				if (!Class411.connection.getStream((byte) 13).available(3, 37565459)) {
					return;
				}
				Class411.connection.getStream((byte) 79).read(Class411.connection.packet.data, 0, 3, (byte) -104);
				Class411.step = 702442028;
			}
			if (Class411.step * 327612781 == 188) {
				local2027 = Class411.connection.packet;
				local2027.pos = 0;
				if (local2027.peekIsaacBit(144506231)) {
					if (!Class411.connection.getStream((byte) -96).available(1, 1127259701)) {
						return;
					}
					Class411.connection.getStream((byte) 93).read(local2027.data, 3, 1, (byte) -85);
				}
				Class411.connection.serverPacketType = ServerProt.values(816042431)[local2027.gIsaac1or2(-1480399332)];
				Class411.connection.length = local2027.g2(-1434290800) * -852738537;
				Class411.step = -1503969504;
			}
			if (Class411.step * 327612781 == 160) {
				if (!Class411.connection.getStream((byte) -76).available(Class411.connection.length * 2010044839, 1340360174)) {
					return;
				}
				Class411.connection.getStream((byte) 43).read(Class411.connection.packet.data, 0, Class411.connection.length * 2010044839, (byte) -98);
				Class411.connection.packet.pos = 0;
				local210 = Class411.connection.length * 2010044839;
				Class411.step = -522138941;
				Class114.setReply(2, 1017547595);
				Class329.method27348(1073741823);
				Class110_Sub5.method7654(Class411.connection.packet, -1504067443);
				local271 = local210 - Class411.connection.packet.pos * 212851357;
				local1890 = new PacketBit(local271);
				System.arraycopy(Class411.connection.packet.data, Class411.connection.packet.pos * 212851357, local1890.data, 0, local271);
				Class411.connection.packet.pos += local271 * -1445626955;
				if (ServerProt.REBUILD_REGION == Class411.connection.serverPacketType) {
					client.world.beginRebuild(new Class537(Class526.REGION, local1890), 288640483);
				} else {
					client.world.beginRebuild(new Class537(Class526.NORMAL, local1890), 1912141015);
				}
				if (local210 != Class411.connection.packet.pos * 212851357) {
					throw new RuntimeException(Class411.connection.packet.pos * 212851357 + " " + local210);
				}
				Class411.connection.serverPacketType = null;
				return;
			}
			if (Class411.step * 327612781 == 204) {
				if (Class411.connection.length * 2010044839 == -2) {
					if (!Class411.connection.getStream((byte) -72).available(2, 705407383)) {
						return;
					}
					Class411.connection.getStream((byte) -4).read(Class411.connection.packet.data, 0, 2, (byte) -72);
					Class411.connection.packet.pos = 0;
					Class411.connection.length = Class411.connection.packet.g2(-1434290800) * -852738537;
				}
				if (!Class411.connection.getStream((byte) -12).available(Class411.connection.length * 2010044839, 150401185)) {
					return;
				}
				Class411.connection.getStream((byte) 9).read(Class411.connection.packet.data, 0, Class411.connection.length * 2010044839, (byte) -13);
				Class411.connection.packet.pos = 0;
				local210 = Class411.connection.length * 2010044839;
				Class411.step = -522138941;
				Class114.setReply(15, -827767309);
				Class490.method29977((byte) 41);
				Class110_Sub5.method7654(Class411.connection.packet, -1605988782);
				if (Class411.connection.packet.pos * 212851357 != local210) {
					throw new RuntimeException(Class411.connection.packet.pos * 212851357 + " " + local210);
				}
				Class411.connection.serverPacketType = null;
				return;
			}
		} catch (@Pc(2835) IOException local2835) {
			Class411.connection.close((byte) 37);
			if (Class411.anInt4748 * 558401221 < 3) {
				if (Class411.target * -1128337797 == 211) {
					Class50.world.cycleSettings((short) -24293);
				} else {
					Class50.lobby.cycleSettings((short) -19179);
				}
				Class411.waitingTime = 0;
				Class411.anInt4748 += 1751058445;
				Class411.step = -1044277882;
			} else {
				Class411.step = -522138941;
				Class114.setReply(-4, -71889975);
				Class680.method33240(1925192025);
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "lr", descriptor = "(Lclient!yf;I)V", line = 7031)
	static final void method26219(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class280.method26456(local11, arg0, -343583539);
	}

	@OriginalMember(owner = "client!fj", name = "zh", descriptor = "(Lclient!yf;I)V", line = 9389)
	static final void method26220(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3522 * 929376837;
	}

	@OriginalMember(owner = "client!fj", name = "acq", descriptor = "(Lclient!yf;B)V", line = 10025)
	static final void method26221(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.anInt4647 * 1113751329;
	}

	@OriginalMember(owner = "client!fj", name = "avi", descriptor = "(Lclient!yf;B)V", line = 13563)
	static final void method26222(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) long local2 = Class305.method26797(520997478);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) (local2 / 60000L);
	}
}
