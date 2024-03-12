package com.jagex.js5;

import com.jagex.core.utils.ArchiveUtil;
import com.jagex.core.io.Packet;
import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
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
	public final ConfigTypeFactory field8846;

	@ObfuscatedName("acd.n")
	public final Js5ConfigGroup field8845;

	@ObfuscatedName("acd.m")
	public final Js5 field8847;

	@ObfuscatedName("acd.k")
	public int field8848;

	@ObfuscatedName("acd.f")
	public ConfigType field8844;

	@ObfuscatedName("acd.w")
	public ConfigType[] field8849;

	public ConfigTypeListPreload(ModeGame arg0, Language arg1, Js5ConfigGroup arg2, Js5 arg3, ConfigTypeFactory arg4, boolean arg5) {
		this.field8846 = arg4;
		this.field8845 = arg2;
		this.field8847 = arg3;
		this.field8848 = ArchiveUtil.method8370(this.field8847, this.field8845);
		this.field8849 = (ConfigType[]) Array.newInstance(this.field8846.type(), this.field8848);
		if (arg5) {
			for (int var7 = 0; var7 < this.field8848; var7++) {
				this.method14936(var7);
			}
		}
	}

	@ObfuscatedName("acd.e(II)Lay;")
	public ConfigType list(int arg0) {
		if (arg0 < 0) {
			if (this.field8844 == null) {
				this.field8844 = this.field8846.create(-1, this);
			}
			return this.field8844;
		} else {
			if (this.field8849[arg0] == null) {
				this.method14936(arg0);
			}
			return this.field8849[arg0];
		}
	}

	@ObfuscatedName("acd.u(II)V")
	public void method14936(int arg0) {
		if (this.field8849[arg0] != null) {
			return;
		}
		try {
			this.field8849[arg0] = this.field8846.create(arg0, this);
		} catch (Exception var5) {
			var5.printStackTrace();
			return;
		}
		Object var3 = null;
		byte[] var4 = ArchiveUtil.method9853(this.field8847, this.field8845, arg0);
		if (var4 != null) {
			this.field8849[arg0].decode(new Packet(var4));
		}
		this.field8849[arg0].postDecode();
	}

	// line 59
	@ObfuscatedName("acd.n(I)I")
	public int length() {
		return this.field8849.length;
	}

	// line 63
	public Iterator iterator() {
		return new ConfigTypeListPreloadIterator(this);
	}

	@ObfuscatedName("ack")
	public static class ConfigTypeListPreloadIterator implements Iterator {

		// $FF: synthetic field
		public final ConfigTypeListPreload this$0;

		@ObfuscatedName("ack.e")
		public int field8850;

		// line 63
		public ConfigTypeListPreloadIterator(ConfigTypeListPreload arg0) {
			this.this$0 = arg0;
		}

		public boolean hasNext() {
			return this.field8850 < this.this$0.field8849.length;
		}

		public Object next() {
			return this.this$0.field8849[++this.field8850 - 1];
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
