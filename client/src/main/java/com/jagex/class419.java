package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ou")
public class class419 {

	@ObfuscatedName("ou.e")
	public static final class419 field4282 = new class419();

	@ObfuscatedName("ou.n")
	public float field4276;

	@ObfuscatedName("ou.m")
	public float field4277;

	@ObfuscatedName("ou.k")
	public float field4278;

	@ObfuscatedName("ou.f")
	public float field4279;

	@ObfuscatedName("ou.w")
	public float field4287;

	@ObfuscatedName("ou.l")
	public float field4281;

	@ObfuscatedName("ou.u")
	public float field4275;

	@ObfuscatedName("ou.z")
	public float field4283;

	@ObfuscatedName("ou.p")
	public float field4284;

	@ObfuscatedName("ou.d")
	public float field4285;

	@ObfuscatedName("ou.c")
	public float field4286;

	@ObfuscatedName("ou.r")
	public float field4280;

	public class419() {
		this.method6376();
	}

	public class419(class419 arg0) {
		this.method6292(arg0);
	}

	@ObfuscatedName("ou.e(Lou;)V")
	public void method6292(class419 arg0) {
		this.field4276 = arg0.field4276;
		this.field4279 = arg0.field4279;
		this.field4275 = arg0.field4275;
		this.field4285 = arg0.field4285;
		this.field4277 = arg0.field4277;
		this.field4287 = arg0.field4287;
		this.field4283 = arg0.field4283;
		this.field4286 = arg0.field4286;
		this.field4278 = arg0.field4278;
		this.field4281 = arg0.field4281;
		this.field4284 = arg0.field4284;
		this.field4280 = arg0.field4280;
	}

	@ObfuscatedName("ou.n(Loe;)V")
	public void method6293(class420 arg0) {
		this.method6294(arg0);
	}

	@ObfuscatedName("ou.m(Loe;)V")
	public void method6294(class420 arg0) {
		this.method6311(arg0.field4299);
		this.method6308(arg0.field4297);
		this.method6314(arg0.field4298);
	}

	@ObfuscatedName("ou.k()V")
	public void method6376() {
		this.field4280 = 0.0F;
		this.field4286 = 0.0F;
		this.field4285 = 0.0F;
		this.field4283 = 0.0F;
		this.field4275 = 0.0F;
		this.field4281 = 0.0F;
		this.field4279 = 0.0F;
		this.field4278 = 0.0F;
		this.field4277 = 0.0F;
		this.field4284 = 1.0F;
		this.field4287 = 1.0F;
		this.field4276 = 1.0F;
	}

	@ObfuscatedName("ou.f(DDDDDDFFF)V")
	public void method6296(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5, float arg6, float arg7, float arg8) {
		float var16 = (float) (arg3 - arg0);
		float var17 = (float) (arg4 - arg1);
		float var18 = (float) (arg5 - arg2);
		float var19 = arg7 * var18 - arg8 * var17;
		float var20 = arg8 * var16 - arg6 * var18;
		float var21 = arg6 * var17 - arg7 * var16;
		float var22 = (float) (1.0D / Math.sqrt((double) (var21 * var21 + var19 * var19 + var20 * var20)));
		float var23 = (float) (1.0D / Math.sqrt((double) (var18 * var18 + var16 * var16 + var17 * var17)));
		this.field4276 = var19 * var22;
		this.field4279 = var20 * var22;
		this.field4275 = var21 * var22;
		this.field4278 = var16 * var23;
		this.field4281 = var17 * var23;
		this.field4284 = var18 * var23;
		this.field4277 = this.field4281 * this.field4275 - this.field4284 * this.field4279;
		this.field4287 = this.field4284 * this.field4276 - this.field4278 * this.field4275;
		this.field4283 = this.field4279 * this.field4278 - this.field4281 * this.field4276;
		this.field4285 = -((float) ((double) this.field4275 * arg2 + (double) this.field4279 * arg1 + (double) this.field4276 * arg0));
		this.field4286 = -((float) ((double) this.field4283 * arg2 + (double) this.field4287 * arg1 + (double) this.field4277 * arg0));
		this.field4280 = -((float) ((double) this.field4284 * arg2 + (double) this.field4281 * arg1 + (double) this.field4278 * arg0));
	}

