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
	public QuickChatCatType list(int arg0) {
		QuickChatCatType var2 = (QuickChatCatType) this.recentUse.get((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3;
		if (arg0 >= 32768) {
			var3 = this.configClientLarge.getfile(0, arg0 & 0x7FFF);
		} else {
			var3 = this.configClientSmall.getfile(0, arg0);
		}
		QuickChatCatType var4 = new QuickChatCatType();
		if (var3 != null) {
			var4.decode(new Packet(var3));
		}
		if (arg0 >= 32768) {
			var4.postDecode();
		}
		this.recentUse.put(var4, (long) arg0);
		return var4;
	}
}
