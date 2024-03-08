package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("l")
public class class14 {

	public class14() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gl.e(Lws;B)V")
	public static void method3470(class629 arg0) {
		Statics.field506 = arg0.field7733;
		Statics.field505 = arg0.field7746;
		Statics.field509 = arg0.field7747;
	}

	@ObfuscatedName("aft.n(Lws;I)V")
	public static void method16430(class629 arg0) {
		Statics.field507 = arg0.field7748;
		Statics.field514 = arg0.field7715;
		Statics.field508 = arg0.field7750;
		Statics.field11888 = arg0.field7751;
		Statics.field10232 = arg0.field7752;
		Statics.field9210 = arg0.field7753;
		Statics.field504 = arg0.field7732;
		Statics.field511 = arg0.field7755;
		Statics.field7572 = arg0.field7756;
		Statics.field11891 = arg0.field7720;
		Statics.field512 = arg0.field7721;
		Statics.field12241 = arg0.field7741;
	}

	@ObfuscatedName("au.m(I)[I")
	public static int[] method845() {
		return new int[] { Statics.field506, Statics.field505, Statics.field509 };
	}

	@ObfuscatedName("qx.k(Ldh;I)V")
	public static void method7114(class133 arg0) {
		Statics.field8321 = (class140) Statics.field7538.method6188(client.field10833, Statics.field506, true, true);
		Statics.field6778 = Statics.field7538.method6163(client.field10833, Statics.field506);
		Statics.field9184 = (class140) Statics.field7538.method6188(client.field10833, Statics.field505, true, true);
		Statics.field2657 = Statics.field7538.method6163(client.field10833, Statics.field505);
		Statics.field10355 = (class140) Statics.field7538.method6188(client.field10833, Statics.field509, true, true);
		Statics.field10268 = Statics.field7538.method6163(client.field10833, Statics.field509);
	}

	@ObfuscatedName("aej.f(Lpy;I)I")
	public static int method15381(class442 arg0) {
		int var1 = 0;
		if (arg0.method6889(Statics.field507)) {
			var1++;
		}
		if (arg0.method6889(Statics.field514)) {
			var1++;
		}
		if (arg0.method6889(Statics.field508)) {
			var1++;
		}
		if (arg0.method6889(Statics.field9210)) {
			var1++;
		}
		if (arg0.method6889(Statics.field504)) {
			var1++;
		}
		if (arg0.method6889(Statics.field511)) {
			var1++;
		}
		if (arg0.method6889(Statics.field7572)) {
			var1++;
		}
		if (arg0.method6889(Statics.field11891)) {
			var1++;
		}
		if (arg0.method6889(Statics.field512)) {
			var1++;
		}
		if (arg0.method6889(Statics.field12241)) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("kh.l(Ldh;Lpy;I)V")
	public static void method5202(class133 arg0, class442 arg1) {
		class136[] var2 = class111.method1608(arg1, Statics.field507, 0);
		Statics.field8323 = new class101[var2.length];
		for (int var3 = 0; var3 < var2.length; var3++) {
			Statics.field8323[var3] = arg0.method2200(var2[var3], true);
		}
		class136[] var4 = class111.method1608(arg1, Statics.field514, 0);
		Statics.field513 = new class101[var4.length];
		for (int var5 = 0; var5 < var4.length; var5++) {
			Statics.field513[var5] = arg0.method2200(var4[var5], true);
		}
		class136[] var6 = class111.method1608(arg1, Statics.field508, 0);
		Statics.field9149 = new class101[var6.length];
		byte var7 = 25;
		for (int var8 = 0; var8 < var6.length; var8++) {
			var6[var8].method2605(-var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D));
			Statics.field9149[var8] = arg0.method2200(var6[var8], true);
		}
		class136[] var9 = class111.method1608(arg1, Statics.field9210, 0);
		Statics.field11793 = new class101[var9.length];
		for (int var10 = 0; var10 < var9.length; var10++) {
			Statics.field11793[var10] = arg0.method2200(var9[var10], true);
		}
		class136[] var11 = class111.method1608(arg1, Statics.field504, 0);
		Statics.field510 = new class101[var11.length];
		byte var12 = 12;
		for (int var13 = 0; var13 < var11.length; var13++) {
			var11[var13].method2605(-var12 + (int) (Math.random() * (double) var12 * 2.0D), -var12 + (int) (Math.random() * (double) var12 * 2.0D), -var12 + (int) (Math.random() * (double) var12 * 2.0D));
			Statics.field510[var13] = arg0.method2200(var11[var13], true);
		}
		class136[] var14 = class111.method1608(arg1, Statics.field511, 0);
		Statics.field10302 = new class101[var14.length];
		byte var15 = 12;
		for (int var16 = 0; var16 < var14.length; var16++) {
			var14[var16].method2605(-var15 + (int) (Math.random() * (double) var15 * 2.0D), -var15 + (int) (Math.random() * (double) var15 * 2.0D), -var15 + (int) (Math.random() * (double) var15 * 2.0D));
			Statics.field10302[var16] = arg0.method2200(var14[var16], true);
		}
		Statics.field7207 = arg0.method2200(class111.method1609(arg1, Statics.field11891, 0), true);
		Statics.field1940 = arg0.method2200(class111.method1609(arg1, Statics.field512, 0), true);
		class136[] var17 = class111.method1608(arg1, Statics.field12241, 0);
		Statics.field6719 = new class101[var17.length];
		for (int var18 = 0; var18 < var17.length; var18++) {
			Statics.field6719[var18] = arg0.method2200(var17[var18], true);
		}
	}

	@ObfuscatedName("ge.u(I)V")
	public static void method3568() {
		Statics.field8321 = null;
		Statics.field9184 = null;
		Statics.field10355 = null;
		Statics.field8323 = null;
		Statics.field513 = null;
		Statics.field9149 = null;
		Statics.field11793 = null;
		Statics.field510 = null;
		Statics.field10302 = null;
		Statics.field7207 = null;
		Statics.field1940 = null;
		Statics.field6719 = null;
	}
}
