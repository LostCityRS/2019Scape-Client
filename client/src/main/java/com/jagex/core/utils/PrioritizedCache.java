package com.jagex.core.utils;

import com.jagex.core.datastruct.SortedQueue;
import deob.ObfuscatedName;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("qy")
public final class PrioritizedCache {

	@ObfuscatedName("qy.e")
	public final Comparator field4631;

	@ObfuscatedName("qy.n")
	public final Map field4628;

	@ObfuscatedName("qy.m")
	public final SortedQueue field4629;

	@ObfuscatedName("qy.k")
	public final SortedQueue field4630;

	@ObfuscatedName("qy.f")
	public final long field4632;

	@ObfuscatedName("qy.w")
	public final PrioritizedCacheMode field4627;

	@ObfuscatedName("qy.l")
	public final int field4633;

	@ObfuscatedName("qi")
	public static class PrioritizedCacheComparator implements Comparator {

		// $FF: synthetic field
		public final PrioritizedCache this$0;

		// line 7
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

	// line 30
	public PrioritizedCache(int arg0, PrioritizedCacheMode arg1) {
		this(-1L, arg0, arg1);
	}

	public PrioritizedCache(long arg0, int arg1, PrioritizedCacheMode arg2) {
		this.field4631 = new PrioritizedCacheComparator(this);
		this.field4632 = arg0;
		this.field4633 = arg1;
		this.field4627 = arg2;
		if (this.field4633 == -1) {
			this.field4628 = new HashMap(64);
			this.field4629 = new SortedQueue(64, this.field4631);
			this.field4630 = null;
		} else if (this.field4627 == null) {
			throw new IllegalArgumentException("");
		} else {
			this.field4628 = new HashMap(this.field4633);
			this.field4629 = new SortedQueue(this.field4633, this.field4631);
			this.field4630 = new SortedQueue(this.field4633);
		}
	}

	@ObfuscatedName("qy.e(B)Z")
	public boolean method7277() {
		return this.field4633 != -1;
	}

	@ObfuscatedName("qy.n(Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method7278(Object arg0) {
		synchronized (this) {
			if (this.field4632 != -1L) {
				this.method7281();
			}
			PrioritizedCacheEntry var3 = (PrioritizedCacheEntry) this.field4628.get(arg0);
			if (var3 == null) {
				return null;
			} else {
				this.method7286(var3, false);
				return var3.field4625;
			}
		}
	}

	@ObfuscatedName("qy.m(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method7279(Object arg0, Object arg1) {
		synchronized (this) {
			if (this.field4632 != -1L) {
				this.method7281();
			}
			PrioritizedCacheEntry var4 = (PrioritizedCacheEntry) this.field4628.get(arg0);
			if (var4 != null) {
				Object var5 = var4.field4625;
				var4.field4625 = arg1;
				this.method7286(var4, false);
				return var5;
			}
			if (this.method7277() && this.field4628.size() == this.field4633) {
				PrioritizedCacheEntry var6 = (PrioritizedCacheEntry) this.field4630.remove();
				this.field4628.remove(var6.field4623);
				this.field4629.remove(var6);
			}
			PrioritizedCacheEntry var7 = new PrioritizedCacheEntry(arg1, arg0);
			this.field4628.put(arg0, var7);
			this.method7286(var7, true);
			return null;
		}
	}

	@ObfuscatedName("qy.k(Lqd;ZI)V")
	public void method7286(PrioritizedCacheEntry arg0, boolean arg1) {
		if (!arg1) {
			this.field4629.remove(arg0);
			if (this.method7277() && !this.field4630.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.field4624 = System.currentTimeMillis();
		if (this.method7277()) {
			switch(this.field4627.field4621) {
				case 0:
					arg0.field4622 = arg0.field4624;
					break;
				case 1:
					arg0.field4622++;
			}
			this.field4630.add(arg0);
		}
		this.field4629.add(arg0);
	}

	@ObfuscatedName("qy.f(I)V")
	public void method7281() {
		if (this.field4632 == -1L) {
			throw new IllegalStateException("");
		}
		long var1 = System.currentTimeMillis() - this.field4632;
		while (!this.field4629.isEmpty()) {
			PrioritizedCacheEntry var3 = (PrioritizedCacheEntry) this.field4629.peek();
			if (var3.field4624 >= var1) {
				return;
			}
			this.field4628.remove(var3.field4623);
			this.field4629.remove(var3);
			if (this.method7277()) {
				this.field4630.remove(var3);
			}
		}
	}
}
