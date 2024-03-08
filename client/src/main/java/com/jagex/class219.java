package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hu")
public class class219 {

	@ObfuscatedName("hu.e")
	public int field2119;

	@ObfuscatedName("hu.n")
	public int[] field2115;

	@ObfuscatedName("hu.m")
	public int[] field2116;

	@ObfuscatedName("hu.k")
	public int field2118;

	@ObfuscatedName("hu.f")
	public int[] field2117;

	@ObfuscatedName("hu.w")
	public int field2114 = 0;

	@ObfuscatedName("hu.l")
	public int field2120 = 0;

	@ObfuscatedName("hu.u")
	public float[][] field2121;

	@ObfuscatedName("hu.e(II)I")
	public static int method3881(int arg0, int arg1) {
		int var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
		while (true) {
			int var3 = var2;
			int var4 = arg1;
			int var5 = 1;
			while (var4 > 1) {
				if ((var4 & 0x1) != 0) {
					var5 = var3 * var5;
				}
				var3 *= var3;
				var4 >>= 0x1;
			}
			int var6;
			if (var4 == 1) {
				var6 = var3 * var5;
			} else {
				var6 = var5;
			}
			if (var6 <= arg0) {
				return var2;
			}
			var2--;
		}
	}

	@ObfuscatedName("hu.n(Lhk;)V")
	public void method3880(class218 arg0) {
		arg0.method3853(this.field2114 * 8 + this.field2120);
	}

	@ObfuscatedName("hu.m(Lhk;)V")
	public void method3883(class218 arg0) {
		int var2 = arg0.method3752();
		int var3 = arg0.method3751();
		arg0.method3853(24);
		this.field2119 = arg0.method3853(16);
		this.field2118 = arg0.method3853(24);
		if (this.field2115 == null || this.field2115.length != this.field2118) {
			this.field2115 = new int[this.field2118];
		}
		boolean var4 = arg0.method3845() != 0;
		if (var4) {
			int var5 = 0;
			int var6 = arg0.method3853(5) + 1;
			while (var5 < this.field2118) {
				int var7 = arg0.method3853(class783.method8327(this.field2118 - var5));
				for (int var8 = 0; var8 < var7; var8++) {
					this.field2115[var5++] = var6;
				}
				var6++;
			}
		} else {
			boolean var9 = arg0.method3845() != 0;
			for (int var10 = 0; var10 < this.field2118; var10++) {
				if (var9 && arg0.method3845() == 0) {
					this.field2115[var10] = 0;
				} else {
					this.field2115[var10] = arg0.method3853(5) + 1;
				}
			}
		}
		this.method3882();
		int var11 = arg0.method3853(4);
		if (var11 > 0) {
			float var12 = arg0.method3750(arg0.method3853(32));
			float var13 = arg0.method3750(arg0.method3853(32));
			int var14 = arg0.method3853(4) + 1;
			boolean var15 = arg0.method3845() != 0;
			int var16;
			if (var11 == 1) {
				var16 = method3881(this.field2118, this.field2119);
			} else {
				var16 = this.field2119 * this.field2118;
			}
			this.field2117 = new int[var16];
			for (int var17 = 0; var17 < var16; var17++) {
				this.field2117[var17] = arg0.method3853(var14);
			}
			this.field2121 = new float[this.field2118][this.field2119];
			if (var11 == 1) {
				for (int var18 = 0; var18 < this.field2118; var18++) {
					float var19 = 0.0F;
					int var20 = 1;
					for (int var21 = 0; var21 < this.field2119; var21++) {
						int var22 = var18 / var20 % var16;
						float var23 = (float) this.field2117[var22] * var13 + var12 + var19;
						this.field2121[var18][var21] = var23;
						if (var15) {
							var19 = var23;
						}
						var20 = var16 * var20;
					}
				}
			} else {
				for (int var24 = 0; var24 < this.field2118; var24++) {
					float var25 = 0.0F;
					int var26 = this.field2119 * var24;
					for (int var27 = 0; var27 < this.field2119; var27++) {
						float var28 = (float) this.field2117[var26] * var13 + var12 + var25;
						this.field2121[var24][var27] = var28;
						if (var15) {
							var25 = var28;
						}
						var26++;
					}
				}
			}
		}
		this.field2120 = arg0.method3752() - var2;
		this.field2114 = arg0.method3751() - var3;
	}

	@ObfuscatedName("hu.k()V")
	public void method3882() {
		int[] var1 = new int[this.field2118];
		int[] var2 = new int[33];
		for (int var3 = 0; var3 < this.field2118; var3++) {
			int var4 = this.field2115[var3];
			if (var4 != 0) {
				int var5 = 0x1 << 32 - var4;
				int var6 = var2[var4];
				var1[var3] = var6;
				int var7;
				if ((var6 & var5) == 0) {
					var7 = var6 | var5;
					for (int var8 = var4 - 1; var8 >= 1; var8--) {
						int var9 = var2[var8];
						if (var6 != var9) {
							break;
						}
						int var10 = 0x1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}
						var2[var8] = var9 | var10;
					}
				} else {
					var7 = var2[var4 - 1];
				}
				var2[var4] = var7;
				for (int var11 = var4 + 1; var11 <= 32; var11++) {
					int var12 = var2[var11];
					if (var6 == var12) {
						var2[var11] = var7;
					}
				}
			}
		}
		this.field2116 = new int[8];
		int var13 = 0;
		for (int var14 = 0; var14 < this.field2118; var14++) {
			int var15 = this.field2115[var14];
			if (var15 != 0) {
				int var16 = var1[var14];
				int var17 = 0;
				for (int var18 = 0; var18 < var15; var18++) {
					int var19 = Integer.MIN_VALUE >>> var18;
					if ((var16 & var19) == 0) {
						var17++;
					} else {
						if (this.field2116[var17] == 0) {
							this.field2116[var17] = var13;
						}
						var17 = this.field2116[var17];
					}
					if (var17 >= this.field2116.length) {
						int[] var20 = new int[this.field2116.length * 2];
						for (int var21 = 0; var21 < this.field2116.length; var21++) {
							var20[var21] = this.field2116[var21];
						}
						this.field2116 = var20;
					}
					int var22 = var19 >>> 1;
				}
				this.field2116[var17] = ~var14;
				if (var17 >= var13) {
					var13 = var17 + 1;
				}
			}
		}
	}

	@ObfuscatedName("hu.f(Lhk;)I")
	public int method3884(class218 arg0) {
		int var2;
		for (var2 = 0; this.field2116[var2] >= 0; var2 = arg0.method3845() == 0 ? var2 + 1 : this.field2116[var2]) {
		}
		return ~this.field2116[var2];
	}

	@ObfuscatedName("hu.w(Lhk;)[F")
	public float[] method3885(class218 arg0) {
		return this.field2121[this.method3884(arg0)];
	}
}
