package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.game.config.vartype.constants.BaseVarType;
import deob.ObfuscatedName;

@ObfuscatedName("hr")
public class ComponentHook {

	public ComponentHook(int arg0, Object[] arg1) {
	}

	@ObfuscatedName("ey.e(Lalw;I)Lhr;")
	public static ComponentHook method2679(Packet arg0) {
		int var1 = arg0.g1();
		if (var1 == 0) {
			return null;
		}
		var1--;
		arg0.pos++;
		int var2 = arg0.g4s();
		Object[] var3 = new Object[var1];
		for (int var4 = 0; var4 < var1; var4++) {
			int var5 = arg0.g1();
			if (var5 == 0) {
				var3[var4] = BaseVarType.getCodec(Integer.class).decode(arg0);
			} else if (var5 == 1) {
				var3[var4] = BaseVarType.getCodec(String.class).decode(arg0);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + var5);
			}
		}
		return new ComponentHook(var2, var3);
	}
}
