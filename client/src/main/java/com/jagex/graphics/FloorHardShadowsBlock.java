package com.jagex.graphics;

import com.jagex.game.client.DataType;
import deob.ObfuscatedName;

import java.nio.ByteBuffer;

@ObfuscatedName("ly")
public class FloorHardShadowsBlock {

	@ObfuscatedName("ly.m")
	public final GpuToolkit field3271;

	@ObfuscatedName("ly.k")
	public final FloorHardShadows field3273;

	@ObfuscatedName("ly.f")
	public final int field3274;

	@ObfuscatedName("ly.w")
	public final int field3275;

	@ObfuscatedName("ly.l")
	public boolean field3276 = true;

	@ObfuscatedName("ly.u")
	public int field3277 = -1;

	@ObfuscatedName("ly.z")
	public final int field3278;

	@ObfuscatedName("ly.p")
	public GpuIndexBuffer field3279;

	@ObfuscatedName("ly.d")
	public GpuTexture field3280;

	@ObfuscatedName("ly.c")
	public int field3284;

	@ObfuscatedName("ly.r")
	public int field3282;

	@ObfuscatedName("ly.v")
	public int[] field3283;

	@ObfuscatedName("ly.o")
	public byte[] field3281;

	public FloorHardShadowsBlock(GpuToolkit arg0, FloorHardShadows arg1, GpuFloorModel arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field3271 = arg0;
		this.field3273 = arg1;
		this.field3274 = arg6;
		this.field3275 = arg7;
		int var9 = 0x1 << arg5;
		int var10 = 0;
		int var11 = arg3 << arg5;
		int var12 = arg4 << arg5;
		for (int var13 = 0; var13 < var9; var13++) {
			int var14 = arg2.field1235 * (var12 + var13) + var11;
			for (int var15 = 0; var15 < var9; var15++) {
				short[] var16 = arg2.field9494[var14++];
				if (var16 != null) {
					var10 += var16.length;
				}
			}
		}
		if (var10 > 0) {
			this.field3282 = Integer.MIN_VALUE;
			this.field3284 = Integer.MAX_VALUE;
			this.field3279 = this.field3271.createIndexBuffer(false);
			this.field3279.method5831(var10);
			ByteBuffer var17 = this.field3271.temporaryBuffer;
			var17.clear();
			for (int var18 = 0; var18 < var9; var18++) {
				int var19 = arg2.field1235 * (var12 + var18) + var11;
				for (int var20 = 0; var20 < var9; var20++) {
					short[] var21 = arg2.field9494[var19++];
					if (var21 != null) {
						for (int var22 = 0; var22 < var21.length; var22++) {
							int var23 = var21[var22] & 0xFFFF;
							if (var23 < this.field3284) {
								this.field3284 = var23;
							}
							if (var23 > this.field3282) {
								this.field3282 = var23;
							}
							var17.putShort((short) var23);
						}
					}
				}
			}
			this.field3279.upload(0, var17.position(), this.field3271.temporaryBufferAddress);
			this.field3278 = var10 / 3;
		} else {
			this.field3278 = 0;
			this.field3280 = null;
		}
	}

	@ObfuscatedName("ly.e(Ljj;)V")
	public void method5657(ModelShader arg0) {
		this.method5656(arg0, this.field3279, 0, this.field3278);
	}

	@ObfuscatedName("ly.n(Ljj;Lml;II)V")
	public void method5656(ModelShader arg0, GpuIndexBuffer arg1, int arg2, int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method5658();
		this.field3271.setIndices(arg1);
		arg0.field2966 = this.field3280;
		arg0.field2981 = this.field3284;
		arg0.field2983 = this.field3282 - this.field3284 + 1;
		arg0.field2972 = arg2;
		arg0.field2962 = arg3;
		arg0.method5019(false);
	}

	@ObfuscatedName("ly.m()V")
	public void method5658() {
		if (!this.field3276) {
			return;
		}
		this.field3276 = false;
		byte[] var1 = this.field3273.field3289;
		int var2 = 0;
		int var3 = this.field3273.field3288;
		int var4 = this.field3273.field3288 * this.field3275 + this.field3274;
		for (int var5 = -128; var5 < 0; var5++) {
			var2 = (var2 << 8) - var2;
			for (int var6 = -128; var6 < 0; var6++) {
				if (var1[var4++] != 0) {
					var2++;
				}
			}
			var4 += var3 - 128;
		}
		if (this.field3280 != null && this.field3277 == var2) {
			this.field3276 = false;
			return;
		}
		this.field3277 = var2;
		int var7 = 0;
		int var8 = this.field3275 * var3 + this.field3274;
		if (!this.field3271.method16026(TextureFormat.ALPHA, DataType.UNSIGNED_INT_8)) {
			if (this.field3283 == null) {
				this.field3283 = new int[16384];
			}
			int[] var13 = this.field3283;
			for (int var14 = -128; var14 < 0; var14++) {
				for (int var15 = -128; var15 < 0; var15++) {
					if (var1[var8] == 0) {
						int var16 = 0;
						if (var1[var8 - 1] != 0) {
							var16++;
						}
						if (var1[var8 + 1] != 0) {
							var16++;
						}
						if (var1[var8 - var3] != 0) {
							var16++;
						}
						if (var1[var3 + var8] != 0) {
							var16++;
						}
						var13[var7++] = var16 * 17 << 24;
					} else {
						var13[var7++] = 1140850688;
					}
					var8++;
				}
				var8 += this.field3273.field3288 - 128;
			}
			if (this.field3280 == null) {
				this.field3280 = this.field3271.method16204(128, 128, false, this.field3283);
				this.field3280.setWarp(false, false);
			} else {
				this.field3280.upload(0, 0, 128, 128, this.field3283, 0, 128);
			}
			return;
		}
		if (this.field3281 == null) {
			this.field3281 = new byte[16384];
		}
		byte[] var9 = this.field3281;
		for (int var10 = -128; var10 < 0; var10++) {
			for (int var11 = -128; var11 < 0; var11++) {
				if (var1[var8] == 0) {
					int var12 = 0;
					if (var1[var8 - 1] != 0) {
						var12++;
					}
					if (var1[var8 + 1] != 0) {
						var12++;
					}
					if (var1[var8 - var3] != 0) {
						var12++;
					}
					if (var1[var3 + var8] != 0) {
						var12++;
					}
					var9[var7++] = (byte) (var12 * 17);
				} else {
					var9[var7++] = 68;
				}
				var8++;
			}
			var8 += this.field3273.field3288 - 128;
		}
		if (this.field3280 == null) {
			this.field3280 = this.field3271.method16028(TextureFormat.ALPHA, 128, 128, false, this.field3281);
			this.field3280.setWarp(false, false);
		} else {
			this.field3280.upload(0, 0, 128, 128, this.field3281, TextureFormat.ALPHA, 0, 128);
		}
	}
}
