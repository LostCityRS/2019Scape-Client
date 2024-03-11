package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ana")
public class PreferencesUnused7 extends PreferencesOption {

	public PreferencesUnused7(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused7(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ana.o(I)V")
	public void method18675() {
		if (this.field8416 < 0 || this.field8416 > 4) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ana.e(B)I")
	public int method14069() {
		return 0;
	}

	@ObfuscatedName("ana.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("ana.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ana.s(S)I")
	public int method18676() {
		return this.field8416;
	}
}
