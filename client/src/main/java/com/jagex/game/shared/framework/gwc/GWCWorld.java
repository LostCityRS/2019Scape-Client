package com.jagex.game.shared.framework.gwc;

import deob.ObfuscatedName;

@ObfuscatedName("alc")
public class GWCWorld extends GWCBasicWorld {

	@ObfuscatedName("alc.u")
	public int field11705;

	@ObfuscatedName("alc.z")
	public String field11703;

	@ObfuscatedName("alc.p")
	public String field11704;

	@ObfuscatedName("alc.d")
	public int field11707 = -1;

	@ObfuscatedName("alc.c")
	public int field11702;

	@ObfuscatedName("alc.r")
	public String field11706;

	@ObfuscatedName("alc.c(I)Lwv;")
	public GWCLocation method18342() {
		return GWC.field7647[this.field7640];
	}

	@ObfuscatedName("alc.r(I)I")
	public int method18330() {
		return this.field11702 == 0 ? this.method18342().field7634 : this.field11702;
	}

	@ObfuscatedName("alc.v(B)Ljava/lang/String;")
	public String method18336() {
		return this.field11702 == 0 ? this.method18342().field7633 : this.field11706;
	}
}
