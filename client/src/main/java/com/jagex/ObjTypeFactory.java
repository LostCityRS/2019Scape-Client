package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aow")
public class ObjTypeFactory extends class737 {

	public ObjTypeFactory(ModeGame arg0, Language arg1, boolean arg2, class442 arg3, ConfigTypeList arg4) {
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