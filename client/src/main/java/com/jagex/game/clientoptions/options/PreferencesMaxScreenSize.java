package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amw")
public class PreferencesMaxScreenSize extends Preference {

	public PreferencesMaxScreenSize(ClientOptions options) {
		super(options);
	}

	public PreferencesMaxScreenSize(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amw.o(I)V")
	public void clampValue() {
		if (this.currentValue < 1 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amw.e(B)I")
	public int defaultValue() {
		return this.options.hardwareInfo().osArchArm() ? 3 : 2;
	}

	@ObfuscatedName("amw.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("amw.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amw.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
