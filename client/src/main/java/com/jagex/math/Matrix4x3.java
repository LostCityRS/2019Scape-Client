package com.jagex.math;

import deob.ObfuscatedName;

@ObfuscatedName("ou")
public class Matrix4x3 {

	@ObfuscatedName("ou.e")
	public static final Matrix4x3 IDENTITY = new Matrix4x3();

	@ObfuscatedName("ou.n")
	public float entry00;

	@ObfuscatedName("ou.m")
	public float entry01;

	@ObfuscatedName("ou.k")
	public float entry02;

	@ObfuscatedName("ou.f")
	public float entry10;

	@ObfuscatedName("ou.w")
	public float entry11;

	@ObfuscatedName("ou.l")
	public float entry12;

	@ObfuscatedName("ou.u")
	public float entry20;

	@ObfuscatedName("ou.z")
	public float entry21;

	@ObfuscatedName("ou.p")
	public float entry22;

	@ObfuscatedName("ou.d")
	public float entry30;

	@ObfuscatedName("ou.c")
	public float entry31;

	@ObfuscatedName("ou.r")
	public float entry32;

	public Matrix4x3() {
		this.setToIdentity();
	}

	public Matrix4x3(Matrix4x3 arg0) {
		this.setTo(arg0);
	}

	@ObfuscatedName("ou.e(Lou;)V")
	public void setTo(Matrix4x3 arg0) {
		this.entry00 = arg0.entry00;
		this.entry10 = arg0.entry10;
		this.entry20 = arg0.entry20;
		this.entry30 = arg0.entry30;
		this.entry01 = arg0.entry01;
		this.entry11 = arg0.entry11;
		this.entry21 = arg0.entry21;
		this.entry31 = arg0.entry31;
		this.entry02 = arg0.entry02;
		this.entry12 = arg0.entry12;
		this.entry22 = arg0.entry22;
		this.entry32 = arg0.entry32;
	}

	@ObfuscatedName("ou.n(Loe;)V")
	public void setToTransform2(ScaleRotTrans arg0) {
		this.setToTransform(arg0);
	}

	@ObfuscatedName("ou.m(Loe;)V")
	public void setToTransform(ScaleRotTrans arg0) {
		this.setToScale(arg0.scale);
		this.rotateQuaternion(arg0.rot);
		this.translate(arg0.trans);
	}

	@ObfuscatedName("ou.k()V")
	public void setToIdentity() {
		this.entry32 = 0.0F;
		this.entry31 = 0.0F;
		this.entry30 = 0.0F;
		this.entry21 = 0.0F;
		this.entry20 = 0.0F;
		this.entry12 = 0.0F;
		this.entry10 = 0.0F;
		this.entry02 = 0.0F;
		this.entry01 = 0.0F;
		this.entry22 = 1.0F;
		this.entry11 = 1.0F;
		this.entry00 = 1.0F;
	}

	@ObfuscatedName("ou.f(DDDDDDFFF)V")
	public void setToCameraTransform(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5, float arg6, float arg7, float arg8) {
		float var16 = (float) (arg3 - arg0);
		float var17 = (float) (arg4 - arg1);
		float var18 = (float) (arg5 - arg2);
		float var19 = arg7 * var18 - arg8 * var17;
		float var20 = arg8 * var16 - arg6 * var18;
		float var21 = arg6 * var17 - arg7 * var16;
		float var22 = (float) (1.0D / Math.sqrt((double) (var21 * var21 + var19 * var19 + var20 * var20)));
		float var23 = (float) (1.0D / Math.sqrt((double) (var18 * var18 + var16 * var16 + var17 * var17)));
		this.entry00 = var19 * var22;
		this.entry10 = var20 * var22;
		this.entry20 = var21 * var22;
		this.entry02 = var16 * var23;
		this.entry12 = var17 * var23;
		this.entry22 = var18 * var23;
		this.entry01 = this.entry12 * this.entry20 - this.entry22 * this.entry10;
		this.entry11 = this.entry22 * this.entry00 - this.entry02 * this.entry20;
		this.entry21 = this.entry10 * this.entry02 - this.entry12 * this.entry00;
		this.entry30 = -((float) ((double) this.entry20 * arg2 + (double) this.entry10 * arg1 + (double) this.entry00 * arg0));
		this.entry31 = -((float) ((double) this.entry21 * arg2 + (double) this.entry11 * arg1 + (double) this.entry01 * arg0));
		this.entry32 = -((float) ((double) this.entry22 * arg2 + (double) this.entry12 * arg1 + (double) this.entry02 * arg0));
	}

