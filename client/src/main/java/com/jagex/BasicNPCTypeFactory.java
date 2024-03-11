package com.jagex;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import deob.ObfuscatedName;

@ObfuscatedName("agy")
public class BasicNPCTypeFactory extends NPCTypeFactory {

	public BasicNPCTypeFactory(boolean arg0, Js5 arg1, Language arg2, ModeGame arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("agy.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new NPCType(arg0, this, arg1);
	}

	@ObfuscatedName("agy.o(B)Ljava/lang/Class;")
	public Class type() {
		return NPCType.class;
	}
}
