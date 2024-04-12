package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("aat")
public class LinkList implements Iterable, Collection {

	@ObfuscatedName("aat.e")
	public Node sentinel = new Node();

	@ObfuscatedName("aat.n")
	public Node cursor;

	public LinkList() {
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@ObfuscatedName("aat.e(I)V")
	public void removeAll() {
		while (this.sentinel.next != this.sentinel) {
			this.sentinel.next.unlink();
		}
	}

	@ObfuscatedName("aat.n(Ltj;I)V")
	public void addTail(Node node) {
		if (node.prev != null) {
			node.unlink();
		}
		node.prev = this.sentinel.prev;
		node.next = this.sentinel;
		node.prev.next = node;
		node.next.prev = node;
	}

	@ObfuscatedName("aq.m(Ltj;Ltj;B)V")
	public static void addTail(Node node, Node head) {
		if (node.prev != null) {
			node.unlink();
		}
		node.prev = head.prev;
		node.next = head;
		node.prev.next = node;
		node.next.prev = node;
	}

	@ObfuscatedName("aat.k(I)Ltj;")
	public Node removeHead() {
		Node node = this.sentinel.next;
		if (this.sentinel == node) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	@ObfuscatedName("aat.f(Laat;Ltj;I)V")
	public void moveToFront(LinkList queue, Node nextNode) {
		Node node = this.sentinel.prev;
		this.sentinel.prev = nextNode.prev;
		nextNode.prev.next = this.sentinel;
		if (this.sentinel != nextNode) {
			nextNode.prev = queue.sentinel.prev;
			nextNode.prev.next = nextNode;
			node.next = queue.sentinel;
			queue.sentinel.prev = node;
		}
	}

	@ObfuscatedName("aat.w(Laat;I)V")
	public void merge(LinkList other) {
		if (this.sentinel.next != this.sentinel) {
			this.moveToFront(other, this.sentinel.next);
		}
	}

	@ObfuscatedName("aat.l(B)Ltj;")
	public Node head() {
		return this.head(null);
	}

	@ObfuscatedName("aat.u(Ltj;B)Ltj;")
	public Node head(Node node) {
		Node it;
		if (node == null) {
			it = this.sentinel.next;
		} else {
			it = node;
		}
		if (this.sentinel == it) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = it.next;
			return it;
		}
	}

	@ObfuscatedName("aat.z(I)Ltj;")
	public Node tail() {
		return this.tail(null);
	}

	@ObfuscatedName("aat.r(Ltj;I)Ltj;")
	public Node tail(Node node) {
		Node it;
		if (node == null) {
			it = this.sentinel.prev;
		} else {
			it = node;
		}
		if (this.sentinel == it) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = it.prev;
			return it;
		}
	}

	@ObfuscatedName("aat.v(I)Ltj;")
	public Node next() {
		Node node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@ObfuscatedName("aat.o(I)Ltj;")
	public Node prev() {
		Node node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.prev;
			return node;
		}
	}

	@ObfuscatedName("aat.s(I)I")
	public int _size() {
		int size = 0;
		for (Node node = this.sentinel.next; node != this.sentinel; node = node.next) {
			size++;
		}
		return size;
	}

	@ObfuscatedName("aat.y(I)Z")
	public boolean _isEmpty() {
		return this.sentinel.next == this.sentinel;
	}

	@ObfuscatedName("aat.q(I)[Ltj;")
	public Node[] getNodes() {
		Node[] list = new Node[this._size()];
		int size = 0;
		for (Node node = this.sentinel.next; node != this.sentinel; node = node.next) {
			list[size++] = node;
		}
		return list;
	}

	public Iterator iterator() {
		return new LinkListIterator(this);
	}

	public int size() {
		return this._size();
	}

	public boolean isEmpty() {
		return this._isEmpty();
	}

	public boolean contains(Object o) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.getNodes();
	}

	public Object[] toArray(Object[] dest) {
		int size = 0;
		for (Node node = this.sentinel.next; node != this.sentinel; node = node.next) {
			dest[size++] = node;
		}
		return dest;
	}

	@ObfuscatedName("aat.x(Ltj;I)Z")
	public boolean _add(Node node) {
		this.addTail(node);
		return true;
	}

	public boolean remove(Object o) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection c) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection c) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection c) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection c) {
		throw new RuntimeException();
	}

	public void clear() {
		this.removeAll();
	}

	public boolean add(Object node) {
		return this._add((Node) node);
	}

	public boolean equals(Object list) {
		return super.equals(list);
	}

	public int hashCode() {
		return super.hashCode();
	}
}
