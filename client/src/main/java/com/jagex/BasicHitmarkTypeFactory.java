package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ala")
public class BasicHitmarkTypeFactory extends HitmarkTypeFactory implements ConfigTypeFactory {

	public BasicHitmarkTypeFactory(Js5 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ala.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new HitmarkType(arg0, this, arg1);
	}

	@ObfuscatedName("ala.o(B)Ljava/lang/Class;")
	public Class type() {
		return HitmarkType.class;
	}
}
