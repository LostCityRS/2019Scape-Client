package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("tw")
public class class539 {

	@ObfuscatedName("tw.e")
	public int field6777;

	@ObfuscatedName("tw.n")
	public int[] field6776;

	@ObfuscatedName("tw.m")
	public int[] field6775;

	public class539(int arg0) {
		this.field6777 = arg0;
		this.field6776 = new int[this.field6777];
		this.field6775 = new int[this.field6777];
	}

	@ObfuscatedName("nn.e(Lpy;Ljava/lang/String;ZB)Ltw;")
	public static class539 method6046(class442 arg0, String arg1, boolean arg2) {
		int var3 = arg0.method6902(arg1);
		if (var3 == -1) {
			return new class539(0);
		}
		byte[] var4 = arg0.method6879(var3, 1);
		if (var4 == null) {
			return new class539(0);
		}
		class997 var5 = new class997(var4);
		int var6 = var5.method17906();
		class539 var7 = new class539(var6);
		int var8 = 0;
		while (true) {
			while (var8 < var7.field6777) {
				int var9 = var5.method17910();
				int var10 = var5.method17906();
				int var11 = var5.method17904();
				if (!arg2 && var11 == 1) {
					var7.field6777--;
				} else {
					var7.field6776[var8] = var9;
					var7.field6775[var8] = var10;
					var8++;
				}
			}
			return var7;
		}
	}
}
