package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anx")
public class PreferencesUnknown6 extends Preference {

	public PreferencesUnknown6(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnknown6(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anx.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 5 || this.currentValue == 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anx.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("anx.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("anx.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("anx.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
