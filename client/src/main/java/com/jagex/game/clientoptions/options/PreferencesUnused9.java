package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anf")
public class PreferencesUnused9 extends Preference {

	public PreferencesUnused9(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused9(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anf.o(I)V")
	public void clampValue() {
		this.currentValue = Math.min(Math.max(this.currentValue, 5), 300);
	}

	@ObfuscatedName("anf.e(B)I")
	public int defaultValue() {
		return 70;
	}

	@ObfuscatedName("anf.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("anf.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anf.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
