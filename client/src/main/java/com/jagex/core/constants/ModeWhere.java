package com.jagex.core.constants;

import deob.ObfuscatedName;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("yu")
public class ModeWhere implements SerializableEnum {

	@ObfuscatedName("yu.e")
	public static final ModeWhere LIVE = new ModeWhere("", 0, new ModeWhereProperty[] { ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	@ObfuscatedName("yu.n")
	public static final ModeWhere WTRC = new ModeWhere("", 1, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	@ObfuscatedName("yu.m")
	public static final ModeWhere WTQA = new ModeWhere("", 2, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.QA, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	@ObfuscatedName("yu.k")
	public static final ModeWhere WTWIP = new ModeWhere("", 3, new ModeWhereProperty[] { ModeWhereProperty.OFFICE});

	@ObfuscatedName("yu.f")
	public static final ModeWhere LOCAL = new ModeWhere("", 4);

	@ObfuscatedName("yu.w")
	public static final ModeWhere WTI = new ModeWhere("", 5, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	@ObfuscatedName("yu.l")
	public static final ModeWhere INTBETA = new ModeWhere("", 6, new ModeWhereProperty[] { ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	@ObfuscatedName("yu.u")
	public static final ModeWhere WTITU = new ModeWhere("", 8, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	@ObfuscatedName("yu.z")
	public static final ModeWhere WTQA2 = new ModeWhere("", 9, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.QA});

	@ObfuscatedName("yu.p")
	public static final ModeWhere field8276 = new ModeWhere("", 10, new ModeWhereProperty[] { ModeWhereProperty.OFFICE});

	@ObfuscatedName("yu.d")
	public static final ModeWhere field8267 = new ModeWhere("", 11, new ModeWhereProperty[] { ModeWhereProperty.OFFICE});

	@ObfuscatedName("yu.c")
	public static final ModeWhere field8278 = new ModeWhere("", 12, new ModeWhereProperty[] { ModeWhereProperty.OFFICE, ModeWhereProperty.HAS_EXTERNAL_ACCESS});

	@ObfuscatedName("yu.r")
	public static final ModeWhere field8271 = new ModeWhere("", 13, new ModeWhereProperty[] { ModeWhereProperty.OFFICE});

	@ObfuscatedName("yu.v")
	public final int field8280;

	@ObfuscatedName("yu.o")
	public final Set field8281 = new HashSet();

	static {
		method13843();
	}

	@ObfuscatedName("yu.e(B)[Lyu;")
	public static ModeWhere[] method13843() {
		return new ModeWhere[] {WTRC, field8271, WTQA2, LOCAL, INTBETA, WTQA, field8276, LIVE, field8267, WTI, field8278, WTWIP, WTITU};
	}

	public ModeWhere(String arg0, int arg1) {
		this.field8280 = arg1;
	}

	public ModeWhere(String arg0, int arg1, ModeWhereProperty[] arg2) {
		this.field8280 = arg1;
		ModeWhereProperty[] var4 = arg2;
		for (int var5 = 0; var5 < var4.length; var5++) {
			ModeWhereProperty var6 = var4[var5];
			this.field8281.add(var6);
		}
	}

	@ObfuscatedName("yu.n()I")
	public int getId() {
		return this.field8280;
	}

	@ObfuscatedName("yu.m(Lzh;I)Z")
	public boolean method13838(ModeWhereProperty arg0) {
		return this.field8281.contains(arg0);
	}
}
