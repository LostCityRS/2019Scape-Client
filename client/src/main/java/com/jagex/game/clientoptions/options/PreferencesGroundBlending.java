package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.ModeGame;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("any")
public class PreferencesGroundBlending extends Preference {

	public PreferencesGroundBlending(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesGroundBlending(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("any.o(I)V")
	public void clampValue() {
		if (this.options.modeGame() != ModeGame.RUNESCAPE) {
			this.currentValue = 1;
		}
		if (this.currentValue != 0 && this.currentValue != 1) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("any.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("any.s(I)Z")
	public boolean canMod() {
		return this.options.modeGame() == ModeGame.RUNESCAPE;
	}

	@ObfuscatedName("any.n(II)I")
	public int canSetValue(int arg0) {
		if (this.options.modeGame() != ModeGame.RUNESCAPE) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.options.fog.getValue() == 1) {
				return 2;
			}
			if (this.options.textures.getValue() == 1) {
				return 2;
			}
			if (this.options.waterDetail.getValue() > 0) {
				return 2;
			}
		}
		return 1;
	}

	@ObfuscatedName("any.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("any.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
