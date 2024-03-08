package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aqm")
public class class1129 extends class874 {

	@ObfuscatedName("aqm.f")
	public final int field12045;

	@ObfuscatedName("aqm.w")
	public final int field12046;

	@ObfuscatedName("aqm.l")
	public final int field12047;

	public class1129(class997 arg0) {
		super(arg0);
		this.field12045 = arg0.method17906();
		this.field12046 = arg0.method17904();
		this.field12047 = arg0.method17906();
	}

	@ObfuscatedName("aqm.n(I)V")
	public void method2890() {
		Statics.field1721[this.field12045].method2870().method16563(this.field10303, this.field10305 << 16, this.field10304, this.field12047, false, this.field12046);
	}
}
