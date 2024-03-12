package com.jagex.game.load;

import deob.ObfuscatedName;

@ObfuscatedName("ahp")
public class LoadingScreenRelated4 extends LoadingScreenProgressDisplayConfig {

	@ObfuscatedName("ahp.p")
	public final int field10569;

	@ObfuscatedName("ahp.d")
	public final int field10570;

	@ObfuscatedName("ahp.c")
	public final int field10572;

	@ObfuscatedName("ahp.r")
	public final int field10573;

	@ObfuscatedName("ahp.v")
	public final int field10571;

	@ObfuscatedName("ahp.o")
	public final int field10574;

	public LoadingScreenRelated4(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.field10569 = arg9;
		this.field10570 = arg10;
		this.field10572 = arg11;
		this.field10573 = arg12;
		this.field10571 = arg13;
		this.field10574 = arg14;
	}

	@ObfuscatedName("ahp.n(S)Lkt;")
	public LoadingScreenElementType method5349() {
		return LoadingScreenElementType.field3193;
	}
}
