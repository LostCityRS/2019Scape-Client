package lzma.sdk.lzma;

import lzma.sdk.rangecoder.BitTreeEncoder;
import deob.ObfuscatedName;

@ObfuscatedName("sb")
public class Encoder {

	@ObfuscatedName("sb.e")
	public static byte[] g_FastPos = new byte[2048];

	@ObfuscatedName("sb.m")
	public Optimal[] _optimum;

	@ObfuscatedName("sb.k")
	public BitTreeEncoder[] _posSlotEncoder;

	static {
		byte kFastSlots = 22;
		int c = 2;
		g_FastPos[0] = 0;
		g_FastPos[1] = 1;
		for (int slotFast = 2; slotFast < kFastSlots; slotFast++) {
			int k = 0x1 << (slotFast >> 1) - 1;
			for (int j = 0; j < k; j++, c++) {
				g_FastPos[c] = (byte) slotFast;
			}
		}
	}

	// line 48
	public Encoder() {
		Base.stateInit(); // _state

		this._optimum = new Optimal[4096];
		new lzma.sdk.rangecoder.Encoder(); // _rangeEncoder
		this._posSlotEncoder = new BitTreeEncoder[4];
		new BitTreeEncoder(4); // _posAlignEncoder
		new LenPriceTableEncoder(this); // _lenEncoder
		new LenPriceTableEncoder(this); // _repMatchLenEncoder
		new LiteralEncoder(this); // _literalEncoder

		for (int i = 0; i < 4096; i++) {
			this._optimum[i] = new Optimal(this);
		}

		for (int i = 0; i < 4; i++) {
			this._posSlotEncoder[i] = new BitTreeEncoder(6);
		}
	}

	@ObfuscatedName("so")
	public static class LiteralEncoder {

		// $FF: synthetic field
		public final Encoder this$0;

		// line 54
		public LiteralEncoder(Encoder arg0) {
			this.this$0 = arg0;
		}
	}

	@ObfuscatedName("sy")
	public static class LenEncoder {

		// $FF: synthetic field
		public final Encoder this$0;

		@ObfuscatedName("sy.e")
		public BitTreeEncoder[] _lowCoder;

		@ObfuscatedName("sy.n")
		public BitTreeEncoder[] _midCoder;

		// line 65
		public LenEncoder(Encoder arg0) {
			this.this$0 = arg0;
			this._lowCoder = new BitTreeEncoder[16];
			this._midCoder = new BitTreeEncoder[16];
			new BitTreeEncoder(8); // _highCoder

			for (int posState = 0; posState < 16; posState++) {
				this._lowCoder[posState] = new BitTreeEncoder(3);
				this._midCoder[posState] = new BitTreeEncoder(3);
			}
		}
	}

	@ObfuscatedName("ajb")
	public static class LenPriceTableEncoder extends LenEncoder {

		// $FF: synthetic field
		public final Encoder this$0;

		// line 74
		public LenPriceTableEncoder(Encoder arg0) {
			super(arg0);
			this.this$0 = arg0;
		}
	}

	@ObfuscatedName("sf")
	public static class Optimal {

		// $FF: synthetic field
		public final Encoder this$0;

		// line 78
		public Optimal(Encoder arg0) {
			this.this$0 = arg0;
		}
	}
}
