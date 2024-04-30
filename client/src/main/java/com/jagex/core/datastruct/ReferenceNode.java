package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("asa")
public abstract class ReferenceNode extends SecondaryNode {

	@ObfuscatedName("asa.l")
	public final int weight;

	public ReferenceNode(int arg0) {
		this.weight = arg0;
	}

	@ObfuscatedName("asa.e(B)Ljava/lang/Object;")
	public abstract Object getValue();

	@ObfuscatedName("asa.n(I)Z")
	public abstract boolean isSoft();
}
