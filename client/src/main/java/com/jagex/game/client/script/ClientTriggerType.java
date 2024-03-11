package com.jagex.game.client.script;

import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("uh")
public class ClientTriggerType implements TriggerType {

	@ObfuscatedName("uh.e")
	public static final ClientTriggerType field7258 = new ClientTriggerType("", 10, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.n")
	public static final ClientTriggerType field7249 = new ClientTriggerType("", 11, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.m")
	public static final ClientTriggerType field7257 = new ClientTriggerType("", 12, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.k")
	public static final ClientTriggerType field7253 = new ClientTriggerType("", 13, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.f")
	public static final ClientTriggerType field7252 = new ClientTriggerType("", 14, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@ObfuscatedName("uh.w")
	public static final ClientTriggerType field7263 = new ClientTriggerType("", 15, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

	@ObfuscatedName("uh.l")
	public static final ClientTriggerType field7254 = new ClientTriggerType("", 16, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

	@ObfuscatedName("uh.u")
	public static final ClientTriggerType field7255 = new ClientTriggerType("", 17, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

	@ObfuscatedName("uh.z")
	public static final ClientTriggerType field7256 = new ClientTriggerType("", 18);

	@ObfuscatedName("uh.p")
	public static final ClientTriggerType field7261 = new ClientTriggerType("", 19);

	@ObfuscatedName("uh.d")
	public static final ClientTriggerType field7269 = new ClientTriggerType("", 20, new ScriptVarType[] { ScriptVarType.STRING, ScriptVarType.INT}, null);

	@ObfuscatedName("uh.c")
	public static final ClientTriggerType field7259 = new ClientTriggerType("", 21);

	@ObfuscatedName("uh.r")
	public static final ClientTriggerType field7260 = new ClientTriggerType("", 22);

	@ObfuscatedName("uh.v")
	public static final ClientTriggerType field7251 = new ClientTriggerType("", 23, new ScriptVarType[] { ScriptVarType.PLAYER_UID}, null);

	@ObfuscatedName("uh.o")
	public static final ClientTriggerType field7262 = new ClientTriggerType("", 24);

	@ObfuscatedName("uh.s")
	public static final ClientTriggerType field7265 = new ClientTriggerType("", 25);

	@ObfuscatedName("uh.y")
	public static final ClientTriggerType field7264 = new ClientTriggerType("", 26);

	@ObfuscatedName("uh.q")
	public static final ClientTriggerType field7248 = new ClientTriggerType("", 27);

	@ObfuscatedName("uh.x")
	public static final ClientTriggerType field7266 = new ClientTriggerType("", 28);

	@ObfuscatedName("uh.b")
	public static final ClientTriggerType field7267 = new ClientTriggerType_Sub2("", 29, true, false);

	@ObfuscatedName("uh.h")
	public static final ClientTriggerType field7268 = new ClientTriggerType_Sub1("", 30, true, false);

	@ObfuscatedName("uh.a")
	public static final ClientTriggerType field7270 = new ClientTriggerType("", 73, true, true);

	@ObfuscatedName("uh.g")
	public static final ClientTriggerType field7250 = new ClientTriggerType("", 76, true, false);

	@ObfuscatedName("uh.i")
	public final int field7271;

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
		this.field7271 = arg1;
	}

	@ObfuscatedName("uh.n()I")
	public int getId() {
		return this.field7271;
	}
}
