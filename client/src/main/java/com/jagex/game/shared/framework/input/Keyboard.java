package com.jagex.game.shared.framework.input;

import com.jagex.game.client.JavaKeyboard;
import com.jagex.game.client.KeyboardEvent;
import deob.ObfuscatedName;

@ObfuscatedName("ub")
public abstract class Keyboard {

	@ObfuscatedName("acg.e(Ljava/awt/Component;I)Lub;")
	public static Keyboard create(java.awt.Component arg0) {
		return new JavaKeyboard(arg0);
	}

	@ObfuscatedName("ub.n(I)V")
	public abstract void method9069();

	@ObfuscatedName("ub.f(I)V")
	public abstract void unbind();

	@ObfuscatedName("ub.k(I)Lut;")
	public abstract KeyboardEvent method9075();

	@ObfuscatedName("ub.m(II)Z")
	public abstract boolean keyheld(int arg0);
}
