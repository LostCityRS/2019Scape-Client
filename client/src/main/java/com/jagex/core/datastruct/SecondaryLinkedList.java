package com.jagex.core.datastruct;

import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("aap")
public class SecondaryLinkedList implements Iterable {

	@ObfuscatedName("aap.e")
	public SecondaryNode head = new SecondaryNode();

	@ObfuscatedName("aap.n")
	public SecondaryNode peeked;

	public SecondaryLinkedList() {
		this.head.secondaryPrev = this.head;
		this.head.secondaryNext = this.head;
	}

	@ObfuscatedName("aap.e(I)V")
	public void removeAll() {
		while (this.head.secondaryPrev != this.head) {
			this.head.secondaryPrev.secondaryRemove();
		}
	}

	@ObfuscatedName("aap.n(Laky;I)V")
	public void pushBack(SecondaryNode arg0) {
		if (arg0.secondaryNext != null) {
			arg0.secondaryRemove();
		}
		arg0.secondaryNext = this.head.secondaryNext;
		arg0.secondaryPrev = this.head;
		arg0.secondaryNext.secondaryPrev = arg0;
		arg0.secondaryPrev.secondaryNext = arg0;
	}

	@ObfuscatedName("vj.m(Laky;Laky;I)V")
	public static void pushNodeBack(SecondaryNode arg0, SecondaryNode arg1) {
		if (arg0.secondaryNext != null) {
			arg0.secondaryRemove();
		}
		arg0.secondaryNext = arg1.secondaryNext;
		arg0.secondaryPrev = arg1;
		arg0.secondaryNext.secondaryPrev = arg0;
		arg0.secondaryPrev.secondaryNext = arg0;
	}

	@ObfuscatedName("xg.k(Laky;Laky;I)V")
	public static void method10144(SecondaryNode arg0, SecondaryNode arg1) {
		if (arg0.secondaryNext != null) {
			arg0.secondaryRemove();
		}
		arg0.secondaryNext = arg1;
		arg0.secondaryPrev = arg1.secondaryPrev;
		arg0.secondaryNext.secondaryPrev = arg0;
		arg0.secondaryPrev.secondaryNext = arg0;
	}

	@ObfuscatedName("aap.f(B)Laky;")
	public SecondaryNode pollFront() {
		SecondaryNode var1 = this.head.secondaryPrev;
		if (this.head == var1) {
			return null;
		} else {
			var1.secondaryRemove();
			return var1;
		}
	}

	@ObfuscatedName("aap.w(I)Laky;")
	public SecondaryNode peekFront() {
		return this.peekFrontNode(null);
	}

	@ObfuscatedName("aap.l(Laky;I)Laky;")
	public SecondaryNode peekFrontNode(SecondaryNode arg0) {
		SecondaryNode var2;
		if (arg0 == null) {
			var2 = this.head.secondaryPrev;
		} else {
			var2 = arg0;
		}
		if (this.head == var2) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var2.secondaryPrev;
			return var2;
		}
	}

	@ObfuscatedName("aap.u(I)Laky;")
	public SecondaryNode prev() {
		SecondaryNode var1 = this.peeked;
		if (this.head == var1) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var1.secondaryPrev;
			return var1;
		}
	}

	@ObfuscatedName("aap.z(I)I")
	public int length() {
		int var1 = 0;
		for (SecondaryNode var2 = this.head.secondaryPrev; var2 != this.head; var2 = var2.secondaryPrev) {
			var1++;
		}
		return var1;
	}

	public Iterator iterator() {
		return new SecondaryLinkedListIterator(this);
	}
}
