package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amv")
public class PreferencesUnused2 extends Preference {

	public PreferencesUnused2(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused2(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amv.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue != 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amv.e(B)I")
	public int defaultValue() {
		return 2;
	}

	@ObfuscatedName("amv.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("amv.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amv.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
