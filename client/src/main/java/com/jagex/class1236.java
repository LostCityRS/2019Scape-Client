package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("auu")
public class class1236 extends class1200 {

	@ObfuscatedName("auu.ae")
	public class529 field12614;

	public class1236(class550 arg0, class529 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, arg2, arg3, arg4, arg5, arg6, arg4 >> 9, arg4 >> 9, arg6 >> 9, arg6 >> 9, false, (byte) 0);
		this.field12614 = arg1;
	}

	@ObfuscatedName("auu.fa(Ldh;IIB)Z")
	public boolean method17375(class133 arg0, int arg1, int arg2) {
		return false;
	}

	@ObfuscatedName("auu.fp(I)Z")
	public boolean method17379() {
		return false;
	}

	@ObfuscatedName("auu.bu(B)Z")
	public boolean method16488() {
		return true;
	}

	@ObfuscatedName("auu.bw(S)Z")
	public boolean method16489() {
		return false;
	}

	@ObfuscatedName("auu.fq(Ldh;Lalh;IIIZB)V")
	public void method17377(class133 arg0, class1019 arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	@ObfuscatedName("auu.ff(B)V")
	public void method17378() {
	}

	@ObfuscatedName("auu.fc(Ldh;I)Ltl;")
	public class552 method17372(class133 arg0) {
		if (this.field12614.field6754 == null) {
			return null;
		}
		class419 var2 = arg0.method2209();
		class419 var3 = this.method10533();
		class420 var4 = this.method10536();
		var2.method6292(var3);
		class551 var5 = this.field11716.field6928[this.field11717][(int) var4.field4298.field4308 >> 9][(int) var4.field4298.field4313 >> 9];
		if (var5 != null && var5.field6974 != null) {
			var2.method6315(0.0F, (float) -var5.field6974.field12448, 0.0F);
		}
		this.field12614.field6754.method1813(var2, null, 0);
		return null;
	}

	@ObfuscatedName("auu.fw(Ldh;I)V")
	public void method17373(class133 arg0) {
	}

	@ObfuscatedName("auu.fv(Ldh;B)Luq;")
	public class556 method17371(class133 arg0) {
		return null;
	}

	@ObfuscatedName("auu.by(B)I")
	public int method16523() {
		return this.field12614.field6754 == null ? 0 : this.field12614.field6754.method1748();
	}
}
