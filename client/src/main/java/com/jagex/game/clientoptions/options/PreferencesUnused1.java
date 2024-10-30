package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amj")
public class PreferencesUnused1 extends Preference {

	public PreferencesUnused1(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused1(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amj.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 1) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amj.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amj.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("amj.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amj.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
