package com.jagex.game.config.vartype;

import com.jagex.game.clanchannel.ClanSettings;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import com.jagex.client;
import deob.ObfuscatedName;

@ObfuscatedName("yl")
public class VarClanSettingsDomain implements VarDomain {

	@ObfuscatedName("yl.e")
	public ClanSettings field8193;

	public VarClanSettingsDomain(ClanSettings arg0) {
		this.field8193 = arg0;
	}

	@ObfuscatedName("yl.u(Lec;I)I")
	public int method679(VarType arg0) {
		Integer var2 = this.field8193.method5318(client.field10768.field8339 << 16 | arg0.id);
		return var2 == null ? (Integer) arg0.getDefaultValue() : var2;
	}

	@ObfuscatedName("yl.n(Lec;I)J")
	public long method2799(VarType arg0) {
		Long var2 = this.field8193.method5259(client.field10768.field8339 << 16 | arg0.id);
		return var2 == null ? (Long) arg0.getDefaultValue() : var2;
	}

	@ObfuscatedName("yl.k(Lec;B)Ljava/lang/Object;")
	public Object method2801(VarType arg0) {
		if (ScriptVarType.STRING != arg0.dataType) {
			throw new IllegalArgumentException("");
		}
		return this.field8193.method5260(client.field10768.field8339 << 16 | arg0.id);
	}

	@ObfuscatedName("yl.z(Lkh;I)I")
	public int method678(VarBitType arg0) {
		return arg0.getVarbitValue(this.method679(arg0.baseVar));
	}

	@ObfuscatedName("yl.e(Lec;II)V")
	public void method2798(VarType arg0, int arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yl.m(Lec;J)V")
	public void method2800(VarType arg0, long arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yl.f(Lec;Ljava/lang/Object;I)V")
	public void method2802(VarType arg0, Object arg1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("yl.w(Lkh;II)V")
	public void method2804(VarBitType arg0, int arg1) {
		throw new UnsupportedOperationException();
	}
}