	@ObfuscatedName("ou.w(IIIFFF)V")
	public void method6297(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
		if (arg0 == 0) {
			this.entry21 = 0.0F;
			this.entry20 = 0.0F;
			this.entry12 = 0.0F;
			this.entry10 = 0.0F;
			this.entry02 = 0.0F;
			this.entry01 = 0.0F;
			this.entry00 = arg1 * 2;
			this.entry11 = arg2 * 2;
			this.entry22 = 1.0F;
			this.entry30 = arg3 - (float) arg1;
			this.entry31 = arg4 - (float) arg2;
			this.entry32 = arg5;
			return;
		}
		float var7 = TrigMatrix.cos[arg0 & 0x3FFF];
		float var8 = TrigMatrix.sin[arg0 & 0x3FFF];
		this.entry22 = 1.0F;
		this.entry21 = 0.0F;
		this.entry20 = 0.0F;
		this.entry12 = 0.0F;
		this.entry02 = 0.0F;
		this.entry00 = var7 * 2.0F * (float) arg1;
		this.entry11 = var7 * 2.0F * (float) arg2;
		this.entry01 = var8 * 2.0F * (float) arg1;
		this.entry10 = var8 * -2.0F * (float) arg2;
		this.entry30 = (var8 * 0.5F - var7 * 0.5F) * (float) (arg1 * 2) + arg3;
		this.entry31 = (var8 * -0.5F - var7 * 0.5F) * (float) (arg2 * 2) + arg4;
		this.entry32 = arg5;
	}

	@ObfuscatedName("ou.l(FFFFFFFFF)V")
	public void method6298(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
		this.entry00 = arg0;
		this.entry10 = arg3;
		this.entry20 = arg6;
		this.entry30 = 0.0F;
		this.entry01 = arg1;
		this.entry11 = arg4;
		this.entry21 = arg7;
		this.entry31 = 0.0F;
		this.entry02 = arg2;
		this.entry12 = arg5;
		this.entry22 = arg8;
		this.entry32 = 0.0F;
	}

	@ObfuscatedName("ou.u(Lou;)V")
	public void method6299(Matrix4x3 arg0) {
		if (arg0 == this) {
			this.method6300();
			return;
		}
		this.entry00 = arg0.entry00;
		this.entry10 = arg0.entry01;
		this.entry20 = arg0.entry02;
		this.entry01 = arg0.entry10;
		this.entry11 = arg0.entry11;
		this.entry21 = arg0.entry12;
		this.entry02 = arg0.entry20;
		this.entry12 = arg0.entry21;
		this.entry22 = arg0.entry22;
		this.entry30 = -(this.entry20 * arg0.entry32 + this.entry10 * arg0.entry31 + this.entry00 * arg0.entry30);
		this.entry31 = -(this.entry21 * arg0.entry32 + this.entry11 * arg0.entry31 + this.entry01 * arg0.entry30);
		this.entry32 = -(this.entry22 * arg0.entry32 + this.entry12 * arg0.entry31 + this.entry02 * arg0.entry30);
	}

	@ObfuscatedName("ou.z()V")
	public void method6300() {
		float var1 = this.entry30;
		float var2 = this.entry31;
		float var3 = this.entry10;
		this.entry10 = this.entry01;
		this.entry01 = var3;
		float var4 = this.entry20;
		this.entry20 = this.entry02;
		this.entry02 = var4;
		float var5 = this.entry21;
		this.entry21 = this.entry12;
		this.entry12 = var5;
		this.entry30 = -(this.entry32 * this.entry20 + this.entry10 * var2 + this.entry00 * var1);
		this.entry31 = -(this.entry21 * this.entry32 + this.entry11 * var2 + this.entry01 * var1);
		this.entry32 = -(this.entry22 * this.entry32 + this.entry12 * var2 + this.entry02 * var1);
	}

