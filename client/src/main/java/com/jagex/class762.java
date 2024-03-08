package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aca")
public class class762 implements class761 {

	@ObfuscatedName("aca.e")
	public final Class field8843;

	public class762(Class arg0) {
		this.field8843 = arg0;
	}

	@ObfuscatedName("aca.v(ILao;I)Lay;")
	public class53 method4414(int arg0, class51 arg1) {
		try {
			class53 var3 = (class53) this.field8843.getDeclaredConstructor().newInstance();
			((class757) var3).method2998(arg0);
			return var3;
		} catch (Exception var5) {
			var5.printStackTrace();
			return null;
		}
	}

	@ObfuscatedName("aca.o(B)Ljava/lang/Class;")
	public Class method4415() {
		return this.field8843;
	}
}
