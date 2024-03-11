package com.jagex;

import com.jagex.game.runetek5.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("abt")
public class ArchiveUtil {

	public ArchiveUtil() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sc.e(Lpy;Lxq;B)I")
	public static int method8370(Js5 arg0, Js5ConfigGroup arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.getGroupSize() > 1) {
			int var2 = arg0.method6898() - 1;
			return var2 * arg1.getGroupSize() + arg0.method6897(var2);
		} else {
			return arg0.method6897(arg1.id);
		}
	}

	@ObfuscatedName("wx.n(Lpy;Lxq;II)[B")
	public static byte[] method9853(Js5 arg0, Js5ConfigGroup arg1, int arg2) {
		return arg1.getGroupSize() > 1 ? arg0.method6879(arg1.getClientGroupId(arg2), arg1.getClientFileId(arg2)) : arg0.method6879(arg1.id, arg2);
	}
}