	@ObfuscatedName("ou.w(IIIFFF)V")
	public void method6297(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
		if (arg0 == 0) {
			this.field4283 = 0.0F;
			this.field4275 = 0.0F;
			this.field4281 = 0.0F;
			this.field4279 = 0.0F;
			this.field4278 = 0.0F;
			this.field4277 = 0.0F;
			this.field4276 = arg1 * 2;
			this.field4287 = arg2 * 2;
			this.field4284 = 1.0F;
			this.field4285 = arg3 - (float) arg1;
			this.field4286 = arg4 - (float) arg2;
			this.field4280 = arg5;
			return;
		}
		float var7 = class418.field4273[arg0 & 0x3FFF];
		float var8 = class418.field4274[arg0 & 0x3FFF];
		this.field4284 = 1.0F;
		this.field4283 = 0.0F;
		this.field4275 = 0.0F;
		this.field4281 = 0.0F;
		this.field4278 = 0.0F;
		this.field4276 = var7 * 2.0F * (float) arg1;
		this.field4287 = var7 * 2.0F * (float) arg2;
		this.field4277 = var8 * 2.0F * (float) arg1;
		this.field4279 = var8 * -2.0F * (float) arg2;
		this.field4285 = (var8 * 0.5F - var7 * 0.5F) * (float) (arg1 * 2) + arg3;
		this.field4286 = (var8 * -0.5F - var7 * 0.5F) * (float) (arg2 * 2) + arg4;
		this.field4280 = arg5;
	}

	@ObfuscatedName("ou.l(FFFFFFFFF)V")
	public void method6298(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
		this.field4276 = arg0;
		this.field4279 = arg3;
		this.field4275 = arg6;
		this.field4285 = 0.0F;
		this.field4277 = arg1;
		this.field4287 = arg4;
		this.field4283 = arg7;
		this.field4286 = 0.0F;
		this.field4278 = arg2;
		this.field4281 = arg5;
		this.field4284 = arg8;
		this.field4280 = 0.0F;
	}

	@ObfuscatedName("ou.u(Lou;)V")
	public void method6299(class419 arg0) {
		if (arg0 == this) {
			this.method6300();
			return;
		}
		this.field4276 = arg0.field4276;
		this.field4279 = arg0.field4277;
		this.field4275 = arg0.field4278;
		this.field4277 = arg0.field4279;
		this.field4287 = arg0.field4287;
		this.field4283 = arg0.field4281;
		this.field4278 = arg0.field4275;
		this.field4281 = arg0.field4283;
		this.field4284 = arg0.field4284;
		this.field4285 = -(this.field4275 * arg0.field4280 + this.field4279 * arg0.field4286 + this.field4276 * arg0.field4285);
		this.field4286 = -(this.field4283 * arg0.field4280 + this.field4287 * arg0.field4286 + this.field4277 * arg0.field4285);
		this.field4280 = -(this.field4284 * arg0.field4280 + this.field4281 * arg0.field4286 + this.field4278 * arg0.field4285);
	}

	@ObfuscatedName("ou.z()V")
	public void method6300() {
		float var1 = this.field4285;
		float var2 = this.field4286;
		float var3 = this.field4279;
		this.field4279 = this.field4277;
		this.field4277 = var3;
		float var4 = this.field4275;
		this.field4275 = this.field4278;
		this.field4278 = var4;
		float var5 = this.field4283;
		this.field4283 = this.field4281;
		this.field4281 = var5;
		this.field4285 = -(this.field4280 * this.field4275 + this.field4279 * var2 + this.field4276 * var1);
		this.field4286 = -(this.field4283 * this.field4280 + this.field4287 * var2 + this.field4277 * var1);
		this.field4280 = -(this.field4284 * this.field4280 + this.field4281 * var2 + this.field4278 * var1);
	}

