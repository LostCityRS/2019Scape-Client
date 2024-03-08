package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("alo")
public class CursorTypeFactory extends class651 implements ConfigTypeFactory {

	public CursorTypeFactory(class442 arg0) {
		super(arg0);
	}

	@ObfuscatedName("alo.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new CursorType(arg0, this);
	}

	@ObfuscatedName("alo.o(B)Ljava/lang/Class;")
	public Class type() {
		return CursorType.class;
	}
}
