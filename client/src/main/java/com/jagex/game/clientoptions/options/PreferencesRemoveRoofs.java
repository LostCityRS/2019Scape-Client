package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amo")
public class PreferencesRemoveRoofs extends Preference {

	public PreferencesRemoveRoofs(ClientOptions options) {
		super(options);
	}

	public PreferencesRemoveRoofs(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amo.o(I)V")
	public void clampValue() {
		if (this.options.orthographic.getValue() == 2 && this.currentValue == 2) {
			this.currentValue = 1;
		}
		if (this.currentValue < 0 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amo.e(B)I")
	public int defaultValue() {
		return 2;
	}

	@ObfuscatedName("amo.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("amo.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amo.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
