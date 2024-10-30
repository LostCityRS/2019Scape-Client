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
	public final String titleURL;

	@ObfuscatedName("zd.u")
	public final String title;

	@ObfuscatedName("zd.z")
	public final int game;

	@ObfuscatedName("qx.e(B)[Lzd;")
	public static ModeGame[] values() {
		return new ModeGame[] { RUNESCAPE, ALTERNATEREALITY, OLDSCAPE, TRANSFORMERS, SCRATCH, STELLARDAWN };
	}

	public ModeGame(String arg0, String arg1, int arg2, Namespace arg3) {
		this.titleURL = arg0;
		this.title = arg1;
		this.game = arg2;
	}

	@ObfuscatedName("rg.n(II)Lzd;")
	public static ModeGame of(int arg0) {
		ModeGame[] var1 = values();
		for (int var2 = 0; var2 < var1.length; var2++) {
			ModeGame var3 = var1[var2];
			if (var3.game == arg0) {
				return var3;
			}
		}
		return null;
	}
}
