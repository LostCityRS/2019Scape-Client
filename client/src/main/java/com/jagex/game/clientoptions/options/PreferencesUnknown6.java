package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anx")
public class PreferencesUnknown6 extends Preference {

	public PreferencesUnknown6(ClientOptions options) {
		super(options);
	}

	public PreferencesUnknown6(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anx.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 5 || this.currentValue == 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anx.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("anx.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("anx.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anx.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
