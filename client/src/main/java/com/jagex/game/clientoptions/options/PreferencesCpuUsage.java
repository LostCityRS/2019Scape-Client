package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ank")
public class PreferencesCpuUsage extends Preference {

	public PreferencesCpuUsage(ClientOptions options) {
		super(options);
	}

	public PreferencesCpuUsage(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ank.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ank.e(B)I")
	public int defaultValue() {
		return this.options.hardwareInfo().cpucount() > 1 ? 4 : 2;
	}

	@ObfuscatedName("ank.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("ank.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ank.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
