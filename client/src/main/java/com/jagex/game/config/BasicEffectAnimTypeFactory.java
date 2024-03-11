package com.jagex.game.config;

import com.jagex.game.config.spottype.EffectAnimTypeFactory;
import com.jagex.game.config.spottype.EffectAnimType;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("alx")
public class BasicEffectAnimTypeFactory extends EffectAnimTypeFactory {

	public BasicEffectAnimTypeFactory(Js5 arg0) {
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
