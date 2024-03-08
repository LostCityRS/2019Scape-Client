package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("xd")
public abstract class CursorTypeFactory {

	@ObfuscatedName("xd.e")
	public Js5 field7960;

	@ObfuscatedName("xd.n")
	public final WeightedCache field7959 = new WeightedCache(2);

	public CursorTypeFactory(Js5 arg0) {
		this.field7960 = arg0;
	}

	@ObfuscatedName("xd.e(I)V")
	public void method10287() {
		WeightedCache var1 = this.field7959;
		synchronized (this.field7959) {
			this.field7959.method2924();
		}
	}

	@ObfuscatedName("xd.n(II)V")
	public void method10291(int arg0) {
		WeightedCache var2 = this.field7959;
		synchronized (this.field7959) {
			this.field7959.method2923(arg0);
		}
	}

	@ObfuscatedName("xd.m(I)V")
	public void method10289() {
		WeightedCache var1 = this.field7959;
		synchronized (this.field7959) {
			this.field7959.method2928();
		}
	}
}
