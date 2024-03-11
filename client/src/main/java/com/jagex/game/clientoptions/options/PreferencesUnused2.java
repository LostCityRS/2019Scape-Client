package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amv")
public class PreferencesUnused2 extends PreferencesOption {

	public PreferencesUnused2(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused2(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amv.o(B)V")
	public void method18532() {
		if (this.field8416 < 0 || this.field8416 != 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amv.e(B)I")
	public int method14069() {
		return 2;
	}

	@ObfuscatedName("amv.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("amv.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amv.s(I)I")
	public int method18533() {
		return this.field8416;
	}
}
