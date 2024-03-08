package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fe")
public class class186 implements class203 {

	// $FF: synthetic field
	public final class201 this$0;

	@ObfuscatedName("fe.e")
	public final int field1893;

	@ObfuscatedName("fe.n")
	public final boolean field1892;

	public class186(class201 arg0, class997 arg1) {
		this.this$0 = arg0;
		this.field1893 = arg1.method17906();
		this.field1892 = arg1.method17904() == 1;
	}

	@ObfuscatedName("fe.e(Lgq;B)V")
	public void method3371(class191 arg0) {
		arg0.method3402(this.field1893, this.field1892);
		arg0.method3392(this.field1893).method3499();
	}
}
