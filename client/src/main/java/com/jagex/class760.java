package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("abt")
public class class760 {

	public class760() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sc.e(Lpy;Lxq;B)I")
	public static int method8370(class442 arg0, class655 arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method10328() > 1) {
			int var2 = arg0.method6898() - 1;
			return var2 * arg1.method10328() + arg0.method6897(var2);
		} else {
			return arg0.method6897(arg1.field8040);
		}
	}

	@ObfuscatedName("wx.n(Lpy;Lxq;II)[B")
	public static byte[] method9853(class442 arg0, class655 arg1, int arg2) {
		return arg1.method10328() > 1 ? arg0.method6879(arg1.method10329(arg2), arg1.method10330(arg2)) : arg0.method6879(arg1.field8040, arg2);
	}
}
