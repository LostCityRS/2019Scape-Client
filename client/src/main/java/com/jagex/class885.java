package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agq")
public class class885 extends class166 {

	public class885(ConfigTypeList arg0, class442 arg1, class442 arg2, class442 arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("agq.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new class164(arg0, this);
	}

	@ObfuscatedName("agq.o(B)Ljava/lang/Class;")
	public Class type() {
		return class164.class;
	}
}
