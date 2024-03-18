package com.jagex.game.config.vartype.player;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("gw")
public class VarPlayerTypeEncodingKey implements SerializableEnum {

	@ObfuscatedName("gw.e")
	public static final VarPlayerTypeEncodingKey PROTECTEDACCESSREQUIRED = new VarPlayerTypeEncodingKey(2, 100);

	@ObfuscatedName("gw.n")
	public static final VarPlayerTypeEncodingKey SETVARALLOWED = new VarPlayerTypeEncodingKey(16, 101);

	@ObfuscatedName("gw.m")
	public static final VarPlayerTypeEncodingKey WEALTHEQUIVALENT = new VarPlayerTypeEncodingKey(8, 102);

	@ObfuscatedName("gw.k")
	public static final VarPlayerTypeEncodingKey SENDTOGAMELOGWORLD = new VarPlayerTypeEncodingKey(5, 103);

	@ObfuscatedName("gw.f")
	public static final VarPlayerTypeEncodingKey WARNONDECREASE = new VarPlayerTypeEncodingKey(3, 104);

	@ObfuscatedName("gw.w")
	public static final VarPlayerTypeEncodingKey HISCOREDATA = new VarPlayerTypeEncodingKey(1, 105);

	@ObfuscatedName("gw.l")
	public static final VarPlayerTypeEncodingKey PLOGDATA = new VarPlayerTypeEncodingKey(11, 106);

	@ObfuscatedName("gw.u")
	public static final VarPlayerTypeEncodingKey CLANDATA = new VarPlayerTypeEncodingKey(7, 107);

	@ObfuscatedName("gw.z")
	public static final VarPlayerTypeEncodingKey TRANSMITLEVELOTHER = new VarPlayerTypeEncodingKey(6, 108);

	@ObfuscatedName("gw.p")
	public static final VarPlayerTypeEncodingKey GENERALPURPOSE = new VarPlayerTypeEncodingKey(14, 109);

	@ObfuscatedName("gw.d")
	public static final VarPlayerTypeEncodingKey CLIENTCODE = new VarPlayerTypeEncodingKey(0, 110);

	@ObfuscatedName("gw.c")
	public static final VarPlayerTypeEncodingKey MASTERQUEST = new VarPlayerTypeEncodingKey(4, 111);

	@ObfuscatedName("gw.r")
	public static final VarPlayerTypeEncodingKey QUESTPOINTS = new VarPlayerTypeEncodingKey(12, 112);

	@ObfuscatedName("gw.v")
	public static final VarPlayerTypeEncodingKey LEGACYID = new VarPlayerTypeEncodingKey(13, 113);

	@ObfuscatedName("gw.o")
	public static final VarPlayerTypeEncodingKey field1990 = new VarPlayerTypeEncodingKey(17, 114);

	@ObfuscatedName("gw.s")
	public static final VarPlayerTypeEncodingKey field1999 = new VarPlayerTypeEncodingKey(15, 115);

	@ObfuscatedName("gw.y")
	public static final VarPlayerTypeEncodingKey field1984 = new VarPlayerTypeEncodingKey(10, 116);

	@ObfuscatedName("gw.q")
	public static final VarPlayerTypeEncodingKey field1993 = new VarPlayerTypeEncodingKey(9, 117);

	@ObfuscatedName("gw.x")
	public final int index;

	@ObfuscatedName("gw.b")
	public final int serialID;

	@ObfuscatedName("rw.e(I)[Lgw;")
	public static VarPlayerTypeEncodingKey[] values() {
		return new VarPlayerTypeEncodingKey[] { field1999, WARNONDECREASE, field1984, LEGACYID, field1993, SETVARALLOWED, CLIENTCODE, HISCOREDATA, SENDTOGAMELOGWORLD, field1990, TRANSMITLEVELOTHER, CLANDATA, WEALTHEQUIVALENT, QUESTPOINTS, PLOGDATA, MASTERQUEST, PROTECTEDACCESSREQUIRED, GENERALPURPOSE};
	}

	public VarPlayerTypeEncodingKey(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

	@ObfuscatedName("gw.n()I")
	public int getId() {
		return this.serialID;
	}
}
