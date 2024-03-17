package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("rb")
public class NativeLibraries {

	@ObfuscatedName("rb.e")
	public static NativeLibraryLoader field5077;

	public NativeLibraries() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("abq.e(Lrn;I)V")
	public static void method14694(NativeLibraryLoader arg0) {
		if (field5077 != null) {
			throw new IllegalStateException("");
		}
		field5077 = arg0;
	}

	@ObfuscatedName("ke.n(I)Lrn;")
	public static NativeLibraryLoader getLoader() {
		if (field5077 == null) {
			throw new IllegalStateException("");
		}
		return field5077;
	}

	@ObfuscatedName("aah.m(I)Z")
	public static boolean method14526() {
		return field5077 != null;
	}
}
