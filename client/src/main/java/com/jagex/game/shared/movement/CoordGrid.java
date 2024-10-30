package com.jagex.game.shared.movement;

import deob.ObfuscatedName;

@ObfuscatedName("ve")
public class CoordGrid {

	@ObfuscatedName("ve.e")
	public int level;

	@ObfuscatedName("ve.n")
	public int x;

	@ObfuscatedName("ve.m")
	public int z;

	public CoordGrid() {
		this.level = -1;
	}

	public CoordGrid(int arg0, int arg1, int arg2) {
		this.level = arg0;
		this.x = arg1;
		this.z = arg2;
	}

	public CoordGrid(int arg0) {
		if (arg0 == -1) {
			this.level = -1;
		} else {
			this.level = arg0 >> 28 & 0x3;
			this.x = arg0 >> 14 & 0x3FFF;
			this.z = arg0 & 0x3FFF;
		}
	}

	@ObfuscatedName("ve.e(Lakt;B)V")
	public void fromFine(CoordFine arg0) {
		this.level = arg0.level;
		this.x = arg0.x >> 9;
		this.z = arg0.z >> 9;
	}

	@ObfuscatedName("ve.n(S)I")
	public int pack() {
		return this.level << 28 | this.x << 14 | this.z;
	}

	public boolean equals(Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof CoordGrid) {
			return this.matches((CoordGrid) arg0);
		} else {
			return false;
		}
	}

	@ObfuscatedName("ve.m(Lve;I)Z")
	public boolean matches(CoordGrid arg0) {
		return this.matches(arg0.level, arg0.x, arg0.z);
	}

	@ObfuscatedName("ve.k(IIII)Z")
	public boolean matches(int arg0, int arg1, int arg2) {
		if (this.level != arg0) {
			return false;
		} else if (this.x == arg1) {
			return this.z == arg2;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.pack();
	}

	public String toString() {
		return this.debug(",");
	}

	@ObfuscatedName("ve.f(Ljava/lang/String;I)Ljava/lang/String;")
	public String debug(String arg0) {
		return this.level + arg0 + (this.x >> 6) + arg0 + (this.z >> 6) + arg0 + (this.x & 0x3F) + arg0 + (this.z & 0x3F);
	}
}
