package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqh")
public class class1136 extends class911 {

	@ObfuscatedName("aqh.u")
	public float[] field12098;

	@ObfuscatedName("aqh.z")
	public float[] field12097;

	@ObfuscatedName("aqh.p")
	public float[] field12099;

	@ObfuscatedName("aqh.d")
	public int field12096 = 0;

	public class1136(class274 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aqh.ah(I)V")
	public void method16723() {
		this.field12096++;
	}

	@ObfuscatedName("aqh.ag(FFFB)F")
	public float method16722(float arg0, float arg1, float arg2) {
		float var4 = this.field10563 / arg0;
		if (var4 < 0.0F) {
			var4 = 0.0F;
		}
		if (var4 > 1.0F) {
			var4 = 1.0F;
		}
		return arg0 / this.field12099[this.field12096] * ((this.field12097[this.field12096] - this.field12098[this.field12096]) * var4 + this.field12098[this.field12096]);
	}

	@ObfuscatedName("aqh.ac(Lalw;IS)V")
	public void method16724(class997 arg0, int arg1) {
		this.field12098 = new float[arg1];
		this.field12097 = new float[arg1];
		this.field12099 = new float[arg1];
		this.field12096 = 0;
		for (int var3 = 0; var3 < arg1; var3++) {
			this.field12098[var3] = arg0.method17916();
			this.field12097[var3] = arg0.method17916();
			this.field12099[var3] = arg0.method17916();
		}
	}
}
