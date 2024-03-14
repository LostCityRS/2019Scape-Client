package com.jagex.core.utils;

import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("abt")
public class ArchiveUtil {

	public ArchiveUtil() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sc.e(Lpy;Lxq;B)I")
	public static int getArchiveSize(Js5 arg0, Js5ConfigGroup arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.getGroupSize() > 1) {
			int var2 = arg0.capacity() - 1;
			return var2 * arg1.getGroupSize() + arg0.getGroupCapacity(var2);
		} else {
			return arg0.getGroupCapacity(arg1.id);
		}
	}

	@ObfuscatedName("wx.n(Lpy;Lxq;II)[B")
	public static byte[] getFile(Js5 arg0, Js5ConfigGroup arg1, int arg2) {
		return arg1.getGroupSize() > 1 ? arg0.getfile(arg1.getClientGroupId(arg2), arg1.getClientFileId(arg2)) : arg0.getfile(arg1.id, arg2);
	}
}
