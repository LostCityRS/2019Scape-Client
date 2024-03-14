package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.AmbientOcclusionValue;
import deob.ObfuscatedName;

@ObfuscatedName("ama")
public class PreferencesUnused4 extends Preference {

	public PreferencesUnused4(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused4(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ama.o(I)V")
	public void clampValue() {
		if (this.currentValue < AmbientOcclusionValue.field2680.getId() || this.currentValue > AmbientOcclusionValue.field2679.getId()) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ama.e(B)I")
	public int defaultValue() {
		return AmbientOcclusionValue.field2680.getId();
	}

	@ObfuscatedName("ama.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("ama.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ama.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
