package rs2.client.login;

import com.jagex.core.constants.ModeWhere;
import com.jagex.core.constants.PublicKeys;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.io.Packet;
import com.jagex.core.io.PacketBit;
import com.jagex.core.io.Stream;
import com.jagex.core.utils.JagException;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.core.utils.ReflectionCheck;
import com.jagex.core.utils.StringTools;
import com.jagex.core.utils.TotpType;
import com.jagex.core.utils.VarValue;
import com.jagex.encryption.Isaac;
import com.jagex.game.ClientWatch;
import com.jagex.game.MiniMap;
import com.jagex.game.MiniMenu;
import com.jagex.game.client.Browser;
import com.jagex.game.client.BrowserControl;
import com.jagex.game.client.ClientInvCache;
import com.jagex.game.client.ClientMessage;
import com.jagex.game.client.GameShell;
import com.jagex.game.client.HostNameProvider;
import com.jagex.game.client.JavascriptFunction;
import com.jagex.game.client.LocalisedText;
import com.jagex.game.client.RebuildRequest;
import com.jagex.game.client.RebuildType;
import com.jagex.game.client.ReceivePlayerPositions;
import com.jagex.game.client.ServerAddress;
import com.jagex.game.client.StockmarketSlot;
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
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import java.io.IOException;
import java.net.URL;
import rs2.client.Client;
import rs2.client.logic.DelayedStateChange;
import rs2.client.scene.entities.PathingEntity;

@ObfuscatedName("m")
public class LoginManager {

	@ObfuscatedName("m.m")
	public static int requestState;

	@ObfuscatedName("m.k")
	public static ServerConnection connection;

	@ObfuscatedName("m.f")
	public static boolean ssoEnabled = false;

	@ObfuscatedName("m.w")
	public static long field434;

	@ObfuscatedName("m.l")
	public static int[] outKey;

	@ObfuscatedName("m.u")
	public static int[] outKey2;

	@ObfuscatedName("m.z")
	public static boolean isSocialLogin = false;

	@ObfuscatedName("m.p")
	public static int ssoKey = -1;

	@ObfuscatedName("m.d")
	public static long socialKey = -1L;

	@ObfuscatedName("m.ap")
	public static int loginStep = 7;

	@ObfuscatedName("m.aq")
	public static long socialname = 0L;

	@ObfuscatedName("m.ax")
	public static String username = "";

	@ObfuscatedName("m.av")
	public static String password = "";

	@ObfuscatedName("m.ao")
	public static String newAuthPreference = "";

	@ObfuscatedName("m.aj")
	public static boolean authDontTrust = true;

	@ObfuscatedName("mc.ay")
	public static long authKey;

	@ObfuscatedName("m.ab")
	public static int loginwait = 0;

	@ObfuscatedName("m.az")
	public static int loginAttempts = 0;

	@ObfuscatedName("t.aa")
	public static int replyPacketSize;

	@ObfuscatedName("vz.af")
	public static int field7542;

	@ObfuscatedName("anh.ak")
	public static int loginReply;

	@ObfuscatedName("m.an")
	public static int enterLobbyReply = -2;

	@ObfuscatedName("m.bf")
	public static int enterGameReply = -2;

	@ObfuscatedName("m.bl")
	public static int lastTransferReply = -2;

	@ObfuscatedName("m.bk")
	public static int lastTransferDisallowTrigger = -1;

	@ObfuscatedName("m.bh")
	public static int lastTransferDisallowResult = -1;

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
	public static boolean unused = false;

	public LoginManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kg.e(I)Z")
	public static boolean requestGameLogin() {
		return ssoKey == -1 ? requestGameLoginWithUsername(username, password) : requestGameLoginWithSSO();
	}

	@ObfuscatedName("iu.n(S)Z")
	public static boolean requestLobbyLogin() {
		return ssoKey == -1 ? requestLobbyLoginWithUsername(username, password) : requestLobbyLoginWithSSO();
	}

	@ObfuscatedName("ug.m(I)V")
	public static final void resetLoginState() {
		loginStep = 7;
		enterGameReply = -2;
		enterLobbyReply = -2;
	}

	@ObfuscatedName("jd.k(B)V")
	public static final void resetSocialKeys() {
		socialKey = -1L;
		socialname = 0L;
		ssoKey = -1;
	}

	@ObfuscatedName("aaa.f(B)V")
	public static final void cancelLogin() {
		if (loginStep != 7) {
			connection.closeGracefully();
			resetLoginState();
			updateLoginState();
		}
	}

	@ObfuscatedName("et.w(I)Z")
	public static final boolean isInProgress() {
		return loginStep != 7;
	}

	@ObfuscatedName("vn.l(B)V")
	public static void continueLogin() {
		if (loginStep == 103) {
			loginStep = 110;
		}
	}

