package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("no")
public class class377 implements class378 {

	@ObfuscatedName("no.e")
	public class442 field3536;

	@ObfuscatedName("no.n")
	public class162 field3537 = new class162(64);

	public class377(class442 arg0) {
		this.field3536 = arg0;
	}

	@ObfuscatedName("no.e(II)Lna;")
	public class379 method5973(int arg0) {
		class379 var2 = (class379) this.field3537.method2930((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3 = this.field3536.method6879(1, arg0);
		class379 var4 = new class379();
		var4.field3548 = arg0;
		if (var3 != null) {
			var4.method5988(new class997(var3));
		}
		var4.method5990();
		this.field3537.method2921(var4, (long) arg0);
		return var4;
	}

	@ObfuscatedName("no.n(I)V")
	public void method5974() {
		this.field3537.method2924();
	}
}
