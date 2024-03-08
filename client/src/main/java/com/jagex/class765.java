package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("acm")
public class class765 implements Iterator {

	// $FF: synthetic field
	public final class758 this$0;

	@ObfuscatedName("acm.e")
	public int field8852;

	public class765(class758 arg0) {
		this.this$0 = arg0;
	}

	public boolean hasNext() {
		return this.field8852 < this.this$0.field8794;
	}

	public Object next() {
		int var1 = ++this.field8852 - 1;
		class162 var2 = this.this$0.field8795;
		synchronized (this.this$0.field8795) {
			class53 var3 = (class53) this.this$0.field8795.method2930((long) var1);
			if (var3 != null) {
				return var3;
			}
		}
		return this.this$0.method14909(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
