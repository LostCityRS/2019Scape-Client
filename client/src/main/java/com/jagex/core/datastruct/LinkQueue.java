package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("aas")
public class LinkQueue {

	@ObfuscatedName("aas.e")
	public Link field8483 = new Link();

	@ObfuscatedName("aas.n")
	public Link field8484;

	public LinkQueue() {
		this.field8483.field6759 = this.field8483;
		this.field8483.field6758 = this.field8483;
	}

	@ObfuscatedName("aas.e(I)V")
	public void method14242() {
		while (true) {
			Link var1 = this.field8483.field6759;
			if (this.field8483 == var1) {
				this.field8484 = null;
				return;
			}
			var1.method8433();
		}
	}

	@ObfuscatedName("aas.n(Ltc;B)V")
	public void method14243(Link arg0) {
		if (arg0.field6758 != null) {
			arg0.method8433();
		}
		arg0.field6758 = this.field8483.field6758;
		arg0.field6759 = this.field8483;
		arg0.field6758.field6759 = arg0;
		arg0.field6759.field6758 = arg0;
	}

	@ObfuscatedName("aas.m(Ltc;I)V")
	public void method14244(Link arg0) {
		if (arg0.field6758 != null) {
			arg0.method8433();
		}
		arg0.field6758 = this.field8483;
		arg0.field6759 = this.field8483.field6759;
		arg0.field6758.field6759 = arg0;
		arg0.field6759.field6758 = arg0;
	}

	@ObfuscatedName("adz.k(Ltc;Ltc;B)V")
	public static void method15212(Link arg0, Link arg1) {
		if (arg0.field6758 != null) {
			arg0.method8433();
		}
		arg0.field6758 = arg1;
		arg0.field6759 = arg1.field6759;
		arg0.field6758.field6759 = arg0;
		arg0.field6759.field6758 = arg0;
	}

	@ObfuscatedName("aas.f(I)Ltc;")
	public Link method14245() {
		Link var1 = this.field8483.field6759;
		if (this.field8483 == var1) {
			return null;
		} else {
			var1.method8433();
			return var1;
		}
	}

	@ObfuscatedName("aas.w(S)Ltc;")
	public Link method14254() {
		Link var1 = this.field8483.field6759;
		if (this.field8483 == var1) {
			this.field8484 = null;
			return null;
		} else {
			this.field8484 = var1.field6759;
			return var1;
		}
	}

	@ObfuscatedName("aas.l(I)Ltc;")
	public Link method14241() {
		Link var1 = this.field8484;
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
