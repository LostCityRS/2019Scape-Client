package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aii")
public class class922 extends class333 {

	@ObfuscatedName("aii.k")
	public static float field10623 = 0.25F;

	@ObfuscatedName("aii.f")
	public static float field10624 = 1.0F;

	@ObfuscatedName("aii.w")
	public static float field10625 = 1.0F;

	@ObfuscatedName("aii.l")
	public static float field10626 = 1.0F;

	@ObfuscatedName("aii.u")
	public class238 field10627;

	@ObfuscatedName("aii.z")
	public class234 field10628;

	@ObfuscatedName("aii.p")
	public class234 field10632;

	@ObfuscatedName("aii.d")
	public class234 field10622;

	@ObfuscatedName("aii.c")
	public class234 field10631;

	@ObfuscatedName("aii.r")
	public class234 field10637;

	@ObfuscatedName("aii.v")
	public class1150 field10633;

	@ObfuscatedName("aii.o")
	public class1150 field10634;

	@ObfuscatedName("aii.s")
	public class1150 field10630;

	@ObfuscatedName("aii.y")
	public class1150 field10636;

	@ObfuscatedName("aii.q")
	public class1150 field10629;

	@ObfuscatedName("aii.x")
	public class1150 field10635;

	@ObfuscatedName("aii.b")
	public boolean field10639;

	public class922(class850 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aii.e()Z")
	public boolean method5558() {
		return this.field3242.field10159 && this.field3242.method15958() && this.field3242.method15959(true);
	}

	@ObfuscatedName("aii.n()Z")
	public boolean method5559() {
		return this.field10639;
	}

	@ObfuscatedName("aii.m()Z")
	public boolean method5572() {
		if (!this.method5558()) {
			return false;
		}
		this.field10627 = this.field3242.method15964("FilterBloom");
		if (this.field10627 == null) {
			return false;
		}
		try {
			this.field10633 = this.field10627.method4157("sceneTex");
			this.field10634 = this.field10627.method4157("bloomTex1");
			this.field10630 = this.field10627.method4157("params");
			this.field10636 = this.field10627.method4157("sampleSize");
			this.field10629 = this.field10627.method4157("pixelOffsetAndBloomScale");
			this.field10635 = this.field10627.method4157("PosAndTexCoords");
			this.field10627.method4227("test");
			this.field10628 = this.field10627.method4227("techFullscreenTri");
			this.field10632 = this.field10627.method4227("brightpass");
			this.field10622 = this.field10627.method4227("blur");
			this.field10631 = this.field10627.method4227("composite");
			this.field10637 = this.field10627.method4227("techDefault");
		} catch (class1212 var3) {
			return false;
		} catch (class1213 var4) {
			return false;
		}
		if (!this.field10628.method4083()) {
			return false;
		} else if (!this.field10632.method4083()) {
			return false;
		} else if (!this.field10622.method4083()) {
			return false;
		} else if (!this.field10631.method4083()) {
			return false;
		} else if (this.field10637.method4083()) {
			this.field10639 = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aii.w(II)V")
	public void method5574(int arg0, int arg1) {
	}

	@ObfuscatedName("aii.f()V")
	public void method5562() {
	}

	@ObfuscatedName("aii.z()I")
	public int method5566() {
		return 4;
	}

	@ObfuscatedName("aii.l(ILafq;Llz;Ldw;Llz;Z)V")
	public void method5564(int arg0, class840 arg1, class341 arg2, class126 arg3, class341 arg4, boolean arg5) {
		float var7 = this.field3242.method15954();
		float var8 = (float) arg1.method1627();
		float var9 = (float) arg1.method1628();
		class341 var10 = arg2;
		float var11 = var7 * 2.0F / var8;
		float var12 = -var7 * 2.0F / var9;
		float[] var13 = new float[] { var11 + -1.0F, var12 + 1.0F, 0.0F, 0.0F, var11 + -1.0F, var12 + -3.0F, 0.0F, 2.0F, var11 + 3.0F, var12 + 1.0F, 2.0F, 0.0F };
		int var14 = (int) var8;
		int var15 = (int) var9;
		int var16 = arg5 ? this.field3242.method2136().method1627() : var14;
		int var17 = arg5 ? this.field3242.method2136().method1628() : var15;
		if (arg0 == 0) {
			var14 = 256;
			var15 = 256;
			this.field10627.method4162(this.field10632);
			this.field10627.method4244();
		} else if (arg0 == 1) {
			var14 = 256;
			var15 = 256;
			var16 = var14;
			var17 = var15;
			this.field10627.method4162(this.field10622);
			this.field10627.method4244();
			this.field10627.method4167(this.field10636, field10626 / var8, 0.0F);
		} else if (arg0 == 2) {
			var14 = 256;
			var15 = 256;
			var16 = var14;
			var17 = var15;
			this.field10627.method4162(this.field10622);
			this.field10627.method4244();
			this.field10627.method4167(this.field10636, 0.0F, field10626 / var9);
		} else if (arg0 == 3) {
			this.field10627.method4162(this.field10631);
			var10 = arg4;
			this.field10627.method4252(this.field10634, 1, arg2);
			this.field10627.method4244();
		}
		float var18 = (float) var14 / var8;
		float var19 = (float) var15 / var9;
		float var20 = (float) var16 / var8;
		float var21 = (float) var17 / var9;
		var13[8] = (var13[8] + 1.0F) * var18 - 1.0F;
		var13[5] = (var13[5] - 1.0F) * var19 + 1.0F;
		var13[10] *= var20;
		var13[7] *= var21;
		this.field10627.method4172(this.field10635, var13);
		this.field10627.method4252(this.field10633, 0, var10);
		this.field10627.method4169(this.field10630, field10625, field10623, field10624, 0.0F);
		this.field10627.method4169(this.field10629, 0.0F, 0.0F, 256.0F / var8, 256.0F / var9);
		this.field3242.method2164(0, 0, var14, var15);
	}

	@ObfuscatedName("aii.u(I)V")
	public void method5565(int arg0) {
		this.field10627.method4214();
	}

	@ObfuscatedName("aii.d()I")
	public int method5568() {
		return 1;
	}

	@ObfuscatedName("aii.p()I")
	public int method5567() {
		return 0;
	}

	@ObfuscatedName("aii.v()Z")
	public boolean method5571() {
		return false;
	}
}
