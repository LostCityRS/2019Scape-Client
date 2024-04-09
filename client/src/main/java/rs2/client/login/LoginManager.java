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
import com.jagex.game.ClientWatch;
import com.jagex.game.MiniMenu;
import com.jagex.game.MiniMap;
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
	public static int loginState = 7;

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
		loginState = 7;
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
		if (loginState != 7) {
			connection.closeGracefully();
			resetLoginState();
			updateLoginState();
		}
	}

	@ObfuscatedName("et.w(I)Z")
	public static final boolean isInProgress() {
		return loginState != 7;
	}

	@ObfuscatedName("vn.l(B)V")
	public static void continueLogin() {
		if (loginState == 103) {
			loginState = 110;
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
	public static void requestSocialNetworkLogin(int ssoKey, String newAuthPreference, boolean authDontTrust) {
		if (!isLoginReady()) {
			return;
		}
		if (LoginManager.ssoKey != ssoKey) {
			socialKey = -1L;
		}
		LoginManager.ssoKey = ssoKey;
		LoginManager.newAuthPreference = newAuthPreference;
		LoginManager.authDontTrust = authDontTrust;
		Client.setState(7);
	}

	@ObfuscatedName("amr.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V")
	public static void enterLobby(String username, String password, String newAuthPreference, boolean authDontTrust) {
		if (username.length() > 320 || !isLoginReady()) {
			return;
		}
		Client.lobbyConnection.closeGracefully();
		resetSocialKeys();
		LoginManager.username = username;
		LoginManager.password = password;
		LoginManager.newAuthPreference = newAuthPreference;
		LoginManager.authDontTrust = authDontTrust;
		Client.setState(17);
	}

	@ObfuscatedName("aji.d(ILjava/lang/String;ZS)V")
	public static void enterLobbySocialNetwork(int ssoKey, String newAuthPreference, boolean authDontTrust) {
		if (!isLoginReady()) {
			return;
		}
		if (LoginManager.ssoKey != ssoKey) {
			socialKey = -1L;
		}
		LoginManager.ssoKey = ssoKey;
		LoginManager.newAuthPreference = newAuthPreference;
		LoginManager.authDontTrust = authDontTrust;
		Client.lobbyConnection.closeGracefully();
		Client.setState(17);
	}

	@ObfuscatedName("dt.c(Ljava/lang/String;ZI)V")
	public static void enterGame(String newAuthPreference, boolean authDontTrust) {
		if (Client.state == 13 && (!isInProgress() && !AccountCreationManager.isInProgress())) {
			LoginManager.newAuthPreference = newAuthPreference;
			LoginManager.authDontTrust = authDontTrust;
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
	public static boolean requestLogin(boolean isSocialLogin, boolean ssoEnabled, String username, String password, long socialKey) {
		LoginManager.isSocialLogin = isSocialLogin;
		if (!ssoEnabled) {
			ssoKey = -1;
		}
		LoginManager.ssoEnabled = ssoEnabled;
		LoginManager.username = username;
		LoginManager.password = password;
		LoginManager.socialKey = socialKey;
		if (!LoginManager.ssoEnabled && (LoginManager.username.equals("") || LoginManager.password.equals(""))) {
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
		loginState = 14;
		loginwait = 0;
		loginAttempts = 0;
		return true;
	}

	@ObfuscatedName("fj.x(B)V")
	public static final void login() {
		if (loginState == 7 || loginState == 103) {
			return;
		}
		try {
			short loginwait;
			if (loginAttempts == 0 && loginState < 98) {
				loginwait = 500;
			} else {
				loginwait = 2000;
			}
			if (isSocialLogin && loginState >= 64) {
				loginwait = 6000;
			}
			if (requestState == 211 && loginState != 215 && enterGameReply != 42 || requestState == 132 && enterLobbyReply != 49 && enterLobbyReply != 52) {
				LoginManager.loginwait++;
			}
			if (LoginManager.loginwait > loginwait) {
				connection.closeGracefully();
				if (loginAttempts >= 3) {
					loginState = 7;
					setReply(-5);
					updateLoginState();
					return;
				}
				if (requestState == 211) {
					WorldSwitcher.currentWorld.configureSocketType();
				} else {
					WorldSwitcher.currentLobby.configureSocketType();
				}
				LoginManager.loginwait = 0;
				loginAttempts++;
				loginState = 14;
			}
			if (loginState == 14) {
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
				ClientMessage message = ClientMessage.createMessage();
				message.buf.p1(LoginProt.INIT_GAME_CONNECTION.id);
				connection.queue(message);
				connection.flush();
				loginState = 35;
			}
			if (loginState == 35) {
				if (!connection.getStream().hasAvailable(9)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 9);
				connection.in.pos = 0;
				int reply = connection.in.g1();
				if (reply != 0) {
					loginState = 7;
					nothing(reply);
					setReply(reply);
					connection.closeGracefully();
					updateLoginState();
					return;
				}
				field434 = connection.in.g8();
				connection.in.pos = 0;
				if (isSocialLogin) {
					loginState = 276;
				} else {
					loginState = 84;
				}
			}
			if (loginState == 276) {
				ClientMessage message = ClientMessage.createMessage();
				message.buf.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.id);
				message.buf.p2(0);
				int var4 = message.buf.pos;
				message.buf.p4(910);
				message.buf.p4(1);
				if (requestState == 211) {
					message.buf.p1(Client.state == 14 ? 1 : 0);
				}
				Packet buf = createSecuredPacket();
				putAuth(buf, (long) ssoKey);
				authKey = ssoKey;
				buf.p1(ssoKey);
				buf.p1(Client.language.getId());
				buf.p4(Client.playerIsAffiliate);
				for (int var6 = 0; var6 < 5; var6++) {
					buf.p4(Client.secureRandom.nextInt());
				}
				buf.p8(Client.field10810);
				buf.p1(Client.modegame.game);
				buf.p1(Client.secureRandom.nextInt());
				buf.rsaenc(PublicKeys.field624, PublicKeys.field626);
				message.buf.pdata(buf.data, 0, buf.pos);
				message.buf.psize2(message.buf.pos - var4);
				connection.queue(message);
				connection.flush();
				loginState = 40;
			}
			if (loginState == 40) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				connection.in.pos = 0;
				connection.in.pos = connection.in.g2();
				loginState = 58;
			}
			if (loginState == 58) {
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
				loginState = 64;
			}
			if (loginState == 64) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				if ((connection.in.data[0] & 0xFF) == 1) {
					loginState = 70;
				}
			}
			if (loginState == 70) {
				if (!connection.getStream().hasAvailable(16)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 16);
				connection.in.pos = 16;
				connection.in.tinydec(outKey);
				connection.in.pos = 0;
				socialKey = connection.in.g8();
				socialname = connection.in.g8();
				loginState = 84;
			}
			if (loginState == 84) {
				connection.in.pos = 0;
				connection.clearWriteQueue();
				ClientMessage message = ClientMessage.createMessage();
				PacketBit buf = message.buf;
				if (requestState == 211) {
					LoginProt prot;
					if (isSocialLogin) {
						prot = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						prot = LoginProt.GAMELOGIN;
					}
					buf.p1(prot.id);
					buf.p2(0);
					int var12 = buf.pos;
					int var13 = buf.pos;
					if (!isSocialLogin) {
						buf.p4(910);
						buf.p4(1);
						buf.p1(Client.state == 14 ? 1 : 0);
						int var14 = buf.pos;
						Packet loginPacket = createLoginPacket();
						buf.pdata(loginPacket.data, 0, loginPacket.pos);
						var13 = buf.pos;
						buf.p1(socialKey == -1L ? 1 : 0);
						if (socialKey == -1L) {
							buf.pjstr(username);
						} else {
							buf.p8(socialKey);
						}
					}
					buf.p1(Client.getWindowMode());
					buf.p2(GameShell.canvasWid);
					buf.p2(GameShell.canvasHei);
					buf.p1(Client.preferences.antiAliasing2.getValue());
					GameShell.pushUID192(buf);
					buf.pjstr(Client.siteSettings);
					buf.p4(Client.playerIsAffiliate);
					Packet preferencesPacket = Client.preferences.createPreferencesBlock();
					buf.p1(preferencesPacket.pos);
					buf.pdata(preferencesPacket.data, 0, preferencesPacket.pos);
					Client.preferencesChangeNotified = true;
					Packet hardwarePacket = new Packet(Client.hardwarePlatform.calculateHardwarePlatformSize());
					Client.hardwarePlatform.createHardwareBlock(hardwarePacket);
					buf.pdata(hardwarePacket.data, 0, hardwarePacket.data.length);
					buf.p4(Client.currentIncrementVerifyId);
					buf.p4(Client.userFlow2);
					buf.p4(Client.userFlow1);
					buf.p4(Client.field10778);
					buf.p4(Client.field10777);
					buf.pjstr(Client.field579);
					buf.p1(Client.createAdditionalInfo == null ? 0 : 1);
					if (Client.createAdditionalInfo != null) {
						buf.pjstr(Client.createAdditionalInfo);
					}
					buf.p1(Client.javascriptEnabled ? 1 : 0);
					buf.p1(Client.haveChrome ? 1 : 0);
					buf.p1(Client.clientType & 0x1);
					buf.p4(Client.field10788);
					buf.pjstr(Client.gamepack);
					buf.p1(WorldSwitcher.field9200 != null && WorldSwitcher.field9200.node == WorldSwitcher.currentWorld.node ? 0 : 1);
					buf.p2(WorldSwitcher.currentLobby.node);
					putJs5Crcs(buf);
                    buf.tinyenc(outKey, var13, buf.pos);
					buf.psize2(buf.pos - var12);
				} else {
					LoginProt var18;
					if (isSocialLogin) {
						var18 = LoginProt.SOCIAL_NETWORK_LOGIN;
					} else {
						var18 = LoginProt.LOBBYLOGIN;
					}
					buf.p1(var18.id);
					buf.p2(0);
					int var19 = buf.pos;
					int var20 = buf.pos;
					if (!isSocialLogin) {
						buf.p4(910);
						buf.p4(1);
						Packet var21 = createLoginPacket();
						buf.pdata(var21.data, 0, var21.pos);
						var20 = buf.pos;
						buf.p1(socialKey == -1L ? 1 : 0);
						if (socialKey == -1L) {
							buf.pjstr(username);
						} else {
							buf.p8(socialKey);
						}
					}
					buf.p1(Client.modegame.game);
					buf.p1(Client.language.getId());
					buf.p1(Client.getWindowMode());
					buf.p2(GameShell.canvasWid);
					buf.p2(GameShell.canvasHei);
					buf.p1(Client.preferences.antiAliasing2.getValue());
					GameShell.pushUID192(buf);
					buf.pjstr(Client.siteSettings);
					Packet preferencesPacket = Client.preferences.createPreferencesBlock();
					buf.p1(preferencesPacket.pos);
					buf.pdata(preferencesPacket.data, 0, preferencesPacket.pos);
					Packet hardwarePacket = new Packet(Client.hardwarePlatform.calculateHardwarePlatformSize());
					Client.hardwarePlatform.createHardwareBlock(hardwarePacket);
					buf.pdata(hardwarePacket.data, 0, hardwarePacket.data.length);
					buf.p4(Client.currentIncrementVerifyId);
					buf.pjstr(Client.field579);
					buf.p4(Client.playerIsAffiliate);
					buf.p4(Client.field10788);
					buf.pjstr(Client.gamepack);
					buf.p1(Client.clientType & 0x1);
					buf.pbool(false);
					putJs5Crcs(buf);
                    buf.tinyenc(outKey, var20, buf.pos);
					buf.psize2(buf.pos - var19);
				}
				connection.queue(message);
				connection.flush();
				connection.randomOut = new Isaac(outKey);
				int[] inKey = new int[4];
				for (int index = 0; index < 4; index++) {
					inKey[index] = outKey[index] + 50;
				}
				connection.randomIn = new Isaac(inKey);
				new Isaac(inKey);
				connection.in.setIsaac(connection.randomIn);
				outKey = null;
				loginState = 98;
			}
			if (loginState == 98) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				int reply = connection.in.g1();
				connection.in.pos = 0;
				if (reply == 21) {
					loginState = 126;
				} else if (reply == 1) {
					loginState = 103;
					setReply(reply);
					return;
				} else if (reply == 52) {
					loginReply = reply;
					loginState = 225;
				} else if (reply == 2) {
					if (unused) {
						unused = false;
						loginState = 14;
						return;
					}
					if (requestState == 211) {
						Client.clientVariableManager.method16415();
						loginState = 256;
					} else {
						loginState = 141;
					}
				} else if (reply == 15) {
					connection.packetSize = -2;
					loginState = 204;
				} else if (reply == 23 && loginAttempts < 3) {
					LoginManager.loginwait = 0;
					loginAttempts++;
					loginState = 14;
					connection.closeGracefully();
					return;
				} else if (reply == 42) {
					loginState = 215;
					setReply(reply);
					return;
				} else if (requestState == 132 && reply == 49 && Client.state != 9) {
					if (enterLobbyReply != 52) {
						setReply(reply);
					}
					return;
				} else if (!ssoEnabled || isSocialLogin || ssoKey == -1 || reply != 35) {
					if (reply != 53) {
						loginState = 7;
						setReply(reply);
						connection.closeGracefully();
						updateLoginState();
						return;
					}
					loginState = 245;
				} else {
					isSocialLogin = true;
					LoginManager.loginwait = 0;
					loginState = 14;
					connection.closeGracefully();
					return;
				}
			}
			if (loginState == 126) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				int var27 = connection.in.data[0] & 0xFF;
				hoptime = var27 * 50;
				loginState = 7;
				setReply(21);
				connection.closeGracefully();
				updateLoginState();
				return;
			}
			if (loginState == 215) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				queuePosition = ((connection.in.data[0] & 0xFF) << 8) + (connection.in.data[1] & 0xFF);
				loginState = 98;
				return;
			}
			if (loginState == 245) {
				if (!connection.getStream().hasAvailable(4)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 4);
				banDuration = connection.in.g4s();
				connection.in.pos = 0;
				loginState = 7;
				setReply(53);
				connection.closeGracefully();
				updateLoginState();
				return;
			}
			if (loginState == 194) {
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
				loginState = 7;
				setReply(loginReply);
				connection.closeGracefully();
				updateLoginState();
				if (Client.isStateLobby(Client.state)) {
					Client.logout(true);
					enterGameReply = loginReply;
				}
				return;
			}
			if (loginState == 225) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				connection.in.pos = 0;
				field7542 = connection.in.g2();
				connection.in.pos = 0;
				loginState = 235;
				return;
			}
			if (loginState == 235) {
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
					loginState = 98;
				} else {
					loginState = 7;
					connection.closeGracefully();
					updateLoginState();
				}
				return;
			}
			if (loginState == 256) {
				if (!connection.getStream().hasAvailable(2)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 2);
				connection.in.pos = 0;
				connection.packetSize = connection.in.g2();
				loginState = 268;
			}
			if (loginState == 268) {
				if (!connection.getStream().hasAvailable(connection.packetSize)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, connection.packetSize);
				connection.in.pos = 0;
				boolean var31 = connection.in.g1() == 1;
				while (true) {
					if (connection.in.pos >= connection.packetSize) {
						if (var31) {
							ClientMessage message = ClientMessage.createMessage();
							PacketBit buf = message.buf;
							buf.p1(LoginProt.GAMELOGIN_CONTINUE.id);
							connection.queue(message);
							connection.flush();
							loginState = 138;
						} else {
							loginState = 256;
						}
						break;
					}
					VarValue var32 = Client.varBasicTypeList.decodeVarValue(connection.in);
					Client.clientVariableManager.field1708.setVarObject(var32.var, var32.value);
				}
			}
			if (loginState == 138) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				int reply = connection.in.data[0] & 0xFF;
				if (reply != 2) {
					if (reply != 29 && reply != 45) {
						loginState = 7;
						setReply(reply);
						connection.closeGracefully();
						updateLoginState();
						if (Client.isStateLobby(Client.state)) {
							Client.logout(true);
							enterGameReply = reply;
						}
						return;
					}
					loginReply = reply;
					loginState = 194;
					return;
				}
				loginState = 141;
			}
			if (loginState == 141) {
				if (!connection.getStream().hasAvailable(1)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 1);
				replyPacketSize = connection.in.data[0] & 0xFF;
				loginState = 157;
			}
			if (loginState == 157) {
				PacketBit in = connection.in;
				if (requestState == 211) {
					if (!connection.getStream().hasAvailable(replyPacketSize)) {
						return;
					}
					connection.getStream().read(in.data, 0, replyPacketSize);
					in.pos = 0;
					getAuthPreferences(in);
					Client.staffModLevel = in.g1();
					Client.playerModLevel = in.g1();
					Client.field10951 = in.g1() == 1;
					Client.playerIsQuickChat = in.g1() == 1;
					Client.field10953 = in.g1() == 1;
					Client.loggedInQuickChat = in.g1() == 1;
					Client.currentPlayerUid = in.g2();
					Client.playerIsMembers = in.g1() == 1;
					Client.lobbyDOB = in.g3s();
					Client.loggedInMembers = in.g1() == 1;
					Client.owner = in.gjstr();
					Client.field1238 = in.g6() - MonotonicTime.get();
					Client.world.getLocTypeList().setAllowMembers(Client.loggedInMembers);
					Client.field3183.method7677().getLocTypeList().setAllowMembers(Client.loggedInMembers);
					Client.objTypeList.setAllowMembers(Client.loggedInMembers);
					Client.npcTypeList.setAllowMembers(Client.loggedInMembers);
				} else if (connection.getStream().hasAvailable(replyPacketSize)) {
					connection.getStream().read(in.data, 0, replyPacketSize);
					in.pos = 0;
					getAuthPreferences(in);
					Client.staffModLevel = in.g1();
					Client.playerModLevel = in.g1();
					Client.field10951 = in.g1() == 1;
					Client.lobbyDOB = in.g3s();
					Client.localPlayerEntity.gender = (byte) in.g1();
					Client.playerIsQuickChat = in.g1() == 1;
					Client.field10953 = in.g1() == 1;
					Client.lobbyMembership = in.g8();
					Client.field1238 = Client.lobbyMembership - MonotonicTime.get() - in.g5();
					int var37 = in.g1();
					Client.playerIsMembers = (var37 & 0x1) != 0;
					Client.field11709 = (var37 & 0x2) != 0;
					Client.lobbyJCoinsBalance = in.g4s();
					Client.lobbyLoyaltyBalance = in.g4s();
					Client.lobbyRecoveryDay = in.g2();
					Client.lobbyUnreadMessages = in.g2();
					Client.lobbyLastLoginDay = in.g2();
					Client.playerHostName = in.g4s();
					Client.hostNameProvider = new HostNameProvider(Client.playerHostName);
					(new Thread(Client.hostNameProvider)).start();
					Client.lobbyEmailStatus = in.g1();
					Client.lobbyCCExpiry = in.g2();
					Client.lobbyGraceExpiry = in.g2();
					Client.lobbyDOBRequested = in.g1() == 1;
					Client.localPlayerEntity.nameUnfiltered = Client.localPlayerEntity.name = JagException.user = in.gjstr2();
					Client.lobbyMembersStats = in.g1();
					Client.lobbyPlayAge = in.g4s();
					WorldSwitcher.field9200 = new ServerAddress();
					WorldSwitcher.field9200.node = in.g2();
					if (WorldSwitcher.field9200.node == 65535) {
						WorldSwitcher.field9200.node = -1;
					}
					WorldSwitcher.field9200.host = in.gjstr2();
					WorldSwitcher.field9200.port = in.g2();
					WorldSwitcher.field9200.port2 = in.g2();
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
				if (Client.modewhere == ModeWhere.LIVE) {
					JavascriptFunction.field4024.method6090();
				}
				if (requestState != 211) {
					loginState = 7;
					setReply(2);
					method10282();
					Client.setState(13);
					connection.packetType = null;
					return;
				}
				loginState = 170;
			}
			if (loginState == 170) {
				if (!connection.getStream().hasAvailable(3)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, 3);
				loginState = 188;
			}
			if (loginState == 188) {
				PacketBit in = connection.in;
				in.pos = 0;
				if (in.isIsaac2()) {
					if (!connection.getStream().hasAvailable(1)) {
						return;
					}
					connection.getStream().read(in.data, 3, 1);
				}
				connection.packetType = ServerProt.values()[in.gIsaac1or2()];
				connection.packetSize = in.g2();
				loginState = 160;
			}
			if (loginState == 160) {
				if (!connection.getStream().hasAvailable(connection.packetSize)) {
					return;
				}
				connection.getStream().read(connection.in.data, 0, connection.packetSize);
				connection.in.pos = 0;
				int packetSize = connection.packetSize;
				loginState = 7;
				setReply(2);
				prepareForMap();
				ReceivePlayerPositions.receivePlayerPositions(connection.in);
				int offset = packetSize - connection.in.pos;
				PacketBit in = new PacketBit(offset);
				System.arraycopy(connection.in.data, connection.in.pos, in.data, 0, offset);
				connection.in.pos += offset;
				if (ServerProt.REBUILD_REGION == connection.packetType) {
					Client.world.rebuildMap(new RebuildRequest(RebuildType.REBUILD_REGION, in));
				} else {
					Client.world.rebuildMap(new RebuildRequest(RebuildType.REBUILD_NORMAL, in));
				}
				if (connection.in.pos != packetSize) {
					throw new RuntimeException(connection.in.pos + " " + packetSize);
				}
				connection.packetType = null;
				return;
			}
			if (loginState == 204) {
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
				int packetSize = connection.packetSize;
				loginState = 7;
				setReply(15);
				prepareForPlayers();
				ReceivePlayerPositions.receivePlayerPositions(connection.in);
				if (connection.in.pos != packetSize) {
					throw new RuntimeException(connection.in.pos + " " + packetSize);
				}
				connection.packetType = null;
				return;
			}
		} catch (IOException ioException) {
			connection.closeGracefully();
			if (loginAttempts < 3) {
				if (requestState == 211) {
					WorldSwitcher.currentWorld.configureSocketType();
				} else {
					WorldSwitcher.currentLobby.configureSocketType();
				}
				loginwait = 0;
				loginAttempts++;
				loginState = 14;
			} else {
				loginState = 7;
				setReply(-4);
				updateLoginState();
			}
		}
	}

	@ObfuscatedName("kl.b(Lase;I)V")
	public static void getAuthPreferences(PacketBit buf) {
		boolean var1 = buf.g1() == 1;
		if (!var1) {
			return;
		}
		boolean var2 = false;
		int var3 = buf.gIsaac1() << 24;
		int var4 = var3 | buf.gIsaac1() << 16;
		int var5 = var4 | buf.gIsaac1() << 8;
		int var6 = var5 | buf.gIsaac1();
		Client.authPreferences.method590(authKey, var6);
	}

	@ObfuscatedName("s.h(IB)V")
	public static void nothing(int arg0) {
	}

	@ObfuscatedName("iq.a(B)Lalw;")
	public static Packet createSecuredPacket() {
		Packet buf = new Packet(518);
		outKey = new int[4];
		outKey[0] = Client.secureRandom.nextInt();
		outKey[1] = Client.secureRandom.nextInt();
		outKey[2] = Client.secureRandom.nextInt();
		outKey[3] = Client.secureRandom.nextInt();
		buf.p1(10);
		buf.p4(outKey[0]);
		buf.p4(outKey[1]);
		buf.p4(outKey[2]);
		buf.p4(outKey[3]);
		buf.p8(field434);
		if (Client.state == 14) {
			buf.p4(outKey2[0]);
			buf.p4(outKey2[1]);
			buf.p4(outKey2[2]);
			buf.p4(outKey2[3]);
		}
		outKey2 = outKey;
		return buf;
	}

	@ObfuscatedName("zl.g(Lalw;J)V")
	public static void putAuth(Packet buf, long key) {
		TotpType totpType;
		if (newAuthPreference != null && newAuthPreference.length() == 6) {
			if (authDontTrust) {
				totpType = TotpType.AUTH_DONT_TRUST;
			} else {
				totpType = TotpType.AUTH_TRUST;
			}
		} else if (Client.authPreferences.containsKey(key)) {
			totpType = TotpType.AUTH_FOUND;
		} else {
			totpType = TotpType.AUTH_NOT_FOUND;
		}
		buf.p1(totpType.getId());
		switch(totpType.index) {
			case 0:
				buf.p4(Client.authPreferences.getValue(key));
				break;
			case 1:
			case 3:
				buf.p3(Integer.parseInt(newAuthPreference));
				buf.pos++;
				break;
			case 2:
				buf.pos += 4;
		}
	}

	@ObfuscatedName("ap.i(B)Lalw;")
	public static Packet createLoginPacket() {
		Packet buf = createSecuredPacket();
		if (Client.state != 14) {
			long authKey;
			if (ssoKey != -1) {
				authKey = ssoKey;
			} else if (socialKey == -1L) {
				authKey = StringTools.method15380(username);
			} else {
				authKey = socialKey;
			}
			LoginManager.authKey = authKey;
			putAuth(buf, authKey);
			buf.pbool(false);
			buf.pjstr(password);
			buf.p8(socialname);
			buf.p8(Client.field10810);
		}
		buf.rsaenc(PublicKeys.field624, PublicKeys.field626);
		return buf;
	}

	@ObfuscatedName("ag.j(II)V")
	public static void setReply(int reply) {
		if (requestState == 132) {
			enterLobbyReply = reply;
		} else if (requestState == 211) {
			enterGameReply = reply;
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
	public static void putJs5Crcs(PacketBit buf) {
		Js5Archive[] archives = Js5Archive.values();
		for (int index = 0; index < archives.length; index++) {
			Js5Archive archive = archives[index];
			if (Js5Archive.LOADING_SPRITES != archive) {
				Js5 js5 = (Js5) Client.js5Archives.get(archive);
				if (js5 == null) {
					buf.p4(0);
				} else {
					buf.p4(js5.getChecksum());
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
		Client.field6867 = null;
		Client.field1890 = null;
		Client.telemetryError = true;
		ClientWatch.method13845();
		for (int var0 = 0; var0 < Client.localPlayerGameState.stats.length; var0++) {
			PlayerStat var1 = new PlayerStat(Client.skillDefaults.getSkill(var0), false);
			var1.setXP(0);
			var1.setLevel(0);
			Client.localPlayerGameState.stats[var0] = var1;
		}
		Client.localPlayerGameState.varps.method9624();
		DelayedStateChange.method716();
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
		Client.npcCount = 0;
		Client.field10906 = 0;
		Client.npcs.removeAll();
		Client.projectiles.removeAll();
		Client.spotanims.removeAll();
		Client.textCoords.clear();
		Client.objStacks.removeAll();
		ChangeLocationRequest.field11237 = new IterableQueue();
		ChangeLocationRequest.field11242 = new IterableQueue();
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
		for (SubInterface var2 = (SubInterface) Client.openedSubInterfaces.peekFront(); var2 != null; var2 = (SubInterface) Client.openedSubInterfaces.prev()) {
			if (!var2.hasNext()) {
				var2 = (SubInterface) Client.openedSubInterfaces.peekFront();
				if (var2 == null) {
					break;
				}
			}
			Client.ifCloseSub(var2, true, false);
		}
		Client.openedTopInterface = -1;
		Client.openedSubInterfaces = new IterableMap(8);
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
			Client.field11072[var4] = true;
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
		for (int var1 = 0; var1 < Client.field10906; var1++) {
			PathingEntity var2 = (PathingEntity) Client.field10839[var1].value;
			if (var2 != null) {
				var2.targetId = -1;
			}
		}
		ClientInvCache.removeAll();
		Client.cameraReset(Client.getDefaultCameraState());
		Client.setState(18);
		for (int var3 = 0; var3 < 114; var3++) {
			Client.field11072[var3] = true;
		}
		Client.notifyWindowStatus(connection);
		Client.pingRequest = null;
		Client.field3457 = 0L;
		Client.method3652();
		Client.clientVariableManager.method16421();
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
