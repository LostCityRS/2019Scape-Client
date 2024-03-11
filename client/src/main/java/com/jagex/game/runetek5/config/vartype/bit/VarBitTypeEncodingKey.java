package com.jagex.game.runetek5.config.vartype.bit;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("ks")
public class VarBitTypeEncodingKey implements SerializableEnum {

	@ObfuscatedName("ks.e")
	public static final VarBitTypeEncodingKey BASEVAR = new VarBitTypeEncodingKey(14, 1);

	@ObfuscatedName("ks.n")
	public static final VarBitTypeEncodingKey BITS = new VarBitTypeEncodingKey(7, 2);

	@ObfuscatedName("ks.m")
	public static final VarBitTypeEncodingKey WARNONDECREASE = new VarBitTypeEncodingKey(3, 3);

	@ObfuscatedName("ks.k")
	public static final VarBitTypeEncodingKey MASTERQUEST = new VarBitTypeEncodingKey(8, 4);

	@ObfuscatedName("ks.f")
	public static final VarBitTypeEncodingKey QUESTPOINTS = new VarBitTypeEncodingKey(11, 5);

	@ObfuscatedName("ks.w")
	public static final VarBitTypeEncodingKey WEALTHEQUIVALENT = new VarBitTypeEncodingKey(1, 6);

	@ObfuscatedName("ks.l")
	public static final VarBitTypeEncodingKey SETVARALLOWED = new VarBitTypeEncodingKey(5, 7);

	@ObfuscatedName("ks.u")
	public static final VarBitTypeEncodingKey SENDTOGAMELOGWORLD = new VarBitTypeEncodingKey(13, 8);

	@ObfuscatedName("ks.z")
	public static final VarBitTypeEncodingKey TRANSMITLEVEL = new VarBitTypeEncodingKey(2, 9);

	@ObfuscatedName("ks.p")
	public static final VarBitTypeEncodingKey TRANSMITLEVELOTHER = new VarBitTypeEncodingKey(4, 10);

	@ObfuscatedName("ks.d")
	public static final VarBitTypeEncodingKey DEBUGNAME = new VarBitTypeEncodingKey(12, 11);

	@ObfuscatedName("ks.c")
	public static final VarBitTypeEncodingKey IGNOREOVERLAP = new VarBitTypeEncodingKey(6, 12);

	@ObfuscatedName("ks.r")
	public static final VarBitTypeEncodingKey VARBITNAME_HASH32 = new VarBitTypeEncodingKey(9, 13);

	@ObfuscatedName("ks.v")
	public static final VarBitTypeEncodingKey field3061 = new VarBitTypeEncodingKey(10, 14);

	@ObfuscatedName("ks.o")
	public static final VarBitTypeEncodingKey field3071 = new VarBitTypeEncodingKey(0, 15);

	@ObfuscatedName("ks.s")
	public final int field3072;

	@ObfuscatedName("ks.y")
	public final int serialID;

	public VarBitTypeEncodingKey(int arg0, int arg1) {
		this.field3072 = arg0;
		this.serialID = arg1;
	}

	@ObfuscatedName("ks.n()I")
	public int getId() {
		return this.serialID;
	}
}
