package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.ModeGame;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anm")
public class PreferencesIdleAnimations extends Preference {

	public PreferencesIdleAnimations(ClientOptions options) {
		super(options);
	}

	public PreferencesIdleAnimations(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anm.o(I)V")
	public void clampValue() {
		if (this.options.modeGame() == ModeGame.STELLARDAWN) {
			this.currentValue = 2;
		}
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anm.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("anm.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("anm.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anm.s(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
