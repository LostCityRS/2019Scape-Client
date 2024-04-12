package com.jagex.graphics;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;
import sun.misc.Unsafe;

import java.nio.ByteBuffer;

@ObfuscatedName("akx")
public class GpuFloorModelRelated extends Node {

	@ObfuscatedName("akx.k")
	public final GpuToolkit field11416;

	@ObfuscatedName("akx.f")
	public final GpuFloorModel field11414;

	@ObfuscatedName("akx.w")
	public final Light field11415;

	@ObfuscatedName("akx.l")
	public int field11419;

	@ObfuscatedName("akx.u")
	public int field11418;

	@ObfuscatedName("akx.z")
	public int field11427;

	@ObfuscatedName("akx.p")
	public int field11417;

	@ObfuscatedName("akx.d")
	public int field11420 = 0;

	@ObfuscatedName("akx.c")
	public int field11421 = 0;

	@ObfuscatedName("akx.r")
	public int field11413 = 0;

	@ObfuscatedName("akx.v")
	public GpuIndexBuffer field11423;

	@ObfuscatedName("akx.o")
	public VertexBuffer field11424;

	@ObfuscatedName("akx.s")
	public float[][] field11425;

	@ObfuscatedName("akx.y")
	public float[][] field11426;

	@ObfuscatedName("akx.q")
	public float[][] field11422;

	@ObfuscatedName("akx.x")
	public HashTable field11428;

	@ObfuscatedName("akx.b")
	public ByteBuffer field11429;

