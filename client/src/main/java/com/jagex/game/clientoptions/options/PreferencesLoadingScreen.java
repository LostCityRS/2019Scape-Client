package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anp")
public class PreferencesLoadingScreen extends Preference {

	public PreferencesLoadingScreen(ClientOptions options) {
		super(options);
	}

	public PreferencesLoadingScreen(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anp.o(I)V")
	public void clampValue() {
	}

	@ObfuscatedName("anp.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("anp.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("anp.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anp.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
