package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("atg")
public final class class1220 extends class1150 {

	@ObfuscatedName("atg.d")
	public class889 field12533;

	@ObfuscatedName("atg.c")
	public int[] field12532 = null;

	@ObfuscatedName("atg.r")
	public int[] field12534 = null;

	public class1220(class889 arg0, class240 arg1) {
		super(arg1);
		this.field12533 = arg0;
		this.field12532 = arg1.field2591;
		this.field12534 = arg1.field2593;
	}

	@ObfuscatedName("atg.e(I)Z")
	public boolean method19245(int arg0) {
		return true;
	}

	@ObfuscatedName("atg.a()I")
	public final int method19676() {
		return this.field12532[this.field12533.method4212()];
	}

	@ObfuscatedName("atg.g()I")
	public final int method19677() {
		return this.field12534[this.field12533.method4212()];
	}

	@ObfuscatedName("atg.w(I)I")
	public final int method19250(int arg0) {
		int var2 = this.field12532[arg0];
		int var3 = this.field12534[arg0];
		if (var2 == -1) {
			return var3 == -1 ? -1 : var3 | 0x10000;
		} else {
			return var2;
		}
	}
}
