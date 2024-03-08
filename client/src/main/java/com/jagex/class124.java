package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("dn")
public class class124 {

	@ObfuscatedName("dn.e")
	public boolean field1435;

	@ObfuscatedName("dn.n")
	public boolean field1444;

	@ObfuscatedName("dn.m")
	public class132 field1437;

	@ObfuscatedName("dn.k")
	public class132 field1438;

	@ObfuscatedName("dn.f")
	public class139[] field1439;

	@ObfuscatedName("dn.w")
	public boolean field1440;

	@ObfuscatedName("dn.l")
	public float field1441;

	@ObfuscatedName("dn.u")
	public float field1443;

	@ObfuscatedName("dn.z")
	public float[] field1449 = new float[4];

	@ObfuscatedName("dn.p")
	public float[] field1442 = new float[4];

	@ObfuscatedName("dn.d")
	public boolean field1445 = true;

	@ObfuscatedName("dn.c")
	public int field1446 = 0;

	@ObfuscatedName("dn.r")
	public float[] field1447;

	@ObfuscatedName("dn.v")
	public float field1448;

	@ObfuscatedName("dn.o")
	public float field1436;

	@ObfuscatedName("dn.e(Lalw;II)I")
	public int method2036(class997 arg0, int arg1) {
		int var3 = arg0.method17906();
		class106.method2995(arg0.method17904());
		this.field1437 = Statics.method713(arg0.method17904());
		this.field1438 = Statics.method713(arg0.method17904());
		this.field1435 = arg0.method17904() != 0;
		this.field1439 = new class139[var3];
		class139 var4 = null;
		for (int var5 = 0; var5 < var3; var5++) {
			class139 var6 = new class139();
			var6.method2673(arg0, arg1);
			this.field1439[var5] = var6;
			if (var4 != null) {
				var4.field1665 = var6;
			}
			var4 = var6;
		}
		this.field1447 = new float[this.method2020() + 1];
		for (int var7 = this.method2018(); var7 <= this.method2029(); var7++) {
			this.field1447[var7 - this.method2018()] = class114.method9083(this, (float) var7);
		}
		this.field1448 = class114.method9083(this, (float) (this.method2018() - 1));
		this.field1436 = class114.method9083(this, (float) (this.method2029() + 1));
		return var3;
	}

	@ObfuscatedName("dn.n(II)F")
	public float method2017(int arg0) {
		if (arg0 < this.method2018()) {
			return this.field1448;
		} else if (arg0 > this.method2029()) {
			return this.field1436;
		} else {
			return this.field1447[arg0 - this.method2018()];
		}
	}

	@ObfuscatedName("dn.m(I)I")
	public int method2018() {
		return this.field1439 == null ? 0 : this.field1439[0].field1663;
	}

	@ObfuscatedName("dn.k(I)I")
	public int method2029() {
		return this.field1439 == null ? 0 : this.field1439[this.method2015() - 1].field1663;
	}

	@ObfuscatedName("dn.f(I)I")
	public int method2020() {
		return this.method2029() - this.method2018();
	}

	@ObfuscatedName("dn.w(FB)I")
	public int method2021(float arg0) {
		if (this.field1446 >= 0 && (float) this.field1439[this.field1446].field1663 <= arg0 && (this.field1439[this.field1446].field1665 == null || (float) this.field1439[this.field1446].field1665.field1663 > arg0)) {
			return this.field1446;
		} else if (arg0 < (float) this.method2018() || arg0 > (float) this.method2029()) {
			return -1;
		} else {
			int var2 = this.method2015();
			int var3 = this.field1446;
			if (var2 > 0) {
				int var4 = 0;
				int var5 = var2 - 1;
				do {
					int var6 = var4 + var5 >> 1;
					if (arg0 < (float) this.field1439[var6].field1663) {
						if (arg0 > (float) this.field1439[var6 - 1].field1663) {
							var3 = var6 - 1;
							break;
						}
						var5 = var6 - 1;
					} else {
						if (!(arg0 > (float) this.field1439[var6].field1663)) {
							var3 = var6;
							break;
						}
						if (arg0 < (float) this.field1439[var6 + 1].field1663) {
							var3 = var6;
							break;
						}
						var4 = var6 + 1;
					}
				} while (var4 <= var5);
			}
			if (this.field1446 != var3) {
				this.field1446 = var3;
				this.field1445 = true;
			}
			return this.field1446;
		}
	}

	@ObfuscatedName("dn.l(FI)Ley;")
	public class139 method2022(float arg0) {
		int var2 = this.method2021(arg0);
		return var2 >= 0 && var2 < this.field1439.length ? this.field1439[var2] : null;
	}

	@ObfuscatedName("dn.u(I)I")
	public int method2015() {
		return this.field1439 == null ? 0 : this.field1439.length;
	}
}
