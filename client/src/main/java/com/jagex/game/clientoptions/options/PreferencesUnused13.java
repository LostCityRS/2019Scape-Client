package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anh")
public class PreferencesUnused13 extends Preference {

	public PreferencesUnused13(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused13(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anh.o(I)V")
	public void clampValue() {
		if (this.currentValue < -3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anh.e(B)I")
	public int defaultValue() {
		return -2;
	}

	@ObfuscatedName("anh.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("anh.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("anh.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
