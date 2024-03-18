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
	public final Js5 configClient;

	@ObfuscatedName("abe.n")
	public final Js5ConfigGroup configGroup;

	@ObfuscatedName("abe.m")
	public int num;

	@ObfuscatedName("abe.k")
	public WeightedCache recentUse;

	@ObfuscatedName("abe.f")
	public final ConfigTypeFactory factory;

	// line 20
	public CachingConfigTypeList(ModeGame modeGame, Language language, Js5 configClient, Js5ConfigGroup configGroup, int cacheSize, ConfigTypeFactory factory) {
		this.configClient = configClient;
		this.configGroup = configGroup;
		this.factory = factory;
		this.num = ArchiveUtil.getArchiveSize(this.configClient, this.configGroup);
		this.recentUse = new WeightedCache(cacheSize);
	}

	// line 30
	@ObfuscatedName("abe.e(II)Lay;")
	public ConfigType list(int id) {
		WeightedCache var2 = this.recentUse;
		ConfigType cachedConfigType;
		synchronized (this.recentUse) {
			cachedConfigType = (ConfigType) this.recentUse.get((long) id);
		}
		if (cachedConfigType != null) {
			return cachedConfigType;
		}
		ConfigType configType = this.list_uncached(id);
		WeightedCache var6 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.put(configType, (long) id);
			return configType;
		}
	}

	@ObfuscatedName("abe.u(II)Lay;")
	public ConfigType list_uncached(int id) {
		Js5 var2 = this.configClient;
		byte[] file;
		synchronized (this.configClient) {
			file = ArchiveUtil.getFile(this.configClient, this.configGroup, id);
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
		return this.num;
	}

	@ObfuscatedName("abe.z(II)V")
	public void method14910(int arg0) {
		WeightedCache var2 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.method2924();
			this.recentUse = new WeightedCache(arg0);
		}
	}

	@ObfuscatedName("abe.r(I)V")
	public void method14895() {
		WeightedCache var1 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.method2924();
		}
	}

	@ObfuscatedName("abe.v(II)V")
	public void method14896(int arg0) {
		WeightedCache var2 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.update(arg0);
		}
	}

	@ObfuscatedName("abe.o(I)V")
	public void method14899() {
		WeightedCache var1 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.method2928();
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
			return this.field8852 < this.this$0.num;
		}

		// line 90
		public Object next() {
			int var1 = ++this.field8852 - 1;
			WeightedCache var2 = this.this$0.recentUse;
			synchronized (this.this$0.recentUse) {
				ConfigType var3 = (ConfigType) this.this$0.recentUse.get((long) var1);
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
