package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afr")
public class class852 extends class136 {

	@ObfuscatedName("afr.e")
	public int field10220;

	@ObfuscatedName("afr.n")
	public int field10221;

	@ObfuscatedName("afr.m")
	public int field10222;

	@ObfuscatedName("afr.k")
	public int field10223;

	@ObfuscatedName("afr.f")
	public int field10224;

	@ObfuscatedName("afr.w")
	public int field10225;

	@ObfuscatedName("afr.l")
	public int[] field10226;

	@ObfuscatedName("afr.u")
	public byte[] field10227;

	@ObfuscatedName("afr.z")
	public byte[] field10228;

	@ObfuscatedName("afr.e()Z")
	public boolean method2587() {
		return true;
	}

	@ObfuscatedName("afr.n()Z")
	public boolean method2644() {
		return this.field10228 != null;
	}

	@ObfuscatedName("afr.m()I")
	public int method2639() {
		return this.field10220;
	}

	@ObfuscatedName("afr.k()I")
	public int method2631() {
		return this.field10221;
	}

	@ObfuscatedName("afr.p()I")
	public int method2596() {
		return this.field10222 + this.field10220 + this.field10223;
	}

	@ObfuscatedName("afr.d()I")
	public int method2597() {
		return this.field10224 + this.field10221 + this.field10225;
	}

	@ObfuscatedName("afr.f()I")
	public int method2591() {
		return this.field10222;
	}

	@ObfuscatedName("afr.w()I")
	public int method2603() {
		return this.field10223;
	}

	@ObfuscatedName("afr.l()I")
	public int method2593() {
		return this.field10224;
	}

	@ObfuscatedName("afr.u()I")
	public int method2651() {
		return this.field10225;
	}

	@ObfuscatedName("afr.z()V")
	public void method2595() {
		this.field10225 = 0;
		this.field10224 = 0;
		this.field10223 = 0;
		this.field10222 = 0;
	}

	@ObfuscatedName("afr.c(I)V")
	public void method2646(int arg0) {
		int var2 = this.method2596();
		int var3 = this.method2597();
		if (this.field10220 == var2 && this.field10221 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.field10222) {
			var4 = this.field10222;
		}
		int var5 = arg0;
		if (this.field10222 + arg0 + this.field10220 > var2) {
			var5 = var2 - this.field10222 - this.field10220;
		}
		int var6 = arg0;
		if (arg0 > this.field10224) {
			var6 = this.field10224;
		}
		int var7 = arg0;
		if (this.field10224 + arg0 + this.field10221 > var3) {
			var7 = var3 - this.field10224 - this.field10221;
		}
		int var8 = this.field10220 + var4 + var5;
		int var9 = this.field10221 + var6 + var7;
		byte[] var10 = new byte[var8 * var9];
		if (this.field10228 == null) {
			for (int var11 = 0; var11 < this.field10221; var11++) {
				int var12 = this.field10220 * var11;
				int var13 = (var6 + var11) * var8 + var4;
				for (int var14 = 0; var14 < this.field10220; var14++) {
					var10[var13++] = this.field10227[var12++];
				}
			}
		} else {
			byte[] var15 = new byte[var8 * var9];
			for (int var16 = 0; var16 < this.field10221; var16++) {
				int var17 = this.field10220 * var16;
				int var18 = (var6 + var16) * var8 + var4;
				for (int var19 = 0; var19 < this.field10220; var19++) {
					var15[var18] = this.field10228[var17];
					var10[var18++] = this.field10227[var17++];
				}
			}
			this.field10228 = var15;
		}
		this.field10222 -= var4;
		this.field10224 -= var6;
		this.field10223 -= var5;
		this.field10225 -= var7;
		this.field10220 = var8;
		this.field10221 = var9;
		this.field10227 = var10;
	}

