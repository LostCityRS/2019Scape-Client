package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amm")
public class PreferencesUnused3 extends Preference {

	public PreferencesUnused3(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused3(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amm.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amm.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("amm.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("amm.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amm.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
