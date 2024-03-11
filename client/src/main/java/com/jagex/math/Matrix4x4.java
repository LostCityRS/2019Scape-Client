package com.jagex.math;

import com.jagex.Packet;
import com.jagex.Trig1;
import com.jagex.Trig2;
import deob.ObfuscatedName;
import deob.Statics;

import java.util.Arrays;

@ObfuscatedName("pq")
public final class Matrix4x4 {

	@ObfuscatedName("pq.n")
	public static Matrix4x4[] field4316 = new Matrix4x4[0];

	@ObfuscatedName("pq.f")
	public static final Matrix4x4 field4317 = new Matrix4x4();

	@ObfuscatedName("pq.w")
	public float[] field4315 = new float[16];

	@ObfuscatedName("pq.e(I)V")
	public static void method6651(int arg0) {
		Statics.field4318 = arg0;
		field4316 = new Matrix4x4[arg0];
		Statics.field4319 = 0;
	}

	@ObfuscatedName("pq.n()Lpq;")
	public static Matrix4x4 method6641() {
		Matrix4x4[] var0 = field4316;
		synchronized (field4316) {
			if (Statics.field4319 == 0) {
				return new Matrix4x4();
			} else {
				field4316[--Statics.field4319].method6603();
				return field4316[Statics.field4319];
			}
		}
	}

	@ObfuscatedName("pq.m()V")
	public void method6605() {
		Matrix4x4[] var1 = field4316;
		synchronized (field4316) {
			if (Statics.field4319 < Statics.field4318 - 1) {
				field4316[Statics.field4319++] = this;
			}
		}
	}

	public Matrix4x4() {
		this.method6603();
	}

	public Matrix4x4(Matrix4x4 arg0) {
		this.method6604(arg0);
	}

	public Matrix4x4(Packet arg0, boolean arg1) {
		this.method6600(arg0, arg1);
	}

	@ObfuscatedName("pq.k(Lalw;Z)V")
	public void method6600(Packet arg0, boolean arg1) {
		if (!arg1) {
			for (int var4 = 0; var4 < 16; var4++) {
				this.field4315[var4] = arg0.gFloat();
			}
			return;
		}
		Matrix4x3 var3 = new Matrix4x3();
		var3.method6304(Trig1.method6277(arg0.g2s()));
		var3.method6305(Trig1.method6277(arg0.g2s()));
		var3.method6306(Trig1.method6277(arg0.g2s()));
		var3.method6315((float) arg0.g2s(), (float) arg0.g2s(), (float) arg0.g2s());
		this.method6609(var3);
	}

