package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("nl")
public final class SortedQueueEntry {

	@ObfuscatedName("nl.e")
	public final Object value;

	@ObfuscatedName("nl.n")
	public int slot;

	public SortedQueueEntry(Object arg0, int arg1) {
		this.value = arg0;
		this.slot = arg1;
	}
}
