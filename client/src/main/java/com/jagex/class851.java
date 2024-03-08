package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afb")
public class class851 extends class136 {

	@ObfuscatedName("afb.e")
	public int field10213;

	@ObfuscatedName("afb.n")
	public int field10218;

	@ObfuscatedName("afb.m")
	public int field10214;

	@ObfuscatedName("afb.k")
	public int field10215;

	@ObfuscatedName("afb.f")
	public int field10212;

	@ObfuscatedName("afb.w")
	public int field10217;

	@ObfuscatedName("afb.l")
	public int[] field10216;

	@ObfuscatedName("afb.u")
	public boolean field10219 = false;

	public class851(int arg0, int arg1, int[] arg2) {
		this.field10213 = arg0;
		this.field10218 = arg1;
		this.field10216 = arg2;
		for (int var4 = 0; var4 < this.field10216.length; var4++) {
			if ((this.field10216[var4] & -16777216) != -16777216) {
				this.field10219 = true;
				break;
			}
		}
	}

	@ObfuscatedName("afb.e()Z")
	public boolean method2587() {
		return false;
	}

	@ObfuscatedName("afb.n()Z")
	public boolean method2644() {
		return this.field10219;
	}

	@ObfuscatedName("afb.m()I")
	public int method2639() {
		return this.field10213;
	}

	@ObfuscatedName("afb.k()I")
	public int method2631() {
		return this.field10218;
	}

	@ObfuscatedName("afb.p()I")
	public int method2596() {
		return this.field10214 + this.field10213 + this.field10215;
	}

	@ObfuscatedName("afb.d()I")
	public int method2597() {
		return this.field10218 + this.field10212 + this.field10217;
	}

	@ObfuscatedName("afb.f()I")
	public int method2591() {
		return this.field10214;
	}

	@ObfuscatedName("afb.w()I")
	public int method2603() {
		return this.field10215;
	}

	@ObfuscatedName("afb.l()I")
	public int method2593() {
		return this.field10212;
	}

	@ObfuscatedName("afb.u()I")
	public int method2651() {
		return this.field10217;
	}

	@ObfuscatedName("afb.z()V")
	public void method2595() {
		this.field10217 = 0;
		this.field10212 = 0;
		this.field10215 = 0;
		this.field10214 = 0;
	}

	@ObfuscatedName("afb.c(I)V")
	public void method2646(int arg0) {
		int var2 = this.method2596();
		int var3 = this.method2597();
		if (this.field10213 == var2 && this.field10218 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.field10214) {
			var4 = this.field10214;
		}
		int var5 = arg0;
		if (this.field10214 + arg0 + this.field10213 > var2) {
			var5 = var2 - this.field10214 - this.field10213;
		}
		int var6 = arg0;
		if (arg0 > this.field10212) {
			var6 = this.field10212;
		}
		int var7 = arg0;
		if (this.field10212 + arg0 + this.field10218 > var3) {
			var7 = var3 - this.field10212 - this.field10218;
		}
		int var8 = this.field10213 + var4 + var5;
		int var9 = this.field10218 + var6 + var7;
		int[] var10 = new int[var8 * var9];
		this.field10219 = false;
		for (int var11 = 0; var11 < this.field10218; var11++) {
			int var12 = this.field10213 * var11;
			int var13 = (var6 + var11) * var8 + var4;
			for (int var14 = 0; var14 < this.field10213; var14++) {
				if ((this.field10216[var12] & -16777216) != -16777216) {
					this.field10219 = true;
				}
				var10[var13++] = this.field10216[var12++];
			}
		}
		this.field10214 -= var4;
		this.field10212 -= var6;
		this.field10215 -= var5;
		this.field10217 -= var7;
		this.field10213 = var8;
		this.field10218 = var9;
		this.field10216 = var10;
	}