	@ObfuscatedName("ou.p(FFFF)V")
	public void method6372(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.cos((double) arg3);
		float var6 = (float) Math.sin((double) arg3);
		this.field4276 = arg0 * arg0 * (1.0F - var5) + var5;
		this.field4277 = arg0 * arg1 * (1.0F - var5) + arg2 * var6;
		this.field4278 = arg0 * arg2 * (1.0F - var5) + -arg1 * var6;
		this.field4279 = arg0 * arg1 * (1.0F - var5) + -arg2 * var6;
		this.field4287 = arg1 * arg1 * (1.0F - var5) + var5;
		this.field4281 = arg1 * arg2 * (1.0F - var5) + arg0 * var6;
		this.field4275 = arg0 * arg2 * (1.0F - var5) + arg1 * var6;
		this.field4283 = arg1 * arg2 * (1.0F - var5) + -arg0 * var6;
		this.field4284 = arg2 * arg2 * (1.0F - var5) + var5;
		this.field4280 = 0.0F;
		this.field4286 = 0.0F;
		this.field4285 = 0.0F;
	}

	@ObfuscatedName("ou.d(Lov;)V")
	public void method6302(class421 arg0) {
		this.method6322(arg0.field4301, arg0.field4304, arg0.field4305, arg0.field4300);
	}

	@ObfuscatedName("ou.c(FFFF)V")
	public void method6322(float arg0, float arg1, float arg2, float arg3) {
		float var5 = arg0 * arg0;
		float var6 = arg0 * arg1;
		float var7 = arg0 * arg2;
		float var8 = arg0 * arg3;
		float var9 = arg1 * arg1;
		float var10 = arg1 * arg2;
		float var11 = arg1 * arg3;
		float var12 = arg2 * arg2;
		float var13 = arg2 * arg3;
		this.field4276 = 1.0F - (var9 + var12) * 2.0F;
		this.field4279 = (var6 - var13) * 2.0F;
		this.field4275 = (var7 + var11) * 2.0F;
		this.field4277 = (var6 + var13) * 2.0F;
		this.field4287 = 1.0F - (var5 + var12) * 2.0F;
		this.field4283 = (var10 - var8) * 2.0F;
		this.field4278 = (var7 - var11) * 2.0F;
		this.field4281 = (var8 + var10) * 2.0F;
		this.field4284 = 1.0F - (var5 + var9) * 2.0F;
		this.field4280 = 0.0F;
		this.field4286 = 0.0F;
		this.field4285 = 0.0F;
	}

	@ObfuscatedName("ou.r(F)V")
	public void method6304(float arg0) {
		float var2 = (float) Math.cos((double) arg0);
		float var3 = (float) Math.sin((double) arg0);
		float var4 = this.field4277;
		float var5 = this.field4287;
		float var6 = this.field4283;
		float var7 = this.field4286;
		this.field4277 = var2 * var4 - this.field4278 * var3;
		this.field4278 = this.field4278 * var2 + var3 * var4;
		this.field4287 = var2 * var5 - this.field4281 * var3;
		this.field4281 = this.field4281 * var2 + var3 * var5;
		this.field4283 = var2 * var6 - this.field4284 * var3;
		this.field4284 = this.field4284 * var2 + var3 * var6;
		this.field4286 = var2 * var7 - this.field4280 * var3;
		this.field4280 = this.field4280 * var2 + var3 * var7;
	}

