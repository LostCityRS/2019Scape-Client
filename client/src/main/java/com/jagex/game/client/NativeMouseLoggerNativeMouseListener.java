package com.jagex.game.client;

import com.jagex.game.ClientWatch;
import deob.ObfuscatedName;

import java.util.Queue;

@ObfuscatedName("xr")
public final class NativeMouseLoggerNativeMouseListener implements NativeMouseListener {

	@ObfuscatedName("xr.e(ZI)V")
	public void method10225(boolean arg0) {
	}

	@ObfuscatedName("xr.n(IIII)V")
	public void method10226(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 16;
		int var5 = arg0 & 0xFFFF;
		Queue var6 = ClientWatch.field7946;
		synchronized (ClientWatch.field7946) {
			ClientWatch.field7946.add(NativeMouseEvent.method17446(var4, var5, arg1, arg2));
		}
	}
}
