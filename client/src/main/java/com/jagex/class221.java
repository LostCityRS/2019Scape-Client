package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hl")
public class class221 {

	@ObfuscatedName("hl.e")
	public int field2130;

	@ObfuscatedName("hl.n")
	public int field2132;

	@ObfuscatedName("hl.m")
	public int[] field2126 = null;

	@ObfuscatedName("hl.k")
	public int[] field2129;

	@ObfuscatedName("hl.f")
	public int[] field2128;

	@ObfuscatedName("hl.w")
	public class218 field2131;

	@ObfuscatedName("hl.l")
	public int[] field2127;

	@ObfuscatedName("hl.u")
	public int[] field2133;

	@ObfuscatedName("hl.e([I)V")
	public void method3905(int[] arg0) {
		if (arg0 != null) {
			for (int var2 = 0; var2 < arg0.length; var2++) {
				arg0[var2] = 0;
			}
		}
	}

	@ObfuscatedName("hl.n(Lhk;)V")
	public void method3898(class218 arg0) {
		this.field2131 = arg0;
		int var2 = this.field2131.method3849();
		this.field2131.method3853(16);
		this.field2130 = this.field2131.method3845() == 0 ? 1 : this.field2131.method3853(4) + 1;
		if (this.field2131.method3845() == 0) {
			this.field2132 = 0;
		} else {
			this.field2132 = this.field2131.method3853(8) + 1;
			if (this.field2127 != null && this.field2127.length == this.field2132) {
				this.method3905(this.field2127);
			} else {
				this.field2127 = new int[this.field2132];
			}
			if (this.field2133 != null && this.field2133.length == this.field2132) {
				this.method3905(this.field2133);
			} else {
				this.field2133 = new int[this.field2132];
			}
			for (int var3 = 0; var3 < this.field2132; var3++) {
				this.field2127[var3] = this.field2131.method3853(this.method3899(var2 - 1));
				this.field2133[var3] = this.field2131.method3853(this.method3899(var2 - 1));
			}
		}
		this.field2131.method3853(2);
		if (this.field2130 > 1) {
			this.field2126 = new int[var2];
			for (int var4 = 0; var4 < var2; var4++) {
				this.field2126[var4] = this.field2131.method3853(4);
			}
		}
		if (this.field2129 != null && this.field2129.length == this.field2130) {
			this.method3905(this.field2129);
		} else {
			this.field2129 = new int[this.field2130];
		}
		if (this.field2128 != null && this.field2128.length == this.field2130) {
			this.method3905(this.field2128);
		} else {
			this.field2128 = new int[this.field2130];
		}
		for (int var5 = 0; var5 < this.field2130; var5++) {
			this.field2131.method3853(8);
			this.field2129[var5] = this.field2131.method3853(8);
			this.field2128[var5] = this.field2131.method3853(8);
		}
	}

	@ObfuscatedName("hl.m(I)I")
	public int method3899(int arg0) {
		int var2 = 0;
		while (arg0 > 0) {
			var2++;
			arg0 >>= 0x1;
		}
		return var2;
	}
}
