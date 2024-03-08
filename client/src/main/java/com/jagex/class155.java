package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ez")
public class class155 {

	@ObfuscatedName("ez.e")
	public final int[] field1727;

	@ObfuscatedName("ez.n")
	public final int[] field1728;

	@ObfuscatedName("ez.m")
	public final int[] field1729;

	@ObfuscatedName("ez.k")
	public final int[] field1730;

	@ObfuscatedName("ez.f")
	public final int[] field1731;

	@ObfuscatedName("ez.w")
	public final int[] field1732;

	@ObfuscatedName("ez.l")
	public final int[] field1733;

	public class155(class997 arg0) {
		int var2 = arg0.method18123();
		this.field1727 = new int[var2];
		this.field1728 = new int[var2];
		this.field1729 = new int[var2];
		this.field1730 = new int[var2];
		this.field1731 = new int[var2];
		this.field1732 = new int[var2];
		this.field1733 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			this.field1727[var3] = arg0.method17906() - 5120;
			this.field1729[var3] = arg0.method17906() - 5120;
			this.field1728[var3] = arg0.method17973();
			this.field1731[var3] = arg0.method17906() - 5120;
			this.field1733[var3] = arg0.method17906() - 5120;
			this.field1732[var3] = arg0.method17973();
			this.field1730[var3] = arg0.method17973();
		}
	}

	@ObfuscatedName("ez.e(IS)V")
	public void method2840(int arg0) {
		int[][] var2 = new int[this.field1727.length << 1][4];
		for (int var3 = 0; var3 < this.field1727.length; var3++) {
			var2[var3 * 2][0] = this.field1727[var3];
			var2[var3 * 2][1] = this.field1728[var3];
			var2[var3 * 2][2] = this.field1729[var3];
			var2[var3 * 2][3] = this.field1730[var3];
			var2[var3 * 2 + 1][0] = this.field1731[var3];
			var2[var3 * 2 + 1][1] = this.field1732[var3];
			var2[var3 * 2 + 1][2] = this.field1733[var3];
			var2[var3 * 2 + 1][3] = this.field1730[var3];
		}
		client.field10981[arg0] = var2;
	}
}
