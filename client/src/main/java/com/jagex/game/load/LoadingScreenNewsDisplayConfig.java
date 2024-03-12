package com.jagex.game.load;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("kn")
public class LoadingScreenNewsDisplayConfig implements LoadingScreenElementConfig {

	@ObfuscatedName("kn.e")
	public final LoadingScreenAlignmentX field3155;

	@ObfuscatedName("kn.n")
	public final LoadingScreenAlignmentY field3149;

	@ObfuscatedName("kn.m")
	public final int field3150;

	@ObfuscatedName("kn.k")
	public final int field3151;

	@ObfuscatedName("kn.f")
	public final int field3152;

	@ObfuscatedName("kn.w")
	public final int field3153;

	@ObfuscatedName("kn.l")
	public final int field3148;

	@ObfuscatedName("kn.u")
	public final int field3154;

	@ObfuscatedName("kn.z")
	public final int field3156;

	@ObfuscatedName("kn.p")
	public final int field3157;

	@ObfuscatedName("kn.d")
	public final boolean field3158;

	public LoadingScreenNewsDisplayConfig(int arg0, LoadingScreenAlignmentX arg1, LoadingScreenAlignmentY arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
		this.field3157 = arg0;
		this.field3155 = arg1;
		this.field3149 = arg2;
		this.field3150 = arg3;
		this.field3151 = arg4;
		this.field3154 = arg5;
		this.field3156 = arg6;
		this.field3152 = arg7;
		this.field3153 = arg8;
		this.field3148 = arg9;
		this.field3158 = arg10;
	}

	@ObfuscatedName("on.e(Lalw;I)Lkn;")
	public static LoadingScreenNewsDisplayConfig method6241(Packet arg0) {
		int var1 = arg0.g1();
		LoadingScreenAlignmentX var2 = LoadingScreenAlignmentX.method13948()[arg0.g1()];
		LoadingScreenAlignmentY var3 = LoadingScreenAlignmentY.method2774()[arg0.g1()];
		int var4 = arg0.g2s();
		int var5 = arg0.g2s();
		int var6 = arg0.g2();
		int var7 = arg0.g2();
		int var8 = arg0.g4s();
		int var9 = arg0.g4s();
		int var10 = arg0.g4s();
		boolean var11 = arg0.g1() == 1;
		return new LoadingScreenNewsDisplayConfig(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("kn.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3191;
	}
}
