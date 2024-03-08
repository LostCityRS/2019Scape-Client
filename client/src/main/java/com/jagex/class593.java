package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vy")
public class class593 implements class588 {

	@ObfuscatedName("vy.e")
	public final int[] field7423;

	public class593(int[] arg0) {
		this.field7423 = arg0;
	}

	@ObfuscatedName("vy.e(Lakm;[Lut;ILub;I)Z")
	public boolean method9396(class993 arg0, class565[] arg1, int arg2, class563 arg3) {
		int[] var5 = this.field7423;
		for (int var6 = 0; var6 < var5.length; var6++) {
			int var7 = var5[var6];
			if (!arg3.method9080(var7)) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("nt.k(Lalw;I)Lvy;")
	public static class593 method6037(class997 arg0) {
		int var1 = arg0.method17904();
		int[] var2 = new int[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = arg0.method17904();
		}
		return new class593(var2);
	}
}
