package com.jagex.game.client;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("yp")
public final class NativeMouseTask implements Runnable {

	public void run() {
		try {
			Statics.field11719.run();
		} catch (Throwable var2) {
		}
		Statics.field11719 = null;
	}
}
