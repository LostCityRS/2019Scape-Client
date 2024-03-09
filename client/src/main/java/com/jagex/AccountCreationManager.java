package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.io.IOException;

@ObfuscatedName("y")
public class AccountCreationManager {

	@ObfuscatedName("y.m")
	public static int field583 = 0;

	@ObfuscatedName("y.k")
	public static int field580 = 0;

	public AccountCreationManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("dk.e(I)V")
	public static void method2009() {
		if (client.state == 4 && (!LoginManager.method2865() && !method9610())) {
			client.setState(12);
		}
	}

	@ObfuscatedName("amf.n(B)V")
	public static void method18476() {
		Statics.field517 = class15.field515;
		Statics.field584 = ConnectReply.field8368;
		Statics.field4406 = CreateAccountReply.field8390;
		Statics.field872 = CheckEmailReply.field8397;
		Statics.field585 = SuggestNameReply.field8394;
		Statics.field2589 = CheckNameReply.field8407;
		Statics.field618 = null;
	}

	@ObfuscatedName("wa.m(I)Z")
	public static boolean method9610() {
		return Statics.field517 != null;
	}

	@ObfuscatedName("w.k(Ljava/lang/String;B)V")
	public static void method233(String arg0) {
		if (client.state != 0) {
			return;
		}
		ClientMessage var1 = Statics.method1604(ClientProt.CREATE_CHECK_EMAIL, client.field10835.field794);
		var1.field11432.p2(0);
		int var2 = var1.field11432.pos;
		var1.field11432.pjstr(arg0);
		var1.field11432.pos += 7;
		if (client.ENABLE_TINYENC) {
			var1.field11432.tinyenc(Statics.field581, var2, var1.field11432.pos);
		}
		var1.field11432.psize2(var1.field11432.pos - var2);
		client.field10835.method934(var1);
		Statics.field872 = CheckEmailReply.field8400;
	}

	@ObfuscatedName("alb.f(Ljava/lang/String;I)V")
	public static void method18305(String arg0) {
		if (client.state != 0) {
			return;
		}
		ClientMessage var1 = Statics.method1604(ClientProt.CREATE_CHECK_NAME, client.field10835.field794);
		var1.field11432.p1(0);
		int var2 = var1.field11432.pos;
		var1.field11432.pjstr(arg0);
		var1.field11432.pos += 7;
		if (client.ENABLE_TINYENC) {
			var1.field11432.tinyenc(Statics.field581, var2, var1.field11432.pos);
		}
		var1.field11432.psize1(var1.field11432.pos - var2);
		client.field10835.method934(var1);
		Statics.field2589 = CheckNameReply.field8405;
	}

	@ObfuscatedName("ae.w(I)V")
	public static void method648() {
		if (client.state == 0) {
			ClientMessage var0 = Statics.method1604(ClientProt.CREATE_SUGGEST_NAMES, client.field10835.field794);
			client.field10835.method934(var0);
			Statics.field585 = SuggestNameReply.field8392;
			Statics.field618 = null;
		}
	}

	@ObfuscatedName("arv.l(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V")
	public static void method19266(String arg0, String arg1, int arg2, boolean arg3, String arg4) {
		if (client.state != 0) {
			return;
		}
		ClientMessage var5 = Statics.method1604(ClientProt.CREATE_ACCOUNT, client.field10835.field794);
		var5.field11432.p2(0);
		int var6 = var5.field11432.pos;
		var5.field11432.pjstr(arg0);
		var5.field11432.pjstr(arg1);
		var5.field11432.p1(arg2);
		var5.field11432.p1(arg3 ? 1 : 0);
		var5.field11432.pjstr(arg4);
		var5.field11432.pos += 7;
		if (client.ENABLE_TINYENC) {
			var5.field11432.tinyenc(Statics.field581, var6, var5.field11432.pos);
		}
		var5.field11432.psize2(var5.field11432.pos - var6);
		client.field10835.method934(var5);
		if (arg2 < 13) {
			client.field10814 = true;
			client.method3094();
		}
		Statics.field4406 = CreateAccountReply.field8388;
	}

	@ObfuscatedName("afu.u(II)V")
	public static void method16428(int arg0) {
		if (client.state == 0) {
			ClientMessage var1 = Statics.method1604(ClientProt.CREATE_LOG_PROGRESS, client.field10835.field794);
			var1.field11432.p1(arg0);
			client.field10835.method934(var1);
		}
	}

	@ObfuscatedName("et.z(I)Lzl;")
	public static ConnectReply method2858() {
		return Statics.field584 == null ? ConnectReply.field8361 : Statics.field584;
	}

	@ObfuscatedName("amf.p(I)Lzb;")
	public static CreateAccountReply method18475() {
		return Statics.field4406 == null ? CreateAccountReply.field8390 : Statics.field4406;
	}

