package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ek")
public class class150 implements class152 {

	@ObfuscatedName("ek.e")
	public final class748 field1708;

	public class150(VarTypeList arg0) {
		this(arg0, new VarContainerSparse(arg0));
	}

	public class150(VarTypeList arg0, VarContainerSparse arg1) {
		this(arg0.field9260, arg1);
	}

	public class150(VarDomainType arg0, VarContainerSparse arg1) {
		this.field1708 = arg1;
	}

	@ObfuscatedName("ek.u(Lec;I)I")
	public int method679(class149 arg0) {
		return this.field1708.method14728(arg0.field1706);
	}

	@ObfuscatedName("ek.e(Lec;II)V")
	public void method2798(class149 arg0, int arg1) {
		this.field1708.method14729(arg0.field1706, arg1);
	}

	@ObfuscatedName("ek.n(Lec;I)J")
	public long method2799(class149 arg0) {
		return this.field1708.method14730(arg0.field1706);
	}

	@ObfuscatedName("ek.m(Lec;J)V")
	public void method2800(class149 arg0, long arg1) {
		this.field1708.method14742(arg0.field1706, arg1);
	}

	@ObfuscatedName("ek.k(Lec;B)Ljava/lang/Object;")
	public Object method2801(class149 arg0) {
		return this.field1708.method14738(arg0.field1706);
	}

	@ObfuscatedName("ek.f(Lec;Ljava/lang/Object;I)V")
	public void method2802(class149 arg0, Object arg1) {
		this.field1708.method14735(arg0.field1706, arg1);
	}

	@ObfuscatedName("ek.z(Lkh;I)I")
	public int method678(VarBitType arg0) {
		return arg0.getVarbitValue(this.method679(arg0.baseVar));
	}

	@ObfuscatedName("ek.w(Lkh;II)V")
	public void method2804(VarBitType arg0, int arg1) throws VarBitOverflowException {
		this.method2798(arg0.baseVar, arg0.setVarbitValue(this.method679(arg0.baseVar), arg1));
	}
}
