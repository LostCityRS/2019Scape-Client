package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anp")
public class PreferencesLoadingScreen extends Preference {

	public PreferencesLoadingScreen(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesLoadingScreen(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anp.o(I)V")
	public void clampValue() {
	}

	@ObfuscatedName("anp.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("anp.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("anp.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("anp.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
