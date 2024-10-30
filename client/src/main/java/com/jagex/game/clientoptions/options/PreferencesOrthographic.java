package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amz")
public class PreferencesOrthographic extends Preference {

	public PreferencesOrthographic(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	public PreferencesOrthographic(ClientOptions arg0) {
		super(arg0);
	}

	@ObfuscatedName("amz.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amz.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("amz.s(S)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("amz.n(II)I")
	public int canSetValue(int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@ObfuscatedName("amz.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amz.y(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
