package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aaf")
public final class class717 {

	@ObfuscatedName("aaf.e")
	public class958 field8487 = new class958();

	@ObfuscatedName("aaf.n")
	public class958 field8486;

	public class717() {
		this.field8487.field11213 = this.field8487;
		this.field8487.field11212 = this.field8487;
	}

	@ObfuscatedName("aaf.e(Lajn;B)V")
	public void method14270(class958 arg0) {
		if (arg0.field11212 != null) {
			arg0.method17453();
		}
		arg0.field11212 = this.field8487.field11212;
		arg0.field11213 = this.field8487;
		arg0.field11212.field11213 = arg0;
		arg0.field11213.field11212 = arg0;
	}

	@ObfuscatedName("aaf.n(I)Lajn;")
	public class958 method14271() {
		class958 var1 = this.field8487.field11213;
		if (this.field8487 == var1) {
			this.field8486 = null;
			return null;
		} else {
			this.field8486 = var1.field11213;
			return var1;
		}
	}

	@ObfuscatedName("aaf.m(I)Lajn;")
	public class958 method14272() {
		class958 var1 = this.field8486;
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
			class958 var1 = this.field8487.field11213;
			if (this.field8487 == var1) {
				this.field8486 = null;
				return;
			}
			var1.method17453();
		}
	}
}
