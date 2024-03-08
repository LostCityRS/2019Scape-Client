package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("er")
public class class160 {

	@ObfuscatedName("er.m")
	public final int[] field1751;

	@ObfuscatedName("er.k")
	public final int[] field1754;

	public class160(class997 arg0) {
		int var2 = arg0.method18123();
		this.field1751 = new int[var2];
		this.field1754 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = arg0.method17904();
			this.field1751[var3] = var4;
			int var5 = arg0.method17906();
			int var6 = arg0.method17906();
			this.field1754[var3] = (var5 << 16) + var6;
		}
	}

	@ObfuscatedName("er.e(Lea;II)V")
	public void method2906(class158 arg0, int arg1) {
		int var3 = this.field1754[0];
		arg0.method2866(arg1, var3 >>> 16, var3 & 0xFFFF);
		class892 var4 = arg0.method2870();
		var4.field10400 = 0;
		for (int var5 = this.field1751.length - 1; var5 >= 0; var5--) {
			int var6 = this.field1751[var5];
			int var7 = this.field1754[var5];
			var4.field10450[var4.field10400] = var7 >> 16;
			var4.field10448[var4.field10400] = var7 & 0xFFFF;
			byte var8 = class690.field8315.field8313;
			if (var6 == 0) {
				var8 = class690.field8314.field8313;
			} else if (var6 == 2) {
				var8 = class690.field8316.field8313;
			}
			var4.field10441[var4.field10400] = var8;
			var4.field10400++;
		}
	}
}
