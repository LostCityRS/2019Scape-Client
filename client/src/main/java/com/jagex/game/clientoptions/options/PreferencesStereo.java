package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anj")
public class PreferencesStereo extends Preference {

	public PreferencesStereo(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesStereo(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anj.o(B)V")
	public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anj.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("anj.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("anj.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("anj.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
