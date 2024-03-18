package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("abg")
public class Pair {

	@ObfuscatedName("abg.e")
	public Object first;

	@ObfuscatedName("abg.n")
	public Object second;

	public Pair(Object first, Object second) {
		this.first = first;
		this.second = second;
	}

	public String toString() {
		return this.first + ", " + this.second;
	}

	public boolean equals(Object other) {
		if (other == null || !(other instanceof Pair)) {
			return false;
		}
		Pair pair = (Pair) other;
		if (this.first == null) {
			if (pair.first != null) {
				return false;
			}
		} else if (!this.first.equals(pair.first)) {
			return false;
		}
		if (this.second == null) {
			if (pair.second != null) {
				return false;
			}
		} else if (!this.second.equals(pair.second)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int hashCode = 0;
		if (this.first != null) {
			hashCode += this.first.hashCode();
		}
		if (this.second != null) {
			hashCode += this.second.hashCode() * 31;
		}
		return hashCode;
	}
}
