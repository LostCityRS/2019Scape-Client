package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.Queue;

@ObfuscatedName("xr")
public final class class647 implements class666 {

	@ObfuscatedName("xr.e(ZI)V")
	public void method10225(boolean arg0) {
	}

	@ObfuscatedName("xr.n(IIII)V")
	public void method10226(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 16;
		int var5 = arg0 & 0xFFFF;
		Queue var6 = class648.field7946;
		synchronized (class648.field7946) {
			class648.field7946.add(class1188.method17446(var4, var5, arg1, arg2));
		}
	}
}
