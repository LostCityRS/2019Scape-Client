package com.jagex.game.config.vartype.bit;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.VarConfigType;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

@ObfuscatedName("kh")
public class VarBitType implements VarConfigType {

	@ObfuscatedName("kh.e")
	public int id;

	@ObfuscatedName("kh.n")
	public VarBitTypeFactory field3077;

	@ObfuscatedName("kh.m")
	public VarType baseVar;

	@ObfuscatedName("kh.k")
	public int startBit;

	@ObfuscatedName("kh.f")
	public int endBit;

	@ObfuscatedName("kh.w")
	public String debugName;

	@ObfuscatedName("kh.l")
	public VarDomainType field3080;

	@ObfuscatedName("kh.u")
	public int field3075 = -1;

	@ObfuscatedName("kh.z")
	public static int[] masklookup = new int[32];

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			masklookup[var1] = var0 - 1;
			var0 += var0;
		}
	}

	public VarBitType(int arg0, VarBitTypeFactory arg1) {
		this.id = arg0;
		this.field3077 = arg1;
	}

	@ObfuscatedName("kh.e(Lalw;B)V")
	public void decode(Packet buf) {
		this.decode(buf, false);
	}

	@ObfuscatedName("kh.u(Lalw;ZI)V")
	public void decode(Packet arg0, boolean arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}
			this.method5184(arg0, var3, arg1);
		}
	}

	@ObfuscatedName("kh.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("kh.z(Lalw;IZI)V")
	public void method5184(Packet arg0, int arg1, boolean arg2) {
		VarBitTypeEncodingKey var4 = (VarBitTypeEncodingKey) SerializableEnums.decode(VarBitTypeEncodingKey.values(), arg1);
		switch(var4.index) {
			case 7:
				this.startBit = arg0.g1();
				this.endBit = arg0.g1();
			case 9:
			default:
				break;
			case 14:
				int var5 = arg0.g1();
				this.field3080 = (VarDomainType) SerializableEnums.decode(VarDomainType.values(), var5);
				if (this.field3080 == null) {
					throw new IllegalStateException("");
				}
				this.field3075 = arg0.gSmart2or4null();
				if (this.field3077 != null) {
					ConfigTypeList var6 = (ConfigTypeList) this.field3077.listContainer.get(this.field3080);
					if (var6 != null) {
						this.baseVar = (VarType) var6.list(this.field3075);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
		}
	}

	@ObfuscatedName("kh.p(II)I")
	public int getVarbitValue(int arg0) {
		int var2 = masklookup[this.endBit - this.startBit];
		return arg0 >> this.startBit & var2;
	}

	@ObfuscatedName("kh.d(III)I")
	public int setVarbitValue(int arg0, int arg1) throws VarBitOverflowException {
		int var3 = masklookup[this.endBit - this.startBit];
		if (arg1 < 0 || arg1 > var3) {
			throw new VarBitOverflowException(this.debugName == null ? Integer.toString(this.id) : this.debugName, arg1, var3);
		}
		int var4 = var3 << this.startBit;
		return arg0 & ~var4 | arg1 << this.startBit & var4;
	}
}
