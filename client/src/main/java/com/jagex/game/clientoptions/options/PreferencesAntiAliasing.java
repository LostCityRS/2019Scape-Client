package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;

@ObfuscatedName("anq")
public class PreferencesAntiAliasing extends Preference {

	public PreferencesAntiAliasing(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesAntiAliasing(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anq.o(B)V")
	public void clampValue() {
		if (this.options.displayMode.method18546() && !Toolkit.method723(this.options.displayMode.getValue())) {
			this.currentValue = 0;
		}
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anq.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("anq.s(I)Z")
	public boolean canMod() {
		return Toolkit.method723(this.options.displayMode.getValue());
	}

	@ObfuscatedName("anq.n(II)I")
	public int canSetValue(int arg0) {
		return Toolkit.method723(this.options.displayMode.getValue()) ? 1 : 3;
	}

	@ObfuscatedName("anq.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("anq.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
