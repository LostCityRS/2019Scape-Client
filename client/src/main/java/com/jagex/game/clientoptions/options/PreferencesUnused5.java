package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amp")
public class PreferencesUnused5 extends Preference {

	public PreferencesUnused5(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused5(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amp.o(S)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amp.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amp.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("amp.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amp.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
