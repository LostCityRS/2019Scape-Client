package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wd")
public class class627 {

	@ObfuscatedName("wd.e")
	public static final class627 field7699 = new class627();

	@ObfuscatedName("wd.n")
	public final int[] field7700;

	public class627() {
		this.field7700 = new int[120];
		int var1 = 0;
		for (int var2 = 0; var2 < 120; var2++) {
			int var3 = var2 + 1;
			int var4 = (int) ((double) var3 + Math.pow(2.0D, (double) var3 / 7.0D) * 300.0D);
			var1 += var4;
			this.field7700[var2] = var1 / 4;
		}
		this.method9862();
	}

	public class627(int[] arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.field7700 = arg0;
		this.method9862();
	}

	@ObfuscatedName("wd.e(B)V")
	public final void method9862() {
		for (int var1 = 1; var1 < this.field7700.length; var1++) {
			if (this.field7700[var1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (var1 - 1));
			}
			if (this.field7700[var1] < this.field7700[var1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + var1);
			}
		}
	}

	@ObfuscatedName("wd.n(II)I")
	public int method9863(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < this.field7700.length && arg0 >= this.field7700[var3]; var3++) {
			var2 = var3 + 1;
		}
		return var2;
	}

	@ObfuscatedName("wd.m(II)I")
	public int method9867(int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.field7700.length) {
				arg0 = this.field7700.length;
			}
			return this.field7700[arg0 - 1];
		}
	}
}
