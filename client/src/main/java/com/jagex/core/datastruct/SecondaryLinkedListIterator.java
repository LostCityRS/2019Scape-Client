package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aai")
public class SecondaryLinkedListIterator implements Iterator {

	@ObfuscatedName("aai.e")
	public SecondaryLinkedList queue;

	@ObfuscatedName("aai.n")
	public SecondaryNode next;

	@ObfuscatedName("aai.m")
	public SecondaryNode prev = null;

	public SecondaryLinkedListIterator(SecondaryLinkedList queue) {
		this.queue = queue;
		this.next = this.queue.head.secondaryPrev;
		this.prev = null;
	}

	@ObfuscatedName("aai.l(B)V")
	public void advance() {
		this.next = this.queue.head.secondaryPrev;
		this.prev = null;
	}

	@ObfuscatedName("aai.u(I)Laky;")
	public SecondaryNode nextNode() {
		this.advance();
		return (SecondaryNode) this.next();
	}

	public Object next() {
		SecondaryNode node = this.next;
		if (this.queue.head == node) {
			node = null;
			this.next = null;
		} else {
			this.next = node.secondaryPrev;
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
		this.prev.secondaryRemove();
		this.prev = null;
	}
}
