package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.Renderer;
import deob.ObfuscatedName;

@ObfuscatedName("anq")
public class PreferencesAntiAliasing extends Preference {

	public PreferencesAntiAliasing(ClientOptions options) {
		super(options);
	}

	public PreferencesAntiAliasing(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("anq.o(B)V")
	public void clampValue() {
		if (this.options.displayMode2.method18546() && !Renderer.method723(this.options.displayMode2.getValue())) {
			this.currentValue = 0;
		}
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("anq.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("anq.s(I)Z")
	public boolean method18638() {
		return Renderer.method723(this.options.displayMode2.getValue());
	}

	@ObfuscatedName("anq.n(II)I")
	public int canSetValue(int value) {
		return Renderer.method723(this.options.displayMode2.getValue()) ? 1 : 3;
	}

	@ObfuscatedName("anq.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("anq.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
