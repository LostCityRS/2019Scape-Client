package com.jagex.game.client;

import com.jagex.game.config.defaults.SkillDefaults;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.group.PlayerGroupResourceProvider;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("d")
public final class ClientPlayerGroupResourceProvider implements PlayerGroupResourceProvider {

	@ObfuscatedName("d.e(B)Ladd;")
	public VarTypeList getVarPlayerTypeList() {
		return Client.varPlayerTypeList;
	}

	@ObfuscatedName("d.n(B)Ladd;")
	public VarTypeList getVarPlayerGroupTypeList() {
		return Client.varPlayerGroupTypeList;
	}

	@ObfuscatedName("d.m(I)Laor;")
	public VarBitTypeList getVarBitTypeList() {
		return Client.varBitTypeList;
	}

	@ObfuscatedName("d.k(B)Lwq;")
	public SkillDefaults getSkillDefaults() {
		return Client.skillDefaults;
	}
}
