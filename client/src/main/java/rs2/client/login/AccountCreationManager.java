package rs2.client.login;

import com.jagex.core.constants.PublicKeys;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.io.Stream;
import com.jagex.encryption.Isaac;
import com.jagex.game.client.ClientMessage;
import com.jagex.game.client.GameShell;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.game.network.protocol.LoginProt;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.logic.DelayedStateChange;

import java.io.IOException;

@ObfuscatedName("y")
public class AccountCreationManager {

	@ObfuscatedName("y.n")
	public static int[] field581;

	@ObfuscatedName("y.m")
	public static int field583 = 0;

	@ObfuscatedName("y.k")
	public static int field580 = 0;

	@ObfuscatedName("u.f")
	public static CreateConnectStage createStage;

	@ObfuscatedName("y.w")
	public static ConnectReply field584;

	@ObfuscatedName("pr.l")
	public static CreateAccountReply field4406;

	@ObfuscatedName("af.u")
	public static CheckEmailReply field872;

	@ObfuscatedName("hv.z")
	public static CheckNameReply field2589;

	@ObfuscatedName("y.p")
	public static SuggestNameReply field585;

	@ObfuscatedName("j.d")
	public static String field618;

	public AccountCreationManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("dk.e(I)V")
	public static void method2009() {
		if (Client.state == 4 && (!LoginManager.isInProgress() && !isInProgress())) {
			Client.setState(12);
		}
	}

	@ObfuscatedName("amf.n(B)V")
	public static void method18476() {
		createStage = CreateConnectStage.field515;
		field584 = ConnectReply.field8368;
		field4406 = CreateAccountReply.field8390;
		field872 = CheckEmailReply.field8397;
		field585 = SuggestNameReply.field8394;
		field2589 = CheckNameReply.field8407;
		field618 = null;
	}

	@ObfuscatedName("wa.m(I)Z")
	public static boolean isInProgress() {
		return createStage != null;
	}

	@ObfuscatedName("w.k(Ljava/lang/String;B)V")
	public static void requestEmailAvailableCheck(String arg0) {
		if (Client.state != 0) {
			return;
		}
		ClientMessage var1 = ClientMessage.createMessage(ClientProt.CREATE_CHECK_EMAIL, Client.lobbyConnection.randomOut);
		var1.buf.p2(0);
		int var2 = var1.buf.pos;
		var1.buf.pjstr(arg0);
		var1.buf.pos += 7;
        var1.buf.tinyenc(field581, var2, var1.buf.pos);
		var1.buf.psize2(var1.buf.pos - var2);
		Client.lobbyConnection.queue(var1);
		field872 = CheckEmailReply.field8400;
	}

	@ObfuscatedName("alb.f(Ljava/lang/String;I)V")
	public static void requestDisplayNameAvailableCheck(String arg0) {
		if (Client.state != 0) {
			return;
		}
		ClientMessage var1 = ClientMessage.createMessage(ClientProt.CREATE_CHECK_NAME, Client.lobbyConnection.randomOut);
		var1.buf.p1(0);
		int var2 = var1.buf.pos;
		var1.buf.pjstr(arg0);
		var1.buf.pos += 7;
        var1.buf.tinyenc(field581, var2, var1.buf.pos);
		var1.buf.psize1(var1.buf.pos - var2);
		Client.lobbyConnection.queue(var1);
		field2589 = CheckNameReply.field8405;
	}

	@ObfuscatedName("ae.w(I)V")
	public static void requestDisplayNameSuggestion() {
		if (Client.state == 0) {
			ClientMessage var0 = ClientMessage.createMessage(ClientProt.CREATE_SUGGEST_NAMES, Client.lobbyConnection.randomOut);
			Client.lobbyConnection.queue(var0);
			field585 = SuggestNameReply.field8392;
			field618 = null;
		}
	}

