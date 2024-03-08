package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("anw")
public class class1071 extends class714 {

	@ObfuscatedName("anw.n")
	public class273 field11867;

	@ObfuscatedName("anw.m")
	public final class423 field11863 = new class423();

	@ObfuscatedName("anw.k")
	public boolean field11864;

	@ObfuscatedName("anw.f")
	public final class423 field11865 = new class423(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("anw.w")
	public final class423 field11862 = new class423(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("anw.l")
	public final class423 field11866 = new class423();

	public class1071(class274 arg0) {
		super(arg0);
	}

	@ObfuscatedName("anw.q(Ljn;Lox;ZI)V")
	public void method18816(class273 arg0, class423 arg1, boolean arg2) {
		this.field11867 = arg0;
		this.field11863.method6492(arg1);
		this.field11864 = arg2;
		arg0.method4667();
	}

	@ObfuscatedName("anw.x(I)V")
	public void method18815() {
		if (this.field11867 != null) {
			this.field11867 = this.field8479.method4697().method268(this.field11867.method4675(), this.field11867.method4670());
		}
	}

	@ObfuscatedName("anw.e(FB)V")
	public void method14131(float arg0) {
		if (this.field11867 != null) {
			this.field11862.method6492(this.field11867.method4667().method17853());
			this.field8479.method4807(false, arg0, this.field11865, this.field8479.method4721(), this.field11862, this.field11866);
		}
	}

	@ObfuscatedName("anw.n(I)Z")
	public boolean method14145() {
		return !Float.isNaN(this.field11865.field4308);
	}

	@ObfuscatedName("anw.f(Lju;Lou;IIFB)V")
	public void method14136(class270 arg0, class419 arg1, int arg2, int arg3, float arg4) {
		class423 var6 = class423.method6484(this.field8479.method4714());
		var6.field4308 -= arg2;
		var6.field4313 -= arg3;
		var6.field4311 *= -1.0F;
		class423 var7 = this.method14133();
		var7.field4308 -= arg2;
		var7.field4313 -= arg3;
		var7.field4311 *= -1.0F;
		arg1.method6296((double) var6.field4308, (double) var6.field4311, (double) var6.field4313, (double) var7.field4308, (double) var7.field4311, (double) var7.field4313, 0.0F, 1.0F, 0.0F);
		var6.method6486();
		var7.method6486();
	}

	@ObfuscatedName("anw.m(I)Lox;")
	public class423 method14133() {
		class423 var1 = class423.method6484(this.field11865);
		class423 var2 = class423.method6484(this.field11863);
		if (this.field11864) {
			var2.method6526(this.field11867.method4668());
		}
		var1.method6497(var2);
		var2.method6486();
		return var1;
	}

	@ObfuscatedName("anw.k(I)Lox;")
	public class423 method14135() {
		class423 var1 = class423.method6484(this.field11862);
		class423 var2 = class423.method6484(this.field11863);
		if (this.field11864) {
			var2.method6526(this.field11867.method4668());
		}
		var1.method6497(var2);
		var2.method6486();
		return var1;
	}

	@ObfuscatedName("anw.b(I)Lox;")
	public class423 method18819() {
		return this.field11865;
	}

	@ObfuscatedName("anw.w(Lalw;I)V")
	public void method14132(class997 arg0) {
		class272 var2 = Statics.method15213(arg0.method17904());
		int var3 = arg0.method17906();
		this.field11867 = this.field8479.method4697().method268(var2, var3);
		this.field11863.method6490(arg0);
		if (arg0.method17904() == 1) {
			this.field11864 = true;
		} else {
			this.field11864 = false;
		}
	}
}
