package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("abg")
public class Pair {

	@ObfuscatedName("abg.e")
	public Object first;

	@ObfuscatedName("abg.n")
	public Object second;

	public Pair(Object arg0, Object arg1) {
		this.first = arg0;
		this.second = arg1;
	}

	public String toString() {
		return this.first + ", " + this.second;
	}

	public boolean equals(Object arg0) {
		if (arg0 == null || !(arg0 instanceof Pair)) {
			return false;
		}
		Pair var2 = (Pair) arg0;
		if (this.first == null) {
			if (var2.first != null) {
				return false;
			}
		} else if (!this.first.equals(var2.first)) {
			return false;
		}
		if (this.second == null) {
			if (var2.second != null) {
				return false;
			}
		} else if (!this.second.equals(var2.second)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.first != null) {
			var1 += this.first.hashCode();
		}
		if (this.second != null) {
			var1 += this.second.hashCode() * 31;
		}
		return var1;
	}
}