	@ObfuscatedName("arv.l(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V")
	public static void requestAccountCreation(String arg0, String arg1, int arg2, boolean arg3, String arg4) {
		if (Client.state != 0) {
			return;
		}
		ClientMessage var5 = ClientMessage.createMessage(ClientProt.CREATE_ACCOUNT, Client.lobbyConnection.randomOut);
		var5.buf.p2(0);
		int var6 = var5.buf.pos;
		var5.buf.pjstr(arg0);
		var5.buf.pjstr(arg1);
		var5.buf.p1(arg2);
		var5.buf.p1(arg3 ? 1 : 0);
		var5.buf.pjstr(arg4);
		var5.buf.pos += 7;
        var5.buf.tinyenc(field581, var6, var5.buf.pos);
		var5.buf.psize2(var5.buf.pos - var6);
		Client.lobbyConnection.queue(var5);
		if (arg2 < 13) {
			Client.isUnder13 = true;
			Client.method3094();
		}
		field4406 = CreateAccountReply.field8388;
	}

	@ObfuscatedName("afu.u(II)V")
	public static void requestStatsLogging(int arg0) {
		if (Client.state == 0) {
			ClientMessage var1 = ClientMessage.createMessage(ClientProt.CREATE_LOG_PROGRESS, Client.lobbyConnection.randomOut);
			var1.buf.p1(arg0);
			Client.lobbyConnection.queue(var1);
		}
	}

	@ObfuscatedName("et.z(I)Lzl;")
	public static ConnectReply getConnectReply() {
		return field584 == null ? ConnectReply.field8361 : field584;
	}

	@ObfuscatedName("amf.p(I)Lzb;")
	public static CreateAccountReply getReply() {
		return field4406 == null ? CreateAccountReply.field8390 : field4406;
	}

	@ObfuscatedName("vn.d(B)Lzx;")
	public static CheckEmailReply getEmailValidateReply() {
		return field872 == null ? CheckEmailReply.field8397 : field872;
	}

	@ObfuscatedName("ahj.c(B)Lzr;")
	public static CheckNameReply getNameValidateReply() {
		return field2589 == null ? CheckNameReply.field8407 : field2589;
	}

	@ObfuscatedName("ahn.r(B)Lzg;")
	public static SuggestNameReply getSuggestNameReply() {
		return field585 == null ? SuggestNameReply.field8394 : field585;
	}

	@ObfuscatedName("xh.v(B)Ljava/lang/String;")
	public static String method10209() {
		return field618;
	}

	@ObfuscatedName("pl.o(Lzb;I)V")
	public static void method6851(CreateAccountReply arg0) {
		field4406 = arg0;
	}

	@ObfuscatedName("gs.s(Lzx;I)V")
	public static void method3581(CheckEmailReply arg0) {
		field872 = arg0;
	}

	@ObfuscatedName("ac.y(Lzr;B)V")
	public static void method717(CheckNameReply arg0) {
		field2589 = arg0;
	}

	@ObfuscatedName("jl.q(Lzg;I)V")
	public static void method4664(SuggestNameReply arg0) {
		field585 = arg0;
		field618 = null;
	}

	@ObfuscatedName("cc.x(Ljava/lang/String;I)V")
	public static void method1587(String arg0) {
		field585 = SuggestNameReply.field8391;
		field618 = arg0;
	}

