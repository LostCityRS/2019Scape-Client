package com.jagex.game.load;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("kp")
public class LoadingScreenProgressDisplayConfig implements LoadingScreenElementConfig {

	@ObfuscatedName("kp.e")
	public final LoadingScreenAlignmentX field3167;

	@ObfuscatedName("kp.n")
	public final LoadingScreenAlignmentY field3159;

	@ObfuscatedName("kp.m")
	public final int field3161;

	@ObfuscatedName("kp.k")
	public final int field3162;

	@ObfuscatedName("kp.f")
	public final int field3163;

	@ObfuscatedName("kp.w")
	public final int field3160;

	@ObfuscatedName("kp.l")
	public final int field3165;

	@ObfuscatedName("kp.u")
	public final int field3166;

	@ObfuscatedName("kp.z")
	public final int field3164;

	public LoadingScreenProgressDisplayConfig(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		this.field3167 = arg0;
		this.field3159 = arg1;
		this.field3161 = arg2;
		this.field3162 = arg3;
		this.field3163 = arg4;
		this.field3160 = arg5;
		this.field3165 = arg6;
		this.field3166 = arg7;
		this.field3164 = arg8;
	}

	@ObfuscatedName("aoe.e(Lalw;I)Lkp;")
	public static LoadingScreenProgressDisplayConfig method18899(Packet arg0) {
		LoadingScreenAlignmentX var1 = LoadingScreenAlignmentX.method13948()[arg0.g1()];
		LoadingScreenAlignmentY var2 = LoadingScreenAlignmentY.method2774()[arg0.g1()];
		int var3 = arg0.g2s();
		int var4 = arg0.g2s();
		int var5 = arg0.g2();
		int var6 = arg0.g2();
		int var7 = arg0.g2s();
		int var8 = arg0.gSmart2or4null();
		int var9 = arg0.g4s();
		return new LoadingScreenProgressDisplayConfig(var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("kp.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return null;
	}

	@ObfuscatedName("xj.k(Lalw;B)Lkp;")
	public static LoadingScreenProgressDisplayConfig method10312(Packet arg0) {
		LoadingScreenProgressDisplayConfig var1 = method18899(arg0);
		int var2 = arg0.gSmart2or4null();
		int var3 = arg0.gSmart2or4null();
		int var4 = arg0.gSmart2or4null();
		int var5 = arg0.gSmart2or4null();
		int var6 = arg0.gSmart2or4null();
		int var7 = arg0.gSmart2or4null();
		return new LoadingScreenRelated4(var1.field3167, var1.field3159, var1.field3161, var1.field3162, var1.field3163, var1.field3160, var1.field3165, var1.field3166, var1.field3164, var2, var3, var4, var5, var6, var7);
	}
}
