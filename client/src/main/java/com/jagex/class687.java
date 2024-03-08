package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.Locale;

@ObfuscatedName("zt")
public class class687 implements class685 {

	@ObfuscatedName("zt.e")
	public static final class687 field8296 = new class687("EN", "en", "English", class682.field8273, 0, "GB");

	@ObfuscatedName("zt.n")
	public static final class687 field8297 = new class687("DE", "de", "German", class682.field8273, 1, "DE");

	@ObfuscatedName("zt.m")
	public static final class687 field8289 = new class687("FR", "fr", "French", class682.field8273, 2, "FR");

	@ObfuscatedName("zt.k")
	public static final class687 field8291 = new class687("PT", "pt", "Portuguese", class682.field8273, 3, "BR");

	@ObfuscatedName("zt.f")
	public static final class687 field8292 = new class687("NL", "nl", "Dutch", class682.field8268, 4, "NL");

	@ObfuscatedName("zt.w")
	public static final class687 field8290 = new class687("ES", "es", "Spanish", class682.field8268, 5, "ES");

	@ObfuscatedName("zt.l")
	public static final class687 field8288 = new class687("ES_MX", "es-mx", "Spanish (Latin American)", class682.field8273, 6, "MX");

	@ObfuscatedName("zt.u")
	public final String field8295;

	@ObfuscatedName("zt.p")
	public final String field8293;

	@ObfuscatedName("zt.d")
	public final int field8298;

	@ObfuscatedName("zt.c")
	public final Locale field8299;

	@ObfuscatedName("zt.r")
	public static final class687[] field8300;

	static {
		class687[] var0 = method13871();
		field8300 = new class687[var0.length];
		class687[] var1 = var0;
		for (int var2 = 0; var2 < var1.length; var2++) {
			class687 var3 = var1[var2];
			if (field8300[var3.field8298] != null) {
				throw new IllegalStateException();
			}
			field8300[var3.field8298] = var3;
		}
	}

	@ObfuscatedName("zt.e(I)[Lzt;")
	public static class687[] method13871() {
		return new class687[] { field8291, field8292, field8296, field8297, field8290, field8288, field8289 };
	}

	public class687(String arg0, String arg1, String arg2, class682 arg3, int arg4, String arg5) {
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
	public int method1303() {
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
