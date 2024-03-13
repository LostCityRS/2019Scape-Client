package com.jagex.game.config;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.WeightedCache;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.ArchiveUtil;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("abe")
public class CachingConfigTypeList implements ConfigTypeList {

	@ObfuscatedName("abe.e")
	public final Js5 js5;

	@ObfuscatedName("abe.n")
	public final Js5ConfigGroup group;

	@ObfuscatedName("abe.m")
	public int length;

	@ObfuscatedName("abe.k")
	public WeightedCache cache;

	@ObfuscatedName("abe.f")
	public final ConfigTypeFactory factory;

	// line 20
	public CachingConfigTypeList(ModeGame arg0, Language arg1, Js5 js5, Js5ConfigGroup group, int cacheSize, ConfigTypeFactory factory) {
		this.js5 = js5;
		this.group = group;
		this.factory = factory;
		this.length = ArchiveUtil.getArchiveSize(this.js5, this.group);
		this.cache = new WeightedCache(cacheSize);
	}

	// line 30
	@ObfuscatedName("abe.e(II)Lay;")
	public ConfigType list(int id) {
		WeightedCache var2 = this.cache;
		ConfigType cachedConfigType;
		synchronized (this.cache) {
			cachedConfigType = (ConfigType) this.cache.method2930((long) id);
		}
		if (cachedConfigType != null) {
			return cachedConfigType;
		}
		ConfigType configType = this.list_uncached(id);
		WeightedCache var6 = this.cache;
		synchronized (this.cache) {
			this.cache.method2921(configType, (long) id);
			return configType;
		}
	}

	@ObfuscatedName("abe.u(II)Lay;")
	public ConfigType list_uncached(int id) {
		Js5 var2 = this.js5;
		byte[] file;
		synchronized (this.js5) {
			file = ArchiveUtil.getFile(this.js5, this.group, id);
		}
		ConfigType type = this.factory.create(id, this);
		if (file != null) {
			type.decode(new Packet(file));
		}
		type.postDecode();
		return type;
	}

	@ObfuscatedName("abe.n(I)I")
	public int length() {
		return this.length;
	}

	@ObfuscatedName("abe.z(II)V")
	public void method14910(int arg0) {
		WeightedCache var2 = this.cache;
		synchronized (this.cache) {
			this.cache.method2924();
			this.cache = new WeightedCache(arg0);
		}
	}

	@ObfuscatedName("abe.r(I)V")
	public void method14895() {
		WeightedCache var1 = this.cache;
		synchronized (this.cache) {
			this.cache.method2924();
		}
	}

	@ObfuscatedName("abe.v(II)V")
	public void method14896(int arg0) {
		WeightedCache var2 = this.cache;
		synchronized (this.cache) {
			this.cache.method2923(arg0);
		}
	}

	@ObfuscatedName("abe.o(I)V")
	public void method14899() {
		WeightedCache var1 = this.cache;
		synchronized (this.cache) {
			this.cache.method2928();
		}
	}

	// line 82
	public Iterator iterator() {
		return new CachingConfigTypeListIterator(this);
	}

	@ObfuscatedName("acm")
	public static class CachingConfigTypeListIterator implements Iterator {

		// $FF: synthetic field
		public final CachingConfigTypeList this$0;

		@ObfuscatedName("acm.e")
		public int field8852;

		public CachingConfigTypeListIterator(CachingConfigTypeList arg0) {
			this.this$0 = arg0;
		}

		public boolean hasNext() {
			return this.field8852 < this.this$0.length;
		}

		// line 90
		public Object next() {
			int var1 = ++this.field8852 - 1;
			WeightedCache var2 = this.this$0.cache;
			synchronized (this.this$0.cache) {
				ConfigType var3 = (ConfigType) this.this$0.cache.method2930((long) var1);
				if (var3 != null) {
					return var3;
				}
			}
			return this.this$0.list_uncached(var1);
		}

		// line 99
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
