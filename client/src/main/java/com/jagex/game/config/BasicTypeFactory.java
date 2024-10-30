package com.jagex.game.config;

import com.jagex.game.client.MutableConfig;
import deob.ObfuscatedName;

@ObfuscatedName("aca")
public class BasicTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("aca.e")
	public final Class type;

	public BasicTypeFactory(Class arg0) {
		this.type = arg0;
	}

	@ObfuscatedName("aca.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		try {
			ConfigType var3 = (ConfigType) this.type.getDeclaredConstructor().newInstance();
			((MutableConfig) var3).setId(arg0);
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
