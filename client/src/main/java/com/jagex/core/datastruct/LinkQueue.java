package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("aas")
public class LinkQueue {

	@ObfuscatedName("aas.e")
	public Link head = new Link();

	@ObfuscatedName("aas.n")
	public Link peeked;

	public LinkQueue() {
		this.head.prev = this.head;
		this.head.next = this.head;
	}

	@ObfuscatedName("aas.e(I)V")
	public void clear() {
		while (true) {
			Link var1 = this.head.prev;
			if (this.head == var1) {
				this.peeked = null;
				return;
			}
			var1.unlink();
		}
	}

	@ObfuscatedName("aas.n(Ltc;B)V")
	public void pushBack(Link arg0) {
		if (arg0.next != null) {
			arg0.unlink();
		}
		arg0.next = this.head.next;
		arg0.prev = this.head;
		arg0.next.prev = arg0;
		arg0.prev.next = arg0;
	}

	@ObfuscatedName("aas.m(Ltc;I)V")
	public void pushFront(Link arg0) {
		if (arg0.next != null) {
			arg0.unlink();
		}
		arg0.next = this.head;
		arg0.prev = this.head.prev;
		arg0.next.prev = arg0;
		arg0.prev.next = arg0;
	}

	@ObfuscatedName("adz.k(Ltc;Ltc;B)V")
	public static void pushNode(Link arg0, Link arg1) {
		if (arg0.next != null) {
			arg0.unlink();
		}
		arg0.next = arg1;
		arg0.prev = arg1.prev;
		arg0.next.prev = arg0;
		arg0.prev.next = arg0;
	}

	@ObfuscatedName("aas.f(I)Ltc;")
	public Link pollFront() {
		Link var1 = this.head.prev;
		if (this.head == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("aas.w(S)Ltc;")
	public Link peekFront() {
		Link var1 = this.head.prev;
		if (this.head == var1) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("aas.l(I)Ltc;")
	public Link prev() {
		Link var1 = this.peeked;
		if (this.head == var1) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("aas.u(B)Z")
	public boolean isEmpty() {
		return this.head.prev == this.head;
	}
}
