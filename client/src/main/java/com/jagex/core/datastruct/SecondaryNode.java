package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("aky")
public class SecondaryNode extends Node {

	@ObfuscatedName("aky.k")
	public long secondaryNodeId;

	@ObfuscatedName("aky.f")
	public SecondaryNode secondaryPrev;

	@ObfuscatedName("aky.w")
	public SecondaryNode secondaryNext;

	@ObfuscatedName("aky.t(S)V")
	public void secondaryRemove() {
		if (this.secondaryNext != null) {
			this.secondaryNext.secondaryPrev = this.secondaryPrev;
			this.secondaryPrev.secondaryNext = this.secondaryNext;
			this.secondaryPrev = null;
			this.secondaryNext = null;
		}
	}
}
