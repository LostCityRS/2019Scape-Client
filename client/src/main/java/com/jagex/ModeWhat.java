package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aaa")
public class ModeWhat {

	@ObfuscatedName("aaa.e")
	public static final ModeWhat field8473 = new ModeWhat("LIVE", 0);

	@ObfuscatedName("aaa.n")
	public static final ModeWhat field8472 = new ModeWhat("BUILDLIVE", 3);

	@ObfuscatedName("aaa.m")
	public static final ModeWhat field8474 = new ModeWhat("RC", 1);

	@ObfuscatedName("aaa.k")
	public static final ModeWhat field8475 = new ModeWhat("WIP", 2);

	@ObfuscatedName("aaa.f")
	public static final ModeWhat field8476 = new ModeWhat("INTBETA", 4);

	@ObfuscatedName("aaa.w")
	public final String field8478;

	@ObfuscatedName("aaa.l")
	public final int field8477;

	@ObfuscatedName("rg.e(B)[Laaa;")
	public static ModeWhat[] method7705() {
		return new ModeWhat[] { field8475, field8472, field8473, field8474, field8476 };
	}

	public ModeWhat(String arg0, int arg1) {
		this.field8478 = arg0;
		this.field8477 = arg1;
	}

	@ObfuscatedName("sk.n(II)Laaa;")
	public static ModeWhat method8146(int arg0) {
		ModeWhat[] var1 = method7705();
		for (int var2 = 0; var2 < var1.length; var2++) {
			ModeWhat var3 = var1[var2];
			if (var3.field8477 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
