package rs2.client.login;

import com.jagex.core.constants.ModeWhere;
import com.jagex.core.constants.PublicKeys;
import com.jagex.core.datastruct.IterableMap;
import com.jagex.core.datastruct.IterableQueue;
import com.jagex.core.io.Packet;
import com.jagex.core.io.PacketBit;
import com.jagex.core.io.Stream;
import com.jagex.core.utils.*;
import com.jagex.encryption.Isaac;
import com.jagex.game.client.*;
import com.jagex.game.config.Js5Archive;
import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.network.ServerConnection;
import com.jagex.game.network.protocol.LoginProt;
import com.jagex.game.network.protocol.ServerProt;
import com.jagex.game.scene.ChangeLocationRequest;
import com.jagex.game.script.SubInterface;
import com.jagex.game.world.entity.PlayerStat;
import com.jagex.graphics.ClientWatch;
import com.jagex.graphics.MiniMenu;
import com.jagex.graphics.Minimap;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.logic.DelayedStateChange;
import rs2.client.scene.entities.PathingEntity;

import java.io.IOException;
import java.net.URL;

@ObfuscatedName("m")
public class LoginManager {

	@ObfuscatedName("m.m")
	public static int field431;

	@ObfuscatedName("m.k")
	public static ServerConnection connection;

	@ObfuscatedName("m.f")
	public static boolean field456 = false;

	@ObfuscatedName("m.w")
	public static long field434;

	@ObfuscatedName("m.l")
	public static int[] field435;

	@ObfuscatedName("m.u")
	public static int[] field436;

	@ObfuscatedName("m.z")
	public static boolean field438 = false;

	@ObfuscatedName("m.p")
	public static int field472 = -1;

	@ObfuscatedName("m.d")
	public static long field439 = -1L;

	@ObfuscatedName("m.ap")
	public static int field445 = 7;

	@ObfuscatedName("m.aq")
	public static long field437 = 0L;

	@ObfuscatedName("m.ax")
	public static String username = "";

	@ObfuscatedName("m.av")
	public static String password = "";

	@ObfuscatedName("m.ao")
	public static String field429 = "";

	@ObfuscatedName("m.aj")
	public static boolean field473 = true;

	@ObfuscatedName("mc.ay")
	public static long field3429;

	@ObfuscatedName("m.ab")
	public static int field478 = 0;

	@ObfuscatedName("m.az")
	public static int field475 = 0;

	@ObfuscatedName("t.aa")
	public static int field622;

	@ObfuscatedName("vz.af")
	public static int field7542;

	@ObfuscatedName("anh.ak")
	public static int field11819;

	@ObfuscatedName("m.an")
	public static int enterLobbyReply = -2;

	@ObfuscatedName("m.bf")
	public static int reply = -2;

	@ObfuscatedName("m.bl")
	public static int field469 = -2;

	@ObfuscatedName("m.bk")
	public static int field479 = -1;

	@ObfuscatedName("m.bh")
	public static int field444 = -1;

	@ObfuscatedName("m.bx")
	public static int hoptime = 0;

	@ObfuscatedName("m.bd")
	public static int disallowTrigger = -1;

	@ObfuscatedName("m.bc")
	public static int disallowResult = -1;

	@ObfuscatedName("m.bi")
	public static int queuePosition = 0;

	@ObfuscatedName("m.bn")
	public static boolean field485 = false;

	@ObfuscatedName("m.bt")
	public static int banDuration = 0;

	@ObfuscatedName("m.bq")
	public static boolean field487 = false;

	public LoginManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kg.e(I)Z")
	public static boolean method5143() {
		return field472 == -1 ? method10320(username, password) : method7703();
	}

	@ObfuscatedName("iu.n(S)Z")
	public static boolean method4407() {
		return field472 == -1 ? method17521(username, password) : method1592();
	}

	@ObfuscatedName("ug.m(I)V")
	public static final void method9067() {
		field445 = 7;
		reply = -2;
		enterLobbyReply = -2;
	}

	@ObfuscatedName("jd.k(B)V")
	public static final void method4641() {
		field439 = -1L;
		field437 = 0L;
		field472 = -1;
	}

	@ObfuscatedName("aaa.f(B)V")
	public static final void cancelLogin() {
		if (field445 != 7) {
			connection.closeGracefully();
			method9067();
			method10367();
		}
	}

	@ObfuscatedName("et.w(I)Z")
	public static final boolean isInProgress() {
		return field445 != 7;
	}

	@ObfuscatedName("vn.l(B)V")
	public static void method9584() {
		if (field445 == 103) {
			field445 = 110;
		}
	}

	@ObfuscatedName("ag.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZB)V")
	public static void requestLogin(String arg0, String arg1, String arg2, boolean arg3) {
		if (arg0.length() > 320 || !method16808()) {
			return;
		}
		method4641();
		username = arg0;
		password = arg1;
		field429 = arg2;
		field473 = arg3;
		Client.setState(7);
	}

