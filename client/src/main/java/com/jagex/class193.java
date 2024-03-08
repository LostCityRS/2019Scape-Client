package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("go")
public class class193 implements class188 {

	// $FF: synthetic field
	public final class201 this$0;

	@ObfuscatedName("go.e")
	public final class197 field1917;

	public class193(class201 arg0, class997 arg1) {
		this.this$0 = arg0;
		boolean var3 = arg1.method17904() != 255;
		if (var3) {
			arg1.field11503 -= -1445626955;
		}
		this.field1917 = new class197(arg1, var3, true);
	}

	@ObfuscatedName("go.e(Lgq;B)V")
	public void method3371(class191 arg0) {
		arg0.method3451(this.field1917);
	}
}
