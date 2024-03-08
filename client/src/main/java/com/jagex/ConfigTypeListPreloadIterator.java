package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("ack")
public class ConfigTypeListPreloadIterator implements Iterator {

	// $FF: synthetic field
	public final ConfigTypeListPreload this$0;

	@ObfuscatedName("ack.e")
	public int field8850;

	public ConfigTypeListPreloadIterator(ConfigTypeListPreload arg0) {
		this.this$0 = arg0;
	}

	public boolean hasNext() {
		return this.field8850 < this.this$0.field8849.length;
	}

	public Object next() {
		return this.this$0.field8849[++this.field8850 - 1];
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
