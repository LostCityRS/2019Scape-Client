package com.jagex.js5;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.ArchiveUtil;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;
import java.lang.reflect.Array;
import java.util.Iterator;

@ObfuscatedName("acd")
public class ConfigTypeListPreload implements ConfigTypeList {

	@ObfuscatedName("acd.e")
	public final ConfigTypeFactory factory;

	@ObfuscatedName("acd.n")
	public final Js5ConfigGroup configGroup;

	@ObfuscatedName("acd.m")
	public final Js5 configClient;

	@ObfuscatedName("acd.k")
	public int num;

	@ObfuscatedName("acd.f")
	public ConfigType field8844;

	@ObfuscatedName("acd.w")
	public ConfigType[] preloaded;

	public ConfigTypeListPreload(ModeGame arg0, Language arg1, Js5ConfigGroup arg2, Js5 arg3, ConfigTypeFactory arg4, boolean arg5) {
		this.factory = arg4;
		this.configGroup = arg2;
		this.configClient = arg3;
		this.num = ArchiveUtil.getArchiveSize(this.configClient, this.configGroup);
		this.preloaded = (ConfigType[]) Array.newInstance(this.factory.type(), this.num);
		if (arg5) {
			for (int var7 = 0; var7 < this.num; var7++) {
				this.list_uncached(var7);
			}
		}
	}

	@ObfuscatedName("acd.e(II)Lay;")
	public ConfigType list(int arg0) {
		if (arg0 < 0) {
			if (this.field8844 == null) {
				this.field8844 = this.factory.create(-1, this);
			}
			return this.field8844;
		} else {
			if (this.preloaded[arg0] == null) {
				this.list_uncached(arg0);
			}
			return this.preloaded[arg0];
		}
	}

	@ObfuscatedName("acd.u(II)V")
	public void list_uncached(int arg0) {
		if (this.preloaded[arg0] != null) {
			return;
		}
		try {
			this.preloaded[arg0] = this.factory.create(arg0, this);
		} catch (Exception var5) {
			var5.printStackTrace();
			return;
		}
		Object var3 = null;
		byte[] var4 = ArchiveUtil.getFile(this.configClient, this.configGroup, arg0);
		if (var4 != null) {
			this.preloaded[arg0].decode(new Packet(var4));
		}
		this.preloaded[arg0].postDecode();
	}

	@ObfuscatedName("acd.n(I)I")
	public int length() {
		return this.preloaded.length;
	}

	public Iterator iterator() {
		return new ConfigTypeListPreload.ConfigTypeListPreloadIterator();
	}

	@ObfuscatedName("ack")
	public class ConfigTypeListPreloadIterator implements Iterator {

		@ObfuscatedName("ack.e")
		public int field8850;

		public boolean hasNext() {
			return this.field8850 < ConfigTypeListPreload.this.preloaded.length;
		}

		public Object next() {
			return ConfigTypeListPreload.this.preloaded[++this.field8850 - 1];
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
