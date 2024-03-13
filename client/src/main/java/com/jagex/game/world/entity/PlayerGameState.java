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
	public final VarPlayerDomain field632;

	@ObfuscatedName("ah.n")
	public final VarPlayerTypeListClient field633;

	@ObfuscatedName("ah.m")
	public final VarBitTypeList field634;

	@ObfuscatedName("ah.k")
	public final PlayerStat[] field635;

	public PlayerGameState(VarPlayerTypeListClient arg0, VarBitTypeList arg1, int arg2) {
		this.field635 = new PlayerStat[arg2];
		this.field632 = new VarPlayerDomain();
		this.field633 = arg0;
		this.field634 = arg1;
	}

	@ObfuscatedName("ah.e(IB)I")
	public int method671(int arg0) {
		return this.field635[arg0].method10163(Client.field10948 ? ModeAccountType.field8343 : ModeAccountType.field8344);
	}

	@ObfuscatedName("ah.n(II)I")
	public int method700(int arg0) {
		return this.field635[arg0].getLevel();
	}

	@ObfuscatedName("ah.m(II)I")
	public int method674(int arg0) {
		return this.field635[arg0].getBaseLevel(Client.field10948 ? ModeAccountType.field8343 : ModeAccountType.field8344);
	}

	@ObfuscatedName("ah.k(II)I")
	public int method675(int arg0) {
		return this.field635[arg0].getXP();
	}

	@ObfuscatedName("ah.f(IB)I")
	public int method687(int arg0) {
		return this.field635[arg0].getBaseLevel();
	}

	@ObfuscatedName("ah.w(Lqe;II)Lec;")
	public VarType method695(VarDomainType arg0, int arg1) {
		return VarDomainType.PLAYER == arg0 ? (VarType) this.field633.list(arg1) : null;
	}

	@ObfuscatedName("ah.l(IB)Lkh;")
	public VarBitType method694(int arg0) {
		VarBitType var2 = (VarBitType) this.field634.list(arg0);
		return VarDomainType.PLAYER == var2.baseVar.domain ? var2 : null;
	}

	@ObfuscatedName("ah.u(Lec;I)I")
	public int getVarValueInt(VarType arg0) {
		return this.field632.getVarValueInt(arg0);
	}

	@ObfuscatedName("ah.z(Lkh;I)I")
	public int getVarBitValue(VarBitType arg0) {
		return this.field632.getVarBitValue(arg0);
	}
}
