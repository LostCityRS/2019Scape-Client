package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ij")
public class class242 {

	@ObfuscatedName("ij.n")
	public class1179[] field2598 = new class1179[100];

	@ObfuscatedName("ij.m")
	public int field2600;

	@ObfuscatedName("ij.e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILnn;I)Lasg;")
	public class1179 method4323(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7, class387 arg8) {
		class1179 var10 = this.field2598[99];
		for (int var11 = this.field2600; var11 > 0; var11--) {
			if (var11 != 100) {
				this.field2598[var11] = this.field2598[var11 - 1];
			}
		}
		if (var10 == null) {
			var10 = new class1179(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			var10.method8440();
			var10.method17806();
			var10.method19429(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		}
		this.field2598[0] = var10;
		if (this.field2600 < 100) {
			this.field2600++;
		}
		return var10;
	}

	@ObfuscatedName("ij.n(II)Lasg;")
	public class1179 method4322(int arg0) {
		return arg0 >= 0 && arg0 < this.field2600 ? this.field2598[arg0] : null;
	}

	@ObfuscatedName("ij.m(B)I")
	public int method4331() {
		return this.field2600;
	}
}
