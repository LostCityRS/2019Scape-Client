package com.jagex;

import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("vl")
public abstract class HitmarkTypeFactory {

	@ObfuscatedName("vl.e")
	public final Js5 field7315;

	@ObfuscatedName("vl.n")
	public final WeightedCache field7316 = new WeightedCache(20);

	public HitmarkTypeFactory(Js5 arg0) {
		this.field7315 = arg0;
	}

	@ObfuscatedName("vl.e(I)V")
	public void method9277() {
		WeightedCache var1 = this.field7316;
		synchronized (this.field7316) {
			this.field7316.method2924();
		}
	}

	@ObfuscatedName("vl.n(II)V")
	public void method9282(int arg0) {
		WeightedCache var2 = this.field7316;
		synchronized (this.field7316) {
			this.field7316.method2923(arg0);
		}
	}

	@ObfuscatedName("vl.m(I)V")
	public void method9279() {
		WeightedCache var1 = this.field7316;
		synchronized (this.field7316) {
			this.field7316.method2928();
		}
	}
}
