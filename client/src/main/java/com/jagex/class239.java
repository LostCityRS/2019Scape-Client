package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hj")
public class class239 {

	@ObfuscatedName("hj.e")
	public String field2577;

	@ObfuscatedName("hj.k")
	public class240[] field2580;

	@ObfuscatedName("hj.f")
	public class240[] field2581;

	@ObfuscatedName("hj.w")
	public class233[] field2582;

	public class239(byte[] arg0) throws class1107 {
		this.method4279(arg0);
	}

	@ObfuscatedName("hj.e([BB)V")
	public void method4279(byte[] arg0) throws class1107 {
		class235 var2 = new class235(arg0);
		int var3 = var2.method4133();
		if (var3 != 4) {
			throw new class1107(this, var3, 4);
		}
		this.field2577 = var2.method4134();
		this.field2580 = new class240[var2.method4133()];
		this.field2581 = new class240[var2.method4133()];
		this.field2582 = new class233[var2.method4133()];
		for (int var4 = 0; var4 < this.field2580.length; var4++) {
			this.field2580[var4] = new class240();
			this.field2580[var4].method4290(var2);
		}
		for (int var5 = 0; var5 < this.field2581.length; var5++) {
			this.field2581[var5] = new class240();
			this.field2581[var5].method4290(var2);
		}
		for (int var6 = 0; var6 < this.field2582.length; var6++) {
			this.field2582[var6] = new class233();
			this.field2582[var6].method4077(var2);
		}
	}
}
