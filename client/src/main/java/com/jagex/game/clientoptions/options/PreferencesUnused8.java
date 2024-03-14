package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amr")
public class PreferencesUnused8 extends Preference {

	public PreferencesUnused8(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused8(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amr.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amr.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("amr.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("amr.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amr.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
