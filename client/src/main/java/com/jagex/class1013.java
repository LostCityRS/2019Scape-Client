package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ala")
public class class1013 extends class583 implements ConfigTypeFactory {

	public class1013(class442 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ala.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new class582(arg0, this, arg1);
	}

	@ObfuscatedName("ala.o(B)Ljava/lang/Class;")
	public Class type() {
		return class582.class;
	}
}
