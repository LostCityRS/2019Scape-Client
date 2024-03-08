package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ja")
public class class284 implements ConfigTypeFactory {

	@ObfuscatedName("ja.e")
	public final class442 field2961;

	public class284(class442 arg0) {
		this.field2961 = arg0;
	}

	@ObfuscatedName("ja.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new class283(arg0, this.field2961);
	}

	@ObfuscatedName("ja.o(B)Ljava/lang/Class;")
	public Class type() {
		return class283.class;
	}
}
