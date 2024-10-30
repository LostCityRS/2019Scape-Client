package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.ModeGame;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amc")
public class PreferencesGroundDecoration extends Preference {

	public PreferencesGroundDecoration(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesGroundDecoration(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
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
	public int canSetValue(int arg0) {
		return this.options.modeGame() == ModeGame.RUNESCAPE ? 1 : 3;
	}

	@ObfuscatedName("amc.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amc.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
