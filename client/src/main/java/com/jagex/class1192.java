package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asl")
public class class1192 extends class999 {

	@ObfuscatedName("asl.w")
	public final class675 field12429;

	public class1192(int arg0, int arg1, class675 arg2) {
		super(arg0, arg1);
		this.field12429 = arg2;
	}

	@ObfuscatedName("asl.e(B)Z")
	public boolean method18183() {
		class514 var1 = this.field12429.method10760();
		if (var1 == null) {
			return false;
		} else {
			class676.method15112(class572.field7264, this.field11571, -1, var1);
			return true;
		}
	}
}
