package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amq")
public class PreferencesShadowQuality extends Preference {

	public PreferencesShadowQuality(ClientOptions options) {
		super(options);
	}

	public PreferencesShadowQuality(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amq.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amq.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amq.s(I)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("amq.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("amq.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amq.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