	@ObfuscatedName("afr.r(I)V")
	public void method2599(int arg0) {
		int var2 = -1;
		if (this.field10226.length < 255) {
			for (int var3 = 0; var3 < this.field10226.length; var3++) {
				if (this.field10226[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.field10226.length;
				int[] var4 = new int[this.field10226.length + 1];
				System.arraycopy(this.field10226, 0, var4, 0, this.field10226.length);
				this.field10226 = var4;
				var4[var2] = arg0;
			}
		} else {
			int var5 = Integer.MAX_VALUE;
			int var6 = arg0 >> 16 & 0xFF;
			int var7 = arg0 >> 8 & 0xFF;
			int var8 = arg0 & 0xFF;
			for (int var9 = 0; var9 < this.field10226.length; var9++) {
				int var10 = this.field10226[var9];
				int var11 = var10 >> 16 & 0xFF;
				int var12 = var10 >> 8 & 0xFF;
				int var13 = var10 & 0xFF;
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var7 - var12;
				if (var15 < 0) {
					var15 = -var15;
				}
				int var16 = var8 - var13;
				if (var16 < 0) {
					var16 = -var16;
				}
				int var17 = var14 + var15 + var16;
				if (var17 < var5) {
					var5 = var17;
					var2 = var9;
				}
			}
		}
		int var18 = 0;
		byte[] var19 = new byte[this.field10221 * this.field10220];
		for (int var20 = 0; var20 < this.field10221; var20++) {
			for (int var21 = 0; var21 < this.field10220; var21++) {
				int var22 = this.field10227[var18] & 0xFF;
				if (this.field10226[var22] == 0) {
					if (var21 > 0 && this.field10226[this.field10227[var18 - 1] & 0xFF] != 0) {
						var22 = var2;
					} else if (var20 > 0 && this.field10226[this.field10227[var18 - this.field10220] & 0xFF] != 0) {
						var22 = var2;
					} else if (var21 < this.field10220 - 1 && this.field10226[this.field10227[var18 + 1] & 0xFF] != 0) {
						var22 = var2;
					} else if (var20 < this.field10221 - 1 && this.field10226[this.field10227[this.field10220 + var18] & 0xFF] != 0) {
						var22 = var2;
					}
				}
				var19[var18++] = (byte) var22;
			}
		}
		this.field10227 = var19;
	}

	@ObfuscatedName("afr.v(I)V")
	public void method2600(int arg0) {
		int var2 = -1;
		if (this.field10226.length < 255) {
			for (int var3 = 0; var3 < this.field10226.length; var3++) {
				if (this.field10226[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.field10226.length;
				int[] var4 = new int[this.field10226.length + 1];
				System.arraycopy(this.field10226, 0, var4, 0, this.field10226.length);
				this.field10226 = var4;
				var4[var2] = arg0;
			}
		} else {
			int var5 = Integer.MAX_VALUE;
			int var6 = arg0 >> 16 & 0xFF;
			int var7 = arg0 >> 8 & 0xFF;
			int var8 = arg0 & 0xFF;
			for (int var9 = 0; var9 < this.field10226.length; var9++) {
				int var10 = this.field10226[var9];
				int var11 = var10 >> 16 & 0xFF;
				int var12 = var10 >> 8 & 0xFF;
				int var13 = var10 & 0xFF;
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var7 - var12;
				if (var15 < 0) {
					var15 = -var15;
				}
				int var16 = var8 - var13;
				if (var16 < 0) {
					var16 = -var16;
				}
				int var17 = var14 + var15 + var16;
				if (var17 < var5) {
					var5 = var17;
					var2 = var9;
				}
			}
		}
		for (int var18 = this.field10221 - 1; var18 > 0; var18--) {
			int var19 = this.field10220 * var18;
			for (int var20 = this.field10220 - 1; var20 > 0; var20--) {
				if (this.field10226[this.field10227[var19 + var20] & 0xFF] == 0 && this.field10226[this.field10227[var19 + var20 - 1 - this.field10220] & 0xFF] != 0) {
					this.field10227[var19 + var20] = (byte) var2;
				}
			}
		}
	}

	@ObfuscatedName("afr.o()V")
	public void method2601() {
		byte[] var1 = this.field10227;
		if (this.field10228 == null) {
			for (int var2 = this.field10221 - 1; var2 >= 0; var2--) {
				int var3 = this.field10220 * var2;
				int var4 = (var2 + 1) * this.field10220;
				while (var3 < var4) {
					var4--;
					byte var5 = var1[var3];
					var1[var3] = var1[var4];
					var1[var4] = var5;
					var3++;
				}
			}
		} else {
			byte[] var6 = this.field10228;
			for (int var7 = this.field10221 - 1; var7 >= 0; var7--) {
				int var8 = this.field10220 * var7;
				int var9 = (var7 + 1) * this.field10220;
				while (var8 < var9) {
					var9--;
					byte var10 = var1[var8];
					var1[var8] = var1[var9];
					var1[var9] = var10;
					byte var11 = var6[var8];
					var6[var8] = var6[var9];
					var6[var9] = var11;
					var8++;
				}
			}
		}
		int var12 = this.field10222;
		this.field10222 = this.field10223;
		this.field10223 = var12;
	}

	@ObfuscatedName("afr.s()V")
	public void method2602() {
		byte[] var1 = this.field10227;
		if (this.field10228 == null) {
			for (int var2 = (this.field10221 >> 1) - 1; var2 >= 0; var2--) {
				int var3 = this.field10220 * var2;
				int var4 = (this.field10221 - var2 - 1) * this.field10220;
				for (int var5 = -this.field10220; var5 < 0; var5++) {
					byte var6 = var1[var3];
					var1[var3] = var1[var4];
					var1[var4] = var6;
					var3++;
					var4++;
				}
			}
		} else {
			byte[] var7 = this.field10228;
			for (int var8 = (this.field10221 >> 1) - 1; var8 >= 0; var8--) {
				int var9 = this.field10220 * var8;
				int var10 = (this.field10221 - var8 - 1) * this.field10220;
				for (int var11 = -this.field10220; var11 < 0; var11++) {
					byte var12 = var1[var9];
					var1[var9] = var1[var10];
					var1[var10] = var12;
					byte var13 = var7[var9];
					var7[var9] = var7[var10];
					var7[var10] = var13;
					var9++;
					var10++;
				}
			}
		}
		int var14 = this.field10224;
		this.field10224 = this.field10225;
		this.field10225 = var14;
	}

	@ObfuscatedName("afr.y()V")
	public void method2588() {
		byte[] var1 = new byte[this.field10221 * this.field10220];
		int var2 = 0;
		if (this.field10228 == null) {
			for (int var3 = 0; var3 < this.field10220; var3++) {
				for (int var4 = this.field10221 - 1; var4 >= 0; var4--) {
					var1[var2++] = this.field10227[this.field10220 * var4 + var3];
				}
			}
			this.field10227 = var1;
		} else {
			byte[] var5 = new byte[this.field10221 * this.field10220];
			for (int var6 = 0; var6 < this.field10220; var6++) {
				for (int var7 = this.field10221 - 1; var7 >= 0; var7--) {
					var1[var2] = this.field10227[this.field10220 * var7 + var6];
					var5[var2++] = this.field10228[this.field10220 * var7 + var6];
				}
			}
			this.field10227 = var1;
			this.field10228 = var5;
		}
		int var8 = this.field10224;
		this.field10224 = this.field10222;
		this.field10222 = this.field10225;
		this.field10225 = this.field10223;
		this.field10223 = var8;
		int var9 = this.field10221;
		this.field10221 = this.field10220;
		this.field10220 = var9;
	}

	@ObfuscatedName("afr.q(Z)[I")
	public int[] method2604(boolean arg0) {
		int[] var3;
		if (arg0) {
			int var2 = this.method2596();
			var3 = new int[var2 * this.method2597()];
			if (this.field10228 == null) {
				for (int var8 = 0; var8 < this.field10221; var8++) {
					int var9 = this.field10220 * var8;
					int var10 = (this.field10224 + var8) * var2 + this.field10222;
					for (int var11 = 0; var11 < this.field10220; var11++) {
						int var12 = this.field10226[this.field10227[var9++] & 0xFF];
						if (var12 == 0) {
							var3[var10++] = 0;
						} else {
							var3[var10++] = var12 | 0xFF000000;
						}
					}
				}
			} else {
				for (int var4 = 0; var4 < this.field10221; var4++) {
					int var5 = this.field10220 * var4;
					int var6 = (this.field10224 + var4) * var2 + this.field10222;
					for (int var7 = 0; var7 < this.field10220; var7++) {
						var3[var6++] = this.field10228[var5] << 24 | this.field10226[this.field10227[var5] & 0xFF];
						var5++;
					}
				}
			}
		} else {
			var3 = new int[this.field10221 * this.field10220];
			int var13 = 0;
			int var14 = 0;
			if (this.field10228 == null) {
				for (int var17 = 0; var17 < this.field10221; var17++) {
					for (int var18 = 0; var18 < this.field10220; var18++) {
						int var19 = this.field10226[this.field10227[var13++] & 0xFF];
						var3[var14++] = var19 == 0 ? 0 : var19 | 0xFF000000;
					}
				}
			} else {
				for (int var15 = 0; var15 < this.field10221; var15++) {
					for (int var16 = 0; var16 < this.field10220; var16++) {
						var3[var14++] = this.field10228[var13] << 24 | this.field10226[this.field10227[var13] & 0xFF];
						var13++;
					}
				}
			}
		}
		return var3;
	}

	@ObfuscatedName("afr.x(III)V")
	public void method2605(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.field10226.length; var4++) {
			if (this.field10226[var4] != 1 && this.field10226[var4] != 16711935) {
				int var5 = this.field10226[var4] >> 16 & 0xFF;
				int var6 = arg0 + var5;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.field10226[var4] >> 8 & 0xFF;
				int var8 = arg1 + var7;
				if (var8 < 0) {
					var8 = 0;
				} else if (var8 > 255) {
					var8 = 255;
				}
				int var9 = this.field10226[var4] >> 0 & 0xFF;
				int var10 = arg2 + var9;
				if (var10 < 0) {
					var10 = 0;
				} else if (var10 > 255) {
					var10 = 255;
				}
				this.field10226[var4] = var6 << 16 | var8 << 8 | var10;
			}
		}
	}

	@ObfuscatedName("afr.b(II)I")
	public int method2617(int arg0, int arg1) {
		return this.field10226[this.field10227[this.field10220 * arg1 + arg0] & 0xFF];
	}
}
