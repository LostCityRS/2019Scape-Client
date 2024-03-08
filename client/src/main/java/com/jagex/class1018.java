package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("alo")
public class class1018 extends class651 implements ConfigTypeFactory {

	public class1018(class442 arg0) {
		super(arg0);
	}

	@ObfuscatedName("alo.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new class652(arg0, this);
	}

	@ObfuscatedName("alo.o(B)Ljava/lang/Class;")
	public Class type() {
		return class652.class;
	}
}
