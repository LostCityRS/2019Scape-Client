package com.jagex.game.cutscene;

import com.jagex.core.datastruct.IntWrapper;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitType;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("et")
public final class CutsceneVarDomain implements VarIntDomain {

	@ObfuscatedName("et.u(Lec;I)I")
	public int getVarValueInt(VarType arg0) {
		IntWrapper var2 = (IntWrapper) CutsceneManager.field1718.getNode((long) arg0.id);
		return var2 == null ? Client.localPlayerGameState.getVarValueInt(arg0) : var2.value;
	}

	@ObfuscatedName("et.z(Lkh;I)I")
	public int getVarBitValue(VarBitType arg0) {
		IntWrapper var2 = (IntWrapper) CutsceneManager.field1718.getNode((long) arg0.id | 0x100000000L);
		return var2 == null ? Client.localPlayerGameState.getVarBitValue(arg0) : var2.value;
	}
}
