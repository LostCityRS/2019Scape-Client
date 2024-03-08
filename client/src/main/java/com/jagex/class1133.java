package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqp")
public class class1133 extends class906 {

	public class1133(class442 arg0, class442 arg1, class1137 arg2) {
		super(arg0, arg1, arg2);
	}

	@ObfuscatedName("aqp.s(IIIII)V")
	public void method16662(int arg0, int arg1, int arg2, int arg3) {
		int var5 = this.field10543.method1434();
		int var6 = ((class1137) this.field3027).field12100 * class280.method3583() / 10 % var5;
		this.field10543.method1448(arg0 - var5 + var6, arg1, arg2 + var5 - var6, arg3);
	}
}
