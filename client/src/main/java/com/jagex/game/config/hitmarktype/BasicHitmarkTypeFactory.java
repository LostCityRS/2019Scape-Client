package com.jagex.game.config.hitmarktype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ala")
public class BasicHitmarkTypeFactory extends HitmarkTypeFactory implements ConfigTypeFactory {

	public BasicHitmarkTypeFactory(Js5 js5) {
		super(js5);
	}

	@ObfuscatedName("ala.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new HitmarkType(id, this, configTypeList);
	}

	@ObfuscatedName("ala.o(B)Ljava/lang/Class;")
	public Class type() {
		return HitmarkType.class;
	}
}
