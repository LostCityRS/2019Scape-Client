package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qx")
public class class451 {

	@ObfuscatedName("qx.l")
	public byte[][][] field4487;

	public class451(int arg0, int arg1, int arg2) {
		this.field4487 = new byte[arg0][arg1][arg2];
	}

	@ObfuscatedName("qx.e(I)V")
	public void method7101() {
		for (int var1 = 0; var1 < this.field4487.length; var1++) {
			for (int var2 = 0; var2 < this.field4487[0].length; var2++) {
				for (int var3 = 0; var3 < this.field4487[0][0].length; var3++) {
					this.field4487[var1][var2][var3] = 0;
				}
			}
		}
	}

	@ObfuscatedName("qx.n(III)Z")
	public boolean method7102(int arg0, int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field4487[3].length && arg1 < this.field4487[3][arg0].length) {
			return (this.field4487[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("qx.m(III)Z")
	public boolean method7105(int arg0, int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field4487[1].length && arg1 < this.field4487[1][arg0].length) {
			return (this.field4487[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("qx.k(IIIIB)Z")
	public boolean method7104(int arg0, int arg1, int arg2, int arg3) {
		if ((this.field4487[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.field4487[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method7111(arg1, arg2, arg3) == arg0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("qx.f(IIIB)I")
	public int method7111(int arg0, int arg1, int arg2) {
		if ((this.field4487[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.field4487[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
