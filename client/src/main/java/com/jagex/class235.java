package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hw")
public class class235 {

	@ObfuscatedName("hw.e")
	public byte[] field2437;

	@ObfuscatedName("hw.n")
	public int field2438;

	public class235(byte[] arg0) {
		this.field2437 = arg0;
		this.field2438 = 0;
	}

	@ObfuscatedName("hw.e(I)I")
	public int method4133() {
		short var1 = 0;
		for (int var2 = 0; var2 < 2; var2++) {
			var1 = (short) (var1 | (this.field2437[++this.field2438 - 1] & 0xFF) << var2 * 8);
		}
		return var1;
	}

	@ObfuscatedName("hw.n(I)Ljava/lang/String;")
	public String method4134() {
		int var1 = this.method4133();
		if (var1 == -1) {
			return null;
		} else if (var1 > 256) {
			throw new class1210();
		} else {
			String var2 = new String(this.field2437, this.field2438, var1);
			this.field2438 += var1;
			return var2;
		}
	}
}
