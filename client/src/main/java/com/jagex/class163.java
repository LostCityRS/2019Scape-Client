package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ex")
public final class class163 {

	@ObfuscatedName("ex.e")
	public class986 field1760 = new class986();

	@ObfuscatedName("ex.n")
	public int field1761;

	@ObfuscatedName("ex.m")
	public int field1762;

	@ObfuscatedName("ex.k")
	public class729 field1764;

	@ObfuscatedName("ex.f")
	public class720 field1763 = new class720();

	public class163(int arg0) {
		this.field1761 = arg0;
		this.field1762 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field1764 = new class729(var2);
	}

	@ObfuscatedName("ex.e(J)Laky;")
	public class986 method2966(long arg0) {
		class986 var3 = (class986) this.field1764.method14495(arg0);
		if (var3 != null) {
			this.field1763.method14339(var3);
		}
		return var3;
	}

	@ObfuscatedName("ex.n(Laky;J)V")
	public void method2968(class986 arg0, long arg1) {
		if (this.field1762 == 0) {
			class986 var4 = this.field1763.method14315();
			var4.method8440();
			var4.method17806();
			if (this.field1760 == var4) {
				class986 var5 = this.field1763.method14315();
				var5.method8440();
				var5.method17806();
			}
		} else {
			this.field1762--;
		}
		this.field1764.method14501(arg0, arg1);
		this.field1763.method14339(arg0);
	}

	@ObfuscatedName("ex.m(I)V")
	public void method2969() {
		this.field1763.method14316();
		this.field1764.method14499();
		this.field1760 = new class986();
		this.field1762 = this.field1761;
	}
}
