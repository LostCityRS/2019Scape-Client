package com.jagex.game.config.vartype;

import deob.ObfuscatedName;

@ObfuscatedName("abj")
public interface VarContainer extends Iterable {

	@ObfuscatedName("abj.n(IIB)V")
	void setVarValueInt(int id, int value);

	@ObfuscatedName("abj.f(II)Ljava/lang/Object;")
	Object getVarValue(int id);

	@ObfuscatedName("abj.w(ILjava/lang/Object;B)V")
	void setVarValue(int id, Object value);

	@ObfuscatedName("abj.l(I)V")
	void clear();

	@ObfuscatedName("abj.u(IB)V")
	void method14734(int id);

	@ObfuscatedName("abj.m(II)J")
	long getVarValueLong(int id);

	@ObfuscatedName("abj.e(II)I")
	int getVarValueInt(int id);

	@ObfuscatedName("abj.k(IJ)V")
	void setVarValueLong(int id, long value);
}
