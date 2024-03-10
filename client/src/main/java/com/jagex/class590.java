package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vi")
public class class590 {

	public class590() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("hh.e(Lalw;I)Lvt;")
	public static Binding method4055(Packet arg0) {
		class592 var1 = class592.method4512(arg0.g1());
		if (class592.field7417 == var1) {
			return MouseBinding.method9770(arg0);
		} else if (class592.field7416 == var1) {
			return KeyBinding.method3038(arg0);
		} else if (class592.field7418 == var1) {
			return KeyHeldBinding.method6037(arg0);
		} else {
			return null;
		}
	}
}
