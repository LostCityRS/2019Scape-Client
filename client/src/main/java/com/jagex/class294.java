package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("kw")
public class class294 implements class302 {

	@ObfuscatedName("kw.e")
	public final class313 field3025;

	@ObfuscatedName("kw.n")
	public final class301 field3024;

	public class294(class301 arg0, class313 arg1) {
		this.field3025 = arg1;
		this.field3024 = arg0;
	}

	@ObfuscatedName("kw.m(I)Z")
	public boolean method5106() {
		return this.field3024.method5164();
	}

	@ObfuscatedName("kw.e(I)V")
	public void method5104() {
	}

	@ObfuscatedName("kw.n(ZI)V")
	public void method5105(boolean arg0) {
		class296 var2 = this.field3024.method5160(this.field3025.field3157);
		if (var2 == null) {
			return;
		}
		int var3 = this.field3025.field3155.method5382(this.field3025.field3154, client.field10941) + this.field3025.field3150;
		int var4 = this.field3025.field3149.method5375(this.field3025.field3156, client.field10942) + this.field3025.field3151;
		if (this.field3025.field3158) {
			Statics.field8198.method2179(var3, var4, this.field3025.field3154, this.field3025.field3156, this.field3025.field3148, 0);
		}
		int var5 = var4 + this.method5117(Statics.field10355, var2.field3032, var3, var4, 5) * 12;
		int var8 = var5 + 8;
		if (this.field3025.field3158) {
			Statics.field8198.method2185(var3, var8, this.field3025.field3154 + var3 - 1, var8, this.field3025.field3148, 0);
		}
		var5 = var8 + 1;
		int var6 = var5 + this.method5117(Statics.field10355, var2.field3033, var3, var5, 5) * 12;
		int var9 = var6 + 5;
		int var10000 = var9 + this.method5117(Statics.field10355, var2.field3034, var3, var9, 5) * 12;
	}

	@ObfuscatedName("kw.z(Leu;Ljava/lang/String;IIII)I")
	public int method5117(class140 arg0, String arg1, int arg2, int arg3, int arg4) {
		return arg0.method2720(arg1, arg2 + arg4, arg3 + arg4, this.field3025.field3154 - arg4 * 2, this.field3025.field3156 - arg4 * 2, this.field3025.field3152, this.field3025.field3153, 0, 0, 0, null, null, null, 0, 0);
	}
}