	@ObfuscatedName("afb.r(I)V")
	public void method2599(int arg0) {
		int var2 = 0;
		this.field10219 = false;
		int[] var3 = new int[this.field10218 * this.field10213];
		for (int var4 = 0; var4 < this.field10218; var4++) {
			for (int var5 = 0; var5 < this.field10213; var5++) {
				int var6 = this.field10216[var2];
				if ((var6 & 0xFF000000) == 0) {
					if (var5 > 0 && (this.field10216[var2 - 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 > 0 && (this.field10216[var2 - this.field10213] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var5 < this.field10213 - 1 && (this.field10216[var2 + 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 < this.field10218 - 1 && (this.field10216[this.field10213 + var2] & 0xFF000000) != 0) {
						var6 = arg0;
					}
				}
				if ((var6 & -16777216) != -16777216) {
					this.field10219 = true;
				}
				var3[var2++] = var6;
			}
		}
		this.field10216 = var3;
	}

	@ObfuscatedName("afb.v(I)V")
	public void method2600(int arg0) {
		for (int var2 = this.field10218 - 1; var2 > 0; var2--) {
			int var3 = this.field10213 * var2;
			for (int var4 = this.field10213 - 1; var4 > 0; var4--) {
				if ((this.field10216[var3 + var4] & 0xFF000000) == 0 && (this.field10216[var3 + var4 - 1 - this.field10213] & 0xFF000000) != 0) {
					this.field10216[var3 + var4] = arg0;
				}
			}
		}
	}

	@ObfuscatedName("afb.o()V")
	public void method2601() {
		int[] var1 = this.field10216;
		for (int var2 = this.field10218 - 1; var2 >= 0; var2--) {
			int var3 = this.field10213 * var2;
			int var4 = (var2 + 1) * this.field10213;
			while (var3 < var4) {
				var4--;
				int var5 = var1[var3];
				var1[var3] = var1[var4];
				var1[var4] = var5;
				var3++;
			}
		}
		int var6 = this.field10214;
		this.field10214 = this.field10215;
		this.field10215 = var6;
	}

	@ObfuscatedName("afb.s()V")
	public void method2602() {
		int[] var1 = this.field10216;
		for (int var2 = (this.field10218 >> 1) - 1; var2 >= 0; var2--) {
			int var3 = this.field10213 * var2;
			int var4 = (this.field10218 - var2 - 1) * this.field10213;
			for (int var5 = -this.field10213; var5 < 0; var5++) {
				int var6 = var1[var3];
				var1[var3] = var1[var4];
				var1[var4] = var6;
				var3++;
				var4++;
			}
		}
		int var7 = this.field10212;
		this.field10212 = this.field10217;
		this.field10217 = var7;
	}

	@ObfuscatedName("afb.y()V")
	public void method2588() {
		int[] var1 = new int[this.field10218 * this.field10213];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field10213; var3++) {
			for (int var4 = this.field10218 - 1; var4 >= 0; var4--) {
				var1[var2++] = this.field10216[this.field10213 * var4 + var3];
			}
		}
		this.field10216 = var1;
		int var5 = this.field10212;
		this.field10212 = this.field10214;
		this.field10214 = this.field10217;
		this.field10217 = this.field10215;
		this.field10215 = var5;
		int var6 = this.field10218;
		this.field10218 = this.field10213;
		this.field10213 = var6;
	}

	@ObfuscatedName("afb.q(Z)[I")
	public int[] method2604(boolean arg0) {
		if (!arg0 || this.method2596() == this.field10213 && this.method2597() == this.field10218) {
			return this.field10216;
		}
		int var2 = this.method2596();
		int[] var3 = new int[var2 * this.method2597()];
		for (int var4 = 0; var4 < this.field10218; var4++) {
			int var5 = this.field10213 * var4;
			int var6 = (this.field10212 + var4) * var2 + this.field10214;
			for (int var7 = 0; var7 < this.field10213; var7++) {
				var3[var6++] = this.field10216[var5];
				var5++;
			}
		}
		return var3;
	}

	@ObfuscatedName("afb.x(III)V")
	public void method2605(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.field10216.length; var4++) {
			int var5 = this.field10216[var4] >> 16 & 0xFF;
			int var6 = arg0 + var5;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.field10216[var4] >> 8 & 0xFF;
			int var8 = arg1 + var7;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}
			int var9 = this.field10216[var4] >> 0 & 0xFF;
			int var10 = arg2 + var9;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 255) {
				var10 = 255;
			}
			this.field10216[var4] = this.field10216[var4] & 0xFF000000 | var6 << 16 | var8 << 8 | var10;
		}
	}

	@ObfuscatedName("afb.b(II)I")
	public int method2617(int arg0, int arg1) {
		return this.field10216[this.field10213 * arg1 + arg0];
	}
}
