package com.jagex;

import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("ada")
public class DbTableUtil {

	public DbTableUtil() throws Throwable {
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
	public static Object[] method18719(Packet arg0, ScriptVarType[] arg1) {
		int var2 = arg0.gSmart1or2();
		Object[] var3 = new Object[arg1.length * var2];
		for (int var4 = 0; var4 < var2; var4++) {
			for (int var5 = 0; var5 < arg1.length; var5++) {
				int var6 = arg1.length * var4 + var5;
				var3[var6] = arg1[var5].baseType.method7335(arg0);
			}
		}
		return var3;
	}
}
