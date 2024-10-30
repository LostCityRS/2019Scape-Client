package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("aaf")
public class DualLinkQueue {

	@ObfuscatedName("aaf.e")
	public DualLink head = new DualLink();

	@ObfuscatedName("aaf.n")
	public DualLink peeked;

	public DualLinkQueue() {
		this.head.dualPrev = this.head;
		this.head.dualNext = this.head;
	}

	@ObfuscatedName("aaf.e(Lajn;B)V")
	public void pushBack(DualLink arg0) {
		if (arg0.dualNext != null) {
			arg0.dualUnlink();
		}
		arg0.dualNext = this.head.dualNext;
		arg0.dualPrev = this.head;
		arg0.dualNext.dualPrev = arg0;
		arg0.dualPrev.dualNext = arg0;
	}

	@ObfuscatedName("aaf.n(I)Lajn;")
	public DualLink peekFront() {
		DualLink var1 = this.head.dualPrev;
		if (this.head == var1) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var1.dualPrev;
			return var1;
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
			DualLink var1 = this.head.dualPrev;
			if (this.head == var1) {
				this.peeked = null;
				return;
			}
			var1.dualUnlink();
		}
	}
}
