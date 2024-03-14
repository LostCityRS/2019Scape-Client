package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anl")
public class PreferencesVolume extends Preference {

	public PreferencesVolume(ClientOptions options) {
		super(options);
	}

	public PreferencesVolume(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anl.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 255) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anl.e(B)I")
	public int defaultValue() {
		return 127;
	}

	@ObfuscatedName("anl.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("anl.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anl.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
