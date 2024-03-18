package com.jagex.game.config.idktype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ja")
public class IDKTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("ja.e")
	public final Js5 configClient;

	public IDKTypeFactory(Js5 configClient) {
		this.configClient = configClient;
	}

	@ObfuscatedName("ja.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new IDKType(id, this.configClient);
	}

	@ObfuscatedName("ja.o(B)Ljava/lang/Class;")
	public Class type() {
		return IDKType.class;
	}
}
