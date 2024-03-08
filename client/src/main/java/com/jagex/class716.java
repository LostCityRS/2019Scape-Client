package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aas")
public class class716 {

	@ObfuscatedName("aas.e")
	public class531 field8483 = new class531();

	@ObfuscatedName("aas.n")
	public class531 field8484;

	public class716() {
		this.field8483.field6759 = this.field8483;
		this.field8483.field6758 = this.field8483;
	}

	@ObfuscatedName("aas.e(I)V")
	public void method14242() {
		while (true) {
			class531 var1 = this.field8483.field6759;
			if (this.field8483 == var1) {
				this.field8484 = null;
				return;
			}
			var1.method8433();
		}
	}

	@ObfuscatedName("aas.n(Ltc;B)V")
	public void method14243(class531 arg0) {
		if (arg0.field6758 != null) {
			arg0.method8433();
		}
		arg0.field6758 = this.field8483.field6758;
		arg0.field6759 = this.field8483;
		arg0.field6758.field6759 = arg0;
		arg0.field6759.field6758 = arg0;
	}

	@ObfuscatedName("aas.m(Ltc;I)V")
	public void method14244(class531 arg0) {
		if (arg0.field6758 != null) {
			arg0.method8433();
		}
		arg0.field6758 = this.field8483;
		arg0.field6759 = this.field8483.field6759;
		arg0.field6758.field6759 = arg0;
		arg0.field6759.field6758 = arg0;
	}

	@ObfuscatedName("aas.f(I)Ltc;")
	public class531 method14245() {
		class531 var1 = this.field8483.field6759;
		if (this.field8483 == var1) {
			return null;
		} else {
			var1.method8433();
			return var1;
		}
	}

	@ObfuscatedName("aas.w(S)Ltc;")
	public class531 method14254() {
		class531 var1 = this.field8483.field6759;
		if (this.field8483 == var1) {
			this.field8484 = null;
			return null;
		} else {
			this.field8484 = var1.field6759;
			return var1;
		}
	}

	@ObfuscatedName("aas.l(I)Ltc;")
	public class531 method14241() {
		class531 var1 = this.field8484;
		if (this.field8483 == var1) {
			this.field8484 = null;
			return null;
		} else {
			this.field8484 = var1.field6759;
			return var1;
		}
	}

	@ObfuscatedName("aas.u(B)Z")
	public boolean method14248() {
		return this.field8483.field6759 == this.field8483;
	}
}
