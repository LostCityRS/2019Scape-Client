package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ky")
public class LoadingScreenAlignmentY {

	@ObfuscatedName("ky.e")
	public static final LoadingScreenAlignmentY field3181 = new LoadingScreenAlignmentY();

	@ObfuscatedName("ky.n")
	public static final LoadingScreenAlignmentY field3180 = new LoadingScreenAlignmentY();

	@ObfuscatedName("ky.m")
	public static final LoadingScreenAlignmentY field3179 = new LoadingScreenAlignmentY();

	@ObfuscatedName("ev.e(I)[Lky;")
	public static LoadingScreenAlignmentY[] method2774() {
		return new LoadingScreenAlignmentY[] { field3181, field3180, field3179 };
	}

	@ObfuscatedName("ky.n(IIS)I")
	public int method5375(int arg0, int arg1) {
		int var3 = Statics.canvasHei > arg1 ? Statics.canvasHei : arg1;
		if (field3181 == this) {
			return 0;
		} else if (field3179 == this) {
			return var3 - arg0;
		} else if (field3180 == this) {
			return (var3 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
