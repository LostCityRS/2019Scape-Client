package com.jagex.game.config.effectanimtype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("alx")
public class BasicEffectAnimTypeFactory extends EffectAnimTypeFactory {

	public BasicEffectAnimTypeFactory(Js5 js5) {
		super(js5);
	}

	@ObfuscatedName("alx.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new EffectAnimType(id, this);
	}

	@ObfuscatedName("alx.o(B)Ljava/lang/Class;")
	public Class type() {
		return EffectAnimType.class;
	}
}