	@ObfuscatedName("ou.p(FFFF)V")
	public void setToRotation(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.cos((double) arg3);
		float var6 = (float) Math.sin((double) arg3);
		this.entry00 = arg0 * arg0 * (1.0F - var5) + var5;
		this.entry01 = arg0 * arg1 * (1.0F - var5) + arg2 * var6;
		this.entry02 = arg0 * arg2 * (1.0F - var5) + -arg1 * var6;
		this.entry10 = arg0 * arg1 * (1.0F - var5) + -arg2 * var6;
		this.entry11 = arg1 * arg1 * (1.0F - var5) + var5;
		this.entry12 = arg1 * arg2 * (1.0F - var5) + arg0 * var6;
		this.entry20 = arg0 * arg2 * (1.0F - var5) + arg1 * var6;
		this.entry21 = arg1 * arg2 * (1.0F - var5) + -arg0 * var6;
		this.entry22 = arg2 * arg2 * (1.0F - var5) + var5;
		this.entry32 = 0.0F;
		this.entry31 = 0.0F;
		this.entry30 = 0.0F;
	}

	@ObfuscatedName("ou.d(Lov;)V")
	public void setToRotation(Quaternion arg0) {
		this.setToRotationQuaternion(arg0.w, arg0.x, arg0.y, arg0.z);
	}

	@ObfuscatedName("ou.c(FFFF)V")
	public void setToRotationQuaternion(float arg0, float arg1, float arg2, float arg3) {
		float var5 = arg0 * arg0;
		float var6 = arg0 * arg1;
		float var7 = arg0 * arg2;
		float var8 = arg0 * arg3;
		float var9 = arg1 * arg1;
		float var10 = arg1 * arg2;
		float var11 = arg1 * arg3;
		float var12 = arg2 * arg2;
		float var13 = arg2 * arg3;
		this.entry00 = 1.0F - (var9 + var12) * 2.0F;
		this.entry10 = (var6 - var13) * 2.0F;
		this.entry20 = (var7 + var11) * 2.0F;
		this.entry01 = (var6 + var13) * 2.0F;
		this.entry11 = 1.0F - (var5 + var12) * 2.0F;
		this.entry21 = (var10 - var8) * 2.0F;
		this.entry02 = (var7 - var11) * 2.0F;
		this.entry12 = (var8 + var10) * 2.0F;
		this.entry22 = 1.0F - (var5 + var9) * 2.0F;
		this.entry32 = 0.0F;
		this.entry31 = 0.0F;
		this.entry30 = 0.0F;
	}

	@ObfuscatedName("ou.r(F)V")
	public void method6304(float arg0) {
		float var2 = (float) Math.cos((double) arg0);
		float var3 = (float) Math.sin((double) arg0);
		float var4 = this.entry01;
		float var5 = this.entry11;
		float var6 = this.entry21;
		float var7 = this.entry31;
		this.entry01 = var2 * var4 - this.entry02 * var3;
		this.entry02 = this.entry02 * var2 + var3 * var4;
		this.entry11 = var2 * var5 - this.entry12 * var3;
		this.entry12 = this.entry12 * var2 + var3 * var5;
		this.entry21 = var2 * var6 - this.entry22 * var3;
		this.entry22 = this.entry22 * var2 + var3 * var6;
		this.entry31 = var2 * var7 - this.entry32 * var3;
		this.entry32 = this.entry32 * var2 + var3 * var7;
	}

	@ObfuscatedName("ou.v(F)V")
	public void method6305(float arg0) {
		float var2 = (float) Math.cos((double) arg0);
		float var3 = (float) Math.sin((double) arg0);
		float var4 = this.entry00;
		float var5 = this.entry10;
		float var6 = this.entry20;
		float var7 = this.entry30;
		this.entry00 = this.entry02 * var3 + var2 * var4;
		this.entry02 = this.entry02 * var2 - var3 * var4;
		this.entry10 = this.entry12 * var3 + var2 * var5;
		this.entry12 = this.entry12 * var2 - var3 * var5;
		this.entry20 = this.entry22 * var3 + var2 * var6;
		this.entry22 = this.entry22 * var2 - var3 * var6;
		this.entry30 = this.entry32 * var3 + var2 * var7;
		this.entry32 = this.entry32 * var2 - var3 * var7;
	}

	@ObfuscatedName("ou.o(F)V")
	public void method6306(float arg0) {
		float var2 = (float) Math.cos((double) arg0);
		float var3 = (float) Math.sin((double) arg0);
		float var4 = this.entry00;
		float var5 = this.entry10;
		float var6 = this.entry20;
		float var7 = this.entry30;
		this.entry00 = var2 * var4 - this.entry01 * var3;
		this.entry01 = this.entry01 * var2 + var3 * var4;
		this.entry10 = var2 * var5 - this.entry11 * var3;
		this.entry11 = this.entry11 * var2 + var3 * var5;
		this.entry20 = var2 * var6 - this.entry21 * var3;
		this.entry21 = this.entry21 * var2 + var3 * var6;
		this.entry30 = var2 * var7 - this.entry31 * var3;
		this.entry31 = this.entry31 * var2 + var3 * var7;
	}

