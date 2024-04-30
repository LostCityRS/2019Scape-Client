package com.jagex.core.datastruct;

import com.jagex.game.client.HardCacheEntry;
import deob.ObfuscatedName;

@ObfuscatedName("wz")
public class IconCache {

	@ObfuscatedName("wz.e")
	public int field7612;

	@ObfuscatedName("wz.n")
	public int field7611;

	@ObfuscatedName("wz.m")
	public HashTable hashTable;

	@ObfuscatedName("wz.k")
	public SecondaryLinkedList queue = new SecondaryLinkedList();

	public IconCache(int arg0) {
		this.field7612 = arg0;
		this.field7611 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.hashTable = new HashTable(var2);
	}

	@ObfuscatedName("wz.e(Lwk;)Ljava/lang/Object;")
	public final Object get(CacheKey arg0) {
		long var2 = arg0.hash();
		for (CacheEntry var4 = (CacheEntry) this.hashTable.get(var2); var4 != null; var4 = (CacheEntry) this.hashTable.nextWithKey()) {
			if (var4.cacheKey.equal(arg0)) {
				Object var5 = var4.getValue();
				if (var5 != null) {
					if (var4.isSoft()) {
						HardCacheEntry var6 = new HardCacheEntry(arg0, var5, var4.cacheWeight);
						this.hashTable.put(var6, var4.nodeId);
						this.queue.pushBack(var6);
						var6.secondaryNodeId = 0L;
						var4.unlink();
						var4.secondaryRemove();
					} else {
						this.queue.pushBack(var4);
						var4.secondaryNodeId = 0L;
					}
					return var5;
				}
				var4.unlink();
				var4.secondaryRemove();
				this.field7611 += var4.cacheWeight;
			}
		}
		return null;
	}

	@ObfuscatedName("wz.n(Lwk;)V")
	public final void method9650(CacheKey arg0) {
		long var2 = arg0.hash();
		for (CacheEntry var4 = (CacheEntry) this.hashTable.get(var2); var4 != null; var4 = (CacheEntry) this.hashTable.nextWithKey()) {
			if (var4.cacheKey.equal(arg0)) {
				this.method9648(var4);
				break;
			}
		}
	}

	@ObfuscatedName("wz.m(Lasr;)V")
	public final void method9648(CacheEntry arg0) {
		if (arg0 != null) {
			arg0.unlink();
			arg0.secondaryRemove();
			this.field7611 += arg0.cacheWeight;
		}
	}

	@ObfuscatedName("wz.k(Ljava/lang/Object;Lwk;)V")
	public final void put(Object arg0, CacheKey arg1) {
		this.put(arg0, arg1, 1);
	}

	@ObfuscatedName("wz.f(Ljava/lang/Object;Lwk;I)V")
	public final void put(Object arg0, CacheKey arg1, int arg2) {
		if (arg2 > this.field7612) {
			throw new IllegalStateException();
		}
		this.method9650(arg1);
		this.field7611 -= arg2;
		while (this.field7611 < 0) {
			CacheEntry var4 = (CacheEntry) this.queue.pollFront();
			this.method9648(var4);
		}
		HardCacheEntry var5 = new HardCacheEntry(arg1, arg0, arg2);
		this.hashTable.put(var5, arg1.hash());
		this.queue.pushBack(var5);
		var5.secondaryNodeId = 0L;
	}

	@ObfuscatedName("wz.w(I)V")
	public final void clean(int arg0) {
		for (CacheEntry var2 = (CacheEntry) this.queue.peekFront(); var2 != null; var2 = (CacheEntry) this.queue.prev()) {
			if (var2.isSoft()) {
				if (var2.getValue() == null) {
					var2.unlink();
					var2.secondaryRemove();
					this.field7611 += var2.cacheWeight;
				}
			} else if (++var2.secondaryNodeId > (long) arg0) {
				SoftCacheEntry var3 = new SoftCacheEntry(var2.cacheKey, var2.getValue(), var2.cacheWeight);
				this.hashTable.put(var3, var2.nodeId);
				SecondaryLinkedList.method10144(var3, var2);
				var2.unlink();
				var2.secondaryRemove();
			}
		}
	}

	@ObfuscatedName("wz.l()V")
	public final void reset() {
		this.queue.removeAll();
		this.hashTable.removeAll();
		this.field7611 = this.field7612;
	}

	@ObfuscatedName("wz.u()V")
	public final void clear() {
		for (CacheEntry var1 = (CacheEntry) this.queue.peekFront(); var1 != null; var1 = (CacheEntry) this.queue.prev()) {
			if (var1.isSoft()) {
				var1.unlink();
				var1.secondaryRemove();
				this.field7611 += var1.cacheWeight;
			}
		}
	}
}
