package com.jagex;

import deob.ObfuscatedName;

import java.util.Comparator;

@ObfuscatedName("qi")
public class PrioritizedCacheComparator implements Comparator {

	// $FF: synthetic field
	public final PrioritizedCache this$0;

	public PrioritizedCacheComparator(PrioritizedCache arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("qi.e(Lqd;Lqd;B)I")
	public int method7264(PrioritizedCacheEntry arg0, PrioritizedCacheEntry arg1) {
		if (arg0.field4624 > arg1.field4624) {
			return 1;
		} else if (arg0.field4624 < arg1.field4624) {
			return -1;
		} else {
			return 0;
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method7264((PrioritizedCacheEntry) arg0, (PrioritizedCacheEntry) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