	@ObfuscatedName("ou.v(F)V")
	public void method6305(float arg0) {
		float var2 = (float) Math.cos((double) arg0);
		float var3 = (float) Math.sin((double) arg0);
		float var4 = this.field4276;
		float var5 = this.field4279;
		float var6 = this.field4275;
		float var7 = this.field4285;
		this.field4276 = this.field4278 * var3 + var2 * var4;
		this.field4278 = this.field4278 * var2 - var3 * var4;
		this.field4279 = this.field4281 * var3 + var2 * var5;
		this.field4281 = this.field4281 * var2 - var3 * var5;
		this.field4275 = this.field4284 * var3 + var2 * var6;
		this.field4284 = this.field4284 * var2 - var3 * var6;
		this.field4285 = this.field4280 * var3 + var2 * var7;
		this.field4280 = this.field4280 * var2 - var3 * var7;
	}

	@ObfuscatedName("ou.o(F)V")
	public void method6306(float arg0) {
		float var2 = (float) Math.cos((double) arg0);
		float var3 = (float) Math.sin((double) arg0);
		float var4 = this.field4276;
		float var5 = this.field4279;
		float var6 = this.field4275;
		float var7 = this.field4285;
		this.field4276 = var2 * var4 - this.field4277 * var3;
		this.field4277 = this.field4277 * var2 + var3 * var4;
		this.field4279 = var2 * var5 - this.field4287 * var3;
		this.field4287 = this.field4287 * var2 + var3 * var5;
		this.field4275 = var2 * var6 - this.field4283 * var3;
		this.field4283 = this.field4283 * var2 + var3 * var6;
		this.field4285 = var2 * var7 - this.field4286 * var3;
		this.field4286 = this.field4286 * var2 + var3 * var7;
	}

	@ObfuscatedName("ou.s(FFFF)V")
	public void method6307(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.cos((double) arg3);
		float var6 = (float) Math.sin((double) arg3);
		float var7 = arg0 * arg0 * (1.0F - var5) + var5;
		float var8 = arg0 * arg1 * (1.0F - var5) + arg2 * var6;
		float var9 = arg0 * arg2 * (1.0F - var5) + -arg1 * var6;
		float var10 = arg0 * arg1 * (1.0F - var5) + -arg2 * var6;
		float var11 = arg1 * arg1 * (1.0F - var5) + var5;
		float var12 = arg1 * arg2 * (1.0F - var5) + arg0 * var6;
		float var13 = arg0 * arg2 * (1.0F - var5) + arg1 * var6;
		float var14 = arg1 * arg2 * (1.0F - var5) + -arg0 * var6;
		float var15 = arg2 * arg2 * (1.0F - var5) + var5;
		float var16 = this.field4276;
		float var17 = this.field4277;
		float var18 = this.field4279;
		float var19 = this.field4287;
		float var20 = this.field4275;
		float var21 = this.field4283;
		float var22 = this.field4285;
		float var23 = this.field4286;
		this.field4276 = this.field4278 * var13 + var7 * var16 + var10 * var17;
		this.field4277 = this.field4278 * var14 + var8 * var16 + var11 * var17;
		this.field4278 = this.field4278 * var15 + var9 * var16 + var12 * var17;
		this.field4279 = this.field4281 * var13 + var7 * var18 + var10 * var19;
		this.field4287 = this.field4281 * var14 + var8 * var18 + var11 * var19;
		this.field4281 = this.field4281 * var15 + var9 * var18 + var12 * var19;
		this.field4275 = this.field4284 * var13 + var7 * var20 + var10 * var21;
		this.field4283 = this.field4284 * var14 + var8 * var20 + var11 * var21;
		this.field4284 = this.field4284 * var15 + var9 * var20 + var12 * var21;
		this.field4285 = this.field4280 * var13 + var7 * var22 + var10 * var23;
		this.field4286 = this.field4280 * var14 + var8 * var22 + var11 * var23;
		this.field4280 = this.field4280 * var15 + var9 * var22 + var12 * var23;
	}

	@ObfuscatedName("ou.y(Lov;)V")
	public void method6308(class421 arg0) {
		this.method6309(arg0.field4301, arg0.field4304, arg0.field4305, arg0.field4300);
	}

