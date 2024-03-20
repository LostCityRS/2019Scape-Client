package com.jagex.math;

import deob.ObfuscatedName;

@ObfuscatedName("oc")
public final class Matrix3x3 {

	@ObfuscatedName("oc.e")
	public float[] data = new float[9];

	public Matrix3x3() {
		this.setToIdentity();
	}

	@ObfuscatedName("oc.e()Lov;")
	public Quaternion method6476() {
		Quaternion var1 = new Quaternion();
		double var2 = (double) (this.data[0] + 1.0F + this.data[4] + this.data[8]);
		if (var2 > 1.0E-8D) {
			float var4 = (float) (Math.sqrt(var2) * 2.0D);
			var1.w = (this.data[7] - this.data[5]) / var4;
			var1.x = (this.data[2] - this.data[6]) / var4;
			var1.y = (this.data[3] - this.data[1]) / var4;
			var1.z = var4 * 0.25F;
		} else if (this.data[0] > this.data[4] && this.data[0] > this.data[8]) {
			float var5 = (float) (Math.sqrt((double) (this.data[0] + 1.0F - this.data[4] - this.data[8])) * 2.0D);
			var1.w = var5 * 0.25F;
			var1.x = (this.data[3] + this.data[1]) / var5;
			var1.y = (this.data[2] + this.data[6]) / var5;
			var1.z = (this.data[7] - this.data[5]) / var5;
		} else if (this.data[4] > this.data[8]) {
			float var6 = (float) (Math.sqrt((double) (this.data[4] + 1.0F - this.data[0] - this.data[8])) * 2.0D);
			var1.w = (this.data[3] + this.data[1]) / var6;
			var1.x = var6 * 0.25F;
			var1.y = (this.data[7] + this.data[5]) / var6;
			var1.z = (this.data[2] - this.data[6]) / var6;
		} else {
			float var7 = (float) (Math.sqrt((double) (this.data[8] + 1.0F - this.data[0] - this.data[4])) * 2.0D);
			var1.w = (this.data[2] + this.data[6]) / var7;
			var1.x = (this.data[7] + this.data[5]) / var7;
			var1.y = var7 * 0.25F;
			var1.z = (this.data[3] - this.data[1]) / var7;
		}
		return var1;
	}

	@ObfuscatedName("oc.n()V")
	public void setToIdentity() {
		this.data[0] = 1.0F;
		this.data[1] = 0.0F;
		this.data[2] = 0.0F;
		this.data[3] = 0.0F;
		this.data[4] = 1.0F;
		this.data[5] = 0.0F;
		this.data[6] = 0.0F;
		this.data[7] = 0.0F;
		this.data[8] = 1.0F;
	}
}
