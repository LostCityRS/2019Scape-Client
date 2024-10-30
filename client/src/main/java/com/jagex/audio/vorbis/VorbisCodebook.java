package com.jagex.audio.vorbis;

import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("hu")
public class VorbisCodebook {

	@ObfuscatedName("hu.e")
	public int dim;

	@ObfuscatedName("hu.n")
	public int[] lengthlist;

	@ObfuscatedName("hu.m")
	public int[] entryTree;

	@ObfuscatedName("hu.k")
	public int entries;

	@ObfuscatedName("hu.f")
	public int[] quantlist;

	@ObfuscatedName("hu.w")
	public int field2114 = 0;

	@ObfuscatedName("hu.l")
	public int field2120 = 0;

	@ObfuscatedName("hu.u")
	public float[][] valueVector;

	@ObfuscatedName("hu.e(II)I")
	public static int maptype1_quantvals(int arg0, int arg1) {
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
	public void method3880(VorbisSound arg0) {
		arg0.read(this.field2114 * 8 + this.field2120);
	}

	@ObfuscatedName("hu.m(Lhk;)V")
	public void unpack(VorbisSound arg0) {
		int var2 = arg0.method3752();
		int var3 = arg0.method3751();
		arg0.read(24);
		this.dim = arg0.read(16);
		this.entries = arg0.read(24);
		if (this.lengthlist == null || this.lengthlist.length != this.entries) {
			this.lengthlist = new int[this.entries];
		}
		boolean var4 = arg0.readBit() != 0;
		if (var4) {
			int var5 = 0;
			int var6 = arg0.read(5) + 1;
			while (var5 < this.entries) {
				int var7 = arg0.read(IntMath.ilog(this.entries - var5));
				for (int var8 = 0; var8 < var7; var8++) {
					this.lengthlist[var5++] = var6;
				}
				var6++;
			}
		} else {
			boolean var9 = arg0.readBit() != 0;
			for (int var10 = 0; var10 < this.entries; var10++) {
				if (var9 && arg0.readBit() == 0) {
					this.lengthlist[var10] = 0;
				} else {
					this.lengthlist[var10] = arg0.read(5) + 1;
				}
			}
		}
		this.makeWords();
		int var11 = arg0.read(4);
		if (var11 > 0) {
			float var12 = arg0.float32Unpack(arg0.read(32));
			float var13 = arg0.float32Unpack(arg0.read(32));
			int var14 = arg0.read(4) + 1;
			boolean var15 = arg0.readBit() != 0;
			int var16;
			if (var11 == 1) {
				var16 = maptype1_quantvals(this.entries, this.dim);
			} else {
				var16 = this.dim * this.entries;
			}
			this.quantlist = new int[var16];
			for (int var17 = 0; var17 < var16; var17++) {
				this.quantlist[var17] = arg0.read(var14);
			}
			this.valueVector = new float[this.entries][this.dim];
			if (var11 == 1) {
				for (int var18 = 0; var18 < this.entries; var18++) {
					float var19 = 0.0F;
					int var20 = 1;
					for (int var21 = 0; var21 < this.dim; var21++) {
						int var22 = var18 / var20 % var16;
						float var23 = (float) this.quantlist[var22] * var13 + var12 + var19;
						this.valueVector[var18][var21] = var23;
						if (var15) {
							var19 = var23;
						}
						var20 = var16 * var20;
					}
				}
			} else {
				for (int var24 = 0; var24 < this.entries; var24++) {
					float var25 = 0.0F;
					int var26 = this.dim * var24;
					for (int var27 = 0; var27 < this.dim; var27++) {
						float var28 = (float) this.quantlist[var26] * var13 + var12 + var25;
						this.valueVector[var24][var27] = var28;
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
	public void makeWords() {
		int[] var1 = new int[this.entries];
		int[] var2 = new int[33];
		for (int var3 = 0; var3 < this.entries; var3++) {
			int var4 = this.lengthlist[var3];
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
		this.entryTree = new int[8];
		int var13 = 0;
		for (int var14 = 0; var14 < this.entries; var14++) {
			int var15 = this.lengthlist[var14];
			if (var15 != 0) {
				int var16 = var1[var14];
				int var17 = 0;
				for (int var18 = 0; var18 < var15; var18++) {
					int var19 = Integer.MIN_VALUE >>> var18;
					if ((var16 & var19) == 0) {
						var17++;
					} else {
						if (this.entryTree[var17] == 0) {
							this.entryTree[var17] = var13;
						}
						var17 = this.entryTree[var17];
					}
					if (var17 >= this.entryTree.length) {
						int[] var20 = new int[this.entryTree.length * 2];
						for (int var21 = 0; var21 < this.entryTree.length; var21++) {
							var20[var21] = this.entryTree[var21];
						}
						this.entryTree = var20;
					}
					int var22 = var19 >>> 1;
				}
				this.entryTree[var17] = ~var14;
				if (var17 >= var13) {
					var13 = var17 + 1;
				}
			}
		}
	}

	@ObfuscatedName("hu.f(Lhk;)I")
	public int decodeScalar(VorbisSound arg0) {
		int var2;
		for (var2 = 0; this.entryTree[var2] >= 0; var2 = arg0.readBit() == 0 ? var2 + 1 : this.entryTree[var2]) {
		}
		return ~this.entryTree[var2];
	}

	@ObfuscatedName("hu.w(Lhk;)[F")
	public float[] decodeVq(VorbisSound arg0) {
		return this.valueVector[this.decodeScalar(arg0)];
	}
}
