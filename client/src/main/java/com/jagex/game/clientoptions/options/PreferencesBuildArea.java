package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.BuildAreaSize;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("aml")
public class PreferencesBuildArea extends Preference {

	public PreferencesBuildArea(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesBuildArea(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aml.o(B)V")
	public void clampValue() {
		if (this.options.hardwareInfo().unused()) {
			this.currentValue = BuildAreaSize.SIZE_256.id;
			return;
		}
		int var1 = this.options.hardwareInfo().maxmemory();
		if (var1 < 245) {
			this.currentValue = BuildAreaSize.STANDARD.id;
		}
		if (BuildAreaSize.SIZE_168.id == this.currentValue && var1 < 500) {
			this.currentValue = BuildAreaSize.SIZE_136.id;
		}
		if (this.currentValue < BuildAreaSize.STANDARD.id || this.currentValue > BuildAreaSize.CONSTRUCTION.id) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("aml.e(B)I")
	public int defaultValue() {
		return this.options.hardwareInfo().unused() ? BuildAreaSize.SIZE_256.id : BuildAreaSize.STANDARD.id;
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
	public int canSetValue(int arg0) {
		if (this.options.hardwareInfo().unused()) {
			return 3;
		}
		int var2 = this.options.hardwareInfo().maxmemory();
		if (var2 < 245) {
			return 3;
		} else if (BuildAreaSize.SIZE_168.id == arg0 && var2 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("aml.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("aml.y(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
