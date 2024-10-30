package com.jagex.game.world.entity;

import com.jagex.core.constants.ModeAccountType;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarPlayerDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.config.vartype.player.VarPlayerTypeListClient;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ah")
public class PlayerGameState implements VarIntDomain, VariableTypeProvider, PlayerStatProvider {

	@ObfuscatedName("ah.e")
	public final VarPlayerDomain varps;

	@ObfuscatedName("ah.n")
	public final VarPlayerTypeListClient varPlayerTypeList;

	@ObfuscatedName("ah.m")
	public final VarBitTypeList varBitTypeList;

	@ObfuscatedName("ah.k")
	public final PlayerStat[] stats;

	public PlayerGameState(VarPlayerTypeListClient arg0, VarBitTypeList arg1, int arg2) {
		this.stats = new PlayerStat[arg2];
		this.varps = new VarPlayerDomain();
		this.varPlayerTypeList = arg0;
		this.varBitTypeList = arg1;
	}

	@ObfuscatedName("ah.e(IB)I")
	public int getStatXP(int arg0) {
		return this.stats[arg0].getCappedXP(Client.loggedInMembers ? ModeAccountType.MEMBERS : ModeAccountType.FREE);
	}

	@ObfuscatedName("ah.n(II)I")
	public int getStatLevel(int arg0) {
		return this.stats[arg0].getLevel();
	}

	@ObfuscatedName("ah.m(II)I")
	public int getStatLevelMax(int arg0) {
		return this.stats[arg0].getCappedXPLevel(Client.loggedInMembers ? ModeAccountType.MEMBERS : ModeAccountType.FREE);
	}

	@ObfuscatedName("ah.k(II)I")
	public int getStatXPActual(int arg0) {
		return this.stats[arg0].getXP();
	}

	@ObfuscatedName("ah.f(IB)I")
	public int getStatLevelMaxActual(int arg0) {
		return this.stats[arg0].getXPLevel();
	}

	@ObfuscatedName("ah.w(Lqe;II)Lec;")
	public VarType getVarType(VarDomainType arg0, int arg1) {
		return VarDomainType.PLAYER == arg0 ? (VarType) this.varPlayerTypeList.list(arg1) : null;
	}

	@ObfuscatedName("ah.l(IB)Lkh;")
	public VarBitType getVarBitType(int arg0) {
		VarBitType var2 = (VarBitType) this.varBitTypeList.list(arg0);
		return VarDomainType.PLAYER == var2.baseVar.domain ? var2 : null;
	}

	@ObfuscatedName("ah.u(Lec;I)I")
	public int getVarValueInt(VarType arg0) {
		return this.varps.getVarValueInt(arg0);
	}

	@ObfuscatedName("ah.z(Lkh;I)I")
	public int getVarBitValue(VarBitType arg0) {
		return this.varps.getVarBitValue(arg0);
	}
}
