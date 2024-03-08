package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("va")
public class class591 implements class588 {

	@ObfuscatedName("va.e")
	public final int field7412;

	@ObfuscatedName("va.n")
	public final int field7413;

	public class591(int arg0, int arg1) {
		this.field7412 = arg0;
		this.field7413 = arg1;
	}

	@ObfuscatedName("va.e(Lakm;[Lut;ILub;I)Z")
	public boolean method9396(class993 arg0, class565[] arg1, int arg2, class563 arg3) {
		for (int var5 = 0; var5 < arg2 && var5 < arg1.length; var5++) {
			class565 var6 = arg1[var5];
			if (var6 != null && var6.method9141() == this.field7412 && var6.method9134() == this.field7413) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("fz.k(Lalw;B)Lva;")
	public static class591 method3038(class997 arg0) {
		int var1 = arg0.method17904();
		int var2 = arg0.method17904();
		return new class591(var1, var2);
	}
}
