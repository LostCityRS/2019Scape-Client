package com.jagex.game.config.quickchatphrasetype;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ne")
public class QuickChatPhrase {

	@ObfuscatedName("ne.e")
	public int field3448;

	@ObfuscatedName("ne.n")
	public QuickChatPhraseType field3447;

	@ObfuscatedName("ne.m")
	public int[] dynamics;

	@ObfuscatedName("aac.e(Lalw;B)Lne;")
	public static QuickChatPhrase method14572(Packet arg0) {
		QuickChatPhrase var1 = new QuickChatPhrase();
		var1.field3448 = arg0.g2();
		var1.field3447 = Client.quickChatPhraseTypeList.getPhrase(var1.field3448);
		return var1;
	}
}
