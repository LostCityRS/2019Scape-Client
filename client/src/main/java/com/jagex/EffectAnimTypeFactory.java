package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("alx")
public class EffectAnimTypeFactory extends class681 {

	public EffectAnimTypeFactory(Js5 arg0) {
		super(arg0);
	}

	@ObfuscatedName("alx.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new EffectAnimType(arg0, this);
	}

	@ObfuscatedName("alx.o(B)Ljava/lang/Class;")
	public Class type() {
		return EffectAnimType.class;
	}
}
