package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anz")
public class PreferencesUnknown7 extends Preference {

	public PreferencesUnknown7(ClientOptions options) {
		super(options);
	}

	public PreferencesUnknown7(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anz.o(I)V")
	public void clampValue() {
		int var1 = this.options.toolkit.getValue();
		if (var1 != 3 && var1 != 5) {
			this.currentValue = 0;
		}
		if (this.options.hardwareInfo().cpucount() < 2) {
			this.currentValue = 0;
		}
		if (this.currentValue != 0 && this.currentValue != 1) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anz.e(B)I")
	public int defaultValue() {
		int var1 = this.options.toolkit.getValue();
		return var1 == 3 || var1 == 5 ? 0 : 0;
	}

	@ObfuscatedName("anz.n(II)I")
	public int canSetValue(int value) {
		if (value == 0) {
			return 1;
		} else if (this.options.hardwareInfo().cpucount() < 2) {
			return 3;
		} else {
			int var2 = this.options.toolkit.getValue();
			return var2 == 3 || var2 == 5 ? 1 : 3;
		}
	}

	@ObfuscatedName("anz.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anz.s(S)I")
	public int getValue() {
		return this.currentValue;
	}
}
