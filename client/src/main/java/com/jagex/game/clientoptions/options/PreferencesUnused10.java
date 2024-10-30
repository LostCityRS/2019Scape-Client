package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amk")
public class PreferencesUnused10 extends Preference {

	public PreferencesUnused10(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused10(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amk.o(I)V")
	public void clampValue() {
		this.currentValue = Math.min(Math.max(this.currentValue, 5), 300);
	}

	@ObfuscatedName("amk.e(B)I")
	public int defaultValue() {
		return 30;
	}

	@ObfuscatedName("amk.n(II)I")
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("amk.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amk.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
