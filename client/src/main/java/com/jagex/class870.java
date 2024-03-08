package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agx")
public class class870 extends class159 {

	@ObfuscatedName("agx.n")
	public final long field10288;

	@ObfuscatedName("agx.m")
	public final int field10289;

	public class870(class997 arg0, boolean arg1) {
		super(arg0);
		int var3 = arg0.method17906();
		if (arg1) {
			this.field10288 = (long) var3 | 0x100000000L;
		} else {
			this.field10288 = var3;
		}
		this.field10289 = arg0.method17910();
	}

	@ObfuscatedName("agx.n(I)V")
	public void method2890() {
		class988 var1 = (class988) class153.field1718.method14495(this.field10288);
		if (var1 == null) {
			class153.field1718.method14501(new class988(this.field10289), this.field10288);
		} else {
			var1.field11442 = this.field10289;
		}
	}
}
