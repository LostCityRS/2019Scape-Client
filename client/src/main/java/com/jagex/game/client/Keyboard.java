package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("ub")
public abstract class Keyboard {

	@ObfuscatedName("acg.e(Ljava/awt/Component;I)Lub;")
	public static Keyboard method15006(java.awt.Component arg0) {
		return new JavaKeyboard(arg0);
	}

	@ObfuscatedName("ub.n(I)V")
	public abstract void method9069();

	@ObfuscatedName("ub.f(I)V")
	public abstract void method9071();

	@ObfuscatedName("ub.k(I)Lut;")
	public abstract KeyboardEvent method9075();

	@ObfuscatedName("ub.m(II)Z")
	public abstract boolean method9080(int arg0);
}
