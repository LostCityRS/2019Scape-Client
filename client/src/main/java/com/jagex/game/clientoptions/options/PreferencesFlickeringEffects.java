package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amy")
public class PreferencesFlickeringEffects extends Preference {

	public PreferencesFlickeringEffects(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesFlickeringEffects(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amy.o(I)V")
	public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amy.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amy.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("amy.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amy.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
