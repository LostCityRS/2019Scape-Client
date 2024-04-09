package com.jagex.game.client;

import com.jagex.graphics.FontFactory;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.SpriteDataProvider;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("k")
public final class ClientFontFactory implements FontFactory {

	@ObfuscatedName("k.e([BLaac;ZI)Ljava/lang/Object;")
	public Object createFont(byte[] bytes, FontMetrics fontMetrics, boolean arg2) {
		return Client.toolkit.createFont(fontMetrics, SpriteDataProvider.method1615(bytes)[0], arg2);
	}
}
