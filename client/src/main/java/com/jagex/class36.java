package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ah")
public class class36 implements class147, class151, class644 {

	@ObfuscatedName("ah.e")
	public final class609 field632;

	@ObfuscatedName("ah.n")
	public final class806 field633;

	@ObfuscatedName("ah.m")
	public final class1085 field634;

	@ObfuscatedName("ah.k")
	public final class642[] field635;

	public class36(class806 arg0, class1085 arg1, int arg2) {
		this.field635 = new class642[arg2];
		this.field632 = new class609();
		this.field633 = arg0;
		this.field634 = arg1;
	}

	@ObfuscatedName("ah.e(IB)I")
	public int method671(int arg0) {
		return this.field635[arg0].method10163(client.field10948 ? class697.field8343 : class697.field8344);
	}

	@ObfuscatedName("ah.n(II)I")
	public int method700(int arg0) {
		return this.field635[arg0].method10169();
	}

	@ObfuscatedName("ah.m(II)I")
	public int method674(int arg0) {
		return this.field635[arg0].method10158(client.field10948 ? class697.field8343 : class697.field8344);
	}

	@ObfuscatedName("ah.k(II)I")
	public int method675(int arg0) {
		return this.field635[arg0].method10175();
	}

	@ObfuscatedName("ah.f(IB)I")
	public int method687(int arg0) {
		return this.field635[arg0].method10161();
	}

	@ObfuscatedName("ah.w(Lqe;II)Lec;")
	public class149 method695(class455 arg0, int arg1) {
		return class455.field4594 == arg0 ? (class149) this.field633.method962(arg1) : null;
	}

	@ObfuscatedName("ah.l(IB)Lkh;")
	public class305 method694(int arg0) {
		class305 var2 = (class305) this.field634.method962(arg0);
		return class455.field4594 == var2.field3076.field1702 ? var2 : null;
	}

	@ObfuscatedName("ah.u(Lec;I)I")
	public int method679(class149 arg0) {
		return this.field632.method679(arg0);
	}

	@ObfuscatedName("ah.z(Lkh;I)I")
	public int method678(class305 arg0) {
		return this.field632.method678(arg0);
	}
}
