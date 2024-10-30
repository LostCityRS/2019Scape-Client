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
	public final void setStream(InputStream arg0) {
		this.Stream = arg0;
	}

	@ObfuscatedName("jp.n(B)V")
	public final void releaseStream() {
		this.Stream = null;
	}

	@ObfuscatedName("jp.m(I)V")
	public final void init() throws IOException {
		this.Code = 0;
		this.Range = -1;
		for (int var1 = 0; var1 < 5; var1++) {
			this.Code = this.Code << 8 | this.Stream.read();
		}
	}

	@ObfuscatedName("jp.k(II)I")
	public final int decodeDirectBits(int arg0) throws IOException {
		int var2 = 0;
		for (int var3 = arg0; var3 != 0; var3--) {
			this.Range >>>= 0x1;
			int var4 = this.Code - this.Range >>> 31;
			this.Code -= this.Range & var4 - 1;
			var2 = var2 << 1 | 1 - var4;
			if ((this.Range & 0xFF000000) == 0) {
				this.Code = this.Code << 8 | this.Stream.read();
				this.Range <<= 0x8;
			}
		}
		return var2;
	}

	@ObfuscatedName("jp.f([SII)I")
	public int decodeBit(short[] arg0, int arg1) throws IOException {
		short var3 = arg0[arg1];
		int var4 = (this.Range >>> 11) * var3;
		if ((this.Code ^ Integer.MIN_VALUE) < (var4 ^ Integer.MIN_VALUE)) {
			this.Range = var4;
			arg0[arg1] = (short) ((2048 - var3 >>> 5) + var3);
			if ((this.Range & 0xFF000000) == 0) {
				this.Code = this.Code << 8 | this.Stream.read();
				this.Range <<= 0x8;
			}
			return 0;
		}
		this.Range -= var4;
		this.Code -= var4;
		arg0[arg1] = (short) (var3 - (var3 >>> 5));
		if ((this.Range & 0xFF000000) == 0) {
			this.Code = this.Code << 8 | this.Stream.read();
			this.Range <<= 0x8;
		}
		return 1;
	}

	@ObfuscatedName("gn.w([SI)V")
	public static void initBitModels(short[] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			arg0[var1] = 1024;
		}
	}
}
