package com.jagex.graphics;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

import java.nio.ByteBuffer;

@ObfuscatedName("akh")
public class GpuFloorModelRelated1 extends Node {

	@ObfuscatedName("akh.k")
	public final GpuToolkit field11409;

	@ObfuscatedName("akh.f")
	public final GpuFloorModel field11401;

	@ObfuscatedName("akh.w")
	public final int field11402;

	@ObfuscatedName("akh.l")
	public final float field11403;

	@ObfuscatedName("akh.u")
	public WaterFogData field11404;

	@ObfuscatedName("akh.z")
	public VertexBuffer field11405;

	@ObfuscatedName("akh.p")
	public int field11406 = 0;

	@ObfuscatedName("akh.d")
	public int[] field11412;

	@ObfuscatedName("akh.c")
	public int field11408 = 0;

	@ObfuscatedName("akh.r")
	public int field11400 = 0;

	@ObfuscatedName("akh.v")
	public int field11407 = 0;

	@ObfuscatedName("akh.o")
	public long field11411;

	@ObfuscatedName("akh.s")
	public ByteBuffer field11410;

	public GpuFloorModelRelated1(GpuFloorModel arg0, int arg1, int arg2, WaterFogData arg3) {
		this.field11401 = arg0;
		this.field11409 = this.field11401.field9516;
		this.field11402 = arg1;
		this.field11403 = arg2;
		this.field11404 = arg3;
		this.field11412 = new int[this.field11401.field1235 * this.field11401.field1234];
	}

	@ObfuscatedName("akh.e(I)V")
	public void method17761(int arg0) {
		this.field11410 = this.field11409.method16151(arg0 * 4);
		this.field11411 = this.field11409.method15963(this.field11410);
		for (int var2 = 3; var2 < arg0 * 4; var2 += 4) {
			this.field11409.field10110.putByte((long) var2 + this.field11411, (byte) 0);
		}
	}

	@ObfuscatedName("akh.n(I)V")
	public void method17763(int arg0) {
		this.field11409.field10110.putByte((long) (arg0 * 4) + this.field11411 + 3L, (byte) -1);
	}

	@ObfuscatedName("akh.m(III)V")
	public void method17764(int arg0, int arg1, int arg2) {
		this.field11412[this.field11401.field1235 * arg1 + arg0] |= 0x1 << arg2;
		this.field11406++;
	}

	@ObfuscatedName("akh.k(IIIF)V")
	public void method17762(int arg0, int arg1, int arg2, float arg3) {
		if (this.field11402 != -1) {
			Material var5 = this.field11409.materialList.get(this.field11402);
			int var6 = var5.field1364 & 0xFF;
			if (var6 != 0 && var5.effect != 4) {
				int var7;
				if (arg2 < 0) {
					var7 = 0;
				} else if (arg2 > 127) {
					var7 = 16777215;
				} else {
					var7 = arg2 * 131586;
				}
				if (var6 == 256) {
					arg1 = var7;
				} else {
					int var9 = 256 - var6;
					arg1 = ((arg1 & 0xFF00FF) * var9 + (var7 & 0xFF00FF) * var6 & 0xFF00FF00) + ((arg1 & 0xFF00) * var9 + (var7 & 0xFF00) * var6 & 0xFF0000) >> 8;
				}
			}
			int var10 = var5.field1363 & 0xFF;
			if (var10 != 0) {
				var10 += 256;
				int var11 = (arg1 >> 16 & 0xFF) * var10;
				if (var11 > 65535) {
					var11 = 65535;
				}
				int var12 = (arg1 >> 8 & 0xFF) * var10;
				if (var12 > 65535) {
					var12 = 65535;
				}
				int var13 = (arg1 & 0xFF) * var10;
				if (var13 > 65535) {
					var13 = 65535;
				}
				arg1 = (var13 >> 8) + ((var11 & 0xFF00) << 8) + (var12 & 0xFF00);
			}
		}
		if (arg3 != 1.0F) {
			int var14 = arg1 >> 16 & 0xFF;
			int var15 = arg1 >> 8 & 0xFF;
			int var16 = arg1 & 0xFF;
			int var17 = (int) ((float) var14 * arg3);
			if (var17 < 0) {
				var17 = 0;
			} else if (var17 > 255) {
				var17 = 255;
			}
			int var18 = (int) ((float) var15 * arg3);
			if (var18 < 0) {
				var18 = 0;
			} else if (var18 > 255) {
				var18 = 255;
			}
			int var19 = (int) ((float) var16 * arg3);
			if (var19 < 0) {
				var19 = 0;
			} else if (var19 > 255) {
				var19 = 255;
			}
			arg1 = var17 << 16 | var18 << 8 | var19;
		}
		if (this.field11409.field10185 == 0) {
			this.field11410.put(arg0 * 4, (byte) (arg1 >> 16));
			this.field11410.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.field11410.put(arg0 * 4 + 2, (byte) (arg1 >> 0));
		} else {
			this.field11410.put(arg0 * 4, (byte) (arg1 >> 0));
			this.field11410.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.field11410.put(arg0 * 4 + 2, (byte) (arg1 >> 16));
		}
	}

	@ObfuscatedName("akh.f(I)V")
	public void method17766(int arg0) {
		this.field11405 = this.field11409.createVertexBuffer(false);
		this.field11405.allocate(arg0 * 4, 4);
		this.field11405.upload(0, arg0 * 4, this.field11411);
		this.field11410.clear();
		this.field11410 = null;
		this.field11411 = 0L;
	}

	@ObfuscatedName("akh.w([II)V")
	public void method17767(int[] arg0, int arg1) {
		this.field11408 = 0;
		this.field11400 = 32767;
		this.field11407 = -32768;
		ByteBuffer var3 = this.field11409.temporaryBuffer;
		label49: for (int var4 = 0; var4 < arg1; var4++) {
			int var5 = arg0[var4];
			short[] var6 = this.field11401.field9494[var5];
			int var7 = this.field11412[var5];
			if (var7 != 0 && var6 != null) {
				int var8 = 0;
				int var9 = 0;
				while (true) {
					while (true) {
						if (var9 >= var6.length) {
							continue label49;
						}
						if ((var7 & 0x1 << var8++) == 0) {
							var9 += 3;
						} else {
							for (int var10 = 0; var10 < 3; var10++) {
								int var11 = var6[var9++] & 0xFFFF;
								if (var11 > this.field11407) {
									this.field11407 = var11;
								}
								if (var11 < this.field11400) {
									this.field11400 = var11;
								}
								var3.putShort((short) var11);
							}
							this.field11408 += 3;
						}
					}
				}
			}
		}
	}
}
