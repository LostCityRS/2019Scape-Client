package com.jagex.game.load;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("aqy")
public class LoadingScreenRelated4_Sub1 extends LoadingScreenRelated4 {

	@ObfuscatedName("aqy.s")
	public final int field12100;

	public LoadingScreenRelated4_Sub1(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
		this.field12100 = arg15;
	}

	@ObfuscatedName("px.f(Lalw;I)Lkp;")
	public static LoadingScreenProgressDisplayConfig method6845(Packet arg0) {
		LoadingScreenRelated4 var1 = (LoadingScreenRelated4) LoadingScreenProgressDisplayConfig.method10312(arg0);
		int var2 = arg0.g2s();
		return new LoadingScreenRelated4_Sub1(var1.field3167, var1.field3159, var1.field3161, var1.field3162, var1.field3163, var1.field3160, var1.field3165, var1.field3166, var1.field3164, var1.field10569, var1.field10570, var1.field10572, var1.field10573, var1.field10571, var1.field10574, var2);
	}

	@ObfuscatedName("aqy.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3196;
	}
}
