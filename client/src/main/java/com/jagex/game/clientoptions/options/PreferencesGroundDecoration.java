package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.ModeGame;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amc")
public class PreferencesGroundDecoration extends Preference {

	public PreferencesGroundDecoration(ClientOptions options) {
		super(options);
	}

	public PreferencesGroundDecoration(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amc.o(S)V")
	public void clampValue() {
		if (this.options.modeGame() != ModeGame.RUNESCAPE) {
			this.currentValue = 1;
		}
		if (this.currentValue != 0 && this.currentValue != 1) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amc.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amc.s(B)Z")
	public boolean canMod() {
		return this.options.modeGame() == ModeGame.RUNESCAPE;
	}

	@ObfuscatedName("amc.n(II)I")
	public int canSetValue(int value) {
		return this.options.modeGame() == ModeGame.RUNESCAPE ? 1 : 3;
	}

	@ObfuscatedName("amc.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amc.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
