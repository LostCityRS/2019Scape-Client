package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amj")
public class PreferencesUnused1 extends PreferencesOption {

	public PreferencesUnused1(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused1(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amj.o(B)V")
	public void method18600() {
		if (this.field8416 < 0 || this.field8416 > 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amj.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amj.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("amj.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amj.s(B)I")
	public int method18601() {
		return this.field8416;
	}
}
