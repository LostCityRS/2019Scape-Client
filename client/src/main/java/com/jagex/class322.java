package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("la")
public class class322 implements LoadingScreenElementConfig {

	@ObfuscatedName("la.e")
	public final int field3218;

	@ObfuscatedName("la.n")
	public final LoadingScreenAlignmentX field3215;

	@ObfuscatedName("la.m")
	public final LoadingScreenAlignmentY field3214;

	@ObfuscatedName("la.k")
	public final int field3216;

	@ObfuscatedName("la.f")
	public final int field3217;

	public class322(int arg0, LoadingScreenAlignmentX arg1, LoadingScreenAlignmentY arg2, int arg3, int arg4) {
		this.field3218 = arg0;
		this.field3215 = arg1;
		this.field3214 = arg2;
		this.field3216 = arg3;
		this.field3217 = arg4;
	}

	@ObfuscatedName("nu.e(Lalw;I)Lla;")
	public static class322 method6073(Packet arg0) {
		int var1 = arg0.gSmart2or4null();
		LoadingScreenAlignmentX var2 = LoadingScreenAlignmentX.method13948()[arg0.g1()];
		LoadingScreenAlignmentY var3 = LoadingScreenAlignmentY.method2774()[arg0.g1()];
		int var4 = arg0.g2s();
		int var5 = arg0.g2s();
		return new class322(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("la.n(S)Lkt;")
	public class319 method5349() {
		return class319.field3194;
	}
}
