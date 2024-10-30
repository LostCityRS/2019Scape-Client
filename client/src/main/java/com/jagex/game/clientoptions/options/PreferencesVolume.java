package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anl")
public class PreferencesVolume extends Preference {

	public PreferencesVolume(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesVolume(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anl.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 255) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anl.e(B)I")
	public int defaultValue() {
		return 127;
	}

	@ObfuscatedName("anl.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("anl.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("anl.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
