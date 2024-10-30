package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amq")
public class PreferencesShadowQuality extends Preference {

	public PreferencesShadowQuality(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesShadowQuality(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amq.o(B)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amq.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amq.s(I)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("amq.n(II)I")
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("amq.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amq.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
