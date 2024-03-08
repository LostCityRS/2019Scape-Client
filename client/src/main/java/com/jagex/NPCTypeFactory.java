package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agy")
public class NPCTypeFactory extends class261 {

	public NPCTypeFactory(boolean arg0, class442 arg1, Language arg2, ModeGame arg3) {
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
