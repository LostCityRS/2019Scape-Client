package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amv")
public class PreferencesUnused2 extends Preference {

	public PreferencesUnused2(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused2(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amv.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue != 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amv.e(B)I")
	public int defaultValue() {
		return 2;
	}

	@ObfuscatedName("amv.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("amv.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amv.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
