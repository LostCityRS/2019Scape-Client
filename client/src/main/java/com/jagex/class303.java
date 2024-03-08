package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ki")
public class class303 implements class302 {

	@ObfuscatedName("ki.e")
	public final class321 field3054;

	@ObfuscatedName("ki.n")
	public final class442 field3053;

	@ObfuscatedName("ki.m")
	public final class442 field3052;

	@ObfuscatedName("ki.k")
	public class140 field3055;

	public class303(class442 arg0, class442 arg1, class321 arg2) {
		this.field3054 = arg2;
		this.field3053 = arg0;
		this.field3052 = arg1;
	}

	@ObfuscatedName("ki.e(I)V")
	public void method5104() {
		class733 var1 = class733.method10677(this.field3052, this.field3054.field3211, Statics.field7538);
		this.field3055 = Statics.field8198.method2207(var1, class111.method1607(this.field3053, this.field3054.field3211), true);
	}

	@ObfuscatedName("ki.n(ZI)V")
	public void method5105(boolean arg0) {
		if (arg0) {
			int var2 = this.field3054.field3201.method5382(this.field3054.field3209, client.field10941) + this.field3054.field3204;
			int var3 = this.field3054.field3208.method5375(this.field3054.field3206, client.field10942) + this.field3054.field3205;
			this.field3055.method2720(this.field3054.field3203, var2, var3, this.field3054.field3209, this.field3054.field3206, this.field3054.field3212, this.field3054.field3213, this.field3054.field3210, this.field3054.field3207, this.field3054.field3202, null, null, null, 0, 0);
		}
	}

	@ObfuscatedName("ki.m(I)Z")
	public boolean method5106() {
		boolean var1 = true;
		if (!this.field3053.method6889(this.field3054.field3211)) {
			var1 = false;
		}
		if (!this.field3052.method6889(this.field3054.field3211)) {
			var1 = false;
		}
		return var1;
	}
}
