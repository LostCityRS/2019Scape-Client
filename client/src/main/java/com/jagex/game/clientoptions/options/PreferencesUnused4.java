package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.AmbientOcclusionValue;
import deob.ObfuscatedName;

@ObfuscatedName("ama")
public class PreferencesUnused4 extends Preference {

	public PreferencesUnused4(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused4(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
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
	public int canSetValue(int arg0) {
		return 3;
	}

	@ObfuscatedName("ama.k(II)V")
	public void setValue(int arg0) {
		this.currentValue = arg0;
	}

	@ObfuscatedName("ama.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
