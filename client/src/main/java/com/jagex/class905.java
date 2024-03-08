package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ahx")
public class class905 extends class295 {

	public class905(class442 arg0, class442 arg1, class914 arg2) {
		super(arg0, arg1, arg2);
	}

	@ObfuscatedName("ahx.p(ZIII)V")
	public void method5122(boolean arg0, int arg1, int arg2) {
		int var4 = this.method5123() * this.field3027.field3163 / 10000;
		Statics.field8198.method2354(arg1, arg2 + 2, var4, this.field3027.field3160 - 2, ((class914) this.field3027).field10580, 0);
		Statics.field8198.method2354(arg1 + var4, arg2 + 2, this.field3027.field3163 - var4, this.field3027.field3160 - 2, 0, 0);
	}

	@ObfuscatedName("ahx.z(ZIIS)V")
	public void method5121(boolean arg0, int arg1, int arg2) {
		Statics.field8198.method2179(arg1 - 2, arg2, this.field3027.field3163 + 4, this.field3027.field3160 + 2, ((class914) this.field3027).field10579, 0);
		Statics.field8198.method2179(arg1 - 1, arg2 + 1, this.field3027.field3163 + 2, this.field3027.field3160, 0, 0);
	}
}
