package com.jagex.graphics.gl;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.graphics.FloorModelNode;
import com.jagex.graphics.GpuPacket;
import com.jagex.graphics.Light;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("ajr")
public class GlFloorModelRelated5 extends Node {

	@ObfuscatedName("ajr.k")
	public final GlToolkit field11279;

	@ObfuscatedName("ajr.f")
	public final GlFloorModel field11273;

	@ObfuscatedName("ajr.w")
	public final Light field11274;

	@ObfuscatedName("ajr.l")
	public int field11275;

	@ObfuscatedName("ajr.u")
	public int field11272;

	@ObfuscatedName("ajr.z")
	public int field11277;

	@ObfuscatedName("ajr.p")
	public int field11278;

	@ObfuscatedName("ajr.d")
	public int field11286;

	@ObfuscatedName("ajr.c")
	public int field11280;

	@ObfuscatedName("ajr.r")
	public final GlBinding field11281;

	@ObfuscatedName("ajr.v")
	public final GlInterfaceRelated field11282;

	@ObfuscatedName("ajr.o")
	public final GlRelated3 field11283;

	@ObfuscatedName("ajr.s")
	public final GlRelated3 field11284;

	@ObfuscatedName("ajr.y")
	public float[][] field11285;

	@ObfuscatedName("ajr.q")
	public float[][] field11287;

	@ObfuscatedName("ajr.x")
	public float[][] field11276;

	@ObfuscatedName("ajr.b")
	public Packet field11288;

	@ObfuscatedName("ajr.h")
	public GpuPacket field11289;

	@ObfuscatedName("ajr.a")
	public HashTable field11290;

