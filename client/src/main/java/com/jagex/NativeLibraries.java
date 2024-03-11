package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("rb")
public class NativeLibraries {

	public NativeLibraries() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("abq.e(Lrn;I)V")
	public static void method14694(NativeLibraryLoader arg0) {
		if (Statics.field5077 != null) {
			throw new IllegalStateException("");
		}
		Statics.field5077 = arg0;
	}

	@ObfuscatedName("aah.m(I)Z")
	public static boolean method14526() {
		return Statics.field5077 != null;
	}
}
