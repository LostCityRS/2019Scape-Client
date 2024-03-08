package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asx")
public class class1203 extends class1072 {

	@ObfuscatedName("asx.u")
	public float[] field12479;

	@ObfuscatedName("asx.z")
	public float[] field12477;

	@ObfuscatedName("asx.p")
	public float[] field12478;

	@ObfuscatedName("asx.d")
	public int field12480 = 0;

	public class1203(class274 arg0) {
		super(arg0);
	}

	@ObfuscatedName("asx.h(I)V")
	public void method18836() {
		this.field12480++;
	}

	@ObfuscatedName("asx.b(FFFI)F")
	public float method18835(float arg0, float arg1, float arg2) {
		float var4 = this.field11873 / arg0;
		if (var4 < 0.0F) {
			var4 = 0.0F;
		}
		if (var4 > 1.0F) {
			var4 = 1.0F;
		}
		return arg0 / this.field12478[this.field12480] * ((this.field12477[this.field12480] - this.field12479[this.field12480]) * var4 + this.field12479[this.field12480]);
	}

	@ObfuscatedName("asx.g(Lalw;IB)V")
	public void method18839(class997 arg0, int arg1) {
		this.field12479 = new float[arg1];
		this.field12477 = new float[arg1];
		this.field12478 = new float[arg1];
		this.field12480 = 0;
		for (int var3 = 0; var3 < arg1; var3++) {
			this.field12479[var3] = arg0.method17916();
			this.field12477[var3] = arg0.method17916();
			this.field12478[var3] = arg0.method17916();
		}
	}
}
