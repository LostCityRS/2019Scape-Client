package com.jagex.game.load;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ahe")
public class LoadingScreenRelated1 extends LoadingScreenProgressDisplayConfig {

	@ObfuscatedName("ahe.p")
	public final int field10575;

	@ObfuscatedName("ahe.d")
	public final int field10576;

	public LoadingScreenRelated1(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.field10575 = arg10;
		this.field10576 = arg11;
	}

	@ObfuscatedName("ku.k(Lalw;I)Lkp;")
	public static LoadingScreenProgressDisplayConfig method5148(Packet arg0) {
		LoadingScreenProgressDisplayConfig var1 = method18899(arg0);
		int var2 = arg0.g4s();
		int var3 = arg0.g4s();
		int var4 = arg0.gSmart2or4null();
		return new LoadingScreenRelated1(var1.field3167, var1.field3159, var1.field3161, var1.field3162, var1.field3163, var1.field3160, var1.field3165, var1.field3166, var1.field3164, var2, var3, var4);
	}

	@ObfuscatedName("ahe.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3189;
	}
}
