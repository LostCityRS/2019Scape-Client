package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("jw")
public class LoadingStage {

	@ObfuscatedName("jw.e")
	public static final LoadingStage field2913 = new LoadingStage(0, LocalisedText.field9030, 2);

	@ObfuscatedName("jw.n")
	public static final LoadingStage field2911 = new LoadingStage(1, LocalisedText.field9030, LocalisedText.field9030, 2, 3);

	@ObfuscatedName("jw.m")
	public static final LoadingStage field2904 = new LoadingStage(2, LocalisedText.field9030, 3);

	@ObfuscatedName("jw.k")
	public static final LoadingStage field2905 = new LoadingStage(3, LocalisedText.field9030, LocalisedText.field9030, 3, 4);

	@ObfuscatedName("jw.f")
	public static final LoadingStage field2906 = new LoadingStage(4, LocalisedText.field9030, 4);

	@ObfuscatedName("jw.w")
	public static final LoadingStage field2907 = new LoadingStage(5, LocalisedText.field9030, LocalisedText.field9030, 4, 5);

	@ObfuscatedName("jw.l")
	public static final LoadingStage field2921 = new LoadingStage(6, LocalisedText.field9030, LocalisedText.field9030, 5, 98, true, true);

	@ObfuscatedName("jw.u")
	public static final LoadingStage field2909 = new LoadingStage(7, LocalisedText.field9030, 99);

	@ObfuscatedName("jw.z")
	public static final LoadingStage field2910 = new LoadingStage(8, LocalisedText.field9030, 100);

	@ObfuscatedName("jw.p")
	public static final LoadingStage field2902 = new LoadingStage(9, LocalisedText.field9049, LocalisedText.field9049, 0, 92, true, true);

	@ObfuscatedName("jw.d")
	public static final LoadingStage field2912 = new LoadingStage(10, LocalisedText.field9049, LocalisedText.field9049, 92, 93);

	@ObfuscatedName("jw.c")
	public static final LoadingStage field2918 = new LoadingStage(11, LocalisedText.field9049, LocalisedText.field9049, 94, 95);

	@ObfuscatedName("jw.r")
	public static final LoadingStage field2914 = new LoadingStage(12, LocalisedText.field9049, LocalisedText.field9049, 96, 97);

	@ObfuscatedName("jw.v")
	public static final LoadingStage field2915 = new LoadingStage(13, LocalisedText.field9049, 97);

	@ObfuscatedName("jw.o")
	public static final LoadingStage field2916 = new LoadingStage(14, LocalisedText.field9049, 97);

	@ObfuscatedName("jw.s")
	public static final LoadingStage field2917 = new LoadingStage(15, LocalisedText.field9049, 100);

	@ObfuscatedName("jw.y")
	public static final LoadingStage field2903 = new LoadingStage(16, LocalisedText.field9049, 100);

	@ObfuscatedName("jw.q")
	public static final LoadingStage field2919 = new LoadingStage(17, LocalisedText.field9049, 100);

	@ObfuscatedName("jw.x")
	public final int field2920;

	@ObfuscatedName("jw.b")
	public final LocalisedText field2908;

	@ObfuscatedName("jw.h")
	public final LocalisedText field2922;

	@ObfuscatedName("jw.a")
	public final int field2923;

	@ObfuscatedName("jw.g")
	public final int field2924;

	@ObfuscatedName("jw.i")
	public final boolean field2925;

	@ObfuscatedName("jw.j")
	public final boolean field2926;

	@ObfuscatedName("jw.e(I)[Ljw;")
	public static LoadingStage[] method4920() {
		return new LoadingStage[] { field2913, field2911, field2904, field2905, field2906, field2907, field2921, field2909, field2910, field2902, field2912, field2918, field2914, field2915, field2916, field2917, field2903, field2919 };
	}

	public LoadingStage(int arg0, LocalisedText arg1, int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	public LoadingStage(int arg0, LocalisedText arg1, LocalisedText arg2, int arg3, int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	public LoadingStage(int arg0, LocalisedText arg1, LocalisedText arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
		this.field2920 = arg0;
		this.field2908 = arg1;
		this.field2922 = arg2;
		this.field2923 = arg3;
		this.field2924 = arg4;
		this.field2925 = arg5;
		this.field2926 = arg6;
	}
}
