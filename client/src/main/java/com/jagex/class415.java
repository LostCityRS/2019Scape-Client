package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("og")
public class class415 {

	@ObfuscatedName("og.e")
	public float field4244;

	@ObfuscatedName("og.n")
	public float field4243;

	@ObfuscatedName("og.m")
	public float field4242;

	@ObfuscatedName("og.k")
	public float field4245;

	public class415() {
		this.method6246();
	}

	public class415(float arg0, float arg1, float arg2, float arg3) {
		this.method6247(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("og.e(FFFF)V")
	public void method6247(float arg0, float arg1, float arg2, float arg3) {
		this.field4244 = arg0;
		this.field4243 = arg1;
		this.field4242 = arg2;
		this.field4245 = arg3;
	}

	@ObfuscatedName("og.n(Log;)V")
	public void method6248(class415 arg0) {
		this.method6247(arg0.field4244, arg0.field4243, arg0.field4242, arg0.field4245);
	}

	@ObfuscatedName("og.m(I)V")
	public void method6249(int arg0) {
		this.method6247((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@ObfuscatedName("og.k()V")
	public final void method6246() {
		this.field4245 = 0.0F;
		this.field4242 = 0.0F;
		this.field4243 = 0.0F;
		this.field4244 = 0.0F;
	}

	@ObfuscatedName("og.f()V")
	public final void method6259() {
		this.field4244 = -this.field4244;
		this.field4243 = -this.field4243;
		this.field4242 = -this.field4242;
		this.field4245 = -this.field4245;
	}

	@ObfuscatedName("og.w(F)V")
	public final void method6252(float arg0) {
		this.field4244 *= arg0;
		this.field4243 *= arg0;
		this.field4242 *= arg0;
		this.field4245 *= arg0;
	}

	@ObfuscatedName("og.l(Lpq;)V")
	public final void method6265(class426 arg0) {
		float var2 = this.field4244;
		float var3 = this.field4243;
		float var4 = this.field4242;
		float var5 = this.field4245;
		this.field4244 = arg0.field4315[12] * var5 + arg0.field4315[8] * var4 + arg0.field4315[0] * var2 + arg0.field4315[4] * var3;
		this.field4243 = arg0.field4315[13] * var5 + arg0.field4315[9] * var4 + arg0.field4315[1] * var2 + arg0.field4315[5] * var3;
		this.field4242 = arg0.field4315[14] * var5 + arg0.field4315[10] * var4 + arg0.field4315[2] * var2 + arg0.field4315[6] * var3;
		this.field4245 = arg0.field4315[15] * var5 + arg0.field4315[11] * var4 + arg0.field4315[3] * var2 + arg0.field4315[7] * var3;
	}

	public String toString() {
		return this.field4244 + "," + this.field4243 + "," + this.field4242 + "," + this.field4245;
	}
}
