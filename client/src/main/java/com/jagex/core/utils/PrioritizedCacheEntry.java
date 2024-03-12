package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("qd")
public final class PrioritizedCacheEntry implements Comparable {

	@ObfuscatedName("qd.e")
	public Object field4625;

	@ObfuscatedName("qd.n")
	public Object field4623;

	@ObfuscatedName("qd.m")
	public long field4624;

	@ObfuscatedName("qd.k")
	public long field4622;

	public PrioritizedCacheEntry(Object arg0, Object arg1) {
		this.field4625 = arg0;
		this.field4623 = arg1;
	}

	@ObfuscatedName("qd.e(Lqd;B)I")
	public int method7249(PrioritizedCacheEntry arg0) {
		if (this.field4622 < arg0.field4622) {
			return -1;
		} else if (this.field4622 > arg0.field4622) {
			return 1;
		} else {
			return 0;
		}
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof PrioritizedCacheEntry)) {
			throw new IllegalArgumentException();
		}
		return this.field4623.equals(((PrioritizedCacheEntry) arg0).field4623);
	}

	public int hashCode() {
		return this.field4623.hashCode();
	}

	public int compareTo(Object arg0) {
		return this.method7249((PrioritizedCacheEntry) arg0);
	}
}
