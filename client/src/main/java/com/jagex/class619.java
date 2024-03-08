package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("wb")
public class class619 {

	@ObfuscatedName("wb.k")
	public static boolean field7645 = false;

	public class619() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("js.e(IB)Lalc;")
	public static class1015 method4944(int arg0) {
		return field7645 && arg0 >= Statics.field7414 && arg0 <= Statics.field3011 ? Statics.field7644[arg0 - Statics.field7414] : null;
	}

	@ObfuscatedName("x.n([BI)Z")
	public static boolean method570(byte[] arg0) {
		class997 var1 = new class997(arg0);
		int var2 = var1.method17904();
		if (var2 != 2) {
			return false;
		}
		boolean var3 = var1.method17904() == 1;
		if (var3) {
			method10593(var1);
		}
		method4513(var1);
		return true;
	}

	@ObfuscatedName("yz.m(Lalw;I)V")
	public static void method10593(class997 arg0) {
		int var1 = arg0.method18123();
		Statics.field7647 = new class617[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			Statics.field7647[var2] = new class617();
			Statics.field7647[var2].field7634 = arg0.method18123();
			Statics.field7647[var2].field7633 = arg0.method17919();
		}
		Statics.field7414 = arg0.method18123();
		Statics.field3011 = arg0.method18123();
		Statics.field533 = arg0.method18123();
		Statics.field7644 = new class1015[Statics.field3011 - Statics.field7414 + 1];
		for (int var3 = 0; var3 < Statics.field533; var3++) {
			int var4 = arg0.method18123();
			class1015 var5 = Statics.field7644[var4] = new class1015();
			var5.field7640 = arg0.method17904();
			var5.field7639 = arg0.method17910();
			var5.field11702 = arg0.method18123();
			if (var5.field11702 != 0) {
				var5.field11706 = arg0.method17919();
			}
			var5.field11705 = Statics.field7414 + var4;
			var5.field11704 = arg0.method17919();
			var5.field11703 = arg0.method17919();
		}
		Statics.field7642 = arg0.method17910();
		field7645 = true;
	}

	@ObfuscatedName("iw.k(Lalw;I)V")
	public static void method4513(class997 arg0) {
		for (int var1 = 0; var1 < Statics.field533; var1++) {
			int var2 = arg0.method18123();
			int var3 = arg0.method17906();
			if (var3 == 65535) {
				var3 = -1;
			}
			if (Statics.field7644[var2] != null) {
				Statics.field7644[var2].field7641 = var3;
			}
		}
	}
}
