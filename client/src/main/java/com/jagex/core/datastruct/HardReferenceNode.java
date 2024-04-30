package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ate")
public class HardReferenceNode extends ReferenceNode {

	@ObfuscatedName("ate.u")
	public Object value;

	public HardReferenceNode(Object arg0, int arg1) {
		super(arg1);
		this.value = arg0;
	}

	@ObfuscatedName("ate.e(B)Ljava/lang/Object;")
	public Object getValue() {
		return this.value;
	}

	@ObfuscatedName("ate.n(I)Z")
	public boolean isSoft() {
		return false;
	}
}
