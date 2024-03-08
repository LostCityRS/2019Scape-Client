package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ObfuscatedName("sz")
public class LZMADecoder {

	@ObfuscatedName("sz.e")
	public LZMAOutWindow field6693 = new LZMAOutWindow();

	@ObfuscatedName("sz.n")
	public LZMARangeDecoder field6689 = new LZMARangeDecoder();

	@ObfuscatedName("sz.m")
	public short[] field6700 = new short[192];

	@ObfuscatedName("sz.k")
	public short[] field6691 = new short[12];

	@ObfuscatedName("sz.f")
	public short[] field6692 = new short[12];

	@ObfuscatedName("sz.w")
	public short[] field6696 = new short[12];

	@ObfuscatedName("sz.l")
	public short[] field6694 = new short[12];

	@ObfuscatedName("sz.u")
	public short[] field6695 = new short[192];

	@ObfuscatedName("sz.z")
	public LZMABitTreeDecoder[] field6702 = new LZMABitTreeDecoder[4];

	@ObfuscatedName("sz.p")
	public short[] field6697 = new short[114];

	@ObfuscatedName("sz.d")
	public LZMABitTreeDecoder field6690 = new LZMABitTreeDecoder(4);

	@ObfuscatedName("sz.c")
	public LZMALenDecoder field6699 = new LZMALenDecoder(this);

	@ObfuscatedName("sz.r")
	public LZMALenDecoder field6688 = new LZMALenDecoder(this);

	@ObfuscatedName("sz.v")
	public LZMALiteralDecoder field6698 = new LZMALiteralDecoder(this);

	@ObfuscatedName("sz.o")
	public int field6701 = -1;

	@ObfuscatedName("sz.s")
	public int field6703 = -1;

	@ObfuscatedName("sz.y")
	public int field6704;

	public LZMADecoder() {
		for (int var1 = 0; var1 < 4; var1++) {
			this.field6702[var1] = new LZMABitTreeDecoder(6);
		}
	}

	@ObfuscatedName("sz.e(IB)Z")
	public boolean method8313(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (this.field6701 != arg0) {
			this.field6701 = arg0;
			this.field6703 = Math.max(this.field6701, 1);
			this.field6693.method7915(Math.max(this.field6703, 4096));
		}
		return true;
	}

	@ObfuscatedName("sz.n(IIII)Z")
	public boolean method8316(int arg0, int arg1, int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.field6698.method8345(arg1, arg0);
		int var4 = 0x1 << arg2;
		this.field6699.method8360(var4);
		this.field6688.method8360(var4);
		this.field6704 = var4 - 1;
		return true;
	}

	@ObfuscatedName("sz.m(I)V")
	public void method8300() throws IOException {
		this.field6693.method7917(false);
		LZMARangeDecoder.method3545(this.field6700);
		LZMARangeDecoder.method3545(this.field6695);
		LZMARangeDecoder.method3545(this.field6691);
		LZMARangeDecoder.method3545(this.field6692);
		LZMARangeDecoder.method3545(this.field6696);
		LZMARangeDecoder.method3545(this.field6694);
		LZMARangeDecoder.method3545(this.field6697);
		this.field6698.method8352();
		for (int var1 = 0; var1 < 4; var1++) {
			this.field6702[var1].method5057();
		}
		this.field6699.method8361();
		this.field6688.method8361();
		this.field6690.method5057();
		this.field6689.method5084();
	}

	@ObfuscatedName("sz.k(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z")
	public boolean method8302(InputStream arg0, OutputStream arg1, long arg2) throws IOException {
		this.field6689.method5082(arg0);
		this.field6693.method7933(arg1);
		this.method8300();
		int var5 = LZMABase.method9417();
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
					int var13 = (int) var10 & this.field6704;
					if (this.field6689.method5086(this.field6700, (var5 << 4) + var13) != 0) {
						if (this.field6689.method5086(this.field6691, var5) == 1) {
							var15 = 0;
							if (this.field6689.method5086(this.field6692, var5) != 0) {
								int var16;
								if (this.field6689.method5086(this.field6696, var5) == 0) {
									var16 = var7;
								} else {
									if (this.field6689.method5086(this.field6694, var5) == 0) {
										var16 = var8;
									} else {
										var16 = var9;
										var9 = var8;
									}
									var8 = var7;
								}
								var7 = var6;
								var6 = var16;
							} else if (this.field6689.method5086(this.field6695, (var5 << 4) + var13) == 0) {
								var5 = LZMABase.method3481(var5);
								var15 = 1;
							}
							if (var15 == 0) {
								var15 = this.field6688.method8362(this.field6689, var13) + 2;
								var5 = LZMABase.method7706(var5);
							}
							break label71;
						}
						var9 = var8;
						var8 = var7;
						var7 = var6;
						var15 = this.field6699.method8362(this.field6689, var13) + 2;
						var5 = LZMABase.method10257(var5);
						int var17 = this.field6702[LZMABase.method7241(var15)].method5058(this.field6689);
						if (var17 < 4) {
							var6 = var17;
							break label71;
						}
						int var18 = (var17 >> 1) - 1;
						int var19 = (var17 & 0x1 | 0x2) << var18;
						if (var17 < 14) {
							var6 = var19 + Statics.method6106(this.field6697, var19 - var17 - 1, this.field6689, var18);
							break label71;
						}
						int var20 = var19 + (this.field6689.method5085(var18 - 4) << 4);
						var6 = var20 + this.field6690.method5061(this.field6689);
						if (var6 >= 0) {
							break label71;
						}
						if (var6 != -1) {
							return false;
						}
						break;
					}
					class522 var14 = this.field6698.method8347((int) var10, var12);
					if (LZMABase.method4525(var5)) {
						var12 = var14.method8335(this.field6689);
					} else {
						var12 = var14.method8333(this.field6689, this.field6693.method7914(var6));
					}
					this.field6693.method7920(var12);
					var5 = LZMABase.method9389(var5);
					var10++;
				}
				this.field6693.method7931();
				this.field6693.method7916();
				this.field6689.method5088();
				return true;
			}
			if ((long) var6 >= var10 || var6 >= this.field6703) {
				return false;
			}
			this.field6693.method7919(var6, var15);
			var10 += var15;
			var12 = this.field6693.method7914(0);
		}
	}

	@ObfuscatedName("sz.f([BI)Z")
	public boolean method8305(byte[] arg0) {
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
		return this.method8316(var3, var5, var6) ? this.method8313(var7) : false;
	}
}