	public GlFloorModelRelated5(GlToolkit arg0, GlFloorModel arg1, Light arg2, int[] arg3) {
		this.field11279 = arg0;
		this.field11274 = arg2;
		this.field11273 = arg1;
		int var5 = this.field11274.method17608() - (arg1.field1233 >> 1);
		this.field11275 = this.field11274.method17605() - var5 >> arg1.field1236;
		this.field11272 = this.field11274.method17605() + var5 >> arg1.field1236;
		this.field11277 = this.field11274.method17607() - var5 >> arg1.field1236;
		this.field11278 = this.field11274.method17607() + var5 >> arg1.field1236;
		int var6 = this.field11272 - this.field11275 + 1;
		int var7 = this.field11278 - this.field11277 + 1;
		this.field11285 = new float[var6 + 1][var7 + 1];
		this.field11287 = new float[var6 + 1][var7 + 1];
		this.field11276 = new float[var6 + 1][var7 + 1];
		for (int var8 = 0; var8 <= var7; var8++) {
			int var9 = this.field11277 + var8;
			if (var9 > 0 && var9 < this.field11273.field1234 - 1) {
				for (int var10 = 0; var10 <= var6; var10++) {
					int var11 = this.field11275 + var10;
					if (var11 > 0 && var11 < this.field11273.field1235 - 1) {
						int var12 = arg1.getTileHeight(var11 + 1, var9) - arg1.getTileHeight(var11 - 1, var9);
						int var13 = arg1.getTileHeight(var11, var9 + 1) - arg1.getTileHeight(var11, var9 - 1);
						float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
						this.field11285[var10][var8] = (float) var12 * var14;
						this.field11287[var10][var8] = var14 * -256.0F;
						this.field11276[var10][var8] = (float) var13 * var14;
					}
				}
			}
		}
		int var15 = 0;
		for (int var16 = this.field11277; var16 <= this.field11278; var16++) {
			if (var16 >= 0 && var16 < arg1.field1234) {
				for (int var17 = this.field11275; var17 <= this.field11272; var17++) {
					if (var17 >= 0 && var17 < arg1.field1235) {
						int var18 = arg3[var15];
						int[] var19 = arg1.field9462[var17][var16];
						if (var19 != null && var18 != 0) {
							if (var18 == 1) {
								for (int var20 = 0; var20 < var19.length; var20 += 3) {
									if (var19[var20] != -1 && var19[var20 + 1] != -1 && var19[var20 + 2] != -1) {
										this.field11280 += 3;
									}
								}
							} else {
								this.field11280 += 3;
							}
						}
					}
					var15++;
				}
			} else {
				var15 += this.field11272 - this.field11275;
			}
		}
		if (this.field11280 > 0) {
			this.field11288 = new Packet(this.field11280 * 2);
			this.field11289 = new GpuPacket(this.field11280 * 16);
			this.field11290 = new HashTable(IntMath.bitceil(this.field11280));
			int var21 = 0;
			int var22 = 0;
			for (int var23 = this.field11277; var23 <= this.field11278; var23++) {
				if (var23 >= 0 && var23 < arg1.field1234) {
					int var24 = 0;
					for (int var25 = this.field11275; var25 <= this.field11272; var25++) {
						if (var25 >= 0 && var25 < arg1.field1235) {
							int var26 = arg3[var22];
							int[] var27 = arg1.field9462[var25][var23];
							if (var27 != null && var26 != 0) {
								if (var26 == 1) {
									int[] var28 = arg1.field9464[var25][var23];
									int[] var29 = arg1.field9451[var25][var23];
									int var30 = 0;
									label110: while (true) {
										while (true) {
											if (var30 >= var27.length) {
												break label110;
											}
											if (var27[var30] == -1 || var27[var30 + 1] == -1 || var27[var30 + 2] == -1) {
												var30 += 3;
											} else {
												this.method17573(var24, var21, var25, var23, var28[var30], var29[var30]);
												var30++;
												this.method17573(var24, var21, var25, var23, var28[var30], var29[var30]);
												var30++;
												this.method17573(var24, var21, var25, var23, var28[var30], var29[var30]);
												var30++;
											}
										}
									}
								} else if (var26 == 3) {
									this.method17573(var24, var21, var25, var23, 0, 0);
									this.method17573(var24, var21, var25, var23, arg1.field1233, 0);
									this.method17573(var24, var21, var25, var23, 0, arg1.field1233);
								} else if (var26 == 2) {
									this.method17573(var24, var21, var25, var23, arg1.field1233, 0);
									this.method17573(var24, var21, var25, var23, arg1.field1233, arg1.field1233);
									this.method17573(var24, var21, var25, var23, 0, 0);
								} else if (var26 == 5) {
									this.method17573(var24, var21, var25, var23, arg1.field1233, arg1.field1233);
									this.method17573(var24, var21, var25, var23, 0, arg1.field1233);
									this.method17573(var24, var21, var25, var23, arg1.field1233, 0);
								} else if (var26 == 4) {
									this.method17573(var24, var21, var25, var23, 0, arg1.field1233);
									this.method17573(var24, var21, var25, var23, 0, 0);
									this.method17573(var24, var21, var25, var23, arg1.field1233, arg1.field1233);
								}
							}
						}
						var22++;
						var24++;
					}
				} else {
					var22 += this.field11272 - this.field11275;
				}
				var21++;
			}
			this.field11281 = this.field11279.method15766(5123, this.field11288.data, this.field11288.pos, false);
			this.field11282 = this.field11279.method15767(16, this.field11289.data, this.field11289.pos, false);
			this.field11283 = new GlRelated3(this.field11282, 5126, 3, 0);
			this.field11284 = new GlRelated3(this.field11282, 5121, 4, 12);
		} else {
			this.field11281 = null;
			this.field11282 = null;
			this.field11283 = null;
			this.field11284 = null;
		}
		this.field11289 = null;
		this.field11288 = null;
		this.field11290 = null;
		this.field11276 = null;
		this.field11287 = null;
		this.field11285 = null;
	}

	@ObfuscatedName("ajr.e(S)V")
	public void method17571(short arg0) {
		if (this.field11279.field10017) {
			this.field11288.p2(arg0);
		} else {
			this.field11288.ip2(arg0);
		}
	}

