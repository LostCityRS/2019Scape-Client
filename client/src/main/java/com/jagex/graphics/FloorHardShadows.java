package com.jagex.graphics;

import com.jagex.game.client.HardShadow;
import deob.ObfuscatedName;

import java.nio.ByteBuffer;

@ObfuscatedName("lg")
public class FloorHardShadows {

	@ObfuscatedName("lg.e")
	public final GpuToolkit field3287;

	@ObfuscatedName("lg.n")
	public final GpuFloorModel field3290;

	@ObfuscatedName("lg.m")
	public final int field3288;

	@ObfuscatedName("lg.k")
	public final int field3285;

	@ObfuscatedName("lg.f")
	public final byte[] field3289;

	@ObfuscatedName("lg.w")
	public final int field3286;

	@ObfuscatedName("lg.l")
	public final int field3291;

	@ObfuscatedName("lg.u")
	public final int field3292;

	@ObfuscatedName("lg.z")
	public FloorHardShadowsBlock[][] field3293;

	public FloorHardShadows(GpuToolkit arg0, GpuFloorModel arg1) {
		this.field3287 = arg0;
		this.field3290 = arg1;
		this.field3288 = (this.field3290.field1235 * this.field3290.field1233 >> this.field3287.field10129) + 2;
		this.field3285 = (this.field3290.field1234 * this.field3290.field1233 >> this.field3287.field10129) + 2;
		this.field3289 = new byte[this.field3288 * this.field3285];
		this.field3292 = this.field3287.field10129 + 7 - this.field3290.field1236;
		this.field3286 = this.field3290.field1235 >> this.field3292;
		this.field3291 = this.field3290.field1234 >> this.field3292;
	}

	@ObfuscatedName("lg.e()V")
	public void method5674() {
		this.field3293 = new FloorHardShadowsBlock[this.field3286][this.field3291];
		for (int var1 = 0; var1 < this.field3291; var1++) {
			for (int var2 = 0; var2 < this.field3286; var2++) {
				this.field3293[var2][var1] = new FloorHardShadowsBlock(this.field3287, this, this.field3290, var2, var1, this.field3292, var2 * 128 + 1, var1 * 128 + 1);
				if (this.field3293[var2][var1].field3278 == 0) {
					this.field3293[var2][var1] = null;
				}
			}
		}
	}

