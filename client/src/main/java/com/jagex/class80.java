package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("br")
public class class80 {

	@ObfuscatedName("br.e")
	public int field1054;

	@ObfuscatedName("br.n")
	public int field1050 = 128;

	@ObfuscatedName("br.m")
	public int field1051 = 128;

	@ObfuscatedName("br.k")
	public int field1049;

	@ObfuscatedName("br.f")
	public int field1052;

	@ObfuscatedName("br.w")
	public int field1053;

	public class80(int arg0) {
		this.field1054 = arg0;
	}

	public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field1054 = arg0;
		this.field1050 = arg1;
		this.field1051 = arg2;
		this.field1049 = arg3;
		this.field1052 = arg4;
		this.field1053 = arg5;
	}

	@ObfuscatedName("br.e()Lbr;")
	public class80 method1299() {
		return new class80(this.field1054, this.field1050, this.field1051, this.field1049, this.field1052, this.field1053);
	}

	@ObfuscatedName("br.n(Lbr;)V")
	public void method1298(class80 arg0) {
		this.field1050 = arg0.field1050;
		this.field1051 = arg0.field1051;
		this.field1049 = arg0.field1049;
		this.field1052 = arg0.field1052;
		this.field1054 = arg0.field1054;
		this.field1053 = arg0.field1053;
	}
}
