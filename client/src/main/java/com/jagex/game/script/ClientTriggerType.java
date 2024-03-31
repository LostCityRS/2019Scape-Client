package com.jagex.game.script;

import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("uh")
public class ClientTriggerType implements TriggerType {

	@ObfuscatedName("uh.e")
	public static final ClientTriggerType OPWORLDMAPELEMENT1 = new ClientTriggerType("", 10, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.n")
	public static final ClientTriggerType OPWORLDMAPELEMENT2 = new ClientTriggerType("", 11, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.m")
	public static final ClientTriggerType OPWORLDMAPELEMENT3 = new ClientTriggerType("", 12, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.k")
	public static final ClientTriggerType OPWORLDMAPELEMENT4 = new ClientTriggerType("", 13, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.f")
	public static final ClientTriggerType OPWORLDMAPELEMENT5 = new ClientTriggerType("", 14, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.w")
	public static final ClientTriggerType WORLDMAPELEMENTMOUSEOVER = new ClientTriggerType("", 15, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

	@ObfuscatedName("uh.l")
	public static final ClientTriggerType WORLDMAPELEMENTMOUSELEAVE = new ClientTriggerType("", 16, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

	@ObfuscatedName("uh.u")
	public static final ClientTriggerType WORLDMAPELEMENTMOUSEREPEAT = new ClientTriggerType("", 17, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

	@ObfuscatedName("uh.z")
	public static final ClientTriggerType VIDEO_END = new ClientTriggerType("", 18);

	@ObfuscatedName("uh.p")
	public static final ClientTriggerType JCOINS_UPDATED = new ClientTriggerType("", 19);

	@ObfuscatedName("uh.d")
	public static final ClientTriggerType CUTSCENE_SUBTITLE = new ClientTriggerType("", 20, new ScriptVarType[] { ScriptVarType.STRING, ScriptVarType.INT}, null);

	@ObfuscatedName("uh.c")
	public static final ClientTriggerType LOYALTY_UPDATED = new ClientTriggerType("", 21);

	@ObfuscatedName("uh.r")
	public static final ClientTriggerType PROCESS_NPC = new ClientTriggerType("", 22);

	@ObfuscatedName("uh.v")
	public static final ClientTriggerType PROCESS_PLAYER = new ClientTriggerType("", 23, new ScriptVarType[] { ScriptVarType.PLAYER_UID}, null);

	@ObfuscatedName("uh.o")
	public static final ClientTriggerType IF_PROCESS_ACTIVE_NPC = new ClientTriggerType("", 24);

	@ObfuscatedName("uh.s")
	public static final ClientTriggerType IF_PROCESS_ACTIVE_PLAYER = new ClientTriggerType("", 25);

	@ObfuscatedName("uh.y")
	public static final ClientTriggerType IF_PROCESS_ACTIVE_LOC = new ClientTriggerType("", 26);

	@ObfuscatedName("uh.q")
	public static final ClientTriggerType IF_PROCESS_ACTIVE_OBJ = new ClientTriggerType("", 27);

	@ObfuscatedName("uh.x")
	public static final ClientTriggerType CUTSCENE_END = new ClientTriggerType("", 28);

	@ObfuscatedName("uh.b")
	public static final ClientTriggerType TWITCH = new ClientTriggerType_Sub2("", 29, true, false);

	@ObfuscatedName("uh.h")
	public static final ClientTriggerType field7268 = new ClientTriggerType_Sub1("", 30, true, false);

	@ObfuscatedName("uh.a")
	public static final ClientTriggerType PROC = new ClientTriggerType("", 73, true, true);

	@ObfuscatedName("uh.g")
	public static final ClientTriggerType CLIENTSCRIPT = new ClientTriggerType("", 76, true, false);

	@ObfuscatedName("uh.i")
	public final int id;

	// $FF: synthetic method
	public ClientTriggerType(String arg0, int arg1, boolean arg2, boolean arg3, ClientTriggerType_Sub2 arg4) {
		this(arg0, arg1, arg2, arg3);
	}

	public ClientTriggerType(String arg0, int arg1) {
		this(arg0, arg1, false, (ScriptVarType[]) null, false, (ScriptVarType[]) null);
	}

	public ClientTriggerType(String arg0, int arg1, boolean arg2, boolean arg3) {
		this(arg0, arg1, arg2, (ScriptVarType[]) null, arg3, (ScriptVarType[]) null);
	}

	public ClientTriggerType(String arg0, int arg1, ScriptVarType[] arg2, ScriptVarType[] arg3) {
		this(arg0, arg1, arg2 != null, arg2, arg3 != null, arg3);
	}

	public ClientTriggerType(String arg0, int arg1, boolean arg2, ScriptVarType[] arg3, boolean arg4, ScriptVarType[] arg5) {
		this.id = arg1;
	}

	@ObfuscatedName("uh.n()I")
	public int getId() {
		return this.id;
	}
}
