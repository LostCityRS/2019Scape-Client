package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amq")
public class PreferencesUnknown3 extends PreferencesOption {

	public PreferencesUnknown3(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnknown3(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amq.o(B)V")
	public void method18455() {
		if (this.field8416 < 0 || this.field8416 > 4) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amq.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amq.s(I)Z")
	public boolean method18456() {
		return true;
	}

	@ObfuscatedName("amq.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("amq.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amq.y(I)I")
	public int method18458() {
		return this.field8416;
	}
}
