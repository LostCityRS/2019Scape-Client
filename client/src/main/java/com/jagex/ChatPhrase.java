package com.jagex;

import com.jagex.game.config.quickchatphrasetype.QuickChatPhraseType;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ne")
public class ChatPhrase {

	@ObfuscatedName("ne.e")
	public int field3448;

	@ObfuscatedName("ne.n")
	public QuickChatPhraseType field3447;

	@ObfuscatedName("ne.m")
	public int[] field3446;

	@ObfuscatedName("aac.e(Lalw;B)Lne;")
	public static ChatPhrase method14572(Packet arg0) {
		ChatPhrase var1 = new ChatPhrase();
		var1.field3448 = arg0.g2();
		var1.field3447 = Statics.field489.method14982(var1.field3448);
		return var1;
	}
}
