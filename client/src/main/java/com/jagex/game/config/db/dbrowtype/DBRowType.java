package com.jagex.game.config.db.dbrowtype;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.db.DBUtils;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("abc")
public class DBRowType implements ConfigType, MutableConfig {

	@ObfuscatedName("abc.e")
	public Object[][] columnValues;

	@ObfuscatedName("abc.n")
	public ScriptVarType[][] columnTypes;

	@ObfuscatedName("abc.m")
	public int tableId;

	@ObfuscatedName("abc.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("abc.u(II)[Ljava/lang/Object;")
	public Object[] method14711(int arg0) {
		return this.columnValues == null ? null : this.columnValues[arg0];
	}

	@ObfuscatedName("abc.p(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 3) {
			int var3 = arg0.g1();
			if (this.columnValues == null) {
				this.columnValues = new Object[var3][];
				this.columnTypes = new ScriptVarType[var3][];
			}
			for (int var4 = arg0.g1(); var4 != 255; var4 = arg0.g1()) {
				int var5 = arg0.g1();
				ScriptVarType[] var6 = new ScriptVarType[var5];
				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = (ScriptVarType) SerializableEnums.decode((SerializableEnum[]) ScriptVarType.values(), arg0.gSmart1or2());
				}
				this.columnValues[var4] = DBUtils.unpackColumnDataValues(arg0, var6);
				this.columnTypes[var4] = var6;
			}
		} else if (arg1 == 4) {
			this.tableId = arg0.gVarInt2();
		}
	}

	@ObfuscatedName("abc.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("abc.z(IB)V")
	public void setId(int arg0) {
	}
}
