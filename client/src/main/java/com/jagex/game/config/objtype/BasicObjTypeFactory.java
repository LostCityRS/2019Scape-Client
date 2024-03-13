package com.jagex.game.config.objtype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aow")
public class BasicObjTypeFactory extends ObjTypeFactory {

	public BasicObjTypeFactory(ModeGame modeGame, Language language, boolean allowMembers, Js5 js5, ConfigTypeList configTypeList) {
		super(modeGame, language, allowMembers, js5, configTypeList);
	}

	@ObfuscatedName("aow.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new ObjType(id, configTypeList, this);
	}

	@ObfuscatedName("aow.o(B)Ljava/lang/Class;")
	public Class type() {
		return ObjType.class;
	}
}
