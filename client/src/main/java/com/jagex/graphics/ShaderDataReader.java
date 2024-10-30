package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("hw")
public class ShaderDataReader {

	@ObfuscatedName("hw.e")
	public byte[] bytes;

	@ObfuscatedName("hw.n")
	public int pos;

	public ShaderDataReader(byte[] arg0) {
		this.bytes = arg0;
		this.pos = 0;
	}

	@ObfuscatedName("hw.e(I)I")
	public int g2() {
		short var1 = 0;
		for (int var2 = 0; var2 < 2; var2++) {
			var1 = (short) (var1 | (this.bytes[++this.pos - 1] & 0xFF) << var2 * 8);
		}
		return var1;
	}

	@ObfuscatedName("hw.n(I)Ljava/lang/String;")
	public String gstr() {
		int var1 = this.g2();
		if (var1 == -1) {
			return null;
		} else if (var1 > 256) {
			throw new ShaderDataReaderException();
		} else {
			String var2 = new String(this.bytes, this.pos, var1);
			this.pos += var1;
			return var2;
		}
	}
}
