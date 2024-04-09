package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;

@ObfuscatedName("ane")
public class PreferencesSkyboxes extends Preference {

	public PreferencesSkyboxes(ClientOptions options) {
		super(options);
	}

	public PreferencesSkyboxes(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ane.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 1) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ane.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("ane.s(I)Z")
	public boolean canMod() {
		return Toolkit.method723(this.options.displayMode.getValue());
	}

	@ObfuscatedName("ane.n(II)I")
	public int canSetValue(int value) {
		return Toolkit.method723(this.options.displayMode.getValue()) ? 1 : 3;
	}

	@ObfuscatedName("ane.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ane.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
