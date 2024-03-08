package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ya")
public class class678 {

	@ObfuscatedName("ya.e")
	public class226 field8242;

	@ObfuscatedName("ya.n")
	public class225 field8241;

	@ObfuscatedName("ya.e(I)Lhf;")
	public class226 method13790() {
		return this.field8241.method3924(this.field8242.field2158);
	}

	@ObfuscatedName("ya.n(III)Z")
	public boolean method13787(int arg0, int arg1) {
		class226 var3 = class226.method16682(arg0, arg1);
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