	@ObfuscatedName("ou.q(FFFF)V")
	public void method6309(float arg0, float arg1, float arg2, float arg3) {
		float var5 = arg0 * arg0;
		float var6 = arg0 * arg1;
		float var7 = arg0 * arg2;
		float var8 = arg0 * arg3;
		float var9 = arg1 * arg1;
		float var10 = arg1 * arg2;
		float var11 = arg1 * arg3;
		float var12 = arg2 * arg2;
		float var13 = arg2 * arg3;
		float var14 = 1.0F - (var9 + var12) * 2.0F;
		float var15 = (var6 - var13) * 2.0F;
		float var16 = (var7 + var11) * 2.0F;
		float var17 = (var6 + var13) * 2.0F;
		float var18 = 1.0F - (var5 + var12) * 2.0F;
		float var19 = (var10 - var8) * 2.0F;
		float var20 = (var7 - var11) * 2.0F;
		float var21 = (var8 + var10) * 2.0F;
		float var22 = 1.0F - (var5 + var9) * 2.0F;
		float var23 = this.field4276;
		float var24 = this.field4277;
		float var25 = this.field4279;
		float var26 = this.field4287;
		float var27 = this.field4275;
		float var28 = this.field4283;
		float var29 = this.field4285;
		float var30 = this.field4286;
		this.field4276 = this.field4278 * var16 + var14 * var23 + var15 * var24;
		this.field4277 = this.field4278 * var19 + var17 * var23 + var18 * var24;
		this.field4278 = this.field4278 * var22 + var20 * var23 + var21 * var24;
		this.field4279 = this.field4281 * var16 + var14 * var25 + var15 * var26;
		this.field4287 = this.field4281 * var19 + var17 * var25 + var18 * var26;
		this.field4281 = this.field4281 * var22 + var20 * var25 + var21 * var26;
		this.field4275 = this.field4284 * var16 + var14 * var27 + var15 * var28;
		this.field4283 = this.field4284 * var19 + var17 * var27 + var18 * var28;
		this.field4284 = this.field4284 * var22 + var20 * var27 + var21 * var28;
		this.field4285 = this.field4280 * var16 + var14 * var29 + var15 * var30;
		this.field4286 = this.field4280 * var19 + var17 * var29 + var18 * var30;
		this.field4280 = this.field4280 * var22 + var20 * var29 + var21 * var30;
	}

	@ObfuscatedName("ou.x(FFF)V")
	public void method6348(float arg0, float arg1, float arg2) {
		this.field4276 = arg0;
		this.field4279 = 0.0F;
		this.field4275 = 0.0F;
		this.field4285 = 0.0F;
		this.field4277 = 0.0F;
		this.field4287 = arg1;
		this.field4283 = 0.0F;
		this.field4286 = 0.0F;
		this.field4278 = 0.0F;
		this.field4281 = 0.0F;
		this.field4284 = arg2;
		this.field4280 = 0.0F;
	}

	@ObfuscatedName("ou.b(Lox;)V")
	public void method6311(class423 arg0) {
		this.method6348(arg0.field4308, arg0.field4311, arg0.field4313);
	}

	@ObfuscatedName("ou.h(FFF)V")
	public void method6312(float arg0, float arg1, float arg2) {
		this.field4276 *= arg0;
		this.field4279 *= arg0;
		this.field4275 *= arg0;
		this.field4285 *= arg0;
		this.field4277 *= arg1;
		this.field4287 *= arg1;
		this.field4283 *= arg1;
		this.field4286 *= arg1;
		this.field4278 *= arg2;
		this.field4281 *= arg2;
		this.field4284 *= arg2;
		this.field4280 *= arg2;
	}

	@ObfuscatedName("ou.a(FFF)V")
	public void method6313(float arg0, float arg1, float arg2) {
		this.field4283 = 0.0F;
		this.field4275 = 0.0F;
		this.field4281 = 0.0F;
		this.field4279 = 0.0F;
		this.field4278 = 0.0F;
		this.field4277 = 0.0F;
		this.field4284 = 1.0F;
		this.field4287 = 1.0F;
		this.field4276 = 1.0F;
		this.field4285 = arg0;
		this.field4286 = arg1;
		this.field4280 = arg2;
	}

