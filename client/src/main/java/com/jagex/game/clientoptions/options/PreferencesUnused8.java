package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amr")
public class PreferencesUnused8 extends Preference {

	public PreferencesUnused8(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused8(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amr.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amr.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("amr.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("amr.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amr.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