	@ObfuscatedName("df.z(ILjava/lang/String;ZI)V")
	public static void requestSocialNetwork(int arg0, String arg1, boolean arg2) {
		if (!method16808()) {
			return;
		}
		if (field472 != arg0) {
			field439 = -1L;
		}
		field472 = arg0;
		field429 = arg1;
		field473 = arg2;
		Client.setState(7);
	}

	@ObfuscatedName("amr.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V")
	public static void enterLobby(String arg0, String arg1, String arg2, boolean arg3) {
		if (arg0.length() > 320 || !method16808()) {
			return;
		}
		Client.lobbyConnection.closeGracefully();
		method4641();
		username = arg0;
		password = arg1;
		field429 = arg2;
		field473 = arg3;
		Client.setState(17);
	}

	@ObfuscatedName("aji.d(ILjava/lang/String;ZS)V")
	public static void enterLobbySocialNetwork(int arg0, String arg1, boolean arg2) {
		if (!method16808()) {
			return;
		}
		if (field472 != arg0) {
			field439 = -1L;
		}
		field472 = arg0;
		field429 = arg1;
		field473 = arg2;
		Client.lobbyConnection.closeGracefully();
		Client.setState(17);
	}

	@ObfuscatedName("dt.c(Ljava/lang/String;ZI)V")
	public static void enterGame(String arg0, boolean arg1) {
		if (Client.state == 13 && (!isInProgress() && !AccountCreationManager.method9610())) {
			field429 = arg0;
			field473 = arg1;
			Client.setState(15);
		}
	}

	@ObfuscatedName("ys.r(B)V")
	public static void method10450() {
		field429 = "";
		password = "";
		username = "";
		field473 = true;
	}

