package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("eq")
public class class153 {

	@ObfuscatedName("eq.e")
	public static class715 field1712 = new class715();

	@ObfuscatedName("eq.l")
	public static class729 field1718 = new class729(32);

	@ObfuscatedName("eq.u")
	public static int field1715 = 1;

	@ObfuscatedName("eq.z")
	public static int field1716 = 0;

	@ObfuscatedName("eq.p")
	public static int field1710 = 0;

	@ObfuscatedName("eq.d")
	public static boolean field1711 = false;

	@ObfuscatedName("eq.s")
	public static int field1717 = -1;

	@ObfuscatedName("eq.y")
	public static int field1722 = -1;

	@ObfuscatedName("eq.x")
	public static final class147 field1723 = new class157();

	public class153() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("xj.e(II)Z")
	public static boolean method10308(int arg0) {
		if (field1722 != arg0 || Statics.field694 == null) {
			method3551();
			Statics.field694 = class154.field1724;
			field1722 = arg0;
		}
		if (Statics.field694 == class154.field1724) {
			byte[] var1 = Statics.field3808.method6894(arg0);
			if (var1 == null) {
				return false;
			}
			class997 var2 = new class997(var1);
			method6121(var2);
			int var3 = var2.method17904();
			for (int var4 = 0; var4 < var3; var4++) {
				field1712.method14153(new class974(var2));
			}
			int var5 = var2.method18123();
			Statics.field1714 = new class155[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				Statics.field1714[var6] = new class155(var2);
			}
			int var7 = var2.method18123();
			Statics.field1721 = new class158[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				Statics.field1721[var8] = new class158(var2, var8);
			}
			int var9 = var2.method18123();
			Statics.field7317 = new class156[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				Statics.field7317[var10] = new class156(var2);
			}
			int var11 = var2.method18123();
			Statics.field8358 = new class160[var11];
			for (int var12 = 0; var12 < var11; var12++) {
				Statics.field8358[var12] = new class160(var2);
			}
			int var13 = var2.method18123();
			Statics.field1713 = new class159[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				Statics.field1713[var14] = class159.method14342(var2);
			}
			Statics.field694 = class154.field1725;
		}
		if (Statics.field694 == class154.field1725) {
			boolean var15 = true;
			class158[] var16 = Statics.field1721;
			for (int var17 = 0; var17 < var16.length; var17++) {
				class158 var18 = var16[var17];
				if (!var18.method2871()) {
					var15 = false;
				}
			}
			class159[] var19 = Statics.field1713;
			for (int var20 = 0; var20 < var19.length; var20++) {
				class159 var21 = var19[var20];
				if (!var21.method2891()) {
					var15 = false;
				}
			}
			class156[] var22 = Statics.field7317;
			for (int var23 = 0; var23 < var22.length; var23++) {
				class156 var24 = var22[var23];
				if (!var24.method2849()) {
					var15 = false;
				}
			}
			if (!var15) {
				return false;
			}
			Statics.field694 = class154.field1726;
		}
		return true;
	}

	@ObfuscatedName("nh.n(Lalw;I)V")
	public static void method6121(class997 arg0) {
		while (true) {
			int var1 = arg0.method17904();
			switch(var1) {
				case 0:
					field1716 = arg0.method17906();
					field1710 = arg0.method17906();
					break;
				case 255:
					return;
			}
		}
	}

	@ObfuscatedName("gf.m(I)V")
	public static void method3551() {
		field1718.method14499();
		field1712.method14152();
		Statics.field1714 = null;
		Statics.field1721 = null;
		Statics.field7317 = null;
		Statics.field8358 = null;
		Statics.field1713 = null;
		field1715 = 1;
		field1716 = 0;
		field1710 = 0;
		Statics.field694 = null;
		field1722 = -1;
		field1717 = -1;
		if (!field1711) {
			return;
		}
		client.field10900 = Statics.field10538;
		client.field10943 = Statics.field1719;
		client.field11070 = Statics.field11700;
		client.field11071 = Statics.field1720;
		field1711 = false;
	}

	@ObfuscatedName("cs.k(I)V")
	public static void method1576() {
		Statics.field10538 = client.field10900;
		Statics.field1719 = client.field10943;
		Statics.field11700 = client.field11070;
		Statics.field1720 = client.field11071;
		field1711 = true;
		field1717 = Statics.field1798.method3170();
		if (field1710 != 0 && field1716 != 0) {
			client.field11070 = 334;
			client.field11071 = 334;
			client.field10943 = client.field10900 = (short) (field1710 * 512 / field1716);
		}
	}

	@ObfuscatedName("qb.f(ZI)V")
	public static void method7372(boolean arg0) {
		if (client.field10863 == 4 || client.field10863 == 3) {
			return;
		}
		if (!arg0) {
			if (Statics.field1713 != null) {
				class159[] var1 = Statics.field1713;
				for (int var2 = 0; var2 < var1.length; var2++) {
					class159 var3 = var1[var2];
					var3.method2896();
				}
			}
			if (field1717 != -1) {
				Statics.field1798.method3235(field1717, 255);
			}
		}
		client.field10863 = 4;
		Statics.field8729 = null;
		client.field10877 = false;
		if (field1722 > 0) {
			Statics.method830(class572.field7266, field1722, -1);
		}
		method3551();
		class983 var4 = Statics.method1604(class390.field3722, client.field10849.field794);
		var4.field11432.method18001(arg0 ? 1 : 0);
		client.field10849.method934(var4);
	}
}
