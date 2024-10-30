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

	public CachingConfigTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5ConfigGroup arg3, int arg4, ConfigTypeFactory arg5) {
		this.configClient = arg2;
		this.configGroup = arg3;
		this.factory = arg5;
		this.num = ArchiveUtil.getArchiveSize(this.configClient, this.configGroup);
		this.recentUse = new SoftLruHashTable(arg4);
	}

	@ObfuscatedName("abe.e(II)Lay;")
	public ConfigType list(int arg0) {
		SoftLruHashTable var2 = this.recentUse;
		ConfigType var3;
		synchronized (this.recentUse) {
			var3 = (ConfigType) this.recentUse.get((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		ConfigType var5 = this.list_uncached(arg0);
		SoftLruHashTable var6 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.put(var5, (long) arg0);
			return var5;
		}
	}

	@ObfuscatedName("abe.u(II)Lay;")
	public ConfigType list_uncached(int arg0) {
		Js5 var2 = this.configClient;
		byte[] var3;
		synchronized (this.configClient) {
			var3 = ArchiveUtil.getFile(this.configClient, this.configGroup, arg0);
		}
		ConfigType var5 = this.factory.create(arg0, this);
		if (var3 != null) {
			var5.decode(new Packet(var3));
		}
		var5.postDecode();
		return var5;
	}

	@ObfuscatedName("abe.n(I)I")
	public int length() {
		return this.num;
	}

	@ObfuscatedName("abe.z(II)V")
	public void cacheResize(int arg0) {
		SoftLruHashTable var2 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.reset();
			this.recentUse = new SoftLruHashTable(arg0);
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
	public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.clean(arg0);
		}
	}

	@ObfuscatedName("abe.o(I)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.recentUse;
		synchronized (this.recentUse) {
			this.recentUse.clear();
		}
	}

	public Iterator iterator() {
		return new CachingConfigTypeListIterator(this);
	}
}
