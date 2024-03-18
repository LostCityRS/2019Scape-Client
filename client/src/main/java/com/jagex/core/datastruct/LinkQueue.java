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
			Link node = this.head.prev;
			if (this.head == node) {
				this.peeked = null;
				return;
			}
			node.unlink();
		}
	}

	@ObfuscatedName("aas.n(Ltc;B)V")
	public void pushBack(Link node) {
		if (node.next != null) {
			node.unlink();
		}
		node.next = this.head.next;
		node.prev = this.head;
		node.next.prev = node;
		node.prev.next = node;
	}

	@ObfuscatedName("aas.m(Ltc;I)V")
	public void pushFront(Link node) {
		if (node.next != null) {
			node.unlink();
		}
		node.next = this.head;
		node.prev = this.head.prev;
		node.next.prev = node;
		node.prev.next = node;
	}

	@ObfuscatedName("adz.k(Ltc;Ltc;B)V")
	public static void pushNode(Link node, Link head) {
		if (node.next != null) {
			node.unlink();
		}
		node.next = head;
		node.prev = head.prev;
		node.next.prev = node;
		node.prev.next = node;
	}

	@ObfuscatedName("aas.f(I)Ltc;")
	public Link pollFront() {
		Link node = this.head.prev;
		if (this.head == node) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	@ObfuscatedName("aas.w(S)Ltc;")
	public Link peekFront() {
		Link node = this.head.prev;
		if (this.head == node) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.prev;
			return node;
		}
	}

	@ObfuscatedName("aas.l(I)Ltc;")
	public Link prev() {
		Link node = this.peeked;
		if (this.head == node) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.prev;
			return node;
		}
	}

	@ObfuscatedName("aas.u(B)Z")
	public boolean isEmpty() {
		return this.head.prev == this.head;
	}
}
