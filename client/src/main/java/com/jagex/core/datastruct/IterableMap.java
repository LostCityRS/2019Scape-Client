package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("aan")
public final class IterableMap implements Iterable {

	@ObfuscatedName("aan.e")
	public int size;

	@ObfuscatedName("aan.n")
	public Node[] nodes;

	@ObfuscatedName("aan.m")
	public long currentNodeId;

	@ObfuscatedName("aan.k")
	public Node next;

	@ObfuscatedName("aan.f")
	public Node prev;

	@ObfuscatedName("aan.w")
	public int currentNodeIndex = 0;

	public IterableMap(int size) {
		this.size = size;
		this.nodes = new Node[size];
		for (int index = 0; index < size; index++) {
			Node node = this.nodes[index] = new Node();
			node.prev = node;
			node.next = node;
		}
	}

	@ObfuscatedName("aan.e(J)Ltj;")
	public Node getNode(long id) {
		this.currentNodeId = id;
		Node node = this.nodes[(int) (id & (long) (this.size - 1))];
		for (this.next = node.prev; this.next != node; this.next = this.next.prev) {
			if (this.next.nodeId == id) {
				Node var4 = this.next;
				this.next = this.next.prev;
				return var4;
			}
		}
		this.next = null;
		return null;
	}

	@ObfuscatedName("aan.n(I)Ltj;")
	public Node next() {
		if (this.next == null) {
			return null;
		}
		Node node = this.nodes[(int) (this.currentNodeId & (long) (this.size - 1))];
		while (this.next != node) {
			if (this.next.nodeId == this.currentNodeId) {
				Node var2 = this.next;
				this.next = this.next.prev;
				return var2;
			}
			this.next = this.next.prev;
		}
		this.next = null;
		return null;
	}

	@ObfuscatedName("aan.m([Ltj;B)I")
	public int addNodes(Node[] nodes) {
		int var2 = 0;
		for (int index = 0; index < this.size; index++) {
			Node node = this.nodes[index];
			for (Node var5 = node.prev; var5 != node; var5 = var5.prev) {
				nodes[var2++] = var5;
			}
		}
		return var2;
	}

	@ObfuscatedName("aan.k(I)I")
	public int length() {
		int count = 0;
		for (int index = 0; index < this.size; index++) {
			Node var3 = this.nodes[index];
			for (Node var4 = var3.prev; var4 != var3; var4 = var4.prev) {
				count++;
			}
		}
		return count;
	}

	@ObfuscatedName("aan.f(Ltj;J)V")
	public void pushNode(Node node, long id) {
		if (node.next != null) {
			node.remove();
		}
		Node var4 = this.nodes[(int) (id & (long) (this.size - 1))];
		node.next = var4.next;
		node.prev = var4;
		node.next.prev = node;
		node.prev.next = node;
		node.nodeId = id;
	}

	@ObfuscatedName("aan.w(B)V")
	public void removeAll() {
		for (int index = 0; index < this.size; index++) {
			Node node = this.nodes[index];
			while (true) {
				Node next = node.prev;
				if (node == next) {
					break;
				}
				next.remove();
			}
		}
		this.next = null;
		this.prev = null;
	}

	@ObfuscatedName("aan.l(B)Ltj;")
	public Node peekFront() {
		this.currentNodeIndex = 0;
		return this.prev();
	}

	@ObfuscatedName("aan.u(I)Ltj;")
	public Node prev() {
		if (this.currentNodeIndex > 0 && this.nodes[this.currentNodeIndex - 1] != this.prev) {
			Node var1 = this.prev;
			this.prev = var1.prev;
			return var1;
		}
		Node var2;
		do {
			if (this.currentNodeIndex >= this.size) {
				return null;
			}
			var2 = this.nodes[++this.currentNodeIndex - 1].prev;
		} while (this.nodes[this.currentNodeIndex - 1] == var2);
		this.prev = var2.prev;
		return var2;
	}

	public Iterator iterator() {
		return new IterableMapIterator(this);
	}
}
