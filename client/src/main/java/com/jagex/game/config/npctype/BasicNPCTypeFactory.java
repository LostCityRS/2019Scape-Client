package com.jagex.game.config.npctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("agy")
public class BasicNPCTypeFactory extends NPCTypeFactory {

	public BasicNPCTypeFactory(boolean allowMembers, Js5 js5, Language language, ModeGame modeGame) {
		super(allowMembers, js5, language, modeGame);
	}

	@ObfuscatedName("agy.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new NPCType(id, this, configTypeList);
	}

	@ObfuscatedName("agy.o(B)Ljava/lang/Class;")
	public Class type() {
		return NPCType.class;
	}
}
