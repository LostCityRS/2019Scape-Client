package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ael")
public abstract class class829 extends class101 {

	@ObfuscatedName("ael.e")
	public class848 field9373;

	@ObfuscatedName("ael.n")
	public int field9356;

	@ObfuscatedName("ael.m")
	public int field9372;

	@ObfuscatedName("ael.k")
	public int field9358;

	@ObfuscatedName("ael.f")
	public int field9359;

	@ObfuscatedName("ael.w")
	public int field9355;

	@ObfuscatedName("ael.l")
	public int field9360;

	@ObfuscatedName("ael.u")
	public int[] field9362;

	@ObfuscatedName("ael.ah")
	public static int field9383 = 0;

	@ObfuscatedName("ael.al")
	public static int field9366 = 0;

	@ObfuscatedName("ael.ac")
	public static int field9382 = 0;

	@ObfuscatedName("ael.ai")
	public static int field9386 = 0;

	@ObfuscatedName("ael.aw")
	public static int field9387 = 0;

	@ObfuscatedName("ael.as")
	public static int field9388 = 0;

	@ObfuscatedName("ael.at")
	public static int field9390 = 0;

	@ObfuscatedName("ael.ad")
	public static int field9379 = 0;

	public class829(class848 arg0, int arg1, int arg2) {
		this.field9373 = arg0;
		this.field9356 = arg1;
		this.field9372 = arg2;
	}

	@ObfuscatedName("ael.e(IIII)V")
	public void method1431(int arg0, int arg1, int arg2, int arg3) {
		this.field9358 = arg0;
		this.field9359 = arg1;
		this.field9355 = arg2;
		this.field9360 = arg3;
	}

	@ObfuscatedName("ael.n([I)V")
	public void method1432(int[] arg0) {
		arg0[0] = this.field9358;
		arg0[1] = this.field9359;
		arg0[2] = this.field9355;
		arg0[3] = this.field9360;
	}

	@ObfuscatedName("ael.m()I")
	public int method1459() {
		return this.field9356;
	}

	@ObfuscatedName("ael.f()I")
	public int method1435() {
		return this.field9372;
	}

	@ObfuscatedName("ael.k()I")
	public int method1434() {
		return this.field9358 + this.field9356 + this.field9355;
	}

	@ObfuscatedName("ael.w()I")
	public int method1436() {
		return this.field9372 + this.field9359 + this.field9360;
	}

