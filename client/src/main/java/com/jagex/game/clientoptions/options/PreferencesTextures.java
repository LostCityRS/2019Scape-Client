package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.ModeGame;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amn")
public class PreferencesTextures extends Preference {

	public PreferencesTextures(ClientOptions options) {
		super(options);
	}

	public PreferencesTextures(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("amn.o(B)V")
	public void clampValue() {
		if (this.options.modeGame() != ModeGame.RUNESCAPE) {
			this.currentValue = 1;
		}
		if (this.options.hardwareInfo().unused()) {
			if (this.currentValue < 0 || this.currentValue > 2) {
				this.currentValue = this.defaultValue();
			}
		} else if (this.currentValue != 0 && this.currentValue != 1) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amn.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("amn.s(B)Z")
	public boolean canMod() {
		return this.options.modeGame() == ModeGame.RUNESCAPE;
	}

	@ObfuscatedName("amn.n(II)I")
	public int canSetValue(int value) {
		if (this.options.modeGame() == ModeGame.RUNESCAPE) {
			return value == 0 || this.options.groundBlending.getValue() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@ObfuscatedName("amn.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("amn.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
