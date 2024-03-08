package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("aai")
public class class719 implements Iterator {

	@ObfuscatedName("aai.e")
	public class720 field8495;

	@ObfuscatedName("aai.n")
	public class986 field8494;

	@ObfuscatedName("aai.m")
	public class986 field8493 = null;

	public class719(class720 arg0) {
		this.field8495 = arg0;
		this.field8494 = this.field8495.field8497.field11439;
		this.field8493 = null;
	}

	@ObfuscatedName("aai.l(B)V")
	public void method14300() {
		this.field8494 = this.field8495.field8497.field11439;
		this.field8493 = null;
	}

	@ObfuscatedName("aai.u(I)Laky;")
	public class986 method14301() {
		this.method14300();
		return (class986) this.next();
	}

	public Object next() {
		class986 var1 = this.field8494;
		if (this.field8495.field8497 == var1) {
			var1 = null;
			this.field8494 = null;
		} else {
			this.field8494 = var1.field11439;
		}
		this.field8493 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field8495.field8497 != this.field8494;
	}

	public void remove() {
		if (this.field8493 == null) {
			throw new IllegalStateException();
		}
		this.field8493.method17806();
		this.field8493 = null;
	}
}
