package com.jagex.game.config.quickchatphrasetype;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ne")
public class QuickChatPhrase {

	@ObfuscatedName("ne.e")
	public int id;

	@ObfuscatedName("ne.n")
	public QuickChatPhraseType quickChatPhraseType;

	@ObfuscatedName("ne.m")
	public int[] dynamics;

	@ObfuscatedName("aac.e(Lalw;B)Lne;")
	public static QuickChatPhrase createQuickChatPhrase(Packet arg0) {
		QuickChatPhrase var1 = new QuickChatPhrase();
		var1.id = arg0.g2();
		var1.quickChatPhraseType = Client.quickChatPhraseTypeList.list(var1.id);
		return var1;
	}
}
