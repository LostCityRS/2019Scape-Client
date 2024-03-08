package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("dt")
public class class115 implements class685 {

	@ObfuscatedName("dt.e")
	public static final class115 field1296 = new class115(0, 0, null, 0);

	@ObfuscatedName("dt.n")
	public static final class115 field1292 = new class115(1, 1, null, 3);

	@ObfuscatedName("dt.m")
	public static final class115 field1297 = new class115(2, 2, null, 3);

	@ObfuscatedName("dt.k")
	public static final class115 field1291 = new class115(3, 3, null, 6);

	@ObfuscatedName("dt.f")
	public static final class115 field1294 = new class115(4, 4, null, 1);

	@ObfuscatedName("dt.w")
	public final int field1295;

	@ObfuscatedName("dt.l")
	public final int field1293;

	@ObfuscatedName("dt.u")
	public final int field1290;

	@ObfuscatedName("pj.e(I)[Ldt;")
	public static class115[] method6986() {
		return new class115[] { field1296, field1292, field1297, field1291, field1294 };
	}

	public class115(int arg0, int arg1, String arg2, int arg3) {
		this.field1295 = arg0;
		this.field1293 = arg1;
		this.field1290 = arg3;
	}

	@ObfuscatedName("aqz.m(IS)Ldt;")
	public static class115 method19197(int arg0) {
		class115 var1 = (class115) class686.method1897(method6986(), arg0);
		if (var1 == null) {
			var1 = field1296;
		}
		return var1;
	}

	@ObfuscatedName("dt.f(I)I")
	public int method1674() {
		return this.field1290;
	}

	@ObfuscatedName("dt.n()I")
	public int method1303() {
		return this.field1293;
	}
}
