package com.jagex.core.constants;

import deob.ObfuscatedName;

import java.util.Locale;

@ObfuscatedName("zt")
public class Language implements SerializableEnum {

	@ObfuscatedName("zt.e")
	public static final Language EN = new Language("EN", "en", "English", ModeWhere.LIVE, 0, "GB");

	@ObfuscatedName("zt.n")
	public static final Language DE = new Language("DE", "de", "German", ModeWhere.LIVE, 1, "DE");

	@ObfuscatedName("zt.m")
	public static final Language FR = new Language("FR", "fr", "French", ModeWhere.LIVE, 2, "FR");

	@ObfuscatedName("zt.k")
	public static final Language PT = new Language("PT", "pt", "Portuguese", ModeWhere.LIVE, 3, "BR");

	@ObfuscatedName("zt.f")
	public static final Language NL = new Language("NL", "nl", "Dutch", ModeWhere.WTWIP, 4, "NL");

	@ObfuscatedName("zt.w")
	public static final Language ES = new Language("ES", "es", "Spanish", ModeWhere.WTWIP, 5, "ES");

	@ObfuscatedName("zt.l")
	public static final Language ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.LIVE, 6, "MX");

	@ObfuscatedName("zt.u")
	public final String field8295;

	@ObfuscatedName("zt.p")
	public final String field8293;

	@ObfuscatedName("zt.d")
	public final int serialID;

	@ObfuscatedName("zt.c")
	public final Locale locale;

	@ObfuscatedName("zt.r")
	public static final Language[] LANGUAGES;

	static {
		Language[] languages = values();
		LANGUAGES = new Language[languages.length];
		Language[] var1 = languages;
		for (int index = 0; index < var1.length; index++) {
			Language language = var1[index];
			if (LANGUAGES[language.serialID] != null) {
				throw new IllegalStateException();
			}
			LANGUAGES[language.serialID] = language;
		}
	}

	@ObfuscatedName("zt.e(I)[Lzt;")
	public static Language[] values() {
		return new Language[] {PT, NL, EN, DE, ES, ES_MX, FR};
	}

	public Language(String arg0, String arg1, String arg2, ModeWhere arg3, int serialID, String arg5) {
		this.field8295 = arg0;
		this.field8293 = arg1;
		this.serialID = serialID;
		if (arg5 == null) {
			this.locale = new Locale(arg1.substring(0, 2));
		} else {
			this.locale = new Locale(arg1.substring(0, 2), arg5);
		}
	}

	@ObfuscatedName("zt.m(B)Ljava/lang/String;")
	public String method13868() {
		return this.field8293;
	}

	@ObfuscatedName("zt.n()I")
	public int getId() {
		return this.serialID;
	}

	@ObfuscatedName("zt.f(I)Ljava/util/Locale;")
	public Locale getLocale() {
		return this.locale;
	}

	@ObfuscatedName("zt.w(II)Lzt;")
	public static Language getLanguage(int index) {
		return index >= 0 && index < LANGUAGES.length ? LANGUAGES[index] : null;
	}

	public String toString() {
		return this.method13868().toLowerCase(Locale.ENGLISH);
	}
}