	@ObfuscatedName("ajr.n(IIIIII)V")
	public void method17573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var7 = -1L;
		int var9 = (arg2 << this.field11273.field1236) + arg4;
		int var10 = (arg3 << this.field11273.field1236) + arg5;
		int var11 = this.field11273.getFineHeight(var9, var10);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			var7 = ((long) var10 & 0xFFFFL) << 16 | (long) var9 & 0xFFFFL;
			FloorModelNode var12 = (FloorModelNode) this.field11290.get(var7);
			if (var12 != null) {
				this.method17571(var12.field11437);
				return;
			}
		}
		short var13 = (short) this.field11286++;
		if (var7 != -1L) {
			this.field11290.put(new FloorModelNode(var13), var7);
		}
		float var14;
		float var15;
		float var16;
		if (arg4 == 0 && arg5 == 0) {
			var14 = this.field11285[arg0][arg1];
			var15 = this.field11287[arg0][arg1];
			var16 = this.field11276[arg0][arg1];
		} else if (this.field11273.field1233 == arg4 && arg5 == 0) {
			var14 = this.field11285[arg0 + 1][arg1];
			var15 = this.field11287[arg0 + 1][arg1];
			var16 = this.field11276[arg0 + 1][arg1];
		} else if (this.field11273.field1233 == arg4 && this.field11273.field1233 == arg5) {
			var14 = this.field11285[arg0 + 1][arg1 + 1];
			var15 = this.field11287[arg0 + 1][arg1 + 1];
			var16 = this.field11276[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && this.field11273.field1233 == arg5) {
			var14 = this.field11285[arg0][arg1 + 1];
			var15 = this.field11287[arg0][arg1 + 1];
			var16 = this.field11276[arg0][arg1 + 1];
		} else {
			float var17 = (float) arg4 / (float) this.field11273.field1233;
			float var18 = (float) arg5 / (float) this.field11273.field1233;
			float var19 = this.field11285[arg0][arg1];
			float var20 = this.field11287[arg0][arg1];
			float var21 = this.field11276[arg0][arg1];
			float var22 = this.field11285[arg0 + 1][arg1];
			float var23 = this.field11287[arg0 + 1][arg1];
			float var24 = this.field11276[arg0 + 1][arg1];
			float var25 = (this.field11285[arg0][arg1 + 1] - var19) * var17 + var19;
			float var26 = (this.field11287[arg0][arg1 + 1] - var20) * var17 + var20;
			float var27 = (this.field11276[arg0][arg1 + 1] - var21) * var17 + var21;
			float var28 = (this.field11285[arg0 + 1][arg1 + 1] - var22) * var17 + var22;
			float var29 = (this.field11287[arg0 + 1][arg1 + 1] - var23) * var17 + var23;
			float var30 = (this.field11276[arg0 + 1][arg1 + 1] - var24) * var17 + var24;
			var14 = (var28 - var25) * var18 + var25;
			var15 = (var29 - var26) * var18 + var26;
			var16 = (var30 - var27) * var18 + var27;
		}
		float var31 = (float) (this.field11274.method17605() - var9);
		float var32 = (float) (this.field11274.method17606() - var11);
		float var33 = (float) (this.field11274.method17607() - var10);
		float var34 = (float) Math.sqrt((double) (var33 * var33 + var31 * var31 + var32 * var32));
		float var35 = 1.0F / var34;
		float var36 = var31 * var35;
		float var37 = var32 * var35;
		float var38 = var33 * var35;
		float var39 = var34 / (float) this.field11274.method17608();
		float var40 = 1.0F - var39 * var39;
		if (var40 < 0.0F) {
			var40 = 0.0F;
		}
		float var41 = var16 * var38 + var14 * var36 + var15 * var37;
		if (var41 < 0.0F) {
			var41 = 0.0F;
		}
		float var42 = var40 * var41 * 2.0F;
		if (var42 > 1.0F) {
			var42 = 1.0F;
		}
		int var43 = this.field11274.method17624();
		int var44 = (int) ((float) (var43 >> 16 & 0xFF) * var42);
		if (var44 > 255) {
			var44 = 255;
		}
		int var45 = (int) ((float) (var43 >> 8 & 0xFF) * var42);
		if (var45 > 255) {
			var45 = 255;
		}
		int var46 = (int) ((float) (var43 & 0xFF) * var42);
		if (var46 > 255) {
			var46 = 255;
		}
		if (this.field11279.field10017) {
			this.field11289.method19550((float) var9);
			this.field11289.method19550((float) var11);
			this.field11289.method19550((float) var10);
		} else {
			this.field11289.method19553((float) var9);
			this.field11289.method19553((float) var11);
			this.field11289.method19553((float) var10);
		}
		this.field11289.p1(var44);
		this.field11289.p1(var45);
		this.field11289.p1(var46);
		this.field11289.p1(255);
		this.method17571(var13);
	}

	@ObfuscatedName("ajr.m(III[[Z)V")
	public void method17572(int arg0, int arg1, int arg2, boolean[][] arg3) {
		if (this.field11281 == null || (this.field11275 > arg0 + arg2 || (this.field11272 < arg0 - arg2 || (this.field11277 > arg1 + arg2 || this.field11278 < arg1 - arg2)))) {
			return;
		}
		for (int var5 = this.field11277; var5 <= this.field11278; var5++) {
			for (int var6 = this.field11275; var6 <= this.field11272; var6++) {
				int var7 = var6 - arg0;
				int var8 = var5 - arg1;
				if (var7 > -arg2 && var7 < arg2 && var8 > -arg2 && var8 < arg2 && arg3[arg2 + var7][arg2 + var8]) {
					this.field11279.method15765((int) (this.field11274.method17610() * 255.0F) << 24);
					this.field11279.method15809(this.field11283, null, this.field11284, null);
					this.field11279.method15921(this.field11281, 4, 0, this.field11280);
					return;
				}
			}
		}
	}
}
