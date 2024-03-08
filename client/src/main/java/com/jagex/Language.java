package com.jagex;

import deob.ObfuscatedName;

import java.util.Locale;

@ObfuscatedName("zt")
public class Language implements SerializableEnum {

	@ObfuscatedName("zt.e")
	public static final Language field8296 = new Language("EN", "en", "English", ModeWhere.field8273, 0, "GB");

	@ObfuscatedName("zt.n")
	public static final Language field8297 = new Language("DE", "de", "German", ModeWhere.field8273, 1, "DE");

	@ObfuscatedName("zt.m")
	public static final Language field8289 = new Language("FR", "fr", "French", ModeWhere.field8273, 2, "FR");

	@ObfuscatedName("zt.k")
	public static final Language field8291 = new Language("PT", "pt", "Portuguese", ModeWhere.field8273, 3, "BR");

	@ObfuscatedName("zt.f")
	public static final Language field8292 = new Language("NL", "nl", "Dutch", ModeWhere.field8268, 4, "NL");

	@ObfuscatedName("zt.w")
	public static final Language field8290 = new Language("ES", "es", "Spanish", ModeWhere.field8268, 5, "ES");

	@ObfuscatedName("zt.l")
	public static final Language field8288 = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field8273, 6, "MX");

	@ObfuscatedName("zt.u")
	public final String field8295;

	@ObfuscatedName("zt.p")
	public final String field8293;

	@ObfuscatedName("zt.d")
	public final int field8298;

	@ObfuscatedName("zt.c")
	public final Locale field8299;

	@ObfuscatedName("zt.r")
	public static final Language[] field8300;

	static {
		Language[] var0 = method13871();
		field8300 = new Language[var0.length];
		Language[] var1 = var0;
		for (int var2 = 0; var2 < var1.length; var2++) {
			Language var3 = var1[var2];
			if (field8300[var3.field8298] != null) {
				throw new IllegalStateException();
			}
			field8300[var3.field8298] = var3;
		}
	}

	@ObfuscatedName("zt.e(I)[Lzt;")
	public static Language[] method13871() {
		return new Language[] { field8291, field8292, field8296, field8297, field8290, field8288, field8289 };
	}

	public Language(String arg0, String arg1, String arg2, ModeWhere arg3, int arg4, String arg5) {
		this.field8295 = arg0;
		this.field8293 = arg1;
		this.field8298 = arg4;
		if (arg5 == null) {
			this.field8299 = new Locale(arg1.substring(0, 2));
		} else {
			this.field8299 = new Locale(arg1.substring(0, 2), arg5);
		}
	}

	@ObfuscatedName("zt.m(B)Ljava/lang/String;")
	public String method13868() {
		return this.field8293;
	}

	@ObfuscatedName("zt.n()I")
	public int getId() {
		return this.field8298;
	}

	@ObfuscatedName("zt.f(I)Ljava/util/Locale;")
	public Locale method13874() {
		return this.field8299;
	}

	public String toString() {
		return this.method13868().toLowerCase(Locale.ENGLISH);
	}
}
