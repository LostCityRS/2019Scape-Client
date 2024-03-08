package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ani")
public class class1073 extends class714 {

	@ObfuscatedName("ani.n")
	public class428 field11874 = null;

	@ObfuscatedName("ani.m")
	public class911 field11875 = null;

	public class1073(class274 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ani.e(FB)V")
	public void method14131(float arg0) {
	}

	@ObfuscatedName("ani.n(I)Z")
	public boolean method14145() {
		return this.field11874 != null && this.field11875 != null && this.field11875.method5218();
	}

	@ObfuscatedName("ani.m(I)Lox;")
	public class423 method14133() {
		class423 var1 = class423.method6482();
		double[] var2 = this.field11874.method6767(this.field11875.method16733());
		var1.field4308 = (float) var2[0];
		var1.field4311 = (float) var2[1];
		var1.field4313 = (float) var2[2];
		return var1;
	}

	@ObfuscatedName("ani.q(B)[D")
	public double[] method18849() {
		return this.field11874.method6767(this.field11875.method16733());
	}

	@ObfuscatedName("ani.k(I)Lox;")
	public class423 method14135() {
		return this.method14133();
	}

	@ObfuscatedName("ani.f(Lju;Lou;IIFB)V")
	public void method14136(class270 arg0, class419 arg1, int arg2, int arg3, float arg4) {
		double[] var6 = this.field8479.method4715();
		var6[0] -= arg2;
		var6[2] -= arg3;
		double[] var7 = this.method18849();
		var7[0] -= arg2;
		var7[2] -= arg3;
		var6[1] *= -1.0D;
		var7[1] *= -1.0D;
		class423 var8 = class423.method6482();
		var8.field4308 = (float) (var7[0] - var6[0]);
		var8.field4311 = (float) (var7[1] - var6[1]);
		var8.field4313 = (float) (var7[2] - var6[2]);
		var8.method6513();
		class421 var9 = new class421();
		var9.method6413(var8, arg4);
		class423 var10 = class423.method6483(0.0F, 1.0F, 0.0F);
		class423 var11 = class423.method6587(var8, var10);
		class423 var12 = class423.method6587(var11, var8);
		var12.method6526(var9);
		arg1.method6296(var6[0], var6[1], var6[2], var7[0], var7[1], var7[2], var12.field4308, var12.field4311, var12.field4313);
		var12.method6486();
	}

	@ObfuscatedName("ani.w(Lalw;I)V")
	public void method14132(class997 arg0) {
		this.field11874 = new class428(arg0);
	}
}
