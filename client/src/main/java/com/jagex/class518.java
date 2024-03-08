package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("sd")
public class class518 implements class152 {

	@ObfuscatedName("sd.e")
	public PathingEntity field6687;

	public class518(PathingEntity arg0) {
		this.field6687 = arg0;
	}

	@ObfuscatedName("sd.u(Lec;I)I")
	public int method679(class149 arg0) {
		return this.field6687.field10460.method14728(arg0.field1706);
	}

	@ObfuscatedName("sd.n(Lec;I)J")
	public long method2799(class149 arg0) {
		return this.field6687.field10460.method14730(arg0.field1706);
	}

	@ObfuscatedName("sd.k(Lec;B)Ljava/lang/Object;")
	public Object method2801(class149 arg0) {
		return this.field6687.field10460.method14738(arg0.field1706);
	}

	@ObfuscatedName("sd.z(Lkh;I)I")
	public int method678(VarBitType arg0) {
		return arg0.getVarbitValue(this.method679(arg0.baseVar));
	}

	@ObfuscatedName("sd.e(Lec;II)V")
	public void method2798(class149 arg0, int arg1) {
		this.field6687.field10460.method14729(arg0.field1706, arg1);
	}

	@ObfuscatedName("sd.m(Lec;J)V")
	public void method2800(class149 arg0, long arg1) {
		this.field6687.field10460.method14742(arg0.field1706, arg1);
	}

	@ObfuscatedName("sd.f(Lec;Ljava/lang/Object;I)V")
	public void method2802(class149 arg0, Object arg1) {
		this.field6687.field10460.method14735(arg0.field1706, arg1);
	}

	@ObfuscatedName("sd.w(Lkh;II)V")
	public void method2804(VarBitType arg0, int arg1) throws VarBitOverflowException {
		this.method2798(arg0.baseVar, arg0.setVarbitValue(this.method679(arg0.baseVar), arg1));
	}
}
