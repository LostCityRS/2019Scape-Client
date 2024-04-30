package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.lang.ref.SoftReference;

@ObfuscatedName("atm")
public class SoftReferenceNode extends ReferenceNode {

	@ObfuscatedName("atm.u")
	public SoftReference value;

	public SoftReferenceNode(Object arg0, int arg1) {
		super(arg1);
		this.value = new SoftReference(arg0);
	}

	@ObfuscatedName("atm.e(B)Ljava/lang/Object;")
	public Object getValue() {
		return this.value.get();
	}

	@ObfuscatedName("atm.n(I)Z")
	public boolean isSoft() {
		return true;
	}
}
