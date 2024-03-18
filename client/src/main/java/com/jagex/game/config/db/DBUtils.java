package com.jagex.game.config.db;

import com.jagex.core.io.Packet;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("ada")
public class DBUtils {

	public DBUtils() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aw.e(IB)I")
	public static int method746(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("acg.n(II)I")
	public static int method15018(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("anp.m(Lalw;[Lqw;I)[Ljava/lang/Object;")
	public static Object[] decodeValues(Packet buf, ScriptVarType[] types) {
		int fieldCount = buf.gSmart1or2();
		Object[] values = new Object[types.length * fieldCount];
		for (int fieldId = 0; fieldId < fieldCount; fieldId++) {
			for (int typeId = 0; typeId < types.length; typeId++) {
				int index = types.length * fieldId + typeId;
				values[index] = types[typeId].baseType.dbDecode(buf);
			}
		}
		return values;
	}
}
