package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agr")
public class MapElementTypeFactory extends class229 {

	public MapElementTypeFactory(Js5 arg0, int arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("agr.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new MapElementType(arg0, arg1, this);
	}

	@ObfuscatedName("agr.o(B)Ljava/lang/Class;")
	public Class type() {
		return MapElementType.class;
	}
}
