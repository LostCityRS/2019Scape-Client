package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amm")
public class PreferencesUnused3 extends Preference {

	public PreferencesUnused3(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused3(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amm.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amm.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("amm.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("amm.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amm.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
