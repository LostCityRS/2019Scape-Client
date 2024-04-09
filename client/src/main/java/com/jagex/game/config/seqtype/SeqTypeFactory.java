package com.jagex.game.config.seqtype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.graphics.FrameSet;
import com.jagex.graphics.KeyFrameSet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("fu")
public abstract class SeqTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("fu.e")
	public final ConfigTypeList configTypeList;

	@ObfuscatedName("fu.n")
	public final SoftLruHashTable frameCache = new SoftLruHashTable(100);

	@ObfuscatedName("fu.m")
	public final SoftLruHashTable keyFrameCache = new SoftLruHashTable(100);

	public SeqTypeFactory(ConfigTypeList arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		this.configTypeList = arg0;
		FrameSet.method9393(arg1, arg3, 2);
		KeyFrameSet.method9558(arg2, arg3);
	}

	@ObfuscatedName("fu.e(IB)Larr;")
	public FrameSet method3020(int arg0) {
		SoftLruHashTable var2 = this.frameCache;
		synchronized (this.frameCache) {
			FrameSet var3 = (FrameSet) this.frameCache.get((long) arg0);
			if (var3 == null) {
				var3 = new FrameSet(arg0);
				this.frameCache.put(var3, (long) arg0);
			}
			return var3.method19410() ? var3 : null;
		}
	}

	@ObfuscatedName("fu.n(IB)Lard;")
	public KeyFrameSet method3010(int arg0) {
		SoftLruHashTable var2 = this.keyFrameCache;
		synchronized (this.keyFrameCache) {
			KeyFrameSet var3 = (KeyFrameSet) this.keyFrameCache.get((long) arg0);
			if (var3 == null) {
				var3 = new KeyFrameSet(arg0);
				this.keyFrameCache.put(var3, (long) arg0);
			}
			return var3.method19395() ? var3 : null;
		}
	}

	@ObfuscatedName("fu.m(I)V")
	public void cacheReset() {
		SoftLruHashTable var1 = this.frameCache;
		synchronized (this.frameCache) {
			this.frameCache.reset();
		}
	}

	@ObfuscatedName("fu.k(II)V")
	public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.frameCache;
		synchronized (this.frameCache) {
			this.frameCache.clean(arg0);
		}
	}

	@ObfuscatedName("fu.f(I)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.frameCache;
		synchronized (this.frameCache) {
			this.frameCache.clear();
		}
	}
}
