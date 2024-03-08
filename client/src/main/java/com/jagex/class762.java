package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aca")
public class class762 implements ConfigTypeFactory {

	@ObfuscatedName("aca.e")
	public final Class field8843;

	public class762(Class arg0) {
		this.field8843 = arg0;
	}

	@ObfuscatedName("aca.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		try {
			ConfigType var3 = (ConfigType) this.field8843.getDeclaredConstructor().newInstance();
			((class757) var3).method2998(arg0);
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
