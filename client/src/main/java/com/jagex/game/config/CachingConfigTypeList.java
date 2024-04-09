package com.jagex.game.config;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.SoftLruHashTable;
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
	public SoftLruHashTable recentUse;

	@ObfuscatedName("abe.f")
	public final ConfigTypeFactory factory;

	// line 20
	public CachingConfigTypeList(ModeGame modeGame, Language language, Js5 configClient, Js5ConfigGroup configGroup, int cacheSize, ConfigTypeFactory factory) {
		this.configClient = configClient;
		this.configGroup = configGroup;
		this.factory = factory;
		this.num = ArchiveUtil.getArchiveSize(this.configClient, this.configGroup);
		this.recentUse = new SoftLruHashTable(cacheSize);
	}

	// line 30
	@ObfuscatedName("abe.e(II)Lay;")
	public ConfigType list(int id) {
		SoftLruHashTable var2 = this.recentUse;
		ConfigType cachedConfigType;
		synchronized (this.recentUse) {
			cachedConfigType = (ConfigType) this.recentUse.get((long) id);
		}
		if (cachedConfigType != null) {
			return cachedConfigType;
		}
		ConfigType configType = this.list_uncached(id);
		SoftLruHashTable var6 = this.recentUse;
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
	public void cacheResize(int size) {
		SoftLruHashTable var2 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.reset();
			this.recentUse = new SoftLruHashTable(size);
		}
	}

	@ObfuscatedName("abe.r(I)V")
	public void cacheReset() {
		SoftLruHashTable var1 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.reset();
		}
	}

	@ObfuscatedName("abe.v(II)V")
	public void cacheClean(int num) {
		SoftLruHashTable var2 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.clean(num);
		}
	}

	@ObfuscatedName("abe.o(I)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.clear();
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
			SoftLruHashTable var2 = this.this$0.recentUse;
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
