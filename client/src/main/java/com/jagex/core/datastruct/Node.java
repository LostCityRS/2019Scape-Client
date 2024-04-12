package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("tj")
public class Node {

	@ObfuscatedName("tj.e")
	public long nodeId;

	@ObfuscatedName("tj.n")
	public Node next;

	@ObfuscatedName("tj.m")
	public Node prev;

	@ObfuscatedName("tj.o(I)V")
	public void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}

	@ObfuscatedName("tj.s(I)Z")
	public boolean isLinked() {
		return this.prev != null;
	}
}
