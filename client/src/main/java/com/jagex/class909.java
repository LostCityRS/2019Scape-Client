package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ahh")
public class class909 extends class307 {

	@ObfuscatedName("ahh.n")
	public int field10551;

	@ObfuscatedName("ahh.m")
	public final class423 field10548 = new class423(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("ahh.k")
	public final class423 field10549 = new class423(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("ahh.f")
	public final class423 field10547 = new class423();

	@ObfuscatedName("ahh.w")
	public boolean field10550 = false;

	public class909(class274 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahh.t(Lakt;I)V")
	public void method16671(class994 arg0) {
		this.field10549.field4308 = arg0.field11478;
		this.field10549.field4311 = arg0.field11479;
		this.field10549.field4313 = arg0.field11480;
		if (Float.isNaN(this.field10548.field4308)) {
			this.field10548.method6492(this.field10549);
			this.field10547.method6493();
		}
		this.field10551 = arg0.field11477;
	}

	@ObfuscatedName("ahh.e(F[[[ILqx;IIB)V")
	public void method5238(float arg0, int[][][] arg1, class451 arg2, int arg3, int arg4) {
		if (this.field10550) {
			this.method16681(arg1, arg2, arg3, arg4);
		}
		this.field3084.method4807(true, arg0, this.field10548, this.field3084.method4721(), this.field10549, this.field10547);
	}

	@ObfuscatedName("ahh.n(I)Z")
	public boolean method5218() {
		return !Float.isNaN(this.field10548.field4308);
	}

	@ObfuscatedName("ahh.m(B)Lox;")
	public class423 method5219() {
		return class423.method6484(this.field10548);
	}

	@ObfuscatedName("ahh.k(I)[D")
	public double[] method5230() {
		double[] var1 = new double[3];
		class423 var2 = this.method5219();
		var1[0] = var2.field4308;
		var1[1] = var2.field4311;
		var1[2] = var2.field4313;
		return var1;
	}

	@ObfuscatedName("ahh.f(B)Lakt;")
	public class994 method5221() {
		return new class994(this.field10551, (int) this.field10548.field4308, (int) this.field10548.field4311, (int) this.field10548.field4313);
	}

	@ObfuscatedName("ahh.w(I)F")
	public float method5222() {
		return 0.0F;
	}

	@ObfuscatedName("ahh.l(Lju;IIB)V")
	public void method5223(class270 arg0, int arg1, int arg2) {
		arg0.field2835 = (int) this.field10548.field4308 - arg1;
		arg0.field2836 = (int) -this.field10548.field4311;
		arg0.field2837 = (int) this.field10548.field4313 - arg2;
	}

	@ObfuscatedName("ahh.u(Lalw;I)V")
	public void method5224(class997 arg0) {
		this.field10549.method6490(arg0);
	}

	@ObfuscatedName("ahh.ae(ZI)V")
	public void method16672(boolean arg0) {
		this.field10550 = arg0;
	}

	@ObfuscatedName("ahh.ag([[[ILqx;III)V")
	public void method16681(int[][][] arg0, class451 arg1, int arg2, int arg3) {
		if (!this.method5218() || !this.field3084.method4730() && !this.field3084.method4731() || !this.field3084.method4731() || arg0 == null) {
			return;
		}
		int var5 = (int) this.field10549.field4308 - arg2 >> 9;
		int var6 = (int) this.field10549.field4313 - arg3 >> 9;
		if (var5 < 0 || var6 < 0 || var5 + 1 >= arg0[0].length || var6 + 1 >= arg0[0][0].length) {
			return;
		}
		int var7 = this.field10551;
		if (arg1.method7105(var5, var6)) {
			var7 = this.field10551 + 1;
		}
		long var8 = (long) this.field10549.field4308 % 512L;
		long var10 = (long) this.field10549.field4313 % 512L;
		long var12 = (512L - var8) * (long) arg0[var7][var5][var6] * (512L - var10);
		long var14 = (long) arg0[var7][var5 + 1][var6] * var8 * (512L - var10) + var12;
		long var16 = (512L - var8) * (long) arg0[var7][var5][var6 + 1] * var10 + var14;
		long var18 = (long) arg0[var7][var5 + 1][var6 + 1] * var8 * var10 + var16;
		long var20 = var18 / 262144L;
		long var22 = var20 - 512L;
		float var24 = (float) -var22 - this.field10549.field4311;
		if (var24 > 0.0F) {
			this.field10549.field4311 = -var22;
		}
	}
}
