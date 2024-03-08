package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("kg")
public class class298 implements class302 {

	@ObfuscatedName("kg.e")
	public final class315 field3039;

	@ObfuscatedName("kg.n")
	public final class442 field3042;

	@ObfuscatedName("kg.m")
	public final class442 field3043;

	@ObfuscatedName("kg.k")
	public class140 field3041;

	@ObfuscatedName("kg.f")
	public long field3040 = -1L;

	@ObfuscatedName("kg.w")
	public int field3038;

	public class298(class442 arg0, class442 arg1, class315 arg2) {
		this.field3042 = arg0;
		this.field3043 = arg1;
		this.field3039 = arg2;
	}

	@ObfuscatedName("kg.n(ZI)V")
	public void method5105(boolean arg0) {
		int var2 = this.field3039.field3177.method5382(0, client.field10941) + this.field3039.field3174;
		int var3 = this.field3039.field3172.method5375(0, client.field10942) + this.field3039.field3171;
		String var4;
		switch(this.field3039.field3168) {
			case 0:
				var4 = Statics.field593.method4853();
				break;
			case 1:
				var4 = "" + Statics.field593.method4851() + "%";
				break;
			case 2:
				var4 = Statics.field593.method4852();
				break;
			default:
				var4 = "";
		}
		int var5 = Statics.field593.method4851();
		if (this.field3040 < 0L || var5 == 0 || this.field3038 != var5) {
			this.field3040 = class213.method3655();
			this.field3038 = var5;
		}
		if (this.field3039.field3168 != 1 && class213.method3655() - this.field3040 > 10000L) {
			var4 = var4 + " (" + Statics.field593.method4855().field2920 + ")";
		}
		this.field3041.method2683(var4, var2, var3, this.field3039.field3176, -1);
	}

	@ObfuscatedName("kg.m(I)Z")
	public boolean method5106() {
		boolean var1 = true;
		if (!this.field3042.method6889(this.field3039.field3175)) {
			var1 = false;
		}
		if (!this.field3043.method6889(this.field3039.field3175)) {
			var1 = false;
		}
		return var1;
	}

	@ObfuscatedName("kg.e(I)V")
	public void method5104() {
		class733 var1 = class733.method10677(this.field3043, this.field3039.field3175, Statics.field7538);
		this.field3041 = Statics.field8198.method2207(var1, class111.method1607(this.field3042, this.field3039.field3175), true);
	}
}
