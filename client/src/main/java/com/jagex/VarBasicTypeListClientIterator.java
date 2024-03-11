package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("xn")
public class VarBasicTypeListClientIterator implements Iterator {

	// $FF: synthetic field
	public final VarBasicTypeListClient this$0;

	@ObfuscatedName("xn.e")
	public int field7882;

	public VarBasicTypeListClientIterator(VarBasicTypeListClient arg0) {
		this.this$0 = arg0;
	}

	public boolean hasNext() {
		return this.field7882 < this.this$0.size();
	}

	public Object next() {
		int var1 = ++this.field7882 - 1;
		VarBasicType var2 = (VarBasicType) this.this$0.field9258.method2930((long) var1);
		return var2 == null ? this.this$0.method15266(var1) : var2;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
