package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amg")
public class PreferencesBrightness extends PreferencesOption {

	public PreferencesBrightness(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesBrightness(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amg.o(I)V")
	public void method18416() {
		if (this.field8416 < 0 || this.field8416 > 4) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amg.e(B)I")
	public int method14069() {
		return 3;
	}

	@ObfuscatedName("amg.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("amg.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amg.s(B)I")
	public int method18408() {
		return this.field8416;
	}
}
