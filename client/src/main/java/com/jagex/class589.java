package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vu")
public class class589 implements class588 {

	@ObfuscatedName("vu.e")
	public final int field7408;

	@ObfuscatedName("vu.n")
	public final int field7407;

	@ObfuscatedName("vu.m")
	public final int[] field7409;

	public class589(int arg0, int arg1, int[] arg2) {
		this.field7408 = arg0;
		this.field7407 = arg1;
		this.field7409 = arg2;
	}

	@ObfuscatedName("vu.e(Lakm;[Lut;ILub;I)Z")
	public boolean method9396(class993 arg0, class565[] arg1, int arg2, class563 arg3) {
		if (arg0 != null) {
			if (this.field7408 != arg0.method17848()) {
				return false;
			}
			if (this.field7407 > arg0.method17833()) {
				return false;
			}
			int[] var5 = this.field7409;
			for (int var6 = 0; var6 < var5.length; var6++) {
				int var7 = var5[var6];
				if (!arg3.method9080(var7)) {
					return false;
				}
			}
		} else if (this.field7408 != -1) {
			return false;
		}
		return true;
	}

	@ObfuscatedName("wb.k(Lalw;I)Lvu;")
	public static class589 method9770(class997 arg0) {
		int var1 = arg0.method17904();
		int var2 = arg0.method17904();
		int var3 = arg0.method17904();
		int[] var4 = new int[var3];
		for (int var5 = 0; var5 < var3; var5++) {
			var4[var5] = arg0.method17904();
		}
		return new class589(var1, var2, var4);
	}
}
