package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("jp")
public class LZMARangeDecoder {

	@ObfuscatedName("jp.f")
	public int field3016;

	@ObfuscatedName("jp.w")
	public int field3017;

	@ObfuscatedName("jp.l")
	public InputStream field3018;

	@ObfuscatedName("jp.e(Ljava/io/InputStream;B)V")
	public final void method5082(InputStream arg0) {
		this.field3018 = arg0;
	}

	@ObfuscatedName("jp.n(B)V")
	public final void method5088() {
		this.field3018 = null;
	}

	@ObfuscatedName("jp.m(I)V")
	public final void method5084() throws IOException {
		this.field3017 = 0;
		this.field3016 = -1;
		for (int var1 = 0; var1 < 5; var1++) {
			this.field3017 = this.field3017 << 8 | this.field3018.read();
		}
	}

	@ObfuscatedName("jp.k(II)I")
	public final int method5085(int arg0) throws IOException {
		int var2 = 0;
		for (int var3 = arg0; var3 != 0; var3--) {
			this.field3016 >>>= 0x1;
			int var4 = this.field3017 - this.field3016 >>> 31;
			this.field3017 -= this.field3016 & var4 - 1;
			var2 = var2 << 1 | 1 - var4;
			if ((this.field3016 & 0xFF000000) == 0) {
				this.field3017 = this.field3017 << 8 | this.field3018.read();
				this.field3016 <<= 0x8;
			}
		}
		return var2;
	}

	@ObfuscatedName("jp.f([SII)I")
	public int method5086(short[] arg0, int arg1) throws IOException {
		short var3 = arg0[arg1];
		int var4 = (this.field3016 >>> 11) * var3;
		if ((this.field3017 ^ Integer.MIN_VALUE) < (var4 ^ Integer.MIN_VALUE)) {
			this.field3016 = var4;
			arg0[arg1] = (short) ((2048 - var3 >>> 5) + var3);
			if ((this.field3016 & 0xFF000000) == 0) {
				this.field3017 = this.field3017 << 8 | this.field3018.read();
				this.field3016 <<= 0x8;
			}
			return 0;
		}
		this.field3016 -= var4;
		this.field3017 -= var4;
		arg0[arg1] = (short) (var3 - (var3 >>> 5));
		if ((this.field3016 & 0xFF000000) == 0) {
			this.field3017 = this.field3017 << 8 | this.field3018.read();
			this.field3016 <<= 0x8;
		}
		return 1;
	}

	@ObfuscatedName("gn.w([SI)V")
	public static void method3545(short[] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			arg0[var1] = 1024;
		}
	}
}
