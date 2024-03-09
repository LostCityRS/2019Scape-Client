package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amk")
public class PreferencesUnused10 extends PreferencesOption {

	public PreferencesUnused10(Preferences arg0) {
		super(arg0);
	}

	public PreferencesUnused10(int arg0, Preferences arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amk.o(I)V")
	public void method18480() {
		this.field8416 = Math.min(Math.max(this.field8416, 5), 300);
	}

	@ObfuscatedName("amk.e(B)I")
	public int method14069() {
		return 30;
	}

	@ObfuscatedName("amk.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("amk.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amk.s(I)I")
	public int method18482() {
		return this.field8416;
	}
}