	@ObfuscatedName("ajf.v(Ljava/lang/String;Ljava/lang/String;B)Z")
	public static boolean method17521(String arg0, String arg1) {
		field431 = 132;
		connection = Client.lobbyConnection;
		return method7238(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("xo.o(Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean method10320(String arg0, String arg1) {
		field431 = 211;
		connection = Client.gameConnection;
		return method7238(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("rg.s(I)Z")
	public static boolean method7703() {
		field431 = 211;
		connection = Client.gameConnection;
		return method7238(field439 == -1L, true, "", "", field439);
	}

	@ObfuscatedName("cz.y(I)Z")
	public static boolean method1592() {
		field431 = 132;
		connection = Client.lobbyConnection;
		return method7238(field439 == -1L, true, "", "", field439);
	}

	@ObfuscatedName("qj.q(ZZLjava/lang/String;Ljava/lang/String;J)Z")
	public static boolean method7238(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
		field438 = arg0;
		if (!arg1) {
			field472 = -1;
		}
		field456 = arg1;
		username = arg2;
		password = arg3;
		field439 = arg4;
		if (!field456 && (username.equals("") || password.equals(""))) {
			method669(3);
			method10367();
			return false;
		}
		if (field431 != 132) {
			hoptime = 0;
			disallowResult = -1;
			disallowTrigger = -1;
		}
		connection.disconnected = false;
		method669(-3);
		field445 = 14;
		field478 = 0;
		field475 = 0;
		return true;
	}

	@ObfuscatedName("fj.x(B)V")
	public static final void method3048() {
		if (field445 == 7 || field445 == 103) {
			return;
		}
		try {
			short var0;
			if (field475 == 0 && field445 < 98) {
				var0 = 500;
			} else {
				var0 = 2000;
			}
			if (field438 && field445 >= 64) {
				var0 = 6000;
			}
			if (field431 == 211 && field445 != 215 && reply != 42 || field431 == 132 && enterLobbyReply != 49 && enterLobbyReply != 52) {
				field478++;
			}
			if (field478 > var0) {
				connection.closeGracefully();
				if (field475 >= 3) {
					field445 = 7;
					method669(-5);
					method10367();
					return;
				}
				if (field431 == 211) {
					WorldSwitcher.currentWorld.configureSocketType();
				} else {
					WorldSwitcher.currentLobby.configureSocketType();
				}
				field478 = 0;
				field475++;
				field445 = 14;
			}
			if (field445 == 14) {
				if (field431 == 211) {
					connection.setStream(Stream.createStream(WorldSwitcher.currentWorld.getSocket(), 40000), WorldSwitcher.currentWorld.host);
				} else {
					connection.setStream(Stream.createStream(WorldSwitcher.currentLobby.getSocket(), 40000), WorldSwitcher.currentLobby.host);
				}
				if (Client.field10311 == null) {
					Client.field10311 = Client.field10967.method709();
					Client.field10967.method710();
					Client.field10967 = null;
				}
				connection.clearWriteQueue();
				ClientMessage var1 = ClientMessage.createMessage();
				var1.buf.p1(LoginProt.INIT_GAME_CONNECTION.id);
				connection.queue(var1);
				connection.flush();
				field445 = 35;
			}
			if (field445 == 35) {
				if (!connection.getStream().hasAvailable(9)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 9);
				connection.in.pos = 0;
				int var2 = connection.in.g1();
				if (var2 != 0) {
					field445 = 7;
					method481(var2);
					method669(var2);
					connection.closeGracefully();
					method10367();
					return;
				}
				field434 = connection.in.g8();
				connection.in.pos = 0;
				if (field438) {
					field445 = 276;
				} else {
					field445 = 84;
				}
			}
			if (field445 == 276) {
				ClientMessage var3 = ClientMessage.createMessage();
				var3.buf.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.id);
				var3.buf.p2(0);
				int var4 = var3.buf.pos;
				var3.buf.p4(910);
				var3.buf.p4(1);
				if (field431 == 211) {
					var3.buf.p1(Client.state == 14 ? 1 : 0);
				}
				Packet var5 = method4378();
				method14049(var5, (long) field472);
				field3429 = field472;
				var5.p1(field472);
				var5.p1(Client.language.getId());
				var5.p4(Client.playerIsAffiliate);
				for (int var6 = 0; var6 < 5; var6++) {
					var5.p4(Client.field10311.nextInt());
				}
				var5.p8(Client.field10810);
				var5.p1(Client.modegame.field8339);
				var5.p1(Client.field10311.nextInt());
				var5.rsaenc(PublicKeys.field624, PublicKeys.field626);
				var3.buf.pdata(var5.data, 0, var5.pos);
				var3.buf.psize2(var3.buf.pos - var4);
				connection.queue(var3);
				connection.flush();
				field445 = 40;
			}
			if (field445 == 40) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				connection.in.pos = 0;
				connection.in.pos = connection.in.g2();
				field445 = 58;
			}
			if (field445 == 58) {
				if (!connection.getStream().hasAvailable(connection.in.pos)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, connection.in.pos);
				connection.in.tinydec(field435);
				connection.in.pos = 0;
				String var7 = connection.in.gjstr2();
				connection.in.pos = 0;
				String var8 = JavascriptFunction.field4032.method6087();
				Browser.method6081(var7, true, var8, Client.field10784);
				field445 = 64;
			}
			if (field445 == 64) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				if ((connection.in.data[0] & 0xFF) == 1) {
					field445 = 70;
				}
			}
			if (field445 == 70) {
				if (!connection.getStream().hasAvailable(16)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 16);
				connection.in.pos = 16;
				connection.in.tinydec(field435);
				connection.in.pos = 0;
				field439 = connection.in.g8();
				field437 = connection.in.g8();
				field445 = 84;
			}
			if (field445 == 84) {
				connection.in.pos = 0;
				connection.clearWriteQueue();
				ClientMessage var9 = ClientMessage.createMessage();
				PacketBit var10 = var9.buf;
				if (field431 == 211) {
					LoginProt var11;
					if (field438) {
						var11 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						var11 = LoginProt.GAMELOGIN;
					}
					var10.p1(var11.id);
					var10.p2(0);
					int var12 = var10.pos;
					int var13 = var10.pos;
					if (!field438) {
						var10.p4(910);
						var10.p4(1);
						var10.p1(Client.state == 14 ? 1 : 0);
						int var14 = var10.pos;
						Packet var15 = method896();
						var10.pdata(var15.data, 0, var15.pos);
						var13 = var10.pos;
						var10.p1(field439 == -1L ? 1 : 0);
						if (field439 == -1L) {
							var10.pjstr(username);
						} else {
							var10.p8(field439);
						}
					}
					var10.p1(Client.getWindowMode());
					var10.p2(GameShell.canvasWid);
					var10.p2(GameShell.canvasHei);
					var10.p1(Client.preferences.antiAliasing2.getValue());
					GameShell.pushUID192(var10);
					var10.pjstr(Client.field10990);
					var10.p4(Client.playerIsAffiliate);
					Packet var16 = Client.preferences.createPreferencesBlock();
					var10.p1(var16.pos);
					var10.pdata(var16.data, 0, var16.pos);
					Client.field10800 = true;
					Packet var17 = new Packet(Client.hardwarePlatform.calculateHardwarePlatformSize());
					Client.hardwarePlatform.createHardwareBlock(var17);
					var10.pdata(var17.data, 0, var17.data.length);
					var10.p4(Client.field10842);
					var10.p4(Client.field10776);
					var10.p4(Client.field10775);
					var10.p4(Client.field10778);
					var10.p4(Client.field10777);
					var10.pjstr(Client.field579);
					var10.p1(Client.field10781 == null ? 0 : 1);
					if (Client.field10781 != null) {
						var10.pjstr(Client.field10781);
					}
					var10.p1(Client.field11079 ? 1 : 0);
					var10.p1(Client.field10785 ? 1 : 0);
					var10.p1(Client.clientType & 0x1);
					var10.p4(Client.field10788);
					var10.pjstr(Client.field10789);
					var10.p1(WorldSwitcher.field9200 != null && WorldSwitcher.field9200.node == WorldSwitcher.currentWorld.node ? 0 : 1);
					var10.p2(WorldSwitcher.currentLobby.node);
					method14463(var10);
                    var10.tinyenc(field435, var13, var10.pos);
					var10.psize2(var10.pos - var12);
				} else {
					LoginProt var18;
					if (field438) {
						var18 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						var18 = LoginProt.LOBBYLOGIN;
					}
					var10.p1(var18.id);
					var10.p2(0);
					int var19 = var10.pos;
					int var20 = var10.pos;
					if (!field438) {
						var10.p4(910);
						var10.p4(1);
						Packet var21 = method896();
						var10.pdata(var21.data, 0, var21.pos);
						var20 = var10.pos;
						var10.p1(field439 == -1L ? 1 : 0);
						if (field439 == -1L) {
							var10.pjstr(username);
						} else {
							var10.p8(field439);
						}
					}
					var10.p1(Client.modegame.field8339);
					var10.p1(Client.language.getId());
					var10.p1(Client.getWindowMode());
					var10.p2(GameShell.canvasWid);
					var10.p2(GameShell.canvasHei);
					var10.p1(Client.preferences.antiAliasing2.getValue());
					GameShell.pushUID192(var10);
					var10.pjstr(Client.field10990);
					Packet var22 = Client.preferences.createPreferencesBlock();
					var10.p1(var22.pos);
					var10.pdata(var22.data, 0, var22.pos);
					Packet var23 = new Packet(Client.hardwarePlatform.calculateHardwarePlatformSize());
					Client.hardwarePlatform.createHardwareBlock(var23);
					var10.pdata(var23.data, 0, var23.data.length);
					var10.p4(Client.field10842);
					var10.pjstr(Client.field579);
					var10.p4(Client.playerIsAffiliate);
					var10.p4(Client.field10788);
					var10.pjstr(Client.field10789);
					var10.p1(Client.clientType & 0x1);
					var10.pbool(false);
					method14463(var10);
                    var10.tinyenc(field435, var20, var10.pos);
					var10.psize2(var10.pos - var19);
				}
				connection.queue(var9);
				connection.flush();
				connection.randomOut = new Isaac(field435);
				int[] var24 = new int[4];
				for (int var25 = 0; var25 < 4; var25++) {
					var24[var25] = field435[var25] + 50;
				}
				connection.randomIn = new Isaac(var24);
				new Isaac(var24);
				connection.in.setIsaac(connection.randomIn);
				field435 = null;
				field445 = 98;
			}
			if (field445 == 98) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				int var26 = connection.in.g1();
				connection.in.pos = 0;
				if (var26 == 21) {
					field445 = 126;
				} else if (var26 == 1) {
					field445 = 103;
					method669(var26);
					return;
				} else if (var26 == 52) {
					field11819 = var26;
					field445 = 225;
				} else if (var26 == 2) {
					if (field487) {
						field487 = false;
						field445 = 14;
						return;
					}
					if (field431 == 211) {
						Client.field7228.method16415();
						field445 = 256;
					} else {
						field445 = 141;
					}
				} else if (var26 == 15) {
					connection.packetSize = -2;
					field445 = 204;
				} else if (var26 == 23 && field475 < 3) {
					field478 = 0;
					field475++;
					field445 = 14;
					connection.closeGracefully();
					return;
				} else if (var26 == 42) {
					field445 = 215;
					method669(var26);
					return;
				} else if (field431 == 132 && var26 == 49 && Client.state != 9) {
					if (enterLobbyReply != 52) {
						method669(var26);
					}
					return;
				} else if (!field456 || field438 || field472 == -1 || var26 != 35) {
					if (var26 != 53) {
						field445 = 7;
						method669(var26);
						connection.closeGracefully();
						method10367();
						return;
					}
					field445 = 245;
				} else {
					field438 = true;
					field478 = 0;
					field445 = 14;
					connection.closeGracefully();
					return;
				}
			}
			if (field445 == 126) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				int var27 = connection.in.data[0] & 0xFF;
				hoptime = var27 * 50;
				field445 = 7;
				method669(21);
				connection.closeGracefully();
				method10367();
				return;
			}
			if (field445 == 215) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				queuePosition = ((connection.in.data[0] & 0xFF) << 8) + (connection.in.data[1] & 0xFF);
				field445 = 98;
				return;
			}
			if (field445 == 245) {
				if (!connection.getStream().hasAvailable(4)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 4);
				banDuration = connection.in.g4s();
				connection.in.pos = 0;
				field445 = 7;
				method669(53);
				connection.closeGracefully();
				method10367();
				return;
			}
			if (field445 == 194) {
				if (field11819 == 29) {
					if (!connection.getStream().hasAvailable(1)) {
						return;
					}
					connection.getStream().read(connection.in.data, 0, 1);
					disallowResult = connection.in.data[0] & 0xFF;
				} else if (field11819 == 45) {
					if (!connection.getStream().hasAvailable(3)) {
						return;
					}
					connection.getStream().read(connection.in.data, 0, 3);
					disallowResult = connection.in.data[0] & 0xFF;
					disallowTrigger = ((connection.in.data[1] & 0xFF) << 8) + (connection.in.data[2] & 0xFF);
				} else {
					throw new IllegalStateException();
				}
				field445 = 7;
				method669(field11819);
				connection.closeGracefully();
				method10367();
				if (Client.method15084(Client.state)) {
					Client.logout(true);
					reply = field11819;
				}
				return;
			}
			if (field445 == 225) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				connection.in.pos = 0;
				field7542 = connection.in.g2();
				connection.in.pos = 0;
				field445 = 235;
				return;
			}
			if (field445 == 235) {
				if (!connection.getStream().hasAvailable(field7542)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, field7542);
				connection.in.pos = 0;
				byte[] var28 = new byte[field7542 + 1];
				connection.in.gIsaacArrayBuffer(var28, 0, field7542);
				connection.in.pos = 0;
				Packet var29 = new Packet(var28);
				String var30 = var29.gjstr();
				Browser.method4607(var30, true, Client.field10784);
				method669(field11819);
				if (field431 == 132 && Client.state != 9) {
					field445 = 98;
				} else {
					field445 = 7;
					connection.closeGracefully();
					method10367();
				}
				return;
			}
			if (field445 == 256) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				connection.in.pos = 0;
				connection.packetSize = connection.in.g2();
				field445 = 268;
			}
			if (field445 == 268) {
				if (!connection.getStream().hasAvailable(connection.packetSize)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, connection.packetSize);
				connection.in.pos = 0;
				boolean var31 = connection.in.g1() == 1;
				while (true) {
					if (connection.in.pos >= connection.packetSize) {
						if (var31) {
							ClientMessage var33 = ClientMessage.createMessage();
							PacketBit var34 = var33.buf;
							var34.p1(LoginProt.GAMELOGIN_CONTINUE.id);
							connection.queue(var33);
							connection.flush();
							field445 = 138;
						} else {
							field445 = 256;
						}
						break;
					}
					VarValue var32 = Client.varBasicTypeList.decodeVarValue(connection.in);
					Client.field7228.field1708.setVarObject(var32.var, var32.value);
				}
			}
			if (field445 == 138) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				int var35 = connection.in.data[0] & 0xFF;
				if (var35 != 2) {
					if (var35 != 29 && var35 != 45) {
						field445 = 7;
						method669(var35);
						connection.closeGracefully();
						method10367();
						if (Client.method15084(Client.state)) {
							Client.logout(true);
							reply = var35;
						}
						return;
					}
					field11819 = var35;
					field445 = 194;
					return;
				}
				field445 = 141;
			}
			if (field445 == 141) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				field622 = connection.in.data[0] & 0xFF;
				field445 = 157;
			}
			if (field445 == 157) {
				PacketBit var36 = connection.in;
				if (field431 == 211) {
					if (!connection.getStream().hasAvailable(field622)) {
						return;
					}
					connection.getStream().read(var36.data, 0, field622);
					var36.pos = 0;
					method5247(var36);
					Client.staffModLevel = var36.g1();
					Client.playerModLevel = var36.g1();
					Client.field10951 = var36.g1() == 1;
					Client.field11081 = var36.g1() == 1;
					Client.field10953 = var36.g1() == 1;
					Client.loggedInQuickChat = var36.g1() == 1;
					Client.currentPlayerUid = var36.g2();
					Client.playerIsMembers = var36.g1() == 1;
					Client.lobbyDOB = var36.g3s();
					Client.loggedInMembers = var36.g1() == 1;
					Client.field10250 = var36.gjstr();
					Client.field1238 = var36.g6() - MonotonicTime.get();
					Client.world.method7750().method18890(Client.loggedInMembers);
					Client.field3183.method7677().method7750().method18890(Client.loggedInMembers);
					Client.objTypeList.setAllowMembers(Client.loggedInMembers);
					Client.npcTypeList.setAllowMembers(Client.loggedInMembers);
				} else if (connection.getStream().hasAvailable(field622)) {
					connection.getStream().read(var36.data, 0, field622);
					var36.pos = 0;
					method5247(var36);
					Client.staffModLevel = var36.g1();
					Client.playerModLevel = var36.g1();
					Client.field10951 = var36.g1() == 1;
					Client.lobbyDOB = var36.g3s();
					Client.localPlayerEntity.field12052 = (byte) var36.g1();
					Client.field11081 = var36.g1() == 1;
					Client.field10953 = var36.g1() == 1;
					Client.field8322 = var36.g8();
					Client.field1238 = Client.field8322 - MonotonicTime.get() - var36.g5();
					int var37 = var36.g1();
					Client.playerIsMembers = (var37 & 0x1) != 0;
					Client.field11709 = (var37 & 0x2) != 0;
					Client.lobbyJCoinsBalance = var36.g4s();
					Client.lobbyLoyaltyBalance = var36.g4s();
					Client.lobbyRecoveryDay = var36.g2();
					Client.lobbyUnreadMessages = var36.g2();
					Client.lobbyLastLoginDay = var36.g2();
					Client.field7942 = var36.g4s();
					Client.field636 = new HostNameProvider(Client.field7942);
					(new Thread(Client.field636)).start();
					Client.lobbyEmailStatus = var36.g1();
					Client.lobbyCCExpiry = var36.g2();
					Client.lobbyGraceExpiry = var36.g2();
					Client.lobbyDOBRequested = var36.g1() == 1;
					Client.localPlayerEntity.field12062 = Client.localPlayerEntity.field12057 = JagException.field12492 = var36.gjstr2();
					Client.lobbyMembersStats = var36.g1();
					Client.lobbyPlayAge = var36.g4s();
					WorldSwitcher.field9200 = new ServerAddress();
					WorldSwitcher.field9200.node = var36.g2();
					if (WorldSwitcher.field9200.node == 65535) {
						WorldSwitcher.field9200.node = -1;
					}
					WorldSwitcher.field9200.host = var36.gjstr2();
					WorldSwitcher.field9200.port = var36.g2();
					WorldSwitcher.field9200.port2 = var36.g2();
					if (Client.modewhere != ModeWhere.LOCAL && (Client.modewhere != ModeWhere.WTQA || Client.staffModLevel < 2) && WorldSwitcher.currentWorld.isAddressInUse(WorldSwitcher.world)) {
						WorldSwitcher.method10337();
					}
				} else {
					return;
				}
				if (Client.field10953) {
					try {
						BrowserControl.call(GameShell.field11885, "zap");
					} catch (Throwable var49) {
						if (Client.field10770) {
							try {
								GameShell.field11885.getAppletContext().showDocument(new URL(GameShell.field11885.getCodeBase(), "blank.ws"), "tbi");
							} catch (Exception var48) {
							}
						}
					}
				} else {
					try {
						BrowserControl.call(GameShell.field11885, "unzap");
					} catch (Throwable var47) {
					}
				}
				if (Client.modewhere == ModeWhere.LIVE) {
					JavascriptFunction.field4024.method6090();
				}
				if (field431 != 211) {
					field445 = 7;
					method669(2);
					method10282();
					Client.setState(13);
					connection.packetType = null;
					return;
				}
				field445 = 170;
			}
			if (field445 == 170) {
				if (!connection.getStream().hasAvailable(3)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 3);
				field445 = 188;
			}
			if (field445 == 188) {
				PacketBit var41 = connection.in;
				var41.pos = 0;
				if (var41.isIsaac2()) {
					if (!connection.getStream().hasAvailable(1)) {
						return;
					}
					connection.getStream().read(var41.data, 3, 1);
				}
				connection.packetType = ServerProt.values()[var41.gIsaac1or2()];
				connection.packetSize = var41.g2();
				field445 = 160;
			}
			if (field445 == 160) {
				if (!connection.getStream().hasAvailable(connection.packetSize)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, connection.packetSize);
				connection.in.pos = 0;
				int var42 = connection.packetSize;
				field445 = 7;
				method669(2);
				method4320();
				ReceivePlayerPositions.method16435(connection.in);
				int var43 = var42 - connection.in.pos;
				PacketBit var44 = new PacketBit(var43);
				System.arraycopy(connection.in.data, connection.in.pos, var44.data, 0, var43);
				connection.in.pos += var43;
				if (ServerProt.REBUILD_REGION == connection.packetType) {
					Client.world.rebuildMap(new RebuildRequest(RebuildType.REBUILD_REGION, var44));
				} else {
					Client.world.rebuildMap(new RebuildRequest(RebuildType.REBUILD_NORMAL, var44));
				}
				if (connection.in.pos != var42) {
					throw new RuntimeException(connection.in.pos + " " + var42);
				}
				connection.packetType = null;
				return;
			}
			if (field445 == 204) {
				if (connection.packetSize == -2) {
					if (!connection.getStream().hasAvailable(2)) {
						return;
					}
					connection.getStream().read(connection.in.data, 0, 2);
					connection.in.pos = 0;
					connection.packetSize = connection.in.g2();
				}
				if (!connection.getStream().hasAvailable(connection.packetSize)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, connection.packetSize);
				connection.in.pos = 0;
				int var45 = connection.packetSize;
				field445 = 7;
				method669(15);
				method6877();
				ReceivePlayerPositions.method16435(connection.in);
				if (connection.in.pos != var45) {
					throw new RuntimeException(connection.in.pos + " " + var45);
				}
				connection.packetType = null;
				return;
			}
		} catch (IOException var50) {
			connection.closeGracefully();
			if (field475 < 3) {
				if (field431 == 211) {
					WorldSwitcher.currentWorld.configureSocketType();
				} else {
					WorldSwitcher.currentLobby.configureSocketType();
				}
				field478 = 0;
				field475++;
				field445 = 14;
			} else {
				field445 = 7;
				method669(-4);
				method10367();
			}
		}
	}

	@ObfuscatedName("kl.b(Lase;I)V")
	public static void method5247(PacketBit arg0) {
		boolean var1 = arg0.g1() == 1;
		if (!var1) {
			return;
		}
		boolean var2 = false;
		int var3 = arg0.gIsaac1() << 24;
		int var4 = var3 | arg0.gIsaac1() << 16;
		int var5 = var4 | arg0.gIsaac1() << 8;
		int var6 = var5 | arg0.gIsaac1();
		Client.field1895.method590(field3429, var6);
	}

	@ObfuscatedName("s.h(IB)V")
	public static void method481(int arg0) {
	}

	@ObfuscatedName("iq.a(B)Lalw;")
	public static Packet method4378() {
		Packet var0 = new Packet(518);
		field435 = new int[4];
		field435[0] = Client.field10311.nextInt();
		field435[1] = Client.field10311.nextInt();
		field435[2] = Client.field10311.nextInt();
		field435[3] = Client.field10311.nextInt();
		var0.p1(10);
		var0.p4(field435[0]);
		var0.p4(field435[1]);
		var0.p4(field435[2]);
		var0.p4(field435[3]);
		var0.p8(field434);
		if (Client.state == 14) {
			var0.p4(field436[0]);
			var0.p4(field436[1]);
			var0.p4(field436[2]);
			var0.p4(field436[3]);
		}
		field436 = field435;
		return var0;
	}

	@ObfuscatedName("zl.g(Lalw;J)V")
	public static void method14049(Packet arg0, long arg1) {
		TotpType var3;
		if (field429 != null && field429.length() == 6) {
			if (field473) {
				var3 = TotpType.AUTH_DONT_TRUST;
			} else {
				var3 = TotpType.AUTH_TRUST;
			}
		} else if (Client.field1895.method589(arg1)) {
			var3 = TotpType.AUTH_FOUND;
		} else {
			var3 = TotpType.AUTH_NOT_FOUND;
		}
		arg0.p1(var3.getId());
		switch(var3.index) {
			case 0:
				arg0.p4(Client.field1895.method577(arg1));
				break;
			case 1:
			case 3:
				arg0.p3(Integer.parseInt(field429));
				arg0.pos++;
				break;
			case 2:
				arg0.pos += 4;
		}
	}

	@ObfuscatedName("ap.i(B)Lalw;")
	public static Packet method896() {
		Packet var0 = method4378();
		if (Client.state != 14) {
			long var1;
			if (field472 != -1) {
				var1 = field472;
			} else if (field439 == -1L) {
				var1 = StringTools.method15380(username);
			} else {
				var1 = field439;
			}
			field3429 = var1;
			method14049(var0, var1);
			var0.pbool(false);
			var0.pjstr(password);
			var0.p8(field437);
			var0.p8(Client.field10810);
		}
		var0.rsaenc(PublicKeys.field624, PublicKeys.field626);
		return var0;
	}

	@ObfuscatedName("ag.j(II)V")
	public static void method669(int arg0) {
		if (field431 == 132) {
			enterLobbyReply = arg0;
		} else if (field431 == 211) {
			reply = arg0;
		}
	}

	@ObfuscatedName("ye.t(I)V")
	public static void method10367() {
		if (Client.method14437(Client.state)) {
			if (Client.lobbyConnection.getStream() == null) {
				Client.setState(17);
			} else {
				Client.setState(13);
			}
		} else if (Client.state == 17 || Client.state == 7) {
			Client.setState(4);
		} else if (Client.state == 9) {
			Client.setState(4);
		}
	}

	@ObfuscatedName("aab.ae(Lase;I)V")
	public static void method14463(PacketBit arg0) {
		Js5Archive[] var1 = Js5Archive.method3566();
		for (int var2 = 0; var2 < var1.length; var2++) {
			Js5Archive var3 = var1[var2];
			if (Js5Archive.LOADING_SPRITES != var3) {
				Js5 var4 = (Js5) Client.field8540.get(var3);
				if (var4 == null) {
					arg0.p4(0);
				} else {
					arg0.p4(var4.getChecksum());
				}
			}
		}
	}

	@ObfuscatedName("acm.ag(B)V")
	public static void method14959() {
		connection.clearWriteQueue();
		connection.in.pos = 0;
		connection.lastPacketType0 = null;
		connection.lastPacketType1 = null;
		connection.lastPacketType2 = null;
		connection.idleNetCycles = 0;
		Client.rebootTimer = 0;
		Client.field11080 = 0;
		Client.friendsCount = 0;
		Client.ignoresCount = 0;
		Client.clanChatDisplayName = null;
		Client.clanChatCount = 0;
		Client.clanChatUsers = null;
		Client.field6867 = null;
		Client.field1890 = null;
		Client.field11095 = true;
		ClientWatch.method13845();
		for (int var0 = 0; var0 < Client.localPlayerGameState.stats.length; var0++) {
			PlayerStat var1 = new PlayerStat(Client.skillDefaults.getSkill(var0), false);
			var1.setXP(0);
			var1.setLevel(0);
			Client.localPlayerGameState.stats[var0] = var1;
		}
		Client.localPlayerGameState.varps.method9624();
		DelayedStateChange.method716();
		Client.method4336(connection);
	}

	@ObfuscatedName("xb.ah(I)V")
	public static void method10282() {
		method14959();
	}

	@ObfuscatedName("hz.al(I)V")
	public static void method4320() {
		if (Client.state == 19) {
			Client.method9872();
		}
		Client.lobbyConnection.closeGracefully();
		method14959();
		GameShell.focus = true;
		ClassCheck.method4052();
		for (int var0 = 0; var0 < Client.field10851.length; var0++) {
			Client.field10851[var0] = null;
		}
		Client.field10973 = false;
		Client.field10870 = (int) (Math.random() * 100.0D) - 50;
		Client.field10880 = (int) (Math.random() * 110.0D) - 55;
		Client.field10861 = (int) (Math.random() * 80.0D) - 40;
		Client.field10885 = (int) (Math.random() * 120.0D) - 60;
		Client.field10887 = (int) (Math.random() * 30.0D) - 20;
		Client.field10895 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Minimap.method9233();
		for (int var1 = 0; var1 < 2048; var1++) {
			Client.field10944[var1] = null;
		}
		Client.localPlayerEntity = null;
		Client.field11011 = 0;
		Client.field10906 = 0;
		Client.field10838.clear();
		Client.field10965.clearAll();
		Client.field10966.clear();
		Client.field10864.clear();
		Client.field10964.clear();
		ChangeLocationRequest.field11237 = new IterableQueue();
		ChangeLocationRequest.field11242 = new IterableQueue();
		Client.cameraMoveX = 0;
		Client.cameraMoveZ = 0;
		Client.field741 = 0;
		Client.field2937 = 0;
		Client.field490 = 0;
		Client.cameraLookX = 0;
		Client.cameraLookZ = 0;
		Client.field1983 = 0;
		Client.field8576 = 0;
		Client.field708 = 0;
		if (Client.field10978 != -1) {
			Component.method7602(Client.field10978);
		}
		for (SubInterface var2 = (SubInterface) Client.field10979.peekFront(); var2 != null; var2 = (SubInterface) Client.field10979.prev()) {
			if (!var2.hasNext()) {
				var2 = (SubInterface) Client.field10979.peekFront();
				if (var2 == null) {
					break;
				}
			}
			Client.method214(var2, true, false);
		}
		Client.field10978 = -1;
		Client.field10979 = new IterableMap(8);
		Component.method5075();
		Client.field11056 = null;
		for (int var3 = 0; var3 < 8; var3++) {
			Client.field10961[var3] = null;
			Client.field10962[var3] = false;
			Client.field10832[var3] = -1;
		}
		ClientInvCache.method2752();
		Client.field11023 = true;
		for (int var4 = 0; var4 < 114; var4++) {
			Client.field11072[var4] = true;
		}
		for (int var5 = 0; var5 < 3; var5++) {
			for (int var6 = 0; var6 < 8; var6++) {
				Client.stockmarketSlots[var5][var6] = new StockmarketSlot();
			}
		}
		Client.world.method7816().resetFade();
		Client.field10902 = true;
		LocType.clientpalette = NPCType.clientpalette = ObjType.clientpalette = new short[256];
		Client.field4868 = LocalisedText.WALKHERE.forLang(Client.language);
		Client.preferences.method18157(Client.preferences.removeRoofs2, Client.preferences.removeRoofs.getValue());
		Client.field10842 = 0;
		MiniMenu.method5175();
		Client.field594 = null;
		Client.field3457 = 0L;
	}

	@ObfuscatedName("pr.ac(B)V")
	public static void method6877() {
		connection.clearWriteQueue();
		connection.in.pos = 0;
		connection.packetType = null;
		connection.lastPacketType0 = null;
		connection.lastPacketType1 = null;
		connection.lastPacketType2 = null;
		connection.packetSize = 0;
		connection.idleNetCycles = 0;
		Client.rebootTimer = 0;
		MiniMenu.method5175();
		Minimap.method3552();
		for (int var0 = 0; var0 < 2048; var0++) {
			Client.field10944[var0] = null;
		}
		Client.localPlayerEntity = null;
		for (int var1 = 0; var1 < Client.field10906; var1++) {
			PathingEntity var2 = (PathingEntity) Client.field10839[var1].field11436;
			if (var2 != null) {
				var2.field10417 = -1;
			}
		}
		ClientInvCache.method2752();
		Client.method4046(Client.method14298());
		Client.setState(18);
		for (int var3 = 0; var3 < 114; var3++) {
			Client.field11072[var3] = true;
		}
		Client.method4336(connection);
		Client.field594 = null;
		Client.field3457 = 0L;
		Client.method3652();
		Client.field7228.method16421();
	}

	@ObfuscatedName("aiz.ai(I)Z")
	public static boolean method16808() {
		if (Client.state == 4) {
			return !isInProgress() && !AccountCreationManager.method9610();
		} else {
			return false;
		}
	}
}
