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

	public QuickChatPhraseTypeList(Language arg0, Js5 arg1, Js5 arg2, QuickChatDynamicProvider arg3) {
		this.configClientSmall = arg1;
		this.configClientLarge = arg2;
		this.quickChatDynamicProvider = arg3;
		if (this.configClientSmall != null) {
			this.configClientSmallNum = this.configClientSmall.getGroupCapacity(1);
		}
		if (this.configClientLarge != null) {
			this.configClientLargeNum = this.configClientLarge.getGroupCapacity(1);
		}
	}

	@ObfuscatedName("ach.e(II)Lasq;")
	public QuickChatPhraseType list(int arg0) {
		QuickChatPhraseType var2 = (QuickChatPhraseType) this.recentUse.get((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3;
		if (arg0 >= 32768) {
			var3 = this.configClientLarge.getfile(1, arg0 & 0x7FFF);
		} else {
			var3 = this.configClientSmall.getfile(1, arg0);
		}
		QuickChatPhraseType var4 = new QuickChatPhraseType();
		var4.phrases = this;
		if (var3 != null) {
			var4.decode(new Packet(var3));
		}
		if (arg0 >= 32768) {
			var4.postDecode();
		}
		this.recentUse.put(var4, (long) arg0);
		return var4;
	}

	@ObfuscatedName("ach.n(Lxs;[IJ)Ljava/lang/String;")
	public String getDynamicText(QuickChatDynamicCommand arg0, int[] arg1, long arg2) {
		if (this.quickChatDynamicProvider != null) {
			String var5 = this.quickChatDynamicProvider.method5945(arg0, arg1, arg2);
			if (var5 != null) {
				return var5;
			}
		}
		return Long.toString(arg2);
	}
}
