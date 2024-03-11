package com.jagex.game.client;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("uj")
public abstract class Mouse {

	@ObfuscatedName("pm.e(Ljava/awt/Component;ZI)Luj;")
	public static Mouse method6806(java.awt.Component arg0, boolean arg1) {
		return new JavaMouse(arg0, arg1);
	}

	@ObfuscatedName("ql.n(II)V")
	public static void method7232(int arg0) {
		Statics.method14915(arg0);
	}

	@ObfuscatedName("uj.l(I)Z")
	public boolean method9090() {
		return this.method9101() || this.method9121() || this.method9125();
	}

	@ObfuscatedName("uj.u(I)I")
	public abstract int method9086();

	@ObfuscatedName("uj.m(I)V")
	public abstract void method9087();

	@ObfuscatedName("uj.z(I)I")
	public abstract int method9092();

	@ObfuscatedName("uj.p(I)Lakm;")
	public abstract MouseEvent method9093();

	@ObfuscatedName("uj.k(B)Z")
	public abstract boolean method9101();

	@ObfuscatedName("uj.d(I)V")
	public abstract void method9120();

	@ObfuscatedName("uj.f(I)Z")
	public abstract boolean method9121();

	@ObfuscatedName("uj.w(I)Z")
	public abstract boolean method9125();
}
