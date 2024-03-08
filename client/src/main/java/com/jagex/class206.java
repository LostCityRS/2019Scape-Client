package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gt")
public class class206 implements class188 {

	// $FF: synthetic field
	public final class201 this$0;

	@ObfuscatedName("gt.e")
	public final class196 field1967;

	public class206(class201 arg0, class997 arg1) {
		this.this$0 = arg0;
		boolean var3 = arg1.method17904() != 255;
		if (var3) {
			arg1.field11503 -= -1445626955;
		}
		this.field1967 = new class196(arg1, var3, true, arg0.field1943);
	}

	@ObfuscatedName("gt.e(Lgq;B)V")
	public void method3371(class191 arg0) {
		arg0.method3395(this.field1967);
	}
}
