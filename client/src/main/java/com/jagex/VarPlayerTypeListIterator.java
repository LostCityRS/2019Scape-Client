package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("gj")
public class VarPlayerTypeListIterator implements Iterator {

	// $FF: synthetic field
	public final VarPlayerTypeListClient this$0;

	@ObfuscatedName("gj.e")
	public int field1982;

	public VarPlayerTypeListIterator(VarPlayerTypeListClient arg0) {
		this.this$0 = arg0;
	}

	public boolean hasNext() {
		return this.field1982 < this.this$0.size();
	}

	public Object next() {
		int var1 = ++this.field1982 - 1;
		VarPlayerType var2 = (VarPlayerType) this.this$0.field9254.method2930((long) var1);
		return var2 == null ? this.this$0.method15255(var1) : var2;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
