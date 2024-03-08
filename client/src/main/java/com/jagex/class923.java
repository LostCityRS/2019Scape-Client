package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aia")
public class class923 extends class333 {

	@ObfuscatedName("aia.m")
	public class238 field10645;

	@ObfuscatedName("aia.k")
	public class234 field10641;

	@ObfuscatedName("aia.f")
	public class1150 field10649;

	@ObfuscatedName("aia.w")
	public class1150 field10652;

	@ObfuscatedName("aia.l")
	public class1150 field10644;

	@ObfuscatedName("aia.u")
	public class1150 field10646;

	@ObfuscatedName("aia.z")
	public class1150 field10648;

	@ObfuscatedName("aia.p")
	public static float field10647 = 1.0F;

	@ObfuscatedName("aia.d")
	public static float field10642 = 0.0F;

	@ObfuscatedName("aia.c")
	public static float field10643 = 1.0F;

	@ObfuscatedName("aia.r")
	public static float field10650 = 0.0F;

	@ObfuscatedName("aia.v")
	public static float field10651 = 1.0F;

	@ObfuscatedName("aia.o")
	public boolean field10640;

	public class923(class850 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aia.e()Z")
	public boolean method5558() {
		return this.field3242.field10159 && this.field3242.method15958();
	}

	@ObfuscatedName("aia.n()Z")
	public boolean method5559() {
		return this.field10640;
	}

	@ObfuscatedName("aia.m()Z")
	public boolean method5572() {
		if (!this.method5558()) {
			return false;
		}
		this.field10645 = this.field3242.method15964("FilterLevels");
		if (this.field10645 == null) {
			return false;
		}
		try {
			this.field10649 = this.field10645.method4157("sceneTex");
			this.field10652 = this.field10645.method4157("paramsGamma");
			this.field10644 = this.field10645.method4157("paramsRanges");
			this.field10646 = this.field10645.method4157("pixelOffset");
			this.field10648 = this.field10645.method4157("PosAndTexCoords");
			this.field10641 = this.field10645.method4227("techAdjust");
		} catch (class1212 var3) {
			return false;
		} catch (class1213 var4) {
			return false;
		}
		if (this.field10641.method4083()) {
			this.field10640 = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aia.w(II)V")
	public void method5574(int arg0, int arg1) {
	}

	@ObfuscatedName("aia.f()V")
	public void method5562() {
	}

	@ObfuscatedName("aia.z()I")
	public int method5566() {
		return 1;
	}

	@ObfuscatedName("aia.l(ILafq;Llz;Ldw;Llz;Z)V")
	public void method5564(int arg0, class840 arg1, class341 arg2, class126 arg3, class341 arg4, boolean arg5) {
		float var7 = this.field3242.method15954();
		float var8 = (float) arg1.method1627();
		float var9 = (float) arg1.method1628();
		float var10 = var7 * 2.0F / var8;
		float var11 = -var7 * 2.0F / var9;
		float[] var12 = new float[] { var10 + -1.0F, var11 + 1.0F, 0.0F, 0.0F, var10 + -1.0F, var11 + -3.0F, 0.0F, 2.0F, var10 + 3.0F, var11 + 1.0F, 2.0F, 0.0F };
		int var13 = (int) var8;
		int var14 = (int) var9;
		int var15 = arg5 ? this.field3242.method2136().method1627() : var13;
		int var16 = arg5 ? this.field3242.method2136().method1628() : var14;
		this.field10645.method4162(this.field10641);
		this.field10645.method4244();
		float var17 = (float) var13 / var8;
		float var18 = (float) var14 / var9;
		float var19 = (float) var15 / var8;
		float var20 = (float) var16 / var9;
		var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
		var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
		var12[10] *= var19;
		var12[7] *= var20;
		this.field10645.method4172(this.field10648, var12);
		this.field10645.method4252(this.field10649, 0, arg2);
		this.field10645.method4268(this.field10652, field10647);
		this.field10645.method4169(this.field10644, field10642, field10643, field10650, field10651);
		this.field10645.method4169(this.field10646, 0.0F, 0.0F, 0.0F, 0.0F);
		this.field3242.method2164(0, 0, var13, var14);
	}

	@ObfuscatedName("aia.u(I)V")
	public void method5565(int arg0) {
		this.field10645.method4214();
	}

	@ObfuscatedName("aia.d()I")
	public int method5568() {
		return 0;
	}

	@ObfuscatedName("aia.p()I")
	public int method5567() {
		return 1;
	}

	@ObfuscatedName("aia.v()Z")
	public boolean method5571() {
		return field10647 == 1.0F && field10642 == 0.0F && field10643 == 1.0F && field10650 == 0.0F && field10651 == 1.0F;
	}
}
