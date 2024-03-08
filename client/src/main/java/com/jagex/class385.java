package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("ng")
public class class385 implements Iterator {

	@ObfuscatedName("ng.e")
	public class1205 field3571;

	@ObfuscatedName("ng.n")
	public int field3570 = 0;

	@ObfuscatedName("ng.m")
	public int field3572 = this.field3571.field12486;

	public class385(class1205 arg0) {
		this.field3571 = arg0;
	}

	public boolean hasNext() {
		return this.field3570 < this.field3571.field12484;
	}

	public Object next() {
		if (this.field3571.field12486 != this.field3572) {
			throw new ConcurrentModificationException();
		} else if (this.field3570 < this.field3571.field12484) {
			Object var1 = this.field3571.field12482[this.field3570].field3566;
			this.field3570++;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
