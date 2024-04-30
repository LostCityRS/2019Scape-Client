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

	public PlayerGameState(VarPlayerTypeListClient varPlayerTypeList, VarBitTypeList varBitTypeList, int numStats) {
		this.stats = new PlayerStat[numStats];
		this.varps = new VarPlayerDomain();
		this.varPlayerTypeList = varPlayerTypeList;
		this.varBitTypeList = varBitTypeList;
	}

	@ObfuscatedName("ah.e(IB)I")
	public int getStatXP(int stat) {
		return this.stats[stat].getCappedXP(Client.loggedInMembers ? ModeAccountType.MEMBERS : ModeAccountType.FREE);
	}

	@ObfuscatedName("ah.n(II)I")
	public int getStatLevel(int stat) {
		return this.stats[stat].getLevel();
	}

	@ObfuscatedName("ah.m(II)I")
	public int getStatLevelMax(int stat) {
		return this.stats[stat].getCappedXPLevel(Client.loggedInMembers ? ModeAccountType.MEMBERS : ModeAccountType.FREE);
	}

	@ObfuscatedName("ah.k(II)I")
	public int getStatXPActual(int stat) {
		return this.stats[stat].getXP();
	}

	@ObfuscatedName("ah.f(IB)I")
	public int getStatLevelMaxActual(int stat) {
		return this.stats[stat].getXPLevel();
	}

	@ObfuscatedName("ah.w(Lqe;II)Lec;")
	public VarType getVarType(VarDomainType domainType, int id) {
		return VarDomainType.PLAYER == domainType ? (VarType) this.varPlayerTypeList.list(id) : null;
	}

	@ObfuscatedName("ah.l(IB)Lkh;")
	public VarBitType getVarBitType(int id) {
		VarBitType varBitType = (VarBitType) this.varBitTypeList.list(id);
		return VarDomainType.PLAYER == varBitType.baseVar.domain ? varBitType : null;
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
