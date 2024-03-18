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
	public IterableMap field7613;

	@ObfuscatedName("wz.k")
	public DualIterableQueue field7614 = new DualIterableQueue();

	public IconCache(int arg0) {
		this.field7612 = arg0;
		this.field7611 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field7613 = new IterableMap(var2);
	}

	@ObfuscatedName("wz.e(Lwk;)Ljava/lang/Object;")
	public final Object method9646(CacheKey arg0) {
		long var2 = arg0.method9641();
		for (CacheEntry var4 = (CacheEntry) this.field7613.getNode(var2); var4 != null; var4 = (CacheEntry) this.field7613.next()) {
			if (var4.field12362.method9638(arg0)) {
				Object var5 = var4.method19487();
				if (var5 != null) {
					if (var4.method19488()) {
						HardCacheEntry var6 = new HardCacheEntry(arg0, var5, var4.field12363);
						this.field7613.pushNode(var6, var4.nodeId);
						this.field7614.pushBack(var6);
						var6.secondaryNodeId = 0L;
						var4.remove();
						var4.secondaryRemove();
					} else {
						this.field7614.pushBack(var4);
						var4.secondaryNodeId = 0L;
					}
					return var5;
				}
				var4.remove();
				var4.secondaryRemove();
				this.field7611 += var4.field12363;
			}
		}
		return null;
	}

	@ObfuscatedName("wz.n(Lwk;)V")
	public final void method9650(CacheKey arg0) {
		long var2 = arg0.method9641();
		for (CacheEntry var4 = (CacheEntry) this.field7613.getNode(var2); var4 != null; var4 = (CacheEntry) this.field7613.next()) {
			if (var4.field12362.method9638(arg0)) {
				this.method9648(var4);
				break;
			}
		}
	}

	@ObfuscatedName("wz.m(Lasr;)V")
	public final void method9648(CacheEntry arg0) {
		if (arg0 != null) {
			arg0.remove();
			arg0.secondaryRemove();
			this.field7611 += arg0.field12363;
		}
	}

	@ObfuscatedName("wz.k(Ljava/lang/Object;Lwk;)V")
	public final void method9654(Object arg0, CacheKey arg1) {
		this.method9656(arg0, arg1, 1);
	}

	@ObfuscatedName("wz.f(Ljava/lang/Object;Lwk;I)V")
	public final void method9656(Object arg0, CacheKey arg1, int arg2) {
		if (arg2 > this.field7612) {
			throw new IllegalStateException();
		}
		this.method9650(arg1);
		this.field7611 -= arg2;
		while (this.field7611 < 0) {
			CacheEntry var4 = (CacheEntry) this.field7614.pollFront();
			this.method9648(var4);
		}
		HardCacheEntry var5 = new HardCacheEntry(arg1, arg0, arg2);
		this.field7613.pushNode(var5, arg1.method9641());
		this.field7614.pushBack(var5);
		var5.secondaryNodeId = 0L;
	}

	@ObfuscatedName("wz.w(I)V")
	public final void method9651(int arg0) {
		for (CacheEntry var2 = (CacheEntry) this.field7614.peekFront(); var2 != null; var2 = (CacheEntry) this.field7614.prev()) {
			if (var2.method19488()) {
				if (var2.method19487() == null) {
					var2.remove();
					var2.secondaryRemove();
					this.field7611 += var2.field12363;
				}
			} else if (++var2.secondaryNodeId > (long) arg0) {
				SoftCacheEntry var3 = new SoftCacheEntry(var2.field12362, var2.method19487(), var2.field12363);
				this.field7613.pushNode(var3, var2.nodeId);
				DualIterableQueue.method10144(var3, var2);
				var2.remove();
				var2.secondaryRemove();
			}
		}
	}

	@ObfuscatedName("wz.l()V")
	public final void method9652() {
		this.field7614.clearAll();
		this.field7613.clear();
		this.field7611 = this.field7612;
	}

	@ObfuscatedName("wz.u()V")
	public final void method9653() {
		for (CacheEntry var1 = (CacheEntry) this.field7614.peekFront(); var1 != null; var1 = (CacheEntry) this.field7614.prev()) {
			if (var1.method19488()) {
				var1.remove();
				var1.secondaryRemove();
				this.field7611 += var1.field12363;
			}
		}
	}
}
