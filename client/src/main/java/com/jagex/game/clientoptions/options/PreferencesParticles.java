package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.particles.ParticleSystemRenderer;
import deob.ObfuscatedName;

@ObfuscatedName("amf")
public class PreferencesParticles extends Preference {

	public PreferencesParticles(ClientOptions options) {
		super(options);
		ParticleSystemRenderer.method4293(this.currentValue);
	}

	public PreferencesParticles(int value, ClientOptions options) {
		super(value, options);
		ParticleSystemRenderer.method4293(this.currentValue);
	}

	@ObfuscatedName("amf.o(I)V")
	public void clampValue() {
		if (this.options.hardwareInfo().maxmemory() < 245) {
			this.currentValue = 0;
		}
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("amf.e(B)I")
	public int defaultValue() {
		return this.options.hardwareInfo().maxmemory() < 245 ? 0 : 2;
	}

	@ObfuscatedName("amf.s(S)Z")
	public boolean canMod() {
		return this.options.hardwareInfo().maxmemory() >= 245;
	}

	@ObfuscatedName("amf.n(II)I")
	public int canSetValue(int value) {
		return this.options.hardwareInfo().maxmemory() < 245 ? 3 : 1;
	}

	@ObfuscatedName("amf.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
		ParticleSystemRenderer.method4293(this.currentValue);
	}

	@ObfuscatedName("amf.y(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
