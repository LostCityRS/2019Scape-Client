package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ya")
public class ActiveComponent {

	@ObfuscatedName("ya.e")
	public Component field8242;

	@ObfuscatedName("ya.n")
	public Interface field8241;

	@ObfuscatedName("ya.e(I)Lhf;")
	public Component method13790() {
		return this.field8241.method3924(this.field8242.field2158);
	}

	@ObfuscatedName("ya.n(III)Z")
	public boolean method13787(int arg0, int arg1) {
		Component var3 = Component.method16682(arg0, arg1);
		if (var3 == null) {
			this.method13788();
			return false;
		} else {
			this.field8241 = Statics.field11725[arg0 >> 16];
			this.field8242 = var3;
			return true;
		}
	}

	@ObfuscatedName("ya.m(I)V")
	public void method13788() {
		this.field8241 = null;
		this.field8242 = null;
	}
}
