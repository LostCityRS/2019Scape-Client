package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("df")
public class class125 {

	@ObfuscatedName("df.e")
	public class118[] field1453;

	@ObfuscatedName("df.n")
	public int field1451;

	@ObfuscatedName("df.m")
	public class442 field1452;

	@ObfuscatedName("df.k")
	public static boolean field1454 = true;

	public class125(class442 arg0) {
		this.field1452 = arg0;
		this.field1451 = arg0.method6897(0);
		this.method2045();
	}

	@ObfuscatedName("df.e(II)Ldv;")
	public class118 method2043(int arg0) {
		this.method2045();
		return this.field1453[arg0];
	}

	@ObfuscatedName("df.n(I)V")
	public void method2045() {
		if (!field1454) {
			return;
		}
		field1454 = false;
		this.field1453 = new class118[this.field1451];
		for (int var1 = 0; var1 < this.field1451; var1++) {
			class997 var2 = new class997(this.field1452.method6879(0, var1));
			if (var2.field11502 == null) {
				this.field1453[var1] = null;
			} else {
				try {
					class118 var3 = new class118();
					var3.method1909(var1, var2);
					this.field1453[var1] = var3;
				} catch (Exception var5) {
					this.field1453[var1] = null;
				}
			}
		}
	}
}
