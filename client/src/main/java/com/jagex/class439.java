package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("pl")
public class class439 {

	@ObfuscatedName("pl.n")
	public int field4385;

	@ObfuscatedName("pl.m")
	public byte[] field4384;

	@ObfuscatedName("pl.k")
	public int field4396;

	@ObfuscatedName("pl.f")
	public int field4387;

	@ObfuscatedName("pl.w")
	public int[] field4394;

	@ObfuscatedName("pl.l")
	public int[] field4390;

	@ObfuscatedName("pl.u")
	public class253 field4391;

	@ObfuscatedName("pl.z")
	public int field4392;

	@ObfuscatedName("pl.p")
	public int[] field4393;

	@ObfuscatedName("pl.d")
	public int[] field4400;

	@ObfuscatedName("pl.c")
	public byte[][] field4395;

	@ObfuscatedName("pl.r")
	public int[] field4398;

	@ObfuscatedName("pl.v")
	public int[] field4397;

	@ObfuscatedName("pl.o")
	public int[] field4388;

	@ObfuscatedName("pl.s")
	public int[] field4399;

	@ObfuscatedName("pl.y")
	public int[][] field4386;

	@ObfuscatedName("pl.q")
	public int[][] field4401;

	@ObfuscatedName("pl.x")
	public class253[] field4402;

	@ObfuscatedName("pl.b")
	public int[] field4403;

	public class439(byte[] arg0, int arg1, byte[] arg2) {
		this.field4385 = class997.method9757(arg0, arg0.length);
		if (this.field4385 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.field4384 = class735.method18308(arg0, 0, arg0.length);
			for (int var4 = 0; var4 < 64; var4++) {
				if (this.field4384[var4] != arg2[var4]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6849(arg0);
	}

	@ObfuscatedName("pl.e([BI)V")
	public void method6849(byte[] arg0) {
		class997 var2 = new class997(Statics.method7275(arg0));
		int var3 = var2.method17904();
		if (var3 < 5 || var3 > 7) {
			throw new RuntimeException();
		}
		if (var3 >= 6) {
			this.field4396 = var2.method17910();
		} else {
			this.field4396 = 0;
		}
		int var4 = var2.method17904();
		boolean var5 = (var4 & 0x1) != 0;
		boolean var6 = (var4 & 0x2) != 0;
		boolean var7 = (var4 & 0x4) != 0;
		boolean var8 = (var4 & 0x8) != 0;
		if (var3 >= 7) {
			this.field4387 = var2.method17926();
		} else {
			this.field4387 = var2.method17906();
		}
		int var9 = 0;
		int var10 = -1;
		this.field4394 = new int[this.field4387];
		if (var3 >= 7) {
			for (int var11 = 0; var11 < this.field4387; var11++) {
				this.field4394[var11] = var9 += var2.method17926();
				if (this.field4394[var11] > var10) {
					var10 = this.field4394[var11];
				}
			}
		} else {
			for (int var12 = 0; var12 < this.field4387; var12++) {
				this.field4394[var12] = var9 += var2.method17906();
				if (this.field4394[var12] > var10) {
					var10 = this.field4394[var12];
				}
			}
		}
		this.field4392 = var10 + 1;
		this.field4393 = new int[this.field4392];
		if (var8) {
			this.field4400 = new int[this.field4392];
		}
		if (var6) {
			this.field4395 = new byte[this.field4392][];
		}
		this.field4398 = new int[this.field4392];
		this.field4399 = new int[this.field4392];
		this.field4386 = new int[this.field4392][];
		this.field4403 = new int[this.field4392];
		if (var5) {
			this.field4390 = new int[this.field4392];
			for (int var13 = 0; var13 < this.field4392; var13++) {
				this.field4390[var13] = -1;
			}
			for (int var14 = 0; var14 < this.field4387; var14++) {
				this.field4390[this.field4394[var14]] = var2.method17910();
			}
			this.field4391 = new class253(this.field4390);
		}
		for (int var15 = 0; var15 < this.field4387; var15++) {
			this.field4393[this.field4394[var15]] = var2.method17910();
		}
		if (var8) {
			for (int var16 = 0; var16 < this.field4387; var16++) {
				this.field4400[var16] = var2.method17910();
			}
		}
		if (var6) {
			for (int var17 = 0; var17 < this.field4387; var17++) {
				byte[] var18 = new byte[64];
				var2.method17921(var18, 0, 64);
				this.field4395[this.field4394[var17]] = var18;
			}
		}
		if (var7) {
			this.field4397 = new int[this.field4392];
			this.field4388 = new int[this.field4392];
			for (int var19 = 0; var19 < this.field4387; var19++) {
				this.field4397[this.field4394[var19]] = var2.method17910();
				this.field4388[this.field4394[var19]] = var2.method17910();
			}
		}
		for (int var20 = 0; var20 < this.field4387; var20++) {
			this.field4398[this.field4394[var20]] = var2.method17910();
		}
		if (var3 >= 7) {
			for (int var21 = 0; var21 < this.field4387; var21++) {
				this.field4399[this.field4394[var21]] = var2.method17926();
			}
			for (int var22 = 0; var22 < this.field4387; var22++) {
				int var23 = this.field4394[var22];
				int var24 = this.field4399[var23];
				int var25 = 0;
				int var26 = -1;
				this.field4386[var23] = new int[var24];
				for (int var27 = 0; var27 < var24; var27++) {
					int var28 = this.field4386[var23][var27] = var25 += var2.method17926();
					if (var28 > var26) {
						var26 = var28;
					}
				}
				this.field4403[var23] = var26 + 1;
				if (var26 + 1 == var24) {
					this.field4386[var23] = null;
				}
			}
		} else {
			for (int var29 = 0; var29 < this.field4387; var29++) {
				this.field4399[this.field4394[var29]] = var2.method17906();
			}
			for (int var30 = 0; var30 < this.field4387; var30++) {
				int var31 = this.field4394[var30];
				int var32 = this.field4399[var31];
				int var33 = 0;
				int var34 = -1;
				this.field4386[var31] = new int[var32];
				for (int var35 = 0; var35 < var32; var35++) {
					int var36 = this.field4386[var31][var35] = var33 += var2.method17906();
					if (var36 > var34) {
						var34 = var36;
					}
				}
				this.field4403[var31] = var34 + 1;
				if (var34 + 1 == var32) {
					this.field4386[var31] = null;
				}
			}
		}
		if (!var5) {
			return;
		}
		this.field4401 = new int[var10 + 1][];
		this.field4402 = new class253[var10 + 1];
		for (int var37 = 0; var37 < this.field4387; var37++) {
			int var38 = this.field4394[var37];
			int var39 = this.field4399[var38];
			this.field4401[var38] = new int[this.field4403[var38]];
			for (int var40 = 0; var40 < this.field4403[var38]; var40++) {
				this.field4401[var38][var40] = -1;
			}
			for (int var41 = 0; var41 < var39; var41++) {
				int var42;
				if (this.field4386[var38] == null) {
					var42 = var41;
				} else {
					var42 = this.field4386[var38][var41];
				}
				this.field4401[var38][var42] = var2.method17910();
			}
			this.field4402[var38] = new class253(this.field4401[var38]);
		}
	}
}
