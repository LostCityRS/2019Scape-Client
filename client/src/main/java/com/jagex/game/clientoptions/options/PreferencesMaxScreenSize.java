package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("amw")
public class PreferencesMaxScreenSize extends PreferencesOption {

	public PreferencesMaxScreenSize(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesMaxScreenSize(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amw.o(I)V")
	public void method18536() {
		if (this.field8416 < 1 || this.field8416 > 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amw.e(B)I")
	public int method14069() {
		return this.field8417.hardwareInfo().osArchArm() ? 3 : 2;
	}

	@ObfuscatedName("amw.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("amw.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amw.s(I)I")
	public int method18539() {
		return this.field8416;
	}
}
