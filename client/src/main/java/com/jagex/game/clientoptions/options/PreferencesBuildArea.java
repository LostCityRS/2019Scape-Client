package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.BuildAreaSize;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("aml")
public class PreferencesBuildArea extends Preference {

	public PreferencesBuildArea(ClientOptions options) {
		super(options);
	}

	public PreferencesBuildArea(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("aml.o(B)V")
	public void clampValue() {
		if (this.options.hardwareInfo().unused()) {
			this.currentValue = BuildAreaSize.SIZE_256.id;
			return;
		}
		int var1 = this.options.hardwareInfo().maxmemory();
		if (var1 < 245) {
			this.currentValue = BuildAreaSize.SIZE_104.id;
		}
		if (BuildAreaSize.SIZE_168.id == this.currentValue && var1 < 500) {
			this.currentValue = BuildAreaSize.SIZE_136.id;
		}
		if (this.currentValue < BuildAreaSize.SIZE_104.id || this.currentValue > BuildAreaSize.SIZE_72.id) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("aml.e(B)I")
	public int defaultValue() {
		return this.options.hardwareInfo().unused() ? BuildAreaSize.SIZE_256.id : BuildAreaSize.SIZE_104.id;
	}

	@ObfuscatedName("aml.s(I)Z")
	public boolean canMod() {
		if (this.options.hardwareInfo().unused()) {
			return false;
		} else {
			int var1 = this.options.hardwareInfo().maxmemory();
			return var1 >= 245;
		}
	}

	@ObfuscatedName("aml.n(II)I")
	public int canSetValue(int value) {
		if (this.options.hardwareInfo().unused()) {
			return 3;
		}
		int maxmemory = this.options.hardwareInfo().maxmemory();
		if (maxmemory < 245) {
			return 3;
		} else if (BuildAreaSize.SIZE_168.id == value && maxmemory < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("aml.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("aml.y(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
