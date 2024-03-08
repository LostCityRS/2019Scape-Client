package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("iv")
public class class246 {

	public class246() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ij.e(Lig;B)V")
	public static void method4338(class245 arg0) {
		Statics.field2614 = arg0;
	}

	@ObfuscatedName("gc.n(Lalw;Ljava/lang/String;I)I")
	public static int method3547(Packet arg0, String arg1) {
		int var2 = arg0.pos;
		byte[] var3 = class693.method3064(arg1);
		arg0.pSmart1or2s(var3.length);
		arg0.pos += Statics.field2614.method4381(var3, 0, var3.length, arg0.data, arg0.pos);
		return arg0.pos - var2;
	}

	@ObfuscatedName("eu.k(Lalw;II)Ljava/lang/String;")
	public static String method2738(Packet arg0, int arg1) {
		try {
			int var2 = arg0.gSmart1or2();
			if (var2 > arg1) {
				var2 = arg1;
			}
			byte[] var3 = new byte[var2];
			arg0.pos += Statics.field2614.method4387(arg0.data, arg0.pos, var3, 0, var2);
			return class693.method9199(var3, 0, var2);
		} catch (Exception var6) {
			return "Cabbage";
		}
	}
}
