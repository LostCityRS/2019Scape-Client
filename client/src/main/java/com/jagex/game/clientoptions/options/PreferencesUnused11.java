package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ame")
public class PreferencesUnused11 extends Preference {

	public PreferencesUnused11(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused11(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ame.o(B)V")
	public void clampValue() {
		if (this.currentValue < 33 || this.currentValue > 200) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ame.e(B)I")
	public int defaultValue() {
		return 100;
	}

	@ObfuscatedName("ame.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("ame.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ame.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
