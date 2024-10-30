package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ame")
public class PreferencesUnused11 extends Preference {

	public PreferencesUnused11(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused11(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ame.o(B)V")
	public void clampValue() {
		if (this.currentValue < 33 || this.currentValue > 200) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ame.e(B)I")
	public int defaultValue() {
		return 100;
	}

	@ObfuscatedName("ame.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("ame.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("ame.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
