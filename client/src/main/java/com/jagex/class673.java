package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("yl")
public class class673 implements class152 {

	@ObfuscatedName("yl.e")
	public class309 field8193;

	public class673(class309 arg0) {
		this.field8193 = arg0;
	}

	@ObfuscatedName("yl.u(Lec;I)I")
	public int method679(class149 arg0) {
		Integer var2 = this.field8193.method5318(client.field10768.field8339 << 16 | arg0.field1706);
		return var2 == null ? (Integer) arg0.method2782() : var2;
	}

	@ObfuscatedName("yl.n(Lec;I)J")
	public long method2799(class149 arg0) {
		Long var2 = this.field8193.method5259(client.field10768.field8339 << 16 | arg0.field1706);
		return var2 == null ? (Long) arg0.method2782() : var2;
	}

	@ObfuscatedName("yl.k(Lec;B)Ljava/lang/Object;")
	public Object method2801(class149 arg0) {
		if (class463.field4634 != arg0.field1704) {
			throw new IllegalArgumentException("");
		}
		return this.field8193.method5260(client.field10768.field8339 << 16 | arg0.field1706);
	}

	@ObfuscatedName("yl.z(Lkh;I)I")
	public int method678(class305 arg0) {
		return arg0.method5181(this.method679(arg0.field3076));
	}

	@ObfuscatedName("yl.e(Lec;II)V")
	public void method2798(class149 arg0, int arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yl.m(Lec;J)V")
	public void method2800(class149 arg0, long arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yl.f(Lec;Ljava/lang/Object;I)V")
	public void method2802(class149 arg0, Object arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yl.w(Lkh;II)V")
	public void method2804(class305 arg0, int arg1) {
		throw new UnsupportedOperationException();
	}
}
