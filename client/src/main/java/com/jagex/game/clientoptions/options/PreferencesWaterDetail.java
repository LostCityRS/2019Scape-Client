package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amt")
public class PreferencesWaterDetail extends Preference {

	public PreferencesWaterDetail(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesWaterDetail(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amt.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amt.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amt.s(B)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("amt.n(II)I")
	public int canSetValue(int arg0) {
		return arg0 == 0 || this.options.groundBlending.getValue() == 1 ? 1 : 2;
	}

	@ObfuscatedName("amt.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amt.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