	@ObfuscatedName("ou.s(FFFF)V")
	public void rotateAroundAxis(float arg0, float arg1, float arg2, float arg3) {
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
		float var16 = this.entry00;
		float var17 = this.entry01;
		float var18 = this.entry10;
		float var19 = this.entry11;
		float var20 = this.entry20;
		float var21 = this.entry21;
		float var22 = this.entry30;
		float var23 = this.entry31;
		this.entry00 = this.entry02 * var13 + var7 * var16 + var10 * var17;
		this.entry01 = this.entry02 * var14 + var8 * var16 + var11 * var17;
		this.entry02 = this.entry02 * var15 + var9 * var16 + var12 * var17;
		this.entry10 = this.entry12 * var13 + var7 * var18 + var10 * var19;
		this.entry11 = this.entry12 * var14 + var8 * var18 + var11 * var19;
		this.entry12 = this.entry12 * var15 + var9 * var18 + var12 * var19;
		this.entry20 = this.entry22 * var13 + var7 * var20 + var10 * var21;
		this.entry21 = this.entry22 * var14 + var8 * var20 + var11 * var21;
		this.entry22 = this.entry22 * var15 + var9 * var20 + var12 * var21;
		this.entry30 = this.entry32 * var13 + var7 * var22 + var10 * var23;
		this.entry31 = this.entry32 * var14 + var8 * var22 + var11 * var23;
		this.entry32 = this.entry32 * var15 + var9 * var22 + var12 * var23;
	}

	@ObfuscatedName("ou.y(Lov;)V")
	public void rotateQuaternion(Quaternion arg0) {
		this.rotateQuaternion(arg0.w, arg0.x, arg0.y, arg0.z);
	}

	@ObfuscatedName("ou.q(FFFF)V")
	public void rotateQuaternion(float arg0, float arg1, float arg2, float arg3) {
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
		float var23 = this.entry00;
		float var24 = this.entry01;
		float var25 = this.entry10;
		float var26 = this.entry11;
		float var27 = this.entry20;
		float var28 = this.entry21;
		float var29 = this.entry30;
		float var30 = this.entry31;
		this.entry00 = this.entry02 * var16 + var14 * var23 + var15 * var24;
		this.entry01 = this.entry02 * var19 + var17 * var23 + var18 * var24;
		this.entry02 = this.entry02 * var22 + var20 * var23 + var21 * var24;
		this.entry10 = this.entry12 * var16 + var14 * var25 + var15 * var26;
		this.entry11 = this.entry12 * var19 + var17 * var25 + var18 * var26;
		this.entry12 = this.entry12 * var22 + var20 * var25 + var21 * var26;
		this.entry20 = this.entry22 * var16 + var14 * var27 + var15 * var28;
		this.entry21 = this.entry22 * var19 + var17 * var27 + var18 * var28;
		this.entry22 = this.entry22 * var22 + var20 * var27 + var21 * var28;
		this.entry30 = this.entry32 * var16 + var14 * var29 + var15 * var30;
		this.entry31 = this.entry32 * var19 + var17 * var29 + var18 * var30;
		this.entry32 = this.entry32 * var22 + var20 * var29 + var21 * var30;
	}

	@ObfuscatedName("ou.x(FFF)V")
	public void setToScale(float arg0, float arg1, float arg2) {
		this.entry00 = arg0;
		this.entry10 = 0.0F;
		this.entry20 = 0.0F;
		this.entry30 = 0.0F;
		this.entry01 = 0.0F;
		this.entry11 = arg1;
		this.entry21 = 0.0F;
		this.entry31 = 0.0F;
		this.entry02 = 0.0F;
		this.entry12 = 0.0F;
		this.entry22 = arg2;
		this.entry32 = 0.0F;
	}

	@ObfuscatedName("ou.b(Lox;)V")
	public void setToScale(Vector3 arg0) {
		this.setToScale(arg0.x, arg0.y, arg0.z);
	}

