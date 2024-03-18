package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aar")
public class IterableQueueIterator implements Iterator {

	@ObfuscatedName("aar.e")
	public IterableQueue queue;

	@ObfuscatedName("aar.n")
	public Node next;

	@ObfuscatedName("aar.m")
	public Node prev = null;

	public IterableQueueIterator(IterableQueue queue) {
		this.set(queue);
	}

	@ObfuscatedName("aar.l(Laat;I)V")
	public void set(IterableQueue queue) {
		this.queue = queue;
		this.advance();
	}

	@ObfuscatedName("aar.u(B)V")
	public void advance() {
		this.next = this.queue == null ? null : this.queue.head.prev;
		this.prev = null;
	}

	@ObfuscatedName("aar.z(I)Ltj;")
	public Node nextNode() {
		this.advance();
		return (Node) this.next();
	}

	public Object next() {
		Node node = this.next;
		if (this.queue.head == node) {
			node = null;
			this.next = null;
		} else {
			this.next = node.prev;
		}
		this.prev = node;
		return node;
	}

	public boolean hasNext() {
		return this.queue.head != this.next;
	}

	public void remove() {
		if (this.prev == null) {
			throw new IllegalStateException();
		}
		this.prev.remove();
		this.prev = null;
	}
}
