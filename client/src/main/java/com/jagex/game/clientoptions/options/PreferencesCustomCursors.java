package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ans")
public class PreferencesCustomCursors extends Preference {

	public PreferencesCustomCursors(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesCustomCursors(int arg0, ClientOptions arg1) {
		super(arg1);
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
	public int canSetValue(int arg0) {
		return 1;
	}

	@ObfuscatedName("ans.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("ans.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
