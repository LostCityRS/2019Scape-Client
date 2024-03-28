package com.jagex.game.config;

import com.jagex.game.client.MutableConfig;
import deob.ObfuscatedName;

@ObfuscatedName("aca")
public class BasicTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("aca.e")
	public final Class type;

	public BasicTypeFactory(Class type) {
		this.type = type;
	}

	@ObfuscatedName("aca.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		try {
			ConfigType var3 = (ConfigType) this.type.getDeclaredConstructor().newInstance();
			((MutableConfig) var3).setId(id);
			return var3;
		} catch (Exception var5) {
			var5.printStackTrace();
			return null;
		}
	}

	@ObfuscatedName("aca.o(B)Ljava/lang/Class;")
	public Class type() {
		return this.type;
	}
}
