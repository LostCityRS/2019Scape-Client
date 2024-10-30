package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anf")
public class PreferencesUnused9 extends Preference {

	public PreferencesUnused9(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused9(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anf.o(I)V")
	public void clampValue() {
		this.currentValue = Math.min(Math.max(this.currentValue, 5), 300);
	}

	@ObfuscatedName("anf.e(B)I")
	public int defaultValue() {
		return 70;
	}

	@ObfuscatedName("anf.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("anf.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("anf.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
