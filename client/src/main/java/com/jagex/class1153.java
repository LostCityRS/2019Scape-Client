package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("arx")
public class class1153 extends class978 {

	// $FF: synthetic field
	public final class310 this$0;

	@ObfuscatedName("arx.k")
	public int field12218;

	@ObfuscatedName("arx.f")
	public boolean field12219;

	public class1153(class310 arg0) {
		this.this$0 = arg0;
		this.field12218 = -1;
	}

	@ObfuscatedName("arx.e(Lalw;B)V")
	public void method17726(class997 arg0) {
		this.field12218 = arg0.method17906();
		this.field12219 = arg0.method17904() == 1;
	}

	@ObfuscatedName("arx.n(Lkr;I)V")
	public void method17727(class309 arg0) {
		arg0.method5303(this.field12218, this.field12219);
	}
}
