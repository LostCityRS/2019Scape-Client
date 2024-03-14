package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ant")
public class PreferencesUnknown8 extends Preference {

	public PreferencesUnknown8(ClientOptions options) {
		super(options);
	}

	public PreferencesUnknown8(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ant.o(B)V")
	public void clampValue() {
		if (this.currentValue != 0 && this.currentValue != 1) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ant.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("ant.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("ant.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ant.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
