package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ams")
public class PreferencesLightingDetail extends Preference {

	public PreferencesLightingDetail(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesLightingDetail(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ams.o(S)V")
	public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ams.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("ams.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("ams.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("ams.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
