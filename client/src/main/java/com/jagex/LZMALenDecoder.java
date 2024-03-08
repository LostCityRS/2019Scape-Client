package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("sc")
public class LZMALenDecoder {

	// $FF: synthetic field
	public final LZMADecoder this$0;

	@ObfuscatedName("sc.e")
	public short[] field6724;

	@ObfuscatedName("sc.n")
	public LZMABitTreeDecoder[] field6723;

	@ObfuscatedName("sc.m")
	public LZMABitTreeDecoder[] field6722;

	@ObfuscatedName("sc.k")
	public LZMABitTreeDecoder field6725;

	@ObfuscatedName("sc.f")
	public int field6726;

	public LZMALenDecoder(LZMADecoder arg0) {
		this.this$0 = arg0;
		this.field6724 = new short[2];
		this.field6723 = new LZMABitTreeDecoder[16];
		this.field6722 = new LZMABitTreeDecoder[16];
		this.field6725 = new LZMABitTreeDecoder(8);
		this.field6726 = 0;
	}

	@ObfuscatedName("sc.e(II)V")
	public void method8360(int arg0) {
		while (this.field6726 < arg0) {
			this.field6723[this.field6726] = new LZMABitTreeDecoder(3);
			this.field6722[this.field6726] = new LZMABitTreeDecoder(3);
			this.field6726++;
		}
	}

	@ObfuscatedName("sc.n(B)V")
	public void method8361() {
		LZMARangeDecoder.method3545(this.field6724);
		for (int var1 = 0; var1 < this.field6726; var1++) {
			this.field6723[var1].method5057();
			this.field6722[var1].method5057();
		}
		this.field6725.method5057();
	}

	@ObfuscatedName("sc.m(Ljp;IB)I")
	public int method8362(LZMARangeDecoder arg0, int arg1) throws IOException {
		if (arg0.method5086(this.field6724, 0) == 0) {
			return this.field6723[arg1].method5058(arg0);
		}
		byte var3 = 8;
		int var4;
		if (arg0.method5086(this.field6724, 1) == 0) {
			var4 = var3 + this.field6722[arg1].method5058(arg0);
		} else {
			var4 = var3 + 8 + this.field6725.method5058(arg0);
		}
		return var4;
	}
}
