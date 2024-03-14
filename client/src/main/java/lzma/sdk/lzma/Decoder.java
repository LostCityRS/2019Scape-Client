package lzma.sdk.lzma;

import lzma.sdk.rangecoder.BitTreeDecoder;
import lzma.sdk.lz.OutWindow;
import deob.ObfuscatedName;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ObfuscatedName("sz")
public class Decoder {

	@ObfuscatedName("sz.e")
	public OutWindow m_OutWindow = new OutWindow();

	@ObfuscatedName("sz.n")
	public lzma.sdk.rangecoder.Decoder m_RangeDecoder = new lzma.sdk.rangecoder.Decoder();

	@ObfuscatedName("sz.m")
	public short[] m_IsMatchDecoders = new short[192];

	@ObfuscatedName("sz.k")
	public short[] m_IsRepDecoders = new short[12];

	@ObfuscatedName("sz.f")
	public short[] m_IsRepG0Decoders = new short[12];

	@ObfuscatedName("sz.w")
	public short[] m_IsRepG1Decoders = new short[12];

	@ObfuscatedName("sz.l")
	public short[] m_IsRepG2Decoders = new short[12];

	@ObfuscatedName("sz.u")
	public short[] m_IsRep0LongDecoders = new short[192];

	@ObfuscatedName("sz.z")
	public BitTreeDecoder[] m_PosSlotDecoder = new BitTreeDecoder[4];

	@ObfuscatedName("sz.p")
	public short[] m_PosDecoders = new short[114];

	@ObfuscatedName("sz.d")
	public BitTreeDecoder m_PosAlignDecoder = new BitTreeDecoder(4);

	@ObfuscatedName("sz.c")
	public LenDecoder m_LenDecoder = new LenDecoder(this);

	@ObfuscatedName("sz.r")
	public LenDecoder m_RepLenDecoder = new LenDecoder(this);

	@ObfuscatedName("sz.v")
	public LiteralDecoder m_LiteralDecoder = new LiteralDecoder(this);

	@ObfuscatedName("sz.o")
	public int m_DictionarySize = -1;

	@ObfuscatedName("sz.s")
	public int m_DictionarySizeCheck = -1;

	@ObfuscatedName("sz.y")
	public int m_PosStateMask;

	public Decoder() {
		for (int i = 0; i < 4; i++) {
			this.m_PosSlotDecoder[i] = new BitTreeDecoder(6);
		}
	}

	@ObfuscatedName("sz.e(IB)Z")
	public boolean setDictionarySize(int dictionarySize) {
		if (dictionarySize < 0) {
			return false;
		}
		if (this.m_DictionarySize != dictionarySize) {
			this.m_DictionarySize = dictionarySize;
			this.m_DictionarySizeCheck = Math.max(this.m_DictionarySize, 1);
			this.m_OutWindow.create(Math.max(this.m_DictionarySizeCheck, 4096));
		}
		return true;
	}

	@ObfuscatedName("sz.n(IIII)Z")
	public boolean setLcLpPb(int lc, int lp, int pb) {
		if (lc > 8 || lp > 4 || pb > 4) {
			return false;
		}
		this.m_LiteralDecoder.create(lp, lc);
		int numPosStates = 0x1 << pb;
		this.m_LenDecoder.create(numPosStates);
		this.m_RepLenDecoder.create(numPosStates);
		this.m_PosStateMask = numPosStates - 1;
		return true;
	}

