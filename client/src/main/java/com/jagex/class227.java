package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hr")
public class class227 {

	public class227(int arg0, Object[] arg1) {
	}

	@ObfuscatedName("ey.e(Lalw;I)Lhr;")
	public static class227 method2679(Packet arg0) {
		int var1 = arg0.g1();
		if (var1 == 0) {
			return null;
		}
		var1--;
		arg0.pos++;
		int var2 = arg0.g4s();
		Object[] var3 = new Object[var1];
		for (int var4 = 0; var4 < var1; var4++) {
			int var5 = arg0.g1();
			if (var5 == 0) {
				var3[var4] = class470.method7336(Integer.class).method7308(arg0);
			} else if (var5 == 1) {
				var3[var4] = class470.method7336(String.class).method7308(arg0);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + var5);
			}
		}
		return new class227(var2, var3);
	}
}
