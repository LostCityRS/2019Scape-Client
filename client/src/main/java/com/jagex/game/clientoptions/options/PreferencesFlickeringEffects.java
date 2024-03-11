package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amy")
public class PreferencesFlickeringEffects extends PreferencesOption {

	public PreferencesFlickeringEffects(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesFlickeringEffects(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amy.o(I)V")
	public void method18418() {
		if (this.field8416 != 1 && this.field8416 != 0) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amy.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amy.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("amy.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amy.s(I)I")
	public int method18419() {
		return this.field8416;
	}
}
