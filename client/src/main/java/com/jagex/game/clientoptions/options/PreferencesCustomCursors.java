package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ans")
public class PreferencesCustomCursors extends Preference {

	public PreferencesCustomCursors(ClientOptions options) {
		super(options);
	}

	public PreferencesCustomCursors(int value, ClientOptions options) {
		super(options);
	}

	@ObfuscatedName("ans.o(I)V")
	public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ans.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("ans.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("ans.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ans.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
