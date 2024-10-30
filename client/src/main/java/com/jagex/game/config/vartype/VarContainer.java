package com.jagex.game.config.vartype;

import deob.ObfuscatedName;

@ObfuscatedName("abj")
public interface VarContainer extends Iterable {

	@ObfuscatedName("abj.n(IIB)V")
	void setVarValueInt(int arg0, int arg1);

	@ObfuscatedName("abj.f(II)Ljava/lang/Object;")
	Object getVarValue(int arg0);

	@ObfuscatedName("abj.w(ILjava/lang/Object;B)V")
	void setVarValue(int arg0, Object arg1);

	@ObfuscatedName("abj.l(I)V")
	void clear();

	@ObfuscatedName("abj.u(IB)V")
	void method14734(int arg0);

	@ObfuscatedName("abj.m(II)J")
	long getVarValueLong(int arg0);

	@ObfuscatedName("abj.e(II)I")
	int getVarValueInt(int arg0);

	@ObfuscatedName("abj.k(IJ)V")
	void setVarValueLong(int arg0, long arg1);
}
