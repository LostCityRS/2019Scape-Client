package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amn")
public class PreferencesTextures extends PreferencesOption {

	public PreferencesTextures(Preferences arg0) {
		super(arg0);
	}

	public PreferencesTextures(int arg0, Preferences arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amn.o(B)V")
	public void method18423() {
		if (this.field8417.method18159() != ModeGame.RUNESCAPE) {
			this.field8416 = 1;
		}
		if (this.field8417.method18165().method14090()) {
			if (this.field8416 < 0 || this.field8416 > 2) {
				this.field8416 = this.method14069();
			}
		} else if (this.field8416 != 0 && this.field8416 != 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amn.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amn.s(B)Z")
	public boolean method18425() {
		return this.field8417.method18159() == ModeGame.RUNESCAPE;
	}

	@ObfuscatedName("amn.n(II)I")
	public int method14070(int arg0) {
		if (this.field8417.method18159() == ModeGame.RUNESCAPE) {
			return arg0 == 0 || this.field8417.groundBlending.method18651() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@ObfuscatedName("amn.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amn.y(I)I")
	public int method18426() {
		return this.field8416;
	}
}