	@ObfuscatedName("ou.h(FFF)V")
	public void scale(float arg0, float arg1, float arg2) {
		this.entry00 *= arg0;
		this.entry10 *= arg0;
		this.entry20 *= arg0;
		this.entry30 *= arg0;
		this.entry01 *= arg1;
		this.entry11 *= arg1;
		this.entry21 *= arg1;
		this.entry31 *= arg1;
		this.entry02 *= arg2;
		this.entry12 *= arg2;
		this.entry22 *= arg2;
		this.entry32 *= arg2;
	}

	@ObfuscatedName("ou.a(FFF)V")
	public void setToTranslation(float arg0, float arg1, float arg2) {
		this.entry21 = 0.0F;
		this.entry20 = 0.0F;
		this.entry12 = 0.0F;
		this.entry10 = 0.0F;
		this.entry02 = 0.0F;
		this.entry01 = 0.0F;
		this.entry22 = 1.0F;
		this.entry11 = 1.0F;
		this.entry00 = 1.0F;
		this.entry30 = arg0;
		this.entry31 = arg1;
		this.entry32 = arg2;
	}

	@ObfuscatedName("ou.g(Lox;)V")
	public void translate(Vector3 arg0) {
		this.translate(arg0.x, arg0.y, arg0.z);
	}

	@ObfuscatedName("ou.i(FFF)V")
	public void translate(float arg0, float arg1, float arg2) {
		this.entry30 += arg0;
		this.entry31 += arg1;
		this.entry32 += arg2;
	}

	@ObfuscatedName("ou.j(Lou;)V")
	public void method6316(Matrix4x3 arg0) {
		float var2 = this.entry00;
		float var3 = this.entry01;
		float var4 = this.entry10;
		float var5 = this.entry11;
		float var6 = this.entry20;
		float var7 = this.entry21;
		float var8 = this.entry30;
		float var9 = this.entry31;
		float var10 = this.entry02;
		float var11 = this.entry12;
		float var12 = this.entry22;
		float var13 = this.entry32;
		this.entry00 = arg0.entry20 * var10 + arg0.entry10 * var3 + arg0.entry00 * var2;
		this.entry01 = arg0.entry21 * var10 + arg0.entry11 * var3 + arg0.entry01 * var2;
		this.entry02 = arg0.entry22 * var10 + arg0.entry12 * var3 + arg0.entry02 * var2;
		this.entry10 = arg0.entry20 * var11 + arg0.entry10 * var5 + arg0.entry00 * var4;
		this.entry11 = arg0.entry21 * var11 + arg0.entry11 * var5 + arg0.entry01 * var4;
		this.entry12 = arg0.entry22 * var11 + arg0.entry12 * var5 + arg0.entry02 * var4;
		this.entry20 = arg0.entry20 * var12 + arg0.entry10 * var7 + arg0.entry00 * var6;
		this.entry21 = arg0.entry21 * var12 + arg0.entry11 * var7 + arg0.entry01 * var6;
		this.entry22 = arg0.entry22 * var12 + arg0.entry12 * var7 + arg0.entry02 * var6;
		this.entry30 = arg0.entry20 * var13 + arg0.entry10 * var9 + arg0.entry00 * var8 + arg0.entry30;
		this.entry31 = arg0.entry21 * var13 + arg0.entry11 * var9 + arg0.entry01 * var8 + arg0.entry31;
		this.entry32 = arg0.entry22 * var13 + arg0.entry12 * var9 + arg0.entry02 * var8 + arg0.entry32;
	}

