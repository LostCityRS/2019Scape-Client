package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.lang.ref.SoftReference;

@ObfuscatedName("atm")
public class class1224 extends class1178 {

	@ObfuscatedName("atm.u")
	public SoftReference field12549;

	public class1224(Object arg0, int arg1) {
		super(arg1);
		this.field12549 = new SoftReference(arg0);
	}

	@ObfuscatedName("atm.e(B)Ljava/lang/Object;")
	public Object method19423() {
		return this.field12549.get();
	}

	@ObfuscatedName("atm.n(I)Z")
	public boolean method19424() {
		return true;
	}
}
