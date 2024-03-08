package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("alv")
public class class1011 extends class769 implements class578 {

	public class1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8) {
		super(arg0, arg1, arg2 > 65535 ? 65535 : arg2, arg3, arg4 > 255 ? 255 : arg4, arg5, arg6, arg7, arg8 > 255 ? 255 : arg8);
	}

	@ObfuscatedName("alv.e(I)V")
	public void method9201() {
		class983 var1 = Statics.method1604(class390.field3805, client.field10849.field794);
		var1.field11432.method17939(this.field8862);
		int var2 = (this.field8869 ? 2 : 0) | (this.field8867 ? 1 : 0);
		var1.field11432.method17938(var2);
		var1.field11432.method17939(this.field8866);
		var1.field11432.method18081(this.field8864);
		var1.field11432.method18001(this.field8865);
		var1.field11432.method17958(this.field8870);
		var1.field11432.method17956(this.field8863);
		var1.field11432.method17939(this.field8868);
		client.field10849.method934(var1);
	}
}