	public GpuFloorModelRelated(GpuToolkit arg0, GpuFloorModel arg1, Light arg2, int[] arg3) {
		this.field11416 = arg0;
		this.field11415 = arg2;
		this.field11414 = arg1;
		int var5 = this.field11415.method17608() - (arg1.field1233 >> 1);
		this.field11419 = this.field11415.method17605() - var5 >> arg1.field1236;
		this.field11418 = this.field11415.method17605() + var5 >> arg1.field1236;
		this.field11427 = this.field11415.method17607() - var5 >> arg1.field1236;
		this.field11417 = this.field11415.method17607() + var5 >> arg1.field1236;
		int var6 = this.field11418 - this.field11419 + 1;
		int var7 = this.field11417 - this.field11427 + 1;
		this.field11425 = new float[var6 + 1][var7 + 1];
		this.field11426 = new float[var6 + 1][var7 + 1];
		this.field11422 = new float[var6 + 1][var7 + 1];
		for (int var8 = 0; var8 <= var7; var8++) {
			int var9 = this.field11427 + var8;
			if (var9 > 0 && var9 < this.field11414.field1234 - 1) {
				for (int var10 = 0; var10 <= var6; var10++) {
					int var11 = this.field11419 + var10;
					if (var11 > 0 && var11 < this.field11414.field1235 - 1) {
						int var12 = arg1.getTileHeight(var11 + 1, var9) - arg1.getTileHeight(var11 - 1, var9);
						int var13 = arg1.getTileHeight(var11, var9 + 1) - arg1.getTileHeight(var11, var9 - 1);
						float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
						this.field11425[var10][var8] = (float) var12 * var14;
						this.field11426[var10][var8] = var14 * -256.0F;
						this.field11422[var10][var8] = (float) var13 * var14;
					}
				}
			}
		}
		int var15 = 0;
		for (int var16 = this.field11427; var16 <= this.field11417; var16++) {
			if (var16 >= 0 && var16 < arg1.field1234) {
				for (int var17 = this.field11419; var17 <= this.field11418; var17++) {
					if (var17 >= 0 && var17 < arg1.field1235) {
						int var18 = arg3[var15];
						int[] var19 = arg1.field9510[var17][var16];
						if (var19 != null && var18 != 0) {
							if (var18 == 1) {
								for (int var20 = 0; var20 < var19.length; var20 += 3) {
									if (var19[var20] != -1 && var19[var20 + 1] != -1 && var19[var20 + 2] != -1) {
										this.field11421 += 3;
									}
								}
							} else {
								this.field11421 += 3;
							}
						}
					}
					var15++;
				}
			} else {
				var15 += this.field11418 - this.field11419;
			}
		}
		if (this.field11421 > 0) {
			this.field11428 = new HashTable(IntMath.bitceil(this.field11421));
			this.field11429 = this.field11416.temporaryBuffer;
			this.field11429.clear();
			this.field11429.position(this.field11416.field10048 >> 1);
			this.field11429.slice();
			this.field11429.position(0);
			this.field11429.limit(this.field11416.field10048 >> 1);
			int var21 = 0;
			int var22 = 0;
			for (int var23 = this.field11427; var23 <= this.field11417; var23++) {
				if (var23 >= 0 && var23 < arg1.field1234) {
					int var24 = 0;
					for (int var25 = this.field11419; var25 <= this.field11418; var25++) {
						if (var25 >= 0 && var25 < arg1.field1235) {
							int var26 = arg3[var22];
							int[] var27 = arg1.field9510[var25][var23];
							if (var27 != null && var26 != 0) {
								if (var26 == 1) {
									int[] var28 = arg1.field9506[var25][var23];
									int[] var29 = arg1.field9501[var25][var23];
									int var30 = 0;
									label110: while (true) {
										while (true) {
											if (var30 >= var27.length) {
												break label110;
											}
											if (var27[var30] == -1 || var27[var30 + 1] == -1 || var27[var30 + 2] == -1) {
												var30 += 3;
											} else {
												this.method17781(var24, var21, var25, var23, var28[var30], var29[var30]);
												var30++;
												this.method17781(var24, var21, var25, var23, var28[var30], var29[var30]);
												var30++;
												this.method17781(var24, var21, var25, var23, var28[var30], var29[var30]);
												var30++;
											}
										}
									}
								} else if (var26 == 3) {
									this.method17781(var24, var21, var25, var23, 0, 0);
									this.method17781(var24, var21, var25, var23, arg1.field1233, 0);
									this.method17781(var24, var21, var25, var23, 0, arg1.field1233);
								} else if (var26 == 2) {
									this.method17781(var24, var21, var25, var23, arg1.field1233, 0);
									this.method17781(var24, var21, var25, var23, arg1.field1233, arg1.field1233);
									this.method17781(var24, var21, var25, var23, 0, 0);
								} else if (var26 == 5) {
									this.method17781(var24, var21, var25, var23, arg1.field1233, arg1.field1233);
									this.method17781(var24, var21, var25, var23, 0, arg1.field1233);
									this.method17781(var24, var21, var25, var23, arg1.field1233, 0);
								} else if (var26 == 4) {
									this.method17781(var24, var21, var25, var23, 0, arg1.field1233);
									this.method17781(var24, var21, var25, var23, 0, 0);
									this.method17781(var24, var21, var25, var23, arg1.field1233, arg1.field1233);
								}
							}
						}
						var22++;
						var24++;
					}
				} else {
					var22 += this.field11418 - this.field11419;
				}
				var21++;
			}
			this.method17780();
		} else {
			this.field11424 = null;
			this.field11423 = null;
		}
		this.field11428 = null;
		this.field11422 = null;
		this.field11426 = null;
		this.field11425 = null;
	}

	@ObfuscatedName("akx.e()V")
	public void method17780() {
		this.field11423 = this.field11416.createIndexBuffer(false);
		this.field11423.method5831(this.field11413);
		this.field11424 = this.field11416.createVertexBuffer(false);
		this.field11424.allocate(this.field11420 * 16, 16);
		this.field11424.upload(0, this.field11420 * 16, this.field11416.temporaryBufferAddress);
		this.field11423.upload(0, this.field11413 * 2, (long) (this.field11416.field10048 >> 1) + this.field11416.temporaryBufferAddress);
	}

