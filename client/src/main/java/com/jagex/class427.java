package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ph")
public class class427 {

	@ObfuscatedName("ph.e")
	public final class423[] field4323 = new class423[4];

	@ObfuscatedName("ph.n")
	public float field4322;

	@ObfuscatedName("ph.m")
	public float[] field4321;

	public class427() {
		for (int var1 = 0; var1 < 4; var1++) {
			this.field4323[var1] = new class423();
		}
		this.method6739();
	}

	@ObfuscatedName("ph.e()V")
	public void method6739() {
		this.field4322 = -1.0F;
		this.field4321 = null;
	}

	@ObfuscatedName("ph.n(ILox;)V")
	public void method6740(int arg0, class423 arg1) {
		this.field4323[arg0].method6492(arg1);
		this.method6739();
	}

	@ObfuscatedName("ph.m(I)Lox;")
	public class423 method6748(int arg0) {
		return this.field4323[arg0];
	}

	@ObfuscatedName("ph.k(F)[D")
	public double[] method6755(float arg0) {
		double[] var2 = new double[3];
		float var3 = arg0 * arg0;
		float var4 = arg0 * var3;
		double var5 = (double) ((this.field4323[1].field4308 - this.field4323[0].field4308) * 3.0F);
		double var7 = (double) ((this.field4323[2].field4308 - this.field4323[1].field4308) * 3.0F) - var5;
		double var9 = (double) (this.field4323[3].field4308 - this.field4323[0].field4308) - var5 - var7;
		var2[0] = (double) arg0 * var5 + (double) var3 * var7 + (double) var4 * var9 + (double) this.field4323[0].field4308;
		double var11 = (double) ((this.field4323[1].field4311 - this.field4323[0].field4311) * 3.0F);
		double var13 = (double) ((this.field4323[2].field4311 - this.field4323[1].field4311) * 3.0F) - var11;
		double var15 = (double) (this.field4323[3].field4311 - this.field4323[0].field4311) - var11 - var13;
		var2[1] = (double) arg0 * var11 + (double) var3 * var13 + (double) var4 * var15 + (double) this.field4323[0].field4311;
		double var17 = (double) ((this.field4323[1].field4313 - this.field4323[0].field4313) * 3.0F);
		double var19 = (double) ((this.field4323[2].field4313 - this.field4323[1].field4313) * 3.0F) - var17;
		double var21 = (double) (this.field4323[3].field4313 - this.field4323[0].field4313) - var17 - var19;
		var2[2] = (double) arg0 * var17 + (double) var3 * var19 + (double) var4 * var21 + (double) this.field4323[0].field4313;
		return var2;
	}

	@ObfuscatedName("ph.f()F")
	public float method6743() {
		if (this.field4322 == -1.0F) {
			this.method6745();
		}
		return this.field4322;
	}

	@ObfuscatedName("ph.w(F)F")
	public float method6744(float arg0) {
		if (this.field4322 == -1.0F) {
			this.method6745();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.field4322) {
			return 1.0F;
		} else {
			float var2 = 0.0F;
			float var3 = this.field4321[0];
			for (int var4 = 1; var4 < this.field4321.length; var4++) {
				if (arg0 < var3) {
					float var5 = (arg0 - var2) / (var3 - var2);
					float var6 = (float) (var4 - 1) / (float) this.field4321.length;
					float var7 = (float) var4 / (float) this.field4321.length;
					return (var7 - var6) * var5 + var6;
				}
				var2 = var3;
				var3 += this.field4321[var4];
			}
			float var8 = (arg0 - var2) / (var3 - var2);
			float var9 = (float) (this.field4321.length - 1) / (float) this.field4321.length;
			return (1.0F - var9) * var8 + var9;
		}
	}

	@ObfuscatedName("ph.l()V")
	public void method6745() {
		byte var1 = 20;
		double[] var2 = this.method6755(0.0F);
		float var3 = 0.0F;
		class423 var4 = class423.method6482();
		for (int var5 = 1; var5 <= var1; var5++) {
			double[] var6 = this.method6755((float) var5 / (float) var1);
			var4.field4308 = (float) (var6[0] - var2[0]);
			var4.field4311 = (float) (var6[1] - var2[1]);
			var4.field4313 = (float) (var6[2] - var2[2]);
			var3 += var4.method6519();
			var2 = var6;
		}
		int var7 = (int) (var3 / 20.0F);
		if (var7 < var1) {
			var7 = var1;
		}
		this.field4321 = new float[var7];
		double[] var8 = this.method6755(0.0F);
		float var9 = 0.0F;
		for (int var10 = 1; var10 <= var7; var10++) {
			double[] var11 = this.method6755((float) var10 / (float) var7);
			var4.field4308 = (float) (var11[0] - var8[0]);
			var4.field4311 = (float) (var11[1] - var8[1]);
			var4.field4313 = (float) (var11[2] - var8[2]);
			float var12 = var4.method6519();
			var9 += var12;
			this.field4321[var10 - 1] = var12;
			var8 = var11;
		}
		this.field4322 = var9;
	}
}
