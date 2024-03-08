package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("arr")
public class class1177 extends class986 {

	@ObfuscatedName("arr.z")
	public int field12324;

	@ObfuscatedName("arr.p")
	public byte[][] field12323;

	@ObfuscatedName("arr.d")
	public class134[] field12327;

	@ObfuscatedName("vw.e(Lpy;Lpy;II)V")
	public static void method9393(class442 arg0, class442 arg1, int arg2) {
		Statics.field12325 = arg0;
		Statics.field12326 = arg1;
	}

	public class1177(int arg0) {
		this.field12324 = arg0;
	}

	@ObfuscatedName("arr.n(I)Z")
	public boolean method19410() {
		if (this.field12327 != null) {
			return true;
		}
		if (this.field12323 == null) {
			class442 var1 = Statics.field12325;
			synchronized (Statics.field12325) {
				if (!Statics.field12325.method6927(this.field12324)) {
					return false;
				}
				int[] var2 = Statics.field12325.method6895(this.field12324);
				this.field12323 = new byte[var2.length][];
				for (int var3 = 0; var3 < var2.length; var3++) {
					this.field12323[var3] = Statics.field12325.method6879(this.field12324, var2[var3]);
				}
			}
		}
		boolean var5 = true;
		for (int var6 = 0; var6 < this.field12323.length; var6++) {
			byte[] var7 = this.field12323[var6];
			class997 var8 = new class997(var7);
			var8.field11503 = -1445626955;
			int var9 = var8.method17906();
			class442 var10 = Statics.field12326;
			synchronized (Statics.field12326) {
				var5 &= Statics.field12326.method6889(var9);
			}
		}
		if (!var5) {
			return false;
		}
		class715 var12 = new class715();
		class442 var13 = Statics.field12325;
		int[] var15;
		synchronized (Statics.field12325) {
			int var14 = Statics.field12325.method6897(this.field12324);
			this.field12327 = new class134[var14];
			var15 = Statics.field12325.method6895(this.field12324);
		}
		for (int var17 = 0; var17 < var15.length; var17++) {
			byte[] var18 = this.field12323[var17];
			class997 var19 = new class997(var18);
			var19.field11503 = -1445626955;
			int var20 = var19.method17906();
			class971 var21 = null;
			for (class971 var22 = (class971) var12.method14191(); var22 != null; var22 = (class971) var12.method14161()) {
				if (var22.field11312 == var20) {
					var21 = var22;
					break;
				}
			}
			if (var21 == null) {
				class442 var23 = Statics.field12326;
				synchronized (Statics.field12326) {
					var21 = new class971(var20, Statics.field12326.method6894(var20));
				}
				var12.method14153(var21);
			}
			this.field12327[var15[var17]] = new class134(var18, var21);
		}
		this.field12323 = null;
		return true;
	}

	@ObfuscatedName("arr.m(II)Z")
	public boolean method19411(int arg0) {
		return this.field12327[arg0].field1636;
	}

	@ObfuscatedName("arr.k(II)Z")
	public boolean method19412(int arg0) {
		return this.field12327[arg0].field1637;
	}

	@ObfuscatedName("arr.f(II)Z")
	public boolean method19409(int arg0) {
		return this.field12327[arg0].field1638;
	}
}
