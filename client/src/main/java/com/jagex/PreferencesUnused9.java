package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anf")
public class PreferencesUnused9 extends PreferencesOption {

	public PreferencesUnused9(Preferences arg0) {
		super(arg0);
	}

	public PreferencesUnused9(int arg0, Preferences arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anf.o(I)V")
	public void method18631() {
		this.field8416 = Math.min(Math.max(this.field8416, 5), 300);
	}

	@ObfuscatedName("anf.e(B)I")
	public int method14069() {
		return 70;
	}

	@ObfuscatedName("anf.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("anf.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anf.s(I)I")
	public int method18633() {
		return this.field8416;
	}
}
