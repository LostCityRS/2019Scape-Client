package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("atd")
public class class1227 extends class1180 {

	@ObfuscatedName("atd.u")
	public class248 field12553;

	@ObfuscatedName("atd.z")
	public float field12555;

	@ObfuscatedName("atd.p")
	public float field12554;

	@ObfuscatedName("atd.d")
	public float field12552;

	public class1227(int arg0, class248 arg1, float arg2, float arg3) {
		super(arg0);
		this.field12553 = arg1;
		this.field12555 = arg2;
		this.field12554 = arg3;
	}

	public class1227(int arg0, class997 arg1) {
		super(arg0);
		this.field12553 = Statics.method1599(arg1.method17904());
		this.field12555 = arg1.method17916();
		this.field12554 = arg1.method17916();
	}

	@ObfuscatedName("atd.n(FI)V")
	public void method19431(float arg0) {
		this.field12552 += this.field12554 * arg0;
	}

	@ObfuscatedName("atd.m(Lju;Lou;Lpq;I)V")
	public void method19440(class270 arg0, class419 arg1, class426 arg2) {
		float var4 = (float) Math.sin((double) this.field12552);
		float var5 = this.field12555 * var4;
		if (class248.field2625 == this.field12553) {
			arg0.field2835 = (int) ((float) arg0.field2835 + var5);
			arg1.method6315(var5, 0.0F, 0.0F);
		} else if (class248.field2620 == this.field12553) {
			arg0.field2836 = (int) ((float) arg0.field2836 + var5);
			arg1.method6315(0.0F, var5, 0.0F);
		} else if (class248.field2619 == this.field12553) {
			arg0.field2837 = (int) ((float) arg0.field2837 + var5);
			arg1.method6315(0.0F, 0.0F, var5);
		} else if (class248.field2622 == this.field12553) {
			arg1.method6307(1.0F, 0.0F, 0.0F, var5);
		} else if (class248.field2623 == this.field12553) {
			arg1.method6307(0.0F, 1.0F, 0.0F, var5);
		} else if (class248.field2624 == this.field12553) {
			arg1.method6307(0.0F, 0.0F, 1.0F, var5);
		}
	}

	@ObfuscatedName("atd.k(Lalw;I)V")
	public void method19434(class997 arg0) {
		this.field12553 = Statics.method1599(arg0.method17904());
		this.field12555 = arg0.method17916();
		this.field12554 = arg0.method17916();
	}
}
