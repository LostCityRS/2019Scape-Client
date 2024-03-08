package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.io.File;
import java.io.IOException;

@ObfuscatedName("p")
public class class17 {

	@ObfuscatedName("p.e")
	public static final String field519 = Statics.method3068() + "\\RuneScape-Setup.exe";

	@ObfuscatedName("p.m")
	public static class39 field521 = class39.field689;

	public class17() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ih.e(I)V")
	public static void method4589() throws RuntimeException {
		if (!NativeLibraryConfig.field5074.startsWith("win")) {
			return;
		}
		method18310();
		Object var0 = null;
		String var1 = field519;
		File var2 = new File(var1);
		if (!var2.isFile()) {
			throw new RuntimeException();
		}
		if (!var2.canRead()) {
			throw new RuntimeException();
		}
		if (class39.field690 == field521) {
			throw new RuntimeException();
		}
		try {
			Statics.field520 = (new ProcessBuilder(new String[] { var1 })).start();
			field521 = class39.field690;
		} catch (IOException var4) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("d.n(I)I")
	public static int method312() {
		method18310();
		return field521.field693;
	}

	@ObfuscatedName("alv.m(I)V")
	public static void method18310() {
		if (method10283()) {
			field521 = Statics.field520.exitValue() == 0 ? class39.field691 : class39.field692;
			Statics.field520 = null;
		}
	}

	@ObfuscatedName("xe.k(I)Z")
	public static boolean method10283() {
		if (Statics.field520 == null) {
			return false;
		}
		try {
			Statics.field520.exitValue();
			return true;
		} catch (IllegalThreadStateException var1) {
			return false;
		}
	}
}
