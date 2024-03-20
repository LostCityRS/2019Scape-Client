package com.jagex.audio.vorbis;

import deob.ObfuscatedName;

@ObfuscatedName("hl")
public class VorbisMapping {

	@ObfuscatedName("hl.e")
	public int submaps;

	@ObfuscatedName("hl.n")
	public int field2132;

	@ObfuscatedName("hl.m")
	public int[] mux = null;

	@ObfuscatedName("hl.k")
	public int[] submapFloor;

	@ObfuscatedName("hl.f")
	public int[] submapResidue;

	@ObfuscatedName("hl.w")
	public VorbisSound opb;

	@ObfuscatedName("hl.l")
	public int[] field2127;

	@ObfuscatedName("hl.u")
	public int[] field2133;

	@ObfuscatedName("hl.e([I)V")
	public void method3905(int[] arg0) {
		if (arg0 != null) {
			for (int var2 = 0; var2 < arg0.length; var2++) {
				arg0[var2] = 0;
			}
		}
	}

	@ObfuscatedName("hl.n(Lhk;)V")
	public void unpack(VorbisSound arg0) {
		this.opb = arg0;
		int var2 = this.opb.method3849();
		this.opb.read(16);
		this.submaps = this.opb.readBit() == 0 ? 1 : this.opb.read(4) + 1;
		if (this.opb.readBit() == 0) {
			this.field2132 = 0;
		} else {
			this.field2132 = this.opb.read(8) + 1;
			if (this.field2127 != null && this.field2127.length == this.field2132) {
				this.method3905(this.field2127);
			} else {
				this.field2127 = new int[this.field2132];
			}
			if (this.field2133 != null && this.field2133.length == this.field2132) {
				this.method3905(this.field2133);
			} else {
				this.field2133 = new int[this.field2132];
			}
			for (int var3 = 0; var3 < this.field2132; var3++) {
				this.field2127[var3] = this.opb.read(this.method3899(var2 - 1));
				this.field2133[var3] = this.opb.read(this.method3899(var2 - 1));
			}
		}
		this.opb.read(2);
		if (this.submaps > 1) {
			this.mux = new int[var2];
			for (int var4 = 0; var4 < var2; var4++) {
				this.mux[var4] = this.opb.read(4);
			}
		}
		if (this.submapFloor != null && this.submapFloor.length == this.submaps) {
			this.method3905(this.submapFloor);
		} else {
			this.submapFloor = new int[this.submaps];
		}
		if (this.submapResidue != null && this.submapResidue.length == this.submaps) {
			this.method3905(this.submapResidue);
		} else {
			this.submapResidue = new int[this.submaps];
		}
		for (int var5 = 0; var5 < this.submaps; var5++) {
			this.opb.read(8);
			this.submapFloor[var5] = this.opb.read(8);
			this.submapResidue[var5] = this.opb.read(8);
		}
	}

	@ObfuscatedName("hl.m(I)I")
	public int method3899(int arg0) {
		int var2 = 0;
		while (arg0 > 0) {
			var2++;
			arg0 >>= 0x1;
		}
		return var2;
	}
}
