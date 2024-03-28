package com.jagex.game.config.db.dbtabletype;

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
	public ScriptVarType[][] types;

	@ObfuscatedName("adb.n")
	public Object[][] defaultValues;

	@ObfuscatedName("adb.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("adb.u(Lalw;IS)V")
	public void decode(Packet buf, int code) {
		if (code != 1) {
			return;
		}
		int typesLength = buf.g1();
		if (this.types == null) {
			this.types = new ScriptVarType[typesLength][];
		}
		for (int setting = buf.g1(); setting != 255; setting = buf.g1()) {
			int column = setting & 0x7F;
			boolean var6 = (setting & 0x80) != 0;
			ScriptVarType[] scriptVarTypes = new ScriptVarType[buf.g1()];
			for (int var8 = 0; var8 < scriptVarTypes.length; var8++) {
				scriptVarTypes[var8] = (ScriptVarType) SerializableEnums.decode(ScriptVarType.values(), buf.gSmart1or2());
			}
			this.types[column] = scriptVarTypes;
			if (var6) {
				if (this.defaultValues == null) {
					this.defaultValues = new Object[this.types.length][];
				}
				this.defaultValues[column] = DBUtils.decodeValues(buf, scriptVarTypes);
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
