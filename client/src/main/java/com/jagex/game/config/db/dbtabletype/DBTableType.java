package com.jagex.game.config.db.dbtabletype;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.db.DBUtils;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("adb")
public class DBTableType implements ConfigType, MutableConfig {

	@ObfuscatedName("adb.e")
	public ScriptVarType[][] columnTypes;

	@ObfuscatedName("adb.n")
	public Object[][] columnDefaultValues;

	@ObfuscatedName("adb.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("adb.u(Lalw;IS)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 != 1) {
			return;
		}
		int var3 = arg0.g1();
		if (this.columnTypes == null) {
			this.columnTypes = new ScriptVarType[var3][];
		}
		for (int var4 = arg0.g1(); var4 != 255; var4 = arg0.g1()) {
			int var5 = var4 & 0x7F;
			boolean var6 = (var4 & 0x80) != 0;
			ScriptVarType[] var7 = new ScriptVarType[arg0.g1()];
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] = (ScriptVarType) SerializableEnums.decode((SerializableEnum[]) ScriptVarType.values(), arg0.gSmart1or2());
			}
			this.columnTypes[var5] = var7;
			if (var6) {
				if (this.columnDefaultValues == null) {
					this.columnDefaultValues = new Object[this.columnTypes.length][];
				}
				this.columnDefaultValues[var5] = DBUtils.unpackColumnDataValues(arg0, var7);
			}
		}
	}

	@ObfuscatedName("adb.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("adb.z(IB)V")
	public void setId(int arg0) {
	}
}
