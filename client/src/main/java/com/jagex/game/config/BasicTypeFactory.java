package com.jagex.game.config;

import com.jagex.game.client.ConfigRelated;
import deob.ObfuscatedName;

@ObfuscatedName("aca")
public class BasicTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("aca.e")
	public final Class field8843;

	public BasicTypeFactory(Class arg0) {
		this.field8843 = arg0;
	}

	@ObfuscatedName("aca.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		try {
			ConfigType var3 = (ConfigType) this.field8843.getDeclaredConstructor().newInstance();
			((ConfigRelated) var3).method2998(id);
			return var3;
		} catch (Exception var5) {
			var5.printStackTrace();
			return null;
		}
	}

	@ObfuscatedName("aca.o(B)Ljava/lang/Class;")
	public Class type() {
		return this.field8843;
	}
}
