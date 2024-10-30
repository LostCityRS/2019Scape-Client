package com.jagex.core.datastruct;

import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("aah")
public class HashTableIterator implements Iterator {

	@ObfuscatedName("aah.e")
	public HashTable map;

	@ObfuscatedName("aah.n")
	public Node next;

	@ObfuscatedName("aah.m")
	public int currentIndex;

	@ObfuscatedName("aah.k")
	public Node prev = null;

	public HashTableIterator(HashTable arg0) {
		this.map = arg0;
		this.advance();
	}

	@ObfuscatedName("aah.l(B)V")
	public void advance() {
		this.next = this.map.buckets[0].next;
		this.currentIndex = 1;
		this.prev = null;
	}

	@ObfuscatedName("aah.u(B)Ltj;")
	public Node nextNode() {
		this.advance();
		return (Node) this.next();
	}

	public Object next() {
		if (this.map.buckets[this.currentIndex - 1] != this.next) {
			Node var1 = this.next;
			this.next = var1.next;
			this.prev = var1;
			return var1;
		}
		Node var2;
		do {
			if (this.currentIndex >= this.map.bucketCount) {
				return null;
			}
			var2 = this.map.buckets[++this.currentIndex - 1].next;
		} while (this.map.buckets[this.currentIndex - 1] == var2);
		this.next = var2.next;
		this.prev = var2;
		return var2;
	}

	public boolean hasNext() {
		if (this.map.buckets[this.currentIndex - 1] != this.next) {
			return true;
		}
		while (this.currentIndex < this.map.bucketCount) {
			if (this.map.buckets[++this.currentIndex - 1].next != this.map.buckets[this.currentIndex - 1]) {
				this.next = this.map.buckets[this.currentIndex - 1].next;
				return true;
			}
			this.next = this.map.buckets[this.currentIndex - 1];
		}
		return false;
	}

	public void remove() {
		if (this.prev == null) {
			throw new IllegalStateException();
		}
		this.prev.unlink();
		this.prev = null;
	}
}
