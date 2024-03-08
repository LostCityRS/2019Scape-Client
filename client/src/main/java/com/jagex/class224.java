package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hx")
public class class224 {

	@ObfuscatedName("hx.e")
	public final int field2144;

	@ObfuscatedName("hx.n")
	public final int field2146;

	@ObfuscatedName("hx.m")
	public final int[] field2145;

	@ObfuscatedName("hx.k")
	public final int[] field2143;

	@ObfuscatedName("hx.f")
	public final class103 field2147;

	@ObfuscatedName("hx.w")
	public final int field2148;

	public class224(int arg0, int arg1, int[] arg2, int[] arg3, class103 arg4, int arg5) {
		this.field2144 = arg0;
		this.field2146 = arg1;
		this.field2145 = arg2;
		this.field2143 = arg3;
		this.field2147 = arg4;
		this.field2148 = arg5;
	}

	@ObfuscatedName("hx.e(IIB)Z")
	public boolean method3914(int arg0, int arg1) {
		if (arg1 >= 0 && arg1 < this.field2143.length) {
			int var3 = this.field2143[arg1];
			if (arg0 >= var3 && arg0 <= this.field2145[arg1] + var3) {
				return true;
			}
		}
		return false;
	}
}
