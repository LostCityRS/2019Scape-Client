package com.jagex.game.client;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.VarValue;
import com.jagex.game.config.vartype.VarContainerSparse;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.constants.BaseVarType;
import deob.ObfuscatedName;

@ObfuscatedName("rk")
public class StockmarketSlot {

	@ObfuscatedName("rk.e")
	public byte field4957;

	@ObfuscatedName("rk.n")
	public int obj;

	@ObfuscatedName("rk.m")
	public int price;

	@ObfuscatedName("rk.k")
	public int count;

	@ObfuscatedName("rk.f")
	public int completedCount;

	@ObfuscatedName("rk.w")
	public int completedGold;

	public StockmarketSlot() {
	}

	public StockmarketSlot(Packet arg0, VarTypeList arg1) {
		this.field4957 = arg0.g1b();
		this.obj = arg0.g2();
		this.price = arg0.g4s();
		this.count = arg0.g4s();
		this.completedCount = arg0.g4s();
		this.completedGold = arg0.g4s();
		if (arg1 != null) {
			method972(arg0, arg1);
		}
	}

	@ObfuscatedName("aj.e(Lalw;Ladd;I)Labn;")
	public static VarContainerSparse method972(Packet arg0, VarTypeList arg1) {
		VarContainerSparse var2 = new VarContainerSparse(arg1);
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 255) {
				return var2;
			}
			BaseVarType var4 = (BaseVarType) SerializableEnums.decode(BaseVarType.class, var3);
			while (true) {
				int var5 = arg0.g1();
				if (var5 == 255) {
					break;
				}
				arg0.pos -= 1;
				VarValue var6 = arg1.decodeVarValue(arg0, var4);
				if (var6 != null) {
					var2.setVarValue(var6.var, var6.value);
				}
			}
		}
	}

	@ObfuscatedName("rk.n(I)I")
	public int method7608() {
		return this.field4957 & 0x7;
	}

	@ObfuscatedName("rk.m(B)I")
	public int getOfferType() {
		return (this.field4957 & 0x8) == 8 ? 1 : 0;
	}
}
