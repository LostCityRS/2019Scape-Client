package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agi")
public class class868 extends class159 {

	@ObfuscatedName("agi.n")
	public final int field10281;

	@ObfuscatedName("agi.m")
	public final int field10279;

	@ObfuscatedName("agi.k")
	public final int field10280;

	@ObfuscatedName("agi.f")
	public final int field10282;

	@ObfuscatedName("agi.w")
	public final int field10278;

	public class868(class997 arg0) {
		super(arg0);
		this.field10281 = arg0.method17906();
		int var2 = arg0.method17904();
		if ((var2 & 0x1) == 0) {
			this.field10279 = -1;
			this.field10280 = -1;
		} else {
			this.field10279 = arg0.method17906();
			this.field10280 = arg0.method17906();
		}
		if ((var2 & 0x2) == 0) {
			this.field10282 = -1;
			this.field10278 = -1;
		} else {
			this.field10282 = arg0.method17906();
			this.field10278 = arg0.method17906();
		}
		if ((var2 & 0x4) != 0) {
			int var3 = arg0.method17906();
			int var4 = arg0.method17906();
			int var5 = var3 * 255 / var4;
			if (var3 > 0 && var5 < 1) {
				boolean var6 = true;
			}
		}
	}

	@ObfuscatedName("agi.n(I)V")
	public void method2890() {
		class892 var1 = Statics.field1721[this.field10281].method2870();
		var1.method16498(this.field10279, this.field10280, this.field10282, this.field10278, client.field10903, 0);
	}
}
