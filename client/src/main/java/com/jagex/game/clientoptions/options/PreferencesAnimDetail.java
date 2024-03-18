package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ang")
public class PreferencesAnimDetail extends Preference {

	public PreferencesAnimDetail(ClientOptions options) {
		super(options);
	}

	public PreferencesAnimDetail(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ang.o(I)V")
	public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ang.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("ang.s(I)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("ang.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("ang.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ang.y(S)I")
	public int getValue() {
		return this.currentValue;
	}
}
