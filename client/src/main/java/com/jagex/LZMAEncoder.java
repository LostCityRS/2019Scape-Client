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

	// line 48
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

	@ObfuscatedName("so")
	public static class LZMALiteralEncoder {

		// $FF: synthetic field
		public final LZMAEncoder this$0;

		// line 54
		public LZMALiteralEncoder(LZMAEncoder arg0) {
			this.this$0 = arg0;
		}
	}

	@ObfuscatedName("sy")
	public static class LZMAEncoderLen {

		// $FF: synthetic field
		public final LZMAEncoder this$0;

		@ObfuscatedName("sy.e")
		public LZMABitTreeEncoder[] field6706;

		@ObfuscatedName("sy.n")
		public LZMABitTreeEncoder[] field6705;

		// line 65
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

	@ObfuscatedName("ajb")
	public static class LZMALenPriceTableEncoder extends LZMAEncoderLen {

		// $FF: synthetic field
		public final LZMAEncoder this$0;

		// line 74
		public LZMALenPriceTableEncoder(LZMAEncoder arg0) {
			super(arg0);
			this.this$0 = arg0;
		}
	}

	@ObfuscatedName("sf")
	public static class LZMAEncoderOptimal {

		// $FF: synthetic field
		public final LZMAEncoder this$0;

		// line 78
		public LZMAEncoderOptimal(LZMAEncoder arg0) {
			this.this$0 = arg0;
		}
	}
}
