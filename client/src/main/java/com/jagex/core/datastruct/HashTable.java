package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aan")
public final class HashTable implements Iterable {

	@ObfuscatedName("aan.e")
	public int bucketCount;

	@ObfuscatedName("aan.n")
	public Node[] buckets;

	@ObfuscatedName("aan.m")
	public long searchKey;

	@ObfuscatedName("aan.k")
	public Node searchCursor;

	@ObfuscatedName("aan.f")
	public Node iteratorCursor;

	@ObfuscatedName("aan.w")
	public int iteratorBucket = 0;

	public HashTable(int bucketCount) {
		this.buckets = new Node[bucketCount];
		this.bucketCount = bucketCount;
		for (int i = 0; i < bucketCount; i++) {
			Node sentinel = this.buckets[i] = new Node();
			sentinel.next = sentinel;
			sentinel.prev = sentinel;
		}
	}

	@ObfuscatedName("aan.e(J)Ltj;")
	public Node get(long key) {
		this.searchKey = key;
		Node sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		for (this.searchCursor = sentinel.next; this.searchCursor != sentinel; this.searchCursor = this.searchCursor.next) {
			if (this.searchCursor.nodeId == key) {
				Node value = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return value;
			}
		}
		this.searchCursor = null;
		return null;
	}

	@ObfuscatedName("aan.n(I)Ltj;")
	public Node nextWithKey() {
		if (this.searchCursor == null) {
			return null;
		}
		Node sentinel = this.buckets[(int) (this.searchKey & (long) (this.bucketCount - 1))];
		while (this.searchCursor != sentinel) {
			if (this.searchCursor.nodeId == this.searchKey) {
				Node node = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return node;
			}
			this.searchCursor = this.searchCursor.next;
		}
		this.searchCursor = null;
		return null;
	}

	@ObfuscatedName("aan.m([Ltj;B)I")
	public int toArray(Node[] nodes) {
		int size = 0;
		for (int i = 0; i < this.bucketCount; i++) {
			Node sentinel = this.buckets[i];
			for (Node node = sentinel.next; node != sentinel; node = node.next) {
				nodes[size++] = node;
			}
		}
		return size;
	}

	@ObfuscatedName("aan.k(I)I")
	public int size() {
		int count = 0;
		for (int i = 0; i < this.bucketCount; i++) {
			Node sentinel = this.buckets[i];
			for (Node node = sentinel.next; node != sentinel; node = node.next) {
				count++;
			}
		}
		return count;
	}

	@ObfuscatedName("aan.f(Ltj;J)V")
	public void put(Node node, long key) {
		if (node.prev != null) {
			node.unlink();
		}
		Node sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		node.prev = sentinel.prev;
		node.next = sentinel;
		node.prev.next = node;
		node.next.prev = node;
		node.nodeId = key;
	}

	@ObfuscatedName("aan.w(B)V")
	public void removeAll() {
		for (int i = 0; i < this.bucketCount; i++) {
			Node sentinel = this.buckets[i];
			while (true) {
				Node node = sentinel.next;
				if (sentinel == node) {
					break;
				}
				node.unlink();
			}
		}
		this.searchCursor = null;
		this.iteratorCursor = null;
	}

	@ObfuscatedName("aan.l(B)Ltj;")
	public Node head() {
		this.iteratorBucket = 0;
		return this.next();
	}

	@ObfuscatedName("aan.u(I)Ltj;")
	public Node next() {
		if (this.iteratorBucket > 0 && this.buckets[this.iteratorBucket - 1] != this.iteratorCursor) {
			Node node = this.iteratorCursor;
			this.iteratorCursor = node.next;
			return node;
		}
		Node node;
		do {
			if (this.iteratorBucket >= this.bucketCount) {
				return null;
			}
			node = this.buckets[++this.iteratorBucket - 1].next;
		} while (this.buckets[this.iteratorBucket - 1] == node);
		this.iteratorCursor = node.next;
		return node;
	}

	public Iterator iterator() {
		return new HashTableIterator(this);
	}
}
