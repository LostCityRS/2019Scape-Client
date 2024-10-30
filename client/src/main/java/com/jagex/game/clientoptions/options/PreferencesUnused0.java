package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;

@ObfuscatedName("anu")
public class PreferencesUnused0 extends Preference {

	public PreferencesUnused0(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused0(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anu.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anu.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("anu.n(II)I")
	public int canSetValue(int arg0) {
		return Toolkit.method723(this.options.displayMode.getValue()) ? 1 : 3;
	}

	@ObfuscatedName("anu.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("anu.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