	@ObfuscatedName("sz.m(I)V")
	public void init() throws IOException {
		this.m_OutWindow.init(false);

		lzma.sdk.rangecoder.Decoder.initBitModels(this.m_IsMatchDecoders);
		lzma.sdk.rangecoder.Decoder.initBitModels(this.m_IsRep0LongDecoders);
		lzma.sdk.rangecoder.Decoder.initBitModels(this.m_IsRepDecoders);
		lzma.sdk.rangecoder.Decoder.initBitModels(this.m_IsRepG0Decoders);
		lzma.sdk.rangecoder.Decoder.initBitModels(this.m_IsRepG1Decoders);
		lzma.sdk.rangecoder.Decoder.initBitModels(this.m_IsRepG2Decoders);
		lzma.sdk.rangecoder.Decoder.initBitModels(this.m_PosDecoders);

		this.m_LiteralDecoder.init();
		for (int i = 0; i < 4; i++) {
			this.m_PosSlotDecoder[i].init();
		}
		this.m_LenDecoder.init();
		this.m_RepLenDecoder.init();
		this.m_PosAlignDecoder.init();
		this.m_RangeDecoder.init();
	}

	@ObfuscatedName("nc.k([SILjp;II)I")
	public static int reverseDecode(short[] arg0, int arg1, lzma.sdk.rangecoder.Decoder arg2, int arg3) throws IOException {
		int var4 = 1;
		int var5 = 0;
		for (int var6 = 0; var6 < arg3; var6++) {
			int var7 = arg2.decodeBit(arg0, arg1 + var4);
			int var8 = var4 << 1;
			var4 = var7 + var8;
			var5 |= var7 << var6;
		}
		return var5;
	}

	@ObfuscatedName("sz.k(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z")
	public boolean code(InputStream inStream, OutputStream outStream, long outSize) throws IOException {
		this.m_RangeDecoder.setStream(inStream);
		this.m_OutWindow.setStream(outStream);
		this.init();

		int state = Base.stateInit();
		int rep0 = 0;
		int rep1 = 0;
		int rep2 = 0;
		int rep3 = 0;

		long nowPos64 = 0L;
		byte prevByte = 0;
		while (true) {
			int var15;
			label71: {
				while (outSize < 0L || nowPos64 < outSize) {
					int posState = (int) nowPos64 & this.m_PosStateMask;
					if (this.m_RangeDecoder.decodeBit(this.m_IsMatchDecoders, (state << 4) + posState) != 0) {
						if (this.m_RangeDecoder.decodeBit(this.m_IsRepDecoders, state) == 1) {
							var15 = 0;
							if (this.m_RangeDecoder.decodeBit(this.m_IsRepG0Decoders, state) != 0) {
								int var16;
								if (this.m_RangeDecoder.decodeBit(this.m_IsRepG1Decoders, state) == 0) {
									var16 = rep1;
								} else {
									if (this.m_RangeDecoder.decodeBit(this.m_IsRepG2Decoders, state) == 0) {
										var16 = rep2;
									} else {
										var16 = rep3;
										rep3 = rep2;
									}
									rep2 = rep1;
								}
								rep1 = rep0;
								rep0 = var16;
							} else if (this.m_RangeDecoder.decodeBit(this.m_IsRep0LongDecoders, (state << 4) + posState) == 0) {
								state = Base.stateUpdateShortRep(state);
								var15 = 1;
							}
							if (var15 == 0) {
								var15 = this.m_RepLenDecoder.decode(this.m_RangeDecoder, posState) + 2;
								state = Base.stateUpdateRep(state);
							}
							break label71;
						}
						rep3 = rep2;
						rep2 = rep1;
						rep1 = rep0;
						var15 = this.m_LenDecoder.decode(this.m_RangeDecoder, posState) + 2;
						state = Base.stateUpdateMatch(state);
						int var17 = this.m_PosSlotDecoder[Base.getLenToPosState(var15)].decode(this.m_RangeDecoder);
						if (var17 < 4) {
							rep0 = var17;
							break label71;
						}
						int numDirectBits = (var17 >> 1) - 1;
						int var19 = (var17 & 0x1 | 0x2) << numDirectBits;
						if (var17 < 14) {
							rep0 = var19 + reverseDecode(this.m_PosDecoders, var19 - var17 - 1, this.m_RangeDecoder, numDirectBits);
							break label71;
						}
						int var20 = var19 + (this.m_RangeDecoder.decodeDirectBits(numDirectBits - 4) << 4);
						rep0 = var20 + this.m_PosAlignDecoder.reverseDecode(this.m_RangeDecoder);
						if (rep0 >= 0) {
							break label71;
						}
						if (rep0 != -1) {
							return false;
						}
						break;
					}
					LiteralDecoder.Decoder2 decoder2 = this.m_LiteralDecoder.getDecoder((int) nowPos64, prevByte);
					if (Base.stateIsCharState(state)) {
						prevByte = decoder2.decodeNormal(this.m_RangeDecoder);
					} else {
						prevByte = decoder2.decodeWithMatchByte(this.m_RangeDecoder, this.m_OutWindow.getByte(rep0));
					}
					this.m_OutWindow.putByte(prevByte);
					state = Base.stateUpdateChar(state);
					nowPos64++;
				}
				this.m_OutWindow.flush();
				this.m_OutWindow.releaseStream();
				this.m_RangeDecoder.releaseStream();
				return true;
			}
			if ((long) rep0 >= nowPos64 || rep0 >= this.m_DictionarySizeCheck) {
				return false;
			}
			this.m_OutWindow.copyBlock(rep0, var15);
			nowPos64 += var15;
			prevByte = this.m_OutWindow.getByte(0);
		}
	}

