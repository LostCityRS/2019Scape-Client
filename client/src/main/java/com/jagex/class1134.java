package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqx")
public class class1134 extends class911 {

	public class1134(class274 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aqx.ag(FFFB)F")
	public float method16722(float arg0, float arg1, float arg2) {
		float var4 = arg0 - this.field10563;
		if (this.field3084.method4778().field4308 == Float.POSITIVE_INFINITY) {
			arg1 = this.field3084.method4693().method6519();
		} else {
			float var5 = arg1 / this.field3084.method4778().method6519();
			float var6 = arg1 / 2.0F * var5;
			if (var6 > var4) {
				arg1 -= this.field3084.method4778().method6519() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.field3084.method4693().method6519()) {
				arg1 += this.field3084.method4778().method6519() * arg2;
				if (arg1 > this.field3084.method4693().method6519()) {
					arg1 = this.field3084.method4693().method6519();
				}
			}
		}
		return arg1;
	}

	@ObfuscatedName("aqx.ah(I)V")
	public void method16723() {
	}

	@ObfuscatedName("aqx.ac(Lalw;IS)V")
	public void method16724(class997 arg0, int arg1) {
	}
}
