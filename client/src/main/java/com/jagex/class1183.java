package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asy")
public class class1183 extends class986 {

	@ObfuscatedName("asy.l")
	public int field12359;

	@ObfuscatedName("asy.u")
	public String field12351;

	@ObfuscatedName("asy.z")
	public String field12352;

	@ObfuscatedName("asy.p")
	public class715 field12353;

	@ObfuscatedName("asy.d")
	public int field12354;

	@ObfuscatedName("asy.c")
	public int field12355 = -1;

	@ObfuscatedName("asy.r")
	public int field12356 = -1;

	@ObfuscatedName("asy.v")
	public int field12357 = 16384;

	@ObfuscatedName("asy.o")
	public int field12358 = 0;

	@ObfuscatedName("asy.s")
	public int field12361 = 16384;

	@ObfuscatedName("asy.y")
	public int field12360 = 0;

	@ObfuscatedName("asy.q")
	public boolean field12350 = true;

	public class1183(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		this.field12359 = arg0;
		this.field12351 = arg1;
		this.field12352 = arg2;
		this.field12354 = arg3;
		this.field12355 = arg4;
		this.field12350 = arg5;
		this.field12356 = arg6;
		if (this.field12356 == 255) {
			this.field12356 = 0;
		}
		class254.method3061(arg7);
		this.field12353 = new class715();
	}

	@ObfuscatedName("asy.e(III)Z")
	public boolean method19469(int arg0, int arg1) {
		for (class991 var3 = (class991) this.field12353.method14191(); var3 != null; var3 = (class991) this.field12353.method14161()) {
			if (var3.method17818(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("asy.n(II[II)Z")
	public boolean method19482(int arg0, int arg1, int[] arg2) {
		for (class991 var4 = (class991) this.field12353.method14191(); var4 != null; var4 = (class991) this.field12353.method14161()) {
			if (var4.method17814(arg0, arg1)) {
				var4.method17812(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("asy.m(II[II)Z")
	public boolean method19470(int arg0, int arg1, int[] arg2) {
		for (class991 var4 = (class991) this.field12353.method14191(); var4 != null; var4 = (class991) this.field12353.method14161()) {
			if (var4.method17818(arg0, arg1)) {
				var4.method17816(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("asy.k(III[II)Z")
	public boolean method19471(int arg0, int arg1, int arg2, int[] arg3) {
		for (class991 var5 = (class991) this.field12353.method14191(); var5 != null; var5 = (class991) this.field12353.method14161()) {
			if (var5.method17815(arg0, arg1, arg2)) {
				var5.method17816(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("asy.f(S)V")
	public void method19472() {
		this.field12357 = 16384;
		this.field12358 = 0;
		this.field12361 = 16384;
		this.field12360 = 0;
		for (class991 var1 = (class991) this.field12353.method14191(); var1 != null; var1 = (class991) this.field12353.method14161()) {
			if (var1.field11456 < this.field12357) {
				this.field12357 = var1.field11456;
			}
			if (var1.field11460 > this.field12358) {
				this.field12358 = var1.field11460;
			}
			if (var1.field11459 < this.field12361) {
				this.field12361 = var1.field11459;
			}
			if (var1.field11461 > this.field12360) {
				this.field12360 = var1.field11461;
			}
		}
	}

	@ObfuscatedName("gq.w(Lpy;II)Lasy;")
	public static class1183 method3468(class442 arg0, int arg1) {
		class997 var2 = new class997(arg0.method6879(0, arg1));
		return method18854(var2, arg1);
	}

	@ObfuscatedName("aow.l(Lalw;II)Lasy;")
	public static class1183 method18854(class997 arg0, int arg1) {
		class1183 var2 = new class1183(arg1, arg0.method17918(), arg0.method17918(), arg0.method17910(), arg0.method17910(), arg0.method17904() == 1, arg0.method17904(), arg0.method17904());
		int var3 = arg0.method17904();
		for (int var4 = 0; var4 < var3; var4++) {
			var2.field12353.method14153(new class991(arg0.method17904(), arg0.method17906(), arg0.method17906(), arg0.method17906(), arg0.method17906(), arg0.method17906(), arg0.method17906(), arg0.method17906(), arg0.method17906()));
		}
		var2.method19472();
		return var2;
	}
}