	// line 155
	@ObfuscatedName("sz.f([BI)Z")
	public boolean setDecoderProperties(byte[] properties) {
		if (properties.length < 5) {
			return false;
		}
		int val = properties[0] & 0xFF;
		int lc = val % 9;
		int remainder = val / 9;
		int lp = remainder % 5;
		int pb = remainder / 5;
		int dictionarySize = 0;
		for (int i = 0; i < 4; i++) {
			dictionarySize += (properties[i + 1] & 0xFF) << i * 8;
		}
		return this.setLcLpPb(lc, lp, pb) ? this.setDictionarySize(dictionarySize) : false;
	}

	@ObfuscatedName("sc")
	public static class LenDecoder {

		// $FF: synthetic field
		public final Decoder this$0;

		@ObfuscatedName("sc.e")
		public short[] m_Choice;

		@ObfuscatedName("sc.n")
		public BitTreeDecoder[] m_LowCoder;

		@ObfuscatedName("sc.m")
		public BitTreeDecoder[] m_MidCoder;

		@ObfuscatedName("sc.k")
		public BitTreeDecoder m_HighCoder;

		@ObfuscatedName("sc.f")
		public int m_NumPosStates;

		// line 174
		public LenDecoder(Decoder arg0) {
			this.this$0 = arg0;
			this.m_Choice = new short[2];
			this.m_LowCoder = new BitTreeDecoder[16];
			this.m_MidCoder = new BitTreeDecoder[16];
			this.m_HighCoder = new BitTreeDecoder(8);
			this.m_NumPosStates = 0;
		}

		@ObfuscatedName("sc.e(II)V")
		public void create(int numPosStates) {
			for (; m_NumPosStates < numPosStates; m_NumPosStates++) {
				this.m_LowCoder[this.m_NumPosStates] = new BitTreeDecoder(3);
				this.m_MidCoder[this.m_NumPosStates] = new BitTreeDecoder(3);
			}
		}

		@ObfuscatedName("sc.n(B)V")
		public void init() {
			lzma.sdk.rangecoder.Decoder.initBitModels(this.m_Choice);
			for (int posState = 0; posState < this.m_NumPosStates; posState++) {
				this.m_LowCoder[posState].init();
				this.m_MidCoder[posState].init();
			}
			this.m_HighCoder.init();
		}

