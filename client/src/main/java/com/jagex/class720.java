package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aap")
public class class720 implements Iterable {

	@ObfuscatedName("aap.e")
	public SecondaryNode field8497 = new SecondaryNode();

	@ObfuscatedName("aap.n")
	public SecondaryNode field8496;

	public class720() {
		this.field8497.field11439 = this.field8497;
		this.field8497.field11438 = this.field8497;
	}

	@ObfuscatedName("aap.e(I)V")
	public void method14316() {
		while (this.field8497.field11439 != this.field8497) {
			this.field8497.field11439.method17806();
		}
	}

	@ObfuscatedName("aap.n(Laky;I)V")
	public void method14339(SecondaryNode arg0) {
		if (arg0.field11438 != null) {
			arg0.method17806();
		}
		arg0.field11438 = this.field8497.field11438;
		arg0.field11439 = this.field8497;
		arg0.field11438.field11439 = arg0;
		arg0.field11439.field11438 = arg0;
	}

	@ObfuscatedName("xg.k(Laky;Laky;I)V")
	public static void method10144(SecondaryNode arg0, SecondaryNode arg1) {
		if (arg0.field11438 != null) {
			arg0.method17806();
		}
		arg0.field11438 = arg1;
		arg0.field11439 = arg1.field11439;
		arg0.field11438.field11439 = arg0;
		arg0.field11439.field11438 = arg0;
	}

	@ObfuscatedName("aap.f(B)Laky;")
	public SecondaryNode method14315() {
		SecondaryNode var1 = this.field8497.field11439;
		if (this.field8497 == var1) {
			return null;
		} else {
			var1.method17806();
			return var1;
		}
	}

	@ObfuscatedName("aap.w(I)Laky;")
	public SecondaryNode method14317() {
		return this.method14318(null);
	}

	@ObfuscatedName("aap.l(Laky;I)Laky;")
	public SecondaryNode method14318(SecondaryNode arg0) {
		SecondaryNode var2;
		if (arg0 == null) {
			var2 = this.field8497.field11439;
		} else {
			var2 = arg0;
		}
		if (this.field8497 == var2) {
			this.field8496 = null;
			return null;
		} else {
			this.field8496 = var2.field11439;
			return var2;
		}
	}

	@ObfuscatedName("aap.u(I)Laky;")
	public SecondaryNode method14324() {
		SecondaryNode var1 = this.field8496;
		if (this.field8497 == var1) {
			this.field8496 = null;
			return null;
		} else {
			this.field8496 = var1.field11439;
			return var1;
		}
	}

	@ObfuscatedName("aap.z(I)I")
	public int method14320() {
		int var1 = 0;
		for (SecondaryNode var2 = this.field8497.field11439; var2 != this.field8497; var2 = var2.field11439) {
			var1++;
		}
		return var1;
	}

	public Iterator iterator() {
		return new class719(this);
	}
}
