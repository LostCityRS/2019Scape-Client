package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ard")
public class class1176 extends class986 {

	@ObfuscatedName("ard.z")
	public int field12315;

	@ObfuscatedName("ard.p")
	public byte[] field12314;

	@ObfuscatedName("ard.d")
	public class124[][] field12322 = (class124[][]) null;

	@ObfuscatedName("ard.c")
	public int field12316;

	@ObfuscatedName("ard.r")
	public int field12313;

	@ObfuscatedName("ard.v")
	public class971 field12317;

	@ObfuscatedName("ard.o")
	public int field12319 = 0;

	@ObfuscatedName("ard.s")
	public boolean field12320;

	@ObfuscatedName("ard.y")
	public boolean field12321;

	@ObfuscatedName("ard.q")
	public boolean field12318;

	@ObfuscatedName("vz.e(Lpy;Lpy;B)V")
	public static void method9558(class442 arg0, class442 arg1) {
		Statics.field7411 = arg0;
		Statics.field8302 = arg1;
	}

	public class1176(int arg0) {
		this.field12315 = arg0;
	}

	@ObfuscatedName("ard.n(I)Z")
	public boolean method19395() {
		if (this.field12322 != null) {
			return true;
		}
		if (this.field12314 == null) {
			class442 var1 = Statics.field7411;
			synchronized (Statics.field7411) {
				this.field12314 = Statics.field7411.method6894(this.field12315);
				if (this.field12314 == null) {
					return false;
				}
			}
		}
		boolean var3 = true;
		class997 var4 = new class997(this.field12314);
		int var5 = var4.method17904();
		int var6 = var4.method17906();
		class442 var7 = Statics.field8302;
		boolean var8;
		synchronized (Statics.field8302) {
			var8 = var3 & Statics.field8302.method6889(var6);
		}
		if (!var8) {
			return false;
		}
		class442 var10 = Statics.field7411;
		synchronized (Statics.field7411) {
			this.field12317 = new class971(var6, Statics.field8302.method6894(var6));
			this.method19379(var4, var5);
			this.field12314 = null;
			return true;
		}
	}

	@ObfuscatedName("ard.m(Lalw;IB)V")
	public void method19379(class997 arg0, int arg1) {
		this.field12316 = arg0.method17906();
		this.field12313 = arg0.method17906();
		this.field12319 = arg0.method17904();
		int var3 = arg0.method17906();
		this.field12322 = new class124[this.field12317.field11313][];
		for (int var4 = 0; var4 < var3; var4++) {
			class115 var5 = class115.method19197(arg0.method17904());
			int var6 = arg0.method17922();
			class100 var7 = class100.method8644(arg0.method17904());
			class124 var8 = new class124();
			var8.method2036(arg0, arg1);
			int var9 = var5.method1674();
			if (this.field12322[var6] == null) {
				this.field12322[var6] = new class124[var9];
			}
			this.field12322[var6][var7.method1421()] = var8;
			if (class115.field1297 == var5) {
				this.field12318 = true;
			} else if (class115.field1291 == var5) {
				this.field12320 = true;
			} else if (class115.field1294 == var5) {
				this.field12321 = true;
			}
		}
	}

	@ObfuscatedName("ard.k(S)I")
	public int method19382() {
		return this.field12316;
	}

	@ObfuscatedName("ard.f(B)I")
	public int method19383() {
		return this.field12313;
	}

	@ObfuscatedName("ard.w(I)I")
	public int method19381() {
		return this.field12319;
	}

	@ObfuscatedName("ard.l(I)I")
	public int method19384() {
		return this.method19383() - this.method19382();
	}

	@ObfuscatedName("ard.u(I)Z")
	public boolean method19406() {
		return this.field12320;
	}

	@ObfuscatedName("ard.z(I)Z")
	public boolean method19387() {
		return this.field12321;
	}

	@ObfuscatedName("ard.p(I)Z")
	public boolean method19407() {
		return this.field12318;
	}
}
