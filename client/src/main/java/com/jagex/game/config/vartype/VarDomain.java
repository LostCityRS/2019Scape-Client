package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;
import deob.ObfuscatedName;

@ObfuscatedName("eh")
public interface VarDomain extends VarIntDomain {

	@ObfuscatedName("eh.e(Lec;II)V")
	void setVarValueInt(VarType arg0, int arg1);

	@ObfuscatedName("eh.n(Lec;I)J")
	long getVarValueLong(VarType arg0);

	@ObfuscatedName("eh.m(Lec;J)V")
	void setVarValueLong(VarType arg0, long arg1);

	@ObfuscatedName("eh.k(Lec;B)Ljava/lang/Object;")
	Object getVarValue(VarType arg0);

	@ObfuscatedName("eh.f(Lec;Ljava/lang/Object;I)V")
	void setVarValue(VarType arg0, Object arg1);

	@ObfuscatedName("eh.w(Lkh;II)V")
	void setVarbitValue(VarBitType arg0, int arg1) throws VarBitOverflowException;

	@ObfuscatedName("eh.u(Lec;I)I")
	int getVarValueInt(VarType arg0);

	@ObfuscatedName("eh.z(Lkh;I)I")
	int getVarBitValue(VarBitType arg0);
}
