package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ale")
public class class1008 extends class567 implements ConfigTypeFactory {

	public class1008(class442 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ale.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new class566(arg0, this);
	}

	@ObfuscatedName("ale.o(B)Ljava/lang/Class;")
	public Class type() {
		return class566.class;
	}
}