	@ObfuscatedName("ael.x(IIIIIII)V")
	public void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.field9373.method15654()) {
			throw new IllegalStateException();
		}
		if (this.field9362 == null) {
			this.field9362 = new int[4];
		}
		this.field9373.method2171(this.field9362);
		this.field9373.method2161(this.field9373.field9805, this.field9373.field9784, arg0 + arg2, arg1 + arg3);
		int var8 = this.method1434();
		int var9 = this.method1436();
		int var10 = (arg2 + var8 - 1) / var8;
		int var11 = (arg3 + var9 - 1) / var9;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = var9 * var12;
			for (int var14 = 0; var14 < var10; var14++) {
				this.method1443(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
			}
		}
		this.field9373.method2168(this.field9362[0], this.field9362[1], this.field9362[2], this.field9362[3]);
	}

	@ObfuscatedName("ael.cg(FFFFFF)Z")
	public boolean method15366(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		int var7 = this.field9358 + this.field9356 + this.field9355;
		int var8 = this.field9372 + this.field9359 + this.field9360;
		if (this.field9356 != var7 || this.field9372 != var8) {
			float var9 = (arg2 - arg0) / (float) var7;
			float var10 = (arg3 - arg1) / (float) var7;
			float var11 = (arg4 - arg0) / (float) var8;
			float var12 = (arg5 - arg1) / (float) var8;
			float var13 = (float) this.field9359 * var11;
			float var14 = (float) this.field9359 * var12;
			float var15 = (float) this.field9358 * var9;
			float var16 = (float) this.field9358 * var10;
			float var17 = (float) this.field9355 * -var9;
			float var18 = (float) this.field9355 * -var10;
			float var19 = (float) this.field9360 * -var11;
			float var20 = (float) this.field9360 * -var12;
			arg0 += var13 + var15;
			arg1 += var14 + var16;
			arg2 += var13 + var17;
			arg3 += var14 + var18;
			arg4 += var15 + var19;
			arg5 += var16 + var20;
		}
		float var21 = arg2 - arg0 + arg4;
		float var22 = arg5 - arg1 + arg3;
		float var23;
		float var24;
		if (arg0 < arg2) {
			var23 = arg0;
			var24 = arg2;
		} else {
			var23 = arg2;
			var24 = arg0;
		}
		if (arg4 < var23) {
			var23 = arg4;
		}
		if (var21 < var23) {
			var23 = var21;
		}
		if (arg4 > var24) {
			var24 = arg4;
		}
		if (var21 > var24) {
			var24 = var21;
		}
		float var25;
		float var26;
		if (arg1 < arg3) {
			var25 = arg1;
			var26 = arg3;
		} else {
			var25 = arg3;
			var26 = arg1;
		}
		if (arg5 < var25) {
			var25 = arg5;
		}
		if (var22 < var25) {
			var25 = var22;
		}
		if (arg5 > var26) {
			var26 = arg5;
		}
		if (var22 > var26) {
			var26 = var22;
		}
		if (var23 < (float) this.field9373.field9805) {
			var23 = this.field9373.field9805;
		}
		if (var24 > (float) this.field9373.field9801) {
			var24 = this.field9373.field9801;
		}
		if (var25 < (float) this.field9373.field9784) {
			var25 = this.field9373.field9784;
		}
		if (var26 > (float) this.field9373.field9785) {
			var26 = this.field9373.field9785;
		}
		float var27 = var23 - var24;
		if (var27 >= 0.0F) {
			return false;
		}
		float var28 = var25 - var26;
		if (var28 >= 0.0F) {
			return false;
		}
		Statics.field9370 = this.field9373.field9779;
		Statics.field9371 = (int) ((float) ((int) var25 * Statics.field9370) + var23);
		float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
		float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
		Statics.field9357 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field9356 / var29);
		Statics.field9375 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field9372 / var30);
		Statics.field9374 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field9356 / var30);
		Statics.field9384 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field9372 / var29);
		Statics.field9376 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
		Statics.field9377 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
		Statics.field9378 = (this.field9356 >> 1 << 12) + (Statics.field9377 * Statics.field9374 >> 4);
		Statics.field9389 = (this.field9372 >> 1 << 12) + (Statics.field9384 * Statics.field9377 >> 4);
		Statics.field9380 = Statics.field9376 * Statics.field9357 >> 4;
		Statics.field9381 = Statics.field9376 * Statics.field9375 >> 4;
		Statics.field9385 = (int) var23;
		Statics.field9367 = (int) var27;
		Statics.field9368 = (int) var25;
		Statics.field9369 = (int) var28;
		return true;
	}

	@ObfuscatedName("ael.ag(FFFFFFIIII)V")
	public void method1433(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.field9373.method15654()) {
			throw new IllegalStateException();
		} else if (this.method15366(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Statics.field9361 = arg7;
			if (arg6 != 1) {
				field9383 = arg7 >>> 24;
				field9366 = 256 - field9383;
				if (arg6 == 0) {
					field9382 = arg7 >> 16 & 0xFF;
					field9386 = arg7 >> 8 & 0xFF;
					field9387 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					field9388 = arg7 >>> 24;
					field9390 = 256 - field9388;
					int var11 = (arg7 & 0xFF00FF) * field9390 & 0xFF00FF00;
					int var12 = (arg7 & 0xFF00) * field9390 & 0xFF0000;
					field9379 = (var11 | var12) >>> 8;
				}
			}
			this.method15354(arg6, arg8);
		}
	}

	@ObfuscatedName("ael.al(FFFFFFILch;II)V")
	public void method1454(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class103 arg7, int arg8, int arg9) {
		if (this.field9373.method15654()) {
			throw new IllegalStateException();
		} else if (this.method15366(arg0, arg1, arg2, arg3, arg4, arg5)) {
			class832 var11 = (class832) arg7;
			this.method15356(var11.field9414, var11.field9415, Statics.field9385 - arg8, -arg9 - (Statics.field9369 - Statics.field9368));
		}
	}

	@ObfuscatedName("ael.ce(II)V")
	public abstract void method15354(int arg0, int arg1);

	@ObfuscatedName("ael.v(IILch;II)V")
	public abstract void method1444(int arg0, int arg1, class103 arg2, int arg3, int arg4);

	@ObfuscatedName("ael.y(IIIIIIII)V")
	public abstract void method1447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	@ObfuscatedName("ael.u(IIII[III)V")
	public abstract void method1469(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6);

	@ObfuscatedName("ael.cu([I[III)V")
	public abstract void method15356(int[] arg0, int[] arg1, int arg2, int arg3);

	@ObfuscatedName("ael.cl(ZZZIIFIIIIIIZ)V")
	public abstract void method15358(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12);

	@ObfuscatedName("ael.r(IIIII)V")
	public abstract void method1443(int arg0, int arg1, int arg2, int arg3, int arg4);
}
