package com.jagex.game.config.quickchatcattype;

import com.jagex.js5.Js5;
import com.jagex.core.io.Packet;
import com.jagex.core.datastruct.WeightedCache;
import com.jagex.core.constants.Language;
import deob.ObfuscatedName;

@ObfuscatedName("qr")
public class QuickChatCatTypeList {

	@ObfuscatedName("qr.e")
	public final Js5 field4616;

	@ObfuscatedName("qr.n")
	public final Js5 field4614;

	@ObfuscatedName("qr.m")
	public final WeightedCache field4615 = new WeightedCache(64);

	public QuickChatCatTypeList(Language arg0, Js5 arg1, Js5 arg2) {
		this.field4616 = arg1;
		this.field4614 = arg2;
		if (this.field4616 != null) {
			this.field4616.method6897(0);
		}
		if (this.field4614 != null) {
			this.field4614.method6897(0);
		}
	}

	@ObfuscatedName("qr.e(IB)Lasd;")
	public QuickChatCatType list(int arg0) {
		QuickChatCatType var2 = (QuickChatCatType) this.field4615.method2930((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3;
		if (arg0 >= 32768) {
			var3 = this.field4614.getfile(0, arg0 & 0x7FFF);
		} else {
			var3 = this.field4616.getfile(0, arg0);
		}
		QuickChatCatType var4 = new QuickChatCatType();
		if (var3 != null) {
			var4.method19449(new Packet(var3));
		}
		if (arg0 >= 32768) {
			var4.method19452();
		}
		this.field4615.method2921(var4, (long) arg0);
		return var4;
	}
}