	@ObfuscatedName("pq.f()[F")
	public float[] method6725() {
		float[] var1 = new float[3];
		if ((double) this.field4315[2] < 0.999D && (double) this.field4315[2] > -0.999D) {
			var1[1] = (float) -Math.asin((double) this.field4315[2]);
			double var2 = Math.cos((double) var1[1]);
			var1[0] = (float) Math.atan2((double) this.field4315[6] / var2, (double) this.field4315[10] / var2);
			var1[2] = (float) Math.atan2((double) this.field4315[1] / var2, (double) this.field4315[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float) Math.atan2((double) this.field4315[2], 0.0D);
			var1[2] = (float) Math.atan2((double) -this.field4315[9], (double) this.field4315[5]);
		}
		return var1;
	}

	@ObfuscatedName("pq.w()[F")
	public float[] method6602() {
		float[] var1 = new float[] { (float) -Math.asin((double) this.field4315[6]), 0.0F, 0.0F };
		double var2 = Math.cos((double) var1[0]);
		if (Math.abs(var2) > 0.005D) {
			double var4 = (double) this.field4315[2];
			double var6 = (double) this.field4315[10];
			double var8 = (double) this.field4315[4];
			double var10 = (double) this.field4315[5];
			var1[1] = (float) Math.atan2(var4, var6);
			var1[2] = (float) Math.atan2(var8, var10);
		} else {
			double var12 = (double) this.field4315[1];
			double var14 = (double) this.field4315[0];
			var1[1] = (float) Math.atan2(var12, var14);
			var1[2] = 0.0F;
		}
		return var1;
	}

	@ObfuscatedName("pq.l()V")
	public void method6603() {
		this.field4315[0] = 1.0F;
		this.field4315[1] = 0.0F;
		this.field4315[2] = 0.0F;
		this.field4315[3] = 0.0F;
		this.field4315[4] = 0.0F;
		this.field4315[5] = 1.0F;
		this.field4315[6] = 0.0F;
		this.field4315[7] = 0.0F;
		this.field4315[8] = 0.0F;
		this.field4315[9] = 0.0F;
		this.field4315[10] = 1.0F;
		this.field4315[11] = 0.0F;
		this.field4315[12] = 0.0F;
		this.field4315[13] = 0.0F;
		this.field4315[14] = 0.0F;
		this.field4315[15] = 1.0F;
	}

	@ObfuscatedName("pq.u(Lpq;)V")
	public void method6604(Matrix4x4 arg0) {
		System.arraycopy(arg0.field4315, 0, this.field4315, 0, 16);
	}

	@ObfuscatedName("pq.z(Lpq;)V")
	public void method6726(Matrix4x4 arg0) {
		System.arraycopy(arg0.field4315, 0, this.field4315, 0, 11);
		this.field4315[3] = 0.0F;
		this.field4315[7] = 0.0F;
		this.field4315[11] = 0.0F;
		this.field4315[12] = 0.0F;
		this.field4315[13] = 0.0F;
		this.field4315[14] = 0.0F;
		this.field4315[15] = 1.0F;
	}

	@ObfuscatedName("pq.p(Lpq;Lpq;)V")
	public void method6606(Matrix4x4 arg0, Matrix4x4 arg1) {
		float var3 = arg0.field4315[3] * arg1.field4315[12] + arg0.field4315[2] * arg1.field4315[8] + arg0.field4315[0] * arg1.field4315[0] + arg0.field4315[1] * arg1.field4315[4];
		float var4 = arg0.field4315[3] * arg1.field4315[13] + arg0.field4315[2] * arg1.field4315[9] + arg0.field4315[0] * arg1.field4315[1] + arg0.field4315[1] * arg1.field4315[5];
		float var5 = arg0.field4315[3] * arg1.field4315[14] + arg0.field4315[2] * arg1.field4315[10] + arg0.field4315[0] * arg1.field4315[2] + arg0.field4315[1] * arg1.field4315[6];
		float var6 = arg0.field4315[3] * arg1.field4315[15] + arg0.field4315[2] * arg1.field4315[11] + arg0.field4315[0] * arg1.field4315[3] + arg0.field4315[1] * arg1.field4315[7];
		float var7 = arg0.field4315[7] * arg1.field4315[12] + arg0.field4315[6] * arg1.field4315[8] + arg0.field4315[4] * arg1.field4315[0] + arg0.field4315[5] * arg1.field4315[4];
		float var8 = arg0.field4315[7] * arg1.field4315[13] + arg0.field4315[6] * arg1.field4315[9] + arg0.field4315[4] * arg1.field4315[1] + arg0.field4315[5] * arg1.field4315[5];
		float var9 = arg0.field4315[7] * arg1.field4315[14] + arg0.field4315[6] * arg1.field4315[10] + arg0.field4315[4] * arg1.field4315[2] + arg0.field4315[5] * arg1.field4315[6];
		float var10 = arg0.field4315[7] * arg1.field4315[15] + arg0.field4315[6] * arg1.field4315[11] + arg0.field4315[4] * arg1.field4315[3] + arg0.field4315[5] * arg1.field4315[7];
		float var11 = arg0.field4315[11] * arg1.field4315[12] + arg0.field4315[10] * arg1.field4315[8] + arg0.field4315[8] * arg1.field4315[0] + arg0.field4315[9] * arg1.field4315[4];
		float var12 = arg0.field4315[11] * arg1.field4315[13] + arg0.field4315[10] * arg1.field4315[9] + arg0.field4315[8] * arg1.field4315[1] + arg0.field4315[9] * arg1.field4315[5];
		float var13 = arg0.field4315[11] * arg1.field4315[14] + arg0.field4315[10] * arg1.field4315[10] + arg0.field4315[8] * arg1.field4315[2] + arg0.field4315[9] * arg1.field4315[6];
		float var14 = arg0.field4315[11] * arg1.field4315[15] + arg0.field4315[10] * arg1.field4315[11] + arg0.field4315[8] * arg1.field4315[3] + arg0.field4315[9] * arg1.field4315[7];
		float var15 = arg0.field4315[15] * arg1.field4315[12] + arg0.field4315[14] * arg1.field4315[8] + arg0.field4315[12] * arg1.field4315[0] + arg0.field4315[13] * arg1.field4315[4];
		float var16 = arg0.field4315[15] * arg1.field4315[13] + arg0.field4315[14] * arg1.field4315[9] + arg0.field4315[12] * arg1.field4315[1] + arg0.field4315[13] * arg1.field4315[5];
		float var17 = arg0.field4315[15] * arg1.field4315[14] + arg0.field4315[14] * arg1.field4315[10] + arg0.field4315[12] * arg1.field4315[2] + arg0.field4315[13] * arg1.field4315[6];
		float var18 = arg0.field4315[15] * arg1.field4315[15] + arg0.field4315[14] * arg1.field4315[11] + arg0.field4315[12] * arg1.field4315[3] + arg0.field4315[13] * arg1.field4315[7];
		this.field4315[0] = var3;
		this.field4315[1] = var4;
		this.field4315[2] = var5;
		this.field4315[3] = var6;
		this.field4315[4] = var7;
		this.field4315[5] = var8;
		this.field4315[6] = var9;
		this.field4315[7] = var10;
		this.field4315[8] = var11;
		this.field4315[9] = var12;
		this.field4315[10] = var13;
		this.field4315[11] = var14;
		this.field4315[12] = var15;
		this.field4315[13] = var16;
		this.field4315[14] = var17;
		this.field4315[15] = var18;
	}

	@ObfuscatedName("pq.d(Lpq;)V")
	public void method6720(Matrix4x4 arg0) {
		float var2 = this.field4315[3] * arg0.field4315[12] + this.field4315[2] * arg0.field4315[8] + this.field4315[0] * arg0.field4315[0] + this.field4315[1] * arg0.field4315[4];
		float var3 = this.field4315[3] * arg0.field4315[13] + this.field4315[2] * arg0.field4315[9] + this.field4315[0] * arg0.field4315[1] + this.field4315[1] * arg0.field4315[5];
		float var4 = this.field4315[3] * arg0.field4315[14] + this.field4315[2] * arg0.field4315[10] + this.field4315[0] * arg0.field4315[2] + this.field4315[1] * arg0.field4315[6];
		float var5 = this.field4315[3] * arg0.field4315[15] + this.field4315[2] * arg0.field4315[11] + this.field4315[0] * arg0.field4315[3] + this.field4315[1] * arg0.field4315[7];
		float var6 = this.field4315[7] * arg0.field4315[12] + this.field4315[6] * arg0.field4315[8] + this.field4315[4] * arg0.field4315[0] + this.field4315[5] * arg0.field4315[4];
		float var7 = this.field4315[7] * arg0.field4315[13] + this.field4315[6] * arg0.field4315[9] + this.field4315[4] * arg0.field4315[1] + this.field4315[5] * arg0.field4315[5];
		float var8 = this.field4315[7] * arg0.field4315[14] + this.field4315[6] * arg0.field4315[10] + this.field4315[4] * arg0.field4315[2] + this.field4315[5] * arg0.field4315[6];
		float var9 = this.field4315[7] * arg0.field4315[15] + this.field4315[6] * arg0.field4315[11] + this.field4315[4] * arg0.field4315[3] + this.field4315[5] * arg0.field4315[7];
		float var10 = this.field4315[11] * arg0.field4315[12] + this.field4315[10] * arg0.field4315[8] + this.field4315[8] * arg0.field4315[0] + this.field4315[9] * arg0.field4315[4];
		float var11 = this.field4315[11] * arg0.field4315[13] + this.field4315[10] * arg0.field4315[9] + this.field4315[8] * arg0.field4315[1] + this.field4315[9] * arg0.field4315[5];
		float var12 = this.field4315[11] * arg0.field4315[14] + this.field4315[10] * arg0.field4315[10] + this.field4315[8] * arg0.field4315[2] + this.field4315[9] * arg0.field4315[6];
		float var13 = this.field4315[11] * arg0.field4315[15] + this.field4315[10] * arg0.field4315[11] + this.field4315[8] * arg0.field4315[3] + this.field4315[9] * arg0.field4315[7];
		float var14 = this.field4315[15] * arg0.field4315[12] + this.field4315[14] * arg0.field4315[8] + this.field4315[12] * arg0.field4315[0] + this.field4315[13] * arg0.field4315[4];
		float var15 = this.field4315[15] * arg0.field4315[13] + this.field4315[14] * arg0.field4315[9] + this.field4315[12] * arg0.field4315[1] + this.field4315[13] * arg0.field4315[5];
		float var16 = this.field4315[15] * arg0.field4315[14] + this.field4315[14] * arg0.field4315[10] + this.field4315[12] * arg0.field4315[2] + this.field4315[13] * arg0.field4315[6];
		float var17 = this.field4315[15] * arg0.field4315[15] + this.field4315[14] * arg0.field4315[11] + this.field4315[12] * arg0.field4315[3] + this.field4315[13] * arg0.field4315[7];
		this.field4315[0] = var2;
		this.field4315[1] = var3;
		this.field4315[2] = var4;
		this.field4315[3] = var5;
		this.field4315[4] = var6;
		this.field4315[5] = var7;
		this.field4315[6] = var8;
		this.field4315[7] = var9;
		this.field4315[8] = var10;
		this.field4315[9] = var11;
		this.field4315[10] = var12;
		this.field4315[11] = var13;
		this.field4315[12] = var14;
		this.field4315[13] = var15;
		this.field4315[14] = var16;
		this.field4315[15] = var17;
	}

	@ObfuscatedName("pq.c(FFF)V")
	public void method6608(float arg0, float arg1, float arg2) {
		double var4 = Math.sin((double) arg0 / 2.0D);
		double var6 = Math.cos((double) arg0 / 2.0D);
		double var8 = Math.sin((double) arg1 / 2.0D);
		double var10 = Math.cos((double) arg1 / 2.0D);
		double var12 = Math.sin((double) arg2 / 2.0D);
		double var14 = Math.cos((double) arg2 / 2.0D);
		float var16 = (float) (var4 * var10 * var12 + var6 * var8 * var14);
		float var17 = (float) (var4 * var10 * var14 - var6 * var8 * var12);
		float var18 = (float) (var6 * var10 * var12 - var4 * var8 * var14);
		float var19 = (float) (var4 * var8 * var12 + var6 * var10 * var14);
		float var20 = var19 * var19;
		float var21 = var16 * var19;
		float var22 = var17 * var19;
		float var23 = var18 * var19;
		float var24 = var16 * var16;
		float var25 = var16 * var17;
		float var26 = var16 * var18;
		float var27 = var17 * var17;
		float var28 = var17 * var18;
		float var29 = var18 * var18;
		this.field4315[0] = var20 + var24 - var29 - var27;
		this.field4315[1] = var23 + var25 + var25 + var23;
		this.field4315[2] = var26 - var22 - var22 + var26;
		this.field4315[4] = var25 - var23 - var23 + var25;
		this.field4315[5] = var20 + var27 - var24 - var29;
		this.field4315[6] = var21 + var28 + var28 + var21;
		this.field4315[8] = var22 + var26 + var26 + var22;
		this.field4315[9] = var28 - var21 - var21 + var28;
		this.field4315[10] = var20 + var29 - var27 - var24;
	}

	@ObfuscatedName("pq.r(Lou;)V")
	public void method6609(Matrix4x3 arg0) {
		this.field4315[0] = arg0.field4276;
		this.field4315[1] = arg0.field4277;
		this.field4315[2] = arg0.field4278;
		this.field4315[3] = 0.0F;
		this.field4315[4] = arg0.field4279;
		this.field4315[5] = arg0.field4287;
		this.field4315[6] = arg0.field4281;
		this.field4315[7] = 0.0F;
		this.field4315[8] = arg0.field4275;
		this.field4315[9] = arg0.field4283;
		this.field4315[10] = arg0.field4284;
		this.field4315[11] = 0.0F;
		this.field4315[12] = arg0.field4285;
		this.field4315[13] = arg0.field4286;
		this.field4315[14] = arg0.field4280;
		this.field4315[15] = 1.0F;
	}

	@ObfuscatedName("pq.v()F")
	public float method6610() {
		return this.field4315[3] * this.field4315[6] * this.field4315[9] * this.field4315[12] + (this.field4315[3] * this.field4315[5] * this.field4315[8] * this.field4315[14] + this.field4315[3] * this.field4315[4] * this.field4315[10] * this.field4315[13] + (this.field4315[2] * this.field4315[7] * this.field4315[8] * this.field4315[13] + this.field4315[2] * this.field4315[5] * this.field4315[11] * this.field4315[12] + (this.field4315[2] * this.field4315[4] * this.field4315[9] * this.field4315[15] + this.field4315[1] * this.field4315[7] * this.field4315[10] * this.field4315[12] + (this.field4315[1] * this.field4315[6] * this.field4315[8] * this.field4315[15] + this.field4315[1] * this.field4315[4] * this.field4315[11] * this.field4315[14] + (this.field4315[0] * this.field4315[7] * this.field4315[9] * this.field4315[14] + this.field4315[0] * this.field4315[6] * this.field4315[11] * this.field4315[13] + (this.field4315[0] * this.field4315[5] * this.field4315[10] * this.field4315[15] - this.field4315[0] * this.field4315[5] * this.field4315[11] * this.field4315[14] - this.field4315[0] * this.field4315[6] * this.field4315[9] * this.field4315[15]) - this.field4315[0] * this.field4315[7] * this.field4315[10] * this.field4315[13] - this.field4315[1] * this.field4315[4] * this.field4315[10] * this.field4315[15]) - this.field4315[1] * this.field4315[6] * this.field4315[11] * this.field4315[12] - this.field4315[1] * this.field4315[7] * this.field4315[8] * this.field4315[14]) - this.field4315[2] * this.field4315[4] * this.field4315[11] * this.field4315[13] - this.field4315[2] * this.field4315[5] * this.field4315[8] * this.field4315[15]) - this.field4315[2] * this.field4315[7] * this.field4315[9] * this.field4315[12] - this.field4315[3] * this.field4315[4] * this.field4315[9] * this.field4315[14]) - this.field4315[3] * this.field4315[5] * this.field4315[10] * this.field4315[12] - this.field4315[3] * this.field4315[6] * this.field4315[8] * this.field4315[13]);
	}

	@ObfuscatedName("pq.o()V")
	public void method6611() {
		float var1 = 1.0F / this.method6610();
		float var2 = (this.field4315[7] * this.field4315[9] * this.field4315[14] + this.field4315[6] * this.field4315[11] * this.field4315[13] + (this.field4315[5] * this.field4315[10] * this.field4315[15] - this.field4315[5] * this.field4315[11] * this.field4315[14] - this.field4315[6] * this.field4315[9] * this.field4315[15]) - this.field4315[7] * this.field4315[10] * this.field4315[13]) * var1;
		float var3 = (this.field4315[3] * this.field4315[10] * this.field4315[13] + (this.field4315[2] * this.field4315[9] * this.field4315[15] + this.field4315[10] * -this.field4315[1] * this.field4315[15] + this.field4315[1] * this.field4315[11] * this.field4315[14] - this.field4315[2] * this.field4315[11] * this.field4315[13] - this.field4315[3] * this.field4315[9] * this.field4315[14])) * var1;
		float var4 = (this.field4315[3] * this.field4315[5] * this.field4315[14] + this.field4315[2] * this.field4315[7] * this.field4315[13] + (this.field4315[1] * this.field4315[6] * this.field4315[15] - this.field4315[1] * this.field4315[7] * this.field4315[14] - this.field4315[2] * this.field4315[5] * this.field4315[15]) - this.field4315[3] * this.field4315[6] * this.field4315[13]) * var1;
		float var5 = (this.field4315[3] * this.field4315[6] * this.field4315[9] + (this.field4315[2] * this.field4315[5] * this.field4315[11] + this.field4315[6] * -this.field4315[1] * this.field4315[11] + this.field4315[1] * this.field4315[7] * this.field4315[10] - this.field4315[2] * this.field4315[7] * this.field4315[9] - this.field4315[3] * this.field4315[5] * this.field4315[10])) * var1;
		float var6 = (this.field4315[7] * this.field4315[10] * this.field4315[12] + (this.field4315[6] * this.field4315[8] * this.field4315[15] + this.field4315[10] * -this.field4315[4] * this.field4315[15] + this.field4315[4] * this.field4315[11] * this.field4315[14] - this.field4315[6] * this.field4315[11] * this.field4315[12] - this.field4315[7] * this.field4315[8] * this.field4315[14])) * var1;
		float var7 = (this.field4315[3] * this.field4315[8] * this.field4315[14] + this.field4315[2] * this.field4315[11] * this.field4315[12] + (this.field4315[0] * this.field4315[10] * this.field4315[15] - this.field4315[0] * this.field4315[11] * this.field4315[14] - this.field4315[2] * this.field4315[8] * this.field4315[15]) - this.field4315[3] * this.field4315[10] * this.field4315[12]) * var1;
		float var8 = (this.field4315[3] * this.field4315[6] * this.field4315[12] + (this.field4315[2] * this.field4315[4] * this.field4315[15] + this.field4315[6] * -this.field4315[0] * this.field4315[15] + this.field4315[0] * this.field4315[7] * this.field4315[14] - this.field4315[2] * this.field4315[7] * this.field4315[12] - this.field4315[3] * this.field4315[4] * this.field4315[14])) * var1;
		float var9 = (this.field4315[3] * this.field4315[4] * this.field4315[10] + this.field4315[2] * this.field4315[7] * this.field4315[8] + (this.field4315[0] * this.field4315[6] * this.field4315[11] - this.field4315[0] * this.field4315[7] * this.field4315[10] - this.field4315[2] * this.field4315[4] * this.field4315[11]) - this.field4315[3] * this.field4315[6] * this.field4315[8]) * var1;
		float var10 = (this.field4315[7] * this.field4315[8] * this.field4315[13] + this.field4315[5] * this.field4315[11] * this.field4315[12] + (this.field4315[4] * this.field4315[9] * this.field4315[15] - this.field4315[4] * this.field4315[11] * this.field4315[13] - this.field4315[5] * this.field4315[8] * this.field4315[15]) - this.field4315[7] * this.field4315[9] * this.field4315[12]) * var1;
		float var11 = (this.field4315[3] * this.field4315[9] * this.field4315[12] + (this.field4315[1] * this.field4315[8] * this.field4315[15] + this.field4315[9] * -this.field4315[0] * this.field4315[15] + this.field4315[0] * this.field4315[11] * this.field4315[13] - this.field4315[1] * this.field4315[11] * this.field4315[12] - this.field4315[3] * this.field4315[8] * this.field4315[13])) * var1;
		float var12 = (this.field4315[3] * this.field4315[4] * this.field4315[13] + this.field4315[1] * this.field4315[7] * this.field4315[12] + (this.field4315[0] * this.field4315[5] * this.field4315[15] - this.field4315[0] * this.field4315[7] * this.field4315[13] - this.field4315[1] * this.field4315[4] * this.field4315[15]) - this.field4315[3] * this.field4315[5] * this.field4315[12]) * var1;
		float var13 = (this.field4315[3] * this.field4315[5] * this.field4315[8] + (this.field4315[1] * this.field4315[4] * this.field4315[11] + this.field4315[5] * -this.field4315[0] * this.field4315[11] + this.field4315[0] * this.field4315[7] * this.field4315[9] - this.field4315[1] * this.field4315[7] * this.field4315[8] - this.field4315[3] * this.field4315[4] * this.field4315[9])) * var1;
		float var14 = (this.field4315[6] * this.field4315[9] * this.field4315[12] + (this.field4315[5] * this.field4315[8] * this.field4315[14] + this.field4315[9] * -this.field4315[4] * this.field4315[14] + this.field4315[4] * this.field4315[10] * this.field4315[13] - this.field4315[5] * this.field4315[10] * this.field4315[12] - this.field4315[6] * this.field4315[8] * this.field4315[13])) * var1;
		float var15 = (this.field4315[2] * this.field4315[8] * this.field4315[13] + this.field4315[1] * this.field4315[10] * this.field4315[12] + (this.field4315[0] * this.field4315[9] * this.field4315[14] - this.field4315[0] * this.field4315[10] * this.field4315[13] - this.field4315[1] * this.field4315[8] * this.field4315[14]) - this.field4315[2] * this.field4315[9] * this.field4315[12]) * var1;
		float var16 = (this.field4315[2] * this.field4315[5] * this.field4315[12] + (this.field4315[1] * this.field4315[4] * this.field4315[14] + this.field4315[5] * -this.field4315[0] * this.field4315[14] + this.field4315[0] * this.field4315[6] * this.field4315[13] - this.field4315[1] * this.field4315[6] * this.field4315[12] - this.field4315[2] * this.field4315[4] * this.field4315[13])) * var1;
		float var17 = (this.field4315[2] * this.field4315[4] * this.field4315[9] + this.field4315[1] * this.field4315[6] * this.field4315[8] + (this.field4315[0] * this.field4315[5] * this.field4315[10] - this.field4315[0] * this.field4315[6] * this.field4315[9] - this.field4315[1] * this.field4315[4] * this.field4315[10]) - this.field4315[2] * this.field4315[5] * this.field4315[8]) * var1;
		this.field4315[0] = var2;
		this.field4315[1] = var3;
		this.field4315[2] = var4;
		this.field4315[3] = var5;
		this.field4315[4] = var6;
		this.field4315[5] = var7;
		this.field4315[6] = var8;
		this.field4315[7] = var9;
		this.field4315[8] = var10;
		this.field4315[9] = var11;
		this.field4315[10] = var12;
		this.field4315[11] = var13;
		this.field4315[12] = var14;
		this.field4315[13] = var15;
		this.field4315[14] = var16;
		this.field4315[15] = var17;
	}

	@ObfuscatedName("pq.s(FFFF)V")
	public void method6612(float arg0, float arg1, float arg2, float arg3) {
		this.field4315[0] = arg0;
		this.field4315[1] = 0.0F;
		this.field4315[2] = 0.0F;
		this.field4315[3] = 0.0F;
		this.field4315[4] = 0.0F;
		this.field4315[5] = arg1;
		this.field4315[6] = 0.0F;
		this.field4315[7] = 0.0F;
		this.field4315[8] = 0.0F;
		this.field4315[9] = 0.0F;
		this.field4315[10] = arg2;
		this.field4315[11] = 0.0F;
		this.field4315[12] = 0.0F;
		this.field4315[13] = 0.0F;
		this.field4315[14] = 0.0F;
		this.field4315[15] = arg3;
	}

	@ObfuscatedName("pq.y()Z")
	public boolean method6613() {
		return this.field4315[0] == 1.0F && this.field4315[1] == 0.0F && this.field4315[2] == 0.0F && this.field4315[3] == 0.0F && this.field4315[4] == 0.0F && this.field4315[5] == 1.0F && this.field4315[6] == 0.0F && this.field4315[7] == 0.0F && this.field4315[8] == 0.0F && this.field4315[9] == 0.0F && this.field4315[10] == 1.0F && this.field4315[11] == 0.0F && this.field4315[12] == 0.0F && this.field4315[13] == 0.0F && this.field4315[14] == 0.0F && this.field4315[15] == 1.0F;
	}

	@ObfuscatedName("pq.q(FFF[F)V")
	public void method6614(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.field4315[8] * arg2 + this.field4315[0] * arg0 + this.field4315[4] * arg1 + this.field4315[12];
		arg3[1] = this.field4315[9] * arg2 + this.field4315[1] * arg0 + this.field4315[5] * arg1 + this.field4315[13];
		arg3[2] = this.field4315[10] * arg2 + this.field4315[2] * arg0 + this.field4315[6] * arg1 + this.field4315[14];
		if (arg3.length > 3) {
			arg3[3] = this.field4315[11] * arg2 + this.field4315[3] * arg0 + this.field4315[7] * arg1 + this.field4315[15];
		}
	}

	@ObfuscatedName("pq.x([F)V")
	public void method6670(float[] arg0) {
		float var2 = arg0[0];
		float var3 = arg0[1];
		float var4 = arg0[2];
		arg0[0] = this.field4315[8] * var4 + this.field4315[0] * var2 + this.field4315[4] * var3 + this.field4315[12];
		arg0[1] = this.field4315[9] * var4 + this.field4315[1] * var2 + this.field4315[5] * var3 + this.field4315[13];
		arg0[2] = this.field4315[10] * var4 + this.field4315[2] * var2 + this.field4315[6] * var3 + this.field4315[14];
	}

	@ObfuscatedName("pq.b(FFF[F)V")
	public void method6616(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.field4315[8] * arg2 + this.field4315[0] * arg0 + this.field4315[4] * arg1;
		arg3[1] = this.field4315[9] * arg2 + this.field4315[1] * arg0 + this.field4315[5] * arg1;
		arg3[2] = this.field4315[10] * arg2 + this.field4315[2] * arg0 + this.field4315[6] * arg1;
		if (arg3.length > 3) {
			arg3[3] = this.field4315[11] * arg2 + this.field4315[3] * arg0 + this.field4315[7] * arg1;
		}
	}

	@ObfuscatedName("pq.h(FFFFFF)V")
	public void method6617(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.field4315[0] = 2.0F / (arg1 - arg0);
		this.field4315[1] = 0.0F;
		this.field4315[2] = 0.0F;
		this.field4315[3] = 0.0F;
		this.field4315[4] = 0.0F;
		this.field4315[5] = 2.0F / (arg3 - arg2);
		this.field4315[6] = 0.0F;
		this.field4315[7] = 0.0F;
		this.field4315[8] = 0.0F;
		this.field4315[9] = 0.0F;
		this.field4315[10] = 2.0F / (arg5 - arg4);
		this.field4315[11] = 0.0F;
		this.field4315[12] = -(arg0 + arg1) / (arg1 - arg0);
		this.field4315[13] = -(arg2 + arg3) / (arg3 - arg2);
		this.field4315[14] = -(arg4 + arg5) / (arg5 - arg4);
		this.field4315[15] = 1.0F;
	}

	@ObfuscatedName("pq.a(FFFF)V")
	public void method6618(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		float var6 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method6675(-var5, var5, -var6, var6, arg0, arg1);
	}

	@ObfuscatedName("pq.g(FFF)V")
	public void method6601(float arg0, float arg1, float arg2) {
		this.method6617(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@ObfuscatedName("pq.i(FFFFFF)V")
	public void method6675(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.field4315[0] = arg4 * 2.0F / (arg1 - arg0);
		this.field4315[1] = 0.0F;
		this.field4315[2] = 0.0F;
		this.field4315[3] = 0.0F;
		this.field4315[4] = 0.0F;
		this.field4315[5] = arg4 * 2.0F / (arg3 - arg2);
		this.field4315[6] = 0.0F;
		this.field4315[7] = 0.0F;
		this.field4315[8] = (arg0 + arg1) / (arg1 - arg0);
		this.field4315[9] = (arg2 + arg3) / (arg3 - arg2);
		this.field4315[10] = (arg4 + arg5) / (arg5 - arg4);
		this.field4315[11] = 1.0F;
		this.field4315[12] = 0.0F;
		this.field4315[13] = 0.0F;
		this.field4315[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.field4315[15] = 0.0F;
	}

	@ObfuscatedName("pq.j(FFFFFFFF)V")
	public void method6703(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
		this.field4315[0] = arg2 * 2.0F / arg6;
		this.field4315[1] = 0.0F;
		this.field4315[2] = 0.0F;
		this.field4315[3] = 0.0F;
		this.field4315[4] = 0.0F;
		this.field4315[5] = arg3 * 2.0F / arg7;
		this.field4315[6] = 0.0F;
		this.field4315[7] = 0.0F;
		this.field4315[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.field4315[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.field4315[10] = (arg4 + arg5) / (arg5 - arg4);
		this.field4315[11] = 1.0F;
		this.field4315[12] = 0.0F;
		this.field4315[13] = 0.0F;
		this.field4315[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.field4315[15] = 0.0F;
	}

	@ObfuscatedName("pq.t(FFFFFFFFF)V")
	public void method6622(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
		this.method6617(-(arg0 * arg8) / arg2, (arg6 - arg0) * arg8 / arg2, -(arg1 * arg8) / arg3, (arg7 - arg1) * arg8 / arg3, arg4, arg5);
	}

	@ObfuscatedName("pq.ae()F")
	public float method6654() {
		return -(this.field4315[15] + this.field4315[14]) / (this.field4315[11] + this.field4315[10]);
	}

	@ObfuscatedName("pq.ag()F")
	public float method6632() {
		return (this.field4315[14] - this.field4315[15]) / (this.field4315[11] - this.field4315[10]);
	}

	@ObfuscatedName("pq.ah([F)[F")
	public float[] method6625(float[] arg0) {
		float var2 = this.field4315[3] + this.field4315[0];
		float var3 = this.field4315[7] + this.field4315[4];
		float var4 = this.field4315[11] + this.field4315[8];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field4315[15] + this.field4315[12]) / var5);
		return arg0;
	}

	@ObfuscatedName("pq.al([F)[F")
	public float[] method6626(float[] arg0) {
		float var2 = this.field4315[3] - this.field4315[0];
		float var3 = this.field4315[7] - this.field4315[4];
		float var4 = this.field4315[11] - this.field4315[8];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field4315[15] - this.field4315[12]) / var5);
		return arg0;
	}

	@ObfuscatedName("pq.ac([F)[F")
	public float[] method6627(float[] arg0) {
		float var2 = this.field4315[3] + this.field4315[1];
		float var3 = this.field4315[7] + this.field4315[5];
		float var4 = this.field4315[11] + this.field4315[9];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field4315[15] + this.field4315[13]) / var5);
		return arg0;
	}

	@ObfuscatedName("pq.ai([F)[F")
	public float[] method6628(float[] arg0) {
		float var2 = this.field4315[3] - this.field4315[1];
		float var3 = this.field4315[7] - this.field4315[5];
		float var4 = this.field4315[11] - this.field4315[9];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field4315[15] - this.field4315[13]) / var5);
		return arg0;
	}

	@ObfuscatedName("pq.aw([F)[F")
	public float[] method6607(float[] arg0) {
		float var2 = this.field4315[3] + this.field4315[2];
		float var3 = this.field4315[7] + this.field4315[6];
		float var4 = this.field4315[11] + this.field4315[10];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field4315[15] + this.field4315[14]) / var5);
		return arg0;
	}

	@ObfuscatedName("pq.as([F)[F")
	public float[] method6643(float[] arg0) {
		float var2 = this.field4315[3] - this.field4315[2];
		float var3 = this.field4315[7] - this.field4315[6];
		float var4 = this.field4315[11] - this.field4315[10];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field4315[15] - this.field4315[14]) / var5);
		return arg0;
	}

	@ObfuscatedName("pq.at()V")
	public void method6631() {
		float var1 = this.field4315[0];
		float var2 = this.field4315[4];
		float var3 = this.field4315[8];
		float var4 = this.field4315[12];
		float var5 = this.field4315[1];
		float var6 = this.field4315[5];
		float var7 = this.field4315[9];
		float var8 = this.field4315[13];
		float var9 = this.field4315[2];
		float var10 = this.field4315[6];
		float var11 = this.field4315[10];
		float var12 = this.field4315[14];
		float var13 = this.field4315[3];
		float var14 = this.field4315[7];
		float var15 = this.field4315[11];
		float var16 = this.field4315[15];
		this.field4315[0] = var1;
		this.field4315[1] = var2;
		this.field4315[2] = var3;
		this.field4315[3] = var4;
		this.field4315[4] = var5;
		this.field4315[5] = var6;
		this.field4315[6] = var7;
		this.field4315[7] = var8;
		this.field4315[8] = var9;
		this.field4315[9] = var10;
		this.field4315[10] = var11;
		this.field4315[11] = var12;
		this.field4315[12] = var13;
		this.field4315[13] = var14;
		this.field4315[14] = var15;
		this.field4315[15] = var16;
	}

	@ObfuscatedName("pq.ad([F)[F")
	public float[] method6594(float[] arg0) {
		System.arraycopy(this.field4315, 0, arg0, 0, 16);
		return arg0;
	}

	@ObfuscatedName("pq.am([F)[F")
	public float[] method6633(float[] arg0) {
		System.arraycopy(this.field4315, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@ObfuscatedName("pq.au([F)[F")
	public float[] method6699(float[] arg0) {
		arg0[0] = this.field4315[0];
		arg0[1] = this.field4315[1];
		arg0[2] = this.field4315[2];
		arg0[3] = this.field4315[4];
		arg0[4] = this.field4315[5];
		arg0[5] = this.field4315[6];
		arg0[6] = this.field4315[8];
		arg0[7] = this.field4315[9];
		arg0[8] = this.field4315[10];
		return arg0;
	}

	@ObfuscatedName("pq.ar([F)[F")
	public float[] method6620(float[] arg0) {
		arg0[0] = this.field4315[0];
		arg0[1] = this.field4315[4];
		arg0[2] = this.field4315[8];
		arg0[3] = this.field4315[12];
		arg0[4] = this.field4315[1];
		arg0[5] = this.field4315[5];
		arg0[6] = this.field4315[9];
		arg0[7] = this.field4315[13];
		arg0[8] = this.field4315[2];
		arg0[9] = this.field4315[6];
		arg0[10] = this.field4315[10];
		arg0[11] = this.field4315[14];
		arg0[12] = this.field4315[3];
		arg0[13] = this.field4315[7];
		arg0[14] = this.field4315[11];
		arg0[15] = this.field4315[15];
		return arg0;
	}

	@ObfuscatedName("pq.ap([F)[F")
	public float[] method6682(float[] arg0) {
		arg0[0] = this.field4315[0];
		arg0[1] = this.field4315[1];
		arg0[2] = this.field4315[4];
		arg0[3] = this.field4315[5];
		arg0[4] = this.field4315[8];
		arg0[5] = this.field4315[9];
		arg0[6] = this.field4315[12];
		arg0[7] = this.field4315[13];
		return arg0;
	}

	@ObfuscatedName("pq.aq([F)[F")
	public float[] method6637(float[] arg0) {
		arg0[0] = this.field4315[0];
		arg0[1] = this.field4315[4];
		arg0[2] = this.field4315[8];
		arg0[3] = this.field4315[12];
		arg0[4] = this.field4315[1];
		arg0[5] = this.field4315[5];
		arg0[6] = this.field4315[9];
		arg0[7] = this.field4315[13];
		return arg0;
	}

	@ObfuscatedName("pq.ax([F)[F")
	public float[] method6638(float[] arg0) {
		arg0[0] = this.field4315[0];
		arg0[1] = this.field4315[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.field4315[4];
		arg0[5] = this.field4315[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.field4315[12];
		arg0[9] = this.field4315[13];
		arg0[10] = this.field4315[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@ObfuscatedName("pq.av(IIIFFF)V")
	public void method6687(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
		if (arg0 == 0) {
			this.field4315[0] = arg1;
			this.field4315[5] = arg2;
			this.field4315[10] = 1.0F;
			float[] var12 = this.field4315;
			float[] var13 = this.field4315;
			float[] var14 = this.field4315;
			float[] var15 = this.field4315;
			float[] var16 = this.field4315;
			this.field4315[9] = 0.0F;
			var16[8] = 0.0F;
			var15[6] = 0.0F;
			var14[4] = 0.0F;
			var13[2] = 0.0F;
			var12[1] = 0.0F;
		} else {
			float var7 = Trig2.field4273[arg0 & 0x3FFF];
			float var8 = Trig2.field4274[arg0 & 0x3FFF];
			this.field4315[0] = (float) arg1 * var7;
			this.field4315[5] = (float) arg2 * var7;
			this.field4315[1] = (float) arg1 * var8;
			this.field4315[4] = (float) arg2 * -var8;
			this.field4315[10] = 1.0F;
			float[] var9 = this.field4315;
			float[] var10 = this.field4315;
			float[] var11 = this.field4315;
			this.field4315[9] = 0.0F;
			var11[8] = 0.0F;
			var10[6] = 0.0F;
			var9[2] = 0.0F;
		}
		float[] var17 = this.field4315;
		float[] var18 = this.field4315;
		this.field4315[11] = 0.0F;
		var18[7] = 0.0F;
		var17[3] = 0.0F;
		this.field4315[15] = 1.0F;
		this.field4315[12] = arg3;
		this.field4315[13] = arg4;
		this.field4315[14] = arg5;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method6602();
		this.method6725();
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 4; var3++) {
				if (var3 > 0) {
					var1.append("\t");
				}
				float var4 = this.field4315[var2 * 4 + var3];
				if (Math.sqrt((double) (var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}
				var1.append(var4);
			}
			var1.append("\n");
		}
		return var1.toString();
	}

	public int hashCode() {
		byte var1 = 1;
		return var1 * 31 + Arrays.hashCode(this.field4315);
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof Matrix4x4)) {
			return false;
		}
		Matrix4x4 var2 = (Matrix4x4) arg0;
		for (int var3 = 0; var3 < 16; var3++) {
			if (this.field4315[var3] != var2.field4315[var3]) {
				return false;
			}
		}
		return true;
	}
}
