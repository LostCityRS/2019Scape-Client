package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("eb")
public final class WeightedCache {

	@ObfuscatedName("eb.e")
	public int field1758;

	@ObfuscatedName("eb.n")
	public int field1756;

	@ObfuscatedName("eb.m")
	public IterableMap iterableMap;

	@ObfuscatedName("eb.k")
	public DualIterableQueue queue;

	@ObfuscatedName("eb.f")
	public CacheRemovalListener field1759;

	public WeightedCache(int size) {
		this(size, size);
	}

	@ObfuscatedName("eb.e(Len;B)V")
	public void setRemovalListener(CacheRemovalListener arg0) {
		this.field1759 = arg0;
	}

	public WeightedCache(int arg0, int arg1) {
		this.queue = new DualIterableQueue();
		this.field1758 = arg0;
		this.field1756 = arg0;
		int var3;
		for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
		}
		this.iterableMap = new IterableMap(var3);
	}

	@ObfuscatedName("eb.n(J)Ljava/lang/Object;")
	public Object get(long arg0) {
		WeightedWrapper var3 = (WeightedWrapper) this.iterableMap.getNode(arg0);
		if (var3 == null) {
			return null;
		}
		Object var4 = var3.method19423();
		if (var4 == null) {
			var3.remove();
			var3.secondaryRemove();
			this.field1756 += var3.field12328;
			return null;
		}
		if (var3.method19424()) {
			HardWeightedWrapper var5 = new HardWeightedWrapper(var4, var3.field12328);
			this.iterableMap.pushNode(var5, var3.nodeId);
			this.queue.pushBack(var5);
			var5.secondaryNodeId = 0L;
			var3.remove();
			var3.secondaryRemove();
		} else {
			this.queue.pushBack(var3);
			var3.secondaryNodeId = 0L;
		}
		return var4;
	}

	@ObfuscatedName("eb.m(J)V")
	public void method2957(long arg0) {
		WeightedWrapper var3 = (WeightedWrapper) this.iterableMap.getNode(arg0);
		this.method2918(var3);
	}

	@ObfuscatedName("eb.k(Lasa;I)V")
	public void method2918(WeightedWrapper arg0) {
		if (arg0 != null) {
			arg0.remove();
			arg0.secondaryRemove();
			this.field1756 += arg0.field12328;
		}
	}

	@ObfuscatedName("eb.f(Ljava/lang/Object;J)V")
	public void put(Object arg0, long arg1) {
		this.put(arg0, arg1, 1);
	}

	@ObfuscatedName("eb.w(Ljava/lang/Object;JII)V")
	public void put(Object arg0, long arg1, int arg2) {
		if (arg2 > this.field1758) {
			throw new IllegalStateException();
		}
		this.method2957(arg1);
		this.field1756 -= arg2;
		while (this.field1756 < 0) {
			WeightedWrapper var5 = (WeightedWrapper) this.queue.pollFront();
			if (var5 == null) {
				throw new RuntimeException("");
			}
			if (!var5.method19424()) {
			}
			this.method2918(var5);
			if (this.field1759 != null) {
				this.field1759.method2914(var5.method19423());
			}
		}
		HardWeightedWrapper var6 = new HardWeightedWrapper(arg0, arg2);
		this.iterableMap.pushNode(var6, arg1);
		this.queue.pushBack(var6);
		var6.secondaryNodeId = 0L;
	}

	@ObfuscatedName("eb.l(IB)V")
	public void clean(int arg0) {
		for (WeightedWrapper var2 = (WeightedWrapper) this.queue.peekFront(); var2 != null; var2 = (WeightedWrapper) this.queue.prev()) {
			if (var2.method19424()) {
				if (var2.method19423() == null) {
					var2.remove();
					var2.secondaryRemove();
					this.field1756 += var2.field12328;
				}
			} else if (++var2.secondaryNodeId > (long) arg0) {
				SoftWeightedWrapper var3 = new SoftWeightedWrapper(var2.method19423(), var2.field12328);
				this.iterableMap.pushNode(var3, var2.nodeId);
				DualIterableQueue.method10144(var3, var2);
				var2.remove();
				var2.secondaryRemove();
			}
		}
	}

	@ObfuscatedName("eb.u(B)V")
	public void reset() {
		this.queue.removeAll();
		this.iterableMap.removeAll();
		this.field1756 = this.field1758;
	}

	@ObfuscatedName("eb.z(I)I")
	public int method2925() {
		return this.field1758;
	}

	@ObfuscatedName("eb.p(B)I")
	public int method2926() {
		return this.field1756;
	}

	@ObfuscatedName("eb.d(B)I")
	public int count() {
		int var1 = 0;
		for (WeightedWrapper var2 = (WeightedWrapper) this.queue.peekFront(); var2 != null; var2 = (WeightedWrapper) this.queue.prev()) {
			if (!var2.method19424()) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("eb.c(I)V")
	public void clear() {
		for (WeightedWrapper var1 = (WeightedWrapper) this.queue.peekFront(); var1 != null; var1 = (WeightedWrapper) this.queue.prev()) {
			if (var1.method19424()) {
				var1.remove();
				var1.secondaryRemove();
				this.field1756 += var1.field12328;
			}
		}
	}

	@ObfuscatedName("eb.r(I)Ljava/lang/Object;")
	public Object method2950() {
		WeightedWrapper var1 = (WeightedWrapper) this.iterableMap.peekFront();
		while (var1 != null) {
			Object var2 = var1.method19423();
			if (var2 != null) {
				return var2;
			}
			WeightedWrapper var3 = var1;
			var1 = (WeightedWrapper) this.iterableMap.prev();
			var3.remove();
			var3.secondaryRemove();
			this.field1756 += var3.field12328;
		}
		return null;
	}

	@ObfuscatedName("eb.v(I)Ljava/lang/Object;")
	public Object method2937() {
		WeightedWrapper var1 = (WeightedWrapper) this.iterableMap.prev();
		while (var1 != null) {
			Object var2 = var1.method19423();
			if (var2 != null) {
				return var2;
			}
			WeightedWrapper var3 = var1;
			var1 = (WeightedWrapper) this.iterableMap.prev();
			var3.remove();
			var3.secondaryRemove();
			this.field1756 += var3.field12328;
		}
		return null;
	}
}
