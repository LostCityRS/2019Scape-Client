package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("nw")
public class class382 implements class383 {

	@ObfuscatedName("nw.e")
	public class442 field3564;

	@ObfuscatedName("nw.n")
	public class162 field3565 = new class162(64);

	public class382(class442 arg0) {
		this.field3564 = arg0;
	}

	@ObfuscatedName("nw.e(II)Lnm;")
	public class375 method6015(int arg0) {
		class375 var2 = (class375) this.field3565.method2930((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3 = this.field3564.method6879(0, arg0);
		class375 var4 = new class375();
		if (var3 != null) {
			var4.method5954(new class997(var3), arg0);
		}
		this.field3565.method2921(var4, (long) arg0);
		return var4;
	}
}
