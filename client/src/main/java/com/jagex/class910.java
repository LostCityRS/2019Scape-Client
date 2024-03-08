package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ahd")
public class class910 extends class307 {

	@ObfuscatedName("ahd.n")
	public class273 field10552;

	@ObfuscatedName("ahd.m")
	public final class423 field10553 = new class423();

	@ObfuscatedName("ahd.k")
	public final class421 field10554 = new class421();

	@ObfuscatedName("ahd.f")
	public boolean field10556;

	@ObfuscatedName("ahd.w")
	public int field10561 = 200;

	@ObfuscatedName("ahd.l")
	public int field10557;

	@ObfuscatedName("ahd.u")
	public final class423 field10558 = new class423(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("ahd.z")
	public final class423 field10559 = new class423(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("ahd.p")
	public final class423 field10560 = new class423();

	@ObfuscatedName("ahd.d")
	public final class421 field10555 = new class421();

	public class910(class274 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahd.t(Ljn;Lox;Lov;ZI[[[ILqx;III)V")
	public void method16683(class273 arg0, class423 arg1, class421 arg2, boolean arg3, int arg4, int[][][] arg5, class451 arg6, int arg7, int arg8) {
		this.field10552 = arg0;
		this.field10553.method6492(arg1);
		this.field10554.method6412(arg2);
		this.field10556 = arg3;
		this.field10561 = arg4;
		this.field10557 = this.field10552.method4667().field11477;
		this.method16686(arg5, arg6, arg7, arg8);
	}

	@ObfuscatedName("ahd.ae(B)V")
	public void method16684() {
		if (this.field10552 != null) {
			this.field10552 = this.field3084.method4697().method268(this.field10552.method4675(), this.field10552.method4670());
		}
	}

	@ObfuscatedName("ahd.e(F[[[ILqx;IIB)V")
	public void method5238(float arg0, int[][][] arg1, class451 arg2, int arg3, int arg4) {
		if (this.field10552 == null) {
			return;
		}
		this.method16686(arg1, arg2, arg3, arg4);
		class421 var6 = this.method16685();
		this.field10555.method6428(var6, this.field3084.method4724());
		if (Float.isNaN(this.field10555.field4301)) {
			this.field10555.method6412(var6);
		}
		var6.method6407();
		this.field10559.method6492(this.field10552.method4667().method17853());
		this.field3084.method4807(true, arg0, this.field10558, this.field3084.method4721(), this.field10559, this.field10560);
	}

	@ObfuscatedName("ahd.ag(B)Lov;")
	public class421 method16685() {
		class421 var1 = class421.method6443(this.field10554);
		if (this.field10556) {
			class423 var2 = this.field10552.method4666();
			if (var2.method6519() < (float) this.field10561) {
				var2 = class423.method6483(0.0F, 0.0F, 1.0F);
				class421 var3 = this.field10552.method4668();
				var2.method6526(var3);
			}
			var2.field4311 = 0.0F;
			float var4 = (float) Math.atan2((double) var2.field4308, (double) var2.field4313);
			var2.method6486();
			class421 var5 = new class421();
			var5.method6414(0.0F, 1.0F, 0.0F, var4);
			var1.method6424(var5);
		}
		return var1;
	}

	@ObfuscatedName("ahd.ah([[[ILqx;IIB)V")
	public void method16686(int[][][] arg0, class451 arg1, int arg2, int arg3) {
		if (!this.method5218() || !this.field3084.method4730() && !this.field3084.method4731()) {
			return;
		}
		class994 var5 = this.field10552.method4667();
		this.field10557 = var5.field11477;
		int var6 = this.field10557;
		boolean var7 = true;
		if (this.field10557 == 3) {
			var7 = false;
		} else if (arg1 != null && arg1.method7105(var5.field11478 - arg2 >> 9, var5.field11480 - arg3 >> 9)) {
			var6 = this.field10557 + 1;
			var7 = false;
		}
		if (!this.field3084.method4731() || arg0 == null) {
			return;
		}
		float var8 = this.method16687(arg0, arg1, arg2, arg3, var6, var7);
		if (Float.isNaN(var8)) {
			return;
		}
		if (var8 <= 0.0F) {
			return;
		}
		float var9 = 3.1415927F;
		class423 var10 = class423.method6483(0.0F, 0.0F, 1.0F);
		var10.method6526(this.field10554);
		class423 var11 = class423.method6483(var10.field4308, 0.0F, var10.field4313);
		var11.method6513();
		float var12 = class423.method6503(var10, var11);
		for (int var13 = 0; var13 < 10; var13++) {
			float var14 = (var9 + var12) / 2.0F - var12;
			float var15 = var14;
			if (var8 > 0.0F) {
				var15 = var14 * -1.0F;
			}
			class423 var16 = class423.method6483(1.0F, 0.0F, 0.0F);
			var16.method6526(this.field10554);
			class421 var17 = class421.method6469();
			var17.method6413(var16, var15);
			this.field10554.method6424(var17);
			this.field10554.method6447();
			var16.method6486();
			var17.method6407();
			var8 = this.method16687(arg0, arg1, arg2, arg3, var6, var7);
			if (Float.isNaN(var8)) {
				return;
			}
			if (var8 > 0.0F) {
				var12 += var14;
			} else {
				var9 -= var14;
			}
		}
	}

	@ObfuscatedName("ahd.al([[[ILqx;IIIZI)F")
	public float method16687(int[][][] arg0, class451 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		class421 var7 = this.method16685();
		class423 var8 = this.method16696(var7);
		var7.method6407();
		int var9 = (int) var8.field4308 - arg2 >> 9;
		int var10 = (int) var8.field4313 - arg3 >> 9;
		if (var9 < 0 || var10 < 0 || var9 + 1 >= arg0[0].length || var10 + 1 >= arg0[0][0].length) {
			var8.method6486();
			return Float.NaN;
		}
		int var11 = arg4;
		if (arg5 && arg1.method7105(var9, var10)) {
			var11 = arg4 + 1;
		}
		long var12 = (long) var8.field4308 % 512L;
		long var14 = (long) var8.field4313 % 512L;
		long var16 = (512L - var12) * (long) arg0[var11][var9][var10] * (512L - var14);
		long var18 = (long) arg0[var11][var9 + 1][var10] * var12 * (512L - var14) + var16;
		long var20 = (512L - var12) * (long) arg0[var11][var9][var10 + 1] * var14 + var18;
		long var22 = (long) arg0[var11][var9 + 1][var10 + 1] * var12 * var14 + var20;
		long var24 = var22 / 262144L;
		long var26 = var24 - 1024L;
		float var28 = (float) -var26 - var8.field4311;
		var8.method6486();
		return var28;
	}

	@ObfuscatedName("ahd.ac(Lov;I)Lox;")
	public class423 method16696(class421 arg0) {
		class423 var2 = class423.method6484(this.field10553);
		var2.method6526(arg0);
		class423 var3 = class423.method6499(this.field10559, var2);
		var2.method6486();
		return var3;
	}

	@ObfuscatedName("ahd.n(I)Z")
	public boolean method5218() {
		return !Float.isNaN(this.field10558.field4308);
	}

	@ObfuscatedName("ahd.m(B)Lox;")
	public class423 method5219() {
		class423 var1 = class423.method6484(this.field10553);
		var1.method6526(this.field10555);
		class423 var2 = class423.method6499(this.field10558, var1);
		var1.method6486();
		return var2;
	}

	@ObfuscatedName("ahd.k(I)[D")
	public double[] method5230() {
		double[] var1 = new double[3];
		class423 var2 = this.method5219();
		var1[0] = var2.field4308;
		var1[1] = var2.field4311;
		var1[2] = var2.field4313;
		return var1;
	}

	@ObfuscatedName("ahd.f(B)Lakt;")
	public class994 method5221() {
		class423 var1 = this.method5219();
		class994 var2 = new class994(this.field10557, (int) var1.field4308, (int) var1.field4311, (int) var1.field4313);
		var1.method6486();
		return var2;
	}

	@ObfuscatedName("ahd.ai(I)Lox;")
	public class423 method16691() {
		return this.field10558;
	}

	@ObfuscatedName("ahd.aw(I)Lox;")
	public class423 method16692() {
		return this.field10553;
	}

	@ObfuscatedName("ahd.as(B)F")
	public float method16693() {
		return class688.method16445(this.field10554);
	}

	@ObfuscatedName("ahd.at(I)F")
	public float method16694() {
		return class688.method4498(this.field10554);
	}

	@ObfuscatedName("ahd.w(I)F")
	public float method5222() {
		return 0.0F;
	}

	@ObfuscatedName("ahd.l(Lju;IIB)V")
	public void method5223(class270 arg0, int arg1, int arg2) {
		class423 var4 = this.method5219();
		arg0.field2835 = (int) var4.field4308 - arg1;
		arg0.field2836 = (int) -var4.field4311;
		arg0.field2837 = (int) var4.field4313 - arg2;
		var4.method6486();
	}

	@ObfuscatedName("ahd.u(Lalw;I)V")
	public void method5224(class997 arg0) {
		class272 var2 = Statics.method15213(arg0.method17904());
		int var3 = arg0.method17906();
		this.field10553.method6490(arg0);
		this.field10554.method6410(arg0);
		if (arg0.method17904() == 1) {
			this.field10556 = true;
		} else {
			this.field10556 = false;
		}
		this.field10561 = arg0.method17906();
		this.field10552 = this.field3084.method4697().method268(var2, var3);
	}
}
