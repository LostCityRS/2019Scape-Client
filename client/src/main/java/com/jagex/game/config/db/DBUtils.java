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
	public static int getDBFieldTable(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("acg.n(II)I")
	public static int getDBFieldColumn(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("anp.m(Lalw;[Lqw;I)[Ljava/lang/Object;")
	public static Object[] unpackColumnDataValues(Packet arg0, ScriptVarType[] arg1) {
		int var2 = arg0.gSmart1or2();
		Object[] var3 = new Object[arg1.length * var2];
		for (int var4 = 0; var4 < var2; var4++) {
			for (int var5 = 0; var5 < arg1.length; var5++) {
				int var6 = arg1.length * var4 + var5;
				var3[var6] = arg1[var5].baseType.dbDecode(arg0);
			}
		}
		return var3;
	}
}