	@ObfuscatedName("vn.d(B)Lzx;")
	public static CheckEmailReply method9583() {
		return Statics.field872 == null ? CheckEmailReply.field8397 : Statics.field872;
	}

	@ObfuscatedName("ahj.c(B)Lzr;")
	public static CheckNameReply method16613() {
		return Statics.field2589 == null ? CheckNameReply.field8407 : Statics.field2589;
	}

	@ObfuscatedName("ahn.r(B)Lzg;")
	public static SuggestNameReply method16742() {
		return Statics.field585 == null ? SuggestNameReply.field8394 : Statics.field585;
	}

	@ObfuscatedName("xh.v(B)Ljava/lang/String;")
	public static String method10209() {
		return Statics.field618;
	}

	@ObfuscatedName("gs.s(Lzx;I)V")
	public static void method3581(CheckEmailReply arg0) {
		Statics.field872 = arg0;
	}

	@ObfuscatedName("ac.y(Lzr;B)V")
	public static void method717(CheckNameReply arg0) {
		Statics.field2589 = arg0;
	}

	@ObfuscatedName("jl.q(Lzg;I)V")
	public static void method4664(SuggestNameReply arg0) {
		Statics.field585 = arg0;
		Statics.field618 = null;
	}

	@ObfuscatedName("cc.x(Ljava/lang/String;I)V")
	public static void method1587(String arg0) {
		Statics.field585 = SuggestNameReply.field8391;
		Statics.field618 = arg0;
	}

	@ObfuscatedName("ack.b(I)V")
	public static void method14952() {
		if (Statics.field517 == null) {
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
				Statics.method17428();
			}
			if (Statics.field517 == class15.field515) {
				client.field10835.method936(Stream.method7130(Statics.lobby.method14764(), 40000), Statics.lobby.host);
				client.field10835.method952();
				ClientMessage var1 = ClientMessage.method13920();
				var1.field11432.p1(LoginProt.field3815.field3812);
				var1.field11432.p2(0);
				int var2 = var1.field11432.pos;
				var1.field11432.p2(910);
				var1.field11432.p2(1);
				Statics.field581 = method4942(var1);
				int var3 = var1.field11432.pos;
				var1.field11432.pjstr(client.field10789);
				var1.field11432.p2(client.field10772);
				var1.field11432.p4(client.field10776);
				var1.field11432.p4(client.field10775);
				var1.field11432.pjstr(Statics.field579);
				var1.field11432.p1(Statics.field1680.getId());
				var1.field11432.p1(client.field10768.field8339);
				GameShell.pushUID192(var1.field11432);
				String var4 = client.field10781;
				var1.field11432.p1(var4 == null ? 0 : 1);
				if (var4 != null) {
					var1.field11432.pjstr(var4);
				}
				Statics.field10581.method18188(var1.field11432);
				var1.field11432.pos += 7;
				if (client.ENABLE_TINYENC) {
					var1.field11432.tinyenc(Statics.field581, var3, var1.field11432.pos);
				}
				var1.field11432.psize2(var1.field11432.pos - var2);
				client.field10835.method934(var1);
				client.field10835.method933();
				Statics.field517 = class15.field516;
			}
			if (Statics.field517 == class15.field516) {
				if (client.field10835.method939() == null) {
					Statics.method17428();
					return;
				}
				if (!client.field10835.method939().method9038(1)) {
					return;
				}
				client.field10835.method939().method9029(client.field10835.field795.data, 0, 1);
				Statics.field584 = (ConnectReply) class686.method1897(ConnectReply.method16743(), client.field10835.field795.data[0] & 0xFF);
				if (Statics.field584 == ConnectReply.field8364) {
					client.field10835.field794 = new IsaacRandom(Statics.field581);
					int[] var5 = new int[4];
					for (int var6 = 0; var6 < 4; var6++) {
						var5[var6] = Statics.field581[var6] + 50;
					}
					client.field10835.field809 = new IsaacRandom(var5);
					new IsaacRandom(var5);
					client.field10835.field795.setIsaac(client.field10835.field809);
					client.setState(0);
					client.field10835.method952();
					client.field10835.field795.pos = 0;
					client.field10835.field790 = null;
					client.field10835.field806 = null;
					client.field10835.field805 = null;
					client.field10835.field789 = 0;
					Statics.field7410.field632.method9624();
					DelayedStateChange.method716();
				} else {
					client.field10835.method938();
				}
				client.field10835.field796 = null;
				Statics.field517 = null;
			}
		} catch (IOException var8) {
			Statics.method17428();
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
		var1.rsaenc(PublicKeys.field624, PublicKeys.field626);
		arg0.field11432.pdata(var1.data, 0, var1.pos);
		return var2;
	}
}
