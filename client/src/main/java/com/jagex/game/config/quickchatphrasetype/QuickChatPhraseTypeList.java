package com.jagex.game.config.quickchatphrasetype;

import com.jagex.core.constants.Language;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.game.client.QuickChatDynamicProvider;
import com.jagex.game.shared.framework.chat.QuickChatDynamicCommand;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ach")
public class QuickChatPhraseTypeList {

	@ObfuscatedName("ach.e")
	public final Js5 configClientSmall;

	@ObfuscatedName("ach.n")
	public final Js5 configClientLarge;

	@ObfuscatedName("ach.m")
	public int configClientSmallNum = 0;

	@ObfuscatedName("ach.k")
	public int configClientLargeNum = 0;

	@ObfuscatedName("ach.f")
	public final SoftLruHashTable recentUse = new SoftLruHashTable(64);

	@ObfuscatedName("ach.u")
	public QuickChatDynamicProvider quickChatDynamicProvider = null;

	public QuickChatPhraseTypeList(Language arg0, Js5 configClientSmall, Js5 configClientLarge, QuickChatDynamicProvider quickChatDynamicProvider) {
		this.configClientSmall = configClientSmall;
		this.configClientLarge = configClientLarge;
		this.quickChatDynamicProvider = quickChatDynamicProvider;
		if (this.configClientSmall != null) {
			this.configClientSmallNum = this.configClientSmall.getGroupCapacity(1);
		}
		if (this.configClientLarge != null) {
			this.configClientLargeNum = this.configClientLarge.getGroupCapacity(1);
		}
	}

	@ObfuscatedName("ach.e(II)Lasq;")
	public QuickChatPhraseType list(int id) {
		QuickChatPhraseType cached = (QuickChatPhraseType) this.recentUse.get((long) id);
		if (cached != null) {
			return cached;
		}
		byte[] bytes;
		if (id >= 32768) {
			bytes = this.configClientLarge.getfile(1, id & 0x7FFF);
		} else {
			bytes = this.configClientSmall.getfile(1, id);
		}
		QuickChatPhraseType quickChatPhraseType = new QuickChatPhraseType();
		quickChatPhraseType.phrases = this;
		if (bytes != null) {
			quickChatPhraseType.decode(new Packet(bytes));
		}
		if (id >= 32768) {
			quickChatPhraseType.postDecode();
		}
		this.recentUse.put(quickChatPhraseType, (long) id);
		return quickChatPhraseType;
	}

	@ObfuscatedName("ach.n(Lxs;[IJ)Ljava/lang/String;")
	public String method14978(QuickChatDynamicCommand arg0, int[] arg1, long arg2) {
		if (this.quickChatDynamicProvider != null) {
			String var5 = this.quickChatDynamicProvider.method5945(arg0, arg1, arg2);
			if (var5 != null) {
				return var5;
			}
		}
		return Long.toString(arg2);
	}
}
