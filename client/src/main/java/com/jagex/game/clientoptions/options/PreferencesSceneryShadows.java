package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amh")
public class PreferencesSceneryShadows extends Preference {

	public PreferencesSceneryShadows(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesSceneryShadows(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amh.o(S)V")
	public void clampValue() {
		if (this.options.textures.getValue() == 0) {
			this.currentValue = 0;
		}
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amh.e(B)I")
	public int defaultValue() {
		return 2;
	}

	@ObfuscatedName("amh.s(I)Z")
	public boolean canMod() {
		return this.options.textures.getValue() != 0;
	}

	@ObfuscatedName("amh.n(II)I")
	public int canSetValue(int arg0) {
		return this.options.textures.getValue() == 0 ? 3 : 1;
	}

	@ObfuscatedName("amh.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("amh.y(S)I")
	public int getValue() {
		return this.currentValue;
	}
}
