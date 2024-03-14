package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anj")
public class PreferencesStereo extends Preference {

	public PreferencesStereo(ClientOptions options) {
		super(options);
	}

	public PreferencesStereo(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anj.o(B)V")
	public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anj.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("anj.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("anj.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anj.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
