package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amy")
public class PreferencesFlickeringEffects extends Preference {

	public PreferencesFlickeringEffects(ClientOptions options) {
		super(options);
	}

	public PreferencesFlickeringEffects(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amy.o(I)V")
	public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amy.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amy.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("amy.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amy.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
