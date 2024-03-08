package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ek")
public class class150 implements class152 {

	@ObfuscatedName("ek.e")
	public final class748 field1708;

	public class150(class808 arg0) {
		this(arg0, new class747(arg0));
	}

	public class150(class808 arg0, class747 arg1) {
		this(arg0.field9260, arg1);
	}

	public class150(class455 arg0, class747 arg1) {
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
	public int method678(class305 arg0) {
		return arg0.method5181(this.method679(arg0.field3076));
	}

	@ObfuscatedName("ek.w(Lkh;II)V")
	public void method2804(class305 arg0, int arg1) throws class1110 {
		this.method2798(arg0.field3076, arg0.method5183(this.method679(arg0.field3076), arg1));
	}
}
