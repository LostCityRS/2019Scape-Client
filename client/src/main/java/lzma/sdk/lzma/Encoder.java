package lzma.sdk.lzma;

import deob.ObfuscatedName;
import lzma.sdk.rangecoder.BitTreeEncoder;

@ObfuscatedName("sb")
public class Encoder {

	@ObfuscatedName("sb.e")
	public static byte[] g_FastPos = new byte[2048];

	@ObfuscatedName("sb.m")
	public Encoder.Optimal[] _optimum;

	@ObfuscatedName("sb.k")
	public BitTreeEncoder[] _posSlotEncoder;

	static {
		byte var0 = 22;
		int var1 = 2;
		g_FastPos[0] = 0;
		g_FastPos[1] = 1;
		for (int var2 = 2; var2 < var0; var2++) {
			int var3 = 0x1 << (var2 >> 1) - 1;
			int var4 = 0;
			while (var4 < var3) {
				g_FastPos[var1] = (byte) var2;
				var4++;
				var1++;
			}
		}
	}

	public Encoder() {
		Base.stateInit();
		this._optimum = new Encoder.Optimal[4096];
		new lzma.sdk.rangecoder.Encoder();
		this._posSlotEncoder = new BitTreeEncoder[4];
		new BitTreeEncoder(4);
		new Encoder.LenPriceTableEncoder();
		new Encoder.LenPriceTableEncoder();
		new Encoder.LiteralEncoder();
		for (int var1 = 0; var1 < 4096; var1++) {
			this._optimum[var1] = new Encoder.Optimal();
		}
		for (int var2 = 0; var2 < 4; var2++) {
			this._posSlotEncoder[var2] = new BitTreeEncoder(6);
		}
	}

	@ObfuscatedName("sf")
	public class Optimal {
	}

	@ObfuscatedName("sy")
	public class LenEncoder {

		@ObfuscatedName("sy.e")
		public BitTreeEncoder[] _lowCoder = new BitTreeEncoder[16];

		@ObfuscatedName("sy.n")
		public BitTreeEncoder[] _midCoder = new BitTreeEncoder[16];

		public LenEncoder() {
			new BitTreeEncoder(8);
			for (int var2 = 0; var2 < 16; var2++) {
				this._lowCoder[var2] = new BitTreeEncoder(3);
				this._midCoder[var2] = new BitTreeEncoder(3);
			}
		}
	}

	@ObfuscatedName("so")
	public class LiteralEncoder {
	}

	@ObfuscatedName("ajb")
	public class LenPriceTableEncoder extends Encoder.LenEncoder {

		public LenPriceTableEncoder() {
			super();
		}
	}
}
