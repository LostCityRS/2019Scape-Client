package com.jagex.game.config.quickchatcattype;

import com.jagex.core.constants.Language;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("qr")
public class QuickChatCatTypeList {

	@ObfuscatedName("qr.e")
	public final Js5 configClientSmall;

	@ObfuscatedName("qr.n")
	public final Js5 configClientLarge;

	@ObfuscatedName("qr.m")
	public final SoftLruHashTable recentUse = new SoftLruHashTable(64);

	public QuickChatCatTypeList(Language arg0, Js5 arg1, Js5 arg2) {
		this.configClientSmall = arg1;
		this.configClientLarge = arg2;
		if (this.configClientSmall != null) {
			this.configClientSmall.getGroupCapacity(0);
		}
		if (this.configClientLarge != null) {
			this.configClientLarge.getGroupCapacity(0);
		}
	}

	@ObfuscatedName("qr.e(IB)Lasd;")
	public QuickChatCatType list(int id) {
		QuickChatCatType cached = (QuickChatCatType) this.recentUse.get((long) id);
		if (cached != null) {
			return cached;
		}
		byte[] bytes;
		if (id >= 32768) {
			bytes = this.configClientLarge.getfile(0, id & 0x7FFF);
		} else {
			bytes = this.configClientSmall.getfile(0, id);
		}
		QuickChatCatType quickChatCatType = new QuickChatCatType();
		if (bytes != null) {
			quickChatCatType.decode(new Packet(bytes));
		}
		if (id >= 32768) {
			quickChatCatType.postDecode();
		}
		this.recentUse.put(quickChatCatType, (long) id);
		return quickChatCatType;
	}
}
