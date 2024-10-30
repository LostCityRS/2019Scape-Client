package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;

@ObfuscatedName("amx")
public class PreferencesScreenSize extends Preference {

	public PreferencesScreenSize(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesScreenSize(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amx.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amx.e(B)I")
	public int defaultValue() {
		return this.options.displayMode.method18546() && Toolkit.method551(this.options.displayMode.getValue()) ? 1 : 0;
	}

	@ObfuscatedName("amx.s(B)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("amx.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("amx.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amx.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
