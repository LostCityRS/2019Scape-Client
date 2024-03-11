package com.jagex;

import com.jagex.core.constants.Language;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.objtype.ObjType;
import deob.ObfuscatedName;

@ObfuscatedName("aow")
public class BasicObjTypeFactory extends ObjTypeFactory {

	public BasicObjTypeFactory(ModeGame arg0, Language arg1, boolean arg2, Js5 arg3, ConfigTypeList arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("aow.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new ObjType(arg0, arg1, this);
	}

	@ObfuscatedName("aow.o(B)Ljava/lang/Class;")
	public Class type() {
		return ObjType.class;
	}
}