	@ObfuscatedName("ou.t(Lou;Lou;)V")
	public void method6317(Matrix4x3 arg0, Matrix4x3 arg1) {
		this.entry00 = arg0.entry02 * arg1.entry20 + arg0.entry01 * arg1.entry10 + arg0.entry00 * arg1.entry00;
		this.entry01 = arg0.entry02 * arg1.entry21 + arg0.entry01 * arg1.entry11 + arg0.entry00 * arg1.entry01;
		this.entry02 = arg0.entry02 * arg1.entry22 + arg0.entry01 * arg1.entry12 + arg0.entry00 * arg1.entry02;
		this.entry10 = arg0.entry12 * arg1.entry20 + arg0.entry11 * arg1.entry10 + arg0.entry10 * arg1.entry00;
		this.entry11 = arg0.entry12 * arg1.entry21 + arg0.entry11 * arg1.entry11 + arg0.entry10 * arg1.entry01;
		this.entry12 = arg0.entry12 * arg1.entry22 + arg0.entry11 * arg1.entry12 + arg0.entry10 * arg1.entry02;
		this.entry20 = arg0.entry22 * arg1.entry20 + arg0.entry21 * arg1.entry10 + arg0.entry20 * arg1.entry00;
		this.entry21 = arg0.entry22 * arg1.entry21 + arg0.entry21 * arg1.entry11 + arg0.entry20 * arg1.entry01;
		this.entry22 = arg0.entry22 * arg1.entry22 + arg0.entry21 * arg1.entry12 + arg0.entry20 * arg1.entry02;
		this.entry30 = arg0.entry32 * arg1.entry20 + arg0.entry31 * arg1.entry10 + arg0.entry30 * arg1.entry00 + arg1.entry30;
		this.entry31 = arg0.entry32 * arg1.entry21 + arg0.entry31 * arg1.entry11 + arg0.entry30 * arg1.entry01 + arg1.entry31;
		this.entry32 = arg0.entry32 * arg1.entry22 + arg0.entry31 * arg1.entry12 + arg0.entry30 * arg1.entry02 + arg1.entry32;
	}

	@ObfuscatedName("ou.ae(FFF[F)V")
	public void method6295(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.entry20 * arg2 + this.entry10 * arg1 + this.entry00 * arg0 + this.entry30;
		arg3[1] = this.entry21 * arg2 + this.entry11 * arg1 + this.entry01 * arg0 + this.entry31;
		arg3[2] = this.entry22 * arg2 + this.entry12 * arg1 + this.entry02 * arg0 + this.entry32;
	}

	@ObfuscatedName("ou.ag(FFF[F)V")
	public void method6319(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = arg0 - this.entry30;
		float var6 = arg1 - this.entry31;
		float var7 = arg2 - this.entry32;
		arg3[0] = (float) (this.entry02 * var7 + this.entry01 * var6 + this.entry00 * var5);
		arg3[1] = (float) (this.entry12 * var7 + this.entry11 * var6 + this.entry10 * var5);
		arg3[2] = (float) (this.entry22 * var7 + this.entry21 * var6 + this.entry20 * var5);
	}

	@ObfuscatedName("ou.ah([F)V")
	public void method6320(float[] arg0) {
		float var2 = arg0[0] - this.entry30;
		float var3 = arg0[1] - this.entry31;
		float var4 = arg0[2] - this.entry32;
		arg0[0] = (float) (this.entry02 * var4 + this.entry01 * var3 + this.entry00 * var2);
		arg0[1] = (float) (this.entry12 * var4 + this.entry11 * var3 + this.entry10 * var2);
		arg0[2] = (float) (this.entry22 * var4 + this.entry21 * var3 + this.entry20 * var2);
	}

	@ObfuscatedName("ou.al([F)V")
	public void method6321(float[] arg0) {
		float var2 = arg0[0];
		float var3 = arg0[1];
		float var4 = arg0[2];
		arg0[0] = this.entry02 * var4 + this.entry01 * var3 + this.entry00 * var2;
		arg0[1] = this.entry12 * var4 + this.entry11 * var3 + this.entry10 * var2;
		arg0[2] = this.entry22 * var4 + this.entry21 * var3 + this.entry20 * var2;
	}

	@ObfuscatedName("ou.ac([F)[F")
	public float[] getTranslation(float[] arg0) {
		arg0[0] = this.entry30;
		arg0[1] = this.entry31;
		arg0[2] = this.entry32;
		return arg0;
	}

	@ObfuscatedName("ou.ai([F)[F")
	public float[] getMatrix3x3(float[] arg0) {
		arg0[0] = this.entry00;
		arg0[1] = this.entry01;
		arg0[2] = this.entry02;
		arg0[3] = this.entry10;
		arg0[4] = this.entry11;
		arg0[5] = this.entry12;
		arg0[6] = this.entry20;
		arg0[7] = this.entry21;
		arg0[8] = this.entry22;
		return arg0;
	}

	public String toString() {
		return this.entry00 + "," + this.entry10 + "," + this.entry20 + "," + this.entry30 + "\n" + this.entry01 + "," + this.entry11 + "," + this.entry21 + "," + this.entry31 + "\n" + this.entry02 + "," + this.entry12 + "," + this.entry22 + "," + this.entry32;
	}
}