	@ObfuscatedName("ag.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZB)V")
	public static void requestLogin(String arg0, String arg1, String arg2, boolean arg3) {
		if (arg0.length() > 320 || !isLoginReady()) {
			return;
		}
		resetSocialKeys();
		username = arg0;
		password = arg1;
		newAuthPreference = arg2;
		authDontTrust = arg3;
		Client.setState(7);
	}

	@ObfuscatedName("df.z(ILjava/lang/String;ZI)V")
	public static void requestSocialNetworkLogin(int arg0, String arg1, boolean arg2) {
		if (!isLoginReady()) {
			return;
		}
		if (ssoKey != arg0) {
			socialKey = -1L;
		}
		ssoKey = arg0;
		newAuthPreference = arg1;
		authDontTrust = arg2;
		Client.setState(7);
	}

	@ObfuscatedName("amr.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V")
	public static void enterLobby(String arg0, String arg1, String arg2, boolean arg3) {
		if (arg0.length() > 320 || !isLoginReady()) {
			return;
		}
		Client.lobbyConnection.closeGracefully();
		resetSocialKeys();
		username = arg0;
		password = arg1;
		newAuthPreference = arg2;
		authDontTrust = arg3;
		Client.setState(17);
	}

	@ObfuscatedName("aji.d(ILjava/lang/String;ZS)V")
	public static void enterLobbySocialNetwork(int arg0, String arg1, boolean arg2) {
		if (!isLoginReady()) {
			return;
		}
		if (ssoKey != arg0) {
			socialKey = -1L;
		}
		ssoKey = arg0;
		newAuthPreference = arg1;
		authDontTrust = arg2;
		Client.lobbyConnection.closeGracefully();
		Client.setState(17);
	}

	@ObfuscatedName("dt.c(Ljava/lang/String;ZI)V")
	public static void enterGame(String arg0, boolean arg1) {
		if (Client.state == 13 && (!isInProgress() && !AccountCreationManager.isInProgress())) {
			newAuthPreference = arg0;
			authDontTrust = arg1;
			Client.setState(15);
		}
	}

	@ObfuscatedName("ys.r(B)V")
	public static void resetCredentials() {
		newAuthPreference = "";
		password = "";
		username = "";
		authDontTrust = true;
	}

