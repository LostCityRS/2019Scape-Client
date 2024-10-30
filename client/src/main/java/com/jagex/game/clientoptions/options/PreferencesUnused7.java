package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ana")
public class PreferencesUnused7 extends Preference {

	public PreferencesUnused7(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused7(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ana.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ana.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("ana.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("ana.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("ana.s(S)I")
	public int getValue() {
		return this.currentValue;
	}
}
