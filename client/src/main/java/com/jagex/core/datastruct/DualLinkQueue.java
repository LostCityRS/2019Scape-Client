package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("aaf")
public final class DualLinkQueue {

	@ObfuscatedName("aaf.e")
	public DualLink field8487 = new DualLink();

	@ObfuscatedName("aaf.n")
	public DualLink field8486;

	public DualLinkQueue() {
		this.field8487.field11213 = this.field8487;
		this.field8487.field11212 = this.field8487;
	}

	@ObfuscatedName("aaf.e(Lajn;B)V")
	public void method14270(DualLink arg0) {
		if (arg0.field11212 != null) {
			arg0.method17453();
		}
		arg0.field11212 = this.field8487.field11212;
		arg0.field11213 = this.field8487;
		arg0.field11212.field11213 = arg0;
		arg0.field11213.field11212 = arg0;
	}

	@ObfuscatedName("aaf.n(I)Lajn;")
	public DualLink method14271() {
		DualLink var1 = this.field8487.field11213;
		if (this.field8487 == var1) {
			this.field8486 = null;
			return null;
		} else {
			this.field8486 = var1.field11213;
			return var1;
		}
	}

	@ObfuscatedName("aaf.m(I)Lajn;")
	public DualLink method14272() {
		DualLink var1 = this.field8486;
		if (this.field8487 == var1) {
			this.field8486 = null;
			return null;
		} else {
			this.field8486 = var1.field11213;
			return var1;
		}
	}

	@ObfuscatedName("aaf.k(I)V")
	public void method14279() {
		while (true) {
			DualLink var1 = this.field8487.field11213;
			if (this.field8487 == var1) {
				this.field8486 = null;
				return;
			}
			var1.method17453();
		}
	}
}
