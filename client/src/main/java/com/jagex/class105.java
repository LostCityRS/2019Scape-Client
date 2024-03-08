package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("cs")
public class class105 {

	@ObfuscatedName("cs.e")
	public final int field1242;

	@ObfuscatedName("cs.n")
	public class105 field1239;

	@ObfuscatedName("cs.m")
	public float[][] field1241;

	@ObfuscatedName("cs.k")
	public final class426[] field1243;

	@ObfuscatedName("cs.f")
	public class426[] field1244;

	@ObfuscatedName("cs.w")
	public class426[] field1240;

	public class105(int arg0, class997 arg1, boolean arg2) {
		this.field1242 = arg1.method17973();
		this.field1243 = new class426[arg0];
		this.field1244 = new class426[this.field1243.length];
		this.field1240 = new class426[this.field1243.length];
		this.field1241 = new float[this.field1243.length][3];
		for (int var4 = 0; var4 < this.field1243.length; var4++) {
			this.field1243[var4] = new class426(arg1, arg2);
			this.field1241[var4][0] = arg1.method17916();
			this.field1241[var4][1] = arg1.method17916();
			this.field1241[var4][2] = arg1.method17916();
		}
	}

	@ObfuscatedName("cs.e(IB)Lpq;")
	public class426 method1570(int arg0) {
		return this.field1243[arg0];
	}

	@ObfuscatedName("cs.n(IB)Lpq;")
	public class426 method1564(int arg0) {
		if (this.field1244[arg0] == null) {
			this.field1244[arg0] = new class426(this.method1570(arg0));
			this.field1244[arg0].method6611();
		}
		return this.field1244[arg0];
	}

	@ObfuscatedName("cs.m(II)Lpq;")
	public class426 method1565(int arg0) {
		if (this.field1240[arg0] == null) {
			this.field1240[arg0] = new class426(this.method1570(arg0));
			if (this.field1239 == null) {
				this.field1240[arg0].method6720(class426.field4317);
			} else {
				this.field1240[arg0].method6720(this.field1239.method1565(arg0));
			}
		}
		return this.field1240[arg0];
	}
}
