package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amo")
public class PreferencesRemoveRoofs extends Preference {

	public PreferencesRemoveRoofs(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesRemoveRoofs(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amo.o(I)V")
	public void clampValue() {
		if (this.options.orthographic.getValue() == 2 && this.currentValue == 2) {
			this.currentValue = 1;
		}
		if (this.currentValue < 0 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amo.e(B)I")
	public int defaultValue() {
		return 2;
	}

	@ObfuscatedName("amo.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("amo.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amo.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
