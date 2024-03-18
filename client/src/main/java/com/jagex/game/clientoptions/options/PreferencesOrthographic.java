package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amz")
public class PreferencesOrthographic extends Preference {

	public PreferencesOrthographic(int value, ClientOptions options) {
		super(value, options);
	}

	public PreferencesOrthographic(ClientOptions options) {
		super(options);
	}

	@ObfuscatedName("amz.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amz.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("amz.s(S)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("amz.n(II)I")
	public int canSetValue(int value) {
		return value == 2 ? 2 : 1;
	}

	@ObfuscatedName("amz.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amz.y(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
