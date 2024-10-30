package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;

@ObfuscatedName("and")
public class PreferencesBloom extends Preference {

	public PreferencesBloom(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesBloom(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("and.o(I)V")
	public void clampValue() {
		if (this.options.displayMode.method18546() && !Toolkit.method723(this.options.displayMode.getValue())) {
			this.currentValue = 0;
		}
		if (this.options.hardwareInfo().unused()) {
			if (this.currentValue < 0 || this.currentValue > 3) {
				this.currentValue = this.defaultValue();
			}
		} else if (this.currentValue < 0 || this.currentValue > 1) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("and.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("and.s(I)Z")
	public boolean canMod() {
		return Toolkit.method723(this.options.displayMode.getValue());
	}

	@ObfuscatedName("and.n(II)I")
	public int canSetValue(int arg0) {
		return Toolkit.method723(this.options.displayMode.getValue()) ? 1 : 3;
	}

	@ObfuscatedName("and.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("and.y(B)I")
	public int getValue() {
		return this.currentValue;
	}
}
