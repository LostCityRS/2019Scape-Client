package com.jagex.game.load;

import com.jagex.game.client.LocalisedText;
import deob.ObfuscatedName;

@ObfuscatedName("jw")
public class LoadingStage {

	@ObfuscatedName("jw.e")
	public static final LoadingStage field2913 = new LoadingStage(0, LocalisedText.CHECKING_FOR_UPDATES, 2);

	@ObfuscatedName("jw.n")
	public static final LoadingStage field2911 = new LoadingStage(1, LocalisedText.CHECKING_FOR_UPDATES, LocalisedText.CHECKING_FOR_UPDATES, 2, 3);

	@ObfuscatedName("jw.m")
	public static final LoadingStage field2904 = new LoadingStage(2, LocalisedText.CHECKING_FOR_UPDATES, 3);

	@ObfuscatedName("jw.k")
	public static final LoadingStage field2905 = new LoadingStage(3, LocalisedText.CHECKING_FOR_UPDATES, LocalisedText.CHECKING_FOR_UPDATES, 3, 4);

	@ObfuscatedName("jw.f")
	public static final LoadingStage field2906 = new LoadingStage(4, LocalisedText.CHECKING_FOR_UPDATES, 4);

	@ObfuscatedName("jw.w")
	public static final LoadingStage OPEN_JS5_ARCHIVES = new LoadingStage(5, LocalisedText.CHECKING_FOR_UPDATES, LocalisedText.CHECKING_FOR_UPDATES, 4, 5);

	@ObfuscatedName("jw.l")
	public static final LoadingStage GET_JS5_INDEXES = new LoadingStage(6, LocalisedText.CHECKING_FOR_UPDATES, LocalisedText.CHECKING_FOR_UPDATES, 5, 98, true, true);

	@ObfuscatedName("jw.u")
	public static final LoadingStage field2909 = new LoadingStage(7, LocalisedText.CHECKING_FOR_UPDATES, 99);

	@ObfuscatedName("jw.z")
	public static final LoadingStage field2910 = new LoadingStage(8, LocalisedText.CHECKING_FOR_UPDATES, 100);

	@ObfuscatedName("jw.p")
	public static final LoadingStage DOWNLOAD_STUFF = new LoadingStage(9, LocalisedText.DOWNLOADING_UPDATES, LocalisedText.DOWNLOADING_UPDATES, 0, 92, true, true);

	@ObfuscatedName("jw.d")
	public static final LoadingStage SETUP_CONFIG_DECODERS = new LoadingStage(10, LocalisedText.DOWNLOADING_UPDATES, LocalisedText.DOWNLOADING_UPDATES, 92, 93);

	@ObfuscatedName("jw.c")
	public static final LoadingStage SETUP_STATIC_SPRITES = new LoadingStage(11, LocalisedText.DOWNLOADING_UPDATES, LocalisedText.DOWNLOADING_UPDATES, 94, 95);

	@ObfuscatedName("jw.r")
	public static final LoadingStage field2914 = new LoadingStage(12, LocalisedText.DOWNLOADING_UPDATES, LocalisedText.DOWNLOADING_UPDATES, 96, 97);

	@ObfuscatedName("jw.v")
	public static final LoadingStage SETUP_VARC_SYSTEM = new LoadingStage(13, LocalisedText.DOWNLOADING_UPDATES, 97);

	@ObfuscatedName("jw.o")
	public static final LoadingStage field2916 = new LoadingStage(14, LocalisedText.DOWNLOADING_UPDATES, 97);

	@ObfuscatedName("jw.s")
	public static final LoadingStage field2917 = new LoadingStage(15, LocalisedText.DOWNLOADING_UPDATES, 100);

	@ObfuscatedName("jw.y")
	public static final LoadingStage field2903 = new LoadingStage(16, LocalisedText.DOWNLOADING_UPDATES, 100);

	@ObfuscatedName("jw.q")
	public static final LoadingStage field2919 = new LoadingStage(17, LocalisedText.DOWNLOADING_UPDATES, 100);

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
		return new LoadingStage[] { field2913, field2911, field2904, field2905, field2906, OPEN_JS5_ARCHIVES, GET_JS5_INDEXES, field2909, field2910, DOWNLOAD_STUFF, SETUP_CONFIG_DECODERS, SETUP_STATIC_SPRITES, field2914, SETUP_VARC_SYSTEM, field2916, field2917, field2903, field2919 };
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
