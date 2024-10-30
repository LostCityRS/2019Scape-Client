package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ann")
public class PreferencesUnused12 extends Preference {

	public PreferencesUnused12(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused12(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ann.o(B)V")
	public void clampValue() {
		if (this.currentValue < 33 || this.currentValue > 400) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ann.e(B)I")
	public int defaultValue() {
		return 100;
	}

	@ObfuscatedName("ann.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("ann.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("ann.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
