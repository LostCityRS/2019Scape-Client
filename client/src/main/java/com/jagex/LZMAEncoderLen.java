package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("sy")
public class LZMAEncoderLen {

	// $FF: synthetic field
	public final LZMAEncoder this$0;

	@ObfuscatedName("sy.e")
	public LZMABitTreeEncoder[] field6706;

	@ObfuscatedName("sy.n")
	public LZMABitTreeEncoder[] field6705;

	public LZMAEncoderLen(LZMAEncoder arg0) {
		this.this$0 = arg0;
		this.field6706 = new LZMABitTreeEncoder[16];
		this.field6705 = new LZMABitTreeEncoder[16];
		new LZMABitTreeEncoder(8);
		for (int var2 = 0; var2 < 16; var2++) {
			this.field6706[var2] = new LZMABitTreeEncoder(3);
			this.field6705[var2] = new LZMABitTreeEncoder(3);
		}
	}
}
