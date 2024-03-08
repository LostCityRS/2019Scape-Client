package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("oc")
public final class class422 {

	@ObfuscatedName("oc.e")
	public float[] field4307 = new float[9];

	public class422() {
		this.method6477();
	}

	@ObfuscatedName("oc.e()Lov;")
	public class421 method6476() {
		class421 var1 = new class421();
		double var2 = (double) (this.field4307[0] + 1.0F + this.field4307[4] + this.field4307[8]);
		if (var2 > 1.0E-8D) {
			float var4 = (float) (Math.sqrt(var2) * 2.0D);
			var1.field4301 = (this.field4307[7] - this.field4307[5]) / var4;
			var1.field4304 = (this.field4307[2] - this.field4307[6]) / var4;
			var1.field4305 = (this.field4307[3] - this.field4307[1]) / var4;
			var1.field4300 = var4 * 0.25F;
		} else if (this.field4307[0] > this.field4307[4] && this.field4307[0] > this.field4307[8]) {
			float var5 = (float) (Math.sqrt((double) (this.field4307[0] + 1.0F - this.field4307[4] - this.field4307[8])) * 2.0D);
			var1.field4301 = var5 * 0.25F;
			var1.field4304 = (this.field4307[3] + this.field4307[1]) / var5;
			var1.field4305 = (this.field4307[2] + this.field4307[6]) / var5;
			var1.field4300 = (this.field4307[7] - this.field4307[5]) / var5;
		} else if (this.field4307[4] > this.field4307[8]) {
			float var6 = (float) (Math.sqrt((double) (this.field4307[4] + 1.0F - this.field4307[0] - this.field4307[8])) * 2.0D);
			var1.field4301 = (this.field4307[3] + this.field4307[1]) / var6;
			var1.field4304 = var6 * 0.25F;
			var1.field4305 = (this.field4307[7] + this.field4307[5]) / var6;
			var1.field4300 = (this.field4307[2] - this.field4307[6]) / var6;
		} else {
			float var7 = (float) (Math.sqrt((double) (this.field4307[8] + 1.0F - this.field4307[0] - this.field4307[4])) * 2.0D);
			var1.field4301 = (this.field4307[2] + this.field4307[6]) / var7;
			var1.field4304 = (this.field4307[7] + this.field4307[5]) / var7;
			var1.field4305 = var7 * 0.25F;
			var1.field4300 = (this.field4307[3] - this.field4307[1]) / var7;
		}
		return var1;
	}

	@ObfuscatedName("oc.n()V")
	public void method6477() {
		this.field4307[0] = 1.0F;
		this.field4307[1] = 0.0F;
		this.field4307[2] = 0.0F;
		this.field4307[3] = 0.0F;
		this.field4307[4] = 1.0F;
		this.field4307[5] = 0.0F;
		this.field4307[6] = 0.0F;
		this.field4307[7] = 0.0F;
		this.field4307[8] = 1.0F;
	}
}
