package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amg")
public class PreferencesBrightness extends Preference {

	public PreferencesBrightness(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesBrightness(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amg.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amg.e(B)I")
	public int defaultValue() {
		return 3;
	}

	@ObfuscatedName("amg.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("amg.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amg.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
