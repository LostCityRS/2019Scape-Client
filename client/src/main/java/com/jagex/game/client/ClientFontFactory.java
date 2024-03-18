package com.jagex.game.client;

import com.jagex.graphics.FontFactory;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.SpriteDataProvider;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("k")
public final class ClientFontFactory implements FontFactory {

	@ObfuscatedName("k.e([BLaac;ZI)Ljava/lang/Object;")
	public Object method210(byte[] arg0, FontMetrics arg1, boolean arg2) {
		return Client.renderer.createFont(arg1, SpriteDataProvider.method1615(arg0)[0], arg2);
	}
}
