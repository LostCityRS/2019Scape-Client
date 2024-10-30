package com.jagex.game.config;

import com.jagex.core.datastruct.SoftLruHashTable;
import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("acm")
public class CachingConfigTypeListIterator implements Iterator {

	// $FF: synthetic field
	public final CachingConfigTypeList this$0;

	@ObfuscatedName("acm.e")
	public int field8852;

	public CachingConfigTypeListIterator(CachingConfigTypeList arg0) {
		this.this$0 = arg0;
	}

	public boolean hasNext() {
		return this.field8852 < this.this$0.num;
	}

	public Object next() {
		int var1 = ++this.field8852 - 1;
		SoftLruHashTable var2 = this.this$0.recentUse;
		synchronized (this.this$0.recentUse) {
			ConfigType var3 = (ConfigType) this.this$0.recentUse.get((long) var1);
			if (var3 != null) {
				return var3;
			}
		}
		return this.this$0.list_uncached(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
