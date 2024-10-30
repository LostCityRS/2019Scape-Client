package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amb")
public class PreferencesFog extends Preference {

	public PreferencesFog(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesFog(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amb.o(I)V")
	public void clampValue() {
		if (this.currentValue != 0 && this.options.groundBlending.getValue() != 1) {
			this.currentValue = 0;
		}
		if (this.currentValue != 0 && this.options.orthographic.getValue() == 2) {
			this.currentValue = 0;
		}
		if (this.currentValue < 0 || this.currentValue > 1) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amb.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amb.s(B)Z")
	public boolean canMod() {
		return true;
	}

	@ObfuscatedName("amb.n(II)I")
	public int canSetValue(int arg0) {
		if (arg0 != 0 && this.options.orthographic.getValue() == 2) {
			return 3;
		} else if (arg0 == 0 || this.options.groundBlending.getValue() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("amb.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amb.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
