package com.jagex.game.world.entity;

import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;

@ObfuscatedName("st")
public interface Location {

	@ObfuscatedName("st.m(I)I")
	int getAngle();

	@ObfuscatedName("st.k(I)V")
	void method8205();

	@ObfuscatedName("st.f(I)Z")
	boolean hasShadow();

	@ObfuscatedName("st.w(B)Z")
	boolean method8207();

	@ObfuscatedName("st.u(Ldh;B)V")
	void method8209(Toolkit arg0);

	@ObfuscatedName("st.l(Ldh;B)V")
	void method8217(Toolkit arg0);

	@ObfuscatedName("st.n(I)I")
	int getShape();

	@ObfuscatedName("st.e(I)I")
	int getId();
}
