package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("apk")
public class class1124 extends class845 {

	@ObfuscatedName("apk.e")
	public final class849 field11946;

	@ObfuscatedName("apk.n")
	public class813 field11947;

	@ObfuscatedName("apk.m")
	public final int field11945;

	@ObfuscatedName("apk.k")
	public static final int[][] field11948 = new int[6][];

	public class1124(class849 arg0, int arg1) {
		this.field11946 = arg0;
		this.field11945 = arg1;
	}

	@ObfuscatedName("apk.e()Ladq;")
	public class813 method15649() {
		if (this.field11947 == null) {
			class143 var1 = this.field11946.field1596;
			class118 var2 = this.field11946.field1597.method2043(this.field11945);
			if (var2 == null) {
				return null;
			}
			if (!var2.field1333) {
				return null;
			}
			if (!var1.method1977(class605.field7585, var2.field1334, -1, class602.field7568, 1.0F, var2.field1357, var2.field1357, false)) {
				return null;
			}
			int[] var3 = var1.method1986(class605.field7585, var2.field1334, 1.0F, var2.field1357, var2.field1357, false);
			int var4 = var2.field1357 * var2.field1357;
			if (var3 == null) {
				return null;
			}
			for (int var5 = 0; var5 < 6; var5++) {
				field11948[var5] = new int[var4];
				System.arraycopy(var3, var4 * var5, field11948[var5], 0, var4);
			}
			this.field11947 = new class813(this.field11946, class109.field1271, class135.field1645, var2.field1357, var2.field1332 != 0, field11948);
		}
		return this.field11947;
	}
}