	@ObfuscatedName("ou.g(Lox;)V")
	public void method6314(class423 arg0) {
		this.method6315(arg0.field4308, arg0.field4311, arg0.field4313);
	}

	@ObfuscatedName("ou.i(FFF)V")
	public void method6315(float arg0, float arg1, float arg2) {
		this.field4285 += arg0;
		this.field4286 += arg1;
		this.field4280 += arg2;
	}

	@ObfuscatedName("ou.j(Lou;)V")
	public void method6316(class419 arg0) {
		float var2 = this.field4276;
		float var3 = this.field4277;
		float var4 = this.field4279;
		float var5 = this.field4287;
		float var6 = this.field4275;
		float var7 = this.field4283;
		float var8 = this.field4285;
		float var9 = this.field4286;
		float var10 = this.field4278;
		float var11 = this.field4281;
		float var12 = this.field4284;
		float var13 = this.field4280;
		this.field4276 = arg0.field4275 * var10 + arg0.field4279 * var3 + arg0.field4276 * var2;
		this.field4277 = arg0.field4283 * var10 + arg0.field4287 * var3 + arg0.field4277 * var2;
		this.field4278 = arg0.field4284 * var10 + arg0.field4281 * var3 + arg0.field4278 * var2;
		this.field4279 = arg0.field4275 * var11 + arg0.field4279 * var5 + arg0.field4276 * var4;
		this.field4287 = arg0.field4283 * var11 + arg0.field4287 * var5 + arg0.field4277 * var4;
		this.field4281 = arg0.field4284 * var11 + arg0.field4281 * var5 + arg0.field4278 * var4;
		this.field4275 = arg0.field4275 * var12 + arg0.field4279 * var7 + arg0.field4276 * var6;
		this.field4283 = arg0.field4283 * var12 + arg0.field4287 * var7 + arg0.field4277 * var6;
		this.field4284 = arg0.field4284 * var12 + arg0.field4281 * var7 + arg0.field4278 * var6;
		this.field4285 = arg0.field4275 * var13 + arg0.field4279 * var9 + arg0.field4276 * var8 + arg0.field4285;
		this.field4286 = arg0.field4283 * var13 + arg0.field4287 * var9 + arg0.field4277 * var8 + arg0.field4286;
		this.field4280 = arg0.field4284 * var13 + arg0.field4281 * var9 + arg0.field4278 * var8 + arg0.field4280;
	}

	@ObfuscatedName("ou.t(Lou;Lou;)V")
	public void method6317(class419 arg0, class419 arg1) {
		this.field4276 = arg0.field4278 * arg1.field4275 + arg0.field4277 * arg1.field4279 + arg0.field4276 * arg1.field4276;
		this.field4277 = arg0.field4278 * arg1.field4283 + arg0.field4277 * arg1.field4287 + arg0.field4276 * arg1.field4277;
		this.field4278 = arg0.field4278 * arg1.field4284 + arg0.field4277 * arg1.field4281 + arg0.field4276 * arg1.field4278;
		this.field4279 = arg0.field4281 * arg1.field4275 + arg0.field4287 * arg1.field4279 + arg0.field4279 * arg1.field4276;
		this.field4287 = arg0.field4281 * arg1.field4283 + arg0.field4287 * arg1.field4287 + arg0.field4279 * arg1.field4277;
		this.field4281 = arg0.field4281 * arg1.field4284 + arg0.field4287 * arg1.field4281 + arg0.field4279 * arg1.field4278;
		this.field4275 = arg0.field4284 * arg1.field4275 + arg0.field4283 * arg1.field4279 + arg0.field4275 * arg1.field4276;
		this.field4283 = arg0.field4284 * arg1.field4283 + arg0.field4283 * arg1.field4287 + arg0.field4275 * arg1.field4277;
		this.field4284 = arg0.field4284 * arg1.field4284 + arg0.field4283 * arg1.field4281 + arg0.field4275 * arg1.field4278;
		this.field4285 = arg0.field4280 * arg1.field4275 + arg0.field4286 * arg1.field4279 + arg0.field4285 * arg1.field4276 + arg1.field4285;
		this.field4286 = arg0.field4280 * arg1.field4283 + arg0.field4286 * arg1.field4287 + arg0.field4285 * arg1.field4277 + arg1.field4286;
		this.field4280 = arg0.field4280 * arg1.field4284 + arg0.field4286 * arg1.field4281 + arg0.field4285 * arg1.field4278 + arg1.field4280;
	}

