package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("abg")
public class Pair {

	@ObfuscatedName("abg.e")
	public Object field8737;

	@ObfuscatedName("abg.n")
	public Object field8738;

	public Pair(Object arg0, Object arg1) {
		this.field8737 = arg0;
		this.field8738 = arg1;
	}

	public String toString() {
		return this.field8737 + ", " + this.field8738;
	}

	public boolean equals(Object arg0) {
		if (arg0 == null || !(arg0 instanceof Pair)) {
			return false;
		}
		Pair var2 = (Pair) arg0;
		if (this.field8737 == null) {
			if (var2.field8737 != null) {
				return false;
			}
		} else if (!this.field8737.equals(var2.field8737)) {
			return false;
		}
		if (this.field8738 == null) {
			if (var2.field8738 != null) {
				return false;
			}
		} else if (!this.field8738.equals(var2.field8738)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field8737 != null) {
			var1 += this.field8737.hashCode();
		}
		if (this.field8738 != null) {
			var1 += this.field8738.hashCode() * 31;
		}
		return var1;
	}
}