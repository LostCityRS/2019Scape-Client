package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aar")
public class LinkListIterator implements Iterator {

	@ObfuscatedName("aar.e")
	public LinkList queue;

	@ObfuscatedName("aar.n")
	public Node next;

	@ObfuscatedName("aar.m")
	public Node prev = null;

	public LinkListIterator(LinkList queue) {
		this.set(queue);
	}

	@ObfuscatedName("aar.l(Laat;I)V")
	public void set(LinkList queue) {
		this.queue = queue;
		this.advance();
	}

	@ObfuscatedName("aar.u(B)V")
	public void advance() {
		this.next = this.queue == null ? null : this.queue.sentinel.next;
		this.prev = null;
	}

	@ObfuscatedName("aar.z(I)Ltj;")
	public Node nextNode() {
		this.advance();
		return (Node) this.next();
	}

	public Object next() {
		Node node = this.next;
		if (this.queue.sentinel == node) {
			node = null;
			this.next = null;
		} else {
			this.next = node.next;
		}
		this.prev = node;
		return node;
	}

	public boolean hasNext() {
		return this.queue.sentinel != this.next;
	}

	public void remove() {
		if (this.prev == null) {
			throw new IllegalStateException();
		}
		this.prev.unlink();
		this.prev = null;
	}
}
