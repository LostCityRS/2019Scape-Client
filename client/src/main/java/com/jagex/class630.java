package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("wi")
public class class630 implements Iterator {

	@ObfuscatedName("wi.e")
	public class621[] field7760;

	@ObfuscatedName("wi.n")
	public int field7761;

	public class630(class621[] arg0) {
		this.field7760 = arg0;
	}

	public boolean hasNext() {
		return this.field7761 < this.field7760.length;
	}

	public Object next() {
		return this.field7760[++this.field7761 - 1];
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
