package lzma.sdk.rangecoder;

import deob.ObfuscatedName;
import java.io.IOException;

@ObfuscatedName("jg")
public class BitTreeDecoder {

	@ObfuscatedName("jg.e")
	public short[] Models;

	@ObfuscatedName("jg.n")
	public int NumBitLevels;

	public BitTreeDecoder(int arg0) {
		this.NumBitLevels = arg0;
		this.Models = new short[0x1 << arg0];
	}

	@ObfuscatedName("jg.e(B)V")
	public void init() {
		Decoder.initBitModels(this.Models);
	}

	@ObfuscatedName("jg.n(Ljp;B)I")
	public int decode(Decoder arg0) throws IOException {
		int var2 = 1;
		for (int var3 = this.NumBitLevels; var3 != 0; var3--) {
			var2 = (var2 << 1) + arg0.decodeBit(this.Models, var2);
		}
		return var2 - (0x1 << this.NumBitLevels);
	}

	@ObfuscatedName("jg.m(Ljp;I)I")
	public int reverseDecode(Decoder arg0) throws IOException {
		int var2 = 1;
		int var3 = 0;
		for (int var4 = 0; var4 < this.NumBitLevels; var4++) {
			int var5 = arg0.decodeBit(this.Models, var2);
			int var6 = var2 << 1;
			var2 = var5 + var6;
			var3 |= var5 << var4;
		}
		return var3;
	}
}
