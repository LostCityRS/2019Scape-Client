package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ami")
public class PreferencesUnused6 extends Preference {

	public PreferencesUnused6(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused6(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ami.o(I)V")
	public void clampValue() {
		if (!this.options.hardwareInfo().unused()) {
			this.currentValue = this.defaultValue();
		} else if (this.currentValue < -1 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ami.e(B)I")
	public int defaultValue() {
		return this.options.hardwareInfo().unused() ? 0 : 1;
	}

	@ObfuscatedName("ami.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("ami.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ami.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
