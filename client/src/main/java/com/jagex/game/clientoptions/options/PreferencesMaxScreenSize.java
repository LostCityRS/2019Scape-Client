package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amw")
public class PreferencesMaxScreenSize extends Preference {

	public PreferencesMaxScreenSize(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesMaxScreenSize(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amw.o(I)V")
	public void clampValue() {
		if (this.currentValue < 1 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amw.e(B)I")
	public int defaultValue() {
		return this.options.hardwareInfo().osArchArm() ? 3 : 2;
	}

	@ObfuscatedName("amw.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("amw.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amw.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
