package com.jagex.core.datastruct;

import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("aan")
public class HashTable implements Iterable {

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

	public HashTable(int arg0) {
		this.bucketCount = arg0;
		this.buckets = new Node[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Node var3 = this.buckets[var2] = new Node();
			var3.next = var3;
			var3.prev = var3;
		}
	}

	@ObfuscatedName("aan.e(J)Ltj;")
	public Node get(long arg0) {
		this.searchKey = arg0;
		Node var3 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		for (this.searchCursor = var3.next; this.searchCursor != var3; this.searchCursor = this.searchCursor.next) {
			if (this.searchCursor.nodeId == arg0) {
				Node var4 = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return var4;
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
		Node var1 = this.buckets[(int) (this.searchKey & (long) (this.bucketCount - 1))];
		while (this.searchCursor != var1) {
			if (this.searchCursor.nodeId == this.searchKey) {
				Node var2 = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return var2;
			}
			this.searchCursor = this.searchCursor.next;
		}
		this.searchCursor = null;
		return null;
	}

	@ObfuscatedName("aan.m([Ltj;B)I")
	public int toArray(Node[] arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < this.bucketCount; var3++) {
			Node var4 = this.buckets[var3];
			for (Node var5 = var4.next; var5 != var4; var5 = var5.next) {
				arg0[var2++] = var5;
			}
		}
		return var2;
	}

	@ObfuscatedName("aan.k(I)I")
	public int size() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.bucketCount; var2++) {
			Node var3 = this.buckets[var2];
			for (Node var4 = var3.next; var4 != var3; var4 = var4.next) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("aan.f(Ltj;J)V")
	public void put(Node arg0, long arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		Node var4 = this.buckets[(int) (arg1 & (long) (this.bucketCount - 1))];
		arg0.prev = var4.prev;
		arg0.next = var4;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
		arg0.nodeId = arg1;
	}

	@ObfuscatedName("aan.w(B)V")
	public void removeAll() {
		for (int var1 = 0; var1 < this.bucketCount; var1++) {
			Node var2 = this.buckets[var1];
			while (true) {
				Node var3 = var2.next;
				if (var2 == var3) {
					break;
				}
				var3.unlink();
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
			Node var1 = this.iteratorCursor;
			this.iteratorCursor = var1.next;
			return var1;
		}
		Node var2;
		do {
			if (this.iteratorBucket >= this.bucketCount) {
				return null;
			}
			var2 = this.buckets[++this.iteratorBucket - 1].next;
		} while (this.buckets[this.iteratorBucket - 1] == var2);
		this.iteratorCursor = var2.next;
		return var2;
	}

	public Iterator iterator() {
		return new HashTableIterator(this);
	}
}
