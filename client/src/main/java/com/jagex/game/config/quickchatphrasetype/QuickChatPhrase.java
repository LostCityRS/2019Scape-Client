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
	public static QuickChatPhrase createQuickChatPhrase(Packet buf) {
		QuickChatPhrase quickChatPhrase = new QuickChatPhrase();
		quickChatPhrase.id = buf.g2();
		quickChatPhrase.quickChatPhraseType = Client.quickChatPhraseTypeList.list(quickChatPhrase.id);
		return quickChatPhrase;
	}
}
