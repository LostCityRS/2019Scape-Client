package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aoy")
public class class1075 extends class721 {

	@ObfuscatedName("aoy.q")
	public boolean field11877 = false;

	@ObfuscatedName("aoy.x")
	public class892 field11876;

	public class1075(class892 arg0, boolean arg1) {
		super(arg1);
		this.field11876 = arg0;
	}

	@ObfuscatedName("aoy.ag(Lfg;II)V")
	public void method14407(class164 arg0, int arg1) {
		if (!this.field11877 || !this.field11876.field10454.method14346() || this.field11876.field10454.method14355()) {
			Statics.field1798.method3180(arg0, arg1, this.field11876);
		}
	}
}
