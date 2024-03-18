package com.jagex.game.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.game.config.vartype.*;
import deob.ObfuscatedName;

@ObfuscatedName("qe")
public class VarDomainType implements SerializableEnum {

	@ObfuscatedName("qe.e")
	public static final VarDomainType PLAYER = new VarDomainTypePlayer(Js5ConfigGroup.VAR_PLAYER, 0, true, true);

	@ObfuscatedName("qe.n")
	public static final VarDomainType NPC = new VarDomainTypeNpc(Js5ConfigGroup.VAR_NPC, 1, false, true);

	@ObfuscatedName("qe.m")
	public static final VarDomainType CLIENT = new VarDomainTypeClient(Js5ConfigGroup.VAR_CLIENT, 2, true, true);

	@ObfuscatedName("qe.k")
	public static final VarDomainType WORLD = new VarDomainTypeWorld(Js5ConfigGroup.VAR_WORLD, 3, false, false);

	@ObfuscatedName("qe.f")
	public static final VarDomainType REGION = new VarDomainType(Js5ConfigGroup.VAR_REGION, 4, false, false);

	@ObfuscatedName("qe.w")
	public static final VarDomainType OBJECT = new VarDomainType(Js5ConfigGroup.VAR_OBJECT, 5, true, true);

	@ObfuscatedName("qe.l")
	public static final VarDomainType CLAN = new VarDomainType(Js5ConfigGroup.VAR_CLAN, 6, true, true);

	@ObfuscatedName("qe.u")
	public static final VarDomainType CLAN_SETTING = new VarDomainType(Js5ConfigGroup.VAR_CLAN_SETTING, 7, true, false);

	@ObfuscatedName("qe.z")
	public static final VarDomainType CONTROLLER = new VarDomainTypeController(Js5ConfigGroup.VAR_CONTROLLER, 8, false, false);

	@ObfuscatedName("qe.p")
	public static final VarDomainType PLAYER_GROUP = new VarDomainType(Js5ConfigGroup.VAR_PLAYER_GROUP, 9, false, true);

	@ObfuscatedName("qe.d")
	public static final VarDomainType GLOBAL = new VarDomainType(Js5ConfigGroup.VAR_GLOBAL, 10, false, false);

	@ObfuscatedName("qe.c")
	public final Js5ConfigGroup js5GroupID;

	@ObfuscatedName("qe.r")
	public final int serialID;

	// $FF: synthetic method
	public VarDomainType(Js5ConfigGroup js5GroupID, int serialID, boolean arg2, boolean arg3, VarDomainTypePlayer arg4) {
		this(js5GroupID, serialID, arg2, arg3);
	}

	@ObfuscatedName("qe.e(I)[Lqe;")
	public static VarDomainType[] values() {
		return new VarDomainType[] {PLAYER_GROUP, CLAN_SETTING, CONTROLLER, GLOBAL, PLAYER, CLIENT, REGION, OBJECT, WORLD, NPC, CLAN};
	}

	public VarDomainType(Js5ConfigGroup js5GroupID, int serialID, boolean arg2, boolean arg3) {
		this.js5GroupID = js5GroupID;
		this.serialID = serialID;
	}

	@ObfuscatedName("qe.m(B)Lxq;")
	public final Js5ConfigGroup getJs5GroupID() {
		return this.js5GroupID;
	}

	@ObfuscatedName("qe.n()I")
	public int getId() {
		return this.serialID;
	}

	@ObfuscatedName("qe.f(Lec;B)Ljava/lang/Object;")
	public Object method7211(VarType arg0) {
		return arg0.field1703 ? this.getDefaultValue(arg0) : arg0.dataType.getDefaultValue();
	}

	@ObfuscatedName("qe.w(Lec;I)Ljava/lang/Object;")
	public Object getDefaultValue(VarType arg0) {
		return arg0.dataType.getDefaultValue();
	}
}
