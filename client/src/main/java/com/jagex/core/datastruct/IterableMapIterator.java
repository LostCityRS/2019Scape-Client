package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aah")
public class IterableMapIterator implements Iterator {

	@ObfuscatedName("aah.e")
	public IterableMap map;

	@ObfuscatedName("aah.n")
	public Node next;

	@ObfuscatedName("aah.m")
	public int currentIndex;

	@ObfuscatedName("aah.k")
	public Node prev = null;

	public IterableMapIterator(IterableMap map) {
		this.map = map;
		this.advance();
	}

	@ObfuscatedName("aah.l(B)V")
	public void advance() {
		this.next = this.map.nodes[0].prev;
		this.currentIndex = 1;
		this.prev = null;
	}

	@ObfuscatedName("aah.u(B)Ltj;")
	public Node nextNode() {
		this.advance();
		return (Node) this.next();
	}

	public Object next() {
		if (this.map.nodes[this.currentIndex - 1] != this.next) {
			Node node = this.next;
			this.next = node.prev;
			this.prev = node;
			return node;
		}
		Node node;
		do {
			if (this.currentIndex >= this.map.size) {
				return null;
			}
			node = this.map.nodes[++this.currentIndex - 1].prev;
		} while (this.map.nodes[this.currentIndex - 1] == node);
		this.next = node.prev;
		this.prev = node;
		return node;
	}

	public boolean hasNext() {
		if (this.map.nodes[this.currentIndex - 1] != this.next) {
			return true;
		}
		while (this.currentIndex < this.map.size) {
			if (this.map.nodes[++this.currentIndex - 1].prev != this.map.nodes[this.currentIndex - 1]) {
				this.next = this.map.nodes[this.currentIndex - 1].prev;
				return true;
			}
			this.next = this.map.nodes[this.currentIndex - 1];
		}
		return false;
	}

	public void remove() {
		if (this.prev == null) {
			throw new IllegalStateException();
		}
		this.prev.remove();
		this.prev = null;
	}
}
