package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rk")
public class class482 {

	@ObfuscatedName("rk.e")
	public byte field4957;

	@ObfuscatedName("rk.n")
	public int field4959;

	@ObfuscatedName("rk.m")
	public int field4961;

	@ObfuscatedName("rk.k")
	public int field4960;

	@ObfuscatedName("rk.f")
	public int field4958;

	@ObfuscatedName("rk.w")
	public int field4962;

	public class482() {
	}

	public class482(class997 arg0, class808 arg1) {
		this.field4957 = arg0.method17905();
		this.field4959 = arg0.method17906();
		this.field4961 = arg0.method17910();
		this.field4960 = arg0.method17910();
		this.field4958 = arg0.method17910();
		this.field4962 = arg0.method17910();
		if (arg1 != null) {
			method972(arg0, arg1);
		}
	}

	@ObfuscatedName("aj.e(Lalw;Ladd;I)Labn;")
	public static class747 method972(class997 arg0, class808 arg1) {
		class747 var2 = new class747(arg1);
		while (true) {
			int var3 = arg0.method17904();
			if (var3 == 255) {
				return var2;
			}
			class470 var4 = (class470) class686.method17657(class470.class, var3);
			while (true) {
				int var5 = arg0.method17904();
				if (var5 == 255) {
					break;
				}
				arg0.field11503 -= -1445626955;
				class413 var6 = arg1.method15285(arg0, var4);
				if (var6 != null) {
					var2.method14735(var6.field4240, var6.field4239);
				}
			}
		}
	}

	@ObfuscatedName("rk.n(I)I")
	public int method7608() {
		return this.field4957 & 0x7;
	}

	@ObfuscatedName("rk.m(B)I")
	public int method7611() {
		return (this.field4957 & 0x8) == 8 ? 1 : 0;
	}
}
