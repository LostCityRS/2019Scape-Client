package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ajn")
public class DualLink extends Link {

	@ObfuscatedName("ajn.m")
	public DualLink dualPrev;

	@ObfuscatedName("ajn.k")
	public DualLink dualNext;

	@ObfuscatedName("ajn.n(I)V")
	public void dualUnlink() {
		if (this.dualNext != null) {
			this.dualNext.dualPrev = this.dualPrev;
			this.dualPrev.dualNext = this.dualNext;
			this.dualPrev = null;
			this.dualNext = null;
		}
	}
}
