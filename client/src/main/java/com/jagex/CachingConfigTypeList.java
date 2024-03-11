package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("abe")
public class CachingConfigTypeList implements ConfigTypeList {

	@ObfuscatedName("abe.e")
	public final Js5 field8792;

	@ObfuscatedName("abe.n")
	public final Js5ConfigGroup field8793;

	@ObfuscatedName("abe.m")
	public int field8794;

	@ObfuscatedName("abe.k")
	public WeightedCache field8795;

	@ObfuscatedName("abe.f")
	public final ConfigTypeFactory field8796;

	public CachingConfigTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5ConfigGroup arg3, int arg4, ConfigTypeFactory arg5) {
		this.field8792 = arg2;
		this.field8793 = arg3;
		this.field8796 = arg5;
		this.field8794 = ArchiveUtil.method8370(this.field8792, this.field8793);
		this.field8795 = new WeightedCache(arg4);
	}

	@ObfuscatedName("abe.e(II)Lay;")
	public ConfigType get(int arg0) {
		WeightedCache var2 = this.field8795;
		ConfigType var3;
		synchronized (this.field8795) {
			var3 = (ConfigType) this.field8795.method2930((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		ConfigType var5 = this.method14909(arg0);
		WeightedCache var6 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2921(var5, (long) arg0);
			return var5;
		}
	}

	@ObfuscatedName("abe.u(II)Lay;")
	public ConfigType method14909(int arg0) {
		Js5 var2 = this.field8792;
		byte[] var3;
		synchronized (this.field8792) {
			var3 = ArchiveUtil.method9853(this.field8792, this.field8793, arg0);
		}
		ConfigType var5 = this.field8796.create(arg0, this);
		if (var3 != null) {
			var5.decode(new Packet(var3));
		}
		var5.postDecode();
		return var5;
	}

	@ObfuscatedName("abe.n(I)I")
	public int size() {
		return this.field8794;
	}

	@ObfuscatedName("abe.z(II)V")
	public void method14910(int arg0) {
		WeightedCache var2 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2924();
			this.field8795 = new WeightedCache(arg0);
		}
	}

	@ObfuscatedName("abe.r(I)V")
	public void method14895() {
		WeightedCache var1 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2924();
		}
	}

	@ObfuscatedName("abe.v(II)V")
	public void method14896(int arg0) {
		WeightedCache var2 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2923(arg0);
		}
	}

	@ObfuscatedName("abe.o(I)V")
	public void method14899() {
		WeightedCache var1 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2928();
		}
	}

	public Iterator iterator() {
		return new CachingConfigTypeListIterator(this);
	}
}
