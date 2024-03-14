package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amp")
public class PreferencesUnused5 extends Preference {

	public PreferencesUnused5(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused5(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amp.o(S)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amp.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amp.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("amp.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amp.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