	@ObfuscatedName("ack.b(I)V")
	public static void update() {
		if (createStage == null) {
			return;
		}
		try {
			short var0;
			if (field580 == 0) {
				var0 = 250;
			} else {
				var0 = 2000;
			}
			field583++;
			if (field583 > var0) {
				method17428();
			}
			if (createStage == CreateConnectStage.field515) {
				Client.lobbyConnection.setStream(Stream.createStream(WorldSwitcher.currentLobby.getSocket(), 40000), WorldSwitcher.currentLobby.host);
				Client.lobbyConnection.clearWriteQueue();
				ClientMessage var1 = ClientMessage.createMessage();
				var1.buf.p1(LoginProt.CREATE_ACCOUNT_CONNECT.id);
				var1.buf.p2(0);
				int var2 = var1.buf.pos;
				var1.buf.p2(910);
				var1.buf.p2(1);
				field581 = method4942(var1);
				int var3 = var1.buf.pos;
				var1.buf.pjstr(Client.gamepack);
				var1.buf.p2(Client.playerIsAffiliate);
				var1.buf.p4(Client.userFlow2);
				var1.buf.p4(Client.userFlow1);
				var1.buf.pjstr(Client.field579);
				var1.buf.p1(Client.language.getId());
				var1.buf.p1(Client.modegame.game);
				GameShell.pushUID192(var1.buf);
				String var4 = Client.createAdditionalInfo;
				var1.buf.p1(var4 == null ? 0 : 1);
				if (var4 != null) {
					var1.buf.pjstr(var4);
				}
				Client.hardwarePlatform.createHardwareBlock(var1.buf);
				var1.buf.pos += 7;
                var1.buf.tinyenc(field581, var3, var1.buf.pos);
				var1.buf.psize2(var1.buf.pos - var2);
				Client.lobbyConnection.queue(var1);
				Client.lobbyConnection.flush();
				createStage = CreateConnectStage.field516;
			}
			if (createStage == CreateConnectStage.field516) {
				if (Client.lobbyConnection.getStream() == null) {
					method17428();
					return;
				}
				if (!Client.lobbyConnection.getStream().hasAvailable(1)) {
					return;
				}
				Client.lobbyConnection.getStream().read(Client.lobbyConnection.in.data, 0, 1);
				field584 = (ConnectReply) SerializableEnums.decode(ConnectReply.method16743(), Client.lobbyConnection.in.data[0] & 0xFF);
				if (field584 == ConnectReply.field8364) {
					Client.lobbyConnection.randomOut = new Isaac(field581);
					int[] var5 = new int[4];
					for (int var6 = 0; var6 < 4; var6++) {
						var5[var6] = field581[var6] + 50;
					}
					Client.lobbyConnection.randomIn = new Isaac(var5);
					new Isaac(var5);
					Client.lobbyConnection.in.setIsaac(Client.lobbyConnection.randomIn);
					Client.setState(0);
					Client.lobbyConnection.clearWriteQueue();
					Client.lobbyConnection.in.pos = 0;
					Client.lobbyConnection.lastPacketType0 = null;
					Client.lobbyConnection.lastPacketType1 = null;
					Client.lobbyConnection.lastPacketType2 = null;
					Client.lobbyConnection.idleNetCycles = 0;
					Client.localPlayerGameState.varps.method9624();
					DelayedStateChange.removeAll();
				} else {
					Client.lobbyConnection.closeGracefully();
				}
				Client.lobbyConnection.packetType = null;
				createStage = null;
			}
		} catch (IOException var8) {
			method17428();
		}
	}

	@ObfuscatedName("js.h(Lakl;B)[I")
	public static int[] method4942(ClientMessage arg0) {
		Packet var1 = new Packet(518);
		int[] var2 = new int[4];
		for (int var3 = 0; var3 < 4; var3++) {
			var2[var3] = (int) (Math.random() * 9.9999999E7D);
		}
		var1.p1(10);
		var1.p4(var2[0]);
		var1.p4(var2[1]);
		var1.p4(var2[2]);
		var1.p4(var2[3]);
		for (int var4 = 0; var4 < 10; var4++) {
			var1.p4((int) (Math.random() * 9.9999999E7D));
		}
		var1.p2((int) (Math.random() * 9.9999999E7D));
		var1.rsaenc(PublicKeys.LOGIN_RSAE, PublicKeys.LOGIN_RSAN);
		arg0.buf.pdata(var1.data, 0, var1.pos);
		return var2;
	}

	@ObfuscatedName("ajh.a(I)V")
	public static void method17428() {
		Client.lobbyConnection.closeGracefully();
		if (field580 < 2) {
			WorldSwitcher.currentLobby.configureSocketType();
			field583 = 0;
			field580++;
			createStage = CreateConnectStage.field515;
		} else {
			createStage = null;
			field584 = ConnectReply.field8363;
			Client.setState(4);
		}
	}
}
