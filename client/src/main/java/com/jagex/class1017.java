package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("alt")
public class class1017 extends class649 {

	@ObfuscatedName("alt.l(I)V")
	public void method10270() {
		class993 var1 = this.method18354();
		if (var1 == null) {
			return;
		}
		int var2 = this.method10262(var1, 32767);
		int var3 = var1.method17832();
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 65535) {
			var3 = 65535;
		}
		int var4 = var1.method17831();
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 65535) {
			var4 = 65535;
		}
		byte var5 = 0;
		if (var1.method17848() == 2) {
			var5 = 1;
		}
		class983 var6 = Statics.method1604(class390.field3727, client.field10849.field794);
		var6.field11432.method17886(var4 | var3 << 16);
		var6.field11432.method17947(var2 | var5 << 15);
		client.field10849.method934(var6);
	}

	@ObfuscatedName("alt.u(I)Z")
	public boolean method10272() {
		return this.method18354() != null || this.field7953 < class213.method3655() - 2000L;
	}

	@ObfuscatedName("alt.i(I)Lakm;")
	public class993 method18354() {
		return (class993) client.field10816.method14191();
	}

	@ObfuscatedName("alt.z(S)Lakl;")
	public class983 method10267() {
		return Statics.method1604(class390.field3779, client.field10849.field794);
	}

	@ObfuscatedName("alt.w(Lalw;Lakm;I)V")
	public void method10264(class997 arg0, class993 arg1) {
	}

	@ObfuscatedName("alt.f(I)I")
	public int method10263() {
		return 0;
	}
}
