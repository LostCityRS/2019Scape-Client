package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("tc")
public class Link {

	@ObfuscatedName("tc.e")
	public Link prev;

	@ObfuscatedName("tc.n")
	public Link next;

	@ObfuscatedName("tc.e(I)V")
	public void unlink() {
		if (this.next != null) {
			this.next.prev = this.prev;
			this.prev.next = this.next;
			this.prev = null;
			this.next = null;
		}
	}
}
