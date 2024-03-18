package rs2.client.clientscript;

import com.jagex.audio.Sound;
import com.jagex.audio.SoundShape;
import com.jagex.audio.SoundType;
import com.jagex.audio.SubBussType;
import com.jagex.core.constants.Language;
import com.jagex.core.datastruct.*;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.*;
import com.jagex.game.camera.*;
import com.jagex.game.camera.effects.Shake;
import com.jagex.game.camera.effects.ZTilt;
import com.jagex.game.camera.position.PositionEntity;
import com.jagex.game.client.*;
import com.jagex.game.clientoptions.Preferences;
import com.jagex.game.compression.huffman.WordPack;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.db.DBTableIndex;
import com.jagex.game.config.db.DBUtils;
import com.jagex.game.config.db.dbrowtype.DBRowType;
import com.jagex.game.config.db.dbtabletype.DBTableType;
import com.jagex.game.config.enumtype.EnumType;
import com.jagex.game.config.idktype.IDKType;
import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.iftype.Interface;
import com.jagex.game.config.iftype.componentproperties.ServerKeyProperties;
import com.jagex.game.config.invtype.InvType;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.meltype.MapElementType;
import com.jagex.game.config.npctype.NPCTypeCustomisation;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.config.quickchatcattype.QuickChatCatType;
import com.jagex.game.config.quickchatphrasetype.QuickChatPhrase;
import com.jagex.game.config.quickchatphrasetype.QuickChatPhraseType;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.config.structtype.StructType;
import com.jagex.game.config.vartype.VarClanSettingsDomain;
import com.jagex.game.config.vartype.VarDomain;
import com.jagex.game.config.vartype.VarPlayerDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.BaseVarType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.config.vartype.player.VarPlayerType;
import com.jagex.game.fullscreen.Fullscreen;
import com.jagex.game.group.PlayerGroupBanned;
import com.jagex.game.group.PlayerGroupMember;
import com.jagex.game.load.LoadingScreenAlignmentX;
import com.jagex.game.load.LoadingScreenAlignmentY;
import com.jagex.game.load.MessageBox;
import com.jagex.game.network.ServerConnection;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.game.script.*;
import com.jagex.game.script.activepointers.ActiveComponent;
import com.jagex.game.shared.console.DeveloperConsole;
import com.jagex.game.shared.framework.gwc.GWC;
import com.jagex.game.shared.framework.gwc.GWCWorld;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.WorldMap;
import com.jagex.game.world.WorldMapAreaMetadata;
import com.jagex.game.world.WorldMapElement;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.*;
import com.jagex.graphics.camera.CameraException;
import com.jagex.graphics.camera.CameraHelpers;
import com.jagex.graphics.camera.CameraLinearMovementMode;
import com.jagex.graphics.camera.ShakeMode;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.math.*;
import com.jagex.twitchtv.TwitchEvent;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.clientscript.emoji.EmojiList;
import rs2.client.logic.DelayedStateChange;
import rs2.client.logic.chat.ChatHistory;
import rs2.client.logic.chat.ChatLine;
import rs2.client.logic.clans.ClanSettings;
import rs2.client.logic.friendchat.Friend;
import rs2.client.logic.friendchat.Ignore;
import rs2.client.login.*;
import rs2.client.scene.entities.NpcEntity;
import rs2.client.scene.entities.PathingEntity;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.*;
import java.util.List;

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
			Component[] var2 = Component.field11725[arg0].field2151;
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
		ClientScript var4 = ClientScriptHelpers.method5402(var3);
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
	public static void method9018(ClientTriggerType arg0, int arg1, int arg2, ObjReference arg3, ObjStackEntity arg4) {
		ClientScriptState var5 = method1516();
		var5.field8232 = arg4;
		method4374(arg0, arg1, arg2, var5);
		var5.field8232 = null;
	}

	@ObfuscatedName("am.p(Luh;III)V")
	public static void method830(ClientTriggerType arg0, int arg1, int arg2) {
		ClientScriptState var3 = method1516();
		method4374(arg0, arg1, arg2, var3);
	}

	@ObfuscatedName("iq.d(Luh;IILyf;I)V")
	public static void method4374(ClientTriggerType arg0, int arg1, int arg2, ClientScriptState arg3) {
		ClientScript var4 = ClientScriptHelpers.method9425(arg0, arg1, arg2);
		if (var4 == null) {
			method9399();
			return;
		}
		arg3.field8213 = new int[var4.field12370];
		arg3.field8212 = new Object[var4.field12368];
		if (ClientTriggerType.field7263 == var4.field12373 || ClientTriggerType.field7255 == var4.field12373 || ClientTriggerType.field7254 == var4.field12373) {
			arg3.field8213[0] = arg1;
			arg3.field8213[1] = Client.field9182.method9086();
			arg3.field8213[2] = Client.field9182.method9092();
		} else if (ClientTriggerType.field7258 == var4.field12373 || ClientTriggerType.field7249 == var4.field12373 || ClientTriggerType.field7257 == var4.field12373 || ClientTriggerType.field7253 == var4.field12373 || ClientTriggerType.field7252 == var4.field12373) {
			arg3.field8213[0] = arg1;
		} else if (ClientTriggerType.field7251 == var4.field12373) {
			arg3.field8213[0] = arg3.field8231;
		}
		method15248(var4, 500000, arg3);
	}

	@ObfuscatedName("jf.c(ILjava/lang/String;II)V")
	public static void method4654(int arg0, String arg1, int arg2) {
		ClientScript var3 = ClientScriptHelpers.method9425(ClientTriggerType.field7269, arg0, -1);
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
		ClientScript var2 = ClientScriptHelpers.method9425(ClientTriggerType.field7267, arg0, -1);
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
		arg2.field8234.put(VarDomainType.PLAYER, Client.field7410.field632);
		arg2.field8234.put(VarDomainType.CLIENT, Client.field7228);
		arg2.field8234.put(VarDomainType.CLAN, Client.field7698);
		if (arg2.field8227 != null) {
			arg2.field8234.put(VarDomainType.CLAN_SETTING, method991(arg2.field8227));
		}
		if (arg2.field8221 instanceof NpcEntity) {
			arg2.field8234.put(VarDomainType.NPC, arg2.field8221.field10415);
		}
		if (arg2.field8221 instanceof PlayerEntity) {
			arg2.field8233.put(VarDomainType.PLAYER, arg2.field8221.field10415);
		}
		if (Client.field6721 != null) {
			arg2.field8234.put(VarDomainType.PLAYER_GROUP, Client.field6721.method3394());
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
		JagException.report(var4.toString(), arg2);
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
		Client.method4616(var6);
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
			ArrayUtil.method14008(var5, var6 + 1, var5, var6, var5.length - var6 - 1);
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
			ArrayUtil.method14008(var2.field2351, 0, var2.field2349, 0, arg1.field2183);
			ArrayUtil.method14008(var2.field2351, arg1.field2183 + 1, var2.field2349, arg1.field2183, var2.field2351.length - arg1.field2183 - 1);
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
		ArrayUtil.method14008(var4, var3 + 1, var4, var3, var4.length - var3 - 1);
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
			ArrayUtil.method14008(var5, 0, var5, 1, var6);
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
			ArrayUtil.method14008(var2.field2351, 0, var2.field2349, 1, arg1.field2183);
			ArrayUtil.method14008(var2.field2351, arg1.field2183 + 1, var2.field2349, arg1.field2183 + 1, var2.field2351.length - arg1.field2183 - 1);
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
		ArrayUtil.method14008(var4, 0, var4, 1, var3);
		var4[0] = arg1;
	}

	@ObfuscatedName("pf.x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V")
	public static void method7005(String arg0, String arg1, String arg2, boolean arg3, boolean arg4) {
		ServerConnection var5 = Client.method640();
		if (var5.getStream() == null) {
			return;
		}
		ClientMessage var6 = ClientMessage.method1604(ClientProt.URL_REQUEST, var5.field794);
		var6.buf.p2(Packet.pjstrlen(arg0) + Packet.pjstrlen(arg1) + Packet.pjstrlen(arg2) + 1);
		var6.buf.pjstr(arg0);
		var6.buf.pjstr(arg1);
		var6.buf.pjstr(arg2);
		int var7 = 0;
		if (arg3) {
			var7 |= 0x1;
		}
		if (arg4) {
			var7 |= 0x2;
		}
		var6.buf.p1(var7);
		var5.queue(var6);
	}

	@ObfuscatedName("iy.b(Larm;Lyf;I)V")
	public static final void method4597(MinimenuEntry arg0, ClientScriptState arg1) {
		arg1.field8216[++arg1.field8226 - 1] = MiniMenu.method18429(arg0);
		arg1.field8218[++arg1.field8211 - 1] = MiniMenu.method4642(arg0);
		arg1.field8218[++arg1.field8211 - 1] = MiniMenu.method6018(arg0);
		arg1.field8218[++arg1.field8211 - 1] = MiniMenu.method313(arg0);
	}

	@ObfuscatedName("yx.h(Lss;Lyf;I)V")
	public static final void method10608(ClientScriptCommand arg0, ClientScriptState arg1) throws CameraException, VarBitOverflowException {
		switch(arg0.field5953) {
			case 0:
				telemetry_get_group_count(arg1);
				return;
			case 1:
				targetmode_active(arg1);
				return;
			case 2:
				if_setoptkey(arg1);
				return;
			case 3:
				detailget_buildarea(arg1);
				return;
			case 4:
				chatphrase_gettext(arg1);
				return;
			case 5:
				detail_anisotropicfiltering(arg1);
				return;
			case 6:
				sound_synth(arg1);
				return;
			case 7:
				cam2_getpositionentity_lookatangle(arg1);
				return;
			case 8:
				abort_dialog(arg1);
				return;
			case 9:
				worldmap_getsourcecoord(arg1);
				return;
			case 10:
				worldmap_getdisplayposition(arg1);
				return;
			case 11:
				shop_isproductrecommended(arg1);
				return;
			case 12:
				if_sendto(true, arg1);
				return;
			case 13:
				cc_setheld(arg1);
				return;
			case 14:
				clan_getchatminkick(arg1);
				return;
			case 15:
				cc_getx(arg1);
				return;
			case 16:
				cc_setonplayergroupvarptransmit(arg1);
				return;
			case 17:
				scale(arg1);
				return;
			case 18:
				if_setonhorizontalpinch(arg1);
				return;
			case 19:
				cc_find(arg1);
				return;
			case 20:
				detailget_maxforegroundfps(arg1);
				return;
			case 21:
				cc_setongamepadtrigger(arg1);
				return;
			case 22:
				get_selfyangle(arg1);
				return;
			case 23:
				cc_setontargetenter(arg1);
				return;
			case 24:
				activeclansettings_getaffinedcount(arg1);
				return;
			case 25:
				autosetup_dosetupstatus(arg1);
				return;
			case 26:
				cam2_setlookatmaxspeed_axis(arg1);
				return;
			case 27:
				char_isnumeric(arg1);
				return;
			case 28:
				oc_minimenu_colour_overridden(arg1);
				return;
			case 29:
				interface_getpickingradius(arg1);
				return;
			case 30:
				ignore_is_temp(arg1);
				return;
			case 31:
				cc_setopbase(arg1);
				return;
			case 32:
				map_members(arg1);
				return;
			case 33:
				preload_percent(arg1);
				return;
			case 34:
				if_setswipeflags(arg1);
				return;
			case 35:
				cam_dec_x(arg1);
				return;
			case 36:
				map_build_complete(arg1);
				return;
			case 37:
				chat_setmode(arg1);
				return;
			case 38:
				minimenu_close(arg1);
				return;
			case 39:
				struct_param(arg1);
				return;
			case 40:
				cc_setopchar(arg1);
				return;
			case 41:
				TwitchCommands.ttv_setdebugoutput(arg1);
				return;
			case 42:
				detailget_maxscreensize(arg1);
				return;
			case 43:
				if_getgraphic(arg1);
				return;
			case 44:
				if_getmodelangle_x(arg1);
				return;
			case 45:
				random_sound_pitch(arg1);
				return;
			case 46:
				getclipboard(arg1);
				return;
			case 47:
				cam_smoothreset(arg1);
				return;
			case 48:
				if_setlinkfriend(arg1);
				return;
			case 49:
				gosub_with_params(arg1);
				return;
			case 50:
				define_array(arg1);
				return;
			case 51:
				if_settextantimacro(arg1);
				return;
			case 52:
				map_loadingscreen_isopen(arg1);
				return;
			case 53:
				cam2_updateeffect_ztilt(arg1);
				return;
			case 54:
				if_setontimer(arg1);
				return;
			case 55:
				activeclanchannel_getusercount(arg1);
				return;
			case 56:
				cam2_setlookatorientation_xrotation(arg1);
				return;
			case 57:
				QuestCommands.quest_varbitreq_count(arg1);
				return;
			case 58:
				tostring(arg1);
				return;
			case 59:
				worldmap_perpetualflash(arg1);
				return;
			case 60:
				char_isvalid(arg1);
				return;
			case 61:
				os_iswindows(arg1);
				return;
			case 62:
				ignore_del(arg1);
				return;
			case 63:
				map_preload(arg1);
				return;
			case 64:
				baseidkit(arg1);
				return;
			case 65:
				cc_getgraphicdimensions(arg1);
				return;
			case 66:
				if_find(arg1);
				return;
			case 67:
				setbit_range_toint(arg1);
				return;
			case 68:
				join_string(arg1);
				return;
			case 69:
				push_array(arg1, true, true);
				return;
			case 70:
				if_getmodelangle_z(arg1);
				return;
			case 71:
				detailget_lightingquality(arg1);
				return;
			case 72:
				if_getfontgraphic(arg1);
				return;
			case 73:
				cam2_setpositionpointcollision(arg1);
				return;
			case 74:
				worldmap_getzoom(arg1);
				return;
			case 75:
				cam2_removeeffect(arg1);
				return;
			case 76:
				if_setonhorizontalswipe(arg1);
				return;
			case 77:
				detailcanmod_vsync(arg1);
				return;
			case 78:
				detailcanmod_skydetail(arg1);
				return;
			case 79:
			case 103:
			case 247:
			case 250:
			case 393:
			default:
				throw new RuntimeException();
			case 80:
				detail_antialiasing(arg1);
				return;
			case 81:
				detailget_bloom(arg1);
				return;
			case 82:
				cc_setonstattransmit(arg1);
				return;
			case 83:
				if_setoutline(arg1);
				return;
			case 84:
				worldmap_getdisplaycoord(arg1);
				return;
			case 85:
				if_setplayermodel(arg1);
				return;
			case 86:
				get_currentcursor(arg1);
				return;
			case 87:
				nc_param(arg1);
				return;
			case 88:
				cc_setlinedirection(arg1);
				return;
			case 89:
				oc_tradeable(arg1);
				return;
			case 90:
				detailget_antialiasing(arg1);
				return;
			case 91:
				if_resetmodellighting(arg1);
				return;
			case 92:
				TwitchCommands.ttv_webcam_supported(arg1);
				return;
			case 93:
				oc_name(arg1);
				return;
			case 94:
				player_group_member_is_owner(arg1);
				return;
			case 95:
				lobby_enterlobby(arg1);
				return;
			case 96:
				if_getx(arg1);
				return;
			case 97:
				notifications_sendgroupedlocal(arg1);
				return;
			case 98:
				unknown_command_98(arg1);
				return;
			case 99:
				detailget_removeroofs_option(arg1);
				return;
			case 100:
				urlencode(arg1);
				return;
			case 101:
				if_setondragcomplete(arg1);
				return;
			case 102:
				detailget_idleanims_many(arg1);
				return;
			case 104:
				date_runeday_todate(arg1);
				return;
			case 105:
				preload_download_downloadedsize(arg1);
				return;
			case 106:
				cam2_getcontrolmode(arg1);
				return;
			case 107:
				if_setvflip(arg1);
				return;
			case 108:
				if_getop(arg1);
				return;
			case 109:
				cc_getmodelangle_x(arg1);
				return;
			case 110:
				player_group_get_owner_slot(arg1);
				return;
			case 111:
				userdetail_lobby_graceexpiry(arg1);
				return;
			case 112:
				date_minutes_fromruneday(arg1);
				return;
			case 113:
				stockmarket_getoffercount(arg1);
				return;
			case 114:
				preload_download_complete(arg1);
				return;
			case 115:
				stat_visible_xp_actual(arg1);
				return;
			case 116:
				activechatphrase_prepare(arg1);
				return;
			case 117:
				QuestCommands.quest_varbitreq_met(arg1);
				return;
			case 118:
				cc_setonscrollwheel(arg1);
				return;
			case 119:
				fullscreen_enter(arg1);
				return;
			case 120:
				cc_settext(arg1);
				return;
			case 121:
				oc_wearpos2(arg1);
				return;
			case 122:
				paraline(arg1);
				return;
			case 123:
				detail_vsync(arg1);
				return;
			case 124:
				if_setsize(arg1);
				return;
			case 125:
				sqrt(arg1);
				return;
			case 126:
				clan_getchatrank(arg1);
				return;
			case 127:
				branch_if_false(arg1);
				return;
			case 128:
				if_getnextsubid(arg1);
				return;
			case 129:
				movescripted(arg1);
				return;
			case 130:
				cam2_getpositionpoint_point(arg1);
				return;
			case 131:
				if_setmodelzoom(arg1);
				return;
			case 132:
				cc_setmouseovercursor(arg1);
				return;
			case 133:
				inv_totalcat(arg1);
				return;
			case 134:
				clearbit_range(arg1);
				return;
			case 135:
				activeclansettings_getaffinedextrainfo(arg1);
				return;
			case 136:
				friend_count(arg1);
				return;
			case 137:
				detailcanmod_interfacescale(arg1);
				return;
			case 138:
				cam2_isenabled(arg1);
				return;
			case 139:
				get_npc_name(arg1);
				return;
			case 140:
				worldmap_3dview_enable(arg1);
				return;
			case 141:
				runjavascript(arg1);
				return;
			case 142:
				activechatphrase_sendprivate(arg1);
				return;
			case 143:
				method4982(arg1);
				return;
			case 144:
				method2775(arg1);
				return;
			case 145:
				date_minutes(arg1);
				return;
			case 146:
				detail_antialiasingmode(arg1);
				return;
			case 147:
				emoji_removeall(arg1);
				return;
			case 148:
				activeclansettings_find_listened(arg1);
				return;
			case 149:
				cc_setondialogabort(arg1);
				return;
			case 150:
				method3591(arg1);
				return;
			case 151:
				ignore_add(arg1);
				return;
			case 152:
				stockmarket_getoffercompletedcount(arg1);
				return;
			case 153:
				cc_setonmisctransmit(arg1);
				return;
			case 154:
				stringwidth(arg1);
				return;
			case 155:
				cc_setonclick(arg1);
				return;
			case 156:
				create_reply(arg1);
				return;
			case 157:
				if_setmodelorigin(arg1);
				return;
			case 158:
				cc_setoptkeyrate(arg1);
				return;
			case 159:
				sound_vorbis_volume_rate_group(arg1);
				return;
			case 160:
				cam2_settraildistance(arg1);
				return;
			case 161:
				cam_getangle_ya(arg1);
				return;
			case 162:
				if_setonop(arg1);
				return;
			case 163:
				cc_param(arg1);
				return;
			case 164:
				login_queue_position(arg1);
				return;
			case 165:
				add(arg1);
				return;
			case 166:
				detailcanmod_antialiasingmode(arg1);
				return;
			case 167:
				oc_shard(arg1);
				return;
			case 168:
				coord_finetogrid(arg1);
				return;
			case 169:
				worldmap_isloaded(arg1);
				return;
			case 170:
				if_setonstocktransmit(arg1);
				return;
			case 171:
				clan_kickuser(arg1);
				return;
			case 172:
				activeclansettings_getaffineddisplayname(arg1);
				return;
			case 173:
				worldlist_start(arg1);
				return;
			case 174:
				if_setswipedeadzone(arg1);
				return;
			case 175:
				get_obj_overlay_height(arg1);
				return;
			case 176:
				cc_setclickmask(arg1);
				return;
			case 177:
				cc_setoptkeyignoreheld(arg1);
				return;
			case 178:
				mec_textsize(arg1);
				return;
			case 179:
				if_setonsubchange(arg1);
				return;
			case 180:
				method18922(arg1);
				return;
			case 181:
				emoji_remove(arg1);
				return;
			case 182:
				oc_findnext(arg1);
				return;
			case 183:
				detail_particles(arg1);
				return;
			case 184:
				email_validation_change_address(arg1);
				return;
			case 185:
				if_settiling(arg1);
				return;
			case 186:
				push_array(arg1, false, false);
				return;
			case 187:
				telemetry_get_column_count(arg1);
				return;
			case 188:
				cc_addpinchflags(arg1);
				return;
			case 189:
				if_setobject(arg1);
				return;
			case 190:
				friend_platform(arg1);
				return;
			case 191:
				enum_getreverseindex(arg1);
				return;
			case 192:
				stockmarket_getoffercompletedgold(arg1);
				return;
			case 193:
				pop_string_local(arg1);
				return;
			case 194:
				worldmap_3dview_gettextfont(arg1);
				return;
			case 195:
				detail_dof(arg1);
				return;
			case 196:
				if_setonclanchanneltransmit(arg1);
				return;
			case 197:
				substring(arg1);
				return;
			case 198:
				if_setnpcmodel(arg1);
				return;
			case 199:
				sound_song_volume(arg1);
				return;
			case 200:
				autosetup_getlevel(arg1);
				return;
			case 201:
				email_validation_add_new_address(arg1);
				return;
			case 202:
				if_setoncameraupdatetransmit(arg1);
				return;
			case 203:
				frombilling(arg1);
				return;
			case 204:
				push_constant_int(arg1);
				return;
			case 205:
				detailcanmod_maxforegroundfps(arg1);
				return;
			case 206:
				chatphrase_findnext(arg1);
				return;
			case 207:
				create_connect_reply(arg1);
				return;
			case 208:
				profile_cpu(arg1);
				return;
			case 209:
				shop_isproductavailable(arg1);
				return;
			case 210:
				detailget_safemode(arg1);
				return;
			case 211:
				worldmap_jumptosourcecoord(arg1);
				return;
			case 212:
				spline_new(arg1);
				return;
			case 213:
				QuestCommands.quest_param(arg1);
				return;
			case 214:
				cam_getangle_xa(arg1);
				return;
			case 215:
				cam2_setfieldofviewscreen(arg1);
				return;
			case 216:
				if_getinvcount(arg1);
				return;
			case 217:
				login_last_transfer_reply(arg1);
				return;
			case 218:
				date_isleapyear(arg1);
				return;
			case 219:
				activeclansettings_getaffinedslot(arg1);
				return;
			case 220:
				battery_ischarging(arg1);
				return;
			case 221:
				oc_minimenu_colour(arg1);
				return;
			case 222:
				pop_string_discard(arg1);
				return;
			case 223:
				friend_del(arg1);
				return;
			case 224:
				if_dragpickup(arg1);
				return;
			case 225:
				cc_setonfriendtransmit(arg1);
				return;
			case 226:
				player_group_find(arg1);
				return;
			case 227:
				login_ban_duration(arg1);
				return;
			case 228:
				player_group_member_get_rank(arg1);
				return;
			case 229:
				if_setopkey(arg1);
				return;
			case 230:
				if_setmodellighting(arg1);
				return;
			case 231:
				sso_displayname(arg1);
				return;
			case 232:
				viewport_getzoom(arg1);
				return;
			case 233:
				lobby_entergame(arg1);
				return;
			case 234:
				viewport_setfov(arg1);
				return;
			case 235:
				addpercent(arg1);
				return;
			case 236:
				if_close(arg1);
				return;
			case 237:
				cc_setoptchar(arg1);
				return;
			case 238:
				resume_hsldialog(arg1);
				return;
			case 239:
				pop_varbit(arg1);
				return;
			case 240:
				TwitchCommands.ttv_stream_start(arg1);
				return;
			case 241:
				cam2_setpositionspringproperties(arg1);
				return;
			case 242:
				cc_setonvarclantransmit(arg1);
				return;
			case 243:
				TwitchCommands.ttv_webcam_getdevice_byuniquename(arg1);
				return;
			case 244:
				if_debug_button3(arg1);
				return;
			case 245:
				detailget_flickering_on(arg1);
				return;
			case 246:
				detail_loadingscreentype(arg1);
				return;
			case 248:
				userdetail_lobby_lastloginaddress(arg1);
				return;
			case 249:
				cc_settextshadow(arg1);
				return;
			case 251:
				string_indexof_char(arg1);
				return;
			case 252:
				inv_getvar(arg1);
				return;
			case 253:
				string_length(arg1);
				return;
			case 254:
				stat_base_actual(arg1);
				return;
			case 255:
				mes(arg1);
				return;
			case 256:
				cc_settrans(arg1);
				return;
			case 257:
				if_debug_getopenifid(arg1);
				return;
			case 258:
				if_closesubclient(arg1);
				return;
			case 259:
				QuestCommands.quest_statreq_count(arg1);
				return;
			case 260:
				map_world(arg1);
				return;
			case 261:
				detailcanset_shadows(arg1);
				return;
			case 262:
				if_setop(arg1);
				return;
			case 263:
				if_setdragdeadzone(arg1);
				return;
			case 264:
				chat_sendabusereport(arg1);
				return;
			case 265:
				cam2_setlookatorientation_zmovement(arg1);
				return;
			case 266:
				chatcat_getphrasecount(arg1);
				return;
			case 267:
				detailcanset_bloom(arg1);
				return;
			case 268:
				telemetry_get_row_count(arg1);
				return;
			case 269:
				detailcanmod_anisotropicfiltering(arg1);
				return;
			case 270:
				cc_setlinkfriend(arg1);
				return;
			case 271:
				if_setobject_alwaysnum(arg1);
				return;
			case 272:
				worldlist_specific(arg1);
				return;
			case 273:
				detailget_shadows(arg1);
				return;
			case 274:
				clearbit(arg1);
				return;
			case 275:
				cc_setonchattransmit(arg1);
				return;
			case 276:
				if_setonmouserepeat(arg1);
				return;
			case 277:
				clan_getchatuserworldname(arg1);
				return;
			case 278:
				cc_sendto(false, arg1);
				return;
			case 279:
				worldmap_disabletextsize(arg1);
				return;
			case 280:
				worldmap_setflashloops_default(arg1);
				return;
			case 281:
				worldmap_getcategorypriority(arg1);
				return;
			case 282:
				userdetail_lobby_jcoins_balance(arg1);
				return;
			case 283:
				create_email_validate_reply(arg1);
				return;
			case 284:
				if_hassubmodal(arg1);
				return;
			case 285:
				cc_setmaxlines(arg1);
				return;
			case 286:
				TwitchCommands.ttv_webcam_getcap_byindex(arg1);
				return;
			case 287:
				detailget_loadingscreentype(arg1);
				return;
			case 288:
				cc_settiling(arg1);
				return;
			case 289:
				worldmap_jumptodisplaycoord(arg1);
				return;
			case 290:
				login_request_social_network(arg1);
				return;
			case 291:
				detailget_maxdiskcachesize(arg1);
				return;
			case 292:
				if_setonkey(arg1);
				return;
			case 293:
				cam2_addeffect_shake(arg1);
				return;
			case 294:
				cc_setobject_wearcol(arg1);
				return;
			case 295:
				preload_download_remainingsize(arg1);
				return;
			case 296:
				playermember(arg1);
				return;
			case 297:
				userdetail_lobby_lastloginday(arg1);
				return;
			case 298:
				method8396(arg1);
				return;
			case 299:
				if_settextalign(arg1);
				return;
			case 300:
				abs(arg1);
				return;
			case 301:
				if_setongamepadbutton(arg1);
				return;
			case 302:
				QuestCommands.quest_statreq_level(arg1);
				return;
			case 303:
				chatcat_getdesc(arg1);
				return;
			case 304:
				chatphrase_findrestart(arg1);
				return;
			case 305:
				friend_getrank(arg1);
				return;
			case 306:
				worldmap_3dview_getcoordfine(arg1);
				return;
			case 307:
				activeclansettings_getsortedaffinedslot(arg1);
				return;
			case 308:
				detailcanmod_buildarea(arg1);
				return;
			case 309:
				detail_ambientocclusion(arg1);
				return;
			case 310:
				get_entity_screen_position(arg1);
				return;
			case 311:
				QuestCommands.quest_questreq(arg1);
				return;
			case 312:
				video_advert_force_remove(arg1);
				return;
			case 313:
				cc_getscrolly(arg1);
				return;
			case 314:
				detailcanset_maxscreensize(arg1);
				return;
			case 315:
				QuestCommands.quest_type(arg1);
				return;
			case 316:
				worldmap_setflashtics_default(arg1);
				return;
			case 317:
				if_setondialogabort(arg1);
				return;
			case 318:
				telemetry_get_group_id(arg1);
				return;
			case 319:
				cc_setonkey(arg1);
				return;
			case 320:
				get_minimenu_length(arg1);
				return;
			case 321:
				cc_setgraphicshadow(arg1);
				return;
			case 322:
				oc_stackable(arg1);
				return;
			case 323:
				cam2_enable(arg1);
				return;
			case 324:
				interface_setpickingradius(arg1);
				return;
			case 325:
				if_setmodelanim(arg1);
				return;
			case 326:
				detailcanset_orthographic(arg1);
				return;
			case 327:
				if_setopkeyrate(arg1);
				return;
			case 328:
				autosetup_sethigh(arg1);
				return;
			case 329:
				cc_getmodelzoom(arg1);
				return;
			case 330:
				cc_setongamepadaxis(arg1);
				return;
			case 331:
				enum_hasoutput(arg1);
				return;
			case 332:
				method5356(arg1);
				return;
			case 333:
				worldmap_setmap_coord_override(arg1);
				return;
			case 334:
				detailget_shadowquality(arg1);
				return;
			case 335:
				cc_setpausetext(arg1);
				return;
			case 336:
				if_resume_pausebutton(arg1);
				return;
			case 337:
				cc_setongamepadbuttonheld(arg1);
				return;
			case 338:
				long_branch_not(arg1);
				return;
			case 339:
				if_gettargetmask(arg1);
				return;
			case 340:
				if_getcolour(arg1);
				return;
			case 341:
				detailcanmod_toolkit_default(arg1);
				return;
			case 342:
				userdetail_lobby_playage(arg1);
				return;
			case 343:
				cc_setgraphic(arg1);
				return;
			case 344:
				shop_getproductcount(arg1);
				return;
			case 345:
				detailget_dof(arg1);
				return;
			case 346:
				ignore_getname_unfiltered(arg1);
				return;
			case 347:
				cc_getcharindexatpos(arg1);
				return;
			case 348:
				db_getfield(arg1);
				return;
			case 349:
				char_touppercase(arg1);
				return;
			case 350:
				fps_stats(arg1);
				return;
			case 351:
				friend_getworld(arg1);
				return;
			case 352:
				if_setlinewid(arg1);
				return;
			case 353:
				detailget_performance_metric(arg1);
				return;
			case 354:
				cc_getopbase(arg1);
				return;
			case 355:
				cam2_setlookatmode(arg1);
				return;
			case 356:
				push_int_local(arg1);
				return;
			case 357:
				cc_getcharposatindex(arg1);
				return;
			case 358:
				movecoord_fine(arg1);
				return;
			case 359:
				clan_getchatownername(arg1);
				return;
			case 360:
				detail_maxscreensize(arg1);
				return;
			case 361:
				cc_setalpha(arg1);
				return;
			case 362:
				cc_setonopt(arg1);
				return;
			case 363:
				mec_category(arg1);
				return;
			case 364:
				lowercase(arg1);
				return;
			case 365:
				cc_setlinewid(arg1);
				return;
			case 366:
				cam2_getpositionmode(arg1);
				return;
			case 367:
				keyheld_alt(arg1);
				return;
			case 368:
				activeclansettings_getreplacementowner_slot(arg1);
				return;
			case 369:
				if_setlinkplayergroup(arg1);
				return;
			case 370:
				oc_placeholder(arg1);
				return;
			case 371:
				if_delswipeflags(arg1);
				return;
			case 372:
				detailcanset_interfacescale(arg1);
				return;
			case 373:
				cc_setonvarcstrtransmit(arg1);
				return;
			case 374:
				detailget_toolkit(arg1);
				return;
			case 375:
				cc_getmodelangle_z(arg1);
				return;
			case 376:
				cc_setonstocktransmit(arg1);
				return;
			case 377:
				cc_setrecol(arg1);
				return;
			case 378:
				player_group_member_get_status(arg1);
				return;
			case 379:
				lastlogin(arg1);
				return;
			case 380:
				chat_getfilter_trade(arg1);
				return;
			case 381:
				activeclansettings_getaffinedrank(arg1);
				return;
			case 382:
				oc_members(arg1);
				return;
			case 383:
				cc_callonresize(arg1);
				return;
			case 384:
				shop_getcategorycount(arg1);
				return;
			case 385:
				detailget_cpuusage(arg1);
				return;
			case 386:
				detailcanmod_spotshadows(arg1);
				return;
			case 387:
				sound_speech_volume(arg1);
				return;
			case 388:
				method16447(arg1);
				return;
			case 389:
				paraheight(arg1);
				return;
			case 390:
				spline_length(arg1);
				return;
			case 391:
				TwitchCommands.ttv_logout(arg1);
				return;
			case 392:
				os_physicalmemorysize(arg1);
				return;
			case 394:
				player_find_active_minimenu_entry(arg1);
				return;
			case 395:
				cc_setvflip(arg1);
				return;
			case 396:
				cc_clearops(arg1);
				return;
			case 397:
				player_group_member_count(arg1);
				return;
			case 398:
				detailget_speechvol(arg1);
				return;
			case 399:
				if_setlinkfriendchat(arg1);
				return;
			case 400:
				coordz(arg1);
				return;
			case 401:
				cam2_setdepthplanes(arg1);
				return;
			case 402:
				clan_getchatuserrank(arg1);
				return;
			case 403:
				gender(arg1);
				return;
			case 404:
				cam2_setlookatentity_npc(arg1);
				return;
			case 405:
				pop_long_local(arg1);
				return;
			case 406:
				activeclanchannel_getuserworld(arg1);
				return;
			case 407:
				if_setonplayergrouptransmit(arg1);
				return;
			case 408:
				if_opensubclient(arg1);
				return;
			case 409:
				cam2_addeffect_ztilt(arg1);
				return;
			case 410:
				detail_groundblending(arg1);
				return;
			case 411:
				long_branch_greater_than_or_equals(arg1);
				return;
			case 412:
				method10758(arg1);
				return;
			case 413:
				seqlength(arg1);
				return;
			case 414:
				method15087(arg1);
				return;
			case 415:
				worldlist_sort(arg1);
				return;
			case 416:
				if_delpinchflags(arg1);
				return;
			case 417:
				create_name_validate_reply(arg1);
				return;
			case 418:
				cc_npc_setcustombodymodel_transformed(arg1);
				return;
			case 419:
				cc_setfill(arg1);
				return;
			case 420:
				shader_preload_throttle(arg1);
				return;
			case 421:
				sound_synth_volume(arg1);
				return;
			case 422:
				ignore_getname(arg1);
				return;
			case 423:
				resume_clanforumqfcdialog(arg1);
				return;
			case 424:
				if_setmodelangle(arg1);
				return;
			case 425:
				cc_setoptkey(arg1);
				return;
			case 426:
				worldmap_getconfigzoom(arg1);
				return;
			case 427:
				get_mousebuttons(arg1);
				return;
			case 428:
				if_setsubtractinsets(arg1);
				return;
			case 429:
				cc_getscrollwidth(arg1);
				return;
			case 430:
				pop_long_discard(arg1);
				return;
			case 431:
				inv_totalparam_stack(arg1);
				return;
			case 432:
				if_setopcursor(arg1);
				return;
			case 433:
				cc_setobject_wearcol_alwaysnum(arg1);
				return;
			case 434:
				cam2_getpositionentity_lookatdistance(arg1);
				return;
			case 435:
				if_setcolour(arg1);
				return;
			case 436:
				if_sethflip(arg1);
				return;
			case 437:
				cc_setfontmono(arg1);
				return;
			case 438:
				detailget_reflections(arg1);
				return;
			case 439:
				if_getgraphicdimensions(arg1);
				return;
			case 440:
				detailcanset_spotshadows(arg1);
				return;
			case 441:
				if_getmodelyof(arg1);
				return;
			case 442:
				compare(arg1);
				return;
			case 443:
				detailget_soundvol(arg1);
				return;
			case 444:
				worldmap_flashelement(arg1);
				return;
			case 445:
				chatcat_getsubcatcount(arg1);
				return;
			case 446:
				detail_gamerenderscale(arg1);
				return;
			case 447:
				QuestCommands.quest_pointsreq_met(arg1);
				return;
			case 448:
				video_advert_play(arg1);
				return;
			case 449:
				if_getmodelzoom(arg1);
				return;
			case 450:
				detailcanset_anisotropicfiltering(arg1);
				return;
			case 451:
				if_setmaxlines(arg1);
				return;
			case 452:
				if_setondrag(arg1);
				return;
			case 453:
				cc_setswipedeadzone(arg1);
				return;
			case 454:
				detailget_customcursors(arg1);
				return;
			case 455:
				map_loadingscreen_settriggerpercent(arg1);
				return;
			case 456:
				if_debug_button8(arg1);
				return;
			case 457:
				detail_maxbackgroundfps(arg1);
				return;
			case 458:
				detailcanmod_gamerenderscale(arg1);
				return;
			case 459:
				reboottimer(arg1);
				return;
			case 460:
				if_setplayermodel_self(arg1);
				return;
			case 461:
				detailget_brightness(arg1);
				return;
			case 462:
				shop_requestdatastatus(arg1);
				return;
			case 463:
				lobby_enterlobby_social_network(arg1);
				return;
			case 464:
				branch_if_true(arg1);
				return;
			case 465:
				if_settextfont(arg1);
				return;
			case 466:
				db_find_get(arg1);
				return;
			case 467:
				telemetry_get_row_index(arg1);
				return;
			case 468:
				cc_deleteall(arg1);
				return;
			case 469:
				method9286(arg1);
				return;
			case 470:
				cam_forceangle(arg1);
				return;
			case 471:
				cam2_setlookatentity_player(arg1);
				return;
			case 472:
				setup_messagebox(arg1);
				return;
			case 473:
				string_indexof_string(arg1);
				return;
			case 474:
				db_getfieldcount(arg1);
				return;
			case 475:
				openurl(arg1);
				return;
			case 476:
				if_setonrelease(arg1);
				return;
			case 477:
				cc_setswipeflags(arg1);
				return;
			case 478:
				activeclanchannel_getuserdisplayname(arg1);
				return;
			case 479:
				cc_gettext(arg1);
				return;
			case 480:
				method5949(arg1);
				return;
			case 481:
				detailcanset_maxforegroundfps(arg1);
				return;
			case 482:
				pop_var(arg1);
				return;
			case 483:
				detailcanset_antialiasing(arg1);
				return;
			case 484:
				create_createrequest(arg1);
				return;
			case 485:
				if_setonchattransmit(arg1);
				return;
			case 486:
				cam2_setlookatorientation_yrotation(arg1);
				return;
			case 487:
				minimenuopen(arg1);
				return;
			case 488:
				worldmap_3dview_setlighting(arg1);
				return;
			case 489:
				if_debug_button5(arg1);
				return;
			case 490:
				if_sendto(false, arg1);
				return;
			case 491:
				if_setonmouseover(arg1);
				return;
			case 492:
				battery_getlevelpercent(arg1);
				return;
			case 493:
				detailcanset_antialiasingmode(arg1);
				return;
			case 494:
				detailget_orthographic(arg1);
				return;
			case 495:
				format_datetime_from_minutes(arg1);
				return;
			case 496:
				TwitchCommands.ttv_login(arg1);
				return;
			case 497:
				create_suggest_name_request(arg1);
				return;
			case 498:
				detail_antialiasing_default(arg1);
				return;
			case 499:
				detailcanmod_bloom(arg1);
				return;
			case 500:
				ignore_count(arg1);
				return;
			case 501:
				viewport_setzoom(arg1);
				return;
			case 502:
				worldmap_stopcurrentflashes(arg1);
				return;
			case 503:
				activeclansettings_getclanname(arg1);
				return;
			case 504:
				setbit(arg1);
				return;
			case 505:
				cc_setonverticalswipe(arg1);
				return;
			case 506:
				fromdate(arg1);
				return;
			case 507:
				method10336(arg1);
				return;
			case 508:
				coord(arg1);
				return;
			case 509:
				if_npc_setcustomrecol(arg1);
				return;
			case 510:
				get_loc_bounding_box(arg1);
				return;
			case 511:
				activechatphrase_setdynamicint(arg1);
				return;
			case 512:
				if_setonstattransmit(arg1);
				return;
			case 513:
				detailget_idleanims(arg1);
				return;
			case 514:
				cam2_setpositionacceleration_axis(arg1);
				return;
			case 515:
				detail_diskcachesize(arg1);
				return;
			case 516:
				cam_lookat(arg1);
				return;
			case 517:
				sethardcodedopcursors(arg1);
				return;
			case 518:
				if_setonresize(arg1);
				return;
			case 519:
				cc_setsize(arg1);
				return;
			case 520:
				worldmap_closemap(arg1);
				return;
			case 521:
				oc_uncert(arg1);
				return;
			case 522:
				if_gettext(arg1);
				return;
			case 523:
				enum_string(arg1);
				return;
			case 524:
				push_var(arg1);
				return;
			case 525:
				cc_settextalign(arg1);
				return;
			case 526:
				detailcanset_skydetail(arg1);
				return;
			case 527:
				login_continue(arg1);
				return;
			case 528:
				get_col_tag(arg1);
				return;
			case 529:
				pop_array(arg1, true);
				return;
			case 530:
				if_setgraphic(arg1);
				return;
			case 531:
				pop_array(arg1, false);
				return;
			case 532:
				TwitchCommands.ttv_library_getstate(arg1);
				return;
			case 533:
				setbit_range(arg1);
				return;
			case 534:
				if_setpinchdeadzone(arg1);
				return;
			case 535:
				detailcanmod_groundblending(arg1);
				return;
			case 536:
				viewport_geteffectivesize(arg1);
				return;
			case 537:
				sound_jingle(arg1);
				return;
			case 538:
				if_setongamepadtrigger(arg1);
				return;
			case 539:
				cos_deg(arg1);
				return;
			case 540:
				os_ismac(arg1);
				return;
			case 541:
				invother_total(arg1);
				return;
			case 542:
				sound_mixbuss_add(arg1);
				return;
			case 543:
				branch_not(arg1);
				return;
			case 544:
				if_setonverticalpinch(arg1);
				return;
			case 545:
				cc_settargetopcursor(arg1);
				return;
			case 546:
				setgender(arg1);
				return;
			case 547:
				notifications_cancellocal(arg1);
				return;
			case 548:
				push_long_local(arg1);
				return;
			case 549:
				detail_volumetriclighting(arg1);
				return;
			case 550:
				stat_base(arg1);
				return;
			case 551:
				TwitchCommands.ttv_library_request(arg1);
				return;
			case 552:
				sound_synth_rate(arg1);
				return;
			case 553:
				is_npc_active(arg1);
				return;
			case 554:
				cc_setontargetleave(arg1);
				return;
			case 555:
				cc_getheight(arg1);
				return;
			case 556:
				detail_maxforegroundfps(arg1);
				return;
			case 557:
				activeclanchannel_getuserrank(arg1);
				return;
			case 558:
				clan_getchatusername(arg1);
				return;
			case 559:
				clan_isself(arg1);
				return;
			case 560:
				cam2_getpositionentity_lookatangleoffsets(arg1);
				return;
			case 561:
				if_setonhold(arg1);
				return;
			case 562:
				resend_uid_passport_request(arg1);
				return;
			case 563:
				map_lang(arg1);
				return;
			case 564:
				long_branch_greater_than(arg1);
				return;
			case 565:
				detailget_maxbackgroundfps(arg1);
				return;
			case 566:
				enum_hasoutput_string(arg1);
				return;
			case 567:
				date_runeday_fromdate(arg1);
				return;
			case 568:
				viewport_clampfov(arg1);
				return;
			case 569:
				keyheld_ctrl(arg1);
				return;
			case 570:
				movecoord(arg1);
				return;
			case 571:
				chat_setfilter(arg1);
				return;
			case 572:
				opcount(arg1);
				return;
			case 573:
				worldlist_pingworlds(arg1);
				return;
			case 574:
				if_setopchar(arg1);
				return;
			case 575:
				cc_npc_setcustomretex(arg1);
				return;
			case 576:
				if_setopkeyignoreheld(arg1);
				return;
			case 577:
				TwitchCommands.ttv_webcam_flip(arg1);
				return;
			case 578:
				cc_setonverticalpinch(arg1);
				return;
			case 579:
				telemetry_get_column_index(arg1);
				return;
			case 580:
				runenergy_visible(arg1);
				return;
			case 581:
				activeclansettings_getcurrentowner_slot(arg1);
				return;
			case 582:
				TwitchCommands.ttv_livestreams_update(arg1);
				return;
			case 583:
				cc_setparam_string(arg1);
				return;
			case 584:
				os_isios(arg1);
				return;
			case 585:
				if_setonscrollwheel(arg1);
				return;
			case 586:
				multiply(arg1);
				return;
			case 587:
				cc_sendto(true, arg1);
				return;
			case 588:
				detailget_musicvol(arg1);
				return;
			case 589:
				worldmap_getconfigbounds(arg1);
				return;
			case 590:
				min(arg1);
				return;
			case 591:
				setsubmenuminlength(arg1);
				return;
			case 592:
				if_addpinchflags(arg1);
				return;
			case 593:
				db_find(arg1, true);
				return;
			case 594:
				if_debug_target(arg1);
				return;
			case 595:
				if_gettop(arg1);
				return;
			case 596:
				openurl_shim(arg1);
				return;
			case 597:
				cc_setdragrenderbehaviour(arg1);
				return;
			case 598:
				cc_gethide(arg1);
				return;
			case 599:
				cc_dragpickup(arg1);
				return;
			case 600:
				playermod(arg1);
				return;
			case 601:
				worldmap_getsize(arg1);
				return;
			case 602:
				shop_applypendingtransactions(arg1);
				return;
			case 603:
				emoji_add(arg1);
				return;
			case 604:
				cc_setnoclickthrough(arg1);
				return;
			case 605:
				if_settargetopcursor(arg1);
				return;
			case 606:
				oc_wearpos(arg1);
				return;
			case 607:
				cam2_setpositionangularinterpolation(arg1);
				return;
			case 608:
				logout_getreason(arg1);
				return;
			case 609:
				cc_delswipeflags(arg1);
				return;
			case 610:
				TwitchCommands.ttv_webcam_getcap_count(arg1);
				return;
			case 611:
				cc_sethflip(arg1);
				return;
			case 612:
				detailcanmod_ambientocclusion(arg1);
				return;
			case 613:
				TwitchCommands.ttv_stream_stop(arg1);
				return;
			case 614:
				if_setfontmono(arg1);
				return;
			case 615:
				worldmap_setmap(arg1);
				return;
			case 616:
				cc_setsubtractinsets(arg1);
				return;
			case 617:
				worldmap_flashelementcategory(arg1);
				return;
			case 618:
				viewport_getfov(arg1);
				return;
			case 619:
				inv_total(arg1);
				return;
			case 620:
				cam2_setfieldofview(arg1);
				return;
			case 621:
				cc_getinvobject(arg1);
				return;
			case 622:
				if_setfill(arg1);
				return;
			case 623:
				player_group_member_get_displayname(arg1);
				return;
			case 624:
				activeclansettings_getaffinedmuted(arg1);
				return;
			case 625:
				worldlist_next(arg1);
				return;
			case 626:
				activeclansettings_find_affined(arg1);
				return;
			case 627:
				QuestCommands.quest_points(arg1);
				return;
			case 628:
				create_name_availablerequest(arg1);
				return;
			case 629:
				detailcanset_toolkit_default(arg1);
				return;
			case 630:
				if_setmouseovercursor(arg1);
				return;
			case 631:
				if_setonclansettingstransmit(arg1);
				return;
			case 632:
				create_step_reached(arg1);
				return;
			case 633:
				cc_sethide(arg1);
				return;
			case 634:
				lobby_enterlobby_sso(arg1);
				return;
			case 635:
				escape(arg1);
				return;
			case 636:
				detailget_stereo(arg1);
				return;
			case 637:
				worldmap_getconfigsize(arg1);
				return;
			case 638:
				userdetail_lobby_membership(arg1);
				return;
			case 639:
				activeclansettings_getbannedcount(arg1);
				return;
			case 640:
				npc_type(arg1);
				return;
			case 641:
				method3485(arg1);
				return;
			case 642:
				date_year(arg1);
				return;
			case 643:
				cc_setaspect(arg1);
				return;
			case 644:
				if_setparam_string(arg1);
				return;
			case 645:
				detail_cpuusage(arg1);
				return;
			case 646:
				enum_getreversecount(arg1);
				return;
			case 647:
				detailget_particles(arg1);
				return;
			case 648:
				notifications_init(arg1);
				return;
			case 649:
				cc_setonmouseleave(arg1);
				return;
			case 650:
				method4060(arg1);
				return;
			case 651:
				cc_setonhorizontalpinch(arg1);
				return;
			case 652:
				getwindowmode(arg1);
				return;
			case 653:
				bug_report(arg1);
				return;
			case 654:
				invother_getnum(arg1);
				return;
			case 655:
				and(arg1);
				return;
			case 656:
				if_debug_button10(arg1);
				return;
			case 657:
				worldmap_3dview_settextfont(arg1);
				return;
			case 658:
				worldmap_setzoom(arg1);
				return;
			case 659:
				detailget_grounddecor_on(arg1);
				return;
			case 660:
				QuestCommands.quest_pointsreq(arg1);
				return;
			case 661:
				keyheld_shift(arg1);
				return;
			case 662:
				cc_getid(arg1);
				return;
			case 663:
				oc_cert(arg1);
				return;
			case 664:
				sound_group_start(arg1);
				return;
			case 665:
				detailcanmod_lightingquality(arg1);
				return;
			case 666:
				if_gety(arg1);
				return;
			case 667:
				enum_getoutputcount(arg1);
				return;
			case 668:
				method5069(arg1);
				return;
			case 669:
				cc_setcolour(arg1);
				return;
			case 670:
				setdefaultcursors(arg1);
				return;
			case 671:
				cam_dec_y(arg1);
				return;
			case 672:
				if_getopbase(arg1);
				return;
			case 673:
				if_gethide(arg1);
				return;
			case 674:
				map_quickchat(arg1);
				return;
			case 675:
				worldmap_3dview_getscreenposition(arg1);
				return;
			case 676:
				detailcanset_dof(arg1);
				return;
			case 677:
				method2581(arg1);
				return;
			case 678:
				shader_preload_allow(arg1);
				return;
			case 679:
				cc_addswipeflags(arg1);
				return;
			case 680:
				if_setheld(arg1);
				return;
			case 681:
				create_under13(arg1);
				return;
			case 682:
				cc_setobject_wearcol_nonum(arg1);
				return;
			case 683:
				friend_getname(arg1);
				return;
			case 684:
				opplayert(arg1);
				return;
			case 685:
				method5896(arg1);
				return;
			case 686:
				chat_sendprivate(arg1);
				return;
			case 687:
				worldmap_getmap(arg1);
				return;
			case 688:
				method7352(arg1);
				return;
			case 689:
				oc_shardcount(arg1);
				return;
			case 690:
				is_npc_visible(arg1);
				return;
			case 691:
				cc_setpinchdeadzone(arg1);
				return;
			case 692:
				player_group_banned_count(arg1);
				return;
			case 693:
				branch_greater_than(arg1);
				return;
			case 694:
				detailget_skydetail(arg1);
				return;
			case 695:
				oc_hasvarobj(arg1);
				return;
			case 696:
				detailget_volumetriclighting(arg1);
				return;
			case 697:
				method5073(arg1);
				return;
			case 698:
				detailcanset_groundblending(arg1);
				return;
			case 699:
				enum_getreverseindex_string(arg1);
				return;
			case 700:
				cam_getfollowheight(arg1);
				return;
			case 701:
				cc_getlayer(arg1);
				return;
			case 702:
				detail_removeroofs_option(arg1);
				return;
			case 703:
				clan_joinchat(arg1);
				return;
			case 704:
				stat_visible_xp(arg1);
				return;
			case 705:
				map_isowner(arg1);
				return;
			case 706:
				login_request(arg1);
				return;
			case 707:
				detail_lightingquality(arg1);
				return;
			case 708:
				setwindowmode(arg1);
				return;
			case 709:
				preload_download_rate(arg1);
				return;
			case 710:
				cc_setonclanchanneltransmit(arg1);
				return;
			case 711:
				get_entity_bounding_box(arg1);
				return;
			case 712:
				coordz_fine(arg1);
				return;
			case 713:
				autosetup_blackflaglast(arg1);
				return;
			case 714:
				cc_setoutline(arg1);
				return;
			case 715:
				detailget_gamerenderscale(arg1);
				return;
			case 716:
				detail_removeroofs_option_override(arg1);
				return;
			case 717:
				if_debug_button2(arg1);
				return;
			case 718:
				detailcanmod_texturing(arg1);
				return;
			case 719:
				detail_flickering_on(arg1);
				return;
			case 720:
				sso_available(arg1);
				return;
			case 721:
				get_obj_screen_position(arg1);
				return;
			case 722:
				if_setdraggable(arg1);
				return;
			case 723:
				friend_is_referred(arg1);
				return;
			case 724:
				cc_npc_setcustomheadmodel(arg1);
				return;
			case 725:
				detailcanmod_fog(arg1);
				return;
			case 726:
				cc_getmodelyof(arg1);
				return;
			case 727:
				method10757(arg1);
				return;
			case 728:
				cc_getfontmetrics(arg1);
				return;
			case 729:
				method4479(arg1);
				return;
			case 730:
				worldmap_disableelements(arg1);
				return;
			case 731:
				if_sethide(arg1);
				return;
			case 732:
				oc_op(arg1);
				return;
			case 733:
				method18150(arg1);
				return;
			case 734:
				cc_create(arg1);
				return;
			case 735:
				cc_setmodelzoom(arg1);
				return;
			case 736:
				if_setretex(arg1);
				return;
			case 737:
				if_setoncamfinished(arg1);
				return;
			case 738:
				detailcanmod_shadows(arg1);
				return;
			case 739:
				setdefaultwindowmode(arg1);
				return;
			case 740:
				TwitchCommands.ttv_hasprerequisites(arg1);
				return;
			case 741:
				chatcat_findphrasebyshortcut(arg1);
				return;
			case 742:
				cc_setonvarctransmit(arg1);
				return;
			case 743:
				TwitchCommands.ttv_webcam_getstate(arg1);
				return;
			case 744:
				preload_download_totalsize(arg1);
				return;
			case 745:
				get_mousey(arg1);
				return;
			case 746:
				cc_delpinchflags(arg1);
				return;
			case 747:
				login_hoptime(arg1);
				return;
			case 748:
				if_gettrans(arg1);
				return;
			case 749:
				shop_opencategories(arg1);
				return;
			case 750:
				chatcat_getsubcat(arg1);
				return;
			case 751:
				detail_stereo(arg1);
				return;
			case 752:
				detail_idleanims_many(arg1);
				return;
			case 753:
				userdetail_lobby_membersstats(arg1);
				return;
			case 754:
				opplayer(arg1);
				return;
			case 755:
				cc_setmodelorigin(arg1);
				return;
			case 756:
				resume_countdialog(arg1);
				return;
			case 757:
				activeclansettings_getallowunaffined(arg1);
				return;
			case 758:
				append_num(arg1);
				return;
			case 759:
				if_setoptchar(arg1);
				return;
			case 760:
				if_setmodelorthog(arg1);
				return;
			case 761:
				push_long_constant(arg1);
				return;
			case 762:
				openurl_nologin(arg1);
				return;
			case 763:
				detailget_antialiasing_default(arg1);
				return;
			case 764:
				if_getmodelangle_y(arg1);
				return;
			case 765:
				cam_inc_x(arg1);
				return;
			case 766:
				not(arg1);
				return;
			case 767:
				if_setonopt(arg1);
				return;
			case 768:
				method1921(arg1);
				return;
			case 769:
				detailget_chosesafemode(arg1);
				return;
			case 770:
				clan_leavechat(arg1);
				return;
			case 771:
				if_debug_getname(arg1);
				return;
			case 772:
				if_getheight(arg1);
				return;
			case 773:
				method5129(arg1);
				return;
			case 774:
				clan_getchatdisplayname(arg1);
				return;
			case 775:
				if_setongamepadbuttonheld(arg1);
				return;
			case 776:
				if_setongamepadaxis(arg1);
				return;
			case 777:
				userdetail_lobby_unreadmessages(arg1);
				return;
			case 778:
				if_setnoclickthrough(arg1);
				return;
			case 779:
				if_setoptkeyrate(arg1);
				return;
			case 780:
				cc_setobject_nonum(arg1);
				return;
			case 781:
				cc_setoncameraupdatetransmit(arg1);
				return;
			case 782:
				facing_fine(arg1);
				return;
			case 783:
				if_set_gamescreen_enabled(arg1);
				return;
			case 784:
				method17434(arg1);
				return;
			case 785:
				if_debug_getcomcount(arg1);
				return;
			case 786:
				cam2_setlinearmovementmode(arg1);
				return;
			case 787:
				randominc(arg1);
				return;
			case 788:
				detailcanset_animdetail(arg1);
				return;
			case 789:
				friend_getslotfromname(arg1);
				return;
			case 790:
				cam_reset(arg1);
				return;
			case 791:
				detailcanset_reflections(arg1);
				return;
			case 792:
				cc_setmodeltint(arg1);
				return;
			case 793:
				cam2_setpositionpoint_point(arg1);
				return;
			case 794:
				detailcanset_waterdetail(arg1);
				return;
			case 795:
				userdetail_lobby_dobrequested(arg1);
				return;
			case 796:
				detail_waterdetail_high(arg1);
				return;
			case 797:
				detailcanmod_shadowquality(arg1);
				return;
			case 798:
				sound_jingle_volume(arg1);
				return;
			case 799:
				invpow(arg1);
				return;
			case 800:
				inv_freespace(arg1);
				return;
			case 801:
				login_cancel(arg1);
				return;
			case 802:
				method7884(arg1);
				return;
			case 803:
				method257(arg1);
				return;
			case 804:
				activeclanchannel_getuserslot(arg1);
				return;
			case 805:
				if_triggerop(arg1);
				return;
			case 806:
				if_getscrolly(arg1);
				return;
			case 807:
				method8435(arg1);
				return;
			case 808:
				if_setlinkactiveclanchannel(arg1);
				return;
			case 809:
				chat_playername(arg1);
				return;
			case 810:
				_enum(arg1);
				return;
			case 811:
				cam2_setpositionentity_npc(arg1);
				return;
			case 812:
				worldmap_disabletype(arg1);
				return;
			case 813:
				worldlist_fetch(arg1);
				return;
			case 814:
				worldmap_disableelement(arg1);
				return;
			case 815:
				push_string_local(arg1);
				return;
			case 816:
				removetags(arg1);
				return;
			case 817:
				QuestCommands.quest_getsortname(arg1);
				return;
			case 818:
				cc_getinvcount(arg1);
				return;
			case 819:
				shop_getcategorydescription(arg1);
				return;
			case 820:
				chat_gethistory_byuid(arg1);
				return;
			case 821:
				cc_setplayermodel(arg1);
				return;
			case 822:
				userdetail_dob(arg1);
				return;
			case 823:
				modulo(arg1);
				return;
			case 824:
				chat_getfilter_private(arg1);
				return;
			case 825:
				detailget_bgsoundvol(arg1);
				return;
			case 826:
				spline_addpoint(arg1);
				return;
			case 827:
				worldmap_coordinmap(arg1);
				return;
			case 828:
				bas_getanim_ready(arg1);
				return;
			case 829:
				TwitchCommands.ttv_webcam_stop(arg1);
				return;
			case 830:
				sound_song_stop(arg1);
				return;
			case 831:
				detail_toolkit(arg1);
				return;
			case 832:
				detailcanmod_maxscreensize(arg1);
				return;
			case 833:
				cam2_setlookatorientation_vector(arg1);
				return;
			case 834:
				cc_setobject(arg1);
				return;
			case 835:
				cc_setdraggable(arg1);
				return;
			case 836:
				append_signnum(arg1);
				return;
			case 837:
				TwitchCommands.ttv_webcam_getdevice_count(arg1);
				return;
			case 838:
				staffmodlevel(arg1);
				return;
			case 839:
				QuestCommands.quest_started(arg1);
				return;
			case 840:
				detailcanset_texturing(arg1);
				return;
			case 841:
				if_settargetcursors(arg1);
				return;
			case 842:
				char_isalpha(arg1);
				return;
			case 843:
				chat_clear(arg1);
				return;
			case 844:
				detail_loginvol(arg1);
				return;
			case 845:
				shop_open(arg1);
				return;
			case 846:
				worldmap_findnearestelement(arg1);
				return;
			case 847:
				db_find(arg1, false);
				return;
			case 848:
				if_debug_button7(arg1);
				return;
			case 849:
				if_setdragrenderbehaviour(arg1);
				return;
			case 850:
				if_debug_button1(arg1);
				return;
			case 851:
				detailget_texturing(arg1);
				return;
			case 852:
				cc_getgraphic(arg1);
				return;
			case 853:
				cc_setmodelangle(arg1);
				return;
			case 854:
				player_group_banned_get_displayname(arg1);
				return;
			case 855:
				shop_getindexforcategoryname(arg1);
				return;
			case 856:
				if_clearscripthooks(arg1);
				return;
			case 857:
				userdetail_lobby_ccexpiry(arg1);
				return;
			case 858:
				oc_find(arg1);
				return;
			case 859:
				stockmarket_isofferadding(arg1);
				return;
			case 860:
				if_getmodel(arg1);
				return;
			case 861:
				cc_setonvartransmit(arg1);
				return;
			case 862:
				clienttype(arg1);
				return;
			case 863:
				fullscreen_getmode(arg1);
				return;
			case 864:
				detail_reflections(arg1);
				return;
			case 865:
				detailcanmod_antialiasing(arg1);
				return;
			case 866:
				branch(arg1);
				return;
			case 867:
				QuestCommands.quest_getdifficulty(arg1);
				return;
			case 868:
				affinedclansettings_setmuted_fromchannel(arg1);
				return;
			case 869:
				sub(arg1);
				return;
			case 870:
				cam2_removealleffects(arg1);
				return;
			case 871:
				activeclansettings_getbanneddisplayname(arg1);
				return;
			case 872:
				ignore_getnotes(arg1);
				return;
			case 873:
				inv_totalparam(arg1);
				return;
			case 874:
				activeclansettings_getranktalk(arg1);
				return;
			case 875:
				TwitchCommands.ttv_chat_sendmessage(arg1);
				return;
			case 876:
				if_getfontmetrics(arg1);
				return;
			case 877:
				db_findnext(arg1);
				return;
			case 878:
				cc_setposition(arg1);
				return;
			case 879:
				if_setgraphicshadow(arg1);
				return;
			case 880:
				worldmap_getdisableelementcategory(arg1);
				return;
			case 881:
				shop_getproductdetails(arg1);
				return;
			case 882:
				create_connectrequest(arg1);
				return;
			case 883:
				player_group_member_get_join_xp(arg1);
				return;
			case 884:
				map_loadedpercent(arg1);
				return;
			case 885:
				get_loc_overlay_height(arg1);
				return;
			case 886:
				fullscreen_lastmode(arg1);
				return;
			case 887:
				detail_soundvol(arg1);
				return;
			case 888:
				parawidth(arg1);
				return;
			case 889:
				if_getcharposatindex(arg1);
				return;
			case 890:
				cc_setmodel(arg1);
				return;
			case 891:
				if_callonresize(arg1);
				return;
			case 892:
				if_setopbase(arg1);
				return;
			case 893:
				applet_hasfocus(arg1);
				return;
			case 894:
				chatcat_getphraseshortcut(arg1);
				return;
			case 895:
				if_setonverticalswipe(arg1);
				return;
			case 896:
				detailcanset_ambientocclusion(arg1);
				return;
			case 897:
				detailget_toolkit_default(arg1);
				return;
			case 898:
				if_settrans(arg1);
				return;
			case 899:
				stockmarket_isofferempty(arg1);
				return;
			case 900:
				sound_song(arg1);
				return;
			case 901:
				if_setonclickrepeat(arg1);
				return;
			case 902:
				QuestCommands.quest_allreqmet(arg1);
				return;
			case 903:
				cancel_interface_drag(arg1);
				return;
			case 904:
				worldmap_3dview_active(arg1);
				return;
			case 905:
				detailget_canchoosesafemode(arg1);
				return;
			case 906:
				coord_fine(arg1);
				return;
			case 907:
				os_driver_vendor(arg1);
				return;
			case 908:
				chat_gethistorylength(arg1);
				return;
			case 909:
				if_getwidth(arg1);
				return;
			case 910:
				get_npc_vislevel(arg1);
				return;
			case 911:
				telemetry_get_column_id(arg1);
				return;
			case 912:
				cc_setlinkfriendchat(arg1);
				return;
			case 913:
				oc_param(arg1);
				return;
			case 914:
				detailcanset_fog(arg1);
				return;
			case 915:
				setobj(arg1);
				return;
			case 916:
				defaultminimenu(arg1);
				return;
			case 917:
				if_hassuboverlay(arg1);
				return;
			case 918:
				cam2_setpositionmaxspeed(arg1);
				return;
			case 919:
				if_setonvarcstrtransmit(arg1);
				return;
			case 920:
				method5146(arg1);
				return;
			case 921:
				divide(arg1);
				return;
			case 922:
				cc_setmodelanim(arg1);
				return;
			case 923:
				method7328(arg1);
				return;
			case 924:
				if_setoninvtransmit(arg1);
				return;
			case 925:
				worldlist_autoworld(arg1);
				return;
			case 926:
				if_setonclantransmit(arg1);
				return;
			case 927:
				resume_objdialog(arg1);
				return;
			case 928:
				stockmarket_getofferitem(arg1);
				return;
			case 929:
				detail_bgsoundvol(arg1);
				return;
			case 930:
				chat_playername_unfiltered(arg1);
				return;
			case 931:
				invother_getvar(arg1);
				return;
			case 932:
				os_driver_outdated(arg1);
				return;
			case 933:
				activeclansettings_getcoinshare(arg1);
				return;
			case 934:
				if_setonvarclantransmit(arg1);
				return;
			case 935:
				getgridcoordrelativetocamera(arg1);
				return;
			case 936:
				TwitchCommands.ttv_webcam_getdevice_byindex(arg1);
				return;
			case 937:
				worldmap_3dview_setloddistance(arg1);
				return;
			case 938:
				mec_param(arg1);
				return;
			case 939:
				cc_setpinchflags(arg1);
				return;
			case 940:
				if_setalpha(arg1);
				return;
			case 941:
				resume_stringdialog(arg1);
				return;
			case 942:
				QuestCommands.quest_varbitreq_desc(arg1);
				return;
			case 943:
				if_setpinchflags(arg1);
				return;
			case 944:
				mes_typed(arg1);
				return;
			case 945:
				push_array(arg1, true, false);
				return;
			case 946:
				cc_gettargetmask(arg1);
				return;
			case 947:
				get_entity_say(arg1);
				return;
			case 948:
				cc_setonrelease(arg1);
				return;
			case 949:
				cc_setonresize(arg1);
				return;
			case 950:
				if_resetlinkplayer(arg1);
				return;
			case 951:
				bitcount(arg1);
				return;
			case 952:
				create_suggest_name_reply(arg1);
				return;
			case 953:
				cc_setplayermodel_self(arg1);
				return;
			case 954:
				detailget_ambientocclusion(arg1);
				return;
			case 955:
				login_reply(arg1);
				return;
			case 956:
				detailcanmod_hardshadows(arg1);
				return;
			case 957:
				chatphrase_getautoresponse(arg1);
				return;
			case 958:
				email_validation_submit_code(arg1);
				return;
			case 959:
				setwalkmarker(arg1);
				return;
			case 960:
				if_getcharindexatpos(arg1);
				return;
			case 961:
				friend_add(arg1);
				return;
			case 962:
				cam2_setlookatspringproperties(arg1);
				return;
			case 963:
				shop_getcategoryid(arg1);
				return;
			case 964:
				cc_setdragdeadzone(arg1);
				return;
			case 965:
				show_software_license(arg1);
				return;
			case 966:
				if_debug_button6(arg1);
				return;
			case 967:
				max(arg1);
				return;
			case 968:
				worldmap_setflashloops(arg1);
				return;
			case 969:
				player_group_get_create_mins_since_epoch(arg1);
				return;
			case 970:
				detailcanmod_maxbackgroundfps(arg1);
				return;
			case 971:
				get_loc_screen_position(arg1);
				return;
			case 972:
				cc_setplayerhead_self(arg1);
				return;
			case 973:
				worldmap_setflashtics(arg1);
				return;
			case 974:
				worldmap_getmapname(arg1);
				return;
			case 975:
				lobby_entergamereply(arg1);
				return;
			case 976:
				cc_getscrollheight(arg1);
				return;
			case 977:
				get_minimenu_target(arg1);
				return;
			case 978:
				cam2_setlookatangularinterpolation(arg1);
				return;
			case 979:
				if_setscrollsize(arg1);
				return;
			case 980:
				detailget_mindiskcachesize(arg1);
				return;
			case 981:
				notify_accountcreatestarted(arg1);
				return;
			case 982:
				fullscreen_modecount(arg1);
				return;
			case 983:
				detailget_drawdistance(arg1);
				return;
			case 984:
				method3911(arg1);
				return;
			case 985:
				if_setdragdeadtime(arg1);
				return;
			case 986:
				if_getscrollwidth(arg1);
				return;
			case 987:
				cc_setonmouseover(arg1);
				return;
			case 988:
				npc_find_active_minimenu_entry(arg1);
				return;
			case 989:
				if_setonvarctransmit(arg1);
				return;
			case 990:
				detail_buildarea(arg1);
				return;
			case 991:
				detailget_animdetail(arg1);
				return;
			case 992:
				activechatphrase_setdynamicobj(arg1);
				return;
			case 993:
				get_obj_bounding_box(arg1);
				return;
			case 994:
				if_settargetverb(arg1);
				return;
			case 995:
				cc_setnpchead(arg1);
				return;
			case 996:
				docheat(arg1);
				return;
			case 997:
				or(arg1);
				return;
			case 998:
				worldmap_getcurrentmap(arg1);
				return;
			case 999:
				cc_setopkeyrate(arg1);
				return;
			case 1000:
				coordy(arg1);
				return;
			case 1001:
				detailget_anisotropicfiltering(arg1);
				return;
			case 1002:
				detail_lightdetail_high(arg1);
				return;
			case 1003:
				detail_idleanims(arg1);
				return;
			case 1004:
				cc_getop(arg1);
				return;
			case 1005:
				worldmap_getdisableelement(arg1);
				return;
			case 1006:
				cc_setonclansettingstransmit(arg1);
				return;
			case 1007:
				worldmap_getconfigorigin(arg1);
				return;
			case 1008:
				method13982(arg1);
				return;
			case 1009:
				cc_gety(arg1);
				return;
			case 1010:
				detailget_antialiasingmode(arg1);
				return;
			case 1011:
				basecolour(arg1);
				return;
			case 1012:
				cc_settargetverb(arg1);
				return;
			case 1013:
				if_setrecol(arg1);
				return;
			case 1014:
				hsvtorgb(arg1);
				return;
			case 1015:
				if_getparentlayer(arg1);
				return;
			case 1016:
				text_gender(arg1);
				return;
			case 1017:
				video_advert_allow_skip(arg1);
				return;
			case 1018:
				emoji_substitute(arg1);
				return;
			case 1019:
				chat_getfilter_public(arg1);
				return;
			case 1020:
				cam2_setlookatorientation_maxdistanceclamping(arg1);
				return;
			case 1021:
				inv_getobj(arg1);
				return;
			case 1022:
				player_group_get_overall_status(arg1);
				return;
			case 1023:
				detailcanmod_volumetriclighting(arg1);
				return;
			case 1024:
				if_addswipeflags(arg1);
				return;
			case 1025:
				stockmarket_getoffertype(arg1);
				return;
			case 1026:
				detailcanset_particles(arg1);
				return;
			case 1027:
				char_tolowercase(arg1);
				return;
			case 1028:
				TwitchCommands.ttv_webcam_getcap_byuniqueid(arg1);
				return;
			case 1029:
				if_setonmouseleave(arg1);
				return;
			case 1030:
				os_islinux(arg1);
				return;
			case 1031:
				TwitchCommands.ttv_stream_getquality(arg1);
				return;
			case 1032:
				shop_requestdata(arg1);
				return;
			case 1033:
				worldmap_3dview_getloddistance(arg1);
				return;
			case 1034:
				cc_setparam(arg1);
				return;
			case 1035:
				friend_getnotes(arg1);
				return;
			case 1036:
				player_group_get_create_seconds_to_now(arg1);
				return;
			case 1037:
				if_setaspect(arg1);
				return;
			case 1038:
				detailget_groundblending(arg1);
				return;
			case 1039:
				togglebit(arg1);
				return;
			case 1040:
				if_getmodelxof(arg1);
				return;
			case 1041:
				if_hassub(arg1);
				return;
			case 1042:
				if_setposition(arg1);
				return;
			case 1043:
				writeconsole(arg1);
				return;
			case 1044:
				telemetry_is_grid_processor_set(arg1);
				return;
			case 1045:
				preload_progress(arg1);
				return;
			case 1046:
				activeclanchannel_getsorteduserslot(arg1);
				return;
			case 1047:
				quit(arg1);
				return;
			case 1048:
				window_getinsets(arg1);
				return;
			case 1049:
				QuestCommands.quest_finished(arg1);
				return;
			case 1050:
				if_setobject_wearcol_nonum(arg1);
				return;
			case 1051:
				cam_removeroof(arg1);
				return;
			case 1052:
				cc_set2dangle(arg1);
				return;
			case 1053:
				cc_setondragcomplete(arg1);
				return;
			case 1054:
				if_debug_getopenifcount(arg1);
				return;
			case 1055:
				QuestCommands.quest_questreq_count(arg1);
				return;
			case 1056:
				stockmarket_isofferstable(arg1);
				return;
			case 1057:
				cc_setonclantransmit(arg1);
				return;
			case 1058:
				mec_text(arg1);
				return;
			case 1059:
				if_setobject_wearcol_alwaysnum(arg1);
				return;
			case 1060:
				has_nxt(arg1);
				return;
			case 1061:
				detail_hardshadows(arg1);
				return;
			case 1062:
				activeclanchannel_kickuser(arg1);
				return;
			case 1063:
				worldlist_specific_thisworld(arg1);
				return;
			case 1064:
				is_gamescreen_state(arg1);
				return;
			case 1065:
				cam2_setpositionmode(arg1);
				return;
			case 1066:
				branch_less_than_or_equals(arg1);
				return;
			case 1067:
				automatedtestflags(arg1);
				return;
			case 1068:
				detailcanset_vsync(arg1);
				return;
			case 1069:
				pow(arg1);
				return;
			case 1070:
				self_player_uid(arg1);
				return;
			case 1071:
				pop_int_local(arg1);
				return;
			case 1072:
				append(arg1);
				return;
			case 1073:
				autosetup_setlow(arg1);
				return;
			case 1074:
				chatcat_findsubcatbyshortcut(arg1);
				return;
			case 1075:
				detailcanmod_animdetail(arg1);
				return;
			case 1076:
				detail_grounddecor_on(arg1);
				return;
			case 1077:
				cc_setonsubchange(arg1);
				return;
			case 1078:
				sound_distancefocusfilter_setparams(arg1);
				return;
			case 1079:
				autosetup_setultra(arg1);
				return;
			case 1080:
				stockmarket_getofferprice(arg1);
				return;
			case 1081:
				stockmarket_isofferfinished(arg1);
				return;
			case 1082:
				cam2_setcollisionmode(arg1);
				return;
			case 1083:
				QuestCommands.quest_varpreq_desc(arg1);
				return;
			case 1084:
				coordlevel_fine(arg1);
				return;
			case 1085:
				inv_size(arg1);
				return;
			case 1086:
				if_debug_button9(arg1);
				return;
			case 1087:
				if_setplayerhead_self(arg1);
				return;
			case 1088:
				video_advert_has_finished(arg1);
				return;
			case 1089:
				create_availablerequest(arg1);
				return;
			case 1090:
				if_debug_button4(arg1);
				return;
			case 1091:
				detailget_fog_on(arg1);
				return;
			case 1092:
				detail_fog_on(arg1);
				return;
			case 1093:
				worldmap_getdisabletype(arg1);
				return;
			case 1094:
				db_listall(arg1);
				return;
			case 1095:
				is_targeted_entity(arg1);
				return;
			case 1096:
				cc_get2dangle(arg1);
				return;
			case 1097:
				can_run_java_client(arg1);
				return;
			case 1098:
				chatphrase_getautoresponsecount(arg1);
				return;
			case 1099:
				testbit(arg1);
				return;
			case 1100:
				char_isalphanumeric(arg1);
				return;
			case 1101:
				coordx(arg1);
				return;
			case 1102:
				friend_test(arg1);
				return;
			case 1103:
				long_branch_less_than_or_equals(arg1);
				return;
			case 1104:
				cc_setmodellighting(arg1);
				return;
			case 1105:
				cam_movealong(arg1);
				return;
			case 1106:
				cam2_setlookatpoint_point(arg1);
				return;
			case 1107:
				cc_setdragdeadtime(arg1);
				return;
			case 1108:
				worldmap_listelement_start(arg1);
				return;
			case 1109:
				cc_setontimer(arg1);
				return;
			case 1110:
				oc_findrestart(arg1);
				return;
			case 1111:
				cc_setonmouserepeat(arg1);
				return;
			case 1112:
				if_setnpchead(arg1);
				return;
			case 1113:
				activeclanchannel_find_listened(arg1);
				return;
			case 1114:
				if_settext(arg1);
				return;
			case 1115:
				chatphrase_getdynamiccommand(arg1);
				return;
			case 1116:
				detailcanset_buildarea(arg1);
				return;
			case 1117:
				cc_setonclickrepeat(arg1);
				return;
			case 1118:
				detail_drawdistance(arg1);
				return;
			case 1119:
				if_getscrollx(arg1);
				return;
			case 1120:
				cc_triggerop(arg1);
				return;
			case 1121:
				detailcanmod_dof(arg1);
				return;
			case 1122:
				branch_greater_than_or_equals(arg1);
				return;
			case 1123:
				if_getscrollheight(arg1);
				return;
			case 1124:
				cc_setscrollpos(arg1);
				return;
			case 1125:
				worldlist_switch(arg1);
				return;
			case 1126:
				enum_getreversecount_string(arg1);
				return;
			case 1127:
				cam2_setsnapdistances(arg1);
				return;
			case 1128:
				TwitchCommands.ttv_login_getstate(arg1);
				return;
			case 1129:
				cc_setongamepadbutton(arg1);
				return;
			case 1130:
				if_setonfriendtransmit(arg1);
				return;
			case 1131:
				if_getinvobject(arg1);
				return;
			case 1132:
				cc_settextfont(arg1);
				return;
			case 1133:
				cam2_setpositionmaxspeed_axis(arg1);
				return;
			case 1134:
				playerdemo(arg1);
				return;
			case 1135:
				cam2_setlookatorientation_xmovement(arg1);
				return;
			case 1136:
				comlevel_active(arg1);
				return;
			case 1137:
				if_setmodeltint(arg1);
				return;
			case 1138:
				if_get2dangle(arg1);
				return;
			case 1139:
				cc_getmodelxof(arg1);
				return;
			case 1140:
				TwitchCommands.ttv_stream_getviewers(arg1);
				return;
			case 1141:
				clanforumqfc_tostring(arg1);
				return;
			case 1142:
				interpolate(arg1);
				return;
			case 1143:
				if_setpausetext(arg1);
				return;
			case 1144:
				return;
			case 1145:
				create_setunder13(arg1);
				return;
			case 1146:
				oc_iop(arg1);
				return;
			case 1147:
				worldmap_getdisableelements(arg1);
				return;
			case 1148:
				cc_gettrans(arg1);
				return;
			case 1149:
				friend_getworldname(arg1);
				return;
			case 1150:
				QuestCommands.quest_statreq_stat(arg1);
				return;
			case 1151:
				sound_vorbis_rate(arg1);
				return;
			case 1152:
				cc_setretex(arg1);
				return;
			case 1153:
				detailget_recommendeddiskcachesize(arg1);
				return;
			case 1154:
				detailcanset_hardshadows(arg1);
				return;
			case 1155:
				if_getlayer(arg1);
				return;
			case 1156:
				affinedclansettings_addbanned_fromchannel(arg1);
				return;
			case 1157:
				TwitchCommands.ttv_stream_setsmoothresize(arg1);
				return;
			case 1158:
				oc_cost(arg1);
				return;
			case 1159:
				player_group_get_max_size(arg1);
				return;
			case 1160:
				if_setmodel(arg1);
				return;
			case 1161:
				shader_preload_percent(arg1);
				return;
			case 1162:
				lc_param(arg1);
				return;
			case 1163:
				if_setobject_wearcol(arg1);
				return;
			case 1164:
				telemetry_get_grid_value(arg1);
				return;
			case 1165:
				activeclanchannel_find_affined(arg1);
				return;
			case 1166:
				method484(arg1);
				return;
			case 1167:
				_switch(arg1);
				return;
			case 1168:
				chat_getnextuid(arg1);
				return;
			case 1169:
				activeclansettings_getranklootshare(arg1);
				return;
			case 1170:
				detailcanset_gamerenderscale(arg1);
				return;
			case 1171:
				if_setparam_int(arg1);
				return;
			case 1172:
				cc_settextantimacro(arg1);
				return;
			case 1173:
				date_runeday(arg1);
				return;
			case 1174:
				cc_setondrag(arg1);
				return;
			case 1175:
				worldmap_getdisabletextsize(arg1);
				return;
			case 1176:
				autosetup_setmin(arg1);
				return;
			case 1177:
				if_setclickmask(arg1);
				return;
			case 1178:
				if_debug_getservertriggers(arg1);
				return;
			case 1179:
				get_active_minimenu_entry(arg1);
				return;
			case 1180:
				sin_deg(arg1);
				return;
			case 1181:
				atan2_deg(arg1);
				return;
			case 1182:
				telemetry_is_row_pinned(arg1);
				return;
			case 1183:
				oc_wearpos3(arg1);
				return;
			case 1184:
				QuestCommands.quest_varpreq_met(arg1);
				return;
			case 1185:
				userflowflags(arg1);
				return;
			case 1186:
				cam2_getlookatmode(arg1);
				return;
			case 1187:
				detailget_waterdetail_high(arg1);
				return;
			case 1188:
				detail_musicvol(arg1);
				return;
			case 1189:
				if_setoptkeyignoreheld(arg1);
				return;
			case 1190:
				method3564(arg1);
				return;
			case 1191:
				method5893(arg1);
				return;
			case 1192:
				cc_setswipeunknown2(arg1);
				return;
			case 1193:
				cc_getmodel(arg1);
				return;
			case 1194:
				friend_is_referrer(arg1);
				return;
			case 1195:
				if_debug_getcomname(arg1);
				return;
			case 1196:
				notify_accountcreated(arg1);
				return;
			case 1197:
				cc_npc_setcustomrecol(arg1);
				return;
			case 1198:
				cc_setmodelorthog(arg1);
				return;
			case 1199:
				openurlraw(arg1);
				return;
			case 1200:
				chat_sendpublic(arg1);
				return;
			case 1201:
				if_setonmisctransmit(arg1);
				return;
			case 1202:
				inv_getnum(arg1);
				return;
			case 1203:
				player_group_member_get_team(arg1);
				return;
			case 1204:
				cc_resetmodellighting(arg1);
				return;
			case 1205:
				detailcanset_lightingquality(arg1);
				return;
			case 1206:
				detail_shadows(arg1);
				return;
			case 1207:
				QuestCommands.quest_statreq_met(arg1);
				return;
			case 1208:
				QuestCommands.quest_varpreq_count(arg1);
				return;
			case 1209:
				notifications_sendlocal(arg1);
				return;
			case 1210:
				login_disallowtrigger(arg1);
				return;
			case 1211:
				login_accountappeal(arg1);
				return;
			case 1212:
				telemetry_get_row_id(arg1);
				return;
			case 1213:
				pop_int_discard(arg1);
				return;
			case 1214:
				coord_gridtofine(arg1);
				return;
			case 1215:
				basematerial(arg1);
				return;
			case 1216:
				playermodlevel(arg1);
				return;
			case 1217:
				oc_id(arg1);
				return;
			case 1218:
				method9271(arg1);
				return;
			case 1219:
				TwitchCommands.ttv_livestreams_getstream_next(arg1);
				return;
			case 1220:
				cc_setonop(arg1);
				return;
			case 1221:
				shop_getindexforcategoryid(arg1);
				return;
			case 1222:
				worldmap_3dview_disable(arg1);
				return;
			case 1223:
				clanprofile_find(arg1);
				return;
			case 1224:
				if_set2dangle(arg1);
				return;
			case 1225:
				get_displayname_withextras(arg1);
				return;
			case 1226:
				if_setonplayergroupvarptransmit(arg1);
				return;
			case 1227:
				if_setscrollpos(arg1);
				return;
			case 1228:
				cc_setonhold(arg1);
				return;
			case 1229:
				get_entity_overlay_height(arg1);
				return;
			case 1230:
				if_npc_setcustomretex(arg1);
				return;
			case 1231:
				worldmap_jumptosourcecoord_instant(arg1);
				return;
			case 1232:
				detail_interfacescale(arg1);
				return;
			case 1233:
				db_find_refine(arg1);
				return;
			case 1234:
				cam2_setpositionentity_player(arg1);
				return;
			case 1235:
				detail_speechvol(arg1);
				return;
			case 1236:
				cam2_setpositionacceleration(arg1);
				return;
			case 1237:
				cc_setopkey(arg1);
				return;
			case 1238:
				worldmap_disableelementcategory(arg1);
				return;
			case 1239:
				stat(arg1);
				return;
			case 1240:
				player_group_member_get_same_world_var(arg1);
				return;
			case 1241:
				method6023(arg1);
				return;
			case 1242:
				array_sort(arg1);
				return;
			case 1243:
				activeclanchannel_getranktalk(arg1);
				return;
			case 1244:
				cc_delete(arg1);
				return;
			case 1245:
				autosetup_dosetup(arg1);
				return;
			case 1246:
				cc_getfontgraphic(arg1);
				return;
			case 1247:
				method4373(arg1);
				return;
			case 1248:
				method7233(arg1);
				return;
			case 1249:
				TwitchCommands.ttv_webcam_start(arg1);
				return;
			case 1250:
				cc_setlinkactiveclanchannel(arg1);
				return;
			case 1251:
				cc_setscrollsize(arg1);
				return;
			case 1252:
				oc_unshard(arg1);
				return;
			case 1253:
				method4065(arg1);
				return;
			case 1254:
				cam2_setlookatacceleration_axis(arg1);
				return;
			case 1255:
				detailcanmod_grounddecor(arg1);
				return;
			case 1256:
				coordy_fine(arg1);
				return;
			case 1257:
				affiliate(arg1);
				return;
			case 1258:
				cam_inc_y(arg1);
				return;
			case 1259:
				friend_setnotes(arg1);
				return;
			case 1260:
				QuestCommands.quest_getmembers(arg1);
				return;
			case 1261:
				activeclanchannel_getrankkick(arg1);
				return;
			case 1262:
				if_setontargetleave(arg1);
				return;
			case 1263:
				formatminimenu(arg1);
				return;
			case 1264:
				getdefaultwindowmode(arg1);
				return;
			case 1265:
				if_npc_setcustombodymodel(arg1);
				return;
			case 1266:
				chat_lastuid(arg1);
				return;
			case 1267:
				marketing_sendevent(arg1);
				return;
			case 1268:
				sound_vorbis_volume(arg1);
				return;
			case 1269:
				detail_spotshadows_on(arg1);
				return;
			case 1270:
				detailcanset_shadowquality(arg1);
				return;
			case 1271:
				detail_bloom(arg1);
				return;
			case 1272:
				clientclock(arg1);
				return;
			case 1273:
				oc_category(arg1);
				return;
			case 1274:
				QuestCommands.quest_questreq_met(arg1);
				return;
			case 1275:
				os_isandroid(arg1);
				return;
			case 1276:
				worldmap_getsourceposition(arg1);
				return;
			case 1277:
				method4422(arg1);
				return;
			case 1278:
				if_npc_setcustombodymodel_transformed(arg1);
				return;
			case 1279:
				cc_setoninvtransmit(arg1);
				return;
			case 1280:
				detailget_diskcachesize(arg1);
				return;
			case 1281:
				activeclansettings_getaffinedjoinruneday(arg1);
				return;
			case 1282:
				chatphrase_getdynamiccommandcount(arg1);
				return;
			case 1283:
				player_group_member_is_online(arg1);
				return;
			case 1284:
				detail_brightness(arg1);
				return;
			case 1285:
				cc_setopcursor(arg1);
				return;
			case 1286:
				long_branch_less_than(arg1);
				return;
			case 1287:
				activeclanchannel_getclanname(arg1);
				return;
			case 1288:
				notifications_opensettings(arg1);
				return;
			case 1289:
				get_mousex(arg1);
				return;
			case 1290:
				login_resetreply(arg1);
				return;
			case 1291:
				if_setonvartransmit(arg1);
				return;
			case 1292:
				method8382(arg1);
				return;
			case 1293:
				cc_setopkeyignoreheld(arg1);
				return;
			case 1294:
				login_disallowresult(arg1);
				return;
			case 1295:
				userdetail_lobby_recoveryday(arg1);
				return;
			case 1296:
				worldmap_jumptodisplaycoord_instant(arg1);
				return;
			case 1297:
				detailget_interfacescale(arg1);
				return;
			case 1298:
				chatphrase_find(arg1);
				return;
			case 1299:
				getbit_range(arg1);
				return;
			case 1300:
				cc_setop(arg1);
				return;
			case 1301:
				clan_getchatusername_unfiltered(arg1);
				return;
			case 1302:
				TwitchCommands.ttv_stream_settitle(arg1);
				return;
			case 1303:
				worldmap_listelement_next(arg1);
				return;
			case 1304:
				cam2_setlookatacceleration(arg1);
				return;
			case 1305:
				cam2_getpositionentity_angleoffsets(arg1);
				return;
			case 1306:
				marketing_init(arg1);
				return;
			case 1307:
				if_npc_setcustomheadmodel(arg1);
				return;
			case 1308:
				invother_getobj(arg1);
				return;
			case 1309:
				worldmap_setmap_coord(arg1);
				return;
			case 1310:
				player_group_get_displayname(arg1);
				return;
			case 1311:
				cc_setonplayergrouptransmit(arg1);
				return;
			case 1312:
				chatcat_getsubcatshortcut(arg1);
				return;
			case 1313:
				login_inprogress(arg1);
				return;
			case 1314:
				cc_setoncamfinished(arg1);
				return;
			case 1315:
				if_setontargetenter(arg1);
				return;
			case 1316:
				if_get_gamescreen(arg1);
				return;
			case 1317:
				db_getrowtable(arg1);
				return;
			case 1318:
				detail_texturing(arg1);
				return;
			case 1319:
				lobby_enterlobbyreply(arg1);
				return;
			case 1320:
				TwitchCommands.ttv_chat_getstate(arg1);
				return;
			case 1321:
				cc_getwidth(arg1);
				return;
			case 1322:
				cc_resetlinkplayer(arg1);
				return;
			case 1323:
				cc_getscrollx(arg1);
				return;
			case 1324:
				targetmode_cancel(arg1);
				return;
			case 1325:
				method3039(arg1);
				return;
			case 1326:
				clan_getchatuserworld(arg1);
				return;
			case 1327:
				cc_setnpcmodel(arg1);
				return;
			case 1328:
				branch_less_than(arg1);
				return;
			case 1329:
				chat_getprevuid(arg1);
				return;
			case 1330:
				friend_getworldflags(arg1);
				return;
			case 1331:
				ignore_add_temp(arg1);
				return;
			case 1332:
				cc_setonhorizontalswipe(arg1);
				return;
			case 1333:
				TwitchCommands.ttv_stream_getstate(arg1);
				return;
			case 1334:
				fullscreen_exit(arg1);
				return;
			case 1335:
				detail_skydetail(arg1);
				return;
			case 1336:
				player_group_is_members_only(arg1);
				return;
			case 1337:
				playercountry(arg1);
				return;
			case 1338:
				sound_group_stop(arg1);
				return;
			case 1339:
				activeclansettings_getrankkick(arg1);
				return;
			case 1340:
				detail_customcursors(arg1);
				return;
			case 1341:
				if_settextshadow(arg1);
				return;
			case 1342:
				player_group_member_get_last_seen_node_id(arg1);
				return;
			case 1343:
				activechatphrase_send(arg1);
				return;
			case 1344:
				QuestCommands.quest_getname(arg1);
				return;
			case 1345:
				string_distance(arg1);
				return;
			case 1346:
				telemetry_get_group_index(arg1);
				return;
			case 1347:
				cam2_resetsnapdistances(arg1);
				return;
			case 1348:
				detail_toolkit_default(arg1);
				return;
			case 1349:
				_return(arg1);
				return;
			case 1350:
				has_html5(arg1);
				return;
			case 1351:
				push_varbit(arg1);
				return;
			case 1352:
				cc_setswipedeadtime(arg1);
				return;
			case 1353:
				chatphrase_getdynamiccommandparam_enum(arg1);
				return;
			case 1354:
				detailcanmod_waterdetail(arg1);
				return;
			case 1355:
				cc_resume_pausebutton(arg1);
				return;
			case 1356:
				detailcanset_maxbackgroundfps(arg1);
				return;
			case 1357:
				coordx_fine(arg1);
				return;
			case 1358:
				if_setonclick(arg1);
				return;
			case 1359:
				char_isprintable(arg1);
				return;
			case 1360:
				detail_shadowquality(arg1);
				return;
			case 1361:
				force_interface_drag(arg1);
				return;
			case 1362:
				runweight_visible(arg1);
				return;
			case 1363:
				detailcanmod_particles(arg1);
				return;
			case 1364:
				oc_icursor(arg1);
				return;
			case 1365:
				if_clearops(arg1);
				return;
			case 1366:
				mec_sprite(arg1);
				return;
			case 1367:
				autosetup_setcustom(arg1);
				return;
			case 1368:
				worldmap_setcategorypriority(arg1);
				return;
			case 1369:
				clan_getchatcount(arg1);
				return;
			case 1370:
				cam2_setlookatmaxspeed(arg1);
				return;
			case 1371:
				cc_setlinkplayergroup(arg1);
				return;
			case 1372:
				cam2_legacycam_ready(arg1);
				return;
			case 1373:
				text_switch(arg1);
				return;
			case 1374:
				detail_animdetail(arg1);
				return;
			case 1375:
				random(arg1);
				return;
			case 1376:
				push_constant_string(arg1);
				return;
			case 1377:
				cc_getcolour(arg1);
				return;
			case 1378:
				cam_followcoord(arg1);
				return;
			case 1379:
				cam_setfollowheight(arg1);
				return;
			case 1380:
				append_char(arg1);
				return;
			case 1381:
				detailcanmod_orthographic(arg1);
				return;
			case 1382:
				resume_namedialog(arg1);
				return;
			case 1383:
				chat_gethistory_bytypeandline(arg1);
				return;
			case 1384:
				cam2_setpositionspline_spline(arg1);
				return;
			case 1385:
				userdetail_lobby_emailstatus(arg1);
				return;
			case 1386:
				method6079(arg1);
				return;
			case 1387:
				if_setswipedeadtime(arg1);
				return;
			case 1388:
				cc_settargetcursors(arg1);
				return;
			case 1389:
				player_group_member_is_member(arg1);
				return;
			case 1390:
				seq_param(arg1);
				return;
			case 1391:
				if_setlinedirection(arg1);
				return;
			case 1392:
				ignore_getslotfromname(arg1);
				return;
			case 1393:
				emoji_enable_auto_chatline(arg1);
				return;
			case 1394:
				cc_getmodelangle_y(arg1);
				return;
			case 1395:
				detailcanset_volumetriclighting(arg1);
				return;
			case 1396:
				sound_mixbuss_setlevel(arg1);
				return;
			case 1397:
				ignore_test(arg1);
				return;
			case 1398:
				detailget_spotshadows_on(arg1);
				return;
			case 1399:
				cc_setobject_alwaysnum(arg1);
				return;
			case 1400:
				cc_npc_setcustombodymodel(arg1);
				return;
			case 1401:
				method4048(arg1);
				return;
			case 1402:
				detailcanmod_reflections(arg1);
				return;
			case 1403:
				long_branch_equals(arg1);
				return;
			case 1404:
				create_get_email(arg1);
				return;
			case 1405:
				method253(arg1);
				return;
			case 1406:
				detailget_vsync(arg1);
				return;
			case 1407:
				detailget_lightdetail_high(arg1);
				return;
			case 1408:
				autosetup_setmedium(arg1);
				return;
			case 1409:
				if_setobject_nonum(arg1);
				return;
			case 1410:
				chatcat_getphrase(arg1);
				return;
			case 1411:
				ignore_setnotes(arg1);
				return;
			case 1412:
				get_npc_stat(arg1);
				return;
			case 1413:
				cc_clearscripthooks(arg1);
				return;
			case 1414:
				userdetail_quickchat(arg1);
				return;
			case 1415:
				userdetail_lobby_loyalty_balance(arg1);
				return;
			case 1416:
				tostring_localised(arg1);
				return;
			case 1417:
				cc_setparam_int(arg1);
				return;
			case 1418:
				cam_moveto(arg1);
				return;
			case 1419:
				branch_equals(arg1);
				return;
			case 1420:
				friend_setrank(arg1);
				return;
			case 1421:
				detailcanset_grounddecor(arg1);
				return;
			case 1422:
				cam2_setspringproperties(arg1);
				return;
			case 1423:
				get_second_minimenu_entry(arg1);
				return;
			case 1424:
				detailget_hardshadows(arg1);
				return;
			case 1425:
				detailget_loginvol(arg1);
				return;
			case 1426:
				cam2_setlookatspline_spline(arg1);
				return;
			case 1427:
				inv_stockbase(arg1);
				return;
			case 1428:
				TwitchCommands.ttv_livestreams_getstream_start(arg1);
				return;
			case 1429:
				lobby_leavelobby(arg1);
				return;
			case 1430:
				cam_modeisfollowplayer(arg1);
				return;
			case 1431:
				cc_getparentlayer(arg1);
		}
	}

	@ObfuscatedName("ahd.a(Lyf;B)V")
	public static final void push_constant_int(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8236[arg0.field8220];
	}

	@ObfuscatedName("pu.g(Lyf;B)V")
	public static final void push_var(ClientScriptState arg0) {
		VarType var1 = (VarType) arg0.field8239.field12366[arg0.field8220];
		VarDomain var2 = (VarDomain) (arg0.field8236[arg0.field8220] == 0 ? arg0.field8234.get(var1.domain) : arg0.field8233.get(var1.domain));
		BaseVarType var3 = var1.dataType.getVarBaseType();
		if (BaseVarType.INTEGER == var3) {
			arg0.field8216[++arg0.field8226 - 1] = var2.getVarValueInt(var1);
		} else if (BaseVarType.field4837 == var3) {
			arg0.field8224[++arg0.field8238 - 1] = var2.getVarValueLong(var1);
		} else if (BaseVarType.field4836 == var3) {
			try {
				String var4 = (String) var2.getVarValue(var1);
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
	public static final void pop_var(ClientScriptState arg0) {
		VarType var1 = (VarType) arg0.field8239.field12366[arg0.field8220];
		VarDomain var2 = (VarDomain) (arg0.field8236[arg0.field8220] == 0 ? arg0.field8234.get(var1.domain) : arg0.field8233.get(var1.domain));
		BaseVarType var3 = var1.dataType.getVarBaseType();
		if (BaseVarType.INTEGER == var3) {
			if (VarDomainType.CLIENT == var1.domain) {
				DelayedStateChange.method3607(var1);
			}
			var2.setVarValueInt(var1, arg0.field8216[--arg0.field8226]);
		} else if (BaseVarType.field4837 == var3) {
			var2.setVarValueLong(var1, arg0.field8224[--arg0.field8238]);
		} else if (BaseVarType.field4836 == var3) {
			if (VarDomainType.CLIENT == var1.domain) {
				DelayedStateChange.method14066(var1);
			}
			var2.setVarValue(var1, arg0.field8218[--arg0.field8211]);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nj.j(Lyf;I)V")
	public static final void push_constant_string(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8239.field12366[arg0.field8220];
	}

	@ObfuscatedName("zz.t(Lyf;I)V")
	public static final void branch(ClientScriptState arg0) {
		arg0.field8220 += arg0.field8236[arg0.field8220];
	}

	@ObfuscatedName("ie.ae(Lyf;B)V")
	public static final void branch_not(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] != arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("acv.ag(Lyf;I)V")
	public static final void branch_equals(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] == arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("vo.ah(Lyf;I)V")
	public static final void branch_less_than(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] < arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("qn.al(Lyf;S)V")
	public static final void branch_greater_than(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] > arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("vr.ac(Lyf;B)V")
	public static final void _return(ClientScriptState arg0) {
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
	public static final void push_varbit(ClientScriptState arg0) {
		VarBitType var1 = (VarBitType) arg0.field8239.field12366[arg0.field8220];
		VarDomain var2 = (VarDomain) (arg0.field8236[arg0.field8220] == 0 ? arg0.field8234.get(var1.baseVar.domain) : arg0.field8233.get(var1.baseVar.domain));
		arg0.field8216[++arg0.field8226 - 1] = var2.getVarBitValue(var1);
	}

	@ObfuscatedName("ace.aw(Lyf;I)V")
	public static final void pop_varbit(ClientScriptState arg0) throws VarBitOverflowException {
		VarBitType var1 = (VarBitType) arg0.field8239.field12366[arg0.field8220];
		VarDomain var2 = (VarDomain) (arg0.field8236[arg0.field8220] == 0 ? arg0.field8234.get(var1.baseVar.domain) : arg0.field8233.get(var1.baseVar.domain));
		try {
			var2.setVarbitValue(var1, arg0.field8216[--arg0.field8226]);
		} catch (VarBitOverflowException var4) {
			if (!(var2 instanceof VarPlayerDomain)) {
				throw var4;
			}
			method5077(arg0, ClientScriptCommand.field5143, var4, "VO");
		}
	}

	@ObfuscatedName("ng.as(Lyf;I)V")
	public static final void branch_less_than_or_equals(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] <= arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("gh.at(Lyf;I)V")
	public static final void branch_greater_than_or_equals(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		if (arg0.field8216[arg0.field8226] >= arg0.field8216[arg0.field8226 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("aat.ad(Lyf;I)V")
	public static final void push_int_local(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8213[arg0.field8236[arg0.field8220]];
	}

	@ObfuscatedName("dr.am(Lyf;B)V")
	public static final void pop_int_local(ClientScriptState arg0) {
		arg0.field8213[arg0.field8236[arg0.field8220]] = arg0.field8216[--arg0.field8226];
	}

	@ObfuscatedName("er.au(Lyf;I)V")
	public static final void push_string_local(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8212[arg0.field8236[arg0.field8220]];
	}

	@ObfuscatedName("hw.ar(Lyf;B)V")
	public static final void pop_string_local(ClientScriptState arg0) {
		arg0.field8212[arg0.field8236[arg0.field8220]] = arg0.field8218[--arg0.field8211];
	}

	@ObfuscatedName("ea.ap(Lyf;B)V")
	public static final void join_string(ClientScriptState arg0) {
		int var1 = arg0.field8236[arg0.field8220];
		arg0.field8211 -= var1;
		String var2 = StringTools.method9007(arg0.field8218, arg0.field8211, var1);
		arg0.field8218[++arg0.field8211 - 1] = var2;
	}

	@ObfuscatedName("xh.aq(Lyf;B)V")
	public static final void pop_int_discard(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("wi.ax(Lyf;I)V")
	public static final void pop_string_discard(ClientScriptState arg0) {
		arg0.field8211--;
	}

	@ObfuscatedName("amy.av(Lyf;I)V")
	public static final void gosub_with_params(ClientScriptState arg0) {
		int var1 = arg0.field8236[arg0.field8220];
		ClientScript var2 = ClientScriptHelpers.method5402(var1);
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
	public static final void define_array(ClientScriptState arg0) {
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
	public static final void push_array(ClientScriptState arg0, boolean arg1, boolean arg2) {
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
	public static final void pop_array(ClientScriptState arg0, boolean arg1) {
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
	public static final void _switch(ClientScriptState arg0) {
		IterableMap var1 = arg0.field8239.field12375[arg0.field8236[arg0.field8220]];
		IntWrapper var2 = (IntWrapper) var1.method14495((long) arg0.field8216[--arg0.field8226]);
		if (var2 != null) {
			arg0.field8220 += var2.field11442;
		}
	}

	@ObfuscatedName("o.az(Lyf;B)V")
	public static final void push_long_constant(ClientScriptState arg0) {
		arg0.field8224[++arg0.field8238 - 1] = (Long) arg0.field8239.field12366[arg0.field8220];
	}

	@ObfuscatedName("fg.aa(Lyf;I)V")
	public static final void pop_long_discard(ClientScriptState arg0) {
		arg0.field8238--;
	}

	@ObfuscatedName("el.af(Lyf;B)V")
	public static final void push_long_local(ClientScriptState arg0) {
		arg0.field8224[++arg0.field8238 - 1] = arg0.field8219[arg0.field8236[arg0.field8220]];
	}

	@ObfuscatedName("xd.ak(Lyf;B)V")
	public static final void pop_long_local(ClientScriptState arg0) {
		arg0.field8219[arg0.field8236[arg0.field8220]] = arg0.field8224[--arg0.field8238];
	}

	@ObfuscatedName("xj.an(Lyf;B)V")
	public static final void long_branch_not(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] != arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("kw.bf(Lyf;B)V")
	public static final void long_branch_equals(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] == arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("ajc.bl(Lyf;I)V")
	public static final void long_branch_less_than(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] < arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("qy.bk(Lyf;B)V")
	public static final void long_branch_greater_than(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] > arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("ue.bh(Lyf;B)V")
	public static final void long_branch_less_than_or_equals(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] <= arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("nk.bx(Lyf;I)V")
	public static final void long_branch_greater_than_or_equals(ClientScriptState arg0) {
		arg0.field8238 -= 2;
		if (arg0.field8224[arg0.field8238] >= arg0.field8224[arg0.field8238 + 1]) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("aiv.bd(Lyf;I)V")
	public static final void branch_if_true(ClientScriptState arg0) {
		if (arg0.field8216[--arg0.field8226] == 1) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("nr.bc(Lyf;I)V")
	public static final void branch_if_false(ClientScriptState arg0) {
		if (arg0.field8216[--arg0.field8226] == 0) {
			arg0.field8220 += arg0.field8236[arg0.field8220];
		}
	}

	@ObfuscatedName("qx.bi(Lyf;I)V")
	public static final void cc_create(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Component.method10202(var1);
		method5172(Component.field11725[var1 >>> 16], var1 & 0xFFFF, var2, var3, arg0.field8235, arg0);
	}

	@ObfuscatedName("iy.bn(Lyf;B)V")
	public static final void cc_delete(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		if (var1.field8242.field2183 != -1) {
			Component var2 = var1.method13790();
			var2.field2351[var1.field8242.field2183] = null;
			Client.method4616(var2);
		} else if (arg0.field8235) {
			throw new RuntimeException("");
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ab.bt(Lyf;I)V")
	public static final void cc_deleteall(ClientScriptState arg0) {
		Component var1 = Component.method10202(arg0.field8216[--arg0.field8226]);
		var1.field2351 = null;
		var1.field2349 = null;
		Client.method4616(var1);
	}

	@ObfuscatedName("y.bq(Lyf;I)V")
	public static final void cc_find(ClientScriptState arg0) {
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
	public static final void if_find(ClientScriptState arg0) {
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
	public static final void if_sendto(boolean arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		Component var3 = Component.method10202(var2);
		Interface var4 = Component.field11725[var2 >> 16];
		if (arg0) {
			method2962(var4, var3);
		} else {
			method4390(var4, var3);
		}
	}

	@ObfuscatedName("jd.be(ZLyf;I)V")
	public static final void cc_sendto(boolean arg0, ClientScriptState arg1) {
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
	public static final void if_resume_pausebutton(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_resume_pausebutton(var2, arg0);
	}

	@ObfuscatedName("nl.bu(Lyf;I)V")
	public static final void cc_resume_pausebutton(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_resume_pausebutton(var2, arg0);
	}

	@ObfuscatedName("tp.bw(Lhf;Lyf;I)V")
	public static final void cc_if_resume_pausebutton(Component arg0, ClientScriptState arg1) {
		if (Client.method17197(arg0).method17689() && Client.field11056 == null) {
			Client.method612(arg0.field2158, arg0.field2183);
			Client.field11056 = Component.method16682(arg0.field2158, arg0.field2183);
			Client.method4616(Client.field11056);
		}
	}

	@ObfuscatedName("aqc.bo(Lyf;I)V")
	public static final void baseidkit(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Client.field4490.field12061 == null) {
			return;
		}
		for (int var3 = 0; var3 < IDKType.field2951.length; var3++) {
			if (IDKType.field2951[var3] == var1) {
				Client.field4490.field12061.method10114(var3, var2, Client.field2628);
				return;
			}
		}
		for (int var4 = 0; var4 < IDKType.field2959.length; var4++) {
			if (IDKType.field2959[var4] == var1) {
				Client.field4490.field12061.method10114(var4, var2, Client.field2628);
				return;
			}
		}
	}

	@ObfuscatedName("wm.bz(Lyf;I)V")
	public static final void basecolour(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Client.field4490.field12061 != null) {
			Client.field4490.field12061.method10115(var1, var2);
		}
	}

	@ObfuscatedName("we.bv(Lyf;B)V")
	public static final void basematerial(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Client.field4490.field12061 != null) {
			Client.field4490.field12061.method10142(var1, var2);
		}
	}

	@ObfuscatedName("ul.br(Lyf;I)V")
	public static final void setgender(ClientScriptState arg0) {
		boolean var1 = arg0.field8216[--arg0.field8226] != 0;
		if (Client.field4490.field12061 != null) {
			Client.field4490.field12061.method10141(var1);
		}
	}

	@ObfuscatedName("ik.bg(Lyf;S)V")
	public static final void setobj(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Client.field4490.field12061 != null) {
			Client.field4490.field12061.method10112(var1, var2, Client.field1842);
		}
	}

	@ObfuscatedName("kw.ba(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setposition(Component arg0, Interface arg1, ClientScriptState arg2) {
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
		Client.method4616(arg0);
		Client.method2103(arg1, arg0);
		if (arg0.field2184 == 0) {
			Client.method8329(arg1, arg0, false);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method16433(arg0.field2158);
		}
	}

	@ObfuscatedName("ig.bp(Lyf;B)V")
	public static final void if_setposition(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setposition(var2, var3, arg0);
	}

	@ObfuscatedName("sh.bj(Lyf;I)V")
	public static final void cc_setposition(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setposition(var2, var3, arg0);
	}

	@ObfuscatedName("ge.bs(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setsize(Component arg0, Interface arg1, ClientScriptState arg2) {
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
		Client.method4616(arg0);
		Client.method2103(arg1, arg0);
		if (arg0.field2184 == 0) {
			Client.method8329(arg1, arg0, false);
		}
	}

	@ObfuscatedName("aq.cl(Lyf;B)V")
	public static final void if_setsize(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setsize(var2, var3, arg0);
	}

	@ObfuscatedName("hp.cg(Lyf;I)V")
	public static final void cc_setsize(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setsize(var2, var3, arg0);
	}

	@ObfuscatedName("ju.ce(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_sethide(Component arg0, Interface arg1, ClientScriptState arg2) {
		boolean var3 = arg2.field8216[--arg2.field8226] == 1;
		if (arg0.field2201 != var3) {
			arg0.field2201 = var3;
			Client.method4616(arg0);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method10340(arg0.field2158);
		}
	}

	@ObfuscatedName("km.cu(Lyf;S)V")
	public static final void if_sethide(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_sethide(var2, var3, arg0);
	}

	@ObfuscatedName("ea.ci(Lyf;I)V")
	public static final void cc_sethide(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_sethide(var2, var3, arg0);
	}

	@ObfuscatedName("rz.cn(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setaspect(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		arg0.field2198 = arg2.field8216[arg2.field8226];
		arg0.field2199 = arg2.field8216[arg2.field8226 + 1];
		Client.method4616(arg0);
		Client.method2103(arg1, arg0);
		if (arg0.field2184 == 0) {
			Client.method8329(arg1, arg0, false);
		}
	}

	@ObfuscatedName("er.cv(Lyf;I)V")
	public static final void if_setaspect(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setaspect(var2, var3, arg0);
	}

	@ObfuscatedName("xt.cp(Lyf;I)V")
	public static final void cc_setaspect(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setaspect(var2, var3, arg0);
	}

	@ObfuscatedName("z.ca(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setnoclickthrough(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2205 = arg2.field8216[--arg2.field8226] == 1;
	}

	@ObfuscatedName("au.cx(Lyf;B)V")
	public static final void if_setnoclickthrough(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setnoclickthrough(var2, var3, arg0);
	}

	@ObfuscatedName("qf.cw(Lyf;I)V")
	public static final void cc_setnoclickthrough(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setnoclickthrough(var2, var3, arg0);
	}

	@ObfuscatedName("any.ct(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setscrollpos(Component arg0, Interface arg1, ClientScriptState arg2) {
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
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method1588(arg0.field2158);
		}
	}

	@ObfuscatedName("jk.cf(Lyf;I)V")
	public static final void if_setscrollpos(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setscrollpos(var2, var3, arg0);
	}

	@ObfuscatedName("dg.co(Lyf;I)V")
	public static final void cc_setscrollpos(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setscrollpos(var2, var3, arg0);
	}

	@ObfuscatedName("mj.cr(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setcolour(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2210 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method14870(arg0.field2158);
		}
	}

	@ObfuscatedName("aku.cm(Lyf;B)V")
	public static final void if_setcolour(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setcolour(var2, var3, arg0);
	}

	@ObfuscatedName("ir.cq(Lyf;I)V")
	public static final void cc_setcolour(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setcolour(var2, var3, arg0);
	}

	@ObfuscatedName("ch.ch(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setfill(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2263 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("cq.cb(Lyf;I)V")
	public static final void if_setfill(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setfill(var2, var3, arg0);
	}

	@ObfuscatedName("ajd.cs(Lyf;I)V")
	public static final void cc_setfill(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setfill(var2, var3, arg0);
	}

	@ObfuscatedName("hx.cy(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_settrans(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2212 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
	}

	@ObfuscatedName("ht.cc(Lyf;I)V")
	public static final void if_settrans(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settrans(var2, var3, arg0);
	}

	@ObfuscatedName("ky.cz(Lyf;I)V")
	public static final void cc_settrans(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settrans(var2, var3, arg0);
	}

	@ObfuscatedName("sv.ck(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setlinewid(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2156 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
	}

	@ObfuscatedName("iv.cj(Lyf;I)V")
	public static final void if_setlinewid(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setlinewid(var2, var3, arg0);
	}

	@ObfuscatedName("iw.cd(Lyf;I)V")
	public static final void cc_setlinewid(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setlinewid(var2, var3, arg0);
	}

	@ObfuscatedName("jx.dd(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setgraphic(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		arg0.field2334 = -1;
		if (arg0.field2215 != var3) {
			arg0.field2215 = var3;
			Client.method4616(arg0);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method7714(arg0.field2158);
		}
	}

	@ObfuscatedName("ka.dr(Lyf;I)V")
	public static final void if_setgraphic(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setgraphic(var2, var3, arg0);
	}

	@ObfuscatedName("qk.da(Lyf;B)V")
	public static final void cc_setgraphic(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setgraphic(var2, var3, arg0);
	}

	@ObfuscatedName("dd.dt(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_set2dangle(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2216 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
	}

	@ObfuscatedName("dc.do(Lyf;B)V")
	public static final void if_set2dangle(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_set2dangle(var2, var3, arg0);
	}

	@ObfuscatedName("nv.dz(Lyf;I)V")
	public static final void cc_set2dangle(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_set2dangle(var2, var3, arg0);
	}

	@ObfuscatedName("wq.dv(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settiling(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2217 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("amq.dm(Lyf;I)V")
	public static final void if_settiling(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settiling(var2, var3, arg0);
	}

	@ObfuscatedName("dy.dq(Lyf;I)V")
	public static final void cc_settiling(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settiling(var2, var3, arg0);
	}

	@ObfuscatedName("l.dc(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setmodel(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 1;
		arg0.field2294 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("xv.di(Lyf;B)V")
	public static final void if_setmodel(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmodel(var2, var3, arg0);
	}

	@ObfuscatedName("ui.dk(Lyf;I)V")
	public static final void cc_setmodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmodel(var2, var3, arg0);
	}

	@ObfuscatedName("sd.dn(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmodelangle(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 6;
		arg0.field2228 = arg2.field8216[arg2.field8226];
		arg0.field2316 = arg2.field8216[arg2.field8226 + 1];
		arg0.field2230 = arg2.field8216[arg2.field8226 + 2];
		arg0.field2231 = arg2.field8216[arg2.field8226 + 3];
		arg0.field2331 = arg2.field8216[arg2.field8226 + 4];
		arg0.field2272 = arg2.field8216[arg2.field8226 + 5];
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method2886(arg0.field2158);
			DelayedStateChange.method14792(arg0.field2158);
		}
	}

	@ObfuscatedName("xv.df(Lyf;I)V")
	public static final void if_setmodelangle(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmodelangle(var2, var3, arg0);
	}

	@ObfuscatedName("anv.dw(Lyf;I)V")
	public static final void cc_setmodelangle(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmodelangle(var2, var3, arg0);
	}

	@ObfuscatedName("yl.ds(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmodelanim(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		if (arg0.field2262 != var3) {
			if (var3 == -1) {
				arg0.field2170 = null;
			} else {
				if (arg0.field2170 == null) {
					arg0.field2170 = new InterfaceAnimationWrapper();
				}
				arg0.field2170.method14362(var3);
			}
			arg0.field2262 = var3;
			Client.method4616(arg0);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method10523(arg0.field2158);
		}
	}

	@ObfuscatedName("ajn.du(Lyf;B)V")
	public static final void if_setmodelanim(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmodelanim(var2, var3, arg0);
	}

	@ObfuscatedName("adn.dl(Lyf;I)V")
	public static final void cc_setmodelanim(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmodelanim(var2, var3, arg0);
	}

	@ObfuscatedName("db.dp(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setmodelorthog(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2239 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("agu.dy(Lyf;B)V")
	public static final void if_setmodelorthog(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmodelorthog(var2, var3, arg0);
	}

	@ObfuscatedName("ru.db(Lyf;I)V")
	public static final void cc_setmodelorthog(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmodelorthog(var2, var3, arg0);
	}

	@ObfuscatedName("dy.dh(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setmodeltint(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 4;
		arg0.field2240 = arg2.field8216[arg2.field8226];
		arg0.field2256 = arg2.field8216[arg2.field8226 + 1];
		arg0.field2203 = arg2.field8216[arg2.field8226 + 2];
		arg0.field2189 = arg2.field8216[arg2.field8226 + 3];
		Client.method4616(arg0);
	}

	@ObfuscatedName("xc.dx(Lyf;B)V")
	public static final void if_setmodeltint(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmodeltint(var2, var3, arg0);
	}

	@ObfuscatedName("gq.dg(Lyf;I)V")
	public static final void cc_setmodeltint(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmodeltint(var2, var3, arg0);
	}

	@ObfuscatedName("adg.de(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmodellighting(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 10;
		arg0.field2250 = true;
		arg0.field2248 = Math.max(Math.min(arg2.field8216[arg2.field8226], 2816), 0);
		arg0.field2251 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 1], 2816), 0);
		arg0.field2255 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 2], 2816), 0);
		int var3 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 3], 255), 0);
		int var4 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 4], 255), 0);
		int var5 = Math.max(Math.min(arg2.field8216[arg2.field8226 + 5], 255), 0);
		arg0.field2257 = var3 << 16 | var4 << 8 | var5;
		arg0.field2345 = arg2.field8216[arg2.field8226 + 6];
		arg0.field2252 = arg2.field8216[arg2.field8226 + 7];
		arg0.field2302 = arg2.field8216[arg2.field8226 + 8];
		arg0.field2258 = arg2.field8216[arg2.field8226 + 9];
		Client.method4616(arg0);
	}

	@ObfuscatedName("sd.dj(Lyf;B)V")
	public static final void if_setmodellighting(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmodellighting(var2, var3, arg0);
	}

	@ObfuscatedName("iq.eo(Lyf;I)V")
	public static final void cc_setmodellighting(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmodellighting(var2, var3, arg0);
	}

	@ObfuscatedName("gz.ey(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_resetmodellighting(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2250 = false;
		Client.method4616(arg0);
	}

	@ObfuscatedName("gr.eu(Lyf;I)V")
	public static final void if_resetmodellighting(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_resetmodellighting(var2, var3, arg0);
	}

	@ObfuscatedName("kj.ed(Lyf;I)V")
	public static final void cc_resetmodellighting(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_resetmodellighting(var2, var3, arg0);
	}

	@ObfuscatedName("fb.ee(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settext(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (!var3.equals(arg0.field2261)) {
			arg0.field2261 = var3;
			Client.method4616(arg0);
		}
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method16464(arg0.field2158);
		}
	}

	@ObfuscatedName("abo.es(Lyf;B)V")
	public static final void if_settext(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settext(var2, var3, arg0);
	}

	@ObfuscatedName("ef.ei(Lyf;B)V")
	public static final void cc_settext(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settext(var2, var3, arg0);
	}

	@ObfuscatedName("ft.el(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settextfont(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2287 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method7247(arg0.field2158);
		}
	}

	@ObfuscatedName("gt.ej(Lyf;I)V")
	public static final void if_settextfont(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settextfont(var2, var3, arg0);
	}

	@ObfuscatedName("ana.ep(Lyf;B)V")
	public static final void cc_settextfont(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settextfont(var2, var3, arg0);
	}

	@ObfuscatedName("hn.ev(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settextalign(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 3;
		arg0.field2223 = arg2.field8216[arg2.field8226];
		arg0.field2264 = arg2.field8216[arg2.field8226 + 1];
		arg0.field2229 = arg2.field8216[arg2.field8226 + 2];
		Client.method4616(arg0);
	}

	@ObfuscatedName("uo.ec(Lyf;I)V")
	public static final void if_settextalign(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settextalign(var2, var3, arg0);
	}

	@ObfuscatedName("dm.ek(Lyf;I)V")
	public static final void cc_settextalign(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settextalign(var2, var3, arg0);
	}

	@ObfuscatedName("yu.em(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settextshadow(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2265 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("is.eh(Lyf;I)V")
	public static final void if_settextshadow(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settextshadow(var2, var3, arg0);
	}

	@ObfuscatedName("xh.eq(Lyf;S)V")
	public static final void cc_settextshadow(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settextshadow(var2, var3, arg0);
	}

	@ObfuscatedName("if.eg(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_settextantimacro(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2267 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method9793(arg0.field2158);
		}
	}

	@ObfuscatedName("xm.ez(Lyf;I)V")
	public static final void if_settextantimacro(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settextantimacro(var2, var3, arg0);
	}

	@ObfuscatedName("sx.ef(Lyf;I)V")
	public static final void cc_settextantimacro(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settextantimacro(var2, var3, arg0);
	}

	@ObfuscatedName("jq.et(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setoutline(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2218 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
	}

	@ObfuscatedName("va.ea(Lyf;I)V")
	public static final void if_setoutline(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setoutline(var2, var3, arg0);
	}

	@ObfuscatedName("ax.ew(Lyf;I)V")
	public static final void cc_setoutline(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setoutline(var2, var3, arg0);
	}

	@ObfuscatedName("wq.er(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setgraphicshadow(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2219 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
	}

	@ObfuscatedName("sj.en(Lyf;I)V")
	public static final void if_setgraphicshadow(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setgraphicshadow(var2, var3, arg0);
	}

	@ObfuscatedName("ka.eb(Lyf;I)V")
	public static final void cc_setgraphicshadow(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setgraphicshadow(var2, var3, arg0);
	}

	@ObfuscatedName("uf.ex(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setvflip(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2220 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("jv.fg(Lyf;I)V")
	public static final void if_setvflip(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setvflip(var2, var3, arg0);
	}

	@ObfuscatedName("ys.fm(Lyf;I)V")
	public static final void cc_setvflip(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setvflip(var2, var3, arg0);
	}

	@ObfuscatedName("dh.fu(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_sethflip(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2213 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("ib.fs(Lyf;B)V")
	public static final void if_sethflip(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_sethflip(var2, var3, arg0);
	}

	@ObfuscatedName("hs.fz(Lyf;I)V")
	public static final void cc_sethflip(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_sethflip(var2, var3, arg0);
	}

	@ObfuscatedName("tv.fj(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setscrollsize(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		arg0.field2208 = arg2.field8216[arg2.field8226];
		arg0.field2319 = arg2.field8216[arg2.field8226 + 1];
		Client.method4616(arg0);
		if (arg0.field2184 == 0) {
			Client.method8329(arg1, arg0, false);
		}
	}

	@ObfuscatedName("nk.fd(Lyf;I)V")
	public static final void if_setscrollsize(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setscrollsize(var2, var3, arg0);
	}

	@ObfuscatedName("ry.fn(Lyf;I)V")
	public static final void cc_setscrollsize(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setscrollsize(var2, var3, arg0);
	}

	@ObfuscatedName("rm.fi(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setalpha(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2222 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("ky.ft(Lyf;I)V")
	public static final void if_setalpha(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setalpha(var2, var3, arg0);
	}

	@ObfuscatedName("ff.fx(Lyf;I)V")
	public static final void cc_setalpha(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setalpha(var2, var3, arg0);
	}

	@ObfuscatedName("fa.fv(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setmodelzoom(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2272 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method2886(arg0.field2158);
		}
	}

	@ObfuscatedName("na.fc(Lyf;I)V")
	public static final void if_setmodelzoom(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmodelzoom(var2, var3, arg0);
	}

	@ObfuscatedName("ip.fw(Lyf;B)V")
	public static final void cc_setmodelzoom(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmodelzoom(var2, var3, arg0);
	}

	@ObfuscatedName("nz.fa(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setlinedirection(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		arg0.field2214 = var3 == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("na.fp(Lyf;I)V")
	public static final void if_setlinedirection(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setlinedirection(var2, var3, arg0);
	}

	@ObfuscatedName("xn.fq(Lyf;I)V")
	public static final void cc_setlinedirection(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setlinedirection(var2, var3, arg0);
	}

	@ObfuscatedName("il.ff(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmodelorigin(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		arg0.field2305 = arg2.field8216[arg2.field8226];
		arg0.field2209 = arg2.field8216[arg2.field8226 + 1];
		Client.method4616(arg0);
	}

	@ObfuscatedName("jr.fl(Lyf;I)V")
	public static final void if_setmodelorigin(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmodelorigin(var2, var3, arg0);
	}

	@ObfuscatedName("ip.fb(Lyf;I)V")
	public static final void cc_setmodelorigin(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmodelorigin(var2, var3, arg0);
	}

	@ObfuscatedName("d.fo(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setmaxlines(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2236 = arg2.field8216[--arg2.field8226];
		Client.method4616(arg0);
	}

	@ObfuscatedName("p.fy(Lyf;I)V")
	public static final void if_setmaxlines(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmaxlines(var2, var3, arg0);
	}

	@ObfuscatedName("aq.fe(Lyf;I)V")
	public static final void cc_setmaxlines(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmaxlines(var2, var3, arg0);
	}

	@ObfuscatedName("vx.fk(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setparam_int(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		int var3 = arg2.field8216[arg2.field8226];
		int var4 = arg2.field8216[arg2.field8226 + 1];
		ParamType var5 = (ParamType) Client.field3086.list(var3);
		if (var5.defaultint == var4) {
			arg0.method3954(var3);
		} else {
			arg0.method3952(var3, var4);
		}
	}

	@ObfuscatedName("fk.fh(Lyf;B)V")
	public static final void if_setparam_int(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setparam_int(var2, var3, arg0);
	}

	@ObfuscatedName("jd.fr(Lyf;I)V")
	public static final void cc_setparam_int(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setparam_int(var2, var3, arg0);
	}

	@ObfuscatedName("abh.gu(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setparam_string(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		String var4 = (String) arg2.field8218[--arg2.field8211];
		ParamType var5 = (ParamType) Client.field3086.list(var3);
		if (var5.defaultstr.equals(var4)) {
			arg0.method3954(var3);
		} else {
			arg0.method4003(var3, var4);
		}
	}

	@ObfuscatedName("x.gq(Lyf;I)V")
	public static final void if_setparam_string(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setparam_string(var2, var3, arg0);
	}

	@ObfuscatedName("ts.gl(Lyf;B)V")
	public static final void cc_setparam_string(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setparam_string(var2, var3, arg0);
	}

	@ObfuscatedName("abc.go(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setrecol(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 3;
		int var3 = arg2.field8216[arg2.field8226];
		short var4 = (short) arg2.field8216[arg2.field8226 + 1];
		short var5 = (short) arg2.field8216[arg2.field8226 + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.method3964(var3, var4, var5);
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method14614(arg0.field2158, var3);
		}
	}

	@ObfuscatedName("apn.gk(Lyf;I)V")
	public static final void if_setrecol(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setrecol(var2, var3, arg0);
	}

	@ObfuscatedName("aag.gp(Lyf;B)V")
	public static final void cc_setrecol(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setrecol(var2, var3, arg0);
	}

	@ObfuscatedName("aiu.gy(Lhf;Lhq;Lyf;I)V")
	public static final void if_setretex(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 3;
		int var3 = arg2.field8216[arg2.field8226];
		short var4 = (short) arg2.field8216[arg2.field8226 + 1];
		short var5 = (short) arg2.field8216[arg2.field8226 + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.method3993(var3, var4, var5);
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method2051(arg0.field2158, var3);
		}
	}

	@ObfuscatedName("jg.ga(Lyf;I)V")
	public static final void if_setretex(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		if_setretex(var2, var3, arg0);
	}

	@ObfuscatedName("jq.gn(Lyf;I)V")
	public static final void cc_setretex(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		if_setretex(var2, var3, arg0);
	}

	@ObfuscatedName("v.gc(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setfontmono(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2275 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method18682(arg0.field2158);
		}
	}

	@ObfuscatedName("qw.gf(Lyf;I)V")
	public static final void if_setfontmono(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setfontmono(var2, var3, arg0);
	}

	@ObfuscatedName("w.gx(Lyf;S)V")
	public static final void cc_setfontmono(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setfontmono(var2, var3, arg0);
	}

	@ObfuscatedName("ae.ge(Lyf;I)V")
	public static final void cc_setparam(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8226 -= 2;
		int var3 = arg0.field8216[arg0.field8226];
		int var4 = arg0.field8216[arg0.field8226 + 1];
		ParamType var5 = (ParamType) Client.field3086.list(var3);
		if (var5.defaultint == var4) {
			var2.method3954(var3);
		} else {
			var2.method3952(var3, var4);
		}
	}

	@ObfuscatedName("abv.gg(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setclickmask(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2253 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method3026(arg0.field2158);
		}
	}

	@ObfuscatedName("wv.gr(Lyf;I)V")
	public static final void if_setclickmask(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setclickmask(var2, var3, arg0);
	}

	@ObfuscatedName("tp.gs(Lyf;I)V")
	public static final void cc_setclickmask(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setclickmask(var2, var3, arg0);
	}

	@ObfuscatedName("jp.gt(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setheld(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2360 = arg2.field8216[--arg2.field8226] == 1;
		Client.method4616(arg0);
	}

	@ObfuscatedName("je.gh(Lyf;I)V")
	public static final void if_setheld(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setheld(var2, var3, arg0);
	}

	@ObfuscatedName("iq.gm(Lyf;I)V")
	public static final void cc_setheld(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setheld(var2, var3, arg0);
	}

	@ObfuscatedName("ws.gv(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setnpchead(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 2;
		arg0.field2363 = null;
		arg0.field2294 = arg2.field8216[--arg2.field8226];
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("qk.gj(Lyf;I)V")
	public static final void if_setnpchead(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setnpchead(var2, var3, arg0);
	}

	@ObfuscatedName("pb.gw(Lyf;B)V")
	public static final void cc_setnpchead(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setnpchead(var2, var3, arg0);
	}

	@ObfuscatedName("ge.gd(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setplayerhead_self(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 3;
		arg0.field2294 = Client.field10945;
		arg0.field2298 = 0;
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("ja.gz(Lyf;I)V")
	public static final void if_setplayerhead_self(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setplayerhead_self(var2, var3, arg0);
	}

	@ObfuscatedName("uf.gb(Lyf;I)V")
	public static final void cc_setplayerhead_self(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setplayerhead_self(var2, var3, arg0);
	}

	@ObfuscatedName("aaj.gi(Lhf;Lhq;ZILyf;I)V")
	public static final void cc_if_setobject_data(Component arg0, Interface arg1, boolean arg2, int arg3, ClientScriptState arg4) {
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
		ObjType var7 = (ObjType) Client.field1842.list(var5);
		arg0.field2230 = var7.xan2d;
		arg0.field2231 = var7.yan2d;
		arg0.field2331 = var7.zan2d;
		arg0.field2228 = var7.xof2d;
		arg0.field2316 = var7.yof2d;
		arg0.field2272 = var7.zoom2d;
		arg0.field2241 = arg3;
		if (arg0.field2227 > 0) {
			arg0.field2272 = arg0.field2272 * 32 / arg0.field2227;
		} else if (arg0.field2192 > 0) {
			arg0.field2272 = arg0.field2272 * 32 / arg0.field2192;
		}
	}

	@ObfuscatedName("yl.hm(Lyf;B)V")
	public static final void if_setobject(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setobject_data(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("nd.ha(Lyf;I)V")
	public static final void cc_setobject(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setobject_data(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("po.hk(Lyf;I)V")
	public static final void if_setobject_nonum(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setobject_data(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("vi.hu(Lyf;I)V")
	public static final void cc_setobject_nonum(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setobject_data(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("qm.hb(Lyf;B)V")
	public static final void if_setobject_wearcol(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setobject_data(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("abt.hg(Lyf;B)V")
	public static final void cc_setobject_wearcol(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setobject_data(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("tg.hd(Lyf;I)V")
	public static final void if_setobject_wearcol_nonum(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setobject_data(var2, var3, true, 0, arg0);
	}

	@ObfuscatedName("agg.hx(Lyf;B)V")
	public static final void cc_setobject_wearcol_nonum(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setobject_data(var2, var3, true, 0, arg0);
	}

	@ObfuscatedName("je.hq(Lyf;I)V")
	public static final void if_setobject_alwaysnum(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setobject_data(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("kc.hf(Lyf;I)V")
	public static final void cc_setobject_alwaysnum(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setobject_data(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("agf.hr(Lyf;I)V")
	public static final void if_setobject_wearcol_alwaysnum(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setobject_data(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("xk.hs(Lyf;B)V")
	public static final void cc_setobject_wearcol_alwaysnum(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setobject_data(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("tx.hh(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setnpcmodel(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 6;
		arg0.field2363 = null;
		arg0.field2294 = arg2.field8216[--arg2.field8226];
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("nj.hp(Lyf;B)V")
	public static final void if_setnpcmodel(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setnpcmodel(var2, var3, arg0);
	}

	@ObfuscatedName("qz.hy(Lyf;B)V")
	public static final void cc_setnpcmodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setnpcmodel(var2, var3, arg0);
	}

	@ObfuscatedName("ty.he(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setplayermodel(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 5;
		arg0.field2294 = arg2.field8216[--arg2.field8226];
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("acg.hn(Lyf;I)V")
	public static final void if_setplayermodel(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setplayermodel(var2, var3, arg0);
	}

	@ObfuscatedName("vs.hi(Lyf;I)V")
	public static final void cc_setplayermodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setplayermodel(var2, var3, arg0);
	}

	@ObfuscatedName("nz.hw(Lhf;Lhq;Lyf;Lhd;B)V")
	public static final void cc_if_setlink(Component arg0, Interface arg1, ClientScriptState arg2, GroupUserKind arg3) {
		int var4 = arg2.field8216[--arg2.field8226];
		switch(arg3.field2141) {
			case 0:
				arg0.field2336 = Client.field6721.method3392(var4).method3488();
				break;
			case 1:
			case 4:
				arg0.field2336 = arg2.field8228.field11392[var4].field3087;
				break;
			case 2:
				if (Client.field11080 != 2 || var4 >= Client.field10811) {
					return;
				}
				arg0.field2336 = Client.field11065[var4].field606;
				break;
			case 3:
				arg0.field2336 = ((PlayerGroupBanned) Client.field6721.method3429().get(var4)).method3540();
				break;
			case 5:
				if (Client.field9267 != null && var4 < Client.field9267.length) {
					arg0.field2336 = Client.field9267[var4].field756;
				}
				break;
			default:
				throw new IllegalStateException();
		}
		arg0.field2337 = arg3;
	}

	@ObfuscatedName("jb.ht(Lyf;I)V")
	public static final void if_setlinkfriend(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setlink(var2, var3, arg0, GroupUserKind.field2136);
	}

	@ObfuscatedName("ve.hc(Lyf;B)V")
	public static final void cc_setlinkfriend(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setlink(var2, var3, arg0, GroupUserKind.field2136);
	}

	@ObfuscatedName("pr.ho(Lyf;I)V")
	public static final void if_setlinkfriendchat(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setlink(var2, var3, arg0, GroupUserKind.field2140);
	}

	@ObfuscatedName("aq.hj(Lyf;I)V")
	public static final void cc_setlinkfriendchat(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setlink(var2, var3, arg0, GroupUserKind.field2140);
	}

	@ObfuscatedName("ga.hv(Lyf;I)V")
	public static final void if_setlinkplayergroup(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		boolean var1 = arg0.field8216[arg0.field8226] == 1;
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Component var3 = Component.method10202(var2);
		Interface var4 = Component.field11725[var2 >> 16];
		cc_if_setlink(var3, var4, arg0, var1 ? GroupUserKind.field2138 : GroupUserKind.field2137);
	}

	@ObfuscatedName("uy.hz(Lyf;I)V")
	public static final void cc_setlinkplayergroup(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		boolean var4 = arg0.field8216[--arg0.field8226] == 1;
		cc_if_setlink(var2, var3, arg0, var4 ? GroupUserKind.field2138 : GroupUserKind.field2137);
	}

	@ObfuscatedName("akr.ij(Lyf;I)V")
	public static final void if_setlinkactiveclanchannel(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setlink(var2, var3, arg0, Client.field3022 == arg0.field8228 ? GroupUserKind.field2139 : GroupUserKind.field2135);
	}

	@ObfuscatedName("tv.io(Lyf;I)V")
	public static final void cc_setlinkactiveclanchannel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setlink(var2, var3, arg0, Client.field3022 == arg0.field8228 ? GroupUserKind.field2139 : GroupUserKind.field2135);
	}

	@ObfuscatedName("bf.iq(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_resetlinkplayer(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2336 = null;
		arg0.field2337 = null;
	}

	@ObfuscatedName("fp.ig(Lyf;B)V")
	public static final void if_resetlinkplayer(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_resetlinkplayer(var2, var3, arg0);
	}

	@ObfuscatedName("nu.iv(Lyf;I)V")
	public static final void cc_resetlinkplayer(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_resetlinkplayer(var2, var3, arg0);
	}

	@ObfuscatedName("age.ie(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setplayermodel_self(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2224 = 5;
		arg0.field2294 = Client.field10945;
		arg0.field2298 = 0;
		if (arg0.field2183 == -1 && !arg1.field2150) {
			DelayedStateChange.method19198(arg0.field2158);
		}
	}

	@ObfuscatedName("gb.iu(Lyf;I)V")
	public static final void if_setplayermodel_self(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setplayermodel_self(var2, var3, arg0);
	}

	@ObfuscatedName("w.in(Lyf;I)V")
	public static final void cc_setplayermodel_self(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setplayermodel_self(var2, var3, arg0);
	}

	@ObfuscatedName("n.ir(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setop(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226] - 1;
		if (var3 >= 0 && var3 <= 9) {
			arg0.method3947(var3, (String) arg2.field8218[--arg2.field8211]);
		} else {
			arg2.field8211--;
		}
	}

	@ObfuscatedName("vo.it(Lyf;I)V")
	public static final void if_setop(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setop(var2, var3, arg0);
	}

	@ObfuscatedName("abr.ix(Lyf;I)V")
	public static final void cc_setop(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setop(var2, var3, arg0);
	}

	@ObfuscatedName("g.is(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setdraggable(Component arg0, Interface arg1, ClientScriptState arg2) {
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
	public static final void if_setdraggable(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setdraggable(var2, var3, arg0);
	}

	@ObfuscatedName("jd.il(Lyf;B)V")
	public static final void cc_setdraggable(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setdraggable(var2, var3, arg0);
	}

	@ObfuscatedName("gm.iw(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setdragrenderbehaviour(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		if (Component.field2234 == var3 || Component.field2301 == var3 || Component.field2157 == var3 || Component.field2266 == var3) {
			arg0.field2271 = var3;
		}
	}

	@ObfuscatedName("sc.ip(Lyf;I)V")
	public static final void if_setdragrenderbehaviour(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setdragrenderbehaviour(var2, var3, arg0);
	}

	@ObfuscatedName("pv.id(Lyf;I)V")
	public static final void cc_setdragrenderbehaviour(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setdragrenderbehaviour(var2, var3, arg0);
	}

	@ObfuscatedName("vm.ia(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setdragdeadzone(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2285 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("ud.if(Lyf;B)V")
	public static final void if_setdragdeadzone(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setdragdeadzone(var2, var3, arg0);
	}

	@ObfuscatedName("hi.ih(Lyf;I)V")
	public static final void cc_setdragdeadzone(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setdragdeadzone(var2, var3, arg0);
	}

	@ObfuscatedName("db.iy(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setdragdeadtime(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2286 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("ii.ii(Lyf;B)V")
	public static final void if_setdragdeadtime(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setdragdeadtime(var2, var3, arg0);
	}

	@ObfuscatedName("fb.iz(Lyf;B)V")
	public static final void cc_setdragdeadtime(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setdragdeadtime(var2, var3, arg0);
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
	public static final void cc_setswipeunknown2(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("vh.jf(Lyf;B)V")
	public static final void if_setswipedeadtime(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("pp.ju(Lyf;I)V")
	public static final void cc_setswipedeadtime(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("au.jy(Lyf;I)V")
	public static final void if_setswipedeadzone(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("tg.jl(Lyf;I)V")
	public static final void cc_setswipedeadzone(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("vh.jn(Lyf;B)V")
	public static final void if_setswipeflags(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("iu.je(Lyf;I)V")
	public static final void cc_setswipeflags(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("il.jb(Lyf;B)V")
	public static final void if_addswipeflags(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("vz.jm(Lyf;B)V")
	public static final void cc_addswipeflags(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ajo.jw(Lyf;I)V")
	public static final void if_delswipeflags(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("wo.jr(Lyf;B)V")
	public static final void cc_delswipeflags(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("aky.js(Lyf;I)V")
	public static final void if_setpinchflags(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("fa.ji(Lyf;I)V")
	public static final void cc_setpinchflags(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ju.jt(Lyf;I)V")
	public static final void if_addpinchflags(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("nh.jq(Lyf;B)V")
	public static final void cc_addpinchflags(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("vv.jv(Lyf;I)V")
	public static final void if_delpinchflags(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("fd.ja(Lyf;I)V")
	public static final void cc_delpinchflags(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("qs.jj(Lyf;B)V")
	public static final void if_setpinchdeadzone(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("ty.jo(Lyf;I)V")
	public static final void cc_setpinchdeadzone(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ff.jz(Lyf;I)V")
	public static final void if_setsubtractinsets(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("pf.jc(Lyf;S)V")
	public static final void cc_setsubtractinsets(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("hz.jg(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setopbase(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2279 = (String) arg2.field8218[--arg2.field8211];
	}

	@ObfuscatedName("ie.jx(Lyf;I)V")
	public static final void if_setopbase(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setopbase(var2, var3, arg0);
	}

	@ObfuscatedName("db.jh(Lyf;I)V")
	public static final void cc_setopbase(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setopbase(var2, var3, arg0);
	}

	@ObfuscatedName("ahd.jp(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settargetverb(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2288 = (String) arg2.field8218[--arg2.field8211];
	}

	@ObfuscatedName("abr.jk(Lyf;I)V")
	public static final void if_settargetverb(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settargetverb(var2, var3, arg0);
	}

	@ObfuscatedName("hy.kw(Lyf;I)V")
	public static final void cc_settargetverb(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settargetverb(var2, var3, arg0);
	}

	@ObfuscatedName("mj.kz(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_clearops(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2321 = null;
	}

	@ObfuscatedName("kh.ke(Lyf;I)V")
	public static final void if_clearops(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_clearops(var2, var3, arg0);
	}

	@ObfuscatedName("ig.kq(Lyf;I)V")
	public static final void cc_clearops(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_clearops(var2, var3, arg0);
	}

	@ObfuscatedName("fr.kg(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settargetcursors(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2269 = arg2.field8216[--arg2.field8226];
		arg0.field2202 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("e.ku(Lyf;I)V")
	public static final void if_settargetcursors(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settargetcursors(var2, var3, arg0);
	}

	@ObfuscatedName("pk.ko(Lyf;B)V")
	public static final void cc_settargetcursors(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settargetcursors(var2, var3, arg0);
	}

	@ObfuscatedName("aj.kf(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setopcursor(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.field8216[--arg2.field8226];
		int var4 = arg2.field8216[--arg2.field8226];
		if (var4 >= 1 && var4 <= 10) {
			arg0.method3948(var4 - 1, var3);
		}
	}

	@ObfuscatedName("el.kx(Lyf;S)V")
	public static final void if_setopcursor(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setopcursor(var2, var3, arg0);
	}

	@ObfuscatedName("af.ki(Lyf;I)V")
	public static final void cc_setopcursor(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setopcursor(var2, var3, arg0);
	}

	@ObfuscatedName("aba.ks(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setpausetext(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2180 = (String) arg2.field8218[--arg2.field8211];
	}

	@ObfuscatedName("ke.kh(Lyf;I)V")
	public static final void if_setpausetext(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setpausetext(var2, var3, arg0);
	}

	@ObfuscatedName("vv.ka(Lyf;B)V")
	public static final void cc_setpausetext(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setpausetext(var2, var3, arg0);
	}

	@ObfuscatedName("abh.kl(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_settargetopcursor(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2283 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("agu.kb(Lyf;I)V")
	public static final void if_settargetopcursor(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_settargetopcursor(var2, var3, arg0);
	}

	@ObfuscatedName("ake.kr(Lyf;I)V")
	public static final void cc_settargetopcursor(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_settargetopcursor(var2, var3, arg0);
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
	public static final void cc_if_setopchar(Component arg0, ClientScriptState arg1) {
		arg1.field8226 -= 2;
		int var2 = arg1.field8216[arg1.field8226] - 1;
		int var3 = arg1.field8216[arg1.field8226 + 1];
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		method8295(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("jl.kj(Lyf;I)V")
	public static final void if_setopchar(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_setopchar(var2, arg0);
	}

	@ObfuscatedName("xb.kn(Lyf;S)V")
	public static final void cc_setopchar(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_setopchar(var2, arg0);
	}

	@ObfuscatedName("ag.kp(Lhf;Lyf;I)V")
	public static final void cc_if_setoptchar(Component arg0, ClientScriptState arg1) {
		byte var2 = 10;
		int var3 = arg1.field8216[--arg1.field8226];
		method8295(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("ux.km(Lyf;I)V")
	public static final void if_setoptchar(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_setoptchar(var2, arg0);
	}

	@ObfuscatedName("gk.ky(Lyf;B)V")
	public static final void cc_setoptchar(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_setoptchar(var2, arg0);
	}

	@ObfuscatedName("vm.kk(Lhf;I[B[BLyf;I)V")
	public static final void cc_if_setopkey(Component arg0, int arg1, byte[] arg2, byte[] arg3, ClientScriptState arg4) {
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
		cc_if_setopkey(arg0, var4, arg1, arg2, arg3);
	}

	@ObfuscatedName("b.kt(Lyf;I)V")
	public static final void if_setopkey(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		byte[] var1 = new byte[] { (byte) arg0.field8216[arg0.field8226] };
		byte[] var2 = new byte[] { (byte) arg0.field8216[arg0.field8226 + 1] };
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Component var4 = Component.method10202(var3);
		method5380(var4, var1, var2, arg0);
	}

	@ObfuscatedName("uu.li(Lyf;B)V")
	public static final void cc_setopkey(ClientScriptState arg0) {
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
	public static final void cc_if_setoptkey(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.field8226 -= 2;
		byte var3 = 10;
		byte[] var4 = new byte[] { (byte) arg2.field8216[arg2.field8226] };
		byte[] var5 = new byte[] { (byte) arg2.field8216[arg2.field8226 + 1] };
		cc_if_setopkey(arg0, var3, var4, var5, arg2);
	}

	@ObfuscatedName("yx.la(Lyf;I)V")
	public static final void if_setoptkey(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setoptkey(var2, var3, arg0);
	}

	@ObfuscatedName("gm.lp(Lyf;I)V")
	public static final void cc_setoptkey(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setoptkey(var2, var3, arg0);
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
	public static final void cc_if_setopkeyrate(Component arg0, ClientScriptState arg1) {
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
	public static final void if_setopkeyrate(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_setopkeyrate(var2, arg0);
	}

	@ObfuscatedName("ua.ll(Lyf;I)V")
	public static final void cc_setopkeyrate(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_setopkeyrate(var2, arg0);
	}

	@ObfuscatedName("fz.lb(Lhf;Lyf;I)V")
	public static final void cc_if_setoptkeyrate(Component arg0, ClientScriptState arg1) {
		byte var2 = 10;
		int var3 = arg1.field8216[--arg1.field8226];
		int var4 = arg1.field8216[--arg1.field8226];
		method7097(arg0, var2, var3, var4, arg1);
	}

	@ObfuscatedName("yx.le(Lyf;B)V")
	public static final void if_setoptkeyrate(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_setoptkeyrate(var2, arg0);
	}

	@ObfuscatedName("fj.lr(Lyf;I)V")
	public static final void cc_setoptkeyrate(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_setoptkeyrate(var2, arg0);
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
	public static final void cc_if_setopkeyignoreheld(Component arg0, ClientScriptState arg1) {
		arg1.field8226--;
		int var2 = arg1.field8216[arg1.field8226] - 1;
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		method4490(arg0, var2, arg1);
	}

	@ObfuscatedName("iw.lh(Lyf;I)V")
	public static final void if_setopkeyignoreheld(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_setopkeyignoreheld(var2, arg0);
	}

	@ObfuscatedName("pp.ls(Lyf;I)V")
	public static final void cc_setopkeyignoreheld(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_setopkeyignoreheld(var2, arg0);
	}

	@ObfuscatedName("hj.lu(Lhf;Lyf;I)V")
	public static final void cc_if_setoptkeyignoreheld(Component arg0, ClientScriptState arg1) {
		byte var2 = 10;
		method4490(arg0, var2, arg1);
	}

	@ObfuscatedName("ku.ly(Lyf;B)V")
	public static final void if_setoptkeyignoreheld(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_setoptkeyignoreheld(var2, arg0);
	}

	@ObfuscatedName("gl.lg(Lyf;I)V")
	public static final void cc_setoptkeyignoreheld(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_setoptkeyignoreheld(var2, arg0);
	}

	@ObfuscatedName("xz.lx(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmouseovercursor(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2204 = arg2.field8216[--arg2.field8226];
	}

	@ObfuscatedName("uw.lj(Lyf;I)V")
	public static final void if_setmouseovercursor(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setmouseovercursor(var2, var3, arg0);
	}

	@ObfuscatedName("u.lw(Lyf;I)V")
	public static final void cc_setmouseovercursor(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setmouseovercursor(var2, var3, arg0);
	}

	@ObfuscatedName("el.lz(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_clearscripthooks(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.method3976();
	}

	@ObfuscatedName("aga.ln(Lyf;B)V")
	public static final void cc_clearscripthooks(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_clearscripthooks(var2, var3, arg0);
	}

	@ObfuscatedName("uo.lt(Lyf;B)V")
	public static final void if_clearscripthooks(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_clearscripthooks(var2, var3, arg0);
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
	public static final void cc_if_setonclick(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2291 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ek.mh(Lyf;I)V")
	public static final void if_setonclick(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonclick(var2, var3, arg0);
	}

	@ObfuscatedName("gk.mx(Lyf;S)V")
	public static final void cc_setonclick(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonclick(var2, var3, arg0);
	}

	@ObfuscatedName("hf.mg(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonhold(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2244 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("dm.me(Lyf;B)V")
	public static final void if_setonhold(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonhold(var2, var3, arg0);
	}

	@ObfuscatedName("a.mn(Lyf;B)V")
	public static final void cc_setonhold(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonhold(var2, var3, arg0);
	}

	@ObfuscatedName("uf.mv(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setonrelease(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2293 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ux.my(Lyf;I)V")
	public static final void if_setonrelease(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonrelease(var2, var3, arg0);
	}

	@ObfuscatedName("zl.md(Lyf;B)V")
	public static final void cc_setonrelease(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonrelease(var2, var3, arg0);
	}

	@ObfuscatedName("uz.mk(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonmouseover(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2233 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("dd.mq(Lyf;B)V")
	public static final void if_setonmouseover(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonmouseover(var2, var3, arg0);
	}

	@ObfuscatedName("ap.ms(Lyf;I)V")
	public static final void cc_setonmouseover(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonmouseover(var2, var3, arg0);
	}

	@ObfuscatedName("ad.mp(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonmouseleave(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2280 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("fa.mo(Lyf;S)V")
	public static final void if_setonmouseleave(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonmouseleave(var2, var3, arg0);
	}

	@ObfuscatedName("zo.ml(Lyf;I)V")
	public static final void cc_setonmouseleave(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonmouseleave(var2, var3, arg0);
	}

	@ObfuscatedName("yv.mi(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setondrag(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2362 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ht.mr(Lyf;B)V")
	public static final void if_setondrag(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setondrag(var2, var3, arg0);
	}

	@ObfuscatedName("xg.mz(Lyf;B)V")
	public static final void cc_setondrag(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setondrag(var2, var3, arg0);
	}

	@ObfuscatedName("nd.mb(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setontargetleave(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2299 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("sn.mu(Lyf;I)V")
	public static final void if_setontargetleave(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setontargetleave(var2, var3, arg0);
	}

	@ObfuscatedName("gr.mt(Lyf;I)V")
	public static final void cc_setontargetleave(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setontargetleave(var2, var3, arg0);
	}

	@ObfuscatedName("ahc.mc(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonvartransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
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
	public static final void if_setonvartransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonvartransmit(var2, var3, arg0);
	}

	@ObfuscatedName("hw.mj(Lyf;B)V")
	public static final void cc_setonvartransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonvartransmit(var2, var3, arg0);
	}

	@ObfuscatedName("d.mw(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setontimer(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2314 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ea.mm(Lyf;B)V")
	public static final void if_setontimer(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setontimer(var2, var3, arg0);
	}

	@ObfuscatedName("yp.nd(Lyf;B)V")
	public static final void cc_setontimer(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setontimer(var2, var3, arg0);
	}

	@ObfuscatedName("jq.ne(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonop(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2315 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("tr.ny(Lyf;B)V")
	public static final void if_setonop(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonop(var2, var3, arg0);
	}

	@ObfuscatedName("vd.nm(Lyf;B)V")
	public static final void cc_setonop(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonop(var2, var3, arg0);
	}

	@ObfuscatedName("jw.nj(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setondragcomplete(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2178 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ty.no(Lyf;I)V")
	public static final void if_setondragcomplete(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setondragcomplete(var2, var3, arg0);
	}

	@ObfuscatedName("ie.np(Lyf;B)V")
	public static final void cc_setondragcomplete(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setondragcomplete(var2, var3, arg0);
	}

	@ObfuscatedName("afp.na(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonverticalswipe(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("ac.ni(Lyf;I)V")
	public static final void if_setonverticalswipe(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonverticalswipe(var2, var3, arg0);
	}

	@ObfuscatedName("vz.nb(Lyf;B)V")
	public static final void cc_setonverticalswipe(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonverticalswipe(var2, var3, arg0);
	}

	@ObfuscatedName("kh.nw(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonhorizontalswipe(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("nd.nx(Lyf;I)V")
	public static final void if_setonhorizontalswipe(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonhorizontalswipe(var2, var3, arg0);
	}

	@ObfuscatedName("xu.nl(Lyf;I)V")
	public static final void cc_setonhorizontalswipe(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonhorizontalswipe(var2, var3, arg0);
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
		Interface var3 = Component.field11725[var1 >> 16];
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
	public static final void cc_if_setonverticalpinch(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("ali.nq(Lyf;I)V")
	public static final void if_setonverticalpinch(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonverticalpinch(var2, var3, arg0);
	}

	@ObfuscatedName("tz.nr(Lyf;B)V")
	public static final void cc_setonverticalpinch(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonverticalpinch(var2, var3, arg0);
	}

	@ObfuscatedName("ar.nu(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonhorizontalpinch(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("z.nf(Lyf;B)V")
	public static final void if_setonhorizontalpinch(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonhorizontalpinch(var2, var3, arg0);
	}

	@ObfuscatedName("cs.nz(Lyf;B)V")
	public static final void cc_setonhorizontalpinch(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonhorizontalpinch(var2, var3, arg0);
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
		Interface var3 = Component.field11725[var1 >> 16];
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
	public static final void window_getinsets(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = GameShell.canvasWid;
		arg0.field8216[++arg0.field8226 - 1] = GameShell.canvasHei;
	}

	@ObfuscatedName("yx.oh(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonclickrepeat(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2292 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("agd.oo(Lyf;I)V")
	public static final void if_setonclickrepeat(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonclickrepeat(var2, var3, arg0);
	}

	@ObfuscatedName("ge.ol(Lyf;B)V")
	public static final void cc_setonclickrepeat(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonclickrepeat(var2, var3, arg0);
	}

	@ObfuscatedName("zq.oq(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonmouserepeat(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2296 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("hs.oi(Lyf;S)V")
	public static final void if_setonmouserepeat(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonmouserepeat(var2, var3, arg0);
	}

	@ObfuscatedName("xz.ot(Lyf;I)V")
	public static final void cc_setonmouserepeat(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonmouserepeat(var2, var3, arg0);
	}

	@ObfuscatedName("pz.ow(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setoninvtransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
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
	public static final void if_setoninvtransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setoninvtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("aax.oz(Lyf;B)V")
	public static final void cc_setoninvtransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setoninvtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("re.ob(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonstattransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
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
	public static final void if_setonstattransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonstattransmit(var2, var3, arg0);
	}

	@ObfuscatedName("cz.om(Lyf;B)V")
	public static final void cc_setonstattransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonstattransmit(var2, var3, arg0);
	}

	@ObfuscatedName("wo.of(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setontargetenter(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2249 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("rm.oy(Lyf;I)V")
	public static final void if_setontargetenter(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setontargetenter(var2, var3, arg0);
	}

	@ObfuscatedName("l.od(Lyf;I)V")
	public static final void cc_setontargetenter(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setontargetenter(var2, var3, arg0);
	}

	@ObfuscatedName("amq.on(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonscrollwheel(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2317 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("kv.os(Lyf;I)V")
	public static final void if_setonscrollwheel(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonscrollwheel(var2, var3, arg0);
	}

	@ObfuscatedName("vf.og(Lyf;I)V")
	public static final void cc_setonscrollwheel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonscrollwheel(var2, var3, arg0);
	}

	@ObfuscatedName("ji.oj(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonchattransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2318 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("qu.ok(Lyf;I)V")
	public static final void if_setonchattransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonchattransmit(var2, var3, arg0);
	}

	@ObfuscatedName("kp.ou(Lyf;I)V")
	public static final void cc_setonchattransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonchattransmit(var2, var3, arg0);
	}

	@ObfuscatedName("pp.oe(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonkey(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2295 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("vh.ov(Lyf;I)V")
	public static final void if_setonkey(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonkey(var2, var3, arg0);
	}

	@ObfuscatedName("qh.oc(Lyf;I)V")
	public static final void cc_setonkey(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonkey(var2, var3, arg0);
	}

	@ObfuscatedName("iy.ox(Lyf;I)V")
	public static final void if_setongamepadbutton(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("tu.pt(Lyf;I)V")
	public static final void cc_setongamepadbutton(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("kr.pi(Lyf;I)V")
	public static final void if_setongamepadbuttonheld(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("yx.pq(Lyf;I)V")
	public static final void cc_setongamepadbuttonheld(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("aht.ph(Lyf;I)V")
	public static final void if_setongamepadaxis(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("acd.pe(Lyf;B)V")
	public static final void cc_setongamepadaxis(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("fp.pb(Lyf;I)V")
	public static final void if_setongamepadtrigger(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		method1016(var2, var3, arg0);
	}

	@ObfuscatedName("aib.pw(Lyf;B)V")
	public static final void cc_setongamepadtrigger(ClientScriptState arg0) {
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
	public static final void cc_if_setonfriendtransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2320 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ss.pa(Lyf;B)V")
	public static final void if_setonfriendtransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonfriendtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("yo.pz(Lyf;B)V")
	public static final void cc_setonfriendtransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonfriendtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("ur.pd(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonclantransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2355 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("r.pn(Lyf;I)V")
	public static final void if_setonclantransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonclantransmit(var2, var3, arg0);
	}

	@ObfuscatedName("qs.px(Lyf;I)V")
	public static final void cc_setonclantransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonclantransmit(var2, var3, arg0);
	}

	@ObfuscatedName("ib.ps(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonmisctransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2347 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("vn.pl(Lyf;I)V")
	public static final void if_setonmisctransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonmisctransmit(var2, var3, arg0);
	}

	@ObfuscatedName("hw.po(Lyf;B)V")
	public static final void cc_setonmisctransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonmisctransmit(var2, var3, arg0);
	}

	@ObfuscatedName("wu.pr(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setondialogabort(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2326 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("kn.py(Lyf;I)V")
	public static final void if_setondialogabort(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setondialogabort(var2, var3, arg0);
	}

	@ObfuscatedName("nf.pg(Lyf;B)V")
	public static final void cc_setondialogabort(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setondialogabort(var2, var3, arg0);
	}

	@ObfuscatedName("aov.pv(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonsubchange(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2327 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ir.pj(Lyf;S)V")
	public static final void if_setonsubchange(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonsubchange(var2, var3, arg0);
	}

	@ObfuscatedName("d.pf(Lyf;I)V")
	public static final void cc_setonsubchange(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonsubchange(var2, var3, arg0);
	}

	@ObfuscatedName("aba.pp(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonstocktransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2325 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("dn.pu(Lyf;I)V")
	public static final void if_setonstocktransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonstocktransmit(var2, var3, arg0);
	}

	@ObfuscatedName("uk.pc(Lyf;B)V")
	public static final void cc_setonstocktransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonstocktransmit(var2, var3, arg0);
	}

	@ObfuscatedName("jr.qp(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setoncamfinished(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2328 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("a.qx(Lyf;B)V")
	public static final void if_setoncamfinished(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setoncamfinished(var2, var3, arg0);
	}

	@ObfuscatedName("qz.qt(Lyf;I)V")
	public static final void cc_setoncamfinished(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setoncamfinished(var2, var3, arg0);
	}

	@ObfuscatedName("xn.qz(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonresize(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2329 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("ny.qg(Lyf;I)V")
	public static final void if_setonresize(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonresize(var2, var3, arg0);
	}

	@ObfuscatedName("wy.qe(Lyf;I)V")
	public static final void cc_setonresize(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonresize(var2, var3, arg0);
	}

	@ObfuscatedName("zj.ql(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonvarctransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
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
	public static final void if_setonvarctransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonvarctransmit(var2, var3, arg0);
	}

	@ObfuscatedName("jm.qr(Lyf;B)V")
	public static final void cc_setonvarctransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonvarctransmit(var2, var3, arg0);
	}

	@ObfuscatedName("tj.qc(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonvarcstrtransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
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
	public static final void if_setonvarcstrtransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonvarcstrtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("anb.qi(Lyf;I)V")
	public static final void cc_setonvarcstrtransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonvarcstrtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("ajk.qy(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonopt(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2225 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("tu.qw(Lyf;I)V")
	public static final void if_setonopt(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonopt(var2, var3, arg0);
	}

	@ObfuscatedName("amb.qo(Lyf;B)V")
	public static final void cc_setonopt(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonopt(var2, var3, arg0);
	}

	@ObfuscatedName("ku.qm(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonclansettingstransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2232 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("acd.qq(Lyf;I)V")
	public static final void if_setonclansettingstransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonclansettingstransmit(var2, var3, arg0);
	}

	@ObfuscatedName("qd.qf(Lyf;I)V")
	public static final void cc_setonclansettingstransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonclansettingstransmit(var2, var3, arg0);
	}

	@ObfuscatedName("xt.qu(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonclanchanneltransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2323 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("vj.qs(Lyf;B)V")
	public static final void if_setonclanchanneltransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonclanchanneltransmit(var2, var3, arg0);
	}

	@ObfuscatedName("yx.qa(Lyf;I)V")
	public static final void cc_setonclanchanneltransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonclanchanneltransmit(var2, var3, arg0);
	}

	@ObfuscatedName("acg.qh(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonvarclantransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2312 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("fg.qv(Lyf;B)V")
	public static final void if_setonvarclantransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonvarclantransmit(var2, var3, arg0);
	}

	@ObfuscatedName("su.qk(Lyf;I)V")
	public static final void cc_setonvarclantransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonvarclantransmit(var2, var3, arg0);
	}

	@ObfuscatedName("ap.qn(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonplayergrouptransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2330 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("aej.qb(Lyf;B)V")
	public static final void if_setonplayergrouptransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonplayergrouptransmit(var2, var3, arg0);
	}

	@ObfuscatedName("io.rw(Lyf;I)V")
	public static final void cc_setonplayergrouptransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonplayergrouptransmit(var2, var3, arg0);
	}

	@ObfuscatedName("yo.rf(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonplayergroupvarptransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2359 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("v.rv(Lyf;B)V")
	public static final void if_setonplayergroupvarptransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setonplayergroupvarptransmit(var2, var3, arg0);
	}

	@ObfuscatedName("at.rh(Lyf;I)V")
	public static final void cc_setonplayergroupvarptransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setonplayergroupvarptransmit(var2, var3, arg0);
	}

	@ObfuscatedName("kd.ra(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setoncameraupdatetransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field8218[--arg2.field8211];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field2332 = method552(var3, arg2);
		arg0.field2179 = true;
	}

	@ObfuscatedName("kh.rx(Lyf;I)V")
	public static final void if_setoncameraupdatetransmit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >> 16];
		cc_if_setoncameraupdatetransmit(var2, var3, arg0);
	}

	@ObfuscatedName("gd.ry(Lyf;B)V")
	public static final void cc_setoncameraupdatetransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		cc_if_setoncameraupdatetransmit(var2, var3, arg0);
	}

	@ObfuscatedName("fl.rg(Lyf;I)V")
	public static final void cc_getx(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2194;
	}

	@ObfuscatedName("vq.rz(Lyf;I)V")
	public static final void cc_gety(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2195;
	}

	@ObfuscatedName("aqc.re(Lyf;I)V")
	public static final void cc_getwidth(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2196;
	}

	@ObfuscatedName("fu.rt(Lyf;I)V")
	public static final void cc_getheight(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2197;
	}

	@ObfuscatedName("ac.rl(Lyf;B)V")
	public static final void cc_gethide(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2201 ? 1 : 0;
	}

	@ObfuscatedName("tb.rc(Lyf;B)V")
	public static final void cc_getlayer(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2200;
	}

	@ObfuscatedName("ez.rr(Lyf;I)V")
	public static final void cc_getparentlayer(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		Interface var3 = var1.field8241;
		Component var4 = Client.method6000(var3, var2);
		arg0.field8216[++arg0.field8226 - 1] = var4 == null ? -1 : var4.field2158;
	}

	@ObfuscatedName("sq.rd(Lyf;I)V")
	public static final void cc_getcolour(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2210;
	}

	@ObfuscatedName("iy.rn(Lyf;I)V")
	public static final void cc_getscrollx(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2206;
	}

	@ObfuscatedName("cy.rb(Lyf;I)V")
	public static final void cc_getscrolly(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2207;
	}

	@ObfuscatedName("sh.ru(Lyf;I)V")
	public static final void cc_gettext(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8218[++arg0.field8211 - 1] = var2.field2261;
	}

	@ObfuscatedName("tj.sv(Lyf;I)V")
	public static final void cc_getscrollwidth(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2208;
	}

	@ObfuscatedName("xv.sw(Lyf;I)V")
	public static final void cc_getscrollheight(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2319;
	}

	@ObfuscatedName("nk.ss(Lyf;I)V")
	public static final void cc_getmodelzoom(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2272;
	}

	@ObfuscatedName("hi.sx(Lyf;I)V")
	public static final void cc_getmodelangle_x(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2230;
	}

	@ObfuscatedName("ajd.sm(Lyf;B)V")
	public static final void cc_getmodelangle_z(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2331;
	}

	@ObfuscatedName("zd.sk(Lyf;B)V")
	public static final void cc_getmodelangle_y(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2231;
	}

	@ObfuscatedName("gc.si(Lyf;I)V")
	public static final void cc_gettrans(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2212;
	}

	@ObfuscatedName("sf.se(Lyf;I)V")
	public static final void cc_getmodelxof(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2228;
	}

	@ObfuscatedName("ns.sn(Lyf;I)V")
	public static final void cc_getmodelyof(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2316;
	}

	@ObfuscatedName("dc.sr(Lyf;I)V")
	public static final void cc_getgraphic(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2215;
	}

	@ObfuscatedName("iw.sq(Lyf;I)V")
	public static final void cc_param(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		int var3 = arg0.field8216[--arg0.field8226];
		ParamType var4 = (ParamType) Client.field3086.list(var3);
		if (var4.isStringType()) {
			arg0.field8218[++arg0.field8211 - 1] = var2.method3975(var3, var4.defaultstr);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.method3950(var3, var4.defaultint);
		}
	}

	@ObfuscatedName("rb.sh(Lyf;I)V")
	public static final void cc_get2dangle(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2216;
	}

	@ObfuscatedName("th.st(Lyf;I)V")
	public static final void cc_getmodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2224 == 1 ? var2.field2294 : -1;
	}

	@ObfuscatedName("ace.sl(Lyf;I)V")
	public static final void cc_getfontgraphic(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2287;
	}

	@ObfuscatedName("ane.sp(Lyf;I)V")
	public static final void cc_getgraphicdimensions(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		int var3 = -1;
		int var4 = -1;
		Graphic var5 = var2.method3970(Client.renderer);
		if (var5 != null) {
			var3 = var5.field2144;
			var4 = var5.field2146;
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
		arg0.field8216[++arg0.field8226 - 1] = var4;
	}

	@ObfuscatedName("bc.su(Lyf;I)V")
	public static final void cc_getfontmetrics(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2287;
	}

	@ObfuscatedName("rm.sd(Lyf;S)V")
	public static final void cc_getinvobject(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2334;
	}

	@ObfuscatedName("va.sz(Lyf;I)V")
	public static final void cc_getinvcount(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		if (var2.field2334 == -1) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field2335;
		}
	}

	@ObfuscatedName("fw.sf(Lyf;B)V")
	public static final void cc_getid(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = var2.field2183;
	}

	@ObfuscatedName("dd.sy(Lyf;B)V")
	public static final void cc_gettargetmask(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		arg0.field8216[++arg0.field8226 - 1] = Client.method17197(var2).method17691();
	}

	@ObfuscatedName("ww.sa(Lyf;B)V")
	public static final void cc_getop(ClientScriptState arg0) {
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
	public static final void cc_getopbase(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		if (var2.field2279 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field2279;
		}
	}

	@ObfuscatedName("agy.sj(Lhf;Lyf;I)V")
	public static final void cc_if_callonresize(Component arg0, ClientScriptState arg1) {
		if (arg1.field8229 >= 10) {
			throw new RuntimeException();
		} else if (arg0.field2329 != null) {
			HookRequest var2 = new HookRequest();
			var2.field11491 = arg0;
			var2.field11493 = arg0.field2329;
			var2.field11499 = arg1.field8229 + 1;
			Client.field11031.method14153(var2);
		}
	}

	@ObfuscatedName("ka.so(Lyf;B)V")
	public static final void if_callonresize(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_callonresize(var2, arg0);
	}

	@ObfuscatedName("sn.sc(Lyf;I)V")
	public static final void cc_callonresize(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_callonresize(var2, arg0);
	}

	@ObfuscatedName("pu.sg(Lhf;Lyf;I)V")
	public static final void cc_if_getcharindexatpos(Component arg0, ClientScriptState arg1) {
		FontMetrics var2 = arg0.method3943(Client.field7538, Client.field10833);
		int var3 = arg1.field8216[--arg1.field8226];
		int var4 = arg1.field8216[--arg1.field8226];
		int var5 = var2.method14542(arg0.field2261, arg0.field2196, arg0.field2229, var4, var3, DefaultSprites.field10302);
		arg1.field8216[++arg1.field8226 - 1] = var5;
	}

	@ObfuscatedName("xh.tu(Lyf;I)V")
	public static final void if_getcharindexatpos(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_getcharindexatpos(var2, arg0);
	}

	@ObfuscatedName("ge.ta(Lyf;S)V")
	public static final void cc_getcharindexatpos(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_getcharindexatpos(var2, arg0);
	}

	@ObfuscatedName("dm.tr(Lhf;Lyf;B)V")
	public static final void cc_if_getcharposatindex(Component arg0, ClientScriptState arg1) {
		FontMetrics var2 = arg0.method3943(Client.field7538, Client.field10833);
		int var3 = arg1.field8216[--arg1.field8226];
		Point var4 = var2.method14541(arg0.field2261, arg0.field2196, arg0.field2229, var3, DefaultSprites.field10302);
		arg1.field8216[++arg1.field8226 - 1] = var4.x;
		arg1.field8216[++arg1.field8226 - 1] = var4.y;
	}

	@ObfuscatedName("wi.tc(Lyf;I)V")
	public static final void if_getcharposatindex(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_getcharposatindex(var2, arg0);
	}

	@ObfuscatedName("pp.tj(Lyf;I)V")
	public static final void cc_getcharposatindex(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_getcharposatindex(var2, arg0);
	}

	@ObfuscatedName("kt.te(B)J")
	public static final long method5390() {
		return (long) (++field8209 - 1) << 32 | 0xFFFFFFFFL;
	}

	@ObfuscatedName("mj.ti(Lhf;IIFIIIIIIB)V")
	public static void method5921(Component arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg0.field2363 == null) {
			NPCType var10 = (NPCType) Client.field7961.list(arg0.field2294);
			arg0.field2363 = new NPCTypeCustomisation(var10, true);
		}
		arg0.field2363.field2688 = method5390();
		arg0.field2363.method4528(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("du.tm(Lhf;IIB)V")
	public static void method2088(Component arg0, int arg1, int arg2) {
		if (arg0.field2363 == null) {
			NPCType var3 = (NPCType) Client.field7961.list(arg0.field2294);
			arg0.field2363 = new NPCTypeCustomisation(var3, false);
		}
		arg0.field2363.field2688 = method5390();
		arg0.field2363.method4529(arg1, arg2);
	}

	@ObfuscatedName("cc.ty(Lhf;Lyf;I)V")
	public static final void cc_if_npc_setcustombodymodel(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		int var3 = arg1.field8216[--arg1.field8226] - 1;
		if (arg0.field2224 != 6) {
			throw new RuntimeException("");
		} else if (var3 >= 0 && var3 < 12) {
			method5921(arg0, var3, var2, 1.0F, 0, 0, 0, 0, 0, 0);
			Client.method4616(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ho.tb(Lyf;I)V")
	public static final void if_npc_setcustombodymodel(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_npc_setcustombodymodel(var2, arg0);
	}

	@ObfuscatedName("i.tn(Lyf;I)V")
	public static final void cc_npc_setcustombodymodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_npc_setcustombodymodel(var2, arg0);
	}

	@ObfuscatedName("wi.tw(Lhf;Lyf;B)V")
	public static final void cc_if_npc_setcustombodymodel_transformed(Component arg0, ClientScriptState arg1) {
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
			method5921(arg0, var2, var3, var6, var7, var8, var9, var10, var11, var12);
			Client.method4616(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("yr.tz(Lyf;I)V")
	public static final void if_npc_setcustombodymodel_transformed(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_npc_setcustombodymodel_transformed(var2, arg0);
	}

	@ObfuscatedName("vc.tf(Lyf;I)V")
	public static final void cc_npc_setcustombodymodel_transformed(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_npc_setcustombodymodel_transformed(var2, arg0);
	}

	@ObfuscatedName("dm.th(Lhf;Lyf;B)V")
	public static final void cc_if_npc_setcustomheadmodel(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		int var3 = arg1.field8216[--arg1.field8226] - 1;
		if (arg0.field2224 != 2) {
			throw new RuntimeException("");
		} else if (var3 >= 0 && var3 < 5) {
			method2088(arg0, var3, var2);
			Client.method4616(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ii.tt(Lyf;I)V")
	public static final void if_npc_setcustomheadmodel(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_npc_setcustomheadmodel(var2, arg0);
	}

	@ObfuscatedName("hq.ts(Lyf;I)V")
	public static final void cc_npc_setcustomheadmodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_npc_setcustomheadmodel(var2, arg0);
	}

	@ObfuscatedName("aov.tp(Lhf;Lyf;S)V")
	public static final void cc_if_npc_setcustomrecol(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		int var3 = arg1.field8216[--arg1.field8226] - 1;
		int var4 = var3;
		if (arg0.field2224 != 6 && arg0.field2224 != 2) {
			throw new RuntimeException("");
		}
		NPCType var5 = (NPCType) Client.field7961.list(arg0.field2294);
		if (arg0.field2363 == null) {
			arg0.field2363 = new NPCTypeCustomisation(var5, arg0.field2224 == 6);
		}
		arg0.field2363.field2688 = method5390();
		if (var5.field2760 != null) {
			if (var3 < 0 || var3 >= var5.field2760.length) {
				throw new RuntimeException("");
			}
			var4 = var5.field2760[var3];
		}
		if (var5.recol_d == null || var4 < 0 || var4 >= var5.recol_d.length) {
			throw new RuntimeException("");
		}
		arg0.field2363.field2684[var4] = (short) var2;
		Client.method4616(arg0);
	}

	@ObfuscatedName("acr.tv(Lyf;I)V")
	public static final void if_npc_setcustomrecol(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_npc_setcustomrecol(var2, arg0);
	}

	@ObfuscatedName("kn.to(Lyf;I)V")
	public static final void cc_npc_setcustomrecol(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_npc_setcustomrecol(var2, arg0);
	}

	@ObfuscatedName("ajf.tg(Lhf;Lyf;I)V")
	public static final void cc_if_npc_setcustomretex(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.field8216[--arg1.field8226];
		int var3 = arg1.field8216[--arg1.field8226] - 1;
		int var4 = var3;
		if (arg0.field2224 != 6 && arg0.field2224 != 2) {
			throw new RuntimeException("");
		}
		NPCType var5 = (NPCType) Client.field7961.list(arg0.field2294);
		if (arg0.field2363 == null) {
			arg0.field2363 = new NPCTypeCustomisation(var5, arg0.field2224 == 6);
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
		Client.method4616(arg0);
	}

	@ObfuscatedName("kh.tq(Lyf;B)V")
	public static final void if_npc_setcustomretex(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		cc_if_npc_setcustomretex(var2, arg0);
	}

	@ObfuscatedName("f.tx(Lyf;S)V")
	public static final void cc_npc_setcustomretex(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		cc_if_npc_setcustomretex(var2, arg0);
	}

	@ObfuscatedName("sy.tk(Lyf;I)V")
	public static final void if_getx(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2194;
	}

	@ObfuscatedName("as.tl(Lyf;S)V")
	public static final void if_gety(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2195;
	}

	@ObfuscatedName("hv.td(Lyf;I)V")
	public static final void if_getwidth(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2196;
	}

	@ObfuscatedName("vm.ul(Lyf;I)V")
	public static final void if_getheight(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2197;
	}

	@ObfuscatedName("wi.um(Lyf;I)V")
	public static final void if_gethide(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = Client.method16930(var2) ? 1 : 0;
	}

	@ObfuscatedName("ack.uq(Lyf;I)V")
	public static final void if_getlayer(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2200;
	}

	@ObfuscatedName("wf.uc(Lyf;I)V")
	public static final void if_getparentlayer(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		Interface var3 = Component.field11725[var1 >>> 16];
		Component var4 = Client.method6000(var3, var2);
		arg0.field8216[++arg0.field8226 - 1] = var4 == null ? -1 : var4.field2158;
	}

	@ObfuscatedName("ng.ui(Lyf;I)V")
	public static final void if_getcolour(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2210;
	}

	@ObfuscatedName("q.ua(Lyf;B)V")
	public static final void if_getscrollx(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2206;
	}

	@ObfuscatedName("ef.uf(Lyf;I)V")
	public static final void if_getscrolly(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2207;
	}

	@ObfuscatedName("jv.ug(Lyf;I)V")
	public static final void if_getscrollwidth(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2208;
	}

	@ObfuscatedName("ain.ub(Lyf;B)V")
	public static final void if_getscrollheight(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2319;
	}

	@ObfuscatedName("zt.uj(Lyf;S)V")
	public static final void if_getmodelzoom(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2272;
	}

	@ObfuscatedName("aat.ut(Lyf;S)V")
	public static final void if_getmodelangle_x(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2230;
	}

	@ObfuscatedName("acp.uk(Lyf;B)V")
	public static final void if_getmodelangle_z(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2331;
	}

	@ObfuscatedName("gv.uy(Lyf;B)V")
	public static final void if_getmodelangle_y(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2231;
	}

	@ObfuscatedName("zt.uv(Lyf;I)V")
	public static final void if_gettrans(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2212;
	}

	@ObfuscatedName("ar.uw(Lyf;I)V")
	public static final void if_getmodelxof(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2228;
	}

	@ObfuscatedName("agy.up(Lyf;I)V")
	public static final void if_getmodelyof(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2316;
	}

	@ObfuscatedName("cj.ud(Lyf;B)V")
	public static final void if_getgraphic(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2215;
	}

	@ObfuscatedName("dz.uz(Lyf;I)V")
	public static final void if_gettext(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8218[++arg0.field8211 - 1] = var2.field2261;
	}

	@ObfuscatedName("po.uh(Lyf;I)V")
	public static final void if_get2dangle(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2216;
	}

	@ObfuscatedName("kv.us(Lyf;I)V")
	public static final void if_getmodel(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2224 == 1 ? var2.field2294 : -1;
	}

	@ObfuscatedName("iw.ux(Lyf;B)V")
	public static final void if_getfontgraphic(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2287;
	}

	@ObfuscatedName("ac.ur(Lyf;I)V")
	public static final void if_getgraphicdimensions(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		int var3 = -1;
		int var4 = -1;
		Graphic var5 = var2.method3970(Client.renderer);
		if (var5 != null) {
			var3 = var5.field2144;
			var4 = var5.field2146;
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
		arg0.field8216[++arg0.field8226 - 1] = var4;
	}

	@ObfuscatedName("vg.uu(Lyf;I)V")
	public static final void if_getfontmetrics(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2287;
	}

	@ObfuscatedName("to.uo(Lyf;S)V")
	public static final void if_getinvobject(ClientScriptState arg0) {
		Component var1 = Component.method10202(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2334;
	}

	@ObfuscatedName("h.un(Lyf;I)V")
	public static final void if_getinvcount(ClientScriptState arg0) {
		Component var1 = Component.method10202(arg0.field8216[--arg0.field8226]);
		if (var1.field2334 == -1) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1.field2335;
		}
	}

	@ObfuscatedName("gz.ue(Lyf;B)V")
	public static final void if_hassub(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		SubInterface var2 = (SubInterface) Client.field10979.method14495((long) var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		}
	}

	@ObfuscatedName("hp.vq(Lyf;I)V")
	public static final void if_getnextsubid(ClientScriptState arg0) {
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

	@ObfuscatedName("hy.vx(Lyf;I)V")
	public static final void method4067(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		SubInterface var3 = (SubInterface) Client.field10979.method14495((long) var1);
		if (var3 != null && var3.field11571 == var2) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("jx.vb(Lyf;B)V")
	public static final void if_hassubmodal(ClientScriptState arg0) {
		method4067(arg0);
	}

	@ObfuscatedName("vc.vl(Lyf;B)V")
	public static final void if_hassuboverlay(ClientScriptState arg0) {
		method4067(arg0);
	}

	@ObfuscatedName("agk.vr(Lyf;I)V")
	public static final void if_gettargetmask(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		arg0.field8216[++arg0.field8226 - 1] = Client.method17197(var2).method17691();
	}

	@ObfuscatedName("va.vo(Lyf;I)V")
	public static final void if_getop(ClientScriptState arg0) {
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
	public static final void if_getopbase(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Component var2 = Component.method10202(var1);
		if (var2.field2279 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field2279;
		}
	}

	@ObfuscatedName("kf.vw(Lyf;B)V")
	public static final void mes(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ChatHistory.method4943(var1);
	}

	@ObfuscatedName("aau.vt(Lyf;I)V")
	public static final void if_close(ClientScriptState arg0) {
		Client.method8276(true);
	}

	@ObfuscatedName("mz.vu(Lyf;B)V")
	public static final void resume_countdialog(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = 0;
		if (StringTools.method9836(var1)) {
			var2 = StringTools.method9595(var1);
		}
		ClientMessage var3 = ClientMessage.method1604(ClientProt.RESUME_P_COUNTDIALOG, Client.gameConnection.field794);
		var3.buf.p4(var2);
		Client.gameConnection.queue(var3);
	}

	@ObfuscatedName("yj.vi(Lyf;I)V")
	public static final void resume_namedialog(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var2 = ClientMessage.method1604(ClientProt.RESUME_P_NAMEDIALOG, Client.gameConnection.field794);
		var2.buf.p1(var1.length() + 1);
		var2.buf.pjstr(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("qh.va(Lyf;I)V")
	public static final void resume_stringdialog(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var2 = ClientMessage.method1604(ClientProt.RESUME_P_STRINGDIALOG, Client.gameConnection.field794);
		var2.buf.p1(var1.length() + 1);
		var2.buf.pjstr(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("sq.vs(Lyf;I)V")
	public static final void abort_dialog(ClientScriptState arg0) {
		ClientMessage var1 = ClientMessage.method1604(ClientProt.ABORT_P_DIALOG, Client.gameConnection.field794);
		Client.gameConnection.queue(var1);
	}

	@ObfuscatedName("ub.vy(Lyf;S)V")
	public static final void opplayer(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		Client.method15190(var1, var2);
	}

	@ObfuscatedName("ge.ve(Lyf;I)V")
	public static final void if_dragpickup(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Component var4 = Component.method10202(var3);
		Client.method16750(var4, var1, var2);
	}

	@ObfuscatedName("qe.vm(Lyf;I)V")
	public static final void cc_dragpickup(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ActiveComponent var3 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Client.method16750(var3.field8242, var1, var2);
	}

	@ObfuscatedName("na.vg(Lyf;B)V")
	public static final void resume_objdialog(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ClientMessage var2 = ClientMessage.method1604(ClientProt.RESUME_P_OBJDIALOG, Client.gameConnection.field794);
		var2.buf.p2(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("acb.vp(Lyf;S)V")
	public static final void if_opensubclient(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4489(var1, new SubInterface(var2, 3), null, true);
	}

	@ObfuscatedName("aar.vd(Lyf;S)V")
	public static final void if_closesubclient(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		SubInterface var2 = (SubInterface) Client.field10979.method14495((long) var1);
		if (var2 != null && var2.field11570 == 3) {
			Client.method214(var2, true, true);
		}
	}

	@ObfuscatedName("hv.vh(Lyf;B)V")
	public static final void opplayert(ClientScriptState arg0) {
		Client.method4406((String) arg0.field8218[--arg0.field8211]);
	}

	@ObfuscatedName("ah.vz(Lyf;I)V")
	public static final void mes_typed(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		String var3 = (String) arg0.field8218[--arg0.field8211];
		if (var1 == 99) {
			DeveloperConsole.addline(var3);
		} else if (var1 == 98) {
			DeveloperConsole.method722(var3);
		} else {
			ChatHistory.method2664(var1, var2, "", "", "", var3, null);
		}
	}

	@ObfuscatedName("nk.vj(Lyf;B)V")
	public static final void setup_messagebox(ClientScriptState arg0) {
		arg0.field8226 -= 11;
		LoadingScreenAlignmentX[] var1 = LoadingScreenAlignmentX.method13948();
		LoadingScreenAlignmentY[] var2 = LoadingScreenAlignmentY.method2774();
		MessageBox.method3004(var1[arg0.field8216[arg0.field8226]], var2[arg0.field8216[arg0.field8226 + 1]], arg0.field8216[arg0.field8226 + 2], arg0.field8216[arg0.field8226 + 3], arg0.field8216[arg0.field8226 + 4], arg0.field8216[arg0.field8226 + 5], arg0.field8216[arg0.field8226 + 6], arg0.field8216[arg0.field8226 + 7], arg0.field8216[arg0.field8226 + 8], arg0.field8216[arg0.field8226 + 9], arg0.field8216[arg0.field8226 + 10]);
	}

	@ObfuscatedName("uv.vc(Lyf;I)V")
	public static final void resume_hsldialog(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ClientMessage var2 = ClientMessage.method1604(ClientProt.RESUME_P_HSLDIALOG, Client.gameConnection.field794);
		var2.buf.p2(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("qa.vn(Lyf;S)V")
	public static final void resume_clanforumqfcdialog(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var2 = ClientMessage.method1604(ClientProt.RESUME_P_CLANFORUMQFCDIALOG, Client.gameConnection.field794);
		var2.buf.p1(var1.length() + 1);
		var2.buf.pjstr(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("qo.vf(Lyf;I)V")
	public static final void sound_synth(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		short var4 = 255;
		short var5 = 256;
		Client.field1798.method3191(SoundType.field1828, var1, var2, var4, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("jf.vk(Lyf;I)V")
	public static final void sound_song(ClientScriptState arg0) {
		Client.field1798.method3174(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("o.wn(Lyf;I)V")
	public static final void sound_jingle(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		Client.field1798.method3235(arg0.field8216[arg0.field8226], 255);
	}

	@ObfuscatedName("e.wa(Lyf;I)V")
	public static final void sound_synth_volume(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		short var5 = 256;
		Client.field1798.method3191(SoundType.field1828, var1, var2, var4, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("ahb.wo(Lyf;I)V")
	public static final void sound_song_volume(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		Client.field1798.method3235(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1]);
	}

	@ObfuscatedName("aj.wu(Lyf;I)V")
	public static final void sound_jingle_volume(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		Client.field1798.method3235(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 2]);
	}

	@ObfuscatedName("ev.wk(Lyf;I)V")
	public static final void sound_vorbis_volume(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		short var5 = 256;
		Client.field1798.method3191(SoundType.field1828, var1, var2, var4, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("tg.wz(Lyf;B)V")
	public static final void sound_speech_volume(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		short var5 = 256;
		Client.field1798.method3191(SoundType.field1828, var1, var2, var4, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("iq.wj(Lyf;I)V")
	public static final void sound_synth_rate(ClientScriptState arg0) {
		arg0.field8226 -= 5;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		Client.field1798.method3191(SoundType.field1828, var1, var2, var4, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("ahp.we(Lyf;I)V")
	public static final void sound_vorbis_rate(ClientScriptState arg0) {
		arg0.field8226 -= 5;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		Client.field1798.method3191(SoundType.field1828, var1, var2, var4, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("pw.wr(Lyf;I)V")
	public static final void sound_song_stop(ClientScriptState arg0) {
		Client.field1798.method3178();
	}

	@ObfuscatedName("sk.wl(Lyf;I)V")
	public static final void sound_vorbis_volume_rate_group(ClientScriptState arg0) {
		arg0.field8226 -= 6;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		int var6 = arg0.field8216[arg0.field8226 + 5];
		Sound var7 = Client.field1798.method3236(SoundType.field1832, Client.field1798, var1, var2, var4, SubBussType.field1805.method3034(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, false);
		if (var7 != null) {
			Client.field1798.method3251(var7, var6, var3);
		}
	}

	@ObfuscatedName("wb.wp(Lyf;I)V")
	public static final void sound_group_start(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		Client.field1798.method3208(var1);
	}

	@ObfuscatedName("hx.wv(Lyf;S)V")
	public static final void sound_group_stop(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		Client.field1798.method3153(var1);
	}

	@ObfuscatedName("a.wg(Lyf;B)V")
	public static final void sound_mixbuss_add(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Client.field1798.method3156(var1, var2, var3);
	}

	@ObfuscatedName("ge.wb(Lyf;I)V")
	public static final void sound_mixbuss_setlevel(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.field1798.method3157(var1, var2);
	}

	@ObfuscatedName("nv.wq(Lyf;B)V")
	public static final void sound_distancefocusfilter_setparams(ClientScriptState arg0) {
		arg0.field8226 -= 5;
	}

	@ObfuscatedName("ey.wm(Lyf;I)V")
	public static final void clientclock(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10903;
	}

	@ObfuscatedName("ru.wf(Lyf;S)V")
	public static final void inv_getobj(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method14439(var1, var2, false);
	}

	@ObfuscatedName("alm.wc(Lyf;B)V")
	public static final void inv_getnum(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method14483(var1, var2, false);
	}

	@ObfuscatedName("iz.wt(Lyf;I)V")
	public static final void inv_total(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method6002(var1, var2, false);
	}

	@ObfuscatedName("tg.wx(Lyf;S)V")
	public static final void inv_totalcat(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method14914(var1, var2, false);
	}

	@ObfuscatedName("yc.wh(Lyf;I)V")
	public static final void inv_size(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((InvType) Client.field7762.list(var1)).size;
	}

	@ObfuscatedName("su.wd(Lyf;I)V")
	public static final void inv_stockbase(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		InvType var1 = (InvType) Client.field7762.list(arg0.field8216[arg0.field8226]);
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = -1;
		for (int var4 = 0; var4 < var1.stockLength; var4++) {
			if (var1.stockobj[var4] == var2) {
				var3 = var1.stockcount[var4];
				break;
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("jh.ww(Lyf;B)V")
	public static final void inv_getvar(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method15241(var1, var2, var3, false);
	}

	@ObfuscatedName("nn.ws(Lyf;S)V")
	public static final void stat(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field7410.method700(var1);
	}

	@ObfuscatedName("eb.wi(Lyf;I)V")
	public static final void stat_base(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field7410.method674(var1);
	}

	@ObfuscatedName("xa.wy(Lyf;B)V")
	public static final void stat_visible_xp(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field7410.method671(var1);
	}

	@ObfuscatedName("xl.xm(Lyf;I)V")
	public static final void stat_base_actual(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field7410.method687(var1);
	}

	@ObfuscatedName("ze.xl(Lyf;I)V")
	public static final void stat_visible_xp_actual(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field7410.method675(var1);
	}

	@ObfuscatedName("afv.xy(Lyf;I)V")
	public static final void facing_fine(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field4490.field10395.method316();
	}

	@ObfuscatedName("xr.xw(Lyf;S)V")
	public static final void coord(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field4490.method16521().pack();
	}

	@ObfuscatedName("gd.xu(Lyf;I)V")
	public static final void coordx(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = var1 >> 14 & 0x3FFF;
	}

	@ObfuscatedName("xk.xv(Lyf;I)V")
	public static final void coordy(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = var1 >> 28;
	}

	@ObfuscatedName("ain.xn(Lyf;I)V")
	public static final void coordz(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = var1 & 0x3FFF;
	}

	@ObfuscatedName("tg.xg(Lyf;B)V")
	public static final void coord_fine(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = Client.field4490.method16537();
	}

	@ObfuscatedName("yw.xa(Lyf;I)V")
	public static final void coordx_fine(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = var1.x;
	}

	@ObfuscatedName("tk.xi(Lyf;I)V")
	public static final void coordy_fine(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = var1.y;
	}

	@ObfuscatedName("abd.xz(Lyf;I)V")
	public static final void coordz_fine(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = var1.z;
	}

	@ObfuscatedName("po.xh(Lyf;I)V")
	public static final void coordlevel_fine(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		arg0.field8216[++arg0.field8226 - 1] = var1.level;
	}

	@ObfuscatedName("xk.xp(Lyf;I)V")
	public static final void movecoord_fine(ClientScriptState arg0) {
		CoordFine var1 = CoordFine.method7078((CoordFine) arg0.field8218[--arg0.field8211]);
		arg0.field8226 -= 4;
		var1.level += arg0.field8216[arg0.field8226];
		var1.x += arg0.field8216[arg0.field8226 + 1];
		var1.y += arg0.field8216[arg0.field8226 + 2];
		var1.z += arg0.field8216[arg0.field8226 + 3];
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("h.xx(Lyf;I)V")
	public static final void coord_finetogrid(ClientScriptState arg0) {
		CoordGrid var1 = new CoordGrid();
		var1.fromFine((CoordFine) arg0.field8218[--arg0.field8211]);
		arg0.field8216[++arg0.field8226 - 1] = var1.pack();
	}

	@ObfuscatedName("rl.xs(Lyf;B)V")
	public static final void coord_gridtofine(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		arg0.field8218[++arg0.field8211 - 1] = CoordFine.method849(var1, var2);
	}

	@ObfuscatedName("kh.xr(Lyf;I)V")
	public static final void map_members(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10948 ? 1 : 0;
	}

	@ObfuscatedName("mc.xc(Lyf;I)V")
	public static final void map_preload(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("xd.xb(Lyf;B)V")
	public static final void map_loadedpercent(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 100;
	}

	@ObfuscatedName("ir.xe(Lyf;B)V")
	public static final void map_loadingscreen_settriggerpercent(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("nv.xd(Lyf;I)V")
	public static final void map_loadingscreen_isopen(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("bc.xj(Lyf;I)V")
	public static final void invother_getobj(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method14439(var1, var2, true);
	}

	@ObfuscatedName("ahd.xo(Lyf;I)V")
	public static final void invother_getnum(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method14483(var1, var2, true);
	}

	@ObfuscatedName("ul.xk(Lyf;I)V")
	public static final void invother_total(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method6002(var1, var2, true);
	}

	@ObfuscatedName("iy.xq(Lyf;I)V")
	public static final void invother_getvar(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method15241(var1, var2, var3, true);
	}

	@ObfuscatedName("pm.xf(Lyf;I)V")
	public static final void staffmodlevel(ClientScriptState arg0) {
		if (Client.field10949 >= 2) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field10949;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("iq.xt(Lyf;I)V")
	public static final void reboottimer(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10831;
	}

	@ObfuscatedName("vp.ye(Lyf;I)V")
	public static final void map_world(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = WorldSwitcher.field8755.node;
	}

	@ObfuscatedName("zu.yo(Lyf;I)V")
	public static final void runenergy_visible(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11049;
	}

	@ObfuscatedName("xs.yj(Lyf;B)V")
	public static final void runweight_visible(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11102;
	}

	@ObfuscatedName("qh.ys(Lyf;B)V")
	public static final void playermod(ClientScriptState arg0) {
		if (Client.field10950 >= 5 && Client.field10950 <= 9) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("amz.yk(Lyf;I)V")
	public static final void playermodlevel(ClientScriptState arg0) {
		if (Client.field10950 >= 5 && Client.field10950 <= 9) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field10950;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("rz.yn(Lyf;B)V")
	public static final void playermember(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11006 ? 1 : 0;
	}

	@ObfuscatedName("fl.yg(Lyf;I)V")
	public static final void comlevel_active(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field4490.field12064;
	}

	@ObfuscatedName("ux.yq(Lyf;I)V")
	public static final void gender(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field4490.field12061 != null && Client.field4490.field12061.field7897 ? 1 : 0;
	}

	@ObfuscatedName("uh.yh(Lyf;I)V")
	public static final void map_quickchat(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11101 ? 1 : 0;
	}

	@ObfuscatedName("hn.yb(Lyf;B)V")
	public static final void inv_freespace(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method7007(var1, false);
	}

	@ObfuscatedName("vd.yp(Lyf;I)V")
	public static final void inv_totalparam(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method7077(var1, var2, false, false);
	}

	@ObfuscatedName("kl.yz(Lyf;B)V")
	public static final void inv_totalparam_stack(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = ClientInvCache.method7077(var1, var2, true, false);
	}

	@ObfuscatedName("kg.yw(Lyf;I)V")
	public static final void map_lang(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.language.getId();
	}

	@ObfuscatedName("va.yx(Lyf;S)V")
	public static final void movecoord(ClientScriptState arg0) {
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
	public static final void affiliate(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10772;
	}

	@ObfuscatedName("uf.yl(Lyf;I)V")
	public static final void profile_cpu(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = CpuProfiling.method270();
	}

	@ObfuscatedName("sd.yi(Lyf;I)V")
	public static final void playerdemo(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("adp.yv(Lyf;I)V")
	public static final void applet_hasfocus(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = GameShell.focus ? 1 : 0;
	}

	@ObfuscatedName("ach.ym(Lyf;B)V")
	public static final void frombilling(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10774 ? 1 : 0;
	}

	@ObfuscatedName("ank.yf(Lyf;B)V")
	public static final void get_mousex(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field9182.method9086();
	}

	@ObfuscatedName("dl.ya(Lyf;I)V")
	public static final void get_mousey(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field9182.method9092();
	}

	@ObfuscatedName("aks.yd(Lyf;I)V")
	public static final void get_active_minimenu_entry(ClientScriptState arg0) {
		method4597(MiniMenu.method4924(), arg0);
	}

	@ObfuscatedName("oh.yy(Lyf;B)V")
	public static final void get_second_minimenu_entry(ClientScriptState arg0) {
		method4597(MiniMenu.method3558(), arg0);
	}

	@ObfuscatedName("jk.yc(Lyf;B)V")
	public static final void get_minimenu_length(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = MiniMenu.field546;
		arg0.field8216[++arg0.field8226 - 1] = MiniMenu.field543;
	}

	@ObfuscatedName("ake.yu(Lyf;I)V")
	public static final void npc_find_active_minimenu_entry(ClientScriptState arg0) {
		MinimenuEntry var1 = MiniMenu.method4924();
		if (MiniMenu.method18429(var1) == 4) {
			ObjectWrapper var2 = (ObjectWrapper) Client.field10838.method14495(var1.method19370());
			if (var2 != null) {
				arg0.field8221 = (PathingEntity) var2.field11436;
				arg0.field8216[++arg0.field8226 - 1] = 1;
				return;
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ai.yt(Lyf;I)V")
	public static final void player_find_active_minimenu_entry(ClientScriptState arg0) {
		MinimenuEntry var1 = MiniMenu.method4924();
		if (MiniMenu.method18429(var1) == 7) {
			int var2 = (int) var1.method19368();
			if (var2 >= 0 && var2 <= ReceivePlayerPositions.field698) {
				PlayerEntity var3 = Client.field10944[var2];
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
	public static final void get_currentcursor(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10972;
	}

	@ObfuscatedName("nu.za(Lyf;I)V")
	public static final void get_selfyangle(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field4490.field10395.method316() >> 3;
	}

	@ObfuscatedName("ve.zn(Lyf;S)V")
	public static final void map_isowner(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (Client.field10250 != null && Client.field10250.equalsIgnoreCase(var1)) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("sn.zt(Lyf;B)V")
	public static final void get_mousebuttons(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field9182.method9101() ? 1 : 0;
		arg0.field8216[++arg0.field8226 - 1] = Client.field9182.method9121() ? 1 : 0;
		arg0.field8216[++arg0.field8226 - 1] = Client.field9182.method9125() ? 1 : 0;
	}

	@ObfuscatedName("qw.zy(Lyf;S)V")
	public static final void self_player_uid(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10945;
	}

	@ObfuscatedName("dz.zi(Lyf;B)V")
	public static final void get_minimenu_target(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10973 ? 1 : 0;
		arg0.field8218[++arg0.field8211 - 1] = Client.field10977 == null ? "" : Client.field10977;
		arg0.field8218[++arg0.field8211 - 1] = Client.field11039 == null ? "" : Client.field11039;
	}

	@ObfuscatedName("aob.zj(Lyf;I)V")
	public static final void enum_string(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		EnumType var3 = (EnumType) Client.field8514.list(var1);
		if (ScriptVarType.STRING != var3.outputtype) {
		}
		arg0.field8218[++arg0.field8211 - 1] = var3.method14849(var2);
	}

	@ObfuscatedName("uw.zw(Lyf;I)V")
	public static final void _enum(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		EnumType var5 = (EnumType) Client.field8514.list(var3);
		if (var5.inputtype.getId() != var1 || var5.outputtype.getId() != var2) {
			throw new RuntimeException(var3 + " " + var4);
		} else if (var2 == ScriptVarType.STRING.getId()) {
			arg0.field8218[++arg0.field8211 - 1] = var5.method14849(var4);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var5.method14848(var4);
		}
	}

	@ObfuscatedName("sd.zq(Lyf;I)V")
	public static final void enum_hasoutput(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var4 = (EnumType) Client.field8514.list(var2);
		if (var4.outputtype.getId() != var1) {
			throw new RuntimeException();
		}
		arg0.field8216[++arg0.field8226 - 1] = var4.method14851(var3) ? 1 : 0;
	}

	@ObfuscatedName("gj.zo(Lyf;I)V")
	public static final void enum_hasoutput_string(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		EnumType var3 = (EnumType) Client.field8514.list(var1);
		if (ScriptVarType.STRING != var3.outputtype) {
			throw new RuntimeException();
		}
		arg0.field8216[++arg0.field8226 - 1] = var3.method14851(var2) ? 1 : 0;
	}

	@ObfuscatedName("xh.zk(Lyf;I)V")
	public static final void enum_getoutputcount(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		EnumType var2 = (EnumType) Client.field8514.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.method14847();
	}

	@ObfuscatedName("aaj.zm(Lyf;I)V")
	public static final void enum_getreversecount(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var4 = (EnumType) Client.field8514.list(var2);
		if (var4.outputtype.getId() != var1) {
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
	public static final void enum_getreversecount_string(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		EnumType var3 = (EnumType) Client.field8514.list(var1);
		if (ScriptVarType.STRING != var3.outputtype) {
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
	public static final void enum_getreverseindex(ClientScriptState arg0) {
		arg0.field8226 -= 5;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		if (var3 == -1) {
			throw new RuntimeException();
		}
		EnumType var6 = (EnumType) Client.field8514.list(var3);
		if (var6.inputtype.getId() != var2) {
			throw new RuntimeException();
		} else if (var6.outputtype.getId() == var1) {
			int[] var7 = var6.method14867(var4);
			if (var5 < 0 || var7 == null || var7.length <= var5) {
				throw new RuntimeException();
			}
			arg0.field8216[++arg0.field8226 - 1] = var7[var5];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("rg.ze(Lyf;I)V")
	public static final void enum_getreverseindex_string(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		String var4 = (String) arg0.field8218[--arg0.field8211];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var5 = (EnumType) Client.field8514.list(var2);
		if (var5.inputtype.getId() != var1) {
			throw new RuntimeException();
		} else if (var5.outputtype.getId() == ScriptVarType.STRING.getId()) {
			int[] var6 = var5.method14867(var4);
			if (var3 < 0 || var6 == null || var6.length <= var3) {
				throw new RuntimeException();
			}
			arg0.field8216[++arg0.field8226 - 1] = var6[var3];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("va.zv(Lyf;I)V")
	public static final void email_validation_submit_code(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var2 = ClientMessage.method1604(ClientProt.SEND_EMAIL_VALIDATION_CODE, Client.lobbyConnection.field794);
		var2.buf.p1(Packet.pjstrlen(var1));
		var2.buf.pjstr(var1);
		Client.lobbyConnection.queue(var2);
	}

	@ObfuscatedName("sc.zc(Lyf;I)V")
	public static final void email_validation_change_address(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		ClientMessage var3 = ClientMessage.method1604(ClientProt.CHANGE_EMAIL_ADDRESS, Client.lobbyConnection.field794);
		var3.buf.p2(Packet.pjstrlen(var1) + Packet.pjstrlen(var2));
		var3.buf.pjstr(var1);
		var3.buf.pjstr(var2);
		Client.lobbyConnection.queue(var3);
	}

	@ObfuscatedName("du.zp(Lyf;I)V")
	public static final void email_validation_add_new_address(ClientScriptState arg0) {
		arg0.field8211--;
		arg0.field8226 -= 3;
		String var1 = (String) arg0.field8218[arg0.field8211];
		boolean var2 = arg0.field8216[arg0.field8226] == 1;
		boolean var3 = arg0.field8216[arg0.field8226 + 1] == 1;
		boolean var4 = arg0.field8216[arg0.field8226 + 2] == 1;
		ClientMessage var5 = ClientMessage.method1604(ClientProt.ADD_NEW_EMAIL_ADDRESS, Client.lobbyConnection.field794);
		var5.buf.p2(Packet.pjstrlen(var1) + 1);
		var5.buf.pjstr(var1);
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
		var5.buf.p1(var6);
		Client.lobbyConnection.queue(var5);
	}

	@ObfuscatedName("vc.zz(Lyf;I)V")
	public static final void friend_count(ClientScriptState arg0) {
		if (Client.field11080 == 0) {
			arg0.field8216[++arg0.field8226 - 1] = -2;
		} else if (Client.field11080 == 1) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field10811;
		}
	}

	@ObfuscatedName("pz.zs(Lyf;I)V")
	public static final void friend_getname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 != 2 || var1 >= Client.field10811) {
			arg0.field8218[++arg0.field8211 - 1] = "";
			arg0.field8218[++arg0.field8211 - 1] = "";
			return;
		}
		Friend var2 = Client.field11065[var1];
		arg0.field8218[++arg0.field8211 - 1] = var2.field606;
		if (var2.field607 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field607;
		}
	}

	@ObfuscatedName("vv.zl(Lyf;I)V")
	public static final void friend_getworld(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 < Client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field11065[var1].field608;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("ajd.zb(Lyf;I)V")
	public static final void friend_getrank(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 < Client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field11065[var1].field610;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("ik.zg(Lyf;B)V")
	public static final void friend_getnotes(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 < Client.field10811) {
			arg0.field8218[++arg0.field8211 - 1] = Client.field11065[var1].field614;
		} else {
			arg0.field8218[++arg0.field8211 - 1] = "";
		}
	}

	@ObfuscatedName("qm.zx(Lyf;B)V")
	public static final void friend_getworldflags(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 < Client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field11065[var1].field615;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("xs.zr(Lyf;I)V")
	public static final void friend_setrank(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		Client.method10344(var1, var2);
	}

	@ObfuscatedName("pj.zf(Lyf;I)V")
	public static final void friend_setnotes(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		Client.method10360(var1, var2);
	}

	@ObfuscatedName("ij.aag(Lyf;I)V")
	public static final void friend_add(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Client.method6829(var1);
	}

	@ObfuscatedName("yg.aak(Lyf;I)V")
	public static final void friend_del(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Client.method9390(var1);
	}

	@ObfuscatedName("vx.aad(Lyf;I)V")
	public static final void ignore_add(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Client.method1002(var1, false);
	}

	@ObfuscatedName("qn.aaa(Lyf;I)V")
	public static final void ignore_del(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Client.method1574(var1);
	}

	@ObfuscatedName("ex.aax(Lyf;I)V")
	public static final void ignore_setnotes(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		Client.method14701(var1, var2);
	}

	@ObfuscatedName("nd.aat(Lyf;B)V")
	public static final void friend_test(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.field8216[++arg0.field8226 - 1] = Client.method3060(var1) ? 1 : 0;
	}

	@ObfuscatedName("hs.aas(Lyf;B)V")
	public static final void friend_getworldname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 < Client.field10811) {
			arg0.field8218[++arg0.field8211 - 1] = Client.field11065[var1].field612;
		} else {
			arg0.field8218[++arg0.field8211 - 1] = "";
		}
	}

	@ObfuscatedName("wm.aaf(Lyf;I)V")
	public static final void clan_getchatdisplayname(ClientScriptState arg0) {
		if (Client.field11055 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Base37.method15309(Client.field11055);
		}
	}

	@ObfuscatedName("px.aar(Lyf;I)V")
	public static final void clan_getchatcount(ClientScriptState arg0) {
		if (Client.field11055 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field7421;
		}
	}

	@ObfuscatedName("vr.aai(Lyf;I)V")
	public static final void clan_getchatusername(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11055 == null || var1 >= Client.field7421) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Client.field9267[var1].field756;
		}
	}

	@ObfuscatedName("afq.aap(Lyf;I)V")
	public static final void clan_getchatuserworld(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11055 == null || var1 >= Client.field7421) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field9267[var1].field758;
		}
	}

	@ObfuscatedName("fo.aaq(Lyf;B)V")
	public static final void clan_getchatuserrank(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11055 == null || var1 >= Client.field7421) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field9267[var1].field760;
		}
	}

	@ObfuscatedName("nq.aau(Lyf;I)V")
	public static final void clan_getchatminkick(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field2154;
	}

	@ObfuscatedName("dm.aao(Lyf;I)V")
	public static final void clan_kickuser(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Client.method16638(var1);
	}

	@ObfuscatedName("yo.aaj(Lyf;I)V")
	public static final void clan_getchatrank(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field1914;
	}

	@ObfuscatedName("ka.aab(Lyf;B)V")
	public static final void clan_joinchat(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Client.method1600(var1);
	}

	@ObfuscatedName("ap.aae(Lyf;I)V")
	public static final void clan_leavechat(ClientScriptState arg0) {
		Client.method8328();
	}

	@ObfuscatedName("zs.aal(Lyf;S)V")
	public static final void ignore_count(ClientScriptState arg0) {
		if (Client.field11080 == 0) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field11084;
		}
	}

	@ObfuscatedName("fl.aaz(Lyf;I)V")
	public static final void ignore_getname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 0 || var1 >= Client.field11084) {
			arg0.field8218[++arg0.field8211 - 1] = "";
			arg0.field8218[++arg0.field8211 - 1] = "";
			return;
		}
		Ignore var2 = Client.field11086[var1];
		arg0.field8218[++arg0.field8211 - 1] = var2.field598;
		if (var2.field596 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field596;
		}
	}

	@ObfuscatedName("ad.aan(Lyf;I)V")
	public static final void ignore_getnotes(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 0 || var1 >= Client.field11084) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Client.field11086[var1].field597;
		}
	}

	@ObfuscatedName("ts.aah(Lyf;S)V")
	public static final void ignore_test(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.field8216[++arg0.field8226 - 1] = Client.method6789(var1) ? 1 : 0;
	}

	@ObfuscatedName("eb.aaw(Lyf;I)V")
	public static final void clan_isself(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field9267 == null || var1 >= Client.field7421 || !Client.field9267[var1].field757.equalsIgnoreCase(Client.field4490.field12062)) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		}
	}

	@ObfuscatedName("ft.aay(Lyf;I)V")
	public static final void clan_getchatownername(ClientScriptState arg0) {
		if (Client.field11030 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Client.field11030;
		}
	}

	@ObfuscatedName("ip.aac(Lyf;I)V")
	public static final void clan_getchatuserworldname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11055 == null || var1 >= Client.field7421) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Client.field9267[var1].field759;
		}
	}

	@ObfuscatedName("ad.aav(Lyf;B)V")
	public static final void friend_platform(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 >= 0 && var1 < Client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field11065[var1].field611;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("sg.aam(Lyf;I)V")
	public static final void friend_getslotfromname(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.field8216[++arg0.field8226 - 1] = Client.method7345(var1);
	}

	@ObfuscatedName("ey.abo(Lyf;I)V")
	public static final void ignore_getslotfromname(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.field8216[++arg0.field8226 - 1] = Client.method3598(var1);
	}

	@ObfuscatedName("ad.abr(Lyf;I)V")
	public static final void playercountry(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field8146;
	}

	@ObfuscatedName("uw.abv(Lyf;I)V")
	public static final void ignore_add_temp(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Client.method1002(var1, true);
	}

	@ObfuscatedName("xq.abq(Lyf;B)V")
	public static final void ignore_is_temp(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11086[var1].field595 ? 1 : 0;
	}

	@ObfuscatedName("re.abw(Lyf;I)V")
	public static final void clan_getchatusername_unfiltered(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11055 == null || var1 >= Client.field7421) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Client.field9267[var1].field757;
		}
	}

	@ObfuscatedName("tc.abh(Lyf;I)V")
	public static final void ignore_getname_unfiltered(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 0 || var1 >= Client.field11084) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Client.field11086[var1].field598;
		}
	}

	@ObfuscatedName("eu.abf(Lyf;B)V")
	public static final void friend_is_referrer(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 < Client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field11065[var1].field609 ? 1 : 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("pj.abi(Lyf;I)V")
	public static final void friend_is_referred(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field11080 == 2 && var1 < Client.field10811) {
			arg0.field8216[++arg0.field8226 - 1] = Client.field11065[var1].field613 ? 1 : 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("ahj.abb(Lyf;B)V")
	public static final void player_group_find(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721 == null ? 0 : 1;
	}

	@ObfuscatedName("tj.abc(Lyf;I)V")
	public static final void player_group_member_count(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3397().size();
	}

	@ObfuscatedName("yd.abg(Lyf;I)V")
	public static final void player_group_member_get_same_world_var(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		int var3 = arg0.field8216[arg0.field8226 + 2];
		PlayerGroupMember var4 = Client.field6721.method3392(var1);
		if (var4.method3504() == null) {
			var4.method3503(Client.field10837);
		}
		if (!var2) {
			VarBitType var6 = (VarBitType) Client.field8736.list(var3);
			arg0.field8216[++arg0.field8226 - 1] = var6.getVarbitValue(var4.method3504().method14728(var6.baseVar.id));
			return;
		}
		VarPlayerType var5 = (VarPlayerType) Client.field8485.list(var3);
		switch(var5.dataType.baseType.id) {
			case 2:
				arg0.field8216[++arg0.field8226 - 1] = var4.method3504().method14728(var5.id);
				break;
			case 4:
				arg0.field8224[++arg0.field8238 - 1] = var4.method3504().method14730(var5.id);
				break;
			default:
				arg0.field8218[++arg0.field8211 - 1] = var4.method3504().method14738(var5.id);
		}
	}

	@ObfuscatedName("io.abn(Lyf;I)V")
	public static final void player_group_member_get_rank(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3392(var1).method3493();
	}

	@ObfuscatedName("pv.abj(Lyf;I)V")
	public static final void player_group_member_get_team(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3392(var1).method3497();
	}

	@ObfuscatedName("dg.aba(Lyf;I)V")
	public static final void player_group_member_get_last_seen_node_id(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3392(var1).method3491();
	}

	@ObfuscatedName("au.abz(Lyf;I)V")
	public static final void player_group_member_get_status(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3392(var1).method3495().getId();
	}

	@ObfuscatedName("dm.abu(Lyf;S)V")
	public static final void player_group_member_is_online(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3392(var1).method3529() ? 1 : 0;
	}

	@ObfuscatedName("tz.abl(Lyf;B)V")
	public static final void player_group_member_is_member(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3392(var1).method3500() ? 1 : 0;
	}

	@ObfuscatedName("eb.abp(Lyf;I)V")
	public static final void player_group_member_get_displayname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = Client.field6721.method3392(var1).method3488();
	}

	@ObfuscatedName("l.abm(Lyf;B)V")
	public static final void player_group_member_get_join_xp(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		boolean var3 = arg0.field8216[arg0.field8226 + 2] == 1;
		PlayerStat var4 = Client.field6721.method3392(var1).method3501(var2);
		arg0.field8216[++arg0.field8226 - 1] = var3 ? var4.getBaseLevel() : var4.getXP();
	}

	@ObfuscatedName("ahb.abx(Lyf;I)V")
	public static final void player_group_member_is_owner(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3390() == var1 ? 1 : 0;
	}

	@ObfuscatedName("xd.abk(Lyf;I)V")
	public static final void player_group_banned_count(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3429().size();
	}

	@ObfuscatedName("qs.aby(Lyf;I)V")
	public static final void player_group_banned_get_displayname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = ((PlayerGroupBanned) Client.field6721.method3429().get(var1)).method3540();
	}

	@ObfuscatedName("ux.abe(Lyf;B)V")
	public static final void player_group_get_displayname(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = Client.field6721.method3386();
	}

	@ObfuscatedName("km.abd(Lyf;I)V")
	public static final void player_group_get_max_size(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3387();
	}

	@ObfuscatedName("au.abt(Lyf;B)V")
	public static final void player_group_get_create_mins_since_epoch(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = (int) (Client.field6721.method3388() / 60000L);
	}

	@ObfuscatedName("nj.aca(Lyf;B)V")
	public static final void player_group_get_create_seconds_to_now(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = (int) ((MonotonicTime.method3655() - Client.field6721.method3388() - Client.field1238) / 1000L);
	}

	@ObfuscatedName("sv.acd(Lyf;B)V")
	public static final void player_group_is_members_only(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3441() ? 1 : 0;
	}

	@ObfuscatedName("ahs.ack(Lyf;I)V")
	public static final void player_group_get_overall_status(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3444().getId();
	}

	@ObfuscatedName("ew.acm(Lyf;B)V")
	public static final void player_group_get_owner_slot(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field6721.method3390();
	}

	@ObfuscatedName("fn.act(Lyf;B)V")
	public static final void activeclansettings_find_listened(ClientScriptState arg0) {
		if (Client.field6867 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
			arg0.field8227 = Client.field6867;
			arg0.field8234.put(VarDomainType.CLAN_SETTING, method991(arg0.field8227));
		}
	}

	@ObfuscatedName("acn.aci(Lyf;I)V")
	public static final void activeclansettings_find_affined(ClientScriptState arg0) {
		if (Client.field1890 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
			arg0.field8227 = Client.field1890;
			arg0.field8234.put(VarDomainType.CLAN_SETTING, method991(arg0.field8227));
		}
	}

	@ObfuscatedName("oh.ach(Lyf;B)V")
	public static final void activeclansettings_getclanname(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8227.field3093;
	}

	@ObfuscatedName("fs.acb(Lyf;I)V")
	public static final void activeclansettings_getallowunaffined(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3097 ? 1 : 0;
	}

	@ObfuscatedName("nq.acx(Lyf;I)V")
	public static final void activeclansettings_getranktalk(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3098;
	}

	@ObfuscatedName("ry.acc(Lyf;B)V")
	public static final void activeclansettings_getrankkick(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3090;
	}

	@ObfuscatedName("kh.acw(Lyf;B)V")
	public static final void activeclansettings_getranklootshare(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3100;
	}

	@ObfuscatedName("ng.acv(Lyf;I)V")
	public static final void activeclansettings_getcoinshare(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3117;
	}

	@ObfuscatedName("hy.acu(Lyf;I)V")
	public static final void activeclansettings_getaffinedcount(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3095;
	}

	@ObfuscatedName("qw.acg(Lyf;I)V")
	public static final void activeclansettings_getaffineddisplayname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8227.field3120[var1];
	}

	@ObfuscatedName("eu.acz(Lyf;I)V")
	public static final void activeclansettings_getaffinedrank(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3104[var1];
	}

	@ObfuscatedName("jk.acp(Lyf;I)V")
	public static final void activeclansettings_getaffinedmuted(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3108[var1] ? 1 : 0;
	}

	@ObfuscatedName("fj.acq(Lyf;B)V")
	public static final void activeclansettings_getbannedcount(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3111;
	}

	@ObfuscatedName("ji.acr(Lyf;I)V")
	public static final void activeclansettings_getbanneddisplayname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8227.field3114[var1];
	}

	@ObfuscatedName("o.acj(Lyf;S)V")
	public static final void activeclansettings_getaffinedextrainfo(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.method5257(var1, var2, var3);
	}

	@ObfuscatedName("rl.aco(Lyf;I)V")
	public static final void activeclansettings_getcurrentowner_slot(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3101;
	}

	@ObfuscatedName("aof.ace(Lyf;I)V")
	public static final void activeclansettings_getreplacementowner_slot(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3110;
	}

	@ObfuscatedName("ho.acl(Lyf;I)V")
	public static final void activeclansettings_getaffinedslot(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.method5256((String) arg0.field8218[--arg0.field8211]);
	}

	@ObfuscatedName("to.acy(Lyf;I)V")
	public static final void activeclansettings_getsortedaffinedslot(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = arg0.field8227.method5261()[arg0.field8216[arg0.field8226 - 1]];
	}

	@ObfuscatedName("df.acf(Lyf;B)V")
	public static final void affinedclansettings_addbanned_fromchannel(ClientScriptState arg0) {
		Client.method9925(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("anw.acs(Lyf;I)V")
	public static final void affinedclansettings_setmuted_fromchannel(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		Client.method7045(var1, var2);
	}

	@ObfuscatedName("lv.acn(Lyf;I)V")
	public static final void activeclansettings_getaffinedjoinruneday(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8227.field3107[var1];
	}

	@ObfuscatedName("n.adl(Lyf;I)V")
	public static final void activeclanchannel_find_listened(ClientScriptState arg0) {
		if (Client.field1766 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
			arg0.field8228 = Client.field1766;
		}
	}

	@ObfuscatedName("b.adp(Lyf;I)V")
	public static final void activeclanchannel_find_affined(ClientScriptState arg0) {
		if (Client.field3022 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 1;
			arg0.field8228 = Client.field3022;
		}
	}

	@ObfuscatedName("pu.adc(Lyf;I)V")
	public static final void activeclanchannel_getclanname(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8228.field11396;
	}

	@ObfuscatedName("zr.ada(Lyf;I)V")
	public static final void activeclanchannel_getrankkick(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11398;
	}

	@ObfuscatedName("q.adh(Lyf;I)V")
	public static final void activeclanchannel_getranktalk(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11391;
	}

	@ObfuscatedName("qg.adb(Lyf;B)V")
	public static final void activeclanchannel_getusercount(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11393;
	}

	@ObfuscatedName("qt.adi(Lyf;I)V")
	public static final void activeclanchannel_getuserdisplayname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = arg0.field8228.field11392[var1].field3087;
	}

	@ObfuscatedName("akz.adz(Lyf;I)V")
	public static final void activeclanchannel_getuserrank(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11392[var1].field3089;
	}

	@ObfuscatedName("dj.ads(Lyf;I)V")
	public static final void activeclanchannel_getuserworld(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.field11392[var1].field3088;
	}

	@ObfuscatedName("amg.adg(Lyf;B)V")
	public static final void activeclanchannel_kickuser(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Client.method18674(Client.field3022 == arg0.field8228, var1);
	}

	@ObfuscatedName("il.adn(Lyf;B)V")
	public static final void activeclanchannel_getuserslot(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8228.method17736((String) arg0.field8218[--arg0.field8211]);
	}

	@ObfuscatedName("gr.adk(Lyf;S)V")
	public static final void activeclanchannel_getsorteduserslot(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = arg0.field8228.method17733()[arg0.field8216[arg0.field8226 - 1]];
	}

	@ObfuscatedName("qp.ado(Lyf;B)V")
	public static final void clanprofile_find(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field7698 == null ? 0 : 1;
	}

	@ObfuscatedName("abn.adr(Lyf;I)V")
	public static final void stockmarket_getoffertype(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11057[var2][var1].method7611();
	}

	@ObfuscatedName("fm.ade(Lyf;B)V")
	public static final void stockmarket_getofferitem(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11057[var2][var1].field4959;
	}

	@ObfuscatedName("xu.adf(Lyf;I)V")
	public static final void stockmarket_getofferprice(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11057[var2][var1].field4961;
	}

	@ObfuscatedName("nk.adv(Lyf;I)V")
	public static final void stockmarket_getoffercount(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11057[var2][var1].field4960;
	}

	@ObfuscatedName("vx.adw(Lyf;I)V")
	public static final void stockmarket_getoffercompletedcount(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11057[var2][var1].field4958;
	}

	@ObfuscatedName("kl.adj(Lyf;I)V")
	public static final void stockmarket_getoffercompletedgold(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11057[var2][var1].field4962;
	}

	@ObfuscatedName("jw.adm(Lyf;I)V")
	public static final void stockmarket_isofferempty(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = Client.field11057[var2][var1].method7608();
		arg0.field8216[++arg0.field8226 - 1] = var3 == 0 ? 1 : 0;
	}

	@ObfuscatedName("ru.adx(Lyf;I)V")
	public static final void stockmarket_isofferstable(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = Client.field11057[var2][var1].method7608();
		arg0.field8216[++arg0.field8226 - 1] = var3 == 2 ? 1 : 0;
	}

	@ObfuscatedName("ch.ady(Lyf;S)V")
	public static final void stockmarket_isofferfinished(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = Client.field11057[var2][var1].method7608();
		arg0.field8216[++arg0.field8226 - 1] = var3 == 5 ? 1 : 0;
	}

	@ObfuscatedName("nw.adu(Lyf;I)V")
	public static final void stockmarket_isofferadding(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = Client.field11057[var2][var1].method7608();
		arg0.field8216[++arg0.field8226 - 1] = var3 == 1 ? 1 : 0;
	}

	@ObfuscatedName("py.adt(Lyf;B)V")
	public static final void add(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 + var2;
	}

	@ObfuscatedName("xs.add(Lclient!yf;S)V")
	public static final void sub(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var2 - var3;
	}

	@ObfuscatedName("yx.adq(Lyf;I)V")
	public static final void multiply(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 * var2;
	}

	@ObfuscatedName("pc.aew(Lyf;I)V")
	public static final void divide(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 / var2;
	}

	@ObfuscatedName("in.aeu(Lyf;I)V")
	public static final void random(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = (int) (Math.random() * (double) var1);
	}

	@ObfuscatedName("ck.aez(Lyf;I)V")
	public static final void randominc(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = (int) (Math.random() * (double) (var1 + 1));
	}

	@ObfuscatedName("at.aeh(Lyf;I)V")
	public static final void interpolate(ClientScriptState arg0) {
		arg0.field8226 -= 5;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		arg0.field8216[++arg0.field8226 - 1] = (var2 - var1) * (var5 - var3) / (var4 - var3) + var1;
	}

	@ObfuscatedName("hz.aen(Lyf;I)V")
	public static final void addpercent(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		long var1 = (long) arg0.field8216[arg0.field8226];
		long var3 = (long) arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = (int) (var1 * var3 / 100L + var1);
	}

	@ObfuscatedName("uy.aet(Lyf;I)V")
	public static final void setbit(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 | 0x1 << var2;
	}

	@ObfuscatedName("jx.aer(Lyf;I)V")
	public static final void clearbit(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 & -1 - (0x1 << var2);
	}

	@ObfuscatedName("ahd.aes(Lyf;I)V")
	public static final void testbit(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = (var1 & 0x1 << var2) == 0 ? 0 : 1;
	}

	@ObfuscatedName("k.aeb(Lyf;I)V")
	public static final void modulo(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 % var2;
	}

	@ObfuscatedName("kc.aev(Lyf;I)V")
	public static final void pow(ClientScriptState arg0) {
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
	public static final void invpow(ClientScriptState arg0) {
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
	public static final void and(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 & var2;
	}

	@ObfuscatedName("aik.aec(Lyf;I)V")
	public static final void or(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 | var2;
	}

	@ObfuscatedName("acg.or(Lyf;B)V")
	public static final void min(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 < var2 ? var1 : var2;
	}

	@ObfuscatedName("aht.aeo(Lyf;I)V")
	public static final void max(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 > var2 ? var1 : var2;
	}

	@ObfuscatedName("nf.aeg(Lyf;B)V")
	public static final void scale(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		long var1 = (long) arg0.field8216[arg0.field8226];
		long var3 = (long) arg0.field8216[arg0.field8226 + 1];
		long var5 = (long) arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = (int) (var1 * var5 / var3);
	}

	@ObfuscatedName("ye.ael(Lyf;I)V")
	public static final void bitcount(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = IntMath.method14573(arg0.field8216[arg0.field8226 - 1]);
	}

	@ObfuscatedName("va.aei(Lyf;B)V")
	public static final void togglebit(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1 ^ 0x1 << var2;
	}

	@ObfuscatedName("qv.aef(Lyf;I)V")
	public static final void setbit_range(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = IntMath.method3256(var1, var2, var3);
	}

	@ObfuscatedName("el.aej(Lyf;B)V")
	public static final void clearbit_range(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = IntMath.method3588(var1, var2, var3);
	}

	@ObfuscatedName("jq.aea(Lyf;S)V")
	public static final void getbit_range(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = 31 - var3;
		arg0.field8216[++arg0.field8226 - 1] = var1 << var4 >>> var2 + var4;
	}

	@ObfuscatedName("yx.aed(Lyf;I)V")
	public static final void setbit_range_toint(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = IntMath.method14281(var4 - var3 + 1);
		if (var2 > var5) {
			var2 = var5;
		}
		int var6 = IntMath.method3588(var1, var3, var4);
		arg0.field8216[++arg0.field8226 - 1] = var6 | var2 << var3;
	}

	@ObfuscatedName("ags.aee(Lyf;I)V")
	public static final void sqrt(ClientScriptState arg0) {
		int var1 = arg0.field8216[arg0.field8226 - 1];
		arg0.field8216[arg0.field8226 - 1] = (int) Math.sqrt((double) var1);
	}

	@ObfuscatedName("fa.aek(Lyf;I)V")
	public static final void sin_deg(ClientScriptState arg0) {
		int var1 = arg0.field8216[arg0.field8226 - 1];
		arg0.field8216[arg0.field8226 - 1] = Trig1.method6276(var1);
	}

	@ObfuscatedName("ju.aem(Lyf;B)V")
	public static final void cos_deg(ClientScriptState arg0) {
		int var1 = arg0.field8216[arg0.field8226 - 1];
		arg0.field8216[arg0.field8226 - 1] = Trig1.method6279(var1);
	}

	@ObfuscatedName("akp.aep(Lyf;B)V")
	public static final void atan2_deg(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Trig1.method6280(var1, var2);
	}

	@ObfuscatedName("art.aeq(Lyf;I)V")
	public static final void abs(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Math.abs(var1);
	}

	@ObfuscatedName("ex.abs(Lyf;I)V")
	public static final void random_sound_pitch(ClientScriptState arg0) {
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

	@ObfuscatedName("kz.afq(Lyf;I)V")
	public static final void hsvtorgb(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ColourUtils.field8149[var1 & 0xFFFF];
	}

	@ObfuscatedName("qi.afy(Lyf;I)V")
	public static final void not(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ~var1;
	}

	@ObfuscatedName("xh.afi(Lyf;B)V")
	public static final void append_num(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = var1 + var2;
	}

	@ObfuscatedName("aj.afk(Lyf;I)V")
	public static final void append(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		arg0.field8218[++arg0.field8211 - 1] = var1 + var2;
	}

	@ObfuscatedName("qx.afo(Lyf;I)V")
	public static final void append_signnum(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = var1 + StringTools.method1898(var2, true);
	}

	@ObfuscatedName("tl.afz(Lyf;B)V")
	public static final void get_col_tag(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = TextUtil.method596(var1);
	}

	@ObfuscatedName("jx.afe(Lyf;I)V")
	public static final void lowercase(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8218[++arg0.field8211 - 1] = var1.toLowerCase();
	}

	@ObfuscatedName("hx.afm(Lyf;B)V")
	public static final void fromdate(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = TimeFormatter.method14482(TimeFormatter.method14612(arg0.field8216[--arg0.field8226]), Client.language.getId());
	}

	@ObfuscatedName("vm.afg(Lyf;I)V")
	public static final void text_gender(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		if (Client.field4490.field12061 != null && Client.field4490.field12061.field7897) {
			arg0.field8218[++arg0.field8211 - 1] = var2;
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var1;
		}
	}

	@ObfuscatedName("cj.afa(Lyf;I)V")
	public static final void tostring(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = Integer.toString(var1);
	}

	@ObfuscatedName("ku.afc(Lyf;B)V")
	public static final void compare(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = StringComparator.method6827((String) arg0.field8218[arg0.field8211], (String) arg0.field8218[arg0.field8211 + 1], Client.language);
	}

	@ObfuscatedName("ea.afb(Lyf;B)V")
	public static final void paraheight(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		FontMetrics var4 = Client.field7538.method6163(Client.field10833, var3);
		arg0.field8216[++arg0.field8226 - 1] = var4.method14538(var1, var2, DefaultSprites.field10302);
	}

	@ObfuscatedName("hv.afr(Lyf;I)V")
	public static final void parawidth(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		FontMetrics var4 = Client.field7538.method6163(Client.field10833, var3);
		arg0.field8216[++arg0.field8226 - 1] = var4.method14551(var1, var2, DefaultSprites.field10302);
	}

	@ObfuscatedName("vc.afh(Lyf;I)V")
	public static final void paraline(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 3;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		int var4 = arg0.field8216[arg0.field8226 + 2];
		FontMetrics var5 = Client.field7538.method6163(Client.field10833, var3);
		String var6 = var5.method14539(var1, var2, DefaultSprites.field10302, var4);
		arg0.field8218[++arg0.field8211 - 1] = var6 == null ? "" : var6;
	}

	@ObfuscatedName("ku.afw(Lyf;I)V")
	public static final void text_switch(ClientScriptState arg0) {
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
	public static final void escape(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8218[++arg0.field8211 - 1] = StringHelper.escape(var1);
	}

	@ObfuscatedName("fs.afl(Lyf;I)V")
	public static final void append_char(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		if (var2 == -1) {
			throw new RuntimeException("");
		}
		arg0.field8218[++arg0.field8211 - 1] = var1 + (char) var2;
	}

	@ObfuscatedName("wi.afs(Lyf;B)V")
	public static final void char_isprintable(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = StringTools.method17828((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("pn.afx(Lyf;I)V")
	public static final void char_isvalid(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Cp1252.method10348((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("ahx.aff(Lyf;B)V")
	public static final void char_isalphanumeric(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = StringTools.method2883((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("dz.afv(Lyf;I)V")
	public static final void char_isalpha(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = StringTools.method14704((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("sr.afu(Lyf;I)V")
	public static final void char_isnumeric(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = StringTools.method6819((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("vc.aft(Lyf;S)V")
	public static final void string_length(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (var1 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1.length();
		}
	}

	@ObfuscatedName("ex.afn(Lyf;I)V")
	public static final void substring(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8218[++arg0.field8211 - 1] = var1.substring(var2, var3);
	}

	@ObfuscatedName("tj.afj(Lyf;I)V")
	public static final void removetags(ClientScriptState arg0) {
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
	public static final void string_indexof_char(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("nq.agv(Lyf;I)V")
	public static final void string_indexof_string(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		int var3 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("gj.aga(Lyf;I)V")
	public static final void char_tolowercase(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Character.toLowerCase((char) var1);
	}

	@ObfuscatedName("ex.agi(Lyf;I)V")
	public static final void char_touppercase(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Character.toUpperCase((char) var1);
	}

	@ObfuscatedName("tb.agg(Lyf;B)V")
	public static final void tostring_localised(ClientScriptState arg0) {
		boolean var1 = arg0.field8216[--arg0.field8226] != 0;
		int var2 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = StringComparator.method1582((long) var2, 0, var1, Client.language);
	}

	@ObfuscatedName("xh.agx(Lyf;I)V")
	public static final void stringwidth(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		FontMetrics var3 = Client.field7538.method6163(Client.field10833, var2);
		arg0.field8216[++arg0.field8226 - 1] = var3.method14533(var1, DefaultSprites.field10302);
	}

	@ObfuscatedName("ap.agj(Lyf;B)V")
	public static final void string_distance(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		arg0.field8216[++arg0.field8226 - 1] = StringTools.method13835(var1, var2);
	}

	@ObfuscatedName("gq.age(Lyf;B)V")
	public static final void format_datetime_from_minutes(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = TimeFormatter.method6058((long) arg0.field8216[--arg0.field8226] * 60000L, Client.language.getId(), true) + " UTC";
	}

	@ObfuscatedName("t.agk(Lyf;S)V")
	public static final void clanforumqfc_tostring(ClientScriptState arg0) {
		long var1 = arg0.field8224[--arg0.field8238];
		arg0.field8218[++arg0.field8211 - 1] = var1 == -1L ? "" : Long.toString(var1, 36).toUpperCase();
	}

	@ObfuscatedName("oo.agm(Lyf;I)V")
	public static final void oc_name(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = ((ObjType) Client.field1842.list(var1)).name;
	}

	@ObfuscatedName("hx.agf(Lyf;S)V")
	public static final void oc_op(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ObjType var3 = (ObjType) Client.field1842.list(var1);
		if (var2 < 1 || var2 > 5 || var3.op[var2 - 1] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var3.op[var2 - 1];
		}
	}

	@ObfuscatedName("ji.agd(Lyf;I)V")
	public static final void oc_iop(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ObjType var3 = (ObjType) Client.field1842.list(var1);
		if (var2 < 1 || var2 > 5 || var3.iop[var2 - 1] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var3.iop[var2 - 1];
		}
	}

	@ObfuscatedName("ajf.agb(Lyf;B)V")
	public static final void oc_cost(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Client.field1842.list(var1)).cost;
	}

	@ObfuscatedName("hf.agw(Lyf;I)V")
	public static final void oc_stackable(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Client.field1842.list(var1)).stackable == 1 ? 1 : 0;
	}

	@ObfuscatedName("aac.agn(Lyf;I)V")
	public static final void oc_cert(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		if (var2.certtemplate == -1 && var2.certlink >= 0) {
			arg0.field8216[++arg0.field8226 - 1] = var2.certlink;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1;
		}
	}

	@ObfuscatedName("nv.agu(Lyf;I)V")
	public static final void oc_uncert(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		if (var2.certtemplate >= 0 && var2.certlink >= 0) {
			arg0.field8216[++arg0.field8226 - 1] = var2.certlink;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1;
		}
	}

	@ObfuscatedName("no.ags(Lyf;B)V")
	public static final void oc_shard(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		if (var2.shardtemplate == -1 && var2.shardlink >= 0) {
			arg0.field8216[++arg0.field8226 - 1] = var2.shardlink;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1;
		}
	}

	@ObfuscatedName("aj.agp(Lyf;B)V")
	public static final void oc_unshard(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		if (var2.shardtemplate >= 0 && var2.shardlink >= 0) {
			arg0.field8216[++arg0.field8226 - 1] = var2.shardlink;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1;
		}
	}

	@ObfuscatedName("nh.agz(Lyf;I)V")
	public static final void oc_shardcount(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8679;
	}

	@ObfuscatedName("fw.agh(Lyf;I)V")
	public static final void oc_wearpos(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Client.field1842.list(var1)).field8651;
	}

	@ObfuscatedName("ki.agq(Lyf;I)V")
	public static final void oc_wearpos2(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Client.field1842.list(var1)).field8652;
	}

	@ObfuscatedName("kr.agr(Lyf;I)V")
	public static final void oc_wearpos3(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Client.field1842.list(var1)).field8653;
	}

	@ObfuscatedName("wm.agt(Lyf;I)V")
	public static final void oc_members(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Client.field1842.list(var1)).members ? 1 : 0;
	}

	@ObfuscatedName("ul.agl(Lyf;I)V")
	public static final void oc_param(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Client.field3086.list(var2);
		if (var3.isStringType()) {
			arg0.field8218[++arg0.field8211 - 1] = ((ObjType) Client.field1842.list(var1)).getParam(var2, var3.defaultstr);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Client.field1842.list(var1)).getParam(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("ye.agc(Lyf;I)V")
	public static final void oc_icursor(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1] - 1;
		ObjType var3 = (ObjType) Client.field1842.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var3.method14684(var2);
	}

	@ObfuscatedName("ae.ago(Lyf;I)V")
	public static final void oc_find(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.method4628(var1, var2 == 1);
	}

	@ObfuscatedName("zl.agy(Lyf;I)V")
	public static final void oc_findnext(ClientScriptState arg0) {
		if (Client.field8054 == null || Client.field8728 >= Client.field8054.length) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field8054[++Client.field8728 - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("ajd.ahm(Lyf;B)V")
	public static final void oc_findrestart(ClientScriptState arg0) {
		Client.field8728 = 0;
	}

	@ObfuscatedName("abq.ahc(Lyf;I)V")
	public static final void oc_minimenu_colour_overridden(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8680 ? 1 : 0;
	}

	@ObfuscatedName("xd.ahj(Lyf;I)V")
	public static final void oc_minimenu_colour(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		int var3;
		if (var2.field8680) {
			var3 = var2.field8696;
		} else if (var2.members) {
			var3 = MiniMenu.field1971.field7665;
		} else {
			var3 = MiniMenu.field1971.field7661;
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("tz.ahw(Lyf;S)V")
	public static final void oc_category(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8628;
	}

	@ObfuscatedName("gy.ahl(Lyf;S)V")
	public static final void oc_hasvarobj(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.stackable == 2 ? 1 : 0;
	}

	@ObfuscatedName("tv.ahv(Lyf;B)V")
	public static final void oc_tradeable(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8687 ? 1 : 0;
	}

	@ObfuscatedName("nz.ahf(Lyf;I)V")
	public static final void oc_placeholder(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ObjType var2 = (ObjType) Client.field1842.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field8698 ? 1 : 0;
	}

	@ObfuscatedName("aal.ahr(Lyf;I)V")
	public static final void oc_id(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((ObjType) Client.field1842.list(var1)).id;
	}

	@ObfuscatedName("a.ahk(Lyf;I)V")
	public static final void nc_param(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Client.field3086.list(var2);
		if (var3.isStringType()) {
			arg0.field8218[++arg0.field8211 - 1] = ((NPCType) Client.field7961.list(var1)).method4548(var2, var3.defaultstr);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((NPCType) Client.field7961.list(var1)).method4551(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("vg.ahq(Lyf;B)V")
	public static final void lc_param(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Client.field3086.list(var2);
		if (var3.isStringType()) {
			arg0.field8218[++arg0.field8211 - 1] = ((LocType) Client.world.method7750().list(var1)).method9479(var2, var3.defaultstr);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((LocType) Client.world.method7750().list(var1)).method9481(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("vn.ahu(Lyf;B)V")
	public static final void struct_param(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Client.field3086.list(var2);
		if (var3.isStringType()) {
			arg0.field8218[++arg0.field8211 - 1] = ((StructType) Client.field7713.list(var1)).method15297(var2, var3.defaultstr);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((StructType) Client.field7713.list(var1)).method15296(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("yb.ahz(Lyf;I)V")
	public static final void seq_param(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Client.field3086.list(var2);
		if (var3.isStringType()) {
			arg0.field8218[++arg0.field8211 - 1] = ((SeqType) Client.field8797.list(var1)).method2989(var2, var3.defaultstr);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((SeqType) Client.field8797.list(var1)).method2981(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("fw.aha(Lyf;B)V")
	public static final void seqlength(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ((SeqType) Client.field8797.list(var1)).field1776;
	}

	@ObfuscatedName("ij.ahx(Lyf;I)V")
	public static final void bas_getanim_ready(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		BASType var2 = (BASType) Client.field11742.list(var1);
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
	public static final void chat_getfilter_public(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11050;
	}

	@ObfuscatedName("pl.aho(Lyf;S)V")
	public static final void chat_setfilter(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		Client.field11050 = arg0.field8216[arg0.field8226];
		Client.field10354 = PrivateChatFilter.method3374(arg0.field8216[arg0.field8226 + 1]);
		if (Client.field10354 == null) {
			Client.field10354 = PrivateChatFilter.field8527;
		}
		Client.field11029 = arg0.field8216[arg0.field8226 + 2];
		ServerConnection var1 = Client.method640();
		ClientMessage var2 = ClientMessage.method1604(ClientProt.SET_CHATFILTERSETTINGS, var1.field794);
		var2.buf.p1(Client.field11050);
		var2.buf.p1(Client.field10354.field8530);
		var2.buf.p1(Client.field11029);
		var1.queue(var2);
	}

	@ObfuscatedName("anr.ahg(Lyf;I)V")
	public static final void chat_sendabusereport(ClientScriptState arg0) {
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
		ServerConnection var5 = Client.method640();
		ClientMessage var6 = ClientMessage.method1604(ClientProt.SEND_SNAPSHOT, var5.field794);
		var6.buf.p1(Packet.pjstrlen(var1) + 2 + Packet.pjstrlen(var2));
		var6.buf.pjstr(var1);
		var6.buf.p1(var3 - 1);
		var6.buf.p1(var4);
		var6.buf.pjstr(var2);
		var5.queue(var6);
	}

	@ObfuscatedName("aas.ahh(Lyf;S)V")
	public static final void chat_gethistory_bytypeandline(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ChatLine var3 = ChatHistory.method7310(var1, var2);
		if (var3 != null) {
			arg0.field8216[++arg0.field8226 - 1] = var3.uid;
			arg0.field8218[++arg0.field8211 - 1] = TimeFormatter.method16609(var3.time, Client.language.field8298);
			arg0.field8216[++arg0.field8226 - 1] = var3.flags;
			arg0.field8218[++arg0.field8211 - 1] = var3.name == null ? "" : var3.name;
			arg0.field8218[++arg0.field8211 - 1] = var3.nameUnfiltered == null ? "" : var3.nameUnfiltered;
			arg0.field8218[++arg0.field8211 - 1] = var3.nameSimple == null ? "" : var3.nameSimple;
			arg0.field8218[++arg0.field8211 - 1] = var3.clan == null ? "" : var3.clan;
			arg0.field8216[++arg0.field8226 - 1] = var3.phrase;
			arg0.field8218[++arg0.field8211 - 1] = var3.message == null ? "" : var3.message;
			arg0.field8216[++arg0.field8226 - 1] = var3.crown == null ? -1 : var3.crown.getId();
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
	public static final void chat_gethistory_byuid(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		ChatLine var2 = ChatHistory.method304(var1);
		if (var2 != null) {
			arg0.field8216[++arg0.field8226 - 1] = var2.type;
			arg0.field8218[++arg0.field8211 - 1] = TimeFormatter.method16609(var2.time, Client.language.field8298);
			arg0.field8216[++arg0.field8226 - 1] = var2.flags;
			arg0.field8218[++arg0.field8211 - 1] = var2.name == null ? "" : var2.name;
			arg0.field8218[++arg0.field8211 - 1] = var2.nameUnfiltered == null ? "" : var2.nameUnfiltered;
			arg0.field8218[++arg0.field8211 - 1] = var2.nameSimple == null ? "" : var2.nameSimple;
			arg0.field8218[++arg0.field8211 - 1] = var2.clan == null ? "" : var2.clan;
			arg0.field8216[++arg0.field8226 - 1] = var2.phrase;
			arg0.field8218[++arg0.field8211 - 1] = var2.message == null ? "" : var2.message;
			arg0.field8216[++arg0.field8226 - 1] = var2.crown == null ? -1 : var2.crown.getId();
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
	public static final void chat_lastuid(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ChatHistory.method18587();
	}

	@ObfuscatedName("vo.ahp(Lyf;B)V")
	public static final void chat_clear(ClientScriptState arg0) {
		ChatHistory.method329();
	}

	@ObfuscatedName("xo.ahe(Lyf;S)V")
	public static final void chat_getfilter_private(ClientScriptState arg0) {
		if (Client.field10354 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field10354.field8530;
		}
	}

	@ObfuscatedName("mj.ahs(Lyf;I)V")
	public static final void chat_setmode(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ServerConnection var2 = Client.method640();
		ClientMessage var3 = ClientMessage.method1604(ClientProt.CHAT_SETMODE, var2.field794);
		var3.buf.p1(var1);
		var2.queue(var3);
	}

	@ObfuscatedName("ki.aht(Lyf;I)V")
	public static final void chat_sendpublic(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		if (Client.field10949 == 0 && (Client.field10951 && !Client.field11081 || Client.field11101)) {
			return;
		}
		String var2 = var1.toLowerCase();
		byte var3 = 0;
		if (var2.startsWith(LocalisedText.CHATCOL0.localisedText(Language.EN))) {
			var3 = 0;
			var1 = var1.substring(LocalisedText.CHATCOL0.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL1.localisedText(Language.EN))) {
			var3 = 1;
			var1 = var1.substring(LocalisedText.CHATCOL1.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL2.localisedText(Language.EN))) {
			var3 = 2;
			var1 = var1.substring(LocalisedText.CHATCOL2.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL3.localisedText(Language.EN))) {
			var3 = 3;
			var1 = var1.substring(LocalisedText.CHATCOL3.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL4.localisedText(Language.EN))) {
			var3 = 4;
			var1 = var1.substring(LocalisedText.CHATCOL4.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL5.localisedText(Language.EN))) {
			var3 = 5;
			var1 = var1.substring(LocalisedText.CHATCOL5.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL6.localisedText(Language.EN))) {
			var3 = 6;
			var1 = var1.substring(LocalisedText.CHATCOL6.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL7.localisedText(Language.EN))) {
			var3 = 7;
			var1 = var1.substring(LocalisedText.CHATCOL7.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL8.localisedText(Language.EN))) {
			var3 = 8;
			var1 = var1.substring(LocalisedText.CHATCOL8.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL9.localisedText(Language.EN))) {
			var3 = 9;
			var1 = var1.substring(LocalisedText.CHATCOL9.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL10.localisedText(Language.EN))) {
			var3 = 10;
			var1 = var1.substring(LocalisedText.CHATCOL10.localisedText(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL11.localisedText(Language.EN))) {
			var3 = 11;
			var1 = var1.substring(LocalisedText.CHATCOL11.localisedText(Language.EN).length());
		} else if (Client.language != Language.EN) {
			if (var2.startsWith(LocalisedText.CHATCOL0.localisedText(Client.language))) {
				var3 = 0;
				var1 = var1.substring(LocalisedText.CHATCOL0.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL1.localisedText(Client.language))) {
				var3 = 1;
				var1 = var1.substring(LocalisedText.CHATCOL1.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL2.localisedText(Client.language))) {
				var3 = 2;
				var1 = var1.substring(LocalisedText.CHATCOL2.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL3.localisedText(Client.language))) {
				var3 = 3;
				var1 = var1.substring(LocalisedText.CHATCOL3.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL4.localisedText(Client.language))) {
				var3 = 4;
				var1 = var1.substring(LocalisedText.CHATCOL4.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL5.localisedText(Client.language))) {
				var3 = 5;
				var1 = var1.substring(LocalisedText.CHATCOL5.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL6.localisedText(Client.language))) {
				var3 = 6;
				var1 = var1.substring(LocalisedText.CHATCOL6.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL7.localisedText(Client.language))) {
				var3 = 7;
				var1 = var1.substring(LocalisedText.CHATCOL7.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL8.localisedText(Client.language))) {
				var3 = 8;
				var1 = var1.substring(LocalisedText.CHATCOL8.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL9.localisedText(Client.language))) {
				var3 = 9;
				var1 = var1.substring(LocalisedText.CHATCOL9.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL10.localisedText(Client.language))) {
				var3 = 10;
				var1 = var1.substring(LocalisedText.CHATCOL10.localisedText(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL11.localisedText(Client.language))) {
				var3 = 11;
				var1 = var1.substring(LocalisedText.CHATCOL11.localisedText(Client.language).length());
			}
		}
		String var4 = var1.toLowerCase();
		byte var5 = 0;
		if (var4.startsWith(LocalisedText.CHATEFFECT1.localisedText(Language.EN))) {
			var5 = 1;
			var1 = var1.substring(LocalisedText.CHATEFFECT1.localisedText(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.CHATEFFECT2.localisedText(Language.EN))) {
			var5 = 2;
			var1 = var1.substring(LocalisedText.CHATEFFECT2.localisedText(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.CHATEFFECT3.localisedText(Language.EN))) {
			var5 = 3;
			var1 = var1.substring(LocalisedText.CHATEFFECT3.localisedText(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.CHATEFFECT4.localisedText(Language.EN))) {
			var5 = 4;
			var1 = var1.substring(LocalisedText.CHATEFFECT4.localisedText(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.CHATEFFECT5.localisedText(Language.EN))) {
			var5 = 5;
			var1 = var1.substring(LocalisedText.CHATEFFECT5.localisedText(Language.EN).length());
		} else if (Client.language != Language.EN) {
			if (var4.startsWith(LocalisedText.CHATEFFECT1.localisedText(Client.language))) {
				var5 = 1;
				var1 = var1.substring(LocalisedText.CHATEFFECT1.localisedText(Client.language).length());
			} else if (var4.startsWith(LocalisedText.CHATEFFECT2.localisedText(Client.language))) {
				var5 = 2;
				var1 = var1.substring(LocalisedText.CHATEFFECT2.localisedText(Client.language).length());
			} else if (var4.startsWith(LocalisedText.CHATEFFECT3.localisedText(Client.language))) {
				var5 = 3;
				var1 = var1.substring(LocalisedText.CHATEFFECT3.localisedText(Client.language).length());
			} else if (var4.startsWith(LocalisedText.CHATEFFECT4.localisedText(Client.language))) {
				var5 = 4;
				var1 = var1.substring(LocalisedText.CHATEFFECT4.localisedText(Client.language).length());
			} else if (var4.startsWith(LocalisedText.CHATEFFECT5.localisedText(Client.language))) {
				var5 = 5;
				var1 = var1.substring(LocalisedText.CHATEFFECT5.localisedText(Client.language).length());
			}
		}
		ServerConnection var6 = Client.method640();
		ClientMessage var7 = ClientMessage.method1604(ClientProt.MESSAGE_PUBLIC, var6.field794);
		var7.buf.p1(0);
		int var8 = var7.buf.pos;
		var7.buf.p1(var3);
		var7.buf.p1(var5);
		WordPack.encode(var7.buf, var1);
		var7.buf.psize1(var7.buf.pos - var8);
		var6.queue(var7);
	}

	@ObfuscatedName("iw.ahi(Lyf;I)V")
	public static final void chat_sendprivate(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		if (Client.field10949 == 0 && (Client.field10951 && !Client.field11081 || Client.field11101)) {
			return;
		}
		ServerConnection var3 = Client.method640();
		ClientMessage var4 = ClientMessage.method1604(ClientProt.MESSAGE_PRIVATE, var3.field794);
		var4.buf.p2(0);
		int var5 = var4.buf.pos;
		var4.buf.pjstr(var1);
		WordPack.encode(var4.buf, var2);
		var4.buf.psize2(var4.buf.pos - var5);
		var3.queue(var4);
	}

	@ObfuscatedName("yw.ahy(Lyf;S)V")
	public static final void chat_playername(ClientScriptState arg0) {
		String var1;
		if (Client.field4490 == null || Client.field4490.field12057 == null) {
			var1 = "";
		} else {
			var1 = Client.field4490.method19115(true);
		}
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("fs.air(Lyf;I)V")
	public static final void chat_getfilter_trade(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11029;
	}

	@ObfuscatedName("wq.aix(Lyf;I)V")
	public static final void chat_gethistorylength(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ChatHistory.method6970(var1);
	}

	@ObfuscatedName("oh.ait(Lyf;I)V")
	public static final void chat_getnextuid(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ChatHistory.method5157(var1);
	}

	@ObfuscatedName("hc.aiq(Lyf;I)V")
	public static final void chat_getprevuid(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = ChatHistory.method16440(var1);
	}

	@ObfuscatedName("abv.aii(Lyf;I)V")
	public static final void chat_playername_unfiltered(ClientScriptState arg0) {
		String var1;
		if (Client.field4490 == null || Client.field4490.field12057 == null) {
			var1 = "";
		} else {
			var1 = Client.field4490.method19116(false);
		}
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("fl.aia(Lyf;I)V")
	public static final void chatcat_getdesc(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = Client.field3823.list(var1).field12348;
	}

	@ObfuscatedName("tr.ais(Lyf;I)V")
	public static final void chatcat_getsubcatcount(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		QuickChatCatType var2 = Client.field3823.list(var1);
		if (var2.field12346 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12346.length;
		}
	}

	@ObfuscatedName("ir.aiy(Lyf;B)V")
	public static final void chatcat_getsubcat(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		QuickChatCatType var3 = Client.field3823.list(var1);
		int var4 = var3.field12346[var2];
		arg0.field8216[++arg0.field8226 - 1] = var4;
	}

	@ObfuscatedName("qa.aio(Lyf;B)V")
	public static final void chatcat_getphrasecount(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		QuickChatCatType var2 = Client.field3823.list(var1);
		if (var2.field12349 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12349.length;
		}
	}

	@ObfuscatedName("hh.aig(Lyf;B)V")
	public static final void chatcat_getphrase(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field3823.list(var1).field12349[var2];
	}

	@ObfuscatedName("ho.aid(Lyf;S)V")
	public static final void chatphrase_gettext(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8218[++arg0.field8211 - 1] = Client.field489.method14982(var1).method19534();
	}

	@ObfuscatedName("sv.aif(Lyf;B)V")
	public static final void chatphrase_getautoresponsecount(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		QuickChatPhraseType var2 = Client.field489.method14982(var1);
		if (var2.field12381 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12381.length;
		}
	}

	@ObfuscatedName("la.ail(Lyf;B)V")
	public static final void chatphrase_getautoresponse(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field489.method14982(var1).field12381[var2];
	}

	@ObfuscatedName("fi.aiw(Lyf;I)V")
	public static final void activechatphrase_prepare(ClientScriptState arg0) {
		arg0.field8240 = new QuickChatPhrase();
		arg0.field8240.field3448 = arg0.field8216[--arg0.field8226];
		arg0.field8240.field3447 = Client.field489.method14982(arg0.field8240.field3448);
		arg0.field8240.field3446 = new int[arg0.field8240.field3447.method19504()];
	}

	@ObfuscatedName("jr.aiz(Lyf;I)V")
	public static final void activechatphrase_send(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ServerConnection var2 = Client.method640();
		ClientMessage var3 = ClientMessage.method1604(ClientProt.MESSAGE_QUICKCHAT_PUBLIC, var2.field794);
		var3.buf.p1(0);
		int var4 = var3.buf.pos;
		var3.buf.p1(var1);
		var3.buf.p2(arg0.field8240.field3448);
		arg0.field8240.field3447.method19508(var3.buf, arg0.field8240.field3446);
		var3.buf.psize1(var3.buf.pos - var4);
		var2.queue(var3);
	}

	@ObfuscatedName("qh.aim(Lyf;B)V")
	public static final void activechatphrase_sendprivate(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		ServerConnection var2 = Client.method640();
		ClientMessage var3 = ClientMessage.method1604(ClientProt.MESSAGE_QUICKCHAT_PRIVATE, var2.field794);
		var3.buf.p1(0);
		int var4 = var3.buf.pos;
		var3.buf.pjstr(var1);
		var3.buf.p2(arg0.field8240.field3448);
		arg0.field8240.field3447.method19508(var3.buf, arg0.field8240.field3446);
		var3.buf.psize1(var3.buf.pos - var4);
		var2.queue(var3);
	}

	@ObfuscatedName("atf.aie(Lyf;I)V")
	public static final void chatcat_getsubcatshortcut(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field3823.list(var1).field12345[var2];
	}

	@ObfuscatedName("xr.aic(Lyf;I)V")
	public static final void chatcat_getphraseshortcut(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field3823.list(var1).field12347[var2];
	}

	@ObfuscatedName("wg.aij(Lyf;I)V")
	public static final void chatcat_findsubcatbyshortcut(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var2 == -1) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field3823.list(var1).method19460((char) var2);
		}
	}

	@ObfuscatedName("rl.aik(Lyf;I)V")
	public static final void chatcat_findphrasebyshortcut(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var2 == -1) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field3823.list(var1).method19451((char) var2);
		}
	}

	@ObfuscatedName("hi.aih(Lyf;I)V")
	public static final void chatphrase_getdynamiccommandcount(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field489.method14982(var1).method19504();
	}

	@ObfuscatedName("rc.aip(Lyf;I)V")
	public static final void chatphrase_getdynamiccommand(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = Client.field489.method14982(var1).method19509(var2).field7938;
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("dn.aiu(Lyf;I)V")
	public static final void activechatphrase_setdynamicint(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8240.field3446[var1] = var2;
	}

	@ObfuscatedName("ek.aib(Lyf;I)V")
	public static final void activechatphrase_setdynamicobj(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8240.field3446[var1] = var2;
	}

	@ObfuscatedName("aaa.ain(Lyf;I)V")
	public static final void chatphrase_getdynamiccommandparam_enum(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		QuickChatPhraseType var4 = Client.field489.method14982(var1);
		if (var4.method19509(var2).field7938 != 0) {
			throw new RuntimeException("");
		}
		arg0.field8216[++arg0.field8226 - 1] = var4.method19506(var2, var3);
	}

	@ObfuscatedName("agu.aiv(Lyf;I)V")
	public static final void chatphrase_find(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		boolean var2 = arg0.field8216[--arg0.field8226] == 1;
		arg0.field8216[++arg0.field8226 - 1] = Client.method4296(var1, var2);
	}

	@ObfuscatedName("yr.aja(Lyf;I)V")
	public static final void chatphrase_findnext(ClientScriptState arg0) {
		if (Client.field10750 == null || Client.field7272 >= Client.field10750.length) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Client.field10750[++Client.field7272 - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("hr.ajp(Lyf;B)V")
	public static final void chatphrase_findrestart(ClientScriptState arg0) {
		Client.field7272 = 0;
	}

	@ObfuscatedName("aos.ajy(Lyf;I)V")
	public static final void keyheld_alt(ClientScriptState arg0) {
		if (Client.field11931.method9080(86)) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("er.ajs(Lyf;B)V")
	public static final void keyheld_ctrl(ClientScriptState arg0) {
		if (Client.field11931.method9080(82)) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("amt.ajv(Lyf;B)V")
	public static final void keyheld_shift(ClientScriptState arg0) {
		if (Client.field11931.method9080(81)) {
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
	public static final void worldmap_3dview_enable(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("io.ajz(Lyf;I)V")
	public static final void worldmap_3dview_disable(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("zc.ajb(Lyf;I)V")
	public static final void worldmap_3dview_active(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("re.ajq(Lyf;I)V")
	public static final void worldmap_3dview_setlighting(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("ajs.aju(Lyf;I)V")
	public static final void worldmap_setcategorypriority(ClientScriptState arg0) {
	}

	@ObfuscatedName("aht.ajd(Lyf;I)V")
	public static final void worldmap_getcategorypriority(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("yw.ajn(Lyf;I)V")
	public static final void worldmap_3dview_getcoordfine(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("sv.aji(Lyf;S)V")
	public static final void worldmap_3dview_setloddistance(ClientScriptState arg0) {
		throw new RuntimeException("");
	}

	@ObfuscatedName("aj.ajc(Lyf;I)V")
	public static final void worldmap_3dview_getloddistance(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("je.ajo(Lyf;I)V")
	public static final void worldmap_3dview_settextfont(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("rs.ajt(Lyf;B)V")
	public static final void worldmap_3dview_gettextfont(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("gk.ajw(Lyf;I)V")
	public static final void worldmap_3dview_getscreenposition(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = -1;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("rp.ajx(Lyf;I)V")
	public static final void worldmap_setzoom(ClientScriptState arg0) {
		ClientWorldMap.method18180(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("im.ajf(Lyf;I)V")
	public static final void worldmap_getzoom(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.method17462();
	}

	@ObfuscatedName("hi.ajm(Lyf;I)V")
	public static final void worldmap_setmap(ClientScriptState arg0) {
		ClientWorldMap.method3141(arg0.field8216[--arg0.field8226], -1, -1, false);
	}

	@ObfuscatedName("uu.aje(Lyf;I)V")
	public static final void worldmap_getmap(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = WorldMap.method8511(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12359;
		}
	}

	@ObfuscatedName("je.ajl(Lyf;I)V")
	public static final void worldmap_getmapname(ClientScriptState arg0) {
		WorldMapAreaMetadata var1 = WorldMap.method8512(arg0.field8216[--arg0.field8226]);
		if (var1 == null || var1.field12352 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var1.field12352;
		}
	}

	@ObfuscatedName("tw.ajr(Lyf;I)V")
	public static final void worldmap_getsize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field3121;
		arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field4603;
	}

	@ObfuscatedName("vz.akn(Lyf;B)V")
	public static final void worldmap_getdisplayposition(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field11443 + WorldMap.field6786;
		arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field11654 + WorldMap.field6808;
	}

	@ObfuscatedName("wo.ako(Lyf;B)V")
	public static final void worldmap_getconfigorigin(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = WorldMap.method8512(var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12354;
		}
	}

	@ObfuscatedName("pn.akz(Lyf;B)V")
	public static final void worldmap_getconfigsize(ClientScriptState arg0) {
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
	public static final void worldmap_getconfigbounds(ClientScriptState arg0) {
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
	public static final void worldmap_listelement_start(ClientScriptState arg0) {
		WorldMapElement var1 = ClientWorldMap.method9829();
		if (var1 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1.field11446;
			int var2 = var1.field11447 << 28 | var1.field11448 + WorldMap.field6786 << 14 | var1.field11452 + WorldMap.field6808;
			arg0.field8216[++arg0.field8226 - 1] = var2;
		}
	}

	@ObfuscatedName("ux.akc(Lyf;I)V")
	public static final void worldmap_listelement_next(ClientScriptState arg0) {
		WorldMapElement var1 = ClientWorldMap.method13882();
		if (var1 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var1.field11446;
			int var2 = var1.field11447 << 28 | var1.field11448 + WorldMap.field6786 << 14 | var1.field11452 + WorldMap.field6808;
			arg0.field8216[++arg0.field8226 - 1] = var2;
		}
	}

	@ObfuscatedName("q.aki(Lyf;B)V")
	public static final void worldmap_jumptosourcecoord(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = ClientWorldMap.method17877();
		if (var2 != null) {
			boolean var3 = var2.method19471(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, field8203);
			if (var3) {
				ClientWorldMap.method16438(field8203[1], field8203[2]);
			}
		}
	}

	@ObfuscatedName("ys.akw(Lyf;I)V")
	public static final void worldmap_jumptosourcecoord_instant(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = ClientWorldMap.method17877();
		if (var2 != null) {
			boolean var3 = var2.method19471(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, field8203);
			if (var3) {
				ClientWorldMap.method10453(field8203[1], field8203[2]);
			}
		}
	}

	@ObfuscatedName("uc.akp(Lyf;I)V")
	public static final void worldmap_coordinmap(ClientScriptState arg0) {
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

	@ObfuscatedName("dk.akr(Lyf;I)V")
	public static final void worldmap_getconfigzoom(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = WorldMap.method8512(var1);
		if (var2 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var2.field12356;
		}
	}

	@ObfuscatedName("xi.aku(Lyf;B)V")
	public static final void worldmap_isloaded(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field11651 == 100 ? 1 : 0;
	}

	@ObfuscatedName("agh.akh(Lyf;I)V")
	public static final void worldmap_jumptodisplaycoord(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ClientWorldMap.method16438(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
	}

	@ObfuscatedName("ua.akx(Lyf;I)V")
	public static final void worldmap_jumptodisplaycoord_instant(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ClientWorldMap.method10453(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
	}

	@ObfuscatedName("vh.akl(Lyf;B)V")
	public static final void worldmap_getsourceposition(ClientScriptState arg0) {
		WorldMapAreaMetadata var1 = ClientWorldMap.method17877();
		if (var1 == null) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
			return;
		}
		boolean var2 = var1.method19482(ClientWorldMap.field11443 + WorldMap.field6786, ClientWorldMap.field11654 + WorldMap.field6808, field8203);
		if (var2) {
			arg0.field8216[++arg0.field8226 - 1] = field8203[1];
			arg0.field8216[++arg0.field8226 - 1] = field8203[2];
		} else {
			arg0.field8216[++arg0.field8226 - 1] = -1;
			arg0.field8216[++arg0.field8226 - 1] = -1;
		}
	}

	@ObfuscatedName("xo.ake(Lyf;B)V")
	public static final void worldmap_setmap_coord(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ClientWorldMap.method3141(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, false);
	}

	@ObfuscatedName("vq.akj(Lyf;I)V")
	public static final void worldmap_getdisplaycoord(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = ClientWorldMap.method17877();
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
	public static final void worldmap_getsourcecoord(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		WorldMapAreaMetadata var2 = ClientWorldMap.method17877();
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
	public static final void worldmap_flashelement(ClientScriptState arg0) {
		ClientWorldMap.method3368(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("yo.akd(Lyf;I)V")
	public static final void worldmap_setmap_coord_override(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ClientWorldMap.method3141(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, true);
	}

	@ObfuscatedName("apc.akg(Lyf;B)V")
	public static final void worldmap_disableelements(ClientScriptState arg0) {
		ClientWorldMap.field11658 = arg0.field8216[--arg0.field8226] == 1;
	}

	@ObfuscatedName("vl.aks(Lyf;I)V")
	public static final void worldmap_getdisableelements(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field11658 ? 1 : 0;
	}

	@ObfuscatedName("xf.akv(Lyf;I)V")
	public static final void worldmap_flashelementcategory(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ClientWorldMap.method541(var1);
	}

	@ObfuscatedName("tc.akk(Lyf;I)V")
	public static final void worldmap_disableelementcategory(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		if (ClientWorldMap.field11668 == null) {
			return;
		}
		Node var3 = ClientWorldMap.field11668.method14495((long) var1);
		if (var3 != null && !var2) {
			var3.method8440();
		} else if (var3 == null && var2) {
			Node var4 = new Node();
			ClientWorldMap.field11668.method14501(var4, (long) var1);
		}
	}

	@ObfuscatedName("gf.akm(Lyf;I)V")
	public static final void worldmap_getdisableelementcategory(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (ClientWorldMap.field11668 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			Node var2 = ClientWorldMap.field11668.method14495((long) var1);
			arg0.field8216[++arg0.field8226 - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("wd.akt(Lyf;I)V")
	public static final void worldmap_disableelement(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		if (ClientWorldMap.field11667 == null) {
			return;
		}
		Node var3 = ClientWorldMap.field11667.method14495((long) var1);
		if (var3 != null && !var2) {
			var3.method8440();
		} else if (var3 == null && var2) {
			Node var4 = new Node();
			ClientWorldMap.field11667.method14501(var4, (long) var1);
		}
	}

	@ObfuscatedName("sv.akb(Lyf;I)V")
	public static final void worldmap_getdisableelement(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (ClientWorldMap.field11667 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			Node var2 = ClientWorldMap.field11667.method14495((long) var1);
			arg0.field8216[++arg0.field8226 - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("fd.als(Lyf;I)V")
	public static final void worldmap_getcurrentmap(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = WorldMap.field6811 == null ? -1 : WorldMap.field6811.field12359;
	}

	@ObfuscatedName("sl.alw(Lyf;B)V")
	public static final void worldmap_findnearestelement(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = var2 >> 14 & 0x3FFF;
		int var4 = var2 & 0x3FFF;
		int var5 = ClientWorldMap.method8145(var1, var3, var4);
		if (var5 < 0) {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var5;
		}
	}

	@ObfuscatedName("qe.ali(Lyf;B)V")
	public static final void worldmap_closemap(ClientScriptState arg0) {
		ClientWorldMap.method5250();
	}

	@ObfuscatedName("ys.alu(Lyf;S)V")
	public static final void worldmap_disabletextsize(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		if (var1 == 0) {
			ClientWorldMap.field11670 = var2;
		} else if (var1 == 1) {
			ClientWorldMap.field11666 = var2;
		} else if (var1 == 2) {
			ClientWorldMap.field11675 = var2;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ud.aly(Lyf;I)V")
	public static final void worldmap_getdisabletextsize(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 == 0) {
			arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field11670 ? 1 : 0;
		} else if (var1 == 1) {
			arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field11666 ? 1 : 0;
		} else if (var1 == 2) {
			arg0.field8216[++arg0.field8226 - 1] = ClientWorldMap.field11675 ? 1 : 0;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("hp.alm(Lyf;I)V")
	public static final void worldmap_disabletype(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		if (!ClientWorldMap.method9621(var1, var2)) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("aw.alk(Lyf;I)V")
	public static final void worldmap_getdisabletype(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = ClientWorldMap.method9736(var1);
		if (var2 < 0) {
			throw new RuntimeException();
		}
		arg0.field8216[++arg0.field8226 - 1] = var2;
	}

	@ObfuscatedName("z.aln(Lyf;B)V")
	public static final void fullscreen_enter(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (Fullscreen.allowed) {
			Client.setWindowMode(3, var1, var2, false);
			arg0.field8216[++arg0.field8226 - 1] = GameShell.fsframe == null ? 0 : 1;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("wy.alj(Lyf;I)V")
	public static final void fullscreen_exit(ClientScriptState arg0) {
		if (Fullscreen.allowed && GameShell.fsframe != null) {
			Client.setWindowMode(Client.preferences.maxScreenSize.getValue(), -1, -1, false);
		}
	}

	@ObfuscatedName("acb.all(Lyf;I)V")
	public static final void fullscreen_modecount(ClientScriptState arg0) {
		if (Fullscreen.allowed) {
			FullscreenMode[] var1 = Client.method16741();
			arg0.field8216[++arg0.field8226 - 1] = var1.length;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("wt.alg(Lyf;B)V")
	public static final void fullscreen_getmode(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Fullscreen.allowed) {
			FullscreenMode[] var2 = Client.method16741();
			arg0.field8216[++arg0.field8226 - 1] = var2[var1].field8537;
			arg0.field8216[++arg0.field8226 - 1] = var2[var1].field8538;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("kb.alb(Lyf;I)V")
	public static final void fullscreen_lastmode(ClientScriptState arg0) {
		int var1 = GameShell.lastFullscreenWidth;
		int var2 = GameShell.lastFullscreenHeight;
		int var3 = -1;
		if (Fullscreen.allowed) {
			FullscreenMode[] var4 = Client.method16741();
			for (int var5 = 0; var5 < var4.length; var5++) {
				FullscreenMode var6 = var4[var5];
				if (var6.field8537 == var1 && var6.field8538 == var2) {
					var3 = var5;
					break;
				}
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("qi.ale(Lyf;S)V")
	public static final void getwindowmode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.getWindowMode();
	}

	@ObfuscatedName("et.ald(Lyf;I)V")
	public static final void setwindowmode(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 >= 1 && var1 <= 2) {
			Client.setWindowMode(var1, -1, -1, false);
		}
	}

	@ObfuscatedName("xa.alz(Lyf;B)V")
	public static final void getdefaultwindowmode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.maxScreenSize.getValue();
	}

	@ObfuscatedName("uw.alv(Lyf;I)V")
	public static final void setdefaultwindowmode(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 >= 1 && var1 <= 2) {
			Client.preferences.method18157(Client.preferences.maxScreenSize, var1);
			Client.preferences.method18157(Client.preferences.maxScreenSize2, var1);
			Preferences.method16391();
		}
	}

	@ObfuscatedName("aja.alq(Lyf;B)V")
	public static final void openurl(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		method7005((String) arg0.field8218[arg0.field8211], (String) arg0.field8218[arg0.field8211 + 1], "", arg0.field8216[--arg0.field8226] == 1, false);
	}

	@ObfuscatedName("va.ala(Lyf;I)V")
	public static final void urlencode(ClientScriptState arg0) {
		CharSequence var1 = (CharSequence) arg0.field8218[--arg0.field8211];
		arg0.field8218[++arg0.field8211 - 1] = WebTools.urlencode(var1);
	}

	@ObfuscatedName("ab.alf(Lyf;I)V")
	public static final void spline_new(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var1 >= 0 && var1 < 2) {
			Client.field10981[var1] = new int[var2 << 1][4];
		}
	}

	@ObfuscatedName("wv.alc(Lyf;I)V")
	public static final void spline_addpoint(ClientScriptState arg0) {
		arg0.field8226 -= 7;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1] << 1;
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		int var5 = arg0.field8216[arg0.field8226 + 4];
		int var6 = arg0.field8216[arg0.field8226 + 5];
		int var7 = arg0.field8216[arg0.field8226 + 6];
		if (var1 >= 0 && var1 < 2 && Client.field10981[var1] != null && var2 >= 0 && var2 < Client.field10981[var1].length) {
			Client.field10981[var1][var2] = new int[] { (var3 >> 14 & 0x3FFF) << 9, var4 << 2, (var3 & 0x3FFF) << 9, var7 };
			Client.field10981[var1][var2 + 1] = new int[] { (var5 >> 14 & 0x3FFF) << 9, var6 << 2, (var5 & 0x3FFF) << 9 };
		}
	}

	@ObfuscatedName("ff.alp(Lyf;I)V")
	public static final void spline_length(ClientScriptState arg0) {
		int var1 = Client.field10981[arg0.field8216[--arg0.field8226]].length >> 1;
		arg0.field8216[++arg0.field8226 - 1] = var1;
	}

	@ObfuscatedName("eg.alt(Lyf;I)V")
	public static final void quit(ClientScriptState arg0) {
		if (Fullscreen.allowed && GameShell.fsframe != null) {
			Client.setWindowMode(Client.preferences.maxScreenSize.getValue(), -1, -1, false);
		}
		if (GameShell.getEnvironment() == GameShell3$Environment.APPLICATION) {
			Client.method14147();
			System.exit(0);
		} else {
			Client.method9175();
		}
	}

	@ObfuscatedName("in.alo(Lyf;I)V")
	public static final void lastlogin(ClientScriptState arg0) {
		String var1 = null;
		if (Client.field636 != null) {
			var1 = Client.field636.method544();
		}
		if (var1 == null) {
			var1 = "";
		}
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("ud.alh(Lyf;I)V")
	public static final void openurl_nologin(ClientScriptState arg0) {
		if (Fullscreen.allowed && GameShell.fsframe != null) {
			Client.setWindowMode(Client.preferences.maxScreenSize.getValue(), -1, -1, false);
		}
		String var1 = (String) arg0.field8218[--arg0.field8211];
		boolean var2 = arg0.field8216[--arg0.field8226] == 1;
		String var3 = Client.method7363() + var1;
		Browser.method4607(var3, var2, Client.field10784);
	}

	@ObfuscatedName("dm.alr(Lyf;I)V")
	public static final void openurlraw(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		boolean var2 = arg0.field8216[--arg0.field8226] == 1;
		Browser.method4607(var1, var2, Client.field10784);
	}

	@ObfuscatedName("yg.alx(Lyf;S)V")
	public static final void writeconsole(ClientScriptState arg0) {
		System.out.println(arg0.field8218[--arg0.field8211]);
	}

	@ObfuscatedName("fi.ams(Lyf;I)V")
	public static final void formatminimenu(ClientScriptState arg0) {
		arg0.field8226 -= 12;
		MiniMenu.method6031();
		MiniMenu.method7617();
		MiniMenu.field7676 = arg0.field8216[arg0.field8226];
		MiniMenu.field4488 = arg0.field8216[arg0.field8226 + 1];
		MiniMenu.field6708 = arg0.field8216[arg0.field8226 + 2];
		MiniMenu.field11830 = arg0.field8216[arg0.field8226 + 3];
		MiniMenu.field12340 = arg0.field8216[arg0.field8226 + 4];
		MiniMenu.field740 = arg0.field8216[arg0.field8226 + 5];
		MiniMenu.field11642 = arg0.field8216[arg0.field8226 + 6];
		MiniMenu.field1748 = arg0.field8216[arg0.field8226 + 7];
		MiniMenu.field1847 = arg0.field8216[arg0.field8226 + 8];
		MiniMenu.field1266 = arg0.field8216[arg0.field8226 + 9];
		MiniMenu.field2901 = arg0.field8216[arg0.field8226 + 10];
		MiniMenu.field8463 = arg0.field8216[arg0.field8226 + 11];
		Client.spritesJs5.method6889(MiniMenu.field12340);
		Client.spritesJs5.method6889(MiniMenu.field740);
		Client.spritesJs5.method6889(MiniMenu.field11642);
		Client.spritesJs5.method6889(MiniMenu.field1748);
		Client.spritesJs5.method6889(MiniMenu.field1847);
		Client.spritesJs5.method6889(MiniMenu.field8463);
		Client.fontmetricsJs5.method6889(MiniMenu.field8463);
		MiniMenu.field1224 = null;
		MiniMenu.field11831 = null;
		MiniMenu.field11699 = null;
		MiniMenu.field3568 = null;
		MiniMenu.field8480 = null;
		MiniMenu.field9253 = null;
		MiniMenu.field566 = null;
		MiniMenu.field10568 = null;
		MiniMenu.field564 = true;
	}

	@ObfuscatedName("yj.ame(Lyf;I)V")
	public static final void defaultminimenu(ClientScriptState arg0) {
		MiniMenu.method5147();
		MiniMenu.field564 = false;
	}

	@ObfuscatedName("nr.ama(Lyf;B)V")
	public static final void setdefaultcursors(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		Client.field11038 = arg0.field8216[arg0.field8226];
		Client.field10971 = arg0.field8216[arg0.field8226 + 1];
	}

	@ObfuscatedName("if.amg(Lyf;I)V")
	public static final void sethardcodedopcursors(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("gb.amy(Lyf;B)V")
	public static final void minimenuopen(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = MiniMenu.method961(var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("na.amn(Lyf;I)V")
	public static final void docheat(ClientScriptState arg0) {
		DeveloperConsole.method18913((String) arg0.field8218[--arg0.field8211], false, false);
	}

	@ObfuscatedName("ah.amb(Lyf;I)V")
	public static final void notify_accountcreated(ClientScriptState arg0) {
		JavascriptFunction.field4023.method6090();
	}

	@ObfuscatedName("adg.amu(Lyf;I)V")
	public static final void notify_accountcreatestarted(ClientScriptState arg0) {
		JavascriptFunction.field4028.method6090();
	}

	@ObfuscatedName("akw.amq(Lyf;I)V")
	public static final void getclipboard(ClientScriptState arg0) {
		String var1 = "";
		if (Client.field3428 != null) {
			Transferable var2 = Client.field3428.getContents(null);
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
	public static final void setsubmenuminlength(ClientScriptState arg0) {
		MiniMenu.field568 = arg0.field8216[--arg0.field8226];
	}

	@ObfuscatedName("ys.amk(Lyf;B)V")
	public static final void openurl_shim(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		method7005((String) arg0.field8218[arg0.field8211], (String) arg0.field8218[arg0.field8211 + 1], (String) arg0.field8218[arg0.field8211 + 2], arg0.field8216[--arg0.field8226] == 1, true);
	}

	@ObfuscatedName("ev.amc(Lyf;I)V")
	public static final void has_html5(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("nv.amo(Lyf;I)V")
	public static final void has_nxt(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("acx.amm(Lyf;I)V")
	public static final void clienttype(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field2627 & 0x1;
	}

	@ObfuscatedName("ku.amz(Lyf;I)V")
	public static final void method5146(ClientScriptState arg0) {
		RuneScapeSetup.method4589();
	}

	@ObfuscatedName("ge.amh(Lyf;B)V")
	public static final void method3564(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = RuneScapeSetup.method312();
	}

	@ObfuscatedName("nd.amt(Lyf;S)V")
	public static final void is_gamescreen_state(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.isStateGame(Client.state) ? 1 : 0;
	}

	@ObfuscatedName("xm.amv(Lyf;I)V")
	public static final void cam_moveto(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		CoordGrid var5 = Client.world.method7727();
		Client.method15723((var1 >> 14 & 0x3FFF) - var5.x, (var1 & 0x3FFF) - var5.z, var2 << 2, var3, var4, false);
		Client.field10902 = true;
	}

	@ObfuscatedName("s.amw(Lyf;I)V")
	public static final void cam_lookat(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = arg0.field8216[arg0.field8226 + 3];
		CoordGrid var5 = Client.world.method7727();
		Client.method14706((var1 >> 14 & 0x3FFF) - var5.x, (var1 & 0x3FFF) - var5.z, var2 << 2, var3, var4);
		Client.field10902 = true;
	}

	@ObfuscatedName("po.amd(Lyf;I)V")
	public static final void cam_movealong(ClientScriptState arg0) {
		arg0.field8226 -= 6;
		int var1 = arg0.field8216[arg0.field8226];
		if (var1 >= 2) {
			throw new RuntimeException();
		}
		Client.field10904 = var1;
		int var2 = arg0.field8216[arg0.field8226 + 1];
		if (var2 + 1 >= Client.field10981[Client.field10904].length >> 1) {
			throw new RuntimeException();
		}
		Client.field10909 = var2 * 2;
		Client.field10976 = 0;
		Client.field10843 = arg0.field8216[arg0.field8226 + 2];
		Client.field10913 = arg0.field8216[arg0.field8226 + 3];
		int var3 = arg0.field8216[arg0.field8226 + 4];
		if (var3 >= 2) {
			throw new RuntimeException();
		}
		Client.field10908 = var3;
		int var4 = arg0.field8216[arg0.field8226 + 5];
		if (var4 + 1 >= Client.field10981[Client.field10908].length >> 1) {
			throw new RuntimeException();
		}
		Client.field10932 = var4 * 4;
		Client.field3416 = 6;
		Client.field3538 = -1;
		Client.field810 = -1;
	}

	@ObfuscatedName("ua.amr(Lyf;I)V")
	public static final void cam_reset(ClientScriptState arg0) {
		Client.method4046(Client.method14298());
	}

	@ObfuscatedName("vx.aml(Lyf;I)V")
	public static final void cam_forceangle(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		Client.method4843(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1], 0);
	}

	@ObfuscatedName("ke.amx(Lyf;I)V")
	public static final void cam_getangle_xa(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field11004 >> 3;
	}

	@ObfuscatedName("cs.ami(Lyf;B)V")
	public static final void cam_getangle_ya(ClientScriptState arg0) {
		if (Client.field3416 == 3) {
			arg0.field8216[++arg0.field8226 - 1] = (int) ((double) Client.field9155.method4719() * 2607.5945876176133D) >> 3;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10895 >> 3;
		}
	}

	@ObfuscatedName("vy.amp(Lyf;B)V")
	public static final void cam_inc_x(ClientScriptState arg0) {
		Client.method3653();
	}

	@ObfuscatedName("ql.amj(Lyf;I)V")
	public static final void cam_dec_x(ClientScriptState arg0) {
		Client.method14311();
	}

	@ObfuscatedName("sg.ane(Lyf;I)V")
	public static final void cam_inc_y(ClientScriptState arg0) {
		Client.method13836();
	}

	@ObfuscatedName("vz.ann(Lyf;I)V")
	public static final void cam_dec_y(ClientScriptState arg0) {
		Client.method4019();
	}

	@ObfuscatedName("vg.and(Lyf;I)V")
	public static final void cam_setfollowheight(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 < 0) {
			var1 = 0;
		}
		Client.field10901 = Client.field11089 * 35 + var1;
	}

	@ObfuscatedName("jx.anf(Lyf;B)V")
	public static final void cam_getfollowheight(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10901 - Client.field11089 * 35;
	}

	@ObfuscatedName("wv.anq(Lyf;B)V")
	public static final void cam_followcoord(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		CoordGrid var4 = Client.world.method7727();
		int var5 = var2 - var4.x;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 >= Client.world.method7728()) {
			var5 = Client.world.method7728();
		}
		int var6 = var3 - var4.z;
		if (var6 < 0) {
			var6 = 0;
		} else if (var6 >= Client.world.method7758()) {
			var6 = Client.world.method7758();
		}
		Client.field10892 = (var5 << 9) + 256;
		Client.field10893 = (var6 << 9) + 256;
		Client.field3416 = 4;
		Client.field3538 = -1;
		Client.field810 = -1;
		Client.field10902 = true;
	}

	@ObfuscatedName("j.anm(Lyf;I)V")
	public static final void cam_smoothreset(ClientScriptState arg0) {
		Client.method3605();
	}

	@ObfuscatedName("dz.any(Lyf;B)V")
	public static final void cam_removeroof(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 == -1) {
			Client.field810 = -1;
			Client.field3538 = -1;
			return;
		}
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		CoordGrid var4 = Client.world.method7727();
		int var5 = var2 - var4.x;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 >= Client.world.method7728()) {
			var5 = Client.world.method7728();
		}
		int var6 = var3 - var4.z;
		if (var6 < 0) {
			var6 = 0;
		} else if (var6 >= Client.world.method7758()) {
			var6 = Client.world.method7758();
		}
		Client.field810 = (var5 << 9) + 256;
		Client.field3538 = (var6 << 9) + 256;
	}

	@ObfuscatedName("fo.ang(Lyf;I)V")
	public static final void cam_modeisfollowplayer(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field3416 == 2 ? 1 : 0;
	}

	@ObfuscatedName("sr.ana(Lyf;I)V")
	public static final void cam2_legacycam_ready(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("fu.anv(Lyf;B)V")
	public static final void login_request(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		String var3 = (String) arg0.field8218[arg0.field8211 + 2];
		boolean var4 = arg0.field8216[--arg0.field8226] == 1;
		LoginManager.method665(var1, var2, var3, var4);
	}

	@ObfuscatedName("nv.anu(Lyf;B)V")
	public static final void cam2_setlookatmode(ClientScriptState arg0) throws CameraException {
		int var1 = arg0.field8216[--arg0.field8226];
		Client.field9155.method4684(LookatMode.method3259(var1), true);
		Client.field10902 = true;
	}

	@ObfuscatedName("nu.ant(Lyf;B)V")
	public static final void cam2_setpositionmode(ClientScriptState arg0) throws CameraException {
		int var1 = arg0.field8216[--arg0.field8226];
		Client.field9155.method4688(PositionMode.method1058(var1), true);
		Client.field10902 = true;
	}

	@ObfuscatedName("xe.anh(Lyf;I)V")
	public static final void cam2_setlookatacceleration(ClientScriptState arg0) throws CameraException {
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
		Client.field9155.method4690(var3);
		Client.field9155.method4712((float) var2 / 1000.0F);
		var3.method6486();
	}

	@ObfuscatedName("wu.anp(Lyf;I)V")
	public static final void cam2_setpositionacceleration(ClientScriptState arg0) throws CameraException {
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
		Client.field9155.method4814(var3);
		Client.field9155.method4766((float) var2 / 1000.0F);
		var3.method6486();
	}

	@ObfuscatedName("akb.anr(Lyf;I)V")
	public static final void cam2_setlookatmaxspeed(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		Vector3 var2 = Vector3.method6483((float) var1, (float) var1, (float) var1);
		Client.field9155.method4832(var2);
		var2.method6486();
	}

	@ObfuscatedName("uv.ank(Lyf;I)V")
	public static final void cam2_setpositionmaxspeed(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		Vector3 var2 = Vector3.method6483((float) var1, (float) var1, (float) var1);
		Client.field9155.method4695(var2);
		var2.method6486();
	}

	@ObfuscatedName("aca.anx(Lyf;I)V")
	public static final void cam2_setdepthplanes(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.field9155.method4698((float) var1, (float) var2);
	}

	@ObfuscatedName("eu.anz(Lyf;B)V")
	public static final void cam2_setfieldofview(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.field9155.method4828((float) ((double) var1 * 3.141592653589793D * 2.0D / 16384.0D), (float) ((double) var2 * 3.141592653589793D * 2.0D / 16384.0D));
	}

	@ObfuscatedName("kl.anj(Lyf;I)V")
	public static final void cam2_setlookatpoint_point(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		if (Client.field9155.method4743() != LookatMode.field2790) {
			throw new RuntimeException();
		}
		Lookat_Sub1 var2 = (Lookat_Sub1) Client.field9155.method4797();
		var2.method18776(var1);
		Client.field10902 = true;
	}

	@ObfuscatedName("agz.anl(Lyf;I)V")
	public static final void cam2_setpositionpoint_point(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		if (Client.field9155.method4780() != PositionMode.field2816) {
			throw new RuntimeException();
		}
		PositionPoint var2 = (PositionPoint) Client.field9155.method4709();
		var2.method16671(var1);
		Client.field10902 = true;
	}

	@ObfuscatedName("kj.ans(Lyf;I)V")
	public static final void cam2_getpositionpoint_point(ClientScriptState arg0) {
		if (Client.field9155.method4780() != PositionMode.field2816) {
			throw new RuntimeException();
		}
		arg0.field8218[++arg0.field8211 - 1] = Client.field9155.method4717();
	}

	@ObfuscatedName("hq.anc(Lyf;Lahm;I)V")
	public static final void method3936(ClientScriptState arg0, PathingEntity arg1) {
		arg0.field8226 -= 4;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		int var4 = arg0.field8216[arg0.field8226 + 2];
		boolean var5 = arg0.field8216[arg0.field8226 + 3] == 1;
		if (Client.field9155.method4743() != LookatMode.field2788) {
			throw new RuntimeException();
		}
		LookatEntity var6 = (LookatEntity) Client.field9155.method4797();
		if (arg1 != null) {
			var6.method18816(arg1, new Vector3((float) var2, (float) var3, (float) var4), var5);
		}
		Client.field10902 = true;
	}

	@ObfuscatedName("pj.anb(Lyf;B)V")
	public static final void cam2_setlookatentity_player(ClientScriptState arg0) {
		method3936(arg0, Client.field4490);
	}

	@ObfuscatedName("as.anw(Lyf;I)V")
	public static final void cam2_setlookatentity_npc(ClientScriptState arg0) {
		method3936(arg0, arg0.field8221);
	}

	@ObfuscatedName("go.ano(Lyf;Lahm;I)V")
	public static final void cam2_setpositionentity(ClientScriptState arg0, PathingEntity arg1) {
		arg0.field8226 -= 7;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		int var4 = arg0.field8216[arg0.field8226 + 2];
		int var5 = arg0.field8216[arg0.field8226 + 3];
		int var6 = arg0.field8216[arg0.field8226 + 4];
		boolean var7 = arg0.field8216[arg0.field8226 + 5] == 1;
		int var8 = arg0.field8216[arg0.field8226 + 6];
		if (Client.field9155.method4780() != PositionMode.field2815) {
			throw new RuntimeException();
		}
		PositionEntity var9 = (PositionEntity) Client.field9155.method4709();
		Quaternion var10 = new Quaternion();
		Quaternion var11 = new Quaternion();
		var10.method6414(0.0F, 1.0F, 0.0F, (float) ((double) var6 * 3.141592653589793D * 2.0D / 16384.0D));
		Vector3 var12 = new Vector3(1.0F, 0.0F, 0.0F);
		var12.method6526(var10);
		var12.method6494();
		var11.method6413(var12, (float) ((double) var5 * 3.141592653589793D * 2.0D / 16384.0D));
		var10.method6424(var11);
		CoordGrid var13 = Client.world.method7727();
		int var14 = var13.x << 9;
		int var15 = var13.z << 9;
		if (arg1 != null) {
			var9.method16683(arg1, new Vector3((float) var2, (float) var3, (float) var4), var10, var7, var8, Client.world.method7744().levelHeightmap, Client.world.method7793(), var14, var15);
		}
		Client.field10902 = true;
	}

	@ObfuscatedName("bf.ani(Lyf;B)V")
	public static final void cam2_setpositionentity_player(ClientScriptState arg0) {
		cam2_setpositionentity(arg0, Client.field4490);
	}

	@ObfuscatedName("pv.aou(Lyf;B)V")
	public static final void cam2_setpositionentity_npc(ClientScriptState arg0) {
		cam2_setpositionentity(arg0, arg0.field8221);
	}

	@ObfuscatedName("tv.aoy(Lyf;B)V")
	public static final void cam2_setfieldofviewscreen(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		float var4 = (float) (Math.atan((double) ((float) var1 / 2.0F / (float) var3)) * 2.0D);
		float var5 = (float) (Math.atan((double) ((float) var2 / 2.0F / (float) var3)) * 2.0D);
		Client.field9155.method4828(var4, var5);
	}

	@ObfuscatedName("gq.aoi(Lyf;I)V")
	public static final void cam2_setpositionspline_spline(ClientScriptState arg0) {
		if (!Client.field9155.method4780().method4623()) {
			throw new RuntimeException();
		}
		PositionSpline var1 = (PositionSpline) Client.field9155.method4709();
		var1.method16720(Client.field3178, -1, 0.0F);
		Client.field10902 = true;
	}

	@ObfuscatedName("aal.aow(Lyf;I)V")
	public static final void cam2_setlookatspline_spline(ClientScriptState arg0) {
		if (!Client.field9155.method4743().method4602()) {
			throw new RuntimeException();
		}
		LookatSpline var1 = (LookatSpline) Client.field9155.method4797();
		var1.method18832(Client.field3178, -1, 0.0F);
		Client.field10902 = true;
	}

	@ObfuscatedName("if.aob(Lyf;I)V")
	public static final void cam2_getcontrolmode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field9155.method4708().field2827;
	}

	@ObfuscatedName("vw.aoo(Lyf;I)V")
	public static final void cam2_getlookatmode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field9155.method4743() == null ? -1 : Client.field9155.method4743().field2794;
	}

	@ObfuscatedName("he.aos(Lyf;I)V")
	public static final void cam2_getpositionmode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field9155.method4780() == null ? -1 : Client.field9155.method4780().field2814;
	}

	@ObfuscatedName("rp.aoc(Lyf;I)V")
	public static final void cam2_getpositionentity_angleoffsets(ClientScriptState arg0) {
		if (Client.field9155.method4780() != PositionMode.field2815) {
			throw new RuntimeException();
		}
		PositionEntity var1 = (PositionEntity) Client.field9155.method4709();
		arg0.field8216[++arg0.field8226 - 1] = (int) ((double) var1.method16693() * 2607.5945876176133D) & 0x3FFF;
		arg0.field8216[++arg0.field8226 - 1] = (int) ((double) var1.method16694() * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("qb.aod(Lyf;B)V")
	public static final void cam2_addeffect_shake(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		ShakeMode var4 = ShakeMode.method1599(var1);
		float var5 = (float) var2;
		if (ShakeMode.field2622 == var4 || ShakeMode.field2623 == var4 || ShakeMode.field2624 == var4) {
			var5 = Trig1.method6277(var2);
		}
		Shake var6 = new Shake(Client.field9155.method16602(), var4, var5, (float) var3 / 1000.0F);
		Client.field9155.method4702(var6);
		arg0.field8216[++arg0.field8226 - 1] = var6.field12341;
	}

	@ObfuscatedName("aaq.aok(Lyf;I)V")
	public static final void cam2_removeeffect(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Client.field9155.method4703(var1);
	}

	@ObfuscatedName("sn.aov(Lyf;B)V")
	public static final void cam2_removealleffects(ClientScriptState arg0) {
		Client.field9155.method4705();
	}

	@ObfuscatedName("ar.aor(Lyf;I)V")
	public static final void cam2_setlookatacceleration_axis(ClientScriptState arg0) throws CameraException {
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
		Client.field9155.method4690(var5);
		Client.field9155.method4712((float) var4 / 1000.0F);
		var5.method6486();
	}

	@ObfuscatedName("qn.aol(Lyf;S)V")
	public static final void cam2_setpositionacceleration_axis(ClientScriptState arg0) throws CameraException {
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
		Client.field9155.method4814(var5);
		Client.field9155.method4766((float) var4 / 1000.0F);
		var5.method6486();
	}

	@ObfuscatedName("x.aom(Lyf;B)V")
	public static final void cam2_setlookatmaxspeed_axis(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Vector3 var4 = Vector3.method6483((float) var1, (float) var2, (float) var3);
		Client.field9155.method4832(var4);
		var4.method6486();
	}

	@ObfuscatedName("bc.aoj(Lyf;I)V")
	public static final void cam2_setpositionmaxspeed_axis(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Vector3 var4 = Vector3.method6483((float) var1, (float) var2, (float) var3);
		Client.field9155.method4695(var4);
		var4.method6486();
	}

	@ObfuscatedName("aqy.aof(Lyf;B)V")
	public static final void cam2_getpositionentity_lookatangleoffsets(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field9155.method4780() != PositionMode.field2815 || Client.field9155.method4743() != LookatMode.field2788) {
			throw new RuntimeException();
		}
		PositionEntity var2 = (PositionEntity) Client.field9155.method4709();
		LookatEntity var3 = (LookatEntity) Client.field9155.method4797();
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
		float var10 = CameraHelpers.method9272(var4.field4308 - var9.field4308, var4.field4313 - var9.field4313);
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = (int) ((double) var10 * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("pz.aop(Lyf;I)V")
	public static final void cam2_getpositionentity_lookatangle(ClientScriptState arg0) {
		if (Client.field9155.method4780() != PositionMode.field2815 || Client.field9155.method4743() != LookatMode.field2788) {
			throw new RuntimeException();
		}
		Vector3 var1 = ((PositionEntity) Client.field9155.method4709()).method16691();
		Vector3 var2 = ((LookatEntity) Client.field9155.method4797()).method18819();
		Vector3 var3 = Vector3.method6484(var1);
		var3.method6537(var2);
		float var4 = CameraHelpers.method9272(var3.field4308, var3.field4313);
		arg0.field8216[++arg0.field8226 - 1] = (int) ((double) var4 * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("f.aog(Lyf;I)V")
	public static final void cam2_getpositionentity_lookatdistance(ClientScriptState arg0) {
		if (Client.field9155.method4780() != PositionMode.field2815 || Client.field9155.method4743() != LookatMode.field2788) {
			throw new RuntimeException();
		}
		Vector3 var1 = ((PositionEntity) Client.field9155.method4709()).method16691();
		Vector3 var2 = ((LookatEntity) Client.field9155.method4797()).method18819();
		Vector3 var3 = Vector3.method6484(var1);
		var3.method6537(var2);
		arg0.field8216[++arg0.field8226 - 1] = (int) var3.method6519();
	}

	@ObfuscatedName("qe.aoa(Lyf;I)V")
	public static final void cam2_setcollisionmode(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 2;
		boolean var1 = arg0.field8216[arg0.field8226] == 1;
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		Client.field9155.method4700(var1, var2);
	}

	@ObfuscatedName("qf.aot(Lyf;I)V")
	public static final void cam2_setpositionpointcollision(ClientScriptState arg0) {
		if (Client.field9155.method4780() != PositionMode.field2816) {
			throw new RuntimeException();
		}
		((PositionPoint) Client.field9155.method4709()).method16672(arg0.field8216[--arg0.field8226] == 1);
	}

	@ObfuscatedName("dl.aoe(Lyf;I)V")
	public static final void cam2_addeffect_ztilt(ClientScriptState arg0) {
		float var1 = Trig1.method6277(arg0.field8216[--arg0.field8226]);
		ZTilt var2 = new ZTilt(Client.field9155.method16602(), var1);
		Client.field9155.method4702(var2);
		arg0.field8216[++arg0.field8226 - 1] = var2.field12341;
	}

	@ObfuscatedName("mz.aon(Lyf;I)V")
	public static final void cam2_updateeffect_ztilt(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		float var2 = Trig1.method6277(arg0.field8216[arg0.field8226 + 1]);
		CameraEffect var3 = Client.field9155.method4704(var1);
		if (var3 == null) {
			throw new RuntimeException("");
		} else if (var3 instanceof ZTilt) {
			((ZTilt) var3).method19713(var2);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("xc.aoh(Lyf;I)V")
	public static final void cam2_settraildistance(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		float var2 = (float) arg0.field8216[arg0.field8226 + 1] / 1000.0F;
		Client.field9155.method4701(var1, var2);
	}

	@ObfuscatedName("wg.aox(Lyf;S)V")
	public static final void cam2_setlinearmovementmode(ClientScriptState arg0) throws CameraException {
		int var1 = arg0.field8216[--arg0.field8226];
		CameraLinearMovementMode var2 = CameraLinearMovementMode.method17805(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Client.field9155.method4689(var2);
	}

	@ObfuscatedName("ur.aoq(Lyf;S)V")
	public static final void cam2_setspringproperties(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 4;
		float var1 = (float) arg0.field8216[arg0.field8226];
		float var2 = (float) arg0.field8216[arg0.field8226 + 1];
		float var3 = (float) arg0.field8216[arg0.field8226 + 2];
		float var4 = (float) arg0.field8216[arg0.field8226 + 3] / 1000.0F;
		Client.field9155.method4696(Vector3.method6483(var1, var2, var3), var4);
	}

	@ObfuscatedName("qd.aoz(Lyf;I)V")
	public static final void cam2_setlookatangularinterpolation(ClientScriptState arg0) throws CameraException {
		Client.field9155.method4712((float) arg0.field8216[--arg0.field8226] / 1000.0F);
	}

	@ObfuscatedName("qj.api(Lyf;B)V")
	public static final void cam2_setpositionangularinterpolation(ClientScriptState arg0) throws CameraException {
		Client.field9155.method4766((float) arg0.field8216[--arg0.field8226] / 1000.0F);
	}

	@ObfuscatedName("qo.apw(Lyf;I)V")
	public static final void cam2_setlookatspringproperties(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 4;
		float var1 = (float) arg0.field8216[arg0.field8226];
		float var2 = (float) arg0.field8216[arg0.field8226 + 1];
		float var3 = (float) arg0.field8216[arg0.field8226 + 2];
		float var4 = (float) arg0.field8216[arg0.field8226 + 3] / 1000.0F;
		Client.field9155.method4699(Vector3.method6483(var1, var2, var3), var4);
	}

	@ObfuscatedName("ajd.ape(Lyf;I)V")
	public static final void cam2_setpositionspringproperties(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 4;
		float var1 = (float) arg0.field8216[arg0.field8226];
		float var2 = (float) arg0.field8216[arg0.field8226 + 1];
		float var3 = (float) arg0.field8216[arg0.field8226 + 2];
		float var4 = (float) arg0.field8216[arg0.field8226 + 3] / 1000.0F;
		Client.field9155.method4725(Vector3.method6483(var1, var2, var3), var4);
	}

	@ObfuscatedName("rt.apq(Lyf;S)V")
	public static final void cam2_enable(ClientScriptState arg0) {
		boolean var1 = arg0.field8216[--arg0.field8226] == 1;
		if (var1) {
			Client.method4046(3);
		} else {
			Client.method4046(2);
		}
	}

	@ObfuscatedName("ua.apm(Lyf;I)V")
	public static final void cam2_isenabled(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field3416 == 3 ? 1 : 0;
	}

	@ObfuscatedName("ho.apy(Lyf;I)V")
	public static final void cam2_setsnapdistances(ClientScriptState arg0) throws CameraException {
		arg0.field8226 -= 3;
		Client.field9155.method4782((float) arg0.field8216[arg0.field8226], (float) arg0.field8216[arg0.field8226 + 1], (float) arg0.field8216[arg0.field8226 + 2]);
	}

	@ObfuscatedName("eq.apj(Lyf;B)V")
	public static final void cam2_resetsnapdistances(ClientScriptState arg0) throws CameraException {
		Client.field9155.method4756();
	}

	@ObfuscatedName("wg.apu(Lyf;I)V")
	public static final void cam2_setlookatorientation_vector(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		if (Client.field9155.method4743() != LookatMode.field2791) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.field9155.method4797()).method18785(arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1], arg0.field8216[arg0.field8226 + 2]);
	}

	@ObfuscatedName("tt.apc(Lyf;I)V")
	public static final void cam2_setlookatorientation_yrotation(ClientScriptState arg0) {
		if (Client.field9155.method4743() != LookatMode.field2791) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.field9155.method4797()).method18783(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("ga.apg(Lyf;B)V")
	public static final void cam2_setlookatorientation_xrotation(ClientScriptState arg0) {
		if (Client.field9155.method4743() != LookatMode.field2791) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.field9155.method4797()).method18789(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("e.apx(Lyf;I)V")
	public static final void cam2_setlookatorientation_xmovement(ClientScriptState arg0) {
		if (Client.field9155.method4743() != LookatMode.field2791) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.field9155.method4797()).method18788(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("tl.apb(Lyf;I)V")
	public static final void cam2_setlookatorientation_zmovement(ClientScriptState arg0) {
		if (Client.field9155.method4743() != LookatMode.field2791) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.field9155.method4797()).method18784(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("yu.apl(Lyf;I)V")
	public static final void cam2_setlookatorientation_maxdistanceclamping(ClientScriptState arg0) {
		arg0.field8226 -= 6;
		CoordFine var1 = (CoordFine) arg0.field8218[--arg0.field8211];
		if (Client.field9155.method4743() != LookatMode.field2791) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.field9155.method4797()).method18780(var1.method17853(), arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1], arg0.field8216[arg0.field8226 + 2], arg0.field8216[arg0.field8226 + 3], arg0.field8216[arg0.field8226 + 4], arg0.field8216[arg0.field8226 + 5]);
	}

	@ObfuscatedName("eu.apr(Lyf;I)V")
	public static final void login_continue(ClientScriptState arg0) {
		LoginManager.method9584();
	}

	@ObfuscatedName("ek.apo(Lyf;I)V")
	public static final void login_resetreply(ClientScriptState arg0) {
		if (!LoginManager.method2865()) {
			LoginManager.method9067();
		}
	}

	@ObfuscatedName("ag.apv(Lyf;I)V")
	public static final void create_availablerequest(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		AccountCreationManager.method233(var1);
	}

	@ObfuscatedName("pc.apd(Lyf;B)V")
	public static final void create_name_availablerequest(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		AccountCreationManager.method18305(var1);
	}

	@ObfuscatedName("aaj.apn(Lyf;I)V")
	public static final void create_suggest_name_request(ClientScriptState arg0) {
		AccountCreationManager.method648();
	}

	@ObfuscatedName("ki.app(Lyf;B)V")
	public static final void create_connectrequest(ClientScriptState arg0) {
		AccountCreationManager.method2009();
	}

	@ObfuscatedName("ags.apz(Lyf;I)V")
	public static final void create_createrequest(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		arg0.field8226 -= 2;
		AccountCreationManager.method19266((String) arg0.field8218[arg0.field8211], (String) arg0.field8218[arg0.field8211 + 1], arg0.field8216[arg0.field8226], arg0.field8216[arg0.field8226 + 1] == 1, (String) arg0.field8218[arg0.field8211 + 2]);
	}

	@ObfuscatedName("sp.aph(Lyf;I)V")
	public static final void create_step_reached(ClientScriptState arg0) {
		AccountCreationManager.method16428(arg0.field8216[--arg0.field8226]);
	}

	@ObfuscatedName("xn.apt(Lyf;I)V")
	public static final void login_reply(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field477;
	}

	@ObfuscatedName("yu.apa(Lyf;I)V")
	public static final void login_hoptime(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field464 * 2500;
	}

	@ObfuscatedName("ea.apf(Lyf;I)V")
	public static final void login_ban_duration(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field486;
	}

	@ObfuscatedName("ahz.apk(Lyf;B)V")
	public static final void create_reply(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = AccountCreationManager.method18475().getId();
	}

	@ObfuscatedName("acl.aps(Lyf;I)V")
	public static final void create_email_validate_reply(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = AccountCreationManager.method9583().getId();
	}

	@ObfuscatedName("ge.aqd(Lyf;B)V")
	public static final void create_name_validate_reply(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = AccountCreationManager.method16613().getId();
	}

	@ObfuscatedName("ake.aqv(Lyf;I)V")
	public static final void create_suggest_name_reply(ClientScriptState arg0) {
		SuggestNameReply var1 = AccountCreationManager.method16742();
		String var2 = AccountCreationManager.method10209();
		if (var2 == null) {
			var2 = "";
		}
		arg0.field8216[++arg0.field8226 - 1] = var1.getId();
		arg0.field8218[++arg0.field8211 - 1] = var2;
	}

	@ObfuscatedName("qf.aqn(Lyf;I)V")
	public static final void create_connect_reply(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = AccountCreationManager.method2858().getId();
	}

	@ObfuscatedName("if.aqm(Lyf;B)V")
	public static final void login_disallowresult(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field483;
	}

	@ObfuscatedName("qg.aqk(Lyf;I)V")
	public static final void lobby_entergame(ClientScriptState arg0) {
		LoginManager.method1681((String) arg0.field8218[--arg0.field8211], arg0.field8216[--arg0.field8226] == 1);
	}

	@ObfuscatedName("et.aqc(Lyf;I)V")
	public static final void lobby_entergamereply(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field477;
	}

	@ObfuscatedName("vo.aqz(Lyf;I)V")
	public static final void lobby_enterlobby(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		String var1 = (String) arg0.field8218[arg0.field8211];
		String var2 = (String) arg0.field8218[arg0.field8211 + 1];
		String var3 = (String) arg0.field8218[arg0.field8211 + 2];
		boolean var4 = arg0.field8216[--arg0.field8226] == 1;
		LoginManager.method18565(var1, var2, var3, var4);
	}

	@ObfuscatedName("u.aqp(Lyf;I)V")
	public static final void lobby_enterlobby_sso(ClientScriptState arg0) {
		arg0.field8211--;
		arg0.field8226--;
	}

	@ObfuscatedName("hv.aqx(Lyf;I)V")
	public static final void sso_available(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("mt.aqt(Lyf;I)V")
	public static final void sso_displayname(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("fm.aqh(Lyf;I)V")
	public static final void shop_open(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("kj.aqy(Lyf;I)V")
	public static final void method5356(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("sx.aqw(Lyf;S)V")
	public static final void shop_applypendingtransactions(ClientScriptState arg0) {
	}

	@ObfuscatedName("gl.aqe(Lyf;I)V")
	public static final void shop_requestdata(ClientScriptState arg0) {
	}

	@ObfuscatedName("kl.aqr(Lyf;I)V")
	public static final void shop_requestdatastatus(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("u.aqu(Lyf;B)V")
	public static final void shop_getcategorycount(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("tr.aqq(Lyf;B)V")
	public static final void shop_getcategoryid(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("tu.aqs(Lyf;B)V")
	public static final void shop_getindexforcategoryid(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("ahj.aqb(Lyf;I)V")
	public static final void shop_getindexforcategoryname(ClientScriptState arg0) {
		arg0.field8211--;
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("dm.aqo(Lyf;I)V")
	public static final void shop_getcategorydescription(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8218[++arg0.field8211 - 1] = "";
	}

	@ObfuscatedName("vz.aqi(Lyf;I)V")
	public static final void shop_getproductcount(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("x.aqf(Lyf;I)V")
	public static final void shop_isproductavailable(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("uf.aqg(Lyf;B)V")
	public static final void shop_isproductrecommended(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("jk.aqa(Lyf;B)V")
	public static final void shop_getproductdetails(ClientScriptState arg0) {
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
	public static final void marketing_init(ClientScriptState arg0) {
	}

	@ObfuscatedName("il.aqj(Lyf;I)V")
	public static final void marketing_sendevent(ClientScriptState arg0) {
		arg0.field8211--;
	}

	@ObfuscatedName("acv.are(Lyf;I)V")
	public static final void notifications_init(ClientScriptState arg0) {
	}

	@ObfuscatedName("qd.arx(Lyf;B)V")
	public static final void notifications_opensettings(ClientScriptState arg0) {
	}

	@ObfuscatedName("akv.arg(Lyf;I)V")
	public static final void lobby_leavelobby(ClientScriptState arg0) {
		Client.logout(false);
	}

	@ObfuscatedName("fx.arp(Lyf;I)V")
	public static final void lobby_enterlobbyreply(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field476;
	}

	@ObfuscatedName("qw.ari(Lyf;B)V")
	public static final void resend_uid_passport_request(ClientScriptState arg0) {
		if (Client.state == 17) {
			ClientMessage var1 = ClientMessage.method1604(ClientProt.UID_PASSPORT_RESEND_REQUEST, Client.lobbyConnection.field794);
			Client.lobbyConnection.queue(var1);
		}
	}

	@ObfuscatedName("wu.ary(Lyf;B)V")
	public static final void userflowflags(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10776;
		arg0.field8216[++arg0.field8226 - 1] = Client.field10775;
	}

	@ObfuscatedName("er.aro(Lyf;B)V")
	public static final void automatedtestflags(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10778;
		arg0.field8216[++arg0.field8226 - 1] = Client.field10777;
	}

	@ObfuscatedName("tu.arl(Lyf;I)V")
	public static final void create_under13(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10814 ? 1 : 0;
	}

	@ObfuscatedName("ahg.arj(Lyf;B)V")
	public static final void create_setunder13(ClientScriptState arg0) {
		Client.field10814 = true;
		Client.method3094();
	}

	@ObfuscatedName("adv.arc(Lyf;B)V")
	public static final void login_last_transfer_reply(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field469;
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field444;
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field479;
		LoginManager.field469 = -2;
		LoginManager.field444 = -1;
		LoginManager.field479 = -1;
	}

	@ObfuscatedName("gr.art(Lyf;B)V")
	public static final void login_inprogress(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.method2865() ? 1 : 0;
	}

	@ObfuscatedName("sx.arb(Lyf;B)V")
	public static final void login_queue_position(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field467;
	}

	@ObfuscatedName("ys.arw(Lyf;S)V")
	public static final void login_cancel(ClientScriptState arg0) {
		LoginManager.method14129();
	}

	@ObfuscatedName("oo.arh(Lyf;B)V")
	public static final void login_request_social_network(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		boolean var3 = arg0.field8216[arg0.field8226 + 1] == 1;
		LoginManager.method2050(var1, var2, var3);
	}

	@ObfuscatedName("cc.aru(Lyf;I)V")
	public static final void lobby_enterlobby_social_network(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		boolean var3 = arg0.field8216[arg0.field8226 + 1] == 1;
		LoginManager.method17463(var1, var2, var3);
	}

	@ObfuscatedName("ahq.arf(Lyf;B)V")
	public static final void login_disallowtrigger(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = LoginManager.field482;
	}

	@ObfuscatedName("on.arz(Lyf;B)V")
	public static final void create_get_email(ClientScriptState arg0) {
		if (Client.field10790 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = Client.field10790;
		}
	}

	@ObfuscatedName("kr.arv(Lyf;I)V")
	public static final void login_accountappeal(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		long var2 = AccountAppealLogin.method14886();
		if (var2 == 0L) {
			arg0.field8216[++arg0.field8226 - 1] = 5;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = AccountAppealLogin.method14753(var2, var1);
		}
	}

	@ObfuscatedName("pu.arq(Lyf;I)V")
	public static final void detail_brightness(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Client.preferences.method18157(Client.preferences.brightness, var1);
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("akw.ars(Lyf;I)V")
	public static final void detail_removeroofs_option(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Client.preferences.method18157(Client.preferences.removeRoofs, var1);
		Client.preferences.method18157(Client.preferences.removeRoofs2, var1);
		Client.preferences.removeRoofs.clampValue();
		Client.preferences.removeRoofs2.clampValue();
		Client.method3128();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("fv.arm(Lyf;I)V")
	public static final void detail_grounddecor_on(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.groundDecoration, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("ec.ark(Lyf;B)V")
	public static final void detail_idleanims_many(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.idleAnimations, arg0.field8216[--arg0.field8226]);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("any.arn(Lyf;I)V")
	public static final void detail_flickering_on(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.flickeringEffects, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("fz.ara(Lyf;I)V")
	public static final void detail_spotshadows_on(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.characterShadows, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("aae.ard(Lyf;I)V")
	public static final void detail_hardshadows(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.sceneryShadows, arg0.field8216[--arg0.field8226]);
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("ju.arr(Lyf;S)V")
	public static final void detail_shadowquality(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.shadowQuality, arg0.field8216[--arg0.field8226]);
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("no.asa(Lyf;I)V")
	public static final void detail_lightdetail_high(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.lightingDetail, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		Client.method9516();
		Client.world.method7816().method10019();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("yu.asg(Lyf;B)V")
	public static final void detail_waterdetail_high(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.waterDetail, arg0.field8216[--arg0.field8226] == 1 ? 2 : 0);
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("ck.aso(Lyf;B)V")
	public static final void detail_fog_on(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.fog, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("xe.ask(Lyf;B)V")
	public static final void detail_antialiasing(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.antiAliasing2, arg0.field8216[--arg0.field8226]);
		Client.method486(Client.preferences.displayMode2.getValue(), false);
		Preferences.method16391();
	}

	@ObfuscatedName("oo.asd(Lyf;I)V")
	public static final void detail_stereo(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.stereo, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("io.asy(Lyf;I)V")
	public static final void detail_soundvol(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.soundVolume, arg0.field8216[--arg0.field8226]);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("pd.asr(Lyf;B)V")
	public static final void detail_musicvol(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = Client.preferences.unknownVolume1.getValue();
		if (var1 != var2) {
			Client.preferences.method18157(Client.preferences.unknownVolume1, var1);
			Preferences.method16391();
			Client.field10800 = false;
		}
	}

	@ObfuscatedName("e.asc(Lyf;I)V")
	public static final void detail_bgsoundvol(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.backgroundSoundVolume, arg0.field8216[--arg0.field8226]);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("mw.asq(Lyf;B)V")
	public static final void detail_removeroofs_option_override(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 == -1) {
			Client.preferences.method18157(Client.preferences.removeRoofs2, Client.preferences.removeRoofs.getValue());
		} else {
			Client.preferences.method18157(Client.preferences.removeRoofs2, var1);
		}
		Client.method3128();
	}

	@ObfuscatedName("vj.asf(Lyf;B)V")
	public static final void detail_particles(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Client.preferences.method18157(Client.preferences.particles, var1);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("akw.asp(Lyf;I)V")
	public static final void detail_antialiasing_default(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.antiAliasing, arg0.field8216[--arg0.field8226]);
		Preferences.method16391();
	}

	@ObfuscatedName("sz.asb(Lyf;B)V")
	public static final void detail_buildarea(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.buildArea, arg0.field8216[--arg0.field8226]);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("ajf.ase(Lyf;I)V")
	public static final void detail_bloom(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 < 0 || var1 > 1) {
			var1 = 0;
		}
		Client.method9756(var1 == 1);
	}

	@ObfuscatedName("py.asz(Lyf;I)V")
	public static final void detail_customcursors(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.customCursors, arg0.field8216[--arg0.field8226] == 0 ? 0 : 1);
		Preferences.method16391();
	}

	@ObfuscatedName("uk.asl(Lyf;I)V")
	public static final void detail_idleanims(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.idleAnimations, arg0.field8216[--arg0.field8226]);
		Preferences.method16391();
	}

	@ObfuscatedName("ht.asu(Lyf;I)V")
	public static final void detail_groundblending(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.groundBlending, arg0.field8216[--arg0.field8226] == 0 ? 0 : 1);
		Preferences.method16391();
		Client.world.method7753();
	}

	@ObfuscatedName("pu.asn(Lyf;I)V")
	public static final void detail_toolkit(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 < 0 || var1 > 5 || var1 == 2) {
			var1 = 3;
		}
		Client.method486(var1, false);
	}

	@ObfuscatedName("pm.asj(Lyf;S)V")
	public static final void detail_toolkit_default(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		Client.preferences.method18157(Client.preferences.displayMode, var1);
		if (!var2) {
			Client.preferences.method18157(Client.preferences.preset, 0);
		}
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("aax.asv(Lyf;I)V")
	public static final void detail_cpuusage(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.cpuUsage, arg0.field8216[--arg0.field8226]);
		Preferences.method16391();
	}

	@ObfuscatedName("ge.asm(Lyf;I)V")
	public static final void detail_texturing(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.textures, arg0.field8216[--arg0.field8226] == 1 ? 1 : 0);
		Preferences.method16391();
		Client.method9516();
		SpotShadowFactory.method3076();
		Client.field10800 = false;
	}

	@ObfuscatedName("fl.asw(Lyf;I)V")
	public static final void detail_maxscreensize(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.screenSize, arg0.field8216[--arg0.field8226]);
		Preferences.method16391();
		Client.field10836 = true;
	}

	@ObfuscatedName("wu.ast(Lyf;B)V")
	public static final void detail_speechvol(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.speechVolume, arg0.field8216[--arg0.field8226]);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("nv.ash(Lyf;I)V")
	public static final void detail_loginvol(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = Client.preferences.unknownVolume2.getValue();
		if (var1 != var2) {
			Client.preferences.method18157(Client.preferences.unknownVolume2, var1);
			Preferences.method16391();
			Client.field10800 = false;
		}
	}

	@ObfuscatedName("tc.asi(Lyf;B)V")
	public static final void detail_loadingscreentype(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 > 255 || var1 < 0) {
			var1 = 0;
		}
		if (var1 != Client.preferences.loadingScreen.getValue()) {
			Client.preferences.method18157(Client.preferences.loadingScreen, var1);
			Preferences.method16391();
			Client.field10800 = false;
		}
	}

	@ObfuscatedName("ajh.ass(Lyf;B)V")
	public static final void detail_skydetail(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 != Client.preferences.skyboxes.getValue()) {
			Client.preferences.method18157(Client.preferences.skyboxes, var1);
			Preferences.method16391();
			Client.field10800 = false;
		}
	}

	@ObfuscatedName("wo.asx(Lyf;B)V")
	public static final void detail_animdetail(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (var1 != Client.preferences.animDetail.getValue()) {
			Client.preferences.method18157(Client.preferences.animDetail, var1);
			Preferences.method16391();
			Client.field10800 = false;
			Client.world.method7753();
		}
	}

	@ObfuscatedName("gm.ato(Lyf;B)V")
	public static final void detail_drawdistance(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("fc.att(Lyf;B)V")
	public static final void detail_diskcachesize(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("vq.atu(Lyf;I)V")
	public static final void detail_shadows(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ye.atp(Lyf;I)V")
	public static final void detail_lightingquality(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("wu.atl(Lyf;B)V")
	public static final void detail_antialiasingmode(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("adc.atv(Lyf;I)V")
	public static final void detail_ambientocclusion(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("go.atw(Lyf;I)V")
	public static final void detail_reflections(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("abq.atc(Lyf;I)V")
	public static final void detail_vsync(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("xq.atn(Lyf;I)V")
	public static final void detail_anisotropicfiltering(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("nq.atq(Lyf;I)V")
	public static final void detail_volumetriclighting(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("aav.aty(Lyf;I)V")
	public static final void detail_maxforegroundfps(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("yl.ath(Lyf;I)V")
	public static final void detail_maxbackgroundfps(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("gk.ata(Lyf;I)V")
	public static final void detail_gamerenderscale(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("nw.ats(Lyf;B)V")
	public static final void detail_interfacescale(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("kt.atx(Lyf;I)V")
	public static final void detail_dof(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ul.atz(Lyf;I)V")
	public static final void detailget_brightness(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.brightness.getValue();
	}

	@ObfuscatedName("ahb.atg(Lyf;I)V")
	public static final void detailget_removeroofs_option(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.removeRoofs.getValue();
	}

	@ObfuscatedName("cb.atr(Lyf;I)V")
	public static final void detailget_grounddecor_on(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.groundDecoration.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("abv.atk(Lyf;I)V")
	public static final void detailget_idleanims_many(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.idleAnimations.getValue();
	}

	@ObfuscatedName("gk.ati(Lyf;I)V")
	public static final void detailget_flickering_on(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.flickeringEffects.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("yu.atm(Lyf;I)V")
	public static final void detailget_spotshadows_on(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.characterShadows.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("ji.ate(Lyf;B)V")
	public static final void detailget_hardshadows(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.sceneryShadows.getValue();
	}

	@ObfuscatedName("ew.atj(Lyf;I)V")
	public static final void detailget_shadowquality(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.shadowQuality.getValue();
	}

	@ObfuscatedName("ub.atd(Lyf;I)V")
	public static final void detailget_lightdetail_high(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.lightingDetail.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("yo.atf(Lyf;I)V")
	public static final void detailget_waterdetail_high(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.waterDetail.getValue() == 2 ? 1 : 0;
	}

	@ObfuscatedName("s.atb(Lyf;I)V")
	public static final void detailget_fog_on(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.fog.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("xc.auq(Lyf;I)V")
	public static final void detailget_antialiasing(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.antiAliasing2.getValue();
	}

	@ObfuscatedName("kt.auf(Lyf;I)V")
	public static final void detailget_stereo(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.stereo.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("el.auj(Lyf;B)V")
	public static final void detailget_soundvol(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.soundVolume.getValue();
	}

	@ObfuscatedName("ye.aut(Lyf;I)V")
	public static final void detailget_musicvol(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.unknownVolume1.getValue();
	}

	@ObfuscatedName("sa.aue(Lyf;I)V")
	public static final void detailget_bgsoundvol(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.backgroundSoundVolume.getValue();
	}

	@ObfuscatedName("jg.aur(Lyf;B)V")
	public static final void detailget_particles(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ParticleSystemRenderer.method8461();
	}

	@ObfuscatedName("wn.auu(Lyf;I)V")
	public static final void detailget_antialiasing_default(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.antiAliasing.getValue();
	}

	@ObfuscatedName("ane.auv(Lyf;S)V")
	public static final void detailget_buildarea(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.buildArea.getValue();
	}

	@ObfuscatedName("hh.aus(Lyf;B)V")
	public static final void detailget_bloom(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.bloom.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("afg.auc(Lyf;I)V")
	public static final void detailget_customcursors(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.customCursors.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("db.aud(Lyf;I)V")
	public static final void detailget_idleanims(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.idleAnimations.getValue();
	}

	@ObfuscatedName("bf.aup(Lyf;I)V")
	public static final void detailget_groundblending(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.groundBlending.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("du.aum(Lyf;I)V")
	public static final void detailget_toolkit(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.displayMode2.getValue();
	}

	@ObfuscatedName("gj.auk(Lyf;I)V")
	public static final void detailget_toolkit_default(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.displayMode.getValue();
	}

	@ObfuscatedName("nt.aux(Lyf;B)V")
	public static final void detailget_cpuusage(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.cpuUsage.getValue();
	}

	@ObfuscatedName("db.auw(Lyf;I)V")
	public static final void detailget_texturing(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.textures.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("kf.aul(Lyf;B)V")
	public static final void detailget_performance_metric(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.method15172(Client.preferences.displayMode2.getValue(), 200);
	}

	@ObfuscatedName("fd.aui(Lyf;I)V")
	public static final void detailget_maxscreensize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.screenSize.getValue();
	}

	@ObfuscatedName("wd.auz(Lyf;I)V")
	public static final void detailget_speechvol(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.speechVolume.getValue();
	}

	@ObfuscatedName("ach.auh(Lyf;B)V")
	public static final void detailget_loginvol(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.unknownVolume2.getValue();
	}

	@ObfuscatedName("j.aua(Lyf;B)V")
	public static final void detailget_safemode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10779 ? 1 : 0;
	}

	@ObfuscatedName("dy.aub(Lyf;B)V")
	public static final void detailget_loadingscreentype(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.loadingScreen.getValue();
	}

	@ObfuscatedName("jd.aun(Lyf;I)V")
	public static final void detailget_orthographic(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.orthographic.getValue();
	}

	@ObfuscatedName("ec.auy(Lyf;I)V")
	public static final void detailget_canchoosesafemode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.hardwarePlatform.cpuInfoRam < 512 || Client.field10779 || Client.field10796 ? 1 : 0;
	}

	@ObfuscatedName("wp.aug(Lyf;I)V")
	public static final void detailget_chosesafemode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10812 ? 1 : 0;
	}

	@ObfuscatedName("aks.auo(Lyf;B)V")
	public static final void detailget_drawdistance(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.drawDistance.getValue();
	}

	@ObfuscatedName("aoq.avs(Lyf;I)V")
	public static final void detailget_skydetail(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.skyboxes.getValue();
	}

	@ObfuscatedName("iu.avm(Lyf;I)V")
	public static final void detailget_diskcachesize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ur.avn(Lyf;I)V")
	public static final void detailget_mindiskcachesize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("uc.avb(Lyf;I)V")
	public static final void detailget_maxdiskcachesize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("fq.avo(Lyf;I)V")
	public static final void detailget_recommendeddiskcachesize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("afd.avr(Lyf;B)V")
	public static final void detailget_shadows(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("pj.avh(Lyf;I)V")
	public static final void detailget_lightingquality(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("fy.avj(Lyf;I)V")
	public static final void detailget_antialiasingmode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("pj.ava(Lyf;I)V")
	public static final void detailget_ambientocclusion(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ns.avk(Lyf;I)V")
	public static final void detailget_reflections(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("abr.ave(Lyf;I)V")
	public static final void detailget_vsync(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("iz.avg(Lyf;S)V")
	public static final void detailget_anisotropicfiltering(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("gc.avf(Lyf;I)V")
	public static final void detailget_volumetriclighting(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("mj.avy(Lyf;I)V")
	public static final void detailget_maxforegroundfps(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ur.avv(Lyf;I)V")
	public static final void detailget_maxbackgroundfps(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("fr.avx(Lyf;B)V")
	public static final void detailget_gamerenderscale(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ec.avw(Lyf;I)V")
	public static final void detailget_interfacescale(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("nc.avd(Lyf;I)V")
	public static final void detailget_dof(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ty.avp(Lyf;I)V")
	public static final void detailget_animdetail(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.animDetail.getValue();
	}

	@ObfuscatedName("abx.avq(Lyf;B)V")
	public static final void viewport_setfov(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		Client.field11066 = (short) arg0.field8216[arg0.field8226];
		if (Client.field11066 <= 0) {
			Client.field11066 = 256;
		}
		Client.field10987 = (short) arg0.field8216[arg0.field8226 + 1];
		if (Client.field10987 <= 0) {
			Client.field10987 = 205;
		}
	}

	@ObfuscatedName("pp.avt(Lyf;I)V")
	public static final void viewport_setzoom(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		Client.field10874 = (short) arg0.field8216[arg0.field8226];
		if (Client.field10874 <= 0) {
			Client.field10874 = 256;
		}
		Client.field11069 = (short) arg0.field8216[arg0.field8226 + 1];
		if (Client.field11069 <= 0) {
			Client.field11069 = 320;
		}
	}

	@ObfuscatedName("gw.avz(Lyf;I)V")
	public static final void viewport_clampfov(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		Client.field11070 = (short) arg0.field8216[arg0.field8226];
		if (Client.field11070 <= 0) {
			Client.field11070 = 1;
		}
		Client.field11071 = (short) arg0.field8216[arg0.field8226 + 1];
		if (Client.field11071 <= 0) {
			Client.field11071 = 32767;
		} else if (Client.field11071 < Client.field11070) {
			Client.field11071 = Client.field11070;
		}
		Client.field10900 = (short) arg0.field8216[arg0.field8226 + 2];
		if (Client.field10900 <= 0) {
			Client.field10900 = 1;
		}
		Client.field10943 = (short) arg0.field8216[arg0.field8226 + 3];
		if (Client.field10943 <= 0) {
			Client.field10943 = 32767;
		} else if (Client.field10943 < Client.field10900) {
			Client.field10943 = Client.field10900;
		}
	}

	@ObfuscatedName("yb.avl(Lyf;I)V")
	public static final void viewport_geteffectivesize(ClientScriptState arg0) {
		Client.method13981(0, 0, Client.field10986.field2196, Client.field10986.field2197, false);
		arg0.field8216[++arg0.field8226 - 1] = Client.field11076;
		arg0.field8216[++arg0.field8226 - 1] = Client.field11077;
	}

	@ObfuscatedName("nc.avc(Lyf;I)V")
	public static final void viewport_getzoom(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10874;
		arg0.field8216[++arg0.field8226 - 1] = Client.field11069;
	}

	@ObfuscatedName("gt.avu(Lyf;I)V")
	public static final void viewport_getfov(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11066;
		arg0.field8216[++arg0.field8226 - 1] = Client.field10987;
	}

	@ObfuscatedName("fj.avi(Lyf;B)V")
	public static final void date_minutes(ClientScriptState arg0) {
		long var1 = MonotonicTime.method3655();
		arg0.field8216[++arg0.field8226 - 1] = (int) (var1 / 60000L);
	}

	@ObfuscatedName("ahp.awu(Lyf;I)V")
	public static final void date_runeday(ClientScriptState arg0) {
		long var1 = MonotonicTime.method3655();
		arg0.field8216[++arg0.field8226 - 1] = (int) (var1 / 86400000L) - 11745;
	}

	@ObfuscatedName("gq.awn(Lyf;B)V")
	public static final void date_runeday_fromdate(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		long var4 = TimeFormatter.method8691(0, 0, 12, var1, var2, var3);
		int var6 = TimeFormatter.method13899(var4);
		if (var3 < 1970) {
			var6--;
		}
		arg0.field8216[++arg0.field8226 - 1] = var6;
	}

	@ObfuscatedName("aqc.awk(Lyf;I)V")
	public static final void date_year(ClientScriptState arg0) {
		long var1 = MonotonicTime.method3655();
		arg0.field8216[++arg0.field8226 - 1] = TimeFormatter.method16390(var1);
	}

	@ObfuscatedName("ko.awp(Lyf;I)V")
	public static final void date_isleapyear(ClientScriptState arg0) {
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
	public static final void date_runeday_todate(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Date var2 = TimeZones.getRuneDay(var1);
		arg0.field8216[++arg0.field8226 - 1] = TimeZones.method3628(var2, field8201);
		arg0.field8216[++arg0.field8226 - 1] = TimeZones.method3623(var2, field8201) - 1;
		arg0.field8216[++arg0.field8226 - 1] = TimeZones.method3627(var2, field8201);
	}

	@ObfuscatedName("ks.awr(Lyf;B)V")
	public static final void date_minutes_fromruneday(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = (int) (TimeFormatter.method14612(var1) / 60000L);
	}

	@ObfuscatedName("ana.awl(Lyf;I)V")
	public static final void worldlist_fetch(ClientScriptState arg0) {
		if (Client.state != 13 && Client.state != 18 || LoginManager.method2865()) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else if (WorldSwitcher.field8754) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else if (WorldSwitcher.field2826 > MonotonicTime.method3655() - 1000L) {
			arg0.field8216[++arg0.field8226 - 1] = 1;
		} else {
			WorldSwitcher.field8754 = true;
			ServerConnection var1 = Client.method640();
			ClientMessage var2 = ClientMessage.method1604(ClientProt.WORLDLIST_FETCH, var1.field794);
			var2.buf.p4(GWC.field7642);
			var1.queue(var2);
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("fw.awo(Lyf;B)V")
	public static final void worldlist_start(ClientScriptState arg0) {
		GWCWorld var1 = WorldSwitcher.method13782();
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
	public static final void worldlist_next(ClientScriptState arg0) {
		GWCWorld var1 = WorldSwitcher.method6048();
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
	public static final void worldlist_switch(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		String var2 = (String) arg0.field8218[--arg0.field8211];
		int var3 = ServerPorts.method2912(Client.modewhere, ServerType.field8347, var1);
		int var4 = ServerPorts.method10147(Client.modewhere, ServerType.field8347, var1);
		if (Client.state == 13 && !LoginManager.method2865()) {
			arg0.field8216[++arg0.field8226 - 1] = WorldSwitcher.method9401(var1, var2, var3, var4) ? 1 : 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("f.awx(Lyf;I)V")
	public static final void worldlist_specific(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		GWCWorld var2 = GWC.method4944(var1);
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
	public static final void worldlist_sort(ClientScriptState arg0) {
		arg0.field8226 -= 4;
		int var1 = arg0.field8216[arg0.field8226];
		boolean var2 = arg0.field8216[arg0.field8226 + 1] == 1;
		int var3 = arg0.field8216[arg0.field8226 + 2];
		boolean var4 = arg0.field8216[arg0.field8226 + 3] == 1;
		WorldSwitcher.method5394(var1, var2, var3, var4);
	}

	@ObfuscatedName("xv.awa(Lyf;I)V")
	public static final void worldlist_autoworld(ClientScriptState arg0) {
		WorldSwitcher.method10337();
	}

	@ObfuscatedName("dd.awc(Lyf;I)V")
	public static final void worldlist_pingworlds(ClientScriptState arg0) {
		if (Client.state == 13) {
			WorldSwitcher.field8759 = arg0.field8216[--arg0.field8226] == 1;
		}
	}

	@ObfuscatedName("dc.awz(Lyf;B)V")
	public static final void worldlist_specific_thisworld(ClientScriptState arg0) {
		GWCWorld var1 = WorldSwitcher.method477();
		arg0.field8216[++arg0.field8226 - 1] = var1 == null ? 0 : var1.field7639;
	}

	@ObfuscatedName("ji.awe(Lyf;B)V")
	public static final void if_gettop(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10978;
	}

	@ObfuscatedName("rp.awi(Lyf;I)V")
	public static final void if_debug_getopenifcount(ClientScriptState arg0) {
		int var1 = Client.field10979.method14498();
		if (Client.field10978 != -1) {
			var1++;
		}
		arg0.field8216[++arg0.field8226 - 1] = var1;
	}

	@ObfuscatedName("fo.awy(Lyf;I)V")
	public static final void if_debug_getopenifid(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.field10978 != -1) {
			if (var1 == 0) {
				arg0.field8216[++arg0.field8226 - 1] = Client.field10978;
				return;
			}
			var1--;
		}
		SubInterface var2 = (SubInterface) Client.field10979.method14500();
		while (var1-- > 0) {
			var2 = (SubInterface) Client.field10979.method14502();
		}
		arg0.field8216[++arg0.field8226 - 1] = var2.field11571;
	}

	@ObfuscatedName("er.awq(Lyf;B)V")
	public static final void if_debug_getname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Component.field11725[var1] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
			return;
		}
		String var2 = Component.field11725[var1].field2151[0].field2155;
		if (var2 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.substring(0, var2.indexOf(58));
		}
	}

	@ObfuscatedName("arl.aww(Lyf;I)V")
	public static final void if_debug_getcomcount(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Component.field11725[var1] == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Component.field11725[var1].field2151.length;
		}
	}

	@ObfuscatedName("iu.awd(Lyf;I)V")
	public static final void if_debug_getcomname(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = var1 >> 16;
		if (Component.field11725[var2] == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
			return;
		}
		String var3 = Component.field11725[var2].field2151[var1].field2155;
		if (var3 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var3;
		}
	}

	@ObfuscatedName("hh.awg(Lyf;I)V")
	public static final void if_debug_getservertriggers(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = var1 >> 16;
		if (Component.field11725[var2] == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = Component.field11725[var2].field2151[var1].field2181;
		}
	}

	@ObfuscatedName("at.awb(Lyf;B)V")
	public static final void if_debug_button1(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(1, var1, var2, "");
	}

	@ObfuscatedName("ys.awf(Lyf;B)V")
	public static final void if_debug_button2(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(2, var1, var2, "");
	}

	@ObfuscatedName("yi.awt(Lyf;I)V")
	public static final void if_debug_button3(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(3, var1, var2, "");
	}

	@ObfuscatedName("iw.awj(Lyf;B)V")
	public static final void if_debug_button4(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(4, var1, var2, "");
	}

	@ObfuscatedName("aas.axc(Lyf;I)V")
	public static final void if_debug_button5(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(5, var1, var2, "");
	}

	@ObfuscatedName("sx.axs(Lyf;B)V")
	public static final void if_debug_button6(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(6, var1, var2, "");
	}

	@ObfuscatedName("jh.axa(Lyf;I)V")
	public static final void if_debug_button7(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(7, var1, var2, "");
	}

	@ObfuscatedName("aax.axn(Lyf;I)V")
	public static final void if_debug_button8(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(8, var1, var2, "");
	}

	@ObfuscatedName("afg.axd(Lyf;I)V")
	public static final void if_debug_button9(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(9, var1, var2, "");
	}

	@ObfuscatedName("ig.axo(Lyf;I)V")
	public static final void if_debug_button10(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Client.method4527(10, var1, var2, "");
	}

	@ObfuscatedName("fk.axx(ILhf;Lyf;B)V")
	public static final void cc_if_triggerop(int arg0, Component arg1, ClientScriptState arg2) {
		if (arg0 < 1 || arg0 > 10) {
			throw new RuntimeException();
		}
		Client.method4527(arg0, arg1.field2158, arg1.field2183, "");
	}

	@ObfuscatedName("il.axk(Lyf;I)V")
	public static final void if_triggerop(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		cc_if_triggerop(var3, Component.method16682(var1, var2), arg0);
	}

	@ObfuscatedName("ux.axv(Lyf;B)V")
	public static final void cc_triggerop(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field8235 ? arg0.field8225 : arg0.field8217;
		Component var2 = var1.field8242;
		int var3 = arg0.field8216[--arg0.field8226];
		cc_if_triggerop(var3, var2, arg0);
	}

	@ObfuscatedName("ik.axq(Lyf;B)V")
	public static final void if_debug_target(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		Component var3 = Component.method16682(var1, var2);
		Client.method9403();
		ServerKeyProperties var4 = Client.method17197(var3);
		Client.method10592(var3, var4.method17691(), var4.field11381);
	}

	@ObfuscatedName("kb.axp(Lyf;B)V")
	public static final void force_interface_drag(ClientScriptState arg0) {
		Client.method17515();
	}

	@ObfuscatedName("gl.axz(Lyf;I)V")
	public static final void cancel_interface_drag(ClientScriptState arg0) {
		Client.field10989 = null;
		Client.field10828 = null;
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
	public static final void targetmode_active(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10973 ? 1 : 0;
	}

	@ObfuscatedName("pp.axt(Lyf;I)V")
	public static final void targetmode_cancel(ClientScriptState arg0) {
		Client.method9403();
	}

	@ObfuscatedName("y.axb(Lyf;I)V")
	public static final void opcount(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = field8202;
	}

	@ObfuscatedName("sp.axe(Lyf;I)V")
	public static final void mec_text(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		MapElementType var2 = (MapElementType) Client.field5011.list(var1);
		if (var2.field2370 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var2.field2370;
		}
	}

	@ObfuscatedName("fi.axr(Lyf;B)V")
	public static final void mec_sprite(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		MapElementType var2 = (MapElementType) Client.field5011.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2400;
	}

	@ObfuscatedName("aoh.axg(Lyf;I)V")
	public static final void mec_textsize(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		MapElementType var2 = (MapElementType) Client.field5011.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2388;
	}

	@ObfuscatedName("fc.axf(Lyf;I)V")
	public static final void mec_category(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		MapElementType var2 = (MapElementType) Client.field5011.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.field2374;
	}

	@ObfuscatedName("pu.axu(Lyf;B)V")
	public static final void mec_param(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Client.field3086.list(var2);
		if (var3.isStringType()) {
			arg0.field8218[++arg0.field8211 - 1] = ((MapElementType) Client.field5011.list(var1)).method4029(var2, var3.defaultstr);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = ((MapElementType) Client.field5011.list(var1)).method4028(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("tg.axl(Lyf;B)V")
	public static final void userdetail_quickchat(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10951 && !Client.field11081 ? 1 : 0;
	}

	@ObfuscatedName("ii.axi(Lyf;B)V")
	public static final void userdetail_lobby_membership(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = (int) (Client.field8322 / 60000L);
		arg0.field8216[++arg0.field8226 - 1] = (int) ((Client.field8322 - MonotonicTime.method3655() - Client.field1238) / 60000L);
		arg0.field8216[++arg0.field8226 - 1] = Client.field11709 ? 1 : 0;
	}

	@ObfuscatedName("af.axw(Lyf;I)V")
	public static final void userdetail_lobby_recoveryday(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field9183;
	}

	@ObfuscatedName("li.ayg(Lyf;B)V")
	public static final void userdetail_lobby_unreadmessages(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field7922;
	}

	@ObfuscatedName("fp.ayn(Lyf;B)V")
	public static final void userdetail_lobby_lastloginday(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field1839;
	}

	@ObfuscatedName("sc.ayp(Lyf;B)V")
	public static final void userdetail_lobby_lastloginaddress(ClientScriptState arg0) {
		String var1 = null;
		if (Client.field636 != null) {
			var1 = Client.field636.method544();
		}
		if (var1 == null) {
			var1 = "";
		}
		arg0.field8218[++arg0.field8211 - 1] = var1;
	}

	@ObfuscatedName("pw.ayv(Lyf;B)V")
	public static final void userdetail_lobby_emailstatus(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field6720;
	}

	@ObfuscatedName("ny.ayu(Lyf;B)V")
	public static final void userdetail_lobby_ccexpiry(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field2830;
	}

	@ObfuscatedName("ju.ays(Lyf;B)V")
	public static final void userdetail_lobby_graceexpiry(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field4427;
	}

	@ObfuscatedName("nd.ayf(Lyf;B)V")
	public static final void userdetail_lobby_dobrequested(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11883 ? 1 : 0;
	}

	@ObfuscatedName("ar.aym(Lyf;I)V")
	public static final void userdetail_dob(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field7406;
	}

	@ObfuscatedName("oh.ayr(Lyf;I)V")
	public static final void userdetail_lobby_membersstats(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field5009;
	}

	@ObfuscatedName("ju.ayc(Lyf;B)V")
	public static final void userdetail_lobby_playage(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field6729;
	}

	@ObfuscatedName("iz.ayx(Lyf;I)V")
	public static final void userdetail_lobby_jcoins_balance(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field2676;
	}

	@ObfuscatedName("wb.ayk(Lyf;B)V")
	public static final void userdetail_lobby_loyalty_balance(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field3056;
	}

	@ObfuscatedName("adv.ayo(Lyf;I)V")
	public static final void autosetup_dosetup(ClientScriptState arg0) {
		int var1 = Preferences.method4288();
		arg0.field8216[++arg0.field8226 - 1] = Preferences.field11775 = Client.preferences.displayMode2.getValue();
		arg0.field8216[++arg0.field8226 - 1] = var1;
		SpotShadowFactory.method3076();
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("jx.ayd(Lyf;I)V")
	public static final void method5069(ClientScriptState arg0) {
	}

	@ObfuscatedName("yj.ayz(Lyf;I)V")
	public static final void autosetup_dosetupstatus(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("all.ayq(Lyf;I)V")
	public static final void autosetup_setultra(ClientScriptState arg0) {
	}

	@ObfuscatedName("yk.ayt(Lyf;I)V")
	public static final void autosetup_sethigh(ClientScriptState arg0) {
		Preferences.method9619();
		SpotShadowFactory.method3076();
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("alk.aya(Lyf;I)V")
	public static final void autosetup_setmedium(ClientScriptState arg0) {
		Preferences.method8479();
		SpotShadowFactory.method3076();
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("hf.aye(Lyf;B)V")
	public static final void autosetup_setlow(ClientScriptState arg0) {
		Preferences.method3056();
		SpotShadowFactory.method3076();
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("w.ayh(Lyf;I)V")
	public static final void autosetup_setmin(ClientScriptState arg0) {
		Preferences.method131(true);
		SpotShadowFactory.method3076();
		Client.world.method7753();
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("sc.ayl(Lyf;I)V")
	public static final void autosetup_setcustom(ClientScriptState arg0) {
		Client.preferences.method18157(Client.preferences.preset, 0);
		Preferences.method16391();
		Client.field10800 = false;
	}

	@ObfuscatedName("qo.ayy(Lyf;I)V")
	public static final void autosetup_blackflaglast(ClientScriptState arg0) {
		if (Preferences.field11775 == 1) {
			Preferences.field786 = true;
		} else if (Preferences.field11775 == 3) {
			Preferences.field788 = true;
		}
	}

	@ObfuscatedName("oi.ayb(Lyf;I)V")
	public static final void autosetup_getlevel(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.preset.getValue();
	}

	@ObfuscatedName("aih.ayi(Lyf;I)V")
	public static final void video_advert_play(ClientScriptState arg0) {
		boolean var1 = false;
		if (Client.field11079) {
			try {
				Object var2 = JavascriptFunction.field4026.method6097(new Object[] { Client.field7406, Client.field4490.field12052 == 1, arg0.field8216[--arg0.field8226] });
				if (var2 != null) {
					var1 = (Boolean) var2;
				}
			} catch (Throwable var4) {
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("jp.ayj(Lyf;I)V")
	public static final void video_advert_force_remove(ClientScriptState arg0) {
		if (Client.field11079) {
			JavascriptFunction.field4029.method6090();
		}
	}

	@ObfuscatedName("sb.ayw(Lyf;I)V")
	public static final void video_advert_allow_skip(ClientScriptState arg0) {
		if (Client.field11079) {
			JavascriptFunction.field4030.method6090();
		}
	}

	@ObfuscatedName("ul.aze(Lyf;I)V")
	public static final void video_advert_has_finished(ClientScriptState arg0) {
		boolean var1 = true;
		if (Client.field11079) {
			try {
				Object var2 = JavascriptFunction.field4031.method6088();
				if (var2 != null) {
					var1 = (Boolean) var2;
				}
			} catch (Throwable var4) {
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("ij.azx(Lyf;I)V")
	public static final void detailcanmod_grounddecor(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.groundDecoration.method18488() ? 1 : 0;
	}

	@ObfuscatedName("rk.azd(Lyf;B)V")
	public static final void detailcanmod_spotshadows(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.characterShadows.method18445() ? 1 : 0;
	}

	@ObfuscatedName("nd.azg(Lyf;I)V")
	public static final void detailcanmod_hardshadows(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.sceneryShadows.method18514() ? 1 : 0;
	}

	@ObfuscatedName("r.azu(Lyf;I)V")
	public static final void detailcanmod_shadowquality(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.shadowQuality.method18456() ? 1 : 0;
	}

	@ObfuscatedName("jf.azj(Lyf;B)V")
	public static final void detailcanmod_waterdetail(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.waterDetail.method18521() ? 1 : 0;
	}

	@ObfuscatedName("qf.azz(Lyf;B)V")
	public static final void detailcanmod_antialiasing(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.antiAliasing.method18638() && Client.renderer.method2141() ? 1 : 0;
	}

	@ObfuscatedName("sl.azb(Lyf;I)V")
	public static final void detailcanmod_particles(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.particles.method18466() ? 1 : 0;
	}

	@ObfuscatedName("f.azt(Lyf;B)V")
	public static final void detailcanmod_buildarea(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.buildArea.method18569() ? 1 : 0;
	}

	@ObfuscatedName("ik.azw(Lyf;I)V")
	public static final void detailcanmod_bloom(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.bloom.method18624() && Client.renderer.method2266() ? 1 : 0;
	}

	@ObfuscatedName("ip.azs(Lyf;I)V")
	public static final void detailcanmod_groundblending(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.groundBlending.method18650() ? 1 : 0;
	}

	@ObfuscatedName("dh.azv(Lyf;B)V")
	public static final void detailcanmod_texturing(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.textures.method18425() ? 1 : 0;
	}

	@ObfuscatedName("anw.azc(Lyf;I)V")
	public static final void detailcanmod_maxscreensize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.screenSize.method18578() ? 1 : 0;
	}

	@ObfuscatedName("gd.azy(Lyf;B)V")
	public static final void detailcanmod_fog(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.fog.method18431() ? 1 : 0;
	}

	@ObfuscatedName("ie.azq(Lyf;I)V")
	public static final void detailcanmod_orthographic(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.orthographic.method18503() ? 1 : 0;
	}

	@ObfuscatedName("vg.azh(Lyf;B)V")
	public static final void detailcanmod_toolkit_default(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.displayMode.method18547() ? 1 : 0;
	}

	@ObfuscatedName("sz.azl(Lyf;I)V")
	public static final void detailcanmod_skydetail(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.skyboxes.method18606() ? 1 : 0;
	}

	@ObfuscatedName("dy.azi(Lyf;B)V")
	public static final void detailcanmod_animdetail(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.animDetail.method18666() ? 1 : 0;
	}

	@ObfuscatedName("bl.azm(Lyf;B)V")
	public static final void detailcanmod_shadows(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("nh.azf(Lyf;I)V")
	public static final void detailcanmod_lightingquality(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("acv.azr(Lyf;B)V")
	public static final void detailcanmod_antialiasingmode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("na.azp(Lyf;I)V")
	public static final void detailcanmod_ambientocclusion(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ud.aza(Lyf;B)V")
	public static final void detailcanmod_reflections(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("rt.azn(Lyf;B)V")
	public static final void detailcanmod_vsync(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("jp.azk(Lyf;I)V")
	public static final void detailcanmod_anisotropicfiltering(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("xv.azo(Lyf;I)V")
	public static final void detailcanmod_volumetriclighting(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ax.baj(Lyf;I)V")
	public static final void detailcanmod_maxforegroundfps(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("uz.bab(Lyf;I)V")
	public static final void detailcanmod_maxbackgroundfps(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("no.bav(Lyf;S)V")
	public static final void detailcanmod_gamerenderscale(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("dv.bax(Lyf;I)V")
	public static final void detailcanmod_interfacescale(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("jr.baf(Lyf;S)V")
	public static final void detailcanmod_dof(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("jp.bag(Lyf;B)V")
	public static final void detailcanset_grounddecor(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.groundDecoration.canSetValue(var1);
	}

	@ObfuscatedName("jd.bau(Lyf;I)V")
	public static final void detailcanset_spotshadows(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.characterShadows.canSetValue(var1);
	}

	@ObfuscatedName("pn.bam(Lyf;I)V")
	public static final void detailcanset_hardshadows(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.sceneryShadows.canSetValue(var1);
	}

	@ObfuscatedName("ia.bah(Lyf;I)V")
	public static final void detailcanset_shadowquality(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.shadowQuality.canSetValue(var1);
	}

	@ObfuscatedName("vm.baw(Lyf;I)V")
	public static final void detailcanset_waterdetail(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.waterDetail.canSetValue(var1);
	}

	@ObfuscatedName("rd.bay(Lyf;B)V")
	public static final void detailcanset_antialiasing(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.renderer.method2141()) {
			arg0.field8216[++arg0.field8226 - 1] = Client.preferences.antiAliasing.canSetValue(var1);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 3;
		}
	}

	@ObfuscatedName("no.bas(Lyf;B)V")
	public static final void detailcanset_particles(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.particles.canSetValue(var1);
	}

	@ObfuscatedName("nr.bac(Lyf;B)V")
	public static final void detailcanset_buildarea(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.buildArea.canSetValue(var1);
	}

	@ObfuscatedName("xc.bar(Lyf;B)V")
	public static final void detailcanset_bloom(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		if (Client.renderer.method2266()) {
			arg0.field8216[++arg0.field8226 - 1] = Client.preferences.bloom.canSetValue(var1);
		} else {
			arg0.field8216[++arg0.field8226 - 1] = 3;
		}
	}

	@ObfuscatedName("pc.bap(Lyf;B)V")
	public static final void detailcanset_groundblending(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.groundBlending.canSetValue(var1);
	}

	@ObfuscatedName("ib.bae(Lyf;I)V")
	public static final void detailcanset_texturing(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.textures.canSetValue(var1);
	}

	@ObfuscatedName("d.bal(Lyf;B)V")
	public static final void detailcanset_maxscreensize(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.screenSize.canSetValue(var1);
	}

	@ObfuscatedName("kb.bak(Lyf;I)V")
	public static final void detailcanset_fog(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.fog.canSetValue(var1);
	}

	@ObfuscatedName("pn.baz(Lyf;I)V")
	public static final void detailcanset_orthographic(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.orthographic.canSetValue(var1);
	}

	@ObfuscatedName("ze.baq(Lyf;I)V")
	public static final void detailcanset_toolkit_default(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.displayMode.canSetValue(var1);
	}

	@ObfuscatedName("xo.bai(Lyf;B)V")
	public static final void detailcanset_skydetail(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.skyboxes.canSetValue(var1);
	}

	@ObfuscatedName("so.baa(Lyf;I)V")
	public static final void detailcanset_animdetail(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.preferences.animDetail.canSetValue(var1);
	}

	@ObfuscatedName("rq.bat(Lyf;I)V")
	public static final void detailcanset_shadows(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("hj.ban(Lyf;B)V")
	public static final void detailcanset_lightingquality(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ane.bao(Lyf;I)V")
	public static final void detailcanset_antialiasingmode(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("uw.bad(Lyf;I)V")
	public static final void detailcanset_ambientocclusion(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("nt.bbd(Lyf;B)V")
	public static final void detailcanset_reflections(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("in.bby(Lyf;B)V")
	public static final void detailcanset_vsync(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("cz.bbk(Lyf;I)V")
	public static final void detailcanset_anisotropicfiltering(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("qh.bbr(Lyf;I)V")
	public static final void detailcanset_volumetriclighting(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ab.bbg(Lyf;I)V")
	public static final void detailcanset_maxforegroundfps(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ahc.bbp(Lyf;S)V")
	public static final void detailcanset_maxbackgroundfps(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("aq.bbu(Lyf;S)V")
	public static final void detailcanset_gamerenderscale(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("wc.bbv(Lyf;B)V")
	public static final void detailcanset_interfacescale(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("gt.bbt(Lyf;I)V")
	public static final void detailcanset_dof(ClientScriptState arg0) {
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
		arg0.field8216[++arg0.field8226 - 1] = GameShell.canvasWid;
		arg0.field8216[++arg0.field8226 - 1] = GameShell.canvasHei;
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
	public static final void get_entity_say(ClientScriptState arg0) {
		EntityChatLine var1 = arg0.field8221.method16513();
		if (var1 == null) {
			arg0.field8218[++arg0.field8211 - 1] = "";
		} else {
			arg0.field8218[++arg0.field8211 - 1] = var1.method8281();
		}
	}

	@ObfuscatedName("abx.bbf(Lyf;B)V")
	public static final void get_displayname_withextras(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = ((PlayerEntity) arg0.field8221).method19115(true);
	}

	@ObfuscatedName("d.bbn(Lyf;B)V")
	public static final void get_npc_name(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field8221;
		String var2 = var1.field12082;
		NPCType var3 = var1.field12083;
		if (var3.field2735 != null) {
			NPCType var4 = var3.method4547(Client.field7410, Client.field7410);
			if (var4 == null) {
				var2 = "";
			} else {
				var2 = var4.name;
			}
		}
		if (var2 == null) {
			var2 = "";
		}
		arg0.field8218[++arg0.field8211 - 1] = var2;
	}

	@ObfuscatedName("fw.bbx(Lyf;I)V")
	public static final void get_npc_vislevel(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field8221;
		arg0.field8216[++arg0.field8226 - 1] = var1.field12081;
	}

	@ObfuscatedName("zl.bbi(Lyf;I)V")
	public static final void get_entity_screen_position(ClientScriptState arg0) {
		Client.method14574(arg0.field8221, arg0.field8216[--arg0.field8226], true);
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[0];
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[1];
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[2];
	}

	@ObfuscatedName("gv.bbs(Lyf;B)V")
	public static final void if_get_gamescreen(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10986 == null ? -1 : Client.field10986.field2158;
	}

	@ObfuscatedName("sb.bbl(Lyf;I)V")
	public static final void if_set_gamescreen_enabled(ClientScriptState arg0) {
		Client.field10888 = arg0.field8216[--arg0.field8226] == 1;
		if (Client.field10888) {
			Minimap.method16601();
		}
	}

	@ObfuscatedName("wu.bba(Lyf;I)V")
	public static final void get_entity_overlay_height(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8221.method16501();
	}

	@ObfuscatedName("gv.bbz(Lyf;S)V")
	public static final void get_npc_stat(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		NpcEntity var2 = (NpcEntity) arg0.field8221;
		int var3 = var2.method19163(var1);
		int var4 = var2.method19164(var1);
		arg0.field8216[++arg0.field8226 - 1] = var3;
		arg0.field8216[++arg0.field8226 - 1] = var4;
	}

	@ObfuscatedName("fz.bbm(Lyf;B)V")
	public static final void is_npc_active(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field8221;
		boolean var2 = false;
		NPCType var3 = var1.field12083;
		if (var3.field2735 != null) {
			var3 = var3.method4547(Client.field7410, Client.field7410);
		}
		if (var3 != null) {
			var2 = var3.field2734;
		}
		arg0.field8216[++arg0.field8226 - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("xn.bbc(Lyf;I)V")
	public static final void is_npc_visible(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field8221;
		NPCType var2 = var1.field12083;
		if (var2.field2735 != null) {
			var2 = var2.method4547(Client.field7410, Client.field7410);
		}
		arg0.field8216[++arg0.field8226 - 1] = var2 == null ? 0 : 1;
	}

	@ObfuscatedName("yu.bce(Lyf;I)V")
	public static final void npc_type(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ((NpcEntity) arg0.field8221).field12083.id;
	}

	@ObfuscatedName("cj.bcd(Lyf;I)V")
	public static final void is_targeted_entity(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10787 == arg0.field8221.method16578() ? 1 : 0;
	}

	@ObfuscatedName("uj.bcj(Lyf;I)V")
	public static final void get_loc_screen_position(ClientScriptState arg0) {
		Client.method14574((GraphEntity) arg0.field8230, arg0.field8216[--arg0.field8226], true);
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[0];
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[1];
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[2];
	}

	@ObfuscatedName("ty.bci(Lyf;B)V")
	public static final void get_obj_screen_position(ClientScriptState arg0) {
		Client.method14574(arg0.field8232, arg0.field8216[--arg0.field8226], true);
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[0];
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[1];
		arg0.field8216[++arg0.field8226 - 1] = (int) Client.field10922[2];
	}

	@ObfuscatedName("akr.bcx(Lyf;B)V")
	public static final void get_loc_overlay_height(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = ((GraphEntity) arg0.field8230).method16501();
	}

	@ObfuscatedName("qo.bch(Lyf;B)V")
	public static final void get_obj_overlay_height(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = arg0.field8232.method16501();
	}

	@ObfuscatedName("yn.bcb(Lalh;Lyf;I)V")
	public static final void get_bounding_box(GraphEntity arg0, ClientScriptState arg1) {
		boolean var2 = false;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		if (arg0.field11713 != null) {
			for (int var7 = 0; var7 < arg0.field11713.length; var7++) {
				ScreenBoundingBox var8 = arg0.field11713[var7];
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
	public static final void get_loc_bounding_box(ClientScriptState arg0) {
		get_bounding_box((GraphEntity) arg0.field8230, arg0);
	}

	@ObfuscatedName("ta.bcl(Lyf;B)V")
	public static final void get_obj_bounding_box(ClientScriptState arg0) {
		get_bounding_box(arg0.field8232, arg0);
	}

	@ObfuscatedName("vy.bcm(Lyf;I)V")
	public static final void get_entity_bounding_box(ClientScriptState arg0) {
		get_bounding_box(arg0.field8221, arg0);
	}

	@ObfuscatedName("ab.bcv(Lkr;I)Leh;")
	public static VarDomain method991(ClanSettings arg0) {
		return new VarClanSettingsDomain(arg0);
	}

	@ObfuscatedName("wh.bcy(Lyf;I)V")
	public static final void bug_report(ClientScriptState arg0) {
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
		if (Client.gameConnection == null) {
			return;
		}
		ClientMessage var3 = ClientMessage.method1604(ClientProt.BUG_REPORT, Client.gameConnection.field794);
		var3.buf.p2(Packet.method8398(arg1) + 1 + Packet.method8398(arg2));
		var3.buf.pjstr2(arg1);
		var3.buf.p1_alt2(arg0);
		var3.buf.pjstr2(arg2);
		Client.gameConnection.queue(var3);
	}

	@ObfuscatedName("eg.bcz(Lyf;I)V")
	public static void array_sort(ClientScriptState arg0) {
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
			Algorithms.method15233(arg0.field8215[var2], arg0.field8215[var3], 0, var1 - 1);
		}
	}

	@ObfuscatedName("nz.bcu(Lyf;I)V")
	public static final void map_build_complete(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("qs.bcc(Lyf;I)V")
	public static final void preload_percent(ClientScriptState arg0) {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < Client.field6888.length; var3++) {
			if (Client.field6888[var3] != null && Client.field6888[var3].method16837()) {
				var1 += Client.field6888[var3].method16826();
				var2 += Client.field6888[var3].method16828();
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var1 == 0 ? 0 : var2 * 100 / var1;
	}

	@ObfuscatedName("no.bcn(Lyf;I)V")
	public static final void preload_progress(ClientScriptState arg0) {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < Client.field6888.length; var3++) {
			if (Client.field6888[var3] != null && Client.field6888[var3].method16837()) {
				var1 += Client.field6888[var3].method16826();
				var2 += Client.field6888[var3].method16828();
			}
		}
		arg0.field8216[++arg0.field8226 - 1] = var1 == 0 ? 0 : var2 * 100 / var1;
	}

	@ObfuscatedName("we.bca(Lyf;B)V")
	public static final void preload_download_complete(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("vg.bcr(Lyf;I)V")
	public static final void preload_download_downloadedsize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("tg.bck(Lyf;I)V")
	public static final void preload_download_remainingsize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ii.bcw(Lyf;I)V")
	public static final void preload_download_totalsize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("wa.bcf(Lyf;I)V")
	public static final void preload_download_rate(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("qc.bct(Lyf;S)V")
	public static final void shader_preload_allow(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("ej.bcq(Lyf;I)V")
	public static final void shader_preload_percent(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 100;
	}

	@ObfuscatedName("wx.bco(Lyf;B)V")
	public static final void shader_preload_throttle(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("nh.bcs(Lyf;I)V")
	public static final void can_run_java_client(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("nt.bda(Lyf;B)V")
	public static final void fps_stats(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = GameShell.fps;
		arg0.field8216[++arg0.field8226 - 1] = GameShell.fps;
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("fd.bdk(Lyf;I)V")
	public static final void runjavascript(ClientScriptState arg0) {
	}

	@ObfuscatedName("q.bdl(Lyf;I)V")
	public static final void worldmap_setflashloops(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ClientWorldMap.method15173(var1);
	}

	@ObfuscatedName("acw.bde(Lyf;B)V")
	public static final void worldmap_setflashloops_default(ClientScriptState arg0) {
		ClientWorldMap.method15173(ClientWorldMap.field11649);
	}

	@ObfuscatedName("acp.bdv(Lyf;B)V")
	public static final void worldmap_setflashtics(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		ClientWorldMap.method8498(var1);
	}

	@ObfuscatedName("cs.bds(Lyf;B)V")
	public static final void worldmap_setflashtics_default(ClientScriptState arg0) {
		ClientWorldMap.method8498(ClientWorldMap.field11650);
	}

	@ObfuscatedName("cr.bdh(Lyf;B)V")
	public static final void worldmap_perpetualflash(ClientScriptState arg0) {
		boolean var1 = arg0.field8216[--arg0.field8226] == 1;
		ClientWorldMap.method4337(var1);
	}

	@ObfuscatedName("ka.bdm(Lyf;I)V")
	public static final void worldmap_stopcurrentflashes(ClientScriptState arg0) {
		ClientWorldMap.method5370();
	}

	@ObfuscatedName("kn.bdi(Lyf;I)V")
	public static final void os_ismac(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = NativeLibraryConfig.field5074.startsWith("mac") ? 1 : 0;
	}

	@ObfuscatedName("ic.bdb(Lyf;I)V")
	public static final void os_iswindows(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = NativeLibraryConfig.field5074.startsWith("win") ? 1 : 0;
	}

	@ObfuscatedName("sa.bdp(Lyf;I)V")
	public static final void os_islinux(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = NativeLibraryConfig.field5074.startsWith("linux") ? 1 : 0;
	}

	@ObfuscatedName("fi.bdx(Lyf;I)V")
	public static final void os_isandroid(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ac.bdy(Lyf;I)V")
	public static final void os_isios(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("adj.bdc(Lyf;I)V")
	public static final void os_physicalmemorysize(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.hardwarePlatform.cpuInfoRam;
	}

	@ObfuscatedName("aow.bdn(Lyf;I)V")
	public static final void os_driver_outdated(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ny.bdq(Lyf;I)V")
	public static final void os_driver_vendor(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = -1;
	}

	@ObfuscatedName("sh.bdd(Lyf;B)V")
	public static final void getgridcoordrelativetocamera(ClientScriptState arg0) {
		arg0.field8226--;
		arg0.field8216[++arg0.field8226 - 1] = Client.field4490.method16521().pack();
	}

	@ObfuscatedName("dj.bdu(Lyf;I)V")
	public static final void movescripted(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		MoveSpeed var1 = (MoveSpeed) SerializableEnums.decode(MoveSpeed.method13901(), arg0.field8216[arg0.field8226]);
		CoordGrid var2 = new CoordGrid(arg0.field8216[arg0.field8226 + 1]);
		if (var2.level == -1) {
			throw new RuntimeException("");
		} else if (MoveSpeed.field8314 != var1 && MoveSpeed.field8315 != var1 && MoveSpeed.field8316 != var1) {
			throw new RuntimeException("");
		} else if (Client.gameConnection != null) {
			ClientMessage var3 = ClientMessage.method1604(ClientProt.MOVE_SCRIPTED, Client.gameConnection.field794);
			var3.buf.p1_alt1(var1.getId());
			var3.buf.p2_alt2(var2.z);
			var3.buf.p2_alt1(var2.x);
			Client.gameConnection.queue(var3);
		}
	}

	@ObfuscatedName("ix.bdz(Lyf;I)V")
	public static final void telemetry_get_group_count(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3261();
	}

	@ObfuscatedName("zk.bdf(Lyf;B)V")
	public static final void telemetry_get_group_index(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3262(var1);
	}

	@ObfuscatedName("je.bdj(Lyf;I)V")
	public static final void telemetry_get_group_id(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).field1888;
	}

	@ObfuscatedName("sz.bdw(Lyf;I)V")
	public static final void telemetry_get_row_count(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).method3311();
	}

	@ObfuscatedName("vu.bdt(Lyf;B)V")
	public static final void telemetry_get_row_index(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).method3358(var2);
	}

	@ObfuscatedName("tg.bdg(Lyf;I)V")
	public static final void telemetry_get_row_id(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).method3285(var2);
	}

	@ObfuscatedName("ts.bdo(Lyf;B)V")
	public static final void telemetry_is_row_pinned(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).method3295(var2) ? 1 : 0;
	}

	@ObfuscatedName("wf.bdr(Lyf;I)V")
	public static final void telemetry_get_column_count(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).method3286();
	}

	@ObfuscatedName("uh.bev(Lyf;B)V")
	public static final void telemetry_get_column_index(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).method3290(var2);
	}

	@ObfuscatedName("vg.bel(Lyf;I)V")
	public static final void telemetry_get_column_id(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).method3291(var2);
	}

	@ObfuscatedName("kl.bec(Lyf;I)V")
	public static final void telemetry_get_grid_value(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		Integer var4 = (Integer) Client.field11094.method3263(var1).method3306(var2, var3);
		if (var4 == null) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		} else {
			arg0.field8216[++arg0.field8226 - 1] = var4;
		}
	}

	@ObfuscatedName("yz.bej(Lyf;I)V")
	public static final void telemetry_is_grid_processor_set(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		arg0.field8216[++arg0.field8226 - 1] = Client.field11094.method3263(var1).method3306(var2, var3) == null ? 0 : 1;
	}

	@ObfuscatedName("pw.bei(Lyf;I)V")
	public static final void emoji_add(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		String var1 = (String) arg0.field8218[--arg0.field8211];
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		if (!EmojiList.method18307(var1.charAt(0))) {
			throw new RuntimeException();
		} else if (var1.isEmpty() || var1.length() > 10) {
			throw new RuntimeException();
		} else if (!Client.field3420.method4342(var1, var2, var3)) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("kt.beu(Lyf;I)V")
	public static final void emoji_remove(ClientScriptState arg0) {
		String var1 = (String) arg0.field8218[--arg0.field8211];
		Client.field3420.method4344(var1);
	}

	@ObfuscatedName("ho.bex(Lyf;B)V")
	public static final void emoji_removeall(ClientScriptState arg0) {
		Client.field3420.method4345();
	}

	@ObfuscatedName("fu.ben(Lyf;I)V")
	public static final void emoji_substitute(ClientScriptState arg0) {
		if (Client.field3420.method4353() > 0) {
			String var1 = (String) arg0.field8218[--arg0.field8211];
			String var2 = Client.field3420.method4339(var1);
			arg0.field8218[++arg0.field8211 - 1] = var2;
		}
	}

	@ObfuscatedName("qn.bes(Lyf;B)V")
	public static final void emoji_enable_auto_chatline(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		Client.field3420.method4341(var1 != 0);
	}

	@ObfuscatedName("vj.beg(Lyf;ZI)V")
	public static final void db_find(ClientScriptState arg0, boolean arg1) {
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		DBTableIndex var4 = Client.method146(var2);
		if (var4 == null) {
			throw new RuntimeException();
		}
		Client.field754 = var4.method15187(var3);
		if (Client.field754 != null) {
			Client.field10767 = DBUtils.method746(var2);
			Client.field8853 = Client.field754.iterator();
			if (arg1) {
				arg0.field8216[++arg0.field8226 - 1] = Client.field754.size();
			}
			return;
		}
		Client.field10767 = -1;
		Client.field8853 = null;
		if (arg1) {
			arg0.field8216[++arg0.field8226 - 1] = 0;
		}
	}

	@ObfuscatedName("hf.bea(Lyf;B)V")
	public static final void db_listall(ClientScriptState arg0) {
		arg0.field8226--;
		int var1 = arg0.field8216[arg0.field8226];
		DBTableIndex var2 = Client.method4574(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Client.field754 = var2.method15187(0);
		if (Client.field754 != null) {
			Client.field10767 = var1;
			Client.field8853 = Client.field754.iterator();
			arg0.field8216[++arg0.field8226 - 1] = Client.field754.size();
		}
	}

	@ObfuscatedName("aht.bew(Lyf;I)V")
	public static final void db_findnext(ClientScriptState arg0) {
		if (Client.field8853 != null && Client.field8853.hasNext()) {
			arg0.field8216[++arg0.field8226 - 1] = (Integer) Client.field8853.next();
		} else {
			arg0.field8216[++arg0.field8226 - 1] = -1;
		}
	}

	@ObfuscatedName("pk.beq(Lyf;B)V")
	public static final void db_getfield(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = arg0.field8216[arg0.field8226 + 2];
		int var4 = DBUtils.method746(var2);
		int var5 = DBUtils.method15018(var2);
		DBRowType var6 = (DBRowType) Client.field9123.list(var1);
		DBTableType var7 = (DBTableType) Client.field1840.list(var4);
		ScriptVarType[] var8 = var7.types[var5];
		Object[] var9 = var6.method14711(var5);
		if (var9 == null && var7.defaultValues != null) {
			var9 = var7.defaultValues[var5];
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

	@ObfuscatedName("fu.beo(Lyf;I)V")
	public static final void db_getfieldcount(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		int var3 = 0;
		int var4 = var2 >>> 8;
		int var5 = var2 & 0xFF;
		DBRowType var6 = (DBRowType) Client.field9123.list(var1);
		DBTableType var7 = (DBTableType) Client.field1840.list(var4);
		ScriptVarType[] var8 = var7.types[var5];
		Object[] var9 = var6.method14711(var5);
		if (var9 == null && var7.defaultValues != null) {
			var9 = var7.defaultValues[var5];
		}
		if (var9 != null) {
			var3 = var9.length / var8.length;
		}
		arg0.field8216[++arg0.field8226 - 1] = var3;
	}

	@ObfuscatedName("wn.bey(Lyf;I)V")
	public static final void db_find_get(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		int var2 = -1;
		if (Client.field754 != null && var1 >= 0 && var1 < Client.field754.size()) {
			var2 = (Integer) Client.field754.get(var1);
		}
		arg0.field8216[++arg0.field8226 - 1] = var2;
	}

	@ObfuscatedName("vy.bep(Lyf;I)V")
	public static final void db_find_refine(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		DBTableIndex var3 = Client.method146(var1);
		if (var3 == null) {
			throw new RuntimeException();
		} else if (DBUtils.method746(var1) != Client.field10767) {
			throw new RuntimeException();
		} else if (Client.field754 == null && Client.field754.isEmpty()) {
			throw new RuntimeException();
		} else {
			List var4 = var3.method15187(var2);
			Client.field754 = new LinkedList(Client.field754);
			if (var4 == null) {
				Client.field754.clear();
			} else {
				Client.field754.retainAll(var4);
			}
			Client.field8853 = Client.field754.iterator();
			arg0.field8216[++arg0.field8226 - 1] = Client.field754.size();
		}
	}

	@ObfuscatedName("ei.beb(Lyf;B)V")
	public static final void db_getrowtable(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		DBRowType var2 = (DBRowType) Client.field9123.list(var1);
		arg0.field8216[++arg0.field8226 - 1] = var2.tableId;
	}

	@ObfuscatedName("agf.bez(Lyf;B)V")
	public static final void method16447(ClientScriptState arg0) {
		arg0.field8226 -= 3;
		Client.method7623(arg0.field8216[arg0.field8226 + 1]);
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
	public static final void minimenu_close(ClientScriptState arg0) {
	}

	@ObfuscatedName("yi.bef(Lyf;I)V")
	public static final void method10758(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("xg.bek(Lyf;I)V")
	public static final void unknown_command_98(ClientScriptState arg0) {
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
	public static final void interface_setpickingradius(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("tp.bff(Lyf;I)V")
	public static final void interface_getpickingradius(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("ace.bfr(Lyf;B)V")
	public static final void method15087(ClientScriptState arg0) {
		int var1 = arg0.field8216[--arg0.field8226];
		FontMetrics var2 = Client.field7538.method6163(Client.field10833, var1);
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
	public static final void battery_ischarging(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("jb.bfn(Lyf;B)V")
	public static final void battery_getlevelpercent(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 100;
	}

	@ObfuscatedName("sg.bfx(Lyf;I)V")
	public static final void method8382(ClientScriptState arg0) {
		arg0.field8226--;
	}

	@ObfuscatedName("kz.bfm(Lyf;I)V")
	public static final void logout_getreason(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = Client.field10853.getId();
	}

	@ObfuscatedName("hp.bfz(Lyf;I)V")
	public static final void method4060(ClientScriptState arg0) {
		arg0.field8216[++arg0.field8226 - 1] = 1;
	}

	@ObfuscatedName("rm.bfs(Lyf;I)V")
	public static final void show_software_license(ClientScriptState arg0) {
	}

	@ObfuscatedName("dh.bfd(Lyf;I)V")
	public static final void method2581(ClientScriptState arg0) {
	}

	@ObfuscatedName("nr.bfa(Lyf;I)V")
	public static final void shop_opencategories(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("we.bfe(Lyf;I)V")
	public static final void notifications_sendlocal(ClientScriptState arg0) {
		arg0.field8211 -= 2;
		arg0.field8226 -= 2;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("yb.bfc(Lyf;I)V")
	public static final void notifications_sendgroupedlocal(ClientScriptState arg0) {
		arg0.field8211 -= 3;
		arg0.field8226 -= 3;
		arg0.field8216[++arg0.field8226 - 1] = 0;
	}

	@ObfuscatedName("am.bfw(Lyf;I)V")
	public static final void notifications_cancellocal(ClientScriptState arg0) {
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
	public static final void setwalkmarker(ClientScriptState arg0) {
		arg0.field8226 -= 2;
	}
}
