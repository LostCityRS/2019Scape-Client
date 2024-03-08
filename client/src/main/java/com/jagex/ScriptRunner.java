package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import com.jagex.twitchtv.TwitchEvent;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("ym")
public final class ScriptRunner {

	@ObfuscatedName("ym.e")
	public static final TimeZone field8201 = TimeZone.getTimeZone("UTC");

	@ObfuscatedName("ym.k")
	public static int field8202 = 0;

	@ObfuscatedName("ym.f")
	public static int[] field8203 = new int[3];

	@ObfuscatedName("ym.w")
	public static WeightedCache field8204 = new WeightedCache(4);

	@ObfuscatedName("ym.l")
	public static Vector3[] field8210 = new Vector3[2];

	@ObfuscatedName("ym.u")
	public static boolean field8206 = false;

	@ObfuscatedName("ym.z")
	public static String field8205 = null;

	@ObfuscatedName("ym.p")
	public static ArrayList field8208 = new ArrayList();

	@ObfuscatedName("ym.d")
	public static int field8199 = 0;

	@ObfuscatedName("ym.c")
	public static int field8209 = 0;

	public ScriptRunner() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ch.e(I)Lyf;")
	public static final ClientScriptState method1516() {
		if (field8199 == field8208.size()) {
			field8208.add(new ClientScriptState());
		}
		ClientScriptState var0 = (ClientScriptState) field8208.get(field8199);
		field8199++;
		return var0;
	}

	@ObfuscatedName("vu.n(B)V")
	public static final void method9399() {
		field8199--;
	}

	@ObfuscatedName("cr.m(Lals;I)V")
	public static void method1428(HookRequest arg0) {
		method10370(arg0, 500000);
	}

	@ObfuscatedName("ace.k(I[II)V")
	public static void method15086(int arg0, int[] arg1) {
		if (arg0 != -1 && Component.method5364(arg0, arg1)) {
			Component[] var2 = Statics.field11725[arg0].field2151;
			method16465(var2);
		}
	}

	@ObfuscatedName("agr.f([Lhf;I)V")
	public static void method16465(Component[] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			Component var2 = arg0[var1];
			if (var2.field2290 != null) {
				HookRequest var3 = new HookRequest();
				var3.field11491 = var2;
				var3.field11493 = var2.field2290;
				method10370(var3, 5000000);
			}
		}
	}

	@ObfuscatedName("yo.w(Lals;II)V")
	public static void method10370(HookRequest arg0, int arg1) {
		Object[] var2 = arg0.field11493;
		int var3 = (Integer) var2[0];
		ClientScript var4 = class670.method5402(var3);
		if (var4 == null) {
			return;
		}
		ClientScriptState var5 = method1516();
		var5.field8213 = new int[var4.field12370];
		int var6 = 0;
		var5.field8212 = new String[var4.field12368];
		int var7 = 0;
		var5.field8219 = new long[var4.field12371];
		int var8 = 0;
		for (int var9 = 1; var9 < var2.length; var9++) {
			if (var2[var9] instanceof Integer) {
				int var10 = (Integer) var2[var9];
				if (var10 == -2147483647) {
					var10 = arg0.field11492;
				}
				if (var10 == -2147483646) {
					var10 = arg0.field11497;
				}
				if (var10 == -2147483645) {
					var10 = arg0.field11491 == null ? -1 : arg0.field11491.field2158;
				}
				if (var10 == -2147483644) {
					var10 = arg0.field11494;
				}
				if (var10 == -2147483643) {
					var10 = arg0.field11491 == null ? -1 : arg0.field11491.field2183;
				}
				if (var10 == -2147483642) {
					var10 = arg0.field11495 == null ? -1 : arg0.field11495.field2158;
				}
				if (var10 == -2147483641) {
					var10 = arg0.field11495 == null ? -1 : arg0.field11495.field2183;
				}
				if (var10 == -2147483640) {
					var10 = arg0.field11496;
				}
				if (var10 == -2147483639) {
					var10 = arg0.field11489;
				}
				var5.field8213[var6++] = var10;
			} else if (var2[var9] instanceof String) {
				String var11 = (String) var2[var9];
				if (var11.equals("event_opbase")) {
					var11 = arg0.field11498;
				}
				var5.field8212[var7++] = var11;
			} else if (var2[var9] instanceof Long) {
				long var12 = (Long) var2[var9];
				var5.field8219[var8++] = var12;
			}
		}
		var5.field8229 = arg0.field11499;
		method15248(var4, arg1, var5);
		var5.field8229 = 0;
	}

	@ObfuscatedName("gz.l(Luh;IILahm;II)V")
	public static void method3661(ClientTriggerType arg0, int arg1, int arg2, PathingEntity arg3, int arg4) {
		ClientScriptState var5 = method1516();
		var5.field8221 = arg3;
		var5.field8231 = arg4;
		method4374(arg0, arg1, arg2, var5);
		var5.field8221 = null;
		var5.field8231 = -1;
	}

	@ObfuscatedName("acl.u(Luh;IILst;I)V")
	public static void method15112(ClientTriggerType arg0, int arg1, int arg2, Location arg3) {
		ClientScriptState var4 = method1516();
		var4.field8230 = arg3;
		method4374(arg0, arg1, arg2, var4);
		var4.field8230 = null;
	}

	@ObfuscatedName("uf.z(Luh;IILyd;Laut;I)V")
	public static void method9018(ClientTriggerType arg0, int arg1, int arg2, class679 arg3, ObjStackEntity arg4) {
		ClientScriptState var5 = method1516();
		var5.field8232 = arg4;
		method4374(arg0, arg1, arg2, var5);
		var5.field8232 = null;
	}

	@ObfuscatedName("iq.d(Luh;IILyf;I)V")
	public static void method4374(ClientTriggerType arg0, int arg1, int arg2, ClientScriptState arg3) {
		ClientScript var4 = class670.method9425(arg0, arg1, arg2);
		if (var4 == null) {
			method9399();
			return;
		}
		arg3.field8213 = new int[var4.field12370];
		arg3.field8212 = new Object[var4.field12368];
		if (ClientTriggerType.field7263 == var4.field12373 || ClientTriggerType.field7255 == var4.field12373 || ClientTriggerType.field7254 == var4.field12373) {
			arg3.field8213[0] = arg1;
			arg3.field8213[1] = Statics.field9182.method9086();
			arg3.field8213[2] = Statics.field9182.method9092();
		} else if (ClientTriggerType.field7258 == var4.field12373 || ClientTriggerType.field7249 == var4.field12373 || ClientTriggerType.field7257 == var4.field12373 || ClientTriggerType.field7253 == var4.field12373 || ClientTriggerType.field7252 == var4.field12373) {
			arg3.field8213[0] = arg1;
		} else if (ClientTriggerType.field7251 == var4.field12373) {
			arg3.field8213[0] = arg3.field8231;
		}
		method15248(var4, 500000, arg3);
	}

	@ObfuscatedName("jf.c(ILjava/lang/String;II)V")
	public static void method4654(int arg0, String arg1, int arg2) {
		ClientScript var3 = class670.method9425(ClientTriggerType.field7269, arg0, -1);
		if (var3 == null) {
			return;
		}
		ClientScriptState var4 = method1516();
		var4.field8213 = new int[var3.field12370];
		var4.field8212 = new String[var3.field12368];
		var4.field8212[0] = arg1;
		var4.field8213[0] = arg2;
		method15248(var3, 500000, var4);
	}

	@ObfuscatedName("zj.r(ILcom/jagex/twitchtv/TwitchEvent;B)V")
	public static void method13907(int arg0, TwitchEvent arg1) {
		ClientScript var2 = class670.method9425(ClientTriggerType.field7267, arg0, -1);
		if (var2 == null) {
			return;
		}
		ClientScriptState var3 = method1516();
		if (var2.field12371 != 0) {
			var3.field8219 = new long[var2.field12371];
		}
		if (var2.field12370 != 0) {
			var3.field8213 = new int[var2.field12370];
		}
		if (var2.field12368 != 0) {
			var3.field8212 = new String[var2.field12368];
		}
		arg1.method12(var3.field8213, var3.field8219, var3.field8212);
		method15248(var2, 500000, var3);
	}

	@ObfuscatedName("adv.v(Lasc;ILyf;I)V")
	public static void method15248(ClientScript arg0, int arg1, ClientScriptState arg2) {
		arg2.field8226 = 0;
		arg2.field8211 = 0;
		arg2.field8220 = -1;
		arg2.field8239 = arg0;
		arg2.field8237 = arg2.field8239.field12369;
		arg2.field8236 = arg2.field8239.field12367;
		ClientScriptCommand var3 = null;
		arg2.field8222 = 0;
		arg2.field8234.clear();
		arg2.field8234.put(VarDomainType.PLAYER, Statics.field7410.field632);
		arg2.field8234.put(VarDomainType.CLIENT, Statics.field7228);
		arg2.field8234.put(VarDomainType.CLAN, Statics.field7698);
		if (arg2.field8227 != null) {
			arg2.field8234.put(VarDomainType.CLAN_SETTING, method991(arg2.field8227));
		}
		if (arg2.field8221 instanceof NpcEntity) {
			arg2.field8234.put(VarDomainType.NPC, arg2.field8221.field10415);
		}
		if (arg2.field8221 instanceof PlayerEntity) {
			arg2.field8233.put(VarDomainType.PLAYER, arg2.field8221.field10415);
		}
		if (Statics.field6721 != null) {
			arg2.field8234.put(VarDomainType.PLAYER_GROUP, Statics.field6721.method3394());
		}
		try {
			field8202 = 0;
			while (true) {
				field8202++;
				if (field8202 > arg1) {
					throw new RuntimeException("");
				}
				var3 = arg2.field8237[++arg2.field8220];
				if (field8206 && (field8205 == null || arg2.field8239.field12365 != null && arg2.field8239.field12365.indexOf(field8205) != -1)) {
					System.out.println(arg2.field8239.field12365 + ": " + var3);
				}
				if (arg2.field8236[arg2.field8220] == 1) {
					arg2.field8235 = true;
				} else {
					arg2.field8235 = false;
				}
				if (ClientScriptCommand.field5926 == var3 && arg2.field8222 == 0) {
					return;
				}
				method10608(var3, arg2);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			method5077(arg2, var3, ex, "S");
		} finally {
			method9399();
		}
	}

	@ObfuscatedName("jh.o(Lyf;Lss;Ljava/lang/Exception;Ljava/lang/String;I)V")
	public static void method5077(ClientScriptState arg0, ClientScriptCommand arg1, Exception arg2, String arg3) {
		StringBuilder var4 = new StringBuilder(30);
		var4.append(arg3 + " ").append(arg0.field8239.field6760).append(" ");
		for (int var5 = arg0.field8222 - 1; var5 >= 0; var5--) {
			var4.append("").append(arg0.field8223[var5].field8190.field6760).append(" ");
		}
		var4.append("").append(arg1.field5953);
		JagException.method9845(var4.toString(), arg2);
	}

	@ObfuscatedName("ki.s(Lhq;IIIZLyf;I)V")
	public static void method5172(Interface arg0, int arg1, int arg2, int arg3, boolean arg4, ClientScriptState arg5) {
		if (arg2 == 0) {
			throw new RuntimeException();
		}
		Component var6 = arg0.field2151[arg1];
		if (var6.field2351 == null) {
			var6.field2351 = new Component[arg3 + 1];
			var6.field2349 = var6.field2351;
		}
		if (var6.field2351.length <= arg3) {
			if (var6.field2351 == var6.field2349) {
				Component[] var7 = new Component[arg3 + 1];
				for (int var8 = 0; var8 < var6.field2351.length; var8++) {
					var7[var8] = var6.field2351[var8];
				}
				var6.field2351 = var6.field2349 = var7;
			} else {
				Component[] var9 = new Component[arg3 + 1];
				Component[] var10 = new Component[arg3 + 1];
				for (int var11 = 0; var11 < var6.field2351.length; var11++) {
					var9[var11] = var6.field2351[var11];
					var10[var11] = var6.field2349[var11];
				}
				var6.field2351 = var9;
				var6.field2349 = var10;
			}
		}
		if (arg3 > 0 && var6.field2351[arg3 - 1] == null) {
			throw new RuntimeException("" + (arg3 - 1));
		}
		Component var12 = new Component();
		var12.field2184 = arg2;
		var12.field2200 = var12.field2158 = var6.field2158;
		var12.field2183 = arg3;
		var6.field2351[arg3] = var12;
		if (var6.field2351 != var6.field2349) {
			var6.field2349[arg3] = var12;
		}
		ActiveComponent var13;
		if (arg4) {
			var13 = arg5.field8225;
		} else {
			var13 = arg5.field8217;
		}
		var13.field8241 = arg0;
		var13.field8242 = var12;
		client.method4616(var6);
	}

	@ObfuscatedName("eb.y(Lhq;Lhf;S)V")
	public static void method2962(Interface arg0, Component arg1) {
		if (arg1 == null) {
			return;
		}
		if (arg1.field2183 == -1) {
			Component[] var5 = arg0.method3932();
			int var6;
			for (var6 = 0; var6 < var5.length && var5[var6] != arg1; var6++) {
			}
			if (var6 >= var5.length) {
				return;
			}
			class701.method14008(var5, var6 + 1, var5, var6, var5.length - var6 - 1);
			var5[var5.length - 1] = arg1;
			return;
		}
		Component var2 = arg0.method3924(arg1.field2200);
		if (var2 == null) {
			return;
		}
		if (var2.field2351 == var2.field2349) {
			var2.field2349 = new Component[var2.field2351.length];
			var2.field2349[var2.field2349.length - 1] = arg1;
			class701.method14008(var2.field2351, 0, var2.field2349, 0, arg1.field2183);
			class701.method14008(var2.field2351, arg1.field2183 + 1, var2.field2349, arg1.field2183, var2.field2351.length - arg1.field2183 - 1);
			return;
		}
		int var3 = 0;
		Component[] var4 = var2.field2349;
		while (var3 < var4.length && var4[var3] != arg1) {
			var3++;
		}
		if (var3 >= var4.length) {
			return;
		}
		class701.method14008(var4, var3 + 1, var4, var3, var4.length - var3 - 1);
		var4[var2.field2349.length - 1] = arg1;
	}

	@ObfuscatedName("ig.q(Lhq;Lhf;I)V")
	public static void method4390(Interface arg0, Component arg1) {
		if (arg1 == null) {
			return;
		}
		if (arg1.field2183 == -1) {
			Component[] var5 = arg0.method3932();
			int var6;
			for (var6 = 0; var6 < var5.length && var5[var6] != arg1; var6++) {
			}
			if (var6 >= var5.length) {
				return;
			}
			class701.method14008(var5, 0, var5, 1, var6);
			var5[0] = arg1;
			return;
		}
		Component var2 = arg0.field2151[arg1.field2200 & 0xFFFF];
		if (var2 == null) {
			return;
		}
		if (var2.field2351 == var2.field2349) {
			var2.field2349 = new Component[var2.field2351.length];
			var2.field2349[0] = arg1;
			class701.method14008(var2.field2351, 0, var2.field2349, 1, arg1.field2183);
			class701.method14008(var2.field2351, arg1.field2183 + 1, var2.field2349, arg1.field2183 + 1, var2.field2351.length - arg1.field2183 - 1);
			return;
		}
		int var3 = 0;
		Component[] var4 = var2.field2349;
		while (var3 < var4.length && var4[var3] != arg1) {
			var3++;
		}
		if (var3 >= var4.length) {
			return;
		}
		class701.method14008(var4, 0, var4, 1, var3);
		var4[0] = arg1;
	}

	@ObfuscatedName("pf.x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V")
	public static void method7005(String arg0, String arg1, String arg2, boolean arg3, boolean arg4) {
		ServerConnection var5 = client.method640();
		if (var5.method939() == null) {
			return;
		}
		ClientMessage var6 = Statics.method1604(ClientProt.URL_REQUEST, var5.field794);
		var6.field11432.p2(Packet.pjstrlen(arg0) + Packet.pjstrlen(arg1) + Packet.pjstrlen(arg2) + 1);
		var6.field11432.pjstr(arg0);
		var6.field11432.pjstr(arg1);
		var6.field11432.pjstr(arg2);
		int var7 = 0;
		if (arg3) {
			var7 |= 0x1;
		}
		if (arg4) {
			var7 |= 0x2;
		}
		var6.field11432.p1(var7);
		var5.method934(var6);
	}

	@ObfuscatedName("iy.b(Larm;Lyf;I)V")
	public static final void method4597(class1172 arg0, ClientScriptState arg1) {
		arg1.field8216[++arg1.field8226 - 1] = MiniMenu.method18429(arg0);
		arg1.field8218[++arg1.field8211 - 1] = MiniMenu.method4642(arg0);
		arg1.field8218[++arg1.field8211 - 1] = MiniMenu.method6018(arg0);
		arg1.field8218[++arg1.field8211 - 1] = MiniMenu.method313(arg0);
	}

	@ObfuscatedName("yx.h(Lss;Lyf;I)V")
	public static final void method10608(ClientScriptCommand arg0, ClientScriptState arg1) throws class1109, VarBitOverflowException {
		switch(arg0.field5953) {
			case 0:
				Statics.method4480(arg1);
				return;
			case 1:
				method9603(arg1);
				return;
			case 2:
				Statics.method10609(arg1);
				return;
			case 3:
				method18616(arg1);
				return;
			case 4:
				method4276(arg1);
				return;
			case 5:
				method10335(arg1);
				return;
			case 6:
				method7314(arg1);
				return;
			case 7:
				method6821(arg1);
				return;
			case 8:
				Statics.method8192(arg1);
				return;
			case 9:
				method2101(arg1);
				return;
			case 10:
				method9552(arg1);
				return;
			case 11:
				method9024(arg1);
				return;
			case 12:
				method7224(true, arg1);
				return;
			case 13:
				method4375(arg1);
				return;
			case 14:
				method6060(arg1);
				return;
			case 15:
				method3139(arg1);
				return;
			case 16:
				method807(arg1);
				return;
			case 17:
				method6078(arg1);
				return;
			case 18:
				Statics.method272(arg1);
				return;
			case 19:
				method538(arg1);
				return;
			case 20:
				method5927(arg1);
				return;
			case 21:
				method16907(arg1);
				return;
			case 22:
				method6076(arg1);
				return;
			case 23:
				method252(arg1);
				return;
			case 24:
				method4068(arg1);
				return;
			case 25:
				method10442(arg1);
				return;
			case 26:
				method571(arg1);
				return;
			case 27:
				method8177(arg1);
				return;
			case 28:
				method14695(arg1);
				return;
			case 29:
				method8665(arg1);
				return;
			case 30:
				method10339(arg1);
				return;
			case 31:
				method2111(arg1);
				return;
			case 32:
				method5198(arg1);
				return;
			case 33:
				Statics.method7333(arg1);
				return;
			case 34:
				method9549(arg1);
				return;
			case 35:
				method7234(arg1);
				return;
			case 36:
				method6084(arg1);
				return;
			case 37:
				method5922(arg1);
				return;
			case 38:
				method573(arg1);
				return;
			case 39:
				method9586(arg1);
				return;
			case 40:
				method10281(arg1);
				return;
			case 41:
				TwitchCommands.method262(arg1);
				return;
			case 42:
				method3062(arg1);
				return;
			case 43:
				method1603(arg1);
				return;
			case 44:
				method14239(arg1);
				return;
			case 45:
				method2974(arg1);
				return;
			case 46:
				method17724(arg1);
				return;
			case 47:
				method642(arg1);
				return;
			case 48:
				method4882(arg1);
				return;
			case 49:
				method18422(arg1);
				return;
			case 50:
				method2854(arg1);
				return;
			case 51:
				method9905(arg1);
				return;
			case 52:
				method6115(arg1);
				return;
			case 53:
				method5845(arg1);
				return;
			case 54:
				method2884(arg1);
				return;
			case 55:
				method7208(arg1);
				return;
			case 56:
				method3544(arg1);
				return;
			case 57:
				class672.method10322(arg1);
				return;
			case 58:
				method1601(arg1);
				return;
			case 59:
				method1429(arg1);
				return;
			case 60:
				Statics.method6828(arg1);
				return;
			case 61:
				method4633(arg1);
				return;
			case 62:
				method7365(arg1);
				return;
			case 63:
				method5895(arg1);
				return;
			case 64:
				method19196(arg1);
				return;
			case 65:
				method18619(arg1);
				return;
			case 66:
				method9633(arg1);
				return;
			case 67:
				method10613(arg1);
				return;
			case 68:
				method2881(arg1);
				return;
			case 69:
				method5979(arg1, true, true);
				return;
			case 70:
				method15033(arg1);
				return;
			case 71:
				method6984(arg1);
				return;
			case 72:
				method4516(arg1);
				return;
			case 73:
				method7323(arg1);
				return;
			case 74:
				method4626(arg1);
				return;
			case 75:
				method14430(arg1);
				return;
			case 76:
				Statics.method5935(arg1);
				return;
			case 77:
				method7720(arg1);
				return;
			case 78:
				method8319(arg1);
				return;
			case 79:
			case 103:
			case 247:
			case 250:
			case 393:
			default:
				throw new RuntimeException();
			case 80:
				method10285(arg1);
				return;
			case 81:
				method4050(arg1);
				return;
			case 82:
				Statics.method1590(arg1);
				return;
			case 83:
				method9413(arg1);
				return;
			case 84:
				method9241(arg1);
				return;
			case 85:
				method15016(arg1);
				return;
			case 86:
				method3049(arg1);
				return;
			case 87:
				method609(arg1);
				return;
			case 88:
				method10107(arg1);
				return;
			case 89:
				method8674(arg1);
				return;
			case 90:
				method10254(arg1);
				return;
			case 91:
				method3577(arg1);
				return;
			case 92:
				TwitchCommands.method6103(arg1);
				return;
			case 93:
				method6129(arg1);
				return;
			case 94:
				method16666(arg1);
				return;
			case 95:
				method9308(arg1);
				return;
			case 96:
				method8330(arg1);
				return;
			case 97:
				method10566(arg1);
				return;
			case 98:
				method10143(arg1);
				return;
			case 99:
				method16669(arg1);
				return;
			case 100:
				method9415(arg1);
				return;
			case 101:
				method8474(arg1);
				return;
			case 102:
				method14692(arg1);
				return;
			case 104:
				method5958(arg1);
				return;
			case 105:
				method9465(arg1);
				return;
			case 106:
				method4571(arg1);
				return;
			case 107:
				method5011(arg1);
				return;
			case 108:
				method9418(arg1);
				return;
			case 109:
				method4130(arg1);
				return;
			case 110:
				Statics.method2899(arg1);
				return;
			case 111:
				method4658(arg1);
				return;
			case 112:
				method5178(arg1);
				return;
			case 113:
				method6055(arg1);
				return;
			case 114:
				method9735(arg1);
				return;
			case 115:
				method13990(arg1);
				return;
			case 116:
				method3072(arg1);
				return;
			case 117:
				class672.method7476(arg1);
				return;
			case 118:
				method9593(arg1);
				return;
			case 119:
				Statics.method274(arg1);
				return;
			case 120:
				Statics.method2857(arg1);
				return;
			case 121:
				method5173(arg1);
				return;
			case 122:
				method9579(arg1);
				return;
			case 123:
				method14693(arg1);
				return;
			case 124:
				method927(arg1);
				return;
			case 125:
				method16457(arg1);
				return;
			case 126:
				method10373(arg1);
				return;
			case 127:
				method6070(arg1);
				return;
			case 128:
				method4059(arg1);
				return;
			case 129:
				method2663(arg1);
				return;
			case 130:
				method5357(arg1);
				return;
			case 131:
				method6001(arg1);
				return;
			case 132:
				method263(arg1);
				return;
			case 133:
				Statics.method8692(arg1);
				return;
			case 134:
				method2764(arg1);
				return;
			case 135:
				method476(arg1);
				return;
			case 136:
				method9578(arg1);
				return;
			case 137:
				method1920(arg1);
				return;
			case 138:
				method9006(arg1);
				return;
			case 139:
				Statics.method311(arg1);
				return;
			case 140:
				method10767(arg1);
				return;
			case 141:
				method3058(arg1);
				return;
			case 142:
				method7347(arg1);
				return;
			case 143:
				method4982(arg1);
				return;
			case 144:
				method2775(arg1);
				return;
			case 145:
				method3052(arg1);
				return;
			case 146:
				method9636(arg1);
				return;
			case 147:
				method4272(arg1);
				return;
			case 148:
				method3067(arg1);
				return;
			case 149:
				method6080(arg1);
				return;
			case 150:
				method3591(arg1);
				return;
			case 151:
				method9247(arg1);
				return;
			case 152:
				method9248(arg1);
				return;
			case 153:
				method4140(arg1);
				return;
			case 154:
				method10208(arg1);
				return;
			case 155:
				method3480(arg1);
				return;
			case 156:
				method16655(arg1);
				return;
			case 157:
				method4938(arg1);
				return;
			case 158:
				method3051(arg1);
				return;
			case 159:
				method8143(arg1);
				return;
			case 160:
				method10253(arg1);
				return;
			case 161:
				method1577(arg1);
				return;
			case 162:
				method8431(arg1);
				return;
			case 163:
				method4515(arg1);
				return;
			case 164:
				method8020(arg1);
				return;
			case 165:
				method6968(arg1);
				return;
			case 166:
				method15004(arg1);
				return;
			case 167:
				method5986(arg1);
				return;
			case 168:
				method595(arg1);
				return;
			case 169:
				Statics.method10154(arg1);
				return;
			case 170:
				method2040(arg1);
				return;
			case 171:
				method1927(arg1);
				return;
			case 172:
				method7304(arg1);
				return;
			case 173:
				method3096(arg1);
				return;
			case 174:
				method846(arg1);
				return;
			case 175:
				Statics.method7312(arg1);
				return;
			case 176:
				method8667(arg1);
				return;
			case 177:
				method3471(arg1);
				return;
			case 178:
				method18914(arg1);
				return;
			case 179:
				method4457(arg1);
				return;
			case 180:
				method18922(arg1);
				return;
			case 181:
				method5393(arg1);
				return;
			case 182:
				method14048(arg1);
				return;
			case 183:
				method9571(arg1);
				return;
			case 184:
				method8368(arg1);
				return;
			case 185:
				method18464(arg1);
				return;
			case 186:
				method5979(arg1, false, false);
				return;
			case 187:
				Statics.method9830(arg1);
				return;
			case 188:
				method6118(arg1);
				return;
			case 189:
				method10681(arg1);
				return;
			case 190:
				method816(arg1);
				return;
			case 191:
				method8677(arg1);
				return;
			case 192:
				method5243(arg1);
				return;
			case 193:
				method4138(arg1);
				return;
			case 194:
				method7607(arg1);
				return;
			case 195:
				method5391(arg1);
				return;
			case 196:
				method9575(arg1);
				return;
			case 197:
				method2977(arg1);
				return;
			case 198:
				Statics.method5972(arg1);
				return;
			case 199:
				method16668(arg1);
				return;
			case 200:
				method6207(arg1);
				return;
			case 201:
				method2090(arg1);
				return;
			case 202:
				method5196(arg1);
				return;
			case 203:
				method14987(arg1);
				return;
			case 204:
				method16717(arg1);
				return;
			case 205:
				method960(arg1);
				return;
			case 206:
				method10676(arg1);
				return;
			case 207:
				method7325(arg1);
				return;
			case 208:
				method9022(arg1);
				return;
			case 209:
				method572(arg1);
				return;
			case 210:
				method643(arg1);
				return;
			case 211:
				method556(arg1);
				return;
			case 212:
				method990(arg1);
				return;
			case 213:
				class672.method848(arg1);
				return;
			case 214:
				method5133(arg1);
				return;
			case 215:
				method8672(arg1);
				return;
			case 216:
				Statics.method594(arg1);
				return;
			case 217:
				method15251(arg1);
				return;
			case 218:
				method5154(arg1);
				return;
			case 219:
				method4275(arg1);
				return;
			case 220:
				method5329(arg1);
				return;
			case 221:
				method10297(arg1);
				return;
			case 222:
				method9885(arg1);
				return;
			case 223:
				method10522(arg1);
				return;
			case 224:
				method3571(arg1);
				return;
			case 225:
				method10371(arg1);
				return;
			case 226:
				Statics.method16611(arg1);
				return;
			case 227:
				method2885(arg1);
				return;
			case 228:
				method4370(arg1);
				return;
			case 229:
				method575(arg1);
				return;
			case 230:
				method8296(arg1);
				return;
			case 231:
				method5892(arg1);
				return;
			case 232:
				method6105(arg1);
				return;
			case 233:
				method7209(arg1);
				return;
			case 234:
				method14887(arg1);
				return;
			case 235:
				method4319(arg1);
				return;
			case 236:
				method14438(arg1);
				return;
			case 237:
				method3482(arg1);
				return;
			case 238:
				method9179(arg1);
				return;
			case 239:
				method15089(arg1);
				return;
			case 240:
				TwitchCommands.method7604(arg1);
				return;
			case 241:
				method17447(arg1);
				return;
			case 242:
				method8293(arg1);
				return;
			case 243:
				TwitchCommands.method3080(arg1);
				return;
			case 244:
				method10756(arg1);
				return;
			case 245:
				method3479(arg1);
				return;
			case 246:
				method8436(arg1);
				return;
			case 248:
				method8369(arg1);
				return;
			case 249:
				method10212(arg1);
				return;
			case 251:
				method14098(arg1);
				return;
			case 252:
				method5078(arg1);
				return;
			case 253:
				method9580(arg1);
				return;
			case 254:
				Statics.method9924(arg1);
				return;
			case 255:
				method5170(arg1);
				return;
			case 256:
				method5379(arg1);
				return;
			case 257:
				method3284(arg1);
				return;
			case 258:
				method14295(arg1);
				return;
			case 259:
				class672.method5951(arg1);
				return;
			case 260:
				method9468(arg1);
				return;
			case 261:
				method7605(arg1);
				return;
			case 262:
				method9306(arg1);
				return;
			case 263:
				Statics.method9191(arg1);
				return;
			case 264:
				method18727(arg1);
				return;
			case 265:
				method8896(arg1);
				return;
			case 266:
				method7346(arg1);
				return;
			case 267:
				method10255(arg1);
				return;
			case 268:
				method8322(arg1);
				return;
			case 269:
				method5098(arg1);
				return;
			case 270:
				method9453(arg1);
				return;
			case 271:
				Statics.method4839(arg1);
				return;
			case 272:
				method220(arg1);
				return;
			case 273:
				method16392(arg1);
				return;
			case 274:
				method5067(arg1);
				return;
			case 275:
				method5368(arg1);
				return;
			case 276:
				method4045(arg1);
				return;
			case 277:
				method4522(arg1);
				return;
			case 278:
				method4644(false, arg1);
				return;
			case 279:
				method10448(arg1);
				return;
			case 280:
				method15001(arg1);
				return;
			case 281:
				method16759(arg1);
				return;
			case 282:
				method4613(arg1);
				return;
			case 283:
				method15109(arg1);
				return;
			case 284:
				method5074(arg1);
				return;
			case 285:
				Statics.method930(arg1);
				return;
			case 286:
				TwitchCommands.method3121(arg1);
				return;
			case 287:
				method2100(arg1);
				return;
			case 288:
				method2097(arg1);
				return;
			case 289:
				method16463(arg1);
				return;
			case 290:
				method6130(arg1);
				return;
			case 291:
				method8978(arg1);
				return;
			case 292:
				method9550(arg1);
				return;
			case 293:
				method7373(arg1);
				return;
			case 294:
				method14932(arg1);
				return;
			case 295:
				method8689(arg1);
				return;
			case 296:
				method7712(arg1);
				return;
			case 297:
				method3106(arg1);
				return;
			case 298:
				method8396(arg1);
				return;
			case 299:
				method9232(arg1);
				return;
			case 300:
				method19264(arg1);
				return;
			case 301:
				method4599(arg1);
				return;
			case 302:
				class672.method4632(arg1);
				return;
			case 303:
				method3142(arg1);
				return;
			case 304:
				method4021(arg1);
				return;
			case 305:
				method17449(arg1);
				return;
			case 306:
				method10606(arg1);
				return;
			case 307:
				method8678(arg1);
				return;
			case 308:
				method221(arg1);
				return;
			case 309:
				method15171(arg1);
				return;
			case 310:
				method14047(arg1);
				return;
			case 311:
				class672.method2087(arg1);
				return;
			case 312:
				method5100(arg1);
				return;
			case 313:
				method1581(arg1);
				return;
			case 314:
				method309(arg1);
				return;
			case 315:
				class672.method5339(arg1);
				return;
			case 316:
				method1573(arg1);
				return;
			case 317:
				method5361(arg1);
				return;
			case 318:
				method4844(arg1);
				return;
			case 319:
				method7348(arg1);
				return;
			case 320:
				method5111(arg1);
				return;
			case 321:
				method5212(arg1);
				return;
			case 322:
				method4016(arg1);
				return;
			case 323:
				method7721(arg1);
				return;
			case 324:
				method10591(arg1);
				return;
			case 325:
				method17454(arg1);
				return;
			case 326:
				method6831(arg1);
				return;
			case 327:
				method9875(arg1);
				return;
			case 328:
				method10481(arg1);
				return;
			case 329:
				method6059(arg1);
				return;
			case 330:
				method14942(arg1);
				return;
			case 331:
				method8298(arg1);
				return;
			case 332:
				method5356(arg1);
				return;
			case 333:
				method10375(arg1);
				return;
			case 334:
				method2902(arg1);
				return;
			case 335:
				method9387(arg1);
				return;
			case 336:
				method9837(arg1);
				return;
			case 337:
				method10610(arg1);
				return;
			case 338:
				method10307(arg1);
				return;
			case 339:
				method16443(arg1);
				return;
			case 340:
				method6033(arg1);
				return;
			case 341:
				method9463(arg1);
				return;
			case 342:
				method4659(arg1);
				return;
			case 343:
				method7361(arg1);
				return;
			case 344:
				method9553(arg1);
				return;
			case 345:
				method6108(arg1);
				return;
			case 346:
				Statics.method8434(arg1);
				return;
			case 347:
				method3563(arg1);
				return;
			case 348:
				method6795(arg1);
				return;
			case 349:
				method2975(arg1);
				return;
			case 350:
				method6042(arg1);
				return;
			case 351:
				Statics.method9388(arg1);
				return;
			case 352:
				Statics.method4399(arg1);
				return;
			case 353:
				method5169(arg1);
				return;
			case 354:
				method8324(arg1);
				return;
			case 355:
				method6117(arg1);
				return;
			case 356:
				method14240(arg1);
				return;
			case 357:
				method7044(arg1);
				return;
			case 358:
				Statics.method10326(arg1);
				return;
			case 359:
				Statics.method3078(arg1);
				return;
			case 360:
				method3137(arg1);
				return;
			case 361:
				Statics.method3125(arg1);
				return;
			case 362:
				method18443(arg1);
				return;
			case 363:
				method3088(arg1);
				return;
			case 364:
				method5068(arg1);
				return;
			case 365:
				method4514(arg1);
				return;
			case 366:
				method4076(arg1);
				return;
			case 367:
				method18869(arg1);
				return;
			case 368:
				method18888(arg1);
				return;
			case 369:
				method3543(arg1);
				return;
			case 370:
				method6083(arg1);
				return;
			case 371:
				method17495(arg1);
				return;
			case 372:
				method9838(arg1);
				return;
			case 373:
				method18814(arg1);
				return;
			case 374:
				method2089(arg1);
				return;
			case 375:
				Statics.method17448(arg1);
				return;
			case 376:
				method9161(arg1);
				return;
			case 377:
				Statics.method14097(arg1);
				return;
			case 378:
				method844(arg1);
				return;
			case 379:
				method4421(arg1);
				return;
			case 380:
				method3031(arg1);
				return;
			case 381:
				method2734(arg1);
				return;
			case 382:
				method9824(arg1);
				return;
			case 383:
				method8153(arg1);
				return;
			case 384:
				method265(arg1);
				return;
			case 385:
				method6039(arg1);
				return;
			case 386:
				method7619(arg1);
				return;
			case 387:
				Statics.method8688(arg1);
				return;
			case 388:
				method16447(arg1);
				return;
			case 389:
				method2888(arg1);
				return;
			case 390:
				method3127(arg1);
				return;
			case 391:
				TwitchCommands.method3484(arg1);
				return;
			case 392:
				method15265(arg1);
				return;
			case 394:
				method724(arg1);
				return;
			case 395:
				method10447(arg1);
				return;
			case 396:
				method4388(arg1);
				return;
			case 397:
				method8445(arg1);
				return;
			case 398:
				method9871(arg1);
				return;
			case 399:
				method6875(arg1);
				return;
			case 400:
				method16909(arg1);
				return;
			case 401:
				method14934(arg1);
				return;
			case 402:
				Statics.method3281(arg1);
				return;
			case 403:
				Statics.method9210(arg1);
				return;
			case 404:
				method755(arg1);
				return;
			case 405:
				method10299(arg1);
				return;
			case 406:
				method2662(arg1);
				return;
			case 407:
				method15382(arg1);
				return;
			case 408:
				method14990(arg1);
				return;
			case 409:
				method2093(arg1);
				return;
			case 410:
				method4145(arg1);
				return;
			case 411:
				method6053(arg1);
				return;
			case 412:
				method10758(arg1);
				return;
			case 413:
				method3090(arg1);
				return;
			case 414:
				method15087(arg1);
				return;
			case 415:
				method13818(arg1);
				return;
			case 416:
				method9391(arg1);
				return;
			case 417:
				method3572(arg1);
				return;
			case 418:
				method9577(arg1);
				return;
			case 419:
				method17450(arg1);
				return;
			case 420:
				method9851(arg1);
				return;
			case 421:
				method133(arg1);
				return;
			case 422:
				Statics.method3138(arg1);
				return;
			case 423:
				method7343(arg1);
				return;
			case 424:
				method10096(arg1);
				return;
			case 425:
				method3595(arg1);
				return;
			case 426:
				Statics.method2013(arg1);
				return;
			case 427:
				method8154(arg1);
				return;
			case 428:
				method3126(arg1);
				return;
			case 429:
				method8444(arg1);
				return;
			case 430:
				Statics.method2996(arg1);
				return;
			case 431:
				method5242(arg1);
				return;
			case 432:
				Statics.method2761(arg1);
				return;
			case 433:
				method10325(arg1);
				return;
			case 434:
				method222(arg1);
				return;
			case 435:
				method17759(arg1);
				return;
			case 436:
				method4495(arg1);
				return;
			case 437:
				method229(arg1);
				return;
			case 438:
				method6102(arg1);
				return;
			case 439:
				method719(arg1);
				return;
			case 440:
				method4640(arg1);
				return;
			case 441:
				method16485(arg1);
				return;
			case 442:
				method5152(arg1);
				return;
			case 443:
				method2763(arg1);
				return;
			case 444:
				method5249(arg1);
				return;
			case 445:
				method8428(arg1);
				return;
			case 446:
				method3478(arg1);
				return;
			case 447:
				class672.method2860(arg1);
				return;
			case 448:
				method16901(arg1);
				return;
			case 449:
				method13879(arg1);
				return;
			case 450:
				method1591(arg1);
				return;
			case 451:
				method288(arg1);
				return;
			case 452:
				method4143(arg1);
				return;
			case 453:
				method8684(arg1);
				return;
			case 454:
				method15724(arg1);
				return;
			case 455:
				method4458(arg1);
				return;
			case 456:
				method14148(arg1);
				return;
			case 457:
				method10679(arg1);
				return;
			case 458:
				method5983(arg1);
				return;
			case 459:
				method4377(arg1);
				return;
			case 460:
				method3671(arg1);
				return;
			case 461:
				Statics.method8916(arg1);
				return;
			case 462:
				method5245(arg1);
				return;
			case 463:
				method1585(arg1);
				return;
			case 464:
				method16911(arg1);
				return;
			case 465:
				Statics.method3585(arg1);
				return;
			case 466:
				method9604(arg1);
				return;
			case 467:
				method9400(arg1);
				return;
			case 468:
				method989(arg1);
				return;
			case 469:
				method9286(arg1);
				return;
			case 470:
				method9249(arg1);
				return;
			case 471:
				method6982(arg1);
				return;
			case 472:
				method6057(arg1);
				return;
			case 473:
				method6062(arg1);
				return;
			case 474:
				Statics.method3024(arg1);
				return;
			case 475:
				method17364(arg1);
				return;
			case 476:
				method9207(arg1);
				return;
			case 477:
				method4412(arg1);
				return;
			case 478:
				method7131(arg1);
				return;
			case 479:
				method8196(arg1);
				return;
			case 480:
				method5949(arg1);
				return;
			case 481:
				method992(arg1);
				return;
			case 482:
				method6124(arg1);
				return;
			case 483:
				Statics.method7894(arg1);
				return;
			case 484:
				method16458(arg1);
				return;
			case 485:
				method7329(arg1);
				return;
			case 486:
				method8642(arg1);
				return;
			case 487:
				method3672(arg1);
				return;
			case 488:
				method7718(arg1);
				return;
			case 489:
				method14268(arg1);
				return;
			case 490:
				method7224(false, arg1);
				return;
			case 491:
				method1621(arg1);
				return;
			case 492:
				method4884(arg1);
				return;
			case 493:
				method18617(arg1);
				return;
			case 494:
				method4639(arg1);
				return;
			case 495:
				method3465(arg1);
				return;
			case 496:
				TwitchCommands.method10607(arg1);
				return;
			case 497:
				Statics.method14453(arg1);
				return;
			case 498:
				method17721(arg1);
				return;
			case 499:
				Statics.method4620(arg1);
				return;
			case 500:
				method14043(arg1);
				return;
			case 501:
				method7042(arg1);
				return;
			case 502:
				method5214(arg1);
				return;
			case 503:
				method6126(arg1);
				return;
			case 504:
				method9174(arg1);
				return;
			case 505:
				method9555(arg1);
				return;
			case 506:
				method3918(arg1);
				return;
			case 507:
				method10336(arg1);
				return;
			case 508:
				method10231(arg1);
				return;
			case 509:
				method15040(arg1);
				return;
			case 510:
				method9309(arg1);
				return;
			case 511:
				method2042(arg1);
				return;
			case 512:
				method1518(arg1);
				return;
			case 513:
				method2112(arg1);
				return;
			case 514:
				method7366(arg1);
				return;
			case 515:
				method3089(arg1);
				return;
			case 516:
				method482(arg1);
				return;
			case 517:
				method4569(arg1);
				return;
			case 518:
				Statics.method5947(arg1);
				return;
			case 519:
				method4058(arg1);
				return;
			case 520:
				method7229(arg1);
				return;
			case 521:
				method6111(arg1);
				return;
			case 522:
				Statics.method1899(arg1);
				return;
			case 523:
				method18863(arg1);
				return;
			case 524:
				method7070(arg1);
				return;
			case 525:
				Statics.method1929(arg1);
				return;
			case 526:
				method10319(arg1);
				return;
			case 527:
				method2735(arg1);
				return;
			case 528:
				Statics.method8893(arg1);
				return;
			case 529:
				method4274(arg1, true);
				return;
			case 530:
				method5211(arg1);
				return;
			case 531:
				method4274(arg1, false);
				return;
			case 532:
				TwitchCommands.method8231(arg1);
				return;
			case 533:
				method7358(arg1);
				return;
			case 534:
				method7334(arg1);
				return;
			case 535:
				method4523(arg1);
				return;
			case 536:
				method10565(arg1);
				return;
			case 537:
				method475(arg1);
				return;
			case 538:
				method3105(arg1);
				return;
			case 539:
				method4657(arg1);
				return;
			case 540:
				method5363(arg1);
				return;
			case 541:
				Statics.method8911(arg1);
				return;
			case 542:
				method610(arg1);
				return;
			case 543:
				method4401(arg1);
				return;
			case 544:
				method18181(arg1);
				return;
			case 545:
				method17802(arg1);
				return;
			case 546:
				method8914(arg1);
				return;
			case 547:
				method831(arg1);
				return;
			case 548:
				Statics.method2760(arg1);
				return;
			case 549:
				method6063(arg1);
				return;
			case 550:
				Statics.method2965(arg1);
				return;
			case 551:
				TwitchCommands.method266(arg1);
				return;
			case 552:
				method4376(arg1);
				return;
			case 553:
				method3041(arg1);
				return;
			case 554:
				method3575(arg1);
				return;
			case 555:
				method3021(arg1);
				return;
			case 556:
				method14593(arg1);
				return;
			case 557:
				method17603(arg1);
				return;
			case 558:
				method9303(arg1);
				return;
			case 559:
				method2964(arg1);
				return;
			case 560:
				method19200(arg1);
				return;
			case 561:
				method1922(arg1);
				return;
			case 562:
				method7303(arg1);
				return;
			case 563:
				method5141(arg1);
				return;
			case 564:
				method7289(arg1);
				return;
			case 565:
				method9215(arg1);
				return;
			case 566:
				method3617(arg1);
				return;
			case 567:
				method3467(arg1);
				return;
			case 568:
				method3622(arg1);
				return;
			case 569:
				method2908(arg1);
				return;
			case 570:
				method9412(arg1);
				return;
			case 571:
				method6850(arg1);
				return;
			case 572:
				method537(arg1);
				return;
			case 573:
				method1623(arg1);
				return;
			case 574:
				method4663(arg1);
				return;
			case 575:
				method219(arg1);
				return;
			case 576:
				method4520(arg1);
				return;
			case 577:
				TwitchCommands.method289(arg1);
				return;
			case 578:
				method8500(arg1);
				return;
			case 579:
				method9200(arg1);
				return;
			case 580:
				Statics.method13988(arg1);
				return;
			case 581:
				method7885(arg1);
				return;
			case 582:
				TwitchCommands.method4047(arg1);
				return;
			case 583:
				method8656(arg1);
				return;
			case 584:
				method720(arg1);
				return;
			case 585:
				method5385(arg1);
				return;
			case 586:
				method10612(arg1);
				return;
			case 587:
				method4644(true, arg1);
				return;
			case 588:
				method10368(arg1);
				return;
			case 589:
				method18151(arg1);
				return;
			case 590:
				method15019(arg1);
				return;
			case 591:
				method5923(arg1);
				return;
			case 592:
				method4662(arg1);
				return;
			case 593:
				method9572(arg1, true);
				return;
			case 594:
				method4619(arg1);
				return;
			case 595:
				method4981(arg1);
				return;
			case 596:
				Statics.method10452(arg1);
				return;
			case 597:
				method6974(arg1);
				return;
			case 598:
				method718(arg1);
				return;
			case 599:
				method7226(arg1);
				return;
			case 600:
				Statics.method7351(arg1);
				return;
			case 601:
				method8497(arg1);
				return;
			case 602:
				method8019(arg1);
				return;
			case 603:
				method6792(arg1);
				return;
			case 604:
				method7322(arg1);
				return;
			case 605:
				method16453(arg1);
				return;
			case 606:
				method3092(arg1);
				return;
			case 607:
				method7240(arg1);
				return;
			case 608:
				method5130(arg1);
				return;
			case 609:
				method9622(arg1);
				return;
			case 610:
				TwitchCommands.method147(arg1);
				return;
			case 611:
				method4043(arg1);
				return;
			case 612:
				method5997(arg1);
				return;
			case 613:
				TwitchCommands.method287(arg1);
				return;
			case 614:
				Statics.method7302(arg1);
				return;
			case 615:
				method4129(arg1);
				return;
			case 616:
				method7006(arg1);
				return;
			case 617:
				method10346(arg1);
				return;
			case 618:
				method3590(arg1);
				return;
			case 619:
				method4615(arg1);
				return;
			case 620:
				method2740(arg1);
				return;
			case 621:
				Statics.method7625(arg1);
				return;
			case 622:
				method1514(arg1);
				return;
			case 623:
				method2963(arg1);
				return;
			case 624:
				method5112(arg1);
				return;
			case 625:
				method9860(arg1);
				return;
			case 626:
				method15144(arg1);
				return;
			case 627:
				class672.method17723(arg1);
				return;
			case 628:
				method7094(arg1);
				return;
			case 629:
				method13991(arg1);
				return;
			case 630:
				method9184(arg1);
				return;
			case 631:
				method14943(arg1);
				return;
			case 632:
				method8278(arg1);
				return;
			case 633:
				method2882(arg1);
				return;
			case 634:
				method264(arg1);
				return;
			case 635:
				method8018(arg1);
				return;
			case 636:
				method5392(arg1);
				return;
			case 637:
				method6832(arg1);
				return;
			case 638:
				method4609(arg1);
				return;
			case 639:
				method3050(arg1);
				return;
			case 640:
				method13851(arg1);
				return;
			case 641:
				method3485(arg1);
				return;
			case 642:
				method19194(arg1);
				return;
			case 643:
				method10357(arg1);
				return;
			case 644:
				method574(arg1);
				return;
			case 645:
				method14150(arg1);
				return;
			case 646:
				method14456(arg1);
				return;
			case 647:
				method5064(arg1);
				return;
			case 648:
				method15003(arg1);
				return;
			case 649:
				method13944(arg1);
				return;
			case 650:
				method4060(arg1);
				return;
			case 651:
				method1572(arg1);
				return;
			case 652:
				Statics.method7273(arg1);
				return;
			case 653:
				method9859(arg1);
				return;
			case 654:
				method16716(arg1);
				return;
			case 655:
				method8325(arg1);
				return;
			case 656:
				method4392(arg1);
				return;
			case 657:
				method4840(arg1);
				return;
			case 658:
				method7473(arg1);
				return;
			case 659:
				method1562(arg1);
				return;
			case 660:
				class672.method5858(arg1);
				return;
			case 661:
				method18530(arg1);
				return;
			case 662:
				method3099(arg1);
				return;
			case 663:
				method14576(arg1);
				return;
			case 664:
				method9772(arg1);
				return;
			case 665:
				method6120(arg1);
				return;
			case 666:
				method754(arg1);
				return;
			case 667:
				method10206(arg1);
				return;
			case 668:
				method5069(arg1);
				return;
			case 669:
				method4460(arg1);
				return;
			case 670:
				method6065(arg1);
				return;
			case 671:
				method9556(arg1);
				return;
			case 672:
				method3087(arg1);
				return;
			case 673:
				method9887(arg1);
				return;
			case 674:
				Statics.method9196(arg1);
				return;
			case 675:
				method3477(arg1);
				return;
			case 676:
				method3586(arg1);
				return;
			case 677:
				method2581(arg1);
				return;
			case 678:
				method7246(arg1);
				return;
			case 679:
				method9551(arg1);
				return;
			case 680:
				method4842(arg1);
				return;
			case 681:
				method8397(arg1);
				return;
			case 682:
				method16439(arg1);
				return;
			case 683:
				method6818(arg1);
				return;
			case 684:
				method4298(arg1);
				return;
			case 685:
				method5896(arg1);
				return;
			case 686:
				method4517(arg1);
				return;
			case 687:
				method9229(arg1);
				return;
			case 688:
				method7352(arg1);
				return;
			case 689:
				method6119(arg1);
				return;
			case 690:
				method10110(arg1);
				return;
			case 691:
				method8478(arg1);
				return;
			case 692:
				method10300(arg1);
				return;
			case 693:
				method7364(arg1);
				return;
			case 694:
				method18918(arg1);
				return;
			case 695:
				method3537(arg1);
				return;
			case 696:
				method3550(arg1);
				return;
			case 697:
				method5073(arg1);
				return;
			case 698:
				method7095(arg1);
				return;
			case 699:
				Statics.method7707(arg1);
				return;
			case 700:
				method5071(arg1);
				return;
			case 701:
				method8491(arg1);
				return;
			case 702:
				method17722(arg1);
				return;
			case 703:
				method5213(arg1);
				return;
			case 704:
				Statics.method10148(arg1);
				return;
			case 705:
				method9455(arg1);
				return;
			case 706:
				method3023(arg1);
				return;
			case 707:
				method10364(arg1);
				return;
			case 708:
				method2863(arg1);
				return;
			case 709:
				method9609(arg1);
				return;
			case 710:
				method10611(arg1);
				return;
			case 711:
				method9428(arg1);
				return;
			case 712:
				method14925(arg1);
				return;
			case 713:
				method7311(arg1);
				return;
			case 714:
				method959(arg1);
				return;
			case 715:
				method3378(arg1);
				return;
			case 716:
				method5929(arg1);
				return;
			case 717:
				method10449(arg1);
				return;
			case 718:
				method2580(arg1);
				return;
			case 719:
				Statics.method18661(arg1);
				return;
			case 720:
				method4295(arg1);
				return;
			case 721:
				Statics.method8475(arg1);
				return;
			case 722:
				method9386(arg1);
				return;
			case 723:
				method6981(arg1);
				return;
			case 724:
				method3935(arg1);
				return;
			case 725:
				method3651(arg1);
				return;
			case 726:
				method6104(arg1);
				return;
			case 727:
				method10757(arg1);
				return;
			case 728:
				method1059(arg1);
				return;
			case 729:
				method4479(arg1);
				return;
			case 730:
				method18928(arg1);
				return;
			case 731:
				method5374(arg1);
				return;
			case 732:
				method3920(arg1);
				return;
			case 733:
				method18150(arg1);
				return;
			case 734:
				Statics.method7117(arg1);
				return;
			case 735:
				method4521(arg1);
				return;
			case 736:
				method5063(arg1);
				return;
			case 737:
				method608(arg1);
				return;
			case 738:
				method1021(arg1);
				return;
			case 739:
				method9187(arg1);
				return;
			case 740:
				TwitchCommands.method3673(arg1);
				return;
			case 741:
				method7883(arg1);
				return;
			case 742:
				method4917(arg1);
				return;
			case 743:
				TwitchCommands.method4487(arg1);
				return;
			case 744:
				method4606(arg1);
				return;
			case 745:
				method2091(arg1);
				return;
			case 746:
				method3059(arg1);
				return;
			case 747:
				method13840(arg1);
				return;
			case 748:
				Statics.method13881(arg1);
				return;
			case 749:
				method6067(arg1);
				return;
			case 750:
				method4459(arg1);
				return;
			case 751:
				method6131(arg1);
				return;
			case 752:
				method2792(arg1);
				return;
			case 753:
				Statics.method6127(arg1);
				return;
			case 754:
				method9082(arg1);
				return;
			case 755:
				method4524(arg1);
				return;
			case 756:
				method5847(arg1);
				return;
			case 757:
				method3029(arg1);
				return;
			case 758:
				method10207(arg1);
				return;
			case 759:
				method9206(arg1);
				return;
			case 760:
				method16454(arg1);
				return;
			case 761:
				Statics.method474(arg1);
				return;
			case 762:
				method9193(arg1);
				return;
			case 763:
				method9602(arg1);
				return;
			case 764:
				method3608(arg1);
				return;
			case 765:
				method9427(arg1);
				return;
			case 766:
				Statics.method7272(arg1);
				return;
			case 767:
				method8399(arg1);
				return;
			case 768:
				method1921(arg1);
				return;
			case 769:
				method9738(arg1);
				return;
			case 770:
				method893(arg1);
				return;
			case 771:
				method2910(arg1);
				return;
			case 772:
				method9458(arg1);
				return;
			case 773:
				method5129(arg1);
				return;
			case 774:
				Statics.method9823(arg1);
				return;
			case 775:
				method5327(arg1);
				return;
			case 776:
				method16760(arg1);
				return;
			case 777:
				method5398(arg1);
				return;
			case 778:
				method843(arg1);
				return;
			case 779:
				method10617(arg1);
				return;
			case 780:
				method9406(arg1);
				return;
			case 781:
				method3649(arg1);
				return;
			case 782:
				Statics.method16412(arg1);
				return;
			case 783:
				method8342(arg1);
				return;
			case 784:
				method17434(arg1);
				return;
			case 785:
				method19263(arg1);
				return;
			case 786:
				method9755(arg1);
				return;
			case 787:
				method1595(arg1);
				return;
			case 788:
				method8357(arg1);
				return;
			case 789:
				method8379(arg1);
				return;
			case 790:
				method9005(arg1);
				return;
			case 791:
				method6041(arg1);
				return;
			case 792:
				method3464(arg1);
				return;
			case 793:
				Statics.method16461(arg1);
				return;
			case 794:
				method9459(arg1);
				return;
			case 795:
				method5940(arg1);
				return;
			case 796:
				method13849(arg1);
				return;
			case 797:
				method324(arg1);
				return;
			case 798:
				method974(arg1);
				return;
			case 799:
				method5348(arg1);
				return;
			case 800:
				Statics.method4080(arg1);
				return;
			case 801:
				method10454(arg1);
				return;
			case 802:
				method7884(arg1);
				return;
			case 803:
				method257(arg1);
				return;
			case 804:
				method4504(arg1);
				return;
			case 805:
				method4503(arg1);
				return;
			case 806:
				method2855(arg1);
				return;
			case 807:
				method8435(arg1);
				return;
			case 808:
				method17750(arg1);
				return;
			case 809:
				method10605(arg1);
				return;
			case 810:
				method9185(arg1);
				return;
			case 811:
				method6976(arg1);
				return;
			case 812:
				method4061(arg1);
				return;
			case 813:
				method18683(arg1);
				return;
			case 814:
				method9870(arg1);
				return;
			case 815:
				method2907(arg1);
				return;
			case 816:
				method8446(arg1);
				return;
			case 817:
				class672.method4478(arg1);
				return;
			case 818:
				method9414(arg1);
				return;
			case 819:
				method1928(arg1);
				return;
			case 820:
				method5982(arg1);
				return;
			case 821:
				method9422(arg1);
				return;
			case 822:
				method854(arg1);
				return;
			case 823:
				method211(arg1);
				return;
			case 824:
				method10318(arg1);
				return;
			case 825:
				method8339(arg1);
				return;
			case 826:
				method9741(arg1);
				return;
			case 827:
				method8976(arg1);
				return;
			case 828:
				method4334(arg1);
				return;
			case 829:
				TwitchCommands.method6011(arg1);
				return;
			case 830:
				method6794(arg1);
				return;
			case 831:
				method7073(arg1);
				return;
			case 832:
				method18831(arg1);
				return;
			case 833:
				method9758(arg1);
				return;
			case 834:
				method5938(arg1);
				return;
			case 835:
				method4645(arg1);
				return;
			case 836:
				method7115(arg1);
				return;
			case 837:
				TwitchCommands.method10061(arg1);
				return;
			case 838:
				method6808(arg1);
				return;
			case 839:
				class672.method9190(arg1);
				return;
			case 840:
				method4500(arg1);
				return;
			case 841:
				method137(arg1);
				return;
			case 842:
				method1895(arg1);
				return;
			case 843:
				method9307(arg1);
				return;
			case 844:
				method6112(arg1);
				return;
			case 845:
				method3005(arg1);
				return;
			case 846:
				method8230(arg1);
				return;
			case 847:
				method9572(arg1, false);
				return;
			case 848:
				method5079(arg1);
				return;
			case 849:
				Statics.method8372(arg1);
				return;
			case 850:
				method809(arg1);
				return;
			case 851:
				method2110(arg1);
				return;
			case 852:
				method1974(arg1);
				return;
			case 853:
				method18693(arg1);
				return;
			case 854:
				method7330(arg1);
				return;
			case 855:
				method16612(arg1);
				return;
			case 856:
				method9234(arg1);
				return;
			case 857:
				Statics.method5948(arg1);
				return;
			case 858:
				method651(arg1);
				return;
			case 859:
				method6021(arg1);
				return;
			case 860:
				method5386(arg1);
				return;
			case 861:
				method4139(arg1);
				return;
			case 862:
				method14993(arg1);
				return;
			case 863:
				Statics.method9842(arg1);
				return;
			case 864:
				method3476(arg1);
				return;
			case 865:
				method7324(arg1);
				return;
			case 866:
				method14035(arg1);
				return;
			case 867:
				class672.method1004(arg1);
				return;
			case 868:
				method18830(arg1);
				return;
			case 869:
				class646.add(arg1, (short) -32146);
				return;
			case 870:
				method8155(arg1);
				return;
			case 871:
				method4985(arg1);
				return;
			case 872:
				method815(arg1);
				return;
			case 873:
				method9515(arg1);
				return;
			case 874:
				method6061(arg1);
				return;
			case 875:
				Statics.method7344(arg1);
				return;
			case 876:
				method9461(arg1);
				return;
			case 877:
				method16756(arg1);
				return;
			case 878:
				method8195(arg1);
				return;
			case 879:
				Statics.method8353(arg1);
				return;
			case 880:
				method3553(arg1);
				return;
			case 881:
				method5113(arg1);
				return;
			case 882:
				method5176(arg1);
				return;
			case 883:
				method259(arg1);
				return;
			case 884:
				method10296(arg1);
				return;
			case 885:
				method17751(arg1);
				return;
			case 886:
				Statics.method5248(arg1);
				return;
			case 887:
				method4372(arg1);
				return;
			case 888:
				method4294(arg1);
				return;
			case 889:
				method9888(arg1);
				return;
			case 890:
				method8979(arg1);
				return;
			case 891:
				method5215(arg1);
				return;
			case 892:
				method4402(arg1);
				return;
			case 893:
				Statics.method15157(arg1);
				return;
			case 894:
				Statics.method10232(arg1);
				return;
			case 895:
				method721(arg1);
				return;
			case 896:
				method9188(arg1);
				return;
			case 897:
				method3618(arg1);
				return;
			case 898:
				method4144(arg1);
				return;
			case 899:
				method4925(arg1);
				return;
			case 900:
				method4652(arg1);
				return;
			case 901:
				method16449(arg1);
				return;
			case 902:
				class672.method3069(arg1);
				return;
			case 903:
				method3472(arg1);
				return;
			case 904:
				method13998(arg1);
				return;
			case 905:
				method2795(arg1);
				return;
			case 906:
				method8685(arg1);
				return;
			case 907:
				method5952(arg1);
				return;
			case 908:
				method9792(arg1);
				return;
			case 909:
				method4297(arg1);
				return;
			case 910:
				method3091(arg1);
				return;
			case 911:
				method9464(arg1);
				return;
			case 912:
				method924(arg1);
				return;
			case 913:
				method8915(arg1);
				return;
			case 914:
				method5252(arg1);
				return;
			case 915:
				method4617(arg1);
				return;
			case 916:
				method10443(arg1);
				return;
			case 917:
				method9581(arg1);
				return;
			case 918:
				method9180(arg1);
				return;
			case 919:
				method256(arg1);
				return;
			case 920:
				Statics.method5146(arg1);
				return;
			case 921:
				method7093(arg1);
				return;
			case 922:
				method15234(arg1);
				return;
			case 923:
				method7328(arg1);
				return;
			case 924:
				method15070(arg1);
				return;
			case 925:
				method10100(arg1);
				return;
			case 926:
				method322(arg1);
				return;
			case 927:
				method5998(arg1);
				return;
			case 928:
				method3007(arg1);
				return;
			case 929:
				method136(arg1);
				return;
			case 930:
				method14691(arg1);
				return;
			case 931:
				method4601(arg1);
				return;
			case 932:
				method18855(arg1);
				return;
			case 933:
				method6032(arg1);
				return;
			case 934:
				method2994(arg1);
				return;
			case 935:
				method8201(arg1);
				return;
			case 936:
				TwitchCommands.method7880(arg1);
				return;
			case 937:
				method7974(arg1);
				return;
			case 938:
				method7074(arg1);
				return;
			case 939:
				method3101(arg1);
				return;
			case 940:
				method5381(arg1);
				return;
			case 941:
				method7349(arg1);
				return;
			case 942:
				class672.method9841(arg1);
				return;
			case 943:
				method17808(arg1);
				return;
			case 944:
				method708(arg1);
				return;
			case 945:
				method5979(arg1, true, false);
				return;
			case 946:
				method1622(arg1);
				return;
			case 947:
				method10256(arg1);
				return;
			case 948:
				method14050(arg1);
				return;
			case 949:
				Statics.method9893(arg1);
				return;
			case 950:
				method3104(arg1);
				return;
			case 951:
				method10363(arg1);
				return;
			case 952:
				method17804(arg1);
				return;
			case 953:
				method232(arg1);
				return;
			case 954:
				method6983(arg1);
				return;
			case 955:
				Statics.method10109(arg1);
				return;
			case 956:
				method5937(arg1);
				return;
			case 957:
				method5406(arg1);
				return;
			case 958:
				method9416(arg1);
				return;
			case 959:
				method9197(arg1);
				return;
			case 960:
				method10205(arg1);
				return;
			case 961:
				method4333(arg1);
				return;
			case 962:
				method7315(arg1);
				return;
			case 963:
				method8429(arg1);
				return;
			case 964:
				method4128(arg1);
				return;
			case 965:
				method7626(arg1);
				return;
			case 966:
				method8022(arg1);
				return;
			case 967:
				method16757(arg1);
				return;
			case 968:
				method553(arg1);
				return;
			case 969:
				method847(arg1);
				return;
			case 970:
				method9048(arg1);
				return;
			case 971:
				method9129(arg1);
				return;
			case 972:
				method9020(arg1);
				return;
			case 973:
				method15030(arg1);
				return;
			case 974:
				method4841(arg1);
				return;
			case 975:
				Statics.method2864(arg1);
				return;
			case 976:
				method10097(arg1);
				return;
			case 977:
				method1894(arg1);
				return;
			case 978:
				method7261(arg1);
				return;
			case 979:
				method6054(arg1);
				return;
			case 980:
				method9216(arg1);
				return;
			case 981:
				method15226(arg1);
				return;
			case 982:
				method14991(arg1);
				return;
			case 983:
				method17809(arg1);
				return;
			case 984:
				method3911(arg1);
				return;
			case 985:
				method4611(arg1);
				return;
			case 986:
				Statics.method5012(arg1);
				return;
			case 987:
				method892(arg1);
				return;
			case 988:
				method17803(arg1);
				return;
			case 989:
				method6830(arg1);
				return;
			case 990:
				method8320(arg1);
				return;
			case 991:
				Statics.method8477(arg1);
				return;
			case 992:
				method2819(arg1);
				return;
			case 993:
				method8426(arg1);
				return;
			case 994:
				method14634(arg1);
				return;
			case 995:
				method6790(arg1);
				return;
			case 996:
				method5996(arg1);
				return;
			case 997:
				method16863(arg1);
				return;
			case 998:
				Statics.method3063(arg1);
				return;
			case 999:
				method9003(arg1);
				return;
			case 1000:
				method10327(arg1);
				return;
			case 1001:
				method4612(arg1);
				return;
			case 1002:
				method5984(arg1);
				return;
			case 1003:
				method9162(arg1);
				return;
			case 1004:
				method9873(arg1);
				return;
			case 1005:
				method7975(arg1);
				return;
			case 1006:
				method7260(arg1);
				return;
			case 1007:
				Statics.method9617(arg1);
				return;
			case 1008:
				method13982(arg1);
				return;
			case 1009:
				method9243(arg1);
				return;
			case 1010:
				method3365(arg1);
				return;
			case 1011:
				method9822(arg1);
				return;
			case 1012:
				method4066(arg1);
				return;
			case 1013:
				method18960(arg1);
				return;
			case 1014:
				Statics.method5128(arg1);
				return;
			case 1015:
				method9828(arg1);
				return;
			case 1016:
				method9460(arg1);
				return;
			case 1017:
				method8343(arg1);
				return;
			case 1018:
				method3022(arg1);
				return;
			case 1019:
				method16656(arg1);
				return;
			case 1020:
				method13847(arg1);
				return;
			case 1021:
				method7935(arg1);
				return;
			case 1022:
				method16753(arg1);
				return;
			case 1023:
				method10098(arg1);
				return;
			case 1024:
				method4505(arg1);
				return;
			case 1025:
				method14754(arg1);
				return;
			case 1026:
				method5980(arg1);
				return;
			case 1027:
				method3616(arg1);
				return;
			case 1028:
				TwitchCommands.method8427(arg1);
				return;
			case 1029:
				method3103(arg1);
				return;
			case 1030:
				method8340(arg1);
				return;
			case 1031:
				TwitchCommands.method3257(arg1);
				return;
			case 1032:
				method3473(arg1);
				return;
			case 1033:
				method973(arg1);
				return;
			case 1034:
				method650(arg1);
				return;
			case 1035:
				method4618(arg1);
				return;
			case 1036:
				method5971(arg1);
				return;
			case 1037:
				method2911(arg1);
				return;
			case 1038:
				method1019(arg1);
				return;
			case 1039:
				method9410(arg1);
				return;
			case 1040:
				method850(arg1);
				return;
			case 1041:
				method3659(arg1);
				return;
			case 1042:
				method4391(arg1);
				return;
			case 1043:
				method10520(arg1);
				return;
			case 1044:
				method10590(arg1);
				return;
			case 1045:
				method5985(arg1);
				return;
			case 1046:
				method3576(arg1);
				return;
			case 1047:
				method2838(arg1);
				return;
			case 1048:
				method15039(arg1);
				return;
			case 1049:
				Statics.method8883(arg1);
				return;
			case 1050:
				method8690(arg1);
				return;
			case 1051:
				method1896(arg1);
				return;
			case 1052:
				method6110(arg1);
				return;
			case 1053:
				method4403(arg1);
				return;
			case 1054:
				Statics.method7477(arg1);
				return;
			case 1055:
				class672.method616(arg1);
				return;
			case 1056:
				Statics.method7936(arg1);
				return;
			case 1057:
				method7331(arg1);
				return;
			case 1058:
				Statics.method8277(arg1);
				return;
			case 1059:
				method16446(arg1);
				return;
			case 1060:
				method6116(arg1);
				return;
			case 1061:
				method14481(arg1);
				return;
			case 1062:
				method18417(arg1);
				return;
			case 1063:
				method1973(arg1);
				return;
			case 1064:
				method5936(arg1);
				return;
			case 1065:
				method6074(arg1);
				return;
			case 1066:
				method6034(arg1);
				return;
			case 1067:
				Statics.method2909(arg1);
				return;
			case 1068:
				method4424(arg1);
				return;
			case 1069:
				method5347(arg1);
				return;
			case 1070:
				Statics.method7305(arg1);
				return;
			case 1071:
				method1644(arg1);
				return;
			case 1072:
				method970(arg1);
				return;
			case 1073:
				method4017(arg1);
				return;
			case 1074:
				method9754(arg1);
				return;
			case 1075:
				method2102(arg1);
				return;
			case 1076:
				method3086(arg1);
				return;
			case 1077:
				method308(arg1);
				return;
			case 1078:
				method6113(arg1);
				return;
			case 1079:
				method18261(arg1);
				return;
			case 1080:
				Statics.method10060(arg1);
				return;
			case 1081:
				method1519(arg1);
				return;
			case 1082:
				Statics.method7225(arg1);
				return;
			case 1083:
				class672.method2861(arg1);
				return;
			case 1084:
				method6869(arg1);
				return;
			case 1085:
				method13837(arg1);
				return;
			case 1086:
				method15725(arg1);
				return;
			case 1087:
				method5014(arg1);
				return;
			case 1088:
				method8912(arg1);
				return;
			case 1089:
				method668(arg1);
				return;
			case 1090:
				method4518(arg1);
				return;
			case 1091:
				method483(arg1);
				return;
			case 1092:
				method1596(arg1);
				return;
			case 1093:
				Statics.method747(arg1);
				return;
			case 1094:
				method4018(arg1);
				return;
			case 1095:
				method1602(arg1);
				return;
			case 1096:
				method7913(arg1);
				return;
			case 1097:
				method6122(arg1);
				return;
			case 1098:
				method7973(arg1);
				return;
			case 1099:
				method16713(arg1);
				return;
			case 1100:
				method16660(arg1);
				return;
			case 1101:
				method3650(arg1);
				return;
			case 1102:
				method5941(arg1);
				return;
			case 1103:
				method9237(arg1);
				return;
			case 1104:
				method4380(arg1);
				return;
			case 1105:
				method6868(arg1);
				return;
			case 1106:
				method5244(arg1);
				return;
			case 1107:
				method3255(arg1);
				return;
			case 1108:
				method212(arg1);
				return;
			case 1109:
				method10571(arg1);
				return;
			case 1110:
				method17451(arg1);
				return;
			case 1111:
				method10190(arg1);
				return;
			case 1112:
				method7362(arg1);
				return;
			case 1113:
				method145(arg1);
				return;
			case 1114:
				method14613(arg1);
				return;
			case 1115:
				Statics.method7891(arg1);
				return;
			case 1116:
				method6066(arg1);
				return;
			case 1117:
				method3569(arg1);
				return;
			case 1118:
				method3599(arg1);
				return;
			case 1119:
				Statics.method555(arg1);
				return;
			case 1120:
				method9209(arg1);
				return;
			case 1121:
				method4940(arg1);
				return;
			case 1122:
				method3593(arg1);
				return;
			case 1123:
				method16908(arg1);
				return;
			case 1124:
				method2583(arg1);
				return;
			case 1125:
				method851(arg1);
				return;
			case 1126:
				method9608(arg1);
				return;
			case 1127:
				method4271(arg1);
				return;
			case 1128:
				TwitchCommands.method5894(arg1);
				return;
			case 1129:
				method8395(arg1);
				return;
			case 1130:
				method8006(arg1);
				return;
			case 1131:
				method8676(arg1);
				return;
			case 1132:
				method18684(arg1);
				return;
			case 1133:
				method1060(arg1);
				return;
			case 1134:
				method8297(arg1);
				return;
			case 1135:
				method134(arg1);
				return;
			case 1136:
				method3140(arg1);
				return;
			case 1137:
				Statics.method10252(arg1);
				return;
			case 1138:
				method6867(arg1);
				return;
			case 1139:
				method8323(arg1);
				return;
			case 1140:
				TwitchCommands.method4368(arg1);
				return;
			case 1141:
				method646(arg1);
				return;
			case 1142:
				Statics.method808(arg1);
				return;
			case 1143:
				method5132(arg1);
				return;
			case 1144:
				return;
			case 1145:
				method16670(arg1);
				return;
			case 1146:
				Statics.method4979(arg1);
				return;
			case 1147:
				method9285(arg1);
				return;
			case 1148:
				method3548(arg1);
				return;
			case 1149:
				method4044(arg1);
				return;
			case 1150:
				class672.method2794(arg1);
				return;
			case 1151:
				Statics.method16745(arg1);
				return;
			case 1152:
				method4993(arg1);
				return;
			case 1153:
				method3122(arg1);
				return;
			case 1154:
				method6826(arg1);
				return;
			case 1155:
				method14951(arg1);
				return;
			case 1156:
				method2049(arg1);
				return;
			case 1157:
				TwitchCommands.method10369(arg1);
				return;
			case 1158:
				Statics.method17524(arg1);
				return;
			case 1159:
				method5373(arg1);
				return;
			case 1160:
				method10099(arg1);
				return;
			case 1161:
				method2770(arg1);
				return;
			case 1162:
				Statics.method9462(arg1);
				return;
			case 1163:
				method7317(arg1);
				return;
			case 1164:
				method5246(arg1);
				return;
			case 1165:
				Statics.method576(arg1);
				return;
			case 1166:
				method484(arg1);
				return;
			case 1167:
				method16441(arg1);
				return;
			case 1168:
				method6128(arg1);
				return;
			case 1169:
				method5203(arg1);
				return;
			case 1170:
				method925(arg1);
				return;
			case 1171:
				method3372(arg1);
				return;
			case 1172:
				method8021(arg1);
				return;
			case 1173:
				method16744(arg1);
				return;
			case 1174:
				method10145(arg1);
				return;
			case 1175:
				method9192(arg1);
				return;
			case 1176:
				method230(arg1);
				return;
			case 1177:
				method9740(arg1);
				return;
			case 1178:
				method4051(arg1);
				return;
			case 1179:
				method17810(arg1);
				return;
			case 1180:
				method3102(arg1);
				return;
			case 1181:
				Statics.method17731(arg1);
				return;
			case 1182:
				method8659(arg1);
				return;
			case 1183:
				method5328(arg1);
				return;
			case 1184:
				class672.method988(arg1);
				return;
			case 1185:
				method9631(arg1);
				return;
			case 1186:
				Statics.method9392(arg1);
				return;
			case 1187:
				method10374(arg1);
				return;
			case 1188:
				Statics.method6825(arg1);
				return;
			case 1189:
				method5145(arg1);
				return;
			case 1190:
				method3564(arg1);
				return;
			case 1191:
				method5893(arg1);
				return;
			case 1192:
				method9402(arg1);
				return;
			case 1193:
				method8633(arg1);
				return;
			case 1194:
				method2736(arg1);
				return;
			case 1195:
				method4410(arg1);
				return;
			case 1196:
				method707(arg1);
				return;
			case 1197:
				method5362(arg1);
				return;
			case 1198:
				method7934(arg1);
				return;
			case 1199:
				method1926(arg1);
				return;
			case 1200:
				method5174(arg1);
				return;
			case 1201:
				Statics.method9582(arg1);
				return;
			case 1202:
				method18193(arg1);
				return;
			case 1203:
				method6975(arg1);
				return;
			case 1204:
				method5355(arg1);
				return;
			case 1205:
				method4284(arg1);
				return;
			case 1206:
				method9242(arg1);
				return;
			case 1207:
				class672.method132(arg1);
				return;
			case 1208:
				class672.method2843(arg1);
				return;
			case 1209:
				method9733(arg1);
				return;
			case 1210:
				method16643(arg1);
				return;
			case 1211:
				method5330(arg1);
				return;
			case 1212:
				method8687(arg1);
				return;
			case 1213:
				method10204(arg1);
				return;
			case 1214:
				method7882(arg1);
				return;
			case 1215:
				method9732(arg1);
				return;
			case 1216:
				method18512(arg1);
				return;
			case 1217:
				method14485(arg1);
				return;
			case 1218:
				method9271(arg1);
				return;
			case 1219:
				TwitchCommands.method2012(arg1);
				return;
			case 1220:
				method9517(arg1);
				return;
			case 1221:
				method8400(arg1);
				return;
			case 1222:
				method4371(arg1);
				return;
			case 1223:
				method7098(arg1);
				return;
			case 1224:
				method1975(arg1);
				return;
			case 1225:
				Statics.method14885(arg1);
				return;
			case 1226:
				Statics.method330(arg1);
				return;
			case 1227:
				method5116(arg1);
				return;
			case 1228:
				method607(arg1);
				return;
			case 1229:
				method9635(arg1);
				return;
			case 1230:
				method5197(arg1);
				return;
			case 1231:
				method10451(arg1);
				return;
			case 1232:
				method6017(arg1);
				return;
			case 1233:
				Statics.method9429(arg1);
				return;
			case 1234:
				method1017(arg1);
				return;
			case 1235:
				method9632(arg1);
				return;
			case 1236:
				method9634(arg1);
				return;
			case 1237:
				method9230(arg1);
				return;
			case 1238:
				method8437(arg1);
				return;
			case 1239:
				method6047(arg1);
				return;
			case 1240:
				method13795(arg1);
				return;
			case 1241:
				method6023(arg1);
				return;
			case 1242:
				method2839(arg1);
				return;
			case 1243:
				method554(arg1);
				return;
			case 1244:
				method4598(arg1);
				return;
			case 1245:
				method15250(arg1);
				return;
			case 1246:
				method15083(arg1);
				return;
			case 1247:
				method4373(arg1);
				return;
			case 1248:
				method7233(arg1);
				return;
			case 1249:
				Statics.method8356(arg1);
				return;
			case 1250:
				method8673(arg1);
				return;
			case 1251:
				method7701(arg1);
				return;
			case 1252:
				method971(arg1);
				return;
			case 1253:
				method4065(arg1);
				return;
			case 1254:
				method853(arg1);
				return;
			case 1255:
				method4335(arg1);
				return;
			case 1256:
				method8886(arg1);
				return;
			case 1257:
				method3377(arg1);
				return;
			case 1258:
				method8380(arg1);
				return;
			case 1259:
				method6980(arg1);
				return;
			case 1260:
				class672.method5341(arg1);
				return;
			case 1261:
				method14065(arg1);
				return;
			case 1262:
				method8152(arg1);
				return;
			case 1263:
				method3070(arg1);
				return;
			case 1264:
				method10146(arg1);
				return;
			case 1265:
				method4278(arg1);
				return;
			case 1266:
				method3098(arg1);
				return;
			case 1267:
				method4502(arg1);
				return;
			case 1268:
				method2776(arg1);
				return;
			case 1269:
				method3043(arg1);
				return;
			case 1270:
				method4539(arg1);
				return;
			case 1271:
				method17522(arg1);
				return;
			case 1272:
				Statics.method2676(arg1);
				return;
			case 1273:
				method8502(arg1);
				return;
			case 1274:
				class672.method18726(arg1);
				return;
			case 1275:
				method3071(arg1);
				return;
			case 1276:
				method9546(arg1);
				return;
			case 1277:
				method4422(arg1);
				return;
			case 1278:
				method10675(arg1);
				return;
			case 1279:
				method14149(arg1);
				return;
			case 1280:
				method4409(arg1);
				return;
			case 1281:
				method5400(arg1);
				return;
			case 1282:
				method4131(arg1);
				return;
			case 1283:
				Statics.method1925(arg1);
				return;
			case 1284:
				Statics.method7075(arg1);
				return;
			case 1285:
				method1003(arg1);
				return;
			case 1286:
				method17468(arg1);
				return;
			case 1287:
				method7072(arg1);
				return;
			case 1288:
				method7262(arg1);
				return;
			case 1289:
				method18737(arg1);
				return;
			case 1290:
				method2820(arg1);
				return;
			case 1291:
				method3620(arg1);
				return;
			case 1292:
				method8382(arg1);
				return;
			case 1293:
				method7041(arg1);
				return;
			case 1294:
				method4570(arg1);
				return;
			case 1295:
				method1007(arg1);
				return;
			case 1296:
				Statics.method9004(arg1);
				return;
			case 1297:
				method2793(arg1);
				return;
			case 1298:
				method16455(arg1);
				return;
			case 1299:
				method4994(arg1);
				return;
			case 1300:
				method14633(arg1);
				return;
			case 1301:
				method7717(arg1);
				return;
			case 1302:
				TwitchCommands.method8190(arg1);
				return;
			case 1303:
				method9208(arg1);
				return;
			case 1304:
				method10286(arg1);
				return;
			case 1305:
				method7475(arg1);
				return;
			case 1306:
				method4496(arg1);
				return;
			case 1307:
				method4608(arg1);
				return;
			case 1308:
				method1062(arg1);
				return;
			case 1309:
				method10321(arg1);
				return;
			case 1310:
				method9211(arg1);
				return;
			case 1311:
				method4369(arg1);
				return;
			case 1312:
				method19714(arg1);
				return;
			case 1313:
				method3574(arg1);
				return;
			case 1314:
				method7132(arg1);
				return;
			case 1315:
				method7621(arg1);
				return;
			case 1316:
				method3604(arg1);
				return;
			case 1317:
				method2751(arg1);
				return;
			case 1318:
				method3565(arg1);
				return;
			case 1319:
				method3081(arg1);
				return;
			case 1320:
				TwitchCommands.method18699(arg1);
				return;
			case 1321:
				method19195(arg1);
				return;
			case 1322:
				method6077(arg1);
				return;
			case 1323:
				Statics.method4600(arg1);
				return;
			case 1324:
				method7043(arg1);
				return;
			case 1325:
				method3039(arg1);
				return;
			case 1326:
				Statics.method15449(arg1);
				return;
			case 1327:
				method7134(arg1);
				return;
			case 1328:
				Statics.method9305(arg1);
				return;
			case 1329:
				method4150(arg1);
				return;
			case 1330:
				Statics.method7318(arg1);
				return;
			case 1331:
				method9186(arg1);
				return;
			case 1332:
				Statics.method10059(arg1);
				return;
			case 1333:
				TwitchCommands.method7360(arg1);
				return;
			case 1334:
				method9894(arg1);
				return;
			case 1335:
				method17427(arg1);
				return;
			case 1336:
				method7976(arg1);
				return;
			case 1337:
				method819(arg1);
				return;
			case 1338:
				method3919(arg1);
				return;
			case 1339:
				method7702(arg1);
				return;
			case 1340:
				Statics.method6965(arg1);
				return;
			case 1341:
				method4488(arg1);
				return;
			case 1342:
				method2584(arg1);
				return;
			case 1343:
				method4941(arg1);
				return;
			case 1344:
				class672.method6038(arg1);
				return;
			case 1345:
				method897(arg1);
				return;
			case 1346:
				method13949(arg1);
				return;
			case 1347:
				Statics.method2833(arg1);
				return;
			case 1348:
				method6811(arg1);
				return;
			case 1349:
				method9304(arg1);
				return;
			case 1350:
				method2777(arg1);
				return;
			case 1351:
				method10362(arg1);
				return;
			case 1352:
				method7040(arg1);
				return;
			case 1353:
				method14128(arg1);
				return;
			case 1354:
				method4650(arg1);
				return;
			case 1355:
				Statics.method6022(arg1);
				return;
			case 1356:
				method16607(arg1);
				return;
			case 1357:
				method10604(arg1);
				return;
			case 1358:
				method2818(arg1);
				return;
			case 1359:
				method9889(arg1);
				return;
			case 1360:
				method4661(arg1);
				return;
			case 1361:
				method5251(arg1);
				return;
			case 1362:
				method10219(arg1);
				return;
			case 1363:
				method8228(arg1);
				return;
			case 1364:
				method10366(arg1);
				return;
			case 1365:
				method5208(arg1);
				return;
			case 1366:
				Statics.method3075(arg1);
				return;
			case 1367:
				method8371(arg1);
				return;
			case 1368:
				method17398(arg1);
				return;
			case 1369:
				method6844(arg1);
				return;
			case 1370:
				method17876(arg1);
				return;
			case 1371:
				method9173(arg1);
				return;
			case 1372:
				method8175(arg1);
				return;
			case 1373:
				method5149(arg1);
				return;
			case 1374:
				method9618(arg1);
				return;
			case 1375:
				method4420(arg1);
				return;
			case 1376:
				method5970(arg1);
				return;
			case 1377:
				Statics.method8191(arg1);
				return;
			case 1378:
				method9742(arg1);
				return;
			case 1379:
				Statics.method9466(arg1);
				return;
			case 1380:
				method3030(arg1);
				return;
			case 1381:
				method4404(arg1);
				return;
			case 1382:
				method10446(arg1);
				return;
			case 1383:
				method14267(arg1);
				return;
			case 1384:
				method3466(arg1);
				return;
			case 1385:
				method6791(arg1);
				return;
			case 1386:
				method6079(arg1);
				return;
			case 1387:
				method9544(arg1);
				return;
			case 1388:
				method6796(arg1);
				return;
			case 1389:
				method8504(arg1);
				return;
			case 1390:
				method10564(arg1);
				return;
			case 1391:
				method5999(arg1);
				return;
			case 1392:
				Statics.method2677(arg1);
				return;
			case 1393:
				method7367(arg1);
				return;
			case 1394:
				method13986(arg1);
				return;
			case 1395:
				method7350(arg1);
				return;
			case 1396:
				method3567(arg1);
				return;
			case 1397:
				method8657(arg1);
				return;
			case 1398:
				method13848(arg1);
				return;
			case 1399:
				method5346(arg1);
				return;
			case 1400:
				method641(arg1);
				return;
			case 1401:
				method4048(arg1);
				return;
			case 1402:
				method9195(arg1);
				return;
			case 1403:
				method5118(arg1);
				return;
			case 1404:
				method6242(arg1);
				return;
			case 1405:
				method253(arg1);
				return;
			case 1406:
				method14635(arg1);
				return;
			case 1407:
				method9084(arg1);
				return;
			case 1408:
				method18194(arg1);
				return;
			case 1409:
				method6870(arg1);
				return;
			case 1410:
				method4049(arg1);
				return;
			case 1411:
				method2976(arg1);
				return;
			case 1412:
				method3606(arg1);
				return;
			case 1413:
				method16437(arg1);
				return;
			case 1414:
				method8686(arg1);
				return;
			case 1415:
				method9771(arg1);
				return;
			case 1416:
				method8492(arg1);
				return;
			case 1417:
				method4638(arg1);
				return;
			case 1418:
				method9906(arg1);
				return;
			case 1419:
				method15002(arg1);
				return;
			case 1420:
				method10221(arg1);
				return;
			case 1421:
				method5099(arg1);
				return;
			case 1422:
				method9214(arg1);
				return;
			case 1423:
				Statics.method6125(arg1);
				return;
			case 1424:
				Statics.method4980(arg1);
				return;
			case 1425:
				method14986(arg1);
				return;
			case 1426:
				method14484(arg1);
				return;
			case 1427:
				method8294(arg1);
				return;
			case 1428:
				TwitchCommands.method4519(arg1);
				return;
			case 1429:
				method17827(arg1);
				return;
			case 1430:
				method3282(arg1);
				return;
			case 1431:
				method2844(arg1);
		}
	}

	@ObfuscatedName("ahd.a(Lyf;B)V")
	public static final void method16717(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8236[arg0.field8220];
	}

	@ObfuscatedName("pu.g(Lyf;B)V")
	public static final void method7070(ClientScriptState arg0) {
		class149 var1 = (class149) arg0.field8239.field12366[arg0.field8220];
		class152 var2 = (class152) (arg0.field8236[arg0.field8220] == 0 ? arg0.field8234.get(var1.field1702) : arg0.field8233.get(var1.field1702));
		BaseVarType var3 = var1.field1704.method7292();
		if (BaseVarType.INTEGER == var3) {
			arg0.field8216[++arg0.field8226 - 1] = var2.method679(var1);
		} else if (BaseVarType.field4837 == var3) {
			arg0.field8224[++arg0.field8238 - 1] = var2.method2799(var1);
		} else if (BaseVarType.field4836 == var3) {
			try {
				String var4 = (String) var2.method2801(var1);
				if (var4 == null) {
					var4 = "null";
				}
				arg0.field8218[++arg0.field8211 - 1] = var4;
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(ex);
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("oh.i(Lyf;I)V")
	public static final void method6124(ClientScriptState arg0) {
		class149 var1 = (class149) arg0.field8239.field12366[arg0.field8220];
		class152 var2 = (class152) (arg0.field8236[arg0.field8220] == 0 ? arg0.field8234.get(var1.field1702) : arg0.field8233.get(var1.field1702));
		BaseVarType var3 = var1.field1704.method7292();
		if (BaseVarType.INTEGER == var3) {
			if (VarDomainType.CLIENT == var1.field1702) {
				DelayedStateChange.method3607(var1);
			}
			var2.method2798(var1, arg0.field8216[--arg0.field8226]);
		} else if (BaseVarType.field4837 == var3) {
			var2.method2800(var1, arg0.field8224[--arg0.field8238]);
		} else if (BaseVarType.field4836 == var3) {
			if (VarDomainType.CLIENT == var1.field1702) {
				DelayedStateChange.method14066(var1);
			}
			var2.method2802(var1, arg0.field8218[--arg0.field8211]);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nj.j(Lyf;I)V")
	public static final void method5970(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8239.field12366[arg0.field8220];
	}

	@ObfuscatedName("zz.t(Lyf;I)V")
	public static final void method14035(ClientScriptState arg0) {
		arg0.field8220 += arg0.field8236[arg0.field8220];
	}

	@ObfuscatedName("ie.ae(Lyf;B)V")
	public static final void method4401(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] != arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("acv.ag(Lyf;I)V")
	public static final void method15002(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] == arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("qn.al(Lyf;S)V")
	public static final void method7364(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] > arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("vr.ac(Lyf;B)V")
	public static final void method9304(ClientScriptState arg0) {
		if (arg0.field8222 == 0) {
			return;
		}
		ScriptFrame var1 = arg0.field8223[--arg0.field8222];
		arg0.field8239 = var1.field8190;
		arg0.field8237 = arg0.field8239.field12369;
		arg0.field8236 = arg0.field8239.field12367;
		arg0.field8220 = var1.field8189;
		arg0.field8213 = var1.field8188;
		arg0.field8212 = var1.field8191;
		arg0.field8219 = var1.field8192;
	}

	@ObfuscatedName("xt.ai(Lyf;B)V")
	public static final void method10362(ClientScriptState arg0) {
		VarBitType var1 = (VarBitType) arg0.field8239.field12366[arg0.field8220];
		class152 var2 = (class152) (arg0.field8236[arg0.field8220] == 0 ? arg0.field8234.get(var1.baseVar.field1702) : arg0.field8233.get(var1.baseVar.field1702));
		arg0.field8216[++arg0.field8226 - 1] = var2.method678(var1);
	}

	@ObfuscatedName("ace.aw(Lyf;I)V")
	public static final void method15089(ClientScriptState arg0) throws VarBitOverflowException {
		VarBitType var1 = (VarBitType) arg0.field8239.field12366[arg0.field8220];
		class152 var2 = (class152) (arg0.field8236[arg0.field8220] == 0 ? arg0.field8234.get(var1.baseVar.field1702) : arg0.field8233.get(var1.baseVar.field1702));
		try {
			var2.method2804(var1, arg0.field8216[--arg0.field8226]);
		} catch (VarBitOverflowException var4) {
			if (!(var2 instanceof class609)) {
				throw var4;
			}
			method5077(arg0, ClientScriptCommand.field5143, var4, "VO");
		}
	}

	@ObfuscatedName("ng.as(Lyf;I)V")
	public static final void method6034(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] <= arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("gh.at(Lyf;I)V")
	public static final void method3593(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] >= arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("aat.ad(Lyf;I)V")
	public static final void method14240(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8213[arg0.field8236[arg0.field8220]];
	}

	@ObfuscatedName("dr.am(Lyf;B)V")
	public static final void method1644(ClientScriptState arg0) {
		arg0.field8213[arg0.field8236[arg0.field8220]] = arg0.field8216[--arg0.field8226];
	}

	@ObfuscatedName("er.au(Lyf;I)V")
	public static final void method2907(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8212[arg0.field8236[arg0.field8220]];
	}

	@ObfuscatedName("hw.ar(Lyf;B)V")
	public static final void method4138(ClientScriptState arg0) {
		arg0.field8212[arg0.field8236[arg0.field8220]] = arg0.field8218[--arg0.field8211];
	}

	@ObfuscatedName("ea.ap(Lyf;B)V")
	public static final void method2881(ClientScriptState arg0) {
		int var1 = arg0.field8236[arg0.field8220];
		arg0.field8211 -= var1;
		String var2 = class695.method9007(arg0.field8218, arg0.field8211, var1);
		arg0.field8218[++arg0.field8211 - 1] = var2;
	}

	@ObfuscatedName("xh.aq(Lyf;B)V")
	public static final void method10204(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("wi.ax(Lyf;I)V")
	public static final void method9885(ClientScriptState arg0) {
		arg0.field8211--;
	}

	@ObfuscatedName("amy.av(Lyf;I)V")
	public static final void method18422(ClientScriptState arg0) {
		int var1 = arg0.field8236[arg0.field8220];
		ClientScript var2 = class670.method5402(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		int[] var3 = new int[var2.field12370];
		Object[] var4 = new Object[var2.field12368];
		long[] var5 = new long[var2.field12371];
		for (int var6 = 0; var6 < var2.field12372; var6++) {
			var3[var6] = arg0.field8216[arg0.field8226 - var2.field12372 + var6];
		}
		for (int var7 = 0; var7 < var2.field12374; var7++) {
			var4[var7] = arg0.field8218[arg0.field8211 - var2.field12374 + var7];
		}
		for (int var8 = 0; var8 < var2.field12364; var8++) {
			var5[var8] = arg0.field8224[arg0.field8238 - var2.field12364 + var8];
		}
		arg0.field8226 -= var2.field12372;
		arg0.field8211 -= var2.field12374;
		arg0.field8238 -= var2.field12364;
		ScriptFrame var9 = new ScriptFrame();
		var9.field8190 = arg0.field8239;
		var9.field8189 = arg0.field8220;
		var9.field8188 = arg0.field8213;
		var9.field8191 = arg0.field8212;
		var9.field8192 = arg0.field8219;
		if (arg0.field8222 >= arg0.field8223.length) {
			throw new RuntimeException();
		}
		arg0.field8223[++arg0.field8222 - 1] = var9;
		arg0.field8239 = var2;
		arg0.field8237 = arg0.field8239.field12369;
		arg0.field8236 = arg0.field8239.field12367;
		arg0.field8220 = -1;
		arg0.field8213 = var3;
		arg0.field8212 = var4;
		arg0.field8219 = var5;
	}

	@ObfuscatedName("ef.ao(Lyf;B)V")
	public static final void method2854(ClientScriptState arg0) {
		int var1 = arg0.field8236[arg0.field8220] >> 16;
		int var2 = arg0.field8236[arg0.field8220] & 0xFFFF;
		int var3 = arg0.field8216[--arg0.field8226];
		if (var3 < 0 || var3 > 5000) {
			throw new RuntimeException();
		}
		arg0.field8214[var1] = var3;
		byte var4 = -1;
		if (var2 == ScriptVarType.INT.getId()) {
			var4 = 0;
		}
		for (int var5 = 0; var5 < var3; var5++) {
			arg0.field8215[var1][var5] = var4;
		}
	}

	@ObfuscatedName("no.aj(Lyf;ZZB)V")
	public static final void method5979(ClientScriptState arg0, boolean arg1, boolean arg2) {
		int var3 = arg0.field8236[arg0.field8220];
		int var4 = arg0.field8216[--arg0.field8226];
		if (var4 < 0 || var4 >= arg0.field8214[var3]) {
			throw new RuntimeException();
		} else if (!arg1) {
			arg0.field8216[++arg0.field8226 - 1] = arg0.field8215[var3][var4];
		} else if (arg2) {
			arg0.field8216[++arg0.field8226 - 1] = arg0.field8215[var3][var4];
			arg0.field8216[++arg0.field8226 - 1] = var4;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var4;
			arg0.field8216[++arg0.field8226 - 1] = arg0.field8215[var3][var4];
		}
	}

	@ObfuscatedName("ho.ay(Lyf;ZI)V")
	public static final void method4274(ClientScriptState arg0, boolean arg1) {
		int var2 = arg0.field8236[arg0.field8220];
		arg0.field8226 -= 2;
		int var3 = arg0.field8216[arg0.field8226];
		int var4 = arg0.field8216[arg0.field8226 + 1];
		if (var3 < 0 || var3 >= arg0.field8214[var2]) {
			throw new RuntimeException();
		}
		arg0.field8215[var2][var3] = var4;
		if (arg1) {
			arg0.field8216[++arg0.field8226 - 1] = var4;
		}
	}

	@ObfuscatedName("agj.ab(Lyf;I)V")
	public static final void method16441(ClientScriptState arg0) {
		IterableMap var1 = arg0.field8239.field12375[arg0.field8236[arg0.field8220]];
		class988 var2 = (class988) var1.method14495((long) arg0.field8216[--arg0.field8226]);
		if (var2 != null) {
			arg0.field8220 += var2.field11442;
		}
	}

	@ObfuscatedName("xd.ak(Lyf;B)V")
	public static final void method10299(ClientScriptState arg0) {
		arg0.field8219[arg0.field8236[arg0.field8220]] = arg0.field8224[--arg0.field8238];
	}

	@ObfuscatedName("xj.an(Lyf;B)V")
	public static final void method10307(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] != arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("kw.bf(Lyf;B)V")
	public static final void method5118(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] == arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("ajc.bl(Lyf;I)V")
	public static final void method17468(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] < arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("qy.bk(Lyf;B)V")
	public static final void method7289(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] > arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("ue.bh(Lyf;B)V")
	public static final void method9237(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] <= arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("nk.bx(Lyf;I)V")
	public static final void method6053(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] >= arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("aiv.bd(Lyf;I)V")
	public static final void method16911(ClientScriptState arg0) {
		if (arg0.field8216[--arg0.field8226] == 1) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("nr.bc(Lyf;I)V")
	public static final void method6070(ClientScriptState arg0) {
		if (arg0.field8216[--arg0.field8226] == 0) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("iy.bn(Lyf;B)V")
	public static final void method4598(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		if (var1.field8242.field2183 != -1) {
			Component var2 = var1.method13790();
			var2.field2351[var1.field8242.field2183] = null;
			client.method4616(var2);
		} else if (arg0.field8235) {
			throw new RuntimeException("");
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ab.bt(Lyf;I)V")
	public static final void method989(ClientScriptState arg0) {
		Component var1 = Component.method10202(arg0.field8216[--arg0.field8226]);
		var1.field2351 = null;
		var1.field2349 = null;
		client.method4616(var1);
	}

	@ObfuscatedName("y.bq(Lyf;I)V")
	public static final void method538(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ActiveComponent var3;
		if (arg0.field8235) {
			var3 = arg0.field8225;
		} else {
			var3 = arg0.field8217;
		}
		arg0.field8216[++arg0.field8226 - 1] = var2 != -1 && var3.method13787(var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("wu.bm(Lyf;I)V")
	public static final void method9633(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ActiveComponent var2;
		if (arg0.field8235) {
			var2 = arg0.field8225;
		} else {
			var2 = arg0.field8217;
		}
		arg0.field8216[++arg0.field8226 - 1] = var2.method13787(var1, -1) ? 1 : 0;
	}

	@ObfuscatedName("qe.bb(ZLyf;B)V")
	public static final void method7224(boolean arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		Component var3 = Component.method10202(var2);
		Interface var4 = Statics.field11725[var2 >> 16];
		if (arg0) {
			method2962(var4, var3);
		} else {
			method4390(var4, var3);
		}
	}

	@ObfuscatedName("jd.be(ZLyf;I)V")
	public static final void method4644(boolean arg0, ClientScriptState arg1) {
		ActiveComponent var2 = arg1.field8235 ? arg1.field8225 : arg1.field8217;
		Component var3 = var2.field8242;
		Interface var4 = var2.field8241;
		if (arg0) {
			method2962(var4, var3);
		} else {
			method4390(var4, var3);
		}
	}

	@ObfuscatedName("wc.by(Lyf;I)V")
	public static final void method9837(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method8666(var2, arg0);
	}

	@ObfuscatedName("tp.bw(Lhf;Lyf;I)V")
	public static final void method8666(Component arg0, ClientScriptState arg1) {
		if (client.method17197(arg0).method17689() && client.field11056 == null) {
			client.method612(arg0.field2158, arg0.field2183);
			client.field11056 = Component.method16682(arg0.field2158, arg0.field2183);
			client.method4616(client.field11056);
		}
	}

	@ObfuscatedName("aqc.bo(Lyf;I)V")
	public static final void method19196(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Statics.field4490.field12061 == null) {
			return;
		}
		for (int var3 = 0; var3 < IDKType.field2951.length; var3++) {
			if (IDKType.field2951[var3] == var1) {
				Statics.field4490.field12061.method10114(var3, var2, Statics.field2628);
				return;
			}
		}
		for (int var4 = 0; var4 < IDKType.field2959.length; var4++) {
			if (IDKType.field2959[var4] == var1) {
				Statics.field4490.field12061.method10114(var4, var2, Statics.field2628);
				return;
			}
		}
	}

	@ObfuscatedName("wm.bz(Lyf;I)V")
	public static final void method9822(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Statics.field4490.field12061 != null) {
			Statics.field4490.field12061.method10115(var1, var2);
		}
	}

	@ObfuscatedName("we.bv(Lyf;B)V")
	public static final void method9732(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Statics.field4490.field12061 != null) {
			Statics.field4490.field12061.method10142(var1, var2);
		}
	}

	@ObfuscatedName("ul.br(Lyf;I)V")
	public static final void method8914(ClientScriptState arg0) {
		boolean var1 = arg0.field8216[--arg0.field8226] != 0;
		if (Statics.field4490.field12061 != null) {
			Statics.field4490.field12061.method10141(var1);
		}
	}

	@ObfuscatedName("ik.bg(Lyf;S)V")
	public static final void method4617(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Statics.field4490.field12061 != null) {
			Statics.field4490.field12061.method10112(var1, var2, Statics.field1842);
		}
	}

	@ObfuscatedName("kw.ba(Lhf;Lhq;Lyf;I)V")
	public static final void method5119(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 4;
		arg0.field2190 = arg2.field8216[arg2.field8226];
		arg0.field2191 = arg2.field8216[arg2.field8226 + 1];
		int var3 = arg2.field8216[arg2.field8226 + 2];
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 5) {
			var3 = 5;
		}
		int var4 = arg2.field8216[arg2.field8226 + 3];
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 5) {
			var4 = 5;
		}
		arg0.field2186 = (byte) var3;
		arg0.field2187 = (byte) var4;
		client.method4616(arg0);
		client.method2103(arg1, arg0);
		if (arg0.field2184 == 0) {
			client.method8329(arg1, arg0, false);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method16433(arg0.field2158);
		}
	}

	@ObfuscatedName("ig.bp(Lyf;B)V")
	public static final void method4391(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method5119(var2, var3, arg0);
	}

	@ObfuscatedName("sh.bj(Lyf;I)V")
	public static final void method8195(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method5119(var2, var3, arg0);
	}

	@ObfuscatedName("ge.bs(Lhf;Lhq;Lyf;I)V")
	public static final void method3562(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 4;
		arg0.field2192 = arg2.field8216[arg2.field8226];
		arg0.field2193 = arg2.field8216[arg2.field8226 + 1];
		arg0.field2227 = 0;
		arg0.field2238 = 0;
		int var3 = arg2.field8216[arg2.field8226 + 2];
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 4) {
			var3 = 4;
		}
		int var4 = arg2.field8216[arg2.field8226 + 3];
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 4) {
			var4 = 4;
		}
		arg0.field2356 = (byte) var3;
		arg0.field2174 = (byte) var4;
		client.method4616(arg0);
		client.method2103(arg1, arg0);
		if (arg0.field2184 == 0) {
			client.method8329(arg1, arg0, false);
		}
	}

	@ObfuscatedName("aq.cl(Lyf;B)V")
	public static final void method927(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method3562(var2, var3, arg0);
	}

	@ObfuscatedName("hp.cg(Lyf;I)V")
	public static final void method4058(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method3562(var2, var3, arg0);
	}

	@ObfuscatedName("ju.ce(Lhf;Lhq;Lyf;I)V")
	public static final void method4660(Component arg0, Interface arg1, ClientScriptState arg2) {
		boolean var3 = arg2.field8216[--arg2.field8226] == 1;
		if (arg0.field2201 != var3) {
			arg0.field2201 = var3;
			client.method4616(arg0);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method10340(arg0.field2158);
		}
	}

	@ObfuscatedName("km.cu(Lyf;S)V")
	public static final void method5374(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4660(var2, var3, arg0);
	}

	@ObfuscatedName("ea.ci(Lyf;I)V")
	public static final void method2882(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4660(var2, var3, arg0);
	}

	@ObfuscatedName("rz.cn(Lhf;Lhq;Lyf;I)V")
	public static final void method7711(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		arg0.field2198 = arg2.field8216[arg2.field8226];
		arg0.field2199 = arg2.field8216[arg2.field8226 + 1];
		client.method4616(arg0);
		client.method2103(arg1, arg0);
		if (arg0.field2184 == 0) {
			client.method8329(arg1, arg0, false);
		}
	}

	@ObfuscatedName("er.cv(Lyf;I)V")
	public static final void method2911(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method7711(var2, var3, arg0);
	}

	@ObfuscatedName("xt.cp(Lyf;I)V")
	public static final void method10357(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method7711(var2, var3, arg0);
	}

	@ObfuscatedName("z.ca(Lhf;Lhq;Lyf;I)V")
	public static final void method273(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2205 = arg2.field8216[--arg2.field8226] == 1;
	}

	@ObfuscatedName("au.cx(Lyf;B)V")
	public static final void method843(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method273(var2, var3, arg0);
	}

	@ObfuscatedName("qf.cw(Lyf;I)V")
	public static final void method7322(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method273(var2, var3, arg0);
	}

	@ObfuscatedName("any.ct(Lhf;Lhq;Lyf;I)V")
	public static final void method18660(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		arg0.field2206 = arg2.field8216[arg2.field8226];
		if (arg0.field2206 > arg0.field2208 - arg0.field2196) {
			arg0.field2206 = arg0.field2208 - arg0.field2196;
		}
		if (arg0.field2206 < 0) {
			arg0.field2206 = 0;
		}
		arg0.field2207 = arg2.field8216[arg2.field8226 + 1];
		if (arg0.field2207 > arg0.field2319 - arg0.field2197) {
			arg0.field2207 = arg0.field2319 - arg0.field2197;
		}
		if (arg0.field2207 < 0) {
			arg0.field2207 = 0;
		}
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method1588(arg0.field2158);
		}
	}

	@ObfuscatedName("jk.cf(Lyf;I)V")
	public static final void method5116(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method18660(var2, var3, arg0);
	}

	@ObfuscatedName("dg.co(Lyf;I)V")
	public static final void method2583(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method18660(var2, var3, arg0);
	}

	@ObfuscatedName("mj.cr(Lhf;Lhq;Lyf;I)V")
	public static final void method5919(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2210 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method14870(arg0.field2158);
		}
	}

	@ObfuscatedName("aku.cm(Lyf;B)V")
	public static final void method17759(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method5919(var2, var3, arg0);
	}

	@ObfuscatedName("ir.cq(Lyf;I)V")
	public static final void method4460(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method5919(var2, var3, arg0);
	}

	@ObfuscatedName("ch.ch(Lhf;Lhq;Lyf;I)V")
	public static final void method1517(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2263 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
	}

	@ObfuscatedName("cq.cb(Lyf;I)V")
	public static final void method1514(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method1517(var2, var3, arg0);
	}

	@ObfuscatedName("ajd.cs(Lyf;I)V")
	public static final void method17450(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1517(var2, var3, arg0);
	}

	@ObfuscatedName("hx.cy(Lhf;Lhq;Lyf;B)V")
	public static final void method3921(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2212 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
	}

	@ObfuscatedName("ht.cc(Lyf;I)V")
	public static final void method4144(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method3921(var2, var3, arg0);
	}

	@ObfuscatedName("ky.cz(Lyf;I)V")
	public static final void method5379(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method3921(var2, var3, arg0);
	}

	@ObfuscatedName("sv.ck(Lhf;Lhq;Lyf;B)V")
	public static final void method7972(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2156 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
	}

	@ObfuscatedName("iw.cd(Lyf;I)V")
	public static final void method4514(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method7972(var2, var3, arg0);
	}

	@ObfuscatedName("ka.dr(Lyf;I)V")
	public static final void method5211(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		Statics.method5066(var2, var3, arg0);
	}

	@ObfuscatedName("qk.da(Lyf;B)V")
	public static final void method7361(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Statics.method5066(var2, var3, arg0);
	}

	@ObfuscatedName("dd.dt(Lhf;Lhq;Lyf;I)V")
	public static final void method1620(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2216 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
	}

	@ObfuscatedName("dc.do(Lyf;B)V")
	public static final void method1975(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method1620(var2, var3, arg0);
	}

	@ObfuscatedName("nv.dz(Lyf;I)V")
	public static final void method6110(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1620(var2, var3, arg0);
	}

	@ObfuscatedName("wq.dv(Lhf;Lhq;Lyf;I)V")
	public static final void method9790(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2217 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
	}

	@ObfuscatedName("amq.dm(Lyf;I)V")
	public static final void method18464(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method9790(var2, var3, arg0);
	}

	@ObfuscatedName("dy.dq(Lyf;I)V")
	public static final void method2097(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9790(var2, var3, arg0);
	}

	@ObfuscatedName("l.dc(Lhf;Lhq;Lyf;B)V")
	public static final void method255(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 1;
		arg0.field2294 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			Statics.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("xv.di(Lyf;B)V")
	public static final void method10099(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method255(var2, var3, arg0);
	}

	@ObfuscatedName("ui.dk(Lyf;I)V")
	public static final void method8979(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method255(var2, var3, arg0);
	}

	@ObfuscatedName("sd.dn(Lhf;Lhq;Lyf;I)V")
	public static final void method8299(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 6;
		arg0.field2228 = arg2.field8216[arg2.field8226];
		arg0.field2316 = arg2.field8216[arg2.field8226 + 1];
		arg0.field2230 = arg2.field8216[arg2.field8226 + 2];
		arg0.field2231 = arg2.field8216[arg2.field8226 + 3];
		arg0.field2331 = arg2.field8216[arg2.field8226 + 4];
		arg0.field2272 = arg2.field8216[arg2.field8226 + 5];
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method2886(arg0.field2158);
			DelayedStateChange.method14792(arg0.field2158);
		}
	}

	@ObfuscatedName("xv.df(Lyf;I)V")
	public static final void method10096(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method8299(var2, var3, arg0);
	}

	@ObfuscatedName("anv.dw(Lyf;I)V")
	public static final void method18693(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method8299(var2, var3, arg0);
	}

	@ObfuscatedName("yl.ds(Lhf;Lhq;Lyf;I)V")
	public static final void method10678(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		if (arg0.field2262 != var3) {
			if (var3 == -1) {
				arg0.field2170 = null;
			} else {
				if (arg0.field2170 == null) {
					arg0.field2170 = new class1074();
				}
				arg0.field2170.method14362(var3);
			}
			arg0.field2262 = var3;
			client.method4616(arg0);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method10523(arg0.field2158);
		}
	}

	@ObfuscatedName("ajn.du(Lyf;B)V")
	public static final void method17454(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method10678(var2, var3, arg0);
	}

	@ObfuscatedName("adn.dl(Lyf;I)V")
	public static final void method15234(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method10678(var2, var3, arg0);
	}

	@ObfuscatedName("db.dp(Lhf;Lhq;Lyf;S)V")
	public static final void method2108(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2239 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
	}

	@ObfuscatedName("agu.dy(Lyf;B)V")
	public static final void method16454(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method2108(var2, var3, arg0);
	}

	@ObfuscatedName("ru.db(Lyf;I)V")
	public static final void method7934(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method2108(var2, var3, arg0);
	}

	@ObfuscatedName("dy.dh(Lhf;Lhq;Lyf;S)V")
	public static final void method2098(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 4;
		arg0.field2240 = arg2.field8216[arg2.field8226];
		arg0.field2256 = arg2.field8216[arg2.field8226 + 1];
		arg0.field2203 = arg2.field8216[arg2.field8226 + 2];
		arg0.field2189 = arg2.field8216[arg2.field8226 + 3];
		client.method4616(arg0);
	}

	@ObfuscatedName("gq.dg(Lyf;I)V")
	public static final void method3464(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method2098(var2, var3, arg0);
	}

	@ObfuscatedName("sd.dj(Lyf;B)V")
	public static final void method8296(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		Statics.method15227(var2, var3, arg0);
	}

	@ObfuscatedName("iq.eo(Lyf;I)V")
	public static final void method4380(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Statics.method15227(var2, var3, arg0);
	}

	@ObfuscatedName("gz.ey(Lhf;Lhq;Lyf;I)V")
	public static final void method3658(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2250 = false;
		client.method4616(arg0);
	}

	@ObfuscatedName("gr.eu(Lyf;I)V")
	public static final void method3577(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method3658(var2, var3, arg0);
	}

	@ObfuscatedName("kj.ed(Lyf;I)V")
	public static final void method5355(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method3658(var2, var3, arg0);
	}

	@ObfuscatedName("fb.ee(Lhf;Lhq;Lyf;I)V")
	public static final void method3258(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (!var3.equals(arg0.field2261)) {
			arg0.field2261 = var3;
			client.method4616(arg0);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method16464(arg0.field2158);
		}
	}

	@ObfuscatedName("abo.es(Lyf;B)V")
	public static final void method14613(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method3258(var2, var3, arg0);
	}

	@ObfuscatedName("ft.el(Lhf;Lhq;Lyf;I)V")
	public static final void method3077(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2287 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method7247(arg0.field2158);
		}
	}

	@ObfuscatedName("ana.ep(Lyf;B)V")
	public static final void method18684(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method3077(var2, var3, arg0);
	}

	@ObfuscatedName("hn.ev(Lhf;Lhq;Lyf;I)V")
	public static final void method4079(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 3;
		arg0.field2223 = arg2.field8216[arg2.field8226];
		arg0.field2264 = arg2.field8216[arg2.field8226 + 1];
		arg0.field2229 = arg2.field8216[arg2.field8226 + 2];
		client.method4616(arg0);
	}

	@ObfuscatedName("uo.ec(Lyf;I)V")
	public static final void method9232(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4079(var2, var3, arg0);
	}

	@ObfuscatedName("yu.em(Lhf;Lhq;Lyf;I)V")
	public static final void method13846(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2265 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
	}

	@ObfuscatedName("is.eh(Lyf;I)V")
	public static final void method4488(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method13846(var2, var3, arg0);
	}

	@ObfuscatedName("xh.eq(Lyf;S)V")
	public static final void method10212(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method13846(var2, var3, arg0);
	}

	@ObfuscatedName("if.eg(Lhf;Lhq;Lyf;S)V")
	public static final void method4573(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2267 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method9793(arg0.field2158);
		}
	}

	@ObfuscatedName("xm.ez(Lyf;I)V")
	public static final void method9905(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4573(var2, var3, arg0);
	}

	@ObfuscatedName("sx.ef(Lyf;I)V")
	public static final void method8021(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4573(var2, var3, arg0);
	}

	@ObfuscatedName("jq.et(Lhf;Lhq;Lyf;B)V")
	public static final void method4992(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2218 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
	}

	@ObfuscatedName("va.ea(Lyf;I)V")
	public static final void method9413(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4992(var2, var3, arg0);
	}

	@ObfuscatedName("ax.ew(Lyf;I)V")
	public static final void method959(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4992(var2, var3, arg0);
	}

	@ObfuscatedName("wq.er(Lhf;Lhq;Lyf;B)V")
	public static final void method9791(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2219 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
	}

	@ObfuscatedName("ka.eb(Lyf;I)V")
	public static final void method5212(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9791(var2, var3, arg0);
	}

	@ObfuscatedName("jv.fg(Lyf;I)V")
	public static final void method5011(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		Statics.method9019(var2, var3, arg0);
	}

	@ObfuscatedName("ys.fm(Lyf;I)V")
	public static final void method10447(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Statics.method9019(var2, var3, arg0);
	}

	@ObfuscatedName("dh.fu(Lhf;Lhq;Lyf;B)V")
	public static final void method2579(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2213 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
	}

	@ObfuscatedName("ib.fs(Lyf;B)V")
	public static final void method4495(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method2579(var2, var3, arg0);
	}

	@ObfuscatedName("hs.fz(Lyf;I)V")
	public static final void method4043(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method2579(var2, var3, arg0);
	}

	@ObfuscatedName("tv.fj(Lhf;Lhq;Lyf;I)V")
	public static final void method8675(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		arg0.field2208 = arg2.field8216[arg2.field8226];
		arg0.field2319 = arg2.field8216[arg2.field8226 + 1];
		client.method4616(arg0);
		if (arg0.field2184 == 0) {
			client.method8329(arg1, arg0, false);
		}
	}

	@ObfuscatedName("nk.fd(Lyf;I)V")
	public static final void method6054(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method8675(var2, var3, arg0);
	}

	@ObfuscatedName("ry.fn(Lyf;I)V")
	public static final void method7701(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method8675(var2, var3, arg0);
	}

	@ObfuscatedName("rm.fi(Lhf;Lhq;Lyf;B)V")
	public static final void method7620(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2222 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
	}

	@ObfuscatedName("ky.ft(Lyf;I)V")
	public static final void method5381(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method7620(var2, var3, arg0);
	}

	@ObfuscatedName("fa.fv(Lhf;Lhq;Lyf;B)V")
	public static final void method3100(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2272 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method2886(arg0.field2158);
		}
	}

	@ObfuscatedName("na.fc(Lyf;I)V")
	public static final void method6001(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method3100(var2, var3, arg0);
	}

	@ObfuscatedName("ip.fw(Lyf;B)V")
	public static final void method4521(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method3100(var2, var3, arg0);
	}

	@ObfuscatedName("nz.fa(Lhf;Lhq;Lyf;S)V")
	public static final void method6085(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		arg0.field2214 = var3 == 1;
		client.method4616(arg0);
	}

	@ObfuscatedName("na.fp(Lyf;I)V")
	public static final void method5999(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method6085(var2, var3, arg0);
	}

	@ObfuscatedName("xn.fq(Lyf;I)V")
	public static final void method10107(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method6085(var2, var3, arg0);
	}

	@ObfuscatedName("il.ff(Lhf;Lhq;Lyf;I)V")
	public static final void method4506(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		arg0.field2305 = arg2.field8216[arg2.field8226];
		arg0.field2209 = arg2.field8216[arg2.field8226 + 1];
		client.method4616(arg0);
	}

	@ObfuscatedName("jr.fl(Lyf;I)V")
	public static final void method4938(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4506(var2, var3, arg0);
	}

	@ObfuscatedName("ip.fb(Lyf;I)V")
	public static final void method4524(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4506(var2, var3, arg0);
	}

	@ObfuscatedName("d.fo(Lhf;Lhq;Lyf;B)V")
	public static final void method310(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2236 = arg2.field8216[--arg2.field8226];
		client.method4616(arg0);
	}

	@ObfuscatedName("p.fy(Lyf;I)V")
	public static final void method288(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method310(var2, var3, arg0);
	}

	@ObfuscatedName("vx.fk(Lhf;Lhq;Lyf;I)V")
	public static final void method9246(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		int var3 = arg2.field8216[arg2.field8226];
		int var4 = arg2.field8216[arg2.field8226 + 1];
		ParamType var5 = (ParamType) Statics.field3086.get(var3);
		if (var5.field9172 == var4) {
			arg0.method3954(var3);
		} else {
			arg0.method3952(var3, var4);
		}
	}

	@ObfuscatedName("fk.fh(Lyf;B)V")
	public static final void method3372(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method9246(var2, var3, arg0);
	}

	@ObfuscatedName("jd.fr(Lyf;I)V")
	public static final void method4638(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9246(var2, var3, arg0);
	}

	@ObfuscatedName("abh.gu(Lhf;Lhq;Lyf;I)V")
	public static final void method14700(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		String var4 = (String) arg2.field8218[--arg2.field8211];
		ParamType var5 = (ParamType) Statics.field3086.get(var3);
		if (var5.field9171.equals(var4)) {
			arg0.method3954(var3);
		} else {
			arg0.method4003(var3, var4);
		}
	}

	@ObfuscatedName("x.gq(Lyf;I)V")
	public static final void method574(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14700(var2, var3, arg0);
	}

	@ObfuscatedName("ts.gl(Lyf;B)V")
	public static final void method8656(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14700(var2, var3, arg0);
	}

	@ObfuscatedName("apn.gk(Lyf;I)V")
	public static final void method18960(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		Statics.method14717(var2, var3, arg0);
	}

	@ObfuscatedName("aiu.gy(Lhf;Lhq;Lyf;I)V")
	public static final void method16905(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 3;
		int var3 = arg2.field8216[arg2.field8226];
		short var4 = (short) arg2.field8216[arg2.field8226 + 1];
		short var5 = (short) arg2.field8216[arg2.field8226 + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.method3993(var3, var4, var5);
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method2051(arg0.field2158, var3);
		}
	}

	@ObfuscatedName("jg.ga(Lyf;I)V")
	public static final void method5063(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method16905(var2, var3, arg0);
	}

	@ObfuscatedName("jq.gn(Lyf;I)V")
	public static final void method4993(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method16905(var2, var3, arg0);
	}

	@ObfuscatedName("v.gc(Lhf;Lhq;Lyf;B)V")
	public static final void method331(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2275 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method18682(arg0.field2158);
		}
	}

	@ObfuscatedName("w.gx(Lyf;S)V")
	public static final void method229(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method331(var2, var3, arg0);
	}

	@ObfuscatedName("ae.ge(Lyf;I)V")
	public static final void method650(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8226 -= 2;
		int var3 = arg0.field8216[arg0.field8226];
		int var4 = arg0.field8216[arg0.field8226 + 1];
		ParamType var5 = (ParamType) Statics.field3086.get(var3);
		if (var5.field9172 == var4) {
			var2.method3954(var3);
		} else {
			var2.method3952(var3, var4);
		}
	}

	@ObfuscatedName("abv.gg(Lhf;Lhq;Lyf;I)V")
	public static final void method14690(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2253 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method3026(arg0.field2158);
		}
	}

	@ObfuscatedName("wv.gr(Lyf;I)V")
	public static final void method9740(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14690(var2, var3, arg0);
	}

	@ObfuscatedName("tp.gs(Lyf;I)V")
	public static final void method8667(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14690(var2, var3, arg0);
	}

	@ObfuscatedName("jp.gt(Lhf;Lhq;Lyf;I)V")
	public static final void method5097(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2360 = arg2.field8216[--arg2.field8226] == 1;
		client.method4616(arg0);
	}

	@ObfuscatedName("je.gh(Lyf;I)V")
	public static final void method4842(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method5097(var2, var3, arg0);
	}

	@ObfuscatedName("iq.gm(Lyf;I)V")
	public static final void method4375(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method5097(var2, var3, arg0);
	}

	@ObfuscatedName("ws.gv(Lhf;Lhq;Lyf;I)V")
	public static final void method9878(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 2;
		arg0.field2363 = null;
		arg0.field2294 = arg2.field8216[--arg2.field8226];
		if (arg0.field2183 == -1 && !arg1.field2150) {
			Statics.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("qk.gj(Lyf;I)V")
	public static final void method7362(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method9878(var2, var3, arg0);
	}

	@ObfuscatedName("pb.gw(Lyf;B)V")
	public static final void method6790(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9878(var2, var3, arg0);
	}

	@ObfuscatedName("ge.gd(Lhf;Lhq;Lyf;B)V")
	public static final void method3573(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 3;
		arg0.field2294 = client.field10945;
		arg0.field2298 = 0;
		if (arg0.field2183 == -1 && !arg1.field2150) {
			Statics.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("ja.gz(Lyf;I)V")
	public static final void method5014(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method3573(var2, var3, arg0);
	}

	@ObfuscatedName("uf.gb(Lyf;I)V")
	public static final void method9020(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method3573(var2, var3, arg0);
	}

	@ObfuscatedName("aaj.gi(Lhf;Lhq;ZILyf;I)V")
	public static final void method14455(Component arg0, Interface arg1, boolean arg2, int arg3, ClientScriptState arg4) {
		arg4.field8226 -= 2;
		int var5 = arg4.field8216[arg4.field8226];
		int var6 = arg4.field8216[arg4.field8226 + 1];
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method6798(arg0.field2158);
			DelayedStateChange.method2886(arg0.field2158);
			DelayedStateChange.method14792(arg0.field2158);
		}
		if (var5 == -1) {
			arg0.field2224 = 1;
			arg0.field2294 = -1;
			arg0.field2334 = -1;
			return;
		}
		arg0.field2334 = var5;
		arg0.field2335 = var6;
		arg0.field2246 = arg2;
		ObjType var7 = (ObjType) Statics.field1842.get(var5);
		arg0.field2230 = var7.field8639;
		arg0.field2231 = var7.field8626;
		arg0.field2331 = var7.field8641;
		arg0.field2228 = var7.field8695;
		arg0.field2316 = var7.field8643;
		arg0.field2272 = var7.field8638;
		arg0.field2241 = arg3;
		if (arg0.field2227 > 0) {
			arg0.field2272 = arg0.field2272 * 32 / arg0.field2227;
		} else if (arg0.field2192 > 0) {
			arg0.field2272 = arg0.field2272 * 32 / arg0.field2192;
		}
	}

	@ObfuscatedName("yl.hm(Lyf;B)V")
	public static final void method10681(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14455(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("nd.ha(Lyf;I)V")
	public static final void method5938(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14455(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("po.hk(Lyf;I)V")
	public static final void method6870(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14455(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("vi.hu(Lyf;I)V")
	public static final void method9406(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14455(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("qm.hb(Lyf;B)V")
	public static final void method7317(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14455(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("abt.hg(Lyf;B)V")
	public static final void method14932(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14455(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("tg.hd(Lyf;I)V")
	public static final void method8690(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14455(var2, var3, true, 0, arg0);
	}

	@ObfuscatedName("agg.hx(Lyf;B)V")
	public static final void method16439(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14455(var2, var3, true, 0, arg0);
	}

	@ObfuscatedName("kc.hf(Lyf;I)V")
	public static final void method5346(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14455(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("agf.hr(Lyf;I)V")
	public static final void method16446(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14455(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("xk.hs(Lyf;B)V")
	public static final void method10325(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14455(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("tx.hh(Lhf;Lhq;Lyf;I)V")
	public static final void method8884(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 6;
		arg0.field2363 = null;
		arg0.field2294 = arg2.field8216[--arg2.field8226];
		if (arg0.field2183 == -1 && !arg1.field2150) {
			Statics.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("qz.hy(Lyf;B)V")
	public static final void method7134(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method8884(var2, var3, arg0);
	}

	@ObfuscatedName("ty.he(Lhf;Lhq;Lyf;B)V")
	public static final void method8473(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 5;
		arg0.field2294 = arg2.field8216[--arg2.field8226];
		if (arg0.field2183 == -1 && !arg1.field2150) {
			Statics.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("acg.hn(Lyf;I)V")
	public static final void method15016(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method8473(var2, var3, arg0);
	}

	@ObfuscatedName("vs.hi(Lyf;I)V")
	public static final void method9422(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method8473(var2, var3, arg0);
	}

	@ObfuscatedName("nz.hw(Lhf;Lhq;Lyf;Lhd;B)V")
	public static final void method6082(Component arg0, Interface arg1, ClientScriptState arg2, class223 arg3) {
		int var4 = arg2.field8216[--arg2.field8226];
		switch(arg3.field2141) {
			case 0:
				arg0.field2336 = Statics.field6721.method3392(var4).method3488();
				break;
			case 1:
			case 4:
				arg0.field2336 = arg2.field8228.field11392[var4].field3087;
				break;
			case 2:
				if (client.field11080 != 2 || var4 >= client.field10811) {
					return;
				}
				arg0.field2336 = client.field11065[var4].field606;
				break;
			case 3:
				arg0.field2336 = ((PlayerGroupBanned) Statics.field6721.method3429().get(var4)).method3540();
				break;
			case 5:
				if (Statics.field9267 != null && var4 < Statics.field9267.length) {
					arg0.field2336 = Statics.field9267[var4].field756;
				}
				break;
			default:
				throw new IllegalStateException();
		}
		arg0.field2337 = arg3;
	}

	@ObfuscatedName("jb.ht(Lyf;I)V")
	public static final void method4882(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method6082(var2, var3, arg0, class223.field2136);
	}

	@ObfuscatedName("ve.hc(Lyf;B)V")
	public static final void method9453(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method6082(var2, var3, arg0, class223.field2136);
	}

	@ObfuscatedName("pr.ho(Lyf;I)V")
	public static final void method6875(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method6082(var2, var3, arg0, class223.field2140);
	}

	@ObfuscatedName("aq.hj(Lyf;I)V")
	public static final void method924(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method6082(var2, var3, arg0, class223.field2140);
	}

	@ObfuscatedName("ga.hv(Lyf;I)V")
	public static final void method3543(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		boolean var1 = arg0.field8216[arg0.field8226] == 1;
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Component var3 = Component.method10202(var2);
		Interface var4 = Statics.field11725[var2 >> 16];
		method6082(var3, var4, arg0, var1 ? class223.field2138 : class223.field2137);
	}

	@ObfuscatedName("uy.hz(Lyf;I)V")
	public static final void method9173(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		boolean var4 = arg0.field8216[--arg0.field8226] == 1;
		method6082(var2, var3, arg0, var4 ? class223.field2138 : class223.field2137);
	}

	@ObfuscatedName("akr.ij(Lyf;I)V")
	public static final void method17750(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method6082(var2, var3, arg0, Statics.field3022 == arg0.field8228 ? class223.field2139 : class223.field2135);
	}

	@ObfuscatedName("tv.io(Lyf;I)V")
	public static final void method8673(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method6082(var2, var3, arg0, Statics.field3022 == arg0.field8228 ? class223.field2139 : class223.field2135);
	}

	@ObfuscatedName("bf.iq(Lhf;Lhq;Lyf;I)V")
	public static final void method1020(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2336 = null;
		arg0.field2337 = null;
	}

	@ObfuscatedName("fp.ig(Lyf;B)V")
	public static final void method3104(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method1020(var2, var3, arg0);
	}

	@ObfuscatedName("nu.iv(Lyf;I)V")
	public static final void method6077(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1020(var2, var3, arg0);
	}

	@ObfuscatedName("age.ie(Lhf;Lhq;Lyf;S)V")
	public static final void method16442(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 5;
		arg0.field2294 = client.field10945;
		arg0.field2298 = 0;
		if (arg0.field2183 == -1 && !arg1.field2150) {
			Statics.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("gb.iu(Lyf;I)V")
	public static final void method3671(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method16442(var2, var3, arg0);
	}

	@ObfuscatedName("w.in(Lyf;I)V")
	public static final void method232(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method16442(var2, var3, arg0);
	}

	@ObfuscatedName("n.ir(Lhf;Lhq;Lyf;I)V")
	public static final void method143(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226] - 1;
		if (var3 >= 0 && var3 <= 9) {
			arg0.method3947(var3, (String) arg2.field8218[--arg2.field8211]);
		} else {
			arg2.field8211--;
		}
	}

	@ObfuscatedName("vo.it(Lyf;I)V")
	public static final void method9306(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method143(var2, var3, arg0);
	}

	@ObfuscatedName("abr.ix(Lyf;I)V")
	public static final void method14633(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method143(var2, var3, arg0);
	}

	@ObfuscatedName("g.is(Lhf;Lhq;Lyf;I)V")
	public static final void method617(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		int var3 = arg2.field8216[arg2.field8226];
		int var4 = arg2.field8216[arg2.field8226 + 1];
		if (var3 == -1 && var4 == -1) {
			arg0.field2284 = null;
		} else {
			arg0.field2284 = Component.method16682(var3, var4);
		}
	}

	@ObfuscatedName("vv.ib(Lyf;I)V")
	public static final void method9386(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method617(var2, var3, arg0);
	}

	@ObfuscatedName("jd.il(Lyf;B)V")
	public static final void method4645(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method617(var2, var3, arg0);
	}

	@ObfuscatedName("pv.id(Lyf;I)V")
	public static final void method6974(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Statics.method3600(var2, var3, arg0);
	}

	@ObfuscatedName("vm.ia(Lhf;Lhq;Lyf;I)V")
	public static final void method9456(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2285 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("hi.ih(Lyf;I)V")
	public static final void method4128(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9456(var2, var3, arg0);
	}

	@ObfuscatedName("db.iy(Lhf;Lhq;Lyf;I)V")
	public static final void method2109(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2286 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("ii.ii(Lyf;B)V")
	public static final void method4611(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method2109(var2, var3, arg0);
	}

	@ObfuscatedName("fb.iz(Lyf;B)V")
	public static final void method3255(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method2109(var2, var3, arg0);
	}

	@ObfuscatedName("ev.ik(Lyf;I)V")
	public static final void method2775(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("hg.im(Lyf;I)V")
	public static final void method3911(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("hh.ic(Lyf;I)V")
	public static final void method4048(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("vu.jd(Lyf;B)V")
	public static final void method9402(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("vh.jf(Lyf;B)V")
	public static final void method9544(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("pp.ju(Lyf;I)V")
	public static final void method7040(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("au.jy(Lyf;I)V")
	public static final void method846(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("tg.jl(Lyf;I)V")
	public static final void method8684(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("vh.jn(Lyf;B)V")
	public static final void method9549(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("iu.je(Lyf;I)V")
	public static final void method4412(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("il.jb(Lyf;B)V")
	public static final void method4505(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("vz.jm(Lyf;B)V")
	public static final void method9551(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ajo.jw(Lyf;I)V")
	public static final void method17495(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("wo.jr(Lyf;B)V")
	public static final void method9622(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("aky.js(Lyf;I)V")
	public static final void method17808(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("fa.ji(Lyf;I)V")
	public static final void method3101(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ju.jt(Lyf;I)V")
	public static final void method4662(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("nh.jq(Lyf;B)V")
	public static final void method6118(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("vv.jv(Lyf;I)V")
	public static final void method9391(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("fd.ja(Lyf;I)V")
	public static final void method3059(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("qs.jj(Lyf;B)V")
	public static final void method7334(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("ty.jo(Lyf;I)V")
	public static final void method8478(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ff.jz(Lyf;I)V")
	public static final void method3126(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("pf.jc(Lyf;S)V")
	public static final void method7006(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("hz.jg(Lhf;Lhq;Lyf;I)V")
	public static final void method4318(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2279 = (String) arg2.field8218[--arg2.field8211];
	}

	@ObfuscatedName("ie.jx(Lyf;I)V")
	public static final void method4402(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4318(var2, var3, arg0);
	}

	@ObfuscatedName("db.jh(Lyf;I)V")
	public static final void method2111(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4318(var2, var3, arg0);
	}

	@ObfuscatedName("ahd.jp(Lhf;Lhq;Lyf;I)V")
	public static final void method16715(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2288 = (String) arg2.field8218[--arg2.field8211];
	}

	@ObfuscatedName("abr.jk(Lyf;I)V")
	public static final void method14634(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method16715(var2, var3, arg0);
	}

	@ObfuscatedName("hy.kw(Lyf;I)V")
	public static final void method4066(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method16715(var2, var3, arg0);
	}

	@ObfuscatedName("mj.kz(Lhf;Lhq;Lyf;B)V")
	public static final void method5920(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2321 = null;
	}

	@ObfuscatedName("kh.ke(Lyf;I)V")
	public static final void method5208(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method5920(var2, var3, arg0);
	}

	@ObfuscatedName("ig.kq(Lyf;I)V")
	public static final void method4388(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method5920(var2, var3, arg0);
	}

	@ObfuscatedName("fr.kg(Lhf;Lhq;Lyf;I)V")
	public static final void method3376(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2269 = arg2.field8216[--arg2.field8226];
		arg0.field2202 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("e.ku(Lyf;I)V")
	public static final void method137(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method3376(var2, var3, arg0);
	}

	@ObfuscatedName("pk.ko(Lyf;B)V")
	public static final void method6796(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method3376(var2, var3, arg0);
	}

	@ObfuscatedName("af.ki(Lyf;I)V")
	public static final void method1003(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Statics.method969(var2, var3, arg0);
	}

	@ObfuscatedName("aba.ks(Lhf;Lhq;Lyf;B)V")
	public static final void method14767(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2180 = (String) arg2.field8218[--arg2.field8211];
	}

	@ObfuscatedName("ke.kh(Lyf;I)V")
	public static final void method5132(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14767(var2, var3, arg0);
	}

	@ObfuscatedName("vv.ka(Lyf;B)V")
	public static final void method9387(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14767(var2, var3, arg0);
	}

	@ObfuscatedName("abh.kl(Lhf;Lhq;Lyf;S)V")
	public static final void method14702(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2283 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("agu.kb(Lyf;I)V")
	public static final void method16453(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14702(var2, var3, arg0);
	}

	@ObfuscatedName("ake.kr(Lyf;I)V")
	public static final void method17802(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14702(var2, var3, arg0);
	}

	@ObfuscatedName("su.kd(Lhf;IILyf;I)V")
	public static final void method8295(Component arg0, int arg1, int arg2, ClientScriptState arg3) {
		if (arg0.field2300 == null) {
			if (arg2 <= 0) {
				return;
			}
			arg0.field2270 = new byte[11][];
			arg0.field2281 = new byte[11][];
			arg0.field2211 = new int[11];
			arg0.field2273 = new int[11];
			arg0.field2300 = new int[11];
		}
		arg0.field2300[arg1] = arg2;
		if (arg2 > 0) {
			arg0.field2324 = true;
			return;
		}
		arg0.field2324 = false;
		for (int var4 = 0; var4 < arg0.field2270.length; var4++) {
			if (arg0.field2270[var4] != null || arg0.field2300[var4] > 0) {
				arg0.field2324 = true;
				break;
			}
		}
	}

	@ObfuscatedName("fk.kc(Lhf;Lyf;B)V")
	public static final void method3373(Component arg0, ClientScriptState arg1) {
		arg1.field8226 -= 2;
		int var2 = arg1.field8216[arg1.field8226] - 1;
		int var3 = arg1.field8216[arg1.field8226 + 1];
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		method8295(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("jl.kj(Lyf;I)V")
	public static final void method4663(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method3373(var2, arg0);
	}

	@ObfuscatedName("xb.kn(Lyf;S)V")
	public static final void method10281(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method3373(var2, arg0);
	}

	@ObfuscatedName("ag.kp(Lhf;Lyf;I)V")
	public static final void method666(Component arg0, ClientScriptState arg1) {
		byte var2 = 10;
		int var3 = arg1.field8216[--arg1.field8226];
		method8295(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("ux.km(Lyf;I)V")
	public static final void method9206(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method666(var2, arg0);
	}

	@ObfuscatedName("gk.ky(Lyf;B)V")
	public static final void method3482(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method666(var2, arg0);
	}

	@ObfuscatedName("vm.kk(Lhf;I[B[BLyf;I)V")
	public static final void method9457(Component arg0, int arg1, byte[] arg2, byte[] arg3, ClientScriptState arg4) {
		if (arg0.field2270 == null) {
			if (arg2 == null) {
				return;
			}
			arg0.field2270 = new byte[11][];
			arg0.field2281 = new byte[11][];
			arg0.field2211 = new int[11];
			arg0.field2273 = new int[11];
			arg0.field2300 = new int[11];
		}
		arg0.field2270[arg1] = arg2;
		if (arg2 == null) {
			arg0.field2324 = false;
			for (int var5 = 0; var5 < arg0.field2270.length; var5++) {
				if (arg0.field2270[var5] != null || arg0.field2300[var5] > 0) {
					arg0.field2324 = true;
					break;
				}
			}
		} else {
			arg0.field2324 = true;
		}
		arg0.field2281[arg1] = arg3;
	}

	@ObfuscatedName("ky.kv(Lhf;[B[BLyf;B)V")
	public static final void method5380(Component arg0, byte[] arg1, byte[] arg2, ClientScriptState arg3) {
		int var4 = arg3.field8216[--arg3.field8226] - 1;
		if (var4 < 0 || var4 > 9) {
			throw new RuntimeException();
		}
		method9457(arg0, var4, arg1, arg2, arg3);
	}

	@ObfuscatedName("b.kt(Lyf;I)V")
	public static final void method575(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		byte[] var1 = new byte[] { (byte) arg0.field8216[arg0.field8226] };
		byte[] var2 = new byte[] { (byte) arg0.field8216[arg0.field8226 + 1] };
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Component var4 = Component.method10202(var3);
		method5380(var4, var1, var2, arg0);
	}

	@ObfuscatedName("uu.li(Lyf;B)V")
	public static final void method9230(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8226 -= 10;
		byte[] var3 = null;
		byte[] var4 = null;
		int var5;
		for (var5 = 0; var5 < 10 && arg0.field8216[arg0.field8226 + var5] >= 0; var5 += 2) {
		}
		if (var5 > 0) {
			var3 = new byte[var5 / 2];
			var4 = new byte[var5 / 2];
			for (var5 -= 2; var5 >= 0; var5 -= 2) {
				var3[var5 / 2] = (byte) arg0.field8216[arg0.field8226 + var5];
				var4[var5 / 2] = (byte) arg0.field8216[arg0.field8226 + var5 + 1];
			}
		}
		method5380(var2, var3, var4, arg0);
	}

	@ObfuscatedName("cq.lv(Lhf;Lhq;Lyf;I)V")
	public static final void method1515(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		byte var3 = 10;
		byte[] var4 = new byte[] { (byte) arg2.field8216[arg2.field8226] };
		byte[] var5 = new byte[] { (byte) arg2.field8216[arg2.field8226 + 1] };
		method9457(arg0, var3, var4, var5, arg2);
	}

	@ObfuscatedName("gm.lp(Lyf;I)V")
	public static final void method3595(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1515(var2, var3, arg0);
	}

	@ObfuscatedName("qp.lc(Lhf;IIILyf;S)V")
	public static final void method7097(Component arg0, int arg1, int arg2, int arg3, ClientScriptState arg4) {
		if (arg0.field2211 == null) {
			throw new RuntimeException();
		}
		arg0.field2211[arg1] = arg2;
		arg0.field2273[arg1] = arg3;
	}

	@ObfuscatedName("n.lf(Lhf;Lyf;I)V")
	public static final void method144(Component arg0, ClientScriptState arg1) {
		arg1.field8226 -= 3;
		int var2 = arg1.field8216[arg1.field8226] - 1;
		int var3 = arg1.field8216[arg1.field8226 + 1];
		int var4 = arg1.field8216[arg1.field8226 + 2];
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		method7097(arg0, var2, var3, var4, arg1);
	}

	@ObfuscatedName("ww.lm(Lyf;I)V")
	public static final void method9875(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method144(var2, arg0);
	}

	@ObfuscatedName("ua.ll(Lyf;I)V")
	public static final void method9003(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method144(var2, arg0);
	}

	@ObfuscatedName("fz.lb(Lhf;Lyf;I)V")
	public static final void method3040(Component arg0, ClientScriptState arg1) {
		byte var2 = 10;
		int var3 = arg1.field8216[--arg1.field8226];
		int var4 = arg1.field8216[--arg1.field8226];
		method7097(arg0, var2, var3, var4, arg1);
	}

	@ObfuscatedName("yx.le(Lyf;B)V")
	public static final void method10617(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method3040(var2, arg0);
	}

	@ObfuscatedName("fj.lr(Lyf;I)V")
	public static final void method3051(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method3040(var2, arg0);
	}

	@ObfuscatedName("is.lq(Lhf;ILyf;I)V")
	public static final void method4490(Component arg0, int arg1, ClientScriptState arg2) {
		if (arg0.field2270 == null) {
			throw new RuntimeException();
		}
		if (arg0.field2361 == null) {
			arg0.field2361 = new int[arg0.field2270.length];
		}
		arg0.field2361[arg1] = Integer.MAX_VALUE;
	}

	@ObfuscatedName("if.lo(Lhf;Lyf;I)V")
	public static final void method4568(Component arg0, ClientScriptState arg1) {
		arg1.field8226--;
		int var2 = arg1.field8216[arg1.field8226] - 1;
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		method4490(arg0, var2, arg1);
	}

	@ObfuscatedName("iw.lh(Lyf;I)V")
	public static final void method4520(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method4568(var2, arg0);
	}

	@ObfuscatedName("pp.ls(Lyf;I)V")
	public static final void method7041(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method4568(var2, arg0);
	}

	@ObfuscatedName("hj.lu(Lhf;Lyf;I)V")
	public static final void method4283(Component arg0, ClientScriptState arg1) {
		byte var2 = 10;
		method4490(arg0, var2, arg1);
	}

	@ObfuscatedName("ku.ly(Lyf;B)V")
	public static final void method5145(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method4283(var2, arg0);
	}

	@ObfuscatedName("gl.lg(Lyf;I)V")
	public static final void method3471(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method4283(var2, arg0);
	}

	@ObfuscatedName("xz.lx(Lhf;Lhq;Lyf;I)V")
	public static final void method10189(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2204 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("uw.lj(Lyf;I)V")
	public static final void method9184(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method10189(var2, var3, arg0);
	}

	@ObfuscatedName("u.lw(Lyf;I)V")
	public static final void method263(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method10189(var2, var3, arg0);
	}

	@ObfuscatedName("el.lz(Lhf;Lhq;Lyf;I)V")
	public static final void method2762(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.method3976();
	}

	@ObfuscatedName("aga.ln(Lyf;B)V")
	public static final void method16437(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method2762(var2, var3, arg0);
	}

	@ObfuscatedName("uo.lt(Lyf;B)V")
	public static final void method9234(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method2762(var2, var3, arg0);
	}

	@ObfuscatedName("rl.ld(Ljava/lang/String;Lyf;I)[I")
	public static final int[] method7881(String arg0, ClientScriptState arg1) {
		int[] var2 = null;
		if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
			int var3 = arg1.field8216[--arg1.field8226];
			if (var3 > 0) {
				var2 = new int[var3];
				while (var3-- > 0) {
					var2[var3] = arg1.field8216[--arg1.field8226];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("q.lk(Ljava/lang/String;Lyf;I)[Ljava/lang/Object;")
	public static final Object[] method552(String arg0, ClientScriptState arg1) {
		Object[] var2 = new Object[arg0.length() + 1];
		for (int var3 = var2.length - 1; var3 >= 1; var3--) {
			if (arg0.charAt(var3 - 1) == 's') {
				var2[var3] = arg1.field8218[--arg1.field8211];
			} else if (arg0.charAt(var3 - 1) == 'l') {
				var2[var3] = Long.valueOf(arg1.field8224[--arg1.field8238]);
			} else {
				var2[var3] = Integer.valueOf(arg1.field8216[--arg1.field8226]);
			}
		}
		int var4 = arg1.field8216[--arg1.field8226];
		if (var4 == -1) {
			var2 = null;
		} else {
			var2[0] = Integer.valueOf(var4);
		}
		return var2;
	}

	@ObfuscatedName("vs.mf(Lhf;Lhq;Lyf;I)V")
	public static final void method9424(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2291 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ek.mh(Lyf;I)V")
	public static final void method2818(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method9424(var2, var3, arg0);
	}

	@ObfuscatedName("gk.mx(Lyf;S)V")
	public static final void method3480(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9424(var2, var3, arg0);
	}

	@ObfuscatedName("hf.mg(Lhf;Lhq;Lyf;I)V")
	public static final void method4015(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2244 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("dm.me(Lyf;B)V")
	public static final void method1922(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4015(var2, var3, arg0);
	}

	@ObfuscatedName("a.mn(Lyf;B)V")
	public static final void method607(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4015(var2, var3, arg0);
	}

	@ObfuscatedName("uf.mv(Lhf;Lhq;Lyf;S)V")
	public static final void method9021(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2293 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ux.my(Lyf;I)V")
	public static final void method9207(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method9021(var2, var3, arg0);
	}

	@ObfuscatedName("zl.md(Lyf;B)V")
	public static final void method14050(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9021(var2, var3, arg0);
	}

	@ObfuscatedName("uz.mk(Lhf;Lhq;Lyf;I)V")
	public static final void method9050(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2233 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("dd.mq(Lyf;B)V")
	public static final void method1621(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method9050(var2, var3, arg0);
	}

	@ObfuscatedName("ap.ms(Lyf;I)V")
	public static final void method892(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9050(var2, var3, arg0);
	}

	@ObfuscatedName("ad.mp(Lhf;Lhq;Lyf;B)V")
	public static final void method814(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2280 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("fa.mo(Lyf;S)V")
	public static final void method3103(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method814(var2, var3, arg0);
	}

	@ObfuscatedName("zo.ml(Lyf;I)V")
	public static final void method13944(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method814(var2, var3, arg0);
	}

	@ObfuscatedName("yv.mi(Lhf;Lhq;Lyf;I)V")
	public static final void method10768(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2362 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ht.mr(Lyf;B)V")
	public static final void method4143(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method10768(var2, var3, arg0);
	}

	@ObfuscatedName("xg.mz(Lyf;B)V")
	public static final void method10145(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method10768(var2, var3, arg0);
	}

	@ObfuscatedName("nd.mb(Lhf;Lhq;Lyf;B)V")
	public static final void method5934(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2299 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("sn.mu(Lyf;I)V")
	public static final void method8152(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method5934(var2, var3, arg0);
	}

	@ObfuscatedName("gr.mt(Lyf;I)V")
	public static final void method3575(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method5934(var2, var3, arg0);
	}

	@ObfuscatedName("ahc.mc(Lhf;Lhq;Lyf;B)V")
	public static final void method16608(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2322 = method552(var3, arg2);
		arg0.field2303 = var4;
		arg0.field2179 = true;
	}

	@ObfuscatedName("gw.ma(Lyf;I)V")
	public static final void method3620(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method16608(var2, var3, arg0);
	}

	@ObfuscatedName("hw.mj(Lyf;B)V")
	public static final void method4139(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method16608(var2, var3, arg0);
	}

	@ObfuscatedName("ea.mm(Lyf;B)V")
	public static final void method2884(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		Statics.method307(var2, var3, arg0);
	}

	@ObfuscatedName("yp.nd(Lyf;B)V")
	public static final void method10571(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Statics.method307(var2, var3, arg0);
	}

	@ObfuscatedName("jq.ne(Lhf;Lhq;Lyf;B)V")
	public static final void method4996(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2315 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("tr.ny(Lyf;B)V")
	public static final void method8431(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4996(var2, var3, arg0);
	}

	@ObfuscatedName("vd.nm(Lyf;B)V")
	public static final void method9517(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4996(var2, var3, arg0);
	}

	@ObfuscatedName("jw.nj(Lhf;Lhq;Lyf;B)V")
	public static final void method4926(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2178 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ty.no(Lyf;I)V")
	public static final void method8474(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4926(var2, var3, arg0);
	}

	@ObfuscatedName("ie.np(Lyf;B)V")
	public static final void method4403(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4926(var2, var3, arg0);
	}

	@ObfuscatedName("afp.na(Lhf;Lhq;Lyf;I)V")
	public static final void method16434(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("ac.ni(Lyf;I)V")
	public static final void method721(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method16434(var2, var3, arg0);
	}

	@ObfuscatedName("vz.nb(Lyf;B)V")
	public static final void method9555(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method16434(var2, var3, arg0);
	}

	@ObfuscatedName("kh.nw(Lhf;Lhq;Lyf;B)V")
	public static final void method5206(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("vh.ng(Lhf;Lhq;Lyf;I)V")
	public static final void method9545(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2178 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("vb.nt(Lyf;B)V")
	public static final void method9271(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method9545(var2, var3, arg0);
	}

	@ObfuscatedName("l.nn(Lyf;B)V")
	public static final void method253(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9545(var2, var3, arg0);
	}

	@ObfuscatedName("ji.nk(Lhf;Lhq;Lyf;I)V")
	public static final void method4983(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("ali.nq(Lyf;I)V")
	public static final void method18181(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4983(var2, var3, arg0);
	}

	@ObfuscatedName("tz.nr(Lyf;B)V")
	public static final void method8500(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4983(var2, var3, arg0);
	}

	@ObfuscatedName("ar.nu(Lhf;Lhq;Lyf;B)V")
	public static final void method852(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("cs.nz(Lyf;B)V")
	public static final void method1572(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method852(var2, var3, arg0);
	}

	@ObfuscatedName("xj.ns(Lhf;Lhq;Lyf;I)V")
	public static final void method10311(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("dv.nc(Lyf;S)V")
	public static final void method1921(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method10311(var2, var3, arg0);
	}

	@ObfuscatedName("zm.nv(Lyf;I)V")
	public static final void method13982(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method10311(var2, var3, arg0);
	}

	@ObfuscatedName("acq.nh(Lyf;I)V")
	public static final void method15039(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6586;
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6600;
	}

	@ObfuscatedName("yx.oh(Lhf;Lhq;Lyf;I)V")
	public static final void method10614(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2292 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("agd.oo(Lyf;I)V")
	public static final void method16449(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method10614(var2, var3, arg0);
	}

	@ObfuscatedName("ge.ol(Lyf;B)V")
	public static final void method3569(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method10614(var2, var3, arg0);
	}

	@ObfuscatedName("hs.oi(Lyf;S)V")
	public static final void method4045(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		Statics.method13925(var2, var3, arg0);
	}

	@ObfuscatedName("xz.ot(Lyf;I)V")
	public static final void method10190(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Statics.method13925(var2, var3, arg0);
	}

	@ObfuscatedName("pz.ow(Lhf;Lhq;Lyf;B)V")
	public static final void method6817(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2304 = method552(var3, arg2);
		arg0.field2247 = var4;
		arg0.field2179 = true;
	}

	@ObfuscatedName("aco.oa(Lyf;B)V")
	public static final void method15070(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method6817(var2, var3, arg0);
	}

	@ObfuscatedName("aax.oz(Lyf;B)V")
	public static final void method14149(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method6817(var2, var3, arg0);
	}

	@ObfuscatedName("re.ob(Lhf;Lhq;Lyf;B)V")
	public static final void method7719(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2306 = method552(var3, arg2);
		arg0.field2307 = var4;
		arg0.field2179 = true;
	}

	@ObfuscatedName("ch.op(Lyf;B)V")
	public static final void method1518(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method7719(var2, var3, arg0);
	}

	@ObfuscatedName("rm.oy(Lyf;I)V")
	public static final void method7621(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		Statics.method9616(var2, var3, arg0);
	}

	@ObfuscatedName("l.od(Lyf;I)V")
	public static final void method252(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Statics.method9616(var2, var3, arg0);
	}

	@ObfuscatedName("amq.on(Lhf;Lhq;Lyf;I)V")
	public static final void method18463(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2317 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("kv.os(Lyf;I)V")
	public static final void method5385(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method18463(var2, var3, arg0);
	}

	@ObfuscatedName("vf.og(Lyf;I)V")
	public static final void method9593(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method18463(var2, var3, arg0);
	}

	@ObfuscatedName("ji.oj(Lhf;Lhq;Lyf;I)V")
	public static final void method4978(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2318 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("qu.ok(Lyf;I)V")
	public static final void method7329(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4978(var2, var3, arg0);
	}

	@ObfuscatedName("kp.ou(Lyf;I)V")
	public static final void method5368(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4978(var2, var3, arg0);
	}

	@ObfuscatedName("vh.ov(Lyf;I)V")
	public static final void method9550(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		Statics.method7046(var2, var3, arg0);
	}

	@ObfuscatedName("qh.oc(Lyf;I)V")
	public static final void method7348(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Statics.method7046(var2, var3, arg0);
	}

	@ObfuscatedName("iy.ox(Lyf;I)V")
	public static final void method4599(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("tu.pt(Lyf;I)V")
	public static final void method8395(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("kr.pi(Lyf;I)V")
	public static final void method5327(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("yx.pq(Lyf;I)V")
	public static final void method10610(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("aht.ph(Lyf;I)V")
	public static final void method16760(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("acd.pe(Lyf;B)V")
	public static final void method14942(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("fp.pb(Lyf;I)V")
	public static final void method3105(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("aib.pw(Lyf;B)V")
	public static final void method16907(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("bf.pk(Lhf;Lhq;Lyf;I)V")
	public static final void method1016(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("et.pm(Lhf;Lhq;Lyf;I)V")
	public static final void method2862(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2320 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ss.pa(Lyf;B)V")
	public static final void method8006(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method2862(var2, var3, arg0);
	}

	@ObfuscatedName("yo.pz(Lyf;B)V")
	public static final void method10371(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method2862(var2, var3, arg0);
	}

	@ObfuscatedName("ur.pd(Lhf;Lhq;Lyf;I)V")
	public static final void method9213(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2355 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("r.pn(Lyf;I)V")
	public static final void method322(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method9213(var2, var3, arg0);
	}

	@ObfuscatedName("qs.px(Lyf;I)V")
	public static final void method7331(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9213(var2, var3, arg0);
	}

	@ObfuscatedName("ib.ps(Lhf;Lhq;Lyf;B)V")
	public static final void method4497(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2347 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("hw.po(Lyf;B)V")
	public static final void method4140(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4497(var2, var3, arg0);
	}

	@ObfuscatedName("wu.pr(Lhf;Lhq;Lyf;I)V")
	public static final void method9630(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2326 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("kn.py(Lyf;I)V")
	public static final void method5361(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method9630(var2, var3, arg0);
	}

	@ObfuscatedName("nf.pg(Lyf;B)V")
	public static final void method6080(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method9630(var2, var3, arg0);
	}

	@ObfuscatedName("aov.pv(Lhf;Lhq;Lyf;I)V")
	public static final void method18885(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2327 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ir.pj(Lyf;S)V")
	public static final void method4457(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method18885(var2, var3, arg0);
	}

	@ObfuscatedName("d.pf(Lyf;I)V")
	public static final void method308(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method18885(var2, var3, arg0);
	}

	@ObfuscatedName("aba.pp(Lhf;Lhq;Lyf;B)V")
	public static final void method14768(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2325 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("dn.pu(Lyf;I)V")
	public static final void method2040(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method14768(var2, var3, arg0);
	}

	@ObfuscatedName("uk.pc(Lyf;B)V")
	public static final void method9161(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method14768(var2, var3, arg0);
	}

	@ObfuscatedName("jr.qp(Lhf;Lhq;Lyf;B)V")
	public static final void method4939(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2328 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("a.qx(Lyf;B)V")
	public static final void method608(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method4939(var2, var3, arg0);
	}

	@ObfuscatedName("qz.qt(Lyf;I)V")
	public static final void method7132(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method4939(var2, var3, arg0);
	}

	@ObfuscatedName("xn.qz(Lhf;Lhq;Lyf;I)V")
	public static final void method10108(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2329 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("zj.ql(Lhf;Lhq;Lyf;I)V")
	public static final void method13903(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2308 = method552(var3, arg2);
		arg0.field2309 = var4;
		arg0.field2179 = true;
	}

	@ObfuscatedName("pn.qj(Lyf;B)V")
	public static final void method6830(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method13903(var2, var3, arg0);
	}

	@ObfuscatedName("jm.qr(Lyf;B)V")
	public static final void method4917(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method13903(var2, var3, arg0);
	}

	@ObfuscatedName("tj.qc(Lhf;Lhq;Lyf;I)V")
	public static final void method8443(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2310 = method552(var3, arg2);
		arg0.field2311 = var4;
		arg0.field2179 = true;
	}

	@ObfuscatedName("l.qd(Lyf;I)V")
	public static final void method256(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method8443(var2, var3, arg0);
	}

	@ObfuscatedName("anb.qi(Lyf;I)V")
	public static final void method18814(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method8443(var2, var3, arg0);
	}

	@ObfuscatedName("ajk.qy(Lhf;Lhq;Lyf;B)V")
	public static final void method17418(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2225 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("tu.qw(Lyf;I)V")
	public static final void method8399(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method17418(var2, var3, arg0);
	}

	@ObfuscatedName("amb.qo(Lyf;B)V")
	public static final void method18443(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method17418(var2, var3, arg0);
	}

	@ObfuscatedName("ku.qm(Lhf;Lhq;Lyf;I)V")
	public static final void method5151(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2232 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("acd.qq(Lyf;I)V")
	public static final void method14943(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method5151(var2, var3, arg0);
	}

	@ObfuscatedName("qd.qf(Lyf;I)V")
	public static final void method7260(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method5151(var2, var3, arg0);
	}

	@ObfuscatedName("xt.qu(Lhf;Lhq;Lyf;I)V")
	public static final void method10359(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2323 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("vj.qs(Lyf;B)V")
	public static final void method9575(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method10359(var2, var3, arg0);
	}

	@ObfuscatedName("yx.qa(Lyf;I)V")
	public static final void method10611(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method10359(var2, var3, arg0);
	}

	@ObfuscatedName("acg.qh(Lhf;Lhq;Lyf;I)V")
	public static final void method15017(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2312 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("fg.qv(Lyf;B)V")
	public static final void method2994(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method15017(var2, var3, arg0);
	}

	@ObfuscatedName("su.qk(Lyf;I)V")
	public static final void method8293(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method15017(var2, var3, arg0);
	}

	@ObfuscatedName("ap.qn(Lhf;Lhq;Lyf;B)V")
	public static final void method894(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2330 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("aej.qb(Lyf;B)V")
	public static final void method15382(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method894(var2, var3, arg0);
	}

	@ObfuscatedName("io.rw(Lyf;I)V")
	public static final void method4369(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method894(var2, var3, arg0);
	}

	@ObfuscatedName("yo.rf(Lhf;Lhq;Lyf;I)V")
	public static final void method10372(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2359 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("at.rh(Lyf;I)V")
	public static final void method807(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method10372(var2, var3, arg0);
	}

	@ObfuscatedName("kd.ra(Lhf;Lhq;Lyf;B)V")
	public static final void method5340(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2332 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("kh.rx(Lyf;I)V")
	public static final void method5196(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >> 16];
		method5340(var2, var3, arg0);
	}

	@ObfuscatedName("gd.ry(Lyf;B)V")
	public static final void method3649(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method5340(var2, var3, arg0);
	}

	@ObfuscatedName("fl.rg(Lyf;I)V")
	public static final void method3139(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2194;
	}

	@ObfuscatedName("vq.rz(Lyf;I)V")
	public static final void method9243(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2195;
	}

	@ObfuscatedName("aqc.re(Lyf;I)V")
	public static final void method19195(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2196;
	}

	@ObfuscatedName("fu.rt(Lyf;I)V")
	public static final void method3021(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2197;
	}

	@ObfuscatedName("ac.rl(Lyf;B)V")
	public static final void method718(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2201 ? 1 : 0;
	}

	@ObfuscatedName("tb.rc(Lyf;B)V")
	public static final void method8491(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2200;
	}

	@ObfuscatedName("ez.rr(Lyf;I)V")
	public static final void method2844(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Component var4 = client.method6000(var3, var2);
		arg0.field8216[++arg0.field8226 - 1] = var4 == null ? -1 : var4.field2158;
	}

	@ObfuscatedName("cy.rb(Lyf;I)V")
	public static final void method1581(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2207;
	}

	@ObfuscatedName("sh.ru(Lyf;I)V")
	public static final void method8196(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8218[++arg0.field8211 - 1] = var2.field2261;
	}

	@ObfuscatedName("tj.sv(Lyf;I)V")
	public static final void method8444(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2208;
	}

	@ObfuscatedName("xv.sw(Lyf;I)V")
	public static final void method10097(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2319;
	}

	@ObfuscatedName("nk.ss(Lyf;I)V")
	public static final void method6059(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2272;
	}

	@ObfuscatedName("hi.sx(Lyf;I)V")
	public static final void method4130(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2230;
	}

	@ObfuscatedName("zd.sk(Lyf;B)V")
	public static final void method13986(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2231;
	}

	@ObfuscatedName("gc.si(Lyf;I)V")
	public static final void method3548(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2212;
	}

	@ObfuscatedName("sf.se(Lyf;I)V")
	public static final void method8323(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2228;
	}

	@ObfuscatedName("ns.sn(Lyf;I)V")
	public static final void method6104(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2316;
	}

	@ObfuscatedName("dc.sr(Lyf;I)V")
	public static final void method1974(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2215;
	}

	@ObfuscatedName("iw.sq(Lyf;I)V")
	public static final void method4515(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		int var3 = arg0.field8216[--arg0.field8226];
		ParamType var4 = (ParamType) Statics.field3086.get(var3);
		if (var4.method15152()) {
			arg0.field8218[++arg0.field8211 - 1] = var2.method3975(var3, var4.field9171);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.method3950(var3, var4.field9172);
		}
	}

	@ObfuscatedName("rb.sh(Lyf;I)V")
	public static final void method7913(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2216;
	}

	@ObfuscatedName("th.st(Lyf;I)V")
	public static final void method8633(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2224 == 1 ? var2.field2294 : -1;
	}

	@ObfuscatedName("ace.sl(Lyf;I)V")
	public static final void method15083(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2287;
	}

	@ObfuscatedName("ane.sp(Lyf;I)V")
	public static final void method18619(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		int var3 = -1;
		int var4 = -1;
		class224 var5 = var2.method3970(Statics.field8198);
		if (var5 != null) {
			var3 = var5.field2144;
			var4 = var5.field2146;
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
		arg0.field8216[++arg0.field8226 - 1] = var4;
	}

	@ObfuscatedName("bc.su(Lyf;I)V")
	public static final void method1059(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2287;
	}

	@ObfuscatedName("va.sz(Lyf;I)V")
	public static final void method9414(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		if (var2.field2334 == -1) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field2335;
		}
	}

	@ObfuscatedName("fw.sf(Lyf;B)V")
	public static final void method3099(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2183;
	}

	@ObfuscatedName("dd.sy(Lyf;B)V")
	public static final void method1622(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = client.method17197(var2).method17691();
	}

	@ObfuscatedName("ww.sa(Lyf;B)V")
	public static final void method9873(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		int var3 = arg0.field8216[--arg0.field8226];
		int var4 = var3 - 1;
		if (var2.field2321 == null || var4 >= var2.field2321.length || var2.field2321[var4] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field2321[var4];
		}
	}

	@ObfuscatedName("sf.sb(Lyf;I)V")
	public static final void method8324(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		if (var2.field2279 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field2279;
		}
	}

	@ObfuscatedName("agy.sj(Lhf;Lyf;I)V")
	public static final void method16484(Component arg0, ClientScriptState arg1) {
		if (arg1.field8229 >= 10) {
			throw new RuntimeException();
		} else if (arg0.field2329 != null) {
			HookRequest var2 = new HookRequest();
			var2.field11491 = arg0;
			var2.field11493 = arg0.field2329;
			var2.field11499 = arg1.field8229 + 1;
			client.field11031.method14153(var2);
		}
	}

	@ObfuscatedName("ka.so(Lyf;B)V")
	public static final void method5215(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method16484(var2, arg0);
	}

	@ObfuscatedName("sn.sc(Lyf;I)V")
	public static final void method8153(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method16484(var2, arg0);
	}

	@ObfuscatedName("pu.sg(Lhf;Lyf;I)V")
	public static final void method7071(Component arg0, ClientScriptState arg1) {
		FontMetrics var2 = arg0.method3943(Statics.field7538, client.field10833);
		int var3 = arg1.field8216[--arg1.field8226];
		int var4 = arg1.field8216[--arg1.field8226];
		int var5 = var2.method14542(arg0.field2261, arg0.field2196, arg0.field2229, var4, var3, Statics.field10302);
		arg1.field8216[++arg1.field8226 - 1] = var5;
	}

	@ObfuscatedName("xh.tu(Lyf;I)V")
	public static final void method10205(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method7071(var2, arg0);
	}

	@ObfuscatedName("ge.ta(Lyf;S)V")
	public static final void method3563(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method7071(var2, arg0);
	}

	@ObfuscatedName("dm.tr(Lhf;Lyf;B)V")
	public static final void method1923(Component arg0, ClientScriptState arg1) {
		FontMetrics var2 = arg0.method3943(Statics.field7538, client.field10833);
		int var3 = arg1.field8216[--arg1.field8226];
		Point var4 = var2.method14541(arg0.field2261, arg0.field2196, arg0.field2229, var3, Statics.field10302);
		arg1.field8216[++arg1.field8226 - 1] = var4.x;
		arg1.field8216[++arg1.field8226 - 1] = var4.y;
	}

	@ObfuscatedName("wi.tc(Lyf;I)V")
	public static final void method9888(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method1923(var2, arg0);
	}

	@ObfuscatedName("pp.tj(Lyf;I)V")
	public static final void method7044(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method1923(var2, arg0);
	}

	@ObfuscatedName("kt.te(B)J")
	public static final long method5390() {
		return (long) (++field8209 - 1) << 32 | 0xFFFFFFFFL;
	}

	@ObfuscatedName("du.tm(Lhf;IIB)V")
	public static void method2088(Component arg0, int arg1, int arg2) {
		if (arg0.field2363 == null) {
			NPCType var3 = (NPCType) Statics.field7961.get(arg0.field2294);
			arg0.field2363 = new NpcTypeCustomization(var3, false);
		}
		arg0.field2363.field2688 = method5390();
		arg0.field2363.method4529(arg1, arg2);
	}

	@ObfuscatedName("cc.ty(Lhf;Lyf;I)V")
	public static final void method1586(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		int var3 = arg1.field8216[--arg1.field8226] - 1;
		if (arg0.field2224 != 6) {
			throw new RuntimeException("");
		} else if (var3 >= 0 && var3 < 12) {
			Statics.method5921(arg0, var3, var2, 1.0F, 0, 0, 0, 0, 0, 0);
			client.method4616(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ho.tb(Lyf;I)V")
	public static final void method4278(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method1586(var2, arg0);
	}

	@ObfuscatedName("i.tn(Lyf;I)V")
	public static final void method641(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method1586(var2, arg0);
	}

	@ObfuscatedName("wi.tw(Lhf;Lyf;B)V")
	public static final void method9886(Component arg0, ClientScriptState arg1) {
		arg1.field8226 -= 10;
		int var2 = arg1.field8216[arg1.field8226] - 1;
		int var3 = arg1.field8216[arg1.field8226 + 1];
		int var4 = arg1.field8216[arg1.field8226 + 2];
		int var5 = Math.max(1, arg1.field8216[arg1.field8226 + 3]);
		float var6 = (float) var4 / (float) var5;
		int var7 = arg1.field8216[arg1.field8226 + 4];
		int var8 = arg1.field8216[arg1.field8226 + 5];
		int var9 = arg1.field8216[arg1.field8226 + 6];
		int var10 = arg1.field8216[arg1.field8226 + 7];
		int var11 = arg1.field8216[arg1.field8226 + 8];
		int var12 = arg1.field8216[arg1.field8226 + 9];
		if (arg0.field2224 != 6) {
			throw new RuntimeException("");
		} else if (var2 >= 0 && var2 < 12) {
			Statics.method5921(arg0, var2, var3, var6, var7, var8, var9, var10, var11, var12);
			client.method4616(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("yr.tz(Lyf;I)V")
	public static final void method10675(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method9886(var2, arg0);
	}

	@ObfuscatedName("vc.tf(Lyf;I)V")
	public static final void method9577(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method9886(var2, arg0);
	}

	@ObfuscatedName("dm.th(Lhf;Lyf;B)V")
	public static final void method1924(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		int var3 = arg1.field8216[--arg1.field8226] - 1;
		if (arg0.field2224 != 2) {
			throw new RuntimeException("");
		} else if (var3 >= 0 && var3 < 5) {
			method2088(arg0, var3, var2);
			client.method4616(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ii.tt(Lyf;I)V")
	public static final void method4608(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method1924(var2, arg0);
	}

	@ObfuscatedName("hq.ts(Lyf;I)V")
	public static final void method3935(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method1924(var2, arg0);
	}

	@ObfuscatedName("aov.tp(Lhf;Lyf;S)V")
	public static final void method18884(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		int var3 = arg1.field8216[--arg1.field8226] - 1;
		int var4 = var3;
		if (arg0.field2224 != 6 && arg0.field2224 != 2) {
			throw new RuntimeException("");
		}
		NPCType var5 = (NPCType) Statics.field7961.get(arg0.field2294);
		if (arg0.field2363 == null) {
			arg0.field2363 = new NpcTypeCustomization(var5, arg0.field2224 == 6);
		}
		arg0.field2363.field2688 = method5390();
		if (var5.field2760 != null) {
			if (var3 < 0 || var3 >= var5.field2760.length) {
				throw new RuntimeException("");
			}
			var4 = var5.field2760[var3];
		}
		if (var5.field2705 == null || var4 < 0 || var4 >= var5.field2705.length) {
			throw new RuntimeException("");
		}
		arg0.field2363.field2684[var4] = (short) var2;
		client.method4616(arg0);
	}

	@ObfuscatedName("acr.tv(Lyf;I)V")
	public static final void method15040(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method18884(var2, arg0);
	}

	@ObfuscatedName("kn.to(Lyf;I)V")
	public static final void method5362(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method18884(var2, arg0);
	}

	@ObfuscatedName("ajf.tg(Lhf;Lyf;I)V")
	public static final void method17523(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		int var3 = arg1.field8216[--arg1.field8226] - 1;
		int var4 = var3;
		if (arg0.field2224 != 6 && arg0.field2224 != 2) {
			throw new RuntimeException("");
		}
		NPCType var5 = (NPCType) Statics.field7961.get(arg0.field2294);
		if (arg0.field2363 == null) {
			arg0.field2363 = new NpcTypeCustomization(var5, arg0.field2224 == 6);
		}
		arg0.field2363.field2688 = method5390();
		if (var5.field2715 != null) {
			if (var3 < 0 || var3 >= var5.field2715.length) {
				throw new RuntimeException("");
			}
			var4 = var5.field2715[var3];
		}
		if (var5.field2708 == null || var4 < 0 || var4 >= var5.field2708.length) {
			throw new RuntimeException("");
		}
		arg0.field2363.field2685[var4] = (short) var2;
		client.method4616(arg0);
	}

	@ObfuscatedName("kh.tq(Lyf;B)V")
	public static final void method5197(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		method17523(var2, arg0);
	}

	@ObfuscatedName("f.tx(Lyf;S)V")
	public static final void method219(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		method17523(var2, arg0);
	}

	@ObfuscatedName("sy.tk(Lyf;I)V")
	public static final void method8330(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2194;
	}

	@ObfuscatedName("as.tl(Lyf;S)V")
	public static final void method754(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2195;
	}

	@ObfuscatedName("hv.td(Lyf;I)V")
	public static final void method4297(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2196;
	}

	@ObfuscatedName("vm.ul(Lyf;I)V")
	public static final void method9458(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2197;
	}

	@ObfuscatedName("wi.um(Lyf;I)V")
	public static final void method9887(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = client.method16930(var2) ? 1 : 0;
	}

	@ObfuscatedName("ack.uq(Lyf;I)V")
	public static final void method14951(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2200;
	}

	@ObfuscatedName("wf.uc(Lyf;I)V")
	public static final void method9828(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Statics.field11725[var1 >>> 16];
		Component var4 = client.method6000(var3, var2);
		arg0.field8216[++arg0.field8226 - 1] = var4 == null ? -1 : var4.field2158;
	}

	@ObfuscatedName("ng.ui(Lyf;I)V")
	public static final void method6033(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2210;
	}

	@ObfuscatedName("ef.uf(Lyf;I)V")
	public static final void method2855(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2207;
	}

	@ObfuscatedName("ain.ub(Lyf;B)V")
	public static final void method16908(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2319;
	}

	@ObfuscatedName("zt.uj(Lyf;S)V")
	public static final void method13879(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2272;
	}

	@ObfuscatedName("aat.ut(Lyf;S)V")
	public static final void method14239(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2230;
	}

	@ObfuscatedName("acp.uk(Lyf;B)V")
	public static final void method15033(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2331;
	}

	@ObfuscatedName("gv.uy(Lyf;B)V")
	public static final void method3608(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2231;
	}

	@ObfuscatedName("ar.uw(Lyf;I)V")
	public static final void method850(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2228;
	}

	@ObfuscatedName("agy.up(Lyf;I)V")
	public static final void method16485(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2316;
	}

	@ObfuscatedName("cj.ud(Lyf;B)V")
	public static final void method1603(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2215;
	}

	@ObfuscatedName("po.uh(Lyf;I)V")
	public static final void method6867(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2216;
	}

	@ObfuscatedName("kv.us(Lyf;I)V")
	public static final void method5386(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2224 == 1 ? var2.field2294 : -1;
	}

	@ObfuscatedName("iw.ux(Lyf;B)V")
	public static final void method4516(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2287;
	}

	@ObfuscatedName("ac.ur(Lyf;I)V")
	public static final void method719(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		int var3 = -1;
		int var4 = -1;
		class224 var5 = var2.method3970(Statics.field8198);
		if (var5 != null) {
			var3 = var5.field2144;
			var4 = var5.field2146;
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
		arg0.field8216[++arg0.field8226 - 1] = var4;
	}

	@ObfuscatedName("vg.uu(Lyf;I)V")
	public static final void method9461(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2287;
	}

	@ObfuscatedName("to.uo(Lyf;S)V")
	public static final void method8676(ClientScriptState arg0) {
		Component var1 = Component.method10202(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2334;
	}

	@ObfuscatedName("gz.ue(Lyf;B)V")
	public static final void method3659(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		SubInterface var2 = (SubInterface) client.field10979.method14495((long) var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		}
	}

	@ObfuscatedName("hp.vq(Lyf;I)V")
	public static final void method4059(ClientScriptState arg0) {
		Component var1 = Component.method10202(arg0.field8216[--arg0.field8226]);
		if (var1.field2351 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
			return;
		}
		int var2 = var1.field2351.length;
		for (int var3 = 0; var3 < var1.field2351.length; var3++) {
			if (var1.field2351[var3] == null) {
				var2 = var3;
				break;
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var2;
	}

	@ObfuscatedName("jx.vb(Lyf;B)V")
	public static final void method5074(ClientScriptState arg0) {
		Statics.method4067(arg0);
	}

	@ObfuscatedName("vc.vl(Lyf;B)V")
	public static final void method9581(ClientScriptState arg0) {
		Statics.method4067(arg0);
	}

	@ObfuscatedName("agk.vr(Lyf;I)V")
	public static final void method16443(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = client.method17197(var2).method17691();
	}

	@ObfuscatedName("va.vo(Lyf;I)V")
	public static final void method9418(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		int var3 = arg0.field8216[--arg0.field8226];
		int var4 = var3 - 1;
		if (var2.field2321 == null || var4 >= var2.field2321.length || var2.field2321[var4] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field2321[var4];
		}
	}

	@ObfuscatedName("fv.vv(Lyf;I)V")
	public static final void method3087(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		if (var2.field2279 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field2279;
		}
	}

	@ObfuscatedName("kf.vw(Lyf;B)V")
	public static final void method5170(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Statics.method4943(var1);
	}

	@ObfuscatedName("aau.vt(Lyf;I)V")
	public static final void method14438(ClientScriptState arg0) {
		client.method8276(true);
	}

	@ObfuscatedName("mz.vu(Lyf;B)V")
	public static final void method5847(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = 0;
		if (class695.method9836(var1)) {
			var2 = class695.method9595(var1);
		}
		ClientMessage var3 = Statics.method1604(ClientProt.RESUME_P_COUNTDIALOG, client.field10849.field794);
		var3.field11432.p4(var2);
		client.field10849.method934(var3);
	}

	@ObfuscatedName("yj.vi(Lyf;I)V")
	public static final void method10446(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var2 = Statics.method1604(ClientProt.RESUME_P_NAMEDIALOG, client.field10849.field794);
		var2.field11432.p1(var1.length() + 1);
		var2.field11432.pjstr(var1);
		client.field10849.method934(var2);
	}

	@ObfuscatedName("qh.va(Lyf;I)V")
	public static final void method7349(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var2 = Statics.method1604(ClientProt.RESUME_P_STRINGDIALOG, client.field10849.field794);
		var2.field11432.p1(var1.length() + 1);
		var2.field11432.pjstr(var1);
		client.field10849.method934(var2);
	}

	@ObfuscatedName("ub.vy(Lyf;S)V")
	public static final void method9082(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		client.method15190(var1, var2);
	}

	@ObfuscatedName("ge.ve(Lyf;I)V")
	public static final void method3571(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Component var4 = Component.method10202(var3);
		client.method16750(var4, var1, var2);
	}

	@ObfuscatedName("qe.vm(Lyf;I)V")
	public static final void method7226(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ActiveComponent var3 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		client.method16750(var3.field8242, var1, var2);
	}

	@ObfuscatedName("na.vg(Lyf;B)V")
	public static final void method5998(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ClientMessage var2 = Statics.method1604(ClientProt.RESUME_P_OBJDIALOG, client.field10849.field794);
		var2.field11432.p2(var1);
		client.field10849.method934(var2);
	}

	@ObfuscatedName("acb.vp(Lyf;S)V")
	public static final void method14990(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		client.method4489(var1, new SubInterface(var2, 3), null, true);
	}

	@ObfuscatedName("aar.vd(Lyf;S)V")
	public static final void method14295(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		SubInterface var2 = (SubInterface) client.field10979.method14495((long) var1);
		if (var2 != null && var2.field11570 == 3) {
			client.method214(var2, true, true);
		}
	}

	@ObfuscatedName("hv.vh(Lyf;B)V")
	public static final void method4298(ClientScriptState arg0) {
		client.method4406((String) arg0.field8218[--arg0.field8211]);
	}

	@ObfuscatedName("ah.vz(Lyf;I)V")
	public static final void method708(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		String var3 = (String) arg0.field8218[--arg0.field8211];
		if (var1 == 99) {
			DeveloperConsole.method4285(var3);
		} else if (var1 == 98) {
			DeveloperConsole.method722(var3);
		} else {
			ChatHistory.method2664(var1, var2, "", "", "", var3, null);
		}
	}

	@ObfuscatedName("nk.vj(Lyf;B)V")
	public static final void method6057(ClientScriptState arg0) {
		arg0.field8226 -= 11;
		class318[] var1 = class318.method13948();
		class316[] var2 = class316.method2774();
		MessageBox.method3004(var1[arg0.field8216[arg0.field8226]], var2[arg0.field8216[arg0.field8226 + 1]], arg0.field8216[arg0.field8226 + 2], arg0.field8216[arg0.field8226 + 3], arg0.field8216[arg0.field8226 + 4], arg0.field8216[arg0.field8226 + 5], arg0.field8216[arg0.field8226 + 6], arg0.field8216[arg0.field8226 + 7], arg0.field8216[arg0.field8226 + 8], arg0.field8216[arg0.field8226 + 9], arg0.field8216[arg0.field8226 + 10]);
	}

	@ObfuscatedName("uv.vc(Lyf;I)V")
	public static final void method9179(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ClientMessage var2 = Statics.method1604(ClientProt.RESUME_P_HSLDIALOG, client.field10849.field794);
		var2.field11432.p2(var1);
		client.field10849.method934(var2);
	}

	@ObfuscatedName("qa.vn(Lyf;S)V")
	public static final void method7343(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var2 = Statics.method1604(ClientProt.RESUME_P_CLANFORUMQFCDIALOG, client.field10849.field794);
		var2.field11432.p1(var1.length() + 1);
		var2.field11432.pjstr(var1);
		client.field10849.method934(var2);
	}

	@ObfuscatedName("qo.vf(Lyf;I)V")
	public static final void method7314(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		short var4 = 255;
		short var5 = 256;
		Statics.field1798.method3191(class173.field1828, var1, var2, var4, SubBussType.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("jf.vk(Lyf;I)V")
	public static final void method4652(ClientScriptState arg0) {
		Statics.field1798.method3174(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("o.wn(Lyf;I)V")
	public static final void method475(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		Statics.field1798.method3235(arg0.field8216[arg0.field8226], 255);
	}

	@ObfuscatedName("e.wa(Lyf;I)V")
	public static final void method133(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		short var5 = 256;
		Statics.field1798.method3191(class173.field1828, var1, var2, var4, SubBussType.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("ahb.wo(Lyf;I)V")
	public static final void method16668(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		Statics.field1798.method3235(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1]);
	}

	@ObfuscatedName("aj.wu(Lyf;I)V")
	public static final void method974(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		Statics.field1798.method3235(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 2]);
	}

	@ObfuscatedName("ev.wk(Lyf;I)V")
	public static final void method2776(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		short var5 = 256;
		Statics.field1798.method3191(class173.field1828, var1, var2, var4, SubBussType.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("iq.wj(Lyf;I)V")
	public static final void method4376(ClientScriptState arg0) {
		arg0.field8226 -= 5;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		Statics.field1798.method3191(class173.field1828, var1, var2, var4, SubBussType.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("pw.wr(Lyf;I)V")
	public static final void method6794(ClientScriptState arg0) {
		Statics.field1798.method3178();
	}

	@ObfuscatedName("sk.wl(Lyf;I)V")
	public static final void method8143(ClientScriptState arg0) {
		arg0.field8226 -= 6;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		int var6 = arg0.field8216[arg0.field8226 + 5];
		Sound var7 = Statics.field1798.method3236(class173.field1832, Statics.field1798, var1, var2, var4, SubBussType.field1805.method3034(), class174.field1835, 0.0F, 0.0F, null, 0, var5, false);
		if (var7 != null) {
			Statics.field1798.method3251(var7, var6, var3);
		}
	}

	@ObfuscatedName("wb.wp(Lyf;I)V")
	public static final void method9772(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		Statics.field1798.method3208(var1);
	}

	@ObfuscatedName("hx.wv(Lyf;S)V")
	public static final void method3919(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		Statics.field1798.method3153(var1);
	}

	@ObfuscatedName("a.wg(Lyf;B)V")
	public static final void method610(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Statics.field1798.method3156(var1, var2, var3);
	}

	@ObfuscatedName("ge.wb(Lyf;I)V")
	public static final void method3567(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.field1798.method3157(var1, var2);
	}

	@ObfuscatedName("nv.wq(Lyf;B)V")
	public static final void method6113(ClientScriptState arg0) {
		arg0.field8226 -= 5;
	}

	@ObfuscatedName("ru.wf(Lyf;S)V")
	public static final void method7935(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method14439(var1, var2, false);
	}

	@ObfuscatedName("alm.wc(Lyf;B)V")
	public static final void method18193(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method14483(var1, var2, false);
	}

	@ObfuscatedName("iz.wt(Lyf;I)V")
	public static final void method4615(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method6002(var1, var2, false);
	}

	@ObfuscatedName("yc.wh(Lyf;I)V")
	public static final void method13837(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((InvType) Statics.field7762.get(var1)).field9263;
	}

	@ObfuscatedName("su.wd(Lyf;I)V")
	public static final void method8294(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		InvType var1 = (InvType) Statics.field7762.get(arg0.field8216[arg0.field8226]);
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = -1;
		for (int var4 = 0; var4 < var1.field9264; var4++) {
			if (var1.field9266[var4] == var2) {
				var3 = var1.field9265[var4];
				break;
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("jh.ww(Lyf;B)V")
	public static final void method5078(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method15241(var1, var2, var3, false);
	}

	@ObfuscatedName("nn.ws(Lyf;S)V")
	public static final void method6047(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field7410.method700(var1);
	}

	@ObfuscatedName("ze.xl(Lyf;I)V")
	public static final void method13990(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field7410.method675(var1);
	}

	@ObfuscatedName("xr.xw(Lyf;S)V")
	public static final void method10231(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field4490.method16521().method9433();
	}

	@ObfuscatedName("gd.xu(Lyf;I)V")
	public static final void method3650(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = var1 >> 14 & 0x3FFF;
	}

	@ObfuscatedName("xk.xv(Lyf;I)V")
	public static final void method10327(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = var1 >> 28;
	}

	@ObfuscatedName("ain.xn(Lyf;I)V")
	public static final void method16909(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = var1 & 0x3FFF;
	}

	@ObfuscatedName("tg.xg(Lyf;B)V")
	public static final void method8685(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = Statics.field4490.method16537();
	}

	@ObfuscatedName("yw.xa(Lyf;I)V")
	public static final void method10604(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = var1.field11478;
	}

	@ObfuscatedName("tk.xi(Lyf;I)V")
	public static final void method8886(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = var1.field11479;
	}

	@ObfuscatedName("abd.xz(Lyf;I)V")
	public static final void method14925(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = var1.field11480;
	}

	@ObfuscatedName("po.xh(Lyf;I)V")
	public static final void method6869(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = var1.field11477;
	}

	@ObfuscatedName("h.xx(Lyf;I)V")
	public static final void method595(ClientScriptState arg0) {
		CoordGrid var1 = new CoordGrid();
		var1.method9434((CoordFine) arg0.field8218[--arg0.field8211]);
		arg0.field8216[++arg0.field8226 - 1] = var1.method9433();
	}

	@ObfuscatedName("rl.xs(Lyf;B)V")
	public static final void method7882(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		arg0.field8218[++arg0.field8211 - 1] = CoordFine.method849(var1, var2);
	}

	@ObfuscatedName("kh.xr(Lyf;I)V")
	public static final void method5198(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10948 ? 1 : 0;
	}

	@ObfuscatedName("mc.xc(Lyf;I)V")
	public static final void method5895(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("xd.xb(Lyf;B)V")
	public static final void method10296(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 100;
	}

	@ObfuscatedName("ir.xe(Lyf;B)V")
	public static final void method4458(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("nv.xd(Lyf;I)V")
	public static final void method6115(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("bc.xj(Lyf;I)V")
	public static final void method1062(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method14439(var1, var2, true);
	}

	@ObfuscatedName("ahd.xo(Lyf;I)V")
	public static final void method16716(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method14483(var1, var2, true);
	}

	@ObfuscatedName("iy.xq(Lyf;I)V")
	public static final void method4601(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method15241(var1, var2, var3, true);
	}

	@ObfuscatedName("pm.xf(Lyf;I)V")
	public static final void method6808(ClientScriptState arg0) {
		if (client.field10949 >= 2) {
			arg0.field8216[++arg0.field8226 - 1] = client.field10949;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("iq.xt(Lyf;I)V")
	public static final void method4377(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10831;
	}

	@ObfuscatedName("vp.ye(Lyf;I)V")
	public static final void method9468(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field8755.field8746;
	}

	@ObfuscatedName("xs.yj(Lyf;B)V")
	public static final void method10219(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field11102;
	}

	@ObfuscatedName("amz.yk(Lyf;I)V")
	public static final void method18512(ClientScriptState arg0) {
		if (client.field10950 >= 5 && client.field10950 <= 9) {
			arg0.field8216[++arg0.field8226 - 1] = client.field10950;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("rz.yn(Lyf;B)V")
	public static final void method7712(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field11006 ? 1 : 0;
	}

	@ObfuscatedName("fl.yg(Lyf;I)V")
	public static final void method3140(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field4490.field12064;
	}

	@ObfuscatedName("vd.yp(Lyf;I)V")
	public static final void method9515(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method7077(var1, var2, false, false);
	}

	@ObfuscatedName("kl.yz(Lyf;B)V")
	public static final void method5242(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method7077(var1, var2, true, false);
	}

	@ObfuscatedName("kg.yw(Lyf;I)V")
	public static final void method5141(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field1680.getId();
	}

	@ObfuscatedName("va.yx(Lyf;S)V")
	public static final void method9412(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = (var2 << 14) + var1;
		int var6 = (var3 << 28) + var5;
		int var7 = var4 + var6;
		arg0.field8216[++arg0.field8226 - 1] = var7;
	}

	@ObfuscatedName("fr.yr(Lyf;B)V")
	public static final void method3377(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10772;
	}

	@ObfuscatedName("uf.yl(Lyf;I)V")
	public static final void method9022(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = class33.method270();
	}

	@ObfuscatedName("sd.yi(Lyf;I)V")
	public static final void method8297(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ach.ym(Lyf;B)V")
	public static final void method14987(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10774 ? 1 : 0;
	}

	@ObfuscatedName("ank.yf(Lyf;B)V")
	public static final void method18737(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field9182.method9086();
	}

	@ObfuscatedName("dl.ya(Lyf;I)V")
	public static final void method2091(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field9182.method9092();
	}

	@ObfuscatedName("aks.yd(Lyf;I)V")
	public static final void method17810(ClientScriptState arg0) {
		method4597(MiniMenu.method4924(), arg0);
	}

	@ObfuscatedName("jk.yc(Lyf;B)V")
	public static final void method5111(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = MiniMenu.field546;
		arg0.field8216[++arg0.field8226 - 1] = MiniMenu.field543;
	}

	@ObfuscatedName("ake.yu(Lyf;I)V")
	public static final void method17803(ClientScriptState arg0) {
		class1172 var1 = MiniMenu.method4924();
		if (MiniMenu.method18429(var1) == 4) {
			ObjectWrapper var2 = (ObjectWrapper) client.field10838.method14495(var1.method19370());
			if (var2 != null) {
				arg0.field8221 = (PathingEntity) var2.field11436;
				arg0.field8216[++arg0.field8226 - 1] = 1;
				return;
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ai.yt(Lyf;I)V")
	public static final void method724(ClientScriptState arg0) {
		class1172 var1 = MiniMenu.method4924();
		if (MiniMenu.method18429(var1) == 7) {
			int var2 = (int) var1.method19368();
			if (var2 >= 0 && var2 <= class40.field698) {
				PlayerEntity var3 = client.field10944[var2];
				if (var3 != null) {
					arg0.field8221 = var3;
					arg0.field8216[++arg0.field8226 - 1] = 1;
					return;
				}
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("fj.zh(Lyf;I)V")
	public static final void method3049(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10972;
	}

	@ObfuscatedName("nu.za(Lyf;I)V")
	public static final void method6076(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field4490.field10395.method316() >> 3;
	}

	@ObfuscatedName("ve.zn(Lyf;S)V")
	public static final void method9455(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (Statics.field10250 != null && Statics.field10250.equalsIgnoreCase(var1)) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("sn.zt(Lyf;B)V")
	public static final void method8154(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field9182.method9101() ? 1 : 0;
		arg0.field8216[++arg0.field8226 - 1] = Statics.field9182.method9121() ? 1 : 0;
		arg0.field8216[++arg0.field8226 - 1] = Statics.field9182.method9125() ? 1 : 0;
	}

	@ObfuscatedName("dz.zi(Lyf;B)V")
	public static final void method1894(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10973 ? 1 : 0;
		arg0.field8218[++arg0.field8211 - 1] = client.field10977 == null ? "" : client.field10977;
		arg0.field8218[++arg0.field8211 - 1] = client.field11039 == null ? "" : client.field11039;
	}

	@ObfuscatedName("aob.zj(Lyf;I)V")
	public static final void method18863(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		EnumType var3 = (EnumType) Statics.field8514.get(var1);
		if (ScriptVarType.STRING != var3.field8775) {
		}
		arg0.field8218[++arg0.field8211 - 1] = var3.method14849(var2);
	}

	@ObfuscatedName("uw.zw(Lyf;I)V")
	public static final void method9185(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		EnumType var5 = (EnumType) Statics.field8514.get(var3);
		if (var5.field8781.getId() != var1 || var5.field8775.getId() != var2) {
			throw new RuntimeException(var3 + " " + var4);
		} else if (var2 == ScriptVarType.STRING.getId()) {
			arg0.field8218[++arg0.field8211 - 1] = var5.method14849(var4);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var5.method14848(var4);
		}
	}

	@ObfuscatedName("sd.zq(Lyf;I)V")
	public static final void method8298(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var4 = (EnumType) Statics.field8514.get(var2);
		if (var4.field8775.getId() != var1) {
			throw new RuntimeException();
		}
		arg0.field8216[++arg0.field8226 - 1] = var4.method14851(var3) ? 1 : 0;
	}

	@ObfuscatedName("gj.zo(Lyf;I)V")
	public static final void method3617(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		EnumType var3 = (EnumType) Statics.field8514.get(var1);
		if (ScriptVarType.STRING != var3.field8775) {
			throw new RuntimeException();
		}
		arg0.field8216[++arg0.field8226 - 1] = var3.method14851(var2) ? 1 : 0;
	}

	@ObfuscatedName("xh.zk(Lyf;I)V")
	public static final void method10206(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		EnumType var2 = (EnumType) Statics.field8514.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.method14847();
	}

	@ObfuscatedName("aaj.zm(Lyf;I)V")
	public static final void method14456(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var4 = (EnumType) Statics.field8514.get(var2);
		if (var4.field8775.getId() != var1) {
			throw new RuntimeException();
		}
		int[] var5 = var4.method14867(var3);
		int var6 = 0;
		if (var5 != null) {
			var6 = var5.length;
		}
		arg0.field8216[++arg0.field8226 - 1] = var6;
	}

	@ObfuscatedName("wa.zd(Lyf;I)V")
	public static final void method9608(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		EnumType var3 = (EnumType) Statics.field8514.get(var1);
		if (ScriptVarType.STRING != var3.field8775) {
			throw new RuntimeException();
		}
		int[] var4 = var3.method14867(var2);
		int var5 = 0;
		if (var4 != null) {
			var5 = var4.length;
		}
		arg0.field8216[++arg0.field8226 - 1] = var5;
	}

	@ObfuscatedName("to.zu(Lyf;I)V")
	public static final void method8677(ClientScriptState arg0) {
		arg0.field8226 -= 5;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		if (var3 == -1) {
			throw new RuntimeException();
		}
		EnumType var6 = (EnumType) Statics.field8514.get(var3);
		if (var6.field8781.getId() != var2) {
			throw new RuntimeException();
		} else if (var6.field8775.getId() == var1) {
			int[] var7 = var6.method14867(var4);
			if (var5 < 0 || var7 == null || var7.length <= var5) {
				throw new RuntimeException();
			}
			arg0.field8216[++arg0.field8226 - 1] = var7[var5];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("va.zv(Lyf;I)V")
	public static final void method9416(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var2 = Statics.method1604(ClientProt.SEND_EMAIL_VALIDATION_CODE, client.field10835.field794);
		var2.field11432.p1(Packet.pjstrlen(var1));
		var2.field11432.pjstr(var1);
		client.field10835.method934(var2);
	}

	@ObfuscatedName("sc.zc(Lyf;I)V")
	public static final void method8368(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var3 = Statics.method1604(ClientProt.CHANGE_EMAIL_ADDRESS, client.field10835.field794);
		var3.field11432.p2(Packet.pjstrlen(var1) + Packet.pjstrlen(var2));
		var3.field11432.pjstr(var1);
		var3.field11432.pjstr(var2);
		client.field10835.method934(var3);
	}

	@ObfuscatedName("du.zp(Lyf;I)V")
	public static final void method2090(ClientScriptState arg0) {
		arg0.field8211--;
		arg0.field8226 -= 3;
		String var1 = (String) arg0.field8218[arg0.field8211];
		boolean var2 = arg0.field8216[arg0.field8226] == 1;
		boolean var3 = arg0.field8216[arg0.field8226 + 1] == 1;
		boolean var4 = arg0.field8216[arg0.field8226 + 2] == 1;
		ClientMessage var5 = Statics.method1604(ClientProt.ADD_NEW_EMAIL_ADDRESS, client.field10835.field794);
		var5.field11432.p2(Packet.pjstrlen(var1) + 1);
		var5.field11432.pjstr(var1);
		int var6 = 0;
		if (var2) {
			var6 |= 0x1;
		}
		if (var3) {
			var6 |= 0x2;
		}
		if (var4) {
			var6 |= 0x4;
		}
		var5.field11432.p1(var6);
		client.field10835.method934(var5);
	}

	@ObfuscatedName("vc.zz(Lyf;I)V")
	public static final void method9578(ClientScriptState arg0) {
		if (client.field11080 == 0) {
			arg0.field8216[++arg0.field8226 - 1] = -2;
		} else if (client.field11080 == 1) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = client.field10811;
		}
	}

	@ObfuscatedName("pz.zs(Lyf;I)V")
	public static final void method6818(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11080 != 2 || var1 >= client.field10811) {
			arg0.field8218[++arg0.field8211 - 1] = "";
			arg0.field8218[++arg0.field8211 - 1] = "";
			return;
		}
		Friend var2 = client.field11065[var1];
		arg0.field8218[++arg0.field8211 - 1] = var2.field606;
		if (var2.field607 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field607;
		}
	}

	@ObfuscatedName("ajd.zb(Lyf;I)V")
	public static final void method17449(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11080 == 2 && var1 < client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = client.field11065[var1].field610;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("ik.zg(Lyf;B)V")
	public static final void method4618(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11080 == 2 && var1 < client.field10811) {
			arg0.field8218[++arg0.field8211 - 1] = client.field11065[var1].field614;
		} else {
			arg0.field8218[++arg0.field8211 - 1] = "";
		}
	}

	@ObfuscatedName("xs.zr(Lyf;I)V")
	public static final void method10221(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		client.method10344(var1, var2);
	}

	@ObfuscatedName("pj.zf(Lyf;I)V")
	public static final void method6980(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		client.method10360(var1, var2);
	}

	@ObfuscatedName("ij.aag(Lyf;I)V")
	public static final void method4333(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		client.method6829(var1);
	}

	@ObfuscatedName("yg.aak(Lyf;I)V")
	public static final void method10522(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		client.method9390(var1);
	}

	@ObfuscatedName("vx.aad(Lyf;I)V")
	public static final void method9247(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Statics.method1002(var1, false);
	}

	@ObfuscatedName("qn.aaa(Lyf;I)V")
	public static final void method7365(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		client.method1574(var1);
	}

	@ObfuscatedName("ex.aax(Lyf;I)V")
	public static final void method2976(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		client.method14701(var1, var2);
	}

	@ObfuscatedName("nd.aat(Lyf;B)V")
	public static final void method5941(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.field8216[++arg0.field8226 - 1] = client.method3060(var1) ? 1 : 0;
	}

	@ObfuscatedName("hs.aas(Lyf;B)V")
	public static final void method4044(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11080 == 2 && var1 < client.field10811) {
			arg0.field8218[++arg0.field8211 - 1] = client.field11065[var1].field612;
		} else {
			arg0.field8218[++arg0.field8211 - 1] = "";
		}
	}

	@ObfuscatedName("px.aar(Lyf;I)V")
	public static final void method6844(ClientScriptState arg0) {
		if (client.field11055 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Statics.field7421;
		}
	}

	@ObfuscatedName("vr.aai(Lyf;I)V")
	public static final void method9303(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11055 == null || var1 >= Statics.field7421) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Statics.field9267[var1].field756;
		}
	}

	@ObfuscatedName("nq.aau(Lyf;I)V")
	public static final void method6060(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field2154;
	}

	@ObfuscatedName("dm.aao(Lyf;I)V")
	public static final void method1927(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		client.method16638(var1);
	}

	@ObfuscatedName("yo.aaj(Lyf;I)V")
	public static final void method10373(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field1914;
	}

	@ObfuscatedName("ka.aab(Lyf;B)V")
	public static final void method5213(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Statics.method1600(var1);
	}

	@ObfuscatedName("ap.aae(Lyf;I)V")
	public static final void method893(ClientScriptState arg0) {
		client.method8328();
	}

	@ObfuscatedName("zs.aal(Lyf;S)V")
	public static final void method14043(ClientScriptState arg0) {
		if (client.field11080 == 0) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = client.field11084;
		}
	}

	@ObfuscatedName("ad.aan(Lyf;I)V")
	public static final void method815(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11080 == 0 || var1 >= client.field11084) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = client.field11086[var1].field597;
		}
	}

	@ObfuscatedName("ts.aah(Lyf;S)V")
	public static final void method8657(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.field8216[++arg0.field8226 - 1] = client.method6789(var1) ? 1 : 0;
	}

	@ObfuscatedName("eb.aaw(Lyf;I)V")
	public static final void method2964(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Statics.field9267 == null || var1 >= Statics.field7421 || !Statics.field9267[var1].field757.equalsIgnoreCase(Statics.field4490.field12062)) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		}
	}

	@ObfuscatedName("ip.aac(Lyf;I)V")
	public static final void method4522(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11055 == null || var1 >= Statics.field7421) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Statics.field9267[var1].field759;
		}
	}

	@ObfuscatedName("ad.aav(Lyf;B)V")
	public static final void method816(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11080 == 2 && var1 >= 0 && var1 < client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = client.field11065[var1].field611;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("sg.aam(Lyf;I)V")
	public static final void method8379(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.field8216[++arg0.field8226 - 1] = client.method7345(var1);
	}

	@ObfuscatedName("ad.abr(Lyf;I)V")
	public static final void method819(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field8146;
	}

	@ObfuscatedName("uw.abv(Lyf;I)V")
	public static final void method9186(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Statics.method1002(var1, true);
	}

	@ObfuscatedName("xq.abq(Lyf;B)V")
	public static final void method10339(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = client.field11086[var1].field595 ? 1 : 0;
	}

	@ObfuscatedName("re.abw(Lyf;I)V")
	public static final void method7717(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11055 == null || var1 >= Statics.field7421) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Statics.field9267[var1].field757;
		}
	}

	@ObfuscatedName("eu.abf(Lyf;B)V")
	public static final void method2736(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11080 == 2 && var1 < client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = client.field11065[var1].field609 ? 1 : 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("pj.abi(Lyf;I)V")
	public static final void method6981(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field11080 == 2 && var1 < client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = client.field11065[var1].field613 ? 1 : 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("tj.abc(Lyf;I)V")
	public static final void method8445(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3397().size();
	}

	@ObfuscatedName("yd.abg(Lyf;I)V")
	public static final void method13795(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		int var3 = arg0.field8216[arg0.field8226 + 2];
		PlayerGroupMember var4 = Statics.field6721.method3392(var1);
		if (var4.method3504() == null) {
			var4.method3503(client.field10837);
		}
		if (!var2) {
			VarBitType var6 = (VarBitType) Statics.field8736.get(var3);
			arg0.field8216[++arg0.field8226 - 1] = var6.getVarbitValue(var4.method3504().method14728(var6.baseVar.field1706));
			return;
		}
		class859 var5 = (class859) Statics.field8485.get(var3);
		switch(var5.field1704.field4823.field4841) {
			case 2:
				arg0.field8216[++arg0.field8226 - 1] = var4.method3504().method14728(var5.field1706);
				break;
			case 4:
				arg0.field8224[++arg0.field8238 - 1] = var4.method3504().method14730(var5.field1706);
				break;
			default:
				arg0.field8218[++arg0.field8211 - 1] = var4.method3504().method14738(var5.field1706);
		}
	}

	@ObfuscatedName("io.abn(Lyf;I)V")
	public static final void method4370(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3392(var1).method3493();
	}

	@ObfuscatedName("pv.abj(Lyf;I)V")
	public static final void method6975(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3392(var1).method3497();
	}

	@ObfuscatedName("dg.aba(Lyf;I)V")
	public static final void method2584(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3392(var1).method3491();
	}

	@ObfuscatedName("au.abz(Lyf;I)V")
	public static final void method844(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3392(var1).method3495().getId();
	}

	@ObfuscatedName("tz.abl(Lyf;B)V")
	public static final void method8504(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3392(var1).method3500() ? 1 : 0;
	}

	@ObfuscatedName("eb.abp(Lyf;I)V")
	public static final void method2963(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = Statics.field6721.method3392(var1).method3488();
	}

	@ObfuscatedName("l.abm(Lyf;B)V")
	public static final void method259(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		boolean var3 = arg0.field8216[arg0.field8226 + 2] == 1;
		class642 var4 = Statics.field6721.method3392(var1).method3501(var2);
		arg0.field8216[++arg0.field8226 - 1] = var3 ? var4.method10161() : var4.method10175();
	}

	@ObfuscatedName("ahb.abx(Lyf;I)V")
	public static final void method16666(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3390() == var1 ? 1 : 0;
	}

	@ObfuscatedName("xd.abk(Lyf;I)V")
	public static final void method10300(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3429().size();
	}

	@ObfuscatedName("qs.aby(Lyf;I)V")
	public static final void method7330(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = ((PlayerGroupBanned) Statics.field6721.method3429().get(var1)).method3540();
	}

	@ObfuscatedName("ux.abe(Lyf;B)V")
	public static final void method9211(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = Statics.field6721.method3386();
	}

	@ObfuscatedName("km.abd(Lyf;I)V")
	public static final void method5373(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3387();
	}

	@ObfuscatedName("au.abt(Lyf;B)V")
	public static final void method847(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = (int) (Statics.field6721.method3388() / 60000L);
	}

	@ObfuscatedName("nj.aca(Lyf;B)V")
	public static final void method5971(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = (int) ((MonotonicTime.method3655() - Statics.field6721.method3388() - Statics.field1238) / 1000L);
	}

	@ObfuscatedName("sv.acd(Lyf;B)V")
	public static final void method7976(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3441() ? 1 : 0;
	}

	@ObfuscatedName("ahs.ack(Lyf;I)V")
	public static final void method16753(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6721.method3444().getId();
	}

	@ObfuscatedName("fn.act(Lyf;B)V")
	public static final void method3067(ClientScriptState arg0) {
		if (Statics.field6867 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
			arg0.field8227 = Statics.field6867;
			arg0.field8234.put(VarDomainType.CLAN_SETTING, method991(arg0.field8227));
		}
	}

	@ObfuscatedName("acn.aci(Lyf;I)V")
	public static final void method15144(ClientScriptState arg0) {
		if (Statics.field1890 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
			arg0.field8227 = Statics.field1890;
			arg0.field8234.put(VarDomainType.CLAN_SETTING, method991(arg0.field8227));
		}
	}

	@ObfuscatedName("oh.ach(Lyf;B)V")
	public static final void method6126(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8227.field3093;
	}

	@ObfuscatedName("fs.acb(Lyf;I)V")
	public static final void method3029(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3097 ? 1 : 0;
	}

	@ObfuscatedName("nq.acx(Lyf;I)V")
	public static final void method6061(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3098;
	}

	@ObfuscatedName("ry.acc(Lyf;B)V")
	public static final void method7702(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3090;
	}

	@ObfuscatedName("kh.acw(Lyf;B)V")
	public static final void method5203(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3100;
	}

	@ObfuscatedName("ng.acv(Lyf;I)V")
	public static final void method6032(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3117;
	}

	@ObfuscatedName("hy.acu(Lyf;I)V")
	public static final void method4068(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3095;
	}

	@ObfuscatedName("qw.acg(Lyf;I)V")
	public static final void method7304(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8227.field3120[var1];
	}

	@ObfuscatedName("eu.acz(Lyf;I)V")
	public static final void method2734(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3104[var1];
	}

	@ObfuscatedName("jk.acp(Lyf;I)V")
	public static final void method5112(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3108[var1] ? 1 : 0;
	}

	@ObfuscatedName("fj.acq(Lyf;B)V")
	public static final void method3050(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3111;
	}

	@ObfuscatedName("ji.acr(Lyf;I)V")
	public static final void method4985(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8227.field3114[var1];
	}

	@ObfuscatedName("o.acj(Lyf;S)V")
	public static final void method476(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.method5257(var1, var2, var3);
	}

	@ObfuscatedName("rl.aco(Lyf;I)V")
	public static final void method7885(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3101;
	}

	@ObfuscatedName("aof.ace(Lyf;I)V")
	public static final void method18888(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3110;
	}

	@ObfuscatedName("ho.acl(Lyf;I)V")
	public static final void method4275(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.method5256((String) arg0.field8218[--arg0.field8211]);
	}

	@ObfuscatedName("to.acy(Lyf;I)V")
	public static final void method8678(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = arg0.field8227.method5261()[arg0.field8216[arg0.field8226 - 1]];
	}

	@ObfuscatedName("df.acf(Lyf;B)V")
	public static final void method2049(ClientScriptState arg0) {
		client.method9925(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("anw.acs(Lyf;I)V")
	public static final void method18830(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		client.method7045(var1, var2);
	}

	@ObfuscatedName("lv.acn(Lyf;I)V")
	public static final void method5400(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3107[var1];
	}

	@ObfuscatedName("n.adl(Lyf;I)V")
	public static final void method145(ClientScriptState arg0) {
		if (Statics.field1766 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
			arg0.field8228 = Statics.field1766;
		}
	}

	@ObfuscatedName("pu.adc(Lyf;I)V")
	public static final void method7072(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8228.field11396;
	}

	@ObfuscatedName("zr.ada(Lyf;I)V")
	public static final void method14065(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11398;
	}

	@ObfuscatedName("q.adh(Lyf;I)V")
	public static final void method554(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11391;
	}

	@ObfuscatedName("qg.adb(Lyf;B)V")
	public static final void method7208(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11393;
	}

	@ObfuscatedName("qt.adi(Lyf;I)V")
	public static final void method7131(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8228.field11392[var1].field3087;
	}

	@ObfuscatedName("akz.adz(Lyf;I)V")
	public static final void method17603(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11392[var1].field3089;
	}

	@ObfuscatedName("dj.ads(Lyf;I)V")
	public static final void method2662(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11392[var1].field3088;
	}

	@ObfuscatedName("amg.adg(Lyf;B)V")
	public static final void method18417(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Statics.method18674(Statics.field3022 == arg0.field8228, var1);
	}

	@ObfuscatedName("il.adn(Lyf;B)V")
	public static final void method4504(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.method17736((String) arg0.field8218[--arg0.field8211]);
	}

	@ObfuscatedName("gr.adk(Lyf;S)V")
	public static final void method3576(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = arg0.field8228.method17733()[arg0.field8216[arg0.field8226 - 1]];
	}

	@ObfuscatedName("qp.ado(Lyf;B)V")
	public static final void method7098(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field7698 == null ? 0 : 1;
	}

	@ObfuscatedName("abn.adr(Lyf;I)V")
	public static final void method14754(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11057[var2][var1].method7611();
	}

	@ObfuscatedName("fm.ade(Lyf;B)V")
	public static final void method3007(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11057[var2][var1].field4959;
	}

	@ObfuscatedName("nk.adv(Lyf;I)V")
	public static final void method6055(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11057[var2][var1].field4960;
	}

	@ObfuscatedName("vx.adw(Lyf;I)V")
	public static final void method9248(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11057[var2][var1].field4958;
	}

	@ObfuscatedName("kl.adj(Lyf;I)V")
	public static final void method5243(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11057[var2][var1].field4962;
	}

	@ObfuscatedName("jw.adm(Lyf;I)V")
	public static final void method4925(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = client.field11057[var2][var1].method7608();
		arg0.field8216[++arg0.field8226 - 1] = var3 == 0 ? 1 : 0;
	}

	@ObfuscatedName("ch.ady(Lyf;S)V")
	public static final void method1519(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = client.field11057[var2][var1].method7608();
		arg0.field8216[++arg0.field8226 - 1] = var3 == 5 ? 1 : 0;
	}

	@ObfuscatedName("nw.adu(Lyf;I)V")
	public static final void method6021(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = client.field11057[var2][var1].method7608();
		arg0.field8216[++arg0.field8226 - 1] = var3 == 1 ? 1 : 0;
	}

	@ObfuscatedName("py.adt(Lyf;B)V")
	public static final void method6968(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 + var2;
	}

	@ObfuscatedName("yx.adq(Lyf;I)V")
	public static final void method10612(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 * var2;
	}

	@ObfuscatedName("pc.aew(Lyf;I)V")
	public static final void method7093(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 / var2;
	}

	@ObfuscatedName("in.aeu(Lyf;I)V")
	public static final void method4420(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = (int) (Math.random() * (double) var1);
	}

	@ObfuscatedName("ck.aez(Lyf;I)V")
	public static final void method1595(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = (int) (Math.random() * (double) (var1 + 1));
	}

	@ObfuscatedName("hz.aen(Lyf;I)V")
	public static final void method4319(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		long var1 = (long) arg0.field8216[arg0.field8226];
		long var3 = (long) arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = (int) (var1 * var3 / 100L + var1);
	}

	@ObfuscatedName("uy.aet(Lyf;I)V")
	public static final void method9174(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 | 0x1 << var2;
	}

	@ObfuscatedName("jx.aer(Lyf;I)V")
	public static final void method5067(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 & -1 - (0x1 << var2);
	}

	@ObfuscatedName("ahd.aes(Lyf;I)V")
	public static final void method16713(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = (var1 & 0x1 << var2) == 0 ? 0 : 1;
	}

	@ObfuscatedName("k.aeb(Lyf;I)V")
	public static final void method211(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 % var2;
	}

	@ObfuscatedName("kc.aev(Lyf;I)V")
	public static final void method5347(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var1 == 0) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = (int) Math.pow((double) var1, (double) var2);
		}
	}

	@ObfuscatedName("kc.aey(Lyf;I)V")
	public static final void method5348(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var1 == 0 || var2 == 0) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
			return;
		}
		switch(var2) {
			case 1:
				arg0.field8216[++arg0.field8226 - 1] = var1;
				return;
			case 2:
				arg0.field8216[++arg0.field8226 - 1] = (int) Math.sqrt((double) var1);
				return;
			case 3:
				arg0.field8216[++arg0.field8226 - 1] = (int) Math.cbrt((double) var1);
				return;
			case 4:
				arg0.field8216[++arg0.field8226 - 1] = (int) Math.sqrt(Math.sqrt((double) var1));
				return;
			default:
				arg0.field8216[++arg0.field8226 - 1] = (int) Math.pow((double) var1, 1.0D / (double) var2);
		}
	}

	@ObfuscatedName("sf.aex(Lyf;I)V")
	public static final void method8325(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 & var2;
	}

	@ObfuscatedName("aik.aec(Lyf;I)V")
	public static final void method16863(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 | var2;
	}

	@ObfuscatedName("acg.or(Lyf;B)V")
	public static final void method15019(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 < var2 ? var1 : var2;
	}

	@ObfuscatedName("aht.aeo(Lyf;I)V")
	public static final void method16757(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 > var2 ? var1 : var2;
	}

	@ObfuscatedName("nf.aeg(Lyf;B)V")
	public static final void method6078(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		long var1 = (long) arg0.field8216[arg0.field8226];
		long var3 = (long) arg0.field8216[arg0.field8226 + 1];
		long var5 = (long) arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = (int) (var1 * var5 / var3);
	}

	@ObfuscatedName("ye.ael(Lyf;I)V")
	public static final void method10363(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = class783.method14573(arg0.field8216[arg0.field8226 - 1]);
	}

	@ObfuscatedName("va.aei(Lyf;B)V")
	public static final void method9410(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 ^ 0x1 << var2;
	}

	@ObfuscatedName("qv.aef(Lyf;I)V")
	public static final void method7358(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = class783.method3256(var1, var2, var3);
	}

	@ObfuscatedName("el.aej(Lyf;B)V")
	public static final void method2764(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = class783.method3588(var1, var2, var3);
	}

	@ObfuscatedName("jq.aea(Lyf;S)V")
	public static final void method4994(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = 31 - var3;
		arg0.field8216[++arg0.field8226 - 1] = var1 << var4 >>> var2 + var4;
	}

	@ObfuscatedName("yx.aed(Lyf;I)V")
	public static final void method10613(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = class783.method14281(var4 - var3 + 1);
		if (var2 > var5) {
			var2 = var5;
		}
		int var6 = class783.method3588(var1, var3, var4);
		arg0.field8216[++arg0.field8226 - 1] = var6 | var2 << var3;
	}

	@ObfuscatedName("ags.aee(Lyf;I)V")
	public static final void method16457(ClientScriptState arg0) {
		int var1 = arg0.field8216[arg0.field8226 - 1];
		arg0.field8216[arg0.field8226 - 1] = (int) Math.sqrt((double) var1);
	}

	@ObfuscatedName("fa.aek(Lyf;I)V")
	public static final void method3102(ClientScriptState arg0) {
		int var1 = arg0.field8216[arg0.field8226 - 1];
		arg0.field8216[arg0.field8226 - 1] = Trig1.method6276(var1);
	}

	@ObfuscatedName("ju.aem(Lyf;B)V")
	public static final void method4657(ClientScriptState arg0) {
		int var1 = arg0.field8216[arg0.field8226 - 1];
		arg0.field8216[arg0.field8226 - 1] = Trig1.method6279(var1);
	}

	@ObfuscatedName("art.aeq(Lyf;I)V")
	public static final void method19264(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Math.abs(var1);
	}

	@ObfuscatedName("ex.abs(Lyf;I)V")
	public static final void method2974(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var1 <= 700 && var2 <= 700) {
			double var3 = (Math.random() * (double) (var1 + var2) - (double) var1 + 800.0D) / 100.0D;
			arg0.field8216[++arg0.field8226 - 1] = (int) (Math.pow(2.0D, var3) + 0.5D);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 256;
		}
	}

	@ObfuscatedName("xh.afi(Lyf;B)V")
	public static final void method10207(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = var1 + var2;
	}

	@ObfuscatedName("aj.afk(Lyf;I)V")
	public static final void method970(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		arg0.field8218[++arg0.field8211 - 1] = var1 + var2;
	}

	@ObfuscatedName("qx.afo(Lyf;I)V")
	public static final void method7115(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = var1 + class695.method1898(var2, true);
	}

	@ObfuscatedName("jx.afe(Lyf;I)V")
	public static final void method5068(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8218[++arg0.field8211 - 1] = var1.toLowerCase();
	}

	@ObfuscatedName("hx.afm(Lyf;B)V")
	public static final void method3918(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = class786.method14482(class786.method14612(arg0.field8216[--arg0.field8226]), Statics.field1680.getId());
	}

	@ObfuscatedName("vm.afg(Lyf;I)V")
	public static final void method9460(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		if (Statics.field4490.field12061 != null && Statics.field4490.field12061.field7897) {
			arg0.field8218[++arg0.field8211 - 1] = var2;
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var1;
		}
	}

	@ObfuscatedName("cj.afa(Lyf;I)V")
	public static final void method1601(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = Integer.toString(var1);
	}

	@ObfuscatedName("ku.afc(Lyf;B)V")
	public static final void method5152(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = class691.method6827((String) arg0.field8218[arg0.field8211], (String) arg0.field8218[arg0.field8211 + 1], Statics.field1680);
	}

	@ObfuscatedName("ea.afb(Lyf;B)V")
	public static final void method2888(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		FontMetrics var4 = Statics.field7538.method6163(client.field10833, var3);
		arg0.field8216[++arg0.field8226 - 1] = var4.method14538(var1, var2, Statics.field10302);
	}

	@ObfuscatedName("hv.afr(Lyf;I)V")
	public static final void method4294(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		FontMetrics var4 = Statics.field7538.method6163(client.field10833, var3);
		arg0.field8216[++arg0.field8226 - 1] = var4.method14551(var1, var2, Statics.field10302);
	}

	@ObfuscatedName("vc.afh(Lyf;I)V")
	public static final void method9579(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 3;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		int var4 = arg0.field8216[arg0.field8226 + 2];
		FontMetrics var5 = Statics.field7538.method6163(client.field10833, var3);
		String var6 = var5.method14539(var1, var2, Statics.field10302, var4);
		arg0.field8218[++arg0.field8211 - 1] = var6 == null ? "" : var6;
	}

	@ObfuscatedName("ku.afw(Lyf;I)V")
	public static final void method5149(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		if (arg0.field8216[--arg0.field8226] == 1) {
			arg0.field8218[++arg0.field8211 - 1] = var1;
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2;
		}
	}

	@ObfuscatedName("sx.afd(Lyf;I)V")
	public static final void method8018(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8218[++arg0.field8211 - 1] = class107.method10347(var1);
	}

	@ObfuscatedName("fs.afl(Lyf;I)V")
	public static final void method3030(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		if (var2 == -1) {
			throw new RuntimeException("");
		}
		arg0.field8218[++arg0.field8211 - 1] = var1 + (char) var2;
	}

	@ObfuscatedName("wi.afs(Lyf;B)V")
	public static final void method9889(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.method17828((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("ahx.aff(Lyf;B)V")
	public static final void method16660(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = class695.method2883((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("dz.afv(Lyf;I)V")
	public static final void method1895(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = class695.method14704((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("sr.afu(Lyf;I)V")
	public static final void method8177(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = class695.method6819((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("vc.aft(Lyf;S)V")
	public static final void method9580(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1.length();
		}
	}

	@ObfuscatedName("ex.afn(Lyf;I)V")
	public static final void method2977(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8218[++arg0.field8211 - 1] = var1.substring(var2, var3);
	}

	@ObfuscatedName("tj.afj(Lyf;I)V")
	public static final void method8446(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		StringBuilder var2 = new StringBuilder(var1.length());
		boolean var3 = false;
		for (int var4 = 0; var4 < var1.length(); var4++) {
			char var5 = var1.charAt(var4);
			if (var5 == '<') {
				var3 = true;
			} else if (var5 == '>') {
				var3 = false;
			} else if (!var3) {
				var2.append(var5);
			}
		}
		arg0.field8218[++arg0.field8211 - 1] = var2.toString();
	}

	@ObfuscatedName("aak.afp(Lyf;I)V")
	public static final void method14098(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("nq.agv(Lyf;I)V")
	public static final void method6062(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		int var3 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("gj.aga(Lyf;I)V")
	public static final void method3616(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Character.toLowerCase((char) var1);
	}

	@ObfuscatedName("ex.agi(Lyf;I)V")
	public static final void method2975(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Character.toUpperCase((char) var1);
	}

	@ObfuscatedName("tb.agg(Lyf;B)V")
	public static final void method8492(ClientScriptState arg0) {
		boolean var1 = arg0.field8216[--arg0.field8226] != 0;
		int var2 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = class691.method1582((long) var2, 0, var1, Statics.field1680);
	}

	@ObfuscatedName("xh.agx(Lyf;I)V")
	public static final void method10208(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		FontMetrics var3 = Statics.field7538.method6163(client.field10833, var2);
		arg0.field8216[++arg0.field8226 - 1] = var3.method14533(var1, Statics.field10302);
	}

	@ObfuscatedName("ap.agj(Lyf;B)V")
	public static final void method897(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		arg0.field8216[++arg0.field8226 - 1] = class695.method13835(var1, var2);
	}

	@ObfuscatedName("gq.age(Lyf;B)V")
	public static final void method3465(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = class786.method6058((long) arg0.field8216[--arg0.field8226] * 60000L, Statics.field1680.getId(), true) + " UTC";
	}

	@ObfuscatedName("t.agk(Lyf;S)V")
	public static final void method646(ClientScriptState arg0) {
		long var1 = arg0.field8224[--arg0.field8238];
		arg0.field8218[++arg0.field8211 - 1] = var1 == -1L ? "" : Long.toString(var1, 36).toUpperCase();
	}

	@ObfuscatedName("oo.agm(Lyf;I)V")
	public static final void method6129(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = ((ObjType) Statics.field1842.get(var1)).field8630;
	}

	@ObfuscatedName("hx.agf(Lyf;S)V")
	public static final void method3920(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ObjType var3 = (ObjType) Statics.field1842.get(var1);
		if (var2 < 1 || var2 > 5 || var3.field8647[var2 - 1] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var3.field8647[var2 - 1];
		}
	}

	@ObfuscatedName("hf.agw(Lyf;I)V")
	public static final void method4016(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Statics.field1842.get(var1)).field8644 == 1 ? 1 : 0;
	}

	@ObfuscatedName("aac.agn(Lyf;I)V")
	public static final void method14576(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		if (var2.field8663 == -1 && var2.field8673 >= 0) {
			arg0.field8216[++arg0.field8226 - 1] = var2.field8673;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1;
		}
	}

	@ObfuscatedName("nv.agu(Lyf;I)V")
	public static final void method6111(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		if (var2.field8663 >= 0 && var2.field8673 >= 0) {
			arg0.field8216[++arg0.field8226 - 1] = var2.field8673;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1;
		}
	}

	@ObfuscatedName("no.ags(Lyf;B)V")
	public static final void method5986(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		if (var2.field8677 == -1 && var2.field8676 >= 0) {
			arg0.field8216[++arg0.field8226 - 1] = var2.field8676;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1;
		}
	}

	@ObfuscatedName("aj.agp(Lyf;B)V")
	public static final void method971(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		if (var2.field8677 >= 0 && var2.field8676 >= 0) {
			arg0.field8216[++arg0.field8226 - 1] = var2.field8676;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1;
		}
	}

	@ObfuscatedName("nh.agz(Lyf;I)V")
	public static final void method6119(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8679;
	}

	@ObfuscatedName("fw.agh(Lyf;I)V")
	public static final void method3092(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Statics.field1842.get(var1)).field8651;
	}

	@ObfuscatedName("ki.agq(Lyf;I)V")
	public static final void method5173(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Statics.field1842.get(var1)).field8652;
	}

	@ObfuscatedName("kr.agr(Lyf;I)V")
	public static final void method5328(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Statics.field1842.get(var1)).field8653;
	}

	@ObfuscatedName("wm.agt(Lyf;I)V")
	public static final void method9824(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Statics.field1842.get(var1)).field8684 ? 1 : 0;
	}

	@ObfuscatedName("ul.agl(Lyf;I)V")
	public static final void method8915(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Statics.field3086.get(var2);
		if (var3.method15152()) {
			arg0.field8218[++arg0.field8211 - 1] = ((ObjType) Statics.field1842.get(var1)).method14654(var2, var3.field9171);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Statics.field1842.get(var1)).method14677(var2, var3.field9172);
		}
	}

	@ObfuscatedName("ye.agc(Lyf;I)V")
	public static final void method10366(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1] - 1;
		ObjType var3 = (ObjType) Statics.field1842.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var3.method14684(var2);
	}

	@ObfuscatedName("ae.ago(Lyf;I)V")
	public static final void method651(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = client.method4628(var1, var2 == 1);
	}

	@ObfuscatedName("zl.agy(Lyf;I)V")
	public static final void method14048(ClientScriptState arg0) {
		if (Statics.field8054 == null || Statics.field8728 >= Statics.field8054.length) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Statics.field8054[++Statics.field8728 - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("ajd.ahm(Lyf;B)V")
	public static final void method17451(ClientScriptState arg0) {
		Statics.field8728 = 0;
	}

	@ObfuscatedName("abq.ahc(Lyf;I)V")
	public static final void method14695(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8680 ? 1 : 0;
	}

	@ObfuscatedName("xd.ahj(Lyf;I)V")
	public static final void method10297(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		int var3;
		if (var2.field8680) {
			var3 = var2.field8696;
		} else if (var2.field8684) {
			var3 = Statics.field1971.field7665;
		} else {
			var3 = Statics.field1971.field7661;
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("tz.ahw(Lyf;S)V")
	public static final void method8502(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8628;
	}

	@ObfuscatedName("gy.ahl(Lyf;S)V")
	public static final void method3537(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8644 == 2 ? 1 : 0;
	}

	@ObfuscatedName("tv.ahv(Lyf;B)V")
	public static final void method8674(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8687 ? 1 : 0;
	}

	@ObfuscatedName("nz.ahf(Lyf;I)V")
	public static final void method6083(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Statics.field1842.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8698 ? 1 : 0;
	}

	@ObfuscatedName("aal.ahr(Lyf;I)V")
	public static final void method14485(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Statics.field1842.get(var1)).field8627;
	}

	@ObfuscatedName("a.ahk(Lyf;I)V")
	public static final void method609(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Statics.field3086.get(var2);
		if (var3.method15152()) {
			arg0.field8218[++arg0.field8211 - 1] = ((NPCType) Statics.field7961.get(var1)).method4548(var2, var3.field9171);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((NPCType) Statics.field7961.get(var1)).method4551(var2, var3.field9172);
		}
	}

	@ObfuscatedName("vn.ahu(Lyf;B)V")
	public static final void method9586(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Statics.field3086.get(var2);
		if (var3.method15152()) {
			arg0.field8218[++arg0.field8211 - 1] = ((StructType) Statics.field7713.get(var1)).method15297(var2, var3.field9171);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((StructType) Statics.field7713.get(var1)).method15296(var2, var3.field9172);
		}
	}

	@ObfuscatedName("yb.ahz(Lyf;I)V")
	public static final void method10564(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Statics.field3086.get(var2);
		if (var3.method15152()) {
			arg0.field8218[++arg0.field8211 - 1] = ((SeqType) Statics.field8797.get(var1)).method2989(var2, var3.field9171);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((SeqType) Statics.field8797.get(var1)).method2981(var2, var3.field9172);
		}
	}

	@ObfuscatedName("fw.aha(Lyf;B)V")
	public static final void method3090(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((SeqType) Statics.field8797.get(var1)).field1776;
	}

	@ObfuscatedName("ij.ahx(Lyf;I)V")
	public static final void method4334(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		BASType var2 = (BASType) Statics.field11742.get(var1);
		if (var2.field7335 == null || var2.field7335.length <= 0) {
			arg0.field8216[++arg0.field8226 - 1] = var2.field7345;
			return;
		}
		int var3 = 0;
		int var4 = var2.field7324[0];
		for (int var5 = 1; var5 < var2.field7335.length; var5++) {
			if (var2.field7324[var5] > var4) {
				var3 = var5;
				var4 = var2.field7324[var5];
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var2.field7335[var3];
	}

	@ObfuscatedName("ahz.ahb(Lyf;B)V")
	public static final void method16656(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field11050;
	}

	@ObfuscatedName("pl.aho(Lyf;S)V")
	public static final void method6850(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		client.field11050 = arg0.field8216[arg0.field8226];
		Statics.field10354 = class724.method3374(arg0.field8216[arg0.field8226 + 1]);
		if (Statics.field10354 == null) {
			Statics.field10354 = class724.field8527;
		}
		client.field11029 = arg0.field8216[arg0.field8226 + 2];
		ServerConnection var1 = client.method640();
		ClientMessage var2 = Statics.method1604(ClientProt.SET_CHATFILTERSETTINGS, var1.field794);
		var2.field11432.p1(client.field11050);
		var2.field11432.p1(Statics.field10354.field8530);
		var2.field11432.p1(client.field11029);
		var1.method934(var2);
	}

	@ObfuscatedName("anr.ahg(Lyf;I)V")
	public static final void method18727(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		arg0.field8226 -= 2;
		int var3 = arg0.field8216[arg0.field8226];
		int var4 = arg0.field8216[arg0.field8226 + 1];
		if (var2 == null) {
			var2 = "";
		}
		if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}
		ServerConnection var5 = client.method640();
		ClientMessage var6 = Statics.method1604(ClientProt.SEND_SNAPSHOT, var5.field794);
		var6.field11432.p1(Packet.pjstrlen(var1) + 2 + Packet.pjstrlen(var2));
		var6.field11432.pjstr(var1);
		var6.field11432.p1(var3 - 1);
		var6.field11432.p1(var4);
		var6.field11432.pjstr(var2);
		var5.method934(var6);
	}

	@ObfuscatedName("aas.ahh(Lyf;S)V")
	public static final void method14267(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		class1179 var3 = ChatHistory.method7310(var1, var2);
		if (var3 != null) {
			arg0.field8216[++arg0.field8226 - 1] = var3.field12339;
			arg0.field8218[++arg0.field8211 - 1] = class786.method16609(var3.field12336, Statics.field1680.field8298);
			arg0.field8216[++arg0.field8226 - 1] = var3.field12332;
			arg0.field8218[++arg0.field8211 - 1] = var3.field12330 == null ? "" : var3.field12330;
			arg0.field8218[++arg0.field8211 - 1] = var3.field12334 == null ? "" : var3.field12334;
			arg0.field8218[++arg0.field8211 - 1] = var3.field12335 == null ? "" : var3.field12335;
			arg0.field8218[++arg0.field8211 - 1] = var3.field12329 == null ? "" : var3.field12329;
			arg0.field8216[++arg0.field8226 - 1] = var3.field12337;
			arg0.field8218[++arg0.field8211 - 1] = var3.field12338 == null ? "" : var3.field12338;
			arg0.field8216[++arg0.field8226 - 1] = var3.field12333 == null ? -1 : var3.field12333.getId();
			return;
		}
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("no.ahd(Lyf;B)V")
	public static final void method5982(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		class1179 var2 = ChatHistory.method304(var1);
		if (var2 != null) {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12331;
			arg0.field8218[++arg0.field8211 - 1] = class786.method16609(var2.field12336, Statics.field1680.field8298);
			arg0.field8216[++arg0.field8226 - 1] = var2.field12332;
			arg0.field8218[++arg0.field8211 - 1] = var2.field12330 == null ? "" : var2.field12330;
			arg0.field8218[++arg0.field8211 - 1] = var2.field12334 == null ? "" : var2.field12334;
			arg0.field8218[++arg0.field8211 - 1] = var2.field12335 == null ? "" : var2.field12335;
			arg0.field8218[++arg0.field8211 - 1] = var2.field12329 == null ? "" : var2.field12329;
			arg0.field8216[++arg0.field8226 - 1] = var2.field12337;
			arg0.field8218[++arg0.field8211 - 1] = var2.field12338 == null ? "" : var2.field12338;
			arg0.field8216[++arg0.field8226 - 1] = var2.field12333 == null ? -1 : var2.field12333.getId();
			return;
		}
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("fw.ahn(Lyf;I)V")
	public static final void method3098(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.method18587();
	}

	@ObfuscatedName("vo.ahp(Lyf;B)V")
	public static final void method9307(ClientScriptState arg0) {
		ChatHistory.method329();
	}

	@ObfuscatedName("xo.ahe(Lyf;S)V")
	public static final void method10318(ClientScriptState arg0) {
		if (Statics.field10354 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Statics.field10354.field8530;
		}
	}

	@ObfuscatedName("mj.ahs(Lyf;I)V")
	public static final void method5922(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ServerConnection var2 = client.method640();
		ClientMessage var3 = Statics.method1604(ClientProt.CHAT_SETMODE, var2.field794);
		var3.field11432.p1(var1);
		var2.method934(var3);
	}

	@ObfuscatedName("ki.aht(Lyf;I)V")
	public static final void method5174(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (client.field10949 == 0 && (client.field10951 && !client.field11081 || client.field11101)) {
			return;
		}
		String var2 = var1.toLowerCase();
		byte var3 = 0;
		if (var2.startsWith(LocalisedText.field9104.method15021(Language.EN))) {
			var3 = 0;
			var1 = var1.substring(LocalisedText.field9104.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field9088.method15021(Language.EN))) {
			var3 = 1;
			var1 = var1.substring(LocalisedText.field9088.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field8994.method15021(Language.EN))) {
			var3 = 2;
			var1 = var1.substring(LocalisedText.field8994.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field9107.method15021(Language.EN))) {
			var3 = 3;
			var1 = var1.substring(LocalisedText.field9107.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field9108.method15021(Language.EN))) {
			var3 = 4;
			var1 = var1.substring(LocalisedText.field9108.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field9109.method15021(Language.EN))) {
			var3 = 5;
			var1 = var1.substring(LocalisedText.field9109.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field9110.method15021(Language.EN))) {
			var3 = 6;
			var1 = var1.substring(LocalisedText.field9110.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field9111.method15021(Language.EN))) {
			var3 = 7;
			var1 = var1.substring(LocalisedText.field9111.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field8992.method15021(Language.EN))) {
			var3 = 8;
			var1 = var1.substring(LocalisedText.field8992.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field9031.method15021(Language.EN))) {
			var3 = 9;
			var1 = var1.substring(LocalisedText.field9031.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field9114.method15021(Language.EN))) {
			var3 = 10;
			var1 = var1.substring(LocalisedText.field9114.method15021(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.field8965.method15021(Language.EN))) {
			var3 = 11;
			var1 = var1.substring(LocalisedText.field8965.method15021(Language.EN).length());
		} else if (Statics.field1680 != Language.EN) {
			if (var2.startsWith(LocalisedText.field9104.method15021(Statics.field1680))) {
				var3 = 0;
				var1 = var1.substring(LocalisedText.field9104.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field9088.method15021(Statics.field1680))) {
				var3 = 1;
				var1 = var1.substring(LocalisedText.field9088.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field8994.method15021(Statics.field1680))) {
				var3 = 2;
				var1 = var1.substring(LocalisedText.field8994.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field9107.method15021(Statics.field1680))) {
				var3 = 3;
				var1 = var1.substring(LocalisedText.field9107.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field9108.method15021(Statics.field1680))) {
				var3 = 4;
				var1 = var1.substring(LocalisedText.field9108.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field9109.method15021(Statics.field1680))) {
				var3 = 5;
				var1 = var1.substring(LocalisedText.field9109.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field9110.method15021(Statics.field1680))) {
				var3 = 6;
				var1 = var1.substring(LocalisedText.field9110.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field9111.method15021(Statics.field1680))) {
				var3 = 7;
				var1 = var1.substring(LocalisedText.field9111.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field8992.method15021(Statics.field1680))) {
				var3 = 8;
				var1 = var1.substring(LocalisedText.field8992.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field9031.method15021(Statics.field1680))) {
				var3 = 9;
				var1 = var1.substring(LocalisedText.field9031.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field9114.method15021(Statics.field1680))) {
				var3 = 10;
				var1 = var1.substring(LocalisedText.field9114.method15021(Statics.field1680).length());
			} else if (var2.startsWith(LocalisedText.field8965.method15021(Statics.field1680))) {
				var3 = 11;
				var1 = var1.substring(LocalisedText.field8965.method15021(Statics.field1680).length());
			}
		}
		String var4 = var1.toLowerCase();
		byte var5 = 0;
		if (var4.startsWith(LocalisedText.field9116.method15021(Language.EN))) {
			var5 = 1;
			var1 = var1.substring(LocalisedText.field9116.method15021(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.field9117.method15021(Language.EN))) {
			var5 = 2;
			var1 = var1.substring(LocalisedText.field9117.method15021(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.field9118.method15021(Language.EN))) {
			var5 = 3;
			var1 = var1.substring(LocalisedText.field9118.method15021(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.field9015.method15021(Language.EN))) {
			var5 = 4;
			var1 = var1.substring(LocalisedText.field9015.method15021(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.field9120.method15021(Language.EN))) {
			var5 = 5;
			var1 = var1.substring(LocalisedText.field9120.method15021(Language.EN).length());
		} else if (Statics.field1680 != Language.EN) {
			if (var4.startsWith(LocalisedText.field9116.method15021(Statics.field1680))) {
				var5 = 1;
				var1 = var1.substring(LocalisedText.field9116.method15021(Statics.field1680).length());
			} else if (var4.startsWith(LocalisedText.field9117.method15021(Statics.field1680))) {
				var5 = 2;
				var1 = var1.substring(LocalisedText.field9117.method15021(Statics.field1680).length());
			} else if (var4.startsWith(LocalisedText.field9118.method15021(Statics.field1680))) {
				var5 = 3;
				var1 = var1.substring(LocalisedText.field9118.method15021(Statics.field1680).length());
			} else if (var4.startsWith(LocalisedText.field9015.method15021(Statics.field1680))) {
				var5 = 4;
				var1 = var1.substring(LocalisedText.field9015.method15021(Statics.field1680).length());
			} else if (var4.startsWith(LocalisedText.field9120.method15021(Statics.field1680))) {
				var5 = 5;
				var1 = var1.substring(LocalisedText.field9120.method15021(Statics.field1680).length());
			}
		}
		ServerConnection var6 = client.method640();
		ClientMessage var7 = Statics.method1604(ClientProt.MESSAGE_PUBLIC, var6.field794);
		var7.field11432.p1(0);
		int var8 = var7.field11432.pos;
		var7.field11432.p1(var3);
		var7.field11432.p1(var5);
		StringEncoder.encode(var7.field11432, var1);
		var7.field11432.psize1(var7.field11432.pos - var8);
		var6.method934(var7);
	}

	@ObfuscatedName("iw.ahi(Lyf;I)V")
	public static final void method4517(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		if (client.field10949 == 0 && (client.field10951 && !client.field11081 || client.field11101)) {
			return;
		}
		ServerConnection var3 = client.method640();
		ClientMessage var4 = Statics.method1604(ClientProt.MESSAGE_PRIVATE, var3.field794);
		var4.field11432.p2(0);
		int var5 = var4.field11432.pos;
		var4.field11432.pjstr(var1);
		StringEncoder.encode(var4.field11432, var2);
		var4.field11432.psize2(var4.field11432.pos - var5);
		var3.method934(var4);
	}

	@ObfuscatedName("yw.ahy(Lyf;S)V")
	public static final void method10605(ClientScriptState arg0) {
		String var1;
		if (Statics.field4490 == null || Statics.field4490.field12057 == null) {
			var1 = "";
		} else {
			var1 = Statics.field4490.method19115(true);
		}
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("fs.air(Lyf;I)V")
	public static final void method3031(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field11029;
	}

	@ObfuscatedName("wq.aix(Lyf;I)V")
	public static final void method9792(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ChatHistory.method6970(var1);
	}

	@ObfuscatedName("oh.ait(Lyf;I)V")
	public static final void method6128(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ChatHistory.method5157(var1);
	}

	@ObfuscatedName("hc.aiq(Lyf;I)V")
	public static final void method4150(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ChatHistory.method16440(var1);
	}

	@ObfuscatedName("abv.aii(Lyf;I)V")
	public static final void method14691(ClientScriptState arg0) {
		String var1;
		if (Statics.field4490 == null || Statics.field4490.field12057 == null) {
			var1 = "";
		} else {
			var1 = Statics.field4490.method19116(false);
		}
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("fl.aia(Lyf;I)V")
	public static final void method3142(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = Statics.field3823.method7243(var1).field12348;
	}

	@ObfuscatedName("tr.ais(Lyf;I)V")
	public static final void method8428(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		class1182 var2 = Statics.field3823.method7243(var1);
		if (var2.field12346 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12346.length;
		}
	}

	@ObfuscatedName("ir.aiy(Lyf;B)V")
	public static final void method4459(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		class1182 var3 = Statics.field3823.method7243(var1);
		int var4 = var3.field12346[var2];
		arg0.field8216[++arg0.field8226 - 1] = var4;
	}

	@ObfuscatedName("qa.aio(Lyf;B)V")
	public static final void method7346(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		class1182 var2 = Statics.field3823.method7243(var1);
		if (var2.field12349 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12349.length;
		}
	}

	@ObfuscatedName("hh.aig(Lyf;B)V")
	public static final void method4049(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field3823.method7243(var1).field12349[var2];
	}

	@ObfuscatedName("ho.aid(Lyf;S)V")
	public static final void method4276(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = Statics.field489.method14982(var1).method19534();
	}

	@ObfuscatedName("sv.aif(Lyf;B)V")
	public static final void method7973(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		class1186 var2 = Statics.field489.method14982(var1);
		if (var2.field12381 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12381.length;
		}
	}

	@ObfuscatedName("la.ail(Lyf;B)V")
	public static final void method5406(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field489.method14982(var1).field12381[var2];
	}

	@ObfuscatedName("fi.aiw(Lyf;I)V")
	public static final void method3072(ClientScriptState arg0) {
		arg0.field8240 = new ChatPhrase();
		arg0.field8240.field3448 = arg0.field8216[--arg0.field8226];
		arg0.field8240.field3447 = Statics.field489.method14982(arg0.field8240.field3448);
		arg0.field8240.field3446 = new int[arg0.field8240.field3447.method19504()];
	}

	@ObfuscatedName("jr.aiz(Lyf;I)V")
	public static final void method4941(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ServerConnection var2 = client.method640();
		ClientMessage var3 = Statics.method1604(ClientProt.MESSAGE_QUICKCHAT_PUBLIC, var2.field794);
		var3.field11432.p1(0);
		int var4 = var3.field11432.pos;
		var3.field11432.p1(var1);
		var3.field11432.p2(arg0.field8240.field3448);
		arg0.field8240.field3447.method19508(var3.field11432, arg0.field8240.field3446);
		var3.field11432.psize1(var3.field11432.pos - var4);
		var2.method934(var3);
	}

	@ObfuscatedName("qh.aim(Lyf;B)V")
	public static final void method7347(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ServerConnection var2 = client.method640();
		ClientMessage var3 = Statics.method1604(ClientProt.MESSAGE_QUICKCHAT_PRIVATE, var2.field794);
		var3.field11432.p1(0);
		int var4 = var3.field11432.pos;
		var3.field11432.pjstr(var1);
		var3.field11432.p2(arg0.field8240.field3448);
		arg0.field8240.field3447.method19508(var3.field11432, arg0.field8240.field3446);
		var3.field11432.psize1(var3.field11432.pos - var4);
		var2.method934(var3);
	}

	@ObfuscatedName("atf.aie(Lyf;I)V")
	public static final void method19714(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field3823.method7243(var1).field12345[var2];
	}

	@ObfuscatedName("wg.aij(Lyf;I)V")
	public static final void method9754(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var2 == -1) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Statics.field3823.method7243(var1).method19460((char) var2);
		}
	}

	@ObfuscatedName("rl.aik(Lyf;I)V")
	public static final void method7883(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var2 == -1) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Statics.field3823.method7243(var1).method19451((char) var2);
		}
	}

	@ObfuscatedName("hi.aih(Lyf;I)V")
	public static final void method4131(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field489.method14982(var1).method19504();
	}

	@ObfuscatedName("dn.aiu(Lyf;I)V")
	public static final void method2042(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8240.field3446[var1] = var2;
	}

	@ObfuscatedName("ek.aib(Lyf;I)V")
	public static final void method2819(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8240.field3446[var1] = var2;
	}

	@ObfuscatedName("aaa.ain(Lyf;I)V")
	public static final void method14128(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		class1186 var4 = Statics.field489.method14982(var1);
		if (var4.method19509(var2).field7938 != 0) {
			throw new RuntimeException("");
		}
		arg0.field8216[++arg0.field8226 - 1] = var4.method19506(var2, var3);
	}

	@ObfuscatedName("agu.aiv(Lyf;I)V")
	public static final void method16455(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		boolean var2 = arg0.field8216[--arg0.field8226] == 1;
		arg0.field8216[++arg0.field8226 - 1] = client.method4296(var1, var2);
	}

	@ObfuscatedName("yr.aja(Lyf;I)V")
	public static final void method10676(ClientScriptState arg0) {
		if (Statics.field10750 == null || Statics.field7272 >= Statics.field10750.length) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Statics.field10750[++Statics.field7272 - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("hr.ajp(Lyf;B)V")
	public static final void method4021(ClientScriptState arg0) {
		Statics.field7272 = 0;
	}

	@ObfuscatedName("aos.ajy(Lyf;I)V")
	public static final void method18869(ClientScriptState arg0) {
		if (Statics.field11931.method9080(86)) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("er.ajs(Lyf;B)V")
	public static final void method2908(ClientScriptState arg0) {
		if (Statics.field11931.method9080(82)) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("amt.ajv(Lyf;B)V")
	public static final void method18530(ClientScriptState arg0) {
		if (Statics.field11931.method9080(81)) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("ql.ajk(Lyf;I)V")
	public static final void method7233(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8211--;
	}

	@ObfuscatedName("kz.ajg(Lyf;I)V")
	public static final void method5129(ClientScriptState arg0) {
	}

	@ObfuscatedName("tc.ajh(Lyf;I)V")
	public static final void method8435(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("yv.ajj(Lyf;I)V")
	public static final void method10767(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("io.ajz(Lyf;I)V")
	public static final void method4371(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("zc.ajb(Lyf;I)V")
	public static final void method13998(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("re.ajq(Lyf;I)V")
	public static final void method7718(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("ajs.aju(Lyf;I)V")
	public static final void method17398(ClientScriptState arg0) {
	}

	@ObfuscatedName("aht.ajd(Lyf;I)V")
	public static final void method16759(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("yw.ajn(Lyf;I)V")
	public static final void method10606(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("sv.aji(Lyf;S)V")
	public static final void method7974(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("aj.ajc(Lyf;I)V")
	public static final void method973(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("je.ajo(Lyf;I)V")
	public static final void method4840(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("rs.ajt(Lyf;B)V")
	public static final void method7607(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("gk.ajw(Lyf;I)V")
	public static final void method3477(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("rp.ajx(Lyf;I)V")
	public static final void method7473(ClientScriptState arg0) {
		class1004.method18180(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("im.ajf(Lyf;I)V")
	public static final void method4626(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.method17462();
	}

	@ObfuscatedName("hi.ajm(Lyf;I)V")
	public static final void method4129(ClientScriptState arg0) {
		class1004.method3141(arg0.field8216[--arg0.field8226], -1, -1, false);
	}

	@ObfuscatedName("uu.aje(Lyf;I)V")
	public static final void method9229(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = WorldMap.method8511(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12359;
		}
	}

	@ObfuscatedName("je.ajl(Lyf;I)V")
	public static final void method4841(ClientScriptState arg0) {
		WorldMapAreaMetadata var1 = WorldMap.method8512(arg0.field8216[--arg0.field8226]);
		if (var1 == null || var1.field12352 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var1.field12352;
		}
	}

	@ObfuscatedName("tw.ajr(Lyf;I)V")
	public static final void method8497(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field3121;
		arg0.field8216[++arg0.field8226 - 1] = Statics.field4603;
	}

	@ObfuscatedName("vz.akn(Lyf;B)V")
	public static final void method9552(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field11443 + Statics.field6786;
		arg0.field8216[++arg0.field8226 - 1] = Statics.field11654 + Statics.field6808;
	}

	@ObfuscatedName("pn.akz(Lyf;B)V")
	public static final void method6832(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = WorldMap.method8512(var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12358 - var2.field12357;
			arg0.field8216[++arg0.field8226 - 1] = var2.field12360 - var2.field12361;
		}
	}

	@ObfuscatedName("alw.akf(Lyf;I)V")
	public static final void method18151(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = WorldMap.method8512(var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
			arg0.field8216[++arg0.field8226 - 1] = 0;
			arg0.field8216[++arg0.field8226 - 1] = 0;
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12357;
			arg0.field8216[++arg0.field8226 - 1] = var2.field12361;
			arg0.field8216[++arg0.field8226 - 1] = var2.field12358;
			arg0.field8216[++arg0.field8226 - 1] = var2.field12360;
		}
	}

	@ObfuscatedName("k.akq(Lyf;I)V")
	public static final void method212(ClientScriptState arg0) {
		class990 var1 = class1004.method9829();
		if (var1 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1.field11446;
			int var2 = var1.field11447 << 28 | var1.field11448 + Statics.field6786 << 14 | var1.field11452 + Statics.field6808;
			arg0.field8216[++arg0.field8226 - 1] = var2;
		}
	}

	@ObfuscatedName("ux.akc(Lyf;I)V")
	public static final void method9208(ClientScriptState arg0) {
		class990 var1 = Statics.method13882();
		if (var1 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1.field11446;
			int var2 = var1.field11447 << 28 | var1.field11448 + Statics.field6786 << 14 | var1.field11452 + Statics.field6808;
			arg0.field8216[++arg0.field8226 - 1] = var2;
		}
	}

	@ObfuscatedName("q.aki(Lyf;B)V")
	public static final void method556(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = class1004.method17877();
		if (var2 != null) {
			boolean var3 = var2.method19471(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, field8203);
			if (var3) {
				class1004.method16438(field8203[1], field8203[2]);
			}
		}
	}

	@ObfuscatedName("ys.akw(Lyf;I)V")
	public static final void method10451(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = class1004.method17877();
		if (var2 != null) {
			boolean var3 = var2.method19471(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, field8203);
			if (var3) {
				Statics.method10453(field8203[1], field8203[2]);
			}
		}
	}

	@ObfuscatedName("uc.akp(Lyf;I)V")
	public static final void method8976(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		DualIterableQueue var3 = WorldMap.method8513(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
		boolean var4 = false;
		for (WorldMapAreaMetadata var5 = (WorldMapAreaMetadata) var3.method14317(); var5 != null; var5 = (WorldMapAreaMetadata) var3.method14324()) {
			if (var5.field12359 == var2) {
				var4 = true;
				break;
			}
		}
		if (var4) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("agh.akh(Lyf;I)V")
	public static final void method16463(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		class1004.method16438(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
	}

	@ObfuscatedName("vh.akl(Lyf;B)V")
	public static final void method9546(ClientScriptState arg0) {
		WorldMapAreaMetadata var1 = class1004.method17877();
		if (var1 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
			return;
		}
		boolean var2 = var1.method19482(Statics.field11443 + Statics.field6786, Statics.field11654 + Statics.field6808, field8203);
		if (var2) {
			arg0.field8216[++arg0.field8226 - 1] = field8203[1];
			arg0.field8216[++arg0.field8226 - 1] = field8203[2];
		} else {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
		}
	}

	@ObfuscatedName("xo.ake(Lyf;B)V")
	public static final void method10321(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		class1004.method3141(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, false);
	}

	@ObfuscatedName("vq.akj(Lyf;I)V")
	public static final void method9241(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = class1004.method17877();
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
			return;
		}
		boolean var3 = var2.method19471(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, field8203);
		if (var3) {
			arg0.field8216[++arg0.field8226 - 1] = field8203[1];
			arg0.field8216[++arg0.field8226 - 1] = field8203[2];
		} else {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
		}
	}

	@ObfuscatedName("dy.aky(Lyf;I)V")
	public static final void method2101(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = class1004.method17877();
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
			return;
		}
		boolean var3 = var2.method19482(var1 >> 14 & 0x3FFF, var1 & 0x3FFF, field8203);
		if (var3) {
			arg0.field8216[++arg0.field8226 - 1] = field8203[1];
			arg0.field8216[++arg0.field8226 - 1] = field8203[2];
		} else {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
		}
	}

	@ObfuscatedName("kb.aka(Lyf;B)V")
	public static final void method5249(ClientScriptState arg0) {
		class1004.method3368(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("yo.akd(Lyf;I)V")
	public static final void method10375(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		class1004.method3141(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, true);
	}

	@ObfuscatedName("apc.akg(Lyf;B)V")
	public static final void method18928(ClientScriptState arg0) {
		class1004.field11658 = arg0.field8216[--arg0.field8226] == 1;
	}

	@ObfuscatedName("vl.aks(Lyf;I)V")
	public static final void method9285(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = class1004.field11658 ? 1 : 0;
	}

	@ObfuscatedName("xf.akv(Lyf;I)V")
	public static final void method10346(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		class1004.method541(var1);
	}

	@ObfuscatedName("tc.akk(Lyf;I)V")
	public static final void method8437(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		if (class1004.field11668 == null) {
			return;
		}
		Node var3 = class1004.field11668.method14495((long) var1);
		if (var3 != null && !var2) {
			var3.method8440();
		} else if (var3 == null && var2) {
			Node var4 = new Node();
			class1004.field11668.method14501(var4, (long) var1);
		}
	}

	@ObfuscatedName("gf.akm(Lyf;I)V")
	public static final void method3553(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (class1004.field11668 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			Node var2 = class1004.field11668.method14495((long) var1);
			arg0.field8216[++arg0.field8226 - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("wd.akt(Lyf;I)V")
	public static final void method9870(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		if (class1004.field11667 == null) {
			return;
		}
		Node var3 = class1004.field11667.method14495((long) var1);
		if (var3 != null && !var2) {
			var3.method8440();
		} else if (var3 == null && var2) {
			Node var4 = new Node();
			class1004.field11667.method14501(var4, (long) var1);
		}
	}

	@ObfuscatedName("sv.akb(Lyf;I)V")
	public static final void method7975(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (class1004.field11667 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			Node var2 = class1004.field11667.method14495((long) var1);
			arg0.field8216[++arg0.field8226 - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("sl.alw(Lyf;B)V")
	public static final void method8230(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = var2 >> 14 & 0x3FFF;
		int var4 = var2 & 0x3FFF;
		int var5 = class1004.method8145(var1, var3, var4);
		if (var5 < 0) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var5;
		}
	}

	@ObfuscatedName("qe.ali(Lyf;B)V")
	public static final void method7229(ClientScriptState arg0) {
		class1004.method5250();
	}

	@ObfuscatedName("ys.alu(Lyf;S)V")
	public static final void method10448(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		if (var1 == 0) {
			class1004.field11670 = var2;
		} else if (var1 == 1) {
			class1004.field11666 = var2;
		} else if (var1 == 2) {
			class1004.field11675 = var2;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ud.aly(Lyf;I)V")
	public static final void method9192(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 == 0) {
			arg0.field8216[++arg0.field8226 - 1] = class1004.field11670 ? 1 : 0;
		} else if (var1 == 1) {
			arg0.field8216[++arg0.field8226 - 1] = class1004.field11666 ? 1 : 0;
		} else if (var1 == 2) {
			arg0.field8216[++arg0.field8226 - 1] = class1004.field11675 ? 1 : 0;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("hp.alm(Lyf;I)V")
	public static final void method4061(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		if (!Statics.method9621(var1, var2)) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("wy.alj(Lyf;I)V")
	public static final void method9894(ClientScriptState arg0) {
		if (Fullscreen.allowed && Statics.field12101 != null) {
			client.setWindowMode(Statics.field688.field11542.method18539(), -1, -1, false);
		}
	}

	@ObfuscatedName("acb.all(Lyf;I)V")
	public static final void method14991(ClientScriptState arg0) {
		if (Fullscreen.allowed) {
			class727[] var1 = client.method16741();
			arg0.field8216[++arg0.field8226 - 1] = var1.length;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("et.ald(Lyf;I)V")
	public static final void method2863(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 >= 1 && var1 <= 2) {
			client.setWindowMode(var1, -1, -1, false);
		}
	}

	@ObfuscatedName("xa.alz(Lyf;B)V")
	public static final void method10146(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11542.method18539();
	}

	@ObfuscatedName("uw.alv(Lyf;I)V")
	public static final void method9187(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 >= 1 && var1 <= 2) {
			Statics.field688.method18157(Statics.field688.field11542, var1);
			Statics.field688.method18157(Statics.field688.field11543, var1);
			class48.method16391();
		}
	}

	@ObfuscatedName("aja.alq(Lyf;B)V")
	public static final void method17364(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		method7005((String) arg0.field8218[arg0.field8211], (String) arg0.field8218[arg0.field8211 + 1], "", arg0.field8216[--arg0.field8226] == 1, false);
	}

	@ObfuscatedName("va.ala(Lyf;I)V")
	public static final void method9415(ClientScriptState arg0) {
		CharSequence var1 = (CharSequence) arg0.field8218[--arg0.field8211];
		arg0.field8218[++arg0.field8211 - 1] = class805.method18779(var1);
	}

	@ObfuscatedName("ab.alf(Lyf;I)V")
	public static final void method990(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var1 >= 0 && var1 < 2) {
			client.field10981[var1] = new int[var2 << 1][4];
		}
	}

	@ObfuscatedName("wv.alc(Lyf;I)V")
	public static final void method9741(ClientScriptState arg0) {
		arg0.field8226 -= 7;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1] << 1;
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		int var6 = arg0.field8216[arg0.field8226 + 5];
		int var7 = arg0.field8216[arg0.field8226 + 6];
		if (var1 >= 0 && var1 < 2 && client.field10981[var1] != null && var2 >= 0 && var2 < client.field10981[var1].length) {
			client.field10981[var1][var2] = new int[] { (var3 >> 14 & 0x3FFF) << 9, var4 << 2, (var3 & 0x3FFF) << 9, var7 };
			client.field10981[var1][var2 + 1] = new int[] { (var5 >> 14 & 0x3FFF) << 9, var6 << 2, (var5 & 0x3FFF) << 9 };
		}
	}

	@ObfuscatedName("ff.alp(Lyf;I)V")
	public static final void method3127(ClientScriptState arg0) {
		int var1 = client.field10981[arg0.field8216[--arg0.field8226]].length >> 1;
		arg0.field8216[++arg0.field8226 - 1] = var1;
	}

	@ObfuscatedName("eg.alt(Lyf;I)V")
	public static final void method2838(ClientScriptState arg0) {
		if (Fullscreen.allowed && Statics.field12101 != null) {
			client.setWindowMode(Statics.field688.field11542.method18539(), -1, -1, false);
		}
		if (GameShell.method4419() == class506.field6580) {
			client.method14147();
			System.exit(0);
		} else {
			client.method9175();
		}
	}

	@ObfuscatedName("in.alo(Lyf;I)V")
	public static final void method4421(ClientScriptState arg0) {
		String var1 = null;
		if (Statics.field636 != null) {
			var1 = Statics.field636.method544();
		}
		if (var1 == null) {
			var1 = "";
		}
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("ud.alh(Lyf;I)V")
	public static final void method9193(ClientScriptState arg0) {
		if (Fullscreen.allowed && Statics.field12101 != null) {
			client.setWindowMode(Statics.field688.field11542.method18539(), -1, -1, false);
		}
		String var1 = (String) arg0.field8218[--arg0.field8211];
		boolean var2 = arg0.field8216[--arg0.field8226] == 1;
		String var3 = client.method7363() + var1;
		Browser.method4607(var3, var2, client.field10784);
	}

	@ObfuscatedName("dm.alr(Lyf;I)V")
	public static final void method1926(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		boolean var2 = arg0.field8216[--arg0.field8226] == 1;
		Browser.method4607(var1, var2, client.field10784);
	}

	@ObfuscatedName("yg.alx(Lyf;S)V")
	public static final void method10520(ClientScriptState arg0) {
		System.out.println(arg0.field8218[--arg0.field8211]);
	}

	@ObfuscatedName("fi.ams(Lyf;I)V")
	public static final void method3070(ClientScriptState arg0) {
		arg0.field8226 -= 12;
		MiniMenu.method6031();
		MiniMenu.method7617();
		Statics.field7676 = arg0.field8216[arg0.field8226];
		Statics.field4488 = arg0.field8216[arg0.field8226 + 1];
		Statics.field6708 = arg0.field8216[arg0.field8226 + 2];
		Statics.field11830 = arg0.field8216[arg0.field8226 + 3];
		Statics.field12340 = arg0.field8216[arg0.field8226 + 4];
		Statics.field740 = arg0.field8216[arg0.field8226 + 5];
		Statics.field11642 = arg0.field8216[arg0.field8226 + 6];
		Statics.field1748 = arg0.field8216[arg0.field8226 + 7];
		Statics.field1847 = arg0.field8216[arg0.field8226 + 8];
		Statics.field1266 = arg0.field8216[arg0.field8226 + 9];
		Statics.field2901 = arg0.field8216[arg0.field8226 + 10];
		Statics.field8463 = arg0.field8216[arg0.field8226 + 11];
		Statics.field10317.method6889(Statics.field12340);
		Statics.field10317.method6889(Statics.field740);
		Statics.field10317.method6889(Statics.field11642);
		Statics.field10317.method6889(Statics.field1748);
		Statics.field10317.method6889(Statics.field1847);
		Statics.field10317.method6889(Statics.field8463);
		Statics.field7672.method6889(Statics.field8463);
		Statics.field1224 = null;
		Statics.field11831 = null;
		Statics.field11699 = null;
		Statics.field3568 = null;
		Statics.field8480 = null;
		Statics.field9253 = null;
		Statics.field566 = null;
		Statics.field10568 = null;
		MiniMenu.field564 = true;
	}

	@ObfuscatedName("yj.ame(Lyf;I)V")
	public static final void method10443(ClientScriptState arg0) {
		MiniMenu.method5147();
		MiniMenu.field564 = false;
	}

	@ObfuscatedName("nr.ama(Lyf;B)V")
	public static final void method6065(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		client.field11038 = arg0.field8216[arg0.field8226];
		client.field10971 = arg0.field8216[arg0.field8226 + 1];
	}

	@ObfuscatedName("if.amg(Lyf;I)V")
	public static final void method4569(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("gb.amy(Lyf;B)V")
	public static final void method3672(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = MiniMenu.method961(var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("na.amn(Lyf;I)V")
	public static final void method5996(ClientScriptState arg0) {
		DeveloperConsole.method18913((String) arg0.field8218[--arg0.field8211], false, false);
	}

	@ObfuscatedName("ah.amb(Lyf;I)V")
	public static final void method707(ClientScriptState arg0) {
		class394.field4023.method6090();
	}

	@ObfuscatedName("adg.amu(Lyf;I)V")
	public static final void method15226(ClientScriptState arg0) {
		class394.field4028.method6090();
	}

	@ObfuscatedName("akw.amq(Lyf;I)V")
	public static final void method17724(ClientScriptState arg0) {
		String var1 = "";
		if (Statics.field3428 != null) {
			Transferable var2 = Statics.field3428.getContents(null);
			if (var2 != null) {
				try {
					var1 = (String) var2.getTransferData(DataFlavor.stringFlavor);
					if (var1 == null) {
						var1 = "";
					}
				} catch (Exception var4) {
				}
			}
		}
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("mj.amf(Lyf;I)V")
	public static final void method5923(ClientScriptState arg0) {
		MiniMenu.field568 = arg0.field8216[--arg0.field8226];
	}

	@ObfuscatedName("ev.amc(Lyf;I)V")
	public static final void method2777(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("nv.amo(Lyf;I)V")
	public static final void method6116(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("acx.amm(Lyf;I)V")
	public static final void method14993(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field2627 & 0x1;
	}

	@ObfuscatedName("ge.amh(Lyf;B)V")
	public static final void method3564(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = class17.method312();
	}

	@ObfuscatedName("nd.amt(Lyf;S)V")
	public static final void method5936(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.method2737(client.state) ? 1 : 0;
	}

	@ObfuscatedName("xm.amv(Lyf;I)V")
	public static final void method9906(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		CoordGrid var5 = client.world.method7727();
		client.method15723((var1 >> 14 & 0x3FFF) - var5.field7426, (var1 & 0x3FFF) - var5.field7427, var2 << 2, var3, var4, false);
		client.field10902 = true;
	}

	@ObfuscatedName("s.amw(Lyf;I)V")
	public static final void method482(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		CoordGrid var5 = client.world.method7727();
		client.method14706((var1 >> 14 & 0x3FFF) - var5.field7426, (var1 & 0x3FFF) - var5.field7427, var2 << 2, var3, var4);
		client.field10902 = true;
	}

	@ObfuscatedName("po.amd(Lyf;I)V")
	public static final void method6868(ClientScriptState arg0) {
		arg0.field8226 -= 6;
		int var1 = arg0.field8216[arg0.field8226];
		if (var1 >= 2) {
			throw new RuntimeException();
		}
		client.field10904 = var1;
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var2 + 1 >= client.field10981[client.field10904].length >> 1) {
			throw new RuntimeException();
		}
		client.field10909 = var2 * 2;
		client.field10976 = 0;
		client.field10843 = arg0.field8216[arg0.field8226 + 2];
		client.field10913 = arg0.field8216[arg0.field8226 + 3];
		int var3 = arg0.field8216[arg0.field8226 + 4];
		if (var3 >= 2) {
			throw new RuntimeException();
		}
		client.field10908 = var3;
		int var4 = arg0.field8216[arg0.field8226 + 5];
		if (var4 + 1 >= client.field10981[client.field10908].length >> 1) {
			throw new RuntimeException();
		}
		client.field10932 = var4 * 4;
		Statics.field3416 = 6;
		Statics.field3538 = -1;
		Statics.field810 = -1;
	}

	@ObfuscatedName("ua.amr(Lyf;I)V")
	public static final void method9005(ClientScriptState arg0) {
		client.method4046(client.method14298());
	}

	@ObfuscatedName("vx.aml(Lyf;I)V")
	public static final void method9249(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		client.method4843(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1], 0);
	}

	@ObfuscatedName("ke.amx(Lyf;I)V")
	public static final void method5133(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = (int) client.field11004 >> 3;
	}

	@ObfuscatedName("cs.ami(Lyf;B)V")
	public static final void method1577(ClientScriptState arg0) {
		if (Statics.field3416 == 3) {
			arg0.field8216[++arg0.field8226 - 1] = (int) ((double) Statics.field9155.method4719() * 2607.5945876176133D) >> 3;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = (int) client.field10895 >> 3;
		}
	}

	@ObfuscatedName("vy.amp(Lyf;B)V")
	public static final void method9427(ClientScriptState arg0) {
		client.method3653();
	}

	@ObfuscatedName("ql.amj(Lyf;I)V")
	public static final void method7234(ClientScriptState arg0) {
		client.method14311();
	}

	@ObfuscatedName("sg.ane(Lyf;I)V")
	public static final void method8380(ClientScriptState arg0) {
		client.method13836();
	}

	@ObfuscatedName("vz.ann(Lyf;I)V")
	public static final void method9556(ClientScriptState arg0) {
		Statics.method4019();
	}

	@ObfuscatedName("jx.anf(Lyf;B)V")
	public static final void method5071(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10901 - client.field11089 * 35;
	}

	@ObfuscatedName("wv.anq(Lyf;B)V")
	public static final void method9742(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		CoordGrid var4 = client.world.method7727();
		int var5 = var2 - var4.field7426;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 >= client.world.method7728()) {
			var5 = client.world.method7728();
		}
		int var6 = var3 - var4.field7427;
		if (var6 < 0) {
			var6 = 0;
		} else if (var6 >= client.world.method7758()) {
			var6 = client.world.method7758();
		}
		client.field10892 = (var5 << 9) + 256;
		client.field10893 = (var6 << 9) + 256;
		Statics.field3416 = 4;
		Statics.field3538 = -1;
		Statics.field810 = -1;
		client.field10902 = true;
	}

	@ObfuscatedName("j.anm(Lyf;I)V")
	public static final void method642(ClientScriptState arg0) {
		client.method3605();
	}

	@ObfuscatedName("dz.any(Lyf;B)V")
	public static final void method1896(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 == -1) {
			Statics.field810 = -1;
			Statics.field3538 = -1;
			return;
		}
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		CoordGrid var4 = client.world.method7727();
		int var5 = var2 - var4.field7426;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 >= client.world.method7728()) {
			var5 = client.world.method7728();
		}
		int var6 = var3 - var4.field7427;
		if (var6 < 0) {
			var6 = 0;
		} else if (var6 >= client.world.method7758()) {
			var6 = client.world.method7758();
		}
		Statics.field810 = (var5 << 9) + 256;
		Statics.field3538 = (var6 << 9) + 256;
	}

	@ObfuscatedName("fo.ang(Lyf;I)V")
	public static final void method3282(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field3416 == 2 ? 1 : 0;
	}

	@ObfuscatedName("sr.ana(Lyf;I)V")
	public static final void method8175(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("fu.anv(Lyf;B)V")
	public static final void method3023(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		String var3 = (String) arg0.field8218[arg0.field8211 + 2];
		boolean var4 = arg0.field8216[--arg0.field8226] == 1;
		LoginManager.method665(var1, var2, var3, var4);
	}

	@ObfuscatedName("nv.anu(Lyf;B)V")
	public static final void method6117(ClientScriptState arg0) throws class1109 {
		int var1 = arg0.field8216[--arg0.field8226];
		Statics.field9155.method4684(class263.method3259(var1), true);
		client.field10902 = true;
	}

	@ObfuscatedName("nu.ant(Lyf;B)V")
	public static final void method6074(ClientScriptState arg0) throws class1109 {
		int var1 = arg0.field8216[--arg0.field8226];
		Statics.field9155.method4688(class266.method1058(var1), true);
		client.field10902 = true;
	}

	@ObfuscatedName("xe.anh(Lyf;I)V")
	public static final void method10286(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Vector3 var3 = Vector3.method6483((float) var1, (float) var1, (float) var1);
		if (var3.field4308 == -1.0F) {
			var3.field4308 = Float.POSITIVE_INFINITY;
		}
		if (var3.field4311 == -1.0F) {
			var3.field4311 = Float.POSITIVE_INFINITY;
		}
		if (var3.field4313 == -1.0F) {
			var3.field4313 = Float.POSITIVE_INFINITY;
		}
		Statics.field9155.method4690(var3);
		Statics.field9155.method4712((float) var2 / 1000.0F);
		var3.method6486();
	}

	@ObfuscatedName("wu.anp(Lyf;I)V")
	public static final void method9634(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Vector3 var3 = Vector3.method6483((float) var1, (float) var1, (float) var1);
		if (var3.field4308 == -1.0F) {
			var3.field4308 = Float.POSITIVE_INFINITY;
		}
		if (var3.field4311 == -1.0F) {
			var3.field4311 = Float.POSITIVE_INFINITY;
		}
		if (var3.field4313 == -1.0F) {
			var3.field4313 = Float.POSITIVE_INFINITY;
		}
		Statics.field9155.method4814(var3);
		Statics.field9155.method4766((float) var2 / 1000.0F);
		var3.method6486();
	}

	@ObfuscatedName("akb.anr(Lyf;I)V")
	public static final void method17876(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		Vector3 var2 = Vector3.method6483((float) var1, (float) var1, (float) var1);
		Statics.field9155.method4832(var2);
		var2.method6486();
	}

	@ObfuscatedName("uv.ank(Lyf;I)V")
	public static final void method9180(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		Vector3 var2 = Vector3.method6483((float) var1, (float) var1, (float) var1);
		Statics.field9155.method4695(var2);
		var2.method6486();
	}

	@ObfuscatedName("aca.anx(Lyf;I)V")
	public static final void method14934(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.field9155.method4698((float) var1, (float) var2);
	}

	@ObfuscatedName("eu.anz(Lyf;B)V")
	public static final void method2740(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.field9155.method4828((float) ((double) var1 * 3.141592653589793D * 2.0D / 16384.0D), (float) ((double) var2 * 3.141592653589793D * 2.0D / 16384.0D));
	}

	@ObfuscatedName("kl.anj(Lyf;I)V")
	public static final void method5244(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		if (Statics.field9155.method4743() != class263.field2790) {
			throw new RuntimeException();
		}
		class1069 var2 = (class1069) Statics.field9155.method4797();
		var2.method18776(var1);
		client.field10902 = true;
	}

	@ObfuscatedName("kj.ans(Lyf;I)V")
	public static final void method5357(ClientScriptState arg0) {
		if (Statics.field9155.method4780() != class266.field2816) {
			throw new RuntimeException();
		}
		arg0.field8218[++arg0.field8211 - 1] = Statics.field9155.method4717();
	}

	@ObfuscatedName("hq.anc(Lyf;Lahm;I)V")
	public static final void method3936(ClientScriptState arg0, PathingEntity arg1) {
		arg0.field8226 -= 4;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		int var4 = arg0.field8216[arg0.field8226 + 2];
		boolean var5 = arg0.field8216[arg0.field8226 + 3] == 1;
		if (Statics.field9155.method4743() != class263.field2788) {
			throw new RuntimeException();
		}
		class1071 var6 = (class1071) Statics.field9155.method4797();
		if (arg1 != null) {
			var6.method18816(arg1, new Vector3((float) var2, (float) var3, (float) var4), var5);
		}
		client.field10902 = true;
	}

	@ObfuscatedName("pj.anb(Lyf;B)V")
	public static final void method6982(ClientScriptState arg0) {
		method3936(arg0, Statics.field4490);
	}

	@ObfuscatedName("as.anw(Lyf;I)V")
	public static final void method755(ClientScriptState arg0) {
		method3936(arg0, arg0.field8221);
	}

	@ObfuscatedName("go.ano(Lyf;Lahm;I)V")
	public static final void method3474(ClientScriptState arg0, PathingEntity arg1) {
		arg0.field8226 -= 7;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		int var4 = arg0.field8216[arg0.field8226 + 2];
		int var5 = arg0.field8216[arg0.field8226 + 3];
		int var6 = arg0.field8216[arg0.field8226 + 4];
		boolean var7 = arg0.field8216[arg0.field8226 + 5] == 1;
		int var8 = arg0.field8216[arg0.field8226 + 6];
		if (Statics.field9155.method4780() != class266.field2815) {
			throw new RuntimeException();
		}
		class910 var9 = (class910) Statics.field9155.method4709();
		class421 var10 = new class421();
		class421 var11 = new class421();
		var10.method6414(0.0F, 1.0F, 0.0F, (float) ((double) var6 * 3.141592653589793D * 2.0D / 16384.0D));
		Vector3 var12 = new Vector3(1.0F, 0.0F, 0.0F);
		var12.method6526(var10);
		var12.method6494();
		var11.method6413(var12, (float) ((double) var5 * 3.141592653589793D * 2.0D / 16384.0D));
		var10.method6424(var11);
		CoordGrid var13 = client.world.method7727();
		int var14 = var13.field7426 << 9;
		int var15 = var13.field7427 << 9;
		if (arg1 != null) {
			var9.method16683(arg1, new Vector3((float) var2, (float) var3, (float) var4), var10, var7, var8, client.world.method7744().field4540, client.world.method7793(), var14, var15);
		}
		client.field10902 = true;
	}

	@ObfuscatedName("bf.ani(Lyf;B)V")
	public static final void method1017(ClientScriptState arg0) {
		method3474(arg0, Statics.field4490);
	}

	@ObfuscatedName("pv.aou(Lyf;B)V")
	public static final void method6976(ClientScriptState arg0) {
		method3474(arg0, arg0.field8221);
	}

	@ObfuscatedName("tv.aoy(Lyf;B)V")
	public static final void method8672(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		float var4 = (float) (Math.atan((double) ((float) var1 / 2.0F / (float) var3)) * 2.0D);
		float var5 = (float) (Math.atan((double) ((float) var2 / 2.0F / (float) var3)) * 2.0D);
		Statics.field9155.method4828(var4, var5);
	}

	@ObfuscatedName("gq.aoi(Lyf;I)V")
	public static final void method3466(ClientScriptState arg0) {
		if (!Statics.field9155.method4780().method4623()) {
			throw new RuntimeException();
		}
		class911 var1 = (class911) Statics.field9155.method4709();
		var1.method16720(Statics.field3178, -1, 0.0F);
		client.field10902 = true;
	}

	@ObfuscatedName("aal.aow(Lyf;I)V")
	public static final void method14484(ClientScriptState arg0) {
		if (!Statics.field9155.method4743().method4602()) {
			throw new RuntimeException();
		}
		class1072 var1 = (class1072) Statics.field9155.method4797();
		var1.method18832(Statics.field3178, -1, 0.0F);
		client.field10902 = true;
	}

	@ObfuscatedName("if.aob(Lyf;I)V")
	public static final void method4571(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field9155.method4708().field2827;
	}

	@ObfuscatedName("he.aos(Lyf;I)V")
	public static final void method4076(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field9155.method4780() == null ? -1 : Statics.field9155.method4780().field2814;
	}

	@ObfuscatedName("rp.aoc(Lyf;I)V")
	public static final void method7475(ClientScriptState arg0) {
		if (Statics.field9155.method4780() != class266.field2815) {
			throw new RuntimeException();
		}
		class910 var1 = (class910) Statics.field9155.method4709();
		arg0.field8216[++arg0.field8226 - 1] = (int) ((double) var1.method16693() * 2607.5945876176133D) & 0x3FFF;
		arg0.field8216[++arg0.field8226 - 1] = (int) ((double) var1.method16694() * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("qb.aod(Lyf;B)V")
	public static final void method7373(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		class248 var4 = Statics.method1599(var1);
		float var5 = (float) var2;
		if (class248.field2622 == var4 || class248.field2623 == var4 || class248.field2624 == var4) {
			var5 = Trig1.method6277(var2);
		}
		class1227 var6 = new class1227(Statics.field9155.method16602(), var4, var5, (float) var3 / 1000.0F);
		Statics.field9155.method4702(var6);
		arg0.field8216[++arg0.field8226 - 1] = var6.field12341;
	}

	@ObfuscatedName("aaq.aok(Lyf;I)V")
	public static final void method14430(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Statics.field9155.method4703(var1);
	}

	@ObfuscatedName("sn.aov(Lyf;B)V")
	public static final void method8155(ClientScriptState arg0) {
		Statics.field9155.method4705();
	}

	@ObfuscatedName("ar.aor(Lyf;I)V")
	public static final void method853(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		Vector3 var5 = Vector3.method6483((float) var1, (float) var2, (float) var3);
		if (var5.field4308 == -1.0F) {
			var5.field4308 = Float.POSITIVE_INFINITY;
		}
		if (var5.field4311 == -1.0F) {
			var5.field4311 = Float.POSITIVE_INFINITY;
		}
		if (var5.field4313 == -1.0F) {
			var5.field4313 = Float.POSITIVE_INFINITY;
		}
		Statics.field9155.method4690(var5);
		Statics.field9155.method4712((float) var4 / 1000.0F);
		var5.method6486();
	}

	@ObfuscatedName("qn.aol(Lyf;S)V")
	public static final void method7366(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		Vector3 var5 = Vector3.method6483((float) var1, (float) var2, (float) var3);
		if (var5.field4308 == -1.0F) {
			var5.field4308 = Float.POSITIVE_INFINITY;
		}
		if (var5.field4311 == -1.0F) {
			var5.field4311 = Float.POSITIVE_INFINITY;
		}
		if (var5.field4313 == -1.0F) {
			var5.field4313 = Float.POSITIVE_INFINITY;
		}
		Statics.field9155.method4814(var5);
		Statics.field9155.method4766((float) var4 / 1000.0F);
		var5.method6486();
	}

	@ObfuscatedName("x.aom(Lyf;B)V")
	public static final void method571(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Vector3 var4 = Vector3.method6483((float) var1, (float) var2, (float) var3);
		Statics.field9155.method4832(var4);
		var4.method6486();
	}

	@ObfuscatedName("bc.aoj(Lyf;I)V")
	public static final void method1060(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Vector3 var4 = Vector3.method6483((float) var1, (float) var2, (float) var3);
		Statics.field9155.method4695(var4);
		var4.method6486();
	}

	@ObfuscatedName("aqy.aof(Lyf;B)V")
	public static final void method19200(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Statics.field9155.method4780() != class266.field2815 || Statics.field9155.method4743() != class263.field2788) {
			throw new RuntimeException();
		}
		class910 var2 = (class910) Statics.field9155.method4709();
		class1071 var3 = (class1071) Statics.field9155.method4797();
		Vector3 var4 = var2.method16691();
		Vector3 var5 = Vector3.method6484(var4);
		var5.field4311 += var1;
		Vector3 var6 = Vector3.method6528(var3.method14133(), var5);
		var6.method6513();
		float var7 = var2.method16692().method6519();
		RayTracing.method6592(var3.method14133(), var6, var4, var7, field8210);
		Object var8 = null;
		if (field8210[0] == null) {
			throw new RuntimeException("");
		}
		Vector3 var9;
		if (field8210[1] == null) {
			var9 = field8210[0];
		} else if (Vector3.method6528(var3.method14133(), field8210[0]).method6519() < Vector3.method6528(var3.method14133(), field8210[1]).method6519()) {
			var9 = field8210[1];
		} else {
			var9 = field8210[0];
		}
		float var10 = class688.method9272(var4.field4308 - var9.field4308, var4.field4313 - var9.field4313);
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = (int) ((double) var10 * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("pz.aop(Lyf;I)V")
	public static final void method6821(ClientScriptState arg0) {
		if (Statics.field9155.method4780() != class266.field2815 || Statics.field9155.method4743() != class263.field2788) {
			throw new RuntimeException();
		}
		Vector3 var1 = ((class910) Statics.field9155.method4709()).method16691();
		Vector3 var2 = ((class1071) Statics.field9155.method4797()).method18819();
		Vector3 var3 = Vector3.method6484(var1);
		var3.method6537(var2);
		float var4 = class688.method9272(var3.field4308, var3.field4313);
		arg0.field8216[++arg0.field8226 - 1] = (int) ((double) var4 * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("f.aog(Lyf;I)V")
	public static final void method222(ClientScriptState arg0) {
		if (Statics.field9155.method4780() != class266.field2815 || Statics.field9155.method4743() != class263.field2788) {
			throw new RuntimeException();
		}
		Vector3 var1 = ((class910) Statics.field9155.method4709()).method16691();
		Vector3 var2 = ((class1071) Statics.field9155.method4797()).method18819();
		Vector3 var3 = Vector3.method6484(var1);
		var3.method6537(var2);
		arg0.field8216[++arg0.field8226 - 1] = (int) var3.method6519();
	}

	@ObfuscatedName("qf.aot(Lyf;I)V")
	public static final void method7323(ClientScriptState arg0) {
		if (Statics.field9155.method4780() != class266.field2816) {
			throw new RuntimeException();
		}
		((class909) Statics.field9155.method4709()).method16672(arg0.field8216[--arg0.field8226] == 1);
	}

	@ObfuscatedName("dl.aoe(Lyf;I)V")
	public static final void method2093(ClientScriptState arg0) {
		float var1 = Trig1.method6277(arg0.field8216[--arg0.field8226]);
		class1226 var2 = new class1226(Statics.field9155.method16602(), var1);
		Statics.field9155.method4702(var2);
		arg0.field8216[++arg0.field8226 - 1] = var2.field12341;
	}

	@ObfuscatedName("mz.aon(Lyf;I)V")
	public static final void method5845(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		float var2 = Trig1.method6277(arg0.field8216[arg0.field8226 + 1]);
		class1180 var3 = Statics.field9155.method4704(var1);
		if (var3 == null) {
			throw new RuntimeException("");
		} else if (var3 instanceof class1226) {
			((class1226) var3).method19713(var2);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("xc.aoh(Lyf;I)V")
	public static final void method10253(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		float var2 = (float) arg0.field8216[arg0.field8226 + 1] / 1000.0F;
		Statics.field9155.method4701(var1, var2);
	}

	@ObfuscatedName("wg.aox(Lyf;S)V")
	public static final void method9755(ClientScriptState arg0) throws class1109 {
		int var1 = arg0.field8216[--arg0.field8226];
		class267 var2 = class267.method17805(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Statics.field9155.method4689(var2);
	}

	@ObfuscatedName("ur.aoq(Lyf;S)V")
	public static final void method9214(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 4;
		float var1 = (float) arg0.field8216[arg0.field8226];
		float var2 = (float) arg0.field8216[arg0.field8226 + 1];
		float var3 = (float) arg0.field8216[arg0.field8226 + 2];
		float var4 = (float) arg0.field8216[arg0.field8226 + 3] / 1000.0F;
		Statics.field9155.method4696(Vector3.method6483(var1, var2, var3), var4);
	}

	@ObfuscatedName("qd.aoz(Lyf;I)V")
	public static final void method7261(ClientScriptState arg0) throws class1109 {
		Statics.field9155.method4712((float) arg0.field8216[--arg0.field8226] / 1000.0F);
	}

	@ObfuscatedName("qj.api(Lyf;B)V")
	public static final void method7240(ClientScriptState arg0) throws class1109 {
		Statics.field9155.method4766((float) arg0.field8216[--arg0.field8226] / 1000.0F);
	}

	@ObfuscatedName("qo.apw(Lyf;I)V")
	public static final void method7315(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 4;
		float var1 = (float) arg0.field8216[arg0.field8226];
		float var2 = (float) arg0.field8216[arg0.field8226 + 1];
		float var3 = (float) arg0.field8216[arg0.field8226 + 2];
		float var4 = (float) arg0.field8216[arg0.field8226 + 3] / 1000.0F;
		Statics.field9155.method4699(Vector3.method6483(var1, var2, var3), var4);
	}

	@ObfuscatedName("ajd.ape(Lyf;I)V")
	public static final void method17447(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 4;
		float var1 = (float) arg0.field8216[arg0.field8226];
		float var2 = (float) arg0.field8216[arg0.field8226 + 1];
		float var3 = (float) arg0.field8216[arg0.field8226 + 2];
		float var4 = (float) arg0.field8216[arg0.field8226 + 3] / 1000.0F;
		Statics.field9155.method4725(Vector3.method6483(var1, var2, var3), var4);
	}

	@ObfuscatedName("rt.apq(Lyf;S)V")
	public static final void method7721(ClientScriptState arg0) {
		boolean var1 = arg0.field8216[--arg0.field8226] == 1;
		if (var1) {
			client.method4046(3);
		} else {
			client.method4046(2);
		}
	}

	@ObfuscatedName("ua.apm(Lyf;I)V")
	public static final void method9006(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field3416 == 3 ? 1 : 0;
	}

	@ObfuscatedName("ho.apy(Lyf;I)V")
	public static final void method4271(ClientScriptState arg0) throws class1109 {
		arg0.field8226 -= 3;
		Statics.field9155.method4782((float) arg0.field8216[arg0.field8226], (float) arg0.field8216[arg0.field8226 + 1], (float) arg0.field8216[arg0.field8226 + 2]);
	}

	@ObfuscatedName("wg.apu(Lyf;I)V")
	public static final void method9758(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		if (Statics.field9155.method4743() != class263.field2791) {
			throw new RuntimeException();
		}
		((class1070) Statics.field9155.method4797()).method18785(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1], arg0.field8216[arg0.field8226 + 2]);
	}

	@ObfuscatedName("tt.apc(Lyf;I)V")
	public static final void method8642(ClientScriptState arg0) {
		if (Statics.field9155.method4743() != class263.field2791) {
			throw new RuntimeException();
		}
		((class1070) Statics.field9155.method4797()).method18783(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("ga.apg(Lyf;B)V")
	public static final void method3544(ClientScriptState arg0) {
		if (Statics.field9155.method4743() != class263.field2791) {
			throw new RuntimeException();
		}
		((class1070) Statics.field9155.method4797()).method18789(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("e.apx(Lyf;I)V")
	public static final void method134(ClientScriptState arg0) {
		if (Statics.field9155.method4743() != class263.field2791) {
			throw new RuntimeException();
		}
		((class1070) Statics.field9155.method4797()).method18788(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("tl.apb(Lyf;I)V")
	public static final void method8896(ClientScriptState arg0) {
		if (Statics.field9155.method4743() != class263.field2791) {
			throw new RuntimeException();
		}
		((class1070) Statics.field9155.method4797()).method18784(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("yu.apl(Lyf;I)V")
	public static final void method13847(ClientScriptState arg0) {
		arg0.field8226 -= 6;
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		if (Statics.field9155.method4743() != class263.field2791) {
			throw new RuntimeException();
		}
		((class1070) Statics.field9155.method4797()).method18780(var1.method17853(), arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1], arg0.field8216[arg0.field8226 + 2], arg0.field8216[arg0.field8226 + 3], arg0.field8216[arg0.field8226 + 4], arg0.field8216[arg0.field8226 + 5]);
	}

	@ObfuscatedName("eu.apr(Lyf;I)V")
	public static final void method2735(ClientScriptState arg0) {
		Statics.method9584();
	}

	@ObfuscatedName("ek.apo(Lyf;I)V")
	public static final void method2820(ClientScriptState arg0) {
		if (!LoginManager.method2865()) {
			LoginManager.method9067();
		}
	}

	@ObfuscatedName("ag.apv(Lyf;I)V")
	public static final void method668(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		AccountCreationManager.method233(var1);
	}

	@ObfuscatedName("pc.apd(Lyf;B)V")
	public static final void method7094(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		AccountCreationManager.method18305(var1);
	}

	@ObfuscatedName("ki.app(Lyf;B)V")
	public static final void method5176(ClientScriptState arg0) {
		AccountCreationManager.method2009();
	}

	@ObfuscatedName("ags.apz(Lyf;I)V")
	public static final void method16458(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		arg0.field8226 -= 2;
		AccountCreationManager.method19266((String) arg0.field8218[arg0.field8211], (String) arg0.field8218[arg0.field8211 + 1], arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1] == 1, (String) arg0.field8218[arg0.field8211 + 2]);
	}

	@ObfuscatedName("sp.aph(Lyf;I)V")
	public static final void method8278(ClientScriptState arg0) {
		AccountCreationManager.method16428(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("yu.apa(Lyf;I)V")
	public static final void method13840(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field464 * 2500;
	}

	@ObfuscatedName("ea.apf(Lyf;I)V")
	public static final void method2885(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field486;
	}

	@ObfuscatedName("ahz.apk(Lyf;B)V")
	public static final void method16655(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = AccountCreationManager.method18475().getId();
	}

	@ObfuscatedName("acl.aps(Lyf;I)V")
	public static final void method15109(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = AccountCreationManager.method9583().getId();
	}

	@ObfuscatedName("ge.aqd(Lyf;B)V")
	public static final void method3572(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = AccountCreationManager.method16613().getId();
	}

	@ObfuscatedName("ake.aqv(Lyf;I)V")
	public static final void method17804(ClientScriptState arg0) {
		SuggestNameReply var1 = AccountCreationManager.method16742();
		String var2 = AccountCreationManager.method10209();
		if (var2 == null) {
			var2 = "";
		}
		arg0.field8216[++arg0.field8226 - 1] = var1.getId();
		arg0.field8218[++arg0.field8211 - 1] = var2;
	}

	@ObfuscatedName("qf.aqn(Lyf;I)V")
	public static final void method7325(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = AccountCreationManager.method2858().getId();
	}

	@ObfuscatedName("if.aqm(Lyf;B)V")
	public static final void method4570(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field483;
	}

	@ObfuscatedName("qg.aqk(Lyf;I)V")
	public static final void method7209(ClientScriptState arg0) {
		LoginManager.method1681((String) arg0.field8218[--arg0.field8211], arg0.field8216[--arg0.field8226] == 1);
	}

	@ObfuscatedName("vo.aqz(Lyf;I)V")
	public static final void method9308(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		String var3 = (String) arg0.field8218[arg0.field8211 + 2];
		boolean var4 = arg0.field8216[--arg0.field8226] == 1;
		LoginManager.method18565(var1, var2, var3, var4);
	}

	@ObfuscatedName("u.aqp(Lyf;I)V")
	public static final void method264(ClientScriptState arg0) {
		arg0.field8211--;
		arg0.field8226--;
	}

	@ObfuscatedName("hv.aqx(Lyf;I)V")
	public static final void method4295(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("mt.aqt(Lyf;I)V")
	public static final void method5892(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("fm.aqh(Lyf;I)V")
	public static final void method3005(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("kj.aqy(Lyf;I)V")
	public static final void method5356(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("sx.aqw(Lyf;S)V")
	public static final void method8019(ClientScriptState arg0) {
	}

	@ObfuscatedName("gl.aqe(Lyf;I)V")
	public static final void method3473(ClientScriptState arg0) {
	}

	@ObfuscatedName("kl.aqr(Lyf;I)V")
	public static final void method5245(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("u.aqu(Lyf;B)V")
	public static final void method265(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("tr.aqq(Lyf;B)V")
	public static final void method8429(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("tu.aqs(Lyf;B)V")
	public static final void method8400(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("ahj.aqb(Lyf;I)V")
	public static final void method16612(ClientScriptState arg0) {
		arg0.field8211--;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("dm.aqo(Lyf;I)V")
	public static final void method1928(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("vz.aqi(Lyf;I)V")
	public static final void method9553(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("x.aqf(Lyf;I)V")
	public static final void method572(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("uf.aqg(Lyf;B)V")
	public static final void method9024(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("jk.aqa(Lyf;B)V")
	public static final void method5113(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8226--;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("ib.aql(Lyf;B)V")
	public static final void method4496(ClientScriptState arg0) {
	}

	@ObfuscatedName("il.aqj(Lyf;I)V")
	public static final void method4502(ClientScriptState arg0) {
		arg0.field8211--;
	}

	@ObfuscatedName("acv.are(Lyf;I)V")
	public static final void method15003(ClientScriptState arg0) {
	}

	@ObfuscatedName("qd.arx(Lyf;B)V")
	public static final void method7262(ClientScriptState arg0) {
	}

	@ObfuscatedName("akv.arg(Lyf;I)V")
	public static final void method17827(ClientScriptState arg0) {
		client.logout(false);
	}

	@ObfuscatedName("fx.arp(Lyf;I)V")
	public static final void method3081(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field476;
	}

	@ObfuscatedName("qw.ari(Lyf;B)V")
	public static final void method7303(ClientScriptState arg0) {
		if (client.state == 17) {
			ClientMessage var1 = Statics.method1604(ClientProt.UID_PASSPORT_RESEND_REQUEST, client.field10835.field794);
			client.field10835.method934(var1);
		}
	}

	@ObfuscatedName("wu.ary(Lyf;B)V")
	public static final void method9631(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10776;
		arg0.field8216[++arg0.field8226 - 1] = client.field10775;
	}

	@ObfuscatedName("tu.arl(Lyf;I)V")
	public static final void method8397(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10814 ? 1 : 0;
	}

	@ObfuscatedName("ahg.arj(Lyf;B)V")
	public static final void method16670(ClientScriptState arg0) {
		client.field10814 = true;
		client.method3094();
	}

	@ObfuscatedName("adv.arc(Lyf;B)V")
	public static final void method15251(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field469;
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field444;
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field479;
		LoginManager.field469 = -2;
		LoginManager.field444 = -1;
		LoginManager.field479 = -1;
	}

	@ObfuscatedName("gr.art(Lyf;B)V")
	public static final void method3574(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.method2865() ? 1 : 0;
	}

	@ObfuscatedName("sx.arb(Lyf;B)V")
	public static final void method8020(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field467;
	}

	@ObfuscatedName("ys.arw(Lyf;S)V")
	public static final void method10454(ClientScriptState arg0) {
		LoginManager.method14129();
	}

	@ObfuscatedName("oo.arh(Lyf;B)V")
	public static final void method6130(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		boolean var3 = arg0.field8216[arg0.field8226 + 1] == 1;
		LoginManager.method2050(var1, var2, var3);
	}

	@ObfuscatedName("cc.aru(Lyf;I)V")
	public static final void method1585(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		boolean var3 = arg0.field8216[arg0.field8226 + 1] == 1;
		LoginManager.method17463(var1, var2, var3);
	}

	@ObfuscatedName("ahq.arf(Lyf;B)V")
	public static final void method16643(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field482;
	}

	@ObfuscatedName("on.arz(Lyf;B)V")
	public static final void method6242(ClientScriptState arg0) {
		if (client.field10790 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = client.field10790;
		}
	}

	@ObfuscatedName("kr.arv(Lyf;I)V")
	public static final void method5330(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		long var2 = AccountAppealManager.method14886();
		if (var2 == 0L) {
			arg0.field8216[++arg0.field8226 - 1] = 5;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = AccountAppealManager.method14753(var2, var1);
		}
	}

	@ObfuscatedName("akw.ars(Lyf;I)V")
	public static final void method17722(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Statics.field688.method18157(Statics.field688.field11533, var1);
		Statics.field688.method18157(Statics.field688.field11534, var1);
		Statics.field688.field11533.method18495();
		Statics.field688.field11534.method18495();
		client.method3128();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("fv.arm(Lyf;I)V")
	public static final void method3086(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11526, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("ec.ark(Lyf;B)V")
	public static final void method2792(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11546, arg0.field8216[--arg0.field8226]);
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("fz.ara(Lyf;I)V")
	public static final void method3043(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11568, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("aae.ard(Lyf;I)V")
	public static final void method14481(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11529, arg0.field8216[--arg0.field8226]);
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("ju.arr(Lyf;S)V")
	public static final void method4661(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11530, arg0.field8216[--arg0.field8226]);
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("no.asa(Lyf;I)V")
	public static final void method5984(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11528, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		client.method9516();
		client.world.method7816().method10019();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("yu.asg(Lyf;B)V")
	public static final void method13849(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11541, arg0.field8216[--arg0.field8226] == 1 ? 2 : 0);
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("ck.aso(Lyf;B)V")
	public static final void method1596(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11564, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("xe.ask(Lyf;B)V")
	public static final void method10285(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11516, arg0.field8216[--arg0.field8226]);
		client.method486(Statics.field688.field11540.method18545(), false);
		class48.method16391();
	}

	@ObfuscatedName("oo.asd(Lyf;I)V")
	public static final void method6131(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11557, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("io.asy(Lyf;I)V")
	public static final void method4372(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11563, arg0.field8216[--arg0.field8226]);
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("e.asc(Lyf;I)V")
	public static final void method136(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11511, arg0.field8216[--arg0.field8226]);
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("mw.asq(Lyf;B)V")
	public static final void method5929(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 == -1) {
			Statics.field688.method18157(Statics.field688.field11534, Statics.field688.field11533.method18496());
		} else {
			Statics.field688.method18157(Statics.field688.field11534, var1);
		}
		client.method3128();
	}

	@ObfuscatedName("vj.asf(Lyf;B)V")
	public static final void method9571(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Statics.field688.method18157(Statics.field688.field11532, var1);
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("akw.asp(Lyf;I)V")
	public static final void method17721(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11537, arg0.field8216[--arg0.field8226]);
		class48.method16391();
	}

	@ObfuscatedName("sz.asb(Lyf;B)V")
	public static final void method8320(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11520, arg0.field8216[--arg0.field8226]);
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("ajf.ase(Lyf;I)V")
	public static final void method17522(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 < 0 || var1 > 1) {
			var1 = 0;
		}
		client.method9756(var1 == 1);
	}

	@ObfuscatedName("uk.asl(Lyf;I)V")
	public static final void method9162(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11546, arg0.field8216[--arg0.field8226]);
		class48.method16391();
	}

	@ObfuscatedName("ht.asu(Lyf;I)V")
	public static final void method4145(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11525, arg0.field8216[--arg0.field8226] == 0 ? 0 : 1);
		class48.method16391();
		client.world.method7753();
	}

	@ObfuscatedName("pu.asn(Lyf;I)V")
	public static final void method7073(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 < 0 || var1 > 5 || var1 == 2) {
			var1 = 3;
		}
		client.method486(var1, false);
	}

	@ObfuscatedName("pm.asj(Lyf;S)V")
	public static final void method6811(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		Statics.field688.method18157(Statics.field688.field11524, var1);
		if (!var2) {
			Statics.field688.method18157(Statics.field688.field11515, 0);
		}
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("aax.asv(Lyf;I)V")
	public static final void method14150(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11560, arg0.field8216[--arg0.field8226]);
		class48.method16391();
	}

	@ObfuscatedName("ge.asm(Lyf;I)V")
	public static final void method3565(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11538, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		class48.method16391();
		client.method9516();
		class31.method3076();
		client.field10800 = false;
	}

	@ObfuscatedName("fl.asw(Lyf;I)V")
	public static final void method3137(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11539, arg0.field8216[--arg0.field8226]);
		class48.method16391();
		client.field10836 = true;
	}

	@ObfuscatedName("wu.ast(Lyf;B)V")
	public static final void method9632(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11565, arg0.field8216[--arg0.field8226]);
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("nv.ash(Lyf;I)V")
	public static final void method6112(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = Statics.field688.field11567.method18763();
		if (var1 != var2) {
			Statics.field688.method18157(Statics.field688.field11567, var1);
			class48.method16391();
			client.field10800 = false;
		}
	}

	@ObfuscatedName("tc.asi(Lyf;B)V")
	public static final void method8436(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 > 255 || var1 < 0) {
			var1 = 0;
		}
		if (var1 != Statics.field688.field11559.method18714()) {
			Statics.field688.method18157(Statics.field688.field11559, var1);
			class48.method16391();
			client.field10800 = false;
		}
	}

	@ObfuscatedName("ajh.ass(Lyf;B)V")
	public static final void method17427(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 != Statics.field688.field11508.method18607()) {
			Statics.field688.method18157(Statics.field688.field11508, var1);
			class48.method16391();
			client.field10800 = false;
		}
	}

	@ObfuscatedName("wo.asx(Lyf;B)V")
	public static final void method9618(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 != Statics.field688.field11514.method18665()) {
			Statics.field688.method18157(Statics.field688.field11514, var1);
			class48.method16391();
			client.field10800 = false;
			client.world.method7753();
		}
	}

	@ObfuscatedName("gm.ato(Lyf;B)V")
	public static final void method3599(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("fc.att(Lyf;B)V")
	public static final void method3089(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("vq.atu(Lyf;I)V")
	public static final void method9242(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ye.atp(Lyf;I)V")
	public static final void method10364(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("wu.atl(Lyf;B)V")
	public static final void method9636(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("adc.atv(Lyf;I)V")
	public static final void method15171(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("go.atw(Lyf;I)V")
	public static final void method3476(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("abq.atc(Lyf;I)V")
	public static final void method14693(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("xq.atn(Lyf;I)V")
	public static final void method10335(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("nq.atq(Lyf;I)V")
	public static final void method6063(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("aav.aty(Lyf;I)V")
	public static final void method14593(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("yl.ath(Lyf;I)V")
	public static final void method10679(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("gk.ata(Lyf;I)V")
	public static final void method3478(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("nw.ats(Lyf;B)V")
	public static final void method6017(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("kt.atx(Lyf;I)V")
	public static final void method5391(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ahb.atg(Lyf;I)V")
	public static final void method16669(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11533.method18496();
	}

	@ObfuscatedName("cb.atr(Lyf;I)V")
	public static final void method1562(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11526.method18489() == 1 ? 1 : 0;
	}

	@ObfuscatedName("abv.atk(Lyf;I)V")
	public static final void method14692(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11546.method18645();
	}

	@ObfuscatedName("gk.ati(Lyf;I)V")
	public static final void method3479(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11523.method18419() == 1 ? 1 : 0;
	}

	@ObfuscatedName("yu.atm(Lyf;I)V")
	public static final void method13848(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11568.method18453() == 1 ? 1 : 0;
	}

	@ObfuscatedName("ew.atj(Lyf;I)V")
	public static final void method2902(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11530.method18458();
	}

	@ObfuscatedName("ub.atd(Lyf;I)V")
	public static final void method9084(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11528.method18389() == 1 ? 1 : 0;
	}

	@ObfuscatedName("yo.atf(Lyf;I)V")
	public static final void method10374(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11541.method18522() == 2 ? 1 : 0;
	}

	@ObfuscatedName("s.atb(Lyf;I)V")
	public static final void method483(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11564.method18434() == 1 ? 1 : 0;
	}

	@ObfuscatedName("xc.auq(Lyf;I)V")
	public static final void method10254(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11516.method18639();
	}

	@ObfuscatedName("kt.auf(Lyf;I)V")
	public static final void method5392(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11557.method18758() == 1 ? 1 : 0;
	}

	@ObfuscatedName("el.auj(Lyf;B)V")
	public static final void method2763(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11563.method18763();
	}

	@ObfuscatedName("ye.aut(Lyf;I)V")
	public static final void method10368(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11566.method18763();
	}

	@ObfuscatedName("sa.aue(Lyf;I)V")
	public static final void method8339(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11511.method18763();
	}

	@ObfuscatedName("jg.aur(Lyf;B)V")
	public static final void method5064(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.method8461();
	}

	@ObfuscatedName("wn.auu(Lyf;I)V")
	public static final void method9602(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11537.method18639();
	}

	@ObfuscatedName("ane.auv(Lyf;S)V")
	public static final void method18616(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11520.method18570();
	}

	@ObfuscatedName("hh.aus(Lyf;B)V")
	public static final void method4050(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11519.method18625() == 1 ? 1 : 0;
	}

	@ObfuscatedName("afg.auc(Lyf;I)V")
	public static final void method15724(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11556.method18771() == 1 ? 1 : 0;
	}

	@ObfuscatedName("db.aud(Lyf;I)V")
	public static final void method2112(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11546.method18645();
	}

	@ObfuscatedName("bf.aup(Lyf;I)V")
	public static final void method1019(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11525.method18651() == 1 ? 1 : 0;
	}

	@ObfuscatedName("du.aum(Lyf;I)V")
	public static final void method2089(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11540.method18545();
	}

	@ObfuscatedName("gj.auk(Lyf;I)V")
	public static final void method3618(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11524.method18545();
	}

	@ObfuscatedName("nt.aux(Lyf;B)V")
	public static final void method6039(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11560.method18735();
	}

	@ObfuscatedName("db.auw(Lyf;I)V")
	public static final void method2110(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11538.method18426() == 1 ? 1 : 0;
	}

	@ObfuscatedName("kf.aul(Lyf;B)V")
	public static final void method5169(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.method15172(Statics.field688.field11540.method18545(), 200);
	}

	@ObfuscatedName("fd.aui(Lyf;I)V")
	public static final void method3062(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11539.method18581();
	}

	@ObfuscatedName("wd.auz(Lyf;I)V")
	public static final void method9871(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11565.method18763();
	}

	@ObfuscatedName("ach.auh(Lyf;B)V")
	public static final void method14986(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11567.method18763();
	}

	@ObfuscatedName("j.aua(Lyf;B)V")
	public static final void method643(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10779 ? 1 : 0;
	}

	@ObfuscatedName("dy.aub(Lyf;B)V")
	public static final void method2100(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11559.method18714();
	}

	@ObfuscatedName("jd.aun(Lyf;I)V")
	public static final void method4639(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11531.method18504();
	}

	@ObfuscatedName("ec.auy(Lyf;I)V")
	public static final void method2795(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field10581.field11613 < 512 || client.field10779 || client.field10796 ? 1 : 0;
	}

	@ObfuscatedName("wp.aug(Lyf;I)V")
	public static final void method9738(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10812 ? 1 : 0;
	}

	@ObfuscatedName("aks.auo(Lyf;B)V")
	public static final void method17809(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11522.method18688();
	}

	@ObfuscatedName("aoq.avs(Lyf;I)V")
	public static final void method18918(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11508.method18607();
	}

	@ObfuscatedName("iu.avm(Lyf;I)V")
	public static final void method4409(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ur.avn(Lyf;I)V")
	public static final void method9216(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("uc.avb(Lyf;I)V")
	public static final void method8978(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("fq.avo(Lyf;I)V")
	public static final void method3122(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("afd.avr(Lyf;B)V")
	public static final void method16392(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("pj.avh(Lyf;I)V")
	public static final void method6984(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("fy.avj(Lyf;I)V")
	public static final void method3365(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("pj.ava(Lyf;I)V")
	public static final void method6983(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ns.avk(Lyf;I)V")
	public static final void method6102(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("abr.ave(Lyf;I)V")
	public static final void method14635(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("iz.avg(Lyf;S)V")
	public static final void method4612(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("gc.avf(Lyf;I)V")
	public static final void method3550(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("mj.avy(Lyf;I)V")
	public static final void method5927(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ur.avv(Lyf;I)V")
	public static final void method9215(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("fr.avx(Lyf;B)V")
	public static final void method3378(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ec.avw(Lyf;I)V")
	public static final void method2793(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("nc.avd(Lyf;I)V")
	public static final void method6108(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("abx.avq(Lyf;B)V")
	public static final void method14887(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		client.field11066 = (short) arg0.field8216[arg0.field8226];
		if (client.field11066 <= 0) {
			client.field11066 = 256;
		}
		client.field10987 = (short) arg0.field8216[arg0.field8226 + 1];
		if (client.field10987 <= 0) {
			client.field10987 = 205;
		}
	}

	@ObfuscatedName("pp.avt(Lyf;I)V")
	public static final void method7042(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		client.field10874 = (short) arg0.field8216[arg0.field8226];
		if (client.field10874 <= 0) {
			client.field10874 = 256;
		}
		client.field11069 = (short) arg0.field8216[arg0.field8226 + 1];
		if (client.field11069 <= 0) {
			client.field11069 = 320;
		}
	}

	@ObfuscatedName("gw.avz(Lyf;I)V")
	public static final void method3622(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		client.field11070 = (short) arg0.field8216[arg0.field8226];
		if (client.field11070 <= 0) {
			client.field11070 = 1;
		}
		client.field11071 = (short) arg0.field8216[arg0.field8226 + 1];
		if (client.field11071 <= 0) {
			client.field11071 = 32767;
		} else if (client.field11071 < client.field11070) {
			client.field11071 = client.field11070;
		}
		client.field10900 = (short) arg0.field8216[arg0.field8226 + 2];
		if (client.field10900 <= 0) {
			client.field10900 = 1;
		}
		client.field10943 = (short) arg0.field8216[arg0.field8226 + 3];
		if (client.field10943 <= 0) {
			client.field10943 = 32767;
		} else if (client.field10943 < client.field10900) {
			client.field10943 = client.field10900;
		}
	}

	@ObfuscatedName("yb.avl(Lyf;I)V")
	public static final void method10565(ClientScriptState arg0) {
		client.method13981(0, 0, client.field10986.field2196, client.field10986.field2197, false);
		arg0.field8216[++arg0.field8226 - 1] = client.field11076;
		arg0.field8216[++arg0.field8226 - 1] = client.field11077;
	}

	@ObfuscatedName("nc.avc(Lyf;I)V")
	public static final void method6105(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10874;
		arg0.field8216[++arg0.field8226 - 1] = client.field11069;
	}

	@ObfuscatedName("gt.avu(Lyf;I)V")
	public static final void method3590(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field11066;
		arg0.field8216[++arg0.field8226 - 1] = client.field10987;
	}

	@ObfuscatedName("fj.avi(Lyf;B)V")
	public static final void method3052(ClientScriptState arg0) {
		long var1 = MonotonicTime.method3655();
		arg0.field8216[++arg0.field8226 - 1] = (int) (var1 / 60000L);
	}

	@ObfuscatedName("ahp.awu(Lyf;I)V")
	public static final void method16744(ClientScriptState arg0) {
		long var1 = MonotonicTime.method3655();
		arg0.field8216[++arg0.field8226 - 1] = (int) (var1 / 86400000L) - 11745;
	}

	@ObfuscatedName("gq.awn(Lyf;B)V")
	public static final void method3467(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		long var4 = class786.method8691(0, 0, 12, var1, var2, var3);
		int var6 = Statics.method13899(var4);
		if (var3 < 1970) {
			var6--;
		}
		arg0.field8216[++arg0.field8226 - 1] = var6;
	}

	@ObfuscatedName("aqc.awk(Lyf;I)V")
	public static final void method19194(ClientScriptState arg0) {
		long var1 = MonotonicTime.method3655();
		arg0.field8216[++arg0.field8226 - 1] = class786.method16390(var1);
	}

	@ObfuscatedName("ko.awp(Lyf;I)V")
	public static final void method5154(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		boolean var2 = true;
		if (var1 < 0) {
			var2 = (var1 + 1) % 4 == 0;
		} else if (var1 < 1582) {
			var2 = var1 % 4 == 0;
		} else if (var1 % 4 != 0) {
			var2 = false;
		} else if (var1 % 100 != 0) {
			var2 = true;
		} else if (var1 % 400 != 0) {
			var2 = false;
		}
		arg0.field8216[++arg0.field8226 - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("nm.awm(Lyf;I)V")
	public static final void method5958(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Date var2 = TimeZones.getRuneDay(var1);
		arg0.field8216[++arg0.field8226 - 1] = TimeZones.method3628(var2, field8201);
		arg0.field8216[++arg0.field8226 - 1] = TimeZones.method3623(var2, field8201) - 1;
		arg0.field8216[++arg0.field8226 - 1] = TimeZones.method3627(var2, field8201);
	}

	@ObfuscatedName("ks.awr(Lyf;B)V")
	public static final void method5178(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = (int) (class786.method14612(var1) / 60000L);
	}

	@ObfuscatedName("ana.awl(Lyf;I)V")
	public static final void method18683(ClientScriptState arg0) {
		if (client.state != 13 && client.state != 18 || LoginManager.method2865()) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else if (class750.field8754) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else if (Statics.field2826 > MonotonicTime.method3655() - 1000L) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			class750.field8754 = true;
			ServerConnection var1 = client.method640();
			ClientMessage var2 = Statics.method1604(ClientProt.WORLDLIST_FETCH, var1.field794);
			var2.field11432.p4(Statics.field7642);
			var1.method934(var2);
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("fw.awo(Lyf;B)V")
	public static final void method3096(ClientScriptState arg0) {
		class1015 var1 = class750.method13782();
		if (var1 != null) {
			arg0.field8216[++arg0.field8226 - 1] = var1.field11705;
			arg0.field8216[++arg0.field8226 - 1] = var1.field7639;
			arg0.field8218[++arg0.field8211 - 1] = var1.field11704;
			arg0.field8216[++arg0.field8226 - 1] = var1.method18330();
			arg0.field8218[++arg0.field8211 - 1] = var1.method18336();
			arg0.field8216[++arg0.field8226 - 1] = var1.field7641;
			arg0.field8216[++arg0.field8226 - 1] = var1.field11707;
			arg0.field8218[++arg0.field8211 - 1] = var1.field11703;
			return;
		}
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("wh.awv(Lyf;B)V")
	public static final void method9860(ClientScriptState arg0) {
		class1015 var1 = class750.method6048();
		if (var1 != null) {
			arg0.field8216[++arg0.field8226 - 1] = var1.field11705;
			arg0.field8216[++arg0.field8226 - 1] = var1.field7639;
			arg0.field8218[++arg0.field8211 - 1] = var1.field11704;
			arg0.field8216[++arg0.field8226 - 1] = var1.method18330();
			arg0.field8218[++arg0.field8211 - 1] = var1.method18336();
			arg0.field8216[++arg0.field8226 - 1] = var1.field7641;
			arg0.field8216[++arg0.field8226 - 1] = var1.field11707;
			arg0.field8218[++arg0.field8211 - 1] = var1.field11703;
			return;
		}
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("ar.awh(Lyf;B)V")
	public static final void method851(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		int var3 = ServerPorts.method2912(Statics.field1811, class698.field8347, var1);
		int var4 = ServerPorts.method10147(Statics.field1811, class698.field8347, var1);
		if (client.state == 13 && !LoginManager.method2865()) {
			arg0.field8216[++arg0.field8226 - 1] = class750.method9401(var1, var2, var3, var4) ? 1 : 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("f.awx(Lyf;I)V")
	public static final void method220(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		class1015 var2 = class619.method4944(var1);
		if (var2 != null) {
			arg0.field8216[++arg0.field8226 - 1] = var2.field7639;
			arg0.field8218[++arg0.field8211 - 1] = var2.field11704;
			arg0.field8216[++arg0.field8226 - 1] = var2.method18330();
			arg0.field8218[++arg0.field8211 - 1] = var2.method18336();
			arg0.field8216[++arg0.field8226 - 1] = var2.field7641;
			arg0.field8216[++arg0.field8226 - 1] = var2.field11707;
			arg0.field8218[++arg0.field8211 - 1] = var2.field11703;
			return;
		}
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("yy.aws(Lyf;B)V")
	public static final void method13818(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		int var3 = arg0.field8216[arg0.field8226 + 2];
		boolean var4 = arg0.field8216[arg0.field8226 + 3] == 1;
		class750.method5394(var1, var2, var3, var4);
	}

	@ObfuscatedName("xv.awa(Lyf;I)V")
	public static final void method10100(ClientScriptState arg0) {
		class750.method10337();
	}

	@ObfuscatedName("dd.awc(Lyf;I)V")
	public static final void method1623(ClientScriptState arg0) {
		if (client.state == 13) {
			class750.field8759 = arg0.field8216[--arg0.field8226] == 1;
		}
	}

	@ObfuscatedName("dc.awz(Lyf;B)V")
	public static final void method1973(ClientScriptState arg0) {
		class1015 var1 = class750.method477();
		arg0.field8216[++arg0.field8226 - 1] = var1 == null ? 0 : var1.field7639;
	}

	@ObfuscatedName("ji.awe(Lyf;B)V")
	public static final void method4981(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10978;
	}

	@ObfuscatedName("fo.awy(Lyf;I)V")
	public static final void method3284(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (client.field10978 != -1) {
			if (var1 == 0) {
				arg0.field8216[++arg0.field8226 - 1] = client.field10978;
				return;
			}
			var1--;
		}
		SubInterface var2 = (SubInterface) client.field10979.method14500();
		while (var1-- > 0) {
			var2 = (SubInterface) client.field10979.method14502();
		}
		arg0.field8216[++arg0.field8226 - 1] = var2.field11571;
	}

	@ObfuscatedName("er.awq(Lyf;B)V")
	public static final void method2910(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Statics.field11725[var1] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
			return;
		}
		String var2 = Statics.field11725[var1].field2151[0].field2155;
		if (var2 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.substring(0, var2.indexOf(58));
		}
	}

	@ObfuscatedName("arl.aww(Lyf;I)V")
	public static final void method19263(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Statics.field11725[var1] == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Statics.field11725[var1].field2151.length;
		}
	}

	@ObfuscatedName("iu.awd(Lyf;I)V")
	public static final void method4410(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = var1 >> 16;
		if (Statics.field11725[var2] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
			return;
		}
		String var3 = Statics.field11725[var2].field2151[var1].field2155;
		if (var3 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var3;
		}
	}

	@ObfuscatedName("hh.awg(Lyf;I)V")
	public static final void method4051(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = var1 >> 16;
		if (Statics.field11725[var2] == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Statics.field11725[var2].field2151[var1].field2181;
		}
	}

	@ObfuscatedName("at.awb(Lyf;B)V")
	public static final void method809(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(1, var1, var2, "");
	}

	@ObfuscatedName("ys.awf(Lyf;B)V")
	public static final void method10449(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(2, var1, var2, "");
	}

	@ObfuscatedName("yi.awt(Lyf;I)V")
	public static final void method10756(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(3, var1, var2, "");
	}

	@ObfuscatedName("iw.awj(Lyf;B)V")
	public static final void method4518(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(4, var1, var2, "");
	}

	@ObfuscatedName("aas.axc(Lyf;I)V")
	public static final void method14268(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(5, var1, var2, "");
	}

	@ObfuscatedName("sx.axs(Lyf;B)V")
	public static final void method8022(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(6, var1, var2, "");
	}

	@ObfuscatedName("jh.axa(Lyf;I)V")
	public static final void method5079(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(7, var1, var2, "");
	}

	@ObfuscatedName("aax.axn(Lyf;I)V")
	public static final void method14148(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(8, var1, var2, "");
	}

	@ObfuscatedName("afg.axd(Lyf;I)V")
	public static final void method15725(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(9, var1, var2, "");
	}

	@ObfuscatedName("ig.axo(Lyf;I)V")
	public static final void method4392(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Statics.method4527(10, var1, var2, "");
	}

	@ObfuscatedName("fk.axx(ILhf;Lyf;B)V")
	public static final void method3375(int arg0, Component arg1, ClientScriptState arg2) {
		if (arg0 < 1 || arg0 > 10) {
			throw new RuntimeException();
		}
		Statics.method4527(arg0, arg1.field2158, arg1.field2183, "");
	}

	@ObfuscatedName("il.axk(Lyf;I)V")
	public static final void method4503(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		method3375(var3, Component.method16682(var1, var2), arg0);
	}

	@ObfuscatedName("ux.axv(Lyf;B)V")
	public static final void method9209(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		int var3 = arg0.field8216[--arg0.field8226];
		method3375(var3, var2, arg0);
	}

	@ObfuscatedName("ik.axq(Lyf;B)V")
	public static final void method4619(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Component var3 = Component.method16682(var1, var2);
		client.method9403();
		ServerActiveProperties var4 = client.method17197(var3);
		client.method10592(var3, var4.method17691(), var4.field11381);
	}

	@ObfuscatedName("kb.axp(Lyf;B)V")
	public static final void method5251(ClientScriptState arg0) {
		client.method17515();
	}

	@ObfuscatedName("gl.axz(Lyf;I)V")
	public static final void method3472(ClientScriptState arg0) {
		client.field10989 = null;
		client.field10828 = null;
	}

	@ObfuscatedName("nl.axh(Lyf;B)V")
	public static final void method6023(ClientScriptState arg0) {
	}

	@ObfuscatedName("l.axy(Lyf;I)V")
	public static final void method257(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("jx.axj(Lyf;I)V")
	public static final void method5073(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("wn.axm(Lyf;B)V")
	public static final void method9603(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10973 ? 1 : 0;
	}

	@ObfuscatedName("pp.axt(Lyf;I)V")
	public static final void method7043(ClientScriptState arg0) {
		client.method9403();
	}

	@ObfuscatedName("y.axb(Lyf;I)V")
	public static final void method537(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field8202;
	}

	@ObfuscatedName("aoh.axg(Lyf;I)V")
	public static final void method18914(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		MapElementType var2 = (MapElementType) Statics.field5011.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2388;
	}

	@ObfuscatedName("fc.axf(Lyf;I)V")
	public static final void method3088(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		MapElementType var2 = (MapElementType) Statics.field5011.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2374;
	}

	@ObfuscatedName("pu.axu(Lyf;B)V")
	public static final void method7074(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Statics.field3086.get(var2);
		if (var3.method15152()) {
			arg0.field8218[++arg0.field8211 - 1] = ((MapElementType) Statics.field5011.get(var1)).method4029(var2, var3.field9171);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((MapElementType) Statics.field5011.get(var1)).method4028(var2, var3.field9172);
		}
	}

	@ObfuscatedName("tg.axl(Lyf;B)V")
	public static final void method8686(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10951 && !client.field11081 ? 1 : 0;
	}

	@ObfuscatedName("ii.axi(Lyf;B)V")
	public static final void method4609(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = (int) (Statics.field8322 / 60000L);
		arg0.field8216[++arg0.field8226 - 1] = (int) ((Statics.field8322 - MonotonicTime.method3655() - Statics.field1238) / 60000L);
		arg0.field8216[++arg0.field8226 - 1] = Statics.field11709 ? 1 : 0;
	}

	@ObfuscatedName("af.axw(Lyf;I)V")
	public static final void method1007(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field9183;
	}

	@ObfuscatedName("li.ayg(Lyf;B)V")
	public static final void method5398(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field7922;
	}

	@ObfuscatedName("fp.ayn(Lyf;B)V")
	public static final void method3106(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field1839;
	}

	@ObfuscatedName("sc.ayp(Lyf;B)V")
	public static final void method8369(ClientScriptState arg0) {
		String var1 = null;
		if (Statics.field636 != null) {
			var1 = Statics.field636.method544();
		}
		if (var1 == null) {
			var1 = "";
		}
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("pw.ayv(Lyf;B)V")
	public static final void method6791(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6720;
	}

	@ObfuscatedName("ju.ays(Lyf;B)V")
	public static final void method4658(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field4427;
	}

	@ObfuscatedName("nd.ayf(Lyf;B)V")
	public static final void method5940(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field11883 ? 1 : 0;
	}

	@ObfuscatedName("ar.aym(Lyf;I)V")
	public static final void method854(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field7406;
	}

	@ObfuscatedName("ju.ayc(Lyf;B)V")
	public static final void method4659(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6729;
	}

	@ObfuscatedName("iz.ayx(Lyf;I)V")
	public static final void method4613(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field2676;
	}

	@ObfuscatedName("wb.ayk(Lyf;B)V")
	public static final void method9771(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field3056;
	}

	@ObfuscatedName("adv.ayo(Lyf;I)V")
	public static final void method15250(ClientScriptState arg0) {
		int var1 = class48.method4288();
		arg0.field8216[++arg0.field8226 - 1] = Statics.field11775 = Statics.field688.field11540.method18545();
		arg0.field8216[++arg0.field8226 - 1] = var1;
		class31.method3076();
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("jx.ayd(Lyf;I)V")
	public static final void method5069(ClientScriptState arg0) {
	}

	@ObfuscatedName("yj.ayz(Lyf;I)V")
	public static final void method10442(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("all.ayq(Lyf;I)V")
	public static final void method18261(ClientScriptState arg0) {
	}

	@ObfuscatedName("yk.ayt(Lyf;I)V")
	public static final void method10481(ClientScriptState arg0) {
		class48.method9619();
		class31.method3076();
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("alk.aya(Lyf;I)V")
	public static final void method18194(ClientScriptState arg0) {
		class48.method8479();
		class31.method3076();
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("hf.aye(Lyf;B)V")
	public static final void method4017(ClientScriptState arg0) {
		class48.method3056();
		class31.method3076();
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("w.ayh(Lyf;I)V")
	public static final void method230(ClientScriptState arg0) {
		class48.method131(true);
		class31.method3076();
		client.world.method7753();
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("sc.ayl(Lyf;I)V")
	public static final void method8371(ClientScriptState arg0) {
		Statics.field688.method18157(Statics.field688.field11515, 0);
		class48.method16391();
		client.field10800 = false;
	}

	@ObfuscatedName("qo.ayy(Lyf;I)V")
	public static final void method7311(ClientScriptState arg0) {
		if (Statics.field11775 == 1) {
			class48.field786 = true;
		} else if (Statics.field11775 == 3) {
			class48.field788 = true;
		}
	}

	@ObfuscatedName("oi.ayb(Lyf;I)V")
	public static final void method6207(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11515.method18721();
	}

	@ObfuscatedName("aih.ayi(Lyf;I)V")
	public static final void method16901(ClientScriptState arg0) {
		boolean var1 = false;
		if (client.field11079) {
			try {
				Object var2 = class394.field4026.method6097(new Object[] { Statics.field7406, Statics.field4490.field12052 == 1, arg0.field8216[--arg0.field8226] });
				if (var2 != null) {
					var1 = (Boolean) var2;
				}
			} catch (Throwable var4) {
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("jp.ayj(Lyf;I)V")
	public static final void method5100(ClientScriptState arg0) {
		if (client.field11079) {
			class394.field4029.method6090();
		}
	}

	@ObfuscatedName("sb.ayw(Lyf;I)V")
	public static final void method8343(ClientScriptState arg0) {
		if (client.field11079) {
			class394.field4030.method6090();
		}
	}

	@ObfuscatedName("ul.aze(Lyf;I)V")
	public static final void method8912(ClientScriptState arg0) {
		boolean var1 = true;
		if (client.field11079) {
			try {
				Object var2 = class394.field4031.method6088();
				if (var2 != null) {
					var1 = (Boolean) var2;
				}
			} catch (Throwable var4) {
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("ij.azx(Lyf;I)V")
	public static final void method4335(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11526.method18488() ? 1 : 0;
	}

	@ObfuscatedName("rk.azd(Lyf;B)V")
	public static final void method7619(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11568.method18445() ? 1 : 0;
	}

	@ObfuscatedName("nd.azg(Lyf;I)V")
	public static final void method5937(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11529.method18514() ? 1 : 0;
	}

	@ObfuscatedName("r.azu(Lyf;I)V")
	public static final void method324(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11530.method18456() ? 1 : 0;
	}

	@ObfuscatedName("jf.azj(Lyf;B)V")
	public static final void method4650(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11541.method18521() ? 1 : 0;
	}

	@ObfuscatedName("qf.azz(Lyf;B)V")
	public static final void method7324(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11537.method18638() && Statics.field8198.method2141() ? 1 : 0;
	}

	@ObfuscatedName("sl.azb(Lyf;I)V")
	public static final void method8228(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11532.method18466() ? 1 : 0;
	}

	@ObfuscatedName("f.azt(Lyf;B)V")
	public static final void method221(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11520.method18569() ? 1 : 0;
	}

	@ObfuscatedName("ip.azs(Lyf;I)V")
	public static final void method4523(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11525.method18650() ? 1 : 0;
	}

	@ObfuscatedName("dh.azv(Lyf;B)V")
	public static final void method2580(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11538.method18425() ? 1 : 0;
	}

	@ObfuscatedName("anw.azc(Lyf;I)V")
	public static final void method18831(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11539.method18578() ? 1 : 0;
	}

	@ObfuscatedName("gd.azy(Lyf;B)V")
	public static final void method3651(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11564.method18431() ? 1 : 0;
	}

	@ObfuscatedName("ie.azq(Lyf;I)V")
	public static final void method4404(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11531.method18503() ? 1 : 0;
	}

	@ObfuscatedName("vg.azh(Lyf;B)V")
	public static final void method9463(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11524.method18547() ? 1 : 0;
	}

	@ObfuscatedName("sz.azl(Lyf;I)V")
	public static final void method8319(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11508.method18606() ? 1 : 0;
	}

	@ObfuscatedName("dy.azi(Lyf;B)V")
	public static final void method2102(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11514.method18666() ? 1 : 0;
	}

	@ObfuscatedName("bl.azm(Lyf;B)V")
	public static final void method1021(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("nh.azf(Lyf;I)V")
	public static final void method6120(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("acv.azr(Lyf;B)V")
	public static final void method15004(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("na.azp(Lyf;I)V")
	public static final void method5997(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ud.aza(Lyf;B)V")
	public static final void method9195(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("rt.azn(Lyf;B)V")
	public static final void method7720(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("jp.azk(Lyf;I)V")
	public static final void method5098(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("xv.azo(Lyf;I)V")
	public static final void method10098(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ax.baj(Lyf;I)V")
	public static final void method960(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("uz.bab(Lyf;I)V")
	public static final void method9048(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("no.bav(Lyf;S)V")
	public static final void method5983(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("dv.bax(Lyf;I)V")
	public static final void method1920(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("jr.baf(Lyf;S)V")
	public static final void method4940(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("jp.bag(Lyf;B)V")
	public static final void method5099(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11526.method14070(var1);
	}

	@ObfuscatedName("jd.bau(Lyf;I)V")
	public static final void method4640(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11568.method14070(var1);
	}

	@ObfuscatedName("pn.bam(Lyf;I)V")
	public static final void method6826(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11529.method14070(var1);
	}

	@ObfuscatedName("ia.bah(Lyf;I)V")
	public static final void method4539(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11530.method14070(var1);
	}

	@ObfuscatedName("vm.baw(Lyf;I)V")
	public static final void method9459(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11541.method14070(var1);
	}

	@ObfuscatedName("no.bas(Lyf;B)V")
	public static final void method5980(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11532.method14070(var1);
	}

	@ObfuscatedName("nr.bac(Lyf;B)V")
	public static final void method6066(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11520.method14070(var1);
	}

	@ObfuscatedName("xc.bar(Lyf;B)V")
	public static final void method10255(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Statics.field8198.method2266()) {
			arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11519.method14070(var1);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 3;
		}
	}

	@ObfuscatedName("pc.bap(Lyf;B)V")
	public static final void method7095(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11525.method14070(var1);
	}

	@ObfuscatedName("ib.bae(Lyf;I)V")
	public static final void method4500(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11538.method14070(var1);
	}

	@ObfuscatedName("d.bal(Lyf;B)V")
	public static final void method309(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11539.method14070(var1);
	}

	@ObfuscatedName("kb.bak(Lyf;I)V")
	public static final void method5252(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11564.method14070(var1);
	}

	@ObfuscatedName("pn.baz(Lyf;I)V")
	public static final void method6831(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11531.method14070(var1);
	}

	@ObfuscatedName("ze.baq(Lyf;I)V")
	public static final void method13991(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11524.method14070(var1);
	}

	@ObfuscatedName("xo.bai(Lyf;B)V")
	public static final void method10319(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11508.method14070(var1);
	}

	@ObfuscatedName("so.baa(Lyf;I)V")
	public static final void method8357(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Statics.field688.field11514.method14070(var1);
	}

	@ObfuscatedName("rq.bat(Lyf;I)V")
	public static final void method7605(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("hj.ban(Lyf;B)V")
	public static final void method4284(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ane.bao(Lyf;I)V")
	public static final void method18617(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("uw.bad(Lyf;I)V")
	public static final void method9188(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("nt.bbd(Lyf;B)V")
	public static final void method6041(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("in.bby(Lyf;B)V")
	public static final void method4424(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("cz.bbk(Lyf;I)V")
	public static final void method1591(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("qh.bbr(Lyf;I)V")
	public static final void method7350(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ab.bbg(Lyf;I)V")
	public static final void method992(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ahc.bbp(Lyf;S)V")
	public static final void method16607(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("aq.bbu(Lyf;S)V")
	public static final void method925(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("wc.bbv(Lyf;B)V")
	public static final void method9838(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("gt.bbt(Lyf;I)V")
	public static final void method3586(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ix.bbq(Lyf;I)V")
	public static final void method4479(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("fz.bbw(Lyf;I)V")
	public static final void method3039(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("ajj.bbj(Lyf;I)V")
	public static final void method17434(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6586;
		arg0.field8216[++arg0.field8226 - 1] = Statics.field6600;
	}

	@ObfuscatedName("s.bbo(Lyf;I)V")
	public static final void method484(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("io.bbb(Lyf;I)V")
	public static final void method4373(ClientScriptState arg0) {
		arg0.field8226 -= 4;
	}

	@ObfuscatedName("hp.bbh(Lyf;I)V")
	public static final void method4065(ClientScriptState arg0) {
	}

	@ObfuscatedName("xc.bbe(Lyf;I)V")
	public static final void method10256(ClientScriptState arg0) {
		class517 var1 = arg0.field8221.method16513();
		if (var1 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var1.method8281();
		}
	}

	@ObfuscatedName("fw.bbx(Lyf;I)V")
	public static final void method3091(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field8221;
		arg0.field8216[++arg0.field8226 - 1] = var1.field12081;
	}

	@ObfuscatedName("zl.bbi(Lyf;I)V")
	public static final void method14047(ClientScriptState arg0) {
		client.method14574(arg0.field8221, arg0.field8216[--arg0.field8226], true);
		arg0.field8216[++arg0.field8226 - 1] = (int) client.field10922[0];
		arg0.field8216[++arg0.field8226 - 1] = (int) client.field10922[1];
		arg0.field8216[++arg0.field8226 - 1] = (int) client.field10922[2];
	}

	@ObfuscatedName("gv.bbs(Lyf;B)V")
	public static final void method3604(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10986 == null ? -1 : client.field10986.field2158;
	}

	@ObfuscatedName("sb.bbl(Lyf;I)V")
	public static final void method8342(ClientScriptState arg0) {
		client.field10888 = arg0.field8216[--arg0.field8226] == 1;
		if (client.field10888) {
			class42.method16601();
		}
	}

	@ObfuscatedName("wu.bba(Lyf;I)V")
	public static final void method9635(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8221.method16501();
	}

	@ObfuscatedName("gv.bbz(Lyf;S)V")
	public static final void method3606(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		NpcEntity var2 = (NpcEntity) arg0.field8221;
		int var3 = var2.method19163(var1);
		int var4 = var2.method19164(var1);
		arg0.field8216[++arg0.field8226 - 1] = var3;
		arg0.field8216[++arg0.field8226 - 1] = var4;
	}

	@ObfuscatedName("fz.bbm(Lyf;B)V")
	public static final void method3041(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field8221;
		boolean var2 = false;
		NPCType var3 = var1.field12083;
		if (var3.field2735 != null) {
			var3 = var3.method4547(Statics.field7410, Statics.field7410);
		}
		if (var3 != null) {
			var2 = var3.field2734;
		}
		arg0.field8216[++arg0.field8226 - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("xn.bbc(Lyf;I)V")
	public static final void method10110(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field8221;
		NPCType var2 = var1.field12083;
		if (var2.field2735 != null) {
			var2 = var2.method4547(Statics.field7410, Statics.field7410);
		}
		arg0.field8216[++arg0.field8226 - 1] = var2 == null ? 0 : 1;
	}

	@ObfuscatedName("yu.bce(Lyf;I)V")
	public static final void method13851(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ((NpcEntity) arg0.field8221).field12083.field2732;
	}

	@ObfuscatedName("cj.bcd(Lyf;I)V")
	public static final void method1602(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10787 == arg0.field8221.method16578() ? 1 : 0;
	}

	@ObfuscatedName("uj.bcj(Lyf;I)V")
	public static final void method9129(ClientScriptState arg0) {
		client.method14574((GraphEntity) arg0.field8230, arg0.field8216[--arg0.field8226], true);
		arg0.field8216[++arg0.field8226 - 1] = (int) client.field10922[0];
		arg0.field8216[++arg0.field8226 - 1] = (int) client.field10922[1];
		arg0.field8216[++arg0.field8226 - 1] = (int) client.field10922[2];
	}

	@ObfuscatedName("akr.bcx(Lyf;B)V")
	public static final void method17751(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ((GraphEntity) arg0.field8230).method16501();
	}

	@ObfuscatedName("yn.bcb(Lalh;Lyf;I)V")
	public static final void method10489(GraphEntity arg0, ClientScriptState arg1) {
		boolean var2 = false;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		if (arg0.field11713 != null) {
			for (int var7 = 0; var7 < arg0.field11713.length; var7++) {
				class141 var8 = arg0.field11713[var7];
				if (var8.field1686) {
					int var9;
					int var10;
					if (var8.field1682 < var8.field1683) {
						var9 = var8.field1682 - var8.field1687;
						var10 = var8.field1687 + var8.field1683;
					} else {
						var9 = var8.field1683 - var8.field1687;
						var10 = var8.field1687 + var8.field1682;
					}
					int var11;
					int var12;
					if (var8.field1685 < var8.field1684) {
						var11 = var8.field1685 - var8.field1687;
						var12 = var8.field1687 + var8.field1684;
					} else {
						var11 = var8.field1684 - var8.field1687;
						var12 = var8.field1687 + var8.field1685;
					}
					if (!var2 || var9 < var3) {
						var3 = var9;
					}
					if (!var2 || var11 < var4) {
						var4 = var11;
					}
					if (!var2 || var10 > var5) {
						var5 = var10;
					}
					if (!var2 || var12 > var6) {
						var6 = var12;
					}
					var2 = true;
				}
			}
		}
		arg1.field8216[++arg1.field8226 - 1] = var2 ? 1 : 0;
		arg1.field8216[++arg1.field8226 - 1] = var3;
		arg1.field8216[++arg1.field8226 - 1] = var4;
		arg1.field8216[++arg1.field8226 - 1] = var5;
		arg1.field8216[++arg1.field8226 - 1] = var6;
	}

	@ObfuscatedName("vo.bcp(Lyf;B)V")
	public static final void method9309(ClientScriptState arg0) {
		method10489((GraphEntity) arg0.field8230, arg0);
	}

	@ObfuscatedName("ta.bcl(Lyf;B)V")
	public static final void method8426(ClientScriptState arg0) {
		method10489(arg0.field8232, arg0);
	}

	@ObfuscatedName("vy.bcm(Lyf;I)V")
	public static final void method9428(ClientScriptState arg0) {
		method10489(arg0.field8221, arg0);
	}

	@ObfuscatedName("ab.bcv(Lkr;I)Leh;")
	public static class152 method991(ClanSettings arg0) {
		return new class673(arg0);
	}

	@ObfuscatedName("wh.bcy(Lyf;I)V")
	public static final void method9859(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8211 -= 2;
		String var2 = (String) arg0.field8218[arg0.field8211];
		String var3 = (String) arg0.field8218[arg0.field8211 + 1];
		if (var2.length() <= 500 && var3.length() <= 500) {
			method639(var1, var2, var3);
		}
	}

	@ObfuscatedName("i.bcg(ILjava/lang/String;Ljava/lang/String;B)V")
	public static void method639(int arg0, String arg1, String arg2) {
		if (client.field10849 == null) {
			return;
		}
		ClientMessage var3 = Statics.method1604(ClientProt.BUG_REPORT, client.field10849.field794);
		var3.field11432.p2(Packet.method8398(arg1) + 1 + Packet.method8398(arg2));
		var3.field11432.pjstr2(arg1);
		var3.field11432.p1_alt2(arg0);
		var3.field11432.pjstr2(arg2);
		client.field10849.method934(var3);
	}

	@ObfuscatedName("eg.bcz(Lyf;I)V")
	public static void method2839(ClientScriptState arg0) {
		int var1 = arg0.field8216[arg0.field8226 - 3];
		int var2 = arg0.field8216[arg0.field8226 - 2];
		int var3 = arg0.field8216[arg0.field8226 - 1];
		arg0.field8226 -= 3;
		if (var1 > arg0.field8214[var2]) {
			throw new RuntimeException();
		} else if (var1 > arg0.field8214[var3]) {
			throw new RuntimeException();
		} else if (var2 == var3) {
			throw new RuntimeException();
		} else {
			class664.method15233(arg0.field8215[var2], arg0.field8215[var3], 0, var1 - 1);
		}
	}

	@ObfuscatedName("nz.bcu(Lyf;I)V")
	public static final void method6084(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("no.bcn(Lyf;I)V")
	public static final void method5985(ClientScriptState arg0) {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < Statics.field6888.length; var3++) {
			if (Statics.field6888[var3] != null && Statics.field6888[var3].method16837()) {
				var1 += Statics.field6888[var3].method16826();
				var2 += Statics.field6888[var3].method16828();
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var1 == 0 ? 0 : var2 * 100 / var1;
	}

	@ObfuscatedName("we.bca(Lyf;B)V")
	public static final void method9735(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("vg.bcr(Lyf;I)V")
	public static final void method9465(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("tg.bck(Lyf;I)V")
	public static final void method8689(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ii.bcw(Lyf;I)V")
	public static final void method4606(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("wa.bcf(Lyf;I)V")
	public static final void method9609(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("qc.bct(Lyf;S)V")
	public static final void method7246(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ej.bcq(Lyf;I)V")
	public static final void method2770(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 100;
	}

	@ObfuscatedName("wx.bco(Lyf;B)V")
	public static final void method9851(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("nh.bcs(Lyf;I)V")
	public static final void method6122(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("nt.bda(Lyf;B)V")
	public static final void method6042(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = GameShell.field6585;
		arg0.field8216[++arg0.field8226 - 1] = GameShell.field6585;
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("fd.bdk(Lyf;I)V")
	public static final void method3058(ClientScriptState arg0) {
	}

	@ObfuscatedName("q.bdl(Lyf;I)V")
	public static final void method553(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		class1004.method15173(var1);
	}

	@ObfuscatedName("acw.bde(Lyf;B)V")
	public static final void method15001(ClientScriptState arg0) {
		class1004.method15173(class1004.field11649);
	}

	@ObfuscatedName("acp.bdv(Lyf;B)V")
	public static final void method15030(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		class1004.method8498(var1);
	}

	@ObfuscatedName("cs.bds(Lyf;B)V")
	public static final void method1573(ClientScriptState arg0) {
		class1004.method8498(class1004.field11650);
	}

	@ObfuscatedName("cr.bdh(Lyf;B)V")
	public static final void method1429(ClientScriptState arg0) {
		boolean var1 = arg0.field8216[--arg0.field8226] == 1;
		class1004.method4337(var1);
	}

	@ObfuscatedName("ka.bdm(Lyf;I)V")
	public static final void method5214(ClientScriptState arg0) {
		Statics.method5370();
	}

	@ObfuscatedName("kn.bdi(Lyf;I)V")
	public static final void method5363(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = NativeLibraryConfig.field5074.startsWith("mac") ? 1 : 0;
	}

	@ObfuscatedName("ic.bdb(Lyf;I)V")
	public static final void method4633(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = NativeLibraryConfig.field5074.startsWith("win") ? 1 : 0;
	}

	@ObfuscatedName("sa.bdp(Lyf;I)V")
	public static final void method8340(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = NativeLibraryConfig.field5074.startsWith("linux") ? 1 : 0;
	}

	@ObfuscatedName("fi.bdx(Lyf;I)V")
	public static final void method3071(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ac.bdy(Lyf;I)V")
	public static final void method720(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("adj.bdc(Lyf;I)V")
	public static final void method15265(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Statics.field10581.field11613;
	}

	@ObfuscatedName("aow.bdn(Lyf;I)V")
	public static final void method18855(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ny.bdq(Lyf;I)V")
	public static final void method5952(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("sh.bdd(Lyf;B)V")
	public static final void method8201(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = Statics.field4490.method16521().method9433();
	}

	@ObfuscatedName("dj.bdu(Lyf;I)V")
	public static final void method2663(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		class690 var1 = (class690) class686.method1897(class690.method13901(), arg0.field8216[arg0.field8226]);
		CoordGrid var2 = new CoordGrid(arg0.field8216[arg0.field8226 + 1]);
		if (var2.field7428 == -1) {
			throw new RuntimeException("");
		} else if (class690.field8314 != var1 && class690.field8315 != var1 && class690.field8316 != var1) {
			throw new RuntimeException("");
		} else if (client.field10849 != null) {
			ClientMessage var3 = Statics.method1604(ClientProt.MOVE_SCRIPTED, client.field10849.field794);
			var3.field11432.p1_alt1(var1.getId());
			var3.field11432.p2_alt2(var2.field7427);
			var3.field11432.p2_alt1(var2.field7426);
			client.field10849.method934(var3);
		}
	}

	@ObfuscatedName("zk.bdf(Lyf;B)V")
	public static final void method13949(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = client.field11094.method3262(var1);
	}

	@ObfuscatedName("je.bdj(Lyf;I)V")
	public static final void method4844(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = client.field11094.method3263(var1).field1888;
	}

	@ObfuscatedName("sz.bdw(Lyf;I)V")
	public static final void method8322(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = client.field11094.method3263(var1).method3311();
	}

	@ObfuscatedName("vu.bdt(Lyf;B)V")
	public static final void method9400(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11094.method3263(var1).method3358(var2);
	}

	@ObfuscatedName("tg.bdg(Lyf;I)V")
	public static final void method8687(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11094.method3263(var1).method3285(var2);
	}

	@ObfuscatedName("ts.bdo(Lyf;B)V")
	public static final void method8659(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11094.method3263(var1).method3295(var2) ? 1 : 0;
	}

	@ObfuscatedName("uh.bev(Lyf;B)V")
	public static final void method9200(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11094.method3263(var1).method3290(var2);
	}

	@ObfuscatedName("vg.bel(Lyf;I)V")
	public static final void method9464(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = client.field11094.method3263(var1).method3291(var2);
	}

	@ObfuscatedName("kl.bec(Lyf;I)V")
	public static final void method5246(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Integer var4 = (Integer) client.field11094.method3263(var1).method3306(var2, var3);
		if (var4 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var4;
		}
	}

	@ObfuscatedName("yz.bej(Lyf;I)V")
	public static final void method10590(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = client.field11094.method3263(var1).method3306(var2, var3) == null ? 0 : 1;
	}

	@ObfuscatedName("pw.bei(Lyf;I)V")
	public static final void method6792(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		if (!class243.method18307(var1.charAt(0))) {
			throw new RuntimeException();
		} else if (var1.isEmpty() || var1.length() > 10) {
			throw new RuntimeException();
		} else if (!Statics.field3420.method4342(var1, var2, var3)) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("kt.beu(Lyf;I)V")
	public static final void method5393(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Statics.field3420.method4344(var1);
	}

	@ObfuscatedName("ho.bex(Lyf;B)V")
	public static final void method4272(ClientScriptState arg0) {
		Statics.field3420.method4345();
	}

	@ObfuscatedName("fu.ben(Lyf;I)V")
	public static final void method3022(ClientScriptState arg0) {
		if (Statics.field3420.method4353() > 0) {
			String var1 = (String) arg0.field8218[--arg0.field8211];
			String var2 = Statics.field3420.method4339(var1);
			arg0.field8218[++arg0.field8211 - 1] = var2;
		}
	}

	@ObfuscatedName("qn.bes(Lyf;B)V")
	public static final void method7367(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Statics.field3420.method4341(var1 != 0);
	}

	@ObfuscatedName("vj.beg(Lyf;ZI)V")
	public static final void method9572(ClientScriptState arg0, boolean arg1) {
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		class792 var4 = client.method146(var2);
		if (var4 == null) {
			throw new RuntimeException();
		}
		Statics.field754 = var4.method15187(var3);
		if (Statics.field754 != null) {
			client.field10767 = class791.method746(var2);
			Statics.field8853 = Statics.field754.iterator();
			if (arg1) {
				arg0.field8216[++arg0.field8226 - 1] = Statics.field754.size();
			}
			return;
		}
		client.field10767 = -1;
		Statics.field8853 = null;
		if (arg1) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("hf.bea(Lyf;B)V")
	public static final void method4018(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		class792 var2 = client.method4574(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Statics.field754 = var2.method15187(0);
		if (Statics.field754 != null) {
			client.field10767 = var1;
			Statics.field8853 = Statics.field754.iterator();
			arg0.field8216[++arg0.field8226 - 1] = Statics.field754.size();
		}
	}

	@ObfuscatedName("aht.bew(Lyf;I)V")
	public static final void method16756(ClientScriptState arg0) {
		if (Statics.field8853 != null && Statics.field8853.hasNext()) {
			arg0.field8216[++arg0.field8226 - 1] = (Integer) Statics.field8853.next();
		} else {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		}
	}

	@ObfuscatedName("pk.beq(Lyf;B)V")
	public static final void method6795(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = class791.method746(var2);
		int var5 = class791.method15018(var2);
		DBRowType var6 = (DBRowType) Statics.field9123.get(var1);
		DBTableType var7 = (DBTableType) Statics.field1840.get(var4);
		ScriptVarType[] var8 = var7.field9185[var5];
		Object[] var9 = var6.method14711(var5);
		if (var9 == null && var7.field9186 != null) {
			var9 = var7.field9186[var5];
		}
		if (var9 == null) {
			for (int var10 = 0; var10 < var8.length; var10++) {
				ScriptVarType var11 = var8[var10];
				if (ScriptVarType.STRING == var11) {
					arg0.field8218[++arg0.field8211 - 1] = "";
				} else if (ScriptVarType.INT == var11 || ScriptVarType.BOOLEAN == var11) {
					arg0.field8216[++arg0.field8226 - 1] = 0;
				} else {
					arg0.field8216[++arg0.field8226 - 1] = -1;
				}
			}
			return;
		}
		int var12 = var9.length / var8.length;
		if (var3 < 0 || var3 >= var12) {
			throw new RuntimeException();
		}
		for (int var13 = 0; var13 < var8.length; var13++) {
			int var14 = var8.length * var3 + var13;
			if (var8[var13] == ScriptVarType.STRING) {
				arg0.field8218[++arg0.field8211 - 1] = var9[var14];
			} else {
				arg0.field8216[++arg0.field8226 - 1] = (Integer) var9[var14];
			}
		}
	}

	@ObfuscatedName("wn.bey(Lyf;I)V")
	public static final void method9604(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = -1;
		if (Statics.field754 != null && var1 >= 0 && var1 < Statics.field754.size()) {
			var2 = (Integer) Statics.field754.get(var1);
		}
		arg0.field8216[++arg0.field8226 - 1] = var2;
	}

	@ObfuscatedName("ei.beb(Lyf;B)V")
	public static final void method2751(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		DBRowType var2 = (DBRowType) Statics.field9123.get(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8735;
	}

	@ObfuscatedName("agf.bez(Lyf;B)V")
	public static final void method16447(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		Statics.method7623(arg0.field8216[arg0.field8226 + 1]);
	}

	@ObfuscatedName("qu.bed(Lyf;B)V")
	public static final void method7328(ClientScriptState arg0) {
		arg0.field8226 -= 4;
	}

	@ObfuscatedName("yi.bet(Lyf;B)V")
	public static final void method10757(ClientScriptState arg0) {
	}

	@ObfuscatedName("vl.bee(Lyf;I)V")
	public static final void method9286(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("x.ber(Lyf;I)V")
	public static final void method573(ClientScriptState arg0) {
	}

	@ObfuscatedName("yi.bef(Lyf;I)V")
	public static final void method10758(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("xg.bek(Lyf;I)V")
	public static final void method10143(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("gh.bem(Lyf;I)V")
	public static final void method3591(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8218[++arg0.field8211 - 1] = "";
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("mc.beh(Lyf;B)V")
	public static final void method5896(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("nf.bfi(Lyf;I)V")
	public static final void method6079(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("xq.bfg(Lyf;I)V")
	public static final void method10336(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("rl.bfl(Lyf;B)V")
	public static final void method7884(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ji.bfv(Lyf;I)V")
	public static final void method4982(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("mt.bfq(Lyf;I)V")
	public static final void method5893(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("tu.bfo(Lyf;I)V")
	public static final void method8396(ClientScriptState arg0) {
		arg0.field8226 -= 3;
	}

	@ObfuscatedName("yz.bfk(Lyf;I)V")
	public static final void method10591(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("tp.bff(Lyf;I)V")
	public static final void method8665(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ace.bfr(Lyf;B)V")
	public static final void method15087(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		FontMetrics var2 = Statics.field7538.method6163(client.field10833, var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8566;
		arg0.field8216[++arg0.field8226 - 1] = var2.field8562;
		arg0.field8216[++arg0.field8226 - 1] = var2.field8569;
		arg0.field8216[++arg0.field8226 - 1] = var2.field8568;
		arg0.field8216[++arg0.field8226 - 1] = var2.field8567;
	}

	@ObfuscatedName("ny.bfp(Lyf;I)V")
	public static final void method5949(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("gp.bfu(Lyf;B)V")
	public static final void method3485(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("kr.bfy(Lyf;I)V")
	public static final void method5329(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("jb.bfn(Lyf;B)V")
	public static final void method4884(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 100;
	}

	@ObfuscatedName("sg.bfx(Lyf;I)V")
	public static final void method8382(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("kz.bfm(Lyf;I)V")
	public static final void method5130(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = client.field10853.getId();
	}

	@ObfuscatedName("hp.bfz(Lyf;I)V")
	public static final void method4060(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("rm.bfs(Lyf;I)V")
	public static final void method7626(ClientScriptState arg0) {
	}

	@ObfuscatedName("dh.bfd(Lyf;I)V")
	public static final void method2581(ClientScriptState arg0) {
	}

	@ObfuscatedName("nr.bfa(Lyf;I)V")
	public static final void method6067(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("we.bfe(Lyf;I)V")
	public static final void method9733(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("yb.bfc(Lyf;I)V")
	public static final void method10566(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		arg0.field8226 -= 3;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("am.bfw(Lyf;I)V")
	public static final void method831(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("in.bft(Lyf;S)V")
	public static final void method4422(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("alw.bfh(Lyf;I)V")
	public static final void method18150(ClientScriptState arg0) {
		arg0.field8211--;
	}

	@ObfuscatedName("apm.bfj(Lyf;B)V")
	public static final void method18922(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("qh.bfb(Lyf;I)V")
	public static final void method7352(ClientScriptState arg0) {
	}

	@ObfuscatedName("uh.bgy(Lyf;I)V")
	public static final void method9197(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}
}
