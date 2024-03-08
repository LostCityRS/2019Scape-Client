package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asn")
public class class1194 extends class999 {

	@ObfuscatedName("asn.w")
	public final class679 field12431;

	public class1194(int arg0, int arg1, class679 arg2) {
		super(arg0, arg1);
		this.field12431 = arg2;
	}

	@ObfuscatedName("asn.e(B)Z")
	public boolean method18183() {
		class1233 var1 = this.field12431.method13793();
		if (var1 == null) {
			return false;
		} else {
			class676.method9018(class572.field7248, this.field11571, -1, this.field12431, var1);
			return true;
		}
	}
}
