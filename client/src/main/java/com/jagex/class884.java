package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agh")
public class class884 extends class159 {

	@ObfuscatedName("agh.k")
	public final int field10340;

	@ObfuscatedName("agh.f")
	public final int field10341;

	@ObfuscatedName("agh.w")
	public final int field10342;

	@ObfuscatedName("agh.l")
	public final int field10343;

	@ObfuscatedName("agh.u")
	public final int field10344;

	@ObfuscatedName("agh.z")
	public final int field10345;

	@ObfuscatedName("agh.p")
	public final int field10346;

	@ObfuscatedName("agh.d")
	public final int field10338;

	@ObfuscatedName("agh.c")
	public final int field10348;

	@ObfuscatedName("agh.r")
	public final int field10347;

	@ObfuscatedName("agh.v")
	public final int field10350;

	@ObfuscatedName("agh.o")
	public final int field10351;

	@ObfuscatedName("agh.s")
	public final int field10352;

	public class884(class997 arg0, int arg1, int arg2) {
		super(arg0);
		if (arg1 == 0) {
			int var4 = arg0.method17910();
			this.field10342 = var4 >>> 16;
			this.field10343 = var4 & 0xFFFF;
			this.field10341 = -1;
		} else {
			this.field10342 = -1;
			this.field10343 = -1;
			this.field10341 = arg0.method17906();
		}
		if (arg2 == 0) {
			int var5 = arg0.method17910();
			this.field10346 = (var5 >>> 16) * 262144;
			this.field10338 = (var5 & 0xFFFF) * 262144;
			this.field10345 = -1;
		} else {
			this.field10346 = -262144;
			this.field10338 = -262144;
			this.field10345 = arg0.method17906();
		}
		if (arg1 == 0 && arg2 == 0) {
			this.field10340 = arg0.method17904();
		} else {
			this.field10340 = -1;
		}
		this.field10347 = arg0.method17906();
		this.field10344 = arg0.method17904();
		this.field10348 = arg0.method17904();
		this.field10350 = arg0.method17908();
		this.field10351 = arg0.method17906();
		this.field10352 = arg0.method17904();
	}

	@ObfuscatedName("agh.n(I)V")
	public void method2890() {
		int var1;
		int var2;
		int var3;
		if (this.field10342 >= 0) {
			var1 = this.field10342 * 512 + 256;
			var2 = this.field10343 * 512 + 256;
			var3 = this.field10340;
		} else {
			class892 var4 = Statics.field1721[this.field10341].method2870();
			class423 var5 = var4.method10536().field4298;
			var1 = (int) var5.field4308;
			var2 = (int) var5.field4313;
			var3 = var4.field11717;
		}
		int var6;
		int var7;
		if (this.field10343 >= 0) {
			var6 = this.field10346 * 512 + 256;
			var7 = this.field10338 * 512 + 256;
		} else {
			class892 var8 = Statics.field1721[this.field10345].method2870();
			class423 var9 = var8.method10536().field4298;
			var6 = (int) var9.field4308;
			var7 = (int) var9.field4313;
			if (var3 < 0) {
				var3 = var8.field11717;
			}
		}
		int var10 = this.field10352 << 2;
		class1234 var11 = new class1234(client.field10855.method7743(), this.field10347, var3, var3, var1, var2, this.field10344 << 2, client.field10903, this.field10350 + client.field10903, this.field10351, var10, this.field10341 + 1, this.field10345 + 1, this.field10348 << 2, false, 0, 0);
		var11.method19725(var6, var7, this.field10348 << 2, this.field10350 + client.field10903);
		client.field10965.method14153(new class1173(var11));
	}

	@ObfuscatedName("agh.k(I)Z")
	public boolean method2891() {
		class680 var1 = (class680) Statics.field4874.method962(this.field10347);
		boolean var2 = var1.method13803();
		class164 var3 = (class164) Statics.field8797.method962(var1.field8260);
		return var2 & var3.method2991();
	}
}
