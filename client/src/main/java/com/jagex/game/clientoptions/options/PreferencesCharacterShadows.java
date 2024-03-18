package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amu")
public class PreferencesCharacterShadows extends Preference {

	public PreferencesCharacterShadows(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesCharacterShadows(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amu.o(I)V")
	public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amu.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amu.s(I)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("amu.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("amu.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amu.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
