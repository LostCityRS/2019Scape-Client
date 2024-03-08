package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqt")
public class class1135 extends class911 {

	@ObfuscatedName("aqt.u")
	public float[] field12094;

	@ObfuscatedName("aqt.z")
	public float[] field12093;

	@ObfuscatedName("aqt.p")
	public int field12095 = 0;

	public class1135(class274 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aqt.ah(I)V")
	public void method16723() {
		this.field12095++;
	}

	@ObfuscatedName("aqt.ag(FFFB)F")
	public float method16722(float arg0, float arg1, float arg2) {
		float var4 = this.field10563 / (float) this.field10565[this.field12095].method6763();
		return (this.field12093[this.field12095] - this.field12094[this.field12095]) * var4 + this.field12094[this.field12095];
	}

	@ObfuscatedName("aqt.ae(FFI)V")
	public void method16721(float arg0, float arg1) {
		this.field10563 += arg0;
		if (this.field10563 > (float) this.field10565[this.field12095].method6763()) {
			this.field10563 = this.field10565[this.field12095].method6763();
		}
	}

	@ObfuscatedName("aqt.m(B)Lox;")
	public class423 method5219() {
		class423 var1 = class423.method6482();
		double[] var2 = this.field10565[this.field12095].method6767(this.field10563);
		var1.field4308 = (float) var2[0];
		var1.field4311 = (float) var2[1];
		var1.field4313 = (float) var2[2];
		return var1;
	}

	@ObfuscatedName("aqt.k(I)[D")
	public double[] method5230() {
		return this.field10565[this.field12095].method6767(this.field10563);
	}

	@ObfuscatedName("aqt.al(I)F")
	public float method16733() {
		return this.field10563;
	}

	@ObfuscatedName("aqt.w(I)F")
	public float method5222() {
		return this.field10565[this.field12095].method6769(this.field10563);
	}

	@ObfuscatedName("aqt.ac(Lalw;IS)V")
	public void method16724(class997 arg0, int arg1) {
		this.field12094 = new float[arg1];
		this.field12093 = new float[arg1];
		this.field12095 = 0;
		for (int var3 = 0; var3 < arg1; var3++) {
			this.field12094[var3] = arg0.method17916();
			this.field12093[var3] = arg0.method17916();
		}
	}
}
