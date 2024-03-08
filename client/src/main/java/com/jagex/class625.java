package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wx")
public class class625 {

	@ObfuscatedName("wx.e")
	public class588 field7675;

	public class625(class442 arg0) {
		byte[] var2 = arg0.method6894(class628.field7706.field7708);
		if (var2 != null) {
			this.method9847(new class997(var2));
		}
	}

	@ObfuscatedName("wx.e(Lalw;I)V")
	public void method9847(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field7675 = class590.method4055(arg0);
			}
		}
	}
}
