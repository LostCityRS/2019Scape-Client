package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ale")
public class HeadbarTypeFactory extends class567 implements ConfigTypeFactory {

	public HeadbarTypeFactory(Js5 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ale.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new HeadbarType(arg0, this);
	}

	@ObfuscatedName("ale.o(B)Ljava/lang/Class;")
	public Class type() {
		return HeadbarType.class;
	}
}
