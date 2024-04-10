package com.jagex.game.shared.framework.input;

import com.jagex.game.client.BasicMouseEvent;
import com.jagex.game.client.JavaMouse;
import com.jagex.game.client.MouseEvent;
import deob.ObfuscatedName;

@ObfuscatedName("uj")
public abstract class Mouse {

	@ObfuscatedName("pm.e(Ljava/awt/Component;ZI)Luj;")
	public static Mouse create(java.awt.Component arg0, boolean arg1) {
		return new JavaMouse(arg0, arg1);
	}

	@ObfuscatedName("ql.n(II)V")
	public static void method7232(int arg0) {
		BasicMouseEvent.method14915(arg0);
	}

	@ObfuscatedName("uj.l(I)Z")
	public boolean method9090() {
		return this.method9101() || this.method9121() || this.method9125();
	}

	@ObfuscatedName("uj.u(I)I")
	public abstract int getX();

	@ObfuscatedName("uj.m(I)V")
	public abstract void method9087();

	@ObfuscatedName("uj.z(I)I")
	public abstract int getY();

	@ObfuscatedName("uj.p(I)Lakm;")
	public abstract MouseEvent pollEvent();

	@ObfuscatedName("uj.k(B)Z")
	public abstract boolean method9101();

	@ObfuscatedName("uj.d(I)V")
	public abstract void unbind();

	@ObfuscatedName("uj.f(I)Z")
	public abstract boolean method9121();

	@ObfuscatedName("uj.w(I)Z")
	public abstract boolean method9125();
}
