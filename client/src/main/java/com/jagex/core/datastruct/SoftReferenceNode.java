package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.lang.ref.SoftReference;

@ObfuscatedName("atm")
public class SoftReferenceNode extends ReferenceNode {

	@ObfuscatedName("atm.u")
	public SoftReference field12549;

	public SoftReferenceNode(Object arg0, int arg1) {
		super(arg1);
		this.field12549 = new SoftReference(arg0);
	}

	@ObfuscatedName("atm.e(B)Ljava/lang/Object;")
	public Object method19423() {
		return this.field12549.get();
	}

	@ObfuscatedName("atm.n(I)Z")
	public boolean isSoft() {
		return true;
	}
}
