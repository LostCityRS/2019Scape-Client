package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ann")
public class PreferencesUnused12 extends PreferencesOption {

	public PreferencesUnused12(Preferences arg0) {
		super(arg0);
	}

	public PreferencesUnused12(int arg0, Preferences arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ann.o(B)V")
	public void method18622() {
		if (this.field8416 < 33 || this.field8416 > 400) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ann.e(B)I")
	public int method14069() {
		return 100;
	}

	@ObfuscatedName("ann.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("ann.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ann.s(I)I")
	public int method18621() {
		return this.field8416;
	}
}
