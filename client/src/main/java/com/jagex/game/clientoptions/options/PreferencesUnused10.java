package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amk")
public class PreferencesUnused10 extends Preference {

	public PreferencesUnused10(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused10(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amk.o(I)V")
	public void clampValue() {
		this.currentValue = Math.min(Math.max(this.currentValue, 5), 300);
	}

	@ObfuscatedName("amk.e(B)I")
	public int defaultValue() {
		return 30;
	}

	@ObfuscatedName("amk.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("amk.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amk.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
