package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("sb")
public class LZMAEncoder {

	@ObfuscatedName("sb.e")
	public static byte[] field6713 = new byte[2048];

	@ObfuscatedName("sb.m")
	public LZMAEncoderOptimal[] field6712;

	@ObfuscatedName("sb.k")
	public LZMABitTreeEncoder[] field6711;

	static {
		byte var0 = 22;
		int var1 = 2;
		field6713[0] = 0;
		field6713[1] = 1;
		for (int var2 = 2; var2 < var0; var2++) {
			int var3 = 0x1 << (var2 >> 1) - 1;
			int var4 = 0;
			while (var4 < var3) {
				field6713[var1] = (byte) var2;
				var4++;
				var1++;
			}
		}
	}

	public LZMAEncoder() {
		LZMABase.method9417();
		this.field6712 = new LZMAEncoderOptimal[4096];
		new LZMARangeEncoder();
		this.field6711 = new LZMABitTreeEncoder[4];
		new LZMABitTreeEncoder(4);
		new LZMALenPriceTableEncoder(this);
		new LZMALenPriceTableEncoder(this);
		new LZMALiteralEncoder(this);
		for (int var1 = 0; var1 < 4096; var1++) {
			this.field6712[var1] = new LZMAEncoderOptimal(this);
		}
		for (int var2 = 0; var2 < 4; var2++) {
			this.field6711[var2] = new LZMABitTreeEncoder(6);
		}
	}
}
