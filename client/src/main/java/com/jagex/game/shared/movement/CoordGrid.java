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

	public CoordGrid(int level, int x, int z) {
		this.level = level;
		this.x = x;
		this.z = z;
	}

	public CoordGrid(int packed) {
		if (packed == -1) {
			this.level = -1;
		} else {
			this.level = packed >> 28 & 0x3;
			this.x = packed >> 14 & 0x3FFF;
			this.z = packed & 0x3FFF;
		}
	}

	@ObfuscatedName("ve.e(Lakt;B)V")
	public void fromFine(CoordFine fine) {
		this.level = fine.level;
		this.x = fine.x >> 9;
		this.z = fine.z >> 9;
	}

	@ObfuscatedName("ve.n(S)I")
	public int pack() {
		return this.level << 28 | this.x << 14 | this.z;
	}

	public boolean equals(Object other) {
		if (other == this) {
			return true;
		} else if (other instanceof CoordGrid) {
			return this.matches((CoordGrid) other);
		} else {
			return false;
		}
	}

	@ObfuscatedName("ve.m(Lve;I)Z")
	public boolean matches(CoordGrid other) {
		return this.matches(other.level, other.x, other.z);
	}

	@ObfuscatedName("ve.k(IIII)Z")
	public boolean matches(int level, int x, int z) {
		if (this.level != level) {
			return false;
		} else if (this.x == x) {
			return this.z == z;
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
	public String debug(String separator) {
		// e.g. 3222,3222,0 -> 0_50_50_22_22
		return this.level + separator + (this.x >> 6) + separator + (this.z >> 6) + separator + (this.x & 0x3F) + separator + (this.z & 0x3F);
	}
}
