package lzma.sdk.lzma;

import deob.ObfuscatedName;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lzma.sdk.lz.OutWindow;
import lzma.sdk.rangecoder.BitTreeDecoder;

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
	public Decoder.LenDecoder m_LenDecoder = new Decoder.LenDecoder();

	@ObfuscatedName("sz.r")
	public Decoder.LenDecoder m_RepLenDecoder = new Decoder.LenDecoder();

	@ObfuscatedName("sz.v")
	public Decoder.LiteralDecoder m_LiteralDecoder = new Decoder.LiteralDecoder();

	@ObfuscatedName("sz.o")
	public int m_DictionarySize = -1;

	@ObfuscatedName("sz.s")
	public int m_DictionarySizeCheck = -1;

	@ObfuscatedName("sz.y")
	public int m_PosStateMask;

	public Decoder() {
		for (int var1 = 0; var1 < 4; var1++) {
			this.m_PosSlotDecoder[var1] = new BitTreeDecoder(6);
		}
	}

	@ObfuscatedName("sz.e(IB)Z")
	public boolean setDictionarySize(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (this.m_DictionarySize != arg0) {
			this.m_DictionarySize = arg0;
			this.m_DictionarySizeCheck = Math.max(this.m_DictionarySize, 1);
			this.m_OutWindow.create(Math.max(this.m_DictionarySizeCheck, 4096));
		}
		return true;
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

	@ObfuscatedName("sz.n(IIII)Z")
	public boolean setLcLpPb(int arg0, int arg1, int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.m_LiteralDecoder.create(arg1, arg0);
		int var4 = 0x1 << arg2;
		this.m_LenDecoder.create(var4);
		this.m_RepLenDecoder.create(var4);
		this.m_PosStateMask = var4 - 1;
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
		for (int var1 = 0; var1 < 4; var1++) {
			this.m_PosSlotDecoder[var1].init();
		}
		this.m_LenDecoder.init();
		this.m_RepLenDecoder.init();
		this.m_PosAlignDecoder.init();
		this.m_RangeDecoder.init();
	}

	@ObfuscatedName("sz.k(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z")
	public boolean code(InputStream arg0, OutputStream arg1, long arg2) throws IOException {
		this.m_RangeDecoder.setStream(arg0);
		this.m_OutWindow.setStream(arg1);
		this.init();
		int var5 = Base.stateInit();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		long var10 = 0L;
		byte var12 = 0;
		while (true) {
			int var15;
			label71: {
				while (arg2 < 0L || var10 < arg2) {
					int var13 = (int) var10 & this.m_PosStateMask;
					if (this.m_RangeDecoder.decodeBit(this.m_IsMatchDecoders, (var5 << 4) + var13) != 0) {
						if (this.m_RangeDecoder.decodeBit(this.m_IsRepDecoders, var5) == 1) {
							var15 = 0;
							if (this.m_RangeDecoder.decodeBit(this.m_IsRepG0Decoders, var5) != 0) {
								int var16;
								if (this.m_RangeDecoder.decodeBit(this.m_IsRepG1Decoders, var5) == 0) {
									var16 = var7;
								} else {
									if (this.m_RangeDecoder.decodeBit(this.m_IsRepG2Decoders, var5) == 0) {
										var16 = var8;
									} else {
										var16 = var9;
										var9 = var8;
									}
									var8 = var7;
								}
								var7 = var6;
								var6 = var16;
							} else if (this.m_RangeDecoder.decodeBit(this.m_IsRep0LongDecoders, (var5 << 4) + var13) == 0) {
								var5 = Base.stateUpdateShortRep(var5);
								var15 = 1;
							}
							if (var15 == 0) {
								var15 = this.m_RepLenDecoder.decode(this.m_RangeDecoder, var13) + 2;
								var5 = Base.stateUpdateRep(var5);
							}
							break label71;
						}
						var9 = var8;
						var8 = var7;
						var7 = var6;
						var15 = this.m_LenDecoder.decode(this.m_RangeDecoder, var13) + 2;
						var5 = Base.stateUpdateMatch(var5);
						int var17 = this.m_PosSlotDecoder[Base.getLenToPosState(var15)].decode(this.m_RangeDecoder);
						if (var17 < 4) {
							var6 = var17;
							break label71;
						}
						int var18 = (var17 >> 1) - 1;
						int var19 = (var17 & 0x1 | 0x2) << var18;
						if (var17 < 14) {
							var6 = var19 + reverseDecode(this.m_PosDecoders, var19 - var17 - 1, this.m_RangeDecoder, var18);
							break label71;
						}
						int var20 = var19 + (this.m_RangeDecoder.decodeDirectBits(var18 - 4) << 4);
						var6 = var20 + this.m_PosAlignDecoder.reverseDecode(this.m_RangeDecoder);
						if (var6 >= 0) {
							break label71;
						}
						if (var6 != -1) {
							return false;
						}
						break;
					}
					Decoder.Decoder2 var14 = this.m_LiteralDecoder.getDecoder((int) var10, var12);
					if (Base.stateIsCharState(var5)) {
						var12 = var14.decodeNormal(this.m_RangeDecoder);
					} else {
						var12 = var14.decodeWithMatchByte(this.m_RangeDecoder, this.m_OutWindow.getByte(var6));
					}
					this.m_OutWindow.putByte(var12);
					var5 = Base.stateUpdateChar(var5);
					var10++;
				}
				this.m_OutWindow.flush();
				this.m_OutWindow.releaseStream();
				this.m_RangeDecoder.releaseStream();
				return true;
			}
			if ((long) var6 >= var10 || var6 >= this.m_DictionarySizeCheck) {
				return false;
			}
			this.m_OutWindow.copyBlock(var6, var15);
			var10 += var15;
			var12 = this.m_OutWindow.getByte(0);
		}
	}

	@ObfuscatedName("sz.f([BI)Z")
	public boolean setDecoderProperties(byte[] arg0) {
		if (arg0.length < 5) {
			return false;
		}
		int var2 = arg0[0] & 0xFF;
		int var3 = var2 % 9;
		int var4 = var2 / 9;
		int var5 = var4 % 5;
		int var6 = var4 / 5;
		int var7 = 0;
		for (int var8 = 0; var8 < 4; var8++) {
			var7 += (arg0[var8 + 1] & 0xFF) << var8 * 8;
		}
		return this.setLcLpPb(var3, var5, var6) ? this.setDictionarySize(var7) : false;
	}

	@ObfuscatedName("sa")
	public class Decoder2 {

		@ObfuscatedName("sa.e")
		public short[] m_Decoders = new short[768];

		@ObfuscatedName("sa.e(I)V")
		public void init() {
			lzma.sdk.rangecoder.Decoder.initBitModels(this.m_Decoders);
		}

		@ObfuscatedName("sa.n(Ljp;I)B")
		public byte decodeNormal(lzma.sdk.rangecoder.Decoder arg0) throws IOException {
			int var2 = 1;
			do {
				var2 = var2 << 1 | arg0.decodeBit(this.m_Decoders, var2);
			} while (var2 < 256);
			return (byte) var2;
		}

		@ObfuscatedName("sa.m(Ljp;BI)B")
		public byte decodeWithMatchByte(lzma.sdk.rangecoder.Decoder arg0, byte arg1) throws IOException {
			int var3 = 1;
			do {
				int var4 = arg1 >> 7 & 0x1;
				arg1 = (byte) (arg1 << 1);
				int var5 = arg0.decodeBit(this.m_Decoders, (var4 + 1 << 8) + var3);
				var3 = var3 << 1 | var5;
				if (var4 != var5) {
					while (var3 < 256) {
						var3 = var3 << 1 | arg0.decodeBit(this.m_Decoders, var3);
					}
					return (byte) var3;
				}
			} while (var3 < 256);
			return (byte) var3;
		}
	}

	@ObfuscatedName("sj")
	public class LiteralDecoder {

		@ObfuscatedName("sj.e")
		public Decoder.Decoder2[] m_Coders;

		@ObfuscatedName("sj.n")
		public int m_NumPrevBits;

		@ObfuscatedName("sj.m")
		public int m_NumPosBits;

		@ObfuscatedName("sj.k")
		public int m_PosMask;

		@ObfuscatedName("sj.e(III)V")
		public void create(int arg0, int arg1) {
			if (this.m_Coders != null && this.m_NumPrevBits == arg1 && this.m_NumPosBits == arg0) {
				return;
			}
			this.m_NumPosBits = arg0;
			this.m_PosMask = (0x1 << arg0) - 1;
			this.m_NumPrevBits = arg1;
			int var3 = 0x1 << this.m_NumPosBits + this.m_NumPrevBits;
			this.m_Coders = new Decoder.Decoder2[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.m_Coders[var4] = new Decoder.Decoder2();
			}
		}

		@ObfuscatedName("sj.n(I)V")
		public void init() {
			int var1 = 0x1 << this.m_NumPosBits + this.m_NumPrevBits;
			for (int var2 = 0; var2 < var1; var2++) {
				this.m_Coders[var2].init();
			}
		}

		@ObfuscatedName("sj.m(IBI)Lsa;")
		public Decoder.Decoder2 getDecoder(int arg0, byte arg1) {
			return this.m_Coders[((arg1 & 0xFF) >>> 8 - this.m_NumPrevBits) + ((arg0 & this.m_PosMask) << this.m_NumPrevBits)];
		}
	}

	@ObfuscatedName("sc")
	public class LenDecoder {

		@ObfuscatedName("sc.e")
		public short[] m_Choice = new short[2];

		@ObfuscatedName("sc.n")
		public BitTreeDecoder[] m_LowCoder = new BitTreeDecoder[16];

		@ObfuscatedName("sc.m")
		public BitTreeDecoder[] m_MidCoder = new BitTreeDecoder[16];

		@ObfuscatedName("sc.k")
		public BitTreeDecoder m_HighCoder = new BitTreeDecoder(8);

		@ObfuscatedName("sc.f")
		public int m_NumPosStates = 0;

		@ObfuscatedName("sc.e(II)V")
		public void create(int arg0) {
			while (this.m_NumPosStates < arg0) {
				this.m_LowCoder[this.m_NumPosStates] = new BitTreeDecoder(3);
				this.m_MidCoder[this.m_NumPosStates] = new BitTreeDecoder(3);
				this.m_NumPosStates++;
			}
		}

		@ObfuscatedName("sc.n(B)V")
		public void init() {
			lzma.sdk.rangecoder.Decoder.initBitModels(this.m_Choice);
			for (int var1 = 0; var1 < this.m_NumPosStates; var1++) {
				this.m_LowCoder[var1].init();
				this.m_MidCoder[var1].init();
			}
			this.m_HighCoder.init();
		}

		@ObfuscatedName("sc.m(Ljp;IB)I")
		public int decode(lzma.sdk.rangecoder.Decoder arg0, int arg1) throws IOException {
			if (arg0.decodeBit(this.m_Choice, 0) == 0) {
				return this.m_LowCoder[arg1].decode(arg0);
			}
			byte var3 = 8;
			int var4;
			if (arg0.decodeBit(this.m_Choice, 1) == 0) {
				var4 = var3 + this.m_MidCoder[arg1].decode(arg0);
			} else {
				var4 = var3 + 8 + this.m_HighCoder.decode(arg0);
			}
			return var4;
		}
	}
}
