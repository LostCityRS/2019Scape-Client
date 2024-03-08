package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gp")
public class class195 implements class203 {

	// $FF: synthetic field
	public final class201 this$0;

	@ObfuscatedName("gp.e")
	public final int field1918;

	@ObfuscatedName("gp.n")
	public final class196 field1919;

	public class195(class201 arg0, class997 arg1) {
		this.this$0 = arg0;
		this.field1918 = arg1.method17906();
		this.field1919 = new class196(arg1, false, false, arg0.field1943);
	}

	@ObfuscatedName("gp.e(Lgq;B)V")
	public void method3371(class191 arg0) {
		arg0.method3403(this.field1918, this.field1919);
	}
}
