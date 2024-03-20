package com.jagex.math;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("pe")
public class Spline {

	@ObfuscatedName("pe.e")
	public SplineRelated[] field4324 = new SplineRelated[1];

	@ObfuscatedName("pe.n")
	public float[] field4325 = new float[2];

	@ObfuscatedName("pe.e(Lox;Lox;F)V")
	public void method6774(Vector3 arg0, Vector3 arg1, float arg2) {
		SplineRelated[] var4 = new SplineRelated[this.field4324.length + 1];
		System.arraycopy(this.field4324, 0, var4, 0, this.field4324.length);
		SplineRelated var5 = new SplineRelated();
		SplineRelated var6 = this.field4324[this.field4324.length - 1];
		var5.method6740(0, var6.method6748(3));
		Vector3 var7 = Vector3.sub(var6.method6748(3), var6.method6748(2));
		var5.method6740(1, Vector3.add(var6.method6748(3), var7));
		var5.method6740(3, arg0);
		var5.method6740(2, arg1);
		var4[var4.length - 1] = var5;
		this.field4324 = var4;
		float[] var8 = new float[this.field4325.length + 1];
		System.arraycopy(this.field4325, 0, var8, 0, this.field4325.length);
		var8[var8.length - 1] = arg2;
		this.field4325 = var8;
	}

	@ObfuscatedName("pe.n()I")
	public int method6763() {
		return this.field4324.length;
	}

	@ObfuscatedName("pe.m()F")
	public float method6764() {
		float var1 = 0.0F;
		for (int var2 = 0; var2 < this.field4324.length; var2++) {
			var1 += this.field4324[var2].method6743();
		}
		return var1;
	}

	@ObfuscatedName("pe.k(F)[D")
	public double[] method6765(float arg0) {
		float var2 = 0.0F;
		float var3 = 0.0F;
		for (int var4 = 0; var4 < this.field4324.length; var4++) {
			var3 += this.field4324[var4].method6743();
			if (arg0 < var3) {
				float var5 = this.field4324[var4].method6744(arg0 - var2);
				return this.field4324[var4].method6755(var5);
			}
			var2 = var3;
		}
		return this.field4324[this.field4324.length - 1].method6755(1.0F);
	}

	@ObfuscatedName("pe.f(F)F")
	public float method6771(float arg0) {
		float var2 = 0.0F;
		float var3 = 0.0F;
		for (int var4 = 0; var4 < this.field4324.length; var4++) {
			var3 += this.field4324[var4].method6743();
			if (arg0 < var3) {
				return this.field4324[var4].method6744(arg0 - var2) + (float) var4;
			}
			var2 = var3;
		}
		return (float) this.field4324.length;
	}

	@ObfuscatedName("pe.w(F)[D")
	public double[] method6767(float arg0) {
		int var2 = (int) arg0;
		return var2 < this.field4324.length ? this.field4324[var2].method6755(arg0 - (float) var2) : this.field4324[this.field4324.length - 1].method6755(1.0F);
	}

	@ObfuscatedName("pe.l(F)F")
	public float method6762(float arg0) {
		return this.method6769(this.method6771(arg0));
	}

	@ObfuscatedName("pe.u(F)F")
	public float method6769(float arg0) {
		int var2 = (int) arg0;
		if (var2 + 1 < this.field4325.length) {
			float var3 = this.field4325[var2];
			float var4 = this.field4325[var2 + 1];
			float var5 = arg0 - (float) var2;
			return (1.0F - var5) * var3 + var4 * var5;
		} else {
			return this.field4325[this.field4325.length - 1];
		}
	}

	public Spline(Packet arg0) {
		int var2 = arg0.gSmart1or2();
		this.field4324[0] = new SplineRelated();
		this.field4324[0].method6740(0, Vector3.create(arg0));
		this.field4324[0].method6740(1, Vector3.create(arg0));
		this.field4325[0] = arg0.gFloat();
		Vector3 var3 = Vector3.create(arg0);
		Vector3 var4 = Vector3.create(arg0);
		Vector3 var5 = Vector3.sub(var3, var4);
		var4.release();
		var5.add(var3);
		this.field4324[0].method6740(3, var3);
		this.field4324[0].method6740(2, var5);
		this.field4325[1] = arg0.gFloat();
		for (int var7 = 2; var7 < var2; var7++) {
			Vector3 var8 = Vector3.create(arg0);
			Vector3 var9 = Vector3.create(arg0);
			Vector3 var10 = Vector3.sub(var8, var9);
			var9.release();
			var10.add(var8);
			this.method6774(var8, var10, arg0.gFloat());
		}
	}
}