	@ObfuscatedName("ou.ae(FFF[F)V")
	public void method6295(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.field4275 * arg2 + this.field4279 * arg1 + this.field4276 * arg0 + this.field4285;
		arg3[1] = this.field4283 * arg2 + this.field4287 * arg1 + this.field4277 * arg0 + this.field4286;
		arg3[2] = this.field4284 * arg2 + this.field4281 * arg1 + this.field4278 * arg0 + this.field4280;
	}

	@ObfuscatedName("ou.ag(FFF[F)V")
	public void method6319(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = arg0 - this.field4285;
		float var6 = arg1 - this.field4286;
		float var7 = arg2 - this.field4280;
		arg3[0] = (float) (this.field4278 * var7 + this.field4277 * var6 + this.field4276 * var5);
		arg3[1] = (float) (this.field4281 * var7 + this.field4287 * var6 + this.field4279 * var5);
		arg3[2] = (float) (this.field4284 * var7 + this.field4283 * var6 + this.field4275 * var5);
	}

	@ObfuscatedName("ou.ah([F)V")
	public void method6320(float[] arg0) {
		float var2 = arg0[0] - this.field4285;
		float var3 = arg0[1] - this.field4286;
		float var4 = arg0[2] - this.field4280;
		arg0[0] = (float) (this.field4278 * var4 + this.field4277 * var3 + this.field4276 * var2);
		arg0[1] = (float) (this.field4281 * var4 + this.field4287 * var3 + this.field4279 * var2);
		arg0[2] = (float) (this.field4284 * var4 + this.field4283 * var3 + this.field4275 * var2);
	}

	@ObfuscatedName("ou.al([F)V")
	public void method6321(float[] arg0) {
		float var2 = arg0[0];
		float var3 = arg0[1];
		float var4 = arg0[2];
		arg0[0] = this.field4278 * var4 + this.field4277 * var3 + this.field4276 * var2;
		arg0[1] = this.field4281 * var4 + this.field4287 * var3 + this.field4279 * var2;
		arg0[2] = this.field4284 * var4 + this.field4283 * var3 + this.field4275 * var2;
	}

	@ObfuscatedName("ou.ac([F)[F")
	public float[] method6318(float[] arg0) {
		arg0[0] = this.field4285;
		arg0[1] = this.field4286;
		arg0[2] = this.field4280;
		return arg0;
	}

	@ObfuscatedName("ou.ai([F)[F")
	public float[] method6374(float[] arg0) {
		arg0[0] = this.field4276;
		arg0[1] = this.field4277;
		arg0[2] = this.field4278;
		arg0[3] = this.field4279;
		arg0[4] = this.field4287;
		arg0[5] = this.field4281;
		arg0[6] = this.field4275;
		arg0[7] = this.field4283;
		arg0[8] = this.field4284;
		return arg0;
	}

	public String toString() {
		return this.field4276 + "," + this.field4279 + "," + this.field4275 + "," + this.field4285 + "\n" + this.field4277 + "," + this.field4287 + "," + this.field4283 + "," + this.field4286 + "\n" + this.field4278 + "," + this.field4281 + "," + this.field4284 + "," + this.field4280;
	}
}
