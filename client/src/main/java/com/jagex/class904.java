package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aha")
public class class904 extends class293 {

	@ObfuscatedName("aha.k")
	public int field10537 = 0;

	public class904(class442 arg0, class915 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aha.n(ZI)V")
	public void method5105(boolean arg0) {
		int var2 = this.field3019.field3215.method5382(this.field3021.method1434(), client.field10941) + this.field3019.field3216;
		int var3 = this.field3019.field3214.method5375(this.field3021.method1436(), client.field10942) + this.field3019.field3217;
		this.field3021.method1451((float) (var2 + this.field3021.method1434() / 2), (float) (var3 + this.field3021.method1436() / 2), 4096, this.field10537);
		this.field10537 += ((class915) this.field3019).field10582;
	}
}
