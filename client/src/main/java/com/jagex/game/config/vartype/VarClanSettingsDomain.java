package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.logic.clans.ClanSettings;

@ObfuscatedName("yl")
public class VarClanSettingsDomain implements VarDomain {

	@ObfuscatedName("yl.e")
	public ClanSettings field8193;

	public VarClanSettingsDomain(ClanSettings arg0) {
		this.field8193 = arg0;
	}

	@ObfuscatedName("yl.u(Lec;I)I")
	public int getVarValueInt(VarType arg0) {
		Integer var2 = this.field8193.getSettingInt(Client.modegame.game << 16 | arg0.id);
		return var2 == null ? (Integer) arg0.getDefaultValue() : var2;
	}

	@ObfuscatedName("yl.n(Lec;I)J")
	public long getVarValueLong(VarType arg0) {
		Long var2 = this.field8193.getSettingLong(Client.modegame.game << 16 | arg0.id);
		return var2 == null ? (Long) arg0.getDefaultValue() : var2;
	}

	@ObfuscatedName("yl.k(Lec;B)Ljava/lang/Object;")
	public Object getVarValue(VarType arg0) {
		if (ScriptVarType.STRING != arg0.dataType) {
			throw new IllegalArgumentException("");
		}
		return this.field8193.getSettingString(Client.modegame.game << 16 | arg0.id);
	}

	@ObfuscatedName("yl.z(Lkh;I)I")
	public int getVarBitValue(VarBitType arg0) {
		return arg0.getVarbitValue(this.getVarValueInt(arg0.baseVar));
	}

	@ObfuscatedName("yl.e(Lec;II)V")
	public void setVarValueInt(VarType arg0, int arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yl.m(Lec;J)V")
	public void setVarValueLong(VarType arg0, long arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yl.f(Lec;Ljava/lang/Object;I)V")
	public void setVarValue(VarType arg0, Object arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yl.w(Lkh;II)V")
	public void setVarbitValue(VarBitType arg0, int arg1) {
		throw new UnsupportedOperationException();
	}
}
