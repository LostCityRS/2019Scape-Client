package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("v")
public class class21 {

	public class21() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("qi.e(Ldh;IILhf;I)V")
	public static void method7274(class133 arg0, int arg1, int arg2, class226 arg3) {
		byte var4 = 127;
		byte var5 = 7;
		for (int var6 = 63; var6 >= 0; var6--) {
			int var7 = (var6 & 0x3F) << 10 | (var5 & 0x7) << 7 | var4 & 0x7F;
			class662.method10156(false, true);
			int var8 = Statics.field8149[var7];
			class662.method14805(false, true);
			arg0.method2354(arg1, (arg3.field2197 * (63 - var6) >> 6) + arg2, arg3.field2196, (arg3.field2197 >> 6) + 1, var8 | 0xFF000000, 0);
		}
	}
}
