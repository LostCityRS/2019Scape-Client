package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ku")
public class class299 implements class302 {

	@ObfuscatedName("ku.e")
	public final class320 field3047;

	@ObfuscatedName("ku.n")
	public final class442 field3045;

	@ObfuscatedName("ku.m")
	public class101 field3046;

	public class299(class442 arg0, class320 arg1) {
		this.field3045 = arg0;
		this.field3047 = arg1;
	}

	@ObfuscatedName("ku.e(I)V")
	public void method5104() {
		this.field3046 = class278.method1589(this.field3045, this.field3047.field3200);
	}

	@ObfuscatedName("ku.n(ZI)V")
	public void method5105(boolean arg0) {
		if (!arg0) {
			return;
		}
		int var2 = Statics.field6586 > client.field10941 ? Statics.field6586 : client.field10941;
		int var3 = Statics.field6600 > client.field10942 ? Statics.field6600 : client.field10942;
		int var4 = this.field3046.method1434();
		int var5 = this.field3046.method1436();
		int var6 = 0;
		int var7 = var2;
		int var8 = var2 * var5 / var4;
		int var9 = (var3 - var8) / 2;
		if (var8 > var3) {
			var9 = 0;
			var8 = var3;
			var7 = var3 * var4 / var5;
			var6 = (var2 - var7) / 2;
		}
		this.field3046.method1474(var6, var9, var7, var8);
	}

	@ObfuscatedName("ku.m(I)Z")
	public boolean method5106() {
		return this.field3045.method6889(this.field3047.field3200);
	}
}
