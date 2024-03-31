package com.jagex.game.script.activepointers;

import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.iftype.Interface;
import deob.ObfuscatedName;

@ObfuscatedName("ya")
public class ActiveComponent {

	@ObfuscatedName("ya.e")
	public Component com;

	@ObfuscatedName("ya.n")
	public Interface itf;

	@ObfuscatedName("ya.e(I)Lhf;")
	public Component method13790() {
		return this.itf.getComponent(this.com.parentlayer);
	}

	@ObfuscatedName("ya.n(III)Z")
	public boolean method13787(int arg0, int arg1) {
		Component var3 = Component.method16682(arg0, arg1);
		if (var3 == null) {
			this.method13788();
			return false;
		} else {
			this.itf = Component.interfaces[arg0 >> 16];
			this.com = var3;
			return true;
		}
	}

	@ObfuscatedName("ya.m(I)V")
	public void method13788() {
		this.itf = null;
		this.com = null;
	}
}