	@ObfuscatedName("ajf.v(Ljava/lang/String;Ljava/lang/String;B)Z")
	public static boolean requestLobbyLoginWithUsername(String arg0, String arg1) {
		requestState = 132;
		connection = Client.lobbyConnection;
		return requestLogin(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("xo.o(Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean requestGameLoginWithUsername(String arg0, String arg1) {
		requestState = 211;
		connection = Client.gameConnection;
		return requestLogin(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("rg.s(I)Z")
	public static boolean requestGameLoginWithSSO() {
		requestState = 211;
		connection = Client.gameConnection;
		return requestLogin(socialKey == -1L, true, "", "", socialKey);
	}

	@ObfuscatedName("cz.y(I)Z")
	public static boolean requestLobbyLoginWithSSO() {
		requestState = 132;
		connection = Client.lobbyConnection;
		return requestLogin(socialKey == -1L, true, "", "", socialKey);
	}

	@ObfuscatedName("qj.q(ZZLjava/lang/String;Ljava/lang/String;J)Z")
	public static boolean requestLogin(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
		isSocialLogin = arg0;
		if (!arg1) {
			ssoKey = -1;
		}
		ssoEnabled = arg1;
		username = arg2;
		password = arg3;
		socialKey = arg4;
		if (!ssoEnabled && (username.equals("") || password.equals(""))) {
			setReply(3);
			updateLoginState();
			return false;
		}
		if (requestState != 132) {
			hoptime = 0;
			disallowResult = -1;
			disallowTrigger = -1;
		}
		connection.disconnected = false;
		setReply(-3);
		loginStep = 14;
		loginwait = 0;
		loginAttempts = 0;
		return true;
	}

	@ObfuscatedName("fj.x(B)V")
	public static final void update() {
		if (loginStep == 7 || loginStep == 103) {
			return;
		}
		try {
			short var0;
			if (loginAttempts == 0 && loginStep < 98) {
				var0 = 500;
			} else {
				var0 = 2000;
			}
			if (isSocialLogin && loginStep >= 64) {
				var0 = 6000;
			}
			if (requestState == 211 && loginStep != 215 && enterGameReply != 42 || requestState == 132 && enterLobbyReply != 49 && enterLobbyReply != 52) {
				loginwait++;
			}
			if (loginwait > var0) {
				connection.closeGracefully();
				if (loginAttempts >= 3) {
					loginStep = 7;
					setReply(-5);
					updateLoginState();
					return;
				}
				if (requestState == 211) {
					WorldSwitcher.currentWorld.configureSocketType();
				} else {
					WorldSwitcher.currentLobby.configureSocketType();
				}
				loginwait = 0;
				loginAttempts++;
				loginStep = 14;
			}
			if (loginStep == 14) {
				if (requestState == 211) {
					connection.setStream(Stream.createStream(WorldSwitcher.currentWorld.getSocket(), 40000), WorldSwitcher.currentWorld.host);
				} else {
					connection.setStream(Stream.createStream(WorldSwitcher.currentLobby.getSocket(), 40000), WorldSwitcher.currentLobby.host);
				}
				if (Client.secureRandom == null) {
					Client.secureRandom = Client.secureRandomProvider.getSecureRandom();
					Client.secureRandomProvider.stop();
					Client.secureRandomProvider = null;
				}
				connection.clearWriteQueue();
				ClientMessage var1 = ClientMessage.createMessage();
				var1.buf.p1(LoginProt.INIT_GAME_CONNECTION.id);
				connection.queue(var1);
				connection.flush();
				loginStep = 35;
			}
			if (loginStep == 35) {
				if (!connection.getStream().hasAvailable(9)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 9);
				connection.in.pos = 0;
				int var2 = connection.in.g1();
				if (var2 != 0) {
					loginStep = 7;
					nothing(var2);
					setReply(var2);
					connection.closeGracefully();
					updateLoginState();
					return;
				}
				field434 = connection.in.g8();
				connection.in.pos = 0;
				if (isSocialLogin) {
					loginStep = 276;
				} else {
					loginStep = 84;
				}
			}
			if (loginStep == 276) {
				ClientMessage var3 = ClientMessage.createMessage();
				var3.buf.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.id);
				var3.buf.p2(0);
				int var4 = var3.buf.pos;
				var3.buf.p4(910);
				var3.buf.p4(1);
				if (requestState == 211) {
					var3.buf.p1(Client.state == 14 ? 1 : 0);
				}
				Packet var5 = startRSAPAcket();
				packLoginTOTPDetails(var5, (long) ssoKey);
				authKey = (long) ssoKey;
				var5.p1(ssoKey);
				var5.p1(Client.language.getId());
				var5.p4(Client.playerIsAffiliate);
				for (int var6 = 0; var6 < 5; var6++) {
					var5.p4(Client.secureRandom.nextInt());
				}
				var5.p8(Client.field10810);
				var5.p1(Client.modegame.game);
				var5.p1(Client.secureRandom.nextInt());
				var5.rsaenc(PublicKeys.LOGIN_RSAE, PublicKeys.LOGIN_RSAN);
				var3.buf.pdata(var5.data, 0, var5.pos);
				var3.buf.psize2(var3.buf.pos - var4);
				connection.queue(var3);
				connection.flush();
				loginStep = 40;
			}
			if (loginStep == 40) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				connection.in.pos = 0;
				connection.in.pos = connection.in.g2();
				loginStep = 58;
			}
			if (loginStep == 58) {
				if (!connection.getStream().hasAvailable(connection.in.pos)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, connection.in.pos);
				connection.in.tinydec(outKey);
				connection.in.pos = 0;
				String var7 = connection.in.gjstr2();
				connection.in.pos = 0;
				String var8 = JavascriptFunction.field4032.method6087();
				Browser.method6081(var7, true, var8, Client.field10784);
				loginStep = 64;
			}
			if (loginStep == 64) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				if ((connection.in.data[0] & 0xFF) == 1) {
					loginStep = 70;
				}
			}
			if (loginStep == 70) {
				if (!connection.getStream().hasAvailable(16)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 16);
				connection.in.pos = 16;
				connection.in.tinydec(outKey);
				connection.in.pos = 0;
				socialKey = connection.in.g8();
				socialname = connection.in.g8();
				loginStep = 84;
			}
			if (loginStep == 84) {
				connection.in.pos = 0;
				connection.clearWriteQueue();
				ClientMessage var9 = ClientMessage.createMessage();
				PacketBit var10 = var9.buf;
				if (requestState == 211) {
					LoginProt var11;
					if (isSocialLogin) {
						var11 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						var11 = LoginProt.GAMELOGIN;
					}
					var10.p1(var11.id);
					var10.p2(0);
					int var12 = var10.pos;
					int var13 = var10.pos;
					if (!isSocialLogin) {
						var10.p4(910);
						var10.p4(1);
						var10.p1(Client.state == 14 ? 1 : 0);
						int var14 = var10.pos;
						Packet var15 = createLoginRSAPacket();
						var10.pdata(var15.data, 0, var15.pos);
						var13 = var10.pos;
						var10.p1(socialKey == -1L ? 1 : 0);
						if (socialKey == -1L) {
							var10.pjstr(username);
						} else {
							var10.p8(socialKey);
						}
					}
					var10.p1(Client.getWindowMode());
					var10.p2(GameShell.canvasWid);
					var10.p2(GameShell.canvasHei);
					var10.p1(Client.preferences.antiAliasing2.getValue());
					GameShell.pushUID192(var10);
					var10.pjstr(Client.siteSettings);
					var10.p4(Client.playerIsAffiliate);
					Packet var16 = Client.preferences.createPreferencesBlock();
					var10.p1(var16.pos);
					var10.pdata(var16.data, 0, var16.pos);
					Client.preferencesChangeNotified = true;
					Packet var17 = new Packet(Client.hardwarePlatform.calculateHardwarePlatformSize());
					Client.hardwarePlatform.createHardwareBlock(var17);
					var10.pdata(var17.data, 0, var17.data.length);
					var10.p4(Client.currentIncrementVerifyId);
					var10.p4(Client.userFlow2);
					var10.p4(Client.userFlow1);
					var10.p4(Client.field10778);
					var10.p4(Client.field10777);
					var10.pjstr(Client.field579);
					var10.p1(Client.createAdditionalInfo == null ? 0 : 1);
					if (Client.createAdditionalInfo != null) {
						var10.pjstr(Client.createAdditionalInfo);
					}
					var10.p1(Client.javascriptEnabled ? 1 : 0);
					var10.p1(Client.haveChrome ? 1 : 0);
					var10.p1(Client.clientType & 0x1);
					var10.p4(Client.field10788);
					var10.pjstr(Client.gamepack);
					var10.p1(WorldSwitcher.field9200 != null && WorldSwitcher.field9200.node == WorldSwitcher.currentWorld.node ? 0 : 1);
					var10.p2(WorldSwitcher.currentLobby.node);
					pushJS5CRCs(var10);
					var10.tinyenc(outKey, var13, var10.pos);
					var10.psize2(var10.pos - var12);
				} else {
					LoginProt var18;
					if (isSocialLogin) {
						var18 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						var18 = LoginProt.LOBBYLOGIN;
					}
					var10.p1(var18.id);
					var10.p2(0);
					int var19 = var10.pos;
					int var20 = var10.pos;
					if (!isSocialLogin) {
						var10.p4(910);
						var10.p4(1);
						Packet var21 = createLoginRSAPacket();
						var10.pdata(var21.data, 0, var21.pos);
						var20 = var10.pos;
						var10.p1(socialKey == -1L ? 1 : 0);
						if (socialKey == -1L) {
							var10.pjstr(username);
						} else {
							var10.p8(socialKey);
						}
					}
					var10.p1(Client.modegame.game);
					var10.p1(Client.language.getId());
					var10.p1(Client.getWindowMode());
					var10.p2(GameShell.canvasWid);
					var10.p2(GameShell.canvasHei);
					var10.p1(Client.preferences.antiAliasing2.getValue());
					GameShell.pushUID192(var10);
					var10.pjstr(Client.siteSettings);
					Packet var22 = Client.preferences.createPreferencesBlock();
					var10.p1(var22.pos);
					var10.pdata(var22.data, 0, var22.pos);
					Packet var23 = new Packet(Client.hardwarePlatform.calculateHardwarePlatformSize());
					Client.hardwarePlatform.createHardwareBlock(var23);
					var10.pdata(var23.data, 0, var23.data.length);
					var10.p4(Client.currentIncrementVerifyId);
					var10.pjstr(Client.field579);
					var10.p4(Client.playerIsAffiliate);
					var10.p4(Client.field10788);
					var10.pjstr(Client.gamepack);
					var10.p1(Client.clientType & 0x1);
					var10.pbool(false);
					pushJS5CRCs(var10);
					var10.tinyenc(outKey, var20, var10.pos);
					var10.psize2(var10.pos - var19);
				}
				connection.queue(var9);
				connection.flush();
				connection.randomOut = new Isaac(outKey);
				int[] var24 = new int[4];
				for (int var25 = 0; var25 < 4; var25++) {
					var24[var25] = outKey[var25] + 50;
				}
				connection.randomIn = new Isaac(var24);
				new Isaac(var24);
				connection.in.setIsaac(connection.randomIn);
				outKey = null;
				loginStep = 98;
			}
			if (loginStep == 98) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				int var26 = connection.in.g1();
				connection.in.pos = 0;
				if (var26 == 21) {
					loginStep = 126;
				} else if (var26 == 1) {
					loginStep = 103;
					setReply(var26);
					return;
				} else if (var26 == 52) {
					loginReply = var26;
					loginStep = 225;
				} else if (var26 == 2) {
					if (unused) {
						unused = false;
						loginStep = 14;
						return;
					}
					if (requestState == 211) {
						Client.clientVarDomain.method16415();
						loginStep = 256;
					} else {
						loginStep = 141;
					}
				} else if (var26 == 15) {
					connection.packetSize = -2;
					loginStep = 204;
				} else if (var26 == 23 && loginAttempts < 3) {
					loginwait = 0;
					loginAttempts++;
					loginStep = 14;
					connection.closeGracefully();
					return;
				} else if (var26 == 42) {
					loginStep = 215;
					setReply(var26);
					return;
				} else if (requestState == 132 && var26 == 49 && Client.state != 9) {
					if (enterLobbyReply != 52) {
						setReply(var26);
					}
					return;
				} else if (!ssoEnabled || isSocialLogin || ssoKey == -1 || var26 != 35) {
					if (var26 != 53) {
						loginStep = 7;
						setReply(var26);
						connection.closeGracefully();
						updateLoginState();
						return;
					}
					loginStep = 245;
				} else {
					isSocialLogin = true;
					loginwait = 0;
					loginStep = 14;
					connection.closeGracefully();
					return;
				}
			}
			if (loginStep == 126) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				int var27 = connection.in.data[0] & 0xFF;
				hoptime = var27 * 50;
				loginStep = 7;
				setReply(21);
				connection.closeGracefully();
				updateLoginState();
				return;
			}
			if (loginStep == 215) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				queuePosition = ((connection.in.data[0] & 0xFF) << 8) + (connection.in.data[1] & 0xFF);
				loginStep = 98;
				return;
			}
			if (loginStep == 245) {
				if (!connection.getStream().hasAvailable(4)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 4);
				banDuration = connection.in.g4s();
				connection.in.pos = 0;
				loginStep = 7;
				setReply(53);
				connection.closeGracefully();
				updateLoginState();
				return;
			}
			if (loginStep == 194) {
				if (loginReply == 29) {
					if (!connection.getStream().hasAvailable(1)) {
						return;
					}
					connection.getStream().read(connection.in.data, 0, 1);
					disallowResult = connection.in.data[0] & 0xFF;
				} else if (loginReply == 45) {
					if (!connection.getStream().hasAvailable(3)) {
						return;
					}
					connection.getStream().read(connection.in.data, 0, 3);
					disallowResult = connection.in.data[0] & 0xFF;
					disallowTrigger = ((connection.in.data[1] & 0xFF) << 8) + (connection.in.data[2] & 0xFF);
				} else {
					throw new IllegalStateException();
				}
				loginStep = 7;
				setReply(loginReply);
				connection.closeGracefully();
				updateLoginState();
				if (Client.isStateLobby(Client.state)) {
					Client.logout(true);
					enterGameReply = loginReply;
				}
				return;
			}
			if (loginStep == 225) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				connection.in.pos = 0;
				field7542 = connection.in.g2();
				connection.in.pos = 0;
				loginStep = 235;
				return;
			}
			if (loginStep == 235) {
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
				Browser.openUrl(var30, true, Client.field10784);
				setReply(loginReply);
				if (requestState == 132 && Client.state != 9) {
					loginStep = 98;
				} else {
					loginStep = 7;
					connection.closeGracefully();
					updateLoginState();
				}
				return;
			}
			if (loginStep == 256) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				connection.in.pos = 0;
				connection.packetSize = connection.in.g2();
				loginStep = 268;
			}
			if (loginStep == 268) {
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
							loginStep = 138;
						} else {
							loginStep = 256;
						}
						break;
					}
					VarValue var32 = Client.varBasicTypeList.decodeVarValue(connection.in);
					Client.clientVarDomain.field1708.setVarValue(var32.var, var32.value);
				}
			}
			if (loginStep == 138) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				int var35 = connection.in.data[0] & 0xFF;
				if (var35 != 2) {
					if (var35 != 29 && var35 != 45) {
						loginStep = 7;
						setReply(var35);
						connection.closeGracefully();
						updateLoginState();
						if (Client.isStateLobby(Client.state)) {
							Client.logout(true);
							enterGameReply = var35;
						}
						return;
					}
					loginReply = var35;
					loginStep = 194;
					return;
				}
				loginStep = 141;
			}
			if (loginStep == 141) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				replyPacketSize = connection.in.data[0] & 0xFF;
				loginStep = 157;
			}
			if (loginStep == 157) {
				PacketBit var36 = connection.in;
				if (requestState == 211) {
					if (!connection.getStream().hasAvailable(replyPacketSize)) {
						return;
					}
					connection.getStream().read(var36.data, 0, replyPacketSize);
					var36.pos = 0;
					getAuthPreferences(var36);
					Client.staffModLevel = var36.g1();
					Client.playerModLevel = var36.g1();
					Client.field10951 = var36.g1() == 1;
					Client.playerIsQuickChat = var36.g1() == 1;
					Client.field10953 = var36.g1() == 1;
					Client.loggedInQuickChat = var36.g1() == 1;
					Client.currentPlayerUid = var36.g2();
					Client.playerIsMembers = var36.g1() == 1;
					Client.lobbyDOB = var36.g3s();
					Client.loggedInMembers = var36.g1() == 1;
					Client.owner = var36.gjstr();
					Client.field1238 = var36.g6() - MonotonicTime.get();
					Client.world.getLocTypeList().setAllowMembers(Client.loggedInMembers);
					Client.asyncRebuild.method7677().getLocTypeList().setAllowMembers(Client.loggedInMembers);
					Client.objTypeList.setAllowMembers(Client.loggedInMembers);
					Client.npcTypeList.setAllowMembers(Client.loggedInMembers);
				} else if (connection.getStream().hasAvailable(replyPacketSize)) {
					connection.getStream().read(var36.data, 0, replyPacketSize);
					var36.pos = 0;
					getAuthPreferences(var36);
					Client.staffModLevel = var36.g1();
					Client.playerModLevel = var36.g1();
					Client.field10951 = var36.g1() == 1;
					Client.lobbyDOB = var36.g3s();
					Client.localPlayerEntity.gender = (byte) var36.g1();
					Client.playerIsQuickChat = var36.g1() == 1;
					Client.field10953 = var36.g1() == 1;
					Client.lobbyMembership = var36.g8();
					Client.field1238 = Client.lobbyMembership - MonotonicTime.get() - var36.g5();
					int var37 = var36.g1();
					Client.playerIsMembers = (var37 & 0x1) != 0;
					Client.field11709 = (var37 & 0x2) != 0;
					Client.lobbyJCoinsBalance = var36.g4s();
					Client.lobbyLoyaltyBalance = var36.g4s();
					Client.lobbyRecoveryDay = var36.g2();
					Client.lobbyUnreadMessages = var36.g2();
					Client.lobbyLastLoginDay = var36.g2();
					Client.playerHostName = var36.g4s();
					Client.hostNameProvider = new HostNameProvider(Client.playerHostName);
					(new Thread(Client.hostNameProvider)).start();
					Client.lobbyEmailStatus = var36.g1();
					Client.lobbyCCExpiry = var36.g2();
					Client.lobbyGraceExpiry = var36.g2();
					Client.lobbyDOBRequested = var36.g1() == 1;
					Client.localPlayerEntity.nameUnfiltered = Client.localPlayerEntity.name = JagException.user = var36.gjstr2();
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
					if (ModeWhere.LOCAL != Client.modewhere && (ModeWhere.WTQA != Client.modewhere || Client.staffModLevel < 2) && WorldSwitcher.currentWorld.isAddressInUse(WorldSwitcher.world)) {
						WorldSwitcher.method10337();
					}
				} else {
					return;
				}
				if (Client.field10953) {
					try {
						BrowserControl.call(GameShell.field11885, "zap");
					} catch (Throwable var49) {
						if (Client.showAdvertisement) {
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
				if (ModeWhere.LIVE == Client.modewhere) {
					JavascriptFunction.field4024.method6090();
				}
				if (requestState != 211) {
					loginStep = 7;
					setReply(2);
					method10282();
					Client.setState(13);
					connection.packetType = null;
					return;
				}
				loginStep = 170;
			}
			if (loginStep == 170) {
				if (!connection.getStream().hasAvailable(3)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 3);
				loginStep = 188;
			}
			if (loginStep == 188) {
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
				loginStep = 160;
			}
			if (loginStep == 160) {
				if (!connection.getStream().hasAvailable(connection.packetSize)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, connection.packetSize);
				connection.in.pos = 0;
				int var42 = connection.packetSize;
				loginStep = 7;
				setReply(2);
				prepareForMap();
				ReceivePlayerPositions.receivePlayerPositions(connection.in);
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
			if (loginStep == 204) {
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
				loginStep = 7;
				setReply(15);
				prepareForPlayers();
				ReceivePlayerPositions.receivePlayerPositions(connection.in);
				if (connection.in.pos != var45) {
					throw new RuntimeException(connection.in.pos + " " + var45);
				}
				connection.packetType = null;
				return;
			}
		} catch (IOException var50) {
			connection.closeGracefully();
			if (loginAttempts < 3) {
				if (requestState == 211) {
					WorldSwitcher.currentWorld.configureSocketType();
				} else {
					WorldSwitcher.currentLobby.configureSocketType();
				}
				loginwait = 0;
				loginAttempts++;
				loginStep = 14;
			} else {
				loginStep = 7;
				setReply(-4);
				updateLoginState();
			}
		}
	}

	@ObfuscatedName("kl.b(Lase;I)V")
	public static void getAuthPreferences(PacketBit arg0) {
		boolean var1 = arg0.g1() == 1;
		if (!var1) {
			return;
		}
		boolean var2 = false;
		int var3 = arg0.gIsaac1() << 24;
		int var4 = var3 | arg0.gIsaac1() << 16;
		int var5 = var4 | arg0.gIsaac1() << 8;
		int var6 = var5 | arg0.gIsaac1();
		Client.authPreferences.method590(authKey, var6);
	}

	@ObfuscatedName("s.h(IB)V")
	public static void nothing(int arg0) {
	}

	@ObfuscatedName("iq.a(B)Lalw;")
	public static Packet startRSAPAcket() {
		Packet var0 = new Packet(518);
		outKey = new int[4];
		outKey[0] = Client.secureRandom.nextInt();
		outKey[1] = Client.secureRandom.nextInt();
		outKey[2] = Client.secureRandom.nextInt();
		outKey[3] = Client.secureRandom.nextInt();
		var0.p1(10);
		var0.p4(outKey[0]);
		var0.p4(outKey[1]);
		var0.p4(outKey[2]);
		var0.p4(outKey[3]);
		var0.p8(field434);
		if (Client.state == 14) {
			var0.p4(outKey2[0]);
			var0.p4(outKey2[1]);
			var0.p4(outKey2[2]);
			var0.p4(outKey2[3]);
		}
		outKey2 = outKey;
		return var0;
	}

	@ObfuscatedName("zl.g(Lalw;J)V")
	public static void packLoginTOTPDetails(Packet arg0, long arg1) {
		TotpType var3;
		if (newAuthPreference != null && newAuthPreference.length() == 6) {
			if (authDontTrust) {
				var3 = TotpType.AUTH_DONT_TRUST;
			} else {
				var3 = TotpType.AUTH_TRUST;
			}
		} else if (Client.authPreferences.containsKey(arg1)) {
			var3 = TotpType.AUTH_FOUND;
		} else {
			var3 = TotpType.AUTH_NOT_FOUND;
		}
		arg0.p1(var3.getId());
		switch(var3.index) {
			case 0:
				arg0.p4(Client.authPreferences.getValue(arg1));
				break;
			case 1:
			case 3:
				arg0.p3(Integer.parseInt(newAuthPreference));
				arg0.pos++;
				break;
			case 2:
				arg0.pos += 4;
		}
	}

	@ObfuscatedName("ap.i(B)Lalw;")
	public static Packet createLoginRSAPacket() {
		Packet var0 = startRSAPAcket();
		if (Client.state != 14) {
			long var1;
			if (ssoKey != -1) {
				var1 = ssoKey;
			} else if (socialKey == -1L) {
				var1 = StringTools.method15380(username);
			} else {
				var1 = socialKey;
			}
			authKey = var1;
			packLoginTOTPDetails(var0, var1);
			var0.pbool(false);
			var0.pjstr(password);
			var0.p8(socialname);
			var0.p8(Client.field10810);
		}
		var0.rsaenc(PublicKeys.LOGIN_RSAE, PublicKeys.LOGIN_RSAN);
		return var0;
	}

	@ObfuscatedName("ag.j(II)V")
	public static void setReply(int arg0) {
		if (requestState == 132) {
			enterLobbyReply = arg0;
		} else if (requestState == 211) {
			enterGameReply = arg0;
		}
	}

	@ObfuscatedName("ye.t(I)V")
	public static void updateLoginState() {
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
	public static void pushJS5CRCs(PacketBit arg0) {
		Js5Archive[] var1 = Js5Archive.values();
		for (int var2 = 0; var2 < var1.length; var2++) {
			Js5Archive var3 = var1[var2];
			if (Js5Archive.LOADING_SPRITES != var3) {
				Js5 var4 = (Js5) Client.js5Archives.get(var3);
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
		Client.friendsListState = 0;
		Client.friendsCount = 0;
		Client.ignoresCount = 0;
		Client.clanChatDisplayName = null;
		Client.clanChatCount = 0;
		Client.clanChatUsers = null;
		Client.listenedClanSettings = null;
		Client.affinedClanSettings = null;
		Client.telemetryError = true;
		ClientWatch.method13845();
		for (int var0 = 0; var0 < Client.localPlayerGameState.stats.length; var0++) {
			PlayerStat var1 = new PlayerStat(Client.skillDefaults.getSkill(var0), false);
			var1.setXP(0);
			var1.setLevel(0);
			Client.localPlayerGameState.stats[var0] = var1;
		}
		Client.localPlayerGameState.varps.method9624();
		DelayedStateChange.removeAll();
		Client.notifyWindowStatus(connection);
	}

	@ObfuscatedName("xb.ah(I)V")
	public static void method10282() {
		method14959();
	}

	@ObfuscatedName("hz.al(I)V")
	public static void prepareForMap() {
		if (Client.state == 19) {
			Client.method9872();
		}
		Client.lobbyConnection.closeGracefully();
		method14959();
		GameShell.focus = true;
		ReflectionCheck.method4052();
		for (int var0 = 0; var0 < Client.hintArrows.length; var0++) {
			Client.hintArrows[var0] = null;
		}
		Client.targetModeActive = false;
		Client.cameraAnticheatOffsetX = (int) (Math.random() * 100.0D) - 50;
		Client.cameraAnticheatOffsetZ = (int) (Math.random() * 110.0D) - 55;
		Client.cameraAnticheatAngle = (int) (Math.random() * 80.0D) - 40;
		Client.minimapAnticheatAngle = (int) (Math.random() * 120.0D) - 60;
		Client.minimapZoom = (int) (Math.random() * 30.0D) - 20;
		Client.orbitCameraYaw = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		MiniMap.method9233();
		for (int var1 = 0; var1 < 2048; var1++) {
			Client.players[var1] = null;
		}
		Client.localPlayerEntity = null;
		Client.npcSlotCount = 0;
		Client.npcCount = 0;
		Client.npcs.removeAll();
		Client.projectiles.removeAll();
		Client.spotanims.removeAll();
		Client.textCoords.clear();
		Client.objStacks.removeAll();
		ChangeLocationRequest.field11237 = new LinkList();
		ChangeLocationRequest.field11242 = new LinkList();
		Client.cameraMoveX = 0;
		Client.cameraMoveZ = 0;
		Client.cameraSrcHeight = 0;
		Client.cameraMoveAcceleration = 0;
		Client.cameraMoveSpeed = 0;
		Client.cameraLookX = 0;
		Client.cameraLookZ = 0;
		Client.field1983 = 0;
		Client.cameraRotateAcceleration = 0;
		Client.cameraRotateSpeed = 0;
		if (Client.openedTopInterface != -1) {
			Component.method7602(Client.openedTopInterface);
		}
		for (SubInterface var2 = (SubInterface) Client.openedSubInterfaces.head(); var2 != null; var2 = (SubInterface) Client.openedSubInterfaces.next()) {
			if (!var2.isLinked()) {
				var2 = (SubInterface) Client.openedSubInterfaces.head();
				if (var2 == null) {
					break;
				}
			}
			Client.ifCloseSub(var2, true, false);
		}
		Client.openedTopInterface = -1;
		Client.openedSubInterfaces = new HashTable(8);
		Component.method5075();
		Client.pressedContinueOption = null;
		for (int var3 = 0; var3 < 8; var3++) {
			Client.field10961[var3] = null;
			Client.field10962[var3] = false;
			Client.field10832[var3] = -1;
		}
		ClientInvCache.removeAll();
		Client.field11023 = true;
		for (int var4 = 0; var4 < 114; var4++) {
			Client.topLevelComponentRedrawRequestedTemp[var4] = true;
		}
		for (int var5 = 0; var5 < 3; var5++) {
			for (int var6 = 0; var6 < 8; var6++) {
				Client.stockmarketSlots[var5][var6] = new StockmarketSlot();
			}
		}
		Client.world.getEnvironmentManager().resetFade();
		Client.field10902 = true;
		LocType.clientpalette = NPCType.clientpalette = ObjType.clientpalette = new short[256];
		Client.field4868 = LocalisedText.WALKHERE.forLang(Client.language);
		Client.preferences.setPreference(Client.preferences.removeRoofs2, Client.preferences.removeRoofs.getValue());
		Client.currentIncrementVerifyId = 0;
		MiniMenu.method5175();
		Client.pingRequest = null;
		Client.field3457 = 0L;
	}

	@ObfuscatedName("pr.ac(B)V")
	public static void prepareForPlayers() {
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
		MiniMap.method3552();
		for (int var0 = 0; var0 < 2048; var0++) {
			Client.players[var0] = null;
		}
		Client.localPlayerEntity = null;
		for (int var1 = 0; var1 < Client.npcCount; var1++) {
			PathingEntity var2 = (PathingEntity) Client.field10839[var1].value;
			if (var2 != null) {
				var2.targetId = -1;
			}
		}
		ClientInvCache.removeAll();
		Client.cameraReset(Client.getDefaultCameraState());
		Client.setState(18);
		for (int var3 = 0; var3 < 114; var3++) {
			Client.topLevelComponentRedrawRequestedTemp[var3] = true;
		}
		Client.notifyWindowStatus(connection);
		Client.pingRequest = null;
		Client.field3457 = 0L;
		Client.method3652();
		Client.clientVarDomain.method16421();
	}

	@ObfuscatedName("aiz.ai(I)Z")
	public static boolean isLoginReady() {
		if (Client.state == 4) {
			return !isInProgress() && !AccountCreationManager.isInProgress();
		} else {
			return false;
		}
	}
}