		@ObfuscatedName("sc.m(Ljp;IB)I")
		public int decode(lzma.sdk.rangecoder.Decoder rangeDecoder, int posState) throws IOException {
			if (rangeDecoder.decodeBit(this.m_Choice, 0) == 0) {
				return this.m_LowCoder[posState].decode(rangeDecoder);
			}
			byte symbol = 8;
			int var4;
			if (rangeDecoder.decodeBit(this.m_Choice, 1) == 0) {
				var4 = symbol + this.m_MidCoder[posState].decode(rangeDecoder);
			} else {
				var4 = symbol + 8 + this.m_HighCoder.decode(rangeDecoder);
			}
			return var4;
		}
	}

	@ObfuscatedName("sj")
	public static class LiteralDecoder {

		// $FF: synthetic field
		public final Decoder this$0;

		@ObfuscatedName("sj.e")
		public Decoder2[] m_Coders;

		@ObfuscatedName("sj.n")
		public int m_NumPrevBits;

		@ObfuscatedName("sj.m")
		public int m_NumPosBits;

		@ObfuscatedName("sj.k")
		public int m_PosMask;

		// line 207
		public LiteralDecoder(Decoder arg0) {
			this.this$0 = arg0;
		}

		// line 210
		@ObfuscatedName("sj.e(III)V")
		public void create(int numPosBits, int numPrevBits) {
			if (this.m_Coders != null && this.m_NumPrevBits == numPrevBits && this.m_NumPosBits == numPosBits) {
				return;
			}
			this.m_NumPosBits = numPosBits;
			this.m_PosMask = (0x1 << numPosBits) - 1;
			this.m_NumPrevBits = numPrevBits;
			int numStates = 0x1 << this.m_NumPosBits + this.m_NumPrevBits;
			this.m_Coders = new Decoder2[numStates];
			for (int i = 0; i < numStates; i++) {
				this.m_Coders[i] = new Decoder2(this);
			}
		}

		@ObfuscatedName("sj.n(I)V")
		public void init() {
			int numStates = 0x1 << this.m_NumPosBits + this.m_NumPrevBits;
			for (int i = 0; i < numStates; i++) {
				this.m_Coders[i].init();
			}
		}

		// line 225
		@ObfuscatedName("sj.m(IBI)Lsa;")
		public Decoder2 getDecoder(int pos, byte prevByte) {
			return this.m_Coders[((prevByte & 0xFF) >>> 8 - this.m_NumPrevBits) + ((pos & this.m_PosMask) << this.m_NumPrevBits)];
		}

		@ObfuscatedName("sa")
		public static class Decoder2 {

			// $FF: synthetic field
			public final LiteralDecoder this$1;

			@ObfuscatedName("sa.e")
			public short[] m_Decoders;

			// line 231
			public Decoder2(LiteralDecoder arg0) {
				this.this$1 = arg0;
				this.m_Decoders = new short[768];
			}

			@ObfuscatedName("sa.e(I)V")
			public void init() {
				lzma.sdk.rangecoder.Decoder.initBitModels(this.m_Decoders);
			}

			@ObfuscatedName("sa.n(Ljp;I)B")
			public byte decodeNormal(lzma.sdk.rangecoder.Decoder rangeDecoder) throws IOException {
				int symbol = 1;
				do {
					symbol = symbol << 1 | rangeDecoder.decodeBit(this.m_Decoders, symbol);
				} while (symbol < 256);
				return (byte) symbol;
			}

			@ObfuscatedName("sa.m(Ljp;BI)B")
			public byte decodeWithMatchByte(lzma.sdk.rangecoder.Decoder rangeDecoder, byte matchByte) throws IOException {
				int symbol = 1;
				do {
					int matchBit = matchByte >> 7 & 0x1;
					matchByte = (byte) (matchByte << 1);
					int bit = rangeDecoder.decodeBit(this.m_Decoders, (matchBit + 1 << 8) + symbol);
					symbol = symbol << 1 | bit;
					if (matchBit != bit) {
						while (symbol < 256) {
							symbol = symbol << 1 | rangeDecoder.decodeBit(this.m_Decoders, symbol);
						}
						return (byte) symbol;
					}
				} while (symbol < 256);
				return (byte) symbol;
			}
		}
	}
}
