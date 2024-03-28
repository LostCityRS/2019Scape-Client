package com.jagex.core.constants;

import deob.ObfuscatedName;

@ObfuscatedName("zd")
public class ModeGame {

	@ObfuscatedName("zd.e")
	public static final ModeGame RUNESCAPE = new ModeGame("runescape", "RuneScape", 0, Namespace.RUNESCAPE);

	@ObfuscatedName("zd.n")
	public static final ModeGame STELLARDAWN = new ModeGame("stellardawn", "Stellar Dawn", 1, Namespace.STELLAR_DAWN);

	@ObfuscatedName("zd.m")
	public static final ModeGame ALTERNATEREALITY = new ModeGame("game3", "Game 3", 2, Namespace.RUNESCAPE);

	@ObfuscatedName("zd.k")
	public static final ModeGame TRANSFORMERS = new ModeGame("game4", "Game 4", 3, Namespace.TRANSFORMERS);

	@ObfuscatedName("zd.f")
	public static final ModeGame SCRATCH = new ModeGame("game5", "Game 5", 4, Namespace.SCRATCH);

	@ObfuscatedName("zd.w")
	public static final ModeGame OLDSCAPE = new ModeGame("oldscape", "RuneScape 2007", 5, Namespace.RUNESCAPE);

	@ObfuscatedName("zd.l")
	public final String field8333;

	@ObfuscatedName("zd.u")
	public final String title;

	@ObfuscatedName("zd.z")
	public final int method;

	public ModeGame(String arg0, String title, int method, Namespace arg3) {
		this.field8333 = arg0;
		this.title = title;
		this.method = method;
	}

	@ObfuscatedName("qx.e(B)[Lzd;")
	public static ModeGame[] values() {
		return new ModeGame[] {RUNESCAPE, ALTERNATEREALITY, OLDSCAPE, TRANSFORMERS, SCRATCH, STELLARDAWN};
	}

	@ObfuscatedName("rg.n(II)Lzd;")
	public static ModeGame of(int method) {
		ModeGame[] modes = values();
		for (int index = 0; index < modes.length; index++) {
			ModeGame mode = modes[index];
			if (mode.method == method) {
				return mode;
			}
		}
		return null;
	}
}
