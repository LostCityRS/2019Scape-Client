package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("jk")
public class class293 implements LoadingScreenElement {

	@ObfuscatedName("jk.e")
	public final class322 field3019;

	@ObfuscatedName("jk.n")
	public final Js5 field3020;

	@ObfuscatedName("jk.m")
	public Sprite field3021;

	public class293(Js5 arg0, class322 arg1) {
		this.field3020 = arg0;
		this.field3019 = arg1;
	}

	@ObfuscatedName("jk.e(I)V")
	public void method5104() {
		this.field3021 = MainLoadingScreen.method1589(this.field3020, this.field3019.field3218);
	}

	@ObfuscatedName("jk.n(ZI)V")
	public void method5105(boolean arg0) {
		if (arg0) {
			int var2 = this.field3019.field3215.method5382(this.field3021.method1434(), client.field10941) + this.field3019.field3216;
			int var3 = this.field3019.field3214.method5375(this.field3021.method1436(), client.field10942) + this.field3019.field3217;
			this.field3021.method1439(var2, var3);
		}
	}

	@ObfuscatedName("jk.m(I)Z")
	public boolean method5106() {
		return this.field3020.method6889(this.field3019.field3218);
	}
}
