package lzma.sdk.rangecoder;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("jp")
public class Decoder {

	@ObfuscatedName("jp.f")
	public int Range;

	@ObfuscatedName("jp.w")
	public int Code;

	@ObfuscatedName("jp.l")
	public InputStream Stream;

	@ObfuscatedName("jp.e(Ljava/io/InputStream;B)V")
	public final void setStream(InputStream stream) {
		this.Stream = stream;
	}

	@ObfuscatedName("jp.n(B)V")
	public final void releaseStream() {
		this.Stream = null;
	}

	@ObfuscatedName("jp.m(I)V")
	public final void init() throws IOException {
		this.Code = 0;
		this.Range = -1;
		for (int i = 0; i < 5; i++) {
			this.Code = this.Code << 8 | this.Stream.read();
		}
	}

	@ObfuscatedName("jp.k(II)I")
	public final int decodeDirectBits(int numTotalBits) throws IOException {
		int result = 0;
		for (int i = numTotalBits; i != 0; i--) {
			this.Range >>>= 0x1;
			int t = this.Code - this.Range >>> 31;
			this.Code -= this.Range & t - 1;
			result = result << 1 | 1 - t;
			if ((this.Range & 0xFF000000) == 0) {
				this.Code = this.Code << 8 | this.Stream.read();
				this.Range <<= 0x8;
			}
		}
		return result;
	}

	@ObfuscatedName("jp.f([SII)I")
	public int decodeBit(short[] probs, int index) throws IOException {
		short prob = probs[index];
		int newBound = (this.Range >>> 11) * prob;
		if ((this.Code ^ Integer.MIN_VALUE) < (newBound ^ Integer.MIN_VALUE)) {
			this.Range = newBound;
			probs[index] = (short) ((2048 - prob >>> 5) + prob);
			if ((this.Range & 0xFF000000) == 0) {
				this.Code = this.Code << 8 | this.Stream.read();
				this.Range <<= 0x8;
			}
			return 0;
		}
		this.Range -= newBound;
		this.Code -= newBound;
		probs[index] = (short) (prob - (prob >>> 5));
		if ((this.Range & 0xFF000000) == 0) {
			this.Code = this.Code << 8 | this.Stream.read();
			this.Range <<= 0x8;
		}
		return 1;
	}

	@ObfuscatedName("gn.w([SI)V")
	public static void initBitModels(short[] probs) {
		for (int i = 0; i < probs.length; i++) {
			probs[i] = 1024;
		}
	}
}
