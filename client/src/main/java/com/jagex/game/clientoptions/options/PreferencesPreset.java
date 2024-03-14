package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anr")
public class PreferencesPreset extends Preference {

	public PreferencesPreset(ClientOptions options) {
		super(options);
	}

	public PreferencesPreset(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anr.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anr.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("anr.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("anr.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anr.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
