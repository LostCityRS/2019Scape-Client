package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aai")
public class DualIterableQueueIterator implements Iterator {

	@ObfuscatedName("aai.e")
	public DualIterableQueue field8495;

	@ObfuscatedName("aai.n")
	public SecondaryNode field8494;

	@ObfuscatedName("aai.m")
	public SecondaryNode field8493 = null;

	public DualIterableQueueIterator(DualIterableQueue arg0) {
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
	public SecondaryNode method14301() {
		this.method14300();
		return (SecondaryNode) this.next();
	}

	public Object next() {
		SecondaryNode var1 = this.field8494;
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
