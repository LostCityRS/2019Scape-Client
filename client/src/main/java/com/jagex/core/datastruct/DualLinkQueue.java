package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("aaf")
public final class DualLinkQueue {

	@ObfuscatedName("aaf.e")
	public DualLink head = new DualLink();

	@ObfuscatedName("aaf.n")
	public DualLink peeked;

	public DualLinkQueue() {
		this.head.dualPrev = this.head;
		this.head.dualNext = this.head;
	}

	@ObfuscatedName("aaf.e(Lajn;B)V")
	public void pushBack(DualLink node) {
		if (node.dualNext != null) {
			node.dualUnlink();
		}
		node.dualNext = this.head.dualNext;
		node.dualPrev = this.head;
		node.dualNext.dualPrev = node;
		node.dualPrev.dualNext = node;
	}

	@ObfuscatedName("aaf.n(I)Lajn;")
	public DualLink peekFront() {
		DualLink node = this.head.dualPrev;
		if (this.head == node) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.dualPrev;
			return node;
		}
	}

	@ObfuscatedName("aaf.m(I)Lajn;")
	public DualLink prev() {
		DualLink var1 = this.peeked;
		if (this.head == var1) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var1.dualPrev;
			return var1;
		}
	}

	@ObfuscatedName("aaf.k(I)V")
	public void clear() {
		while (true) {
			DualLink node = this.head.dualPrev;
			if (this.head == node) {
				this.peeked = null;
				return;
			}
			node.dualUnlink();
		}
	}
}
