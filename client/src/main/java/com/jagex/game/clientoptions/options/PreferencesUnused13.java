package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anh")
public class PreferencesUnused13 extends Preference {

	public PreferencesUnused13(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused13(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anh.o(I)V")
	public void clampValue() {
		if (this.currentValue < -3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anh.e(B)I")
	public int defaultValue() {
		return -2;
	}

	@ObfuscatedName("anh.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("anh.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anh.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
