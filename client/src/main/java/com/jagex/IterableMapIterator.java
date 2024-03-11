package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aah")
public class IterableMapIterator implements Iterator {

	@ObfuscatedName("aah.e")
	public IterableMap field8560;

	@ObfuscatedName("aah.n")
	public Node field8559;

	@ObfuscatedName("aah.m")
	public int field8557;

	@ObfuscatedName("aah.k")
	public Node field8558 = null;

	public IterableMapIterator(IterableMap arg0) {
		this.field8560 = arg0;
		this.method14523();
	}

	@ObfuscatedName("aah.l(B)V")
	public void method14523() {
		this.field8559 = this.field8560.field8552[0].field6761;
		this.field8557 = 1;
		this.field8558 = null;
	}

	@ObfuscatedName("aah.u(B)Ltj;")
	public Node method14520() {
		this.method14523();
		return (Node) this.next();
	}

	public Object next() {
		if (this.field8560.field8552[this.field8557 - 1] != this.field8559) {
			Node var1 = this.field8559;
			this.field8559 = var1.field6761;
			this.field8558 = var1;
			return var1;
		}
		Node var2;
		do {
			if (this.field8557 >= this.field8560.field8556) {
				return null;
			}
			var2 = this.field8560.field8552[++this.field8557 - 1].field6761;
		} while (this.field8560.field8552[this.field8557 - 1] == var2);
		this.field8559 = var2.field6761;
		this.field8558 = var2;
		return var2;
	}

	public boolean hasNext() {
		if (this.field8560.field8552[this.field8557 - 1] != this.field8559) {
			return true;
		}
		while (this.field8557 < this.field8560.field8556) {
			if (this.field8560.field8552[++this.field8557 - 1].field6761 != this.field8560.field8552[this.field8557 - 1]) {
				this.field8559 = this.field8560.field8552[this.field8557 - 1].field6761;
				return true;
			}
			this.field8559 = this.field8560.field8552[this.field8557 - 1];
		}
		return false;
	}

	public void remove() {
		if (this.field8558 == null) {
			throw new IllegalStateException();
		}
		this.field8558.method8440();
		this.field8558 = null;
	}
}
