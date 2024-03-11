package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aar")
public class IterableQueueIterator implements Iterator {

	@ObfuscatedName("aar.e")
	public IterableQueue field8490;

	@ObfuscatedName("aar.n")
	public Node field8489;

	@ObfuscatedName("aar.m")
	public Node field8488 = null;

	public IterableQueueIterator(IterableQueue arg0) {
		this.method14283(arg0);
	}

	@ObfuscatedName("aar.l(Laat;I)V")
	public void method14283(IterableQueue arg0) {
		this.field8490 = arg0;
		this.method14284();
	}

	@ObfuscatedName("aar.u(B)V")
	public void method14284() {
		this.field8489 = this.field8490 == null ? null : this.field8490.field8482.field6761;
		this.field8488 = null;
	}

	@ObfuscatedName("aar.z(I)Ltj;")
	public Node method14294() {
		this.method14284();
		return (Node) this.next();
	}

	public Object next() {
		Node var1 = this.field8489;
		if (this.field8490.field8482 == var1) {
			var1 = null;
			this.field8489 = null;
		} else {
			this.field8489 = var1.field6761;
		}
		this.field8488 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field8490.field8482 != this.field8489;
	}

	public void remove() {
		if (this.field8488 == null) {
			throw new IllegalStateException();
		}
		this.field8488.method8440();
		this.field8488 = null;
	}
}
