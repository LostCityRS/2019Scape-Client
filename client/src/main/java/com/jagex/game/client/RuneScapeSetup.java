package com.jagex.game.client;

import deob.ObfuscatedName;

import java.io.File;
import java.io.IOException;

@ObfuscatedName("p")
public class RuneScapeSetup {

	@ObfuscatedName("p.e")
	public static final String field519 = GameShell.method3068() + "\\RuneScape-Setup.exe";

	@ObfuscatedName("p.n")
	public static Process field520;

	@ObfuscatedName("p.m")
	public static RuneScapeSetupStatus field521 = RuneScapeSetupStatus.field689;

	public RuneScapeSetup() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ih.e(I)V")
	public static void method4589() throws RuntimeException {
		if (!NativeLibraryConfig.osName.startsWith("win")) {
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
		if (RuneScapeSetupStatus.field690 == field521) {
			throw new RuntimeException();
		}
		try {
			field520 = (new ProcessBuilder(new String[] { var1 })).start();
			field521 = RuneScapeSetupStatus.field690;
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
			field521 = field520.exitValue() == 0 ? RuneScapeSetupStatus.field691 : RuneScapeSetupStatus.field692;
			field520 = null;
		}
	}

	@ObfuscatedName("xe.k(I)Z")
	public static boolean method10283() {
		if (field520 == null) {
			return false;
		}
		try {
			field520.exitValue();
			return true;
		} catch (IllegalThreadStateException var1) {
			return false;
		}
	}
}
