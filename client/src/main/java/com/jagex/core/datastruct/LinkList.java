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
	public void addTail(Node arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel.prev;
		arg0.next = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("aq.m(Ltj;Ltj;B)V")
	public static void addTail(Node arg0, Node arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = arg1.prev;
		arg0.next = arg1;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("aat.k(I)Ltj;")
	public Node removeHead() {
		Node var1 = this.sentinel.next;
		if (this.sentinel == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("aat.f(Laat;Ltj;I)V")
	public void moveToFront(LinkList arg0, Node arg1) {
		Node var3 = this.sentinel.prev;
		this.sentinel.prev = arg1.prev;
		arg1.prev.next = this.sentinel;
		if (this.sentinel != arg1) {
			arg1.prev = arg0.sentinel.prev;
			arg1.prev.next = arg1;
			var3.next = arg0.sentinel;
			arg0.sentinel.prev = var3;
		}
	}

	@ObfuscatedName("aat.w(Laat;I)V")
	public void merge(LinkList arg0) {
		if (this.sentinel.next != this.sentinel) {
			this.moveToFront(arg0, this.sentinel.next);
		}
	}

	@ObfuscatedName("aat.l(B)Ltj;")
	public Node head() {
		return this.head(null);
	}

	@ObfuscatedName("aat.u(Ltj;B)Ltj;")
	public Node head(Node arg0) {
		Node var2;
		if (arg0 == null) {
			var2 = this.sentinel.next;
		} else {
			var2 = arg0;
		}
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.next;
			return var2;
		}
	}

	@ObfuscatedName("aat.z(I)Ltj;")
	public Node tail() {
		return this.tail(null);
	}

	@ObfuscatedName("aat.r(Ltj;I)Ltj;")
	public Node tail(Node arg0) {
		Node var2;
		if (arg0 == null) {
			var2 = this.sentinel.prev;
		} else {
			var2 = arg0;
		}
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.prev;
			return var2;
		}
	}

	@ObfuscatedName("aat.v(I)Ltj;")
	public Node next() {
		Node var1 = this.cursor;
		if (this.sentinel == var1) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("aat.o(I)Ltj;")
	public Node prev() {
		Node var1 = this.cursor;
		if (this.sentinel == var1) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("aat.s(I)I")
	public int _size() {
		int var1 = 0;
		for (Node var2 = this.sentinel.next; var2 != this.sentinel; var2 = var2.next) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("aat.y(I)Z")
	public boolean _isEmpty() {
		return this.sentinel.next == this.sentinel;
	}

	@ObfuscatedName("aat.q(I)[Ltj;")
	public Node[] getNodes() {
		Node[] var1 = new Node[this._size()];
		int var2 = 0;
		for (Node var3 = this.sentinel.next; var3 != this.sentinel; var3 = var3.next) {
			var1[var2++] = var3;
		}
		return var1;
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

	public boolean contains(Object arg0) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.getNodes();
	}

	public Object[] toArray(Object[] arg0) {
		int var2 = 0;
		for (Node var3 = this.sentinel.next; var3 != this.sentinel; var3 = var3.next) {
			arg0[var2++] = var3;
		}
		return arg0;
	}

	@ObfuscatedName("aat.x(Ltj;I)Z")
	public boolean _add(Node arg0) {
		this.addTail(arg0);
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
		return this._add((Node) arg0);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}

	public int hashCode() {
		return super.hashCode();
	}
}
