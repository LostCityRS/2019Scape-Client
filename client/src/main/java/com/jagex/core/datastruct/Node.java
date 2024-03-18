package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("tj")
public class Node {

	@ObfuscatedName("tj.e")
	public long nodeId;

	@ObfuscatedName("tj.n")
	public Node prev;

	@ObfuscatedName("tj.m")
	public Node next;

	@ObfuscatedName("tj.o(I)V")
	public void remove() {
		if (this.next != null) {
			this.next.prev = this.prev;
			this.prev.next = this.next;
			this.prev = null;
			this.next = null;
		}
	}

	@ObfuscatedName("tj.s(I)Z")
	public boolean hasNext() {
		return this.next != null;
	}
}
