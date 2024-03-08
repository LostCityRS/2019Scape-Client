package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aps")
public class class1125 extends class846 {

	@ObfuscatedName("aps.e")
	public final class850 field11950;

	@ObfuscatedName("aps.n")
	public class362 field11952;

	@ObfuscatedName("aps.m")
	public final int field11951;

	@ObfuscatedName("aps.k")
	public static final int[][] field11949 = new int[6][];

	public class1125(class850 arg0, int arg1) {
		this.field11950 = arg0;
		this.field11951 = arg1;
	}

	@ObfuscatedName("aps.e()Lmr;")
	public class362 method15652() {
		if (this.field11952 == null) {
			class143 var1 = this.field11950.field1596;
			class118 var2 = this.field11950.field1597.method2043(this.field11951);
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
				field11949[var5] = new int[var4];
				System.arraycopy(var3, var4 * var5, field11949[var5], 0, var4);
			}
			this.field11952 = this.field11950.method16034(var2.field1357, var2.field1332 != 0, field11949);
		}
		return this.field11952;
	}
}
