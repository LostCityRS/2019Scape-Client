package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agv")
public class class866 extends class159 {

	@ObfuscatedName("agv.n")
	public final int field10275;

	@ObfuscatedName("agv.m")
	public final int field10274;

	public class866(class997 arg0) {
		super(arg0);
		this.field10275 = arg0.method17906();
		this.field10274 = arg0.method17927();
	}

	@ObfuscatedName("agv.n(I)V")
	public void method2890() {
		class156 var1 = Statics.field7317[this.field10275];
		client.method8895(var1.field1740, var1.field1737, var1.field1739, var1.field1736.field7567, var1.field1736.field7562, var1.field1738, null, this.field10274, 0);
	}

	@ObfuscatedName("agv.k(I)Z")
	public boolean method2891() {
		class164 var1 = (class164) Statics.field8797.method962(this.field10274);
		return var1.method2991();
	}
}
