package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("asd")
public class class1182 extends class986 {

	@ObfuscatedName("asd.l")
	public String field12348;

	@ObfuscatedName("asd.u")
	public int[] field12346;

	@ObfuscatedName("asd.z")
	public char[] field12345;

	@ObfuscatedName("asd.p")
	public int[] field12349;

	@ObfuscatedName("asd.d")
	public char[] field12347;

	@ObfuscatedName("asd.e(Lalw;I)V")
	public void method19449(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method19467(arg0, var2);
		}
	}

	@ObfuscatedName("asd.n(Lalw;II)V")
	public void method19467(class997 arg0, int arg1) {
		if (arg1 == 1) {
			this.field12348 = arg0.method17918();
		} else if (arg1 == 2) {
			int var3 = arg0.method17904();
			this.field12346 = new int[var3];
			this.field12345 = new char[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field12346[var4] = arg0.method17906();
				byte var5 = arg0.method17905();
				this.field12345[var4] = var5 == 0 ? 0 : Statics.method9576(var5);
			}
		} else if (arg1 == 3) {
			int var6 = arg0.method17904();
			this.field12349 = new int[var6];
			this.field12347 = new char[var6];
			for (int var7 = 0; var7 < var6; var7++) {
				this.field12349[var7] = arg0.method17906();
				byte var8 = arg0.method17905();
				this.field12347[var7] = var8 == 0 ? 0 : Statics.method9576(var8);
			}
		} else if (arg1 == 4) {
		}
	}

	@ObfuscatedName("asd.m(CI)I")
	public int method19460(char arg0) {
		if (this.field12346 == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field12346.length; var2++) {
			if (this.field12345[var2] == arg0) {
				return this.field12346[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("asd.k(CI)I")
	public int method19451(char arg0) {
		if (this.field12349 == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field12349.length; var2++) {
			if (this.field12347[var2] == arg0) {
				return this.field12349[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("asd.f(I)V")
	public void method19452() {
		if (this.field12349 != null) {
			for (int var1 = 0; var1 < this.field12349.length; var1++) {
				this.field12349[var1] |= 0x8000;
			}
		}
		if (this.field12346 != null) {
			for (int var2 = 0; var2 < this.field12346.length; var2++) {
				this.field12346[var2] |= 0x8000;
			}
		}
	}
}
