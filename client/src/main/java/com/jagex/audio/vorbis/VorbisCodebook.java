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
		int var2 = (int) Math.pow(arg0, 1.0D / (double) arg1) + 1;
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
	public void unpack(VorbisSound opb) {
		int var2 = opb.method3752();
		int var3 = opb.method3751();

		opb.read(24); // 0x564342
		this.dim = opb.read(16);
		this.entries = opb.read(24);

		if (this.lengthlist == null || this.lengthlist.length != this.entries) {
			this.lengthlist = new int[this.entries];
		}

		boolean ordered = opb.readBit() != 0;
		if (ordered) {
			int i = 0;
			int length = opb.read(5) + 1;

			while (i < this.entries) {
				int num = opb.read(IntMath.ilog(this.entries - i));
				for (int var8 = 0; var8 < num; var8++) {
					this.lengthlist[i++] = length;
				}
				length++;
			}
		} else {
			boolean var9 = opb.readBit() != 0;
			for (int i = 0; i < this.entries; i++) {
				if (var9 && opb.readBit() == 0) {
					this.lengthlist[i] = 0;
				} else {
					this.lengthlist[i] = opb.read(5) + 1;
				}
			}
		}

		this.makeWords();

		int maptype = opb.read(4);
		if (maptype > 0) {
			float q_min = opb.float32Unpack(opb.read(32));
			float q_delta = opb.float32Unpack(opb.read(32));
			int q_quant = opb.read(4) + 1;
			boolean q_sequencecap = opb.readBit() != 0;

			int quantvals;
			if (maptype == 1) {
				quantvals = maptype1_quantvals(this.entries, this.dim);
			} else {
				quantvals = this.dim * this.entries;
			}

			this.quantlist = new int[quantvals];
			for (int i = 0; i < quantvals; i++) {
				this.quantlist[i] = opb.read(q_quant);
			}

			this.valueVector = new float[this.entries][this.dim];
			if (maptype == 1) {
				for (int var18 = 0; var18 < this.entries; var18++) {
					float var19 = 0.0F;
					int var20 = 1;
					for (int var21 = 0; var21 < this.dim; var21++) {
						int var22 = var18 / var20 % quantvals;
						float var23 = (float) this.quantlist[var22] * q_delta + q_min + var19;
						this.valueVector[var18][var21] = var23;
						if (q_sequencecap) {
							var19 = var23;
						}
						var20 = quantvals * var20;
					}
				}
			} else {
				for (int var24 = 0; var24 < this.entries; var24++) {
					float var25 = 0.0F;
					int var26 = this.dim * var24;
					for (int var27 = 0; var27 < this.dim; var27++) {
						float var28 = (float) this.quantlist[var26] * q_delta + q_min + var25;
						this.valueVector[var24][var27] = var28;
						if (q_sequencecap) {
							var25 = var28;
						}
						var26++;
					}
				}
			}
		}

		this.field2120 = opb.method3752() - var2;
		this.field2114 = opb.method3751() - var3;
	}

	@ObfuscatedName("hu.k()V")
	public void makeWords() {
		int[] r = new int[this.entries];
		int[] marker = new int[33];

		for (int i = 0; i < this.entries; i++) {
			int length = this.lengthlist[i];

			if (length != 0) {
				int var5 = 0x1 << 32 - length;
				int entry = marker[length];
				r[i] = entry;

				int var7;
				if ((entry & var5) == 0) {
					var7 = entry | var5;

					for (int j = length - 1; j >= 1; j--) {
						int var9 = marker[j];
						if (entry != var9) {
							break;
						}

						int var10 = 0x1 << 32 - j;
						if ((var9 & var10) != 0) {
							marker[j] = marker[j - 1];
							break;
						}

						marker[j] = var9 | var10;
					}
				} else {
					var7 = marker[length - 1];
				}

				marker[length] = var7;

				for (int j = length + 1; j <= 32; j++) {
					int var12 = marker[j];

					if (entry == var12) {
						marker[j] = var7;
					}
				}
			}
		}

		// bitreverse the words
		this.entryTree = new int[8];

		int var13 = 0;
		for (int i = 0; i < this.entries; i++) {
			int var15 = this.lengthlist[i];

			if (var15 != 0) {
				int var16 = r[i];
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

				this.entryTree[var17] = ~i;

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
