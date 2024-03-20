package com.jagex.audio.vorbis;

import deob.ObfuscatedName;

@ObfuscatedName("gi")
public class VorbisResidue {

	@ObfuscatedName("gi.e")
	public int field2019;

	@ObfuscatedName("gi.n")
	public int begin;

	@ObfuscatedName("gi.m")
	public int end;

	@ObfuscatedName("gi.k")
	public int grouping;

	@ObfuscatedName("gi.f")
	public int partitions;

	@ObfuscatedName("gi.w")
	public int groupbook;

	@ObfuscatedName("gi.l")
	public int[] booklist;

	@ObfuscatedName("gi.u")
	public int[] secondstages;

	@ObfuscatedName("gi.z")
	public VorbisSound opb;

	@ObfuscatedName("gi.p")
	public int[][] field2023;

	@ObfuscatedName("gi.e(Lhk;)V")
	public void unpack(VorbisSound opb) {
		this.opb = opb;
		this.field2019 = this.opb.read(16);
		this.begin = this.opb.read(24);
		this.end = this.opb.read(24);
		this.grouping = this.opb.read(24) + 1;
		this.partitions = this.opb.read(6) + 1;
		this.groupbook = this.opb.read(8);

		if (this.secondstages == null || this.secondstages.length != this.partitions) {
			this.secondstages = new int[this.partitions];
		}

		for (int j = 0; j < this.partitions; j++) {
			int var3 = 0;
			int cascade = this.opb.read(3);
			boolean var5 = this.opb.readBit() != 0;
			if (var5) {
				var3 = this.opb.read(5);
			}
			this.secondstages[j] = var3 << 3 | cascade;
		}

		if (this.booklist == null || this.partitions * 8 != this.booklist.length) {
			this.booklist = new int[this.partitions * 8];
		}

		for (int var6 = 0; var6 < this.partitions * 8; var6++) {
			this.booklist[var6] = (this.secondstages[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : this.opb.read(8);
		}
	}

	@ObfuscatedName("gi.n([I)V")
	public void method3675(int[] arg0) {
		if (arg0 != null) {
			for (int var2 = 0; var2 < arg0.length; var2++) {
				arg0[var2] = 0;
			}
		}
	}

	@ObfuscatedName("gi.m([Lhb;I[Z)[Lhb;")
	public VorbisSound.WindowFunction[] method3676(VorbisSound.WindowFunction[] arg0, int arg1, boolean[] arg2) {
		int var4 = arg0.length;
		for (int var5 = 0; var5 < var4; var5++) {
			if (!arg2[var5]) {
				for (int var6 = 0; var6 < arg1; var6++) {
					arg0[var5].floor[var6] = 0.0F;
				}
			}
		}
		int var7 = this.opb.book_param[this.groupbook].dim;
		int var8 = this.end - this.begin;
		int var9 = var8 / this.grouping;
		if (this.field2023 != null && this.field2023.length == var4 && this.field2023[0].length == var9) {
			for (int var10 = 0; var10 < var4; var10++) {
				this.method3675(this.field2023[var10]);
			}
		} else {
			this.field2023 = new int[var4][var9];
		}
		for (int var11 = 0; var11 < 8; var11++) {
			int var12 = 0;
			while (var12 < var9) {
				if (var11 == 0) {
					for (int var13 = 0; var13 < var4; var13++) {
						if (!arg2[var13]) {
							int var14 = this.opb.book_param[this.groupbook].decodeScalar(this.opb);
							for (int var15 = var7 - 1; var15 >= 0; var15--) {
								if (var12 + var15 < var9) {
									this.field2023[var13][var12 + var15] = var14 % this.partitions;
								}
								var14 /= this.partitions;
							}
						}
					}
				}
				for (int var16 = 0; var16 < var7; var16++) {
					for (int var17 = 0; var17 < var4; var17++) {
						if (!arg2[var17]) {
							int var18 = this.field2023[var17][var12];
							int var19 = this.booklist[var18 * 8 + var11];
							if (var19 >= 0) {
								int var20 = this.grouping * var12 + this.begin;
								VorbisCodebook var21 = this.opb.book_param[var19];
								if (this.field2019 == 0) {
									int var22 = this.grouping / var21.dim;
									for (int var23 = 0; var23 < var22; var23++) {
										float[] var24 = var21.decodeVq(this.opb);
										for (int var25 = 0; var25 < var21.dim; var25++) {
											arg0[var17].floor[var22 * var25 + var20 + var23] += var24[var25];
										}
									}
								} else if (this.field2019 == 1 || this.field2019 == 2) {
									int var26 = 0;
									while (var26 < this.grouping) {
										float[] var27 = var21.decodeVq(this.opb);
										for (int var28 = 0; var28 < var21.dim; var28++) {
											arg0[var17].floor[var20 + var26] += var27[var28];
											var26++;
										}
									}
								}
							}
						}
					}
					var12++;
					if (var12 >= var9) {
						break;
					}
				}
			}
		}
		return arg0;
	}
}