	@ObfuscatedName("akx.n(IIIIII)V")
	public void method17781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var7 = -1L;
		int var9 = (arg2 << this.field11414.field1236) + arg4;
		int var10 = (arg3 << this.field11414.field1236) + arg5;
		int var11 = this.field11414.getFineHeight(var9, var10);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			var7 = ((long) var10 & 0xFFFFL) << 16 | (long) var9 & 0xFFFFL;
			Node var12 = this.field11428.get(var7);
			if (var12 != null) {
				Unsafe var13 = this.field11416.field10110;
				var13.putShort((long) (this.field11416.field10048 >> 1) + this.field11416.temporaryBufferAddress + (long) (this.field11413 * 2), ((FloorModelNode) var12).field11437);
				this.field11413++;
				return;
			}
		}
		short var14 = (short) this.field11420;
		if (var7 != -1L) {
			this.field11428.put(new FloorModelNode(var14), var7);
		}
		float var15;
		float var16;
		float var17;
		if (arg4 == 0 && arg5 == 0) {
			var15 = this.field11425[arg0][arg1];
			var16 = this.field11426[arg0][arg1];
			var17 = this.field11422[arg0][arg1];
		} else if (this.field11414.field1233 == arg4 && arg5 == 0) {
			var15 = this.field11425[arg0 + 1][arg1];
			var16 = this.field11426[arg0 + 1][arg1];
			var17 = this.field11422[arg0 + 1][arg1];
		} else if (this.field11414.field1233 == arg4 && this.field11414.field1233 == arg5) {
			var15 = this.field11425[arg0 + 1][arg1 + 1];
			var16 = this.field11426[arg0 + 1][arg1 + 1];
			var17 = this.field11422[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && this.field11414.field1233 == arg5) {
			var15 = this.field11425[arg0][arg1 + 1];
			var16 = this.field11426[arg0][arg1 + 1];
			var17 = this.field11422[arg0][arg1 + 1];
		} else {
			float var18 = (float) arg4 / (float) this.field11414.field1233;
			float var19 = (float) arg5 / (float) this.field11414.field1233;
			float var20 = this.field11425[arg0][arg1];
			float var21 = this.field11426[arg0][arg1];
			float var22 = this.field11422[arg0][arg1];
			float var23 = this.field11425[arg0 + 1][arg1];
			float var24 = this.field11426[arg0 + 1][arg1];
			float var25 = this.field11422[arg0 + 1][arg1];
			float var26 = (this.field11425[arg0][arg1 + 1] - var20) * var18 + var20;
			float var27 = (this.field11426[arg0][arg1 + 1] - var21) * var18 + var21;
			float var28 = (this.field11422[arg0][arg1 + 1] - var22) * var18 + var22;
			float var29 = (this.field11425[arg0 + 1][arg1 + 1] - var23) * var18 + var23;
			float var30 = (this.field11426[arg0 + 1][arg1 + 1] - var24) * var18 + var24;
			float var31 = (this.field11422[arg0 + 1][arg1 + 1] - var25) * var18 + var25;
			var15 = (var29 - var26) * var19 + var26;
			var16 = (var30 - var27) * var19 + var27;
			var17 = (var31 - var28) * var19 + var28;
		}
		float var32 = (float) (this.field11415.method17605() - var9);
		float var33 = (float) (this.field11415.method17606() - var11);
		float var34 = (float) (this.field11415.method17607() - var10);
		float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
		float var36 = 1.0F / var35;
		float var37 = var32 * var36;
		float var38 = var33 * var36;
		float var39 = var34 * var36;
		float var40 = var35 / (float) this.field11415.method17608();
		float var41 = 1.0F - var40 * var40;
		if (var41 < 0.0F) {
			var41 = 0.0F;
		}
		float var42 = var17 * var39 + var15 * var37 + var16 * var38;
		if (var42 < 0.0F) {
			var42 = 0.0F;
		}
		float var43 = var41 * var42 * 2.0F;
		if (var43 > 1.0F) {
			var43 = 1.0F;
		}
		int var44 = this.field11415.method17624();
		int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
		if (var45 > 255) {
			var45 = 255;
		}
		int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
		if (var46 > 255) {
			var46 = 255;
		}
		int var47 = (int) ((float) (var44 & 0xFF) * var43);
		if (var47 > 255) {
			var47 = 255;
		}
		Unsafe var48 = this.field11416.field10110;
		var48.putFloat((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress, (float) var9);
		var48.putFloat((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress + 4L, (float) var11);
		var48.putFloat((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress + 8L, (float) var10);
		if (this.field11416.field10185 == 0) {
			var48.putByte((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress + 12L, (byte) var47);
			var48.putByte((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress + 13L, (byte) var46);
			var48.putByte((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress + 14L, (byte) var45);
		} else {
			var48.putByte((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress + 12L, (byte) var45);
			var48.putByte((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress + 13L, (byte) var46);
			var48.putByte((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress + 14L, (byte) var47);
		}
		var48.putByte((long) (this.field11420 * 16) + this.field11416.temporaryBufferAddress + 15L, (byte) -1);
		this.field11420++;
		var48.putShort((long) (this.field11416.field10048 >> 1) + this.field11416.temporaryBufferAddress + (long) (this.field11413 * 2), var14);
		this.field11413++;
	}

	@ObfuscatedName("akx.m(Ljj;III[[ZZ)V")
	public void method17783(ModelShader arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
		if (this.field11423 == null || (this.field11419 > arg1 + arg3 || (this.field11418 < arg1 - arg3 || (this.field11427 > arg2 + arg3 || this.field11417 < arg2 - arg3)))) {
			return;
		}
		if (arg5) {
			for (int var7 = this.field11419; var7 <= this.field11418; var7++) {
				if (var7 - arg1 >= -arg3 && var7 - arg1 <= arg3) {
					for (int var8 = this.field11427; var8 <= this.field11417; var8++) {
						if (var8 - arg2 >= -arg3 && var8 - arg2 <= arg3 && arg4[var7 - arg1 + arg3][var8 - arg2 + arg3]) {
							this.method17784(arg0, this.field11423, this.field11413 / 3);
							return;
						}
					}
				}
			}
			return;
		}
		int var9 = 0;
		ByteBuffer var10 = this.field11416.temporaryBuffer;
		var10.clear();
		int var11 = this.field11427;
		while (true) {
			if (var11 > this.field11417) {
				if (var10.position() != 0 && var9 != 0) {
					int var16 = var10.position();
					GpuIndexBuffer var17 = this.field11416.method15988(var16 / 2);
					var17.upload(0, var16, this.field11416.temporaryBufferAddress);
					this.method17784(arg0, var17, var9 / 3);
					break;
				}
				return;
			}
			if (var11 - arg2 >= -arg3 && var11 - arg2 <= arg3) {
				int var12 = this.field11414.field1235 * var11 + this.field11419;
				for (int var13 = this.field11419; var13 <= this.field11418; var13++) {
					if (var13 - arg1 >= -arg3 && var13 - arg1 <= arg3 && arg4[var13 - arg1 + arg3][var11 - arg2 + arg3]) {
						short[] var14 = this.field11414.field9494[var12];
						if (var14 != null) {
							for (int var15 = 0; var15 < var14.length; var15++) {
								var10.putShort(var14[var15]);
								var9++;
							}
						}
					}
					var12++;
				}
			}
			var11++;
		}
	}

	@ObfuscatedName("akx.k(Ljj;Lml;I)V")
	public void method17784(ModelShader arg0, GpuIndexBuffer arg1, int arg2) {
		arg0.field2981 = 0;
		arg0.field2983 = this.field11420;
		arg0.field2972 = 0;
		arg0.field2962 = this.field11413 / 3;
		arg0.field2966 = this.field11416.field10140;
		float var4 = this.field11415.method17610();
		arg0.field2968.setTo(var4, var4, var4);
		this.field11416.setStreamSource(0, this.field11424);
		this.field11416.setVertexDeclaration(this.field11416.field10204);
		this.field11416.setIndices(this.field11423);
		arg0.method5020(0);
	}
}
