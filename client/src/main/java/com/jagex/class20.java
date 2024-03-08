package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("r")
public class class20 {

	@ObfuscatedName("r.e")
	public int field528;

	@ObfuscatedName("r.n")
	public int field529;

	@ObfuscatedName("r.e(IIIB)Z")
	public boolean method315(int arg0, int arg1, int arg2) {
		int var4 = this.field529;
		if (this.field528 == arg0 && this.field529 == 0) {
			return false;
		}
		boolean var5;
		if (this.field529 == 0) {
			if (arg0 > this.field528 && arg0 <= this.field528 + arg1 || arg0 < this.field528 && arg0 >= this.field528 - arg1) {
				this.field528 = arg0;
				return false;
			}
			var5 = true;
		} else if (this.field529 > 0 && arg0 > this.field528) {
			int var6 = this.field529 * this.field529 / (arg1 * 2);
			int var7 = this.field528 + var6;
			if (var7 < arg0 && var7 >= this.field528) {
				var5 = true;
			} else {
				var5 = false;
			}
		} else if (this.field529 < 0 && arg0 < this.field528) {
			int var8 = this.field529 * this.field529 / (arg1 * 2);
			int var9 = this.field528 - var8;
			if (var9 > arg0 && var9 <= this.field528) {
				var5 = true;
			} else {
				var5 = false;
			}
		} else {
			var5 = false;
		}
		if (var5) {
			if (arg0 > this.field528) {
				this.field529 += arg1;
				if (arg2 != 0 && this.field529 > arg2) {
					this.field529 = arg2;
				}
			} else {
				this.field529 -= arg1;
				if (arg2 != 0 && this.field529 < -arg2) {
					this.field529 = -arg2;
				}
			}
			if (this.field529 != var4) {
				int var10 = this.field529 * this.field529 / (arg1 * 2);
				if (arg0 > this.field528) {
					if (this.field528 + var10 > arg0) {
						this.field529 = var4;
					}
				} else if (arg0 < this.field528 && this.field528 - var10 < arg0) {
					this.field529 = var4;
				}
			}
		} else if (this.field529 > 0) {
			this.field529 -= arg1;
			if (this.field529 < 0) {
				this.field529 = 0;
			}
		} else {
			this.field529 += arg1;
			if (this.field529 > 0) {
				this.field529 = 0;
			}
		}
		this.field528 += this.field529 + var4 >> 1;
		return var5;
	}

	@ObfuscatedName("r.n(IB)V")
	public void method314(int arg0) {
		this.field528 = arg0;
		this.field529 = 0;
	}

	@ObfuscatedName("r.m(I)I")
	public int method316() {
		return this.field528 & 0x3FFF;
	}

	@ObfuscatedName("r.k(I)V")
	public void method317() {
		this.field528 &= 0x3FFF;
	}
}
