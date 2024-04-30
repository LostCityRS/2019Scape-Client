package rs2.client.clientscript;

import com.jagex.audio.stream.Sound;
import com.jagex.audio.stream.SoundShape;
import com.jagex.audio.stream.SoundType;
import com.jagex.audio.api.SubBussType;
import com.jagex.core.constants.Language;
import com.jagex.core.datastruct.*;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.*;
import com.jagex.game.ClientWorldMap;
import com.jagex.game.MiniMap;
import com.jagex.game.MiniMenu;
import com.jagex.game.MiniMenuEntry;
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
public class ScriptRunner {

	@ObfuscatedName("ym.e")
	public static final TimeZone UTC = TimeZone.getTimeZone("UTC");

	@ObfuscatedName("ym.k")
	public static int opcount = 0;

	@ObfuscatedName("ym.f")
	public static int[] result = new int[3];

	@ObfuscatedName("ym.w")
	public static SoftLruHashTable field8204 = new SoftLruHashTable(4);

	@ObfuscatedName("ym.l")
	public static Vector3[] field8210 = new Vector3[2];

	@ObfuscatedName("ym.u")
	public static boolean field8206 = false;

	@ObfuscatedName("ym.z")
	public static String field8205 = null;

	@ObfuscatedName("ym.p")
	public static ArrayList clientScriptStatePool = new ArrayList();

	@ObfuscatedName("ym.d")
	public static int clientScriptStatePoolUsedCount = 0;

	@ObfuscatedName("ym.c")
	public static int field8209 = 0;

	public ScriptRunner() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ch.e(I)Lyf;")
	public static final ClientScriptState createClientScriptState() {
		if (clientScriptStatePoolUsedCount == clientScriptStatePool.size()) {
			clientScriptStatePool.add(new ClientScriptState());
		}

		ClientScriptState state = (ClientScriptState) clientScriptStatePool.get(clientScriptStatePoolUsedCount);
		clientScriptStatePoolUsedCount++;
		return state;
	}

	@ObfuscatedName("vu.n(B)V")
	public static final void releaseClientScriptState() {
		clientScriptStatePoolUsedCount--;
	}

	@ObfuscatedName("cr.m(Lals;I)V")
	public static void runHook(HookRequest arg0) {
		executeHookInnter(arg0, 500000);
	}

	@ObfuscatedName("ace.k(I[II)V")
	public static void executeOnLoad(int arg0, int[] arg1) {
		if (arg0 != -1 && Component.openInterface(arg0, arg1)) {
			Component[] var2 = Component.interfaces[arg0].components;
			executeOnLoadComponents(var2);
		}
	}

	@ObfuscatedName("agr.f([Lhf;I)V")
	public static void executeOnLoadComponents(Component[] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			Component var2 = arg0[var1];
			if (var2.onload != null) {
				HookRequest var3 = new HookRequest();
				var3.component = var2;
				var3.onop = var2.onload;
				executeHookInnter(var3, 5000000);
			}
		}
	}

	@ObfuscatedName("yo.w(Lals;II)V")
	public static void executeHookInnter(HookRequest arg0, int arg1) {
		Object[] var2 = arg0.onop;
		int var3 = (Integer) var2[0];
		ClientScript var4 = ClientScriptHelpers.getScript(var3);
		if (var4 == null) {
			return;
		}
		ClientScriptState var5 = createClientScriptState();
		var5.intLocals = new int[var4.intLocalCount];
		int var6 = 0;
		var5.objectLocals = new String[var4.objectLocalCount];
		int var7 = 0;
		var5.longLocals = new long[var4.longLocalCount];
		int var8 = 0;
		for (int var9 = 1; var9 < var2.length; var9++) {
			if (var2[var9] instanceof Integer) {
				int var10 = (Integer) var2[var9];
				if (var10 == 0x80000001) {
					var10 = arg0.mouseX;
				}
				if (var10 == 0x80000002) {
					var10 = arg0.mouseY;
				}
				if (var10 == 0x80000003) {
					var10 = arg0.component == null ? -1 : arg0.component.parentlayer;
				}
				if (var10 == 0x80000004) {
					var10 = arg0.opindex;
				}
				if (var10 == 0x80000005) {
					var10 = arg0.component == null ? -1 : arg0.component.id;
				}
				if (var10 == 0x80000006) {
					var10 = arg0.drop == null ? -1 : arg0.drop.parentlayer;
				}
				if (var10 == 0x80000007) {
					var10 = arg0.drop == null ? -1 : arg0.drop.id;
				}
				if (var10 == 0x80000008) {
					var10 = arg0.key;
				}
				if (var10 == 0x80000009) {
					var10 = arg0.keychar;
				}
				var5.intLocals[var6++] = var10;
			} else if (var2[var9] instanceof String) {
				String var11 = (String) var2[var9];
				if (var11.equals("event_opbase")) {
					var11 = arg0.opbase;
				}
				var5.objectLocals[var7++] = var11;
			} else if (var2[var9] instanceof Long) {
				long var12 = (Long) var2[var9];
				var5.longLocals[var8++] = var12;
			}
		}
		var5.nestedCount = arg0.nestedCount;
		executeScript(var4, arg1, var5);
		var5.nestedCount = 0;
	}

	@ObfuscatedName("gz.l(Luh;IILahm;II)V")
	public static void executeTriggeredScriptPathingEntity(ClientTriggerType arg0, int arg1, int arg2, PathingEntity arg3, int arg4) {
		ClientScriptState var5 = createClientScriptState();
		var5.activeEntity = arg3;
		var5.field8231 = arg4;
		executeTrigger(arg0, arg1, arg2, var5);
		var5.activeEntity = null;
		var5.field8231 = -1;
	}

	@ObfuscatedName("acl.u(Luh;IILst;I)V")
	public static void executeTriggeredScriptLoc(ClientTriggerType arg0, int arg1, int arg2, Location arg3) {
		ClientScriptState var4 = createClientScriptState();
		var4.activeLoc = arg3;
		executeTrigger(arg0, arg1, arg2, var4);
		var4.activeLoc = null;
	}

	@ObfuscatedName("uf.z(Luh;IILyd;Laut;I)V")
	public static void executeTriggeredScriptObj(ClientTriggerType arg0, int arg1, int arg2, ObjReference arg3, ObjStackEntity arg4) {
		ClientScriptState var5 = createClientScriptState();
		var5.activeObj = arg4;
		executeTrigger(arg0, arg1, arg2, var5);
		var5.activeObj = null;
	}

	@ObfuscatedName("am.p(Luh;III)V")
	public static void executeTriggeredScriptMapElement(ClientTriggerType arg0, int arg1, int arg2) {
		ClientScriptState var3 = createClientScriptState();
		executeTrigger(arg0, arg1, arg2, var3);
	}

	@ObfuscatedName("iq.d(Luh;IILyf;I)V")
	public static void executeTrigger(ClientTriggerType arg0, int arg1, int arg2, ClientScriptState state) {
		ClientScript script = ClientScriptHelpers.getByTrigger(arg0, arg1, arg2);
		if (script == null) {
			releaseClientScriptState();
			return;
		}
		state.intLocals = new int[script.intLocalCount];
		state.objectLocals = new Object[script.objectLocalCount];
		if (ClientTriggerType.WORLDMAPELEMENTMOUSEOVER == script.field12373 || ClientTriggerType.WORLDMAPELEMENTMOUSEREPEAT == script.field12373 || ClientTriggerType.WORLDMAPELEMENTMOUSELEAVE == script.field12373) {
			state.intLocals[0] = arg1;
			state.intLocals[1] = Client.mouse.getX();
			state.intLocals[2] = Client.mouse.getY();
		} else if (ClientTriggerType.OPWORLDMAPELEMENT1 == script.field12373 || ClientTriggerType.OPWORLDMAPELEMENT2 == script.field12373 || ClientTriggerType.OPWORLDMAPELEMENT3 == script.field12373 || ClientTriggerType.OPWORLDMAPELEMENT4 == script.field12373 || ClientTriggerType.OPWORLDMAPELEMENT5 == script.field12373) {
			state.intLocals[0] = arg1;
		} else if (ClientTriggerType.PROCESS_PLAYER == script.field12373) {
			state.intLocals[0] = state.field8231;
		}
		executeScript(script, 500000, state);
	}

	@ObfuscatedName("jf.c(ILjava/lang/String;II)V")
	public static void executeTriggeredScriptCutscene(int arg0, String arg1, int arg2) {
		ClientScript var3 = ClientScriptHelpers.getByTrigger(ClientTriggerType.CUTSCENE_SUBTITLE, arg0, -1);
		if (var3 == null) {
			return;
		}
		ClientScriptState state = createClientScriptState();
		state.intLocals = new int[var3.intLocalCount];
		state.objectLocals = new String[var3.objectLocalCount];
		state.objectLocals[0] = arg1;
		state.intLocals[0] = arg2;
		executeScript(var3, 500000, state);
	}

	@ObfuscatedName("zj.r(ILcom/jagex/twitchtv/TwitchEvent;B)V")
	public static void executeTriggeredScriptTwitch(int arg0, TwitchEvent arg1) {
		ClientScript script = ClientScriptHelpers.getByTrigger(ClientTriggerType.TWITCH, arg0, -1);
		if (script == null) {
			return;
		}
		ClientScriptState state = createClientScriptState();
		if (script.longLocalCount != 0) {
			state.longLocals = new long[script.longLocalCount];
		}
		if (script.intLocalCount != 0) {
			state.intLocals = new int[script.intLocalCount];
		}
		if (script.objectLocalCount != 0) {
			state.objectLocals = new String[script.objectLocalCount];
		}
		arg1.method12(state.intLocals, state.longLocals, state.objectLocals);
		executeScript(script, 500000, state);
	}

	@ObfuscatedName("adv.v(Lasc;ILyf;I)V")
	public static void executeScript(ClientScript script, int oplimit, ClientScriptState state) {
		state.isp = 0;
		state.osp = 0;
		state.pc = -1;
		state.script = script;
		state.instructions = state.script.instructions;
		state.intOperands = state.script.intOperands;
		ClientScriptCommand command = null;
		state.fp = 0;
		state.primaryVars.clear();
		state.primaryVars.put(VarDomainType.PLAYER, Client.localPlayerGameState.varps);
		state.primaryVars.put(VarDomainType.CLIENT, Client.clientVarDomain);
		state.primaryVars.put(VarDomainType.CLAN, Client.varClan);
		if (state.activeClanSettings != null) {
			state.primaryVars.put(VarDomainType.CLAN_SETTING, createVarClanSettingsDomain(state.activeClanSettings));
		}
		if (state.activeEntity instanceof NpcEntity) {
			state.primaryVars.put(VarDomainType.NPC, state.activeEntity.varDomain);
		}
		if (state.activeEntity instanceof PlayerEntity) {
			state.secondaryVars.put(VarDomainType.PLAYER, state.activeEntity.varDomain);
		}
		if (Client.currentPlayerGroup != null) {
			state.primaryVars.put(VarDomainType.PLAYER_GROUP, Client.currentPlayerGroup.getVarDomain());
		}
		try {
			opcount = 0;
			while (true) {
				opcount++;
				if (opcount > oplimit) {
					throw new RuntimeException("slow");
				}
				command = state.instructions[++state.pc];
				if (field8206 && (field8205 == null || state.script.scriptName != null && state.script.scriptName.indexOf(field8205) != -1)) {
					System.out.println(state.script.scriptName + ": " + command);
				}
				if (state.intOperands[state.pc] == 1) {
					state.secondary = true;
				} else {
					state.secondary = false;
				}
				if (ClientScriptCommand._RETURN == command && state.fp == 0) {
					return;
				}
				executeCommand(command, state);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			error(state, command, ex, "S");
		} finally {
			releaseClientScriptState();
		}
	}

	@ObfuscatedName("jh.o(Lyf;Lss;Ljava/lang/Exception;Ljava/lang/String;I)V")
	public static void error(ClientScriptState state, ClientScriptCommand command, Exception exception, String arg3) {
		StringBuilder var4 = new StringBuilder(30);
		var4.append(arg3 + " ").append(state.script.nodeId).append(" ");
		for (int var5 = state.fp - 1; var5 >= 0; var5--) {
			var4.append("").append(state.frames[var5].script.nodeId).append(" ");
		}
		var4.append("").append(command.index);
		JagException.report(var4.toString(), exception);
	}

	@ObfuscatedName("ki.s(Lhq;IIIZLyf;I)V")
	public static void cc_create_inner(Interface arg0, int arg1, int arg2, int arg3, boolean arg4, ClientScriptState arg5) {
		if (arg2 == 0) {
			throw new RuntimeException();
		}
		Component var6 = arg0.components[arg1];
		if (var6.subcomponents == null) {
			var6.subcomponents = new Component[arg3 + 1];
			var6.sortedsubcomponents = var6.subcomponents;
		}
		if (var6.subcomponents.length <= arg3) {
			if (var6.subcomponents == var6.sortedsubcomponents) {
				Component[] var7 = new Component[arg3 + 1];
				for (int var8 = 0; var8 < var6.subcomponents.length; var8++) {
					var7[var8] = var6.subcomponents[var8];
				}
				var6.subcomponents = var6.sortedsubcomponents = var7;
			} else {
				Component[] var9 = new Component[arg3 + 1];
				Component[] var10 = new Component[arg3 + 1];
				for (int var11 = 0; var11 < var6.subcomponents.length; var11++) {
					var9[var11] = var6.subcomponents[var11];
					var10[var11] = var6.sortedsubcomponents[var11];
				}
				var6.subcomponents = var9;
				var6.sortedsubcomponents = var10;
			}
		}
		if (arg3 > 0 && var6.subcomponents[arg3 - 1] == null) {
			throw new RuntimeException("Gap at:" + (arg3 - 1));
		}
		Component var12 = new Component();
		var12.type = arg2;
		var12.layer = var12.parentlayer = var6.parentlayer;
		var12.id = arg3;
		var6.subcomponents[arg3] = var12;
		if (var6.subcomponents != var6.sortedsubcomponents) {
			var6.sortedsubcomponents[arg3] = var12;
		}
		ActiveComponent var13;
		if (arg4) {
			var13 = arg5.activeComponent2;
		} else {
			var13 = arg5.activeComponent;
		}
		var13.itf = arg0;
		var13.com = var12;
		Client.requestRedrawComponent(var6);
	}

	@ObfuscatedName("eb.y(Lhq;Lhf;S)V")
	public static void cc_if_sendtofront(Interface arg0, Component arg1) {
		if (arg1 == null) {
			return;
		}
		if (arg1.id == -1) {
			Component[] var5 = arg0.initSortedComponents();
			int var6;
			for (var6 = 0; var6 < var5.length && var5[var6] != arg1; var6++) {
			}
			if (var6 >= var5.length) {
				return;
			}
			ArrayUtil.copy(var5, var6 + 1, var5, var6, var5.length - var6 - 1);
			var5[var5.length - 1] = arg1;
			return;
		}
		Component var2 = arg0.getComponent(arg1.layer);
		if (var2 == null) {
			return;
		}
		if (var2.subcomponents == var2.sortedsubcomponents) {
			var2.sortedsubcomponents = new Component[var2.subcomponents.length];
			var2.sortedsubcomponents[var2.sortedsubcomponents.length - 1] = arg1;
			ArrayUtil.copy(var2.subcomponents, 0, var2.sortedsubcomponents, 0, arg1.id);
			ArrayUtil.copy(var2.subcomponents, arg1.id + 1, var2.sortedsubcomponents, arg1.id, var2.subcomponents.length - arg1.id - 1);
			return;
		}
		int var3 = 0;
		Component[] var4 = var2.sortedsubcomponents;
		while (var3 < var4.length && var4[var3] != arg1) {
			var3++;
		}
		if (var3 >= var4.length) {
			return;
		}
		ArrayUtil.copy(var4, var3 + 1, var4, var3, var4.length - var3 - 1);
		var4[var2.sortedsubcomponents.length - 1] = arg1;
	}

	@ObfuscatedName("ig.q(Lhq;Lhf;I)V")
	public static void cc_if_sendtoback(Interface arg0, Component arg1) {
		if (arg1 == null) {
			return;
		}
		if (arg1.id == -1) {
			Component[] var5 = arg0.initSortedComponents();
			int var6;
			for (var6 = 0; var6 < var5.length && var5[var6] != arg1; var6++) {
			}
			if (var6 >= var5.length) {
				return;
			}
			ArrayUtil.copy(var5, 0, var5, 1, var6);
			var5[0] = arg1;
			return;
		}
		Component var2 = arg0.components[arg1.layer & 0xFFFF];
		if (var2 == null) {
			return;
		}
		if (var2.subcomponents == var2.sortedsubcomponents) {
			var2.sortedsubcomponents = new Component[var2.subcomponents.length];
			var2.sortedsubcomponents[0] = arg1;
			ArrayUtil.copy(var2.subcomponents, 0, var2.sortedsubcomponents, 1, arg1.id);
			ArrayUtil.copy(var2.subcomponents, arg1.id + 1, var2.sortedsubcomponents, arg1.id + 1, var2.subcomponents.length - arg1.id - 1);
			return;
		}
		int var3 = 0;
		Component[] var4 = var2.sortedsubcomponents;
		while (var3 < var4.length && var4[var3] != arg1) {
			var3++;
		}
		if (var3 >= var4.length) {
			return;
		}
		ArrayUtil.copy(var4, 0, var4, 1, var3);
		var4[0] = arg1;
	}

	@ObfuscatedName("pf.x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V")
	public static void openUrl(String arg0, String arg1, String arg2, boolean arg3, boolean arg4) {
		ServerConnection var5 = Client.getCurrentConnection();
		if (var5.getStream() == null) {
			return;
		}
		ClientMessage var6 = ClientMessage.createMessage(ClientProt.URL_REQUEST, var5.randomOut);
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
	public static final void pushMinimenuEntry(MiniMenuEntry arg0, ClientScriptState arg1) {
		arg1.intStack[++arg1.isp - 1] = MiniMenu.getEntryEntityType(arg0);
		arg1.objectStack[++arg1.osp - 1] = MiniMenu.getEntryOp(arg0);
		arg1.objectStack[++arg1.osp - 1] = MiniMenu.getEntryOpBase(arg0);
		arg1.objectStack[++arg1.osp - 1] = MiniMenu.method313(arg0);
	}

	@ObfuscatedName("yx.h(Lss;Lyf;I)V")
	public static final void executeCommand(ClientScriptCommand command, ClientScriptState state) throws CameraException, VarBitOverflowException {
		switch(command.index) {
			case 0:
				telemetry_get_group_count(state);
				return;
			case 1:
				targetmode_active(state);
				return;
			case 2:
				if_setoptkey(state);
				return;
			case 3:
				detailget_buildarea(state);
				return;
			case 4:
				chatphrase_gettext(state);
				return;
			case 5:
				detail_anisotropicfiltering(state);
				return;
			case 6:
				sound_synth(state);
				return;
			case 7:
				cam2_getpositionentity_lookatangle(state);
				return;
			case 8:
				abort_dialog(state);
				return;
			case 9:
				worldmap_getsourcecoord(state);
				return;
			case 10:
				worldmap_getdisplayposition(state);
				return;
			case 11:
				shop_isproductrecommended(state);
				return;
			case 12:
				if_sendto(true, state);
				return;
			case 13:
				cc_setheld(state);
				return;
			case 14:
				clan_getchatminkick(state);
				return;
			case 15:
				cc_getx(state);
				return;
			case 16:
				cc_setonplayergroupvarptransmit(state);
				return;
			case 17:
				scale(state);
				return;
			case 18:
				if_setonhorizontalpinch(state);
				return;
			case 19:
				cc_find(state);
				return;
			case 20:
				detailget_maxforegroundfps(state);
				return;
			case 21:
				cc_setongamepadtrigger(state);
				return;
			case 22:
				get_selfyangle(state);
				return;
			case 23:
				cc_setontargetenter(state);
				return;
			case 24:
				activeclansettings_getaffinedcount(state);
				return;
			case 25:
				autosetup_dosetupstatus(state);
				return;
			case 26:
				cam2_setlookatmaxspeed_axis(state);
				return;
			case 27:
				char_isnumeric(state);
				return;
			case 28:
				oc_minimenu_colour_overridden(state);
				return;
			case 29:
				interface_getpickingradius(state);
				return;
			case 30:
				ignore_is_temp(state);
				return;
			case 31:
				cc_setopbase(state);
				return;
			case 32:
				map_members(state);
				return;
			case 33:
				preload_percent(state);
				return;
			case 34:
				if_setswipeflags(state);
				return;
			case 35:
				cam_dec_x(state);
				return;
			case 36:
				map_build_complete(state);
				return;
			case 37:
				chat_setmode(state);
				return;
			case 38:
				minimenu_close(state);
				return;
			case 39:
				struct_param(state);
				return;
			case 40:
				cc_setopchar(state);
				return;
			case 41:
				TwitchCommands.ttv_setdebugoutput(state);
				return;
			case 42:
				detailget_maxscreensize(state);
				return;
			case 43:
				if_getgraphic(state);
				return;
			case 44:
				if_getmodelangle_x(state);
				return;
			case 45:
				random_sound_pitch(state);
				return;
			case 46:
				getclipboard(state);
				return;
			case 47:
				cam_smoothreset(state);
				return;
			case 48:
				if_setlinkfriend(state);
				return;
			case 49:
				gosub_with_params(state);
				return;
			case 50:
				define_array(state);
				return;
			case 51:
				if_settextantimacro(state);
				return;
			case 52:
				map_loadingscreen_isopen(state);
				return;
			case 53:
				cam2_updateeffect_ztilt(state);
				return;
			case 54:
				if_setontimer(state);
				return;
			case 55:
				activeclanchannel_getusercount(state);
				return;
			case 56:
				cam2_setlookatorientation_xrotation(state);
				return;
			case 57:
				QuestCommands.quest_varbitreq_count(state);
				return;
			case 58:
				tostring(state);
				return;
			case 59:
				worldmap_perpetualflash(state);
				return;
			case 60:
				char_isvalid(state);
				return;
			case 61:
				os_iswindows(state);
				return;
			case 62:
				ignore_del(state);
				return;
			case 63:
				map_preload(state);
				return;
			case 64:
				baseidkit(state);
				return;
			case 65:
				cc_getgraphicdimensions(state);
				return;
			case 66:
				if_find(state);
				return;
			case 67:
				setbit_range_toint(state);
				return;
			case 68:
				join_string(state);
				return;
			case 69:
				push_array(state, true, true);
				return;
			case 70:
				if_getmodelangle_z(state);
				return;
			case 71:
				detailget_lightingquality(state);
				return;
			case 72:
				if_getfontgraphic(state);
				return;
			case 73:
				cam2_setpositionpointcollision(state);
				return;
			case 74:
				worldmap_getzoom(state);
				return;
			case 75:
				cam2_removeeffect(state);
				return;
			case 76:
				if_setonhorizontalswipe(state);
				return;
			case 77:
				detailcanmod_vsync(state);
				return;
			case 78:
				detailcanmod_skydetail(state);
				return;
			case 79:
			case 103:
			case 247:
			case 250:
			case 393:
			default:
				throw new RuntimeException();
			case 80:
				detail_antialiasing(state);
				return;
			case 81:
				detailget_bloom(state);
				return;
			case 82:
				cc_setonstattransmit(state);
				return;
			case 83:
				if_setoutline(state);
				return;
			case 84:
				worldmap_getdisplaycoord(state);
				return;
			case 85:
				if_setplayermodel(state);
				return;
			case 86:
				get_currentcursor(state);
				return;
			case 87:
				nc_param(state);
				return;
			case 88:
				cc_setlinedirection(state);
				return;
			case 89:
				oc_tradeable(state);
				return;
			case 90:
				detailget_antialiasing(state);
				return;
			case 91:
				if_resetmodellighting(state);
				return;
			case 92:
				TwitchCommands.ttv_webcam_supported(state);
				return;
			case 93:
				oc_name(state);
				return;
			case 94:
				player_group_member_is_owner(state);
				return;
			case 95:
				lobby_enterlobby(state);
				return;
			case 96:
				if_getx(state);
				return;
			case 97:
				notifications_sendgroupedlocal(state);
				return;
			case 98:
				unknown_command_98(state);
				return;
			case 99:
				detailget_removeroofs_option(state);
				return;
			case 100:
				urlencode(state);
				return;
			case 101:
				if_setondragcomplete(state);
				return;
			case 102:
				detailget_idleanims_many(state);
				return;
			case 104:
				date_runeday_todate(state);
				return;
			case 105:
				preload_download_downloadedsize(state);
				return;
			case 106:
				cam2_getcontrolmode(state);
				return;
			case 107:
				if_setvflip(state);
				return;
			case 108:
				if_getop(state);
				return;
			case 109:
				cc_getmodelangle_x(state);
				return;
			case 110:
				player_group_get_owner_slot(state);
				return;
			case 111:
				userdetail_lobby_graceexpiry(state);
				return;
			case 112:
				date_minutes_fromruneday(state);
				return;
			case 113:
				stockmarket_getoffercount(state);
				return;
			case 114:
				preload_download_complete(state);
				return;
			case 115:
				stat_visible_xp_actual(state);
				return;
			case 116:
				activechatphrase_prepare(state);
				return;
			case 117:
				QuestCommands.quest_varbitreq_met(state);
				return;
			case 118:
				cc_setonscrollwheel(state);
				return;
			case 119:
				fullscreen_enter(state);
				return;
			case 120:
				cc_settext(state);
				return;
			case 121:
				oc_wearpos2(state);
				return;
			case 122:
				paraline(state);
				return;
			case 123:
				detail_vsync(state);
				return;
			case 124:
				if_setsize(state);
				return;
			case 125:
				sqrt(state);
				return;
			case 126:
				clan_getchatrank(state);
				return;
			case 127:
				branch_if_false(state);
				return;
			case 128:
				if_getnextsubid(state);
				return;
			case 129:
				movescripted(state);
				return;
			case 130:
				cam2_getpositionpoint_point(state);
				return;
			case 131:
				if_setmodelzoom(state);
				return;
			case 132:
				cc_setmouseovercursor(state);
				return;
			case 133:
				inv_totalcat(state);
				return;
			case 134:
				clearbit_range(state);
				return;
			case 135:
				activeclansettings_getaffinedextrainfo(state);
				return;
			case 136:
				friend_count(state);
				return;
			case 137:
				detailcanmod_interfacescale(state);
				return;
			case 138:
				cam2_isenabled(state);
				return;
			case 139:
				get_npc_name(state);
				return;
			case 140:
				worldmap_3dview_enable(state);
				return;
			case 141:
				runjavascript(state);
				return;
			case 142:
				activechatphrase_sendprivate(state);
				return;
			case 143:
				method4982(state);
				return;
			case 144:
				method2775(state);
				return;
			case 145:
				date_minutes(state);
				return;
			case 146:
				detail_antialiasingmode(state);
				return;
			case 147:
				emoji_removeall(state);
				return;
			case 148:
				activeclansettings_find_listened(state);
				return;
			case 149:
				cc_setondialogabort(state);
				return;
			case 150:
				method3591(state);
				return;
			case 151:
				ignore_add(state);
				return;
			case 152:
				stockmarket_getoffercompletedcount(state);
				return;
			case 153:
				cc_setonmisctransmit(state);
				return;
			case 154:
				stringwidth(state);
				return;
			case 155:
				cc_setonclick(state);
				return;
			case 156:
				create_reply(state);
				return;
			case 157:
				if_setmodelorigin(state);
				return;
			case 158:
				cc_setoptkeyrate(state);
				return;
			case 159:
				sound_vorbis_volume_rate_group(state);
				return;
			case 160:
				cam2_settraildistance(state);
				return;
			case 161:
				cam_getangle_ya(state);
				return;
			case 162:
				if_setonop(state);
				return;
			case 163:
				cc_param(state);
				return;
			case 164:
				login_queue_position(state);
				return;
			case 165:
				add(state);
				return;
			case 166:
				detailcanmod_antialiasingmode(state);
				return;
			case 167:
				oc_shard(state);
				return;
			case 168:
				coord_finetogrid(state);
				return;
			case 169:
				worldmap_isloaded(state);
				return;
			case 170:
				if_setonstocktransmit(state);
				return;
			case 171:
				clan_kickuser(state);
				return;
			case 172:
				activeclansettings_getaffineddisplayname(state);
				return;
			case 173:
				worldlist_start(state);
				return;
			case 174:
				if_setswipedeadzone(state);
				return;
			case 175:
				get_obj_overlay_height(state);
				return;
			case 176:
				cc_setclickmask(state);
				return;
			case 177:
				cc_setoptkeyignoreheld(state);
				return;
			case 178:
				mec_textsize(state);
				return;
			case 179:
				if_setonsubchange(state);
				return;
			case 180:
				method18922(state);
				return;
			case 181:
				emoji_remove(state);
				return;
			case 182:
				oc_findnext(state);
				return;
			case 183:
				detail_particles(state);
				return;
			case 184:
				email_validation_change_address(state);
				return;
			case 185:
				if_settiling(state);
				return;
			case 186:
				push_array(state, false, false);
				return;
			case 187:
				telemetry_get_column_count(state);
				return;
			case 188:
				cc_addpinchflags(state);
				return;
			case 189:
				if_setobject(state);
				return;
			case 190:
				friend_platform(state);
				return;
			case 191:
				enum_getreverseindex(state);
				return;
			case 192:
				stockmarket_getoffercompletedgold(state);
				return;
			case 193:
				pop_string_local(state);
				return;
			case 194:
				worldmap_3dview_gettextfont(state);
				return;
			case 195:
				detail_dof(state);
				return;
			case 196:
				if_setonclanchanneltransmit(state);
				return;
			case 197:
				substring(state);
				return;
			case 198:
				if_setnpcmodel(state);
				return;
			case 199:
				sound_song_volume(state);
				return;
			case 200:
				autosetup_getlevel(state);
				return;
			case 201:
				email_validation_add_new_address(state);
				return;
			case 202:
				if_setoncameraupdatetransmit(state);
				return;
			case 203:
				frombilling(state);
				return;
			case 204:
				push_constant_int(state);
				return;
			case 205:
				detailcanmod_maxforegroundfps(state);
				return;
			case 206:
				chatphrase_findnext(state);
				return;
			case 207:
				create_connect_reply(state);
				return;
			case 208:
				profile_cpu(state);
				return;
			case 209:
				shop_isproductavailable(state);
				return;
			case 210:
				detailget_safemode(state);
				return;
			case 211:
				worldmap_jumptosourcecoord(state);
				return;
			case 212:
				spline_new(state);
				return;
			case 213:
				QuestCommands.quest_param(state);
				return;
			case 214:
				cam_getangle_xa(state);
				return;
			case 215:
				cam2_setfieldofviewscreen(state);
				return;
			case 216:
				if_getinvcount(state);
				return;
			case 217:
				login_last_transfer_reply(state);
				return;
			case 218:
				date_isleapyear(state);
				return;
			case 219:
				activeclansettings_getaffinedslot(state);
				return;
			case 220:
				battery_ischarging(state);
				return;
			case 221:
				oc_minimenu_colour(state);
				return;
			case 222:
				pop_string_discard(state);
				return;
			case 223:
				friend_del(state);
				return;
			case 224:
				if_dragpickup(state);
				return;
			case 225:
				cc_setonfriendtransmit(state);
				return;
			case 226:
				player_group_find(state);
				return;
			case 227:
				login_ban_duration(state);
				return;
			case 228:
				player_group_member_get_rank(state);
				return;
			case 229:
				if_setopkey(state);
				return;
			case 230:
				if_setmodellighting(state);
				return;
			case 231:
				sso_displayname(state);
				return;
			case 232:
				viewport_getzoom(state);
				return;
			case 233:
				lobby_entergame(state);
				return;
			case 234:
				viewport_setfov(state);
				return;
			case 235:
				addpercent(state);
				return;
			case 236:
				if_close(state);
				return;
			case 237:
				cc_setoptchar(state);
				return;
			case 238:
				resume_hsldialog(state);
				return;
			case 239:
				pop_varbit(state);
				return;
			case 240:
				TwitchCommands.ttv_stream_start(state);
				return;
			case 241:
				cam2_setpositionspringproperties(state);
				return;
			case 242:
				cc_setonvarclantransmit(state);
				return;
			case 243:
				TwitchCommands.ttv_webcam_getdevice_byuniquename(state);
				return;
			case 244:
				if_debug_button3(state);
				return;
			case 245:
				detailget_flickering_on(state);
				return;
			case 246:
				detail_loadingscreentype(state);
				return;
			case 248:
				userdetail_lobby_lastloginaddress(state);
				return;
			case 249:
				cc_settextshadow(state);
				return;
			case 251:
				string_indexof_char(state);
				return;
			case 252:
				inv_getvar(state);
				return;
			case 253:
				string_length(state);
				return;
			case 254:
				stat_base_actual(state);
				return;
			case 255:
				mes(state);
				return;
			case 256:
				cc_settrans(state);
				return;
			case 257:
				if_debug_getopenifid(state);
				return;
			case 258:
				if_closesubclient(state);
				return;
			case 259:
				QuestCommands.quest_statreq_count(state);
				return;
			case 260:
				map_world(state);
				return;
			case 261:
				detailcanset_shadows(state);
				return;
			case 262:
				if_setop(state);
				return;
			case 263:
				if_setdragdeadzone(state);
				return;
			case 264:
				chat_sendabusereport(state);
				return;
			case 265:
				cam2_setlookatorientation_zmovement(state);
				return;
			case 266:
				chatcat_getphrasecount(state);
				return;
			case 267:
				detailcanset_bloom(state);
				return;
			case 268:
				telemetry_get_row_count(state);
				return;
			case 269:
				detailcanmod_anisotropicfiltering(state);
				return;
			case 270:
				cc_setlinkfriend(state);
				return;
			case 271:
				if_setobject_alwaysnum(state);
				return;
			case 272:
				worldlist_specific(state);
				return;
			case 273:
				detailget_shadows(state);
				return;
			case 274:
				clearbit(state);
				return;
			case 275:
				cc_setonchattransmit(state);
				return;
			case 276:
				if_setonmouserepeat(state);
				return;
			case 277:
				clan_getchatuserworldname(state);
				return;
			case 278:
				cc_sendto(false, state);
				return;
			case 279:
				worldmap_disabletextsize(state);
				return;
			case 280:
				worldmap_setflashloops_default(state);
				return;
			case 281:
				worldmap_getcategorypriority(state);
				return;
			case 282:
				userdetail_lobby_jcoins_balance(state);
				return;
			case 283:
				create_email_validate_reply(state);
				return;
			case 284:
				if_hassubmodal(state);
				return;
			case 285:
				cc_setmaxlines(state);
				return;
			case 286:
				TwitchCommands.ttv_webcam_getcap_byindex(state);
				return;
			case 287:
				detailget_loadingscreentype(state);
				return;
			case 288:
				cc_settiling(state);
				return;
			case 289:
				worldmap_jumptodisplaycoord(state);
				return;
			case 290:
				login_request_social_network(state);
				return;
			case 291:
				detailget_maxdiskcachesize(state);
				return;
			case 292:
				if_setonkey(state);
				return;
			case 293:
				cam2_addeffect_shake(state);
				return;
			case 294:
				cc_setobject_wearcol(state);
				return;
			case 295:
				preload_download_remainingsize(state);
				return;
			case 296:
				playermember(state);
				return;
			case 297:
				userdetail_lobby_lastloginday(state);
				return;
			case 298:
				method8396(state);
				return;
			case 299:
				if_settextalign(state);
				return;
			case 300:
				abs(state);
				return;
			case 301:
				if_setongamepadbutton(state);
				return;
			case 302:
				QuestCommands.quest_statreq_level(state);
				return;
			case 303:
				chatcat_getdesc(state);
				return;
			case 304:
				chatphrase_findrestart(state);
				return;
			case 305:
				friend_getrank(state);
				return;
			case 306:
				worldmap_3dview_getcoordfine(state);
				return;
			case 307:
				activeclansettings_getsortedaffinedslot(state);
				return;
			case 308:
				detailcanmod_buildarea(state);
				return;
			case 309:
				detail_ambientocclusion(state);
				return;
			case 310:
				get_entity_screen_position(state);
				return;
			case 311:
				QuestCommands.quest_questreq(state);
				return;
			case 312:
				video_advert_force_remove(state);
				return;
			case 313:
				cc_getscrolly(state);
				return;
			case 314:
				detailcanset_maxscreensize(state);
				return;
			case 315:
				QuestCommands.quest_type(state);
				return;
			case 316:
				worldmap_setflashtics_default(state);
				return;
			case 317:
				if_setondialogabort(state);
				return;
			case 318:
				telemetry_get_group_id(state);
				return;
			case 319:
				cc_setonkey(state);
				return;
			case 320:
				get_minimenu_length(state);
				return;
			case 321:
				cc_setgraphicshadow(state);
				return;
			case 322:
				oc_stackable(state);
				return;
			case 323:
				cam2_enable(state);
				return;
			case 324:
				interface_setpickingradius(state);
				return;
			case 325:
				if_setmodelanim(state);
				return;
			case 326:
				detailcanset_orthographic(state);
				return;
			case 327:
				if_setopkeyrate(state);
				return;
			case 328:
				autosetup_sethigh(state);
				return;
			case 329:
				cc_getmodelzoom(state);
				return;
			case 330:
				cc_setongamepadaxis(state);
				return;
			case 331:
				enum_hasoutput(state);
				return;
			case 332:
				method5356(state);
				return;
			case 333:
				worldmap_setmap_coord_override(state);
				return;
			case 334:
				detailget_shadowquality(state);
				return;
			case 335:
				cc_setpausetext(state);
				return;
			case 336:
				if_resume_pausebutton(state);
				return;
			case 337:
				cc_setongamepadbuttonheld(state);
				return;
			case 338:
				long_branch_not(state);
				return;
			case 339:
				if_gettargetmask(state);
				return;
			case 340:
				if_getcolour(state);
				return;
			case 341:
				detailcanmod_toolkit_default(state);
				return;
			case 342:
				userdetail_lobby_playage(state);
				return;
			case 343:
				cc_setgraphic(state);
				return;
			case 344:
				shop_getproductcount(state);
				return;
			case 345:
				detailget_dof(state);
				return;
			case 346:
				ignore_getname_unfiltered(state);
				return;
			case 347:
				cc_getcharindexatpos(state);
				return;
			case 348:
				db_getfield(state);
				return;
			case 349:
				char_touppercase(state);
				return;
			case 350:
				fps_stats(state);
				return;
			case 351:
				friend_getworld(state);
				return;
			case 352:
				if_setlinewid(state);
				return;
			case 353:
				detailget_performance_metric(state);
				return;
			case 354:
				cc_getopbase(state);
				return;
			case 355:
				cam2_setlookatmode(state);
				return;
			case 356:
				push_int_local(state);
				return;
			case 357:
				cc_getcharposatindex(state);
				return;
			case 358:
				movecoord_fine(state);
				return;
			case 359:
				clan_getchatownername(state);
				return;
			case 360:
				detail_maxscreensize(state);
				return;
			case 361:
				cc_setalpha(state);
				return;
			case 362:
				cc_setonopt(state);
				return;
			case 363:
				mec_category(state);
				return;
			case 364:
				lowercase(state);
				return;
			case 365:
				cc_setlinewid(state);
				return;
			case 366:
				cam2_getpositionmode(state);
				return;
			case 367:
				keyheld_alt(state);
				return;
			case 368:
				activeclansettings_getreplacementowner_slot(state);
				return;
			case 369:
				if_setlinkplayergroup(state);
				return;
			case 370:
				oc_placeholder(state);
				return;
			case 371:
				if_delswipeflags(state);
				return;
			case 372:
				detailcanset_interfacescale(state);
				return;
			case 373:
				cc_setonvarcstrtransmit(state);
				return;
			case 374:
				detailget_toolkit(state);
				return;
			case 375:
				cc_getmodelangle_z(state);
				return;
			case 376:
				cc_setonstocktransmit(state);
				return;
			case 377:
				cc_setrecol(state);
				return;
			case 378:
				player_group_member_get_status(state);
				return;
			case 379:
				lastlogin(state);
				return;
			case 380:
				chat_getfilter_trade(state);
				return;
			case 381:
				activeclansettings_getaffinedrank(state);
				return;
			case 382:
				oc_members(state);
				return;
			case 383:
				cc_callonresize(state);
				return;
			case 384:
				shop_getcategorycount(state);
				return;
			case 385:
				detailget_cpuusage(state);
				return;
			case 386:
				detailcanmod_spotshadows(state);
				return;
			case 387:
				sound_speech_volume(state);
				return;
			case 388:
				method16447(state);
				return;
			case 389:
				paraheight(state);
				return;
			case 390:
				spline_length(state);
				return;
			case 391:
				TwitchCommands.ttv_logout(state);
				return;
			case 392:
				os_physicalmemorysize(state);
				return;
			case 394:
				player_find_active_minimenu_entry(state);
				return;
			case 395:
				cc_setvflip(state);
				return;
			case 396:
				cc_clearops(state);
				return;
			case 397:
				player_group_member_count(state);
				return;
			case 398:
				detailget_speechvol(state);
				return;
			case 399:
				if_setlinkfriendchat(state);
				return;
			case 400:
				coordz(state);
				return;
			case 401:
				cam2_setdepthplanes(state);
				return;
			case 402:
				clan_getchatuserrank(state);
				return;
			case 403:
				gender(state);
				return;
			case 404:
				cam2_setlookatentity_npc(state);
				return;
			case 405:
				pop_long_local(state);
				return;
			case 406:
				activeclanchannel_getuserworld(state);
				return;
			case 407:
				if_setonplayergrouptransmit(state);
				return;
			case 408:
				if_opensubclient(state);
				return;
			case 409:
				cam2_addeffect_ztilt(state);
				return;
			case 410:
				detail_groundblending(state);
				return;
			case 411:
				long_branch_greater_than_or_equals(state);
				return;
			case 412:
				method10758(state);
				return;
			case 413:
				seqlength(state);
				return;
			case 414:
				method15087(state);
				return;
			case 415:
				worldlist_sort(state);
				return;
			case 416:
				if_delpinchflags(state);
				return;
			case 417:
				create_name_validate_reply(state);
				return;
			case 418:
				cc_npc_setcustombodymodel_transformed(state);
				return;
			case 419:
				cc_setfill(state);
				return;
			case 420:
				shader_preload_throttle(state);
				return;
			case 421:
				sound_synth_volume(state);
				return;
			case 422:
				ignore_getname(state);
				return;
			case 423:
				resume_clanforumqfcdialog(state);
				return;
			case 424:
				if_setmodelangle(state);
				return;
			case 425:
				cc_setoptkey(state);
				return;
			case 426:
				worldmap_getconfigzoom(state);
				return;
			case 427:
				get_mousebuttons(state);
				return;
			case 428:
				if_setsubtractinsets(state);
				return;
			case 429:
				cc_getscrollwidth(state);
				return;
			case 430:
				pop_long_discard(state);
				return;
			case 431:
				inv_totalparam_stack(state);
				return;
			case 432:
				if_setopcursor(state);
				return;
			case 433:
				cc_setobject_wearcol_alwaysnum(state);
				return;
			case 434:
				cam2_getpositionentity_lookatdistance(state);
				return;
			case 435:
				if_setcolour(state);
				return;
			case 436:
				if_sethflip(state);
				return;
			case 437:
				cc_setfontmono(state);
				return;
			case 438:
				detailget_reflections(state);
				return;
			case 439:
				if_getgraphicdimensions(state);
				return;
			case 440:
				detailcanset_spotshadows(state);
				return;
			case 441:
				if_getmodelyof(state);
				return;
			case 442:
				compare(state);
				return;
			case 443:
				detailget_soundvol(state);
				return;
			case 444:
				worldmap_flashelement(state);
				return;
			case 445:
				chatcat_getsubcatcount(state);
				return;
			case 446:
				detail_gamerenderscale(state);
				return;
			case 447:
				QuestCommands.quest_pointsreq_met(state);
				return;
			case 448:
				video_advert_play(state);
				return;
			case 449:
				if_getmodelzoom(state);
				return;
			case 450:
				detailcanset_anisotropicfiltering(state);
				return;
			case 451:
				if_setmaxlines(state);
				return;
			case 452:
				if_setondrag(state);
				return;
			case 453:
				cc_setswipedeadzone(state);
				return;
			case 454:
				detailget_customcursors(state);
				return;
			case 455:
				map_loadingscreen_settriggerpercent(state);
				return;
			case 456:
				if_debug_button8(state);
				return;
			case 457:
				detail_maxbackgroundfps(state);
				return;
			case 458:
				detailcanmod_gamerenderscale(state);
				return;
			case 459:
				reboottimer(state);
				return;
			case 460:
				if_setplayermodel_self(state);
				return;
			case 461:
				detailget_brightness(state);
				return;
			case 462:
				shop_requestdatastatus(state);
				return;
			case 463:
				lobby_enterlobby_social_network(state);
				return;
			case 464:
				branch_if_true(state);
				return;
			case 465:
				if_settextfont(state);
				return;
			case 466:
				db_find_get(state);
				return;
			case 467:
				telemetry_get_row_index(state);
				return;
			case 468:
				cc_deleteall(state);
				return;
			case 469:
				method9286(state);
				return;
			case 470:
				cam_forceangle(state);
				return;
			case 471:
				cam2_setlookatentity_player(state);
				return;
			case 472:
				setup_messagebox(state);
				return;
			case 473:
				string_indexof_string(state);
				return;
			case 474:
				db_getfieldcount(state);
				return;
			case 475:
				openurl(state);
				return;
			case 476:
				if_setonrelease(state);
				return;
			case 477:
				cc_setswipeflags(state);
				return;
			case 478:
				activeclanchannel_getuserdisplayname(state);
				return;
			case 479:
				cc_gettext(state);
				return;
			case 480:
				method5949(state);
				return;
			case 481:
				detailcanset_maxforegroundfps(state);
				return;
			case 482:
				pop_var(state);
				return;
			case 483:
				detailcanset_antialiasing(state);
				return;
			case 484:
				create_createrequest(state);
				return;
			case 485:
				if_setonchattransmit(state);
				return;
			case 486:
				cam2_setlookatorientation_yrotation(state);
				return;
			case 487:
				minimenuopen(state);
				return;
			case 488:
				worldmap_3dview_setlighting(state);
				return;
			case 489:
				if_debug_button5(state);
				return;
			case 490:
				if_sendto(false, state);
				return;
			case 491:
				if_setonmouseover(state);
				return;
			case 492:
				battery_getlevelpercent(state);
				return;
			case 493:
				detailcanset_antialiasingmode(state);
				return;
			case 494:
				detailget_orthographic(state);
				return;
			case 495:
				format_datetime_from_minutes(state);
				return;
			case 496:
				TwitchCommands.ttv_login(state);
				return;
			case 497:
				create_suggest_name_request(state);
				return;
			case 498:
				detail_antialiasing_default(state);
				return;
			case 499:
				detailcanmod_bloom(state);
				return;
			case 500:
				ignore_count(state);
				return;
			case 501:
				viewport_setzoom(state);
				return;
			case 502:
				worldmap_stopcurrentflashes(state);
				return;
			case 503:
				activeclansettings_getclanname(state);
				return;
			case 504:
				setbit(state);
				return;
			case 505:
				cc_setonverticalswipe(state);
				return;
			case 506:
				fromdate(state);
				return;
			case 507:
				method10336(state);
				return;
			case 508:
				coord(state);
				return;
			case 509:
				if_npc_setcustomrecol(state);
				return;
			case 510:
				get_loc_bounding_box(state);
				return;
			case 511:
				activechatphrase_setdynamicint(state);
				return;
			case 512:
				if_setonstattransmit(state);
				return;
			case 513:
				detailget_idleanims(state);
				return;
			case 514:
				cam2_setpositionacceleration_axis(state);
				return;
			case 515:
				detail_diskcachesize(state);
				return;
			case 516:
				cam_lookat(state);
				return;
			case 517:
				sethardcodedopcursors(state);
				return;
			case 518:
				if_setonresize(state);
				return;
			case 519:
				cc_setsize(state);
				return;
			case 520:
				worldmap_closemap(state);
				return;
			case 521:
				oc_uncert(state);
				return;
			case 522:
				if_gettext(state);
				return;
			case 523:
				enum_string(state);
				return;
			case 524:
				push_var(state);
				return;
			case 525:
				cc_settextalign(state);
				return;
			case 526:
				detailcanset_skydetail(state);
				return;
			case 527:
				login_continue(state);
				return;
			case 528:
				get_col_tag(state);
				return;
			case 529:
				pop_array(state, true);
				return;
			case 530:
				if_setgraphic(state);
				return;
			case 531:
				pop_array(state, false);
				return;
			case 532:
				TwitchCommands.ttv_library_getstate(state);
				return;
			case 533:
				setbit_range(state);
				return;
			case 534:
				if_setpinchdeadzone(state);
				return;
			case 535:
				detailcanmod_groundblending(state);
				return;
			case 536:
				viewport_geteffectivesize(state);
				return;
			case 537:
				sound_jingle(state);
				return;
			case 538:
				if_setongamepadtrigger(state);
				return;
			case 539:
				cos_deg(state);
				return;
			case 540:
				os_ismac(state);
				return;
			case 541:
				invother_total(state);
				return;
			case 542:
				sound_mixbuss_add(state);
				return;
			case 543:
				branch_not(state);
				return;
			case 544:
				if_setonverticalpinch(state);
				return;
			case 545:
				cc_settargetopcursor(state);
				return;
			case 546:
				setgender(state);
				return;
			case 547:
				notifications_cancellocal(state);
				return;
			case 548:
				push_long_local(state);
				return;
			case 549:
				detail_volumetriclighting(state);
				return;
			case 550:
				stat_base(state);
				return;
			case 551:
				TwitchCommands.ttv_library_request(state);
				return;
			case 552:
				sound_synth_rate(state);
				return;
			case 553:
				is_npc_active(state);
				return;
			case 554:
				cc_setontargetleave(state);
				return;
			case 555:
				cc_getheight(state);
				return;
			case 556:
				detail_maxforegroundfps(state);
				return;
			case 557:
				activeclanchannel_getuserrank(state);
				return;
			case 558:
				clan_getchatusername(state);
				return;
			case 559:
				clan_isself(state);
				return;
			case 560:
				cam2_getpositionentity_lookatangleoffsets(state);
				return;
			case 561:
				if_setonhold(state);
				return;
			case 562:
				resend_uid_passport_request(state);
				return;
			case 563:
				map_lang(state);
				return;
			case 564:
				long_branch_greater_than(state);
				return;
			case 565:
				detailget_maxbackgroundfps(state);
				return;
			case 566:
				enum_hasoutput_string(state);
				return;
			case 567:
				date_runeday_fromdate(state);
				return;
			case 568:
				viewport_clampfov(state);
				return;
			case 569:
				keyheld_ctrl(state);
				return;
			case 570:
				movecoord(state);
				return;
			case 571:
				chat_setfilter(state);
				return;
			case 572:
				opcount(state);
				return;
			case 573:
				worldlist_pingworlds(state);
				return;
			case 574:
				if_setopchar(state);
				return;
			case 575:
				cc_npc_setcustomretex(state);
				return;
			case 576:
				if_setopkeyignoreheld(state);
				return;
			case 577:
				TwitchCommands.ttv_webcam_flip(state);
				return;
			case 578:
				cc_setonverticalpinch(state);
				return;
			case 579:
				telemetry_get_column_index(state);
				return;
			case 580:
				runenergy_visible(state);
				return;
			case 581:
				activeclansettings_getcurrentowner_slot(state);
				return;
			case 582:
				TwitchCommands.ttv_livestreams_update(state);
				return;
			case 583:
				cc_setparam_string(state);
				return;
			case 584:
				os_isios(state);
				return;
			case 585:
				if_setonscrollwheel(state);
				return;
			case 586:
				multiply(state);
				return;
			case 587:
				cc_sendto(true, state);
				return;
			case 588:
				detailget_musicvol(state);
				return;
			case 589:
				worldmap_getconfigbounds(state);
				return;
			case 590:
				min(state);
				return;
			case 591:
				setsubmenuminlength(state);
				return;
			case 592:
				if_addpinchflags(state);
				return;
			case 593:
				db_find(state, true);
				return;
			case 594:
				if_debug_target(state);
				return;
			case 595:
				if_gettop(state);
				return;
			case 596:
				openurl_shim(state);
				return;
			case 597:
				cc_setdragrenderbehaviour(state);
				return;
			case 598:
				cc_gethide(state);
				return;
			case 599:
				cc_dragpickup(state);
				return;
			case 600:
				playermod(state);
				return;
			case 601:
				worldmap_getsize(state);
				return;
			case 602:
				shop_applypendingtransactions(state);
				return;
			case 603:
				emoji_add(state);
				return;
			case 604:
				cc_setnoclickthrough(state);
				return;
			case 605:
				if_settargetopcursor(state);
				return;
			case 606:
				oc_wearpos(state);
				return;
			case 607:
				cam2_setpositionangularinterpolation(state);
				return;
			case 608:
				logout_getreason(state);
				return;
			case 609:
				cc_delswipeflags(state);
				return;
			case 610:
				TwitchCommands.ttv_webcam_getcap_count(state);
				return;
			case 611:
				cc_sethflip(state);
				return;
			case 612:
				detailcanmod_ambientocclusion(state);
				return;
			case 613:
				TwitchCommands.ttv_stream_stop(state);
				return;
			case 614:
				if_setfontmono(state);
				return;
			case 615:
				worldmap_setmap(state);
				return;
			case 616:
				cc_setsubtractinsets(state);
				return;
			case 617:
				worldmap_flashelementcategory(state);
				return;
			case 618:
				viewport_getfov(state);
				return;
			case 619:
				inv_total(state);
				return;
			case 620:
				cam2_setfieldofview(state);
				return;
			case 621:
				cc_getinvobject(state);
				return;
			case 622:
				if_setfill(state);
				return;
			case 623:
				player_group_member_get_displayname(state);
				return;
			case 624:
				activeclansettings_getaffinedmuted(state);
				return;
			case 625:
				worldlist_next(state);
				return;
			case 626:
				activeclansettings_find_affined(state);
				return;
			case 627:
				QuestCommands.quest_points(state);
				return;
			case 628:
				create_name_availablerequest(state);
				return;
			case 629:
				detailcanset_toolkit_default(state);
				return;
			case 630:
				if_setmouseovercursor(state);
				return;
			case 631:
				if_setonclansettingstransmit(state);
				return;
			case 632:
				create_step_reached(state);
				return;
			case 633:
				cc_sethide(state);
				return;
			case 634:
				lobby_enterlobby_sso(state);
				return;
			case 635:
				escape(state);
				return;
			case 636:
				detailget_stereo(state);
				return;
			case 637:
				worldmap_getconfigsize(state);
				return;
			case 638:
				userdetail_lobby_membership(state);
				return;
			case 639:
				activeclansettings_getbannedcount(state);
				return;
			case 640:
				npc_type(state);
				return;
			case 641:
				method3485(state);
				return;
			case 642:
				date_year(state);
				return;
			case 643:
				cc_setaspect(state);
				return;
			case 644:
				if_setparam_string(state);
				return;
			case 645:
				detail_cpuusage(state);
				return;
			case 646:
				enum_getreversecount(state);
				return;
			case 647:
				detailget_particles(state);
				return;
			case 648:
				notifications_init(state);
				return;
			case 649:
				cc_setonmouseleave(state);
				return;
			case 650:
				method4060(state);
				return;
			case 651:
				cc_setonhorizontalpinch(state);
				return;
			case 652:
				getwindowmode(state);
				return;
			case 653:
				bug_report(state);
				return;
			case 654:
				invother_getnum(state);
				return;
			case 655:
				and(state);
				return;
			case 656:
				if_debug_button10(state);
				return;
			case 657:
				worldmap_3dview_settextfont(state);
				return;
			case 658:
				worldmap_setzoom(state);
				return;
			case 659:
				detailget_grounddecor_on(state);
				return;
			case 660:
				QuestCommands.quest_pointsreq(state);
				return;
			case 661:
				keyheld_shift(state);
				return;
			case 662:
				cc_getid(state);
				return;
			case 663:
				oc_cert(state);
				return;
			case 664:
				sound_group_start(state);
				return;
			case 665:
				detailcanmod_lightingquality(state);
				return;
			case 666:
				if_gety(state);
				return;
			case 667:
				enum_getoutputcount(state);
				return;
			case 668:
				method5069(state);
				return;
			case 669:
				cc_setcolour(state);
				return;
			case 670:
				setdefaultcursors(state);
				return;
			case 671:
				cam_dec_y(state);
				return;
			case 672:
				if_getopbase(state);
				return;
			case 673:
				if_gethide(state);
				return;
			case 674:
				map_quickchat(state);
				return;
			case 675:
				worldmap_3dview_getscreenposition(state);
				return;
			case 676:
				detailcanset_dof(state);
				return;
			case 677:
				method2581(state);
				return;
			case 678:
				shader_preload_allow(state);
				return;
			case 679:
				cc_addswipeflags(state);
				return;
			case 680:
				if_setheld(state);
				return;
			case 681:
				create_under13(state);
				return;
			case 682:
				cc_setobject_wearcol_nonum(state);
				return;
			case 683:
				friend_getname(state);
				return;
			case 684:
				opplayert(state);
				return;
			case 685:
				method5896(state);
				return;
			case 686:
				chat_sendprivate(state);
				return;
			case 687:
				worldmap_getmap(state);
				return;
			case 688:
				method7352(state);
				return;
			case 689:
				oc_shardcount(state);
				return;
			case 690:
				is_npc_visible(state);
				return;
			case 691:
				cc_setpinchdeadzone(state);
				return;
			case 692:
				player_group_banned_count(state);
				return;
			case 693:
				branch_greater_than(state);
				return;
			case 694:
				detailget_skydetail(state);
				return;
			case 695:
				oc_hasvarobj(state);
				return;
			case 696:
				detailget_volumetriclighting(state);
				return;
			case 697:
				method5073(state);
				return;
			case 698:
				detailcanset_groundblending(state);
				return;
			case 699:
				enum_getreverseindex_string(state);
				return;
			case 700:
				cam_getfollowheight(state);
				return;
			case 701:
				cc_getlayer(state);
				return;
			case 702:
				detail_removeroofs_option(state);
				return;
			case 703:
				clan_joinchat(state);
				return;
			case 704:
				stat_visible_xp(state);
				return;
			case 705:
				map_isowner(state);
				return;
			case 706:
				login_request(state);
				return;
			case 707:
				detail_lightingquality(state);
				return;
			case 708:
				setwindowmode(state);
				return;
			case 709:
				preload_download_rate(state);
				return;
			case 710:
				cc_setonclanchanneltransmit(state);
				return;
			case 711:
				get_entity_bounding_box(state);
				return;
			case 712:
				coordz_fine(state);
				return;
			case 713:
				autosetup_blackflaglast(state);
				return;
			case 714:
				cc_setoutline(state);
				return;
			case 715:
				detailget_gamerenderscale(state);
				return;
			case 716:
				detail_removeroofs_option_override(state);
				return;
			case 717:
				if_debug_button2(state);
				return;
			case 718:
				detailcanmod_texturing(state);
				return;
			case 719:
				detail_flickering_on(state);
				return;
			case 720:
				sso_available(state);
				return;
			case 721:
				get_obj_screen_position(state);
				return;
			case 722:
				if_setdraggable(state);
				return;
			case 723:
				friend_is_referred(state);
				return;
			case 724:
				cc_npc_setcustomheadmodel(state);
				return;
			case 725:
				detailcanmod_fog(state);
				return;
			case 726:
				cc_getmodelyof(state);
				return;
			case 727:
				method10757(state);
				return;
			case 728:
				cc_getfontmetrics(state);
				return;
			case 729:
				method4479(state);
				return;
			case 730:
				worldmap_disableelements(state);
				return;
			case 731:
				if_sethide(state);
				return;
			case 732:
				oc_op(state);
				return;
			case 733:
				method18150(state);
				return;
			case 734:
				cc_create(state);
				return;
			case 735:
				cc_setmodelzoom(state);
				return;
			case 736:
				if_setretex(state);
				return;
			case 737:
				if_setoncamfinished(state);
				return;
			case 738:
				detailcanmod_shadows(state);
				return;
			case 739:
				setdefaultwindowmode(state);
				return;
			case 740:
				TwitchCommands.ttv_hasprerequisites(state);
				return;
			case 741:
				chatcat_findphrasebyshortcut(state);
				return;
			case 742:
				cc_setonvarctransmit(state);
				return;
			case 743:
				TwitchCommands.ttv_webcam_getstate(state);
				return;
			case 744:
				preload_download_totalsize(state);
				return;
			case 745:
				get_mousey(state);
				return;
			case 746:
				cc_delpinchflags(state);
				return;
			case 747:
				login_hoptime(state);
				return;
			case 748:
				if_gettrans(state);
				return;
			case 749:
				shop_opencategories(state);
				return;
			case 750:
				chatcat_getsubcat(state);
				return;
			case 751:
				detail_stereo(state);
				return;
			case 752:
				detail_idleanims_many(state);
				return;
			case 753:
				userdetail_lobby_membersstats(state);
				return;
			case 754:
				opplayer(state);
				return;
			case 755:
				cc_setmodelorigin(state);
				return;
			case 756:
				resume_countdialog(state);
				return;
			case 757:
				activeclansettings_getallowunaffined(state);
				return;
			case 758:
				append_num(state);
				return;
			case 759:
				if_setoptchar(state);
				return;
			case 760:
				if_setmodelorthog(state);
				return;
			case 761:
				push_long_constant(state);
				return;
			case 762:
				openurl_nologin(state);
				return;
			case 763:
				detailget_antialiasing_default(state);
				return;
			case 764:
				if_getmodelangle_y(state);
				return;
			case 765:
				cam_inc_x(state);
				return;
			case 766:
				not(state);
				return;
			case 767:
				if_setonopt(state);
				return;
			case 768:
				method1921(state);
				return;
			case 769:
				detailget_chosesafemode(state);
				return;
			case 770:
				clan_leavechat(state);
				return;
			case 771:
				if_debug_getname(state);
				return;
			case 772:
				if_getheight(state);
				return;
			case 773:
				method5129(state);
				return;
			case 774:
				clan_getchatdisplayname(state);
				return;
			case 775:
				if_setongamepadbuttonheld(state);
				return;
			case 776:
				if_setongamepadaxis(state);
				return;
			case 777:
				userdetail_lobby_unreadmessages(state);
				return;
			case 778:
				if_setnoclickthrough(state);
				return;
			case 779:
				if_setoptkeyrate(state);
				return;
			case 780:
				cc_setobject_nonum(state);
				return;
			case 781:
				cc_setoncameraupdatetransmit(state);
				return;
			case 782:
				facing_fine(state);
				return;
			case 783:
				if_set_gamescreen_enabled(state);
				return;
			case 784:
				method17434(state);
				return;
			case 785:
				if_debug_getcomcount(state);
				return;
			case 786:
				cam2_setlinearmovementmode(state);
				return;
			case 787:
				randominc(state);
				return;
			case 788:
				detailcanset_animdetail(state);
				return;
			case 789:
				friend_getslotfromname(state);
				return;
			case 790:
				cam_reset(state);
				return;
			case 791:
				detailcanset_reflections(state);
				return;
			case 792:
				cc_setmodeltint(state);
				return;
			case 793:
				cam2_setpositionpoint_point(state);
				return;
			case 794:
				detailcanset_waterdetail(state);
				return;
			case 795:
				userdetail_lobby_dobrequested(state);
				return;
			case 796:
				detail_waterdetail_high(state);
				return;
			case 797:
				detailcanmod_shadowquality(state);
				return;
			case 798:
				sound_jingle_volume(state);
				return;
			case 799:
				invpow(state);
				return;
			case 800:
				inv_freespace(state);
				return;
			case 801:
				login_cancel(state);
				return;
			case 802:
				method7884(state);
				return;
			case 803:
				method257(state);
				return;
			case 804:
				activeclanchannel_getuserslot(state);
				return;
			case 805:
				if_triggerop(state);
				return;
			case 806:
				if_getscrolly(state);
				return;
			case 807:
				method8435(state);
				return;
			case 808:
				if_setlinkactiveclanchannel(state);
				return;
			case 809:
				chat_playername(state);
				return;
			case 810:
				_enum(state);
				return;
			case 811:
				cam2_setpositionentity_npc(state);
				return;
			case 812:
				worldmap_disabletype(state);
				return;
			case 813:
				worldlist_fetch(state);
				return;
			case 814:
				worldmap_disableelement(state);
				return;
			case 815:
				push_string_local(state);
				return;
			case 816:
				removetags(state);
				return;
			case 817:
				QuestCommands.quest_getsortname(state);
				return;
			case 818:
				cc_getinvcount(state);
				return;
			case 819:
				shop_getcategorydescription(state);
				return;
			case 820:
				chat_gethistory_byuid(state);
				return;
			case 821:
				cc_setplayermodel(state);
				return;
			case 822:
				userdetail_dob(state);
				return;
			case 823:
				modulo(state);
				return;
			case 824:
				chat_getfilter_private(state);
				return;
			case 825:
				detailget_bgsoundvol(state);
				return;
			case 826:
				spline_addpoint(state);
				return;
			case 827:
				worldmap_coordinmap(state);
				return;
			case 828:
				bas_getanim_ready(state);
				return;
			case 829:
				TwitchCommands.ttv_webcam_stop(state);
				return;
			case 830:
				sound_song_stop(state);
				return;
			case 831:
				detail_toolkit(state);
				return;
			case 832:
				detailcanmod_maxscreensize(state);
				return;
			case 833:
				cam2_setlookatorientation_vector(state);
				return;
			case 834:
				cc_setobject(state);
				return;
			case 835:
				cc_setdraggable(state);
				return;
			case 836:
				append_signnum(state);
				return;
			case 837:
				TwitchCommands.ttv_webcam_getdevice_count(state);
				return;
			case 838:
				staffmodlevel(state);
				return;
			case 839:
				QuestCommands.quest_started(state);
				return;
			case 840:
				detailcanset_texturing(state);
				return;
			case 841:
				if_settargetcursors(state);
				return;
			case 842:
				char_isalpha(state);
				return;
			case 843:
				chat_clear(state);
				return;
			case 844:
				detail_loginvol(state);
				return;
			case 845:
				shop_open(state);
				return;
			case 846:
				worldmap_findnearestelement(state);
				return;
			case 847:
				db_find(state, false);
				return;
			case 848:
				if_debug_button7(state);
				return;
			case 849:
				if_setdragrenderbehaviour(state);
				return;
			case 850:
				if_debug_button1(state);
				return;
			case 851:
				detailget_texturing(state);
				return;
			case 852:
				cc_getgraphic(state);
				return;
			case 853:
				cc_setmodelangle(state);
				return;
			case 854:
				player_group_banned_get_displayname(state);
				return;
			case 855:
				shop_getindexforcategoryname(state);
				return;
			case 856:
				if_clearscripthooks(state);
				return;
			case 857:
				userdetail_lobby_ccexpiry(state);
				return;
			case 858:
				oc_find(state);
				return;
			case 859:
				stockmarket_isofferadding(state);
				return;
			case 860:
				if_getmodel(state);
				return;
			case 861:
				cc_setonvartransmit(state);
				return;
			case 862:
				clienttype(state);
				return;
			case 863:
				fullscreen_getmode(state);
				return;
			case 864:
				detail_reflections(state);
				return;
			case 865:
				detailcanmod_antialiasing(state);
				return;
			case 866:
				branch(state);
				return;
			case 867:
				QuestCommands.quest_getdifficulty(state);
				return;
			case 868:
				affinedclansettings_setmuted_fromchannel(state);
				return;
			case 869:
				sub(state);
				return;
			case 870:
				cam2_removealleffects(state);
				return;
			case 871:
				activeclansettings_getbanneddisplayname(state);
				return;
			case 872:
				ignore_getnotes(state);
				return;
			case 873:
				inv_totalparam(state);
				return;
			case 874:
				activeclansettings_getranktalk(state);
				return;
			case 875:
				TwitchCommands.ttv_chat_sendmessage(state);
				return;
			case 876:
				if_getfontmetrics(state);
				return;
			case 877:
				db_findnext(state);
				return;
			case 878:
				cc_setposition(state);
				return;
			case 879:
				if_setgraphicshadow(state);
				return;
			case 880:
				worldmap_getdisableelementcategory(state);
				return;
			case 881:
				shop_getproductdetails(state);
				return;
			case 882:
				create_connectrequest(state);
				return;
			case 883:
				player_group_member_get_join_xp(state);
				return;
			case 884:
				map_loadedpercent(state);
				return;
			case 885:
				get_loc_overlay_height(state);
				return;
			case 886:
				fullscreen_lastmode(state);
				return;
			case 887:
				detail_soundvol(state);
				return;
			case 888:
				parawidth(state);
				return;
			case 889:
				if_getcharposatindex(state);
				return;
			case 890:
				cc_setmodel(state);
				return;
			case 891:
				if_callonresize(state);
				return;
			case 892:
				if_setopbase(state);
				return;
			case 893:
				applet_hasfocus(state);
				return;
			case 894:
				chatcat_getphraseshortcut(state);
				return;
			case 895:
				if_setonverticalswipe(state);
				return;
			case 896:
				detailcanset_ambientocclusion(state);
				return;
			case 897:
				detailget_toolkit_default(state);
				return;
			case 898:
				if_settrans(state);
				return;
			case 899:
				stockmarket_isofferempty(state);
				return;
			case 900:
				sound_song(state);
				return;
			case 901:
				if_setonclickrepeat(state);
				return;
			case 902:
				QuestCommands.quest_allreqmet(state);
				return;
			case 903:
				cancel_interface_drag(state);
				return;
			case 904:
				worldmap_3dview_active(state);
				return;
			case 905:
				detailget_canchoosesafemode(state);
				return;
			case 906:
				coord_fine(state);
				return;
			case 907:
				os_driver_vendor(state);
				return;
			case 908:
				chat_gethistorylength(state);
				return;
			case 909:
				if_getwidth(state);
				return;
			case 910:
				get_npc_vislevel(state);
				return;
			case 911:
				telemetry_get_column_id(state);
				return;
			case 912:
				cc_setlinkfriendchat(state);
				return;
			case 913:
				oc_param(state);
				return;
			case 914:
				detailcanset_fog(state);
				return;
			case 915:
				setobj(state);
				return;
			case 916:
				defaultminimenu(state);
				return;
			case 917:
				if_hassuboverlay(state);
				return;
			case 918:
				cam2_setpositionmaxspeed(state);
				return;
			case 919:
				if_setonvarcstrtransmit(state);
				return;
			case 920:
				method5146(state);
				return;
			case 921:
				divide(state);
				return;
			case 922:
				cc_setmodelanim(state);
				return;
			case 923:
				method7328(state);
				return;
			case 924:
				if_setoninvtransmit(state);
				return;
			case 925:
				worldlist_autoworld(state);
				return;
			case 926:
				if_setonclantransmit(state);
				return;
			case 927:
				resume_objdialog(state);
				return;
			case 928:
				stockmarket_getofferitem(state);
				return;
			case 929:
				detail_bgsoundvol(state);
				return;
			case 930:
				chat_playername_unfiltered(state);
				return;
			case 931:
				invother_getvar(state);
				return;
			case 932:
				os_driver_outdated(state);
				return;
			case 933:
				activeclansettings_getcoinshare(state);
				return;
			case 934:
				if_setonvarclantransmit(state);
				return;
			case 935:
				getgridcoordrelativetocamera(state);
				return;
			case 936:
				TwitchCommands.ttv_webcam_getdevice_byindex(state);
				return;
			case 937:
				worldmap_3dview_setloddistance(state);
				return;
			case 938:
				mec_param(state);
				return;
			case 939:
				cc_setpinchflags(state);
				return;
			case 940:
				if_setalpha(state);
				return;
			case 941:
				resume_stringdialog(state);
				return;
			case 942:
				QuestCommands.quest_varbitreq_desc(state);
				return;
			case 943:
				if_setpinchflags(state);
				return;
			case 944:
				mes_typed(state);
				return;
			case 945:
				push_array(state, true, false);
				return;
			case 946:
				cc_gettargetmask(state);
				return;
			case 947:
				get_entity_say(state);
				return;
			case 948:
				cc_setonrelease(state);
				return;
			case 949:
				cc_setonresize(state);
				return;
			case 950:
				if_resetlinkplayer(state);
				return;
			case 951:
				bitcount(state);
				return;
			case 952:
				create_suggest_name_reply(state);
				return;
			case 953:
				cc_setplayermodel_self(state);
				return;
			case 954:
				detailget_ambientocclusion(state);
				return;
			case 955:
				login_reply(state);
				return;
			case 956:
				detailcanmod_hardshadows(state);
				return;
			case 957:
				chatphrase_getautoresponse(state);
				return;
			case 958:
				email_validation_submit_code(state);
				return;
			case 959:
				setwalkmarker(state);
				return;
			case 960:
				if_getcharindexatpos(state);
				return;
			case 961:
				friend_add(state);
				return;
			case 962:
				cam2_setlookatspringproperties(state);
				return;
			case 963:
				shop_getcategoryid(state);
				return;
			case 964:
				cc_setdragdeadzone(state);
				return;
			case 965:
				show_software_license(state);
				return;
			case 966:
				if_debug_button6(state);
				return;
			case 967:
				max(state);
				return;
			case 968:
				worldmap_setflashloops(state);
				return;
			case 969:
				player_group_get_create_mins_since_epoch(state);
				return;
			case 970:
				detailcanmod_maxbackgroundfps(state);
				return;
			case 971:
				get_loc_screen_position(state);
				return;
			case 972:
				cc_setplayerhead_self(state);
				return;
			case 973:
				worldmap_setflashtics(state);
				return;
			case 974:
				worldmap_getmapname(state);
				return;
			case 975:
				lobby_entergamereply(state);
				return;
			case 976:
				cc_getscrollheight(state);
				return;
			case 977:
				get_minimenu_target(state);
				return;
			case 978:
				cam2_setlookatangularinterpolation(state);
				return;
			case 979:
				if_setscrollsize(state);
				return;
			case 980:
				detailget_mindiskcachesize(state);
				return;
			case 981:
				notify_accountcreatestarted(state);
				return;
			case 982:
				fullscreen_modecount(state);
				return;
			case 983:
				detailget_drawdistance(state);
				return;
			case 984:
				method3911(state);
				return;
			case 985:
				if_setdragdeadtime(state);
				return;
			case 986:
				if_getscrollwidth(state);
				return;
			case 987:
				cc_setonmouseover(state);
				return;
			case 988:
				npc_find_active_minimenu_entry(state);
				return;
			case 989:
				if_setonvarctransmit(state);
				return;
			case 990:
				detail_buildarea(state);
				return;
			case 991:
				detailget_animdetail(state);
				return;
			case 992:
				activechatphrase_setdynamicobj(state);
				return;
			case 993:
				get_obj_bounding_box(state);
				return;
			case 994:
				if_settargetverb(state);
				return;
			case 995:
				cc_setnpchead(state);
				return;
			case 996:
				docheat(state);
				return;
			case 997:
				or(state);
				return;
			case 998:
				worldmap_getcurrentmap(state);
				return;
			case 999:
				cc_setopkeyrate(state);
				return;
			case 1000:
				coordy(state);
				return;
			case 1001:
				detailget_anisotropicfiltering(state);
				return;
			case 1002:
				detail_lightdetail_high(state);
				return;
			case 1003:
				detail_idleanims(state);
				return;
			case 1004:
				cc_getop(state);
				return;
			case 1005:
				worldmap_getdisableelement(state);
				return;
			case 1006:
				cc_setonclansettingstransmit(state);
				return;
			case 1007:
				worldmap_getconfigorigin(state);
				return;
			case 1008:
				method13982(state);
				return;
			case 1009:
				cc_gety(state);
				return;
			case 1010:
				detailget_antialiasingmode(state);
				return;
			case 1011:
				basecolour(state);
				return;
			case 1012:
				cc_settargetverb(state);
				return;
			case 1013:
				if_setrecol(state);
				return;
			case 1014:
				hsvtorgb(state);
				return;
			case 1015:
				if_getparentlayer(state);
				return;
			case 1016:
				text_gender(state);
				return;
			case 1017:
				video_advert_allow_skip(state);
				return;
			case 1018:
				emoji_substitute(state);
				return;
			case 1019:
				chat_getfilter_public(state);
				return;
			case 1020:
				cam2_setlookatorientation_maxdistanceclamping(state);
				return;
			case 1021:
				inv_getobj(state);
				return;
			case 1022:
				player_group_get_overall_status(state);
				return;
			case 1023:
				detailcanmod_volumetriclighting(state);
				return;
			case 1024:
				if_addswipeflags(state);
				return;
			case 1025:
				stockmarket_getoffertype(state);
				return;
			case 1026:
				detailcanset_particles(state);
				return;
			case 1027:
				char_tolowercase(state);
				return;
			case 1028:
				TwitchCommands.ttv_webcam_getcap_byuniqueid(state);
				return;
			case 1029:
				if_setonmouseleave(state);
				return;
			case 1030:
				os_islinux(state);
				return;
			case 1031:
				TwitchCommands.ttv_stream_getquality(state);
				return;
			case 1032:
				shop_requestdata(state);
				return;
			case 1033:
				worldmap_3dview_getloddistance(state);
				return;
			case 1034:
				cc_setparam(state);
				return;
			case 1035:
				friend_getnotes(state);
				return;
			case 1036:
				player_group_get_create_seconds_to_now(state);
				return;
			case 1037:
				if_setaspect(state);
				return;
			case 1038:
				detailget_groundblending(state);
				return;
			case 1039:
				togglebit(state);
				return;
			case 1040:
				if_getmodelxof(state);
				return;
			case 1041:
				if_hassub(state);
				return;
			case 1042:
				if_setposition(state);
				return;
			case 1043:
				writeconsole(state);
				return;
			case 1044:
				telemetry_is_grid_processor_set(state);
				return;
			case 1045:
				preload_progress(state);
				return;
			case 1046:
				activeclanchannel_getsorteduserslot(state);
				return;
			case 1047:
				quit(state);
				return;
			case 1048:
				window_getinsets(state);
				return;
			case 1049:
				QuestCommands.quest_finished(state);
				return;
			case 1050:
				if_setobject_wearcol_nonum(state);
				return;
			case 1051:
				cam_removeroof(state);
				return;
			case 1052:
				cc_set2dangle(state);
				return;
			case 1053:
				cc_setondragcomplete(state);
				return;
			case 1054:
				if_debug_getopenifcount(state);
				return;
			case 1055:
				QuestCommands.quest_questreq_count(state);
				return;
			case 1056:
				stockmarket_isofferstable(state);
				return;
			case 1057:
				cc_setonclantransmit(state);
				return;
			case 1058:
				mec_text(state);
				return;
			case 1059:
				if_setobject_wearcol_alwaysnum(state);
				return;
			case 1060:
				has_nxt(state);
				return;
			case 1061:
				detail_hardshadows(state);
				return;
			case 1062:
				activeclanchannel_kickuser(state);
				return;
			case 1063:
				worldlist_specific_thisworld(state);
				return;
			case 1064:
				is_gamescreen_state(state);
				return;
			case 1065:
				cam2_setpositionmode(state);
				return;
			case 1066:
				branch_less_than_or_equals(state);
				return;
			case 1067:
				automatedtestflags(state);
				return;
			case 1068:
				detailcanset_vsync(state);
				return;
			case 1069:
				pow(state);
				return;
			case 1070:
				self_player_uid(state);
				return;
			case 1071:
				pop_int_local(state);
				return;
			case 1072:
				append(state);
				return;
			case 1073:
				autosetup_setlow(state);
				return;
			case 1074:
				chatcat_findsubcatbyshortcut(state);
				return;
			case 1075:
				detailcanmod_animdetail(state);
				return;
			case 1076:
				detail_grounddecor_on(state);
				return;
			case 1077:
				cc_setonsubchange(state);
				return;
			case 1078:
				sound_distancefocusfilter_setparams(state);
				return;
			case 1079:
				autosetup_setultra(state);
				return;
			case 1080:
				stockmarket_getofferprice(state);
				return;
			case 1081:
				stockmarket_isofferfinished(state);
				return;
			case 1082:
				cam2_setcollisionmode(state);
				return;
			case 1083:
				QuestCommands.quest_varpreq_desc(state);
				return;
			case 1084:
				coordlevel_fine(state);
				return;
			case 1085:
				inv_size(state);
				return;
			case 1086:
				if_debug_button9(state);
				return;
			case 1087:
				if_setplayerhead_self(state);
				return;
			case 1088:
				video_advert_has_finished(state);
				return;
			case 1089:
				create_availablerequest(state);
				return;
			case 1090:
				if_debug_button4(state);
				return;
			case 1091:
				detailget_fog_on(state);
				return;
			case 1092:
				detail_fog_on(state);
				return;
			case 1093:
				worldmap_getdisabletype(state);
				return;
			case 1094:
				db_listall(state);
				return;
			case 1095:
				is_targeted_entity(state);
				return;
			case 1096:
				cc_get2dangle(state);
				return;
			case 1097:
				can_run_java_client(state);
				return;
			case 1098:
				chatphrase_getautoresponsecount(state);
				return;
			case 1099:
				testbit(state);
				return;
			case 1100:
				char_isalphanumeric(state);
				return;
			case 1101:
				coordx(state);
				return;
			case 1102:
				friend_test(state);
				return;
			case 1103:
				long_branch_less_than_or_equals(state);
				return;
			case 1104:
				cc_setmodellighting(state);
				return;
			case 1105:
				cam_movealong(state);
				return;
			case 1106:
				cam2_setlookatpoint_point(state);
				return;
			case 1107:
				cc_setdragdeadtime(state);
				return;
			case 1108:
				worldmap_listelement_start(state);
				return;
			case 1109:
				cc_setontimer(state);
				return;
			case 1110:
				oc_findrestart(state);
				return;
			case 1111:
				cc_setonmouserepeat(state);
				return;
			case 1112:
				if_setnpchead(state);
				return;
			case 1113:
				activeclanchannel_find_listened(state);
				return;
			case 1114:
				if_settext(state);
				return;
			case 1115:
				chatphrase_getdynamiccommand(state);
				return;
			case 1116:
				detailcanset_buildarea(state);
				return;
			case 1117:
				cc_setonclickrepeat(state);
				return;
			case 1118:
				detail_drawdistance(state);
				return;
			case 1119:
				if_getscrollx(state);
				return;
			case 1120:
				cc_triggerop(state);
				return;
			case 1121:
				detailcanmod_dof(state);
				return;
			case 1122:
				branch_greater_than_or_equals(state);
				return;
			case 1123:
				if_getscrollheight(state);
				return;
			case 1124:
				cc_setscrollpos(state);
				return;
			case 1125:
				worldlist_switch(state);
				return;
			case 1126:
				enum_getreversecount_string(state);
				return;
			case 1127:
				cam2_setsnapdistances(state);
				return;
			case 1128:
				TwitchCommands.ttv_login_getstate(state);
				return;
			case 1129:
				cc_setongamepadbutton(state);
				return;
			case 1130:
				if_setonfriendtransmit(state);
				return;
			case 1131:
				if_getinvobject(state);
				return;
			case 1132:
				cc_settextfont(state);
				return;
			case 1133:
				cam2_setpositionmaxspeed_axis(state);
				return;
			case 1134:
				playerdemo(state);
				return;
			case 1135:
				cam2_setlookatorientation_xmovement(state);
				return;
			case 1136:
				comlevel_active(state);
				return;
			case 1137:
				if_setmodeltint(state);
				return;
			case 1138:
				if_get2dangle(state);
				return;
			case 1139:
				cc_getmodelxof(state);
				return;
			case 1140:
				TwitchCommands.ttv_stream_getviewers(state);
				return;
			case 1141:
				clanforumqfc_tostring(state);
				return;
			case 1142:
				interpolate(state);
				return;
			case 1143:
				if_setpausetext(state);
				return;
			case 1144:
				return;
			case 1145:
				create_setunder13(state);
				return;
			case 1146:
				oc_iop(state);
				return;
			case 1147:
				worldmap_getdisableelements(state);
				return;
			case 1148:
				cc_gettrans(state);
				return;
			case 1149:
				friend_getworldname(state);
				return;
			case 1150:
				QuestCommands.quest_statreq_stat(state);
				return;
			case 1151:
				sound_vorbis_rate(state);
				return;
			case 1152:
				cc_setretex(state);
				return;
			case 1153:
				detailget_recommendeddiskcachesize(state);
				return;
			case 1154:
				detailcanset_hardshadows(state);
				return;
			case 1155:
				if_getlayer(state);
				return;
			case 1156:
				affinedclansettings_addbanned_fromchannel(state);
				return;
			case 1157:
				TwitchCommands.ttv_stream_setsmoothresize(state);
				return;
			case 1158:
				oc_cost(state);
				return;
			case 1159:
				player_group_get_max_size(state);
				return;
			case 1160:
				if_setmodel(state);
				return;
			case 1161:
				shader_preload_percent(state);
				return;
			case 1162:
				lc_param(state);
				return;
			case 1163:
				if_setobject_wearcol(state);
				return;
			case 1164:
				telemetry_get_grid_value(state);
				return;
			case 1165:
				activeclanchannel_find_affined(state);
				return;
			case 1166:
				method484(state);
				return;
			case 1167:
				_switch(state);
				return;
			case 1168:
				chat_getnextuid(state);
				return;
			case 1169:
				activeclansettings_getranklootshare(state);
				return;
			case 1170:
				detailcanset_gamerenderscale(state);
				return;
			case 1171:
				if_setparam_int(state);
				return;
			case 1172:
				cc_settextantimacro(state);
				return;
			case 1173:
				date_runeday(state);
				return;
			case 1174:
				cc_setondrag(state);
				return;
			case 1175:
				worldmap_getdisabletextsize(state);
				return;
			case 1176:
				autosetup_setmin(state);
				return;
			case 1177:
				if_setclickmask(state);
				return;
			case 1178:
				if_debug_getservertriggers(state);
				return;
			case 1179:
				get_active_minimenu_entry(state);
				return;
			case 1180:
				sin_deg(state);
				return;
			case 1181:
				atan2_deg(state);
				return;
			case 1182:
				telemetry_is_row_pinned(state);
				return;
			case 1183:
				oc_wearpos3(state);
				return;
			case 1184:
				QuestCommands.quest_varpreq_met(state);
				return;
			case 1185:
				userflowflags(state);
				return;
			case 1186:
				cam2_getlookatmode(state);
				return;
			case 1187:
				detailget_waterdetail_high(state);
				return;
			case 1188:
				detail_musicvol(state);
				return;
			case 1189:
				if_setoptkeyignoreheld(state);
				return;
			case 1190:
				method3564(state);
				return;
			case 1191:
				method5893(state);
				return;
			case 1192:
				cc_setswipeunknown2(state);
				return;
			case 1193:
				cc_getmodel(state);
				return;
			case 1194:
				friend_is_referrer(state);
				return;
			case 1195:
				if_debug_getcomname(state);
				return;
			case 1196:
				notify_accountcreated(state);
				return;
			case 1197:
				cc_npc_setcustomrecol(state);
				return;
			case 1198:
				cc_setmodelorthog(state);
				return;
			case 1199:
				openurlraw(state);
				return;
			case 1200:
				chat_sendpublic(state);
				return;
			case 1201:
				if_setonmisctransmit(state);
				return;
			case 1202:
				inv_getnum(state);
				return;
			case 1203:
				player_group_member_get_team(state);
				return;
			case 1204:
				cc_resetmodellighting(state);
				return;
			case 1205:
				detailcanset_lightingquality(state);
				return;
			case 1206:
				detail_shadows(state);
				return;
			case 1207:
				QuestCommands.quest_statreq_met(state);
				return;
			case 1208:
				QuestCommands.quest_varpreq_count(state);
				return;
			case 1209:
				notifications_sendlocal(state);
				return;
			case 1210:
				login_disallowtrigger(state);
				return;
			case 1211:
				login_accountappeal(state);
				return;
			case 1212:
				telemetry_get_row_id(state);
				return;
			case 1213:
				pop_int_discard(state);
				return;
			case 1214:
				coord_gridtofine(state);
				return;
			case 1215:
				basematerial(state);
				return;
			case 1216:
				playermodlevel(state);
				return;
			case 1217:
				oc_id(state);
				return;
			case 1218:
				method9271(state);
				return;
			case 1219:
				TwitchCommands.ttv_livestreams_getstream_next(state);
				return;
			case 1220:
				cc_setonop(state);
				return;
			case 1221:
				shop_getindexforcategoryid(state);
				return;
			case 1222:
				worldmap_3dview_disable(state);
				return;
			case 1223:
				clanprofile_find(state);
				return;
			case 1224:
				if_set2dangle(state);
				return;
			case 1225:
				get_displayname_withextras(state);
				return;
			case 1226:
				if_setonplayergroupvarptransmit(state);
				return;
			case 1227:
				if_setscrollpos(state);
				return;
			case 1228:
				cc_setonhold(state);
				return;
			case 1229:
				get_entity_overlay_height(state);
				return;
			case 1230:
				if_npc_setcustomretex(state);
				return;
			case 1231:
				worldmap_jumptosourcecoord_instant(state);
				return;
			case 1232:
				detail_interfacescale(state);
				return;
			case 1233:
				db_find_refine(state);
				return;
			case 1234:
				cam2_setpositionentity_player(state);
				return;
			case 1235:
				detail_speechvol(state);
				return;
			case 1236:
				cam2_setpositionacceleration(state);
				return;
			case 1237:
				cc_setopkey(state);
				return;
			case 1238:
				worldmap_disableelementcategory(state);
				return;
			case 1239:
				stat(state);
				return;
			case 1240:
				player_group_member_get_same_world_var(state);
				return;
			case 1241:
				method6023(state);
				return;
			case 1242:
				array_sort(state);
				return;
			case 1243:
				activeclanchannel_getranktalk(state);
				return;
			case 1244:
				cc_delete(state);
				return;
			case 1245:
				autosetup_dosetup(state);
				return;
			case 1246:
				cc_getfontgraphic(state);
				return;
			case 1247:
				method4373(state);
				return;
			case 1248:
				method7233(state);
				return;
			case 1249:
				TwitchCommands.ttv_webcam_start(state);
				return;
			case 1250:
				cc_setlinkactiveclanchannel(state);
				return;
			case 1251:
				cc_setscrollsize(state);
				return;
			case 1252:
				oc_unshard(state);
				return;
			case 1253:
				method4065(state);
				return;
			case 1254:
				cam2_setlookatacceleration_axis(state);
				return;
			case 1255:
				detailcanmod_grounddecor(state);
				return;
			case 1256:
				coordy_fine(state);
				return;
			case 1257:
				affiliate(state);
				return;
			case 1258:
				cam_inc_y(state);
				return;
			case 1259:
				friend_setnotes(state);
				return;
			case 1260:
				QuestCommands.quest_getmembers(state);
				return;
			case 1261:
				activeclanchannel_getrankkick(state);
				return;
			case 1262:
				if_setontargetleave(state);
				return;
			case 1263:
				formatminimenu(state);
				return;
			case 1264:
				getdefaultwindowmode(state);
				return;
			case 1265:
				if_npc_setcustombodymodel(state);
				return;
			case 1266:
				chat_lastuid(state);
				return;
			case 1267:
				marketing_sendevent(state);
				return;
			case 1268:
				sound_vorbis_volume(state);
				return;
			case 1269:
				detail_spotshadows_on(state);
				return;
			case 1270:
				detailcanset_shadowquality(state);
				return;
			case 1271:
				detail_bloom(state);
				return;
			case 1272:
				clientclock(state);
				return;
			case 1273:
				oc_category(state);
				return;
			case 1274:
				QuestCommands.quest_questreq_met(state);
				return;
			case 1275:
				os_isandroid(state);
				return;
			case 1276:
				worldmap_getsourceposition(state);
				return;
			case 1277:
				method4422(state);
				return;
			case 1278:
				if_npc_setcustombodymodel_transformed(state);
				return;
			case 1279:
				cc_setoninvtransmit(state);
				return;
			case 1280:
				detailget_diskcachesize(state);
				return;
			case 1281:
				activeclansettings_getaffinedjoinruneday(state);
				return;
			case 1282:
				chatphrase_getdynamiccommandcount(state);
				return;
			case 1283:
				player_group_member_is_online(state);
				return;
			case 1284:
				detail_brightness(state);
				return;
			case 1285:
				cc_setopcursor(state);
				return;
			case 1286:
				long_branch_less_than(state);
				return;
			case 1287:
				activeclanchannel_getclanname(state);
				return;
			case 1288:
				notifications_opensettings(state);
				return;
			case 1289:
				get_mousex(state);
				return;
			case 1290:
				login_resetreply(state);
				return;
			case 1291:
				if_setonvartransmit(state);
				return;
			case 1292:
				method8382(state);
				return;
			case 1293:
				cc_setopkeyignoreheld(state);
				return;
			case 1294:
				login_disallowresult(state);
				return;
			case 1295:
				userdetail_lobby_recoveryday(state);
				return;
			case 1296:
				worldmap_jumptodisplaycoord_instant(state);
				return;
			case 1297:
				detailget_interfacescale(state);
				return;
			case 1298:
				chatphrase_find(state);
				return;
			case 1299:
				getbit_range(state);
				return;
			case 1300:
				cc_setop(state);
				return;
			case 1301:
				clan_getchatusername_unfiltered(state);
				return;
			case 1302:
				TwitchCommands.ttv_stream_settitle(state);
				return;
			case 1303:
				worldmap_listelement_next(state);
				return;
			case 1304:
				cam2_setlookatacceleration(state);
				return;
			case 1305:
				cam2_getpositionentity_angleoffsets(state);
				return;
			case 1306:
				marketing_init(state);
				return;
			case 1307:
				if_npc_setcustomheadmodel(state);
				return;
			case 1308:
				invother_getobj(state);
				return;
			case 1309:
				worldmap_setmap_coord(state);
				return;
			case 1310:
				player_group_get_displayname(state);
				return;
			case 1311:
				cc_setonplayergrouptransmit(state);
				return;
			case 1312:
				chatcat_getsubcatshortcut(state);
				return;
			case 1313:
				login_inprogress(state);
				return;
			case 1314:
				cc_setoncamfinished(state);
				return;
			case 1315:
				if_setontargetenter(state);
				return;
			case 1316:
				if_get_gamescreen(state);
				return;
			case 1317:
				db_getrowtable(state);
				return;
			case 1318:
				detail_texturing(state);
				return;
			case 1319:
				lobby_enterlobbyreply(state);
				return;
			case 1320:
				TwitchCommands.ttv_chat_getstate(state);
				return;
			case 1321:
				cc_getwidth(state);
				return;
			case 1322:
				cc_resetlinkplayer(state);
				return;
			case 1323:
				cc_getscrollx(state);
				return;
			case 1324:
				targetmode_cancel(state);
				return;
			case 1325:
				method3039(state);
				return;
			case 1326:
				clan_getchatuserworld(state);
				return;
			case 1327:
				cc_setnpcmodel(state);
				return;
			case 1328:
				branch_less_than(state);
				return;
			case 1329:
				chat_getprevuid(state);
				return;
			case 1330:
				friend_getworldflags(state);
				return;
			case 1331:
				ignore_add_temp(state);
				return;
			case 1332:
				cc_setonhorizontalswipe(state);
				return;
			case 1333:
				TwitchCommands.ttv_stream_getstate(state);
				return;
			case 1334:
				fullscreen_exit(state);
				return;
			case 1335:
				detail_skydetail(state);
				return;
			case 1336:
				player_group_is_members_only(state);
				return;
			case 1337:
				playercountry(state);
				return;
			case 1338:
				sound_group_stop(state);
				return;
			case 1339:
				activeclansettings_getrankkick(state);
				return;
			case 1340:
				detail_customcursors(state);
				return;
			case 1341:
				if_settextshadow(state);
				return;
			case 1342:
				player_group_member_get_last_seen_node_id(state);
				return;
			case 1343:
				activechatphrase_send(state);
				return;
			case 1344:
				QuestCommands.quest_getname(state);
				return;
			case 1345:
				string_distance(state);
				return;
			case 1346:
				telemetry_get_group_index(state);
				return;
			case 1347:
				cam2_resetsnapdistances(state);
				return;
			case 1348:
				detail_toolkit_default(state);
				return;
			case 1349:
				_return(state);
				return;
			case 1350:
				has_html5(state);
				return;
			case 1351:
				push_varbit(state);
				return;
			case 1352:
				cc_setswipedeadtime(state);
				return;
			case 1353:
				chatphrase_getdynamiccommandparam_enum(state);
				return;
			case 1354:
				detailcanmod_waterdetail(state);
				return;
			case 1355:
				cc_resume_pausebutton(state);
				return;
			case 1356:
				detailcanset_maxbackgroundfps(state);
				return;
			case 1357:
				coordx_fine(state);
				return;
			case 1358:
				if_setonclick(state);
				return;
			case 1359:
				char_isprintable(state);
				return;
			case 1360:
				detail_shadowquality(state);
				return;
			case 1361:
				force_interface_drag(state);
				return;
			case 1362:
				runweight_visible(state);
				return;
			case 1363:
				detailcanmod_particles(state);
				return;
			case 1364:
				oc_icursor(state);
				return;
			case 1365:
				if_clearops(state);
				return;
			case 1366:
				mec_sprite(state);
				return;
			case 1367:
				autosetup_setcustom(state);
				return;
			case 1368:
				worldmap_setcategorypriority(state);
				return;
			case 1369:
				clan_getchatcount(state);
				return;
			case 1370:
				cam2_setlookatmaxspeed(state);
				return;
			case 1371:
				cc_setlinkplayergroup(state);
				return;
			case 1372:
				cam2_legacycam_ready(state);
				return;
			case 1373:
				text_switch(state);
				return;
			case 1374:
				detail_animdetail(state);
				return;
			case 1375:
				random(state);
				return;
			case 1376:
				push_constant_string(state);
				return;
			case 1377:
				cc_getcolour(state);
				return;
			case 1378:
				cam_followcoord(state);
				return;
			case 1379:
				cam_setfollowheight(state);
				return;
			case 1380:
				append_char(state);
				return;
			case 1381:
				detailcanmod_orthographic(state);
				return;
			case 1382:
				resume_namedialog(state);
				return;
			case 1383:
				chat_gethistory_bytypeandline(state);
				return;
			case 1384:
				cam2_setpositionspline_spline(state);
				return;
			case 1385:
				userdetail_lobby_emailstatus(state);
				return;
			case 1386:
				method6079(state);
				return;
			case 1387:
				if_setswipedeadtime(state);
				return;
			case 1388:
				cc_settargetcursors(state);
				return;
			case 1389:
				player_group_member_is_member(state);
				return;
			case 1390:
				seq_param(state);
				return;
			case 1391:
				if_setlinedirection(state);
				return;
			case 1392:
				ignore_getslotfromname(state);
				return;
			case 1393:
				emoji_enable_auto_chatline(state);
				return;
			case 1394:
				cc_getmodelangle_y(state);
				return;
			case 1395:
				detailcanset_volumetriclighting(state);
				return;
			case 1396:
				sound_mixbuss_setlevel(state);
				return;
			case 1397:
				ignore_test(state);
				return;
			case 1398:
				detailget_spotshadows_on(state);
				return;
			case 1399:
				cc_setobject_alwaysnum(state);
				return;
			case 1400:
				cc_npc_setcustombodymodel(state);
				return;
			case 1401:
				method4048(state);
				return;
			case 1402:
				detailcanmod_reflections(state);
				return;
			case 1403:
				long_branch_equals(state);
				return;
			case 1404:
				create_get_email(state);
				return;
			case 1405:
				method253(state);
				return;
			case 1406:
				detailget_vsync(state);
				return;
			case 1407:
				detailget_lightdetail_high(state);
				return;
			case 1408:
				autosetup_setmedium(state);
				return;
			case 1409:
				if_setobject_nonum(state);
				return;
			case 1410:
				chatcat_getphrase(state);
				return;
			case 1411:
				ignore_setnotes(state);
				return;
			case 1412:
				get_npc_stat(state);
				return;
			case 1413:
				cc_clearscripthooks(state);
				return;
			case 1414:
				userdetail_quickchat(state);
				return;
			case 1415:
				userdetail_lobby_loyalty_balance(state);
				return;
			case 1416:
				tostring_localised(state);
				return;
			case 1417:
				cc_setparam_int(state);
				return;
			case 1418:
				cam_moveto(state);
				return;
			case 1419:
				branch_equals(state);
				return;
			case 1420:
				friend_setrank(state);
				return;
			case 1421:
				detailcanset_grounddecor(state);
				return;
			case 1422:
				cam2_setspringproperties(state);
				return;
			case 1423:
				get_second_minimenu_entry(state);
				return;
			case 1424:
				detailget_hardshadows(state);
				return;
			case 1425:
				detailget_loginvol(state);
				return;
			case 1426:
				cam2_setlookatspline_spline(state);
				return;
			case 1427:
				inv_stockbase(state);
				return;
			case 1428:
				TwitchCommands.ttv_livestreams_getstream_start(state);
				return;
			case 1429:
				lobby_leavelobby(state);
				return;
			case 1430:
				cam_modeisfollowplayer(state);
				return;
			case 1431:
				cc_getparentlayer(state);
		}
	}

	@ObfuscatedName("ahd.a(Lyf;B)V")
	public static final void push_constant_int(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.intOperands[arg0.pc];
	}

	@ObfuscatedName("pu.g(Lyf;B)V")
	public static final void push_var(ClientScriptState arg0) {
		VarType var1 = (VarType) arg0.script.objectOperands[arg0.pc];
		VarDomain var2 = (VarDomain) (arg0.intOperands[arg0.pc] == 0 ? arg0.primaryVars.get(var1.domain) : arg0.secondaryVars.get(var1.domain));
		BaseVarType var3 = var1.dataType.getVarBaseType();
		if (BaseVarType.INTEGER == var3) {
			arg0.intStack[++arg0.isp - 1] = var2.getVarValueInt(var1);
		} else if (BaseVarType.LONG == var3) {
			arg0.longStack[++arg0.lsp - 1] = var2.getVarValueLong(var1);
		} else if (BaseVarType.STRING == var3) {
			try {
				String var4 = (String) var2.getVarValue(var1);
				if (var4 == null) {
					var4 = "null";
				}
				arg0.objectStack[++arg0.osp - 1] = var4;
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
		VarType var1 = (VarType) arg0.script.objectOperands[arg0.pc];
		VarDomain var2 = (VarDomain) (arg0.intOperands[arg0.pc] == 0 ? arg0.primaryVars.get(var1.domain) : arg0.secondaryVars.get(var1.domain));
		BaseVarType var3 = var1.dataType.getVarBaseType();
		if (BaseVarType.INTEGER == var3) {
			if (VarDomainType.CLIENT == var1.domain) {
				DelayedStateChange.onVarC(var1);
			}
			var2.setVarValueInt(var1, arg0.intStack[--arg0.isp]);
		} else if (BaseVarType.LONG == var3) {
			var2.setVarValueLong(var1, arg0.longStack[--arg0.lsp]);
		} else if (BaseVarType.STRING == var3) {
			if (VarDomainType.CLIENT == var1.domain) {
				DelayedStateChange.onVarClientStr(var1);
			}
			var2.setVarValue(var1, arg0.objectStack[--arg0.osp]);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nj.j(Lyf;I)V")
	public static final void push_constant_string(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = arg0.script.objectOperands[arg0.pc];
	}

	@ObfuscatedName("zz.t(Lyf;I)V")
	public static final void branch(ClientScriptState arg0) {
		arg0.pc += arg0.intOperands[arg0.pc];
	}

	@ObfuscatedName("ie.ae(Lyf;B)V")
	public static final void branch_not(ClientScriptState arg0) {
		arg0.isp -= 2;
		if (arg0.intStack[arg0.isp] != arg0.intStack[arg0.isp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("acv.ag(Lyf;I)V")
	public static final void branch_equals(ClientScriptState arg0) {
		arg0.isp -= 2;
		if (arg0.intStack[arg0.isp] == arg0.intStack[arg0.isp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("vo.ah(Lyf;I)V")
	public static final void branch_less_than(ClientScriptState arg0) {
		arg0.isp -= 2;
		if (arg0.intStack[arg0.isp] < arg0.intStack[arg0.isp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("qn.al(Lyf;S)V")
	public static final void branch_greater_than(ClientScriptState arg0) {
		arg0.isp -= 2;
		if (arg0.intStack[arg0.isp] > arg0.intStack[arg0.isp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("vr.ac(Lyf;B)V")
	public static final void _return(ClientScriptState state) {
		if (state.fp == 0) {
			return;
		}
		ScriptFrame frame = state.frames[--state.fp];
		state.script = frame.script;
		state.instructions = state.script.instructions;
		state.intOperands = state.script.intOperands;
		state.pc = frame.pc;
		state.intLocals = frame.intLocals;
		state.objectLocals = frame.objectLocals;
		state.longLocals = frame.longLocals;
	}

	@ObfuscatedName("xt.ai(Lyf;B)V")
	public static final void push_varbit(ClientScriptState arg0) {
		VarBitType var1 = (VarBitType) arg0.script.objectOperands[arg0.pc];
		VarDomain var2 = (VarDomain) (arg0.intOperands[arg0.pc] == 0 ? arg0.primaryVars.get(var1.baseVar.domain) : arg0.secondaryVars.get(var1.baseVar.domain));
		arg0.intStack[++arg0.isp - 1] = var2.getVarBitValue(var1);
	}

	@ObfuscatedName("ace.aw(Lyf;I)V")
	public static final void pop_varbit(ClientScriptState arg0) throws VarBitOverflowException {
		VarBitType var1 = (VarBitType) arg0.script.objectOperands[arg0.pc];
		VarDomain var2 = (VarDomain) (arg0.intOperands[arg0.pc] == 0 ? arg0.primaryVars.get(var1.baseVar.domain) : arg0.secondaryVars.get(var1.baseVar.domain));
		try {
			var2.setVarbitValue(var1, arg0.intStack[--arg0.isp]);
		} catch (VarBitOverflowException var4) {
			if (!(var2 instanceof VarPlayerDomain)) {
				throw var4;
			}
			error(arg0, ClientScriptCommand.POP_VARBIT, var4, "VO");
		}
	}

	@ObfuscatedName("ng.as(Lyf;I)V")
	public static final void branch_less_than_or_equals(ClientScriptState arg0) {
		arg0.isp -= 2;
		if (arg0.intStack[arg0.isp] <= arg0.intStack[arg0.isp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("gh.at(Lyf;I)V")
	public static final void branch_greater_than_or_equals(ClientScriptState arg0) {
		arg0.isp -= 2;
		if (arg0.intStack[arg0.isp] >= arg0.intStack[arg0.isp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("aat.ad(Lyf;I)V")
	public static final void push_int_local(ClientScriptState state) {
		state.intStack[++state.isp - 1] = state.intLocals[state.intOperands[state.pc]];
	}

	@ObfuscatedName("dr.am(Lyf;B)V")
	public static final void pop_int_local(ClientScriptState arg0) {
		arg0.intLocals[arg0.intOperands[arg0.pc]] = arg0.intStack[--arg0.isp];
	}

	@ObfuscatedName("er.au(Lyf;I)V")
	public static final void push_string_local(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = arg0.objectLocals[arg0.intOperands[arg0.pc]];
	}

	@ObfuscatedName("hw.ar(Lyf;B)V")
	public static final void pop_string_local(ClientScriptState arg0) {
		arg0.objectLocals[arg0.intOperands[arg0.pc]] = arg0.objectStack[--arg0.osp];
	}

	@ObfuscatedName("ea.ap(Lyf;B)V")
	public static final void join_string(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		arg0.osp -= var1;
		String var2 = StringTools.method9007(arg0.objectStack, arg0.osp, var1);
		arg0.objectStack[++arg0.osp - 1] = var2;
	}

	@ObfuscatedName("xh.aq(Lyf;B)V")
	public static final void pop_int_discard(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("wi.ax(Lyf;I)V")
	public static final void pop_string_discard(ClientScriptState arg0) {
		arg0.osp--;
	}

	@ObfuscatedName("amy.av(Lyf;I)V")
	public static final void gosub_with_params(ClientScriptState state) {
		int scriptId = state.intOperands[state.pc];
		ClientScript script = ClientScriptHelpers.getScript(scriptId);
		if (script == null) {
			throw new RuntimeException();
		}
		int[] intLocals = new int[script.intLocalCount];
		Object[] objectLocals = new Object[script.objectLocalCount];
		long[] longLocals = new long[script.longLocalCount];
		for (int index = 0; index < script.intArgCount; index++) {
			intLocals[index] = state.intStack[state.isp - script.intArgCount + index];
		}
		for (int index = 0; index < script.objectArgCount; index++) {
			objectLocals[index] = state.objectStack[state.osp - script.objectArgCount + index];
		}
		for (int index = 0; index < script.longArgCount; index++) {
			longLocals[index] = state.longStack[state.lsp - script.longArgCount + index];
		}
		state.isp -= script.intArgCount;
		state.osp -= script.objectArgCount;
		state.lsp -= script.longArgCount;
		ScriptFrame frame = new ScriptFrame();
		frame.script = state.script;
		frame.pc = state.pc;
		frame.intLocals = state.intLocals;
		frame.objectLocals = state.objectLocals;
		frame.longLocals = state.longLocals;
		if (state.fp >= state.frames.length) {
			throw new RuntimeException();
		}
		state.frames[++state.fp - 1] = frame;
		state.script = script;
		state.instructions = state.script.instructions;
		state.intOperands = state.script.intOperands;
		state.pc = -1;
		state.intLocals = intLocals;
		state.objectLocals = objectLocals;
		state.longLocals = longLocals;
	}

	@ObfuscatedName("ef.ao(Lyf;B)V")
	public static final void define_array(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc] >> 16;
		int var2 = arg0.intOperands[arg0.pc] & 0xFFFF;
		int var3 = arg0.intStack[--arg0.isp];
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
		int var3 = arg0.intOperands[arg0.pc];
		int var4 = arg0.intStack[--arg0.isp];
		if (var4 < 0 || var4 >= arg0.field8214[var3]) {
			throw new RuntimeException();
		} else if (!arg1) {
			arg0.intStack[++arg0.isp - 1] = arg0.field8215[var3][var4];
		} else if (arg2) {
			arg0.intStack[++arg0.isp - 1] = arg0.field8215[var3][var4];
			arg0.intStack[++arg0.isp - 1] = var4;
		} else {
			arg0.intStack[++arg0.isp - 1] = var4;
			arg0.intStack[++arg0.isp - 1] = arg0.field8215[var3][var4];
		}
	}

	@ObfuscatedName("ho.ay(Lyf;ZI)V")
	public static final void pop_array(ClientScriptState arg0, boolean arg1) {
		int var2 = arg0.intOperands[arg0.pc];
		arg0.isp -= 2;
		int var3 = arg0.intStack[arg0.isp];
		int var4 = arg0.intStack[arg0.isp + 1];
		if (var3 < 0 || var3 >= arg0.field8214[var2]) {
			throw new RuntimeException();
		}
		arg0.field8215[var2][var3] = var4;
		if (arg1) {
			arg0.intStack[++arg0.isp - 1] = var4;
		}
	}

	@ObfuscatedName("agj.ab(Lyf;I)V")
	public static final void _switch(ClientScriptState arg0) {
		HashTable var1 = arg0.script.switchTables[arg0.intOperands[arg0.pc]];
		IntNode var2 = (IntNode) var1.get((long) arg0.intStack[--arg0.isp]);
		if (var2 != null) {
			arg0.pc += var2.value;
		}
	}

	@ObfuscatedName("o.az(Lyf;B)V")
	public static final void push_long_constant(ClientScriptState arg0) {
		arg0.longStack[++arg0.lsp - 1] = (Long) arg0.script.objectOperands[arg0.pc];
	}

	@ObfuscatedName("fg.aa(Lyf;I)V")
	public static final void pop_long_discard(ClientScriptState arg0) {
		arg0.lsp--;
	}

	@ObfuscatedName("el.af(Lyf;B)V")
	public static final void push_long_local(ClientScriptState arg0) {
		arg0.longStack[++arg0.lsp - 1] = arg0.longLocals[arg0.intOperands[arg0.pc]];
	}

	@ObfuscatedName("xd.ak(Lyf;B)V")
	public static final void pop_long_local(ClientScriptState arg0) {
		arg0.longLocals[arg0.intOperands[arg0.pc]] = arg0.longStack[--arg0.lsp];
	}

	@ObfuscatedName("xj.an(Lyf;B)V")
	public static final void long_branch_not(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] != arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("kw.bf(Lyf;B)V")
	public static final void long_branch_equals(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] == arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("ajc.bl(Lyf;I)V")
	public static final void long_branch_less_than(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] < arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("qy.bk(Lyf;B)V")
	public static final void long_branch_greater_than(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] > arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("ue.bh(Lyf;B)V")
	public static final void long_branch_less_than_or_equals(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] <= arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("nk.bx(Lyf;I)V")
	public static final void long_branch_greater_than_or_equals(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] >= arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("aiv.bd(Lyf;I)V")
	public static final void branch_if_true(ClientScriptState arg0) {
		if (arg0.intStack[--arg0.isp] == 1) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("nr.bc(Lyf;I)V")
	public static final void branch_if_false(ClientScriptState arg0) {
		if (arg0.intStack[--arg0.isp] == 0) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("qx.bi(Lyf;I)V")
	public static final void cc_create(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		Component.get(var1);
		cc_create_inner(Component.interfaces[var1 >>> 16], var1 & 0xFFFF, var2, var3, arg0.secondary, arg0);
	}

	@ObfuscatedName("iy.bn(Lyf;B)V")
	public static final void cc_delete(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		if (var1.com.id != -1) {
			Component var2 = var1.method13790();
			var2.subcomponents[var1.com.id] = null;
			Client.requestRedrawComponent(var2);
		} else if (arg0.secondary) {
			throw new RuntimeException("Tried to .cc_delete static .active-component!");
		} else {
			throw new RuntimeException("Tried to cc_delete static active-component!");
		}
	}

	@ObfuscatedName("ab.bt(Lyf;I)V")
	public static final void cc_deleteall(ClientScriptState arg0) {
		Component var1 = Component.get(arg0.intStack[--arg0.isp]);
		var1.subcomponents = null;
		var1.sortedsubcomponents = null;
		Client.requestRedrawComponent(var1);
	}

	@ObfuscatedName("y.bq(Lyf;I)V")
	public static final void cc_find(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ActiveComponent var3;
		if (arg0.secondary) {
			var3 = arg0.activeComponent2;
		} else {
			var3 = arg0.activeComponent;
		}
		arg0.intStack[++arg0.isp - 1] = var2 != -1 && var3.method13787(var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("wu.bm(Lyf;I)V")
	public static final void if_find(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ActiveComponent var2;
		if (arg0.secondary) {
			var2 = arg0.activeComponent2;
		} else {
			var2 = arg0.activeComponent;
		}
		arg0.intStack[++arg0.isp - 1] = var2.method13787(var1, -1) ? 1 : 0;
	}

	@ObfuscatedName("qe.bb(ZLyf;B)V")
	public static final void if_sendto(boolean arg0, ClientScriptState arg1) {
		int var2 = arg1.intStack[--arg1.isp];
		Component var3 = Component.get(var2);
		Interface var4 = Component.interfaces[var2 >> 16];
		if (arg0) {
			cc_if_sendtofront(var4, var3);
		} else {
			cc_if_sendtoback(var4, var3);
		}
	}

	@ObfuscatedName("jd.be(ZLyf;I)V")
	public static final void cc_sendto(boolean arg0, ClientScriptState arg1) {
		ActiveComponent var2 = arg1.secondary ? arg1.activeComponent2 : arg1.activeComponent;
		Component var3 = var2.com;
		Interface var4 = var2.itf;
		if (arg0) {
			cc_if_sendtofront(var4, var3);
		} else {
			cc_if_sendtoback(var4, var3);
		}
	}

	@ObfuscatedName("wc.by(Lyf;I)V")
	public static final void if_resume_pausebutton(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_resume_pausebutton(var2, arg0);
	}

	@ObfuscatedName("nl.bu(Lyf;I)V")
	public static final void cc_resume_pausebutton(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_resume_pausebutton(var2, arg0);
	}

	@ObfuscatedName("tp.bw(Lhf;Lyf;I)V")
	public static final void cc_if_resume_pausebutton(Component arg0, ClientScriptState arg1) {
		if (Client.method17197(arg0).method17689() && Client.pressedContinueOption == null) {
			Client.method612(arg0.parentlayer, arg0.id);
			Client.pressedContinueOption = Component.method16682(arg0.parentlayer, arg0.id);
			Client.requestRedrawComponent(Client.pressedContinueOption);
		}
	}

	@ObfuscatedName("aqc.bo(Lyf;I)V")
	public static final void baseidkit(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Client.localPlayerEntity.model == null) {
			return;
		}
		for (int var3 = 0; var3 < IDKType.field2951.length; var3++) {
			if (IDKType.field2951[var3] == var1) {
				Client.localPlayerEntity.model.setIDKPart(var3, var2, Client.idkTypeList);
				return;
			}
		}
		for (int var4 = 0; var4 < IDKType.field2959.length; var4++) {
			if (IDKType.field2959[var4] == var1) {
				Client.localPlayerEntity.model.setIDKPart(var4, var2, Client.idkTypeList);
				return;
			}
		}
	}

	@ObfuscatedName("wm.bz(Lyf;I)V")
	public static final void basecolour(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Client.localPlayerEntity.model != null) {
			Client.localPlayerEntity.model.setIDKRecolourSlot(var1, var2);
		}
	}

	@ObfuscatedName("we.bv(Lyf;B)V")
	public static final void basematerial(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Client.localPlayerEntity.model != null) {
			Client.localPlayerEntity.model.setIDKRematerialSlot(var1, var2);
		}
	}

	@ObfuscatedName("ul.br(Lyf;I)V")
	public static final void setgender(ClientScriptState arg0) {
		boolean var1 = arg0.intStack[--arg0.isp] != 0;
		if (Client.localPlayerEntity.model != null) {
			Client.localPlayerEntity.model.setGender(var1);
		}
	}

	@ObfuscatedName("ik.bg(Lyf;S)V")
	public static final void setobj(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Client.localPlayerEntity.model != null) {
			Client.localPlayerEntity.model.setObject(var1, var2, Client.objTypeList);
		}
	}

	@ObfuscatedName("kw.ba(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setposition(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 4;
		arg0.xpos = arg2.intStack[arg2.isp];
		arg0.ypos = arg2.intStack[arg2.isp + 1];
		int var3 = arg2.intStack[arg2.isp + 2];
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 5) {
			var3 = 5;
		}
		int var4 = arg2.intStack[arg2.isp + 3];
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 5) {
			var4 = 5;
		}
		arg0.xmode = (byte) var3;
		arg0.ymode = (byte) var4;
		Client.requestRedrawComponent(arg0);
		Client.method2103(arg1, arg0);
		if (arg0.type == 0) {
			Client.method8329(arg1, arg0, false);
		}
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceDataXY(arg0.parentlayer);
		}
	}

	@ObfuscatedName("ig.bp(Lyf;B)V")
	public static final void if_setposition(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setposition(var2, var3, arg0);
	}

	@ObfuscatedName("sh.bj(Lyf;I)V")
	public static final void cc_setposition(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setposition(var2, var3, arg0);
	}

	@ObfuscatedName("ge.bs(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setsize(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 4;
		arg0.wsize = arg2.intStack[arg2.isp];
		arg0.hsize = arg2.intStack[arg2.isp + 1];
		arg0.modelobjwidth = 0;
		arg0.field2238 = 0;
		int var3 = arg2.intStack[arg2.isp + 2];
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 4) {
			var3 = 4;
		}
		int var4 = arg2.intStack[arg2.isp + 3];
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 4) {
			var4 = 4;
		}
		arg0.field2356 = (byte) var3;
		arg0.field2174 = (byte) var4;
		Client.requestRedrawComponent(arg0);
		Client.method2103(arg1, arg0);
		if (arg0.type == 0) {
			Client.method8329(arg1, arg0, false);
		}
	}

	@ObfuscatedName("aq.cl(Lyf;B)V")
	public static final void if_setsize(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setsize(var2, var3, arg0);
	}

	@ObfuscatedName("hp.cg(Lyf;I)V")
	public static final void cc_setsize(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setsize(var2, var3, arg0);
	}

	@ObfuscatedName("ju.ce(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_sethide(Component arg0, Interface arg1, ClientScriptState arg2) {
		boolean var3 = arg2.intStack[--arg2.isp] == 1;
		if (arg0.hide != var3) {
			arg0.hide = var3;
			Client.requestRedrawComponent(arg0);
		}
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceHide(arg0.parentlayer);
		}
	}

	@ObfuscatedName("km.cu(Lyf;S)V")
	public static final void if_sethide(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_sethide(var2, var3, arg0);
	}

	@ObfuscatedName("ea.ci(Lyf;I)V")
	public static final void cc_sethide(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_sethide(var2, var3, arg0);
	}

	@ObfuscatedName("rz.cn(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setaspect(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		arg0.aspectwidth = arg2.intStack[arg2.isp];
		arg0.aspectheight = arg2.intStack[arg2.isp + 1];
		Client.requestRedrawComponent(arg0);
		Client.method2103(arg1, arg0);
		if (arg0.type == 0) {
			Client.method8329(arg1, arg0, false);
		}
	}

	@ObfuscatedName("er.cv(Lyf;I)V")
	public static final void if_setaspect(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setaspect(var2, var3, arg0);
	}

	@ObfuscatedName("xt.cp(Lyf;I)V")
	public static final void cc_setaspect(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setaspect(var2, var3, arg0);
	}

	@ObfuscatedName("z.ca(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setnoclickthrough(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.noclickthrough = arg2.intStack[--arg2.isp] == 1;
	}

	@ObfuscatedName("au.cx(Lyf;B)V")
	public static final void if_setnoclickthrough(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setnoclickthrough(var2, var3, arg0);
	}

	@ObfuscatedName("qf.cw(Lyf;I)V")
	public static final void cc_setnoclickthrough(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setnoclickthrough(var2, var3, arg0);
	}

	@ObfuscatedName("any.ct(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setscrollpos(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		arg0.scrollx = arg2.intStack[arg2.isp];
		if (arg0.scrollx > arg0.scrollwidth - arg0.width) {
			arg0.scrollx = arg0.scrollwidth - arg0.width;
		}
		if (arg0.scrollx < 0) {
			arg0.scrollx = 0;
		}
		arg0.scrolly = arg2.intStack[arg2.isp + 1];
		if (arg0.scrolly > arg0.scrollheight - arg0.height) {
			arg0.scrolly = arg0.scrollheight - arg0.height;
		}
		if (arg0.scrolly < 0) {
			arg0.scrolly = 0;
		}
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceScrollYPos(arg0.parentlayer);
		}
	}

	@ObfuscatedName("jk.cf(Lyf;I)V")
	public static final void if_setscrollpos(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setscrollpos(var2, var3, arg0);
	}

	@ObfuscatedName("dg.co(Lyf;I)V")
	public static final void cc_setscrollpos(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setscrollpos(var2, var3, arg0);
	}

	@ObfuscatedName("mj.cr(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setcolour(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.colour = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceColour(arg0.parentlayer);
		}
	}

	@ObfuscatedName("aku.cm(Lyf;B)V")
	public static final void if_setcolour(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setcolour(var2, var3, arg0);
	}

	@ObfuscatedName("ir.cq(Lyf;I)V")
	public static final void cc_setcolour(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setcolour(var2, var3, arg0);
	}

	@ObfuscatedName("ch.ch(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setfill(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.fill = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("cq.cb(Lyf;I)V")
	public static final void if_setfill(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setfill(var2, var3, arg0);
	}

	@ObfuscatedName("ajd.cs(Lyf;I)V")
	public static final void cc_setfill(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setfill(var2, var3, arg0);
	}

	@ObfuscatedName("hx.cy(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_settrans(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.trans = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("ht.cc(Lyf;I)V")
	public static final void if_settrans(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settrans(var2, var3, arg0);
	}

	@ObfuscatedName("ky.cz(Lyf;I)V")
	public static final void cc_settrans(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settrans(var2, var3, arg0);
	}

	@ObfuscatedName("sv.ck(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setlinewid(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.linewid = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("iv.cj(Lyf;I)V")
	public static final void if_setlinewid(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setlinewid(var2, var3, arg0);
	}

	@ObfuscatedName("iw.cd(Lyf;I)V")
	public static final void cc_setlinewid(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setlinewid(var2, var3, arg0);
	}

	@ObfuscatedName("jx.dd(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setgraphic(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		arg0.invobject = -1;
		if (arg0.graphic != var3) {
			arg0.graphic = var3;
			Client.requestRedrawComponent(arg0);
		}
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceGraphic(arg0.parentlayer);
		}
	}

	@ObfuscatedName("ka.dr(Lyf;I)V")
	public static final void if_setgraphic(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setgraphic(var2, var3, arg0);
	}

	@ObfuscatedName("qk.da(Lyf;B)V")
	public static final void cc_setgraphic(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setgraphic(var2, var3, arg0);
	}

	@ObfuscatedName("dd.dt(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_set2dangle(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.angle2d = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("dc.do(Lyf;B)V")
	public static final void if_set2dangle(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_set2dangle(var2, var3, arg0);
	}

	@ObfuscatedName("nv.dz(Lyf;I)V")
	public static final void cc_set2dangle(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_set2dangle(var2, var3, arg0);
	}

	@ObfuscatedName("wq.dv(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settiling(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.tiling = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("amq.dm(Lyf;I)V")
	public static final void if_settiling(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settiling(var2, var3, arg0);
	}

	@ObfuscatedName("dy.dq(Lyf;I)V")
	public static final void cc_settiling(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settiling(var2, var3, arg0);
	}

	@ObfuscatedName("l.dc(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setmodel(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.modelkind = 1;
		arg0.model = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceModel(arg0.parentlayer);
		}
	}

	@ObfuscatedName("xv.di(Lyf;B)V")
	public static final void if_setmodel(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmodel(var2, var3, arg0);
	}

	@ObfuscatedName("ui.dk(Lyf;I)V")
	public static final void cc_setmodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmodel(var2, var3, arg0);
	}

	@ObfuscatedName("sd.dn(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmodelangle(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 6;
		arg0.modelxof = arg2.intStack[arg2.isp];
		arg0.modelyof = arg2.intStack[arg2.isp + 1];
		arg0.modelangle_x = arg2.intStack[arg2.isp + 2];
		arg0.modelangle_y = arg2.intStack[arg2.isp + 3];
		arg0.modelangle_z = arg2.intStack[arg2.isp + 4];
		arg0.modelzoom = arg2.intStack[arg2.isp + 5];
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceModelXAnYAnZoom(arg0.parentlayer);
			DelayedStateChange.onInterfaceModelXOfYOfZAn(arg0.parentlayer);
		}
	}

	@ObfuscatedName("xv.df(Lyf;I)V")
	public static final void if_setmodelangle(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmodelangle(var2, var3, arg0);
	}

	@ObfuscatedName("anv.dw(Lyf;I)V")
	public static final void cc_setmodelangle(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmodelangle(var2, var3, arg0);
	}

	@ObfuscatedName("yl.ds(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmodelanim(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		if (arg0.modelanim != var3) {
			if (var3 == -1) {
				arg0.modelAnimator = null;
			} else {
				if (arg0.modelAnimator == null) {
					arg0.modelAnimator = new InterfaceAnimationNode();
				}
				arg0.modelAnimator.method14362(var3);
			}
			arg0.modelanim = var3;
			Client.requestRedrawComponent(arg0);
		}
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceModelAnim(arg0.parentlayer);
		}
	}

	@ObfuscatedName("ajn.du(Lyf;B)V")
	public static final void if_setmodelanim(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmodelanim(var2, var3, arg0);
	}

	@ObfuscatedName("adn.dl(Lyf;I)V")
	public static final void cc_setmodelanim(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmodelanim(var2, var3, arg0);
	}

	@ObfuscatedName("db.dp(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setmodelorthog(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.modelorthog = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("agu.dy(Lyf;B)V")
	public static final void if_setmodelorthog(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmodelorthog(var2, var3, arg0);
	}

	@ObfuscatedName("ru.db(Lyf;I)V")
	public static final void cc_setmodelorthog(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmodelorthog(var2, var3, arg0);
	}

	@ObfuscatedName("dy.dh(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setmodeltint(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 4;
		arg0.tint_hue = arg2.intStack[arg2.isp];
		arg0.tint_saturation = arg2.intStack[arg2.isp + 1];
		arg0.tint_luminence = arg2.intStack[arg2.isp + 2];
		arg0.tint_weight = arg2.intStack[arg2.isp + 3];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("xc.dx(Lyf;B)V")
	public static final void if_setmodeltint(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmodeltint(var2, var3, arg0);
	}

	@ObfuscatedName("gq.dg(Lyf;I)V")
	public static final void cc_setmodeltint(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmodeltint(var2, var3, arg0);
	}

	@ObfuscatedName("adg.de(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmodellighting(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 10;
		arg0.customlighting = true;
		arg0.field2248 = Math.max(Math.min(arg2.intStack[arg2.isp], 2816), 0);
		arg0.field2251 = Math.max(Math.min(arg2.intStack[arg2.isp + 1], 2816), 0);
		arg0.field2255 = Math.max(Math.min(arg2.intStack[arg2.isp + 2], 2816), 0);
		int var3 = Math.max(Math.min(arg2.intStack[arg2.isp + 3], 255), 0);
		int var4 = Math.max(Math.min(arg2.intStack[arg2.isp + 4], 255), 0);
		int var5 = Math.max(Math.min(arg2.intStack[arg2.isp + 5], 255), 0);
		arg0.field2257 = var3 << 16 | var4 << 8 | var5;
		arg0.field2345 = arg2.intStack[arg2.isp + 6];
		arg0.field2252 = arg2.intStack[arg2.isp + 7];
		arg0.field2302 = arg2.intStack[arg2.isp + 8];
		arg0.field2258 = arg2.intStack[arg2.isp + 9];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("sd.dj(Lyf;B)V")
	public static final void if_setmodellighting(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmodellighting(var2, var3, arg0);
	}

	@ObfuscatedName("iq.eo(Lyf;I)V")
	public static final void cc_setmodellighting(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmodellighting(var2, var3, arg0);
	}

	@ObfuscatedName("gz.ey(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_resetmodellighting(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.customlighting = false;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("gr.eu(Lyf;I)V")
	public static final void if_resetmodellighting(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_resetmodellighting(var2, var3, arg0);
	}

	@ObfuscatedName("kj.ed(Lyf;I)V")
	public static final void cc_resetmodellighting(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_resetmodellighting(var2, var3, arg0);
	}

	@ObfuscatedName("fb.ee(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settext(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (!var3.equals(arg0.text)) {
			arg0.text = var3;
			Client.requestRedrawComponent(arg0);
		}
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceText(arg0.parentlayer);
		}
	}

	@ObfuscatedName("abo.es(Lyf;B)V")
	public static final void if_settext(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settext(var2, var3, arg0);
	}

	@ObfuscatedName("ef.ei(Lyf;B)V")
	public static final void cc_settext(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settext(var2, var3, arg0);
	}

	@ObfuscatedName("ft.el(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settextfont(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.textfont = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceFontType(arg0.parentlayer);
		}
	}

	@ObfuscatedName("gt.ej(Lyf;I)V")
	public static final void if_settextfont(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settextfont(var2, var3, arg0);
	}

	@ObfuscatedName("ana.ep(Lyf;B)V")
	public static final void cc_settextfont(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settextfont(var2, var3, arg0);
	}

	@ObfuscatedName("hn.ev(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settextalign(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 3;
		arg0.field2223 = arg2.intStack[arg2.isp];
		arg0.field2264 = arg2.intStack[arg2.isp + 1];
		arg0.field2229 = arg2.intStack[arg2.isp + 2];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("uo.ec(Lyf;I)V")
	public static final void if_settextalign(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settextalign(var2, var3, arg0);
	}

	@ObfuscatedName("dm.ek(Lyf;I)V")
	public static final void cc_settextalign(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settextalign(var2, var3, arg0);
	}

	@ObfuscatedName("yu.em(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settextshadow(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.textshadow = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("is.eh(Lyf;I)V")
	public static final void if_settextshadow(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settextshadow(var2, var3, arg0);
	}

	@ObfuscatedName("xh.eq(Lyf;S)V")
	public static final void cc_settextshadow(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settextshadow(var2, var3, arg0);
	}

	@ObfuscatedName("if.eg(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_settextantimacro(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.textantimacro = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceAntiTextMacro(arg0.parentlayer);
		}
	}

	@ObfuscatedName("xm.ez(Lyf;I)V")
	public static final void if_settextantimacro(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settextantimacro(var2, var3, arg0);
	}

	@ObfuscatedName("sx.ef(Lyf;I)V")
	public static final void cc_settextantimacro(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settextantimacro(var2, var3, arg0);
	}

	@ObfuscatedName("jq.et(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setoutline(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.outline = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("va.ea(Lyf;I)V")
	public static final void if_setoutline(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setoutline(var2, var3, arg0);
	}

	@ObfuscatedName("ax.ew(Lyf;I)V")
	public static final void cc_setoutline(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setoutline(var2, var3, arg0);
	}

	@ObfuscatedName("wq.er(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setgraphicshadow(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.graphicshadow = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("sj.en(Lyf;I)V")
	public static final void if_setgraphicshadow(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setgraphicshadow(var2, var3, arg0);
	}

	@ObfuscatedName("ka.eb(Lyf;I)V")
	public static final void cc_setgraphicshadow(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setgraphicshadow(var2, var3, arg0);
	}

	@ObfuscatedName("uf.ex(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setvflip(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.vflip = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("jv.fg(Lyf;I)V")
	public static final void if_setvflip(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setvflip(var2, var3, arg0);
	}

	@ObfuscatedName("ys.fm(Lyf;I)V")
	public static final void cc_setvflip(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setvflip(var2, var3, arg0);
	}

	@ObfuscatedName("dh.fu(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_sethflip(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.hflip = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("ib.fs(Lyf;B)V")
	public static final void if_sethflip(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_sethflip(var2, var3, arg0);
	}

	@ObfuscatedName("hs.fz(Lyf;I)V")
	public static final void cc_sethflip(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_sethflip(var2, var3, arg0);
	}

	@ObfuscatedName("tv.fj(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setscrollsize(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		arg0.scrollwidth = arg2.intStack[arg2.isp];
		arg0.scrollheight = arg2.intStack[arg2.isp + 1];
		Client.requestRedrawComponent(arg0);
		if (arg0.type == 0) {
			Client.method8329(arg1, arg0, false);
		}
	}

	@ObfuscatedName("nk.fd(Lyf;I)V")
	public static final void if_setscrollsize(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setscrollsize(var2, var3, arg0);
	}

	@ObfuscatedName("ry.fn(Lyf;I)V")
	public static final void cc_setscrollsize(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setscrollsize(var2, var3, arg0);
	}

	@ObfuscatedName("rm.fi(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setalpha(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.alpha = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("ky.ft(Lyf;I)V")
	public static final void if_setalpha(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setalpha(var2, var3, arg0);
	}

	@ObfuscatedName("ff.fx(Lyf;I)V")
	public static final void cc_setalpha(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setalpha(var2, var3, arg0);
	}

	@ObfuscatedName("fa.fv(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setmodelzoom(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.modelzoom = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceModelXAnYAnZoom(arg0.parentlayer);
		}
	}

	@ObfuscatedName("na.fc(Lyf;I)V")
	public static final void if_setmodelzoom(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmodelzoom(var2, var3, arg0);
	}

	@ObfuscatedName("ip.fw(Lyf;B)V")
	public static final void cc_setmodelzoom(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmodelzoom(var2, var3, arg0);
	}

	@ObfuscatedName("nz.fa(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setlinedirection(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		arg0.linedirection = var3 == 1;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("na.fp(Lyf;I)V")
	public static final void if_setlinedirection(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setlinedirection(var2, var3, arg0);
	}

	@ObfuscatedName("xn.fq(Lyf;I)V")
	public static final void cc_setlinedirection(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setlinedirection(var2, var3, arg0);
	}

	@ObfuscatedName("il.ff(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmodelorigin(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		arg0.modelorigin_x = arg2.intStack[arg2.isp];
		arg0.modelorigin_y = arg2.intStack[arg2.isp + 1];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("jr.fl(Lyf;I)V")
	public static final void if_setmodelorigin(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmodelorigin(var2, var3, arg0);
	}

	@ObfuscatedName("ip.fb(Lyf;I)V")
	public static final void cc_setmodelorigin(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmodelorigin(var2, var3, arg0);
	}

	@ObfuscatedName("d.fo(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setmaxlines(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.maxlines = arg2.intStack[--arg2.isp];
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("p.fy(Lyf;I)V")
	public static final void if_setmaxlines(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmaxlines(var2, var3, arg0);
	}

	@ObfuscatedName("aq.fe(Lyf;I)V")
	public static final void cc_setmaxlines(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmaxlines(var2, var3, arg0);
	}

	@ObfuscatedName("vx.fk(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setparam_int(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		int var3 = arg2.intStack[arg2.isp];
		int var4 = arg2.intStack[arg2.isp + 1];
		ParamType var5 = (ParamType) Client.paramTypeList.list(var3);
		if (var5.defaultint == var4) {
			arg0.method3954(var3);
		} else {
			arg0.method3952(var3, var4);
		}
	}

	@ObfuscatedName("fk.fh(Lyf;B)V")
	public static final void if_setparam_int(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setparam_int(var2, var3, arg0);
	}

	@ObfuscatedName("jd.fr(Lyf;I)V")
	public static final void cc_setparam_int(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setparam_int(var2, var3, arg0);
	}

	@ObfuscatedName("abh.gu(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setparam_string(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		String var4 = (String) arg2.objectStack[--arg2.osp];
		ParamType var5 = (ParamType) Client.paramTypeList.list(var3);
		if (var5.defaultstr.equals(var4)) {
			arg0.method3954(var3);
		} else {
			arg0.method4003(var3, var4);
		}
	}

	@ObfuscatedName("x.gq(Lyf;I)V")
	public static final void if_setparam_string(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setparam_string(var2, var3, arg0);
	}

	@ObfuscatedName("ts.gl(Lyf;B)V")
	public static final void cc_setparam_string(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setparam_string(var2, var3, arg0);
	}

	@ObfuscatedName("abc.go(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setrecol(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 3;
		int var3 = arg2.intStack[arg2.isp];
		short var4 = (short) arg2.intStack[arg2.isp + 1];
		short var5 = (short) arg2.intStack[arg2.isp + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.setrecol(var3, var4, var5);
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceRecol(arg0.parentlayer, var3);
		}
	}

	@ObfuscatedName("apn.gk(Lyf;I)V")
	public static final void if_setrecol(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setrecol(var2, var3, arg0);
	}

	@ObfuscatedName("aag.gp(Lyf;B)V")
	public static final void cc_setrecol(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setrecol(var2, var3, arg0);
	}

	@ObfuscatedName("aiu.gy(Lhf;Lhq;Lyf;I)V")
	public static final void if_setretex(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 3;
		int var3 = arg2.intStack[arg2.isp];
		short var4 = (short) arg2.intStack[arg2.isp + 1];
		short var5 = (short) arg2.intStack[arg2.isp + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.setretex(var3, var4, var5);
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceRetex(arg0.parentlayer, var3);
		}
	}

	@ObfuscatedName("jg.ga(Lyf;I)V")
	public static final void if_setretex(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		if_setretex(var2, var3, arg0);
	}

	@ObfuscatedName("jq.gn(Lyf;I)V")
	public static final void cc_setretex(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		if_setretex(var2, var3, arg0);
	}

	@ObfuscatedName("v.gc(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setfontmono(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.fontmono = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceFontMono(arg0.parentlayer);
		}
	}

	@ObfuscatedName("qw.gf(Lyf;I)V")
	public static final void if_setfontmono(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setfontmono(var2, var3, arg0);
	}

	@ObfuscatedName("w.gx(Lyf;S)V")
	public static final void cc_setfontmono(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setfontmono(var2, var3, arg0);
	}

	@ObfuscatedName("ae.ge(Lyf;I)V")
	public static final void cc_setparam(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.isp -= 2;
		int var3 = arg0.intStack[arg0.isp];
		int var4 = arg0.intStack[arg0.isp + 1];
		ParamType var5 = (ParamType) Client.paramTypeList.list(var3);
		if (var5.defaultint == var4) {
			var2.method3954(var3);
		} else {
			var2.method3952(var3, var4);
		}
	}

	@ObfuscatedName("abv.gg(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setclickmask(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.clickmask = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceClickMask(arg0.parentlayer);
		}
	}

	@ObfuscatedName("wv.gr(Lyf;I)V")
	public static final void if_setclickmask(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setclickmask(var2, var3, arg0);
	}

	@ObfuscatedName("tp.gs(Lyf;I)V")
	public static final void cc_setclickmask(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setclickmask(var2, var3, arg0);
	}

	@ObfuscatedName("jp.gt(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setheld(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.held = arg2.intStack[--arg2.isp] == 1;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("je.gh(Lyf;I)V")
	public static final void if_setheld(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setheld(var2, var3, arg0);
	}

	@ObfuscatedName("iq.gm(Lyf;I)V")
	public static final void cc_setheld(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setheld(var2, var3, arg0);
	}

	@ObfuscatedName("ws.gv(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setnpchead(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.modelkind = 2;
		arg0.customisation = null;
		arg0.model = arg2.intStack[--arg2.isp];
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceModel(arg0.parentlayer);
		}
	}

	@ObfuscatedName("qk.gj(Lyf;I)V")
	public static final void if_setnpchead(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setnpchead(var2, var3, arg0);
	}

	@ObfuscatedName("pb.gw(Lyf;B)V")
	public static final void cc_setnpchead(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setnpchead(var2, var3, arg0);
	}

	@ObfuscatedName("ge.gd(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setplayerhead_self(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.modelkind = 3;
		arg0.model = Client.currentPlayerUid;
		arg0.field2298 = 0;
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceModel(arg0.parentlayer);
		}
	}

	@ObfuscatedName("ja.gz(Lyf;I)V")
	public static final void if_setplayerhead_self(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setplayerhead_self(var2, var3, arg0);
	}

	@ObfuscatedName("uf.gb(Lyf;I)V")
	public static final void cc_setplayerhead_self(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setplayerhead_self(var2, var3, arg0);
	}

	@ObfuscatedName("aaj.gi(Lhf;Lhq;ZILyf;I)V")
	public static final void cc_if_setobject_data(Component arg0, Interface arg1, boolean arg2, int arg3, ClientScriptState arg4) {
		arg4.isp -= 2;
		int var5 = arg4.intStack[arg4.isp];
		int var6 = arg4.intStack[arg4.isp + 1];
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceLinkObjTypeCount(arg0.parentlayer);
			DelayedStateChange.onInterfaceModelXAnYAnZoom(arg0.parentlayer);
			DelayedStateChange.onInterfaceModelXOfYOfZAn(arg0.parentlayer);
		}
		if (var5 == -1) {
			arg0.modelkind = 1;
			arg0.model = -1;
			arg0.invobject = -1;
			return;
		}
		arg0.invobject = var5;
		arg0.invcount = var6;
		arg0.field2246 = arg2;
		ObjType var7 = (ObjType) Client.objTypeList.list(var5);
		arg0.modelangle_x = var7.xan2d;
		arg0.modelangle_y = var7.yan2d;
		arg0.modelangle_z = var7.zan2d;
		arg0.modelxof = var7.xof2d;
		arg0.modelyof = var7.yof2d;
		arg0.modelzoom = var7.zoom2d;
		arg0.field2241 = arg3;
		if (arg0.modelobjwidth > 0) {
			arg0.modelzoom = arg0.modelzoom * 32 / arg0.modelobjwidth;
		} else if (arg0.wsize > 0) {
			arg0.modelzoom = arg0.modelzoom * 32 / arg0.wsize;
		}
	}

	@ObfuscatedName("yl.hm(Lyf;B)V")
	public static final void if_setobject(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setobject_data(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("nd.ha(Lyf;I)V")
	public static final void cc_setobject(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setobject_data(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("po.hk(Lyf;I)V")
	public static final void if_setobject_nonum(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setobject_data(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("vi.hu(Lyf;I)V")
	public static final void cc_setobject_nonum(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setobject_data(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("qm.hb(Lyf;B)V")
	public static final void if_setobject_wearcol(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setobject_data(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("abt.hg(Lyf;B)V")
	public static final void cc_setobject_wearcol(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setobject_data(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("tg.hd(Lyf;I)V")
	public static final void if_setobject_wearcol_nonum(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setobject_data(var2, var3, true, 0, arg0);
	}

	@ObfuscatedName("agg.hx(Lyf;B)V")
	public static final void cc_setobject_wearcol_nonum(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setobject_data(var2, var3, true, 0, arg0);
	}

	@ObfuscatedName("je.hq(Lyf;I)V")
	public static final void if_setobject_alwaysnum(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setobject_data(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("kc.hf(Lyf;I)V")
	public static final void cc_setobject_alwaysnum(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setobject_data(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("agf.hr(Lyf;I)V")
	public static final void if_setobject_wearcol_alwaysnum(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setobject_data(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("xk.hs(Lyf;B)V")
	public static final void cc_setobject_wearcol_alwaysnum(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setobject_data(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("tx.hh(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setnpcmodel(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.modelkind = 6;
		arg0.customisation = null;
		arg0.model = arg2.intStack[--arg2.isp];
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceModel(arg0.parentlayer);
		}
	}

	@ObfuscatedName("nj.hp(Lyf;B)V")
	public static final void if_setnpcmodel(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setnpcmodel(var2, var3, arg0);
	}

	@ObfuscatedName("qz.hy(Lyf;B)V")
	public static final void cc_setnpcmodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setnpcmodel(var2, var3, arg0);
	}

	@ObfuscatedName("ty.he(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setplayermodel(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.modelkind = 5;
		arg0.model = arg2.intStack[--arg2.isp];
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceModel(arg0.parentlayer);
		}
	}

	@ObfuscatedName("acg.hn(Lyf;I)V")
	public static final void if_setplayermodel(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setplayermodel(var2, var3, arg0);
	}

	@ObfuscatedName("vs.hi(Lyf;I)V")
	public static final void cc_setplayermodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setplayermodel(var2, var3, arg0);
	}

	@ObfuscatedName("nz.hw(Lhf;Lhq;Lyf;Lhd;B)V")
	public static final void cc_if_setlink(Component arg0, Interface arg1, ClientScriptState arg2, GroupUserKind arg3) {
		int var4 = arg2.intStack[--arg2.isp];
		switch(arg3.index) {
			case 0:
				arg0.link = Client.currentPlayerGroup.doGetMember(var4).getDisplayName();
				break;
			case 1:
			case 4:
				arg0.link = arg2.activeClanChannel.channelUsers[var4].name;
				break;
			case 2:
				if (Client.friendsListState != 2 || var4 >= Client.friendsCount) {
					return;
				}
				arg0.link = Client.friends[var4].field606;
				break;
			case 3:
				arg0.link = ((PlayerGroupBanned) Client.currentPlayerGroup.getBanned().get(var4)).getDisplayName();
				break;
			case 5:
				if (Client.clanChatUsers != null && var4 < Client.clanChatUsers.length) {
					arg0.link = Client.clanChatUsers[var4].name;
				}
				break;
			default:
				throw new IllegalStateException();
		}
		arg0.groupKind = arg3;
	}

	@ObfuscatedName("jb.ht(Lyf;I)V")
	public static final void if_setlinkfriend(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setlink(var2, var3, arg0, GroupUserKind.field2136);
	}

	@ObfuscatedName("ve.hc(Lyf;B)V")
	public static final void cc_setlinkfriend(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setlink(var2, var3, arg0, GroupUserKind.field2136);
	}

	@ObfuscatedName("pr.ho(Lyf;I)V")
	public static final void if_setlinkfriendchat(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setlink(var2, var3, arg0, GroupUserKind.field2140);
	}

	@ObfuscatedName("aq.hj(Lyf;I)V")
	public static final void cc_setlinkfriendchat(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setlink(var2, var3, arg0, GroupUserKind.field2140);
	}

	@ObfuscatedName("ga.hv(Lyf;I)V")
	public static final void if_setlinkplayergroup(ClientScriptState arg0) {
		arg0.isp -= 2;
		boolean var1 = arg0.intStack[arg0.isp] == 1;
		int var2 = arg0.intStack[arg0.isp + 1];
		Component var3 = Component.get(var2);
		Interface var4 = Component.interfaces[var2 >> 16];
		cc_if_setlink(var3, var4, arg0, var1 ? GroupUserKind.field2138 : GroupUserKind.field2137);
	}

	@ObfuscatedName("uy.hz(Lyf;I)V")
	public static final void cc_setlinkplayergroup(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		boolean var4 = arg0.intStack[--arg0.isp] == 1;
		cc_if_setlink(var2, var3, arg0, var4 ? GroupUserKind.field2138 : GroupUserKind.field2137);
	}

	@ObfuscatedName("akr.ij(Lyf;I)V")
	public static final void if_setlinkactiveclanchannel(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setlink(var2, var3, arg0, Client.affinedClanChannel == arg0.activeClanChannel ? GroupUserKind.field2139 : GroupUserKind.field2135);
	}

	@ObfuscatedName("tv.io(Lyf;I)V")
	public static final void cc_setlinkactiveclanchannel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setlink(var2, var3, arg0, Client.affinedClanChannel == arg0.activeClanChannel ? GroupUserKind.field2139 : GroupUserKind.field2135);
	}

	@ObfuscatedName("bf.iq(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_resetlinkplayer(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.link = null;
		arg0.groupKind = null;
	}

	@ObfuscatedName("fp.ig(Lyf;B)V")
	public static final void if_resetlinkplayer(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_resetlinkplayer(var2, var3, arg0);
	}

	@ObfuscatedName("nu.iv(Lyf;I)V")
	public static final void cc_resetlinkplayer(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_resetlinkplayer(var2, var3, arg0);
	}

	@ObfuscatedName("age.ie(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setplayermodel_self(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.modelkind = 5;
		arg0.model = Client.currentPlayerUid;
		arg0.field2298 = 0;
		if (arg0.id == -1 && !arg1.field2150) {
			DelayedStateChange.onInterfaceModel(arg0.parentlayer);
		}
	}

	@ObfuscatedName("gb.iu(Lyf;I)V")
	public static final void if_setplayermodel_self(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setplayermodel_self(var2, var3, arg0);
	}

	@ObfuscatedName("w.in(Lyf;I)V")
	public static final void cc_setplayermodel_self(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setplayermodel_self(var2, var3, arg0);
	}

	@ObfuscatedName("n.ir(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setop(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp] - 1;
		if (var3 >= 0 && var3 <= 9) {
			arg0.setop(var3, (String) arg2.objectStack[--arg2.osp]);
		} else {
			arg2.osp--;
		}
	}

	@ObfuscatedName("vo.it(Lyf;I)V")
	public static final void if_setop(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setop(var2, var3, arg0);
	}

	@ObfuscatedName("abr.ix(Lyf;I)V")
	public static final void cc_setop(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setop(var2, var3, arg0);
	}

	@ObfuscatedName("g.is(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setdraggable(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		int var3 = arg2.intStack[arg2.isp];
		int var4 = arg2.intStack[arg2.isp + 1];
		if (var3 == -1 && var4 == -1) {
			arg0.draggable = null;
		} else {
			arg0.draggable = Component.method16682(var3, var4);
		}
	}

	@ObfuscatedName("vv.ib(Lyf;I)V")
	public static final void if_setdraggable(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setdraggable(var2, var3, arg0);
	}

	@ObfuscatedName("jd.il(Lyf;B)V")
	public static final void cc_setdraggable(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setdraggable(var2, var3, arg0);
	}

	@ObfuscatedName("gm.iw(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setdragrenderbehaviour(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		if (Component.field2234 == var3 || Component.field2301 == var3 || Component.field2157 == var3 || Component.field2266 == var3) {
			arg0.dragrenderbehaviour = var3;
		}
	}

	@ObfuscatedName("sc.ip(Lyf;I)V")
	public static final void if_setdragrenderbehaviour(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setdragrenderbehaviour(var2, var3, arg0);
	}

	@ObfuscatedName("pv.id(Lyf;I)V")
	public static final void cc_setdragrenderbehaviour(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setdragrenderbehaviour(var2, var3, arg0);
	}

	@ObfuscatedName("vm.ia(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setdragdeadzone(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.dragdeadzone = arg2.intStack[--arg2.isp];
	}

	@ObfuscatedName("ud.if(Lyf;B)V")
	public static final void if_setdragdeadzone(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setdragdeadzone(var2, var3, arg0);
	}

	@ObfuscatedName("hi.ih(Lyf;I)V")
	public static final void cc_setdragdeadzone(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setdragdeadzone(var2, var3, arg0);
	}

	@ObfuscatedName("db.iy(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setdragdeadtime(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.dragdeadtime = arg2.intStack[--arg2.isp];
	}

	@ObfuscatedName("ii.ii(Lyf;B)V")
	public static final void if_setdragdeadtime(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setdragdeadtime(var2, var3, arg0);
	}

	@ObfuscatedName("fb.iz(Lyf;B)V")
	public static final void cc_setdragdeadtime(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setdragdeadtime(var2, var3, arg0);
	}

	@ObfuscatedName("ev.ik(Lyf;I)V")
	public static final void method2775(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("hg.im(Lyf;I)V")
	public static final void method3911(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("hh.ic(Lyf;I)V")
	public static final void method4048(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("vu.jd(Lyf;B)V")
	public static final void cc_setswipeunknown2(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("vh.jf(Lyf;B)V")
	public static final void if_setswipedeadtime(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("pp.ju(Lyf;I)V")
	public static final void cc_setswipedeadtime(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("au.jy(Lyf;I)V")
	public static final void if_setswipedeadzone(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("tg.jl(Lyf;I)V")
	public static final void cc_setswipedeadzone(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("vh.jn(Lyf;B)V")
	public static final void if_setswipeflags(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("iu.je(Lyf;I)V")
	public static final void cc_setswipeflags(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("il.jb(Lyf;B)V")
	public static final void if_addswipeflags(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("vz.jm(Lyf;B)V")
	public static final void cc_addswipeflags(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("ajo.jw(Lyf;I)V")
	public static final void if_delswipeflags(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("wo.jr(Lyf;B)V")
	public static final void cc_delswipeflags(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("aky.js(Lyf;I)V")
	public static final void if_setpinchflags(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("fa.ji(Lyf;I)V")
	public static final void cc_setpinchflags(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("ju.jt(Lyf;I)V")
	public static final void if_addpinchflags(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("nh.jq(Lyf;B)V")
	public static final void cc_addpinchflags(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("vv.jv(Lyf;I)V")
	public static final void if_delpinchflags(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("fd.ja(Lyf;I)V")
	public static final void cc_delpinchflags(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("qs.jj(Lyf;B)V")
	public static final void if_setpinchdeadzone(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("ty.jo(Lyf;I)V")
	public static final void cc_setpinchdeadzone(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("ff.jz(Lyf;I)V")
	public static final void if_setsubtractinsets(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("pf.jc(Lyf;S)V")
	public static final void cc_setsubtractinsets(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("hz.jg(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setopbase(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.opbase = (String) arg2.objectStack[--arg2.osp];
	}

	@ObfuscatedName("ie.jx(Lyf;I)V")
	public static final void if_setopbase(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setopbase(var2, var3, arg0);
	}

	@ObfuscatedName("db.jh(Lyf;I)V")
	public static final void cc_setopbase(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setopbase(var2, var3, arg0);
	}

	@ObfuscatedName("ahd.jp(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settargetverb(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.targetverb = (String) arg2.objectStack[--arg2.osp];
	}

	@ObfuscatedName("abr.jk(Lyf;I)V")
	public static final void if_settargetverb(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settargetverb(var2, var3, arg0);
	}

	@ObfuscatedName("hy.kw(Lyf;I)V")
	public static final void cc_settargetverb(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settargetverb(var2, var3, arg0);
	}

	@ObfuscatedName("mj.kz(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_clearops(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.op = null;
	}

	@ObfuscatedName("kh.ke(Lyf;I)V")
	public static final void if_clearops(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_clearops(var2, var3, arg0);
	}

	@ObfuscatedName("ig.kq(Lyf;I)V")
	public static final void cc_clearops(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_clearops(var2, var3, arg0);
	}

	@ObfuscatedName("fr.kg(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_settargetcursors(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.field2269 = arg2.intStack[--arg2.isp];
		arg0.field2202 = arg2.intStack[--arg2.isp];
	}

	@ObfuscatedName("e.ku(Lyf;I)V")
	public static final void if_settargetcursors(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settargetcursors(var2, var3, arg0);
	}

	@ObfuscatedName("pk.ko(Lyf;B)V")
	public static final void cc_settargetcursors(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settargetcursors(var2, var3, arg0);
	}

	@ObfuscatedName("aj.kf(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setopcursor(Component arg0, Interface arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		int var4 = arg2.intStack[--arg2.isp];
		if (var4 >= 1 && var4 <= 10) {
			arg0.setopcursor(var4 - 1, var3);
		}
	}

	@ObfuscatedName("el.kx(Lyf;S)V")
	public static final void if_setopcursor(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setopcursor(var2, var3, arg0);
	}

	@ObfuscatedName("af.ki(Lyf;I)V")
	public static final void cc_setopcursor(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setopcursor(var2, var3, arg0);
	}

	@ObfuscatedName("aba.ks(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setpausetext(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.pausetext = (String) arg2.objectStack[--arg2.osp];
	}

	@ObfuscatedName("ke.kh(Lyf;I)V")
	public static final void if_setpausetext(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setpausetext(var2, var3, arg0);
	}

	@ObfuscatedName("vv.ka(Lyf;B)V")
	public static final void cc_setpausetext(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setpausetext(var2, var3, arg0);
	}

	@ObfuscatedName("abh.kl(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_settargetopcursor(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.targetopcursor = arg2.intStack[--arg2.isp];
	}

	@ObfuscatedName("agu.kb(Lyf;I)V")
	public static final void if_settargetopcursor(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_settargetopcursor(var2, var3, arg0);
	}

	@ObfuscatedName("ake.kr(Lyf;I)V")
	public static final void cc_settargetopcursor(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_settargetopcursor(var2, var3, arg0);
	}

	@ObfuscatedName("su.kd(Lhf;IILyf;I)V")
	public static final void cc_if_setopchar(Component arg0, int arg1, int arg2, ClientScriptState arg3) {
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
		arg1.isp -= 2;
		int var2 = arg1.intStack[arg1.isp] - 1;
		int var3 = arg1.intStack[arg1.isp + 1];
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		cc_if_setopchar(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("jl.kj(Lyf;I)V")
	public static final void if_setopchar(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_setopchar(var2, arg0);
	}

	@ObfuscatedName("xb.kn(Lyf;S)V")
	public static final void cc_setopchar(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_setopchar(var2, arg0);
	}

	@ObfuscatedName("ag.kp(Lhf;Lyf;I)V")
	public static final void cc_if_setoptchar(Component arg0, ClientScriptState arg1) {
		byte var2 = 10;
		int var3 = arg1.intStack[--arg1.isp];
		cc_if_setopchar(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("ux.km(Lyf;I)V")
	public static final void if_setoptchar(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_setoptchar(var2, arg0);
	}

	@ObfuscatedName("gk.ky(Lyf;B)V")
	public static final void cc_setoptchar(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
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
		int var4 = arg3.intStack[--arg3.isp] - 1;
		if (var4 < 0 || var4 > 9) {
			throw new RuntimeException();
		}
		cc_if_setopkey(arg0, var4, arg1, arg2, arg3);
	}

	@ObfuscatedName("b.kt(Lyf;I)V")
	public static final void if_setopkey(ClientScriptState arg0) {
		arg0.isp -= 3;
		byte[] var1 = new byte[] { (byte) arg0.intStack[arg0.isp] };
		byte[] var2 = new byte[] { (byte) arg0.intStack[arg0.isp + 1] };
		int var3 = arg0.intStack[arg0.isp + 2];
		Component var4 = Component.get(var3);
		method5380(var4, var1, var2, arg0);
	}

	@ObfuscatedName("uu.li(Lyf;B)V")
	public static final void cc_setopkey(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.isp -= 10;
		byte[] var3 = null;
		byte[] var4 = null;
		int var5;
		for (var5 = 0; var5 < 10 && arg0.intStack[arg0.isp + var5] >= 0; var5 += 2) {
		}
		if (var5 > 0) {
			var3 = new byte[var5 / 2];
			var4 = new byte[var5 / 2];
			for (var5 -= 2; var5 >= 0; var5 -= 2) {
				var3[var5 / 2] = (byte) arg0.intStack[arg0.isp + var5];
				var4[var5 / 2] = (byte) arg0.intStack[arg0.isp + var5 + 1];
			}
		}
		method5380(var2, var3, var4, arg0);
	}

	@ObfuscatedName("cq.lv(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setoptkey(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		byte var3 = 10;
		byte[] var4 = new byte[] { (byte) arg2.intStack[arg2.isp] };
		byte[] var5 = new byte[] { (byte) arg2.intStack[arg2.isp + 1] };
		cc_if_setopkey(arg0, var3, var4, var5, arg2);
	}

	@ObfuscatedName("yx.la(Lyf;I)V")
	public static final void if_setoptkey(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setoptkey(var2, var3, arg0);
	}

	@ObfuscatedName("gm.lp(Lyf;I)V")
	public static final void cc_setoptkey(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setoptkey(var2, var3, arg0);
	}

	@ObfuscatedName("qp.lc(Lhf;IIILyf;S)V")
	public static final void cc_if_setopkeyrate(Component arg0, int arg1, int arg2, int arg3, ClientScriptState arg4) {
		if (arg0.field2211 == null) {
			throw new RuntimeException();
		}
		arg0.field2211[arg1] = arg2;
		arg0.field2273[arg1] = arg3;
	}

	@ObfuscatedName("n.lf(Lhf;Lyf;I)V")
	public static final void cc_if_setopkeyrate(Component arg0, ClientScriptState arg1) {
		arg1.isp -= 3;
		int var2 = arg1.intStack[arg1.isp] - 1;
		int var3 = arg1.intStack[arg1.isp + 1];
		int var4 = arg1.intStack[arg1.isp + 2];
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		cc_if_setopkeyrate(arg0, var2, var3, var4, arg1);
	}

	@ObfuscatedName("ww.lm(Lyf;I)V")
	public static final void if_setopkeyrate(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_setopkeyrate(var2, arg0);
	}

	@ObfuscatedName("ua.ll(Lyf;I)V")
	public static final void cc_setopkeyrate(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_setopkeyrate(var2, arg0);
	}

	@ObfuscatedName("fz.lb(Lhf;Lyf;I)V")
	public static final void cc_if_setoptkeyrate(Component arg0, ClientScriptState arg1) {
		byte var2 = 10;
		int var3 = arg1.intStack[--arg1.isp];
		int var4 = arg1.intStack[--arg1.isp];
		cc_if_setopkeyrate(arg0, var2, var3, var4, arg1);
	}

	@ObfuscatedName("yx.le(Lyf;B)V")
	public static final void if_setoptkeyrate(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_setoptkeyrate(var2, arg0);
	}

	@ObfuscatedName("fj.lr(Lyf;I)V")
	public static final void cc_setoptkeyrate(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_setoptkeyrate(var2, arg0);
	}

	@ObfuscatedName("is.lq(Lhf;ILyf;I)V")
	public static final void cc_if_setopkeyignoreheld(Component arg0, int arg1, ClientScriptState arg2) {
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
		arg1.isp--;
		int var2 = arg1.intStack[arg1.isp] - 1;
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		cc_if_setopkeyignoreheld(arg0, var2, arg1);
	}

	@ObfuscatedName("iw.lh(Lyf;I)V")
	public static final void if_setopkeyignoreheld(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_setopkeyignoreheld(var2, arg0);
	}

	@ObfuscatedName("pp.ls(Lyf;I)V")
	public static final void cc_setopkeyignoreheld(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_setopkeyignoreheld(var2, arg0);
	}

	@ObfuscatedName("hj.lu(Lhf;Lyf;I)V")
	public static final void cc_if_setoptkeyignoreheld(Component arg0, ClientScriptState arg1) {
		byte var2 = 10;
		cc_if_setopkeyignoreheld(arg0, var2, arg1);
	}

	@ObfuscatedName("ku.ly(Lyf;B)V")
	public static final void if_setoptkeyignoreheld(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_setoptkeyignoreheld(var2, arg0);
	}

	@ObfuscatedName("gl.lg(Lyf;I)V")
	public static final void cc_setoptkeyignoreheld(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_setoptkeyignoreheld(var2, arg0);
	}

	@ObfuscatedName("xz.lx(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setmouseovercursor(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.mouseovercursor = arg2.intStack[--arg2.isp];
	}

	@ObfuscatedName("uw.lj(Lyf;I)V")
	public static final void if_setmouseovercursor(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setmouseovercursor(var2, var3, arg0);
	}

	@ObfuscatedName("u.lw(Lyf;I)V")
	public static final void cc_setmouseovercursor(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setmouseovercursor(var2, var3, arg0);
	}

	@ObfuscatedName("el.lz(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_clearscripthooks(Component arg0, Interface arg1, ClientScriptState arg2) {
		arg0.clearscripthooks();
	}

	@ObfuscatedName("aga.ln(Lyf;B)V")
	public static final void cc_clearscripthooks(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_clearscripthooks(var2, var3, arg0);
	}

	@ObfuscatedName("uo.lt(Lyf;B)V")
	public static final void if_clearscripthooks(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_clearscripthooks(var2, var3, arg0);
	}

	@ObfuscatedName("rl.ld(Ljava/lang/String;Lyf;I)[I")
	public static final int[] method7881(String arg0, ClientScriptState arg1) {
		int[] var2 = null;
		if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
			int var3 = arg1.intStack[--arg1.isp];
			if (var3 > 0) {
				var2 = new int[var3];
				while (var3-- > 0) {
					var2[var3] = arg1.intStack[--arg1.isp];
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
				var2[var3] = arg1.objectStack[--arg1.osp];
			} else if (arg0.charAt(var3 - 1) == 'l') {
				var2[var3] = Long.valueOf(arg1.longStack[--arg1.lsp]);
			} else {
				var2[var3] = Integer.valueOf(arg1.intStack[--arg1.isp]);
			}
		}
		int var4 = arg1.intStack[--arg1.isp];
		if (var4 == -1) {
			var2 = null;
		} else {
			var2[0] = Integer.valueOf(var4);
		}
		return var2;
	}

	@ObfuscatedName("vs.mf(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonclick(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onclick = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("ek.mh(Lyf;I)V")
	public static final void if_setonclick(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonclick(var2, var3, arg0);
	}

	@ObfuscatedName("gk.mx(Lyf;S)V")
	public static final void cc_setonclick(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonclick(var2, var3, arg0);
	}

	@ObfuscatedName("hf.mg(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonhold(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onhold = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("dm.me(Lyf;B)V")
	public static final void if_setonhold(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonhold(var2, var3, arg0);
	}

	@ObfuscatedName("a.mn(Lyf;B)V")
	public static final void cc_setonhold(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonhold(var2, var3, arg0);
	}

	@ObfuscatedName("uf.mv(Lhf;Lhq;Lyf;S)V")
	public static final void cc_if_setonrelease(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onrelease = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("ux.my(Lyf;I)V")
	public static final void if_setonrelease(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonrelease(var2, var3, arg0);
	}

	@ObfuscatedName("zl.md(Lyf;B)V")
	public static final void cc_setonrelease(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonrelease(var2, var3, arg0);
	}

	@ObfuscatedName("uz.mk(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonmouseover(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onmouseover = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("dd.mq(Lyf;B)V")
	public static final void if_setonmouseover(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonmouseover(var2, var3, arg0);
	}

	@ObfuscatedName("ap.ms(Lyf;I)V")
	public static final void cc_setonmouseover(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonmouseover(var2, var3, arg0);
	}

	@ObfuscatedName("ad.mp(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonmouseleave(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onmouseleave = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("fa.mo(Lyf;S)V")
	public static final void if_setonmouseleave(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonmouseleave(var2, var3, arg0);
	}

	@ObfuscatedName("zo.ml(Lyf;I)V")
	public static final void cc_setonmouseleave(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonmouseleave(var2, var3, arg0);
	}

	@ObfuscatedName("yv.mi(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setondrag(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.ondrag = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("ht.mr(Lyf;B)V")
	public static final void if_setondrag(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setondrag(var2, var3, arg0);
	}

	@ObfuscatedName("xg.mz(Lyf;B)V")
	public static final void cc_setondrag(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setondrag(var2, var3, arg0);
	}

	@ObfuscatedName("nd.mb(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setontargetleave(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.ontargetleave = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("sn.mu(Lyf;I)V")
	public static final void if_setontargetleave(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setontargetleave(var2, var3, arg0);
	}

	@ObfuscatedName("gr.mt(Lyf;I)V")
	public static final void cc_setontargetleave(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setontargetleave(var2, var3, arg0);
	}

	@ObfuscatedName("ahc.mc(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonvartransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onvartransmit = method552(var3, arg2);
		arg0.onvartransmitlist = var4;
		arg0.hashook = true;
	}

	@ObfuscatedName("gw.ma(Lyf;I)V")
	public static final void if_setonvartransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonvartransmit(var2, var3, arg0);
	}

	@ObfuscatedName("hw.mj(Lyf;B)V")
	public static final void cc_setonvartransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonvartransmit(var2, var3, arg0);
	}

	@ObfuscatedName("d.mw(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setontimer(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.ontimer = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("ea.mm(Lyf;B)V")
	public static final void if_setontimer(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setontimer(var2, var3, arg0);
	}

	@ObfuscatedName("yp.nd(Lyf;B)V")
	public static final void cc_setontimer(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setontimer(var2, var3, arg0);
	}

	@ObfuscatedName("jq.ne(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonop(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onop = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("tr.ny(Lyf;B)V")
	public static final void if_setonop(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonop(var2, var3, arg0);
	}

	@ObfuscatedName("vd.nm(Lyf;B)V")
	public static final void cc_setonop(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonop(var2, var3, arg0);
	}

	@ObfuscatedName("jw.nj(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setondragcomplete(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.ondragcomplete = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("ty.no(Lyf;I)V")
	public static final void if_setondragcomplete(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setondragcomplete(var2, var3, arg0);
	}

	@ObfuscatedName("ie.np(Lyf;B)V")
	public static final void cc_setondragcomplete(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setondragcomplete(var2, var3, arg0);
	}

	@ObfuscatedName("afp.na(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonverticalswipe(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("ac.ni(Lyf;I)V")
	public static final void if_setonverticalswipe(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonverticalswipe(var2, var3, arg0);
	}

	@ObfuscatedName("vz.nb(Lyf;B)V")
	public static final void cc_setonverticalswipe(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonverticalswipe(var2, var3, arg0);
	}

	@ObfuscatedName("kh.nw(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonhorizontalswipe(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("nd.nx(Lyf;I)V")
	public static final void if_setonhorizontalswipe(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonhorizontalswipe(var2, var3, arg0);
	}

	@ObfuscatedName("xu.nl(Lyf;I)V")
	public static final void cc_setonhorizontalswipe(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonhorizontalswipe(var2, var3, arg0);
	}

	@ObfuscatedName("vh.ng(Lhf;Lhq;Lyf;I)V")
	public static final void method9545(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.ondragcomplete = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("vb.nt(Lyf;B)V")
	public static final void method9271(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		method9545(var2, var3, arg0);
	}

	@ObfuscatedName("l.nn(Lyf;B)V")
	public static final void method253(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		method9545(var2, var3, arg0);
	}

	@ObfuscatedName("ji.nk(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonverticalpinch(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("ali.nq(Lyf;I)V")
	public static final void if_setonverticalpinch(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonverticalpinch(var2, var3, arg0);
	}

	@ObfuscatedName("tz.nr(Lyf;B)V")
	public static final void cc_setonverticalpinch(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonverticalpinch(var2, var3, arg0);
	}

	@ObfuscatedName("ar.nu(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonhorizontalpinch(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("z.nf(Lyf;B)V")
	public static final void if_setonhorizontalpinch(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonhorizontalpinch(var2, var3, arg0);
	}

	@ObfuscatedName("cs.nz(Lyf;B)V")
	public static final void cc_setonhorizontalpinch(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonhorizontalpinch(var2, var3, arg0);
	}

	@ObfuscatedName("xj.ns(Lhf;Lhq;Lyf;I)V")
	public static final void method10311(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("dv.nc(Lyf;S)V")
	public static final void method1921(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		method10311(var2, var3, arg0);
	}

	@ObfuscatedName("zm.nv(Lyf;I)V")
	public static final void method13982(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		method10311(var2, var3, arg0);
	}

	@ObfuscatedName("acq.nh(Lyf;I)V")
	public static final void window_getinsets(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = GameShell.canvasWid;
		arg0.intStack[++arg0.isp - 1] = GameShell.canvasHei;
	}

	@ObfuscatedName("yx.oh(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonclickrepeat(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onclickrepeat = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("agd.oo(Lyf;I)V")
	public static final void if_setonclickrepeat(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonclickrepeat(var2, var3, arg0);
	}

	@ObfuscatedName("ge.ol(Lyf;B)V")
	public static final void cc_setonclickrepeat(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonclickrepeat(var2, var3, arg0);
	}

	@ObfuscatedName("zq.oq(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonmouserepeat(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onmouserepeat = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("hs.oi(Lyf;S)V")
	public static final void if_setonmouserepeat(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonmouserepeat(var2, var3, arg0);
	}

	@ObfuscatedName("xz.ot(Lyf;I)V")
	public static final void cc_setonmouserepeat(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonmouserepeat(var2, var3, arg0);
	}

	@ObfuscatedName("pz.ow(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setoninvtransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.oninvtransmit = method552(var3, arg2);
		arg0.oninvtransmitlist = var4;
		arg0.hashook = true;
	}

	@ObfuscatedName("aco.oa(Lyf;B)V")
	public static final void if_setoninvtransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setoninvtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("aax.oz(Lyf;B)V")
	public static final void cc_setoninvtransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setoninvtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("re.ob(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonstattransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onstattransmit = method552(var3, arg2);
		arg0.onstattransmitlist = var4;
		arg0.hashook = true;
	}

	@ObfuscatedName("ch.op(Lyf;B)V")
	public static final void if_setonstattransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonstattransmit(var2, var3, arg0);
	}

	@ObfuscatedName("cz.om(Lyf;B)V")
	public static final void cc_setonstattransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonstattransmit(var2, var3, arg0);
	}

	@ObfuscatedName("wo.of(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setontargetenter(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.ontargetenter = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("rm.oy(Lyf;I)V")
	public static final void if_setontargetenter(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setontargetenter(var2, var3, arg0);
	}

	@ObfuscatedName("l.od(Lyf;I)V")
	public static final void cc_setontargetenter(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setontargetenter(var2, var3, arg0);
	}

	@ObfuscatedName("amq.on(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonscrollwheel(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onscrollwheel = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("kv.os(Lyf;I)V")
	public static final void if_setonscrollwheel(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonscrollwheel(var2, var3, arg0);
	}

	@ObfuscatedName("vf.og(Lyf;I)V")
	public static final void cc_setonscrollwheel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonscrollwheel(var2, var3, arg0);
	}

	@ObfuscatedName("ji.oj(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonchattransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onchattransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("qu.ok(Lyf;I)V")
	public static final void if_setonchattransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonchattransmit(var2, var3, arg0);
	}

	@ObfuscatedName("kp.ou(Lyf;I)V")
	public static final void cc_setonchattransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonchattransmit(var2, var3, arg0);
	}

	@ObfuscatedName("pp.oe(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonkey(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onkey = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("vh.ov(Lyf;I)V")
	public static final void if_setonkey(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonkey(var2, var3, arg0);
	}

	@ObfuscatedName("qh.oc(Lyf;I)V")
	public static final void cc_setonkey(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonkey(var2, var3, arg0);
	}

	@ObfuscatedName("iy.ox(Lyf;I)V")
	public static final void if_setongamepadbutton(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setongamepad(var2, var3, arg0);
	}

	@ObfuscatedName("tu.pt(Lyf;I)V")
	public static final void cc_setongamepadbutton(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setongamepad(var2, var3, arg0);
	}

	@ObfuscatedName("kr.pi(Lyf;I)V")
	public static final void if_setongamepadbuttonheld(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setongamepad(var2, var3, arg0);
	}

	@ObfuscatedName("yx.pq(Lyf;I)V")
	public static final void cc_setongamepadbuttonheld(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setongamepad(var2, var3, arg0);
	}

	@ObfuscatedName("aht.ph(Lyf;I)V")
	public static final void if_setongamepadaxis(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setongamepad(var2, var3, arg0);
	}

	@ObfuscatedName("acd.pe(Lyf;B)V")
	public static final void cc_setongamepadaxis(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setongamepad(var2, var3, arg0);
	}

	@ObfuscatedName("fp.pb(Lyf;I)V")
	public static final void if_setongamepadtrigger(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setongamepad(var2, var3, arg0);
	}

	@ObfuscatedName("aib.pw(Lyf;B)V")
	public static final void cc_setongamepadtrigger(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setongamepad(var2, var3, arg0);
	}

	@ObfuscatedName("bf.pk(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setongamepad(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		method552(var3, arg2);
	}

	@ObfuscatedName("et.pm(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonfriendtransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onfriendtransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("ss.pa(Lyf;B)V")
	public static final void if_setonfriendtransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonfriendtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("yo.pz(Lyf;B)V")
	public static final void cc_setonfriendtransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonfriendtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("ur.pd(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonclantransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onclantransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("r.pn(Lyf;I)V")
	public static final void if_setonclantransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonclantransmit(var2, var3, arg0);
	}

	@ObfuscatedName("qs.px(Lyf;I)V")
	public static final void cc_setonclantransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonclantransmit(var2, var3, arg0);
	}

	@ObfuscatedName("ib.ps(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonmisctransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onmisctransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("vn.pl(Lyf;I)V")
	public static final void if_setonmisctransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonmisctransmit(var2, var3, arg0);
	}

	@ObfuscatedName("hw.po(Lyf;B)V")
	public static final void cc_setonmisctransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonmisctransmit(var2, var3, arg0);
	}

	@ObfuscatedName("wu.pr(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setondialogabort(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.ondialogabort = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("kn.py(Lyf;I)V")
	public static final void if_setondialogabort(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setondialogabort(var2, var3, arg0);
	}

	@ObfuscatedName("nf.pg(Lyf;B)V")
	public static final void cc_setondialogabort(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setondialogabort(var2, var3, arg0);
	}

	@ObfuscatedName("aov.pv(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonsubchange(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onsubchange = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("ir.pj(Lyf;S)V")
	public static final void if_setonsubchange(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonsubchange(var2, var3, arg0);
	}

	@ObfuscatedName("d.pf(Lyf;I)V")
	public static final void cc_setonsubchange(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonsubchange(var2, var3, arg0);
	}

	@ObfuscatedName("aba.pp(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonstocktransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onstocktransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("dn.pu(Lyf;I)V")
	public static final void if_setonstocktransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonstocktransmit(var2, var3, arg0);
	}

	@ObfuscatedName("uk.pc(Lyf;B)V")
	public static final void cc_setonstocktransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonstocktransmit(var2, var3, arg0);
	}

	@ObfuscatedName("jr.qp(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setoncamfinished(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.oncamfinished = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("a.qx(Lyf;B)V")
	public static final void if_setoncamfinished(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setoncamfinished(var2, var3, arg0);
	}

	@ObfuscatedName("qz.qt(Lyf;I)V")
	public static final void cc_setoncamfinished(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setoncamfinished(var2, var3, arg0);
	}

	@ObfuscatedName("xn.qz(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonresize(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onresize = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("ny.qg(Lyf;I)V")
	public static final void if_setonresize(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonresize(var2, var3, arg0);
	}

	@ObfuscatedName("wy.qe(Lyf;I)V")
	public static final void cc_setonresize(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonresize(var2, var3, arg0);
	}

	@ObfuscatedName("zj.ql(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonvarctransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onvarctransmit = method552(var3, arg2);
		arg0.onvarctransmitlist = var4;
		arg0.hashook = true;
	}

	@ObfuscatedName("pn.qj(Lyf;B)V")
	public static final void if_setonvarctransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonvarctransmit(var2, var3, arg0);
	}

	@ObfuscatedName("jm.qr(Lyf;B)V")
	public static final void cc_setonvarctransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonvarctransmit(var2, var3, arg0);
	}

	@ObfuscatedName("tj.qc(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonvarcstrtransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		int[] var4 = method7881(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onvarcstrtransmit = method552(var3, arg2);
		arg0.onvarcstrtransmitlist = var4;
		arg0.hashook = true;
	}

	@ObfuscatedName("l.qd(Lyf;I)V")
	public static final void if_setonvarcstrtransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonvarcstrtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("anb.qi(Lyf;I)V")
	public static final void cc_setonvarcstrtransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonvarcstrtransmit(var2, var3, arg0);
	}

	@ObfuscatedName("ajk.qy(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonopt(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onopt = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("tu.qw(Lyf;I)V")
	public static final void if_setonopt(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonopt(var2, var3, arg0);
	}

	@ObfuscatedName("amb.qo(Lyf;B)V")
	public static final void cc_setonopt(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonopt(var2, var3, arg0);
	}

	@ObfuscatedName("ku.qm(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonclansettingstransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onclansettingstransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("acd.qq(Lyf;I)V")
	public static final void if_setonclansettingstransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonclansettingstransmit(var2, var3, arg0);
	}

	@ObfuscatedName("qd.qf(Lyf;I)V")
	public static final void cc_setonclansettingstransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonclansettingstransmit(var2, var3, arg0);
	}

	@ObfuscatedName("xt.qu(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonclanchanneltransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onclanchanneltransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("vj.qs(Lyf;B)V")
	public static final void if_setonclanchanneltransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonclanchanneltransmit(var2, var3, arg0);
	}

	@ObfuscatedName("yx.qa(Lyf;I)V")
	public static final void cc_setonclanchanneltransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonclanchanneltransmit(var2, var3, arg0);
	}

	@ObfuscatedName("acg.qh(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonvarclantransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onvarclantransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("fg.qv(Lyf;B)V")
	public static final void if_setonvarclantransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonvarclantransmit(var2, var3, arg0);
	}

	@ObfuscatedName("su.qk(Lyf;I)V")
	public static final void cc_setonvarclantransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonvarclantransmit(var2, var3, arg0);
	}

	@ObfuscatedName("ap.qn(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setonplayergrouptransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onplayergrouptransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("aej.qb(Lyf;B)V")
	public static final void if_setonplayergrouptransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonplayergrouptransmit(var2, var3, arg0);
	}

	@ObfuscatedName("io.rw(Lyf;I)V")
	public static final void cc_setonplayergrouptransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonplayergrouptransmit(var2, var3, arg0);
	}

	@ObfuscatedName("yo.rf(Lhf;Lhq;Lyf;I)V")
	public static final void cc_if_setonplayergroupvarptransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.onplayergroupvarptransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("v.rv(Lyf;B)V")
	public static final void if_setonplayergroupvarptransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setonplayergroupvarptransmit(var2, var3, arg0);
	}

	@ObfuscatedName("at.rh(Lyf;I)V")
	public static final void cc_setonplayergroupvarptransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setonplayergroupvarptransmit(var2, var3, arg0);
	}

	@ObfuscatedName("kd.ra(Lhf;Lhq;Lyf;B)V")
	public static final void cc_if_setoncameraupdatetransmit(Component arg0, Interface arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method7881(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.oncameraupdatetransmit = method552(var3, arg2);
		arg0.hashook = true;
	}

	@ObfuscatedName("kh.rx(Lyf;I)V")
	public static final void if_setoncameraupdatetransmit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >> 16];
		cc_if_setoncameraupdatetransmit(var2, var3, arg0);
	}

	@ObfuscatedName("gd.ry(Lyf;B)V")
	public static final void cc_setoncameraupdatetransmit(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		cc_if_setoncameraupdatetransmit(var2, var3, arg0);
	}

	@ObfuscatedName("fl.rg(Lyf;I)V")
	public static final void cc_getx(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.x;
	}

	@ObfuscatedName("vq.rz(Lyf;I)V")
	public static final void cc_gety(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.y;
	}

	@ObfuscatedName("aqc.re(Lyf;I)V")
	public static final void cc_getwidth(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.width;
	}

	@ObfuscatedName("fu.rt(Lyf;I)V")
	public static final void cc_getheight(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.height;
	}

	@ObfuscatedName("ac.rl(Lyf;B)V")
	public static final void cc_gethide(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.hide ? 1 : 0;
	}

	@ObfuscatedName("tb.rc(Lyf;B)V")
	public static final void cc_getlayer(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.layer;
	}

	@ObfuscatedName("ez.rr(Lyf;I)V")
	public static final void cc_getparentlayer(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		Interface var3 = var1.itf;
		Component var4 = Client.method6000(var3, var2);
		arg0.intStack[++arg0.isp - 1] = var4 == null ? -1 : var4.parentlayer;
	}

	@ObfuscatedName("sq.rd(Lyf;I)V")
	public static final void cc_getcolour(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.colour;
	}

	@ObfuscatedName("iy.rn(Lyf;I)V")
	public static final void cc_getscrollx(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.scrollx;
	}

	@ObfuscatedName("cy.rb(Lyf;I)V")
	public static final void cc_getscrolly(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.scrolly;
	}

	@ObfuscatedName("sh.ru(Lyf;I)V")
	public static final void cc_gettext(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.objectStack[++arg0.osp - 1] = var2.text;
	}

	@ObfuscatedName("tj.sv(Lyf;I)V")
	public static final void cc_getscrollwidth(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.scrollwidth;
	}

	@ObfuscatedName("xv.sw(Lyf;I)V")
	public static final void cc_getscrollheight(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.scrollheight;
	}

	@ObfuscatedName("nk.ss(Lyf;I)V")
	public static final void cc_getmodelzoom(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.modelzoom;
	}

	@ObfuscatedName("hi.sx(Lyf;I)V")
	public static final void cc_getmodelangle_x(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.modelangle_x;
	}

	@ObfuscatedName("ajd.sm(Lyf;B)V")
	public static final void cc_getmodelangle_z(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.modelangle_z;
	}

	@ObfuscatedName("zd.sk(Lyf;B)V")
	public static final void cc_getmodelangle_y(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.modelangle_y;
	}

	@ObfuscatedName("gc.si(Lyf;I)V")
	public static final void cc_gettrans(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.trans;
	}

	@ObfuscatedName("sf.se(Lyf;I)V")
	public static final void cc_getmodelxof(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.modelxof;
	}

	@ObfuscatedName("ns.sn(Lyf;I)V")
	public static final void cc_getmodelyof(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.modelyof;
	}

	@ObfuscatedName("dc.sr(Lyf;I)V")
	public static final void cc_getgraphic(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.graphic;
	}

	@ObfuscatedName("iw.sq(Lyf;I)V")
	public static final void cc_param(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		int var3 = arg0.intStack[--arg0.isp];
		ParamType var4 = (ParamType) Client.paramTypeList.list(var3);
		if (var4.isStringType()) {
			arg0.objectStack[++arg0.osp - 1] = var2.getParam(var3, var4.defaultstr);
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.getParam(var3, var4.defaultint);
		}
	}

	@ObfuscatedName("rb.sh(Lyf;I)V")
	public static final void cc_get2dangle(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.angle2d;
	}

	@ObfuscatedName("th.st(Lyf;I)V")
	public static final void cc_getmodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.modelkind == 1 ? var2.model : -1;
	}

	@ObfuscatedName("ace.sl(Lyf;I)V")
	public static final void cc_getfontgraphic(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.textfont;
	}

	@ObfuscatedName("ane.sp(Lyf;I)V")
	public static final void cc_getgraphicdimensions(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		int var3 = -1;
		int var4 = -1;
		Graphic var5 = var2.method3970(Client.toolkit);
		if (var5 != null) {
			var3 = var5.field2144;
			var4 = var5.field2146;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
		arg0.intStack[++arg0.isp - 1] = var4;
	}

	@ObfuscatedName("bc.su(Lyf;I)V")
	public static final void cc_getfontmetrics(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.textfont;
	}

	@ObfuscatedName("rm.sd(Lyf;S)V")
	public static final void cc_getinvobject(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.invobject;
	}

	@ObfuscatedName("va.sz(Lyf;I)V")
	public static final void cc_getinvcount(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		if (var2.invobject == -1) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.invcount;
		}
	}

	@ObfuscatedName("fw.sf(Lyf;B)V")
	public static final void cc_getid(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.id;
	}

	@ObfuscatedName("dd.sy(Lyf;B)V")
	public static final void cc_gettargetmask(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = Client.method17197(var2).method17691();
	}

	@ObfuscatedName("ww.sa(Lyf;B)V")
	public static final void cc_getop(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		int var3 = arg0.intStack[--arg0.isp];
		int var4 = var3 - 1;
		if (var2.op == null || var4 >= var2.op.length || var2.op[var4] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.op[var4];
		}
	}

	@ObfuscatedName("sf.sb(Lyf;I)V")
	public static final void cc_getopbase(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		if (var2.opbase == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.opbase;
		}
	}

	@ObfuscatedName("agy.sj(Lhf;Lyf;I)V")
	public static final void cc_if_callonresize(Component arg0, ClientScriptState arg1) {
		if (arg1.nestedCount >= 10) {
			throw new RuntimeException();
		} else if (arg0.onresize != null) {
			HookRequest var2 = new HookRequest();
			var2.component = arg0;
			var2.onop = arg0.onresize;
			var2.nestedCount = arg1.nestedCount + 1;
			Client.hookRequests.addTail(var2);
		}
	}

	@ObfuscatedName("ka.so(Lyf;B)V")
	public static final void if_callonresize(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_callonresize(var2, arg0);
	}

	@ObfuscatedName("sn.sc(Lyf;I)V")
	public static final void cc_callonresize(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_callonresize(var2, arg0);
	}

	@ObfuscatedName("pu.sg(Lhf;Lyf;I)V")
	public static final void cc_if_getcharindexatpos(Component arg0, ClientScriptState arg1) {
		FontMetrics var2 = arg0.method3943(Client.fontProvider, Client.fontFactory);
		int var3 = arg1.intStack[--arg1.isp];
		int var4 = arg1.intStack[--arg1.isp];
		int var5 = var2.getCharIndexAtPos(arg0.text, arg0.width, arg0.field2229, var4, var3, DefaultSprites.field10302);
		arg1.intStack[++arg1.isp - 1] = var5;
	}

	@ObfuscatedName("xh.tu(Lyf;I)V")
	public static final void if_getcharindexatpos(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_getcharindexatpos(var2, arg0);
	}

	@ObfuscatedName("ge.ta(Lyf;S)V")
	public static final void cc_getcharindexatpos(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_getcharindexatpos(var2, arg0);
	}

	@ObfuscatedName("dm.tr(Lhf;Lyf;B)V")
	public static final void cc_if_getcharposatindex(Component arg0, ClientScriptState arg1) {
		FontMetrics var2 = arg0.method3943(Client.fontProvider, Client.fontFactory);
		int var3 = arg1.intStack[--arg1.isp];
		Point var4 = var2.getCharPosAtIndex(arg0.text, arg0.width, arg0.field2229, var3, DefaultSprites.field10302);
		arg1.intStack[++arg1.isp - 1] = var4.x;
		arg1.intStack[++arg1.isp - 1] = var4.y;
	}

	@ObfuscatedName("wi.tc(Lyf;I)V")
	public static final void if_getcharposatindex(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_getcharposatindex(var2, arg0);
	}

	@ObfuscatedName("pp.tj(Lyf;I)V")
	public static final void cc_getcharposatindex(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_getcharposatindex(var2, arg0);
	}

	@ObfuscatedName("kt.te(B)J")
	public static final long method5390() {
		return (long) (++field8209 - 1) << 32 | 0xFFFFFFFFL;
	}

	@ObfuscatedName("mj.ti(Lhf;IIFIIIIIIB)V")
	public static void method5921(Component arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg0.customisation == null) {
			NPCType var10 = (NPCType) Client.npcTypeList.list(arg0.model);
			arg0.customisation = new NPCTypeCustomisation(var10, true);
		}
		arg0.customisation.field2688 = method5390();
		arg0.customisation.method4528(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("du.tm(Lhf;IIB)V")
	public static void method2088(Component arg0, int arg1, int arg2) {
		if (arg0.customisation == null) {
			NPCType var3 = (NPCType) Client.npcTypeList.list(arg0.model);
			arg0.customisation = new NPCTypeCustomisation(var3, false);
		}
		arg0.customisation.field2688 = method5390();
		arg0.customisation.method4529(arg1, arg2);
	}

	@ObfuscatedName("cc.ty(Lhf;Lyf;I)V")
	public static final void cc_if_npc_setcustombodymodel(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.intStack[--arg1.isp];
		int var3 = arg1.intStack[--arg1.isp] - 1;
		if (arg0.modelkind != 6) {
			throw new RuntimeException("");
		} else if (var3 >= 0 && var3 < 12) {
			method5921(arg0, var3, var2, 1.0F, 0, 0, 0, 0, 0, 0);
			Client.requestRedrawComponent(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ho.tb(Lyf;I)V")
	public static final void if_npc_setcustombodymodel(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_npc_setcustombodymodel(var2, arg0);
	}

	@ObfuscatedName("i.tn(Lyf;I)V")
	public static final void cc_npc_setcustombodymodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_npc_setcustombodymodel(var2, arg0);
	}

	@ObfuscatedName("wi.tw(Lhf;Lyf;B)V")
	public static final void cc_if_npc_setcustombodymodel_transformed(Component arg0, ClientScriptState arg1) {
		arg1.isp -= 10;
		int var2 = arg1.intStack[arg1.isp] - 1;
		int var3 = arg1.intStack[arg1.isp + 1];
		int var4 = arg1.intStack[arg1.isp + 2];
		int var5 = Math.max(1, arg1.intStack[arg1.isp + 3]);
		float var6 = (float) var4 / (float) var5;
		int var7 = arg1.intStack[arg1.isp + 4];
		int var8 = arg1.intStack[arg1.isp + 5];
		int var9 = arg1.intStack[arg1.isp + 6];
		int var10 = arg1.intStack[arg1.isp + 7];
		int var11 = arg1.intStack[arg1.isp + 8];
		int var12 = arg1.intStack[arg1.isp + 9];
		if (arg0.modelkind != 6) {
			throw new RuntimeException("");
		} else if (var2 >= 0 && var2 < 12) {
			method5921(arg0, var2, var3, var6, var7, var8, var9, var10, var11, var12);
			Client.requestRedrawComponent(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("yr.tz(Lyf;I)V")
	public static final void if_npc_setcustombodymodel_transformed(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_npc_setcustombodymodel_transformed(var2, arg0);
	}

	@ObfuscatedName("vc.tf(Lyf;I)V")
	public static final void cc_npc_setcustombodymodel_transformed(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_npc_setcustombodymodel_transformed(var2, arg0);
	}

	@ObfuscatedName("dm.th(Lhf;Lyf;B)V")
	public static final void cc_if_npc_setcustomheadmodel(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.intStack[--arg1.isp];
		int var3 = arg1.intStack[--arg1.isp] - 1;
		if (arg0.modelkind != 2) {
			throw new RuntimeException("");
		} else if (var3 >= 0 && var3 < 5) {
			method2088(arg0, var3, var2);
			Client.requestRedrawComponent(arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ii.tt(Lyf;I)V")
	public static final void if_npc_setcustomheadmodel(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_npc_setcustomheadmodel(var2, arg0);
	}

	@ObfuscatedName("hq.ts(Lyf;I)V")
	public static final void cc_npc_setcustomheadmodel(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_npc_setcustomheadmodel(var2, arg0);
	}

	@ObfuscatedName("aov.tp(Lhf;Lyf;S)V")
	public static final void cc_if_npc_setcustomrecol(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.intStack[--arg1.isp];
		int var3 = arg1.intStack[--arg1.isp] - 1;
		int var4 = var3;
		if (arg0.modelkind != 6 && arg0.modelkind != 2) {
			throw new RuntimeException("");
		}
		NPCType var5 = (NPCType) Client.npcTypeList.list(arg0.model);
		if (arg0.customisation == null) {
			arg0.customisation = new NPCTypeCustomisation(var5, arg0.modelkind == 6);
		}
		arg0.customisation.field2688 = method5390();
		if (var5.recolindices != null) {
			if (var3 < 0 || var3 >= var5.recolindices.length) {
				throw new RuntimeException("");
			}
			var4 = var5.recolindices[var3];
		}
		if (var5.recol_d == null || var4 < 0 || var4 >= var5.recol_d.length) {
			throw new RuntimeException("");
		}
		arg0.customisation.field2684[var4] = (short) var2;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("acr.tv(Lyf;I)V")
	public static final void if_npc_setcustomrecol(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_npc_setcustomrecol(var2, arg0);
	}

	@ObfuscatedName("kn.to(Lyf;I)V")
	public static final void cc_npc_setcustomrecol(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_npc_setcustomrecol(var2, arg0);
	}

	@ObfuscatedName("ajf.tg(Lhf;Lyf;I)V")
	public static final void cc_if_npc_setcustomretex(Component arg0, ClientScriptState arg1) {
		int var2 = arg1.intStack[--arg1.isp];
		int var3 = arg1.intStack[--arg1.isp] - 1;
		int var4 = var3;
		if (arg0.modelkind != 6 && arg0.modelkind != 2) {
			throw new RuntimeException("");
		}
		NPCType var5 = (NPCType) Client.npcTypeList.list(arg0.model);
		if (arg0.customisation == null) {
			arg0.customisation = new NPCTypeCustomisation(var5, arg0.modelkind == 6);
		}
		arg0.customisation.field2688 = method5390();
		if (var5.retexindices != null) {
			if (var3 < 0 || var3 >= var5.retexindices.length) {
				throw new RuntimeException("");
			}
			var4 = var5.retexindices[var3];
		}
		if (var5.retex_d == null || var4 < 0 || var4 >= var5.retex_d.length) {
			throw new RuntimeException("");
		}
		arg0.customisation.field2685[var4] = (short) var2;
		Client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("kh.tq(Lyf;B)V")
	public static final void if_npc_setcustomretex(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		cc_if_npc_setcustomretex(var2, arg0);
	}

	@ObfuscatedName("f.tx(Lyf;S)V")
	public static final void cc_npc_setcustomretex(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		cc_if_npc_setcustomretex(var2, arg0);
	}

	@ObfuscatedName("sy.tk(Lyf;I)V")
	public static final void if_getx(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.x;
	}

	@ObfuscatedName("as.tl(Lyf;S)V")
	public static final void if_gety(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.y;
	}

	@ObfuscatedName("hv.td(Lyf;I)V")
	public static final void if_getwidth(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.width;
	}

	@ObfuscatedName("vm.ul(Lyf;I)V")
	public static final void if_getheight(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.height;
	}

	@ObfuscatedName("wi.um(Lyf;I)V")
	public static final void if_gethide(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = Client.ifIsVisible(var2) ? 1 : 0;
	}

	@ObfuscatedName("ack.uq(Lyf;I)V")
	public static final void if_getlayer(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.layer;
	}

	@ObfuscatedName("wf.uc(Lyf;I)V")
	public static final void if_getparentlayer(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		Interface var3 = Component.interfaces[var1 >>> 16];
		Component var4 = Client.method6000(var3, var2);
		arg0.intStack[++arg0.isp - 1] = var4 == null ? -1 : var4.parentlayer;
	}

	@ObfuscatedName("ng.ui(Lyf;I)V")
	public static final void if_getcolour(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.colour;
	}

	@ObfuscatedName("q.ua(Lyf;B)V")
	public static final void if_getscrollx(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.scrollx;
	}

	@ObfuscatedName("ef.uf(Lyf;I)V")
	public static final void if_getscrolly(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.scrolly;
	}

	@ObfuscatedName("jv.ug(Lyf;I)V")
	public static final void if_getscrollwidth(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.scrollwidth;
	}

	@ObfuscatedName("ain.ub(Lyf;B)V")
	public static final void if_getscrollheight(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.scrollheight;
	}

	@ObfuscatedName("zt.uj(Lyf;S)V")
	public static final void if_getmodelzoom(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.modelzoom;
	}

	@ObfuscatedName("aat.ut(Lyf;S)V")
	public static final void if_getmodelangle_x(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.modelangle_x;
	}

	@ObfuscatedName("acp.uk(Lyf;B)V")
	public static final void if_getmodelangle_z(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.modelangle_z;
	}

	@ObfuscatedName("gv.uy(Lyf;B)V")
	public static final void if_getmodelangle_y(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.modelangle_y;
	}

	@ObfuscatedName("zt.uv(Lyf;I)V")
	public static final void if_gettrans(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.trans;
	}

	@ObfuscatedName("ar.uw(Lyf;I)V")
	public static final void if_getmodelxof(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.modelxof;
	}

	@ObfuscatedName("agy.up(Lyf;I)V")
	public static final void if_getmodelyof(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.modelyof;
	}

	@ObfuscatedName("cj.ud(Lyf;B)V")
	public static final void if_getgraphic(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.graphic;
	}

	@ObfuscatedName("dz.uz(Lyf;I)V")
	public static final void if_gettext(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.objectStack[++arg0.osp - 1] = var2.text;
	}

	@ObfuscatedName("po.uh(Lyf;I)V")
	public static final void if_get2dangle(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.angle2d;
	}

	@ObfuscatedName("kv.us(Lyf;I)V")
	public static final void if_getmodel(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.modelkind == 1 ? var2.model : -1;
	}

	@ObfuscatedName("iw.ux(Lyf;B)V")
	public static final void if_getfontgraphic(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.textfont;
	}

	@ObfuscatedName("ac.ur(Lyf;I)V")
	public static final void if_getgraphicdimensions(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		int var3 = -1;
		int var4 = -1;
		Graphic var5 = var2.method3970(Client.toolkit);
		if (var5 != null) {
			var3 = var5.field2144;
			var4 = var5.field2146;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
		arg0.intStack[++arg0.isp - 1] = var4;
	}

	@ObfuscatedName("vg.uu(Lyf;I)V")
	public static final void if_getfontmetrics(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = var2.textfont;
	}

	@ObfuscatedName("to.uo(Lyf;S)V")
	public static final void if_getinvobject(ClientScriptState arg0) {
		Component var1 = Component.get(arg0.intStack[--arg0.isp]);
		arg0.intStack[++arg0.isp - 1] = var1.invobject;
	}

	@ObfuscatedName("h.un(Lyf;I)V")
	public static final void if_getinvcount(ClientScriptState arg0) {
		Component var1 = Component.get(arg0.intStack[--arg0.isp]);
		if (var1.invobject == -1) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1.invcount;
		}
	}

	@ObfuscatedName("gz.ue(Lyf;B)V")
	public static final void if_hassub(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		SubInterface var2 = (SubInterface) Client.openedSubInterfaces.get((long) var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
		}
	}

	@ObfuscatedName("hp.vq(Lyf;I)V")
	public static final void if_getnextsubid(ClientScriptState arg0) {
		Component var1 = Component.get(arg0.intStack[--arg0.isp]);
		if (var1.subcomponents == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
			return;
		}
		int var2 = var1.subcomponents.length;
		for (int var3 = 0; var3 < var1.subcomponents.length; var3++) {
			if (var1.subcomponents[var3] == null) {
				var2 = var3;
				break;
			}
		}
		arg0.intStack[++arg0.isp - 1] = var2;
	}

	@ObfuscatedName("hy.vx(Lyf;I)V")
	public static final void if_hassubmodal_hassuboverlay(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		SubInterface var3 = (SubInterface) Client.openedSubInterfaces.get((long) var1);
		if (var3 != null && var3.field11571 == var2) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("jx.vb(Lyf;B)V")
	public static final void if_hassubmodal(ClientScriptState arg0) {
		if_hassubmodal_hassuboverlay(arg0);
	}

	@ObfuscatedName("vc.vl(Lyf;B)V")
	public static final void if_hassuboverlay(ClientScriptState arg0) {
		if_hassubmodal_hassuboverlay(arg0);
	}

	@ObfuscatedName("agk.vr(Lyf;I)V")
	public static final void if_gettargetmask(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		arg0.intStack[++arg0.isp - 1] = Client.method17197(var2).method17691();
	}

	@ObfuscatedName("va.vo(Lyf;I)V")
	public static final void if_getop(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		int var3 = arg0.intStack[--arg0.isp];
		int var4 = var3 - 1;
		if (var2.op == null || var4 >= var2.op.length || var2.op[var4] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.op[var4];
		}
	}

	@ObfuscatedName("fv.vv(Lyf;I)V")
	public static final void if_getopbase(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Component var2 = Component.get(var1);
		if (var2.opbase == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.opbase;
		}
	}

	@ObfuscatedName("kf.vw(Lyf;B)V")
	public static final void mes(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		ChatHistory.method4943(var1);
	}

	@ObfuscatedName("aau.vt(Lyf;I)V")
	public static final void if_close(ClientScriptState arg0) {
		Client.ifClose(true);
	}

	@ObfuscatedName("mz.vu(Lyf;B)V")
	public static final void resume_countdialog(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = 0;
		if (StringTools.method9836(var1)) {
			var2 = StringTools.parseInt(var1);
		}
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.RESUME_P_COUNTDIALOG, Client.gameConnection.randomOut);
		var3.buf.p4(var2);
		Client.gameConnection.queue(var3);
	}

	@ObfuscatedName("yj.vi(Lyf;I)V")
	public static final void resume_namedialog(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.RESUME_P_NAMEDIALOG, Client.gameConnection.randomOut);
		var2.buf.p1(var1.length() + 1);
		var2.buf.pjstr(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("qh.va(Lyf;I)V")
	public static final void resume_stringdialog(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.RESUME_P_STRINGDIALOG, Client.gameConnection.randomOut);
		var2.buf.p1(var1.length() + 1);
		var2.buf.pjstr(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("sq.vs(Lyf;I)V")
	public static final void abort_dialog(ClientScriptState arg0) {
		ClientMessage var1 = ClientMessage.createMessage(ClientProt.ABORT_P_DIALOG, Client.gameConnection.randomOut);
		Client.gameConnection.queue(var1);
	}

	@ObfuscatedName("ub.vy(Lyf;S)V")
	public static final void opplayer(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		Client.opplayer(var1, var2);
	}

	@ObfuscatedName("ge.ve(Lyf;I)V")
	public static final void if_dragpickup(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		Component var4 = Component.get(var3);
		Client.ifDragPickup(var4, var1, var2);
	}

	@ObfuscatedName("qe.vm(Lyf;I)V")
	public static final void cc_dragpickup(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ActiveComponent var3 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Client.ifDragPickup(var3.com, var1, var2);
	}

	@ObfuscatedName("na.vg(Lyf;B)V")
	public static final void resume_objdialog(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.RESUME_P_OBJDIALOG, Client.gameConnection.randomOut);
		var2.buf.p2(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("acb.vp(Lyf;S)V")
	public static final void if_opensubclient(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.ifOpenSub(var1, new SubInterface(var2, 3), null, true);
	}

	@ObfuscatedName("aar.vd(Lyf;S)V")
	public static final void if_closesubclient(ClientScriptState arg0) {
		arg0.isp--;
		int var1 = arg0.intStack[arg0.isp];
		SubInterface var2 = (SubInterface) Client.openedSubInterfaces.get((long) var1);
		if (var2 != null && var2.field11570 == 3) {
			Client.ifCloseSub(var2, true, true);
		}
	}

	@ObfuscatedName("hv.vh(Lyf;B)V")
	public static final void opplayert(ClientScriptState arg0) {
		Client.opplayert((String) arg0.objectStack[--arg0.osp]);
	}

	@ObfuscatedName("ah.vz(Lyf;I)V")
	public static final void mes_typed(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		String var3 = (String) arg0.objectStack[--arg0.osp];
		if (var1 == 99) {
			DeveloperConsole.addline(var3);
		} else if (var1 == 98) {
			DeveloperConsole.method722(var3);
		} else {
			ChatHistory.addMessage(var1, var2, "", "", "", var3, null);
		}
	}

	@ObfuscatedName("nk.vj(Lyf;B)V")
	public static final void setup_messagebox(ClientScriptState arg0) {
		arg0.isp -= 11;
		LoadingScreenAlignmentX[] var1 = LoadingScreenAlignmentX.method13948();
		LoadingScreenAlignmentY[] var2 = LoadingScreenAlignmentY.method2774();
		MessageBox.setup(var1[arg0.intStack[arg0.isp]], var2[arg0.intStack[arg0.isp + 1]], arg0.intStack[arg0.isp + 2], arg0.intStack[arg0.isp + 3], arg0.intStack[arg0.isp + 4], arg0.intStack[arg0.isp + 5], arg0.intStack[arg0.isp + 6], arg0.intStack[arg0.isp + 7], arg0.intStack[arg0.isp + 8], arg0.intStack[arg0.isp + 9], arg0.intStack[arg0.isp + 10]);
	}

	@ObfuscatedName("uv.vc(Lyf;I)V")
	public static final void resume_hsldialog(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.RESUME_P_HSLDIALOG, Client.gameConnection.randomOut);
		var2.buf.p2(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("qa.vn(Lyf;S)V")
	public static final void resume_clanforumqfcdialog(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.RESUME_P_CLANFORUMQFCDIALOG, Client.gameConnection.randomOut);
		var2.buf.p1(var1.length() + 1);
		var2.buf.pjstr(var1);
		Client.gameConnection.queue(var2);
	}

	@ObfuscatedName("qo.vf(Lyf;I)V")
	public static final void sound_synth(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		short var4 = 255;
		short var5 = 256;
		Client.audioApi.playSound(SoundType.field1828, var1, var2, var4, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("jf.vk(Lyf;I)V")
	public static final void sound_song(ClientScriptState arg0) {
		Client.audioApi.playSong(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("o.wn(Lyf;I)V")
	public static final void sound_jingle(ClientScriptState arg0) {
		arg0.isp -= 2;
		Client.audioApi.playSong(arg0.intStack[arg0.isp], 255);
	}

	@ObfuscatedName("e.wa(Lyf;I)V")
	public static final void sound_synth_volume(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		short var5 = 256;
		Client.audioApi.playSound(SoundType.field1828, var1, var2, var4, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("ahb.wo(Lyf;I)V")
	public static final void sound_song_volume(ClientScriptState arg0) {
		arg0.isp -= 3;
		Client.audioApi.playSong(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1]);
	}

	@ObfuscatedName("aj.wu(Lyf;I)V")
	public static final void sound_jingle_volume(ClientScriptState arg0) {
		arg0.isp -= 3;
		Client.audioApi.playSong(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 2]);
	}

	@ObfuscatedName("ev.wk(Lyf;I)V")
	public static final void sound_vorbis_volume(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		short var5 = 256;
		Client.audioApi.playSound(SoundType.field1828, var1, var2, var4, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("tg.wz(Lyf;B)V")
	public static final void sound_speech_volume(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		short var5 = 256;
		Client.audioApi.playSound(SoundType.field1828, var1, var2, var4, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("iq.wj(Lyf;I)V")
	public static final void sound_synth_rate(ClientScriptState arg0) {
		arg0.isp -= 5;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = arg0.intStack[arg0.isp + 4];
		Client.audioApi.playSound(SoundType.field1828, var1, var2, var4, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("ahp.we(Lyf;I)V")
	public static final void sound_vorbis_rate(ClientScriptState arg0) {
		arg0.isp -= 5;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = arg0.intStack[arg0.isp + 4];
		Client.audioApi.playSound(SoundType.field1828, var1, var2, var4, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, var3);
	}

	@ObfuscatedName("pw.wr(Lyf;I)V")
	public static final void sound_song_stop(ClientScriptState arg0) {
		Client.audioApi.stopSong();
	}

	@ObfuscatedName("sk.wl(Lyf;I)V")
	public static final void sound_vorbis_volume_rate_group(ClientScriptState arg0) {
		arg0.isp -= 6;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = arg0.intStack[arg0.isp + 4];
		int var6 = arg0.intStack[arg0.isp + 5];
		Sound var7 = Client.audioApi.createSound(SoundType.field1832, Client.audioApi, var1, var2, var4, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, var5, false);
		if (var7 != null) {
			Client.audioApi.method3251(var7, var6, var3);
		}
	}

	@ObfuscatedName("wb.wp(Lyf;I)V")
	public static final void sound_group_start(ClientScriptState arg0) {
		arg0.isp--;
		int var1 = arg0.intStack[arg0.isp];
		Client.audioApi.startGroup(var1);
	}

	@ObfuscatedName("hx.wv(Lyf;S)V")
	public static final void sound_group_stop(ClientScriptState arg0) {
		arg0.isp--;
		int var1 = arg0.intStack[arg0.isp];
		Client.audioApi.stopGroup(var1);
	}

	@ObfuscatedName("a.wg(Lyf;B)V")
	public static final void sound_mixbuss_add(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		Client.audioApi.addBuss(var1, var2, var3);
	}

	@ObfuscatedName("ge.wb(Lyf;I)V")
	public static final void sound_mixbuss_setlevel(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.audioApi.setMixBussLevel(var1, var2);
	}

	@ObfuscatedName("nv.wq(Lyf;B)V")
	public static final void sound_distancefocusfilter_setparams(ClientScriptState arg0) {
		arg0.isp -= 5;
	}

	@ObfuscatedName("ey.wm(Lyf;I)V")
	public static final void clientclock(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.loopCycle;
	}

	@ObfuscatedName("ru.wf(Lyf;S)V")
	public static final void inv_getobj(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.getObj(var1, var2, false);
	}

	@ObfuscatedName("alm.wc(Lyf;B)V")
	public static final void inv_getnum(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.getNum(var1, var2, false);
	}

	@ObfuscatedName("iz.wt(Lyf;I)V")
	public static final void inv_total(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.total(var1, var2, false);
	}

	@ObfuscatedName("tg.wx(Lyf;S)V")
	public static final void inv_totalcat(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.totalCat(var1, var2, false);
	}

	@ObfuscatedName("yc.wh(Lyf;I)V")
	public static final void inv_size(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ((InvType) Client.invTypeList.list(var1)).size;
	}

	@ObfuscatedName("su.wd(Lyf;I)V")
	public static final void inv_stockbase(ClientScriptState arg0) {
		arg0.isp -= 2;
		InvType var1 = (InvType) Client.invTypeList.list(arg0.intStack[arg0.isp]);
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = -1;
		for (int var4 = 0; var4 < var1.stockLength; var4++) {
			if (var1.stockobj[var4] == var2) {
				var3 = var1.stockcount[var4];
				break;
			}
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("jh.ww(Lyf;B)V")
	public static final void inv_getvar(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.getVar(var1, var2, var3, false);
	}

	@ObfuscatedName("nn.ws(Lyf;S)V")
	public static final void stat(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerGameState.getStatLevel(var1);
	}

	@ObfuscatedName("eb.wi(Lyf;I)V")
	public static final void stat_base(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerGameState.getStatLevelMax(var1);
	}

	@ObfuscatedName("xa.wy(Lyf;B)V")
	public static final void stat_visible_xp(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerGameState.getStatXP(var1);
	}

	@ObfuscatedName("xl.xm(Lyf;I)V")
	public static final void stat_base_actual(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerGameState.getStatLevelMaxActual(var1);
	}

	@ObfuscatedName("ze.xl(Lyf;I)V")
	public static final void stat_visible_xp_actual(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerGameState.getStatXPActual(var1);
	}

	@ObfuscatedName("afv.xy(Lyf;I)V")
	public static final void facing_fine(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerEntity.field10395.method316();
	}

	@ObfuscatedName("xr.xw(Lyf;S)V")
	public static final void coord(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerEntity.coord().pack();
	}

	@ObfuscatedName("gd.xu(Lyf;I)V")
	public static final void coordx(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = var1 >> 14 & 0x3FFF;
	}

	@ObfuscatedName("xk.xv(Lyf;I)V")
	public static final void coordy(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = var1 >> 28;
	}

	@ObfuscatedName("ain.xn(Lyf;I)V")
	public static final void coordz(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = var1 & 0x3FFF;
	}

	@ObfuscatedName("tg.xg(Lyf;B)V")
	public static final void coord_fine(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = Client.localPlayerEntity.coordFine();
	}

	@ObfuscatedName("yw.xa(Lyf;I)V")
	public static final void coordx_fine(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.objectStack[--arg0.osp];
		arg0.intStack[++arg0.isp - 1] = var1.x;
	}

	@ObfuscatedName("tk.xi(Lyf;I)V")
	public static final void coordy_fine(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.objectStack[--arg0.osp];
		arg0.intStack[++arg0.isp - 1] = var1.y;
	}

	@ObfuscatedName("abd.xz(Lyf;I)V")
	public static final void coordz_fine(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.objectStack[--arg0.osp];
		arg0.intStack[++arg0.isp - 1] = var1.z;
	}

	@ObfuscatedName("po.xh(Lyf;I)V")
	public static final void coordlevel_fine(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.objectStack[--arg0.osp];
		arg0.intStack[++arg0.isp - 1] = var1.level;
	}

	@ObfuscatedName("xk.xp(Lyf;I)V")
	public static final void movecoord_fine(ClientScriptState arg0) {
		CoordFine var1 = CoordFine.method7078((CoordFine) arg0.objectStack[--arg0.osp]);
		arg0.isp -= 4;
		var1.level += arg0.intStack[arg0.isp];
		var1.x += arg0.intStack[arg0.isp + 1];
		var1.y += arg0.intStack[arg0.isp + 2];
		var1.z += arg0.intStack[arg0.isp + 3];
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("h.xx(Lyf;I)V")
	public static final void coord_finetogrid(ClientScriptState arg0) {
		CoordGrid var1 = new CoordGrid();
		var1.fromFine((CoordFine) arg0.objectStack[--arg0.osp]);
		arg0.intStack[++arg0.isp - 1] = var1.pack();
	}

	@ObfuscatedName("rl.xs(Lyf;B)V")
	public static final void coord_gridtofine(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		arg0.objectStack[++arg0.osp - 1] = CoordFine.method849(var1, var2);
	}

	@ObfuscatedName("kh.xr(Lyf;I)V")
	public static final void map_members(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.loggedInMembers ? 1 : 0;
	}

	@ObfuscatedName("mc.xc(Lyf;I)V")
	public static final void map_preload(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("xd.xb(Lyf;B)V")
	public static final void map_loadedpercent(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 100;
	}

	@ObfuscatedName("ir.xe(Lyf;B)V")
	public static final void map_loadingscreen_settriggerpercent(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("nv.xd(Lyf;I)V")
	public static final void map_loadingscreen_isopen(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("bc.xj(Lyf;I)V")
	public static final void invother_getobj(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.getObj(var1, var2, true);
	}

	@ObfuscatedName("ahd.xo(Lyf;I)V")
	public static final void invother_getnum(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.getNum(var1, var2, true);
	}

	@ObfuscatedName("ul.xk(Lyf;I)V")
	public static final void invother_total(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.total(var1, var2, true);
	}

	@ObfuscatedName("iy.xq(Lyf;I)V")
	public static final void invother_getvar(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.getVar(var1, var2, var3, true);
	}

	@ObfuscatedName("pm.xf(Lyf;I)V")
	public static final void staffmodlevel(ClientScriptState arg0) {
		if (Client.staffModLevel >= 2) {
			arg0.intStack[++arg0.isp - 1] = Client.staffModLevel;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("iq.xt(Lyf;I)V")
	public static final void reboottimer(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.rebootTimer;
	}

	@ObfuscatedName("vp.ye(Lyf;I)V")
	public static final void map_world(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = WorldSwitcher.currentWorld.node;
	}

	@ObfuscatedName("zu.yo(Lyf;I)V")
	public static final void runenergy_visible(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.runEnergy;
	}

	@ObfuscatedName("xs.yj(Lyf;B)V")
	public static final void runweight_visible(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.runWeight;
	}

	@ObfuscatedName("qh.ys(Lyf;B)V")
	public static final void playermod(ClientScriptState arg0) {
		if (Client.playerModLevel >= 5 && Client.playerModLevel <= 9) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("amz.yk(Lyf;I)V")
	public static final void playermodlevel(ClientScriptState arg0) {
		if (Client.playerModLevel >= 5 && Client.playerModLevel <= 9) {
			arg0.intStack[++arg0.isp - 1] = Client.playerModLevel;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("rz.yn(Lyf;B)V")
	public static final void playermember(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.playerIsMembers ? 1 : 0;
	}

	@ObfuscatedName("fl.yg(Lyf;I)V")
	public static final void comlevel_active(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerEntity.combatLevel;
	}

	@ObfuscatedName("ux.yq(Lyf;I)V")
	public static final void gender(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerEntity.model != null && Client.localPlayerEntity.model.isFemale ? 1 : 0;
	}

	@ObfuscatedName("uh.yh(Lyf;I)V")
	public static final void map_quickchat(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.loggedInQuickChat ? 1 : 0;
	}

	@ObfuscatedName("hn.yb(Lyf;B)V")
	public static final void inv_freespace(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.freespace(var1, false);
	}

	@ObfuscatedName("vd.yp(Lyf;I)V")
	public static final void inv_totalparam(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.totalParam(var1, var2, false, false);
	}

	@ObfuscatedName("kl.yz(Lyf;B)V")
	public static final void inv_totalparam_stack(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = ClientInvCache.totalParam(var1, var2, true, false);
	}

	@ObfuscatedName("kg.yw(Lyf;I)V")
	public static final void map_lang(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.language.getId();
	}

	@ObfuscatedName("va.yx(Lyf;S)V")
	public static final void movecoord(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = (var2 << 14) + var1;
		int var6 = (var3 << 28) + var5;
		int var7 = var4 + var6;
		arg0.intStack[++arg0.isp - 1] = var7;
	}

	@ObfuscatedName("fr.yr(Lyf;B)V")
	public static final void affiliate(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.playerIsAffiliate;
	}

	@ObfuscatedName("uf.yl(Lyf;I)V")
	public static final void profile_cpu(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = CpuProfiling.profile();
	}

	@ObfuscatedName("sd.yi(Lyf;I)V")
	public static final void playerdemo(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("adp.yv(Lyf;I)V")
	public static final void applet_hasfocus(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = GameShell.focus ? 1 : 0;
	}

	@ObfuscatedName("ach.ym(Lyf;B)V")
	public static final void frombilling(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.fromBilling ? 1 : 0;
	}

	@ObfuscatedName("ank.yf(Lyf;B)V")
	public static final void get_mousex(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.mouse.getX();
	}

	@ObfuscatedName("dl.ya(Lyf;I)V")
	public static final void get_mousey(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.mouse.getY();
	}

	@ObfuscatedName("aks.yd(Lyf;I)V")
	public static final void get_active_minimenu_entry(ClientScriptState arg0) {
		pushMinimenuEntry(MiniMenu.getActiveMiniMenuEntry(), arg0);
	}

	@ObfuscatedName("oh.yy(Lyf;B)V")
	public static final void get_second_minimenu_entry(ClientScriptState arg0) {
		pushMinimenuEntry(MiniMenu.getSecondaryMiniMenuEntry(), arg0);
	}

	@ObfuscatedName("jk.yc(Lyf;B)V")
	public static final void get_minimenu_length(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = MiniMenu.field546;
		arg0.intStack[++arg0.isp - 1] = MiniMenu.field543;
	}

	@ObfuscatedName("ake.yu(Lyf;I)V")
	public static final void npc_find_active_minimenu_entry(ClientScriptState arg0) {
		MiniMenuEntry var1 = MiniMenu.getActiveMiniMenuEntry();
		if (MiniMenu.getEntryEntityType(var1) == 4) {
			ObjectNode var2 = (ObjectNode) Client.npcs.get(var1.method19370());
			if (var2 != null) {
				arg0.activeEntity = (PathingEntity) var2.value;
				arg0.intStack[++arg0.isp - 1] = 1;
				return;
			}
		}
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ai.yt(Lyf;I)V")
	public static final void player_find_active_minimenu_entry(ClientScriptState arg0) {
		MiniMenuEntry var1 = MiniMenu.getActiveMiniMenuEntry();
		if (MiniMenu.getEntryEntityType(var1) == 7) {
			int var2 = (int) var1.method19368();
			if (var2 >= 0 && var2 <= ReceivePlayerPositions.highResolutionsCount) {
				PlayerEntity var3 = Client.players[var2];
				if (var3 != null) {
					arg0.activeEntity = var3;
					arg0.intStack[++arg0.isp - 1] = 1;
					return;
				}
			}
		}
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("fj.zh(Lyf;I)V")
	public static final void get_currentcursor(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentCursor;
	}

	@ObfuscatedName("nu.za(Lyf;I)V")
	public static final void get_selfyangle(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerEntity.field10395.method316() >> 3;
	}

	@ObfuscatedName("ve.zn(Lyf;S)V")
	public static final void map_isowner(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (Client.owner != null && Client.owner.equalsIgnoreCase(var1)) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("sn.zt(Lyf;B)V")
	public static final void get_mousebuttons(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.mouse.method9101() ? 1 : 0;
		arg0.intStack[++arg0.isp - 1] = Client.mouse.method9121() ? 1 : 0;
		arg0.intStack[++arg0.isp - 1] = Client.mouse.method9125() ? 1 : 0;
	}

	@ObfuscatedName("qw.zy(Lyf;S)V")
	public static final void self_player_uid(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerUid;
	}

	@ObfuscatedName("dz.zi(Lyf;B)V")
	public static final void get_minimenu_target(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.targetModeActive ? 1 : 0;
		arg0.objectStack[++arg0.osp - 1] = Client.field10977 == null ? "" : Client.field10977;
		arg0.objectStack[++arg0.osp - 1] = Client.field11039 == null ? "" : Client.field11039;
	}

	@ObfuscatedName("aob.zj(Lyf;I)V")
	public static final void enum_string(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		EnumType var3 = (EnumType) Client.enumTypeList.list(var1);
		if (ScriptVarType.STRING != var3.outputtype) {
		}
		arg0.objectStack[++arg0.osp - 1] = var3.getValueString(var2);
	}

	@ObfuscatedName("uw.zw(Lyf;I)V")
	public static final void _enum(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		EnumType var5 = (EnumType) Client.enumTypeList.list(var3);
		if (var5.inputtype.getId() != var1 || var5.outputtype.getId() != var2) {
			throw new RuntimeException(var3 + " " + var4);
		} else if (var2 == ScriptVarType.STRING.getId()) {
			arg0.objectStack[++arg0.osp - 1] = var5.getValueString(var4);
		} else {
			arg0.intStack[++arg0.isp - 1] = var5.getValueInt(var4);
		}
	}

	@ObfuscatedName("sd.zq(Lyf;I)V")
	public static final void enum_hasoutput(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var4 = (EnumType) Client.enumTypeList.list(var2);
		if (var4.outputtype.getId() != var1) {
			throw new RuntimeException();
		}
		arg0.intStack[++arg0.isp - 1] = var4.hasOutputString(var3) ? 1 : 0;
	}

	@ObfuscatedName("gj.zo(Lyf;I)V")
	public static final void enum_hasoutput_string(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		EnumType var3 = (EnumType) Client.enumTypeList.list(var1);
		if (ScriptVarType.STRING != var3.outputtype) {
			throw new RuntimeException();
		}
		arg0.intStack[++arg0.isp - 1] = var3.hasOutputString(var2) ? 1 : 0;
	}

	@ObfuscatedName("xh.zk(Lyf;I)V")
	public static final void enum_getoutputcount(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		EnumType var2 = (EnumType) Client.enumTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.getOutputCount();
	}

	@ObfuscatedName("aaj.zm(Lyf;I)V")
	public static final void enum_getreversecount(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var4 = (EnumType) Client.enumTypeList.list(var2);
		if (var4.outputtype.getId() != var1) {
			throw new RuntimeException();
		}
		int[] var5 = var4.method14867(var3);
		int var6 = 0;
		if (var5 != null) {
			var6 = var5.length;
		}
		arg0.intStack[++arg0.isp - 1] = var6;
	}

	@ObfuscatedName("wa.zd(Lyf;I)V")
	public static final void enum_getreversecount_string(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		EnumType var3 = (EnumType) Client.enumTypeList.list(var1);
		if (ScriptVarType.STRING != var3.outputtype) {
			throw new RuntimeException();
		}
		int[] var4 = var3.method14867(var2);
		int var5 = 0;
		if (var4 != null) {
			var5 = var4.length;
		}
		arg0.intStack[++arg0.isp - 1] = var5;
	}

	@ObfuscatedName("to.zu(Lyf;I)V")
	public static final void enum_getreverseindex(ClientScriptState arg0) {
		arg0.isp -= 5;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = arg0.intStack[arg0.isp + 4];
		if (var3 == -1) {
			throw new RuntimeException();
		}
		EnumType var6 = (EnumType) Client.enumTypeList.list(var3);
		if (var6.inputtype.getId() != var2) {
			throw new RuntimeException();
		} else if (var6.outputtype.getId() == var1) {
			int[] var7 = var6.method14867(var4);
			if (var5 < 0 || var7 == null || var7.length <= var5) {
				throw new RuntimeException();
			}
			arg0.intStack[++arg0.isp - 1] = var7[var5];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("rg.ze(Lyf;I)V")
	public static final void enum_getreverseindex_string(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		String var4 = (String) arg0.objectStack[--arg0.osp];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var5 = (EnumType) Client.enumTypeList.list(var2);
		if (var5.inputtype.getId() != var1) {
			throw new RuntimeException();
		} else if (var5.outputtype.getId() == ScriptVarType.STRING.getId()) {
			int[] var6 = var5.method14867(var4);
			if (var3 < 0 || var6 == null || var6.length <= var3) {
				throw new RuntimeException();
			}
			arg0.intStack[++arg0.isp - 1] = var6[var3];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("va.zv(Lyf;I)V")
	public static final void email_validation_submit_code(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.SEND_EMAIL_VALIDATION_CODE, Client.lobbyConnection.randomOut);
		var2.buf.p1(Packet.pjstrlen(var1));
		var2.buf.pjstr(var1);
		Client.lobbyConnection.queue(var2);
	}

	@ObfuscatedName("sc.zc(Lyf;I)V")
	public static final void email_validation_change_address(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.CHANGE_EMAIL_ADDRESS, Client.lobbyConnection.randomOut);
		var3.buf.p2(Packet.pjstrlen(var1) + Packet.pjstrlen(var2));
		var3.buf.pjstr(var1);
		var3.buf.pjstr(var2);
		Client.lobbyConnection.queue(var3);
	}

	@ObfuscatedName("du.zp(Lyf;I)V")
	public static final void email_validation_add_new_address(ClientScriptState arg0) {
		arg0.osp--;
		arg0.isp -= 3;
		String var1 = (String) arg0.objectStack[arg0.osp];
		boolean var2 = arg0.intStack[arg0.isp] == 1;
		boolean var3 = arg0.intStack[arg0.isp + 1] == 1;
		boolean var4 = arg0.intStack[arg0.isp + 2] == 1;
		ClientMessage var5 = ClientMessage.createMessage(ClientProt.ADD_NEW_EMAIL_ADDRESS, Client.lobbyConnection.randomOut);
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
		if (Client.friendsListState == 0) {
			arg0.intStack[++arg0.isp - 1] = -2;
		} else if (Client.friendsListState == 1) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.friendsCount;
		}
	}

	@ObfuscatedName("pz.zs(Lyf;I)V")
	public static final void friend_getname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState != 2 || var1 >= Client.friendsCount) {
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		Friend var2 = Client.friends[var1];
		arg0.objectStack[++arg0.osp - 1] = var2.field606;
		if (var2.field607 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.field607;
		}
	}

	@ObfuscatedName("vv.zl(Lyf;I)V")
	public static final void friend_getworld(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 2 && var1 < Client.friendsCount) {
			arg0.intStack[++arg0.isp - 1] = Client.friends[var1].worldId;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("ajd.zb(Lyf;I)V")
	public static final void friend_getrank(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 2 && var1 < Client.friendsCount) {
			arg0.intStack[++arg0.isp - 1] = Client.friends[var1].rank;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("ik.zg(Lyf;B)V")
	public static final void friend_getnotes(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 2 && var1 < Client.friendsCount) {
			arg0.objectStack[++arg0.osp - 1] = Client.friends[var1].notes;
		} else {
			arg0.objectStack[++arg0.osp - 1] = "";
		}
	}

	@ObfuscatedName("qm.zx(Lyf;B)V")
	public static final void friend_getworldflags(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 2 && var1 < Client.friendsCount) {
			arg0.intStack[++arg0.isp - 1] = Client.friends[var1].worldFlags;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("xs.zr(Lyf;I)V")
	public static final void friend_setrank(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		Client.friendSetRank(var1, var2);
	}

	@ObfuscatedName("pj.zf(Lyf;I)V")
	public static final void friend_setnotes(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		Client.friendSetNotes(var1, var2);
	}

	@ObfuscatedName("ij.aag(Lyf;I)V")
	public static final void friend_add(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Client.friendAdd(var1);
	}

	@ObfuscatedName("yg.aak(Lyf;I)V")
	public static final void friend_del(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Client.friendDelete(var1);
	}

	@ObfuscatedName("vx.aad(Lyf;I)V")
	public static final void ignore_add(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Client.ignoreAdd(var1, false);
	}

	@ObfuscatedName("qn.aaa(Lyf;I)V")
	public static final void ignore_del(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Client.ignoreDelete(var1);
	}

	@ObfuscatedName("ex.aax(Lyf;I)V")
	public static final void ignore_setnotes(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		Client.ignoreSetNotes(var1, var2);
	}

	@ObfuscatedName("nd.aat(Lyf;B)V")
	public static final void friend_test(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.intStack[++arg0.isp - 1] = Client.friendTest(var1) ? 1 : 0;
	}

	@ObfuscatedName("hs.aas(Lyf;B)V")
	public static final void friend_getworldname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 2 && var1 < Client.friendsCount) {
			arg0.objectStack[++arg0.osp - 1] = Client.friends[var1].worldName;
		} else {
			arg0.objectStack[++arg0.osp - 1] = "";
		}
	}

	@ObfuscatedName("wm.aaf(Lyf;I)V")
	public static final void clan_getchatdisplayname(ClientScriptState arg0) {
		if (Client.clanChatDisplayName == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Base37.fromBase37orEmpty(Client.clanChatDisplayName);
		}
	}

	@ObfuscatedName("px.aar(Lyf;I)V")
	public static final void clan_getchatcount(ClientScriptState arg0) {
		if (Client.clanChatDisplayName == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.clanChatCount;
		}
	}

	@ObfuscatedName("vr.aai(Lyf;I)V")
	public static final void clan_getchatusername(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.clanChatDisplayName == null || var1 >= Client.clanChatCount) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Client.clanChatUsers[var1].name;
		}
	}

	@ObfuscatedName("afq.aap(Lyf;I)V")
	public static final void clan_getchatuserworld(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.clanChatDisplayName == null || var1 >= Client.clanChatCount) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.clanChatUsers[var1].world;
		}
	}

	@ObfuscatedName("fo.aaq(Lyf;B)V")
	public static final void clan_getchatuserrank(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.clanChatDisplayName == null || var1 >= Client.clanChatCount) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.clanChatUsers[var1].rank;
		}
	}

	@ObfuscatedName("nq.aau(Lyf;I)V")
	public static final void clan_getchatminkick(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.clanChatMinKick;
	}

	@ObfuscatedName("dm.aao(Lyf;I)V")
	public static final void clan_kickuser(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Client.clanKickUser(var1);
	}

	@ObfuscatedName("yo.aaj(Lyf;I)V")
	public static final void clan_getchatrank(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.clanChatRank;
	}

	@ObfuscatedName("ka.aab(Lyf;B)V")
	public static final void clan_joinchat(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Client.clanJoinChat(var1);
	}

	@ObfuscatedName("ap.aae(Lyf;I)V")
	public static final void clan_leavechat(ClientScriptState arg0) {
		Client.clanLeaveChat();
	}

	@ObfuscatedName("zs.aal(Lyf;S)V")
	public static final void ignore_count(ClientScriptState arg0) {
		if (Client.friendsListState == 0) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.ignoresCount;
		}
	}

	@ObfuscatedName("fl.aaz(Lyf;I)V")
	public static final void ignore_getname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 0 || var1 >= Client.ignoresCount) {
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		Ignore var2 = Client.ignores[var1];
		arg0.objectStack[++arg0.osp - 1] = var2.nameUnfiltered;
		if (var2.field596 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.field596;
		}
	}

	@ObfuscatedName("ad.aan(Lyf;I)V")
	public static final void ignore_getnotes(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 0 || var1 >= Client.ignoresCount) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Client.ignores[var1].notes;
		}
	}

	@ObfuscatedName("ts.aah(Lyf;S)V")
	public static final void ignore_test(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.intStack[++arg0.isp - 1] = Client.ignoreTest(var1) ? 1 : 0;
	}

	@ObfuscatedName("eb.aaw(Lyf;I)V")
	public static final void clan_isself(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.clanChatUsers == null || var1 >= Client.clanChatCount || !Client.clanChatUsers[var1].nameUnfiltered.equalsIgnoreCase(Client.localPlayerEntity.nameUnfiltered)) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
		}
	}

	@ObfuscatedName("ft.aay(Lyf;I)V")
	public static final void clan_getchatownername(ClientScriptState arg0) {
		if (Client.clanChatOwnerName == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Client.clanChatOwnerName;
		}
	}

	@ObfuscatedName("ip.aac(Lyf;I)V")
	public static final void clan_getchatuserworldname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.clanChatDisplayName == null || var1 >= Client.clanChatCount) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Client.clanChatUsers[var1].worldName;
		}
	}

	@ObfuscatedName("ad.aav(Lyf;B)V")
	public static final void friend_platform(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 2 && var1 >= 0 && var1 < Client.friendsCount) {
			arg0.intStack[++arg0.isp - 1] = Client.friends[var1].platform;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("sg.aam(Lyf;I)V")
	public static final void friend_getslotfromname(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.intStack[++arg0.isp - 1] = Client.friendGetSlotFromName(var1);
	}

	@ObfuscatedName("ey.abo(Lyf;I)V")
	public static final void ignore_getslotfromname(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (var1.startsWith(TextUtil.imgTag(0)) || var1.startsWith(TextUtil.imgTag(1))) {
			var1 = var1.substring(7);
		}
		arg0.intStack[++arg0.isp - 1] = Client.ignoreGetSlotFromName(var1);
	}

	@ObfuscatedName("ad.abr(Lyf;I)V")
	public static final void playercountry(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerCountry;
	}

	@ObfuscatedName("uw.abv(Lyf;I)V")
	public static final void ignore_add_temp(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Client.ignoreAdd(var1, true);
	}

	@ObfuscatedName("xq.abq(Lyf;B)V")
	public static final void ignore_is_temp(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.ignores[var1].temporary ? 1 : 0;
	}

	@ObfuscatedName("re.abw(Lyf;I)V")
	public static final void clan_getchatusername_unfiltered(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.clanChatDisplayName == null || var1 >= Client.clanChatCount) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Client.clanChatUsers[var1].nameUnfiltered;
		}
	}

	@ObfuscatedName("tc.abh(Lyf;I)V")
	public static final void ignore_getname_unfiltered(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 0 || var1 >= Client.ignoresCount) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Client.ignores[var1].nameUnfiltered;
		}
	}

	@ObfuscatedName("eu.abf(Lyf;B)V")
	public static final void friend_is_referrer(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 2 && var1 < Client.friendsCount) {
			arg0.intStack[++arg0.isp - 1] = Client.friends[var1].referrer ? 1 : 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("pj.abi(Lyf;I)V")
	public static final void friend_is_referred(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.friendsListState == 2 && var1 < Client.friendsCount) {
			arg0.intStack[++arg0.isp - 1] = Client.friends[var1].referred ? 1 : 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("ahj.abb(Lyf;B)V")
	public static final void player_group_find(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup == null ? 0 : 1;
	}

	@ObfuscatedName("tj.abc(Lyf;I)V")
	public static final void player_group_member_count(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.getMembers().size();
	}

	@ObfuscatedName("yd.abg(Lyf;I)V")
	public static final void player_group_member_get_same_world_var(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		int var3 = arg0.intStack[arg0.isp + 2];
		PlayerGroupMember var4 = Client.currentPlayerGroup.doGetMember(var1);
		if (var4.clearVariables() == null) {
			var4.resetVariables(Client.field10837);
		}
		if (!var2) {
			VarBitType var6 = (VarBitType) Client.varBitTypeList.list(var3);
			arg0.intStack[++arg0.isp - 1] = var6.getVarbitValue(var4.clearVariables().getVarValueInt(var6.baseVar.id));
			return;
		}
		VarPlayerType var5 = (VarPlayerType) Client.varPlayerTypeList.list(var3);
		switch(var5.dataType.baseType.index) {
			case 2:
				arg0.intStack[++arg0.isp - 1] = var4.clearVariables().getVarValueInt(var5.id);
				break;
			case 4:
				arg0.longStack[++arg0.lsp - 1] = var4.clearVariables().getVarValueLong(var5.id);
				break;
			default:
				arg0.objectStack[++arg0.osp - 1] = var4.clearVariables().getVarValue(var5.id);
		}
	}

	@ObfuscatedName("io.abn(Lyf;I)V")
	public static final void player_group_member_get_rank(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.doGetMember(var1).getRank();
	}

	@ObfuscatedName("pv.abj(Lyf;I)V")
	public static final void player_group_member_get_team(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.doGetMember(var1).getTeam();
	}

	@ObfuscatedName("dg.aba(Lyf;I)V")
	public static final void player_group_member_get_last_seen_node_id(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.doGetMember(var1).getNodeId();
	}

	@ObfuscatedName("au.abz(Lyf;I)V")
	public static final void player_group_member_get_status(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.doGetMember(var1).getStatus().getId();
	}

	@ObfuscatedName("dm.abu(Lyf;S)V")
	public static final void player_group_member_is_online(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.doGetMember(var1).isOnline() ? 1 : 0;
	}

	@ObfuscatedName("tz.abl(Lyf;B)V")
	public static final void player_group_member_is_member(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.doGetMember(var1).isMembers() ? 1 : 0;
	}

	@ObfuscatedName("eb.abp(Lyf;I)V")
	public static final void player_group_member_get_displayname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = Client.currentPlayerGroup.doGetMember(var1).getDisplayName();
	}

	@ObfuscatedName("l.abm(Lyf;B)V")
	public static final void player_group_member_get_join_xp(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		boolean var3 = arg0.intStack[arg0.isp + 2] == 1;
		PlayerStat var4 = Client.currentPlayerGroup.doGetMember(var1).getStat(var2);
		arg0.intStack[++arg0.isp - 1] = var3 ? var4.getXPLevel() : var4.getXP();
	}

	@ObfuscatedName("ahb.abx(Lyf;I)V")
	public static final void player_group_member_is_owner(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.getOwnerSlot() == var1 ? 1 : 0;
	}

	@ObfuscatedName("xd.abk(Lyf;I)V")
	public static final void player_group_banned_count(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.getBanned().size();
	}

	@ObfuscatedName("qs.aby(Lyf;I)V")
	public static final void player_group_banned_get_displayname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = ((PlayerGroupBanned) Client.currentPlayerGroup.getBanned().get(var1)).getDisplayName();
	}

	@ObfuscatedName("ux.abe(Lyf;B)V")
	public static final void player_group_get_displayname(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = Client.currentPlayerGroup.getDisplayName();
	}

	@ObfuscatedName("km.abd(Lyf;I)V")
	public static final void player_group_get_max_size(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.getMaxSize();
	}

	@ObfuscatedName("au.abt(Lyf;B)V")
	public static final void player_group_get_create_mins_since_epoch(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = (int) (Client.currentPlayerGroup.getCreationTime() / 60000L);
	}

	@ObfuscatedName("nj.aca(Lyf;B)V")
	public static final void player_group_get_create_seconds_to_now(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = (int) ((MonotonicTime.get() - Client.currentPlayerGroup.getCreationTime() - Client.field1238) / 1000L);
	}

	@ObfuscatedName("sv.acd(Lyf;B)V")
	public static final void player_group_is_members_only(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.isMembersOnly() ? 1 : 0;
	}

	@ObfuscatedName("ahs.ack(Lyf;I)V")
	public static final void player_group_get_overall_status(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.overallStatus().getId();
	}

	@ObfuscatedName("ew.acm(Lyf;B)V")
	public static final void player_group_get_owner_slot(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.currentPlayerGroup.getOwnerSlot();
	}

	@ObfuscatedName("fn.act(Lyf;B)V")
	public static final void activeclansettings_find_listened(ClientScriptState arg0) {
		if (Client.listenedClanSettings == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
			arg0.activeClanSettings = Client.listenedClanSettings;
			arg0.primaryVars.put(VarDomainType.CLAN_SETTING, createVarClanSettingsDomain(arg0.activeClanSettings));
		}
	}

	@ObfuscatedName("acn.aci(Lyf;I)V")
	public static final void activeclansettings_find_affined(ClientScriptState arg0) {
		if (Client.affinedClanSettings == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
			arg0.activeClanSettings = Client.affinedClanSettings;
			arg0.primaryVars.put(VarDomainType.CLAN_SETTING, createVarClanSettingsDomain(arg0.activeClanSettings));
		}
	}

	@ObfuscatedName("oh.ach(Lyf;B)V")
	public static final void activeclansettings_getclanname(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = arg0.activeClanSettings.clanName;
	}

	@ObfuscatedName("fs.acb(Lyf;I)V")
	public static final void activeclansettings_getallowunaffined(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.allowUnaffined ? 1 : 0;
	}

	@ObfuscatedName("nq.acx(Lyf;I)V")
	public static final void activeclansettings_getranktalk(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.rankTalk;
	}

	@ObfuscatedName("ry.acc(Lyf;B)V")
	public static final void activeclansettings_getrankkick(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.rankKick;
	}

	@ObfuscatedName("kh.acw(Lyf;B)V")
	public static final void activeclansettings_getranklootshare(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.rankLootshare;
	}

	@ObfuscatedName("ng.acv(Lyf;I)V")
	public static final void activeclansettings_getcoinshare(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.coinshare;
	}

	@ObfuscatedName("hy.acu(Lyf;I)V")
	public static final void activeclansettings_getaffinedcount(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.memberCount;
	}

	@ObfuscatedName("qw.acg(Lyf;I)V")
	public static final void activeclansettings_getaffineddisplayname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = arg0.activeClanSettings.affinedDisplayNames[var1];
	}

	@ObfuscatedName("eu.acz(Lyf;I)V")
	public static final void activeclansettings_getaffinedrank(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.affinedRanks[var1];
	}

	@ObfuscatedName("jk.acp(Lyf;I)V")
	public static final void activeclansettings_getaffinedmuted(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.affinedMutes[var1] ? 1 : 0;
	}

	@ObfuscatedName("fj.acq(Lyf;B)V")
	public static final void activeclansettings_getbannedcount(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.bannedCount;
	}

	@ObfuscatedName("ji.acr(Lyf;I)V")
	public static final void activeclansettings_getbanneddisplayname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = arg0.activeClanSettings.bannedDisplayNames[var1];
	}

	@ObfuscatedName("o.acj(Lyf;S)V")
	public static final void activeclansettings_getaffinedextrainfo(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.getExtraInfo(var1, var2, var3);
	}

	@ObfuscatedName("rl.aco(Lyf;I)V")
	public static final void activeclansettings_getcurrentowner_slot(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.currentOwnerSlot;
	}

	@ObfuscatedName("aof.ace(Lyf;I)V")
	public static final void activeclansettings_getreplacementowner_slot(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.replacementOwnerSlot;
	}

	@ObfuscatedName("ho.acl(Lyf;I)V")
	public static final void activeclansettings_getaffinedslot(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.getAffinedSlot((String) arg0.objectStack[--arg0.osp]);
	}

	@ObfuscatedName("to.acy(Lyf;I)V")
	public static final void activeclansettings_getsortedaffinedslot(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = arg0.activeClanSettings.getSortedAffinedSlot()[arg0.intStack[arg0.isp - 1]];
	}

	@ObfuscatedName("df.acf(Lyf;B)V")
	public static final void affinedclansettings_addbanned_fromchannel(ClientScriptState arg0) {
		Client.affinedClanSettingsAddBannedFromChannel(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("anw.acs(Lyf;I)V")
	public static final void affinedclansettings_setmuted_fromchannel(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		Client.affinedClanSettingsSetMutedFromChannel(var1, var2);
	}

	@ObfuscatedName("lv.acn(Lyf;I)V")
	public static final void activeclansettings_getaffinedjoinruneday(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanSettings.affinedJoinedRunedays[var1];
	}

	@ObfuscatedName("n.adl(Lyf;I)V")
	public static final void activeclanchannel_find_listened(ClientScriptState arg0) {
		if (Client.listenedClanChannel == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
			arg0.activeClanChannel = Client.listenedClanChannel;
		}
	}

	@ObfuscatedName("b.adp(Lyf;I)V")
	public static final void activeclanchannel_find_affined(ClientScriptState arg0) {
		if (Client.affinedClanChannel == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
			arg0.activeClanChannel = Client.affinedClanChannel;
		}
	}

	@ObfuscatedName("pu.adc(Lyf;I)V")
	public static final void activeclanchannel_getclanname(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = arg0.activeClanChannel.clanName;
	}

	@ObfuscatedName("zr.ada(Lyf;I)V")
	public static final void activeclanchannel_getrankkick(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanChannel.rankKick;
	}

	@ObfuscatedName("q.adh(Lyf;I)V")
	public static final void activeclanchannel_getranktalk(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanChannel.rankTalk;
	}

	@ObfuscatedName("qg.adb(Lyf;B)V")
	public static final void activeclanchannel_getusercount(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanChannel.userCount;
	}

	@ObfuscatedName("qt.adi(Lyf;I)V")
	public static final void activeclanchannel_getuserdisplayname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = arg0.activeClanChannel.channelUsers[var1].name;
	}

	@ObfuscatedName("akz.adz(Lyf;I)V")
	public static final void activeclanchannel_getuserrank(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanChannel.channelUsers[var1].rank;
	}

	@ObfuscatedName("dj.ads(Lyf;I)V")
	public static final void activeclanchannel_getuserworld(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanChannel.channelUsers[var1].world;
	}

	@ObfuscatedName("amg.adg(Lyf;B)V")
	public static final void activeclanchannel_kickuser(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Client.clanChannelKickUser(Client.affinedClanChannel == arg0.activeClanChannel, var1);
	}

	@ObfuscatedName("il.adn(Lyf;B)V")
	public static final void activeclanchannel_getuserslot(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeClanChannel.getUserSlot((String) arg0.objectStack[--arg0.osp]);
	}

	@ObfuscatedName("gr.adk(Lyf;S)V")
	public static final void activeclanchannel_getsorteduserslot(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = arg0.activeClanChannel.getSortedUserSlot()[arg0.intStack[arg0.isp - 1]];
	}

	@ObfuscatedName("qp.ado(Lyf;B)V")
	public static final void clanprofile_find(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.varClan == null ? 0 : 1;
	}

	@ObfuscatedName("abn.adr(Lyf;I)V")
	public static final void stockmarket_getoffertype(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.stockmarketSlots[var2][var1].getOfferType();
	}

	@ObfuscatedName("fm.ade(Lyf;B)V")
	public static final void stockmarket_getofferitem(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.stockmarketSlots[var2][var1].obj;
	}

	@ObfuscatedName("xu.adf(Lyf;I)V")
	public static final void stockmarket_getofferprice(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.stockmarketSlots[var2][var1].price;
	}

	@ObfuscatedName("nk.adv(Lyf;I)V")
	public static final void stockmarket_getoffercount(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.stockmarketSlots[var2][var1].count;
	}

	@ObfuscatedName("vx.adw(Lyf;I)V")
	public static final void stockmarket_getoffercompletedcount(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.stockmarketSlots[var2][var1].completedCount;
	}

	@ObfuscatedName("kl.adj(Lyf;I)V")
	public static final void stockmarket_getoffercompletedgold(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.stockmarketSlots[var2][var1].completedGold;
	}

	@ObfuscatedName("jw.adm(Lyf;I)V")
	public static final void stockmarket_isofferempty(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = Client.stockmarketSlots[var2][var1].method7608();
		arg0.intStack[++arg0.isp - 1] = var3 == 0 ? 1 : 0;
	}

	@ObfuscatedName("ru.adx(Lyf;I)V")
	public static final void stockmarket_isofferstable(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = Client.stockmarketSlots[var2][var1].method7608();
		arg0.intStack[++arg0.isp - 1] = var3 == 2 ? 1 : 0;
	}

	@ObfuscatedName("ch.ady(Lyf;S)V")
	public static final void stockmarket_isofferfinished(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = Client.stockmarketSlots[var2][var1].method7608();
		arg0.intStack[++arg0.isp - 1] = var3 == 5 ? 1 : 0;
	}

	@ObfuscatedName("nw.adu(Lyf;I)V")
	public static final void stockmarket_isofferadding(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = Client.stockmarketSlots[var2][var1].method7608();
		arg0.intStack[++arg0.isp - 1] = var3 == 1 ? 1 : 0;
	}

	@ObfuscatedName("py.adt(Lyf;B)V")
	public static final void add(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 + var2;
	}

	@ObfuscatedName("xs.add(Lclient!yf;S)V")
	public static final void sub(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var2 - var3;
	}

	@ObfuscatedName("yx.adq(Lyf;I)V")
	public static final void multiply(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 * var2;
	}

	@ObfuscatedName("pc.aew(Lyf;I)V")
	public static final void divide(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 / var2;
	}

	@ObfuscatedName("in.aeu(Lyf;I)V")
	public static final void random(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = (int) (Math.random() * (double) var1);
	}

	@ObfuscatedName("ck.aez(Lyf;I)V")
	public static final void randominc(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = (int) (Math.random() * (double) (var1 + 1));
	}

	@ObfuscatedName("at.aeh(Lyf;I)V")
	public static final void interpolate(ClientScriptState arg0) {
		arg0.isp -= 5;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = arg0.intStack[arg0.isp + 4];
		arg0.intStack[++arg0.isp - 1] = (var2 - var1) * (var5 - var3) / (var4 - var3) + var1;
	}

	@ObfuscatedName("hz.aen(Lyf;I)V")
	public static final void addpercent(ClientScriptState arg0) {
		arg0.isp -= 2;
		long var1 = (long) arg0.intStack[arg0.isp];
		long var3 = (long) arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = (int) (var1 * var3 / 100L + var1);
	}

	@ObfuscatedName("uy.aet(Lyf;I)V")
	public static final void setbit(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 | 0x1 << var2;
	}

	@ObfuscatedName("jx.aer(Lyf;I)V")
	public static final void clearbit(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 & -1 - (0x1 << var2);
	}

	@ObfuscatedName("ahd.aes(Lyf;I)V")
	public static final void testbit(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = (var1 & 0x1 << var2) == 0 ? 0 : 1;
	}

	@ObfuscatedName("k.aeb(Lyf;I)V")
	public static final void modulo(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 % var2;
	}

	@ObfuscatedName("kc.aev(Lyf;I)V")
	public static final void pow(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var1 == 0) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = (int) Math.pow((double) var1, (double) var2);
		}
	}

	@ObfuscatedName("kc.aey(Lyf;I)V")
	public static final void invpow(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var1 == 0 || var2 == 0) {
			arg0.intStack[++arg0.isp - 1] = 0;
			return;
		}
		switch(var2) {
			case 1:
				arg0.intStack[++arg0.isp - 1] = var1;
				return;
			case 2:
				arg0.intStack[++arg0.isp - 1] = (int) Math.sqrt((double) var1);
				return;
			case 3:
				arg0.intStack[++arg0.isp - 1] = (int) Math.cbrt((double) var1);
				return;
			case 4:
				arg0.intStack[++arg0.isp - 1] = (int) Math.sqrt(Math.sqrt((double) var1));
				return;
			default:
				arg0.intStack[++arg0.isp - 1] = (int) Math.pow((double) var1, 1.0D / (double) var2);
		}
	}

	@ObfuscatedName("sf.aex(Lyf;I)V")
	public static final void and(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 & var2;
	}

	@ObfuscatedName("aik.aec(Lyf;I)V")
	public static final void or(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 | var2;
	}

	@ObfuscatedName("acg.or(Lyf;B)V")
	public static final void min(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 < var2 ? var1 : var2;
	}

	@ObfuscatedName("aht.aeo(Lyf;I)V")
	public static final void max(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 > var2 ? var1 : var2;
	}

	@ObfuscatedName("nf.aeg(Lyf;B)V")
	public static final void scale(ClientScriptState arg0) {
		arg0.isp -= 3;
		long var1 = (long) arg0.intStack[arg0.isp];
		long var3 = (long) arg0.intStack[arg0.isp + 1];
		long var5 = (long) arg0.intStack[arg0.isp + 2];
		arg0.intStack[++arg0.isp - 1] = (int) (var1 * var5 / var3);
	}

	@ObfuscatedName("ye.ael(Lyf;I)V")
	public static final void bitcount(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = IntMath.method14573(arg0.intStack[arg0.isp - 1]);
	}

	@ObfuscatedName("va.aei(Lyf;B)V")
	public static final void togglebit(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 ^ 0x1 << var2;
	}

	@ObfuscatedName("qv.aef(Lyf;I)V")
	public static final void setbit_range(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		arg0.intStack[++arg0.isp - 1] = IntMath.method3256(var1, var2, var3);
	}

	@ObfuscatedName("el.aej(Lyf;B)V")
	public static final void clearbit_range(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		arg0.intStack[++arg0.isp - 1] = IntMath.method3588(var1, var2, var3);
	}

	@ObfuscatedName("jq.aea(Lyf;S)V")
	public static final void getbit_range(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = 31 - var3;
		arg0.intStack[++arg0.isp - 1] = var1 << var4 >>> var2 + var4;
	}

	@ObfuscatedName("yx.aed(Lyf;I)V")
	public static final void setbit_range_toint(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = IntMath.method14281(var4 - var3 + 1);
		if (var2 > var5) {
			var2 = var5;
		}
		int var6 = IntMath.method3588(var1, var3, var4);
		arg0.intStack[++arg0.isp - 1] = var6 | var2 << var3;
	}

	@ObfuscatedName("ags.aee(Lyf;I)V")
	public static final void sqrt(ClientScriptState arg0) {
		int var1 = arg0.intStack[arg0.isp - 1];
		arg0.intStack[arg0.isp - 1] = (int) Math.sqrt((double) var1);
	}

	@ObfuscatedName("fa.aek(Lyf;I)V")
	public static final void sin_deg(ClientScriptState arg0) {
		int var1 = arg0.intStack[arg0.isp - 1];
		arg0.intStack[arg0.isp - 1] = Trig1.sin(var1);
	}

	@ObfuscatedName("ju.aem(Lyf;B)V")
	public static final void cos_deg(ClientScriptState arg0) {
		int var1 = arg0.intStack[arg0.isp - 1];
		arg0.intStack[arg0.isp - 1] = Trig1.cos(var1);
	}

	@ObfuscatedName("akp.aep(Lyf;B)V")
	public static final void atan2_deg(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Trig1.atan2(var1, var2);
	}

	@ObfuscatedName("art.aeq(Lyf;I)V")
	public static final void abs(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Math.abs(var1);
	}

	@ObfuscatedName("ex.abs(Lyf;I)V")
	public static final void random_sound_pitch(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var1 <= 700 && var2 <= 700) {
			double var3 = (Math.random() * (double) (var1 + var2) - (double) var1 + 800.0D) / 100.0D;
			arg0.intStack[++arg0.isp - 1] = (int) (Math.pow(2.0D, var3) + 0.5D);
		} else {
			arg0.intStack[++arg0.isp - 1] = 256;
		}
	}

	@ObfuscatedName("kz.afq(Lyf;I)V")
	public static final void hsvtorgb(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ColourUtils.field8149[var1 & 0xFFFF];
	}

	@ObfuscatedName("qi.afy(Lyf;I)V")
	public static final void not(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ~var1;
	}

	@ObfuscatedName("xh.afi(Lyf;B)V")
	public static final void append_num(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = var1 + var2;
	}

	@ObfuscatedName("aj.afk(Lyf;I)V")
	public static final void append(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		arg0.objectStack[++arg0.osp - 1] = var1 + var2;
	}

	@ObfuscatedName("qx.afo(Lyf;I)V")
	public static final void append_signnum(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = var1 + StringTools.method1898(var2, true);
	}

	@ObfuscatedName("tl.afz(Lyf;B)V")
	public static final void get_col_tag(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = TextUtil.colTag(var1);
	}

	@ObfuscatedName("jx.afe(Lyf;I)V")
	public static final void lowercase(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.objectStack[++arg0.osp - 1] = var1.toLowerCase();
	}

	@ObfuscatedName("hx.afm(Lyf;B)V")
	public static final void fromdate(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = TimeFormatter.method14482(TimeFormatter.method14612(arg0.intStack[--arg0.isp]), Client.language.getId());
	}

	@ObfuscatedName("vm.afg(Lyf;I)V")
	public static final void text_gender(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		if (Client.localPlayerEntity.model != null && Client.localPlayerEntity.model.isFemale) {
			arg0.objectStack[++arg0.osp - 1] = var2;
		} else {
			arg0.objectStack[++arg0.osp - 1] = var1;
		}
	}

	@ObfuscatedName("cj.afa(Lyf;I)V")
	public static final void tostring(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = Integer.toString(var1);
	}

	@ObfuscatedName("ku.afc(Lyf;B)V")
	public static final void compare(ClientScriptState arg0) {
		arg0.osp -= 2;
		arg0.intStack[++arg0.isp - 1] = StringComparator.method6827((String) arg0.objectStack[arg0.osp], (String) arg0.objectStack[arg0.osp + 1], Client.language);
	}

	@ObfuscatedName("ea.afb(Lyf;B)V")
	public static final void paraheight(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		FontMetrics var4 = Client.fontProvider.getFontMetrics(Client.fontFactory, var3);
		arg0.intStack[++arg0.isp - 1] = var4.paraheight(var1, var2, DefaultSprites.field10302);
	}

	@ObfuscatedName("hv.afr(Lyf;I)V")
	public static final void parawidth(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		FontMetrics var4 = Client.fontProvider.getFontMetrics(Client.fontFactory, var3);
		arg0.intStack[++arg0.isp - 1] = var4.parawidth(var1, var2, DefaultSprites.field10302);
	}

	@ObfuscatedName("vc.afh(Lyf;I)V")
	public static final void paraline(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 3;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		int var4 = arg0.intStack[arg0.isp + 2];
		FontMetrics var5 = Client.fontProvider.getFontMetrics(Client.fontFactory, var3);
		String var6 = var5.paraline(var1, var2, DefaultSprites.field10302, var4);
		arg0.objectStack[++arg0.osp - 1] = var6 == null ? "" : var6;
	}

	@ObfuscatedName("ku.afw(Lyf;I)V")
	public static final void text_switch(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		if (arg0.intStack[--arg0.isp] == 1) {
			arg0.objectStack[++arg0.osp - 1] = var1;
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2;
		}
	}

	@ObfuscatedName("sx.afd(Lyf;I)V")
	public static final void escape(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.objectStack[++arg0.osp - 1] = StringHelper.escape(var1);
	}

	@ObfuscatedName("fs.afl(Lyf;I)V")
	public static final void append_char(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		if (var2 == -1) {
			throw new RuntimeException("null char");
		}
		arg0.objectStack[++arg0.osp - 1] = var1 + (char) var2;
	}

	@ObfuscatedName("wi.afs(Lyf;B)V")
	public static final void char_isprintable(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = StringTools.charIsPrintable((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("pn.afx(Lyf;I)V")
	public static final void char_isvalid(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Cp1252.charIsValid((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("ahx.aff(Lyf;B)V")
	public static final void char_isalphanumeric(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = StringTools.charIsAlphaNumeric((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("dz.afv(Lyf;I)V")
	public static final void char_isalpha(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = StringTools.charIsAlpha((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("sr.afu(Lyf;I)V")
	public static final void char_isnumeric(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = StringTools.charIsNumeric((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("vc.aft(Lyf;S)V")
	public static final void string_length(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (var1 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1.length();
		}
	}

	@ObfuscatedName("ex.afn(Lyf;I)V")
	public static final void substring(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		arg0.objectStack[++arg0.osp - 1] = var1.substring(var2, var3);
	}

	@ObfuscatedName("tj.afj(Lyf;I)V")
	public static final void removetags(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
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
		arg0.objectStack[++arg0.osp - 1] = var2.toString();
	}

	@ObfuscatedName("aak.afp(Lyf;I)V")
	public static final void string_indexof_char(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("nq.agv(Lyf;I)V")
	public static final void string_indexof_string(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		int var3 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("gj.aga(Lyf;I)V")
	public static final void char_tolowercase(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Character.toLowerCase((char) var1);
	}

	@ObfuscatedName("ex.agi(Lyf;I)V")
	public static final void char_touppercase(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Character.toUpperCase((char) var1);
	}

	@ObfuscatedName("tb.agg(Lyf;B)V")
	public static final void tostring_localised(ClientScriptState arg0) {
		boolean var1 = arg0.intStack[--arg0.isp] != 0;
		int var2 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = StringComparator.localised((long) var2, 0, var1, Client.language);
	}

	@ObfuscatedName("xh.agx(Lyf;I)V")
	public static final void stringwidth(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		FontMetrics var3 = Client.fontProvider.getFontMetrics(Client.fontFactory, var2);
		arg0.intStack[++arg0.isp - 1] = var3.stringWidth(var1, DefaultSprites.field10302);
	}

	@ObfuscatedName("ap.agj(Lyf;B)V")
	public static final void string_distance(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		arg0.intStack[++arg0.isp - 1] = StringTools.distance(var1, var2);
	}

	@ObfuscatedName("gq.age(Lyf;B)V")
	public static final void format_datetime_from_minutes(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = TimeFormatter.method6058((long) arg0.intStack[--arg0.isp] * 60000L, Client.language.getId(), true) + " UTC";
	}

	@ObfuscatedName("t.agk(Lyf;S)V")
	public static final void clanforumqfc_tostring(ClientScriptState arg0) {
		long var1 = arg0.longStack[--arg0.lsp];
		arg0.objectStack[++arg0.osp - 1] = var1 == -1L ? "" : Long.toString(var1, 36).toUpperCase();
	}

	@ObfuscatedName("oo.agm(Lyf;I)V")
	public static final void oc_name(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = ((ObjType) Client.objTypeList.list(var1)).name;
	}

	@ObfuscatedName("hx.agf(Lyf;S)V")
	public static final void oc_op(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ObjType var3 = (ObjType) Client.objTypeList.list(var1);
		if (var2 < 1 || var2 > 5 || var3.op[var2 - 1] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var3.op[var2 - 1];
		}
	}

	@ObfuscatedName("ji.agd(Lyf;I)V")
	public static final void oc_iop(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ObjType var3 = (ObjType) Client.objTypeList.list(var1);
		if (var2 < 1 || var2 > 5 || var3.iop[var2 - 1] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var3.iop[var2 - 1];
		}
	}

	@ObfuscatedName("ajf.agb(Lyf;B)V")
	public static final void oc_cost(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ((ObjType) Client.objTypeList.list(var1)).cost;
	}

	@ObfuscatedName("hf.agw(Lyf;I)V")
	public static final void oc_stackable(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ((ObjType) Client.objTypeList.list(var1)).stackable == 1 ? 1 : 0;
	}

	@ObfuscatedName("aac.agn(Lyf;I)V")
	public static final void oc_cert(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		if (var2.certtemplate == -1 && var2.certlink >= 0) {
			arg0.intStack[++arg0.isp - 1] = var2.certlink;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1;
		}
	}

	@ObfuscatedName("nv.agu(Lyf;I)V")
	public static final void oc_uncert(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		if (var2.certtemplate >= 0 && var2.certlink >= 0) {
			arg0.intStack[++arg0.isp - 1] = var2.certlink;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1;
		}
	}

	@ObfuscatedName("no.ags(Lyf;B)V")
	public static final void oc_shard(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		if (var2.shardtemplate == -1 && var2.shardlink >= 0) {
			arg0.intStack[++arg0.isp - 1] = var2.shardlink;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1;
		}
	}

	@ObfuscatedName("aj.agp(Lyf;B)V")
	public static final void oc_unshard(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		if (var2.shardtemplate >= 0 && var2.shardlink >= 0) {
			arg0.intStack[++arg0.isp - 1] = var2.shardlink;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1;
		}
	}

	@ObfuscatedName("nh.agz(Lyf;I)V")
	public static final void oc_shardcount(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.shardcount;
	}

	@ObfuscatedName("fw.agh(Lyf;I)V")
	public static final void oc_wearpos(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ((ObjType) Client.objTypeList.list(var1)).wearpos;
	}

	@ObfuscatedName("ki.agq(Lyf;I)V")
	public static final void oc_wearpos2(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ((ObjType) Client.objTypeList.list(var1)).wearpos2;
	}

	@ObfuscatedName("kr.agr(Lyf;I)V")
	public static final void oc_wearpos3(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ((ObjType) Client.objTypeList.list(var1)).wearpos3;
	}

	@ObfuscatedName("wm.agt(Lyf;I)V")
	public static final void oc_members(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ((ObjType) Client.objTypeList.list(var1)).members ? 1 : 0;
	}

	@ObfuscatedName("ul.agl(Lyf;I)V")
	public static final void oc_param(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ParamType var3 = (ParamType) Client.paramTypeList.list(var2);
		if (var3.isStringType()) {
			arg0.objectStack[++arg0.osp - 1] = ((ObjType) Client.objTypeList.list(var1)).getParam(var2, var3.defaultstr);
		} else {
			arg0.intStack[++arg0.isp - 1] = ((ObjType) Client.objTypeList.list(var1)).getParam(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("ye.agc(Lyf;I)V")
	public static final void oc_icursor(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1] - 1;
		ObjType var3 = (ObjType) Client.objTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var3.getICursor(var2);
	}

	@ObfuscatedName("ae.ago(Lyf;I)V")
	public static final void oc_find(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.findObjs(var1, var2 == 1);
	}

	@ObfuscatedName("zl.agy(Lyf;I)V")
	public static final void oc_findnext(ClientScriptState arg0) {
		if (Client.objFindResults == null || Client.objFindResultsIndex >= Client.objFindResults.length) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.objFindResults[++Client.objFindResultsIndex - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("ajd.ahm(Lyf;B)V")
	public static final void oc_findrestart(ClientScriptState arg0) {
		Client.objFindResultsIndex = 0;
	}

	@ObfuscatedName("abq.ahc(Lyf;I)V")
	public static final void oc_minimenu_colour_overridden(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.minimenu_colour_overridden ? 1 : 0;
	}

	@ObfuscatedName("xd.ahj(Lyf;I)V")
	public static final void oc_minimenu_colour(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		int var3;
		if (var2.minimenu_colour_overridden) {
			var3 = var2.minimenu_colour;
		} else if (var2.members) {
			var3 = MiniMenu.miniMenuDefaults.members_colour;
		} else {
			var3 = MiniMenu.miniMenuDefaults.free_colour;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("tz.ahw(Lyf;S)V")
	public static final void oc_category(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.category;
	}

	@ObfuscatedName("gy.ahl(Lyf;S)V")
	public static final void oc_hasvarobj(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.stackable == 2 ? 1 : 0;
	}

	@ObfuscatedName("tv.ahv(Lyf;B)V")
	public static final void oc_tradeable(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.tradeable ? 1 : 0;
	}

	@ObfuscatedName("nz.ahf(Lyf;I)V")
	public static final void oc_placeholder(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ObjType var2 = (ObjType) Client.objTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.placeholder ? 1 : 0;
	}

	@ObfuscatedName("aal.ahr(Lyf;I)V")
	public static final void oc_id(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ((ObjType) Client.objTypeList.list(var1)).id;
	}

	@ObfuscatedName("a.ahk(Lyf;I)V")
	public static final void nc_param(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ParamType var3 = (ParamType) Client.paramTypeList.list(var2);
		if (var3.isStringType()) {
			arg0.objectStack[++arg0.osp - 1] = ((NPCType) Client.npcTypeList.list(var1)).getParam(var2, var3.defaultstr);
		} else {
			arg0.intStack[++arg0.isp - 1] = ((NPCType) Client.npcTypeList.list(var1)).getParam(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("vg.ahq(Lyf;B)V")
	public static final void lc_param(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ParamType var3 = (ParamType) Client.paramTypeList.list(var2);
		if (var3.isStringType()) {
			arg0.objectStack[++arg0.osp - 1] = ((LocType) Client.world.getLocTypeList().list(var1)).getParam(var2, var3.defaultstr);
		} else {
			arg0.intStack[++arg0.isp - 1] = ((LocType) Client.world.getLocTypeList().list(var1)).getParam(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("vn.ahu(Lyf;B)V")
	public static final void struct_param(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ParamType var3 = (ParamType) Client.paramTypeList.list(var2);
		if (var3.isStringType()) {
			arg0.objectStack[++arg0.osp - 1] = ((StructType) Client.structTypeList.list(var1)).getParam(var2, var3.defaultstr);
		} else {
			arg0.intStack[++arg0.isp - 1] = ((StructType) Client.structTypeList.list(var1)).getParam(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("yb.ahz(Lyf;I)V")
	public static final void seq_param(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ParamType var3 = (ParamType) Client.paramTypeList.list(var2);
		if (var3.isStringType()) {
			arg0.objectStack[++arg0.osp - 1] = ((SeqType) Client.seqTypeList.list(var1)).method2989(var2, var3.defaultstr);
		} else {
			arg0.intStack[++arg0.isp - 1] = ((SeqType) Client.seqTypeList.list(var1)).method2981(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("fw.aha(Lyf;B)V")
	public static final void seqlength(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ((SeqType) Client.seqTypeList.list(var1)).length;
	}

	@ObfuscatedName("ij.ahx(Lyf;I)V")
	public static final void bas_getanim_ready(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		BASType var2 = (BASType) Client.basTypeList.list(var1);
		if (var2.field7335 == null || var2.field7335.length <= 0) {
			arg0.intStack[++arg0.isp - 1] = var2.readyanim;
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
		arg0.intStack[++arg0.isp - 1] = var2.field7335[var3];
	}

	@ObfuscatedName("ahz.ahb(Lyf;B)V")
	public static final void chat_getfilter_public(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.publicChatFilter;
	}

	@ObfuscatedName("pl.aho(Lyf;S)V")
	public static final void chat_setfilter(ClientScriptState arg0) {
		arg0.isp -= 3;
		Client.publicChatFilter = arg0.intStack[arg0.isp];
		Client.privateChatFilter = PrivateChatFilter.method3374(arg0.intStack[arg0.isp + 1]);
		if (Client.privateChatFilter == null) {
			Client.privateChatFilter = PrivateChatFilter.field8527;
		}
		Client.tradeChatFilter = arg0.intStack[arg0.isp + 2];
		ServerConnection var1 = Client.getCurrentConnection();
		ClientMessage var2 = ClientMessage.createMessage(ClientProt.SET_CHATFILTERSETTINGS, var1.randomOut);
		var2.buf.p1(Client.publicChatFilter);
		var2.buf.p1(Client.privateChatFilter.value);
		var2.buf.p1(Client.tradeChatFilter);
		var1.queue(var2);
	}

	@ObfuscatedName("anr.ahg(Lyf;I)V")
	public static final void chat_sendabusereport(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		arg0.isp -= 2;
		int var3 = arg0.intStack[arg0.isp];
		int var4 = arg0.intStack[arg0.isp + 1];
		if (var2 == null) {
			var2 = "";
		}
		if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}
		ServerConnection var5 = Client.getCurrentConnection();
		ClientMessage var6 = ClientMessage.createMessage(ClientProt.SEND_SNAPSHOT, var5.randomOut);
		var6.buf.p1(Packet.pjstrlen(var1) + 2 + Packet.pjstrlen(var2));
		var6.buf.pjstr(var1);
		var6.buf.p1(var3 - 1);
		var6.buf.p1(var4);
		var6.buf.pjstr(var2);
		var5.queue(var6);
	}

	@ObfuscatedName("aas.ahh(Lyf;S)V")
	public static final void chat_gethistory_bytypeandline(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ChatLine var3 = ChatHistory.method7310(var1, var2);
		if (var3 != null) {
			arg0.intStack[++arg0.isp - 1] = var3.uid;
			arg0.objectStack[++arg0.osp - 1] = TimeFormatter.method16609(var3.time, Client.language.serialID);
			arg0.intStack[++arg0.isp - 1] = var3.flags;
			arg0.objectStack[++arg0.osp - 1] = var3.name == null ? "" : var3.name;
			arg0.objectStack[++arg0.osp - 1] = var3.nameUnfiltered == null ? "" : var3.nameUnfiltered;
			arg0.objectStack[++arg0.osp - 1] = var3.nameSimple == null ? "" : var3.nameSimple;
			arg0.objectStack[++arg0.osp - 1] = var3.clan == null ? "" : var3.clan;
			arg0.intStack[++arg0.isp - 1] = var3.phrase;
			arg0.objectStack[++arg0.osp - 1] = var3.message == null ? "" : var3.message;
			arg0.intStack[++arg0.isp - 1] = var3.crown == null ? -1 : var3.crown.getId();
			return;
		}
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("no.ahd(Lyf;B)V")
	public static final void chat_gethistory_byuid(ClientScriptState arg0) {
		arg0.isp--;
		int var1 = arg0.intStack[arg0.isp];
		ChatLine var2 = ChatHistory.method304(var1);
		if (var2 != null) {
			arg0.intStack[++arg0.isp - 1] = var2.type;
			arg0.objectStack[++arg0.osp - 1] = TimeFormatter.method16609(var2.time, Client.language.serialID);
			arg0.intStack[++arg0.isp - 1] = var2.flags;
			arg0.objectStack[++arg0.osp - 1] = var2.name == null ? "" : var2.name;
			arg0.objectStack[++arg0.osp - 1] = var2.nameUnfiltered == null ? "" : var2.nameUnfiltered;
			arg0.objectStack[++arg0.osp - 1] = var2.nameSimple == null ? "" : var2.nameSimple;
			arg0.objectStack[++arg0.osp - 1] = var2.clan == null ? "" : var2.clan;
			arg0.intStack[++arg0.isp - 1] = var2.phrase;
			arg0.objectStack[++arg0.osp - 1] = var2.message == null ? "" : var2.message;
			arg0.intStack[++arg0.isp - 1] = var2.crown == null ? -1 : var2.crown.getId();
			return;
		}
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("fw.ahn(Lyf;I)V")
	public static final void chat_lastuid(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ChatHistory.lastUid();
	}

	@ObfuscatedName("vo.ahp(Lyf;B)V")
	public static final void chat_clear(ClientScriptState arg0) {
		ChatHistory.clear();
	}

	@ObfuscatedName("xo.ahe(Lyf;S)V")
	public static final void chat_getfilter_private(ClientScriptState arg0) {
		if (Client.privateChatFilter == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.privateChatFilter.value;
		}
	}

	@ObfuscatedName("mj.ahs(Lyf;I)V")
	public static final void chat_setmode(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ServerConnection var2 = Client.getCurrentConnection();
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.CHAT_SETMODE, var2.randomOut);
		var3.buf.p1(var1);
		var2.queue(var3);
	}

	@ObfuscatedName("ki.aht(Lyf;I)V")
	public static final void chat_sendpublic(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (Client.staffModLevel == 0 && (Client.field10951 && !Client.playerIsQuickChat || Client.loggedInQuickChat)) {
			return;
		}
		String var2 = var1.toLowerCase();
		byte colour = 0;
		if (var2.startsWith(LocalisedText.CHATCOL0.forLang(Language.EN))) {
			colour = 0;
			var1 = var1.substring(LocalisedText.CHATCOL0.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL1.forLang(Language.EN))) {
			colour = 1;
			var1 = var1.substring(LocalisedText.CHATCOL1.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL2.forLang(Language.EN))) {
			colour = 2;
			var1 = var1.substring(LocalisedText.CHATCOL2.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL3.forLang(Language.EN))) {
			colour = 3;
			var1 = var1.substring(LocalisedText.CHATCOL3.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL4.forLang(Language.EN))) {
			colour = 4;
			var1 = var1.substring(LocalisedText.CHATCOL4.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL5.forLang(Language.EN))) {
			colour = 5;
			var1 = var1.substring(LocalisedText.CHATCOL5.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL6.forLang(Language.EN))) {
			colour = 6;
			var1 = var1.substring(LocalisedText.CHATCOL6.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL7.forLang(Language.EN))) {
			colour = 7;
			var1 = var1.substring(LocalisedText.CHATCOL7.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL8.forLang(Language.EN))) {
			colour = 8;
			var1 = var1.substring(LocalisedText.CHATCOL8.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL9.forLang(Language.EN))) {
			colour = 9;
			var1 = var1.substring(LocalisedText.CHATCOL9.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL10.forLang(Language.EN))) {
			colour = 10;
			var1 = var1.substring(LocalisedText.CHATCOL10.forLang(Language.EN).length());
		} else if (var2.startsWith(LocalisedText.CHATCOL11.forLang(Language.EN))) {
			colour = 11;
			var1 = var1.substring(LocalisedText.CHATCOL11.forLang(Language.EN).length());
		} else if (Client.language != Language.EN) {
			if (var2.startsWith(LocalisedText.CHATCOL0.forLang(Client.language))) {
				colour = 0;
				var1 = var1.substring(LocalisedText.CHATCOL0.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL1.forLang(Client.language))) {
				colour = 1;
				var1 = var1.substring(LocalisedText.CHATCOL1.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL2.forLang(Client.language))) {
				colour = 2;
				var1 = var1.substring(LocalisedText.CHATCOL2.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL3.forLang(Client.language))) {
				colour = 3;
				var1 = var1.substring(LocalisedText.CHATCOL3.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL4.forLang(Client.language))) {
				colour = 4;
				var1 = var1.substring(LocalisedText.CHATCOL4.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL5.forLang(Client.language))) {
				colour = 5;
				var1 = var1.substring(LocalisedText.CHATCOL5.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL6.forLang(Client.language))) {
				colour = 6;
				var1 = var1.substring(LocalisedText.CHATCOL6.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL7.forLang(Client.language))) {
				colour = 7;
				var1 = var1.substring(LocalisedText.CHATCOL7.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL8.forLang(Client.language))) {
				colour = 8;
				var1 = var1.substring(LocalisedText.CHATCOL8.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL9.forLang(Client.language))) {
				colour = 9;
				var1 = var1.substring(LocalisedText.CHATCOL9.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL10.forLang(Client.language))) {
				colour = 10;
				var1 = var1.substring(LocalisedText.CHATCOL10.forLang(Client.language).length());
			} else if (var2.startsWith(LocalisedText.CHATCOL11.forLang(Client.language))) {
				colour = 11;
				var1 = var1.substring(LocalisedText.CHATCOL11.forLang(Client.language).length());
			}
		}
		String var4 = var1.toLowerCase();
		byte effect = 0;
		if (var4.startsWith(LocalisedText.CHATEFFECT1.forLang(Language.EN))) {
			effect = 1;
			var1 = var1.substring(LocalisedText.CHATEFFECT1.forLang(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.CHATEFFECT2.forLang(Language.EN))) {
			effect = 2;
			var1 = var1.substring(LocalisedText.CHATEFFECT2.forLang(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.CHATEFFECT3.forLang(Language.EN))) {
			effect = 3;
			var1 = var1.substring(LocalisedText.CHATEFFECT3.forLang(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.CHATEFFECT4.forLang(Language.EN))) {
			effect = 4;
			var1 = var1.substring(LocalisedText.CHATEFFECT4.forLang(Language.EN).length());
		} else if (var4.startsWith(LocalisedText.CHATEFFECT5.forLang(Language.EN))) {
			effect = 5;
			var1 = var1.substring(LocalisedText.CHATEFFECT5.forLang(Language.EN).length());
		} else if (Client.language != Language.EN) {
			if (var4.startsWith(LocalisedText.CHATEFFECT1.forLang(Client.language))) {
				effect = 1;
				var1 = var1.substring(LocalisedText.CHATEFFECT1.forLang(Client.language).length());
			} else if (var4.startsWith(LocalisedText.CHATEFFECT2.forLang(Client.language))) {
				effect = 2;
				var1 = var1.substring(LocalisedText.CHATEFFECT2.forLang(Client.language).length());
			} else if (var4.startsWith(LocalisedText.CHATEFFECT3.forLang(Client.language))) {
				effect = 3;
				var1 = var1.substring(LocalisedText.CHATEFFECT3.forLang(Client.language).length());
			} else if (var4.startsWith(LocalisedText.CHATEFFECT4.forLang(Client.language))) {
				effect = 4;
				var1 = var1.substring(LocalisedText.CHATEFFECT4.forLang(Client.language).length());
			} else if (var4.startsWith(LocalisedText.CHATEFFECT5.forLang(Client.language))) {
				effect = 5;
				var1 = var1.substring(LocalisedText.CHATEFFECT5.forLang(Client.language).length());
			}
		}
		ServerConnection var6 = Client.getCurrentConnection();
		ClientMessage var7 = ClientMessage.createMessage(ClientProt.MESSAGE_PUBLIC, var6.randomOut);
		var7.buf.p1(0);
		int var8 = var7.buf.pos;
		var7.buf.p1(colour);
		var7.buf.p1(effect);
		WordPack.encode(var7.buf, var1);
		var7.buf.psize1(var7.buf.pos - var8);
		var6.queue(var7);
	}

	@ObfuscatedName("iw.ahi(Lyf;I)V")
	public static final void chat_sendprivate(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		if (Client.staffModLevel == 0 && (Client.field10951 && !Client.playerIsQuickChat || Client.loggedInQuickChat)) {
			return;
		}
		ServerConnection var3 = Client.getCurrentConnection();
		ClientMessage var4 = ClientMessage.createMessage(ClientProt.MESSAGE_PRIVATE, var3.randomOut);
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
		if (Client.localPlayerEntity == null || Client.localPlayerEntity.name == null) {
			var1 = "";
		} else {
			var1 = Client.localPlayerEntity.getNameWithExtras(true);
		}
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("fs.air(Lyf;I)V")
	public static final void chat_getfilter_trade(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.tradeChatFilter;
	}

	@ObfuscatedName("wq.aix(Lyf;I)V")
	public static final void chat_gethistorylength(ClientScriptState arg0) {
		arg0.isp--;
		int var1 = arg0.intStack[arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ChatHistory.length(var1);
	}

	@ObfuscatedName("oh.ait(Lyf;I)V")
	public static final void chat_getnextuid(ClientScriptState arg0) {
		arg0.isp--;
		int var1 = arg0.intStack[arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ChatHistory.nextUid(var1);
	}

	@ObfuscatedName("hc.aiq(Lyf;I)V")
	public static final void chat_getprevuid(ClientScriptState arg0) {
		arg0.isp--;
		int var1 = arg0.intStack[arg0.isp];
		arg0.intStack[++arg0.isp - 1] = ChatHistory.previousUid(var1);
	}

	@ObfuscatedName("abv.aii(Lyf;I)V")
	public static final void chat_playername_unfiltered(ClientScriptState arg0) {
		String var1;
		if (Client.localPlayerEntity == null || Client.localPlayerEntity.name == null) {
			var1 = "";
		} else {
			var1 = Client.localPlayerEntity.getName(false);
		}
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("fl.aia(Lyf;I)V")
	public static final void chatcat_getdesc(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = Client.quickChatCatTypeList.list(var1).description;
	}

	@ObfuscatedName("tr.ais(Lyf;I)V")
	public static final void chatcat_getsubcatcount(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		QuickChatCatType var2 = Client.quickChatCatTypeList.list(var1);
		if (var2.subCategories == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.subCategories.length;
		}
	}

	@ObfuscatedName("ir.aiy(Lyf;B)V")
	public static final void chatcat_getsubcat(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		QuickChatCatType var3 = Client.quickChatCatTypeList.list(var1);
		int var4 = var3.subCategories[var2];
		arg0.intStack[++arg0.isp - 1] = var4;
	}

	@ObfuscatedName("qa.aio(Lyf;B)V")
	public static final void chatcat_getphrasecount(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		QuickChatCatType var2 = Client.quickChatCatTypeList.list(var1);
		if (var2.phrases == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.phrases.length;
		}
	}

	@ObfuscatedName("hh.aig(Lyf;B)V")
	public static final void chatcat_getphrase(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.quickChatCatTypeList.list(var1).phrases[var2];
	}

	@ObfuscatedName("ho.aid(Lyf;S)V")
	public static final void chatphrase_gettext(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = Client.quickChatPhraseTypeList.list(var1).getText();
	}

	@ObfuscatedName("sv.aif(Lyf;B)V")
	public static final void chatphrase_getautoresponsecount(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		QuickChatPhraseType var2 = Client.quickChatPhraseTypeList.list(var1);
		if (var2.autoResponses == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.autoResponses.length;
		}
	}

	@ObfuscatedName("la.ail(Lyf;B)V")
	public static final void chatphrase_getautoresponse(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.quickChatPhraseTypeList.list(var1).autoResponses[var2];
	}

	@ObfuscatedName("fi.aiw(Lyf;I)V")
	public static final void activechatphrase_prepare(ClientScriptState arg0) {
		arg0.activeChatPhrase = new QuickChatPhrase();
		arg0.activeChatPhrase.id = arg0.intStack[--arg0.isp];
		arg0.activeChatPhrase.quickChatPhraseType = Client.quickChatPhraseTypeList.list(arg0.activeChatPhrase.id);
		arg0.activeChatPhrase.dynamics = new int[arg0.activeChatPhrase.quickChatPhraseType.length()];
	}

	@ObfuscatedName("jr.aiz(Lyf;I)V")
	public static final void activechatphrase_send(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ServerConnection var2 = Client.getCurrentConnection();
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.MESSAGE_QUICKCHAT_PUBLIC, var2.randomOut);
		var3.buf.p1(0);
		int var4 = var3.buf.pos;
		var3.buf.p1(var1);
		var3.buf.p2(arg0.activeChatPhrase.id);
		arg0.activeChatPhrase.quickChatPhraseType.putDynamics(var3.buf, arg0.activeChatPhrase.dynamics);
		var3.buf.psize1(var3.buf.pos - var4);
		var2.queue(var3);
	}

	@ObfuscatedName("qh.aim(Lyf;B)V")
	public static final void activechatphrase_sendprivate(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		ServerConnection var2 = Client.getCurrentConnection();
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.MESSAGE_QUICKCHAT_PRIVATE, var2.randomOut);
		var3.buf.p1(0);
		int var4 = var3.buf.pos;
		var3.buf.pjstr(var1);
		var3.buf.p2(arg0.activeChatPhrase.id);
		arg0.activeChatPhrase.quickChatPhraseType.putDynamics(var3.buf, arg0.activeChatPhrase.dynamics);
		var3.buf.psize1(var3.buf.pos - var4);
		var2.queue(var3);
	}

	@ObfuscatedName("atf.aie(Lyf;I)V")
	public static final void chatcat_getsubcatshortcut(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.quickChatCatTypeList.list(var1).subCategoriesShortcuts[var2];
	}

	@ObfuscatedName("xr.aic(Lyf;I)V")
	public static final void chatcat_getphraseshortcut(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.quickChatCatTypeList.list(var1).phrasesShortcuts[var2];
	}

	@ObfuscatedName("wg.aij(Lyf;I)V")
	public static final void chatcat_findsubcatbyshortcut(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var2 == -1) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.quickChatCatTypeList.list(var1).getSubCategoryByShortcut((char) var2);
		}
	}

	@ObfuscatedName("rl.aik(Lyf;I)V")
	public static final void chatcat_findphrasebyshortcut(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var2 == -1) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.quickChatCatTypeList.list(var1).getPhraseByShortcut((char) var2);
		}
	}

	@ObfuscatedName("hi.aih(Lyf;I)V")
	public static final void chatphrase_getdynamiccommandcount(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.quickChatPhraseTypeList.list(var1).length();
	}

	@ObfuscatedName("rc.aip(Lyf;I)V")
	public static final void chatphrase_getdynamiccommand(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = Client.quickChatPhraseTypeList.list(var1).getDynamicCommand(var2).id;
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("dn.aiu(Lyf;I)V")
	public static final void activechatphrase_setdynamicint(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.activeChatPhrase.dynamics[var1] = var2;
	}

	@ObfuscatedName("ek.aib(Lyf;I)V")
	public static final void activechatphrase_setdynamicobj(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.activeChatPhrase.dynamics[var1] = var2;
	}

	@ObfuscatedName("aaa.ain(Lyf;I)V")
	public static final void chatphrase_getdynamiccommandparam_enum(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		QuickChatPhraseType var4 = Client.quickChatPhraseTypeList.list(var1);
		if (var4.getDynamicCommand(var2).id != 0) {
			throw new RuntimeException("bad command");
		}
		arg0.intStack[++arg0.isp - 1] = var4.method19506(var2, var3);
	}

	@ObfuscatedName("agu.aiv(Lyf;I)V")
	public static final void chatphrase_find(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		boolean var2 = arg0.intStack[--arg0.isp] == 1;
		arg0.intStack[++arg0.isp - 1] = Client.findChatPhrases(var1, var2);
	}

	@ObfuscatedName("yr.aja(Lyf;I)V")
	public static final void chatphrase_findnext(ClientScriptState arg0) {
		if (Client.chatPhraseFindResults == null || Client.chatPhraseFindResultsIndex >= Client.chatPhraseFindResults.length) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Client.chatPhraseFindResults[++Client.chatPhraseFindResultsIndex - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("hr.ajp(Lyf;B)V")
	public static final void chatphrase_findrestart(ClientScriptState arg0) {
		Client.chatPhraseFindResultsIndex = 0;
	}

	@ObfuscatedName("aos.ajy(Lyf;I)V")
	public static final void keyheld_alt(ClientScriptState arg0) {
		if (Client.keyboard.keyheld(86)) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("er.ajs(Lyf;B)V")
	public static final void keyheld_ctrl(ClientScriptState arg0) {
		if (Client.keyboard.keyheld(82)) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("amt.ajv(Lyf;B)V")
	public static final void keyheld_shift(ClientScriptState arg0) {
		if (Client.keyboard.keyheld(81)) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("ql.ajk(Lyf;I)V")
	public static final void method7233(ClientScriptState arg0) {
		arg0.isp -= 2;
		arg0.osp--;
	}

	@ObfuscatedName("kz.ajg(Lyf;I)V")
	public static final void method5129(ClientScriptState arg0) {
	}

	@ObfuscatedName("tc.ajh(Lyf;I)V")
	public static final void method8435(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
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
		arg0.intStack[++arg0.isp - 1] = 0;
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
		arg0.intStack[++arg0.isp - 1] = 0;
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
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("je.ajo(Lyf;I)V")
	public static final void worldmap_3dview_settextfont(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("rs.ajt(Lyf;B)V")
	public static final void worldmap_3dview_gettextfont(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("gk.ajw(Lyf;I)V")
	public static final void worldmap_3dview_getscreenposition(ClientScriptState arg0) {
		arg0.isp -= 2;
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("rp.ajx(Lyf;I)V")
	public static final void worldmap_setzoom(ClientScriptState arg0) {
		ClientWorldMap.setZoom(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("im.ajf(Lyf;I)V")
	public static final void worldmap_getzoom(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ClientWorldMap.getZoom();
	}

	@ObfuscatedName("hi.ajm(Lyf;I)V")
	public static final void worldmap_setmap(ClientScriptState arg0) {
		ClientWorldMap.setMap(arg0.intStack[--arg0.isp], -1, -1, false);
	}

	@ObfuscatedName("uu.aje(Lyf;I)V")
	public static final void worldmap_getmap(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		WorldMapAreaMetadata var2 = WorldMap.getMap(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.id;
		}
	}

	@ObfuscatedName("je.ajl(Lyf;I)V")
	public static final void worldmap_getmapname(ClientScriptState arg0) {
		WorldMapAreaMetadata var1 = WorldMap.getMapByName(arg0.intStack[--arg0.isp]);
		if (var1 == null || var1.mapName == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var1.mapName;
		}
	}

	@ObfuscatedName("tw.ajr(Lyf;I)V")
	public static final void worldmap_getsize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ClientWorldMap.field3121;
		arg0.intStack[++arg0.isp - 1] = ClientWorldMap.field4603;
	}

	@ObfuscatedName("vz.akn(Lyf;B)V")
	public static final void worldmap_getdisplayposition(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ClientWorldMap.field11443 + WorldMap.field6786;
		arg0.intStack[++arg0.isp - 1] = ClientWorldMap.field11654 + WorldMap.field6808;
	}

	@ObfuscatedName("wo.ako(Lyf;B)V")
	public static final void worldmap_getconfigorigin(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		WorldMapAreaMetadata var2 = WorldMap.getMapByName(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.configOrigin;
		}
	}

	@ObfuscatedName("pn.akz(Lyf;B)V")
	public static final void worldmap_getconfigsize(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		WorldMapAreaMetadata var2 = WorldMap.getMapByName(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field12358 - var2.field12357;
			arg0.intStack[++arg0.isp - 1] = var2.field12360 - var2.field12361;
		}
	}

	@ObfuscatedName("alw.akf(Lyf;I)V")
	public static final void worldmap_getconfigbounds(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		WorldMapAreaMetadata var2 = WorldMap.getMapByName(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field12357;
			arg0.intStack[++arg0.isp - 1] = var2.field12361;
			arg0.intStack[++arg0.isp - 1] = var2.field12358;
			arg0.intStack[++arg0.isp - 1] = var2.field12360;
		}
	}

	@ObfuscatedName("k.akq(Lyf;I)V")
	public static final void worldmap_listelement_start(ClientScriptState arg0) {
		WorldMapElement var1 = ClientWorldMap.method9829();
		if (var1 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1.field11446;
			int var2 = var1.field11447 << 28 | var1.field11448 + WorldMap.field6786 << 14 | var1.field11452 + WorldMap.field6808;
			arg0.intStack[++arg0.isp - 1] = var2;
		}
	}

	@ObfuscatedName("ux.akc(Lyf;I)V")
	public static final void worldmap_listelement_next(ClientScriptState arg0) {
		WorldMapElement var1 = ClientWorldMap.method13882();
		if (var1 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1.field11446;
			int var2 = var1.field11447 << 28 | var1.field11448 + WorldMap.field6786 << 14 | var1.field11452 + WorldMap.field6808;
			arg0.intStack[++arg0.isp - 1] = var2;
		}
	}

	@ObfuscatedName("q.aki(Lyf;B)V")
	public static final void worldmap_jumptosourcecoord(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		WorldMapAreaMetadata var2 = ClientWorldMap.method17877();
		if (var2 != null) {
			boolean var3 = var2.method19471(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, result);
			if (var3) {
				ClientWorldMap.jumpToDisplayCoord(result[1], result[2]);
			}
		}
	}

	@ObfuscatedName("ys.akw(Lyf;I)V")
	public static final void worldmap_jumptosourcecoord_instant(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		WorldMapAreaMetadata var2 = ClientWorldMap.method17877();
		if (var2 != null) {
			boolean var3 = var2.method19471(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, result);
			if (var3) {
				ClientWorldMap.jumpToDisplayCoordInstant(result[1], result[2]);
			}
		}
	}

	@ObfuscatedName("uc.akp(Lyf;I)V")
	public static final void worldmap_coordinmap(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		SecondaryLinkedList var3 = WorldMap.method8513(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
		boolean var4 = false;
		for (WorldMapAreaMetadata var5 = (WorldMapAreaMetadata) var3.peekFront(); var5 != null; var5 = (WorldMapAreaMetadata) var3.prev()) {
			if (var5.id == var2) {
				var4 = true;
				break;
			}
		}
		if (var4) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("dk.akr(Lyf;I)V")
	public static final void worldmap_getconfigzoom(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		WorldMapAreaMetadata var2 = WorldMap.getMapByName(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.configZoom;
		}
	}

	@ObfuscatedName("xi.aku(Lyf;B)V")
	public static final void worldmap_isloaded(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ClientWorldMap.loading == 100 ? 1 : 0;
	}

	@ObfuscatedName("agh.akh(Lyf;I)V")
	public static final void worldmap_jumptodisplaycoord(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ClientWorldMap.jumpToDisplayCoord(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
	}

	@ObfuscatedName("ua.akx(Lyf;I)V")
	public static final void worldmap_jumptodisplaycoord_instant(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ClientWorldMap.jumpToDisplayCoordInstant(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
	}

	@ObfuscatedName("vh.akl(Lyf;B)V")
	public static final void worldmap_getsourceposition(ClientScriptState arg0) {
		WorldMapAreaMetadata var1 = ClientWorldMap.method17877();
		if (var1 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
			return;
		}
		boolean var2 = var1.method19482(ClientWorldMap.field11443 + WorldMap.field6786, ClientWorldMap.field11654 + WorldMap.field6808, result);
		if (var2) {
			arg0.intStack[++arg0.isp - 1] = result[1];
			arg0.intStack[++arg0.isp - 1] = result[2];
		} else {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
		}
	}

	@ObfuscatedName("xo.ake(Lyf;B)V")
	public static final void worldmap_setmap_coord(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ClientWorldMap.setMap(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, false);
	}

	@ObfuscatedName("vq.akj(Lyf;I)V")
	public static final void worldmap_getdisplaycoord(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		WorldMapAreaMetadata var2 = ClientWorldMap.method17877();
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
			return;
		}
		boolean var3 = var2.method19471(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, result);
		if (var3) {
			arg0.intStack[++arg0.isp - 1] = result[1];
			arg0.intStack[++arg0.isp - 1] = result[2];
		} else {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
		}
	}

	@ObfuscatedName("dy.aky(Lyf;I)V")
	public static final void worldmap_getsourcecoord(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		WorldMapAreaMetadata var2 = ClientWorldMap.method17877();
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
			return;
		}
		boolean var3 = var2.method19482(var1 >> 14 & 0x3FFF, var1 & 0x3FFF, result);
		if (var3) {
			arg0.intStack[++arg0.isp - 1] = result[1];
			arg0.intStack[++arg0.isp - 1] = result[2];
		} else {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
		}
	}

	@ObfuscatedName("kb.aka(Lyf;B)V")
	public static final void worldmap_flashelement(ClientScriptState arg0) {
		ClientWorldMap.flashElement(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("yo.akd(Lyf;I)V")
	public static final void worldmap_setmap_coord_override(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ClientWorldMap.setMap(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, true);
	}

	@ObfuscatedName("apc.akg(Lyf;B)V")
	public static final void worldmap_disableelements(ClientScriptState arg0) {
		ClientWorldMap.disableElements = arg0.intStack[--arg0.isp] == 1;
	}

	@ObfuscatedName("vl.aks(Lyf;I)V")
	public static final void worldmap_getdisableelements(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ClientWorldMap.disableElements ? 1 : 0;
	}

	@ObfuscatedName("xf.akv(Lyf;I)V")
	public static final void worldmap_flashelementcategory(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ClientWorldMap.flashElementCategory(var1);
	}

	@ObfuscatedName("tc.akk(Lyf;I)V")
	public static final void worldmap_disableelementcategory(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		if (ClientWorldMap.field11668 == null) {
			return;
		}
		Node var3 = ClientWorldMap.field11668.get((long) var1);
		if (var3 != null && !var2) {
			var3.unlink();
		} else if (var3 == null && var2) {
			Node var4 = new Node();
			ClientWorldMap.field11668.put(var4, (long) var1);
		}
	}

	@ObfuscatedName("gf.akm(Lyf;I)V")
	public static final void worldmap_getdisableelementcategory(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (ClientWorldMap.field11668 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			Node var2 = ClientWorldMap.field11668.get((long) var1);
			arg0.intStack[++arg0.isp - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("wd.akt(Lyf;I)V")
	public static final void worldmap_disableelement(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		if (ClientWorldMap.field11667 == null) {
			return;
		}
		Node var3 = ClientWorldMap.field11667.get((long) var1);
		if (var3 != null && !var2) {
			var3.unlink();
		} else if (var3 == null && var2) {
			Node var4 = new Node();
			ClientWorldMap.field11667.put(var4, (long) var1);
		}
	}

	@ObfuscatedName("sv.akb(Lyf;I)V")
	public static final void worldmap_getdisableelement(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (ClientWorldMap.field11667 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			Node var2 = ClientWorldMap.field11667.get((long) var1);
			arg0.intStack[++arg0.isp - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("fd.als(Lyf;I)V")
	public static final void worldmap_getcurrentmap(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = WorldMap.currentWorldMap == null ? -1 : WorldMap.currentWorldMap.id;
	}

	@ObfuscatedName("sl.alw(Lyf;B)V")
	public static final void worldmap_findnearestelement(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = var2 >> 14 & 0x3FFF;
		int var4 = var2 & 0x3FFF;
		int var5 = ClientWorldMap.getNearestElement(var1, var3, var4);
		if (var5 < 0) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var5;
		}
	}

	@ObfuscatedName("qe.ali(Lyf;B)V")
	public static final void worldmap_closemap(ClientScriptState arg0) {
		ClientWorldMap.closeMap();
	}

	@ObfuscatedName("ys.alu(Lyf;S)V")
	public static final void worldmap_disabletextsize(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
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
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 == 0) {
			arg0.intStack[++arg0.isp - 1] = ClientWorldMap.field11670 ? 1 : 0;
		} else if (var1 == 1) {
			arg0.intStack[++arg0.isp - 1] = ClientWorldMap.field11666 ? 1 : 0;
		} else if (var1 == 2) {
			arg0.intStack[++arg0.isp - 1] = ClientWorldMap.field11675 ? 1 : 0;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("hp.alm(Lyf;I)V")
	public static final void worldmap_disabletype(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		if (!ClientWorldMap.setDisableType(var1, var2)) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("aw.alk(Lyf;I)V")
	public static final void worldmap_getdisabletype(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = ClientWorldMap.getDisableType(var1);
		if (var2 < 0) {
			throw new RuntimeException();
		}
		arg0.intStack[++arg0.isp - 1] = var2;
	}

	@ObfuscatedName("z.aln(Lyf;B)V")
	public static final void fullscreen_enter(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Fullscreen.allowed) {
			Client.setWindowMode(3, var1, var2, false);
			arg0.intStack[++arg0.isp - 1] = GameShell.fsframe == null ? 0 : 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("wy.alj(Lyf;I)V")
	public static final void fullscreen_exit(ClientScriptState arg0) {
		if (Fullscreen.allowed && GameShell.fsframe != null) {
			Client.setWindowMode(Client.preferences.windowMode.getValue(), -1, -1, false);
		}
	}

	@ObfuscatedName("acb.all(Lyf;I)V")
	public static final void fullscreen_modecount(ClientScriptState arg0) {
		if (Fullscreen.allowed) {
			FullscreenMode[] var1 = Client.getFullscreenModes();
			arg0.intStack[++arg0.isp - 1] = var1.length;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("wt.alg(Lyf;B)V")
	public static final void fullscreen_getmode(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Fullscreen.allowed) {
			FullscreenMode[] var2 = Client.getFullscreenModes();
			arg0.intStack[++arg0.isp - 1] = var2[var1].width;
			arg0.intStack[++arg0.isp - 1] = var2[var1].height;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("kb.alb(Lyf;I)V")
	public static final void fullscreen_lastmode(ClientScriptState arg0) {
		int var1 = GameShell.lastFullscreenWidth;
		int var2 = GameShell.lastFullscreenHeight;
		int var3 = -1;
		if (Fullscreen.allowed) {
			FullscreenMode[] var4 = Client.getFullscreenModes();
			for (int var5 = 0; var5 < var4.length; var5++) {
				FullscreenMode var6 = var4[var5];
				if (var6.width == var1 && var6.height == var2) {
					var3 = var5;
					break;
				}
			}
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("qi.ale(Lyf;S)V")
	public static final void getwindowmode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.getWindowMode();
	}

	@ObfuscatedName("et.ald(Lyf;I)V")
	public static final void setwindowmode(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 >= 1 && var1 <= 2) {
			Client.setWindowMode(var1, -1, -1, false);
		}
	}

	@ObfuscatedName("xa.alz(Lyf;B)V")
	public static final void getdefaultwindowmode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.windowMode.getValue();
	}

	@ObfuscatedName("uw.alv(Lyf;I)V")
	public static final void setdefaultwindowmode(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 >= 1 && var1 <= 2) {
			Client.preferences.setPreference(Client.preferences.windowMode, var1);
			Client.preferences.setPreference(Client.preferences.maxScreenSize2, var1);
			Preferences.save();
		}
	}

	@ObfuscatedName("aja.alq(Lyf;B)V")
	public static final void openurl(ClientScriptState arg0) {
		arg0.osp -= 2;
		openUrl((String) arg0.objectStack[arg0.osp], (String) arg0.objectStack[arg0.osp + 1], "", arg0.intStack[--arg0.isp] == 1, false);
	}

	@ObfuscatedName("va.ala(Lyf;I)V")
	public static final void urlencode(ClientScriptState arg0) {
		CharSequence var1 = (CharSequence) arg0.objectStack[--arg0.osp];
		arg0.objectStack[++arg0.osp - 1] = WebTools.urlencode(var1);
	}

	@ObfuscatedName("ab.alf(Lyf;I)V")
	public static final void spline_new(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var1 >= 0 && var1 < 2) {
			Client.cutsceneSpline[var1] = new int[var2 << 1][4];
		}
	}

	@ObfuscatedName("wv.alc(Lyf;I)V")
	public static final void spline_addpoint(ClientScriptState arg0) {
		arg0.isp -= 7;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1] << 1;
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = arg0.intStack[arg0.isp + 4];
		int var6 = arg0.intStack[arg0.isp + 5];
		int var7 = arg0.intStack[arg0.isp + 6];
		if (var1 >= 0 && var1 < 2 && Client.cutsceneSpline[var1] != null && var2 >= 0 && var2 < Client.cutsceneSpline[var1].length) {
			Client.cutsceneSpline[var1][var2] = new int[] { (var3 >> 14 & 0x3FFF) << 9, var4 << 2, (var3 & 0x3FFF) << 9, var7 };
			Client.cutsceneSpline[var1][var2 + 1] = new int[] { (var5 >> 14 & 0x3FFF) << 9, var6 << 2, (var5 & 0x3FFF) << 9 };
		}
	}

	@ObfuscatedName("ff.alp(Lyf;I)V")
	public static final void spline_length(ClientScriptState arg0) {
		int var1 = Client.cutsceneSpline[arg0.intStack[--arg0.isp]].length >> 1;
		arg0.intStack[++arg0.isp - 1] = var1;
	}

	@ObfuscatedName("eg.alt(Lyf;I)V")
	public static final void quit(ClientScriptState arg0) {
		if (Fullscreen.allowed && GameShell.fsframe != null) {
			Client.setWindowMode(Client.preferences.windowMode.getValue(), -1, -1, false);
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
		if (Client.hostNameProvider != null) {
			var1 = Client.hostNameProvider.method544();
		}
		if (var1 == null) {
			var1 = "";
		}
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("ud.alh(Lyf;I)V")
	public static final void openurl_nologin(ClientScriptState arg0) {
		if (Fullscreen.allowed && GameShell.fsframe != null) {
			Client.setWindowMode(Client.preferences.windowMode.getValue(), -1, -1, false);
		}
		String var1 = (String) arg0.objectStack[--arg0.osp];
		boolean var2 = arg0.intStack[--arg0.isp] == 1;
		String var3 = Client.method7363() + var1;
		Browser.openUrl(var3, var2, Client.field10784);
	}

	@ObfuscatedName("dm.alr(Lyf;I)V")
	public static final void openurlraw(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		boolean var2 = arg0.intStack[--arg0.isp] == 1;
		Browser.openUrl(var1, var2, Client.field10784);
	}

	@ObfuscatedName("yg.alx(Lyf;S)V")
	public static final void writeconsole(ClientScriptState arg0) {
		System.out.println(arg0.objectStack[--arg0.osp]);
	}

	@ObfuscatedName("fi.ams(Lyf;I)V")
	public static final void formatminimenu(ClientScriptState arg0) {
		arg0.isp -= 12;
		MiniMenu.close();
		MiniMenu.method7617();
		MiniMenu.field7676 = arg0.intStack[arg0.isp];
		MiniMenu.field4488 = arg0.intStack[arg0.isp + 1];
		MiniMenu.field6708 = arg0.intStack[arg0.isp + 2];
		MiniMenu.field11830 = arg0.intStack[arg0.isp + 3];
		MiniMenu.field12340 = arg0.intStack[arg0.isp + 4];
		MiniMenu.field740 = arg0.intStack[arg0.isp + 5];
		MiniMenu.field11642 = arg0.intStack[arg0.isp + 6];
		MiniMenu.field1748 = arg0.intStack[arg0.isp + 7];
		MiniMenu.field1847 = arg0.intStack[arg0.isp + 8];
		MiniMenu.field1266 = arg0.intStack[arg0.isp + 9];
		MiniMenu.field2901 = arg0.intStack[arg0.isp + 10];
		MiniMenu.field8463 = arg0.intStack[arg0.isp + 11];
		Client.spritesJs5.loadFile(MiniMenu.field12340);
		Client.spritesJs5.loadFile(MiniMenu.field740);
		Client.spritesJs5.loadFile(MiniMenu.field11642);
		Client.spritesJs5.loadFile(MiniMenu.field1748);
		Client.spritesJs5.loadFile(MiniMenu.field1847);
		Client.spritesJs5.loadFile(MiniMenu.field8463);
		Client.fontmetricsJs5.loadFile(MiniMenu.field8463);
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
		MiniMenu.setFormattingDefault();
		MiniMenu.field564 = false;
	}

	@ObfuscatedName("nr.ama(Lyf;B)V")
	public static final void setdefaultcursors(ClientScriptState arg0) {
		arg0.isp -= 2;
		Client.field11038 = arg0.intStack[arg0.isp];
		Client.field10971 = arg0.intStack[arg0.isp + 1];
	}

	@ObfuscatedName("if.amg(Lyf;I)V")
	public static final void sethardcodedopcursors(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("gb.amy(Lyf;B)V")
	public static final void minimenuopen(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = MiniMenu.isOpen(var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("na.amn(Lyf;I)V")
	public static final void docheat(ClientScriptState arg0) {
		DeveloperConsole.doCheat((String) arg0.objectStack[--arg0.osp], false, false);
	}

	@ObfuscatedName("ah.amb(Lyf;I)V")
	public static final void notify_accountcreated(ClientScriptState arg0) {
		JavascriptFunction.ACCOUNT_CREATED.method6090();
	}

	@ObfuscatedName("adg.amu(Lyf;I)V")
	public static final void notify_accountcreatestarted(ClientScriptState arg0) {
		JavascriptFunction.ACCOUNT_CREATE_STARTED.method6090();
	}

	@ObfuscatedName("akw.amq(Lyf;I)V")
	public static final void getclipboard(ClientScriptState arg0) {
		String var1 = "";
		if (Client.clipboard != null) {
			Transferable var2 = Client.clipboard.getContents(null);
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
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("mj.amf(Lyf;I)V")
	public static final void setsubmenuminlength(ClientScriptState arg0) {
		MiniMenu.minLength = arg0.intStack[--arg0.isp];
	}

	@ObfuscatedName("ys.amk(Lyf;B)V")
	public static final void openurl_shim(ClientScriptState arg0) {
		arg0.osp -= 3;
		openUrl((String) arg0.objectStack[arg0.osp], (String) arg0.objectStack[arg0.osp + 1], (String) arg0.objectStack[arg0.osp + 2], arg0.intStack[--arg0.isp] == 1, true);
	}

	@ObfuscatedName("ev.amc(Lyf;I)V")
	public static final void has_html5(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("nv.amo(Lyf;I)V")
	public static final void has_nxt(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("acx.amm(Lyf;I)V")
	public static final void clienttype(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.clientType & 0x1;
	}

	@ObfuscatedName("ku.amz(Lyf;I)V")
	public static final void method5146(ClientScriptState arg0) {
		RuneScapeSetup.method4589();
	}

	@ObfuscatedName("ge.amh(Lyf;B)V")
	public static final void method3564(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = RuneScapeSetup.method312();
	}

	@ObfuscatedName("nd.amt(Lyf;S)V")
	public static final void is_gamescreen_state(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.isStateGame(Client.state) ? 1 : 0;
	}

	@ObfuscatedName("xm.amv(Lyf;I)V")
	public static final void cam_moveto(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		CoordGrid var5 = Client.world.getBase();
		Client.cameraMoveTo((var1 >> 14 & 0x3FFF) - var5.x, (var1 & 0x3FFF) - var5.z, var2 << 2, var3, var4, false);
		Client.field10902 = true;
	}

	@ObfuscatedName("s.amw(Lyf;I)V")
	public static final void cam_lookat(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		CoordGrid var5 = Client.world.getBase();
		Client.cameraLookAt((var1 >> 14 & 0x3FFF) - var5.x, (var1 & 0x3FFF) - var5.z, var2 << 2, var3, var4);
		Client.field10902 = true;
	}

	@ObfuscatedName("po.amd(Lyf;I)V")
	public static final void cam_movealong(ClientScriptState arg0) {
		arg0.isp -= 6;
		int var1 = arg0.intStack[arg0.isp];
		if (var1 >= 2) {
			throw new RuntimeException();
		}
		Client.field10904 = var1;
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var2 + 1 >= Client.cutsceneSpline[Client.field10904].length >> 1) {
			throw new RuntimeException();
		}
		Client.field10909 = var2 * 2;
		Client.field10976 = 0;
		Client.field10843 = arg0.intStack[arg0.isp + 2];
		Client.field10913 = arg0.intStack[arg0.isp + 3];
		int var3 = arg0.intStack[arg0.isp + 4];
		if (var3 >= 2) {
			throw new RuntimeException();
		}
		Client.field10908 = var3;
		int var4 = arg0.intStack[arg0.isp + 5];
		if (var4 + 1 >= Client.cutsceneSpline[Client.field10908].length >> 1) {
			throw new RuntimeException();
		}
		Client.field10932 = var4 * 4;
		Client.cameraState = 6;
		Client.field3538 = -1;
		Client.field810 = -1;
	}

	@ObfuscatedName("ua.amr(Lyf;I)V")
	public static final void cam_reset(ClientScriptState arg0) {
		Client.cameraReset(Client.getDefaultCameraState());
	}

	@ObfuscatedName("vx.aml(Lyf;I)V")
	public static final void cam_forceangle(ClientScriptState arg0) {
		arg0.isp -= 2;
		Client.cameraForceAngle(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], 0);
	}

	@ObfuscatedName("ke.amx(Lyf;I)V")
	public static final void cam_getangle_xa(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = (int) Client.orbitCameraPitch >> 3;
	}

	@ObfuscatedName("cs.ami(Lyf;B)V")
	public static final void cam_getangle_ya(ClientScriptState arg0) {
		if (Client.cameraState == 3) {
			arg0.intStack[++arg0.isp - 1] = (int) ((double) Client.cam2.method4719() * 2607.5945876176133D) >> 3;
		} else {
			arg0.intStack[++arg0.isp - 1] = (int) Client.orbitCameraYaw >> 3;
		}
	}

	@ObfuscatedName("vy.amp(Lyf;B)V")
	public static final void cam_inc_x(ClientScriptState arg0) {
		Client.cameraIncX();
	}

	@ObfuscatedName("ql.amj(Lyf;I)V")
	public static final void cam_dec_x(ClientScriptState arg0) {
		Client.cameraDecX();
	}

	@ObfuscatedName("sg.ane(Lyf;I)V")
	public static final void cam_inc_y(ClientScriptState arg0) {
		Client.cameraIncY();
	}

	@ObfuscatedName("vz.ann(Lyf;I)V")
	public static final void cam_dec_y(ClientScriptState arg0) {
		Client.cameraDecY();
	}

	@ObfuscatedName("vg.and(Lyf;I)V")
	public static final void cam_setfollowheight(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 < 0) {
			var1 = 0;
		}
		Client.cameraFollowHeight = Client.field11089 * 35 + var1;
	}

	@ObfuscatedName("jx.anf(Lyf;B)V")
	public static final void cam_getfollowheight(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.cameraFollowHeight - Client.field11089 * 35;
	}

	@ObfuscatedName("wv.anq(Lyf;B)V")
	public static final void cam_followcoord(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		CoordGrid var4 = Client.world.getBase();
		int var5 = var2 - var4.x;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 >= Client.world.getSizeX()) {
			var5 = Client.world.getSizeX();
		}
		int var6 = var3 - var4.z;
		if (var6 < 0) {
			var6 = 0;
		} else if (var6 >= Client.world.getSizeZ()) {
			var6 = Client.world.getSizeZ();
		}
		Client.field10892 = (var5 << 9) + 256;
		Client.field10893 = (var6 << 9) + 256;
		Client.cameraState = 4;
		Client.field3538 = -1;
		Client.field810 = -1;
		Client.field10902 = true;
	}

	@ObfuscatedName("j.anm(Lyf;I)V")
	public static final void cam_smoothreset(ClientScriptState arg0) {
		Client.cameraSmoothReset();
	}

	@ObfuscatedName("dz.any(Lyf;B)V")
	public static final void cam_removeroof(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 == -1) {
			Client.field810 = -1;
			Client.field3538 = -1;
			return;
		}
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		CoordGrid var4 = Client.world.getBase();
		int var5 = var2 - var4.x;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 >= Client.world.getSizeX()) {
			var5 = Client.world.getSizeX();
		}
		int var6 = var3 - var4.z;
		if (var6 < 0) {
			var6 = 0;
		} else if (var6 >= Client.world.getSizeZ()) {
			var6 = Client.world.getSizeZ();
		}
		Client.field810 = (var5 << 9) + 256;
		Client.field3538 = (var6 << 9) + 256;
	}

	@ObfuscatedName("fo.ang(Lyf;I)V")
	public static final void cam_modeisfollowplayer(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.cameraState == 2 ? 1 : 0;
	}

	@ObfuscatedName("sr.ana(Lyf;I)V")
	public static final void cam2_legacycam_ready(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 1;
	}

	@ObfuscatedName("fu.anv(Lyf;B)V")
	public static final void login_request(ClientScriptState arg0) {
		arg0.osp -= 3;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		String var3 = (String) arg0.objectStack[arg0.osp + 2];
		boolean var4 = arg0.intStack[--arg0.isp] == 1;
		LoginManager.requestLogin(var1, var2, var3, var4);
	}

	@ObfuscatedName("nv.anu(Lyf;B)V")
	public static final void cam2_setlookatmode(ClientScriptState arg0) throws CameraException {
		int var1 = arg0.intStack[--arg0.isp];
		Client.cam2.setLookatMode(LookatMode.of(var1), true);
		Client.field10902 = true;
	}

	@ObfuscatedName("nu.ant(Lyf;B)V")
	public static final void cam2_setpositionmode(ClientScriptState arg0) throws CameraException {
		int var1 = arg0.intStack[--arg0.isp];
		Client.cam2.setPositionMode(PositionMode.method1058(var1), true);
		Client.field10902 = true;
	}

	@ObfuscatedName("xe.anh(Lyf;I)V")
	public static final void cam2_setlookatacceleration(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Vector3 var3 = Vector3.create((float) var1, (float) var1, (float) var1);
		if (var3.x == -1.0F) {
			var3.x = Float.POSITIVE_INFINITY;
		}
		if (var3.y == -1.0F) {
			var3.y = Float.POSITIVE_INFINITY;
		}
		if (var3.z == -1.0F) {
			var3.z = Float.POSITIVE_INFINITY;
		}
		Client.cam2.setLookatAcceleration(var3);
		Client.cam2.setLookatAngularInterpolation((float) var2 / 1000.0F);
		var3.release();
	}

	@ObfuscatedName("wu.anp(Lyf;I)V")
	public static final void cam2_setpositionacceleration(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Vector3 var3 = Vector3.create((float) var1, (float) var1, (float) var1);
		if (var3.x == -1.0F) {
			var3.x = Float.POSITIVE_INFINITY;
		}
		if (var3.y == -1.0F) {
			var3.y = Float.POSITIVE_INFINITY;
		}
		if (var3.z == -1.0F) {
			var3.z = Float.POSITIVE_INFINITY;
		}
		Client.cam2.setPositionAcceleration(var3);
		Client.cam2.setPositionAngularInterpolation((float) var2 / 1000.0F);
		var3.release();
	}

	@ObfuscatedName("akb.anr(Lyf;I)V")
	public static final void cam2_setlookatmaxspeed(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		Vector3 var2 = Vector3.create((float) var1, (float) var1, (float) var1);
		Client.cam2.setLookatMaxSpeed(var2);
		var2.release();
	}

	@ObfuscatedName("uv.ank(Lyf;I)V")
	public static final void cam2_setpositionmaxspeed(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		Vector3 var2 = Vector3.create((float) var1, (float) var1, (float) var1);
		Client.cam2.setPositionMaxSpeed(var2);
		var2.release();
	}

	@ObfuscatedName("aca.anx(Lyf;I)V")
	public static final void cam2_setdepthplanes(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.cam2.setDepthPlanes((float) var1, (float) var2);
	}

	@ObfuscatedName("eu.anz(Lyf;B)V")
	public static final void cam2_setfieldofview(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.cam2.setFieldOfView((float) ((double) var1 * 3.141592653589793D * 2.0D / 16384.0D), (float) ((double) var2 * 3.141592653589793D * 2.0D / 16384.0D));
	}

	@ObfuscatedName("kl.anj(Lyf;I)V")
	public static final void cam2_setlookatpoint_point(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.objectStack[--arg0.osp];
		if (Client.cam2.getLookatMode() != LookatMode.POINT) {
			throw new RuntimeException();
		}
		LookatPoint var2 = (LookatPoint) Client.cam2.getLookat();
		var2.method18776(var1);
		Client.field10902 = true;
	}

	@ObfuscatedName("agz.anl(Lyf;I)V")
	public static final void cam2_setpositionpoint_point(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.objectStack[--arg0.osp];
		if (Client.cam2.getPositionMode() != PositionMode.POINT) {
			throw new RuntimeException();
		}
		PositionPoint var2 = (PositionPoint) Client.cam2.getPosition();
		var2.method16671(var1);
		Client.field10902 = true;
	}

	@ObfuscatedName("kj.ans(Lyf;I)V")
	public static final void cam2_getpositionpoint_point(ClientScriptState arg0) {
		if (Client.cam2.getPositionMode() != PositionMode.POINT) {
			throw new RuntimeException();
		}
		arg0.objectStack[++arg0.osp - 1] = Client.cam2.method4717();
	}

	@ObfuscatedName("hq.anc(Lyf;Lahm;I)V")
	public static final void cameraLookatEntity(ClientScriptState arg0, PathingEntity arg1) {
		arg0.isp -= 4;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		int var4 = arg0.intStack[arg0.isp + 2];
		boolean var5 = arg0.intStack[arg0.isp + 3] == 1;
		if (Client.cam2.getLookatMode() != LookatMode.ENTITY) {
			throw new RuntimeException();
		}
		LookatEntity var6 = (LookatEntity) Client.cam2.getLookat();
		if (arg1 != null) {
			var6.method18816(arg1, new Vector3((float) var2, (float) var3, (float) var4), var5);
		}
		Client.field10902 = true;
	}

	@ObfuscatedName("pj.anb(Lyf;B)V")
	public static final void cam2_setlookatentity_player(ClientScriptState arg0) {
		cameraLookatEntity(arg0, Client.localPlayerEntity);
	}

	@ObfuscatedName("as.anw(Lyf;I)V")
	public static final void cam2_setlookatentity_npc(ClientScriptState arg0) {
		cameraLookatEntity(arg0, arg0.activeEntity);
	}

	@ObfuscatedName("go.ano(Lyf;Lahm;I)V")
	public static final void cam2_setpositionentity(ClientScriptState arg0, PathingEntity arg1) {
		arg0.isp -= 7;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		int var4 = arg0.intStack[arg0.isp + 2];
		int var5 = arg0.intStack[arg0.isp + 3];
		int var6 = arg0.intStack[arg0.isp + 4];
		boolean var7 = arg0.intStack[arg0.isp + 5] == 1;
		int var8 = arg0.intStack[arg0.isp + 6];
		if (Client.cam2.getPositionMode() != PositionMode.ENTITY) {
			throw new RuntimeException();
		}
		PositionEntity var9 = (PositionEntity) Client.cam2.getPosition();
		Quaternion var10 = new Quaternion();
		Quaternion var11 = new Quaternion();
		var10.setToRotation(0.0F, 1.0F, 0.0F, (float) ((double) var6 * 3.141592653589793D * 2.0D / 16384.0D));
		Vector3 var12 = new Vector3(1.0F, 0.0F, 0.0F);
		var12.rotate(var10);
		var12.negate();
		var11.setToRotation(var12, (float) ((double) var5 * 3.141592653589793D * 2.0D / 16384.0D));
		var10.multiply(var11);
		CoordGrid var13 = Client.world.getBase();
		int var14 = var13.x << 9;
		int var15 = var13.z << 9;
		if (arg1 != null) {
			var9.method16683(arg1, new Vector3((float) var2, (float) var3, (float) var4), var10, var7, var8, Client.world.method7744().levelHeightmap, Client.world.getSceneLevelTileFlags(), var14, var15);
		}
		Client.field10902 = true;
	}

	@ObfuscatedName("bf.ani(Lyf;B)V")
	public static final void cam2_setpositionentity_player(ClientScriptState arg0) {
		cam2_setpositionentity(arg0, Client.localPlayerEntity);
	}

	@ObfuscatedName("pv.aou(Lyf;B)V")
	public static final void cam2_setpositionentity_npc(ClientScriptState arg0) {
		cam2_setpositionentity(arg0, arg0.activeEntity);
	}

	@ObfuscatedName("tv.aoy(Lyf;B)V")
	public static final void cam2_setfieldofviewscreen(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		float var4 = (float) (Math.atan((double) ((float) var1 / 2.0F / (float) var3)) * 2.0D);
		float var5 = (float) (Math.atan((double) ((float) var2 / 2.0F / (float) var3)) * 2.0D);
		Client.cam2.setFieldOfView(var4, var5);
	}

	@ObfuscatedName("gq.aoi(Lyf;I)V")
	public static final void cam2_setpositionspline_spline(ClientScriptState arg0) {
		if (!Client.cam2.getPositionMode().method4623()) {
			throw new RuntimeException();
		}
		PositionSpline var1 = (PositionSpline) Client.cam2.getPosition();
		var1.method16720(Client.field3178, -1, 0.0F);
		Client.field10902 = true;
	}

	@ObfuscatedName("aal.aow(Lyf;I)V")
	public static final void cam2_setlookatspline_spline(ClientScriptState arg0) {
		if (!Client.cam2.getLookatMode().method4602()) {
			throw new RuntimeException();
		}
		LookatSpline var1 = (LookatSpline) Client.cam2.getLookat();
		var1.method18832(Client.field3178, -1, 0.0F);
		Client.field10902 = true;
	}

	@ObfuscatedName("if.aob(Lyf;I)V")
	public static final void cam2_getcontrolmode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.cam2.getControlMode().index;
	}

	@ObfuscatedName("vw.aoo(Lyf;I)V")
	public static final void cam2_getlookatmode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.cam2.getLookatMode() == null ? -1 : Client.cam2.getLookatMode().id;
	}

	@ObfuscatedName("he.aos(Lyf;I)V")
	public static final void cam2_getpositionmode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.cam2.getPositionMode() == null ? -1 : Client.cam2.getPositionMode().index;
	}

	@ObfuscatedName("rp.aoc(Lyf;I)V")
	public static final void cam2_getpositionentity_angleoffsets(ClientScriptState arg0) {
		if (Client.cam2.getPositionMode() != PositionMode.ENTITY) {
			throw new RuntimeException();
		}
		PositionEntity var1 = (PositionEntity) Client.cam2.getPosition();
		arg0.intStack[++arg0.isp - 1] = (int) ((double) var1.method16693() * 2607.5945876176133D) & 0x3FFF;
		arg0.intStack[++arg0.isp - 1] = (int) ((double) var1.method16694() * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("qb.aod(Lyf;B)V")
	public static final void cam2_addeffect_shake(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		ShakeMode var4 = ShakeMode.of(var1);
		float var5 = (float) var2;
		if (ShakeMode.field2622 == var4 || ShakeMode.field2623 == var4 || ShakeMode.field2624 == var4) {
			var5 = Trig1.radians(var2);
		}
		Shake var6 = new Shake(Client.cam2.method16602(), var4, var5, (float) var3 / 1000.0F);
		Client.cam2.addEffect(var6);
		arg0.intStack[++arg0.isp - 1] = var6.id;
	}

	@ObfuscatedName("aaq.aok(Lyf;I)V")
	public static final void cam2_removeeffect(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Client.cam2.removeEffect(var1);
	}

	@ObfuscatedName("sn.aov(Lyf;B)V")
	public static final void cam2_removealleffects(ClientScriptState arg0) {
		Client.cam2.removeAllEffects();
	}

	@ObfuscatedName("ar.aor(Lyf;I)V")
	public static final void cam2_setlookatacceleration_axis(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		Vector3 var5 = Vector3.create((float) var1, (float) var2, (float) var3);
		if (var5.x == -1.0F) {
			var5.x = Float.POSITIVE_INFINITY;
		}
		if (var5.y == -1.0F) {
			var5.y = Float.POSITIVE_INFINITY;
		}
		if (var5.z == -1.0F) {
			var5.z = Float.POSITIVE_INFINITY;
		}
		Client.cam2.setLookatAcceleration(var5);
		Client.cam2.setLookatAngularInterpolation((float) var4 / 1000.0F);
		var5.release();
	}

	@ObfuscatedName("qn.aol(Lyf;S)V")
	public static final void cam2_setpositionacceleration_axis(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		Vector3 var5 = Vector3.create((float) var1, (float) var2, (float) var3);
		if (var5.x == -1.0F) {
			var5.x = Float.POSITIVE_INFINITY;
		}
		if (var5.y == -1.0F) {
			var5.y = Float.POSITIVE_INFINITY;
		}
		if (var5.z == -1.0F) {
			var5.z = Float.POSITIVE_INFINITY;
		}
		Client.cam2.setPositionAcceleration(var5);
		Client.cam2.setPositionAngularInterpolation((float) var4 / 1000.0F);
		var5.release();
	}

	@ObfuscatedName("x.aom(Lyf;B)V")
	public static final void cam2_setlookatmaxspeed_axis(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		Vector3 var4 = Vector3.create((float) var1, (float) var2, (float) var3);
		Client.cam2.setLookatMaxSpeed(var4);
		var4.release();
	}

	@ObfuscatedName("bc.aoj(Lyf;I)V")
	public static final void cam2_setpositionmaxspeed_axis(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		Vector3 var4 = Vector3.create((float) var1, (float) var2, (float) var3);
		Client.cam2.setPositionMaxSpeed(var4);
		var4.release();
	}

	@ObfuscatedName("aqy.aof(Lyf;B)V")
	public static final void cam2_getpositionentity_lookatangleoffsets(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.cam2.getPositionMode() != PositionMode.ENTITY || Client.cam2.getLookatMode() != LookatMode.ENTITY) {
			throw new RuntimeException();
		}
		PositionEntity var2 = (PositionEntity) Client.cam2.getPosition();
		LookatEntity var3 = (LookatEntity) Client.cam2.getLookat();
		Vector3 var4 = var2.method16691();
		Vector3 var5 = Vector3.create(var4);
		var5.y += var1;
		Vector3 var6 = Vector3.sub(var3.method14133(), var5);
		var6.normalise();
		float var7 = var2.method16692().length();
		RayTracing.computeSphereIntersections(var3.method14133(), var6, var4, var7, field8210);
		Object var8 = null;
		if (field8210[0] == null) {
			throw new RuntimeException("");
		}
		Vector3 var9;
		if (field8210[1] == null) {
			var9 = field8210[0];
		} else if (Vector3.sub(var3.method14133(), field8210[0]).length() < Vector3.sub(var3.method14133(), field8210[1]).length()) {
			var9 = field8210[1];
		} else {
			var9 = field8210[0];
		}
		float var10 = CameraHelpers.method9272(var4.x - var9.x, var4.z - var9.z);
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = (int) ((double) var10 * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("pz.aop(Lyf;I)V")
	public static final void cam2_getpositionentity_lookatangle(ClientScriptState arg0) {
		if (Client.cam2.getPositionMode() != PositionMode.ENTITY || Client.cam2.getLookatMode() != LookatMode.ENTITY) {
			throw new RuntimeException();
		}
		Vector3 var1 = ((PositionEntity) Client.cam2.getPosition()).method16691();
		Vector3 var2 = ((LookatEntity) Client.cam2.getLookat()).method18819();
		Vector3 var3 = Vector3.create(var1);
		var3.sub(var2);
		float var4 = CameraHelpers.method9272(var3.x, var3.z);
		arg0.intStack[++arg0.isp - 1] = (int) ((double) var4 * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("f.aog(Lyf;I)V")
	public static final void cam2_getpositionentity_lookatdistance(ClientScriptState arg0) {
		if (Client.cam2.getPositionMode() != PositionMode.ENTITY || Client.cam2.getLookatMode() != LookatMode.ENTITY) {
			throw new RuntimeException();
		}
		Vector3 var1 = ((PositionEntity) Client.cam2.getPosition()).method16691();
		Vector3 var2 = ((LookatEntity) Client.cam2.getLookat()).method18819();
		Vector3 var3 = Vector3.create(var1);
		var3.sub(var2);
		arg0.intStack[++arg0.isp - 1] = (int) var3.length();
	}

	@ObfuscatedName("qe.aoa(Lyf;I)V")
	public static final void cam2_setcollisionmode(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 2;
		boolean var1 = arg0.intStack[arg0.isp] == 1;
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		Client.cam2.setCollisionMode(var1, var2);
	}

	@ObfuscatedName("qf.aot(Lyf;I)V")
	public static final void cam2_setpositionpointcollision(ClientScriptState arg0) {
		if (Client.cam2.getPositionMode() != PositionMode.POINT) {
			throw new RuntimeException();
		}
		((PositionPoint) Client.cam2.getPosition()).setCollision(arg0.intStack[--arg0.isp] == 1);
	}

	@ObfuscatedName("dl.aoe(Lyf;I)V")
	public static final void cam2_addeffect_ztilt(ClientScriptState arg0) {
		float var1 = Trig1.radians(arg0.intStack[--arg0.isp]);
		ZTilt var2 = new ZTilt(Client.cam2.method16602(), var1);
		Client.cam2.addEffect(var2);
		arg0.intStack[++arg0.isp - 1] = var2.id;
	}

	@ObfuscatedName("mz.aon(Lyf;I)V")
	public static final void cam2_updateeffect_ztilt(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		float var2 = Trig1.radians(arg0.intStack[arg0.isp + 1]);
		CameraEffect var3 = Client.cam2.getEffect(var1);
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
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		float var2 = (float) arg0.intStack[arg0.isp + 1] / 1000.0F;
		Client.cam2.setTrailDistance(var1, var2);
	}

	@ObfuscatedName("wg.aox(Lyf;S)V")
	public static final void cam2_setlinearmovementmode(ClientScriptState arg0) throws CameraException {
		int var1 = arg0.intStack[--arg0.isp];
		CameraLinearMovementMode var2 = CameraLinearMovementMode.method17805(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Client.cam2.setLinearMovementMode(var2);
	}

	@ObfuscatedName("ur.aoq(Lyf;S)V")
	public static final void cam2_setspringproperties(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 4;
		float var1 = (float) arg0.intStack[arg0.isp];
		float var2 = (float) arg0.intStack[arg0.isp + 1];
		float var3 = (float) arg0.intStack[arg0.isp + 2];
		float var4 = (float) arg0.intStack[arg0.isp + 3] / 1000.0F;
		Client.cam2.setSpringProperties(Vector3.create(var1, var2, var3), var4);
	}

	@ObfuscatedName("qd.aoz(Lyf;I)V")
	public static final void cam2_setlookatangularinterpolation(ClientScriptState arg0) throws CameraException {
		Client.cam2.setLookatAngularInterpolation((float) arg0.intStack[--arg0.isp] / 1000.0F);
	}

	@ObfuscatedName("qj.api(Lyf;B)V")
	public static final void cam2_setpositionangularinterpolation(ClientScriptState arg0) throws CameraException {
		Client.cam2.setPositionAngularInterpolation((float) arg0.intStack[--arg0.isp] / 1000.0F);
	}

	@ObfuscatedName("qo.apw(Lyf;I)V")
	public static final void cam2_setlookatspringproperties(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 4;
		float var1 = (float) arg0.intStack[arg0.isp];
		float var2 = (float) arg0.intStack[arg0.isp + 1];
		float var3 = (float) arg0.intStack[arg0.isp + 2];
		float var4 = (float) arg0.intStack[arg0.isp + 3] / 1000.0F;
		Client.cam2.setLookatSpringProperties(Vector3.create(var1, var2, var3), var4);
	}

	@ObfuscatedName("ajd.ape(Lyf;I)V")
	public static final void cam2_setpositionspringproperties(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 4;
		float var1 = (float) arg0.intStack[arg0.isp];
		float var2 = (float) arg0.intStack[arg0.isp + 1];
		float var3 = (float) arg0.intStack[arg0.isp + 2];
		float var4 = (float) arg0.intStack[arg0.isp + 3] / 1000.0F;
		Client.cam2.setPositionSpringProperties(Vector3.create(var1, var2, var3), var4);
	}

	@ObfuscatedName("rt.apq(Lyf;S)V")
	public static final void cam2_enable(ClientScriptState arg0) {
		boolean var1 = arg0.intStack[--arg0.isp] == 1;
		if (var1) {
			Client.cameraReset(3);
		} else {
			Client.cameraReset(2);
		}
	}

	@ObfuscatedName("ua.apm(Lyf;I)V")
	public static final void cam2_isenabled(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.cameraState == 3 ? 1 : 0;
	}

	@ObfuscatedName("ho.apy(Lyf;I)V")
	public static final void cam2_setsnapdistances(ClientScriptState arg0) throws CameraException {
		arg0.isp -= 3;
		Client.cam2.setSnapDistances((float) arg0.intStack[arg0.isp], (float) arg0.intStack[arg0.isp + 1], (float) arg0.intStack[arg0.isp + 2]);
	}

	@ObfuscatedName("eq.apj(Lyf;B)V")
	public static final void cam2_resetsnapdistances(ClientScriptState arg0) throws CameraException {
		Client.cam2.resetSnapDistances();
	}

	@ObfuscatedName("wg.apu(Lyf;I)V")
	public static final void cam2_setlookatorientation_vector(ClientScriptState arg0) {
		arg0.isp -= 3;
		if (Client.cam2.getLookatMode() != LookatMode.ORIENTATION) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.cam2.getLookat()).setVector(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], arg0.intStack[arg0.isp + 2]);
	}

	@ObfuscatedName("tt.apc(Lyf;I)V")
	public static final void cam2_setlookatorientation_yrotation(ClientScriptState arg0) {
		if (Client.cam2.getLookatMode() != LookatMode.ORIENTATION) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.cam2.getLookat()).setRotationY(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("ga.apg(Lyf;B)V")
	public static final void cam2_setlookatorientation_xrotation(ClientScriptState arg0) {
		if (Client.cam2.getLookatMode() != LookatMode.ORIENTATION) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.cam2.getLookat()).setRotationX(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("e.apx(Lyf;I)V")
	public static final void cam2_setlookatorientation_xmovement(ClientScriptState arg0) {
		if (Client.cam2.getLookatMode() != LookatMode.ORIENTATION) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.cam2.getLookat()).setMovementX(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("tl.apb(Lyf;I)V")
	public static final void cam2_setlookatorientation_zmovement(ClientScriptState arg0) {
		if (Client.cam2.getLookatMode() != LookatMode.ORIENTATION) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.cam2.getLookat()).setMovementZ(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("yu.apl(Lyf;I)V")
	public static final void cam2_setlookatorientation_maxdistanceclamping(ClientScriptState arg0) {
		arg0.isp -= 6;
		CoordFine var1 = (CoordFine) arg0.objectStack[--arg0.osp];
		if (Client.cam2.getLookatMode() != LookatMode.ORIENTATION) {
			throw new RuntimeException();
		}
		((LookatOrientation) Client.cam2.getLookat()).setMaxDistanceClamping(var1.method17853(), arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], arg0.intStack[arg0.isp + 2], arg0.intStack[arg0.isp + 3], arg0.intStack[arg0.isp + 4], arg0.intStack[arg0.isp + 5]);
	}

	@ObfuscatedName("eu.apr(Lyf;I)V")
	public static final void login_continue(ClientScriptState arg0) {
		LoginManager.continueLogin();
	}

	@ObfuscatedName("ek.apo(Lyf;I)V")
	public static final void login_resetreply(ClientScriptState arg0) {
		if (!LoginManager.isInProgress()) {
			LoginManager.resetLoginState();
		}
	}

	@ObfuscatedName("ag.apv(Lyf;I)V")
	public static final void create_availablerequest(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		AccountCreationManager.requestEmailAvailableCheck(var1);
	}

	@ObfuscatedName("pc.apd(Lyf;B)V")
	public static final void create_name_availablerequest(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		AccountCreationManager.requestDisplayNameAvailableCheck(var1);
	}

	@ObfuscatedName("aaj.apn(Lyf;I)V")
	public static final void create_suggest_name_request(ClientScriptState arg0) {
		AccountCreationManager.requestDisplayNameSuggestion();
	}

	@ObfuscatedName("ki.app(Lyf;B)V")
	public static final void create_connectrequest(ClientScriptState arg0) {
		AccountCreationManager.method2009();
	}

	@ObfuscatedName("ags.apz(Lyf;I)V")
	public static final void create_createrequest(ClientScriptState arg0) {
		arg0.osp -= 3;
		arg0.isp -= 2;
		AccountCreationManager.requestAccountCreation((String) arg0.objectStack[arg0.osp], (String) arg0.objectStack[arg0.osp + 1], arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1] == 1, (String) arg0.objectStack[arg0.osp + 2]);
	}

	@ObfuscatedName("sp.aph(Lyf;I)V")
	public static final void create_step_reached(ClientScriptState arg0) {
		AccountCreationManager.requestStatsLogging(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("xn.apt(Lyf;I)V")
	public static final void login_reply(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = LoginManager.enterGameReply;
	}

	@ObfuscatedName("yu.apa(Lyf;I)V")
	public static final void login_hoptime(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = LoginManager.hoptime * 2500;
	}

	@ObfuscatedName("ea.apf(Lyf;I)V")
	public static final void login_ban_duration(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = LoginManager.banDuration;
	}

	@ObfuscatedName("ahz.apk(Lyf;B)V")
	public static final void create_reply(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = AccountCreationManager.getReply().getId();
	}

	@ObfuscatedName("acl.aps(Lyf;I)V")
	public static final void create_email_validate_reply(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = AccountCreationManager.getEmailValidateReply().getId();
	}

	@ObfuscatedName("ge.aqd(Lyf;B)V")
	public static final void create_name_validate_reply(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = AccountCreationManager.getNameValidateReply().getId();
	}

	@ObfuscatedName("ake.aqv(Lyf;I)V")
	public static final void create_suggest_name_reply(ClientScriptState arg0) {
		SuggestNameReply var1 = AccountCreationManager.getSuggestNameReply();
		String var2 = AccountCreationManager.method10209();
		if (var2 == null) {
			var2 = "";
		}
		arg0.intStack[++arg0.isp - 1] = var1.getId();
		arg0.objectStack[++arg0.osp - 1] = var2;
	}

	@ObfuscatedName("qf.aqn(Lyf;I)V")
	public static final void create_connect_reply(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = AccountCreationManager.getConnectReply().getId();
	}

	@ObfuscatedName("if.aqm(Lyf;B)V")
	public static final void login_disallowresult(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = LoginManager.disallowResult;
	}

	@ObfuscatedName("qg.aqk(Lyf;I)V")
	public static final void lobby_entergame(ClientScriptState arg0) {
		LoginManager.enterGame((String) arg0.objectStack[--arg0.osp], arg0.intStack[--arg0.isp] == 1);
	}

	@ObfuscatedName("et.aqc(Lyf;I)V")
	public static final void lobby_entergamereply(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = LoginManager.enterGameReply;
	}

	@ObfuscatedName("vo.aqz(Lyf;I)V")
	public static final void lobby_enterlobby(ClientScriptState arg0) {
		arg0.osp -= 3;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		String var3 = (String) arg0.objectStack[arg0.osp + 2];
		boolean var4 = arg0.intStack[--arg0.isp] == 1;
		LoginManager.enterLobby(var1, var2, var3, var4);
	}

	@ObfuscatedName("u.aqp(Lyf;I)V")
	public static final void lobby_enterlobby_sso(ClientScriptState arg0) {
		arg0.osp--;
		arg0.isp--;
	}

	@ObfuscatedName("hv.aqx(Lyf;I)V")
	public static final void sso_available(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("mt.aqt(Lyf;I)V")
	public static final void sso_displayname(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = "";
	}

	@ObfuscatedName("fm.aqh(Lyf;I)V")
	public static final void shop_open(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("kj.aqy(Lyf;I)V")
	public static final void method5356(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("sx.aqw(Lyf;S)V")
	public static final void shop_applypendingtransactions(ClientScriptState arg0) {
	}

	@ObfuscatedName("gl.aqe(Lyf;I)V")
	public static final void shop_requestdata(ClientScriptState arg0) {
	}

	@ObfuscatedName("kl.aqr(Lyf;I)V")
	public static final void shop_requestdatastatus(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("u.aqu(Lyf;B)V")
	public static final void shop_getcategorycount(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("tr.aqq(Lyf;B)V")
	public static final void shop_getcategoryid(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("tu.aqs(Lyf;B)V")
	public static final void shop_getindexforcategoryid(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("ahj.aqb(Lyf;I)V")
	public static final void shop_getindexforcategoryname(ClientScriptState arg0) {
		arg0.osp--;
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("dm.aqo(Lyf;I)V")
	public static final void shop_getcategorydescription(ClientScriptState arg0) {
		arg0.isp--;
		arg0.objectStack[++arg0.osp - 1] = "";
	}

	@ObfuscatedName("vz.aqi(Lyf;I)V")
	public static final void shop_getproductcount(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("x.aqf(Lyf;I)V")
	public static final void shop_isproductavailable(ClientScriptState arg0) {
		arg0.isp--;
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("uf.aqg(Lyf;B)V")
	public static final void shop_isproductrecommended(ClientScriptState arg0) {
		arg0.isp--;
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("jk.aqa(Lyf;B)V")
	public static final void shop_getproductdetails(ClientScriptState arg0) {
		arg0.isp--;
		arg0.isp--;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.objectStack[++arg0.osp - 1] = "";
	}

	@ObfuscatedName("ib.aql(Lyf;B)V")
	public static final void marketing_init(ClientScriptState arg0) {
	}

	@ObfuscatedName("il.aqj(Lyf;I)V")
	public static final void marketing_sendevent(ClientScriptState arg0) {
		arg0.osp--;
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
		arg0.intStack[++arg0.isp - 1] = LoginManager.enterLobbyReply;
	}

	@ObfuscatedName("qw.ari(Lyf;B)V")
	public static final void resend_uid_passport_request(ClientScriptState arg0) {
		if (Client.state == 17) {
			ClientMessage var1 = ClientMessage.createMessage(ClientProt.UID_PASSPORT_RESEND_REQUEST, Client.lobbyConnection.randomOut);
			Client.lobbyConnection.queue(var1);
		}
	}

	@ObfuscatedName("wu.ary(Lyf;B)V")
	public static final void userflowflags(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.userFlow2;
		arg0.intStack[++arg0.isp - 1] = Client.userFlow1;
	}

	@ObfuscatedName("er.aro(Lyf;B)V")
	public static final void automatedtestflags(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.field10778;
		arg0.intStack[++arg0.isp - 1] = Client.field10777;
	}

	@ObfuscatedName("tu.arl(Lyf;I)V")
	public static final void create_under13(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.isUnder13 ? 1 : 0;
	}

	@ObfuscatedName("ahg.arj(Lyf;B)V")
	public static final void create_setunder13(ClientScriptState arg0) {
		Client.isUnder13 = true;
		Client.method3094();
	}

	@ObfuscatedName("adv.arc(Lyf;B)V")
	public static final void login_last_transfer_reply(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = LoginManager.lastTransferReply;
		arg0.intStack[++arg0.isp - 1] = LoginManager.lastTransferDisallowResult;
		arg0.intStack[++arg0.isp - 1] = LoginManager.lastTransferDisallowTrigger;
		LoginManager.lastTransferReply = -2;
		LoginManager.lastTransferDisallowResult = -1;
		LoginManager.lastTransferDisallowTrigger = -1;
	}

	@ObfuscatedName("gr.art(Lyf;B)V")
	public static final void login_inprogress(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = LoginManager.isInProgress() ? 1 : 0;
	}

	@ObfuscatedName("sx.arb(Lyf;B)V")
	public static final void login_queue_position(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = LoginManager.queuePosition;
	}

	@ObfuscatedName("ys.arw(Lyf;S)V")
	public static final void login_cancel(ClientScriptState arg0) {
		LoginManager.cancelLogin();
	}

	@ObfuscatedName("oo.arh(Lyf;B)V")
	public static final void login_request_social_network(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		boolean var3 = arg0.intStack[arg0.isp + 1] == 1;
		LoginManager.requestSocialNetworkLogin(var1, var2, var3);
	}

	@ObfuscatedName("cc.aru(Lyf;I)V")
	public static final void lobby_enterlobby_social_network(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		boolean var3 = arg0.intStack[arg0.isp + 1] == 1;
		LoginManager.enterLobbySocialNetwork(var1, var2, var3);
	}

	@ObfuscatedName("ahq.arf(Lyf;B)V")
	public static final void login_disallowtrigger(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = LoginManager.disallowTrigger;
	}

	@ObfuscatedName("on.arz(Lyf;B)V")
	public static final void create_get_email(ClientScriptState arg0) {
		if (Client.createEmail == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Client.createEmail;
		}
	}

	@ObfuscatedName("kr.arv(Lyf;I)V")
	public static final void login_accountappeal(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		long var2 = AccountAppealLogin.method14886();
		if (var2 == 0L) {
			arg0.intStack[++arg0.isp - 1] = 5;
		} else {
			arg0.intStack[++arg0.isp - 1] = AccountAppealLogin.method14753(var2, var1);
		}
	}

	@ObfuscatedName("pu.arq(Lyf;I)V")
	public static final void detail_brightness(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Client.preferences.setPreference(Client.preferences.brightness, var1);
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("akw.ars(Lyf;I)V")
	public static final void detail_removeroofs_option(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Client.preferences.setPreference(Client.preferences.removeRoofs, var1);
		Client.preferences.setPreference(Client.preferences.removeRoofs2, var1);
		Client.preferences.removeRoofs.clampValue();
		Client.preferences.removeRoofs2.clampValue();
		Client.method3128();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("fv.arm(Lyf;I)V")
	public static final void detail_grounddecor_on(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.groundDecoration, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("ec.ark(Lyf;B)V")
	public static final void detail_idleanims_many(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.idleAnimations, arg0.intStack[--arg0.isp]);
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("any.arn(Lyf;I)V")
	public static final void detail_flickering_on(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.flickeringEffects, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("fz.ara(Lyf;I)V")
	public static final void detail_spotshadows_on(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.characterShadows, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("aae.ard(Lyf;I)V")
	public static final void detail_hardshadows(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.sceneryShadows, arg0.intStack[--arg0.isp]);
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("ju.arr(Lyf;S)V")
	public static final void detail_shadowquality(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.shadowQuality, arg0.intStack[--arg0.isp]);
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("no.asa(Lyf;I)V")
	public static final void detail_lightdetail_high(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.lightingDetail, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Client.resetModelCaches();
		Client.world.getEnvironmentManager().resetFade();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("yu.asg(Lyf;B)V")
	public static final void detail_waterdetail_high(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.waterDetail, arg0.intStack[--arg0.isp] == 1 ? 2 : 0);
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("ck.aso(Lyf;B)V")
	public static final void detail_fog_on(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.fog, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("xe.ask(Lyf;B)V")
	public static final void detail_antialiasing(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.antiAliasing2, arg0.intStack[--arg0.isp]);
		Client.setToolkit(Client.preferences.displayMode.getValue(), false);
		Preferences.save();
	}

	@ObfuscatedName("oo.asd(Lyf;I)V")
	public static final void detail_stereo(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.stereo, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("io.asy(Lyf;I)V")
	public static final void detail_soundvol(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.soundVolume, arg0.intStack[--arg0.isp]);
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("pd.asr(Lyf;B)V")
	public static final void detail_musicvol(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = Client.preferences.unknownVolume1.getValue();
		if (var1 != var2) {
			Client.preferences.setPreference(Client.preferences.unknownVolume1, var1);
			Preferences.save();
			Client.preferencesChangeNotified = false;
		}
	}

	@ObfuscatedName("e.asc(Lyf;I)V")
	public static final void detail_bgsoundvol(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.backgroundSoundVolume, arg0.intStack[--arg0.isp]);
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("mw.asq(Lyf;B)V")
	public static final void detail_removeroofs_option_override(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 == -1) {
			Client.preferences.setPreference(Client.preferences.removeRoofs2, Client.preferences.removeRoofs.getValue());
		} else {
			Client.preferences.setPreference(Client.preferences.removeRoofs2, var1);
		}
		Client.method3128();
	}

	@ObfuscatedName("vj.asf(Lyf;B)V")
	public static final void detail_particles(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Client.preferences.setPreference(Client.preferences.particles, var1);
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("akw.asp(Lyf;I)V")
	public static final void detail_antialiasing_default(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.antiAliasing, arg0.intStack[--arg0.isp]);
		Preferences.save();
	}

	@ObfuscatedName("sz.asb(Lyf;B)V")
	public static final void detail_buildarea(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.buildArea, arg0.intStack[--arg0.isp]);
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("ajf.ase(Lyf;I)V")
	public static final void detail_bloom(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 < 0 || var1 > 1) {
			var1 = 0;
		}
		Client.setBloom(var1 == 1);
	}

	@ObfuscatedName("py.asz(Lyf;I)V")
	public static final void detail_customcursors(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.customCursors, arg0.intStack[--arg0.isp] == 0 ? 0 : 1);
		Preferences.save();
	}

	@ObfuscatedName("uk.asl(Lyf;I)V")
	public static final void detail_idleanims(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.idleAnimations, arg0.intStack[--arg0.isp]);
		Preferences.save();
	}

	@ObfuscatedName("ht.asu(Lyf;I)V")
	public static final void detail_groundblending(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.groundBlending, arg0.intStack[--arg0.isp] == 0 ? 0 : 1);
		Preferences.save();
		Client.world.rebuild();
	}

	@ObfuscatedName("pu.asn(Lyf;I)V")
	public static final void detail_toolkit(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 < 0 || var1 > 5 || var1 == 2) {
			var1 = 3;
		}
		Client.setToolkit(var1, false);
	}

	@ObfuscatedName("pm.asj(Lyf;S)V")
	public static final void detail_toolkit_default(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		Client.preferences.setPreference(Client.preferences.toolkit, var1);
		if (!var2) {
			Client.preferences.setPreference(Client.preferences.preset, 0);
		}
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("aax.asv(Lyf;I)V")
	public static final void detail_cpuusage(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.cpuUsage, arg0.intStack[--arg0.isp]);
		Preferences.save();
	}

	@ObfuscatedName("ge.asm(Lyf;I)V")
	public static final void detail_texturing(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.textures, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Preferences.save();
		Client.resetModelCaches();
		SpotShadowFactory.cacheReset();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("fl.asw(Lyf;I)V")
	public static final void detail_maxscreensize(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.screenSize, arg0.intStack[--arg0.isp]);
		Preferences.save();
		Client.field10836 = true;
	}

	@ObfuscatedName("wu.ast(Lyf;B)V")
	public static final void detail_speechvol(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.speechVolume, arg0.intStack[--arg0.isp]);
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("nv.ash(Lyf;I)V")
	public static final void detail_loginvol(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = Client.preferences.unknownVolume2.getValue();
		if (var1 != var2) {
			Client.preferences.setPreference(Client.preferences.unknownVolume2, var1);
			Preferences.save();
			Client.preferencesChangeNotified = false;
		}
	}

	@ObfuscatedName("tc.asi(Lyf;B)V")
	public static final void detail_loadingscreentype(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 > 255 || var1 < 0) {
			var1 = 0;
		}
		if (var1 != Client.preferences.loadingScreen.getValue()) {
			Client.preferences.setPreference(Client.preferences.loadingScreen, var1);
			Preferences.save();
			Client.preferencesChangeNotified = false;
		}
	}

	@ObfuscatedName("ajh.ass(Lyf;B)V")
	public static final void detail_skydetail(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 != Client.preferences.skyboxes.getValue()) {
			Client.preferences.setPreference(Client.preferences.skyboxes, var1);
			Preferences.save();
			Client.preferencesChangeNotified = false;
		}
	}

	@ObfuscatedName("wo.asx(Lyf;B)V")
	public static final void detail_animdetail(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 != Client.preferences.animDetail.getValue()) {
			Client.preferences.setPreference(Client.preferences.animDetail, var1);
			Preferences.save();
			Client.preferencesChangeNotified = false;
			Client.world.rebuild();
		}
	}

	@ObfuscatedName("gm.ato(Lyf;B)V")
	public static final void detail_drawdistance(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("fc.att(Lyf;B)V")
	public static final void detail_diskcachesize(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("vq.atu(Lyf;I)V")
	public static final void detail_shadows(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("ye.atp(Lyf;I)V")
	public static final void detail_lightingquality(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("wu.atl(Lyf;B)V")
	public static final void detail_antialiasingmode(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("adc.atv(Lyf;I)V")
	public static final void detail_ambientocclusion(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("go.atw(Lyf;I)V")
	public static final void detail_reflections(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("abq.atc(Lyf;I)V")
	public static final void detail_vsync(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("xq.atn(Lyf;I)V")
	public static final void detail_anisotropicfiltering(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("nq.atq(Lyf;I)V")
	public static final void detail_volumetriclighting(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("aav.aty(Lyf;I)V")
	public static final void detail_maxforegroundfps(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("yl.ath(Lyf;I)V")
	public static final void detail_maxbackgroundfps(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("gk.ata(Lyf;I)V")
	public static final void detail_gamerenderscale(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("nw.ats(Lyf;B)V")
	public static final void detail_interfacescale(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("kt.atx(Lyf;I)V")
	public static final void detail_dof(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("ul.atz(Lyf;I)V")
	public static final void detailget_brightness(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.brightness.getValue();
	}

	@ObfuscatedName("ahb.atg(Lyf;I)V")
	public static final void detailget_removeroofs_option(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.removeRoofs.getValue();
	}

	@ObfuscatedName("cb.atr(Lyf;I)V")
	public static final void detailget_grounddecor_on(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.groundDecoration.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("abv.atk(Lyf;I)V")
	public static final void detailget_idleanims_many(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.idleAnimations.getValue();
	}

	@ObfuscatedName("gk.ati(Lyf;I)V")
	public static final void detailget_flickering_on(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.flickeringEffects.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("yu.atm(Lyf;I)V")
	public static final void detailget_spotshadows_on(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.characterShadows.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("ji.ate(Lyf;B)V")
	public static final void detailget_hardshadows(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.sceneryShadows.getValue();
	}

	@ObfuscatedName("ew.atj(Lyf;I)V")
	public static final void detailget_shadowquality(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.shadowQuality.getValue();
	}

	@ObfuscatedName("ub.atd(Lyf;I)V")
	public static final void detailget_lightdetail_high(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.lightingDetail.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("yo.atf(Lyf;I)V")
	public static final void detailget_waterdetail_high(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.waterDetail.getValue() == 2 ? 1 : 0;
	}

	@ObfuscatedName("s.atb(Lyf;I)V")
	public static final void detailget_fog_on(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.fog.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("xc.auq(Lyf;I)V")
	public static final void detailget_antialiasing(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.antiAliasing2.getValue();
	}

	@ObfuscatedName("kt.auf(Lyf;I)V")
	public static final void detailget_stereo(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.stereo.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("el.auj(Lyf;B)V")
	public static final void detailget_soundvol(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.soundVolume.getValue();
	}

	@ObfuscatedName("ye.aut(Lyf;I)V")
	public static final void detailget_musicvol(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.unknownVolume1.getValue();
	}

	@ObfuscatedName("sa.aue(Lyf;I)V")
	public static final void detailget_bgsoundvol(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.backgroundSoundVolume.getValue();
	}

	@ObfuscatedName("jg.aur(Lyf;B)V")
	public static final void detailget_particles(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ParticleSystemRenderer.method8461();
	}

	@ObfuscatedName("wn.auu(Lyf;I)V")
	public static final void detailget_antialiasing_default(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.antiAliasing.getValue();
	}

	@ObfuscatedName("ane.auv(Lyf;S)V")
	public static final void detailget_buildarea(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.buildArea.getValue();
	}

	@ObfuscatedName("hh.aus(Lyf;B)V")
	public static final void detailget_bloom(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.bloom.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("afg.auc(Lyf;I)V")
	public static final void detailget_customcursors(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.customCursors.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("db.aud(Lyf;I)V")
	public static final void detailget_idleanims(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.idleAnimations.getValue();
	}

	@ObfuscatedName("bf.aup(Lyf;I)V")
	public static final void detailget_groundblending(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.groundBlending.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("du.aum(Lyf;I)V")
	public static final void detailget_toolkit(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.displayMode.getValue();
	}

	@ObfuscatedName("gj.auk(Lyf;I)V")
	public static final void detailget_toolkit_default(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.toolkit.getValue();
	}

	@ObfuscatedName("nt.aux(Lyf;B)V")
	public static final void detailget_cpuusage(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.cpuUsage.getValue();
	}

	@ObfuscatedName("db.auw(Lyf;I)V")
	public static final void detailget_texturing(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.textures.getValue() == 1 ? 1 : 0;
	}

	@ObfuscatedName("kf.aul(Lyf;B)V")
	public static final void detailget_performance_metric(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.getPerformanceMetric(Client.preferences.displayMode.getValue(), 200);
	}

	@ObfuscatedName("fd.aui(Lyf;I)V")
	public static final void detailget_maxscreensize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.screenSize.getValue();
	}

	@ObfuscatedName("wd.auz(Lyf;I)V")
	public static final void detailget_speechvol(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.speechVolume.getValue();
	}

	@ObfuscatedName("ach.auh(Lyf;B)V")
	public static final void detailget_loginvol(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.unknownVolume2.getValue();
	}

	@ObfuscatedName("j.aua(Lyf;B)V")
	public static final void detailget_safemode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.isSafeMode ? 1 : 0;
	}

	@ObfuscatedName("dy.aub(Lyf;B)V")
	public static final void detailget_loadingscreentype(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.loadingScreen.getValue();
	}

	@ObfuscatedName("jd.aun(Lyf;I)V")
	public static final void detailget_orthographic(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.orthographic.getValue();
	}

	@ObfuscatedName("ec.auy(Lyf;I)V")
	public static final void detailget_canchoosesafemode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.hardwarePlatform.cpuInfoRam < 512 || Client.isSafeMode || Client.field10796 ? 1 : 0;
	}

	@ObfuscatedName("wp.aug(Lyf;I)V")
	public static final void detailget_chosesafemode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.field10812 ? 1 : 0;
	}

	@ObfuscatedName("aks.auo(Lyf;B)V")
	public static final void detailget_drawdistance(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.drawDistance.getValue();
	}

	@ObfuscatedName("aoq.avs(Lyf;I)V")
	public static final void detailget_skydetail(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.skyboxes.getValue();
	}

	@ObfuscatedName("iu.avm(Lyf;I)V")
	public static final void detailget_diskcachesize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ur.avn(Lyf;I)V")
	public static final void detailget_mindiskcachesize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("uc.avb(Lyf;I)V")
	public static final void detailget_maxdiskcachesize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("fq.avo(Lyf;I)V")
	public static final void detailget_recommendeddiskcachesize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("afd.avr(Lyf;B)V")
	public static final void detailget_shadows(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("pj.avh(Lyf;I)V")
	public static final void detailget_lightingquality(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("fy.avj(Lyf;I)V")
	public static final void detailget_antialiasingmode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("pj.ava(Lyf;I)V")
	public static final void detailget_ambientocclusion(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ns.avk(Lyf;I)V")
	public static final void detailget_reflections(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("abr.ave(Lyf;I)V")
	public static final void detailget_vsync(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("iz.avg(Lyf;S)V")
	public static final void detailget_anisotropicfiltering(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("gc.avf(Lyf;I)V")
	public static final void detailget_volumetriclighting(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("mj.avy(Lyf;I)V")
	public static final void detailget_maxforegroundfps(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ur.avv(Lyf;I)V")
	public static final void detailget_maxbackgroundfps(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("fr.avx(Lyf;B)V")
	public static final void detailget_gamerenderscale(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ec.avw(Lyf;I)V")
	public static final void detailget_interfacescale(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("nc.avd(Lyf;I)V")
	public static final void detailget_dof(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ty.avp(Lyf;I)V")
	public static final void detailget_animdetail(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.animDetail.getValue();
	}

	@ObfuscatedName("abx.avq(Lyf;B)V")
	public static final void viewport_setfov(ClientScriptState arg0) {
		arg0.isp -= 2;
		Client.viewportFovMax = (short) arg0.intStack[arg0.isp];
		if (Client.viewportFovMax <= 0) {
			Client.viewportFovMax = 256;
		}
		Client.viewportFovMin = (short) arg0.intStack[arg0.isp + 1];
		if (Client.viewportFovMin <= 0) {
			Client.viewportFovMin = 205;
		}
	}

	@ObfuscatedName("pp.avt(Lyf;I)V")
	public static final void viewport_setzoom(ClientScriptState arg0) {
		arg0.isp -= 2;
		Client.viewportZoomMin = (short) arg0.intStack[arg0.isp];
		if (Client.viewportZoomMin <= 0) {
			Client.viewportZoomMin = 256;
		}
		Client.viewportZoomMax = (short) arg0.intStack[arg0.isp + 1];
		if (Client.viewportZoomMax <= 0) {
			Client.viewportZoomMax = 320;
		}
	}

	@ObfuscatedName("gw.avz(Lyf;I)V")
	public static final void viewport_clampfov(ClientScriptState arg0) {
		arg0.isp -= 4;
		Client.field11070 = (short) arg0.intStack[arg0.isp];
		if (Client.field11070 <= 0) {
			Client.field11070 = 1;
		}
		Client.field11071 = (short) arg0.intStack[arg0.isp + 1];
		if (Client.field11071 <= 0) {
			Client.field11071 = 32767;
		} else if (Client.field11071 < Client.field11070) {
			Client.field11071 = Client.field11070;
		}
		Client.field10900 = (short) arg0.intStack[arg0.isp + 2];
		if (Client.field10900 <= 0) {
			Client.field10900 = 1;
		}
		Client.field10943 = (short) arg0.intStack[arg0.isp + 3];
		if (Client.field10943 <= 0) {
			Client.field10943 = 32767;
		} else if (Client.field10943 < Client.field10900) {
			Client.field10943 = Client.field10900;
		}
	}

	@ObfuscatedName("yb.avl(Lyf;I)V")
	public static final void viewport_geteffectivesize(ClientScriptState arg0) {
		Client.setViewport(0, 0, Client.field10986.width, Client.field10986.height, false);
		arg0.intStack[++arg0.isp - 1] = Client.viewportWidth;
		arg0.intStack[++arg0.isp - 1] = Client.viewportHeight;
	}

	@ObfuscatedName("nc.avc(Lyf;I)V")
	public static final void viewport_getzoom(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.viewportZoomMin;
		arg0.intStack[++arg0.isp - 1] = Client.viewportZoomMax;
	}

	@ObfuscatedName("gt.avu(Lyf;I)V")
	public static final void viewport_getfov(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.viewportFovMax;
		arg0.intStack[++arg0.isp - 1] = Client.viewportFovMin;
	}

	@ObfuscatedName("fj.avi(Lyf;B)V")
	public static final void date_minutes(ClientScriptState arg0) {
		long var1 = MonotonicTime.get();
		arg0.intStack[++arg0.isp - 1] = (int) (var1 / 60000L);
	}

	@ObfuscatedName("ahp.awu(Lyf;I)V")
	public static final void date_runeday(ClientScriptState arg0) {
		long var1 = MonotonicTime.get();
		arg0.intStack[++arg0.isp - 1] = (int) (var1 / 86400000L) - 11745;
	}

	@ObfuscatedName("gq.awn(Lyf;B)V")
	public static final void date_runeday_fromdate(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		long var4 = TimeFormatter.method8691(0, 0, 12, var1, var2, var3);
		int var6 = TimeFormatter.method13899(var4);
		if (var3 < 1970) {
			var6--;
		}
		arg0.intStack[++arg0.isp - 1] = var6;
	}

	@ObfuscatedName("aqc.awk(Lyf;I)V")
	public static final void date_year(ClientScriptState arg0) {
		long var1 = MonotonicTime.get();
		arg0.intStack[++arg0.isp - 1] = TimeFormatter.method16390(var1);
	}

	@ObfuscatedName("ko.awp(Lyf;I)V")
	public static final void date_isleapyear(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
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
		arg0.intStack[++arg0.isp - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("nm.awm(Lyf;I)V")
	public static final void date_runeday_todate(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Date var2 = TimeZones.getRuneDay(var1);
		arg0.intStack[++arg0.isp - 1] = TimeZones.method3628(var2, UTC);
		arg0.intStack[++arg0.isp - 1] = TimeZones.method3623(var2, UTC) - 1;
		arg0.intStack[++arg0.isp - 1] = TimeZones.method3627(var2, UTC);
	}

	@ObfuscatedName("ks.awr(Lyf;B)V")
	public static final void date_minutes_fromruneday(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = (int) (TimeFormatter.method14612(var1) / 60000L);
	}

	@ObfuscatedName("ana.awl(Lyf;I)V")
	public static final void worldlist_fetch(ClientScriptState arg0) {
		if (Client.state != 13 && Client.state != 18 || LoginManager.isInProgress()) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else if (WorldSwitcher.field8754) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else if (WorldSwitcher.field2826 > MonotonicTime.get() - 1000L) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			WorldSwitcher.field8754 = true;
			ServerConnection var1 = Client.getCurrentConnection();
			ClientMessage var2 = ClientMessage.createMessage(ClientProt.WORLDLIST_FETCH, var1.randomOut);
			var2.buf.p4(GWC.field7642);
			var1.queue(var2);
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("fw.awo(Lyf;B)V")
	public static final void worldlist_start(ClientScriptState arg0) {
		GWCWorld var1 = WorldSwitcher.method13782();
		if (var1 != null) {
			arg0.intStack[++arg0.isp - 1] = var1.field11705;
			arg0.intStack[++arg0.isp - 1] = var1.field7639;
			arg0.objectStack[++arg0.osp - 1] = var1.field11704;
			arg0.intStack[++arg0.isp - 1] = var1.method18330();
			arg0.objectStack[++arg0.osp - 1] = var1.method18336();
			arg0.intStack[++arg0.isp - 1] = var1.field7641;
			arg0.intStack[++arg0.isp - 1] = var1.field11707;
			arg0.objectStack[++arg0.osp - 1] = var1.field11703;
			return;
		}
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
	}

	@ObfuscatedName("wh.awv(Lyf;B)V")
	public static final void worldlist_next(ClientScriptState arg0) {
		GWCWorld var1 = WorldSwitcher.method6048();
		if (var1 != null) {
			arg0.intStack[++arg0.isp - 1] = var1.field11705;
			arg0.intStack[++arg0.isp - 1] = var1.field7639;
			arg0.objectStack[++arg0.osp - 1] = var1.field11704;
			arg0.intStack[++arg0.isp - 1] = var1.method18330();
			arg0.objectStack[++arg0.osp - 1] = var1.method18336();
			arg0.intStack[++arg0.isp - 1] = var1.field7641;
			arg0.intStack[++arg0.isp - 1] = var1.field11707;
			arg0.objectStack[++arg0.osp - 1] = var1.field11703;
			return;
		}
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
	}

	@ObfuscatedName("ar.awh(Lyf;B)V")
	public static final void worldlist_switch(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		int var3 = ServerPorts.method2912(Client.modewhere, ServerType.field8347, var1);
		int var4 = ServerPorts.method10147(Client.modewhere, ServerType.field8347, var1);
		if (Client.state == 13 && !LoginManager.isInProgress()) {
			arg0.intStack[++arg0.isp - 1] = WorldSwitcher.setWorld(var1, var2, var3, var4) ? 1 : 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("f.awx(Lyf;I)V")
	public static final void worldlist_specific(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		GWCWorld var2 = GWC.method4944(var1);
		if (var2 != null) {
			arg0.intStack[++arg0.isp - 1] = var2.field7639;
			arg0.objectStack[++arg0.osp - 1] = var2.field11704;
			arg0.intStack[++arg0.isp - 1] = var2.method18330();
			arg0.objectStack[++arg0.osp - 1] = var2.method18336();
			arg0.intStack[++arg0.isp - 1] = var2.field7641;
			arg0.intStack[++arg0.isp - 1] = var2.field11707;
			arg0.objectStack[++arg0.osp - 1] = var2.field11703;
			return;
		}
		arg0.intStack[++arg0.isp - 1] = -1;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
	}

	@ObfuscatedName("yy.aws(Lyf;B)V")
	public static final void worldlist_sort(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		int var3 = arg0.intStack[arg0.isp + 2];
		boolean var4 = arg0.intStack[arg0.isp + 3] == 1;
		WorldSwitcher.method5394(var1, var2, var3, var4);
	}

	@ObfuscatedName("xv.awa(Lyf;I)V")
	public static final void worldlist_autoworld(ClientScriptState arg0) {
		WorldSwitcher.method10337();
	}

	@ObfuscatedName("dd.awc(Lyf;I)V")
	public static final void worldlist_pingworlds(ClientScriptState arg0) {
		if (Client.state == 13) {
			WorldSwitcher.field8759 = arg0.intStack[--arg0.isp] == 1;
		}
	}

	@ObfuscatedName("dc.awz(Lyf;B)V")
	public static final void worldlist_specific_thisworld(ClientScriptState arg0) {
		GWCWorld var1 = WorldSwitcher.method477();
		arg0.intStack[++arg0.isp - 1] = var1 == null ? 0 : var1.field7639;
	}

	@ObfuscatedName("ji.awe(Lyf;B)V")
	public static final void if_gettop(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.openedTopInterface;
	}

	@ObfuscatedName("rp.awi(Lyf;I)V")
	public static final void if_debug_getopenifcount(ClientScriptState arg0) {
		int var1 = Client.openedSubInterfaces.size();
		if (Client.openedTopInterface != -1) {
			var1++;
		}
		arg0.intStack[++arg0.isp - 1] = var1;
	}

	@ObfuscatedName("fo.awy(Lyf;I)V")
	public static final void if_debug_getopenifid(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.openedTopInterface != -1) {
			if (var1 == 0) {
				arg0.intStack[++arg0.isp - 1] = Client.openedTopInterface;
				return;
			}
			var1--;
		}
		SubInterface var2 = (SubInterface) Client.openedSubInterfaces.head();
		while (var1-- > 0) {
			var2 = (SubInterface) Client.openedSubInterfaces.next();
		}
		arg0.intStack[++arg0.isp - 1] = var2.field11571;
	}

	@ObfuscatedName("er.awq(Lyf;B)V")
	public static final void if_debug_getname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Component.interfaces[var1] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		String var2 = Component.interfaces[var1].components[0].name;
		if (var2 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.substring(0, var2.indexOf(58));
		}
	}

	@ObfuscatedName("arl.aww(Lyf;I)V")
	public static final void if_debug_getcomcount(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Component.interfaces[var1] == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Component.interfaces[var1].components.length;
		}
	}

	@ObfuscatedName("iu.awd(Lyf;I)V")
	public static final void if_debug_getcomname(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = var1 >> 16;
		if (Component.interfaces[var2] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		String var3 = Component.interfaces[var2].components[var1].name;
		if (var3 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var3;
		}
	}

	@ObfuscatedName("hh.awg(Lyf;I)V")
	public static final void if_debug_getservertriggers(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = var1 >> 16;
		if (Component.interfaces[var2] == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Component.interfaces[var2].components[var1].field2181;
		}
	}

	@ObfuscatedName("at.awb(Lyf;B)V")
	public static final void if_debug_button1(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(1, var1, var2, "");
	}

	@ObfuscatedName("ys.awf(Lyf;B)V")
	public static final void if_debug_button2(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(2, var1, var2, "");
	}

	@ObfuscatedName("yi.awt(Lyf;I)V")
	public static final void if_debug_button3(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(3, var1, var2, "");
	}

	@ObfuscatedName("iw.awj(Lyf;B)V")
	public static final void if_debug_button4(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(4, var1, var2, "");
	}

	@ObfuscatedName("aas.axc(Lyf;I)V")
	public static final void if_debug_button5(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(5, var1, var2, "");
	}

	@ObfuscatedName("sx.axs(Lyf;B)V")
	public static final void if_debug_button6(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(6, var1, var2, "");
	}

	@ObfuscatedName("jh.axa(Lyf;I)V")
	public static final void if_debug_button7(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(7, var1, var2, "");
	}

	@ObfuscatedName("aax.axn(Lyf;I)V")
	public static final void if_debug_button8(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(8, var1, var2, "");
	}

	@ObfuscatedName("afg.axd(Lyf;I)V")
	public static final void if_debug_button9(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(9, var1, var2, "");
	}

	@ObfuscatedName("ig.axo(Lyf;I)V")
	public static final void if_debug_button10(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Client.method4527(10, var1, var2, "");
	}

	@ObfuscatedName("fk.axx(ILhf;Lyf;B)V")
	public static final void cc_if_triggerop(int arg0, Component arg1, ClientScriptState arg2) {
		if (arg0 < 1 || arg0 > 10) {
			throw new RuntimeException();
		}
		Client.method4527(arg0, arg1.parentlayer, arg1.id, "");
	}

	@ObfuscatedName("il.axk(Lyf;I)V")
	public static final void if_triggerop(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		cc_if_triggerop(var3, Component.method16682(var1, var2), arg0);
	}

	@ObfuscatedName("ux.axv(Lyf;B)V")
	public static final void cc_triggerop(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		Component var2 = var1.com;
		int var3 = arg0.intStack[--arg0.isp];
		cc_if_triggerop(var3, var2, arg0);
	}

	@ObfuscatedName("ik.axq(Lyf;B)V")
	public static final void if_debug_target(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Component var3 = Component.method16682(var1, var2);
		Client.method9403();
		ServerKeyProperties var4 = Client.method17197(var3);
		Client.setTargetActiveComponent(var3, var4.method17691(), var4.field11381);
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
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("jx.axj(Lyf;I)V")
	public static final void method5073(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("wn.axm(Lyf;B)V")
	public static final void targetmode_active(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.targetModeActive ? 1 : 0;
	}

	@ObfuscatedName("pp.axt(Lyf;I)V")
	public static final void targetmode_cancel(ClientScriptState arg0) {
		Client.method9403();
	}

	@ObfuscatedName("y.axb(Lyf;I)V")
	public static final void opcount(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = opcount;
	}

	@ObfuscatedName("sp.axe(Lyf;I)V")
	public static final void mec_text(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		MapElementType var2 = (MapElementType) Client.mapElementTypeList.list(var1);
		if (var2.text == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.text;
		}
	}

	@ObfuscatedName("fi.axr(Lyf;B)V")
	public static final void mec_sprite(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		MapElementType var2 = (MapElementType) Client.mapElementTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.sprite;
	}

	@ObfuscatedName("aoh.axg(Lyf;I)V")
	public static final void mec_textsize(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		MapElementType var2 = (MapElementType) Client.mapElementTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.textSize;
	}

	@ObfuscatedName("fc.axf(Lyf;I)V")
	public static final void mec_category(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		MapElementType var2 = (MapElementType) Client.mapElementTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.category;
	}

	@ObfuscatedName("pu.axu(Lyf;B)V")
	public static final void mec_param(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ParamType var3 = (ParamType) Client.paramTypeList.list(var2);
		if (var3.isStringType()) {
			arg0.objectStack[++arg0.osp - 1] = ((MapElementType) Client.mapElementTypeList.list(var1)).method4029(var2, var3.defaultstr);
		} else {
			arg0.intStack[++arg0.isp - 1] = ((MapElementType) Client.mapElementTypeList.list(var1)).method4028(var2, var3.defaultint);
		}
	}

	@ObfuscatedName("tg.axl(Lyf;B)V")
	public static final void userdetail_quickchat(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.field10951 && !Client.playerIsQuickChat ? 1 : 0;
	}

	@ObfuscatedName("ii.axi(Lyf;B)V")
	public static final void userdetail_lobby_membership(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = (int) (Client.lobbyMembership / 60000L);
		arg0.intStack[++arg0.isp - 1] = (int) ((Client.lobbyMembership - MonotonicTime.get() - Client.field1238) / 60000L);
		arg0.intStack[++arg0.isp - 1] = Client.field11709 ? 1 : 0;
	}

	@ObfuscatedName("af.axw(Lyf;I)V")
	public static final void userdetail_lobby_recoveryday(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyRecoveryDay;
	}

	@ObfuscatedName("li.ayg(Lyf;B)V")
	public static final void userdetail_lobby_unreadmessages(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyUnreadMessages;
	}

	@ObfuscatedName("fp.ayn(Lyf;B)V")
	public static final void userdetail_lobby_lastloginday(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyLastLoginDay;
	}

	@ObfuscatedName("sc.ayp(Lyf;B)V")
	public static final void userdetail_lobby_lastloginaddress(ClientScriptState arg0) {
		String var1 = null;
		if (Client.hostNameProvider != null) {
			var1 = Client.hostNameProvider.method544();
		}
		if (var1 == null) {
			var1 = "";
		}
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("pw.ayv(Lyf;B)V")
	public static final void userdetail_lobby_emailstatus(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyEmailStatus;
	}

	@ObfuscatedName("ny.ayu(Lyf;B)V")
	public static final void userdetail_lobby_ccexpiry(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyCCExpiry;
	}

	@ObfuscatedName("ju.ays(Lyf;B)V")
	public static final void userdetail_lobby_graceexpiry(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyGraceExpiry;
	}

	@ObfuscatedName("nd.ayf(Lyf;B)V")
	public static final void userdetail_lobby_dobrequested(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyDOBRequested ? 1 : 0;
	}

	@ObfuscatedName("ar.aym(Lyf;I)V")
	public static final void userdetail_dob(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyDOB;
	}

	@ObfuscatedName("oh.ayr(Lyf;I)V")
	public static final void userdetail_lobby_membersstats(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyMembersStats;
	}

	@ObfuscatedName("ju.ayc(Lyf;B)V")
	public static final void userdetail_lobby_playage(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyPlayAge;
	}

	@ObfuscatedName("iz.ayx(Lyf;I)V")
	public static final void userdetail_lobby_jcoins_balance(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyJCoinsBalance;
	}

	@ObfuscatedName("wb.ayk(Lyf;B)V")
	public static final void userdetail_lobby_loyalty_balance(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.lobbyLoyaltyBalance;
	}

	@ObfuscatedName("adv.ayo(Lyf;I)V")
	public static final void autosetup_dosetup(ClientScriptState arg0) {
		int var1 = Preferences.getAutoSetupResult();
		arg0.intStack[++arg0.isp - 1] = Preferences.field11775 = Client.preferences.displayMode.getValue();
		arg0.intStack[++arg0.isp - 1] = var1;
		SpotShadowFactory.cacheReset();
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("jx.ayd(Lyf;I)V")
	public static final void method5069(ClientScriptState arg0) {
	}

	@ObfuscatedName("yj.ayz(Lyf;I)V")
	public static final void autosetup_dosetupstatus(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("all.ayq(Lyf;I)V")
	public static final void autosetup_setultra(ClientScriptState arg0) {
	}

	@ObfuscatedName("yk.ayt(Lyf;I)V")
	public static final void autosetup_sethigh(ClientScriptState arg0) {
		Preferences.setHigh();
		SpotShadowFactory.cacheReset();
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("alk.aya(Lyf;I)V")
	public static final void autosetup_setmedium(ClientScriptState arg0) {
		Preferences.setMedium();
		SpotShadowFactory.cacheReset();
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("hf.aye(Lyf;B)V")
	public static final void autosetup_setlow(ClientScriptState arg0) {
		Preferences.setLow();
		SpotShadowFactory.cacheReset();
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("w.ayh(Lyf;I)V")
	public static final void autosetup_setmin(ClientScriptState arg0) {
		Preferences.setMin(true);
		SpotShadowFactory.cacheReset();
		Client.world.rebuild();
		Preferences.save();
		Client.preferencesChangeNotified = false;
	}

	@ObfuscatedName("sc.ayl(Lyf;I)V")
	public static final void autosetup_setcustom(ClientScriptState arg0) {
		Client.preferences.setPreference(Client.preferences.preset, 0);
		Preferences.save();
		Client.preferencesChangeNotified = false;
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
		arg0.intStack[++arg0.isp - 1] = Client.preferences.preset.getValue();
	}

	@ObfuscatedName("aih.ayi(Lyf;I)V")
	public static final void video_advert_play(ClientScriptState arg0) {
		boolean var1 = false;
		if (Client.javascriptEnabled) {
			try {
				Object var2 = JavascriptFunction.ADVERT_PLAY.method6097(new Object[] { Client.lobbyDOB, Client.localPlayerEntity.gender == 1, arg0.intStack[--arg0.isp] });
				if (var2 != null) {
					var1 = (Boolean) var2;
				}
			} catch (Throwable var4) {
			}
		}
		arg0.intStack[++arg0.isp - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("jp.ayj(Lyf;I)V")
	public static final void video_advert_force_remove(ClientScriptState arg0) {
		if (Client.javascriptEnabled) {
			JavascriptFunction.ADVERT_FORCE_REMOVE.method6090();
		}
	}

	@ObfuscatedName("sb.ayw(Lyf;I)V")
	public static final void video_advert_allow_skip(ClientScriptState arg0) {
		if (Client.javascriptEnabled) {
			JavascriptFunction.ADVERT_ALLOW_SKIP.method6090();
		}
	}

	@ObfuscatedName("ul.aze(Lyf;I)V")
	public static final void video_advert_has_finished(ClientScriptState arg0) {
		boolean var1 = true;
		if (Client.javascriptEnabled) {
			try {
				Object var2 = JavascriptFunction.ADVERT_FINISHED.method6088();
				if (var2 != null) {
					var1 = (Boolean) var2;
				}
			} catch (Throwable var4) {
			}
		}
		arg0.intStack[++arg0.isp - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("ij.azx(Lyf;I)V")
	public static final void detailcanmod_grounddecor(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.groundDecoration.canMod() ? 1 : 0;
	}

	@ObfuscatedName("rk.azd(Lyf;B)V")
	public static final void detailcanmod_spotshadows(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.characterShadows.canMod() ? 1 : 0;
	}

	@ObfuscatedName("nd.azg(Lyf;I)V")
	public static final void detailcanmod_hardshadows(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.sceneryShadows.canMod() ? 1 : 0;
	}

	@ObfuscatedName("r.azu(Lyf;I)V")
	public static final void detailcanmod_shadowquality(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.shadowQuality.canMod() ? 1 : 0;
	}

	@ObfuscatedName("jf.azj(Lyf;B)V")
	public static final void detailcanmod_waterdetail(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.waterDetail.canMod() ? 1 : 0;
	}

	@ObfuscatedName("qf.azz(Lyf;B)V")
	public static final void detailcanmod_antialiasing(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.antiAliasing.canMod() && Client.toolkit.supportsAntiAliasing() ? 1 : 0;
	}

	@ObfuscatedName("sl.azb(Lyf;I)V")
	public static final void detailcanmod_particles(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.particles.canMod() ? 1 : 0;
	}

	@ObfuscatedName("f.azt(Lyf;B)V")
	public static final void detailcanmod_buildarea(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.buildArea.canMod() ? 1 : 0;
	}

	@ObfuscatedName("ik.azw(Lyf;I)V")
	public static final void detailcanmod_bloom(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.bloom.canMod() && Client.toolkit.isBloomSupported() ? 1 : 0;
	}

	@ObfuscatedName("ip.azs(Lyf;I)V")
	public static final void detailcanmod_groundblending(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.groundBlending.canMod() ? 1 : 0;
	}

	@ObfuscatedName("dh.azv(Lyf;B)V")
	public static final void detailcanmod_texturing(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.textures.canMod() ? 1 : 0;
	}

	@ObfuscatedName("anw.azc(Lyf;I)V")
	public static final void detailcanmod_maxscreensize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.screenSize.canMod() ? 1 : 0;
	}

	@ObfuscatedName("gd.azy(Lyf;B)V")
	public static final void detailcanmod_fog(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.fog.canMod() ? 1 : 0;
	}

	@ObfuscatedName("ie.azq(Lyf;I)V")
	public static final void detailcanmod_orthographic(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.orthographic.canMod() ? 1 : 0;
	}

	@ObfuscatedName("vg.azh(Lyf;B)V")
	public static final void detailcanmod_toolkit_default(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.toolkit.canMod() ? 1 : 0;
	}

	@ObfuscatedName("sz.azl(Lyf;I)V")
	public static final void detailcanmod_skydetail(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.skyboxes.canMod() ? 1 : 0;
	}

	@ObfuscatedName("dy.azi(Lyf;B)V")
	public static final void detailcanmod_animdetail(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.preferences.animDetail.canMod() ? 1 : 0;
	}

	@ObfuscatedName("bl.azm(Lyf;B)V")
	public static final void detailcanmod_shadows(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("nh.azf(Lyf;I)V")
	public static final void detailcanmod_lightingquality(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("acv.azr(Lyf;B)V")
	public static final void detailcanmod_antialiasingmode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("na.azp(Lyf;I)V")
	public static final void detailcanmod_ambientocclusion(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ud.aza(Lyf;B)V")
	public static final void detailcanmod_reflections(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("rt.azn(Lyf;B)V")
	public static final void detailcanmod_vsync(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("jp.azk(Lyf;I)V")
	public static final void detailcanmod_anisotropicfiltering(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("xv.azo(Lyf;I)V")
	public static final void detailcanmod_volumetriclighting(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ax.baj(Lyf;I)V")
	public static final void detailcanmod_maxforegroundfps(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("uz.bab(Lyf;I)V")
	public static final void detailcanmod_maxbackgroundfps(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("no.bav(Lyf;S)V")
	public static final void detailcanmod_gamerenderscale(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("dv.bax(Lyf;I)V")
	public static final void detailcanmod_interfacescale(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("jr.baf(Lyf;S)V")
	public static final void detailcanmod_dof(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("jp.bag(Lyf;B)V")
	public static final void detailcanset_grounddecor(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.groundDecoration.canSetValue(var1);
	}

	@ObfuscatedName("jd.bau(Lyf;I)V")
	public static final void detailcanset_spotshadows(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.characterShadows.canSetValue(var1);
	}

	@ObfuscatedName("pn.bam(Lyf;I)V")
	public static final void detailcanset_hardshadows(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.sceneryShadows.canSetValue(var1);
	}

	@ObfuscatedName("ia.bah(Lyf;I)V")
	public static final void detailcanset_shadowquality(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.shadowQuality.canSetValue(var1);
	}

	@ObfuscatedName("vm.baw(Lyf;I)V")
	public static final void detailcanset_waterdetail(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.waterDetail.canSetValue(var1);
	}

	@ObfuscatedName("rd.bay(Lyf;B)V")
	public static final void detailcanset_antialiasing(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.toolkit.supportsAntiAliasing()) {
			arg0.intStack[++arg0.isp - 1] = Client.preferences.antiAliasing.canSetValue(var1);
		} else {
			arg0.intStack[++arg0.isp - 1] = 3;
		}
	}

	@ObfuscatedName("no.bas(Lyf;B)V")
	public static final void detailcanset_particles(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.particles.canSetValue(var1);
	}

	@ObfuscatedName("nr.bac(Lyf;B)V")
	public static final void detailcanset_buildarea(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.buildArea.canSetValue(var1);
	}

	@ObfuscatedName("xc.bar(Lyf;B)V")
	public static final void detailcanset_bloom(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Client.toolkit.isBloomSupported()) {
			arg0.intStack[++arg0.isp - 1] = Client.preferences.bloom.canSetValue(var1);
		} else {
			arg0.intStack[++arg0.isp - 1] = 3;
		}
	}

	@ObfuscatedName("pc.bap(Lyf;B)V")
	public static final void detailcanset_groundblending(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.groundBlending.canSetValue(var1);
	}

	@ObfuscatedName("ib.bae(Lyf;I)V")
	public static final void detailcanset_texturing(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.textures.canSetValue(var1);
	}

	@ObfuscatedName("d.bal(Lyf;B)V")
	public static final void detailcanset_maxscreensize(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.screenSize.canSetValue(var1);
	}

	@ObfuscatedName("kb.bak(Lyf;I)V")
	public static final void detailcanset_fog(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.fog.canSetValue(var1);
	}

	@ObfuscatedName("pn.baz(Lyf;I)V")
	public static final void detailcanset_orthographic(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.orthographic.canSetValue(var1);
	}

	@ObfuscatedName("ze.baq(Lyf;I)V")
	public static final void detailcanset_toolkit_default(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.toolkit.canSetValue(var1);
	}

	@ObfuscatedName("xo.bai(Lyf;B)V")
	public static final void detailcanset_skydetail(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.skyboxes.canSetValue(var1);
	}

	@ObfuscatedName("so.baa(Lyf;I)V")
	public static final void detailcanset_animdetail(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.preferences.animDetail.canSetValue(var1);
	}

	@ObfuscatedName("rq.bat(Lyf;I)V")
	public static final void detailcanset_shadows(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("hj.ban(Lyf;B)V")
	public static final void detailcanset_lightingquality(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ane.bao(Lyf;I)V")
	public static final void detailcanset_antialiasingmode(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("uw.bad(Lyf;I)V")
	public static final void detailcanset_ambientocclusion(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("nt.bbd(Lyf;B)V")
	public static final void detailcanset_reflections(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("in.bby(Lyf;B)V")
	public static final void detailcanset_vsync(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("cz.bbk(Lyf;I)V")
	public static final void detailcanset_anisotropicfiltering(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("qh.bbr(Lyf;I)V")
	public static final void detailcanset_volumetriclighting(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ab.bbg(Lyf;I)V")
	public static final void detailcanset_maxforegroundfps(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ahc.bbp(Lyf;S)V")
	public static final void detailcanset_maxbackgroundfps(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("aq.bbu(Lyf;S)V")
	public static final void detailcanset_gamerenderscale(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("wc.bbv(Lyf;B)V")
	public static final void detailcanset_interfacescale(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("gt.bbt(Lyf;I)V")
	public static final void detailcanset_dof(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ix.bbq(Lyf;I)V")
	public static final void method4479(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("fz.bbw(Lyf;I)V")
	public static final void method3039(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("ajj.bbj(Lyf;I)V")
	public static final void method17434(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = GameShell.canvasWid;
		arg0.intStack[++arg0.isp - 1] = GameShell.canvasHei;
	}

	@ObfuscatedName("s.bbo(Lyf;I)V")
	public static final void method484(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("io.bbb(Lyf;I)V")
	public static final void method4373(ClientScriptState arg0) {
		arg0.isp -= 4;
	}

	@ObfuscatedName("hp.bbh(Lyf;I)V")
	public static final void method4065(ClientScriptState arg0) {
	}

	@ObfuscatedName("xc.bbe(Lyf;I)V")
	public static final void get_entity_say(ClientScriptState arg0) {
		EntityChatLine var1 = arg0.activeEntity.getChatLine();
		if (var1 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var1.getText();
		}
	}

	@ObfuscatedName("abx.bbf(Lyf;B)V")
	public static final void get_displayname_withextras(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = ((PlayerEntity) arg0.activeEntity).getNameWithExtras(true);
	}

	@ObfuscatedName("d.bbn(Lyf;B)V")
	public static final void get_npc_name(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.activeEntity;
		String var2 = var1.name;
		NPCType var3 = var1.npcType;
		if (var3.multinpc != null) {
			NPCType var4 = var3.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
			if (var4 == null) {
				var2 = "";
			} else {
				var2 = var4.name;
			}
		}
		if (var2 == null) {
			var2 = "";
		}
		arg0.objectStack[++arg0.osp - 1] = var2;
	}

	@ObfuscatedName("fw.bbx(Lyf;I)V")
	public static final void get_npc_vislevel(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.activeEntity;
		arg0.intStack[++arg0.isp - 1] = var1.vislevel;
	}

	@ObfuscatedName("zl.bbi(Lyf;I)V")
	public static final void get_entity_screen_position(ClientScriptState arg0) {
		Client.projectFromEntity3d(arg0.activeEntity, arg0.intStack[--arg0.isp], true);
		arg0.intStack[++arg0.isp - 1] = (int) Client.projection[0];
		arg0.intStack[++arg0.isp - 1] = (int) Client.projection[1];
		arg0.intStack[++arg0.isp - 1] = (int) Client.projection[2];
	}

	@ObfuscatedName("gv.bbs(Lyf;B)V")
	public static final void if_get_gamescreen(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.field10986 == null ? -1 : Client.field10986.parentlayer;
	}

	@ObfuscatedName("sb.bbl(Lyf;I)V")
	public static final void if_set_gamescreen_enabled(ClientScriptState arg0) {
		Client.gameScreenEnabled = arg0.intStack[--arg0.isp] == 1;
		if (Client.gameScreenEnabled) {
			MiniMap.method16601();
		}
	}

	@ObfuscatedName("wu.bba(Lyf;I)V")
	public static final void get_entity_overlay_height(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeEntity.height();
	}

	@ObfuscatedName("gv.bbz(Lyf;S)V")
	public static final void get_npc_stat(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		NpcEntity var2 = (NpcEntity) arg0.activeEntity;
		int var3 = var2.method19163(var1);
		int var4 = var2.method19164(var1);
		arg0.intStack[++arg0.isp - 1] = var3;
		arg0.intStack[++arg0.isp - 1] = var4;
	}

	@ObfuscatedName("fz.bbm(Lyf;B)V")
	public static final void is_npc_active(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.activeEntity;
		boolean var2 = false;
		NPCType var3 = var1.npcType;
		if (var3.multinpc != null) {
			var3 = var3.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
		}
		if (var3 != null) {
			var2 = var3.active;
		}
		arg0.intStack[++arg0.isp - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("xn.bbc(Lyf;I)V")
	public static final void is_npc_visible(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.activeEntity;
		NPCType var2 = var1.npcType;
		if (var2.multinpc != null) {
			var2 = var2.getMultiNPC(Client.localPlayerGameState, Client.localPlayerGameState);
		}
		arg0.intStack[++arg0.isp - 1] = var2 == null ? 0 : 1;
	}

	@ObfuscatedName("yu.bce(Lyf;I)V")
	public static final void npc_type(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ((NpcEntity) arg0.activeEntity).npcType.id;
	}

	@ObfuscatedName("cj.bcd(Lyf;I)V")
	public static final void is_targeted_entity(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.activeTarget == arg0.activeEntity.targeted() ? 1 : 0;
	}

	@ObfuscatedName("uj.bcj(Lyf;I)V")
	public static final void get_loc_screen_position(ClientScriptState arg0) {
		Client.projectFromEntity3d((GraphEntity) arg0.activeLoc, arg0.intStack[--arg0.isp], true);
		arg0.intStack[++arg0.isp - 1] = (int) Client.projection[0];
		arg0.intStack[++arg0.isp - 1] = (int) Client.projection[1];
		arg0.intStack[++arg0.isp - 1] = (int) Client.projection[2];
	}

	@ObfuscatedName("ty.bci(Lyf;B)V")
	public static final void get_obj_screen_position(ClientScriptState arg0) {
		Client.projectFromEntity3d(arg0.activeObj, arg0.intStack[--arg0.isp], true);
		arg0.intStack[++arg0.isp - 1] = (int) Client.projection[0];
		arg0.intStack[++arg0.isp - 1] = (int) Client.projection[1];
		arg0.intStack[++arg0.isp - 1] = (int) Client.projection[2];
	}

	@ObfuscatedName("akr.bcx(Lyf;B)V")
	public static final void get_loc_overlay_height(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ((GraphEntity) arg0.activeLoc).height();
	}

	@ObfuscatedName("qo.bch(Lyf;B)V")
	public static final void get_obj_overlay_height(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeObj.height();
	}

	@ObfuscatedName("yn.bcb(Lalh;Lyf;I)V")
	public static final void get_bounding_box(GraphEntity arg0, ClientScriptState arg1) {
		boolean var2 = false;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		if (arg0.entityBounds != null) {
			for (int var7 = 0; var7 < arg0.entityBounds.length; var7++) {
				ScreenBoundingBox var8 = arg0.entityBounds[var7];
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
		arg1.intStack[++arg1.isp - 1] = var2 ? 1 : 0;
		arg1.intStack[++arg1.isp - 1] = var3;
		arg1.intStack[++arg1.isp - 1] = var4;
		arg1.intStack[++arg1.isp - 1] = var5;
		arg1.intStack[++arg1.isp - 1] = var6;
	}

	@ObfuscatedName("vo.bcp(Lyf;B)V")
	public static final void get_loc_bounding_box(ClientScriptState arg0) {
		get_bounding_box((GraphEntity) arg0.activeLoc, arg0);
	}

	@ObfuscatedName("ta.bcl(Lyf;B)V")
	public static final void get_obj_bounding_box(ClientScriptState arg0) {
		get_bounding_box(arg0.activeObj, arg0);
	}

	@ObfuscatedName("vy.bcm(Lyf;I)V")
	public static final void get_entity_bounding_box(ClientScriptState arg0) {
		get_bounding_box(arg0.activeEntity, arg0);
	}

	@ObfuscatedName("ab.bcv(Lkr;I)Leh;")
	public static VarDomain createVarClanSettingsDomain(ClanSettings arg0) {
		return new VarClanSettingsDomain(arg0);
	}

	@ObfuscatedName("wh.bcy(Lyf;I)V")
	public static final void bug_report(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.osp -= 2;
		String var2 = (String) arg0.objectStack[arg0.osp];
		String var3 = (String) arg0.objectStack[arg0.osp + 1];
		if (var2.length() <= 500 && var3.length() <= 500) {
			method639(var1, var2, var3);
		}
	}

	@ObfuscatedName("i.bcg(ILjava/lang/String;Ljava/lang/String;B)V")
	public static void method639(int arg0, String arg1, String arg2) {
		if (Client.gameConnection == null) {
			return;
		}
		ClientMessage var3 = ClientMessage.createMessage(ClientProt.BUG_REPORT, Client.gameConnection.randomOut);
		var3.buf.p2(Packet.method8398(arg1) + 1 + Packet.method8398(arg2));
		var3.buf.pjstr2(arg1);
		var3.buf.p1_alt2(arg0);
		var3.buf.pjstr2(arg2);
		Client.gameConnection.queue(var3);
	}

	@ObfuscatedName("eg.bcz(Lyf;I)V")
	public static void array_sort(ClientScriptState arg0) {
		int var1 = arg0.intStack[arg0.isp - 3];
		int var2 = arg0.intStack[arg0.isp - 2];
		int var3 = arg0.intStack[arg0.isp - 1];
		arg0.isp -= 3;
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
		arg0.intStack[++arg0.isp - 1] = 1;
	}

	@ObfuscatedName("qs.bcc(Lyf;I)V")
	public static final void preload_percent(ClientScriptState arg0) {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < Client.js5Providers.length; var3++) {
			if (Client.js5Providers[var3] != null && Client.js5Providers[var3].method16837()) {
				var1 += Client.js5Providers[var3].method16826();
				var2 += Client.js5Providers[var3].method16828();
			}
		}
		arg0.intStack[++arg0.isp - 1] = var1 == 0 ? 0 : var2 * 100 / var1;
	}

	@ObfuscatedName("no.bcn(Lyf;I)V")
	public static final void preload_progress(ClientScriptState arg0) {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < Client.js5Providers.length; var3++) {
			if (Client.js5Providers[var3] != null && Client.js5Providers[var3].method16837()) {
				var1 += Client.js5Providers[var3].method16826();
				var2 += Client.js5Providers[var3].method16828();
			}
		}
		arg0.intStack[++arg0.isp - 1] = var1 == 0 ? 0 : var2 * 100 / var1;
	}

	@ObfuscatedName("we.bca(Lyf;B)V")
	public static final void preload_download_complete(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 1;
	}

	@ObfuscatedName("vg.bcr(Lyf;I)V")
	public static final void preload_download_downloadedsize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("tg.bck(Lyf;I)V")
	public static final void preload_download_remainingsize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ii.bcw(Lyf;I)V")
	public static final void preload_download_totalsize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("wa.bcf(Lyf;I)V")
	public static final void preload_download_rate(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("qc.bct(Lyf;S)V")
	public static final void shader_preload_allow(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("ej.bcq(Lyf;I)V")
	public static final void shader_preload_percent(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 100;
	}

	@ObfuscatedName("wx.bco(Lyf;B)V")
	public static final void shader_preload_throttle(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("nh.bcs(Lyf;I)V")
	public static final void can_run_java_client(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 1;
	}

	@ObfuscatedName("nt.bda(Lyf;B)V")
	public static final void fps_stats(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = GameShell.fps;
		arg0.intStack[++arg0.isp - 1] = GameShell.fps;
		arg0.intStack[++arg0.isp - 1] = 1;
	}

	@ObfuscatedName("fd.bdk(Lyf;I)V")
	public static final void runjavascript(ClientScriptState arg0) {
	}

	@ObfuscatedName("q.bdl(Lyf;I)V")
	public static final void worldmap_setflashloops(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ClientWorldMap.setFlashLoops(var1);
	}

	@ObfuscatedName("acw.bde(Lyf;B)V")
	public static final void worldmap_setflashloops_default(ClientScriptState arg0) {
		ClientWorldMap.setFlashLoops(ClientWorldMap.field11649);
	}

	@ObfuscatedName("acp.bdv(Lyf;B)V")
	public static final void worldmap_setflashtics(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		ClientWorldMap.setFlashTics(var1);
	}

	@ObfuscatedName("cs.bds(Lyf;B)V")
	public static final void worldmap_setflashtics_default(ClientScriptState arg0) {
		ClientWorldMap.setFlashTics(ClientWorldMap.field11650);
	}

	@ObfuscatedName("cr.bdh(Lyf;B)V")
	public static final void worldmap_perpetualflash(ClientScriptState arg0) {
		boolean var1 = arg0.intStack[--arg0.isp] == 1;
		ClientWorldMap.perpetualFlash(var1);
	}

	@ObfuscatedName("ka.bdm(Lyf;I)V")
	public static final void worldmap_stopcurrentflashes(ClientScriptState arg0) {
		ClientWorldMap.stopCurrentFlashes();
	}

	@ObfuscatedName("kn.bdi(Lyf;I)V")
	public static final void os_ismac(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = NativeLibraryConfig.osName.startsWith("mac") ? 1 : 0;
	}

	@ObfuscatedName("ic.bdb(Lyf;I)V")
	public static final void os_iswindows(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = NativeLibraryConfig.osName.startsWith("win") ? 1 : 0;
	}

	@ObfuscatedName("sa.bdp(Lyf;I)V")
	public static final void os_islinux(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = NativeLibraryConfig.osName.startsWith("linux") ? 1 : 0;
	}

	@ObfuscatedName("fi.bdx(Lyf;I)V")
	public static final void os_isandroid(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ac.bdy(Lyf;I)V")
	public static final void os_isios(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("adj.bdc(Lyf;I)V")
	public static final void os_physicalmemorysize(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.hardwarePlatform.cpuInfoRam;
	}

	@ObfuscatedName("aow.bdn(Lyf;I)V")
	public static final void os_driver_outdated(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ny.bdq(Lyf;I)V")
	public static final void os_driver_vendor(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = -1;
	}

	@ObfuscatedName("sh.bdd(Lyf;B)V")
	public static final void getgridcoordrelativetocamera(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = Client.localPlayerEntity.coord().pack();
	}

	@ObfuscatedName("dj.bdu(Lyf;I)V")
	public static final void movescripted(ClientScriptState arg0) {
		arg0.isp -= 2;
		MoveSpeed var1 = (MoveSpeed) SerializableEnums.decode(MoveSpeed.values(), arg0.intStack[arg0.isp]);
		CoordGrid var2 = new CoordGrid(arg0.intStack[arg0.isp + 1]);
		if (var2.level == -1) {
			throw new RuntimeException("");
		} else if (MoveSpeed.CRAWL != var1 && MoveSpeed.WALK != var1 && MoveSpeed.RUN != var1) {
			throw new RuntimeException("");
		} else if (Client.gameConnection != null) {
			ClientMessage var3 = ClientMessage.createMessage(ClientProt.MOVE_SCRIPTED, Client.gameConnection.randomOut);
			var3.buf.p1_alt1(var1.getId());
			var3.buf.p2_alt2(var2.z);
			var3.buf.p2_alt1(var2.x);
			Client.gameConnection.queue(var3);
		}
	}

	@ObfuscatedName("ix.bdz(Lyf;I)V")
	public static final void telemetry_get_group_count(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroupCount();
	}

	@ObfuscatedName("zk.bdf(Lyf;B)V")
	public static final void telemetry_get_group_index(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroupIndex(var1);
	}

	@ObfuscatedName("je.bdj(Lyf;I)V")
	public static final void telemetry_get_group_id(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroup(var1).id;
	}

	@ObfuscatedName("sz.bdw(Lyf;I)V")
	public static final void telemetry_get_row_count(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroup(var1).getRowCount();
	}

	@ObfuscatedName("vu.bdt(Lyf;B)V")
	public static final void telemetry_get_row_index(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroup(var1).getRowIndex(var2);
	}

	@ObfuscatedName("tg.bdg(Lyf;I)V")
	public static final void telemetry_get_row_id(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroup(var1).getRowId(var2);
	}

	@ObfuscatedName("ts.bdo(Lyf;B)V")
	public static final void telemetry_is_row_pinned(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroup(var1).isRowPinned(var2) ? 1 : 0;
	}

	@ObfuscatedName("wf.bdr(Lyf;I)V")
	public static final void telemetry_get_column_count(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroup(var1).getColumnCount();
	}

	@ObfuscatedName("uh.bev(Lyf;B)V")
	public static final void telemetry_get_column_index(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroup(var1).getColumnIndex(var2);
	}

	@ObfuscatedName("vg.bel(Lyf;I)V")
	public static final void telemetry_get_column_id(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroup(var1).getColumnId(var2);
	}

	@ObfuscatedName("kl.bec(Lyf;I)V")
	public static final void telemetry_get_grid_value(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		Integer var4 = (Integer) Client.telemetry.getGroup(var1).getGridValue(var2, var3);
		if (var4 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var4;
		}
	}

	@ObfuscatedName("yz.bej(Lyf;I)V")
	public static final void telemetry_is_grid_processor_set(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		arg0.intStack[++arg0.isp - 1] = Client.telemetry.getGroup(var1).getGridValue(var2, var3) == null ? 0 : 1;
	}

	@ObfuscatedName("pw.bei(Lyf;I)V")
	public static final void emoji_add(ClientScriptState arg0) {
		arg0.isp -= 2;
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		if (!EmojiList.isValidChar(var1.charAt(0))) {
			throw new RuntimeException();
		} else if (var1.isEmpty() || var1.length() > 10) {
			throw new RuntimeException();
		} else if (!Client.emojiList.add(var1, var2, var3)) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("kt.beu(Lyf;I)V")
	public static final void emoji_remove(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Client.emojiList.remove(var1);
	}

	@ObfuscatedName("ho.bex(Lyf;B)V")
	public static final void emoji_removeall(ClientScriptState arg0) {
		Client.emojiList.removeAll();
	}

	@ObfuscatedName("fu.ben(Lyf;I)V")
	public static final void emoji_substitute(ClientScriptState arg0) {
		if (Client.emojiList.getSize() > 0) {
			String var1 = (String) arg0.objectStack[--arg0.osp];
			String var2 = Client.emojiList.substitute(var1);
			arg0.objectStack[++arg0.osp - 1] = var2;
		}
	}

	@ObfuscatedName("qn.bes(Lyf;B)V")
	public static final void emoji_enable_auto_chatline(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Client.emojiList.setAutochat(var1 != 0);
	}

	@ObfuscatedName("vj.beg(Lyf;ZI)V")
	public static final void db_find(ClientScriptState arg0, boolean arg1) {
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		DBTableIndex var4 = Client.method146(var2);
		if (var4 == null) {
			throw new RuntimeException();
		}
		Client.field754 = var4.method15187(var3);
		if (Client.field754 != null) {
			Client.field10767 = DBUtils.method746(var2);
			Client.field8853 = Client.field754.iterator();
			if (arg1) {
				arg0.intStack[++arg0.isp - 1] = Client.field754.size();
			}
			return;
		}
		Client.field10767 = -1;
		Client.field8853 = null;
		if (arg1) {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("hf.bea(Lyf;B)V")
	public static final void db_listall(ClientScriptState arg0) {
		arg0.isp--;
		int var1 = arg0.intStack[arg0.isp];
		DBTableIndex var2 = Client.method4574(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Client.field754 = var2.method15187(0);
		if (Client.field754 != null) {
			Client.field10767 = var1;
			Client.field8853 = Client.field754.iterator();
			arg0.intStack[++arg0.isp - 1] = Client.field754.size();
		}
	}

	@ObfuscatedName("aht.bew(Lyf;I)V")
	public static final void db_findnext(ClientScriptState arg0) {
		if (Client.field8853 != null && Client.field8853.hasNext()) {
			arg0.intStack[++arg0.isp - 1] = (Integer) Client.field8853.next();
		} else {
			arg0.intStack[++arg0.isp - 1] = -1;
		}
	}

	@ObfuscatedName("pk.beq(Lyf;B)V")
	public static final void db_getfield(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = DBUtils.method746(var2);
		int var5 = DBUtils.method15018(var2);
		DBRowType var6 = (DBRowType) Client.dbRowTypeList.list(var1);
		DBTableType var7 = (DBTableType) Client.dbTableTypeList.list(var4);
		ScriptVarType[] var8 = var7.types[var5];
		Object[] var9 = var6.method14711(var5);
		if (var9 == null && var7.defaultValues != null) {
			var9 = var7.defaultValues[var5];
		}
		if (var9 == null) {
			for (int var10 = 0; var10 < var8.length; var10++) {
				ScriptVarType var11 = var8[var10];
				if (ScriptVarType.STRING == var11) {
					arg0.objectStack[++arg0.osp - 1] = "";
				} else if (ScriptVarType.INT == var11 || ScriptVarType.BOOLEAN == var11) {
					arg0.intStack[++arg0.isp - 1] = 0;
				} else {
					arg0.intStack[++arg0.isp - 1] = -1;
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
				arg0.objectStack[++arg0.osp - 1] = var9[var14];
			} else {
				arg0.intStack[++arg0.isp - 1] = (Integer) var9[var14];
			}
		}
	}

	@ObfuscatedName("fu.beo(Lyf;I)V")
	public static final void db_getfieldcount(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = 0;
		int var4 = var2 >>> 8;
		int var5 = var2 & 0xFF;
		DBRowType var6 = (DBRowType) Client.dbRowTypeList.list(var1);
		DBTableType var7 = (DBTableType) Client.dbTableTypeList.list(var4);
		ScriptVarType[] var8 = var7.types[var5];
		Object[] var9 = var6.method14711(var5);
		if (var9 == null && var7.defaultValues != null) {
			var9 = var7.defaultValues[var5];
		}
		if (var9 != null) {
			var3 = var9.length / var8.length;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("wn.bey(Lyf;I)V")
	public static final void db_find_get(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = -1;
		if (Client.field754 != null && var1 >= 0 && var1 < Client.field754.size()) {
			var2 = (Integer) Client.field754.get(var1);
		}
		arg0.intStack[++arg0.isp - 1] = var2;
	}

	@ObfuscatedName("vy.bep(Lyf;I)V")
	public static final void db_find_refine(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		DBTableIndex var3 = Client.method146(var1);
		if (var3 == null) {
			throw new RuntimeException();
		} else if (DBUtils.method746(var1) != Client.field10767) {
			throw new RuntimeException();
		} else if (Client.field754 == null && Client.field754.isEmpty()) {
			throw new RuntimeException();
		} else {
			List var4 = var3.method15187(var2);
			Client.field754 = new java.util.LinkedList(Client.field754);
			if (var4 == null) {
				Client.field754.clear();
			} else {
				Client.field754.retainAll(var4);
			}
			Client.field8853 = Client.field754.iterator();
			arg0.intStack[++arg0.isp - 1] = Client.field754.size();
		}
	}

	@ObfuscatedName("ei.beb(Lyf;B)V")
	public static final void db_getrowtable(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		DBRowType var2 = (DBRowType) Client.dbRowTypeList.list(var1);
		arg0.intStack[++arg0.isp - 1] = var2.tableId;
	}

	@ObfuscatedName("agf.bez(Lyf;B)V")
	public static final void method16447(ClientScriptState arg0) {
		arg0.isp -= 3;
		Client.method7623(arg0.intStack[arg0.isp + 1]);
	}

	@ObfuscatedName("qu.bed(Lyf;B)V")
	public static final void method7328(ClientScriptState arg0) {
		arg0.isp -= 4;
	}

	@ObfuscatedName("yi.bet(Lyf;B)V")
	public static final void method10757(ClientScriptState arg0) {
	}

	@ObfuscatedName("vl.bee(Lyf;I)V")
	public static final void method9286(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("x.ber(Lyf;I)V")
	public static final void minimenu_close(ClientScriptState arg0) {
	}

	@ObfuscatedName("yi.bef(Lyf;I)V")
	public static final void method10758(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("xg.bek(Lyf;I)V")
	public static final void unknown_command_98(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
	}

	@ObfuscatedName("gh.bem(Lyf;I)V")
	public static final void method3591(ClientScriptState arg0) {
		arg0.isp -= 2;
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.objectStack[++arg0.osp - 1] = "";
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("mc.beh(Lyf;B)V")
	public static final void method5896(ClientScriptState arg0) {
		arg0.isp -= 2;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("nf.bfi(Lyf;I)V")
	public static final void method6079(ClientScriptState arg0) {
		arg0.isp -= 2;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("xq.bfg(Lyf;I)V")
	public static final void method10336(ClientScriptState arg0) {
		arg0.isp -= 2;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("rl.bfl(Lyf;B)V")
	public static final void method7884(ClientScriptState arg0) {
		arg0.isp -= 2;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ji.bfv(Lyf;I)V")
	public static final void method4982(ClientScriptState arg0) {
		arg0.isp -= 2;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("mt.bfq(Lyf;I)V")
	public static final void method5893(ClientScriptState arg0) {
		arg0.isp -= 4;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("tu.bfo(Lyf;I)V")
	public static final void method8396(ClientScriptState arg0) {
		arg0.isp -= 3;
	}

	@ObfuscatedName("yz.bfk(Lyf;I)V")
	public static final void interface_setpickingradius(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("tp.bff(Lyf;I)V")
	public static final void interface_getpickingradius(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("ace.bfr(Lyf;B)V")
	public static final void method15087(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		FontMetrics var2 = Client.fontProvider.getFontMetrics(Client.fontFactory, var1);
		arg0.intStack[++arg0.isp - 1] = var2.field8566;
		arg0.intStack[++arg0.isp - 1] = var2.field8562;
		arg0.intStack[++arg0.isp - 1] = var2.field8569;
		arg0.intStack[++arg0.isp - 1] = var2.field8568;
		arg0.intStack[++arg0.isp - 1] = var2.field8567;
	}

	@ObfuscatedName("ny.bfp(Lyf;I)V")
	public static final void method5949(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("gp.bfu(Lyf;B)V")
	public static final void method3485(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 1;
	}

	@ObfuscatedName("kr.bfy(Lyf;I)V")
	public static final void battery_ischarging(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 1;
	}

	@ObfuscatedName("jb.bfn(Lyf;B)V")
	public static final void battery_getlevelpercent(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 100;
	}

	@ObfuscatedName("sg.bfx(Lyf;I)V")
	public static final void method8382(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("kz.bfm(Lyf;I)V")
	public static final void logout_getreason(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Client.logoutReason.getId();
	}

	@ObfuscatedName("hp.bfz(Lyf;I)V")
	public static final void method4060(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 1;
	}

	@ObfuscatedName("rm.bfs(Lyf;I)V")
	public static final void show_software_license(ClientScriptState arg0) {
	}

	@ObfuscatedName("dh.bfd(Lyf;I)V")
	public static final void method2581(ClientScriptState arg0) {
	}

	@ObfuscatedName("nr.bfa(Lyf;I)V")
	public static final void shop_opencategories(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("we.bfe(Lyf;I)V")
	public static final void notifications_sendlocal(ClientScriptState arg0) {
		arg0.osp -= 2;
		arg0.isp -= 2;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("yb.bfc(Lyf;I)V")
	public static final void notifications_sendgroupedlocal(ClientScriptState arg0) {
		arg0.osp -= 3;
		arg0.isp -= 3;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("am.bfw(Lyf;I)V")
	public static final void notifications_cancellocal(ClientScriptState arg0) {
		arg0.isp--;
	}

	@ObfuscatedName("in.bft(Lyf;S)V")
	public static final void method4422(ClientScriptState arg0) {
		arg0.isp--;
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("alw.bfh(Lyf;I)V")
	public static final void method18150(ClientScriptState arg0) {
		arg0.osp--;
	}

	@ObfuscatedName("apm.bfj(Lyf;B)V")
	public static final void method18922(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 1;
	}

	@ObfuscatedName("qh.bfb(Lyf;I)V")
	public static final void method7352(ClientScriptState arg0) {
	}

	@ObfuscatedName("uh.bgy(Lyf;I)V")
	public static final void setwalkmarker(ClientScriptState arg0) {
		arg0.isp -= 2;
	}
}
