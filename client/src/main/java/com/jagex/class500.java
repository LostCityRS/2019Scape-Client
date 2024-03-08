package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("rb")
public class class500 {

	public class500() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("abq.e(Lrn;I)V")
	public static void method14694(class499 arg0) {
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
