package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("anr")
public class PreferencesPreset extends PreferencesOption {

	public PreferencesPreset(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesPreset(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anr.o(I)V")
	public void method18720() {
		if (this.field8416 < 0 || this.field8416 > 4) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anr.e(B)I")
	public int method14069() {
		return 0;
	}

	@ObfuscatedName("anr.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("anr.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anr.s(I)I")
	public int method18721() {
		return this.field8416;
	}
}
