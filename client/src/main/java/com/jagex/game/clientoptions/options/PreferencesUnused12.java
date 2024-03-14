package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ann")
public class PreferencesUnused12 extends Preference {

	public PreferencesUnused12(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused12(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ann.o(B)V")
	public void clampValue() {
		if (this.currentValue < 33 || this.currentValue > 400) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ann.e(B)I")
	public int defaultValue() {
		return 100;
	}

	@ObfuscatedName("ann.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("ann.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ann.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
