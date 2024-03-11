package com.jagex;

import com.jagex.graphics.runetek5.FontFactory;
import com.jagex.graphics.runetek5.FontMetrics;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("k")
public final class ClientFontFactory implements FontFactory {

	@ObfuscatedName("k.e([BLaac;ZI)Ljava/lang/Object;")
	public Object method210(byte[] arg0, FontMetrics arg1, boolean arg2) {
		return Statics.field8198.method2207(arg1, SpriteDataProvider.method1615(arg0)[0], arg2);
	}
}
