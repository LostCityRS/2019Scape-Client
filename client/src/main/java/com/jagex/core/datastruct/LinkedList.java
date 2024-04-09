package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("aat")
public class LinkedList implements Iterable, Collection {

	@ObfuscatedName("aat.e")
	public Node head = new Node();

	@ObfuscatedName("aat.n")
	public Node peeked;

	public LinkedList() {
		this.head.prev = this.head;
		this.head.next = this.head;
	}

	@ObfuscatedName("aat.e(I)V")
	public void removeAll() {
		while (this.head.prev != this.head) {
			this.head.prev.remove();
		}
	}

	@ObfuscatedName("aat.n(Ltj;I)V")
	public void pushBack(Node node) {
		if (node.next != null) {
			node.remove();
		}
		node.next = this.head.next;
		node.prev = this.head;
		node.next.prev = node;
		node.prev.next = node;
	}

	@ObfuscatedName("aq.m(Ltj;Ltj;B)V")
	public static void pushNodeBack(Node node, Node head) {
		if (node.next != null) {
			node.remove();
		}
		node.next = head.next;
		node.prev = head;
		node.next.prev = node;
		node.prev.next = node;
	}

	@ObfuscatedName("aat.k(I)Ltj;")
	public Node pollFront() {
		Node node = this.head.prev;
		if (this.head == node) {
			return null;
		} else {
			node.remove();
			return node;
		}
	}

	@ObfuscatedName("aat.f(Laat;Ltj;I)V")
	public void moveToFront(LinkedList queue, Node nextNode) {
		Node node = this.head.next;
		this.head.next = nextNode.next;
		nextNode.next.prev = this.head;
		if (this.head != nextNode) {
			nextNode.next = queue.head.next;
			nextNode.next.prev = nextNode;
			node.prev = queue.head;
			queue.head.next = node;
		}
	}

	@ObfuscatedName("aat.w(Laat;I)V")
	public void merge(LinkedList queue) {
		if (this.head.prev != this.head) {
			this.moveToFront(queue, this.head.prev);
		}
	}

	@ObfuscatedName("aat.l(B)Ltj;")
	public Node peekFront() {
		return this.peekFrontNode(null);
	}

	@ObfuscatedName("aat.u(Ltj;B)Ltj;")
	public Node peekFrontNode(Node arg0) {
		Node var2;
		if (arg0 == null) {
			var2 = this.head.prev;
		} else {
			var2 = arg0;
		}
		if (this.head == var2) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var2.prev;
			return var2;
		}
	}

	@ObfuscatedName("aat.z(I)Ltj;")
	public Node peekBack() {
		return this.peekBackNode(null);
	}

	@ObfuscatedName("aat.r(Ltj;I)Ltj;")
	public Node peekBackNode(Node node) {
		Node peek;
		if (node == null) {
			peek = this.head.next;
		} else {
			peek = node;
		}
		if (this.head == peek) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = peek.next;
			return peek;
		}
	}

	@ObfuscatedName("aat.v(I)Ltj;")
	public Node prev() {
		Node node = this.peeked;
		if (this.head == node) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.prev;
			return node;
		}
	}

	@ObfuscatedName("aat.o(I)Ltj;")
	public Node next() {
		Node node = this.peeked;
		if (this.head == node) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.next;
			return node;
		}
	}

	@ObfuscatedName("aat.s(I)I")
	public int length() {
		int length = 0;
		for (Node var2 = this.head.prev; var2 != this.head; var2 = var2.prev) {
			length++;
		}
		return length;
	}

	@ObfuscatedName("aat.y(I)Z")
	public boolean _isEmpty() {
		return this.head.prev == this.head;
	}

	@ObfuscatedName("aat.q(I)[Ltj;")
	public Node[] getNodes() {
		Node[] var1 = new Node[this.length()];
		int var2 = 0;
		for (Node var3 = this.head.prev; var3 != this.head; var3 = var3.prev) {
			var1[var2++] = var3;
		}
		return var1;
	}

	public Iterator iterator() {
		return new IterableQueueIterator(this);
	}

	public int size() {
		return this.length();
	}

	public boolean isEmpty() {
		return this._isEmpty();
	}

	public boolean contains(Object arg0) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.getNodes();
	}

	public Object[] toArray(Object[] arg0) {
		int var2 = 0;
		for (Node var3 = this.head.prev; var3 != this.head; var3 = var3.prev) {
			arg0[var2++] = var3;
		}
		return arg0;
	}

	@ObfuscatedName("aat.x(Ltj;I)Z")
	public boolean method14168(Node arg0) {
		this.pushBack(arg0);
		return true;
	}

	public boolean remove(Object arg0) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection arg0) {
		throw new RuntimeException();
	}

	public void clear() {
		this.removeAll();
	}

	public boolean add(Object arg0) {
		return this.method14168((Node) arg0);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}

	public int hashCode() {
		return super.hashCode();
	}
}