	@ObfuscatedName("lg.n(Ljj;III[[ZZ)V")
	public void method5670(ModelShader arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
		this.field3287.method2219(false);
		float var7 = 1.0F / (float) (this.field3287.field10128 * 128);
		if (arg5) {
			for (int var8 = 0; var8 < this.field3291; var8++) {
				int var9 = var8 << this.field3292;
				int var10 = var8 + 1 << this.field3292;
				label144: for (int var11 = 0; var11 < this.field3286; var11++) {
					if (this.field3293[var11][var8] != null) {
						int var12 = var11 << this.field3292;
						int var13 = var11 + 1 << this.field3292;
						for (int var14 = var12; var14 < var13; var14++) {
							if (var14 - arg1 >= -arg3 && var14 - arg1 <= arg3) {
								for (int var15 = var9; var15 < var10; var15++) {
									if (var15 - arg2 >= -arg3 && var15 - arg2 <= arg3 && arg4[var14 - arg1 + arg3][var15 - arg2 + arg3]) {
										arg0.field2982.scale(var7, var7, 1.0F, 1.0F);
										arg0.field2982.entries[12] = -var11;
										arg0.field2982.entries[13] = -var8;
										this.field3293[var11][var8].method5657(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] var16 = new int[this.field3291 * this.field3286];
			ByteBuffer var17 = this.field3287.temporaryBuffer;
			var17.clear();
			int var18 = 0;
			for (int var19 = 0; var19 < this.field3291; var19++) {
				int var20 = var19 << this.field3292;
				int var21 = var19 + 1 << this.field3292;
				for (int var22 = 0; var22 < this.field3286; var22++) {
					FloorHardShadowsBlock var23 = this.field3293[var22][var19];
					int var24 = 0;
					if (var23 != null) {
						int var25 = var22 << this.field3292;
						int var26 = var22 + 1 << this.field3292;
						for (int var27 = var20; var27 < var21; var27++) {
							if (var27 - arg2 >= -arg3 && var27 - arg2 <= arg3) {
								int var28 = this.field3290.field1235 * var27 + var25;
								for (int var29 = var25; var29 < var26; var29++) {
									if (var29 - arg1 >= -arg3 && var29 - arg1 <= arg3 && arg4[var29 - arg1 + arg3][var27 - arg2 + arg3]) {
										short[] var30 = this.field3290.field9494[var28];
										if (var30 != null) {
											for (int var31 = 0; var31 < var30.length; var31++) {
												var17.putShort(var30[var31]);
												var24++;
											}
										}
									}
									var28++;
								}
							}
						}
					}
					var16[var18] = var24;
					var18++;
				}
			}
			if (var17.position() != 0) {
				int var32 = var17.position();
				GpuIndexBuffer var33 = this.field3287.method15988(var32 / 2);
				var33.upload(0, var32, this.field3287.temporaryBufferAddress);
				int var34 = 0;
				int var35 = 0;
				for (int var36 = 0; var36 < this.field3291; var36++) {
					for (int var37 = 0; var37 < this.field3286; var37++) {
						if (var16[var35] != 0) {
							arg0.field2982.scale(var7, var7, 1.0F, 1.0F);
							arg0.field2982.entries[12] = -var37;
							arg0.field2982.entries[13] = -var36;
							this.field3293[var37][var36].method5656(arg0, var33, var34, var16[var35] / 3);
							var34 += var16[var35];
						}
						var35++;
					}
				}
			}
		}
		this.field3287.method2219(true);
	}

	@ObfuscatedName("lg.m(Lara;II)V")
	public void method5663(HardShadow arg0, int arg1, int arg2) {
		GpuHardShadow var4 = (GpuHardShadow) arg0;
		int var5 = var4.field12546 + 1 + arg1;
		int var6 = var4.field12544 + 1 + arg2;
		int var7 = this.field3288 * var6 + var5;
		int var8 = 0;
		int var9 = var4.field12545;
		int var10 = var4.field12543;
		int var11 = this.field3288 - var10;
		int var12 = 0;
		if (var6 <= 0) {
			int var13 = 1 - var6;
			var9 -= var13;
			var8 += var10 * var13;
			var7 += this.field3288 * var13;
			var6 = 1;
		}
		if (var6 + var9 >= this.field3285) {
			int var14 = var6 + var9 + 1 - this.field3285;
			var9 -= var14;
		}
		if (var5 <= 0) {
			int var15 = 1 - var5;
			var10 -= var15;
			var8 += var15;
			var7 += var15;
			var12 += var15;
			var11 += var15;
			var5 = 1;
		}
		if (var5 + var10 >= this.field3288) {
			int var16 = var5 + var10 + 1 - this.field3288;
			var10 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var10 > 0 && var9 > 0) {
			method5667(this.field3289, var4.field12548, var8, var7, var10, var9, var11, var12);
			this.method5666(var5, var6, var10, var9);
		}
	}

	@ObfuscatedName("lg.k(Lara;II)V")
	public void method5676(HardShadow arg0, int arg1, int arg2) {
		GpuHardShadow var4 = (GpuHardShadow) arg0;
		int var5 = var4.field12546 + 1 + arg1;
		int var6 = var4.field12544 + 1 + arg2;
		int var7 = this.field3288 * var6 + var5;
		int var8 = 0;
		int var9 = var4.field12545;
		int var10 = var4.field12543;
		int var11 = this.field3288 - var10;
		int var12 = 0;
		if (var6 <= 0) {
			int var13 = 1 - var6;
			var9 -= var13;
			var8 += var10 * var13;
			var7 += this.field3288 * var13;
			var6 = 1;
		}
		if (var6 + var9 >= this.field3285) {
			int var14 = var6 + var9 + 1 - this.field3285;
			var9 -= var14;
		}
		if (var5 <= 0) {
			int var15 = 1 - var5;
			var10 -= var15;
			var8 += var15;
			var7 += var15;
			var12 += var15;
			var11 += var15;
			var5 = 1;
		}
		if (var5 + var10 >= this.field3288) {
			int var16 = var5 + var10 + 1 - this.field3288;
			var10 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var10 > 0 && var9 > 0) {
			method5668(this.field3289, var4.field12548, var8, var7, var10, var9, var11, var12);
			this.method5666(var5, var6, var10, var9);
		}
	}

	@ObfuscatedName("lg.f(Lara;II)Z")
	public boolean method5665(HardShadow arg0, int arg1, int arg2) {
		GpuHardShadow var4 = (GpuHardShadow) arg0;
		int var5 = var4.field12546 + 1 + arg1;
		int var6 = var4.field12544 + 1 + arg2;
		int var7 = this.field3288 * var6 + var5;
		int var8 = var4.field12545;
		int var9 = var4.field12543;
		int var10 = this.field3288 - var9;
		if (var6 <= 0) {
			int var11 = 1 - var6;
			var8 -= var11;
			var7 += this.field3288 * var11;
			var6 = 1;
		}
		if (var6 + var8 >= this.field3285) {
			int var12 = var6 + var8 + 1 - this.field3285;
			var8 -= var12;
		}
		if (var5 <= 0) {
			int var13 = 1 - var5;
			var9 -= var13;
			var7 += var13;
			var10 += var13;
			var5 = 1;
		}
		if (var5 + var9 >= this.field3288) {
			int var14 = var5 + var9 + 1 - this.field3288;
			var9 -= var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			byte var15 = 8;
			int var16 = (var15 - 1) * this.field3288 + var10;
			return method5669(this.field3289, var7, var9, var8, var16, var15);
		} else {
			return false;
		}
	}

	@ObfuscatedName("lg.w(IIII)V")
	public void method5666(int arg0, int arg1, int arg2, int arg3) {
		if (this.field3293 == null) {
			return;
		}
		int var5 = arg0 - 1 >> 7;
		int var6 = arg0 - 1 + arg2 - 1 >> 7;
		int var7 = arg1 - 1 >> 7;
		int var8 = arg1 - 1 + arg3 - 1 >> 7;
		for (int var9 = var5; var9 <= var6; var9++) {
			FloorHardShadowsBlock[] var10 = this.field3293[var9];
			for (int var11 = var7; var11 <= var8; var11++) {
				if (var10[var11] != null) {
					var10[var11].field3276 = true;
				}
			}
		}
	}

	@ObfuscatedName("lg.l([B[BIIIIII)V")
	public static final void method5667(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			int var10001;
			for (int var11 = var8; var11 < 0; var11++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] += arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] += arg1[arg2++];
				int var15 = arg3++;
				arg0[var15] += arg1[arg2++];
			}
			for (int var12 = var9; var12 < 0; var12++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("lg.u([B[BIIIIII)V")
	public static final void method5668(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			int var10001;
			for (int var11 = var8; var11 < 0; var11++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] -= arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] -= arg1[arg2++];
				int var15 = arg3++;
				arg0[var15] -= arg1[arg2++];
			}
			for (int var12 = var9; var12 < 0; var12++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("lg.z([BIIIII)Z")
	public static final boolean method5669(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 % arg5;
		int var7;
		if (var6 == 0) {
			var7 = 0;
		} else {
			var7 = arg5 - var6;
		}
		int var8 = -((arg3 + arg5 - 1) / arg5);
		int var9 = -((arg2 + arg5 - 1) / arg5);
		for (int var10 = var8; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			int var12 = arg1 - var7;
			if (arg0[var12 - 1] == 0) {
				return true;
			}
			arg1 = arg4 + var12;
		}
		return false;
	}
}
