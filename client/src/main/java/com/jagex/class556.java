package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("uq")
public class class556 {

	@ObfuscatedName("uq.e")
	public int field7054;

	@ObfuscatedName("uq.n")
	public int field7051;

	@ObfuscatedName("uq.m")
	public int field7048;

	@ObfuscatedName("uq.k")
	public int field7050;

	@ObfuscatedName("uq.f")
	public int field7049;

	@ObfuscatedName("uq.w")
	public int field7052;

	@ObfuscatedName("uq.l")
	public int field7053;

	@ObfuscatedName("uq.u")
	public int field7047;

	@ObfuscatedName("uq.z")
	public int field7055;

	@ObfuscatedName("uq.p")
	public int field7056;

	public class556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		this.field7054 = arg0;
		this.field7051 = arg1;
		this.field7048 = arg2;
		this.field7050 = arg3 * arg3;
		this.field7049 = this.field7054 + arg4;
		this.field7052 = this.field7054 + arg5;
		this.field7053 = this.field7051 + arg6;
		this.field7047 = this.field7051 + arg7;
		this.field7055 = this.field7048 + arg8;
		this.field7056 = this.field7048 + arg9;
	}

	@ObfuscatedName("uq.e(IIIIIIIIII)V")
	public void method8967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		this.field7054 = arg0;
		this.field7051 = arg1;
		this.field7048 = arg2;
		this.field7050 = arg3 * arg3;
		this.field7049 = this.field7054 + arg4;
		this.field7052 = this.field7054 + arg5;
		this.field7053 = this.field7051 + arg6;
		this.field7047 = this.field7051 + arg7;
		this.field7055 = this.field7048 + arg8;
		this.field7056 = this.field7048 + arg9;
	}

	@ObfuscatedName("uq.n(III)Z")
	public boolean method8962(int arg0, int arg1, int arg2) {
		if (arg0 < this.field7049 || arg0 > this.field7052) {
			return false;
		} else if (arg1 < this.field7053 || arg1 > this.field7047) {
			return false;
		} else if (arg2 >= this.field7055 && arg2 <= this.field7056) {
			int var4 = arg0 - this.field7054;
			int var5 = arg2 - this.field7048;
			return var4 * var4 + var5 * var5 < this.field7050;
		} else {
			return false;
		}
	}
}
