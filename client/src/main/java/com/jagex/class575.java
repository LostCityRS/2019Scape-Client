package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ur")
public class class575 implements class578 {

	@ObfuscatedName("ur.e")
	public final class772 field7278;

	@ObfuscatedName("ur.n")
	public final String field7276;

	@ObfuscatedName("ur.m")
	public final int field7277;

	@ObfuscatedName("ur.k")
	public final String field7275;

	public class575(class772 arg0, String arg1, int arg2, Throwable arg3) {
		this.field7278 = arg0;
		this.field7276 = arg1;
		this.field7277 = arg2;
		this.field7275 = arg3 == null ? null : arg3.getMessage();
	}

	@ObfuscatedName("ur.e(I)V")
	public void method9201() {
		class983 var1 = Statics.method1604(class390.field3728, client.field10849.field794);
		int var2 = var1.field11432.field11503++;
		var1.field11432.method18001(this.field7278.method1303());
		var1.field11432.method17893(this.field7276);
		var1.field11432.method17945(this.field7277);
		var1.field11432.method17893(class498.field5075);
		if (this.field7275 == null) {
			var1.field11432.method18001(0);
		} else {
			var1.field11432.method18001(1);
			String var3 = this.field7275;
			if (var3.length() > 100) {
				var3 = var3.substring(0, 100);
			}
			var1.field11432.method17893(var3);
		}
		var1.field11432.method18028(var1.field11432.field11503 - var2);
		client.field10849.method934(var1);
	}
}
